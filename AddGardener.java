import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

public class AddGardener extends JFrame{

	private JFrame gAdd;
	private JTextField fnameTxtField;
	private JTextField lnameTxtField;
	private JTextField emailTxtField;

	/**
	 * Launch the application.
	 */
	/*
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddGardener window = new AddGardener();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	} */

	/**
	 * Create the application.
	 */
	public AddGardener() {
		gAdd = new JFrame("Gardener Information");
		gAdd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exits new frame
		gAdd.setVisible(true);
		gAdd.setBounds(0, 0, 700, 500); //sets layout
		gAdd.getContentPane().setLayout(null);
		gAdd.setResizable(true);
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		//gAdd = new JFrame();
		
		//styles the panel
		gAdd.getContentPane().setBackground(new Color(240, 248, 255)); 
		gAdd.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 17));
		
		//adds texts
		JLabel lblNewLabel = new JLabel("First Name");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(31, 37, 88, 13);
		gAdd.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Grade");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(31, 103, 96, 13);
		gAdd.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Email");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_1.setBounds(31, 186, 74, 19);
		gAdd.getContentPane().add(lblNewLabel_1_1);
		
		fnameTxtField = new JTextField();
		fnameTxtField.setBounds(31, 57, 130, 19);
		gAdd.getContentPane().add(fnameTxtField);
		fnameTxtField.setColumns(10);
		
		lnameTxtField = new JTextField();
		lnameTxtField.setColumns(10);
		lnameTxtField.setBounds(171, 57, 146, 19);
		gAdd.getContentPane().add(lnameTxtField);
		
		JLabel lblLastName = new JLabel("Last Name");
		lblLastName.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblLastName.setBounds(171, 37, 88, 13);
		gAdd.getContentPane().add(lblLastName);
		
		JComboBox gradeCmbBx = new JComboBox();
		gradeCmbBx.setModel(new DefaultComboBoxModel(new String[] {"", "9", "10", "11", "12"}));
		gradeCmbBx.setBounds(31, 137, 130, 21);
		gAdd.getContentPane().add(gradeCmbBx);
		
		emailTxtField = new JTextField();
		emailTxtField.setBounds(31, 214, 286, 19);
		gAdd.getContentPane().add(emailTxtField);
		emailTxtField.setColumns(10);
		
		JLabel lblReason = new JLabel("Reason");
		lblReason.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblReason.setBounds(398, 37, 88, 13);
		gAdd.getContentPane().add(lblReason);
		
		JTextArea reasonTxtArea = new JTextArea();
		reasonTxtArea.setBounds(396, 57, 260, 331);
		gAdd.getContentPane().add(reasonTxtArea);
		
		JLabel lblNewLabel_1_2 = new JLabel("Experience Level");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_2.setBounds(171, 103, 146, 13);
		gAdd.getContentPane().add(lblNewLabel_1_2);
		
		JComboBox levelCmbBox = new JComboBox();
		levelCmbBox.setModel(new DefaultComboBoxModel(new String[] {"", "Beginner", "Intermediate", "Advanced"}));
		levelCmbBox.setBounds(171, 137, 146, 21);
		gAdd.getContentPane().add(levelCmbBox);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Volunteer Hours");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_1_1.setBounds(31, 260, 135, 19);
		gAdd.getContentPane().add(lblNewLabel_1_1_1);
		
		JButton addHalfBtn = new JButton("+0.5");
		addHalfBtn.setBounds(184, 287, 63, 21);
		gAdd.getContentPane().add(addHalfBtn);
		
		JButton addOneBtn = new JButton("+1");
		addOneBtn.setBounds(257, 287, 63, 21);
		gAdd.getContentPane().add(addOneBtn);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Days Available");
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_1_1_1.setBounds(31, 338, 135, 19);
		gAdd.getContentPane().add(lblNewLabel_1_1_1_1);
		
		JFormattedTextField formattedTextField = new JFormattedTextField();
		formattedTextField.setBounds(31, 289, 130, 19);
		gAdd.getContentPane().add(formattedTextField);
		
		JButton addGdnrBtn = new JButton("Add");
		addGdnrBtn.setBounds(232, 412, 85, 21);
		gAdd.getContentPane().add(addGdnrBtn);
		
		JButton discardBtn = new JButton("Discard");
		discardBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		discardBtn.setBounds(358, 412, 85, 21);
		gAdd.getContentPane().add(discardBtn);
		
		JList jListDays = new JList(); //multiple interval selection
		jListDays.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		jListDays.setModel(new AbstractListModel() {
		String[] days = new String[] {"", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
		String gndrDays = jListDays.getSelectedValue().toString();
			public int getSize() {
				return days.length;
			} 
			 public Object getElementAt(int index) {
				return days[index];
			} 
		});
	//}
		
		jListDays.setVisibleRowCount(1);
		jListDays.setValueIsAdjusting(true);
		jListDays.setBounds(31, 367, 146, 96);
		gAdd.getContentPane().add(jListDays);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setBounds(199, 426, -160, -69);
		gAdd.getContentPane().add(scrollPane);
	}
}
