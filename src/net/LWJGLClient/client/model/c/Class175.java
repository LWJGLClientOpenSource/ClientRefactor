package net.LWJGLClient.client.model.c;

import net.LWJGLClient.client.Signlink;

public final class Class175 {
   private final Class171 Field3336 = new Class171();
   private final int Field3337;
   private int Field3338;
   private final Class180 Field3339;
   private final Class170 Field3340 = new Class170();

   public Class175(int var1) {
      this.Field3337 = var1;
      this.Field3338 = var1;
      this.Field3339 = new Class180();
   }

   public final synchronized Class171 Method1837(long var1) {
      Class171 var3;
      if ((var3 = (Class171)this.Field3339.Method1851(var1)) != null) {
         this.Field3340.Method1733(var3);
      }

      return var3;
   }

   public final synchronized void Method1838(Class171 var1, long var2) {
      try {
         if (this.Field3338 == 0) {
            Class171 var4;
            (var4 = this.Field3340.Method1734()).Method1741();
            var4.Method1735();
            if (var4 == this.Field3336) {
               (var4 = this.Field3340.Method1734()).Method1741();
               var4.Method1735();
            }
         } else {
            --this.Field3338;
         }

         this.Field3339.Method1852(var1, var2);
         this.Field3340.Method1733(var1);
      } catch (RuntimeException var5) {
         var5.printStackTrace();
         Signlink.reporterror("47547, " + var1 + ", " + var2 + ", 2" + ", " + var5.toString());
      }
   }

   public final synchronized void Method1839() {
      Class171 var1;
      while((var1 = this.Field3340.Method1734()) != null) {
         var1.Method1741();
         var1.Method1735();
      }

      this.Field3338 = this.Field3337;
   }
}
