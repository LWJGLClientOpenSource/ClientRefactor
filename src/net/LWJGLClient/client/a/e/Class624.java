package net.LWJGLClient.client.a.e;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.HashMap;
import java.util.Map;

import net.LWJGLClient.client.c.b.Class280;
import net.LWJGLClient.client.Signlink;
import net.LWJGLClient.client.model.Client;

public final class Class624 {
   private String Field2899 = Signlink.cacheDirectory() + "/";
   private RandomAccessFile Field2900 = null;
   private RandomAccessFile Field2901 = null;
   private Map Field2902 = null;
   private int Field2903 = 0;

   public Class624() throws Exception {
      try {
         this.Field2902 = new HashMap();
         this.Field2900 = new RandomAccessFile(this.Field2899 + "main_file_cache2.dat", "rw");
         this.Field2901 = new RandomAccessFile(this.Field2899 + "main_file_cache.idx250", "rw");
         this.Method9347();
      } catch (IOException var2) {
         var2.printStackTrace();
      }
   }

   private static boolean Method9346(File var0) {
      if (var0.isDirectory()) {
         String[] var1 = var0.list();

         for(int var2 = 0; var2 < var1.length; ++var2) {
            if (!Method9346(new File(var0, var1[var2]))) {
               return false;
            }
         }
      }

      return var0.delete();
   }

   private void Method9347() throws Exception{
      this.Field2901.seek(0L);
      if (this.Field2901.length() == 0L) {
         Method9346(new File(Signlink.cacheDirectory() + "/Sprites"));
         this.Field2901.writeInt(0);
      } else {
         this.Field2903 = this.Field2901.readInt();
         long var1 = 0L;

         for(int var3 = 0; var3 < this.Field2903; ++var3) {
            byte[] var4 = new byte[this.Field2901.readByte() & 255];
            this.Field2901.read(var4);
            String var7 = new String(var4);
            int var5 = this.Field2901.readInt();
            long[] var6 = new long[]{var1, var1 + (long)var5};
            this.Field2902.put(var7, var6);
            var1 += (long)var5;
         }

      }
   }

   public final byte[] Method9348(String var1) throws Exception {
      return this.Method9349("/Sprites/" + var1);
   }

   private synchronized byte[] Method9349(String var1) throws Exception {
      return this.Method9350(var1, false);
   }

   public final synchronized byte[] Method9350(String var1, boolean var2) throws Exception {
      long[] var3;
      if ((var3 = (long[])this.Field2902.get(var1)) == null) {
         byte[] var11;
         if ((var11 = var2 ? Class280.Method2988().Method3004().Method3016(var1, 10) : Class280.Method2988().Method3004().Method3015(var1, 10)) != null) {
            this.Method9351(var1, var11);
         }

         return var11;
      } else {
         long var4 = var3[0];
         long var6;
         byte[] var10 = new byte[(int)((var6 = var3[1]) - var4)];
         this.Field2900.seek(var4);
         this.Field2900.read(var10);
         return var10;
      }
   }

   private synchronized boolean Method9351(String var1, byte[] var2) {
      try {
         long var3 = this.Field2900.length();
         int var5 = var2.length;
         byte[] var6;
         if ((var6 = var1.getBytes(Client.Field12122)).length >= 255) {
            System.err.println("[FileLoader]: Invalid identifier: " + var1);
            return false;
         } else {
            this.Field2900.seek(this.Field2900.length());
            this.Field2901.seek(this.Field2901.length());
            this.Field2900.write(var2);
            this.Field2901.writeByte(var6.length);
            this.Field2901.write(var6);
            this.Field2901.writeInt(var5);
            this.Field2901.seek(0L);
            this.Field2901.writeInt(++this.Field2903);
            long[] var8 = new long[]{var3, var3 + (long)var5};
            this.Field2902.put(var1, var8);
            return true;
         }
      } catch (IOException var7) {
         var7.printStackTrace();
         return false;
      }
   }
}
