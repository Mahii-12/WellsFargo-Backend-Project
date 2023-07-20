/**
 * 
 */
package entity;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

/**
 * @author SAMSUNG
 *
 */
public class PortFolio {

	@Id
	@GeneratedValue()
	private int portfolioId;
	
	@Column(nullable = false)
	private int creationDate;
	
	@OneToOne(mappedBy="portfolio")
	private Client client;

	/**
	 * @param portfolioId
	 * @param creationDate
	 * @param client
	 */
	public PortFolio(int portfolioId, int creationDate, Client client) {
		super();
		this.portfolioId = portfolioId;
		this.creationDate = creationDate;
		this.client = client;
	}

	/**
	 * @return the portfolioId
	 */
	public int getPortfolioId() {
		return portfolioId;
	}

	/**
	 * @param portfolioId the portfolioId to set
	 */
	public void setPortfolioId(int portfolioId) {
		this.portfolioId = portfolioId;
	}

	/**
	 * @return the creationDate
	 */
	public int getCreationDate() {
		return creationDate;
	}

	/**
	 * @param creationDate the creationDate to set
	 */
	public void setCreationDate(int creationDate) {
		this.creationDate = creationDate;
	}

	/**
	 * @return the client
	 */
	public Client getClient() {
		return client;
	}

	/**
	 * @param client the client to set
	 */
	public void setClient(Client client) {
		this.client = client;
	}
	
	
	
}
