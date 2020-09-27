package lsc.tests;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AppTest 
{
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    
	@Test
	public void greeterSaysHello() {
		assertThat(new App().sayHello(), containsString("Hello"));
	}
}
