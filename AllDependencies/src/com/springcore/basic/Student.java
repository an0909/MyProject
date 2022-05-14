package com.springcore.basic;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Vector;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
@Component
public class Student {
	@Value("1")
	private Integer rollNo;
	@Value("Rahul")
	private String name;
	@Value("Maths")
	private String subject;
	@Value("75")
	private Float marks;
	@Autowired
	private Address address;
	@Autowired
	private Date date;
	@Autowired
	private LinkedList<String> l;
	@Autowired
	private ArrayList<String> al;
	@Autowired
	private Vector<String> v;
	@Autowired
	private HashSet<Integer> hs;
	@Autowired
	private LinkedHashSet<String> lhs;
	@Autowired
	private HashMap<String, Integer> hm;
	@Autowired
	private LinkedHashMap<Integer, String> lhm;
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", subject=" + subject + ", marks=" + marks
				+ ", address=" + address + ", \ndate=" + date + ", \nLinked List=" + l + ", \n Array list=" + al 
				+ ", \n Vector=" + v + ", \n Hash set=" + hs
				+ ", \n Linked HashSet=" + lhs + ", \n HashedMap=" + hm + ", \n ListHashMap=" + lhm + "]";
	}
	
	
	
}
