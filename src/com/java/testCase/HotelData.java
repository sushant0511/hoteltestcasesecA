package com.java.testCase;

import java.util.ArrayList;
import java.util.List;

public class HotelData {

	public List<Hotel> storeAllHotels()
	{
		Hotel h1=new Hotel(1, "Crown", "L1", 8000);
		Hotel h2=new Hotel(2, "Sarovar", "L1", 9000);
		Hotel h3=new Hotel(3, "LemonTree", "L1", 13000);
		
		List<Hotel> hotels=new ArrayList<Hotel>();
		hotels.add(h1);
		hotels.add(h2);
		hotels.add(h3);
		return hotels;
		
	}
}
