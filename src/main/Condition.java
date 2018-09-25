package main;

public class Condition {

	private final static Condition instance=new Condition();
	
	public static final String APP_KEY="";
	public static final String MASTER_SECRET="";
	
	public static final String MOBILE="13691782612";
	
	private Condition() {
		
	}
	
	public Condition getInstance() {
		return instance;
	}
}
