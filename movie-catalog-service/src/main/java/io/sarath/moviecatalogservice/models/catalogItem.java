package io.sarath.moviecatalogservice.models;

public class catalogItem {
private String Name;
private String desc;
private int rating;

public catalogItem(String name, String desc, int rating) {
	super();
	Name = name;
	this.desc = desc;
	this.rating = rating;
}

public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public String getDesc() {
	return desc;
}
public void setDesc(String desc) {
	this.desc = desc;
}
public int getRating() {
	return rating;
}
public void setRating(int rating) {
	this.rating = rating;
}

	
}
