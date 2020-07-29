/**
 * 
 * 
 * @author andalibaryan
 *
 */
public class Clock {
    
    private int hours;
    private int minutes;
    private int seconds;
    /**
     * making a constructor
     * @param hours  hh24(0~23) in time
     * @param minutes mm(0-59) 
     * @param seconds ss(0-59)
     */
    public Clock (int hours,int minutes,int seconds) {
        this.hours=hours;
        this.minutes=minutes;
        this.seconds=seconds;
    }
    /**
     * setting hours
     * @param hours 
     */
    public void setHours(int hours) {
        this.hours=hours;
    }
    /**
     * setting minutes
     * @param minutes
     */
    public void setMinutes(int minutes) {
       this.minutes=minutes;
    }
    /**
     * setting seconds
     * @param seconds
     */
    
    public void setSeconds(int seconds) {
        this.seconds=seconds;
    }
    /**
     * getting hours
     * @return hours
     */
    public int getHours() {
        return(this.hours);
    }
    /**
     * getting minutes
     * @return minutes
     */
    public int getMinutes() {
        return(this.minutes);
    }
    /**
     * getting seconds
     * @return seconds
     */
    public int getSeconds() {
        return(this.seconds);
    }
    /**
     *it add 0 with the empty string of minutes and seconds
     * @return time string such as hh:mi:ss
     */
    public String toString() {
        String str = hours+":";
        if(minutes<10) {
            str+="0"+minutes+":";
        }
        else {
            str+=minutes+":";
        }
        if(seconds<10) {
            str+="0"+seconds;
        }
        else {
            str+=seconds;
        }
        
        return str;
        
    }
    
    
    
    
    
    

}
