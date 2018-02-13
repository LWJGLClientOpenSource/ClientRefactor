package net.LWJGLClient.client.a.a;

import net.LWJGLClient.client.a.Class128;
import net.LWJGLClient.client.a.e.JagexArchive;
import net.LWJGLClient.client.c.Packet;
import net.LWJGLClient.client.model.Client;

public final class Sequence {
   public static Sequence[] anims;
   public int Field10141;
   public int[] frame2IDS;
   public int[] Field10143;
   public int[] Field10144;
   public int Field10145 = -1;
   public int[] Field10146;
   public boolean Field10147 = false;
   public int Field10148 = 5;
   public int anInt360 = -1;
   public int anInt361 = -1;
   public int Field10151 = 99;
   public int Field10152 = -1;
   public int priority = -1;
   public int Field10154 = 2;

   private static int[] Method8272(int[] var0) {
      if (var0 == null) {
         return null;
      } else {
         int[] var1 = new int[var0.length];
         int var2 = 0;

         for(int var3 = var0.length - 1; var2 < var3; --var3) {
            int var4 = var0[var2];
            var1[var2] = var0[var3];
            var1[var3] = var4;
            ++var2;
         }

         return var1;
      }
   }

   public static boolean Method8273(int... var0) {
      int[] var2 = var0;

      for(int var1 = 0; var1 < 3; ++var1) {
         if (!Method8274(var2[var1])) {
            return false;
         }
      }

      return true;
   }

   public static boolean Method8274(int var0) {
      if (var0 <= 0) {
         return true;
      } else {
         Class518 var1;
         if ((var1 = Class518.Method8351(var0)) == null) {
            return false;
         } else {
            Class128 var2;
            return (var2 = var1.Field10086) != null;
         }
      }
   }

   private static Sequence Method8275(int var0) {
      Sequence var2 = anims[var0];
      Sequence var1;
      (var1 = new Sequence()).Field10148 = var2.Field10148;
      var1.Field10151 = var2.Field10151;
      var1.Field10152 = var2.Field10152;
      var1.Field10154 = var2.Field10154;
      var1.Field10147 = var2.Field10147;
      var1.Field10141 = var2.Field10141;
      var1.Field10145 = var2.Field10145;
      var1.priority = var2.priority;
      var1.anInt361 = var2.anInt361;
      var1.anInt360 = var2.anInt360;
      var1.Field10143 = Method8272(var2.Field10143);
      var1.frame2IDS = Method8272(var2.frame2IDS);
      var1.Field10144 = Method8272(var2.Field10144);
      var1.Field10146 = Method8272(var2.Field10146);
      var1.Field10143 = Method8272(var2.Field10143);
      return var1;
   }

   private static Sequence Method8276(int var0) {
      Sequence var2 = anims[var0];
      Sequence var1;
      (var1 = new Sequence()).Field10148 = var2.Field10148;
      var1.Field10151 = var2.Field10151;
      var1.Field10152 = var2.Field10152;
      var1.Field10154 = var2.Field10154;
      var1.Field10147 = var2.Field10147;
      var1.Field10141 = var2.Field10141;
      var1.Field10145 = var2.Field10145;
      var1.priority = var2.priority;
      var1.anInt361 = var2.anInt361;
      var1.anInt360 = var2.anInt360;
      var1.Field10143 = var2.Field10143;
      var1.frame2IDS = var2.frame2IDS;
      var1.Field10144 = var2.Field10144;
      var1.Field10146 = var2.Field10146;
      var1.Field10143 = var2.Field10143;
      return var1;
   }

   private static void Method8277(int var0, int var1) {
      Sequence var8 = anims[var0];

      for(var1 = 0; var1 < 4; ++var1) {
         int[] var2 = new int[var8.Field10143.length << 1];
         int[] var3 = new int[var8.frame2IDS.length << 1];
         int[] var4 = new int[var8.Field10144.length << 1];
         int[] var5 = var8.Field10146 == null ? null : new int[var8.Field10146.length << 1];
         int var6 = var8.Field10141;

         for(int var7 = 0; var7 < var6; ++var7) {
            var2[var7] = var8.Field10143[var7];
            var2[var7 + var6] = var8.Field10143[var7];
            var3[var7] = var8.frame2IDS[var7];
            var3[var7 + var6] = var8.frame2IDS[var7];
            var4[var7] = var8.Field10144[var7];
            var4[var7 + var6] = var8.Field10144[var7];
            if (var5 != null) {
               var5[var7] = var8.Field10146[var7];
               var5[var7 + var8.Field10145] = var8.Field10146[var7];
            }
         }

         var8.Field10141 <<= 1;
         var8.Field10143 = var2;
         var8.frame2IDS = var3;
         var8.Field10144 = var4;
         if (var5 != null) {
            var8.Field10146 = var5;
         }
      }

   }

   private static void Method8278(int[] var0) {
      Method8279(var0, 390);
   }

   private static void Method8279(int[] var0, int var1) {
      int[] var4 = var0;
      int var3 = var0.length;

      for(int var2 = 0; var2 < var3; ++var2) {
         int var5 = var4[var2];
         anims[var5].Field10147 = false;
         anims[var5].Field10152 = 2;
         anims[var5].priority = 2;
         if (var1 != -1) {
            anims[var5].Field10146 = anims[var1].Field10146;
         }
      }

   }

   public static void Method8280(JagexArchive var0) {
      Packet var8;
      int var1 = (var8 = new Packet(var0.readConfig("seq.dat"))).g2();
      int var2;
      if ((var2 = 15000 - var1) < 10) {
         var2 = 10;
      }

      anims = new Sequence[var1 + var2];

      for(var2 = 0; var2 < var1; ++var2) {
         anims[var2] = new Sequence();
         if (!Client.normalMem) {
            anims[var2].Method8284(var8);
         } else {
            Sequence var10000 = anims[var2];
            int var5 = var2;
            Packet var4 = var8;
            Sequence var3 = var10000;

            int var6;
            while((var6 = var4.g1()) != 0) {
               if (var6 == 1) {
                  var3.Field10141 = var4.g2();
                  var3.frame2IDS = new int[var3.Field10141];
                  var3.Field10143 = new int[var3.Field10141];
                  var3.Field10144 = new int[var3.Field10141];

                  for(var6 = 0; var6 < var3.Field10141; ++var6) {
                     var3.frame2IDS[var6] = var4.Method404();
                     var3.Field10143[var6] = -1;
                  }

                  for(var6 = 0; var6 < var3.Field10141; ++var6) {
                     var3.Field10144[var6] = var4.g1();
                  }

                  if (var5 == 11973) {
                     --var3.Field10141;
                  }
               } else if (var6 == 2) {
                  var3.Field10145 = var4.g2();
               } else if (var6 != 3) {
                  if (var6 == 4) {
                     var3.Field10147 = true;
                  } else if (var6 == 5) {
                     var3.Field10148 = var4.g1();
                  } else if (var6 == 6) {
                     var3.anInt360 = var4.g2();
                  } else if (var6 == 7) {
                     var3.anInt361 = var4.g2();
                  } else if (var6 == 8) {
                     var3.Field10151 = var4.g1();
                  } else if (var6 == 9) {
                     var3.Field10152 = var4.g1();
                  } else if (var6 == 10) {
                     var3.priority = var4.g1();
                  } else if (var6 == 11) {
                     var3.Field10154 = var4.g1();
                  } else {
                     if (var6 == 12) {
                        var4.Method404();
                        break;
                     }

                     System.out.println("Unrecognized seq.dat config code: " + var6);
                  }
               } else {
                  var6 = var4.g1();
                  var3.Field10146 = new int[var6 + 1];

                  for(int var7 = 0; var7 < var6; ++var7) {
                     var3.Field10146[var7] = var4.g1();
                  }

                  var3.Field10146[var6] = 9999999;
               }
            }

            if (var3.anInt361 > 0) {
               var3.anInt361 += 512;
            }

            if (var3.anInt360 > 0) {
               var3.anInt360 += 512;
            }

            if (var3.Field10141 == 0) {
               var3.Field10141 = 1;
               var3.frame2IDS = new int[1];
               var3.frame2IDS[0] = -1;
               var3.Field10143 = new int[1];
               var3.Field10143[0] = -1;
               var3.Field10144 = new int[1];
               var3.Field10144[0] = -1;
            }

            if (var3.Field10152 == -1) {
               if (var3.Field10146 != null) {
                  var3.Field10152 = 2;
               } else {
                  var3.Field10152 = 0;
               }
            }

            if (var3.priority == -1) {
               if (var3.Field10146 != null) {
                  var3.priority = 2;
               } else {
                  var3.priority = 0;
               }
            }
         }
      }

      if (Client.normalMem) {
         anims[15371] = Method8276(2293);
         anims[15371].anInt361 = 19706;
         anims[390] = anims[12029];
         anims[400] = anims[12028];
         anims[440] = anims[12907];
         anims[7064].Field10141 = 37;
         Method8278(new int[]{2286, 4412, 6294, 1818, 4413, 10961, 3045, 6299, 4409, 4411, 4410, 10546, 10518, 6696, 14221, 1165, 14220, 14222, 1164, 14223, 1161, 1978, 1979, 881, 6605, 4230, 10501, 3353, 830, 2273, 2293});
         Method8279(new int[]{13707}, 13704);
         Method8279(new int[]{12156}, 12152);
         Method8279(new int[]{1537}, 1534);
         anims[6964].Field10147 = false;
         anims[6964].Field10152 = 0;
         anims[6964].priority = 0;
         anims[15373] = Method8276(1663);
         anims[15373].anInt361 = 23450;
         anims[15374] = Method8276(1664);
         anims[15374].anInt361 = 23450;
         anims[15375] = Method8276(1663);
         anims[15375].anInt361 = 23451;
         anims[15376] = Method8276(1664);
         anims[15376].anInt361 = 23451;
         anims[15377] = Method8276(12573);
         anims[15377].anInt361 = -1;
         anims[15377].anInt360 = -1;
         anims[11993].anInt361 = -1;
         anims[11993].anInt360 = -1;
         anims[11787].anInt361 = 1024;
         anims[11787].anInt360 = 1024;
         anims[10383] = Method8275(10384);
         anims[10918] = Method8275(10917);
         anims[10692] = Method8275(10693);
         Method8277(772, 4);
         Method8277(773, 4);
         anims[10546].anInt361 = -1;
         anims[10546].anInt360 = -1;
         anims[4412].anInt361 = 0;
         anims[4412].anInt360 = 0;
         anims[806] = anims[1755];
         anims[1659] = anims[11974];
         anims[89] = anims[12251];
         anims[91] = anims[12252];
         anims[84] = anims[12259];
         anims[92] = anims[12250];
         anims[26] = anims[14269];
         anims[25] = anims[14270];
         anims[28] = anims[14271];
         anims[1582] = anims[8080];
         anims[1581] = anims[8084];
         anims[1580] = anims[8078];
         anims[4933] = anims[14859];
         anims[4934] = anims[14861];
         anims[4935] = anims[14860];
         anims[4933] = anims[14859];
         anims[4934] = anims[14861];
         anims[4935] = anims[14860];
         anims[1512] = anims[9439];
         anims[1514] = anims[9441];
         anims[1513] = anims[9440];
         anims[1595] = anims[9471];
         anims[1596] = anims[9473];
         anims[1597] = anims[9472];
         anims[1523] = anims[9449];
         anims[1525] = anims[9451];
         anims[1524] = anims[9450];
         anims[1562] = anims[7762];
         anims[1560] = anims[7761];
         anims[1563] = anims[7763];
         anims[284] = anims[13788];
         anims[285] = anims[13792];
         anims[287] = anims[13785];
         anims[1519] = anims[9454];
         anims[1516] = anims[9455];
         anims[1518] = anims[9458];
         anims[164] = anims[12405];
         anims[2959] = anims[12408];
         anims[165] = anims[12406];
         anims[167] = anims[12410];
         anims[2989] = anims[1590];
         anims[2986] = anims[1593];
         anims[2988] = anims[1592];
         anims[2983] = anims[1587];
         anims[2987] = anims[1591];
         anims[49] = anims[9666];
         anims[50] = anims[9667];
         anims[52] = anims[9674];
         anims[1546] = anims[260];
         anims[1547] = anims[261];
         anims[1548] = anims[264];
         anims[2611] = anims[9292];
         anims[2609] = anims[9286];
         anims[2610] = anims[9286];
         anims[2613] = anims[9293];
         anims[2605] = anims[9287];
         anims[2607] = anims[9288];
         anims[2621] = anims[9232];
         anims[2622] = anims[9231];
         anims[2620] = anims[9230];
         anims[2625] = anims[9233];
         anims[2626] = anims[9235];
         anims[2627] = anims[9234];
         anims[2628] = anims[9245];
         anims[2633] = anims[9243];
         anims[2629] = anims[9242];
         anims[2630] = anims[9239];
         anims[2637] = anims[9252];
         anims[2639] = anims[9254];
         anims[2635] = anims[9253];
         anims[2638] = anims[9247];
         anims[2644] = anims[9265];
         anims[2647] = anims[9266];
         anims[2645] = anims[9268];
         anims[2646] = anims[9269];
         anims[2655] = anims[9277];
         anims[2656] = anims[9300];
         anims[2652] = anims[9276];
         anims[2653] = anims[9278];
         anims[2654] = anims[9279];
         anims[1277] = anims[8143];
         anims[1278] = anims[8145];
         anims[1279] = anims[8144];
         anims[1093] = anims[9466];
         anims[1087] = anims[9466];
         anims[1088] = anims[9468];
         anims[1090] = anims[9467];
         anims[1507] = anims[9466];
         anims[1509] = anims[9468];
         anims[1508] = anims[9467];
         anims[1528] = anims[9487];
         anims[1529] = anims[9491];
         anims[1531] = anims[9489];
         anims[1530] = anims[9488];
         anims[1540] = anims[9459];
         anims[1542] = anims[9461];
         anims[1541] = anims[9460];
         anims[227] = anims[266];
         anims[226] = anims[267];
         anims[228] = anims[265];
         anims[1552] = anims[9434];
         anims[1550] = anims[9436];
         anims[1553] = anims[9435];
         anims[1519] = anims[9454];
         anims[1516] = anims[9455];
         anims[1518] = anims[9458];
         anims[153] = anims[11639];
         anims[154] = anims[11640];
         anims[156] = anims[11642];
         anims[714] = anims[8939];
         anims[715] = anims[8941];
         anims[2304] = anims[7185];
         anims[2561] = anims[10266];
         anims[7047] = anims[10266];
      }

   }

   public static void Method8281(int var0) {
      if (anims != null && var0 >= 0 && var0 < anims.length && anims[var0] != null) {
         anims[var0].Method8282();
      }

   }

   public final void Method8282() {
      Class518.Method8351(this.frame2IDS[0]);
   }

   public final double Method8283(int var1) {
      int var2;
      Class518 var3;
      if ((var2 = this.Field10144[var1]) == 0 && (var3 = Class518.Method8351(this.frame2IDS[var1])) != null) {
         var2 = this.Field10144[var1] = var3.Field10085;
      }

      if (var2 == 0) {
         var2 = 1;
      }

      return (double)var2;
   }

   private void Method8284(Packet var1) {
      int var2;
      while((var2 = var1.g1()) != 0) {
         if (var2 == 1) {
            this.Field10141 = var1.g2();
            this.frame2IDS = new int[this.Field10141];
            this.Field10143 = new int[this.Field10141];
            this.Field10144 = new int[this.Field10141];

            for(var2 = 0; var2 < this.Field10141; ++var2) {
               int[] var10000 = this.frame2IDS;
               var1.pos += 4;
               var10000[var2] = ((var1.Field1259[var1.pos - 4] & 255) << 24) + ((var1.Field1259[var1.pos - 3] & 255) << 16) + ((var1.Field1259[var1.pos - 2] & 255) << 8) + (var1.Field1259[var1.pos - 1] & 255);
               this.Field10143[var2] = -1;
            }

            for(var2 = 0; var2 < this.Field10141; ++var2) {
               this.Field10144[var2] = var1.g1();
            }
         } else if (var2 == 2) {
            this.Field10145 = var1.g2();
         } else if (var2 != 3) {
            if (var2 == 4) {
               this.Field10147 = true;
            } else if (var2 == 5) {
               this.Field10148 = var1.g1();
            } else if (var2 == 6) {
               this.anInt360 = var1.g2();
            } else if (var2 == 7) {
               this.anInt361 = var1.g2();
            } else if (var2 == 8) {
               this.Field10151 = var1.g1();
            } else if (var2 == 9) {
               this.Field10152 = var1.g1();
            } else if (var2 == 10) {
               this.priority = var1.g1();
            } else if (var2 == 11) {
               this.Field10154 = var1.g1();
            } else if (var2 == 12) {
               var1.Method404();
            } else {
               System.out.println("Error unrecognised seq config code: " + var2);
            }
         } else {
            var2 = var1.g1();
            this.Field10146 = new int[var2 + 1];

            for(int var3 = 0; var3 < var2; ++var3) {
               this.Field10146[var3] = var1.g1();
            }

            this.Field10146[var2] = 9999999;
         }
      }

      if (this.Field10141 == 0) {
         this.Field10141 = 1;
         this.frame2IDS = new int[1];
         this.frame2IDS[0] = -1;
         this.Field10143 = new int[1];
         this.Field10143[0] = -1;
         this.Field10144 = new int[1];
         this.Field10144[0] = -1;
      }

      if (this.Field10152 == -1) {
         if (this.Field10146 != null) {
            this.Field10152 = 2;
         } else {
            this.Field10152 = 0;
         }
      }

      if (this.priority == -1) {
         if (this.Field10146 != null) {
            this.priority = 2;
            return;
         }

         this.priority = 0;
      }

      if (this.anInt360 == 65535) {
         this.anInt360 = 0;
      }

      if (this.anInt361 == 65535) {
         this.anInt361 = 0;
      }

   }
}
