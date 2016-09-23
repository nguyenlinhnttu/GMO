package FactoryMethodPattern;

class GiaoVienDTH extends GiaoVien {
	@Override
	public LOPHOC getLOPHOC(){
		return new LOPDTH();
	}
}
