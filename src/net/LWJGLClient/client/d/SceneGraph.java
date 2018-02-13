package net.LWJGLClient.client.d;

import net.LWJGLClient.client.b.Rasterizer;
import net.LWJGLClient.client.b.b.b.a.b.ModelLoader;
import net.LWJGLClient.client.b.b.b.a.c.Class585;
import net.LWJGLClient.client.b.b.f.Class843;
import net.LWJGLClient.client.b.b.f.c.Class598;
import net.LWJGLClient.client.model.Model;
import net.LWJGLClient.client.model.a.b.Class46;
import net.LWJGLClient.client.model.c.Class178;
import net.LWJGLClient.client.a.a.Class511;
import net.LWJGLClient.client.a.a.ObjectInstance;
import net.LWJGLClient.client.a.c.ObjectDefinition;
import net.LWJGLClient.client.b.a.Class697;
import net.LWJGLClient.client.b.b.GraphicsDisplay;
import net.LWJGLClient.client.b.b.f.Class838;
import net.LWJGLClient.client.e.d.Class350;
import net.LWJGLClient.client.e.d.Class353;
import net.LWJGLClient.client.e.d.Class445;
import net.LWJGLClient.client.e.d.Class450;
import net.LWJGLClient.client.model.Client;
import net.LWJGLClient.client.model.a.a.Class501;
import net.LWJGLClient.client.model.a.c.Class885;
import net.LWJGLClient.client.model.a.c.Class887;
import net.LWJGLClient.client.model.a.c.Class890;
import net.LWJGLClient.client.model.a.c.Class896;

public final class SceneGraph {
   public static int mapSizeWidth = 104;
   public Class585 Field924 = new Class585();
   private static boolean Field925 = true;
   private boolean Field926 = false;
   private boolean Field927 = false;
   public static int Field928 = 200;
   private static double Field929 = (double)200;
   private static int Field930 = 0;
   private static int Field931 = 0;
   private static double Field932 = 0.0D;
   public boolean Field933 = false;
   public boolean Field934 = false;
   public long Field935 = 0L;
   private boolean Field936;
   private int Field937;
   private int Field938;
   private int Field939;
   public int[][][] Field940;
   private Class501[][][] Field941;
   private int Field942;
   private int Field943;
   private Class890[] Field944;
   private int[][][] Field945;
   private static int Field946;
   public static int Field947;
   private static int Field948;
   private static int Field949;
   private static int Field950;
   private static int Field951;
   private static int Field952;
   private static int Field953;
   private static int Field954;
   public static int Field955;
   private static int Field956;
   public static int Field957;
   public static int Field958;
   private static int Field959;
   private static int Field960;
   private static int Field961;
   private static int Field962;
   private Class890[] Field963 = new Class890[100];
   private static int[] Field964 = new int[]{53, -53, -53, 53};
   private static int[] Field965 = new int[]{-53, -53, 53, 53};
   private static int[] Field966 = new int[]{-45, 45, 45, -45};
   private static int[] Field967 = new int[]{45, 45, -45, -45};
   private static boolean Field968;
   private static int Field969;
   private static int Field970;
   public static int Field971 = -1;
   public static int Field972 = -1;
   public static int Field973 = 0;
   private static int Field974;
   private static int[] Field975;
   private static int Field976;
   private static Class178 Field977 = new Class178();
   private static int[] Field978 = new int[]{19, 55, 38, 155, 255, 110, 137, 205, 76};
   private static int[] Field979 = new int[]{160, 192, 80, 96, 0, 144, 80, 48, 160};
   private static int[] Field980 = new int[]{76, 8, 137, 4, 0, 1, 38, 2, 19};
   private static int[] Field981 = new int[]{0, 0, 2, 0, 0, 2, 1, 1, 0};
   private static int[] Field982 = new int[]{2, 0, 0, 2, 0, 0, 0, 4, 4};
   private static int[] Field983 = new int[]{0, 4, 4, 8, 0, 0, 8, 0, 0};
   private static int[] Field984 = new int[]{1, 1, 0, 0, 0, 8, 0, 0, 8};
   public static final int[][] Field985 = new int[][]{new int[16], {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1}, {1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0}, {0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1}, {0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0}, {1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1}, {1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1}};
   public static final int[][] Field986 = new int[][]{{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15}, {12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3}, {15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0}, {3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12}};
   private static Class450[][] Field987 = null;
   private static Class450[] Field988 = null;
   private static boolean[][][][] Field989 = null;
   private static boolean[][] Field990 = null;

   static {
      if (!GraphicsDisplay.Field2678) {
         Field988 = new Class450[500];
         Field989 = new boolean[8][32][(Field928 << 1) + 1][(Field928 << 1) + 1];
      }

      Field974 = 4;
      Field975 = new int[4];
      Field987 = new Class450[Field974][500];
   }

   public final Class501 Method8845(int var1, int var2, int var3) {
      return this.Field941[var1][var2][var3];
   }

   public final Class501 Method8846(int var1, int var2, int var3) {
      return this.Method8847(var1, var2, var3, false);
   }

   private Class501 Method8847(int var1, int var2, int var3, boolean var4) {
      if (this.Field941[var1][var2][var3] == null) {
         this.Field941[var1][var2][var3] = new Class501(var1, var2, var3);
      }

      return this.Field941[var1][var2][var3];
   }

   public SceneGraph(int[][][] var1) {
      int var2 = mapSizeWidth;
      int var3 = mapSizeWidth;
      this.Field936 = true;
      this.Field944 = new Class890[5000];
      int var10000 = Model.Field2859;
      var10000 = Model.Field2859;
      this.Field937 = 4;
      this.Field938 = var3 - 1;
      this.Field939 = var2 - 1;
      this.Field941 = new Class501[4][var3][var2];
      this.Field945 = new int[4][var3 + 1][var2 + 1];
      this.Field940 = var1;
   }

   public final int Method8848(int var1, int var2, int var3) {
      Class501 var4;
      return (var4 = this.Method8846(var1, var2, var3)) != null && var4.Field12849 != null ? var4.Field12849.Field903 : 0;
   }

   public final int Method8849(int var1, int var2, int var3) {
      Class501 var4;
      return (var4 = this.Method8846(var1, var2, var3)) != null && var4.Field12850 != null ? var4.Field12850.Field423 : 0;
   }

   public static void Method8850() {
      Field975 = null;
      Field987 = null;
      Field977 = null;
      Field989 = null;
      Field990 = null;
   }

   public final void Method8851() {
      for(int var1 = 0; var1 < this.Field937; ++var1) {
         for(int var2 = 0; var2 < this.Field938; ++var2) {
            for(int var3 = 0; var3 < this.Field939; ++var3) {
               if (this.Method8846(var1, var2, var3) != null) {
                  for(int var4 = 0; var4 < this.Method8846(var1, var2, var3).Field12853; ++var4) {
                     this.Method8846(var1, var2, var3).Field12854[var4] = null;
                  }

                  this.Method8846(var1, var2, var3).Field12853 = 0;
               }
            }
         }
      }

   }

   public final void Method8852() {
      this.Method8853();
      this.Method8851();

      for(int var1 = 0; var1 < Field975.length; ++var1) {
         Field975[var1] = 0;
      }

   }

   public final void Method8853() {
      int var1;
      for(var1 = 0; var1 < Field974; ++var1) {
         int var2;
         for(var2 = 0; var2 < this.Field938; ++var2) {
            for(int var3 = 0; var3 < this.Field939; ++var3) {
               if (this.Method8845(var1, var2, var3) != null) {
                  this.Method8846(var1, var2, var3).Method14493(var2, var3, var1);
               }
            }
         }

         for(var2 = 0; var2 < Field975[var1]; ++var2) {
            if (var2 < Field987[var1].length) {
               Field987[var1][var2] = null;
            }
         }

         Field975[var1] = 0;
      }

      for(var1 = 0; var1 < this.Field943; ++var1) {
         this.Field944[var1] = null;
      }

      this.Field943 = 0;

      for(var1 = 0; var1 < this.Field963.length; ++var1) {
         this.Field963[var1] = null;
      }

   }

   public final void Method8854(int var1) {
      this.Field942 = var1;

      for(int var2 = 0; var2 < this.Field938; ++var2) {
         for(int var3 = 0; var3 < this.Field939; ++var3) {
            this.Method8846(var1, var2, var3);
         }
      }

   }

   public final void Method8855(int var1, int var2) {
      Class501 var3 = this.Method8846(0, var2, var1);

      for(int var4 = 0; var4 < 3; ++var4) {
         Class501 var5 = this.Method8845(var4 + 1, var2, var1);
         this.Field941[var4][var2][var1] = var5;
         if (var5 != null) {
            --var5.Field12842;

            for(int var6 = 0; var6 < var5.Field12853; ++var6) {
               Class890 var7;
               if ((var7 = var5.Field12854[var6]) != null && var7.Field434 == var2 && var7.Field436 == var1) {
                  --var7.Field426;
               }
            }
         }
      }

      this.Method8846(0, var2, var1).Field12852 = var3;
   }

   public static void Method8856(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      Class450 var8;
      (var8 = new Class450()).Field9089 = var1 / 128;
      var8.Field9090 = var3 / 128;
      var8.Field9091 = var6 / 128;
      var8.Field9092 = var4 / 128;
      var8.Field9093 = var7;
      var8.Field9094 = var1;
      var8.Field9095 = var3;
      var8.Field9096 = var6;
      var8.Field9097 = var4;
      var8.Field9098 = var5;
      var8.Field9099 = var2;
      Field987[var0][Field975[var0]++] = var8;
   }

   public final void Method8857(int var1, int var2, int var3, int var4) {
      if (this.Method8846(var1, var2, var3) != null) {
         this.Method8846(var1, var2, var3).Field12857 = var4;
      }

   }

   public final void Method8858(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20, int var21) {
      Class353 var22;
      if (var4 == 0) {
         var22 = new Class353(var11, var12, var13, var14, -1, var19, false, var21);
         this.Method8846(var1, var2, var3).Field12846 = var22;
      } else if (var4 != 1) {
         Class350 var23 = new Class350(var3, var15, var14, var9, var6, var17, var5, var11, var19, var13, var10, var8, var7, var4, var18, var16, var12, var2, var20, var21);
         this.Method8846(var1, var2, var3).Field12847 = var23;
      } else {
         var22 = new Class353(var15, var16, var17, var18, var6, var20, var7 == var8 && var7 == var9 && var7 == var10, var21);
         this.Method8846(var1, var2, var3).Field12846 = var22;
      }
   }

   public final void Method8859(int var1, int var2, long var3, Class511 var5, int var6, Class511 var7, Class511 var8, int var9, int var10) {
      Class46 var11;
      (var11 = new Class46()).Field2354 = 0;
      var11.Field2360 = var8;
      var11.Field2358 = (var2 << 7) + 64;
      var11.Field2359 = (var10 << 7) + 64;
      var11.Field2357 = var6;
      var11.Field2363 = var3;
      var11.Field2361 = var5;
      var11.Field2362 = var7;
      int var12 = 0;
      Class501 var4;
      if ((var4 = this.Method8846(var9, var2, var10)) != null && var4.Field12854 != null) {
         for(int var13 = 0; var13 < var4.Field12853; ++var13) {
            if (var4.Field12854[var13] != null && var4.Field12854[var13].Field430 instanceof Model && (var6 = ((Model)var4.Field12854[var13].Field430).Field2850) > var12) {
               var12 = var6;
            }
         }
      }

      var11.Field2364 = var12;
      this.Method8846(var9, var2, var10).Field12851 = var11;
   }

   public static int Method8860(byte var0) {
      int var1;
      if ((var1 = (var0 >> 6) + 4) < 0) {
         var1 = -var1;
      }

      return var1 % 4;
   }

   public final void Method8861(int var1, Class511 var2, long var3, int var5, byte var6, int var7, Class511 var8, int var9, int var10, int var11, int var12, boolean var13, boolean var14) {
      if (var2 != null || var8 != null || var14) {
         byte var10000;
         Class885 var20;
         label40: {
            var20 = new Class885();
            if (var10 != 1) {
               if (var10 == 2) {
                  var10000 = 1;
                  break label40;
               }

               if (var10 == 4) {
                  var10000 = 2;
                  break label40;
               }

               if (var10 == 8) {
                  var10000 = 3;
                  break label40;
               }
            }

            var10000 = 0;
         }

         byte var16 = var10000;
         int var15 = Method8860(var6);
         long var18 = var3 + 2305843009213693952L;
         if (var13) {
            var20.Field905 = var15 << 9;
            var20.Field906 = var16 << 9;
         } else {
            var20.Field905 = 0;
            var20.Field906 = 0;
         }

         var20.Field3080 = var3;
         var20.Field918 = var18;
         var20.Field919 = var6;
         var20.Field908 = (var7 << 7) + 64;
         var20.Field909 = (var5 << 7) + 64;
         var20.Field907 = var9;
         var20.Field911 = var20.Field908;
         var20.Field912 = var20.Field909;
         var20.Field910 = var20.Field907;
         var20.Field915 = var2;
         var20.Field916 = var8;
         var20.Field917 = var12;
         var20.Field913 = var1;
         var20.Field914 = var10;
         this.Method8846(var11, var7, var5).Field12848 = var20;
         if (var2 instanceof ObjectInstance || var8 instanceof ObjectInstance) {
            this.Method8846(var11, var7, var5).Field12840 = true;
         }

      }
   }

   public final void Method8862(long var1, int var3, int var4, int var5, int var6, int var7, Class511 var8, int var9, byte var10, int var11, int var12, int var13) {
      if (var8 != null) {
         Class887 var14;
         (var14 = new Class887()).Field3080 = var1;
         var14.Field904 = var10;
         var14.Field898 = (var9 << 7) + 64 + var6;
         var14.Field899 = (var3 << 7) + 64 + var11;
         var14.Field897 = var7;
         var14.Field902 = var8;
         var14.Field900 = var12;
         var14.Field901 = var4;
         var14.Field903 = var13;
         this.Method8846(var5, var9, var3).Field12849 = var14;
         if (var8 instanceof ObjectInstance) {
            this.Method8846(var5, var9, var3).Field12840 = true;
         }

      }
   }

   public final boolean Method8863(long var1, byte var3, int var4, int var5, Class511 var6, int var7, int var8, int var9, int var10, int var11, int var12, boolean var13) {
      if (var6 == null && !var13) {
         return true;
      } else {
         int var15 = (var11 << 7) + var7 * 64;
         int var14 = (var10 << 7) + var5 * 64;
         return this.Method8867(var8, var11, var10, var7, var5, var15, var14, var4, var6, var9, false, var1, var3, var12);
      }
   }

   public final boolean Method8864(long var1, byte var3, int var4, int var5, Class511 var6, int var7, int var8, int var9, int var10, int var11, int var12, boolean var13, int var14, int var15) {
      if (var6 == null && !var13) {
         return true;
      } else {
         int var16 = (var11 << 7) + var7 * 64 + var14;
         var14 = (var10 << 7) + var5 * 64 + var15;
         return this.Method8867(var8, var11, var10, var7, var5, var16, var14, var4, var6, var9, false, var1, var3, var12);
      }
   }

   public final boolean Method8865(int var1, int var2, int var3, long var4, int var6, int var7, int var8, Class511 var9, boolean var10) {
      if (var9 == null) {
         return true;
      } else {
         int var11 = var8 - var7;
         int var12 = var6 - var7;
         int var13 = var8 + var7;
         var7 += var6;
         if (var10) {
            if (var2 > 640 && var2 < 1408) {
               var7 += 128;
            }

            if (var2 > 1152 && var2 < 1920) {
               var13 += 128;
            }

            if (var2 > 1664 || var2 < 384) {
               var12 -= 128;
            }

            if (var2 > 128 && var2 < 896) {
               var11 -= 128;
            }
         }

         var11 /= 128;
         var12 /= 128;
         var13 /= 128;
         var7 /= 128;
         return this.Method8867(var1, var11, var12, var13 - var11 + 1, var7 - var12 + 1, var8, var6, var3, var9, var2, true, var4, (byte)0, 0);
      }
   }

   public final boolean Method8866(int var1, int var2, Class511 var3, int var4, int var5, int var6, int var7, int var8, int var9, long var10, int var12) {
      return var3 == null || this.Method8867(var1, var8, var12, var9 - var8 + 1, var5 - var12 + 1, var6, var2, var7, var3, var4, true, var10, (byte)0, 0);
   }

   private boolean Method8867(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, Class511 var9, int var10, boolean var11, long var12, byte var14, int var15) {
      int var17;
      for(int var16 = var2; var16 < var2 + var4; ++var16) {
         for(var17 = var3; var17 < var3 + var5; ++var17) {
            if (var16 < 0 || var17 < 0 || var16 >= this.Field938 || var17 >= this.Field939) {
               return false;
            }

            Class501 var18;
            if ((var18 = this.Method8847(var1, var16, var17, var11)) != null && var18.Field12853 >= 5) {
               return false;
            }
         }
      }

      Class890 var20;
      (var20 = new Class890()).Field3080 = var12;
      var20.Field441 = var14;
      var20.Field426 = var1;
      var20.Field428 = var6;
      var20.Field429 = var7;
      var20.Field427 = var8;
      var20.Field430 = var9;
      var20.Field440 = var15;
      var20.Field431 = var10;
      var20.Field434 = var2;
      var20.Field436 = var3;
      var20.Field435 = var2 + var4 - 1;
      var20.Field437 = var3 + var5 - 1;
      var20.Field425 = var11;

      for(var17 = var2; var17 < var2 + var4; ++var17) {
         for(int var21 = var3; var21 < var3 + var5; ++var21) {
            var6 = 0;
            if (var17 > var2) {
               ++var6;
            }

            if (var17 < var2 + var4 - 1) {
               var6 += 4;
            }

            if (var21 > var3) {
               var6 += 8;
            }

            if (var21 < var3 + var5 - 1) {
               var6 += 2;
            }

            Class501 var19;
            if ((var19 = this.Method8847(var1, var17, var21, var11)).Field12853 < 5) {
               var19.Field12854[var19.Field12853] = var20;
               var19.Field12855[var19.Field12853] = var6;
               var19.Field12856 |= var6;
               ++var19.Field12853;
               if (var9 instanceof ObjectInstance) {
                  var19.Field12840 = true;
               }
            }
         }
      }

      if (var11) {
         this.Field944[this.Field943++] = var20;
      }

      return true;
   }

   public final void Method8868() {
      for(int var1 = 0; var1 < this.Field943; ++var1) {
         this.Method8869(this.Field944[var1]);
         this.Field944[var1] = null;
      }

      this.Field943 = 0;
   }

   private void Method8869(Class890 var1) {
      for(int var2 = var1.Field434; var2 <= var1.Field435; ++var2) {
         for(int var3 = var1.Field436; var3 <= var1.Field437; ++var3) {
            Class501 var4;
            if ((var4 = this.Method8846(var1.Field426, var2, var3)) != null) {
               int var5;
               for(var5 = 0; var5 < var4.Field12853; ++var5) {
                  if (var4.Field12854[var5] == var1) {
                     --var4.Field12853;

                     for(int var6 = var5; var6 < var4.Field12853; ++var6) {
                        var4.Field12854[var6] = var4.Field12854[var6 + 1];
                        var4.Field12855[var6] = var4.Field12855[var6 + 1];
                     }

                     var4.Field12854[var4.Field12853] = null;
                  }
               }

               var4.Field12856 = 0;

               for(var5 = 0; var5 < var4.Field12853; ++var5) {
                  var4.Field12856 |= var4.Field12855[var5];
               }
            }
         }
      }

   }

   public final void Method8870(int var1, int var2, int var3, byte var4) {
      Class501 var5;
      if ((var5 = this.Method8846(var2, var1, var3)) != null) {
         var5.Field12848 = null;
      }

   }

   public final void Method8871(int var1, int var2, int var3) {
      Class501 var4;
      if ((var4 = this.Method8846(var2, var3, var1)) != null) {
         var4.Field12849 = null;
      }

   }

   public final void Method8872(int var1, int var2, int var3) {
      Class501 var6;
      if ((var6 = this.Method8846(var1, var2, var3)) != null) {
         for(int var4 = 0; var4 < var6.Field12853; ++var4) {
            Class890 var5;
            if ((var5 = var6.Field12854[var4]).Field434 == var2 && var5.Field436 == var3) {
               this.Method8869(var5);
               return;
            }
         }

      }
   }

   public final void Method8873(int var1, int var2, int var3) {
      Class501 var4;
      if ((var4 = this.Method8846(var1, var3, var2)) != null) {
         var4.Field12850 = null;
      }
   }

   public final void Method8874(int var1, int var2, int var3) {
      Class501 var4;
      if ((var4 = this.Method8846(var1, var2, var3)) != null) {
         var4.Field12851 = null;
      }

   }

   public final int Method8875(int var1, int var2, int var3) {
      Class501 var4;
      return (var4 = this.Method8846(var1, var2, var3)) != null && var4.Field12848 != null ? var4.Field12848.Field917 : 0;
   }

   public final int Method8876(int var1, int var2, int var3) {
      Class501 var6;
      if ((var6 = this.Method8846(var1, var2, var3)) == null) {
         return 0;
      } else {
         for(int var4 = 0; var4 < var6.Field12853; ++var4) {
            Class890 var5;
            if ((var5 = var6.Field12854[var4]) != null && var5.Field434 == var2 && var5.Field436 == var3) {
               return var5.Field440;
            }
         }

         return 0;
      }
   }

   public final int Method8877(int var1, int var2, int var3) {
      Class501 var4;
      if ((var4 = this.Method8846(var1, var2, var3)) == null) {
         return 0;
      } else {
         return var4.Field12850 != null ? var4.Field12850.Field423 : 0;
      }
   }

   public final int Method8878(int var1, int var2, int var3, long var4) {
      Class501 var6;
      if ((var6 = this.Method8845(var1, var2, var3)) == null) {
         return -1;
      } else {
         Class501 var7;
         if (var6.Field12852 != null && (var7 = this.Method8845(var1 + 1, var2, var3)) != null) {
            var6 = var7;
         }

         if (var6.Field12848 != null && var6.Field12848.Field3080 == var4) {
            return var6.Field12848.Field919 & 255;
         } else if (var6.Field12849 != null && var6.Field12849.Field3080 == var4) {
            return var6.Field12849.Field904 & 255;
         } else if (var6.Field12850 != null && var6.Field12850.Field3080 == var4) {
            return var6.Field12850.Field424 & 255;
         } else {
            for(var1 = 0; var1 < var6.Field12853; ++var1) {
               if (var6.Field12854[var1].Field3080 == var4 && (var2 = var6.Field12854[var1].Field441 & 255) > 0) {
                  return var2;
               }
            }

            return -1;
         }
      }
   }

   public final int Method8879(int var1, int var2, int var3, int var4) {
      Class501 var5;
      if ((var5 = this.Method8846(var1, var2, var3)) == null) {
         return -1;
      } else if (var5.Field12848 != null && var5.Field12848.Field917 == var4) {
         return var5.Field12848.Field919 & 255;
      } else if (var5.Field12849 != null && var5.Field12849.Field903 == var4) {
         return var5.Field12849.Field904 & 255;
      } else if (var5.Field12850 != null && var5.Field12850.Field423 == var4) {
         return var5.Field12850.Field424 & 255;
      } else {
         if (var5.Field12854 != null) {
            for(var2 = 0; var2 < var5.Field12853; ++var2) {
               if (var5.Field12854[var2].Field440 == var4) {
                  return var5.Field12854[var2].Field441 & 255;
               }
            }
         }

         return -1;
      }
   }

   public final void Method8880(int var1, int var2, int var3) {
      for(var1 = 0; var1 < this.Field937; ++var1) {
         for(var2 = 0; var2 < this.Field938; ++var2) {
            for(var3 = 0; var3 < this.Field939; ++var3) {
               Class501 var4;
               if ((var4 = this.Method8846(var1, var2, var3)) != null) {
                  Class885 var5 = var4.Field12848;
                  if (var4.Field12848 != null && var5.Field915 != null && var5.Field915.Field10126 != null) {
                     this.Method8881(var1, 1, 1, var2, var3, (Model)var5.Field915);
                     if (var5.Field916 != null && var5.Field916.Field10126 != null) {
                        this.Method8881(var1, 1, 1, var2, var3, (Model)var5.Field916);
                        ((Model)var5.Field916).Method14503(100, 343, -50, -10, -50);
                     }

                     ((Model)var5.Field915).Method14503(100, 343, -50, -10, -50);
                  }

                  for(int var7 = 0; var7 < var4.Field12853; ++var7) {
                     Class890 var6;
                     if ((var6 = var4.Field12854[var7]) != null && var6.Field430 != null && var6.Field430.Field10126 != null) {
                        this.Method8881(var1, var6.Field435 - var6.Field434 + 1, var6.Field437 - var6.Field436 + 1, var2, var3, (Model)var6.Field430);
                        ((Model)var6.Field430).Method14503(100, 343, -50, -10, -50);
                     }
                  }

                  Class896 var8 = var4.Field12850;
                  if (var4.Field12850 != null && var8.Field422 != null && var8.Field422.Field10126 != null) {
                     ((Model)var8.Field422).Method14503(100, 343, -50, -10, -50);
                  }
               }
            }
         }
      }

   }

   private void Method8881(int var1, int var2, int var3, int var4, int var5, Model var6) {
      boolean var15 = true;
      int var7 = var4;
      var2 += var4;
      int var8 = var5 - 1;
      var3 += var5;

      for(int var9 = var1; var9 <= var1 + 1; ++var9) {
         if (var9 != this.Field937) {
            for(int var10 = var7; var10 <= var2; ++var10) {
               if (var10 >= 0 && var10 < this.Field938) {
                  for(int var11 = var8; var11 <= var3; ++var11) {
                     Class501 var12;
                     if (var11 >= 0 && var11 < this.Field939 && (!var15 || var10 >= var2 || var11 >= var3 || var11 < var5 && var10 != var4) && (var12 = this.Method8846(var9, var10, var11)) != null) {
                        Class885 var13 = var12.Field12848;
                        Class445[] var10000;
                        if (var12.Field12848 != null && var13.Field915 != null) {
                           var10000 = var13.Field915.Field10126;
                        }

                        if (var13 != null && var13.Field916 != null) {
                           var10000 = var13.Field916.Field10126;
                        }

                        for(int var16 = 0; var16 < var12.Field12853; ++var16) {
                           Class890 var14;
                           if ((var14 = var12.Field12854[var16]) != null && var14.Field430 != null) {
                              var10000 = var14.Field430.Field10126;
                           }
                        }
                     }
                  }
               }
            }

            --var7;
            var15 = false;
         }
      }

   }

   public final void Method8882(int[] var1, int var2, int var3, int var4, int var5, int var6) {
      int var7 = var6;
      var6 = var5;
      var5 = var4;
      var4 = var3;
      Class501[][][] var10001 = this.Field941;
      var7 = var7;
      var3 = var2;
      int[] var17 = var1;
      Class501[][][] var15 = this.Field941;
      if (var6 < mapSizeWidth - 2 && var5 < mapSizeWidth - 2) {
         Class501 var8;
         if ((var8 = var15[var4][var5][var6]) == null) {
            if (var4 < 3) {
               var8 = var15[var4 + 1][var5][var6];
            }

            if (var8 == null) {
               return;
            }
         }

         Class353 var16 = var8.Field12846;
         if (var8.Field12846 == null && var8.Field12852 != null) {
            var16 = var8.Field12852.Field12846;
         }

         int var21;
         if (var16 != null) {
            if (var16.Field1471 != 12345678) {
               var4 = var16.Field1471 & -128;
               var5 = var16.Field1471 & 127;
               var6 = var16.Field1470 & 127;
               var21 = (var16.Field1468 & 127) - var5;
               int var9 = (var16.Field1469 & 127) - var6;
               var5 <<= 2;
               var6 <<= 2;

               for(int var10 = 0; var10 < 4; ++var10) {
                  var17[var3] = Rasterizer.Field9964[var4 | var5 >> 2];
                  var17[var3 + 1] = Rasterizer.Field9964[var4 | var5 * 3 + var6 >> 4];
                  var17[var3 + 2] = Rasterizer.Field9964[var4 | var5 + var6 >> 3];
                  var17[var3 + 3] = Rasterizer.Field9964[var4 | var5 + var6 * 3 >> 4];
                  var5 += var21;
                  var6 += var9;
                  var3 += var7;
               }

               return;
            }

            int var18;
            if ((var18 = var16.Field1474) <= 0 && var8.Field12852 != null && var8.Field12852.Field12846 != null) {
               var18 = var8.Field12852.Field12846.Field1474;
            }

            if (var18 != 0) {
               for(var4 = 0; var4 < 4; ++var4) {
                  var17[var3] = var18;
                  var17[var3 + 1] = var18;
                  var17[var3 + 2] = var18;
                  var17[var3 + 3] = var18;
                  var3 += var7;
               }

               return;
            }
         } else {
            Class350 var19 = var8.Field12847;
            if (var8.Field12847 != null) {
               var4 = var19.Field2177;
               var5 = var19.Field2178;
               var6 = var19.Field2179;
               var21 = var19.Field2181;
               int[] var20 = Field985[var4];
               int[] var22 = Field986[var5];
               var4 = 0;
               if (var19.Field2162 != 12345678) {
                  var5 = var19.Field2162 & -128;
                  var21 = var19.Field2165 & 127;
                  int var11 = var19.Field2164 & 127;
                  int var12 = (var19.Field2162 & 127) - var21;
                  int var13 = (var19.Field2163 & 127) - var11;
                  var21 <<= 2;
                  var11 <<= 2;

                  int var14;
                  for(var14 = 0; var14 < 4; ++var14) {
                     int[] var10000 = var19.Field2175;
                     if (var20[var22[var4++]] != 0) {
                        var17[var3] = Rasterizer.Field9964[var5 | var21 >> 2];
                     }

                     if (var20[var22[var4++]] != 0) {
                        var17[var3 + 1] = Rasterizer.Field9964[var5 | var21 * 3 + var11 >> 4];
                     }

                     if (var20[var22[var4++]] != 0) {
                        var17[var3 + 2] = Rasterizer.Field9964[var5 | var21 + var11 >> 3];
                     }

                     if (var20[var22[var4++]] != 0) {
                        var17[var3 + 3] = Rasterizer.Field9964[var5 | var21 + var11 * 3 >> 4];
                     }

                     var21 += var12;
                     var11 += var13;
                     var3 += var7;
                  }

                  if (var6 != 0 && var19.Field2158 != 12345678) {
                     var3 -= var7 << 2;
                     var4 -= 16;
                     var5 = var19.Field2158 & -128;
                     var21 = var19.Field2161 & 127;
                     var11 = var19.Field2160 & 127;
                     var12 = (var19.Field2158 & 127) - var21;
                     var13 = (var19.Field2159 & 127) - var11;
                     var21 <<= 2;
                     var11 <<= 2;

                     for(var14 = 0; var14 < 4; ++var14) {
                        if (var20[var22[var4++]] == 0) {
                           var17[var3] = Rasterizer.Field9964[var5 | var21 >> 2];
                        }

                        if (var20[var22[var4++]] == 0) {
                           var17[var3 + 1] = Rasterizer.Field9964[var5 | var21 * 3 + var11 >> 4];
                        }

                        if (var20[var22[var4++]] == 0) {
                           var17[var3 + 2] = Rasterizer.Field9964[var5 | var21 + var11 >> 3];
                        }

                        if (var20[var22[var4++]] == 0) {
                           var17[var3 + 3] = Rasterizer.Field9964[var5 | var21 + var11 * 3 >> 4];
                        }

                        var21 += var12;
                        var11 += var13;
                        var3 += var7;
                     }
                  }

                  return;
               }

               if (var6 != 0) {
                  for(var5 = 0; var5 < 4; ++var5) {
                     var17[var3] = var20[var22[var4++]] != 0 ? var21 : var6;
                     var17[var3 + 1] = var20[var22[var4++]] != 0 ? var21 : var6;
                     var17[var3 + 2] = var20[var22[var4++]] != 0 ? var21 : var6;
                     var17[var3 + 3] = var20[var22[var4++]] != 0 ? var21 : var6;
                     var3 += var7;
                  }

                  return;
               }

               for(var5 = 0; var5 < 4; ++var5) {
                  if (var20[var22[var4++]] != 0) {
                     var17[var3] = var21;
                  }

                  if (var20[var22[var4++]] != 0) {
                     var17[var3 + 1] = var21;
                  }

                  if (var20[var22[var4++]] != 0) {
                     var17[var3 + 2] = var21;
                  }

                  if (var20[var22[var4++]] != 0) {
                     var17[var3 + 3] = var21;
                  }

                  var3 += var7;
               }
            }
         }
      }

   }

   public static void Method8883() {
   }

   public final void Method8884(int var1, int var2) {
      if (!this.Field927) {
         this.Field927 = true;
         Field969 = var2;
         Field970 = var1;
      }
   }

   public static void Method8885(int var0) {
      Field928 = 50;
      Field929 = 50.0D;
   }

   public final void Method8886(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
      if (var6 < 0) {
         var6 = 0;
      }

      ObjectDefinition.Field10548 = 0;
      Model.Field2810 = Model.Field2811;
      Model.Field2809.clear();
      if (!Client.Field12593) {
         Field928 = 80;
      } else {
         var10 = Client.Field12117;
         if (GraphicsDisplay.Field2678 && GraphicsDisplay.Field2667) {
            if (var10 > 60 && Client.Method13313()) {
               Field929 = 60.0D;
               Field928 = 60;
            } else if ((long)var10 != Math.round(Field929)) {
               double var12 = Class511.Method8268((double)var10 - Field929) / 30.0D;
               Field928 = (int)Math.round(Field929 += var12);
            }
         } else {
            Field928 = var10;
         }

         if (!GraphicsDisplay.Field2678 || !GraphicsDisplay.Field2667) {
            Field929 = (double)(Field928 -= 10);
         }
      }

      boolean var10000 = Client.Field12087;
      if (var1 < 0) {
         var1 = 0;
      } else if (var1 >= this.Field938 << 7) {
         var1 = (this.Field938 << 7) - 1;
      }

      if (var2 < 0) {
         var2 = 0;
      } else if (var2 >= this.Field939 << 7) {
         var2 = (this.Field939 << 7) - 1;
      }

      ++Field948;
      Field959 = Rasterizer.Field9959[var6];
      Field960 = Rasterizer.Field9960[var6];
      Field961 = Rasterizer.Field9959[var3];
      Field962 = Rasterizer.Field9960[var3];
      if ((var10 = var6 - 128) < 0) {
         var10 = 0;
      }

      Field955 = var1;
      Field956 = var6;
      Field957 = var4;
      Field958 = var2;
      Field953 = var1 / 128;
      Field954 = var2 / 128;
      int var23 = Field928 / 2;
      Field930 = var7;
      Field931 = var8;
      if (this.Field933) {
         Field930 = Field953;
         Field931 = Field954;
      }

      int var13 = Field930;
      var1 = Field931;
      if (!Client.Field12593) {
         var13 = Field930 = Field953;
         var1 = Field931 = Field954;
      }

      Field947 = var5;
      if ((Field949 = var13 - var23) < 0) {
         Field949 = 0;
      }

      if ((Field951 = var1 - var23) < 0) {
         Field951 = 0;
      }

      if ((Field950 = var13 + var23) > this.Field938) {
         Field950 = this.Field938;
      }

      if ((Field952 = var1 + var23) > this.Field939) {
         Field952 = this.Field939;
      }

      int var11;
      boolean var25;
      if (Field989 != null) {
         Field990 = Field989[var10 / 32][var3 / 64];
         var1 = Field975[Field947];
         Class450[] var17 = Field987[Field947];
         Field976 = 0;

         for(var3 = 0; var3 < var1; ++var3) {
            Class450 var19;
            if ((var19 = var17[var3]) != null) {
               if (var19.Field9093 == 1) {
                  if ((var6 = var19.Field9089 - Field953 + Field928) >= 0 && var6 <= Field928 << 1) {
                     if ((var7 = var19.Field9091 - Field954 + Field928) < 0) {
                        var7 = 0;
                     }

                     if ((var8 = var19.Field9092 - Field954 + Field928) > Field928 << 1) {
                        var8 = Field928 << 1;
                     }

                     var25 = false;

                     while(var7 <= var8) {
                        if (Field990[var6][var7++]) {
                           var25 = true;
                           break;
                        }
                     }

                     if (var25) {
                        if ((var11 = Field955 - var19.Field9094) > 32) {
                           var19.Field9100 = 1;
                        } else {
                           if (var11 >= -32) {
                              continue;
                           }

                           var19.Field9100 = 2;
                           var11 = -var11;
                        }

                        var19.Field9103 = (var19.Field9096 - Field958 << 8) / var11;
                        var19.Field9104 = (var19.Field9097 - Field958 << 8) / var11;
                        var19.Field9105 = (var19.Field9098 - Field957 << 8) / var11;
                        var19.Field9106 = (var19.Field9099 - Field957 << 8) / var11;
                        Field988[Field976++] = var19;
                     }
                  }
               } else if (var19.Field9093 == 2) {
                  if ((var6 = var19.Field9091 - Field954 + Field928) >= 0 && var6 <= Field928 << 1) {
                     if ((var7 = var19.Field9089 - Field953 + Field928) < 0) {
                        var7 = 0;
                     }

                     if ((var8 = var19.Field9090 - Field953 + Field928) > Field928 << 1) {
                        var8 = Field928 << 1;
                     }

                     var25 = false;

                     while(var7 <= var8) {
                        if (Field990[var7++][var6]) {
                           var25 = true;
                           break;
                        }
                     }

                     if (var25) {
                        if ((var11 = Field958 - var19.Field9096) > 32) {
                           var19.Field9100 = 3;
                        } else {
                           if (var11 >= -32) {
                              continue;
                           }

                           var19.Field9100 = 4;
                           var11 = -var11;
                        }

                        var19.Field9101 = (var19.Field9094 - Field955 << 8) / var11;
                        var19.Field9102 = (var19.Field9095 - Field955 << 8) / var11;
                        var19.Field9105 = (var19.Field9098 - Field957 << 8) / var11;
                        var19.Field9106 = (var19.Field9099 - Field957 << 8) / var11;
                        Field988[Field976++] = var19;
                     }
                  }
               } else if (var19.Field9093 == 4 && (var6 = var19.Field9098 - Field957) > 128) {
                  if ((var7 = var19.Field9091 - Field954 + Field928) < 0) {
                     var7 = 0;
                  }

                  if ((var8 = var19.Field9092 - Field954 + Field928) > Field928 << 1) {
                     var8 = Field928 << 1;
                  }

                  if (var7 <= var8) {
                     if ((var10 = var19.Field9089 - Field953 + Field928) < 0) {
                        var10 = 0;
                     }

                     if ((var11 = var19.Field9090 - Field953 + Field928) > Field928 << 1) {
                        var11 = Field928 << 1;
                     }

                     boolean var24 = false;

                     label519:
                     for(var10 = var10; var10 <= var11; ++var10) {
                        for(var13 = var7; var13 <= var8; ++var13) {
                           if (Field990[var10][var13]) {
                              var24 = true;
                              break label519;
                           }
                        }
                     }

                     if (var24) {
                        var19.Field9100 = 5;
                        var19.Field9101 = (var19.Field9094 - Field955 << 8) / var6;
                        var19.Field9102 = (var19.Field9095 - Field955 << 8) / var6;
                        var19.Field9103 = (var19.Field9096 - Field958 << 8) / var6;
                        var19.Field9104 = (var19.Field9097 - Field958 << 8) / var6;
                        Field988[Field976++] = var19;
                     }
                  }
               }
            }
         }
      }

      Field946 = 0;
      if (!Client.Field12593) {
         this.Field937 = 4;
         if (GraphicsDisplay.Field2678 && GraphicsDisplay.Field2667) {
            Field928 = 70;
         } else {
            Field928 = 50;
         }
      }

      var1 = 4;
      if (this.Field927) {
         Field968 = true;
         Field971 = -1;
         Field972 = -1;
         Field973 = 0;
         this.Field927 = false;
      }

      var2 = mapSizeWidth / 4;
      if (GraphicsDisplay.Field2678 && GraphicsDisplay.Field2667) {
         Class843.Method14007();
         var10000 = Class843.Field3772;
         Class598 var32 = Class843.Field3769;
         ModelLoader var18 = Class838.Field6956;
         if (!Rasterizer.Field9942 && Client.Field12068 <= 0) {
            var18.Field3156 = true;
         }
      }

      boolean var20 = GraphicsDisplay.Field2678;
      var4 = 0;

      int var14;
      for(var6 = this.Field942; var6 < this.Field937; ++var6) {
         Class501[][] var21 = this.Field941[var6];

         for(var8 = Field949; var8 < Field950; ++var8) {
            for(var10 = Field951; var10 < Field952; ++var10) {
               var11 = var8 - Field930;
               var23 = var10 - Field931;
               Field932 = Math.sqrt((double)(var11 * var11 + var23 * var23));
               var14 = Client.Method13204(var8, var10);
               Class501 var15;
               if ((Field930 == 0 || Field931 == 0 || Field932 < Field929 * 0.5D) && (var15 = var21[var8][var10]) != null) {
                  if (this.Field934 && var15.Field12854 != null) {
                     Class890[] var26 = var15.Field12854;
                     var23 = var15.Field12854.length;

                     for(var11 = 0; var11 < var23; ++var11) {
                        Class890 var16;
                        if ((var16 = var26[var11]) != null && !var16.Field425) {
                           ++var4;
                        }
                     }
                  }

                  if ((!Client.Field12125 || var15.Field12857 == var9) && (!Client.Field12126 || var15.Field12857 <= var9)) {
                     boolean var29 = var15.Field12857 > var5 || !GraphicsDisplay.Field2678 && var15.Field12845 > var5 + 1;
                     if (Client.Field12124) {
                        var29 &= var14 < 20;
                     }

                     var10000 = Client.Field12593 && (var29 || Client.Field12123 && var15.Field12857 > var5) && !Client.Field12127;
                     boolean var27 = Client.Field12593 && (var29 || Client.Field12123 && var15.Field12857 > var5) && !Client.Field12127;
                     if (var10000 && var6 < var1) {
                        var1 = var6;
                     }

                     if (GraphicsDisplay.Field2678 && GraphicsDisplay.Field2667) {
                        var15.Field12858 = true;
                        var15.Field12859 = true;
                        var15.Field12841 = var27;
                        var15.Field12860 = var15.Field12853 > 0;
                        ++Field946;
                     } else if (var27) {
                        var15.Field12858 = false;
                        var15.Field12859 = false;
                        var15.Field12861 = 0;
                     } else {
                        var15.Field12858 = true;
                        var15.Field12859 = true;
                        var15.Field12860 = var15.Field12853 > 0;
                        ++Field946;
                     }

                     if (var20) {
                        this.Method8887(var15, true, var5);
                     }
                  }
               }
            }
         }
      }

      if (!var20) {
         for(var7 = this.Field942; var7 < this.Field937; ++var7) {
            Class501[][] var22 = this.Field941[var7];

            for(var10 = -Field928; var10 <= 0; ++var10) {
               var11 = Field953 + var10;
               var23 = Field953 - var10;
               if (var11 >= Field949 || var23 < Field950) {
                  for(var13 = -Field928; var13 <= 0; ++var13) {
                     var14 = Field954 + var13;
                     int var28 = Field954 - var13;
                     Class501 var30;
                     if (var11 >= Field949) {
                        if (var14 >= Field951 && (var30 = var22[var11][var14]) != null && var30.Field12858) {
                           this.Method8888(var30, true, var5);
                        }

                        if (var28 < Field952 && (var30 = var22[var11][var28]) != null && var30.Field12858) {
                           this.Method8888(var30, true, var5);
                        }
                     }

                     if (var23 < Field950) {
                        if (var14 >= Field951 && (var30 = var22[var23][var14]) != null && var30.Field12858) {
                           this.Method8888(var30, true, var5);
                        }

                        if (var28 < Field952 && (var30 = var22[var23][var28]) != null && var30.Field12858) {
                           this.Method8888(var30, true, var5);
                        }
                     }
                  }
               }
            }
         }
      }

      if (GraphicsDisplay.Field2678 && GraphicsDisplay.Field2667) {
         Class838.Method13936();

         for(var8 = this.Field942; var8 < this.Field937; ++var8) {
            var25 = true;
            if ((Client.Field12123 || Client.Field12125) && !Client.Field12128 && var8 > var5 || Client.Field12125 && var8 != var9 || Client.Field12126 && var8 > var9 || var8 >= var1 || var8 < this.Field942) {
               var25 = false;
            }

            if ((!Client.Field12125 && !Client.Field12126 || var25) && (Client.Field12069 || var25)) {
               for(var11 = 0; var11 < mapSizeWidth; var11 += var2) {
                  for(var23 = 0; var23 < mapSizeWidth; var23 += var2) {
                     var13 = var11 + var2 / 2 - Field930;
                     var14 = var23 + var2 / 2 - Field931;
                     if ((Field932 = Math.sqrt((double)(var13 * var13 + var14 * var14)) - (double)var2) <= (Field929 - 1.0D) / 2.0D) {
                        Class838.Method13935(var8, this, var11, var23, var2, false, var25);
                     }
                  }
               }
            }
         }
      }

      if (this.Field934 && System.currentTimeMillis() - this.Field935 > 1000L) {
         this.Field934 = false;
         if (var4 <= 16 && !Client.Field12596) {
            Client.Field12237 = true;
            Client.Field12290 = true;
            System.out.println("[WorldController]: ground null: " + var4 + ", reloading map...");
            System.out.println("[WorldController]: player: " + Client.session_player + ", " + Client.session_player.Field4194 + "/" + Client.session_player.Field4195 + "; " + Client.Field12490 + "/" + Client.Field12491);
         }
      }

      Field968 = false;
   }

   private void Method8887(Class501 var1, boolean var2, int var3) {
      if (var1 != null) {
         int var4 = var1.Field12843;
         int var5 = var1.Field12844;
         int var6 = var1.Field12857;
         int var10000 = Model.Field2798;
         if (GraphicsDisplay.Field2678 && GraphicsDisplay.Field2667 && Client.Field12218 != null && !Client.Field12218.Method8825()) {
            boolean var7 = this.Method8893(0, var4, var5) || var1.Field12841;
            var1.Method8186(var4, var5, var6, var7);
         }

         if (var1.Field12852 != null) {
            var1.Field12852.Field12858 = true;
            var1.Field12852.Field12860 = true;
            this.Method8887(var1.Field12852, var2, var3);
         }

         if (var1.Field12858) {
            var1.Field12858 = false;
            if (!GraphicsDisplay.Field2667 || Field968) {
               if (var1.Field12846 != null && (Field925 || !this.Method8893(var6, var4, var5))) {
                  this.Method8890(var1, var1.Field12846, var6, Field959, Field960, Field961, Field962, var4, var5);
               }

               if (var1.Field12847 != null && (Field925 || !this.Method8893(var6, var4, var5))) {
                  this.Method8891(var1, var4, Field959, Field961, var1.Field12847, Field960, var5, Field962, var6);
               }
            }

            Class896 var15 = var1.Field12850;
            if (var1.Field12850 != null && var15.Field422 != null && (!Class569.Field471 || Class569.Field471 && !var15.Field414)) {
               var15.Field422.Method14515(var4, var5, var6, 0 + var15.Field416, var15.Field417, var15.Field418, Field959, Field960, Field961, Field962, var15.Field420 - Field955, var15.Field419 - Field957, var15.Field421 - Field958, var15.Field3080, var15.Field423, 0);
            }

            Class46 var16 = var1.Field12851;
            if (var1.Field12851 != null) {
               long var10 = var16.Field2363;
               if (var16.Field2360 != null) {
                  var16.Field2355 = (int)var16.Field2360.Field10116;
                  var16.Field2356 = (int)var16.Field2360.Field10117;
               }

               if (var16.Field2361 != null) {
                  var16.Field2361.Method14515(var4, var5, var6, 0, var16.Field2355, var16.Field2356, Field959, Field960, Field961, Field962, var16.Field2358 - Field955, var16.Field2357 - Field957 - var16.Field2354, var16.Field2359 - Field958, var10 + 4611686018427387904L, 0, 0);
               }

               if (var16.Field2362 != null) {
                  var16.Field2362.Method14515(var4, var5, var6, 0, var16.Field2355, var16.Field2356, Field959, Field960, Field961, Field962, var16.Field2358 - Field955, var16.Field2357 - Field957 - var16.Field2354, var16.Field2359 - Field958, var10 + 2305843009213693952L, 0, 0);
               }

               if (var16.Field2360 != null) {
                  var16.Field2360.Method14515(var4, var5, var6, 0, var16.Field2355, var16.Field2356, Field959, Field960, Field961, Field962, var16.Field2358 - Field955, var16.Field2357 - Field957 - var16.Field2354, var16.Field2359 - Field958, var10, 0, 0);
               }
            }

            Class885 var17 = var1.Field12848;
            if (var1.Field12848 != null) {
               if (var17.Field915 != null) {
                  var17.Field915.Method14515(var4, var5, var6, var17.Field905, 0, 0, Field959, Field960, Field961, Field962, var17.Field908 - Field955, var17.Field907 - Field957, var17.Field909 - Field958, var17.Field3080, var17.Field917, 0);
               }

               if (var17.Field916 != null) {
                  var17.Field916.Method14515(var4, var5, var6, var17.Field906, 0, 0, Field959, Field960, Field961, Field962, var17.Field911 - Field955, var17.Field910 - Field957, var17.Field912 - Field958, var17.Field918, var17.Field917, 0);
               }
            }

            int var8;
            int var9;
            int var11;
            int var12;
            int var13;
            int var21;
            int var24;
            if (var1.Field12860) {
               var24 = var1.Field12853;
               var1.Field12860 = false;
               var11 = 0;

               int var18;
               for(var18 = 0; var18 < var24; ++var18) {
                  Class890 var19;
                  if ((var19 = var1.Field12854[var18]) != null && var19.Field439 != Field948) {
                     this.Field963[var11++] = var19;
                     var21 = Field953 - var19.Field434;
                     if ((var8 = var19.Field435 - Field953) > var21) {
                        var21 = var8;
                     }

                     var9 = Field954 - var19.Field436;
                     if ((var12 = var19.Field437 - Field954) > var9) {
                        var19.Field438 = var21 + var12;
                     } else {
                        var19.Field438 = var21 + var9;
                     }
                  }
               }

               while(var11 > 0) {
                  var18 = -50;
                  var3 = -1;

                  for(var21 = 0; var21 < var11; ++var21) {
                     Class890 var22;
                     if ((var22 = this.Field963[var21]) != null && var22.Field439 != Field948) {
                        if (var22.Field438 > var18) {
                           var18 = var22.Field438;
                           var3 = var21;
                        } else if (var22.Field438 == var18) {
                           var9 = var22.Field428 - Field955;
                           var12 = var22.Field429 - Field958;
                           var24 = this.Field963[var3].Field428 - Field955;
                           var13 = this.Field963[var3].Field429 - Field958;
                           if (var9 * var9 + var12 * var12 > var24 * var24 + var13 * var13) {
                              var3 = var21;
                           }
                        }
                     }
                  }

                  Class890 var23;
                  if (var3 == -1 || (var23 = this.Field963[var3]) == null || var23.Field430 == null) {
                     break;
                  }

                  var23.Field439 = Field948;
                  if (!this.Method8896(var6, var23.Field434, var23.Field435, var23.Field436, var23.Field437, var23.Field430.Field10127)) {
                     var12 = 0;
                     if (this.Field933 && var23.Field425) {
                        var10000 = Client.Field12497;
                        var10000 = Client.Field12498;
                        var24 = var23.Field434;
                        var13 = var23.Field436;
                        if (this.Field940 != null && var24 >= 0 && var13 >= 0 && var24 <= 104 && var13 <= 104) {
                           var12 = this.Field940[var23.Field426][var24][var13] - this.Field940[var23.Field426][var23.Field434][var23.Field436];
                        }
                     }

                     if (var23.Field425 && var23.Field427 == -336) {
                        var24 = Client.Field12490 + var4;
                        var13 = Client.Field12491 + var5;
                        if (var24 >= 3142 && var13 >= 3469 && var24 <= 3187 && var13 <= 3514) {
                           var23.Field427 = -326;
                        }
                     }

                     var23.Field432 = (int)var23.Field430.Field10116;
                     var23.Field433 = (int)var23.Field430.Field10117;
                     var23.Field430.Method14515(var4, var5, var6, var23.Field431, var23.Field432, var23.Field433, Field959, Field960, Field961, Field962, var23.Field428 - Field955, var23.Field427 - Field957 + var12, var23.Field429 - Field958, var23.Field3080, var23.Field440, 0);
                  }
               }
            }

            var1.Field12859 = false;
            --Field946;
            var24 = 0;
            var11 = 0;
            Class887 var20 = var1.Field12849;
            if (var1.Field12849 != null) {
               if (Field953 == var4) {
                  ++var24;
               } else if (Field953 < var4) {
                  var24 += 2;
               }

               if (Field954 == var5) {
                  var24 += 3;
               } else if (Field954 > var5) {
                  var24 += 6;
               }

               var11 = Field978[var24];
               var1.Field12864 = Field980[var24];
            }

            if (var20 != null) {
               if ((var20.Field900 & var11) != 0) {
                  var20.Field902.Method14515(var4, var5, var6, var20.Field901, 0, 0, Field959, Field960, Field961, Field962, var20.Field898 - Field955, var20.Field897 - Field957, var20.Field899 - Field958, var20.Field3080, var20.Field903, 0);
                  return;
               }

               if ((var20.Field900 & 768) != 0) {
                  var3 = var20.Field898 - Field955;
                  var21 = var20.Field897 - Field957;
                  var8 = var20.Field899 - Field958;
                  var9 = var20.Field901;
                  if (var20.Field901 != 1 && var9 != 2) {
                     var12 = var3;
                  } else {
                     var12 = -var3;
                  }

                  if (var9 != 2 && var9 != 3) {
                     var24 = var8;
                  } else {
                     var24 = -var8;
                  }

                  int var14;
                  if ((var20.Field900 & 256) != 0 && var24 >= var12) {
                     var13 = var3 + Field964[var9];
                     var14 = var8 + Field965[var9];
                     var20.Field902.Method14515(var4, var5, var6, (var9 << 9) + 256, 0, 0, Field959, Field960, Field961, Field962, var13, var21, var14, var20.Field3080, var20.Field903, 0);
                  }

                  if ((var20.Field900 & 512) != 0 && var24 <= var12) {
                     var13 = var3 + Field966[var9];
                     var14 = var8 + Field967[var9];
                     var20.Field902.Method14515(var4, var5, var6, (var9 << 9) + 1280 & 2047, 0, 0, Field959, Field960, Field961, Field962, var13, var21, var14, var20.Field3080, var20.Field903, 0);
                  }
               }
            }

         }
      }
   }

   private void Method8888(Class501 var1, boolean var2, int var3) {
      Class178 var18 = Field977;
      int var10000 = Model.Field2798;
      var18.Method1845(var1);

      while(true) {
         int var4;
         int var5;
         int var6;
         Class501[][] var7;
         Class501 var8;
         int var10;
         int var13;
         int var14;
         int var15;
         int var16;
         int var17;
         int var22;
         int var24;
         do {
            do {
               do {
                  do {
                     do {
                        do {
                           while(true) {
                              Class885 var9;
                              Class890 var11;
                              int var19;
                              boolean var20;
                              Class501 var29;
                              while(true) {
                                 do {
                                    if ((var1 = (Class501)var18.Method1846()) == null) {
                                       return;
                                    }
                                 } while(!var1.Field12859);

                                 var3 = var1.Field12843;
                                 var4 = var1.Field12844;
                                 var5 = var1.Field12842;
                                 var6 = var1.Field12845;
                                 var7 = this.Field941[var5];
                                 if (!var1.Field12858) {
                                    break;
                                 }

                                 if ((var5 <= 0 || (var8 = this.Field941[var5 - 1][var3][var4]) == null || !var8.Field12859) && (var3 > Field953 || var3 <= Field949 || (var8 = var7[var3 - 1][var4]) == null || !var8.Field12859 || !var8.Field12858 && (var1.Field12856 & 1) != 0) && (var3 < Field953 || var3 >= Field950 - 1 || (var8 = var7[var3 + 1][var4]) == null || !var8.Field12859 || !var8.Field12858 && (var1.Field12856 & 4) != 0) && (var4 > Field954 || var4 <= Field951 || (var8 = var7[var3][var4 - 1]) == null || !var8.Field12859 || !var8.Field12858 && (var1.Field12856 & 8) != 0) && (var4 < Field954 || var4 >= Field952 - 1 || (var8 = var7[var3][var4 + 1]) == null || !var8.Field12859 || !var8.Field12858 && (var1.Field12856 & 2) != 0)) {
                                    var1.Field12858 = false;
                                    if (var1.Field12852 != null) {
                                       var8 = var1.Field12852;
                                       if (var1.Field12852.Field12846 != null) {
                                          if (Field925 || !this.Method8893(0, var3, var4)) {
                                             this.Method8890(var8, var8.Field12846, 0, Field959, Field960, Field961, Field962, var3, var4);
                                          }
                                       } else if (var8.Field12847 != null && (Field925 || !this.Method8893(0, var3, var4))) {
                                          this.Method8891(var8, var3, Field959, Field961, var8.Field12847, Field960, var4, Field962, 0);
                                       }

                                       var9 = var8.Field12848;
                                       if (var8.Field12848 != null) {
                                          var9.Field915.Method14515(var3, var4, var6, 0, 0, 0, Field959, Field960, Field961, Field962, var9.Field908 - Field955, var9.Field907 - Field957, var9.Field909 - Field958, var9.Field3080, var9.Field917, 0);
                                       }

                                       for(var10 = 0; var10 < var8.Field12853; ++var10) {
                                          if ((var11 = var8.Field12854[var10]) != null) {
                                             var11.Field430.Method14515(var3, var4, var6, var11.Field431, var11.Field432, var11.Field433, Field959, Field960, Field961, Field962, var11.Field428 - Field955, var11.Field427 - Field957, var11.Field429 - Field958, var11.Field3080, var11.Field440, 0);
                                          }
                                       }
                                    }

                                    var20 = false;
                                    if (var1.Field12846 != null) {
                                       if (Field925 || !this.Method8893(var6, var3, var4)) {
                                          var20 = true;
                                          this.Method8890(var1, var1.Field12846, var6, Field959, Field960, Field961, Field962, var3, var4);
                                       }
                                    } else if (var1.Field12847 != null && (Field925 || !this.Method8893(var6, var3, var4))) {
                                       var20 = true;
                                       this.Method8891(var1, var3, Field959, Field961, var1.Field12847, Field960, var4, Field962, var6);
                                    }

                                    var19 = 0;
                                    var10 = 0;
                                    Class885 var21 = var1.Field12848;
                                    Class887 var12 = var1.Field12849;
                                    if (var21 != null || var12 != null) {
                                       if (Field953 == var3) {
                                          ++var19;
                                       } else if (Field953 < var3) {
                                          var19 += 2;
                                       }

                                       if (Field954 == var4) {
                                          var19 += 3;
                                       } else if (Field954 > var4) {
                                          var19 += 6;
                                       }

                                       var10 = Field978[var19];
                                       var1.Field12864 = Field980[var19];
                                    }

                                    if (var21 != null) {
                                       if ((var21.Field913 & Field979[var19]) != 0) {
                                          if (var21.Field913 == 16) {
                                             var1.Field12861 = 3;
                                             var1.Field12862 = Field981[var19];
                                             var1.Field12863 = 3 - var1.Field12862;
                                          } else if (var21.Field913 == 32) {
                                             var1.Field12861 = 6;
                                             var1.Field12862 = Field982[var19];
                                             var1.Field12863 = 6 - var1.Field12862;
                                          } else if (var21.Field913 == 64) {
                                             var1.Field12861 = 12;
                                             var1.Field12862 = Field983[var19];
                                             var1.Field12863 = 12 - var1.Field12862;
                                          } else {
                                             var1.Field12861 = 9;
                                             var1.Field12862 = Field984[var19];
                                             var1.Field12863 = 9 - var1.Field12862;
                                          }
                                       } else {
                                          var1.Field12861 = 0;
                                       }

                                       if ((var21.Field913 & var10) != 0 && !this.Method8894(var6, var3, var4, var21.Field913)) {
                                          var21.Field915.Method14515(var3, var4, var6, 0, 0, 0, Field959, Field960, Field961, Field962, var21.Field908 - Field955, var21.Field907 - Field957, var21.Field909 - Field958, var21.Field3080, var21.Field917, 0);
                                       }

                                       if ((var21.Field914 & var10) != 0 && !this.Method8894(var6, var3, var4, var21.Field914)) {
                                          var21.Field916.Method14515(var3, var4, var6, 0, 0, 0, Field959, Field960, Field961, Field962, var21.Field908 - Field955, var21.Field907 - Field957, var21.Field909 - Field958, var21.Field3080, var21.Field917, 0);
                                       }
                                    }

                                    if (var12 != null && !this.Method8895(var6, var3, var4, var12.Field902.Field10127)) {
                                       if ((var12.Field900 & var10) != 0) {
                                          var12.Field902.Method14515(var3, var4, var6, var12.Field901 & 2047, 0, 0, Field959, Field960, Field961, Field962, var12.Field898 - Field955, var12.Field897 - Field957, var12.Field899 - Field958, var12.Field3080, var12.Field903, 0);
                                       } else if ((var12.Field900 & 768) != 0) {
                                          var13 = var12.Field898 - Field955;
                                          var14 = var12.Field897 - Field957;
                                          var15 = var12.Field899 - Field958;
                                          var16 = var12.Field901;
                                          if (var12.Field901 != 1 && var16 != 2) {
                                             var17 = var13;
                                          } else {
                                             var17 = -var13;
                                          }

                                          if (var16 != 2 && var16 != 3) {
                                             var19 = var15;
                                          } else {
                                             var19 = -var15;
                                          }

                                          if ((var12.Field900 & 256) != 0 && var19 < var17) {
                                             var10 = var13 + Field964[var16];
                                             var22 = var15 + Field965[var16];
                                             var12.Field902.Method14515(var3, var4, var6, (var16 << 9) + 256, 0, 0, Field959, Field960, Field961, Field962, var10, var14, var22, var12.Field3080, var12.Field903, 0);
                                          }

                                          if ((var12.Field900 & 512) != 0 && var19 > var17) {
                                             var10 = var13 + Field966[var16];
                                             var22 = var15 + Field967[var16];
                                             var12.Field902.Method14515(var3, var4, var6, (var16 << 9) + 1280 & 2047, 0, 0, Field959, Field960, Field961, Field962, var10, var14, var22, var12.Field3080, var12.Field903, 0);
                                          }
                                       }
                                    }

                                    Class896 var25 = var1.Field12850;
                                    if (var20 && var25 != null && var25.Field422 != null && (!Class569.Field471 || Class569.Field471 && !var25.Field414)) {
                                       var25.Field422.Method14515(var3, var4, var6, var25.Field416, var25.Field417, var25.Field418, Field959, Field960, Field961, Field962, var25.Field420 - Field955, var25.Field419 - Field957, var25.Field421 - Field958, var25.Field3080, var25.Field423, 0);
                                    }

                                    Class46 var27 = var1.Field12851;
                                    if (var1.Field12851 != null && var27.Field2364 == 0) {
                                       if (var27.Field2361 != null) {
                                          var27.Field2361.Method14515(var3, var4, var6, 0, var27.Field2355, var27.Field2356, Field959, Field960, Field961, Field962, var27.Field2358 - Field955, var27.Field2357 - Field957, var27.Field2359 - Field958, var27.Field2363, 0, 0);
                                       }

                                       if (var27.Field2362 != null) {
                                          var27.Field2362.Method14515(var3, var4, var6, 0, var27.Field2355, var27.Field2356, Field959, Field960, Field961, Field962, var27.Field2358 - Field955, var27.Field2357 - Field957, var27.Field2359 - Field958, var27.Field2363, 0, 0);
                                       }

                                       if (var27.Field2360 != null) {
                                          var27.Field2360.Method14515(var3, var4, var6, 0, var27.Field2355, var27.Field2356, Field959, Field960, Field961, Field962, var27.Field2358 - Field955, var27.Field2357 - Field957, var27.Field2359 - Field958, var27.Field2363, 0, 0);
                                       }
                                    }

                                    var13 = var1.Field12856;
                                    if (var1.Field12856 != 0) {
                                       if (var3 < Field953 && (var13 & 4) != 0 && (var29 = var7[var3 + 1][var4]) != null && var29.Field12859) {
                                          var18.Method1845(var29);
                                       }

                                       if (var4 < Field954 && (var13 & 2) != 0 && (var29 = var7[var3][var4 + 1]) != null && var29.Field12859) {
                                          var18.Method1845(var29);
                                       }

                                       if (var3 > Field953 && (var13 & 1) != 0 && (var29 = var7[var3 - 1][var4]) != null && var29.Field12859) {
                                          var18.Method1845(var29);
                                       }

                                       if (var4 > Field954 && (var13 & 8) != 0 && (var29 = var7[var3][var4 - 1]) != null && var29.Field12859) {
                                          var18.Method1845(var29);
                                       }
                                    }
                                    break;
                                 }
                              }

                              if (var1.Field12861 != 0) {
                                 var20 = true;

                                 for(var19 = 0; var19 < var1.Field12853; ++var19) {
                                    if (var1.Field12854[var19].Field439 != Field948 && (var1.Field12855[var19] & var1.Field12861) == var1.Field12862) {
                                       var20 = false;
                                       break;
                                    }
                                 }

                                 if (var20) {
                                    var9 = var1.Field12848;
                                    if (!this.Method8894(var6, var3, var4, var9.Field913)) {
                                       var9.Field915.Method14515(var3, var4, var6, var9.Field905, 0, 0, Field959, Field960, Field961, Field962, var9.Field908 - Field955, var9.Field907 - Field957, var9.Field909 - Field958, var9.Field3080, var9.Field917, 0);
                                    }

                                    var1.Field12861 = 0;
                                 }
                              }

                              if (!var1.Field12860) {
                                 break;
                              }

                              int var23 = var1.Field12853;
                              var1.Field12860 = false;
                              var19 = 0;

                              label585:
                              for(var10 = 0; var10 < var23; ++var10) {
                                 if ((var11 = var1.Field12854[var10]) != null && var11.Field439 != Field948) {
                                    for(var24 = var11.Field434; var24 <= var11.Field435; ++var24) {
                                       for(var13 = var11.Field436; var13 <= var11.Field437; ++var13) {
                                          if ((var29 = var7[var24][var13]) != null) {
                                             if (var29.Field12858) {
                                                var1.Field12860 = true;
                                                continue label585;
                                             }

                                             if (var29.Field12861 != 0) {
                                                var15 = 0;
                                                if (var24 > var11.Field434) {
                                                   ++var15;
                                                }

                                                if (var24 < var11.Field435) {
                                                   var15 += 4;
                                                }

                                                if (var13 > var11.Field436) {
                                                   var15 += 8;
                                                }

                                                if (var13 < var11.Field437) {
                                                   var15 += 2;
                                                }

                                                if ((var15 & var29.Field12861) == var1.Field12863) {
                                                   var1.Field12860 = true;
                                                   continue label585;
                                                }
                                             }
                                          }
                                       }
                                    }

                                    this.Field963[var19++] = var11;
                                    var24 = Field953 - var11.Field434;
                                    if ((var13 = var11.Field435 - Field953) > var24) {
                                       var24 = var13;
                                    }

                                    var14 = Field954 - var11.Field436;
                                    if ((var15 = var11.Field437 - Field954) > var14) {
                                       var11.Field438 = var24 + var15;
                                    } else {
                                       var11.Field438 = var24 + var14;
                                    }
                                 }
                              }

                              while(var19 > 0) {
                                 var10 = -50;
                                 var22 = -1;

                                 for(var24 = 0; var24 < var19; ++var24) {
                                    Class890 var30;
                                    if ((var30 = this.Field963[var24]) != null && var30.Field439 != Field948) {
                                       if (var30.Field438 > var10) {
                                          var10 = var30.Field438;
                                          var22 = var24;
                                       } else if (var30.Field438 == var10) {
                                          var14 = var30.Field428 - Field955;
                                          var15 = var30.Field429 - Field958;
                                          var16 = this.Field963[var22].Field428 - Field955;
                                          var17 = this.Field963[var22].Field429 - Field958;
                                          if (var14 * var14 + var15 * var15 > var16 * var16 + var17 * var17) {
                                             var22 = var24;
                                          }
                                       }
                                    }
                                 }

                                 if (var22 == -1) {
                                    break;
                                 }

                                 Class890 var31;
                                 (var31 = this.Field963[var22]).Field439 = Field948;
                                 if (!this.Method8896(var6, var31.Field434, var31.Field435, var31.Field436, var31.Field437, var31.Field430.Field10127)) {
                                    var31.Field430.Method14515(var3, var4, var6, var31.Field431, var31.Field432, var31.Field433, Field959, Field960, Field961, Field962, var31.Field428 - Field955, var31.Field427 - Field957, var31.Field429 - Field958, var31.Field3080, var31.Field440, 0);
                                 }

                                 for(var13 = var31.Field434; var13 <= var31.Field435; ++var13) {
                                    for(var14 = var31.Field436; var14 <= var31.Field437; ++var14) {
                                       Class501 var34;
                                       if ((var34 = var7[var13][var14]) != null) {
                                          if (var34.Field12861 != 0) {
                                             var18.Method1845(var34);
                                          } else if ((var13 != var3 || var14 != var4) && var34.Field12859) {
                                             var18.Method1845(var34);
                                          }
                                       }
                                    }
                                 }
                              }

                              if (!var1.Field12860) {
                                 break;
                              }
                           }
                        } while(!var1.Field12859);
                     } while(var1.Field12861 != 0);
                  } while(var3 <= Field953 && var3 > Field949 && (var8 = var7[var3 - 1][var4]) != null && var8.Field12859);
               } while(var3 >= Field953 && var3 < Field950 - 1 && (var8 = var7[var3 + 1][var4]) != null && var8.Field12859);
            } while(var4 <= Field954 && var4 > Field951 && (var8 = var7[var3][var4 - 1]) != null && var8.Field12859);
         } while(var4 >= Field954 && var4 < Field952 - 1 && (var8 = var7[var3][var4 + 1]) != null && var8.Field12859);

         var1.Field12859 = false;
         --Field946;
         Class46 var26 = var1.Field12851;
         if (var1.Field12851 != null && var26.Field2364 != 0) {
            if (var26.Field2361 != null) {
               var26.Field2361.Method14515(var3, var4, var6, 0, var26.Field2355, var26.Field2356, Field959, Field960, Field961, Field962, var26.Field2358 - Field955, var26.Field2357 - Field957 - var26.Field2364, var26.Field2359 - Field958, var26.Field2363, 0, 0);
            }

            if (var26.Field2362 != null) {
               var26.Field2362.Method14515(var3, var4, var6, 0, var26.Field2355, var26.Field2356, Field959, Field960, Field961, Field962, var26.Field2358 - Field955, var26.Field2357 - Field957 - var26.Field2364, var26.Field2359 - Field958, var26.Field2363, 0, 0);
            }

            if (var26.Field2360 != null) {
               var26.Field2360.Method14515(var3, var4, var6, 0, var26.Field2355, var26.Field2356, Field959, Field960, Field961, Field962, var26.Field2358 - Field955, var26.Field2357 - Field957 - var26.Field2364, var26.Field2359 - Field958, var26.Field2363, 0, 0);
            }
         }

         if (var1.Field12864 != 0) {
            Class887 var32 = var1.Field12849;
            if (var1.Field12849 != null && !this.Method8895(var6, var3, var4, var32.Field902.Field10127)) {
               if ((var32.Field900 & var1.Field12864) != 0) {
                  var32.Field902.Method14515(var3, var4, var6, var32.Field901, 0, 0, Field959, Field960, Field961, Field962, var32.Field898 - Field955, var32.Field897 - Field957, var32.Field899 - Field958, var32.Field3080, var32.Field903, 0);
               } else if ((var32.Field900 & 768) != 0) {
                  var10 = var32.Field898 - Field955;
                  var22 = var32.Field897 - Field957;
                  var24 = var32.Field899 - Field958;
                  var13 = var32.Field901;
                  if (var32.Field901 != 1 && var13 != 2) {
                     var14 = var10;
                  } else {
                     var14 = -var10;
                  }

                  if (var13 != 2 && var13 != 3) {
                     var15 = var24;
                  } else {
                     var15 = -var24;
                  }

                  if ((var32.Field900 & 256) != 0 && var15 >= var14) {
                     var16 = var10 + Field964[var13];
                     var17 = var24 + Field965[var13];
                     var32.Field902.Method14515(var3, var4, var6, (var13 << 9) + 256, 0, 0, Field959, Field960, Field961, Field962, var16, var22, var17, var32.Field3080, var32.Field903, 0);
                  }

                  if ((var32.Field900 & 512) != 0 && var15 <= var14) {
                     var16 = var10 + Field966[var13];
                     var17 = var24 + Field967[var13];
                     var32.Field902.Method14515(var3, var4, var6, (var13 << 9) + 1280 & 2047, 0, 0, Field959, Field960, Field961, Field962, var16, var22, var17, var32.Field3080, var32.Field903, 0);
                  }
               }
            }

            Class885 var28 = var1.Field12848;
            if (var1.Field12848 != null) {
               if (var28.Field916 != null && (var28.Field914 & var1.Field12864) != 0 && !this.Method8894(var6, var3, var4, var28.Field914)) {
                  var28.Field916.Method14515(var3, var4, var6, 0, 0, 0, Field959, Field960, Field961, Field962, var28.Field908 - Field955, var28.Field907 - Field957, var28.Field909 - Field958, var28.Field3080, var28.Field917, 0);
               }

               if (var28.Field915 != null && (var28.Field913 & var1.Field12864) != 0 && !this.Method8894(var6, var3, var4, var28.Field913)) {
                  var28.Field915.Method14515(var3, var4, var6, 0, 0, 0, Field959, Field960, Field961, Field962, var28.Field908 - Field955, var28.Field907 - Field957, var28.Field909 - Field958, var28.Field3080, var28.Field917, 0);
               }
            }
         }

         Class501 var33;
         if (var5 < this.Field937 - 1 && (var33 = this.Field941[var5 + 1][var3][var4]) != null && var33.Field12859) {
            var18.Method1845(var33);
         }

         if (var3 < Field953 && (var33 = var7[var3 + 1][var4]) != null && var33.Field12859) {
            var18.Method1845(var33);
         }

         if (var4 < Field954 && (var33 = var7[var3][var4 + 1]) != null && var33.Field12859) {
            var18.Method1845(var33);
         }

         if (var3 > Field953 && (var33 = var7[var3 - 1][var4]) != null && var33.Field12859) {
            var18.Method1845(var33);
         }

         if (var4 > Field954 && (var33 = var7[var3][var4 - 1]) != null && var33.Field12859) {
            var18.Method1845(var33);
         }
      }
   }

   private static boolean Method8889(int var0, Class501 var1) {
      if (var1 != null && (var1.Field12857 == Client.Field12379 || var1.Field12845 == Client.Field12379)) {
         if (var1.Field12852 != null) {
            Field973 = Integer.MIN_VALUE;
            return true;
         } else {
            boolean var2;
            if (var2 = Field973 == 0) {
               Field973 = var0;
               return true;
            } else if (Field973 >= var0) {
               Field973 = var0;
               return true;
            } else {
               return false;
            }
         }
      } else {
         return false;
      }
   }

   private void Method8890(Class501 var1, Class353 var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      if (var2 != null) {
         int var10 = GraphicsDisplay.Field2678 ? 0 : 80;
         int var11;
         int var12 = var11 = (var8 << 7) - Field955;
         int var13;
         int var14 = var13 = (var9 << 7) - Field958;
         int var15;
         int var16 = var15 = var12 + 128;
         int var17;
         int var18 = var17 = var14 + 128;
         if (this.Field940 != null) {
            int var19 = var3;
            Class501 var31;
            if (GraphicsDisplay.Field2678 && GraphicsDisplay.Field2667 && (var31 = this.Method8846(var3, var8, var9)) != null && var31.Field12852 != null && var3 < 3) {
               ++var19;
            }

            var3 = this.Field940[var19][var8][var9];
            int var20 = this.Field940[var19][var8][var9] - Field957;
            int var21 = this.Field940[var19][var8 + 1][var9] - Field957;
            int var22 = this.Field940[var19][var8 + 1][var9 + 1] - Field957;
            var19 = this.Field940[var19][var8][var9 + 1] - Field957;
            int var23 = var14 * var6 + var12 * var7 >> 16;
            var14 = var14 * var7 - var12 * var6 >> 16;
            var12 = var23;
            var23 = var20 * var5 - var14 * var4 >> 16;
            float var24 = (float)(var20 * var4 + var14 * var5) / 65536.0F;
            var14 = var20 * var4 + var14 * var5 >> 16;
            var20 = var23;
            if (var14 > var10) {
               var23 = var13 * var6 + var16 * var7 >> 16;
               var13 = var13 * var7 - var16 * var6 >> 16;
               var16 = var23;
               var23 = var21 * var5 - var13 * var4 >> 16;
               float var25 = (float)(var21 * var4 + var13 * var5) / 65536.0F;
               var13 = var21 * var4 + var13 * var5 >> 16;
               var21 = var23;
               if (var13 > var10) {
                  var23 = var18 * var6 + var15 * var7 >> 16;
                  var18 = var18 * var7 - var15 * var6 >> 16;
                  var15 = var23;
                  var23 = var22 * var5 - var18 * var4 >> 16;
                  float var26 = (float)(var22 * var4 + var18 * var5) / 65536.0F;
                  var18 = var22 * var4 + var18 * var5 >> 16;
                  var22 = var23;
                  if (var18 > var10) {
                     var23 = var17 * var6 + var11 * var7 >> 16;
                     var17 = var17 * var7 - var11 * var6 >> 16;
                     var11 = var23;
                     var23 = var19 * var5 - var17 * var4 >> 16;
                     float var34 = (float)(var19 * var4 + var17 * var5) / 65536.0F;
                     var17 = var19 * var4 + var17 * var5 >> 16;
                     if (var17 > var10) {
                        float var32 = (float)Math.round(Math.pow(2.0D, (double) Client.Field12133) - 22.0D);
                        float var33 = (float) Rasterizer.Field9955 + (float)var12 * var32 / (float)var14;
                        float var35 = (float) Rasterizer.Field9956 + (float)var20 * var32 / (float)var14;
                        float var36 = (float) Rasterizer.Field9955 + (float)var15 * var32 / (float)var18;
                        float var37 = (float) Rasterizer.Field9955 + (float)var11 * var32 / (float)var17;
                        float var27 = (float) Rasterizer.Field9955 + (float)var16 * var32 / (float)var13;
                        float var28 = (float) Rasterizer.Field9956 + (float)var22 * var32 / (float)var18;
                        float var29 = (float) Rasterizer.Field9956 + (float)var23 * var32 / (float)var17;
                        var32 = (float) Rasterizer.Field9956 + (float)var21 * var32 / (float)var13;
                        if (Field968 && Method8892((float)Field969, (float)Field970, var28, var29, var32, var36, var37, var27) && Method8889(var3, var1)) {
                           Field971 = var8;
                           Field972 = var9;
                        } else if (Field968 && Method8892((float)Field969, (float)Field970, var35, var32, var29, var33, var27, var37) && Method8889(var3, var1)) {
                           Field971 = var8;
                           Field972 = var9;
                        }

                        if (!GraphicsDisplay.Field2678 || !GraphicsDisplay.Field2667) {
                           if (GraphicsDisplay.Field2678) {
                              GraphicsDisplay.Method997();
                              GraphicsDisplay.Method1012(var36, var37, var33, var27, var28, var29, var35, var32, var26, var34, var24, var25, var2.Field1470, var2.Field1471, var2.Field1468, var2.Field1469, var2.Field1472, Model.Field2798);
                           }

                           boolean var30;
                           if ((var36 - var37) * (var32 - var29) - (var28 - var29) * (var27 - var37) > 0.0F) {
                              var30 = var36 < 0.0F || var37 < 0.0F || var27 < 0.0F || var36 > (float)Class697.Field8767 || var37 > (float)Class697.Field8767 || var27 > (float)Class697.Field8767;
                              if (var2.Field1472 != -1) {
                                 if (var2.Field1473) {
                                    Rasterizer.Method9439(var28, var29, var32, var36, var37, var27, var26, var34, var25, var2.Field1470, var2.Field1471, var2.Field1469, var12, var16, var11, var20, var21, var23, var14, var13, var17, !Rasterizer.Field9945 && var2.Field1467 != -1 ? -1 : var2.Field1472, var2.Field1467, true, var30, 0);
                                 } else {
                                    Rasterizer.Method9439(var28, var29, var32, var36, var37, var27, var26, var34, var25, var2.Field1470, var2.Field1471, var2.Field1469, var15, var11, var16, var22, var23, var21, var18, var17, var13, !Rasterizer.Field9945 && var2.Field1467 != -1 ? -1 : var2.Field1472, var2.Field1467, true, var30, 0);
                                 }
                              } else if (var2.Field1470 != 12345678) {
                                 var3 = var2.Field1470;
                                 if (Rasterizer.Field9945) {
                                    if (var2.Field1473) {
                                       Rasterizer.Method9439(var28, var29, var32, var36, var37, var27, var26, var34, var25, var2.Field1470, var2.Field1471, var2.Field1469, var12, var16, var11, var20, var21, var23, var14, var13, var17, Rasterizer.Field9944, var3, true, var30, 0);
                                    } else {
                                       Rasterizer.Method9439(var28, var29, var32, var36, var37, var27, var26, var34, var25, var2.Field1470, var2.Field1471, var2.Field1469, var15, var11, var16, var22, var23, var21, var18, var17, var13, Rasterizer.Field9944, var3, true, var30, 0);
                                    }
                                 } else {
                                    Rasterizer.Method9438(var28, var29, var32, var36, var37, var27, var26, var34, var25, var2.Field1470, var2.Field1471, var2.Field1469, var30, 0);
                                 }
                              }
                           }

                           if ((var33 - var27) * (var29 - var32) - (var35 - var32) * (var37 - var27) > 0.0F) {
                              var30 = var33 < 0.0F || var27 < 0.0F || var37 < 0.0F || var33 > (float)Class697.Field8767 || var27 > (float)Class697.Field8767 || var37 > (float)Class697.Field8767;
                              if (var2.Field1472 != -1) {
                                 Rasterizer.Method9439(var35, var32, var29, var33, var27, var37, var24, var25, var34, var2.Field1468, var2.Field1469, var2.Field1471, var12, var16, var11, var20, var21, var23, var14, var13, var17, !Rasterizer.Field9945 && var2.Field1467 != -1 ? -1 : var2.Field1472, var2.Field1467, true, var30, 0);
                                 return;
                              }

                              if (var2.Field1468 != 12345678) {
                                 var3 = var2.Field1470;
                                 if (Rasterizer.Field9945) {
                                    if (var2.Field1473) {
                                       Rasterizer.Method9439(var28, var29, var32, var36, var37, var27, var26, var34, var25, var2.Field1468, var2.Field1469, var2.Field1471, var12, var16, var11, var20, var21, var23, var14, var13, var17, Rasterizer.Field9944, var3, true, var30, 0);
                                       return;
                                    }

                                    Rasterizer.Method9439(var28, var29, var32, var36, var37, var27, var26, var34, var25, var2.Field1468, var2.Field1469, var2.Field1471, var15, var11, var16, var22, var23, var21, var18, var17, var13, Rasterizer.Field9944, var3, true, var30, 0);
                                    return;
                                 }

                                 Rasterizer.Method9438(var35, var32, var29, var33, var27, var37, var24, var25, var34, var2.Field1468, var2.Field1469, var2.Field1471, var30, 0);
                              }
                           }

                        }
                     }
                  }
               }
            }
         }
      }
   }

   private void Method8891(Class501 var1, int var2, int var3, int var4, Class350 var5, int var6, int var7, int var8, int var9) {
      if (var5 != null) {
         int[] var10000 = var5.Field2166;
         int var10 = var5.Field2166.length;
         int var11 = var9;
         Class501 var25;
         if (GraphicsDisplay.Field2678 && GraphicsDisplay.Field2667 && (var25 = this.Method8846(var9, var2, var7)) != null && var25.Field12852 != null && var9 < 3) {
            ++var11;
         }

         float var26 = (float)Math.round(Math.pow(2.0D, (double) Client.Field12133) - 22.0D);

         int var12;
         int var14;
         int var15;
         int var16;
         for(var12 = 0; var12 < var10; ++var12) {
            int var13 = var5.Field2166[var12] - Field955;
            var14 = var5.Field2167[var12] - Field957;
            var16 = (var15 = var5.Field2168[var12] - Field958) * var4 + var13 * var8 >> 16;
            var15 = var15 * var8 - var13 * var4 >> 16;
            var13 = var16;
            var16 = var14 * var6 - var15 * var3 >> 16;
            var15 = var14 * var3 + var15 * var6 >> 16;
            if (var15 <= Field928 << 1) {
               return;
            }

            Class350.Field2184[var12] = var13;
            Class350.Field2185[var12] = var16;
            Class350.Field2186[var12] = var15;
            Class350.Field2182[var12] = (float) Rasterizer.Field9955 + (float)var13 * var26 / (float)var15;
            Class350.Field2183[var12] = (float) Rasterizer.Field9956 + (float)var16 * var26 / (float)var15;
            var10000 = var5.Field2166;
            var10000 = var5.Field2167;
            var10000 = var5.Field2168;
         }

         var12 = this.Field940 == null ? 0 : this.Field940[var11][var2][var7];
         var10 = var5.Field2172.length;

         for(var14 = 0; var14 < var10; ++var14) {
            var15 = var5.Field2172[var14];
            var16 = var5.Field2173[var14];
            var3 = var5.Field2174[var14];
            float var22 = Class350.Field2182[var15];
            float var23 = Class350.Field2182[var16];
            float var24 = Class350.Field2182[var3];
            var26 = Class350.Field2183[var15];
            float var27 = Class350.Field2183[var16];
            float var28 = Class350.Field2183[var3];
            float var17 = (float)Class350.Field2186[var15];
            float var18 = (float)Class350.Field2186[var16];
            float var19 = (float)Class350.Field2186[var3];
            if ((var22 - var23) * (var28 - var27) - (var26 - var27) * (var24 - var23) > 0.0F) {
               if (Field968 && Method8892((float)Field969, (float)Field970, var26, var27, var28, var22, var23, var24) && Method8889(var12, var1)) {
                  Field971 = var2;
                  Field972 = var7;
               }

               if (!GraphicsDisplay.Field2678 || !GraphicsDisplay.Field2667) {
                  boolean var20 = var22 < 0.0F || var23 < 0.0F || var24 < 0.0F || var22 > (float)Class697.Field8767 || var23 > (float)Class697.Field8767 || var24 > (float)Class697.Field8767;
                  if (GraphicsDisplay.Field2678) {
                     GraphicsDisplay.Method997();
                     int var10009 = var5.Field2169[var14];
                     int var10010 = var5.Field2170[var14];
                     int var10011 = var5.Field2171[var14];
                     int var10012 = var5.Field2175 != null ? var5.Field2175[var14] : -1;
                     int[] var10014 = var5.Field2167;
                     boolean var10018 = var5.Field2176;
                     GraphicsDisplay.Method1013(var22, var23, var24, var26, var27, var28, var17, var18, var19, var10009, var10010, var10011, var10012, var5.Field2166, var5.Field2168, var15, var16, var3, Model.Field2798);
                  }

                  if (var5.Field2175 != null && var5.Field2175[var14] != -1) {
                     if (var5.Field2176) {
                        Rasterizer.Method9439(var26, var27, var28, var22, var23, var24, var17, var18, var19, var5.Field2169[var14], var5.Field2170[var14], var5.Field2171[var14], Class350.Field2184[0], Class350.Field2184[1], Class350.Field2184[3], Class350.Field2185[0], Class350.Field2185[1], Class350.Field2185[3], Class350.Field2186[0], Class350.Field2186[1], Class350.Field2186[3], !Rasterizer.Field9945 && var5.Field2180 != -1 ? -1 : var5.Field2175[var14], var5.Field2180, true, var20, 0);
                     } else {
                        Rasterizer.Method9439(var26, var27, var28, var22, var23, var24, var17, var18, var19, var5.Field2169[var14], var5.Field2170[var14], var5.Field2171[var14], Class350.Field2184[var15], Class350.Field2184[var16], Class350.Field2184[var3], Class350.Field2185[var15], Class350.Field2185[var16], Class350.Field2185[var3], Class350.Field2186[var15], Class350.Field2186[var16], Class350.Field2186[var3], !Rasterizer.Field9945 && var5.Field2180 != -1 ? -1 : var5.Field2175[var14], var5.Field2180, true, var20, 0);
                     }
                  } else if (var5.Field2169[var14] != 12345678) {
                     int var21 = var5.Field2169[var14];
                     if (Rasterizer.Field9945) {
                        if (var5.Field2176) {
                           Rasterizer.Method9439(var26, var27, var28, var22, var23, var24, var17, var18, var19, var5.Field2169[var14], var5.Field2170[var14], var5.Field2171[var14], Class350.Field2184[0], Class350.Field2184[1], Class350.Field2184[3], Class350.Field2185[0], Class350.Field2185[1], Class350.Field2185[3], Class350.Field2186[0], Class350.Field2186[1], Class350.Field2186[3], Rasterizer.Field9944, var21, true, var20, 0);
                        } else {
                           Rasterizer.Method9439(var26, var27, var28, var22, var23, var24, var17, var18, var19, var5.Field2169[var14], var5.Field2170[var14], var5.Field2171[var14], Class350.Field2184[var15], Class350.Field2184[var16], Class350.Field2184[var3], Class350.Field2185[var15], Class350.Field2185[var16], Class350.Field2185[var3], Class350.Field2186[var15], Class350.Field2186[var16], Class350.Field2186[var3], Rasterizer.Field9944, var21, true, var20, 0);
                        }
                     } else {
                        Rasterizer.Method9438(var26, var27, var28, var22, var23, var24, var17, var18, var19, var5.Field2169[var14], var5.Field2170[var14], var5.Field2171[var14], var20, 0);
                     }
                  }
               }
            }
         }

      }
   }

   private static boolean Method8892(float var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      if (var1 < var2 && var1 < var3 && var1 < var4) {
         return false;
      } else if (var1 > var2 && var1 > var3 && var1 > var4) {
         return false;
      } else if (var0 < var5 && var0 < var6 && var0 < var7) {
         return false;
      } else if (var0 > var5 && var0 > var6 && var0 > var7) {
         return false;
      } else {
         float var8 = (var1 - var2) * (var6 - var5) - (var0 - var5) * (var3 - var2);
         var2 = (var1 - var4) * (var5 - var7) - (var0 - var7) * (var2 - var4);
         var0 = (var1 - var3) * (var7 - var6) - (var0 - var6) * (var4 - var3);
         return var8 * var0 > 0.0F && var0 * var2 > 0.0F;
      }
   }

   private boolean Method8893(int var1, int var2, int var3) {
      int var4;
      if ((var4 = this.Field945[var1][var2][var3]) == -Field948) {
         return false;
      } else if (var4 == Field948) {
         return true;
      } else {
         var4 = var2 << 7;
         int var5 = var3 << 7;
         if (this.Field940 == null) {
            return false;
         } else if (Method8897(var4 + 1, this.Field940[var1][var2][var3], var5 + 1) && Method8897(var4 + 128 - 1, this.Field940[var1][var2 + 1][var3], var5 + 1) && Method8897(var4 + 128 - 1, this.Field940[var1][var2 + 1][var3 + 1], var5 + 128 - 1) && Method8897(var4 + 1, this.Field940[var1][var2][var3 + 1], var5 + 128 - 1)) {
            this.Field945[var1][var2][var3] = Field948;
            return true;
         } else {
            this.Field945[var1][var2][var3] = -Field948;
            return false;
         }
      }
   }

   private boolean Method8894(int var1, int var2, int var3, int var4) {
      if (!this.Method8893(var1, var2, var3)) {
         return false;
      } else {
         int var5 = var2 << 7;
         int var6 = var3 << 7;
         var3 = (var2 = this.Field940[var1][var2][var3] - 1) - 120;
         int var7 = var2 - 230;
         int var8 = var2 - 238;
         if (var4 < 16) {
            if (var4 == 1) {
               if (var5 > Field955) {
                  if (!Method8897(var5, var2, var6)) {
                     return false;
                  }

                  if (!Method8897(var5, var2, var6 + 128)) {
                     return false;
                  }
               }

               if (var1 > 0) {
                  if (!Method8897(var5, var3, var6)) {
                     return false;
                  }

                  if (!Method8897(var5, var3, var6 + 128)) {
                     return false;
                  }
               }

               if (Method8897(var5, var7, var6) && Method8897(var5, var7, var6 + 128)) {
                  return true;
               }

               return false;
            }

            if (var4 == 2) {
               if (var6 < Field958) {
                  if (!Method8897(var5, var2, var6 + 128)) {
                     return false;
                  }

                  if (!Method8897(var5 + 128, var2, var6 + 128)) {
                     return false;
                  }
               }

               if (var1 > 0) {
                  if (!Method8897(var5, var3, var6 + 128)) {
                     return false;
                  }

                  if (!Method8897(var5 + 128, var3, var6 + 128)) {
                     return false;
                  }
               }

               if (Method8897(var5, var7, var6 + 128) && Method8897(var5 + 128, var7, var6 + 128)) {
                  return true;
               }

               return false;
            }

            if (var4 == 4) {
               if (var5 < Field955) {
                  if (!Method8897(var5 + 128, var2, var6)) {
                     return false;
                  }

                  if (!Method8897(var5 + 128, var2, var6 + 128)) {
                     return false;
                  }
               }

               if (var1 > 0) {
                  if (!Method8897(var5 + 128, var3, var6)) {
                     return false;
                  }

                  if (!Method8897(var5 + 128, var3, var6 + 128)) {
                     return false;
                  }
               }

               if (Method8897(var5 + 128, var7, var6) && Method8897(var5 + 128, var7, var6 + 128)) {
                  return true;
               }

               return false;
            }

            if (var4 == 8) {
               if (var6 > Field958) {
                  if (!Method8897(var5, var2, var6)) {
                     return false;
                  }

                  if (!Method8897(var5 + 128, var2, var6)) {
                     return false;
                  }
               }

               if (var1 > 0) {
                  if (!Method8897(var5, var3, var6)) {
                     return false;
                  }

                  if (!Method8897(var5 + 128, var3, var6)) {
                     return false;
                  }
               }

               if (Method8897(var5, var7, var6) && Method8897(var5 + 128, var7, var6)) {
                  return true;
               }

               return false;
            }
         }

         if (!Method8897(var5 + 64, var8, var6 + 64)) {
            return false;
         } else if (var4 == 16) {
            return Method8897(var5, var7, var6 + 128);
         } else if (var4 == 32) {
            return Method8897(var5 + 128, var7, var6 + 128);
         } else if (var4 == 64) {
            return Method8897(var5 + 128, var7, var6);
         } else if (var4 == 128) {
            return Method8897(var5, var7, var6);
         } else {
            System.out.println("Warning unsupported wall type");
            return true;
         }
      }
   }

   private boolean Method8895(int var1, int var2, int var3, int var4) {
      if (!this.Method8893(var1, var2, var3)) {
         return false;
      } else {
         int var5 = var2 << 7;
         int var6 = var3 << 7;
         return Method8897(var5 + 1, this.Field940[var1][var2][var3] - var4, var6 + 1) && Method8897(var5 + 128 - 1, this.Field940[var1][var2 + 1][var3] - var4, var6 + 1) && Method8897(var5 + 128 - 1, this.Field940[var1][var2 + 1][var3 + 1] - var4, var6 + 128 - 1) && Method8897(var5 + 1, this.Field940[var1][var2][var3 + 1] - var4, var6 + 128 - 1);
      }
   }

   private boolean Method8896(int var1, int var2, int var3, int var4, int var5, int var6) {
      if (this.Field940 == null) {
         return false;
      } else {
         int var7;
         int var8;
         if (var2 == var3 && var4 == var5) {
            if (!this.Method8893(var1, var2, var4)) {
               return false;
            } else {
               var7 = var2 << 7;
               var8 = var4 << 7;
               return Method8897(var7 + 1, this.Field940[var1][var2][var4] - var6, var8 + 1) && Method8897(var7 + 128 - 1, this.Field940[var1][var2 + 1][var4] - var6, var8 + 1) && Method8897(var7 + 128 - 1, this.Field940[var1][var2 + 1][var4 + 1] - var6, var8 + 128 - 1) && Method8897(var7 + 1, this.Field940[var1][var2][var4 + 1] - var6, var8 + 128 - 1);
            }
         } else {
            for(var7 = var2; var7 <= var3; ++var7) {
               for(var8 = var4; var8 <= var5; ++var8) {
                  if (this.Field945[var1][var7][var8] == -Field948) {
                     return false;
                  }
               }
            }

            var7 = (var2 << 7) + 1;
            var8 = (var4 << 7) + 2;
            var1 = this.Field940[var1][var2][var4] - var6;
            if (!Method8897(var7, var1, var8)) {
               return false;
            } else if (!Method8897(var2 = (var3 << 7) - 1, var1, var8)) {
               return false;
            } else {
               var3 = (var5 << 7) - 1;
               if (Method8897(var7, var1, var3) && Method8897(var2, var1, var3)) {
                  return true;
               } else {
                  return false;
               }
            }
         }
      }
   }

   private static boolean Method8897(int var0, int var1, int var2) {
      for(int var3 = 0; var3 < Field976; ++var3) {
         Class450 var4;
         int var5;
         int var6;
         int var7;
         int var8;
         int var9;
         if ((var4 = Field988[var3]).Field9100 == 1) {
            if ((var5 = var4.Field9094 - var0) > 0) {
               var6 = var4.Field9096 + (var4.Field9103 * var5 >> 8);
               var7 = var4.Field9097 + (var4.Field9104 * var5 >> 8);
               var8 = var4.Field9098 + (var4.Field9105 * var5 >> 8);
               var9 = var4.Field9099 + (var4.Field9106 * var5 >> 8);
               if (var2 >= var6 && var2 <= var7 && var1 >= var8 && var1 <= var9) {
                  return true;
               }
            }
         } else if (var4.Field9100 == 2) {
            if ((var5 = var0 - var4.Field9094) > 0) {
               var6 = var4.Field9096 + (var4.Field9103 * var5 >> 8);
               var7 = var4.Field9097 + (var4.Field9104 * var5 >> 8);
               var8 = var4.Field9098 + (var4.Field9105 * var5 >> 8);
               var9 = var4.Field9099 + (var4.Field9106 * var5 >> 8);
               if (var2 >= var6 && var2 <= var7 && var1 >= var8 && var1 <= var9) {
                  return true;
               }
            }
         } else if (var4.Field9100 == 3) {
            if ((var5 = var4.Field9096 - var2) > 0) {
               var6 = var4.Field9094 + (var4.Field9101 * var5 >> 8);
               var7 = var4.Field9095 + (var4.Field9102 * var5 >> 8);
               var8 = var4.Field9098 + (var4.Field9105 * var5 >> 8);
               var9 = var4.Field9099 + (var4.Field9106 * var5 >> 8);
               if (var0 >= var6 && var0 <= var7 && var1 >= var8 && var1 <= var9) {
                  return true;
               }
            }
         } else if (var4.Field9100 == 4) {
            if ((var5 = var2 - var4.Field9096) > 0) {
               var6 = var4.Field9094 + (var4.Field9101 * var5 >> 8);
               var7 = var4.Field9095 + (var4.Field9102 * var5 >> 8);
               var8 = var4.Field9098 + (var4.Field9105 * var5 >> 8);
               var9 = var4.Field9099 + (var4.Field9106 * var5 >> 8);
               if (var0 >= var6 && var0 <= var7 && var1 >= var8 && var1 <= var9) {
                  return true;
               }
            }
         } else if (var4.Field9100 == 5 && (var5 = var1 - var4.Field9098) > 0) {
            var6 = var4.Field9094 + (var4.Field9101 * var5 >> 8);
            var7 = var4.Field9095 + (var4.Field9102 * var5 >> 8);
            var8 = var4.Field9096 + (var4.Field9103 * var5 >> 8);
            var9 = var4.Field9097 + (var4.Field9104 * var5 >> 8);
            if (var0 >= var6 && var0 <= var7 && var2 >= var8 && var2 <= var9) {
               return true;
            }
         }
      }

      return false;
   }
}
