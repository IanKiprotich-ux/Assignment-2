import javax.swing.*;
import java.awt.event.*;

public class RadioButtonDemo extends JFrame implements ActionListener {
    JRadioButton birdButton, catButton, dogButton, rabbitButton, pigButton;
    JLabel imageLabel;

    public RadioButtonDemo() {
        setTitle("RadioButtonDemo");
        setSize(400, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        birdButton = new JRadioButton("Bird");
        catButton = new JRadioButton("Cat");
        dogButton = new JRadioButton("Dog");
        rabbitButton = new JRadioButton("Rabbit");
        pigButton = new JRadioButton("Pig");

        birdButton.setBounds(30, 30, 100, 30);
        catButton.setBounds(30, 70, 100, 30);
        dogButton.setBounds(30, 110, 100, 30);
        rabbitButton.setBounds(30, 150, 100, 30);
        pigButton.setBounds(30, 190, 100, 30);

        ButtonGroup group = new ButtonGroup();
        group.add(birdButton);
        group.add(catButton);
        group.add(dogButton);
        group.add(rabbitButton);
        group.add(pigButton);

        imageLabel = new JLabel();
        imageLabel.setBounds(160, 30, 180, 180);
        imageLabel.setBorder(BorderFactory.createEtchedBorder());

        add(birdButton);
        add(catButton);
        add(dogButton);
        add(rabbitButton);
        add(pigButton);
        add(imageLabel);

        birdButton.addActionListener(this);
        catButton.addActionListener(this);
        dogButton.addActionListener(this);
        rabbitButton.addActionListener(this);
        pigButton.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        String pet = "";
        if (e.getSource() == birdButton) {
            pet = "Bird";
            imageLabel.setIcon(new ImageIcon("bird.png"));
        } else if (e.getSource() == catButton) {
            pet = "Cat";
            imageLabel.setIcon(new ImageIcon("cat.png"));
        } else if (e.getSource() == dogButton) {
            pet = "Dog";
            imageLabel.setIcon(new ImageIcon("dog.png"));
        } else if (e.getSource() == rabbitButton) {
            pet = "Rabbit";
            imageLabel.setIcon(new ImageIcon("rabbit.png"));
        } else if (e.getSource() == pigButton) {
            pet = "Pig";
            imageLabel.setIcon(new ImageIcon("pig.png"));
        }
        JOptionPane.showMessageDialog(this, "You selected: " + pet);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new RadioButtonDemo().setVisible(true);
        });
    }
}