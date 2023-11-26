package com.educandoweb.course.services.exeptions;

public class DataBaseExeption extends RuntimeException{
    private static final long serialVersionUID = 1l;

    public DataBaseExeption(String msg){
        super(msg);

    }
}
