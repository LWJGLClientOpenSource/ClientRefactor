package net.LWJGLClient.client.model;

import net.LWJGLClient.client.e.c.Class820;

final class Class881 implements Runnable {
   // $FF: synthetic field
   private Client Field3670;

   Class881(Client var1) {
      super();
      this.Field3670 = var1;
     // super();
   }

   public final void run() {
      this.Field3670.Field12158 = new Class820("mLoader");
      String[] var1 = this.Field3670.Field12158.Method13685();
      this.Field3670.Field12159 = var1;
      this.Field3670.Field12158.Method13683();
      this.Field3670.Field12158.setVisible(false);
      this.Field3670.Field12158 = null;
   }
}
