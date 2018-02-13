package net.LWJGLClient.client.a.a;

import net.LWJGLClient.client.a.c.ItemDef;
import net.LWJGLClient.client.b.Rasterizer;
import net.LWJGLClient.client.model.Model;
import net.LWJGLClient.client.a.e.JagexArchive;
import net.LWJGLClient.client.c.Packet;
import net.LWJGLClient.client.model.Client;
import net.LWJGLClient.client.model.a.d.ParticleDefinition;
import net.LWJGLClient.client.model.c.MemCache;
import net.LWJGLClient.client.model.c.Class175;

public final class SpotAnim {
   public boolean Field10092 = false;
   private int Field10093 = 13;
   public static SpotAnim[] Field10094;
   private int Field10095;
   private int Field10096;
   private int Field10097 = -1;
   public Sequence Field10098;
   private int[][] Field10099;
   private int[] Field10100 = null;
   private int[] Field10101 = null;
   private int Field10102 = 128;
   private int Field10103 = 128;
   public int Field10104;
   private int Field10105;
   private int Field10106;
   public static Class175 Field10107 = new Class175(30);
   private static MemCache Field10108 = null;

   public static void Method8308(JagexArchive var0) {
      boolean var10000 = Client.Field12153;
      Packet var7;
      int var1 = (var7 = new Packet(var0.readConfig("spotanim.dat"))).g2();
      int var2 = 3100 - var1;
      if (Field10094 == null) {
         Field10094 = new SpotAnim[var1 + var2];
      }

      Field10108 = new MemCache(200);

      label85:
      for(var2 = 0; var2 < var1; ++var2) {
         if (Field10094[var2] == null) {
            Field10094[var2] = new SpotAnim();
         }

         Field10094[var2].Field10095 = var2;
         if (!Client.normalMem) {
            var10000 = Client.Field12153;
            SpotAnim var15 = Field10094[var2];
            Packet var4 = var7;
            SpotAnim var3 = var15;

            while(true) {
               while(true) {
                  int var5;
                  if ((var5 = var4.g1()) == 0) {
                     continue label85;
                  }

                  if (var5 == 1) {
                     var3.Field10096 = var4.g2();
                  } else if (var5 == 2) {
                     var3.Field10097 = var4.g2();
                     if (Sequence.anims != null) {
                        var3.Field10098 = Sequence.anims[var3.Field10097];
                     }
                  } else if (var5 == 4) {
                     var3.Field10102 = var4.g2();
                  } else if (var5 == 5) {
                     var3.Field10103 = var4.g2();
                  } else if (var5 == 6) {
                     var3.Field10104 = var4.g2();
                  } else if (var5 == 7) {
                     var3.Field10105 = var4.g2();
                  } else if (var5 == 8) {
                     var3.Field10106 = var4.g2();
                  } else if (var5 == 40) {
                     int var6 = var4.g1();
                     var3.Field10100 = new int[var6];
                     var3.Field10101 = new int[var6];

                     for(var5 = 0; var5 < var6; ++var5) {
                        var3.Field10100[var5] = var4.g2();
                        var3.Field10101[var5] = var4.g2();
                     }
                  } else {
                     System.out.println("Error unrecognised spotanim config code: " + var5);
                  }
               }
            }
         } else {
            Field10094[var2].Method8314(var7);
         }
      }

      Field10094[1120].Field10096 = 26298;
      Field10094[1120].Field10097 = -1;
      Field10094[1120].Field10098 = null;
      Method8309(3000, 249, ItemDef.Field10614, "ele_arrow");
      Method8309(3001, 250, ItemDef.Field10614, "ele_arrow");
      Method8309(3002, 249, ItemDef.Field10617, "ele_arrow");
      Method8309(3003, 250, ItemDef.Field10617, "ele_arrow");
      Method8309(3004, 249, ItemDef.Field10616, "ele_arrow");
      Method8309(3005, 250, ItemDef.Field10616, "ele_arrow");
      Method8309(3006, 249, ItemDef.Field10615, "ele_arrow");
      Method8309(3007, 250, ItemDef.Field10615, "ele_arrow");
      int[] var10002 = new int[]{7322, 7339, 61, 70, 82};
      int[] var14 = new int[]{7322, 7339, 61, 22307, 22307};
      int[] var13 = var10002;
      boolean var11 = true;
      boolean var9 = true;
      Field10094[3008] = Method8312(1190);
      Field10094[3008].Field10095 = 3008;
      Field10094[3008].Field10100 = var13;
      Field10094[3008].Field10101 = var14;
      Field10094[3008].Field10105 = 10;
      Field10094[3008].Field10106 = 100;
      Method8310(3009, 1116, 10374, 10630, 0);
      Method8310(3010, 1120, 10374, 10630, 0);
      Method8310(3011, 1116, 54022, 54406, 0);
      Method8310(3012, 1120, 54022, 54406, 0);
      Method8310(3013, 1111, 10374, 10630, 0);
      Method8310(3015, 1111, 54022, 54406, 0);
      Method8310(3016, 1116, 10374, 10630, 1);
      Method8310(3017, 1120, 10374, 10630, 1);
      Method8310(3018, 1116, 54022, 54406, 1);
      Method8310(3019, 1120, 54022, 54406, 1);
      Method8310(3020, 1111, 10374, 10630, 1);
      Method8310(3022, 1111, 54022, 54406, 1);
      Method8310(3024, 1116, 10374, 10630, 2);
      Method8310(3025, 1120, 10374, 10630, 2);
      Method8310(3026, 1116, 54022, 54406, 2);
      Method8310(3027, 1120, 54022, 54406, 2);
      Method8310(3028, 1111, 10374, 10630, 2);
      Method8310(3030, 1111, 54022, 54406, 2);
      Method8310(3032, 1116, 10429, 10429, 1);
      Method8310(3033, 1120, 10429, 10429, 1);
      Method8310(3034, 1116, 10429, 10429, 2);
      Method8310(3035, 1120, 10429, 10429, 2);
      Method8310(3036, 1111, 10429, 10429, 1);
      Method8310(3038, 1111, 10429, 10429, 2);
      int[][] var8 = new int[][]{{5672, 5672}, {33, 33}, {43072, 43072}, {8, 8}, {43279, 43279}, {21662, 21662}, {36133, 36133}, {43072, 17988}, {43072, 63411}, {43279, 42964}, {43279, 21460}, {21662, 931}, {21662, 122}, {36133, 50752}, {36133, 12}, {54022, 54020}};
      var1 = 3040;

      for(var2 = 0; var2 < 16; ++var2) {
         int var10 = var8[var2][0];
         int var12 = var8[var2][1];
         Method8311(var1++, 955, var10, var12);
         Method8311(var1++, 27, var10, var12);
      }

   }

   private static void Method8309(int var0, int var1, int var2, String var3) {
      Field10094[var0] = Method8312(var1);
      Field10094[var0].Field10095 = var0;
      Field10094[var0].Field10100 = new int[]{21190};
      Field10094[var0].Field10101 = new int[]{var2 - 30};
      Field10094[var0].Field10099 = new int[][]{{102, ParticleDefinition.Method7792(var3, Rasterizer.Field9964[var2 - 40])}};
      Field10094[var0].Field10105 = 10;
      Field10094[var0].Field10106 = 100;
   }

   private static void Method8310(int var0, int var1, int var2, int var3, int var4) {
      Field10094[var0] = Method8312(var1);
      Field10094[var0].Field10095 = var0;
      if (var2 == 54022) {
         var1 = var2 + 138 - 7;
      } else {
         var1 = var2 + 138 - 3;
      }

      int var5 = var3 + 13;
      if (var4 == 1) {
         var5 = ItemDef.Field10609;
      } else if (var4 == 2) {
         var5 = ItemDef.Field10610;
      }

      Field10094[var0].Field10100 = new int[]{654, 788, 914, 918, 920, 922, 924, 929, 5409, 10429, 10434, 10452, 10456};
      if (var3 == 10429) {
         Field10094[var0].Field10101 = new int[]{654, 788, 914, 918, 920, 922, 924, 929, 5409, 10429, 10434, var5, 10456};
      } else {
         Field10094[var0].Field10101 = new int[]{var2, var1, 914, 918, 920, 922, 924, 929, var3 + 2, var3, var3 + 5, var5, var3 + 17};
      }
   }

   private static void Method8311(int var0, int var1, int var2, int var3) {
      Field10094[var0] = Method8312(var1);
      Field10094[var0].Field10095 = var0;
      Field10094[var0].Field10100 = new int[]{41, 57, 61};
      Field10094[var0].Field10101 = new int[]{var2, var3 + 5, var3};
   }

   private static SpotAnim Method8312(int var0) {
      SpotAnim var1 = new SpotAnim();
      SpotAnim var2 = Field10094[var0];
      var1.Field10097 = var2.Field10097;
      if (var1.Field10097 > 0) {
         var1.Field10098 = Sequence.anims[var1.Field10097];
      }

      var1.Field10093 = var2.Field10093;
      var1.Field10102 = var2.Field10102;
      var1.Field10103 = var2.Field10103;
      var1.Field10104 = var2.Field10104;
      var1.Field10105 = var2.Field10105;
      var1.Field10106 = var2.Field10106;
      var1.Field10096 = var2.Field10096;
      return var1;
   }

   public static void Method8313(int var0) {
      if (Field10094[var0] != null && var0 >= 0 && var0 < Field10094.length && Field10094[var0].Field10098 != null) {
         Field10094[var0].Field10098.Method8282();
      }

   }

   private void Method8314(Packet var1) {
      int var2;
      while((var2 = var1.g1()) != 0) {
         if (var2 == 1) {
            this.Field10096 = var1.g2();
         } else if (var2 == 2) {
            this.Field10097 = var1.g2();
            if (Sequence.anims != null) {
               this.Field10098 = Sequence.anims[this.Field10097];
            }
         } else if (var2 == 4) {
            this.Field10102 = var1.g2();
         } else if (var2 == 5) {
            this.Field10103 = var1.g2();
         } else if (var2 == 6) {
            this.Field10104 = var1.g2();
         } else if (var2 == 7) {
            this.Field10105 = var1.g1();
         } else if (var2 == 8) {
            this.Field10106 = var1.g1();
         } else if (var2 == 40) {
            var2 = var1.g1();
            this.Field10100 = new int[var2];
            this.Field10101 = new int[var2];

            for(int var3 = 0; var3 < var2; ++var3) {
               this.Field10100[var3] = var1.g2();
               this.Field10101[var3] = var1.g2();
            }
         } else {
            System.out.println("Error unrecognised spotanim config code: " + var2);
         }
      }

   }

   public final Model Method8315() {
      Model var1;
      if ((var1 = (Model)Field10108.Method1510(this.Field10095)) != null) {
         return var1;
      } else if ((var1 = Model.Method14476(this.Field10096, true, true)) == null) {
         return null;
      } else {
         int var2;
         if (this.Field10100 != null) {
            for(var2 = 0; var2 < this.Field10100.length; ++var2) {
               if (this.Field10100[0] != 0) {
                  var1.recolor(this.Field10100[var2], this.Field10101[var2]);
               }
            }
         }

         if (this.Field10102 != 128 || this.Field10103 != 128) {
            var1.Method14501((float)this.Field10102, (float)this.Field10102, (float)this.Field10103);
         }

         var1.Method14502(95 + this.Field10105, 1000 + this.Field10106, -30, -50, -30, true);
         var1.Method14482();
         if (this.Field10099 != null && Client.Field12225) {
            var1.Method14460(this.Field10099);
         }

         var2 = this.Field10095;
         if (this.Field10095 != 3001 && var2 != 3003 && var2 != 3005 && var2 != 3007 && var2 != 250 ? (var2 != 25 && var2 != 26 ? (var2 != 97 && var2 != 95 && var2 != 96 && var2 != 24 && (var2 < 18 || var2 > 22) ? var2 >= 1104 && var2 <= 1110 : true) : true) : true) {
            var1.Method14493(8, -2, -4);
         } else if (this.Field10095 == 1116 || this.Field10095 == 1111 || this.Field10095 >= 3009 && this.Field10095 <= 3039) {
            var1.Method14493(-2, -2, -22);
         }

         Field10108.Method1509(this.Field10095, var1);
         return var1;
      }
   }
}
