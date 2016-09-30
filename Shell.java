package demo;

public class Shell implements Ordenacion{
	
	private static int[] numerosOrdenar=new int[20];
	
	public static int[] getNumerosOrdenar() {
		return numerosOrdenar;
	}

	public Shell() {
	}

	public void setNumerosOrdenar(int[] numeros) {
			numerosOrdenar=numeros;
	}

        @Override
	public int[] ordenar(){	
		int [] arr=new int [20];
		arr=getNumerosOrdenar();
		
		for (int i = 0; i < arr.length - 1; i++)
	    {
	        int min = i; 
	        for (int j = i + 1; j < arr.length; j++)
	        {
	            if (arr[j] < arr[min])
	                min = j;
	        }
	        swap(arr, i, min);
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
