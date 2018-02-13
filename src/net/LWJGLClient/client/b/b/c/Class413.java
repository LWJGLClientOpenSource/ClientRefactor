package net.LWJGLClient.client.b.b.c;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import net.LWJGLClient.client.b.b.GraphicsDisplay;
import net.LWJGLClient.client.b.b.b.Class745;
import net.LWJGLClient.client.b.b.b.a.AssetLoader;
import net.LWJGLClient.client.b.b.b.a.ModelVBO;
import net.LWJGLClient.client.b.b.f.Class842;
import net.LWJGLClient.client.b.b.f.Class843;
import net.LWJGLClient.client.model.Client;
import net.LWJGLClient.client.model.a.d.Class449;
import net.LWJGLClient.client.model.a.d.ParticleDefinition;
import org.lwjgl.opengl.GL11;

public final class Class413 extends AssetLoader {
   private List Field3257 = new LinkedList();
   private ModelVBO Field3258 = new ModelVBO(0);
   private List Field3259 = new LinkedList();
   private List Field3260 = new LinkedList();
   private double Field3261 = 0.0D;

   public Class413(ParticleDefinition var1) {
      new Random(System.currentTimeMillis());
   }

   public final int Method7368() {
      return this.Field3257.size();
   }

   public final void Method7369(Class449 var1) {
      if (this.Field3257.size() - 1 < ParticleDefinition.Method7805()) {
         this.Field3257.add(var1);
      }

   }

   public final int Method7370() {
      return this.Field3258 == null ? 0 : 3;
   }

   public final void Method7371(double var1) {
      this.Field3261 += var1;
      if (this.Field3261 > 1.0D) {
         double var3 = this.Field3261 / 8.0D;
         this.Field3261 = 0.0D;
         if (this.Field3257.size() > 0 && !GraphicsDisplay.Method1029()) {
            int var28 = this.Field3258.Method12370();
            int var2 = this.Field3258.Method12371();
            int var5 = this.Field3258.Method12375();
            if (var28 == 0) {
               int[] var6;
               var28 = (var6 = Class842.Method13977(3))[0];
               var2 = var6[1];
               var5 = var6[2];
            }

            Collections.sort(this.Field3257, new Class421(this));
            int var29 = 0;
            this.Method12367(ParticleDefinition.Method7805() * 3);
            this.Field3260.clear();
            int var7 = ((Class449)this.Field3257.get(0)).Method12351();
            int var8 = 0;
            Iterator var10 = this.Field3257.iterator();

            while(var10.hasNext()) {
               Class449 var9 = (Class449)var10.next();
               boolean var10000;
               if (var9 == null) {
                  var10000 = false;
               } else if (!var9.compareTo(var3)) {
                  this.Field3259.add(var9);
                  var10000 = false;
               } else {
                  var10000 = true;
               }

               if (var10000) {
                  double var13;
                  if ((var13 = (double)var9.Method7823()) < 0.01D) {
                     this.Field3259.add(var9);
                  } else {
                     float var11 = var9.Method7825().Method7833();
                     float var12 = var9.Method7825().Method7835();
                     float var15 = var9.Method7825().Method7834();
                     int var16;
                     int var17 = (var16 = var9.Method7826()) >> 16 & 255;
                     int var18 = var16 >> 8 & 255;
                     var16 &= 255;
                     if (this.Field1933.remaining() < 3) {
                        break;
                     }

                     int var19;
                     if ((var19 = var9.Method12351()) != var7) {
                        this.Field3260.add(new int[]{var7, var8});
                        var7 = var19;
                        var8 = 0;
                     }

                     this.Field1933.put(var11);
                     this.Field1933.put(var12);
                     this.Field1933.put(var15);
                     this.Field1934.put((byte)var17);
                     this.Field1934.put((byte)var18);
                     this.Field1934.put((byte)var16);
                     this.Field1934.put((byte)((int)(var13 * 255.0D)));
                     float var30;
                     if ((var30 = var9.Method7827()) < 0.1F) {
                        var30 = 0.1F;
                     } else if (var30 > 1000.0F) {
                        var30 = 1000.0F;
                     }

                     this.Field1935.put(var30 * GraphicsDisplay.Method1040());
                     this.Field1935.put(var30 * GraphicsDisplay.Method1040());
                     ++var29;
                     ++var8;
                  }
               }
            }

            this.Field3257.removeAll(this.Field3259);
            this.Field3259.clear();
            this.Field1933.flip();
            this.Field1934.flip();
            this.Field1935.flip();
            this.Field3260.add(new int[]{var7, var8});
            this.Method12368(this.Field3258, var28, var2, var5, true, 35048);
            this.Field3258.Method12376(var28, var2, var5, var29, -2L, true, -1, true, this.Field3260, 0);
            this.Field3258.Field1904 = true;
         }
      }
   }

   public final void Method7372(boolean var1) {
      if (this.Method7368() > 0) {
         float var2;
         if ((var2 = (float) Client.Field12070 / 8192.0F / GraphicsDisplay.Method1040() * 0.5F) > 1.0F) {
            var2 = (float)Math.sqrt((double)var2);
         } else if (var2 < 0.1F) {
            var2 = 0.1F;
         }

         GL11.glAlphaFunc(516, 0.01F);
         if (!var1) {
            GL11.glDepthMask(false);
         }

         Class745.Method12486(!var1 ? 1.0F : var2);
         Class745.Method12487(-1, var1, this.Field3258);
         if (!var1) {
            GL11.glDepthMask(true);
         }

      }
   }

   public final void Method7373() {
      this.Method7374();
      Class843.Method14010(this.Field3258);
   }

   public final void Method7374() {
      this.Field3257.clear();
   }
}
