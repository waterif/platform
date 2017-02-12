package com.matrix.platform.common.exception;

public class MatrixException extends RuntimeException
{

    /**
     * 
     */
    private static final long serialVersionUID = 8176804041487414670L;

    private String code;

    private String message;

    public MatrixException(String code, String message)
    {
        super();
        this.code = code;
        this.message = message;
    }

    public MatrixException(String code)
    {
        super();
        this.code = code;
        this.message = "SUCCESS";
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

}
