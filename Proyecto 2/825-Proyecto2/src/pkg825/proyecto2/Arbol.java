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


 class Arbol{
	private NodoArbol raiz;

	//Aqui se construye un arbol que empieza en nulo
	public Arbol()
	{
		raiz = null;
	}

	//Aqui se inserta un nuevo nodo en el arbol
	public synchronized void insertarNodo(int valorInsertar)
	{
            
		if(raiz == null)
			raiz = new NodoArbol(valorInsertar); //Nodo Raiz

		else
			raiz.insertar(valorInsertar); // llama al metodo insertar
	}

	//El siguiente metodo se hace el recorrido Preorden
        //Se utiliza el keyword syncronized para que este metodo no produzca
        //errores cuando los hilos accesen a las mismas variables.
	public synchronized void Preorden()
	{
            
            auxPreorden(raiz);
	}
	//metodo recursivo para recorrido en preorden

	private void auxPreorden(NodoArbol nodo)
	{
		if (nodo == null){
			return;
                }
                
		System.out.print(nodo.numero + " "); // mostrar datos del nodo
		auxPreorden(nodo.nodoizquierdo); //recorre subarbol izquierdo
		auxPreorden(nodo.nododerecho); //recorre subarbol derecho
	}
   
	public synchronized void Inorden()
	{
		auxInorden(raiz);
	}

	// metodo recursivo para recorrido inorden

	private void auxInorden(NodoArbol nodo)
	{
		if (nodo == null)
			return;

		auxInorden(nodo.nodoizquierdo);
		System.out.print(nodo.numero + " ");
		auxInorden(nodo.nododerecho);
	}

	
	public synchronized void Posorden()
	{
		auxPosorden(raiz);
	}

	//metodo recursivo para recorrido posorden

	private void auxPosorden(NodoArbol nodo)
	{
		if (nodo == null)
			return;

		auxPosorden(nodo.nodoizquierdo);
		auxPosorden(nodo.nododerecho);
		System.out.print(nodo.numero + " ");
	}

}
