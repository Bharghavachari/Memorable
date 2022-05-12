package com.project.wallet;

public class ATMcard {
	
	private long CardNo;
	private int cvv;
	private CardType cardtype;
	private String colour;
	public ATMcard() {
		
		System.out.println("Object Created: "+this.getClass().getName());
		
	}
	public ATMcard(long cardNo, int cvv, CardType cardtype, String colour) {
		super();
		CardNo = cardNo;
		this.cvv = cvv;
		this.cardtype = cardtype;
		this.colour = colour;
	}
	public long getCardNo() {
		return CardNo;
	}
	public void setCardNo(long cardNo) {
		CardNo = cardNo;
	}
	public int getCvv() {
		return cvv;
	}
	public void setCvv(int cvv) {
		this.cvv = cvv;
	}
	public CardType getCardtype() {
		return cardtype;
	}
	public void setCardtype(CardType cardtype) {
		this.cardtype = cardtype;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	
	@Override
	public String toString() {
		return "ATMcard [CardNo=" + CardNo + ", cvv=" + cvv + ", cardtype=" + cardtype + ", colour=" + colour + "]";
	}
	
	
}
