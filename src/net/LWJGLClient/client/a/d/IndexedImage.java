package net.LWJGLClient.client.a.d;

import net.LWJGLClient.client.b.b.GraphicsDisplay;
import net.LWJGLClient.client.model.Client;
import net.LWJGLClient.client.a.e.JagexArchive;
import net.LWJGLClient.client.b.a.Class697;
import net.LWJGLClient.client.c.Packet;

public final class IndexedImage extends Class697 {
   public byte[] Field9650;
   public int[] Field9651;
   public int Field9652;
   public int Field9653;
   private int Field9654;
   private int Field9655;

   public IndexedImage(JagexArchive var1, String var2, int var3) {
      Packet var8 = new Packet(var1.readConfig(var2 + ".dat"));
      Packet var6;
      (var6 = new Packet(var1.readConfig("index.dat"))).pos = var8.g2();
      var6.g2();
      var6.g2();
      int var4 = var6.g1();
      this.Field9651 = new int[var4];

      int var5;
      for(var5 = 0; var5 < var4 - 1; ++var5) {
         this.Field9651[var5 + 1] = var6.Method403();
      }

      for(var5 = 0; var5 < var3; ++var5) {
         var6.pos += 2;
         var8.pos += var6.g2() * var6.g2();
         ++var6.pos;
      }

      this.Field9654 = var6.g1();
      this.Field9655 = var6.g1();
      this.Field9652 = var6.g2();
      this.Field9653 = var6.g2();
      var5 = var6.g1();
      int var7 = this.Field9652 * this.Field9653;
      this.Field9650 = new byte[var7];
      if (var5 == 0) {
         for(var3 = 0; var3 < var7; ++var3) {
            this.Field9650[var3] = var8.Method400();
         }

      } else {
         if (var5 == 1) {
            for(var3 = 0; var3 < this.Field9652; ++var3) {
               for(var7 = 0; var7 < this.Field9653; ++var7) {
                  this.Field9650[var3 + var7 * this.Field9652] = var8.Method400();
               }
            }
         }

      }
   }

   public final void Method14493(int var1, int var2, int var3) {
      for(var1 = 0; var1 < this.Field9651.length; ++var1) {
         if ((var2 = this.Field9651[var1] >> 16 & 255) < 0) {
            var2 = 0;
         } else if (var2 > 255) {
            var2 = 255;
         }

         if ((var3 = this.Field9651[var1] >> 8 & 255) < 0) {
            var3 = 0;
         } else if (var3 > 255) {
            var3 = 255;
         }

         int var4;
         if ((var4 = this.Field9651[var1] & 255) < 0) {
            var4 = 0;
         } else if (var4 > 255) {
            var4 = 255;
         }

         this.Field9651[var1] = (var2 << 16) + (var3 << 8) + var4;
      }

   }

   public final void Method901(int var1, int var2, boolean var3, int[] var4) {
      var1 += this.Field9654;
      var2 += this.Field9655;
      var1 += var2 << 9;
      var2 = this.Field9653;
      int var15 = this.Field9652;
      int var5 = 512 - var15;
      if (GraphicsDisplay.Field2678 && !Client.Field12593) {
         GraphicsDisplay var6 = GraphicsDisplay.Method997();
      }

      int var10003 = var5;
      byte var9 = 0;
      int[] var8 = this.Field9651;
      int var7 = 0;
      var5 = var15;
      int var16 = var1;
      var15 = var10003;
      byte[] var14 = this.Field9650;
      int[] var13 = var4;
      if (var4 != null && var8 != null && var14 != null) {
         int var10 = -(var5 >> 2);
         var5 = -(var5 & 3);

         for(int var17 = -var2; var17 < 0; ++var17) {
            int var11;
            byte var12;
            for(var11 = var10; var11 < 0; ++var11) {
               if ((var12 = var14[var7++]) != 0) {
                  var13[var16++] = var8[var12 & 255];
               } else {
                  ++var16;
               }

               if ((var12 = var14[var7++]) != 0) {
                  var13[var16++] = var8[var12 & 255];
               } else {
                  ++var16;
               }

               if ((var12 = var14[var7++]) != 0) {
                  var13[var16++] = var8[var12 & 255];
               } else {
                  ++var16;
               }

               if ((var12 = var14[var7++]) != 0) {
                  var13[var16++] = var8[var12 & 255];
               } else {
                  ++var16;
               }
            }

            for(var11 = var5; var11 < 0; ++var11) {
               if ((var12 = var14[var7++]) != 0) {
                  var13[var16++] = var8[var12 & 255];
               } else {
                  ++var16;
               }
            }

            var16 += var15;
            var7 += var9;
         }

      }
   }
}
