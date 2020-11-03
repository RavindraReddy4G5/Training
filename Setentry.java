package com.jnit;

		import java.util.Iterator;
		import java.util.Map;
		import java.util.Set;
		import java.util.TreeMap;

		public class Setentry {

			public static void main(String[] args)
			{
				TreeMap<Integer,String > map=new TreeMap<Integer,String>();
				map.put(201,"Kittu");
				map.put(202,"Siva");
				map.put(401,"Sriram");
				map.put(405,"Krishna");
				map.put(408,"Pavan");
				map.put(505,"Lucky");
				map.put(333,"Greesh");
				map.put(420,"babu");
				map.put(789,"jaggu");
				map.put(455,"mohan");
				Set entry=map.entrySet();
				Iterator iterator=entry.iterator();
				while(iterator.hasNext())
				{
					Map.Entry hm=(Map.Entry) iterator.next();
					System.out.println(hm.getKey() + " " + hm.getValue());
				}



			}

	

}
