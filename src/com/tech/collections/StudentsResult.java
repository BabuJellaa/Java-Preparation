package com.tech.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class StudentsResult {
	public static void main(String[] args) {
		Map<String,Float> map=new HashMap<String,Float>();
		Map<String,String> resultMap=new HashMap<String,String>();
		map.put("seleva",75.6f);
		map.put("abhi", 89.5f);
		map.put("ram",40f);

		for(Entry<String, Float> marks:map.entrySet()) {
			if(marks.getValue()>60) {
				resultMap.put(marks.getKey(), "pass");
			}else {
				resultMap.put(marks.getKey(), "fail");
			}
		}
		StringBuilder formattedOutput = new StringBuilder("{");
        for (Entry<String, String> entry : resultMap.entrySet()) {
            formattedOutput.append(entry.getKey()).append(":").append(entry.getValue()).append(", ");
        }
        if (formattedOutput.length() > 1) {
            formattedOutput.setLength(formattedOutput.length() - 2);
        }
        formattedOutput.append("}");

        System.out.println(formattedOutput.toString());
		
	}
}
