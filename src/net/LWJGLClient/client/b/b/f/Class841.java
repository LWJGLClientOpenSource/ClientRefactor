package net.LWJGLClient.client.b.b.f;

import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.IOException;
import java.net.URL;
import java.nio.ByteBuffer;
import javax.imageio.ImageIO;
import org.lwjgl.BufferUtils;

public class Class841 {
   public static ByteBuffer Method13973(String var0, int var1) {
      URL var21 = Class841.class.getResource(var0);

      try {
         BufferedImage var22 = ImageIO.read(var21);
         Graphics2D var2;
         BufferedImage var23;
         (var2 = (var23 = new BufferedImage(var1, var1, 3)).createGraphics()).setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
         double var16;
         if (var22.getWidth() > var23.getWidth()) {
            var16 = (double)var23.getWidth() / (double)var22.getWidth();
         } else {
            var16 = (double)(var23.getWidth() / var22.getWidth());
         }

         double var18;
         if (var22.getHeight() > var23.getHeight()) {
            if ((var18 = (double)var23.getHeight() / (double)var22.getHeight()) < var16) {
               var16 = var18;
            }
         } else if ((var18 = (double)(var23.getHeight() / var22.getHeight())) < var16) {
            var16 = var18;
         }

         double var10 = (double)var22.getWidth() * var16;
         double var12 = (double)var22.getHeight() * var16;
         var2.drawImage(var22, (int)(((double)var23.getWidth() - var10) / 2.0D), (int)(((double)var23.getHeight() - var12) / 2.0D), (int)var10, (int)var12, (ImageObserver)null);
         var2.dispose();
         return Method13974(var23);
      } catch (IOException var20) {
         var20.printStackTrace();
         return null;
      }
   }

   private static ByteBuffer Method13974(BufferedImage var0) {
      byte[] var1 = new byte[var0.getWidth() * var0.getHeight() << 2];
      int var2 = 0;

      for(int var3 = 0; var3 < var0.getHeight(); ++var3) {
         for(int var4 = 0; var4 < var0.getWidth(); ++var4) {
            int var5 = var0.getRGB(var4, var3);
            var1[var2] = (byte)(var5 << 8 >> 24);
            var1[var2 + 1] = (byte)(var5 << 16 >> 24);
            var1[var2 + 2] = (byte)((byte)var5);
            var1[var2 + 3] = (byte)(var5 >> 24);
            var2 += 4;
         }
      }

      ByteBuffer var6;
      (var6 = BufferUtils.createByteBuffer(var1.length)).put(var1);
      var6.flip();
      return var6;
   }
}
