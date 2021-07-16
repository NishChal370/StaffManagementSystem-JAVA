
/**
 * Write a description of class FullTimeStaffHire here.
 *  The FullTimeStaffHire class is a subclass of the StaffHire
 *or extended class to hire Full time staff.
 *
 * @author (Nischal Bishwokarma)
 * @version (a version number or a date)
 */
public class FullTimeStaffHire extends StaffHire{
    private String fName;// - a string of characters
    private String mName;// - a string of characters
    private String lName;// - a string of characters
    private int salary;//- a whole number
    private String gender;// - a string of characters
    private int workingHour;//- a whole number
    
    private String joiningDate;// - a string of characters
    private String qualification;// - a string of characters
    private String workingShift;// - a string of characters
    private String appointedBy;// - a string of characters
    private boolean save ;// - either true or false (boolean)
    /* initialized in the constructor by being assigned the value of the constructor's
     * parameters.*/
    public FullTimeStaffHire(int vacancyNumber , String designation, String jobType,int salary, int workingHour){
       super (vacancyNumber,jobType,designation);// -calling from parent class(Staff Hire)
       String fName= "";// -first name
       String mName="";// -middle name
       String lName="";// -last name
       this.salary=salary;// -salary
       String gender="";// -gender
       this.workingHour=workingHour;
       String joiningDate="";
       String qualification="";
       String workingShift="";
       String appointedBy="";
       boolean save=false;
    }
    // constructing setter for salary
    public void setSalary(int newsalary){
        if (save== true){
            System.out.println("it is therefore not possible to change the salary.");
        }
        else{
            this.salary= newsalary;
        }
    }
    // constructing setter 
    public void setfName(String newfName){
        this. fName = newfName;
    }
    public void setmName(String newmName){
        this. mName = newmName;
    }
    public void setlName(String newlName){
        this. lName = newlName;
    }
    public void setgender(String newgender){
        this. gender = newgender;
    }
    public void setworkingHour(int newworkingHour){
        this. workingHour = newworkingHour;
    }
    public void setjoiningDate(String newjoiningDate){
        this. joiningDate =  newjoiningDate;
    }
    public void setqualification(String newqualification){
        this. qualification = newqualification;
    }
    public void setworkingShift(String newworkingShift){
        this. workingShift = newworkingShift;
    }
    public void setappointedBy(String newappointedBy){
        this. appointedBy= newappointedBy;
    }
    
    // constructing getter 
    public String getfName(){
        return fName;
    }
    public String getmName(){
        return mName;
    }
    public String getlName(){
        return lName;
    }
    public int getsalary(){
        return salary;
    }
    public String getgender(){
        return gender;
    }
    public int getworkingHour(){
        return workingHour;
    }
    public String getjoiningDate(){
        return joiningDate;
    }
    public String getworkingShift(){
        return workingShift;
    }
    public String getappointedBy(){
        return appointedBy;
    }
    public String getqualification(){
        return qualification;
    }
    public boolean getsave(){
        return save;
    }
    
    //creating method to check whether the staff has been already hired or not.
    public void appointFullTimeStaff (String fName,String lName,String mName,String joiningDate,String workingShift,  String appointedBy,
    String qualification){
        if(this.save){
            System.out.println("Sorry! Staff has been already hired");
      }
      else{
          this.fName = fName;// -first Name
          this.lName=lName;//- Last Name
          this.mName=mName;// -middle Name
          this.joiningDate=joiningDate;
          this.workingShift=workingShift;
          this.qualification = qualification;
          this.appointedBy = appointedBy;
          this.save = true;
        }
        
    }
    
    //Using display method to print information of FullTimeStaffHire.
    public void display(){
      super.display();// -calling display method from parent class(Staff hire)
      if (this.save){
          System.out.println("First Name :" + this.getfName());// -first Name
          System.out.println("middle Name: "+this.getmName());// -middle Name
          System.out.println("Last Name: "+this.getlName());// -Last Name
          System.out.println("Joining Date: "+this.getjoiningDate());
          System.out.println("qualification :" + this.getqualification());
          System.out.println("appointedBy :" + this.getappointedBy());
          System.out.println("workingHour :" + this.getworkingHour());
          System.out.println("salary :" + this.getsalary());
        }
    }
    
}
