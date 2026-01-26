package com.feedbackguru;

public class Feedback<T> {
	private T feedbackType;
	private String message;
	private int rating;

	public Feedback(T feedbackType, String message, int rating) {
		this.feedbackType = feedbackType;
		this.message = message;
		this.rating = rating;
	}

	public T getFeedbackType() {
		return feedbackType;
	}

	public String getMessage() {
		return message;
	}

	public int getRating() {
		return rating;
	}
}