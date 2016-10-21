/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema.pkg3;
import java.util.*;
/**
 *
 * @author Eduardo
 */
public class Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double n=getNum(); //variable y metodo en las que se pide el numero
        double f=calculaFac(n);//variable y metodo donde calcularesmos el factorial del numero
        muestraFac(n,f);//metodo que muestra factorial
        
    }
    public static double getNum(){ //pedimos el numero por teclado
        double nume;
        Scanner tec=new Scanner(System.in);
        System.out.println("Introduce un numero del que quieras calcular su factorial");
        nume=tec.nextDouble();
        return nume;
    }
    public static double calculaFac(double nume){ //calculamos el factorial del numero con un ciclo for
        double f=1; //inicializamos una variable extra 
        for (double i=nume;i>0;i--){ /*determinamos que el inicio sera nuestro numero, 
            que el ciclo se iniciara y dentendra cuando el inicializador sea mayor que 0
            y que ese inicializador (nuestra variable) se ira restando*/
            f=i*f;} //multiplicamos nuestra variable extra por el valor que ira tomando i     
        return f;
    }
    public static void muestraFac(double nume, double f){ //mostramos el resultado del ciclo 
        System.out.println("El factorial de "+nume+" es "+f);
    }
}
