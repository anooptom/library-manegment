import java.awt.*;

class lib extends Frame {
    
    lib(){
        
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