package edu.phukrit.learning.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.phukrit.learning.models.UserModel;

@Repository
public interface UserRepository extends JpaRepository<UserModel, Long> {
    // Additional query methods can be defined here if needed
    // For example, to find a user by first name:
    // List<UserModel> findByFname(String fname);
    // Or to find a user by last name:
    // List<UserModel> findByLname(String lname);
    // Or to find a user by both first and last name:
    // List<UserModel> findByFnameAndLname(String fname, String lname); 
    // These methods will be automatically implemented by Spring Data JPA
    // No additional methods are needed for basic CRUD operations
}
