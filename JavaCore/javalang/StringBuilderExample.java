package javalang;

public class StringBuilderExample {

	public static void main(String[] args) {
	    //New obj
		StringBuilder builder= new StringBuilder("Nguyễn Văn  ");
		
		// append String
		builder.append("Linh");
		System.out.println(builder);
				
		// Insert start position 0
		builder.insert(0, "Hi ");
		System.out.println(builder);
		
		// Insert start position 
		builder.replace(0, 2, "Hello");
		System.out.println(builder);
				
		// delete
		builder.delete(0,6);
		System.out.println(builder);
				
		//reverse
		builder.reverse();
		System.out.println(builder);
	}
}
