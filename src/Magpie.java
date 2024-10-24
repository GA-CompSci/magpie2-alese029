// /**
//  * A program to carry on conversations with a human user.
//  * This is the initial version that:
//  * <ul>
//  * <li>
//  * 
//  * Uses indexOf to find strings
//  * </li>
//  * <li>
//  * Handles responding to simple words and phrases
//  * </li>
//  * </ul>
//  * This version uses a nested if to handle default responses.
//  * 
//  * @author Laurie White
//  * @version April 2012
//  */

		public class Magpie {
			// INSTANCE VARIABLE
			String lastTopic = "";
		
			// Get a default greeting
			public String getGreeting() {
				return "Hello, what's crackalackin?";
			}
		
			// Gives a response to a user statement
			public String getResponse(String statement) {
				statement = statement.toLowerCase().strip();
				String response = "";
		
				// -- NEGATIVE --
				if (findKeyword(statement, "no") >= 0) {
					response = "Why so negative?";
				} 
				
				// -- FAMILY -- // check father
				else if (findKeyword(statement,"mother") >= 0
						|| findKeyword(statement,"father") >= 0
						||findKeyword(statement,"sister") >= 0
						||findKeyword(statement,"brother") >= 0) {
					if (lastTopic.equals("family"))
						response = "You're lucky to have such a great family.";
					else
						response = "Tell me more about your family.";
					lastTopic = "family";
				} 


				// -- BLANK MESSAGE --
				else if (statement.length() == 0) {
					response = "Say something, please.";
				} 
				
				// -- PETS --
				// -- PETS --// should we add more animals?
				else if (findKeyword(statement,"cat") != -1
						|| findKeyword(statement,"dog") != -1
						|| findKeyword(statement,"fish") != -1
						|| findKeyword(statement,"hamster") != -1) {
					if (lastTopic.equals("pets"))
						response = "I never get tired of talking about pets.";
					else
						response = "Tell me more about your pets.";
					lastTopic = "pets";
				} 

				// --Teacher--
				else if((findKeyword(statement,"Adiletta")!= -1) 
					||(findKeyword(statement,"Fowler")!= -1) 
					||(findKeyword(statement,"Lindley"))!= -1 ) 
					{
						response= "He sounds like a good teacher";
					}
					
				
				
				// -- I like ... --
				// -- I like ... --
				else if (findKeyword(statement, "i like") != -1) {
					String something = statement.substring(statement.indexOf("i like" )+ 7,statement.length());
					response = "What do you like about " + something + "?";
				} 
				
				
				// -- I want .. --
				else if (findKeyword(statement, "i want") != -1) {
					int location = findKeyword(statement, "i want") + "i want".length();
					String something = statement.substring(location);
						response = "Would you be really happy if you had " + something + "?";
				
					}
				// I something you
				else if ((findKeyword(statement, "I") != -1) && 
        			 (findKeyword(statement, "you") != -1) &&
         			(findKeyword(statement, "I") < findKeyword(statement, "you"))) 
					{
					int startLocation = findKeyword(statement, "I")  + 1;
					int endLocation = findKeyword(statement, "you") -1;

					String something = statement.substring(startLocation, endLocation);
					 response = "Why do you" + something + " me?";
					}
				else{
					response = getRandomResponse();
				}
					
				return response; 
				} 
				
				// I something YOU ... 
				// I something YOU ... 


				// RANDOM 
				
		
		///?*****__*fnreturn response;
			
		
			// Pick a default response to use if nothing else fits
			private String getRandomResponse() {				
				final int NUMBER_OF_RESPONSES = 10;
				double r = Math.random();
				int whichResponse = (int) (r * NUMBER_OF_RESPONSES);
				String response = "";
		
				if (whichResponse == 0) {
					response = "Interesting, tell me more.";
				} else if (whichResponse == 1) {
					response = "Hmmm.";
				} else if (whichResponse == 2) {
					response = "Do you really think so?";
				} else if (whichResponse == 3) {
					response = "You don't say.";
				} else if (whichResponse == 4) {
					response = "And then you can put any response you want.";
				} else if (whichResponse == 5) {
					response = "That's what you wanted to say.";
				} else if (whichResponse == 6) {
					response = "Run in place.";
				} else if (whichResponse == 7) {
					response = "Jump up and down.";
				} else if(whichResponse == 8) {
					response = " Talk to the french";
				} else if(whichResponse == 9) {
					response = " Compliment a friend";
				}

				return response;
			}
		
			// Search for one word in a phrase (case-insensitive)
			private int findKeyword(String statement, String goal, int startPos) {
				String phrase = statement.trim().toLowerCase();
				goal = goal.toLowerCase();
				int psn = phrase.indexOf(goal, startPos);
		
				while (psn >= 0) {
					String before = " ", after = " ";
					if (psn > 0) {
						before = phrase.substring(psn - 1, psn);
					}
					if (psn + goal.length() < phrase.length()) {
						after = phrase.substring(psn + goal.length(), psn + goal.length() + 1);
					}
		
					if (((before.compareTo("a") < 0) || (before.compareTo("z") > 0))
							&& ((after.compareTo("a") < 0) || (after.compareTo("z") > 0))) {
						return psn;
					}
		
					psn = phrase.indexOf(goal, psn + 1);
				}
		
				return -1;
			}
		
			// Overloaded method to start searching from the beginning
			private int findKeyword(String statement, String goal) {
				return findKeyword(statement, goal, 0);
			}
		}
		