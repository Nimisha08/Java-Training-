package com.trainingassignment;

public enum TrafficLight 
{
	
	Red(10),
	Green(20),
	Yellow(30);

   private final int duration;
   TrafficLight(int duration)
   
   {
		
	this.duration = duration;
	}

 public int getDuration() 
{
		
	 return this.duration;
}

 public static void main(String[] args)
	{
	for(TrafficLight light: TrafficLight.values())
		{
		System.out.println("The traffic light value is: " +light);
		System.out.println("The duration of that trafic light value is: " + light.getDuration());
		}
	}
}
