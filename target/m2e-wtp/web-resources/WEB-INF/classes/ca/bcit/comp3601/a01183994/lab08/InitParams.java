package ca.bcit.comp3601.a01183994.lab08;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.ServletContext;

public class InitParams {
	private static InitParams instance;
	private String instruction;
	private String greeting;

	public InitParams() {
		// No-argument constructor for JSP bean
	}

	public static synchronized InitParams getInstance(ServletContext context) {
		if (instance == null) {
			instance = new InitParams();
			instance.init(context);
		}
		return instance;
	}

	public void init(ServletContext context) {
		this.instruction = context.getInitParameter("instruction");
		this.greeting = context.getInitParameter("greeting");
	}

	// Getters and setters
	public String getInstruction() {
		return instruction;
	}

	public void setInstruction(String instruction) {
		this.instruction = instruction;
	}

	public String getGreeting() {
		return greeting;
	}

	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}

	public String capitalizeFirstLetter(final String name) {
		if (name == null || name.isEmpty()) {
			return name; // Return as is if null or empty
		}
		return Character.toUpperCase(name.charAt(0)) + name.substring(1).toLowerCase();
	}

	public String getCurrentDateTime() {
		SimpleDateFormat sdf = new SimpleDateFormat("EEE MMM dd HH:mm:ss yyyy z");
		return sdf.format(new Date());
	}

	public boolean isValidName(String name) {
		return name != null && !name.trim().isEmpty();
	}
}