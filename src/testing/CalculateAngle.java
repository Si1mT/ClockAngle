package testing;

import java.awt.List;

public class CalculateAngle {
	
	public Boolean calculateAngle(String time) {
			
		int angle = 0;
		String[] input = {"0", "1"};
		
		if(time.contains(":") && time.length() == 5) {
			
			input = time.split(":");

			try {
				
				Integer.parseInt(input[0]);
				Integer.parseInt(input[1]);
			}
			catch(NumberFormatException e){
				
				System.out.println("Bad input. Accepted formats: hh:mm, hhmm");
				
				return false;
			}
		}
		else if(time.matches("[0-9]+") && time.length() == 4) {
			
			List inputList = new List();
			int index = 0;
			
			while(index < time.length()) {
				
				inputList.add(time.substring(index, index+2));
				index+=2;
			}
			
			for(int i = 0; i < inputList.getItemCount(); i++)
				input[i] = inputList.getItem(i);
		}
		else {
			
			System.out.println("Bad input. Accepted formats: hh:mm, hhmm");
			
			return false;
		}
		
		int hour = Integer.parseInt(input[0]) * 30;

		int minute = Integer.parseInt(input[1]) * 6;
		
	    angle = hour - minute;
	    
	    if(angle < 0)
	    	angle *= -1;
	    
	    while(angle > 180)
	    	angle = angle - 360;

	    if(angle < 0)
	    	angle *= -1;
	    
	    System.out.println(angle);
	    
	    return true;
	}
}
