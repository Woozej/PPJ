package ppj;

public abstract class Card {
	protected int cardNr;
	protected int cardColor;
	public String getCardNr() {
		if (this.cardNr == 1)
			return "As";
		else if (this.cardNr == 11)
			return "Walet";
		else if (this.cardNr == 12)
			return "Dama";
		else if (this.cardNr == 13)
			return "Kr�l";
		else
			return ""+ this.cardNr;	
	}
	public void setCardNr(int nr) {
		this.cardNr = nr;
	}
	public String getCardColor() {
		if (this.cardColor == 1)
			return "pik";
		else if (this.cardColor == 2)
			return "kier";
		else if (this.cardColor == 3)
			return "trefl";
		else if (this.cardColor == 4)
			return "karo";
		else
			return "b��dny kolor";
	}
	public void setCardColor(int color) {
		this.cardColor = color;
	}

}
