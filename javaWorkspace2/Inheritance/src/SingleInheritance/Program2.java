package SingleInheritance;
//****SingleInheritance Program*******
	class College
	{
		void sir()
		{
			int totalStaff=350;
			double salary=35000;
			String branchName="Civil";
			String sb=branchName.concat("Engineering");
			
			System.out.println("Total Number of Staff in College: "+totalStaff);
			System.out.println("Staff salary in College: "+salary);
			System.out.println("College Different Branches: "+sb);
		}
		void students()
		{
			int numberOfStudents=560;
			System.out.println("Number of Students in College:"+numberOfStudents);
		}
	}
	class School extends College
	{
		void sir1()
		{
			int totalStaff=230;
			double salary=25000;
			String className="Marathi";
			String className1=className.concat("Medium");
			
			System.out.println("Total Number of Staff in College: "+totalStaff);
			System.out.println("Staff salary in College: "+salary);
			System.out.println("College Different Branches: "+className1);
		}
		void students1()
		{
			int numberOfStudents=460;
			System.out.println("Number of Students in College:"+numberOfStudents);
		}
	}

public class Program2 
{
	public static void main(String[] args) 
	{
		// create Object of child class member
		School object=new School();
		//StringBuffering and create stringBuffering Object
		StringBuffer sb=new StringBuffer("Civil");
		sb.append("Engineering");
		System.out.println(sb);
		object.sir();
		object.students();
		object.sir1();
		object.students1();
		
	}
	
}