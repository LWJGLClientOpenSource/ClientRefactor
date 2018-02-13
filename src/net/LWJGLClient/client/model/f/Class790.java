package net.LWJGLClient.client.model.f;

import net.LWJGLClient.client.c.Packet;

public final class Class790 extends Class793 {
   private byte[] Field2927;

   public final void Method13537() {
      super.Method13537();
      this.Field2927 = null;
   }

   public Class790(int var1, int var2, Packet var3) {
      super(var1, var2, var3, true);
      var1 *= var2;
      this.Field2927 = new byte[var1];

      for(var2 = 0; var2 != var1; ++var2) {
         this.Field2927[var2] = var3.Method378();
         if (this.Field2927[var2] == 0) {
            this.Field2912[var2] = 0;
            this.Field2906 = false;
         } else if (this.Field2927[var2] != -1) {
            this.Field2906 = false;
            this.Field2905 = true;
         }
      }

   }

   public final int Method13538(int var1) {
      return this.Field2927 != null && this.Field2913 != null ? (this.Field2927[var1] & 255) << 24 | this.Field2913[this.Field2912[var1] & 255] : -1;
   }
}
