package com.nirsb.webserver.test.Webservertest.exception;

public class UnAuthorizedException extends RuntimeException {
    public UnAuthorizedException(String msg){
        super(msg);
    }
}
