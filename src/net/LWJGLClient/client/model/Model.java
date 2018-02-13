package net.LWJGLClient.client.model;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

import net.LWJGLClient.client.a.Class128;
import net.LWJGLClient.client.a.a.Class518;
import net.LWJGLClient.client.b.Rasterizer;
import net.LWJGLClient.client.b.b.b.a.ModelVBO;
import net.LWJGLClient.client.b.b.b.a.Texture;
import net.LWJGLClient.client.b.b.f.Class843;
import net.LWJGLClient.client.d.Class569;
import net.LWJGLClient.client.d.a.Class730;
import net.LWJGLClient.client.model.a.d.Class451;
import net.LWJGLClient.client.a.OnDemandFetcher;
import net.LWJGLClient.client.a.a.Class511;
import net.LWJGLClient.client.a.c.Class696;
import net.LWJGLClient.client.a.d.Class120;
import net.LWJGLClient.client.b.a.Class697;
import net.LWJGLClient.client.b.b.GraphicsDisplay;
import net.LWJGLClient.client.b.b.b.Class745;
import net.LWJGLClient.client.b.b.b.b.Class403;
import net.LWJGLClient.client.b.b.e.Class358;
import net.LWJGLClient.client.b.b.f.Class838;
import net.LWJGLClient.client.c.Packet;
import net.LWJGLClient.client.d.SceneGraph;
import net.LWJGLClient.client.e.d.Class445;
import net.LWJGLClient.client.model.a.a.Class501;
import net.LWJGLClient.client.model.f.TextureData;

public final class Model extends Class511 {
   private static boolean Field2743 = true;
   private static boolean Field2744 = true;
   public boolean Field2745;
   public int Field2746;
   private static Map Field2747 = new HashMap();
   private static final int Field2748;
   public static ExecutorService Field2749;
   public boolean Field2750;
   public int Field2751;
   public int Field2752;
   public boolean Field2753;
   public int Field2754;
   public int Field2755;
   public boolean Field2756;
   public boolean Field2757;
   public boolean Field2758;
   public float[][] Field2759;
   private int Field2760;
   private static boolean Field2761;
   private List Field2762;
   private static int Field2763;
   private static int Field2764;
   private boolean Field2765;
   public boolean Field2766;
   public boolean Field2767;
   public int Field2768;
   private float Field2769;
   private static long Field2770;
   private static List Field2771;
   public static boolean[] Field2772;
   private boolean Field2773;
   public byte[] Field2774;
   public int[] Field2775;
   public int[] Field2776;
   private int Field2777;
   private int Field2778;
   private int[] Field2779;
   private byte[] Field2780;
   private byte[] Field2781;
   private byte[] Field2782;
   private float[] Field2783;
   private float[] Field2784;
   private static Map Field2785;
   private Model[] Field2786;
   private static Model[] Field2787;
   private static boolean Field2788;
   private float Field2789;
   private float Field2790;
   private float Field2791;
   private int Field2792;
   private int Field2793;
   private int Field2794;
   private static String Field2795;
   private static String Field2796;
   private static String Field2797;
   public static int Field2798;
   private static ExecutorService Field2799;
   private static Object[] Field2800;
   private static AtomicInteger Field2801;
   private static int Field2802;
   private static boolean Field2803;
   private static int Field2804;
   public static int Field2805;
   private static boolean Field2806;
   private static Map Field2807;
   public static boolean Field2808;
   public static Map Field2809;
   public static int Field2810;
   public static int Field2811;
   private int Field2812;
   private boolean Field2813;
   private boolean Field2814;
   private static int Field2815;
   private static Model[] Field2816;
   private int Field2817;
   public int Field2818;
   public int[] Field2819;
   public int[] Field2820;
   public int[] Field2821;
   public int[] Field2822;
   private int[] Field2823;
   private int[] Field2824;
   private int[] Field2825;
   private int[] Field2826;
   private int[] Field2827;
   private int[] Field2828;
   private int[] Field2829;
   public int[] Field2830;
   public int[] Field2831;
   public int[] Field2832;
   public int[] Field2833;
   public int[] Field2834;
   public int[] Field2835;
   public int[] Field2836;
   public int Field2837;
   public int Field2838;
   public int[] Field2839;
   public int[] Field2840;
   public int[] Field2841;
   private int Field2842;
   private int Field2843;
   private int Field2844;
   private int Field2845;
   public int Field2846;
   private int Field2847;
   private int Field2848;
   private int Field2849;
   public int Field2850;
   private int[] Field2851;
   private int[] Field2852;
   private int[][] Field2853;
   private int[][] Field2854;
   public boolean Field2855;
   private Class445[] Field2856;
   private static Map Field2857;
   private static OnDemandFetcher Field2858;
   public static int Field2859;
   private static int Field2860;
   private static boolean[] Field2861;
   private static boolean[] Field2862;
   public static float[][] Field2863;
   public static float[][] Field2864;
   public static float[][] Field2865;
   private static float[][] Field2866;
   private static int[][] Field2867;
   private static int[][] Field2868;
   private static int[][] Field2869;
   private static int[][] Field2870;
   private static int[][][] Field2871;
   private static int[] Field2872;
   private static int[][] Field2873;
   private static int[] Field2874;
   private static int[] Field2875;
   private static int[] Field2876;
   private static float Field2877;
   private static float Field2878;
   private static float Field2879;
   public static int Field2880;
   public static int Field2881;
   private static List Field2882;
   private static List Field2883;
   private Map Field2884;
   private int Field2885;
   private FloatBuffer Field2886;
   private float[] Field2887;
   private int Field2888;
   // $FF: synthetic field
   private static int[] Field2889;
   // $FF: synthetic field
   private static int[] Field2890;

   static {
      Field2749 = Executors.newFixedThreadPool((Field2748 = Runtime.getRuntime().availableProcessors()) >= 4 ? 2 : 1);
      Field2761 = false;
      Field2763 = 65518;
      Field2764 = '￮' + 10 + 1000;
      Field2770 = System.currentTimeMillis();
      Field2771 = new LinkedList();
      Field2772 = null;
      Field2785 = null;
      Field2787 = null;
      Field2788 = false;
      Field2795 = "Cla";
      Field2796 = "at Cl";
      Field2797 = "nt";
      (new StringBuilder()).append(Field2795).append("n Ch").append(Field2796).append("ie").append(Field2797).append(" ");
      Field2798 = 0;
      Field2799 = null;
      Field2800 = null;
      Field2801 = new AtomicInteger(0);
      Field2802 = 0;
      Field2803 = false;
      Field2805 = Field2804 = Runtime.getRuntime().availableProcessors();
      Field2806 = false;
      Field2807 = new HashMap();

      int var0;
      for(var0 = 7129; var0 <= 7141; ++var0) {
         Field2807.put(var0, new int[]{120, 210, 0});
      }

      Field2807.put(2531, new int[]{48, -1});
      Field2807.put(12774, new int[]{128, 312});
      Field2807.put(3583, new int[]{64, 512});
      Field2807.put('괳', new int[]{256, 32});
      Field2807.put('ꩃ', new int[]{192, -1});
      Field2807.put('ꨌ', new int[]{192, 1});
      Field2808 = false;
      Field2809 = new HashMap();
      Field2810 = 0;
      Field2811 = 1;
      Field2816 = new Model[Field2805];
      Field2859 = 9216;
      Field2860 = 4096;
      Field2861 = null;
      Field2862 = null;
      Field2863 = null;
      Field2864 = null;
      Field2865 = null;
      Field2866 = null;
      Field2867 = null;
      Field2868 = null;
      Field2869 = null;
      Field2870 = null;
      Field2871 = null;
      Field2872 = null;
      Field2873 = null;
      Field2874 = null;
      Field2875 = null;
      Field2876 = null;
      Field2877 = 0.0F;
      Field2878 = 0.0F;
      Field2879 = 0.0F;
      Field2882 = new ArrayList(32);
      Field2883 = new ArrayList(32);

      for(var0 = 0; var0 < Field2805; ++var0) {
         Field2816[var0] = new Model(true);
      }

   }

   public static void Method14444() {
      Field2747.clear();
   }

   public final void Method14445(int var1) {
      this.Field2760 = var1;
   }

   public final int Method14446() {
      return this.Field2760;
   }

   public final int Method14447(int var1) {
      if ((this.Field2836 == null || var1 < this.Field2836.length) && (this.Field2775 == null || var1 < this.Field2775.length)) {
         int var2 = this.Field2833 != null && var1 < this.Field2833.length ? this.Field2833[var1] & 255 : 0;
         int var3 = this.Field2776 != null ? this.Field2776[var1] : -1;
         boolean var4 = false;
         boolean var5 = false;
         if ((this.Field2836[var1] <= 50 || this.Field2775 != null && var1 < this.Field2775.length && this.Field2775[var1] != -1) && var3 == 0 && this.Field2836[var1] <= 50 && this.Field2776 == null) {
            var3 = this.Field2836[var1];
            var4 = true;
         }

         if (var3 <= 0 && this.Field2836[var1] <= 50 && var2 != 1 && var2 != 0) {
            var3 = this.Field2836[var1];
         }

         if (Class120.Field9548 != null) {
            if (var3 >= Class120.Field9548.length) {
               return -1;
            }

            if (var3 > 0) {
               Class120[] var10000 = Class120.Field9548;
            }

            if (var3 >= 0) {
               var5 = Texture.Field1929[var3];
            }

            if (var3 > 0 && Texture.Field1932[var3]) {
               var4 = true;
            }
         }

         if (var3 >= 0 && !var5 && !Rasterizer.Field9947 && !Texture.Field1929[var3]) {
            var4 = false;
            var3 = -1;
         }

         if (var4 && var3 > 0) {
            var3 = -var3;
         }

         if (var3 >= 657 && var3 <= 667) {
            var3 = -1;
         }

         return var3;
      } else {
         return -1;
      }
   }

   public final List Method14448() {
      return this.Field2762;
   }

   private void Method14449(int var1, Class696 var2) {
      this.Field2762.clear();
      int var4;
      float var6;
      float var12;
      float var13;
      if (this.Field2758) {
         for(int var3 = 0; var3 < this.Field2818; ++var3) {
            if ((var4 = this.Method14447(var3)) < -1) {
               var4 = -var4;
            }

            if (this.Field2762.indexOf(var4) == -1) {
               this.Field2762.add(var4);
            }

            if (var4 > 0 && TextureData.Field2911[var4]) {
               this.Field2757 = true;
            }

            if (var4 > 0 && Texture.Field1931[var4]) {
               this.Field2756 = true;
            }

            if (this.Field2759 != null) {
               float var5 = this.Field2759[var3][0];
               var6 = this.Field2759[var3][1];
               float var7 = this.Field2759[var3][2];
               float var8 = this.Field2759[var3][3];
               float var9 = this.Field2759[var3][4];
               float var10 = this.Field2759[var3][5];
               if (var4 > 0 && Texture.Field1930[var4]) {
                  float var11 = var5;
                  var12 = var7;
                  var13 = var9;
                  var5 = var6;
                  var7 = var8;
                  var9 = var10;
                  var6 = 1.0F - var11;
                  var8 = 1.0F - var12;
                  var10 = 1.0F - var13;
               }

               this.Field2759[var3][0] = var5;
               this.Field2759[var3][1] = var6;
               this.Field2759[var3][2] = var7;
               this.Field2759[var3][3] = var8;
               this.Field2759[var3][4] = var9;
               this.Field2759[var3][5] = var10;
            }
         }
      }

      if (this.Field2759 == null) {
         int[] var103 = null;
         Class403 var104 = null;
         if (var2.Field10529 != null) {
            this.Field2759 = var2.Field10529;
         } else {
            var2.Field10529 = this.Field2759 = new float[this.Field2818][6];

            for(int var105 = 0; var105 < this.Field2818; ++var105) {
               int var107;
               if ((var107 = this.Field2835 != null && var105 < this.Field2835.length ? 255 - this.Field2835[var105] : 255) > 255) {
                  var107 = 255;
               }

               if (var107 < 255) {
                  this.Field2757 = true;
               }

               int var109 = this.Field2819[var105];
               int var110 = this.Field2820[var105];
               int var111 = this.Field2821[var105];
               boolean var112 = false;
               var12 = 0.999F;
               var13 = 0.001F;
               int var102;
               if ((var102 = this.Field2775 == null ? 0 : this.Field2775[var105]) < 0 && var102 != -1) {
                  var102 &= 255;
               }

               byte var106 = this.Field2774 != null && var102 < this.Field2774.length && var102 != -1 ? this.Field2774[var102] : 16;
               if (var1 != 10253 && var1 != 10247) {
                  if (var1 == 63614) {
                     if (this.Field2836[var105] == 49239) {
                        this.Field2835[var105] = 30;
                        this.Field2776[var105] = 854;
                     }
                  } else if (var1 == 44733) {
                     if (var105 == 1973) {
                        this.Field2835[var105] = 255;
                     }
                  } else if (var1 >= 65518) {
                     if (var1 == 56224 && this.Field2836[var105] >= 43086) {
                        this.Field2835[var105] = 80;
                     }

                     if (this.Field2776 == null) {
                        this.Field2776 = new int[this.Field2818];
                     }

                     this.Field2776[var105] = 91;
                     if (var1 != 65536 && var1 != 65710 && var1 != 65711 && var1 != 65709 && var1 != 65723 && var1 != 65596 && var1 != 65524 && var1 != 65703 && var1 != 65702) {
                        var106 = 25;
                        var12 = 0.95F;
                        var13 = 0.05F;
                        var112 = true;
                     }
                  }
               } else if ((var107 = this.Field2836[var105]) == 37798) {
                  this.Field2836[var105] = 64192;
                  if (this.Field2776 != null) {
                     this.Field2776[var105] = 91;
                  }

                  if (this.Field2830 != null) {
                     this.Field2830[var105] = 64192;
                     this.Field2831[var105] = 64192;
                     this.Field2832[var105] = 64192;
                  }

                  this.Field2835[var105] = 210;
               } else if (var107 != 64192 && var107 != 64178) {
                  this.Field2776[var105] = 1389;
               } else {
                  this.Field2835[var105] = 50;
               }

               if (this.Field2776 != null && this.Field2776[var105] == 1) {
                  this.Field2776[var105] = 669;
               }

               if ((var107 = this.Method14447(var105)) < -1) {
                  var107 = -var107;
               }

               if (this.Field2762.indexOf(var107) == -1) {
                  this.Field2762.add(var107);
               }

               if (var107 > 0 && TextureData.Field2911[var107]) {
                  this.Field2757 = true;
               }

               if (var107 > 0 && Texture.Field1931[var107]) {
                  this.Field2756 = true;
               }

               boolean var14 = false;
               if (var102 == 255 || var102 == -1) {
                  var102 = 0;
                  var106 = 16;
               }

               float var15 = 0.0F;
               float var16 = 1.0F;
               float var17 = 1.0F;
               float var18 = 1.0F;
               float var19 = 0.0F;
               float var20 = 0.0F;
               int var21;
               int var26;
               float var27;
               float var28;
               float var31;
               float var32;
               float var33;
               float var34;
               float var35;
               float var36;
               float var37;
               float var38;
               float var39;
               float var40;
               float var41;
               float var42;
               float var43;
               int var108;
               float var115;
               float var117;
               if (var102 != -1 && var102 != 255) {
                  if (var102 < 32765 && this.Field2778 == 0) {
                     float var22;
                     float var23;
                     float var24;
                     float var25;
                     float var29;
                     float var30;
                     if (var106 == 0 && this.Field2839 != null && var102 < this.Field2839.length) {
                        var108 = this.Field2839[var102];
                        var21 = this.Field2840[var102];
                        var26 = this.Field2841[var102];
                        if (var108 >= this.Field2885) {
                           var108 = var109;
                        }

                        if (var21 >= this.Field2885) {
                           var21 = var110;
                        }

                        if (var26 >= this.Field2885) {
                           var26 = var111;
                        }

                        var27 = this.Field2887[var108];
                        var22 = this.Method14530(var108);
                        var23 = this.Method14532(var108);
                        var24 = this.Field2887[var21] - var27;
                        var25 = this.Method14530(var21) - var22;
                        var28 = this.Method14532(var21) - var23;
                        var29 = this.Field2887[var26] - var27;
                        var6 = this.Method14530(var26) - var22;
                        var30 = this.Method14532(var26) - var23;
                        var31 = this.Field2887[var109] - var27;
                        var32 = this.Method14530(var109) - var22;
                        var33 = this.Method14532(var109) - var23;
                        var34 = this.Field2887[var110] - var27;
                        var35 = this.Method14530(var110) - var22;
                        var36 = this.Method14532(var110) - var23;
                        var37 = this.Field2887[var111] - var27;
                        var38 = this.Method14530(var111) - var22;
                        var39 = this.Method14532(var111) - var23;
                        var40 = var25 * var30 - var28 * var6;
                        var41 = var28 * var29 - var24 * var30;
                        var16 = var24 * var6 - var25 * var29;
                        var20 = var6 * var16 - var30 * var41;
                        var117 = var30 * var40 - var29 * var16;
                        var42 = var29 * var41 - var6 * var40;
                        var43 = 1.0F / (var20 * var24 + var117 * var25 + var42 * var28);
                        var15 = (var20 * var31 + var117 * var32 + var42 * var33) * var43;
                        var17 = (var20 * var34 + var117 * var35 + var42 * var36) * var43;
                        var19 = (var20 * var37 + var117 * var38 + var42 * var39) * var43;
                        var20 = var25 * var16 - var28 * var41;
                        var117 = var28 * var40 - var24 * var16;
                        var42 = var24 * var41 - var25 * var40;
                        var43 = 1.0F / (var20 * var29 + var117 * var6 + var42 * var30);
                        var16 = (var20 * var31 + var117 * var32 + var42 * var33) * var43;
                        var18 = (var20 * var34 + var117 * var35 + var42 * var36) * var43;
                        var20 = (var20 * var37 + var117 * var38 + var42 * var39) * var43;
                        if (!var112) {
                           if (var107 > 0 && Texture.Field1931[var107]) {
                              var115 = var15;
                              var29 = var17;
                              var6 = var19;
                              var15 = var16;
                              var17 = var18;
                              var19 = var20;
                              var16 = var115;
                              var18 = var29;
                              var20 = var6;
                              if (var15 < 0.0F || var17 < 0.0F || var19 < 0.0F) {
                                 ++var15;
                                 ++var17;
                                 ++var19;
                              }

                              if (var115 > 1.0F) {
                                 var16 = 1.0F;
                              }

                              if (var29 > 1.0F) {
                                 var18 = 1.0F;
                              }

                              if (var6 > 1.0F) {
                                 var20 = 1.0F;
                              }

                              if (var16 < 0.0F) {
                                 var16 = 0.0F;
                              }

                              if (var18 < 0.0F) {
                                 var18 = 0.0F;
                              }

                              if (var20 < 0.0F) {
                                 var20 = 0.0F;
                              }
                           } else {
                              if (var15 < 0.0F) {
                                 var15 = 0.0F;
                              }

                              if (var15 > 1.0F) {
                                 var15 = 1.0F;
                              }

                              if (var17 < 0.0F) {
                                 var17 = 0.0F;
                              }

                              if (var17 > 1.0F) {
                                 var17 = 1.0F;
                              }

                              if (var19 < 0.0F) {
                                 var19 = 0.0F;
                              }

                              if (var19 > 1.0F) {
                                 var19 = 1.0F;
                              }

                              if (var16 < 0.0F) {
                                 var16 = 0.0F;
                              }

                              if (var16 > 1.0F) {
                                 var16 = 1.0F;
                              }

                              if (var18 < 0.0F) {
                                 var18 = 0.0F;
                              }

                              if (var18 > 1.0F) {
                                 var18 = 1.0F;
                              }

                              if (var20 < 0.0F) {
                                 var20 = 0.0F;
                              }

                              if (var20 > 1.0F) {
                                 var20 = 1.0F;
                              }

                              var16 = 1.0F - var16;
                              var18 = 1.0F - var18;
                              var20 = 1.0F - var20;
                           }
                        }

                        var14 = true;
                     } else if (var106 == 25) {
                        var108 = this.Field2819[var102] + this.Field2819[var102] / 2;
                        var21 = this.Field2821[var102] - this.Field2821[var102] / 2;
                        var26 = this.Field2820[var102];
                        if (var108 >= this.Field2885) {
                           var108 = var109;
                        }

                        if (var21 >= this.Field2885) {
                           var21 = var110;
                        }

                        if (var26 >= this.Field2885) {
                           var26 = var111;
                        }

                        var27 = this.Field2887[var108];
                        var22 = this.Method14530(var108);
                        var23 = this.Method14532(var108);
                        var24 = this.Field2887[var21] - var27;
                        var25 = this.Method14530(var21) - var22;
                        var28 = this.Method14532(var21) - var23;
                        var29 = this.Field2887[var26] - var27;
                        var6 = this.Method14530(var26) - var22;
                        var30 = this.Method14532(var26) - var23;
                        var31 = this.Field2887[var109] - var27;
                        var32 = this.Method14530(var109) - var22;
                        var33 = this.Method14532(var109) - var23;
                        var34 = this.Field2887[var110] - var27;
                        var35 = this.Method14530(var110) - var22;
                        var36 = this.Method14532(var110) - var23;
                        var37 = this.Field2887[var111] - var27;
                        var38 = this.Method14530(var111) - var22;
                        var39 = this.Method14532(var111) - var23;
                        var40 = var25 * var30 - var28 * var6;
                        var41 = var28 * var29 - var24 * var30;
                        var16 = var24 * var6 - var25 * var29;
                        var20 = var6 * var16 - var30 * var41;
                        var117 = var30 * var40 - var29 * var16;
                        var42 = var29 * var41 - var6 * var40;
                        var43 = 1.0F / (var20 * var24 + var117 * var25 + var42 * var28);
                        var15 = (var20 * var31 + var117 * var32 + var42 * var33) * var43;
                        var17 = (var20 * var34 + var117 * var35 + var42 * var36) * var43;
                        var19 = (var20 * var37 + var117 * var38 + var42 * var39) * var43;
                        var20 = var25 * var16 - var28 * var41;
                        var117 = var28 * var40 - var24 * var16;
                        var42 = var24 * var41 - var25 * var40;
                        var43 = 1.0F / (var20 * var29 + var117 * var6 + var42 * var30);
                        var16 = (var20 * var31 + var117 * var32 + var42 * var33) * var43;
                        var18 = (var20 * var34 + var117 * var35 + var42 * var36) * var43;
                        var20 = (var20 * var37 + var117 * var38 + var42 * var39) * var43;
                        var15 = 1.0F - var15;
                        var17 = 1.0F - var17;
                        var19 = 1.0F - var19;
                        var14 = true;
                     } else if (var106 >= 4 && this.Field2839 != null) {
                        if (this.Field2833 != null && !Client.normalMem && var105 < this.Field2833.length) {
                           var102 = this.Field2833[var105] >> 2;
                        }

                        if (var102 < 0) {
                           var102 &= 255;
                        }

                        if (var102 < this.Field2839.length) {
                           var108 = this.Field2839[var102];
                           var21 = this.Field2840[var102];
                           var26 = this.Field2841[var102];
                           if (var108 >= this.Field2885) {
                              var108 = var109;
                           }

                           if (var21 >= this.Field2885) {
                              var21 = var110;
                           }

                           if (var26 >= this.Field2885) {
                              var26 = var111;
                           }

                           var27 = this.Field2887[var108];
                           var22 = this.Method14530(var108);
                           var23 = this.Method14532(var108);
                           var24 = this.Field2887[var21] - var27;
                           var25 = this.Method14530(var21) - var22;
                           var28 = this.Method14532(var21) - var23;
                           var29 = this.Field2887[var26] - var27;
                           var6 = this.Method14530(var26) - var22;
                           var30 = this.Method14532(var26) - var23;
                           var31 = this.Field2887[var109] - var27;
                           var32 = this.Method14530(var109) - var22;
                           var33 = this.Method14532(var109) - var23;
                           var34 = this.Field2887[var110] - var27;
                           var35 = this.Method14530(var110) - var22;
                           var36 = this.Method14532(var110) - var23;
                           var37 = this.Field2887[var111] - var27;
                           var38 = this.Method14530(var111) - var22;
                           var39 = this.Method14532(var111) - var23;
                           var40 = var25 * var30 - var28 * var6;
                           var41 = var28 * var29 - var24 * var30;
                           var16 = var24 * var6 - var25 * var29;
                           var20 = var6 * var16 - var30 * var41;
                           var117 = var30 * var40 - var29 * var16;
                           var42 = var29 * var41 - var6 * var40;
                           var43 = 1.0F / (var20 * var24 + var117 * var25 + var42 * var28);
                           var15 = (var20 * var31 + var117 * var32 + var42 * var33) * var43;
                           var17 = (var20 * var34 + var117 * var35 + var42 * var36) * var43;
                           var19 = (var20 * var37 + var117 * var38 + var42 * var39) * var43;
                           var20 = var25 * var16 - var28 * var41;
                           var117 = var28 * var40 - var24 * var16;
                           var42 = var24 * var41 - var25 * var40;
                           var43 = 1.0F / (var20 * var29 + var117 * var6 + var42 * var30);
                           var16 = (var20 * var31 + var117 * var32 + var42 * var33) * var43;
                           var18 = (var20 * var34 + var117 * var35 + var42 * var36) * var43;
                           var20 = (var20 * var37 + var117 * var38 + var42 * var39) * var43;
                           if (!Client.normalMem) {
                              if (var15 < 0.0F) {
                                 var15 = 0.0F;
                              }

                              if (var15 > 1.0F) {
                                 var15 = 1.0F;
                              }

                              if (var17 < 0.0F) {
                                 var17 = 0.0F;
                              }

                              if (var17 > 1.0F) {
                                 var17 = 1.0F;
                              }

                              if (var19 < 0.0F) {
                                 var19 = 0.0F;
                              }

                              if (var19 > 1.0F) {
                                 var19 = 1.0F;
                              }

                              if (var16 < 0.0F) {
                                 var16 = 0.0F;
                              }

                              if (var16 > 1.0F) {
                                 var16 = 1.0F;
                              }

                              if (var18 < 0.0F) {
                                 var18 = 0.0F;
                              }

                              if (var18 > 1.0F) {
                                 var18 = 1.0F;
                              }

                              if (var20 < 0.0F) {
                                 var20 = 0.0F;
                              }

                              if (var20 > 1.0F) {
                                 var20 = 1.0F;
                              }

                              var14 = true;
                              var112 = false;
                           }
                        }
                     }
                  } else {
                     var108 = this.Field2780[var105] & 255;
                     var21 = this.Field2781[var105] & 255;
                     var26 = this.Field2782[var105] & 255;
                     var108 += this.Field2779[var109];
                     var21 += this.Field2779[var110];
                     var26 += this.Field2779[var111];
                     var15 = this.Field2783[var108];
                     var16 = this.Field2784[var108];
                     var17 = this.Field2783[var21];
                     var18 = this.Field2784[var21];
                     var19 = this.Field2783[var26];
                     var20 = this.Field2784[var26];
                     var14 = true;
                  }
               } else {
                  var15 = 0.0F;
                  var16 = 1.0F;
                  var17 = 1.0F;
                  var18 = 1.0F;
                  var19 = 0.0F;
                  var20 = 0.0F;
                  var14 = true;
               }

               if (!var14) {
                  if (this.Field2774 != null && this.Field2774.length != this.Field2838) {
                     this.Field2838 = this.Field2774.length;
                  }

                  if (this.Field2775 != null && this.Field2838 > 0) {
                     int var126;
                     if (var103 == null) {
                        var108 = 8192;
                        if (Class120.Field9548 != null) {
                           Class120 var122;
                           if ((var122 = var107 >= 0 && var107 < Class120.Field9548.length ? Class120.Field9548[var107] : null) != null) {
                              int var10000 = var122.Field9547;
                           }

                           if (var107 >= 0 && Class120.Field9549[var107]) {
                              var108 = Math.round(3200.0F);
                           }
                        }

                        var108 <<= 2;
                        var103 = new int[var21 = this.Field2818 > 1 ? 1 : this.Field2818];

                        for(var26 = 0; var26 < var21; var103[var26] = var26++) {
                           ;
                        }

                        var4 = var108;
                        int[] var129 = var103;
                        var126 = var21;
                        Model var116 = this;
                        int[] var131 = null;
                        int[] var132 = null;
                        int[] var133 = null;
                        float[][] var113 = null;
                        if (this.Field2775 != null) {
                           var21 = this.Field2838;
                           int[] var64 = new int[this.Field2838];
                           int[] var65 = new int[var21];
                           int[] var66 = new int[var21];
                           int[] var67 = new int[var21];
                           int[] var68 = new int[var21];
                           int[] var69 = new int[var21];

                           int var70;
                           for(var70 = 0; var21 > var70; ++var70) {
                              var64[var70] = Integer.MAX_VALUE;
                              var65[var70] = -2147483647;
                              var66[var70] = Integer.MAX_VALUE;
                              var67[var70] = -2147483647;
                              var68[var70] = Integer.MAX_VALUE;
                              var69[var70] = -2147483647;
                           }

                           var132 = new int[var21];
                           var133 = new int[var21];
                           var113 = new float[var21][];
                           var70 = 0;

                           label664:
                           while(true) {
                              if (var70 >= var126) {
                                 var131 = new int[var21];
                                 var70 = 0;

                                 while(true) {
                                    if (var70 >= var21) {
                                       break label664;
                                    }

                                    if ((var116.Field2774 == null ? 0 : var116.Field2774[var70] & 255) > 0) {
                                       var131[var70] = (var64[var70] + var65[var70]) / 2;
                                       var132[var70] = (var66[var70] + var67[var70]) / 2;
                                       var133[var70] = (var69[var70] + var68[var70]) / 2;
                                       float var136 = (float)var4;
                                       float var138 = (float)var4;
                                       float var139 = (float)var4;
                                       float var137 = 64.0F / var136;
                                       float var135 = 64.0F / var138;
                                       float var134 = 64.0F / var139;
                                       int var10003 = var116.Field2839[var70];
                                       int var10004 = var116.Field2840[var70];
                                       int var10005 = var116.Field2822 == null ? 1 : var116.Field2822[var70] & 255;
                                       int var82 = var116.Field2841[var70];
                                       int var81 = var10005;
                                       int var80 = var10004;
                                       int var79 = var10003;
                                       float[] var85 = new float[9];
                                       float[] var86 = new float[9];
                                       float var87 = (float)Math.cos((double)((float)var81 * 0.024543693F));
                                       float var88 = (float)Math.sin((double)((float)var81 * 0.024543693F));
                                       var85[0] = var87;
                                       var85[1] = 0.0F;
                                       var85[2] = var88;
                                       var85[3] = 0.0F;
                                       var85[4] = 1.0F;
                                       var85[5] = 0.0F;
                                       var85[6] = -var88;
                                       var85[7] = 0.0F;
                                       var85[8] = var87;
                                       float[] var90 = new float[9];
                                       float var91 = 1.0F;
                                       float var92 = 0.0F;
                                       var87 = (float)var80 / 32767.0F;
                                       float var89 = 1.0F - var87;
                                       double var93;
                                       double var95 = (var93 = (double)(-(var87 * var87))) + 1.0D;
                                       double var97 = (double)(var79 * var79 + var82 * var82);
                                       if (var95 < 0.0D) {
                                          var95 = 0.0D;
                                       }

                                       if (var97 < 0.0D) {
                                          var97 = 0.0D;
                                       }

                                       var88 = -((float)Math.sqrt(var95));
                                       float var99;
                                       if ((var99 = (float)Math.sqrt(var97)) == 0.0F && var87 == 0.0F) {
                                          var86 = var85;
                                       } else {
                                          if (var99 != 0.0F) {
                                             var92 = (float)var79 / var99;
                                             var91 = (float)(-var82) / var99;
                                          }

                                          var90[5] = var88 * var91;
                                          var90[6] = var89 * var92 * var91;
                                          var90[3] = -var92 * var88;
                                          var90[4] = var87;
                                          var90[0] = var87 + var91 * var91 * var89;
                                          var90[7] = -var91 * var88;
                                          var90[1] = var92 * var88;
                                          var90[8] = var89 * var92 * var92 + var87;
                                          var90[2] = var89 * var91 * var92;
                                          var86[0] = var90[6] * var85[2] + var90[3] * var85[1] + var90[0] * var85[0];
                                          var86[1] = var90[1] * var85[0] + var85[1] * var90[4] + var85[2] * var90[7];
                                          var86[3] = var90[6] * var85[5] + var90[3] * var85[4] + var85[3] * var90[0];
                                          var86[2] = var90[8] * var85[2] + var90[5] * var85[1] + var85[0] * var90[2];
                                          var86[4] = var85[5] * var90[7] + var85[3] * var90[1] + var90[4] * var85[4];
                                          var86[5] = var90[8] * var85[5] + var90[2] * var85[3] + var90[5] * var85[4];
                                          var86[6] = var85[6] * var90[0] + var85[7] * var90[3] + var90[6] * var85[8];
                                          var86[7] = var85[6] * var90[1] + var90[4] * var85[7] + var90[7] * var85[8];
                                          var86[8] = var85[7] * var90[5] + var90[2] * var85[6] + var85[8] * var90[8];
                                       }

                                       var86[0] *= var137;
                                       var86[1] *= var137;
                                       var86[2] *= var137;
                                       var86[3] *= var135;
                                       var86[4] *= var135;
                                       var86[5] *= var135;
                                       var86[6] *= var134;
                                       var86[7] *= var134;
                                       var86[8] *= var134;
                                       var113[var70] = var86;
                                    }

                                    ++var70;
                                 }
                              }

                              int var71 = var129[var70];
                              if (var116.Field2775[var71] != -1) {
                                 int var72;
                                 if ((var72 = var116.Field2775[var71]) < 0 && var72 != -1) {
                                    var72 &= 255;
                                 }

                                 if (var72 >= 0 && var72 < var21) {
                                    for(int var73 = 0; var73 < 3; ++var73) {
                                       int var74;
                                       if (var73 != 0) {
                                          if (var73 == 1) {
                                             var74 = var116.Field2820[var71];
                                          } else {
                                             var74 = var116.Field2821[var71];
                                          }
                                       } else {
                                          var74 = var116.Field2819[var71];
                                       }

                                       int var75 = (int)var116.Field2887[var74];
                                       int var76 = (int)var116.Method14530(var74);
                                       int var77 = (int)var116.Method14532(var74);
                                       if (var75 < var64[var72]) {
                                          var64[var72] = var75;
                                       }

                                       if (var65[var72] < var75) {
                                          var65[var72] = var75;
                                       }

                                       if (var76 < var66[var72]) {
                                          var66[var72] = var76;
                                       }

                                       if (var76 > var67[var72]) {
                                          var67[var72] = var76;
                                       }

                                       if (var77 < var68[var72]) {
                                          var68[var72] = var77;
                                       }

                                       if (var69[var72] < var77) {
                                          var69[var72] = var77;
                                       }
                                    }
                                 }
                              }

                              ++var70;
                           }
                        }

                        var104 = new Class403(var131, var132, var133, var113);
                     }

                     float[] var114 = new float[2];
                     float[] var123 = new float[3];
                     float[] var125 = new float[3];
                     if (var102 >= var104.Field9922.length) {
                        var102 = 0;
                     }

                     if (var102 <= 0) {
                        var102 &= 255;
                     }

                     int var124 = var104.Field9922[var102];
                     int var118 = var104.Field9923[var102];
                     int var119 = var104.Field9920[var102];
                     float[] var120 = var104.Field9921[var102];
                     int var121 = this.Field2824 == null ? 1 : this.Field2824[var102];
                     var28 = this.Field2823 == null ? 1.0F : (float)this.Field2823[var102] / 256.0F;
                     boolean var128 = false;
                     if (var120 != null) {
                        var31 = 0.0F;
                        var32 = 0.0F;
                        if (this.Field2828 != null) {
                           var31 = (float)this.Field2828[var102] / 256.0F;
                           var32 = (float)this.Field2829[var102] / 256.0F;
                        }

                        var33 = this.Field2887[var110] - this.Field2887[var109];
                        var34 = this.Method14530(var110) - this.Method14530(var109);
                        var35 = this.Method14532(var110) - this.Method14532(var109);
                        var36 = this.Field2887[var111] - this.Field2887[var109];
                        var37 = this.Method14530(var111) - this.Method14530(var109);
                        var38 = this.Method14532(var111) - this.Method14532(var109);
                        var39 = var34 * var38 - var37 * var35;
                        var40 = var35 * var36 - var38 * var33;
                        var41 = var33 * var37 - var36 * var34;
                        var42 = (var39 * var120[0] + var40 * var120[1] + var41 * var120[2]) / -0.15625F;
                        var43 = (var39 * var120[3] + var40 * var120[4] + var41 * var120[5]) / -0.15625F;
                        var115 = (var39 * var120[6] + var40 * var120[7] + var41 * var120[8]) / -0.15625F;
                        var33 = var42 < 0.0F ? -var42 : var42;
                        var34 = var43 < 0.0F ? -var43 : var43;
                        var35 = var115 >= 0.0F ? var115 : -var115;
                        var114 = Class128.Method1332(var126 = var33 < var34 && var34 > var35 ? (var43 > 0.0F ? 0 : 1) : (var35 > var33 && var34 < var35 ? (var115 > 0.0F ? 2 : 3) : (var42 <= 0.0F ? 5 : 4)), var114, var121, var118, var119, this.Field2887[var109], var124, 0, var120, var32, this.Method14532(var109), this.Method14530(var109), var28, var31);
                        var123[0] = var114[0];
                        var125[0] = var114[1];
                        var114 = Class128.Method1332(var126, var114, var121, var118, var119, this.Field2887[var110], var124, 0, var120, var32, this.Method14532(var110), this.Method14530(var110), var28, var31);
                        var123[1] = var114[0];
                        var125[1] = var114[1];
                        var114 = Class128.Method1332(var126, var114, var121, var118, var119, this.Field2887[var111], var124, 0, var120, var32, this.Method14532(var111), this.Method14530(var111), var28, var31);
                        var123[2] = var114[0];
                        var125[2] = var114[1];
                        var128 = true;
                     }

                     if (var128) {
                        var15 = var123[0];
                        var17 = var123[1];
                        var19 = var123[2];
                        var16 = var125[0];
                        var18 = var125[1];
                        var20 = var125[2];
                        var112 = true;
                     }
                  }
               }

               float var130;
               if (var112) {
                  if (0.0F < var13 || 0.0F < var13) {
                     var6 = Client.Method13259(var15, var17, var19);
                     var117 = Client.Method13259(var16, var18, var20);
                     double var127 = Math.ceil((double)(-var6));
                     if (var6 < var13) {
                        var15 = (float)((double)var15 + var127);
                        var17 = (float)((double)var17 + var127);
                        var19 = (float)((double)var19 + var127);
                     }

                     var127 = Math.ceil((double)(-var117));
                     if (var117 < var13) {
                        var16 = (float)((double)var16 + var127);
                        var18 = (float)((double)var18 + var127);
                        var20 = (float)((double)var20 + var127);
                     }
                  }

                  var130 = Client.Method13260(var15, var17, var19);
                  var27 = Client.Method13260(var16, var18, var20);
                  if (var130 > var12) {
                     var15 /= var130;
                     var17 /= var130;
                     var19 /= var130;
                  }

                  if (var27 > var12) {
                     var16 /= var27;
                     var18 /= var27;
                     var20 /= var27;
                  }

                  var15 = Class128.Method1331(var15);
                  var17 = Class128.Method1331(var17);
                  var19 = Class128.Method1331(var19);
                  var16 = Class128.Method1331(var16);
                  var18 = Class128.Method1331(var18);
                  var20 = Class128.Method1331(var20);
               }

               if (var107 > 0 && Texture.Field1930[var107]) {
                  var6 = var15;
                  var117 = var17;
                  var130 = var19;
                  var15 = var16;
                  var17 = var18;
                  var19 = var20;
                  var16 = 1.0F - var6;
                  var18 = 1.0F - var117;
                  var20 = 1.0F - var130;
               }

               this.Field2759[var105][0] = var15;
               this.Field2759[var105][1] = var16;
               this.Field2759[var105][2] = var17;
               this.Field2759[var105][3] = var18;
               this.Field2759[var105][4] = var19;
               this.Field2759[var105][5] = var20;
            }

         }
      }
   }

   public static void Method14450() {
      Field2857 = null;
      Field2861 = null;
      Field2862 = null;
      Field2864 = null;
      Field2865 = null;
      Field2866 = null;
      Field2867 = null;
      Field2868 = null;
      Field2869 = null;
      Field2870 = null;
      Field2871 = null;
      Field2872 = null;
      Field2873 = null;
      Field2874 = null;
      Field2875 = null;
      Field2876 = null;
   }

   public final void Method14451(float var1, float var2, float var3, float var4) {
      if (!this.Field2765) {
         this.Field2765 = true;
         float var5 = (var1 + var2 + var4 + var3) / 4.0F;

         for(int var6 = 0; var6 < this.Field2817; ++var6) {
            float var7 = this.Field2887[var6];
            float var8 = this.Method14532(var6);
            float var9 = var1 + (var2 - var1) * (var7 + 64.0F) / 128.0F;
            var7 = var3 + (var4 - var3) * (var7 + 64.0F) / 128.0F;
            var7 = var9 + (var7 - var9) * (var8 + 64.0F) / 128.0F;
            this.Method14531(var6, this.Method14530(var6) + (var7 - var5) - 3.0F);
         }

         this.Method14481();
      }
   }

   public final void Method14452(float var1, float var2, float var3, float var4, int var5, int var6, int var7) {
      this.Method14453(var1, var2, var3, var4, var5, var6, var7);
   }

   public final void Method14453(float var1, float var2, float var3, float var4, int var5, int var6, int var7) {
      this.Field10118 = var5;//TODO
      this.Field10119 = var6;
      this.Field10120 = var7;
      if (GraphicsDisplay.Field2678 && GraphicsDisplay.Field2667) {
         this.Field2766 = true;
         this.Field10121 = var1;
         this.Field10122 = var2;
         this.Field10123 = var3;
         this.Field10124 = var4;
      } else {
         float var10 = (var1 + var2 + var4 + var3) / 4.0F;

         for(var6 = 0; var6 < this.Field2817; ++var6) {
            float var11 = this.Field2887[var6] * 0.25F;
            float var8 = this.Method14532(var6) * 0.25F;
            float var9 = var1 + (var2 - var1) * (var11 + 64.0F) / 128.0F;
            var11 = var3 + (var4 - var3) * (var11 + 64.0F) / 128.0F;
            var11 = var9 + (var11 - var9) * (var8 + 64.0F) / 128.0F;
            this.Method14531(var6, this.Method14530(var6) + (var11 - var10) * 4.0F);
         }

         this.Method14481();
      }
   }

   public final float Method14454(int var1, boolean var2) {
      float var3 = Client.Field12428.Field924.Method8952(this.Field10120, this.Field10118, this.Field10119); //Field10118 could be wrong
      float var4 = Client.Field12428.Field924.Method8952(this.Field10120, this.Field10118 + 1, this.Field10119); //Field10118 could be wrong
      float var5 = Client.Field12428.Field924.Method8952(this.Field10120, this.Field10118, this.Field10119 + 1);
      float var6 = Client.Field12428.Field924.Method8952(this.Field10120, this.Field10118 + 1, this.Field10119 + 1);
      float var7 = (this.Field10121 + this.Field10122 + this.Field10124 + this.Field10123) / 4.0F;
      if (this.Field2767) {
         if (this.Field2769 == 0.0F) {
            float var10001;
            if (this.Field2768 >= 58036 && this.Field2768 <= 58075) {
               var10001 = -5.0F;
            } else {
               switch(this.Field2768) {
               case 1711:
               case 36266:
                  var10001 = -80.0F;
                  break;
               case 4411:
                  var10001 = 0.0F;
                  break;
               case 4505:
               case 4527:
               case 30003:
               case 34093:
               case 34266:
               case 34267:
               case 37141:
               case 37142:
               case 41513:
                  var10001 = 20.0F;
                  break;
               case 5558:
               case 30002:
               case 30009:
               case 30762:
               case 31749:
               case 32921:
               case 34070:
               case 34073:
               case 35112:
               case 37097:
               case 37139:
               case 37140:
               case 37705:
               case 40014:
               case 40015:
               case 56842:
                  var10001 = 100.0F;
                  break;
               case 30252:
                  var10001 = 80.0F;
                  break;
               case 31214:
               case 31215:
               case 31216:
               case 31218:
               case 31220:
                  var10001 = 0.0F;
                  break;
               case 35773:
               case 35776:
                  var10001 = 500.0F;
                  break;
               default:
                  var10001 = -20.0F;
               }
            }

            this.Field2769 = var10001;
         }

         if (this.Method14530(var1) * (!var2 ? 0.25F : 1.0F) < this.Field2769) {
            var6 = 0.0F;
            var5 = 0.0F;
            var4 = 0.0F;
            var3 = 0.0F;
         }
      }

      float var8 = this.Field2887[var1] * 0.25F;
      float var9 = this.Method14532(var1) * 0.25F;
      var3 = this.Field10121 + var3 + (this.Field10122 + var4 - (this.Field10121 + var3)) * (var8 + 64.0F) / 128.0F;
      var4 = this.Field10123 + var5 + (this.Field10124 + var6 - (this.Field10123 + var5)) * (var8 + 64.0F) / 128.0F;
      var3 += (var4 - var3) * (var9 + 64.0F) / 128.0F;
      return this.Method14530(var1) * (var2 ? 1.0F : 0.25F) + (var3 - var7) * (var2 ? 4.0F : 1.0F);
   }

   public static int Method14455() {
      return Field2857 == null ? 0 : Field2857.size();
   }

   private static void Method14456(Class696 var0, int var1, int var2) {
      Map var3 = Field2857;
      synchronized(Field2857) {
         Class696 var4;
         if ((var4 = (Class696)Field2857.get(var1)) != null) {
            System.out.println("unlinked[" + var2 + "]: " + var1);
            var4.Method11976();
         }

         var0.Field10511 = var1;
         Field2857.put(var1, var0);
      }
   }

   public static void Method14457() {
      Method14458();
   }

   public static void Method14458() {
      if (Field2857 != null && !Client.Method13313()) {
         if (System.currentTimeMillis() - Field2770 > 2500L) {
            long var0;
            Field2770 = var0 = System.currentTimeMillis();
            if (GraphicsDisplay.Field2678 && GraphicsDisplay.Field2667) {
               if (Field2857.size() >= 200) {
                  LinkedList var11 = new LinkedList();
                  Map var3 = Field2857;
                  synchronized(Field2857) {
                     var11.addAll(Field2857.values());
                  }

                  Collections.sort(var11, new Class864(var0));
                  var3 = Field2857;
                  synchronized(Field2857) {
                     Iterator var10 = var11.iterator();

                     while(var10.hasNext()) {
                        Class696 var8;
                        (var8 = (Class696)var10.next()).Method11976();
                        Field2857.remove(var8.Field10511);
                        if (Field2857.size() > 150) {
                           continue;
                        }
                     }
                  }

                  var11.clear();
               }
            } else {
               Field2770 = var0;
               Map var7 = Field2857;
               synchronized(Field2857) {
                  Iterator var2 = Field2857.entrySet().iterator();

                  while(var2.hasNext()) {
                     Entry var1;
                     (var1 = (Entry)var2.next()).getValue();
                     var1.getValue();
                  }

                  var2 = Field2771.iterator();

                  while(var2.hasNext()) {
                     Integer var9 = (Integer)var2.next();
                     Field2857.remove(var9);
                  }

                  Field2771.clear();
               }
            }
         }
      }
   }

   private void Method14459() {
      this.Field2837 = 0;
      this.Field2834 = null;
      this.Field2745 = false;
   }

   public final void Method14460(int[][] var1) {
      if (var1 != null) {
         this.Field2884 = new HashMap();

         for(int var2 = 0; var2 < var1.length; ++var2) {
            int[] var3;
            int var4;
            if ((var3 = var1[var2])[0] == -1) {
               for(var4 = 0; var4 < this.Field2819.length; ++var4) {
                  this.Field2884.put(this.Field2819[var4], var3[1] + 1);
               }
            } else if (var3[0] == -2) {
               for(var4 = 0; var4 < this.Field2820.length; ++var4) {
                  this.Field2884.put(this.Field2820[var4], var3[1] + 1);
               }
            } else if (var3[0] == -3) {
               for(var4 = 0; var4 < this.Field2821.length; ++var4) {
                  this.Field2884.put(this.Field2821[var4], var3[1] + 1);
               }
            } else if (var3[0] == -4) {
               for(var4 = 0; var4 < this.Field2819.length; ++var4) {
                  this.Field2884.put(this.Field2819[var4], var3[1] + 1);
                  this.Field2884.put(this.Field2820[var4], var3[1] + 1);
                  this.Field2884.put(this.Field2821[var4], var3[1] + 1);
               }
            } else {
               this.Field2884.put(var3[0], var3[1] + 1);
            }
         }
      }

   }

   private Model(int var1, boolean var2, Class696 var3) {
      this.Field2745 = GraphicsDisplay.Field2678;
      this.Field2750 = true;
      this.Field2751 = 0;
      this.Field2753 = false;
      this.Field2754 = 0;
      this.Field2755 = 100;
      this.Field2756 = false;
      this.Field2757 = false;
      this.Field2758 = false;
      this.Field2759 = null;
      this.Field2760 = 0;
      this.Field2762 = new LinkedList();
      this.Field2765 = false;
      this.Field2766 = false;
      this.Field2767 = false;
      this.Field2768 = 0;
      this.Field2769 = 0.0F;
      this.Field2773 = false;
      this.Field2774 = null;
      this.Field2775 = null;
      this.Field2776 = null;
      this.Field2777 = 0;
      this.Field2778 = 0;
      this.Field2786 = null;
      this.Field2789 = 1.0F;
      this.Field2790 = 1.0F;
      this.Field2791 = 1.0F;
      this.Field2792 = 0;
      this.Field2793 = 0;
      this.Field2794 = 0;
      this.Field2812 = -1;
      this.Field2813 = false;
      this.Field2884 = null;
      this.Field2885 = 0;
      this.Field2886 = null;
      this.Field2887 = null;
      this.Field2888 = 0;
      if (!this.Field2773) {
         var2 = var1 <= 65517 && Client.normalMem;
         if (Client.Field12157.size() >= 0 && Client.Field12157.containsKey(var1)) {
            var2 = false;
         }

         byte[] var4 = var3.Field10512;
         if (var3.Field10512 != null) {
            if (!Client.normalMem && var4[var4.length - 1] == -1 && var4[var4.length - 2] == -1) {
               var2 = true;
            }

            boolean var5 = false;
            this.Field2773 = true;
            if (var4[0] == 77 && var4[1] == 101 && var4[2] == 116) {
               try {
                  BufferedReader var7 = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(var4)));
                  var5 = this.Method14464(var7, true);
               } catch (Exception var10) {
                  this.Field2817 = 0;
                  this.Field2818 = 0;
                  Client.Field12059.add("Error loading " + var1 + ": " + var10.getMessage());
                  var10.printStackTrace();
               }
            } else if (var4[0] == 69 && var4[1] == 77 && var4[2] == 80 && var4[3] == 83) {
               try {
                  var5 = this.Method14465(var4);
               } catch (Exception var9) {
                  var9.printStackTrace();
               }
            }

            if (!var5) {
               if (var2) {
                  try {
                     this.Method14466(var4, var1, var3);
                  } catch (Exception var11) {
                     this.Method14467(var1, var3);
                     if (Field2772 != null) {
                        Field2772[var1] = true;
                     }

                     var11.printStackTrace();
                  }
               } else {
                  try {
                     this.Method14467(var1, var3);
                     if (Field2772 != null) {
                        Field2772[var1] = true;
                     }
                  } catch (Exception var8) {
                     this.Method14466(var4, var1, var3);
                  }
               }
            }

            if (!this.Field2813) {
               this.Method14462(4.0F);
               this.Field2813 = true;
            }

            this.Method14460(Class451.Method7828(this.Field2777));
            if (Field2772 != null && Field2772[var1]) {
               this.Method14459();
            }

            if (var1 == 36844) {
               this.Method14463(9);
            } else if (var1 == 36132) {
               this.Method14492(1.5F, 1.5F, 1.5F);
            } else if (var1 != 65555 && var1 != 65556) {
               if (var1 >= 65592 && var1 <= 65595) {
                  this.Method14492(1.0F, 1.0F, 1.1F);
                  if (var1 == 65592 || var1 == 65594) {
                     this.Method14493(-4, 11, -10);
                  }
               } else if (var1 == 65598) {
                  this.Method14493(0, -22, -20);
               } else if (var1 != 65558 && var1 != 65560) {
                  if (var1 >= 65676 && var1 <= 65679) {
                     this.Method14461(2);
                  } else if (var1 == 65701) {
                     this.Method14462(0.6F);
                  } else if (var1 == 44569) {
                     this.Method14462(2.5F);
                  } else if (var1 == 65687) {
                     this.Method14461(2);
                  } else if (var1 == 65715) {
                     this.Method14492(1.0F, 1.0F, 1.35F);
                     this.Method14491(2021);
                     this.Method14493(0, -2, -6);
                  } else if (var1 == 20147) {
                     this.Method14493(0, 0, -3);
                  } else if (var1 != 65741 && var1 != 65743) {
                     if (var1 != 65747 && var1 != 65745) {
                        if (var1 == 65752) {
                           this.Method14462(1.65F);
                        }
                     } else {
                        this.Method14491(32);
                        if (var1 == 65747) {
                           this.Method14493(0, 15, 25);
                        } else {
                           this.Method14493(0, 5, 30);
                        }
                     }
                  } else {
                     this.Method14492(1.0F, 1.2F, 1.2F);
                     this.Method14491(32);
                     this.Method14493(0, 16, 10);
                  }
               } else {
                  this.Method14493(-1, -1, -2);
               }
            } else {
               this.Method14492(3.0F, 3.0F, 3.0F);
               this.Method14493(20, 0, 0);
            }

            if (var1 >= 65518) {
               this.Method14459();
            }

            this.Method14449(var1, var3);
         }
      }
   }

   private void Method14461(int var1) {
      for(var1 = 0; var1 < this.Field2817; ++var1) {
         float var4 = this.Field2887[var1] * 2.0F;
         this.Field2887[var1] = var4;
         this.Method14531(var1, this.Method14530(var1) * 2.0F);
         this.Method14533(var1, this.Method14532(var1) * 2.0F);
      }

   }

   private void Method14462(float var1) {
      int var2;
      for(var2 = 0; var2 < this.Field2817; ++var2) {
         float var5 = (float)((int)(this.Field2887[var2] * var1));
         this.Field2887[var2] = var5;
         this.Method14531(var2, (float)((int)(this.Method14530(var2) * var1)));
         this.Method14533(var2, (float)((int)(this.Method14532(var2) * var1)));
      }

      if (this.Field2827 != null) {
         for(var2 = 0; var2 < this.Field2827.length; ++var2) {
            this.Field2827[var2] = Math.round((float)this.Field2827[var2] * var1);
            this.Field2826[var2] = Math.round((float)this.Field2826[var2] * var1);
            this.Field2825[var2] = Math.round((float)this.Field2825[var2] * var1);
         }
      }

   }

   private void Method14463(int var1) {
      for(var1 = 0; var1 < this.Field2817; ++var1) {
         float var4 = this.Field2887[var1] * 9.0F;
         this.Field2887[var1] = var4;
         this.Method14533(var1, this.Method14532(var1) * 9.0F);
      }

   }

   private boolean Method14464(BufferedReader var1, boolean var2) {
      label337: {
         try {
            Class871 var31 = Class871.Field2611;
            Class872 var3 = Class872.Field2620;
            this.Field2817 = 0;
            this.Field2818 = 0;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            boolean var8 = false;
            new LinkedList();
            ArrayList var9 = new ArrayList();
            ArrayList var10 = new ArrayList();

            while(true) {
               String var4;
               if ((var4 = var1.readLine()) == null) {
                  break label337;
               }

               var4 = var4.toLowerCase().replaceAll("\t", "").replaceAll("\t", "").trim();
               boolean var11 = false;
               if (var4.startsWith("material")) {
                  var3 = Class872.Field2625;
               } else {
                  if (var4.startsWith("vertex ")) {
                     var31 = Class871.Field2612;
                     var11 = true;
                  } else if (var4.startsWith("face ")) {
                     var31 = Class871.Field2613;
                     var11 = true;
                  } else if (var4.startsWith("weit ")) {
                     var3 = Class872.Field2624;
                     var31 = Class871.Field2614;
                     var11 = true;
                  } else {
                     if (var4.startsWith("object \"model\" ") || var4.startsWith("object \"obj")) {
                        var3 = Class872.Field2621;
                        continue;
                     }

                     if (var4.startsWith("object \"tskin:\" ")) {
                        var3 = Class872.Field2623;
                        continue;
                     }

                     if (var4.startsWith("object \"vskin")) {
                        var3 = Class872.Field2624;
                        continue;
                     }

                     if (var4.startsWith("object \"pri:\" ")) {
                        var3 = Class872.Field2622;
                        continue;
                     }

                     if (var4.startsWith("object") && var4.contains(":")) {
                        var3 = Class872.Field2620;
                        continue;
                     }

                     if (var4.contains("}")) {
                        if (var31 != Class871.Field2611) {
                           var31 = Class871.Field2611;
                        } else if (var3 != Class872.Field2620) {
                           var3 = Class872.Field2620;
                        }
                        continue;
                     }
                  }

                  float var12;
                  String[] var32;
                  int var34;
                  int var35;
                  switch(Method14535()[var3.ordinal()]) {
                  case 1:
                  case 3:
                  default:
                     continue;
                  case 2:
                     switch(Method14534()[var31.ordinal()]) {
                     case 2:
                        if (var11) {
                           this.Field2817 = Integer.parseInt(var4.split(" ")[1]);
                           this.Method14527(this.Field2817);
                        } else {
                           var32 = var4.replaceAll("\t", "").replaceAll("[uvm()]", "").trim().split(" ");
                           float var39 = Float.parseFloat(var32[0]);
                           this.Field2887[var5] = var39;
                           this.Method14531(var5, -Float.parseFloat(var32[1]));
                           this.Method14533(var5, -Float.parseFloat(var32[2]));
                           ++var5;
                        }
                        continue;
                     case 3:
                        if (var11) {
                           this.Field2818 = Integer.parseInt(var4.split(" ")[1]);
                           this.Field2819 = new int[this.Field2818];
                           this.Field2820 = new int[this.Field2818];
                           this.Field2821 = new int[this.Field2818];
                           this.Field2833 = null;
                           this.Field2834 = new int[this.Field2818];
                           this.Field2835 = new int[this.Field2818];
                           this.Field2836 = new int[this.Field2818];
                           this.Field2835 = new int[this.Field2818];
                           if (var8) {
                              this.Field2776 = new int[this.Field2818];
                           }
                        } else {
                           var34 = Integer.parseInt((var32 = var4.replaceAll("\t", "").replaceAll("[uvm()]", "").split(" "))[0]);
                           this.Field2819[var6] = Integer.parseInt(var32[3]);
                           this.Field2820[var6] = Integer.parseInt(var32[2]);
                           this.Field2821[var6] = Integer.parseInt(var32[1]);
                           var35 = Integer.parseInt(var32[var34 + 1]);
                           Long var37 = (Long)var9.get(var35);
                           String var38 = (String)var10.get(var35);
                           if (var8) {
                              if (var38.contains("_")) {
                                 var35 = Integer.parseInt(var38.split("_")[1]);
                              } else {
                                 var35 = -1;
                              }

                              if (var35 == 1182) {
                                 var35 = 593;
                              }

                              this.Field2776[var6] = var35;
                           }

                           if (var32.length > var34 + 2) {
                              if (this.Field2759 == null) {
                                 this.Field2759 = new float[this.Field2818][6];
                              }

                              this.Field2759[var6][0] = 0.0F + Class128.Method1331(Float.parseFloat(var32[var34 + 6]));
                              this.Field2759[var6][1] = 1.0F - Class128.Method1331(Float.parseFloat(var32[var34 + 7]));
                              this.Field2759[var6][2] = 0.0F + Class128.Method1331(Float.parseFloat(var32[var34 + 4]));
                              this.Field2759[var6][3] = 1.0F - Class128.Method1331(Float.parseFloat(var32[var34 + 5]));
                              this.Field2759[var6][4] = 0.0F + Class128.Method1331(Float.parseFloat(var32[var34 + 2]));
                              this.Field2759[var6][5] = 1.0F - Class128.Method1331(Float.parseFloat(var32[var34 + 3]));
                           }

                           this.Field2836[var6] = Rasterizer.Method9433(var37 & 16777215L);
                           var35 = (int)(var37 >> 24) & 255;
                           var35 = 255 - var35;
                           this.Field2835[var6] = var35;
                           ++var6;
                        }
                     default:
                        continue;
                     }
                  case 4:
                     switch(Method14534()[var31.ordinal()]) {
                     case 3:
                        if (var11) {
                           int var33 = Integer.parseInt(var4.split(" ")[1]);
                           this.Field2852 = new int[var33];
                        } else {
                           var34 = Integer.parseInt(var4.replaceAll("\t", "").replaceAll("[v()m]", "").split(" ")[4]);
                           this.Field2852[var7] = var34;
                           ++var7;
                        }
                     default:
                        continue;
                     }
                  case 5:
                     switch(Method14534()[var31.ordinal()]) {
                     case 4:
                        if (var11) {
                           if (this.Field2851 == null || this.Field2851.length < this.Field2817) {
                              this.Field2851 = new int[this.Field2817];
                           }
                        } else {
                           var34 = Integer.parseInt((var32 = var4.replaceAll("\t", "").split(" "))[0]);
                           var12 = Float.parseFloat(var32[1]);
                           this.Field2851[var34] += Math.round(var12 * 100.0F);
                           if (this.Field2851[var34] > 254) {
                              this.Field2851[var34] = 254;
                           } else if (this.Field2851[var34] < 0) {
                              this.Field2851[var34] = 0;
                           }
                        }
                     default:
                        continue;
                     }
                  case 6:
                     var32 = var4.split(" ");
                     var34 = 0;
                  }

                  while(var34 < var32.length) {
                     var32[var34] = var32[var34].replaceAll("\"", "").replaceAll("[()a-zA-Z]", "");
                     ++var34;
                  }

                  String var36 = var32[0];
                  var12 = Float.parseFloat(var32[6]);
                  int var13 = Math.round(Float.parseFloat(var32[2]) * 255.0F * var12) & 255;
                  int var14 = Math.round(Float.parseFloat(var32[3]) * 255.0F * var12) & 255;
                  var35 = Math.round(Float.parseFloat(var32[4]) * 255.0F * var12) & 255;
                  long var21 = (long)((Math.round(Float.parseFloat(var32[5]) * 255.0F) & 255) << 24 | var13 << 16 | var14 << 8) | (long)var35;
                  var9.add(var21);
                  var10.add(var36);
                  if (var36.contains("_")) {
                     var8 = true;
                  }
               }
            }
         } catch (Exception var29) {
            var29.printStackTrace();
         } finally {
            try {
               var1.close();
            } catch (IOException var28) {
               var28.printStackTrace();
            }

         }

         return false;
      }

      this.Field2758 = true;
      return true;
   }

   private boolean Method14465(byte[] var1) {
      Packet var6;
      int var2 = (var6 = new Packet(var1)).g1();
      int var3 = var6.g1();
      int var4 = var6.g1();
      int var5 = var6.g1();
      if (var2 == 69 && var3 == 77 && var4 == 80 && var5 == 83) {
         var6.g1();
         this.Field2817 = var6.Method402();
         this.Method14527(this.Field2817);
         this.Field2851 = new int[this.Field2817];

         for(var2 = 0; var2 < this.Field2817; ++var2) {
            float var7 = (float)var6.Method402() / 4.0F;
            this.Field2887[var2] = var7;
            this.Method14531(var2, (float)var6.Method402() / 4.0F);
            this.Method14533(var2, (float)var6.Method402() / 4.0F);
            this.Field2851[var2] = var6.Method402();
         }

         this.Field2818 = var6.Method402();
         this.Field2819 = new int[this.Field2818];
         this.Field2820 = new int[this.Field2818];
         this.Field2821 = new int[this.Field2818];
         this.Field2835 = new int[this.Field2818];
         this.Field2836 = new int[this.Field2818];
         this.Field2852 = new int[this.Field2818];
         this.Field2835 = new int[this.Field2818];
         this.Field2833 = null;

         for(var2 = 0; var2 < this.Field2818; ++var2) {
            this.Field2819[var2] = var6.Method402();
            this.Field2820[var2] = var6.Method402();
            this.Field2821[var2] = var6.Method402();
            this.Field2852[var2] = var6.Method402();
            this.Field2836[var2] = var6.Method402();
            this.Field2835[var2] = var6.g1() & 255;
            if (this.Field2835[var2] > 0) {
               this.Field2835[var2] = 255 - this.Field2835[var2];
            }
         }

         if ((var2 = var6.Method402()) > 0) {
            this.Field2776 = new int[this.Field2818];
            this.Field2759 = new float[this.Field2818][6];

            for(var3 = 0; var3 < var2; ++var3) {
               var4 = var6.Method402();
               this.Field2776[var4] = var6.Method402();

               for(var5 = 0; var5 < 6; ++var5) {
                  this.Field2759[var4][var5] = (float)var6.Method402() / 8192.0F;
               }
            }
         }

         this.Field2758 = true;
         return true;
      } else {
         throw new RuntimeException("No emps model!!");
      }
   }

   private void Method14466(byte[] var1, int var2, Class696 var3) {
      this.Field2777 = var2;
      Packet var4 = new Packet(var1);
      Packet var5 = new Packet(var1);
      Packet var6 = new Packet(var1);
      Packet var7 = new Packet(var1);
      Packet var8 = new Packet(var1);
      Packet var9 = new Packet(var1);
      Packet var10 = new Packet(var1);
      var4.pos = var1.length - 23;
      int var11 = var4.g2();
      int var12 = var4.g2();
      int var13 = var4.g1();
      int var14 = var4.g1();
      boolean var15 = ~(1 & var14) == -2;
      boolean var16 = (8 & var14) == 8;
      boolean var17 = (var14 & 1) == 1;
      boolean var18 = (var14 & 128) == 128;
      float var153;
      if (!var16) {
         Model var76 = this;
         Packet var80 = new Packet(var1);
         Packet var81 = new Packet(var1);
         Packet var82 = new Packet(var1);
         Packet var83 = new Packet(var1);
         Packet var84 = new Packet(var1);
         Packet var85 = new Packet(var1);
         Packet var86 = new Packet(var1);
         var80.pos = var1.length - 23;
         int var87 = var80.g2();
         int var88 = var80.g2();
         int var89 = var80.g1();
         int var90 = var80.g1();
         boolean var91 = ~(1 & var90) == -2;
         int var92 = var80.g1();
         int var93 = var80.g1();
         int var94 = var80.g1();
         int var95 = var80.g1();
         int var96 = var80.g1();
         int var97 = var80.g2();
         int var98 = var80.g2();
         int var99 = var80.g2();
         int var100 = var80.g2();
         int var101 = var80.g2();
         int var102 = 0;
         int var103 = 0;
         int var104 = 0;
         byte[] var105 = null;
         byte[] var106 = null;
         byte[] var107 = null;
         byte[] var108 = null;
         byte[] var109 = null;
         int[] var110 = null;
         int[] var111 = null;
         int[] var112 = null;
         boolean var10000;
         int var113;
         if (var89 > 0) {
            this.Field2774 = new byte[var89];
            var80.pos = 0;

            for(var113 = 0; var113 < var89; ++var113) {
               if (var80.pos >= var80.Field1259.length - 1) {
                  var10000 = false;
                  return;
               }

               byte var114;
               if ((var114 = var76.Field2774[var113] = var80.Method400()) == 0) {
                  ++var102;
               }

               if (var114 > 0 && var114 <= 3) {
                  ++var103;
               }

               if (var114 == 2) {
                  ++var104;
               }
            }
         }

         int var115 = var113 = var89 + var87;
         if (var90 == 1) {
            var113 += var88;
         }

         int var116 = var113;
         int var117 = var113 += var88;
         if (var92 == 255) {
            var113 += var88;
         }

         int var118 = var113;
         if (var94 == 1) {
            var113 += var88;
         }

         int var119 = var113;
         if (var96 == 1) {
            var113 += var87;
         }

         int var120 = var113;
         if (var93 == 1) {
            var113 += var88;
         }

         int var121 = var113;
         int var122 = var113 += var100;
         if (var95 == 1) {
            var113 += var88 << 1;
         }

         int var123 = var113;
         int var124 = var113 += var101;
         int var125 = var113 += var88 << 1;
         int var126 = var113 += var97;
         int var127 = var113 += var98;
         int var128 = var113 += var99;
         int var129 = var113 += var102 * 6;
         int var130 = var113 += var103 * 6;
         int var131 = var113 += var103 * 6;
         int var132 = var113 += var103;
         int var133 = var113 + var103;
         var76.Method14527(var87);
         int[] var134 = new int[var88];
         int[] var135 = new int[var88];
         int[] var136 = new int[var88];
         int[] var137 = new int[var87];
         int[] var138 = new int[var88];
         int[] var139 = new int[var88];
         int[] var140 = new int[var88];
         if (var96 == 1) {
            var137 = new int[var87];
         }

         if (var91) {
            var76.Field2833 = new int[var88];
         }

         if (var92 == 255) {
            var138 = new int[var88];
         }

         if (var93 == 1) {
            var139 = new int[var88];
         }

         if (var94 == 1) {
            var140 = new int[var88];
         }

         if (var95 == 1) {
            var76.Field2776 = new int[var88];
         }

         if (var95 == 1 && var89 > 0) {
            var76.Field2775 = new int[var88];
         }

         var76.Field2836 = new int[var88];
         if (var89 > 0) {
            var76.Field2839 = new int[var89];
            var76.Field2840 = new int[var89];
            var76.Field2841 = new int[var89];
            if (var103 > 0) {
               var110 = new int[var103];
               var112 = new int[var103];
               var111 = new int[var103];
               var108 = new byte[var103];
               var109 = new byte[var103];
               var106 = new byte[var103];
            }

            if (var104 > 0) {
               var107 = new byte[var104];
               var105 = new byte[var104];
            }
         }

         var80.pos = var89;
         var81.pos = var125;
         var82.pos = var126;
         var83.pos = var127;
         var84.pos = var119;
         float var141 = 0.0F;
         float var142 = 0.0F;
         float var143 = 0.0F;
         int var144 = 0;

         while(true) {
            int var145;
            int var146;
            int var147;
            int var148;
            if (var144 >= var87) {
               var80.pos = var124;
               var81.pos = var115;
               var82.pos = var117;
               var83.pos = var120;
               var84.pos = var118;
               var85.pos = var122;
               var86.pos = var123;

               for(var144 = 0; var144 < var88; ++var144) {
                  var76.Field2836[var144] = var80.g2();
                  if (var90 == 1) {
                     var76.Field2833[var144] = var81.Method400();
                  }

                  if (var92 == 255) {
                     var138[var144] = var82.Method400();
                  }

                  if (var93 == 1) {
                     var139[var144] = var83.Method400();
                     if (var139[var144] < 0) {
                        var139[var144] += 256;
                     }
                  }

                  if (var94 == 1) {
                     var140[var144] = var84.g1();
                  }

                  if (var95 == 1) {
                     var76.Field2776[var144] = var85.g2() - 1;
                  }

                  if (var76.Field2775 != null) {
                     if (var76.Field2776[var144] != -1) {
                        var76.Field2775[var144] = (byte)(var86.g1() - 1);
                     } else {
                        var76.Field2775[var144] = -1;
                     }
                  }
               }

               var80.pos = var121;
               var81.pos = var116;
               var144 = 0;
               var145 = 0;
               var146 = 0;
               var147 = 0;

               int var149;
               for(var148 = 0; var148 < var88; ++var148) {
                  if ((var149 = var81.g1()) == 1) {
                     var147 = var144 = var80.Method413() + var147;
                     var147 = var145 = var80.Method413() + var147;
                     var147 = var146 = var80.Method413() + var147;
                     var134[var148] = var144;
                     var135[var148] = var145;
                     var136[var148] = var146;
                  }

                  if (var149 == 2) {
                     var145 = var146;
                     var147 = var146 = var80.Method413() + var147;
                     var134[var148] = var144;
                     var135[var148] = var145;
                     var136[var148] = var146;
                  }

                  if (var149 == 3) {
                     var144 = var146;
                     var147 = var146 = var80.Method413() + var147;
                     var134[var148] = var144;
                     var135[var148] = var145;
                     var136[var148] = var146;
                  }

                  if (var149 == 4) {
                     int var150 = var144;
                     var144 = var145;
                     var145 = var150;
                     var147 = var146 = var80.Method413() + var147;
                     var134[var148] = var144;
                     var135[var148] = var150;
                     var136[var148] = var146;
                  }
               }

               var80.pos = var128;
               var81.pos = var129;
               var82.pos = var130;
               var83.pos = var131;
               var84.pos = var132;
               var85.pos = var133;

               for(var148 = 0; var148 < var89; ++var148) {
                  if ((var149 = var76.Field2774[var148] & 255) == 0) {
                     var76.Field2839[var148] = var80.g2();
                     var76.Field2840[var148] = var80.g2();
                     var76.Field2841[var148] = var80.g2();
                  }

                  if (var149 == 1) {
                     var76.Field2839[var148] = var81.g2();
                     var76.Field2840[var148] = var81.g2();
                     var76.Field2841[var148] = var81.g2();
                     var110[var148] = var82.g2();
                     var112[var148] = var82.g2();
                     var111[var148] = var82.g2();
                     var108[var148] = var83.Method400();
                     var109[var148] = var84.Method400();
                     var106[var148] = var85.Method400();
                  }

                  if (var149 == 2) {
                     var76.Field2839[var148] = var81.g2();
                     var76.Field2840[var148] = var81.g2();
                     var76.Field2841[var148] = var81.g2();
                     var110[var148] = var82.g2();
                     var112[var148] = var82.g2();
                     var111[var148] = var82.g2();
                     var108[var148] = var83.Method400();
                     var109[var148] = var84.Method400();
                     var106[var148] = var85.Method400();
                     var107[var148] = var85.Method400();
                     var105[var148] = var85.Method400();
                  }

                  if (var149 == 3) {
                     var76.Field2839[var148] = var81.g2();
                     var76.Field2840[var148] = var81.g2();
                     var76.Field2841[var148] = var81.g2();
                     var110[var148] = var82.g2();
                     var112[var148] = var82.g2();
                     var111[var148] = var82.g2();
                     var108[var148] = var83.Method400();
                     var109[var148] = var84.Method400();
                     var106[var148] = var85.Method400();
                  }
               }

               if (var92 != 255) {
                  for(var148 = 0; var148 < var88; ++var148) {
                     var138[var148] = var92;
                  }
               }

               var3.Field10511 = var2;
               var3.Field10512 = var1;
               var3.Field10513 = var87;
               var3.Field10514 = var88;
               var3.Field10515 = var89;
               var76.Field2851 = var137;
               var76.Field2834 = var138;
               var76.Field2835 = var139;
               var76.Field2852 = var140;
               var76.Field2817 = var87;
               var76.Field2818 = var88;
               var76.Field2819 = var134;
               var76.Field2820 = var135;
               var76.Field2821 = var136;
               var80.Field1259 = null;
               var81.Field1259 = null;
               var82.Field1259 = null;
               var83.Field1259 = null;
               var84.Field1259 = null;
               var85.Field1259 = null;
               var86.Field1259 = null;
               var10000 = true;
               break;
            }

            var145 = var80.g1();
            var146 = 0;
            if ((var145 & 1) != 0) {
               if (var81.pos >= var81.Field1259.length - 1) {
                  var10000 = false;
                  break;
               }

               var146 = var81.Method413();
            }

            var147 = 0;
            if ((var145 & 2) != 0) {
               var147 = var82.Method413();
            }

            var148 = 0;
            if ((var145 & 4) != 0) {
               var148 = var83.Method413();
            }

            var153 = var141 + (float)var146;
            var76.Field2887[var144] = var153;
            var76.Method14531(var144, var142 + (float)var147);
            var76.Method14533(var144, var143 + (float)var148);
            var141 = var76.Field2887[var144];
            var142 = var76.Method14530(var144);
            var143 = var76.Method14532(var144);
            var137[var144] = var84.g1();
            ++var144;
         }

      } else {
         var3.Field10511 = var2;
         var3.Field10512 = var1;
         var3.Field10513 = var11;
         var3.Field10514 = var12;
         var3.Field10515 = var13;
         if (var16) {
            var4.pos -= 7;
            this.Field2888 = var4.g1();
            var4.pos += 6;
         }

         int var156 = var4.g1();
         int var158 = var4.g1();
         int var19 = var4.g1();
         int var20 = var4.g1();
         int var21 = var4.g1();
         int var22 = var4.g2();
         int var23 = var4.g2();
         int var24 = var4.g2();
         int var25 = var4.g2();
         int var26 = var4.g2();
         int var27 = 0;
         int var28 = 0;
         int var29 = 0;
         this.Field2829 = null;
         this.Field2828 = null;
         this.Field2822 = null;
         this.Field2826 = null;
         this.Field2824 = null;
         this.Field2825 = null;
         this.Field2823 = null;
         this.Field2827 = null;
         int var30;
         if (var13 > 0) {
            this.Field2774 = new byte[var13];
            var4.pos = 0;

            for(var30 = 0; var30 < var13; ++var30) {
               this.Field2774[var30] = 0;
               byte var31;
               if ((var31 = this.Field2774[var30] = var4.Method400()) == 0) {
                  ++var27;
               }

               if (var31 > 0 && var31 <= 3) {
                  ++var28;
               }

               if (var31 == 2) {
                  ++var29;
               }
            }
         }

         int var32 = var30 = var13 + var11;
         if (var15) {
            var30 += var12;
         }

         if (var14 == 1) {
            var30 += var12;
         }

         var14 = var30;
         int var33 = var30 += var12;
         if (var156 == 255) {
            var30 += var12;
         }

         int var34 = var30;
         if (var19 == 1) {
            var30 += var12;
         }

         int var35 = var30;
         if (var21 == 1) {
            var30 += var11;
         }

         int var36 = var30;
         if (var158 == 1) {
            var30 += var12;
         }

         int var37 = var30;
         var25 = var30 += var25;
         if (var20 == 1) {
            var30 += var12 << 1;
         }

         int var38 = var30;
         var26 = var30 += var26;
         int var39 = var30 += var12 << 1;
         var22 = var30 += var22;
         var23 = var30 += var23;
         var24 = var30 += var24;
         var27 = var30 += var27 * 6;
         var30 += var28 * 6;
         byte var40 = 6;
         if (this.Field2888 != 14) {
            if (this.Field2888 >= 15) {
               var40 = 9;
            }
         } else {
            var40 = 7;
         }

         int var41 = var30;
         int var161 = var30 += var40 * var28;
         int var42 = var30 += var28;
         int var43 = var30 += var28;
         var30 += var28 + (var29 << 1);
         var28 = var1.length;
         int var44 = var1.length;
         int var45 = var1.length;
         if (var18) {
            Packet var46;
            (var46 = new Packet(var1)).pos = var1.length - 26;
            var46.pos -= var1[var46.pos - 1];
            this.Field2778 = var46.g2();
            int var154 = var46.g2();
            int var159 = var46.g2();
            var45 = (var44 = (var28 = var30 + var154 + var159) + var11) + (this.Field2778 << 1);
            var46.Field1259 = null;
         }

         this.Method14527(var11);
         this.Field2819 = new int[var12];
         this.Field2820 = new int[var12];
         this.Field2821 = new int[var12];
         this.Field2851 = new int[var11];
         this.Field2833 = new int[var12];
         this.Field2834 = new int[var12];
         this.Field2835 = new int[var12];
         this.Field2852 = new int[var12];
         this.Field2836 = new int[var12];
         if (var21 == 1) {
            this.Field2851 = new int[var11];
         }

         if (var15) {
            this.Field2833 = new int[var12];
         }

         if (var156 == 255) {
            this.Field2834 = new int[var12];
         }

         if (var20 == 1) {
            this.Field2776 = new int[var12];
         }

         if (var20 == 1 && (var13 > 0 || this.Field2778 > 0)) {
            this.Field2775 = new int[var12];
         }

         if (var13 > 0) {
            this.Field2839 = new int[var13];
            this.Field2840 = new int[var13];
            this.Field2841 = new int[var13];
            if (var13 > 0) {
               this.Field2827 = new int[var13];
               this.Field2823 = new int[var13];
               this.Field2825 = new int[var13];
               this.Field2822 = new int[var13];
               this.Field2824 = new int[var13];
               this.Field2826 = new int[var13];
               this.Field2828 = new int[var13];
               this.Field2829 = new int[var13];
            }

            if (var29 > 0) {
               this.Field2828 = new int[var13];
               this.Field2829 = new int[var13];
            }
         }

         var4.pos = var13;
         var5.pos = var39;
         var6.pos = var22;
         var7.pos = var23;
         var8.pos = var35;
         float var155 = 0.0F;
         float var157 = 0.0F;
         float var160 = 0.0F;

         int var64;
         int var65;
         for(var65 = 0; var65 < var11; ++var65) {
            var64 = var4.g1();
            int var66 = 0;
            if ((var64 & 1) != 0) {
               var66 = var5.Method413();
            }

            int var67 = 0;
            if ((var64 & 2) != 0) {
               var67 = var6.Method413();
            }

            int var68 = 0;
            if ((var64 & 4) != 0) {
               var68 = var7.Method413();
            }

            var153 = var155 + (float)var66;
            this.Field2887[var65] = var153;
            this.Method14531(var65, var157 + (float)var67);
            this.Method14533(var65, var160 + (float)var68);
            var155 = this.Field2887[var65];
            var157 = this.Method14530(var65);
            var160 = this.Method14532(var65);
            if (this.Field2851 != null) {
               this.Field2851[var65] = var8.g1();
            }
         }

         if (this.Field2778 > 0) {
            var4.pos = var28;
            var5.pos = var44;
            var6.pos = var45;
            this.Field2779 = new int[var11];
            var65 = 0;

            for(var64 = 0; var65 < var11; ++var65) {
               this.Field2779[var65] = var64;
               var64 += var4.g1();
            }

            this.Field2780 = new byte[var12];
            this.Field2781 = new byte[var12];
            this.Field2782 = new byte[var12];
            this.Field2783 = new float[this.Field2778];
            this.Field2784 = new float[this.Field2778];

            for(var65 = 0; var65 < this.Field2778; ++var65) {
               this.Field2783[var65] = (float)var5.Method402() / 4096.0F;
               this.Field2784[var65] = (float)var6.Method402() / 4096.0F;
            }
         }

         var4.pos = var26;
         var5.pos = var32;
         var6.pos = var33;
         var7.pos = var36;
         var8.pos = var34;
         var9.pos = var25;
         var10.pos = var38;

         for(var65 = 0; var65 < var12; ++var65) {
            this.Field2836[var65] = var4.g2();
            if (var17) {
               this.Field2833[var65] = var5.Method400();
            }

            if (var156 == 255) {
               this.Field2834[var65] = var6.Method400();
            }

            if (var158 == 1) {
               this.Field2835[var65] = var7.Method400();
               if (this.Field2835[var65] < 0) {
                  this.Field2835[var65] += 256;
               }
            }

            if (var19 == 1) {
               this.Field2852[var65] = var8.g1();
            }

            if (var20 == 1) {
               this.Field2776[var65] = var9.g2() - 1;
            }

            if (this.Field2775 != null) {
               if (this.Field2776[var65] != -1) {
                  this.Field2775[var65] = (byte)(var10.g1() - 1);
               } else {
                  this.Field2775[var65] = -1;
               }
            }
         }

         var4.pos = var37;
         var5.pos = var14;
         int var69 = 0;
         int var70 = 0;
         int var71 = 0;
         int var72 = 0;

         int var73;
         int var75;
         for(var73 = 0; var73 < var12; ++var73) {
            int var74;
            if ((var74 = var5.g1()) == 1) {
               var72 = var69 = var4.Method413() + var72;
               var72 = var70 = var4.Method413() + var72;
               var72 = var71 = var4.Method413() + var72;
               this.Field2819[var73] = var69;
               this.Field2820[var73] = var70;
               this.Field2821[var73] = var71;
            }

            if (var74 == 2) {
               var70 = var71;
               var72 = var71 = var4.Method413() + var72;
               this.Field2819[var73] = var69;
               this.Field2820[var73] = var70;
               this.Field2821[var73] = var71;
            }

            if (var74 == 3) {
               var69 = var71;
               var72 = var71 = var4.Method413() + var72;
               this.Field2819[var73] = var69;
               this.Field2820[var73] = var70;
               this.Field2821[var73] = var71;
            }

            if (var74 == 4) {
               var75 = var69;
               var69 = var70;
               var70 = var75;
               var72 = var71 = var4.Method413() + var72;
               this.Field2819[var73] = var69;
               this.Field2820[var73] = var75;
               this.Field2821[var73] = var71;
            }
         }

         var4.pos = var24;
         var5.pos = var27;
         var6.pos = var41;
         var7.pos = var161;
         var8.pos = var42;
         var9.pos = var43;

         for(var73 = 0; var73 < var13; ++var73) {
            if ((var75 = this.Field2774[var73] & 255) == 0) {
               this.Field2839[var73] = var4.g2();
               this.Field2840[var73] = var4.g2();
               this.Field2841[var73] = var4.g2();
            }

            if (var75 == 1) {
               this.Field2839[var73] = var5.g2();
               this.Field2840[var73] = var5.g2();
               this.Field2841[var73] = var5.g2();
               if (this.Field2888 < 15) {
                  this.Field2827[0] = var6.g2();
                  if (this.Field2888 >= 14) {
                     this.Field2826[0] = var6.Method382();
                  } else {
                     this.Field2826[0] = var6.g2();
                  }

                  this.Field2825[0] = var6.g2();
               } else {
                  this.Field2827[0] = var6.Method382();
                  this.Field2826[0] = var6.Method382();
                  this.Field2825[0] = var6.Method382();
               }

               this.Field2822[0] = var7.Method400();
               this.Field2824[0] = var8.Method400();
               this.Field2823[0] = var9.Method400();
            }

            if (var75 == 2) {
               this.Field2839[var73] = var5.g2();
               this.Field2840[var73] = var5.g2();
               this.Field2841[var73] = var5.g2();
               if (this.Field2888 >= 15) {
                  this.Field2827[0] = var6.Method382();
                  this.Field2826[0] = var6.Method382();
                  this.Field2825[0] = var6.Method382();
               } else {
                  this.Field2827[0] = var6.g2();
                  if (this.Field2888 < 14) {
                     this.Field2826[0] = var6.g2();
                  } else {
                     this.Field2826[0] = var6.Method382();
                  }

                  this.Field2825[0] = var6.g2();
               }

               this.Field2822[0] = var7.Method400();
               this.Field2824[0] = var8.Method400();
               this.Field2823[0] = var9.Method400();
               this.Field2828[0] = var9.Method400();
               this.Field2829[0] = var9.Method400();
            }

            if (var75 == 3) {
               this.Field2839[var73] = var5.g2();
               this.Field2840[var73] = var5.g2();
               this.Field2841[var73] = var5.g2();
               if (this.Field2888 < 15) {
                  this.Field2827[0] = var6.g2();
                  if (this.Field2888 < 14) {
                     this.Field2826[0] = var6.g2();
                  } else {
                     this.Field2826[0] = var6.Method382();
                  }

                  this.Field2825[0] = var6.g2();
               } else {
                  this.Field2827[0] = var6.Method382();
                  this.Field2826[0] = var6.Method382();
                  this.Field2825[0] = var6.Method382();
               }

               this.Field2822[0] = var7.Method400();
               this.Field2824[0] = var8.Method400();
               this.Field2823[0] = var9.Method400();
            }
         }

         if (var156 != 255) {
            for(var73 = 0; var73 < var12; ++var73) {
               this.Field2834[var73] = var156;
            }
         }

         this.Field2817 = var11;
         this.Field2818 = var12;
         this.Field2838 = var13;
         var4.Field1259 = null;
         var5.Field1259 = null;
         var6.Field1259 = null;
         var7.Field1259 = null;
         var8.Field1259 = null;
         var9.Field1259 = null;
         var10.Field1259 = null;
         this.Field2813 = true;
         if (var2 == 546 || var2 == 11225) {
            this.Method14492(1.0F, 1.0F, 1.2F);
         }

         if (var2 == 56294) {
            this.Method14492(1.0F, 1.0F, 1.2F);
            this.Method14491(2015);
            this.Method14493(0, 0, -9);
         }

      }
   }

   private void Method14467(int var1, Class696 var2) {
      this.Field2814 = true;
      this.Field2855 = false;
      ++Field2815;
      this.Field2817 = var2.Field10513;
      this.Field2818 = var2.Field10514;
      this.Field2838 = var2.Field10515;
      var2.Field10511 = var1;
      this.Method14527(this.Field2817);
      this.Field2819 = new int[this.Field2818];
      this.Field2820 = new int[this.Field2818];
      this.Field2821 = new int[this.Field2818];
      this.Field2839 = new int[this.Field2838];
      this.Field2840 = new int[this.Field2838];
      this.Field2841 = new int[this.Field2838];
      if (var2.Field10520 >= 0) {
         this.Field2851 = new int[this.Field2817];
      }

      if (var2.Field10524 >= 0) {
         this.Field2833 = new int[this.Field2818];
      }

      if (var2.Field10525 >= 0) {
         this.Field2834 = new int[this.Field2818];
      } else {
         this.Field2837 = (byte)(-var2.Field10525 - 1);
      }

      if (var2.Field10526 >= 0) {
         this.Field2835 = new int[this.Field2818];
      }

      if (var2.Field10527 >= 0) {
         this.Field2852 = new int[this.Field2818];
      }

      this.Field2836 = new int[this.Field2818];
      Packet var15;
      (var15 = new Packet(var2.Field10512)).pos = 0;
      Packet var3;
      (var3 = new Packet(var2.Field10512)).pos = var2.Field10517;
      Packet var4;
      (var4 = new Packet(var2.Field10512)).pos = var2.Field10518;
      Packet var5;
      (var5 = new Packet(var2.Field10512)).pos = var2.Field10519;
      Packet var6;
      (var6 = new Packet(var2.Field10512)).pos = var2.Field10520;
      float var7 = 0.0F;
      float var8 = 0.0F;
      float var9 = 0.0F;

      int var10;
      int var11;
      int var12;
      int var13;
      int var14;
      for(var10 = 0; var10 < this.Field2817; ++var10) {
         var11 = var15.g1();
         var12 = 0;
         if ((var11 & 1) != 0) {
            var12 = var3.Method413();
         }

         var13 = 0;
         if ((var11 & 2) != 0) {
            var13 = var4.Method413();
         }

         var14 = 0;
         if ((var11 & 4) != 0) {
            var14 = var5.Method413();
         }

         float var17 = var7 + (float)var12;
         this.Field2887[var10] = var17;
         this.Method14531(var10, var8 + (float)var13);
         this.Method14533(var10, var9 + (float)var14);
         var7 = this.Field2887[var10];
         var8 = this.Method14530(var10);
         var9 = this.Method14532(var10);
         if (this.Field2851 != null) {
            this.Field2851[var10] = var6.g1();
         }
      }

      var15.pos = var2.Field10523;
      var3.pos = var2.Field10524;
      var4.pos = var2.Field10525;
      var5.pos = var2.Field10526;
      var6.pos = var2.Field10527;

      for(var10 = 0; var10 < this.Field2818; ++var10) {
         this.Field2836[var10] = var15.g2();
         if (this.Field2833 != null) {
            this.Field2833[var10] = (byte)var3.g1();
         }

         if (this.Field2834 != null) {
            this.Field2834[var10] = var4.g1();
         }

         if (this.Field2835 != null) {
            this.Field2835[var10] = var5.g1();
         }

         if (this.Field2852 != null) {
            this.Field2852[var10] = var6.g1();
         }
      }

      var15.pos = var2.Field10521;
      var3.pos = var2.Field10522;
      var10 = 0;
      var11 = 0;
      var12 = 0;
      var13 = 0;

      for(var14 = 0; var14 < this.Field2818; ++var14) {
         int var16;
         if ((var16 = var3.g1()) == 1) {
            var13 = var10 = var15.Method413() + var13;
            var13 = var11 = var15.Method413() + var13;
            var13 = var12 = var15.Method413() + var13;
            this.Field2819[var14] = var10;
            this.Field2820[var14] = var11;
            this.Field2821[var14] = var12;
         }

         if (var16 == 2) {
            var11 = var12;
            var13 = var12 = var15.Method413() + var13;
            this.Field2819[var14] = var10;
            this.Field2820[var14] = var11;
            this.Field2821[var14] = var12;
         }

         if (var16 == 3) {
            var10 = var12;
            var13 = var12 = var15.Method413() + var13;
            this.Field2819[var14] = var10;
            this.Field2820[var14] = var11;
            this.Field2821[var14] = var12;
         }

         if (var16 == 4) {
            var16 = var10;
            var10 = var11;
            var11 = var16;
            var13 = var12 = var15.Method413() + var13;
            this.Field2819[var14] = var10;
            this.Field2820[var14] = var16;
            this.Field2821[var14] = var12;
         }
      }

      var15.pos = var2.Field10528;

      for(var14 = 0; var14 < this.Field2838; ++var14) {
         this.Field2839[var14] = var15.g2();
         this.Field2840[var14] = var15.g2();
         this.Field2841[var14] = var15.g2();
      }

      var15.Field1259 = null;
      var3.Field1259 = null;
      var4.Field1259 = null;
      var5.Field1259 = null;
      var6.Field1259 = null;
   }

   public static void Method14468(byte[] var0, int var1) {
      byte[] var10000 = var0;
      boolean var2 = false;
      var1 = var1;
      var0 = var0;
      if (var10000 == null) {
         Class696 var16;
         Method14456(var16 = new Class696(), var1, 2);
         var16.Field10511 = var1;
         var16.Field10513 = 0;
         var16.Field10514 = 0;
         var16.Field10515 = 0;
      } else {
         Class867 var3;
         if (Client.Field12157.size() >= 0 && (var3 = (Class867) Client.Field12157.get(var1)) != null) {
            var0 = var3.Field2641;
            var2 = true;
         }

         Packet var15;
         (var15 = new Packet(var0)).pos = var0.length - 18;
         Map var5 = Field2857;
         Class696 var4;
         synchronized(Field2857) {
            if ((var4 = (Class696)Field2857.get(var1)) != null && var2) {
               var4.Method11976();
               var4 = null;
            }

            if (var4 == null) {
               Method14456(var4 = new Class696(), var1, 3);
            }
         }

         var4.Field10511 = var1;
         var4.Field10512 = var0;
         var4.Field10513 = var15.g2();
         var4.Field10514 = var15.g2();
         var4.Field10515 = var15.g1();
         int var17 = var15.g1();
         int var13 = var15.g1();
         int var14 = var15.g1();
         int var6 = var15.g1();
         int var7 = var15.g1();
         int var8 = var15.g2();
         int var9 = var15.g2();
         var15.g2();
         int var10 = var15.g2();
         var4.Field10516 = 0;
         int var11 = 0 + var4.Field10513;
         var4.Field10522 = var11;
         var11 += var4.Field10514;
         var4.Field10525 = var11;
         if (var13 == 255) {
            var11 += var4.Field10514;
         } else {
            var4.Field10525 = -var13 - 1;
         }

         var4.Field10527 = var11;
         if (var6 == 1) {
            var11 += var4.Field10514;
         } else {
            var4.Field10527 = -1;
         }

         var4.Field10524 = var11;
         if (var17 == 1) {
            var11 += var4.Field10514;
         } else {
            var4.Field10524 = -1;
         }

         var4.Field10520 = var11;
         if (var7 == 1) {
            var11 += var4.Field10513;
         } else {
            var4.Field10520 = -1;
         }

         var4.Field10526 = var11;
         if (var14 == 1) {
            var11 += var4.Field10514;
         } else {
            var4.Field10526 = -1;
         }

         var4.Field10521 = var11;
         var11 += var10;
         var4.Field10523 = var11;
         var11 += var4.Field10514 << 1;
         var4.Field10528 = var11;
         var11 += var4.Field10515 * 6;
         var4.Field10517 = var11;
         var11 += var8;
         var4.Field10518 = var11;
         var11 += var9;
         var4.Field10519 = var11;
         var15.Field1259 = null;
         if (Field2743 = Field2804 >= 2) {
            Field2749.submit(new Class874(var1, var4));
         } else {
            var4.Method11981();
         }
      }
   }

   public static boolean Method14469(int var0) {
      if (Field2785 == null) {
         return false;
      } else {
         return Field2785.get(var0) != null;
      }
   }

   public static void Method14470(int var0) {
      if (Field2785 != null) {
         Field2785.put(var0, true);
      }

   }

   public static void Method14471() {
      if (Field2785 != null) {
         Field2785.clear();
      }

   }

   public static void Method14472() {
      if (GraphicsDisplay.Field2678 && GraphicsDisplay.Field2667) {
         Field2859 = 4096;
         Field2860 = 1024;
         Field2805 = 1;
      } else {
         Field2859 = 9216;
         Field2860 = 4096;
         Field2805 = Field2804;
      }

      Field2863 = new float[Field2805][Field2859];
      Field2864 = new float[Field2805][Field2859];
      Field2865 = new float[Field2805][Field2859];
      Field2866 = new float[Field2805][Field2859];
      Field2867 = new int[Field2805][Field2859];
      Field2868 = new int[Field2805][Field2859];
      Field2869 = new int[Field2805][Field2859];
      Field2870 = new int[Field2805][Field2860];
      Field2871 = new int[Field2805][Field2860][512];
      Field2872 = new int[12];
      Field2873 = new int[12][Field2860];
      Field2874 = new int[Field2860];
      Field2875 = new int[Field2860];
      Field2876 = new int[12];
      if (!GraphicsDisplay.Field2678) {
         Field2861 = new boolean[Field2859];
         Field2862 = new boolean[Field2859];
      }

   }

   public static void Method14473(OnDemandFetcher var0) {
      Method14474();
      Field2857 = new HashMap();
      if (!GraphicsDisplay.Field2678) {
         Field2772 = new boolean[Field2764];
      }

      Field2785 = new HashMap();
      Field2858 = var0;
      Method14472();
   }

   public static void Method14474() {
      if (Field2857 != null) {
         Map var0 = Field2857;
         synchronized(Field2857) {
            Iterator var2 = Field2857.values().iterator();

            while(var2.hasNext()) {
               ((Class696)var2.next()).Method11976();
            }

            Field2857.clear();
         }
      }
   }

   public static synchronized Model Method14475(int var0) {
      return Method14476(var0, false, true);
   }

   public static synchronized Model Method14476(int var0, boolean var1, boolean var2) {
      try {
         if (Field2857 == null) {
            return null;
         } else {
            Map var4 = Field2857;
            Class696 var3;
            synchronized(Field2857) {
               var3 = (Class696)Field2857.get(var0);
            }

            if (var3 == null) {
               if (Field2743) {
                  (var3 = new Class696()).Field10507 = var1;
                  Method14456(var3, var0, 10);
               }

               Field2858.Method13227(var0);
               return null;
            } else if (var3.Method11980()) {
               if (System.currentTimeMillis() - var3.Method11975() > 15000L) {
                  Field2858.Method13209(var0);
                  var3.Method11974(System.currentTimeMillis());
               }

               return null;
            } else if (Field2743) {
               return var2 ? var3.Method11978() : var3.Method11977();
            } else {
               Model var7 = var3.Method11977();
               var3.Field10509 = System.currentTimeMillis();
               if (var7 == null) {
                  var7 = new Model(var0, var1, var3);
                  var3.Method11979(var7);
               }

               return var2 ? var3.Method11978() : var7;
            }
         }
      } catch (Exception var6) {
         var6.printStackTrace();
         return null;
      }
   }

   public static boolean Method14477(int var0) {
      if (var0 == -1) {
         return true;
      } else if (Field2857 == null) {
         return false;
      } else {
         Map var2 = Field2857;
         Class696 var1;
         synchronized(Field2857) {
            var1 = (Class696)Field2857.get(var0);
         }

         if (var1 == null) {
            if (Field2743) {
               Method14456(new Class696(), var0, 11);
            }

            Field2858.Method13227(var0);
            return false;
         } else if (var1.Method11980()) {
            if (System.currentTimeMillis() - var1.Method11975() > 15000L) {
               Field2858.Method13209(var0);
               var1.Method11974(System.currentTimeMillis());
            }

            return false;
         } else {
            return true;
         }
      }
   }

   public Model() {
      this.Field2745 = GraphicsDisplay.Field2678;
      this.Field2750 = true;
      this.Field2751 = 0;
      this.Field2753 = false;
      this.Field2754 = 0;
      this.Field2755 = 100;
      this.Field2756 = false;
      this.Field2757 = false;
      this.Field2758 = false;
      this.Field2759 = null;
      this.Field2760 = 0;
      this.Field2762 = new LinkedList();
      this.Field2765 = false;
      this.Field2766 = false;
      this.Field2767 = false;
      this.Field2768 = 0;
      this.Field2769 = 0.0F;
      this.Field2773 = false;
      this.Field2774 = null;
      this.Field2775 = null;
      this.Field2776 = null;
      this.Field2777 = 0;
      this.Field2778 = 0;
      this.Field2786 = null;
      this.Field2789 = 1.0F;
      this.Field2790 = 1.0F;
      this.Field2791 = 1.0F;
      this.Field2792 = 0;
      this.Field2793 = 0;
      this.Field2794 = 0;
      this.Field2812 = -1;
      this.Field2813 = false;
      this.Field2884 = null;
      this.Field2885 = 0;
      this.Field2886 = null;
      this.Field2887 = null;
      this.Field2888 = 0;
      this.Field2855 = false;
      this.Field2838 = 0;
      this.Field2837 = 0;
      this.Field2888 = 12;
      this.Field2817 = 0;
      this.Field2818 = 0;
   }

   private Model(boolean var1) {
      this.Field2745 = GraphicsDisplay.Field2678;
      this.Field2750 = true;
      this.Field2751 = 0;
      this.Field2753 = false;
      this.Field2754 = 0;
      this.Field2755 = 100;
      this.Field2756 = false;
      this.Field2757 = false;
      this.Field2758 = false;
      this.Field2759 = null;
      this.Field2760 = 0;
      this.Field2762 = new LinkedList();
      this.Field2765 = false;
      this.Field2766 = false;
      this.Field2767 = false;
      this.Field2768 = 0;
      this.Field2769 = 0.0F;
      this.Field2773 = false;
      this.Field2774 = null;
      this.Field2775 = null;
      this.Field2776 = null;
      this.Field2777 = 0;
      this.Field2778 = 0;
      this.Field2786 = null;
      this.Field2789 = 1.0F;
      this.Field2790 = 1.0F;
      this.Field2791 = 1.0F;
      this.Field2792 = 0;
      this.Field2793 = 0;
      this.Field2794 = 0;
      this.Field2812 = -1;
      this.Field2813 = false;
      this.Field2884 = null;
      this.Field2885 = 0;
      this.Field2886 = null;
      this.Field2887 = null;
      this.Field2888 = 0;
      this.Field2814 = true;
      this.Field2855 = false;
   }

   public Model(int var1, Model[] var2) {
      this(var1, var2, false);
   }

   private Model(int var1, Model[] var2, boolean var3) {
      this();
      if (var2 != null) {
         boolean var4 = false;
         boolean var5 = false;
         boolean var6 = false;
         boolean var7 = false;
         boolean var8 = false;
         boolean var9 = false;
         boolean var10 = false;
         this.Field2837 = -1;

         int var14;
         for(int var11 = 0; var11 != var1; ++var11) {
            Model var12;
            if ((var12 = var2[var11]) != null) {
               if (var12.Field2760 > 0) {
                  var14 = var12.Field2760;
                  this.Field2760 = var14;
               }

               this.Field10127 = var12.Field10127;
               this.Field2846 = var12.Field2846;
               this.Field2756 |= var12.Field2756;
               this.Field2757 |= var12.Field2757;
               this.Field2758 |= var12.Field2758;
               this.Field2818 += var12.Field2818;
               this.Field2838 += var12.Field2838;
               this.Field2817 += var12.Field2817;
               var4 |= var12.Field2833 != null;
               var6 |= var12.Field2835 != null;
               var10 |= var12.Field2884 != null;
               if (var12.Field2834 != null) {
                  var5 = true;
               } else {
                  if (this.Field2837 == -1) {
                     this.Field2837 = var12.Field2837;
                  }

                  if (var12.Field2837 != this.Field2837) {
                     var5 = true;
                  }
               }

               var7 |= var12.Field2775 != null;
               var9 |= var12.Field2852 != null;
               var8 |= var12.Field2776 != null;
            }
         }

         this.Field2836 = new int[this.Field2818];
         this.Method14527(this.Field2817);
         this.Field2819 = new int[this.Field2818];
         this.Field2820 = new int[this.Field2818];
         this.Field2821 = new int[this.Field2818];
         this.Field2851 = new int[this.Field2817];
         if (var4) {
            this.Field2833 = new int[this.Field2818];
         }

         if (var9) {
            this.Field2852 = new int[this.Field2818];
         }

         if (var10) {
            this.Field2884 = new HashMap();
         }

         this.Field2830 = new int[this.Field2818];
         this.Field2831 = new int[this.Field2818];
         this.Field2832 = new int[this.Field2818];
         this.Field2759 = new float[this.Field2818][6];
         if (this.Field2838 > 0) {
            this.Field2839 = new int[this.Field2838];
            this.Field2840 = new int[this.Field2838];
            this.Field2841 = new int[this.Field2838];
            this.Field2774 = new byte[this.Field2838];
            if (GraphicsDisplay.Field2678) {
               this.Field2827 = new int[this.Field2838];
               this.Field2823 = new int[this.Field2838];
               this.Field2825 = new int[this.Field2838];
               this.Field2822 = new int[this.Field2838];
               this.Field2824 = new int[this.Field2838];
               this.Field2826 = new int[this.Field2838];
               this.Field2828 = new int[this.Field2838];
               this.Field2829 = new int[this.Field2838];
            }
         }

         if (var7) {
            this.Field2775 = new int[this.Field2818];
         }

         if (var8) {
            this.Field2776 = new int[this.Field2818];
         }

         if (var6) {
            this.Field2835 = new int[this.Field2818];
         }

         if (var5) {
            this.Field2834 = new int[this.Field2818];
         }

         this.Field2818 = 0;
         this.Field2817 = 0;
         this.Field2762.clear();
         int[] var24 = var3 ? new int[var1] : null;

         int var25;
         for(int var16 = 0; var16 != var1; ++var16) {
            Model var22;
            if ((var22 = var2[var16]) != null) {
               Iterator var13;
               if (var22.Field2762 != null) {
                  var13 = var22.Field2762.iterator();

                  while(var13.hasNext()) {
                     var25 = (Integer)var13.next();
                     if (this.Field2762.indexOf(var25) == -1) {
                        this.Field2762.add(var25);
                     }
                  }
               }

               if (var22 != null) {
                  if (var24 != null) {
                     if (var22.Field2884 != null) {
                        var13 = var22.Field2884.entrySet().iterator();

                        while(var13.hasNext()) {
                           Entry var26 = (Entry)var13.next();
                           this.Field2884.put(this.Field2817 + (Integer)var26.getKey(), (Integer)var26.getValue());
                        }
                     }

                     this.Method14528(var22.Field2886);

                     for(var25 = 0; var25 != var22.Field2817; ++var25) {
                        float var15 = var22.Field2887[var25];
                        var14 = this.Field2817;
                        this.Field2887[var14] = var15;
                        this.Method14531(this.Field2817, var22.Method14530(var25));
                        this.Method14533(this.Field2817, var22.Method14532(var25));
                        this.Field2851[this.Field2817] = var22.Field2851 != null ? var22.Field2851[var25] : -1;
                        ++this.Field2817;
                     }
                  }

                  for(var25 = 0; var25 != var22.Field2818; ++var25) {
                     if (this.Field2759 != null) {
                        if (var22.Field2759 == null) {
                           this.Field2759[this.Field2818][0] = 0.0F;
                           this.Field2759[this.Field2818][1] = 0.0F;
                           this.Field2759[this.Field2818][2] = 0.0F;
                           this.Field2759[this.Field2818][3] = 0.0F;
                           this.Field2759[this.Field2818][4] = 0.0F;
                           this.Field2759[this.Field2818][5] = 0.0F;
                        } else {
                           this.Field2759[this.Field2818][0] = var22.Field2759[var25][0];
                           this.Field2759[this.Field2818][1] = var22.Field2759[var25][1];
                           this.Field2759[this.Field2818][2] = var22.Field2759[var25][2];
                           this.Field2759[this.Field2818][3] = var22.Field2759[var25][3];
                           this.Field2759[this.Field2818][4] = var22.Field2759[var25][4];
                           this.Field2759[this.Field2818][5] = var22.Field2759[var25][5];
                        }
                     }

                     if (var4 && var22.Field2833 != null) {
                        int var27 = var25 < var22.Field2833.length ? var22.Field2833[var25] : 0;
                        this.Field2833[this.Field2818] = var27;
                     }

                     if (var5) {
                        if (var22.Field2834 != null) {
                           this.Field2834[this.Field2818] = var22.Field2834[var25];
                        } else {
                           this.Field2834[this.Field2818] = var22.Field2837;
                        }
                     }

                     if (var6 && var22.Field2835 != null) {
                        this.Field2835[this.Field2818] = var22.Field2835[var25];
                     }

                     if (var8) {
                        if (var22.Field2776 == null) {
                           this.Field2776[this.Field2818] = 0;
                        } else {
                           this.Field2776[this.Field2818] = var22.Field2776[var25];
                        }
                     }

                     if (var9) {
                        if (var22.Field2852 == null) {
                           this.Field2852[this.Field2818] = 0;
                        } else {
                           this.Field2852[this.Field2818] = var22.Field2852[var25];
                        }
                     }

                     this.Field2819[this.Field2818] = this.Method14479(var22, 0, var22.Field2819[var25]);
                     this.Field2820[this.Field2818] = this.Method14479(var22, 0, var22.Field2820[var25]);
                     this.Field2821[this.Field2818] = this.Method14479(var22, 0, var22.Field2821[var25]);
                     this.Field2836[this.Field2818] = var22.Field2836[var25];
                     if (var22.Field2830 != null) {
                        this.Field2830[this.Field2818] = var22.Field2830[var25];
                        this.Field2831[this.Field2818] = var22.Field2831[var25];
                        this.Field2832[this.Field2818] = var22.Field2832[var25];
                     }

                     ++this.Field2818;
                  }
               }
            }
         }

         int var23 = 0;
         if (this.Field2774 != null) {
            this.Field2838 = 0;

            for(var25 = 0; var25 != var1; ++var25) {
               Model var17;
               if ((var17 = var2[var25]) != null) {
                  int var18;
                  if (var7 || var4) {
                     for(var18 = 0; var18 < var17.Field2818; ++var18) {
                        if (var7) {
                           int var19 = this.Field2838;
                           int var20 = var17.Field2775 != null && ~var17.Field2775[var18] != 0 ? var17.Field2775[var18] : 0;
                           int var21;
                           if (var4 && var17.Field2833 != null && (var21 = var17.Field2833[var18]) > 3) {
                              var20 += (var21 & 255) >> 2;
                           }

                           this.Field2775[var23++] = var19 + var20;
                        }
                     }
                  }

                  for(var18 = 0; var18 != var17.Field2838; ++var18) {
                     if (var17.Field2774 != null) {
                        this.Field2774[this.Field2838] = var17.Field2774[var18];
                     }

                     if (this.Field2839 != null && var17.Field2839.length > 0 && this.Field2838 < this.Field2839.length) {
                        this.Field2839[this.Field2838] = var17.Field2839[var18];
                        this.Field2840[this.Field2838] = var17.Field2840[var18];
                        this.Field2841[this.Field2838] = var17.Field2841[var18];
                     }

                     if (this.Field2827 != null && var17.Field2827 != null) {
                        this.Field2827[this.Field2838] = var17.Field2827[var18];
                        this.Field2826[this.Field2838] = var17.Field2826[var18];
                        this.Field2825[this.Field2838] = var17.Field2825[var18];
                        this.Field2822[this.Field2838] = var17.Field2822[var18];
                        this.Field2824[this.Field2838] = var17.Field2824[var18];
                        this.Field2823[this.Field2838] = var17.Field2823[var18];
                     }

                     ++this.Field2838;
                  }
               }
            }
         }

         this.Field2827 = null;
         this.Field2823 = null;
         this.Field2825 = null;
         this.Field2822 = null;
         this.Field2824 = null;
         this.Field2826 = null;
         this.Field2828 = null;
         this.Field2829 = null;
      }
   }

   public Model(Model[] var1) {
      this(var1.length, var1, true);
   }

   public Model(boolean var1, boolean var2, boolean var3, boolean var4, Model var5, int var6) {
      this(var1, var2, var3, var5, 0, 0, -1L, 1);
   }

   public Model(boolean var1, boolean var2, boolean var3, Model var4, int var5, int var6, long var7, int var9) {
      this.Field2745 = GraphicsDisplay.Field2678;
      this.Field2750 = true;
      this.Field2751 = 0;
      this.Field2753 = false;
      this.Field2754 = 0;
      this.Field2755 = 100;
      this.Field2756 = false;
      this.Field2757 = false;
      this.Field2758 = false;
      this.Field2759 = null;
      this.Field2760 = 0;
      this.Field2762 = new LinkedList();
      this.Field2765 = false;
      this.Field2766 = false;
      this.Field2767 = false;
      this.Field2768 = 0;
      this.Field2769 = 0.0F;
      this.Field2773 = false;
      this.Field2774 = null;
      this.Field2775 = null;
      this.Field2776 = null;
      this.Field2777 = 0;
      this.Field2778 = 0;
      this.Field2786 = null;
      this.Field2789 = 1.0F;
      this.Field2790 = 1.0F;
      this.Field2791 = 1.0F;
      this.Field2792 = 0;
      this.Field2793 = 0;
      this.Field2794 = 0;
      this.Field2812 = -1;
      this.Field2813 = false;
      this.Field2884 = null;
      this.Field2885 = 0;
      this.Field2886 = null;
      this.Field2887 = null;
      this.Field2888 = 0;
      if (var4 != null) {
         this.Field2814 = true;
         this.Field2855 = false;
         ++Field2815;
         this.Field2818 = var4.Field2818;
         this.Field2838 = var4.Field2838;
         this.Field2756 = var4.Field2756;
         this.Field2757 = var4.Field2757;
         this.Field2758 = var4.Field2758;
         if (var7 == 0L || this.Method14485(var4, var5, var6, var7, var9)) {
            this.Field2817 = var4.Field2885;
            this.Method14528(var4.Field2886);
            int var10;
            if (!var2 && var4.Field2776 != null) {
               this.Field2776 = new int[this.Field2818];

               for(var10 = 0; var10 < this.Field2818; ++var10) {
                  this.Field2776[var10] = var4.Field2776[var10];
               }
            } else {
               this.Field2776 = var4.Field2776;
            }

            if (var1) {
               this.Field2836 = var4.Field2836;
               this.Field2830 = var4.Field2830;
               this.Field2831 = var4.Field2831;
               this.Field2832 = var4.Field2832;
            } else {
               this.Field2836 = new int[this.Field2818];
               if (var4.Field2830 != null) {
                  this.Field2830 = new int[this.Field2818];
                  this.Field2831 = new int[this.Field2818];
                  this.Field2832 = new int[this.Field2818];
               }

               for(var10 = 0; var10 < this.Field2818; ++var10) {
                  this.Field2836[var10] = var4.Field2836[var10];
                  if (var4.Field2830 != null) {
                     this.Field2830[var10] = var4.Field2830[var10];
                     this.Field2831[var10] = var4.Field2831[var10];
                     this.Field2832[var10] = var4.Field2832[var10];
                  }
               }
            }

            if (var3) {
               this.Field2835 = var4.Field2835;
            } else {
               this.Field2835 = new int[this.Field2818];
               if (var4.Field2835 == null) {
                  for(var10 = 0; var10 < this.Field2818; ++var10) {
                     this.Field2835[var10] = 0;
                  }
               } else {
                  for(var10 = 0; var10 < this.Field2818; ++var10) {
                     this.Field2835[var10] = var4.Field2835[var10];
                  }
               }
            }

            this.Field2759 = var4.Field2759;
            this.Field2851 = var4.Field2851;
            this.Field2852 = var4.Field2852;
            this.Field2853 = var4.Field2853;
            this.Field2854 = var4.Field2854;
            this.Field2833 = var4.Field2833;
            this.Field2819 = var4.Field2819;
            this.Field2820 = var4.Field2820;
            this.Field2821 = var4.Field2821;
            this.Field2834 = var4.Field2834;
            this.Field2775 = var4.Field2775;
            this.Field2774 = var4.Field2774;
            this.Field2837 = var4.Field2837;
            this.Method14478(var4, false);
            this.Field2839 = var4.Field2839;
            this.Field2840 = var4.Field2840;
            this.Field2841 = var4.Field2841;
            this.Field2828 = var4.Field2828;
            this.Field2829 = var4.Field2829;
            this.Field2827 = var4.Field2827;
            this.Field2825 = var4.Field2825;
            this.Field2826 = var4.Field2826;
            this.Field2822 = var4.Field2822;
            this.Field2824 = var4.Field2824;
            this.Field2823 = var4.Field2823;
         }
      }
   }

   public Model(boolean var1, boolean var2, Model var3) {
      this(1,new Model[1],true);
      Model[] var5 = new Model[1];
      var5[0] = var3;

      //this(1, var5, true);
      this.Field2814 = true;
      this.Field2855 = false;
      ++Field2815;
      this.Field2817 = var3.Field2817;
      this.Field2818 = var3.Field2818;
      this.Field2838 = var3.Field2838;
      this.Field2756 = var3.Field2756;
      this.Field2757 = var3.Field2757;
      this.Field2758 = var3.Field2758;
      this.Method14528(var3.Field2886);
      this.Field2776 = var3.Field2776;
      if (var2) {
         this.Field2830 = new int[this.Field2818];
         this.Field2831 = new int[this.Field2818];
         this.Field2832 = new int[this.Field2818];

         int var6;
         for(var6 = 0; var6 < this.Field2818; ++var6) {
            this.Field2830[var6] = var3.Field2830[var6];
            this.Field2831[var6] = var3.Field2831[var6];
            this.Field2832[var6] = var3.Field2832[var6];
         }

         this.Field2833 = new int[this.Field2818];
         if (var3.Field2833 == null) {
            for(var6 = 0; var6 < this.Field2818; ++var6) {
               this.Field2833[var6] = 0;
            }
         } else {
            for(var6 = 0; var6 < this.Field2818; ++var6) {
               this.Field2833[var6] = var3.Field2833[var6];
            }
         }

         super.Field10126 = new Class445[this.Field2817];

         for(var6 = 0; var6 < this.Field2817; ++var6) {
            Class445 var7 = super.Field10126[var6] = new Class445();
            Class445 var4 = var3.Field10126[var6];
            var7.Field9255 = var4.Field9255;
            var7.Field9256 = var4.Field9256;
            var7.Field9257 = var4.Field9257;
            var7.Field9258 = var4.Field9258;
         }

         this.Field2856 = var3.Field2856;
      } else {
         this.Field2830 = var3.Field2830;
         this.Field2831 = var3.Field2831;
         this.Field2832 = var3.Field2832;
         this.Field2833 = var3.Field2833;
      }

      this.Field2836 = var3.Field2836;
      this.Field2835 = var3.Field2835;
      this.Field2834 = var3.Field2834;
      this.Field2775 = var3.Field2775;
      this.Field2774 = var3.Field2774;
      this.Field2837 = var3.Field2837;
      this.Method14478(var3, false);
      this.Field2819 = var3.Field2819;
      this.Field2820 = var3.Field2820;
      this.Field2821 = var3.Field2821;
      this.Field2839 = var3.Field2839;
      this.Field2840 = var3.Field2840;
      this.Field2841 = var3.Field2841;
      super.Field10127 = var3.Field10127;
      this.Field2846 = var3.Field2846;
      this.Field2849 = var3.Field2849;
      this.Field2848 = var3.Field2848;
      this.Field2842 = var3.Field2842;
      this.Field2844 = var3.Field2844;
      this.Field2845 = var3.Field2845;
      this.Field2843 = var3.Field2843;
      this.Field2828 = var3.Field2828;
      this.Field2829 = var3.Field2829;
      this.Field2825 = var3.Field2825;
      this.Field2826 = var3.Field2826;
      this.Field2827 = var3.Field2827;
      this.Field2822 = var3.Field2822;
      this.Field2823 = var3.Field2823;
      this.Field2824 = var3.Field2824;
   }

   private void Method14478(Model var1, boolean var2) {
      if (var1.Field2884 != null) {
         if (var2) {
            this.Field2884 = var1.Field2884;
            return;
         }

         if (this.Field2884 == null) {
            this.Field2884 = new HashMap();
         }

         this.Field2884.putAll(var1.Field2884);
      }

   }

   private final int Method14479(Model var1, int var2, int var3) {
      float var9 = var1.Field2887[var3];
      float var4 = var1.Method14530(var3);
      float var5 = var1.Method14532(var3);

      for(int var6 = 0; this.Field2817 > var6; ++var6) {
         if (this.Field2887[var6] == var9 && this.Method14530(var6) == var4 && var5 == this.Method14532(var6)) {
            return var6;
         }
      }

      Integer var10;
      if (var1.Field2884 != null && (var10 = (Integer)var1.Field2884.get(var3)) != null) {
         this.Field2884.put(this.Field2817, var10);
      }

      int var8 = this.Field2817;
      this.Field2887[var8] = var9;
      this.Method14531(this.Field2817, var4);
      this.Method14533(this.Field2817, var5);
      this.Field2851[this.Field2817] = var1.Field2851 != null ? var1.Field2851[var3] : -1;
      return this.Field2817++;
   }

   public final void Method14480(int var1) {
      super.Field10127 = 0;
      this.Field2846 = 0;
      this.Field2847 = 0;

      for(int var2 = 0; var2 < this.Field2817; var2 += 8) {
         int var3 = (int)((double)(this.Field2887[var2] * this.Field2789) * 0.25D);
         int var4 = (int)((double)(this.Method14530(var2) * this.Field2790) * 0.25D);
         int var5 = (int)((double)(this.Method14532(var2) * this.Field2791) * 0.25D);
         if (-var4 > super.Field10127) {
            super.Field10127 = -var4;
         }

         if (var4 > this.Field2847) {
            this.Field2847 = var4;
         }

         if ((var3 = var3 * var3 + var5 * var5) > this.Field2846) {
            this.Field2846 = var3;
         }
      }

      this.Field2846 = (int)(Math.sqrt((double)this.Field2846) + 0.99D);
      this.Field2849 = (int)(Math.sqrt((double)(this.Field2846 * this.Field2846 + super.Field10127 * super.Field10127)) + 0.99D);
      this.Field2848 = this.Field2849 + (int)(Math.sqrt((double)(this.Field2846 * this.Field2846 + this.Field2847 * this.Field2847)) + 0.99D);
      if (var1 >= 8349 && var1 <= 8366) {
         super.Field10127 = 450;
      }

   }

   private void Method14481() {
      super.Field10127 = 0;
      this.Field2847 = 0;
      byte var1 = 1;
      if (this.Field2817 > 250) {
         var1 = 4;
      } else if (this.Field2817 > 100) {
         var1 = 2;
      }

      for(int var2 = 0; var2 < this.Field2817; var2 += var1) {
         int var3;
         if (-(var3 = (int)(this.Method14530(var2) * 0.25F)) > super.Field10127) {
            super.Field10127 = -var3;
         }

         if (var3 > this.Field2847) {
            this.Field2847 = var3;
         }
      }

      this.Field2849 = (int)(Math.sqrt((double)(this.Field2846 * this.Field2846 + super.Field10127 * super.Field10127)) + 0.99D);
      this.Field2848 = this.Field2849 + (int)(Math.sqrt((double)(this.Field2846 * this.Field2846 + this.Field2847 * this.Field2847)) + 0.99D);
      this.Field10127 /= 4;
      this.Field2846 /= 4;
   }

   public final void Method14482() {
      int[] var1;
      int var2;
      int var3;
      int var4;
      if (this.Field2851 != null) {
         var1 = new int[256];
         var2 = 0;

         for(var3 = 0; var3 < this.Field2817; ++var3) {
            if ((var4 = this.Field2851[var3]) >= 0 && var4 < 256) {
               ++var1[var4];
               if (var4 > var2) {
                  var2 = var4;
               }
            }
         }

         this.Field2853 = new int[var2 + 1][];

         for(var3 = 0; var3 <= var2; ++var3) {
            this.Field2853[var3] = new int[var1[var3]];
            var1[var3] = 0;
         }

         for(var3 = 0; var3 < this.Field2817; ++var3) {
            if ((var4 = this.Field2851[var3]) >= 0) {
               this.Field2853[var4][var1[var4]++] = var3;
            }
         }
      }

      if (this.Field2852 != null) {
         var1 = new int[256];
         var2 = 0;

         for(var3 = 0; var3 < this.Field2818; ++var3) {
            if ((var4 = this.Field2852[var3]) >= 0 && var4 < 256) {
               ++var1[var4];
               if (var4 > var2) {
                  var2 = var4;
               }
            }
         }

         this.Field2854 = new int[var2 + 1][];

         for(var3 = 0; var3 <= var2; ++var3) {
            this.Field2854[var3] = new int[var1[var3]];
            var1[var3] = 0;
         }

         for(var3 = 0; var3 < this.Field2818; this.Field2854[var4][var1[var4]++] = var3++) {
            var4 = this.Field2852[var3];
         }
      }

   }

   public static Model Method14483(Model var0, int var1, int var2, long var3, int var5) {
      if (Field2787 == null) {
         Field2787 = new Model[7];

         for(int var6 = 0; var6 < Field2787.length; ++var6) {
            Field2787[var6] = new Model();
         }
      }

      Model var7;
      Model var13;
      (var7 = var13 = Field2787[var5]).Field2756 = false;
      var7.Field2757 = false;
      var7.Field2758 = false;
      var7.Field2884 = null;
      var7.Field2750 = true;
      var7.Field10125 = false;
      var7.Field2765 = false;
      var7.Field2766 = false;
      var7.Field2760 = 0;
      var7.Method14500();
      var7.Method14499();
      var7.Field10118 = var7.Field10119 = var7.Field10120 = 0; //9971
      if (!Client.normalMem) {
         var7.Field2835 = null;
      }

      if (var0.Field2853 == null) {
         var0.Method14482();
      }

      var0 = var0;
      var7 = var13;
      var13.Field2849 = var0.Field2849;
      var13.Field2848 = var0.Field2848;
      var13.Field10127 = var0.Field10127;
      var13.Field2777 = var0.Field2777;
      var13.Field2846 = var0.Field2846;
      var13.Field2855 = var0.Field2855;
      var13.Field2756 = var0.Field2756;
      var13.Field2757 = var0.Field2757;
      var13.Field2758 = var0.Field2758;
      if (var13.Method14485(var0, var1, var2, var3, var5)) {
         if (var1 == 0 && var2 == 0) {
            var13.Field2750 = false;
         } else {
            var13.Field2817 = var0.Field2885;
            var13.Field2818 = var0.Field2818;
            var13.Field2838 = var0.Field2838;
            var13.Method14528(var0.Field2886);
            if (var13.Field2835 == null || var13.Field2835.length < var13.Field2818) {
               var13.Field2835 = new int[var13.Field2818];
            }

            if (var5 == 3) {
               var13.Field2836 = new int[var13.Field2818];

               for(var1 = 0; var1 < var0.Field2836.length; ++var1) {
                  var7.Field2836[var1] = var0.Field2836[var1];
               }
            } else {
               var13.Field2830 = var0.Field2830;
               var13.Field2831 = var0.Field2831;
               var13.Field2832 = var0.Field2832;
            }

            if (var0.Field2835 != null) {
               System.arraycopy(var0.Field2835, 0, var7.Field2835, 0, var7.Field2818);
            }

            var7.Field2759 = var0.Field2759;
            var7.Field2833 = var0.Field2833;
            var7.Field2836 = var0.Field2836;
            var7.Field2834 = var0.Field2834;
            var7.Field2776 = var0.Field2776;
            var7.Field2775 = var0.Field2775;
            var7.Field2774 = var0.Field2774;
            var7.Field2837 = var0.Field2837;
            var7.Method14478(var0, true);
            var7.Field2854 = var0.Field2854;
            var7.Field2852 = var0.Field2852;
            var7.Field2853 = var0.Field2853;
            var7.Field2851 = var0.Field2851;
            var7.Field2819 = var0.Field2819;
            var7.Field2820 = var0.Field2820;
            var7.Field2821 = var0.Field2821;
            var7.Field2839 = var0.Field2839;
            var7.Field2840 = var0.Field2840;
            var7.Field2841 = var0.Field2841;
            var7.Field2828 = var0.Field2828;
            var7.Field2829 = var0.Field2829;
            var7.Field2825 = var0.Field2825;
            var7.Field2826 = var0.Field2826;
            var7.Field2827 = var0.Field2827;
            var7.Field2822 = var0.Field2822;
            var7.Field2823 = var0.Field2823;
            var7.Field2824 = var0.Field2824;
            var7.Field2786 = var0.Field2786;
         }
      }

      return var13;
   }

   public final void Method14484(int[] var1, int var2, int var3, int var4) {
      if (this.Field2750) {
         if (var3 != -1) {
            if (var1 != null && var2 != -1) {
               Class518 var5;
               if ((var5 = Class518.Method8351(var3)) != null) {
                  Class518 var9;
                  if ((var9 = Class518.Method8351(var2)) == null) {
                     this.Method14520(var3, var4, false);
                  } else {
                     Class128 var10 = var5.Field10086;
                     Field2877 = 0.0F;
                     Field2878 = 0.0F;
                     Field2879 = 0.0F;
                     byte var11 = 0;
                     var4 = var11 + 1;
                     int var6 = var1[0];

                     int var7;
                     int var8;
                     for(var7 = 0; var7 < var5.Field10087; ++var7) {
                        for(var8 = var5.Field10088[var7]; var8 > var6; var6 = var1[var4++]) {
                           ;
                        }

                        if (var8 != var6 || var10.Field10041[var8] == 0) {
                           this.Method14486(var10.Field10041[var8], var10.Field10042[var8], var5.Field10089[var7], var5.Field10090[var7], var5.Field10091[var7]);
                        }
                     }

                     Field2877 = 0.0F;
                     Field2878 = 0.0F;
                     Field2879 = 0.0F;
                     var11 = 0;
                     var4 = var11 + 1;
                     var6 = var1[0];

                     for(var7 = 0; var7 < var9.Field10087; ++var7) {
                        for(var8 = var9.Field10088[var7]; var8 > var6; var6 = var1[var4++]) {
                           ;
                        }

                        if (var8 == var6 || var10.Field10041[var8] == 0) {
                           this.Method14486(var10.Field10041[var8], var10.Field10042[var8], var9.Field10089[var7], var9.Field10090[var7], var9.Field10091[var7]);
                        }
                     }

                  }
               }
            } else {
               this.Method14520(var3, var4, false);
            }
         }
      }
   }

   private boolean Method14485(Model var1, int var2, int var3, long var4, int var6) {
      if (GraphicsDisplay.Field2678 && GraphicsDisplay.Field2667 && Client.Field12104) {
         if (var4 == -1L) {
            this.Field2750 = true;
            return true;
         } else {
            if (var6 != 2) {
               var2 = var2 - 6 >> 7;
               var3 = var3 - 6 >> 7;
            }

            long var17 = var4;
            Class869 var19;
            if ((var19 = (Class869)Field2747.get(var4)) == null || var19.Method14546() != var17) {
               var19 = new Class869(var17);
               Field2747.put(var17, var19);
            }

            if (var19.Field2645 == Client.currentTime) {
               this.Field2750 = false;
               return false;
            } else {
               var19.Field2645 = Client.currentTime;
               boolean var5 = Client.Field12219 != null || Client.Field12251 || !Client.Field12218.Method8825();
               double var9 = (double) Client.Field12328 * 0.125D + (double) Client.session_player_count * 0.75D;
               double var11 = (double)((int)((Client.Method13203(var2, var3) + (double)(var5 ? 100 : 0) + var9) * 10.0D)) / 10.0D;
               double var13 = Math.random() * 0.1D + var11 * 0.02D;
               double var15 = var6 == 5 ? 0.0D : 0.85D;
               if (var13 > var15) {
                  var13 = var15;
               }

               if (var13 > 0.05D && var1 != null) {
                  var19.Field2646 += var13;
                  if (var19.Field2646 >= 1.0D) {
                     var19.Field2646 -= (double)((int)var19.Field2646);
                     this.Field2750 = false;
                     return false;
                  }
               }

               this.Field2750 = true;
               return true;
            }
         }
      } else {
         this.Field2750 = true;
         return true;
      }
   }

   private void Method14486(int var1, int[] var2, int var3, int var4, int var5) {
      if (this.Field2750) {
         int var6 = var2.length;
         int var7;
         int var10;
         int var11;
         if (var1 == 0) {
            float var17 = 0.0F;
            Field2877 = 0.0F;
            Field2878 = 0.0F;
            Field2879 = 0.0F;

            for(var7 = 0; var7 < var6; ++var7) {
               int var18;
               if ((var18 = var2[var7]) < this.Field2853.length) {
                  int[] var19 = this.Field2853[var18];

                  for(var10 = 0; var10 < var19.length; ++var10) {
                     var11 = var19[var10];
                     Field2877 += this.Field2887[var11];
                     Field2878 += this.Method14530(var11);
                     Field2879 += this.Method14532(var11);
                     ++var17;
                  }
               }
            }

            if (var17 > 0.0F) {
               Field2877 = Field2877 / var17 + (float)var3;
               Field2878 = Field2878 / var17 + (float)var4;
               Field2879 = Field2879 / var17 + (float)var5;
            } else {
               Field2877 = (float)var3;
               Field2878 = (float)var4;
               Field2879 = (float)var5;
            }
         } else {
            int[] var8;
            int var9;
            float var12;
            if (var1 == 1) {
               for(var1 = 0; var1 < var6; ++var1) {
                  if ((var7 = var2[var1]) < this.Field2853.length) {
                     var8 = this.Field2853[var7];

                     for(var9 = 0; var9 < var8.length; ++var9) {
                        var10 = var8[var9];
                        var12 = this.Field2887[var10] + (float)var3 * 4.0F;
                        this.Field2887[var10] = var12;
                        this.Method14531(var10, this.Method14530(var10) + (float)var4 * 4.0F);
                        this.Method14533(var10, this.Method14532(var10) + (float)var5 * 4.0F);
                     }
                  }
               }

            } else if (var1 == 2) {
               for(var1 = 0; var1 < var6; ++var1) {
                  if ((var7 = var2[var1]) < this.Field2853.length) {
                     var8 = this.Field2853[var7];

                     for(var9 = 0; var9 < var8.length; ++var9) {
                        var10 = var8[var9];
                        var12 = this.Field2887[var10] - Field2877;
                        this.Field2887[var10] = var12;
                        this.Method14531(var10, this.Method14530(var10) - Field2878);
                        this.Method14533(var10, this.Method14532(var10) - Field2879);
                        var11 = var3 << 3 & 2040;
                        var7 = var4 << 3 & 2040;
                        float var13;
                        float var14;
                        int var20;
                        if ((var20 = var5 << 3 & 2040) != 0) {
                           var13 = (float) Rasterizer.Field9959[var20];
                           var12 = (float) Rasterizer.Field9960[var20];
                           var14 = (float)((int)(this.Method14530(var10) * var13 + this.Field2887[var10] * var12)) / 65535.0F;
                           this.Method14531(var10, (float)((int)(this.Method14530(var10) * var12 - this.Field2887[var10] * var13)) / 65535.0F);
                           this.Field2887[var10] = var14;
                        }

                        if (var11 != 0) {
                           var13 = (float) Rasterizer.Field9959[var11];
                           var12 = (float) Rasterizer.Field9960[var11];
                           var14 = (float)((int)(this.Method14530(var10) * var12 - this.Method14532(var10) * var13)) / 65535.0F;
                           this.Method14533(var10, (float)((int)(this.Method14530(var10) * var13 + this.Method14532(var10) * var12)) / 65535.0F);
                           this.Method14531(var10, var14);
                        }

                        if (var7 != 0) {
                           var13 = (float) Rasterizer.Field9959[var7];
                           var12 = (float) Rasterizer.Field9960[var7];
                           var14 = (float)((int)(this.Method14532(var10) * var13 + this.Field2887[var10] * var12)) / 65535.0F;
                           this.Method14533(var10, (float)((int)(this.Method14532(var10) * var12 - this.Field2887[var10] * var13)) / 65535.0F);
                           this.Field2887[var10] = var14;
                        }

                        var12 = this.Field2887[var10] + Field2877;
                        this.Field2887[var10] = var12;
                        this.Method14531(var10, this.Method14530(var10) + Field2878);
                        this.Method14533(var10, this.Method14532(var10) + Field2879);
                     }
                  }
               }

            } else if (var1 == 3) {
               for(var1 = 0; var1 < var6; ++var1) {
                  if ((var7 = var2[var1]) < this.Field2853.length) {
                     var8 = this.Field2853[var7];

                     for(var9 = 0; var9 < var8.length; ++var9) {
                        var10 = var8[var9];
                        var12 = this.Field2887[var10] - Field2877;
                        this.Field2887[var10] = var12;
                        this.Method14531(var10, this.Method14530(var10) - Field2878);
                        this.Method14533(var10, this.Method14532(var10) - Field2879);
                        var12 = this.Field2887[var10] * (float)var3 / 128.0F;
                        this.Field2887[var10] = var12;
                        this.Method14531(var10, this.Method14530(var10) * (float)var4 / 128.0F);
                        this.Method14533(var10, this.Method14532(var10) * (float)var5 / 128.0F);
                        var12 = this.Field2887[var10] + Field2877;
                        this.Field2887[var10] = var12;
                        this.Method14531(var10, this.Method14530(var10) + Field2878);
                        this.Method14533(var10, this.Method14532(var10) + Field2879);
                     }
                  }
               }

            } else if (var1 == 5 && this.Field2854 != null && this.Field2835 != null) {
               for(var1 = 0; var1 < var6; ++var1) {
                  if ((var7 = var2[var1]) < this.Field2854.length) {
                     var8 = this.Field2854[var7];

                     for(var9 = 0; var9 < var8.length; ++var9) {
                        var10 = var8[var9] & '\uffff';
                        this.Field2835[var10] += var3 << 3;
                        if (this.Field2835[var10] < 0) {
                           this.Field2835[var10] = 0;
                        } else if (this.Field2835[var10] > 255) {
                           this.Field2835[var10] = 255;
                        }
                     }
                  }
               }

            }
         }
      }
   }

   public final void Method14487() {
      for(int var1 = 0; var1 < this.Field2817; ++var1) {
         float var2 = this.Field2887[var1];
         float var5 = this.Method14532(var1);
         this.Field2887[var1] = var5;
         this.Method14533(var1, -var2);
      }

   }

   public final void Method14488(int var1) {
      float var2 = (float) Rasterizer.Field9959[var1];
      float var5 = (float) Rasterizer.Field9960[var1];

      for(int var3 = 0; var3 < this.Field2817; ++var3) {
         float var4 = (float)((int)(this.Method14530(var3) * var2 - this.Method14532(var3) * var5) >> 16);
         this.Method14533(var3, (float)((int)(this.Method14530(var3) * var5 + this.Method14532(var3) * var2) >> 16));
         this.Method14531(var3, var4);
      }

   }

   public final void Method14489(int var1) {
      float var8 = (float) Rasterizer.Field9959[1024];
      float var2 = (float) Rasterizer.Field9960[1024];

      for(int var3 = 0; var3 < this.Field2817; ++var3) {
         float var4 = (float)((int)(this.Method14530(var3) * var8 - this.Field2887[var3] * var2) >> 16);
         float var7 = (float)((int)(this.Method14530(var3) * var2 + this.Field2887[var3] * var8) >> 16);
         this.Field2887[var3] = var7;
         this.Method14531(var3, var4);
      }

   }

   public final void Method14490(int var1) {
      float var2 = (float) Rasterizer.Field9959[var1];
      float var8 = (float) Rasterizer.Field9960[var1];

      for(int var3 = 0; var3 < this.Field2817; ++var3) {
         float var4 = (float)((int)(this.Method14532(var3) * var2 - this.Field2887[var3] * var8) >> 16);
         float var7 = (float)((int)(this.Method14532(var3) * var8 + this.Field2887[var3] * var2) >> 16);
         this.Field2887[var3] = var7;
         this.Method14533(var3, var4);
      }

   }

   public final void Method14491(int var1) {
      float var2 = (float) Rasterizer.Field9959[var1];
      float var5 = (float) Rasterizer.Field9960[var1];

      for(int var3 = 0; var3 < this.Field2817; ++var3) {
         float var4 = (float)((int)(this.Method14530(var3) * var5 - this.Method14532(var3) * var2) >> 16);
         this.Method14533(var3, (float)((int)(this.Method14530(var3) * var2 + this.Method14532(var3) * var5) >> 16));
         this.Method14531(var3, var4);
      }

   }

   private void Method14492(float var1, float var2, float var3) {
      for(int var4 = 0; var4 < this.Field2817; ++var4) {
         float var7 = (float)((int)(var1 * this.Field2887[var4]));
         this.Field2887[var4] = var7;
         this.Method14531(var4, (float)((int)(var2 * this.Method14530(var4))));
         this.Method14533(var4, (float)((int)(var3 * this.Method14532(var4))));
      }

   }

   public final void Method14493(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.Field2817; ++var4) {
         float var7 = this.Field2887[var4] + (float)(var1 << 2);
         this.Field2887[var4] = var7;
         this.Method14531(var4, this.Method14530(var4) + (float)(var2 << 2));
         this.Method14533(var4, this.Method14532(var4) + (float)(var3 << 2));
      }

   }

   public final void Method14494(int var1, int var2) {
      if (this.Field2776 != null) {
         for(int var3 = 0; var3 < this.Field2776.length; ++var3) {
            if ((this.Field2776[var3] & '\uffff') == var1) {
               this.Field2776[var3] = var2;
            }
         }

      }
   }

   public final void recolor(int var1, int var2) {
      if (this.Field2836 != null) {
         for(int var3 = 0; var3 < this.Field2836.length; ++var3) {
            if ((this.Field2836[var3] & '\uffff') == (var1 & '\uffff')) {
               this.Field2836[var3] = var2;
            }
         }

      }
   }

   public final void Method14496() {
      int var1;
      for(var1 = 0; var1 < this.Field2817; ++var1) {
         this.Method14533(var1, -this.Method14532(var1));
      }

      for(var1 = 0; var1 < this.Field2818; ++var1) {
         int var2 = this.Field2819[var1];
         this.Field2819[var1] = this.Field2821[var1];
         this.Field2821[var1] = var2;
         float var8 = this.Field2759[var1][0];
         float var3 = this.Field2759[var1][1];
         float var4 = this.Field2759[var1][2];
         float var5 = this.Field2759[var1][3];
         float var6 = this.Field2759[var1][4];
         float var7 = this.Field2759[var1][5];
         this.Field2759[var1][0] = var6;
         this.Field2759[var1][1] = var7;
         this.Field2759[var1][2] = var4;
         this.Field2759[var1][3] = var5;
         this.Field2759[var1][4] = var8;
         this.Field2759[var1][5] = var3;
      }

   }

   public final void Method14497(int var1, int var2, int var3) {
      if (GraphicsDisplay.Field2678 && GraphicsDisplay.Field2667 && Field2744) {
         this.Field2792 += var1;
         this.Field2793 += var3;
         this.Field2794 += var2;
      } else {
         this.Method14493(var1, var2, var3);
      }
   }

   public final void Method14498(float var1, float var2, float var3) {
      if (GraphicsDisplay.Field2678 && GraphicsDisplay.Field2667 && Field2744) {
         this.Field2789 *= var1 / 128.0F;
         this.Field2790 *= var2 / 128.0F;
         this.Field2791 *= var3 / 128.0F;
      } else {
         this.Method14501(var1, var2, var3);
      }
   }

   private void Method14499() {
      this.Field2792 = this.Field2793 = this.Field2794 = 0;
   }

   public final void Method14500() {
      this.Field2789 = this.Field2790 = this.Field2791 = 1.0F;
   }

   public final void Method14501(float var1, float var2, float var3) {
      if (var1 != 128.0F || var2 != 128.0F || var3 != 128.0F) {
         for(int var4 = 0; var4 < this.Field2817; ++var4) {
            float var7 = this.Field2887[var4] * var1 / 128.0F;
            this.Field2887[var4] = var7;
            this.Method14531(var4, this.Method14530(var4) * var3 / 128.0F);
            this.Method14533(var4, this.Method14532(var4) * var2 / 128.0F);
         }

      }
   }

   public final void Method14502(int var1, int var2, int var3, int var4, int var5, boolean var6) {
      int var7 = (int)Math.sqrt((double)(var3 * var3 + var4 * var4 + var5 * var5));
      var2 = var2 * var7 >> 8;
      if (this.Field2830 == null) {
         this.Field2830 = new int[this.Field2818];
         this.Field2831 = new int[this.Field2818];
         this.Field2832 = new int[this.Field2818];
      }

      if (super.Field10126 == null) {
         super.Field10126 = new Class445[this.Field2817];

         for(var7 = 0; var7 < this.Field2817; ++var7) {
            super.Field10126[var7] = new Class445();
         }
      }

      Class445 var20;
      for(var7 = 0; var7 < this.Field2818; ++var7) {
         int var8 = this.Field2819[var7];
         int var9 = this.Field2820[var7];
         int var10 = this.Field2821[var7];
         int var11 = (int)(this.Field2887[var9] - (float)((int)this.Field2887[var8]) + 1.0F) >> 2;
         int var12 = (int)(this.Method14530(var9) - (float)((int)this.Method14530(var8)) + 1.0F) >> 2;
         int var13 = (int)(this.Method14532(var9) - (float)((int)this.Method14532(var8)) + 1.0F) >> 2;
         int var14 = (int)(this.Field2887[var10] - (float)((int)this.Field2887[var8]) + 1.0F) >> 2;
         int var15 = (int)(this.Method14530(var10) - (float)((int)this.Method14530(var8)) + 1.0F) >> 2;
         int var16 = (int)(this.Method14532(var10) - (float)((int)this.Method14532(var8)) + 1.0F) >> 2;
         int var17 = var12 * var16 - var15 * var13;
         var13 = var13 * var14 - var16 * var11;

         for(var11 = var11 * var15 - var14 * var12; var17 > 8192 || var13 > 8192 || var11 > 8192 || var17 < -8192 || var13 < -8192 || var11 < -8192; var11 >>= 1) {
            var17 >>= 1;
            var13 >>= 1;
         }

         if ((var12 = (int)Math.sqrt((double)(var17 * var17 + var13 * var13 + var11 * var11))) <= 0) {
            var12 = 1;
         }

         var17 = (var17 << 8) / var12;
         var13 = (var13 << 8) / var12;
         var11 = (var11 << 8) / var12;
         if (this.Field2833 != null && (this.Field2833[var7] & 1) != 0) {
            var8 = var1 + (var3 * var17 + var4 * var13 + var5 * var11) / (var2 + var2 / 2);
            this.Field2830[var7] = Method14504(this.Field2836[var7], var8, 0);
         } else {
            Class445 var10000 = var20 = super.Field10126[var8];
            var10000.Field9255 += var17;
            var20.Field9256 += var13;
            var20.Field9257 += var11;
            ++var20.Field9258;
            var10000 = var20 = super.Field10126[var9];
            var10000.Field9255 += var17;
            var20.Field9256 += var13;
            var20.Field9257 += var11;
            ++var20.Field9258;
            var10000 = var20 = super.Field10126[var10];
            var10000.Field9255 += var17;
            var20.Field9256 += var13;
            var20.Field9257 += var11;
            ++var20.Field9258;
         }
      }

      if (var6) {
         this.Method14503(var1, var2, var3, var4, var5);
      } else {
         this.Field2856 = new Class445[this.Field2817];

         for(var7 = 0; var7 < this.Field2817; ++var7) {
            var20 = super.Field10126[var7];
            Class445 var21;
            (var21 = this.Field2856[var7] = new Class445()).Field9255 = var20.Field9255;
            var21.Field9256 = var20.Field9256;
            var21.Field9257 = var20.Field9257;
            var21.Field9258 = var20.Field9258;
         }
      }

      if (var6) {
         this.Method14480(-4);
      } else {
         boolean var18 = true;
         Model var19 = this;
         super.Field10127 = 0;
         this.Field2846 = 0;
         this.Field2847 = 0;
         this.Field2842 = 999999;
         this.Field2843 = -999999;
         this.Field2844 = -99999;
         this.Field2845 = 99999;

         for(var2 = 0; var2 < var19.Field2817; ++var2) {
            var3 = (int)var19.Field2887[var2];
            var4 = (int)var19.Method14530(var2);
            var5 = (int)var19.Method14532(var2);
            if (var3 < var19.Field2842) {
               var19.Field2842 = var3;
            }

            if (var3 > var19.Field2843) {
               var19.Field2843 = var3;
            }

            if (var5 < var19.Field2845) {
               var19.Field2845 = var5;
            }

            if (var5 > var19.Field2844) {
               var19.Field2844 = var5;
            }

            if (-var4 > var19.Field10127) {
               var19.Field10127 = -var4;
            }

            if (var4 > var19.Field2847) {
               var19.Field2847 = var4;
            }

            if ((var3 = var3 * var3 + var5 * var5) > var19.Field2846) {
               var19.Field2846 = var3;
            }
         }

         var19.Field2846 = (int)Math.sqrt((double)var19.Field2846);
         var19.Field2849 = (int)Math.sqrt((double)(var19.Field2846 * var19.Field2846 + var19.Field10127 * var19.Field10127));
         var19.Field2848 = var19.Field2849 + (int)Math.sqrt((double)(var19.Field2846 * var19.Field2846 + var19.Field2847 * var19.Field2847));
      }
   }

   public final void Method14503(int var1, int var2, int var3, int var4, int var5) {
      for(int var6 = 0; var6 < this.Field2818; ++var6) {
         int var7 = this.Field2819[var6];
         int var8 = this.Field2820[var6];
         int var9 = this.Field2821[var6];
         int var10;
         Class445 var11;
         if (this.Field2833 == null) {
            var10 = this.Field2836[var6];
            var11 = super.Field10126[var7];
            var7 = var1 + (var3 * var11.Field9255 + var4 * var11.Field9256 + var5 * var11.Field9257) / (var2 * var11.Field9258);
            this.Field2830[var6] = Method14504(var10, var7, 0);
            var11 = super.Field10126[var8];
            var7 = var1 + (var3 * var11.Field9255 + var4 * var11.Field9256 + var5 * var11.Field9257) / (var2 * var11.Field9258);
            this.Field2831[var6] = Method14504(var10, var7, 0);
            var11 = super.Field10126[var9];
            var7 = var1 + (var3 * var11.Field9255 + var4 * var11.Field9256 + var5 * var11.Field9257) / (var2 * var11.Field9258);
            this.Field2832[var6] = Method14504(var10, var7, 0);
         } else if ((this.Field2833[var6] & 1) == 0) {
            var10 = this.Field2836[var6];
            var11 = super.Field10126[var7];
            var7 = var1 + (var3 * var11.Field9255 + var4 * var11.Field9256 + var5 * var11.Field9257) / (var2 * var11.Field9258);
            this.Field2830[var6] = Method14504(var10, var7, 0);
            var11 = super.Field10126[var8];
            var7 = var1 + (var3 * var11.Field9255 + var4 * var11.Field9256 + var5 * var11.Field9257) / (var2 * var11.Field9258);
            this.Field2831[var6] = Method14504(var10, var7, 0);
            var11 = super.Field10126[var9];
            var7 = var1 + (var3 * var11.Field9255 + var4 * var11.Field9256 + var5 * var11.Field9257) / (var2 * var11.Field9258);
            this.Field2832[var6] = Method14504(var10, var7, 0);
         }
      }

      super.Field10126 = null;
      this.Field2856 = null;
   }

   private static int Method14504(int var0, int var1, int var2) {
      if (var0 == 65535) {
         return 0;
      } else {
         if ((var1 = var1 * (var0 & 127) >> 7) < 2) {
            var1 = 2;
         } else if (var1 > 126) {
            var1 = 126;
         }

         return (var0 & 'ﾀ') + var1;
      }
   }

   public final List Method14505() {
      ArrayList var1 = new ArrayList();

      for(int var2 = 0; var2 < this.Field2818; ++var2) {
         int var3 = this.Field2836[var2] & '\uffff';
         if (var1.indexOf(var3) == -1) {
            var1.add(var3);
         }

         if (this.Field2830 != null) {
            var3 = this.Field2830[var2];
            if (var1.indexOf(var3) == -1) {
               var1.add(var3);
            }
         }

         if (this.Field2831 != null) {
            var3 = this.Field2831[var2];
            if (var1.indexOf(var3) == -1) {
               var1.add(var3);
            }
         }

         if (this.Field2832 != null) {
            var3 = this.Field2832[var2];
            if (var1.indexOf(var3) == -1) {
               var1.add(var3);
            }
         }
      }

      return var1;
   }

   public final List Method14506() {
      ArrayList var1 = new ArrayList();
      if (this.Field2776 == null) {
         return var1;
      } else {
         for(int var2 = 0; var2 < this.Field2818; ++var2) {
            int var3 = this.Field2776[var2];
            if (var1.indexOf(var3) == -1) {
               var1.add(var3);
            }
         }

         return var1;
      }
   }

   private void Method14507(int var1, int var2, boolean var3, long var4, boolean var6, boolean var7, int var8, int var9, int var10) {
      float var11 = var3 ? 1900.0F : GraphicsDisplay.Method1021();
      if (var7) {
         var2 = 0;
         var1 = 0;
      }

      int var12 = (int)var11;
      var2 = GraphicsDisplay.Method1039() - var2;
      if (this.Field2884 != null) {
         this.Field2884 = null;
      }

      Class358 var13 = new Class358(this, var4, 0, var6, false, 0, this.Field2750);
      ModelVBO var14;
      if ((var14 = Class838.Field6955.Method10106(var13, var7)) != null) {
         Class838.Method13933(var4, var1 + this.Field2792, var12 + this.Field2793, var2 + this.Field2794, var8, 1024, 0, var14, this.Field2789, this.Field2790, this.Field2791);
         var14.Field1915 = System.currentTimeMillis();
         var14.Field1916 = 5000L;
         var14.Field1909 = true;
         this.Method14500();
         this.Method14499();
      }
   }

   public final void Method14508(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, long var11, boolean var13, boolean var14) {
      this.Method14510(var1, var2, var3, var4, var5, var6, var7, var8, var10, var11, var13, var14, true, false);
   }

   public final void Method14509(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, long var11, boolean var13, boolean var14, boolean var15) {
      if (GraphicsDisplay.Field2678 && GraphicsDisplay.Field2667 && this.Field2745) {
         this.Method14507(var1, var2, var14, var11, true, false, var3, 0, 0);
      } else {
         this.Method14508(var1, var2, var3, 0, var5, var6, var7, var8, 0, var10, var11, true, var14);
      }
   }

   public final void Method14510(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, long var10, boolean var12, boolean var13, boolean var14, boolean var15) {
      if (var9 < 0) {
         var9 += 100;
         this.Field2745 = true;
      } else {
         this.Field2745 = false;
      }

      if (!GraphicsDisplay.Field2678) {
         this.Field2745 = false;
      }

      if (this.Field2745 && GraphicsDisplay.Field2678 && GraphicsDisplay.Field2667) {
         var1 <<= 2;
         var2 <<= 2;
      }

      if (GraphicsDisplay.Field2678 && GraphicsDisplay.Field2667 && this.Field2745 && !var12 && (ModelVBO) Class843.Method13998().get(var10) != null) {
         this.Method14507(var1, var2, var13, var10, var12, var14, 0, 0, 0);
      } else {
         int[] var10000 = Rasterizer.Field9959;
         var10000 = Rasterizer.Field9960;
         int var16 = Rasterizer.Field9959[var3];
         int var17 = Rasterizer.Field9960[var3];
         int var18 = Rasterizer.Field9959[var4];
         int var19 = Rasterizer.Field9960[var4];
         int var20 = Rasterizer.Field9959[var5];
         var5 = Rasterizer.Field9960[var5];
         int var21 = var7 * var20 + var8 * var5 >> 16;
         if (Field2865 != null) {
            float var22 = GraphicsDisplay.Field2678 && GraphicsDisplay.Field2667 ? 4.0F : 1.0F;

            for(int var23 = 0; var23 < this.Field2817; ++var23) {
               int var24 = (int)(this.Field2887[var23] * 0.25F);
               int var25 = (int)(this.Method14530(var23) * 0.25F);
               int var26 = (int)(this.Method14532(var23) * 0.25F);
               int var27;
               if (var4 != 0) {
                  var27 = var25 * var18 + var24 * var19 >> 16;
                  var25 = var25 * var19 - var24 * var18 >> 16;
                  var24 = var27;
               }

               if (var3 != 0) {
                  var27 = var26 * var16 + var24 * var17 >> 16;
                  var26 = var26 * var17 - var24 * var16 >> 16;
                  var24 = var27;
               }

               var24 += var6;
               var25 += var7;
               var26 += var8;
               var27 = var25 * var5 - var26 * var20 >> 16;
               float var28 = (float)(var25 * var20 + var26 * var5) / 65536.0F;
               var26 = var25 * var20 + var26 * var5 >> 16;
               if (var23 < Field2865[var9].length) {
                  Field2865[var9][var23] = (float)(var26 - var21);
                  if (this.Field2745) {
                     Field2866[var9][var23] = var28;
                  } else {
                     Field2866[var9][var23] = 200000.0F;
                  }

                  if (var26 == 0) {
                     var26 = 1;
                  }

                  Field2863[var9][var23] = (float)var1 + (float)((var24 << 9) / var26) * (var15 ? 1.0F : var22);
                  Field2864[var9][var23] = (float)var2 + (float)((var27 << 9) / var26) * (var15 ? 1.0F : var22);
                  Field2867[var9][var23] = var24;
                  Field2868[var9][var23] = var27;
                  Field2869[var9][var23] = var26;
               }
            }

            if (GraphicsDisplay.Field2678 && GraphicsDisplay.Field2667 && this.Field2745) {
               this.Method14507(var1, var2, var13, var10, var12, var14, 0, 0, 0);
            } else {
               this.Method14517(false, false, 0L, 0, var9, true, false);
            }
         }
      }
   }

   public static boolean Method14511() {
      return Field2803;
   }

   public static void Method14512() {
      long var0 = System.currentTimeMillis();
      int var2 = 0;

      while(Field2803 && 0 != Field2801.get() && var2++ <= 5000) {
         try {
            Thread.sleep(1L);
         } catch (InterruptedException var5) {
            var5.printStackTrace();
         }
      }

      long var3;
      if ((var3 = System.currentTimeMillis() - var0) >= 500L) {
         System.out.println("taken: " + var3 + "; 0" + "/" + Field2801.get());
      }

   }

   public static String Method14513() {
      return Field2803 ? "Render Pools: " + Field2805 : "Render Pools: 0";
   }

   public static void Method14514() {
      Field2801.set(0);
      Field2802 = 0;
      if (Field2804 <= 2) {
         Field2806 = false;
         Client.Field12105 = false;
         Field2803 = false;
      } else {
         if (Client.Field12105 != Field2803) {
            Field2803 = Client.Field12105;
            Field2806 = false;
         }

         if (GraphicsDisplay.Field2667 && Field2803) {
            Field2803 = false;
            Field2806 = false;
         }

         if (!Field2806) {
            Field2806 = true;
            if (!GraphicsDisplay.Field2678) {
               return;
            }

            if (Field2799 != null) {
               try {
                  Field2799.shutdown();
                  Field2799.awaitTermination(500L, TimeUnit.MILLISECONDS);
               } catch (InterruptedException var1) {
                  var1.printStackTrace();
               }

               Field2799 = null;
               Field2800 = null;
            }

            if (Field2799 == null) {
               if (Field2803) {
                  Field2799 = Executors.newFixedThreadPool(Field2805 = Field2804);
                  Field2800 = new Object[Field2805 + 2];

                  for(int var0 = 0; var0 < Field2800.length; ++var0) {
                     Field2800[var0] = new Object();
                  }

                  return;
               }

               Field2805 = 1;
            }
         }

      }
   }

   public final void Method14515(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, long var14, int var16, int var17) {
      this.Method14516(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var16, var17, false);
   }

   public final void Method14516(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, long var14, int var16, int var17, boolean var18) {
      if (GraphicsDisplay.Field2678) {
         this.Field2745 = true;
      }

      if (var18) {
         this.Field2753 = true;
      }

      boolean var19 = false;
      boolean var20 = GraphicsDisplay.Field2678 && GraphicsDisplay.Field2667 && Client.Method13313();
      boolean var21 = true;
      boolean var22 = false;
      float var23 = (float)Math.pow(2.0D, (double) Client.Field12133) - 22.0F;
      if (var16 >= 47248 && var16 <= 48012 || var16 == 25274) {
         var21 = false;
      }

      if ((int)(var14 >> 29 & 3L) == 3 && var16 <= 0) {
         if (this.Field2846 < 24) {
            this.Field2846 = 24;
         }

         var22 = true;
      } else if (var16 > 0) {
         int[] var24;
         if ((var24 = (int[])Field2807.get(var16)) != null) {
            if (var24[0] != -1) {
               this.Field2846 = var24[0];
            }

            if (var24[1] != -1) {
               this.Field10127 = var24[1];
            }

            if (var24.length > 2 && var24[2] == 0) {
               var22 = false;
            } else {
               var22 = true;
            }
         } else if ((this.Field2846 <= 128 || this.Field10127 <= 128) && this.Field2750) {
            var22 = false;
            if (this.Field2818 <= 2) {
               this.Field2846 = 128;
               var22 = true;
            } else if (this.Field2846 < 64) {
               this.Field2846 = 64;
               var22 = true;
            }
         }
      }

      boolean var45 = true;
      int var25 = Rasterizer.Field9955;
      int var26 = Rasterizer.Field9956;
      int var27 = (this.Field2846 + 8) / 8 << 3;
      int var28 = (this.Field2846 + 256) / 256 << 8;
      int var29 = (this.Field10127 + 256) / 256 << 8;
      if ((!GraphicsDisplay.Field2678 || !GraphicsDisplay.Field2667) && this.Field2846 == 0) {
         this.Method14480(-1);
      }

      int var30 = Class697.Field8768;
      int var31 = Class697.Field8769;
      if (GraphicsDisplay.Field2678 && GraphicsDisplay.Field2667 && !Client.Field12712) {
         int var10000 = Client.Field12134;
         Client.Method13400();
      }

      int var32 = var13 * var10 - var11 * var9 >> 16;
      int var33 = var12 * var7 + var32 * var8 >> 16;
      var27 = var27 * var8 >> 16;
      int var34;
      if ((var34 = var33 + var27) == 0) {
         var34 = 1;
      }

      int var35 = Client.Method13204(var1 + 1, var2 + 1);
      if (Client.Field12069 && var35 <= Class745.Method12490() / 2) {
         var21 = false;
      }

      if (var34 <= 30) {
         if (var21) {
            return;
         }

         var45 = false;
      }

      float var36;
      float var37;
      if ((var37 = ((var36 = (float)(var13 * var9 + var11 * var10) / 65536.0F) - (float)var28) * var23) / (float)var34 >= (float)var30) {
         if (var21) {
            return;
         }

         var45 = false;
      }

      float var38;
      if ((var38 = (var36 + (float)var28) * var23) / (float)var34 <= (float)(-var30)) {
         if (var21) {
            return;
         }

         var45 = false;
      }

      float var51 = (float)(var12 * var8 - var32 * var7) / 65536.0F;
      float var49 = (float)(var28 * var7) / 65536.0F;
      float var55;
      if ((var55 = (var51 + var49) * var23) / (float)var34 <= (float)(-var31)) {
         if (var21) {
            return;
         }

         var45 = false;
      }

      var49 += (float)(var29 * var8) / 65536.0F;
      if ((var49 = (var51 - var49) * var23) / (float)var34 >= (float)var31) {
         if (var21) {
            return;
         }

         var45 = false;
      }

      float var44 = (float)var27 + (float)(var29 * var7) / 65536.0F;
      boolean var50 = false;
      if ((float)var33 - var44 <= 50.0F) {
         var50 = true;
      }

      var21 = !Class569.Method8821(var14);
      boolean var54 = Class569.Method8820(var14);
      if (GraphicsDisplay.Field2678 && GraphicsDisplay.Field2667) {
         if (var20) {
            var45 = true;
         }

         if (var1 >= 0 && var2 >= 0 && var1 <= 104 && var2 <= 104 && var3 >= 0 && var3 <= 3) {
            Class501 var39 = Client.Field12428.Method8846(var3, var1, var2);
            if (var20 && var39 != null && var39.Field12841) {
               var45 = false;
            }

            if (var39 != null && var39.Field12841 && !var20) {
               if (!Client.Field12069) {
                  return;
               }

               var45 = false;
            }
         }
      }

      boolean var40 = false;
      int var43;
      if (var14 > 0L) {
         if ((var2 = var33 - var27) == 0) {
            var2 = 1;
         }

         if (var36 > 0.0F) {
            var37 /= (float)var34;
            var38 /= (float)var2;
         } else {
            var38 /= (float)var34;
            var37 /= (float)var2;
         }

         if (var51 > 0.0F) {
            var49 /= (float)var34;
            var55 /= (float)var2;
         } else {
            var55 /= (float)var34;
            var49 /= (float)var2;
         }

         var43 = Field2880 - var25;
         var27 = Field2881 - var26;
         boolean var53 = !GraphicsDisplay.Field2678 || Client.session_player == null || var3 == Client.Field12379 || var16 == 30624;
         boolean var52 = (float)var43 > var37 && (float)var43 < var38 && (float)var27 > var49 && (float)var27 < var55;
         if (var53 && var52 && (Field2808 || !GraphicsDisplay.Field2667 || !GraphicsDisplay.Field2678)) {
            if (!var22 && !this.Field2855 && (!GraphicsDisplay.Field2678 || !GraphicsDisplay.Field2667) && GraphicsDisplay.Field2678) {
               var40 = true;
            } else {
               var22 = var22 || this.Field2846 <= 8 && this.Field10127 <= 8 && !var22;
               if (!Client.Field12055) {
                  if (!var22 && GraphicsDisplay.Field2678 && GraphicsDisplay.Field2667) {// && !this.Field9942) { //&& !this.Field9942
                     if (Field2808) {
                        var19 = true;
                     }
                  } else if (var16 != -1) {
                     Method14523(new Class730(var16, var14, true), true);
                  }
               } else {
                  var19 = true;
                  var40 = true;
                  if (this.Field2855 || var22) {
                     if (!this.Field2750) {
                        Method14523(new Class730(var16, var14, this.Field2855), false);
                     }

                     if (this.Field2750 && (this.Field10127 <= 0 || this.Field2818 <= 2)) {
                        Method14523(new Class730(var16, var14, this.Field2855), true);
                        var19 = false;
                     }
                  }
               }
            }
         }
      }

      if (var4 < 0) {
         var4 += 2048;
      } else if (var4 >= 2048) {
         var4 -= 2048;
      }

      if (var4 != 0) {
         var2 = Rasterizer.Field9959[var4];
         var43 = Rasterizer.Field9960[var4];
      } else {
         var2 = 0;
         var43 = 0;
      }

      float var48 = this.Field2789;
      var51 = this.Field2790;
      var49 = this.Field2791;
      int var47;
      if (GraphicsDisplay.Field2678 && GraphicsDisplay.Field2667) {
         var47 = var11 + SceneGraph.Field955;
         var32 = var12 + SceneGraph.Field957;
         var34 = var13 + SceneGraph.Field958;
         if (var14 == -1L) {
            System.out.println("invalid uid: " + var14 + ", " + var16);
            return;
         }

         if (this.Field2818 <= 0) {
            return;
         }

         Class358 var41 = new Class358(this, var14, var16, this.Field2753, this.Field2750, var21, var54, var45, var3, false);
         if (this.Field2884 != null) {
            var41.Method4206((float)(var47 + this.Field2792), (float)(var34 + this.Field2793), (float)(var32 + this.Field2794), var4);
         }

         if (GraphicsDisplay.Method1029()) {
            return;
         }

         ModelVBO var46 = Class838.Field6955.Method10106(var41, false);
         if (var16 != 0) {
            this.Field2750 = true;
         }

         this.Field2751 = Client.Field12600;
         if (var46 == null) {
            var41.Method4211(var47 + this.Field2792, var34 + this.Field2793, var32 + this.Field2794, var4, var5, var6, this.Field2789, this.Field2790, this.Field2791);
            if (!var19) {
               return;
            }
         } else {
            var46.Field1923 = var16 == 0 ? (int)(var14 & 16777215L) : var16;
            if (var45) {
               Class838.Method13933(var41.Method4192(), var47 + this.Field2792, var34 + this.Field2793, var32 + this.Field2794, var4, var5, var6, var46, this.Field2789, this.Field2790, this.Field2791);
            }

            if (Client.Field12069 && var35 <= Class745.Method12490()) {
               Class838.Method13932(var41.Method4192(), var47 + this.Field2792, var34 + this.Field2793, var32 + this.Field2794, var4, var5, var6, var46, this.Field2789, this.Field2790, this.Field2791);
            }

            this.Method14500();
            this.Method14499();
            if (var19 && Class745.Method12483()) {
               Field2809.put(var46.Field1923, var14);
               Class838.Method13934(var14, var47, var34, var32, var4, var5, var6, var46, Field2810);
               ++Field2810;
               return;
            }
         }

         if (!var19) {
            return;
         }

         var40 = true;
      }

      if (Field2865[0].length <= this.Field2817) {
         var47 = (this.Field2817 / 256 << 8) + 256 + 1;
         Field2863 = new float[1][var47];
         Field2864 = new float[1][var47];
         Field2865 = new float[1][var47];
         Field2866 = new float[1][var47];
      }

      for(var47 = 0; var47 < this.Field2817; ++var47) {
         var55 = (float)((int)(this.Field2887[var47] * 0.25F * var48));
         float var56 = (float)((int)(this.Method14530(var47) * 0.25F * var51));
         float var42 = (float)((int)(this.Method14532(var47) * 0.25F * var49));
         if (var4 != 0 && (GraphicsDisplay.Field2678 || this.Field2855 || var18)) {
            var44 = (var42 * (float)var2 + var55 * (float)var43) / 65536.0F;
            var42 = (var42 * (float)var43 - var55 * (float)var2) / 65536.0F;
            var55 = var44;
         }

         var55 += (float)var11;
         var56 += (float)var12;
         var44 = ((var42 += (float)var13) * (float)var9 + var55 * (float)var10) / 65536.0F;
         var42 = (var42 * (float)var10 - var55 * (float)var9) / 65536.0F;
         var55 = var44;
         var44 = (var56 * (float)var8 - var42 * (float)var7) / 65536.0F;
         var42 = (var56 * (float)var7 + var42 * (float)var8) / 65536.0F;
         Field2865[var17][var47] = var42 - (float)var33;
         if (this.Field2745) {
            Field2866[var17][var47] = var42;
         } else {
            Field2866[var17][var47] = 200000.0F;
         }

         if (var42 < (float) SceneGraph.Field928) {
            Field2863[var17][var47] = -5000.0F;
            return;
         }

         Field2863[var17][var47] = (float)var25 + var55 * var23 / var42;
         Field2864[var17][var47] = (float)var26 + var44 * var23 / var42;
         if (!var19 || !GraphicsDisplay.Field2678) {
            Field2867[var17][var47] = (int)var55;
            Field2868[var17][var47] = (int)var44;
            Field2869[var17][var47] = (int)var42;
         }
      }

      if (!var19 || this.Field2750 || !GraphicsDisplay.Field2678) {
         this.Method14517(var50, var40, var14, var16, var17, false, var19);
      }
   }

   private void Method14517(boolean var1, boolean var2, long var3, int var5, int var6, boolean var7, boolean var8) {
      if (this.Field2848 < Field2860 || var8 && GraphicsDisplay.Field2678 && GraphicsDisplay.Field2667) {
         if (this.Field2818 < Field2859 || var8 || var8 && GraphicsDisplay.Field2678 && GraphicsDisplay.Field2667) {
            if (!var8 || !GraphicsDisplay.Field2678 || !GraphicsDisplay.Field2667) {
               for(int var29 = 0; var29 < this.Field2848; ++var29) {
                  Field2870[var6][var29] = 0;
               }
            }

            var7 = var8 && GraphicsDisplay.Field2678 && GraphicsDisplay.Field2667;

            int var9;
            int var10;
            int var11;
            int var12;
            for(var9 = 0; var9 < this.Field2818; ++var9) {
               if (this.Field2833 == null || this.Field2833[var9] != -1 || var8) {
                  var10 = this.Field2819[var9];
                  var11 = this.Field2820[var9];
                  var12 = this.Field2821[var9];
                  float var13 = Field2863[var6][var10];
                  float var14 = Field2863[var6][var11];
                  float var15 = Field2863[var6][var12];
                  float var16 = Field2864[var6][var10];
                  float var17 = Field2864[var6][var11];
                  float var18 = Field2864[var6][var12];
                  if (!var1 || var13 != -5000.0F && var14 != -5000.0F && var15 != -5000.0F) {
                     if (var2) {
                        int var20 = Field2881;
                        int var19 = Field2880;
                        if ((float)var20 + 5.0F < var16 && (float)var20 + 5.0F < var17 && (float)var20 + 5.0F < var18 ? false : ((float)var20 - 5.0F > var16 && (float)var20 - 5.0F > var17 && (float)var20 - 5.0F > var18 ? false : ((float)var19 + 5.0F < var13 && (float)var19 + 5.0F < var14 && (float)var19 + 5.0F < var15 ? false : (float)var19 - 5.0F <= var13 || (float)var19 - 5.0F <= var14 || (float)var19 - 5.0F <= var15))) {
                           Method14523(new Class730(var5, var3, this.Field2855), this.Field2750);
                           if (var8 && GraphicsDisplay.Field2678 && GraphicsDisplay.Field2667) {
                              return;
                           }

                           var2 = false;
                        }
                     }

                     if (!var7 && (var13 - var14) * (var18 - var17) - (var16 - var17) * (var15 - var14) > 0.0F) {
                        if (Field2862 != null) {
                           Field2862[var9] = false;
                        }

                        if (Field2861 != null) {
                           if (var13 >= 0.0F && var14 >= 0.0F && var15 >= 0.0F && var13 <= (float)Class697.Field8767 && var14 <= (float)Class697.Field8767 && var15 <= (float)Class697.Field8767) {
                              Field2861[var9] = false;
                           } else {
                              Field2861[var9] = true;
                           }
                        }

                        if ((var10 = (int)(Field2865[var6][var10] + Field2865[var6][var11] + Field2865[var6][var12]) / 3 + this.Field2849) >= 0 && Field2870[var6][var10] >= 0) {
                           if ((var11 = Field2870[var6][var10]) >= Field2871[var6][var10].length) {
                              break;
                           }

                           Field2871[var6][var10][var11] = var9;
                           ++Field2870[var6][var10];
                        }
                     }
                  } else if (!var7) {
                     if (Field2862 != null) {
                        Field2862[var9] = true;
                     }

                     var10 = (int)(Field2865[var6][var10] + Field2865[var6][var11] + Field2865[var6][var12]) / 3 + this.Field2849;
                     Field2871[var6][var10][Field2870[var6][var10]] = var9;
                     ++Field2870[var6][var10];
                  }
               }
            }

            if (!var8 || !GraphicsDisplay.Field2678 || !GraphicsDisplay.Field2667) {
               if (this.Field2745 && GraphicsDisplay.Field2678) {
                  GraphicsDisplay.Method997().Method1027(this.Field2759, Field2863[var6], Field2864[var6], Field2866[var6], this.Field2819, this.Field2820, this.Field2821, this.Field2836, this.Field2776, this.Field2848, Field2870[var6], Field2871[var6], this.Field2830, this.Field2831, this.Field2832, this.Field2835, this.Field2833, this.Field2775, this.Field2774, this.Field2839, this.Field2840, this.Field2841, Field2867[var6], Field2868[var6], Field2869[var6], this.Field2825, this.Field2826, this.Field2827, this.Field2822, this.Field2823, this.Field2824, this.Field2828, this.Field2829, var6);
               } else {
                  int[] var30;
                  if (this.Field2834 == null) {
                     for(var9 = this.Field2848 - 1; var9 >= 0; --var9) {
                        if ((var10 = Field2870[var6][var9]) > 0) {
                           var30 = Field2871[var6][var9];

                           for(var12 = 0; var12 < var10 && var12 < var30.length; ++var12) {
                              this.Method14518(var30[var12], var6);
                           }
                        }
                     }

                  } else {
                     for(var9 = 0; var9 < 12; ++var9) {
                        Field2872[var9] = 0;
                        Field2876[var9] = 0;
                     }

                     int var31;
                     for(var9 = this.Field2848 - 1; var9 >= 0; --var9) {
                        if ((var10 = Field2870[var6][var9]) > 0) {
                           var30 = Field2871[var6][var9];

                           for(var12 = 0; var12 < var10 && (var31 = var30[var12]) < this.Field2834.length; ++var12) {
                              int var32 = this.Field2834[var31];
                              int var34 = Field2872[var32]++;
                              if (var32 >= Field2873.length || var34 >= Field2873[var32].length) {
                                 break;
                              }

                              Field2873[var32][var34] = var31;
                              if (var32 < 10) {
                                 Field2876[var32] += var9;
                              } else if (var32 == 10) {
                                 Field2874[var34] = var9;
                              } else {
                                 Field2875[var34] = var9;
                              }
                           }
                        }
                     }

                     var9 = 0;
                     if (Field2872[1] > 0 || Field2872[2] > 0) {
                        var9 = (Field2876[1] + Field2876[2]) / (Field2872[1] + Field2872[2]);
                     }

                     var10 = 0;
                     if (Field2872[3] > 0 || Field2872[4] > 0) {
                        var10 = (Field2876[3] + Field2876[4]) / (Field2872[3] + Field2872[4]);
                     }

                     var11 = 0;
                     if (Field2872[6] > 0 || Field2872[8] > 0) {
                        var11 = (Field2876[6] + Field2876[8]) / (Field2872[6] + Field2872[8]);
                     }

                     var12 = 0;
                     var31 = Field2872[10];
                     int[] var33 = Field2873[10];
                     int[] var35 = Field2874;
                     if (var31 == 0) {
                        var12 = 0;
                        var31 = Field2872[11];
                        var33 = Field2873[11];
                        var35 = Field2875;
                     }

                     int var36;
                     if (var31 > 0) {
                        var36 = var35[0];
                     } else {
                        var36 = -1000;
                     }

                     for(int var37 = 0; var37 < 10; ++var37) {
                        while(var37 == 0 && var36 > var9) {
                           this.Method14518(var33[var12++], var6);
                           if (var12 == var31 && var33 != Field2873[11]) {
                              var12 = 0;
                              var31 = Field2872[11];
                              var33 = Field2873[11];
                              var35 = Field2875;
                           }

                           if (var12 < var31) {
                              var36 = var35[var12];
                           } else {
                              var36 = -1000;
                           }
                        }

                        while(var37 == 3 && var36 > var10) {
                           this.Method14518(var33[var12++], var6);
                           if (var12 == var31 && var33 != Field2873[11]) {
                              var12 = 0;
                              var31 = Field2872[11];
                              var33 = Field2873[11];
                              var35 = Field2875;
                           }

                           if (var12 < var31) {
                              var36 = var35[var12];
                           } else {
                              var36 = -1000;
                           }
                        }

                        while(var37 == 5 && var36 > var11) {
                           this.Method14518(var33[var12++], var6);
                           if (var12 == var31 && var33 != Field2873[11]) {
                              var12 = 0;
                              var31 = Field2872[11];
                              var33 = Field2873[11];
                              var35 = Field2875;
                           }

                           if (var12 < var31) {
                              var36 = var35[var12];
                           } else {
                              var36 = -1000;
                           }
                        }

                        int var38 = Field2872[var37];
                        int[] var27 = Field2873[var37];

                        for(int var28 = 0; var28 < var38 && var28 < var27.length; ++var28) {
                           this.Method14518(var27[var28], var6);
                        }
                     }

                     while(var36 != -1000) {
                        this.Method14518(var33[var12++], var6);
                        if (var12 == var31 && var33 != Field2873[11]) {
                           var12 = 0;
                           var33 = Field2873[11];
                           var31 = Field2872[11];
                           var35 = Field2875;
                        }

                        if (var12 < var31) {
                           var36 = var35[var12];
                        } else {
                           var36 = -1000;
                        }
                     }

                  }
               }
            }
         } else {
            System.out.println("model triangle count: " + this.Field2818 + "/" + Field2859);
         }
      }
   }

   private boolean Method14518(int var1, int var2) {
      if (var1 >= this.Field2836.length) {
         return true;
      } else {
         if (this.Field2836[var1] == 40 && this.Field2776 != null && this.Field2776[var1] == 0) {
            this.Field2776[var1] = 40;
            this.Field2836[var1] = 40;
         }

         int var3 = this.Field2819[var1];
         int var4 = this.Field2820[var1];
         int var5 = this.Field2821[var1];
         int var6;
         if (this.Field2835 == null) {
            var6 = 0;
         } else {
            var6 = this.Field2835[var1];
         }

         if (this.Field2812 != -1) {
            var6 = this.Field2812;
         }

         int var7 = this.Field2833 == null ? 0 : this.Field2833[var1] & 3;
         boolean var8 = false;
         if (var7 == -1) {
            var8 = true;
         }

         int var9;
         if ((var9 = this.Field2776 != null ? this.Field2776[var1] : -1) < 0 || var9 >= Rasterizer.Field9950 || this.Field2758) {
            var9 = -1;
         }

         int var10;
         int var12;
         int var13;
         if (!var8 && var9 >= 0) {
            if (var9 == 922) {
               return true;
            }

            Rasterizer.Field9963[var9] = true;
            byte var11;
            if (var7 != 1) {
               if (this.Field2775 != null && this.Field2775[var1] != -1) {
                  var10 = this.Field2775[var1] & 255;
                  var11 = this.Field2774 != null && var10 < this.Field2774.length ? this.Field2774[var10] : 0;
                  if (this.Field2839 == null || var10 >= this.Field2839.length) {
                     var11 = 16;
                  }

                  if (var11 == 0) {
                     var13 = this.Field2839[var10];
                     var12 = this.Field2840[var10];
                     var10 = this.Field2841[var10];
                     if (var13 >= this.Field2885) {
                        var13 = var3;
                     }

                     if (var12 >= this.Field2885) {
                        var12 = var4;
                     }

                     if (var10 >= this.Field2885) {
                        var10 = var5;
                     }

                     Rasterizer.Method9439(Field2864[var2][var3], Field2864[var2][var4], Field2864[var2][var5], Field2863[var2][var3], Field2863[var2][var4], Field2863[var2][var5], Field2866[var2][var3], Field2866[var2][var4], Field2866[var2][var5], this.Field2830[var1], this.Field2831[var1], this.Field2832[var1], Field2867[var2][var13], Field2867[var2][var12], Field2867[var2][var10], Field2868[var2][var13], Field2868[var2][var12], Field2868[var2][var10], Field2869[var2][var13], Field2869[var2][var12], Field2869[var2][var10], var9, this.Field2836[var1], false, Field2861 != null ? Field2861[var1] : false, var6);
                     var8 = true;
                  } else if (var11 >= 15) {
                     Rasterizer.Method9439(Field2864[var2][var3], Field2864[var2][var4], Field2864[var2][var5], Field2863[var2][var3], Field2863[var2][var4], Field2863[var2][var5], Field2866[var2][var3], Field2866[var2][var4], Field2866[var2][var5], this.Field2830[var1], this.Field2831[var1], this.Field2832[var1], Field2867[var2][var3], Field2867[var2][var4], Field2867[var2][var5], Field2868[var2][var3], Field2868[var2][var4], Field2868[var2][var5], Field2869[var2][var3], Field2869[var2][var4], Field2869[var2][var5], var9, this.Field2836[var1], false, Field2861 != null ? Field2861[var1] : false, var6);
                     var8 = true;
                  }
               } else {
                  Rasterizer.Method9439(Field2864[var2][var3], Field2864[var2][var4], Field2864[var2][var5], Field2863[var2][var3], Field2863[var2][var4], Field2863[var2][var5], Field2866[var2][var3], Field2866[var2][var4], Field2866[var2][var5], this.Field2830[var1], this.Field2831[var1], this.Field2832[var1], Field2867[var2][var3], Field2867[var2][var4], Field2867[var2][var5], Field2868[var2][var3], Field2868[var2][var4], Field2868[var2][var5], Field2869[var2][var3], Field2869[var2][var4], Field2869[var2][var5], var9, this.Field2836[var1], false, Field2861 != null ? Field2861[var1] : false, var6);
                  var8 = true;
               }
            } else if (this.Field2775 != null && this.Field2775[var1] != -1) {
               var10 = this.Field2775[var1] & 255;
               var11 = this.Field2774 != null && var10 < this.Field2774.length ? this.Field2774[var10] : 0;
               if (this.Field2839 == null || var10 >= this.Field2839.length) {
                  var11 = 16;
               }

               if (var11 == 0) {
                  var13 = this.Field2839[var10];
                  var12 = this.Field2840[var10];
                  var10 = this.Field2841[var10];
                  Rasterizer.Method9439(Field2864[var2][var3], Field2864[var2][var4], Field2864[var2][var5], Field2863[var2][var3], Field2863[var2][var4], Field2863[var2][var5], Field2866[var2][var13], Field2866[var2][var12], Field2866[var2][var10], this.Field2830[var1], this.Field2830[var1], this.Field2830[var1], Field2867[var2][var13], Field2867[var2][var12], Field2867[var2][var10], Field2868[var2][var13], Field2868[var2][var12], Field2868[var2][var10], Field2869[var2][var13], Field2869[var2][var12], Field2869[var2][var10], var9, this.Field2836[var1], false, Field2861 != null ? Field2861[var1] : false, var6);
                  var8 = true;
               } else if (var11 >= 15) {
                  Rasterizer.Method9439(Field2864[var2][var3], Field2864[var2][var4], Field2864[var2][var5], Field2863[var2][var3], Field2863[var2][var4], Field2863[var2][var5], Field2866[var2][var3], Field2866[var2][var4], Field2866[var2][var5], this.Field2830[var1], this.Field2830[var1], this.Field2830[var1], Field2867[var2][var3], Field2867[var2][var4], Field2867[var2][var5], Field2868[var2][var3], Field2868[var2][var4], Field2868[var2][var5], Field2869[var2][var3], Field2869[var2][var4], Field2869[var2][var5], var9, this.Field2836[var1], false, Field2861 != null ? Field2861[var1] : false, var6);
                  var8 = true;
               }
            } else {
               Rasterizer.Method9439(Field2864[var2][var3], Field2864[var2][var4], Field2864[var2][var5], Field2863[var2][var3], Field2863[var2][var4], Field2863[var2][var5], Field2866[var2][var3], Field2866[var2][var4], Field2866[var2][var5], this.Field2830[var1], this.Field2830[var1], this.Field2830[var1], Field2867[var2][var3], Field2867[var2][var4], Field2867[var2][var5], Field2868[var2][var3], Field2868[var2][var4], Field2868[var2][var5], Field2869[var2][var3], Field2869[var2][var4], Field2869[var2][var5], var9, this.Field2836[var1], false, Field2861 != null ? Field2861[var1] : false, var6);
               var8 = true;
            }
         }

         if (!var8) {
            if (this.Field2758) {
               var7 = 0;
            }

            if (var7 == 0) {
               Rasterizer.Method9438(Field2864[var2][var3], Field2864[var2][var4], Field2864[var2][var5], Field2863[var2][var3], Field2863[var2][var4], Field2863[var2][var5], Field2866[var2][var3], Field2866[var2][var4], Field2866[var2][var5], this.Field2830[var1], this.Field2831[var1], this.Field2832[var1], Field2861 != null ? Field2861[var1] : false, var6);
            } else if (var7 == 1) {
               Rasterizer.Method9437(Field2864[var2][var3], Field2864[var2][var4], Field2864[var2][var5], Field2863[var2][var3], Field2863[var2][var4], Field2863[var2][var5], Field2866[var2][var3], Field2866[var2][var4], Field2866[var2][var5], Rasterizer.Field9964[this.Field2830[var1] & '\uffff'], Field2861 != null ? Field2861[var1] : false, var6);
            } else {
               int var14;
               if (var7 == 2) {
                  var10 = (this.Field2833[var1] & 255) >> 2;
                  var14 = this.Field2839[var10];
                  var13 = this.Field2840[var10];
                  var12 = this.Field2841[var10];
                  if (this.Field2836[var1] == 50 && this.Field2830[var1] > 50) {
                     this.Field2830[var1] = 50;
                     this.Field2831[var1] = 50;
                     this.Field2832[var1] = 50;
                  }

                  Rasterizer.Method9439(Field2864[var2][var3], Field2864[var2][var4], Field2864[var2][var5], Field2863[var2][var3], Field2863[var2][var4], Field2863[var2][var5], Field2866[var2][var3], Field2866[var2][var4], Field2866[var2][var5], this.Field2831[var1], this.Field2831[var1], this.Field2831[var1], Field2867[var2][var14], Field2867[var2][var13], Field2867[var2][var12], Field2868[var2][var14], Field2868[var2][var13], Field2868[var2][var12], Field2869[var2][var14], Field2869[var2][var13], Field2869[var2][var12], this.Field2836[var1], -1, false, Field2861 != null ? Field2861[var1] : false, var6);
               } else if (var7 == 3) {
                  var10 = (this.Field2833[var1] & 255) >> 2;
                  var14 = this.Field2839[var10];
                  var13 = this.Field2840[var10];
                  var12 = this.Field2841[var10];
                  Rasterizer.Method9439(Field2864[var2][var3], Field2864[var2][var4], Field2864[var2][var5], Field2863[var2][var3], Field2863[var2][var4], Field2863[var2][var5], Field2866[var2][var3], Field2866[var2][var4], Field2866[var2][var5], this.Field2831[var1], this.Field2831[var1], this.Field2831[var1], Field2867[var2][var14], Field2867[var2][var13], Field2867[var2][var12], Field2868[var2][var14], Field2868[var2][var13], Field2868[var2][var12], Field2869[var2][var14], Field2869[var2][var13], Field2869[var2][var12], this.Field2836[var1], -1, false, Field2861 != null ? Field2861[var1] : false, var6);
               } else if (var7 == 4) {
                  Rasterizer.Method9437(Field2864[var2][var3], Field2864[var2][var4], Field2864[var2][var5], Field2863[var2][var3], Field2863[var2][var4], Field2863[var2][var5], Field2866[var2][var3], Field2866[var2][var4], Field2866[var2][var5], Rasterizer.Field9964[this.Field2836[var1] & '\uffff'], Field2861 != null ? Field2861[var1] : false, var6);
               }
            }
         }

         return true;
      }
   }

   public final boolean Method14519(int var1, int var2) {
      return this.Method14520(var1, var2, false);
   }

   public final boolean Method14520(int var1, int var2, boolean var3) {
      if (!this.Field2750) {
         return true;
      } else if (this.Field2853 == null) {
         return false;
      } else {
         Class518 var5;
         if ((var5 = Class518.Method8351(var1)) == null) {
            return false;
         } else {
            Class128 var6 = var5.Field10086;
            if (var5.Field10086 == null) {
               return false;
            } else {
               Field2877 = 0.0F;
               Field2878 = 0.0F;
               Field2879 = 0.0F;

               for(int var7 = 0; var7 < var5.Field10087; ++var7) {
                  int var4 = var5.Field10088[var7];
                  this.Method14486(var6.Field10041[var4], var6.Field10042[var4], var5.Field10089[var7], var5.Field10090[var7], var5.Field10091[var7]);
               }

               return true;
            }
         }
      }
   }

   public final void Method14521(int var1, int var2, int var3, int var4, int var5) {
      this.Method14522(var1, var2, var3, var4, var5, false);
   }

   public final void Method14522(int var1, int var2, int var3, int var4, int var5, boolean var6) {
      if (this.Field2750) {
         if (var1 != var2 && var1 != -1 && var2 != -1 && Client.Field12110) {
            if (this.Field2853 != null && var1 != -1) {
               Class518 var16;
               if ((var16 = Class518.Method8351(var1)) == null) {
                  return;
               }

               Class128 var17 = var16.Field10086;
               if (var16.Field10086 == null) {
                  return;
               }

               Field2877 = 0.0F;
               Field2878 = 0.0F;
               Field2879 = 0.0F;
               Class518 var18 = null;
               Class128 var7 = null;
               if (var2 != -1) {
                  if ((var18 = Class518.Method8351(var2)) == null) {
                     return;
                  }

                  var7 = var18.Field10086;
               }

               int var8;
               if (var18 == null || var7 == null) {
                  for(var2 = 0; var2 < var16.Field10087; ++var2) {
                     var8 = var16.Field10088[var2];
                     this.Method14486(var17.Field10041[var8], var17.Field10042[var8], var16.Field10089[var2], var16.Field10090[var2], var16.Field10091[var2]);
                  }

                  return;
               }

               for(var2 = 0; var2 < var16.Field10087; ++var2) {
                  var8 = var16.Field10088[var2];
                  int var9 = var17.Field10041[var8];
                  int[] var19 = var17.Field10042[var8];
                  int var10 = var16.Field10089[var2];
                  int var11 = var16.Field10090[var2];
                  int var12 = var16.Field10091[var2];

                  for(int var13 = 0; var13 < var18.Field10087; ++var13) {
                     int var14 = var18.Field10088[var13];
                     if (var7.Field10042[var14].equals(var19)) {
                        if (var9 != 2) {
                           var10 += (var18.Field10089[var13] - var10) * var4 / var3;
                           var11 += (var18.Field10090[var13] - var11) * var4 / var3;
                           var12 += (var18.Field10091[var13] - var12) * var4 / var3;
                        } else {
                           var10 &= 255;
                           var11 &= 255;
                           var12 &= 255;
                           var14 = var18.Field10089[var13] - var10 & 255;
                           int var15 = var18.Field10090[var13] - var11 & 255;
                           var13 = var18.Field10091[var13] - var12 & 255;
                           if (var14 >= 127) {
                              var14 -= 256;
                           }

                           if (var15 >= 127) {
                              var15 -= 256;
                           }

                           if (var13 >= 127) {
                              var13 -= 256;
                           }

                           var10 = var10 + var14 * var4 / var3 & 255;
                           var11 = var11 + var15 * var4 / var3 & 255;
                           var12 = var12 + var13 * var4 / var3 & 255;
                        }
                        break;
                     }
                  }

                  this.Method14486(var9, var19, var10, var11, var12);
               }
            }

         } else {
            this.Method14520(var1, var5, false);
         }
      }
   }

   public static boolean Method14523(Class730 var0, boolean var1) {
      List var2 = Field2882;
      synchronized(Field2882) {
         int var3;
         if ((var3 = Field2882.indexOf(var0)) == -1 && var1) {
            Field2882.add(var0);
            return true;
         } else if (var3 != -1) {
            ((Class730)Field2882.get(var3)).Method12353();
            return true;
         } else {
            return false;
         }
      }
   }

   public static void Method14524() {
      List var0 = Field2882;
      synchronized(Field2882) {
         Iterator var2 = Field2882.iterator();

         while(var2.hasNext()) {
            Class730 var1;
            if ((var1 = (Class730)var2.next()).Method12354()) {
               Field2883.add(var1);
            }
         }

         Field2882.removeAll(Field2883);
         Field2883.clear();
      }
   }

   public static void Method14525(List var0) {
      List var1 = Field2882;
      synchronized(Field2882) {
         var0.addAll(Field2882);
      }
   }

   public final Map Method14526() {
      return this.Field2884;
   }

   private void Method14527(int var1) {
      int var3 = var1 * 3;
      this.Field2887 = new float[var3];
      float[] var2;
      this.Field2886 = FloatBuffer.wrap(var2 = this.Field2887);
      this.Field2885 = var1;
   }

   private void Method14528(FloatBuffer var1) {
      FloatBuffer var10001 = var1;
      boolean var4 = false;
      FloatBuffer var2 = var10001;
      if (var2 != null && var2.array() != null) {
         int var3 = var2.array().length;
         if (this.Field2887 != null && this.Field2887.length >= var3) {
            this.Field2885 = var3 / 3;
         } else {
            this.Method14527(var3 / 3);
         }

         System.arraycopy(var2.array(), 0, this.Field2887, 0, this.Field2817 * 3);
      }
   }

   public final float Method14529(int var1) {
      return this.Field2887[var1];
   }

   public final float Method14530(int var1) {
      return this.Field2887[this.Field2885 + var1];
   }

   private void Method14531(int var1, float var2) {
      this.Field2887[this.Field2885 + var1] = var2;
   }

   public final float Method14532(int var1) {
      return this.Field2887[this.Field2885 + this.Field2885 + var1];
   }

   private void Method14533(int var1, float var2) {
      this.Field2887[this.Field2885 + this.Field2885 + var1] = var2;
   }

   // $FF: synthetic method
   private static int[] Method14534() {
      int[] var10000 = Field2889;
      if (Field2889 != null) {
         return var10000;
      } else {
         int[] var0 = new int[Class871.Method14575().length];

         try {
            var0[Class871.Field2613.ordinal()] = 3;
         } catch (NoSuchFieldError var4) {
            ;
         }

         try {
            var0[Class871.Field2611.ordinal()] = 1;
         } catch (NoSuchFieldError var3) {
            ;
         }

         try {
            var0[Class871.Field2612.ordinal()] = 2;
         } catch (NoSuchFieldError var2) {
            ;
         }

         try {
            var0[Class871.Field2614.ordinal()] = 4;
         } catch (NoSuchFieldError var1) {
            ;
         }

         Field2889 = var0;
         return var0;
      }
   }

   // $FF: synthetic method
   private static int[] Method14535() {
      int[] var10000 = Field2890;
      if (Field2890 != null) {
         return var10000;
      } else {
         int[] var0 = new int[Class872.Method14577().length];

         try {
            var0[Class872.Field2625.ordinal()] = 6;
         } catch (NoSuchFieldError var6) {
            ;
         }

         try {
            var0[Class872.Field2621.ordinal()] = 2;
         } catch (NoSuchFieldError var5) {
            ;
         }

         try {
            var0[Class872.Field2620.ordinal()] = 1;
         } catch (NoSuchFieldError var4) {
            ;
         }

         try {
            var0[Class872.Field2622.ordinal()] = 3;
         } catch (NoSuchFieldError var3) {
            ;
         }

         try {
            var0[Class872.Field2623.ordinal()] = 4;
         } catch (NoSuchFieldError var2) {
            ;
         }

         try {
            var0[Class872.Field2624.ordinal()] = 5;
         } catch (NoSuchFieldError var1) {
            ;
         }

         Field2890 = var0;
         return var0;
      }
   }

   // $FF: synthetic method
   Model(int var1, boolean var2, Class696 var3, byte var4) {
      this(var1, var2, var3);
   }
}
