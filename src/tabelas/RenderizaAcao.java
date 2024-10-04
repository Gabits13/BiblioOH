/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tabelas;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author guilh
 */
public class RenderizaAcao extends DefaultTableCellRenderer{

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        Component com = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        
        Acao telaAcao = new Acao();
        
        if (isSelected == false && row % 2 == 0) {
            telaAcao.setBackground(Color.WHITE);
        }
        else {
            telaAcao.setBackground(com.getBackground());
        }
        
        
        return telaAcao;
    }
    
}
