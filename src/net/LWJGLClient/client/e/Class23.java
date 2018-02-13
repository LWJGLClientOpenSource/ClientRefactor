package net.LWJGLClient.client.e;

import net.LWJGLClient.client.Signlink;

public final class Class23 {
   private static final char[] Field8578 = new char[]{'_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};

   public static long nameToLong(String var0) {
      long var1 = 0L;

      for(int var3 = 0; var3 < var0.length() && var3 < 12; ++var3) {
         char var4 = var0.charAt(var3);
         var1 *= 37L;
         if (var4 >= 'A' && var4 <= 'Z') {
            var1 += (long)(var4 + 1 - 65);
         } else if (var4 >= 'a' && var4 <= 'z') {
            var1 += (long)(var4 + 1 - 97);
         } else if (var4 >= '0' && var4 <= '9') {
            var1 += (long)(var4 + 27 - 48);
         }
      }

      while(var1 % 37L == 0L && var1 != 0L) {
         var1 /= 37L;
      }

      return var1;
   }

   public static String Method203(long var0) {
      if (var0 > 0L && var0 < 6582952005840035281L) {
         try {
            if (var0 % 37L == 0L) {
               return "invalid_name";
            } else {
               int var2 = 0;

               char[] var3;
               long var4;
               for(var3 = new char[12]; var0 != 0L; var3[11 - var2++] = Field8578[(int)(var4 - var0 * 37L)]) {
                  var4 = var0;
                  var0 /= 37L;
               }

               return new String(var3, 12 - var2, var2);
            }
         } catch (RuntimeException var6) {
            Signlink.reporterror("81570, " + var0 + ", -99" + ", " + var6.toString());
            throw new RuntimeException();
         }
      } else {
         return "invalid_name";
      }
   }

   public static long Method204(String var0) {
      var0 = var0.toUpperCase();
      long var1 = 0L;

      for(int var3 = 0; var3 < var0.length(); ++var3) {
         var1 = (var1 = var1 * 61L + (long)var0.charAt(var3) - 32L) + (var1 >> 56) & 72057594037927935L;
      }

      return var1;
   }

   public static String Method205(int var0) {
      return (var0 >>> 24) + "." + (var0 >> 16 & 255) + "." + (var0 >> 8 & 255) + "." + (var0 & 255);
   }

   public static String Method206(String var0) {
      return var0 == null ? null : var0.replaceAll("[-+^']*", "");
   }

   public static String Method207(String var0) {
      if (var0 == null) {
         return null;
      } else if (var0.length() > 0) {
         char[] var2 = var0.toCharArray();

         for(int var1 = 0; var1 < var2.length; ++var1) {
            if (var2[var1] == '_') {
               var2[var1] = ' ';
               if (var1 + 1 < var2.length && var2[var1 + 1] >= 'a' && var2[var1 + 1] <= 'z') {
                  var2[var1 + 1] = (char)(var2[var1 + 1] + 65 - 97);
               }
            }
         }

         if (var2[0] >= 'a' && var2[0] <= 'z') {
            var2[0] = (char)(var2[0] + 65 - 97);
         }

         return new String(var2);
      } else {
         return var0;
      }
   }

   public static String Method208(String var0) {
      StringBuffer var1 = new StringBuffer();

      for(int var2 = 0; var2 < var0.length(); ++var2) {
         var1.append("*");
      }

      return var1.toString();
   }
}
