package kz.zhakins.app.domain;

import java.util.Date;



public class Client {

	private Long Id;
	private String Firstname;
	private String Lastname;
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public String getFirstname() {
		return Firstname;
	}
	public void setFirstname(String firstname) {
		Firstname = firstname;
	}
	public String getLastname() {
		return Lastname;
	}
	public void setLastname(String lastname) {
		Lastname = lastname;
	}
	public String getMiddlename() {
		return Middlename;
	}
	public void setMiddlename(String middlename) {
		Middlename = middlename;
	}
	public Long getPassportId() {
		return PassportId;
	}
	public void setPassportId(Long passportId) {
		PassportId = passportId;
	}
	public Long getPassportSerialID() {
		return PassportSerialID;
	}
	public void setPassportSerialID(Long passportSerialID) {
		PassportSerialID = passportSerialID;
	}
	public Date getPassportDateOutput() {
		return PassportDateOutput;
	}
	public void setPassportDateOutput(Date passportDateOutput) {
		PassportDateOutput = passportDateOutput;
	}
	public Client(Long id, String firstname, String lastname, String middlename, Long passportId, Long passportSerialID,
			Date passportDateOutput) {
		super();
		Id = id;
		Firstname = firstname;
		Lastname = lastname;
		Middlename = middlename;
		PassportId = passportId;
		PassportSerialID = passportSerialID;
		PassportDateOutput = passportDateOutput;
	}
	private String Middlename;
	
	private Long PassportId;
	private Long PassportSerialID;
	private Date PassportDateOutput;
	
}
