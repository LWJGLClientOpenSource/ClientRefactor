package net.LWJGLClient.client;

final class Class684 implements Runnable {
   // $FF: synthetic field
   private final byte[] Field2923;
   // $FF: synthetic field
   private final int Field2924;

   Class684(byte[] var1, int var2) {
      this.Field2923 = var1;
      this.Field2924 = var2;
   }

   public final void run() {
      try {
         Signlink.Method11840().Method3358(this.Field2923, this.Field2924);
      } catch (Exception var2) {
         var2.printStackTrace();
      }
   }
}
