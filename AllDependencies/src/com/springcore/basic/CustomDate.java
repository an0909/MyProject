package com.springcore.basic;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Vector;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@Configuration
@ComponentScan(basePackages = "com.springcore.basic")
public class CustomDate {

	@Bean
	public Date getDate()
	{
		return new Date();
	}
	
	@Bean
	public ArrayList<String> getArrayList()
	{
		ArrayList<String> al = new ArrayList();
		al.add("Aman");
		al.add("Raman");
		al.add("Suman");
		al.add("Amit");
		
		return al;
	}
	
	@Bean
	public LinkedList<String> getLinkedList()
	{
		LinkedList<String> l = new LinkedList();
		l.add("Rohit");
		l.add("Virat");
		l.add("Shikhar");
		l.add("Bumrah");
		
		return l;
	}
	
	@Bean
	public Vector<String> getVector()
	{
		Vector<String> v = new Vector();
		v.add("Rohit");
		v.add("Virat");
		v.add("Shikhar");
		v.add("Bumrah");
		
		return v;
	}
	
	@Bean
	public HashSet<Integer> getHashSet()
	{
		HashSet<Integer> hs = new HashSet();
		hs.add(1);
		hs.add(2);
		hs.add(3);
		hs.add(4);
		
		return hs;
	}

	@Bean
	public LinkedHashSet<String> getLinkedHashSet()
	{
		LinkedHashSet<String> lhs = new LinkedHashSet();
		lhs.add("Saurav");
		lhs.add("Saurav");
		lhs.add("Saurav");
		lhs.add("Saurav");
		
		return lhs;
	}
	
	@Bean
	public HashMap<String, Integer> getHashMap()
	{
		HashMap<String, Integer> hm = new HashMap();
		hm.put("Shubham", 5);
		hm.put("Sumit", 6);
		hm.put("Sunny", 7);
		hm.put("Shivam", 8);
		return hm;
	}
	
	@Bean
	public LinkedHashMap<Integer, String> getLinkedHashMap()
	{
		LinkedHashMap<Integer, String> lhm = new LinkedHashMap();
		lhm.put(1, "Rishi");
		lhm.put(2, "Rahul");
		lhm.put(3, "Rohit");
		lhm.put(4, "Rommie");
		return lhm;
	}
}
