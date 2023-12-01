package com.example.myapp.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.hibernate.type.TrueFalseConverter;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="tb_employee")
public class EMPLOYEE implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String empname;
	private String emppost;
	private String empc;
	private Date empdate;
	private String empemail;
	
	@ManyToOne 
	@JoinColumn(name="departmentid")
	private DEPARTMENT departmentid;
	
	
	@OneToMany(mappedBy = "employee", orphanRemoval = true,cascade = CascadeType.ALL)
	private List<PHONE> phoneno;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getEmpname() {
		return empname;
	}
	
	public List<PHONE> getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(List<PHONE> phoneno) {
		this.phoneno = phoneno;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getEmppost() {
		return emppost;
	}
	public void setEmppost(String emppost) {
		this.emppost = emppost;
	}
	public String getEmpc() {
		return empc;
	}
	public void setEmpc(String empc) {
		this.empc = empc;
	}
	public Date getEmpdate() {
		return empdate;
	}
	public void setEmpdate(Date empdate) {
		this.empdate = empdate;
	}
	public String getEmpemail() {
		return empemail;
	}
	public void setEmpemail(String empemail) {
		this.empemail = empemail;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
}
