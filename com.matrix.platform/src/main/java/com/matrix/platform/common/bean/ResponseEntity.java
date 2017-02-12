package com.matrix.platform.common.bean;

public class ResponseEntity<T>
{

    private String code;

    private String message;

    private T resObj;

    public ResponseEntity(String code)
    {
        super();
        this.code = code;
    }

    public ResponseEntity(String code, String message)
    {
        super();
        this.code = code;
        this.message = message;
    }

    public ResponseEntity(String code, T resObj)
    {
        super();
        this.code = code;
        this.resObj = resObj;
    }

    public ResponseEntity(T resObj)
    {
        super();
        this.code = "0";
        this.message = "SUCCESS";
        this.resObj = resObj;
    }

    public String getCode()
    {
        return code;
    }

    public void setCode(String code)
    {
        this.code = code;
    }

    public String getMessage()
    {
        return message;
    }

    public void setMessage(String message)
    {
        this.message = message;
    }

    public T getResObj()
    {
        return resObj;
    }

    public void setResObj(T resObj)
    {
        this.resObj = resObj;
    }

    @Override
    public String toString()
    {
        return "ResponseEntity [code=" + code + ", message=" + message + ", resObj=" + resObj + "]";
    }

}
