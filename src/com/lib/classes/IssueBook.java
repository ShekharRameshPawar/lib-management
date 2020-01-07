package com.lib.classes;

import java.io.Serializable;

public class IssueBook implements Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private Book bid;

	public IssueBook() {
	}

	public IssueBook(Long id, Book bid) {
		this.id = id;
		this.bid = bid;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Book getBid() {
		return bid;
	}

	public void setBid(Book bid) {
		this.bid = bid;
	}

	@Override
	public String toString() {
		return "IssueBook [id=" + id + ", bid=" + bid + "]";
	}

}
