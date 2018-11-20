package com.bruno.manytoone.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.bruno.manytoone.Enums.StatusRole;

@Entity
public class Role { // Perfil

	public Role() {
	}
	
	public Role(String name, StatusRole status, List<Functionality> functionalities) {
		this.name = name;
		this.status = status;
		this.functionalities=functionalities;
	}
	
	public Role(String name, StatusRole status) {
		this.name = name;
		this.status = status;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String name;

	@Enumerated(EnumType.STRING)
	private StatusRole status;
	
	//O melhor é deixar LAZY
	@OneToMany(cascade=CascadeType.PERSIST, fetch=FetchType.EAGER)
	private List <Functionality> functionalities;

	public StatusRole getStatus() {
		return status;
	}

	public void setStatus(StatusRole status) {
		this.status = status;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Functionality> getFunctionalities() {
		return functionalities;
	}

	public void setFunctionalities(List<Functionality> functionalities) {
		this.functionalities = functionalities;
	}
	
	

}
