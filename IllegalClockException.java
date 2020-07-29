
public class IllegalClockException extends IllegalArgumentException {
    //constructor taking error message
    public IllegalClockException(String msg ) {
        super(msg);
        
    }
    //default constructor
    public IllegalClockException() {
        super("Invalid data");
   }

}
 


