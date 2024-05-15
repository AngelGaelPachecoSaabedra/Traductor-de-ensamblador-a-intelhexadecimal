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
public class banderas {
      String bandera;
     String codigo;
    public banderas(String reg,String cod){
        this.bandera=reg;
        this.codigo=cod;
    }
      public static LinkedList crear3(){
        List<banderas> listar= new LinkedList<>();
        listar.add(new banderas("NZ","000"));
        listar.add(new banderas("Z","001"));
        listar.add(new banderas("NC","010"));
        listar.add(new banderas("C","011"));
        listar.add(new banderas("PO","100"));
        listar.add(new banderas("PE","101"));
        listar.add(new banderas("P","110"));
        listar.add(new banderas("M","111"));
        return (LinkedList) listar;
       }
}
