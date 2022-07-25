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
		// TODO Auto-generated constructor stub
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("My Clock Program");
		this.setLayout(new FlowLayout());
		this.setSize(350, 200);
		this.setResizable(false);
		
		timeFormat = new SimpleDateFormat("hh:mm:ss a");
		dayFormat = new SimpleDateFormat("hh:mm:ss a");
		timeLabel = new JLabel();
		time = timeFormat.format(Calendar.getInstance().getTime());
		timeLabel.setText(time);
		
		
		
		this.add(timeLabel);
		this.setVisible(true);
	
		setTime();
	}
	public void setTime(){
		while (true) {
			time = timeFormat.format(Calendar.getInstance().getTime());
			timeLabel.setText(time);
			timeLabel.setFont(new Font("Verdana", Font.PLAIN,50));
			timeLabel.setForeground(new Color(0X00FF00));
			timeLabel.setBackground(Color.black);
			timeLabel.setOpaque(true);
			
			try {
			Thread.sleep(1000);
			}catch (InterruptedException e) {
				// TODO: auto-generated catch block
				e.printStackTrace();
			}
}
	}
}
	

