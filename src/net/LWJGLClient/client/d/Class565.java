package net.LWJGLClient.client.d;

import net.LWJGLClient.client.b.b.f.Class843;
import net.LWJGLClient.client.b.b.GraphicsDisplay;
import net.LWJGLClient.client.model.Client;

public final class Class565 {
   public static int Field491 = 15000;
   private double[] Field492 = null;
   private long Field493 = 0L;
   private int Field494 = -1;
   private double Field495;
   private double Field496;
   private double Field497;
   private double Field498;
   private double Field499;
   private int Field500;
   private int Field501;
   private Client Field502;
   private int[] Field503;
   public int Field504;
   public int Field505;
   public int Field506;

   private void Method8803(int var1, int var2, int var3, boolean var4, int[] var5) {
      this.Field504 = var1;
      this.Field505 = var2;
      this.Field506 = 0;
      this.Field503 = var5;
      this.Method8807();
   }

   public Class565(Client var1) {
      this.Field502 = var1;
      this.Field493 = System.currentTimeMillis() - (long)Field491 + 500L;
   }

   public final void Method8804(double var1) {
      ++this.Field500;
      boolean var3 = !Client.Field12272 && !Client.Field12593;
      if (this.Field493 != 0L && System.currentTimeMillis() - this.Field493 > (long)Field491 && var3) {
         if (!Client.Field12593 && GraphicsDisplay.Field2678 && GraphicsDisplay.Field2667) {
            Client.Field12271 = true;
            Class843.Method14008();
         }

         int var20 = this.Field494;

         int var21;
         for(var21 = var20; var21 == var20; var21 = (int)(Math.random() * 10000.0D) % 3) {
            ;
         }

         this.Field494 = var21;
         this.Field493 = 0L;
         switch(var21) {
         case 0:
            this.Method8803(401, 424, 0, false, new int[]{6711, 5920, -1901, 2032, 383, -1, 6597, 7213, -665, 2034, 128, -1, 6454, 8791, -715, 1983, 133, -1, 6452, 9108, -1017, 1951, 208, -1, 6131, 10220, -1420, 1794, 288, -1, 6135, 11541, -1420, 1277, 288, -1, 7432, 11543, -1420, 772, 288, -1, 7440, 10224, -1420, 256, 288, -1});
            break;
         case 1:
            int[] var10005 = new int[]{7963, 6612, -425, 500, 128, -1, 6431, 6612, -1073, 500, 128, -1, 5792, 6612, -1145, 500, 128, -1, 5792, 6612, -1145, 500, 128, -1, 4500, 6612, -950, 500, 128, -1, 2750, 6568, -1500, 556, 128, -1, 2750, 6568, -1500, 2900, 150, 0};
            boolean var11 = true;
            var10005[41] = -3;
            this.Method8803(375, 422, 0, false, var10005);
            break;
         case 2:
            this.Method8803(385, 427, 0, false, new int[]{2750, 6568, -1200, 2900, 150, -1, 2750, 6568, -1200, 556, 128, -1, 4500, 6612, -1250, 500, 128, -1, 5792, 6612, -1445, 500, 128, -1, 5792, 6612, -1445, 500, 128, -1, 6431, 6612, -1273, 500, 128, -1, 7963, 6612, -1225, 500, 128, -1, 8963, 6612, -1225, 500, 128, -1});
         }

         this.Method8807();
         this.Field502.Method13226(this.Field504, this.Field505);
         this.Field502.Method13227(1);
      } else if (this.Field503 != null) {
         if (this.Field502.Field12168 == this.Field504 && this.Field502.Field12169 == this.Field505) {
            if (this.Field498 < 0.0D) {
               this.Field498 += 2048.0D;
            } else if (this.Field498 > 2048.0D) {
               this.Field498 -= 2048.0D;
            }

            if (this.Field499 < 0.0D) {
               this.Field499 += 2048.0D;
            } else if (this.Field499 > 2048.0D) {
               this.Field499 -= 2048.0D;
            }

            if (this.Field492 == null && this.Field493 == 0L && this.Field501 + 1 <= this.Field503.length) {
               if (this.Field501 == 0) {
                  this.Field495 = (double)this.Field503[0 + this.Field501];
                  this.Field496 = (double)this.Field503[1 + this.Field501];
                  this.Field497 = (double)this.Field503[2 + this.Field501];
                  this.Field498 = (double)this.Field503[3 + this.Field501];
                  this.Field499 = (double)this.Field503[4 + this.Field501];
                  this.Field501 += 6;
                  this.Method8806();
                  return;
               }

               double[] var17;
               double[] var10000 = var17 = new double[5];
               double var15 = (double)this.Field503[0 + this.Field501];
               double var10003 = this.Field495;
               var10000[0] = -(this.Field495 - var15);
               var15 = (double)this.Field503[1 + this.Field501];
               var10003 = this.Field496;
               var17[1] = -(this.Field496 - var15);
               var15 = (double)this.Field503[2 + this.Field501];
               var10003 = this.Field497;
               var17[2] = -(this.Field497 - var15);
               var15 = (double)this.Field503[3 + this.Field501];
               var10003 = this.Field498;
               var17[3] = -(this.Field498 - var15);
               var15 = (double)this.Field503[4 + this.Field501];
               var10003 = this.Field499;
               var17[4] = -(this.Field499 - var15);
               double var5 = 500.0D;
               if (this.Field492 != null) {
                  double[] var19 = var17;
                  double[] var4 = this.Field492;
                  double var10 = 0.0D;

                  for(int var6 = 0; var6 < var4.length; ++var6) {
                     var10 += var4[var6] * var4[var6] - var19[var6] + var19[var6];
                  }

                  var5 = Math.sqrt(var10);
               }

               this.Field492 = var17;

               for(int var18 = 0; var18 < this.Field492.length; ++var18) {
                  this.Field492[var18] /= var5;
               }
            }

            if (this.Field492 != null) {
               this.Field495 += this.Field492[0] * var1;
               this.Field496 += this.Field492[1] * var1;
               this.Field497 += this.Field492[2] * var1;
               this.Field498 += this.Field492[3] * var1;
               this.Field499 += this.Field492[4] * var1;
               this.Method8806();
            }

            Client.Field12567 = (this.Field504 - 6 << 3) + 52;
            Client.Field12568 = (this.Field505 - 6 << 3) + 52;
            if (this.Field501 < this.Field503.length) {
               if (Method8805(this.Field495, (double)this.Field503[0 + this.Field501], 50) && Method8805(this.Field496, (double)this.Field503[1 + this.Field501], 50) && Method8805(this.Field497, (double)this.Field503[2 + this.Field501], 50)) {
                  this.Field492 = null;
                  this.Field501 += 6;
                  if (this.Field501 - 6 >= this.Field503.length) {
                     this.Field501 = 0;
                     return;
                  }
               }
            } else if (this.Field493 == 0L) {
               this.Field493 = System.currentTimeMillis();
            }

         } else {
            this.Method8807();
            this.Field502.Method13226(this.Field504, this.Field505);
         }
      }
   }

   private static boolean Method8805(double var0, double var2, int var4) {
      int var5 = (int)(Math.round(var0) / 50L) * 50;
      int var1 = (int)(Math.round(var2) / 50L) * 50;
      return var5 == var1;
   }

   private void Method8806() {
      Client.Field12341 = (int)Math.round(this.Field495);
      Client.Field12343 = (int)Math.round(this.Field496);
      Client.Field12342 = (int)Math.round(this.Field497);
      Client.Field12345 = (int)Math.round(this.Field498);
      Client.Field12344 = (int)Math.round(this.Field499);
   }

   private void Method8807() {
      this.Field501 = 0;
      this.Field500 = 0;
      if (this.Field503 != null) {
         if (this.Field503.length >= 6) {
            this.Field495 = (double)this.Field503[0];
            this.Field496 = (double)this.Field503[1];
            this.Field497 = (double)this.Field503[2];
            this.Field498 = (double)(this.Field503[3] & 2047);
            this.Field499 = (double)(this.Field503[4] & 2047);
            this.Method8806();
         }
      }
   }
}
