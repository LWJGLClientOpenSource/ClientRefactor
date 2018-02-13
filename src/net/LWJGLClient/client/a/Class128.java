package net.LWJGLClient.client.a;

import java.io.File;
import java.io.FileInputStream;
import java.io.RandomAccessFile;
import java.nio.FloatBuffer;
import java.util.Iterator;
import java.util.Map.Entry;
import net.LWJGLClient.client.b.Rasterizer;
import net.LWJGLClient.client.b.b.GraphicsDisplay;
import net.LWJGLClient.client.b.b.a.Class227;
import net.LWJGLClient.client.b.b.a.Class231;
import net.LWJGLClient.client.b.b.f.Class843;
import net.LWJGLClient.client.c.Packet;
import net.LWJGLClient.client.model.Client;
import net.LWJGLClient.client.model.Model;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;

public class Class128 {
   public int[] Field10041;
   public int[][] Field10042;

   public static void Method1321(Client var0) {
      boolean var10000 = Client.normalMem;
   }

   public static byte[] Method1322(String var0) {
      try {
         File var3;
         byte[] var1 = new byte[(int)(var3 = new File(var0)).length()];
         FileInputStream var4;
         (var4 = new FileInputStream(var3)).read(var1);
         var4.close();
         return var1;
      } catch (Exception var2) {
         return null;
      }
   }

   public static void Method1323(Client var0, int var1) {
      for(var1 = 0; var1 < var0.Field12722.length; ++var1) {
         int var2 = 0;
         String var4 = "./data/" + var1 + "/";
         File var3 = new File(var4);
         int var5 = 0;
         if (!var3.exists()) {
            var3.mkdirs();
         }

         System.out.print("Writing " + var1 + "...");

         byte[] var8;
         while((var8 = var0.Field12722[var1].Method9333(var2++)) != null || var5 < 250) {
            if (var8 == null) {
               ++var5;
            } else {
               try {
                  int var6 = var2;
                  if (var1 == 0) {
                     var6 = var2 - 1;
                  }

                  RandomAccessFile var9;
                  if ((var9 = new RandomAccessFile(var4 + var6, "rw")).length() <= 0L) {
                     var9.write(var8);
                  }

                  var9.close();
               } catch (Exception var7) {
                  var7.printStackTrace();
               }
            }
         }

         System.out.println(" done.");
      }

   }

   private Class128(Packet var1) {
      int var2;
      int var3;
      int var4;
      if (Client.normalMem) {
         var2 = var1.g2();
         this.Field10041 = new int[var2];
         this.Field10042 = new int[var2][];

         for(var3 = 0; var3 < var2; ++var3) {
            this.Field10041[var3] = var1.g2();
         }

         for(var3 = 0; var3 < var2; ++var3) {
            this.Field10042[var3] = new int[var1.g2()];
         }

         for(var3 = 0; var3 < var2; ++var3) {
            for(var4 = 0; var4 < this.Field10042[var3].length; ++var4) {
               this.Field10042[var3][var4] = var1.g2();
            }
         }

      } else {
         var2 = var1.g2();
         this.Field10041 = new int[var2];
         this.Field10042 = new int[var2][];

         for(var3 = 0; var3 < var2; ++var3) {
            this.Field10041[var3] = var1.g2();
         }

         for(var3 = 0; var3 < var2; ++var3) {
            this.Field10042[var3] = new int[var1.g2()];
         }

         for(var3 = 0; var3 < var2; ++var3) {
            for(var4 = 0; var4 < this.Field10042[var3].length; ++var4) {
               this.Field10042[var3][var4] = var1.g2();
            }
         }

      }
   }

   public Class128(Packet var1, byte var2) {
      this(var1);
   }

   public static void Method1324(boolean var0) {
      if (var0) {
         GL11.glEnable(3553);
         GL11.glEnable(3042);
         GL11.glEnable(2929);
         GL11.glDepthRange(0.0D, 1.0D);
      } else {
         GL11.glEnable(3553);
         GL11.glEnable(3042);
         GL11.glEnable(2929);
         GL11.glClear(256);
         if (GraphicsDisplay.Field2667) {
            GL11.glDepthRange(1.0D, 0.0D);
         }
      }

      Method1325(false);
      Method1325(true);
      Class843.Method14021();
      GL11.glLoadIdentity();
      GraphicsDisplay.Method1032();
   }

   private static void Method1325(boolean var0) {
      if (!GraphicsDisplay.Field2667) {
         Class227[] var1 = var0 ? Class843.Field3761 : Class843.Field3760;
         Class227[][] var2 = var0 ? Class843.Field3758 : Class843.Field3757;
         Class231[] var3 = var0 ? Class843.Field3763 : Class843.Field3762;
         boolean var4 = false;

         for(int var5 = 0; var5 < Rasterizer.Field9950; ++var5) {
            if (var4 && var5 > 50) {
               GL11.glAlphaFunc(516, 0.25F);
               var4 = false;
            }

            if (!var4 && var5 > 0 && var5 <= 50) {
               GL11.glAlphaFunc(516, 0.65F);
               var4 = true;
            }

            Method1326(var1[var5]);
            var1[var5] = null;
            Class231 var6;
            if ((var6 = var3[var5]) != null) {
               int var7 = var6.Field3102;
               int var8 = Class843.Method14019(var6.Field3102);
               GL11.glBindTexture(3553, var8);
               GL11.glBegin(7);

               while(var6 != null) {
                  if (var8 > 0) {
                     GL11.glTexCoord2f(0.0F, 1.0F);
                     Method1327(Rasterizer.Field9964[var6.Field3103], var6.Field3107);
                     GL11.glVertex3f(var6.Field3090, var6.Field3094, var6.Field3098);
                     GL11.glTexCoord2f(1.0F, 1.0F);
                     Method1327(Rasterizer.Field9964[var6.Field3104], var6.Field3107);
                     GL11.glVertex3f(var6.Field3091, var6.Field3095, var6.Field3099);
                     GL11.glTexCoord2f(1.0F, 0.0F);
                     Method1327(Rasterizer.Field9964[var6.Field3105], var6.Field3107);
                     GL11.glVertex3f(var6.Field3092, var6.Field3096, var6.Field3100);
                     GL11.glTexCoord2f(0.0F, 0.0F);
                     Method1327(Rasterizer.Field9964[var6.Field3106], var6.Field3107);
                     GL11.glVertex3f(var6.Field3093, var6.Field3097, var6.Field3101);
                  } else {
                     Method1327(Rasterizer.Field9964[var6.Field3103], var6.Field3107);
                     GL11.glVertex3f(var6.Field3090, var6.Field3094, var6.Field3098);
                     Method1327(Rasterizer.Field9964[var6.Field3104], var6.Field3107);
                     GL11.glVertex3f(var6.Field3091, var6.Field3095, var6.Field3099);
                     Method1327(Rasterizer.Field9964[var6.Field3105], var6.Field3107);
                     GL11.glVertex3f(var6.Field3092, var6.Field3096, var6.Field3100);
                     Method1327(Rasterizer.Field9964[var6.Field3106], var6.Field3107);
                     GL11.glVertex3f(var6.Field3093, var6.Field3097, var6.Field3101);
                  }

                  Class231 var9 = var6;
                  var6 = var6.Field3108;
                  var9.Field3108 = null;
               }

               GL11.glEnd();
               GraphicsDisplay.Method997().Method1035("error in renderQuad(" + var7 + ")");
            }

            var3[var5] = null;
            if (var0 && Class843.Field3759.size() > 0) {
               Iterator var11 = Class843.Field3759.entrySet().iterator();

               while(var11.hasNext()) {
                  Method1326((Class227)((Entry)var11.next()).getValue());
               }

               Class843.Field3759.clear();
            } else {
               for(int var10 = 0; var10 < Model.Field2805; ++var10) {
                  if (var2[var10] != null) {
                     Method1326(var2[var10][var5]);
                     var2[var10][var5] = null;
                  }
               }
            }
         }

         GL11.glAlphaFunc(516, 0.25F);
         GraphicsDisplay.Method997().Method1035("error in renderPolygons(" + var0 + ")");
      }
   }

   private static void Method1326(Class227 var0) {
      if (var0 != null) {
         int var1 = var0.Field8888;
         int var2 = Class843.Method14019(var0.Field8888);
         GL11.glBindTexture(3553, var2);
         GL11.glBegin(4);

         while(var0 != null) {
            if (var2 > 0) {
               if (var0.Field8899) {
                  GL11.glTexCoord2f(var0.Field8893, var0.Field8896);
                  Method1327(Rasterizer.Field9964[var0.Field8889], var0.Field8892);
                  GL11.glVertex3f(var0.Field8879, var0.Field8882, var0.Field8885);
                  GL11.glTexCoord2f(var0.Field8894, var0.Field8897);
                  Method1327(Rasterizer.Field9964[var0.Field8890], var0.Field8892);
                  GL11.glVertex3f(var0.Field8880, var0.Field8883, var0.Field8886);
                  GL11.glTexCoord2f(var0.Field8895, var0.Field8898);
                  Method1327(Rasterizer.Field9964[var0.Field8891], var0.Field8892);
                  GL11.glVertex3f(var0.Field8881, var0.Field8884, var0.Field8887);
               } else {
                  GL11.glTexCoord2f(0.0F, 0.0F);
                  Method1327(Rasterizer.Field9964[var0.Field8889], var0.Field8892);
                  GL11.glVertex3f(var0.Field8879, var0.Field8882, var0.Field8885);
                  GL11.glTexCoord2f(1.0F, 1.0F);
                  Method1327(Rasterizer.Field9964[var0.Field8890], var0.Field8892);
                  GL11.glVertex3f(var0.Field8880, var0.Field8883, var0.Field8886);
                  GL11.glTexCoord2f(0.0F, 1.0F);
                  Method1327(Rasterizer.Field9964[var0.Field8891], var0.Field8892);
                  GL11.glVertex3f(var0.Field8881, var0.Field8884, var0.Field8887);
               }
            } else {
               Method1327(Rasterizer.Field9964[var0.Field8889], var0.Field8892);
               GL11.glVertex3f(var0.Field8879, var0.Field8882, var0.Field8885);
               Method1327(Rasterizer.Field9964[var0.Field8890], var0.Field8892);
               GL11.glVertex3f(var0.Field8880, var0.Field8883, var0.Field8886);
               Method1327(Rasterizer.Field9964[var0.Field8891], var0.Field8892);
               GL11.glVertex3f(var0.Field8881, var0.Field8884, var0.Field8887);
            }

            Class227 var3 = var0;
            var0 = var0.Field8900;
            var3.Field8900 = null;
         }

         GL11.glEnd();
         GraphicsDisplay.Method997().Method1035("error in renderTriangle(" + var1 + ", " + var2 + ")");
      }

   }

   private static void Method1327(int var0, int var1) {
      float var2 = (float)(var0 >> 16 & 255);
      float var3 = (float)(var0 >> 8 & 255);
      float var4 = (float)(var0 & 255);
      float var5 = (float)var1 / 256.0F;
      GL11.glColor4f(var2 / 256.0F, var3 / 256.0F, var4 / 256.0F, var5);
   }

   public static FloatBuffer Method1328(float... var0) {
      FloatBuffer var1;
      (var1 = BufferUtils.createFloatBuffer(16)).put(var0);
      var1.flip();
      return var1;
   }

   public static int Method1329(int var0, int var1, int var2) {
      if (Rasterizer.Field9944 == -1) {
         return -1;
      } else {
         var0 = Client.Method13398();
         if (Rasterizer.Field9943) {
            var1 = var2;
            var2 = var2 >> 10 & 255;
            int var3 = var1 >> 7 & 16;
            var1 &= 127;
            if (Client.session_player != null) {
              // int var10000 = Client.session_player.Field4194; //might have to see bout this nigga
              // var10000 = Client.session_player.Field4195; //might have to see bout this nigga
            }

            if ((var1 = var2 >= 7 && var2 <= 9 && var3 >= 0 && var3 <= 16 && var1 >= 50 && var1 <= 145 ? 612 : (var2 >= 7 && var2 <= 9 && var3 >= 0 && var3 <= 16 && (var1 >= 38 && var1 <= 145 || var2 == 7 && var1 >= 30 && var1 <= 145) ? 613 : (var2 >= 27 && var2 <= 41 && var3 >= 0 && var3 <= 16 && var1 >= 57 && var1 <= 87 ? 524 : (var2 >= 5 && var2 <= 6 && var3 >= 0 && var3 <= 16 && var1 >= 14 && var1 <= 18 ? 512 : (var2 >= 6 && var2 <= 6 && var3 >= 0 && var3 <= 16 && var1 >= 25 && var1 <= 27 ? 514 : (var2 >= 10 && var2 <= 19 && var3 >= 0 && var3 <= 16 && var1 >= 9 && var1 <= 15 ? 519 : (var2 >= 0 && var2 <= 0 && var3 >= 0 && var3 <= 16 && var1 >= 10 && var1 <= 20 ? 408 : (var2 >= 7 && var2 <= 7 && var3 >= 0 && var3 <= 16 && var1 >= 13 && var1 <= 20 && var1 != 19 ? 400 : (var2 >= 0 && var2 <= 0 && var3 >= 0 && var3 <= 0 && var1 >= 9 && var1 <= 20 ? 699 : (var2 >= 8 && var2 <= 10 && var3 >= 0 && var3 <= 16 && var1 >= 20 && var1 <= 24 ? 154 : (var2 >= 2 && var2 <= 8 && var3 >= 0 && var3 <= 16 && var1 >= 8 && var1 <= 12 ? 626 : (var2 >= 0 && var2 <= 6 && var3 >= 0 && var3 <= 16 && var1 >= 0 && var1 <= 8 ? 1389 : (var2 >= 0 && var2 <= 6 && var3 >= 0 && var3 <= 16 && var1 >= 21 && var1 <= 31 ? 626 : -1))))))))))))) != -1) {
               return var1;
            }
         }

         return var0 == 0 ? 929 : 918;
      }
   }

   public static int Method1330(int var0) {
      if (Rasterizer.Field9944 == -1) {
         return -1;
      } else {
         return Client.Field12068 == 0 ? var0 : 300;
      }
   }

   public static float Method1331(float var0) {
      if (var0 >= 0.0F && var0 <= 1.0F) {
         return var0;
      } else {
         float var1;
         boolean var2 = (var1 = (float)Math.round(var0)) > var0;
         if (var0 > 1.0F) {
            return var2 ? var0 - (var1 - 1.0F) : var1 + 1.0F - var0;
         } else if (var0 < 0.0F) {
            return var2 ? -(var0 - var1) : var0 - var1;
         } else {
            return var0;
         }
      }
   }

   public static float[] Method1332(int var0, float[] var1, int var2, int var3, int var4, float var5, int var6, int var7, float[] var8, float var9, float var10, float var11, float var12, float var13) {
      var11 -= (float)var3;
      var10 -= (float)var4;
      var5 -= (float)var6;
      float var16 = var8[2] * var10 + var8[0] * var5 + var8[1] * var11;
      float var17 = var8[5] * var10 + var8[4] * var11 + var8[3] * var5;
      var5 = var8[7] * var11 + var5 * var8[6] + var10 * var8[8];
      float var14;
      if (var0 != 0) {
         if (var0 != 1) {
            if (var0 == 2) {
               var16 = var12 - var16 + 0.5F;
               var14 = var13 - var17 + 0.5F;
            } else if (var0 == 3) {
               var14 = var13 - var17 + 0.5F;
               var16 = var16 + var12 + 0.5F;
            } else if (var0 == 4) {
               var16 = var9 + var5 + 0.5F;
               var14 = -var17 + var13 + 0.5F;
            } else {
               var16 = var9 - var5 + 0.5F;
               var14 = var13 - var17 + 0.5F;
            }
         } else {
            var16 = var16 + var12 + 0.5F;
            var14 = var9 + var5 + 0.5F;
         }
      } else {
         var14 = var9 - var5 + 0.5F;
         var16 = var12 + var16 + 0.5F;
      }

      float var15;
      if (var2 == 1) {
         var15 = var16;
         var16 = -var14;
         var14 = var15;
      } else if (var2 == 2) {
         var14 = -var14;
         var16 = -var16;
      } else if (var2 == 3) {
         var15 = var16;
         var16 = var14;
         var14 = -var15;
      }

      var1[1] = var14;
      var1[0] = var16;
      return var1;
   }
}


/*package client.Utilities;

import client.Graphics.RBGImage;
import client.Graphics.Rasterizer;
import client.Graphics.RenderingUtilities.GraphicsDisplay;
import client.Graphics.RenderingUtilities.GraphicsDisplay.d;
import client.ClientCacheGrabber.Stream;
import client.GlobalData.Client;
import client.GlobalData.Model;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;

import java.io.File;
import java.io.FileInputStream;
import java.io.RandomAccessFile;
import java.nio.FloatBuffer;
import java.util.Iterator;
import java.util.Map.Entry;

public class OnDemandData {
    public int[] a;
    public int[][] b;

    private OnDemandData(Stream var1) {
        int var2;
        int var3;
        int var4;
        if (Client.am) {
            var2 = var1.m();
            this.a = new int[var2];
            this.b = new int[var2][];

            for (var3 = 0; var3 < var2; ++var3) {
                this.a[var3] = var1.m();
            }

            for (var3 = 0; var3 < var2; ++var3) {
                this.b[var3] = new int[var1.m()];
            }

            for (var3 = 0; var3 < var2; ++var3) {
                for (var4 = 0; var4 < this.b[var3].length; ++var4) {
                    this.b[var3][var4] = var1.m();
                }
            }

        } else {
            var2 = var1.m();
            this.a = new int[var2];
            this.b = new int[var2][];

            for (var3 = 0; var3 < var2; ++var3) {
                this.a[var3] = var1.m();
            }

            for (var3 = 0; var3 < var2; ++var3) {
                this.b[var3] = new int[var1.m()];
            }

            for (var3 = 0; var3 < var2; ++var3) {
                for (var4 = 0; var4 < this.b[var3].length; ++var4) {
                    this.b[var3][var4] = var1.m();
                }
            }

        }
    }

    public OnDemandData(Stream var1, byte var2) {
        this(var1);
    }

    public static void a(Client var0) {
        boolean var10000 = Client.am;
    }

    public static byte[] a(String var0) {
        try {
            File var3;
            byte[] var1 = new byte[(int) (var3 = new File(var0)).length()];
            FileInputStream var4;
            (var4 = new FileInputStream(var3)).read(var1);
            var4.close();
            return var1;
        } catch (Exception var2) {
            return null;
        }
    }

    public static void a(Client var0, int var1) {
        for (var1 = 0; var1 < var0.cX.length; ++var1) {
            int var2 = 0;
            String var4 = "./data/" + var1 + "/";
            File var3 = new File(var4);
            int var5 = 0;
            if (!var3.exists()) {
                var3.mkdirs();
            }

            System.out.print("Writing " + var1 + "...");

            byte[] var8;
            while ((var8 = var0.cX[var1].a(var2++)) != null || var5 < 250) {
                if (var8 == null) {
                    ++var5;
                } else {
                    try {
                        int var6 = var2;
                        if (var1 == 0) {
                            var6 = var2 - 1;
                        }

                        RandomAccessFile var9;
                        if ((var9 = new RandomAccessFile(var4 + var6, "rw")).length() <= 0L) {
                            var9.write(var8);
                        }

                        var9.close();
                    } catch (Exception var7) {
                        var7.printStackTrace();
                    }
                }
            }

            System.out.println(" done.");
        }

    }

    public static void a(boolean var0) {
        if (var0) {
            GL11.glEnable(3553);
            GL11.glEnable(3042);
            GL11.glEnable(2929);
            GL11.glDepthRange(0.0D, 1.0D);
        } else {
            GL11.glEnable(3553);
            GL11.glEnable(3042);
            GL11.glEnable(2929);
            GL11.glClear(256);
            if (GraphicsDisplay.f) {
                GL11.glDepthRange(1.0D, 0.0D);
            }
        }

        b(false);
        b(true);
        client.b.b.f.a.s();
        GL11.glLoadIdentity();
        GraphicsDisplay.k();
    }

    private static void b(boolean var0) {
        if (!GraphicsDisplay.f) {
            d[] var1 = var0 ? client.b.b.f.a.g : client.b.b.f.a.f;
            d[][] var2 = var0 ? client.b.b.f.a.d : client.b.b.f.a.c;
            GraphicsDisplay.c[] var3 = var0 ? client.b.b.f.a.i : client.b.b.f.a.h;
            boolean var4 = false;

            for (int var5 = 0; var5 < Rasterizer.textureImagesSize; ++var5) {
                if (var4 && var5 > 50) {
                    GL11.glAlphaFunc(516, 0.25F);
                    var4 = false;
                }

                if (!var4 && var5 > 0 && var5 <= 50) {
                    GL11.glAlphaFunc(516, 0.65F);
                    var4 = true;
                }

                a(var1[var5]);
                var1[var5] = null;
                GraphicsDisplay.c var6;
                if ((var6 = var3[var5]) != null) {
                    int var7 = var6.m;
                    int var8 = client.b.b.f.a.a(var6.m);
                    GL11.glBindTexture(3553, var8);
                    GL11.glBegin(7);

                    while (var6 != null) {
                        if (var8 > 0) {
                            GL11.glTexCoord2f(0.0F, 1.0F);
                            a(Rasterizer.hsl2rgb[var6.n], var6.r);
                            GL11.glVertex3f(var6.a, var6.e, var6.i);
                            GL11.glTexCoord2f(1.0F, 1.0F);
                            a(Rasterizer.hsl2rgb[var6.o], var6.r);
                            GL11.glVertex3f(var6.b, var6.f, var6.j);
                            GL11.glTexCoord2f(1.0F, 0.0F);
                            a(Rasterizer.hsl2rgb[var6.p], var6.r);
                            GL11.glVertex3f(var6.c, var6.g, var6.k);
                            GL11.glTexCoord2f(0.0F, 0.0F);
                            a(Rasterizer.hsl2rgb[var6.q], var6.r);
                            GL11.glVertex3f(var6.d, var6.h, var6.l);
                        } else {
                            a(Rasterizer.hsl2rgb[var6.n], var6.r);
                            GL11.glVertex3f(var6.a, var6.e, var6.i);
                            a(Rasterizer.hsl2rgb[var6.o], var6.r);
                            GL11.glVertex3f(var6.b, var6.f, var6.j);
                            a(Rasterizer.hsl2rgb[var6.p], var6.r);
                            GL11.glVertex3f(var6.c, var6.g, var6.k);
                            a(Rasterizer.hsl2rgb[var6.q], var6.r);
                            GL11.glVertex3f(var6.d, var6.h, var6.l);
                        }

                        GraphicsDisplay.c var9 = var6;
                        var6 = var6.s;
                        var9.s = null;
                    }

                    GL11.glEnd();
                    GraphicsDisplay.a().errorPrint("error in renderQuad(" + var7 + ")");
                }

                var3[var5] = null;
                if (var0 && client.b.b.f.a.e.size() > 0) {
                    Iterator var11 = client.b.b.f.a.e.entrySet().iterator();

                    while (var11.hasNext()) {
                        a((d) ((Entry) var11.next()).getValue());
                    }

                    client.b.b.f.a.e.clear();
                } else {
                    for (int var10 = 0; var10 < Model.J; ++var10) {
                        if (var2[var10] != null) {
                            a(var2[var10][var5]);
                            var2[var10][var5] = null;
                        }
                    }
                }
            }

            GL11.glAlphaFunc(516, 0.25F);
            GraphicsDisplay.a().errorPrint("error in renderPolygons(" + var0 + ")");
        }
    }

    private static void a(d var0) {
        if (var0 != null) {
            int var1 = var0.j;
            int var2 = client.b.b.f.a.a(var0.j);
            GL11.glBindTexture(3553, var2);
            GL11.glBegin(4);

            while (var0 != null) {
                if (var2 > 0) {
                    if (var0.u) {
                        GL11.glTexCoord2f(var0.o, var0.r);
                        a(Rasterizer.hsl2rgb[var0.k], var0.n);
                        GL11.glVertex3f(var0.a, var0.d, var0.g);
                        GL11.glTexCoord2f(var0.p, var0.s);
                        a(Rasterizer.hsl2rgb[var0.l], var0.n);
                        GL11.glVertex3f(var0.b, var0.e, var0.h);
                        GL11.glTexCoord2f(var0.q, var0.t);
                        a(Rasterizer.hsl2rgb[var0.m], var0.n);
                        GL11.glVertex3f(var0.c, var0.f, var0.i);
                    } else {
                        GL11.glTexCoord2f(0.0F, 0.0F);
                        a(Rasterizer.hsl2rgb[var0.k], var0.n);
                        GL11.glVertex3f(var0.a, var0.d, var0.g);
                        GL11.glTexCoord2f(1.0F, 1.0F);
                        a(Rasterizer.hsl2rgb[var0.l], var0.n);
                        GL11.glVertex3f(var0.b, var0.e, var0.h);
                        GL11.glTexCoord2f(0.0F, 1.0F);
                        a(Rasterizer.hsl2rgb[var0.m], var0.n);
                        GL11.glVertex3f(var0.c, var0.f, var0.i);
                    }
                } else {
                    a(Rasterizer.hsl2rgb[var0.k], var0.n);
                    GL11.glVertex3f(var0.a, var0.d, var0.g);
                    a(Rasterizer.hsl2rgb[var0.l], var0.n);
                    GL11.glVertex3f(var0.b, var0.e, var0.h);
                    a(Rasterizer.hsl2rgb[var0.m], var0.n);
                    GL11.glVertex3f(var0.c, var0.f, var0.i);
                }

                d var3 = var0;
                var0 = var0.v;
                var3.v = null;
            }

            GL11.glEnd();
            GraphicsDisplay.a().errorPrint("error in renderTriangle(" + var1 + ", " + var2 + ")");
        }

    }

    private static void a(int var0, int var1) {
        float var2 = (float) (var0 >> 16 & 255);
        float var3 = (float) (var0 >> 8 & 255);
        float var4 = (float) (var0 & 255);
        float var5 = (float) var1 / 256.0F;
        GL11.glColor4f(var2 / 256.0F, var3 / 256.0F, var4 / 256.0F, var5);
    }

    public static FloatBuffer a(float... var0) {
        FloatBuffer var1;
        (var1 = BufferUtils.createFloatBuffer(16)).put(var0);
        var1.flip();
        return var1;
    }

    public static int a(int var0, int var1, int var2) {
        if (Rasterizer.c == -1) {
            return -1;
        } else {
            var0 = Client.y();
            if (Rasterizer.b) {
                var1 = var2;
                var2 = var2 >> 10 & 255;
                int var3 = var1 >> 7 & 16;
                var1 &= 127;
                if (Client.player_pos_x != null) {
                    int var10000 = Client.player_pos_x.az;
                    var10000 = Client.player_pos_x.aA;
                }

                if ((var1 = var2 >= 7 && var2 <= 9 && var3 >= 0 && var3 <= 16 && var1 >= 50 && var1 <= 145 ? 612 : (var2 >= 7 && var2 <= 9 && var3 >= 0 && var3 <= 16 && (var1 >= 38 && var1 <= 145 || var2 == 7 && var1 >= 30 && var1 <= 145) ? 613 : (var2 >= 27 && var2 <= 41 && var3 >= 0 && var3 <= 16 && var1 >= 57 && var1 <= 87 ? 524 : (var2 >= 5 && var2 <= 6 && var3 >= 0 && var3 <= 16 && var1 >= 14 && var1 <= 18 ? 512 : (var2 >= 6 && var2 <= 6 && var3 >= 0 && var3 <= 16 && var1 >= 25 && var1 <= 27 ? 514 : (var2 >= 10 && var2 <= 19 && var3 >= 0 && var3 <= 16 && var1 >= 9 && var1 <= 15 ? 519 : (var2 >= 0 && var2 <= 0 && var3 >= 0 && var3 <= 16 && var1 >= 10 && var1 <= 20 ? 408 : (var2 >= 7 && var2 <= 7 && var3 >= 0 && var3 <= 16 && var1 >= 13 && var1 <= 20 && var1 != 19 ? 400 : (var2 >= 0 && var2 <= 0 && var3 >= 0 && var3 <= 0 && var1 >= 9 && var1 <= 20 ? 699 : (var2 >= 8 && var2 <= 10 && var3 >= 0 && var3 <= 16 && var1 >= 20 && var1 <= 24 ? 154 : (var2 >= 2 && var2 <= 8 && var3 >= 0 && var3 <= 16 && var1 >= 8 && var1 <= 12 ? 626 : (var2 >= 0 && var2 <= 6 && var3 >= 0 && var3 <= 16 && var1 >= 0 && var1 <= 8 ? 1389 : (var2 >= 0 && var2 <= 6 && var3 >= 0 && var3 <= 16 && var1 >= 21 && var1 <= 31 ? 626 : -1))))))))))))) != -1) {
                    return var1;
                }
            }

            return var0 == 0 ? 929 : 918;
        }
    }

    public static int a(int var0) {
        if (Rasterizer.c == -1) {
            return -1;
        } else {
            return Client.z == 0 ? var0 : 300;
        }
    }

    public static float a(float var0) {
        if (var0 >= 0.0F && var0 <= 1.0F) {
            return var0;
        } else {
            float var1;
            boolean var2 = (var1 = (float) Math.round(var0)) > var0;
            if (var0 > 1.0F) {
                return var2 ? var0 - (var1 - 1.0F) : var1 + 1.0F - var0;
            } else if (var0 < 0.0F) {
                return var2 ? -(var0 - var1) : var0 - var1;
            } else {
                return var0;
            }
        }
    }

    public static float[] a(int var0, float[] var1, int var2, int var3, int var4, float var5, int var6, int var7, float[] var8, float var9, float var10, float var11, float var12, float var13) {
        var11 -= (float) var3;
        var10 -= (float) var4;
        var5 -= (float) var6;
        float var16 = var8[2] * var10 + var8[0] * var5 + var8[1] * var11;
        float var17 = var8[5] * var10 + var8[4] * var11 + var8[3] * var5;
        var5 = var8[7] * var11 + var5 * var8[6] + var10 * var8[8];
        float var14;
        if (var0 != 0) {
            if (var0 != 1) {
                if (var0 == 2) {
                    var16 = var12 - var16 + 0.5F;
                    var14 = var13 - var17 + 0.5F;
                } else if (var0 == 3) {
                    var14 = var13 - var17 + 0.5F;
                    var16 = var16 + var12 + 0.5F;
                } else if (var0 == 4) {
                    var16 = var9 + var5 + 0.5F;
                    var14 = -var17 + var13 + 0.5F;
                } else {
                    var16 = var9 - var5 + 0.5F;
                    var14 = var13 - var17 + 0.5F;
                }
            } else {
                var16 = var16 + var12 + 0.5F;
                var14 = var9 + var5 + 0.5F;
            }
        } else {
            var14 = var9 - var5 + 0.5F;
            var16 = var12 + var16 + 0.5F;
        }

        float var15;
        if (var2 == 1) {
            var15 = var16;
            var16 = -var14;
            var14 = var15;
        } else if (var2 == 2) {
            var14 = -var14;
            var16 = -var16;
        } else if (var2 == 3) {
            var15 = var16;
            var16 = var14;
            var14 = -var15;
        }

        var1[1] = var14;
        var1[0] = var16;
        return var1;
    }
}
*/