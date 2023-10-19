package myspring.customer.vo;


import java.sql.Date;


public class BookVO {
	private int id;
	private String titel;
	private String author;
	private String isbn;
	private Date created_at;
	
	
	
	
	public BookVO(int id, String titel, String author, String isbn, Date created_at) {
		super();
		this.id = id;
		this.titel = titel;
		this.author = author;
		this.isbn = isbn;
		this.created_at = created_at;
	}
	@Override
	public String toString() {
		return "BookVO [getId()=" + getId() + ", getTitel()=" + getTitel() + ", getAuthor()=" + getAuthor()
				+ ", getIsbn()=" + getIsbn() + ", getCreated_at()=" + getCreated_at() + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitel() {
		return titel;
	}
	public void setTitel(String titel) {
		this.titel = titel;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public Date getCreated_at() {
		return created_at;
	}
	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}

	

	


	
}