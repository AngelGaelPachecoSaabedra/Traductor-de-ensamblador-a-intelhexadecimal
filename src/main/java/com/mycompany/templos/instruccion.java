/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.templos;

import static com.mycompany.templos.main.lista2;
import java.io.*;

/**
 *
 * @author angel
 */
public class instruccion {

    String ins;//intruccion en hexa
    String memo = null;
    int contador = 0;//contador
    int lg;//longuitud

    public instruccion(String ins, int lg) {
        this.ins = ins;
        this.lg = lg;
    }

    public instruccion(String ins) {
        this.ins = ins;

    }

    public static void imprime(String nombre) {
        String contador;
        try {
            nombre = nombre.substring(0, nombre.length() - 4);
            PrintWriter write = new PrintWriter(nombre + ".lst");
            for (int i = 0; i <= lista2.size() - 1; i++) {
                contador = Integer.toHexString(lista2.get(i).contador);

                if (lista2.get(i).ins.contains(" ")) {
                    String temp;
                    switch (lista2.get(i).ins.length()) {
                        case 7:
                            temp = lista2.get(i).ins;
                            temp = "0" + temp;
                            lista2.get(i).ins = temp;
                            break;
                        case 4:
                            temp = lista2.get(i).ins;
                            temp = "0" + temp;
                            lista2.get(i).ins = temp;
                            break;
                    }
                } else {
                    String temp;
                    switch (lista2.get(i).ins.length()) {
                        case 1:
                            temp = lista2.get(i).ins;
                            temp = "0" + temp;
                            lista2.get(i).ins = temp;
                            break;

                    }

                }
                if (contador.length() < 4) {
                    if (contador.length() == 3) {
                        write.println(" 0" + contador.toUpperCase() + ":" + lista2.get(i).ins.toUpperCase() + "\t" + lista2.get(i).memo);
                    }
                    if (contador.length() == 2) {
                        write.println("00" + contador.toUpperCase() + ":" + lista2.get(i).ins.toUpperCase() + "\t" + lista2.get(i).memo);
                    }
                    if (contador.length() == 1) {
                        write.println("000" + contador.toUpperCase() + ":" + lista2.get(i).ins.toUpperCase() + "\t" + lista2.get(i).memo);
                    }
                } else {
                    write.println(contador.toUpperCase() + ":" + lista2.get(i).ins.toUpperCase() + "\t" + lista2.get(i).memo);//toUpperCase pasa la lestras a mayusculas
                }
            }
            if (!main.lista3.isEmpty()) {
                write.println("Tabla de simbolos");
                for (int b = 0; b <= main.lista3.size() - 1; b++) {
                    if(main.lista3.get(b).valor.length()<4){
                        switch (main.lista3.get(b).valor.length()) {
                            case 3:
                                write.println(main.lista3.get(b).nombre + " " +"0"+ Integer.toHexString(Integer.parseInt(main.lista3.get(b).valor)));
                                break;
                            case 2:
                                write.println(main.lista3.get(b).nombre + " " +"00"+ Integer.toHexString(Integer.parseInt(main.lista3.get(b).valor)));
                                break;
                            case 1:
                                write.println(main.lista3.get(b).nombre + " " +"000"+ Integer.toHexString(Integer.parseInt(main.lista3.get(b).valor)));
                                break;
                            default:
                                
                             
                       
                                break;
                        }
                    
                    }
                    else{
                    write.println(main.lista3.get(b).nombre + " " + Integer.toHexString(Integer.parseInt(main.lista3.get(b).valor)));
            }}

            }
            write.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void actualiza(String copiains, String Aux, int tamaño) {
        if (!main.lista2.isEmpty()) {
            if (main.lista2.size() > 1 && tamaño < main.lista2.size()) {

                main.lista2.get(main.lista2.size() - 1).memo = copiains;
                main.lista2.get(main.lista2.size() - 1).contador = main.lista2.get(main.lista2.size() - 2).contador + main.lista2.get(main.lista2.size() - 2).lg;

            }
            if (main.lista2.size() == 1) {
                main.lista2.get(0).memo = copiains;
                main.lista2.get(0).contador = 0;

            }
        }
        if (!main.lista3.isEmpty()&&Aux!=null) {
            for (int i = 0; i <= main.lista3.size() - 1; i++) {
                if (Aux.equals(main.lista3.get(i).nombre)) {
                    main.errores.add(new instruccion("Doble declaración de la etiqueta "+Aux+" en la intruccion "+ copiains));
                    return;
                }
            }
        }
        if (tamaño < main.lista2.size() && Aux != null) {
            main.lista3.add(new etiquetas(Aux, Integer.toString(main.lista2.get(main.lista2.size() - 1).contador)));
            main.lista2.get(main.lista2.size() - 1).memo = copiains;

        }
    }

}
   
   

