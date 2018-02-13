package net.LWJGLClient.client.a.a;

import net.LWJGLClient.client.model.Model;
import net.LWJGLClient.client.model.c.Class171;
import net.LWJGLClient.client.e.d.Class445;
import net.LWJGLClient.client.model.Client;

public class Class511 extends Class171 {
   private static final float[] Field10112 = new float[]{0.0F, 1.0F, 1.0F, 1.0F, 0.0F, -1.0F, -1.0F, -1.0F};
   private static final float[] Field10113 = new float[]{1.0F, 1.0F, 0.0F, -1.0F, -1.0F, -1.0F, 0.0F, 1.0F};
   public boolean Field10114 = false;
   private double Field10115 = 0.0D;
   public double Field10116 = 0.0D;
   public double Field10117 = 0.0D;

   protected int Field10118 = 0;
   protected int Field10119 = 0;
   protected int Field10120 = 0;

   protected float Field10121 = 0.0F;
   protected float Field10122 = 0.0F;
   protected float Field10123 = 0.0F;
   protected float Field10124 = 0.0F;

   public boolean Field10125 = false;
   public Class445[] Field10126;
   public int Field10127 = 1000;
   public int Field10128;

   public void Method14515(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, long var14, int var16, int var17) {
      if (!this.Field10114) {
         try {
            Model var18;
            if ((var18 = this.Method8306(var17, var1, var2, var14)) != null) {
               this.Field10127 = var18.Field10127;
               this.Field10128 = var18.Field2846;
               var18.Method14516(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var16, var17, true);
               return;
            }
         } catch (Exception var19) {
            var19.printStackTrace();
         }

      }
   }

   public static double Method8268(double var0) {
      double var2 = 15.0D * Client.Field12427;
      if (var0 > var2) {
         return var2;
      } else {
         return var0 < -var2 ? -var2 : var0;
      }
   }

   public final void Method8269(int var1, int var2, int var3, int var4, int var5) {
      int var10001 = var1;
      boolean var44 = false;
      int var6 = var5;
      var5 = var4;
      var4 = var3;
      var3 = var2;
      var2 = var10001;
      if (Client.Field12428 != null && Client.Field12428.Field940 != null) {
         if (this.Field10128 >= this.Field10127 && this.Field10127 > 0 || var5 >= 2) {
            if (var5 >= 2) {
               var2 += var5 / 2;
               var3 += var5 / 2;
               var5 = 1;
            }

            this.Field10115 = 0.5D;
            if (var2 >= var5 && var3 >= var5 && var2 <= 104 - var5 && var3 <= 104 - var5) {
               int[][][] var7 = Client.Field12428.Field940;
               int var8 = ((var6 = (var6 + 128 >> 8) % 8) + 2) % 8;
               int var9 = (int)(Field10112[var6] * (float)var5);
               var6 = (int)(Field10113[var6] * (float)var5);
               int var10 = (int)(Field10112[var8] * (float)var5);
               var8 = (int)(Field10113[var8] * (float)var5);
               double var20 = (double)(var5 << 8);
               var5 = var7[var4][var2 - var9][var3 - var6];
               var6 = var7[var4][var2 + var9][var3 + var6];
               var9 = var7[var4][var2 - var10][var3 - var8];
               var2 = var7[var4][var2 + var10][var3 + var8];
               double var26 = (double)(var5 - var6);
               double var28 = (double)(var9 - var2);
               double var30 = Math.atan(var26 / var20);
               double var32 = Math.atan(var28 / var20);
               double var34 = var30 * 180.0D / 3.141592653589793D;
               double var36 = var32 * 180.0D / 3.141592653589793D;
               var2 = (int)(var34 * 2048.0D / 360.0D * this.Field10115);
               var3 = (int)(-var36 * 2048.0D / 360.0D * this.Field10115);
               double var40 = Method8268(this.Field10116 - (double)var2);
               double var42 = Method8268(this.Field10117 - (double)var3);
               this.Field10116 -= var40;
               this.Field10117 -= var42;
            }
         }

      }
   }

   public final void Method8270(int var1, int var2, int var3, int var4, int var5, int var6) {
      this.Field10118 = var5;
      this.Field10119 = var6;
      this.Field10121 = (float)var1;
      this.Field10122 = (float)var2;
      this.Field10123 = (float)var3;
      this.Field10124 = (float)var4;
      this.Field10125 = true;
   }

   public Model Method8306(int var1, int var2, int var3, long var4) {
      return this.getModel(var1);
   }

   public Model getModel(int var1) {
      return null;
   }
}
