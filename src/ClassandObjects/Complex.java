package ClassandObjects;
import java.util.*;
class Comp
{
		int real;
		int imag;
		public Comp(int r, int i){
		  real = r;
		  imag = i;
}

public static Comp add(Comp a, Comp b)
{
  return new Comp((a.real+b.real),(a.imag+b.imag));
}

public static Comp diff(Comp a, Comp b)
{
  return new Comp((a.real-b.real),(a.imag-b.imag));
}

public static Comp product(Comp a, Comp b)
{
  return new Comp(((a.real*b.real)-(a.imag*b.imag)),((a.real*b.imag)+(a.imag*b.real)));
}
public void printComplex()
{
  if(real == 0 && imag!=0)
  {
    System.out.println(imag+"i");
  }
  else if(imag == 0 && real!=0)
  {
    System.out.println(real);
  }
}
}

public class Complex {

	public static void main(String[] args) 
	{
		Comp c = new Comp(4,5);
	    Comp d = new Comp(9,4);

	    Comp e = Comp.add(c,d);
	    Comp f = Comp.diff(c,d);
	    Comp g = Comp.product(c,d);
	    e.printComplex();
	    f.printComplex();
	    g.printComplex();
	  }
	}				


