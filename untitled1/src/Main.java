    import java.awt.*;
    import java.awt.event.*;
    import java.io.IOException;
    import java.net.URI;
    import java.net.URISyntaxException;
    import javax.swing.*;


    public class Main {

        public static void main(String[] args) {

            JFrame window=new JFrame("For my angel");


            JButton button = new JButton("My love <3");
            button.setBounds(200,200,130,100);

            button.addActionListener(new ActionListener(){

                public void actionPerformed(ActionEvent e){


                    URI adress = null;
                    try {
                        adress = new URI("https://github.com/ArthurOReis/ArthurOReis");
                        java.awt.Desktop.getDesktop().browse(adress);

                    } catch (URISyntaxException ex) {
                        throw new RuntimeException(ex);
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                    ;
                }
            });
            window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            window.add(button);
            window.setSize(500,500);
            window.setLayout(null);
            window.setVisible(true);
        }
    }