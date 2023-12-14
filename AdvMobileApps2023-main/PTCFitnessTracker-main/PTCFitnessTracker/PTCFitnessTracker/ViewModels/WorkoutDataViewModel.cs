using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using PTCFitnessTracker.Models;
using System.ComponentModel;

namespace PTCFitnessTracker.ViewModels
{
    public class WorkoutDataViewModel : INotifyPropertyChanged
    {
        public event PropertyChangedEventHandler PropertyChanged;

		private ExerciseData _exerciseData;

		public ExerciseData TheData
		{
			get { return _exerciseData; }
			set { _exerciseData = value; }
		}

		public WorkoutDataViewModel()
		{
			_exerciseData = new ExerciseData();
		}

        public WorkoutDataViewModel(String equip)
        {
            _exerciseData = new ExerciseData(equip);
        }

		public void NotifyPropertyChanged(string propName)
		{
			if(PropertyChanged != null)
			{
				PropertyChangedEventArgs args = new PropertyChangedEventArgs(propName);
				this.PropertyChanged(this, args);
			}
		}

	}
}
