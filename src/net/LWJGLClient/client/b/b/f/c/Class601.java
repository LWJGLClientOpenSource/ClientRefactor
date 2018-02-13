package net.LWJGLClient.client.b.b.f.c;

import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;
import net.LWJGLClient.client.a.d.RgbImage;
import net.LWJGLClient.client.a.d.Class120;
import net.LWJGLClient.client.b.Rasterizer;
import net.LWJGLClient.client.b.b.GraphicsDisplay;
import net.LWJGLClient.client.b.b.b.a.Texture;
import net.LWJGLClient.client.b.b.b.a.a.Class647;
import net.LWJGLClient.client.b.b.f.Class842;
import net.LWJGLClient.client.b.b.f.Class843;
import org.lwjgl.BufferUtils;
//import org.lwjgl.opengl.Class344;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL30;

public final class Class601 {
   public static int Field9002 = 0;
   private boolean Field9003;
   private boolean Field9004;
   private boolean Field9005;
   private int Field9006;
   private int Field9007;
   private int Field9008;
   private int Field9009;
   private int Field9010;
   private int Field9011;
   private static ByteBuffer Field9012 = BufferUtils.createByteBuffer(262144);
   private Map Field9013;
   private int Field9014;
   private int Field9015;
   private int Field9016;

   public final boolean Method9134() {
      return this.Field9004;
   }

   public final int Method9135() {
      return this.Field9007;
   }

   public final int Method9136() {
      return this.Field9014;
   }

   public final int Method9137() {
      if (this.Field9014 == 0) {
         this.Method9142(true, false);
      }

      return this.Field9014;
   }

   public final int[] Method9138(long var1) {
      return (int[])this.Field9013.get(var1);
   }

   public Class601(int var1, int var2) {
      this(512, 16, 0);
   }

   private Class601(int var1, int var2, int var3) {
      this(var1, var2, 0, (Class598)null);
   }

   private Class601(int var1, int var2, int var3, Class598 var4) {
      this(var1, var2, var3, (Class598)null, false);
   }

   public Class601(int var1, int var2, int var3, Class598 var4, boolean var5) {
      this.Field9003 = false;
      this.Field9004 = false;
      this.Field9008 = 0;
      this.Field9013 = null;
      this.Field9014 = 0;
      this.Field9015 = 0;
      this.Field9016 = 0;
      if (Field9002 >= 1000) {
         String var6 = "More than 1.000 texture atlases created. Program exited to avoid GPU memory leaks. Try disabling VBO Mode if this issue persists.";
         GraphicsDisplay.Method997().Method1037(var6);
         throw new RuntimeException(var6);
      } else {
         this.Field9008 = var1 / var2 << 1;
         this.Field9007 = this.Field9008;
         this.Field9009 = var1;
         this.Field9010 = var2;
         this.Field9011 = var1 * var1;
         this.Field9013 = new HashMap();
         ++Field9002;
         this.Field9006 = var3;
         this.Field9005 = var5;
         if (var5 && this.Field9006 == 1) {
            this.Method9148();
         }

      }
   }

   public final int Method9139() {
      return this.Field9009;
   }

   public final int Method9140() {
      return this.Field9010;
   }

   private static void Method9141() {
      if (GraphicsDisplay.Field2663) {
         GL30.glGenerateMipmap(3553);
         GL11.glTexParameteri(3553, 33085, 16);
      } else if (GraphicsDisplay.Method1000()) {
         GL11.glTexParameteri(3553, 33169, 0);
         GL11.glTexParameteri(3553, 33085, 0);
      } else {
         GL11.glTexParameteri(3553, 33169, 1);
         GL11.glTexParameteri(3553, 33085, 16);
      }

      GraphicsDisplay.Method997().Method1035("[TextureAtlas]: setupMipmapping()");
   }

   private void Method9142(boolean var1, boolean var2) {
      Field9012.clear();
      if (!GraphicsDisplay.Field2662) {
         var1 = false;
      }

      if (this.Field9014 == 0) {
         int var3 = Class842.Method13979(Class842.Field3811);
         GL11.glBindTexture(3553, var3);
         if (var2) {
            GL11.glTexParameteri(3553, 33085, 0);
            GL11.glTexParameteri(3553, 10242, 33071);
            GL11.glTexParameteri(3553, 10243, 33071);
            GL11.glTexParameteri(3553, 10241, 9987);
            GL11.glTexParameteri(3553, 10240, 9729);
            GL11.glTexParameteri(3553, 33169, 0);
         } else if (!var1) {
            GL11.glTexParameteri(3553, 10242, 33071);
            GL11.glTexParameteri(3553, 10243, 33071);
            GL11.glTexParameteri(3553, 10241, 9728);
            GL11.glTexParameteri(3553, 10240, 9728);
            GL11.glTexParameteri(3553, 33169, 0);
         } else {
            GL11.glTexParameteri(3553, 10242, 33071);
            GL11.glTexParameteri(3553, 10243, 33071);
            GL11.glTexParameteri(3553, 10241, 9987);
            GL11.glTexParameteri(3553, 10240, 9729);
         }

         this.Field9014 = var3;
         GL11.glTexImage2D(3553, 0, 6408, this.Field9009, this.Field9009, 0, 6408, 5121, (ByteBuffer)null);
         if (!var2 && var1) {
            Method9141();
         }
      } else {
         GL11.glBindTexture(3553, this.Field9014);
      }

      GraphicsDisplay.Method997().Method1035("error in TextureAtlas.bindBuffer(mipmap: " + var1 + ", texture: " + this.Field9005 + ", " + this.Field9009 + ", " + this.Field9010 + ")");
   }

   private boolean Method9143(boolean var1, int var2, int var3) {
      var3 = this.Field9010;
      int var4 = this.Field9010;
      if (var1) {
         boolean var10000 = Class843.Field3772;
      }

      if (var2 > 0 && Texture.Field1931[var2]) {
         var3 <<= 1;
         var4 <<= 1;
      } else if (this.Field9003 && this.Field9016 == 0) {
         var4 = this.Field9010 << 1;
      }

      if (this.Field9015 + var3 < this.Field9009) {
         this.Field9015 += var3;
         --this.Field9008;
         return true;
      } else if (this.Field9016 + var4 < this.Field9009) {
         this.Field9016 += var4;
         this.Field9015 = 0;
         --this.Field9008;
         return true;
      } else {
         this.Field9008 = 0;
         this.Field9004 = true;
         return false;
      }
   }

   public final int[] Method9144(long var1, RgbImage var3, int var4, int var5, int var6, boolean var7) {
      if (var3 == null) {
         return null;
      } else {
         int[] var9;
         if ((var9 = (int[])this.Field9013.get(var1)) != null && !var7) {
            return var9;
         } else {
            var3.Method9428();
            int[] var8 = this.Method9146(var1, var3.Field9893, 255, var5, var6, var7, false, 0, false);
            var3.Method14450();
            return var8;
         }
      }
   }

   public final boolean Method9145(long var1) {
      return this.Field9013.get(var1) != null;
   }

   public final int[] Method9146(long var1, int[] var3, int var4, int var5, int var6, boolean var7, boolean var8, int var9, boolean var10) {
      if (var8) {
         var1 = (long)var9;
      }

      int[] var11;
      if ((var11 = (int[])this.Field9013.get(var1)) != null && !var7) {
         return var11;
      } else if (this.Field9004 && !var7) {
         System.err.println("[TextureAtlas]: too large texture object: " + var9 + ", " + (var3 == null ? 0 : var3.length) + "/" + this.Field9011);
         return null;
      } else {
         boolean var12 = false;
         if (var3 == null && var8) {
            if (var9 > 0) {
               var3 = Rasterizer.Method9429(var9);
            }

            if (var3 == null) {
               var3 = new int[var5 * var6];
               var12 = true;
               if (var9 > 0) {
                  Class600.Method9132(new Class647(this, var5, var6, var9, var10));
               }
            }
         }

         if (var8 && var7 && var11 == null) {
            return null;
         } else {
            this.Method9142(var8, false);
            var10 = false;
            int var14;
            if (!var8) {
               if (var3 == null) {
                  return null;
               }

               for(int var13 = var6 - 1; var13 >= 0; --var13) {
                  for(var14 = 0; var14 < var5; ++var14) {
                     if (var3[var13 * var5 + var14] >>> 24 > 0) {
                        var10 = true;
                        break;
                     }
                  }
               }
            }

            boolean var19 = false;
            var14 = 0;
            if (var8 && var9 >= 0 && !var12) {
               if (var9 == 970) {
                  var19 = true;
               }

               Class120 var15;
               if (Class120.Field9548 != null && (var15 = Class120.Field9548[var9]) != null) {
                  var14 = var15.Field9547;
                  if (var15.Field9547 != 1 && var14 != 2) {
                     var14 = 0;
                  }

                  if (var8 && !var10 && var15.Field9547 > 0) {
                     var10 = true;
                  }
               }
            }

            int var16;
            int var20;
            for(var20 = var6 - 1; var20 >= 0; --var20) {
               for(var16 = 0; var16 < var5; ++var16) {
                  int var17 = var20 * var5 + var16;
                  if (var8 && var9 == 17) {
                     var17 = var16 * var5 + var20;
                  }

                  var17 = var3[var17];
                  int var18 = var4;
                  if (var12) {
                     var10 = false;
                     var17 = 16777215;
                     var4 = 255;
                  } else if (var17 == 0 || var17 == -1) {
                     var4 = 256;
                  }

                  if (var17 == 0 && var14 == 0 && var8) {
                     var17 = 16777215;
                     var4 = 255;
                  }

                  Field9012.put((byte)(var17 >> 16));
                  Field9012.put((byte)(var17 >> 8));
                  Field9012.put((byte)var17);
                  if (var14 != 0 && !var19) {
                     var4 = var17 >>> 24;
                     Field9012.put((byte)var4);
                  } else if (var4 != 0 && (var4 != 255 || !var10)) {
                     Field9012.put((byte)var4);
                  } else {
                     Field9012.put((byte)(var17 >>> 24));
                  }

                  var4 = var18;
               }
            }

            Field9012.flip();
            var20 = this.Field9015;
            var16 = this.Field9016;
            if (var7 && var11 != null) {
               var20 = var11[0];
               var16 = var11[1];
            }

            GraphicsDisplay.Method997().Method1035("error in TextureAtlas.addTexture1(pos: " + var20 + "/" + var16 + ", bounds:" + var5 + "/" + var6 + ", hash: " + var1 + ", full: " + this.Field9004 + ", offsets: " + this.Field9015 + "/" + this.Field9016 + ", buffer: " + Field9012.remaining() + ", update: " + var7 + ", pixels: " + var3 + ", invisible: " + var12 + ")");
            GL11.glTexSubImage2D(3553, 0, var20, var16, var5, var6, 6408, 5121, Field9012);
            if (var8) {
               boolean var10000 = Class843.Field3772;
            }

            if (var9 > 0 && Texture.Field1931[var9]) {
               if (var9 > 0 && Texture.Field1931[var9]) {
                  this.Field9003 = true;
               }

               GL11.glTexSubImage2D(3553, 0, var20 + var5, var16, var5, var6, 6408, 5121, Field9012);
            }

            GraphicsDisplay.Method997().Method1035("error in TextureAtlas.addTexture2(pos: " + var20 + "/" + var16 + ", bounds:" + var5 + "/" + var6 + ", hash: " + var1 + ", full: " + this.Field9004 + ", offsets: " + this.Field9015 + "/" + this.Field9016 + ", buffer: " + Field9012.remaining() + ", update: " + var7 + ", pixels: " + var3 + ", invisible: " + var12 + ")");
            Method9141();
            if (var11 == null) {
               var11 = new int[]{var20, var16};
               this.Field9013.put(var1, var11);
               this.Method9143(var8, var9, 0);
            }

            GraphicsDisplay.Method997().Method1035("error in TextureAtlas.addTexture3(pos: " + var20 + "/" + var16 + ", bounds:" + var5 + "/" + var6 + ", hash: " + var1 + ", full: " + this.Field9004 + ", offsets: " + this.Field9015 + "/" + this.Field9016 + ", buffer: " + Field9012.remaining() + ", update: " + var7 + ", pixels: " + var3 + ", invisible: " + var12 + ")");
            return var11;
         }
      }
   }

   public final int[] Method9147(long var1, byte[] var3, int var4, int var5, boolean var6) {
      int[] var7 = (int[])this.Field9013.get(var1);
      if (this.Field9013.get(var1) != null && !var6) {
         return var7;
      } else if (this.Field9004) {
         System.err.println("[TextureAtlas]: too large letter object: " + var1 + ", " + var3.length + "/" + this.Field9011);
         return null;
      } else {
         this.Method9142(false, true);

         int var8;
         int var9;
         for(var8 = var5 - 1; var8 >= 0; --var8) {
            for(var9 = 0; var9 < var4; ++var9) {
               if (var3[var8 * var4 + var9] == 0) {
                  Field9012.put((byte)0);
                  Field9012.put((byte)0);
                  Field9012.put((byte)0);
                  Field9012.put((byte)0);
               } else {
                  Field9012.put((byte)-1);
                  Field9012.put((byte)-1);
                  Field9012.put((byte)-1);
                  Field9012.put((byte)-1);
               }
            }
         }

         Field9012.flip();
         var8 = this.Field9015;
         var9 = this.Field9016;
         if (var6 && var7 != null) {
            var8 = var7[0];
            var9 = var7[1];
         }

         GL11.glTexSubImage2D(3553, 0, var8, var9, var4, var5, 6408, 5121, Field9012);
         Method9141();
         if (var7 == null) {
            var7 = new int[]{var8, var9};
            this.Field9013.put(var1, var7);
            this.Method9143(false, 0, 0);
         }

         GraphicsDisplay.Method997().Method1035("error in TextureAtlas.addLetter(" + var4 + ", " + var5 + ")");
         return var7;
      }
   }

   private void Method9148() {
      for(int var1 = 1; var1 < Texture.Field1931.length; ++var1) {
         if (Texture.Field1931[var1]) {
            this.Method9146((long)var1, (int[])null, 255, 128, 128, false, true, var1, false);
         }
      }

   }

   public final void Method9149(boolean var1) {
      if (var1 && this.Field9014 != 0) {
         Class842.Method13981(Class842.Field3811, this.Field9014);
         --Field9002;
         this.Field9014 = 0;
      }

      this.Field9015 = 0;
      this.Field9016 = 0;
      this.Field9013.clear();
      this.Field9008 = this.Field9007;
      this.Field9004 = false;
      this.Field9003 = false;
      if (!var1 && this.Field9005 && this.Field9006 == 1) {
         this.Method9148();
      }

   }

   public final int Method9150() {
      return this.Field9006;
   }
}
