package manojkumar.m.hotel;
import java.util.Scanner;

public class superstore implements pavithraaction
{
	pavithrahotel[] market=new pavithrahotel[12];
	Scanner scan=new Scanner(System.in);
	public superstore()
	{
		market[0] =new pavithrahotel("saravana masala","papper powder",36,"450G");
		market[1]=new pavithrahotel("aachi masala","z powder",90,"200G");
		market[2]=new pavithrahotel("selvam masala","karamasala",78,"100G");
		market[3]=new pavithrahotel("sakthi masala","z powder",90,"200G");
		market[4]=new pavithrahotel("casery masala","orange casery",7800,"10KG");
		market[5]=new pavithrahotel("casery masala","  red with yellow combo powder",9,"20G");
		market[6]=new pavithrahotel("mutton masala","gravy powder",780,"1KG");
		market[7]=new pavithrahotel("fish masala","fry powder",900,"2KG");
		market[8]=new pavithrahotel("chicken masala","chillypowder",780,"1KG");
		market[9]=new pavithrahotel("egg masala","egg rice powder",100,"2KG");
	}
	public static void main(String[] args)
	{
		pavithrahotel f1=new pavithrahotel(); 
		f1.setProductname("nandhi product");
		f1.setTypeofitem("ulunthu");
		f1.setQuantity("1KG");
		f1.setItemrate(126);
		superstore store =new superstore();
		store.addnewproductname(f1);
		store.listallproductname();
		/*
		 * store.deleteproductname("aasai masala"); 
		 * store.listallproductname();
		 */
//		store.updateproductname("saravana masala");
		/* store.searchproductname("fish masala"); */
		/*
		 * store.deleteproductname("aasai masala");
		 *  store.sortproductname();
		 */
		store.updateproductname("nandhi product");
		 store.listallproductname();
		 store.sortproductname();
		 store.listallproductname();
		}
	

	@Override
	public String addnewproductname(pavithrahotel hotel) {
		// TODO Auto-generated method stub
		for(int index=0;index<market.length;index++)
		{
			if(market[index]==null)
			{
				market[index]=hotel;
				return hotel.getProductname()+" has added this product name";
			}
		}
		return hotel.getProductname()+" hasn't added";
		
	}

	@Override
	public void listallproductname() {
		// TODO Auto-generated method stub
		for(pavithrahotel temp:market)
		{
			if(temp!=null)
				System.out.println(temp);
		}
		
	}

	@Override
	public void deleteproductname(String productname) {
		// TODO Auto-generated method stub
		
		for(int index=0;index<market.length;index++)
		{
			if(market[index]==null)
				continue;
			if(market[index].getProductname().equalsIgnoreCase(productname))
			{
				market[index]=null;
				System.out.println(productname+"is deleted successfully");
				return;
			}
		}
		System.out.println(productname+"hasn't found anywhere");
		
	}

	@Override
	public void searchproductname(String productname) {
		// TODO Auto-generated method stub
		System.out.println("Trying to fetch froum's matching the productname "+productname);
		for(int index=0;index<market.length;index++)
		{
			if(market[index]==null)
				continue;
			if(market[index].getProductname().equalsIgnoreCase(productname))
			{
				System.out.println(market[index]);
			}
		}
	}
	@Override
	public void updateproductname(String productname) {
		// TODO Auto-generated method stub
		for(int index=0;index<market.length;index++)
		{
			if(market[index].getProductname().equalsIgnoreCase(productname)) 
			{
				System.out.println(market[index]);
				System.out.println("tell us your update name");
				String seal= scan.next();
				switch(seal)
				{
				case "productname":
					System.out.println("Tell us product  name: ");
					String xhat=scan.next();
					market[index].setProductname(productname);
					break;
				case "typeofitem":
					System.out.println("tell us new item name");
					String zhat= scan.next();
					market[index].setTypeofitem(zhat);
					break;
				case "quantity":
					System.out.println("tell us exchange quantity");
					String ahat=scan.next();
					market[index].setQuantity(ahat);
					break;
				case "itemrate":
					System.out.println("tell us item rate yearly once changed the all item rate");
					int bhat=scan.nextInt();
					market[index].setItemrate(bhat);
					break;
				
				}
			System.out.println(" has updated in "+productname);
			return;
			}
		}
		System.out.println(productname +"hasn't updated");
	}
	@Override
	public void sortproductname() {
		// TODO Auto-generated method stub
		pavithrahotel pavi=null;
		System.out.println("Based on what you wish to sort");
		String what=scan.next();
		
		for(int hold=0;hold<=market.length;hold++)
		{
			for(int com=hold+1;com<market.length;com++)
			{
				if(what.equalsIgnoreCase("productname"))
				{
					if(market[com]==null)
						continue;
					if(market[hold].getProductname().compareTo(market[com].getProductname())>0)
					{
						pavi=market[hold];
						market[hold]=market[com];
						market[com]=pavi;					
					}
				}
				else if(what.equalsIgnoreCase("typeofitem"))
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
				else if(what.equalsIgnoreCase("quantity"))
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
				else if(what.equalsIgnoreCase("itemrate"))
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
}