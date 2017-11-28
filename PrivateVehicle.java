
public class PrivateVehicle extends Vehicle
{
	PrivateVehicle(String regno)
	{
		super(regno);
	}
	float caltax(String type,String Highway)throws RoadException
	{
		switch(Highway)
		{
		case "LOCAL":
			return 30.0f;
			
		case "STATE":
			return 60.0f;
			
		case "NATIONAL":
			return 90.0f;
			default:
				throw new RoadException("Wrong Highway Name");
			
		}
	}
}
