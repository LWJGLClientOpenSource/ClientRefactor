package net.LWJGLClient.client.c.a;

import net.LWJGLClient.client.c.Packet;

public final class Class610 {
   private final int Field10002 = 1;
   private final byte[] Field10003;
   private final String Field10004;
   private int Field10005 = 0;
   private int Field10006 = 4096;

   public Class610(String var1, int var2, byte[] var3) {
      this.Field10003 = var3;
      this.Field10004 = var1;
   }

   public final boolean Method9266(Packet var1) {
      boolean var2 = false;
      int var3 = this.Field10006;
      if (this.Field10005 + var3 >= this.Field10003.length) {
         var3 = this.Field10003.length - this.Field10005;
         var2 = true;
      }

      byte[] var4 = new byte[var3];
      System.arraycopy(this.Field10003, this.Field10005, var4, 0, var3);
      var1.Method386(254);
      var1.Method384(this.Field10002);
      var1.Method395(this.Field10004);
      var1.Method384(var2 ? 1 : 0);
      var1.Method14470(var4.length);
      var1.Method397(var4);
      var1.Method14474();
      this.Field10005 += var3;
      return var2;
   }
}
