package by.mandrik.library.domain;

public class Magazine {
	private String title;
	private String author;
	private int year;
	private int row;
	private int cell;

	public Magazine(String author, String title, int year, int row, int cell) {
		this.author = author;
		this.title = title;
		this.year = year;
		this.row = row;
		this.cell = cell;
	}

	public Magazine() {
	}

	public String toString() {
		return author + " " + title + " " + year + " " + row + " " + cell;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getCell() {
		return cell;
	}

	public void setCell(int cell) {
		this.cell = cell;
	}
}
