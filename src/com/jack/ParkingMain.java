package com.jack;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ParkingMain {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-DD HH:mm");
		Date enter = sdf.parse("2018-06-07 08:00");
		Car c = new Car("001", enter);
		Date leave = sdf.parse("2018-06-07 18:31");
		ParkingLot lot = new ParkingLot();
		lot.addCar(c);
		int fee = lot.checkTime(c, leave);
		System.out.println(fee);
	}

}
