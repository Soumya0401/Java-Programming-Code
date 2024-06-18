package LoopingStat;

public class forloop
{
	int i=20;
	public static void main(String[] args) 
	{
		forloop obj=new forloop();
		obj.Even();

	}
	void Even()
	{
		for (i=0;i<=20;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}
	}

}
