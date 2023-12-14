using PTCFitnessTracker.Views;

namespace PTCFitnessTracker;

public partial class AppShell : Shell
{
	public AppShell()
	{
		InitializeComponent();
		Routing.RegisterRoute("dataentry", typeof(DataEntry));//this should allow me to click the route
	}
}
