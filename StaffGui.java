
/**
 * Write a description of class StaffHire here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class StaffGui implements ActionListener
{
    private JFrame frame;
    private JLabel title;
    private JButton fullTimeBtn;
    private JButton partTimeBtn;
    private JButton display;
    public StaffGui(){
        frame=new JFrame("Staff");
        //Frame title
        title=new JLabel("Staff Hire");
        title.setBounds(90,30,200,30);
        title.setFont(new Font("serif",Font.BOLD,40));
        frame.add(title);
        
        //button Full Time
        fullTimeBtn=new JButton("Full Time Staff");
        fullTimeBtn.setBounds(5,80,150,30);
        fullTimeBtn.setFont(new Font("serif",Font.PLAIN,18));
        fullTimeBtn.addActionListener(this);
        frame.add(fullTimeBtn);
        
        //button part time
        partTimeBtn=new JButton("Part Time Staff");
        partTimeBtn.setBounds(190,80,150,30);
        partTimeBtn.setFont(new Font("serif",Font.PLAIN,18));
        partTimeBtn.addActionListener(this);
        frame.add(partTimeBtn);
        //display button
        display=new JButton("Display");
        display.setBounds(110,120,120,30);
        display.setFont(new Font("serif",Font.PLAIN,18));
        display.addActionListener(this);
        frame.add(display);
        
        
        frame.setLayout(null);
        frame.setSize(360,200);
        frame.setResizable (false);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void staff(){
        StaffGui staffObj=new StaffGui();
        
    }
    
    @Override
    public void actionPerformed(ActionEvent Obj){
        if(Obj.getSource()==fullTimeBtn){
            new FullTimeStaffHireGui();
        }
        else if(Obj.getSource()==partTimeBtn){
            new PartTimeStaffHireGui();
        }
        else if(Obj.getSource()==display){
            
            for(int index=0;index<INGNepal.staffObj.size();index++){
                    INGNepal.staffObj.get(index).display();
            }
        }
    }
   
}

