package org.steps;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class step_Defination {
	
WebDriver driver;
@Given("bank manager should be on application")
public void bank_manager_should_be_on_application() throws InterruptedException {
	driver=new ChromeDriver();
    driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
    driver.manage().window().maximize();
    Thread.sleep(5000);
}
@When("click on bank manager login button")
public void click_on_bank_manager_login_button() {
	driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/div[2]/button")).click();
	
	
   
}
@Then("page redirects to Add customer page")
public void page_redirects_to_add_customer_page() {
	System.out.println("landed in add customer page");
}
@When("click on add customer button")
public void click_on_add_customer_button() throws InterruptedException {
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/button[1]")).click();
   
}
@When("enter first name,last name and post code")
public void enter_first_name_last_name_and_post_code() throws InterruptedException {
	Thread.sleep(2000);
    driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[1]/input")).sendKeys("hari");
    driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[2]/input")).sendKeys("krish");
    driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[3]/input")).sendKeys("518994");
    
}
@When("click on add customer")
public void click_on_add_customer() {
	driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/button")).click();
	driver.switchTo().alert().accept();
	
	}

@When("selecting a registered customer name")
public void selecting_a_registered_customer_name() throws InterruptedException  {
	Thread.sleep(9000);
	driver.findElement(By.xpath("//button[@ng-click='openAccount()']")).click();
		Thread.sleep(4000);
	driver.findElement(By.name("userSelect")).click();
Select f = new Select(driver.findElement(By.name("userSelect")));
f.selectByValue("6");

	
   
}
@When("selecting a currency")
public void selecting_a_currency() {
    
	driver.findElement(By.name("currency")).click();

	Select x = new Select(driver.findElement(By.name("currency")));
	x.selectByVisibleText("Rupee");	
}
@When("click on process button")
public void click_on_process_button() {
    driver.findElement(By.xpath("//button[@type='submit']")).click();
    driver.switchTo().alert().accept();
}
@When("click on Customer button")
public void click_on_customer_button() throws InterruptedException {
	
	driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/button[3]")).click();
	Thread.sleep(3000);

}
@When("select cuctomer name to show customer details")
public void select_cuctomer_name_to_show_customer_details() {
driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/table/tbody/tr[3]/td[5]/button")).click();
	
	driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/form/div/div/input")).sendKeys("hari");
  
  
}
@When("click on Home button")
public void click_on_home_button() {
  driver.findElement(By.xpath("/html/body/div/div/div[1]/button[1]")).click();
}
@When("click on customer login")
public void click_on_customer_login() {
	driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/div[1]/button")).click();
   
}
@When("Select registerd customer name and click on login")
public void select_registerd_customer_name_and_click_on_login() throws InterruptedException {
	Thread.sleep(4000);
	Select se = new Select(driver.findElement(By.name("userSelect")));
	se.selectByVisibleText("hari krish");
	driver.findElement(By.xpath("/html/body/div/div/div[2]/div/form/button")).click();

}
@When("click on deposit button and enter amount and click on Deposit button")
public void click_on_deposit_button_and_enter_amount_and_click_on_deposit_button() throws InterruptedException {
	Thread.sleep(6000);
	driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[3]/button[2]")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[4]/div/form/div/input")).sendKeys("50000");
	driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[4]/div/form/button")).click();

}
@When("click on withdrawl button and enter amipunt and select withdraw button")
public void click_on_withdrawl_button_and_enter_amipunt_and_select_withdraw_button() throws InterruptedException {
	driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[3]/button[3]")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[4]/div/form/div/input")).sendKeys("5000");
	driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[4]/div/form/button")).click();
    
}
@When("click on Transactions button to see all transactions made by cuctomer")
public void click_on_transactions_button_to_see_all_transactions_made_by_cuctomer() {
	driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[3]/button[1]")).click();

}
@Then("it is redirected to transaction page")
public void it_is_redirected_to_transaction_page() {
	System.out.println("transaction page opens");
	
   
}
@Then("click on logout button")
public void click_on_logout_button() {
	
	driver.findElement(By.xpath("/html/body/div/div/div[1]/button[2]")).click();
   
}
@Then("it is redirected to home page")
public void it_is_redirected_to_home_page() {
	driver.findElement(By.xpath("/html/body/div/div/div[1]/button[1]")).click();
	System.out.println("i seen home page");
	
}



}
