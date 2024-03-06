package swiggyLite;

public enum ErrorCodes {
    SWIGGY_INVALID_OTP_1000("SWIGGY_IVOTP_1000","INVALID PASSWORD"),
    SWIGGY_INSUFFICIENT_AMOUNT_1001("SWIGGY_InfsAmt_1000","INSUFFICIENT AMOUNT ");
    String code;
    String message;

    ErrorCodes (String errorCode,String errorMSG){
        this.code = errorCode;
        this.message=errorMSG;
    }
    public String getCode() {
        return code;
    }
    public String getMessage() {
        return message;
    }
}
