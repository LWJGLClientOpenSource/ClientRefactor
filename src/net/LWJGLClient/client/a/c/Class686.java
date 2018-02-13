package net.LWJGLClient.client.a.c;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.HashMap;
import java.util.Map;
import net.LWJGLClient.client.Signlink;
import net.LWJGLClient.client.model.Client;

public final class Class686 {
   private Map Field10717 = new HashMap();
   private Map Field10718 = new HashMap();

   public Class686() {
      if (!Client.normalMem) {
         this.Method11896();
         this.Method11897();
      }

   }

   public final int Method11895(int var1) {
      Integer var2;
      return (var2 = (Integer)this.Field10717.get(var1)) != null && var2 >= 0 ? var2 : var1;
   }

   private void Method11896() {
      this.Field10717.clear();
      RandomAccessFile var1 = null;

      try {
         var1 = new RandomAccessFile(Signlink.Method11828(false) + "/npc_mapping.dat", "r");

         while(true) {
            short var2;
            short var3;
            do {
               var2 = var1.readShort();
            } while((var3 = var1.readShort()) < 0);

            this.Field10717.put(Integer.valueOf(var2), Integer.valueOf(var3));
         }
      } catch (IOException var5) {
         var5.printStackTrace();
         if (var1 != null) {
            try {
               var1.close();
               return;
            } catch (Exception var4) {
               var4.printStackTrace();
            }
         }

      }
   }

   private void Method11897() {
      try {
         RandomAccessFile var1 = new RandomAccessFile(Signlink.Method11828(false) + "/item_mapping.dat", "r");

         while(var1.getFilePointer() < var1.length()) {
            short var2 = var1.readShort();
            short var3;
            if ((var3 = var1.readShort()) >= 0) {
               this.Field10718.put(Integer.valueOf(var2), Integer.valueOf(var3));
            }
         }

         var1.close();
      } catch (IOException var4) {
         var4.printStackTrace();
      }
   }
}
