public class Test {

	public static void main(String[] args) {
		Student ihan = new Student("R001", "Ihan", "Lelwala", 45, 65, 65);
		Student thamindu = new Student("R002", "Thamindu", "Wickramasinge", 55, 65, 65);
		
		System.out.println(ihan.compareTo(thamindu));
		System.out.println("Ihan "+ihan.getMarks());
		System.out.println("Thamindu "+thamindu.getMarks());

	}

}
