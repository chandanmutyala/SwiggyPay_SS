package interfaceDemo;

public class InvalidRuntimeOTPException extends RuntimeException{
    String code;
    public String getCode() {
        return code;
    }


    public InvalidRuntimeOTPException(String errorCode,String message){
        super(message);
        this.code=errorCode;
    }
}
