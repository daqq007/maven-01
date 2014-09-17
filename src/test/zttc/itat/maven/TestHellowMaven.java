package zttc.itat.maven;
import org.junit.*;
import static org.junit.Assert.*;
public class TestHelloMaven
{
	@Test
	public void testSayHellow(){
	  HelloMaven hm = new HelloMaven();
	  String str = hm.sayHello("maven");
	  asserEquals(str,"hello:maven1");

	}
}