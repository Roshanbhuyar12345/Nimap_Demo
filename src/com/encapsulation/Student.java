package com.encapsulation;

 public class Student {
	 
	     private int age ;
	      
	     public int getAge() {
	    	 if (age> 0) {
		    	 
		            age = age;
		            
		         } else {
		        	 age=0;
		            // System.out.println("please enter valid number");
		           }
			return age;
		}



		public void setAge(int age) {
			this.age = age;
		}



		public static void main(String[] args) {
			
	    	 Student stud=new Student();
	    	 
	    	 stud.setAge(-2);
	    	 
	    	 System.out.println(stud.getAge());
	    	 
		}
	     
	  }


