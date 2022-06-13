package com.accessmodifier1;

public class A {
	
    public int a;
    int b;
    protected int c;
    private int d;
    
   public void show() {
	   System.out.println("public modifier");
   }
 
   void show(int a) {
	   System.out.println("default modifier");
   }
   protected void show(String s) {
	   System.out.println("protected modifier");
   }
   private void show(byte b) {
	   System.out.println("in private modifier");
   }
}
