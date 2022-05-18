package Encapsulation;
class Bank {
	private long acc_no;
	private String name , mailId;
	private int amount,deposit,currentBalance;
	public int getCurrentBalance() {
		return currentBalance;
	}
	public void setCurrentBalance(int currentBalance) {
		this.currentBalance = currentBalance;
	}
	public int getDeposit() {
		return deposit;
	}
	public void setDeposit(int deposit) {
		this.deposit = deposit;
	}
	public long getAcc_no() {
		return acc_no;
	}
	public void setAcc_no(long acc_no) {
		this.acc_no = acc_no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMailId() {
		return mailId;
	}
	public void setMailId(String mailId) {
		this.mailId = mailId;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
}

public class BankEg1 {

	public static void main(String[] args) {
		Bank bank = new Bank();
		bank.setAcc_no(57879654);
		bank.setAmount(20000);
		bank.setName("Jaghan");
		bank.setMailId("jaghanraj@gmail.com");
		bank.setDeposit(5000);
		bank.setCurrentBalance(25000);
		System.out.println("Account holder name :" +bank.getName());
		System.out.println("Account number :" +bank.getAcc_no());
		System.out.println("Account Balance :" +bank.getAmount());
		System.out.println("Amount deposited :" +bank.getDeposit());
		System.out.println("New account balance :" +bank.getCurrentBalance());
		System.out.println("Account holder mail ID :" +bank.getMailId());
		 
		 
				
		 

	}

}
