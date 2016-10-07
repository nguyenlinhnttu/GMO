package javalang;

public class StringBufferExample {

	public static void main(String[] args) {
		//New obj
		StringBuffer stringBuffer = new StringBuffer("Nguyễn Văn  ");
		
		// append String
		stringBuffer.append("Linh");
		System.out.println(stringBuffer);
		
		// Insert start position 0
		stringBuffer.insert(0, "Hi ");
		System.out.println(stringBuffer);
		
		// Insert start position 0
		stringBuffer.replace(0, 2, "Hello");
		System.out.println(stringBuffer);
		
		// delete 
		stringBuffer.delete(0,6);
		System.out.println(stringBuffer);
		
		//reverse
		stringBuffer.reverse();
		System.out.println(stringBuffer);
	}
}
