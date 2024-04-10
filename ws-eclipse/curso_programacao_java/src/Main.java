import java.util.Locale;

public class Main {
    public static void main(String[] args) {
    	Locale.setDefault(Locale.US);
    	
    	int y, idade;
    	double x, renda;
    	
    	// Não quebra linha
        System.out.print("Hello World");
        // Quebra linha
        System.out.println("Bom dia!");
        
        y = 32;
        x = 10.35784;
        
        System.out.println(y);
        
        // Nesse caso é para formatar
        System.out.printf("%.2f%n",x);
        
        System.out.printf("%.4f%n",x);
        
        System.out.printf("Resultado = %.2f metros\n", x);
        
        String nome = "Maria";
        
        idade = 31;
        
        renda = 4000.0;
        
        System.out.printf("%s tem %d anos e ganha R$ %.2f reais\n", nome, idade, renda);
    }
}
