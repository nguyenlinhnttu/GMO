package TinhKeThua;

class People{
	private String name;
	private int tuoi;
	private String diachi;
	
	public People() {
		// TODO Auto-generated constructor stub
		
	}
	public People(String name,int tuoi,String diaChi){
		this.name=name;
		this.tuoi=tuoi;
		this.diachi=diaChi;
	}
	public void tapDi(int soBuoc){
		System.out.println("Đi được "+ soBuoc +" bước!");
	}
	public String getDiachi() {
		return diachi;
	}

	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public int getTuoi() {
		return tuoi;
	}

	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}

}
