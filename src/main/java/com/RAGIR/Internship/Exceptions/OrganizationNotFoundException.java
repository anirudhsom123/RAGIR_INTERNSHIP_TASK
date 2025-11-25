package com.RAGIR.Internship.Exceptions;

public class OrganizationNotFoundException extends  RuntimeException{

    public OrganizationNotFoundException(String msg){
        super(msg);
    }
}
