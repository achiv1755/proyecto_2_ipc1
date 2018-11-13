 
package proyecto_2_201700556;

import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

 
public class Render extends DefaultTableCellRenderer
{

    @Override
    public Component getTableCellRendererComponent(JTable jtable, Object o,
            boolean bln, boolean bln1, int i, int i1) 
    {
        if (o instanceof  JButton) 
        {
            JButton boton_modificar=(JButton)o;
            return boton_modificar;
        }
        return super.getTableCellRendererComponent(jtable, o, bln,
                bln1, i, i1); //To change body of generated methods, choose Tools | Templates.
    }

 

    
}
