package com.json.handsonpracticeproblems;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class MergeTwoJsonFiles {

	public static void main(String[] args) throws Exception {

		ObjectMapper mapper = new ObjectMapper();

		ObjectNode json1 = (ObjectNode) mapper.readTree(new File("C:\\Users\\thisi\\OneDrive\\Desktop\\confident\\file1.json"));
		ObjectNode json2 = (ObjectNode) mapper.readTree(new File("C:\\Users\\thisi\\OneDrive\\Desktop\\confident\\file2.json"));

		json1.setAll(json2);

		System.out.println(json1.toPrettyString());
	}
}