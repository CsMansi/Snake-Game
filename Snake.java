package package1;

import javax.swing.JFrame;

public class Snake extends JFrame {

      Snake(){
            super("Snake Game");
            add(new Board());
            pack();
            setLocationRelativeTo(null);
            setResizable(false);
      }
      public static void main(String[] args) {
           new Snake().setVisible(true);
      }
}
