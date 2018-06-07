package com.jack;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ParkingLot {
	int size = 50;
	int hourFeed = 30;
	List<Car> cars = new ArrayList<>();

	public int checkTime(Car car, Date leave) {
		long duration = leave.getTime() - car.getEnter().getTime();//long 為毫秒
		long hour = duration / 1000 / 60 / 60;
		long minute = (duration / 1000 / 60) % 60;
		long fee = hourFeed * hour + (minute > 30 ? hourFeed : hourFeed / 2);
		return (int) fee;
	}

	public void addCar(Car car) {
		cars.add(car);
	}
}
