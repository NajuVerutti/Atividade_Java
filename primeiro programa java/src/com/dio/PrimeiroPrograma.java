package com.dio;

import com.dio.model.Gato;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		
		Gato gato = new Gato(null, null, null);
		Livros livros = new Livros();
		
		System.out.println(gato);
		System.out.println(livros);
		
		/*Integer a = 2;
		Integer b = 3;
		
		System.out.println("Hello World! " + (a+b));*/

	}

}

class Livros{
	private String nome;
	private Integer npags;
}