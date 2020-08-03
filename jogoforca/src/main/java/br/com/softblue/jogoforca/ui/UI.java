package br.com.softblue.jogoforca.ui;

import java.util.Scanner;

import br.com.softblue.jogoforca.core.InvalidCharacterExcception;

public class UI {

	public static void print(Object object) {
		System.out.println(object);
	}
	
	public static void printNewLine()
	{
		System.out.println();
	}
	
	@SuppressWarnings("resource")
	public static  char readChar(String text) throws InvalidCharacterExcception {
		System.out.println(text + " ");
		
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		
		if(line.trim().isEmpty()) {
			throw new InvalidCharacterExcception("Nenhuma letra foi digitada");
		}
		
		if (line.length() > 1) {
			throw new InvalidCharacterExcception("Apenas letra deve ser digitada");
		}
		
		char c = line.charAt(0);
		
		if (!Character.isLetter(c)) {
			throw new InvalidCharacterExcception("Apenas letars devem ser digitadas");
		}
		return c;
	}
}
