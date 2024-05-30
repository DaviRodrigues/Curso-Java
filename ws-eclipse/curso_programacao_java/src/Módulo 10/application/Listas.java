package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Listas {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>(); // lista não aceita tipos primitivos apenas wrappers class

		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Ana");
		// adicionando um elemento em local específico da lista (passa a posição, porém
		// o que está naquela posição não desaparece)
		list.add(2, "Marco");

		System.out.println(list.size()); // tamanho da lista

		for (String x : list) {
			System.out.println(x);
		}
		System.out.println("----------------------------");
		// list.remove("Ana"); // consegue remover tanto pelo valor, quanto consegue
		// remover pelo index

		// list.remove(1);

		list.removeIf(x -> x.charAt(0) == 'M'); // removendo com uma condição(predicado) utilizando uma função lambda

		for (String x : list) {
			System.out.println(x);
		}
		System.out.println("----------------------------");
		System.out.println("Index of Bob " + list.indexOf("Bob"));
		System.out.println("Index of Marco " + list.indexOf("Marco")); // quando ele não encontra retorna -1
		System.out.println("----------------------------");

		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());

		for (String x : result) {
			System.out.println(x);
		}

		System.out.println("----------------------------");
		String name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null); // retorna nulo se não
																								// encontrar nada
		System.out.println(name);
	}

}
