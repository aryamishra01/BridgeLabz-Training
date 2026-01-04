package com.linkedlist.singlylinkedlist.socialmediafriendconnections;

public class UserNode {

	 int userId;
	    String name;
	    int age;

	    FriendNode friends;   // head of friend list
	    UserNode next;

	    UserNode(int userId, String name, int age) {
	        this.userId = userId;
	        this.name = name;
	        this.age = age;
	        this.friends = null;
	        this.next = null;
	    }
}
