package net.LWJGLClient.client.model.f;

import net.LWJGLClient.client.c.Packet;

public final class Class791 extends TextureData {
   private int[] Field2922;

   public final void Method13537() {
      this.Field2922 = null;
   }

   public Class791(int var1, int var2, Packet var3) {
      super(var1, var2);
      var1 *= var2;
      int[] var7 = this.Field2922 = new int[var1];

      for(int var4 = 0; var4 != var1; ++var4) {
         int var5;
         if (((var5 = var3.Method377()) & -16777216) == 0) {
            var5 = 0;
         }

         int var6;
         if ((var6 = var5 & -16777216) != -16777216) {
            this.Field2906 = false;
            if (var6 != 0) {
               this.Field2905 = true;
            }
         }

         var7[var4] = var5;
      }

   }

   public final int Method13538(int var1) {
      return this.Field2922 == null ? 0 : this.Field2922[var1];
   }

   public final String toString() {
      return "3\t" + super.toString();
   }
}
