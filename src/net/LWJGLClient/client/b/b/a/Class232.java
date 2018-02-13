package net.LWJGLClient.client.b.b.a;

import net.LWJGLClient.client.b.Rasterizer;
import net.LWJGLClient.client.b.b.b.a.Texture;
import net.LWJGLClient.client.b.b.f.Class843;
import net.LWJGLClient.client.a.d.Class120;

public final class Class232 {
   private static boolean[] Field3087;
   private static boolean[] Field3088;
   private static boolean[] Field3089;

   static {
      Field3087 = new boolean[Rasterizer.Field9950];
      Field3088 = new boolean[Rasterizer.Field9950];
      Field3089 = new boolean[Rasterizer.Field9950];

      for(int var0 = 0; var0 < Field3087.length; ++var0) {
         if (var0 >= 1321 && var0 <= 1326 || var0 >= 937 && var0 <= 945 || var0 == 50 || var0 == 45) {
            Field3087[var0] = true;
         }

         boolean var1 = false;
         boolean var2 = false;
         if (var0 <= 50) {
            var1 = true;
         } else if (var0 >= 962 && var0 <= 964) {
            var1 = true;
         } else if (var0 >= 937 && var0 <= 945) {
            var1 = true;
         } else if (var0 >= 933 && var0 <= 935) {
            var1 = true;
         } else if (var0 >= 1348 && var0 <= 1351) {
            var1 = true;
         } else if (var0 >= 1314 && var0 <= 1316) {
            var1 = true;
         } else if (var0 >= 1321 && var0 <= 1326) {
            var1 = true;
            var2 = true;
         } else if (var0 == 922) {
            var1 = true;
         }

         Field3088[var0] = var1;
         Field3089[var0] = var2;
      }

   }

   public static void Method2623(float[][] var0, float[] var1, float[] var2, float[] var3, int[] var4, int[] var5, int[] var6, int[] var7, int[] var8, int[][] var9, int[] var10, int[] var11, int[] var12, int[] var13, int[] var14, int[] var15, int var16, int var17, int var18, float var19, int var20) {
      int[] var41 = var9[var16];

      for(var16 = 0; var16 < var17 && var16 < var41.length; ++var16) {
         int var21 = var41[var16];
         int var22 = var13 != null ? 256 - var13[var21] : 256;
         int var23 = var14 == null ? 0 : var14[var21] & 3;
         float var24 = var1[var4[var21]] * var19;
         float var25 = ((float)var18 - var2[var4[var21]]) * var19;
         float var26 = var3[var4[var21]] * var19;
         float var27 = var1[var5[var21]] * var19;
         float var28 = ((float)var18 - var2[var5[var21]]) * var19;
         float var29 = var3[var5[var21]] * var19;
         float var30 = var1[var6[var21]] * var19;
         float var31 = ((float)var18 - var2[var6[var21]]) * var19;
         float var32 = var3[var6[var21]] * var19;
         int var33;
         int var34;
         int var35;
         if (var23 == 1) {
            var33 = var34 = var35 = var7[var21] & '\uffff';
         } else {
            var33 = var10[var21] & '\uffff';
            var34 = var11[var21] & '\uffff';
            var35 = var12[var21] & '\uffff';
         }

         boolean var36 = false;
         int var37 = var8 != null ? var8[var21] : -1;
         boolean var38 = false;
         if ((var7[var21] <= 50 || var15 != null && var21 < var15.length && var15[var21] != -1) && var37 == 0 && var7[var21] <= 50 && var8 == null) {
            var37 = var7[var21];
            var38 = true;
         }

         if (var37 <= 0 && var7[var21] <= 50 && var23 != 0) {
            var37 = var7[var21];
         }

         Class120 var43 = null;
         if (var37 >= Class120.Field9548.length) {
            var37 = -1;
         }

         if (var37 > 0) {
            var43 = Class120.Field9548[var37];
         }

         if (var37 >= 0) {
            var36 = Texture.Field1929[var37] || var37 <= 50;
         }

         if (var43 != null && var43.Field9529 && var37 > 0) {
            var36 = true;
            if (var37 != 922) {
               var38 = true;
            }
         }

         if (var37 >= 0 && !var36 && !Rasterizer.Field9947 && !Texture.Field1929[var37]) {
            var38 = false;
            var37 = -1;
         }

         if (var37 == 922) {
            var22 = 220;
         }

         if (var38) {
            var35 = 65535;
            var34 = 65535;
            var33 = 65535;
         }

         if (var0 != null && var37 > 0) {
            float var44 = var0[var21][0];
            float var45 = var0[var21][1];
            float var46 = var0[var21][2];
            float var39 = var0[var21][3];
            float var40 = var0[var21][4];
            float var42 = var0[var21][5];
            Class843.Method14024(var37, var24, var27, var30, var25, var28, var31, var26, var29, var32, var33, var34, var35, var22, var44, var46, var40, var45, var39, var42, var20);
         } else {
            Class843.Method14023(var24, var27, var30, var25, var28, var31, var26, var29, var32, var33, var34, var35, var22, var20);
         }
      }

   }
}
