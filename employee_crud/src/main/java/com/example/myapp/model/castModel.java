package com.example.myapp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_mst_cast")
public class castModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;

	@Column(name = "cast_name")
	private String cast_name;

	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCast_name() {
		return cast_name;
	}

	public void setCast_name(String cast_name) {
		this.cast_name = cast_name;
	}

	public castModel(Integer id, String cast_name) {
		super();
		this.id = id;
		this.cast_name = cast_name;
		// this.studentModel = studentModel;
	}

	public castModel() {
		super();
		// TODO Auto-generated constructor stub
	}
}
