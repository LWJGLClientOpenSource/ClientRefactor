package net.LWJGLClient.client.b;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import net.LWJGLClient.client.a.d.IndexedImage;
import net.LWJGLClient.client.a.d.Class120;
import net.LWJGLClient.client.b.a.Class697;
import net.LWJGLClient.client.b.b.GraphicsDisplay;
import net.LWJGLClient.client.model.Client;
import net.LWJGLClient.client.model.a.d.ParticleDefinition;
import net.LWJGLClient.client.model.f.TextureData;

public final class Rasterizer extends Class697 {
   public static boolean Field9942 = true;
   public static boolean Field9943 = true;
   public static int Field9944;
   public static boolean Field9945;
   private static boolean Field9946;
   public static boolean Field9947;
   public static boolean Field9948;
   public static boolean Field9949;
   public static int Field9950;
   private static int Field9951;
   private static int Field9952;
   private static double Field9953;
   public static boolean Field9954;
   public static int Field9955;
   public static int Field9956;
   private static int[] Field9957;
   private static int[] Field9958;
   public static int[] Field9959;
   public static int[] Field9960;
   public static int[] Field9961;
   private static int[][] Field9962;
   public static boolean[] Field9963;
   public static int[] Field9964;
   private static IndexedImage[] Field9965;
   private static boolean[] Field9966;
   private static int Field9967;
   private static ExecutorService Field9968;
   private static AtomicInteger Field9969;
   private static AtomicInteger Field9970;

   static {
      Field9944 = GraphicsDisplay.Field2678 ? 598 : 594;
      Field9945 = true;
      Field9946 = false;
      Field9947 = true;
      Field9948 = false;
      Field9949 = false;
      Field9950 = 1420;
      Field9951 = 65536;
      Field9952 = 0;
      Field9953 = 0.0D;
      Field9954 = true;
      Field9962 = new int[Field9950][];
      Field9963 = new boolean[Field9950];
      Field9964 = new int[65536];
      Field9965 = new IndexedImage[Field9950];
      Field9966 = new boolean[Field9950];
      Field9957 = new int[512];
      Field9958 = new int[2048];
      Field9959 = new int[2048];
      Field9960 = new int[2048];

      int var0;
      for(var0 = 1; var0 < Field9957.length; ++var0) {
         Field9957[var0] = '耀' / var0;
      }

      for(var0 = 1; var0 < 2048; ++var0) {
         Field9958[var0] = 65536 / var0;
      }

      for(var0 = 0; var0 < Field9959.length; ++var0) {
         Field9959[var0] = (int)(65536.0D * Math.sin((double)var0 * 0.0030679615757712823D));
         Field9960[var0] = (int)(65536.0D * Math.cos((double)var0 * 0.0030679615757712823D));
      }

      Field9967 = Runtime.getRuntime().availableProcessors();
      Field9968 = null;
      Field9969 = new AtomicInteger(0);
      Field9970 = new AtomicInteger(0);
   }

   public static void Method14444() {
      Field9957 = null;
      Field9959 = null;
      Field9960 = null;
      Field9961 = null;
      Field9965 = null;
      Field9966 = null;
      Field9964 = null;
   }

   public static void Method9424() {
      Field9961 = new int[Class697.Field8762];

      for(int var0 = 0; var0 < Class697.Field8762; ++var0) {
         Field9961[var0] = Class697.Field8761 * var0;
      }

      Field9955 = Class697.Field8761 / 2;
      Field9956 = Class697.Field8762 / 2;
   }

   public static void Method14494(int var0, int var1) {
      Field9961 = new int[var1];

      for(int var2 = 0; var2 < var1; ++var2) {
         Field9961[var2] = var0 * var2;
      }

      Field9955 = var0 / 2;
      Field9956 = var1 / 2;
   }

   public static void resetTextures() {
      for(int var0 = 0; var0 < Field9950; ++var0) {
         if (!Field9963[var0]) {
            Field9962[var0] = null;
         }
      }

   }

   public static void Method14450() {
      TextureData.Method13529();
   }

   public static void unpackTextures() {
   }

   public static int[] Method9429(int var0) {
      if (Field9962[var0] != null) {
         return Field9962[var0];
      } else {
         TextureData var1;
         if ((var1 = TextureData.Method13526(var0)) == null) {
            return null;
         } else {
            Field9951 = 16384;
            int[] var2 = new int[16384];
            int var3;
            int var4;
            if (var1.Field2907 == 64) {
               for(var3 = 0; var3 < 128; ++var3) {
                  for(var4 = 0; var4 < 128; ++var4) {
                     var2[var4 + (var3 << 7)] = var1.Method13538((var4 >> 1) + (var3 >> 1 << 6));
                  }
               }
            } else {
               for(var3 = 0; var3 < 16384; ++var3) {
                  var2[var3] = var1.Method13538(var3);
               }
            }

            Class120 var12;
            int var10000 = (var12 = Class120.Field9548 != null && var0 >= 0 && var0 < Class120.Field9548.length ? Class120.Field9548[var0] : null) != null ? var12.Field9547 : 0;
            var4 = var10000;
            if (var10000 != 1 && var4 != 2) {
               var4 = 0;
            }

            Field9966[var0] = false;

            try {
               for(int var11 = 0; var11 < 16384; ++var11) {
                  int var5 = var2[var11];
                  int var6;
                  if (var4 == 2) {
                     var6 = var5 >>> 24;
                  } else if (var4 == 1) {
                     var6 = var5 != 0 ? 255 : 0;
                  } else {
                     var6 = var5 >>> 24;
                     if (var12 != null && !var12.Field9529) {
                        var6 /= GraphicsDisplay.Field2678 ? 1 : 6;
                     }
                  }

                  if ((var5 &= 16777215) == 0) {
                     Field9966[var0] = true;
                  }

                  double var8 = 0.5D;
                  if (var0 != 929 && var0 != 918) {
                     if (var0 != 593 && var0 != 300) {
                        if (var0 == 40) {
                           var8 = 0.65D;
                        } else if (var0 == 42) {
                           var8 = 2.0D;
                        }
                     } else {
                        var8 = 0.45D;
                     }
                  } else {
                     var8 = 0.3D;
                  }

                  if (GraphicsDisplay.Field2678) {
                     var5 = Method9430(var5, var8);
                  } else {
                     var5 = Method9430(var5, Field9953);
                  }

                  var5 &= 16316671;
                  var2[var11] = var5 | var6 << 24;
               }
            } catch (Exception var10) {
               var10.printStackTrace();
               return null;
            }

            if (!GraphicsDisplay.Field2678 || Field9963[var0]) {
               Field9962[var0] = var2;
            }

            TextureData.Method13530(var0);
            return var2;
         }
      }
   }

   private static int Method9430(int var0, double var1) {
      return (int)(Math.pow((double)(var0 >>> 16) / 256.0D, var1) * 256.0D) << 16 | (int)(Math.pow((double)(var0 >>> 8 & 255) / 256.0D, var1) * 256.0D) << 8 | (int)(Math.pow((double)(var0 & 255) / 256.0D, var1) * 256.0D);
   }

   public static double Method9431() {
      return Field9953;
   }

   public static boolean calculatePalette(double var0) {
      if (GraphicsDisplay.Field2678 && GraphicsDisplay.Field2667 && GraphicsDisplay.Field2665 && (double)Field9952 > 0.6D) {
         Field9953 = var0;
         return false;
      } else {
         int var2;
         if ((var2 = (int)(var0 * 1000.0D)) == Field9952) {
            return false;
         } else {
            Field9952 = var2;
            var2 = 0;
            Field9953 = var0;

            for(int var3 = 0; var3 < 512; ++var3) {
               double var5 = (double)(var3 / 8) / 64.0D + 0.0078125D;
               double var7 = (double)(var3 & 7) / 8.0D + 0.0625D;

               for(int var4 = 0; var4 < 128; ++var4) {
                  double var10;
                  double var12 = var10 = (double)var4 / 128.0D;
                  double var14 = var10;
                  double var16 = var10;
                  if (var7 != 0.0D) {
                     double var18;
                     if (var10 < 0.5D) {
                        var18 = var10 * (var7 + 1.0D);
                     } else {
                        var18 = var10 + var7 - var10 * var7;
                     }

                     double var20 = var10 * 2.0D - var18;
                     double var22;
                     if ((var22 = var5 + 0.3333333333333333D) > 1.0D) {
                        --var22;
                     }

                     double var26;
                     if ((var26 = var5 - 0.3333333333333333D) < 0.0D) {
                        ++var26;
                     }

                     if (var22 * 6.0D < 1.0D) {
                        var12 = var20 + (var18 - var20) * 6.0D * var22;
                     } else if (var22 * 2.0D < 1.0D) {
                        var12 = var18;
                     } else if (var22 * 3.0D < 2.0D) {
                        var12 = var20 + (var18 - var20) * (0.6666666666666666D - var22) * 6.0D;
                     } else {
                        var12 = var20;
                     }

                     if (var5 * 6.0D < 1.0D) {
                        var14 = var20 + (var18 - var20) * 6.0D * var5;
                     } else if (var5 * 2.0D < 1.0D) {
                        var14 = var18;
                     } else if (var5 * 3.0D < 2.0D) {
                        var14 = var20 + (var18 - var20) * (0.6666666666666666D - var5) * 6.0D;
                     } else {
                        var14 = var20;
                     }

                     if (var26 * 6.0D < 1.0D) {
                        var16 = var20 + (var18 - var20) * 6.0D * var26;
                     } else if (var26 * 2.0D < 1.0D) {
                        var16 = var18;
                     } else if (var26 * 3.0D < 2.0D) {
                        var16 = var20 + (var18 - var20) * (0.6666666666666666D - var26) * 6.0D;
                     } else {
                        var16 = var20;
                     }
                  }

                  int var28 = (int)(var12 * 256.0D);
                  int var19 = (int)(var14 * 256.0D);
                  int var29 = (int)(var16 * 256.0D);
                  int var21;
                  if ((var21 = Method9430((var28 << 16) + (var19 << 8) + var29, var0)) == 0) {
                     var21 = 1;
                  }

                  Field9964[var2++] = var21;
               }
            }

            ParticleDefinition.Method7790();
            return true;
         }
      }
   }

   public static int Method9433(long var0) {
      float var2 = (float)(var0 >> 16 & 255L) / 256.0F;
      float var3 = (float)(var0 >> 8 & 255L) / 256.0F;
      float var8 = (float)(var0 & 255L) / 256.0F;
      float var1 = var2;
      if (var3 < var2) {
         var1 = var3;
      }

      if (var8 < var1) {
         var1 = var8;
      }

      float var4 = var2;
      if (var3 > var2) {
         var4 = var3;
      }

      if (var8 > var4) {
         var4 = var8;
      }

      float var5 = 0.0F;
      float var6 = 0.0F;
      float var7 = (var1 + var4) / 2.0F;
      if (var1 != var4) {
         if ((double)var7 < 0.5D) {
            var6 = (var4 - var1) / (var4 + var1);
         }

         if ((double)var7 >= 0.5D) {
            var6 = (var4 - var1) / (2.0F - var4 - var1);
         }

         if (var2 == var4) {
            var5 = (var3 - var8) / (var4 - var1);
         } else if (var3 == var4) {
            var5 = 2.0F + (var8 - var2) / (var4 - var1);
         } else if (var8 == var4) {
            var5 = 4.0F + (var2 - var3) / (var4 - var1);
         }
      }

      var8 = (float)((double)var5 / 6.0D) * 256.0F;
      var1 = var6 * 256.0F;
      var2 = var7 * 256.0F;
      if (var1 < 0.0F) {
         var1 = 0.0F;
      } else if (var1 > 255.0F) {
         var1 = 255.0F;
      }

      if (var2 < 0.0F) {
         var2 = 0.0F;
      } else if (var2 > 255.0F) {
         var2 = 255.0F;
      }

      int var10000 = Math.round(var8);
      int var10001 = Math.round(var1);
      int var10 = Math.round(var2);
      int var11 = var10001;
      int var9 = var10000;
      if (var10 > 179) {
         var11 /= 2;
      }

      if (var10 > 192) {
         var11 /= 2;
      }

      if (var10 > 217) {
         var11 /= 2;
      }

      if (var10 > 243) {
         var11 /= 2;
      }

      return (var9 / 4 << 10) + (var11 / 32 << 7) + var10 / 2;
   }

   public static synchronized void Method14458() {
      if (!GraphicsDisplay.Field2678) {
         if (Field9967 > 3) {
            Field9967 = 3;
         }

         Field9969.set(0);
         Field9970.set(0);
      }
   }

   public static synchronized void Method14471() {
   }

   public static void Method14472() {
   }

   public static void Method9437(float var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, int var9, boolean var10, int var11) {
      boolean var12 = var6 < 100000.0F && var7 < 100000.0F && var8 < 100000.0F;
      if (!GraphicsDisplay.Field2678 || !var12) {
         int var10000 = (int)var0;
         int var10001 = (int)var1;
         int var10002 = (int)var2;
         int var10003 = (int)var3;
         int var10004 = (int)var4;
         int var10005 = (int)var5;
         var11 &= 255;
         var10 = var10;
         var9 = var9;
         int var27 = var10005;
         int var26 = var10004;
         int var25 = var10003;
         int var24 = var10002;
         int var23 = var10001;
         int var22 = var10000;
         int var28 = 0;
         if (var23 != var22) {
            var28 = (var26 - var25 << 16) / (var23 - var22);
         }

         int var13 = 0;
         if (var24 != var23) {
            var13 = (var27 - var26 << 16) / (var24 - var23);
         }

         int var14 = 0;
         if (var24 != var22) {
            var14 = (var25 - var27 << 16) / (var22 - var24);
         }

         float var15 = (float)(var26 - var25);
         float var16 = (float)(var23 - var22);
         float var17 = (float)(var27 - var25);
         float var18 = (float)(var24 - var22);
         float var19 = var7 - var6;
         float var20 = var8 - var6;
         float var21 = var15 * var18 - var17 * var16;
         var16 = (var19 * var18 - var20 * var16) / var21;
         var15 = (var20 * var15 - var19 * var17) / var21;
         if (var22 <= var23 && var22 <= var24) {
            if (var22 < Class697.Field8764) {
               if (var23 > Class697.Field8764) {
                  var23 = Class697.Field8764;
               }

               if (var24 > Class697.Field8764) {
                  var24 = Class697.Field8764;
               }

               var6 = var6 - var16 * (float)var25 + var16;
               if (var23 < var24) {
                  var27 = var25 <<= 16;
                  if (var22 < 0) {
                     var27 -= var14 * var22;
                     var25 -= var28 * var22;
                     var6 -= var15 * (float)var22;
                     var22 = 0;
                  }

                  var26 <<= 16;
                  if (var23 < 0) {
                     var26 -= var13 * var23;
                     var23 = 0;
                  }

                  if (var22 != var23 && var14 < var28 || var22 == var23 && var14 > var13) {
                     var24 -= var23;
                     var23 -= var22;
                     var22 = Field9961[var22];

                     while(true) {
                        --var23;
                        if (var23 < 0) {
                           while(true) {
                              --var24;
                              if (var24 < 0) {
                                 return;
                              }

                              Method9443(r_31, var22, var9, var27 >> 16, var26 >> 16, var10, var6, var16, var11);
                              var27 += var14;
                              var26 += var13;
                              var22 += s_35;
                              var6 += var15;
                           }
                        }

                        Method9443(r_31, var22, var9, var27 >> 16, var25 >> 16, var10, var6, var16, var11);
                        var27 += var14;
                        var25 += var28;
                        var6 += var15;
                        var22 += s_35;
                     }
                  }

                  var24 -= var23;
                  var23 -= var22;
                  var22 = Field9961[var22];

                  while(true) {
                     --var23;
                     if (var23 < 0) {
                        while(true) {
                           --var24;
                           if (var24 < 0) {
                              return;
                           }

                           Method9443(r_31, var22, var9, var26 >> 16, var27 >> 16, var10, var6, var16, var11);
                           var27 += var14;
                           var26 += var13;
                           var22 += s_35;
                           var6 += var15;
                        }
                     }

                     Method9443(r_31, var22, var9, var25 >> 16, var27 >> 16, var10, var6, var16, var11);
                     var27 += var14;
                     var25 += var28;
                     var6 += var15;
                     var22 += s_35;
                  }
               }

               var26 = var25 <<= 16;
               if (var22 < 0) {
                  var26 -= var14 * var22;
                  var25 -= var28 * var22;
                  var22 = 0;
               }

               var27 <<= 16;
               if (var24 < 0) {
                  var27 -= var13 * var24;
                  var24 = 0;
               }

               if (var22 != var24 && var14 < var28 || var22 == var24 && var13 > var28) {
                  var23 -= var24;
                  var24 -= var22;
                  var22 = Field9961[var22];

                  while(true) {
                     --var24;
                     if (var24 < 0) {
                        while(true) {
                           --var23;
                           if (var23 < 0) {
                              return;
                           }

                           Method9443(r_31, var22, var9, var27 >> 16, var25 >> 16, var10, var6, var16, var11);
                           var27 += var13;
                           var25 += var28;
                           var22 += s_35;
                           var6 += var15;
                        }
                     }

                     Method9443(r_31, var22, var9, var26 >> 16, var25 >> 16, var10, var6, var16, var11);
                     var26 += var14;
                     var25 += var28;
                     var6 += var15;
                     var22 += s_35;
                  }
               }

               var23 -= var24;
               var24 -= var22;
               var22 = Field9961[var22];

               while(true) {
                  --var24;
                  if (var24 < 0) {
                     while(true) {
                        --var23;
                        if (var23 < 0) {
                           return;
                        }

                        Method9443(r_31, var22, var9, var25 >> 16, var27 >> 16, var10, var6, var16, var11);
                        var27 += var13;
                        var25 += var28;
                        var22 += s_35;
                        var6 += var15;
                     }
                  }

                  Method9443(r_31, var22, var9, var25 >> 16, var26 >> 16, var10, var6, var16, var11);
                  var26 += var14;
                  var25 += var28;
                  var6 += var15;
                  var22 += s_35;
               }
            }
         } else if (var23 <= var24) {
            if (var23 < Class697.Field8764) {
               if (var24 > Class697.Field8764) {
                  var24 = Class697.Field8764;
               }

               if (var22 > Class697.Field8764) {
                  var22 = Class697.Field8764;
               }

               var7 = var7 - var16 * (float)var26 + var16;
               if (var24 < var22) {
                  var25 = var26 <<= 16;
                  if (var23 < 0) {
                     var25 -= var28 * var23;
                     var26 -= var13 * var23;
                     var23 = 0;
                  }

                  var27 <<= 16;
                  if (var24 < 0) {
                     var27 -= var14 * var24;
                     var24 = 0;
                  }

                  if (var23 != var24 && var28 < var13 || var23 == var24 && var28 > var14) {
                     var22 -= var24;
                     var24 -= var23;
                     var23 = Field9961[var23];

                     while(true) {
                        --var24;
                        if (var24 < 0) {
                           while(true) {
                              --var22;
                              if (var22 < 0) {
                                 return;
                              }

                              Method9443(r_31, var23, var9, var25 >> 16, var27 >> 16, var10, var7, var16, var11);
                              var25 += var28;
                              var27 += var14;
                              var23 += s_35;
                              var7 += var15;
                           }
                        }

                        Method9443(r_31, var23, var9, var25 >> 16, var26 >> 16, var10, var7, var16, var11);
                        var25 += var28;
                        var26 += var13;
                        var7 += var15;
                        var23 += s_35;
                     }
                  }

                  var22 -= var24;
                  var24 -= var23;
                  var23 = Field9961[var23];

                  while(true) {
                     --var24;
                     if (var24 < 0) {
                        while(true) {
                           --var22;
                           if (var22 < 0) {
                              return;
                           }

                           Method9443(r_31, var23, var9, var27 >> 16, var25 >> 16, var10, var7, var16, var11);
                           var25 += var28;
                           var27 += var14;
                           var23 += s_35;
                           var7 += var15;
                        }
                     }

                     Method9443(r_31, var23, var9, var26 >> 16, var25 >> 16, var10, var7, var16, var11);
                     var25 += var28;
                     var26 += var13;
                     var7 += var15;
                     var23 += s_35;
                  }
               }

               var27 = var26 <<= 16;
               if (var23 < 0) {
                  var27 -= var28 * var23;
                  var26 -= var13 * var23;
                  var23 = 0;
               }

               var25 <<= 16;
               if (var22 < 0) {
                  var25 -= var14 * var22;
                  var22 = 0;
               }

               if (var28 < var13) {
                  var24 -= var22;
                  var22 -= var23;
                  var23 = Field9961[var23];

                  while(true) {
                     --var22;
                     if (var22 < 0) {
                        while(true) {
                           --var24;
                           if (var24 < 0) {
                              return;
                           }

                           Method9443(r_31, var23, var9, var25 >> 16, var26 >> 16, var10, var7, var16, var11);
                           var25 += var14;
                           var26 += var13;
                           var23 += s_35;
                           var7 += var15;
                        }
                     }

                     Method9443(r_31, var23, var9, var27 >> 16, var26 >> 16, var10, var7, var16, var11);
                     var27 += var28;
                     var26 += var13;
                     var7 += var15;
                     var23 += s_35;
                  }
               }

               var24 -= var22;
               var22 -= var23;
               var23 = Field9961[var23];

               while(true) {
                  --var22;
                  if (var22 < 0) {
                     while(true) {
                        --var24;
                        if (var24 < 0) {
                           return;
                        }

                        Method9443(r_31, var23, var9, var26 >> 16, var25 >> 16, var10, var7, var16, var11);
                        var25 += var14;
                        var26 += var13;
                        var23 += s_35;
                        var7 += var15;
                     }
                  }

                  Method9443(r_31, var23, var9, var26 >> 16, var27 >> 16, var10, var7, var16, var11);
                  var27 += var28;
                  var26 += var13;
                  var7 += var15;
                  var23 += s_35;
               }
            }
         } else if (var24 < Class697.Field8764) {
            if (var22 > Class697.Field8764) {
               var22 = Class697.Field8764;
            }

            if (var23 > Class697.Field8764) {
               var23 = Class697.Field8764;
            }

            var8 = var8 - var16 * (float)var27 + var16;
            if (var22 < var23) {
               var26 = var27 <<= 16;
               if (var24 < 0) {
                  var26 -= var13 * var24;
                  var27 -= var14 * var24;
                  var24 = 0;
               }

               var25 <<= 16;
               if (var22 < 0) {
                  var25 -= var28 * var22;
                  var22 = 0;
               }

               if (var13 < var14) {
                  var23 -= var22;
                  var22 -= var24;
                  var24 = Field9961[var24];

                  while(true) {
                     --var22;
                     if (var22 < 0) {
                        while(true) {
                           --var23;
                           if (var23 < 0) {
                              return;
                           }

                           Method9443(r_31, var24, var9, var26 >> 16, var25 >> 16, var10, var8, var16, var11);
                           var26 += var13;
                           var25 += var28;
                           var24 += s_35;
                           var8 += var15;
                        }
                     }

                     Method9443(r_31, var24, var9, var26 >> 16, var27 >> 16, var10, var8, var16, var11);
                     var26 += var13;
                     var27 += var14;
                     var8 += var15;
                     var24 += s_35;
                  }
               }

               var23 -= var22;
               var22 -= var24;
               var24 = Field9961[var24];

               while(true) {
                  --var22;
                  if (var22 < 0) {
                     while(true) {
                        --var23;
                        if (var23 < 0) {
                           return;
                        }

                        Method9443(r_31, var24, var9, var25 >> 16, var26 >> 16, var10, var8, var16, var11);
                        var26 += var13;
                        var25 += var28;
                        var24 += s_35;
                        var8 += var15;
                     }
                  }

                  Method9443(r_31, var24, var9, var27 >> 16, var26 >> 16, var10, var8, var16, var11);
                  var26 += var13;
                  var27 += var14;
                  var8 += var15;
                  var24 += s_35;
               }
            }

            var25 = var27 <<= 16;
            if (var24 < 0) {
               var25 -= var13 * var24;
               var27 -= var14 * var24;
               var24 = 0;
            }

            var26 <<= 16;
            if (var23 < 0) {
               var26 -= var28 * var23;
               var23 = 0;
            }

            if (var13 < var14) {
               var22 -= var23;
               var23 -= var24;
               var24 = Field9961[var24];

               while(true) {
                  --var23;
                  if (var23 < 0) {
                     while(true) {
                        --var22;
                        if (var22 < 0) {
                           return;
                        }

                        Method9443(r_31, var24, var9, var26 >> 16, var27 >> 16, var10, var8, var16, var11);
                        var26 += var28;
                        var27 += var14;
                        var24 += s_35;
                        var8 += var15;
                     }
                  }

                  Method9443(r_31, var24, var9, var25 >> 16, var27 >> 16, var10, var8, var16, var11);
                  var25 += var13;
                  var27 += var14;
                  var8 += var15;
                  var24 += s_35;
               }
            }

            var22 -= var23;
            var23 -= var24;
            var24 = Field9961[var24];

            while(true) {
               --var23;
               if (var23 < 0) {
                  while(true) {
                     --var22;
                     if (var22 < 0) {
                        return;
                     }

                     Method9443(r_31, var24, var9, var27 >> 16, var26 >> 16, var10, var8, var16, var11);
                     var26 += var28;
                     var27 += var14;
                     var24 += s_35;
                     var8 += var15;
                  }
               }

               Method9443(r_31, var24, var9, var27 >> 16, var25 >> 16, var10, var8, var16, var11);
               var25 += var13;
               var27 += var14;
               var8 += var15;
               var24 += s_35;
            }
         }

      }
   }

   public static void Method9438(float var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, int var9, int var10, int var11, boolean var12, int var13) {
      boolean var14 = var6 < 100000.0F && var7 < 100000.0F && var8 < 100000.0F;
      if (!GraphicsDisplay.Field2678 || !var14) {
         Method9441((int)var0, (int)var1, (int)var2, (int)var3, (int)var4, (int)var5, (float)((int)var6), (float)((int)var7), (float)((int)var8), var9 & '\uffff', var10 & '\uffff', var11 & '\uffff', var12, var13 & 255);
      }
   }

   public static boolean Method9439(float var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20, int var21, int var22, boolean var23, boolean var24, int var25) {
      boolean var26 = var6 < 100000.0F && var7 < 100000.0F && var8 < 100000.0F;
      if (GraphicsDisplay.Field2678 && var26) {
         return true;
      } else {
         int var10000 = (int)var0;
         int var10001 = (int)var1;
         int var10002 = (int)var2;
         int var10003 = (int)var3;
         int var10004 = (int)var4;
         int var10005 = (int)var5;
         int var10022 = var22 & '\uffff';
         var25 = var25;
         var24 = var24;
         var23 = var23;
         var22 = var10022;
         var11 = var11;
         var10 = var10;
         var9 = var9;
         int var87 = var10005;
         int var86 = var10004;
         int var85 = var10003;
         int var84 = var10002;
         int var83 = var10001;
         int var82 = var10000;
         var26 = false;
         var21 = var21 == 197 ? 424 : (var21 == 15 ? -1 : var21);
         Class120 var27 = null;
         if (Class120.Field9548 != null && var21 > 0 && var21 < Class120.Field9548.length) {
            var27 = Class120.Field9548[var21];
         }

         if (GraphicsDisplay.Field2678 && var21 <= 0) {
            var26 = true;
         }

         if (GraphicsDisplay.Field2678 && var21 > 0) {
            var26 = false;
         }

         if (var22 >= 65535) {
            var22 = -1;
         }

         if (var22 == 16711422) {
            var26 = false;
         }

         if (Class120.Field9548 != null && var21 >= 0 && var21 < Class120.Field9548.length && !var26) {
            if (var27 == null) {
               Method9441(var82, var83, var84, var85, var86, var87, var6, var7, var8, var9 & '\uffff', var10 & '\uffff', var11 & '\uffff', var24, var25);
               return true;
            } else {
               int[] var88;
               if ((var88 = Method9429(var21)) == null) {
                  Method9441(var82, var83, var84, var85, var86, var87, var6, var7, var8, var9 & '\uffff', var10 & '\uffff', var11 & '\uffff', var24, var25);
                  return false;
               } else {
                  if (var21 == Field9944) {
                     Method9441(var82, var83, var84, var85, var86, var87, var6, var7, var8, var9 & '\uffff', var10 & '\uffff', var11 & '\uffff', var24, var25);
                     var22 = -1;
                     var11 = 255;
                     var10 = 255;
                     var9 = 255;
                  } else if (!var23 && !var27.Field9529) {
                     Method9441(var82, var83, var84, var85, var86, var87, var6, var7, var8, var9 & '\uffff', var10 & '\uffff', var11 & '\uffff', var24, var25);
                     return true;
                  }

                  if (var22 >= 0) {
                     var22 = Field9964[var22];
                  }

                  var13 = var12 - var13;
                  var16 = var15 - var16;
                  var19 = var18 - var19;
                  var14 -= var12;
                  var17 -= var15;
                  var20 -= var18;
                  var21 = var14 * var15 - var17 * var12 << Client.Field12133 + 5;
                  int var89 = var17 * var18 - var20 * var15 << 8;
                  int var28 = var20 * var12 - var14 * var18 << 5;
                  int var29 = var13 * var15 - var16 * var12 << Client.Field12133 + 5;
                  var15 = var16 * var18 - var19 * var15 << 8;
                  var12 = var19 * var12 - var13 * var18 << 5;
                  var18 = var16 * var14 - var13 * var17 << Client.Field12133 + 5;
                  var16 = var19 * var17 - var16 * var20 << 8;
                  int var64 = var13 * var20 - var19 * var14 << 5;
                  int var65 = 0;
                  int var66 = 0;
                  if (var83 != var82) {
                     var65 = (var86 - var85 << 16) / (var83 - var82);
                     var66 = (var10 - var9 << 16) / (var83 - var82);
                  }

                  int var67 = 0;
                  int var68 = 0;
                  if (var84 != var83) {
                     var67 = (var87 - var86 << 16) / (var84 - var83);
                     var68 = (var11 - var10 << 16) / (var84 - var83);
                  }

                  int var69 = 0;
                  int var70 = 0;
                  if (var84 != var82) {
                     var69 = (var85 - var87 << 16) / (var82 - var84);
                     var70 = (var9 - var11 << 16) / (var82 - var84);
                  }

                  float var71 = (float)(var86 - var85);
                  float var72 = (float)(var83 - var82);
                  float var73 = (float)(var87 - var85);
                  float var74 = (float)(var84 - var82);
                  float var75 = var7 - var6;
                  float var76 = var8 - var6;
                  float var77 = var71 * var74 - var73 * var72;
                  float var78 = (var75 * var74 - var76 * var72) / var77;
                  float var79 = (var76 * var71 - var75 * var73) / var77;
                  int var80;
                  if (var82 <= var83 && var82 <= var84) {
                     if (var82 >= Class697.Field8764) {
                        return true;
                     } else {
                        if (var83 > Class697.Field8764) {
                           var83 = Class697.Field8764;
                        }

                        if (var84 > Class697.Field8764) {
                           var84 = Class697.Field8764;
                        }

                        var6 = var6 - var78 * (float)var85 + var78;
                        if (var83 < var84) {
                           var87 = var85 <<= 16;
                           var11 = var9 <<= 16;
                           if (var82 < 0) {
                              var87 -= var69 * var82;
                              var85 -= var65 * var82;
                              var11 -= var70 * var82;
                              var9 -= var66 * var82;
                              var6 -= var79 * (float)var82;
                              var82 = 0;
                           }

                           var86 <<= 16;
                           var10 <<= 16;
                           if (var83 < 0) {
                              var86 -= var67 * var83;
                              var10 -= var68 * var83;
                              var83 = 0;
                           }

                           var80 = var82 - Field9956;
                           var21 += var28 * var80;
                           var29 += var12 * var80;
                           var18 += var64 * var80;
                           var84 -= var83;
                           var83 -= var82;
                           var82 = Field9961[var82];

                           while(true) {
                              --var83;
                              if (var83 < 0) {
                                 while(true) {
                                    --var84;
                                    if (var84 < 0) {
                                       return true;
                                    }

                                    Method9440(r_31, var88, var82, var86 >> 16, var87 >> 16, var10 >> 8, var11 >> 8, var21, var29, var18, var89, var15, var16, var22, var23, var24, var6, var78, var25);
                                    var87 += var69;
                                    var86 += var67;
                                    var11 += var70;
                                    var10 += var68;
                                    var82 += s_35;
                                    var21 += var28;
                                    var29 += var12;
                                    var18 += var64;
                                    var6 += var79;
                                 }
                              }

                              Method9440(r_31, var88, var82, var85 >> 16, var87 >> 16, var9 >> 8, var11 >> 8, var21, var29, var18, var89, var15, var16, var22, var23, var24, var6, var78, var25);
                              var87 += var69;
                              var85 += var65;
                              var11 += var70;
                              var9 += var66;
                              var82 += s_35;
                              var21 += var28;
                              var29 += var12;
                              var18 += var64;
                              var6 += var79;
                           }
                        } else {
                           var86 = var85 <<= 16;
                           var10 = var9 <<= 16;
                           if (var82 < 0) {
                              var86 -= var69 * var82;
                              var85 -= var65 * var82;
                              var10 -= var70 * var82;
                              var9 -= var66 * var82;
                              var82 = 0;
                           }

                           var87 <<= 16;
                           var11 <<= 16;
                           if (var84 < 0) {
                              var87 -= var67 * var84;
                              var11 -= var68 * var84;
                              var84 = 0;
                           }

                           var80 = var82 - Field9956;
                           var21 += var28 * var80;
                           var29 += var12 * var80;
                           var18 += var64 * var80;
                           var83 -= var84;
                           var84 -= var82;
                           var82 = Field9961[var82];

                           while(true) {
                              --var84;
                              if (var84 < 0) {
                                 while(true) {
                                    --var83;
                                    if (var83 < 0) {
                                       return true;
                                    }

                                    Method9440(r_31, var88, var82, var85 >> 16, var87 >> 16, var9 >> 8, var11 >> 8, var21, var29, var18, var89, var15, var16, var22, var23, var24, var6, var78, var25);
                                    var87 += var67;
                                    var85 += var65;
                                    var11 += var68;
                                    var9 += var66;
                                    var82 += s_35;
                                    var21 += var28;
                                    var29 += var12;
                                    var18 += var64;
                                    var6 += var79;
                                 }
                              }

                              Method9440(r_31, var88, var82, var85 >> 16, var86 >> 16, var9 >> 8, var10 >> 8, var21, var29, var18, var89, var15, var16, var22, var23, var24, var6, var78, var25);
                              var86 += var69;
                              var85 += var65;
                              var10 += var70;
                              var9 += var66;
                              var82 += s_35;
                              var21 += var28;
                              var29 += var12;
                              var18 += var64;
                              var6 += var79;
                           }
                        }
                     }
                  } else if (var83 <= var84) {
                     if (var83 >= Class697.Field8764) {
                        return true;
                     } else {
                        if (var84 > Class697.Field8764) {
                           var84 = Class697.Field8764;
                        }

                        if (var82 > Class697.Field8764) {
                           var82 = Class697.Field8764;
                        }

                        var7 = var7 - var78 * (float)var86 + var78;
                        if (var84 < var82) {
                           var85 = var86 <<= 16;
                           var9 = var10 <<= 16;
                           if (var83 < 0) {
                              var85 -= var65 * var83;
                              var86 -= var67 * var83;
                              var9 -= var66 * var83;
                              var10 -= var68 * var83;
                              var83 = 0;
                           }

                           var87 <<= 16;
                           var11 <<= 16;
                           if (var84 < 0) {
                              var87 -= var69 * var84;
                              var11 -= var70 * var84;
                              var84 = 0;
                           }

                           var80 = var83 - Field9956;
                           var21 += var28 * var80;
                           var29 += var12 * var80;
                           var18 += var64 * var80;
                           var82 -= var84;
                           var84 -= var83;
                           var83 = Field9961[var83];

                           while(true) {
                              --var84;
                              if (var84 < 0) {
                                 while(true) {
                                    --var82;
                                    if (var82 < 0) {
                                       return true;
                                    }

                                    Method9440(r_31, var88, var83, var87 >> 16, var85 >> 16, var11 >> 8, var9 >> 8, var21, var29, var18, var89, var15, var16, var22, var23, var24, var7, var78, var25);
                                    var85 += var65;
                                    var87 += var69;
                                    var9 += var66;
                                    var11 += var70;
                                    var83 += s_35;
                                    var21 += var28;
                                    var29 += var12;
                                    var18 += var64;
                                    var7 += var79;
                                 }
                              }

                              Method9440(r_31, var88, var83, var86 >> 16, var85 >> 16, var10 >> 8, var9 >> 8, var21, var29, var18, var89, var15, var16, var22, var23, var24, var7, var78, var25);
                              var85 += var65;
                              var86 += var67;
                              var9 += var66;
                              var10 += var68;
                              var83 += s_35;
                              var21 += var28;
                              var29 += var12;
                              var18 += var64;
                              var7 += var79;
                           }
                        } else {
                           var87 = var86 <<= 16;
                           var11 = var10 <<= 16;
                           if (var83 < 0) {
                              var87 -= var65 * var83;
                              var86 -= var67 * var83;
                              var11 -= var66 * var83;
                              var10 -= var68 * var83;
                              var83 = 0;
                           }

                           var85 <<= 16;
                           var9 <<= 16;
                           if (var82 < 0) {
                              var85 -= var69 * var82;
                              var9 -= var70 * var82;
                              var82 = 0;
                           }

                           var80 = var83 - Field9956;
                           var21 += var28 * var80;
                           var29 += var12 * var80;
                           var18 += var64 * var80;
                           var84 -= var82;
                           var82 -= var83;
                           var83 = Field9961[var83];

                           while(true) {
                              --var82;
                              if (var82 < 0) {
                                 while(true) {
                                    --var84;
                                    if (var84 < 0) {
                                       return true;
                                    }

                                    Method9440(r_31, var88, var83, var86 >> 16, var85 >> 16, var10 >> 8, var9 >> 8, var21, var29, var18, var89, var15, var16, var22, var23, var24, var7, var78, var25);
                                    var85 += var69;
                                    var86 += var67;
                                    var9 += var70;
                                    var10 += var68;
                                    var83 += s_35;
                                    var21 += var28;
                                    var29 += var12;
                                    var18 += var64;
                                    var7 += var79;
                                 }
                              }

                              Method9440(r_31, var88, var83, var86 >> 16, var87 >> 16, var10 >> 8, var11 >> 8, var21, var29, var18, var89, var15, var16, var22, var23, var24, var7, var78, var25);
                              var87 += var65;
                              var86 += var67;
                              var11 += var66;
                              var10 += var68;
                              var83 += s_35;
                              var21 += var28;
                              var29 += var12;
                              var18 += var64;
                              var7 += var79;
                           }
                        }
                     }
                  } else if (var84 >= Class697.Field8764) {
                     return true;
                  } else {
                     if (var82 > Class697.Field8764) {
                        var82 = Class697.Field8764;
                     }

                     if (var83 > Class697.Field8764) {
                        var83 = Class697.Field8764;
                     }

                     var8 = var8 - var78 * (float)var87 + var78;
                     if (var82 < var83) {
                        var86 = var87 <<= 16;
                        var10 = var11 <<= 16;
                        if (var84 < 0) {
                           var86 -= var67 * var84;
                           var87 -= var69 * var84;
                           var10 -= var68 * var84;
                           var11 -= var70 * var84;
                           var84 = 0;
                        }

                        var85 <<= 16;
                        var9 <<= 16;
                        if (var82 < 0) {
                           var85 -= var65 * var82;
                           var9 -= var66 * var82;
                           var82 = 0;
                        }

                        var80 = var84 - Field9956;
                        var21 += var28 * var80;
                        var29 += var12 * var80;
                        var18 += var64 * var80;
                        var83 -= var82;
                        var82 -= var84;
                        var84 = Field9961[var84];

                        while(true) {
                           --var82;
                           if (var82 < 0) {
                              while(true) {
                                 --var83;
                                 if (var83 < 0) {
                                    return true;
                                 }

                                 Method9440(r_31, var88, var84, var85 >> 16, var86 >> 16, var9 >> 8, var10 >> 8, var21, var29, var18, var89, var15, var16, var22, var23, var24, var8, var78, var25);
                                 var86 += var67;
                                 var85 += var65;
                                 var10 += var68;
                                 var9 += var66;
                                 var84 += s_35;
                                 var21 += var28;
                                 var29 += var12;
                                 var18 += var64;
                                 var8 += var79;
                              }
                           }

                           Method9440(r_31, var88, var84, var87 >> 16, var86 >> 16, var11 >> 8, var10 >> 8, var21, var29, var18, var89, var15, var16, var22, var23, var24, var8, var78, var25);
                           var86 += var67;
                           var87 += var69;
                           var10 += var68;
                           var11 += var70;
                           var84 += s_35;
                           var21 += var28;
                           var29 += var12;
                           var18 += var64;
                           var8 += var79;
                        }
                     } else {
                        var85 = var87 <<= 16;
                        var9 = var11 <<= 16;
                        if (var84 < 0) {
                           var85 -= var67 * var84;
                           var87 -= var69 * var84;
                           var9 -= var68 * var84;
                           var11 -= var70 * var84;
                           var84 = 0;
                        }

                        var86 <<= 16;
                        var10 <<= 16;
                        if (var83 < 0) {
                           var86 -= var65 * var83;
                           var10 -= var66 * var83;
                           var83 = 0;
                        }

                        var80 = var84 - Field9956;
                        var21 += var28 * var80;
                        var29 += var12 * var80;
                        var18 += var64 * var80;
                        if (var67 < var69) {
                           return true;
                        } else {
                           var82 -= var83;
                           var83 -= var84;
                           var84 = Field9961[var84];

                           while(true) {
                              --var83;
                              if (var83 < 0) {
                                 while(true) {
                                    --var82;
                                    if (var82 < 0) {
                                       return true;
                                    }

                                    Method9440(r_31, var88, var84, var87 >> 16, var86 >> 16, var11 >> 8, var10 >> 8, var21, var29, var18, var89, var15, var16, var22, var23, var24, var8, var78, var25);
                                    var86 += var65;
                                    var87 += var69;
                                    var10 += var66;
                                    var11 += var70;
                                    var84 += s_35;
                                    var21 += var28;
                                    var29 += var12;
                                    var18 += var64;
                                    var8 += var79;
                                 }
                              }

                              Method9440(r_31, var88, var84, var87 >> 16, var85 >> 16, var11 >> 8, var9 >> 8, var21, var29, var18, var89, var15, var16, var22, var23, var24, var8, var78, var25);
                              var85 += var67;
                              var87 += var69;
                              var9 += var68;
                              var11 += var70;
                              var84 += s_35;
                              var21 += var28;
                              var29 += var12;
                              var18 += var64;
                              var8 += var79;
                           }
                        }
                     }
                  }
               }
            }
         } else {
            Method9441(var82, var83, var84, var85, var86, var87, var6, var7, var8, var9 & '\uffff', var10 & '\uffff', var11 & '\uffff', var24, var25);
            return true;
         }
      }
   }

   private static void Method9440(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, boolean var14, boolean var15, float var16, float var17, int var18) {
      int var29 = 0;
      int var30 = 0;
      if (var3 < var4) {
         int var28;
         if (var15) {
            var6 = (var6 - var5) / (var4 - var3);
            if (var4 > Class697.Field8767) {
               var4 = Class697.Field8767;
            }

            if (var3 < 0) {
               var5 -= var3 * var6;
               var3 = 0;
            }

            if (var3 >= var4) {
               return;
            }

            var28 = var4 - var3 >> 3;
            var6 <<= 12;
         } else if (var4 - var3 > 7) {
            var28 = var4 - var3 >> 3;
            var6 = (var6 - var5) * Field9957[var28] >> 6;
         } else {
            var28 = 0;
            var6 = 0;
         }

         var5 <<= 9;
         var2 += var3;
         var18 = 256 - var18;
         int var19 = 0;
         int var20 = 0;
         int var21 = var3 - Field9955;
         var7 += (var10 >> 3) * var21;
         var8 += (var11 >> 3) * var21;
         if ((var21 = (var9 += (var12 >> 3) * var21) >> 14) != 0) {
            var29 = var7 / var21;
            var30 = var8 / var21;
            if (var29 < 0) {
               var29 = 0;
            } else if (var29 > 16256) {
               var29 = 16256;
            }
         }

         var7 += var10;
         var8 += var11;
         if ((var21 = (var9 += var12) >> 14) != 0) {
            var19 = var7 / var21;
            var20 = var8 / var21;
            if (var19 < 7) {
               var19 = 7;
            } else if (var19 > 16256) {
               var19 = 16256;
            }
         }

         var21 = var19 - var29 >> 3;
         int var22 = var20 - var30 >> 3;

         int var23;
         int var24;
         int var25;
         int var26;
         int var27;
         for(var29 += var5 & 6291456; var28-- > 0; var29 += var5 & 6291456) {
            for(var27 = 0; var27 < 8; ++var27) {
               var25 = (var24 = var1[((var30 & 16256) + (var29 >> 7)) % 16384]) >>> 24;
               var18 = var18;
               var23 = 256 - var18;
               if (var25 != 0 || var14) {
                  if (var25 != 255 && var13 >= 0) {
                     if (var25 == 0) {
                        var24 = var13;
                     } else {
                        var26 = 255 - var25;
                        var24 = ((-16711936 & (16711935 & var24) * var25 | 16711680 & (var24 & '\uff00') * var25) >>> 8) + ((16711680 & var26 * (var13 & '\uff00') | var26 * (var13 & 16711935) & -16711936) >>> 8);
                     }

                     var25 = 255;
                  }

                  if (var23 > 0) {
                     var25 = var25 * (var23 + 1) >>> 8;
                  }

                  if (var25 != 0) {
                     if (var25 == 255) {
                        var23 = var24 & 16777215;
                     } else {
                        var23 = var0[var2];
                        var26 = 255 - var25;
                        var23 = ((-16711936 & (16711935 & var24) * var25 | 16711680 & (var24 & '\uff00') * var25) >>> 8) + ((16711680 & var26 * (var23 & '\uff00') | var26 * (var23 & 16711935) & -16711936) >>> 8) & 16777215;
                     }

                     var0[var2] = var23;
                  }
               }

               ++var2;
               var29 += var21;
               var30 += var22;
            }

            var29 = var19;
            var30 = var20;
            var7 += var10;
            var8 += var11;
            if ((var27 = (var9 += var12) >> 14) != 0) {
               var19 = var7 / var27;
               var20 = var8 / var27;
               if (var19 < 7) {
                  var19 = 7;
               } else if (var19 > 16256) {
                  var19 = 16256;
               }
            }

            var21 = var19 - var29 >> 3;
            var22 = var20 - var30 >> 3;
            var5 += var6;
         }

         for(var28 = var4 - var3 & 7; var28-- > 0 && (var27 = ((var30 & 16256) + (var29 >> 7)) % 16384) < var1.length; var30 += var22) {
            var25 = (var24 = var1[var27]) >>> 24;
            var18 = var18;
            var23 = 256 - var18;
            if (var25 != 0 || var14) {
               if (var25 != 255 && var13 >= 0) {
                  if (var25 == 0) {
                     var24 = var13;
                  } else {
                     var26 = 255 - var25;
                     var24 = ((-16711936 & (16711935 & var24) * var25 | 16711680 & (var24 & '\uff00') * var25) >>> 8) + ((16711680 & var26 * (var13 & '\uff00') | var26 * (var13 & 16711935) & -16711936) >>> 8);
                  }

                  var25 = 255;
               }

               if (var23 > 0) {
                  var25 = var25 * (var23 + 1) >>> 8;
               }

               if (var25 != 0) {
                  if (var25 == 255) {
                     var23 = var24 & 16777215;
                  } else {
                     var23 = var0[var2];
                     var26 = 255 - var25;
                     var23 = ((-16711936 & (16711935 & var24) * var25 | 16711680 & (var24 & '\uff00') * var25) >>> 8) + ((16711680 & var26 * (var23 & '\uff00') | var26 * (var23 & 16711935) & -16711936) >>> 8) & 16777215;
                  }

                  if (var2 >= 0 && var2 < var0.length) {
                     var0[var2] = var23;
                  }
               }
            }

            ++var2;
            var29 += var21;
         }

      }
   }

   private static void Method9441(int var0, int var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9, int var10, int var11, boolean var12, int var13) {
      int var14 = 0;
      int var15 = 0;
      if (var1 != var0) {
         var14 = (var4 - var3 << 16) / (var1 - var0);
         var15 = (var10 - var9 << 15) / (var1 - var0);
      }

      int var16 = 0;
      int var17 = 0;
      if (var2 != var1) {
         var16 = (var5 - var4 << 16) / (var2 - var1);
         var17 = (var11 - var10 << 15) / (var2 - var1);
      }

      int var18 = 0;
      int var19 = 0;
      if (var2 != var0) {
         var18 = (var3 - var5 << 16) / (var0 - var2);
         var19 = (var9 - var11 << 15) / (var0 - var2);
      }

      float var20 = (float)(var4 - var3);
      float var21 = (float)(var1 - var0);
      float var22 = (float)(var5 - var3);
      float var23 = (float)(var2 - var0);
      float var24 = var7 - var6;
      float var25 = var8 - var6;
      float var26 = var20 * var23 - var22 * var21;
      var21 = (var24 * var23 - var25 * var21) / var26;
      var20 = (var25 * var20 - var24 * var22) / var26;
      if (var0 <= var1 && var0 <= var2) {
         if (var0 < Class697.Field8764) {
            if (var1 > Class697.Field8764) {
               var1 = Class697.Field8764;
            }

            if (var2 > Class697.Field8764) {
               var2 = Class697.Field8764;
            }

            var6 = var6 - var21 * (float)var3 + var21;
            if (var1 < var2) {
               var5 = var3 <<= 16;
               var11 = var9 <<= 15;
               if (var0 < 0) {
                  var5 -= var18 * var0;
                  var3 -= var14 * var0;
                  var11 -= var19 * var0;
                  var9 -= var15 * var0;
                  var6 -= var20 * (float)var0;
                  var0 = 0;
               }

               var4 <<= 16;
               var10 <<= 15;
               if (var1 < 0) {
                  var4 -= var16 * var1;
                  var10 -= var17 * var1;
                  var1 = 0;
               }

               if (var0 != var1 && var18 < var14 || var0 == var1 && var18 > var16) {
                  var2 -= var1;
                  var1 -= var0;
                  var0 = Field9961[var0];

                  while(true) {
                     --var1;
                     if (var1 < 0) {
                        while(true) {
                           --var2;
                           if (var2 < 0) {
                              return;
                           }

                           Method9442(r_31, var0, var5 >> 16, var4 >> 16, var11 >> 7, var10 >> 7, var12, var6, var21, var13);
                           var5 += var18;
                           var4 += var16;
                           var11 += var19;
                           var10 += var17;
                           var6 += var20;
                           var0 += s_35;
                        }
                     }

                     Method9442(r_31, var0, var5 >> 16, var3 >> 16, var11 >> 7, var9 >> 7, var12, var6, var21, var13);
                     var5 += var18;
                     var3 += var14;
                     var11 += var19;
                     var9 += var15;
                     var6 += var20;
                     var0 += s_35;
                  }
               } else {
                  var2 -= var1;
                  var1 -= var0;
                  var0 = Field9961[var0];

                  while(true) {
                     --var1;
                     if (var1 < 0) {
                        while(true) {
                           --var2;
                           if (var2 < 0) {
                              return;
                           }

                           Method9442(r_31, var0, var4 >> 16, var5 >> 16, var10 >> 7, var11 >> 7, var12, var6, var21, var13);
                           var5 += var18;
                           var4 += var16;
                           var11 += var19;
                           var10 += var17;
                           var0 += s_35;
                           var6 += var20;
                        }
                     }

                     Method9442(r_31, var0, var3 >> 16, var5 >> 16, var9 >> 7, var11 >> 7, var12, var6, var21, var13);
                     var5 += var18;
                     var3 += var14;
                     var11 += var19;
                     var9 += var15;
                     var6 += var20;
                     var0 += s_35;
                  }
               }
            } else {
               var4 = var3 <<= 16;
               var10 = var9 <<= 15;
               if (var0 < 0) {
                  var4 -= var18 * var0;
                  var3 -= var14 * var0;
                  var10 -= var19 * var0;
                  var9 -= var15 * var0;
                  var6 -= var20 * (float)var0;
                  var0 = 0;
               }

               var5 <<= 16;
               var11 <<= 15;
               if (var2 < 0) {
                  var5 -= var16 * var2;
                  var11 -= var17 * var2;
                  var2 = 0;
               }

               if (var0 != var2 && var18 < var14 || var0 == var2 && var16 > var14) {
                  var1 -= var2;
                  var2 -= var0;
                  var0 = Field9961[var0];

                  while(true) {
                     --var2;
                     if (var2 < 0) {
                        while(true) {
                           --var1;
                           if (var1 < 0) {
                              return;
                           }

                           Method9442(r_31, var0, var5 >> 16, var3 >> 16, var11 >> 7, var9 >> 7, var12, var6, var21, var13);
                           var5 += var16;
                           var3 += var14;
                           var11 += var17;
                           var9 += var15;
                           var0 += s_35;
                           var6 += var20;
                        }
                     }

                     Method9442(r_31, var0, var4 >> 16, var3 >> 16, var10 >> 7, var9 >> 7, var12, var6, var21, var13);
                     var4 += var18;
                     var3 += var14;
                     var10 += var19;
                     var9 += var15;
                     var6 += var20;
                     var0 += s_35;
                  }
               } else {
                  var1 -= var2;
                  var2 -= var0;
                  var0 = Field9961[var0];

                  while(true) {
                     --var2;
                     if (var2 < 0) {
                        while(true) {
                           --var1;
                           if (var1 < 0) {
                              return;
                           }

                           Method9442(r_31, var0, var3 >> 16, var5 >> 16, var9 >> 7, var11 >> 7, var12, var6, var21, var13);
                           var5 += var16;
                           var3 += var14;
                           var11 += var17;
                           var9 += var15;
                           var0 += s_35;
                           var6 += var20;
                        }
                     }

                     Method9442(r_31, var0, var3 >> 16, var4 >> 16, var9 >> 7, var10 >> 7, var12, var6, var21, var13);
                     var4 += var18;
                     var3 += var14;
                     var10 += var19;
                     var9 += var15;
                     var6 += var20;
                     var0 += s_35;
                  }
               }
            }
         }
      } else if (var1 <= var2) {
         if (var1 < Class697.Field8764) {
            if (var2 > Class697.Field8764) {
               var2 = Class697.Field8764;
            }

            if (var0 > Class697.Field8764) {
               var0 = Class697.Field8764;
            }

            var7 = var7 - var21 * (float)var4 + var21;
            if (var2 < var0) {
               var3 = var4 <<= 16;
               var9 = var10 <<= 15;
               if (var1 < 0) {
                  var3 -= var14 * var1;
                  var4 -= var16 * var1;
                  var9 -= var15 * var1;
                  var10 -= var17 * var1;
                  var7 -= var20 * (float)var1;
                  var1 = 0;
               }

               var5 <<= 16;
               var11 <<= 15;
               if (var2 < 0) {
                  var5 -= var18 * var2;
                  var11 -= var19 * var2;
                  var2 = 0;
               }

               if (var1 != var2 && var14 < var16 || var1 == var2 && var14 > var18) {
                  var0 -= var2;
                  var2 -= var1;
                  var1 = Field9961[var1];

                  while(true) {
                     --var2;
                     if (var2 < 0) {
                        while(true) {
                           --var0;
                           if (var0 < 0) {
                              return;
                           }

                           Method9442(r_31, var1, var3 >> 16, var5 >> 16, var9 >> 7, var11 >> 7, var12, var7, var21, var13);
                           var3 += var14;
                           var5 += var18;
                           var9 += var15;
                           var11 += var19;
                           var1 += s_35;
                           var7 += var20;
                        }
                     }

                     Method9442(r_31, var1, var3 >> 16, var4 >> 16, var9 >> 7, var10 >> 7, var12, var7, var21, var13);
                     var3 += var14;
                     var4 += var16;
                     var9 += var15;
                     var10 += var17;
                     var7 += var20;
                     var1 += s_35;
                  }
               } else {
                  var0 -= var2;
                  var2 -= var1;
                  var1 = Field9961[var1];

                  while(true) {
                     --var2;
                     if (var2 < 0) {
                        while(true) {
                           --var0;
                           if (var0 < 0) {
                              return;
                           }

                           Method9442(r_31, var1, var5 >> 16, var3 >> 16, var11 >> 7, var9 >> 7, var12, var7, var21, var13);
                           var3 += var14;
                           var5 += var18;
                           var9 += var15;
                           var11 += var19;
                           var1 += s_35;
                           var7 += var20;
                        }
                     }

                     Method9442(r_31, var1, var4 >> 16, var3 >> 16, var10 >> 7, var9 >> 7, var12, var7, var21, var13);
                     var3 += var14;
                     var4 += var16;
                     var9 += var15;
                     var10 += var17;
                     var7 += var20;
                     var1 += s_35;
                  }
               }
            } else {
               var5 = var4 <<= 16;
               var11 = var10 <<= 15;
               if (var1 < 0) {
                  var5 -= var14 * var1;
                  var4 -= var16 * var1;
                  var11 -= var15 * var1;
                  var10 -= var17 * var1;
                  var1 = 0;
               }

               var3 <<= 16;
               var9 <<= 15;
               if (var0 < 0) {
                  var3 -= var18 * var0;
                  var9 -= var19 * var0;
                  var0 = 0;
               }

               if (var14 < var16) {
                  var2 -= var0;
                  var0 -= var1;
                  var1 = Field9961[var1];

                  while(true) {
                     --var0;
                     if (var0 < 0) {
                        while(true) {
                           --var2;
                           if (var2 < 0) {
                              return;
                           }

                           Method9442(r_31, var1, var3 >> 16, var4 >> 16, var9 >> 7, var10 >> 7, var12, var7, var21, var13);
                           var3 += var18;
                           var4 += var16;
                           var9 += var19;
                           var10 += var17;
                           var1 += s_35;
                           var7 += var20;
                        }
                     }

                     Method9442(r_31, var1, var5 >> 16, var4 >> 16, var11 >> 7, var10 >> 7, var12, var7, var21, var13);
                     var5 += var14;
                     var4 += var16;
                     var11 += var15;
                     var10 += var17;
                     var7 += var20;
                     var1 += s_35;
                  }
               } else {
                  var2 -= var0;
                  var0 -= var1;
                  var1 = Field9961[var1];

                  while(true) {
                     --var0;
                     if (var0 < 0) {
                        while(true) {
                           --var2;
                           if (var2 < 0) {
                              return;
                           }

                           Method9442(r_31, var1, var4 >> 16, var3 >> 16, var10 >> 7, var9 >> 7, var12, var7, var21, var13);
                           var3 += var18;
                           var4 += var16;
                           var9 += var19;
                           var10 += var17;
                           var1 += s_35;
                           var7 += var20;
                        }
                     }

                     Method9442(r_31, var1, var4 >> 16, var5 >> 16, var10 >> 7, var11 >> 7, var12, var7, var21, var13);
                     var5 += var14;
                     var4 += var16;
                     var11 += var15;
                     var10 += var17;
                     var7 += var20;
                     var1 += s_35;
                  }
               }
            }
         }
      } else if (var2 < Class697.Field8764) {
         if (var0 > Class697.Field8764) {
            var0 = Class697.Field8764;
         }

         if (var1 > Class697.Field8764) {
            var1 = Class697.Field8764;
         }

         var8 = var8 - var21 * (float)var5 + var21;
         if (var0 < var1) {
            var4 = var5 <<= 16;
            var10 = var11 <<= 15;
            if (var2 < 0) {
               var4 -= var16 * var2;
               var5 -= var18 * var2;
               var10 -= var17 * var2;
               var11 -= var19 * var2;
               var8 -= var20 * (float)var2;
               var2 = 0;
            }

            var3 <<= 16;
            var9 <<= 15;
            if (var0 < 0) {
               var3 -= var14 * var0;
               var9 -= var15 * var0;
               var0 = 0;
            }

            if (var16 < var18) {
               var1 -= var0;
               var0 -= var2;
               var2 = Field9961[var2];

               while(true) {
                  --var0;
                  if (var0 < 0) {
                     while(true) {
                        --var1;
                        if (var1 < 0) {
                           return;
                        }

                        Method9442(r_31, var2, var4 >> 16, var3 >> 16, var10 >> 7, var9 >> 7, var12, var8, var21, var13);
                        var4 += var16;
                        var3 += var14;
                        var10 += var17;
                        var9 += var15;
                        var2 += s_35;
                        var8 += var20;
                     }
                  }

                  Method9442(r_31, var2, var4 >> 16, var5 >> 16, var10 >> 7, var11 >> 7, var12, var8, var21, var13);
                  var4 += var16;
                  var5 += var18;
                  var10 += var17;
                  var11 += var19;
                  var8 += var20;
                  var2 += s_35;
               }
            } else {
               var1 -= var0;
               var0 -= var2;
               var2 = Field9961[var2];

               while(true) {
                  --var0;
                  if (var0 < 0) {
                     while(true) {
                        --var1;
                        if (var1 < 0) {
                           return;
                        }

                        Method9442(r_31, var2, var3 >> 16, var4 >> 16, var9 >> 7, var10 >> 7, var12, var8, var21, var13);
                        var4 += var16;
                        var3 += var14;
                        var10 += var17;
                        var9 += var15;
                        var2 += s_35;
                        var8 += var20;
                     }
                  }

                  Method9442(r_31, var2, var5 >> 16, var4 >> 16, var11 >> 7, var10 >> 7, var12, var8, var21, var13);
                  var4 += var16;
                  var5 += var18;
                  var10 += var17;
                  var11 += var19;
                  var8 += var20;
                  var2 += s_35;
               }
            }
         } else {
            var3 = var5 <<= 16;
            var9 = var11 <<= 15;
            if (var2 < 0) {
               var3 -= var16 * var2;
               var5 -= var18 * var2;
               var9 -= var17 * var2;
               var11 -= var19 * var2;
               var2 = 0;
            }

            var4 <<= 16;
            var10 <<= 15;
            if (var1 < 0) {
               var4 -= var14 * var1;
               var10 -= var15 * var1;
               var1 = 0;
            }

            if (var16 < var18) {
               var0 -= var1;
               var1 -= var2;
               var2 = Field9961[var2];

               while(true) {
                  --var1;
                  if (var1 < 0) {
                     while(true) {
                        --var0;
                        if (var0 < 0) {
                           return;
                        }

                        Method9442(r_31, var2, var4 >> 16, var5 >> 16, var10 >> 7, var11 >> 7, var12, var8, var21, var13);
                        var4 += var14;
                        var5 += var18;
                        var10 += var15;
                        var11 += var19;
                        var2 += s_35;
                        var8 += var20;
                     }
                  }

                  Method9442(r_31, var2, var3 >> 16, var5 >> 16, var9 >> 7, var11 >> 7, var12, var8, var21, var13);
                  var3 += var16;
                  var5 += var18;
                  var9 += var17;
                  var11 += var19;
                  var8 += var20;
                  var2 += s_35;
               }
            } else {
               var0 -= var1;
               var1 -= var2;
               var2 = Field9961[var2];

               while(true) {
                  --var1;
                  if (var1 < 0) {
                     while(true) {
                        --var0;
                        if (var0 < 0) {
                           return;
                        }

                        Method9442(r_31, var2, var5 >> 16, var4 >> 16, var11 >> 7, var10 >> 7, var12, var8, var21, var13);
                        var4 += var14;
                        var5 += var18;
                        var10 += var15;
                        var11 += var19;
                        var2 += s_35;
                        var8 += var20;
                     }
                  }

                  Method9442(r_31, var2, var5 >> 16, var3 >> 16, var11 >> 7, var9 >> 7, var12, var8, var21, var13);
                  var3 += var16;
                  var5 += var18;
                  var9 += var17;
                  var11 += var19;
                  var8 += var20;
                  var2 += s_35;
               }
            }
         }
      }
   }

   private static void Method9442(int[] var0, int var1, int var2, int var3, int var4, int var5, boolean var6, float var7, float var8, int var9) {
      if (var6) {
         if (var3 > Class697.Field8767) {
            var3 = Class697.Field8767;
         }

         if (var2 < 0) {
            var4 -= 0;
            var2 = 0;
         }
      }

      if (var2 < var3) {
         var1 += var2;
         var4 += 0 * var2;
         if (var1 > 0) {
            var9 = var9;
            int var10;
            int var11;
            int var13;
            int var15;
            if (Field9954) {
               int var14;
               if ((var13 = var3 - var2 >> 2) > 0) {
                  var14 = (var5 - var4) * Field9957[var13] >> 15;
               } else {
                  var14 = 0;
               }

               if (var9 == 0) {
                  if (var13 > 0) {
                     do {
                        var5 = Field9964[var4 >> 8 & '\uffff'];
                        var4 += var14;
                        if (var1 >= var0.length) {
                           return;
                        }

                        for(var10 = 0; var10 < 4; ++var10) {
                           var0[var1] = var5;
                           ++var1;
                        }

                        --var13;
                     } while(var13 > 0);
                  }

                  if ((var13 = var3 - var2 & 3) > 0 && var4 >> 8 > 0) {
                     var5 = Field9964[var4 >> 8];

                     do {
                        var0[var1] = var5;
                        ++var1;
                        --var13;
                     } while(var13 > 0);

                     return;
                  }
               } else {
                  var11 = 256 - var9;
                  if (var13 > 0) {
                     do {
                        var10 = var9 = var9;
                        var11 = 256 - var9;
                        var5 = Field9964[(var4 & '\uffff') >> 8];
                        var4 += var14;
                        var5 = ((var5 & 16711935) * var11 >> 8 & 16711935) + ((var5 & '\uff00') * var11 >> 8 & '\uff00');
                        var15 = var0[var1];

                        for(int var12 = 0; var12 < 4; ++var12) {
                           var0[var1] = var5 + ((var15 & 16711935) * var10 >> 8 & 16711935) + ((var15 & '\uff00') * var10 >> 8 & '\uff00');
                           ++var1;
                        }

                        --var13;
                     } while(var13 > 0);
                  }

                  if ((var13 = var3 - var2 & 3) > 0 && var4 >> 8 > 0) {
                     var5 = (((var5 = Field9964[var4 >> 8]) & 16711935) * var11 >> 8 & 16711935) + ((var5 & '\uff00') * var11 >> 8 & '\uff00');

                     do {
                        var10 = var9 = var9;
                        var15 = var0[var1];
                        var0[var1] = var5 + ((var15 & 16711935) * var10 >> 8 & 16711935) + ((var15 & '\uff00') * var10 >> 8 & '\uff00');
                        ++var1;
                        --var13;
                     } while(var13 > 0);
                  }
               }

            } else {
               var13 = var3 - var2;
               if (var9 == 0) {
                  do {
                     if (var1 < var0.length) {
                        var0[var1] = Field9964[var4 >> 8];
                     }

                     ++var1;
                     --var13;
                  } while(var13 > 0);

               } else {
                  var11 = 256 - var9;

                  do {
                     var5 = (((var5 = Field9964[var4 >> 8]) & 16711935) * var11 >> 8 & 16711935) + ((var5 & '\uff00') * var11 >> 8 & '\uff00');
                     var10 = var9 = var9;
                     var11 = 256 - var9;
                     if (var1 >= var0.length) {
                        break;
                     }

                     var15 = var0[var1];
                     var0[var1] = var5 + ((var15 & 16711935) * var10 >> 8 & 16711935) + ((var15 & '\uff00') * var10 >> 8 & '\uff00');
                     var4 = var4;
                     ++var1;
                     --var13;
                  } while(var13 > 0);

               }
            }
         }
      }
   }

   private static void Method9443(int[] var0, int var1, int var2, int var3, int var4, boolean var5, float var6, float var7, int var8) {
      if (var5) {
         if (var4 > Class697.Field8767) {
            var4 = Class697.Field8767;
         }

         if (var3 < 0) {
            var3 = 0;
         }
      }

      if (var3 < var4) {
         var1 += var3;
         int var9 = var4 - var3 >> 2;
         int var10;
         if ((var8 = var8) == 0) {
            while(true) {
               --var9;
               if (var9 < 0) {
                  var9 = var4 - var3 & 3;

                  while(true) {
                     --var9;
                     if (var9 < 0) {
                        return;
                     }

                     if (var1 < var0.length && var1 >= 0) {
                        var0[var1++] = var2;
                     }
                  }
               }

               for(var10 = 0; var10 < 4; ++var10) {
                  if (var1 < var0.length && var1 >= 0) {
                     var0[var1++] = var2;
                  }
               }
            }
         } else {
            var10 = 256 - var8;
            var2 = ((var2 & 16711935) * var10 >> 8 & 16711935) + ((var2 & '\uff00') * var10 >> 8 & '\uff00');

            while(true) {
               --var9;
               if (var9 < 0) {
                  var9 = var4 - var3 & 3;

                  while(true) {
                     --var9;
                     if (var9 < 0) {
                        return;
                     }

                     var10 = var8 = var8;
                     var0[var1] = var2 + ((var0[var1] & 16711935) * var10 >> 8 & 16711935) + ((var0[var1] & '\uff00') * var10 >> 8 & '\uff00');
                     ++var1;
                  }
               }

               var10 = var8 = var8;

               for(int var11 = 0; var11 < 4; ++var11) {
                  var0[var1] = var2 + ((var0[var1] & 16711935) * var10 >> 8 & 16711935) + ((var0[var1] & '\uff00') * var10 >> 8 & '\uff00');
                  ++var1;
               }
            }
         }
      }
   }
}
