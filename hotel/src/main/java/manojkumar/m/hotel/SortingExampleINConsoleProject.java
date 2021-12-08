package manojkumar.m.hotel;

public class SortingExampleINConsoleProject
{
	String productname;
	String typeofitem;
	int itemrate;
	String quantity;
	public void bubble(int[]market)
	{
	for(int hold=0;hold<=market.length;hold++)
	{
		for(int com=hold+1;com<market.length;com++)
		{
			if(what.equalsIgnoreCase("Productname"))
			{
				if(market[com]=null)
					continue;
				if(market[hold].getProductname().compareTo(market[com].getProductname())>0)
				{
					pavi=market[hold];
					market[hold]=market[com];
					market[com]=pavi;					
				}
			}
			else if(what.equalsIgnoreCase("TypeofItem"))
			{
				if(market[com]==null)
					continue;
				if(market[hold].getTypeofitem().compareTo(market[com].getTypeofitem())>0)
				{
					pavi=market[hold];
					market[hold]=market[com];
					market[com]=pavi;
				}
			}
			else if(what.equalsIgnoreCase("Quantity"))
			{
				if(market[com]==null)
					continue;
				if(market[hold].getQuantity().compareToIgnoreCase(market[com].getQuantity())>=0)
				{
					pavi=market[hold];
					market[hold]=market[com];
					market[com]=pavi;
				}
			}
			else if(what.equalsIgnoreCase("ItemRate"))
			{
				if(market[com]==null)
					continue;
				if(market[hold].getItemrate()>=market[com].getItemrate())
				{
					pavi=market[hold];
					market[hold]=market[com];
					market[com]=pavi;
				}		
			}
		}
	}
}

