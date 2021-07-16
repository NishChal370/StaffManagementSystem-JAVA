
/**
 * Write a description of class StaffHire here.
 *Staff Hire is the parent class for FullTimeStaffHire and PartTimeStaffHire
 * @author (Nischal Bishwokarma)
 * @version (a version number or a date)
 */
public class StaffHire
{
    private int  vacancyNumber;
    private String jobType;
    private String designation;
    /* initialized in the constructor by being assigned the value of the constructor's
     * parameters.*/
    public StaffHire(int vacancyNumber,String jobType,  String designation){
       this.vacancyNumber= vacancyNumber;
       this.jobType= jobType;
       this.designation=designation;
    }
    
    //setting method
    public void setvacancyNumber(int newvacancyNumber){
        this.vacancyNumber = newvacancyNumber;
    }
    public  void setjobType(String newjobType){
        this.jobType = newjobType;
    }
    public void setdesignation(String newdesignation){
        this. designation= newdesignation;
    }
   
    // getter method
    public int getvacancyNumber(){
        return vacancyNumber;
    }
    public String getjobType(){
        return jobType;
    }
    
    public String getdesignation(){
        return designation;
    }
    
    // display
    public void display(){
        System.out.println("*******************************");
        System.out.println("vacancy Number: "+ vacancyNumber);
        System.out.println("job Type: "+ jobType);
        System.out.println("designation: "+ designation);
        System.out.println("********************************");
    }
}
