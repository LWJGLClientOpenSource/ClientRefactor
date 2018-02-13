package net.LWJGLClient.client.d;

public final class Class564 {
   public boolean Field507 = false;
   private final int Field508;
   private final int Field509;
   private final int Field510;
   private final int Field511;
   private final int Field512;
   private final int Field513;
   private final int Field514;

   public Class564(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      this.Field508 = var1;
      this.Field509 = var2;
      this.Field510 = var3;
      this.Field511 = var4;
      this.Field512 = var5;
      this.Field513 = var6;
      this.Field514 = var7;
   }

   public final int Method8796() {
      return this.Field508;
   }

   public final int Method8797() {
      return this.Field509;
   }

   public final int hashCode() {
      int var1 = 31 + this.Field514;
      var1 = var1 * 31 + this.Field512;
      var1 = var1 * 31 + this.Field510;
      var1 = var1 * 31 + this.Field511;
      var1 = var1 * 31 + this.Field513;
      var1 = var1 * 31 + this.Field508;
      return var1 * 31 + this.Field509;
   }

   public final boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 == null) {
         return false;
      } else if (this.getClass() != var1.getClass()) {
         return false;
      } else {
         Class564 var2 = (Class564)var1;
         if (this.Field514 != var2.Field514) {
            return false;
         } else if (this.Field512 != var2.Field512) {
            return false;
         } else if (this.Field510 != var2.Field510) {
            return false;
         } else if (this.Field511 != var2.Field511) {
            return false;
         } else if (this.Field513 != var2.Field513) {
            return false;
         } else if (this.Field508 != var2.Field508) {
            return false;
         } else {
            return this.Field509 == var2.Field509;
         }
      }
   }

   public final int Method8798() {
      return this.Field510;
   }

   public final int Method8799() {
      return this.Field511;
   }

   public final int Method8800() {
      return this.Field512;
   }

   public final int Method8801() {
      return this.Field513;
   }

   public final int Method8802() {
      return this.Field514;
   }
}
