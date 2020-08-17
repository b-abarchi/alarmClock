
public class AlarmClock {

	public AlarmClock(int i, int j, int k, boolean b) {
		// TODO Auto-generated constructor stub
	}

	public class TikTok {

		private int hours;

		private int minutes;

		private int seconds;

		private int hoursAlarm;

		private int minutesAlarm;

		private int secondsAlarm;

		private boolean onSwitch;

		public void AlarmClock(int hours, int minutes, int seconds, boolean onSwitch) {

		this.hours = hours;

		this.minutes = minutes;

		this.seconds = seconds;

		this.onSwitch = onSwitch;

		}

		public TikTok(int hours, int minutes, int seconds) {

		this.hours = hours;

		this.minutes = minutes;

		this.seconds = seconds;

		this.onSwitch = false;

		}

		public int getHours() {

		return hours;

		}

		public void setHours(int hours) {

		if(hours > 12)

		this.hours = hours;

		}

		public int getMinutes() {

		return minutes;

		}

		public void setMinutes(int minutes) {

		this.minutes = minutes;

		}

		public int getSeconds() {

		return seconds;

		}

		public void setSeconds(int seconds) {

		this.seconds = seconds;

		}

		public int getHoursAlarm() {

		return hoursAlarm;

		}

		public void setHoursAlarm(int hoursAlarm) {

		this.hoursAlarm = hoursAlarm;

		}

		public int getMinutesAlarm() {

		return minutesAlarm;

		}

		public void setMinutesAlarm(int minutesAlarm) {

		this.minutesAlarm = minutesAlarm;

		}

		public int getSecondsAlarm() {

		return secondsAlarm;

		}

		public void setSecondsAlarm(int secondsAlarm) {

		this.secondsAlarm = secondsAlarm;

		}

		public boolean isOnSwitch() {

		return onSwitch;

		}

		public void setOnSwitch(boolean onSwitch) {

		this.onSwitch = onSwitch;

		}

		public String toString() {

		String result;

		result = "Time of Day: \n" +

		hours + ":" + minutes + ":" +seconds+

		"\n\nAlarm Time: \n" +

		hoursAlarm + ":" + minutesAlarm + ":" + secondsAlarm ;

		if(onSwitch)

		result = result + "\nThe alarm is turned on.\n";

		else

		result = result + "\nThe alarm is turned on.\n";

		return result;

		}

		} // end of AlarmClock
	
}
