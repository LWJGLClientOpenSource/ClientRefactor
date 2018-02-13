package net.LWJGLClient.client.model.f;

import net.LWJGLClient.client.c.Packet;

public class Class793 extends TextureData {
   public int[] Field2912;
   public byte[] Field2913;

   public void Method13537() {
      this.Field2912 = null;
      this.Field2913 = null;
   }

   public Class793(int var1, int var2, Packet var3, boolean var4) {
      super(var1, var2);
      int var5 = var3.Method381();
      int[] var6 = this.Field2912 = new int[var5 + 1];

      int var7;
      for(var7 = 0; var7 != var5; ++var7) {
         int var8 = var3.Method14455();
         if (!var4) {
            var8 |= -16777216;
         }

         var6[var7 + 1] = var8;
      }

      var7 = var1 * var2;
      byte[] var9 = this.Field2913 = new byte[var7];

      for(var1 = 0; var1 != var7; ++var1) {
         var9[var1] = var3.Method378();
         if (!var4 && var9[var1] == 0) {
            this.Field2906 = false; //this.c = false;
         }
      }

   }

   public int Method13538(int var1) {
      return this.Field2912 != null && this.Field2913 != null ? this.Field2912[this.Field2913[var1] & 255] : -1;
   }

   public String toString() {
      return "0" + "\t" + super.toString() + "\t" + (this.Field2912.length - 1);
   }
}
