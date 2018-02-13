package net.LWJGLClient.client.b.a;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JFrame;
import net.LWJGLClient.client.model.Client;

public final class RSFrame extends JFrame {
   public final Graphics getGraphics() {
      Graphics var1;
      (var1 = super.getGraphics()).translate(4, 26);
      return var1;
   }

   public RSFrame() {
      super(Client.Field12129);
      this.setDefaultCloseOperation(3);
      if (Client.Field12714 == 0) {
         int var10000 = Client.Field12715;
      }

      Dimension var1;
      double var2 = (double)(var1 = Toolkit.getDefaultToolkit().getScreenSize()).width * 0.6D;
      double var4 = (double)var1.height * 0.6D + 50.0D;
      if (var2 < 900.0D || var4 < 550.0D) {
         var2 = 900.0D;
         var4 = 550.0D;
      }

      this.setSize((int)var2, (int)var4);
      this.setLocation(var1.width / 2 - this.getSize().width / 2, var1.height / 2 - this.getSize().height / 2);
      this.setUndecorated(false);
      this.setVisible(true);

      try {
         EventQueue.invokeAndWait(new Class691(this));
      } catch (InterruptedException var6) {
         ;
      } catch (InvocationTargetException var7) {
         ;
      }
   }
}
