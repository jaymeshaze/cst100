/**
 * NFL Player class creates NFLPlayers to be used by PlayerManager
 * 
 * @author Kris
 * @version 2.0
 * @since 07-16-2016
 */
public abstract class NFLPlayer implements Celebrator{
		
	//general demographic
		protected String firstName; 		//index 0
		protected String lastName; 			//index 1
		protected int age; 					//index 2
		protected int height; 				//index 3 - inches
		protected int weight;  				//index 4 - pounds
		protected String college; 			//index 5
		protected String experience; 		//index 6
		protected String playerPosition;	//index 7
		
		protected boolean isSelected = false;	//index varies from offensive to defensive
		
		//no-arg constructor
		NFLPlayer(){
		}
		
		//constructor for basic NFLPlayer
		NFLPlayer(String player){
			//split string to an array
			String[] playerStats = player.split(",");
			
			//assign values based on split string array
			this.firstName = playerStats[0];
			this.lastName = playerStats[1];
			this.age = Integer.parseInt(playerStats[2]);
			this.height = Integer.parseInt(playerStats[3]);
			this.weight = Integer.parseInt(playerStats[4]);
			this.college = playerStats[5];
			this.experience = playerStats[6];
			this.playerPosition = playerStats[7];
		}
		
		//setters for NFLPlayer
		public void setFirstName(String firstName){
			this.firstName = firstName;
		}
		
		public void setLastName(String lastName){
			this.lastName = lastName;
		}
		
		public void setAge(int age){
			this.age = age;
		}
		
		public void setHeight(int height){
			this.height = height;
		}
		
		public void setWeight(int weight){
			this.weight = weight;
		}
		
		public void setCollege(String college){
			this.college = college;
		}
		
		public void setExperience(String experience){
			this.experience = experience;
		}
		
		public void setIsSelected(boolean isSelected){
			this.isSelected = isSelected;
		}
		
		//getters for NFLPlayer
		public String getFirstName(){
			return firstName;
		}
		
		public String getLastName(){
			return lastName;
		}
		
		public int getAge(){
			return age;
		}
		
		public int getHeight(){
			return height;
		}
		
		public int getWeight(){
			return weight;
		}
		
		public String getCollege(){
			return college;
		}
		
		public String getExperience(){
			return experience;
		}
		
		public boolean getIsSelected(){
			return this.isSelected;
		}
		
	
		//Display as String (to be overridden by Offensive and Defensive)
		public String toString(){
			return (firstName + "," + lastName + "," + age + "," + height + "," + weight + "," + college + "," + experience + "," + playerPosition);
		}
		
		//String for delimited String of all stats
		public String toFullString(){
			return (firstName + "," + lastName + "," + age + "," + height + "," + weight + "," + college + "," + experience + "," + playerPosition);
		}
		
		//String to be shown with formatting for Notification box
		public String toNotificationString(){
			return ("Name: " + firstName + " " + lastName + 
					"\nAge: " + age + "     Height: " + height + "\"     Weight: " + weight + "lb" +
					"\nCollege: " + college + "     Experience: " + experience + "     Position: " + playerPosition);
		}
		
}