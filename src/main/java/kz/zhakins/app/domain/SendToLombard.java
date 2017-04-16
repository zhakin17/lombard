package kz.zhakins.app.domain;

import java.util.Date;

public class SendToLombard {
	private Long Id;
	private CategoryProduct CategoryProductId;
	private Client ClientId;
	private Date DateDelivery;
	private Date DateReturn;
	private Double Summa;
	private Double PercentOfSumma;
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public CategoryProduct getCategoryProductId() {
		return CategoryProductId;
	}
	public void setCategoryProductId(CategoryProduct categoryProductId) {
		CategoryProductId = categoryProductId;
	}
	public Client getClientId() {
		return ClientId;
	}
	public void setClientId(Client clientId) {
		ClientId = clientId;
	}
	public Date getDateDelivery() {
		return DateDelivery;
	}
	public void setDateDelivery(Date dateDelivery) {
		DateDelivery = dateDelivery;
	}
	public Date getDateReturn() {
		return DateReturn;
	}
	public void setDateReturn(Date dateReturn) {
		DateReturn = dateReturn;
	}
	public Double getSumma() {
		return Summa;
	}
	public void setSumma(Double summa) {
		Summa = summa;
	}
	public Double getPercentOfSumma() {
		return PercentOfSumma;
	}
	public void setPercentOfSumma(Double percentOfSumma) {
		PercentOfSumma = percentOfSumma;
	}
	public SendToLombard(Long id, CategoryProduct categoryProductId, Client clientId, Date dateDelivery,
			Date dateReturn, Double summa, Double percentOfSumma) {
		super();
		Id = id;
		CategoryProductId = categoryProductId;
		ClientId = clientId;
		DateDelivery = dateDelivery;
		DateReturn = dateReturn;
		Summa = summa;
		PercentOfSumma = percentOfSumma;
	}
	
}
