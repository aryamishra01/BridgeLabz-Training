package com.linkedlist.singlylinkedlist.socialmediafriendconnections;

public class SocialMediaApp {

	public static void main(String[] args) {

        SocialMediaLinkedList social = new SocialMediaLinkedList();

        social.addUser(1, "Amit", 22);
        social.addUser(2, "Neha", 21);
        social.addUser(3, "Rahul", 23);
        social.addUser(4, "Sneha", 20);

        social.addFriend(1, 2);
        social.addFriend(1, 3);
        social.addFriend(2, 3);
        social.addFriend(2, 4);

        social.displayFriends(1);
        social.displayFriends(2);

        social.findMutualFriends(1, 2);

        social.searchByUserId(3);
        social.searchByName("Sneha");

        social.countFriends();

        social.removeFriend(1, 3);

        System.out.println("\nAfter Removing Friendship:");
        social.displayFriends(1);
        social.displayFriends(3);
    }
}
