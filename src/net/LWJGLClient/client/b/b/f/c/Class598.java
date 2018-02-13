package net.LWJGLClient.client.b.b.f.c;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import net.LWJGLClient.client.a.d.RgbImage;
import net.LWJGLClient.client.b.b.b.a.a.Class650;

public final class Class598 {
   private List Field10155;
   private List Field10156;
   private final int Field10157;
   private final int Field10158;
   private final int Field10159;
   private final boolean Field10160;
   private int Field10161;

   public final List Method9122() {
      return this.Field10155;
   }

   public final List Method9123() {
      return this.Field10156;
   }

   public final void Method9124(boolean var1) {
      Iterator var3 = this.Field10155.iterator();

      while(var3.hasNext()) {
         ((Class601)var3.next()).Method9149(var1);
      }

      this.Field10155.clear();
      this.Field10156.clear();
      this.Field10161 = 0;
      Class601.Field9002 = 0;
   }

   public Class598(int var1, int var2, int var3, boolean var4, boolean var5) {
      this.Field10161 = 0;
      this.Field10159 = 0;
      this.Field10157 = var1;
      this.Field10158 = var2;
      this.Field10160 = var5;
      this.Field10155 = new ArrayList();
      this.Field10156 = new ArrayList();
      if (var3 != 0) {
         for(var1 = 0; var1 < var3; ++var1) {
            this.Method9125();
         }
      }

   }

   public Class598(int var1, int var2) {
      this(512, var2, 0, false, false);
   }

   private void Method9125() {
      ++this.Field10161;
      this.Field10155.add(new Class601(this.Field10157, this.Field10158, this.Field10161, this, this.Field10160));
      this.Field10156.add(new ArrayList());
   }

   private int Method9126(long var1) {
      while(true) {
         int var3;
         for(var3 = 0; var3 < this.Field10155.size(); ++var3) {
            if (((Class601)this.Field10155.get(var3)).Method9145(var1)) {
               return var3;
            }
         }

         for(var3 = 0; var3 < this.Field10155.size(); ++var3) {
            if (!((Class601)this.Field10155.get(var3)).Method9134()) {
               return var3;
            }
         }

         if (this.Field10159 != 0) {
            System.err.println("[TextureAtlasList]: no free atlas found!!");
            return -1;
         }

         this.Method9125();
         //this = this;
      }
   }

   public final Class601 Method9127(boolean var1, int var2) {
      while(true) {
         int var3;
         for(var3 = 0; var3 < this.Field10155.size(); ++var3) {
            if (((Class601)this.Field10155.get(var3)).Method9145((long)var2)) {
               return (Class601)this.Field10155.get(var3);
            }
         }

         for(var3 = 0; var3 < this.Field10155.size(); ++var3) {
            if (!((Class601)this.Field10155.get(var3)).Method9134()) {
               ((Class601)this.Field10155.get(var3)).Method9146((long)var2, (int[])null, 255, 128, 128, false, true, var2, var1);
               return (Class601)this.Field10155.get(var3);
            }
         }

         if (this.Field10159 != 0) {
            System.err.println("[TextureAtlasList]: no free atlas found!!");
            return null;
         }

         this.Method9125();
         var1 = var1;
         //this = this;
      }
   }

   public final boolean Method9128(long var1, int var3, int var4, int var5, int var6, int var7, RgbImage var8) {
      long var9 = var1;
      if (var1 < 0L) {
         var9 = -var1;
      }

      int var11;
      if ((var11 = this.Method9126(var9)) == -1) {
         return false;
      } else {
         Class601 var12 = (Class601)this.Field10155.get(var11);
         List var14 = (List)this.Field10156.get(var11);
         int[] var13;
         if ((var13 = var12.Method9144(var9, var8, 255, var6, var7, var1 < 0L)) != null) {
            var14.add(new Class650(16777215, var5, var3, var4, var1, var13[0], var13[1], var6, var7, var8.Method870()));
            var8.Method14462(0.0F);
            return true;
         } else {
            return true;
         }
      }
   }
}
