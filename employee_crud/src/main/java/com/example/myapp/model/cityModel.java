package com.example.myapp.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tb_mst_city")
public class cityModel implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Integer id;
	
	@Column(name="city_name")
	private String cityname;
	
	
	//@JoinColumn(name = "state_id", referencedColumnName = "state_id")
    //@ManyToOne(cascade = CascadeType.ALL)
    //private stateModel stId;
	
	@Column(name="state_id")
	private Integer stateid;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCityname() {
		return cityname;
	}

	public void setCity_name(String cityname) {
		this.cityname = cityname;
	}

	public Integer getStateid() {
		return stateid;
	}

	public void setState_id(Integer stateid) {
		this.stateid = stateid;
	}

	public cityModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public cityModel(Integer id, String cityname, Integer stateid) {
		super();
		this.id = id;
		this.cityname = cityname;
		this.stateid = stateid;
	}

}
