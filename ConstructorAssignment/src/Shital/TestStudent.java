package Shital;



	class Student {
		  
		String Name;
		
	   int age;
	   
	   String major;
	   
	   double gpa;
	   
	   boolean isFullTime;
	   

	   //default constructor
	   public Student()
	   {
	   	 Name = "Unknown";
	   		
	   	 age = 18;
	   	
	   	 major = "";
	   	
	   	 gpa = 0.0;
	   			
	   	 isFullTime = true;
	   	
	   	
	   }
	   
	      
	   // parameterized constructors
	   
	   public Student(String name, int age, String major, double gpa, boolean isFullTime)
	   
	   {
	   	
	   	this.Name =name;
	   	this.age = age;
	   	this.major = major;
	   	this.gpa = gpa;
	   	this.isFullTime = isFullTime;
	   	
	   }
	   	

	   
	   
	      public String getName() {
			return Name;
		}


		public void setName(String name) {
			Name = name;
		}


		public int getAge() {
			return age;
		}


		public void setAge(int age) {
			this.age = age;
		}


		public String getMajor() {
			return major;
		}


		public void setMajor(String major) {
			this.major = major;
		}


		public double getGpa() {
			return gpa;
		}


		public void setGpa(double gpa) {
			this.gpa = gpa;
		}


		public boolean isFullTime() {
			return isFullTime;
		}


		public void setFullTime(boolean isFullTime) {
			this.isFullTime = isFullTime;
		}


		public void display()
	      {
	   	    System.out.println("name="+Name);

	   	    System.out.println("age=" + age);

	   	    System.out.println("major=" + major);

	   	    System.out.println("gpa=" + gpa);

	   	    System.out.println("isFullTime=" + isFullTime);
	      }
	   
	
	}
	public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("student1 details");
		Student s1  = new Student();	
		s1.display();
		System.out.println();
		
		System.out.println("student2 details");
		Student s2 =new Student("shubham",25, null, 0.0, true);	
		s2.display();
		System.out.println();
		
		System.out.println("student3 details");
		Student s3 =new Student("shital",27, "software devloper", 0.0, true);
		s3.display();
		System.out.println();
		
		System.out.println("student4 details");
		Student s4 =new Student("shubham",25, "computer enginnering", 9.8, false);	
		s4.display();
		
	}

}






   
	