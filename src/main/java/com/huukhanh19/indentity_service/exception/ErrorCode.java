package com.huukhanh19.indentity_service.exception;

public enum ErrorCode {
    UNCATEGORIZED_EXCEPTION(9999, "Uncategorized error"),
    KEY_INVALID(1001, "Uncategorized error"),
    USER_EXISTED(1002, "User already exists"),
    USERNAME_INVALID(1003, "User name must at least 3 characters"),
    PASSWORD_INVALID(1004, "Password must at least 8 characters"),
    ;

    ErrorCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    private int code;
    private String message;

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
