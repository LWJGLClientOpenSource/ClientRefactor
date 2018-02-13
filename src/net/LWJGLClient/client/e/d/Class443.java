package net.LWJGLClient.client.e.d;

public final class Class443 {
   private static final Class448 Field9264 = new Class448();

   public static int Method7788(byte[] var0, int var1, byte[] var2, int var3, int var4) {
      Class448 var5 = Field9264;
      synchronized(Field9264) {
         Field9264.Field9217 = var2;
         Field9264.Field9218 = var4;
         Field9264.Field9222 = var0;
         Field9264.Field9223 = 0;
         Field9264.Field9219 = var3;
         Field9264.Field9224 = var1;
         Field9264.Field9231 = 0;
         Field9264.Field9230 = 0;
         Field9264.Field9220 = 0;
         Field9264.Field9221 = 0;
         Field9264.Field9225 = 0;
         Field9264.Field9226 = 0;
         Field9264.Field9233 = 0;
         Class448 var18 = Field9264;
         boolean var19 = false;
         Object var21 = null;
         Class448 var24 = null;
         Object var6 = null;
         var18.Field9232 = 1;
         if (Class448.Field9240 == null) {
            Class448.Field9240 = new int[var18.Field9232 * 100000];
         }

         boolean var10000 = true;

         while(var10000 && (byte)Method7789(8, var18) != 23) {
            byte var46 = (byte)Method7789(8, var18);
            var46 = (byte)Method7789(8, var18);
            var46 = (byte)Method7789(8, var18);
            var46 = (byte)Method7789(8, var18);
            var46 = (byte)Method7789(8, var18);
            ++var18.Field9233;
            var46 = (byte)Method7789(8, var18);
            var46 = (byte)Method7789(8, var18);
            var46 = (byte)Method7789(8, var18);
            var46 = (byte)Method7789(8, var18);
            byte var20 = (byte)Method7789(1, var18);
            var18.Field9229 = var20 != 0;
            if (var18.Field9229) {
               System.out.println("PANIC! RANDOMISED BLOCK!");
            }

            var18.Field9234 = 0;
            var20 = (byte)Method7789(8, var18);
            var18.Field9234 = var18.Field9234 << 8 | var20 & 255;
            var20 = (byte)Method7789(8, var18);
            var18.Field9234 = var18.Field9234 << 8 | var20 & 255;
            var20 = (byte)Method7789(8, var18);
            var18.Field9234 = var18.Field9234 << 8 | var20 & 255;

            int var23;
            for(var23 = 0; var23 < 16; ++var23) {
               byte var22 = (byte)Method7789(1, var18);
               var18.Field9243[var23] = var22 == 1;
            }

            for(var23 = 0; var23 < 256; ++var23) {
               var18.Field9242[var23] = false;
            }

            for(var23 = 0; var23 < 16; ++var23) {
               if (var18.Field9243[var23]) {
                  for(var3 = 0; var3 < 16; ++var3) {
                     if ((byte)Method7789(1, var18) == 1) {
                        var18.Field9242[(var23 << 4) + var3] = true;
                     }
                  }
               }
            }

            var24 = var18;
            var18.Field9241 = 0;

            int var27;
            for(var27 = 0; var27 < 256; ++var27) {
               if (var24.Field9242[var27]) {
                  var24.Field9244[var24.Field9241] = (byte)var27;
                  ++var24.Field9241;
               }
            }

            var23 = var18.Field9241 + 2;
            var3 = Method7789(3, var18);
            var4 = Method7789(15, var18);

            int var7;
            for(var27 = 0; var27 < var4; ++var27) {
               for(var7 = 0; (byte)Method7789(1, var18) != 0; ++var7) {
                  ;
               }

               var18.Field9248[var27] = (byte)var7;
            }

            byte[] var28 = new byte[6];

            byte var29;
            for(var29 = 0; var29 < var3; var28[var29] = var29++) {
               ;
            }

            byte var8;
            byte var9;
            for(var7 = 0; var7 < var4; ++var7) {
               var8 = var18.Field9248[var7];

               for(var9 = var28[var8]; var8 > 0; --var8) {
                  var28[var8] = var28[var8 - 1];
               }

               var28[0] = var9;
               var18.Field9247[var7] = var9;
            }

            int var31;
            int var32;
            for(var7 = 0; var7 < var3; ++var7) {
               var31 = Method7789(5, var18);

               for(var32 = 0; var32 < var23; ++var32) {
                  while((byte)Method7789(1, var18) != 0) {
                     if ((byte)Method7789(1, var18) == 0) {
                        ++var31;
                     } else {
                        --var31;
                     }
                  }

                  var18.Field9249[var7][var32] = (byte)var31;
               }
            }

            int var10;
            byte var12;
            int var13;
            int var14;
            int var15;
            int var16;
            int[] var26;
            int[] var30;
            for(var7 = 0; var7 < var3; ++var7) {
               var8 = 32;
               var9 = 0;

               for(var10 = 0; var10 < var23; ++var10) {
                  if (var18.Field9249[var7][var10] > var9) {
                     var9 = var18.Field9249[var7][var10];
                  }

                  if (var18.Field9249[var7][var10] < var8) {
                     var8 = var18.Field9249[var7][var10];
                  }
               }

               int[] var47 = var18.Field9250[var7];
               int[] var10001 = var18.Field9251[var7];
               int[] var10002 = var18.Field9252[var7];
               byte[] var10003 = var18.Field9249[var7];
               var13 = var23;
               var12 = var9;
               byte[] var34 = var10003;
               int[] var35 = var10002;
               var30 = var10001;
               var26 = var47;
               var14 = 0;

               for(var15 = var8; var15 <= var12; ++var15) {
                  for(var16 = 0; var16 < var13; ++var16) {
                     if (var34[var16] == var15) {
                        var35[var14] = var16;
                        ++var14;
                     }
                  }
               }

               for(var15 = 0; var15 < 23; ++var15) {
                  var30[var15] = 0;
               }

               for(var15 = 0; var15 < var13; ++var15) {
                  ++var30[var34[var15] + 1];
               }

               for(var15 = 1; var15 < 23; ++var15) {
                  var30[var15] += var30[var15 - 1];
               }

               for(var15 = 0; var15 < 23; ++var15) {
                  var26[var15] = 0;
               }

               var15 = 0;

               for(var16 = var8; var16 <= var12; ++var16) {
                  var15 += var30[var16 + 1] - var30[var16];
                  var26[var16] = var15 - 1;
                  var15 <<= 1;
               }

               for(var16 = var8 + 1; var16 <= var12; ++var16) {
                  var30[var16] = (var26[var16 - 1] + 1 << 1) - var30[var16];
               }

               var18.Field9253[var7] = var8;
            }

            var7 = var18.Field9241 + 1;
            var9 = -1;
            boolean var37 = false;

            for(var23 = 0; var23 <= 255; ++var23) {
               var18.Field9237[var23] = 0;
            }

            var23 = 4095;

            int var11;
            for(var31 = 15; var31 >= 0; --var31) {
               for(var11 = 15; var11 >= 0; --var11) {
                  var18.Field9245[var23] = (byte)((var31 << 4) + var11);
                  --var23;
               }

               var18.Field9246[var31] = var23 + 1;
            }

            var31 = 0;
            var32 = var9 + 1;
            byte var38 = 50;
            byte var39 = var18.Field9247[0];
            var23 = var18.Field9253[var39];
            int[] var25 = var18.Field9250[var39];
            var30 = var18.Field9252[var39];
            var26 = var18.Field9251[var39];
            var10 = var38 - 1;
            var11 = var23;

            int var40;
            byte var41;
            for(var40 = Method7789(var23, var18); var40 > var25[var11]; var40 = var40 << 1 | var41) {
               ++var11;
               var41 = (byte)Method7789(1, var18);
            }

            var11 = var30[var40 - var26[var11]];

            while(true) {
               while(var11 != var7) {
                  byte var42;
                  byte var45;
                  if (var11 != 0 && var11 != 1) {
                     if ((var40 = var11 - 1) < 16) {
                        var14 = var18.Field9246[0];

                        for(var41 = var18.Field9245[var14 + var40]; var40 > 3; var40 -= 4) {
                           var11 = var14 + var40;
                           var18.Field9245[var11] = var18.Field9245[var11 - 1];
                           var18.Field9245[var11 - 1] = var18.Field9245[var11 - 2];
                           var18.Field9245[var11 - 2] = var18.Field9245[var11 - 3];
                           var18.Field9245[var11 - 3] = var18.Field9245[var11 - 4];
                        }

                        while(var40 > 0) {
                           var18.Field9245[var14 + var40] = var18.Field9245[var14 + var40 - 1];
                           --var40;
                        }

                        var18.Field9245[var14] = var41;
                     } else {
                        var14 = var40 / 16;
                        var11 = var40 % 16;
                        var15 = var18.Field9246[var14] + var11;

                        for(var41 = var18.Field9245[var15]; var15 > var18.Field9246[var14]; --var15) {
                           var18.Field9245[var15] = var18.Field9245[var15 - 1];
                        }

                        ++var18.Field9246[var14];

                        while(var14 > 0) {
                           --var18.Field9246[var14];
                           var18.Field9245[var18.Field9246[var14]] = var18.Field9245[var18.Field9246[var14 - 1] + 16 - 1];
                           --var14;
                        }

                        --var18.Field9246[0];
                        var18.Field9245[var18.Field9246[0]] = var41;
                        if (var18.Field9246[0] == 0) {
                           var11 = 4095;

                           for(var40 = 15; var40 >= 0; --var40) {
                              for(var14 = 15; var14 >= 0; --var14) {
                                 var18.Field9245[var11] = var18.Field9245[var18.Field9246[var40] + var14];
                                 --var11;
                              }

                              var18.Field9246[var40] = var11 + 1;
                           }
                        }
                     }

                     ++var18.Field9237[var18.Field9244[var41 & 255] & 255];
                     Class448.Field9240[var31] = var18.Field9244[var41 & 255] & 255;
                     ++var31;
                     if (var10 == 0) {
                        ++var32;
                        var10 = 50;
                        var42 = var18.Field9247[var32];
                        var23 = var18.Field9253[var42];
                        var25 = var18.Field9250[var42];
                        var30 = var18.Field9252[var42];
                        var26 = var18.Field9251[var42];
                     }

                     --var10;
                     var14 = var23;

                     for(var11 = Method7789(var23, var18); var11 > var25[var14]; var11 = var11 << 1 | var45) {
                        ++var14;
                        var45 = (byte)Method7789(1, var18);
                     }

                     var11 = var30[var11 - var26[var14]];
                  } else {
                     var40 = -1;
                     var13 = 1;

                     do {
                        if (var11 == 0) {
                           var40 += var13;
                        } else if (var11 == 1) {
                           var40 += 2 * var13;
                        }

                        var13 <<= 1;
                        if (var10 == 0) {
                           ++var32;
                           var10 = 50;
                           var42 = var18.Field9247[var32];
                           var23 = var18.Field9253[var42];
                           var25 = var18.Field9250[var42];
                           var30 = var18.Field9252[var42];
                           var26 = var18.Field9251[var42];
                        }

                        --var10;
                        var14 = var23;

                        for(var11 = Method7789(var23, var18); var11 > var25[var14]; var11 = var11 << 1 | var45) {
                           ++var14;
                           var45 = (byte)Method7789(1, var18);
                        }
                     } while((var11 = var30[var11 - var26[var14]]) == 0 || var11 == 1);

                     ++var40;
                     var42 = var18.Field9244[var18.Field9245[var18.Field9246[0]] & 255];

                     for(var18.Field9237[var42 & 255] += var40; var40 > 0; --var40) {
                        Class448.Field9240[var31] = var42 & 255;
                        ++var31;
                     }
                  }
               }

               var18.Field9228 = 0;
               var18.Field9227 = 0;
               var18.Field9239[0] = 0;

               for(var11 = 1; var11 <= 256; ++var11) {
                  var18.Field9239[var11] = var18.Field9237[var11 - 1];
               }

               for(var11 = 1; var11 <= 256; ++var11) {
                  var18.Field9239[var11] += var18.Field9239[var11 - 1];
               }

               for(var11 = 0; var11 < var31; ++var11) {
                  var12 = (byte)Class448.Field9240[var11];
                  Class448.Field9240[var18.Field9239[var12 & 255]] |= var11 << 8;
                  ++var18.Field9239[var12 & 255];
               }

               var18.Field9235 = Class448.Field9240[var18.Field9234] >> 8;
               var18.Field9238 = 0;
               var18.Field9235 = Class448.Field9240[var18.Field9235];
               var18.Field9236 = (byte)var18.Field9235;
               var18.Field9235 >>= 8;
               ++var18.Field9238;
               var18.Field9254 = var31;
               byte var33 = var18.Field9227;
               var32 = var18.Field9228;
               var10 = var18.Field9238;
               var11 = var18.Field9236;
               int[] var43 = Class448.Field9240;
               var13 = var18.Field9235;
               byte[] var44 = var18.Field9222;
               var15 = var18.Field9223;
               var16 = var18.Field9224;
               var23 = var18.Field9224;
               var3 = var18.Field9254 + 1;

               label272:
               while(true) {
                  if (var32 > 0) {
                     while(true) {
                        if (var16 == 0) {
                           break label272;
                        }

                        if (var32 == 1) {
                           if (var16 == 0) {
                              var32 = 1;
                              break label272;
                           }

                           var44[var15] = var33;
                           ++var15;
                           --var16;
                           break;
                        }

                        var44[var15] = var33;
                        --var32;
                        ++var15;
                        --var16;
                     }
                  }

                  boolean var36 = true;

                  while(var36) {
                     var36 = false;
                     if (var10 == var3) {
                        var32 = 0;
                        break label272;
                     }

                     var33 = (byte)var11;
                     var8 = (byte)(var13 = var43[var13]);
                     var13 >>= 8;
                     ++var10;
                     if (var8 != var11) {
                        var11 = var8;
                        if (var16 == 0) {
                           var32 = 1;
                           break label272;
                        }

                        var44[var15] = var33;
                        ++var15;
                        --var16;
                        var36 = true;
                     } else if (var10 == var3) {
                        if (var16 == 0) {
                           var32 = 1;
                           break label272;
                        }

                        var44[var15] = var33;
                        ++var15;
                        --var16;
                        var36 = true;
                     }
                  }

                  var32 = 2;
                  var8 = (byte)(var13 = var43[var13]);
                  var13 >>= 8;
                  ++var10;
                  if (var10 != var3) {
                     if (var8 != var11) {
                        var11 = var8;
                     } else {
                        var32 = 3;
                        var29 = (byte)(var13 = var43[var13]);
                        var13 >>= 8;
                        ++var10;
                        if (var10 != var3) {
                           if (var29 != var11) {
                              var11 = var29;
                           } else {
                              var29 = (byte)(var13 = var43[var13]);
                              var13 >>= 8;
                              ++var10;
                              var32 = (var29 & 255) + 4;
                              var11 = (byte)(var13 = var43[var13]);
                              var13 >>= 8;
                              ++var10;
                           }
                        }
                     }
                  }
               }

               var7 = var18.Field9225;
               var18.Field9225 += var23 - var16;
               if (var18.Field9225 < var7) {
                  ++var18.Field9226;
               }

               var18.Field9227 = var33;
               var18.Field9228 = var32;
               var18.Field9238 = var10;
               var18.Field9236 = var11;
               Class448.Field9240 = var43;
               var18.Field9235 = var13;
               var18.Field9222 = var44;
               var18.Field9223 = var15;
               var18.Field9224 = var16;
               if (var18.Field9238 == var18.Field9254 + 1 && var18.Field9228 == 0) {
                  var10000 = true;
                  break;
               }

               var10000 = false;
               break;
            }
         }

         return var1 -= Field9264.Field9224;
      }
   }

   private static int Method7789(int var0, Class448 var1) {
      while(var1.Field9231 < var0) {
         var1.Field9230 = var1.Field9230 << 8 | var1.Field9217[var1.Field9218] & 255;
         var1.Field9231 += 8;
         ++var1.Field9218;
         --var1.Field9219;
         ++var1.Field9220;
         if (var1.Field9220 == 0) {
            ++var1.Field9221;
         }
      }

      int var2 = var1.Field9230 >> var1.Field9231 - var0 & (1 << var0) - 1;
      var1.Field9231 -= var0;
      return var2;
   }
}
