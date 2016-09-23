package TinhBaoDong;

class People{
	private String name;
	private String tuoi;
	private String diachi;
	
	public People() {
		// TODO Auto-generated constructor stub
	}
	public People(String name,String tuoi,String diachi){
		this.name=name;
		this.tuoi=tuoi;
		this.diachi=diachi;
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

	public String getTuoi() {
		return tuoi;
	}

	public void setTuoi(String tuoi) {
		this.tuoi = tuoi;
	}
	
	
}
