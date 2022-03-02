package com.adactin_stepdefinition;

import org.openqa.selenium.WebDriver;

import com.adactin_helper.File_Reader_Manager;
import com.adactin_runner.Test_Runner;
import com.baseclass.New_Baseclass;
import com.page_object_manager.Page__object_Manager;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step_Definition extends New_Baseclass{
	
	public static WebDriver driver= Test_Runner.driver;
	public static Page__object_Manager pom=new Page__object_Manager(driver);
	
	@Given("^user launch The Application$")
	public void user_launch_The_Application() throws Throwable {
		String url = File_Reader_Manager.getInstance().getInstanceCR().geturl();
		driver=New_Baseclass.launch(url);
	}

	
//	@When("^user Enter The Username In The Username Field$")                             
//	public void user_Enter_The_Username_In_The_Username_Field() throws Throwable {
//	   input(pom.getInstancelp().getFname(), "venkatesh5047");
//	   sleep();
//	}
//
//	@When("^user Enter The Password In The Password Field$")
//	public void user_Enter_The_Password_In_The_Password_Field() throws Throwable {
//	    input(pom.getInstancelp().getPassword(), "504413");
//	}

	
	@When("^user Enter The \"([^\"]*)\" In The Username Field$")
	public void user_Enter_The_In_The_Username_Field(String arg1) throws Throwable {
		input(pom.getInstancelp().getFname(), "venkatesh5047");
	}

	@When("^user Enter The \"([^\"]*)\" In The Password Field$")
	public void user_Enter_The_In_The_Password_Field(String arg1) throws Throwable {
		input(pom.getInstancelp().getPassword(), "504413");
	}


	@Then("^user Click the login Button and it navigatesto the search hotel page$")
	public void user_Click_the_login_Button_and_it_navigatesto_the_search_hotel_page() throws Throwable {
	  login(pom.getInstancelp().getLogin());
	  
	}

	@When("^user Enter The location in location field$")
	public void user_Enter_The_location_in_location_field() throws Throwable { 
	    dropdown("byindex", pom.getInstancesp().getLocate(), "4");
	}

	@When("^user Enter The hotels in hotel field$")
	public void user_Enter_The_hotels_in_hotel_field() throws Throwable {
	   keyboard(pom.getInstancesp().getHotel());
	}

	@When("^user Enter The Room Type in Room Type Field$")
	public void user_Enter_The_Room_Type_in_Room_Type_Field() throws Throwable {
	   dropdown("byvisibletext", pom.getInstancesp().getRoom_type(),"Standard");
	}

	@When("^user Enter The Number of Rooms in the Number of Rooms Field$")
	public void user_Enter_The_Number_of_Rooms_in_the_Number_of_Rooms_Field() throws Throwable {
		keyboard(pom.getInstancesp().getNo_of_rooms()); 
	}

	@When("^user Enter The Check in date in check in date field$")
	public void user_Enter_The_Check_in_date_in_check_in_date_field() throws Throwable {
		clear(pom.getInstancesp().getCheck_in());
	   input(pom.getInstancesp().getCheck_in(), "24-02-2022");
	}

	@When("^user Enter The check out date in check out date field$")
	public void user_Enter_The_check_out_date_in_check_out_date_field() throws Throwable {
		clear(pom.getInstancesp().getCheck_out());
		   input(pom.getInstancesp().getCheck_out(), "28-02-2022");
	}

	@When("^user Enter The adult per room in adult per room field$")
	public void user_Enter_The_adult_per_room_in_adult_per_room_field() throws Throwable {
		keyboard(pom.getInstancesp().getAdult_room());
	}

	@When("^user Enter The child per room in child per room field$")
	public void user_Enter_The_child_per_room_in_child_per_room_field() throws Throwable {
		keyboard(pom.getInstancesp().getChil_room());
	}

	@Then("^user Click The Search Button and it navigates to the Select Hotel Page$")
	public void user_Click_The_Search_Button_and_it_navigates_to_the_Select_Hotel_Page() throws Throwable {
	   login(pom.getInstancesp().getSearch());
	}

	@When("^user Click the Radio Button in Select Option Button$")
	public void user_Click_the_Radio_Button_in_Select_Option_Button() throws Throwable {
	    login(pom.getInstancecp().getSelect());
	}

	@Then("^user Click the continue Button and it navigates to the Book a Hotel Page$")
	public void user_Click_the_continue_Button_and_it_navigates_to_the_Book_a_Hotel_Page() throws Throwable {
	   login(pom.getInstancecp().getCont());
	}

	@When("^user Enter the First name in the First name field$")
	public void user_Enter_the_First_name_in_the_First_name_field() throws Throwable {
	   input(pom.getInstancebp().getName(), "venkates");
	}

	@When("^user Enter the last name in the last name field$")
	public void user_Enter_the_last_name_in_the_last_name_field() throws Throwable {
		input(pom.getInstancebp().getLast(), "s");
	}

	@When("^use Enter the Billing address in the field$")
	public void use_Enter_the_Billing_address_in_the_field() throws Throwable {
	   input(pom.getInstancebp().getAddress(),"chennai");
	}

	@When("^user Enter the credit card number in the field$")
	public void user_Enter_the_credit_card_number_in_the_field() throws Throwable {
	    input(pom.getInstancebp().getCredit_card(), "7894561239631234");
	}

	@When("^user Select the Credit card type in the field$")
	public void user_Select_the_Credit_card_type_in_the_field() throws Throwable {
	   dropdown("byvalue", pom.getInstancebp().getType(), "VISA");
	}

	@When("^user Select the expiry Month in the field$")
	public void user_Select_the_expiry_Month_in_the_field() throws Throwable {
	  dropdown("byvisibletext", pom.getInstancebp().getMonth(), "August");
	}

	@When("^user Select the expiry Date in the field$")
	public void user_Select_the_expiry_Date_in_the_field() throws Throwable {
	    dropdown("byvisibletext", pom.getInstancebp().getYear(),"2014");
	}

	@When("^user Enter the cvv number in the field$")
	public void user_Enter_the_cvv_number_in_the_field() throws Throwable {
	   input(pom.getInstancebp().getCvv(), "754");
	}

	@Then("^user Click the book now button and it navigates to the booking confirmation page$")
	public void user_Click_the_book_now_button_and_it_navigates_to_the_booking_confirmation_page() throws Throwable {
	   login(pom.getInstancebp().getSearch_ch());
	   sleep();
	   sleep();
	   Thread.sleep(20000);
	   login(pom.getinstancemp().getMy_ltinerary());
	}
	

	
//	@When("^user confirms the details of the hotels information$")
//	public void user_confirms_the_details_of_the_hotels_information() throws Throwable {
//	
//		
//	    
//	}
	

	@Then("^user Click the My  Itinerary and it navigates to the booked Itinarary page$")
	public void user_Click_the_My_Itinerary_and_it_navigates_to_the_booked_Itinarary_page() throws Throwable {
		java_script();
	   screenshot();
	}


	
	

}
