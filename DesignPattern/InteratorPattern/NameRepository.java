package InteratorPattern;

class NameRepository implements Contaner {
	public String names[] ={"Linh","Kim","Minh"};
	@Override
	public Interator getInterator() {
		// TODO Auto-generated method stub
		return new Interator() {
			
			int index;
			@Override
			public boolean hasNext() {
				// TODO Auto-generated method stub
				if(index<names.length){
					return true;
				}
				return false;
			}
			@Override
			public Object next() {
				// TODO Auto-generated method stub
				if(this.hasNext()){  // trả về true
					return names[index++];
				}
				return null;
			}
			
		};
	}

}
