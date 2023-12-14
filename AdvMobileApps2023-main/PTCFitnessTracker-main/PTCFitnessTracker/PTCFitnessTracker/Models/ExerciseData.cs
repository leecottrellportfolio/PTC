using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.ComponentModel;
using SQLite;

namespace PTCFitnessTracker.Models
{
    [Table("ExerciseData")]
    public class ExerciseData : INotifyPropertyChanged
    {
        [PrimaryKey, AutoIncrement]
        public int ExercisePK { get; set; }

        private string _equipment;

        public string Equipment
        {
            get { return _equipment; }
            set
            {
                _equipment = value;
                OnPropertyChanged("Equipment");
            }
        }

        private double _weight;

        public double Weight
        {
            get { return _weight; }
            set
            {
                _weight = value;
                OnPropertyChanged("Weight");
            }
        }
//double because Keyboard = numeric supports double only
        private double _reps;

        public double Repetitions
        {
            get { return _reps; }
            set
            {
                _reps = value;
                OnPropertyChanged("Repetitions");
            }
        }

        private DateTime _date;



        public DateTime WorkoutDate
        {
            get { return _date; }
            set
            {
                _date = value;
                OnPropertyChanged("WorkoutDate");
            }
        }

        public ExerciseData()
        {
            _date = DateTime.Now;
            _reps = 100;
            _weight = 200;
            _equipment = "dumb bell";
        }

        public ExerciseData(string equip)
        {
            _date = DateTime.Now;
            _reps = 150;
            _weight = 250;
            _equipment = equip;
        }

        public event PropertyChangedEventHandler PropertyChanged;

        protected void OnPropertyChanged(string propertyName)
        {
            if (PropertyChanged != null)
            {
                PropertyChangedEventArgs args = new PropertyChangedEventArgs(propertyName);
                PropertyChanged(this, args);
            }
        }
    }
}
