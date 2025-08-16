package edu.phukrit.learning.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // <-- Creates all getters, setters, toString(), equals(), and hashCode()
@NoArgsConstructor // <-- Creates the empty constructor: public UserModel() {}
@AllArgsConstructor // <-- Creates a constructor with all fields: public UserModel(Long id, String fname, String lname)
@Entity
public class UserModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fname;
    private String lname;

    // A specific constructor we still want for creating new users
    public UserModel(String fname, String lname) {
        this.fname = fname;
        this.lname = lname;
    }
}