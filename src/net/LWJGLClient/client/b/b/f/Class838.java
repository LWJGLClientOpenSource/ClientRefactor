package net.LWJGLClient.client.b.b.f;

import java.nio.ByteBuffer;

import net.LWJGLClient.client.b.b.b.a.ModelVBO;
import net.LWJGLClient.client.b.b.b.a.a.AtlasModelLoader;
import net.LWJGLClient.client.b.b.b.a.b.ModelLoader;
import net.LWJGLClient.client.b.b.f.c.Class598;
import net.LWJGLClient.client.d.SceneGraph;
import net.LWJGLClient.client.b.b.GraphicsDisplay;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;

public final class Class838 {
   public static AtlasModelLoader Field6955 = new AtlasModelLoader();
   public static ModelLoader Field6956 = new ModelLoader();
   private static ByteBuffer Field6957 = BufferUtils.createByteBuffer(8294400);

   public static int Method13931(byte[] var0, int var1, int var2, int var3) {
      for(var3 = var2 - 1; var3 >= 0; --var3) {
         for(int var4 = 0; var4 < var1; ++var4) {
            byte var5 = var0[var3 * var1 + var4];
            Field6957.put((byte)-1);
            Field6957.put((byte)-1);
            Field6957.put((byte)-1);
            if (var5 > 0 && var5 < 16777215) {
               Field6957.put((byte)-6);
            } else {
               Field6957.put((byte)0);
            }
         }
      }

      Field6957.flip();
      var3 = Class842.Method13979(Class842.Field3812);
      GL11.glBindTexture(3553, var3);
      GL11.glTexParameteri(3553, 10242, 10496);
      GL11.glTexParameteri(3553, 10243, 10496);
      GL11.glTexParameteri(3553, 10241, 9728);
      GL11.glTexParameteri(3553, 10240, 9728);
      GL11.glTexImage2D(3553, 0, 6408, var1, var2, 0, 6408, 5121, Field6957);
      Field6957.clear();
      return var3;
   }

   public static void Method13932(long var0, int var2, int var3, int var4, int var5, int var6, int var7, ModelVBO var8, float var9, float var10, float var11) {
      Class843.Method14004(var0, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11);
   }

   public static void Method13933(long var0, int var2, int var3, int var4, int var5, int var6, int var7, ModelVBO var8, float var9, float var10, float var11) {
      Class843.Method14003(var0, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11);
   }

   public static void Method13934(long var0, int var2, int var3, int var4, int var5, int var6, int var7, ModelVBO var8, int var9) {
      Class843.Method14002(var0, var2, var3, var4, var5, var6, var7, var8, var9);
   }

   public static boolean Method13935(int var0, SceneGraph var1, int var2, int var3, int var4, boolean var5, boolean var6) {
      boolean var10000 = Class843.Field3772;
      Class598 var9 = Class843.Field3769;
      ModelLoader var7 = Field6956;
      ModelVBO var8;
      if ((var8 = Field6956.Method10098(var0, var1, var2, var3, var4, var5)) != null) {
         var8.Field1911 = var6;
         if (!var5) {
            Class843.Method14006(var8.Method12374(), var8);
         }
      }

      return var8 != null;
   }

   public static void Method13936() {
      Field6955.Method10103();
   }

   public static int Method13937(int[] var0, int var1, int var2, int var3, boolean var4, int var5) {
      var3 = Class842.Method13979(var4 ? Class842.Field3815 : Class842.Field3814);
      return Method13938(false, var3, var0, var1, var2, 255, var4, var5);
   }

   public static int Method13938(boolean var0, int var1, int[] var2, int var3, int var4, int var5, boolean var6, int var7) {
      boolean var8 = false;

      int var9;
      int var10;
      for(var9 = var4 - 1; var9 >= 0; --var9) {
         for(var10 = 0; var10 < var3; ++var10) {
            if (var2[var9 * var3 + var10] >>> 24 > 0) {
               var8 = true;
               break;
            }
         }
      }

      if (var6) {
         var8 = false;
      }

      for(var10 = var4 - 1; var10 >= 0; --var10) {
         for(int var11 = 0; var11 < var3; ++var11) {
            int var12;
            var9 = var12 = var2[var10 * var3 + var11];
            int var13 = var5;
            if (var9 == 0 || var9 == -1) {
               var5 = 256;
            }

            Field6957.put((byte)(var12 >> 16));
            Field6957.put((byte)(var12 >> 8));
            Field6957.put((byte)var12);
            if (var5 != 0 && (var5 != 255 || !var8)) {
               Field6957.put((byte)var5);
            } else {
               Field6957.put((byte)(var12 >>> 24));
            }

            var5 = var13;
         }
      }

      Field6957.flip();
      GL11.glBindTexture(3553, var1);
      if (var0) {
         GL11.glTexSubImage2D(3553, 0, 0, 0, var3, var4, 6408, 5121, Field6957);
      } else {
         if (GraphicsDisplay.Field2673 && var6) {
            GL11.glTexParameteri(3553, 10242, 10497);
            GL11.glTexParameteri(3553, 10243, 10497);
            GL11.glTexParameteri(3553, 10241, 9987);
            GL11.glTexParameteri(3553, 10240, 9729);
            GL11.glTexParameteri(3553, 33169, 1);
            GraphicsDisplay.Method997().Method1035("error in loadTextureRGBA1(mipmap, " + var1 + ", " + var7 + ", " + var3 + ", " + var4 + ")");
         } else {
            GL11.glTexParameteri(3553, 10242, 10497);
            GL11.glTexParameteri(3553, 10243, 10497);
            GL11.glTexParameteri(3553, 10241, 9728);
            GL11.glTexParameteri(3553, 10240, 9728);
            GL11.glTexParameteri(3553, 33169, 0);
            GraphicsDisplay.Method997().Method1035("error in loadTextureRGBA2(no_mipmap, " + var1 + ", " + var7 + ", " + var3 + ", " + var4 + ")");
         }

         GL11.glTexImage2D(3553, 0, 6408, var3, var4, 0, 6408, 5121, Field6957);
      }

      Field6957.clear();
      GraphicsDisplay.Method997().Method1035("[GraphicsDisplay]: loadTextureRGBA(" + var1 + ", " + var7 + ", " + var0 + ", " + var3 + ", " + var4 + ", " + GraphicsDisplay.screenResolutionWidth + ")");
      return var1;
   }
}
