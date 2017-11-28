
public class CommercialVehicle extends Vehicle
{
	CommercialVehicle(String regno)
	{
		super(regno);
	}
	float caltax(String type,String Highway)throws RoadException
	{
		switch(Highway)
		{
		case "LOCAL":
			return 50.0f;
			
		case "STATE":
			return 1000.0f;
			
		case "NATIONAL":
			return 150.0f;
			default:
				throw new RoadException("Wrong Highway Name");
			
		}
	}
}
