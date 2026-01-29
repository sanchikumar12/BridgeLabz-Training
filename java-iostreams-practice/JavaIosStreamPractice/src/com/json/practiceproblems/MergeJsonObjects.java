package com.json.practiceproblems;

import org.json.JSONObject;

public class MergeJsonObjects {

    public static void main(String[] args) {

        JSONObject json1 = new JSONObject();
        json1.put("name", "Keshav");
        json1.put("age", 22);

        JSONObject json2 = new JSONObject();
        json2.put("email", "Keshav@gmail.com");
        json2.put("course", "Java Full Stack");

        for(String key:json2.keySet()) {
        	json1.put(key, json2.get(key));
        }

        System.out.println(json1.toString(4));
    }
}