package hooks;

import io.cucumber.java.After;
import base.TestSetUp;
 
public class ApplicationHooks {
 
 public TestSetUp setUp;
 
    public ApplicationHooks(TestSetUp setUp) {
        this.setUp = setUp;
    }
 
    @After
    public void tearDown( ){
        setUp.driver.quit();
    }
}