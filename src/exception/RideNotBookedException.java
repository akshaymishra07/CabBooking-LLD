package exception;

public class RideNotBookedException extends RuntimeException{

    public RideNotBookedException(String msg){
        super(msg);
    }

}

