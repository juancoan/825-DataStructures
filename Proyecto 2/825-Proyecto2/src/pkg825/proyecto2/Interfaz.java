/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg825.proyecto2;

import java.util.Scanner;

/**
 *
 * @author Adolfo
 */
public class Interfaz {
    
    //El siguiente crea un scanner para obtener los valores del usuario.
    Scanner scan = new Scanner(System.in);
    //Aunque se vaya a manejar posteriormente como int, aqui lo manejaremos como string
    String input = ""; 
    
    Arbol arbol = new Arbol(); //Se instancia al Arbol Binario
    int valor; //Cuando ya el input sea validado lo trasladamos aqui.
    
    //Para conservar el titulo
    public void titulo(){
        System.out.println("\n");
        System.out.println("Bienvenido al Arbol Binario");
        
    }
    
    //Este es el metodo principal que maneja al menu
    public void menuPrincipal(){
        titulo();
        
        System.out.println("Por Favor escoja una opción\n");
        System.out.println("a) Insertar los elementos en el Arbol");
        System.out.println("b) Mostrar los datos en Pre-Orden");
        System.out.println("c) Mostrar los datos en In-Orden");
        System.out.println("d) Mostrar los datos en Post-Orden");
        System.out.println("e) Salir");
        
        System.out.print("Digite la Opcion: ");
        input = scan.nextLine();
        
        //Aqui se valida que solo las opciones del menu son validas.
        while (!input.equals("a") && !input.equals("b") && !input.equals("c") && !input.equals("d") && !input.equals("e"))
        {            
            System.out.println(input);
            System.out.println("Opción Invalida");
            System.out.print("Digite la Opcion: ");
            input = scan.nextLine();
            
        }
         
        if(input.equals("a")){
            insertarDatos();
            pausa();
            menuPrincipal();
        }
        
         if(input.equals("b")){
                     
            mostrarPreorden();
            pausa();
            menuPrincipal();
        }
         
        if(input.equals("c")){
            mostrarInorden();
            pausa();
            menuPrincipal();
        }
        
        if(input.equals("d")){
            mostrarPosorden();
            pausa();
            menuPrincipal();
        }
        
        if(input.equals("e")){
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
         
         
         System.out.println("Insertando el numero " + input);
         //Despues de haber validado, ahora insertamos en el arbol.
         arbol.insertarNodo(Integer.parseInt(input));
         
         
        }
        
        public void mostrarPreorden(){
            arbol.Preorden();
        }
        
        public void mostrarPosorden(){
            arbol.Posorden();
        }
        
        public void mostrarInorden(){
            arbol.Inorden();
        }
    
        
        public void salir(){
        System.out.println("Gracias por utilizar el Arbol Binario");
        System.exit(0);
    }
        
        public void pausa(){
            System.out.println("Presione cualquier tecla para continuar");
            try{System.in.read();}
            catch(Exception e){}
        }
}

