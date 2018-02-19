package hu.bme.mit.train.sensor;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import hu.bme.mit.train.user.TrainUserImpl;

import static org.mockito.Mockito.*;

public class myTableTest {

	private myTable t;
	
    @Before
    public void before() {
    	t = new myTable();
        // TODO Add initializations
    }

    @Test
    public void ThisIsAnExampleTestStub() {
    	Assert.assertEquals(7, t.add("18:00","4:5",5)); 
    	// TODO Delete this and add test cases based on the issues
    }
}
