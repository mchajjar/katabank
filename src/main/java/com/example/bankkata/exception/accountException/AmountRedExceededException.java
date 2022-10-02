package com.example.bankkata.exception.accountException;

import com.example.bankkata.exception.CustomException;
import com.example.bankkata.model.CustomError;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class AmountRedExceededException extends CustomException {

    private static final String CAUSE= "The Amount of red has been exceeded";
    private static final long serialVersionUID = 2;
    private static final int code = HttpStatus.NOT_FOUND.value();

    public AmountRedExceededException(String message){
        super(new CustomError(code,message,CAUSE));
    }
    public AmountRedExceededException(){
        super(new CustomError(code,CAUSE,CAUSE));
    }

}
