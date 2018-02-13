package net.LWJGLClient.client.a.c;

import java.io.BufferedWriter;
import java.io.FileWriter;

import net.LWJGLClient.client.a.b.VarBit;
import net.LWJGLClient.client.model.d.Player;
import net.LWJGLClient.client.a.e.JagexArchive;
import net.LWJGLClient.client.b.Rasterizer;
import net.LWJGLClient.client.c.Packet;
import net.LWJGLClient.client.model.Client;
import net.LWJGLClient.client.model.Model;
import net.LWJGLClient.client.model.a.d.ParticleDefinition;
import net.LWJGLClient.client.model.c.MemCache;
import net.LWJGLClient.client.model.d.Mobile;

public final class NPCDefinition {
   private static MemCache Field10722 = new MemCache(200);
   private static boolean Field10723 = false;
   private static BufferedWriter Field10724 = null;
   private static String[] Field10725 = new String[]{"Pick-up", null, "Talk-to", null, null};
   private static int Field10726 = 0;
   public boolean Field10727 = true;
   public boolean Field10728 = false;
   public int interactingEntity = -1;
   public int Field10730 = -1;
   private int Field10731 = -1;
   public int Field10732 = -1;
   private int Field10733 = -1;
   private static Packet Field10734;
   public int Field10735 = -1;
   public String Field10736;
   public String[] Field10737;
   public int Field10738 = -1;
   public int Field10739 = -1;
   public byte Field10740 = 1;
   private int[] Field10741;
   public static int[] NPC_ID;
   public int[] Field10743;
   public int Field10744 = -1;
   private int[] Field10745;
   private int[][] Field10746;
   public int Field10747 = -1;
   public int degreesToTurn;
   public static Client clientInstance;
   public int runAnimIndex;
   public boolean Field10751;
   private int Field10752;
   private int Field10753;
   public boolean Field10754;
   public int[] Field10755;
   public byte[] Field10756;
   private int Field10757;
   private int Field10758;
   public boolean aBoolean1541;
   public int[] Field10760;
   public boolean Field10761 = false;
   public boolean Field10762 = true;
   public static MemCache Field10763 = new MemCache(100);

   private static int Method11882(int var0) {
      if (var0 != 7046 && var0 != 2562) {
         if (var0 != 819 && var0 != 2064 && var0 != 1065) {
            if (var0 == 1205) {
               return 1210;
            } else {
               return var0 == 13699 ? 13704 : -1;
            }
         } else {
            return 824;
         }
      } else {
         return 7039;
      }
   }

   public static void Method11883() {
      Field10722.Method1512();
      Field10763.Method1512();
   }

   public static NPCDefinition Method11884(int var0) {
      Integer var1;
      if (Client.Field12156 != null && (var1 = Client.Field12156.Method11895(var0)) != null && var1 != var0) {
         var0 = var1;
      }

      if (var0 >= 0 && var0 != 65535) {
         int var7 = var0;
         int var2 = -1;
         if (var0 == 82) {
            var0 = 4697;
         } else if (var0 == 83) {
            var0 = 4698;
         }

         if (var0 >= 391 && var0 <= 396) {
            var7 = 8646;
         } else if (var0 >= 413 && var0 <= 418) {
            var7 = 7497;
         } else if (var0 >= 438 && var0 <= 443) {
            var7 = 655;
         } else if (var0 >= 2463 && var0 <= 2468) {
            var7 = 3375;
         } else if (var0 == 405) {
            var7 = 312;
         } else if (var0 >= 3852 && var0 <= 3856) {
            var7 = 599;
         } else if (var0 >= 5062 && var0 <= 5066) {
            var7 = var0 + 10;
         } else if (var0 != 4453 && var0 != 4454) {
            if (var0 == 7032) {
               var7 = 7031;
            } else if (var0 == 1879) {
               var7 = 1880;
            } else if (var0 != 1419 && var0 != 2240 && var0 != 2241 && var0 != 2593) {
               if (var0 == 551) {
                  var7 = var0;
                  var2 = 3263;
               } else if (var0 == 682) {
                  var7 = var0;
                  var2 = 5909;
               } else if (var0 >= 14378 && var0 <= 14383) {
                  var7 = var0;
                  var2 = var0 - 8015;
               } else if (var0 == 14384) {
                  var7 = 3604;
               } else if (var0 != 14385 && var0 != 14386) {
                  if (var0 != 14387 && var0 != 14388 && var0 != 14389) {
                     if (var0 == 14390) {
                        var7 = 6739;
                     } else if (var0 >= 14391 && var0 <= 14394) {
                        var7 = 1911;
                     } else if (var0 == 8984) {
                        var7 = 8983;
                     }
                  } else {
                     var7 = 3585;
                  }
               } else {
                  var7 = 1592;
               }
            } else {
               var7 = 21;
               var2 = var0;
            }
         } else {
            var7 = var0 - 6;
         }

         NPCDefinition var3;
         if ((var3 = (NPCDefinition)Field10722.Method1510(var0)) != null) {
            return var3;
         } else {
            var3 = new NPCDefinition();
            Field10722.Method1509(var0, var3);
            Field10734.pos = NPC_ID[var7];
            var3.Method11893(Field10734, var7);
            var3.interactingEntity = var0;
            if (var2 != -1) {
               Field10734.pos = NPC_ID[var2];
               NPCDefinition var11;
               (var11 = new NPCDefinition()).Method11893(Field10734, var2);
               var3.Field10760 = var11.Field10760;
               var3.Field10735 = var11.Field10735;
               var3.Field10756 = var11.Field10756;
               var3.Field10743 = var11.Field10743;
               var3.Field10736 = var11.Field10736;
               var3.Field10745 = var11.Field10745;
               var3.Field10741 = var11.Field10741;
               var3.Field10737 = var11.Field10737;
            }

            try {
               if (var0 >= 391 && var0 <= 396 || var0 >= 438 && var0 <= 443 || var0 >= 413 && var0 <= 418 || var0 >= 2463 && var0 <= 2468) {
                  var3.Field10737 = new String[5];
                  var3.Field10737[1] = "Attack";
                  var3.Field10751 = true;
                  var3.Field10735 = 0;
               } else if (var0 >= 6103 && var0 <= 6107) {
                  var3.Field10736 = "Skeleton hero";
                  var3.Field10735 = 149;
               } else if (var0 >= 13447 && var0 <= 13450) {
                  var3.Field10740 = 1;
                  var3.Field10762 = false;
               } else if (var0 != 9911 && var0 != 11886) {
                  if (var0 == 13458) {
                     var3.Field10740 = 2;
                  } else if (var0 == 212) {
                     var3.Field10737 = new String[]{"Talk-to", null, "Buy-skillcapes", "Buy-paintings", null};
                  } else if (var0 == 4247) {
                     var3.Field10737 = new String[]{"Talk-to", null, "Change-style", "Change-windows", null};
                  } else if (var0 == 10705) {
                     var3.Field10736 = "Poro";
                     var3.Field10735 = 0;
                     var3.Field10737 = new String[]{"Talk-to", null, null, null, null};
                     var3.Field10760 = new int[]{65738};
                  } else if (var0 == 1385) {
                     var3.Field10737[3] = "Travel-Neitiznot";
                  } else if (var0 >= 9767 && var0 <= 9780) {
                     var3.Field10740 = 1;
                     var3.Field10736 = "Ancient gladiator";
                  } else if (var0 >= 9912 && var0 <= 9928) {
                     var3.Field10740 = 1;
                     var3.Field10753 = var3.Field10753 * 10 / 11;
                     var3.Field10757 = var3.Field10757 * 10 / 11;
                     var3.Field10736 = "Ice demon";
                  } else if (var0 >= 9929 && var0 <= 9947) {
                     var3.Field10740 = 1;
                     var3.Field10753 = var3.Field10753 * 10 / 13;
                     var3.Field10757 = var3.Field10757 * 10 / 13;
                     var3.Field10736 = "Abyssal watcher";
                  } else if (var0 >= 9451 && var0 <= 9454) {
                     var3.Field10735 = 369;
                  } else if (var0 != 6252 && var0 != 6206) {
                     if (var0 == 4702) {
                        var3.Field10760 = new int[]{17377, 17393, 17386, 17400};
                     } else if (var0 == 949) {
                        var3.Field10737 = new String[]{"Talk-to", null, "Make-ironman", null, null};
                     } else if (var0 == 3822) {
                        var3.Field10736 = "Wilderness guide";
                        var3.Field10737 = new String[]{"Talk-to", null, "Check-kolodion", null, null};
                     } else if (var0 == 8977) {
                        var3.Field10737 = new String[]{"Talk-to", null, "Trade", null, null};
                     } else if (var0 == 943) {
                        var3.Field10737 = new String[]{"Talk-to", null, "Skip-tutorial", null, null};
                        var3.Field10736 = "Katy the Survivalist";
                        var3.Field10756 = "She definitely knows how to play Emps-World.".getBytes();
                     } else if (var0 == 6525) {
                        var3.Field10736 = "Taskmaster Matt";
                        var3.Field10756 = "He's waiting day and night for you to finish your daily tasks.".getBytes();
                        var3.Field10737 = new String[]{"Talk-to", null, "Show tasks", "Hand-in task", null, null};
                     } else if (var0 != 4447 && var0 != 4448) {
                        if (var0 == 2879) {
                           var3.Field10737[1] = null;
                           var3.Field10735 = 0;
                           var3.Method11885(252);
                        } else if (var0 == 1610) {
                           var3.Field10740 = 2;
                        } else if (var0 == 667) {
                           var3.Field10735 = 347;
                        } else if (var0 == 471) {
                           var3.Field10737 = new String[]{"Talk-to", null, "EP Shop", "EC Shop", null};
                        } else if ((var0 < 5062 || var0 > 5066) && var0 != 7032) {
                           if (var0 != 4453 && var0 != 4454) {
                              if (var0 != 5429 && var0 != 5081 && var0 != 1530) {
                                 if (var0 == 6524) {
                                    var3.Field10737 = new String[]{"Talk-to", null, "Decant-4", null, null};
                                 } else if (var0 == 8863) {
                                    var3.Field10747 = 813;
                                    var3.Field10738 = 1205;
                                 } else if (var0 == 8983) {
                                    var3.Field10740 = 1;
                                    var3.Field10757 = Math.round((float)var3.Field10757 * 0.7F);
                                    var3.Field10753 = Math.round((float)var3.Field10753 * 0.7F);
                                    var3.Field10737 = new String[]{"Pick-up", null, "Talk-to", null, null};
                                 } else if (var0 == 8984) {
                                    var3.Field10740 = 1;
                                    var3.Field10757 = Math.round((float)var3.Field10757 * 0.7F);
                                    var3.Field10753 = Math.round((float)var3.Field10753 * 0.7F);
                                    var3.Field10737 = Field10725;
                                 } else if (var0 == 14384) {
                                    var3.Field10736 = "Baby-Corp";
                                    var3.Field10760 = new int[]{65702};
                                    var3.Field10743 = new int[]{65701};
                                    var3.Field10737 = Field10725;
                                 } else if (var0 != 551 && var0 != 682) {
                                    if (var0 == 2881) {
                                       var3.Field10744 = 2;
                                    } else if (var0 == 2882) {
                                       var3.Field10744 = 0;
                                    } else if (var0 == 2883) {
                                       var3.Field10744 = 1;
                                    } else if (var0 == 8352) {
                                       var3.Field10744 = 6;
                                    } else if (var0 == 8353) {
                                       var3.Field10744 = 128;
                                    } else if (var0 == 8354) {
                                       var3.Field10744 = 129;
                                    } else if (var0 == 8361) {
                                       var3.Field10744 = 6;
                                    } else if (var0 == 8362) {
                                       var3.Field10744 = 128;
                                    } else if (var0 == 8363) {
                                       var3.Field10744 = 129;
                                    } else if (var0 == 795) {
                                       var3.Field10735 = 531;
                                       var3.Field10760 = new int[]{65747, 379, 368, 468, 440, 10706, 339};
                                       var3.Field10735 = 126;
                                       var3.Field10747 = 813;
                                       var3.Field10738 = 1205;
                                       var7 = ItemDef.Field10614;
                                       var3.Field10745 = new int[]{41, 61, 4550, 12224, 25238, 6798, 4540, 1839, 1562, 31287, 31410};
                                       var3.Field10741 = new int[]{43484, 39386, 41193, 43484, 43484, 42209, 41187, 33715, 33735, var7 - 20, var7};
                                    } else if (var0 == 1977) {
                                       var3.Field10735 = 531;
                                       var3.Field10760 = new int[]{65747, 6223, 6226, 6219, 6365};
                                       var3.Field10735 = 126;
                                       var3.Field10747 = 813;
                                       var3.Field10738 = 1205;
                                       var7 = ItemDef.Field10617;
                                       var3.Field10745 = new int[]{1839, 1562, 31287, 31410};
                                       var3.Field10741 = new int[]{6068, 6088, var7 - 20, var7};
                                    } else if (var0 >= 14378 && var0 <= 14383) {
                                       var3.Field10736 = var3.Field10736.replace("Zamorak", "Saradomin");

                                       for(var7 = 0; var7 < var3.Field10741.length; ++var7) {
                                          if (var3.Field10741[var7] > 600) {
                                             var3.Field10741[var7] += 40830;
                                             var3.Field10741[var7] &= 65535;
                                          }
                                       }

                                       if (var0 == 14378) {
                                          var3.Field10760[5] = 12842;
                                       }
                                    } else if (var0 != 14385 && var0 != 14386) {
                                       if (var0 >= 14387 && var0 <= 14389) {
                                          var3.Field10747 = 5326;
                                          var3.Field10738 = 5325;
                                          var3.Field10739 = 5325;
                                          var3.Field10745 = new int[]{960, 33728, 22443, 11200, 56256, 50099};
                                          var3.Field10741 = new int[]{8, 8, 36928, 36928, 43072, 43072};
                                          if (var0 != 14388 && var0 != 14389) {
                                             var3.Field10736 = "Kolodion";
                                             var3.Field10735 = 420;
                                             var3.Field10756 = "A miniature version of Kolodion.".getBytes();
                                             var3.Field10740 = 4;
                                             var3.Field10757 = var3.Field10757 * 5 / 2;
                                             var3.Field10753 = var3.Field10753 * 5 / 2;
                                          } else {
                                             var3.Field10736 = "Mini Kolodion";
                                             var3.Field10756 = "The wilderness' greatest threat.".getBytes();
                                             var3.Field10735 = 0;
                                             var3.Field10740 = 1;
                                             var3.Field10757 /= 2;
                                             var3.Field10753 /= 2;
                                             var3.Field10737 = Field10725;
                                          }
                                       } else if (var0 == 14390) {
                                          var3.Field10736 = "Baby nex";
                                          var3.Field10737 = Field10725;
                                          var3.Field10760 = new int[]{65751};
                                          var3.Field10743 = new int[]{65750};
                                          var3.Field10752 = 0;
                                          var3.Field10758 = 0;
                                       } else if (var0 >= 14391 && var0 <= 14394) {
                                          var7 = var0 - 14391;
                                          String[] var9 = new String[]{"Green", "Blue", "Red", "Black"};
                                          int[] var8 = new int[]{-17920, 5632, 29718, 37763};
                                          var3.Field10736 = var9[var7] + " pet dragon";
                                          var3.Field10737 = Field10725;
                                          var3.Field10760 = new int[]{65749};
                                          var3.Field10743 = new int[]{65748};
                                          var3.Field10740 = 1;
                                          var3.Field10752 = var3.Field10758 = 0;
                                          var3.Field10745 = new int[]{6, 269, 1297, 1688, 1701, 8767, 9293, 31888, 31898, 32917, 34068, 36659, 36750, 36756, 36763, 36767, 36768, 36772, 36777, 36781, 36789};
                                          var3.Field10741 = new int[var3.Field10745.length];
                                          int var10;
                                          if (var7 <= 1) {
                                             for(var10 = 0; var10 < var3.Field10741.length; ++var10) {
                                                var3.Field10741[var10] = var3.Field10745[var10];
                                                if (var10 >= 11) {
                                                   var3.Field10741[var10] += var8[var7];
                                                } else if (var10 >= 7) {
                                                   var3.Field10741[var10] += var8[var7] + 1024 - 4;
                                                }

                                                var3.Field10741[var10] &= 65535;
                                             }
                                          } else {
                                             for(var10 = 0; var10 < var3.Field10741.length; ++var10) {
                                                var3.Field10741[var10] = var3.Field10745[var10];
                                                if (var10 >= 11) {
                                                   var3.Field10741[var10] /= 128;
                                                   var3.Field10741[var10] <<= 7;
                                                   if (var10 >= 0) {
                                                      var3.Field10741[var10] += var8[var7];
                                                   }
                                                } else if (var10 >= 7) {
                                                   var3.Field10741[var10] += var8[var7] + 1024 - 4;
                                                }

                                                var3.Field10741[var10] &= 65535;
                                             }
                                          }
                                       } else if (var0 == 6739) {
                                          var3.Field10736 = "Present imp";
                                          var3.Field10737 = Field10725;
                                          var3.Field10760 = new int[]{65737};
                                          var3.Field10743 = new int[]{65737};
                                       } else if (var0 == 3254) {
                                          var3.Field10736 = "Hundig";
                                          var3.Field10737 = new String[]{"Talk-to", null, "Get-task", "Trade", "Rewards"};
                                          if (var0 == 3254) {
                                             var3.Field10760[8] = 9955;
                                          }

                                          var3.Method11885(214);
                                       } else if (var0 != 1597 && var0 != 1598 && var0 != 8274 && var0 != 8275 && var0 != 1334) {
                                          if (var0 == 12230) {
                                             var3.Field10736 = "Shenven";
                                             var3.Field10735 = 0;
                                             var3.Field10737 = new String[]{"Talk-to", null, "Get-task", "Trade", "Rewards"};
                                             var3.Field10760 = new int[]{65650, 390, 414, 11783, 11772, 11777, 11782, 11779, 11791};
                                             var2 = ParticleDefinition.Method7792("120_cape", Rasterizer.Field9964[1811]);
                                             var3.Field10746 = new int[][]{{145, var2}, {151, var2}, {149, var2}, {148, var2}, {147, var2}, {146, var2}, {163, var2}, {162, var2}, {166, var2}, {122, var2}, {121, var2}};
                                          } else if (var0 == 8624) {
                                             var3.Field10757 = var3.Field10757 * 3 / 4;
                                             var3.Field10753 = var3.Field10753 * 3 / 4;
                                             var3.Field10741 = new int[]{4025};
                                          } else if (var0 != 1419 && var0 != 2240 && var0 != 2241 && var0 != 2593) {
                                             if (var0 != 5079 && var0 != 5080) {
                                                if (var0 == 3788) {
                                                   var3.Field10737[2] = "Rewards-items";
                                                   var3.Field10737[3] = "Rewards-exp";
                                                } else if (var0 == 1304) {
                                                   var3.Field10737[2] = "Travel-Neitiznot";
                                                } else if (var0 == 2588) {
                                                   var3.Field10737[2] = "Buy-GA";
                                                } else if (var0 == 802) {
                                                   var3.Field10737[2] = "Buy-Elixir";
                                                } else if (var0 == 4515) {
                                                   var3.Field10737[2] = "Change-Lunars";
                                                } else if (var0 == 1001) {
                                                   var3.Field10737[2] = "Change-Normals";
                                                   var3.Field10737[3] = "Change-Ancients";
                                                } else if (var0 == 3029) {
                                                   var3.Field10737[2] = "Trade";
                                                } else if (var0 == 2776) {
                                                   var3.Field10736 = "Healer";
                                                   var3.Method11885(363);
                                                   var3.Method11885(27754);
                                                   var3.Method11885(18980);
                                                   var3.Field10760[1] = 3821;
                                                   var3.Field10760[2] = 337;
                                                   var3.Field10760[4] = 6030;
                                                   var3.Field10745 = new int[]{6798, 57280, 54183};
                                                   var3.Field10741 = new int[]{110, 6348, 6340};
                                                   var3.Field10737[2] = "Heal";
                                                } else if (var0 == 13 || var0 == 688 || var0 == 3259 || var0 >= 3264 && var0 <= 3267) {
                                                   var3.Field10735 = 10;
                                                   if (var0 == 3250 || var0 == 3252 || var0 == 3255 || var0 == 3256 || var0 == 3259) {
                                                      var3.Method11885(214);
                                                   }
                                                } else if (var0 == 570) {
                                                   var3.Method11885(311);
                                                } else if (var0 == 5517 || var0 == 5516 || var0 == 5518 || var0 == 5519 || var0 == 384 || var0 >= 5141 && var0 <= 5145) {
                                                   var3.Method11885(230);
                                                } else if (var0 == 3299) {
                                                   var3.Method11885(44912);
                                                   var3.Method11886(55232, 7465);
                                                } else if (var0 != 1305 && var0 != 1317 && var0 != 1309 && var0 != 1318 && var0 != 1278 && var0 != 1296 && var0 != 1297 && var0 != 1302 && var0 != 5515 && var0 != 5514) {
                                                   if (var0 != 3250 && var0 != 3252 && var0 != 3255 && var0 != 3256) {
                                                      if (var0 == 6222) {
                                                         var3.Field10740 = 4;
                                                         var3.Field10757 = (var3.Field10757 << 2) / 5;
                                                         var3.Field10753 = (var3.Field10753 << 2) / 5;
                                                      } else if (var0 != 1830 && var0 != 3372) {
                                                         if (var0 == 3593) {
                                                            var3.Field10736 = "Smoke Demon Champion";
                                                            var3.Field10740 = 4;
                                                            var3.Field10757 = var3.Field10757 * 5 / 2;
                                                            var3.Field10753 = var3.Field10753 * 5 / 2;
                                                            var3.Field10735 = 650;
                                                         } else if (var0 == 1612) {
                                                            var3.Field10735 = 115;
                                                         } else if (var0 == 1620) {
                                                            var3.Field10735 = 111;
                                                         } else if (var0 >= 5926 && var0 <= 5929) {
                                                            var3.Field10737 = new String[5];
                                                            var3.Field10737[0] = "Talk-to";
                                                            var3.Field10737[1] = null;
                                                            var3.Field10737[2] = null;
                                                            var3.Field10737[3] = null;
                                                            var3.Field10737[4] = null;
                                                         } else if (var0 != 5420 && var0 != 5421) {
                                                            if (var0 == 2892) {
                                                               var3.Field10761 = true;
                                                            } else if (var0 != 6203) {
                                                               if (var3.Field10736 != null && var3.Field10736.toLowerCase().contains("fishing spot")) {
                                                                  var3.Field10753 = 16;
                                                                  var3.Field10757 = 16;
                                                                  var3.Field10727 = false;
                                                                  var3.Field10761 = true;
                                                               } else if (var0 == 3334) {
                                                                  var3.Field10753 = var3.Field10753 * 6 / 10;
                                                                  var3.Field10757 = var3.Field10757 * 6 / 10;
                                                                  var3.Field10740 = 3;
                                                                  var7 = ParticleDefinition.Method7791("wildy_wyrm");
                                                                  var3.Field10746 = new int[][]{{799, var7}, {800, var7}, {802, var7}, {804, var7}, {804, var7}, {807, var7}, {752, var7}, {792, var7}, {791, var7}, {790, var7}, {789, var7}, {787, var7}, {786, var7}, {785, var7}, {784, var7}, {793, var7}, {794, var7}, {796, var7}, {750, var7}, {751, var7}, {507, var7}, {753, var7}, {805, var7}, {803, var7}, {801, var7}, {797, var7}, {795, var7}, {783, var7}, {744, var7}, {745, var7}, {746, var7}, {788, var7}, {749, var7}, {793, var7}, {794, var7}, {796, var7}, {747, var7}, {748, var7}, {488, var7}, {504, var7}, {505, var7}, {506, var7}, {491, var7}, {508, var7}, {754, var7}, {1117, var7}, {755, var7}, {1118, var7}, {1093, var7}, {1094, var7}, {1095, var7}, {901, var7}, {902, var7}, {473, var7}, {474, var7}, {743, var7}, {475, var7}, {744, var7}, {476, var7}};
                                                               } else if (var0 == 2417) {
                                                                  var3.Field10753 = (var3.Field10753 << 3) / 10;
                                                                  var3.Field10757 = (var3.Field10757 << 3) / 10;
                                                                  var3.Field10740 = 3;
                                                                  var3.Field10737 = new String[]{null, "Investigate", null, null, null};
                                                               } else if (var0 == 8133) {
                                                                  var3.Field10753 = var3.Field10753 * 7 / 10;
                                                                  var3.Field10757 = var3.Field10757 * 7 / 10;
                                                                  var3.Field10740 = 3;
                                                                  var3.Field10735 = 516;
                                                                  var3.Field10744 = 6;
                                                               } else if (var0 == 8132) {
                                                                  var3.Field10736 = "Corporeal Beast";
                                                                  var3.Field10737 = new String[5];
                                                                  var3.Field10737[1] = "Attack";
                                                                  var3.Field10756 = "An undead vision of supernatural horror.".getBytes();
                                                                  var3.Field10735 = 752;
                                                               } else if (var0 != 9463 && var0 != 9462) {
                                                                  if (var0 == 3852) {
                                                                     var3.Field10736 = "Thomy";
                                                                     var3.Field10760 = new int[]{210, 249, 58351, 13307, 27731, 18954, 10684, 20154, 20120, 20138, 53327};
                                                                     var3.Field10745 = new int[]{6798, 57280, 54183};
                                                                     var3.Field10741 = new int[]{110, 27544, 26516};
                                                                     var3.Field10737 = new String[]{null, "Attack", null, null, null};
                                                                     var3.Field10735 = 126;
                                                                     var3.Field10747 = 7047;
                                                                     var3.Field10738 = 7046;
                                                                  } else if (var0 == 3853) {
                                                                     var3.Field10736 = "Thomy";
                                                                     var3.Field10760 = new int[]{210, 249, 58351, 13307, 58373, 18948, 10684, 20162, 20126, 20145, 53309};
                                                                     var3.Field10745 = new int[]{6798, 57280, 54183};
                                                                     var3.Field10741 = new int[]{110, 15004, 15128};
                                                                     var3.Field10737 = new String[]{null, "Attack", null, null, null};
                                                                     var3.Field10735 = 126;
                                                                     var3.Field10747 = 808;
                                                                     var3.Field10738 = 819;
                                                                  } else if (var0 == 3854) {
                                                                     var3.Field10736 = "Thomy";
                                                                     var3.Field10760 = new int[]{210, 249, 58351, 13307, 42617, 18915, 10684, 20160, 20124, 20143, 53330};
                                                                     var3.Field10745 = new int[]{6798, 57280, 54183};
                                                                     var3.Field10741 = new int[]{110, 6348, 6340};
                                                                     var3.Field10737 = new String[]{null, "Attack", null, null, null};
                                                                     var3.Field10735 = 126;
                                                                     var3.Field10747 = 813;
                                                                     var3.Field10738 = 1205;
                                                                  } else if (var0 == 3855 || var0 == 3856) {
                                                                     var3.Field10736 = "Thomy";
                                                                     var3.Field10760 = new int[]{65295, 186, 40906, 58355, 58347, 40230, 10218, 53327, 246};
                                                                     var3.Field10743 = new int[]{39406, 40039, 39223};
                                                                     if (var0 == 3855) {
                                                                        var3.Field10737 = new String[]{"Talk-to", null, "Show tasks", "Tutorial", "Skillcapes"};
                                                                     } else {
                                                                        var3.Field10737 = new String[]{"Talk-to", null, null, null, null};
                                                                     }

                                                                     var3.Field10735 = 0;
                                                                     var3.Field10747 = 808;
                                                                     var3.Field10738 = 819;
                                                                     var7 = ParticleDefinition.Method7791("comp_cape");
                                                                     var3.Field10746 = new int[][]{{494, var7}, {488, var7}, {485, var7}, {476, var7}, {482, var7}, {479, var7}, {491, var7}};
                                                                     var3.Field10745 = new int[]{6798, 8741, 25238, 4626, 7073, 7064, 5916, 4882, 55232};
                                                                     var3.Field10741 = new int[]{16, 12, 24094, 6439, 8, 0, 127, 127, 8};
                                                                  }
                                                               } else {
                                                                  var3.Field10753 = (var3.Field10753 << 3) / 10;
                                                                  var3.Field10757 = (var3.Field10757 << 3) / 10;
                                                                  var3.Field10740 = 2;
                                                                  if (var0 == 9462) {
                                                                     var3.Field10737 = new String[]{"Investigate", "Attack", null, null, null};
                                                                  }
                                                               }
                                                            } else {
                                                               int[] var5 = var3.Field10760;
                                                               int var4 = var3.Field10760.length;

                                                               for(var2 = 0; var2 < var4; ++var2) {
                                                                  var7 = var5[var2];
                                                                  if (Model.Field2772 != null) {
                                                                     Model.Field2772[var7] = true;
                                                                  }
                                                               }

                                                               var3.Field10728 = true;
                                                            }
                                                         } else {
                                                            var3.Field10735 = 158;
                                                         }
                                                      } else {
                                                         var3.Field10757 = var3.Field10757 * 3 / 4;
                                                         var3.Field10753 = var3.Field10753 * 3 / 4;
                                                      }
                                                   } else {
                                                      var3.Method11885(214);
                                                   }
                                                } else {
                                                   var3.Method11885(252);
                                                }
                                             } else {
                                                var3.Field10737 = new String[5];
                                             }
                                          } else {
                                             var3.Field10737 = new String[]{"Talk-to", null, "Exchange", "Bank", "Sets"};
                                             var3.Field10747 = 9664;
                                             var3.Field10738 = 823;
                                          }
                                       } else {
                                          var3.Field10737 = new String[]{"Talk-to", null, "Get-task", "Trade", "Rewards"};
                                       }
                                    } else {
                                       var3.Field10736 = "Obsidian dragon";
                                       var3.Field10760 = new int[]{(var0 == 14385 ? 65705 : 65706) - 1, 57960};
                                       var3.Field10735 = 302;
                                    }
                                 } else {
                                    var3.Field10736 = var0 == 551 ? "Weapon shopkeeper" : "Armour shopkeeper";
                                    var3.Field10735 = 0;
                                    var3.Field10737 = new String[]{"Talk-to", null, "Trade", null, null};
                                    if (var0 == 551) {
                                       var3.Field10747 = 813;
                                       var3.Field10738 = 1205;
                                    }
                                 }
                              } else {
                                 var3.Field10737 = new String[5];
                                 var3.Field10737 = Field10725;
                              }
                           } else {
                              var3.Field10747 = 5239;
                              var3.Field10738 = 5239;
                              var3.Field10737 = new String[5];
                           }
                        } else {
                           var3.Field10747 = 5174;
                           var3.Field10738 = 5174;
                           var3.Field10737 = new String[5];
                        }
                     } else {
                        var3.Field10737 = new String[5];
                     }
                  } else {
                     var3.Field10740 = 3;
                  }
               } else {
                  float var12 = 1.25F;
                  if (var0 == 9911) {
                     var3.Field10736 = "Har'Lakk";
                     var3.Field10735 = 1061;
                  } else if (var0 == 11886) {
                     var3.Field10736 = "Yk'Lagor";
                     var3.Field10735 = 1074;
                     var12 = 1.175F;
                  }

                  var3.Field10740 = 3;
                  var3.Field10762 = false;
                  var3.Field10757 = Math.round((float)var3.Field10757 * var12);
                  var3.Field10753 = Math.round((float)var3.Field10753 * var12);
               }

               if (var0 != 1880 && var0 != 1885 && var0 != 1888 && var0 != 1892 && var0 != 1896 && var0 != 499 && var0 != 1904 && var0 != 1673 && var0 != 1670) {
                  if (var0 == 6258) {
                     var3.Field10747 = 7047;
                  }
               } else {
                  var3.Field10738 = 819;
                  var3.Field10747 = 809;
               }
            } catch (Exception var6) {
               var6.printStackTrace();
            }

            var3.Field10739 = Method11882(var3.Field10738);
            return var3;
         }
      } else {
         return null;
      }
   }

   private void Method11885(int var1) {
      int[] var2 = new int[this.Field10760.length + 1];
      System.arraycopy(this.Field10760, 0, var2, 0, this.Field10760.length);
      var2[this.Field10760.length] = var1;
      this.Field10760 = var2;
   }

   private void Method11886(int var1, int var2) {
      int[] var3 = new int[this.Field10745.length + 1];
      int[] var4 = new int[this.Field10741.length + 1];
      System.arraycopy(this.Field10745, 0, var3, 0, this.Field10745.length);
      System.arraycopy(this.Field10741, 0, var4, 0, this.Field10741.length);
      var3[this.Field10745.length] = 55232;
      var4[this.Field10741.length] = 7465;
      this.Field10745 = var3;
      this.Field10741 = var4;
   }

   public final Model Method11887() {
      while(this.Field10755 != null) {
         NPCDefinition var1;
         if ((var1 = this.Method11888()) == null) {
            return null;
         }

        // this = var1;
      }

      if (this.Field10743 == null) {
         return null;
      } else {
         boolean var3 = false;

         int var2;
         for(var2 = 0; var2 < this.Field10743.length; ++var2) {
            if (!Model.Method14477(this.Field10743[var2])) {
               var3 = true;
            }
         }

         if (var3) {
            return null;
         } else {
            Model[] var5 = new Model[this.Field10743.length];

            for(int var4 = 0; var4 < this.Field10743.length; ++var4) {
               var5[var4] = Model.Method14476(this.Field10743[var4], true, false);
            }

            Model var6;
            if (var5.length == 1) {
               var6 = var5[0];
            } else {
               var6 = new Model(var5.length, var5);
            }

            if (this.Field10745 != null) {
               for(var2 = 0; var2 < this.Field10745.length; ++var2) {
                  var6.recolor(this.Field10745[var2], this.Field10741[var2]);
               }
            }

            return var6;
         }
      }
   }

   public final NPCDefinition Method11888() {
      int var1 = -1;
      if (this.Field10731 > VarBit.Field12723.length) {
         return null;
      } else {
         if (this.Field10731 != -1) {
            VarBit var4;
            int var2 = (var4 = VarBit.Field12723[this.Field10731]).Field12724;
            int var3 = var4.Field12725;
            var1 = var4.Field12726;
            var1 = Client.Field12656[var1 - var3];
            var1 &= clientInstance.Field12444[var2] >> var3;
         } else if (this.Field10733 != -1) {
            var1 = clientInstance.Field12444[this.Field10733];
         }

         return var1 >= 0 && var1 < this.Field10755.length && this.Field10755[var1] != -1 ? Method11884(this.Field10755[var1]) : null;
      }
   }

   public static void Method11889(JagexArchive var0) {
      Field10734 = new Packet(var0.readConfig("npc.dat"));
      Packet var3 = new Packet(var0.readConfig("npc.idx"));
      Method11890();
      NPC_ID = new int[(Field10726 = var3.g2()) + 100];
      int var1 = 2;

      for(int var2 = 0; var2 < Field10726; ++var2) {
         NPC_ID[var2] = var1;
         var1 += var3.g2();
      }

   }

   public static void Method11890() {
      Field10763.Method1512();
      Field10722.Method1512();
   }

   public static void Method11891() {
      Field10763 = null;
      NPC_ID = null;
      Field10722 = null;
      Field10734 = null;
      clientInstance = null;
   }

   public final Model Method11892(int var1, int var2, int[] var3, int var4, int var5, int var6, int var7, int var8, Mobile var9) {
      while(true) {
         int var10 = this.interactingEntity;
         if (this.Field10755 == null) {
            Model var14;
            if ((var14 = (Model)Field10763.Method1510(var10)) == null) {
               if (Player.Field4177++ > 2) {
                  return null;
               }

               boolean var12 = false;

               for(int var15 = 0; var15 < this.Field10760.length; ++var15) {
                  if (!Model.Method14477(this.Field10760[var15])) {
                     var12 = true;
                  }
               }

               if (var12) {
                  return null;
               }

               Model[] var16 = new Model[this.Field10760.length];

               for(var8 = 0; var8 < this.Field10760.length; ++var8) {
                  var16[var8] = Model.Method14476(this.Field10760[var8], true, true);
                  if (this.Field10760[var8] == 65747 && this.interactingEntity == 795) {
                     var16[var8].Method14493(4, -11, 6);
                  }
               }

               if (var16.length == 1) {
                  var14 = var16[0];
               } else {
                  var14 = new Model(var16.length, var16);
               }

               if (var14 == null) {
                  return null;
               }

               if (this.Field10745 != null) {
                  for(var8 = 0; var8 < this.Field10745.length; ++var8) {
                     var14.recolor(this.Field10745[var8], this.Field10741[var8]);
                  }
               }

               if (this.Field10746 != null && Client.Field12225) {
                  var14.Method14460(this.Field10746);
               }

               var14.Method14482();
               if (Client.normalMem) {
                  var14.Method14502(84 + this.Field10752, 1000 + this.Field10758, -90, -580, -90, true);
               } else {
                  var14.Method14502(64 + this.Field10752, 850 + this.Field10758, -30, -50, -30, true);
               }

               var14.Method14480(this.interactingEntity);
               Field10763.Method1509(var10, var14);
            }

            Model var13 = Model.Method14483(var14, var9 == null ? -1 : var9.boundExtentX, var9 == null ? -1 : var9.boundExtentY, var9 == null ? -1L : var9.Field1271, 1);
            if (var2 != -1 && var1 != -1) {
               var13.Method14484(var3, var1, var2, var7);
            } else if (var2 != -1 && var4 != -1) {
               var13.Method14521(var2, var4, var5, var6, var7);
            } else if (var2 != -1) {
               var13.Method14519(var2, var7);
            }

            var13.Method14500();
            if (this.Field10757 != 128 || this.Field10753 != 128) {
               var13.Method14498((float)this.Field10757, (float)this.Field10757, (float)this.Field10753);
            }

            if (var13.Field2750 && (this.Field10744 >= 0 && this.Field10744 < 255 || var9 != null && var9.loopCycleStatus > Client.currentTime)) {
               var13.Method14480(this.interactingEntity);
            }

            if (var9 != null) {
               if (var13.Field2750) {
                  var9.Field1273 = var13.Field10127;
                  var9.Field1272 = var13.Field2846;
               } else {
                  var13.Field10127 = var9.Field1273;
                  var13.Field2846 = var9.Field1272;
               }
            }

            if (this.Field10740 == 1) {
               var13.Field2855 = true;
            }

            if (this.interactingEntity == 6203) {
               var13.Field2837 = 10;
               var13.Field2834 = null;
            }

            return var13;
         }

         NPCDefinition var11;
         if ((var11 = this.Method11888()) == null) {
            return null;
         }

         //var8 = var8;
         //var7 = var7;
         //var6 = var6;
         //var5 = var5;
         //var4 = var4;
        // var3 = var3;
         //var2 = var2;
         //var1 = var1;
         //this = var11;
      }
   }

   private void Method11893(Packet var1, int var2) {
      this.interactingEntity = var2;

      while(true) {
         while((var2 = var1.g1()) != 0) {
            int var3;
            if (var2 == 1) {
               var2 = var1.g1();
               this.Field10760 = new int[var2];

               for(var3 = 0; var3 < var2; ++var3) {
                  this.Field10760[var3] = var1.g2();
               }
            } else if (var2 == 2) {
               this.Field10736 = var1.Method406();
            } else if (var2 == 3) {
               this.Field10756 = var1.Method407();
            } else if (var2 == 12) {
               this.Field10740 = var1.Method400();
            } else if (var2 == 13) {
               this.Field10747 = var1.g2();
            } else if (var2 == 14) {
               this.Field10738 = var1.g2();
            } else if (var2 == 17) {
               this.Field10738 = var1.g2();
               this.Field10732 = var1.g2();
               this.runAnimIndex = var1.g2();
               this.Field10730 = var1.g2();
               if (this.Field10738 == 65535) {
                  this.Field10738 = -1;
               }

               if (this.Field10732 == 65535) {
                  this.Field10732 = -1;
               }

               if (this.runAnimIndex == 65535) {
                  this.runAnimIndex = -1;
               }

               if (this.Field10730 == 65535) {
                  this.Field10730 = -1;
               }
            } else if (var2 >= 30 && var2 < 40) {
               if (this.Field10737 == null) {
                  this.Field10737 = new String[5];
               }

               this.Field10737[var2 - 30] = var1.Method406();
               if (this.Field10737[var2 - 30].equalsIgnoreCase("hidden")) {
                  this.Field10737[var2 - 30] = null;
               }
            } else if (var2 == 40) {
               var2 = var1.g1();
               this.Field10745 = new int[var2];
               this.Field10741 = new int[var2];

               for(var3 = 0; var3 < var2; ++var3) {
                  this.Field10745[var3] = var1.g2();
                  this.Field10741[var3] = var1.g2();
               }
            } else if (var2 == 60) {
               var2 = var1.g1();
               this.Field10743 = new int[var2];

               for(var3 = 0; var3 < var2; ++var3) {
                  this.Field10743[var3] = var1.g2();
               }
            } else if (var2 == 90) {
               var1.g2();
            } else if (var2 == 91) {
               var1.g2();
            } else if (var2 == 92) {
               var1.g2();
            } else if (var2 == 93) {
               this.Field10754 = false;
            } else if (var2 == 95) {
               this.Field10735 = var1.g2();
            } else if (var2 == 97) {
               this.Field10757 = var1.g2();
            } else if (var2 == 98) {
               this.Field10753 = var1.g2();
            } else if (var2 == 99) {
               this.aBoolean1541 = true;
            } else if (var2 == 100) {
               this.Field10752 = var1.Method400();
            } else if (var2 == 101) {
               this.Field10758 = var1.Method400() * 5;
            } else if (var2 == 102) {
               this.Field10744 = var1.g2();
            } else if (var2 == 103) {
               this.degreesToTurn = var1.g2();
            } else if (var2 == 106) {
               this.Field10731 = var1.g2();
               if (this.Field10731 == 65535) {
                  this.Field10731 = -1;
               }

               this.Field10733 = var1.g2();
               if (this.Field10733 == 65535) {
                  this.Field10733 = -1;
               }

               var2 = var1.g1();
               this.Field10755 = new int[var2 + 1];

               for(var3 = 0; var3 <= var2; ++var3) {
                  this.Field10755[var3] = var1.g2();
                  if (this.Field10755[var3] == 65535) {
                     this.Field10755[var3] = -1;
                  }
               }
            } else if (var2 == 107) {
               this.Field10751 = false;
            }
         }

         return;
      }
   }

   private NPCDefinition() {
      this.interactingEntity = -1;
      this.degreesToTurn = 32;
      this.runAnimIndex = -1;
      this.Field10751 = true;
      this.Field10753 = 128;
      this.Field10754 = true;
      this.Field10757 = 128;
      this.aBoolean1541 = false;
   }

   public static void Method11894() throws Exception {
      BufferedWriter var0 = new BufferedWriter(new FileWriter(System.getProperty("user.home") + "/Desktop/maps/npcemotes.cfg"));

      for(int var1 = 0; var1 < NPC_ID.length; ++var1) {
         NPCDefinition var2;
         if ((var2 = Method11884(var1)) != null) {
            var0.write("npc=" + var1 + "\t\t\t" + var2.Field10747 + "\t\t\t" + var2.Field10738 + "\t\t\t" + Method11882(var2.Field10738) + "\t\t\t" + var2.Field10736);
            var0.newLine();
         }
      }

      var0.flush();
      var0.close();
   }
}
