package net.LWJGLClient.client.b.b.b.a;

import net.LWJGLClient.client.b.Rasterizer;

public final class Texture {
   private static boolean[] Field1928;
   public static boolean[] Field1929;
   public static boolean[] Field1930;
   public static boolean[] Field1931;
   public static boolean[] Field1932;

   static {
      Field1928 = new boolean[Rasterizer.Field9950];
      Field1929 = new boolean[Rasterizer.Field9950];
      Field1930 = new boolean[Rasterizer.Field9950];
      Field1931 = new boolean[Rasterizer.Field9950];
      Field1932 = new boolean[Rasterizer.Field9950];
      Field1931[17] = true;
      Field1931[40] = true;
      Field1931[34] = true;
      Field1931[824] = true;
      Field1931[1109] = true;

      for(int var0 = 0; var0 < Field1928.length; ++var0) {
         boolean var1 = false;
         boolean var2 = false;
         if (var0 >= 1321 && var0 <= 1326 || var0 >= 937 && var0 <= 945 || var0 == 50 || var0 == 45) {
            Field1928[var0] = true;
            Field1932[var0] = true;
            var1 = true;
         }

         if ((var0 < 930 || var0 > 967) && var0 != 1110 && (var0 > 50 || var0 == 26 || var0 == 15 || var0 == 39 || var0 == 10) && (var0 < 1170 || var0 > 1173) && (var0 < 1314 || var0 > 1316) && (var0 < 1326 || var0 > 1339) && (var0 < 1348 || var0 > 1354)) {
            if (var0 >= 1348 && var0 <= 1351) {
               var1 = true;
            } else if (var0 >= 1314 && var0 <= 1316) {
               var1 = true;
            } else if (var0 != 375 && var0 != 377 && var0 != 824 && var0 != 555 && var0 != 565) {
               if (var0 != 77 && var0 != 78) {
                  if (var0 == 922) {
                     var1 = true;
                  }
               } else {
                  var2 = true;
               }
            } else {
               var2 = true;
            }
         } else {
            var1 = true;
            Field1932[var0] = true;
         }

         Field1929[var0] = var1;
         Field1930[var0] = var2;
      }

   }
}
