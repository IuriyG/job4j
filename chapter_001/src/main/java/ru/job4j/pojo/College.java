package ru.job4j.pojo;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFullName("George Tramp");
        student.setGroup(12);
        student.setReceiptDate("01.09.2004");
        System.out.println("Full name: " + student.getFullName() + "\n" + "Number of group: " + student.getGroup() + "\n" + "Receipt date: " + student.getReceiptDate());
    }
}
