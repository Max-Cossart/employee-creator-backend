package com.example.EmployeeCreatorBackend.Employee;

import java.sql.Date;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

public class EmployeeUpdateDTO {

    @Getter
    @Setter
    @NotBlank
    private String firstName;

    @Getter
    @Setter
    private String middleName;

    @Getter
    @Setter
    @NotBlank
    private String lastName;

    @Getter
    @Setter
    @NotBlank
    private String email;

    @Getter
    @Setter
    @NotBlank
    private String mobile;

    @Getter
    @Setter
    @NotBlank
    private String address;

    @Getter
    @Setter
    @NotBlank
    private String status;

    @Getter
    @Setter
    @NotBlank
    private Date startDate;

    @Getter
    @Setter
    private Date finishDate;

    @Getter
    @Setter
    private boolean onGoing;

    @Getter
    @Setter
    @NotBlank
    private String type;

    @Getter
    @Setter
    private String hours;
}