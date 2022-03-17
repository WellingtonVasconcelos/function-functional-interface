package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;
import java.util.stream.Collectors;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		List<Product> list = new ArrayList<>();

		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		//express�o labmda do tip FUNCTION
		Function<Product, String> func = p -> p.getName().toUpperCase();
		
		/*
		 * A fun��o "map" (n�o confunda com a estrutura de dados Map) � uma fun��o que aplica uma fun��o a todos elementos de uma stream (STREAM = Sequencia de dados.
		 */
		
		List<String> names = list.stream().map(func).collect(Collectors.toList());
		
		names.forEach(System.out::println);
	}

}
