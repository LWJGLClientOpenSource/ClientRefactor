package net.LWJGLClient.client.e;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.lang.management.ManagementFactory;

import net.LWJGLClient.client.Signlink;

public final class Class16 {
   private static boolean Field8565 = false;

   private static long Method192() {
      String var0;
      if ((var0 = ManagementFactory.getRuntimeMXBean().getName()) != null && var0.length() > 0) {
         try {
            return Long.parseLong(var0.split("@")[0]);
         } catch (Exception var1) {
            return 0L;
         }
      } else {
         return 0L;
      }
   }

   public static boolean Method193() {
      if (Field8565) {
         return true;
      } else {
         String var0 = Signlink.Method11830() + "/console/";
         File var1;
         if (!(var1 = new File(var0)).exists()) {
            var1.mkdirs();
         }

         try {
            long var2 = Method192();
            System.setOut(new PrintStream(new FileOutputStream(var0 + "emps-out-" + var2 + ".txt")));
            System.setErr(new PrintStream(new FileOutputStream(var0 + "emps-err-" + var2 + ".txt")));
            Field8565 = true;
            return true;
         } catch (FileNotFoundException var4) {
            var4.printStackTrace();
            return false;
         }
      }
   }
}
