package net.LWJGLClient.client.b.b.c;

import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

import net.LWJGLClient.client.b.b.b.Class745;
import net.LWJGLClient.client.Signlink;

public final class Class418 {
   private static ZipFile Field3232 = null;
   private static Map Field3233 = new HashMap();

   public static String Method7394(String var0) {
      try {
         if (Field3233.size() <= 0) {
            try {
               String var1 = Signlink.Method11830() + "emps-world-client.jar";
               if (Field3232 == null) {
                  Field3232 = new ZipFile(var1);
               }

               String[] var3 = Class745.Field3313;

               for(int var2 = 0; var2 < 8; ++var2) {
                  var1 = var3[var2];
                  Field3233.put(var1, ShaderUtils.Method7393(Method7395(var1)));
               }

               Field3232.close();
               Field3232 = null;
            } catch (IOException var4) {
               var4.printStackTrace();
            }
         }
      } catch (Exception var5) {
         var5.printStackTrace();
         return null;
      }

      return (String)Field3233.get(var0);
   }

   private static InputStream Method7395(String var0) {
      try {
         Enumeration var1 = Field3232.entries();

         while(var1.hasMoreElements()) {
            ZipEntry var2;
            if ((var2 = (ZipEntry)var1.nextElement()) != null && !var2.isDirectory() && var2.getName().equals(var0)) {
               return Field3232.getInputStream(var2);
            }
         }
      } catch (IOException var3) {
         var3.printStackTrace();
      }

      System.out.println("[ShaderLoader]: not found: " + var0);
      return null;
   }
}
