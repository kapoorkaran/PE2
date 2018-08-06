package com.stackroute.pe2;


	class Member
	{
	 protected String name="";
	 protected int age;
	 protected double sal;
	 
	}
	public class MemberVariable extends Member
{
		Member mem=new Member();
	    MemberVariable(String name,int age,double sal)
	    {
	    	mem.name=name;
	    	mem.age=age;
	        mem.sal=sal;
	    }
	    public String var()
	    {
	    	String res=mem.name+" "+mem.age+" "+mem.sal;
	    	return res;
	    }

}
