package com.day1.feedbackguru;

class Feedback<T> {
    T type;
    String text;
    int rating;

    public Feedback(T type, String text, int rating) {
        this.type = type;
        this.text = text;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "[" + type + "] (" + rating + "/10) " + text;
    }
}

