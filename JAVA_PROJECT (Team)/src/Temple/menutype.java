package Temple;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

class menutype
{
	public static HashMap<String,Integer>menuname=new HashMap<String,Integer>();
	

	public static String[] menuname2 = { "후라이드", "양념", "간장", "칠리","깐풍","허니", "콜라", "사이다","맥주","소주", "콘샐러드","치즈스틱" };
//	public static int[] menuprice= {15000,16000,17000,18000,2000,1900,5000};
	public menutype()
	{
		menuname.put("후라이드",15000);
		menuname.put("양념",16000);
		menuname.put("간장",17000);
		menuname.put("칠리",18000);
		menuname.put("깐풍",19000);
		menuname.put("허니",19000);
		menuname.put("콜라",3000);
		menuname.put("사이다",3000);
		menuname.put("맥주",4000);
		menuname.put("소주",4000);
		menuname.put("콘샐러드",3000);
		menuname.put("치즈스틱",3000);
		

	}
}


	