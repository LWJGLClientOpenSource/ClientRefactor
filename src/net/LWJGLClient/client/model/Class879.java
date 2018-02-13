package net.LWJGLClient.client.model;

import net.LWJGLClient.client.a.d.RgbImage;

final class Class879 implements Runnable {Class879(Client var1) {super(); this.Field2595 = var1; }

   public final void run() {
      Client.Method13422(this.Field2595, new RgbImage("loading_bar_empty", 0.7F, 1.0F));
      Client.Method13423(this.Field2595).Method9426();
      Client.Method13424(this.Field2595, new RgbImage("loading_bar_full", 0.7F, 1.0F));
      Client.Method13425(this.Field2595).Method9426();
      Client.Method13426(this.Field2595, new RgbImage("loading_bar_empty", 0.7F, 0.5F));
      Client.Method13427(this.Field2595).Method9426();
      Client.Method13428(this.Field2595, new RgbImage("loading_bar_full", 0.7F, 0.5F));
      Client.Method13429(this.Field2595).Method9426();
      RgbImage var1;
      (var1 = new RgbImage("border")).Method9426();
      RgbImage var2;
      (var2 = new RgbImage("border", 0.5F)).Method9426();
      int var3 = var1.Field9894 / 3;
      int var4 = var1.Field9895 / 3;
      int var5 = 0;
      int var6 = var2.Field9894 / 3;
      int var7 = var2.Field9895 / 3;
      int var8 = 0;
      this.Field2595.Field12410 = new RgbImage[9];
      this.Field2595.Field12411 = new RgbImage[9];

      for(int var9 = 0; var9 < 3; ++var9) {
         for(int var10 = 0; var10 < 3; ++var10) {
            this.Field2595.Field12410[var5] = var1.Method880(var9 * 30, var10 * 30, var3, var4);
            this.Field2595.Field12410[var5].Field9878 = var1.Field9878 + (long)var5;
            this.Field2595.Field12410[var5].Method9426();
            ++var5;
            this.Field2595.Field12411[var8] = var2.Method880(var9 * 15, var10 * 15, var6, var7);
            this.Field2595.Field12411[var8].Field9878 = var2.Field9878 + (long)var5 + 10L;
            this.Field2595.Field12411[var8].Method9426();
            ++var8;
         }
      }

   }
   // $FF: synthetic field
   private Client Field2595;
}
