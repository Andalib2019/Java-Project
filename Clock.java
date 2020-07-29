
public class Clock {
    private int hours;
    private int minutes;
    private int seconds;
    
    public Clock (int hours,int minutes,int seconds) {//making a constructor
        //Setting  the condition if the condition does not met then throw with the message
       
            if(hours>23||hours<0||minutes>59||minutes<0||seconds>59||seconds<0) {
                throw new IllegalClockException("this data is invalid "+hours+":"+minutes+":"+seconds);
            }
        
        
            else {
            this.hours=hours;  //hours hh24(0-23)in time
            this.minutes=minutes;//minutes mm(0-59)
            this.seconds=seconds;//seconds ss(0-59)
            }
       
       
          
       
    }
    
    public void setHours(int hours) {//setting hours
        this.hours=hours;
    }
    
    public void setMinutes(int minutes) {//setting minutes
        this.minutes=minutes;
     }
    
    public void setSeconds(int seconds) {//setting seconds
        this.seconds=seconds;
    }
    
    public int getHours() {//getting hours
        return(this.hours);
    }
    
    public int getMinutes() {//getting minutes
        return(this.minutes);
    }
    
    public int getSeconds() {//getting seconds
        return(this.seconds);
    }
    
    public String toString() {
        String str = hours+":";
        if(minutes<10) {
            str+="0"+minutes+":";//it add 0 with the empty string of minutes and seconds
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
        
        return str;//return time string such as hh:mi:ss
        
    }
}
