import java.awt.*;

class lib extends Frame {
    
    lib(){
        
	  Label l = new Label("    WELCOME");
        l.setBackground(Color.black);
        l.setForeground(Color.white);
	  add(l);
	  l.setBounds(200,130,300,80);
	  Font myFont = new Font("Serif",Font.BOLD,40);
        l.setFont(myFont);
	 
        
        setTitle("Library");
        setLayout(null);
        setSize(800,600);
        setBackground(Color.green.darker().darker());
        setVisible(true);
    }
    
    public static void main(String args[]){
        new lib();
    }
}