package pkg;
import java.util.ArrayList;

public class OnlinePurchaseManager
{
   private ArrayList<Gizmo> purchases;
   
   public OnlinePurchaseManager()
   {
   	purchases= new ArrayList<Gizmo>();
   }
   
   public void add(String maker, boolean isE, double cost)
   {
   	Gizmo one= new Gizmo(maker, isE, cost);
      purchases.add(one);
   }
   
   public int countElectronicsByMaker(String maker)
		{
			int count= 0;
			for(int x= 0; x < purchases.size(); x++)
			{
				if((purchases.get(x).getMaker()).equals(maker) && (purchases.get(x).isElectronic()))
				{
					count++;
				}
			}
			return count;
		}
		
		public boolean hasAdjacentEqualPair()
		{
			for(int x= 0; x < purchases.size() - 1 && purchases.size() >= 2; x++)
			{
				if((purchases.get(x)).equals(purchases.get(x + 1)) && purchases.get(x).isElectronic() && purchases.get(x + 1).isElectronic())
				{
					System.out.println(x);
					return true;
				}
			}
			return false;
		}
   
   public Gizmo getCheapestGizmoByMaker( String mkr )
   {
   	double cheapest= Double.MAX_VALUE;
   	int count= 0;
   	
   	for(int c= 0; c < purchases.size(); c++)
   	{
   		if(purchases.get(c).getCost() < cheapest && purchases.get(c).getMaker().equals(mkr))
   	   {
   	      cheapest= (purchases.get(c).getCost());
   	      count= c;
   	   }
   	}
   	return purchases.get(count);
   }
   
   public String toString()
   {
   	return "" + purchases;
   }
}
