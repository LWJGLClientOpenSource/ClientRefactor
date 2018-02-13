package net.LWJGLClient.client.b.b.b.a.b;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import net.LWJGLClient.client.a.Class128;
import net.LWJGLClient.client.b.b.b.a.ModelVBO;
import net.LWJGLClient.client.b.b.b.a.c.Class585;
import net.LWJGLClient.client.b.b.b.a.c.Class586;
import net.LWJGLClient.client.b.b.b.a.c.Class588;
import net.LWJGLClient.client.a.d.Class120;
import net.LWJGLClient.client.b.Rasterizer;
import net.LWJGLClient.client.b.b.GraphicsDisplay;
import net.LWJGLClient.client.b.b.b.a.AssetLoader;
import net.LWJGLClient.client.b.b.b.a.Texture;
import net.LWJGLClient.client.b.b.e.Class358;
import net.LWJGLClient.client.b.b.f.Class838;
import net.LWJGLClient.client.b.b.f.Class842;
import net.LWJGLClient.client.b.b.f.Class843;
import net.LWJGLClient.client.d.SceneGraph;
import net.LWJGLClient.client.e.d.Class350;
import net.LWJGLClient.client.e.d.Class353;
import net.LWJGLClient.client.model.Client;
import net.LWJGLClient.client.model.Model;
import net.LWJGLClient.client.model.a.a.Class501;
import net.LWJGLClient.client.model.a.d.Class453;

public class ModelLoader extends AssetLoader {
   public boolean Field3156 = false;
   private Map Field3157 = new HashMap();
   private Map Field3158 = new HashMap();
   private List Field3159 = new LinkedList();

   public static final long Method1480(long var0, long var2, long var4) {
      int var10000 = Client.Field12497;
      int var6 = Client.Field12494;
      var10000 = Client.Field12498;
      int var7 = Client.Field12495;
      int var8 = SceneGraph.mapSizeWidth / 4;
      long var9 = ((long) Client.Field12490 + var2 - (long)var6) / (long)var8 * (long)var8;
      long var11 = ((long) Client.Field12491 + var4 - (long)var7) / (long)var8 * (long)var8;
      return (var0 << 52) + (var9 << 24) + var11;
   }

   public static final long Method1481(int var0, int var1, int var2) {
      return (long)(var2 << 56) + (Math.round((double)var1) << 28) + Math.round((double)var0);
   }

   protected static boolean Method1482(int var0) {
      if (!Rasterizer.Field9942 && !Rasterizer.Field9943) {
         return false;
      } else {
         return !Class585.Method8950(var0) || Client.Field12068 != 0;
      }
   }

   private static float Method1483(int var0) {
      if (var0 == 595) {
         return 15.0F;
      } else if (var0 == 492) {
         return 10.0F;
      } else if (var0 == 600) {
         return 15.0F;
      } else if (var0 == 619) {
         return 15.0F;
      } else if (var0 == 493) {
         return 15.0F;
      } else if (var0 == 197) {
         return 15.0F;
      } else if (var0 == 301) {
         return 10.0F;
      } else if (var0 == 35) {
         return 100.0F;
      } else if (var0 == 616) {
         return 10.0F;
      } else if (var0 == 181) {
         return 5.0F;
      } else if (var0 == 602) {
         return 10.0F;
      } else {
         return var0 == 408 ? 5.0F : 0.0F;
      }
   }

   protected final void Method1484(SceneGraph var1, int var2, int var3, int var4, int var5, Integer var6, boolean var7) {
      this.Method1485(var1, var2, var3, var4, var5, var5, var6, var7);
   }

   private void Method1485(SceneGraph var1, int var2, int var3, int var4, int var5, int var6, Integer var7, boolean var8) {
      if (Rasterizer.Field9942) {
         if (!Client.normalMem && var7 <= 50 && var5 == 1380625) {
            var5 = 8947848;
            var6 = 8947848;
         }

         boolean var9 = true;
         long var10 = Method1481(var2, var3, var4);
         if (var1.Field924.Method8956(var1, var7, var2, var3, var4, var6)) {
            int var12 = Client.Field12490 + (var2 >> 7) - Client.Field12494;
            var2 = Client.Field12491 + (var3 >> 7) - Client.Field12495;
            Class586 var13;
            if ((var13 = Class586.Method8961(var12, var2, var7)) != null) {
               var5 = var13.Method8970();
            } else {
               var5 = Class586.Field11944;
            }

            if (var5 <= 0 || var5 == Class586.Field11944) {
               var9 = false;
            }
         }

         if (var7 < 0) {
            var7 = Rasterizer.Field9944;
         }

         if (Method1482(var7)) {
            Object var14;
            if ((var14 = (List)this.Field3158.get(var10)) == null) {
               var14 = new LinkedList();
               this.Field3158.put(var10, var14);
            }

            if (!((List)var14).contains(var7)) {
               ((List)var14).add(var7);
            }

            if (var5 != 12448719 && var5 != 11660227 && var5 != 10806456 && var5 != 10017965 && var5 != 10867892) {
               if ((var14 = (Map)this.Field3157.get(var10)) == null) {
                  var14 = new HashMap();
                  this.Field3157.put(var10, var14);
               }

               Float var15;
               if ((var15 = (Float)((Map)var14).get(var5)) == null) {
                  var15 = 0.0F;
               }

               var15 = var15 + 1.0F;
               if (var7 == Rasterizer.Field9944) {
                  var15 = var15 + (var8 ? 1.25F : 2.5F);
               }

               var15 = var15 + Method1483(var7);
               if (var9 && var7 != -1) {
                  var15 = var15 + 2.0F;
               }

               if (!var8) {
                  var15 = var15 / 2.0F;
               }

               ((Map)var14).put(var5, var15);
            }
         }
      }
   }

   public final int Method1486(float var1, float var2, int var3, int var4) {
      if (Rasterizer.Field9943 && Rasterizer.Field9942) {
         long var5;
         var5 = Method1481((int)var1, (int)var2, var3);
         List var7;
         if ((var7 = (List)this.Field3158.get(var5)) != null && var7.size() > 1) {
            int var8;
            return (var8 = Math.round((float)(var7.size() * 5) * (1.0F + Method1483(var4) * 0.5F))) > 255 ? 255 : var8;
         } else {
            return 255;
         }
      } else {
         return 255;
      }
   }

   public final int Method1487(float var1, float var2, int var3, int var4) {
      long var5 = Method1481((int)var1, (int)var2, var3);
      Map var8;
      if ((var8 = (Map) this.Field3157.get(var5)) != null)
         if (var8.size() != 0) {
            var2 = 0.0F;
            float var10 = 0.0F;
            float var11 = 0.0F;
            float var12 = 0.0F;

            for (Iterator var6 = var8.entrySet().iterator(); var6.hasNext(); var12 += var1) {
               Entry var9;
               int var7 = (Integer) (var9 = (Entry) var6.next()).getKey();
               var1 = (Float) var9.getValue();
               var2 += (float) (var7 >> 16 & 255) * var1;
               var10 += (float) (var7 >> 8 & 255) * var1;
               var11 += (float) (var7 & 255) * var1;
            }

            var2 /= var12;
            var10 /= var12;
            var11 /= var12;
            return Math.round(var2) << 16 | Math.round(var10) << 8 | Math.round(var11);
         } else {
            return var4;
         }
      else {
         return var4;
      }
   }

   public final void Method7373() {
      Iterator var2 = this.Field3157.entrySet().iterator();

      while(var2.hasNext()) {
         ((Map)((Entry)var2.next()).getValue()).clear();
      }

      this.Field3157.clear();
      var2 = this.Field3158.entrySet().iterator();

      while(var2.hasNext()) {
         ((List)((Entry)var2.next()).getValue()).clear();
      }

      this.Field3158.clear();
      this.Field3156 = false;
   }

   public final ModelVBO Method1489(Class588 var1) {
      if (Client.Field12068 == 0) {
         return null;
      } else {
         long var2 = Method1480((long)(100 + (var1.Method9100() << 7) + var1.Method9101()), (long)((int)var1.Method9096()), (long)((int)var1.Method9097()));
         ModelVBO var4;
         if ((var4 = (ModelVBO)Class843.Method14000().get(var2)) != null) {
            return var4;
         } else {
            this.Method12366();
            LinkedList var5 = new LinkedList();
            int var6 = 0;
            var1.Method9094();
            int var7 = var1.Method9100();
            Iterator var9 = var1.Method9090().iterator();

            while(var9.hasNext()) {
               Class453 var8 = (Class453)var9.next();
               float var10 = var1.Method9093(var8.Method7833(), var8.Method7834(), -1.0F, 1.0F);
               float var11 = var1.Method9093(var8.Method7833(), var8.Method7834(), 1.0F, 1.0F);
               float var12 = var1.Method9093(var8.Method7833(), var8.Method7834(), -1.0F, -1.0F);
               float var13 = var1.Method9093(var8.Method7833(), var8.Method7834(), 1.0F, -1.0F);
               int var14 = var1.Method9103().Method8969() == -1 ? var1.Method9102() : var1.Method9103().Method8969();
               int var15 = var1.Method9103().Method8968();
               int var16 = var14 >> 16 & 255;
               int var17 = var14 >> 8 & 255;
               int var18 = var14 & 255;
               int var19 = var15 & 255;
               int var20 = var14 >> 16 & 255;
               int var21 = var14 >> 8 & 255;
               int var22 = var14 & 255;
               int var23 = var15 & 255;
               int var24 = var14 >> 16 & 255;
               int var25 = var14 >> 8 & 255;
               int var26 = var14 & 255;
               int var27 = var15 & 255;
               int var28 = var14 >> 16 & 255;
               int var29 = var14 >> 8 & 255;
               var14 &= 255;
               var15 &= 255;

               for(int var30 = 0; (float)var30 < 1.0F; ++var30) {
                  for(int var31 = 0; (float)var31 < 1.0F; ++var31) {
                     float var32 = (var8.Method7833() + 0.0F + (float)var30) * 128.0F;
                     float var33 = (var8.Method7833() + 1.0F + (float)var30) * 128.0F;
                     float var34 = (var8.Method7834() + 0.0F + (float)var31) * 128.0F;
                     float var35 = (var8.Method7834() + 1.0F + (float)var31) * 128.0F;
                     this.Field1933.put(var33);
                     this.Field1933.put(var11);
                     this.Field1933.put(var35);
                     this.Field1933.put(var32);
                     this.Field1933.put(var10);
                     this.Field1933.put(var35);
                     this.Field1933.put(var32);
                     this.Field1933.put(var12);
                     this.Field1933.put(var34);
                     ++var6;
                     this.Field1933.put(var33);
                     this.Field1933.put(var11);
                     this.Field1933.put(var35);
                     this.Field1933.put(var32);
                     this.Field1933.put(var12);
                     this.Field1933.put(var34);
                     this.Field1933.put(var33);
                     this.Field1933.put(var13);
                     this.Field1933.put(var34);
                     ++var6;
                     this.Field1934.put((byte)var24);
                     this.Field1934.put((byte)var25);
                     this.Field1934.put((byte)var26);
                     this.Field1934.put((byte)var27);
                     this.Field1934.put((byte)var16);
                     this.Field1934.put((byte)var17);
                     this.Field1934.put((byte)var18);
                     this.Field1934.put((byte)var19);
                     this.Field1934.put((byte)var20);
                     this.Field1934.put((byte)var21);
                     this.Field1934.put((byte)var22);
                     this.Field1934.put((byte)var23);
                     this.Field1934.put((byte)var24);
                     this.Field1934.put((byte)var25);
                     this.Field1934.put((byte)var26);
                     this.Field1934.put((byte)var27);
                     this.Field1934.put((byte)var20);
                     this.Field1934.put((byte)var21);
                     this.Field1934.put((byte)var22);
                     this.Field1934.put((byte)var23);
                     this.Field1934.put((byte)var28);
                     this.Field1934.put((byte)var29);
                     this.Field1934.put((byte)var14);
                     this.Field1934.put((byte)var15);
                     var32 = 0.5F;
                     var33 = 0.0F;
                     var34 = 0.5F;
                     var35 = 0.0F;
                     int var36 = Math.round(var8.Method7833());
                     int var37 = Math.round(var8.Method7834());
                     if (var36 % 2 == 1) {
                        var32 = 1.0F;
                        var33 = 0.5F;
                     }

                     if (var37 % 2 == 1) {
                        var34 = 1.0F;
                        var35 = 0.5F;
                     }

                     this.Field1935.put(var32);
                     this.Field1935.put(var35);
                     this.Field1935.put(var33);
                     this.Field1935.put(var35);
                     this.Field1935.put(var33);
                     this.Field1935.put(var34);
                     this.Field1935.put(var32);
                     this.Field1935.put(var35);
                     this.Field1935.put(var33);
                     this.Field1935.put(var34);
                     this.Field1935.put(var32);
                     this.Field1935.put(var34);
                  }
               }
            }

            var5.add(new int[]{var7, var6 * 3});
            this.Field1933.flip();
            this.Field1934.flip();
            this.Field1935.flip();
            boolean var40 = false;
            int var38;
            int var39;
            int var41;
            if (var4 == null) {
               int[] var42;
               var38 = (var42 = Class842.Method13977(3))[0];
               var39 = var42[1];
               var41 = var42[2];
            } else {
               var38 = var4.Method12370();
               var39 = var4.Method12371();
               var41 = var4.Method12375();
            }

            this.Method12368(var4, var38, var39, var41, true, 35044);
            GraphicsDisplay.Method997().Method1035("error in loadWaterModel(" + var2 + ", " + var38 + ", " + var39 + ")");
            if (var4 == null) {
               var4 = new ModelVBO(0, 0, true);
               Class843.Method13999(var2, var4);
            }

            var4.Method12377(var38, var39, var41, var6, var2, false, -1, true, var5);
            return var4;
         }
      }
   }

   public ModelVBO Method10098(int var1, SceneGraph var2, int var3, int var4, int var5, boolean var6) {
      if (var6) {
         var2.Field924.Method8959(false);
      }

      if (var2.Field940 == null) {
         System.err.println("[ModelLoader]: heights null");
         return null;
      } else {
         this.Field3159.clear();
         this.Method12366();
         int var7 = Client.Field12490 + var3 - Client.Field12494;
         int var8 = Client.Field12491 + var4 - Client.Field12495;
         long var9 = Method1480((long)var1, (long)var7, (long)var8);
         ModelVBO var101 = null;
         if (!var6) {
            if ((var101 = (ModelVBO)Class843.Method14000().get(var9)) != null) {
               return var101;
            }

            if (Class838.Field6955.Field11994++ >= Class838.Field6955.Field11995) {
               return null;
            }
         }

         if ((var8 = var3 + var5) > SceneGraph.mapSizeWidth) {
            var8 = SceneGraph.mapSizeWidth;
         }

         if ((var5 += var4) > SceneGraph.mapSizeWidth) {
            var5 = SceneGraph.mapSizeWidth;
         }

         int var12;
         int var14;
         int var16;
         int var18;
         int var19;
         int var20;
         int var21;
         int var24;
         int var25;
         int var26;
         int[] var128;
         if (var6) {
            for(int var102 = var3; var102 < var8; ++var102) {
               Class501 var106;
               for(int var104 = var4; var104 < var5; ++var104) {
                  for(var12 = 0; var12 < 2 && (var106 = var2.Method8846(var1, var102, var104)) != null; ++var12) {
                     if (var12 == 1) {
                        var106 = var106.Field12852;
                     }

                     if (var106 == null) {
                        break;
                     }

                     var14 = var106.Field12845;
                     int var105;
                     int var112;
                     int var113;
                     if (var106.Field12846 != null) {
                        Class353 var99 = var106.Field12846;
                        if (var106.Field12846.Field1471 > 65535 || var99.Field1468 > 65535 || var99.Field1470 > 65535 || var99.Field1469 > 65535 || var99.Field1471 < 0 || var99.Field1468 < 0 || var99.Field1470 < 0 || var99.Field1469 < 0) {
                           continue;
                        }

                        var105 = var102 << 7;
                        var16 = var104 << 7;

                        for(var18 = 0; (float)var18 < 1.0F; ++var18) {
                           for(var19 = 0; (float)var19 < 1.0F; ++var19) {
                              var20 = Math.round((float)var105 + (float)var18 * 128.0F);
                              var21 = Math.round((float)var16 + (float)var19 * 128.0F);
                              var112 = Math.round((float)var105 + (float)(var18 + 1) * 128.0F);
                              var7 = Math.round((float)var16 + (float)(var19 + 1) * 128.0F);
                              var113 = var99.Field1472;
                              if (var99.Field1472 == -1 || var113 == Rasterizer.Field9944) {
                                 var113 = Class128.Method1329(var102, var104, var99.Field1467 & '\uffff');
                              }

                              if (!Rasterizer.Field9945 && (Client.Field12068 <= 0 || !Rasterizer.Field9942 || Client.Field12068 > 0 && !Class585.Method8950(var113))) {
                                 var113 = -1;
                              }

                              this.Method1485(var2, var20, var21, var14, Rasterizer.Field9964[var99.Field1470 & '\uffff'], Rasterizer.Field9964[var99.Field1467 & '\uffff'], var113, true);
                              this.Method1485(var2, var20, var7, var14, Rasterizer.Field9964[var99.Field1471 & '\uffff'], Rasterizer.Field9964[var99.Field1467 & '\uffff'], var113, true);
                              this.Method1485(var2, var112, var21, var14, Rasterizer.Field9964[var99.Field1469 & '\uffff'], Rasterizer.Field9964[var99.Field1467 & '\uffff'], var113, true);
                              this.Method1485(var2, var112, var7, var14, Rasterizer.Field9964[var99.Field1468 & '\uffff'], Rasterizer.Field9964[var99.Field1467 & '\uffff'], var113, true);
                           }
                        }
                     }

                     if (var106.Field12847 != null) {
                        Class350 var100 = var106.Field12847;

                        for(var105 = 0; var105 < var100.Field2172.length; ++var105) {
                           if ((var16 = var100.Field2175 == null ? -1 : var100.Field2175[var105]) == -1 || var16 == Rasterizer.Field9944) {
                              var16 = Class128.Method1329(var102, var104, var100.Field2169[var105] & '\uffff');
                           }

                           if (!Rasterizer.Field9945 && (Client.Field12068 <= 0 || !Rasterizer.Field9942 || Client.Field12068 > 0 && !Class585.Method8950(var16))) {
                              var16 = -1;
                           }

                           int var107 = Rasterizer.Field9964[var100.Field2169[var105] & '\uffff'];
                           var18 = Rasterizer.Field9964[var100.Field2170[var105] & '\uffff'];
                           var19 = Rasterizer.Field9964[var100.Field2171[var105] & '\uffff'];
                           var20 = Rasterizer.Field9964[var100.Field2180 & '\uffff'];
                           var21 = var100.Field2172[var105];
                           var112 = var100.Field2173[var105];
                           var7 = var100.Field2174[var105];
                           var113 = var100.Field2166[var21];
                           var128 = var100.Field2167;
                           var24 = var100.Field2168[var21];
                           int var103 = var100.Field2166[var112];
                           var128 = var100.Field2167;
                           var25 = var100.Field2168[var112];
                           var128 = var100.Field2167;
                           var26 = var100.Field2166[var7];
                           var7 = var100.Field2168[var7];
                           this.Method1485(var2, var113, var24, var14, var107, var20, var16, false);
                           this.Method1485(var2, var103, var25, var14, var18, var20, var16, false);
                           this.Method1485(var2, var26, var7, var14, var19, var20, var16, false);
                        }
                     }
                  }
               }
            }

            return null;
         } else {
            var6 = false;
            boolean var11 = true;
            var12 = -1;
            int var13 = 0;
            var14 = 0;
            LinkedList var15 = new LinkedList();
            var16 = 0;

            while(var11) {
               ++var14;
               if (var14 != 1) {
                  var15.add(new int[]{var12, var13 * 3});
                  this.Field3159.add(var12);
                  var13 = 0;
               }

               var11 = false;
               boolean var17 = false;

               for(var18 = var3; var18 < var8; ++var18) {
                  Class501 var22;
                  for(var19 = var4; var19 < var5; ++var19) {
                     for(var21 = 0; var21 < 2 && (var22 = var2.Method8846(var1, var18, var19)) != null; ++var21) {
                        if (var21 == 1) {
                           var22 = var22.Field12852;
                        }

                        if (var22 == null) {
                           break;
                        }

                        Class353 var23 = var22.Field12846;
                        var24 = var22.Field12845;
                        int var27;
                        float var31;
                        float var32;
                        float var33;
                        float var34;
                        float var35;
                        float var36;
                        float var37;
                        float var38;
                        float var39;
                        int var43;
                        int var44;
                        int var45;
                        int var46;
                        int var47;
                        int var48;
                        int var49;
                        int var50;
                        if (var23 != null) {
                           var25 = var18 << 7;
                           var20 = var19 << 7;

                           for(float var29 = 0.0F; var29 < 1.0F; ++var29) {
                              for(float var30 = 0.0F; var30 < 1.0F; ++var30) {
                                 var31 = var29 + 0.0F;
                                 var32 = var30 + 0.0F;
                                 var33 = var29 + 1.0F;
                                 var34 = var30 + 1.0F;
                                 var35 = (var29 + 0.0F) * 128.0F;
                                 var36 = (var30 + 0.0F) * 128.0F;
                                 var37 = (var29 + 1.0F) * 128.0F;
                                 var38 = (var30 + 1.0F) * 128.0F;
                                 var39 = (float)var25 + var35;
                                 float var40 = (float)var20 + var36;
                                 float var41 = (float)var25 + var37;
                                 float var42 = (float)var20 + var38;
                                 var43 = var23.Field1472;
                                 if (var23.Field1472 == -1 || var43 == Rasterizer.Field9944) {
                                    var43 = Class128.Method1329(var18, var19, var23.Field1467 & '\uffff');
                                 }

                                 if (Rasterizer.Field9945 || Client.Field12068 > 0 && Rasterizer.Field9942 && (Client.Field12068 <= 0 || Class585.Method8950(var43))) {
                                    if (Class585.Method8950(var43)) {
                                       var128 = Rasterizer.Field9964;
                                       var43 = Class128.Method1330(var43);
                                    }
                                 } else {
                                    var43 = -1;
                                 }

                                 var44 = this.Method1486(var39, var40, var24, var43);
                                 var45 = this.Method1486(var39, var42, var24, var43);
                                 var46 = this.Method1486(var41, var40, var24, var43);
                                 var27 = this.Method1486(var41, var42, var24, var43);
                                 if (Rasterizer.Field9942 && Method1482(var43)) {
                                    var48 = this.Method1487(var39, var40, var24, Rasterizer.Field9964[var23.Field1471 & '\uffff']);
                                    var47 = this.Method1487(var39, var42, var24, Rasterizer.Field9964[var23.Field1468 & '\uffff']);
                                    var50 = this.Method1487(var41, var40, var24, Rasterizer.Field9964[var23.Field1470 & '\uffff']);
                                    var49 = this.Method1487(var41, var42, var24, Rasterizer.Field9964[var23.Field1469 & '\uffff']);
                                 } else {
                                    var47 = Rasterizer.Field9964[var23.Field1471 & '\uffff'];
                                    var48 = Rasterizer.Field9964[var23.Field1468 & '\uffff'];
                                    var49 = Rasterizer.Field9964[var23.Field1470 & '\uffff'];
                                    var50 = Rasterizer.Field9964[var23.Field1469 & '\uffff'];
                                 }

                                 if (var23.Field1471 <= 65535 && var23.Field1468 <= 65535 && var23.Field1470 <= 65535 && var23.Field1469 <= 65535 && var23.Field1471 >= 0 && var23.Field1468 >= 0 && var23.Field1470 >= 0 && var23.Field1469 >= 0) {
                                    if (!Client.normalMem && var23.Field1472 <= 50 && var47 == 1380625) {
                                       var50 = 8947848;
                                       var49 = 8947848;
                                       var48 = 8947848;
                                       var47 = 8947848;
                                       var43 = var23.Field1472;
                                    }

                                    float var64 = (float)var2.Field940[var24][var18][var19 + 1];
                                    float var65 = (float)var2.Field940[var24][var18][var19];
                                    float var66 = (float)var2.Field940[var24][var18 + 1][var19 + 1];
                                    float var67 = (float)var2.Field940[var24][var18 + 1][var19];
                                    if (var17 && var43 != var12) {
                                       var11 = true;
                                    } else if (this.Field3159.indexOf(var43) == -1) {
                                       if (Client.Field12068 > 0) {
                                          var65 += var2.Field924.Method8953(var24, var39, var40);
                                          var64 += var2.Field924.Method8953(var24, var39, var42);
                                          var67 += var2.Field924.Method8953(var24, var41, var40);
                                          var66 += var2.Field924.Method8953(var24, var41, var42);
                                       }

                                       var12 = var43;
                                       var17 = true;
                                       var13 += 2;
                                       int var68 = var47 >> 16 & 255;
                                       int var69 = var47 >> 8 & 255;
                                       int var70 = var47 & 255;
                                       int var71 = var48 >> 16 & 255;
                                       int var72 = var48 >> 8 & 255;
                                       int var73 = var48 & 255;
                                       int var74 = var49 >> 16 & 255;
                                       int var75 = var49 >> 8 & 255;
                                       int var76 = var49 & 255;
                                       int var77 = var50 >> 16 & 255;
                                       int var78 = var50 >> 8 & 255;
                                       int var79 = var50 & 255;
                                       this.Field1933.put(var41);
                                       this.Field1933.put(var66);
                                       this.Field1933.put(var42);
                                       this.Field1933.put(var39);
                                       this.Field1933.put(var64);
                                       this.Field1933.put(var42);
                                       this.Field1933.put(var39);
                                       this.Field1933.put(var65);
                                       this.Field1933.put(var40);
                                       this.Field1933.put(var41);
                                       this.Field1933.put(var66);
                                       this.Field1933.put(var42);
                                       this.Field1933.put(var39);
                                       this.Field1933.put(var65);
                                       this.Field1933.put(var40);
                                       this.Field1933.put(var41);
                                       this.Field1933.put(var67);
                                       this.Field1933.put(var40);
                                       this.Field1934.put((byte)var74);
                                       this.Field1934.put((byte)var75);
                                       this.Field1934.put((byte)var76);
                                       this.Field1934.put((byte)var27);
                                       this.Field1934.put((byte)var68);
                                       this.Field1934.put((byte)var69);
                                       this.Field1934.put((byte)var70);
                                       this.Field1934.put((byte)var45);
                                       this.Field1934.put((byte)var71);
                                       this.Field1934.put((byte)var72);
                                       this.Field1934.put((byte)var73);
                                       this.Field1934.put((byte)var44);
                                       this.Field1934.put((byte)var74);
                                       this.Field1934.put((byte)var75);
                                       this.Field1934.put((byte)var76);
                                       this.Field1934.put((byte)var27);
                                       this.Field1934.put((byte)var71);
                                       this.Field1934.put((byte)var72);
                                       this.Field1934.put((byte)var73);
                                       this.Field1934.put((byte)var44);
                                       this.Field1934.put((byte)var77);
                                       this.Field1934.put((byte)var78);
                                       this.Field1934.put((byte)var79);
                                       this.Field1934.put((byte)var46);
                                       this.Field1935.put(var33);
                                       this.Field1935.put(var32);
                                       this.Field1935.put(var31);
                                       this.Field1935.put(var32);
                                       this.Field1935.put(var31);
                                       this.Field1935.put(var34);
                                       this.Field1935.put(var33);
                                       this.Field1935.put(var32);
                                       this.Field1935.put(var31);
                                       this.Field1935.put(var34);
                                       this.Field1935.put(var33);
                                       this.Field1935.put(var34);
                                       var6 = true;
                                       var16 += 2;
                                    }
                                 }
                              }
                           }
                        }

                        Class350[] var111 = new Class350[]{var22.Field12847, null};

                        for(var26 = 0; var26 < 2; ++var26) {
                           Class350 var108;
                           if ((var108 = var111[var26]) != null) {
                              for(var25 = 0; var25 < var108.Field2172.length; ++var25) {
                                 if (var108.Field2169[var25] <= 65535 && var108.Field2170[var25] <= 65535 && var108.Field2171[var25] <= 65535 && var108.Field2169[var25] >= 0 && var108.Field2170[var25] >= 0 && var108.Field2171[var25] >= 0) {
                                    if ((var27 = var108.Field2175 == null ? -1 : var108.Field2175[var25]) == -1 || var27 == Rasterizer.Field9944) {
                                       var27 = Class128.Method1329(var18, var19, var108.Field2169[var25] & '\uffff');
                                    }

                                    if (!Rasterizer.Field9945 && (Client.Field12068 <= 0 || !Rasterizer.Field9942 || Client.Field12068 > 0 && !Class585.Method8950(var27))) {
                                       var27 = -1;
                                    } else if (Class585.Method8950(var27)) {
                                       var128 = Rasterizer.Field9964;
                                       var128 = var108.Field2169;
                                       var27 = Class128.Method1330(var27);
                                    }

                                    int var28 = var108.Field2172[var25];
                                    int var114 = var108.Field2173[var25];
                                    int var115 = var108.Field2174[var25];
                                    var31 = (float)var108.Field2166[var28];
                                    var32 = (float)var108.Field2167[var28];
                                    var33 = (float)var108.Field2168[var28];
                                    var34 = (float)var108.Field2166[var114];
                                    var35 = (float)var108.Field2167[var114];
                                    var36 = (float)var108.Field2168[var114];
                                    var37 = (float)var108.Field2167[var115];
                                    var38 = (float)var108.Field2166[var115];
                                    var39 = (float)var108.Field2168[var115];
                                    int var116 = this.Method1486(var31, var33, var24, var27);
                                    int var117 = this.Method1486(var34, var36, var24, var27);
                                    int var118 = this.Method1486(var38, var39, var24, var27);
                                    if (Rasterizer.Field9942 && Method1482(var108.Field2175 == null ? -1 : var108.Field2175[var25])) {
                                       var43 = this.Method1487(var31, var33, var24, Rasterizer.Field9964[var108.Field2169[var25] & '\uffff']);
                                       var44 = this.Method1487(var34, var36, var24, Rasterizer.Field9964[var108.Field2170[var25] & '\uffff']);
                                       var45 = this.Method1487(var38, var39, var24, Rasterizer.Field9964[var108.Field2171[var25] & '\uffff']);
                                    } else {
                                       var43 = Rasterizer.Field9964[var108.Field2169[var25] & '\uffff'];
                                       var44 = Rasterizer.Field9964[var108.Field2170[var25] & '\uffff'];
                                       var45 = Rasterizer.Field9964[var108.Field2171[var25] & '\uffff'];
                                    }

                                    if (!Client.normalMem && (var46 = var108.Field2175 == null ? 9999 : var108.Field2175[var25]) <= 50 && var43 == 1380625) {
                                       var45 = 8947848;
                                       var44 = 8947848;
                                       var43 = 8947848;
                                       var27 = var46;
                                    }

                                    if (var17 && var27 != var12) {
                                       var11 = true;
                                    } else if (this.Field3159.indexOf(var27) == -1) {
                                       if (Client.Field12068 > 0) {
                                          var32 += var2.Field924.Method8953(var24, var31, var33);
                                          var35 += var2.Field924.Method8953(var24, var34, var36);
                                          var37 += var2.Field924.Method8953(var24, var38, var39);
                                       }

                                       var12 = var27;
                                       var17 = true;
                                       ++var13;
                                       var46 = var43 >> 16 & 255;
                                       var27 = var43 >> 8 & 255;
                                       var47 = var43 & 255;
                                       var48 = var44 >> 16 & 255;
                                       var49 = var44 >> 8 & 255;
                                       var50 = var44 & 255;
                                       int var51 = var45 >> 16 & 255;
                                       int var119 = var45 >> 8 & 255;
                                       int var120 = var45 & 255;
                                       this.Field1933.put(var31);
                                       this.Field1933.put(var32);
                                       this.Field1933.put(var33);
                                       this.Field1933.put(var34);
                                       this.Field1933.put(var35);
                                       this.Field1933.put(var36);
                                       this.Field1933.put(var38);
                                       this.Field1933.put(var37);
                                       this.Field1933.put(var39);
                                       this.Field1934.put((byte)var46);
                                       this.Field1934.put((byte)var27);
                                       this.Field1934.put((byte)var47);
                                       this.Field1934.put((byte)var116);
                                       this.Field1934.put((byte)var48);
                                       this.Field1934.put((byte)var49);
                                       this.Field1934.put((byte)var50);
                                       this.Field1934.put((byte)var117);
                                       this.Field1934.put((byte)var51);
                                       this.Field1934.put((byte)var119);
                                       this.Field1934.put((byte)var120);
                                       this.Field1934.put((byte)var118);
                                       float var121 = (float)var108.Field2166[0];
                                       float var122 = (float)var108.Field2168[0];
                                       float var123 = (float)var108.Field2166[1] - var121;
                                       float var124 = (float)var108.Field2168[1] - var122;
                                       float var125 = (float)var108.Field2166[3] - var121;
                                       float var126 = (float)var108.Field2168[3] - var122;
                                       float var127 = (float)var108.Field2166[var28] - var121;
                                       float var80 = (float)var108.Field2168[var28] - var122;
                                       float var81 = (float)var108.Field2166[var114] - var121;
                                       float var82 = (float)var108.Field2168[var114] - var122;
                                       float var83 = (float)var108.Field2166[var115] - var121;
                                       float var84 = (float)var108.Field2168[var115] - var122;
                                       float var85 = var126 * 0.0F - var124 * 0.0F;
                                       float var86 = var124 * var125 - var123 * var126;
                                       float var87 = var123 * 0.0F - var125 * 0.0F;
                                       float var88 = var87 * 0.0F - var126 * var86;
                                       float var89 = var126 * var85 - var125 * var87;
                                       float var90 = var125 * var86 - var85 * 0.0F;
                                       float var91 = 1.0F / (var88 * var123 + var89 * 0.0F + var90 * var124);
                                       float var92 = (var88 * var127 + var89 * 0.0F + var90 * var80) * var91;
                                       float var93 = (var88 * var81 + var89 * 0.0F + var90 * var82) * var91;
                                       float var94 = (var88 * var83 + var89 * 0.0F + var90 * var84) * var91;
                                       var88 = var87 * 0.0F - var124 * var86;
                                       var89 = var124 * var85 - var123 * var87;
                                       var90 = var123 * var86 - var85 * 0.0F;
                                       var91 = 1.0F / (var88 * var125 + var89 * 0.0F + var90 * var126);
                                       float var95 = (var88 * var127 + var89 * 0.0F + var90 * var80) * var91;
                                       float var96 = (var88 * var81 + var89 * 0.0F + var90 * var82) * var91;
                                       float var97 = (var88 * var83 + var89 * 0.0F + var90 * var84) * var91;
                                       if (var92 < 0.0F) {
                                          var92 = 0.0F;
                                       }

                                       if (var92 > 1.0F) {
                                          var92 = 1.0F;
                                       }

                                       if (var93 < 0.0F) {
                                          var93 = 0.0F;
                                       }

                                       if (var93 > 1.0F) {
                                          var93 = 1.0F;
                                       }

                                       if (var94 < 0.0F) {
                                          var94 = 0.0F;
                                       }

                                       if (var94 > 1.0F) {
                                          var94 = 1.0F;
                                       }

                                       if (var95 < 0.0F) {
                                          var95 = 0.0F;
                                       }

                                       if (var95 > 1.0F) {
                                          var95 = 1.0F;
                                       }

                                       if (var96 < 0.0F) {
                                          var96 = 0.0F;
                                       }

                                       if (var96 > 1.0F) {
                                          var96 = 1.0F;
                                       }

                                       if (var97 < 0.0F) {
                                          var97 = 0.0F;
                                       }

                                       if (var97 > 1.0F) {
                                          var97 = 1.0F;
                                       }

                                       this.Field1935.put(var92);
                                       this.Field1935.put(1.0F - var95);
                                       this.Field1935.put(var93);
                                       this.Field1935.put(1.0F - var96);
                                       this.Field1935.put(var94);
                                       this.Field1935.put(1.0F - var97);
                                       var6 = true;
                                       var16 += var22.Field12847.Field2166.length;
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }
               }

               if (var13 > 0) {
                  var15.add(new int[]{var12, var13 * 3});
                  this.Field3159.add(var12);
                  var13 = 0;
               }
            }

            this.Field1933.flip();
            this.Field1934.flip();
            this.Field1935.flip();
            var20 = 0;
            if (var101 == null) {
               byte var109 = 2;
               if (var6) {
                  var109 = 3;
               }

               int[] var110;
               var18 = (var110 = Class842.Method13977(var109))[0];
               var19 = var110[1];
               if (var6) {
                  var20 = var110[2];
               }
            } else {
               var18 = var101.Method12370();
               var19 = var101.Method12371();
               var20 = var101.Method12375();
            }

            this.Method12368(var101, var18, var19, var20, var6, 35044);
            GraphicsDisplay.Method997().Method1035("error in loadFloor(" + var9 + ", " + var18 + ", " + var19 + ")");
            if (var101 == null) {
               var101 = new ModelVBO(var3, var4, true);
               Class843.Method13999(var9, var101);
            }

            var101.Method12377(var18, var19, var20, var16, var9, false, -1, false, var15);
            return var101;
         }
      }
   }

   public static int Method1491(int var0, boolean var1, boolean var2) {
      if (!var1 && var2) {
         float var6 = (float)(var0 >> 16 & 255);
         float var3 = (float)(var0 >> 8 & 255);
         float var4 = (float)(var0 & 255);
         float var5 = var1 ? 1.0F : 1.15F;
         var6 *= var5;
         var3 *= var5;
         var4 *= var5;
         if (var6 > 255.0F) {
            var6 = 255.0F;
         }

         if (var3 > 255.0F) {
            var3 = 255.0F;
         }

         if (var4 > 255.0F) {
            var4 = 255.0F;
         }

         return ((int)var6 << 16) + ((int)var3 << 8) + (int)var4;
      } else {
         return var0;
      }
   }

   public ModelVBO Method10106(Class358 var1, boolean var2) {
      Model var3 = var1.Method4191();
      long var4 = var1.Method4192();
      int var6 = var1.Method4193();
      float var10000 = GraphicsDisplay.Field2687;
      boolean var7 = var1.Method4194();
      boolean var8 = var1.Method4195();
      var1.Method4196();
      if (var8) {
         var4 = (var4 >>= 14) << 14;
      }

      this.Method12366();
      ModelVBO var39;
      if ((var39 = (ModelVBO)Class843.Method13998().get(var4)) != null && !var7) {
         return var39;
      } else {
         boolean var9 = true;
         int var10 = 0;
         int var11 = 0;
         int var12 = 0;
         boolean var13 = false;
         LinkedList var14 = new LinkedList();

         int var16;
         int var17;
         int var18;
         while(var9) {
            ++var12;
            if (var12 != 1) {
               var14.add(new int[]{var10, var11 * 3});
               this.Field3159.add(var10);
               var11 = 0;
            }

            var9 = false;
            boolean var15 = false;

            for(var16 = 0; var16 < var3.Field2818; ++var16) {
               var17 = var3.Field2833 != null && var16 < var3.Field2833.length ? var3.Field2833[var16] : 0;
               boolean var21 = false;
               int var22;
               if ((var22 = var3.Field2835 != null && var16 < var3.Field2835.length ? 255 - var3.Field2835[var16] : 255) > 255) {
                  var22 = 255;
               }

               if (var22 < 255) {
                  var13 = true;
               }

               var18 = var3.Field2819[var16];
               int var19 = var3.Field2820[var16];
               int var20 = var3.Field2821[var16];
               float var23 = var2 ? Model.Field2863[Model.Field2798][var18] : var3.Method14529(var18);
               float var24 = var2 ? Model.Field2864[Model.Field2798][var18] : var3.Method14530(var18);
               float var25 = var2 ? Model.Field2865[Model.Field2798][var18] : var3.Method14532(var18);
               float var26 = var2 ? Model.Field2863[Model.Field2798][var18] : var3.Method14529(var19);
               float var27 = var2 ? Model.Field2864[Model.Field2798][var18] : var3.Method14530(var19);
               float var28 = var2 ? Model.Field2865[Model.Field2798][var18] : var3.Method14532(var19);
               float var29 = var2 ? Model.Field2863[Model.Field2798][var18] : var3.Method14529(var20);
               float var30 = var2 ? Model.Field2864[Model.Field2798][var18] : var3.Method14530(var20);
               float var31 = var2 ? Model.Field2865[Model.Field2798][var18] : var3.Method14532(var20);
               if (var2) {
                  var25 += 0.0F;
                  var28 += 0.0F;
                  var31 += 0.0F;
               }

               int var32;
               if (var17 == 1 && var3.Field2830 == null) {
                  var18 = var19 = var20 = Method1491(Rasterizer.Field9964[var3.Field2836[var16]], var7, false);
                  var32 = var3.Field2836[var16];
               } else {
                  var18 = Method1491(Rasterizer.Field9964[var3.Field2830[var16]], var7, false);
                  var19 = Method1491(Rasterizer.Field9964[var3.Field2831[var16]], var7, false);
                  var20 = Method1491(Rasterizer.Field9964[var3.Field2832[var16]], var7, false);
                  var32 = var3.Field2830[var16];
                  if (var19 <= 1) {
                     var19 = var18;
                  }

                  if (var20 <= 1) {
                     var20 = var18;
                  }
               }

               if (var22 == 130 && var32 >= 32798 && var32 <= 32870) {
                  if (var32 == 32863) {
                     var22 = 0;
                  } else if (var32 == 32829) {
                     var22 = 0;
                  } else if (var32 == 32817) {
                     var22 = 0;
                  } else if (var32 == 32864) {
                     var22 = 0;
                  } else if (var32 == 32800) {
                     var22 = 0;
                  } else if (var32 == 32858) {
                     var22 = 0;
                  } else if (var32 == 32822) {
                     var22 = 0;
                  } else if (var32 == 32798) {
                     var22 = 0;
                  }
               }

               if ((var32 = var3.Field2775 == null ? 0 : var3.Field2775[var16]) >= 0 && var3.Field2774 != null && var32 < var3.Field2774.length) {
                  byte[] var51 = var3.Field2774;
               }

               int[] var52;
               if (var3.Field2839 != null) {
                  var52 = var3.Field2839;
               }

               var32 = var3.Field2776 != null ? var3.Field2776[var16] : -1;
               boolean var33 = false;
               if ((var3.Field2836[var16] <= 50 || var3.Field2775 != null && var16 < var3.Field2775.length && var3.Field2775[var16] != -1) && var32 == 0 && var3.Field2836[var16] <= 50 && var3.Field2776 == null) {
                  var32 = var3.Field2836[var16];
                  var33 = true;
               }

               if (var32 <= 0 && var3.Field2836[var16] <= 50 && var17 != 0) {
                  var32 = var3.Field2836[var16];
               }

               if (var32 == 0) {
                  var52 = var3.Field2836;
               }

               Class120 var41 = null;
               if (var32 >= 0) {
                  var41 = Class120.Field9548[var32];
               }

               if (var32 >= 0) {
                  var21 = Texture.Field1929[var32] || var32 <= 50;
               }

               if (var41 != null && var41.Field9529 && var32 > 0) {
                  var21 = true;
                  if (var32 != 922) {
                     var33 = true;
                  }
               }

               if (!var21 && !Rasterizer.Field9947 && var32 >= 0 && !Texture.Field1929[var32]) {
                  var33 = false;
                  var32 = -1;
               }

               if (var7 && !var21) {
                  var32 = -1;
               }

               if (var32 == 922) {
                  var22 = Rasterizer.Field9947 ? 150 : 180;
               }

               if (var32 == 970) {
                  var32 = -1;
               }

               if (var15 && var32 != var10) {
                  var9 = true;
               } else if (this.Field3159.indexOf(var32) == -1) {
                  if (var33 && var32 != -1) {
                     var20 = 16777215;
                     var19 = 16777215;
                     var18 = 16777215;
                  }

                  var10 = var32;
                  var15 = true;
                  ++var11;
                  float var46;
                  if (var3.Field2834 != null) {
                     var17 = var3.Field2834[var16];
                     var46 = 0.0F;
                     if (var17 == 0) {
                        var46 = -0.05F;
                     }

                     var24 -= var46;
                     var27 -= var46;
                     var30 -= var46;
                     var23 += var46;
                     var26 += var46;
                     var29 += var46;
                     var25 -= var46;
                     var28 -= var46;
                     var31 -= var46;
                  }

                  var17 = var18 >> 16 & 255;
                  int var49 = var18 >> 8 & 255;
                  var18 &= 255;
                  int var34 = var19 >> 16 & 255;
                  int var35 = var19 >> 8 & 255;
                  var19 &= 255;
                  int var37 = var20 >> 16 & 255;
                  int var38 = var20 >> 8 & 255;
                  var20 &= 255;
                  this.Field1933.put(var23);
                  this.Field1933.put(var24);
                  this.Field1933.put(var25);
                  this.Field1933.put(var26);
                  this.Field1933.put(var27);
                  this.Field1933.put(var28);
                  this.Field1933.put(var29);
                  this.Field1933.put(var30);
                  this.Field1933.put(var31);
                  this.Field1934.put((byte)var17);
                  this.Field1934.put((byte)var49);
                  this.Field1934.put((byte)var18);
                  this.Field1934.put((byte)var22);
                  this.Field1934.put((byte)var34);
                  this.Field1934.put((byte)var35);
                  this.Field1934.put((byte)var19);
                  this.Field1934.put((byte)var22);
                  this.Field1934.put((byte)var37);
                  this.Field1934.put((byte)var38);
                  this.Field1934.put((byte)var20);
                  this.Field1934.put((byte)var22);
                  if (var32 != var32) {
                     var9 = true;
                  } else if (var3.Field2759 != null && var32 > 0) {
                     float var42 = var3.Field2759[var16][0];
                     float var43 = var3.Field2759[var16][1];
                     float var45 = var3.Field2759[var16][2];
                     float var47 = var3.Field2759[var16][3];
                     var46 = var3.Field2759[var16][4];
                     float var50 = var3.Field2759[var16][5];
                     this.Method1493(var42, var43, var45, var47, var46, var50);
                  } else {
                     this.Method1493(0.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F);
                  }
               }
            }

            if (var11 > 0) {
               var14.add(new int[]{var10, var11 * 3});
               this.Field3159.add(var10);
               var11 = 0;
            }
         }

         this.Field1933.flip();
         this.Field1934.flip();
         this.Field1935.flip();
         char var40 = '裤';
         if (var7) {
            var40 = '裨';
         }

         boolean var44 = false;
         if (var39 == null) {
            int[] var48;
            var16 = (var48 = Class842.Method13977(3))[0];
            var17 = var48[1];
            var18 = var48[2];
         } else {
            var16 = var39.Method12370();
            var17 = var39.Method12371();
            var18 = var39.Method12375();
         }

         this.Method12368(var39, var16, var17, var18, true, var40);
         GraphicsDisplay.Method997().Method1035("error in loadModel(" + var4 + ", " + var16 + ", " + var17 + ", " + var18 + ", true" + ")");
         if (var39 == null) {
            var39 = new ModelVBO(var1.Method4197(), var1.Method4198(), var1.Method4201());
            Class843.Method13997(var4, var39);
         }

         var39.Method12377(var16, var17, var18, var3.Field2818, var4, var7, var6, var13, var14);
         return var39;
      }
   }

   private void Method1493(float var1, float var2, float var3, float var4, float var5, float var6) {
      this.Field1935.put(var1);
      this.Field1935.put(var2);
      this.Field1935.put(var3);
      this.Field1935.put(var4);
      this.Field1935.put(var5);
      this.Field1935.put(var6);
   }
}
