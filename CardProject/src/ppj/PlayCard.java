package ppj;

public class PlayCard extends Card implements ICard {
	public PlayCard(int nr, int color) {
		setCardNr(nr);
		setCardColor(color);
	}

	public void ShowCard() {
		System.out.println(getCardNr() + " " + getCardColor());
	}
}
