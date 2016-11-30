import driver.Person;

public class PersonDriver {

	public static void main(String[] args) {
		Person abdul = new Person();
		System.out.println(abdul);
		abdul.setName("Abdul");
		abdul.setAge(18);
		System.out.println(abdul.getName());
		System.out.println(abdul.getAge());
		
		Person gigi = new Person("Gigi", 21);
		
		if(abdul.getName().equals(gigi.getName()) && (abdul.getAge() == gigi.getAge())) {
			
			System.out.println("Two peoples name and age are equal.");
			
		} else {
			System.out.println("Two peoples name and age are not equal.");
		}
		
		if(abdul.getAge() <= gigi.getAge()) {
			
			System.out.println("Gigi is older than Abdul");
			System.out.println("Abdul is younger than Gigi");
			
	}
}
}

