package net.LWJGLClient.client.c.b;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.URL;
import java.net.URLConnection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import net.LWJGLClient.client.Signlink;
import net.LWJGLClient.client.model.Client;

public final class Class281 {
   private final String Field2343;
   private final String Field2344;
   private List Field2345 = new LinkedList();

   public Class281(String var1, String var2) {
      this.Field2343 = var1;
      this.Field2344 = var2.replace("data/", "");
      boolean var10000 = Client.Field12085;
      var1.replace("http://", "https://");
      this.Field2345.add(new Class277());
   }

   private static void Method3010(int var0) {
      try {
         Thread.sleep((long)(500 + var0 * 1000));
      } catch (InterruptedException var1) {
         var1.printStackTrace();
      }
   }

   public final void Method3011(String var1, int var2) {
      try {
         byte[] var6;
         if ((var6 = this.Method3014(var1, var2)) != null) {
            try {
               RandomAccessFile var5;
               (var5 = new RandomAccessFile(Signlink.cacheDirectory() + "/" + var1, "rw")).write(var6);
               var5.close();
               return;
            } catch (IOException var3) {
               var3.printStackTrace();
               return;
            }
         }
      } catch (FileNotFoundException var4) {
         var4.printStackTrace();
      }

   }

   public final byte[] Method3012(int var1, int var2, int var3) {
      return this.Method3015(var1 + "/" + var2, var3);
   }

   public final int Method3013(int var1) {
      URLConnection var3;
      try {
         var3 = Class277.Method2979(new URL(this.Field2343 + "/0/" + var1), 3);
      } catch (IOException var2) {
         var2.printStackTrace();
         return -1;
      }

      return var3.getContentLength();
   }

   private byte[] Method3014(String var1, int var2) {
      for(int var3 = 0; var3 < var2; ++var3) {
         try {
            Iterator var4;
            if ((var4 = this.Field2345.iterator()).hasNext()) {
               Class274 var8;
               synchronized(var8 = (Class274)var4.next()) {
                  return var8.Method2981(var1, 0, this.Field2343, 32768);
               }
            }
         } catch (Exception var7) {
            var7.printStackTrace();
         }

         Method3010(var3);
      }

      return null;
   }

   public final byte[] Method3015(String var1, int var2) {
      for(int var3 = 0; var3 < var2; ++var3) {
         try {
            Iterator var4;
            if ((var4 = this.Field2345.iterator()).hasNext()) {
               Class274 var8;
               synchronized(var8 = (Class274)var4.next()) {
                  return var8.Method2982(var1, 0, this.Field2343, 32768);
               }
            }
         } catch (Exception var7) {
            var7.printStackTrace();
         }

         Method3010(var3);
      }

      return null;
   }

   public final byte[] Method3016(String var1, int var2) {
      for(var2 = 0; var2 < 10; ++var2) {
         Iterator var3;
         if ((var3 = this.Field2345.iterator()).hasNext()) {
            Class274 var5;
            synchronized(var5 = (Class274)var3.next()) {
               return var5.Method2982(var1, 0, this.Field2344, 32768);
            }
         }

         Method3010(var2);
      }

      return null;
   }
}
