import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class test1 {
	private  Demo demo;
	@Test
	public void testpanduan() {
		demo= new Demo();
		assertEquals(1, demo.panduan(54));
		
		}

	
}
