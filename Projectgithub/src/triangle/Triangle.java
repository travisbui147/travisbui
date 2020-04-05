package triangle;

public class Triangle 
{
	private double a, b, c;
	public Triangle() {}
	public Triangle(double aa, double bb, double cc)
	{
		setA(aa);
		setB(bb);
		setC(cc);
	}
	public void setA(double aa)
	{
		if(aa < 0)
		{
			System.out.println(aa + "Not Availble");
		} else
			a = aa;
	}
	public double getA()
	{
		return a;
	}
	public void setB(double bb)
	{
		if(bb < 0)
		{
			System.out.println(bb + "Not Availble");
		} else
			b = bb;
	}
	public double getB()
	{
		return b;
	}
	public void setC(double cc)
	{
		if(cc < 0)
		{
			System.out.println(cc + "Not Availble");
		} else
			c = cc;
	}
	public double getC()
	{
		return c;
	}
	public double calCircumference()
	{
		if(a+b>c && b+c>a && a+c>b)
		{
			return a+b+c;
		}
		else return 0;
	}
	public double calArea()
	{
		if(a+b>c && b+c>a && a+c>b)
		{
			double p= calCircumference()/2;
			return Math.sqrt(p*(p-a)*(p-b)*(p-c));
		}
		else return 0;
	}
	public void type()
	{
		if(a+b>c && b+c>a && a+c>b)
		{
			if(a==b && b==c)
			{
				System.out.println("Tam giac deu");
			}
			else if(a==b || b==c|| c==a)
			{
				if(a*a + b*b == c*c || a*a + c*c == b*b || b*b + c*c == a*a)
				{
					System.out.println("Tam giac vuong can");
				} else
					System.out.println("Tam giac can");
			} else if(a*a + b*b == c*c || a*a + c*c == b*b || b*b + c*c == a*a)
			{
				System.out.println("Tam giac vuong");
			}
			else 
				System.out.println("Tam giac thuong.");
		}
	}

	public static void main(String[] args) 
	{
		System.out.println("Commit test:");
		Triangle t1 = new Triangle (3,4,5);
			System.out.println(t1.getA());
			System.out.println(t1.getB());
			System.out.println(t1.getC());
			System.out.println(t1.calArea());
			System.out.println(t1.calCircumference());
			t1.type();
			System.out.println("Commit test:");
		Triangle t2 = new Triangle (8,6,10);
		System.out.println(t2.getA());
		System.out.println(t2.getB());
		System.out.println(t2.getC());
			System.out.println(t2.calArea());
			System.out.println(t2.calCircumference());
			t1.type();
	}

}
