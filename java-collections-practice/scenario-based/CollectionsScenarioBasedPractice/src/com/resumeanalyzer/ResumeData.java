package com.resumeanalyzer;
import java.util.List;

//Create a ResumeData class that store the data about resume
public class ResumeData {
	
    private String email;
    private String phone;
    private List<String> matchedKeywords;
    private int matchCount;

    //constructor 
    public ResumeData(String email, String phone, List<String> matchedKeywords) {
        this.email = email;
        this.phone = phone;
        this.matchedKeywords = matchedKeywords;
        this.matchCount = matchedKeywords.size();
    }
    public String getEmail() {
    	
        return email;
    }

    public int getMatchCount() {
        return matchCount;
    }

    public String toString() {
        return "Email: " + email +", Phone: " + phone +", Keywords: " + matchedKeywords + ", Match Count: " + matchCount;
    }
}

