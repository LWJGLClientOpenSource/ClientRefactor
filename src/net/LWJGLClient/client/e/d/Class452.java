package net.LWJGLClient.client.e.d;

import net.LWJGLClient.client.c.Packet;

public final class Class452 {
   final int[] Field9770 = new int[2];
   private final int[][][] Field9771 = new int[2][2][4];
   private final int[][][] Field9772 = new int[2][2][4];
   private final int[] Field9773 = new int[2];
   private static final float[][] Field9774 = new float[2][8];
   static final int[][] Field9775 = new int[2][8];
   private static float Field9776;
   static int Field9777;

   private float Method7829(int var1, int var2, float var3) {
      float var4 = ((float)this.Field9772[var1][0][var2] + var3 * (float)(this.Field9772[var1][1][var2] - this.Field9772[var1][0][var2])) * 0.001525879F;
      return 1.0F - (float)Math.pow(10.0D, (double)(-var4 / 20.0F));
   }

   private float Method7830(float var1, int var2, int var3) {
      var1 = ((float)this.Field9771[var3][0][var2] + var1 * (float)(this.Field9771[var3][1][var2] - this.Field9771[var3][0][var2])) * 1.220703E-4F;
      return 32.7032F * (float)Math.pow(2.0D, (double)var1) * 3.141593F / 11025.0F;
   }

   public final int Method7831(int var1, float var2) {
      float var3;
      if (var1 == 0) {
         var3 = ((float)this.Field9773[0] + (float)(this.Field9773[1] - this.Field9773[0]) * var2) * 0.003051758F;
         Field9777 = (int)((Field9776 = (float)Math.pow(0.1D, (double)(var3 / 20.0F))) * 65536.0F);
      }

      if (this.Field9770[var1] == 0) {
         return 0;
      } else {
         var3 = this.Method7829(var1, 0, var2);
         Field9774[var1][0] = -2.0F * var3 * (float)Math.cos((double)this.Method7830(var2, 0, var1));
         Field9774[var1][1] = var3 * var3;

         int var7;
         for(var7 = 1; var7 < this.Field9770[var1]; ++var7) {
            float var4 = this.Method7829(var1, var7, var2);
            float var5 = -2.0F * var4 * (float)Math.cos((double)this.Method7830(var2, var7, var1));
            var4 *= var4;
            Field9774[var1][(var7 << 1) + 1] = Field9774[var1][(var7 << 1) - 1] * var4;
            Field9774[var1][var7 << 1] = Field9774[var1][(var7 << 1) - 1] * var5 + Field9774[var1][(var7 << 1) - 2] * var4;

            for(int var6 = (var7 << 1) - 1; var6 >= 2; --var6) {
               Field9774[var1][var6] += Field9774[var1][var6 - 1] * var5 + Field9774[var1][var6 - 2] * var4;
            }

            Field9774[var1][1] += Field9774[var1][0] * var5 + var4;
            Field9774[var1][0] += var5;
         }

         if (var1 == 0) {
            for(var7 = 0; var7 < this.Field9770[0] << 1; ++var7) {
               Field9774[0][var7] *= Field9776;
            }
         }

         for(var7 = 0; var7 < this.Field9770[var1] << 1; ++var7) {
            Field9775[var1][var7] = (int)(Field9774[var1][var7] * 65536.0F);
         }

         return this.Field9770[var1] << 1;
      }
   }

   public final void Method7832(Packet var1, Class441 var2) {
      int var3 = var1.g1();
      this.Field9770[0] = var3 >> 4;
      this.Field9770[1] = var3 & 15;
      if (var3 == 0) {
         this.Field9773[0] = this.Field9773[1] = 0;
      } else {
         this.Field9773[0] = var1.g2();
         this.Field9773[1] = var1.g2();
         var3 = var1.g1();
         int var4 = 0;

         while(true) {
            int var5;
            if (var4 >= 2) {
               for(var4 = 0; var4 < 2; ++var4) {
                  for(var5 = 0; var5 < this.Field9770[var4]; ++var5) {
                     if ((var3 & 1 << (var4 << 2) << var5) != 0) {
                        this.Field9771[var4][1][var5] = var1.g2();
                        this.Field9772[var4][1][var5] = var1.g2();
                     } else {
                        this.Field9771[var4][1][var5] = this.Field9771[var4][0][var5];
                        this.Field9772[var4][1][var5] = this.Field9772[var4][0][var5];
                     }
                  }
               }

               if (var3 != 0 || this.Field9773[1] != this.Field9773[0]) {
                  var2.Method7785(var1);
                  return;
               }
               break;
            }

            for(var5 = 0; var5 < this.Field9770[var4]; ++var5) {
               this.Field9771[var4][0][var5] = var1.g2();
               this.Field9772[var4][0][var5] = var1.g2();
            }

            ++var4;
         }
      }

   }
}
