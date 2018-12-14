package org.st.framework.core.utils;

public class SimpleData<T> {

    private T data;
    private int code;
    private String message;

    public SimpleData(T data, int code, String message) {
        this.data = data;
        this.code = code;
        this.message = message;
    }

    public SimpleData(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public SimpleData() {
    }

    public T getData() {
        return data;
    }

    public SimpleData setData(T data) {
        this.data = data;
        return this;
    }

    public int getCode() {
        return code;
    }

    public SimpleData setCode(int code) {
        this.code = code;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public SimpleData setMessage(String message) {
        this.message = message;
        return this;
    }
}

