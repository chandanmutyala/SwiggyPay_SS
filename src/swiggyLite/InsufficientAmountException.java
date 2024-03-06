package swiggyLite;

public class InsufficientAmountException extends Exception{
    String code;

    public String getCode() {
        return code;
    }
    public InsufficientAmountException(String errorCode , String message){
        super(message);
        this.code = errorCode;
    }
}
