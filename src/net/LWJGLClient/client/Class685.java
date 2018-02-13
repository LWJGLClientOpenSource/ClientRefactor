package net.LWJGLClient.client;

final class Class685 implements Runnable {
   // $FF: synthetic field
   private final float Field2925;
   // $FF: synthetic field
   private final boolean Field2926;

   Class685(float var1, boolean var2) {
      this.Field2925 = var1;
      this.Field2926 = var2;
   }

   public final void run() {
      try {
         int var1 = Signlink.Method11840().Method3359();
         Signlink.Method11840().Method3356(this.Field2925);
         Signlink.Method11840().Method3361(this.Field2925, var1, this.Field2926);
      } catch (Exception var2) {
         var2.printStackTrace();
      }
   }
}
