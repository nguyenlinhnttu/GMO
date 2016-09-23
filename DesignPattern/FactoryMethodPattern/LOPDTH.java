package FactoryMethodPattern;

class LOPDTH extends LOPHOC{
	@Override
	public void getName(){
		System.out.println("Lớp DTH");
	}
	@Override
	public  LOPDTH tbNghiHoc(){
		System.out.println("Được Nghỉ");
		return new LOPDTH();
	}
}
