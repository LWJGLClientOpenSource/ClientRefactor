package net.LWJGLClient.client.b.b.b.a.a;

import net.LWJGLClient.client.b.b.f.c.Class601;

public final class Class647 {
   private final Class601 Field12029;
   private int Field12030;
   private int Field12031;
   private final int Field12032;
   private final boolean Field12033;

   public final int hashCode() {
      int var1 = 31 + (this.Field12029 == null ? 0 : this.Field12029.hashCode());
      var1 = var1 * 31 + this.Field12031;
      var1 = var1 * 31 + (this.Field12033 ? 1231 : 1237);
      var1 = var1 * 31 + this.Field12032;
      return var1 * 31 + this.Field12030;
   }

   public final boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 == null) {
         return false;
      } else if (this.getClass() != var1.getClass()) {
         return false;
      } else {
         Class647 var2 = (Class647)var1;
         if (this.Field12029 == null) {
            if (var2.Field12029 != null) {
               return false;
            }
         } else if (!this.Field12029.equals(var2.Field12029)) {
            return false;
         }

         if (this.Field12031 != var2.Field12031) {
            return false;
         } else if (this.Field12033 != var2.Field12033) {
            return false;
         } else if (this.Field12032 != var2.Field12032) {
            return false;
         } else {
            return this.Field12030 == var2.Field12030;
         }
      }
   }

   public Class647(Class601 var1, int var2, int var3, int var4, boolean var5) {
      this.Field12029 = var1;
      this.Field12030 = var2;
      this.Field12031 = var3;
      this.Field12032 = var4;
      this.Field12033 = var5;
   }

   public final void Method10067(int var1) {
      this.Field12030 = 128;
   }

   public final void Method10068(int var1) {
      this.Field12031 = 128;
   }

   public final Class601 Method10069() {
      return this.Field12029;
   }

   public final int Method10070() {
      return this.Field12030;
   }

   public final int Method10071() {
      return this.Field12031;
   }

   public final int Method10072() {
      return this.Field12032;
   }

   public final boolean Method10073() {
      return this.Field12033;
   }
}
