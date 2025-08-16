package edu.phukrit.learning.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.phukrit.learning.models.UserModel;

@Repository
public interface UserRepository extends JpaRepository<UserModel, Long> {
    // Additional query methods can be defined here if needed 
    // Main logic methods will be automatically implemented by Spring Data JPA

}
