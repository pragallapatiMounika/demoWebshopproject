@tag 
Feature: Login for demoWebShop 
	I want to use this template for my feature files
@tag_1 
Scenario Outline: Login To DemoWeb with valid credentials 
	Given User on My LoginPage 
	And User enter <username> and <password>
	Then User click LoginButton 
	
	Examples: 
		|	 username                        |	password	      |
		|	chotabheem@gmail.com	         |	chotabheem        |
		|    lioness@gmail.com               |  lioncub           |
		
		
@tag_1 
Scenario: Select the desired product
	Given User Clicks Electronics 
	When click cellphones 
	And click smartPhones 
	Then click addtoCart 
			
			
	@tag_1	
	Scenario Outline: tag_13Login To DemoWeb with valid credentials
	Given tag_13User on My LoginPage
	And tag_13User enter <username> and <password>
	Then tag_13User click LoginButton
	Then User Click The ShoppingCart
	And Clicks gotocart
	Then click continue shopping 
	
	Examples: 
		|	 username                        |	password	      |
		|	chotabheem@gmail.com	         |	chotabheem        |
		|    lioness@gmail.com               |  lioncub           | 
			
			
			
@tag_1 
Scenario: Selecting the desired book 
	Given User clicks the books 
	When Click Computing 
	Then Click CompareList 
			
			
@tag_1
Scenario Outline: 1Login To DemoWeb with valid credentials 
	Given 1User on My LoginPage 
	And 1User enter <username> and <password>
	Then 1User click LoginButton
	Then click wishlist 
	Then click Logout
	
	Examples: 
		|	 username                        |	password	      |
		|	chotabheem@gmail.com	         |	chotabheem        |
		|    lioness@gmail.com               |  lioncub           |
			 
			
			
		