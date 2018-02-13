package net.LWJGLClient.client.model;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import net.LWJGLClient.client.e.c.Class820;
import net.LWJGLClient.client.c.a.Class610;

final class Class880 implements Runnable {
   // $FF: synthetic field
   private Client Field3654;

   Class880(Client var1) {
      super();
      this.Field3654 = var1;
      //super();
   }

   public final void run() {
      Client.Method13419(this.Field3654, new Class820("sLoader"));
      String[] var4;
      int var3 = (var4 = Client.Method13420(this.Field3654).Method13685()).length;

      for(int var2 = 0; var2 < var3; ++var2) {
         String var1 = var4[var2];

         try {
            Path var7;
            byte[] var5 = Files.readAllBytes(var7 = Paths.get(var1));
            Client.Method13421(this.Field3654).add(new Class610(var7.getFileName().toString(), 1, var5));
         } catch (IOException var6) {
            var6.printStackTrace();
         }
      }

      Client.Method13420(this.Field3654).Method13683();
      Client.Method13420(this.Field3654).setVisible(false);
      Client.Method13419(this.Field3654, (Class820)null);
   }
}
