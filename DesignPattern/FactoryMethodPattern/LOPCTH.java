package FactoryMethodPattern;

class LOPCTH extends LOPHOC {
	@Override
	public void getName(){
		System.out.println("Lớp CTH");
	}
	@Override
	public  LOPCTH tbNghiHoc(){
		System.out.println("Được Nghỉ");
		return new LOPCTH();
	}
}
