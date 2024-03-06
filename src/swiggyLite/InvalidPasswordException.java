package swiggyLite;

public class InvalidPasswordException extends Exception {
    String code;

    public String getCode() {
        return code;
    }
    public InvalidPasswordException(String errorCode , String message){
        super(message);
        this.code = errorCode;
    }

}
