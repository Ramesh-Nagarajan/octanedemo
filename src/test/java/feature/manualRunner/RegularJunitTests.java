package feature.manualRunner;
/**
 * Created by alm_alm_auto on 2/17/2016.
 */

import junit.framework.TestCase;
import org.junit.*;


public class RegularJunitTests {

    @Test
    public void thisIsMyPassedTest8() {

    }


    @Test
    public void thisIsMyPassedTest7() {

    }




    @Test
    public void thisIsMyPassedTest6() {

    }


    @Test
    public void thisIsMyPassedTest5() {

    }

    @Test
    public void thisIsMyPassedTest4() {

    }


    @Test
    public void thisIsMyPassedTest3() throws Exception{
        throw new Exception("failing this test on purpose to show a failed te st");

    }


    @Test
    public void thisIsMyPassedTest2() throws Exception{
        throw new Exception("failing this test on purpose to show a failed te st");

    }


    @Test
    public void thisIsMyPassedTest1() throws Exception{
        throw new Exception("failing this test on purpose to show a failed te st");

    }


    @Test
    public void thisIsMyFailedTest() throws Exception {
        throw new Exception("failing this test on purpose to show a failed te st");
    }

}