package com.markany.mysite.exception;

public class GuestbookRepositoryException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public GuestbookRepositoryException() {
		super("Guestbook Repository Exception");
		System.out.println("guestbook repo exception!");
	}
	
	public GuestbookRepositoryException(String message) {
		super(message);
	}
}
