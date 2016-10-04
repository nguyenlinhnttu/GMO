package StaticModifier;

class Salary {
	private static int tongLuong;
	protected static int getLuong() {
		return tongLuong;
	}
	public int tangLuong(int tienLuong) {
		return tongLuong += tienLuong;
	}
}

