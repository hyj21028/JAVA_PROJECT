package Temple;

import java.util.ArrayList;

class statistics
{

	
	statistics()
	{	

		ArrayList <Integer> salestable=new ArrayList<>();
		ArrayList <Integer> salesprice=new ArrayList<>();
		
		ArrayList <ArrayList<Integer>> salesmenu=new ArrayList<ArrayList<Integer>>();

		ArrayList <Integer> salesmenu0=new ArrayList<>();
		ArrayList <Integer> salesmenu1=new ArrayList<>();
		ArrayList <Integer> salesmenu2=new ArrayList<>();
		ArrayList <Integer> salesmenu3=new ArrayList<>();
		ArrayList <Integer> salesmenu4=new ArrayList<>();
		ArrayList <Integer> salesmenu5=new ArrayList<>();
		ArrayList <Integer> salesmenu6=new ArrayList<>();
		ArrayList <Integer> salesmenu7=new ArrayList<>();
		ArrayList <Integer> salesmenu8=new ArrayList<>();
		ArrayList <Integer> salesmenu9=new ArrayList<>();
		ArrayList <Integer> salesmenu10=new ArrayList<>();
		ArrayList <Integer> salesmenu11=new ArrayList<>();
		
		salesmenu.add(salesmenu0);
		salesmenu.add(salesmenu1);
		salesmenu.add(salesmenu2);
		salesmenu.add(salesmenu3);
		salesmenu.add(salesmenu4);
		salesmenu.add(salesmenu5);
		salesmenu.add(salesmenu6);
		salesmenu.add(salesmenu7);
		salesmenu.add(salesmenu8);
		salesmenu.add(salesmenu9);
		salesmenu.add(salesmenu10);
		salesmenu.add(salesmenu11);
		

		salestable.add(Frame.tablenumber);
		salesprice.add(printbill.total);
		
		for(int i=0;i<salesmenu.size();i++)
		{
			if(salesmenu.get(i).isEmpty())
				{salesmenu.get(i).add(0);}
		}
	
		for(int j=0;j<printbill.bname.size();j++)
		{
		for(int i=0;i<menutype.menuname2.length;i++)
		{
			if(printbill.bname.get(j).equals(menutype.menuname2[i]))
				{salesmenu.get(i).set(salesmenu.get(i).size()-1,Integer.parseInt(printbill.bprice.get(j)));}
		}
		}
		
		System.out.println(salestable.get(0));
		System.out.println(salesprice.get(0));
		System.out.println(salesmenu0.get(0));
		System.out.println(salesmenu1.get(0));
		System.out.println(salesmenu2.get(0));
		System.out.println(salesmenu3.get(0));
		System.out.println(salesmenu4.get(0));
		System.out.println(salesmenu5.get(0));
		System.out.println(salesmenu6.get(0));
		System.out.println(salesmenu7.get(0));
		System.out.println(salesmenu8.get(0));
		System.out.println(salesmenu9.get(0));
		System.out.println(salesmenu10.get(0));
		System.out.println(salesmenu11.get(0));
		
		return;
	}
}
