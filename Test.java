package demo;

class Test {
	
	public static void main(String[] args) {
		
		int[ ] numeros={4,6,0,9,55,7,8,11,56,2,1,100,32,78,5,22,101,25,71,29};
		
		Shell o1=new Shell();
		o1.setNumerosOrdenar(numeros);
		
		imprimirArreglo(o1,numeros);
                
                Burbuja o2=new Burbuja();
		o2.setNumerosOrdenar(numeros);
		
		imprimirArreglo(o2,numeros);
  
                Insercion o3=new Insercion();
		o3.setNumerosOrdenar(numeros);
		
		imprimirArreglo(o3,numeros);
                
                
                
		
	}

	public static void imprimirArreglo(Ordenacion s, int[] array) {
		int[] in = s.ordenar();
		int n = in.length;

		for (int i = 0; i < n; i++) {	
			if(i != (n-1))
				System.out.print(in[i] + " - ");
			else
				System.out.print(in[i]);
		}

		System.out.print("\n");
	}
        
}