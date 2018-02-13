package net.LWJGLClient.client.d;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

import net.LWJGLClient.client.a.c.Floor;
import net.LWJGLClient.client.model.a.a.Class503;
import net.LWJGLClient.client.model.a.a.Class504;
import net.LWJGLClient.client.a.OnDemandFetcher;
import net.LWJGLClient.client.a.a.Class511;
import net.LWJGLClient.client.a.a.ObjectInstance;
import net.LWJGLClient.client.a.c.ObjectDefinition;
import net.LWJGLClient.client.b.Rasterizer;
import net.LWJGLClient.client.b.b.GraphicsDisplay;
import net.LWJGLClient.client.b.b.f.Class838;
import net.LWJGLClient.client.c.Packet;
import net.LWJGLClient.client.c.b.Class280;
import net.LWJGLClient.client.e.d.Class354;
import net.LWJGLClient.client.model.Client;
import net.LWJGLClient.client.model.Model;
import net.LWJGLClient.client.model.a.a.Class488;
import net.LWJGLClient.client.model.a.a.Class501;
import net.LWJGLClient.client.model.a.c.Class887;
import net.LWJGLClient.client.model.a.c.Class896;

public final class Class569 {
   private List Field443 = new LinkedList();
   private Queue Field444 = new LinkedBlockingQueue();
   private List Field445 = new LinkedList();
   private boolean Field446;
   private boolean Field447;
   private boolean Field448;
   public boolean Field449;
   private int[] Field450;
   private int[] Field451;
   private int[] Field452;
   private int[] Field453;
   private int[] Field454;
   public int[][][] Field455;
   private byte[][][] Field456;
   public static int Field457;
   private byte[][][] Field458;
   private int[][][] Field459;
   private byte[][][] Field460;
   private static int[] Field461;
   private int[][] Field462;
   private static int[] Field463;
   private byte[][][] Field464;
   private static int[] Field465;
   public static int Field466;
   private int Field467;
   private int Field468;
   private byte[][][] Field469;
   public byte[][][] Field470;
   public static boolean Field471;
   private static int[] Field472;

   static {
      int[] var10000 = new int[]{15361, 15362, 15363, 15364, 15365, 15366, 15367, 15368, 15419, 15416, 15413, 15414, 15415, 15411, 15410, 15412, 15418, 15398, 15401, 15399, 15400, 15404, 15403, 15402, 15405, 15380, 15298, 15299, 15300, 15301, 15303, 15302, 15304};
      Field461 = new int[]{1, 0, -1, 0};
      Field463 = new int[]{16, 32, 64, 128};
      Field465 = new int[]{0, -1, 0, 1};
      Field466 = 99;
      Field471 = false;
      Field472 = new int[]{1, 2, 4, 8};
   }

   public Class569(byte[][][] var1, int[][][] var2) {
      new LinkedList();
      this.Field446 = false;
      this.Field447 = false;
      this.Field448 = false;
      this.Field449 = false;
      Field466 = 99;
      this.Field467 = SceneGraph.mapSizeWidth;
      this.Field468 = SceneGraph.mapSizeWidth;
      this.Field455 = var2;
      this.Field470 = var1;
      this.Field464 = new byte[4][this.Field467][this.Field468];
      this.Field456 = new byte[4][this.Field467][this.Field468];
      this.Field460 = new byte[4][this.Field467][this.Field468];
      this.Field469 = new byte[4][this.Field467][this.Field468];
      this.Field459 = new int[4][this.Field467 + 1][this.Field468 + 1];
      this.Field458 = new byte[4][this.Field467 + 1][this.Field468 + 1];
      this.Field462 = new int[this.Field467 + 1][this.Field468 + 1];
      this.Field450 = new int[this.Field468];
      this.Field451 = new int[this.Field468];
      this.Field452 = new int[this.Field468];
      this.Field453 = new int[this.Field468];
      this.Field454 = new int[this.Field468];
   }

   private static int Method8816(int var0, int var1) {
      return ((var0 ^= (var0 += var1 * 57) << 13) * (var0 * var0 * 15731 + 789221) + 1376312589 & Integer.MAX_VALUE) >> 19 & 255;
   }

   public final void Method8817(Class504[] var1, SceneGraph var2) {
      int var3;
      int var4;
      int var5;
      int var6;
      for(var3 = 0; var3 < 4; ++var3) {
         for(var4 = 0; var4 < this.Field467; ++var4) {
            for(var5 = 0; var5 < this.Field468; ++var5) {
               var6 = var3;
               if ((this.Field470[var3][var4][var5] & 1) == 1) {
                  if ((this.Field470[1][var4][var5] & 2) == 2) {
                     var6 = var3 - 1;
                  }

                  if (var6 >= 0) {
                     var1[var6].Method8190(var5, var4);
                  }
               }

               if (this.Field470[var3][var4][var5] == 1) {
                  Client.Method13229(Client.Field12490 + var4, Client.Field12491 + var5, var6);
               }
            }
         }
      }

      int var7;
      int var8;
      int var9;
      int var10;
      int var11;
      int var12;
      int var13;
      int var14;
      int var15;
      int var32;
      for(var3 = 0; var3 < 4; ++var3) {
         byte[][] var34 = this.Field458[var3];
         var8 = (int)Math.sqrt(5100.0D);
         var9 = var8 * 768 >> 8;

         for(var10 = 1; var10 < this.Field468 - 1; ++var10) {
            for(var11 = 1; var11 < this.Field467 - 1; ++var11) {
               var12 = this.Field455[var3][var11 + 1][var10] - this.Field455[var3][var11 - 1][var10];
               var8 = this.Field455[var3][var11][var10 + 1] - this.Field455[var3][var11][var10 - 1];
               var13 = (int)Math.sqrt((double)(var12 * var12 + 65536 + var8 * var8));
               var14 = (var12 << 8) / var13;
               var15 = 65536 / var13;
               var12 = (var8 << 8) / var13;
               var32 = 96 + (var14 * -50 + var15 * -10 + var12 * -50) / var9;
               var5 = (var34[var11 - 1][var10] >> 2) + (var34[var11 + 1][var10] >> 3) + (var34[var11][var10 - 1] >> 2) + (var34[var11][var10 + 1] >> 3) + (var34[var11][var10] >> 1);
               this.Field462[var11][var10] = var32 - var5;
            }
         }

         for(var10 = 0; var10 < this.Field468; ++var10) {
            this.Field450[var10] = 0;
            this.Field451[var10] = 0;
            this.Field452[var10] = 0;
            this.Field453[var10] = 0;
            this.Field454[var10] = 0;
         }

         for(var10 = -5; var10 < this.Field467 + 5; ++var10) {
            for(var11 = 0; var11 < this.Field468; ++var11) {
               if ((var12 = var10 + 5) >= 0 && var12 < this.Field467 && (var8 = this.Field464[var3][var12][var11] & 255) > 0) {
                  Floor var37 = Floor.Field10713[var8 - 1];
                  this.Field450[var11] += var37.Field10716;
                  this.Field451[var11] += var37.Field10703;
                  this.Field452[var11] += var37.Field10704;
                  this.Field453[var11] += var37.Field10705;
                  ++this.Field454[var11];
               }

               if ((var8 = var10 - 5) >= 0 && var8 < this.Field467 && (var13 = this.Field464[var3][var8][var11] & 255) > 0) {
                  Floor var38 = Floor.Field10713[var13 - 1];
                  this.Field450[var11] -= var38.Field10716;
                  this.Field451[var11] -= var38.Field10703;
                  this.Field452[var11] -= var38.Field10704;
                  this.Field453[var11] -= var38.Field10705;
                  --this.Field454[var11];
               }
            }

            if (var10 > 0 && var10 < this.Field467 - 1) {
               var11 = 0;
               var12 = 0;
               var8 = 0;
               var13 = 0;
               var14 = 0;

               for(var15 = -5; var15 < this.Field468 + 5; ++var15) {
                  if ((var32 = var15 + 5) >= 0 && var32 < this.Field468) {
                     var11 += this.Field450[var32];
                     var12 += this.Field451[var32];
                     var8 += this.Field452[var32];
                     var13 += this.Field453[var32];
                     var14 += this.Field454[var32];
                  }

                  if ((var5 = var15 - 5) >= 0 && var5 < this.Field468) {
                     var11 -= this.Field450[var5];
                     var12 -= this.Field451[var5];
                     var8 -= this.Field452[var5];
                     var13 -= this.Field453[var5];
                     var14 -= this.Field454[var5];
                  }

                  if (var15 > 0 && var15 < this.Field468 - 1) {
                     var32 = Client.Field12490 + var10;
                     var4 = Client.Field12491 + var15;
                     if ((GraphicsDisplay.Field2678 && GraphicsDisplay.Field2667 || var32 < 2916 || var4 < 3208 || var32 > 2918 || var4 > 3210) && (var32 <= 2368 || var4 <= 3127 || var32 >= 2376 || var4 >= 3135 || var3 <= 2) && (var32 <= 2423 || var4 <= 3072 || var32 >= 2431 || var4 >= 3080 || var3 <= 2) && (var32 != 3542 || var4 != 3311)) {
                        if (var3 < Field466) {
                           Field466 = var3;
                        }

                        boolean var35 = false;
                        var6 = 0;
                        var7 = 0;
                        short var36 = -1;
                        int var16 = this.Field464[var3][var10][var15] & 255;
                        int var17 = this.Field456[var3][var10][var15] & 255;
                        if (var32 >= 1624 && var4 >= 5601 && var32 <= 1629 && var4 <= 5608 && var3 == 0) {
                           var17 = 0;
                           var16 = 29;
                        }

                        if (Rasterizer.Field9945 && var16 > 0 && var17 == 0) {
                           var17 = 1;
                           var7 = Rasterizer.Field9944;
                           var35 = true;
                        }

                        if (var32 >= 3083 && var4 >= 3389 && var32 <= 3088 && var4 <= 3390 && var3 == 0) {
                           var17 = 89;
                           var7 = 197;
                           var36 = 6678;
                           var35 = false;
                        }

                        if (var17 == 143 && var3 == 3) {
                           var17 = 0;
                        }

                        if (var16 > 0 || var17 > 0) {
                           var32 = this.Field455[var3][var10][var15];
                           var4 = this.Field455[var3][var10 + 1][var15];
                           int var18 = this.Field455[var3][var10 + 1][var15 + 1];
                           int var19 = this.Field455[var3][var10][var15 + 1];
                           int var20 = this.Field462[var10][var15];
                           int var21 = this.Field462[var10 + 1][var15];
                           int var22 = this.Field462[var10 + 1][var15 + 1];
                           int var23 = this.Field462[var10][var15 + 1];
                           int var24 = -1;
                           int var25 = -1;
                           int var26;
                           if (var16 > 0) {
                              if (var14 == 0) {
                                 var14 = 1;
                              }

                              if (var13 <= 0) {
                                 var13 = 1;
                              }

                              var26 = (var11 << 8) / var13;
                              var25 = var12 / var14;
                              int var27 = var8 / var14;
                              var24 = Method8833(var26, var25, var27);
                              var25 = Method8833(var26, var25, var27);
                              if (var35) {
                                 var6 = var25;
                              }
                           }

                           if (var3 > 0) {
                              boolean var40 = true;
                              if (var16 == 0 && this.Field460[var3][var10][var15] != 0) {
                                 var40 = false;
                              }

                              if (var17 > 0 && var17 - 1 < Floor.Field10713.length && !Floor.Field10713[var17 - 1].Field10714) {
                                 var40 = false;
                              }

                              if (var40 && var32 == var4 && var32 == var18 && var32 == var19) {
                                 this.Field459[var3][var10][var15] |= 2340;
                              }
                           }

                           var26 = 0;
                           if (var24 != -1) {
                              var26 = Rasterizer.Field9964[Method8842(var25, 96)];
                           }

                           if (var17 == 0) {
                              var2.Method8858(var3, var10, var15, 0, 0, -1, var32, var4, var18, var19, Method8842(var24, var20), Method8842(var24, var21), Method8842(var24, var22), Method8842(var24, var23), 0, 0, 0, 0, var26, 0, var24);
                           } else {
                              var25 = this.Field460[var3][var10][var15] + 1;
                              byte var41 = this.Field469[var3][var10][var15];
                              if (var17 - 1 >= Floor.Field10698.length) {
                                 var17 = 1;
                              }

                              Floor var39;
                              int var28 = (var39 = Floor.Field10698[var17 - 1]).Field10701;
                              if (var39.Field10700 != -1) {
                                 System.out.println("tex: " + var39.Field10700);
                              }

                              int var29 = 0;
                              if (var39.Field10699 != -1) {
                                 var29 = Rasterizer.Field9964[var39.Field10699] != 1 ? Rasterizer.Field9964[var39.Field10699] : 0;
                              }

                              int var31 = -1;
                              int var30;
                              if (var28 >= 0) {
                                 if (var39.Field10702 != 16711935) {
                                    var29 = var39.Field10702;
                                    var30 = Rasterizer.Field9964[var29];
                                    var31 = Method8840(var39.Field10702, 96);
                                 } else {
                                    var30 = 0;
                                    var29 = -2;
                                    var31 = -1;
                                 }
                              } else if (var39.Field10702 == -1) {
                                 var30 = var29;
                                 var29 = -2;
                                 var28 = -1;
                              } else {
                                 var31 = Method8840(var39.Field10702, 96);
                                 var29 = var39.Field10702;
                                 var30 = Rasterizer.Field9964[var31];
                              }

                              if (var35) {
                                 var31 = Method8840(var6, 96);
                                 var29 = var6;
                                 var30 = Rasterizer.Field9964[var31];
                                 var28 = var7;
                              }

                              if (var36 != -1) {
                                 var31 = Method8840(var36, 96);
                                 var29 = var36;
                                 var30 = Rasterizer.Field9964[var31];
                              }

                              if (var17 == 10 && var3 == 1 && var28 == 499) {
                                 var25 = 0;
                              }

                              var2.Method8858(var3, var10, var15, var25, var41, var28, var32, var4, var18, var19, Method8842(var24, var20), Method8842(var24, var21), Method8842(var24, var22), Method8842(var24, var23), Method8840(var29, var20), Method8840(var29, var21), Method8840(var29, var22), Method8840(var29, var23), var26, var30, var31);
                           }
                        }
                     }
                  }
               }
            }
         }

         for(var10 = 1; var10 < this.Field468 - 1; ++var10) {
            for(var11 = 1; var11 < this.Field467 - 1; ++var11) {
               var2.Method8857(var3, var11, var10, this.Method8837(var10, var3, var11));
            }
         }
      }

      var2.Method8880(-10, -50, -50);
      var3 = 1;
      var4 = 2;
      var5 = 4;

      for(var6 = 0; var6 < 4; ++var6) {
         if (var6 > 0) {
            var3 <<= 3;
            var4 <<= 3;
            var5 <<= 3;
         }

         for(var32 = 0; var32 <= var6; ++var32) {
            for(int var33 = 0; var33 <= this.Field468; ++var33) {
               for(var7 = 0; var7 <= this.Field467; ++var7) {
                  if ((this.Field459[var32][var7][var33] & var3) != 0) {
                     var8 = var33;
                     var9 = var33;
                     var10 = var32;

                     for(var11 = var32; var8 > 0 && (this.Field459[var32][var7][var8 - 1] & var3) != 0; --var8) {
                        ;
                     }

                     while(var9 < this.Field468 && (this.Field459[var32][var7][var9 + 1] & var3) != 0) {
                        ++var9;
                     }

                     label383:
                     while(var10 > 0) {
                        for(var12 = var8; var12 <= var9; ++var12) {
                           if ((this.Field459[var10 - 1][var7][var12] & var3) == 0) {
                              break label383;
                           }
                        }

                        --var10;
                     }

                     label372:
                     while(var11 < var6) {
                        for(var12 = var8; var12 <= var9; ++var12) {
                           if ((this.Field459[var11 + 1][var7][var12] & var3) == 0) {
                              break label372;
                           }
                        }

                        ++var11;
                     }

                     if ((var11 + 1 - var10) * (var9 - var8 + 1) >= 8) {
                        var13 = this.Field455[var11][var7][var8] - 240;
                        var14 = this.Field455[var10][var7][var8];
                        SceneGraph.Method8856(var6, var7 << 7, var14, var7 << 7, (var9 << 7) + 128, var13, var8 << 7, 1);

                        for(var15 = var10; var15 <= var11; ++var15) {
                           for(var12 = var8; var12 <= var9; ++var12) {
                              this.Field459[var15][var7][var12] &= ~var3;
                           }
                        }
                     }
                  }

                  if ((this.Field459[var32][var7][var33] & var4) != 0) {
                     var8 = var7;
                     var9 = var7;
                     var10 = var32;

                     for(var11 = var32; var8 > 0 && (this.Field459[var32][var8 - 1][var33] & var4) != 0; --var8) {
                        ;
                     }

                     while(var9 < this.Field467 && (this.Field459[var32][var9 + 1][var33] & var4) != 0) {
                        ++var9;
                     }

                     label436:
                     while(var10 > 0) {
                        for(var12 = var8; var12 <= var9; ++var12) {
                           if ((this.Field459[var10 - 1][var12][var33] & var4) == 0) {
                              break label436;
                           }
                        }

                        --var10;
                     }

                     label425:
                     while(var11 < var6) {
                        for(var12 = var8; var12 <= var9; ++var12) {
                           if ((this.Field459[var11 + 1][var12][var33] & var4) == 0) {
                              break label425;
                           }
                        }

                        ++var11;
                     }

                     if ((var11 + 1 - var10) * (var9 - var8 + 1) >= 8) {
                        var13 = this.Field455[var11][var8][var33] - 240;
                        var14 = this.Field455[var10][var8][var33];
                        SceneGraph.Method8856(var6, var8 << 7, var14, (var9 << 7) + 128, var33 << 7, var13, var33 << 7, 2);

                        for(var15 = var10; var15 <= var11; ++var15) {
                           for(var12 = var8; var12 <= var9; ++var12) {
                              this.Field459[var15][var12][var33] &= ~var4;
                           }
                        }
                     }
                  }

                  if ((this.Field459[var32][var7][var33] & var5) != 0) {
                     var8 = var7;
                     var9 = var7;
                     var10 = var33;

                     for(var11 = var33; var10 > 0 && (this.Field459[var32][var7][var10 - 1] & var5) != 0; --var10) {
                        ;
                     }

                     while(var11 < this.Field468 && (this.Field459[var32][var7][var11 + 1] & var5) != 0) {
                        ++var11;
                     }

                     label489:
                     while(var8 > 0) {
                        for(var12 = var10; var12 <= var11; ++var12) {
                           if ((this.Field459[var32][var8 - 1][var12] & var5) == 0) {
                              break label489;
                           }
                        }

                        --var8;
                     }

                     label478:
                     while(var9 < this.Field467) {
                        for(var12 = var10; var12 <= var11; ++var12) {
                           if ((this.Field459[var32][var9 + 1][var12] & var5) == 0) {
                              break label478;
                           }
                        }

                        ++var9;
                     }

                     if ((var9 - var8 + 1) * (var11 - var10 + 1) >= 4) {
                        var12 = this.Field455[var32][var8][var10];
                        SceneGraph.Method8856(var6, var8 << 7, var12, (var9 << 7) + 128, (var11 << 7) + 128, var12, var10 << 7, 4);

                        for(var8 = var8; var8 <= var9; ++var8) {
                           for(var13 = var10; var13 <= var11; ++var13) {
                              this.Field459[var32][var8][var13] &= ~var5;
                           }
                        }
                     }
                  }
               }
            }
         }
      }

   }

   public static void Method8818(Packet var0, OnDemandFetcher var1) {
      int var2 = -1;

      while(true) {
         int var3;
         ObjectDefinition var6;
         do {
            if ((var3 = var0.Method414()) == 0) {
               return;
            }
         } while((var6 = ObjectDefinition.Method11938(var2 += var3)) == null);

         ObjectDefinition var10000 = var6;
         OnDemandFetcher var4 = var1;
         var6 = var6;
         if (var10000.Field10581 != null) {
            for(int var5 = 0; var5 < var6.Field10581.length; ++var5) {
               var4.Method11961(var6.Field10581[var5] & '\uffff', 0);
            }
         }

         while(var0.Method414() != 0) {
            var0.g1();
         }
      }
   }

   public final void Method8819(int var1, int var2, int var3, int var4) {
      for(int var5 = var1; var5 <= var1 + var2; ++var5) {
         for(int var6 = var4; var6 <= var4 + var3; ++var6) {
            if (var6 >= 0 && var6 < this.Field467 && var5 >= 0 && var5 < this.Field468) {
               this.Field458[0][var6][var5] = 127;
               if (var6 == var4 && var6 > 0) {
                  this.Field455[0][var6][var5] = this.Field455[0][var6 - 1][var5];
               }

               if (var6 == var4 + var3 && var6 < this.Field467 - 1) {
                  this.Field455[0][var6][var5] = this.Field455[0][var6 + 1][var5];
               }

               if (var5 == var1 && var5 > 0) {
                  this.Field455[0][var6][var5] = this.Field455[0][var6][var5 - 1];
               }

               if (var5 == var1 + var2 && var5 < this.Field468 - 1) {
                  this.Field455[0][var6][var5] = this.Field455[0][var6][var5 + 1];
               }
            }
         }
      }

   }

   public static boolean Method8820(long var0) {
      return (var0 >> 50 & 1L) == 1L;
   }

   public static boolean Method8821(long var0) {
      return (var0 >> 62 & 1L) == 1L;
   }

   public static int Method8822(long var0) {
      return (int)(var0 >> 36 & 31L);
   }

   private static boolean Method8823(ObjectDefinition var0) {
      String var2;
      return var0 != null && var0.Field10552 != null ? ((var2 = var0.Field10552.toLowerCase()).contains("tree") | var2.contains("yew") | var2.contains("oak") | var2.contains("maple") | var2.contains("willow") | var2.contains("evergreen")) & !var2.contains("tropical tree") : false;
   }

   public final boolean Method8824() {
      return this.Field446;
   }

   public final boolean Method8825() {
      return this.Field447;
   }

   public final void Method8826(SceneGraph var1, Class504[] var2) {
      int var3;
      int var4;
      for(var3 = 0; var3 < 4; ++var3) {
         for(var4 = 1; var4 < this.Field468 - 1; ++var4) {
            for(int var5 = 1; var5 < this.Field467 - 1; ++var5) {
               var1.Method8857(var3, var5, var4, this.Method8837(var4, var3, var5));
            }
         }
      }

      if (GraphicsDisplay.Field2678) {
         var1.Method8880(-10, -50, -50);
      } else {
         this.Method8817(var2, var1);
         var1.Method8880(-10, -50, -50);
         var1.Method8868();

         for(var3 = 0; var3 < this.Field467; ++var3) {
            for(var4 = 0; var4 < this.Field468; ++var4) {
               if ((this.Field470[1][var3][var4] & 2) == 2) {
                  var1.Method8855(var4, var3);
               }
            }
         }

      }
   }

   public final void Method8827(Client var1) {
      this.Field445.clear();
      this.Field444.clear();
      this.Field443.clear();
      var1.Field12082.clear();
   }

   private void Method8828(Client var1, Queue var2, Class504[] var3, SceneGraph var4) {
      Class354 var5;
      while((var5 = (Class354)var2.poll()) != null) {
         if (var5.Field1482 == -1) {
            var5.Field1482 = 6951;
         }

         if (var5.Field1476) {
            var3[var5.Field1478].Field12868[var5.Field1480][var5.Field1481] = 0;
         }

         label154: {
            int var13 = var5.Field1482;
            int var12 = var5.Field1479;
            int var11 = var5.Field1480;
            int var10 = var5.Field1484;
            int var9 = var5.Field1483;
            int var8 = var5.Field1478;
            int var7 = var5.Field1481;
            boolean var10000;
            if (var11 > 0 && var7 > 0 && var11 <= 102 && var7 <= 102) {
               Class501 var20;
               if (GraphicsDisplay.Field2678 && GraphicsDisplay.Field2667) {
                  Class569 var14 = Client.Field12218;
                  if (Client.Field12218.Field447 && (var20 = Client.Field12428.Method8846(var8, var11, var7)) != null && var20.Field12852 != null && var8 < 3) {
                     ++var8;
                  }
               }

               SceneGraph var10001 = Client.Field12428;
               Client.Field12428.Method8846(var8, var11, var7);
               int var21 = 0;
               if (var12 == 0) {
                  var21 = Client.Field12428.Method8875(var8, var11, var7);
               }

               if (var12 == 1) {
                  var10001 = Client.Field12428;
                  var21 = (var20 = Client.Field12428.Method8846(var8, var11, var7)) != null && var20.Field12849 != null ? var20.Field12849.Field903 : 0;
               }

               if (var12 == 2) {
                  var21 = Client.Field12428.Method8876(var8, var11, var7);
               }

               if (var12 == 3) {
                  var21 = Client.Field12428.Method8877(var8, var11, var7);
               }

               ObjectDefinition var15 = ObjectDefinition.Method11938(var21);
               if (var21 != 0) {
                  int var16 = (var21 = Client.Field12428.Method8879(var8, var11, var7, var13)) & 31;
                  var21 >>= 6;
                  if (var12 == 0) {
                     Client.Field12428.Method8870(var11, var8, var7, (byte)-119);
                     Client.Field12428.Method8870(var11, var8, var7, (byte)-119);
                     if (var15 == null || var15.Field10577) {
                        var1.Field12655[var8].Method8192(var21, var16, var15 != null ? var15.Field10566 : true, var11, var7);
                     }
                  }

                  if (var12 == 1) {
                     Client.Field12428.Method8871(var7, var8, var11);
                     Client.Field12428.Method8871(var7, var8, var11);
                  }

                  if (var12 == 2) {
                     Client.Field12428.Method8872(var8, var11, var7);
                     Client.Field12428.Method8872(var8, var11, var7);
                     if (var15 == null || var11 + var15.Field10556 > SceneGraph.mapSizeWidth - 1 || var7 + var15.Field10556 > SceneGraph.mapSizeWidth - 1 || var11 + var15.Field10570 > SceneGraph.mapSizeWidth - 1 || var7 + var15.Field10570 > SceneGraph.mapSizeWidth - 1) {
                        var10000 = false;
                        break label154;
                     }

                     if (var15.Field10577) {
                        var1.Field12655[var8].Method8193(var21, var15.Field10556, var11, var7, var15.Field10570, var15.Field10566);
                     }
                  }

                  if (var12 == 3) {
                     Client.Field12428.Method8873(var8, var7, var11);
                     Client.Field12428.Method8873(var8, var7, var11);
                     if (var15 != null && var15.Field10577 && var15.Field10586) {
                        var1.Field12655[var8].Field12868[var11][var7] &= 14680063;
                     }
                  }
               }

               if (var13 >= 0) {
                  if (Client.Field12218 == null) {
                     var10000 = false;
                     break label154;
                  }

                  int var10002 = var10;
                  int var10004 = var11;
                  int var10005 = var13;
                  int var10007 = Model.Field2798;
                  var13 = var8;
                  var12 = var9;
                  var11 = var10005;
                  var10 = var10004;
                  var9 = var8;
                  var8 = var10002;
                  Class569 var6 = Client.Field12218;
                  Class564 var19;
                  (var19 = new Class564(var10, var7, var9, var11, var12, var8, var13)).Field507 = true;
                  var6.Field444.add(var19);
               }
            }

            var10000 = true;
         }

         for(int var18 = var5.Field1478; var18 < 4; ++var18) {
            var4.Method8857(var18, var5.Field1480, var5.Field1481, this.Method8837(var5.Field1481, var18, var5.Field1480));
         }
      }

   }

   public final void Method8829(Client var1, SceneGraph var2, Class504[] var3) {
      if (!this.Field447 && this.Field445.size() <= 0 && Client.Field12084) {
         Client.Field12247 = false;
         Client.Field12248 = System.currentTimeMillis();
         this.Field447 = true;
         this.Method8826(var2, var3);
         this.Field448 = true;
         boolean var10000 = Client.Field12596;
         var2.Field934 = true;
         var2.Field935 = System.currentTimeMillis();
         Class280.Method2988().Method2995();
         if (var1.Field12093) {
            for(int var4 = 0; var4 < 4; ++var4) {
               for(int var5 = 1; var5 < SceneGraph.mapSizeWidth - 1; ++var5) {
                  for(int var6 = 1; var6 < SceneGraph.mapSizeWidth - 1; ++var6) {
                     var3[var4].Field12868[var5][var6] = 0;
                  }
               }
            }
         }
      } else if (!this.Field447 && !Client.Field12084 && !Client.Field12251 && this.Field445.size() <= 0) {
         this.Field447 = true;
      }

      if (this.Field447 && this.Field446) {
         if (var1.Field12082.size() <= 0) {
            var1.Field12083.size();
         }

         if (Client.Field12219 == null && !Client.Field12251) {
            boolean var7 = var1.Field12082.size() <= 0;
            this.Method8828(var1, var1.Field12082, var3, var2);
            if (var7) {
               this.Method8828(var1, var1.Field12083, var3, var2);
            }
         }
      }

      this.Field446 = true;
   }

   public final synchronized void Method8830(Client var1, SceneGraph var2, Class504[] var3, boolean var4) {
      if (!Client.Field12251) {
         long var5 = System.currentTimeMillis();
         boolean var10000;
         if (this.Field448) {
            if (GraphicsDisplay.Field2678) {
               var10000 = GraphicsDisplay.Field2667;
            }

            this.Field448 = false;
         }

         Class564 var7;
         while((var7 = (Class564)this.Field444.poll()) != null) {
            this.Field445.add(var7);
         }

         long var8 = (long)(var4 ? 800 : 50);
         this.Field449 = true;

         try {
            if (this.Field445.size() > 0) {
               Iterator var17 = this.Field445.iterator();

               while(var17.hasNext()) {
                  Class564 var16 = (Class564)var17.next();
                  if (var3 != null) {
                     if (this.Method8831(var16.Method8797(), var2, var16.Method8802() >= 0 ? var3[var16.Method8802()] : null, var16.Method8801(), var16.Method8798(), var16.Method8796(), var16.Method8799(), var16.Method8800(), Model.Field2798, false, var16.Method8802(), true, false, false, var16.Field507)) {
                        this.Field443.add(var16);
                     }

                     if (System.currentTimeMillis() - var5 > var8) {
                        break;
                     }
                  }
               }

               this.Field445.removeAll(this.Field443);
               this.Field443.clear();
            }

            var10000 = Client.Field12087;
            this.Method8829(var1, var2, var3);
         } catch (Exception var15) {
            var15.printStackTrace();
         }

         this.Field449 = false;
      }
   }

   private boolean Method8831(int var1, SceneGraph var2, Class504 var3, int var4, int var5, int var6, int var7, int var8, int var9, boolean var10, int var11, boolean var12, boolean var13, boolean var14, boolean var15) {
      if (var7 != 34893 && var7 != 34992) {
         label1393: {
            if (var7 != 35390 && var7 != 58074 && var7 != 733) {
               if (var7 >= 10087 && var7 <= 10091) {
                  return true;
               }

               if (var7 == 11448) {
                  return true;
               }

               if (var7 == 33486) {
                  return true;
               }

               if ((var7 >= 39995 && var7 <= 39999 || var7 >= 40095 && var7 <= 40101) && var4 == 22) {
                  return true;
               }

               if ((var7 < 15288 || var7 > 15295) && var7 != 15285 && var7 != 15283) {
                  if (var7 != 26420 && var7 != 26353) {
                     if (var7 >= 13130 && var7 <= 13132) {
                        return true;
                     }

                     if (var7 == 47130) {
                        return true;
                     }

                     if (var7 == 32347) {
                        var7 = 32306;
                        var4 = 10;
                        break label1393;
                     }

                     if (var7 == 21792) {
                        var5 = 0;
                        break label1393;
                     }

                     if (var7 == 3701) {
                        return true;
                     }

                     if (var7 == 3700) {
                        return true;
                     }

                     if (var7 != 2741 && var7 != 3949 && var7 != 3950) {
                        if (var7 != 185 && var7 != 186 && var7 != 10627 && var7 != 16415) {
                           if (var7 != 8150 && var7 != 8386 && var7 != 8390 && var7 != 7771 && var7 != 7965 && var7 != 8151 && var7 != 8391 && var7 != 51631 && var7 != 7517 && (var7 < 7847 || var7 > 7850) && var7 != 8389 && var7 != 51638 && (var7 < 3589 || var7 > 3594)) {
                              if (var7 == 31221) {
                                 return true;
                              }

                              if (var7 == 9375) {
                                 return true;
                              }
                              break label1393;
                           }

                           return true;
                        }

                        return true;
                     }

                     return true;
                  }

                  return true;
               }

               return true;
            }

            return true;
         }
      } else {
         var7 = 34545;
      }

      if (var7 == 45155) {
         var7 = 45154;
      }

      if (var5 < Field466) {
         Field466 = var5;
      }

      int var16 = Client.Field12490 + var6;
      int var17 = Client.Field12491 + var1;
      if (var16 >= 1624 && var17 >= 5601 && var16 <= 1629 && var17 <= 5608 && var4 != 22) {
         var7 = var16 == 5605 ? 30182 : 30181;
         var4 = 22;
      }

      boolean var18 = true;
      ObjectDefinition var19;
      if ((var19 = ObjectDefinition.Method11938(var7)) == null) {
         return true;
      } else {
         if (var7 == 4513) {
            var19.Field10577 = false;
         } else if (var7 >= 3047 && var7 <= 3076) {
            var19.Field10577 = false;
         } else if (var7 == 37969) {
            var19.Field10577 = false;
         } else if (var7 == 34752 || var7 == 36262 || var7 == 37703) {
            var19.Field10577 = true;
         }

         if (var5 != 2 || var7 != 4902 && var7 != 4903 && var7 != 4907) {
            if (var16 > 2368 && var17 > 3127 && var16 < 2376 && var17 < 3135 && var5 >= 2) {
               return true;
            }

            if (var16 > 2423 && var17 > 3072 && var16 < 2431 && var17 < 3080 && var5 >= 2) {
               return true;
            }
         }

         if (this.Field447) {
            var13 = false;
         }

         boolean var10000;
         int var52;
         if (!var14) {
            label1564: {
               if (var15 && this.Field447 || !var15) {
                  int var46 = var4;
                  ObjectDefinition var47;
                  if ((var47 = ObjectDefinition.Method11938(var7)) == null) {
                     var10000 = false;
                  } else {
                     if (var4 == 11) {
                        var46 = 10;
                     }

                     if (var46 >= 5 && var46 <= 8) {
                        var46 = 4;
                     }

                     int var49 = var46;
                     ObjectDefinition var48 = var47;
                     if (var47.Field10584 == null) {
                        if (var47.Field10581 == null) {
                           var10000 = true;
                        } else if (var46 != 10) {
                           var10000 = true;
                        } else {
                           boolean var93 = true;

                           for(var52 = 0; var52 < var48.Field10581.length; ++var52) {
                              var93 &= Model.Method14477(var48.Field10581[var52]);
                           }

                           var10000 = var93;
                        }
                     } else {
                        label1472: {
                           for(int var51 = 0; var51 < var48.Field10584.length; ++var51) {
                              if (var48.Field10584[var51] == var49) {
                                 var10000 = Model.Method14477(var48.Field10581[var51]);
                                 break label1472;
                              }
                           }

                           var10000 = true;
                        }
                     }
                  }

                  if (var10000) {
                     var10000 = true;
                     break label1564;
                  }
               }

               var10000 = false;
            }

            if (!var10000) {
               var18 = false;
               if (!var13 || var15) {
                  return false;
               }

               var10 = true;
            }

            if (var15 && !var14 && !var10 && this.Field447 && GraphicsDisplay.Field2678 && GraphicsDisplay.Field2667) {
               Class838.Field6955.Method10101(var6, var1, var5 - 1);
               Class838.Field6955.Method10101(var6, var1, var5);
               Class838.Field6955.Method10101(var6, var1, var5 + 1);
            }
         }

         int var20 = 1;
         int var73 = 1;
         int var21 = 1;
         int var22 = 1;
         int var23 = 1;
         int var24 = var19.Field10577 ? 1 : 0;
         if (var4 == 22) {
            var24 = var19.Field10577 && var19.Field10586 ? 1 : 0;
         }

         int var25 = var5;
         if (var5 == 0 && (var7 == 54755 || var7 == 38717 || var7 == 38758)) {
            var25 = 1;
         }

         Class501 var26;
         if (var15 && GraphicsDisplay.Field2678 && GraphicsDisplay.Field2667 && this.Field447 && (var26 = var2.Method8846(var5, var6, var1)) != null && var26.Field12852 != null && var25 < 3) {
            ++var25;
            ++var5;
         }

         if (var15 && !var10 && GraphicsDisplay.Field2678 && GraphicsDisplay.Field2667) {
            Class838.Field6955.Method10101(var6, var1, var5 - 1);
            Class838.Field6955.Method10101(var6, var1, var5);
            Class838.Field6955.Method10101(var6, var1, var5 + 1);
         }

         if (this.Field455 != null) {
            var20 = this.Field455[var25][var6][var1];
            var73 = this.Field455[var25][var6 + 1][var1];
            var21 = this.Field455[var25][var6 + 1][var1 + 1];
            var22 = this.Field455[var25][var6][var1 + 1];
            var23 = var20 + var73 + var21 + var22 >> 2;
         }

         if (var7 == 37227) {
            var23 += 620;
         } else if (var7 != 37243 && var7 != 37241 && var7 != 37239 && var7 != 37237 && var7 != 37235) {
            if (var7 == 25274) {
               var23 -= Client.Field12491 <= 3350 ? 193 : 10;
            } else if (var7 == 25280) {
               var23 -= 2;
            } else if (var7 != 33485 && var7 != 25281) {
               if (var7 == 25367) {
                  var23 += 8;
               } else if (var7 == 25285) {
                  var23 += 80;
               } else if (var7 == 26421) {
                  var23 -= 20;
               } else if (var7 == 26420) {
                  var23 += 4;
               } else if (var7 == 21792) {
                  if (var16 >= 4487 && var17 >= 5569 && var16 <= 4603 && var17 <= 5627) {
                     var23 -= 112;
                  }
               } else if (var16 >= 1598 && var17 >= 5580 && var16 <= 1655 && var17 <= 5625 && var7 >= 30214 && var7 <= 30222) {
                  return true;
               }
            } else {
               var23 -= 42;
            }
         } else {
            var23 -= 160;
         }

         boolean var77 = false;
         int var27;
         int var28;
         int var29;
         int var31;
         if (var25 > 0 && Method8823(var19) && (var19.Field10556 > 1 || var19.Field10570 > 1) && !Client.Field12596) {
            var15 = true;
            if (var2.Method8846(var25 - 1, var6, var1) != null && var2.Method8846(var25 - 1, var6, var1).Field12853 > 0) {
               var15 = false;
            }

            if (var15) {
               ++var6;
               ++var1;
            }

            var27 = this.Field455[var25 - 1][var6][var1];
            var28 = this.Field455[var25 - 1][var6 + 1][var1];
            var31 = this.Field455[var25 - 1][var6 + 1][var1 + 1];
            int var32 = this.Field455[var25 - 1][var6][var1 + 1];
            var29 = var27 + var28 + var31 + var32 + 16 >> 2;
            var77 = true;
            var23 = var29 - var19.Field10557;
            if (var15) {
               --var6;
               --var1;
            }
         }

         if (Method8823(var19) && var19.Field10556 <= 1 && var19.Field10570 <= 1) {
            var19.Field10572 = true;
         }

         if (var19.Field10571 && var11 >= 0) {
            var25 = var11;
         }

         var15 = true;
         if (Client.Field12183 != null) {
            if (var7 == 11604 && (var16 == 3095 && var17 == 3425 || var16 == 3087 && var17 == 3418 || var16 == 3093 && var17 == 3421 || var16 == 3093 && var17 == 3418 || var16 == 3079 && var17 == 3407 || var16 == 3080 && var17 == 3409 || var16 == 3076 && var17 == 3421)) {
               return true;
            }

            var27 = Client.Field12490 - Client.Field12494 + (Client.session_player == null ? Client.Field12567 : Client.session_player.Field4194 - 6 >> 7);
            var28 = Client.Field12491 - Client.Field12495 + (Client.session_player == null ? Client.Field12568 : Client.session_player.Field4195 - 6 >> 7);
            if (var16 == var27 && var17 == var28 && !var14) {
               var31 = -1;
               ObjectDefinition var85;
               if ((var85 = ObjectDefinition.Method11938(var7)).Field10581 != null) {
                  var31 = var85.Field10581[0];
               }

               if (Client.Field12080) {
                  System.out.println("[" + var16 + ", " + var17 + ", " + var11 + "/" + var5 + "/" + var25 + "]: " + var7 + ", " + var4 + ", " + var8 + ", model:" + var31 + ", clip: " + var19.Field10577 + ", " + var23 + ", adjg: " + var19.Field10572 + ", clip bit: " + var24);
               }
            }

            if (var16 >= 3124 && var17 >= 3482 && var16 <= 3132 && var17 <= 3490) {
               if (var5 > 0 || var4 != 10) {
                  return true;
               }
            } else {
               if (var16 == 2415 && var17 == 5099 && var7 == 666) {
                  return true;
               }

               if (var5 > Client.Field12379 && var16 >= 3195 && var17 >= 9342 && var16 <= 3327 && var17 <= 9406) {
                  return true;
               }
            }

            var15 = false;
         }

         if (var16 != 2950 || var17 != 3577 && var17 != 3578) {
            if (var7 >= 3567 && var7 <= 3569) {
               var4 = 10;
            }

            Client.Method13230(var16, var17, var11 + (var24 << 7), var7, var8, var4);
            if (!var15) {
               if (var19.Field10581 == null) {
                  return true;
               }

               if (var19.Field10581 != null) {
                  boolean var79 = true;

                  for(var28 = 0; var28 < var19.Field10581.length; ++var28) {
                     if (var19.Field10581[var28] >= 0) {
                        var79 = false;
                        break;
                     }
                  }

                  if (var79) {
                     return true;
                  }
               }
            }

            byte var80 = (byte)((var8 << 6) + var4);
            if (var19.Field10556 > 5 && var19.Field10570 > 5) {
               var19.Field10586 = true;
            }

            boolean var81 = !var19.Field10572 && GraphicsDisplay.Field2678;
            long var98 = (long)var6;
            long var10001 = (long)var1;
            long var10002 = (long)var8;
            long var94 = (long)var4;
            long var91 = var10002;
            long var89 = var10001;
            long var60 = var98 + (var89 << 7) + 1073741824L;
            if (var19 != null && !var19.Field10586) {
               var60 += 2147483648L;
            }

            long var62;
            if ((var62 = var94 << 36) < 0L) {
               var62 = -var62;
            }

            long var64;
            if ((var64 = var91 << 42) < 0L) {
               var64 = -var64;
            }

            long var66 = var60;
            if (var60 < 0L) {
               var66 = -var60;
            }

            var66 = var66 + var64 + var62;
            if (var81) {
               var66 += 4611686018427387904L;
            }

            if (var19 != null && !var19.Field10586) {
               var66 += 1125899906842624L;
            }

            boolean var68;
            if ((var68 = Method8821(var66)) != var81) {
               System.err.println("[ObjectManager]: adjust to ground mismatch: " + var66 + ": " + var19.Field10572 + "/" + var68);
            }

            if (Client.Field12183 != null && Client.session_player != null && !var77) {
               var23 = Class567.Method8813(var7, var16, var17, var23, var4) - 1;
            }

            if (var4 == 22) {
               boolean var88 = !var19.Field10586 && !var19.Field10549;
               if (var8 != 1 && var8 != 3) {
                  var4 = var19.Field10556;
                  var24 = var19.Field10570;
               } else {
                  var4 = var19.Field10570;
                  var24 = var19.Field10556;
               }

               var10000 = var19.Field10573;
               if (!var10) {
                  Object var83 = null;
                  if (!var14) {
                     if (var19.Field10591 == -1 && var19.Field10568 == null) {
                        var83 = var19.Method11944(22, var8, var20, var73, var21, var22, -1, var9, var6, var1, var25);
                     } else {
                        var83 = new ObjectInstance(var7, var8, 22, var73, var21, var20, var22, var19.Field10591, true, var6, var1, var25);
                     }
                  }

                  boolean var71 = false;
                  boolean var72 = false;
                  Class896 var61;
                  (var61 = new Class896()).Field414 = var88;
                  var61.Field422 = (Class511)var83;
                  var61.Field423 = var7;
                  var61.Field420 = (var6 << 7) + var4 * 64;
                  var61.Field421 = (var1 << 7) + var24 * 64;
                  var61.Field419 = var23;
                  var61.Field3080 = var66;
                  var61.Field424 = var80;
                  var61.Field416 = var81 ? SceneGraph.Method8860(var80) << 9 : 0;
                  var61.Field417 = 0;
                  var61.Field418 = 0;
                  var2.Method8846(var5, var6, var1).Field12850 = var61;
                  if (var83 instanceof ObjectInstance) {
                     var2.Method8846(var5, var6, var1).Field12840 = true;
                  }
               }

               if (var19.Field10577 && var19.Field10587 && var3 != null) {
                  var3.Method8190(var1, var6);
               }

               return var18;
            } else if (var4 != 10 && var4 != 11) {
               Object var84;
               if (var4 >= 12) {
                  if (!var10) {
                     var84 = null;
                     if (!var14) {
                        if (var19.Field10591 == -1 && var19.Field10568 == null) {
                           var84 = var19.Method11944(var4, var8, var20, var73, var21, var22, -1, var9, var6, var1, var25);
                        } else {
                           var84 = new ObjectInstance(var7, var8, var4, var73, var21, var20, var22, var19.Field10591, true, var6, var1, var25);
                        }
                     }

                     Class511 var10005 = (Class511)var84;
                     var11 = var81 ? var8 << 9 : 0;
                     boolean var96 = true;
                     Class511 var97 = var10005;
                     boolean var92 = true;
                     var2.Method8863(var66, var80, var23, 1, var97, 1, var5, var11, var1, var6, var7, false);
                     if (var4 >= 12 && var4 <= 17 && var4 != 13 && var5 > 0) {
                        this.Field459[var5][var6][var1] |= 2340;
                     }
                  }

                  if (var19.Field10577 && var3 != null) {
                     var3.Method8189(var19.Field10566, var19.Field10556, var19.Field10570, var6, var1, var8);
                  }

                  return var18;
               } else if (var4 == 0) {
                  var84 = null;
                  if (!var10) {
                     if (!var14) {
                        if (var19.Field10591 == -1 && var19.Field10568 == null) {
                           var84 = var19.Method11944(0, var8, var20, var73, var21, var22, -1, var9, var6, var1, var25);
                        } else {
                           var84 = new ObjectInstance(var7, var8, 0, var73, var21, var20, var22, var19.Field10591, true, var6, var1, var25);
                        }
                     }

                     var2.Method8861(Field472[var8], (Class511)var84, var66, var1, var80, var6, (Class511)null, var23, 0, var5, var7, var81, var14);
                  }

                  if (var19.Field10577 && var3 != null) {
                     var3.Method8188(var1, var8, var6, var4, var19.Field10566);
                  }

                  return var18;
               } else if (var4 == 1) {
                  var84 = null;
                  if (!var10) {
                     if (!var14) {
                        if (var19.Field10591 == -1 && var19.Field10568 == null) {
                           var84 = var19.Method11944(1, var8, var20, var73, var21, var22, -1, var9, var6, var1, var25);
                        } else {
                           var84 = new ObjectInstance(var7, var8, 1, var73, var21, var20, var22, var19.Field10591, true, var6, var1, var25);
                        }
                     }

                     if (var19.Field10588) {
                        if (var8 == 0) {
                           this.Field458[var5][var6][var1 + 1] = 50;
                        } else if (var8 == 1) {
                           this.Field458[var5][var6 + 1][var1 + 1] = 50;
                        } else if (var8 == 2) {
                           this.Field458[var5][var6 + 1][var1] = 50;
                        } else if (var8 == 3) {
                           this.Field458[var5][var6][var1] = 50;
                        }
                     }

                     var2.Method8861(Field463[var8], (Class511)var84, var66, var1, var80, var6, (Class511)null, var23, 0, var5, var7, var81, var14);
                  }

                  if (var19.Field10577 && var3 != null) {
                     var3.Method8188(var1, var8, var6, var4, var19.Field10566);
                  }

                  return var18;
               } else {
                  Object var76;
                  if (var4 == 2) {
                     var29 = var8 + 1 & 3;
                     Object var74 = null;
                     var76 = null;
                     if (!var10) {
                        if (!var14) {
                           if (var19.Field10591 == -1 && var19.Field10568 == null) {
                              var74 = var19.Method11944(2, var8 + 4, var20, var73, var21, var22, -1, var9, var6, var1, var25);
                              var76 = var19.Method11944(2, var29, var20, var73, var21, var22, -1, var9, var6, var1, var25);
                           } else {
                              var74 = new ObjectInstance(var7, var8 + 4, 2, var73, var21, var20, var22, var19.Field10591, true, var6, var1, var25);
                              var76 = new ObjectInstance(var7, var29, 2, var73, var21, var20, var22, var19.Field10591, true, var6, var1, var25);
                           }
                        }

                        if (var19.Field10574) {
                           if (var8 == 0) {
                              this.Field459[var5][var6][var1] |= 585;
                              this.Field459[var5][var6][var1 + 1] |= 1170;
                           } else if (var8 == 1) {
                              this.Field459[var5][var6][var1 + 1] |= 1170;
                              this.Field459[var5][var6 + 1][var1] |= 585;
                           } else if (var8 == 2) {
                              this.Field459[var5][var6 + 1][var1] |= 585;
                              this.Field459[var5][var6][var1] |= 1170;
                           } else if (var8 == 3) {
                              this.Field459[var5][var6][var1] |= 1170;
                              this.Field459[var5][var6][var1] |= 585;
                           }
                        }

                        if (var19.Field10583 != 16) {
                           int var90 = var19.Field10583;
                           Class501 var50;
                           if ((var50 = var2.Method8846(var5, var6, var1)) != null) {
                              Class887 var95 = var50.Field12849;
                              if (var50.Field12849 != null) {
                                 var52 = (var6 << 7) + 64;
                                 var24 = (var1 << 7) + 64;
                                 var95.Field898 = var52 + (var95.Field898 - var52) * var90 / 16;
                                 var95.Field899 = var24 + (var95.Field899 - var24) * var90 / 16;
                              }
                           }
                        }

                        var2.Method8861(Field472[var8], (Class511)var74, var66, var1, var80, var6, (Class511)var76, var23, Field472[var29], var5, var7, var81, var14);
                     }

                     if (var19.Field10577 && var3 != null) {
                        var3.Method8188(var1, var8, var6, var4, var19.Field10566);
                     }

                     return var18;
                  } else if (var4 == 3) {
                     var84 = null;
                     if (!var10) {
                        if (!var14) {
                           if (var19.Field10591 == -1 && var19.Field10568 == null) {
                              var84 = var19.Method11944(3, var8, var20, var73, var21, var22, -1, var9, var6, var1, var25);
                           } else {
                              var84 = new ObjectInstance(var7, var8, 3, var73, var21, var20, var22, var19.Field10591, true, var6, var1, var25);
                           }
                        }

                        if (var19.Field10588) {
                           if (var8 == 0) {
                              this.Field458[var5][var6][var1 + 1] = 50;
                           } else if (var8 == 1) {
                              this.Field458[var5][var6 + 1][var1 + 1] = 50;
                           } else if (var8 == 2) {
                              this.Field458[var5][var6 + 1][var1] = 50;
                           } else if (var8 == 3) {
                              this.Field458[var5][var6][var1] = 50;
                           }
                        }

                        var2.Method8861(Field463[var8], (Class511)var84, var66, var1, var80, var6, (Class511)null, var23, 0, var5, var7, var81, var14);
                     }

                     if (var19.Field10577 && var3 != null) {
                        var3.Method8188(var1, var8, var6, var4, var19.Field10566);
                     }

                     return var18;
                  } else if (var4 == 9) {
                     var84 = null;
                     if (!var10) {
                        if (!var14) {
                           if (var19.Field10591 == -1 && var19.Field10568 == null) {
                              var84 = var19.Method11944(var4, var8, var20, var73, var21, var22, -1, var9, var6, var1, var25);
                           } else {
                              var84 = new ObjectInstance(var7, var8, var4, var73, var21, var20, var22, var19.Field10591, true, var6, var1, var25);
                           }
                        }

                        var2.Method8863(var66, var80, var23, 1, (Class511)var84, 1, var5, var81 ? var8 << 9 : 0, var1, var6, var7, var14);
                     }

                     if (var19.Field10577 && var3 != null) {
                        var3.Method8189(var19.Field10566, var19.Field10556, var19.Field10570, var6, var1, var8);
                     }

                     return var18;
                  } else {
                     if (var19.Field10572) {
                        if (var8 == 1) {
                           var29 = var22;
                           var22 = var21;
                           var21 = var73;
                           var73 = var20;
                           var20 = var29;
                        } else if (var8 == 2) {
                           var29 = var22;
                           var22 = var73;
                           var73 = var29;
                           var29 = var21;
                           var21 = var20;
                           var20 = var29;
                        } else if (var8 == 3) {
                           var29 = var22;
                           var22 = var20;
                           var20 = var73;
                           var73 = var21;
                           var21 = var29;
                        }
                     }

                     if (var4 == 4) {
                        if (!var10) {
                           var84 = null;
                           if (!var14) {
                              if (var19.Field10591 == -1 && var19.Field10568 == null) {
                                 var84 = var19.Method11944(4, var8, var20, var73, var21, var22, -1, var9, var6, var1, var25);
                              } else {
                                 var84 = new ObjectInstance(var7, 0, 4, var73, var21, var20, var22, var19.Field10591, true, var6, var1, var25);
                              }
                           }

                           var2.Method8862(var66, var1, var8 << 9, var5, 0, var23, (Class511)var84, var6, var80, 0, Field472[var8], var7);
                        }

                        return var18;
                     } else if (var4 == 5) {
                        if (!var10) {
                           var29 = 16;
                           if ((var11 = var2.Method8875(var5, var6, var1)) > 0) {
                              var29 = ObjectDefinition.Method11938(var11 >> 14 & 32767).Field10583;
                           }

                           var76 = null;
                           if (!var14) {
                              if (var19.Field10591 == -1 && var19.Field10568 == null) {
                                 var76 = var19.Method11944(4, var8, var20, var73, var21, var22, -1, var9, var6, var1, var25);
                              } else {
                                 var76 = new ObjectInstance(var7, 0, 4, var73, var21, var20, var22, var19.Field10591, true, var6, var1, var25);
                              }
                           }

                           var2.Method8862(var66, var1, var8 << 9, var5, Field461[var8] * var29, var23, (Class511)var76, var6, var80, Field465[var8] * var29, Field472[var8], var7);
                        }

                        return var18;
                     } else if (var4 == 6) {
                        if (!var10) {
                           var84 = null;
                           if (!var14) {
                              if (var19.Field10591 == -1 && var19.Field10568 == null) {
                                 var84 = var19.Method11944(4, var8, var20, var73, var21, var22, -1, var9, var6, var1, var25);
                              } else {
                                 var84 = new ObjectInstance(var7, 0, 4, var73, var21, var20, var22, var19.Field10591, true, var6, var1, var25);
                              }
                           }

                           var2.Method8862(var66, var1, var8, var5, 0, var23, (Class511)var84, var6, var80, 0, 256, var7);
                        }

                        return var18;
                     } else if (var4 == 7) {
                        if (!var10) {
                           var84 = null;
                           if (!var14) {
                              if (var19.Field10591 == -1 && var19.Field10568 == null) {
                                 var84 = var19.Method11944(4, var8, var20, var73, var21, var22, -1, var9, var6, var1, var25);
                              } else {
                                 var84 = new ObjectInstance(var7, 0, 4, var73, var21, var20, var22, var19.Field10591, true, var6, var1, var25);
                              }
                           }

                           var2.Method8862(var66, var1, var8, var5, 0, var23, (Class511)var84, var6, var80, 0, 512, var7);
                        }

                        return var18;
                     } else {
                        if (var4 == 8 && !var10) {
                           var84 = null;
                           if (!var14) {
                              if (var19.Field10591 == -1 && var19.Field10568 == null) {
                                 var84 = var19.Method11944(4, var8, var20, var73, var21, var22, -1, var9, var6, var1, var25);
                              } else {
                                 var84 = new ObjectInstance(var7, 0, 4, var73, var21, var20, var22, var19.Field10591, true, var6, var1, var25);
                              }
                           }

                           var2.Method8862(var66, var1, var8, var5, 0, var23, (Class511)var84, var6, var80, 0, 768, var7);
                        }

                        return var18;
                     }
                  }
               }
            } else {
               if (var19 != null) {
                  var29 = var8 << 9;
                  if (var4 == 11) {
                     var29 += 256;
                  }

                  if (!var81) {
                     var29 = var4 == 11 ? 256 : 0;
                  }

                  var4 = var1;
                  var24 = var6;
                  int var78 = 0;
                  var28 = 0;
                  int var75;
                  if (var8 != 1 && var8 != 3) {
                     var11 = var19.Field10556;
                     var75 = var19.Field10570;
                  } else {
                     var11 = var19.Field10570;
                     var75 = var19.Field10556;
                  }

                  if (var16 >= 3142 && var17 >= 3466 && var16 <= 3190 && var17 <= 3509 || var16 >= 3520 && var17 >= 3288 && var16 <= 3650 && var17 <= 3390 || var16 >= 3272 && var17 >= 3432 && var16 <= 3299 && var17 <= 3464) {
                     boolean var30 = var75 > 8 || var11 > 8;
                     boolean var33 = false;
                     boolean var34 = GraphicsDisplay.Field2678 && GraphicsDisplay.Field2667;
                     if (var30 && !var34) {
                        return true;
                     }

                     if (var7 == 48043 || var7 == 48044 || var7 >= 48065 && var7 <= 48070) {
                        var23 -= 260;
                        if (!var34) {
                           return true;
                        }
                     }

                     if (var7 == 47150) {
                        var33 = true;
                     } else if (var75 > 1 || var11 > 1) {
                        var19.Field10591 = -1;
                     }

                     if (var30) {
                        var19.Field10591 = -1;
                        var19.Field10572 = true;
                        var19.Field10577 = false;
                        switch(var7) {
                        case 47248:
                           var78 = 64;
                           var28 = -64;
                           break;
                        case 47451:
                           var78 = -64;
                           var28 = -64;
                           break;
                        case 47919:
                           var78 = 64;
                           var28 = 64;
                           break;
                        case 48012:
                           var78 = -64;
                           var28 = 64;
                        }
                     }

                     if (var7 != 4835 && var7 != 46444 && var7 != 47173 && var7 != 27990 && var7 != 2738) {
                        if (!var33 && (var75 > 1 || var11 > 1)) {
                           if (var16 <= 3164) {
                              if (var30) {
                                 var78 += 64;
                              }

                              var24 = var6 + (var19.Field10556 - 1) / 2;
                           } else {
                              if (var30) {
                                 var78 -= 64;
                              }

                              var24 = var6 + var19.Field10556 / 2;
                           }

                           if (var17 <= 3491) {
                              if (var30) {
                                 var28 += 64;
                              }

                              var4 = var1 + (var19.Field10570 - 1) / 2;
                           } else {
                              if (var30) {
                                 var28 -= 64;
                              }

                              var4 = var1 + var19.Field10570 / 2;
                           }

                           if (var30) {
                              if (var16 <= 3154) {
                                 var78 -= 64;
                              } else if (var16 >= 3171) {
                                 var78 += 64;
                              }

                              if (var17 <= 3481) {
                                 var28 -= 64;
                              } else if (var17 >= 3499) {
                                 var28 += 64;
                              }

                              int var99 = var19.Field10556;
                              var99 = var19.Field10570;
                           }

                           var11 = 1;
                           var75 = 1;
                        }
                     } else {
                        var19.Field10577 = true;
                     }
                  }

                  Object var82 = null;
                  if (!var10) {
                     if (!var14) {
                        if (var19.Field10591 == -1 && var19.Field10568 == null) {
                           var82 = var19.Method11944(10, var8, var20, var73, var21, var22, -1, var9, var6, var1, var25);
                        } else {
                           var82 = new ObjectInstance(var7, var8, 10, var73, var21, var20, var22, var19.Field10591, true, var6, var1, var25);
                        }
                     }

                     if (var2.Method8864(var66, var80, var23, var75, (Class511)var82, var11, var5, var29, var4, var24, var7, var14, var78, var28) && var19.Field10588 && !var10 && !var12) {
                        Model var86;
                        if (var82 instanceof Model) {
                           var86 = (Model)var82;
                        } else {
                           var86 = var19.Method11944(10, var8, var20, var73, var21, var22, -1, var9, var6, var1, var25);
                        }

                        if (var86 != null) {
                           for(int var87 = 0; var87 <= var11; ++var87) {
                              for(int var70 = 0; var70 <= var75; ++var70) {
                                 if ((var7 = var86.Field2846 / 4) > 30) {
                                    var7 = 30;
                                 }

                                 if (var7 > this.Field458[var5][var24 + var87][var4 + var70]) {
                                    this.Field458[var5][var24 + var87][var4 + var70] = (byte)var7;
                                 }
                              }
                           }
                        }
                     }
                  }
               }

               if (var19.Field10577 && var3 != null) {
                  var3.Method8189(var19.Field10566, var19.Field10556, var19.Field10570, var6, var1, var8);
               }

               return var18;
            }
         } else {
            return true;
         }
      }
   }

   private static int Method8832(int var0, int var1, int var2) {
      int var3 = var0 / var2;
      var0 &= var2 - 1;
      int var4 = var1 / var2;
      var1 &= var2 - 1;
      int var5 = Method8841(var3, var4);
      int var6 = Method8841(var3 + 1, var4);
      int var7 = Method8841(var3, var4 + 1);
      var3 = Method8841(var3 + 1, var4 + 1);
      var4 = Method8839(var5, var6, var0, var2);
      var0 = Method8839(var7, var3, var0, var2);
      return Method8839(var4, var0, var1, var2);
   }

   private static int Method8833(int var0, int var1, int var2) {
      if (var2 > 179) {
         var1 >>= 1;
      }

      if (var2 > 192) {
         var1 >>= 1;
      }

      if (var2 > 217) {
         var1 >>= 1;
      }

      if (var2 > 243) {
         var1 >>= 1;
      }

      return (var0 >> 2 << 10) + (var1 >> 5 << 7) + (var2 >> 1);
   }

   public final void Method8834(int var1, int var2, Class504[] var3, int var4, int var5, byte[] var6, int var7, int var8, int var9) {
      int var11;
      for(int var10 = 0; var10 < 8; ++var10) {
         for(var11 = 0; var11 < 8; ++var11) {
            if (var4 + var10 > 0 && var4 + var10 < SceneGraph.mapSizeWidth - 1 && var9 + var11 > 0 && var9 + var11 < SceneGraph.mapSizeWidth - 1) {
               var3[var8].Field12868[var4 + var10][var9 + var11] &= -16777217;
            }
         }
      }

      Packet var17 = new Packet(var6);

      for(var11 = 0; var11 < 4; ++var11) {
         for(int var15 = 0; var15 < 64; ++var15) {
            for(int var16 = 0; var16 < 64; ++var16) {
               if (var11 == var1 && var15 >= var5 && var15 < var5 + 8 && var16 >= var7 && var16 < var7 + 8) {
                  int var10002 = var15 & 7;
                  int var13 = var16 & 7;
                  int var12 = var10002;
                  int var14;
                  int var10001 = var9 + ((var14 = var2 & 3) == 0 ? var13 : (var14 == 1 ? 7 - var12 : (var14 == 2 ? 7 - var13 : var12)));
                  int var10005 = var15 & 7;
                  var13 = var16 & 7;
                  var12 = var10005;
                  this.Method8836(var10001, 0, var17, var4 + ((var14 = var2 & 3) == 0 ? var12 : (var14 == 1 ? var13 : (var14 == 2 ? 7 - var12 : 7 - var13))), var8, var2, 0);
               } else {
                  this.Method8836(-1, 0, var17, -1, 0, 0, 0);
               }
            }
         }
      }

   }

   public final void Method8835(byte[] var1, int var2, int var3, int var4, int var5, Class504[] var6) {
      int var8;
      int var9;
      if (var6 != null) {
         for(int var7 = 0; var7 < 4; ++var7) {
            if (var6[var7] != null) {
               for(var8 = 0; var8 < 64; ++var8) {
                  for(var9 = 0; var9 < 64; ++var9) {
                     if (var3 + var8 > 0 && var3 + var8 < SceneGraph.mapSizeWidth - 1 && var2 + var9 > 0 && var2 + var9 < SceneGraph.mapSizeWidth - 1) {
                        var6[var7].Field12868[var3 + var8][var2 + var9] &= -16777217;
                     }
                  }
               }
            }
         }
      }

      Packet var15 = new Packet(var1);

      for(var8 = 0; var8 < 4; ++var8) {
         for(var9 = 0; var9 < 64; ++var9) {
            for(int var13 = 0; var13 < 64; ++var13) {
               int var14 = var13 + var2;
               int var10 = var9 + var3;
               this.Method8836(var14, var5, var15, var10, var8, 0, var4);
               if (var10 >= 0 && var10 < SceneGraph.mapSizeWidth && var14 >= 0 && var14 < SceneGraph.mapSizeWidth) {
                  int var11 = var14 + var4;
                  int var12 = var10 + var5;
                  Class488 var16 = new Class488(var11, var12);
                  Integer var17;
                  if ((var17 = (Integer) Class503.Field12869.get(var16)) != null) {
                     this.Field455[0][var14][var10] = var17;
                  }
               }
            }
         }
      }

   }

   private void Method8836(int var1, int var2, Packet var3, int var4, int var5, int var6, int var7) {
      int var8;
      if (var4 >= 0 && var4 < SceneGraph.mapSizeWidth && var1 >= 0 && var1 < SceneGraph.mapSizeWidth) {
         this.Field470[var5][var4][var1] = 0;

         while((var8 = var3.g1()) != 0) {
            if (var8 == 1) {
               if ((var2 = var3.g1()) <= 1) {
                  var2 = 0;
               }

               if (var5 == 0) {
                  this.Field455[0][var4][var1] = -var2 << 3;
                  return;
               }

               this.Field455[var5][var4][var1] = this.Field455[var5 - 1][var4][var1] - (var2 << 3);
               return;
            }

            if (var8 <= 49) {
               this.Field456[var5][var4][var1] = var3.Method400();
               this.Field460[var5][var4][var1] = (byte)((var8 - 2) / 4);
               this.Field469[var5][var4][var1] = (byte)(var8 - 2 + var6 & 3);
            } else if (var8 <= 81) {
               this.Field470[var5][var4][var1] = (byte)(var8 - 49);
            } else {
               this.Field464[var5][var4][var1] = (byte)(var8 - 81);
            }
         }

         if (var5 == 0) {
            int[] var10000 = this.Field455[0][var4];
            int var10001 = var1;
            int var10002 = var4 + 932731 + var7;
            var2 += var1 + 556238;
            var1 = var10002;
            if ((var1 = (int)((double)(Method8832(var10002 + '넵', var2 + 91923, 4) - 128 + (Method8832(var1 + 10294, var2 + '鎽', 2) - 128 >> 1) + (Method8832(var1, var2, 1) - 128 >> 2)) * 0.3D) + 35) < 10) {
               var1 = 10;
            } else if (var1 > 60) {
               var1 = 60;
            }

            var10000[var10001] = -var1 << 3;
         } else {
            this.Field455[var5][var4][var1] = this.Field455[var5 - 1][var4][var1] - 240;
         }
      } else {
         while((var8 = var3.g1()) != 0) {
            if (var8 == 1) {
               var3.g1();
               return;
            }

            if (var8 <= 49) {
               var3.g1();
            }
         }

      }
   }

   public final int Method8837(int var1, int var2, int var3) {
      if ((this.Field470[var2][var3][var1] & 8) != 0) {
         return 0;
      } else {
         return var2 > 0 && (this.Field470[1][var3][var1] & 2) != 0 ? var2 - 1 : var2;
      }
   }

   public final void Method8838(Class504[] var1, SceneGraph var2, int var3, int var4, int var5, int var6, byte[] var7, int var8, int var9, int var10, boolean var11, int var12) {
      this.Field447 = false;
      this.Field446 = false;
      Packet var29 = new Packet(var7);
      int var13 = -1;

      int var14;
      label144:
      while((var14 = var29.Method414()) != 0) {
         var13 += var14;
         var14 = 0;

         while(true) {
            int var15;
            int var16;
            int var17;
            int var18;
            int var19;
            int var31;
            do {
               do {
                  do {
                     do {
                        ObjectDefinition var24;
                        String var25;
                        do {
                           do {
                              do {
                                 do {
                                    do {
                                       do {
                                          if ((var15 = var29.Method414()) == 0) {
                                             continue label144;
                                          }

                                          var15 = (var14 += var15 - 1) & 63;
                                          var16 = var14 >> 6 & 63;
                                          var17 = var14 >> 12;
                                          var19 = (var18 = var29.g1()) >> 2;
                                          var18 &= 3;
                                       } while(var17 != var3);
                                    } while(var16 < var8);
                                 } while(var16 >= var8 + 8);
                              } while(var15 < var5);
                           } while(var15 >= var5 + 8);
                        } while((((var24 = ObjectDefinition.Method11938(var13)) != null && var24.Field10552 != null ? (var25 = var24.Field10552.toLowerCase()).endsWith(" space") || var25.contains(" space ") || var25.endsWith(" hotspot") || var13 >= 15369 && var13 <= 15376 : false) || var11) && !var11);

                        ObjectDefinition var20;
                        int var21 = (var20 = ObjectDefinition.Method11938(var13)).Field10556;
                        var31 = var20.Field10570;
                        int var22 = var21;
                        int var23 = var31;
                        if (var18 == 1 || var18 == 3) {
                           var23 = var21;
                           var22 = var31;
                        }

                        int var10001 = var16 & 7;
                        int var33 = var15 & 7;
                        var21 = var10001;
                        int var27;
                        var31 = var4 + ((var27 = var9 & 3) == 0 ? var21 : (var27 == 1 ? var33 : (var27 == 2 ? 7 - var21 - (var22 - 1) : 7 - var33 - (var23 - 1))));
                        var10001 = var16 & 7;
                        var33 = var15 & 7;
                        var21 = var10001;
                        var15 = var10 + ((var27 = var9 & 3) == 0 ? var33 : (var27 == 1 ? 7 - var21 - (var22 - 1) : (var27 == 2 ? 7 - var33 - (var23 - 1) : var21)));
                     } while(var31 <= 0);
                  } while(var15 <= 0);
               } while(var31 >= SceneGraph.mapSizeWidth - 1);
            } while(var15 >= SceneGraph.mapSizeWidth - 1);

            var16 = var17;
            if ((this.Field470[1][var31][var15] & 2) == 2) {
               var16 = var17 - 1;
            }

            Class504 var30 = null;
            if (var16 >= 0) {
               var30 = var1[var6];
            }

            var16 = var6;

            while(true) {
               try {
                  Class564 var32 = new Class564(var31, var15, var6, var13, (var18 + var9) % 4, var19, var16);
                  this.Field444.add(var32);
                  this.Method8831(var15, var2, var30, var19, var6, var31, var13, (var18 + var9) % 4, var12, true, var16, false, true, false, false);
                  break;
               } catch (Exception var28) {
                  var28.printStackTrace();
               }
            }
         }
      }

      this.Field446 = true;
   }

   private static int Method8839(int var0, int var1, int var2, int var3) {
      var2 = 65536 - Rasterizer.Field9960[(var2 << 10) / var3] >> 1;
      return (var0 * (65536 - var2) >> 16) + (var1 * var2 >> 16);
   }

   private static int Method8840(int var0, int var1) {
      if (var0 == -2) {
         return 12345678;
      } else if (var0 == -1) {
         if (var1 < 0) {
            var1 = 0;
         } else if (var1 > 127) {
            var1 = 127;
         }

         return var1 = 127 - var1;
      } else {
         if ((var1 = var1 * (var0 & 127) / 128) < 2) {
            var1 = 2;
         } else if (var1 > 126) {
            var1 = 126;
         }

         return (var0 & 'ﾀ') + var1;
      }
   }

   private static int Method8841(int var0, int var1) {
      int var2 = Method8816(var0 - 1, var1 - 1) + Method8816(var0 + 1, var1 - 1) + Method8816(var0 - 1, var1 + 1) + Method8816(var0 + 1, var1 + 1);
      int var3 = Method8816(var0 - 1, var1) + Method8816(var0 + 1, var1) + Method8816(var0, var1 - 1) + Method8816(var0, var1 + 1);
      var0 = Method8816(var0, var1);
      return var2 / 16 + var3 / 8 + var0 / 4;
   }

   private static int Method8842(int var0, int var1) {
      if (var0 == -1) {
         return 12345678;
      } else {
         if ((var1 = var1 * (var0 & 127) / 128) < 2) {
            var1 = 2;
         } else if (var1 > 126) {
            var1 = 126;
         }

         return (var0 & 'ﾀ') + var1;
      }
   }

   public final void Method8843(int var1, Class504[] var2, int var3, SceneGraph var4, byte[] var5, int var6) {
      this.Method8844(var1, var2, var3, var4, var5, var6, false, false);
   }

   public final void Method8844(int var1, Class504[] var2, int var3, SceneGraph var4, byte[] var5, int var6, boolean var7, boolean var8) {
      if (!var8) {
         this.Field447 = false;
         this.Field446 = false;
      }

      Packet var19 = new Packet(var5);
      int var21 = -1;

      int var9;
      while((var9 = var19.Method414()) != 0) {
         var21 += var9;
         var9 = 0;

         int var10;
         while((var10 = var19.Method414()) != 0) {
            var10 = (var9 += var10 - 1) & 63;
            int var11 = var9 >> 6 & 63;
            int var12 = var9 >> 12;
            int var13;
            int var14 = (var13 = var19.g1()) >> 2;
            var13 &= 3;
            var11 += var1;
            var10 += var3;
            if (var11 > 0 && var10 > 0 && var11 < SceneGraph.mapSizeWidth - 1 && var10 < SceneGraph.mapSizeWidth - 1 && var12 >= 0 && var12 < 4) {
               int var15 = var12;
               if ((this.Field470[1][var11][var10] & 2) == 2) {
                  var15 = var12 - 1;
               }

               Class504 var16 = null;
               if (var15 >= 0) {
                  var16 = var2[var15];
               }

               Class564 var17 = new Class564(var11, var10, var12, var21, var13, var14, var15);
               if (var8) {
                  this.Method8831(var10, var4, var16, var14, var12, var11, var21, var13, var6, false, var15, false, true, var8, false);
               } else {
                  Class501 var18;
                  if ((var18 = var4.Method8845(var15 >= 0 ? var15 : var12, var11, var10)) != null) {
                     ;
                  }

                  this.Method8831(var10, var4, var16, var14, var12, var11, var21, var13, var6, true, var15, false, true, var8, false);
                  this.Field444.add(var17);
               }
            }
         }
      }

      for(int var20 = 0; var20 < 4; ++var20) {
         for(var21 = 1; var21 < this.Field468 - 1; ++var21) {
            for(var9 = 1; var9 < this.Field467 - 1; ++var9) {
               var4.Method8857(var20, var9, var21, this.Method8837(var21, var20, var9));
            }
         }
      }

      this.Field446 = true;
   }
}
