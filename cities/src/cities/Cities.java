package cities;

import java.util.HashMap;
import java.util.Scanner;


public class Cities {

	private HashMap<String,Integer> distance = new HashMap<String,Integer>();
	private HashMap<Integer,String> city = new HashMap<Integer,String>();
	
	public void addCity(Integer i,String s) {
		city.put(i, s);
	}
	public int getCityNum() {
		return city.keySet().size();
	}
	public String getCity(int i) {
		return city.get(i);
	}
	//get distance
	public void addDistance(String s,Integer i) {
		distance.put(s, i);
	}
	public int getDistance (String s) {
		return distance.get(s);
		
	}
	
	public static void main(String[] args) {
		Cities cities = new Cities();
		Scanner in = new Scanner(System.in);
		int num = 0;
		String str = in.next();		
		while(!str.equals("###"))
		{
			cities.addCity(num,str);
			num++;
			str = in.next();
		}
		for(int i = 0;i < cities.getCityNum();i++)
		{
			for(int j = 0;j < cities.getCityNum();j++)
			{
				cities.addDistance(cities.getCity(i) + cities.getCity(j), in.nextInt());
			}
		}
		String input = in.next() + in.next();
		in.close();
		System.out.println(cities.getDistance(input));
	}

}
