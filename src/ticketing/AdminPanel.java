package ticketing;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class AdminPanel extends JFrame {

	private JPanel contentPane;
	Database db = new Database();
	/**
	 * Create the frame.
	 */
	public AdminPanel() {
		super();
		setTitle("Administrator Panel");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		final JButton btnCreate = new JButton("Create New User");
		btnCreate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					 CreateNewUserPanel.getObj().frmAddNewUser.setVisible(true);
		            }
			
		});
		btnCreate.setBounds(155, 42, 147, 46);
		contentPane.add(btnCreate);
		
		final JButton btnStatistics = new JButton("View Statistics");
		btnStatistics.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewStats.getObj().frmViewStatistics.setVisible(true);
			}
		});
		btnStatistics.setBounds(155, 118, 147, 46);
		contentPane.add(btnStatistics);
		
		final JButton btnPost = new JButton("Post announcement");
		btnPost.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 PostAnouncement.getObj().frame.setVisible(true);
			}
		});
		btnPost.setBounds(155, 190, 147, 46);
		contentPane.add(btnPost);
		
	}
}
