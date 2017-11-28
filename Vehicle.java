
abstract class Vehicle 
{
	String regno;
	Vehicle(String regno)
	{
		this.regno=regno;
		
	}
	abstract float caltax(String type,String highway)throws RoadException;
}
