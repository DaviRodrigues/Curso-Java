
public class operacao_split {

	public static void main(String[] args) {
		
		String s = "potato apple lemon";
		
		String[] vect = s.split(" ");
		
		for (int i = 0; i < 3; i++) {
			System.out.printf("%d - %s\n", i, vect[i]);
		}
		
	}

}
