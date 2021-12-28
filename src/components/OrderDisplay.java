package components;


import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;


public class OrderDisplay {
	
	JTable jt;
	JScrollBar sb;
	JScrollPane sp;
	
	public JScrollPane createOrderDisplay(Object[][] data , String [] columns) {

		jt = new JTable(data , columns);
		jt.setSize(400, 600);
		sb = new JScrollBar();
		sb.setVisible(true);
		jt.add(sb);
		sp = new JScrollPane(jt);
		
		return sp;
	}

}
