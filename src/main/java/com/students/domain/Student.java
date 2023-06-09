package com.students.domain;

import jakarta.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.Date;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String middleName;
    private String lastName;
    private String email;
    private String password;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birthday;

    @ManyToOne
    @JoinColumn(name = "group_id")
    private Group group;
    private Date createdAt;
    private Date updatedAt;
    private LocalDate deletedAt;

    public Student(Long id, String firstName, String middleName, String lastName, String email) {
        this.id = id;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.email = email;
    }

    public Student() {

    }

    public Long getId() {
        return id;
    }

    public Student setId(Long id) {
        this.id = id;

        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public Student setFirstName(String firstName) {
        this.firstName = firstName;

        return this;
    }

    public String getMiddleName() {
        return middleName;
    }

    public Student setMiddleName(String middleName) {
        this.middleName = middleName;

        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public Student setPassword(String password) {
        this.password = password;

        return this;
    }

    public Student setLastName(String lastName) {
        this.lastName = lastName;

        return this;
    }

    public String getEmail() {
        return email;
    }

    public Student setEmail(String email) {
        this.email = email;

        return this;
    }

    public Group getGroup() {
        return group;
    }

    public Student setGroup(Group group) {
        this.group = group;

        return this;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public Student setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;

        return this;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public Student setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;

        return this;
    }

    public LocalDate getDeletedAt() {
        return deletedAt;
    }

    public Student setDeletedAt(LocalDate deletedAt) {
        this.deletedAt = deletedAt;

        return this;
    }

    public Date getBirthday() {
        return birthday;
    }

    public Student setBirthday(Date birthday) {
        this.birthday = birthday;

        return this;
    }

    public String getPassword() {
        return password;
    }

    public String getFullName() {
        return this.firstName + " " + this.middleName + " " + this.lastName;
    }
}
