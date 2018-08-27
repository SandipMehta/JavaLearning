package examples;

//-----------------------------------------------------------------
//                       COMPARABLE EXAMPLE 
//-----------------------------------------------------------------
// Calling Sort function logic is under ArraylistExa.java (arraylistsortComparableExa())

//First implement Comparable interface and then Override the compareTo method.
public class Student implements Comparable <Student> {
    private String studentname;
    private int rollno;
    private int studentage;

    public Student(int rollno, String studentname, int studentage) {
         this.rollno = rollno;
         this.studentname = studentname;
         this.studentage = studentage;
    }

    public String getStudentname() {
         return studentname;
    }
    public void setStudentname(String studentname) {
	this.studentname = studentname;
    }
    public int getRollno() {
	return rollno;
    }
    public void setRollno(int rollno) {
	this.rollno = rollno;
    }
    public int getStudentage() {
	return studentage;
    }
    public void setStudentage(int studentage) {
 	this.studentage = studentage;
    }
    
    //@Override
	public int compareTo(Student student) {
		// TODO Auto-generated method stub
		int compareage=((Student)student).getStudentage();
		return studentage-compareage;
	}	
	 //@Override
	public String toString() {
		return "[ rollno=" + rollno + ", name=" + studentname + ", age=" + studentage + "]";
	}
}

