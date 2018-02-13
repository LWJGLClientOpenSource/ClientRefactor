package net.LWJGLClient.client.model.e;

import net.LWJGLClient.client.c.Packet;
import net.LWJGLClient.client.e.d.Class352;

public final class Class104 {
   private static final Class104[] Field10009 = new Class104[5000];
   public static final int[] Field10010 = new int[5000];
   private static byte[] Field10011;
   private static Packet Field10012;
   private final Class352[] Field10013 = new Class352[10];
   private int Field10014;
   private int Field10015;

   public static void Method863(Packet var0) {
      Field10011 = new byte[441000];
      Field10012 = new Packet(Field10011);
      Class352.Method4159();

      int var1;
      int var10002;
      int[] var7;
      for(; (var1 = var0.g2()) != 65535; var7[var1] = var10002) {
         Field10009[var1] = new Class104();
         Class104 var10000 = Field10009[var1];
         Packet var3 = var0;
         Class104 var2 = var10000;

         int var4;
         for(var4 = 0; var4 < 10; ++var4) {
            if (var3.g1() != 0) {
               --var3.pos;
               var2.Field10013[var4] = new Class352();
               var2.Field10013[var4].Method4162(var3);
            }
         }

         var2.Field10014 = var3.g2();
         var2.Field10015 = var3.g2();
         var7 = Field10010;
         var2 = Field10009[var1];
         int var6 = 9999999;

         for(var4 = 0; var4 < 10; ++var4) {
            if (var2.Field10013[var4] != null && var2.Field10013[var4].Field2149 / 20 < var6) {
               var6 = var2.Field10013[var4].Field2149 / 20;
            }
         }

         if (var2.Field10014 < var2.Field10015 && var2.Field10014 / 20 < var6) {
            var6 = var2.Field10014 / 20;
         }

         if (var6 != 9999999 && var6 != 0) {
            for(var4 = 0; var4 < 10; ++var4) {
               if (var2.Field10013[var4] != null) {
                  var2.Field10013[var4].Field2149 -= var6 * 20;
               }
            }

            if (var2.Field10014 < var2.Field10015) {
               var2.Field10014 -= var6 * 20;
               var2.Field10015 -= var6 * 20;
            }

            var10002 = var6;
         } else {
            var10002 = 0;
         }
      }

   }

   public static Packet Method864(int var0, int var1) {
      if (Field10009[var1] == null) {
         return null;
      } else {
         Class104 var10000 = Field10009[var1];
         var1 = var0;
         Class104 var11 = var10000;
         int var2 = 0;

         int var3;
         for(var3 = 0; var3 < 10; ++var3) {
            if (var11.Field10013[var3] != null && var11.Field10013[var3].Field2148 + var11.Field10013[var3].Field2149 > var2) {
               var2 = var11.Field10013[var3].Field2148 + var11.Field10013[var3].Field2149;
            }
         }

         int var12;
         if (var2 == 0) {
            var12 = 0;
         } else {
            var3 = var2 * 22050 / 1000;
            var2 = 22050 * var11.Field10014 / 1000;
            int var4 = 22050 * var11.Field10015 / 1000;
            if (var2 < 0 || var2 > var3 || var4 < 0 || var4 > var3 || var2 >= var4) {
               var1 = 0;
            }

            int var5 = var3 + (var4 - var2) * (var1 - 1);

            int var6;
            for(var6 = 44; var6 < var5 + 44 && var6 < Field10011.length; ++var6) {
               Field10011[var6] = -128;
            }

            int var7;
            int var8;
            for(var6 = 0; var6 < 10; ++var6) {
               if (var11.Field10013[var6] != null) {
                  var7 = var11.Field10013[var6].Field2148 * 22050 / 1000;
                  var8 = var11.Field10013[var6].Field2149 * 22050 / 1000;
                  int[] var9 = var11.Field10013[var6].Method4160(var7, var11.Field10013[var6].Field2148);

                  for(int var10 = 0; var10 < var7; ++var10) {
                     Field10011[var10 + var8 + 44] += (byte)(var9[var10] >> 8);
                  }
               }
            }

            if (var1 > 1) {
               var2 += 44;
               var4 += 44;
               var3 += 44;
               var5 += 44;
               var6 = var5 - var3;

               for(var7 = var3 - 1; var7 >= var4; --var7) {
                  if (var7 + var6 < Field10011.length) {
                     Field10011[var7 + var6] = Field10011[var7];
                  }
               }

               for(var7 = 1; var7 < var1; ++var7) {
                  var8 = (var4 - var2) * var7;
                  if (var2 + var8 + (var4 - var2) >= Field10011.length) {
                     break;
                  }

                  System.arraycopy(Field10011, var2, Field10011, var2 + var8, var4 - var2);
               }

               var5 -= 44;
            }

            var12 = var5;
         }

         var0 = var12;
         Field10012.pos = 0;
         Field10012.Method14480(1380533830);
         Field10012.Method14488(var0 + 36);
         Field10012.Method14480(1463899717);
         Field10012.Method14480(1718449184);
         Field10012.Method14488(16);
         Field10012.Method390(1);
         Field10012.Method390(1);
         Field10012.Method14488(22050);
         Field10012.Method14488(22050);
         Field10012.Method390(1);
         Field10012.Method390(8);
         Field10012.Method14480(1684108385);
         Field10012.Method14488(var0);
         Field10012.pos += var0;
         return Field10012;
      }
   }
}
