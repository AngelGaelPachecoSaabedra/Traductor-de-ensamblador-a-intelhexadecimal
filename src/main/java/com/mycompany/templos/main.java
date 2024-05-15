/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.templos;
import java.util.Scanner;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author angel
 */
public class main {
    static List<instruccion> lista2= new LinkedList<>();
    static List<etiquetas> lista3=new LinkedList<>();
    static List<instruccion>errores=new LinkedList<>();
 public static void main(String[] args) throws IOException {
        Scanner leer;
        String archivo;
        leer = new Scanner(System.in);
        System.out.println("Dame nombre del archivo con forma nombre.txt o nombre.asm");
        archivo=leer.next();
         var nombreArchivo=archivo;
         nombreArchivo=nombreArchivo.replaceAll("\n+", "");
         
         
       manejoArchivo.leerArchivo3(nombreArchivo);
       
       for (int i = 0; i <= lista2.size()-1; i++) {
       // System.out.println(lista2.get(i).memo.split(" ")[1]);
         if (lista2.get(i).ins == null) {
             if (!main.lista3.isEmpty()) {
                 for (int j = 0; j <= lista3.size()-1; j++) {
                     
              
                     if(lista2.get(i).memo.contains(",")){
                     if (lista3.get(j).nombre.equals(lista2.get(i).memo.split(",")[1])){
                         //System.out.println(main.lista2.get(i).memo);
                         regex.JPNN2(lista2.get(i).memo,i);
                         regex.JPNNCC2(lista2.get(i).memo,i);
                         regex.JRE2(lista2.get(i).memo,i);
                         regex.CALLNN2(lista2.get(i).memo, i);
                         regex.CALLNNCC2(lista2.get(i).memo, i);
                         regex.JCE2(lista2.get(i).memo,i);
                         regex.JNZE2(lista2.get(i).memo,i);
                         regex.JRZE2(lista2.get(i).memo,i);
                         regex.DJNZ2(lista2.get(i).memo,i);
                         
                     }
                     }
                     else{
                        if(lista3.get(j).nombre.equals(lista2.get(i).memo.split(" ")[1]))
                        {
                           // System.out.println(lista2.get(i).memo);
                         regex.JPNN2(lista2.get(i).memo,i);
                         regex.JPNNCC2(lista2.get(i).memo,i);
                         regex.JRE2(lista2.get(i).memo,i);
                         regex.CALLNN2(lista2.get(i).memo, i);
                         regex.CALLNNCC2(lista2.get(i).memo, i);
                         regex.JCE2(lista2.get(i).memo,i);
                         regex.JNZE2(lista2.get(i).memo,i);
                         regex.JRZE2(lista2.get(i).memo,i);
                         regex.DJNZ2(lista2.get(i).memo,i);
                        }
                     }

                 }

             }
         }
         if (lista2.get(i).ins==null){
            lista2.get(i).ins="etiqueta no declarada";
            errores.add(new instruccion("Etiqueta no declarada en la instruccion "+lista2.get(i).memo));
         }
     }
       if(errores.isEmpty()){
     instruccion.imprime(archivo);
     listasHexa l1= new listasHexa();
     l1.crear(lista2);
     //l1.muestra();
     l1.formato(archivo);
       }
       else{
            System.out.println("\t"+"ARCHIVOS .hex y .lst NO GENERADOS CORRIGE LOS SIGUIENTES ERRORES ");
          for(int i=0;i<=errores.size()-1;i++){
               System.out.println("\t"+"     "+errores.get(i).ins);
          }
       
       }
      
    }

}
