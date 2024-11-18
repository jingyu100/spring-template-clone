package rpa0108.spring_template.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class User {

    @Id
    private String id;

    private String name;

    private String password;

    private String phoneNumber;

    private String birthday;
}
