package net.LWJGLClient.client.model.a.a;

import net.LWJGLClient.client.a.a.SpotAnim;
import net.LWJGLClient.client.model.Model;
import net.LWJGLClient.client.a.a.Class511;

public final class Class490 extends Class511 {
   private int Field250;
   public final long Field251;
   private static int Field252 = 1;
   private int Field253 = 0;
   public final int Field254;
   public int Field255;
   public int Field256;
   public final int Field257;
   public final int Field258;
   public boolean Field259;
   private final SpotAnim Field260;
   private int Field261;
   private double Field262;
   public boolean Field263 = false;

   public Class490(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      this.Field250 = Field252++;
      if (Field252 > 256) {
         Field252 = 1;
      }

      this.Field259 = false;
      this.Field260 = SpotAnim.Field10094[var4];
      this.Field254 = var1;
      this.Field255 = var7;
      this.Field256 = var6;
      this.Field257 = var5;
      this.Field258 = var2 + var3;
      long var8 = (long)(var7 >> 7);
      long var10 = (long)(var6 >> 7);
      this.Field251 = 1125934266580992L + ((long)this.Field250 << 32) + ((long)var4 << 14) + (var10 << 7) + var8;
   }

   public final Model getModel(int var1) {
      if (this.Field260 == null) {
         return null;
      } else {
         Model var2;
         if ((var2 = this.Field260.Method8315()) != null && this.Field260.Field10098 != null && this.Field260.Field10098.frame2IDS != null) {
            int var3 = this.Field260.Field10098.frame2IDS[this.Field261];
            if ((var2 = Model.Method14483(var2, this.Field255 >> 7, this.Field256 >> 7, this.Field251, this.Field263 ? 4 : 5)).Field2750) {
               if (var3 == this.Field253) {
                  var2.Field2750 = false;
               }

               this.Field253 = var3;
            }

            if (!this.Field259) {
               var2.Method14520(var3, var1, true);
            }

            if (this.Field260.Field10104 != 0) {
               if (this.Field260.Field10104 == 90) {
                  var2.Method14487();
               }

               if (this.Field260.Field10104 == 180) {
                  var2.Method14487();
                  var2.Method14487();
               }

               if (this.Field260.Field10104 == 270) {
                  var2.Method14487();
                  var2.Method14487();
                  var2.Method14487();
               }
            }

            var2.Field2753 = true;
            var2.Field2754 = 2500;
            return var2;
         } else {
            return null;
         }
      }
   }

   public final void Method8099(double var1) {
      if (this.Field260 != null && this.Field260.Field10098 != null) {
         this.Field262 += var1;

         while(true) {
            do {
               do {
                  if (this.Field262 <= this.Field260.Field10098.Method8283(this.Field261)) {
                     return;
                  }

                  this.Field262 -= this.Field260.Field10098.Method8283(this.Field261) + 1.0D;
                  ++this.Field261;
               } while(this.Field261 < this.Field260.Field10098.Field10141);
            } while(this.Field261 >= 0 && this.Field261 < this.Field260.Field10098.Field10141);

            this.Field261 = 0;
            this.Field259 = true;
         }
      }
   }
}
