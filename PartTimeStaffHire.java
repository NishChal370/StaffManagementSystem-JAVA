 
/**
 * Write a description of class FullTimeStaffHire here.
 *  The PartTimeStaffHire class is a subclass of the StaffHire
 *or extended class to hire Part time staff.
 * @author (Nischal)
 * @version (a version number or a date)
 */
public class PartTimeStaffHire extends StaffHire {
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
    private boolean terminated; // - either true or false (boolean)
     /* initialized in the constructor by being assigned the value of the constructor's
     * parameters.*/
    public PartTimeStaffHire( int vacancy , String designation, String jobType,int salary, int workingHour){
        super(vacancy ,jobType, designation);//-calling from parent class(StaffHire)
        this.salary = salary;
        String workingShift= "";
        this.workingHour= workingHour;
        String fname="";// -first name
        String lName="";// -last name
        String mName="";// -middle name
        String joiningDate="";// -joining date
        String qualification="";// -qualification
        String appointedBy="";// -appointed By
        boolean save= false ; 
        boolean terminated= false;
    }
    // constructing setter for shift
    public void setWorkingShift(String newshift){
        if(save== true){
            System.out.println("Staff is already hired");
        }
        else{
            this.workingShift= newshift;
        }
    }
     // constructing getter method
    //public String getShifts(){
       // return workingShift;
   // }
    public int getWorkingHour(){
        return workingHour;
    }
    public int getsalary(){
        return salary;
    }
    public String getfName(){
        return fName;
    }
    public String getmName(){
        return mName;
    }
    public String getlName(){
        return lName;
    }
    public String getQualification(){
        return qualification;
    }
     public String getjoiningDate(){
        return joiningDate;
    }
    public String getAppointedBy(){
        return appointedBy;
    }
    public String getWorkingShift(){
        return workingShift;
    }
    public boolean getSave(){
        return save;
    }
    public boolean getTerminated(){
        return terminated;
    }
    
    //method to set the working shifts as changes to shifts inevitably occur.
    public void HirePartTimeStaff( String fName,String lName,String mName, String joiningDate,String workingShift, String qualification,
        String appointedBy){
        if(save ==true){
             System.out.println(" this Staff is already hired");
        }
        else{
          this.fName= fName;//-first name
          this.lName=lName;//-last name
          this.mName=mName;//-middle name
          this.joiningDate=joiningDate;// -joining date
          this. qualification= qualification;//-qualification
          this.appointedBy= appointedBy;//-appointed by
          terminated= false;
          save=true;
 
        }
    }
    //method to terminate the staff.
    public void terminated(){
        if (terminated == true){
            System.out.println ("Staff is already terminated");
        }
        else{
            this.fName= "";//-first name
            this.lName= "";//-last name
            this.mName= "";//-middle name
            this.gender="";//-gender
            this.qualification= "";//-qualification
            this.appointedBy= "";//-appointed By
            //salay
            //workinghour;
            this.joiningDate="";//-joining date
            this.qualification="";//-qualification
            this.workingShift="";//-working Shift
            this.appointedBy="";//Appointed By
            terminated=true;//-setting teminination true
            save=false;//setting save(appoint) value
        }
    }
    //display non-static method
    public void display(){
        super.display();// calling display of super class
        if (save==true){ 
            System.out.println("***************Part Time Staff***********");
            System.out.println("staff name " + this.getfName());// -first name
            System.out.println("last name " +this. getlName());// -last name
            System.out.println("middle name " +this.getmName());// -middle name
            System.out.println("working hour "+this.getWorkingHour());
            System.out.println("wages per hour: " +this.getsalary());
            System.out.println("qualification "+this.getQualification());
            System.out.println("appointedBy "+this.getAppointedBy());
            System.out.println("Shift "+this.getWorkingShift());
            System.out.println("*****************************************");
        }
        
    }
    
}
