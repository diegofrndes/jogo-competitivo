package com.jogocompetitivo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.jogocompetitivo.domain.User;

public interface UserRepository extends JpaRepository<User, Long>{
	@Query(value = "SELECT u FROM User u ORDER BY u.elo ASC, u.balance ASC", nativeQuery = true)
	List<User> findAllOrdered();
}
