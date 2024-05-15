/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.templos;


import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;




/**
 *
 * @author angel
 */
public class regex {

    public static void RR(String cadena) {
        String cadena2;
        int i;
        int b;
        String codigo;
        final String regex = "^(LD ((([A-E]|(H|L)),([A-E]|(H|L)))))$";
        final String string = cadena;
        final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(string);
        if (matcher.find()) {
            cadena2 = cadena.split(" ")[1];
            cadena = cadena2.split(",")[0];//r
            String cadena3 = cadena2.split(",")[1];//r´
            List<registros> copia = clistare.crear();
            for (i = 0; i <= copia.size() - 1; i++) {
                if (copia.get(i).registro.equals(cadena)) {
                   for (b = 0; b <= copia.size() - 1; b++) {
                    if (copia.get(b).registro.equals(cadena3)) {
                        codigo="01"+copia.get(i).codigo+copia.get(b).codigo;
                        main.lista2.add(new instruccion(Integer.toHexString(Integer.parseInt(codigo, 2)), 1));
                        break;
                    }
                }
                    break;
                }
                

            }
           
            
        }

    }
    public static void RIX(String cadena) {
             String cadena2;
        String codigo;
        int b;

        final String regex = "^(LD ([A-E]|(H|L)),(\\(IX\\+(1?[0-2][0-7]|[0-9][0-9]?)\\)))$";
        final String string = cadena;

        final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(string);
        if (matcher.find()) {
            cadena2 = cadena.split(" ")[1];//NOS QUEDAMOS SOLO CON R,(IX+D)
            cadena = cadena2.split(",")[0];//cadena sera R
            String cadena3 = cadena2.split(",")[1];//cadena3 sera (IX+D)
            cadena3 = cadena3.split("\\+")[1];
            //System.out.println(cadena3);
            //para quitar los parenteis 
            cadena3 = cadena3.replace(")", "");
            
            cadena3 = Integer.toHexString(Integer.parseInt(cadena3));
            //cadena3=Integer.toHexString(v);
            //System.out.println(cadena);
            List<registros> copia2 = clistare.crear();
            //List<registros> copia=clistare.crear();//esto es para 

            for (b = 0; b <= copia2.size() - 1; b++) {
                if (copia2.get(b).registro.equals(cadena)) {
                    codigo = "01" + copia2.get(b).codigo + "110";
                    main.lista2.add(new instruccion("dd "+ Integer.toHexString(Integer.parseInt(codigo, 2))+" "+ cadena3, 3));
                    break;
                }
            }

        }
    }
    public static void RIY(String cadena) {
                    String cadena2;
        String codigo;
        int b;

        final String regex = "^(LD ([A-E]|(H|L)),(\\(IY\\+(1?[0-2][0-7]|[0-9][0-9]?)\\)))$";
        final String string = cadena;

        final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(string);
        if (matcher.find()) {
            cadena2 = cadena.split(" ")[1];//NOS QUEDAMOS SOLO CON R,(IY+D)
            cadena = cadena2.split(",")[0];//cadena sera R
            String cadena3 = cadena2.split(",")[1];//cadena3 sera (IY+D)
            cadena3 = cadena3.split("\\+")[1];
            //System.out.println(cadena3);
            //para quitar los parenteis 
            cadena3 = cadena3.replace(")", "");
            //System.out.println(cadena3);
            cadena3 = Integer.toHexString(Integer.parseInt(cadena3));
            //cadena3=Integer.toHexString(v);
            //System.out.println(cadena3);
            List<registros> copia2 = clistare.crear();
            //List<registros> copia=clistare.crear();//esto es para 

            for (b = 0; b <= copia2.size() - 1; b++) {
                if (copia2.get(b).registro.equals(cadena)) {
                    codigo = "01" + copia2.get(b).codigo + "110";
                    main.lista2.add(new instruccion("fd "+ Integer.toHexString(Integer.parseInt(codigo, 2))+" "+ cadena3, 3));
                    break;
                }
            }

        }
    
    }
     public static void IXR(String cadena) {
        String cadena2;
        String codigo;
        int b;

        final String regex = "LD (\\(IX\\+(1?[0-2][0-7]|[0-9][0-9]?)\\)),([A-E]|[H-L])";
        final String string = cadena;

        final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(string);
        if (matcher.find()) {
            cadena2 = cadena.split(" ")[1];//NOS QUEDAMOS SOLO CON (IX+D),R
            cadena = cadena2.split(",")[0];//cadena sera (IX+D)
            String cadena3 = cadena2.split(",")[1];//cadena3 sera R
            cadena = cadena.split("\\+")[1];
            //System.out.println(cadena);
            //para quitar los parenteis 
            cadena = cadena.replace(")", "");
            //System.out.println(cadena3);
            cadena = Integer.toHexString(Integer.parseInt(cadena));
            //cadena3=Integer.toHexString(v);
            //System.out.println(cadena3);
            List<registros> copia2 = clistare.crear();
            //List<registros> copia=clistare.crear();//esto es para 

            for (b = 0; b <= copia2.size() - 1; b++) {
                if (copia2.get(b).registro.equals(cadena3)) {
                    codigo = "01"+ "110"+copia2.get(b).codigo;
                    main.lista2.add(new instruccion("dd "+ Integer.toHexString(Integer.parseInt(codigo, 2))+" "+ cadena, 3));
                    break;
                }
            }

        }
     
     }
       public static void IYR(String cadena) {
        String cadena2;
        String codigo;
        int b;

        final String regex = "LD (\\(IY\\+(1?[0-2][0-7]|[0-9][0-9]?)\\)),([A-E]|[H-L])";
        final String string = cadena;

        final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(string);
        if (matcher.find()) {
            cadena2 = cadena.split(" ")[1];//NOS QUEDAMOS SOLO CON (IX+D),R
            cadena = cadena2.split(",")[0];//cadena sera (IY+D)
            String cadena3 = cadena2.split(",")[1];//cadena3 sera R
            cadena = cadena.split("\\+")[1];
            
            //para quitar los parenteis 
            cadena = cadena.replace(")", "");
            //System.out.println(cadena3);
            cadena = Integer.toHexString(Integer.parseInt(cadena));
            //cadena3=Integer.toHexString(v);
            //System.out.println(cadena3);
            List<registros> copia2 = clistare.crear();
            //List<registros> copia=clistare.crear();//esto es para 

            for (b = 0; b <= copia2.size() - 1; b++) {
                if (copia2.get(b).registro.equals(cadena3)) {
                    codigo = "01"+ "110"+copia2.get(b).codigo;
                    main.lista2.add(new instruccion("fd "+ Integer.toHexString(Integer.parseInt(codigo, 2))+" "+ cadena, 3));
                    break;
                }
            }

        }
     
     }
       public static void HLN(String cadena){
       
       
        String cadena2;

        final String regex2 = "^(LD (\\(HL\\)),(1?[0-9]{1,2}|2[0-4][0-9]|25[0-5]))$";//decimal
       final String regex = "LD (\\(HL\\)),([0-9]([A-F]?|[0-9])H)";//hexadecimal
        final String string = cadena;
        final Pattern pattern2 = Pattern.compile(regex2, Pattern.MULTILINE);
        final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(string);
        final Matcher matcher2 = pattern2.matcher(string);
            if (matcher.find()) {
            cadena2 = cadena.split(" ")[1];
            cadena = cadena2.split(",")[0];//(hl)
            String cadena3 = cadena2.split(",")[1];//n
            cadena3 = cadena3.replace("H", "");
           
           
            
             
            //System.out.println(codigo);
            //System.out.println(Integer.toHexString(Integer.parseInt(codigo, 2)));
            main.lista2.add(new instruccion(Integer.toHexString(Integer.parseInt("00110110", 2))+" " + cadena3, 2));
            //System.out.println(main.lista2.get(0).ins);

        }
        if (matcher2.find()) {
            cadena2 = cadena.split(" ")[1];
           // cadena = cadena2.split(",")[0];//(hl)
            String cadena3 = cadena2.split(",")[1];///n
            //int v = Integer.parseInt(cadena3);
            cadena3 = Integer.toHexString(Integer.parseInt(cadena3));
            //System.out.println(cadena3);
          
            //System.out.println(codigo);
            //System.out.println(Integer.toHexString(Integer.parseInt(codi
            main.lista2.add(new instruccion(Integer.toHexString(Integer.parseInt("00110110", 2))+" " + cadena3, 2));
            //System.out.println(main.lista2.get(0).ins);

        }
       
       }
      public static void IXN(String cadena){
        
        String cadena2;

        final String regex2 = "^(LD (\\(IX\\+(1?[0-2][0-7]|[0-9][0-9]?)\\)),(1?[0-9]{1,2}|2[0-4][0-9]|25[0-5]))$";//decimal
        final String regex = "^(LD (\\(IX\\+(1?[0-2][0-7]|[0-9][0-9]?)\\)),[0-9]([A-F]?|[0-9])H)$";//hexadecimal
        final String string = cadena;
        final Pattern pattern2 = Pattern.compile(regex2, Pattern.MULTILINE);
        final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(string);
        final Matcher matcher2 = pattern2.matcher(string);
            if (matcher.find()) {
            cadena2 = cadena.split(" ")[1];
            cadena = cadena2.split(",")[0];//(IX+D)
            String cadena3 = cadena2.split(",")[1];//n
            cadena3 = cadena3.replace("H", "");
            cadena = cadena.split("\\+")[1];
            
            //para quitar los parenteis 
            cadena = cadena.replace(")", "");
           
            
             
            //System.out.println(codigo);
            //System.out.println(Integer.toHexString(Integer.parseInt(codigo, 2)));
            main.lista2.add(new instruccion("dd "+"36 "+Integer.toHexString(Integer.parseInt(cadena))+" "+cadena3, 4));
            //System.out.println(main.lista2.get(0).ins);

        }
        if (matcher2.find()) {
            cadena2 = cadena.split(" ")[1];
            cadena = cadena2.split(",")[0];//(IX+D)
            String cadena3 = cadena2.split(",")[1];//n;
            cadena = cadena.split("\\+")[1];
            cadena = cadena.replace(")", "");
           
            cadena3 = Integer.toHexString(Integer.parseInt(cadena3));
            //System.out.println(cadena3);
          
            //System.out.println(codigo);
            //System.out.println(Integer.toHexString(Integer.parseInt(codi
            main.lista2.add(new instruccion("fd "+"36 "+Integer.toHexString(Integer.parseInt(cadena))+" " + cadena3, 4));
            //System.out.println(main.lista2.get(0).ins);

        }
       
       }
        public static void IYN(String cadena){
         
        String cadena2;

        final String regex2 = "^(LD (\\(IY\\+(1?[0-2][0-7]|[0-9][0-9]?)\\)),(1?[0-9]{1,2}|2[0-4][0-9]|25[0-5]))$";//decimal
        final String regex = "^(LD (\\(IY\\+(1?[0-2][0-7]|[0-9][0-9]?)\\)),[0-9]([A-F]?|[0-9])H)$";//hexadecimal
        final String string = cadena;
        final Pattern pattern2 = Pattern.compile(regex2, Pattern.MULTILINE);
        final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(string);
        final Matcher matcher2 = pattern2.matcher(string);
            if (matcher.find()) {
            cadena2 = cadena.split(" ")[1];
            cadena = cadena2.split(",")[0];//(IX+D)
            String cadena3 = cadena2.split(",")[1];//n
            cadena3 = cadena3.replace("H", "");
            cadena = cadena.split("\\+")[1];
            
            //para quitar los parenteis 
            cadena = cadena.replace(")", "");
           
            
             
            //System.out.println(codigo);
            //System.out.println(Integer.toHexString(Integer.parseInt(codigo, 2)));
            main.lista2.add(new instruccion("dd "+"36 "+Integer.toHexString(Integer.parseInt(cadena))+" "+cadena3, 4));
            //System.out.println(main.lista2.get(0).ins);

        }
        if (matcher2.find()) {
            cadena2 = cadena.split(" ")[1];
            cadena = cadena2.split(",")[0];//(IX+D)
            String cadena3 = cadena2.split(",")[1];//n;
            cadena = cadena.split("\\+")[1];
            cadena = cadena.replace(")", "");
           
            cadena3 = Integer.toHexString(Integer.parseInt(cadena3));
            //System.out.println(cadena3);
          
            //System.out.println(codigo);
            //System.out.println(Integer.toHexString(Integer.parseInt(codi
            main.lista2.add(new instruccion("fd "+"36 "+Integer.toHexString(Integer.parseInt(cadena))+" " + cadena3, 4));
            //System.out.println(main.lista2.get(0).ins);

        }
       
       }
           public static void ANN(String cadena){
  
        String cadena2;
        
        final String regex2 = "^(LD A,\\((0|[1-9][0-9]{0,3}|[1-5][0-9]{4}|6[0-4][0-9]{3}|65[0-4][0-9]{2}|655[0-2][0-9]|6553[0-5])\\))$";//decimal
        final String regex = "^((LD A,\\([0-9]([0-9]|[A-F]){0,3}H)\\))$";//hexadecimal
        final String string = cadena;
        final Pattern pattern2 = Pattern.compile(regex2, Pattern.MULTILINE);
        final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(string);
        final Matcher matcher2 = pattern2.matcher(string);
            if (matcher.find()) {
            cadena2 = cadena.split(" ")[1];
            cadena = cadena2.split(",")[0];//A
            String cadena3 = cadena2.split(",")[1];//(NN)
            cadena3 = cadena3.replace("H", "");
            
            //para quitar los parenteis 
            cadena3 = cadena3.replace("(", "");
            cadena3 = cadena3.replace(")", "");
            //cadena3=new StringBuilder(cadena3).reverse().toString();
                //System.out.println("Estoy aca"+cadena3);
             
            //System.out.println(codigo);
            //System.out.println(Integer.toHexString(Integer.parseInt(codigo, 2)));
             if(cadena3.length()==3){
               main.lista2.add(new instruccion("3a "+cadena3.charAt(1)+cadena3.charAt(2)+" "+ cadena3.charAt(0), 3));
            
            }
             else  if(cadena3.length()==2){
               main.lista2.add(new instruccion("3a "+cadena3.charAt(0)+cadena3.charAt(1)+" "+ "00", 3));
            
            }
             else if(cadena3.length()==1){
               main.lista2.add(new instruccion("3a "+"0"+cadena3.charAt(0)+" "+ "00", 3));
             }
             else if(cadena3.length()==4){
             
             main.lista2.add(new instruccion("32 "+cadena3.substring(2, 4)+" "+ cadena3.substring(0, 2), 3));
             
             }
   
            //System.out.println(main.lista2.get(0).ins);

        }
        if (matcher2.find()) {
           cadena2 = cadena.split(" ")[1];
            //cadena = cadena2.split(",")[0];//A
            String cadena3 = cadena2.split(",")[1];//(NN)
            
            
            //para quitar los parenteis 
            cadena3 = cadena3.replace("(", "");
            cadena3 = cadena3.replace(")", "");
            cadena3=Integer.toHexString(Integer.parseInt(cadena3,16));
              if(cadena3.length()==3){
               main.lista2.add(new instruccion("3a "+cadena3.charAt(1)+cadena3.charAt(2)+" "+ cadena3.charAt(0), 3));
            
            }
             else  if(cadena3.length()==2){
               main.lista2.add(new instruccion("3a "+cadena3.charAt(0)+cadena3.charAt(1)+" "+ "00", 3));
            
            }
             else if(cadena3.length()==1){
               main.lista2.add(new instruccion("3a "+"0"+cadena3.charAt(0)+" "+ "00", 3));
             }
             else if(cadena3.length()==4){
             
             main.lista2.add(new instruccion("32 "+cadena3.substring(2, 4)+" "+ cadena3.substring(0, 2), 3));
             
             }
            //cadena3=new StringBuilder(cadena3).reverse().toString();
                //System.out.println("Estoy aca"+cadena3);
             
            //System.out.println(codigo);
            //System.out.println(Integer.toHexString(Integer.parseInt(codigo, 2)));
            //main.lista2.add(new instruccion("3a "+cadena3.substring(2, 4)+" "+ cadena3.substring(0, 2), 3));
            //System.out.println(main.lista2.get(0).ins);
        }
       
       }
      public static void NNA(String cadena){
       
        String cadena2;
        
        final String regex2 = "^(LD \\((0|[1-9][0-9]{0,3}|[1-5][0-9]{4}|6[0-4][0-9]{3}|65[0-4][0-9]{2}|655[0-2][0-9]|6553[0-5])\\),A)$";//decimal
        final String regex = "^(LD \\(([0-9]([0-9]|[A-F]){0,3}H)\\),A)$";//hexadecimal
        final String string = cadena;
        final Pattern pattern2 = Pattern.compile(regex2, Pattern.MULTILINE);
        final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(string);
        final Matcher matcher2 = pattern2.matcher(string);
            if (matcher.find()) {
            cadena2 = cadena.split(" ")[1];
            cadena = cadena2.split(",")[0];//(NN)
           // String cadena3 = cadena2.split(",")[1];//A
            cadena= cadena.replace("H", "");
            
            //para quitar los parenteis 
            cadena = cadena.replace("(", "");
            cadena = cadena.replace(")", "");
            //cadena3=new StringBuilder(cadena3).reverse().toString();
                //System.out.println("Estoy aca"+cadena3);
             
            //System.out.println(codigo);
            //System.out.println(Integer.toHexString(Integer.parseInt(codigo, 2)));
                          if(cadena.length()==3){
               main.lista2.add(new instruccion("32 "+cadena.charAt(1)+cadena.charAt(2)+" "+ cadena.charAt(0), 3));
            
            }
             else  if(cadena.length()==2){
               main.lista2.add(new instruccion("32 "+cadena.charAt(0)+cadena.charAt(1)+" "+ "00", 3));
            
            }
             else if(cadena.length()==1){
               main.lista2.add(new instruccion("32 "+"0"+cadena.charAt(0)+" "+ "00", 3));
             }
             else if(cadena.length()==4){
             
             main.lista2.add(new instruccion("32 "+cadena.substring(2, 4)+" "+ cadena.substring(0, 2), 3));
             
             }
            
            //System.out.println(main.lista2.get(0).ins);

        }
        if (matcher2.find()) {
           cadena2 = cadena.split(" ")[1];
            cadena = cadena2.split(",")[0];//NN
         //   String cadena3 = cadena2.split(",")[1];//A
            
            
            //para quitar los parenteis 
            cadena = cadena.replace("(", "");
            cadena= cadena.replace(")", "");
            cadena=Integer.toHexString(Integer.parseInt(cadena));
          
            //cadena3=new StringBuilder(cadena3).reverse().toString();
                //System.out.println("Estoy aca"+cadena3);
              if(cadena.length()==3){
               main.lista2.add(new instruccion("32 "+cadena.charAt(1)+cadena.charAt(2)+" "+ cadena.charAt(0), 3));
            
            }
             else  if(cadena.length()==2){
               main.lista2.add(new instruccion("32 "+cadena.charAt(0)+cadena.charAt(1)+" "+ "00", 3));
            
            }
             else if(cadena.length()==1){
               main.lista2.add(new instruccion("32 "+"0"+cadena.charAt(0)+" "+ "00", 3));
             }
             else if(cadena.length()==4){
             
             main.lista2.add(new instruccion("32 "+cadena.substring(2, 4)+" "+ cadena.substring(0, 2), 3));
             
             }
            //System.out.println(codigo);
            //System.out.println(Integer.toHexString(Integer.parseInt(codigo, 2)));
            
            //System.out.println(main.lista2.get(0).ins);
        }
       
       }      
    public static void REGEX(String cadena) {
        //esta funcion es para el caso de LD r,n
        int i ;
        String codigo;
        String cadena2;

        final String regex2 = "^(LD [ABCDEHL],(1?[0-9]{1,2}|2[0-4][0-9]|25[0-5]))$";
        final String regex = "^(LD [ABCDEHL],[0-9]([A-F]?|[0-9])H)$";//hexadecimal
        final String string = cadena;
        final Pattern pattern2 = Pattern.compile(regex2, Pattern.MULTILINE);
        final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(string);
        final Matcher matcher2 = pattern2.matcher(string);

        if (matcher.find()) {
            cadena2 = cadena.split(" ")[1];
            cadena = cadena2.split(",")[0];
            String cadena3 = cadena2.split(",")[1];
            cadena3 = cadena3.replace("H", "");
            //int v=Integer.parseInt(cadena3);
            //cadena3=Integer.toHexString(v);
            //System.out.println(cadena3);
            List<registros> copia = clistare.crear();//lista de registros
            for (i = 0; i <= copia.size() - 1; i++) {
                if (copia.get(i).registro.equals(cadena)) {
                    codigo = "00" + copia.get(i).codigo + "110";
                    main.lista2.add(new instruccion(Integer.toHexString(Integer.parseInt(codigo, 2))+" " + cadena3, 2));
                    break;
                }
            }

            
            //System.out.println(codigo);
            //System.out.println(Integer.toHexString(Integer.parseInt(codigo, 2)));
           
            //System.out.println(main.lista2.get(0).ins);

        }
        if (matcher2.find()) {
            cadena2 = cadena.split(" ")[1];
            cadena = cadena2.split(",")[0];
            String cadena3 = cadena2.split(",")[1];
            int v = Integer.parseInt(cadena3);
            cadena3 = Integer.toHexString(v);
            if(cadena3.length()==1){
                cadena3="0"+cadena3;
            }
            //System.out.println(cadena3);
            List<registros> copia = clistare.crear();
            for (i = 0; i <= copia.size() - 1; i++) {
                if (copia.get(i).registro.equals(cadena)) {
                    codigo = "00" + copia.get(i).codigo + "110";
            main.lista2.add(new instruccion(Integer.toHexString(Integer.parseInt(codigo, 2)) + " "+cadena3, 2));
                    break;
                }
            }

            
            

        }

       
    }

    public static void REGEX2(String cadena) {//PARA BIT B,R
        String cadena2;
        String codigo;
        int b;
        int i;
        final String regex = "^(BIT [0-7],([A-E]|[H-L]))$";
        final String string = cadena;

        final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(string);
        if (matcher.find()) {
            cadena2 = cadena.split(" ")[1];//NOS QUEDAMOS SOLO CON b,r
            cadena = cadena2.split(",")[0];//cadena sera b
            String cadena3 = cadena2.split(",")[1];//cadena3 sera r
            //int v=Integer.parseInt(cadena3);
            //cadena3=Integer.toHexString(v);
           // System.out.println(cadena3);
            List<registros> copia2 = clistare.crear2();
            List<registros> copia = clistare.crear();//esto es para 
            for (i = 0; i <= copia.size() - 1; i++) {
                if (copia.get(i).registro.equals(cadena3)) {
                    for (b = 0; b <= copia2.size() - 1; b++) {
                        if (copia2.get(b).registro.equals(cadena)) {
                            codigo = "1100101101" + copia2.get(b).codigo + copia.get(i).codigo;
                            main.lista2.add(new instruccion(Integer.toHexString(Integer.parseInt(codigo, 2)), 2));
                            break;
                        }
                    }
                    break;
                }
            }

        }

    }

    public static void REGEX3(String cadena) {//PARA B,(ix+d)
        String cadena2;
        String codigo;
        int b;

        final String regex = "^BIT [0-7],(\\(IX\\+(1?[0-2][0-7]|[0-9][0-9]?)\\))$";
        final String string = cadena;

        final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(string);
        if (matcher.find()) {
            cadena2 = cadena.split(" ")[1];//NOS QUEDAMOS SOLO CON b,r
            cadena = cadena2.split(",")[0];//cadena sera b
            String cadena3 = cadena2.split(",")[1];//cadena3 sera (IX+D)
            cadena3 = cadena3.split("\\+")[1];
            //System.out.println(cadena3);
            //para quitar los parenteis 
            cadena3 = cadena3.replace(")", "");
            //System.out.println(cadena3);
            cadena3 = Integer.toHexString(Integer.parseInt(cadena3));
           
            List<registros> copia2 = clistare.crear2();
            //List<registros> copia=clistare.crear();//esto es para 

            for (b = 0; b <= copia2.size() - 1; b++) {
                if (copia2.get(b).registro.equals(cadena)) {
                    codigo = "01" + copia2.get(b).codigo + "110";
                    main.lista2.add(new instruccion("dd " + "cb " + cadena3+" " + Integer.toHexString(Integer.parseInt(codigo, 2)), 4));
                    break;
                }
            }

        }
    }

    public static void REGEX4(String cadena) {//PARA BIT b,(iy+d)
        String cadena2;
        String codigo;
        int b;

        final String regex = "^BIT [0-7],(\\(IY\\+(1?[0-2][0-7]|[0-9][0-9]?)\\))$";
        final String string = cadena;

        final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(string);
        if (matcher.find()) {
            cadena2 = cadena.split(" ")[1];//NOS QUEDAMOS SOLO CON b,r
            cadena = cadena2.split(",")[0];//cadena sera b
            String cadena3 = cadena2.split(",")[1];//cadena3 sera (Iy+d)
            cadena3 = cadena3.split("\\+")[1];
            //System.out.println(cadena3);
            //para quitar los parenteis 
            cadena3 = cadena3.replace(")", "");
           // System.out.println(cadena3);
            cadena3 = Integer.toHexString(Integer.parseInt(cadena3));//convertinos d en hexadecimal
            //cadena3=Integer.toHexString(v);
            //System.out.println(cadena3);
            List<registros> copia2 = clistare.crear2();
            //List<registros> copia=clistare.crear();//esto es para 

            for (b = 0; b <= copia2.size() - 1; b++) {
                if (copia2.get(b).registro.equals(cadena)) {
                    codigo = "01" + copia2.get(b).codigo + "110";//codificamos el cuarto byte de la instruccion en binario
                    main.lista2.add(new instruccion("fd " + "cb " + cadena3+" " + Integer.toHexString(Integer.parseInt(codigo, 2)), 4));
                    break;
                }
            }

        }
    }

    public static void REGEX5(String cadena) {//PARA set B,R
        String cadena2;
        String codigo;
        int b;
        int i;
        final String regex = "^(SET [0-7],([A-E]|[H-L]))$";
        final String string = cadena;

        final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(string);
        if (matcher.find()) {
            cadena2 = cadena.split(" ")[1];//NOS QUEDAMOS SOLO CON b,r
            cadena = cadena2.split(",")[0];//cadena sera b
            String cadena3 = cadena2.split(",")[1];//cadena3 sera r
            //int v=Integer.parseInt(cadena3);
            //cadena3=Integer.toHexString(v);
            //System.out.println(cadena3);
            List<registros> copia2 = clistare.crear2();
            List<registros> copia = clistare.crear();//esto es para 
            for (i = 0; i <= copia.size() - 1; i++) {
                if (copia.get(i).registro.equals(cadena3)) {
                    for (b = 0; b <= copia2.size() - 1; b++) {
                        if (copia2.get(b).registro.equals(cadena)) {
                            codigo = "11" + copia2.get(b).codigo + copia.get(i).codigo;
                            main.lista2.add(new instruccion("cb " + Integer.toHexString(Integer.parseInt(codigo, 2)), 2));
                            break;
                        }
                    }
                    break;
                }
            }

        }

    }

    public static void REGEX6(String cadena) {//PARA SET b,(iX+d)
        String cadena2;
        String codigo;
        int b;

        final String regex = "^SET [0-7],(\\(IX\\+(1?[0-2][0-7]|[0-9][0-9]?)\\))$";
        final String string = cadena;

        final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(string);
        if (matcher.find()) {
            cadena2 = cadena.split(" ")[1];//NOS QUEDAMOS SOLO CON b,r
            cadena = cadena2.split(",")[0];//cadena sera b
            String cadena3 = cadena2.split(",")[1];//cadena3 sera (Iy+d)
            cadena3 = cadena3.split("\\+")[1];
            //System.out.println(cadena3);
            //para quitar los parenteis 
            cadena3 = cadena3.replace(")", "");
            //System.out.println(cadena3);
            cadena3 = Integer.toHexString(Integer.parseInt(cadena3));//convertinos d en hexadecimal
            //cadena3=Integer.toHexString(v);
            //System.out.println(cadena3);
            List<registros> copia2 = clistare.crear2();
            //List<registros> copia=clistare.crear();//esto es para 

            for (b = 0; b <= copia2.size() - 1; b++) {
                if (copia2.get(b).registro.equals(cadena)) {
                    codigo = "11" + copia2.get(b).codigo + "110";//codificamos el cuarto byte de la instruccion en binario
                    main.lista2.add(new instruccion("dd " + "cb " + cadena3+ " " + Integer.toHexString(Integer.parseInt(codigo, 2)), 4));
                    break;
                }
            }

        }
    }

    public static void REGEX7(String cadena) {//PARA SET b,(iy+d)
        String cadena2;
        String codigo;
        int b;

        final String regex = "^SET [0-7],(\\(IY\\+(1?[0-2][0-7]|[0-9][0-9]?)\\))$";
        final String string = cadena;

        final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(string);
        if (matcher.find()) {
            cadena2 = cadena.split(" ")[1];//NOS QUEDAMOS SOLO CON b,r
            cadena = cadena2.split(",")[0];//cadena sera b
            String cadena3 = cadena2.split(",")[1];//cadena3 sera (Iy+d)
            cadena3 = cadena3.split("\\+")[1];
            //System.out.println(cadena3);
            //para quitar los parenteis 
            cadena3 = cadena3.replace(")", "");
            //System.out.println(cadena3);
            cadena3 = Integer.toHexString(Integer.parseInt(cadena3));//convertinos d en hexadecimal
            //cadena3=Integer.toHexString(v);
            //System.out.println(cadena3);
            List<registros> copia2 = clistare.crear2();
            //List<registros> copia=clistare.crear();//esto es para 

            for (b = 0; b <= copia2.size() - 1; b++) {
                if (copia2.get(b).registro.equals(cadena)) {
                    codigo = "11" + copia2.get(b).codigo + "110";//codificamos el cuarto byte de la instruccion en binario
                    main.lista2.add(new instruccion("fd " + "cb " + cadena3+" " + Integer.toHexString(Integer.parseInt(codigo, 2)), 4));
                    break;
                }
            }

        }
    }

    public static void REGEX8(String cadena) {//PARA RES B,R
        String cadena2;
        String codigo;
        int b;
        int i;
        final String regex = "^(RES [0-7],([A-E]|[H-L]))$";
        final String regex2 = "RES [0-7],(\\(HL\\)|\\(IX\\+(1?[0-2][0-7]|[0-9][0-9]?)\\)|\\(IY\\+(1?[0-2][0-7]|[0-9][0-9]?)\\))";
        final String string = cadena;

        final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
        final Pattern pattern2 = Pattern.compile(regex2, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(string);
        final Matcher matcher2 = pattern2.matcher(string);
        if (matcher.find()) {
            cadena2 = cadena.split(" ")[1];//NOS QUEDAMOS SOLO CON b,r
            cadena = cadena2.split(",")[0];//cadena sera b
            String cadena3 = cadena2.split(",")[1];//cadena3 sera r
            //int v=Integer.parseInt(cadena3);
            //cadena3=Integer.toHexString(v);
            //System.out.println(cadena3);
            List<registros> copia2 = clistare.crear2();
            List<registros> copia = clistare.crear();//esto es para 
            for (i = 0; i <= copia.size() - 1; i++) {
                if (copia.get(i).registro.equals(cadena3)) {
                    break;
                }
            }
            for (b = 0; b <= copia2.size() - 1; b++) {
                if (copia2.get(b).registro.equals(cadena)) {
                    codigo = "10" + copia2.get(b).codigo + copia.get(i).codigo;
                    main.lista2.add(new instruccion("cb "+Integer.toHexString(Integer.parseInt(codigo, 2)), 2));
                    break;
                }
            }

        } else if (matcher2.find()) {
            cadena2 = cadena.split(" ")[1];//NOS QUEDAMOS SOLO CON b,r
            cadena = cadena2.split(",")[0];//cadena sera b
            String cadena3 = cadena2.split(",")[1];//cadena3 sera (Iy+d)|(hl)|(ix+d)
            List<registros> copia2 = clistare.crear2();
            if (cadena3.equals("(HL)")) {
                for (b = 0; b <= copia2.size() - 1; b++) {
                    if (copia2.get(b).registro.equals(cadena)) {
                        codigo = "10" + copia2.get(b).codigo + "110";
                        main.lista2.add(new instruccion("cb " + Integer.toHexString(Integer.parseInt(codigo, 2)), 2));
                        break;
                    }

                }
            } else {
                cadena2 = cadena3.split("\\+")[0];//sera ix
                cadena3 = cadena3.split("\\+")[1];
                //System.out.println(cadena3);
                //para quitar los parenteis 
                cadena3 = cadena3.replace(")", "");
                cadena2 = cadena2.replace("(", "");
                //System.out.println(cadena3);
               // System.out.println(cadena2);
                cadena3 = Integer.toHexString(Integer.parseInt(cadena3));//convertinos d en hexadecimal
                //cadena3=Integer.toHexString(v);7

               // System.out.println(cadena3);
                if (cadena2.equals("IX")) {
                    List<registros> copia = clistare.crear2();//esto es para 
                    for (i = 0; i <= copia.size() - 1; i++) {
                        if (copia.get(i).registro.equals(cadena)) {
                            break;
                        }
                    }
                    codigo = "10" + copia.get(i).codigo + "110";
                    main.lista2.add(new instruccion("dd " + "cb " + cadena3+ " " + Integer.toHexString(Integer.parseInt(codigo, 2)), 4));
                }
                if (cadena2.equals("IY")) {
                    List<registros> copia = clistare.crear2();//esto es para 
                    for (i = 0; i <= copia.size() - 1; i++) {
                        if (copia.get(i).registro.equals(cadena)) {
                            break;
                        }
                    }
                    codigo = "10" + copia.get(i).codigo + "110";
                    main.lista2.add(new instruccion("fd " + "cb " + cadena3+" "+Integer.toHexString(Integer.parseInt(codigo, 2)), 4));
                }
            }
        }

    }
       public static void XORIY(String cadena) {
        String cadena2; 
        final String XorIY = "XOR A,(\\(IY\\+(1?[0-2][0-7]|[0-9][0-9]?)\\))";
        final String string = cadena;
        final Pattern pattern = Pattern.compile(XorIY, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(string);
            if (matcher.find()) {
            cadena2 = cadena.split(" ")[1];//NOS QUEDAMOS SOLO CON R,(IX+D)
            cadena = cadena2.split(",")[0];//cadena sera R
            String cadena3 = cadena2.split(",")[1];//cadena3 sera (IX+D)
            cadena3 = cadena3.split("\\+")[1];
            //System.out.println(cadena3);
            //para quitar los parenteis 
            cadena3 = cadena3.replace(")", "");
            //System.out.println(cadena3);
            cadena3 = Integer.toHexString(Integer.parseInt(cadena3));
            //cadena3=Integer.toHexString(v);
            //System.out.println(cadena3);
            List<registros> copia2 = clistare.crear();
            //List<registros> copia=clistare.crear();//esto es para 
            main.lista2.add(new instruccion(Integer.toHexString(Integer.parseInt("11111101", 2))+ " "+Integer.toHexString(Integer.parseInt("10101110", 2))+" "+ cadena3, 3));

        }
       }
    public static void JPNN(String cadena) {//para primera pasada
        final String regex = "^(JP [A-Za-z]+[0-9]*)$";
        final String string = cadena;
       // System.out.println(string);
        String nn;
        
        int i;
        final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(string);
       // System.out.println(string);
        if (matcher.find()){
            nn = cadena.split(" ")[1];
                      
                        main.lista2.add(new instruccion(null,3));
                        main.lista2.get(main.lista2.size()-1).memo=cadena;//nn no es valor porque nunca entro.
                       // main.lista3.add(new etiquetas(nn.split(" ")[0],null));
            }
        }
    public static void CALLNN(String cadena) {//para primera pasada
        final String regex = "^(CALL [A-Za-z]+[0-9]*)$";
        final String string = cadena;
       // System.out.println(string);
        String nn;
        
        int i;
        final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(string);
       // System.out.println(string);
        if (matcher.find()){
            nn = cadena.split(" ")[1];
      
                        main.lista2.add(new instruccion(null,3));
                        main.lista2.get(main.lista2.size()-1).memo=cadena;//nn no es valor porque nunca entro.
                       // main.lista3.add(new etiquetas(nn.split(" ")[0],null));
            }
        }
       
    
      public static void JPNN2(String cadena,int v) {//unicamente para segunda pasada 
        final String regex = "^(JP [A-Za-z]+[0-9]*)$";
        final String string = cadena;
       // System.out.println(string);
        String nn;
        
        int i;
        final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(string);
       // System.out.println(string);
        if (matcher.find()){
            
            nn = cadena.split(" ")[1];
            if (!main.lista3.isEmpty()) {
                for (i = 0; i <= main.lista3.size()-1; i++) {
                    if (main.lista3.get(i).nombre.equals(nn)) {
                        nn = main.lista3.get(i).valor;//nn ahora es el valor
                        nn=Integer.toHexString(Integer.parseInt(nn));
                        if (nn.length() == 3) {
                            main.lista2.get(v).ins="c3 " + nn.charAt(1) + nn.charAt(2) + " " + nn.charAt(0);

                        } else if (nn.length() == 2) {
                            main.lista2.get(v).ins="c3 " + nn.charAt(0) + nn.charAt(1) + " " + "00";

                        } else if (nn.length() == 1) {
                            main.lista2.get(v).ins="c3 " +"0"+ nn.charAt(0) + " " + "00";
                        } else if (nn.length() == 4) {

                            main.lista2.get(v).ins="c3 " + nn.substring(2, 4) + " " + nn.substring(0, 2);

                        }
                       break;
                    }
                  
                }
                
                
            }
    
        }
        else{
        }
    }
       public static void CALLNN2(String cadena,int v) {//unicamente para segunda pasada 
        final String regex = "^(CALL [A-Za-z]+[0-9]*)$";
        final String string = cadena;
       // System.out.println(string);
        String nn;
        
        int i;
        final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(string);
       // System.out.println(string);
        if (matcher.find()){
            
            nn = cadena.split(" ")[1];
            if (!main.lista3.isEmpty()) {
                for (i = 0; i <= main.lista3.size()-1; i++) {
                    if (main.lista3.get(i).nombre.equals(nn)) {
                        nn = main.lista3.get(i).valor;//nn ahora es el valor
                        nn=Integer.toHexString(Integer.parseInt(nn));

                        if (nn.length() == 3) {
                            main.lista2.get(v).ins="cd " + nn.charAt(1) + nn.charAt(2) + " " + nn.charAt(0);

                        } else if (nn.length() == 2) {
                            main.lista2.get(v).ins="cd " + nn.charAt(0) + nn.charAt(1) + " " + "00";

                        } else if (nn.length() == 1) {
                            main.lista2.get(v).ins="cd " +"0"+nn.charAt(0) + " " + "00";
                        } else if (nn.length() == 4) {

                            main.lista2.get(v).ins="cd " + nn.substring(2, 4) + " " + nn.substring(0, 2);

                        }
                       break;
                    }
                  
                }
                
                
            }
    
        }
        else{
        }
    }
      public static void JRE(String cadena) {//para primera pasada
        
          final String regex = "^(JR [A-Za-z-0-9]+)$";
        final String string = cadena;
       // System.out.println(string);
        String nn;
        String valorh;
        int i;
        int valor;
         
        final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(string);
       // System.out.println(string);
        if (matcher.find()){
            nn = cadena.split(" ")[1];//NN SERA E
        
           
                        main.lista2.add(new instruccion(null,2));
                        main.lista2.get(main.lista2.size()-1).memo=cadena;//nn no es valor porque nunca entro.
                       // main.lista3.add(new etiquetas(nn.split(" ")[0],null));
            
        }
        
    }
        public static void JRE2(String cadena,int b) {//unicamente para segunda pasada 
        final String regex = "^(JR [A-Za-z-0-9]+)$";
        final String string = cadena;
        int valor;
        String valorh;
       
        String nn;
        
        int i;
        final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(string);
       
        if (matcher.find()){
            nn = cadena.split(" ")[1];
            if (!main.lista3.isEmpty()) {
                for (i = 0; i <= main.lista3.size()-1; i++) {
                    if (main.lista3.get(i).nombre.equals(nn)) {
                       //nn ahora es el valor
                    nn = main.lista3.get(i).valor;//nn ahora es el valor DE E
                    //nn=Integer.toHexString(Integer.parseInt(nn));
                        
                        valor=Integer.parseInt(nn);
                        
                        valor=valor+(-1*(main.lista2.get(b).contador+2));
                        valorh=Integer.toHexString(valor);
                         if(valor<=129&&valor>=-126){
                        if(valorh.length()>1){
                        main.lista2.get(b).ins="18 "+valorh.charAt(valorh.length()-2) + valorh.charAt(valorh.length()-1);
                        }
                        else{
                         main.lista2.get(b).ins="18 "+"0"+valorh.charAt(0);
                        }
                        break;
                         }else{
                         main.lista2.get(b).ins="error";
                           main.errores.add(new instruccion("Desbordamiento del salto ralativo "+cadena));
                         }
                    }
                  
                }
                
                
            }
            
    
        }
      
    }
      public static void JRCE(String cadena) {//para primera pasada
        
          final String regex = "^(JR C,[A-Za-z0-9]+)$";
        final String string = cadena;
       
       
        final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(string);
       
         
        if (matcher.find()){
           /// nn = cadena.split(" ")[1];//NN SERA E

                      
                        main.lista2.add(new instruccion(null,2));
                        main.lista2.get(main.lista2.size()-1).memo=cadena;
                       
            
        }
        
    }
         public static void JCE2(String cadena,int b) {//unicamente para segunda pasada 
        final String regex = "^(JR C,[A-Za-z0-9]+)$";
        final String string = cadena;
        int valor;
        String valorh;
       
        String nn;
        
        int i;
        final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(string);
       
        if (matcher.find()){
            nn = cadena.split(" ")[1];
           
            
            nn=nn.split("\\,")[1];
           
            if (!main.lista3.isEmpty()) {
                for (i = 0; i <= main.lista3.size()-1; i++) {
                    if (main.lista3.get(i).nombre.equals(nn)) {
                       //nn ahora es el valor
                    nn = main.lista3.get(i).valor;//nn ahora es el valor DE E
                    //nn=Integer.toHexString(Integer.parseInt(nn));
                        
                        valor=Integer.parseInt(nn);
                        
                        valor=valor+(-1*(main.lista2.get(b).contador+2));
                        valorh=Integer.toHexString(valor);
                        if(valor<=129&&valor>=-126){
                        if(valorh.length()>1){
                        main.lista2.get(b).ins="38 "+valorh.charAt(valorh.length()-2) + valorh.charAt(valorh.length()-1);
                        }
                        else{
                         main.lista2.get(b).ins="38 "+"0"+valorh.charAt(0);
                        }
                        break;
                        }
                        else{
                            main.lista2.get(b).ins="error";
                           main.errores.add(new instruccion("Desbordamiento del salto ralativo "+cadena));
                        }
                    }
                  
                }
                
                
            }
    
        }
      
    }
            public static void JRNZE(String cadena) {//para primera pasada
        
          final String regex = "^(JR NZ,[A-Za-z0-9]+)$";
        final String string = cadena;
       
        String nn;
        String valorh;
        int i;
        int valor;
         
        final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(string);
 
         
        if (matcher.find()){
         

                      
                        main.lista2.add(new instruccion(null,2));
                        main.lista2.get(main.lista2.size()-1).memo=cadena;
                       
            
        }
        
    }
       public static void JNZE2(String cadena,int b) {//unicamente para segunda pasada 
        final String regex = "^(JR NZ,[A-Za-z0-9]+)$";
        final String string = cadena;
        int valor;
        String valorh;
       // System.out.println(string);
        String nn;
        
        int i;
        final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(string);
     
        if (matcher.find()){
            nn = cadena.split(" ")[1];
            
            
            nn=nn.split("\\,")[1];
            
            if (!main.lista3.isEmpty()) {
                for (i = 0; i <= main.lista3.size()-1; i++) {
                   
                    if (main.lista3.get(i).nombre.equals(nn)) {
                       //nn ahora es el valor
                    nn = main.lista3.get(i).valor;//nn ahora es el valor DE E
                    //nn=Integer.toHexString(Integer.parseInt(nn));
                        
                        valor=Integer.parseInt(nn);
                        
                        valor=valor+(-1*(main.lista2.get(b).contador+2));
                       
                        valorh=Integer.toHexString(valor);
                        if(valor<=129&&valor>=-126){
                        if(valorh.length()>1){
                        main.lista2.get(b).ins="20 "+valorh.charAt(valorh.length()-2) + valorh.charAt(valorh.length()-1);
                        }
                        else{
                         main.lista2.get(b).ins="20 "+"0"+valorh.charAt(0);
                        }
                        break;
                        }
                        else{
                            main.lista2.get(b).ins="error";
                            main.errores.add(new instruccion("Desbordamiento del salto ralativo "+cadena));
                        }
                    }
                  
                }
                
                
            }
    
        }
      
    }
        public static void JRZE(String cadena) {//para primera pasada
        
          final String regex = "^(JR Z,[A-Za-z0-9]+)$";
        final String string = cadena;
       // System.out.println(string);
        String nn;
        String valorh;
        int i;
        int valor;
         
        final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(string);
       // System.out.println(string);
         
        if (matcher.find()){
           /// nn = cadena.split(" ")[1];//NN SERA E

                      
                        main.lista2.add(new instruccion(null,2));
                        main.lista2.get(main.lista2.size()-1).memo=cadena;
                       
            
        }
        
    }
       public static void JRZE2(String cadena,int b) {//unicamente para segunda pasada 
        final String regex = "^(JR Z,[A-Za-z0-9]+)$";
        final String string = cadena;
        int valor;
        String valorh;
       // System.out.println(string);
        String nn;
        
        int i;
        final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(string);
       // System.out.println(string);
        if (matcher.find()){
            nn = cadena.split(" ")[1];
            
            
            nn=nn.split("\\,")[1];
            
            if (!main.lista3.isEmpty()) {
                for (i = 0; i <= main.lista3.size()-1; i++) {
                    if (main.lista3.get(i).nombre.equals(nn)) {
                       //nn ahora es el valor
                    nn = main.lista3.get(i).valor;//nn ahora es el valor DE E
                    //nn=Integer.toHexString(Integer.parseInt(nn));
                        
                        valor=Integer.parseInt(nn);
                        valor=valor+(-1*(main.lista2.get(b).contador+2));

                        valorh=Integer.toHexString(valor);
                         if(valor<=129&&valor>=-126){
                        if(valorh.length()>1){
                        main.lista2.get(b).ins="28 "+valorh.charAt(valorh.length()-2) + valorh.charAt(valorh.length()-1);
                        }
                        else{
                         main.lista2.get(b).ins="28 "+"0"+valorh.charAt(0);
                        }
                        break;
                         }
                         else{
                             main.lista2.get(b).ins="error";
                            main.errores.add(new instruccion("Desbordamiento del salto ralativo "+cadena));
                         }
                    }
                  
                }
                
                
            }
    
        }
      
    }
      public static void DJNZ(String cadena) {//para primera pasada
           
          final String regex = "^(DJNZ [A-Za-z0-9]+)$";
        final String string = cadena;
       // System.out.println(string);
        String nn;
        String valorh;
        int i;
        int valor;
         
        final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(string);
       // System.out.println(string);
         
        if (matcher.find()){
           /// nn = cadena.split(" ")[1];//NN SERA E

                      
                        main.lista2.add(new instruccion(null,2));
                        
                        main.lista2.get(main.lista2.size()-1).memo=cadena;
                       
                       
            
        }
        
    }
       public static void DJNZ2(String cadena,int b) {//unicamente para segunda pasada 
      
           final String regex = "^(DJNZ [A-Za-z0-9]+)$";
        final String string = cadena;
        int valor;
        String valorh;
       // System.out.println(string);
        String nn;
        
        int i;
        final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(string);
       // System.out.println(string);
        if (matcher.find()){
            nn = cadena.split(" ")[1];

            
            
           
            if (!main.lista3.isEmpty()) {
                for (i = 0; i <= main.lista3.size()-1; i++) {
                    if (main.lista3.get(i).nombre.equals(nn)) {
                       //nn ahora es el valor
                    nn = main.lista3.get(i).valor;//nn ahora es el valor DE E
                    nn=Integer.toHexString(Integer.parseInt(nn));
                        
                        valor=Integer.parseInt(nn);
                        
                        valor=valor+(-1*(main.lista2.get(b).contador+2));
                        valorh=Integer.toHexString(valor);
                            if(valor<=129&&valor>=-126){
                        if(valorh.length()>1){
                        main.lista2.get(b).ins="28 "+valorh.charAt(valorh.length()-2) + valorh.charAt(valorh.length()-1);
                        }
                        else{
                         main.lista2.get(b).ins="28 "+"0"+valorh.charAt(0);
                        }
                        break;
                         }
                         else{
                             main.lista2.get(b).ins="error";
                             main.errores.add(new instruccion("Desbordamiento del salto ralativo "+cadena));
                              }
                    
                    }
                  
                }
                
                
            }
    
        }
      
    }
          public static void JPNNCC(String cadena) {//para primera pasada
        final String regex = "^(JP (NZ|Z|NC|C|PO|PE|P|M),[A-Za-z0-9]+)$";
        
        final String string = cadena;
       // System.out.println(string);
  
             
       
        final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(string);
       // System.out.println(string);
       if (matcher.find()){
                      
                        main.lista2.add(new instruccion(null,3));
                        main.lista2.get(main.lista2.size()-1).memo=cadena;//nn no es valor porque nunca entro.
                       // main.lista3.add(new etiquetas(nn.split(" ")[0],null));
            }
        }
             public static void CALLNNCC(String cadena) {//para primera pasada
        final String regex = "^(CALL (NZ|Z|NC|C|PO|PE|P|M),[A-Za-z0-9]+)$";
        
        final String string = cadena;
       // System.out.println(string);
  
             
       
        final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(string);
       // System.out.println(string);
       if (matcher.find()){
       
                        main.lista2.add(new instruccion(null,3));
                        main.lista2.get(main.lista2.size()-1).memo=cadena;//nn no es valor porque nunca entro.
                       // main.lista3.add(new etiquetas(nn.split(" ")[0],null));
            }
        }
       
        
       
    
    public static void JPNNCC2(String cadena,int v) {//unicamente para segunda pasada 
        final String regex = "^(JP (NZ|Z|NC|C|PO|PE|P|M),[A-Za-z0-9]+)$";
        final String string = cadena;
        // System.out.println(string);
        String nn;
        String cc;
        String codigo=null;
         List<banderas> copia2 = banderas.crear3();
        int i;
        final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(string);
        // System.out.println(string);
        if (matcher.find()) {
            nn = cadena.split(" ")[1];
            nn = nn.split(",")[1];
            cc = cadena.split(",")[0];
            cc = cc.split(" ")[1];
             
              for(int b=0;b<=copia2.size()-1;b++){
                            if(copia2.get(b).bandera.equals(cc)){
                               codigo="11"+copia2.get(b).codigo+"010";
                               codigo=Integer.toHexString(Integer.parseInt(codigo, 2));
                               break;
                            }
                        
                        }
            if (!main.lista3.isEmpty()) {
                for (i = 0; i <= main.lista3.size() - 1; i++) {
                    if (main.lista3.get(i).nombre.equals(nn)) {
                        nn = main.lista3.get(i).valor;//nn ahora es el valor
                        nn=Integer.toHexString(Integer.parseInt(nn));
                        
                            
                                if (nn.length() == 3) {
                                    main.lista2.get(v).ins = codigo +" " + nn.charAt(1) + nn.charAt(2) + " " + nn.charAt(0);
                                    
                                } else if (nn.length() == 2) {
                                    main.lista2.get(v).ins = codigo + " "+ nn.charAt(0) + nn.charAt(1) + " " + "00";
                                    
                                } else if (nn.length() == 1) {
                                    main.lista2.get(v).ins = codigo + " "  +"0"+ nn.charAt(0) + " " + "00";
                                     
                                } else if (nn.length() == 4) {

                                     main.lista2.get(v).ins = codigo  + nn.substring(2, 4) + " " + nn.substring(0, 2);
                                     
                                }
                                break;
                            
                        
                        
                    }

                }

            }

        } 
    }
     public static void CALLNNCC2(String cadena,int v) {//unicamente para segunda pasada 
        final String regex = "^(CALL (NZ|Z|NC|C|PO|PE|P|M),[A-Za-z0-9])$";
        final String string = cadena;
        // System.out.println(string);
        String nn;
        String cc;
        String codigo=null;
         List<banderas> copia2 = banderas.crear3();
        int i;
        final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(string);
        // System.out.println(string);
        if (matcher.find()) {
            nn = cadena.split(" ")[1];
            nn = nn.split(",")[1];
            cc = cadena.split(",")[0];
            cc = cc.split(" ")[1];
              for(int b=0;b<=copia2.size()-1;b++){
                            if(copia2.get(b).bandera.equals(cc)){
                               codigo="11"+copia2.get(b).codigo+"100";
                               codigo=Integer.toHexString(Integer.parseInt(codigo, 2));
                               break;
                            }
                        
                        }
            if (!main.lista3.isEmpty()) {
                for (i = 0; i <= main.lista3.size() - 1; i++) {
                    if (main.lista3.get(i).nombre.equals(nn)) {
                        nn = main.lista3.get(i).valor;//nn ahora es el valor
                        nn=Integer.toHexString(Integer.parseInt(nn));
                        
                            
                                if (nn.length() == 3) {
                                    main.lista2.get(v).ins = codigo +" " + nn.charAt(1) + nn.charAt(2) + " " + nn.charAt(0);
                                    
                                } else if (nn.length() == 2) {
                                    main.lista2.get(v).ins = codigo + " "+ nn.charAt(0) + nn.charAt(1) + " " + "00";
                                    
                                } else if (nn.length() == 1) {
                                    main.lista2.get(v).ins = codigo + " "  + "0"+nn.charAt(0) + " " + "00";
                                     
                                } else if (nn.length() == 4) {

                                     main.lista2.get(v).ins = codigo  + nn.substring(2, 4) + " " + nn.substring(0, 2);
                                     
                                }
                                break;
                            
                        
                        
                    }

                }
                
            }

        } 
    }
          public static void DDNN(String cadena){
       List<registros> copia =clistare.crear3();
        String cadena2;
        String dd;
        final String regex2 =  "^(LD (BC|DE|HL|SP),((0|[1-9][0-9]{0,3}|[1-5][0-9]{4}|6[0-4][0-9]{3}|65[0-4][0-9]{2}|655[0-2][0-9]|6553[0-5])))$";//decimal
        final String regex ="^(LD (BC|DE|HL|SP),([0-9]([0-9]|[A-F]){0,3}H))$";//hexadecimal
        final String string = cadena;
        final Pattern pattern2 = Pattern.compile(regex2, Pattern.MULTILINE);
        final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(string);
        final Matcher matcher2 = pattern2.matcher(string);
            if (matcher.find()) {
            dd=cadena.split(" ")[1];
            dd=dd.split(",")[0];
            cadena2 = cadena.split(" ")[1];
            cadena = cadena2.split(",")[1];//(NN)
           // String cadena3 = cadena2.split(",")[1];//A
            cadena= cadena.replace("H", "");
            
            for(int i=0;i<=copia.size()-1;i++){
                if(dd.equals(copia.get(i).registro)){
                    dd="00"+copia.get(i).codigo+"0"+"001";
                    dd=Integer.toHexString(Integer.parseInt(dd, 2));
                   break;
                }
            
            }
            //para quitar los parenteis 
           // cadena = cadena.replace("(", "");
           // cadena = cadena.replace(")", "");
            //cadena3=new StringBuilder(cadena3).reverse().toString();
                //System.out.println("Estoy aca"+cadena3);
             
            //System.out.println(codigo);
            //System.out.println(Integer.toHexString(Integer.parseInt(codigo, 2)));
             if(cadena.length()==3){
               main.lista2.add(new instruccion(dd+" "+cadena.charAt(1)+cadena.charAt(2)+" "+ cadena.charAt(0), 3));
            
            }
             else  if(cadena.length()==2){
               main.lista2.add(new instruccion(dd+" "+cadena.charAt(0)+cadena.charAt(1)+" "+ "00", 3));
            
            }
             else if(cadena.length()==1){
               main.lista2.add(new instruccion(dd+" "+"0"+cadena.charAt(0)+" "+ "00", 3));
             }
             else if(cadena.length()==4){
             
             main.lista2.add(new instruccion(dd+" "+cadena.substring(2, 4)+" "+ cadena.substring(0, 2), 3));
             
             }
            
            //System.out.println(main.lista2.get(0).ins);

        }
        if (matcher2.find()) {
            dd=cadena.split(" ")[1];
            dd=dd.split(",")[0];
            
            cadena2 = cadena.split(" ")[1];
            cadena = cadena2.split(",")[1];//(NN)
           // String cadena3 = cadena2.split(",")[1];//A
            
            
            for(int i=0;i<=copia.size()-1;i++){
                if(dd.equals(copia.get(i).registro)){
                    dd="00"+copia.get(i).codigo+"0"+"001";
                    dd=Integer.toHexString(Integer.parseInt(dd, 2));
                   break;
                }
            
            }
         
         //   String cadena3 = cadena2.split(",")[1];//A
            
            
            //para quitar los parenteis 
           
        
          
            //cadena3=new StringBuilder(cadena3).reverse().toString();
                //System.out.println("Estoy aca"+cadena3);
                cadena=Integer.toHexString(Integer.parseInt(cadena));
              if(cadena.length()==3){
               main.lista2.add(new instruccion(dd+" "+cadena.charAt(1)+cadena.charAt(2)+" "+ cadena.charAt(0), 3));
            
            }
             else  if(cadena.length()==2){
               main.lista2.add(new instruccion(dd+" "+"0"+cadena.charAt(0)+cadena.charAt(1)+" "+ "00", 3));
            
            }
             else if(cadena.length()==1){
               main.lista2.add(new instruccion(dd+" "+"0"+cadena.charAt(0)+" "+ "00", 3));
             }
             else if(cadena.length()==4){
             
             main.lista2.add(new instruccion(dd+" "+cadena.substring(2, 4)+" "+ cadena.substring(0, 2), 3));
             
             }
            //System.out.println(codigo);
            //System.out.println(Integer.toHexString(Integer.parseInt(codigo, 2)));
            
            //System.out.println(main.lista2.get(0).ins);
        }
       
       } 
                  public static void IXNN(String cadena){
       List<registros> copia =clistare.crear3();
        String cadena2;
        String dd;
        final String regex2 =  "^(LD (IX),((0|[1-9][0-9]{0,3}|[1-5][0-9]{4}|6[0-4][0-9]{3}|65[0-4][0-9]{2}|655[0-2][0-9]|6553[0-5])))$";//decimal
        final String regex ="^(LD (IX),([0-9]([0-9]|[A-F]){0,3}H))$";//hexadecimal
        final String string = cadena;
        final Pattern pattern2 = Pattern.compile(regex2, Pattern.MULTILINE);
        final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(string);
        final Matcher matcher2 = pattern2.matcher(string);
            if (matcher.find()) {
            dd=cadena.split(" ")[1];
            dd=dd.split(",")[0];
            cadena2 = cadena.split(" ")[1];
            cadena = cadena2.split(",")[1];//(NN)
           // String cadena3 = cadena2.split(",")[1];//A
            cadena= cadena.replace("H", "");
            
            for(int i=0;i<=copia.size()-1;i++){
                if(dd.equals(copia.get(i).registro)){
                    dd="00"+copia.get(i).codigo+"0"+"001";
                    dd=Integer.toHexString(Integer.parseInt(dd, 2));
                   break;
                }
            
            }
            //para quitar los parenteis 
           // cadena = cadena.replace("(", "");
           // cadena = cadena.replace(")", "");
            //cadena3=new StringBuilder(cadena3).reverse().toString();
                //System.out.println("Estoy aca"+cadena3);
             
            //System.out.println(codigo);
            //System.out.println(Integer.toHexString(Integer.parseInt(codigo, 2)));
             if(cadena.length()==3){
               main.lista2.add(new instruccion("dd "+"21 "+cadena.charAt(1)+cadena.charAt(2)+" "+ cadena.charAt(0), 4));
            
            }
             else  if(cadena.length()==2){
               main.lista2.add(new instruccion("dd "+"21 "+cadena.charAt(0)+cadena.charAt(1)+" "+ "00", 4));
            
            }
             else if(cadena.length()==1){
               main.lista2.add(new instruccion("dd "+"21 "+"0"+cadena.charAt(0)+" "+ "00", 4));
             }
             else if(cadena.length()==4){
             
             main.lista2.add(new instruccion("dd "+"21 "+cadena.substring(2, 4)+" "+ cadena.substring(0, 2), 4));
             
             }
            
            //System.out.println(main.lista2.get(0).ins);

        }
        if (matcher2.find()) {
            dd=cadena.split(" ")[1];
            dd=dd.split(",")[0];
           
            cadena2 = cadena.split(" ")[1];
            cadena = cadena2.split(",")[1];//(NN)
           // String cadena3 = cadena2.split(",")[1];//A
            
            
            for(int i=0;i<=copia.size()-1;i++){
                if(dd.equals(copia.get(i).registro)){
                    dd="00"+copia.get(i).codigo+"0"+"001";
                    dd=Integer.toHexString(Integer.parseInt(dd, 2));
                   break;
                }
            
            }
         
         //   String cadena3 = cadena2.split(",")[1];//A
            
            
            //para quitar los parenteis 
           
        
          
            //cadena3=new StringBuilder(cadena3).reverse().toString();
                //System.out.println("Estoy aca"+cadena3);
                cadena=Integer.toHexString(Integer.parseInt(cadena));
              if(cadena.length()==3){
               main.lista2.add(new instruccion("dd "+"21 "+cadena.charAt(1)+cadena.charAt(2)+" "+ cadena.charAt(0), 4));
            
            }
             else  if(cadena.length()==2){
               main.lista2.add(new instruccion("dd "+"21 "+cadena.charAt(0)+cadena.charAt(1)+" "+ "00", 4));
            
            }
             else if(cadena.length()==1){
               main.lista2.add(new instruccion("dd "+"21 "+"0"+cadena.charAt(0)+" "+ "00", 4));
             }
             else if(cadena.length()==4){
             
             main.lista2.add(new instruccion("dd "+"21 "+cadena.substring(2, 4)+" "+ cadena.substring(0, 2), 4));
             
             }
            //System.out.println(codigo);
            //System.out.println(Integer.toHexString(Integer.parseInt(codigo, 2)));
            
            //System.out.println(main.lista2.get(0).ins);
        }
       
       } 
      public static void IYNN(String cadena){
     
        String cadena2;
        String dd;
        final String regex2 =  "^(LD (IY),((0|[1-9][0-9]{0,3}|[1-5][0-9]{4}|6[0-4][0-9]{3}|65[0-4][0-9]{2}|655[0-2][0-9]|6553[0-5])))$";//decimal
        final String regex ="^(LD (IY),([0-9]([0-9]|[A-F]){0,3}H))$";//hexadecimal
        final String string = cadena;
        final Pattern pattern2 = Pattern.compile(regex2, Pattern.MULTILINE);
        final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(string);
        final Matcher matcher2 = pattern2.matcher(string);
            if (matcher.find()) {
           
            cadena2 = cadena.split(" ")[1];
            cadena = cadena2.split(",")[1];//(NN)
           // String cadena3 = cadena2.split(",")[1];//A
            cadena= cadena.replace("H", "");
         
          
             if(cadena.length()==3){
               main.lista2.add(new instruccion("fd "+"21 "+cadena.charAt(1)+cadena.charAt(2)+" "+ cadena.charAt(0), 4));
            
            }
             else  if(cadena.length()==2){
               main.lista2.add(new instruccion("fd "+"21 "+cadena.charAt(0)+cadena.charAt(1)+" "+ "00", 4));
            
            }
             else if(cadena.length()==1){
               main.lista2.add(new instruccion("fd "+"21 "+"0"+cadena.charAt(0)+" "+ "00", 4));
             }
             else if(cadena.length()==4){
             
             main.lista2.add(new instruccion("fd "+"21 "+cadena.substring(2, 4)+" "+ cadena.substring(0, 2), 4));
             
             }
            
            //System.out.println(main.lista2.get(0).ins);

        }
        if (matcher2.find()) {
            dd=cadena.split(" ")[1];
            dd=dd.split(",")[0];
           
            cadena2 = cadena.split(" ")[1];
            cadena = cadena2.split(",")[1];//(NN)
           // String cadena3 = cadena2.split(",")[1];//A
            
            
         
         
                cadena=Integer.toHexString(Integer.parseInt(cadena));
              if(cadena.length()==3){
               main.lista2.add(new instruccion("fd "+"21 "+cadena.charAt(1)+cadena.charAt(2)+" "+ cadena.charAt(0), 4));
            
            }
             else  if(cadena.length()==2){
               main.lista2.add(new instruccion("fd "+"21 "+cadena.charAt(0)+cadena.charAt(1)+" "+ "00", 4));
            
            }
             else if(cadena.length()==1){
               main.lista2.add(new instruccion("fd "+"21 "+"0"+cadena.charAt(0)+" "+ "00", 4));
             }
             else if(cadena.length()==4){
             
             main.lista2.add(new instruccion("fd "+"21 "+cadena.substring(2, 4)+" "+ cadena.substring(0, 2), 4));
             
             }
            //System.out.println(codigo);
            //System.out.println(Integer.toHexString(Integer.parseInt(codigo, 2)));
            
            //System.out.println(main.lista2.get(0).ins);
        }
       
       } 
           public static void IYnn(String cadena){
     
        String cadena2;
        String dd;
        final String regex2 =  "^(LD (IY),(\\((0|[1-9][0-9]{0,3}|[1-5][0-9]{4}|6[0-4][0-9]{3}|65[0-4][0-9]{2}|655[0-2][0-9]|6553[0-5])\\)))$";//decimal
        final String regex ="^(LD (IY),(\\([0-9]([0-9]|[A-F]){0,3}H)\\))$";//hexadecimal
        final String string = cadena;
        final Pattern pattern2 = Pattern.compile(regex2, Pattern.MULTILINE);
        final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(string);
        final Matcher matcher2 = pattern2.matcher(string);
            if (matcher.find()) {
           
            cadena2 = cadena.split(" ")[1];
            cadena = cadena2.split(",")[1];//(NN)
           
           // String cadena3 = cadena2.split(",")[1];//A
            cadena= cadena.replace("H", "");
             cadena = cadena.replace("(", "");
            cadena = cadena.replace(")", "");
            
            //para quitar los parenteis 
           // cadena = cadena.replace("(", "");
           // cadena = cadena.replace(")", "");
            //cadena3=new StringBuilder(cadena3).reverse().toString();
                //System.out.println("Estoy aca"+cadena3);
             
            //System.out.println(codigo);
            //System.out.println(Integer.toHexString(Integer.parseInt(codigo, 2)));
             if(cadena.length()==3){
               main.lista2.add(new instruccion("fd "+"2a "+cadena.charAt(1)+cadena.charAt(2)+" "+ cadena.charAt(0), 4));
            
            }
             else  if(cadena.length()==2){
               main.lista2.add(new instruccion("fd "+"2a "+cadena.charAt(0)+cadena.charAt(1)+" "+ "00", 4));
            
            }
             else if(cadena.length()==1){
               main.lista2.add(new instruccion("fd "+"2a "+"0"+cadena.charAt(0)+" "+ "00", 4));
             }
             else if(cadena.length()==4){
             
             main.lista2.add(new instruccion("fd "+"2a "+cadena.substring(2, 4)+" "+ cadena.substring(0, 2), 4));
             
             }
            
            //System.out.println(main.lista2.get(0).ins);

        }
        if (matcher2.find()) {
            dd=cadena.split(" ")[1];
            dd=dd.split(",")[0];
            
            cadena2 = cadena.split(" ")[1];
            cadena = cadena2.split(",")[1];//(NN)
          
            
            cadena = cadena.replace("(", "");
            cadena = cadena.replace(")", "");
          
                cadena=Integer.toHexString(Integer.parseInt(cadena));
              if(cadena.length()==3){
               main.lista2.add(new instruccion("fd "+"2a "+cadena.charAt(1)+cadena.charAt(2)+" "+ cadena.charAt(0), 4));
            
            }
             else  if(cadena.length()==2){
               main.lista2.add(new instruccion("fd "+"2a "+cadena.charAt(0)+cadena.charAt(1)+" "+ "00", 4));
            
            }
             else if(cadena.length()==1){
               main.lista2.add(new instruccion("fd "+"2a "+"0"+cadena.charAt(0)+" "+ "00", 4));
             }
             else if(cadena.length()==4){
             
             main.lista2.add(new instruccion("fd "+"2a "+cadena.substring(2, 4)+" "+ cadena.substring(0, 2), 4));
             
             }
           
        }
       
       } 
      public static void IXnn(String cadena){
     
        String cadena2;
        String dd;
        final String regex2 =  "^(LD (IX),(\\((0|[1-9][0-9]{0,3}|[1-5][0-9]{4}|6[0-4][0-9]{3}|65[0-4][0-9]{2}|655[0-2][0-9]|6553[0-5])\\)))$";//decimal
        final String regex ="^(LD (IX),(\\([0-9]([0-9]|[A-F]){0,3}H)\\))$";//hexadecimal
        final String string = cadena;
        final Pattern pattern2 = Pattern.compile(regex2, Pattern.MULTILINE);
        final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(string);
        final Matcher matcher2 = pattern2.matcher(string);
            if (matcher.find()) {
           
            cadena2 = cadena.split(" ")[1];
            cadena = cadena2.split(",")[1];//(NN)
           
           // String cadena3 = cadena2.split(",")[1];//A
            cadena= cadena.replace("H", "");
             cadena = cadena.replace("(", "");
            cadena = cadena.replace(")", "");
            
            //para quitar los parenteis 
           // cadena = cadena.replace("(", "");
           // cadena = cadena.replace(")", "");
            //cadena3=new StringBuilder(cadena3).reverse().toString();
                //System.out.println("Estoy aca"+cadena3);
             
            //System.out.println(codigo);
            //System.out.println(Integer.toHexString(Integer.parseInt(codigo, 2)));
             if(cadena.length()==3){
               main.lista2.add(new instruccion("dd "+"2a "+cadena.charAt(1)+cadena.charAt(2)+" "+ cadena.charAt(0), 4));
            
            }
             else  if(cadena.length()==2){
               main.lista2.add(new instruccion("dd "+"2a "+cadena.charAt(0)+cadena.charAt(1)+" "+ "00", 4));
            
            }
             else if(cadena.length()==1){
               main.lista2.add(new instruccion("dd "+"2a "+"0"+cadena.charAt(0)+" "+ "00", 4));
             }
             else if(cadena.length()==4){
             
             main.lista2.add(new instruccion("dd "+"2a "+cadena.substring(2, 4)+" "+ cadena.substring(0, 2), 4));
             
             }
            
            //System.out.println(main.lista2.get(0).ins);

        }
        if (matcher2.find()) {
            dd=cadena.split(" ")[1];
            dd=dd.split(",")[0];
            
            cadena2 = cadena.split(" ")[1];
            cadena = cadena2.split(",")[1];//(NN)
          
            
            cadena = cadena.replace("(", "");
            cadena = cadena.replace(")", "");
          
                cadena=Integer.toHexString(Integer.parseInt(cadena));
              if(cadena.length()==3){
               main.lista2.add(new instruccion("dd "+"2a "+cadena.charAt(1)+cadena.charAt(2)+" "+ cadena.charAt(0), 4));
            
            }
             else  if(cadena.length()==2){
               main.lista2.add(new instruccion("dd "+"2a "+cadena.charAt(0)+cadena.charAt(1)+" "+ "00", 4));
            
            }
             else if(cadena.length()==1){
               main.lista2.add(new instruccion("dd "+"2a "+"0"+cadena.charAt(0)+" "+ "00", 4));
             }
             else if(cadena.length()==4){
             
             main.lista2.add(new instruccion("dd "+"2a "+cadena.substring(2, 4)+" "+ cadena.substring(0, 2), 4));
             
             }
           
        }
       
       } 
      
      public static void nnIX(String cadena){
     
        String cadena2;
        String dd;
        final String regex2 =  "^(LD (\\((0|[1-9][0-9]{0,3}|[1-5][0-9]{4}|6[0-4][0-9]{3}|65[0-4][0-9]{2}|655[0-2][0-9]|6553[0-5])\\)),(IX))$";//decimal
        final String regex ="^(LD (\\([0-9]([0-9]|[A-F]){0,3}H)\\),(IX))$";//hexadecimal
        final String string = cadena;
        final Pattern pattern2 = Pattern.compile(regex2, Pattern.MULTILINE);
        final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(string);
        final Matcher matcher2 = pattern2.matcher(string);
            if (matcher.find()) {
           
            cadena2 = cadena.split(" ")[1];
            cadena = cadena2.split(",")[0];//(NN)
           
           // String cadena3 = cadena2.split(",")[1];//A
            cadena= cadena.replace("H", "");
             cadena = cadena.replace("(", "");
            cadena = cadena.replace(")", "");
            
          
             if(cadena.length()==3){
               main.lista2.add(new instruccion("dd "+"22 "+cadena.charAt(1)+cadena.charAt(2)+" "+ cadena.charAt(0), 4));
            
            }
             else  if(cadena.length()==2){
               main.lista2.add(new instruccion("dd "+"22 "+cadena.charAt(0)+cadena.charAt(1)+" "+ "00", 4));
            
            }
             else if(cadena.length()==1){
               main.lista2.add(new instruccion("dd "+"22 "+"0"+cadena.charAt(0)+" "+ "00", 4));
             }
             else if(cadena.length()==4){
             
             main.lista2.add(new instruccion("dd "+"22 "+cadena.substring(2, 4)+" "+ cadena.substring(0, 2), 4));
             
             }
            
            //System.out.println(main.lista2.get(0).ins);

        }
        if (matcher2.find()) {
           
            cadena2 = cadena.split(" ")[1];
            cadena = cadena2.split(",")[0];//(NN)
          
            
            cadena = cadena.replace("(", "");
            cadena = cadena.replace(")", "");
          
                cadena=Integer.toHexString(Integer.parseInt(cadena));
              if(cadena.length()==3){
               main.lista2.add(new instruccion("dd "+"22 "+cadena.charAt(1)+cadena.charAt(2)+" "+ cadena.charAt(0), 4));
            
            }
             else  if(cadena.length()==2){
               main.lista2.add(new instruccion("dd "+"22 "+cadena.charAt(0)+cadena.charAt(1)+" "+ "00", 4));
            
            }
             else if(cadena.length()==1){
               main.lista2.add(new instruccion("dd "+"22 "+"0"+cadena.charAt(0)+" "+ "00", 4));
             }
             else if(cadena.length()==4){
             
             main.lista2.add(new instruccion("dd "+"22 "+cadena.substring(2, 4)+" "+ cadena.substring(0, 2), 4));
             
             }
           
        }
       
       }
      
       public static void nnIY(String cadena){
     
        String cadena2;
        String dd;
        final String regex2 =  "^(LD (\\((0|[1-9][0-9]{0,3}|[1-5][0-9]{4}|6[0-4][0-9]{3}|65[0-4][0-9]{2}|655[0-2][0-9]|6553[0-5])\\)),(IY))$";//decimal
        final String regex ="^(LD (\\([0-9]([0-9]|[A-F]){0,3}H)\\),(IY))$";//hexadecimal
        final String string = cadena;
        final Pattern pattern2 = Pattern.compile(regex2, Pattern.MULTILINE);
        final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(string);
        final Matcher matcher2 = pattern2.matcher(string);
            if (matcher.find()) {
           
            cadena2 = cadena.split(" ")[1];
            cadena = cadena2.split(",")[0];//(NN)
           
           // String cadena3 = cadena2.split(",")[1];//A
            cadena= cadena.replace("H", "");
             cadena = cadena.replace("(", "");
            cadena = cadena.replace(")", "");
            
          
             if(cadena.length()==3){
               main.lista2.add(new instruccion("fd "+"22 "+cadena.charAt(1)+cadena.charAt(2)+" "+ cadena.charAt(0), 4));
            
            }
             else  if(cadena.length()==2){
               main.lista2.add(new instruccion("fd "+"22 "+cadena.charAt(0)+cadena.charAt(1)+" "+ "00", 4));
            
            }
             else if(cadena.length()==1){
               main.lista2.add(new instruccion("fd "+"22 "+"0"+cadena.charAt(0)+" "+ "00", 4));
             }
             else if(cadena.length()==4){
             
             main.lista2.add(new instruccion("fd "+"22 "+cadena.substring(2, 4)+" "+ cadena.substring(0, 2), 4));
             
             }
            
            //System.out.println(main.lista2.get(0).ins);

        }
        if (matcher2.find()) {
           
            cadena2 = cadena.split(" ")[1];
            cadena = cadena2.split(",")[0];//(NN)
          
            
            cadena = cadena.replace("(", "");
            cadena = cadena.replace(")", "");
          
                cadena=Integer.toHexString(Integer.parseInt(cadena));
              if(cadena.length()==3){
               main.lista2.add(new instruccion("fd "+"22 "+cadena.charAt(1)+cadena.charAt(2)+" "+ cadena.charAt(0), 4));
            
            }
             else  if(cadena.length()==2){
               main.lista2.add(new instruccion("fd "+"22 "+cadena.charAt(0)+cadena.charAt(1)+" "+ "00", 4));
            
            }
             else if(cadena.length()==1){
               main.lista2.add(new instruccion("fd "+"22 "+"0"+cadena.charAt(0)+" "+ "00", 4));
             }
             else if(cadena.length()==4){
             
             main.lista2.add(new instruccion("fd "+"22 "+cadena.substring(2, 4)+" "+ cadena.substring(0, 2), 4));
             
             }
           
        }
       
       }
            public static void nnHL(String cadena){
     
        String cadena2;
     
        final String regex2 =  "^(LD (\\((0|[1-9][0-9]{0,3}|[1-5][0-9]{4}|6[0-4][0-9]{3}|65[0-4][0-9]{2}|655[0-2][0-9]|6553[0-5])\\)),(HL))$";//decimal
        final String regex ="^(LD (\\([0-9]([0-9]|[A-F]){0,3}H)\\),(HL))$";//hexadecimal
        final String string = cadena;
        final Pattern pattern2 = Pattern.compile(regex2, Pattern.MULTILINE);
        final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(string);
        final Matcher matcher2 = pattern2.matcher(string);
            if (matcher.find()) {
           
            cadena2 = cadena.split(" ")[1];
            cadena = cadena2.split(",")[0];//(NN)
           
           // String cadena3 = cadena2.split(",")[1];//A
            cadena= cadena.replace("H", "");
             cadena = cadena.replace("(", "");
            cadena = cadena.replace(")", "");
            
          
             if(cadena.length()==3){
               main.lista2.add(new instruccion("22 "+cadena.charAt(1)+cadena.charAt(2)+" "+ cadena.charAt(0), 3));
            
            }
             else  if(cadena.length()==2){
               main.lista2.add(new instruccion("22 "+"0"+cadena.charAt(0)+cadena.charAt(1)+" "+ "00", 3));
            
            }
             else if(cadena.length()==1){
               main.lista2.add(new instruccion("22 "+"0"+cadena.charAt(0)+" "+ "00", 3));
             }
             else if(cadena.length()==4){
             
             main.lista2.add(new instruccion("22 "+cadena.substring(2, 4)+" "+ cadena.substring(0, 2), 3));
             
             }
            
            //System.out.println(main.lista2.get(0).ins);

        }
        if (matcher2.find()) {
           
            cadena2 = cadena.split(" ")[1];
            cadena = cadena2.split(",")[0];//(NN)
          
            
            cadena = cadena.replace("(", "");
            cadena = cadena.replace(")", "");
          
                cadena=Integer.toHexString(Integer.parseInt(cadena));
              if(cadena.length()==3){
               main.lista2.add(new instruccion("22 "+cadena.charAt(1)+cadena.charAt(2)+" "+ cadena.charAt(0), 3));
            
            }
             else  if(cadena.length()==2){
               main.lista2.add(new instruccion("22 "+cadena.charAt(0)+cadena.charAt(1)+" "+ "00", 3));
            
            }
             else if(cadena.length()==1){
               main.lista2.add(new instruccion("22 "+"0"+cadena.charAt(0)+" "+ "00", 3));
             }
             else if(cadena.length()==4){
             
             main.lista2.add(new instruccion("22 "+cadena.substring(2, 4)+" "+ cadena.substring(0, 2), 3));
             
             }
           
        }
        
       
       }
       public static void HLnn(String cadena){
         
        String cadena2;
        String dd;
        final String regex2 =  "^(LD (HL),(\\((0|[1-9][0-9]{0,3}|[1-5][0-9]{4}|6[0-4][0-9]{3}|65[0-4][0-9]{2}|655[0-2][0-9]|6553[0-5])\\)))$";//decimal
        final String regex ="^(LD (HL),(\\([0-9]([0-9]|[A-F]){0,3}H)\\))$";//hexadecimal
        final String string = cadena;
        final Pattern pattern2 = Pattern.compile(regex2, Pattern.MULTILINE);
        final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(string);
        final Matcher matcher2 = pattern2.matcher(string);
            if (matcher.find()) {
                
            cadena2 = cadena.split(" ")[1];
            cadena = cadena2.split(",")[1];//(NN)
           
           // String cadena3 = cadena2.split(",")[1];//A
            cadena= cadena.replace("H", "");
             cadena = cadena.replace("(", "");
            cadena = cadena.replace(")", "");
            
            //para quitar los parenteis 
           // cadena = cadena.replace("(", "");
           // cadena = cadena.replace(")", "");
            //cadena3=new StringBuilder(cadena3).reverse().toString();
                //System.out.println("Estoy aca"+cadena3);
             
            //System.out.println(codigo);
            //System.out.println(Integer.toHexString(Integer.parseInt(codigo, 2)));
             if(cadena.length()==3){
               main.lista2.add(new instruccion("2a "+cadena.charAt(1)+cadena.charAt(2)+" "+ cadena.charAt(0), 3));
            
            }
             else  if(cadena.length()==2){
               main.lista2.add(new instruccion("2a "+cadena.charAt(0)+cadena.charAt(1)+" "+ "00", 3));
            
            }
             else if(cadena.length()==1){
               main.lista2.add(new instruccion("2a "+"0"+cadena.charAt(0)+" "+ "00", 3));
             }
             else if(cadena.length()==4){
             
             main.lista2.add(new instruccion("2a "+cadena.substring(2, 4)+" "+ cadena.substring(0, 2), 3));
             
             }
            
            //System.out.println(main.lista2.get(0).ins);

        }
        if (matcher2.find()) {
            dd=cadena.split(" ")[1];
            dd=dd.split(",")[0];
            
            cadena2 = cadena.split(" ")[1];
            cadena = cadena2.split(",")[1];//(NN)
          
            
            cadena = cadena.replace("(", "");
            cadena = cadena.replace(")", "");
          
                cadena=Integer.toHexString(Integer.parseInt(cadena));
              if(cadena.length()==3){
               main.lista2.add(new instruccion("2a "+cadena.charAt(1)+cadena.charAt(2)+" "+ cadena.charAt(0), 3));
            
            }
             else  if(cadena.length()==2){
               main.lista2.add(new instruccion("2a "+cadena.charAt(0)+cadena.charAt(1)+" "+ "00", 3));
            
            }
             else if(cadena.length()==1){
               main.lista2.add(new instruccion("2a "+"0"+cadena.charAt(0)+" "+ "00", 3));
             }
             else if(cadena.length()==4){
             
             main.lista2.add(new instruccion("2a "+cadena.substring(2, 4)+" "+ cadena.substring(0, 2), 3));
             
             }
           
        }
       
       } 
     public static void DDnn(String cadena){
       List<registros> copia =clistare.crear3();
        
        String cadena2;
        String dd;
        final String regex2 =  "^(LD (BC|DE|HL|SP) (\\((0|[1-9][0-9]{0,3}|[1-5][0-9]{4}|6[0-4][0-9]{3}|65[0-4][0-9]{2}|655[0-2][0-9]|6553[0-5])\\)))$";//decimal
        final String regex ="^(LD (BC|DE|HL|SP) (\\([0-9]([0-9]|[A-F]){0,3}H)\\))$";//hexadecimal
        final String string = cadena;
        final Pattern pattern2 = Pattern.compile(regex2, Pattern.MULTILINE);
        final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(string);
        final Matcher matcher2 = pattern2.matcher(string);
            if (matcher.find()) {
                
            dd=cadena.split(" ",2)[1];
            dd=dd.split(" ")[0];
            cadena2 = cadena.split(" ",2)[1];
            cadena = cadena2.split(" ")[1];//(NN)
           // String cadena3 = cadena2.split(",")[1];//A
            cadena= cadena.replace("H", "");
            
            for(int i=0;i<=copia.size()-1;i++){
                if(dd.equals(copia.get(i).registro)){
                    dd="01"+copia.get(i).codigo+"1"+"011";
                    dd=Integer.toHexString(Integer.parseInt(dd, 2));
                    
                   break;
                }
            
            }
                
          
             if(cadena.length()==3){
               main.lista2.add(new instruccion("ed "+dd+" "+cadena.charAt(1)+cadena.charAt(2)+" "+ cadena.charAt(0), 4));
            
            }
             else  if(cadena.length()==2){
               main.lista2.add(new instruccion("ed "+dd+" "+cadena.charAt(0)+cadena.charAt(1)+" "+ "00", 4));
            
            }
             else if(cadena.length()==1){
               main.lista2.add(new instruccion("ed "+dd+" "+"0"+cadena.charAt(0)+" "+ "00", 4));
             }
             else if(cadena.length()==4){
             
             main.lista2.add(new instruccion("ed "+dd+" "+cadena.substring(2, 4)+" "+ cadena.substring(0, 2), 4));
             
             }
            
            //System.out.println(main.lista2.get(0).ins);

        }
        if (matcher2.find()) {
            
            dd=cadena.split(" ",2)[1];
           
            dd=dd.split(" ",2)[0];
          
            cadena2 = cadena.split(" ",2)[1];
            cadena = cadena2.split(" ")[1];//(NN)
           // String cadena3 = cadena2.split(",")[1];//A
             cadena = cadena.replace("(", "");
            cadena = cadena.replace(")", "");
            
            for(int i=0;i<=copia.size()-1;i++){
                if(dd.equals(copia.get(i).registro)){
                    dd="01"+copia.get(i).codigo+"1"+"011";
                    dd=Integer.toHexString(Integer.parseInt(dd, 2));
                    
                   break;
                }
            
            }
       
         //   String cadena3 = cadena2.split(",")[1];//A
            
            
            //para quitar los parenteis 
           
        
          
            //cadena3=new StringBuilder(cadena3).reverse().toString();
                //System.out.println("Estoy aca"+cadena3);
                cadena=Integer.toHexString(Integer.parseInt(cadena));
              if(cadena.length()==3){
               main.lista2.add(new instruccion("ed "+dd+" "+cadena.charAt(1)+cadena.charAt(2)+" "+ cadena.charAt(0), 4));
            
            }
             else  if(cadena.length()==2){
               main.lista2.add(new instruccion("ed "+dd+cadena.charAt(0)+cadena.charAt(1)+" "+ "00", 4));
            
            }
             else if(cadena.length()==1){
               main.lista2.add(new instruccion("ed "+dd+ " "+"0"+cadena.charAt(0)+" "+ "00", 4));
             }
             else if(cadena.length()==4){
             
             main.lista2.add(new instruccion("ed "+dd+cadena.substring(2, 4)+" "+ cadena.substring(0, 2), 4));
             
             }
            
        }
       
       } 
          public static void nnDD(String cadena){
       List<registros> copia =clistare.crear3();
        
        String cadena2;
        String dd;
        final String regex2 =  "^(LD (\\((0|[1-9][0-9]{0,3}|[1-5][0-9]{4}|6[0-4][0-9]{3}|65[0-4][0-9]{2}|655[0-2][0-9]|6553[0-5])\\)) (BC|DE|HL|SP))$";//decimal
        final String regex ="^(LD (\\([0-9]([0-9]|[A-F]){0,3}H)\\) (BC|DE|HL|SP))$";//hexadecimal
        final String string = cadena;
        final Pattern pattern2 = Pattern.compile(regex2, Pattern.MULTILINE);
        final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(string);
        final Matcher matcher2 = pattern2.matcher(string);
            if (matcher.find()) {
               
            dd=cadena.split(" ",2)[1];
            dd=dd.split(" ")[1];
            cadena2 = cadena.split(" ",2)[1];
            cadena = cadena2.split(" ")[0];//(NN)
           // String cadena3 = cadena2.split(",")[1];//A
            cadena= cadena.replace("H", "");
            
            for(int i=0;i<=copia.size()-1;i++){
                if(dd.equals(copia.get(i).registro)){
                    dd="01"+copia.get(i).codigo+"0"+"011";
                    dd=Integer.toHexString(Integer.parseInt(dd, 2));
                    
                   break;
                }
            
            }
                
          
             if(cadena.length()==3){
               main.lista2.add(new instruccion("ed "+dd+" "+cadena.charAt(1)+cadena.charAt(2)+" "+ cadena.charAt(0), 4));
            
            }
             else  if(cadena.length()==2){
               main.lista2.add(new instruccion("ed "+dd+" "+cadena.charAt(0)+cadena.charAt(1)+" "+ "00", 4));
            
            }
             else if(cadena.length()==1){
               main.lista2.add(new instruccion("ed "+dd+" "+"0"+cadena.charAt(0)+" "+ "00", 4));
             }
             else if(cadena.length()==4){
             
             main.lista2.add(new instruccion("ed "+dd+" "+cadena.substring(2, 4)+" "+ cadena.substring(0, 2), 4));
             
             }
            
            //System.out.println(main.lista2.get(0).ins);

        }
        if (matcher2.find()) {
            
            dd=cadena.split(" ",2)[1];
           
            dd=dd.split(" ",2)[1];
          
            cadena2 = cadena.split(" ",2)[1];
            cadena = cadena2.split(" ")[0];//(NN)
           // String cadena3 = cadena2.split(",")[1];//A
             cadena = cadena.replace("(", "");
            cadena = cadena.replace(")", "");
            
            for(int i=0;i<=copia.size()-1;i++){
                if(dd.equals(copia.get(i).registro)){
                    dd="01"+copia.get(i).codigo+"0"+"011";
                    dd=Integer.toHexString(Integer.parseInt(dd, 2));
                   
                   break;
                }
            
            }
        
         //   String cadena3 = cadena2.split(",")[1];//A
            
            
            //para quitar los parenteis 
           
        
          
            //cadena3=new StringBuilder(cadena3).reverse().toString();
                //System.out.println("Estoy aca"+cadena3);
                cadena=Integer.toHexString(Integer.parseInt(cadena));
              if(cadena.length()==3){
               main.lista2.add(new instruccion("ed "+dd+" "+cadena.charAt(1)+cadena.charAt(2)+" "+ cadena.charAt(0), 4));
            
            }
             else  if(cadena.length()==2){
               main.lista2.add(new instruccion("ed "+dd+cadena.charAt(0)+cadena.charAt(1)+" "+ "00", 4));
            
            }
             else if(cadena.length()==1){
               main.lista2.add(new instruccion("ed "+dd+ " "+"0"+cadena.charAt(0)+" "+ "00", 4));
             }
             else if(cadena.length()==4){
             
             main.lista2.add(new instruccion("ed "+dd+cadena.substring(2, 4)+" "+ cadena.substring(0, 2), 4));
             
             }
            
        }
        
       
       } 
   public static void A_3_1(String cadena){
    String codigo;
    String Hexa;
    final String Mnemonico="EX DE,HL";
    final String string = cadena;
    final Pattern pattern2 = Pattern.compile(Mnemonico, Pattern.MULTILINE);
    final Matcher matcher2 = pattern2.matcher(string);
    
    if(matcher2.find()){
    codigo="11101011";
    Hexa = Integer.toHexString(Integer.parseInt(codigo, 2));
    main.lista2.add(new instruccion(Integer.toHexString(Integer.parseInt(codigo, 2)),1));
    }
    
   }
    public static void A_3_2(String cadena){
    String codigo;
    String Hexa;
    final String Mnemonico="EX AF,AF'";
    final String string = cadena;
    final Pattern pattern2 = Pattern.compile(Mnemonico, Pattern.MULTILINE);
    final Matcher matcher2 = pattern2.matcher(string);
    
    if(matcher2.find()){
    codigo="00001000";
    Hexa = Integer.toHexString(Integer.parseInt(codigo, 2));
    main.lista2.add(new instruccion(Integer.toHexString(Integer.parseInt(codigo, 2)),1));
    }
    
   }
    public static void A_3_3(String cadena){
    String codigo;
    String Hexa;
    final String Mnemonico="EXX";
    final String string = cadena;
    final Pattern pattern2 = Pattern.compile(Mnemonico, Pattern.MULTILINE);
    final Matcher matcher2 = pattern2.matcher(string);
    
    if(matcher2.find()){
    codigo="11011001";
    Hexa = Integer.toHexString(Integer.parseInt(codigo, 2));
    main.lista2.add(new instruccion(Integer.toHexString(Integer.parseInt(codigo, 2)),1));
    }
    
   }
    public static void A_3_4(String cadena){
    String codigo;
    String Hexa;
    final String Mnemonico= "EX \\(\\SP\\)\\,HL";
    final String string = cadena;
    final Pattern pattern2 = Pattern.compile(Mnemonico, Pattern.MULTILINE);
    final Matcher matcher2 = pattern2.matcher(string);
    
    if(matcher2.find()){
    codigo="11100011";
    Hexa = Integer.toHexString(Integer.parseInt(codigo, 2));
    main.lista2.add(new instruccion(Integer.toHexString(Integer.parseInt(codigo, 2)),1));
    }
    
   }
    public static void A_3_5(String cadena){
    String codigo;
    String Hexa;
    final String Mnemonico="EX \\(\\SP\\)\\,IX";
    final String string = cadena;
    final Pattern pattern2 = Pattern.compile(Mnemonico, Pattern.MULTILINE);
    final Matcher matcher2 = pattern2.matcher(string);
    
    if(matcher2.find()){
    codigo="1101110111100011";
    Hexa = Integer.toHexString(Integer.parseInt(codigo, 2));
    main.lista2.add(new instruccion(Integer.toHexString(Integer.parseInt(codigo, 2)),2));
    }
    
   }
    public static void A_3_6(String cadena){
    String codigo;
    String Hexa;
    final String Mnemonico="EX \\(\\SP\\)\\,IY";
    final String string = cadena;
    final Pattern pattern2 = Pattern.compile(Mnemonico, Pattern.MULTILINE);
    final Matcher matcher2 = pattern2.matcher(string);
    
    if(matcher2.find()){
    codigo="1111110111100011";
    Hexa = Integer.toHexString(Integer.parseInt(codigo, 2));
    main.lista2.add(new instruccion(Integer.toHexString(Integer.parseInt(codigo, 2)),2));
    }
   }
    public static void A_3_7(String cadena){
    String codigo;
    String Hexa;
    final String Mnemonico="LDI";
    final String string = cadena;
    final Pattern pattern2 = Pattern.compile(Mnemonico, Pattern.MULTILINE);
    final Matcher matcher2 = pattern2.matcher(string);
    
    if(matcher2.find()){
        if(cadena.length() == 4){
        codigo="1110110110110000";
        }else{
            codigo="1110110110100000";
        }
    Hexa = Integer.toHexString(Integer.parseInt(codigo, 2));
    main.lista2.add(new instruccion(Integer.toHexString(Integer.parseInt(codigo, 2)),2));
        System.out.println("");
    }
   }
    public static void A_3_9(String cadena){
    String codigo;
    String Hexa;
    final String Mnemonico="LDD";
    final String string = cadena;
    final Pattern pattern2 = Pattern.compile(Mnemonico, Pattern.MULTILINE);
    final Matcher matcher2 = pattern2.matcher(string);
    
    if(matcher2.find()){
        if(cadena.length() == 4){
        codigo="1110110110111000";
        }else{
            codigo="1110110110101000";
        }
    Hexa = Integer.toHexString(Integer.parseInt(codigo, 2));
    main.lista2.add(new instruccion(Integer.toHexString(Integer.parseInt(codigo, 2)),2));
    }
    
   }
    public static void A_3_11(String cadena){
    String codigo;
    String Hexa;
    final String Mnemonico="CPI";
    final String string = cadena;
    final Pattern pattern2 = Pattern.compile(Mnemonico, Pattern.MULTILINE);
    final Matcher matcher2 = pattern2.matcher(string);
    
    if(matcher2.find()){
        if(cadena.length() == 4){
        codigo="1110110110110001";
        }else{
            codigo="1110110110100001";
        }
    
    Hexa = Integer.toHexString(Integer.parseInt(codigo, 2));
    main.lista2.add(new instruccion(Integer.toHexString(Integer.parseInt(codigo, 2)),2));
    }
    
   }
 
    
    public static void A_3_13(String cadena){
    String codigo;
    String Hexa;
    final String Mnemonico="CPD";
    final String string = cadena;
    final Pattern pattern2 = Pattern.compile(Mnemonico, Pattern.MULTILINE);
    final Matcher matcher2 = pattern2.matcher(string);
    
    if(matcher2.find()){
        if(cadena.length() == 4){
        codigo="1110110110111001";
        }else{
            codigo="1110110110101001";
        }
    
    Hexa = Integer.toHexString(Integer.parseInt(codigo, 2));
    main.lista2.add(new instruccion(Integer.toHexString(Integer.parseInt(codigo, 2)),2));
    }
    
   }
     public static void A_6_1(String cadena){
    int i;
    String codigo;
    String Hexa;
    String cadena2;
    final String Mnemonico="^(ADD (HL),(BC|DE|HL|SP))$";
    final String string = cadena;
    final Pattern pattern2 = Pattern.compile(Mnemonico, Pattern.MULTILINE);
    final Matcher matcher2 = pattern2.matcher(string);
    
    if(matcher2.find()){
    cadena2=cadena.split(" ")[1];
    String cadena3=cadena2.split(",")[1];
    List<registros> copia=clistaress.crear();
    for(i=0;i<copia.size()-1;i++){
        if(copia.get(i).registro.equals(cadena3)){
            break;
            }

    }
    codigo="00"+clistaress.listar.get(i).codigo+"1001";
    Hexa = Integer.toHexString(Integer.parseInt(codigo, 2));
    main.lista2.add(new instruccion(Integer.toHexString(Integer.parseInt(codigo, 2)),1));
    }
    
   }
    public static void A_6_2(String cadena){
    int i;
    String codigo;
    String Hexa;
    String cadena2;
    final String Mnemonico="^(ADC (HL),(BC|DE|HL|SP))$";
    final String string = cadena;
    final Pattern pattern2 = Pattern.compile(Mnemonico, Pattern.MULTILINE);
    final Matcher matcher2 = pattern2.matcher(string);
    
    if(matcher2.find()){
    cadena2=cadena.split(" ")[1];
    String cadena3=cadena2.split(",")[1];
    List<registros> copia=clistaress.crear();
    for(i=0;i<copia.size()-1;i++){
        if(copia.get(i).registro.equals(cadena3)){
            break;
            }

    }
    
    codigo="1110110101"+clistaress.listar.get(i).codigo+"1010";
    Hexa = Integer.toHexString(Integer.parseInt(codigo, 2));
    main.lista2.add(new instruccion(Integer.toHexString(Integer.parseInt(codigo, 2)),2));
    }
    
   }
    public static void A_6_3(String cadena){
    int i;
    String codigo;
    String Hexa;
    String cadena2;
    final String Mnemonico="^(SBC (HL),(BC|DE|HL|SP))$";
    final String string = cadena;
    final Pattern pattern2 = Pattern.compile(Mnemonico, Pattern.MULTILINE);
    final Matcher matcher2 = pattern2.matcher(string);
    
    if(matcher2.find()){
    cadena2=cadena.split(" ")[1];
    String cadena3=cadena2.split(",")[1];
    List<registros> copia=clistaress.crear();
    for(i=0;i<copia.size()-1;i++){
        if(copia.get(i).registro.equals(cadena3)){
            break;
            }

    }
    codigo="1110110101"+clistaress.listar.get(i).codigo+"0010";
    Hexa = Integer.toHexString(Integer.parseInt(codigo, 2));
    main.lista2.add(new instruccion(Integer.toHexString(Integer.parseInt(codigo, 2)),2));
    }
    
   }
    public static void A_6_4(String cadena){
    int i;
    String codigo;
    String Hexa;
    String cadena2;
    final String Mnemonico="^(ADD (IX),(BC|DE|IX|SP))$";
    final String string = cadena;
    final Pattern pattern2 = Pattern.compile(Mnemonico, Pattern.MULTILINE);
    final Matcher matcher2 = pattern2.matcher(string);
    if(matcher2.find()){
    cadena2=cadena.split(" ")[1];
    String cadena3=cadena2.split(",")[1];
    List<registros> copia=clistarepp.crear();
    for(i=0;i<copia.size()-1;i++){
        if(copia.get(i).registro.equals(cadena3)){
            break;
            }

    }
    codigo="1101110100"+clistarepp.listar.get(i).codigo+"1001";
    Hexa = Integer.toHexString(Integer.parseInt(codigo, 2));
    main.lista2.add(new instruccion(Integer.toHexString(Integer.parseInt(codigo, 2)),2));
    }
    
   }
    public static void A_6_5(String cadena){
    int i;
    String codigo;
    String Hexa;
    String cadena2;
    final String Mnemonico="^(ADD (IY),(BC|DE|IY|SP))$";
    final String string = cadena;
    final Pattern pattern2 = Pattern.compile(Mnemonico, Pattern.MULTILINE);
    final Matcher matcher2 = pattern2.matcher(string);
    
    if(matcher2.find()){
    cadena2=cadena.split(" ")[1];
    String cadena3=cadena2.split(",")[1];
    List<registros> copia=clistarerr.crear();
    for(i=0;i<copia.size()-1;i++){
        if(copia.get(i).registro.equals(cadena3)){
            break;
            }

    }

    codigo="1111110100"+clistarerr.listar.get(i).codigo+"1001";
    Hexa = Integer.toHexString(Integer.parseInt(codigo, 2));
    main.lista2.add(new instruccion(Integer.toHexString(Integer.parseInt(codigo, 2)),2));
    }
    
   }
    public static void A_6_6(String cadena){
    int i;
    String codigo;
    String Hexa;
    String cadena2;
    final String Mnemonico="^(INC (BC|DE|HL|SP))$";
    final String string = cadena;
    final Pattern pattern2 = Pattern.compile(Mnemonico, Pattern.MULTILINE);
    final Matcher matcher2 = pattern2.matcher(string);
    
    if(matcher2.find()){
    cadena2=cadena.split(" ")[1];
    List<registros> copia=clistaress.crear();
    for(i=0;i<copia.size()-1;i++){
        if(copia.get(i).registro.equals(cadena2)){
            break;
            }

    }
    codigo="00"+clistaress.listar.get(i).codigo+"0011";
    Hexa = Integer.toHexString(Integer.parseInt(codigo, 2));
    main.lista2.add(new instruccion(Integer.toHexString(Integer.parseInt(codigo, 2)),1));
    }
    
   }
    public static void A_6_7(String cadena){
    String codigo;
    String Hexa;
    final String Mnemonico="^(INC (IX))$";
    final String string = cadena;
    final Pattern pattern2 = Pattern.compile(Mnemonico, Pattern.MULTILINE);
    final Matcher matcher2 = pattern2.matcher(string);
    
    if(matcher2.find()){
    codigo="1101110100100011";
    Hexa = Integer.toHexString(Integer.parseInt(codigo, 2));
    main.lista2.add(new instruccion(Integer.toHexString(Integer.parseInt(codigo, 2)),2));
    }
    
   }
    public static void A_6_8(String cadena){
    String codigo;
    String Hexa;
    final String Mnemonico="^(INC (IY))$";
    final String string = cadena;
    final Pattern pattern2 = Pattern.compile(Mnemonico, Pattern.MULTILINE);
    final Matcher matcher2 = pattern2.matcher(string);
    if(matcher2.find()){
    codigo="1111110100100011";
    Hexa = Integer.toHexString(Integer.parseInt(codigo, 2));
    main.lista2.add(new instruccion(Integer.toHexString(Integer.parseInt(codigo, 2)),2));
    }
    
   }
    public static void A_6_9(String cadena){
    int i;
    String codigo;
    String cadena2;
    final String Mnemonico="^(DEC (BC|DE|HL|SP))$";
    final String string = cadena;
    final Pattern pattern2 = Pattern.compile(Mnemonico, Pattern.MULTILINE);
    final Matcher matcher2 = pattern2.matcher(string);
    if(matcher2.find()){
    cadena2=cadena.split(" ")[1];
    List<registros> copia=clistaress.crear();
    for(i=0;i<=copia.size()-1;i++){
        if(copia.get(i).registro.equals(cadena2)){
            break;
            }

    }
    codigo="00"+clistaress.listar.get(i).codigo+"1011";
    String Hexa;
    Hexa = Integer.toHexString(Integer.parseInt(codigo, 2));
    main.lista2.add(new instruccion(Hexa,1));
    }
    
   }
    public static void A_6_10(String cadena){
    String codigo;
    String Hexa;
    final String Mnemonico="^(DEC (IX))$";
    final String string = cadena;
    final Pattern pattern2 = Pattern.compile(Mnemonico, Pattern.MULTILINE);
    final Matcher matcher2 = pattern2.matcher(string);
    if(matcher2.find()){
    codigo="1101110100101011";
    Hexa = Integer.toHexString(Integer.parseInt(codigo, 2));
    main.lista2.add(new instruccion(Integer.toHexString(Integer.parseInt(codigo, 2)),2));
    }
    
   }
    public static void A_6_11(String cadena){
    String codigo;
    String Hexa;
    final String Mnemonico="^(DEC (IY))$";
    final String string = cadena;
    final Pattern pattern2 = Pattern.compile(Mnemonico, Pattern.MULTILINE);
    final Matcher matcher2 = pattern2.matcher(string);
    if(matcher2.find()){
    codigo="1111110100101011";
    Hexa = Integer.toHexString(Integer.parseInt(codigo, 2));
    main.lista2.add(new instruccion(Integer.toHexString(Integer.parseInt(codigo, 2)),2));
    }
   }
     public static void RLCIX(String cadena) {
        String cadena2;
        final String RLCIX = "^((RLC) (\\(IX\\+(1?[0-2][0-7]|[0-9][0-9]?)\\)))$";
        final String string = cadena;
        final Pattern pattern = Pattern.compile(RLCIX, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(string);
            if (matcher.find()) {
            cadena2 = cadena.split(" ")[1];//NOS QUEDAMOS SOLO CON (IX+D)
            cadena2 = cadena2.split("\\+")[1];
            cadena2 = cadena2.replace(")", "");
            cadena2 = Integer.toHexString(Integer.parseInt(cadena2));
            List<registros> copia2 = clistare.crear();
            main.lista2.add(new instruccion("\t"+Integer.toHexString(Integer.parseInt("11011101", 2))+ " "+ Integer.toHexString(Integer.parseInt("11001011", 2))+" "+ cadena2+ " "+ Integer.toHexString(Integer.parseInt("00000110", 2)), 4));

        }
    }
    public static void RLCIY(String cadena) {
        String cadena2; 
        final String RLCIY = "^((RLC) (\\(IY\\+(1?[0-2][0-7]|[0-9][0-9]?)\\)))$";
        final String string = cadena;
        final Pattern pattern = Pattern.compile(RLCIY, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(string);
            if (matcher.find()) {
             cadena2 = cadena.split(" ")[1];//NOS QUEDAMOS SOLO CON (IX+D)
            cadena2 = cadena2.split("\\+")[1];
            cadena2 = cadena2.replace(")", "");
            cadena2 = Integer.toHexString(Integer.parseInt(cadena2));
            List<registros> copia2 = clistare.crear();
            main.lista2.add(new instruccion("\t"+Integer.toHexString(Integer.parseInt("11111101", 2))+ " "+Integer.toHexString(Integer.parseInt("11001011", 2))+" "+ cadena2+ " "+Integer.toHexString(Integer.parseInt("00000110", 2)), 4));

        }
    }
    public static void RLIX(String cadena) {
        String cadena2; 
        final String RLIX = "^((RL) (\\(IX\\+(1?[0-2][0-7]|[0-9][0-9]?)\\)))$";
        final String string = cadena;
        final Pattern pattern = Pattern.compile(RLIX, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(string);
            if (matcher.find()) {
            cadena2 = cadena.split(" ")[1];//NOS QUEDAMOS SOLO CON (IX+D)
            cadena2 = cadena2.split("\\+")[1];
            cadena2 = cadena2.replace(")", "");
            cadena2 = Integer.toHexString(Integer.parseInt(cadena2));
            List<registros> copia2 = clistare.crear();
            main.lista2.add(new instruccion(Integer.toHexString(Integer.parseInt("11011101", 2))+ " "+ Integer.toHexString(Integer.parseInt("11001011", 2))+" "+ cadena2+ " "+ Integer.toHexString(Integer.parseInt("00010110", 2)), 4));

        }
    }
    public static void RLIY(String cadena) {
        String cadena2; 
        final String RLIY = "^((RL) (\\(IY\\+(1?[0-2][0-7]|[0-9][0-9]?)\\)))";
        final String string = cadena;
        final Pattern pattern = Pattern.compile(RLIY, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(string);
            if (matcher.find()) {
             cadena2 = cadena.split(" ")[1];//NOS QUEDAMOS SOLO CON (IX+D)
            cadena2 = cadena2.split("\\+")[1];
            cadena2 = cadena2.replace(")", "");
            cadena2 = Integer.toHexString(Integer.parseInt(cadena2));
            List<registros> copia2 = clistare.crear();
            main.lista2.add(new instruccion(Integer.toHexString(Integer.parseInt("11111101", 2))+ " "+Integer.toHexString(Integer.parseInt("11001011", 2))+" "+ cadena2+ " "+Integer.toHexString(Integer.parseInt("00010110", 2)), 4));

        }
    }
    public static void RRCIX(String cadena) {
        String cadena2; 
        final String RRCIX = "^((RRC) (\\(IX\\+(1?[0-2][0-7]|[0-9][0-9]?)\\)))";
        final String string = cadena;
        final Pattern pattern = Pattern.compile(RRCIX, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(string);
            if (matcher.find()) {
            cadena2 = cadena.split(" ")[1];//NOS QUEDAMOS SOLO CON (IX+D)
            cadena2 = cadena2.split("\\+")[1];
            cadena2 = cadena2.replace(")", "");
            cadena2 = Integer.toHexString(Integer.parseInt(cadena2));
            List<registros> copia2 = clistare.crear();
            main.lista2.add(new instruccion(Integer.toHexString(Integer.parseInt("11011101", 2))+ " "+ Integer.toHexString(Integer.parseInt("11001011", 2))+" "+ cadena2+ " "+ Integer.toHexString(Integer.parseInt("00001110", 2)), 4));

        }
    }
    public static void RRCIY(String cadena) {
        String cadena2; 
        final String RRCIY = "^((RRC) (\\(IY\\+(1?[0-2][0-7]|[0-9][0-9]?)\\)))";
        final String string = cadena;
        final Pattern pattern = Pattern.compile(RRCIY, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(string);
            if (matcher.find()) {
             cadena2 = cadena.split(" ")[1];//NOS QUEDAMOS SOLO CON (IX+D)
            cadena2 = cadena2.split("\\+")[1];
            cadena2 = cadena2.replace(")", "");
            cadena2 = Integer.toHexString(Integer.parseInt(cadena2));
            List<registros> copia2 = clistare.crear();
            main.lista2.add(new instruccion(Integer.toHexString(Integer.parseInt("11111101", 2))+ " "+Integer.toHexString(Integer.parseInt("11001011", 2))+" "+ cadena2+ " "+Integer.toHexString(Integer.parseInt("00001110", 2)), 4));

        }
    }
    public static void RRIX(String cadena) {
        String cadena2; 
        final String RRIX = "^((RR) (\\(IX\\+(1?[0-2][0-7]|[0-9][0-9]?)\\)))";
        final String string = cadena;
        final Pattern pattern = Pattern.compile(RRIX, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(string);
            if (matcher.find()) {
            cadena2 = cadena.split(" ")[1];//NOS QUEDAMOS SOLO CON (IX+D)
            cadena2 = cadena2.split("\\+")[1];
            cadena2 = cadena2.replace(")", "");
            cadena2 = Integer.toHexString(Integer.parseInt(cadena2));
            List<registros> copia2 = clistare.crear();
            main.lista2.add(new instruccion(Integer.toHexString(Integer.parseInt("11011101", 2))+ " "+ Integer.toHexString(Integer.parseInt("11001011", 2))+" "+ cadena2+ " "+ Integer.toHexString(Integer.parseInt("00011110", 2)), 4));

        }
    }
    public static void RRIY(String cadena) {
        String cadena2; 
        final String RRIY = "^((RR) (\\(IY\\+(1?[0-2][0-7]|[0-9][0-9]?)\\)))";
        final String string = cadena;
        final Pattern pattern = Pattern.compile(RRIY, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(string);
            if (matcher.find()) {
             cadena2 = cadena.split(" ")[1];//NOS QUEDAMOS SOLO CON (IX+D)
            cadena2 = cadena2.split("\\+")[1];
            cadena2 = cadena2.replace(")", "");
            cadena2 = Integer.toHexString(Integer.parseInt(cadena2));
            List<registros> copia2 = clistare.crear();
            main.lista2.add(new instruccion(Integer.toHexString(Integer.parseInt("11111101", 2))+ " "+Integer.toHexString(Integer.parseInt("11001011", 2))+" "+ cadena2+ " "+Integer.toHexString(Integer.parseInt("00011110", 2)), 4));

        }
    }
    public static void SLAIX(String cadena) {
        String cadena2; 
        final String SLAIX = "^((SLA) (\\(IX\\+(1?[0-2][0-7]|[0-9][0-9]?)\\)))";
        final String string = cadena;
        final Pattern pattern = Pattern.compile(SLAIX, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(string);
            if (matcher.find()) {
            cadena2 = cadena.split(" ")[1];//NOS QUEDAMOS SOLO CON (IX+D)
            cadena2 = cadena2.split("\\+")[1];
            cadena2 = cadena2.replace(")", "");
            cadena2 = Integer.toHexString(Integer.parseInt(cadena2));
            List<registros> copia2 = clistare.crear();
            main.lista2.add(new instruccion(Integer.toHexString(Integer.parseInt("11011101", 2))+ " "+ Integer.toHexString(Integer.parseInt("11001011", 2))+" "+ cadena2+ " "+ Integer.toHexString(Integer.parseInt("00100110", 2)), 4));

        }
    }
    public static void SLAIY(String cadena) {
        String cadena2; 
        final String SLAIY = "^((SLA) (\\(IY\\+(1?[0-2][0-7]|[0-9][0-9]?)\\)))";
        final String string = cadena;
        final Pattern pattern = Pattern.compile(SLAIY, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(string);
            if (matcher.find()) {
             cadena2 = cadena.split(" ")[1];//NOS QUEDAMOS SOLO CON (IX+D)
            cadena2 = cadena2.split("\\+")[1];
           cadena2 = cadena2.replace(")", "");
            cadena2 = Integer.toHexString(Integer.parseInt(cadena2));
            List<registros> copia2 = clistare.crear();
            main.lista2.add(new instruccion(Integer.toHexString(Integer.parseInt("11111101", 2))+ " "+Integer.toHexString(Integer.parseInt("11001011", 2))+" "+ cadena2+ " "+Integer.toHexString(Integer.parseInt("00100110", 2)), 4));

        }
    }
    public static void SRAIX(String cadena) {
        String cadena2; 
        final String SRAIX = "^((SRA) (\\(IX\\+(1?[0-2][0-7]|[0-9][0-9]?)\\)))";
        final String string = cadena;
        final Pattern pattern = Pattern.compile(SRAIX, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(string);
            if (matcher.find()) {
            cadena2 = cadena.split(" ")[1];//NOS QUEDAMOS SOLO CON (IX+D)
            cadena2 = cadena2.split("\\+")[1];
     cadena2 = cadena2.replace(")", "");
            cadena2 = Integer.toHexString(Integer.parseInt(cadena2));
            List<registros> copia2 = clistare.crear();
            main.lista2.add(new instruccion(Integer.toHexString(Integer.parseInt("11011101", 2))+ " "+ Integer.toHexString(Integer.parseInt("11001011", 2))+" "+ cadena2+ " "+ Integer.toHexString(Integer.parseInt("00101110", 2)), 4));

        }
    }
    public static void SRAIY(String cadena) {
        String cadena2; 
        final String SRAIY = "^((SRA) (\\(IY\\+(1?[0-2][0-7]|[0-9][0-9]?)\\)))";
        final String string = cadena;
        final Pattern pattern = Pattern.compile(SRAIY, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(string);
            if (matcher.find()) {
             cadena2 = cadena.split(" ")[1];//NOS QUEDAMOS SOLO CON (IX+D)
            cadena2 = cadena2.split("\\+")[1];
            cadena2 = cadena2.replace(")", "");
            cadena2 = Integer.toHexString(Integer.parseInt(cadena2));
            List<registros> copia2 = clistare.crear();
            main.lista2.add(new instruccion(Integer.toHexString(Integer.parseInt("11111101", 2))+ " "+Integer.toHexString(Integer.parseInt("11001011", 2))+" "+ cadena2+ " "+Integer.toHexString(Integer.parseInt("00101110", 2)), 4));

        }
    }
    public static void SRLIX(String cadena) {
        String cadena2; 
        final String SRLIX = "^((SRL) (\\(IY\\+(1?[0-2][0-7]|[0-9][0-9]?)\\)))$";
        final String string = cadena;
        final Pattern pattern = Pattern.compile(SRLIX, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(string);
            if (matcher.find()) {
            cadena2 = cadena.split(" ")[1];//NOS QUEDAMOS SOLO CON (IX+D)
            cadena2 = cadena2.split("\\+")[1];
           cadena2 = cadena2.replace(")", "");
            cadena2 = Integer.toHexString(Integer.parseInt(cadena2));
            List<registros> copia2 = clistare.crear();
            main.lista2.add(new instruccion(Integer.toHexString(Integer.parseInt("11011101", 2))+ " "+ Integer.toHexString(Integer.parseInt("11001011", 2))+" "+ cadena2+ " "+ Integer.toHexString(Integer.parseInt("00111110", 2)), 4));

        }
    }
    public static void SRLIY(String cadena) {
        String cadena2; 
        final String SRLIY = "^((SRL) (\\(IY\\+(1?[0-2][0-7]|[0-9][0-9]?)\\)))$";
        final String string = cadena;
        final Pattern pattern = Pattern.compile(SRLIY, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(string);
            if (matcher.find()) {
             cadena2 = cadena.split(" ")[1];//NOS QUEDAMOS SOLO CON (IX+D)
            cadena2 = cadena2.split("\\+")[1];
            cadena2 = cadena2.replace(")", "");
            cadena2 = Integer.toHexString(Integer.parseInt(cadena2));
            List<registros> copia2 = clistare.crear();
            main.lista2.add(new instruccion(Integer.toHexString(Integer.parseInt("11111101", 2))+ " "+Integer.toHexString(Integer.parseInt("11001011", 2))+" "+ cadena2+ " "+Integer.toHexString(Integer.parseInt("00111110", 2)), 4));

        }
    }
       public static void ADDn(String cadena) {
        String cadena2; //
        final String addn2 = "^(ADD (A),(1?[0-9]{1,2}|2[0-4][0-9]|25[0-5]))$";//decimal
        final String  addn= "ADD (A),([0-9]([A-F]?|[0-9])H)";//hexadecimal
        final String string = cadena;
        final Pattern pattern2 = Pattern.compile(addn2, Pattern.MULTILINE);
        final Pattern pattern = Pattern.compile(addn, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(string);
        final Matcher matcher2 = pattern2.matcher(string);
            if (matcher.find()) {//SEPARAR H SI HAY COINCIDENCIA Y ES HEXA
            cadena2 = cadena.split(" ")[1];
            cadena = cadena2.split(",")[0];//(A)
            String cadena3 = cadena2.split(",")[1];//n
            cadena3 = cadena3.replace("H", "");
            //main.lista2.add(new instruccion(Integer.toHexString(Integer.parseInt("11000110", 2))+" " + cadena3, 2));//AGREGAR LISTA 2 Y AL FINAL IMPRIMIR
            main.lista2.add(new instruccion(Integer.toHexString(Integer.parseInt("11000110", 2))+" " + cadena3, 2));//AGREGAR LISTA 2 Y AL FINAL IMPRIMIR
        }
        if (matcher2.find()) {
            cadena2 = cadena.split(" ")[1];
            String cadena3 = cadena2.split(",")[1];
            cadena3 = Integer.toHexString(Integer.parseInt(cadena3));
            //main.lista2.add(new instruccion(Integer.toHexString(Integer.parseInt("11000110", 2))+" " + cadena3, 2));
            main.lista2.add(new instruccion(Integer.toHexString(Integer.parseInt("11000110", 2)), 2));
        }
}
   public static void ADDIX(String cadena) {
        String cadena2; 
        final String addIX = "ADD A,(\\(IX\\+(1?[0-2][0-7]|[0-9][0-9]?)\\))";
        final String string = cadena;
        final Pattern pattern = Pattern.compile(addIX, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(string);
            if (matcher.find()) {
            cadena2 = cadena.split(" ")[1];//NOS QUEDAMOS SOLO CON R,(IX+D)
            cadena = cadena2.split(",")[0];//cadena sera R
            String cadena3 = cadena2.split(",")[1];//cadena3 sera (IX+D)
            cadena3 = cadena3.split("\\+")[1];
            cadena3 = cadena3.replace(")", "");
            cadena3 = Integer.toHexString(Integer.parseInt(cadena3));
            List<registros> copia2 = clistare.crear();
            main.lista2.add(new instruccion(Integer.toHexString(Integer.parseInt("11011101", 2))+ " "+ Integer.toHexString(Integer.parseInt("10000110", 2))+" "+ cadena3, 3));
        }
    }
   public static void ADDIY(String cadena) {
        String cadena2; 
        final String addIY = "ADD A,(\\(IY\\+(1?[0-2][0-7]|[0-9][0-9]?)\\))";
        final String string = cadena;
        final Pattern pattern = Pattern.compile(addIY, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(string);
            if (matcher.find()) {
            cadena2 = cadena.split(" ")[1];//NOS QUEDAMOS SOLO CON R,(IX+D)
            cadena = cadena2.split(",")[0];//cadena sera R
            String cadena3 = cadena2.split(",")[1];//cadena3 sera (IX+D)
            cadena3 = cadena3.split("\\+")[1];
            cadena3 = cadena3.replace(")", "");
            cadena3 = Integer.toHexString(Integer.parseInt(cadena3));
            List<registros> copia2 = clistare.crear();
            main.lista2.add(new instruccion(Integer.toHexString(Integer.parseInt("11111101", 2))+ " "+Integer.toHexString(Integer.parseInt("10000110", 2))+" "+ cadena3, 3));
        }
    }
    public static void ADCn(String cadena) {
        String cadena2; //
        final String adcn2 = "^(ADC (A),(1?[0-9]{1,2}|2[0-4][0-9]|25[0-5]))$";//decimal
        final String  adcn= "ADC (A),([0-9]([A-F]?|[0-9])H)";//hexadecimal
        final String string = cadena;
        final Pattern pattern2 = Pattern.compile(adcn2, Pattern.MULTILINE);
        final Pattern pattern = Pattern.compile(adcn, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(string);
        final Matcher matcher2 = pattern2.matcher(string);
            if (matcher.find()) {//SEPARAR H SI HAY COINCIDENCIA Y ES HEXA
            cadena2 = cadena.split(" ")[1];
            cadena = cadena2.split(",")[0];//(A)
            String cadena3 = cadena2.split(",")[1];//n
            cadena3 = cadena3.replace("H", "");
            main.lista2.add(new instruccion(Integer.toHexString(Integer.parseInt("11001110", 2))+" " + cadena3, 2));//AGREGAR LISTA 2 Y AL FINAL IMPRIMIR
        }
        if (matcher2.find()) {
            cadena2 = cadena.split(" ")[1];
            String cadena3 = cadena2.split(",")[1];///n
            cadena3 = Integer.toHexString(Integer.parseInt(cadena3));
            main.lista2.add(new instruccion(Integer.toHexString(Integer.parseInt("11001110", 2))+" " + cadena3, 2));
        }
    }
    public static void ADCIX(String cadena) {
        String cadena2; 
        final String adcIX = "ADC A,(\\(IX\\+(1?[0-2][0-7]|[0-9][0-9]?)\\))";
        final String string = cadena;
        final Pattern pattern = Pattern.compile(adcIX, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(string);
            if (matcher.find()) {
            cadena2 = cadena.split(" ")[1];//NOS QUEDAMOS SOLO CON R,(IX+D)
            cadena = cadena2.split(",")[0];//cadena sera R
            String cadena3 = cadena2.split(",")[1];//cadena3 sera (IX+D)
            cadena3 = cadena3.split("\\+")[1];
            cadena3 = cadena3.replace(")", "");
             cadena3 = Integer.toHexString(Integer.parseInt(cadena3));
           List<registros> copia2 = clistare.crear();
           main.lista2.add(new instruccion(Integer.toHexString(Integer.parseInt("11011101", 2))+ " "+ Integer.toHexString(Integer.parseInt("10001110", 2))+" "+ cadena3, 3));

        }
    }
    public static void ADCIY(String cadena) {
        String cadena2; 
        final String adcIY = "ADC A,(\\(IY\\+(1?[0-2][0-7]|[0-9][0-9]?)\\))";
        final String string = cadena;
        final Pattern pattern = Pattern.compile(adcIY, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(string);
            if (matcher.find()) {
            cadena2 = cadena.split(" ")[1];//NOS QUEDAMOS SOLO CON R,(IX+D)
            cadena = cadena2.split(",")[0];//cadena sera R
            String cadena3 = cadena2.split(",")[1];//cadena3 sera (IX+D)
            cadena3 = cadena3.split("\\+")[1];
            cadena3 = cadena3.replace(")", "");
            cadena3 = Integer.toHexString(Integer.parseInt(cadena3));
            List<registros> copia2 = clistare.crear();
            main.lista2.add(new instruccion(Integer.toHexString(Integer.parseInt("11111101", 2))+ " "+Integer.toHexString(Integer.parseInt("10001110", 2))+" "+ cadena3, 3));
        }
    }
    public static void SUBn(String cadena) {
        String cadena2; //
        final String subn2 = "^(SUB (A),(1?[0-9]{1,2}|2[0-4][0-9]|25[0-5]))$";//decimal
        final String  subn= "SUB (A),([0-9]([A-F]?|[0-9])H)";//hexadecimal
        final String string = cadena;
        final Pattern pattern2 = Pattern.compile(subn2, Pattern.MULTILINE);
        final Pattern pattern = Pattern.compile(subn, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(string);
        final Matcher matcher2 = pattern2.matcher(string);
            if (matcher.find()) {//SEPARAR H SI HAY COINCIDENCIA Y ES HEXA
            cadena2 = cadena.split(" ")[1];
            cadena = cadena2.split(",")[0];//(A)
            String cadena3 = cadena2.split(",")[1];//n
            cadena3 = cadena3.replace("H", "");
            main.lista2.add(new instruccion(Integer.toHexString(Integer.parseInt("11010110", 2))+" " + cadena3, 2));//AGREGAR LISTA 2 Y AL FINAL IMPRIMIR
        }
        if (matcher2.find()) {
            cadena2 = cadena.split(" ")[1];
            String cadena3 = cadena2.split(",")[1];///n
            cadena3 = Integer.toHexString(Integer.parseInt(cadena3));
            main.lista2.add(new instruccion(Integer.toHexString(Integer.parseInt("11010110", 2))+" " + cadena3, 2));
        }
    }
    public static void SUBIX(String cadena) {
        String cadena2; 
        final String subIX = "SUB A,(\\(IX\\+(1?[0-2][0-7]|[0-9][0-9]?)\\))";
        final String string = cadena;
        final Pattern pattern = Pattern.compile(subIX, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(string);
            if (matcher.find()) {
            cadena2 = cadena.split(" ")[1];//NOS QUEDAMOS SOLO CON R,(IX+D)
            cadena = cadena2.split(",")[0];//cadena sera R
            String cadena3 = cadena2.split(",")[1];//cadena3 sera (IX+D)
            cadena3 = cadena3.split("\\+")[1];
            cadena3 = cadena3.replace(")", "");
            cadena3 = Integer.toHexString(Integer.parseInt(cadena3));
           List<registros> copia2 = clistare.crear();
            main.lista2.add(new instruccion(Integer.toHexString(Integer.parseInt("11011101", 2))+ " "+ Integer.toHexString(Integer.parseInt("10010110", 2))+" "+ cadena3, 3));

        }
    }
    public static void SUBIY(String cadena) {
        String cadena2; 
        final String subIY = "SUB A,(\\(IY\\+(1?[0-2][0-7]|[0-9][0-9]?)\\))";
        final String string = cadena;
        final Pattern pattern = Pattern.compile(subIY, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(string);
            if (matcher.find()) {
            cadena2 = cadena.split(" ")[1];//NOS QUEDAMOS SOLO CON R,(IX+D)
            cadena = cadena2.split(",")[0];//cadena sera R
            String cadena3 = cadena2.split(",")[1];//cadena3 sera (IX+D)
            cadena3 = cadena3.split("\\+")[1]; 
            cadena3 = cadena3.replace(")", "");
            cadena3 = Integer.toHexString(Integer.parseInt(cadena3));
            List<registros> copia2 = clistare.crear();
            main.lista2.add(new instruccion(Integer.toHexString(Integer.parseInt("11111101", 2))+ " "+Integer.toHexString(Integer.parseInt("10010110", 2))+" "+ cadena3, 3));

        }
    }
    public static void SBCn(String cadena) {
        String cadena2; //
        final String sbcn2 = "^(SBC (A),(1?[0-9]{1,2}|2[0-4][0-9]|25[0-5]))$";//decimal
        final String  sbcn= "SBC (A),([0-9]([A-F]?|[0-9])H)";//hexadecimal
        final String string = cadena;
        final Pattern pattern2 = Pattern.compile(sbcn2, Pattern.MULTILINE);
        final Pattern pattern = Pattern.compile(sbcn, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(string);
        final Matcher matcher2 = pattern2.matcher(string);
            if (matcher.find()) {//SEPARAR H SI HAY COINCIDENCIA Y ES HEXA
            cadena2 = cadena.split(" ")[1];
            cadena = cadena2.split(",")[0];//(A)
            String cadena3 = cadena2.split(",")[1];//n
            cadena3 = cadena3.replace("H", "");
            main.lista2.add(new instruccion(Integer.toHexString(Integer.parseInt("11011110", 2))+" " + cadena3, 2));//AGREGAR LISTA 2 Y AL FINAL IMPRIMIR
            }
        if (matcher2.find()) {
            cadena2 = cadena.split(" ")[1];
            String cadena3 = cadena2.split(",")[1];///n
             cadena3 = Integer.toHexString(Integer.parseInt(cadena3));
             main.lista2.add(new instruccion(Integer.toHexString(Integer.parseInt("11011110", 2))+" " + cadena3, 2));
        
        }
    }
    public static void SBCIX(String cadena) {
        String cadena2; 
        final String sbcIX = "SBC A,(\\(IX\\+(1?[0-2][0-7]|[0-9][0-9]?)\\))";
        final String string = cadena;
        final Pattern pattern = Pattern.compile(sbcIX, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(string);
            if (matcher.find()) {
            cadena2 = cadena.split(" ")[1];//NOS QUEDAMOS SOLO CON R,(IX+D)
            cadena = cadena2.split(",")[0];//cadena sera R
            String cadena3 = cadena2.split(",")[1];//cadena3 sera (IX+D)
            cadena3 = cadena3.split("\\+")[1];
            cadena3 = cadena3.replace(")", "");
             cadena3 = Integer.toHexString(Integer.parseInt(cadena3));
            List<registros> copia2 = clistare.crear();
            main.lista2.add(new instruccion(Integer.toHexString(Integer.parseInt("11011101", 2))+ " "+ Integer.toHexString(Integer.parseInt("10011110", 2))+" "+ cadena3, 3));

        }
    }
    public static void SBCIY(String cadena) {
        String cadena2; 
        final String sbcIY = "SBC A,(\\(IY\\+(1?[0-2][0-7]|[0-9][0-9]?)\\))";
        final String string = cadena;
        final Pattern pattern = Pattern.compile(sbcIY, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(string);
            if (matcher.find()) {
            cadena2 = cadena.split(" ")[1];//NOS QUEDAMOS SOLO CON R,(IX+D)
            cadena = cadena2.split(",")[0];//cadena sera R
            String cadena3 = cadena2.split(",")[1];//cadena3 sera (IX+D)
            cadena3 = cadena3.split("\\+")[1];
            cadena3 = cadena3.replace(")", "");
            cadena3 = Integer.toHexString(Integer.parseInt(cadena3));
            List<registros> copia2 = clistare.crear();
            main.lista2.add(new instruccion(Integer.toHexString(Integer.parseInt("11111101", 2))+ " "+Integer.toHexString(Integer.parseInt("10011110", 2))+" "+ cadena3, 3));

        }
    }
    public static void ANDn(String cadena) {
        String cadena2; //
        final String andn2 = "^(AND (A),(1?[0-9]{1,2}|2[0-4][0-9]|25[0-5]))$";//decimal
        final String  andn= "AND (A),([0-9]([A-F]?|[0-9])H)";//hexadecimal
        final String string = cadena;
        final Pattern pattern2 = Pattern.compile(andn2, Pattern.MULTILINE);
        final Pattern pattern = Pattern.compile(andn, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(string);
        final Matcher matcher2 = pattern2.matcher(string);
            if (matcher.find()) {//SEPARAR H SI HAY COINCIDENCIA Y ES HEXA
            cadena2 = cadena.split(" ")[1];
            cadena = cadena2.split(",")[0];//(A)
            String cadena3 = cadena2.split(",")[1];//n
            cadena3 = cadena3.replace("H", "");
            main.lista2.add(new instruccion(Integer.toHexString(Integer.parseInt("11100110", 2))+" " + cadena3, 2));//AGREGAR LISTA 2 Y AL FINAL IMPRIMIR
        }
        if (matcher2.find()) {
            cadena2 = cadena.split(" ")[1];
            String cadena3 = cadena2.split(",")[1];///n
            cadena3 = Integer.toHexString(Integer.parseInt(cadena3));
            main.lista2.add(new instruccion(Integer.toHexString(Integer.parseInt("11100110", 2))+" " + cadena3, 2));
        }
    }
    public static void ANDIX(String cadena) {
        String cadena2; 
        final String andIX = "AND A,(\\(IX\\+(1?[0-2][0-7]|[0-9][0-9]?)\\))";
        final String string = cadena;
        final Pattern pattern = Pattern.compile(andIX, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(string);
            if (matcher.find()) {
            cadena2 = cadena.split(" ")[1];//NOS QUEDAMOS SOLO CON R,(IX+D)
            cadena = cadena2.split(",")[0];//cadena sera R
            String cadena3 = cadena2.split(",")[1];//cadena3 sera (IX+D)
            cadena3 = cadena3.split("\\+")[1];
            cadena3 = cadena3.replace(")", "");
            cadena3 = Integer.toHexString(Integer.parseInt(cadena3));
            List<registros> copia2 = clistare.crear();
            main.lista2.add(new instruccion(Integer.toHexString(Integer.parseInt("11011101", 2))+ " "+ Integer.toHexString(Integer.parseInt("10100110", 2))+" "+ cadena3, 3));

        }
    }
    public static void ANDIY(String cadena) {
        String cadena2; 
        final String andIY = "AND A,(\\(IY\\+(1?[0-2][0-7]|[0-9][0-9]?)\\))";
        final String string = cadena;
        final Pattern pattern = Pattern.compile(andIY, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(string);
            if (matcher.find()) {
            cadena2 = cadena.split(" ")[1];//NOS QUEDAMOS SOLO CON R,(IX+D)
            cadena = cadena2.split(",")[0];//cadena sera R
            String cadena3 = cadena2.split(",")[1];//cadena3 sera (IX+D)
            cadena3 = cadena3.split("\\+")[1];
            cadena3 = cadena3.replace(")", "");
            cadena3 = Integer.toHexString(Integer.parseInt(cadena3));
            List<registros> copia2 = clistare.crear();
            main.lista2.add(new instruccion(Integer.toHexString(Integer.parseInt("11111101", 2))+ " "+Integer.toHexString(Integer.parseInt("10100110", 2))+" "+ cadena3, 3));

        }
    }
    public static void ORn(String cadena) {
        String cadena2; //
        final String orn2 = "^(OR (A),(1?[0-9]{1,2}|2[0-4][0-9]|25[0-5]))$";//decimal
        final String  orn= "^(OR (A),([0-9]([A-F]?|[0-9])H))";//hexadecimal
        final String string = cadena;
        final Pattern pattern2 = Pattern.compile(orn2, Pattern.MULTILINE);
        final Pattern pattern = Pattern.compile(orn, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(string);
        final Matcher matcher2 = pattern2.matcher(string);
            if (matcher.find()) {//SEPARAR H SI HAY COINCIDENCIA Y ES HEXA
            cadena2 = cadena.split(" ")[1];
            cadena = cadena2.split(",")[0];//(A)
            String cadena3 = cadena2.split(",")[1];//n
            cadena3 = cadena3.replace("H", "");
            main.lista2.add(new instruccion(Integer.toHexString(Integer.parseInt("11110110", 2))+" " + cadena3, 2));//AGREGAR LISTA 2 Y AL FINAL IMPRIMIR
        
        }
        if (matcher2.find()) {
            cadena2 = cadena.split(" ")[1];
            String cadena3 = cadena2.split(",")[1];///n
            cadena3 = Integer.toHexString(Integer.parseInt(cadena3));
            main.lista2.add(new instruccion(Integer.toHexString(Integer.parseInt("11110110", 2))+" " + cadena3, 2));
        
        }
    }
      public static void ORIX(String cadena) {
        String cadena2; 
        final String orIX = "^(OR A,(\\(IX\\+(1?[0-2][0-7]|[0-9][0-9]?)\\)))";
        final String string = cadena;
        final Pattern pattern = Pattern.compile(orIX, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(string);
            if (matcher.find()) {
            cadena2 = cadena.split(" ")[1];//NOS QUEDAMOS SOLO CON R,(IX+D)
            cadena = cadena2.split(",")[0];//cadena sera R
            String cadena3 = cadena2.split(",")[1];//cadena3 sera (IX+D)
            cadena3 = cadena3.split("\\+")[1];
            cadena3 = cadena3.replace(")", "");
            cadena3 = Integer.toHexString(Integer.parseInt(cadena3));
            List<registros> copia2 = clistare.crear();
            main.lista2.add(new instruccion(Integer.toHexString(Integer.parseInt("11011101", 2))+ " "+ Integer.toHexString(Integer.parseInt("10110110", 2))+" "+ cadena3, 3));

        }
    }
    public static void ORIY(String cadena) {
        String cadena2; 
        final String orIY = "^(OR A,(\\(IY\\+(1?[0-2][0-7]|[0-9][0-9]?)\\)))";
        final String string = cadena;
        final Pattern pattern = Pattern.compile(orIY, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(string);
            if (matcher.find()) {
            cadena2 = cadena.split(" ")[1];//NOS QUEDAMOS SOLO CON R,(IX+D)
            cadena = cadena2.split(",")[0];//cadena sera R
            String cadena3 = cadena2.split(",")[1];//cadena3 sera (IX+D)
            cadena3 = cadena3.split("\\+")[1];
            cadena3 = cadena3.replace(")", "");
            cadena3 = Integer.toHexString(Integer.parseInt(cadena3));
            List<registros> copia2 = clistare.crear();
            main.lista2.add(new instruccion(Integer.toHexString(Integer.parseInt("11111101", 2))+ " "+Integer.toHexString(Integer.parseInt("10110110", 2))+" "+ cadena3, 3));

        }
    }
    public static void XORn(String cadena) {
        String cadena2; //
        final String Xorn2 = "^(XOR (A),(1?[0-9]{1,2}|2[0-4][0-9]|25[0-5]))$";//decimal
        final String Xorn= "XOR (A),([0-9]([A-F]?|[0-9])H)";//hexadecimal
        final String string = cadena;
        final Pattern pattern2 = Pattern.compile(Xorn2, Pattern.MULTILINE);
        final Pattern pattern = Pattern.compile(Xorn, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(string);
        final Matcher matcher2 = pattern2.matcher(string);
            if (matcher.find()) {//SEPARAR H SI HAY COINCIDENCIA Y ES HEXA
            cadena2 = cadena.split(" ")[1];
            cadena = cadena2.split(",")[0];//(A)
            String cadena3 = cadena2.split(",")[1];//n
            cadena3 = cadena3.replace("H", "");
            main.lista2.add(new instruccion(Integer.toHexString(Integer.parseInt("11101110", 2))+" " + cadena3, 2));//AGREGAR LISTA 2 Y AL FINAL IMPRIMIR
        }
        if (matcher2.find()) {
            cadena2 = cadena.split(" ")[1];
            String cadena3 = cadena2.split(",")[1];///n
            cadena3 = Integer.toHexString(Integer.parseInt(cadena3));
            main.lista2.add(new instruccion(Integer.toHexString(Integer.parseInt("11101110", 2))+" " + cadena3, 2));
        
        }
    }
    public static void XORIX(String cadena) {
        String cadena2; 
        final String XorrIX = "XOR A,(\\(IX\\+(1?[0-2][0-7]|[0-9][0-9]?)\\))";
        final String string = cadena;
        final Pattern pattern = Pattern.compile(XorrIX, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(string);
            if (matcher.find()) {
            cadena2 = cadena.split(" ")[1];//NOS QUEDAMOS SOLO CON R,(IX+D)
            cadena = cadena2.split(",")[0];//cadena sera R
            String cadena3 = cadena2.split(",")[1];//cadena3 sera (IX+D)
            cadena3 = cadena3.split("\\+")[1];
            cadena3 = cadena3.replace(")", "");
            cadena3 = Integer.toHexString(Integer.parseInt(cadena3));
            List<registros> copia2 = clistare.crear();
            main.lista2.add(new instruccion(Integer.toHexString(Integer.parseInt("11011101", 2))+ " "+ Integer.toHexString(Integer.parseInt("10101110", 2))+" "+ cadena3, 3));

        }
    }
   
    public static void CPn(String cadena) {
        String cadena2; //
        final String CPn2 = "^(CP (A),(1?[0-9]{1,2}|2[0-4][0-9]|25[0-5]))$";//decimal
        final String  CPn= "CP (A),([0-9]([A-F]?|[0-9])H)";//hexadecimal
        final String string = cadena;
        final Pattern pattern2 = Pattern.compile(CPn2, Pattern.MULTILINE);
        final Pattern pattern = Pattern.compile(CPn, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(string);
        final Matcher matcher2 = pattern2.matcher(string);
            if (matcher.find()) {//SEPARAR H SI HAY COINCIDENCIA Y ES HEXA
            cadena2 = cadena.split(" ")[1];
            cadena = cadena2.split(",")[0];//(A)
            String cadena3 = cadena2.split(",")[1];//n
            cadena3 = cadena3.replace("H", "");
            main.lista2.add(new instruccion(Integer.toHexString(Integer.parseInt("11111110", 2))+" " + cadena3, 2));//AGREGAR LISTA 2 Y AL FINAL IMPRIMIR
        
        }
        if (matcher2.find()) {
            cadena2 = cadena.split(" ")[1];
             String cadena3 = cadena2.split(",")[1];///n
            cadena3 = Integer.toHexString(Integer.parseInt(cadena3));
            main.lista2.add(new instruccion(Integer.toHexString(Integer.parseInt("11111110", 2))+" " + cadena3, 2));
        }
    }
    public static void CPIX(String cadena) {
        String cadena2; 
        final String CPIX = "CP A,(\\(IX\\+(1?[0-2][0-7]|[0-9][0-9]?)\\))";
        final String string = cadena;
        final Pattern pattern = Pattern.compile(CPIX, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(string);
            if (matcher.find()) {
            cadena2 = cadena.split(" ")[1];//NOS QUEDAMOS SOLO CON R,(IX+D)
            cadena = cadena2.split(",")[0];//cadena sera R
            String cadena3 = cadena2.split(",")[1];//cadena3 sera (IX+D)
            cadena3 = cadena3.split("\\+")[1];
            cadena3 = cadena3.replace(")", "");
            cadena3 = Integer.toHexString(Integer.parseInt(cadena3));
            List<registros> copia2 = clistare.crear();
            main.lista2.add(new instruccion(Integer.toHexString(Integer.parseInt("11011101", 2))+ " "+ Integer.toHexString(Integer.parseInt("10111110", 2))+" "+ cadena3, 3));

        }
    }
    public static void CPIY(String cadena) {
        String cadena2; 
        final String CPIY = "CP A,(\\(IY\\+(1?[0-2][0-7]|[0-9][0-9]?)\\))";
        final String string = cadena;
        final Pattern pattern = Pattern.compile(CPIY, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(string);
            if (matcher.find()) {
            cadena2 = cadena.split(" ")[1];//NOS QUEDAMOS SOLO CON R,(IX+D)
            cadena = cadena2.split(",")[0];//cadena sera R
            String cadena3 = cadena2.split(",")[1];//cadena3 sera (IX+D)
            cadena3 = cadena3.split("\\+")[1];
           cadena3 = cadena3.replace(")", "");
            cadena3 = Integer.toHexString(Integer.parseInt(cadena3));
            List<registros> copia2 = clistare.crear();
            main.lista2.add(new instruccion(Integer.toHexString(Integer.parseInt("11111101", 2))+ " "+Integer.toHexString(Integer.parseInt("10111110", 2))+" "+ cadena3, 3));

        }
    }
    public static void INCIX(String cadena) {
        String cadena2; 
        final String INCIX = "INC (\\(IX\\+(1?[0-2][0-7]|[0-9][0-9]?)\\))";
        final String string = cadena;
        final Pattern pattern = Pattern.compile(INCIX, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(string);
            if (matcher.find()) {
             cadena2 = cadena.split(" ")[1];//NOS QUEDAMOS SOLO CON (IX+D)
            cadena2 = cadena2.split("\\+")[1];
            cadena2 = cadena2.replace(")", "");
            cadena2 = Integer.toHexString(Integer.parseInt(cadena2));
            List<registros> copia2 = clistare.crear();
            main.lista2.add(new instruccion(Integer.toHexString(Integer.parseInt("11011101", 2))+ " "+ Integer.toHexString(Integer.parseInt("00110100", 2))+" "+ cadena2, 3));

        }
    }
    public static void INCIY(String cadena) {
        String cadena2; 
        final String INCIY = "INC (\\(IY\\+(1?[0-2][0-7]|[0-9][0-9]?)\\))";
        final String string = cadena;
        final Pattern pattern = Pattern.compile(INCIY, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(string);
            if (matcher.find()) {
            cadena2 = cadena.split(" ")[1];//NOS QUEDAMOS SOLO CON (IX+D)
            cadena2 = cadena2.split("\\+")[1];
            cadena2 = cadena2.replace(")", "");
            cadena2 = Integer.toHexString(Integer.parseInt(cadena2));
            List<registros> copia2 = clistare.crear();
            main.lista2.add(new instruccion(Integer.toHexString(Integer.parseInt("11111101", 2))+ " "+Integer.toHexString(Integer.parseInt("00110100", 2))+" "+ cadena2, 3));

        }
    }
     public static void DECIX(String cadena) {
        String cadena2; 
        final String DECIX = "DEC (\\(IX\\+(1?[0-2][0-7]|[0-9][0-9]?)\\))";
        final String string = cadena;
        final Pattern pattern = Pattern.compile(DECIX, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(string);
            if (matcher.find()) {
            cadena2 = cadena.split(" ")[1];//NOS QUEDAMOS SOLO CON (IX+D)
            cadena2 = cadena2.split("\\+")[1];
            cadena2 = cadena2.replace(")", "");
            cadena2 = Integer.toHexString(Integer.parseInt(cadena2));
            List<registros> copia2 = clistare.crear();
            main.lista2.add(new instruccion(Integer.toHexString(Integer.parseInt("11011101", 2))+ " "+ Integer.toHexString(Integer.parseInt("00110101", 2))+" "+ cadena2, 3));

        }
    }
    public static void DECIY(String cadena) {
        String cadena2; 
        final String DECIY = "DEC (\\(IY\\+(1?[0-2][0-7]|[0-9][0-9]?)\\))";
        final String string = cadena;
        final Pattern pattern = Pattern.compile(DECIY, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(string);
            if (matcher.find()) {
             cadena2 = cadena.split(" ")[1];//NOS QUEDAMOS SOLO CON (IX+D)
            cadena2 = cadena2.split("\\+")[1];
            cadena2 = cadena2.replace(")", "");
            cadena2 = Integer.toHexString(Integer.parseInt(cadena2));
            List<registros> copia2 = clistare.crear();
            main.lista2.add(new instruccion(Integer.toHexString(Integer.parseInt("11111101", 2))+ " "+Integer.toHexString(Integer.parseInt("00110101", 2))+" "+ cadena2, 3));

        }
    }
}


