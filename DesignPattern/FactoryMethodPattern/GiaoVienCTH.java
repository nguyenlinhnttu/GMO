package FactoryMethodPattern;

class GiaoVienCTH extends GiaoVien{
	@Override
	public LOPHOC getLOPHOC(){
		return new LOPCTH();
	}
}
