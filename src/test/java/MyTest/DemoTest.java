package MyTest;
import org.testng.Assert;
import org.testng.annotations.Test;
/*
    We define analyzer at class level and at run time
 * 1.   AT class level: Create class RetryAnalyzer Implement with ITryAnalyzer with
 * we define at class level use pakagename.classname.class
 * 2.   At Run time: create class MyTranfomer implements with IAnnotationtransformer
 * when we define at run time, we add an listener in testng.xml file
 * */
public class DemoTest {
    @Test(retryAnalyzer=Analyzer.RetryAnalyzer.class)
    public void demo1Test(){
        Assert.assertEquals(false,true);
    }
    @Test
    public void demo2Test(){
        Assert.assertEquals(true, true);
    }
}