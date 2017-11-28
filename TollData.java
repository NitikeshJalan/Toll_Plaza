public class TollData 
{
	int totalprivatecount,totalprivatetax,totalcommercialcount,totalcommercialtax;
	public static void main(String[] args)throws RoadException
	{
		
		PrivateVehicle pv = new PrivateVehicle("TSDEA1149");
		CommercialVehicle cv = new CommercialVehicle("TSO7EA1148");
		TollData td = new TollData();
		td.makeentry(pv,"PRIVATE","NATIONAL");
		td.makeentry(cv,"COMMERCIAL","LOCAL");
		System.out.println("Total private count is " + td.getTotalprivatecount());
		System.out.println("Total commercial count is " + td.getTotalcommercialecount());
		System.out.println("Total private tax is " + td.getTotalprivatetax());
		System.out.println("Total commercial is " + td.getTotalcommercialtax());
	}
		void makeentry(Vehicle v,String type,String highway)throws RoadException
		{
			if(type == "PRIVATE")
			{
				totalprivatecount++;
				totalprivatetax = totalprivatetax + (int)(v.caltax(type, highway));
			}
			else if(type == "COMMERCIAL")
			{
				totalcommercialcount++;
				totalcommercialtax = totalcommercialtax + (int)(v.caltax(type, highway));
			}
			else
				throw new RoadException("Wrong vehivcle type");
		}
		
		int getTotalprivatecount()
		{
			return totalprivatecount;
			
		}
		int getTotalcommercialecount()
		{
			return totalcommercialcount;
			
		}
		int getTotalprivatetax()
		{
			return totalprivatetax;
			
		}
		int getTotalcommercialtax()
		{
			return totalcommercialtax;
			
		}
}
		

