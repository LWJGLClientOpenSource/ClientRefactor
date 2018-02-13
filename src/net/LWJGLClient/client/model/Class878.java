package net.LWJGLClient.client.model;

final class Class878 implements Runnable {
   // $FF: synthetic field
   private Client Field2593;
   // $FF: synthetic field
   private final Client Field2594;

   Class878(Client var1, Client var2) {
      super();
      this.Field2593 = var1;
      this.Field2594 = var2;
   }

   public final void run() {
      Client var1 = this.Field2594;
      synchronized(this.Field2594) {
         Client.Field12218.Method8830(this.Field2594, Client.Field12428, this.Field2593.Field12655, false);
      }
   }
}
