import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TestStudent {

	public static void main(String... args) {
		
		char continue1 = '\0';
		List<Student> list = new ArrayList<Student>();
		
		do{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the registration number : ");
			String regNo = sc.nextLine();
			System.out.println("Enter the first name : ");
			String fname = sc.nextLine();
			System.out.println("Enter the last name : ");
			String lname = sc.nextLine();
			int projMarks = getMarks(sc, "Enter the project marks");		
			int ictmarks = getMarks(sc, "Enter the in-class test marks");			
			int assmarks = getMarks(sc, "Enter the assignment marks");
			
			Student obj = new Student(regNo, fname, lname, projMarks, ictmarks, assmarks);
			list.add(obj);
			System.out.println("Do you want to continue enter 0 to stop "
					+ "and anything else to continue");
			continue1 = sc.next().charAt(0);
			
		}while(continue1 != '0');
		
		
		Student[] arr = new Student[list.size()];
		List<Student> sortedList = sort(list.toArray(arr));// list will be converted to array
		
		

	}
	
	private static int getMarks(Scanner sc, String message){
		int marks;
		do{// for input validation
			System.out.println(message);
			
			while(!sc.hasNextInt()){// this is to validate whether the input is 
									// an integer
				System.out.println("Invalid input please enter a "
						+ "number within the range of 0 to 100");
				sc.next();//this is important to clean the last input value
			}
			
			marks = sc.nextInt();
			if (!(marks >= 0 && marks <= 100)){/*check whether marks is 
														 within the range 
														 of 0 to 100 if not display 
														 error message
*/				System.out.println("Invalid Marks!!! it has be within the range of 0 to 100 ");
			}
			
		}while (marks < 0 || marks >100);//to loop until a valid marks is 
												 //entered 
		return marks;
	}
	
	static public List<Student> sort(Student[] arr){
		 int n = arr.length;  
	        Student temp = null;  
	         for(int i=0; i < n; i++){  
	                 for(int j=1; j < (n-i); j++){  
	                          if(arr[j-1].compareTo(arr[j]) > 0){  
	                                 //swap elements  
	                                 temp = arr[j-1];  
	                                 arr[j-1] = arr[j];  
	                                 arr[j] = temp;  
	                         }  
	                          
	                 }  
	         }
	         List<Student> list = Arrays.asList(arr);
	         return list;
	}

}
