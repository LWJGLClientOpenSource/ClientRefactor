package net.LWJGLClient.client.d.b.a;

import net.LWJGLClient.client.model.Client;

final class Class333 implements Runnable {
   // $FF: synthetic field
   private final Class332 Field1986;

   Class333(Class332 var1, Class332 var2) {
      this.Field1986 = var2;
   }

   public final void run() {
      try {
         Client var1 = Client.Field12183;
         synchronized(Client.Field12183) {
            if (Client.class329 != null) {
               Class332.Method3432(this.Field1986);
               Class332.Method3433(this.Field1986, false);
               Class332.Method3434(this.Field1986);
               Class332.Method3435(this.Field1986, 2);
            }

         }
      } catch (Exception var3) {
         var3.printStackTrace();
      }
   }
}
