package com.jnit;

import java.util.HashMap;
	import java.util.Map;
	import java.util.Map.Entry;
	import java.util.Set;

	public class Hash {

		public static void main(String[] args) {
			HashMap<Integer,String > hash=new HashMap<Integer,String>();
			hash.put(2,"Sugar");
			hash.put(1,"Oil");
			hash.put(5, "Surf");
			hash.put(10, "Rice");
			Set<Map.Entry<Integer,String>> hm=hash.entrySet();
			for(Map.Entry<Integer,String> x:hm)
			{
				if(x.getKey()==2)
				{
					System.out.println(x.getValue());
				}
			}

		}


}
