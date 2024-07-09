package org.MoodAnalyser;

public class MoodAnalyzer 
{
	String message;
	
	public MoodAnalyzer()
	{
		
	}
	
	public MoodAnalyzer(String message)
	{
		this.message = message;
	}
	
	public String analyseMood() 
	{
        message = message.toLowerCase();
        if(message.contains("sad")){
            return "SAD";
        }else if(message.contains("happy")){
            return "HAPPY";
        }else{
            return "";
        }
    }

	public static void main(String[] args) 
	{
		//System.out.println("Welcome to Mood Analyser Test");
	}


}
