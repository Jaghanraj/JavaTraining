package Encapsulation;
class Amount {
	private int money;
	private String name;
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}

public class BankEg {

	public static void main(String[] args) {
		Amount amount = new Amount();
		amount.setMoney(20000);
		amount.setName("Jaghan");
		System.out.println("Account holder name :" +amount.getName());
		System.out.println("Account balance :" +amount.getMoney());

	}

}
