/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacio_instruccion;

import java.util.Random;
import java.util.Scanner;
import java.util.Scanner;
enum Estado {SI, NO};


public class operaciones {
    
    Scanner entrada = new Scanner(System.in);

private int x = 6; 
private int y = 6; 
private Random Aleatorios = new Random();
private int numero; 
private int numero2;
private int intentar = 0;
private int aciertos = 0;


public void menu(){           
    int i;  
    Estado continuar = Estado.SI;
    System.out.println("\nBienvenido!!");
    while (Estado.SI == continuar){       
        x = 6;
        y = 6;
        while( 5  < x || 1 > x ){
             System.out.print("\nIntroduzca un numero entre el (1 a 5): ");
             x = entrada.nextInt();
        }
        while( 5  < y || 1 > y ){
          System.out.print("\nDigite un numero (1 a 5) ");
           System.out.print(" Elegir la operacion: 1 suma, 2 resta, 3 multiplicacion");
           System.out.print(" 4 division y 5 combinacion aleatoria de las anteriores.\n");
           y = entrada.nextInt();
        }
        Generar_Ejercicios();
        System.out.println("\nQuiere seguir jugando (1 Si, 2 No)");
        i = entrada.nextInt();
        if ( 1 == i)
            continuar = Estado.SI;
        else
        continuar = Estado.NO; 
   
      }         

System.out.printf("\nSesión hizo %d intentos,", intentar);
System.out.printf(" de los cuales %d fueron correctos\n", aciertos); 
System.out.printf("\nSu porcentaje de efectividad: %f\n", (double) aciertos/intentar);
System.out.printf("\nFin\n");
}            


public void Generar_Ejercicios(){           
    int dado;
    
    switch (y){
        case 1: 
            suma();
            break;
        case 2: 
            resta();
            break;
        case 3:
            multiplicacion();
            break;
        case 4:
            division();
            break;
        case 5:
            dado = 1 +  Aleatorios.nextInt(4);
            switch (dado){
                case 1:
                    suma();
                    break;
                case 2:
                    resta();
                    break;
                case 3:
                    multiplicacion();
                    break;
                case 4:
                    division();
                    break;
                default:
                    System.out.println("\nRevise este metodo!");
                    break;
            } 
            break; 
        default: 
            System.out.println("\nerror al ejecutar!");
            break;
   
}  
}         


public void suma(){
    int auxiliars = 0;
    int suma = -1;
    numero = (int)Math.pow(10,x - 1) + Aleatorios.nextInt((int)Math.pow(10, x) - (int)Math.pow(10, x -1));  
    numero2 = (int)Math.pow(10,x - 1) + Aleatorios.nextInt((int)Math.pow(10, x) - (int)Math.pow(10, x -1));  
    do{
        if (0 != auxiliars)
        error();
        intentar++;
        System.out.printf("\nCuanto es %d + %d?\n", numero, numero2);
        suma = entrada.nextInt();
        auxiliars++;
    }while (( numero + numero2 != suma ) && (10 > auxiliars));
    if ( numero + numero2 == suma){
        correcto();
        aciertos++;
    }else
        System.out.println("\nPida ayuda a su profesor con este tipo de preguntas.");
    }



public void resta(){
    int auxiliarr = 0;
    int resta;
    numero = (int)Math.pow(10,x - 1) + Aleatorios.nextInt((int)Math.pow(10, x) - (int)Math.pow(10, x -1));  
    numero2 = (int)Math.pow(10,x - 1) + Aleatorios.nextInt((int)Math.pow(10, x) - (int)Math.pow(10, x -1));  
    do{
        if (0 != auxiliarr)
            error();
            intentar++;
            System.out.printf("\nCuanto es %d - %d?\n", numero, numero2);
            resta = entrada.nextInt();
            auxiliarr++;
    }while (( numero - numero2 != resta) && (10 > auxiliarr));
    if ( numero - numero2 == resta){ 
        correcto();
        aciertos++;
    }else
        System.out.println("\nPedir ayuda a su profesor con este tipo de preguntas");

}   



public void multiplicacion(){
    int auxiliarm = 0;
    int multiplicacion;
    numero = (int)Math.pow(10,x - 1) + Aleatorios.nextInt((int)Math.pow(10, x) - (int)Math.pow(10, x -1));  
    numero2 = (int)Math.pow(10,x - 1) + Aleatorios.nextInt((int)Math.pow(10, x) - (int)Math.pow(10, x -1));  
    do{ 
        if ( 0 != auxiliarm)
            error();
            intentar++;
            System.out.printf("\nCuanto es %d * %d?\n", numero, numero2);
            multiplicacion = entrada.nextInt();
            auxiliarm++;
  
    }while( ( numero * numero2 != multiplicacion) && (10 > auxiliarm) );
    if (numero * numero2 == multiplicacion){
        correcto();
        aciertos++;
    }else
        System.out.println("\nPedir ayuda a su profesor con este tipo de preguntas");
}



public void division(){
    int division;
    int auxiliard = 0;
    numero = (int)Math.pow(10,x - 1) + Aleatorios.nextInt((int)Math.pow(10, x) - (int)Math.pow(10, x -1));  
    numero2 = (int)Math.pow(10,x - 1) + Aleatorios.nextInt((int)Math.pow(10, x) - (int)Math.pow(10, x -1));  
    do{
        if ( 0 != auxiliard)
            error();
            intentar++;
            System.out.printf("\nCuanto es %d / %d? (introduzca solo la parte entera) \n", numero, numero2);
            division = entrada.nextInt();
            auxiliard++;
    }while (( numero / numero2 != division) && (10 > auxiliard));
    if (numero/numero2 == division){
        correcto();
        aciertos++;
    }else
        System.out.println("\nPedir ayuda a su profesor con este tipo de preguntas");
}       




void correcto(){
    int auxiliar; 
    auxiliar = 1 + Aleatorios.nextInt(4);
    switch (auxiliar){
        case 1:
            System.out.println("\nMuy bien!");
            break;
        case 2:
            System.out.println("\nExcelente!");
            break;
        case 3:
            System.out.println("\nBuen trabajo!");
            break;
        case 4:
            System.out.println("\nSigue asi!");
            break;
        default:
            System.out.println("\nRevise el Metodo Felicita!");
            break;
} 
}          


public void error(){      
    int auxiliar;
    auxiliar = 1 + Aleatorios.nextInt(4);
    switch (auxiliar) {
        case 1:
            System.out.println("\nNo. Por favor intenta de nuevo!");
            break;
        case 2:
            System.out.println("\nIncorrecto. Intenta una vez mas!");
            break;
        case 3:
            System.out.println("\nNo te rindas!");
            break;
        case 4:
            System.out.println("\nNo. Sigue intentando!");
            break;
        default:
            System.out.println("\nRevise el Metodo Anima!");
            break;
    }
  } 
    
}
