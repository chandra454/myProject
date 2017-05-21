package SonicWall.Pages;

import java.util.ArrayList;
import java.util.List;

public class myHomepageElements {
public List<String> mylist = new ArrayList<String>();
public List HomeElements(){
	mylist.add(".//*[@id='menu-item-337']/a");
	mylist.add(".//*[@id='menu-item-682']/a");
	mylist.add(".//*[@id='menu-item-1537']/a");
	mylist.add(".//*[@id='menu-item-697']/a");
	mylist.add(".//*[@id='menu-item-823']/a");
	mylist.add(".//*[@id='menu-item-359']/a");
	mylist.add(".//*[@id='menu-item-366']/a");
	
	mylist.add(".//*[@id='menu-item-2056']/a");
	//mylist.add(".//*[@id='menu-item-2945']/a");
	
	

	return mylist;
}

	
	
}
