package com.nirsb.webserver.test.Webservertest.exception;

import com.nirsb.webserver.test.Webservertest.model.ErrorDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.Date;

@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {
    @ExceptionHandler(EmployeeNotFoundExceptions.class)
    public ResponseEntity<Object> handleUserNotFoundException(Exception e, WebRequest request){
        ErrorDTO errorDTO = new ErrorDTO();
        errorDTO.setStatus("SUCESS");
        errorDTO.setMessage(e.getMessage());
        errorDTO.setPath(request.getContextPath());
        errorDTO.setTimeStamp(new Date());
        return new ResponseEntity<>(errorDTO,HttpStatus.NOT_FOUND);

    }
}
