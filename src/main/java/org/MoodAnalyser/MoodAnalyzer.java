package org.MoodAnalyser;

public class MoodAnalyzer 
{
	String message;
	
	enum Mood{
        HAPPY, SAD
    }
	
	public MoodAnalyzer()
	{
		
	}
	
	public MoodAnalyzer(String message)
	{
		this.message = message;
	}
	
	public String analyseMood() 
	{
		String result = "";
		try
		{
			message = message.toLowerCase();
			if(message.equals(""))
			{
                throw new MoodAnalysisException("EMPTY MOOD");
            }
	        if(message.contains("sad"))
	        {
	            result= "SAD";
	        }
	        else if(message.contains("happy"))
	        {
	            result = "HAPPY";
	        }
	        else
	        {
	            result= "";
	        }
		}
		catch(MoodAnalysisException e)
		{
			 result = e.getMessage();
		}
		catch(NullPointerException f)
		{
			result = "NULL";
		}
		return result;
		
		
    }
	
	

	public static void main(String[] args) 
	{
		//System.out.println("Welcome to Mood Analyser Test");
	}


}
