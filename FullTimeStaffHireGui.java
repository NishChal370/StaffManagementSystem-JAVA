/**
 * Write a description of class FullTimeStaffHire here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class FullTimeStaffHireGui implements ActionListener{
    private JFrame frame2;// -main frame
    private JLabel title;// -title
    private JLabel vacancy;// -Vacancy number
    public JTextField txtVacancy;// -text area for vacancy number
    private JLabel joiningDate;// -Joining Date
    public JTextField txtJoiningDate;// -txt area for  joining date
    private JLabel fName;// -first name
    public JTextField txtfName;// -text area for first name
    private JLabel mName;// -middle name
    public JTextField txtMName;//text area for middle name
    private JLabel lName;//last name
    public JTextField txtLName;//text area for last name
    private JLabel salary;//Salary
    public JTextField txtSalary;//text area for salary
    private JLabel gender;//gender Radio button
    public JRadioButton male;//Radio button option
    public JRadioButton female;//radio button option
    private ButtonGroup gen;//component to store radio button
    private JLabel designation;//Desigantion
    public JTextField txtDesignation;// text area for Designation
    private JLabel workingHour;// working hour
    public JTextField txtWorkingHour;//text area for workng hour
    private JLabel jobType;//job type
    public JComboBox txtJobType;//option for job type
    private JLabel qualification;//Qualification
    public JTextField txtQualification;//text area for qualification
    private JLabel appointedBy;// Appointed by
    public JTextField txtAppointedBy;//text area for Appointed by
    private JLabel workingShift;// Workin Shift
    public JTextField txtWorkingShift;//text area for Working Shift
    private JButton neew;//button for storinig new staff
    private JButton save;//button for saving data in array list
    
    private JLabel vacancy1;//Vacancy number
    private JTextField txtVacancy1;//vacancy number text field
    private JButton addVacancy;//vacancy number button
    private JButton display;//display button
    
    int vac;//vacancy
    String joiningD;//joining date
    String fN;//first name
    String lN;//last name
    String mN;//middle name
    int sal;//salary
    String gend;//gender
    int workingH;//working hour
    String jobT;//job type
    String desig;//designation
    String qualifi;//qualification
    String workingS;//working shift
    String appointedB;//appointed by
    int currentIndex=0;
    public FullTimeStaffHireGui(){
        
        //Outline
        frame2=new JFrame("FullTimeStaffHire");
        //title
        title=new JLabel("Full Time Staff");
        title.setBounds(250,0,200,30);
        title.setFont(new Font("serif",Font.BOLD,30));
        frame2.add(title);
        
        //Vacancy number
        vacancy1 =new JLabel("Vacancy Number:");
        vacancy1.setBounds(15,50,150,30);
        vacancy1.setFont(new Font("serif",Font.PLAIN,18));
        frame2.add(vacancy1);
        //vacancy number text area
        txtVacancy1=new JTextField();
        txtVacancy1.setBounds(175,50,90,30);
        txtVacancy1.setFont(new Font("serif",Font.PLAIN,18));
        frame2.add(txtVacancy1);
        
        
        //job type
        jobType=new JLabel("Job Type:");
        jobType.setBounds(490,50,100,30);
        jobType.setFont(new Font("serif",Font.PLAIN,18));
        frame2.add(jobType);
        //combo box  for full time and part time option
        String[] jobTypeOption={"----Select----","    Full Time","    Part Time"};
        txtJobType=new JComboBox(jobTypeOption);
        txtJobType.setBounds(580,50,120,30);
        txtJobType.setFont(new Font("serif",Font.PLAIN,16));
        frame2.add(txtJobType);
                        
        //designation
        designation=new JLabel("Designation:");
        designation.setBounds(15,90,100,30);
        designation.setFont(new Font("serif",Font.PLAIN,18));
        frame2.add(designation);
        //designation text area
        txtDesignation=new JTextField();
        txtDesignation.setBounds(120,90,150,30);
        txtDesignation.setFont(new Font("serif",Font.PLAIN,18));
        frame2.add(txtDesignation);
        
         
        //working hour
        workingHour=new JLabel("Working Hour:");
        workingHour.setBounds(460,90,150,30);
        workingHour.setFont(new Font("serif",Font.PLAIN,18));
        frame2.add(workingHour);
        //working Hour text area
        txtWorkingHour=new JTextField();
        txtWorkingHour.setBounds(580,90,120,30);
        txtWorkingHour.setFont(new Font("serif",Font.PLAIN,18));
        frame2.add(txtWorkingHour);
        
        
        //Salary
        salary=new JLabel("Salary:");
        salary.setBounds(15,130,100,30);
        salary.setFont(new Font("serif",Font.PLAIN,18));
        frame2.add(salary);
        //salary text area
        txtSalary=new JTextField();
        txtSalary.setBounds(120,130,150,30);
        txtSalary.setFont(new Font("serif",Font.PLAIN,18));
        frame2.add(txtSalary);
        
        //addvacancy button
        addVacancy=new JButton("Add Vacancy");
        addVacancy.setBounds(480,130,200,30);
        addVacancy.setFont(new Font("serif",Font.PLAIN,18));
        addVacancy.addActionListener(this);
        frame2.add(addVacancy);
        
        //vacancy
        vacancy =new JLabel("Vacancy Number:");
        vacancy.setBounds(15,200,150,30);
        vacancy.setFont(new Font("serif",Font.PLAIN,18));
        frame2.add(vacancy);
        //vacancy number text area
        txtVacancy=new JTextField();
        txtVacancy.setBounds(150,200,90,30);
        txtVacancy.setFont(new Font("serif",Font.PLAIN,18));
        frame2.add(txtVacancy);
     
        //joining date
        joiningDate=new JLabel("Joining Date:");
        joiningDate.setBounds(480,200,100,30);
        joiningDate.setFont(new Font("serif",Font.PLAIN,18));
        frame2.add(joiningDate);
        //text area joining date
        txtJoiningDate=new JTextField("day/month/year");
        txtJoiningDate.setBounds(580,200,120,30);
        txtJoiningDate.setFont(new Font("serif",Font.PLAIN,18));
        frame2.add(txtJoiningDate);
        
        //first name
        fName= new JLabel("First Name:");
        fName.setBounds(15,240,100,30);
        fName.setFont(new Font("serif",Font.PLAIN,18));
        frame2.add(fName);
        //first name text area
        txtfName=new JTextField();
        txtfName.setBounds(110,240,130,30);
        txtfName.setFont(new Font("serif",Font.PLAIN,18));
        frame2.add(txtfName);
        
        //middle name
        mName=new JLabel("Middle Name:");
        mName.setBounds(250,240,140,30);
        mName.setFont(new Font("serif",Font.PLAIN,18));
        frame2.add(mName);
        //middle name text area
        txtMName=new JTextField();
        txtMName.setBounds(360,240,110,30);
        txtMName.setFont(new Font("serif",Font.PLAIN,18));
        frame2.add(txtMName);
        
        //Last name
        lName=new JLabel("Last Name:");
        lName.setBounds(480,240,100,30);
        lName.setFont(new Font("serif",Font.PLAIN,18));
        frame2.add(lName);
        //text area Last name
        txtLName=new JTextField();
        txtLName.setBounds(580,240,120,30);
        txtLName.setFont(new Font("serif",Font.PLAIN,18));
        frame2.add(txtLName);
        
        
       
        //Qualification
        qualification=new JLabel("Qualification:");
        qualification.setBounds(15,280,100,30);
        qualification.setFont(new Font("serif",Font.PLAIN,18));
        frame2.add(qualification);
        //qualification text area
        txtQualification=new JTextField();
        txtQualification.setBounds(120,280,120,30);
        txtQualification.setFont(new Font("serif",Font.PLAIN,18));
        frame2.add(txtQualification);
        
        //radio button gender
        gender=new JLabel("Gender:");
        gender.setBounds(250,280,100,30);
        gender.setFont(new Font("serif",Font.PLAIN,18));
        frame2.add(gender);
        //radio button option
        //male
        male=new JRadioButton("Male");
        frame2.add(male);
        male.setBounds(310,280,65,30);
        male.setFont(new Font("serif",Font.PLAIN,18));
        //female
        female=new JRadioButton("Female");
        frame2.add(female);
        female.setBounds(375,280,80,30);
        female.setFont(new Font("serif",Font.PLAIN,18));
        // putting the radio button in buttonGroup....If male will selected female will not be selected
        ButtonGroup gen=new ButtonGroup();
        gen.add(male);
        gen.add(female);
       
        
        //working shhift
        workingShift=new JLabel("Working Shift:");
        workingShift.setBounds(460,280,150,30);
        workingShift.setFont(new Font("serif",Font.PLAIN,18));
        frame2.add(workingShift);
        //working shift text area
        txtWorkingShift=new JTextField();
        txtWorkingShift.setBounds(580,280,120,30);
        txtWorkingShift.setFont(new Font("serif",Font.PLAIN,18));
        frame2.add(txtWorkingShift);
        
        //appointed by
        appointedBy=new JLabel("Appointed By:");
        appointedBy.setBounds(380,320,150,30);
        appointedBy.setFont(new Font("serif",Font.PLAIN,18));
        frame2.add(appointedBy);
        //text areea appointed by
        txtAppointedBy=new JTextField();
        txtAppointedBy.setBounds(500,320,200,30);
        txtAppointedBy.setFont(new Font("serif",Font.PLAIN,18));
        frame2.add(txtAppointedBy);
        
        //button display
        display=new JButton("Display");
        display.setBounds(15,370,160,30);
        display.setFont(new Font("serif",Font.PLAIN,18));
        display.addActionListener(this);
        frame2.add(display);
        
        //button new
        neew=new JButton("New");
        neew.setBounds(250,370,160,30);
        neew.setFont(new Font("serif",Font.PLAIN,18));
        neew.addActionListener(this);
        frame2.add(neew);
        
        //button save
        save=new JButton("Appoined");
        save.setBounds(500,370,160,30);
        save.setFont(new Font("serif",Font.PLAIN,18));
        save.addActionListener(this);
        frame2.add(save);
        
       
        frame2.setLayout(null);
        frame2.setSize(730,460);
        frame2.setResizable(false);
        frame2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame2.setVisible(true);
    }
    public static void FullStaff(){
        FullTimeStaffHireGui frame2Obj=new FullTimeStaffHireGui();
    }
  
    @Override
    public void actionPerformed(ActionEvent Obj){
       
        
        
        if(Obj.getSource()==save){
           
            if (!male.isSelected() && !female.isSelected()) {
                JOptionPane.showMessageDialog(frame2, "Gender must be selected", "Input Error", JOptionPane.ERROR_MESSAGE);
            }
            else{
                //middle name
                mN=txtMName.getText();
               try{
                //vacacncy number
                vac=Integer.parseInt(txtVacancy.getText());
                //joining date
                joiningD=txtJoiningDate.getText();
                //first name
                fN=txtfName.getText();
                //last name
                lN=txtLName.getText();
                
                //gender
                gend="";
                if(male.isSelected()){
                    gend="Male";
                }
                else if(female.isSelected()){
                    gend="Female";
                }
                //working Hour
                workingH=Integer.parseInt(txtWorkingHour.getText());
                //Qualification
                qualifi=txtQualification.getText();
                //Working Shift
                workingS=txtWorkingShift.getText();
                //Appointed By
                appointedB=txtAppointedBy.getText();
            }catch(Exception ee){
                System.out.println(ee);
            }
           
            //checking vacancy number and storing in array list
            boolean VacCheck=false;
            for(StaffHire obj:INGNepal.staffObj){
                if(obj.getvacancyNumber()==vac){
                    VacCheck=true;
                    
                    if(obj instanceof FullTimeStaffHire){
                        FullTimeStaffHire ob=(FullTimeStaffHire)obj;
                        //checking staff is save or not
                        if(ob.getsave()==true){
                            JOptionPane.showMessageDialog(frame2,"Staff already hired!");
                            
                        }else{
                            //full time staff hire method
                           ob.appointFullTimeStaff(fN,lN,mN,joiningD,workingS,appointedB,qualifi);
                          JOptionPane.showMessageDialog(frame2,"Staff has been hired!");
                              
                          break;
                        }
                    }else{
                        JOptionPane.showMessageDialog(frame2,"not for fulltime staff Hire");
                        break;
                    }
                }             
            }
            if(!VacCheck){
                    JOptionPane.showMessageDialog(frame2,"invalid vacancy");
                    
            } 
        
        }
      }
      else if(Obj.getSource()==addVacancy){
                     
             if (txtJobType.getSelectedItem().equals("----Select----")) {
                    JOptionPane.showMessageDialog(frame2, "Group must be selected", "Input Error", JOptionPane.ERROR_MESSAGE);
                }
                else if(txtJobType.getSelectedItem().equals("    Part Time")){
                    JOptionPane.showMessageDialog(frame2, "Wrong group selected ", "Input Error", JOptionPane.ERROR_MESSAGE);
                }
                
                else
                { int vacNumb=0;
                   
                    try{
                        vacNumb=Integer.parseInt(txtVacancy1.getText()); 
                        desig=txtDesignation.getText();
                        sal=Integer.parseInt(txtSalary.getText());
                        workingH=Integer.parseInt(txtWorkingHour.getText());
                        jobT=(txtJobType.getSelectedItem()).toString();
                       
                        boolean isDuplicateVno=false;
                       for(StaffHire obj:INGNepal.staffObj){
                            if(obj.getvacancyNumber()==vacNumb){
                                isDuplicateVno=true;
                                break;
                            }
                       }
                       if(isDuplicateVno==false){
                            FullTimeStaffHire Ftobj=new FullTimeStaffHire(vacNumb,desig,jobT,sal,workingH);
                            INGNepal.staffObj.add(Ftobj);
                            
                            JOptionPane.showMessageDialog(frame2,"Vacancy added "+INGNepal.staffObj.size());
                       }else{
                             JOptionPane.showMessageDialog(frame2," Vacancy no is already in the list. "+INGNepal.staffObj.size()); 
                       }
                    }catch(Exception exp){
                         JOptionPane.showMessageDialog(frame2,"Input is invalid. "); 
                    }
                }
            }
              
        
        
       else if (Obj.getSource()==neew){
            
            clear();
       }
       else if(Obj.getSource()==display){
               currentIndex++;
               displayStaff(currentIndex);
       }
    }
    //clear data 
    public void clear(){
        txtVacancy.setText("");
        txtJoiningDate.setText("");
        txtfName.setText("");
        txtMName.setText("");
        txtLName.setText("");
        txtSalary.setText("");
        //gen.setText("");
        txtDesignation.setText("");
        txtWorkingHour.setText("");
        txtJobType.setSelectedItem("----Select----");
        txtQualification.setText("");
        txtAppointedBy.setText("");
        txtWorkingShift.setText("");
    }
    //display data
    public void displayStaff(int index){
       for(int i=0;i<INGNepal.staffObj.size();i++){
                
                //vacancy number
                int a=((StaffHire) INGNepal.staffObj.get(i)).getvacancyNumber();
                String b=Integer.toString(a);
                txtVacancy.setText(b);
                //joining date
                
                txtJoiningDate.setText(((FullTimeStaffHire)INGNepal.staffObj.get(i)).getjoiningDate());
                txtfName.setText(((FullTimeStaffHire)INGNepal.staffObj.get(i)).getfName());
                txtMName.setText(((FullTimeStaffHire)INGNepal.staffObj.get(i)).getmName());
                txtLName.setText(((FullTimeStaffHire)INGNepal.staffObj.get(i)).getlName());
                //salary
                int e=((FullTimeStaffHire)INGNepal.staffObj.get(i)).getsalary();
                String f=Integer.toString(e);
                txtSalary.setText(f);
                //gen convert into defult
                txtDesignation.setText(((StaffHire)INGNepal.staffObj.get(i)).getdesignation());
                //working hour
                int g=((FullTimeStaffHire)INGNepal.staffObj.get(i)).getworkingHour();
                String h=Integer.toString(g);
                txtWorkingHour.setText(h);
                
                txtJobType.setSelectedItem(((StaffHire)INGNepal.staffObj.get(i)).getjobType());
                txtQualification.setText(((FullTimeStaffHire)INGNepal.staffObj.get(i)).getqualification());
                txtAppointedBy.setText(((FullTimeStaffHire)INGNepal.staffObj.get(i)).getappointedBy());
                txtWorkingShift.setText(((FullTimeStaffHire)INGNepal.staffObj.get(i)).getworkingShift());
        }   
    }
    
}
