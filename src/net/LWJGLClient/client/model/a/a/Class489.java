package net.LWJGLClient.client.model.a.a;

import net.LWJGLClient.client.a.a.Class511;
import net.LWJGLClient.client.a.a.Class518;
import net.LWJGLClient.client.a.a.SpotAnim;
import net.LWJGLClient.client.b.b.GraphicsDisplay;
import net.LWJGLClient.client.model.Model;

public final class Class489 extends Class511 {
   private int Field625;
   public final long Field626;
   private static int Field627 = 0;
   private int Field628 = 0;
   public final int Field629;
   public final int Field630;
   private double Field631;
   private double Field632;
   private double Field633;
   private double Field634;
   private double Field635;
   private boolean Field636;
   private int Field637;
   private int Field638;
   private final int Field639;
   public final int Field640;
   public double Field641;
   public double Field642;
   public double Field643;
   private final int Field644;
   private final int Field645;
   public final int Field646;
   private final SpotAnim Field647;
   private int Field648;
   private double Field649;
   public int Field650;
   private double Field651;
   public final int Field652;
   public boolean Field653 = false;

   public final void Method8094(int var1, int var2, int var3, int var4) {
      double var5;
      if (!this.Field636) {
         var5 = (double)(var4 - this.Field637);
         double var7 = (double)(var2 - this.Field638);
         double var9 = Math.sqrt(var5 * var5 + var7 * var7);
         this.Field641 = (double)this.Field637 + var5 * (double)this.Field645 / var9;
         this.Field642 = (double)this.Field638 + var7 * (double)this.Field645 / var9;
         this.Field643 = (double)this.Field639;
      }

      var5 = (double)(this.Field630 + 1 - var1);
      this.Field631 = ((double)var4 - this.Field641) / var5;
      this.Field632 = ((double)var2 - this.Field642) / var5;
      this.Field633 = Math.sqrt(this.Field631 * this.Field631 + this.Field632 * this.Field632);
      if (!this.Field636) {
         this.Field634 = -this.Field633 * Math.tan((double)this.Field644 * 0.02454369D);
      }

      this.Field635 = 2.0D * ((double)var3 - this.Field643 - this.Field634 * var5) / (var5 * var5);
   }

   public final Model getModel(int var1) {
      if (this.Field647 == null) {
         return null;
      } else {
         Model var2;
         if ((var2 = this.Field647.Method8315()) == null) {
            return null;
         } else {
            if (this.Field647.Field10098 != null) {
               int var3 = this.Field647.Field10098.frame2IDS[this.Field648];
               int var4;
               if ((var4 = this.Field648 + 1) < this.Field647.Field10098.frame2IDS.length) {
                  var4 = this.Field647.Field10098.frame2IDS[var4];
               } else {
                  var4 = this.Field647.Field10098.frame2IDS[0];
               }

               int var5 = this.Field647.Field10098.Field10144[this.Field648];
               var2 = Model.Method14483(var2, this.Field637, this.Field638, this.Field626, this.Field653 ? 4 : 6);
               if (var4 != -1 && var3 != -1) {
                  var2.Method14522(var3, var4, var5, (int)this.Field649, var1, true);
               } else {
                  var2.Method14520(var3, var1, true);
               }
            } else {
               var2 = new Model(true, false, Class518.Method8352(-1), false, var2, 10);
            }

            if (this.Field628 != 1197 && this.Field628 != 1198) {
               if (GraphicsDisplay.Field2678 && GraphicsDisplay.Field2667) {
                  this.Field10116 = this.Field651;
               } else {
                  var2.Method14491((int)Math.round(this.Field651) % 2048);
               }
            }

            var2.Field2753 = true;
            var2.Field2754 = 2500;
            return var2;
         }
      }
   }

   public final void Method14494(int var1, int var2) {
      this.Field637 -= var1 << 7;
      this.Field638 -= var2 << 7;
      this.Field641 -= (double)(var1 << 7);
      this.Field642 -= (double)(var2 << 7);
   }

   public Class489(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
      this.Field625 = Field627++;
      if (Field627 > 256) {
         Field627 = 1;
      }

      this.Field636 = false;
      if (var11 < SpotAnim.Field10094.length) {
         this.Field647 = SpotAnim.Field10094[var11];
      } else {
         this.Field647 = null;
      }

      this.Field652 = var6;
      this.Field637 = var9;
      this.Field638 = var8;
      this.Field639 = var7;
      this.Field629 = var3;
      this.Field630 = var4;
      this.Field644 = var1;
      this.Field645 = var5;
      this.Field646 = var10;
      this.Field640 = var2;
      this.Field636 = false;
      this.Field628 = var11;
      long var12 = (long)(var9 >> 7);
      long var14 = (long)(var8 >> 7);
      this.Field626 = 2251816993554432L + ((long)this.Field625 << 32) + ((long)var11 << 14) + (var14 << 7) + var12;
   }

   public final void Method8099(double var1) {
      this.Field636 = true;
      this.Field641 += this.Field631 * var1;
      this.Field642 += this.Field632 * var1;
      this.Field643 += this.Field634 * var1 + 0.5D * this.Field635 * var1 * var1;
      this.Field634 += this.Field635 * var1;
      this.Field650 = (int)(Math.atan2(this.Field631, this.Field632) * 325.949D) + 1024 & 2047;
      double var3;
      if ((var3 = (double)((int)(Math.atan2(this.Field634, this.Field633) * 325.949D) & 2047)) >= 1792.0D) {
         var3 = (double)((int)(var3 + 16.0D));
      }

      this.Field651 = var3;
      if (this.Field647 != null && this.Field647.Field10098 != null) {
         this.Field649 += var1;

         while(true) {
            do {
               do {
                  if (this.Field649 <= this.Field647.Field10098.Method8283(this.Field648)) {
                     return;
                  }

                  this.Field649 -= this.Field647.Field10098.Method8283(this.Field648) + 1.0D;
                  ++this.Field648;
               } while(this.Field648 < this.Field647.Field10098.Field10141);
            } while(this.Field648 >= 0 && this.Field648 < this.Field647.Field10098.Field10141);

            this.Field648 = 0;
         }
      }
   }
}
