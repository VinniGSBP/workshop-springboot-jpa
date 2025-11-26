package com.workshop.course.entities.enums;

public enum OrderStatuts {

	WAINTING_PAYMENT(1),
	PAID(2),
	SHIPPED(3),
	DELIVERED(4),
	CANCELED(5);
	
	private int code;
	
	private OrderStatuts(int code) {
		this.code = code;
	}
	
	public int getCode() {
		return code;
	}
	
	public static OrderStatuts valueOf(int code) {
		for(OrderStatuts value : OrderStatuts.values()) {
			if(value.getCode() == code) {
				return value;
			}
			
		}
		throw new IllegalArgumentException("Invalid OrderStatus code");
	}
}
