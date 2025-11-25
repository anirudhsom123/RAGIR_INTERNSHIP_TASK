package com.RAGIR.Internship.Exceptions;

public class OrganizationAlreadyExistExpection extends RuntimeException{

    public OrganizationAlreadyExistExpection(String msg){
        super(msg);
    }
}
