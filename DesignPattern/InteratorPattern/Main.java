package InteratorPattern;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NameRepository repository= new NameRepository();
		for(Interator interator= repository.getInterator();interator.hasNext();){
			String name= interator.next().toString();
			System.out.println("Name: "+name);
		}
	}

}
