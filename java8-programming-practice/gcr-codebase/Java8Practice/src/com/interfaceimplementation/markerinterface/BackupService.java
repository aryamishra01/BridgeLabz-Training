package com.interfaceimplementation.markerinterface;

interface BackupSerializable {
    // marker interface (empty)
}


class Employee implements BackupSerializable {
    private int id;
    private String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class BackupService {

	public static void backup(Object obj) {
		
        if (obj instanceof BackupSerializable) {
            System.out.println("Backing up object: " + obj.getClass().getSimpleName());
        } else {
            System.out.println("Backup not allowed for this object");
        }
    }

    public static void main(String[] args) {
        Employee emp = new Employee(1, "Arya");
        String data = "Test";

        backup(emp);
        backup(data);
    }
}
