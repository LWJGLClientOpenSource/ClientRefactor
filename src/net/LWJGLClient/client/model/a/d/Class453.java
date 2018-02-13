package net.LWJGLClient.client.model.a.d;

import net.LWJGLClient.client.b.Rasterizer;

public final class Class453 {
   public static final Class453 Field3082 = new Class453(0.0F, 0.0F, 0.0F);
   private float Field3083;
   private float Field3084;
   private float Field3085;

   public Class453(Class453 var1) {
      this(var1, 0);
   }

   public Class453(Class453 var1, int var2) {
      if (var1 != null) {
         float var3 = var1.Field3083;
         float var4 = var1.Field3084;
         float var7 = var1.Field3085;
         if (var2 != 0) {
            float var5 = (float) Rasterizer.Field9959[var2];
            float var8 = (float) Rasterizer.Field9960[var2];
            float var6 = (var4 * var5 + var3 * var8) / 65536.0F;
            var4 = (var4 * var8 - var3 * var5) / 65536.0F;
            var3 = var6;
         }

         this.Field3083 = var3;
         this.Field3084 = var4;
         this.Field3085 = var7;
      }
   }

   public Class453(float var1, float var2, float var3) {
      this.Field3083 = var1;
      this.Field3084 = var2;
      this.Field3085 = var3;
   }

   public final float Method7833() {
      return this.Field3083;
   }

   public final float Method7834() {
      return this.Field3084;
   }

   public final float Method7835() {
      return this.Field3085;
   }

   public final void Method7836(float var1) {
      this.Field3085 = var1;
   }

   public final Class453 Method7837(Class453 var1, double var2) {
      return this.Method7838(var1, var2, 0);
   }

   public final Class453 Method7838(Class453 var1, double var2, int var4) {
      if (var1 == null) {
         return this;
      } else {
         double var5 = (double)var1.Field3083 * var2;
         double var7 = (double)var1.Field3084 * var2;
         double var9 = (double)var1.Field3085 * var2;
         if (var4 != 0) {
            float var15 = (float) Rasterizer.Field9959[var4];
            float var16 = (float) Rasterizer.Field9960[var4];
            double var13 = (var7 * (double)var15 + var5 * (double)var16) / 65536.0D;
            var7 = (var7 * (double)var16 - var5 * (double)var15) / 65536.0D;
            var5 = var13;
         }

         this.Field3083 = (float)((double)this.Field3083 + var5);
         this.Field3084 = (float)((double)this.Field3084 + var7);
         this.Field3085 = (float)((double)this.Field3085 + var9);
         return this;
      }
   }

   public final Class453 Method7839() {
      return new Class453(this.Field3083, this.Field3084, this.Field3085);
   }

   public final String toString() {
      return "Vector{x=" + this.Field3083 + ", y=" + this.Field3084 + ", z=" + this.Field3085 + '}';
   }

   public final int hashCode() {
      int var1 = 31 + Float.floatToIntBits(this.Field3083);
      var1 = var1 * 31 + Float.floatToIntBits(this.Field3084);
      return var1 * 31 + Float.floatToIntBits(this.Field3085);
   }

   public final boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 == null) {
         return false;
      } else if (this.getClass() != var1.getClass()) {
         return false;
      } else {
         Class453 var2 = (Class453)var1;
         if (Float.floatToIntBits(this.Field3083) != Float.floatToIntBits(var2.Field3083)) {
            return false;
         } else if (Float.floatToIntBits(this.Field3084) != Float.floatToIntBits(var2.Field3084)) {
            return false;
         } else {
            return Float.floatToIntBits(this.Field3085) == Float.floatToIntBits(var2.Field3085);
         }
      }
   }

   // $FF: synthetic method
   public final Object clone() {
      return this.Method7839();
   }
}
