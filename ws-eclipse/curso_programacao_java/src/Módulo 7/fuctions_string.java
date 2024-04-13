
public class fuctions_string {

	public static void main(String[] args) {
		
		String original = "abcde FGHIJ ABC abc DEFG   ";
		
		String s01 = original.toLowerCase();
		String s02 = original.toUpperCase();
		String s03 = original.trim(); // elimina espaços em branco
		String s04 = original.substring(2); // pega o caracter de um index em diante
		String s05 = original.substring(2, 9); // pega do caracter com o index inicial até o com index final, discarta o último número
		String s06 = original.replace("a", "x"); // troca em todos os lugares da string o caracter ou string
		String s07 = original.replace("abc", "xy");
		int i = original.indexOf("bc");
		int j = original.lastIndexOf("bc");
		
		
		System.out.println("Original : " + original);
		System.out.println("toLowerCase: " + s01);
		System.out.println("toUpperCase: " + s02);
		System.out.println("trim: " + s03);
		System.out.println("substring(2): " + s04);
		System.out.println("substring(2,9) (com inicio e final setados): " + s05);
		System.out.println("replace('a','x'): " + s06);
		System.out.println("replace('abc','xy'): " + s07);
		System.out.println("indexOf: " + i);
		System.out.println("lastIndexOf: " + j);
		
	}

}
