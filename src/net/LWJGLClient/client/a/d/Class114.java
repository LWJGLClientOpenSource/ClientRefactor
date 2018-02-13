package net.LWJGLClient.client.a.d;

import net.LWJGLClient.client.model.Client;

final class Class114 implements Runnable {
   // $FF: synthetic field
   private Class116 Field9613;

   Class114(Class116 var1) {
      super();
      this.Field9613 = var1;
      //super();
   }

   public final void run() {
      try {
         RgbImage var1;
         (var1 = new RgbImage(Class116.Method987(this.Field9613) + ".png", Class116.Method988(this.Field9613), (byte)0)).Method9426();
         int var2 = Class116.Method989(this.Field9613);
         int var3 = var1.Field9895;

         for(int var4 = 0; var4 < Class116.Method990(this.Field9613); ++var4) {
            Class116.Method991(this.Field9613)[var4] = var1.Method880(var4 * var2, 0, var2, var3);
            Class116.Method991(this.Field9613)[var4].Field9878 = Client.Method13218(var4 + Class116.Method987(this.Field9613));
            Class116.Method991(this.Field9613)[var4].Field9894 = var2;
            Class116.Method991(this.Field9613)[var4].Field9895 = var3;
            Class116.Method991(this.Field9613)[var4].Method9426();
         }

         Class116.Method992(this.Field9613, true);
      } catch (Exception var5) {
         var5.printStackTrace();
      }

      Class116.Method993(this.Field9613, false);
   }
}
