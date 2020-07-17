/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.umsa.wsalumnosinbd;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Oriana
 */
@WebService(serviceName = "WSAlumnoSinBD")
public class WSAlumnoSinBD {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "GetWSAlumnoSinBD")
    public String GetWSAlumnoSinBD() {
        //TODO write your implementation code here:
        String nombre = "Victor Daniel Quino Jimenez";
        return nombre;
    }

    
}
