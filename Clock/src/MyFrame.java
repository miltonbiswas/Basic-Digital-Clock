import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame{
    
    Calendar calendar;
    SimpleDateFormat timeFormat;
    SimpleDateFormat dayFormat;
    JLabel timeLabel;
    JLabel dayJLabel;
    String time;
    String day;
    
    public MyFrame() {
        // Setup frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("My Clock Program");
        this.setLayout(new FlowLayout());
        this.setSize(350, 200);
        this.setResizable(false);
        
        // Formats for time and day
        timeFormat = new SimpleDateFormat("hh:mm:ss a");
        dayFormat = new SimpleDateFormat("EEEE");  // Changed format to show the day of the week (e.g., Monday)
        
        // Labels for time and day
        timeLabel = new JLabel();
        dayJLabel = new JLabel();
        
        // Initializing time and day
        time = timeFormat.format(Calendar.getInstance().getTime());
        day = dayFormat.format(Calendar.getInstance().getTime());
        
        // Setting initial values
        timeLabel.setText(time);
        dayJLabel.setText(day);
        
        // Adding labels to frame
        this.add(timeLabel);
        this.add(dayJLabel);
        this.setVisible(true);
        
        setTime();
    }
    
    public void setTime() {
        while (true) {
            time = timeFormat.format(Calendar.getInstance().getTime());
            day = dayFormat.format(Calendar.getInstance().getTime());
            timeLabel.setText(time);
            dayJLabel.setText(day);
            
            // Styling time label
            timeLabel.setFont(new Font("Verdana", Font.PLAIN, 50));
            timeLabel.setForeground(new Color(0X00FF00));
            timeLabel.setBackground(Color.black);
            timeLabel.setOpaque(true);
            
            // Styling day label
            dayJLabel.setFont(new Font("Verdana", Font.PLAIN, 20));
            dayJLabel.setForeground(new Color(0XFFFFFF));
            dayJLabel.setBackground(Color.black);
            dayJLabel.setOpaque(true);
            
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        new MyFrame();
    }
}
