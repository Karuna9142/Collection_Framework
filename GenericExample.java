package com.genreex;

 class GenericExample<T> 
{
  T obj;
  GenericExample(T obj)
  {
	  this.obj = obj;
  }
  
  public T getObject()
  {
	  return this.obj;
  }
}
 class Main {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			GenericExample<Integer> ob = new GenericExample<Integer>(15);
			System.out.println(ob.getObject());
			
			GenericExample<String> ob1 = new GenericExample<String>("welcome");
			System.out.println(ob1.getObject());

		}

}

