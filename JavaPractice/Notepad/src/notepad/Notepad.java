package notepad;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class Notepad extends JFrame implements ActionListener {
		Notepad(){
			setTitle("Notepad");
			ImageIcon notepadIcon=new ImageIcon(ClassLoader.getSystemResource("icons/notepad.png"));
			Image icon= notepadIcon.getImage();
			setIconImage(icon);
			JMenuBar menuBar=new JMenuBar();
			JMenu file=new JMenu("File");
			file.setFont(new Font("AERIAL",Font.PLAIN,14));
			
			JMenuItem newdoc=new JMenuItem("New");
			newdoc.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N,ActionEvent.CTRL_MASK));
			
			JMenuItem open=new JMenuItem("Open");
			open.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O,ActionEvent.CTRL_MASK));
			
			JMenuItem save=new JMenuItem("Save");
			save.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S,ActionEvent.CTRL_MASK));
			
			JMenuItem print=new JMenuItem("Print");
			print.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P,ActionEvent.CTRL_MASK));
			
			JMenuItem exit=new JMenuItem("Exit");
			exit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E,ActionEvent.CTRL_MASK));
			file.add(newdoc);
			file.add(open);
			file.add(save);
			file.add(print);
			file.add(exit);
			menuBar.add(file);
			JMenu edit=new JMenu("Edit");
			edit.setFont(new Font("AERIAL",Font.PLAIN,14));
			JMenuItem copy=new JMenuItem("Copy");
			copy.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C,ActionEvent.CTRL_MASK));
			
			JMenuItem cut=new JMenuItem("Cut");
			cut.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X,ActionEvent.CTRL_MASK));
			
			JMenuItem paste=new JMenuItem("Paste");
			paste.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V,ActionEvent.CTRL_MASK));
			
			JMenuItem selectAll=new JMenuItem("Select All");
			selectAll.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A,ActionEvent.CTRL_MASK));
			
			edit.add(copy);
			edit.add(cut);
			edit.add(paste);
			edit.add(selectAll);
			menuBar.add(edit);
			JMenu help=new JMenu("Help");
			help.setFont(new Font("AERIAL",Font.PLAIN,14));
			
			JMenuItem Help=new JMenuItem("Help");
			Help.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_H,ActionEvent.CTRL_MASK));
			help.add(Help);
			menuBar.add(help);
			
			setJMenuBar(menuBar);
			JTextArea area=new JTextArea();
			area.setFont(new Font("SAN_SERIF",Font.PLAIN,18));
			area.setLineWrap(true);
			area.setWrapStyleWord(true);
			
			JScrollPane pane=new JScrollPane(area);
			add(pane);
			setExtendedState(JFrame.MAXIMIZED_BOTH);
			setVisible(true);
		}
			@Override
			public void actionPerformed(ActionEvent ae) {
				
			}
		
		public static void main(String[] args) {
			new Notepad();
		}
}
