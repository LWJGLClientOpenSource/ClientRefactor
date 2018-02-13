package net.LWJGLClient.client.model.a.a;

public final class Class488 {
   private final int Field654;
   private final int Field655;

   public Class488(int var1, int var2) {
      this.Field654 = var1;
      this.Field655 = var2;
   }

   public final int hashCode() {
      return this.Field654 << 16 | this.Field655;
   }

   public final boolean equals(Object var1) {
      if (var1 == null) {
         return false;
      } else if (!(var1 instanceof Class488)) {
         return false;
      } else {
         Class488 var2;
         return (var2 = (Class488)var1).Field654 == this.Field654 && var2.Field655 == this.Field655;
      }
   }
}
