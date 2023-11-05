package com.jogocompetitivo.domain;

import com.jogocompetitivo.dtos.UserDTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name="users")
@Table(name="users")
@Getter
@Setter
@NoArgsConstructor
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String firstName;
	private String lastName;
	@Column(unique = true)
	private String document;
	@Column(unique = true)
	private String email;
	private EloType elo;
	private int balance;
	
	public User(UserDTO data) {
		this.firstName = data.firstName();
		this.lastName = data.lastName();
		this.balance = data.balance();
		this.email = data.email();
		this.elo = data.elo();
		this.document = data.document();
	}
	
}
