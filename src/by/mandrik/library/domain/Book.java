package by.mandrik.library.domain;

import java.io.Serializable;


public class Book implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String author;
	private String title;

	private int year;
	private int row;
	private int cell;
	
	public Book(String author, String title, int year, int row, int cell){ 
		this.author = author;
		this.title = title;
		this.year = year;
		this.row = row;
		this.cell = cell;
	}
	//get()


	public Book(){}
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public void setYear(int year) {
		this.year = year;
	}


	public void setRow(int row) {
		this.row = row;
	}


	public void setCell(int cell) {
		this.cell = cell;
	}


	public String getAuthor(){
		return author;
	}
	public String getTitle(){
		return title;
	}
	public int getYear() {
		return year;
	}
	public int getRow() {
		return row;
	}
	public int getCell() {
		return cell;
	}
	public String toString(){
		return author +" "+ title +" "+ year +" "+ row +" "+ cell;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((author == null) ? 0 : author.hashCode());
		result = prime * result + cell;
		result = prime * result + row;
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		result = prime * result + year;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (author == null) {
			if (other.author != null)
				return false;
		} else if (!author.equals(other.author))
			return false;
		if (cell != other.cell)
			return false;
		if (row != other.row)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		if (year != other.year)
			return false;
		return true;
	}
}