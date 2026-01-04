package com.linkedlist.singlylinkedlist.socialmediafriendconnections;

public class SocialMediaLinkedList {

	private UserNode head;

    /* Add User */
    public void addUser(int id, String name, int age) {
        UserNode node = new UserNode(id, name, age);
        node.next = head;
        head = node;
    }

    /* Add Friend Connection (Bidirectional) */
    public void addFriend(int userId1, int userId2) {
        UserNode u1 = getUser(userId1);
        UserNode u2 = getUser(userId2);

        if (u1 == null || u2 == null) {
            System.out.println("User not found");
            return;
        }

        addFriendToList(u1, userId2);
        addFriendToList(u2, userId1);

        System.out.println("Friend connection added");
    }

    private void addFriendToList(UserNode user, int friendId) {
        FriendNode node = new FriendNode(friendId);
        node.next = user.friends;
        user.friends = node;
    }

    /* Remove Friend Connection */
    public void removeFriend(int userId1, int userId2) {
        UserNode u1 = getUser(userId1);
        UserNode u2 = getUser(userId2);

        if (u1 == null || u2 == null) {
            System.out.println("User not found");
            return;
        }

        removeFriendFromList(u1, userId2);
        removeFriendFromList(u2, userId1);

        System.out.println("Friend connection removed");
    }

    private void removeFriendFromList(UserNode user, int friendId) {
        FriendNode curr = user.friends, prev = null;

        while (curr != null) {
            if (curr.friendId == friendId) {
                if (prev == null)
                    user.friends = curr.next;
                else
                    prev.next = curr.next;
                return;
            }
            prev = curr;
            curr = curr.next;
        }
    }

    /* Find Mutual Friends */
    public void findMutualFriends(int userId1, int userId2) {
        UserNode u1 = getUser(userId1);
        UserNode u2 = getUser(userId2);

        if (u1 == null || u2 == null) {
            System.out.println("User not found");
            return;
        }

        System.out.println("Mutual Friends:");
        FriendNode f1 = u1.friends;

        while (f1 != null) {
            FriendNode f2 = u2.friends;
            while (f2 != null) {
                if (f1.friendId == f2.friendId) {
                    System.out.println("User ID: " + f1.friendId);
                }
                f2 = f2.next;
            }
            f1 = f1.next;
        }
    }

    /* Display All Friends of a User */
    public void displayFriends(int userId) {
        UserNode user = getUser(userId);

        if (user == null) {
            System.out.println("User not found");
            return;
        }

        System.out.print("Friends of " + user.name + ": ");
        FriendNode temp = user.friends;

        if (temp == null) {
            System.out.println("No friends");
            return;
        }

        while (temp != null) {
            System.out.print(temp.friendId + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    /* Search by User ID */
    public void searchByUserId(int id) {
        UserNode temp = head;

        while (temp != null) {
            if (temp.userId == id) {
                displayUser(temp);
                return;
            }
            temp = temp.next;
        }

        System.out.println("User not found");
    }

    /* Search by Name */
    public void searchByName(String name) {
        UserNode temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.name.equalsIgnoreCase(name)) {
                displayUser(temp);
                found = true;
            }
            temp = temp.next;
        }

        if (!found)
            System.out.println("User not found");
    }

    /* Count Friends */
    public void countFriends() {
        UserNode temp = head;

        while (temp != null) {
            int count = 0;
            FriendNode f = temp.friends;
            while (f != null) {
                count++;
                f = f.next;
            }
            System.out.println(temp.name + " has " + count + " friends");
            temp = temp.next;
        }
    }

    /* Helper Methods */
    private UserNode getUser(int id) {
        UserNode temp = head;
        while (temp != null) {
            if (temp.userId == id)
                return temp;
            temp = temp.next;
        }
        return null;
    }

    private void displayUser(UserNode u) {
        System.out.println("User ID: " + u.userId +
                ", Name: " + u.name +
                ", Age: " + u.age);
    }
}
