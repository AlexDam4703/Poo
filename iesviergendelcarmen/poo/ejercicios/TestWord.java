package com.iesviergendelcarmen.poo.ejercicios;

import java.util.Scanner;

public class TestWord {

	public static void main(String[] args) {
		System.out.println("Intruduce una palabra");
		Scanner sc = new Scanner (System.in);
		String data = sc.next();
		sc.close();
		Word word = new Word (data);
		System.out.println(word);
		System.out.printf("Palabra en mayúscula es %s y en minúscula es %s%n", word.getDataInUpperCase(), word.getDataInLowerCase());
		System.out.printf("El numero de caracteres es %d%n", word.getNumberOfCharacterData());
		char newChar = 'o';
		char oldChar = 'u';
		System.out.printf("Cambiamos caracter %c por %c quedando: %s%n",oldChar,newChar,word.getReplaceInData(oldChar, newChar));
		System.out.printf("Primera letra de la palabra %c y ultima: %c%n",word.getFirstCharacterOfData(),word.getLastCharacterOfData());
	}

}
