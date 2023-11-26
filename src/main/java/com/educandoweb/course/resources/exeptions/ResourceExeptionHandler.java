package com.educandoweb.course.resources.exeptions;

import com.educandoweb.course.services.exeptions.ResourceNotFoundExeption;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.Instant;

@ControllerAdvice
public class ResourceExeptionHandler {

    //com essa anotaçao estou dizendo que esse metodo vai interceptar qualquer exeçao do tipo lançado e vai fazer o tartamento implementado la dentro
    @ExceptionHandler(ResourceNotFoundExeption.class)
    public ResponseEntity<StandardError> resourceNotFound(ResourceNotFoundExeption e , HttpServletRequest request){
        String error = "Resource not found";
        HttpStatus status = HttpStatus.NOT_FOUND;
        StandardError err = new StandardError(Instant.now() , status.value() , error , e.getMessage(),request.getRequestURI());
        return ResponseEntity.status(status).body(err);
    }
}
