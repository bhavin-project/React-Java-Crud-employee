package com.example.myapp.model;



import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;



@Entity
@Table(name="tb_student")
public class studentModel implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name="id")
	private Integer id;
	
	
	@Basic(optional = false)
	@Column(name="enrollment_no")
	
	private Integer enrollment_no;
	
	@Basic(optional = false)
	@Column(name="first_name")
	private String firstname;
	
	
	@Column(name="middle_name")
	private String middlename;
	
	@Basic(optional = false)
	@Column(name="last_name")
	private String lastname;
	
	@Basic(optional = false)
	@Column(name="birth_date")
	@Temporal(TemporalType.DATE)	
	private Date birthdate;
	
	@Basic(optional = false)
	@Column(name="adhaar_card_no")
	private String adhaarcard_no;
	
	@Basic(optional = false)
	@Column(name="gender")
	private String gender;
	
	@Basic(optional = false)
	@ManyToOne
	@JoinColumn(name = "cast_id", referencedColumnName = "id")
	private castModel castid;
	
	
	@Column(name="religion_id")
	private Integer religionid;
	
	@Basic(optional = false)
	@Column(name="blood_group_id")
	private Integer bloodgroupid;
	
	@Basic(optional = false)
	@Column(name="nationality")
	private String nationality;
	
	@Basic(optional = false)
	@Column(name="physically_disabled")
	private String physicallydisabled;
	
	@Basic(optional = false)
	@Column(name="family_income_id")
	private Integer familyincomeid;
	
	@Basic(optional = false)
	@Column(name="hobbies")
	private String hobbies;
	
	@Basic(optional = false)
	@Column(name="mobile_no")
	private String mobileno;
	
	@Basic(optional = false)
	@Column(name="email_id")
	private String emailid;
	
	@Basic(optional = false)
	@Column(name="address")
	private String address;
	
	@Basic(optional = false)
	@Column(name="state_id")
	private Integer stateid;
	
	@Basic(optional = false)
	@ManyToOne
	@JoinColumn(name="city_id", referencedColumnName = "id")
	private cityModel city;
	
	@Basic(optional = false)
	@Column(name="upload_photo")
	private String uploadphoto;
	
	@Basic(optional = false)
	@Column(name="upload_certificate")
	private String uploadcertificate;
	
	@Basic(optional = false)
	@Column(name="status")
	private String status;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getEnrollment_no() {
		return enrollment_no;
	}

	public void setEnrollment_no(Integer enrollment_no) {
		this.enrollment_no = enrollment_no;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getMiddlename() {
		return middlename;
	}

	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public Date getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}

	public String getAdhaarcard_no() {
		return adhaarcard_no;
	}

	public void setAdhaarcard_no(String adhaarcard_no) {
		this.adhaarcard_no = adhaarcard_no;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public castModel getCastid() {
		return castid;
	}

	public void setCastid(castModel castid) {
		this.castid = castid;
	}

	public Integer getReligionid() {
		return religionid;
	}

	public void setReligionid(Integer religionid) {
		this.religionid = religionid;
	}

	public Integer getBloodgroupid() {
		return bloodgroupid;
	}

	public void setBloodgroupid(Integer bloodgroupid) {
		this.bloodgroupid = bloodgroupid;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getPhysicallydisabled() {
		return physicallydisabled;
	}

	public void setPhysicallydisabled(String physicallydisabled) {
		this.physicallydisabled = physicallydisabled;
	}

	public Integer getFamilyincomeid() {
		return familyincomeid;
	}

	public void setFamilyincomeid(Integer familyincomeid) {
		this.familyincomeid = familyincomeid;
	}

	public String getHobbies() {
		return hobbies;
	}

	public void setHobbies(String hobbies) {
		this.hobbies = hobbies;
	}

	public String getMobileno() {
		return mobileno;
	}

	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Integer getStateid() {
		return stateid;
	}

	public void setStateid(Integer stateid) {
		this.stateid = stateid;
	}

	public cityModel getCity() {
		return city;
	}

	public void setCity(cityModel city) {
		this.city = city;
	}

	public String getUploadphoto() {
		return uploadphoto;
	}

	public void setUploadphoto(String uploadphoto) {
		this.uploadphoto = uploadphoto;
	}

	public String getUploadcertificate() {
		return uploadcertificate;
	}

	public void setUploadcertificate(String uploadcertificate) {
		this.uploadcertificate = uploadcertificate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public studentModel(Integer id, Integer enrollment_no, String firstname, String middlename, String lastname,
			Date birthdate, String adhaarcard_no, String gender, castModel castid, Integer religionid,
			Integer bloodgroupid, String nationality, String physicallydisabled, Integer familyincomeid, String hobbies,
			String mobileno, String emailid, String address, Integer stateid, cityModel city, String uploadphoto,
			String uploadcertificate, String status) {
		super();
		this.id = id;
		this.enrollment_no = enrollment_no;
		this.firstname = firstname;
		this.middlename = middlename;
		this.lastname = lastname;
		this.birthdate = birthdate;
		this.adhaarcard_no = adhaarcard_no;
		this.gender = gender;
		this.castid = castid;
		this.religionid = religionid;
		this.bloodgroupid = bloodgroupid;
		this.nationality = nationality;
		this.physicallydisabled = physicallydisabled;
		this.familyincomeid = familyincomeid;
		this.hobbies = hobbies;
		this.mobileno = mobileno;
		this.emailid = emailid;
		this.address = address;
		this.stateid = stateid;
		this.city = city;
		this.uploadphoto = uploadphoto;
		this.uploadcertificate = uploadcertificate;
		this.status = status;
	}

	public studentModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	

}