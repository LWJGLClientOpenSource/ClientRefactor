package net.LWJGLClient.client.e;

import net.LWJGLClient.client.c.Packet;

public final class TextInput {
   private static final char[] Field8579 = new char[100];
   private static final Packet Field8580 = new Packet(new byte[100]);
   private static char[] Field8581 = new char[]{' ', 'e', 't', 'a', 'o', 'i', 'h', 'n', 's', 'r', 'd', 'l', 'u', 'm', 'w', 'c', 'y', 'f', 'g', 'p', 'b', 'v', 'k', 'x', 'j', 'q', 'z', 'E', 'T', 'A', 'O', 'I', 'H', 'N', 'S', 'R', 'D', 'L', 'U', 'M', 'W', 'C', 'Y', 'F', 'G', 'P', 'B', 'V', 'K', 'X', 'J', 'Q', 'Z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ' ', '!', '?', '.', ',', ':', ';', '(', ')', '-', '&', '*', '\\', '\'', '@', '#', '+', '=', '£', '$', '%', '"', '[', ']', '/', '<', '>', 'ö', 'ä', 'ü', 'Ö', 'Ä', 'Ü', 'ß', '^', '€', '~', '¹', '²', '³', '¼', '½', '¬', '´', '°', '·', '|', '«', '»', '¢', 'µ', 'æ', 'ð', 'ø', '¶', '{', '}', 'þ', '“', '”', '_', 'õ'};

   public static String readFromStream(int var0, Packet var1) {
      int var2 = 0;

      int var4;
      for(int var3 = 0; var3 < var0; ++var3) {
         var4 = var1.g1();
         Field8579[var2++] = Field8581[var4];
      }

      boolean var7 = true;

      for(var4 = 0; var4 < var2; ++var4) {
         char var5;
         char var6;
         if ((var6 = var5 = Field8579[var4]) >= 'A' && var6 <= 'Z' || var6 == 214 || var6 == 196 || var6 == 220) {
            var7 = false;
         }

         if (var7 && (var5 >= 'a' && var5 <= 'z' ? true : var5 == 228 || var5 == 246 || var5 == 252)) {
            Field8579[var4] += '￠';
            var7 = false;
         }

         if (var5 == '.' || var5 == '!' || var5 == '?') {
            var7 = true;
         }
      }

      return new String(Field8579, 0, var2);
   }

   public static void Method200(String var0, Packet var1) {
      if (var0.length() > 80) {
         var0 = var0.substring(0, 80);
      }

      for(int var2 = 0; var2 < var0.length(); ++var2) {
         char var3 = var0.charAt(var2);
         int var4 = 0;

         for(int var5 = 0; var5 < Field8581.length; ++var5) {
            if (var3 == Field8581[var5]) {
               var4 = var5;
               break;
            }
         }

         var1.Method388(var4);
      }

   }

   public static String Method201(String var0) {
      Field8580.pos = 0;
      Method200(var0, Field8580);
      int var1 = Field8580.pos;
      Field8580.pos = 0;
      return readFromStream(var1, Field8580);
   }
}
