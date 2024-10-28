/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tabelas;

import java.awt.Component;
import javax.swing.DefaultCellEditor;
import javax.swing.JCheckBox;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author guilh
 */
public class RenderizacaoBtnAcao extends DefaultCellEditor{
    
    private FuncoesBtn event;
    public RenderizacaoBtnAcao(FuncoesBtn event) {
        super(new JCheckBox());
        this.event = event;
    }

    @Override
    public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
        Acao btn = new Acao();
        btn.initEvent(event, row, column);
        btn.setBackground(table.getSelectionBackground());
        return btn;
    }
    
}
