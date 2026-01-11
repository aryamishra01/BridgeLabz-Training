package com.day1.browserbuddy;

class HistoryNode {
    String url;
    HistoryNode prev;
    HistoryNode next;

    public HistoryNode(String url) {
        this.url = url;
    }
}

