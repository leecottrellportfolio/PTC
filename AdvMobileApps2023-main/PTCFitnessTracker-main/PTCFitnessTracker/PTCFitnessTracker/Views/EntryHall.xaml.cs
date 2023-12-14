namespace PTCFitnessTracker.Views;

public partial class EntryHall : ContentPage
{

	public void RecordExercise(object sender, EventArgs e)
	{
		ImageButton equip = (ImageButton) sender;
		String equipname = equip.AutomationId.ToString();

        //DisplayAlert("Red Alert", "Click worked from " + equip.AutomationId, "Woo Hoo!");
        //pass data into the data entry page
        //https://learn.microsoft.com/en-us/dotnet/maui/fundamentals/shell/navigation?view=net-maui-7.0

        Shell.Current.GoToAsync($"dataentry?EquipName={equipname}");
	}
	public EntryHall()
	{
		InitializeComponent();
	}
}