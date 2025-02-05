package ExceptionCereditCardExample;

public class CreditCard {

	public void checkEligibilityt(int cardnumber) throws InvalidCreditCard{
		if(cardnumber <18)
			throw new InvalidCreditCard("Invalid age to vote");
			else
				System.out.println("you are eligible");
	}

}
