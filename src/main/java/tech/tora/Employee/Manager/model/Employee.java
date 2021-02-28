package tech.tora.Employee.Manager.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "employee")
@Getter
@Setter
public class Employee implements Serializable {

    @Id
    @Column(name = "id")
//    @JsonProperty("id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
//    @JsonProperty("name")
    private String name;

    @Column(name = "email")
//    @JsonProperty("email")
    private String email;

    @Column(name = "phone")
//    @JsonProperty("phone")
    private String phone;

    @Column(name = "job_title")
//    @JsonProperty("job_title")
    private String jobTitle;

    @Column(name = "image_url")
//    @JsonProperty("image_url")
    private String imageUrl;

    @Column(name = "employee_code")
//    @JsonProperty("employee_code")
    private String employeeCode;

    @Override
    public String toString() {
        return "[name : "  + name + ", email : " + email + "]";
    }
}
