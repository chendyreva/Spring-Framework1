package com.geekbrains.launcher.Book;


import javax.persistence.*;

@Entity
@Table(name = "book")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "worker_name")
    private String workerName;

    @Column(name = "worker_surname")
    private String workerSurname;

    @Column(name = "worker_salary")
    private int workerSalary;


    public Book() {
    }

    public Book(String workerName, String workerSurname, int workerSalary) {
        this.workerName = workerName;
        this.workerSurname = workerSurname;
        this.workerSalary = workerSalary;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getWorkerName() {
        return workerName;
    }

    public void setWorkerName(String workerName) {
        this.workerName = workerName;
    }

    public String getWorkerSurname() {
        return workerSurname;
    }

    public void setWorkerSurname(String workerSurname) {
        this.workerSurname = workerSurname;
    }

    public int getWorkerSalary() {
        return workerSalary;
    }

    public void setWorkerSalary(int workerSalary) {
        this.workerSalary = workerSalary;
    }


    @Override
    public String toString() {
        return "Worker{" + "id=" + id + ", workerName='" + workerName + '\'' + ", workerSurname='" + workerSurname + '\''
                + ", workerSalary='" + workerSalary + '}';
    }

}
