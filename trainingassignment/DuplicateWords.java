package com.trainingassignment;

import java.util.HashMap;

public class DuplicateWords {
	
	public void main(String[] args) {
	String s = "Big black bug bit a big black dog on his big black nose";
	String[] s1 = s.toLowerCase().split(" ");
	HashMap<String, Integer> hm = new HashMap<String , Integer>();
	for (String str : s1)
	{
	if(hm.containsKey(str))
	{
	int x = hm.get(str);
	hm.put(str, x+1);
	}
	else
	{
	hm.put(str, 1);
	}
	}
	System.out.println(hm);

	}
	}


