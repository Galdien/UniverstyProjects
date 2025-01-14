package component;

public class Chat extends javax.swing.JPanel {

    public Chat() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        appBar = new component.AppBar();
        bottomSide = new component.BottomSide();
        chatBody = new component.Chat_Body();

        setBackground(new java.awt.Color(30, 31, 34));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(appBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, -1));
        add(bottomSide, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 800, 1060, -1));
        add(chatBody, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 1060, -1));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public component.AppBar appBar;
    public component.BottomSide bottomSide;
    public component.Chat_Body chatBody;
    // End of variables declaration//GEN-END:variables
}
