package net.LWJGLClient.client.a.a;

import net.LWJGLClient.client.a.b.VarBit;
import net.LWJGLClient.client.a.c.ObjectDefinition;
import net.LWJGLClient.client.model.Client;
import net.LWJGLClient.client.model.Model;

public final class ObjectInstance extends Class511 {
   private ObjectDefinition Field10129 = null;
   private int Field10130;
   private final int[] Field10131;
   private final int Field10132;
   private final int Field10133;
   private Sequence Field10134;
   private int Field10135;
   public static Client clientInstance;
   private final int Field10137;
   private final int Field10138;
   private final int Field10139;

   public final Model getModel(int var1) {
      return this.Method8306(var1, 0, 0, 0L);
   }

   public final Model Method8306(int var1, int var2, int var3, long var4) {
      int var6 = -1;
      int var7 = -1;
      int var8 = -1;
      int var9 = -1;
      int var10 = this.Field10130 + 1;
      int var11;
      if (this.Field10134 != null) {
         if ((var11 = Client.currentTime - this.Field10135) > 100 && this.Field10134.Field10145 > 0) {
            var11 = 100;
         }

         label81: {
            do {
               do {
                  if ((double)var11 <= this.Field10134.Method8283(this.Field10130)) {
                     break label81;
                  }

                  var11 = (int)((double)var11 - this.Field10134.Method8283(this.Field10130));
                  ++this.Field10130;
               } while(this.Field10130 < this.Field10134.Field10141);

               this.Field10130 -= this.Field10134.Field10145;
            } while(this.Field10130 >= 0 && this.Field10130 < this.Field10134.Field10141);

            this.Field10134 = null;
         }

         this.Field10135 = Client.currentTime - var11;
         if (this.Field10134 != null) {
            var6 = this.Field10134.frame2IDS[this.Field10130];
            if (var10 >= this.Field10134.frame2IDS.length) {
               var7 = -1;
            } else {
               var7 = this.Field10134.frame2IDS[var10];
            }

            var8 = this.Field10134.Field10144[this.Field10130];
            var9 = this.Field10134.frame2IDS.length >= 10 ? var11 : -1;
         }
      }

      if (this.Field10129 == null) {
         if (this.Field10131 != null) {
            var11 = -1;
            if (this.Field10132 != -1 && this.Field10132 < VarBit.Field12723.length) {
               VarBit var14;
               int var12 = (var14 = VarBit.Field12723[this.Field10132]).Field12724;
               int var13 = var14.Field12725;
               var11 = var14.Field12726;
               var11 = Client.Field12656[var11 - var13];
               var11 &= clientInstance.Field12444[var12] >> var13;
            } else if (this.Field10133 != -1 && this.Field10133 < clientInstance.Field12444.length) {
               var11 = clientInstance.Field12444[this.Field10133];
            }

            this.Field10129 = var11 >= 0 && var11 < this.Field10131.length && this.Field10131[var11] != -1 ? ObjectDefinition.Method11938(this.Field10131[var11]) : null;
         } else {
            this.Field10129 = ObjectDefinition.Method11938(this.Field10137);
         }
      }

      return this.Field10129 == null ? null : this.Field10129.Method11945(this.Field10138, this.Field10139, this.Field10121, this.Field10122, this.Field10124, this.Field10123, var6, var6 == var7 ? -1 : var7, var8, var9, var1, var2, var3, var4, this.Field10118, this.Field10119, this.Field10120);
   }

   public ObjectInstance(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9, int var10, int var11, int var12) {
      this.Field10137 = var1;
      this.Field10138 = var3;
      this.Field10139 = var2;
      this.Field10121 = (float)var6;
      this.Field10122 = (float)var4;
      this.Field10124 = (float)var5;
      this.Field10123 = (float)var7;
      this.Field10118 = var10;
      this.Field10119 = var11;
      this.Field10120 = var12;
      if (var8 != -1) {
         this.Field10134 = Sequence.anims[var8];
         this.Field10130 = 0;
         this.Field10135 = Client.currentTime;
         if (var9 && this.Field10134.Field10145 != -1) {
            this.Field10130 = (int)(Math.random() * (double)this.Field10134.Field10141);
            this.Field10135 -= (int)(Math.random() * this.Field10134.Method8283(this.Field10130));
         }
      }

      ObjectDefinition var13 = ObjectDefinition.Method11938(this.Field10137);
      this.Field10132 = var13.Field10582;
      this.Field10133 = var13.Field10561;
      this.Field10131 = var13.Field10568;
   }

   public static void Method14444() {
      clientInstance = null;
   }
}
