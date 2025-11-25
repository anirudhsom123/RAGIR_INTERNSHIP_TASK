package com.RAGIR.Internship.Exceptions;

// exception for organtionzation not found
// will work for search by id as well as for search by name
public class OrganizationNotFoundException extends  RuntimeException{

    public OrganizationNotFoundException(String msg){
        super(msg);
    }
}
