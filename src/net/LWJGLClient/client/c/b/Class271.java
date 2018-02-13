package net.LWJGLClient.client.c.b;

import java.io.FileNotFoundException;

import net.LWJGLClient.client.model.Class862;

final class Class271 implements Runnable {
   // $FF: synthetic field
   private Class280 Field51;
   // $FF: synthetic field
   private final Class862 Field52;
   // $FF: synthetic field
   private final boolean Field53;
   // $FF: synthetic field
   private final int Field54;
   // $FF: synthetic field
   private final boolean Field55;
   // $FF: synthetic field
   private final long Field56;

   Class271(Class280 var1, Class862 var2, boolean var3, int var4, boolean var5, long var6) {
      this.Field51 = var1;
      this.Field52 = var2;
      this.Field53 = var3;
      this.Field54 = var4;
      this.Field55 = var5;
      this.Field56 = var6;
      super();
   }

   public final void run() {
      try {
         if (this.Field52.Field2734 + 1 == 3 && this.Field52.Field2736 + 1 == 0) {
            return;
         }

         boolean var1 = false;

         try {
            byte[] var2;
            if (this.Field52.Field2734 + 1 == 5) {
               var2 = this.Field51.Method3004().Method3012(this.Field52.Field2734 + 1, this.Field52.Field2736, 1);
            } else {
               var2 = this.Field51.Method3004().Method3012(this.Field52.Field2734 + 1, this.Field52.Field2736 + 1, 1);
            }

            this.Field52.Field2735 = var2;
            if (var2 != null) {
               Class280.Method3005(this.Field51).Field12722[this.Field52.Field2734 + 1].Method9334(var2.length, var2, this.Field52.Field2736);
               if (this.Field53) {
                  Class280.Method3005(this.Field51).Field12526.Method1320(this.Field52);
               } else {
                  this.Field52.Field2735 = null;
               }
            } else {
               var1 = true;
            }
         } catch (FileNotFoundException var4) {
            var1 = true;
         } catch (Exception var5) {
            var5.printStackTrace();
            var1 = true;
         }

         if (this.Field54 + 1 == 4 && this.Field53) {
            Class280.Method3006(this.Field51).decrementAndGet();
         } else {
            Class280.Method3007(this.Field51).decrementAndGet();
         }

         if (this.Field55) {
            Class280.Method3008(this.Field51).decrementAndGet();
         }

         if (var1) {
            System.out.println("arrival: " + this.Field53);
            this.Field52.Field2735 = null;
            if (this.Field53) {
               Class280.Method3005(this.Field51).Field12526.Method1320(this.Field52);
            }
         }
      } catch (Exception var6) {
         System.out.println("e1 in CacheRequest");
         var6.printStackTrace();
      }

      synchronized(Class280.Method3009(this.Field51)) {
         Class280.Method3009(this.Field51).remove(this.Field56);
      }
   }
}
