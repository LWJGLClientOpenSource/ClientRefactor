package net.LWJGLClient.client.model.a.d;

import java.util.Random;

public final class Class449 implements Comparable {
   private float Field3249;
   private int Field3250;
   private float Field3251;
   private Class453 Field3252;
   private float Field3253;
   private int Field3254;
   private ParticleDefinition Field3255;
   private Class453 Field3256;

   public final int Method12351() {
      return this.Field3254;
   }

   public final float Method7823() {
      return this.Field3253;
   }

   public final boolean compareTo(double var1) {
      if (this.Field3255 == null) {
         return false;
      } else {
         this.Field3249 = (float)((double)this.Field3249 + var1);
         if (this.Field3249 >= this.Field3255.Method7817()) {
            return false;
         } else {
            this.Field3256.Method7837(this.Field3252, var1);
            float var3 = this.Field3249 / this.Field3255.Method7817();
            float var2;
            if ((var2 = this.Field3255.Method7808() - this.Field3255.Method7806()) != 0.0F) {
               this.Field3251 = this.Field3255.Method7806() + var3 * var2;
            }

            if ((var2 = this.Field3255.Method7797() - this.Field3255.Method7795()) != 0.0F) {
               this.Field3253 = this.Field3255.Method7795() + var3 * var2;
            }

            return true;
         }
      }
   }

   public final Class453 Method7825() {
      return this.Field3256;
   }

   public Class449(ParticleDefinition var1, Class453 var2, int var3, int var4) {
      this(var4, var1.Method7811(), var1.Method7806(), var1.Method7814(var3).Method7839(), var1.Method7799().Method7840().Method7837(var2, 1.0D), var1.Method7795());
      int var10002 = var1.Method7811();
      float var10003 = var1.Method7806();
      Class453 var10004 = var1.Method7814(var3).Method7839();
      Class455 var10005 = var1.Method7799();
      Random var10006 = ParticleDefinition.Field3211;
      this.Field3255 = var1;
      this.Field3254 = var1.Method7803();
      if (var1.Method7793() != null) {
         this.Field3256.Method7838(var1.Method7793(), 1.0D, var4);
      }

   }

   private Class449(int var1, int var2, float var3, Class453 var4, Class453 var5, float var6) {
      this.Field3249 = 0.0F;
      this.Field3255 = null;
      this.Field3250 = var2;
      this.Field3251 = var3;
      this.Field3252 = new Class453(var4, var1);
      this.Field3256 = var5;
      this.Field3253 = var6;
   }

   public final int Method7826() {
      return this.Field3250;
   }

   public final float Method7827() {
      return this.Field3251;
   }

   @Override
   public int compareTo(Object o) {
      return ((int)(compareTo(o)));
      //return 0;
   }
}
