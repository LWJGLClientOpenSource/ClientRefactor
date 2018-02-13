package net.LWJGLClient.client.model;

import net.LWJGLClient.client.a.c.Class696;

final class Class874 implements Runnable {
   // $FF: synthetic field
   private final int Field2627;
   // $FF: synthetic field
   private final Class696 Field2628;

   Class874(int var1, Class696 var2) {
      this.Field2627 = var1;
      this.Field2628 = var2;
   }

   public final void run() {
      try {
         Model var1 = new Model(this.Field2627, this.Field2628.Field10507, this.Field2628, (byte)0);
         this.Field2628.Method11979(var1);
      } catch (Exception var2) {
         var2.printStackTrace();
      }

      this.Field2628.Method11981();
   }
}
