package edu.phukrit.learning.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.phukrit.learning.models.UserModel;

@Repository
public interface UserRepository extends JpaRepository<UserModel, Long> {
    // Additional query methods can be defined here if needed
    // For example, findByFname, findByLname, etc.
    // JpaRepository provides basic CRUD operations out of the box
}
