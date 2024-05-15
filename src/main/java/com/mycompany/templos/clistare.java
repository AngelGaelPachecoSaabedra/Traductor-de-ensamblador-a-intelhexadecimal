/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.templos;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author angel
 */
public  class clistare {
    
    public static LinkedList crear(){
        List<registros> listar= new LinkedList<>();
        listar.add(new registros("B","000"));
        listar.add(new registros("C","001"));
        listar.add(new registros("D","010"));
        listar.add(new registros("E","011"));
        listar.add(new registros("H","100"));
        listar.add(new registros("L","101"));
        listar.add(new registros("A","111"));
        return (LinkedList) listar;
       }
    public static LinkedList crear2(){
        List<registros> listar= new LinkedList<>();
        listar.add(new registros("0","000"));
        listar.add(new registros("1","001"));
        listar.add(new registros("2","010"));
        listar.add(new registros("3","011"));
        listar.add(new registros("4","100"));
        listar.add(new registros("5","101"));
        listar.add(new registros("6","110"));
        listar.add(new registros("7","111"));
        return (LinkedList) listar;
       }
       public static LinkedList crear3(){
        List<registros> listar= new LinkedList<>();
        listar.add(new registros("BC","00"));
        listar.add(new registros("DE","01"));
        listar.add(new registros("HL","10"));
        listar.add(new registros("SP","11"));
         return (LinkedList) listar;
       }
    
}
