import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

    public static final int HEIGHT = 100;
    public static final int WIDTH = 300;
    private JButton greenButton;
    private JButton blueButton;
    private JButton redButton;
    private JButton fourthButton;
    private JLabel text;

    public MyFrame() {
        super("Test akcji");
        greenButton = new JButton("Green");
        blueButton = new JButton("Blue");
        redButton = new JButton("Red");
        fourthButton = new JButton("FourthButton");


        text = new JLabel();

        greenButton.addActionListener(this);
        blueButton.addActionListener(this);
        redButton.addActionListener(this);
        fourthButton.addActionListener((event)->{
            text.setText("przycisk czwarty");
        });

        setLayout(new FlowLayout());
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        add(greenButton);
        add(blueButton);
        add(redButton);
        add(fourthButton);
        add(text);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if(source == greenButton) {
            text.setText("Pierwszy przycisk");
            //text.setBounds(10, 10, 200, 25);
        }

        else if(source == blueButton) {
            text.setText("Drugi przycisk");
            //text.setBounds(10, 10, 200, 25);
        }

        else if(source == redButton){
            text.setText("Trzeci przycisk");
            //text.setBounds(10, 10, 200, 25);
        }
    }
}