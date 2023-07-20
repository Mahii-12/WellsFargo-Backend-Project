/**
 * 
 */
package entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

/**
 * @author SAMSUNG
 *
 */
@Entity
@Table(name = "client")
public class Client {
	
	@Id
	@GeneratedValue
	private int clientid;
	
	@Column(nullable =false)
	private String FirstName;
	
	@Column(nullable =false)
	private String LastName;
	
	@Column(nullable =false) 
	private String Address;
	
	@Column(nullable =false)
	private String Phone;
	
	@Column(nullable =false)
	private String email;
	
	@ManyToOne
	@JoinColumn(name="advisorId")
	private Advisor advisor;

	/**
	 * @param clientid
	 * @param firstName
	 * @param lastName
	 * @param address
	 * @param phone
	 * @param email
	 * @param advisor
	 */
	public Client(int clientid, String firstName, String lastName, String address, String phone, String email,
			Advisor advisor) {
		super();
		this.clientid = clientid;
		FirstName = firstName;
		LastName = lastName;
		Address = address;
		Phone = phone;
		this.email = email;
		this.advisor = advisor;
	}

	/**
	 * @return the clientid
	 */
	public int getClientid() {
		return clientid;
	}

	/**
	 * @param clientid the clientid to set
	 */
	public void setClientid(int clientid) {
		this.clientid = clientid;
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

	/**
	 * @return the advisor
	 */
	public Advisor getAdvisor() {
		return advisor;
	}

	/**
	 * @param advisor the advisor to set
	 */
	public void setAdvisor(Advisor advisor) {
		this.advisor = advisor;
	}
	
	

}
