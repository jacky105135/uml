package com.jack;

import java.util.Date;

public class Car {
	String id;
	Date enter;
	Date leave;

	public Car(String id, Date enter) {
		super();
		this.id = id;
		this.enter = enter;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getEnter() {
		return enter;
	}

	public void setEnter(Date enter) {
		this.enter = enter;
	}

	public Date getLeave() {
		return leave;
	}

	public void setLeave(Date leave) {
		this.leave = leave;
	}

}
