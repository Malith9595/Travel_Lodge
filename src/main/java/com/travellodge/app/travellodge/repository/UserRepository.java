package com.travellodge.app.travellodge.repository;

import com.travellodge.app.travellodge.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

// DAO layer
public interface UserRepository extends JpaRepository<User, Long> {
}
