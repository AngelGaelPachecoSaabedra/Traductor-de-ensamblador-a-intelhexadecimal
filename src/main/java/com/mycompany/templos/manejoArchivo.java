/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.templos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author angel
 */
public class manejoArchivo {
    
     public static void leerArchivo3(String nombreArchivo){
          var archivo= new File(nombreArchivo);
          String ins;
          int tamaño;
          String Aux=null;
         
          String copiains;
          try {
             var entrada = new BufferedReader(new FileReader(archivo));
              try {
                  var lectura=entrada.readLine();
                  
                  while(lectura != null){
                      tamaño=main.lista2.size();
                      //contador++;
                      //System.out.println("Lectura="+lectura);
                      ins=lectura.split("\n")[0];
                     
                      ins=ins.replaceAll("\\n\\r", "");//quita saltos de linea
                      ins=ins.trim();
                      
//quita caracteres blanoos iniciales y finales
                     //System.out.println(ins);//para ver si leyo bine la instruccion
                     copiains=ins;
                     if(ins.contains(":")){
                         Aux=ins.split(":")[0];
                         ins=ins.split(":")[1];
                             
                      
                      }
                      if (tablas(ins) < 1) {
                        
                          regex.REGEX(ins);                     
                          regex.REGEX2(ins);                         
                          regex.REGEX3(ins);                        
                          regex.REGEX4(ins);                        
                          regex.REGEX5(ins);                       
                          regex.REGEX6(ins);                       
                          regex.REGEX7(ins);                       
                          regex.REGEX8(ins);                          
                          regex.RR(ins);                     
                          regex.RIX(ins);                        
                          regex.RIY(ins);                         
                          regex.IXR(ins);                        
                          regex.IYR(ins);                        
                          regex.HLN(ins);                       
                          regex.IXN(ins);                   
                          regex.IYN(ins);                        
                          regex.ANN(ins);                         
                          regex.NNA(ins);                        
                         regex.XORIY(ins); 
                          regex.JPNN(ins);
                          regex.JPNNCC(ins);
                          regex.JRE(ins);
                          regex.JRCE(ins);
                          regex.JRNZE(ins);
                          regex.JRZE(ins);
                         regex.DJNZ(ins);
                          
                         
                          regex.DDNN(ins);
                          regex.IXNN(ins);
                          regex.IYNN(ins);
                          regex.IYnn(ins);
                          regex.IXnn(ins);
                          regex.nnIX(ins);
                          regex.nnIY(ins);
                          regex.nnHL(ins);
                          regex.HLnn(ins);
                          regex.DDnn(ins);
                          regex.nnDD(ins);
                         
                       regex.CALLNN(ins);
                        regex.CALLNNCC(ins);
                          regex.A_6_1(ins);
                      regex.A_6_2(ins);
                     regex.A_6_3(ins);
                      regex.A_6_4(ins);
                      regex.A_6_5(ins);
                      regex.A_6_6(ins);
                      regex.A_6_7(ins);
                      regex.A_6_8(ins);
                      regex.A_6_9(ins);
                      regex.A_6_10(ins);
                      regex.A_6_11(ins);
                      regex.A_3_1(ins);
                      regex.A_3_2(ins);
                      regex.A_3_3(ins);
                      regex.A_3_4(ins);
                      regex.A_3_5(ins);
                      regex.A_3_6(ins);
                      regex.A_3_7(ins);
                      regex.A_3_9(ins);
                      regex.A_3_11(ins);
                      regex.A_3_13(ins);
                      regex.ADDn(ins);
                         regex.ADDIX(ins);
                          regex.ADDIY(ins);
                          regex.ADCn(ins);
                          regex.ADCIX(ins);
                          regex.ADCIY(ins);
                          regex.SUBn(ins);
                          regex.SUBIX(ins);
                          regex.SUBIY(ins);
                          regex.SBCn(ins);
                          regex.SBCIX(ins);
                          regex.SBCIY(ins);
                          regex.ANDn(ins);
                          regex.ANDIX(ins);
                          regex.ANDIY(ins);
                          regex.ORn(ins);
                          regex.ORIX(ins);
                          regex.ORIY(ins);
                          regex.XORn(ins);
                          regex.XORIY(ins);
                          regex.XORIX(ins);
                          regex.CPn(ins);
                          regex.CPIX(ins);
                          regex.CPIY(ins);
                         regex.INCIX(ins);
                          regex.INCIY(ins);
                         regex.DECIX(ins);
                          regex.DECIY(ins);
                          regex.RLCIX(ins);
                          regex.RLCIY(ins);
                          regex.RLIX(ins);
                          regex.RLIY(ins);
                          regex.RRCIX(ins);
                          regex.RRCIY(ins);
                          regex.RRIX(ins);
                          regex.RRIY(ins);
                          regex.SLAIX(ins);
                          regex.SLAIY(ins);
                          regex.SRAIX(ins);
                          regex.SRAIY(ins);
                          regex.SRLIX(ins);
                          regex.SRLIY(ins);

                         
                          
                          
                      }
                     
                      instruccion.actualiza(copiains, Aux, tamaño);
                      if(tamaño==main.lista2.size()){
                        main.errores.add(new instruccion("error de declaración en la instruccion "+copiains));
                        main.lista2.add(new instruccion("error"));
                      }
                          
                          //añade la instruccion 
                      Aux=null;  
                      lectura=entrada.readLine();
                      
                      
                  }
                  entrada.close();
                 
              } catch (IOException ex) {
                 ex.printStackTrace(System.out);
              }
          } catch (FileNotFoundException ex) {
              ex.printStackTrace(System.out);
      }
}
    public static int tablas(String cadena) {
        var archivo = new File("instruccion.txt");
        int i = 0;
        String[] ins;
        String ins1;
        String codigo;
        String longitud;
        int contador = 0;
        try {
            var entrada = new BufferedReader(new FileReader("instruccion.txt"));
            try {
                var lectura = entrada.readLine();

                while (lectura != null) {
                    //contador++;
                    //System.out.println("Lectura="+lectura);
                    ins = lectura.split("\\|", 2);

                    ins1 = ins[0];

                    //ins=ins.replaceAll("\\n\\r", "");//quita saltos de linea
                    //ins=ins.trim();//quita caracteres blanoos iniciales y finales
                    //System.out.println(ins1);//para ver si leyo bine la instruccion
                    if (ins1.equals(cadena)) {
                        
                        ins = ins[1].split("\\|", 2);
                        ins[0] = Integer.toHexString(Integer.parseInt(ins[0], 2));
                        codigo=ins[0];
                        //System.out.println(codigo.charAt(0));
                        if (codigo.length() == 3) {
                            main.lista2.add(new instruccion(Character.toString(codigo.charAt(0))+ Character.toString(codigo.charAt(1)) + " " + Character.toString(codigo.charAt(1)), Integer.parseInt(ins[1])));
                            
                        } else if (codigo.length() == 2) {
                            if(ins[1].equals("1")){
                            main.lista2.add(new instruccion(Character.toString(codigo.charAt(0)) + Character.toString(codigo.charAt(1)), Integer.parseInt(ins[1])));
                            }else{
                                main.lista2.add(new instruccion(Character.toString(codigo.charAt(0)) + Character.toString(codigo.charAt(1)) + " " + "00", Integer.parseInt(ins[1])));

                            }
                              
                        } else if (codigo.length() == 1) {
                            if(ins[1].equals("1")){
                                main.lista2.add(new instruccion(Character.toString(codigo.charAt(0)), Integer.parseInt(ins[1])));
                            }else{
                            main.lista2.add(new instruccion(Character.toString(codigo.charAt(0)) + " " + "00", Integer.parseInt(ins[1])));
                            }
                        } else if (codigo.length() == 4) {

                            main.lista2.add(new instruccion(codigo.substring(0, 2) + " " + codigo.substring(2, 4), Integer.parseInt(ins[1])));

                        }

                        i = 1;
//System.out.println(main.lista2.get(1).ins);
                        //main.lista2.get(main.lista2.size()-1).memo=copiains;
                    }
                    //añade la instruccion 

                    lectura = entrada.readLine();

                }
                i = -1;
                entrada.close();
            } catch (IOException ex) {
                ex.printStackTrace(System.out);
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        }
        return i;
    }

}
