import org.MoodAnalyser.MoodAnalyzer;
import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest
{

	@Test
    public void result1()
    {
        MoodAnalyzer mood1 = new MoodAnalyzer("I am in sad mood");
        String result = mood1.analyseMood();
        Assert.assertEquals("SAD", result);
    }
	
    @Test
    public void result2()
    {
        MoodAnalyzer mood1 = new MoodAnalyzer(null);
        String result = mood1.analyseMood();
        Assert.assertEquals("NULL", result);
    }
    
    @Test
    public void result3()
    {
    	MoodAnalyzer mood3 = new MoodAnalyzer("");
    	String result = mood3.analyseMood();
    	Assert.assertEquals("EMPTY MOOD", result);
    }
    
	public static void main(String[] args) 
	{
		
	}

}
