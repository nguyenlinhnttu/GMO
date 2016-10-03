package javalang;

public class TestStringClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String stringTest ="";
		//String
	    long time = System.currentTimeMillis();
	    for (int i = 0 ; i < 10000; i++){
	    	stringTest+="Add String";
	    }
	    System.out.println("strings:" + (System.currentTimeMillis() - time));
	    //StringBuffer
	    time = System.currentTimeMillis();
	    StringBuffer buf = new StringBuffer();
	    for (int i = 0 ; i < 10000; i++){
	        buf.append("Add String");
	    }
	    System.out.println("Buffers : "+(System.currentTimeMillis() - time));
	    //StringBuilder
	    time = System.currentTimeMillis();
	    StringBuilder building = new StringBuilder();
	    for (int i = 0 ; i < 10000; i++){
	        building.append("Add String");
	    }
	    System.out.println("Builder : "+(System.currentTimeMillis() - time));
	}

}
