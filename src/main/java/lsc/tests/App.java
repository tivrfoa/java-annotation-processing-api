package lsc.tests;


public class App 
{
	private String msg;
	
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
    
    public String sayHello() {
		return "Hello world!";
	}
	
	public String getMsg() { return msg; }
	
	@BuilderProperty
    public void setMsg(String msg) {
		this.msg = msg;
	}
}
