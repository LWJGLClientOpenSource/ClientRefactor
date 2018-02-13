package net.LWJGLClient.client.b.b.e;

import net.LWJGLClient.client.b.b.GraphicsDisplay;
import net.LWJGLClient.client.d.Class569;
import net.LWJGLClient.client.model.Model;
import net.LWJGLClient.client.model.Client;

public final class Class358 {
   private boolean Field3457;
   private int Field3458;
   private int Field3459;
   private Model Field3460;
   private final long Field3461;
   private final long Field3462;
   private final int Field3463;
   private final int Field3464;
   private final boolean Field3465;
   private final boolean Field3466;
   private final boolean Field3467;
   private final boolean Field3468;
   private final boolean Field3469;
   private final int Field3470;
   private Class357 Field3471;
   private float Field3472;
   private float Field3473;
   private float Field3474;
   private int Field3475;

   static {
      float var10000 = GraphicsDisplay.Field2687;
   }

   public final int hashCode() {
      int var1 = 31 + (int)(this.Field3462 ^ this.Field3462 >>> 32);
      var1 = var1 * 31 + this.Field3463;
      return var1 * 31 + (this.Field3457 ? 1231 : 1237);
   }

   public final boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 == null) {
         return false;
      } else if (this.getClass() != var1.getClass()) {
         return false;
      } else {
         Class358 var2 = (Class358)var1;
         if (this.Field3462 != var2.Field3462) {
            return false;
         } else if (this.Field3463 != var2.Field3463) {
            return false;
         } else {
            return this.Field3457 == var2.Field3457;
         }
      }
   }

   public final String toString() {
      return "DrawableModel [uid=" + this.Field3461 + ", objectId=" + this.Field3463 + ", coords=" + this.Field3471 + "]";
   }

   public final Model Method4191() {
      return this.Field3460;
   }

   public final long Method4192() {
      return this.Field3462;
   }

   public final int Method4193() {
      return this.Field3463;
   }

   public final boolean Method4194() {
      return this.Field3465;
   }

   public final boolean Method4195() {
      return this.Field3467;
   }

   public final boolean Method4196() {
      return this.Field3468;
   }

   public final int Method4197() {
      return (int)(this.Field3461 & 127L);
   }

   public final int Method4198() {
      return (int)(this.Field3461 >> 7 & 127L);
   }

   public final int Method4199() {
      return this.Field3470;
   }

   public final int Method4200() {
      return (int)(this.Field3461 >> 29 & 3L);
   }

   public final boolean Method4201() {
      return this.Field3457;
   }

   public final void Method4202(int var1, int var2) {
      this.Field3458 = var1;
      this.Field3459 = var2;
   }

   public final int Method4203() {
      return this.Field3458;
   }

   public final int Method4204() {
      return this.Field3459;
   }

   public final void Method4205() {
      this.Field3471 = null;
      this.Field3460 = null;
   }

   public Class358(Model var1, long var2, int var4, boolean var5, boolean var6, int var7, boolean var8) {
      this(var1, var2, 0, var5, var8, false, true, true, 0, true);
   }

   public final void Method4206(float var1, float var2, float var3, int var4) {
      this.Field3472 = var1;
      this.Field3473 = var2;
      this.Field3474 = var3;
      this.Field3475 = var4;
   }

   public final float Method4207() {
      return this.Field3472;
   }

   public final float Method4208() {
      return this.Field3473;
   }

   public final float Method4209() {
      return this.Field3474;
   }

   public final int Method4210() {
      return this.Field3475;
   }

   public Class358(Model var1, long var2, int var4, boolean var5, boolean var6, boolean var7, boolean var8, boolean var9, int var10, boolean var11) {
      this.Field3457 = true;
      this.Field3458 = 0;
      this.Field3459 = 0;
      this.Field3471 = null;
      this.Field3460 = var1;
      this.Field3461 = var2;
      this.Field3463 = var4;
      this.Field3464 = Class569.Method8822(var2);
      this.Field3465 = var5;
      this.Field3466 = var6;
      this.Field3467 = var7;
      this.Field3468 = var8;
      this.Field3469 = var9;
      this.Field3470 = var10;
      long var10001 = (long)this.Method4197();
      long var10002 = (long)this.Method4198();
      long var10003 = (long)var10;
      long var10005 = (long)var4;
      long var22 = (long)this.Method4200();
      long var20 = var10005;
      long var18 = var2;
      long var16 = var10003;
      long var14 = var10002;
      long var12 = var10001;
      if (var11) {
         var10001 = var2;
      } else {
         int var34 = Client.Field12497;
         int var33 = Client.Field12494;
         var34 = Client.Field12498;
         int var3 = Client.Field12495;
         var12 += (long)(Client.Field12490 + var33);
         var14 += (long)(Client.Field12491 + var3);
         if (var22 <= 1L) {
            var10001 = var18 >>= 14;
         } else {
            long var27 = var18 >> 36 & 31L;
            long var29 = var18 >> 60;
            var10001 = (var12 & 16383L) + ((var14 & 4095L) << 14) + (var16 << 28) + (var20 << 31) + (var29 << 48) + (var27 << 52);
         }
      }

      this.Field3462 = var10001;
      if (!var7 || var1.Field2855) {
         this.Field3457 = false;
      }

   }

   public final void Method4211(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9) {
      this.Field3471 = new Class357(var1, var2, var3, var4, var5, var6, var7, var8, var9);
   }

   public final Class357 Method4212() {
      return this.Field3471;
   }

   public final boolean Method4213() {
      return this.Field3469;
   }

   public final int Method4214() {
      return this.Field3464;
   }

   public final boolean Method4215() {
      return this.Field3466;
   }
}
