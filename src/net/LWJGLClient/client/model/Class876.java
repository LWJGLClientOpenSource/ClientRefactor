package net.LWJGLClient.client.model;

import net.LWJGLClient.client.d.b.Class331;

final class Class876 implements Runnable {
   // $FF: synthetic field
   private Client Field2629;

   Class876(Client var1) {
      super();
      this.Field2629 = var1;
      //super();
   }

   public final void run() {
      Class331 var1 = this.Field2629.Field12061;
      synchronized(this.Field2629.Field12061) {
         this.Field2629.Field12061.Method3420(Client.Field12379, true);
         this.Field2629.Field12274 = true;
      }
   }
}
