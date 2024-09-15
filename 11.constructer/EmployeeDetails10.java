//two employees(i.e., two objects) blueprint is created for IBM developer---->>>  //note :
class  EmployeeDetails10														  //employee details
{																				  //empname : string
	public String empName;														  //empsal : double
	public String empEmail;														  //empcompany : string
	public double empSal;														  //empjobrole : string
	public String empcompany = "IBM";											  //empemail : string
	public String empJobRole = "DEVELOPER";										  //find annual salary(): double(i.e.,return type)
																				  //print emp details() : void(method type)
	public EmployeeDetails10(String empName,String empEmail,double empSal)						  //main(string[] args) : void
	{
	  this.empName = empName;
	  this.empEmail = empEmail;
	  this.empSal = empSal;
	}
	
	public void findAnnualSalary()
	{

	  return this.empSal*12;  /*  or double annualsal = this.empsal*12 
							return annualsal*/
	}			
	
	public void printEmpDetails()
	{
	  System.out.println("my name is "+this.empName);
	  System.out.println("iam "+empJobRole+" in "+empcompany);
	  System.out.println("my email id "+this.empEmail);
	  System.out.println("my  montly sal is "+this.empSal);
	  System.out.println("my annual sal is "+findAnnualSalary());
	  System.out.println();
	}

	public static void main(String[] args) 
	{
		EmployeeDetails10 e1 = new EmployeeDetails10("varma","bandariverma25@gmail.com",20000.11);
		EmployeeDetails10 e2 = new EmployeeDetails10("dinesh","dineshnallala25@gmail.com",209800.11);
		e1.printEmpDetails();
		e2.printEmpDetails();
	}
}//above program is according to imp lessons...but this is actual way
