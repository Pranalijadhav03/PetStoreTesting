package com.bridgelabz.petstorerestassuredtesting;

import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;


    public class PetStoreRestAssuredTestingForUser {

        @Test(priority = 0)
        
        public void createUser() {
            Response response = given()
                    .accept("application/json")
                    .contentType("application/json")
                    .body("{\n" +
                            "  \"id\": 0,\n" +
                            "  \"username\": \"pranalijadhav\",\n" +
                            "  \"firstName\": \"pranali\",\n" +
                            "  \"lastName\": \"jadhav\",\n" +
                            "  \"email\": \"jadhavpranali55@gmail.com\",\n" +
                            "  \"password\": \"Pranali24\",\n" +
                            "  \"phone\": \"8450939795\",\n" +
                            "  \"userStatus\": 0\n" +
                            "}")
                    .when()
                    .post("https://petstore.swagger.io/v2/user");
            response.prettyPrint();
            response.then().assertThat().statusCode(200);
        }

        @Test(priority = 1)
        public void createUserWithArray() {
            Response response = given()
                    .accept("application/json")
                    .contentType("application/json")
                    .body("[\n" +
                            "  {\n" +
                            "    \"id\": 0,\n" +
                            "  \"username\": \"pranalijadhav\",\n" +
                            "  \"firstName\": \"pranali\",\n" +
                            "  \"lastName\": \"jadhav\",\n" +
                            "  \"email\": \"jadhavpranali55@gmail.com\",\n" +
                            "  \"password\": \"Pranali24\",\n" +
                            "  \"phone\": \"8450939795\",\n" +
                            "    \"userStatus\": 0\n" +
                            "  }\n" +
                            "]")
                    .when()
                    .post("https://petstore.swagger.io/v2/user/createWithArray");
            response.prettyPrint();
            response.then().assertThat().statusCode(200);
        }

        @Test(priority = 2)
        public void createUserWithList() {
            Response response = given()
                    .accept("application/json")
                    .contentType("application/json")
                    .body("[\n" +
                            "  {\n" +
                            "    \"id\": 0,\n" +
                            "  \"username\": \"pranalijadhav\",\n" +
                            "  \"firstName\": \"pranali\",\n" +
                            "  \"lastName\": \"jadhav\",\n" +
                            "  \"email\": \"jadhavpranali55@gmail.com\",\n" +
                            "  \"password\": \"Pranali24\",\n" +
                            "  \"phone\": \"8450939795\",\n" +
                            "    \"userStatus\": 0\n" +
                            "  }\n" +
                            "]")
                    .when()
                    .post("https://petstore.swagger.io/v2/user/createWithList");
            response.prettyPrint();
            response.then().assertThat().statusCode(200);
        }

        @Test(priority = 3)
        public void deleteUser() {
            Response response = given()
                    .accept("application/json")
                    .contentType("application/json")
                    .when()
                    .delete("https://petstore.swagger.io/v2/user/Ashwini");
            response.prettyPrint();
            response.then().assertThat().statusCode(200);
        }

        @Test(priority = 4)
        public void getUserByUsername() {
            Response response = given()
                    .accept("application/json")
                    .contentType("application/json")
                    .when()
                    .get("https://petstore.swagger.io/v2/user/pranalijadhav");
            response.prettyPrint();
            response.then().assertThat().statusCode(200);
        }

        @Test(priority = 5)
        public void loginWithArray() {
            Response response = given()
                    .accept("application/json")
                    .contentType("application/json")
                    .when()
                    .get("https://petstore.swagger.io/v2/user/login?username=pranalijadhav&password=pranali24");
            response.prettyPrint();
            response.then().assertThat().statusCode(200);
        }

        @Test(priority = 6)
        public void putUpdateUser(){
            Response response = given()
                    .accept("application/json")
                    .contentType("application/json")
                    .body("{\n" +
                            "  \"id\": 0,\n" +
                            "  \"username\": \"panu\",\n" +
                            "  \"firstName\": \"panu\",\n" +
                            "  \"lastName\": \"jadhav\",\n" +
                            "  \"email\": \"panujadhav24@gmail.com\",\n" +
                            "  \"password\": \"Panu123\",\n" +
                            "  \"phone\": \"9456568545\",\n" +
                            "  \"userStatus\": 0\n" +
                            "}")
                    .when()
                    .put("https://petstore.swagger.io/v2/user/pranali");
            response.prettyPrint();
            response.then().assertThat().statusCode(200);
        }

                @Test(priority = 7)
        public void logoutUser() {
            Response response = given()
                    .accept("application/json")
                    .contentType("application/json")
                    .when()
                    .get("https://petstore.swagger.io/v2/user/logout");
            response.prettyPrint();
            response.then().assertThat().statusCode(200);
        }

    }
