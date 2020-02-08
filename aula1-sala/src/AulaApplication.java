
import java.util.Scanner;

public class AulaApplication {
	
	public static void main(String[] args) {
		
		exercicio1();
		exercicio2a();
		exercicio2b();
		exercicio2c();
		exercicio2d();
		exercicio2e();
		exercicio2f();
		System.out.println(exercicio3a());
		System.out.println(exercicio3b());
		System.out.println(exercicio3c());
		Scanner in = new Scanner(System.in);
		exercicio5(in);
		System.out.println(exercicio7(25, 10, 6));
		exercicio8(200, 24, 40, 136);
	}
	
	public static void exercicio1() {
		System.out.println("Exercicio 1 -");
		int a = 10;
		int b = 20;
		int aux = 0;
		
		System.out.println("Antes ---- a: " + a + " b: " + b);
		
		aux = a;
		a = b;
		b = aux;
		
		System.out.println("Depois ---- a: " + a + " b: " + b);
		
	}
	
	public static void exercicio2a() {
		System.out.println("Exercicio 2 a -");
		int a = 10;
		int b = 20;
		
		System.out.println("b: " + b);
		b = 5;
		System.out.println("a: " + a + " b: " + b);
		
	}
	
	
	
	public static void exercicio2b() {
		System.out.println("Exercicio 2 b -");
		int a = 30;
		int b = 20;
		int c = a + b;
		
		System.out.println("c: " + c);
		
		b = 10;
		
		System.out.println("b: " + b + " c: " + c);
		
		c = a + b;
		
		System.out.println("a: " + a + " b: " + b + " c: " + c);
		
	}
	
	public static void exercicio2c() {
		System.out.println("Exercicio 2 c -");
		int a = 10;
		int b = 20;
		int c;
		
		c = a;
		b = c;
		a = b;
		
		System.out.println("a: " + a + " b: " + b + " c: " + c);
		
	}
	
	public static void exercicio2d() {
		System.out.println("Exercicio 2 d -");
		int a = 10;
		int b = a + 1;
		
		a = b + 1;
		b = a + 1;
		b = a + 1;
		
		System.out.println("a: " + a);
		
		a = b + 1;
		
		System.out.println("a: " + a + " b: " + b);
		
	}
	
	public static void exercicio2e() {
		System.out.println("Exercicio 2 e -");
		int a = 10;
		int b = 5;
		int c = a + b;
		
		b = 20;
		a = 10;
		
		System.out.println("a: " + a + " b: " + b + " c: " + c);
		
	}
	
	public static void exercicio2f() {
		System.out.println("Exercicio 2 f -");
		int x = 1;
		int y = 2;
		int z = y - x;
		
		System.out.println("z: " + z);
		
		x = 5;
		y = x + z;
		
		System.out.println("x: " + x + " y: " + y + " z: " + z);
	}
	
	public static boolean exercicio3a() {
		return ( (4/2)+(2/4) == 4/2+2/4 );
	}
	
	public static boolean exercicio3b() {
		return ( 4/(2+2)/4 == 4/2+2/4 );
	}
	
	public static boolean exercicio3c() {
		return ( (4+2)*2-4 == 4+2*2-4 );
	}
	
	public static void exercicio5(Scanner in) {
		System.out.println("antecessor: " + (in.nextInt() - 1));
	}
	
	public static void exercicio6(int w, int h) {
		System.out.println("area: " + (w*h));
	}
	
	public static int exercicio7(int y, int m, int d) {
		int result = ((m+(y*12)) * 30) + d;
		return result;
	}
	
	public static void exercicio8(int t, int b, int n, int v) {
		System.out.println("Total: " + t);
		auxExercicio8("Branco", t, b);
		auxExercicio8("Nulo", t, n);
		auxExercicio8("Valido", t, v);
	}
	
	public static void auxExercicio8(String nome, int a, int b) {
		System.out.println(nome+ ": " + 100*b/a + "%");
	}
	
	public static void exercicio9() {
		
	}
	
	

}