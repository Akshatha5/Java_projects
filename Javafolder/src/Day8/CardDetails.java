package Day8;

import java.io.Serializable;

public class CardDetails implements Serializable{

	private static final long serialVersionUID = 1L;
	public long getCardno() {
		return cardno;
	}
	public void setCardno(long cardno) {
		this.cardno = cardno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getExpmon() {
		return expmon;
	}
	public void setExpmon(int expmon) {
		this.expmon = expmon;
	}
	public int getExpyear() {
		return expyear;
	}
	public void setExpyear(int expyear) {
		this.expyear = expyear;
	}
	public int getCvv() {
		return cvv;
	}
	public void setCvv(int cvv) {
		this.cvv = cvv;
	}
	private long cardno;
	private String name;
	private int expmon;
	private int expyear;
	private int cvv;
	public CardDetails() {
	}
	public CardDetails(long cardno, String name, int expmon, int expyear, int cvv) {
		super();
		this.cardno = cardno;
		this.name = name;
		this.expmon = expmon;
		this.expyear = expyear;
		this.cvv = cvv;
	}
	
	
		
		

	}


