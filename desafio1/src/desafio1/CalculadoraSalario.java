package desafio1;

public class CalculadoraSalario {
	
	static double salarioMinimo = 1039.00;

	public static void main(String[] args) {
		double salarioBruto = 8000.00;
		
		System.out.println("salarioliq: " + calcularSalarioLiquido(salarioBruto));
		
	}
	
	private static int calcularSalarioLiquido(double salarioBruto) {
				
		if(salarioBruto < salarioMinimo) {
			return 0;
		}
		double inss = calcularINSS(salarioBruto);
		double irff = calcularIRFF(salarioBruto - inss);
		double salarioLiq = salarioBruto - inss - irff;
		return (int) Math.round(salarioLiq);
	}

	private static double calcularIRFF(double salarioInss) {
		double irff = 0;
		if(salarioInss <= 3000.00) {
			irff = salarioInss*0/100;
		}else if(salarioInss > 3000.00 && salarioInss <= 6000) {
			irff = salarioInss*7.5/100;
		}else if(salarioInss > 6000) {
			irff = salarioInss*15/100;
		}
		return irff;
	}

	private static double calcularINSS(double salarioBruto) {
		double inss= 0;
		if(salarioBruto <= 1500.00) {
			inss = salarioBruto*8/100;
		}else if(salarioBruto > 1500.00 && salarioBruto <= 4000) {
			inss = salarioBruto*9/100;
		}else if(salarioBruto > 4000) {
			inss = salarioBruto*11/100;
		}		
		return inss;
	}

}
