package com.springcore.basic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Address {
	@Value("22")
	private String hNo;
	@Value("2")
	private Integer street;
	@Value("Ghaziabad")
	private String city;
	@Override
	public String toString() {
		return "Address [House No=" + hNo + ", Street No =" + street + ", City=" + city + "]";
	}
	System.out.println("Hello");
}
