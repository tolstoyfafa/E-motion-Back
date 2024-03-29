package com.motus.emotion.repository;

import com.motus.emotion.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface UserRepository extends JpaRepository<User, Long>{

    Optional<User> findByMail(String mail);

    User findByIdAndMail(Long id, String mail);
}

