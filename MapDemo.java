package p1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;


public class MapDemo {
	
	public static void main(String[] args) {
		
		
		
		
		Map<String, List<ElectronicDevice>>  DevMap = new HashMap<>();
		
		ElectronicDevice e1 = new Moble(10,1172,1234,10000,5,"Vivo"  );
		ElectronicDevice e2 = new Moble(90,112,1264,20000,4,"Oppo" );
		ElectronicDevice e3 = new Moble(60,1912,12834,11100,2,"apple" );
		ElectronicDevice e4 = new Moble(50,1012,12304,13000,5,"narzo" );
		
		
		List<ElectronicDevice> mobList = new ArrayList<>();
		mobList.add(e1);
		mobList.add(e2);
		mobList.add(e3);
		mobList.add(e4);
		
		
		
		ElectronicDevice d1 = new Laptop(1000,112,1234,10000,3,"Dell"  );
		ElectronicDevice d2 = new Laptop(2000,112,1234,50000,3,"HP"  );
		ElectronicDevice d3 = new Laptop(1100,112,1234,30000,3,"Lenevo"  );
		
		List<ElectronicDevice> lapList = new ArrayList<>();
		lapList.add(d1);
		lapList.add(d2);
		lapList.add(d3);
		
		
		DevMap.put("Mobile", mobList);
		DevMap.put("Laptop", lapList);
		
		
		
		Iterator<String> itr = DevMap.keySet().iterator();
		
		while(itr.hasNext())
		{
			
			String deviceName = itr.next();
			
			
			if(deviceName.equals("mobile"))
			{
				List<ElectronicDevice> devices = DevMap.get(deviceName);
				
				for (ElectronicDevice device : devices) {
					if(device.getPrice()>=10000 && device.getPrice()<=15000)
					{
						System.out.println(device);
					}
					else
					{
						System.out.println("No Results Found");
					}
				}
			}
		}
		
	}
	
	
	
	
	

}