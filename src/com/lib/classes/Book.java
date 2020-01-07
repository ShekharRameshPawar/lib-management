package com.lib.classes;

import java.io.Serializable;

public class Book implements Serializable {

	private static final long serialVersionUID = 1L;
	private Long id;
	private String bname;

	public Book() {
	}

	public Book(Long id, String bname) {
		this.id = id;
		this.bname = bname;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", bname=" + bname + "]";
	}
	
}
