package javalang;

public class StringBuilderExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder builder= new StringBuilder("Nguyễn Văn  ");
		// Nối chuỗi sử dụng append
				builder.append("Linh");
				System.out.println(builder);
				// Insert tại vị trí chỉ định
				builder.insert(0, "Hi ");
				System.out.println(builder);
				// thay thế chuỗi tại vị trí chỉ định
				builder.replace(0, 2, "Hello");
				System.out.println(builder);
				// Xóa chuỗi tại vị trí chỉ định
				builder.delete(0,6);
				System.out.println(builder);
				//Đảo chuỗi
				builder.reverse();
				System.out.println(builder);
	}

}
