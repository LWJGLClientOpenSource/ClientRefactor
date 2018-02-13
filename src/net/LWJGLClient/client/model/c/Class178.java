package net.LWJGLClient.client.model.c;

public final class Class178 {
   private Class173 Field3334 = new Class173();
   private Class173 Field3335;

   public Class178() {
      this.Field3334.Field3342 = this.Field3334;
      this.Field3334.Field3343 = this.Field3334;
   }

   public final synchronized void Method1845(Class173 var1) {
      if (var1.Field3343 != null) {
         var1.Method1741();
      }

      var1.Field3343 = this.Field3334.Field3343;
      var1.Field3342 = this.Field3334;
      var1.Field3343.Field3342 = var1;
      var1.Field3342.Field3343 = var1;
   }

   public final synchronized Class173 Method1846() {
      Class173 var1 = this.Field3334.Field3342;
      if (this.Field3334.Field3342 == this.Field3334) {
         return null;
      } else {
         var1.Method1741();
         return var1;
      }
   }

   public final synchronized Class173 Method1847() {
      Class173 var1 = this.Field3334.Field3342;
      if (this.Field3334.Field3342 == this.Field3334) {
         this.Field3335 = null;
         return null;
      } else {
         this.Field3335 = var1.Field3342;
         return var1;
      }
   }

   public final synchronized Class173 Method1848() {
      Class173 var1 = this.Field3335;
      if (this.Field3335 == this.Field3334) {
         this.Field3335 = null;
         return null;
      } else if (var1 != null) {
         this.Field3335 = var1.Field3342;
         return var1;
      } else {
         this.Field3335 = null;
         return null;
      }
   }

   public final synchronized void Method1849() {
      if (this.Field3334.Field3342 != this.Field3334) {
         while(true) {
            Class173 var1 = this.Field3334.Field3342;
            if (this.Field3334.Field3342 == this.Field3334) {
               return;
            }

            var1.Method1741();
         }
      }
   }
}
