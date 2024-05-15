/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.templos;

import com.mycompany.templos.registros;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Jhusteene
 */
public class clistarepp {
    static List<registros> listar= new LinkedList<>();
    public static LinkedList crear(){
        
        listar.add(new registros("BC","00"));
        listar.add(new registros("DE","01"));
        listar.add(new registros("IX","10"));
        listar.add(new registros("SP","11"));
        return (LinkedList) listar;
       }
    
}
