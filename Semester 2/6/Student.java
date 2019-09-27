public class Student implements Comparable<Student> {
	private String regNo;
	private String fName;
	private String lName;
	private int projMarks;
	private int ictMarks;
	private int assMarks;
	private int marks;
	private Grade grade;
	
	public Student(String regNo, String fName, String lName, int projMarks,
			int ictMarks, int assMarks) {
		super();
		this.regNo = regNo;
		this.fName = fName;
		this.lName = lName;
		this.projMarks = projMarks;
		this.ictMarks = ictMarks;
		this.assMarks = assMarks;
		this.marks = this.getMarks();
		this.grade = this.getGrade();
	}
	
	
	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}


	public void setfName(String fName) {
		this.fName = fName;
	}


	public void setlName(String lName) {
		this.lName = lName;
	}


	public void setProjMarks(int projMarks) {
		this.projMarks = projMarks;
	}


	public void setIctMarks(int ictMarks) {
		this.ictMarks = ictMarks;
	}


	public void setAssMarks(int assMarks) {
		this.assMarks = assMarks;
	}


	public String getRegNo() {
		return regNo;
	}

	public String getfName() {
		return fName;
	}

	public String getlName() {
		return lName;
	}

	public int getProjMarks() {
		return projMarks;
	}

	public int getIctMarks() {
		return ictMarks;
	}

	public int getAssMarks() {
		return assMarks;
	}

	public int getMarks() {
		this.marks = (int) Math.round((this.projMarks * .3 + this.ictMarks
				* .35 + this.assMarks * .35));
		return marks;
	}

	public Grade getGrade() {
		if (this.projMarks >= 40 && this.assMarks >= 40 && this.ictMarks >= 40
				&& this.marks >= 50) {
			if (this.marks >= 80){
				this.grade = Grade.HD;
			} else if (this.marks >= 70){
				this.grade = Grade.D;
			} else if (this.marks >= 60){
				this.grade = Grade.C;
			} else {
				this.grade = Grade.P;
			}

		} else if (this.marks >= 50){
			this.grade = Grade.F_Resit;
		} else {
			this.grade = Grade.F_Retake;
		}
		return grade;
	}


	@Override
	public int compareTo(Student o) {
		return this.marks - o.marks;
	}

}
