package com.imooc.o2o.exception;


/**
 * Created by byinl on 2018/6/12 18:04.
 */
public class ShopOperationException extends RuntimeException {


    private static final long serialVersionUID = -2355919065347228162L;


    public ShopOperationException() {
    }

    public ShopOperationException(String message) {
        super(message);
    }
}
