using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using SQLite;
using PTCFitnessTracker.Models;
using System.ComponentModel;

namespace PTCFitnessTracker.ViewModels
{
    public class WorkoutDatabase
    {
        private SQLiteConnection conn;
        private String _dbPath;

        private void Init()
        {
            if(conn != null)
            {
                return;
            }
            conn = new SQLiteConnection(_dbPath);
            conn.CreateTable<ExerciseData>();
        }

        public WorkoutDatabase(String DbPath)
        {
            _dbPath = DbPath;
        }

        public async void InsertExerciseData(ExerciseData workout)
        {
            int result = 0;
            try
            {
                Init();
                result = conn.Insert(workout);
            }
            catch (Exception ex)
            {
                await PTCFitnessTracker.App.Current.MainPage.DisplayAlert("Database Write Error ",ex.ToString(), "Bummer");
            }
        }//end insert

        public  List<ExerciseData> GetData(String EquipName)
        {
            try
            {
                Init();
                return conn.Table<ExerciseData>().Where(e => e.Equipment.Equals(EquipName)).OrderByDescending(e => e.WorkoutDate).ToList();
            }
            catch(Exception ex)
            {
                 PTCFitnessTracker.App.Current.MainPage.DisplayAlert("Database read Error ", ex.ToString(), "Bummer");
            }
            return new List<ExerciseData>();
        }
    }
}
