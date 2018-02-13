package net.LWJGLClient.client.a.d;

import net.LWJGLClient.client.Signlink;
import net.LWJGLClient.client.model.Client;

public final class Class116 {
   private final RgbImage[] Field9759;
   private final int Field9760;
   private final int Field9761;
   private final float Field9762;
   private final String Field9763;
   private boolean Field9764;
   private boolean Field9765;
   private int Field9766;
   private long Field9767;
   private long Field9768;
   private long Field9769;

   public final synchronized boolean Method986(Client var1, int var2, int var3, boolean var4) {
      long var5;
      long var7 = (var5 = System.currentTimeMillis()) - this.Field9767;
      this.Field9767 = var5;
      this.Field9768 += var7;
      if (!this.Field9764 && !this.Field9765 && !this.Field9764) {
         this.Field9765 = true;
         Signlink.Field2944.submit(new Class114(this));
      }

      this.Field9769 = 200L;

      while(this.Field9768 >= this.Field9769) {
         this.Field9768 -= this.Field9769;
         if (this.Field9764) {
            ++this.Field9766;
            if (this.Field9766 >= this.Field9759.length) {
               this.Field9766 = 0;
            }
         }
      }

      int var10 = 255 - (int)((float)(this.Field9769 - this.Field9768) / (float)this.Field9769 * 255.0F);
      int var11 = this.Field9766 == 0 ? this.Field9759.length - 1 : this.Field9766 - 1;
      if (!this.Field9764) {
         return false;
      } else {
         if (this.Field9759[this.Field9766] != null) {
            var2 = var1.Method13236() / 2 - this.Field9759[this.Field9766].Field9894 / 2 - 2;
            this.Field9759[var11].Method892(var2, var3, 255);
            this.Field9759[this.Field9766].Method892(var2, var3, var10);

            for(int var9 = 0; var9 < this.Field9759.length; ++var9) {
               this.Field9759[var9].Method868(this.Field9759[this.Field9766]);
            }
         } else {
            System.err.println("[MultiSprite]: null frame: " + this.Field9766);
         }

         return true;
      }
   }

   // $FF: synthetic method
   static String Method987(Class116 var0) {
      return var0.Field9763;
   }

   // $FF: synthetic method
   static float Method988(Class116 var0) {
      return var0.Field9762;
   }

   // $FF: synthetic method
   static int Method989(Class116 var0) {
      return var0.Field9761;
   }

   // $FF: synthetic method
   static int Method990(Class116 var0) {
      return var0.Field9760;
   }

   // $FF: synthetic method
   static RgbImage[] Method991(Class116 var0) {
      return var0.Field9759;
   }

   // $FF: synthetic method
   static void Method992(Class116 var0, boolean var1) {
      var0.Field9764 = true;
   }

   // $FF: synthetic method
   static void Method993(Class116 var0, boolean var1) {
      var0.Field9765 = false;
   }
}
