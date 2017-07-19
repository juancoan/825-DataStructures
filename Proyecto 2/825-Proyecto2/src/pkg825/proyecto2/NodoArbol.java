/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg825.proyecto2;

/**
 *
 * @author Adolfo
 */

//La siguiente clase es para definir el nodo del arbol
// De esta forma le damos forma al puntero

class NodoArbol {

        //En este caso se va a diferenciar
        //Si el nodo es derecho o es izquierdo.
	
	NodoArbol nodoizquierdo;
	NodoArbol nododerecho;
        int numero;  //El Entero a insertar.

	
        //Se inicia el dato y el nodo se convierte en una hoja.
	public NodoArbol(int numeroNodo)
	{
		numero = numeroNodo;
                //Hay que inicializar los nodos en nulo
		nodoizquierdo = nododerecho = null; 
	}

	
        // En esta se hace la comparacion para saber si el 
        //numero hay que insertarlo del lado izquierdo o del lado derecho.
	
        public synchronized void insertar(int valorInsertar)
	{
		//Insertar del lado izquierdo
		if (valorInsertar < numero){

			//Crea un nuevo nodo en el arbol
			if (nodoizquierdo == null)
				nodoizquierdo = new NodoArbol(valorInsertar);
			else //sigue recursivamente insertando del lado izquierdo
				nodoizquierdo.insertar(valorInsertar);
		}

		//insertar del lado derecho
		else if(valorInsertar > numero){

		//Crea un nuevo nodo en el arbol
		if (nododerecho == null)
			nododerecho = new NodoArbol(valorInsertar);
		else //sigue recursivamente insertando del lado derecho
			nododerecho.insertar(valorInsertar);
		}
	} 

} 