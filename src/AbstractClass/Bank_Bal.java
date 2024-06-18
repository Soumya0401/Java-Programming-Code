package AbstractClass;

abstract class Bank
{
	abstract void getbalance();
}
class BankA extends Bank{
	void getbalance()
	{
		System.out.println("Deposited: $100");
	}
}
class BankB extends Bank{
	void getbalance()
	{
		System.out.println("Deposited: $150");
	}
}
class BankC extends Bank{
	void getbalance()
	{
		System.out.println("Deposited: $200");
	}
}
public class Bank_Bal {

	public static void main(String[] args) 
	{
		BankA  ba=new BankA();
		ba.getbalance();
		
		BankB bb=new BankB();
		bb.getbalance();
		
		BankC  bc=new BankC();
		bc.getbalance();
		
	}

}
