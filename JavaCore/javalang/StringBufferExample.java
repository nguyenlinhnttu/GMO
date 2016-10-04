package javalang;

public class StringBufferExample {

	public static void main(String[] args) {
		//Tạo một đối tượng Stringbuffer
		StringBuffer stringBuffer= new StringBuffer("Nguyễn Văn  ");
		
		// Nối chuỗi sử dụng append
		stringBuffer.append("Linh");
		System.out.println(stringBuffer);
		
		// Insert tại vị trí chỉ định
		stringBuffer.insert(0, "Hi ");
		System.out.println(stringBuffer);
		
		// thay thế chuỗi tại vị trí chỉ định
		stringBuffer.replace(0, 2, "Hello");
		System.out.println(stringBuffer);
		
		// Xóa chuỗi tại vị trí chỉ định
		stringBuffer.delete(0,6);
		System.out.println(stringBuffer);
		
		//Đảo chuỗi
		stringBuffer.reverse();
		System.out.println(stringBuffer);
	}
}
