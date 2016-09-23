package TinhKeThua;


class EmBe extends People {
	private int height;
	private int weight;
	public EmBe() {
		// TODO Auto-generated constructor stub
	}
	public EmBe(String name,int tuoi, String diaChi, int height, int weight) {
		//TODO Auto-generated constructor stub;
		super(name, tuoi, diaChi);
		this.height= height;
		this.weight=weight;
		
	}
	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	
}
