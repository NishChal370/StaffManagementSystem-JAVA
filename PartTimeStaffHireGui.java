
/**
 * Write a description of class PartTimeStaff here.
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
public class PartTimeStaffHireGui implements ActionListener
{
    private JFrame frame3;
    private JLabel title;
    private JLabel vacancy;
    public JTextField txtVacancy;
    private JLabel joiningDate;
    public JTextField txtJoiningDate;
    private JLabel fName;
    public JTextField txtfName;
    private JLabel mName;
    public JTextField txtMName;
    private JLabel lName;
    public JTextField txtLName;
    private JLabel salary;
    public JTextField txtSalary;
    private JLabel gender;
    private JRadioButton male;
    private JRadioButton female;
    private ButtonGroup gen;
    private JLabel designation;
    public JTextField txtDesignation;
    private JLabel workingHour;
    public JTextField txtWorkingHour;
    private JLabel jobType;
    public JComboBox txtJobType;
    private JLabel qualification;
    public JTextField txtQualification;
    private JLabel appointedBy;
    public JTextField txtAppointedBy;
    private JLabel workingShift;
    public JTextField txtWorkingShift;
    public JLabel termVacancy;
    public JTextField txtTermVacancy;
    private JButton terminate;
    private JButton neew;
    private JButton save;
    
    private JLabel vacancy1;//Vacancy number
    private JTextField txtVacancy1;//vacancy number text field
    private JButton addVacancy;//vacancy number button
    private JButton display;//display button
    
    int vacP;//vacancy number
    String joiningDP;//joining date
    String fNP;//first name
    String lNP;//last name
    String mNP;//middle name
    int salP;//salary
    String gendP;//gender
    int workingHP;//working hour
    String jobTP;//job type
    String desigP;//designation
    String qualifiP;//qualification
    String workingSP;//working Shift
    String appointedBP;//appointed by
    
    int terVacancy;// terminate vacancy
    int currentIndex;
    public  PartTimeStaffHireGui(){
        //outlnne
        frame3=new JFrame("Part Time Staff Hire");
        //title
        title=new JLabel("Part Time Staff");
        title.setBounds(250,0,205,30);
        title.setFont(new Font("serif",Font.BOLD,30));
        frame3.add(title);
        //Vacancy number
        vacancy1 =new JLabel("Vacancy Number:");
        vacancy1.setBounds(15,50,150,30);
        vacancy1.setFont(new Font("serif",Font.PLAIN,18));
        frame3.add(vacancy1);
        //vacancy number text area
        txtVacancy1=new JTextField();
        txtVacancy1.setBounds(175,50,90,30);
        txtVacancy1.setFont(new Font("serif",Font.PLAIN,18));
        frame3.add(txtVacancy1);
        
        
        //job type
        jobType=new JLabel("Job Type:");
        jobType.setBounds(490,50,100,30);
        jobType.setFont(new Font("serif",Font.PLAIN,18));
        frame3.add(jobType);
        //combo box  for full time and part time option
        String[] jobTypeOption={"----Select----","    Full Time","    Part Time"};
        txtJobType=new JComboBox(jobTypeOption);
        txtJobType.setBounds(580,50,120,30);
        txtJobType.setFont(new Font("serif",Font.PLAIN,16));
        frame3.add(txtJobType);
                        
        //designation
        designation=new JLabel("Designation:");
        designation.setBounds(15,90,100,30);
        designation.setFont(new Font("serif",Font.PLAIN,18));
        frame3.add(designation);
        //designation text area
        txtDesignation=new JTextField();
        txtDesignation.setBounds(120,90,150,30);
        txtDesignation.setFont(new Font("serif",Font.PLAIN,18));
        frame3.add(txtDesignation);
        
         
        //working hour
        workingHour=new JLabel("Working Hour:");
        workingHour.setBounds(460,90,150,30);
        workingHour.setFont(new Font("serif",Font.PLAIN,18));
        frame3.add(workingHour);
        //working Hour text area
        txtWorkingHour=new JTextField();
        txtWorkingHour.setBounds(580,90,120,30);
        txtWorkingHour.setFont(new Font("serif",Font.PLAIN,18));
        frame3.add(txtWorkingHour);
        
        
        //Salary
        salary=new JLabel("Salary:");
        salary.setBounds(15,130,100,30);
        salary.setFont(new Font("serif",Font.PLAIN,18));
        frame3.add(salary);
        //salary text area
        txtSalary=new JTextField();
        txtSalary.setBounds(120,130,150,30);
        txtSalary.setFont(new Font("serif",Font.PLAIN,18));
        frame3.add(txtSalary);
        
        //addvacancy button
        addVacancy=new JButton("Add Vacancy");
        addVacancy.setBounds(480,130,200,30);
        addVacancy.setFont(new Font("serif",Font.PLAIN,18));
        addVacancy.addActionListener(this);
        frame3.add(addVacancy);
        
        //vacancy
        vacancy =new JLabel("Vacancy Number:");
        vacancy.setBounds(15,200,150,30);
        vacancy.setFont(new Font("serif",Font.PLAIN,18));
        frame3.add(vacancy);
        //vacancy number text area
        txtVacancy=new JTextField();
        txtVacancy.setBounds(150,200,90,30);
        txtVacancy.setFont(new Font("serif",Font.PLAIN,18));
        frame3.add(txtVacancy);
     
        //joining date
        joiningDate=new JLabel("Joining Date:");
        joiningDate.setBounds(480,200,100,30);
        joiningDate.setFont(new Font("serif",Font.PLAIN,18));
        frame3.add(joiningDate);
        //text area joining date
        txtJoiningDate=new JTextField("day/month/year");
        txtJoiningDate.setBounds(580,200,120,30);
        txtJoiningDate.setFont(new Font("serif",Font.PLAIN,18));
        frame3.add(txtJoiningDate);
        
        //first name
        fName= new JLabel("First Name:");
        fName.setBounds(15,240,100,30);
        fName.setFont(new Font("serif",Font.PLAIN,18));
        frame3.add(fName);
        //first name text area
        txtfName=new JTextField();
        txtfName.setBounds(110,240,130,30);
        txtfName.setFont(new Font("serif",Font.PLAIN,18));
        frame3.add(txtfName);
        
        //middle name
        mName=new JLabel("Middle Name:");
        mName.setBounds(250,240,140,30);
        mName.setFont(new Font("serif",Font.PLAIN,18));
        frame3.add(mName);
        //middle name text area
        txtMName=new JTextField();
        txtMName.setBounds(360,240,110,30);
        txtMName.setFont(new Font("serif",Font.PLAIN,18));
        frame3.add(txtMName);
        
        //Last name
        lName=new JLabel("Last Name:");
        lName.setBounds(480,240,100,30);
        lName.setFont(new Font("serif",Font.PLAIN,18));
        frame3.add(lName);
        //text area Last name
        txtLName=new JTextField();
        txtLName.setBounds(580,240,120,30);
        txtLName.setFont(new Font("serif",Font.PLAIN,18));
        frame3.add(txtLName);
        
        
       
        //Qualification
        qualification=new JLabel("Qualification:");
        qualification.setBounds(15,280,100,30);
        qualification.setFont(new Font("serif",Font.PLAIN,18));
        frame3.add(qualification);
        //qualification text area
        txtQualification=new JTextField();
        txtQualification.setBounds(120,280,120,30);
        txtQualification.setFont(new Font("serif",Font.PLAIN,18));
        frame3.add(txtQualification);
        
        //radio button gender
        gender=new JLabel("Gender:");
        gender.setBounds(250,280,100,30);
        gender.setFont(new Font("serif",Font.PLAIN,18));
        frame3.add(gender);
        //radio button option
        //male
        male=new JRadioButton("Male");
        frame3.add(male);
        male.setBounds(310,280,65,30);
        male.setFont(new Font("serif",Font.PLAIN,18));
        //female
        female=new JRadioButton("Female");
        frame3.add(female);
        female.setBounds(370,280,80,30);
        female.setFont(new Font("serif",Font.PLAIN,18));
        // putting the radio button in buttonGroup....If male will selected female will not be selected
        ButtonGroup gen=new ButtonGroup();
        gen.add(male);
        gen.add(female);
       
        
        //working shhift
        workingShift=new JLabel("Working Shift:");
        workingShift.setBounds(460,280,150,30);
        workingShift.setFont(new Font("serif",Font.PLAIN,18));
        frame3.add(workingShift);
        //working shift text area
        txtWorkingShift=new JTextField();
        txtWorkingShift.setBounds(580,280,120,30);
        txtWorkingShift.setFont(new Font("serif",Font.PLAIN,18));
        frame3.add(txtWorkingShift);
        
        //appointed by
        appointedBy=new JLabel("Appointed By:");
        appointedBy.setBounds(380,320,150,30);
        appointedBy.setFont(new Font("serif",Font.PLAIN,18));
        frame3.add(appointedBy);
        //text areea appointed by
        txtAppointedBy=new JTextField();
        txtAppointedBy.setBounds(500,320,200,30);
        txtAppointedBy.setFont(new Font("serif",Font.PLAIN,18));
        frame3.add(txtAppointedBy);
        
        //button display
        display=new JButton("Display");
        display.setBounds(15,370,160,30);
        display.setFont(new Font("serif",Font.PLAIN,18));
        display.addActionListener(this);
        frame3.add(display);
        
        //button new
        neew=new JButton("New");
        neew.setBounds(250,370,160,30);
        neew.setFont(new Font("serif",Font.PLAIN,18));
        neew.addActionListener(this);
        frame3.add(neew);
        
        //button save
        save=new JButton("Appoined");
        save.setBounds(500,370,160,30);
        save.setFont(new Font("serif",Font.PLAIN,18));
        save.addActionListener(this);
        frame3.add(save);
        
        //vacancy number for terminate
        termVacancy=new JLabel("Vacacny Number:");
        termVacancy.setBounds(15,410,160,30);
        termVacancy.setFont(new Font("serif",Font.PLAIN,18));
        frame3.add(termVacancy);
        //text vacacny number for termination
        txtTermVacancy=new JTextField();
        txtTermVacancy.setBounds(150,410,90,30);
        txtTermVacancy.setFont(new Font("serif",Font.PLAIN,18));
        frame3.add(txtTermVacancy);
        
        //terminate Button
        terminate=new JButton("Terminate");
        terminate.setBounds(250,410,160,30);
        terminate.setFont(new Font("serif",Font.PLAIN,18));
        terminate.addActionListener(this);
        frame3.add(terminate);
        
        //for outer layer
        frame3.setLayout(null);
        frame3.setSize(730,490);
        frame3.setResizable(false);
        frame3.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame3.setVisible(true);
    }
    public static void PartStaff(){
        PartTimeStaffHireGui frame3Obj=new PartTimeStaffHireGui();
    }
     @Override
    public void actionPerformed(ActionEvent Obj){
          if(Obj.getSource()==addVacancy){
                if (txtJobType.equals("----Select----")) {
                    JOptionPane.showMessageDialog(frame3, "Group must be selected", "Input Error", JOptionPane.ERROR_MESSAGE);
                }
                else if(txtJobType.getSelectedItem().equals("    Full Time")){
                    JOptionPane.showMessageDialog(frame3, "Wrong group selected ", "Input Error", JOptionPane.ERROR_MESSAGE);
                }
                else {//txtVacancyNumber, txtDesignation, txtSalary, txtWorkingHour
                   int vacNumP=0;
                   
                    try{
                        vacNumP=Integer.parseInt(txtVacancy1.getText()); 
                        desigP=txtDesignation.getText();
                        salP=Integer.parseInt(txtSalary.getText());
                        workingHP=Integer.parseInt(txtWorkingHour.getText());
                        jobTP=(txtJobType.getSelectedItem()).toString();
                    
                        boolean isDuplicateVno=false;
                       for(StaffHire obj:INGNepal.staffObj){
                            if(obj.getvacancyNumber()==vacNumP){
                                isDuplicateVno=true;
                                break;
                            }
                       }
                       if(isDuplicateVno==false){
                            PartTimeStaffHire Ptobj=new PartTimeStaffHire(vacNumP,desigP,jobTP,salP,workingHP);
                            INGNepal.staffObj.add(Ptobj);
                            
                            JOptionPane.showMessageDialog(frame3,"Vacancy added "+INGNepal.staffObj.size());
                       }else{
                             JOptionPane.showMessageDialog(frame3," Vacancy no is already in the list. "+INGNepal.staffObj.size()); 
                       }
                    }catch(Exception exp){
                         JOptionPane.showMessageDialog(frame3,"Input is invalid. "); 
                    }
                }
            }  
        //savee or appoint  button
         else if(Obj.getSource()==save){
            
            //for radio button
            if (!male.isSelected() && !female.isSelected()) {
                JOptionPane.showMessageDialog(frame3, "Gender must be selected", "Input Error", JOptionPane.ERROR_MESSAGE);
            }
            else{
                //middle name
                mNP=txtMName.getText();
                try{
                    //vacacncy number
                    vacP=Integer.parseInt(txtVacancy.getText());
                    //joining date
                    joiningDP=txtJoiningDate.getText();
                    //first name
                    fNP=txtfName.getText();
                    //last name
                    lNP=txtLName.getText();
                    //salary
                    salP=Integer.parseInt(txtSalary.getText());
                    //gender
                    gendP="";
                    if(male.isSelected()){
                        gendP="Male";
                    }
                    else if(female.isSelected()){
                        gendP="Female";
                    }
                    //working Hour
                    workingHP=Integer.parseInt(txtWorkingHour.getText());
                    //job type
                    jobTP=txtJobType.getSelectedItem().toString();
                    //Desigation
                    desigP=txtDesignation.getText();
                    //Qualification
                    qualifiP=txtQualification.getText();
                    //Working Shift
                    workingSP=txtWorkingShift.getText();
                    //Appointed By
                    appointedBP=txtAppointedBy.getText();
                }catch(Exception ee){
                    System.out.println(ee);
                }
              
                //checking vacancy and storing in respective field
                boolean VacCheck=false;
                for(StaffHire obj:INGNepal.staffObj){
                    if(obj.getvacancyNumber()==vacP){
                        VacCheck=true;
                        if(obj instanceof PartTimeStaffHire){
                            PartTimeStaffHire ob=(PartTimeStaffHire)obj;
                            //checking staff is save or not
                            if(ob.getSave()==true){
                                JOptionPane.showMessageDialog(frame3,"Staff already hired!");
                            }else{
                                //method from part time staff hire,storing txt in it
                               ob.HirePartTimeStaff(fNP,lNP,mNP,joiningDP,workingSP,appointedBP,qualifiP);
                              JOptionPane.showMessageDialog(frame3,"Staff has been hired!");
                              
                              break;
                            }
                        }else{
                            JOptionPane.showMessageDialog(frame3,"not for Part Time staff Hire");
                            break;
                        }
                    }             
                }
                //if appoint vacancy number is not equal to add vacancy number
                if(!VacCheck){
                        JOptionPane.showMessageDialog(frame3,"invalid vacancy");
                        
                } 
                
            }
        }
        //for new butoon (clearing text field)
        else if (Obj.getSource()==neew){
            clear();
            
        }
        
         else if(Obj.getSource()==display){
            currentIndex++;
            displayPStaff(currentIndex);
        }
        //for termination button
        else if(Obj.getSource()==terminate){
            boolean founded=false;
            
            int terminateVacacny=Integer.parseInt(txtTermVacancy.getText());
            
            for (int i=0;i<INGNepal.staffObj.size();i++){
                if(terminateVacacny==INGNepal.staffObj.get(i).getvacancyNumber()){
                    PartTimeStaffHire obTe=(PartTimeStaffHire)INGNepal.staffObj.get(i);
                    founded=true;
                    obTe.terminated();
                         
                    JOptionPane.showMessageDialog(frame3,"Staff is Terminated");
                      clear();
                        
                }
               
            }  
            if(founded==false){
                JOptionPane.showMessageDialog(frame3,"wrong vacancy number");
            }
            
        }
    }
    //clear data 
    public void clear(){
        txtVacancy.setText("");//vacacny number
        txtJoiningDate.setText("");//joining date
        txtfName.setText("");//first name
        txtMName.setText("");//middle name
        txtLName.setText("");//last name
        txtSalary.setText("");//Salary or wages/day
        //gen convert into defult
        txtDesignation.setText("");//designation
        txtWorkingHour.setText("");//working Hour
        txtJobType.setSelectedItem("----Select----");//job Type
        txtQualification.setText("");//qualification
        txtAppointedBy.setText("");//appointed by
        txtWorkingShift.setText("");//working Shift
    }
    //display data
    public void displayPStaff(int index){
            for(int i=0;i<INGNepal.staffObj.size();i++){
                System.out.println(((PartTimeStaffHire) INGNepal.staffObj.get(i)).getlName());//last name
                System.out.println(((PartTimeStaffHire)INGNepal.staffObj.get(i)).getfName());//first name
                //vacancy number 
                int z=((StaffHire) INGNepal.staffObj.get(i)).getvacancyNumber();
                String y=Integer.toString(z);//converting int to String
                txtVacancy.setText(y);
                //joining date
                txtJoiningDate.setText(((PartTimeStaffHire)INGNepal.staffObj.get(i)).getjoiningDate());
                //salary
                int o=((PartTimeStaffHire)INGNepal.staffObj.get(i)).getsalary();
                String p=Integer.toString(o);//converting int to String
                txtSalary.setText(p);
                //working hour
                int w=((PartTimeStaffHire)INGNepal.staffObj.get(i)).getWorkingHour();
                String v=Integer.toString(w);//converting int to String
                txtWorkingHour.setText(v);
                
                txtfName.setText(((PartTimeStaffHire)INGNepal.staffObj.get(i)).getfName());//first name
                txtMName.setText(((PartTimeStaffHire)INGNepal.staffObj.get(i)).getmName());//middle name
                txtLName.setText(((PartTimeStaffHire)INGNepal.staffObj.get(i)).getlName());//last name
                
                //gen convert into defult
                txtDesignation.setText(INGNepal.staffObj.get(i).getdesignation());//designation
                txtJobType.setSelectedItem(((PartTimeStaffHire)INGNepal.staffObj.get(i)).getjobType());//job type
                txtQualification.setText(((PartTimeStaffHire)INGNepal.staffObj.get(i)).getQualification());//qualification
                txtAppointedBy.setText(((PartTimeStaffHire)INGNepal.staffObj.get(i)).getAppointedBy());//appointed by
                txtWorkingShift.setText(((PartTimeStaffHire)INGNepal.staffObj.get(i)).getWorkingShift());//working shift
        }   
    }
}   
