package test7;

public class AccountTest {
	public static void main(String[] args) {
		Account.setAnnualInterestRate(5.5);
		Account account=new Account("George",1122,1000);
		account.deposit(30);
		account.deposit(50);
		account.deposit(50);
		account.deposit(5);
		account.deposit(4);
		account.deposit(2);
		System.out.println("�˻�������"+account.getName());
		System.out.println("�����ʣ�"+Account.getAnnualInterestRate());
		System.out.println("��"+account.getBalance());
		java.util.ArrayList<Transaction> list=account.getTransactions();
		System.out.printf("%-30s%-14s%-14s%-15s\n","����ʱ��", "��������", "���׽��", "�˻����");
		for(int i=0;i<list.size();i++) {
			Transaction transaction = (Transaction) (list.get(i));
			System.out.printf("%-35s%-14s%-16s%-15s\n",transaction.getDate(),transaction.getType(),transaction.getAmount(), transaction.getBalance());
		}
	}
}
class Transaction{
	private java.util.Date date;
	private String type;
	private double amount;
	private double balance;
	private String description;
	public Transaction(String type, double amount, double balance, String description) {
		date=new java.util.Date();
		this.type=type;
		this.amount=amount;
		this.balance=balance;
		this.description=description;
	}
	public java.util.Date getDate(){
		return date;
	}
	public String getType() {
		return type;
	}
	public double getAmount() {
		return amount;
	}
	public double getBalance() {
		return balance;
	}
	public String getDescription() {
		return description;
	}
}

