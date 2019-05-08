package com.revature.bean;

import java.time.LocalDate;

public class ErsReimbursement {
	
	private int id;
	private double amount;
	private LocalDate submitted;
	private LocalDate resolved;
	private String Description;
	private String Reciept;
	private int Author;
	private int Resolver;
	private int Status_Id;
	private int Type_Id;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public LocalDate getSubmitted() {
		return submitted;
	}
	public void setSubmitted(LocalDate submitted) {
		this.submitted = submitted;
	}
	public LocalDate getResolved() {
		return resolved;
	}
	public void setResolved(LocalDate resolved) {
		this.resolved = resolved;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public String getReciept() {
		return Reciept;
	}
	public void setReciept(String reciept) {
		Reciept = reciept;
	}
	public int getAuthor() {
		return Author;
	}
	public void setAuthor(int author) {
		Author = author;
	}
	public int getResolver() {
		return Resolver;
	}
	public void setResolver(int resolver) {
		Resolver = resolver;
	}
	public int getStatus_Id() {
		return Status_Id;
	}
	public void setStatus_Id(int status_Id) {
		Status_Id = status_Id;
	}
	public int getType_Id() {
		return Type_Id;
	}
	public void setType_Id(int type_Id) {
		Type_Id = type_Id;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Author;
		result = prime * result + ((Description == null) ? 0 : Description.hashCode());
		result = prime * result + ((Reciept == null) ? 0 : Reciept.hashCode());
		result = prime * result + Resolver;
		result = prime * result + Status_Id;
		result = prime * result + Type_Id;
		long temp;
		temp = Double.doubleToLongBits(amount);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + id;
		result = prime * result + ((resolved == null) ? 0 : resolved.hashCode());
		result = prime * result + ((submitted == null) ? 0 : submitted.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ErsReimbursement other = (ErsReimbursement) obj;
		if (Author != other.Author)
			return false;
		if (Description == null) {
			if (other.Description != null)
				return false;
		} else if (!Description.equals(other.Description))
			return false;
		if (Reciept == null) {
			if (other.Reciept != null)
				return false;
		} else if (!Reciept.equals(other.Reciept))
			return false;
		if (Resolver != other.Resolver)
			return false;
		if (Status_Id != other.Status_Id)
			return false;
		if (Type_Id != other.Type_Id)
			return false;
		if (Double.doubleToLongBits(amount) != Double.doubleToLongBits(other.amount))
			return false;
		if (id != other.id)
			return false;
		if (resolved == null) {
			if (other.resolved != null)
				return false;
		} else if (!resolved.equals(other.resolved))
			return false;
		if (submitted == null) {
			if (other.submitted != null)
				return false;
		} else if (!submitted.equals(other.submitted))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "ErsReimbursement [id=" + id + ", amount=" + amount + ", submitted=" + submitted + ", resolved=" + resolved
				+ ", Description=" + Description + ", Reciept=" + Reciept + ", Author=" + Author + ", Resolver="
				+ Resolver + ", Status_Id=" + Status_Id + ", Type_Id=" + Type_Id + "]";
	}
	public ErsReimbursement(int id, double amount, LocalDate submitted, LocalDate resolved, String description,
			String reciept, int author, int resolver, int status_Id, int type_Id) {
		super();
		this.id = id;
		this.amount = amount;
		this.submitted = submitted;
		this.resolved = resolved;
		Description = description;
		Reciept = reciept;
		Author = author;
		Resolver = resolver;
		Status_Id = status_Id;
		Type_Id = type_Id;
	}
	public ErsReimbursement() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
