package ru.my3tahk.spring.mvc;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ru.my3tahk.spring.mvc.validation.CheckEmail;

import javax.validation.constraints.*;
import java.util.HashMap;
import java.util.Map;

public class Employee {

    public Employee() {
        departments = new HashMap<>();
        departments.put("IT", "Information Technology");
        departments.put("HR", "Human Resources");
        departments.put("SALES", "Sales");

        carBrands = new HashMap<>();
        carBrands.put("BMW", "BMW");
        carBrands.put("AUDI", "AUDI");
        carBrands.put("FERRARI", "FERRARI");

        languages = new HashMap<>();
        languages.put("English", "EN");
        languages.put("Deutsch", "DE");
        languages.put("French", "FR");
    }

    @Setter
    @Getter
    @Size(min = 2, message = "name too small, must be more than 1")
    private String name;
    @Setter
    @Getter
    @NotNull(message = "required field")
    @NotBlank(message = "should not be empty")
    private String surName;
    @Setter
    @Getter
    @Min(value = 500, message = "must be more than 499")
    @Max(value = 1000, message = "must be less than 1001")
    private int salary;

    @Setter
    @Getter
    private String department;

    @Setter
    @Getter
    private String carBrand;

    @Setter
    @Getter
    private Map<String, String> departments;

    @Setter
    @Getter
    private Map<String, String> carBrands;

    @Setter
    @Getter
    private Map<String, String> languages;

    @Setter
    @Getter
    private String[] language;

    @Setter
    @Getter
    @Pattern(regexp = "\\d{3}-\\d{2}-\\d{2}", message = "wrong phone format, please use XXX-XX-XX")
    private String phoneNumber;

    @Setter
    @Getter
    @CheckEmail(value = "abc.com", message = "email muust end with abc.com")
    private String email;

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }
}
