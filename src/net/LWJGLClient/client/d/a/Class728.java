package net.LWJGLClient.client.d.a;

public final class Class728 {
   private final int Field10774;
   private final int Field10775;
   private final int Field10776;
   private final int Field10777;
   private final int Field10778;
   private final int Field10779;
   private final boolean Field10780;
   private final boolean Field10781;
   private final boolean Field10782;

   public final int Method12335() {
      return this.Field10774;
   }

   public final int Method12336() {
      return this.Field10775;
   }

   public final int Method12337() {
      return this.Field10776;
   }

   public final int Method12338() {
      return this.Field10777;
   }

   public final int Method12339() {
      return this.Field10778;
   }

   public final int Method12340() {
      return this.Field10779;
   }

   public final boolean Method12341() {
      return this.Field10780;
   }

   public final boolean Method12342() {
      return this.Field10781;
   }

   public final boolean Method12343() {
      return this.Field10782;
   }

   public Class728(int var1, int var2, int var3, int var4, int var5, int var6, boolean var7, boolean var8, boolean var9) {
      this.Field10774 = var1;
      this.Field10775 = var2;
      this.Field10776 = var3;
      this.Field10777 = var4;
      this.Field10778 = var5;
      this.Field10779 = var6;
      this.Field10780 = var7;
      this.Field10781 = var8;
      this.Field10782 = var9;
   }

   public final int hashCode() {
      int var1 = 31 + this.Field10779;
      var1 = var1 * 31 + this.Field10777;
      var1 = var1 * 31 + this.Field10774;
      var1 = var1 * 31 + this.Field10778;
      var1 = var1 * 31 + this.Field10775;
      return var1 * 31 + this.Field10776;
   }

   public final boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 == null) {
         return false;
      } else if (this.getClass() != var1.getClass()) {
         return false;
      } else {
         Class728 var2 = (Class728)var1;
         if (this.Field10779 != var2.Field10779) {
            return false;
         } else if (this.Field10777 != var2.Field10777) {
            return false;
         } else if (this.Field10774 != var2.Field10774) {
            return false;
         } else if (this.Field10778 != var2.Field10778) {
            return false;
         } else if (this.Field10775 != var2.Field10775) {
            return false;
         } else {
            return this.Field10776 == var2.Field10776;
         }
      }
   }
}
