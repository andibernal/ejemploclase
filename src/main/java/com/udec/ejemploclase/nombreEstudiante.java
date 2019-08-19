/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.caja_de_numeros;
import java.util.Arrays;
import java.util.Scanner;



/**
 *
 * @author Andres Bernal
 */

public class ClaseVector {
    

    
    public static void numeros(){ 
    //obejto clase scanner
    
        Scanner teclado = new Scanner(System.in);
        //declaracion de arreglo
        int comparador[];
        
        //|faltantes = new int [100];
        
        
        System.out.print("cantidad de numeros a ingresar: ");
        int tamaño = teclado.nextInt();
        int numeros [] = new int [tamaño];
        
        
        for (int i=0; i<numeros.length;i++){
            System.out.print("ingrese numero"+(i+1)+": ");
            numeros [i] = teclado.nextInt();
        }
        
        
        
        int valor,valor1;
        
        
        
        //System.out.println("numero de elementos que tiene el arreglo: "+numeros.length);
        System.out.print("valores guardados en el arreglo: ");
        System.out.println(Arrays.toString(numeros));
        
        //identifica el numero mayo y el menor 
        
        int mayor, menor;
        mayor = menor = numeros [0];
        
        for (int i = 0; i < numeros.length; i++){
            if(numeros [i] > mayor){
                mayor = numeros [i];
            }
            if(numeros [i]<menor){
                menor = numeros [i];
            }
        }
      
        // ciclo que recoje los numeros hasta que menor llegue a mayor
        int cantidad = 0;
        for (int i=menor; i<=mayor;i++){
            cantidad = cantidad+1 ; 
        }
            
        comparador  = new int [cantidad];
        for (int i=0; i<cantidad; i++){
           comparador [i] = menor;
           menor = menor + 1;
        }
        
       // System.out.println("numero de elementos que tiene el arreglo comparador: "+comparador.length);
        System.out.print("valores guardados en el comparador: ");
        System.out.println(Arrays.toString(comparador));
        
        
        int eliminar = -1;
        int numero = 0;
        for (int i = 0; i < comparador.length;i++){
            for (int j = 0; j < numeros.length;j++){
                if (numeros [j] == comparador [i]){
                    eliminar = i;
                    comparador[i]=0;
                }
                
            }
            if(comparador[i] != 0){
                System.out.println("numeros faltantes: "+comparador[i]);
            }
        }
    }
}
