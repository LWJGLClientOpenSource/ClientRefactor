package net.LWJGLClient.client.e;

import net.LWJGLClient.client.a.e.JagexArchive;
import net.LWJGLClient.client.c.Packet;

public final class Censor {
   private static int[] Field8557;
   private static char[][] Field8558;
   private static byte[][][] Field8559;
   private static char[][] Field8560;
   private static char[][] Field8561;
   private static int[] Field8562;

   static {
      String[] var10000 = new String[]{"cook", "cook's", "cooks", "seeks", "sheet", "woop", "woops", "faq", "noob", "noobs"};
   }

   public static void loadConfig(JagexArchive var0) {
      Packet var1 = new Packet(var0.readConfig("fragmentsenc.txt"));
      Packet var2 = new Packet(var0.readConfig("badenc.txt"));
      Packet var3 = new Packet(var0.readConfig("domainenc.txt"));
      Packet var9 = new Packet(var0.readConfig("tldlist.txt"));
      Packet var10000 = var1;
      Packet var10001 = var2;
      Packet var10002 = var3;
      var3 = var9;
      var2 = var10002;
      var1 = var10001;
      var9 = var10000;
      int var4;
      Field8558 = new char[var4 = var1.Method404()][];
      Field8559 = new byte[var4][][];
      byte[][][] var7 = Field8559;
      char[][] var6 = Field8558;
      Packet var5 = var1;

      for(int var10 = 0; var10 < var6.length; ++var10) {
         char[] var12 = new char[var5.g1()];

         for(int var8 = 0; var8 < var12.length; ++var8) {
            var12[var8] = (char)var5.g1();
         }

         var6[var10] = var12;
         byte[][] var18 = new byte[var5.g1()][2];

         for(var4 = 0; var4 < var18.length; ++var4) {
            var18[var4][0] = (byte)var5.g1();
            var18[var4][1] = (byte)var5.g1();
         }

         if (var18.length > 0) {
            var7[var10] = var18;
         }
      }

      char[][] var19 = Field8560 = new char[var2.Method404()][];
      Packet var15 = var2;
      char[][] var13 = var19;

      int var17;
      for(var17 = 0; var17 < var13.length; ++var17) {
         char[] var11 = new char[var15.g1()];

         for(var4 = 0; var4 < var11.length; ++var4) {
            var11[var4] = (char)var15.g1();
         }

         var13[var17] = var11;
      }

      var1 = var9;
      Field8557 = new int[var9.Method404()];

      for(var4 = 0; var4 < Field8557.length; ++var4) {
         Field8557[var4] = var1.g2();
      }

      var1 = var3;
      Field8561 = new char[var4 = var3.Method404()][];
      Field8562 = new int[var4];

      for(int var14 = 0; var14 < var4; ++var14) {
         Field8562[var14] = var1.g1();
         char[] var16 = new char[var1.g1()];

         for(var17 = 0; var17 < var16.length; ++var17) {
            var16[var17] = (char)var1.g1();
         }

         Field8561[var14] = var16;
      }

   }
}
