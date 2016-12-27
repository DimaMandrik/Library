package by.mandrik.library.logic;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import by.mandrik.library.domain.Book;
import by.mandrik.library.domain.Magazine;

public class Method implements Operable {
	Scanner sc;

	@Override
	public void addBooks(ArrayList<Book> books) {
		List<String> lines = null;
		try {
			lines = Files.readAllLines(Paths.get("res/books.txt"),
					StandardCharsets.UTF_8);
		} catch (FileNotFoundException e) {
			System.out.println("ERROR");
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		for (int i = 0; i < lines.size(); i++) {
			String[] s = new String[5];
			s = lines.get(i).split(" ");
			Book book = new Book();
			book.setAuthor(s[0]);
			book.setTitle(s[1]);
			book.setYear(Integer.parseInt(s[2]));
			book.setRow(Integer.parseInt(s[3]));
			book.setCell(Integer.parseInt(s[4]));
			books.add(book);
		}
	}

	@Override
	public void addMagazines(ArrayList<Magazine> magazines) {
		List<String> lines = null;
		try {
			lines = Files.readAllLines(Paths.get("res/magazines.txt"),
					StandardCharsets.UTF_8);
		} catch (FileNotFoundException e) {
			System.out.println("ERROR");
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		for (int i = 0; i < lines.size(); i++) {
			String[] s = new String[5];
			s = lines.get(i).split(" ");
			Magazine magazine = new Magazine();
			magazine.setAuthor(s[0]);
			magazine.setTitle(s[1]);
			magazine.setYear(Integer.parseInt(s[2]));
			magazine.setRow(Integer.parseInt(s[3]));
			magazine.setCell(Integer.parseInt(s[4]));
			magazines.add(magazine);
		}
	}

	// show all books and magazines
	@Override
	public void showLibrary(ArrayList<Book> books, ArrayList<Magazine> magazines) {
		for (int i = 0; i < books.size(); i++) {
			if (books.get(i) == null) {
			} else
				System.out.println(books.get(i).toString());
		}
		for (int i = 0; i < magazines.size(); i++) {
			if (magazines.get(i) == null) {
			} else
				System.out.println(magazines.get(i).toString());
		}
	}

	// remove book
	@Override
	public void removeBook(ArrayList<Book> books) {
		System.out.println("Delete book by author:");
		sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		for (int i = 0; i < books.size(); i++) {
			if (books.get(i).getAuthor().equals(s1)) {
				books.remove(i);
			} else
				System.out.println("not found");
		}
	}

	// remove magazine
	@Override
	public void removeMagazine(ArrayList<Magazine> magazines) {
		System.out.println("Delete magazine by author:");
		sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		for (int i = 0; i < magazines.size(); i++) {
			if (magazines.get(i).getAuthor().equals(s1)) {
				magazines.remove(i);
			} else
				System.out.println("not found");
		}
	}

	// find by author
	@Override
	public void findByAuthor(ArrayList<Book> books,
			ArrayList<Magazine> magazines) {
		sc = new Scanner(System.in);
		System.out.println("Find book by author:");
		for (int i = 0; i < books.size(); i++) {
			if (books.get(i) != null) {
				String s1 = sc.nextLine();
				if (s1.equals(books.get(i).getAuthor())) {
					System.out.println(books.get(i).toString());
				} else
					System.out.println("not found");
			}
		}
		System.out.println("Find magazine by edition:");
		for (int i = 0; i < magazines.size(); i++) {
			if (magazines.get(i) != null) {
				String s1 = sc.nextLine();
				if (s1.equals(magazines.get(i).getAuthor())) {
					System.out.println(magazines.get(i).toString());
				} else
					System.out.println("not found");
			}
		}
	}

	// find by year
	@Override
	public void findByYear(ArrayList<Book> books, ArrayList<Magazine> magazines) {
		sc = new Scanner(System.in);
		System.out.println("Find book by year:");
		for (int i = 0; i < books.size(); i++) {
			if (books.get(i) != null) {
				int s1 = sc.nextInt();
				if (s1 == books.get(i).getYear()) {
					System.out.println(books.get(i).toString());
				} else
					System.out.println("not found");
			}
			System.out.println("Find magazine by date:");
		}
		for (int i = 0; i < magazines.size(); i++) {
			if (magazines.get(i) != null) {
				int s1 = sc.nextInt();
				if (s1 == (magazines.get(i).getYear())) {
					System.out.println(magazines.get(i).toString());
				} else
					System.out.println("not found");
			}
		}
	}
}
