
public class PersonRunner {
	public static void main(String[] args) {
		Person james = new Person();
		james.setName("James");
		james.setPower("fire");
		System.out.println(james.toString());
		Person josh = new Person();
		josh.setName("Josh");
		josh.setPower("water");
		System.out.println(josh.toString());
		Person jimmy = new Person();
		jimmy.setName("Jimmy");
		jimmy.setPower("ice");
		System.out.println(jimmy.toString());
	}
}
