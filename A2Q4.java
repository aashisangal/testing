package assignment1;
import java.util.Scanner;
class Account {
	double Balance = 12342;
}
class SavingsAccount extends Account {
	
	
}

class CurrentAccount extends Account {
	float ExtraCharge;
	double ExtraCharges(double withdrawAmt1) {
		return ExtraCharge = (float) (withdrawAmt1 * (0.1));
	}
}

class Entry extends CurrentAccount {
	void WithdrawAmount(String account1, double withdrawAmt) {
		CurrentAccount c1 = new CurrentAccount();
		c1.ExtraCharges(withdrawAmt);
		if (account1.equalsIgnoreCase("CurrentAccount")) {
		
			Balance = Balance - withdrawAmt - c1.ExtraCharge;
			System.out.println("Extra charge added as withdrawn from Current Account: $" + c1.ExtraCharge);
		}
		else if (account1.equalsIgnoreCase("SavingAccount")) {
			Balance = Balance - withdrawAmt;
			System.out.println("No Extra charge ");
		}

		System.out.println("Balance: $" + Balance);
	}
	void MakePayment() {
	}
}
public class A2Q4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter SavingAccount or CurrentAccount");
		String account = sc.next();
		System.out.println("Enter withdraw Amount");
		Double withdrawAmount = sc.nextDouble();
		Entry e1 = new Entry();
		e1.WithdrawAmount(account, withdrawAmount);
		sc.close();

******************
	}
}
