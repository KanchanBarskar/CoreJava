package com.raystec.interview.io;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class MarksheetExtern implements Externalizable {
	public String name;
	public  int physics;
	public int chemistry;
	public int maths;
	public transient int temp=0;
	
	

	public int getTemp() {
		return temp;
	}

	public void setTemp(int temp) {
		this.temp = temp;
	}

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

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		name=(String) in.readObject();
		physics=in.readInt();
		chemistry=in.readInt();
		maths=in.readInt();
		temp=in.readInt();
		
		
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		// TODO Auto-generated method stub
		
		out.writeObject(name);
		out.writeInt(physics);
		out.writeInt(chemistry);
		out.writeInt(chemistry);
		out.writeInt(temp);
		
	}

}
