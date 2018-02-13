package net.LWJGLClient.client.model;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

final class Class860 implements MouseListener {
    // $FF: synthetic field
    private final JFrame Field2660;

    Class860(JFrame var1) {
        this.Field2660 = var1;
    }

    public final void mouseReleased(MouseEvent var1) {
    }

    public final void mousePressed(MouseEvent var1) {
    }

    public final void mouseExited(MouseEvent var1) {
    }

    public final void mouseEntered(MouseEvent var1) {
    }

    @Override
    public final void mouseClicked(MouseEvent var1) {
        this.Field2660.setVisible(false);

        try {
            Class867.Method14539(false);
        } catch (Exception var2) {
            var2.printStackTrace();
        }
    }
}
