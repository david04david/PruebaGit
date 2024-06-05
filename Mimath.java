package T5_Libreria;



public class Mimath {


	//Definición de las operaciones de la libreria
	
	//Potencia
		public static double potencia(double base, int exponente) {
	        if (exponente < 0) {
	            System.out.println("El exponente no puede ser negativo tio, espabila");
	        }
	
	        double resultado = 1;
	        for (int i = 0; i < exponente; i++) {
	            resultado *= base;
	        }
	        return resultado;
	        }
	
	//Factorial
		public static int factorial(int n) {
	        if (n < 0) {
	            System.out.println("No se puede calcular el factorial de un número negativo");
	        }
	
	        int resultado = 1;
	        for (int i = 1; i <= n; i++) {
	            resultado *= i;
	        }
	        return resultado;
	    }
			
	//Mayor que
			public static double mayor (double x, double y) {
	
				if (x>y) {
	
					return x;
	
				}else {
	
					return y;
	
				}
	
		}

	//Menor que
		public static double menor (double x, double y) {

			if (x<y) {

				return x;

			}else {

				return y;

			}

		}

	//Igual
		public static boolean igual (double x, double y) {

			return x==y;

		}

	//Calcular seno
		public static double calcularseno(double x) {
	        double resultado = x;
	        double termino = x;

	        for (int i = 1; i <= 10; i++) {
	            termino = -termino * x * x / ((2 * i) * (2 * i + 1));
	            resultado += termino;
	        }

	        return resultado;
	    }
		
	//Calcular coseno
		public static double calcularcoseno(double x) {
	        double resultado = 1;
	        double termino = 1;

	        for (int i = 1; i <= 10; i++) {
	            termino = -termino * x * x / ((2 * i) * (2 * i - 1));
	            resultado += termino;
	        }

	        return resultado;
	    }
		
	//Calcular tangente
		public static double calcularTangente(double x) {
	        double seno = calcularseno(x);
	        double coseno = calcularcoseno(x);

	        if (coseno != 0) {
	            return seno / coseno;
	        } else {
	            throw new ArithmeticException("La tangente es indefinida para este ángulo debido a coseno igual a cero.");
	        }
	    }
		
	//Calcular area del pentagono
		public static double calcularAreaPentagono(double lado, double apotema) {
			double perimetro = 5 * lado;
	        double area = (perimetro * apotema)/2;
	        return area;
	    }

//Comienzo del main
	public static void main(String args[]){

	//Potencia

		System.out.println("-----Potencia-----");

		double res1=Mimath.potencia(4, 5);

		System.out.println(res1);
		
	//Factorial
		
		System.out.println("----Factorial----");
		double res2=Mimath.factorial(5);
		System.out.println(res2);

	//Mayor que

		System.out.println("-----Mayor----");

		double res3=Mimath.mayor(5, 4);

		System.out.println(res3);

	//Menor que

		System.out.println("-----Menor----");

		double res4=Mimath.menor(5, 4);

		System.out.println(res4);

	//Igual

		System.out.println("-----Igual-----");

		boolean res5=Mimath.igual(4, 5);

		System.out.println(res5);
	
	//Seno
		
		System.out.println("-----Seno-----");
		
		double res6=Mimath.calcularseno(50);
		
		System.out.println(res6);

	//Coseno
		
		System.out.println("-----Coseno-----");
		
		double res7=Mimath.calcularcoseno(50);
		
		System.out.println(res7);
		
	//Tangente
		
		System.out.println("----Tangente----");
		
		double res8=Mimath.calcularTangente(1);
		
		System.out.println(res8);
		
	//Area Pentagono
		
		System.out.println("----AreaPentagono----");
				
		double res9=Mimath.calcularAreaPentagono(4,4);
				
		System.out.println(res9+" cm3");
		System.out.println("la chupan");
	}
	
}

