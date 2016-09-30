/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

/**
 *
 * @author rafael
 */
public class Insercion implements Ordenacion{
    
    	private static int[] numerosOrdenar=new int[20];
	
	public static int[] getNumerosOrdenar() {
		return numerosOrdenar;
	}

	public void setNumerosOrdenar(int[] numeros) {
			numerosOrdenar=numeros;
	}
	
	public int[] ordenar(){
		
		int [] arr=new int [20];
		arr=getNumerosOrdenar();
		
	    for (int i = 0; i < 20; i++)
	    {
	        int tmp = arr[i];
	        int j;
	        
	        for (j = i; j > 0; j--)
	        {
	            if (arr[j - 1] < tmp)
	                break;
	            arr[j] = arr[j - 1];
	        }
	 
	        arr[j] = tmp;
	    }
	    
	    return arr;
	    
	}
}
