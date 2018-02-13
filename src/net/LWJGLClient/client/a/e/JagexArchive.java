package net.LWJGLClient.client.a.e;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;

import net.LWJGLClient.client.Signlink;
import net.LWJGLClient.client.e.d.Class443;
import net.LWJGLClient.client.c.Packet;

public final class JagexArchive {
   private byte[] Field2892;
   private int Field2893;
   private int[] Field2894;
   private int[] Field2895;
   private int[] Field2896;
   private int[] Field2897;
   private boolean Field2898;

   public JagexArchive(byte[] var1, String var2) {
      try {
         if (var2.contains("2d")) {
            var1 = Method9344(new File(Signlink.cacheDirectory() + "data.dat"));
         }
      } catch (IOException var3) {
         var3.printStackTrace();
      }

      this.Method9343(var1);
   }

   private void Method9343(byte[] var1) {
      Packet var2;
      int var3 = (var2 = new Packet(var1)).Method403();
      int var4;
      byte[] var5;
      if ((var4 = var2.Method403()) == 0) {
         var5 = new byte[var3];
         byte[] var7 = new byte[var3];
         System.arraycopy(var1, 6, var5, 0, var1.length - 6);

         try {
            (new DataInputStream(new GZIPInputStream(new ByteArrayInputStream(var5)))).readFully(var7, 0, var7.length);
         } catch (Exception var6) {
            var6.printStackTrace();
         }

         this.Field2892 = var7;
         var2 = new Packet(this.Field2892);
         this.Field2898 = true;
      } else if (var4 != var3) {
         Class443.Method7788(var5 = new byte[var3], var3, var1, var4, 6);
         this.Field2892 = var5;
         var2 = new Packet(this.Field2892);
         this.Field2898 = true;
      } else {
         this.Field2892 = var1;
         this.Field2898 = false;
      }

      this.Field2893 = var2.g2();
      this.Field2894 = new int[this.Field2893];
      this.Field2895 = new int[this.Field2893];
      this.Field2896 = new int[this.Field2893];
      this.Field2897 = new int[this.Field2893];
      int var8 = var2.pos + this.Field2893 * 10;

      for(var3 = 0; var3 < this.Field2893; ++var3) {
         this.Field2894[var3] = var2.Method404();
         this.Field2895[var3] = var2.Method403();
         this.Field2896[var3] = var2.Method403();
         this.Field2897[var3] = var8;
         var8 += this.Field2896[var3];
      }

   }

   public static byte[] Method9344(File var0) {
      FileInputStream var1 = new FileInputStream(var0);
      byte[] var2 = new byte[(int)var0.length()];

      int var3;
      int var4;
      for(var3 = 0; var3 < var2.length && (var4 = var1.read(var2, var3, var2.length - var3)) >= 0; var3 += var4) {
         ;
      }

      if (var3 < var2.length) {
         throw new IOException("Could not completely read file " + var0.getName());
      } else {
         var1.close();
         return var2;
      }
   }

   public final byte[] readConfig(String var1) {
      Object var2 = null;
      int var4 = 0;
      var1 = var1.toUpperCase();

      int var3;
      for(var3 = 0; var3 < var1.length(); ++var3) {
         var4 = var4 * 61 + var1.charAt(var3) - 32;
      }

      for(var3 = 0; var3 < this.Field2893; ++var3) {
         if (this.Field2894[var3] == var4) {
            byte[] var5 = new byte[this.Field2895[var3]];
            if (!this.Field2898) {
               Class443.Method7788(var5, this.Field2895[var3], this.Field2892, this.Field2896[var3], this.Field2897[var3]);
            } else {
               System.arraycopy(this.Field2892, this.Field2897[var3], var5, 0, this.Field2895[var3]);
            }

            return var5;
         }
      }

      return null;
   }
}
