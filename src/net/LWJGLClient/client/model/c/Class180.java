package net.LWJGLClient.client.model.c;

import net.LWJGLClient.client.Signlink;

public final class Class180 {
   private final int Field3410 = 1024;
   private final Class173[] Field3411 = new Class173[1024];

   public Class180() {
      for(int var1 = 0; var1 < 1024; ++var1) {
         Class173 var2;
         (var2 = this.Field3411[var1] = new Class173()).Field3342 = var2;
         var2.Field3343 = var2;
      }

   }

   public final Class173 Method1851(long var1) {
      Class173 var3;
      for(Class173 var4 = (var3 = this.Field3411[(int)(var1 & 1023L)]).Field3342; var4 != var3; var4 = var4.Field3342) {
         if (var4.Field3341 == var1) {
            return var4;
         }
      }

      return null;
   }

   public final void Method1852(Class173 var1, long var2) {
      try {
         if (var1.Field3343 != null) {
            var1.Method1741();
         }

         Class173 var4 = this.Field3411[(int)(var2 & 1023L)];
         var1.Field3343 = var4.Field3343;
         var1.Field3342 = var4;
         var1.Field3343.Field3342 = var1;
         var1.Field3342.Field3343 = var1;
         var1.Field3341 = var2;
      } catch (RuntimeException var5) {
         var5.printStackTrace();
         Signlink.reporterror("91499, " + var1 + ", " + var2 + ", 7" + ", " + var5.toString());
         throw new RuntimeException();
      }
   }
}
