import java.awt.*;  
import java.awt.event.*;  
class Firstclose {  

Firstclose(){  
Frame f =new Frame("This is my First AWT example"); 
f.setSize(500,500);//frame size 300 width and 300 height  

f.setLayout(new FlowLayout());//Setting the layout for the Frame
f.setVisible(true);//now frame will be visible, by default not visible 
f.addWindowListener(new WindowAdapter() {
       public void windowClosing(WindowEvent windowEvent){
        System.exit(0);
   }        
 });  
}  
public static void main(String args[]){  
Firstclose f=new Firstclose();  
}
}