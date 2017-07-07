package assignment17;

public abstract class insurance
{
	String insuranceNo = "INS110"; 
	int insureAmount = 5000;
	int totalEMI=10000;
	abstract void registerInsurance();
	abstract void  payEMI();
}
