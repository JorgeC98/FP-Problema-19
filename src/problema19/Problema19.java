/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema19;
import java.util.*;
/**
 *  Este programa sirve para sacar el seno,coseno y tangente de un angulo dado
 * @author JorgeRicardo
 */
public class Problema19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Aqui de claro cuatro variables una para el número que voy a 
        pedir y las otras tres para cada recultado que voy a desplegar*/
    double angulo,seno,coseno,tangente;
    angulo=pedirAngulo();
    seno=sacarSen(angulo);      //aqui saco el coseno
    coseno=sacarCos(angulo);   //aqui saco el coseno
    tangente=sacarTan(angulo);//aqui saco la tangente
    mostrarResul(angulo,seno,coseno,tangente);
    }
    public static double pedirAngulo(){
    double g;
    Scanner entrada=new Scanner(System.in);
    System.out.println("Escribe los grados del angulo que quieres analizar: ");
    g=entrada.nextDouble();
    return g;
    }
    public static double sacarSen(double angulo){
    double sen=Math.toRadians(angulo);/*sin esto al parecer la siguiente 
                                        operacion se haria como si la cifra que  
                                        el usuario ingresa estuviera en radianes
                                        por eso mismo necesito convertirlo*/
    sen=Math.sin(sen);//aqui ya saco en seno
    return sen;
    }
    public static double sacarCos(double angulo){
    double cose=Math.toRadians(angulo);/*sin esto al parecer la siguiente 
                                        operacion se haria como si la cifra que  
                                        el usuario ingresa estuviera en radianes
                                        por eso mismo necesito convertirlo*/
    cose=Math.cos(cose);//aqui ya saco el coseno
    return cose;
    }
    public static double sacarTan(double angulo){
    double tang=Math.toRadians(angulo);/*sin esto al parecer la siguiente 
                                        operacion se haria como si la cifra que  
                                        el usuario ingresa estuviera en radianes
                                        por eso mismo necesito convertirlo*/
    tang=Math.tan(tang);//aqui ya saco la tangente
    return tang;
    }
    public static void mostrarResul(double a,double s,double c, double t){
    //aqui muestro los resultados
    System.out.println("El angulo es "+a+"° y su seno es "+s+" su coseno es "
                       + ""+c+" y su tangente es "+t);
    }
}
