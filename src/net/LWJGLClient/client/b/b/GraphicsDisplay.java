package net.LWJGLClient.client.b.b;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.text.SimpleDateFormat;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Date;
import java.util.Deque;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

import net.LWJGLClient.client.a.Class128;
import net.LWJGLClient.client.a.c.NPCDefinition;
import net.LWJGLClient.client.a.c.ObjectDefinition;
import net.LWJGLClient.client.b.RSFont;
import net.LWJGLClient.client.b.Rasterizer;
import net.LWJGLClient.client.b.b.a.Class232;
import net.LWJGLClient.client.b.b.a.Class237;
import net.LWJGLClient.client.b.b.b.Class745;
import net.LWJGLClient.client.b.b.f.Class838;
import net.LWJGLClient.client.b.b.f.Class841;
import net.LWJGLClient.client.b.b.f.Class843;
import net.LWJGLClient.client.b.b.f.c.Class598;
import net.LWJGLClient.client.b.b.f.c.Class601;
import net.LWJGLClient.client.c.b.Class280;
import net.LWJGLClient.client.d.SceneGraph;
import net.LWJGLClient.client.e.Class17;
import net.LWJGLClient.client.model.Model;
import net.LWJGLClient.client.model.d.Player;
import net.LWJGLClient.client.Signlink;
import net.LWJGLClient.client.a.d.RgbImage;
import net.LWJGLClient.client.b.b.f.Class842;
import net.LWJGLClient.client.b.b.f.b.Class145;
import net.LWJGLClient.client.e.Class25;
import net.LWJGLClient.client.model.Client;
import net.LWJGLClient.client.model.Class867;
import org.lwjgl.BufferUtils;
//import org.lwjgl.glfw.Class222;
import org.lwjgl.glfw.GLFWVidMode;
//import org.lwjgl.glfw.Class70;
//import org.lwjgl.glfw.Class785;
import org.lwjgl.glfw.*;
import org.lwjgl.glfw.GLFW;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL;
import org.lwjgl.system.MemoryStack;

/*
import org.lwjgl.BufferUtils;
import org.lwjgl.glfw.*;
import org.lwjgl.opengl.GL;
import org.lwjgl.opengl.GL11;
import org.lwjgl.system.MemoryStack;
 */
public final class GraphicsDisplay {
   private Deque Field2661 = new ArrayDeque();
   public static boolean Field2662;
   public static boolean Field2663;
   public static boolean Field2664;
   public static boolean Field2665;
   public static boolean Field2666;
   public static boolean Field2667;
   public static boolean Field2668;
   public static boolean Field2669;
   private static boolean Field2670;
   private static int Field2671;
   public static boolean Field2672;
   public static boolean Field2673;
   public static int screenResolutionWidth;
   private static int Field2675;
   public static int Field2676;
   private static String Field2677;
   public static boolean Field2678;
   private static boolean Field2679;
   private static boolean Field2680;
   public static boolean Field2681;
   private static boolean Field2682;
   public static boolean Field2683;
   public static boolean Field2684;
   public boolean Field2685 = false;
   private static GraphicsDisplay Field2686;
   public static float Field2687;
   private boolean Field2688 = false;
   private static int Field2689;
   private static int Field2690;
   private static int Field2691;
   private static int Field2692;
   private static float Field2693;
   private static float Field2694;
   private boolean Field2695 = false;
   private boolean Field2696 = false;
   private boolean Field2697 = false;
   private static long Field2698;
   private static Client Field2699;
   private static Queue Field2700;
   public static int Field2701;
   private static int Field2702;
   private static int Field2703;
   private static int Field2704;
   private static int Field2705;
   private double Field2706 = 0.0D;
   private double Field2707 = 0.0D;
   private double Field2708 = 0.0D;
   private long Field2709 = 0L;
   private double Field2710 = 0.0D;
   private boolean Field2711 = false;
   private static boolean Field2712;
   private int Field2713 = 0;
   private int Field2714 = 0;
   private int Field2715 = 0;
   private long Field2716 = 0L;
   private int Field2717 = 0;
   private static boolean Field2718;
   private static float Field2719;
   private static float Field2720;
   public int[] Field2721 = new int[4];
   private static boolean Field2722;
   private static final Class17 Field2723;

   static {
      new Class237();
      Field2662 = false;
      Field2663 = false;
      Field2664 = false;
      Field2665 = false;
      Field2666 = false;
      Field2667 = true;
      Field2668 = true;
      Field2669 = false;
      Field2670 = false;
      Field2671 = 60;
      Field2672 = false;
      Field2673 = true;
      screenResolutionWidth = 0;
      Field2675 = 0;
      Field2676 = 0;
      Field2677 = null;
      Field2678 = true;
      Field2679 = false;
      Field2680 = false;
      Field2681 = false;
      Field2682 = false;
      Field2683 = false;
      Field2684 = false;
      Field2686 = new GraphicsDisplay();
      Field2687 = 0.001F;
      Field2689 = 0;
      Field2690 = 0;
      Field2691 = 0;
      Field2692 = 0;
      Field2693 = 1.0F;
      Field2694 = 1.0F;
      Field2698 = 0L;
      Field2699 = null;
      Field2700 = new LinkedBlockingQueue();
      Field2701 = 0;
      Field2702 = 0;
      Field2703 = 0;
      Field2704 = 0;
      Field2705 = Client.Field12299;
      Field2712 = false;
      Field2718 = false;
      Field2719 = 1.0F;
      Field2720 = 2.0F;
      Field2722 = false;
      Field2723 = new Class17();
   }

   public static GraphicsDisplay Method997() {
      return Field2686;
   }

   public final void Method998() {
      this.Field2697 = true;
   }

   private static void Method999(String var0, String var1, int var2) {
      JDialog var3;
      (var3 = (new JOptionPane(var1, var2)).createDialog(Client.Field12129 + " " + var0)).setAlwaysOnTop(true);
      var3.setModal(true);
      var3.setDefaultCloseOperation(2);
      var3.setVisible(true);
   }

   public static boolean Method1000() {
      return Field2677 != null && Field2677.toLowerCase().contains("intel");
   }

   public static String Method1001() {
      int var0 = Class843.Method13998().size();
      int var1 = Class843.Method14000().size();
      float var2 = var0 + var1 > 0 ? (float)Class842.Method13975() / (float)(var0 + var1) : (Class842.Method13975() > 0 ? 10.0F : 3.0F);
      String var3 = "glBufs: " + Class842.Method13975() + " [" + (float)Math.round(var2 * 100.0F) / 100.0F + "]";
      return "OS name: ";// + System.getProperty("os.name") + "\nOS version: " + System.getProperty("os.version") + "\nJava version: " + System.getProperty("java.version") + "\nVendor: " + Field2677 + "\nOpenGL version: " + GL11.glGetString(7938) + "\n   detailed: 3.0: " + GL.getCapabilities().Field6373 + ", 2.0: " + GL.getCapabilities().Field6371 + ", ARB_FBO: " + GL.getCapabilities().Field6455 + "\nRenderer: " + GL11.glGetString(7937) + "\nMax Texture: " + screenResolutionWidth + "\nMax RenderBuffer: " + Field2675 + "\nBuffers: " + var3 + "\nAtlasses: " + Class601.Field9002 + "\nTexBuffers: " + Arrays.toString(Class842.Method13976()).replaceAll(", ", ", ") + "\n";
   }

   public static String Method1002() {
      int var0 = Class843.Method13998().size();
      int var1 = Class843.Method14000().size();
      float var2 = var0 + var1 > 0 ? (float)Class842.Method13975() / (float)(var0 + var1) : (Class842.Method13975() > 0 ? 10.0F : 3.0F);
      return "glTextures: " + Arrays.toString(Class842.Method13976()).replaceAll(", ", ", ") + "\nglBuffers: " + Class842.Method13975() + " [" + (float)Math.round(var2 * 100.0F) / 100.0F + "]\nempsVBOs: " + (var0 + var1) + " [m: " + var0 + ", f: " + var1 + "]\nmodelc: " + Model.Method14455() + "\nglAtlasses: " + Class601.Field9002 + "\nforID: " + (Class280.Method2988() == null ? "not yet loaded" : Class280.Method2988().Method2990()) + "\nver: 0." + Client.Field12060 + "\n";
   }

   private void Method1003(String var1, boolean var2) {
      String var3 = null;

      String var4;
      try {
         String var5 = (new SimpleDateFormat("yyyy-MM-dd_hh:mm:ss")).format(new Date());
         String var6 = Signlink.Method11830() + "/crashes/";
         String var7 = var6 + "crash_log_" + var5.replaceAll(":", "-") + ".txt";
         File var8 = new File(var7);
         File var11;
         if (!(var11 = new File(var6)).exists()) {
            var11.mkdirs();
         }

         BufferedWriter var12;
         (var12 = new BufferedWriter(new FileWriter(var8))).write("Emps-World crash on: " + var5);
         var12.newLine();
         var12.newLine();
         var12.write("Execution Environment Details:");
         var12.newLine();
         var12.write(Method1001());
         var12.write(Method1002());
         var12.newLine();
         var12.newLine();
         var12.write("Stack trace (" + this.Field2661.size() + " items):");
         var12.newLine();
         Iterator var10 = this.Field2661.iterator();

         while(var10.hasNext()) {
            var4 = (String)var10.next();
            var12.write(var4.replace("error in ", ""));
            var12.newLine();
         }

         var12.write("END");
         var12.close();
         var3 = var7;
      } catch (IOException var9) {
         var9.printStackTrace();
      }

      var4 = Method1001() + "\nCrashed function: " + "\n" + var1 + "\n\n" + (var3 == null ? "No crash report written" : "Crash report written: " + var3) + "\n\nPress ok to exit." + "\n";
      if (var2) {
         Method999("Crash Report - 0." + Client.Field12060, var4, 0);
         Method1046(-1);
      }

   }

   private static int Method1004() {
      int var0 = 0;

      try {
         if (GL.getCapabilities().GL_ARB_multisample) {
            Field2683 = true;
            if ((var0 = GL11.glGetInteger(36183)) > 4) {
               var0 = 4;
            }
         } else {
            Field2683 = false;
            Field2682 = false;
            Field2681 = false;
         }
      } catch (Exception var2) {
         var2.printStackTrace();
         Field2683 = false;
         Field2682 = false;
         Field2681 = false;
      }

      return var0;
   }

   private static void Method1005(int var0) {
      if (Field2698 > 0L) {
         GLFW.glfwSetWindowSize(Field2698, 0, 0);
         GLFW.glfwHideWindow(Field2698);
         GLFW.glfwDestroyWindow(Field2698);
      }

      System.out.println("[GraphicsDisplay]: updateWindow(" + var0 + "): current thread: " + Thread.currentThread().getName() + ", samples: " + var0);
      GLFW.glfwWindowHint(135181, var0);
      GLFW.glfwWindowHint(131075, 1);
      GLFW.glfwWindowHint(131076, 0);
      GLFW.glfwMakeContextCurrent(Field2698 = GLFW.glfwCreateWindow(Field2689, Field2690, "Emps-World", 0L, 0L));
      GL.createCapabilities();
      if (Field2677 == null) {
         Field2677 = GL11.glGetString(7936);
      }

      GLFW.glfwSwapInterval(0);
   }

   private void Method1006(Exception var1, String var2) {
      String var3 = "no openGL";
      var3 = "no openGL";

      try {
         if (Field2698 != 0L) {
            GLFW.glfwHideWindow(Field2698);
         }
      } catch (Exception var5) {
         var5.printStackTrace();
      }

      (new Thread(new Class108(this, var1, var3, var2))).start();
   }

   public final void Method1007(Client var1) {
      try {
         Field2699 = var1;
         if (!Field2678) {
            Class843.Method13992();
            Class843.Method14016();
            Class843.Method14014();
            Class843.Method14017();
         } else {
            if (!this.Field2696) {
               Client.Method13224(false);
               GLFW.glfwSetErrorCallback(GLFWErrorCallback.createPrint(System.err));
               if (!GLFW.glfwInit()) {
                  System.err.println("Couldn't initialize glfw context. Using software renderer.");
                  Field2678 = false;
                  this.Method1006((Exception)null, "glfwInit()");
                  return;
               }

               GLFWVidMode var2;
               Field2701 = (var2 = GLFW.glfwGetVideoMode(GLFW.glfwGetPrimaryMonitor())).width();
               Field2702 = var2.height();
               if (Field2701 >= 3840) {
                  Field2694 = 2.0F;
                  Field2693 = 2.0F;
               } else if (Field2701 >= 2560) {
                  Field2694 = 1.25F;
                  Field2693 = 1.25F;
               }

               float var3 = (float)Field2701 * 0.7F;
               float var24 = (float)Field2702 * 0.7F;
               if (var3 < 900.0F) {
                  var3 = 900.0F;
               }

               if (var24 < 600.0F) {
                  var24 = 600.0F;
               }

               var3 /= Field2693;
               var24 /= Field2693;
               Client.width = Field2689 = Field2691 = Math.round(var3);
               Client.height = Field2690 = Field2692 = Math.round(var24);
            } else {
               Rasterizer.resetTextures();
               Class843.Method14014();
               Class843.Method14016();
               Class843.Method13992();
               Class843.Method14017();
               Class843.Method13989();
               Class843.Method13988(true);
               Class745.Method12472();
               Client.Method13262();
               Class843.Method14012();
               Class843.Field3755 = true;
               ObjectDefinition.Method11942();
               NPCDefinition.Method11890();
               Player.aBoolean = true;
               Field2689 = (int)((float) Client.width / Field2693);
               Field2690 = (int)((float) Client.height / Field2693);
               System.out.println("wh: " + Field2689 + "/" + Field2690);
            }

            Method1005(0);
            System.out.println("[GraphicsDisplay]: init(): current thread: " + Thread.currentThread().getName());
            System.out.println("[GraphicsDisplay]: details: " + Method1001());
            GLFW.glfwHideWindow(Field2698);
            GLFW.glfwSwapInterval(0);
            if (!Method1000() && !this.Field2696) {
               Field2682 = true;
               Field2681 = true;
               Client.Method13224(false);
            }

            Field2682 = Field2681;

            int var25;
            try {
               if ((var25 = Method1004()) > 0 && Field2681) {
                  Method1005(var25);
               }
            } catch (Exception var18) {
               Method1005(0);
               var18.printStackTrace();
            }

            if (Field2698 == 0L) {
               Field2678 = false;
               System.err.println("Couldn't initialize glfw window (" + Field2689 + "/" + Field2690 + "). Using software renderer.");
            } else {
               var25 = Math.round(((float)Field2701 - (float)Field2689 * Field2693) / 2.0F);
               int var26 = Math.round(((float)Field2702 - (float)Field2690 * Field2693) / 2.0F);
               if (var25 < 0) {
                  var25 = 0;
               }

               if (var26 < 0) {
                  var26 = 0;
               }

              GLFW.glfwSetWindowPos(Field2698, var25, var26);
              GLFW.glfwShowWindow(Field2698);
               GLFW.glfwFocusWindow(Field2698);
               GLFW.glfwSetClipboardString(Field2698, "");
               GLFW.glfwSetWindowIconifyCallback(Field2698, new WindowIcon(this));
               GLFW.glfwSetWindowSizeCallback(Field2698, new WindowSizeReturn(this));
               GLFW.glfwSetFramebufferSizeCallback(Field2698, new FrameSizeCallback(this));
               GLFW.glfwSetScrollCallback(Field2698, new ScrollSensor(this));
              GLFW.glfwSetCursorPosCallback(Field2698, new CursorPosition(this));
               GLFW.glfwSetMouseButtonCallback(Field2698, new MouseClick(this));
              GLFW.glfwSetKeyCallback(Field2698, new KeyPress(this));
               GLFW.glfwSetCharModsCallback(Field2698, new CharacterSensor(this));

               /*
                                   GLFW.glfwSetWindowPos(N, var25, var26);
                    GLFW.glfwShowWindow(N);
                    GLFW.glfwFocusWindow(N);
                    GLFW.glfwSetClipboardString(N, (CharSequence) "");
                    GLFW.glfwSetClipboardString(N, new WindowIcon(this));
                    GLFW.glfwSetWindowSizeCallback(N, new WindowSizeReturn(this));
                    GLFW.glfwSetFramebufferSizeCallback(N, new FrameSizeCallback(this));
                    GLFW.glfwSetScrollCallback(N, new ScrollSensor(this));
                    GLFW.glfwSetCursorPosCallback(N, new CursorPosition(this));
                    GLFW.glfwSetMouseButtonCallback(N, new MouseClick(this));
                    GLFW.glfwSetKeyCallback(N, new KeyPress(this));
                    GLFW.glfwSetCharModsCallback(N, new CharacterSensor(this));
                */

               try {
                  try {
                     Throwable var28 = null;

                     try {
                        //Class393 var29 = Class393.Method6839();
                        MemoryStack var29 = MemoryStack.stackPush();
                        try {
                           int var4 = Class17.Method195() == Class25.Field8568 ? 32 : 128;
                           ByteBuffer var5 = Class841.Method13973("/icon.png", var4);
                           GLFWImage.Buffer var27 = GLFWImage.mallocStack(1, var29).width(var4).height(var4).pixels(var5);
                           GLFW.glfwSetWindowIcon(Field2698, var27);
                        } finally {
                           if (var29 != null) {
                              var29.close();
                           }

                        }
                     } catch (Throwable var20) {
                        if (var28 == null) {
                           var28 = var20;
                        } else if (var28 != var20) {
                           var28.addSuppressed(var20);
                        }

                        //throw var28;
                     }
                  } catch (Exception var21) {
                     var21.printStackTrace();
                  }

                  if (GL.getCapabilities().OpenGL15) {
                     Field2662 = true;
                  }

                  if (GL.getCapabilities().OpenGL30) {
                     Field2663 = true;
                  }

                  if (GL.getCapabilities().GL_ARB_framebuffer_object) {
                     Field2664 = true;
                  }

                  if (GL.getCapabilities().OpenGL20) {
                     Field2665 = true;
                  }

                  GL.getCapabilities();
                  if (!Field2678 || !Field2662) {
                     Field2667 = true;
                     Field2669 = true;
                  }

                  if (!this.Field2696) {
                     screenResolutionWidth = GL11.glGetInteger(3379);
                     Field2675 = GL11.glGetInteger(34024);
                     Field2676 = (screenResolutionWidth > Field2675 ? Field2675 : screenResolutionWidth) / 2;
                     if (Method1000() && Field2676 > 4096) {
                        Field2676 = 4096;
                     } else if (Field2676 > 8192) {
                        Field2676 = 8192;
                     }

                     Client.Field12070 = Field2676;
                     short var30;
                     if (screenResolutionWidth >= 2048) {
                        var30 = 1024;
                        if ((var26 = screenResolutionWidth / 2) >= 4096) {
                           var26 = 4096;
                        }
                     } else {
                        var30 = 0;
                        var26 = 0;
                     }

                     if (var30 != 0 && var30 != 0) {
                        Class843.Field3772 = false;
                        Class843.Field3770 = new Class598(var26, 128, 1, false, true);
                     }
                  }

                  GL11.glEnable(2884);
                  GL11.glCullFace(1029);
                  GL11.glEnable(3042);
                  GL11.glBlendFunc(770, 771);
                  GL11.glAlphaFunc(516, 0.2F);
                  GL11.glEnable(3008);
                  GL11.glPointSize(1.5F);
               } catch (Exception var22) {
                  this.Method1006(var22, "glfwMakeContextCurrent()");
                  Field2678 = false;
               }

               if (!this.Field2696 && Field2678) {
                  Thread var31;
                  (var31 = new Thread(new Class111(this, var1))).setPriority(10);
                  var31.start();
                  Class867.Method14538(true);
               }

               GLFW.glfwSwapInterval(0);
               this.Field2696 = true;
            }
         }
      } catch (Exception var23) {
         var23.printStackTrace();
         this.Field2696 = false;
         Field2678 = false;
         this.Method1006(var23, "other");
      }
   }

   public static void Method1008(boolean var0) {
      if (var0) {
         Field2689 += 4;
         Field2690 += 4;
      }

      Field2684 = true;
   }

   public final void Method1009(int var1, int var2, int var3, int var4, int var5, Client var6) {
      this.Method1010(var3, var2, var5, var1, var4, var6);
   }

   public final void Method1010(int var1, int var2, int var3, int var4, int var5, Client var6) {
      this.Method1011(var1, var2, var3, var4, var5, 255, var6);
   }

   public final void Method1011(int var1, int var2, int var3, int var4, int var5, int var6, Client var7) {
      if (Field2667 && screenResolutionWidth >= 1024) {
         boolean var10000 = Client.Field12593;
      }

      this.Method1025();
      if (this.Field2688) {
         this.Field2688 = false;
         GL11.glDisable(2929);
      }

      GL11.glDisable(3553);
      var2 = var7.Method13237() - var2;
      Method1018(var5, var6);
      GL11.glBegin(7);
      float var8 = Method1021();
      GL11.glVertex3f((float)var1 * Field2687, (float)var2 * Field2687, var8);
      GL11.glVertex3f((float)var1 * Field2687, (float)(var2 - var4) * Field2687, var8);
      GL11.glVertex3f((float)(var1 + var3) * Field2687, (float)(var2 - var4) * Field2687, var8);
      GL11.glVertex3f((float)(var1 + var3) * Field2687, (float)var2 * Field2687, var8);
      GL11.glEnd();
      GL11.glEnable(3553);
   }

   public static void Method1012(float var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, float var10, float var11, int var12, int var13, int var14, int var15, int var16, int var17) {
      if (!Field2670) {
         if (!Field2679) {
            var16 = 0;
         } else if (var16 <= 0) {
            var16 = Rasterizer.Field9944;
         }

         if (var12 > 0 && var13 > 0 && var14 > 0 && var15 > 0 && var12 <= 65535 && var13 <= 65535 && var14 <= 65535 && var15 <= 65535) {
            if (!Field2679) {
               var16 = 0;
            }

            Class843.Method14022(var16, var0 * Field2687, var1 * Field2687, var2 * Field2687, var3 * Field2687, ((float)Field2690 - var4) * Field2687, ((float)Field2690 - var5) * Field2687, ((float)Field2690 - var6) * Field2687, ((float)Field2690 - var7) * Field2687, var8 * Field2687, var9 * Field2687, var10 * Field2687, var11 * Field2687, var12, var13, var14, var15, 256);
         }
      }
   }

   public static void Method1013(float var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, int var9, int var10, int var11, int var12, int[] var13, int[] var14, int var15, int var16, int var17, int var18) {
      if (!Field2670) {
         if (!Field2679) {
            var12 = 0;
         } else if (var12 <= 0) {
            var12 = Rasterizer.Field9944;
         }

         if (var9 > 0 && var10 > 0 && var11 > 0 && var9 <= 65535 && var10 <= 65535 && var11 <= 65535) {
            if (var13 != null) {
               float var38 = (float)var13[0];
               float var19 = (float)var14[0];
               float var20 = (float)var13[1] - var38;
               float var21 = (float)var14[1] - var19;
               float var22 = (float)var13[3] - var38;
               float var23 = (float)var14[3] - var19;
               float var24 = (float)var13[var15] - var38;
               float var35 = (float)var14[var15] - var19;
               float var25 = (float)var13[var16] - var38;
               float var36 = (float)var14[var16] - var19;
               float var33 = (float)var13[var17] - var38;
               float var34 = (float)var14[var17] - var19;
               float var37 = var23 * 0.0F - var21 * 0.0F;
               var38 = var21 * var22 - var20 * var23;
               var19 = var20 * 0.0F - var22 * 0.0F;
               float var26 = var19 * 0.0F - var23 * var38;
               float var27 = var23 * var37 - var22 * var19;
               float var28 = var22 * var38 - var37 * 0.0F;
               float var29 = 1.0F / (var26 * var20 + var27 * 0.0F + var28 * var21);
               float var30 = (var26 * var24 + var27 * 0.0F + var28 * var35) * var29;
               float var31 = (var26 * var25 + var27 * 0.0F + var28 * var36) * var29;
               float var32 = (var26 * var33 + var27 * 0.0F + var28 * var34) * var29;
               var26 = var19 * 0.0F - var21 * var38;
               var27 = var21 * var37 - var20 * var19;
               var28 = var20 * var38 - var37 * 0.0F;
               var29 = 1.0F / (var26 * var22 + var27 * 0.0F + var28 * var23);
               var35 = (var26 * var24 + var27 * 0.0F + var28 * var35) * var29;
               var36 = (var26 * var25 + var27 * 0.0F + var28 * var36) * var29;
               var33 = (var26 * var33 + var27 * 0.0F + var28 * var34) * var29;
               if (var30 < 0.0F) {
                  var30 = 0.0F;
               }

               if (var30 > 1.0F) {
                  var30 = 1.0F;
               }

               if (var31 < 0.0F) {
                  var31 = 0.0F;
               }

               if (var31 > 1.0F) {
                  var31 = 1.0F;
               }

               if (var32 < 0.0F) {
                  var32 = 0.0F;
               }

               if (var32 > 1.0F) {
                  var32 = 1.0F;
               }

               if (var35 < 0.0F) {
                  var35 = 0.0F;
               }

               if (var35 > 1.0F) {
                  var35 = 1.0F;
               }

               if (var36 < 0.0F) {
                  var36 = 0.0F;
               }

               if (var36 > 1.0F) {
                  var36 = 1.0F;
               }

               if (var33 < 0.0F) {
                  var33 = 0.0F;
               }

               if (var33 > 1.0F) {
                  var33 = 1.0F;
               }

               Class843.Method14025(var12, var0 * Field2687, var1 * Field2687, var2 * Field2687, ((float)Field2690 - var3) * Field2687, ((float)Field2690 - var4) * Field2687, ((float)Field2690 - var5) * Field2687, var6 * Field2687, var7 * Field2687, var8 * Field2687, var9, var10, var11, 256, 1.0F - var30, 1.0F - var31, 1.0F - var32, var35, var36, var33);
            } else {
               Class843.Method14026(var12, var0 * Field2687, var1 * Field2687, var2 * Field2687, ((float)Field2690 - var3) * Field2687, ((float)Field2690 - var5) * Field2687, var6 * Field2687, var7 * Field2687, var8 * Field2687, var9, var10, var11, 256, var18);
            }
         }
      }
   }

   private void Method1014(double var1) {
      int var2;
      label59: {
         var2 = Client.Method13398();
         double var9 = (double)(var2 >> 16 & 255);
         double var11 = (double)(var2 >> 8 & 255);
         double var13 = (double)(var2 & 255);
         if (!Client.Field12166 || Client.Field12593) {
            double var15;
            if ((var15 = (double) Client.Field12288 / 0.3D) == 0.0D) {
               var15 = 1.0D;
            }

            double var17 = (var9 - this.Field2706) / var15;
            double var19 = (var11 - this.Field2707) / var15;
            double var21 = (var13 - this.Field2708) / var15;
            if (!Method1016(var17, 0.01D) && !Method1016(var19, 0.01D) && !Method1016(var21, 0.01D)) {
               this.Field2706 += var17;
               this.Field2707 += var19;
               this.Field2708 += var21;
               break label59;
            }
         }

         this.Field2706 = var9;
         this.Field2707 = var11;
         this.Field2708 = var13;
      }

      Field2705 = (((int)this.Field2706 & 255) << 16) + (((int)this.Field2707 & 255) << 8) + ((int)this.Field2708 & 255);
      GL11.glClearColor((float)this.Field2706 / 256.0F, (float)this.Field2707 / 256.0F, (float)this.Field2708 / 256.0F, 0.0F);
      if (var2 != Field2705 || Client.Field12107 != this.Field2695 || this.Field2685) {
         this.Field2695 = Client.Field12107;
         this.Field2685 = false;
         Field2720 = (Field2719 = (float) SceneGraph.Field928 / 25.0F) + (float) SceneGraph.Field928 / 100.0F;
         if (this.Field2695) {
            if (!Field2667) {
               Field2719 -= 0.45F;
               Field2720 -= 0.45F;
               Method1032();
               Method1015();
            } else {
               this.Method1017(true);
            }
         } else {
            Field2719 -= 0.05F;
            Field2720 -= 0.05F;
            GL11.glDisable(2912);
         }

         this.Method1035("error in setBackground(" + var2 + ")");
      }

   }

   private static void Method1015() {
      FloatBuffer var0;
      (var0 = BufferUtils.createFloatBuffer(4)).put((float)(Field2705 >> 16 & 255) / 256.0F);
      var0.put((float)(Field2705 >> 8 & 255) / 256.0F);
      var0.put((float)(Field2705 & 255) / 256.0F);
      var0.put(1.0F);
      var0.flip();
      GL11.glEnable(2912);
      GL11.glFogfv(2918, var0);
      GL11.glFogi(2917, 9729);
      GL11.glFogf(2915, Field2719);
      GL11.glFogf(2916, Field2720);
   }

   private static boolean Method1016(double var0, double var2) {
      if (var0 < 0.0D) {
         var0 = -var0;
      }

      return var0 >= -0.01D && var0 <= 0.01D;
   }

   public final void Method1017(boolean var1) {
      float var2 = Class745.Method12477(true);
      int var3 = SceneGraph.Field928;
      float var6;
      if (SceneGraph.Field928 > 40 && Client.Field12593) {
         if (var3 <= 60) {
            var6 = 1.5F;
            var2 -= 0.25F;
         } else if (var3 <= 80) {
            var6 = 1.5F;
            var2 += 0.25F;
         } else {
            var6 = 2.0F;
            var2 += 0.25F;
         }
      } else {
         var6 = 1.0F;
      }

      float var4 = var6 / 2.5F;
      var2 += var4;
      if (!var1) {
         var6 = 0.0F;
      }

      if (!Field2665) {
         var6 = 0.1F;
      }

      if (!Client.Field12593) {
         --var2;
      }

      float var5 = var6 - 3.0F;
      Field2719 = (Field2720 = var2 - var5) - var6;
      Method1015();
   }

   private static void Method1018(int var0, int var1) {
      float var2 = (float)(var0 >> 16 & 255);
      float var3 = (float)(var0 >> 8 & 255);
      float var4 = (float)(var0 & 255);
      float var5 = (float)var1 / 256.0F;
      GL11.glColor4f(var2 / 256.0F, var3 / 256.0F, var4 / 256.0F, var5);
   }

   public final void Method1019(byte[] var1, int var2, int var3, int var4, int var5, int var6, char var7, RSFont var8, boolean var9) {
      int var10 = 255 - (var6 >> 24) & 255;
      int var11 = var10;
      boolean var29 = var9;
      RSFont var27 = var8;
      char var26 = var7;
      int var25 = var6;
      var6 = var5;
      var5 = var4;
      if (this.Field2696 && (!Client.Field12120 || var3 >= 20)) {
         var4 = Field2690 - var3 - var6;
         long var23 = Class843.Method14015(var26, var27.Field9972, var29 ? 1 : 0);
         if (Field2667 && screenResolutionWidth >= 1024 && Client.Field12263) {
            Class843.Method13996(var23, var2, var4, var25, var11, var1, var5, var6, !var29);
         } else {
            if (this.Field2688) {
               this.Field2688 = false;
               GL11.glDisable(2929);
               GL11.glEnable(3553);
            }

            Integer var28;
            if (var29) {
               if ((var28 = (Integer)Class843.Field3789.get(var23)) == null) {
                  var28 = Class838.Method13931(var1, var5, var6, 16777215);
                  Class843.Field3789.put(var23, var28);
               }
            } else {
               var28 = Class838.Method13931(var1, var5, var6, 16777215);
            }

            Method1018(var25, 255);
            GL11.glBindTexture(3553, var28);
            GL11.glBegin(7);
            GL11.glTexCoord2f(0.0F, 0.0F);
           GL11.glVertex2f((float)var2 * Field2687, (float)var4 * Field2687);
            GL11.glTexCoord2f(1.0F, 0.0F);
           GL11.glVertex2f((float)var5 * Field2687 + (float)var2 * Field2687, (float)var4 * Field2687);
            GL11.glTexCoord2f(1.0F, 1.0F);
           GL11.glVertex2f((float)var5 * Field2687 + (float)var2 * Field2687, (float)var6 * Field2687 + (float)var4 * Field2687);
            GL11.glTexCoord2f(0.0F, 1.0F);
           GL11.glVertex2f((float)var2 * Field2687, (float)var6 * Field2687 + (float)var4 * Field2687);
            GL11.glEnd();
            if (!var29) {
               Class842.Method13981(Class842.Field3812, var28);
            }

            this.Method1035("error in addText(" + var26 + ", " + var29 + ")");
         }
      }
   }

   public final void Method1020(RgbImage var1, int var2, int var3, int var4, int var5, int var6, long var7) {
      long var15 = var7;
      if (this.Field2696 && !Field2670) {
         var4 = Field2690 - var3 - var5;
         int var18 = var1.Field9894;
         var5 = var1.Field9895;
         if (!Field2667 || screenResolutionWidth < 1024 || !Client.Field12593 || var15 == -1L || !Class843.Method13994(var15, var2, var4, var6, var18, var5, var1)) {
            Long var17 = Class843.Method13991(var2, var4, var18, var5, var15);
            boolean var9;
            if (var9 = var15 < 0L || Class843.Field3765.get(var17) == null) {
               var1.Method9428();
            }

            if (var17 != null) {
               var1.Field9879 = var17;
            }

            if (var1.Field9893 != null || !var9) {
               this.Method1022(var1.Field9893, var2, var3, var18, var5, var6, var15);
               if (var9 && var15 != -1L) {
                  var1.Method14450();
               }

               this.Method1035("error in addSprite(" + var15 + ")");
            }
         }

      }
   }

   public static float Method1021() {
      return Class745.Field3317 += Class745.Field3316;
   }

   public final void Method1022(int[] var1, int var2, int var3, int var4, int var5, int var6, long var7) {
      var3 = Field2690 - var3 - var5;
      boolean var9;
      if (var9 = Field2667 && var4 == 48) {
         if (!this.Field2688) {
            this.Field2688 = true;
            GL11.glEnable(2929);
            GL11.glEnable(3553);
         }
      } else if (this.Field2688) {
         this.Field2688 = false;
         GL11.glDisable(2929);
         GL11.glEnable(3553);
      }

      Method1018(-1, var6);
      Integer var13;
      if (var7 == -1L) {
         var13 = Class838.Method13937(var1, var4, var5, 255, false, -1);
      } else {
         long var11;
         if (var7 < 0L) {
            var11 = Class843.Method13991(var2, var3, var4, var5, -var7);
            if ((var13 = (Integer)Class843.Field3765.get(var11)) == null) {
               var13 = Class838.Method13937(var1, var4, var5, 255, false, -1);
               Class843.Field3765.put(var11, var13);
            } else {
               Class838.Method13938(true, var13, var1, var4, var5, 255, false, -1);
               Class843.Field3765.put(var11, var13);
            }
         } else {
            var11 = Class843.Method13991(var2, var3, var4, var5, var7);
            if ((var13 = (Integer)Class843.Field3765.get(var11)) == null) {
               var13 = Class838.Method13937(var1, var4, var5, 255, false, -1);
               Class843.Field3765.put(var11, var13);
            }
         }
      }

      GL11.glBindTexture(3553, var13);
      GL11.glBegin(7);
      if (var9) {
         float var14 = Class745.Field3317 += Class745.Field3316;
         GL11.glTexCoord2f(0.0F, 0.0F);
         GL11.glVertex3f((float)var2 * Field2687, (float)var3 * Field2687, var14);
         GL11.glTexCoord2f(1.0F, 0.0F);
         GL11.glVertex3f((float)var4 * Field2687 + (float)var2 * Field2687, (float)var3 * Field2687, var14);
         GL11.glTexCoord2f(1.0F, 1.0F);
         GL11.glVertex3f((float)var4 * Field2687 + (float)var2 * Field2687, (float)var5 * Field2687 + (float)var3 * Field2687, var14);
         GL11.glTexCoord2f(0.0F, 1.0F);
         GL11.glVertex3f((float)var2 * Field2687, (float)var5 * Field2687 + (float)var3 * Field2687, var14);
      } else {
         GL11.glTexCoord2f(0.0F, 0.0F);
        GL11.glVertex2f((float)var2 * Field2687, (float)var3 * Field2687);
         GL11.glTexCoord2f(1.0F, 0.0F);
        GL11.glVertex2f((float)var4 * Field2687 + (float)var2 * Field2687, (float)var3 * Field2687);
         GL11.glTexCoord2f(1.0F, 1.0F);
        GL11.glVertex2f((float)var4 * Field2687 + (float)var2 * Field2687, (float)var5 * Field2687 + (float)var3 * Field2687);
         GL11.glTexCoord2f(0.0F, 1.0F);
        GL11.glVertex2f((float)var2 * Field2687, (float)var5 * Field2687 + (float)var3 * Field2687);
      }

      GL11.glEnd();
      if (var7 == -1L) {
         Class842.Method13981(Class842.Field3814, var13);
      }

      this.Method1035("error in addSpritePixels(" + var7 + ")");
   }

   public final boolean Method1023() {
      long var1 = System.nanoTime();
      this.Field2710 = (double)(var1 - this.Field2709) / 1000000.0D;
      this.Field2709 = var1;
      return true;
   }

   public final void Method1024() {
      Model.Method14514();
      this.Field2711 = true;
   }

   public final void Method1025() {
      if (Field2667) {
         Class745.Method12476(false);
      } else {
         Class128.Method1324(false);
      }

      this.Field2688 = true;
   }

   public final void Method1026(double var1) {
      if (Field2712) {
         GL11.glGetError();
      }

      Model.Method14512();
      if (Field2667) {
         Class745.Method12476(true);
      } else {
         Class128.Method1324(true);
      }

      this.Field2688 = true;
      this.Field2711 = false;
      if (!Field2712) {
         this.Method1014(var1);
      }

      Method1032();
      if (this.Field2697) {
         this.Field2697 = false;
         String var2 = Method1001();
         (new Thread(new Class117(this, var2))).start();
      }

      Class843.Method13995();
      this.Method1035("error in endRenderingWorld()");
   }

   public final void Method1027(float[][] var1, float[] var2, float[] var3, float[] var4, int[] var5, int[] var6, int[] var7, int[] var8, int[] var9, int var10, int[] var11, int[][] var12, int[] var13, int[] var14, int[] var15, int[] var16, int[] var17, int[] var18, byte[] var19, int[] var20, int[] var21, int[] var22, int[] var23, int[] var24, int[] var25, int[] var26, int[] var27, int[] var28, int[] var29, int[] var30, int[] var31, int[] var32, int[] var33, int var34) {
      if (!Field2670) {
         --var10;

         for(; var10 >= 0; --var10) {
            int var35;
            if ((var35 = var11[var10]) > 0) {
               Class232.Method2623(var1, var2, var3, var4, var5, var6, var7, var8, var9, var12, var13, var14, var15, var16, var17, var18, var10, var35, Field2690, Field2687, var34);
            }
         }

      }
   }

   public final void Method1028(Client var1) {
      if (this.Field2696) {
         if (Class280.Method2988() != null) {
            Class280.Method2988().Method2991();
            Class280.Method2988().Method2992();
            long var10000 = Client.Field12142;
            if (!Field2667) {
               this.Method1014(0.0D);
            }

            GL11.glClear(17664);
            int var3 = Math.round((float)(Client.Field12712 ? 780 : 765));
            int var4 = Math.round((float)(Client.Field12712 ? 540 : 503));
            if (Field2689 < var3 || Field2690 < var4) {
               Field2684 = true;
            }

            if (!Client.Field12712 && (Field2689 > 765 || Field2690 > 503)) {
               Field2684 = true;
               Field2689 = 765;
               Field2690 = 503;
            }

            if (Field2684) {
               var3 = Math.round((float)(Client.Field12712 ? 780 : 765) * Field2693);
               var4 = Math.round((float)(Client.Field12712 ? 540 : 503) * Field2693);
               int var5 = Math.round((float)Field2689 * Field2693);
               int var6 = Math.round((float)Field2690 * Field2693);
               if (var5 < var3) {
                  var5 = var3;
               }

               if (var6 < var4) {
                  var6 = var4;
               }

               if (var5 > Field2701) {
                  var5 = Math.round((float)Field2701 / Field2693);
               }

               if (var6 > Field2702) {
                  var6 = Math.round((float)Field2702 / Field2693);
               }

               GLFW.glfwSetWindowSize(Field2698, var5, var6);
               Field2684 = false;
               this.Method1033();
               var1.Field12203 = true;
               Client.Field12714 = Field2689 - 765;
               Client.Field12715 = Field2690 - 503;
               Client.width = Field2689;
               Client.height = Field2690;
            }

            int var8 = Client.Field12134;
            float var7 = (float)(-Client.Field12134) * Field2687 * 0.9F;
            if (Field2678 && !Field2667) {
               GL11.glTranslatef(0.0F, 0.0F, var7);
            }

            Field2679 = Rasterizer.Field9945;
            Field2680 = Rasterizer.Field9947;
         }

      }
   }

   public static boolean Method1029() {
      return Field2712;
   }

   public final void Method1030(Client var1) {
      Class843.Method14018();
      if (Field2667) {
         Class745.Method12476(false);
      } else {
         Class128.Method1324(false);
      }

      this.Field2688 = true;
      Field2671 = Client.Field12118;
      if (!Client.Field12593 && (!Client.Field12263 || Client.Field12166)) {
         Field2671 = 60;
      } else if (Client.class329 != null) {
         Field2671 = 60;
      }

      if (Field2712) {
         Field2671 = 5;
         Field2670 = true;
      } else {
         Field2670 = false;
      }

      GLFW.glfwPollEvents();
      GLFW.glfwSwapBuffers(Field2698);
      if (Field2671 < 255) {
         Field2723.Method194((double)Field2671, 0);
      }

      this.Field2717 = 0;
      if (GLFW.glfwWindowShouldClose(Field2698)) {
         try {
            var1.resetForLogout();
         } catch (Exception var3) {
            var3.printStackTrace();
         }

         Method1046(0);
      }

      if (Field2682 != Field2681) {
         this.Method1007(var1);
      }

   }

   public final void Method1031(boolean var1) {
      try {
         if (Class17.Method196() && !var1) {
            GLFW.glfwPollEvents();
         }

         if (!var1) {
            ++this.Field2717;
            if (this.Field2717 > 100 && GLFW.glfwWindowShouldClose(Field2698)) {
               try {
                  Field2699.resetForLogout();
               } catch (Exception var12) {
                  var12.printStackTrace();
               }

               Method1046(0);
            }
         }

         var1 = false;
         Class145 var2 = (Class145)Field2700.poll();

         while(var2 != null) {
            if (var2 != null) {
               label124: {
                  int var4 = var2.Method1464();
                  int var5 = var2.Method1465();
                  int var6 = var2.Method1466();
                  int var7 = var2.Method1467();
                  if (var6 != -1) {
                     this.Field2715 = var6;
                  }

                  int var8;
                  if (this.Field2715 == 2) {
                     var8 = this.Field2713 - var4;
                     int var9 = this.Field2714 - var5;
                     if (var9 > 0) {
                        Field2699.Method11962(40, 0, var9);
                     } else if (var9 < 0) {
                        Field2699.Method11962(38, 0, var9);
                     }

                     if (var8 > 0) {
                        Field2699.Method11962(39, 0, var8);
                     } else if (var8 < 0) {
                        Field2699.Method11962(37, 0, var8);
                     }
                  }
/*                            if (var8 > 0) {
                                Client.loadInterface(39, 0, var8);
                            } else if (var8 < 0) {
                                Client.loadInterface(37, 0, var8);*/
                  label109: {
                     if (var6 == 0 && this.Field2716 != 0L && System.currentTimeMillis() - this.Field2716 > 0L) {
                        if (Field2699.openInterfaceID != -1 && Field2699.Field12281) {
                           var8 = Field2718 ? -100 : 0;
                           if (var4 - 5 - var8 >= Field2699.Field12282 && var4 + var8 <= 505 + Field2699.Field12282 && var5 - 5 - var8 >= Field2699.Field12283 && var5 + var8 <= 45 + Field2699.Field12283) {
                              int var17 = Field2699.Field12282;
                              var17 = Field2699.Field12283;
                              int var10 = var4 - this.Field2713;
                              int var11 = var5 - this.Field2714;
                              Field2699.Field12282 += var10;
                              Field2699.Field12283 += var11;
                              Field2699.Method13361();
                              Field2718 = true;
                           } else if (!Field2718 && var2.Method1467() == 1) {
                              break label124;
                           }
                           break label109;
                        }

                        boolean var10000 = Field2699.Field12147;
                     }

                     Field2718 = false;
                  }

                  this.Field2713 = var4;
                  this.Field2714 = var5;
                  Field2699.Method13226(var4, var5);
                  boolean var15 = var6 == 1;
                  boolean var16;
                  if (var16 = var7 == 1) {
                     this.Field2716 = System.currentTimeMillis();
                     Field2699.Method11959(var4, var5, var6, var15);
                  } else {
                     this.Field2716 = 0L;
                     this.Field2715 = -1;
                     Client var14 = Field2699;
                     Field2699.Field8808 = 0;
                  }
               }
            }

            var2 = (Class145)Field2700.poll();
            if (this.Field2716 == 0L) {
               var1 = true;
            }
         }

         if (var1) {
            this.Field2716 = 0L;
            this.Field2715 = -1;
            return;
         }
      } catch (Exception var13) {
         var13.printStackTrace();
      }

   }

   public static void Method1032() {
      GL11.glMatrixMode(5889);
      GL11.glLoadIdentity();
      GL11.glOrtho(0.0D, (double)((float)Field2689 * Field2687), 0.0D, (double)((float)Field2690 * Field2687), (double)Field2720, (double)(-Field2720));
      GL11.glMatrixMode(5888);
      GL11.glLoadIdentity();
   }

   public final void Method1033() {
      GL11.glViewport(0, 0, Math.round((float)Field2691 * Field2693), Math.round((float)Field2692 * Field2693));
      Method1032();
      GL11.glMatrixMode(5888);
      GL11.glLoadIdentity();
      IntBuffer var1 = BufferUtils.createIntBuffer(16);
      GL11.glGetIntegerv(2978, (IntBuffer) var1);
      var1.get(this.Field2721);
   }

   public static void Method1034() {
      GL11.glGetError();
   }

   public final boolean Method1035(String var1) {
      return this.Method1036(var1, true);
   }

   public final boolean Method1036(String var1, boolean var2) {
      int var3 = Client.Field12080 ? 1000 : 250;

      while(this.Field2661.size() > var3) {
         this.Field2661.removeFirst();
      }

      if ((var3 = GL11.glGetError()) == 0) {
         this.Field2661.addLast(var1);
         return false;
      } else {
         this.Field2661.addLast(var1 + " [error: " + var3 + "]");
         (new Throwable()).printStackTrace();
         if (var3 == 1281 || var3 == 1280 || var3 == 1282 || var3 == 1286 || var3 == 1285) {
            var2 = false;
         }

         if (var3 == 1285 && !Field2722) {
            Field2722 = true;
            Client.Field12059.add("Your graphics card has just reported it's out of memory.");
            Client.Field12059.add("Please lower your graphic settings to fix this problem.");
         }

         System.err.println("ERROR - " + var1 + ": " + var3);
         this.Method1003(var1 + ": " + var3, var2);
         return true;
      }
   }

   public final void Method1037(String var1) {
      this.Method1003(var1, true);
      Method1046(-1);
   }

   public static int Method1038() {
      return Field2689;
   }

   public static int Method1039() {
      return Field2690;
   }

   public static float Method1040() {
      return Field2693;
   }

   public static float Method1041() {
      return Field2694;
   }

   public static float Method1042() {
      return (float)Field2691 / (float)Field2689;
   }

   public static float Method1043() {
      return (float)Field2692 / (float)Field2690;
   }

   public static void Method1044(float var0) {
      if (!Client.Field12712) {
         var0 *= Field2694;
      }

      Field2693 = var0;
      Field2684 = true;
   }

   public final double Method1045() {
      return this.Field2710;
   }

   private static void Method1046(int var0) {
      try {
         System.out.println("[GraphicsDisplay]: cleaning up for exit...");
         Class843.Method14012();
         Class843.Method14014();
         Class843.Method14016();
         Class843.Method13992();
         Class843.Method14017();
         Class843.Method13989();
         Class745.Method12472();
         System.out.println(Method1002());
         System.out.println("[GraphicsDisplay]: exited.");
      } catch (Exception var2) {
         var2.printStackTrace();
      }

      GLFW.glfwTerminate();
      System.exit(var0);
   }

   // $FF: synthetic method
   static void Method1047(GraphicsDisplay var0, String var1, String var2, int var3) {
      Method999(var1, var2, var3);
   }

   // $FF: synthetic method
   static void Method1048(boolean var0) {
      Field2712 = var0;
   }

   // $FF: synthetic method
   static float Method1049() {
      return Field2693;
   }

   // $FF: synthetic method
   static void Method1050(int var0) {
      Field2689 = var0;
   }

   // $FF: synthetic method
   static void Method1051(int var0) {
      Field2690 = var0;
   }

   // $FF: synthetic method
   static void Method1052(int var0) {
      Field2691 = var0;
   }

   // $FF: synthetic method
   static void Method1053(int var0) {
      Field2692 = var0;
   }

   // $FF: synthetic method
   static Client Method1054() {
      return Field2699;
   }

   // $FF: synthetic method
   static void Method1055(int var0) {
      Field2703 = var0;
   }

   // $FF: synthetic method
   static void Method1056(int var0) {
      Field2704 = var0;
   }

   // $FF: synthetic method
   static int Method1057() {
      return Field2703;
   }

   // $FF: synthetic method
   static int Method1058() {
      return Field2704;
   }

   // $FF: synthetic method
   static long Method1059(GraphicsDisplay var0) {
      return var0.Field2716;
   }

   // $FF: synthetic method
   static int Method1060(GraphicsDisplay var0) {
      return var0.Field2715;
   }

   // $FF: synthetic method
   static Queue Method1061() {
      return Field2700;
   }

   // $FF: synthetic method
   static void Method1062(GraphicsDisplay var0, int var1) {
      var0.Field2713 = var1;
   }

   // $FF: synthetic method
   static void Method1063(GraphicsDisplay var0, int var1) {
      var0.Field2714 = var1;
   }

   // $FF: synthetic method
   static boolean Method1064(GraphicsDisplay var0) {
      return var0.Field2696;
   }
}
