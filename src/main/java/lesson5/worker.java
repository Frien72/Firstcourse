package lesson5;

import java.security.PublicKey;

public class worker {
    String fullName;
    String jobTitle;
    String email;
    String phone;
    int salary;
    int age;




    public worker(String fullName, String jobTitle, String email, String phone, int salary, int age) {
        this.fullName = fullName;
        this.jobTitle = jobTitle;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }
    public String toString() {
        return String.format(" Full name: %s \n Job title: %s \n email: %s \n phone: %s \n salary: %d \n age: %s \n",
        fullName, jobTitle, email, phone, salary, age);
    }
}
