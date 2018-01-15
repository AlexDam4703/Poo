package com.iesviergendelcarmen.poo.ejercicios;

import java.util.ArrayList;
import java.util.List;

public class TestBook {

	public static void main(String[] args) {
		Book book1 = new Book ("Cervantes", "El Quijote", "99887455315", "S.L.España");
		Book book2 = new Book ();
		//El de arriba seria usando el constructor, y el de abajo seria haciendolo por el constructor por defecto,
		book2.setAuthor("F.Rojas");
		book2.setTitle("La celestina");
		book2.setIsbn("457456265456");
		book2.setEditorial("S.L.Spain");
		
		List<Book> bookList = new ArrayList <> ();
		bookList.add(book1);
		bookList.add(book2);
	}

}
