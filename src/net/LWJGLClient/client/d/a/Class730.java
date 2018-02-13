package net.LWJGLClient.client.d.a;

import net.LWJGLClient.client.model.Client;

public final class Class730 implements Comparable {
   private int Field12006;
   private final int Field12007;
   private final int Field12008;
   private final double Field12009;
   private final int Field12010;
   private final long Field12011;

   public final int Method12351() {
      return this.Field12010;
   }

   public final long Method12352() {
      return this.Field12011;
   }

   public final void Method12353() {
      this.Field12006 = Client.Field12600;
   }

   public final boolean Method12354() {
      return Math.abs(this.Field12006 - Client.Field12600) > 0;
   }

   public Class730(int var1, long var2) {
      this(var1, var2, false);
   }

   public Class730(int var1, long var2, boolean var4) {
      int var8 = Client.Field12341 >> 7;
      int var5 = Client.Field12343 >> 7;
      int var6 = (int)(var2 & 127L);
      int var7 = (int)(var2 >> 7 & 127L);
      this.Field12007 = var8 - var6;
      this.Field12008 = var5 - var7;
      this.Field12010 = var1;
      this.Field12011 = var2;
      this.Field12009 = Math.sqrt((double)(this.Field12007 * this.Field12007 + this.Field12008 * this.Field12008));
      this.Field12006 = Client.Field12600;
   }

   public final int hashCode() {
      int var1 = 31 + this.Field12010;
      return var1 * 31 + (int)(this.Field12011 ^ this.Field12011 >>> 32);
   }

   public final boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 == null) {
         return false;
      } else if (this.getClass() != var1.getClass()) {
         return false;
      } else {
         Class730 var2 = (Class730)var1;
         if (this.Field12010 != var2.Field12010) {
            return false;
         } else {
            return this.Field12011 == var2.Field12011;
         }
      }
   }

   @Override
   public int compareTo(Object o) {
      if (this.equals(o)) {
         return 1;
      } else {
         return -1;
      }
   }
}
