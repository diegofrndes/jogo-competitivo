package com.jogocompetitivo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.jogocompetitivo.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	@Query("SELECT u FROM User u ORDER BY u.elo ASC, u.pdl ASC")
	List<User> findAllOrdered();
}
