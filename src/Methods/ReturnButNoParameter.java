package Methods;
public class ReturnButNoParameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Return obj=new Return();
		int i=obj.Great();
		System.out.println("Greatest ="+i);
	}
}
class Return
{
	int Great()
	{
		int x=90,y=20;
		if(x>y)
			return x;
		else
			return y;
	}
	
}
