namespace PTCFitnessTracker.Views;

//using Android.Renderscripts;
using PTCFitnessTracker.Models;
using PTCFitnessTracker.ViewModels;

[QueryProperty(nameof(EquipName), "EquipName")]
public partial class DataEntry : ContentPage
{
	private String _equipname;
					
	public String EquipName
	{
		get { return _equipname; }
		set { _equipname = value;
			
			OnPropertyChanged();
		}
	}

	public ExerciseData PageData { get; set; }

	public async void EnterData(object sender, EventArgs arg)
	{
		bool saveIt = await Application.Current.MainPage.DisplayAlert("Save Data", "Record Workout?", "Yes", "No");
		if (saveIt)
		{
			PageData = new ExerciseData();
			PageData.Equipment = EquipName;
			PageData.Weight = Double.Parse(WeightEnter.Text.ToString());
			PageData.Repetitions = Double.Parse(RepEnter.Text.ToString());
			PageData.WorkoutDate = DateEnter.Date;
			App.workDB.InsertExerciseData(PageData);
		}
		WeightEnter.Text = "0";
		RepEnter.Text = "0";
		DateEnter.Date = DateTime.Now;
	}

	public void showList(object sender, EventArgs arg){
		List<ExerciseData> workouts =App.workDB.GetData(EquipName);
		workoutList.ItemsSource = workouts;
	}

	//private ExerciseData _exData;

	//public ExerciseData ExData
	//{
	//	get { return _exData; }
	//	set { _exData = value; }
	//	}


	public DataEntry()
	{
		InitializeComponent();
		BindingContext = this;
		PageData = new ExerciseData(EquipName);
		//PageData.Weight = 150;
		//_exData = WorkoutDataViewModel.TheData
		//BindingContext = new WorkoutDataViewModel();
	}
}