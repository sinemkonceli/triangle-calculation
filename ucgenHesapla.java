package Odev;

public class ucgenHesapla {

	
		 private double a;
	     private double b;
	     
	     public void degerAta(double a,double b)
	     {
	   	  this.a=a;
	   	  this.b=b;   	  
	     }  	     
	     public double Hipotenus()
	     {
	    	 return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
	     }
	     
	     public double Cevre()
	     {
	    	 return a+b+Hipotenus();
	     }
	     public double Alan()
	     {
	    	 return (a*b)/2;
	     }
	     
	     
}
