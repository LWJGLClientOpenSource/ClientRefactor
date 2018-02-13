package net.LWJGLClient.client.model.e;

import java.io.ByteArrayInputStream;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;
import javax.sound.sampled.FloatControl.Type;

public final class Class323 {
   private Clip Field9354;
   private float Field9355 = 0.0F;
   private float Field9356 = 0.0F;
   private int Field9357 = 0;
   private static ExecutorService Field9358 = Executors.newFixedThreadPool(1);

   public final void Method3356(float var1) {
      this.Field9356 = var1;
   }

   private void Method3357(float var1) {
      if (var1 >= 0.0F && var1 <= 1.0F) {
         this.Field9355 = var1;

         try {
            if (this.Field9354 != null) {
               ((FloatControl)this.Field9354.getControl(Type.MASTER_GAIN)).setValue(20.0F * (float)Math.log10((double)var1));
               return;
            }
         } catch (Exception var3) {
            var3.printStackTrace();
         }

      } else {
         throw new IllegalArgumentException("Volume not valid: " + var1);
      }
   }

   public final void Method3358(byte[] var1, int var2) {
      ByteArrayInputStream var8 = new ByteArrayInputStream(var1);
      if (var2 == this.Field9357) {
         int var3 = var2;
         ByteArrayInputStream var10 = var8;
         Class323 var9 = this;
         if (var3 == this.Field9357) {
            Future var11 = Field9358.submit(new Class106(this, var10));
            if (this.Field9354 != null) {
               this.Method3360(0.0F, var3);
               this.Method3357(0.0F);
               this.Method3362();
            }

            if (var3 != this.Field9357) {
               var11.cancel(true);
               return;
            }

            try {
               var9.Field9354 = (Clip)var11.get();
            } catch (InterruptedException var6) {
               var6.printStackTrace();
            } catch (ExecutionException var7) {
               var7.printStackTrace();
            }

            this.Method3357(0.0F);
            if (this.Field9354 != null && var3 == this.Field9357) {
               this.Field9354.start();
               this.Field9354.loop(-1);
               this.Field9354.setFramePosition(0);
               this.Field9355 = 0.0F;
               this.Method3360(this.Field9356, var3);
               this.Method3357(this.Field9356);
            } else {
               System.out.println("Couldn't load sound");
            }

            var11.cancel(true);
         }
      }

   }

   public final int Method3359() {
      ++this.Field9357;
      return this.Field9357;
   }

   private void Method3360(float var1, int var2) {
      this.Method3361(var1, var2, true);
   }

   public final void Method3361(float var1, int var2, boolean var3) {
      float var6 = var1 >= this.Field9355 ? 1.0F : -1.0F;
      float var4 = var1 < this.Field9355 ? 75.0F : 150.0F;

      for(var6 = var6 * 2.0F * ((var1 > this.Field9355 ? var1 : this.Field9355) / var4); (int)(this.Field9355 * 100.0F) != (int)(var1 * 100.0F) && var2 == this.Field9357; this.Method3357(var4)) {
         try {
            Thread.sleep(30L);
         } catch (InterruptedException var5) {
            var5.printStackTrace();
         }

         var4 = var6;
         if (this.Field9355 < 0.1F && var6 < 0.0F) {
            var4 = var6 / 8.0F;
         }

         if ((var4 += this.Field9355) > 1.0F) {
            var4 = 1.0F;
         } else if (var4 < 0.0F) {
            var4 = 0.0F;
         }
      }

      if (var2 != this.Field9357 && this.Field9354 != null) {
         this.Field9354.close();
         this.Field9354 = null;
      } else {
         this.Method3357(var1);
      }
   }

   public final void Method3362() {
      if (this.Field9354 != null) {
         this.Field9354.close();
      }

      this.Field9354 = null;
   }
}
