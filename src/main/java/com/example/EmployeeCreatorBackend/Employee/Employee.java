package com.example.EmployeeCreatorBackend.Employee;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "employees")
public class Employee {

    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Getter
    @Setter
    @Column
    private String firstName;

    @Getter
    @Setter
    @Column
    private String middleName;

    @Getter
    @Setter
    @Column
    private String lastName;

    @Getter
    @Setter
    @Column
    private String email;

    @Getter
    @Setter
    @Column
    private String mobile;

    @Getter
    @Setter
    @Column
    private String address;

    @Getter
    @Setter
    @Column
    private String status;

    @Getter
    @Setter
    @Column
    private Date startDate;

    @Getter
    @Setter
    @Column
    private Date finishDate;

    @Getter
    @Setter
    @Column
    private boolean onGoing;

    @Getter
    @Setter
    @Column
    private String type;

    @Getter
    @Setter
    @Column
    private String hours;

    public Employee() {
    }

    public Employee(
            String firstName,
            String middleName,
            String lastName,
            String email,
            String mobile,
            String address,
            String status,
            Date startDate,
            Date finishDate,
            Boolean onGoing,
            String type,
            String hours) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.email = email;
        this.mobile = mobile;
        this.address = address;
        this.status = status;
        this.startDate = startDate;
        this.finishDate = finishDate;
        this.onGoing = onGoing;
        this.type = type;
        this.hours = hours;
    }
}
