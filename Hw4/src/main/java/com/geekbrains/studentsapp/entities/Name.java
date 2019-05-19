package com.geekbrains.studentsapp.entities;

import javax.persistence.*;

@Entity
@Table(name = "names")
public class Name {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@Column(name = "name")
	private String name;

	public Name() {
	}

	public Name(String name) {
		this.name = name;
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

	@Override
	public String toString() {
		return "Name{" + "id=" + id + ", name='" + name + '\'' + '}';
	}
}
