package hu.bme.mit.train.sensor;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import hu.bme.mit.train.interfaces.*;

import static org.mockito.Mockito.*;

public class TrainSensorTest {

	private TrainController tc;
	private TrainUser tu;
	private TrainSensorImpl tsi;
	
    @Before
    public void before() {
    	tu = mock(TrainUser.class);
    	tc = mock(TrainController.class);
    	tu.setCont(tc);
    	tsi = new TrainSensorImpl(tc, tu);
        // TODO Add initializations
    }
/*
    @Test
    public void ThisIsAnExampleTestStub() {
    	Assert.assertEquals(99, tui.doNot(0)); 
    	// TODO Delete this and add test cases based on the issues
    } ezzel most senki ne foglalkozzon
*/
    @Test
    public void testIfSPLimitLessNull(){
    	//when(tu.setAlarmState(true)).thenReturn(1);
    	tsi.overrideSpeedLimit(-1);
    	verify(tu, times(1)).setAlarmState(true);
    	
    }
    
    @Test
    public void testIfSPLimitMoreFiveH(){
    	tsi.overrideSpeedLimit(666);
    	verify(tu, times(1)).setAlarmState(true);
    }
    
    @Test
    public void testIfSPLimitThreeH(){
    	tsi.overrideSpeedLimit(300);
    	verify(tu, times(0)).setAlarmState(true);
    }
    
    @Test
    public void testIfSPLimitNull(){
    	tsi.overrideSpeedLimit(0);
    	verify(tu, times(0)).setAlarmState(true);
    }
}
