package com.day11.avltree3;

public class HospitalAVL {

	private PatientNode root;

    int height(PatientNode node) {
        if (node == null) return 0;
        return node.height;
    }

    int getBalance(PatientNode node) {
        if (node == null) return 0;
        return height(node.left) - height(node.right);
    }

    PatientNode rightRotate(PatientNode y) {

        PatientNode x = y.left;
        PatientNode t2 = x.right;

        x.right = y;
        y.left = t2;

        y.height = Math.max(height(y.left), height(y.right)) + 1;
        x.height = Math.max(height(x.left), height(x.right)) + 1;

        return x;
    }

    PatientNode leftRotate(PatientNode x) {

        PatientNode y = x.right;
        PatientNode t2 = y.left;

        y.left = x;
        x.right = t2;

        x.height = Math.max(height(x.left), height(x.right)) + 1;
        y.height = Math.max(height(y.left), height(y.right)) + 1;

        return y;
    }

    PatientNode insert(PatientNode node, int time, String name) {

        if (node == null)
            return new PatientNode(time, name);

        if (time < node.time)
            node.left = insert(node.left, time, name);
        else if (time > node.time)
            node.right = insert(node.right, time, name);
        else
            return node;

        node.height = 1 + Math.max(height(node.left), height(node.right));

        int balance = getBalance(node);

        if (balance > 1 && time < node.left.time)
            return rightRotate(node);

        if (balance < -1 && time > node.right.time)
            return leftRotate(node);

        if (balance > 1 && time > node.left.time) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }

        if (balance < -1 && time < node.right.time) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        return node;
    }

    PatientNode minValueNode(PatientNode node) {
        PatientNode current = node;
        while (current.left != null)
            current = current.left;
        return current;
    }

    PatientNode delete(PatientNode root, int time) {

        if (root == null)
            return root;

        if (time < root.time)
            root.left = delete(root.left, time);
        else if (time > root.time)
            root.right = delete(root.right, time);
        else {

            if (root.left == null || root.right == null) {

                PatientNode temp;
                if (root.left != null)
                    temp = root.left;
                else
                    temp = root.right;

                if (temp == null) {
                    root = null;
                } else {
                    root = temp;
                }
            } else {

                PatientNode temp = minValueNode(root.right);
                root.time = temp.time;
                root.name = temp.name;
                root.right = delete(root.right, temp.time);
            }
        }

        if (root == null)
            return root;

        root.height = Math.max(height(root.left), height(root.right)) + 1;

        int balance = getBalance(root);

        if (balance > 1 && getBalance(root.left) >= 0)
            return rightRotate(root);

        if (balance > 1 && getBalance(root.left) < 0) {
            root.left = leftRotate(root.left);
            return rightRotate(root);
        }

        if (balance < -1 && getBalance(root.right) <= 0)
            return leftRotate(root);

        if (balance < -1 && getBalance(root.right) > 0) {
            root.right = rightRotate(root.right);
            return leftRotate(root);
        }

        return root;
    }

    void registerPatient(int time, String name) {
        root = insert(root, time, name);
        System.out.println("Patient registered");
    }

    void dischargePatient(int time) {
        root = delete(root, time);
        System.out.println("Patient discharged if existed");
    }

    void displayPatients() {
        if (root == null) {
            System.out.println("No patients in queue");
            return;
        }
        System.out.println("Patients by arrival time");
        inorder(root);
    }

    void inorder(PatientNode node) {
        if (node == null) return;
        inorder(node.left);
        System.out.println("Time " + node.time + " Name " + node.name);
        inorder(node.right);
    }
}
