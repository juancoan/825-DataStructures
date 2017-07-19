/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg825.proyecto1;

import java.util.Scanner;

/**
 *
 * @author Adolfo
 */
public class Dijkstra {
    
    	
	public String empezar(int _matriz[][])
        
        {
                //Las siguientes son las variables que se van a utilizar en el algoritmo.
            
                
                int matriz[][] = _matriz; //Bajamos la matriz del método a una variable local
                int[] preD = new int[5]; //Array predecesor
		int min = 9999; //El valor minimo o Infinito
                int siguienteFila = 0; // Contiene el valor del siguiente nodo
                int[] distancia = new int[5]; // Distancia de la matriz
		int[] visitado = new int[5]; // Array de vertices visitados
                String camino_final = null; // Va a contener el camino final
                String resultado = null; //El que va a retornar el método
		
                //En este ejemplo el cero significa que no hay conexión alguna con otros vértices
                //Matemáticamente esto se representa con el infinito.
                //Sin embargo el infinito no se puede representar en la computadora, por lo tanto
                //Se va a sustituir las entradas en cero por el número 9999.
		                
                for(int i=0; i < distancia.length; i++){
                    //Aprovechamos el Ciclo e Iniciamos los visitados con Ceros.
                    visitado[i] = 0;
                    preD[i] = 0;
                    
                    for (int j=0; j< distancia.length; j++)
                    {
                        if (matriz[i][j] == 0){
                            matriz[i][j] = 9999;
                        }
                    }
                    
                }
                
              /////////////Fin de las sistuciones del cero por infinito ///////
                
                
		distancia = matriz[0]; //Inicializa el arreglo de distancias
                visitado[0] = 1; //El primero ya es visitado por default
		distancia[0] = 0; //El primero tiene una distancia de cero
		
                
                //Inicio del algoritmo principal
                
                // 5 Ciclos para ir por todas las filas.
		for(int contador = 0; contador < 5; contador++){
			
                        // El infinito
			min = 9999;
                        
                      for(int i = 0; i < 5; i++){
				
                                //Si encontramos el minimo de esa fila, seguimos con otra fila
				if(min > distancia[i] && visitado[i]!=1){
					min = distancia[i];
                                        siguienteFila = i;
				}
				
			}
			
                      //Marcamos la casilla como que ya fue visitada
                        visitado[siguienteFila] = 1;
			
			for(int i = 0; i < 5; i++){
				
                            
				if(visitado[i]!=1){
                                       if(min+matriz[siguienteFila][i] < distancia[i]){
                                            distancia[i] = min+matriz[siguienteFila][i];
                                            preD[i] = siguienteFila;
						
					}
					
				}
				
			}
			
		}
		
               
                // La siguiente rutina es para imprimir los caminos
                
		int j;
                String abc[] = {"A","B","C","D","E"}; // Son 5 vertices vamos a utilizar letras
                
		for(int i = 0; i < 5; i++){
			
                        // Existe uno que no fue marcado
			if(i!=0){
				                            
				camino_final = abc[i];
				j = i;
                                //int a = 0;
				do{
					
					j=preD[j];
                                        camino_final = abc[j] + " --> " + camino_final;
					
				}while(j!=0);
				
			}
			
			
		}
              //Formateo de la variable final
              resultado = "La Ruta más corta sería " + camino_final;
              resultado = resultado + "\nCon un peso total de: " + distancia[4];
              
             //Retorno en el método
             return resultado;
            }
}	
    

