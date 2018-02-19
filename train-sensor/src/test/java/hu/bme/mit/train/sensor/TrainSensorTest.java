package hu.bme.mit.train.sensor;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import hu.bme.mit.train.user.TrainUserImpl;

import static org.mockito.Mockito.*;

public class TrainSensorTest {

	private TrainUserImpl tui;
	
    @Before
    public void before() {
    	tui = new TrainUserImpl(null);
        // TODO Add initializations
    }

    @Test
    public void ThisIsAnExampleTestStub() {
    	Assert.assertEquals(99, tui.doNot(0)); 
    	// TODO Delete this and add test cases based on the issues
    }
}
