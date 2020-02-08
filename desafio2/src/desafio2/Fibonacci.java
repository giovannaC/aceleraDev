package desafio2;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {


	private static int fmax = 350;
	
	public static void main(String[] args) {
		fibonacci();
		System.out.println(isFibonacci(377));
	}
	
	public static List<Integer> fibonacci() {
		List<Integer> fibonacci = new ArrayList<Integer>();
		fibonacciAdicionarAte(fibonacci, fmax);
		
		
		return fibonacci;
	}
	
	private static List<Integer> fibonacciAdicionarAte(List<Integer> fibonacci, int n) {
		if(fibonacci.size() == 0) {
			fibonacci.add(0);
			fibonacci.add(1);
		}
		int fn = fibonacci.get(fibonacci.size()-1) + fibonacci.get(fibonacci.size()-2);
		if(fibonacci.get(fibonacci.size()-1) <= n){
			fibonacci.add(fn);
			fibonacciAdicionarAte(fibonacci, n);
		}else {
			return fibonacci;
		}
		return fibonacci;
	}

	public static Boolean isFibonacci(Integer a) {
		List<Integer> fibonacci = fibonacci();
		for (int i = 0; i<fibonacci.size(); i++) {
			if(fibonacci.get(i).intValue() == a) {
				return true;
			}
		}
		return false;
	}


}
