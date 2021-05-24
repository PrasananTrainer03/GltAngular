
abstract class Training {
	public abstract void name();
	public abstract void email();
}

class Ravali extends Training {

	@Override
	public void name() {
		System.out.println("Name is Ravali...");
	}

	@Override
	public void email() {
		System.out.println("Email ravali@gmail.com");
	}
	
}

class Apparao extends Training {

	@Override
	public void name() {
		System.out.println("Name is Apparao...");
	}

	@Override
	public void email() {
		System.out.println("Email is apparao@gmail.com");
	}
	
}
class Mani extends Training {

	@Override
	public void name() {
		System.out.println("Name is Mani...");
	}

	@Override
	public void email() {
		System.out.println("Email is mani@gmail.com");
	}
	
}
public class P21 {
	public static void main(String[] args) {
//		Training obj1 = new Mani();
//		Training obj2 = new Ravali();
//		Training obj3 = new Apparao();
		
		Training[] arr = new Training[] {
			new Mani(),
			new Ravali(),
			new Apparao()
		};
		
		for (Training training : arr) {
			training.name();
			training.email();
		}
	}
}
