package net.LWJGLClient.client.b.b.b.a.a;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import net.LWJGLClient.client.model.a.d.Class449;
import net.LWJGLClient.client.a.Class128;
import net.LWJGLClient.client.a.d.Class120;
import net.LWJGLClient.client.b.Rasterizer;
import net.LWJGLClient.client.b.b.GraphicsDisplay;
import net.LWJGLClient.client.b.b.b.Class745;
import net.LWJGLClient.client.b.b.b.a.Texture;
import net.LWJGLClient.client.b.b.b.a.ModelVBO;
import net.LWJGLClient.client.b.b.b.a.b.ModelLoader;
import net.LWJGLClient.client.b.b.b.a.c.Class585;
import net.LWJGLClient.client.b.b.e.Class356;
import net.LWJGLClient.client.b.b.e.Class358;
import net.LWJGLClient.client.b.b.f.Class838;
import net.LWJGLClient.client.b.b.f.Class842;
import net.LWJGLClient.client.b.b.f.Class843;
import net.LWJGLClient.client.b.b.f.c.Class601;
import net.LWJGLClient.client.d.SceneGraph;
import net.LWJGLClient.client.e.d.Class350;
import net.LWJGLClient.client.e.d.Class353;
import net.LWJGLClient.client.model.Client;
import net.LWJGLClient.client.model.Model;
import net.LWJGLClient.client.model.a.a.Class501;
import net.LWJGLClient.client.model.a.d.ParticleDefinition;
import net.LWJGLClient.client.model.a.d.Class453;
import net.LWJGLClient.client.model.f.TextureData;

public final class AtlasModelLoader extends ModelLoader {
   private Class601 Field11981 = null;
   private int Field11982 = 0;
   private int Field11983 = 0;
   private int Field11984 = 0;
   private int Field11985 = 0;
   private boolean Field11986 = false;
   private List Field11987 = null;
   private static int Field11988 = 225;
   private Map Field11989 = new HashMap();
   private Map Field11990 = new HashMap();
   private static int Field11991 = 4;
   public int Field11992 = 0;
   private int Field11993 = 0;
   public int Field11994 = 0;
   public int Field11995 = 0;

   private static double Method10095(double var0, int var2, boolean var3, boolean var4) {
      if (var2 > 0 && Texture.Field1931[var2]) {
         return var0;
      } else {
         boolean var10000 = Class843.Field3772;
         if (var4) {
            if (var0 < 0.5D) {
               var0 += 0.025D;
            } else {
               var0 -= 0.025D;
            }

            return var0;
         } else {
            double var5 = 0.01D;
            if (var2 > 0) {
               Class120 var7 = Class120.Field9548[var2];
               if (Class120.Field9549[var2]) {
                  var5 = 0.025D;
               } else if (var7 != null && var7.Field9547 == 0) {
                  var5 = 0.025D;
               }
            }

            if (var2 > 0 && Texture.Field1930[var2]) {
               var5 = 0.05D;
            }

            var10000 = Class843.Field3772;
            if (var2 == 91) {
               var5 = 0.05D;
            }

            if (var3 || var2 == Field11988 || var2 <= 0) {
               var5 = 0.25D;
            }

            if (var2 == 970 || var2 == 921 || var2 == -1) {
               var5 = 0.30000001192092896D;
            }

            if (var0 >= 0.5D) {
               var0 -= var5;
            } else {
               var0 += var5;
            }

            return var0;
         }
      }
   }

   private void Method10096(Class601 var1, int var2, float var3, float var4, float var5, float var6, float var7, float var8, boolean var9) {
      Class601 var10001 = var1;
      double var10003 = (double)var3;
      double var10004 = (double)var4;
      double var10005 = (double)var5;
      double var10006 = (double)var6;
      double var10007 = (double)var7;
      double var10008 = (double)var8;
      boolean var33 = false;
      double var23 = var10008;
      double var21 = var10007;
      double var19 = var10006;
      double var17 = var10005;
      double var15 = var10004;
      double var13 = var10003;
      int var36 = var2;
      Class601 var34 = var10001;
      if (var34 != null) {
         double var27;
         Class843.Field3773 = (float)((var27 = (double)(var34.Method9135() / 2)) * 128.0D);
         double var29 = 0.0D;
         double var31 = 0.0D;
         int[] var35;
         if ((var35 = var34.Method9138((long)var36)) != null) {
            var29 = ((double)var35[0] + 0.5D) / (var27 * 128.0D);
            var31 = ((double)var35[1] + 0.5D) / (var27 * 128.0D);
         }

         var13 = Method10095(var13, var36, false, var9) / var27;
         var17 = Method10095(var17, var36, false, var9) / var27;
         var21 = Method10095(var21, var36, false, var9) / var27;
         var15 = Method10095(var15, var36, false, var9) / var27;
         var19 = Method10095(var19, var36, false, var9) / var27;
         var23 = Method10095(var23, var36, false, var9) / var27;
         var13 += var29;
         var17 += var29;
         var21 += var29;
         var15 += var31;
         var19 += var31;
         var23 += var31;
         this.Field1935.put((float)var13); //map - class b.c
         this.Field1935.put((float)var15);
         this.Field1935.put((float)var17);
         this.Field1935.put((float)var19);
         this.Field1935.put((float)var21);
         this.Field1935.put((float)var23);
      } else {
         (new Throwable("[AtlasModelLoader]: atlas null for " + (var9 ? "floor" : "model") + " texture: " + var36)).printStackTrace();
         this.Field1935.put(0.0F);
         this.Field1935.put(0.0F);
         this.Field1935.put(0.0F);
         this.Field1935.put(0.0F);
         this.Field1935.put(0.0F);
         this.Field1935.put(0.0F);
      }
   }

   private void Method10097(boolean var1, List var2) {
      this.Field11981 = null;
      this.Field11982 = -1;
      this.Field11983 = -1;
      this.Field11984 = 0;
      this.Field11986 = false;
   }

   public final ModelVBO Method10098(int var1, SceneGraph var2, int var3, int var4, int var5, boolean var6) {
      if (var6) {
         var2.Field924.Method8959(false);
      }

      if (var2.Field940 == null) {
         System.err.println("[AtlasModelLoader]: heights null");
         return null;
      } else {
         this.Field3156 = true; //bool
         this.Method12366();
         long var7 = Method1480((long)var1, (long)var3, (long)var4);
         ModelVBO var9;
         if ((var9 = (ModelVBO)Class843.Method14000().get(var7)) != null) {
            return var9;
         } else {
            int var10;
            if ((var10 = var3 + var5) > SceneGraph.mapSizeWidth) {
               var10 = SceneGraph.mapSizeWidth;
            }

            if ((var5 += var4) > SceneGraph.mapSizeWidth) {
               var5 = SceneGraph.mapSizeWidth;
            }

            this.Method10097(true, (List)null);
            this.Field11987 = new LinkedList();
            boolean var11 = false;

            int var13;
            int var14;
            for(int var12 = var3; var12 < var10; ++var12) {
               Class501 var15;
               for(var13 = var4; var13 < var5; ++var13) {
                  for(var14 = 0; var14 < 2 && (var15 = var2.Method8846(var1, var12, var13)) != null; ++var14) {
                     if (var14 == 1) {
                        var15 = var15.Field12852;
                     }

                     if (var15 == null) {
                        break;
                     }

                     Class585 var10000;
                     int var17;
                     int[] var10001;
                     int var18;
                     float var20;
                     float var21;
                     float var22;
                     float var23;
                     float var26;
                     float var27;
                     float var28;
                     int var30;
                     int var31;
                     int var32;
                     int var33;
                     int var34;
                     int var35;
                     int var36;
                     int var37;
                     int var38;
                     int var39;
                     int var40;
                     int var41;
                     int var77;
                     float var88;
                     if (var15.Field12846 != null) {
                        Class353 var16 = var15.Field12846;
                        if (var15.Field12846.Field1471 > 65535 || var16.Field1468 > 65535 || var16.Field1470 > 65535 || var16.Field1469 > 65535 || var16.Field1471 < 0 || var16.Field1468 < 0 || var16.Field1470 < 0 || var16.Field1469 < 0) {
                           continue;
                        }

                        var17 = var12 << 7;
                        var18 = var13 << 7;
                        this.Field11983 = var16.Field1472;
                        if (this.Field11983 == -1 || this.Field11983 == Rasterizer.Field9944) {
                           this.Field11983 = Class128.Method1329(var12, var13, var16.Field1467 & '\uffff');
                        }

                        if (!Rasterizer.Field9945) {
                           label342: {
                              if (Client.Field12068 > 0 && Rasterizer.Field9942) {
                                 if (Client.Field12068 <= 0) {
                                    break label342;
                                 }

                                 var10000 = var2.Field924;
                                 if (Class585.Method8950(this.Field11983)) {
                                    break label342;
                                 }
                              }

                              this.Field11983 = -1;
                           }
                        }

                        var20 = (float)var17;
                        var21 = (float)(var17 + 128);
                        var22 = (float)var18;
                        var23 = (float)(var18 + 128);
                        if (var6) {
                           //could be wrong
                           this.Method1484(var2, (int)var20, (int)var22, var15.Field12845, Rasterizer.Field9964[var16.Field1470 & '\uffff'], this.Field11983, true);
                           this.Method1484(var2, (int)var20, (int)var23, var15.Field12845, Rasterizer.Field9964[var16.Field1471 & '\uffff'], this.Field11983, true);
                           this.Method1484(var2, (int)var21, (int)var22, var15.Field12845, Rasterizer.Field9964[var16.Field1469 & '\uffff'], this.Field11983, true);
                           this.Method1484(var2, (int)var21, (int)var23, var15.Field12845, Rasterizer.Field9964[var16.Field1468 & '\uffff'], this.Field11983, true);
                           continue;
                        }

                        var10000 = var2.Field924;
                        if (Class585.Method8950(this.Field11983)) {
                           var10001 = Rasterizer.Field9964;
                           this.Field11983 = Class128.Method1330(this.Field11983);
                        }

                        if (this.Field11983 != this.Field11982 || this.Field11981 == null) {
                           if (this.Field11981 == null) {
                              this.Field11981 = Class843.Field3769.Method9127(true, this.Field11983);
                           }

                           Class601 var24;
                           if ((var24 = Class843.Field3769.Method9127(true, this.Field11983)).Method9150() != this.Field11981.Method9150()) {
                              int var25 = this.Field11983 <= 0 ? 0 : this.Field11981.Method9137();
                              this.Field11987.add(new int[]{var25, this.Field11984 * 3});
                              this.Field11984 = 0;
                              this.Field11981 = var24;
                           }

                           this.Field11982 = this.Field11983;
                        }

                        int var86 = var15.Field12845;
                        var88 = (float)var2.Field940[var86][var12][var13 + 1];
                        var26 = (float)var2.Field940[var86][var12][var13];
                        var27 = (float)var2.Field940[var86][var12 + 1][var13 + 1];
                        var28 = (float)var2.Field940[var86][var12 + 1][var13];
                        int var29 = this.Method1486(var20, var22, var15.Field12845, this.Field11983);
                        var30 = this.Method1486(var20, var23, var15.Field12845, this.Field11983);
                        var31 = this.Method1486(var21, var22, var15.Field12845, this.Field11983);
                        var32 = this.Method1486(var21, var23, var15.Field12845, this.Field11983);
                        if (Rasterizer.Field9942 && Method1482(this.Field11983)) {
                           //could be wrong
                           var33 = this.Method1486(var20, var22, var15.Field12845, Rasterizer.Field9964[var16.Field1471 & '\uffff']);
                           var77 = this.Method1486(var20, var23, var15.Field12845, Rasterizer.Field9964[var16.Field1468 & '\uffff']);
                           var35 = this.Method1486(var21, var22, var15.Field12845, Rasterizer.Field9964[var16.Field1470 & '\uffff']);
                           var34 = this.Method1486(var21, var23, var15.Field12845, Rasterizer.Field9964[var16.Field1469 & '\uffff']);
                        } else {
                           //was guessed
                           var77 = Method1491(Rasterizer.Field9964[var16.Field1471 & '\uffff'], false, true);
                           var33 = Method1491(Rasterizer.Field9964[var16.Field1468 & '\uffff'], false, true);
                           var34 = Method1491(Rasterizer.Field9964[var16.Field1470 & '\uffff'], false, true);
                           var35 = Method1491(Rasterizer.Field9964[var16.Field1469 & '\uffff'], false, true);
                        }

                        if (Client.Field12068 > 0) {
                           var26 += var2.Field924.Method8953(var15.Field12845, var20, var22);
                           var88 += var2.Field924.Method8953(var15.Field12845, var20, var23);
                           var28 += var2.Field924.Method8953(var15.Field12845, var21, var22);
                           var27 += var2.Field924.Method8953(var15.Field12845, var21, var23);
                        }

                        this.Field11984 += 2;
                        this.Field11985 += 2;
                        var36 = var77 >> 16 & 255;
                        var37 = var77 >> 8 & 255;
                        var77 &= 255;
                        var38 = var33 >> 16 & 255;
                        var39 = var33 >> 8 & 255;
                        var33 &= 255;
                        var40 = var34 >> 16 & 255;
                        var41 = var34 >> 8 & 255;
                        int var80 = var34 & 255;
                        var17 = var35 >> 16 & 255;
                        var18 = var35 >> 8 & 255;
                        var86 = var35 & 255;
                        this.Field1933.put(var21);
                        this.Field1933.put(var27);
                        this.Field1933.put(var23);
                        this.Field1933.put(var20);
                        this.Field1933.put(var88);
                        this.Field1933.put(var23);
                        this.Field1933.put(var20);
                        this.Field1933.put(var26);
                        this.Field1933.put(var22);
                        this.Field1933.put(var21);
                        this.Field1933.put(var27);
                        this.Field1933.put(var23);
                        this.Field1933.put(var20);
                        this.Field1933.put(var26);
                        this.Field1933.put(var22);
                        this.Field1933.put(var21);
                        this.Field1933.put(var28);
                        this.Field1933.put(var22);
                        this.Field1934.put((byte)var40);
                        this.Field1934.put((byte)var41);
                        this.Field1934.put((byte)var80);
                        this.Field1934.put((byte)var32);
                        this.Field1934.put((byte)var36);
                        this.Field1934.put((byte)var37);
                        this.Field1934.put((byte)var77);
                        this.Field1934.put((byte)var30);
                        this.Field1934.put((byte)var38);
                        this.Field1934.put((byte)var39);
                        this.Field1934.put((byte)var33);
                        this.Field1934.put((byte)var29);
                        this.Field1934.put((byte)var40);
                        this.Field1934.put((byte)var41);
                        this.Field1934.put((byte)var80);
                        this.Field1934.put((byte)var32);
                        this.Field1934.put((byte)var38);
                        this.Field1934.put((byte)var39);
                        this.Field1934.put((byte)var33);
                        this.Field1934.put((byte)var29);
                        this.Field1934.put((byte)var17);
                        this.Field1934.put((byte)var18);
                        this.Field1934.put((byte)var86);
                        this.Field1934.put((byte)var31);
                        this.Method10096(this.Field11981, this.Field11983, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, true);
                        this.Method10096(this.Field11981, this.Field11983, 1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, true);
                        var11 = true;
                     }

                     if (var15.Field12847 != null) {
                        Class350 var81 = var15.Field12847;

                        for(var17 = 0; var17 < var81.Field2172.length; ++var17) {
                           if (var81.Field2169[var17] <= 65535 && var81.Field2170[var17] <= 65535 && var81.Field2171[var17] <= 65535 && var81.Field2169[var17] >= 0 && var81.Field2170[var17] >= 0 && var81.Field2171[var17] >= 0) {
                              this.Field11983 = var81.Field2175 == null ? -1 : var81.Field2175[var17];
                              if (this.Field11983 == -1 || this.Field11983 == Rasterizer.Field9944) {
                                 this.Field11983 = Class128.Method1329(var12, var13, var81.Field2169[var17] & '\uffff');
                              }

                              if (!Rasterizer.Field9945) {
                                 label276: {
                                    if (Client.Field12068 > 0 && Rasterizer.Field9942) {
                                       if (Client.Field12068 <= 0) {
                                          break label276;
                                       }

                                       var10000 = var2.Field924;
                                       if (Class585.Method8950(this.Field11983)) {
                                          break label276;
                                       }
                                    }

                                    this.Field11983 = -1;
                                 }
                              }

                              var18 = var81.Field2172[var17];
                              int var19 = var81.Field2173[var17];
                              int var85 = var81.Field2174[var17];
                              var21 = (float)var81.Field2166[var18];
                              var22 = (float)var81.Field2167[var18];
                              var23 = (float)var81.Field2168[var18];
                              float var87 = (float)var81.Field2166[var19];
                              var88 = (float)var81.Field2167[var19];
                              var26 = (float)var81.Field2168[var19];
                              var27 = (float)var81.Field2167[var85];
                              var28 = (float)var81.Field2166[var85];
                              float var89 = (float)var81.Field2168[var85];
                              if (var6) {
                                 var30 = Rasterizer.Field9964[var81.Field2169[var17] & '\uffff'];
                                 var31 = Rasterizer.Field9964[var81.Field2170[var17] & '\uffff'];
                                 var32 = Rasterizer.Field9964[var81.Field2171[var17] & '\uffff'];
                                 this.Method1484(var2, (int)var21, (int)var23, var15.Field12845, var30, this.Field11983, false);
                                 this.Method1484(var2, (int)var87, (int)var26, var15.Field12845, var31, this.Field11983, false);
                                 this.Method1484(var2, (int)var28, (int)var89, var15.Field12845, var32, this.Field11983, false);
                              } else {
                                 var10000 = var2.Field924;
                                 if (Class585.Method8950(this.Field11983)) {
                                    var10001 = Rasterizer.Field9964;
                                    var10001 = var81.Field2169;
                                    this.Field11983 = Class128.Method1330(this.Field11983);
                                 }

                                 var30 = this.Method1486(var21, var23, var15.Field12845, this.Field11983);
                                 var31 = this.Method1486(var87, var26, var15.Field12845, this.Field11983);
                                 var32 = this.Method1486(var28, var89, var15.Field12845, this.Field11983);
                                 if (Rasterizer.Field9942 && Method1482(this.Field11983)) {
                                    var77 = this.Method1486(var21, var23, var15.Field12845, Rasterizer.Field9964[var81.Field2169[var17] & '\uffff']);
                                    var33 = this.Method1486(var87, var26, var15.Field12845, Rasterizer.Field9964[var81.Field2170[var17] & '\uffff']);
                                    var34 = this.Method1486(var28, var89, var15.Field12845, Rasterizer.Field9964[var81.Field2171[var17] & '\uffff']);
                                 } else {
                                    //was guessed
                                    var77 = Method1491(Rasterizer.Field9964[var81.Field2169[var17] & '\uffff'], false, true);
                                    var33 = Method1491(Rasterizer.Field9964[var81.Field2170[var17] & '\uffff'], false, true);
                                    var34 = Method1491(Rasterizer.Field9964[var81.Field2171[var17] & '\uffff'], false, true);
                                 }

                                 if (this.Field11983 != this.Field11982 || this.Field11981 == null) {
                                    if (this.Field11981 == null) {
                                       this.Field11981 = Class843.Field3769.Method9127(true, this.Field11983);
                                    }

                                    Class601 var90;
                                    if ((var90 = Class843.Field3769.Method9127(true, this.Field11983)).Method9150() != this.Field11981.Method9150()) {
                                       var36 = this.Field11983 <= 0 ? 0 : this.Field11981.Method9137();
                                       this.Field11987.add(new int[]{var36, this.Field11984 * 3});
                                       this.Field11984 = 0;
                                       this.Field11981 = var90;
                                    }

                                    this.Field11982 = this.Field11983;
                                 }

                                 if (Client.Field12068 > 0) {
                                    var22 += var2.Field924.Method8953(var15.Field12845, var21, var23);
                                    var88 += var2.Field924.Method8953(var15.Field12845, var87, var26);
                                    var27 += var2.Field924.Method8953(var15.Field12845, var28, var89);
                                 }

                                 ++this.Field11984;
                                 ++this.Field11985;
                                 var35 = var77 >> 16 & 255;
                                 var36 = var77 >> 8 & 255;
                                 var37 = var77 & 255;
                                 var77 = var33 >> 16 & 255;
                                 var38 = var33 >> 8 & 255;
                                 var39 = var33 & 255;
                                 var33 = var34 >> 16 & 255;
                                 var40 = var34 >> 8 & 255;
                                 var41 = var34 & 255;
                                 this.Field1933.put(var21);
                                 this.Field1933.put(var22);
                                 this.Field1933.put(var23);
                                 this.Field1933.put(var87);
                                 this.Field1933.put(var88);
                                 this.Field1933.put(var26);
                                 this.Field1933.put(var28);
                                 this.Field1933.put(var27);
                                 this.Field1933.put(var89);
                                 this.Field1934.put((byte)var35);
                                 this.Field1934.put((byte)var36);
                                 this.Field1934.put((byte)var37);
                                 this.Field1934.put((byte)var30);
                                 this.Field1934.put((byte)var77);
                                 this.Field1934.put((byte)var38);
                                 this.Field1934.put((byte)var39);
                                 this.Field1934.put((byte)var31);
                                 this.Field1934.put((byte)var33);
                                 this.Field1934.put((byte)var40);
                                 this.Field1934.put((byte)var41);
                                 this.Field1934.put((byte)var32);
                                 var87 = (float)var81.Field2166[0];
                                 float var78 = (float)var81.Field2168[0];
                                 var21 = (float)var81.Field2166[1] - var87;
                                 var22 = (float)var81.Field2168[1] - var78;
                                 var23 = (float)var81.Field2166[3] - var87;
                                 var88 = (float)var81.Field2168[3] - var78;
                                 var26 = (float)var81.Field2166[var18] - var87;
                                 float var83 = (float)var81.Field2168[var18] - var78;
                                 var27 = (float)var81.Field2166[var19] - var87;
                                 float var84 = (float)var81.Field2168[var19] - var78;
                                 var87 = (float)var81.Field2166[var85] - var87;
                                 var78 = (float)var81.Field2168[var85] - var78;
                                 var20 = var88 * 0.0F - var22 * 0.0F;
                                 var28 = var22 * var23 - var21 * var88;
                                 float var64 = var21 * 0.0F - var23 * 0.0F;
                                 float var65 = var64 * 0.0F - var88 * var28;
                                 float var66 = var88 * var20 - var23 * var64;
                                 float var67 = var23 * var28 - var20 * 0.0F;
                                 float var68 = 1.0F / (var65 * var21 + var66 * 0.0F + var67 * var22);
                                 float var69 = (var65 * var26 + var66 * 0.0F + var67 * var83) * var68;
                                 float var70 = (var65 * var27 + var66 * 0.0F + var67 * var84) * var68;
                                 float var71 = (var65 * var87 + var66 * 0.0F + var67 * var78) * var68;
                                 var65 = var64 * 0.0F - var22 * var28;
                                 var66 = var22 * var20 - var21 * var64;
                                 var67 = var21 * var28 - var20 * 0.0F;
                                 var68 = 1.0F / (var65 * var23 + var66 * 0.0F + var67 * var88);
                                 float var72 = (var65 * var26 + var66 * 0.0F + var67 * var83) * var68;
                                 float var73 = (var65 * var27 + var66 * 0.0F + var67 * var84) * var68;
                                 float var74 = (var65 * var87 + var66 * 0.0F + var67 * var78) * var68;
                                 if (var69 < 0.0F) {
                                    var69 = 0.0F;
                                 }

                                 if (var69 > 1.0F) {
                                    var69 = 1.0F;
                                 }

                                 if (var70 < 0.0F) {
                                    var70 = 0.0F;
                                 }

                                 if (var70 > 1.0F) {
                                    var70 = 1.0F;
                                 }

                                 if (var71 < 0.0F) {
                                    var71 = 0.0F;
                                 }

                                 if (var71 > 1.0F) {
                                    var71 = 1.0F;
                                 }

                                 if (var72 < 0.0F) {
                                    var72 = 0.0F;
                                 }

                                 if (var72 > 1.0F) {
                                    var72 = 1.0F;
                                 }

                                 if (var73 < 0.0F) {
                                    var73 = 0.0F;
                                 }

                                 if (var73 > 1.0F) {
                                    var73 = 1.0F;
                                 }

                                 if (var74 < 0.0F) {
                                    var74 = 0.0F;
                                 }

                                 if (var74 > 1.0F) {
                                    var74 = 1.0F;
                                 }

                                 this.Method10096(this.Field11981, this.Field11983, var69, 1.0F - var72, var70, 1.0F - var73, var71, 1.0F - var74, true);
                                 var11 = true;
                              }
                           }
                        }
                     }
                  }
               }
            }

            if (var6) {
               return null;
            } else {
               this.Field1933.flip();
               this.Field1934.flip();
               this.Field1935.flip();
               int var79 = 0;
               if (var9 == null) {
                  byte var76 = 2;
                  if (var11) {
                     var76 = 3;
                  }

                  int[] var82;
                  var13 = (var82 = Class842.Method13977(var76))[0];
                  var14 = var82[1];
                  if (var11) {
                     var79 = var82[2];
                  }
               } else {
                  var13 = var9.Method12370();
                  var14 = var9.Method12371();
                  var79 = var9.Method12375();
               }

               this.Method12368(var9, var13, var14, var79, var11, 35044);
               var1 = this.Field11983 <= 0 ? 0 : this.Field11981.Method9137();
               this.Field11987.add(new int[]{var1, this.Field11984 * 3});
               this.Field11984 = 0;
               GraphicsDisplay.Method997().Method1035("error in loadAtlasFloor(" + var7 + ", " + var13 + ", " + var14 + ")");
               if (var9 == null) {
                  (var9 = new ModelVBO(var3, var4, true)).Field1904 = false;
                  Class843.Method13999(var7, var9);
               }

               var9.Method12376(var13, var14, var79, this.Field11985 * 3, var7, false, -1, false, this.Field11987, 0);
               this.Field11985 = 0;
               return var9;
            }
         }
      }
   }

   public final void Method10099() {
      Iterator var2 = this.Field11989.entrySet().iterator();

      while(var2.hasNext()) {
         Entry var1;
         Method10100((Long)(var1 = (Entry)var2.next()).getKey(), (Class356)var1.getValue());
      }

      this.Field11989.clear();
      this.Field11990.clear();
   }

   private static void Method10100(long var0, Class356 var2) {
      Class843.Method14005(var0);
      Iterator var1 = var2.Method4183().iterator();

      while(var1.hasNext()) {
         Class358 var3;
         Class843.Method14005((var3 = (Class358)var1.next()).Method4192());
         var3.Method4205();
      }

      var2.Method4186(-1, -1);
   }

   public final void Method10101(int var1, int var2, int var3) {
      long var4 = Method10105(var1, var2, var3);
      long var6 = Method10105(var1, var2, var3);
      Class356 var8 = (Class356)this.Field11989.get(var4);
      Class356 var9 = (Class356)this.Field11989.get(var6);
      if (var8 != null) {
         var8.Method4186(var1, var2);
      }

      if (var9 != null) {
         var9.Method4186(var1, var2);
      }

   }

   public final void Method10102(int var1, int var2, int var3) {
      long var4 = Method10105(var1, var2, var3);
      long var6 = Method10105(var1, var2, var3);
      Class356 var8 = (Class356)this.Field11989.get(var4);
      Class356 var9 = (Class356)this.Field11989.get(var6);
      if (var8 != null) {
         var8.Method4184(true);
      }

      if (var9 != null) {
         var9.Method4184(true);
      }

   }

   public final void Method10103() {
      this.Field11992 = 0;
      this.Field11993 = 5000;
      if (Client.Field12117 >= 60) {
         this.Field11993 += (Client.Field12117 - 30) * 50;
      }

      this.Field11994 = 0;
      this.Field11995 = 999;
      boolean var1 = Client.Field12494 != 0 || Client.Field12495 != 0;
      long var2 = System.currentTimeMillis();
      Iterator var5 = this.Field11989.entrySet().iterator();

      Entry var4;
      while(var5.hasNext()) {
         long var6 = (Long)(var4 = (Entry)var5.next()).getKey();
         Class356 var18 = (Class356)var4.getValue();
         boolean var8 = true;
         ModelVBO var9 = (ModelVBO)Class843.Method13998().get(var6);
         int var10 = var18.Method4183().size();
         int var11 = Client.Method13204(var18.Method4178() + var18.Method4170() / 128, var18.Method4179() + var18.Method4171() / 128);
         if (Client.Field12069 && !var18.Method4185() && var18.Method4183().size() > 0 && !Client.Field12125 && !Client.Field12126 && var9 != null && var11 <= Class745.Method12490() + Field11991 / 2) {
            Class838.Method13932(var6, var18.Method4170(), var18.Method4171(), 0, 0, 0, 0, var9, 0.0F, 0.0F, 0.0F);
         }

         boolean var19 = (var9 == null || var18.Method4172()) && var2 - var18.Method4174() > 250L;
         var18.Method4183().size();
         if (!var18.Method4185() || var18.Method4183().size() <= 0 && !var1) {
            var8 = false;
         }

         if (var9 != null && var18.Method4183().size() != var18.Method4176()) {
            var18.Method4175();
         }

         if (var18.Method4166()) {
            var8 = false;
         }

         int var12;
         int var14;
         if (!var8) {
            if (var18.Method4166()) {
               this.Field11990.put(var6, var18);
            }

            var12 = Field11991 / 2;
            int var13;
            var14 = var13 = Client.Method13206(var18.Method4167() + var12, var18.Method4168() + var12);
            int var15 = Client.Field12117 / 2 + (Field11991 << 1);
            if (var13 > var15 && var14 > var15) {
               this.Field11990.put(var6, var18);
               continue;
            }

            if (!Client.Field12069 || !var19 || var18.Method4183().size() <= 0) {
               continue;
            }
         }

         this.Method12366();
         this.Method10097(false, (List)null);
         this.Field11985 = 0;
         var12 = 0;
         boolean var22 = false;
         var14 = 0;
         if (var19 && this.Field11992 <= this.Field11993) {
            this.Field11987 = new LinkedList();
            boolean var23 = var9 == null;
            Iterator var16 = var18.Method4183().iterator();

            while(var16.hasNext()) {
               Class358 var20 = (Class358)var16.next();

               try {
                  ++var14;
                  if (var14 == var10) {
                     var22 = true;
                  }

                  if (this.Field11985 != 0) {
                     var12 = this.Field11985;
                  }

                  ModelVBO var21;
                  if ((var21 = this.Method10107(var20, false, var6, var22, false, false)) != null) {
                     var9 = var21;
                  }

                  if (var9 == null) {
                     var18.Method4175();
                  }

                  if (var22 && var9 == null) {
                     System.out.println("problematic buffer");
                  }

                  if (GraphicsDisplay.Method997().Method1036("error in organizeMapDecorations(" + var6 + ", " + var18.Method4183().size() + ")", false)) {
                     System.out.println("remove");
                     this.Field11990.put(var6, var18);
                     break;
                  }
               } catch (Exception var17) {
                  System.err.println("triangles[" + var18 + "]: " + var12);
                  System.err.println("update[" + var18 + "]: " + var18.Method4183().size() + ": " + var18.Method4183().toString().replaceAll("]], D", "]]\nD"));
                  var18.Method4183().clear();
                  var17.printStackTrace();
               }
            }

            this.Field11992 += this.Field11985;
            this.Field11985 = 0;
            if (var9 != null && var23) {
               var9.Field1910 = 0.0F;
            }

            var18.Method4173(var2);
         }

         var18.Method4177();
         if (var9 != null && var18.Method4183().size() >= 0 && var8) {
            var9.Field1909 = true;
            Class838.Method13933(var6, var18.Method4170(), var18.Method4171(), 0, 0, 0, 0, var9, 0.0F, 0.0F, 0.0F);
            if (Client.Field12069) {
               Class838.Method13932(var6, var18.Method4170(), var18.Method4171(), 0, 0, 0, 0, var9, 0.0F, 0.0F, 0.0F);
            }
         }
      }

      var5 = this.Field11990.entrySet().iterator();

      while(var5.hasNext()) {
         Method10100((Long)(var4 = (Entry)var5.next()).getKey(), (Class356)var4.getValue());
         this.Field11989.remove(var4.getKey());
      }

      this.Field11990.clear();
      this.Method12366();
   }

   public final void Method10104(int var1, int var2) {
      if (var1 != 0 || var2 != 0) {
         Iterator var4 = this.Field11989.entrySet().iterator();

         while(var4.hasNext()) {
            ((Class356)((Entry)var4.next()).getValue()).Method4169(-var1, -var2);
         }

      }
   }

   private static long Method10105(int var0, int var1, int var2) {
      int var10000 = Client.Field12497;
      int var3 = Client.Field12494;
      var10000 = Client.Field12498;
      int var4 = Client.Field12495;
      var0 = (Client.Field12490 + var0 - var3) / Field11991 * Field11991;
      var1 = (Client.Field12491 + var1 - var4) / Field11991 * Field11991;
      return 288230376151711744L | (long)Field11991 << 48 | (long)(var2 & 255) << 32 | (long)(var0 & '\uffff') << 16 | (long)(var1 & '\uffff');
   }

   public final ModelVBO Method10106(Class358 var1, boolean var2) {
      return this.Method10107(var1, true, 0L, true, var2, false);
   }

   private ModelVBO Method10107(Class358 var1, boolean var2, long var3, boolean var5, boolean var6, boolean var7) {
      Model var75 = var1.Method4191();
      var1.Method4195();
      boolean var8 = var1.Method4196();
      boolean var9 = var3 != 0L;
      boolean var10 = var1.Method4194() && var1.Method4215();
      boolean var11 = var1.Method4215();
      int var10000 = Client.session_player_count;
      var10000 = Client.Field12328;
      var10000 = (int) Client.Method13203(var1.Method4197(), var1.Method4198());
      if (var75.Field2756 && !var10 && var1.Method4197() < SceneGraph.mapSizeWidth && var1.Method4198() < SceneGraph.mapSizeWidth && var1.Method4197() >= 0 && var1.Method4198() >= 0) {
         Client.Field12428.Method8846(var1.Method4199(), var1.Method4197(), var1.Method4198()).Field12840 = true;
      }

      int var10001 = var75.Field2818;
      var1.Method4199();
      int var68 = var10001;
      if ((GraphicsDisplay.Field2668 ? true : (var1.Method4214() > 11 ? true : var68 <= 500)) && !var75.Field2756 && (var8 || Client.Field12055) && var2 && !var1.Method4194() && !var6) {
         Field11991 = GraphicsDisplay.Field2668 ? 6 : 3;
         var10000 = var1.Method4197();
         var10001 = var1.Method4198();
         int var10002 = var1.Method4199();
         boolean var10003 = var1.Method4191().Field2757;
         long var69 = Method10105(var10000, var10001, var10002);
         Class356 var71 = (Class356)this.Field11989.get(var69);
         if (var1.Method4197() == 55) {
            var1.Method4198();
         }

         if ((Client.Field12494 != 0 || Client.Field12495 != 0) && (var71 == null || !var71.Method4181(var1))) {
            if (var71 != null) {
               var71.Method4184(var1.Method4213());
            }
         } else {
            if (var71 == null) {
               var71 = new Class356(var69, var1.Method4197(), var1.Method4198(), var1.Method4199(), Field11991);
               this.Field11989.put(var69, var71);
            }

            var71.Method4184(var1.Method4213());
            var71.Method4182(var1);
         }

         var1.Method4191().Field2745 = true; //TODO
         return null;
      } else {
         long var13 = var3 == 0L ? var1.Method4192() : var3;
         int var74 = var1.Method4193();
         if (var75 != null) {
            var75.Field2768 = var74;
         }

         ModelVBO var4 = null;
         if (var2) {
            this.Method12366();
            this.Field11985 = 0;
            var4 = (ModelVBO)Class843.Method13998().get(var13);
         }

         if (var4 != null && var75 != null && var75.Field2754 > 0) {
            var4.Field1915 = System.currentTimeMillis();
            var4.Field1916 = (long)var75.Field2754;
         }

         float var20;
         int var21;
         float var22;
         float var23;
         float var84;
         if (Client.Field12225 && var4 != null) {
            int var76;
            if (var4.Field1903 != null && var75.Method14526() == null) {
               for(var76 = 0; var76 < var4.Field1903.length; ++var76) {
                  var4.Field1902[var76] = (float)((double)var4.Field1902[var76] + (double)var4.Field1903[var76] * Client.Field12427);
                  if (var4.Field1902[var76] > 10.0F) {
                     var4.Field1903 = null;
                     var4.Field1902 = null;
                     break;
                  }
               }
            } else if (!var6 && var75.Method14526() != null) {
               var68 = var75.Method14526().size();
               if (var4.Field1902 == null || var4.Field1902.length < var68) {
                  var4.Field1902 = new float[var68];
                  var4.Field1903 = new float[var68];
               }

               var76 = 0;
               Iterator var15 = var75.Method14526().entrySet().iterator();

               label625:
               while(true) {
                  Entry var12;
                  int var16;
                  ParticleDefinition var17;
                  int var79;
                  do {
                     do {
                        if (!var15.hasNext()) {
                           break label625;
                        }

                        var16 = (Integer)(var12 = (Entry)var15.next()).getKey();
                     } while((var79 = (Integer)var12.getValue() - 1) < 0);
                  } while((var17 = ParticleDefinition.Field3209[var79]) == null);

                  float var18 = var75.Method14529(var16) * 0.25F;
                  float var19 = var75.Method14530(var16) * 0.25F;
                  var20 = var75.Method14532(var16) * 0.25F;
                  if ((var21 = var1.Method4210() % 2048) != 0) {
                     var22 = (float) Rasterizer.Field9959[var21];
                     var23 = (float) Rasterizer.Field9960[var21];
                     var84 = (var20 * var22 + var18 * var23) / 65536.0F;
                     var20 = (var20 * var23 - var18 * var22) / 65536.0F;
                     var18 = var84;
                  }

                  var4.Field1903[var76] = var17.Method7801();
                  var4.Field1902[var76] = (float)((double)var4.Field1902[var76] + (double)var4.Field1903[var76] * Client.Field12427);

                  for(Class453 var92 = new Class453(var18 + var1.Method4207(), var20 + var1.Method4208(), var19 + var1.Method4209()); var4.Field1902[var76] > 1.0F; --var4.Field1902[var76]) {
                     Client.Method13261(new Class449(var17, var92, var79, var21));
                  }

                  ++var76;
               }
            }
         }

         var8 = var4 == null;
         boolean var81 = false;
         boolean var83 = false;
         if (var4 != null && var4.Method12373() != var75.Field2818 && var2) {
            var8 = true;
         }

         if (var4 != null && (Client.Field12103 || var10) && var75.Field2756 && !var8) {
            var10 = true;
            if ((var84 = (float)(Client.currentTime % var75.Field2755) / (float)var75.Field2755) != var4.Field1901) {
               var8 = true;
               var83 = true;
               var4.Field1901 = var84;
            }
         }

         if (var75.Field2750 && var11) {
            if (var75.Field2818 <= 0 && !var5) {
               return var4;
            } else if (var4 != null && !var10 && var5) {
               return var4;
            } else {
               boolean var85 = true;
               if (!var9) {
                  this.Method10097(false, (List)null);
               }

               if (var4 != null) {
                  this.Field11987 = var4.Method12380();
                  if (var8) {
                     this.Field11987.clear();
                  } else {
                     var85 = false;
                  }
               } else if (!var9) {
                  this.Field11987 = new LinkedList();
               }

               if (!var2) {
                  var4 = (ModelVBO)Class843.Method13998().get(var13);
                  var8 = true;
               }

               this.Field11985 += var75.Field2818;

               int var89;
               int var91;
               int var93;
               for(int var88 = 0; var88 <= 0; ++var88) {
                  for(var89 = 0; var89 < var75.Field2818; ++var89) {
                     int[] var101;
                     if (var75.Field2833 != null && var89 < var75.Field2833.length) {
                        var101 = var75.Field2833;
                     }

                     int var77;
                     if ((var77 = var75.Field2835 != null && var89 < var75.Field2835.length ? 255 - var75.Field2835[var89] : 255) > 255) {
                        var77 = 255;
                     }

                     if (var77 < 255) {
                        this.Field11986 = true;
                     }

                     var11 = false;
                     this.Field11983 = var75.Method14447(var89);
                     if (this.Field11983 < -1) {
                        var11 = true;
                        this.Field11983 = -this.Field11983;
                     }

                     if (this.Field11983 > 0 && TextureData.Field2911[this.Field11983]) {
                        this.Field11986 = true;
                     } else if (var88 == 1) {
                        continue;
                     }

                     int var86 = var75.Field2819[var89];
                     var91 = var75.Field2820[var89];
                     var21 = var75.Field2821[var89];
                     float var24 = var6 ? Model.Field2863[Model.Field2798][var86] : var75.Method14529(var86);
                     float var25 = var6 ? Model.Field2864[Model.Field2798][var86] : var75.Method14530(var86);
                     float var26 = var6 ? Model.Field2865[Model.Field2798][var86] : var75.Method14532(var86);
                     float var27 = var6 ? Model.Field2863[Model.Field2798][var91] : var75.Method14529(var91);
                     float var28 = var6 ? Model.Field2864[Model.Field2798][var91] : var75.Method14530(var91);
                     float var29 = var6 ? Model.Field2865[Model.Field2798][var91] : var75.Method14532(var91);
                     float var30 = var6 ? Model.Field2863[Model.Field2798][var21] : var75.Method14529(var21);
                     float var31 = var6 ? Model.Field2864[Model.Field2798][var21] : var75.Method14530(var21);
                     float var32 = var6 ? Model.Field2865[Model.Field2798][var21] : var75.Method14532(var21);
                     var10000 = var1.Method4212() == null ? 0 : var1.Method4212().Method4190();
                     var93 = var10000;
                     if (var10000 != 0 && !var10) {
                        var23 = (float) Rasterizer.Field9959[var93];
                        var22 = (float) Rasterizer.Field9960[var93];
                        float var48 = (var26 * var23 + var24 * var22) / 65536.0F;
                        var26 = (var26 * var22 - var24 * var23) / 65536.0F;
                        var24 = var48;
                        var48 = (var29 * var23 + var27 * var22) / 65536.0F;
                        var29 = (var29 * var22 - var27 * var23) / 65536.0F;
                        var27 = var48;
                        var48 = (var32 * var23 + var30 * var22) / 65536.0F;
                        var32 = (var32 * var22 - var30 * var23) / 65536.0F;
                        var30 = var48;
                     }

                     if (!var2) {
                        var24 = (float)((double)var24 * 0.25D);
                        var25 = (float)((double)var25 * 0.25D);
                        var26 = (float)((double)var26 * 0.25D);
                        var27 = (float)((double)var27 * 0.25D);
                        var28 = (float)((double)var28 * 0.25D);
                        var29 = (float)((double)var29 * 0.25D);
                        var30 = (float)((double)var30 * 0.25D);
                        var31 = (float)((double)var31 * 0.25D);
                        var32 = (float)((double)var32 * 0.25D);
                     }

                     if (var75.Field2766) {
                        var25 = var75.Method14454(var86, var2);
                        var28 = var75.Method14454(var91, var2);
                        var31 = var75.Method14454(var21, var2);
                     }

                     if (var1.Method4212() != null) {
                        var24 += (float)var1.Method4212().Method4187();
                        var27 += (float)var1.Method4212().Method4187();
                        var30 += (float)var1.Method4212().Method4187();
                        var25 += (float)var1.Method4212().Method4189();
                        var28 += (float)var1.Method4212().Method4189();
                        var31 += (float)var1.Method4212().Method4189();
                        var26 += (float)var1.Method4212().Method4188();
                        var29 += (float)var1.Method4212().Method4188();
                        var32 += (float)var1.Method4212().Method4188();
                     }

                     var93 = var1.Method4203();
                     int var95 = var1.Method4204();
                     if (var93 != 0 || var95 != 0) {
                        var24 -= (float)var93;
                        var27 -= (float)var93;
                        var30 -= (float)var93;
                        var26 -= (float)var95;
                        var29 -= (float)var95;
                        var32 -= (float)var95;
                     }

                     if (var75.Field2830 != null) {
                        var21 = Rasterizer.Field9964[var75.Field2830[var89]];
                        var93 = Rasterizer.Field9964[var75.Field2831[var89]];
                        var95 = Rasterizer.Field9964[var75.Field2832[var89]];
                        var101 = var75.Field2830;
                        if (var93 <= 1) {
                           var93 = var21;
                        }

                        if (var95 <= 1) {
                           var95 = var21;
                        }
                     } else {
                        if (var75.Field2836[var89] >= 65535) {
                           var21 = var93 = var95 = var75.Field2836[var89];
                        } else {
                           var21 = var93 = var95 = Rasterizer.Field9964[var75.Field2836[var89]];
                        }

                        var101 = var75.Field2836;
                     }

                     float var49;
                     int var97;
                     if (var75.Field2834 != null) {
                        var97 = var75.Field2834[var89];
                        var49 = 0.005F * (float)(-var97);
                        var24 += var24 > 0.0F ? var49 : -var49;
                        var27 += var27 > 0.0F ? var49 : -var49;
                        var30 += var30 > 0.0F ? var49 : -var49;
                        var25 += var25 > 0.0F ? var49 : -var49;
                        var28 += var28 > 0.0F ? var49 : -var49;
                        var31 += var31 > 0.0F ? var49 : -var49;
                        var26 += var26 > 0.0F ? var49 : -var49;
                        var29 += var29 > 0.0F ? var49 : -var49;
                        var32 += var32 > 0.0F ? var49 : -var49;
                     } else if (var75.Field2837 > 0) {
                        var97 = var75.Field2837;
                        var49 = 0.005F * (float)(-var97);
                        var24 += var24 > 0.0F ? var49 : -var49;
                        var27 += var27 > 0.0F ? var49 : -var49;
                        var30 += var30 > 0.0F ? var49 : -var49;
                        var25 += var25 > 0.0F ? var49 : -var49;
                        var28 += var28 > 0.0F ? var49 : -var49;
                        var31 += var31 > 0.0F ? var49 : -var49;
                        var26 += var26 > 0.0F ? var49 : -var49;
                        var29 += var29 > 0.0F ? var49 : -var49;
                        var32 += var32 > 0.0F ? var49 : -var49;
                     }

                     if (this.Field11983 == 922) {
                        this.Field11983 = 922;
                     } else if (this.Field11983 == 65) {
                        this.Field11983 = -1;
                     }

                     int var99;
                     if (var85 && (this.Field11983 != this.Field11982 || this.Field11981 == null)) {
                        if (this.Field11981 == null) {
                           this.Field11981 = Class843.Field3770.Method9127(false, this.Field11983);
                        }

                        Class601 var98;
                        if ((var98 = Class843.Field3770.Method9127(false, this.Field11983)).Method9150() != this.Field11981.Method9150()) {
                           var99 = this.Field11981.Method9137();
                           this.Field11987.add(new int[]{var99, this.Field11984 * 3});
                           this.Field11984 = 0;
                           this.Field11981 = var98;
                        }

                        this.Field11982 = this.Field11983;
                     }

                     ++this.Field11984;
                     int var80;
                     if (var11 && this.Field11983 != -1) {
                        double var100 = Rasterizer.Method9431();
                        var80 = 16777215;
                        if (var100 >= 0.9D) {
                           var80 = 10066329;
                        } else if (var100 >= 0.8D) {
                           var80 = 12303291;
                        } else if (var100 >= 0.7D) {
                           var80 = 14540253;
                        } else if (var100 >= 0.6D) {
                           var80 = 16777215;
                        }

                        var95 = var80;
                        var93 = var80;
                        var21 = var80;
                     }

                     if (var75.Field2834 != null) {
                        var101 = var75.Field2834;
                     }

                     var97 = var21 >> 16 & 255;
                     var99 = var21 >> 8 & 255;
                     var80 = var21 & 255;
                     var91 = var93 >> 16 & 255;
                     var21 = var93 >> 8 & 255;
                     var93 &= 255;
                     int var34 = var95 >> 16 & 255;
                     int var35 = var95 >> 8 & 255;
                     var95 &= 255;
                     this.Field1933.put(var24);
                     this.Field1933.put(var25);
                     this.Field1933.put(var26);
                     this.Field1933.put(var27);
                     this.Field1933.put(var28);
                     this.Field1933.put(var29);
                     this.Field1933.put(var30);
                     this.Field1933.put(var31);
                     this.Field1933.put(var32);
                     this.Field1934.put((byte)var97);
                     this.Field1934.put((byte)var99);
                     this.Field1934.put((byte)var80);
                     this.Field1934.put((byte)var77);
                     this.Field1934.put((byte)var91);
                     this.Field1934.put((byte)var21);
                     this.Field1934.put((byte)var93);
                     this.Field1934.put((byte)var77);
                     this.Field1934.put((byte)var34);
                     this.Field1934.put((byte)var35);
                     this.Field1934.put((byte)var95);
                     this.Field1934.put((byte)var77);
                     if (this.Field11983 > 0 && Texture.Field1931[this.Field11983]) {
                        var77 = this.Field11983;
                        if (this.Field11983 == 17) {
                           var75.Field2755 = 100;
                        } else {
                           boolean var102 = true;
                           var75.Field2755 = 400;
                        }
                     }

                     if (var8) {
                        var81 = true;
                        if (var75.Field2759 != null && this.Field11983 > 0) {
                           float var78 = var75.Field2759[var89][0];
                           float var82 = var75.Field2759[var89][1];
                           float var87 = var75.Field2759[var89][2];
                           var20 = var75.Field2759[var89][3];
                           float var64 = var75.Field2759[var89][4];
                           float var65 = var75.Field2759[var89][5];
                           if (Texture.Field1931[this.Field11983] && var83) {
                              float var66 = (float)(Client.currentTime % var75.Field2755) / (float)var75.Field2755;
                              var78 = var78 + 1.0F - var66;
                              var87 = var87 + 1.0F - var66;
                              var64 = var64 + 1.0F - var66;
                              if (var78 < 0.002F) {
                                 var78 = 0.002F;
                              }

                              if (var87 < 0.002F) {
                                 var87 = 0.002F;
                              }

                              if (var64 < 0.002F) {
                                 var64 = 0.002F;
                              }

                              while(var78 > 1.998F || var87 > 1.998F || var64 > 1.998F) {
                                 --var78;
                                 --var87;
                                 --var64;
                              }
                           }

                           this.Method10096(this.Field11981, this.Field11983, var78, var82, var87, var20, var64, var65, false);
                        } else {
                           this.Method10096(this.Field11981, this.Field11983, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, false);
                        }
                     }
                  }
               }

               if (var5) {
                  this.Field1933.flip();
                  this.Field1934.flip();
                  this.Field1935.flip();
                  char var90 = '裤';
                  if (var10) {
                     var90 = '裨';
                  }

                  boolean var94 = false;
                  if (var4 == null) {
                     var81 = true;
                     int[] var96;
                     var89 = (var96 = Class842.Method13977(3))[0];
                     var91 = var96[1];
                     var21 = var96[2];
                  } else {
                     var89 = var4.Method12370();
                     var91 = var4.Method12371();
                     var21 = var4.Method12375();
                  }

                  if (var5) {
                     this.Method12369(var89, var91, var21, var8, var81, true, var90);
                  }

                  if (var2 && GraphicsDisplay.Method997().Method1035("error in loadAtlasModel(" + var13 + ", " + var89 + ", " + var91 + ", " + var21 + ", " + var81 + ")")) {
                     return null;
                  }

                  if (var85) {
                     var93 = this.Field11981 == null ? 0 : this.Field11981.Method9137();
                     this.Field11987.add(new int[]{var93, this.Field11984 * 3});
                     this.Field11984 = 0;
                  }

                  if (var4 == null) {
                     var93 = Math.abs(var1.Method4191().Field2751 - Client.Field12600);
                     var4 = new ModelVBO(var1.Method4197(), var1.Method4198(), var1.Method4201());
                     Class843.Method13997(var13, var4);
                     if (var93 >= 10 && !var1.Method4191().Field2855) {
                        if (!Client.Field12428.Field934 && !Client.Method13313()) {
                           var4.Field1910 = 1.0F;
                        } else if (Client.Field12428.Field934 && System.currentTimeMillis() - Client.Field12428.Field935 > 2000L) {
                           var4.Field1910 = 1.0F;
                        }
                     } else {
                        var4.Field1910 = 1.0F;
                     }
                  }

                  var4.Method12376(var89, var91, var21, this.Field11985 * 3, var13, var10, var74, this.Field11986, var85 && var81 ? this.Field11987 : null, 0);
                  var4.Field1904 = false;
                  var1.Method4200();
               }

               if (var4 != null && var2) {
                  var4.Field1905 = 0.25F;
               }

               return var4;
            }
         } else {
            return var4;
         }
      }
   }
}
