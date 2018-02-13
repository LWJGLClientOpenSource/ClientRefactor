package net.LWJGLClient.client.e.d;

import net.LWJGLClient.client.c.Packet;

public final class Class352 {
   private Class441 Field2133;
   private Class441 Field2134;
   private Class441 Field2135;
   private Class441 Field2136;
   private Class441 Field2137;
   private Class441 Field2138;
   private Class441 Field2139;
   private Class441 Field2140;
   private final int[] Field2141 = new int[5];
   private final int[] Field2142 = new int[5];
   private final int[] Field2143 = new int[5];
   private int Field2144;
   private int Field2145 = 100;
   private Class452 Field2146;
   private Class441 Field2147;
   public int Field2148 = 500;
   public int Field2149;
   private static int[] Field2150;
   private static int[] Field2151;
   private static int[] Field2152;
   private static final int[] Field2153 = new int[5];
   private static final int[] Field2154 = new int[5];
   private static final int[] Field2155 = new int[5];
   private static final int[] Field2156 = new int[5];
   private static final int[] Field2157 = new int[5];

   public static void Method4159() {
      Field2151 = new int['耀'];

      int var0;
      for(var0 = 0; var0 < 32768; ++var0) {
         if (Math.random() > 0.5D) {
            Field2151[var0] = 1;
         } else {
            Field2151[var0] = -1;
         }
      }

      Field2152 = new int['耀'];

      for(var0 = 0; var0 < 32768; ++var0) {
         Field2152[var0] = (int)(Math.sin((double)var0 / 5215.1903D) * 16384.0D);
      }

      Field2150 = new int[220500];
   }

   public final int[] Method4160(int var1, int var2) {
      for(int var3 = 0; var3 < var1; ++var3) {
         Field2150[var3] = 0;
      }

      if (var2 < 10) {
         return Field2150;
      } else {
         double var15 = (double)var1 / ((double)var2 + 0.0D);
         this.Field2133.Method7786();
         this.Field2134.Method7786();
         var2 = 0;
         int var5 = 0;
         int var6 = 0;
         if (this.Field2135 != null) {
            this.Field2135.Method7786();
            this.Field2136.Method7786();
            var2 = (int)((double)(this.Field2135.Field9344 - this.Field2135.Field9343) * 32.768D / var15);
            var5 = (int)((double)this.Field2135.Field9343 * 32.768D / var15);
         }

         int var7 = 0;
         int var8 = 0;
         int var9 = 0;
         if (this.Field2137 != null) {
            this.Field2137.Method7786();
            this.Field2138.Method7786();
            var7 = (int)((double)(this.Field2137.Field9344 - this.Field2137.Field9343) * 32.768D / var15);
            var8 = (int)((double)this.Field2137.Field9343 * 32.768D / var15);
         }

         int var10;
         for(var10 = 0; var10 < 5; ++var10) {
            if (this.Field2141[var10] != 0) {
               Field2153[var10] = 0;
               Field2154[var10] = (int)((double)this.Field2143[var10] * var15);
               Field2155[var10] = (this.Field2141[var10] << 14) / 100;
               Field2156[var10] = (int)((double)(this.Field2133.Field9344 - this.Field2133.Field9343) * 32.768D * Math.pow(1.0057929410678534D, (double)this.Field2142[var10]) / var15);
               Field2157[var10] = (int)((double)this.Field2133.Field9343 * 32.768D / var15);
            }
         }

         int var11;
         int var12;
         int var13;
         int var14;
         for(var10 = 0; var10 < var1; ++var10) {
            var11 = this.Field2133.Method7787(var1);
            var12 = this.Field2134.Method7787(var1);
            if (this.Field2135 != null) {
               var13 = this.Field2135.Method7787(var1);
               var14 = this.Field2136.Method7787(var1);
               var11 += Method4161(var14, var6, this.Field2135.Field9345) >> 1;
               var6 += (var13 * var2 >> 16) + var5;
            }

            if (this.Field2137 != null) {
               var13 = this.Field2137.Method7787(var1);
               var14 = this.Field2138.Method7787(var1);
               var12 = var12 * ((Method4161(var14, var9, this.Field2137.Field9345) >> 1) + '耀') >> 15;
               var9 += (var13 * var7 >> 16) + var8;
            }

            for(var13 = 0; var13 < 5; ++var13) {
               if (this.Field2141[var13] != 0 && (var14 = var10 + Field2154[var13]) < var1) {
                  Field2150[var14] += Method4161(var12 * Field2155[var13] >> 15, Field2153[var13], this.Field2133.Field9345);
                  Field2153[var13] += (var11 * Field2156[var13] >> 16) + Field2157[var13];
               }
            }
         }

         if (this.Field2139 != null) {
            this.Field2139.Method7786();
            this.Field2140.Method7786();
            var10 = 0;
            boolean var16 = true;

            for(var13 = 0; var13 < var1; ++var13) {
               var14 = this.Field2139.Method7787(var1);
               var2 = this.Field2140.Method7787(var1);
               if (var16) {
                  var5 = this.Field2139.Field9343 + ((this.Field2139.Field9344 - this.Field2139.Field9343) * var14 >> 8);
               } else {
                  var5 = this.Field2139.Field9343 + ((this.Field2139.Field9344 - this.Field2139.Field9343) * var2 >> 8);
               }

               var10 += 256;
               if (var10 >= var5) {
                  var10 = 0;
                  var16 = !var16;
               }

               if (var16) {
                  Field2150[var13] = 0;
               }
            }
         }

         if (this.Field2144 > 0 && this.Field2145 > 0) {
            for(var11 = var10 = (int)((double)this.Field2144 * var15); var11 < var1; ++var11) {
               Field2150[var11] += Field2150[var11 - var10] * this.Field2145 / 100;
            }
         }

         if (this.Field2146.Field9770[0] > 0 || this.Field2146.Field9770[1] > 0) {
            this.Field2147.Method7786();
            var10 = this.Field2147.Method7787(var1 + 1);
            var11 = this.Field2146.Method7831(0, (float)var10 / 65536.0F);
            var12 = this.Field2146.Method7831(1, (float)var10 / 65536.0F);
            if (var1 >= var11 + var12) {
               var13 = 0;
               var14 = var12;
               if (var12 > var1 - var11) {
                  var14 = var1 - var11;
               }

               while(var13 < var14) {
                  var2 = (int)((long)Field2150[var13 + var11] * (long)Class452.Field9777 >> 16);

                  for(var5 = 0; var5 < var11; ++var5) {
                     var2 += (int)((long)Field2150[var13 + var11 - 1 - var5] * (long)Class452.Field9775[0][var5] >> 16);
                  }

                  for(var5 = 0; var5 < var13; ++var5) {
                     var2 -= (int)((long)Field2150[var13 - 1 - var5] * (long)Class452.Field9775[1][var5] >> 16);
                  }

                  Field2150[var13] = var2;
                  var10 = this.Field2147.Method7787(var1 + 1);
                  ++var13;
               }

               var14 = 128;

               while(true) {
                  if (var14 > var1 - var11) {
                     var14 = var1 - var11;
                  }

                  while(var13 < var14) {
                     var5 = (int)((long)Field2150[var13 + var11] * (long)Class452.Field9777 >> 16);

                     for(var2 = 0; var2 < var11; ++var2) {
                        var5 += (int)((long)Field2150[var13 + var11 - 1 - var2] * (long)Class452.Field9775[0][var2] >> 16);
                     }

                     for(var2 = 0; var2 < var12; ++var2) {
                        var5 -= (int)((long)Field2150[var13 - 1 - var2] * (long)Class452.Field9775[1][var2] >> 16);
                     }

                     Field2150[var13] = var5;
                     var10 = this.Field2147.Method7787(var1 + 1);
                     ++var13;
                  }

                  if (var13 >= var1 - var11) {
                     while(var13 < var1) {
                        var5 = 0;

                        for(var2 = var13 + var11 - var1; var2 < var11; ++var2) {
                           var5 += (int)((long)Field2150[var13 + var11 - 1 - var2] * (long)Class452.Field9775[0][var2] >> 16);
                        }

                        for(var2 = 0; var2 < var12; ++var2) {
                           var5 -= (int)((long)Field2150[var13 - 1 - var2] * (long)Class452.Field9775[1][var2] >> 16);
                        }

                        Field2150[var13] = var5;
                        this.Field2147.Method7787(var1 + 1);
                        ++var13;
                     }
                     break;
                  }

                  var11 = this.Field2146.Method7831(0, (float)var10 / 65536.0F);
                  var12 = this.Field2146.Method7831(1, (float)var10 / 65536.0F);
                  var14 += 128;
               }
            }
         }

         for(var10 = 0; var10 < var1; ++var10) {
            if (Field2150[var10] < -32768) {
               Field2150[var10] = -32768;
            }

            if (Field2150[var10] > 32767) {
               Field2150[var10] = 32767;
            }
         }

         return Field2150;
      }
   }

   private static int Method4161(int var0, int var1, int var2) {
      if (var2 == 1) {
         return (var1 & 32767) < 16384 ? var0 : -var0;
      } else if (var2 == 2) {
         return Field2152[var1 & 32767] * var0 >> 14;
      } else if (var2 == 3) {
         return ((var1 & 32767) * var0 >> 14) - var0;
      } else {
         return var2 == 4 ? Field2151[var1 / 2607 & 32767] * var0 : 0;
      }
   }

   public final void Method4162(Packet var1) {
      this.Field2133 = new Class441();
      this.Field2133.Method7784(var1);
      this.Field2134 = new Class441();
      this.Field2134.Method7784(var1);
      if (var1.g1() != 0) {
         --var1.pos;
         this.Field2135 = new Class441();
         this.Field2135.Method7784(var1);
         this.Field2136 = new Class441();
         this.Field2136.Method7784(var1);
      }

      if (var1.g1() != 0) {
         --var1.pos;
         this.Field2137 = new Class441();
         this.Field2137.Method7784(var1);
         this.Field2138 = new Class441();
         this.Field2138.Method7784(var1);
      }

      if (var1.g1() != 0) {
         --var1.pos;
         this.Field2139 = new Class441();
         this.Field2139.Method7784(var1);
         this.Field2140 = new Class441();
         this.Field2140.Method7784(var1);
      }

      int var3;
      for(int var2 = 0; var2 < 10 && (var3 = var1.Method414()) != 0; ++var2) {
         this.Field2141[var2] = var3;
         this.Field2142[var2] = var1.Method413();
         this.Field2143[var2] = var1.Method414();
      }

      this.Field2144 = var1.Method414();
      this.Field2145 = var1.Method414();
      this.Field2148 = var1.g2();
      this.Field2149 = var1.g2();
      this.Field2146 = new Class452();
      this.Field2147 = new Class441();
      this.Field2146.Method7832(var1, this.Field2147);
   }
}
