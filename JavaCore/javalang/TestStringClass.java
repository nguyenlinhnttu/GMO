package javalang;

public class TestStringClass {

	public static void main(String[] args) {
		
	    String stringTest ="";

	    //Test String
	    long time = System.currentTimeMillis();
	    for (int i = 0 ; i < 20000; i++){
	    	stringTest+="Add new String";
	    }
	    System.out.println("strings:" + (System.currentTimeMillis() - time));

	    //Test  StringBuffer
	    time = System.currentTimeMillis();
	    StringBuffer buf = new StringBuffer();
	    for (int i = 0 ; i < 20000; i++){
	        buf.append("Add String");
	    }
	    System.out.println("Buffers : "+(System.currentTimeMillis() - time));

	    //Test StringBuilder
	    time = System.currentTimeMillis();
	    StringBuilder building = new StringBuilder();
	    for (int i = 0 ; i < 20000; i++){
	        building.append("Add String");
	    }
	    System.out.println("Builder : "+(System.currentTimeMillis() - time));
	}
}
