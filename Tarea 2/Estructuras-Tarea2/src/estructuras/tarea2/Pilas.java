/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuras.tarea2;

import java.util.Stack;

/**
 *
 * @author Adolfo
 */
public class Pilas {
    
    //Se crea una nueva pila tipo global
    Stack pila = new Stack();
    
    public void insertar(int a){
        pila.push(a);
        System.out.println("Elemento Agregado");
    }
    
    //Metodo que devuelve true si la lista esta vacia
    public boolean esVacia(){
        if (pila.empty()){
            return true;
        }else
            return false;
    }
    
    //Eliminar el ultimo elemento de la pila
    public void eliminar(){
        pila.pop();
        System.out.println("Cima Eliminada");
    }
    
    //Metodo recursivo vacia la pila
    public void vaciar(){
        while (!pila.empty()){
            pila.pop();
        }
        System.out.println("Pila vaciada");
    }
    
    //retorna un entero con el tamaño de la pila
    public void tamano(){
        System.out.println(pila.size());
    }
    
    //Retorna el elemento que esta encima de toda la pila
    public void cima(){
        System.out.println(pila.peek());
    }
    
    //Para no perder la entrada vamos a clonar el stack
    //Y asi lo vaciamos solo para efectos de visualizacion.
    public void mostrar(){
        
        Stack pilatemp = new Stack();
        pilatemp.addAll(pila);
        
        //Una vez clonada sacamos los elementos en secuencia LIFO
        
        while(!pilatemp.empty()){
            
            System.out.println(pilatemp.pop());
        }
        
    }
    
    
}
