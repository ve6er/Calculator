class Calculator{
	public double addition (double n1, double n2){
		return n1+n2;
	}
	
	public double subtraction (double n1, double n2){
		return n1-n2;
	}
	
	public double multiplication (double n1, double n2){
		return n1*n2;
	}
	
	public double division (double n1, double n2){
		return n1/n2;
	}
	public double[] aradd(double a1[], double a2[], int n){
		double a3[] = new double[n];
		for (int i=0;i<n;i++){
			a3[i]=a1[i]+a2[i];
		}
		return a3;
	}

	public double[] arsub(double a1[], double a2[], int n){
		double a3[] = new double[n];
		for (int i=0;i<n;i++){
			a3[i]=a1[i]-a2[i];
		}
		return a3;
	}

	public double arvar(double a1[], int n){
		int i;
		double k=0,mean;
		for (i=0;i<n;i++){
			k+=a1[i];
		}
		mean=k/n;
		k=0;
		for (i=0;i<n;i++){
			k+= (a1[i]-mean)*(a1[i]-mean);
		}
		return k/n;
	}

}

