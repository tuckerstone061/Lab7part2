

package part2;

/**
 *
 * @author Tucker Stone
 * @version Oct 15, 2014
 */
public class Alarm {

    private int hour;
    private int minute;
  
    /* Constructor to initialize our alarm */
     public Alarm() {
        hour = 0;
        minute = 0;
    }
 
    /* Retrieve the hour */
   public int getHour() {
       return hour;
   }

    /* Retrieve the minute */
    public int getMinute() {
       return minute;
    }
 
    /* Set the alarm time */
    public boolean setTime(int hr, int min) {
       if (hr > 23 || hr < 0 || min > 59 || min < 0) {
           return false;
       }
       else {
            hour = hr;
            minute = min;
            return true;
       }
    }

    /* Display the time in String format */
   
   public String toString() {
       String tempMin;

       // format special cases
      if (minute < 10) {
         tempMin = ":0" + minute;
       }
      else {
          tempMin = ":" + minute;
      }

      if (hour == 0) {
          return "12" + tempMin + "AM";
      }
      else if (hour == 12) {
          return "12" + tempMin + "PM";
       }
       else if (hour > 12) {
          return (hour - 12) + tempMin + "PM";
       }
      else {
          return hour + tempMin + "AM";
      }
    }
 }

