using PTCFitnessTracker.ViewModels;
namespace PTCFitnessTracker;

public partial class App : Application
{
	public static WorkoutDatabase workDB { get; private set; }
	public App(WorkoutDatabase database)
	{
		InitializeComponent();

		MainPage = new AppShell();
		workDB = database;
	}
}
