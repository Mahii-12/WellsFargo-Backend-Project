/**
 * 
 */
package entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * @author SAMSUNG
 *
 */
@Entity
@Table(name = "Advisor")
public class Advisor {

	@Id
	@GeneratedValue
	private int advisorId;
	
	@Column(nullable = false)
	private String FirstName;
	
	@Column(nullable = false)
	private String LastName;
	
	@Column(nullable = false)
	private String Address;
	
	@Column(nullable = false)
	private String Phone;
	
	@Column(nullable = false)
	private String email;

	/**
	 * @param advisorId
	 * @param firstName
	 * @param lastName
	 * @param address
	 * @param phone
	 * @param email
	 */
	public Advisor(int advisorId, String firstName, String lastName, String address, String phone, String email) {
		super();
		this.advisorId = advisorId;
		FirstName = firstName;
		LastName = lastName;
		Address = address;
		Phone = phone;
		this.email = email;
	}

	/**
	 * @return the advisorId
	 */
	public long getAdvisorId() {
		return advisorId;
	}

	/**
	 * @param advisorId the advisorId to set
	 */
	public void setAdvisorId(int advisorId) {
		this.advisorId = advisorId;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return FirstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return LastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		LastName = lastName;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return Address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		Address = address;
	}

	/**
	 * @return the phone
	 */
	public String getPhone() {
		return Phone;
	}

	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		Phone = phone;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
	
	
	
	
}
