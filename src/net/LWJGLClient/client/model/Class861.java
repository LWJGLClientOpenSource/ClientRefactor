package net.LWJGLClient.client.model;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;

final class Class861 implements MouseListener {
   // $FF: synthetic field
   private final JFrame Field2724;
   // $FF: synthetic field
   private final boolean Field2725;

   Class861(JFrame var1, boolean var2) {
      this.Field2724 = var1;
      this.Field2725 = var2;
   }

   public final void mouseReleased(MouseEvent var1) {
   }

   public final void mousePressed(MouseEvent var1) {
   }

   public final void mouseExited(MouseEvent var1) {
   }

   public final void mouseEntered(MouseEvent var1) {
   }

   public final void mouseClicked(MouseEvent var1) {
      this.Field2724.setVisible(false);

      try {
         Class867.Method14539(true);
      } catch (Exception var3) {
         var3.printStackTrace();
      }

      try {
         Class867.Method14540();
      } catch (Exception var2) {
         var2.printStackTrace();
      }
   }
}
