package interfaceDemo;

public class InvalidOTPException extends Exception{
    public String getCode() {
        return code;
    }

    private String code;

    public InvalidOTPException(String errorCode,String message){
        super(message);
        this.code=errorCode;
    }
}
