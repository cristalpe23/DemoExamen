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
public class Burbuja implements Ordenacion{
    
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
		
	    for (int i = arr.length - 1; i >= 0; i--)
	    {
	        for (int j = 0; j <= i - 1; j++)
	        {
	            if (arr[j] > arr[j + 1])
	                swap(arr, j, j + 1);
	        }
	    }
		return arr;
	}
	
	public static void swap (int[] arr, int i, int j)
	{
	    int temp = arr[i];
	    arr[i] = arr[j];
	    arr[j] = temp;
	}

    
}
