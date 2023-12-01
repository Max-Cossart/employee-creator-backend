package com.example.EmployeeCreatorBackend.Employee;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

public class EmployeeCreateDTO {

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
    private String startDate;

    @Getter
    @Setter
    private String finishDate;

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
