package assignment17;

public class main extends insurance
{
	void registerInsurance()
	{ 
		System.out.println("Insurance No. : " + insuranceNo);
		System.out.println("Insure Amount : "+ insureAmount);
    }
	
	void payEMI() 
	{  
		System.out.println("EMI : "+ totalEMI);	
	}
	     
	int claimInsurance() 
	{
		if(totalEMI==insureAmount){return insureAmount;}
		else {return totalEMI;}	
	}
	
	
	public static void main(String[] args)
	{
		main m=new main();
		m.registerInsurance();
		m.payEMI();
		if(m.totalEMI==m.insureAmount)
			{
				int insur=m.claimInsurance();
				System.out.println(" Insureamount : "+ insur);
		   }
		else
			{
				int total=m.claimInsurance();
				System.out.println("Total EMI:"+ total);
			}
	}
	
}
