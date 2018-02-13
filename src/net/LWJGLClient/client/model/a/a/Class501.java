package net.LWJGLClient.client.model.a.a;

import net.LWJGLClient.client.b.b.GraphicsDisplay;
import net.LWJGLClient.client.b.b.f.Class838;
import net.LWJGLClient.client.model.a.b.Class46;
import net.LWJGLClient.client.model.a.c.Class896;
import net.LWJGLClient.client.e.d.Class350;
import net.LWJGLClient.client.e.d.Class353;
import net.LWJGLClient.client.model.a.c.Class885;
import net.LWJGLClient.client.model.a.c.Class887;
import net.LWJGLClient.client.model.a.c.Class890;
import net.LWJGLClient.client.model.c.Class173;

public final class Class501 extends Class173 {
   private long Field12838 = System.currentTimeMillis();
   private boolean Field12839 = false;
   public boolean Field12840 = false;
   public boolean Field12841 = false;
   public int Field12842;
   public int Field12843;
   public int Field12844;
   public int Field12845;
   public Class353 Field12846;
   public Class350 Field12847;
   public Class885 Field12848;
   public Class887 Field12849;
   public Class896 Field12850 = null;
   public Class46 Field12851;
   public Class501 Field12852;
   public int Field12853;
   public Class890[] Field12854 = new Class890[5];
   public int[] Field12855 = new int[5];
   public int Field12856;
   public int Field12857;
   public boolean Field12858;
   public boolean Field12859;
   public boolean Field12860;
   public int Field12861;
   public int Field12862;
   public int Field12863;
   public int Field12864;

   public Class501(int var1, int var2, int var3) {
      this.Field12845 = this.Field12842 = var1;
      this.Field12843 = var2;
      this.Field12844 = var3;
   }

   public final void Method14493(int var1, int var2, int var3) {
      this.Field12839 = false;
      this.Field12845 = this.Field12842 = var3;
      this.Field12843 = var1;
      this.Field12844 = var2;

      for(var1 = 0; var1 < this.Field12854.length; ++var1) {
         this.Field12854[var1] = null;
         this.Field12855[var1] = 0;
      }

      this.Field12846 = null;
      this.Field12847 = null;
      this.Field12848 = null;
      this.Field12849 = null;
      this.Field12850 = null;
      this.Field12851 = null;
      if (this.Field12852 != null && this.Field12852 != this) {
         this.Field12852.Method14493(0, 0, 0);
         this.Field12852 = null;
      }

   }

   public final boolean Method8186(int var1, int var2, int var3, boolean var4) {
      if (this.Field12851 != null) {
         return true;
      } else if (this.Field12840) {
         return true;
      } else {
         for(int var5 = 0; var5 < this.Field12853; ++var5) {
            if (this.Field12854[var5] != null && this.Field12854[var5].Field425) {
               return true;
            }
         }

         if (GraphicsDisplay.Field2678 && GraphicsDisplay.Field2667) {
            boolean var8 = false;
            long var6;
            if ((var6 = System.currentTimeMillis()) - this.Field12838 > 1000L) {
               this.Field12838 = var6 - (long)(Math.random() * 250.0D);
               var8 = true;
            }

            if (!var4) {
               Class838.Field6955.Method10102(var1, var2, var3);
            }

            return var8;
         } else {
            return true;
         }
      }
   }
}
