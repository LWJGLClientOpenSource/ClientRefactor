package net.LWJGLClient.client.model;

import net.LWJGLClient.client.a.d.RgbImage;
import net.LWJGLClient.client.a.d.Class116;

final class Class882 implements Runnable {
   // $FF: synthetic field
   private Client Field3671;

   Class882(Client var1) {
      this.Field3671 = var1;
      super();
   }

   public final void run() {
      try {
         Client.Method13413(this.Field3671, new RgbImage("img/logo2_winter", 1.0F, (byte)0));
         Client.Method13414(this.Field3671).Method9426();
         Client.Method13415(this.Field3671, new RgbImage("img/back_ge_2k", 1.0F, (byte)0));
         Client.Method13416(this.Field3671, false);
         if (Client.Method13417(this.Field3671) == null) {
            Client.Field12166 = false;
         } else {
            Client.Method13417(this.Field3671).Method14444();
            if (Client.Method13417(this.Field3671).Field9878 > 0L) {
               RgbImage var10000 = Client.Method13417(this.Field3671);
               var10000.Field9878 = -var10000.Field9878;
            }

            Client.Method13417(this.Field3671).Method9426();
         }
      } catch (Exception var2) {
         Client.Method13413(this.Field3671, (RgbImage)null);
         Client.Method13415(this.Field3671, (RgbImage)null);
         Client.Method13418(this.Field3671, (Class116)null);
         var2.printStackTrace();
         Client.Method13416(this.Field3671, false);
      }
   }
}
