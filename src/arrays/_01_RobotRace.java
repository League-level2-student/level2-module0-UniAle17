package arrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
	public static void main(String[] args) {
		
	

	//2. create an array of 5 robots.
		
		Robot [] robots = new Robot[5];
		

	//3. use a for loop to initialize the robots.
		
		for (int i = 0; i < robots.length; i++) {
			
			robots[i] = new Robot();
			robots[i].moveTo(i*200, 250);
		}
		

		//4. make each robot start at the bottom of the screen, side by side, facing up
		
		
		
		

	//5. use another for loop to iterate through the array and make each robot move 
	//   a random amount less than 50.

		Random a = new Random();
		
		boolean race = true;
		while(race==true) {
			
			
		
		
		for (int i = 0; i < robots.length; i++) {
			
		
		
		
			robots[i].move(a.nextInt(50));
			
		
			
				if(robots[i].getY()<0 ) {
				JOptionPane.showMessageDialog(null, "The winner is robot # " + i );
				race=false;
				break;
				
		}
			

	    }
			}
		
		
	//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.
		
		

	//7. declare that robot the winner and throw it a party!

		
		
		
	//8. try different races with different amounts of robots.
		
		Robot [] rob = new Robot[3];
		
for (int i = 0; i < rob.length; i++) {
			
			rob[i] = new Robot();
			rob[i].moveTo(i*220, 220);
		}
		
		
       Random n = new Random();
      boolean go = true;
       
       
       while(go==true) {
    	  
    	   for (int i = 0; i < rob.length; i++) {
			
    		  rob[i].move(n.nextInt(50));
    		  
    		  if(rob[i].getY()<0) {
    			  
    			  go=false;
    			  JOptionPane.showMessageDialog(null, "The winner of thisrace is robot #" + i);
    			  break;
    			  
    		  }
    		   
		}
       }
		
		

	//9. make the robots race around a circular track.
       

	
	
	
	
	
	}
		}
