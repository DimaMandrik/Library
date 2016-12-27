 package by.mandrik.library.run;

import java.util.ArrayList;

import by.mandrik.library.domain.Book;
import by.mandrik.library.domain.Magazine;
import by.mandrik.library.logic.Method;

public class Main {


	public static void main(String[] args) {
		Method m = new Method();
		ArrayList <Book> books = new ArrayList<Book>();
		ArrayList<Magazine> magazines = new ArrayList<Magazine>();
		m.addBooks(books);
		m.addMagazines(magazines);
		m.showLibrary(books, magazines);
		//m.findByAuthor(books, magazines);
		//m.findByYear(books, magazines);
		m.removeBook(books);
		//m.removeMagazine(magazines);
		//m.showLibrary(books,magazines);
	}
}