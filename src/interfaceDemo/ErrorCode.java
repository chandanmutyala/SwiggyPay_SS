package interfaceDemo;

public enum  ErrorCode {
    NEOTERIC_INVALID_OTP_1000("NEO_IVOTP_1000","INVALID OTP"),
    NEOTERIC_EXPIRED_OTP_1001("NEO_expOTP_1000","EXPIRED OTP");
    String code;
    String message;
    public String getCode() {
        return code;
    }
    ErrorCode (String errorCode,String errorMSG){
        this.code = errorCode;
        this.message=errorMSG;
    }

    public String getMessage() {
        return message;
    }
}
