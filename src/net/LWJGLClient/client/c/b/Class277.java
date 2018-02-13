package net.LWJGLClient.client.c.b;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.URLConnection;

import net.LWJGLClient.client.Signlink;
import net.LWJGLClient.client.b.b.GraphicsDisplay;
import net.LWJGLClient.client.model.Client;

public final class Class277 implements Class274 {
   public static URLConnection Method2979(URL var0, int var1) {
      int var2 = 0;

      while(var2 < var1) {
         try {
            int var3 = var2 == 0 ? 2 : 1;
            URLConnection var4;
            (var4 = var0.openConnection()).setDoOutput(false);
            var4.setAllowUserInteraction(false);
            var4.setConnectTimeout(var3 * 2500);
            var4.setReadTimeout(var3 * 2500);
            var4.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows; U; Windows NT 6.0; en-US; rv:1.9.1.2) Gecko/20090729 Firefox/3.5.2 (.NET CLR 3.5.30729)");
            var4.connect();
            return var4;
         } catch (Exception var5) {
            var5.printStackTrace();
            ++var2;
         }
      }

      throw new IOException("connect error");
   }

   private static boolean Method2980(String var0) {
      int var1 = 0;

      while(var1++ < 5) {
         try {
            URLConnection var2 = Method2979(new URL(var0), 10);
            if ((new BufferedReader(new InputStreamReader(var2.getInputStream()))).readLine().equals("update")) {
               return true;
            }
         } catch (MalformedURLException var3) {
            var3.printStackTrace();
         } catch (IOException var4) {
            var4.printStackTrace();
         }
      }

      return false;
   }

   public final byte[] Method2981(String var1, int var2, String var3, int var4) {
      File var5;
      if (!(var5 = new File(Signlink.cacheDirectory() + "/" + var1)).exists()) {
         return this.Method2982(var1, 0, var3, 32768);
      } else {
         return Method2980(var3 + "update.php?file=" + var1 + "&size=" + var5.length()) ? this.Method2982(var1, 0, var3, 32768) : null;
      }
   }

   public final byte[] Method2982(String var1, int var2, String var3, int var4) {
      boolean var5 = var1.startsWith("0") || var1.contains("Sprite") || var1.startsWith("public");
      if (var2 >= 2) {
         return null;
      } else {
         String var7 = var1.replace("/", " ").replace("Sprites", "").replace(".png", "").replace("_", "").replaceAll("  ", "").trim();

         URL var6;
         try {
            String var8 = var3 + "/" + var1.replaceAll("//", "/").replaceAll("//", "/").replaceAll("//", "/");
            var6 = new URL(var8);
         } catch (MalformedURLException var33) {
            var33.printStackTrace();
            return null;
         }

         URLConnection var37;
         try {
            var37 = Method2979(var6, 1);
         } catch (IOException var32) {
            var32.printStackTrace();
            return null;
         }

         InputStream var39;
         try {
            var39 = var37.getInputStream();
         } catch (SocketTimeoutException var29) {
            System.err.println("Timeout: " + var1);
            var29.printStackTrace();
            return null;
         } catch (FileNotFoundException var30) {
            return new byte[]{0, 1, 2, 3, 4};
         } catch (IOException var31) {
            System.err.println("Cache Updater, File: " + var1);
            var31.printStackTrace();
            return null;
         }

         int var9 = 0;
         byte[] var38 = new byte[var37.getContentLength()];

         try {
            while(true) {
               byte[] var10 = new byte[var4];
               int var11 = var39.read(var10, 0, var10.length);
               float var12 = (float)var9 / (float)var38.length * 100.0F;
               double var15 = (double)((float)var38.length / 1024.0F);
               if (var5) {
                  if (GraphicsDisplay.Field2678) {
                     Client.Field12183.Method13306((int)var12, "Downloading " + var7);
                  } else {
                     Client.Field12183.drawLoadingText((int)var12, "Downloading " + var7 + "  -   " + (int)((float)var9 / 1024.0F) + " / " + (int)var15 + " KB  [" + (int)var12 + "%]");
                  }
               }

               if (var11 == -1) {
                  if (var9 == var38.length) {
                     return var38;
                  }

                  byte[] var36 = this.Method2982(var1, var2 + 1, var3, var4);
                  return var36;
               }

               System.arraycopy(var10, 0, var38, var9, var11);
               var9 += var11;
            }
         } catch (Exception var34) {
            System.err.println("pos: " + var9 + ", len: " + var38.length);
            var34.printStackTrace();
         } finally {
            try {
               var39.close();
            } catch (IOException var28) {
               var28.printStackTrace();
            }

         }

         return null;
      }
   }
}
