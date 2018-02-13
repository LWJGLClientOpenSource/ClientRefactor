package net.LWJGLClient.client.model.f;

import net.LWJGLClient.client.c.Packet;

public final class Class792 extends TextureData {
   private int[] Field2914;

   public final void Method13537() {
      this.Field2914 = null;
   }

   public Class792(int var1, int var2, Packet var3) {
      super(var1, var2);
      var1 *= var2;
      int[] var6 = this.Field2914 = new int[var1];

      for(int var4 = 0; var4 != var1; ++var4) {
         int var5;
         if ((var5 = var3.Method14455()) != 0) {
            var5 |= -16777216;
         } else {
            this.Field2906 = false;
         }

         var6[var4] = var5;
      }

   }

   public final int Method13538(int var1) {
      return this.Field2914 == null ? 0 : this.Field2914[var1];
   }

   public final String toString() {
      return "1\t" + super.toString();
   }
}
