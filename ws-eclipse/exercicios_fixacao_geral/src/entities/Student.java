package entities;

public class Student {
	
	public String name;
	
	public void notaSemestre(double nota1, double nota2, double nota3) {
		double notaTotal = nota1 + nota2 + nota3;
		mostrarResultados(notaTotal);
	}
	
	public void mostrarResultados(double notaTotal) {
		System.out.println("FINAL GRADE = " + notaTotal);
		String resultado = aprovadoOuNaoAprovado(notaTotal);
		System.out.println(resultado);
	}
	
	public String aprovadoOuNaoAprovado(double notaTotal) {
		if (notaTotal >= 60.0) {
			return "PASS";
		} else {
			double falta = pontosRestantes(notaTotal);
			return "FAILED\n" + "MISSING " + falta + " POINTS";
		}
	}
	
	public double pontosRestantes(double notaTotal) {
		return 60.0 - notaTotal;
	}
	
}
