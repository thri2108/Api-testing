package com.simplilearn.RestAssured_dummyapi;

import static io.restassured.RestAssured.baseURI;

import static io.restassured.RestAssured.*;
import  static io.restassured.matcher.RestAssuredMatchers.*;
import  static org.hamcrest.Matchers.*;

import org.json.JSONObject;
import org.testng.annotations.Test;



public class apitesting {
	
	@Test
	public void Test1() {
		
		//JSONObject request = new JSONObject();
		
		baseURI ="https://dummy.restapiexample.com/api/";
		
		given().get("v1/employees").then().log().all().statusCode(200);
		
	}
	
	@Test
	public void test2() {
		
		
		//JSONObject request = new JSONObject();
		
		baseURI ="https://dummy.restapiexample.com/api/";
		
		given().get("v1/employee/5").then().log().all().statusCode(200);
		
		
	}
	
	@Test
	public void test3() {
		
	JSONObject request = new JSONObject();
	request.put("employee_name", "Siddharth");
	request.put("employee_salary", "250000");
		
		baseURI ="https://dummy.restapiexample.com/api/";
		
		given().body(request.toString()).put("v1/update/21").then().log().all().statusCode(200);
		
		
	}
	
	@Test
	public void test4() {
		
		baseURI ="https://dummy.restapiexample.com/api/";
		
		when().delete("v1/delete/2").then().statusCode(204).log().all();
		
		
	}

}
