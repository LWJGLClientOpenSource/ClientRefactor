package net.LWJGLClient.client.b.b;

import net.LWJGLClient.client.e.Class17;
import net.LWJGLClient.client.model.Client;

final class Class111 implements Runnable {
   // $FF: synthetic field
   private GraphicsDisplay Field2643;
   // $FF: synthetic field
   private final Client Field2644;

   Class111(GraphicsDisplay var1, Client var2) {
      super();
      this.Field2643 = var1;
      this.Field2644 = var2;
      //super();
   }

   public final void run() {
      this.Field2644.startUp();

      long var1;
      for(double var5 = 1.0D; GraphicsDisplay.Method1064(this.Field2643); var5 = (double)(System.currentTimeMillis() - var1) / 20.0D) {
         var1 = System.currentTimeMillis();
         if (Class17.Method196()) {
            this.Field2643.Method1031(false);
         }

         try {
            this.Field2644.doLogic(true, (float)var5); //TODO
         } catch (Exception var12) {
            var12.printStackTrace();
         }

         long var3 = System.currentTimeMillis() - var1;
         long var7 = 20L - var3;

         try {
            if (var7 < 5L) {
               var7 = 5L;
            } else if (var7 > 20L) {
               var7 = 20L;
            }

            Thread.sleep(var7);
         } catch (InterruptedException var11) {
            var11.printStackTrace();
         }
      }

   }
}
