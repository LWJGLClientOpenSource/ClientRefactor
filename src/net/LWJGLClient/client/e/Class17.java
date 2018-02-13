package net.LWJGLClient.client.e;

import java.util.Locale;

public class Class17 {
   private long Field8563 = System.nanoTime();
   private static Class25 Field8564;

   public final void Method194(double var1, int var3) {
      double var4 = (double)(System.nanoTime() - this.Field8563);
      double var6;
      double var8;
      long var10 = (long)((var8 = (var6 = 1.0E9D / var1) - var4) / 1000000.0D);
      var8 -= (double)(var10 * 1000000L);
      if (var10 < 1L) {
         this.Field8563 = System.nanoTime();
      } else {
         if (var10 > 100L) {
            var10 = 100L;
            var8 = 0.0D;
         }

         try {
            Thread.sleep(var10, (int)var8);
         } catch (Exception var12) {
            var12.printStackTrace();
         }

         this.Field8563 = System.nanoTime();
      }
   }

   public static Class25 Method195() {
      if (Field8564 == null) {
         String var0;
         if ((var0 = System.getProperty("os.name", "generic").toLowerCase(Locale.ENGLISH)).indexOf("mac") < 0 && var0.indexOf("darwin") < 0) {
            if (var0.indexOf("win") >= 0) {
               Field8564 = Class25.Field8568;
            } else if (var0.indexOf("nux") >= 0) {
               Field8564 = Class25.Field8570;
            } else {
               Field8564 = Class25.Field8571;
            }
         } else {
            Field8564 = Class25.Field8569;
         }
      }

      return Field8564;
   }

   public static boolean Method196() {
      return Method195() == Class25.Field8570;
   }
}
