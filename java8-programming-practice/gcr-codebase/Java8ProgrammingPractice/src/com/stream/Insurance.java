package com.stream;

import java.util.*;
import java.util.stream.*;



public class Insurance{
	
	public static class InsuranceClaimAnalysis {
	    String claimType;
	    double claimAmount;

	    InsuranceClaimAnalysis(String claimType, double claimAmount) {
	        this.claimType = claimType;
	        this.claimAmount = claimAmount;
	    }
	}
    public static void main(String[] args) {

        List<InsuranceClaimAnalysis> claims = Arrays.asList(
            new InsuranceClaimAnalysis("Health", 15000),
            new InsuranceClaimAnalysis("Vehicle", 25000),
            new InsuranceClaimAnalysis("Health", 18000),
            new InsuranceClaimAnalysis("Home", 30000),
            new InsuranceClaimAnalysis("Vehicle", 22000),
            new InsuranceClaimAnalysis("Home", 28000)
        );

        Map<String, Double> averageClaimByType =
            claims.stream()
                  .collect(Collectors.groupingBy(
                      c -> c.claimType,
                      Collectors.averagingDouble(c -> c.claimAmount)
                  ));

        averageClaimByType.forEach((type, avg) ->
            System.out.println(type + " Average Claim: " + avg)
        );
    }
}
