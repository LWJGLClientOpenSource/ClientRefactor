package net.LWJGLClient.client.b.b.b;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Map.Entry;

import net.LWJGLClient.client.b.Rasterizer;
import net.LWJGLClient.client.b.b.b.a.ModelVBO;
import net.LWJGLClient.client.b.b.b.a.c.Class585;
import net.LWJGLClient.client.b.b.b.a.c.Class586;
import net.LWJGLClient.client.b.b.b.a.c.Class588;
import net.LWJGLClient.client.b.b.c.ShaderSelector;
import net.LWJGLClient.client.b.b.c.ShaderUtils;
import net.LWJGLClient.client.b.b.d.Class916;
import net.LWJGLClient.client.b.b.d.Class918;
import net.LWJGLClient.client.b.b.f.Class843;
import net.LWJGLClient.client.b.b.f.c.Class598;
import net.LWJGLClient.client.b.b.f.c.Class601;
import net.LWJGLClient.client.d.a.Class730;
import net.LWJGLClient.client.model.Model;
import net.LWJGLClient.client.b.b.GraphicsDisplay;
import net.LWJGLClient.client.b.b.a.Class237;
import net.LWJGLClient.client.b.b.b.a.a.Class650;
import net.LWJGLClient.client.b.b.b.a.b.Class147;
import net.LWJGLClient.client.b.b.c.Class414;
import net.LWJGLClient.client.b.b.c.ShaderData;
import net.LWJGLClient.client.b.b.c.Class426;
import net.LWJGLClient.client.b.b.c.Class428;
import net.LWJGLClient.client.b.b.d.Class914;
import net.LWJGLClient.client.b.b.f.Class838;
import net.LWJGLClient.client.d.SceneGraph;
import net.LWJGLClient.client.model.Client;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL13;
//import org.lwjgl.opengl.Class383;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL15;


public final class Class745 {
   private static final Class428 Field3309 = new Class428();
   private static final ShaderSelector Field3310 = new ShaderSelector();
   private static final Class414 Field3311 = new Class414();
   private static final Class426 Field3312 = new Class426();
   public static final String[] Field3313 = new String[]{"shadow.vert", "shadow.frag", "picking.vert", "picking.frag", "particle.vert", "particle.frag", "water.vert", "water.frag"};
   private static boolean Field3314 = false;
   private static float Field3315 = 1.0F;
   public static float Field3316 = 1.0E-5F;
   public static float Field3317 = 0.0F;
   public static boolean Field3318 = false;
   private static Class237 Field3319 = null;
   private static Class916 Field3320 = null;
   private static boolean Field3321 = false;
   private static final float[][] Field3322 = new float[][]{{30.0F, 4.0F}, {40.0F, 4.35F}, {50.0F, 5.05F}, {60.0F, 5.65F}, {70.0F, 5.95F}, {80.0F, 6.8F}, {90.0F, 7.05F}, {100.0F, 7.8F}, {110.0F, 8.15F}, {120.0F, 8.55F}, {200.0F, 15.0F}};
   private static float Field3323 = 0.0F;
   private static float Field3324 = 0.0F;
   private static boolean Field3325 = false;
   private static IntBuffer Field3326 = BufferUtils.createIntBuffer(256);
   private static int[] Field3327 = new int[256];
   private static int Field3328 = 0;
   private static float Field3329 = 1.0F;
   private static ByteBuffer Field3330 = BufferUtils.createByteBuffer(4);
   private static byte[] Field3331 = new byte[4];
   private static boolean Field3332 = true;

   public static void Method12472() {
      if (Field3320 != null) {
         Field3320.Method14981();
         Field3320 = null;
      }

      Field3309.Method7402();
      Field3311.Method7402();
      Field3310.Method7402();
      Field3312.Method7402();
   }

   private static void Method12473(Class598 var0) {
      List var1 = var0.Method9122();
      List var3 = var0.Method9123();

      for(int var2 = 0; var2 < var1.size(); ++var2) {
         Method12474((Class601)var1.get(var2), (List)var3.get(var2), false);
      }

   }

   private static void Method12474(Class601 var0, List var1, boolean var2) {
      float var3 = GraphicsDisplay.Field2687;
      float var4 = (float)var0.Method9139();
      float var5 = (float)var0.Method9140();
      if (var2) {
         GL11.glBlendFunc(1, 771);
      }

      GL11.glBindTexture(3553, var0.Method9136());
      GL11.glBegin(7);
      int var14 = var1.size();

      for(int var15 = 0; var15 < var14; ++var15) {
         Class650 var16 = (Class650)var1.get(var15);
         boolean var17 = false;
         float var21 = (float)var16.Method10086();
         float var6 = (float)var16.Method10087();
         float var7 = (float)var16.Method10090();
         float var8 = (float)var16.Method10091();
         float var13 = var16.Method10093();
         if (var2) {
            if (var7 >= var5) {
               var7 = var5;
            }

            if (var8 >= var5) {
               var8 = var5;
            }
         }

         float var9 = (float)var16.Method10089() / var4;
         float var10 = (float)var16.Method10088() / var4;
         float var11 = var9 + var7 / var4;
         float var12 = var10 + var8 / var4;
         if (var2) {
            var7 = (float)var16.Method10090();
            var8 = (float)var16.Method10091();
         }

         float var18;
         if (GraphicsDisplay.Method1040() > 1.0F && !var2) {
            var9 += 0.001F;
            var10 += 0.001F;
            var11 -= 0.001F;
            var12 -= 0.001F;
            if ((var18 = 1.0F - GraphicsDisplay.Method1040()) > 0.0F) {
               var7 += var18 * 2.0F;
               var8 += var18 * 2.0F;
               var21 -= var18;
               var6 -= var18;
            }
         }

         float var19;
         if (var16.Method10094() != 0.0F) {
            float var24 = var16.Method10094();
            GL11.glEnd();
            GL11.glLoadIdentity();
            var18 = var21 * var3 + var7 * var3 / 2.0F;
            var19 = var6 * var3 + var8 * var3 / 2.0F;
            GL11.glTranslatef(var18, var19, 0.0F);
            GL11.glRotatef(var24, 0.0F, 0.0F, 1.0F);
            GL11.glTranslatef(-var18, -var19, 0.0F);
            GL11.glBegin(7);
            var17 = true;
         }

         int var25 = var16.Method10092();
         int var22;
         var19 = (float)((var22 = var16.Method10085()) >> 16 & 255);
         float var20 = (float)(var22 >> 8 & 255);
         float var23 = (float)(var22 & 255);
         var18 = (float)var25 / 256.0F;
         GL11.glColor4f(var19 / 256.0F, var20 / 256.0F, var23 / 256.0F, var18);
         GL11.glTexCoord2f(var9, var10);
         GL11.glVertex3f(var21 * var3, var6 * var3, var13);
         GL11.glTexCoord2f(var11, var10);
         GL11.glVertex3f(var7 * var3 + var21 * var3, var6 * var3, var13);
         GL11.glTexCoord2f(var11, var12);
         GL11.glVertex3f(var7 * var3 + var21 * var3, var8 * var3 + var6 * var3, var13);
         GL11.glTexCoord2f(var9, var12);
         GL11.glVertex3f(var21 * var3, var8 * var3 + var6 * var3, var13);
         if (var17) {
            GL11.glEnd();
            GL11.glLoadIdentity();
            GL11.glBegin(7);
         }
      }

      GL11.glEnd();
      var1.clear();
      if (var2) {
         GL11.glBlendFunc(770, 771);
      }

   }

   public static void Method12475(boolean var0) {
      GraphicsDisplay.Method997().Method1035("[VBORenderer]: renderShadowScene(" + var0 + ")");
      Method12482(true, true, var0, true);
      if (GraphicsDisplay.Field2665 && Client.Field12225 && Client.Field12070 >= 4096 && Field3311.Method7538() > 0) {
         Field3311.Method7537();
         Client.Method13263(true);
      }

   }

   public static void Method12476(boolean var0) {
      if (Field3318) {
         Field3309.Method7402();
         Field3310.Method7402();
         Field3311.Method7402();
         Field3312.Method7402();
         Field3318 = false;
         Field3321 = false;
         GraphicsDisplay.Field2665 = true;
         GraphicsDisplay.Field2663 = true;
         Client.Field12059.add("Reloaded shaders.");
      }

      if (!Field3321) {
         GraphicsDisplay.Method997().Method1035("[VBORenderer]: loading shaders...");
         Field3321 = true;
         if (GraphicsDisplay.Field2665) {
            Field3309.Method7538();
            GraphicsDisplay.Method997().Method1035("[VBORenderer]: gameShader.load();");
            Field3310.Method7538();
            GraphicsDisplay.Method997().Method1035("[VBORenderer]: pickShader.load();");
            Field3311.Method7538();
            GraphicsDisplay.Method997().Method1035("[VBORenderer]: particleShader.load();");
            Field3312.Method7538();
            GraphicsDisplay.Method997().Method1035("[VBORenderer]: waterShader.load();");
         }

         System.gc();
      } else {
         if (var0) {
            Field3315 = 1.0F;
            Field3316 = 1.0E-4F;
            Field3317 = Field3315;
            GL11.glEnable(3553);
            GL11.glEnable(3042);
            GL11.glEnable(2929);
            GL11.glDepthRange(0.0D, 1.0D);
         } else {
            GL11.glEnable(3553);
            GL11.glEnable(3042);
            GL11.glEnable(2929);
            if (GraphicsDisplay.Field2667) {
               GL11.glDepthRange(1.0D, 0.0D);
            }
         }

         if (Client.Field12263) {
            if (Class843.Field3782.size() > 0) {
               boolean var1;
               if (var1 = Method12483()) {
                  label155: {
                     GL11.glAlphaFunc(516, 0.0F);
                     if (var1) {
                        GL11.glMatrixMode(5889);
                        GL11.glLoadIdentity();
                        Method12478(false);
                        Method12480(false);
                        GL11.glMatrixMode(5888);
                        GL11.glLoadIdentity();
                        if (Field3310.Method7538() <= 0) {
                           Field3332 = false;
                           ShaderUtils.Method7386();
                           break label155;
                        }

                        ShaderUtils.Method7385(Field3310.Method7403());
                        GL11.glDepthMask(false);
                        GL11.glEnableClientState(32884);
                        Method12484(Class843.Field3782.entrySet(), true, true);
                        GL11.glDisableClientState(32884);
                        GL11.glDepthMask(true);
                        ShaderUtils.Method7386();
                     } else {
                        Field3326.clear();
                        GL11.glSelectBuffer(Field3326);
                        GL11.glInitNames();
                        GL11.glPushName(0);
                        int var2 = Model.Field2880;
                        int var3 = Model.Field2881;
                        GL11.glMatrixMode(5889);
                        GL11.glLoadIdentity();
                        float var10000 = GraphicsDisplay.Field2687;
                        int[] var4 = GraphicsDisplay.Method997().Field2721;
                        var10000 = (float)var2 + 16.0F;
                        float var10001 = (float)(var4[3] - var3);
                        float var6 = 32.0F;
                        var6 = 32.0F;
                        float var7 = var10001;
                        var6 = var10000;
                        GL11.glTranslatef(((float)var4[2] - 2.0F * (var6 - (float)var4[0])) / 32.0F, ((float)var4[3] - 2.0F * (var7 - (float)var4[1])) / 32.0F, 0.0F);
                        GL11.glScalef((float)var4[2] / 32.0F, (float)var4[3] / 32.0F, 1.0F);
                        Method12478(false);
                        Method12480(false);
                        GL11.glMatrixMode(5888);
                        GL11.glLoadIdentity();
                        GL11.glDisableClientState(32886);
                        if (Field3314) {
                           GL11.glDisableClientState(32888);
                           Field3314 = false;
                        }

                        GL11.glRenderMode(7170);
                        GL11.glEnableClientState(32884);
                        Method12484(Class843.Field3782.entrySet(), true, false);
                        Class843.Field3782.clear();
                        GL11.glDisableClientState(32884);
                        var2 = GL11.glRenderMode(7168);
                        Field3326.get(Field3327);
                        if (var2 > 0) {
                           for(var3 = 0; var3 < var2; ++var3) {
                              int var8 = Field3327[(var3 << 2) + 3];
                              Long var5;
                              if ((var5 = (Long) Model.Field2809.get(var8)) != null) {
                                 Model.Method14523(new Class730(var8, var5), true);
                              }
                           }
                        }
                     }

                     if (GraphicsDisplay.Method997().Method1036("error in handleSelectionBuffer(" + var1 + ")", false)) {
                        Field3332 = false;
                     }
                  }
               }

               Field3326.clear();
               Class843.Field3782.clear();
               GL11.glClear(16640);
            }

            //Model.K = Client.v || Client.d() % 2 == 0;
            Model.Field2808 = Client.Field12055;// || Client.Field12060() % 2 == 0;
            if (GraphicsDisplay.Field2665 && Field3309.Method7538() <= 0) {
               GraphicsDisplay.Field2665 = false;
               if (Client.Field12167 >= 5) {
                  Client.Field12167 = 4;
                  Client.Method13220();
               }
            }

            if (!Field3309.Method7398()) {
               GraphicsDisplay.Field2665 = false;
            }

            if (var0 && GraphicsDisplay.Field2665) {
               ShaderData.Method7404();
               if (Client.Field12069 && (GraphicsDisplay.Field2663 || GraphicsDisplay.Field2664)) {
                  if (Client.Field12069) {
                     if (Field3320 == null) {
                        if (Field3320 == null) {
                           Field3320 = (Class916)(GraphicsDisplay.Field2663 ? new Class914(Client.Field12070, Client.Field12070) : (GraphicsDisplay.Field2664 ? new Class918(Client.Field12070, Client.Field12070) : null));
                        }

                        boolean var9;
                        if (Field3320 != null) {
                           var9 = true;
                        } else {
                           var9 = false;
                        }
                     }

                     Field3320.Method14983(false, Client.Field12070, Client.Field12070);
                  }

                  Field3309.Method7537();
                  GraphicsDisplay.Method997().Method1017(true);
                  Method12482(var0, false, true, true);
                  if (Client.Field12069) {
                     Field3320.Method14984();
                  }
               } else {
                  Field3309.Method7537();
                  GraphicsDisplay.Method997().Method1017(true);
                  Method12482(var0, false, true, true);
               }

               if (GraphicsDisplay.Field2665 && Client.Field12225 && Field3311.Method7538() > 0) {
                  Field3311.Method7537();
                  Client.Method13263(false);
               }

               ShaderUtils.Method7386();
            } else {
               if (var0) {
                  if (Field3320 != null) {
                     Field3320.Method14981();
                     Field3320 = null;
                  }

                  Field3309.Method7537();
               }

               Method12482(var0, false, true, false);
            }
         }

         Method12481(var0, false);
         GL11.glLoadIdentity();
         GraphicsDisplay.Method1032();
         if (!var0) {
            GL11.glClear(256);
         }

         if (!var0 && GraphicsDisplay.Field2667) {
            if (GraphicsDisplay.Field2665) {
               GraphicsDisplay.Method997().Method1017(false);
               GL11.glDisable(2912);
            }

            Method12473(Class843.Field3766);
            Method12473(Class843.Field3767);
            Method12473(Class843.Field3768);
            Method12474(Class843.Field3774, Class843.Field3775, true);
         }

         GraphicsDisplay.Method997().Method1035("error in renderScene(" + var0 + ")");
      }
   }

   public static float Method12477(boolean var0) {
      float var4 = 6.0F;

      for(int var1 = 0; var1 < 11; ++var1) {
         float[] var2 = Field3322[var1];
         if ((float) SceneGraph.Field928 <= var2[0]) {
            float var3 = (float) SceneGraph.Field928 - var2[0];
            var4 = var2[1];
            if (var3 < 0.0F && var1 < 10) {
               float[] var5 = Field3322[var1 + 1];
               var3 /= var5[0] - var2[0];
               float var6 = var5[1] - var2[1];
               var4 += var3 * var6;
            }
            break;
         }
      }

      if (!Client.Field12593) {
         if (!Client.Field12166 && Client.Field12263) {
            var4 -= 4.0F;
         }
      } else {
         Client.Method13399();
         var4 = var4 + (float) Client.Field12134 / 800.0F - 2.75F - 0.5F;
         float var7 = (float) Client.Field12344 / 383.0F * 1.5F;
         var4 -= var7;
      }

      return var4;
   }

   private static void Method12478(boolean var0) {
      int var1 = Field3320 == null ? 0 : 1024;
      double var2 = (double)((float)(var0 ? var1 : GraphicsDisplay.Method1038()) * GraphicsDisplay.Field2687);
      double var4 = (double)((float)(var0 ? var1 : GraphicsDisplay.Method1039()) * GraphicsDisplay.Field2687);
      float var7 = 0.05F;
      if (var0) {
         var7 = 0.35F;
      } else if (Rasterizer.Field9949) {
         var7 = 0.01F;
      }

      float var6 = Method12477(true) + (var0 ? 25.0F : 0.0F) + (GraphicsDisplay.Field2665 && Client.Field12107 ? 100.0F : 0.0F);
      GL11.glFrustum(-var2 * (double)var7, var2 * (double)var7, -var4 * (double)var7, var4 * (double)var7, 2.0D * (double)var7, (double)var6);
   }

   private static float Method12479(float var0) {
      float var1;
      if ((var1 = (float)((int)(4.0D * Client.Field12427))) < 0.25F) {
         var1 = 0.25F;
      } else if (var1 > 6.0F) {
         var1 = 6.0F;
      }

      if (var0 <= 2048.0F && var0 >= -2048.0F) {
         if (var0 <= 512.0F && var0 >= -512.0F && Field3325) {
            return 0.0F;
         } else {
            Field3325 = false;
            if (var0 > var1) {
               return var1;
            } else {
               return var0 < -var1 ? -var1 : var0;
            }
         }
      } else {
         return var0;
      }
   }

   private static void Method12480(boolean var0) {
      float var1 = GraphicsDisplay.Field2687;
      float var10000;
      if (!Client.Field12712) {
         var10000 = (float) Client.Field12134;
         Client.Method13400();
         float var2 = var10000 / 3249.0F;
         float var3 = -400.0F * var1 * var2;
         var2 = 220.0F * var1 * var2;
         GL11.glTranslatef(var3, var2, 0.0F);
      }

      if (!var0) {
         GL11.glRotatef(180.0F + (float) Client.Field12344 / 2048.0F * 360.0F, 1.0F, 0.0F, 0.0F);
         GL11.glRotatef((float) Client.Field12345 / 2048.0F * 360.0F, 0.0F, 1.0F, 0.0F);
         GL11.glScalef(var1, var1, var1);
         GL11.glTranslatef((float)(-Client.Field12341), (float)(-Client.Field12342), (float)(-Client.Field12343));
      } else {
         GL11.glRotatef(216.36719F, 1.0F, 0.0F, 0.0F);
         GL11.glRotatef(-43.945312F, 0.0F, 1.0F, 0.0F);
         GL11.glScalef(var1, var1, var1);
         int var7 = Client.Field12497;
         int var4 = Client.Field12494;
         var7 = Client.Field12498;
         int var6 = Client.Field12495;
         var4 += Client.Field12567;
         var6 += Client.Field12568;
         var10000 = (float)var4;
         var1 = (float)var6;
         float var5 = var10000;
         if (Field3323 == var5 && Field3324 == var1) {
            if (!Field3325) {
               Field3325 = true;
            }
         } else {
            Field3323 += Method12479(var5 - Field3323);
            Field3324 += Method12479(var1 - Field3324);
         }

         var5 = Field3323 - 5500.0F;
         var1 = Field3324 - 5500.0F;
         GL11.glTranslatef(-var5, 8500.0F, -var1);
      }
   }

   public static void Method12481(boolean var0, boolean var1) {
      if (var0) {
         GL11.glMatrixMode(5889);
         GL11.glLoadIdentity();
         Method12478(var1);
         if (!Client.Field12107 || !var0 || Field3320 != null) {
            Method12480(var1);
         }

         GL11.glMatrixMode(5888);
         GL11.glLoadIdentity();
      }

      GraphicsDisplay.Method997().Method1035("[VBORenderer:] setPerspective(" + var0 + ", " + var1 + ")");
   }

   private static void Method12482(boolean var0, boolean var1, boolean var2, boolean var3) {
      String var4 = "[VBORenderer][$]: renderAllVBOs(game: " + var0 + ", shadow: " + var1 + ", clearBufs: " + var2 + ", shader: " + var3;
      GraphicsDisplay.Method997().Method1035(var4.replace("$", "0"));
      Field3328 = 0;
      GL11.glBindTexture(3553, 0);
      long var5 = System.currentTimeMillis();
      Method12481(var0, var1);
      float var7 = var1 ? 0.5F : (var3 ? 0.0F : 0.3F);
      GL11.glAlphaFunc(516, var7);
      GL11.glEnableClientState(32884);
      GL11.glEnableClientState(32886);
      if (var1) {
         Method12485(Class843.Field3780.entrySet(), var0, false, var5, var2, var1);
         Class843.Field3780.clear();
         Method12485(Class843.Field3781.entrySet(), var0, true, var5, var2, var1);
      } else {
         if (var0) {
            if (var3 && Rasterizer.Field9943) {
               Client.Method13398();
               int var8;
               if ((var8 = Class843.Method14019(66)) > 0) {
                  Field3309.Method7400("FloorBlending", new float[]{1.0F});
                  GL13.glActiveTexture(33986);
                  GL11.glBindTexture(3553, var8);
                  GL13.glActiveTexture(33984);
               }
            }

            Method12485(Class843.Field3781.entrySet(), var0, true, var5, true, var1);
            if (var3 && Rasterizer.Field9943) {
               Field3309.Method7400("FloorBlending", new float[]{0.0F});
            }
         }

         var2 = true;
         Method12485(Class843.Field3778.entrySet(), var0, false, var5, true, var1);
         boolean var16;
         if (var16 = !var1) {
            GL11.glAlphaFunc(516, 0.8375F);
            Method12485(Class843.Field3779.entrySet(), var0, false, var5, false, var1);
            if (var0 && var3 && Client.Field12068 > 0 && Client.class329 == null) {
               GL11.glAlphaFunc(515, 1.0F);
               if (Field3312.Method7538() > 0) {
                  Field3312.Method7537();
                  Class585 var15 = Client.Field12428.Field924;
                  synchronized(Client.Field12428.Field924) {
                     Iterator var9 = Client.Field12428.Field924.Method8957().values().iterator();

                     while(var9.hasNext()) {
                        Class588 var17 = (Class588)var9.next();
                        ModelVBO var10 = Class838.Field6956.Method1489(var17);
                        if (var17.Method9101() <= SceneGraph.Field947) {
                           float var11 = var17.Method9096() + (var17.Method9098() - var17.Method9096()) * 0.5F + (float) Client.Field12494;
                           float var12 = var17.Method9097() + (var17.Method9099() - var17.Method9097()) * 0.5F + (float) Client.Field12495;
                           float var13 = ((float) Client.Field12117 + var17.Method9095() * 0.25F) * 0.5F;
                           if ((float) Client.Method13204((int)var11, (int)var12) <= var13) {
                              Field3312.Method7400("WaveYStrength", new float[]{var17.Method9103().Method8963()});
                              Class426 var10000 = Field3312;
                              float[] var10002 = new float[1];
                              Class586 var18 = var17.Method9103();
                              var10002[0] = 0.0F;
                              var10000.Method7400("WaveUMovement", var10002);
                              var10000 = Field3312;
                              var10002 = new float[1];
                              var18 = var17.Method9103();
                              var10002[0] = 0.0F;
                              var10000.Method7400("WaveVMovement", var10002);
                              Field3312.Method7400("FresnelWeight", new float[]{var17.Method9103().Method8971()});
                              var18 = var17.Method9103();
                              Field3312.Method7400("WaveCosMult", new float[]{2.0F});
                              Method12488(true, false, false, -1, false, var10);
                           }
                        }
                     }
                  }
               }

               if (GraphicsDisplay.Method997().Method1035("[VBORenderer]: waterShader.use()")) {
                  Client.Field12068 = 0;
               }

               Field3309.Method7537();
            }

            GL11.glAlphaFunc(515, 0.8375F);
            Method12485(Class843.Field3779.entrySet(), var0, false, var5, true, var1);
            GL11.glAlphaFunc(516, var7);
         } else {
            Method12485(Class843.Field3779.entrySet(), var0, false, var5, true, var1);
         }
      }

      GL11.glDisableClientState(32886);
      GL11.glDisableClientState(32884);
      GL15.glBindBuffer(34962, 0);
      if (Field3314) {
         GL11.glDisableClientState(32888);
         Field3314 = false;
      }

      if (var2) {
         Class843.Field3781.clear();
         Class843.Field3778.clear();
         Class843.Field3779.clear();
         Class843.Method14013();
         Class843.Method14009();
      }

      GraphicsDisplay.Method997().Method1035(var4.replace("$", "1"));
   }

   public static boolean Method12483() {
      if (Client.Field12055) {
         return false;
      } else {
         return GraphicsDisplay.Field2665 && Field3332;
      }
   }

   private static void Method12484(Set var0, boolean var1, boolean var2) {
      List var15;
      label75:
      for(Iterator var16 = var0.iterator(); var16.hasNext(); var15.clear()) {
         Iterator var4 = (var15 = (List)((Entry)var16.next()).getValue()).iterator();

         while(true) {
            Class147 var3;
            ModelVBO var6;
            int var7;
            float var8;
            do {
               do {
                  if (!var4.hasNext()) {
                     continue label75;
                  }

                  var7 = (var6 = (var3 = (Class147)var4.next()).Method1472()).Method12370();
                  var8 = GraphicsDisplay.Field2687;
               } while(var7 == 0);
            } while(var6.Method12372() <= 0);

            float var9 = (float)var3.Method1469();
            float var10 = (float)var3.Method1470();
            float var11 = (float)var3.Method1471();
            float var12 = (float)var3.Method1473() / 2048.0F * 360.0F;
            float var13 = (float)var3.Method1474() / 2048.0F * 360.0F;
            if (Field3328 != 0) {
               Field3328 = 0;
               GL11.glBindTexture(3553, 0);
            }

            float var14;
            if (!var2) {
               GL11.glPushName(var6.Field1923);
            } else {
               var14 = (float)var3.Method1476() / 255.0F;
               Field3310.Method7400("PickColor", new float[]{var14});
            }

            GL11.glLoadIdentity();
            GL11.glTranslatef(var9, var11, var10);
            if (!Client.Field12712) {
               float var10000 = (float) Client.Field12134;
               Client.Method13400();
               GL11.glTranslatef(-(var14 = var10000 / 3249.0F) * 612.0F * var8, var14 * 374.0F * var8, 0.0F);
            }

            GL11.glRotatef(var12, 0.0F, 1.0F, 0.0F);
            GL11.glRotatef(var13, 1.0F, 0.0F, 0.0F);
            if (var6.Field1905 > 0.0F) {
               GL11.glScalef(var6.Field1905, var6.Field1905, var6.Field1905);
            }

            GL15.glBindBuffer(34962, var7);
            GL11.glVertexPointer(3, 5126, 0, 0L);
            GL11.glDrawArrays(4, 0, var6.Method12372() * 3);
            if (var2) {
               var7 = Math.round((float)(Model.Field2880 - 8) * GraphicsDisplay.Method1040() * GraphicsDisplay.Method1042());
               int var19 = Math.round((float)(GraphicsDisplay.Method1039() - (Model.Field2881 + 8)) * GraphicsDisplay.Method1040() * GraphicsDisplay.Method1043());
               if (Field3330.limit() < 1024) {
                  Field3330 = BufferUtils.createByteBuffer(1024);
                  Field3331 = new byte[1024];
               }

               GL11.glReadPixels(var7, var19, 16, 16, 6408, 5121, Field3330);
               Field3330.get(Field3331);
               Field3330.clear();

               for(var7 = 0; var7 < 256; var7 += 4) {
                  if (Math.abs((Field3331[var7 + 2] & 255) - var3.Method1476()) <= 0) {
                     int var17 = var6.Field1923;
                     Long var18;
                     if ((var18 = (Long) Model.Field2809.get(var17)) != null) {
                        Model.Method14523(new Class730(var17, var18), true);
                     }
                     break;
                  }
               }
            }

            if (!var2) {
               GL11.glPopName();
            }
         }
      }

   }

   private static void Method12485(Set var0, boolean var1, boolean var2, long var3, boolean var5, boolean var6) {
      Iterator var7 = var0.iterator();

      while(var7.hasNext()) {
         List var10;
         if ((var10 = (List)((Entry)var7.next()).getValue()).size() > 0) {
            Iterator var9 = var10.iterator();

            label52:
            while(true) {
               Class147 var8;
               do {
                  do {
                     do {
                        do {
                           do {
                              if (!var9.hasNext()) {
                                 break label52;
                              }

                              var8 = (Class147)var9.next();
                           } while(var2 && var8.Method1472().Method12375() == 0);
                        } while(var8.Method1472().Field1907);
                     } while(var8.Method1472().Field1906);
                  } while(var8.Method1472().Field1908);
               } while(!var8.Method1472().Field1911 && !var6);

               Method12491(var8, var1, var2, var3, var6, false);
            }
         }

         if (var5) {
            var10.clear();
         }
      }

   }

   public static void Method12486(float var0) {
      Field3311.Method7400("SizeMult", new float[]{var0});
   }

   public static void Method12487(int var0, boolean var1, ModelVBO... var2) {
      Method12488(false, true, false, -1, var1, var2);
   }

   private static void Method12488(boolean var0, boolean var1, boolean var2, int var3, boolean var4, ModelVBO... var5) {
      if (var3 != -1 && Field3328 != var3) {
         GL11.glBindTexture(3553, var3);
         Field3328 = var3;
      }

      if (var1) {
         Field3314 = false;
         GL11.glEnableClientState(32884);
         GL11.glEnableClientState(32886);
         if (var0) {
            Field3314 = true;
            GL11.glEnableClientState(32888);
         }
      }

      ModelVBO[] var6 = var5;
      int var8 = var5.length;

      for(var3 = 0; var3 < var8; ++var3) {
         ModelVBO var7 = var6[var3];
         Method12491(new Class147(var7), true, false, System.currentTimeMillis(), var4, true);
      }

      if (var1) {
         GL11.glDisableClientState(32884);
         GL11.glDisableClientState(32886);
         if (var0) {
            GL11.glDisableClientState(32888);
            Field3314 = false;
         }
      }

   }

   public static float Method12489() {
      return (float)Method12490() / 6.0F;
   }

   public static int Method12490() {
      if (Client.Field12117 <= 50) {
         return 20;
      } else if (Client.Field12117 <= 60) {
         return 22;
      } else {
         return Client.Field12117 <= 80 ? 26 : 30;
      }
   }

   private static void Method12491(Class147 var0, boolean var1, boolean var2, long var3, boolean var5, boolean var6) {
      ModelVBO var7;
      if ((var7 = var0.Method1472()) != null && !var7.Field1907 && !var7.Field1908 && !var7.Field1906 && var7.Method12373() > 0) {
         var7.Field1915 = var3;
         int var18 = var7.Method12370();
         int var4 = var7.Method12371();
         int var8 = var7.Method12375();
         float var9 = GraphicsDisplay.Field2687;
         int var10;
         if ((var10 = var7.Method12372() * 3) > 0) {
            float var17;
            float var21;
            if (GraphicsDisplay.Field2665 && var1 && !var6 && !var2) {
               if (var7.Field1910 < 1.0F) {
                  if (var7.Method12373() > 0) {
                     var21 = Client.Field12069 ? 0.0075F : 0.015F;
                     var7.Field1910 = (float)((double)var7.Field1910 + (double)var21 * Client.Field12427);
                     if (var7.Field1910 > 1.0F - var21) {
                        var7.Field1910 = 1.0F;
                     } else if (var7.Field1910 < var21) {
                        var7.Field1910 = var21;
                     }
                  }

                  var17 = var7.Field1910;
               } else {
                  var17 = 1.0F;
               }

               if (!var5) {
                  var17 = (float)Math.round(var17 * 1000.0F) / 1000.0F;
                  if (Field3329 != var17) {
                     Field3329 = var17;
                     Field3309.Method7400("AlphaMult", new float[]{Field3329});
                  }
               }
            }

            if (var18 > 0 && var4 > 0) {
               var17 = (float)var0.Method1469();
               var21 = (float)var0.Method1470();
               float var11 = (float)var0.Method1471();
               float var12 = (float)var0.Method1473() / 2048.0F * 360.0F;
               float var13 = (float)var0.Method1474() / 2048.0F * 360.0F;
               float var14 = (float)var0.Method1475() / 2048.0F * 360.0F;
               GL11.glLoadIdentity();
               if (Client.Field12107 && var1 && Field3320 == null) {
                  Method12480(var5);
               }

               if (!var1) {
                  GL11.glScalef(var9, var9, var9);
               }

               boolean var10000 = GraphicsDisplay.Field2665;
               GL11.glTranslatef(var17, var11, var21);
               if (var0.Method1479() != 0.0F) {
                  GL11.glScalef(var0.Method1479(), var0.Method1477(), var0.Method1478());
               }

               if (var7.Field1905 > 0.0F) {
                  GL11.glScalef(var7.Field1905, var7.Field1905, var7.Field1905);
               }

               GL11.glRotatef(var12, 0.0F, 1.0F, 0.0F);
               GL11.glRotatef(var13, 1.0F, 0.0F, 0.0F);
               GL11.glRotatef(var14, 0.0F, 0.0F, 1.0F);
               int var15;
               int var16;
               int[] var19;
               Iterator var20;
               if (var7.Method12380() != null && var7.Method12380().size() > 0 && !Rasterizer.Field9948 && var7.Method12375() != 0) {
                  var16 = 0;
                  var20 = var7.Method12380().iterator();

                  label151:
                  while(true) {
                     do {
                        if (!var20.hasNext()) {
                           break label151;
                        }

                        var15 = (var19 = (int[])var20.next())[0];
                     } while((var10 = var19[1]) <= 0);

                     GL15.glBindBuffer(34962, var18);
                     GL11.glVertexPointer(3, 5126, 12, (long)(var16 * 12));
                     GL15.glBindBuffer(34962, var4);
                     GL11.glColorPointer(4, 5121, 4, (long)(var16 << 2));
                     if (var8 != 0 && var15 > 0) {
                        if (!var7.Field1904) {
                           if (var15 != Field3328) {
                              Field3328 = var15;
                              GL11.glBindTexture(3553, Field3328);
                           }

                           GL15.glBindBuffer(34962, var8);
                           GL11.glTexCoordPointer(2, 5126, 8, (long)(var16 << 3));
                        } else if ((var15 = Class843.Method14019(var15)) != Field3328) {
                           Field3328 = var15;
                           GL11.glBindTexture(3553, Field3328);
                        }
                     } else if (Field3328 != 0) {
                        Field3328 = 0;
                        GL11.glBindTexture(3553, 0);
                     }

                     if (Field3328 != 0 && !Field3314) {
                        Field3314 = true;
                        GL11.glEnableClientState(32888);
                     } else if (Field3328 == 0 && Field3314) {
                        Field3314 = false;
                        GL11.glDisableClientState(32888);
                     }

                     if (Field3314) {
                        GL15.glBindBuffer(34962, var8);
                        GL11.glTexCoordPointer(2, 5126, 8, (long)(var16 << 3));
                     }

                     GL11.glDrawArrays(var7.Method12383(), 0, var10);
                     var16 += var10;
                  }
               } else {
                  GL15.glBindBuffer(34962, var18);
                  GL11.glVertexPointer(3, 5126, 0, 0L);
                  if (!var5) {
                     GL15.glBindBuffer(34962, var4);
                     GL11.glColorPointer(4, 5121, 0, 0L);
                  }

                  if (var7.Method12380() != null && var7.Method12380().size() > 0) {
                     var16 = 0;
                     var20 = var7.Method12380().iterator();

                     while(var20.hasNext()) {
                        var15 = (var19 = (int[])var20.next())[0];
                        if ((var10 = var19[1]) > 0) {
                           GL15.glBindBuffer(34962, var18);
                           GL11.glVertexPointer(3, 5126, 12, (long)(var16 * 12));
                           GL15.glBindBuffer(34962, var4);
                           GL11.glColorPointer(4, 5121, 4, (long)(var16 << 2));
                           if (Field3314 && var8 == 0) {
                              GL11.glDisableClientState(32888);
                              Field3314 = false;
                           }

                           if (var15 != Field3328 && var7.Field1904) {
                              if ((Field3328 = Class843.Method14019(var15)) != 0) {
                                 GL11.glBindTexture(3553, Field3328);
                              } else {
                                 Field3328 = 0;
                                 GL11.glBindTexture(3553, 0);
                              }
                           }

                           GL11.glDrawArrays(var7.Method12383(), 0, var10);
                           var16 += var10;
                        }
                     }
                  } else {
                     GL15.glBindBuffer(34962, var18);
                     GL11.glVertexPointer(3, 5126, 12, 0L);
                     GL15.glBindBuffer(34962, var4);
                     GL11.glColorPointer(4, 5121, 4, 0L);
                     if (Field3314 && var8 == 0) {
                        GL11.glDisableClientState(32888);
                        Field3314 = false;
                     }

                     if (Field3328 != 0) {
                        Field3328 = 0;
                        GL11.glBindTexture(3553, 0);
                     }

                     GL11.glDrawArrays(var7.Method12383(), 0, var10);
                  }
               }

               GraphicsDisplay.Method997().Method1035("error in renderVBO(" + var7.Method12374() + ", " + var7.Method12370() + ", " + var7.Method12371() + ")");
            } else {
               System.err.println("[VBORenderer]: invalid handles: " + var18 + ", " + var4 + ", " + var8);
            }
         }
      }
   }
}
