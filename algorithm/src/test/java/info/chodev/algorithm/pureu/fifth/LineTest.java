package info.chodev.algorithm.pureu.fifth;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import java.util.Arrays;

import org.apache.commons.lang3.time.StopWatch;
import org.junit.Test;


public class LineTest {

	private Line line = new Line();
	
	@Test
	public void testSetLine() {
		StopWatch stopWatch = new StopWatch();
		stopWatch.start();

		testSetLine1();
		testSetLine2();
		testSetLine3();
		testSetLine4();
		testSetLine5();
		
		stopWatch.stop();

		System.out.println( "execute time : " + stopWatch.getNanoTime());
	}
	
	public void testSetLine1() {
		int[] actual = new int[]{4,2,1,3};
		int[] result = line.setLine(new int[]{2,1,1,0});
		
		assertThat(actual, equalTo(result));
		System.out.println(Arrays.toString(result));
	}
	
	public void testSetLine2() {
		int[] actual = new int[]{1,2,3,4};
		int[] result = line.setLine(new int[]{0,0,0,0});
		
		assertThat(actual, equalTo(result));
		System.out.println(Arrays.toString(result));
	}
	
	public void testSetLine3() {
		int[] actual = new int[]{3,1,2,5,4};
		int[] result = line.setLine(new int[]{1,1,0,1,0});
		
		assertThat(actual, equalTo(result));
		System.out.println(Arrays.toString(result));
	}
	
	public void testSetLine4() {
		int[] actual = new int[]{8,7,1,2,5,3,6,4};
		int[] result = line.setLine(new int[]{2,2,3,4,2,2,1,0});
		
		assertThat(actual, equalTo(result));
		System.out.println(Arrays.toString(result));
	}
	
	public void testSetLine5() {
		int[] actual = new int[]{2,6,7,5,3,9,8,1,4};
		int[] result = line.setLine(new int[]{7,0,3,5,2,0,0,1,0});
		
		assertThat(actual, equalTo(result));
		System.out.println(Arrays.toString(result));
	}
}
