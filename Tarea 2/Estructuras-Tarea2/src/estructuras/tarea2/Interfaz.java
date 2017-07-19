/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuras.tarea2;

import java.util.Scanner;

/**
 *
 * @author Adolfo
 */
public class Interfaz {
    
    Scanner scan = new Scanner(System.in);
    String input = "";
    Pilas pila = new Pilas();
    
    public void titulo(){
        System.out.println("Bienvenido al Gestor de Pilas");
        
    }
    
    public void menuPrincipal(){
        System.out.println("");
        System.out.println("Por Favor escoja una opción\n");
        System.out.println("a) Insertar Datos en la Lista");
        System.out.println("b) Eliminar Cima de la lista");
        System.out.println("c) Vaciar la lista");
        System.out.println("d) Imprimir la lista");
        System.out.println("e) Mostrar la cima de la lista");
        System.out.println("f) Imprimir el Tamaño de la lista");
        System.out.println("g) Salir");
        
        System.out.print("Digite la Opcion: ");
        input = scan.nextLine();
        
        while (!input.equals("a") && !input.equals("b") && !input.equals("c") && !input.equals("d") && !input.equals("e") && !input.equals("f") && !input.equals("g"))
        {            
            System.out.println(input);
            System.out.println("Opción Invalida");
            System.out.print("Digite la Opcion: ");
            input = scan.nextLine();
            
        }
        
        if(input.equals("a")){
            insertarDatos();
        }
        
        if(input.equals("b")){
           eliminarCima();
        }
        
        if(input.equals("c")){
           vaciarLista();
        }
         
        if(input.equals("d")){
           imprimirLista();
        }
        
        if(input.equals("e")){
           imprimirCima();
        }
        
        if(input.equals("f")){
           imprimirTamano();
        }
         
        if(input.equals("g")){
          salir();
        }
      
        
    }
    
     public void insertarDatos(){
            
        titulo();
        System.out.println("Ha elegido Insertar Datos\n");
        System.out.println("Indique un numero Entero positivo");
        System.out.print("Digite: ");
        input = scan.nextLine();
        
         while (!input.matches("[0-9]+"))
            {            
                System.out.println(input);
                System.out.println("Formato de Numero Incorrecto");
                System.out.print("Digite la Opcion: ");
                input = scan.nextLine();
            }
         
         pila.insertar(Integer.parseInt(input));
         menuPrincipal();
        }
    
    public void eliminarCima(){
        if(!pila.esVacia()){
            pila.eliminar();
        }else{
            System.out.println("No hay nada que vaciar, ya estaba vacía");
        }
        
        menuPrincipal();
    }
    
    public void vaciarLista(){
        pila.vaciar();
        menuPrincipal();
    }
    
    public void imprimirLista(){
        if(!pila.esVacia())
        {
            pila.mostrar();
        }else{
            System.out.println("Ya la pila estaba Vacía");
        }
        
        menuPrincipal();
    }
    
    public void imprimirCima(){
        if(!pila.esVacia()){
             pila.cima();
        }else{
            System.out.println("La pila está vacía, nada que mostrar");
        }
       
        menuPrincipal();
    }
    
    public void imprimirTamano(){
        pila.tamano();
        menuPrincipal();
    }
    
    public void salir(){
        System.out.println("Gracias por utilizar el Gestor de Pilas");
        System.exit(0);
    }
    
    
}
