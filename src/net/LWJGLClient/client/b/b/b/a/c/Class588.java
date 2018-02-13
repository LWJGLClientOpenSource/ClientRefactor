package net.LWJGLClient.client.b.b.b.a.c;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import net.LWJGLClient.client.model.a.d.Class453;

public final class Class588 {
   private float Field12012 = Float.MAX_VALUE;
   private float Field12013 = Float.MAX_VALUE;
   private float Field12014 = Float.MIN_VALUE;
   private float Field12015 = Float.MIN_VALUE;
   private final Map Field12016 = new HashMap();
   private final Map Field12017 = new HashMap();
   private boolean Field12018 = false;
   private final int Field12019;
   private final int Field12020;
   private final int Field12021;
   private final Class586 Field12022;
   private boolean Field12023 = false;

   public Class588(int var1, int var2, int var3, Class586 var4) {
      this.Field12020 = var1;
      this.Field12019 = var2;
      this.Field12021 = var3;
      this.Field12022 = var4;
   }

   public final Collection Method9090() {
      return this.Field12016.values();
   }

   public final void Method9091(float var1, float var2, float var3) {
      if (!this.Field12018) {
         this.Field12018 = true;
         this.Field12012 = var1;
         this.Field12013 = var2;
         this.Field12014 = var1;
         this.Field12015 = var2;
      } else {
         if (var1 < this.Field12012) {
            this.Field12012 = var1;
         } else if (var1 > this.Field12014) {
            this.Field12014 = var1;
         }

         if (var2 < this.Field12013) {
            this.Field12013 = var2;
         } else if (var2 > this.Field12015) {
            this.Field12015 = var2;
         }
      }

      int var4;
      for(int var5 = -(var4 = this.Field12022.Method8967()); var5 <= var4; ++var5) {
         for(int var6 = -var4; var6 <= var4; ++var6) {
            if (var5 != var6 || var5 == 0 || var5 != var4) {
               float var10001 = var1 + (float)var5;
               float var9 = var2 + (float)var6;
               float var8 = var10001;
               int var11 = Method9092(var8, var9);
               Class453 var12 = new Class453(var8, var9, var3);
               if (!this.Field12016.containsKey(var11)) {
                  this.Field12016.put(var11, var12);
                  Object var13;
                  if ((var13 = (List)this.Field12017.get(var11)) == null) {
                     var13 = new LinkedList();
                     this.Field12017.put(var11, var13);
                  }

                  ((List)var13).add(var3);
               }
            }
         }
      }

   }

   private static int Method9092(float var0, float var1) {
      return ((int)var0 << 10) + (int)var1;
   }

   public final float Method9093(float var1, float var2, float var3, float var4) {
      LinkedList var5 = new LinkedList();
      List var6 = (List)this.Field12017.get(Method9092(var1, var2));
      List var7 = (List)this.Field12017.get(Method9092(var1, var2 + var4));
      List var8 = (List)this.Field12017.get(Method9092(var1 + var3, var2));
      List var9 = (List)this.Field12017.get(Method9092(var1 + var3, var2 + var4));
      if (var6 != null) {
         var5.addAll(var6);
      }

      if (var7 != null) {
         var5.addAll(var7);
      }

      if (var8 != null) {
         var5.addAll(var8);
      }

      if (var9 != null) {
         var5.addAll(var9);
      }

      var1 = 0.0F;

      for(Iterator var10 = var5.iterator(); var10.hasNext(); var1 += var2) {
         var2 = (Float)var10.next();
      }

      if ((var2 = (float)var5.size()) < 4.0F) {
         if (this.Field12022.Method8967() == 0) {
            var2 += 0.2F;
         } else {
            var2 = 4.0F;
         }
      }

      return var1 / var2;
   }

   public final void Method9094() {
      if (!this.Field12023) {
         this.Field12023 = true;
         Iterator var2 = this.Field12016.values().iterator();

         while(var2.hasNext()) {
            Class453 var1;
            int var3 = (int)(var1 = (Class453)var2.next()).Method7833();
            int var9 = (int)var1.Method7834();
            int var4 = Method9092((float)var3, (float)var9);
            LinkedList var5 = new LinkedList();

            for(int var6 = 0; var6 <= 0; ++var6) {
               for(int var7 = 0; var7 <= 0; ++var7) {
                  int var8 = Method9092((float)var3, (float)var9);
                  List var12;
                  if ((var12 = (List)this.Field12017.get(var8)) != null) {
                     var5.addAll(var12);
                  }
               }
            }

            float var10 = 0.0F;

            float var11;
            for(Iterator var13 = var5.iterator(); var13.hasNext(); var10 += var11) {
               var11 = (Float)var13.next();
            }

            var10 /= (float)var5.size();
            ((Class453)this.Field12016.get(var4)).Method7836(var10);
         }

      }
   }

   public final float Method9095() {
      float var1 = this.Field12014 - this.Field12012;
      float var2 = this.Field12015 - this.Field12013;
      return (float)Math.sqrt((double)(var1 * var1 + var2 * var2));
   }

   public final float Method9096() {
      return this.Field12012;
   }

   public final float Method9097() {
      return this.Field12013;
   }

   public final float Method9098() {
      return this.Field12014;
   }

   public final float Method9099() {
      return this.Field12015;
   }

   public final int Method9100() {
      return this.Field12019;
   }

   public final int Method9101() {
      return this.Field12020;
   }

   public final int Method9102() {
      return this.Field12021;
   }

   public final Class586 Method9103() {
      return this.Field12022;
   }
}
