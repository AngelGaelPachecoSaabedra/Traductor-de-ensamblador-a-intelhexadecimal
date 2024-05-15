package com.mycompany.templos;

import java.util.*;
import java.io.*;;

public class listasHexa {
    String A,B,C,D,I,J,K,L,M,renglon;
    int e,f,g,h,longi,aq,bq,dq,iq;
    List <String> mostrar = new ArrayList<String>(); //Lista para imprimir en archivo .HEX
    List <Integer> numero = new ArrayList<Integer>();//lista para realizar bit de seguimiento
    int longitud;

    public void crear(List<instruccion> instrucciones) {
        for(int i=0;i<instrucciones.size();i++){
            if(instrucciones.get(i).ins.contains(" ")){
                longitud=instrucciones.get(i).ins.length();
                switch (longitud){
                    case 5:
                        C=instrucciones.get(i).ins.split(" ")[0];
                        D=instrucciones.get(i).ins.split(" ")[1];
                        mostrar.add(C);
                        mostrar.add(D);
                        e=Integer.parseInt(C, 16);
                        f=Integer.parseInt(D, 16);
                        numero.add(e);
                        numero.add(f);
                    break;
                    case 8:
                        C=instrucciones.get(i).ins.split(" ")[0];
                        D=instrucciones.get(i).ins.split(" ")[1];
                        I=instrucciones.get(i).ins.split(" ")[2];
                        mostrar.add(C);
                        mostrar.add(D);
                        mostrar.add(I);
                        e=Integer.parseInt(C, 16);
                        f=Integer.parseInt(D, 16);
                        g=Integer.parseInt(I, 16);
                        numero.add(e);
                        numero.add(f);
                        numero.add(g);
                    break;
                    case 11:
                        C=instrucciones.get(i).ins.split(" ")[0];
                        D=instrucciones.get(i).ins.split(" ")[1];
                        I=instrucciones.get(i).ins.split(" ")[2];
                        J=instrucciones.get(i).ins.split(" ")[3];
                        mostrar.add(C);
                        mostrar.add(D);
                        mostrar.add(I);
                        mostrar.add(J);
                        e=Integer.parseInt(C, 16);
                        f=Integer.parseInt(D, 16);
                        g=Integer.parseInt(I, 16);
                        h=Integer.parseInt(J, 16);
                        numero.add(e);
                        numero.add(f);
                        numero.add(g);
                        numero.add(h);
                    break;
                }
            }else{
                longitud=instrucciones.get(i).ins.length();
                switch (longitud){
                    case 2:
                        A=instrucciones.get(i).ins;
                        mostrar.add(A);
                        e=Integer.parseInt(A,16);
                        numero.add(e);
                    break;
                    case 4:
                        A=instrucciones.get(i).ins.substring(0,2);
                        B=instrucciones.get(i).ins.substring(2,4);
                        mostrar.add(A);
                        mostrar.add(B);
                        e=Integer.parseInt(A,16);
                        f=Integer.parseInt(B,16);
                        numero.add(e);
                        numero.add(f);
                    break;
                    case 6:
                        A=instrucciones.get(i).ins.substring(0,2);
                        B=instrucciones.get(i).ins.substring(2,4);
                        C=instrucciones.get(i).ins.substring(4,6);
                        mostrar.add(A);
                        mostrar.add(B);
                        mostrar.add(C);
                        e=Integer.parseInt(A,16);
                        f=Integer.parseInt(B,16);
                        g=Integer.parseInt(C,16);
                        numero.add(e);
                        numero.add(f);
                        numero.add(g);
                    break;
                    case 8:
                        A=instrucciones.get(i).ins.substring(0,2);
                        B=instrucciones.get(i).ins.substring(2,4);
                        C=instrucciones.get(i).ins.substring(4,6);
                        D=instrucciones.get(i).ins.substring(6,8);
                        mostrar.add(A);
                        mostrar.add(B);
                        mostrar.add(C);
                        mostrar.add(D);
                        e=Integer.parseInt(A,16);
                        f=Integer.parseInt(B,16);
                        g=Integer.parseInt(C,16);
                        h=Integer.parseInt(D,16);
                        numero.add(e);
                        numero.add(f);
                        numero.add(g);
                        numero.add(h);
                    break;
                }
            }
        }
    }

    public void muestra() {
        for (String obj: mostrar){
            System.out.println(obj);
        }
    }

    public void formato(String nombre) {
        String conca;
        List<String> archivo= new LinkedList<String>();
        int acum=0;
        int acumuladorGeneral=0;
        int i,j,eq;
        int k=0;
        String fq,cq,hq;
        int renglonesC =mostrar.size() / 16;
        int residuo=mostrar.size()-(renglonesC*16);

        if(renglonesC>0){//cuando da 1 o mas renglones con 16 bits
            for(i=0;i<renglonesC;i++){//se hara n veces dado la div
                fq=Integer.toHexString(i);//convertir a string en hex lo de contador
                longi=fq.length();//se ve la parte de la longitud del hexa hecha direccion para que se rellene 
                switch (longi){
                    case 1:
                        renglon=":10"+"00"+fq+"0"+"00";
                        aq=00;//primer byte de de direccion
                        bq=10;//num de bytes que llena la linea (16 en decimal)
                        cq=renglon.substring(5, 7);//se saca segundo cacho de la direccion i0
                        dq=Integer.parseInt(cq,16);//se convierte a decimal
                        iq=00;//es primer cacho de direccion 00
                    break;
                    case 2:
                        renglon=":10"+"0"+fq+"0"+"00";
                        aq=00;//primer byte de de direccion
                        bq=10;//num de bytes que llena la linea (16 en decimal)
                        cq=renglon.substring(3, 7);//se saca segundo cacho de la direccion i0
                        hq=renglon.substring(5, 7);//se saca primer cacho de la direccion 0ii0    
                        dq=Integer.parseInt(cq,16);//se convierte a decimal
                        iq=Integer.parseInt(hq,16);//se convierte a decimal
                    break;
                    case 3:
                        renglon=":10"+fq+"0"+"00";
                        aq=00;//primer byte de de direccion
                        bq=10;//num de bytes que llena la linea (16 en decimal)
                        cq=renglon.substring(3, 7);//se saca segundo cacho de la direccion i0
                        hq=renglon.substring(5, 7);//se saca primer cacho de la direccion 0i00    
                        dq=Integer.parseInt(cq,16);//se convierte a decimal
                        iq=Integer.parseInt(hq,16);//se convierte a decimal
                    break;
                }   
                acumuladorGeneral=aq+bq+dq+iq;//se suma lo que va antes de la suma de instrucciones
                for (j=0;j<16;j++){
                    renglon=renglon+mostrar.get(k);
                    acum=acum+numero.get(k);//se suma lo hexa de las instrucciones
                    k=k+1;
                }
                acum=acumuladorGeneral+acum;//se hace la suma de todo el renglon
                acum=~acum;
                acum+=1;
                acum-=6;
                String temporal=Integer.toHexString(acum);
                conca=temporal.substring(temporal.length()-2,temporal.length());
                renglon=renglon+conca;
                archivo.add(renglon);
                acum=0;
                temporal=null;
            }
            if(residuo>0){//en caso de que existan renglones incompletos se hace
                String cambio=Integer.toHexString(residuo);
                if(cambio.length()==1){//si el numero de bytes a escribir en renglon tiene long de 1 se agrega cero al inicio
                    cambio="0"+cambio;
                }
                fq=Integer.toHexString(i);//convertir a string en hex lo de contador de bytes
                longi=fq.length();//se ve la parte de la longitud del hexa hecha direccion para que se rellene 
                switch (longi){
                    case 1:
                        renglon=":"+cambio+"00"+fq+"0"+"00";
                        aq=00;//primer byte de de direccion
                        bq=residuo;//num de bytes que llena la linea que es residuo en decimal
                        cq=renglon.substring(5, 7);//se saca segundo cacho de la direccion i0
                        dq=Integer.parseInt(cq,16);//se convierte a decimal
                        iq=00;//es primer cacho de direccion 00
                    break;
                    case 2:
                        renglon=":"+cambio+"0"+fq+"0"+"00";
                        aq=00;//primer byte de de direccion
                        bq=residuo;//num de bytes que llena la linea que es residuo en decimal
                        cq=renglon.substring(3, 7);//se saca segundo cacho de la direccion i0
                        hq=renglon.substring(5, 7);//se saca primer cacho de la direccion 0ii0    
                        dq=Integer.parseInt(cq,16);//se convierte a decimal
                        iq=Integer.parseInt(hq,16);//se convierte a decimal
                    break;
                    case 3:
                        renglon=":"+cambio+fq+"0"+"00";
                        aq=00;//primer byte de de direccion
                        bq=residuo;//num de bytes que llena la linea que es residuo en decimal
                        cq=renglon.substring(3, 7);//se saca segundo cacho de la direccion i0
                        hq=renglon.substring(5, 7);//se saca primer cacho de la direccion 0i00    
                        dq=Integer.parseInt(cq,16);//se convierte a decimal
                        iq=Integer.parseInt(hq,16);//se convierte a decimal
                    break;
                }   
                acumuladorGeneral=aq+bq+dq+iq;//se suma lo que va antes de la suma de instrucciones
                for (j=0;j<residuo;j++){
                    renglon=renglon+mostrar.get(k);
                    acum=acum+numero.get(k);
                    k=k+1;
                }   
                acum=acumuladorGeneral+acum;//se hace la suma de todo el renglon
                acum=~acum;
                acum+=1;
                String temporal=Integer.toHexString(acum);
                if (temporal.length()>2){
                    conca=temporal.substring(temporal.length()-2,temporal.length());

                }else{
                    conca=temporal;
                }
                renglon=renglon+conca;
                archivo.add(renglon);
                acum=0;
                temporal=null;
            }
        }
    else if(renglonesC==0){//en caso de que los bytes del codigo sean menor a 16 se realiza
        i=0;//tienen valor porque seria la primer linea del hex
        k=0;//para que k sea la posicion de la lista donde se tiene dividido por byte
        String cambio=Integer.toHexString(residuo);
        if(cambio.length()==1){//si el numero de bytes a escribir en renglon tiene long de 1 se agrega cero al inicio
            cambio="0"+cambio;
        }
        fq=Integer.toHexString(i);//convertir a string en hex lo de contador
        longi=fq.length();//se ve la parte de la longitud del hexa hecha direccion para que se rellene 
        switch (longi){
            case 1:
                renglon=":"+cambio+"00"+fq+"0"+"00";
                aq=00;//primer byte de de direccion
                bq=residuo;//num de bytes que llena la linea que es residuo en decimal
                cq=renglon.substring(5, 7);//se saca segundo cacho de la direccion i0
                dq=Integer.parseInt(cq,16);//se convierte a decimal
                iq=00;//es primer cacho de direccion 00
            break;
            case 2:
                renglon=":"+cambio+"0"+fq+"0"+"00";
                aq=00;//primer byte de de direccion
                bq=residuo;//num de bytes que llena la linea que es residuo en decimal
                cq=renglon.substring(3, 7);//se saca segundo cacho de la direccion i0
                hq=renglon.substring(5, 7);//se saca primer cacho de la direccion 0ii0    
                dq=Integer.parseInt(cq,16);//se convierte a decimal
                iq=Integer.parseInt(hq,16);//se convierte a decimal
            break;
            case 3:
                renglon=":"+cambio+fq+"0"+"00";
                aq=00;//primer byte de de direccion
                bq=residuo;//num de bytes que llena la linea que es residuo en decimal
                cq=renglon.substring(3, 7);//se saca segundo cacho de la direccion i0
                hq=renglon.substring(5, 7);//se saca primer cacho de la direccion 0i00    
                dq=Integer.parseInt(cq,16);//se convierte a decimal
                iq=Integer.parseInt(hq,16);//se convierte a decimal
            break;
        }   
        acumuladorGeneral=aq+bq+dq+iq;//se suma lo que va antes de la suma de instrucciones
        for (int chi=0;chi<residuo;chi++){
            renglon=renglon+mostrar.get(k);
            acum=acum+numero.get(k);
            k=k+1;
        }
        acum=acumuladorGeneral+acum;
        acum=~acum;
        acum+=1;
        String temporal=Integer.toHexString(acum);
        if(temporal.length()>2){
            conca=temporal.substring(temporal.length()-2,temporal.length());
        }else{
            conca=temporal;
        }
        renglon=renglon+conca;
        archivo.add(renglon);
        acum=0;
        temporal=null;
    }
      
    archivo.add(":00000001FF");
        /*for(String obj:archivo){

            System.out.println(obj.toUpperCase());
        }*/

        try{
            //System.out.println(nombre);
            nombre=nombre.substring(0, nombre.length()-4);
            PrintWriter write=new PrintWriter(nombre+".hex");
            for(String obj:archivo){
                write.println(obj.toUpperCase());
            }
            write.close();
        }catch(Exception e){
            e.printStackTrace();
        }


    }


    
}