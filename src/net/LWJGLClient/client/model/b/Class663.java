package net.LWJGLClient.client.model.b;

import net.LWJGLClient.client.b.RSFont;
import net.LWJGLClient.client.b.b.GraphicsDisplay;
import net.LWJGLClient.client.model.Client;

public final class Class663 extends Class661 {
   private boolean Field9611 = true;
   private boolean Field9612 = false;

   public Class663(int var1, int var2, String var3) {
      super(var1, var2, var3);
   }

   public Class663(int var1, int var2, String var3, boolean var4) {
      super(var1, var2, var3);
      this.Field9612 = var4;
   }

   public Class663(int var1, int var2, String var3, boolean var4, boolean var5) {
      super(var1, var2, var3);
      this.Field9612 = var4;
      this.Field9611 = var5;
   }

   public Class663(int var1, int var2, String var3, long var4) {
      super(var1, var2, var3, 2500L);
   }

   public Class663(int var1, int var2, String var3, long var4, boolean var6) {
      super(var1, var2, var3, 3000L);
      this.Field9612 = false;
   }

   public final int Method10874() {
      int var1 = 0;
      String[] var2 = this.c_90.split("\n");
      RSFont var10000 = Client.plainFont;

      for(int var4 = 0; var4 < var2.length; ++var4) {
         RSFont var3;
         if (var4 == 0 && this.Field9612) {
            var3 = Client.boldFont;
         } else {
            var3 = Client.plainFont;
         }

         int var5;
         if ((var5 = var3.Method9451(var2[var4])) > var1) {
            var1 = var5;
         }
      }

      var1 = var1 / 15 * 15;
      var1 += 15;
      return var1;
   }

   public final void Method10875(boolean var1, Client var2) {
      if (this.c_90 != null) {
         int var12 = this.a_123;
         int var3 = this.b_102;
         boolean var4 = false;
         RSFont var10000 = Client.plainFont;
         int var6 = 240;
         if (this.d_84 > 0L) {
            long var8 = System.currentTimeMillis() - this.e_71;
            long var10;
            if ((var10 = this.d_84 - var8) < 390L) {
               var10 = 390L;
            } else {
               var2.Field12287.add(this);
            }

            if (var10 <= 1000L) {
               var6 = (int)var10 / 5;
            }
         }

         int var9;
         int var11;
         String[] var16;
         int var17;
         if (this.c_90.contains(" exp: ")) {
            var4 = true;
            var10000 = Client.boldFont;
            var17 = Client.Method13358(var9 = Integer.parseInt((var16 = this.c_90.split(" "))[2]));
            if (var9 >= 250000000) {
               var9 = 250000000;
            }

            if (var17 < 99) {
               var11 = Client.Method13359(var17 + 1);
               this.c_90 = var16[0] + " exp: " + String.format("%,d", var9) + "\nNext level at: " + String.format("%,d", var11) + "\nRemaining: " + String.format("%,d", var11 - var9);
            } else {
               this.c_90 = var16[0] + " exp: " + String.format("%,d", var9);
            }
         }

         boolean var18 = Client.Field12712;
         var9 = (var16 = this.c_90.split("\n")).length * 13 / 15 * 15;
         var9 += 15;
         var11 = 0;

         RSFont var5;
         for(int var7 = 0; var7 < var16.length; ++var7) {
            if (var7 == 0 && this.Field9612) {
               var5 = Client.boldFont;
            } else {
               var5 = Client.plainFont;
            }

            int var14;
            if ((var14 = var5.Method9451(var16[var7])) > var11) {
               var11 = var14;
            }
         }

         var17 = (var17 = var11 / 15) * 15;
         var17 += 15;
         if (this.Field9611) {
            this.a_123 -= var17 / 2;
         }

         if (!GraphicsDisplay.Field2678) {
            var18 = Client.Field12712;
         }

         if (Client.Field12712 && this.a_123 + var17 + 16 > Client.width) {
            this.a_123 = Client.width - var17 - 16;
         } else if (!GraphicsDisplay.Field2678) {
            var18 = Client.Field12712;
         }

         Client.Method13384(this.a_123, this.b_102, var17, var9, var6, var2.Field12411);
         this.b_102 += 16;

         for(int var13 = 0; var13 < var16.length; ++var13) {
            byte var15 = 13;
            if (var13 == 0 && this.Field9612) {
               var5 = Client.boldFont;
               var15 = 16;
            } else {
               var5 = Client.plainFont;
            }

            if (var4 && var16.length > 1) {
               var5.Method9445(var16[var13], this.a_123 + 10, 16101975, this.b_102 + 4);
            } else {
               var5.Method9446(var16[var13], this.a_123 + var17 / 2 + 10, 16101975, this.b_102 + 4);
            }

            this.b_102 += var15;
         }

         this.a_123 = var12;
         this.b_102 = var3;
      }
   }
}
