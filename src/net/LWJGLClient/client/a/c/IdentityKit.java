package net.LWJGLClient.client.a.c;

import net.LWJGLClient.client.a.e.JagexArchive;
import net.LWJGLClient.client.c.Packet;
import net.LWJGLClient.client.model.Model;

public final class IdentityKit {
   public static int Field10599;
   public static IdentityKit[] cache;
   public int Field10601 = -1;
   private int[] Field10602;
   private static int[] Field10603;
   private static int[] Field10604;
   private int[] Field10605 = new int[]{-1, -1, -1, -1, -1};
   public boolean Field10606;

   public static void Method11929(JagexArchive var0) {
      Packet var6;
      cache = new IdentityKit[Field10599 = (var6 = new Packet(var0.readConfig("idk.dat"))).g2()];

      for(int var1 = 0; var1 < Field10599; ++var1) {
         if (cache[var1] == null) {
            cache[var1] = new IdentityKit();
         }

         IdentityKit var10000 = cache[var1];
         Packet var3 = var6;
         IdentityKit var2 = var10000;

         while(true) {
            int var4;
            while((var4 = var3.g1()) != 0) {
               if (var4 == 1) {
                  var2.Field10601 = var3.g1();
               } else if (var4 == 2) {
                  var4 = var3.g1();
                  var2.Field10602 = new int[var4];

                  for(int var5 = 0; var5 < var4; ++var5) {
                     var2.Field10602[var5] = var3.g2();
                  }
               } else if (var4 == 3) {
                  var2.Field10606 = true;
               } else if (var4 >= 40 && var4 < 50) {
                  Field10603[var4 - 40] = var3.g2();
               } else if (var4 >= 50 && var4 < 60) {
                  Field10604[var4 - 50] = var3.g2();
               } else if (var4 >= 60 && var4 < 70) {
                  var2.Field10605[var4 - 60] = var3.g2();
               } else {
                  System.out.println("Error unrecognised config code: " + var4);
               }
            }

            Field10603[0] = 55232;
            Field10604[0] = 6798;
            break;
         }
      }

   }

   public final boolean Method11930() {
      boolean var1 = true;
      if (this.Field10602 == null) {
         return true;
      } else {
         int var2;
         for(var2 = 0; var2 < this.Field10602.length; ++var2) {
            if (!Model.Method14477(this.Field10602[var2])) {
               var1 = false;
            }
         }

         if (this.Field10605 == null) {
            return true;
         } else {
            for(var2 = 0; var2 < this.Field10605.length; ++var2) {
               if (!Model.Method14477(this.Field10605[var2])) {
                  var1 = false;
               }
            }

            return var1;
         }
      }
   }

   public final Model isBodyDownloadedOverload() {
      if (this.Field10602 == null) {
         return null;
      } else {
         Model[] var1 = new Model[this.Field10602.length];

         for(int var2 = 0; var2 < this.Field10602.length; ++var2) {
            var1[var2] = Model.Method14476(this.Field10602[var2], true, this.Field10602.length <= 1);
         }

         Model var4;
         if (var1.length == 1) {
            var4 = var1[0];
         } else {
            var4 = new Model(var1.length, var1);
         }

         for(int var3 = 0; var3 < 6; ++var3) {
            if (Field10603[var3] != 0 && var4 != null) {
               var4.recolor(Field10603[var3], Field10604[var3]);
            }
         }

         return var4;
      }
   }

   public final boolean Method11932() {
      boolean var1 = true;

      for(int var2 = 0; var2 < 5; ++var2) {
         if (this.Field10605[var2] != -1 && !Model.Method14477(this.Field10605[var2])) {
            var1 = false;
         }
      }

      return var1;
   }

   public final Model isBodyDownloaded() {
      Model[] var1 = new Model[5];
      int var2 = 0;

      for(int var3 = 0; var3 < 5; ++var3) {
         if (this.Field10605[var3] != -1) {
            var1[var2++] = Model.Method14476(this.Field10605[var3], true, false);
         }
      }

      Model var5 = new Model(var2, var1);

      for(int var4 = 0; var4 < 6 && Field10603[var4] != 0; ++var4) {
         var5.recolor(Field10603[var4], Field10604[var4]);
      }

      return var5;
   }

   private IdentityKit() {
      Field10603 = new int[6];
      Field10604 = new int[6];
      this.Field10606 = false;
   }
}
