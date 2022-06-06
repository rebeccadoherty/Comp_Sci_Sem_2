package pkg;

public class Gizmo
{ 
	private boolean isE;
	private String maker;
	private double cost;
	
	public Gizmo(String maker, boolean isE)
	{
		this.maker= maker;
		this.isE= isE;
		cost = 0;
	}
	
	public Gizmo(String maker, boolean isE, double cost)
	{
		this.maker= maker;
		this.isE= isE;
		this.cost= cost;
	}
	
   public boolean isElectronic()
	{
		return isE;
	} 
	
	public String getMaker()
	{
		return maker;
	}
	
	public boolean equals(Object other)
	{
		if(!(other instanceof Gizmo))
		{
			return false;
		}
		else
		{
			return this.maker.equals(((Gizmo)other).getMaker());
		}
	}
	
	public double getCost()
	{
		return cost;
	}
	
   public String toString()
   {
   	return "" + maker + " " + isE + " " + cost;
   }
}
