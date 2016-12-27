package by.mandrik.library.logic;

import java.util.ArrayList;

import by.mandrik.library.domain.Book;
import by.mandrik.library.domain.Magazine;

public interface Operable {
	void addBooks(ArrayList<Book> books);	
	void addMagazines(ArrayList<Magazine> magazines);
	void findByYear(ArrayList<Book> books, ArrayList<Magazine> magazines);
	void findByAuthor(ArrayList<Book> books, ArrayList<Magazine> magazines);
	void removeMagazine(ArrayList<Magazine> magazines);
	void removeBook(ArrayList<Book> books);
	void showLibrary(ArrayList<Book> books, ArrayList<Magazine> magazines); 
}
