package Days;
import javax.swing.*;
//import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.*;
//import java.awt.image.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("serial")
public class PetDisplay extends JFrame implements ActionListener {
    private JLabel petLabel;
    private JRadioButton dogRadioButton, catRadioButton, pigRadioButton, birdRadioButton, rabbitRadioButton;

    public PetDisplay() {
        // Create the main JFrame
        super("Pet Display Application");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Create a panel for radio buttons
        JPanel radioButtonPanel = new JPanel();
        radioButtonPanel.setLayout(new GridLayout(5, 1));

        // Create radio buttons
        dogRadioButton = new JRadioButton("Dog");
        catRadioButton = new JRadioButton("Cat");
        pigRadioButton = new JRadioButton("Pig");
        birdRadioButton = new JRadioButton("Bird");
        rabbitRadioButton = new JRadioButton("Rabbit");

        // Add radio buttons to a ButtonGroup to ensure only one can be selected at a time
        ButtonGroup petGroup = new ButtonGroup();
        petGroup.add(dogRadioButton);
        petGroup.add(catRadioButton);
        petGroup.add(pigRadioButton);
        petGroup.add(birdRadioButton);
        petGroup.add(rabbitRadioButton);

        // Add action listeners to the radio buttons
        dogRadioButton.addActionListener(this);
        catRadioButton.addActionListener(this);
        pigRadioButton.addActionListener(this);
        birdRadioButton.addActionListener(this);
        rabbitRadioButton.addActionListener(this);

        // Add radio buttons to the panel
        radioButtonPanel.add(dogRadioButton);
        radioButtonPanel.add(catRadioButton);
        radioButtonPanel.add(pigRadioButton);
        radioButtonPanel.add(birdRadioButton);
        radioButtonPanel.add(rabbitRadioButton);

        // Create a label to display the selected pet
        petLabel = new JLabel("Select a pet:");
        petLabel.setHorizontalAlignment(SwingConstants.CENTER);

        // Add components to the main JFrame
        getContentPane().add(petLabel, BorderLayout.CENTER);
        getContentPane().add(radioButtonPanel, BorderLayout.WEST);

        // Display the JFrame
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == dogRadioButton) {
            petLabel.setText("Selected pet: Dog");
            petLabel.setLocation(60, 100);
            disableRadioButtons();
            JLabel lblNewLabel_1 = new JLabel("");
            ImageIcon dog =  new ImageIcon (this.getClass().getResource("/Dog.jpg").getFile()); 
            lblNewLabel_1.setIcon(dog);
            lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
            lblNewLabel_1.setBounds(50, 50, 100, 100);
            getContentPane().add(lblNewLabel_1);
            setVisible(true);
            // Display of the Dog
        } else if (e.getSource() == catRadioButton) {
            petLabel.setText("Selected pet: Cat");
            petLabel.setLocation(60, 100);
            disableRadioButtons();
            JLabel lblNewLabel_2 = new JLabel("");
            ImageIcon cat =  new ImageIcon (this.getClass().getResource("/Cat.jpg").getFile()); 
            lblNewLabel_2.setIcon(cat); 
            lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
            lblNewLabel_2.setBounds(417, 6, 337, 435);
            getContentPane().add(lblNewLabel_2);
            setVisible(true);
            // Display of the Cat
        } else if (e.getSource() == pigRadioButton) {
            petLabel.setText("Selected pet: Pig");
            petLabel.setLocation(60, 100);
            disableRadioButtons();
            JLabel lblNewLabel_3 = new JLabel("");
            ImageIcon pig =  new ImageIcon (this.getClass().getResource("/Pig.jpg").getFile()); 
            lblNewLabel_3.setIcon(pig); 
            lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
            lblNewLabel_3.setBounds(417, 6, 337, 435);
            getContentPane().add(lblNewLabel_3);
            setVisible(true);
            // Display of the Pig
        } else if (e.getSource() == birdRadioButton) {
            petLabel.setText("Selected pet: Bird");
            petLabel.setLocation(60, 110);
            disableRadioButtons();
            JLabel lblNewLabel_4 = new JLabel("");
            ImageIcon bird =  new ImageIcon (this.getClass().getResource("/Bird.jpg").getFile()); 
            lblNewLabel_4.setIcon(bird); 
            lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
            lblNewLabel_4.setBounds(417, 6, 337, 435);
            getContentPane().add(lblNewLabel_4);
            setVisible(true);
            // Display of the Bird
        } else if (e.getSource() == rabbitRadioButton) {
            petLabel.setText("Selected pet: Rabbit");
            petLabel.setLocation(60, 100);
            disableRadioButtons();
            JLabel lblNewLabel_5 = new JLabel("");
            ImageIcon rabbit =  new ImageIcon (this.getClass().getResource("/rabbit.jpeg").getFile()); 
            lblNewLabel_5.setIcon(rabbit); 
            lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
            lblNewLabel_5.setBounds(417, 6, 337, 435);
            getContentPane().add(lblNewLabel_5);
            setVisible(true);
            // Display of the Rabbit
        }
    }

    private void disableRadioButtons() {
		// TODO Auto-generated method stub
    	dogRadioButton.setEnabled(false);
        catRadioButton.setEnabled(false);
        pigRadioButton.setEnabled(false);
        birdRadioButton.setEnabled(false);
        rabbitRadioButton.setEnabled(false);
	}

	public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new PetDisplay());
    }
}