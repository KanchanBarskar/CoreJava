package com.raystec.interview.io;

import java.io.Serializable;

public class Marksheet implements Serializable {
private String name;
private int physics;
private int chemistry;
private int maths;
private transient int total=0;
private transient double percentage=0;

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getPhysics() {
	return physics;
}
public void setPhysics(int physics) {
	this.physics = physics;
}
public int getChemistry() {
	return chemistry;
}
public void setChemistry(int chemistry) {
	this.chemistry = chemistry;
}
public int getMaths() {
	return maths;
}

public void setMaths(int maths) {
	this.maths = maths;
}
public int getTotal(){
	total=physics+chemistry+maths;
	return total;
	
}

public double getPercentage(){
	total=physics+chemistry+maths;
	percentage=total/3;
	return percentage;
	
	
	
}

}
