/**
 * 
 */
package entity;

import java.util.Date;

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
@Table(name = "security")
public class Security {

	@Id
	@GeneratedValue
	private int securityId;

	@Column(nullable = false)
	private String Name;

	@Column(nullable = false)
	private String Category;

	@Column(nullable = false)
	private Date purchaseDate;

	@Column(nullable = false)
	private float purchasePrice;

	@Column(nullable = false)
	private int Quantity;

	@ManyToOne
	@JoinColumn(name = "portfolioId")
	private PortFolio portfolio;

	/**
	 * @param securityId
	 * @param name
	 * @param category
	 * @param purchaseDate
	 * @param purchasePrice
	 * @param quantity
	 * @param portfolio
	 */
	public Security(int securityId, String name, String category, Date purchaseDate, float purchasePrice, int quantity,
			PortFolio portfolio) {
		super();
		this.securityId = securityId;
		Name = name;
		Category = category;
		this.purchaseDate = purchaseDate;
		this.purchasePrice = purchasePrice;
		Quantity = quantity;
		this.portfolio = portfolio;
	}

	/**
	 * @return the securityId
	 */
	public int getSecurityId() {
		return securityId;
	}

	/**
	 * @param securityId the securityId to set
	 */
	public void setSecurityId(int securityId) {
		this.securityId = securityId;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return Name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		Name = name;
	}

	/**
	 * @return the category
	 */
	public String getCategory() {
		return Category;
	}

	/**
	 * @param category the category to set
	 */
	public void setCategory(String category) {
		Category = category;
	}

	/**
	 * @return the purchaseDate
	 */
	public Date getPurchaseDate() {
		return purchaseDate;
	}

	/**
	 * @param purchaseDate the purchaseDate to set
	 */
	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	/**
	 * @return the purchasePrice
	 */
	public float getPurchasePrice() {
		return purchasePrice;
	}

	/**
	 * @param purchasePrice the purchasePrice to set
	 */
	public void setPurchasePrice(float purchasePrice) {
		this.purchasePrice = purchasePrice;
	}

	/**
	 * @return the quantity
	 */
	public int getQuantity() {
		return Quantity;
	}

	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(int quantity) {
		Quantity = quantity;
	}

	/**
	 * @return the portfolio
	 */
	public PortFolio getPortfolio() {
		return portfolio;
	}

	/**
	 * @param portfolio the portfolio to set
	 */
	public void setPortfolio(PortFolio portfolio) {
		this.portfolio = portfolio;
	}
	
	

}
