package com.RAGIR.Internship.Exceptions;

// exception for user already existing in DB
public class OrganizationAlreadyExistExpection extends RuntimeException{

    public OrganizationAlreadyExistExpection(String msg){
        super(msg);
    }
}
