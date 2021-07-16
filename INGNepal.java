/**
 * Write a description of class INGNepal here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class INGNepal
{
   public static ArrayList<StaffHire>staffObj=new ArrayList<StaffHire>();
   public static int indexNumb=0;
    public static void main(String[] args) {
       new StaffGui();
       
    }
    
    public static void addStaff(StaffHire Obj){
        staffObj.add(Obj);
    }
    public static StaffHire getStaff(int index){
        return staffObj.get(index);
    }
    public static void getIndexNumb(int i){
        INGNepal.indexNumb=i;
    } 
    
}
