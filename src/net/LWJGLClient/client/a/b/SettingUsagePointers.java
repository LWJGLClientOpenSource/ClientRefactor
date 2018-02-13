package net.LWJGLClient.client.a.b;

import net.LWJGLClient.client.a.e.JagexArchive;
import net.LWJGLClient.client.c.Packet;

public final class SettingUsagePointers {
   public static SettingUsagePointers[] Field12822;
   private static int Field12823;
   private static int[] Field12824;
   public int Field12825;

   public static void Method1850(JagexArchive var0) {
      Packet var7 = new Packet(var0.readConfig("varp.dat"));
      Field12823 = 0;
      int var1 = var7.g2();
      if (Field12822 == null) {
         Field12822 = new SettingUsagePointers[var1];
      }

      if (Field12824 == null) {
         Field12824 = new int[var1];
      }

      for(int var2 = 0; var2 < var1; ++var2) {
         if (Field12822[var2] == null) {
            Field12822[var2] = new SettingUsagePointers();
         }

         SettingUsagePointers var10000 = Field12822[var2];
         int var5 = var2;
         Packet var4 = var7;
         SettingUsagePointers var3 = var10000;

         int var6;
         while((var6 = var4.g1()) != 0) {
            if (var6 == 1) {
               var4.g1();
            } else if (var6 == 2) {
               var4.g1();
            } else if (var6 == 3) {
               Field12824[Field12823++] = var5;
            } else if (var6 != 4) {
               if (var6 == 5) {
                  var3.Field12825 = var4.g2();
               } else if (var6 != 6) {
                  if (var6 == 7) {
                     var4.Method404();
                  } else if (var6 != 8) {
                     if (var6 == 10) {
                        var4.Method406();
                     } else if (var6 != 11) {
                        if (var6 == 12) {
                           var4.Method404();
                        } else if (var6 != 13) {
                           System.out.println("Error unrecognised config code: " + var6);
                        }
                     }
                  }
               }
            }
         }
      }

      if (var7.pos != var7.Field1259.length) {
         System.out.println("varptype load mismatch");
      }

   }
}
