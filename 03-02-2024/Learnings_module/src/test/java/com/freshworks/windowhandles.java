package com.freshworks;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class windowhandles {
	WebDriver driver = null;
	// Get all tab handles
	Set<String> tabHandles = driver.getWindowHandles();
	List<String> tabs = new ArrayList<>(tabHandles);
	
	for (String window : driver.getWindowHandles()) {
	    System.out.println(window);
	}
	// Switch to the new tab (last one)
	driver.switchTo().window(tabs.get(1));
	// Switch to the new tab (latest tab/window)
	driver.switchTo().window(windows.get(windows.size() - 1));

//	 Based on the title 
	for (String window1 : driver.getWindowHandles()) {
	    driver.switchTo().window(window);
	    if (driver.getTitle().equals("Expected Title")) {
	        break;
	    }
	}

}
