package main;

public class main {
double totalgrossincome;
double totalmonthlydebt;
double mortgageinterestrate;
double term;
double downpayment;
     public double HousingPaymentOnly(double totalgrossincome){
    	 double HousingPaymentalone=(totalgrossincome/12)*.18;
    	 return HousingPaymentalone;
     }
     public double HousingPaymentOther(double totalgrossincome){
    	 double HousingPaymentAdd= (totalgrossincome/12)*.36;
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
     
}
