package main;

public class main {
public double totalgrossincome;
public double totalmonthlydebt;
public double mortgageinterestrate;
public double term;
//double downpayment;
     public double HousingPaymentOnly(double totalgrossincome){
    	 double HousingPaymentalone=(totalgrossincome/12)*.18;
    	 return HousingPaymentalone;
     }
     public double HousingPaymentOther(double totalgrossincome, double totalmonthlydebt){
    	 double HousingPaymentAdd= (totalgrossincome/12)*.36-totalmonthlydebt;
    	 return HousingPaymentAdd;
     }
     public double MaxPay(double HousingPaymentalone,double HousingPaymentAdd){
    	 if(HousingPaymentalone>HousingPaymentAdd){
    		 return HousingPaymentAdd;
    	 }
    	 if(HousingPaymentalone<HousingPaymentAdd){
    		 return HousingPaymentalone;
    	 }
    	 else;
    	 return 0;
     }
     public double MortgageEstimate(double totalgrossincome, double totalmonthlydebt, double mortgageinterestrate, int term){
    	 double a=HousingPaymentOnly(totalgrossincome);
    	 double b=HousingPaymentOther(totalgrossincome, totalmonthlydebt);
    	 double c=MaxPay(a,b);
    	 term=30;//fix before submit
    	 int sub1=(int) (1.0+mortgageinterestrate);
    	 double capablefinance=((sub1^(term*12)-1)/mortgageinterestrate(1+mortgageinterestrate)^(term*12));
    	 return capablefinance;
     }
}
