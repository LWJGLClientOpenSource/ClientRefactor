package net.LWJGLClient.client.b.a.a;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ColorModel;
import java.awt.image.DirectColorModel;
import java.awt.image.ImageConsumer;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.util.Hashtable;
import net.LWJGLClient.client.b.b.GraphicsDisplay;

public final class Class290 extends GraphicsBuffer implements ImageObserver, ImageProducer {
   private ColorModel Field238;
   private ImageConsumer Field239;

   public final synchronized void removeConsumer(ImageConsumer var1) {
      if (this.Field239 == var1) {
         this.Field239 = null;
      }

   }

   public final boolean imageUpdate(Image var1, int var2, int var3, int var4, int var5, int var6) {
      return true;
   }

   public final void Method3035(Component var1, int var2, int var3, boolean var4) {
      this.Method3036(var1, var2, var3, false);
   }

   public final void Method3036(Component var1, int var2, int var3, boolean var4) {
      this.Field12007 = var2;
      this.Field243 = var3;
      if (!GraphicsDisplay.Field2678) {
         this.Field242 = new int[var3 * var2 + 1];
         this.Field238 = new DirectColorModel(32, 16711680, 65280, 255);
         this.Field240 = var1.createImage(this);
         this.Method3037();
         var1.prepareImage(this.Field240, this);
         if (var4) {
            this.startProduction((ImageConsumer)null);
         }
      }

      this.Method13683();
   }

   public final void startProduction(ImageConsumer var1) {
      if (!GraphicsDisplay.Field2678) {
         this.addConsumer(var1);
      }
   }

   private synchronized void Method3037() {
      if (this.Field239 != null) {
         this.Field239.setPixels(0, 0, this.Field12007, this.Field243, this.Field238, this.Field242, 0, this.Field12007);
         this.Field239.imageComplete(2);
      }

   }

   public final synchronized void addConsumer(ImageConsumer var1) {
      if (!GraphicsDisplay.Field2678) {
         this.Field239 = var1;
         var1.setDimensions(this.Field12007, this.Field243);
         var1.setProperties((Hashtable)null);
         var1.setColorModel(this.Field238);
         var1.setHints(14);
      }
   }

   public final void requestTopDownLeftRightResend(ImageConsumer var1) {
   }

   public final void Method3038(int var1, Graphics var2, int var3) {
      if (!GraphicsDisplay.Field2678) {
         this.Method3037();
         var2.drawImage(this.Field240, var3, var1, this);
      }
   }

   public final synchronized boolean isConsumer(ImageConsumer var1) {
      return var1 == this.Field239;
   }
}
