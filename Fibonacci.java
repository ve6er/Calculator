class Fibonacci{
	void givfib(int n){
		int i,a=0,b=1,c;
		System.out.print(a+" "+b);
		
		for (i=2; i<n;++i)
		{
			c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
		}
	}
}
		