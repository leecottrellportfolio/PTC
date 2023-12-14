using PTCFitnessTracker.ViewModels;
using PTCFitnessTracker.Models;

namespace PTCFitnessTracker;

public static class MauiProgram
{
	public static MauiApp CreateMauiApp()
	{
		var builder = MauiApp.CreateBuilder();
		builder
			.UseMauiApp<App>()
			.ConfigureFonts(fonts =>
			{
				fonts.AddFont("AvenirLTStd-Black.otf", "Avenir");
			});
		String dbPath = System.IO.Path.Combine(FileSystem.AppDataDirectory, "PTCexercise.db");
		builder.Services.AddSingleton<WorkoutDatabase>(e => ActivatorUtilities.CreateInstance<WorkoutDatabase>(e, dbPath));

		return builder.Build();
	}
}
