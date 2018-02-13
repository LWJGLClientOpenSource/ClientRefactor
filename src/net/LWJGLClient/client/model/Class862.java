package net.LWJGLClient.client.model;

import net.LWJGLClient.client.model.c.Class171;

public final class Class862 extends Class171 {
   public int Field2726 = 0;
   public int Field2727 = 0;
   public long Field2728 = 0L;
   public boolean Field2729 = false;
   public boolean Field2730 = false;
   public long Field2731 = System.currentTimeMillis();
   public boolean Field2732 = false;
   public boolean Field2733 = false;
   public int Field2734;
   public byte[] Field2735;
   public int Field2736;
   public boolean Field2737;
   public boolean Field2738;
   public int Field2739;

   public Class862() {
      this.Field2737 = true;
   }

   public Class862(int var1, int var2) {
      this.Field2734 = var1;
      this.Field2736 = var2;
   }

   public final int hashCode() {
      int var1;
      return var1 = 31 + this.Field2727;
   }

   public final boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 == null) {
         return false;
      } else if (this.getClass() != var1.getClass()) {
         return false;
      } else {
         Class862 var2 = (Class862)var1;
         return this.Field2727 == var2.Field2727;
      }
   }
}
