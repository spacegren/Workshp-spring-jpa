package com.educandoweb.course.services.exeptions;

public class ResourceNotFoundExeption extends RuntimeException{
    private static final long serialVersionUID = 1l;

    public ResourceNotFoundExeption(Object id){
        super("RESOURCE NOT FOUNd. ID" + id);
    }
}
