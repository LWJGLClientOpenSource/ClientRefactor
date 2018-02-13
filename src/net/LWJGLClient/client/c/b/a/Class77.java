package net.LWJGLClient.client.c.b.a;

import java.util.concurrent.atomic.AtomicInteger;

import net.LWJGLClient.client.model.Class862;

public final class Class77 {
   private final int Field3124;
   private final int Field3125;
   private final boolean Field3126;
   private String Field3127 = null;
   private AtomicInteger Field3128;
   private boolean Field3129 = false;
   private final Class862 Field3130;
   private final boolean Field3131;

   public final int hashCode() {
      int var1;
      return var1 = 31 + (this.Field3127 == null ? 0 : this.Field3127.hashCode());
   }

   public final boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 == null) {
         return false;
      } else if (this.getClass() != var1.getClass()) {
         return false;
      } else {
         Class77 var2 = (Class77)var1;
         if (this.Field3127 == null) {
            if (var2.Field3127 != null) {
               return false;
            }
         } else if (!this.Field3127.equals(var2.Field3127)) {
            return false;
         }

         return true;
      }
   }

   public Class77(int var1, int var2, boolean var3, boolean var4, Class862 var5) {
      this.Field3131 = var4;
      this.Field3124 = var1;
      this.Field3125 = var2;
      this.Field3127 = "cache/" + var1 + "/" + var2;
      this.Field3126 = var3;
      this.Field3130 = var5;
   }

   public final boolean Method573() {
      return this.Field3129;
   }

   public final void Method574() {
      this.Field3129 = true;
   }

   public final void Method575(AtomicInteger var1) {
      this.Field3128 = var1;
   }

   public final AtomicInteger Method576() {
      return this.Field3128;
   }

   public final String Method577() {
      return this.Field3127;
   }

   public final int Method578() {
      return this.Field3124;
   }

   public final Integer Method579() {
      return this.Field3125;
   }

   public final boolean Method580() {
      return this.Field3126;
   }

   public final Class862 Method581() {
      return this.Field3130;
   }

   public final boolean Method582() {
      return this.Field3131;
   }
}
