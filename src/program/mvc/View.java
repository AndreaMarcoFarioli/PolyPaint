package program.mvc;

import drawUtilities.DrawablePanel;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

public class View {
    private JFrame mainFrame;
    private DrawablePanel
            drawArea            = new DrawablePanel();
    private JPanel
            drawItemsPanel      = new JPanel();

    private Dimension
            screenSize          = Toolkit.getDefaultToolkit().getScreenSize();
    private final Dimension
            minDimension        = new Dimension(screenSize.width/2,screenSize.height/2),
            maxDimension        = new Dimension(screenSize.width,screenSize.height);
    //region UpBar
    private JMenuBar upBar      = new JMenuBar();
    private JMenu
            uB_fileMenu         = new JMenu("File"),
            uB_prefabsMenu      = new JMenu("Prefabs"),
            uB_viewMenu         = new JMenu("View/Window");
    private JMenuItem
            uB_fM_saveButton    = new JMenuItem("Save"),
            uB_fM_loadButton    = new JMenuItem("Load"),
            uB_pM_rectangle     = new JMenuItem("Rectangle"),
            uB_pM_circle        = new JMenuItem("Circle"),
            uB_pM_oval          = new JMenuItem("Oval"),
            uB_vM_showItems     = new JMenuItem("Draw items");
    //endregion
    public void invokeAndWait() throws InvocationTargetException, InterruptedException {
        SwingUtilities.invokeAndWait(this::build);
    }

    public void invokeLater(){
        SwingUtilities.invokeLater(this::build);
    }

    public void build(){
        mainFrame = new JFrame("PolyPaint (v0.1)");
        mainFrame.setSize(minDimension);
        mainFrame.setPreferredSize(minDimension);
        mainFrame.setMinimumSize(minDimension);
        mainFrame.setMaximumSize(maxDimension);
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setIconImage(new ImageIcon("imgs/icon.png").getImage());
        //region default gui
        setUpBar();
        setDrawArea();
        setDrawItemsArea();
        setBorAbout();
        //endregion
        mainFrame.setVisible(true);
    }

    private void setUpBar(){
        Container content = mainFrame.getContentPane();
        uB_fileMenu.add(uB_fM_saveButton);
        uB_fileMenu.add(uB_fM_loadButton);

        uB_prefabsMenu.add(uB_pM_rectangle);
        uB_prefabsMenu.add(uB_pM_circle);
        uB_prefabsMenu.add(uB_pM_oval);

        uB_viewMenu.add(uB_vM_showItems);

        upBar.add(uB_fileMenu);
        upBar.add(uB_prefabsMenu);
        upBar.add(uB_viewMenu);
        content.add(upBar, BorderLayout.NORTH);
    }
    private void setBorAbout(){
        Container content = mainFrame.getContentPane();
        JPanel panel = new JPanel();
        panel.setBackground(new Color(0,0,0,.05f));
        JLabel label = new JLabel("Andrea M. Farioli & Federico Levato - 5^C Informatica");
        label.setFont(new Font(label.getName(), Font.PLAIN, 10));
        panel.setPreferredSize(new Dimension(panel.getWidth(), 20));
        panel.setBorder(new EmptyBorder(0, 10,0,10));
        panel.setLayout(new BorderLayout());
        panel.add(label, BorderLayout.WEST);
        content.add(panel, BorderLayout.SOUTH);
    }
    private void setDrawArea(){
        Container content = mainFrame.getContentPane();
        content.add(drawArea, BorderLayout.CENTER);
    }

    private void setDrawItemsArea(){
        drawItemsPanel.setPreferredSize(new Dimension(200, drawItemsPanel.getSize().height));
        Container content = mainFrame.getContentPane();
        drawItemsPanel.setVisible(false);
        drawItemsPanel.setBackground(new Color(0,0,0));
        content.add(drawItemsPanel, BorderLayout.WEST);
    }

    public void setItemPanelVisible(boolean thick){
        drawItemsPanel.setVisible(thick);
        drawItemsPanel.repaint();
        drawItemsPanel.validate();
    }

    public void setShowItemsClickEvent(ActionListener actionListener){
        uB_vM_showItems.addActionListener(actionListener);
    }

    public void unsetShowItemsClickEvent(ActionListener actionListener){
        uB_vM_showItems.removeActionListener(actionListener);
    }

}
