package net.LWJGLClient.client.a.c;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import net.LWJGLClient.client.a.a.Class518;
import net.LWJGLClient.client.a.a.Sequence;
import net.LWJGLClient.client.model.Model;
import net.LWJGLClient.client.model.a.d.ParticleDefinition;
import net.LWJGLClient.client.a.e.JagexArchive;
import net.LWJGLClient.client.b.b.GraphicsDisplay;
import net.LWJGLClient.client.c.Packet;
import net.LWJGLClient.client.model.Client;
import net.LWJGLClient.client.model.a.c.Class888;
import net.LWJGLClient.client.model.c.MemCache;

public final class ObjectDefinition {
   private static MemCache Field10540 = new MemCache(500);
   public static boolean Field10541 = false;
   private static BufferedWriter Field10542 = null;
   private static Map Field10543 = null;
   private static Map Field10544 = null;
   private static Map Field10545 = null;
   private static Object Field10546 = new Object();
   private static int Field10547;
   public static int Field10548 = 0;
   public boolean Field10549;
   private byte Field10550;
   private int Field10551;
   public String Field10552;
   private int Field10553;
   private static final Model[] Field10554;
   private byte Field10555;
   public int Field10556;
   public int Field10557;
   public int Field10558;
   private int[] Field10559;
   private int Field10560;
   public int Field10561;
   private boolean Field10562;
   private static Packet Field10563;
   public int Field10564 = -1;
   private static int[] Field10565;
   public boolean Field10566;
   public int Field10567;
   public int[] Field10568;
   private int Field10569;
   public int Field10570;
   public boolean Field10571 = false;
   public boolean Field10572 = false;
   public boolean Field10573 = false;
   public boolean Field10574;
   public static Client clientInstance;
   private boolean Field10576;
   public boolean Field10577;
   public int Field10578;
   private boolean Field10579;
   private int Field10580;
   public int[] Field10581;
   public int Field10582;
   public int Field10583;
   public int[] Field10584;
   public byte[] Field10585;
   public boolean Field10586;
   public boolean Field10587;
   public boolean Field10588;
   private static MemCache Field10589;
   private static MemCache Field10590;
   public int Field10591;
   private int Field10592;
   private int Field10593 = -1;
   private int[] Field10594;
   private int[] Field10595;
   private int[] Field10596;
   private int[][] Field10597;
   public String[] Field10598;

   static {
      if (GraphicsDisplay.Field2678 && GraphicsDisplay.Field2667) {
         GraphicsDisplay.Method1000();
      }

      Field10554 = new Model[4];
      Field10589 = new MemCache(250);
      Field10590 = new MemCache(500);
   }

   private static void Method11934() {
      Field10544 = new HashMap();
      (Field10545 = new HashMap()).put(14861, 11932);
      Field10545.put(11940, 11931);
      Field10544.put('轡', 1116);
      Field10544.put('轢', 1116);
      Field10544.put(32684, 31930);
      Field10544.put(32682, 31045);
      Field10544.put(32683, 31930);
      Field10544.put('\ue478', -1);
      Field10544.put('\ue479', -1);
      Field10544.put('댡', '댠');
      Field10544.put('댣', '댢');
      Field10544.put('댥', '댤');
      Field10544.put('댧', '댦');
      Field10544.put('ꨀ', -1);
      Field10544.put(31277, 31292);
      Field10544.put(31278, 31292);
      Field10544.put(31176, 9383);
      Field10544.put(5772, 11932);
      Field10544.put(5771, 11931);
      Field10544.put(5770, 11930);
      Field10544.put(5776, 11933);
      Field10544.put(5777, 11934);
      Field10544.put(5778, 11935);
      Field10544.put(5779, 11936);
      Field10544.put(5780, 11937);
      Field10544.put(5781, 11938);
      Field10544.put(5773, 2093);
      Field10544.put(5774, 2092);
      Field10544.put(5775, 2093);
      Field10544.put(5768, 2098);
      Field10544.put(5769, 2099);
      Field10544.put(5783, 11941);
      Field10544.put(5782, 11939);
      Field10544.put(5784, 11942);
      Field10544.put(5785, 11943);
      Field10544.put(5786, 11944);
      Field10544.put(5766, 11936);
      Field10544.put(5767, 11937);
      Field10544.put(2492, 2466);
      Field10544.put(1528, 1529);
      Field10544.put(4250, 4251);
      Field10544.put(10284, 6774);
      Field10544.put('\uefa7', '\uefa7');
      Field10544.put('\uefa8', '\uefa8');
      Field10544.put(1814, 1815);
      Field10544.put(3568, 3567);
      Field10544.put(3569, -1);
      Field10544.put(8958, 8962);
      Field10544.put(8959, 8962);
      Field10544.put(8960, 8962);

      for(int var0 = 0; var0 <= 4; ++var0) {
         Field10544.put(var0 + 15669, 15668);
      }

      Field10544.put(31276, 31292);
      Field10544.put(879, 2654);
      Field10544.put(880, 2654);
      Field10544.put('렮', '認');
      Field10544.put('텖', 15035);
      Field10544.put(15553, 15552);
   }

   private static int[] Method11935(int[] var0, int var1) {
      int var2;
      int[] var3 = new int[(var2 = var0 == null ? 0 : var0.length) + 1];
      if (var0 != null) {
         System.arraycopy(var0, 0, var3, 0, var2);
      }

      var3[var2] = var1;
      return var3;
   }

   private static void Method11936(ObjectDefinition var0, double var1) {
      var0.Field10553 = (int)((double)var0.Field10553 * var1);
      var0.Field10560 = (int)((double)var0.Field10560 * var1);
      var0.Field10580 = (int)((double)var0.Field10580 * var1);
   }

   private static int[] Method11937(int[] var0, int var1) {
      int[] var2 = new int[var0.length + 1];
      System.arraycopy(var0, 0, var2, 0, var0.length);
      var2[var0.length] = var1;
      return var2;
   }

   public static ObjectDefinition Method11938(int var0) {
      Object var1 = Field10546;
      synchronized(Field10546) {
         try {
            int var2 = -1;
            if (Field10544 == null || Client.Field12080) {
               Method11934();
            }

            Integer var3;
            if ((var3 = (Integer)Field10544.get(var0)) != null) {
               var0 = var3;
            }

            if ((var3 = (Integer)Field10545.get(var0)) != null) {
               var2 = var0;
               var0 = var3;
            }

            if (var0 >= 0) {
               int var5;
               ObjectDefinition var6;
               String var7;
               if (Field10541) {
                  Field10541 = false;
                  new ArrayList();

                  try {
                     int var15 = 0;
                     String var4 = System.getProperty("user.home");
                     Field10542 = new BufferedWriter(new FileWriter(var4 + "/Desktop/objectinfo.cfg"));
                     var5 = 0;

                     while(true) {
                        if (var5 >= Field10547) {
                           Field10542.flush();
                           Field10542.close();
                           break;
                        }

                        if ((var6 = Method11938(var5)) != null) {
                           var7 = "None";
                           if (var6.Field10585 != null) {
                              var7 = new String(var6.Field10585);
                           }

                           String var8 = var6.Field10552;
                           if (var6.Field10552 == null || var8.length() <= 0) {
                              var8 = "-";
                           }

                           Field10542.write("object = " + var5 + "\t" + var8 + "\t\t\t" + var6.Field10556 + "x" + var6.Field10570 + "\t" + var7);
                           Field10542.newLine();
                           if (var15++ % 1000 == 0) {
                              Field10542.flush();
                           }
                        }

                        ++var5;
                     }
                  } catch (Exception var10) {
                     var10.printStackTrace();
                  }
               }

               ObjectDefinition var16;
               ObjectDefinition var22;
               if ((var16 = (ObjectDefinition)Field10540.Method1510(var2 == -1 ? var0 : var2)) != null) {
                  var22 = var16;
                  return var22;
               }

               ObjectDefinition var17 = new ObjectDefinition();
               var5 = var0;
               if (var0 >= 19190 && var0 <= 19192) {
                  var5 = var0 - 3;
               } else if (var0 == 47759) {
                  var5 = 47758;
               }

               if (var0 >= Field10547) {
                  if (var0 == 62354) {
                     var5 = 28698;
                  } else {
                     var5 = 1;
                  }
               }

               try {
                  Field10563.pos = Field10565[var5];
                  var17.Field10564 = var0;
                  var17.Field10581 = null;
                  var17.Field10584 = null;
                  var17.Field10552 = null;
                  var17.Field10585 = null;
                  var17.Field10594 = null;
                  var17.Field10559 = null;
                  var17.Field10595 = null;
                  var17.Field10596 = null;
                  var17.Field10556 = 1;
                  var17.Field10570 = 1;
                  var17.Field10577 = true;
                  var17.Field10566 = true;
                  var17.Field10586 = false;
                  var17.Field10572 = false;
                  var17.Field10579 = false;
                  var17.Field10574 = false;
                  var17.Field10591 = -1;
                  var17.Field10583 = 16;
                  var17.Field10550 = 0;
                  var17.Field10555 = 0;
                  var17.Field10598 = null;
                  var17.Field10558 = -1;
                  var17.Field10567 = -1;
                  var17.Field10562 = false;
                  var17.Field10588 = true;
                  var17.Field10560 = 128;
                  var17.Field10580 = 128;
                  var17.Field10553 = 128;
                  var17.Field10578 = 0;
                  var17.Field10551 = 0;
                  var17.Field10557 = 0;
                  var17.Field10592 = 0;
                  var17.Field10549 = false;
                  var17.Field10576 = false;
                  var17.Field10569 = -1;
                  var17.Field10582 = -1;
                  var17.Field10561 = -1;
                  var17.Field10568 = null;
                  var17.Method11949(Field10563);
                  var17.Field10579 = false;
                  if (var2 != -1) {
                     var17.Field10564 = var2;
                     var0 = var2;
                  }
               } catch (Exception var11) {
                  var11.printStackTrace();
                  return null;
               }

               if (Client.normalMem) {
                  if (var0 != 14859 && var0 != 14860) {
                     if (var0 >= 61855 && var0 <= 61858) {
                        var17.Field10572 = var17.Field10573 = var17.Field10571 = true;
                     } else if (var0 == 21792) {
                        var17.Field10557 = -256;
                     } else if (var0 == 14861) {
                        var17.Field10559 = new int[]{7594, 7587, 7580, 7446, 7444, 34126, 34110, 34093, 34082, 34066};
                     } else if (var0 == 11940) {
                        var17.Field10559 = new int[]{7594, 7587, 7580, 7446, 7444, 21663, 21667, 21662, 21659, 21655};
                     } else if (var0 != 7725 && var0 != 7726) {
                        if (var0 == 39465) {
                           var17.Field10581 = new int[]{26720};
                           var17.Field10584 = null;
                           var17.Field10594 = new int[]{8};
                        } else if (var0 != 4411 && (var0 < 31214 || var0 > 31216) && var0 != 31216 && var0 != 31218 && var0 != 31220 && var0 != 58047 && var0 != 31749 && var0 != 45159 && var0 != 45163 && (var0 < 26346 || var0 > 26354) && (var0 < 45130 || var0 > 45136) && (var0 < 45141 || var0 > 45142)) {
                           if (var0 == 441 || var0 >= 5604 && var0 <= 5606 || var0 == 1268 || var0 == 1269 || var0 >= 8725 && var0 <= 8727 || var0 >= 26410 && var0 <= 26414 || var0 >= 36626 && var0 <= 36628 || var0 >= 15817 && var0 <= 15819 || var0 == 23165 || var0 >= 1363 && var0 <= 1368 || var0 == 14173 || var0 == 14174 || var0 == 25286 || var0 == 21572 || var0 == 1162 || var0 == 5539 || var0 == 519 || var0 == 29111 || var0 == 29110 || var0 >= 18348 && var0 <= 18350 || var0 == 18366 || var0 >= 5540 && var0 <= 5542) {
                              var17.Field10572 = var17.Field10573 = true;
                           } else if (var0 != 26421 && var0 != 16966) {
                              if (var0 != 48577 && var0 != 48578 && var0 != 4527 && var0 != 34266 && var0 != 34267 && var0 != 994 && var0 != 30252 && var0 != 9511 && var0 != 34073 && var0 != 34070 && var0 != 40014 && var0 != 30002 && var0 != 37141 && var0 != 37142 && var0 != 14563 && var0 != 56842 && var0 != 5311 && var0 != 30762 && var0 != 30009 && var0 != 30003 && var0 != 32921 && (var0 < 45160 || var0 > 45162) && var0 != 34148 && var0 != 34267 && (var0 < 4551 || var0 > 4567) && var0 != 37424 && var0 != 25262 && var0 != 48863 && (var0 < 3842 || var0 > 3846) && var0 != 31749 && (var0 < 36280 || var0 > 36286) && var0 != 37140 && var0 != 37139 && var0 != 2327 && var0 != 37097 && var0 != 36598 && var0 != 36606 && var0 != 36597 && var0 != 36605 && var0 != 36611 && var0 != 36612 && var0 != 36620 && var0 != 36619 && var0 != 34093 && var0 != 5558 && var0 != 37705 && var0 != 35112 && var0 != 18199 && var0 != 1711 && var0 != 40015 && var0 != 2176 && var0 != 35776 && var0 != 35773 && (var0 < 31214 || var0 > 31220) && var0 != 41513 && var0 != 9380) {
                                 if (var0 != 30674 && var0 != 9337) {
                                    if (var0 == 61880) {
                                       var17.Field10557 += 16;
                                       var17.Field10580 += 64;
                                    } else if (var0 == 37215) {
                                       var17.Field10557 += 120;
                                    } else if (var0 == 46345) {
                                       var17.Field10557 += 194;
                                       var17.Field10580 += 128;
                                    } else if (var0 == 36266) {
                                       var17.Field10572 = var17.Field10573 = true;
                                       var17.Field10571 = true;
                                       var17.Field10581 = new int[]{38348, 38353};
                                       var17.Field10584 = null;
                                    } else if (var0 == 4505) {
                                       var17.Field10572 = var17.Field10573 = true;
                                       var17.Field10571 = true;
                                    } else if (var0 != 57258 && (var0 < 26425 || var0 > 26428) && var0 != 37929 && var0 != 10321 && var0 != 6451 && var0 != 6452 && var0 != 23610) {
                                       if (var0 == 23609) {
                                          var17.Field10598 = new String[]{"Add rope", null, null, null, null};
                                       }
                                    } else {
                                       var17.Field10598[1] = "Join Instance";
                                    }
                                 } else {
                                    var17.Field10572 = var17.Field10573 = false;
                                 }
                              } else {
                                 var17.Field10572 = var17.Field10573 = true;
                                 var17.Field10571 = true;
                              }
                           } else {
                              var17.Field10572 = var17.Field10573 = true;
                              var17.Field10571 = true;
                           }
                        } else {
                           var17.Field10571 = true;
                           var17.Field10572 = var17.Field10573 = true;
                        }
                     } else {
                        var17.Field10598 = new String[]{"Pick-from", null, null, null, null};
                        if (var0 == 7725) {
                           var17.Field10581 = new int[]{7825};
                        }

                        var17.Field10560 = var17.Field10553 = var17.Field10580 = 100;
                     }
                  } else {
                     var17.Field10559 = new int[]{7594, 7587, 7580, 7446, 7444, 34126, 34110, 34093, 34082, 34066};
                  }

                  if (var0 == 30789 || var0 >= 30768 && var0 <= 30773 || var0 == 30624) {
                     var17.Field10596 = new int[]{339, 670};
                     var17.Field10595 = new int[]{666, 666};
                  }

                  if (var0 != 33485 && var0 != 25281 && var0 != 25280) {
                     if (var0 == 25274) {
                        var17.Field10557 = 185 + (GraphicsDisplay.Field2678 && GraphicsDisplay.Field2667 && Client.Field12068 > 0 ? 20 : -20);
                     } else if (var0 != 11601 && var0 != 2643) {
                        if (var0 != 13621 && var0 != 13628 && var0 != 13635) {
                           if (var0 >= 31177 && var0 <= 31195 || var0 >= 31214 && var0 <= 31220) {
                              var17.Field10591 = -1;
                           } else if (var0 == 40699) {
                              var17.Field10591 = -1;
                           } else if (var0 == 28698) {
                              var17.Field10585 = "I can enter all rune altars with the appropriate talismans here.".getBytes();
                              var17.Field10552 = "Prismatic altar";
                              var17.Field10598 = new String[]{"Enter", null, null, null, null};
                              var17.Field10573 = var17.Field10572 = false;
                              var17.Field10580 = 156;
                           } else if (var0 == 9379) {
                              var17.Field10598 = new String[]{"Investigate", null, null, null, null};
                              var17.Field10572 = var17.Field10573 = true;
                           } else if (var0 == 32034 || var0 >= 32041 && var0 <= 32044) {
                              var17.Field10577 = false;
                           }
                        } else {
                           var17.Field10552 = "Canifis Portal";
                        }
                     } else {
                        var17.Field10552 = "Furnace";
                        var17.Field10585 = "A hot furnace.".getBytes();
                        var17.Field10598[0] = "Smelt";
                     }
                  } else {
                     var17.Field10560 = 128;
                     var17.Field10553 = 140;
                     var17.Field10580 = 128;
                  }

                  if (var17.Field10581 != null && var17.Field10581[0] == 8037) {
                     var17.Field10581[0] = 1571;
                  } else if (var0 >= 13200 && var0 <= 13213) {
                     if (var17.Field10591 > 0) {
                        int var18 = ParticleDefinition.Method7791("incense_burner");
                        switch(var0) {
                        case 13201:
                           var17.Field10597 = new int[][]{{45, var18}};
                        case 13202:
                        case 13204:
                        case 13206:
                        case 13208:
                        case 13210:
                        case 13212:
                        default:
                           break;
                        case 13203:
                           var17.Field10597 = new int[][]{{15, var18}};
                           break;
                        case 13205:
                           var17.Field10597 = new int[][]{{70, var18}};
                           break;
                        case 13207:
                           var17.Field10597 = new int[][]{{70, var18}};
                           break;
                        case 13209:
                           var17.Field10597 = new int[][]{{50, var18}};
                           break;
                        case 13211:
                           var17.Field10597 = new int[][]{{50, var18}};
                           break;
                        case 13213:
                           var17.Field10597 = new int[][]{{55, var18}};
                        }

                        var17.Field10552 = var17.Field10552 + " (lit)";
                     }
                  } else if (var0 == 5463) {
                     var17.Field10586 = false;
                     var17.Field10598 = null;
                  } else if (var0 == 11662) {
                     var17.Field10581 = Method11937(var17.Field10581, 7906);
                     var17.Field10584 = null;
                     var17.Field10572 = var17.Field10573 = false;
                  } else if (var0 == 10186) {
                     var17.Field10572 = var17.Field10573 = true;
                  } else if (var0 >= 15552 && var0 <= 15556) {
                     var17.Field10581[0] = 15211;
                  } else if ((var0 < 3567 || var0 > 3569) && var0 != 34661 && var0 != 34662 && (var0 < 34836 || var0 > 34839) && var0 != 21249 && var0 != 24417 && (var0 < 41519 || var0 > 41521) && var0 != 16045 && (var0 < 6238 || var0 > 6241) && var0 != 12962 && var0 != 4727) {
                     if (var0 == 3478) {
                        var17.Field10591 = -1;
                     } else if (var0 == 2363) {
                        var17.Field10553 = 16;
                        var17.Field10560 = 16;
                     } else if (var0 == 37247) {
                        var17.Field10591 = -1;
                     } else if (var0 != 47109 && var0 != 47110) {
                        if (var0 == 2531) {
                           var17.Field10581 = new int[]{2259};
                           var17.Field10557 = 2;
                           var17.Field10594 = new int[]{27028};
                           var17.Field10559 = new int[]{5524};
                        } else if (var0 == 15432) {
                           var17.Field10593 = 100;
                           var17.Field10581 = new int[]{11819};
                           var17.Field10594 = new int[]{7580};
                           var17.Field10559 = new int[]{16449, 16705};
                           var17.Field10586 = true;
                        } else if (var0 == 13593) {
                           var17.Field10557 -= 6;
                           var17.Field10593 = 0;
                           var17.Field10581 = new int[]{11819};
                           var17.Field10594 = new int[]{7580};
                           var17.Field10559 = new int[]{1575};
                           var17.Field10586 = true;
                        } else if (var0 == 27922) {
                           var17.Field10581 = new int[]{33973};
                           var17.Field10557 = 180;
                           var17.Field10594 = new int[1];
                           var17.Field10559 = new int[]{5442};
                        } else if (var0 == 47758) {
                           var17.Field10598 = new String[]{null, "Take", null, null, null};
                           var17.Field10577 = true;
                           var17.Field10566 = true;
                           var17.Field10556 = var17.Field10570 = 1;
                        } else if (var0 == 47759) {
                           var17.Field10598 = new String[]{null, "Take", null, null, null};
                           var17.Field10552 = "Dark present";
                           var17.Field10594 = new int[]{20917, 20927, 1718, 1708, 1699, 20912, 20919, 1703, 1707, 1722, 1712, 20905, 20915, 20908, 1698, 1702, 20900, 20910, 1697, 1693};
                           var17.Field10559 = new int[]{8, 8, 1718, 1708, 1699, 8, 8, 1703, 1707, 1722, 1712, 8, 8, 8, 1698, 1702, 8, 8, 1697, 1693};
                        } else if (var0 == 19435) {
                           var17.Field10577 = true;
                           var17.Field10566 = true;
                           var17.Field10556 = var17.Field10570 = 1;
                        } else if (var0 != 27921 && var0 != 27962 && var0 != 27920) {
                           if (var0 != 3113 && var0 != 3111) {
                              if (var0 == 35676 || var0 == 42196) {
                                 var17.Field10581 = new int[]{31066};
                              }
                           } else {
                              var17.Field10557 += 160;
                           }
                        } else {
                           var17.Field10557 -= 60;
                        }
                     } else {
                        var17.Field10591 = -1;
                     }
                  } else {
                     var17.Field10579 = false;
                  }

                  if (var0 != 11758 && var0 != 35647 && var0 != 782 && var0 != 2213 && var0 != 2012 && var0 != 2015 && var0 != 2019 && var0 != 24914 && var0 != 25808) {
                     if (var0 == 2531) {
                        var17.Field10598 = new String[]{null, "Plant", null, null, null};
                     } else if (var0 == 2654) {
                        var17.Field10552 = "Fountain";
                        var17.Field10598 = null;
                        var17.Field10585 = "Everyone needs a water feature.".getBytes();
                     } else if (var0 >= 6714 && var0 <= 6750) {
                        var17.Field10598 = new String[5];
                        var17.Field10598[1] = "Open";
                        var17.Field10552 = "Barrow door";
                        var17.Field10586 = true;
                        var17.Field10591 = -1;
                        var17.Field10581 = new int[]{6623};
                     } else if (var0 != 2531 && var0 != 7517 && var0 != 3615 && (var0 < 5712 || var0 > 5717) && var0 != 6951 && (var0 < 3567 || var0 > 3569) && var0 != 734) {
                        if (var0 == 5259) {
                           var17.Field10586 = true;
                        } else if (var0 == 19334) {
                           var17.Field10598 = new String[]{null, "Check", null, null, null};
                           var17.Field10581 = new int[]{23903};
                           var17.Field10591 = -1;
                        } else if (var0 == 19335) {
                           var17.Field10598 = new String[5];
                           var17.Field10581 = new int[]{23903};
                           var17.Field10591 = -1;
                        } else if (var0 != 8487 && var0 != 8488) {
                           if (var0 == 8489) {
                              var17.Field10581 = new int[]{8139};
                              Method11936(var17, 1.4D);
                              var17.Field10556 = var17.Field10570 = 1;
                           } else if (var0 != 9709 && var0 != 9708 && var0 != 9710) {
                              if (var0 == 12774) {
                                 var17.Field10598 = new String[]{null, "Go-through", null, null, null};
                                 var17.Field10586 = true;
                              } else if (var0 == 4277) {
                                 var17.Field10581 = Method11935(var17.Field10581, 1421);
                                 var17.Field10584 = null;
                              } else if (var0 == 4278) {
                                 var17.Field10581 = new int[0];
                                 var17.Field10581 = Method11935(var17.Field10581, 1456);
                                 var17.Field10581 = Method11935(var17.Field10581, 1421);
                                 var17.Field10584 = null;
                              } else if (var0 == 632) {
                                 var17.Field10581 = new int[3];
                                 var17.Field10581[0] = 1456;
                                 var17.Field10581[1] = 24908;
                                 var17.Field10581[2] = 24907;
                                 var17.Field10584 = null;
                              } else if (var0 == 15478) {
                                 var17.Field10581 = new int[2];
                                 var17.Field10581[0] = 12636;
                                 var17.Field10581[1] = 11233;
                                 var17.Field10584 = null;
                                 var17.Field10598 = new String[]{"Enter", "Enter my", "Enter last", null, null};
                              } else if (var0 == 13405) {
                                 var17.Field10581 = new int[2];
                                 var17.Field10581[0] = 11234;
                                 var17.Field10581[1] = 11242;
                                 var17.Field10584 = null;
                              } else if (var0 == 23632) {
                                 var17.Field10581 = new int[2];
                                 var17.Field10581[0] = 25779;
                                 var17.Field10581[1] = 24905;
                                 var17.Field10584 = null;
                              } else if (var0 == 34386) {
                                 var17.Field10581 = new int[2];
                                 var17.Field10581[0] = 1421;
                                 var17.Field10581[1] = 1484;
                                 var17.Field10584 = null;
                              } else if (var0 == 34387) {
                                 var17.Field10581 = new int[2];
                                 var17.Field10581[0] = 1421;
                                 var17.Field10581[1] = 1456;
                                 var17.Field10584 = null;
                              } else if (var0 == 34383) {
                                 var17.Field10581 = new int[2];
                                 var17.Field10581[0] = 1421;
                                 var17.Field10581[1] = 1485;
                                 var17.Field10584 = null;
                              } else if (var0 == 34384) {
                                 var17.Field10581 = new int[2];
                                 var17.Field10581[0] = 1421;
                                 var17.Field10581[1] = 1445;
                                 var17.Field10584 = null;
                              } else if (var0 == 34382) {
                                 var17.Field10581 = new int[2];
                                 var17.Field10581[0] = 1421;
                                 var17.Field10581[1] = 1493;
                                 var17.Field10584 = null;
                              } else if (var0 == 38437) {
                                 var17.Field10581 = new int[1];
                                 var17.Field10581[0] = 41817;
                                 var17.Field10584 = new int[1];
                                 var17.Field10584[0] = 10;
                              } else if (var0 == 36585) {
                                 var17.Field10581 = new int[2];
                                 var17.Field10581[0] = 7906;
                                 var17.Field10581[1] = var0 + 1744 - 12;
                                 var17.Field10584 = null;
                              } else if (var0 == 36580) {
                                 var17.Field10581 = new int[2];
                                 var17.Field10581[0] = 7906;
                                 var17.Field10581[1] = var0 + 1744 - 2;
                                 var17.Field10584 = null;
                              } else if (var0 == 36573) {
                                 var17.Field10581 = new int[2];
                                 var17.Field10581[0] = 7906;
                                 var17.Field10581[1] = var0 + 1744 + 5;
                                 var17.Field10584 = null;
                              } else if (var0 == 36578) {
                                 var17.Field10581 = new int[2];
                                 var17.Field10581[0] = 7906;
                                 var17.Field10581[1] = var0 + 1744 - 5;
                                 var17.Field10584 = null;
                              } else if (var0 >= 36573 && var0 <= 36578) {
                                 var17.Field10581 = new int[2];
                                 var17.Field10581[0] = 7906;
                                 var17.Field10581[1] = var0 + 1744;
                                 var17.Field10584 = null;
                              } else if (var0 >= 36580 && var0 <= 36585) {
                                 var17.Field10581 = new int[2];
                                 var17.Field10581[0] = 7906;
                                 var17.Field10581[1] = var0 + 1744 - 7;
                                 var17.Field10584 = null;
                              } else if (var0 != 36586 && var0 != 36579) {
                                 if (var0 == 4903) {
                                    var17.Field10581 = new int[2];
                                    var17.Field10581[0] = 38184;
                                    var17.Field10581[1] = 38183;
                                    var17.Field10584 = null;
                                 } else if (var0 == 4902) {
                                    var17.Field10581 = new int[2];
                                    var17.Field10581[0] = 38184;
                                    var17.Field10581[1] = 38182;
                                    var17.Field10584 = null;
                                 } else if (var0 == 4907) {
                                    var17.Field10598 = new String[5];
                                    var17.Field10598[1] = "Return";
                                    var17.Field10552 = "Flag";
                                    var17.Field10586 = true;
                                 } else if (var0 == 31300) {
                                    var17.Field10591 = -1;
                                 } else if (var0 != 6906 && var0 != 6901 && var0 != 6912) {
                                    if (var0 >= 14826 && var0 <= 14831) {
                                       var17.Field10598 = new String[]{null, "Activate", null, null, null};
                                    } else if (var0 == 10433) {
                                       var17.Field10556 = var17.Field10570 = 3;
                                    } else if (var0 >= 19190 && var0 <= 19192) {
                                       var17.Field10598 = new String[5];
                                    }
                                 } else {
                                    var17.Field10556 = 1;
                                    var17.Field10570 = 1;
                                    var17.Field10577 = true;
                                    var17.Field10552 = "Hole";
                                    var17.Field10598 = new String[]{null, "Squeeze-through", null, null, null};
                                 }
                              } else {
                                 var17.Field10581 = new int[2];
                                 var17.Field10581[0] = 7906;
                                 var17.Field10581[1] = 38316;
                                 var17.Field10584 = null;
                              }
                           } else {
                              var6 = Method11938(9717);

                              for(int var20 = 0; var20 < 6; ++var20) {
                                 var17.Field10594[var20] = var6.Field10594[var20];
                                 var17.Field10559[var20] = var6.Field10559[var20];
                              }
                           }
                        } else {
                           var17.Field10581 = new int[]{8135};
                           if (var0 == 8487) {
                              Method11936(var17, 1.5D);
                              var17.Field10598[0] = null;
                           } else {
                              Method11936(var17, 1.75D);
                           }

                           var17.Field10556 = 3;
                           var17.Field10570 = 3;
                        }
                     } else {
                        var17.Field10577 = false;
                     }
                  } else {
                     var17.Field10577 = true;
                  }

                  if (var0 == 1948) {
                     var17.Field10594 = new int[1];
                     var17.Field10559 = new int[1];
                     var17.Field10594[0] = 2;
                     var17.Field10559[0] = 23;
                  }
               }

               if (Field10543 == null) {
                  Method11950();
               }

               Class888 var19;
               if ((var19 = (Class888)Field10543.get(var0)) != null) {
                  var17.Field10596 = new int[]{var19.Field895};
                  var17.Field10595 = new int[]{var19.Field896};
               }

               try {
                  if (var0 >= 13497 && var0 <= 13506) {
                     var17.Field10598[2] = "Build-room";
                  }

                  if (var0 == 15276) {
                     var17.Field10556 = 2;
                     var17.Field10570 = 1;
                  }

                  if (var17.Field10598 != null && var17.Field10598[4] != null && var17.Field10598[4].equals("Remove")) {
                     var17.Field10598[4] = null;
                  }

                  if (var0 == 19188) {
                     var17.Field10598 = new String[5];
                     var17.Field10598[1] = "Check";
                  }

                  if (var0 != 19403 && var0 != 19388 && var0 != 19389 && var0 != 43247) {
                     if (var0 == 21273) {
                        var17.Field10581 = Method11937(var17.Field10581, 16292);
                        var17.Field10581 = Method11937(var17.Field10581, 16294);
                        var17.Field10584 = null;
                        var17.Field10572 = var17.Field10573 = false;
                     } else if (var0 == 31284) {
                        var17.Field10572 = var17.Field10573 = true;
                     }
                  } else {
                     var17.Field10598[0] = "Search";
                     var17.Field10598[1] = "Attack";
                  }

                  switch(var0) {
                  case 13405:
                     var17.Field10598[1] = "Switch Mode";
                     break;
                  case 13625:
                     var17.Field10552 = "Free for all portal";
                     var17.Field10585 = "This portal takes you into the clan wars free for all mode.".getBytes();
                     break;
                  case 13626:
                     var17.Field10552 = "Clan vs clan portal";
                     var17.Field10585 = "This portal takes you into the clan wars clan vs clan mode.".getBytes();
                     break;
                  case 13627:
                     var17.Field10552 = "Clan-V-Clan Portal";
                     var17.Field10585 = "This portal takes you into the clan wars clan-v-clan mode.".getBytes();
                  }
               } catch (Exception var9) {
                  if (Client.normalMem) {
                     var9.printStackTrace();
                  }
               }

               if (var17.Field10598 != null) {
                  String[] var14 = var17.Field10598;
                  var0 = var17.Field10598.length;

                  for(int var21 = 0; var21 < var0; ++var21) {
                     if ((var7 = var14[var21]) != null && !var7.equals("")) {
                        var17.Field10586 = true;
                        break;
                     }
                  }
               }

               var17.Field10587 = var17.Field10586;
               Field10540.Method1509(var17.Field10564, var17);
               var22 = var17;
               return var22;
            }
         } catch (Exception var12) {
            var12.printStackTrace();
            return null;
         }

         return null;
      }
   }

   public static void Method11939() {
      Field10589.Method1512();
      Field10590.Method1512();
      Field10565 = null;
      Field10540 = null;
      Field10563 = null;
   }

   public static void Method11940(JagexArchive var0) {
      Field10563 = new Packet(var0.readConfig("loc.dat"));
      Packet var3;
      Field10565 = new int[(Field10547 = (var3 = new Packet(var0.readConfig("loc.idx"))).g2()) + 20];
      int var1 = 2;

      for(int var2 = 0; var2 < Field10547; ++var2) {
         Field10565[var2] = var1;
         var1 += var3.g2();
      }

      Field10547 = Field10565.length;
      Field10540.Method1512();
   }

   public static void Method11941() {
      Field10540.Method1512();
   }

   public static void Method11942() {
      Field10589.Method1512();
      Field10590.Method1512();
   }

   public final Model Method11943(int var1, int var2) {
      return this.Method11948(var1, -1, 0, -1, 0, 0, 0, 0, 0L);
   }

   public final Model Method11944(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
      return this.Method11945(var1, var2, (float)var3, (float)var4, (float)var5, (float)var6, -1, -1, -1, -1, var8, 0, 0, 0L, var9, var10, var11);
   }

   public final Model Method11945(int var1, int var2, float var3, float var4, float var5, float var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, long var14, int var16, int var17, int var18) {
      boolean var20 = var7 != -1;
      Model var19;
      if ((var19 = this.Method11948(var1, var7, var2, var8, var9, var10, var12, var13, var14)) == null) {
         return null;
      } else if (!this.Field10572 && !this.Field10579) {
         if (this.Field10572) {
            var19.Method14452(var3, var4, var6, var5, var16, var17, var18);
         }

         var19.Field2767 = this.Field10571;
         var19.Field2753 = var20;
         return var19;
      } else {
         var2 = var19 == null ? 0 : var19.Method14446();
         Model var10000 = var20 ? var19 : new Model(this.Field10572, this.Field10579, var19);
         var19 = var10000;
         var10000.Method14445(var2);
         if (this.Field10572) {
            var19.Method14453(var3, var4, var6, var5, var16, var17, var18);
         }

         var19.Field2767 = this.Field10571;
         var19.Field2753 = var20;
         return var19;
      }
   }

   private Model Method11946(Model var1, int var2, int var3, int var4, int var5, int var6, int var7, long var8) {
      if (var2 == -1) {
         return var1;
      } else {
         var1.Field2746 = var2;
         int var10001 = var6;
         var6 = this.Field10591;
         Model var13;
         if (!(var13 = Model.Method14483(var1, var10001, var7, var6 != 1071 && var6 != 2871 && var6 != 1727 && var6 != 6731 && var6 != 9644 ? var8 : -1L, 2)).Field2750) {
            var1.Field2750 = false;
            return var1;
         } else {
            var13.Method14521(var2, var3, var4, var5, Model.Field2798);
            var13.Field2846 = var1.Field2846;
            var13.Field10127 = var1.Field10127;
            return var13;
         }
      }
   }

   private long Method11947(long var1, long var3, long var5, long var7) {
      long var9;
      return (var9 = (long)(this.Field10564 & '\uffff')) + (var1 << 33) + (var3 << 36) + (var5 << 46) + (var7 << 54);
   }

   private Model Method11948(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, long var9) {
      if (this.Field10564 >= 13615 && this.Field10564 <= 13635) {
         var1 = 10;
      }

      Object var11 = Field10546;
      synchronized(Field10546) {
         Model var12 = null;
         boolean var15 = true;
         long var13;
         boolean var17;
         int var19;
         if (this.Field10584 == null) {
            if (var1 != 10) {
               return null;
            }

            var13 = this.Method11947((long)var3, (long)var1, (long)var7, (long)var8);
            Model var16;
            if ((var16 = (Model)Field10590.Method1510(var13)) != null) {
               return this.Method11946(var16, var2, var4, var5, var6, var7, var8, var9);
            }

            if (this.Field10581 == null) {
               return null;
            }

            var17 = this.Field10562 ^ var3 > 3;
            int var18 = this.Field10581.length;

            for(var19 = 0; var19 < var18; ++var19) {
               long var20 = (long)this.Field10581[var19];
               if (var17) {
                  var20 += 1048576L;
               }

               if ((var12 = (Model)Field10589.Method1510(var20)) == null) {
                  if ((var12 = Model.Method14476((int)(var20 & 65535L), false, true)) == null) {
                     return null;
                  }

                  if (var17) {
                     var12.Method14496();
                  }

                  Field10589.Method1509(var20, var12);
                  Field10548 += var12.Field2818;
               }

               if (var18 > 1) {
                  Field10554[var19] = var12;
               }
            }

            if (var18 > 1) {
               var12 = new Model(var18, Field10554);
               var15 = false;
            }
         } else {
            int var25 = -1;

            for(int var27 = 0; var27 < this.Field10584.length; ++var27) {
               if (this.Field10584[var27] == var1) {
                  var25 = var27;
                  break;
               }
            }

            if (var25 == -1) {
               return null;
            }

            var13 = this.Method11947((long)var3, (long)var1, (long)var7, (long)var8);
            Model var29;
            if ((var29 = (Model)Field10590.Method1510(var13)) != null) {
               return this.Method11946(var29, var2, var4, var5, var6, var7, var8, var9);
            }

            if (this.Field10581 == null) {
               return null;
            }

            long var30 = (long)this.Field10581[var25];
            boolean var32;
            if (var32 = this.Field10562 ^ var3 > 3) {
               var30 += 65536L;
            }

            if ((var12 = (Model)Field10589.Method1510(var30)) == null) {
               if ((var12 = Model.Method14476((int)(var30 & 65535L), false, true)) == null) {
                  return null;
               }

               if (var32) {
                  var12.Method14496();
               }

               Field10589.Method1509(var30, var12);
               Field10548 += var12.Field2818;
            }
         }

         if (var12 == null) {
            return null;
         } else {
            boolean var28 = this.Field10560 != 128 || this.Field10580 != 128 || this.Field10553 != 128;
            var17 = this.Field10551 != 0 || this.Field10557 != 0 || this.Field10592 != 0;
            if (Client.Field12490 >= 2730 && Client.Field12491 >= 3380 && Client.Field12490 <= 2980 && Client.Field12491 <= 3680 && (this.Field10564 == 1902 || this.Field10564 == 7271 || this.Field10564 == 1660 || this.Field10564 >= 1943 && this.Field10564 <= 1951 || this.Field10564 == 1925 || this.Field10564 == 1643 || this.Field10564 == 1928 || this.Field10564 == 1927 || this.Field10564 >= 33440 && this.Field10564 <= 33442 || this.Field10564 >= 1911 && this.Field10564 <= 1913 || this.Field10564 >= 3682 && this.Field10564 <= 3684 || this.Field10564 >= 33430 && this.Field10564 <= 33431 || this.Field10564 >= 33438 && this.Field10564 <= 33439)) {
               this.Field10596 = Method11935(this.Field10596, 2);
               this.Field10595 = Method11935(this.Field10595, 23);
               if (this.Field10564 != 1927) {
                  this.Field10596 = Method11935(this.Field10596, 6);
                  this.Field10595 = Method11935(this.Field10595, 44);
               }
            }

            Model var31;
            (var31 = var15 ? new Model(this.Field10594 == null, this.Field10596 == null, Class518.Method8352(var2), var3 == 0 && var2 == -1 && !var28 && !var17, var12, var1) : var12).Method14445(var3);
            var31.Field2767 = this.Field10571;
            if (this.Field10572 || !GraphicsDisplay.Field2678) {
               var31.Method14445(0);
               var19 = var3;

               while(var19-- > 0) {
                  var31.Method14487();
               }
            }

            if (this.Field10593 != -1) {
               var3 = this.Field10593;
               Model var23 = var31;
               if (var31.Field2835 != null) {
                  for(int var24 = 0; var24 < var23.Field2835.length; ++var24) {
                     var23.Field2835[var24] = var3;
                  }
               }
            }

            if (this.Field10594 != null && this.Field10559 != null) {
               for(var19 = 0; var19 < this.Field10594.length; ++var19) {
                  var31.recolor(this.Field10594[var19], this.Field10559[var19]);
               }
            }

            if (this.Field10597 != null && Client.Field12225) {
               var31.Method14460(this.Field10597);
            }

            if (this.Field10596 != null && this.Field10595 != null) {
               if (Client.normalMem) {
                  for(var19 = 0; var19 < this.Field10596.length; ++var19) {
                     var31.Method14494(this.Field10596[var19], this.Field10595[var19]);
                  }
               } else {
                  for(var19 = 0; var19 < this.Field10596.length; ++var19) {
                     var31.recolor(this.Field10596[var19], this.Field10595[var19]);
                  }
               }
            }

            if (var28) {
               var31.Method14501((float)this.Field10560, (float)this.Field10553, (float)this.Field10580);
            }

            if (var17) {
               var31.Method14493(this.Field10551, this.Field10557, this.Field10592);
            }

            if (Client.Field12154) {
               var31.Method14502(74 + this.Field10550, 1000 + this.Field10555 * 5, -90, -580, -90, !this.Field10579);
            } else {
               var31.Method14502(64 + this.Field10550, 768 + this.Field10555 * 5, -50, -10, -50, !this.Field10579);
            }

            if (this.Field10569 == 1) {
               var31.Field2850 = var31.Field10127;
            }

            Field10590.Method1509(var13, var31);
            Field10548 += var31.Field2818;
            return this.Method11946(var31, var2, var4, var5, var6, var7, var8, var9);
         }
      }
   }

   private void Method11949(Packet var1) {
      Object var2 = Field10546;
      synchronized(Field10546) {
         int var4;
         int var5;
         if (Client.normalMem) {
            int var3 = -1;

            while(true) {
               while(true) {
                  label418:
                  do {
                     while((var4 = var1.g1()) != 0) {
                        if (var4 == 1) {
                           continue label418;
                        }

                        if (var4 == 2) {
                           this.Field10552 = var1.Method406();
                        } else if (var4 == 3) {
                           this.Field10585 = var1.Method407();
                        } else if (var4 == 5) {
                           if ((var4 = var1.g1()) > 0) {
                              if (this.Field10581 == null) {
                                 this.Field10584 = null;
                                 this.Field10581 = new int[var4];

                                 for(var5 = 0; var5 < var4; ++var5) {
                                    var1.g2();
                                    this.Field10581[var5] = var1.g2();
                                 }
                              } else {
                                 System.out.println("models not null");
                              }
                           }
                        } else if (var4 == 14) {
                           this.Field10556 = var1.g1();
                        } else if (var4 == 15) {
                           this.Field10570 = var1.g1();
                        } else if (var4 == 17) {
                           this.Field10577 = false;
                        } else if (var4 == 18) {
                           this.Field10566 = false;
                        } else if (var4 == 19) {
                           if ((var3 = var1.g1()) == 1) {
                              this.Field10586 = true;
                           }
                        } else if (var4 == 21) {
                           this.Field10572 = this.Field10573 = true;
                        } else if (var4 == 22) {
                           this.Field10579 = true;
                        } else if (var4 == 23) {
                           this.Field10574 = true;
                        } else if (var4 == 24) {
                           this.Field10591 = var1.g2();
                           if (this.Field10591 == 65535) {
                              this.Field10591 = -1;
                           }

                           if (this.Field10591 >= Sequence.anims.length) {
                              this.Field10591 = -1;
                           }

                           if (this.Field10591 > 0) {
                              Sequence.anims[this.Field10591].Method8282();
                           }
                        } else if (var4 == 28) {
                           this.Field10583 = var1.g1();
                        } else if (var4 == 29) {
                           this.Field10550 = var1.Method400();
                        } else if (var4 == 39) {
                           this.Field10555 = var1.Method400();
                        } else if (var4 >= 30 && var4 < 39) {
                           if (this.Field10598 == null) {
                              this.Field10598 = new String[9];
                           }

                           this.Field10598[var4 - 30] = var1.Method406();
                           if (this.Field10598[var4 - 30].equalsIgnoreCase("hidden")) {
                              this.Field10598[var4 - 30] = null;
                           }
                        } else if (var4 == 40) {
                           var5 = var1.g1();
                           this.Field10594 = new int[var5];
                           this.Field10559 = new int[var5];

                           for(var4 = 0; var4 < var5; ++var4) {
                              this.Field10594[var4] = var1.g2();
                              this.Field10559[var4] = var1.g2();
                           }
                        } else if (var4 == 41) {
                           var4 = var1.g1();
                           this.Field10595 = new int[var4];
                           this.Field10596 = new int[var4];

                           for(var5 = 0; var5 < var4; ++var5) {
                              this.Field10596[var5] = var1.g2();
                              this.Field10595[var5] = var1.g2();
                           }
                        } else if (var4 == 60) {
                           this.Field10558 = var1.g2();
                        } else if (var4 == 62) {
                           this.Field10562 = true;
                        } else if (var4 == 64) {
                           this.Field10588 = false;
                        } else if (var4 == 65) {
                           this.Field10560 = var1.g2();
                        } else if (var4 == 66) {
                           this.Field10580 = var1.g2();
                        } else if (var4 == 67) {
                           this.Field10553 = var1.g2();
                        } else if (var4 == 68) {
                           this.Field10567 = var1.g2();
                        } else if (var4 == 69) {
                           this.Field10578 = var1.g1();
                        } else if (var4 == 70) {
                           this.Field10551 = var1.Method402();
                        } else if (var4 == 71) {
                           this.Field10557 = var1.Method402();
                        } else if (var4 == 72) {
                           this.Field10592 = var1.Method402();
                        } else if (var4 == 73) {
                           this.Field10549 = true;
                        } else if (var4 == 74) {
                           this.Field10576 = true;
                        } else if (var4 == 75) {
                           this.Field10569 = var1.g1();
                        } else if (var4 == 77) {
                           this.Field10561 = var1.g2();
                           if (this.Field10561 == 65535) {
                              this.Field10561 = -1;
                           }

                           this.Field10582 = var1.g2();
                           if (this.Field10582 == 65535) {
                              this.Field10582 = -1;
                           }

                           var4 = var1.g1();
                           this.Field10568 = new int[var4];

                           for(var5 = 0; var5 < var4; ++var5) {
                              this.Field10568[var5] = var1.g2();
                              if (this.Field10568[var5] == 65535) {
                                 this.Field10568[var5] = -1;
                              }
                           }
                        }
                     }

                     if (var3 == -1) {
                        this.Field10586 = this.Field10581 != null && (this.Field10584 == null || this.Field10584[0] == 10);
                        if (this.Field10598 != null) {
                           this.Field10586 = true;
                        }

                        if (this.Field10552 == null || this.Field10552.equals("null")) {
                           this.Field10586 = false;
                        }
                     }

                     if (this.Field10576) {
                        this.Field10577 = false;
                        this.Field10566 = false;
                     }

                     if (this.Field10569 == -1) {
                        this.Field10569 = this.Field10577 ? 1 : 0;
                     }

                     return;
                  } while((var4 = var1.g1()) <= 0);

                  if (this.Field10581 == null) {
                     this.Field10584 = new int[var4];
                     this.Field10581 = new int[var4];

                     for(var5 = 0; var5 < var4; ++var5) {
                        this.Field10581[var5] = var1.g2();
                        this.Field10584[var5] = var1.g1();
                        Model.Method14470(this.Field10581[var5]);
                     }
                  } else {
                     var1.pos += var4 * 3;
                  }
               }
            }
         } else {
            while((var4 = var1.g1()) != 0) {
               if (var4 == 1) {
                  if ((var4 = var1.g1()) > 0) {
                     if (this.Field10581 == null) {
                        this.Field10584 = new int[var4];
                        this.Field10581 = new int[var4];

                        for(var5 = 0; var5 < var4; ++var5) {
                           this.Field10581[var5] = var1.g2();
                           this.Field10584[var5] = var1.g1();
                           Model.Method14470(this.Field10581[var5]);
                        }
                     } else {
                        var1.pos += var4 * 3;
                     }
                  }
               } else if (var4 == 2) {
                  this.Field10552 = var1.Method406();
               } else if (var4 == 3) {
                  this.Field10585 = var1.Method407();
               } else if (var4 == 5) {
                  if ((var4 = var1.g1()) > 0) {
                     if (this.Field10581 == null) {
                        this.Field10584 = null;
                        this.Field10581 = new int[var4];

                        for(var5 = 0; var5 < var4; ++var5) {
                           this.Field10581[var5] = var1.g2();
                        }
                     } else {
                        var1.pos += var4 << 1;
                     }
                  }
               } else if (var4 == 14) {
                  this.Field10556 = var1.g1();
               } else if (var4 == 15) {
                  this.Field10570 = var1.g1();
               } else if (var4 == 17) {
                  this.Field10577 = false;
               } else if (var4 == 18) {
                  this.Field10566 = false;
               } else if (var4 == 19) {
                  this.Field10586 = var1.g1() == 1;
               } else if (var4 == 21) {
                  this.Field10572 = this.Field10573 = true;
               } else if (var4 == 22) {
                  this.Field10579 = false;
               } else if (var4 == 23) {
                  this.Field10574 = true;
               } else if (var4 == 24) {
                  this.Field10591 = var1.g2();
                  if (this.Field10591 == 65535) {
                     this.Field10591 = -1;
                  }

                  if (this.Field10591 >= Sequence.anims.length) {
                     this.Field10591 = -1;
                  }

                  if (this.Field10591 > 0) {
                     Sequence.anims[this.Field10591].Method8282();
                  }
               } else if (var4 == 28) {
                  this.Field10583 = var1.g1();
               } else if (var4 == 29) {
                  this.Field10550 = var1.Method400();
               } else if (var4 == 39) {
                  this.Field10555 = var1.Method400();
               } else if (var4 >= 30 && var4 < 39) {
                  if (this.Field10598 == null) {
                     this.Field10598 = new String[5];
                  }

                  this.Field10598[var4 - 30] = var1.Method406();
                  if (this.Field10598[var4 - 30].equalsIgnoreCase("hidden")) {
                     this.Field10598[var4 - 30] = null;
                  }
               } else if (var4 == 40) {
                  var4 = var1.g1();
                  this.Field10559 = new int[var4];
                  this.Field10594 = new int[var4];

                  for(var5 = 0; var5 < var4; ++var5) {
                     this.Field10594[var5] = var1.g2();
                     this.Field10559[var5] = var1.g2();
                  }
               } else if (var4 == 41) {
                  var4 = var1.g1();
                  this.Field10595 = new int[var4];
                  this.Field10596 = new int[var4];

                  for(var5 = 0; var5 < var4; ++var5) {
                     this.Field10596[var5] = var1.g2();
                     this.Field10595[var5] = var1.g2();
                  }
               } else if (var4 == 82) {
                  var1.g2();
               } else if (var4 == 62) {
                  this.Field10562 = true;
               } else if (var4 == 64) {
                  this.Field10588 = false;
               } else if (var4 == 65) {
                  this.Field10560 = var1.g2();
               } else if (var4 == 66) {
                  this.Field10580 = var1.g2();
               } else if (var4 == 67) {
                  this.Field10553 = var1.g2();
               } else if (var4 == 68) {
                  this.Field10567 = var1.g2();
               } else if (var4 == 69) {
                  this.Field10578 = var1.g1();
               } else if (var4 == 70) {
                  this.Field10551 = var1.g2();
               } else if (var4 == 71) {
                  this.Field10557 = var1.g2();
               } else if (var4 == 72) {
                  this.Field10592 = var1.g2();
               } else if (var4 == 73) {
                  this.Field10549 = true;
               } else if (var4 == 74) {
                  this.Field10576 = true;
               } else if (var4 == 75) {
                  this.Field10569 = var1.g1();
               } else if (var4 == 77) {
                  this.Field10561 = var1.g2();
                  if (this.Field10561 == 65535) {
                     this.Field10561 = -1;
                  }

                  this.Field10582 = var1.g2();
                  if (this.Field10582 == 65535) {
                     this.Field10582 = -1;
                  }

                  var4 = var1.g1();
                  this.Field10568 = new int[var4];

                  for(var5 = 0; var5 < var4; ++var5) {
                     this.Field10568[var5] = var1.g2();
                     if (this.Field10568[var5] == 65535) {
                        this.Field10568[var5] = -1;
                     }
                  }
               }

               this.Field10586 = this.Field10581 != null && (this.Field10584 == null || this.Field10584[0] == 10);
               if (this.Field10598 != null) {
                  this.Field10586 = true;
               }

               if (this.Field10552 == null || this.Field10552.equals("null")) {
                  this.Field10586 = false;
               }

               if (this.Field10576) {
                  this.Field10577 = false;
                  this.Field10566 = false;
               }

               if (this.Field10569 == -1) {
                  this.Field10569 = this.Field10577 ? 1 : 0;
               }
            }

         }
      }
   }

   private static void Method11950() {
      Field10543 = new HashMap();
      if (Client.normalMem) {
         Field10543.put(97, new Class888(37, 24));
         Field10543.put(155, new Class888(2, 23));
         Field10543.put(156, new Class888(2, 23));
         Field10543.put(157, new Class888(2, 23));
         Field10543.put(158, new Class888(2, 23));
         Field10543.put(159, new Class888(2, 23));
         Field10543.put(579, new Class888(5, 16));
         Field10543.put(580, new Class888(5, 16));
         Field10543.put(581, new Class888(5, 16));
         Field10543.put(582, new Class888(5, 16));
         Field10543.put(583, new Class888(5, 16));
         Field10543.put(584, new Class888(5, 16));
         Field10543.put(585, new Class888(5, 16));
         Field10543.put(586, new Class888(22, 16));
         Field10543.put(587, new Class888(22, 16));
         Field10543.put(588, new Class888(22, 16));
         Field10543.put(589, new Class888(22, 16));
         Field10543.put(590, new Class888(22, 16));
         Field10543.put(591, new Class888(22, 16));
         Field10543.put(592, new Class888(22, 16));
         Field10543.put(593, new Class888(22, 16));
         Field10543.put(594, new Class888(22, 16));
         Field10543.put(595, new Class888(22, 16));
         Field10543.put(596, new Class888(22, 16));
         Field10543.put(597, new Class888(22, 16));
         Field10543.put(598, new Class888(22, 16));
         Field10543.put(599, new Class888(22, 16));
         Field10543.put(600, new Class888(22, 16));
         Field10543.put(601, new Class888(22, 16));
         Field10543.put(602, new Class888(22, 16));
         Field10543.put(603, new Class888(22, 16));
         Field10543.put(604, new Class888(22, 16));
         Field10543.put(605, new Class888(22, 16));
         Field10543.put(606, new Class888(22, 16));
         Field10543.put(607, new Class888(22, 16));
         Field10543.put(608, new Class888(22, 16));
         Field10543.put(609, new Class888(22, 16));
         Field10543.put(610, new Class888(22, 16));
         Field10543.put(611, new Class888(22, 16));
         Field10543.put(612, new Class888(22, 16));
         Field10543.put(613, new Class888(22, 16));
         Field10543.put(614, new Class888(22, 16));
         Field10543.put(615, new Class888(22, 16));
         Field10543.put(616, new Class888(22, 16));
         Field10543.put(617, new Class888(22, 16));
         Field10543.put(618, new Class888(22, 16));
         Field10543.put(619, new Class888(22, 16));
         Field10543.put(620, new Class888(22, 16));
         Field10543.put(621, new Class888(22, 16));
         Field10543.put(622, new Class888(22, 16));
         Field10543.put(623, new Class888(22, 16));
         Field10543.put(624, new Class888(22, 16));
         Field10543.put(787, new Class888(22, 35));
         Field10543.put(788, new Class888(22, 35));
         Field10543.put(789, new Class888(22, 35));
         Field10543.put(790, new Class888(22, 35));
         Field10543.put(791, new Class888(22, 35));
         Field10543.put(792, new Class888(22, 35));
         Field10543.put(851, new Class888(22, 16));
         Field10543.put(852, new Class888(22, 16));
         Field10543.put(853, new Class888(22, 16));
         Field10543.put(854, new Class888(22, 16));
         Field10543.put(855, new Class888(22, 16));
         Field10543.put(856, new Class888(22, 16));
         Field10543.put(857, new Class888(22, 16));
         Field10543.put(858, new Class888(22, 16));
         Field10543.put(859, new Class888(22, 16));
         Field10543.put(860, new Class888(22, 16));
         Field10543.put(861, new Class888(22, 16));
         Field10543.put(862, new Class888(22, 16));
         Field10543.put(863, new Class888(22, 16));
         Field10543.put(864, new Class888(22, 16));
         Field10543.put(865, new Class888(22, 16));
         Field10543.put(866, new Class888(22, 16));
         Field10543.put(867, new Class888(22, 16));
         Field10543.put(868, new Class888(22, 16));
         Field10543.put(869, new Class888(22, 16));
         Field10543.put(870, new Class888(22, 16));
         Field10543.put(871, new Class888(22, 16));
         Field10543.put(872, new Class888(22, 16));
         Field10543.put(873, new Class888(22, 16));
         Field10543.put(874, new Class888(22, 16));
         Field10543.put(1511, new Class888(2, 45));
         Field10543.put(1512, new Class888(2, 45));
         Field10543.put(1513, new Class888(2, 45));
         Field10543.put(1514, new Class888(2, 45));
         Field10543.put(1515, new Class888(2, 45));
         Field10543.put(1530, new Class888(2, 45));
         Field10543.put(1531, new Class888(2, 45));
         Field10543.put(1533, new Class888(2, 45));
         Field10543.put(1534, new Class888(2, 45));
         Field10543.put(1535, new Class888(2, 45));
         Field10543.put(1536, new Class888(2, 4));
         Field10543.put(1537, new Class888(2, 4));
         Field10543.put(1538, new Class888(2, 4));
         Field10543.put(1586, new Class888(2, 23));
         Field10543.put(1587, new Class888(2, 23));
         Field10543.put(1588, new Class888(2, 23));
         Field10543.put(1589, new Class888(2, 23));
         Field10543.put(1590, new Class888(2, 23));
         Field10543.put(1591, new Class888(2, 23));
         Field10543.put(1592, new Class888(2, 23));
         Field10543.put(1593, new Class888(2, 23));
         Field10543.put(1604, new Class888(6, 18));
         Field10543.put(1605, new Class888(6, 18));
         Field10543.put(1608, new Class888(6, 18));
         Field10543.put(1609, new Class888(23, 16));
         Field10543.put(1610, new Class888(23, 16));
         Field10543.put(1611, new Class888(23, 16));
         Field10543.put(1612, new Class888(23, 16));
         Field10543.put(1613, new Class888(23, 16));
         Field10543.put(1614, new Class888(23, 16));
         Field10543.put(1620, new Class888(2, 23));
         Field10543.put(1621, new Class888(2, 23));
         Field10543.put(1622, new Class888(2, 23));
         Field10543.put(1623, new Class888(2, 23));
         Field10543.put(1631, new Class888(2, 23));
         Field10543.put(1632, new Class888(2, 23));
         Field10543.put(1633, new Class888(2, 23));
         Field10543.put(1634, new Class888(6, 18));
         Field10543.put(1635, new Class888(2, 23));
         Field10543.put(1636, new Class888(2, 23));
         Field10543.put(1637, new Class888(2, 23));
         Field10543.put(1638, new Class888(2, 23));
         Field10543.put(1639, new Class888(6, 18));
         Field10543.put(1640, new Class888(6, 16));
         Field10543.put(1641, new Class888(6, 18));
         Field10543.put(1642, new Class888(2, 23));
         Field10543.put(1643, new Class888(2, 23));
         Field10543.put(1644, new Class888(2, 23));
         Field10543.put(1649, new Class888(2, 23));
         Field10543.put(1650, new Class888(2, 23));
         Field10543.put(1652, new Class888(2, 23));
         Field10543.put(1653, new Class888(2, 23));
         Field10543.put(1654, new Class888(2, 23));
         Field10543.put(1655, new Class888(2, 23));
         Field10543.put(1656, new Class888(2, 23));
         Field10543.put(1657, new Class888(6, 16));
         Field10543.put(1658, new Class888(2, 23));
         Field10543.put(1659, new Class888(2, 23));
         Field10543.put(1661, new Class888(2, 36));
         Field10543.put(1662, new Class888(2, 36));
         Field10543.put(1663, new Class888(2, 36));
         Field10543.put(1664, new Class888(2, 36));
         Field10543.put(1687, new Class888(2, 48));
         Field10543.put(1688, new Class888(2, 11));
         Field10543.put(1689, new Class888(23, 11));
         Field10543.put(1690, new Class888(23, 11));
         Field10543.put(1691, new Class888(23, 11));
         Field10543.put(1692, new Class888(23, 11));
         Field10543.put(1693, new Class888(23, 48));
         Field10543.put(1694, new Class888(23, 48));
         Field10543.put(1718, new Class888(2, 23));
         Field10543.put(1719, new Class888(2, 23));
         Field10543.put(1720, new Class888(2, 23));
         Field10543.put(1722, new Class888(2, 22));
         Field10543.put(1723, new Class888(2, 22));
         Field10543.put(1724, new Class888(2, 22));
         Field10543.put(1725, new Class888(2, 22));
         Field10543.put(1726, new Class888(2, 22));
         Field10543.put(1727, new Class888(2, 22));
         Field10543.put(1728, new Class888(2, 22));
         Field10543.put(1729, new Class888(2, 22));
         Field10543.put(1730, new Class888(2, 22));
         Field10543.put(1731, new Class888(2, 22));
         Field10543.put(1732, new Class888(2, 22));
         Field10543.put(1733, new Class888(2, 22));
         Field10543.put(1734, new Class888(2, 22));
         Field10543.put(1735, new Class888(2, 22));
         Field10543.put(1736, new Class888(2, 22));
         Field10543.put(1737, new Class888(2, 22));
         Field10543.put(1738, new Class888(2, 22));
         Field10543.put(1739, new Class888(2, 22));
         Field10543.put(1740, new Class888(2, 22));
         Field10543.put(1741, new Class888(2, 22));
         Field10543.put(1742, new Class888(2, 22));
         Field10543.put(1743, new Class888(2, 22));
         Field10543.put(1744, new Class888(2, 22));
         Field10543.put(1745, new Class888(2, 22));
         Field10543.put(1746, new Class888(2, 22));
         Field10543.put(1747, new Class888(2, 22));
         Field10543.put(1748, new Class888(2, 22));
         Field10543.put(1749, new Class888(2, 22));
         Field10543.put(1750, new Class888(2, 22));
         Field10543.put(1751, new Class888(2, 22));
         Field10543.put(1752, new Class888(2, 22));
         Field10543.put(1753, new Class888(2, 22));
         Field10543.put(1754, new Class888(2, 22));
         Field10543.put(1755, new Class888(2, 22));
         Field10543.put(1756, new Class888(2, 22));
         Field10543.put(1757, new Class888(2, 22));
         Field10543.put(1758, new Class888(2, 22));
         Field10543.put(1759, new Class888(2, 22));
         Field10543.put(1760, new Class888(2, 22));
         Field10543.put(1761, new Class888(2, 22));
         Field10543.put(1763, new Class888(2, 22));
         Field10543.put(1764, new Class888(2, 22));
         Field10543.put(1765, new Class888(2, 22));
         Field10543.put(1766, new Class888(2, 22));
         Field10543.put(1767, new Class888(2, 22));
         Field10543.put(1768, new Class888(2, 22));
         Field10543.put(1769, new Class888(2, 22));
         Field10543.put(1770, new Class888(2, 3));
         Field10543.put(1791, new Class888(6, 44));
         Field10543.put(1792, new Class888(6, 18));
         Field10543.put(1793, new Class888(6, 16));
         Field10543.put(1794, new Class888(6, 18));
         Field10543.put(1795, new Class888(6, 18));
         Field10543.put(1808, new Class888(2, 47));
         Field10543.put(1809, new Class888(2, 11));
         Field10543.put(1811, new Class888(12, 26));
         Field10543.put(1925, new Class888(6, 44));
         Field10543.put(1926, new Class888(6, 18));
         Field10543.put(1928, new Class888(6, 44));
         Field10543.put(1929, new Class888(6, 18));
         Field10543.put(1930, new Class888(6, 18));
         Field10543.put(1931, new Class888(6, 18));
         Field10543.put(1932, new Class888(6, 18));
         Field10543.put(1933, new Class888(6, 16));
         Field10543.put(1934, new Class888(2, 23));
         Field10543.put(1935, new Class888(2, 23));
         Field10543.put(1936, new Class888(2, 23));
         Field10543.put(1939, new Class888(2, 23));
         Field10543.put(1940, new Class888(2, 23));
         Field10543.put(1945, new Class888(2, 23));
         Field10543.put(1946, new Class888(2, 23));
         Field10543.put(1949, new Class888(23, 2));
         Field10543.put(1950, new Class888(23, 2));
         Field10543.put(1951, new Class888(23, 2));
         Field10543.put(1952, new Class888(23, 2));
         Field10543.put(1953, new Class888(23, 2));
         Field10543.put(2001, new Class888(2, 4));
         Field10543.put(2003, new Class888(2, 4));
         Field10543.put(2062, new Class888(2, 23));
         Field10543.put(2063, new Class888(2, 23));
         Field10543.put(2064, new Class888(2, 23));
         Field10543.put(2065, new Class888(2, 23));
         Field10543.put(2066, new Class888(2, 23));
         Field10543.put(2070, new Class888(2, 45));
         Field10543.put(2527, new Class888(2, 0));
         Field10543.put(2529, new Class888(2, 0));
         Field10543.put(2536, new Class888(2, 0));
         Field10543.put(2538, new Class888(2, 0));
         Field10543.put(2713, new Class888(2, 23));
         Field10543.put(2714, new Class888(2, 23));
         Field10543.put(2715, new Class888(2, 23));
         Field10543.put(2716, new Class888(2, 23));
         Field10543.put(2717, new Class888(2, 23));
         Field10543.put(2718, new Class888(2, 23));
         Field10543.put(2719, new Class888(2, 23));
         Field10543.put(2720, new Class888(2, 23));
         Field10543.put(2721, new Class888(2, 23));
         Field10543.put(2722, new Class888(2, 23));
         Field10543.put(2723, new Class888(2, 23));
         Field10543.put(2724, new Class888(2, 23));
         Field10543.put(2725, new Class888(2, 23));
         Field10543.put(2726, new Class888(2, 23));
         Field10543.put(2924, new Class888(24, 4));
         Field10543.put(2925, new Class888(24, 4));
         Field10543.put(3209, new Class888(2, 23));
         Field10543.put(3210, new Class888(2, 23));
         Field10543.put(3211, new Class888(2, 23));
         Field10543.put(3212, new Class888(2, 23));
         Field10543.put(3371, new Class888(8, 45));
         Field10543.put(3372, new Class888(8, 45));
         Field10543.put(3373, new Class888(8, 45));
         Field10543.put(3374, new Class888(8, 45));
         Field10543.put(3375, new Class888(8, 45));
         Field10543.put(3376, new Class888(8, 45));
         Field10543.put(3377, new Class888(8, 45));
         Field10543.put(3378, new Class888(8, 45));
         Field10543.put(3379, new Class888(8, 45));
         Field10543.put(3380, new Class888(8, 45));
         Field10543.put(3381, new Class888(8, 45));
         Field10543.put(3382, new Class888(8, 45));
         Field10543.put(3383, new Class888(8, 45));
         Field10543.put(3384, new Class888(8, 45));
         Field10543.put(3385, new Class888(8, 45));
         Field10543.put(3386, new Class888(8, 45));
         Field10543.put(3435, new Class888(16, 5));
         Field10543.put(3436, new Class888(16, 5));
         Field10543.put(3437, new Class888(16, 5));
         Field10543.put(3438, new Class888(16, 5));
         Field10543.put(3439, new Class888(16, 5));
         Field10543.put(3441, new Class888(16, 5));
         Field10543.put(3442, new Class888(16, 5));
         Field10543.put(3450, new Class888(16, 5));
         Field10543.put(3451, new Class888(16, 5));
         Field10543.put(3452, new Class888(16, 5));
         Field10543.put(3453, new Class888(16, 5));
         Field10543.put(3454, new Class888(16, 5));
         Field10543.put(3475, new Class888(16, 5));
         Field10543.put(3476, new Class888(16, 5));
         Field10543.put(3477, new Class888(16, 5));
         Field10543.put(3479, new Class888(0, 24));
         Field10543.put(3480, new Class888(0, 24));
         Field10543.put(3481, new Class888(0, 24));
         Field10543.put(3491, new Class888(16, 5));
         Field10543.put(3492, new Class888(16, 5));
         Field10543.put(3551, new Class888(2, 35));
         Field10543.put(3552, new Class888(2, 35));
         Field10543.put(3553, new Class888(2, 35));
         Field10543.put(3554, new Class888(2, 35));
         Field10543.put(3555, new Class888(2, 35));
         Field10543.put(3556, new Class888(2, 35));
         Field10543.put(3557, new Class888(2, 35));
         Field10543.put(3558, new Class888(2, 35));
         Field10543.put(3559, new Class888(2, 35));
         Field10543.put(3560, new Class888(2, 35));
         Field10543.put(3561, new Class888(2, 35));
         Field10543.put(3562, new Class888(2, 35));
         Field10543.put(3563, new Class888(2, 35));
         Field10543.put(3564, new Class888(2, 35));
         Field10543.put(3565, new Class888(2, 35));
         Field10543.put(3566, new Class888(2, 35));
         Field10543.put(3567, new Class888(2, 35));
         Field10543.put(3568, new Class888(2, 35));
         Field10543.put(3569, new Class888(2, 35));
         Field10543.put(3570, new Class888(2, 35));
         Field10543.put(3571, new Class888(2, 35));
         Field10543.put(3572, new Class888(2, 35));
         Field10543.put(3573, new Class888(2, 35));
         Field10543.put(3574, new Class888(2, 35));
         Field10543.put(3575, new Class888(2, 35));
         Field10543.put(3576, new Class888(2, 35));
         Field10543.put(3577, new Class888(2, 35));
         Field10543.put(3578, new Class888(2, 35));
         Field10543.put(3579, new Class888(2, 35));
         Field10543.put(3580, new Class888(2, 35));
         Field10543.put(3581, new Class888(2, 35));
         Field10543.put(3582, new Class888(2, 35));
         Field10543.put(3583, new Class888(2, 35));
         Field10543.put(3584, new Class888(2, 35));
         Field10543.put(3585, new Class888(2, 35));
         Field10543.put(3586, new Class888(2, 35));
         Field10543.put(3587, new Class888(2, 35));
         Field10543.put(3588, new Class888(2, 35));
         Field10543.put(3595, new Class888(23, 35));
         Field10543.put(3596, new Class888(23, 35));
         Field10543.put(32723, new Class888(2, 35));
         Field10543.put(32725, new Class888(23, 35));
         Field10543.put(32728, new Class888(23, 35));
         Field10543.put(32729, new Class888(23, 35));
         Field10543.put(3597, new Class888(23, 35));
         Field10543.put(3620, new Class888(16, 5));
         Field10543.put(3621, new Class888(16, 5));
         Field10543.put(3622, new Class888(44, 18));
         Field10543.put(3623, new Class888(0, 24));
         Field10543.put(3624, new Class888(0, 24));
         Field10543.put(3625, new Class888(0, 24));
         Field10543.put(3744, new Class888(2, 45));
         Field10543.put(4004, new Class888(46, 35));
         Field10543.put(4005, new Class888(46, 35));
         Field10543.put(4006, new Class888(46, 35));
         Field10543.put(4007, new Class888(46, 35));
         Field10543.put(4008, new Class888(46, 35));
         Field10543.put(4009, new Class888(46, 35));
         Field10543.put(4010, new Class888(46, 35));
         Field10543.put(4011, new Class888(46, 35));
         Field10543.put(4012, new Class888(46, 35));
         Field10543.put(4013, new Class888(46, 35));
         Field10543.put(4014, new Class888(46, 35));
         Field10543.put(4015, new Class888(46, 35));
         Field10543.put(4016, new Class888(46, 35));
         Field10543.put(4017, new Class888(46, 35));
         Field10543.put(4018, new Class888(46, 35));
         Field10543.put(4019, new Class888(46, 35));
         Field10543.put(4020, new Class888(46, 35));
         Field10543.put(4021, new Class888(46, 35));
         Field10543.put(4022, new Class888(46, 35));
         Field10543.put(4023, new Class888(46, 35));
         Field10543.put(4131, new Class888(22, 16));
         Field10543.put(4296, new Class888(16, 22));
         Field10543.put(4297, new Class888(16, 22));
         Field10543.put(4298, new Class888(16, 22));
         Field10543.put(4299, new Class888(16, 22));
         Field10543.put(4306, new Class888(16, 22));
         Field10543.put(4307, new Class888(16, 22));
         Field10543.put(4325, new Class888(47, 46));
         Field10543.put(4375, new Class888(16, 5));
         Field10543.put(4406, new Class888(2, 35));
         Field10543.put(4407, new Class888(2, 35));
         Field10543.put(4409, new Class888(2, 35));
         Field10543.put(4410, new Class888(2, 35));
         Field10543.put(4415, new Class888(2, 35));
         Field10543.put(4417, new Class888(23, 35));
         Field10543.put(4444, new Class888(2, 35));
         Field10543.put(4445, new Class888(2, 35));
         Field10543.put(4449, new Class888(23, 35));
         Field10543.put(4450, new Class888(23, 35));
         Field10543.put(4452, new Class888(23, 35));
         Field10543.put(4453, new Class888(23, 35));
         Field10543.put(4454, new Class888(23, 35));
         Field10543.put(4455, new Class888(23, 35));
         Field10543.put(4456, new Class888(23, 35));
         Field10543.put(4457, new Class888(23, 35));
         Field10543.put(4502, new Class888(2, 23));
         Field10543.put(4503, new Class888(2, 23));
         Field10543.put(4610, new Class888(23, 2));
         Field10543.put(4611, new Class888(23, 2));
         Field10543.put(4612, new Class888(23, 2));
         Field10543.put(4613, new Class888(23, 2));
         Field10543.put(4614, new Class888(23, 2));
         Field10543.put(4615, new Class888(23, 2));
         Field10543.put(4616, new Class888(23, 2));
         Field10543.put(4617, new Class888(23, 2));
         Field10543.put(4618, new Class888(23, 2));
         Field10543.put(4629, new Class888(2, 23));
         Field10543.put(4630, new Class888(2, 23));
         Field10543.put(4631, new Class888(2, 23));
         Field10543.put(4632, new Class888(2, 23));
         Field10543.put(4633, new Class888(2, 23));
         Field10543.put(4634, new Class888(2, 23));
         Field10543.put(4635, new Class888(2, 23));
         Field10543.put(4636, new Class888(2, 4));
         Field10543.put(4637, new Class888(2, 4));
         Field10543.put(4638, new Class888(2, 4));
         Field10543.put(4639, new Class888(2, 4));
         Field10543.put(4640, new Class888(2, 4));
         Field10543.put(4673, new Class888(2, 45));
         Field10543.put(4901, new Class888(23, 35));
         Field10543.put(4903, new Class888(23, 35));
         Field10543.put(4904, new Class888(23, 35));
         Field10543.put(4905, new Class888(23, 35));
         Field10543.put(4906, new Class888(23, 35));
         Field10543.put(4907, new Class888(23, 35));
         Field10543.put(4908, new Class888(2, 23));
         Field10543.put(5053, new Class888(2, 23));
         Field10543.put(5190, new Class888(2, 23));
         Field10543.put(5191, new Class888(2, 23));
         Field10543.put(5625, new Class888(22, 16));
         Field10543.put(5635, new Class888(6, 18));
         Field10543.put(5637, new Class888(6, 18));
         Field10543.put(5638, new Class888(6, 18));
         Field10543.put(5664, new Class888(6, 44));
         Field10543.put(5665, new Class888(6, 44));
         Field10543.put(5666, new Class888(6, 44));
         Field10543.put(5667, new Class888(6, 44));
         Field10543.put(5668, new Class888(6, 44));
         Field10543.put(5669, new Class888(6, 44));
         Field10543.put(5670, new Class888(6, 44));
         Field10543.put(5671, new Class888(6, 44));
         Field10543.put(5672, new Class888(6, 44));
         Field10543.put(5673, new Class888(6, 44));
         Field10543.put(5674, new Class888(6, 44));
         Field10543.put(5675, new Class888(6, 44));
         Field10543.put(5676, new Class888(6, 44));
         Field10543.put(5677, new Class888(6, 44));
         Field10543.put(5678, new Class888(6, 44));
         Field10543.put(5679, new Class888(6, 44));
         Field10543.put(5680, new Class888(6, 44));
         Field10543.put(5681, new Class888(6, 44));
         Field10543.put(5682, new Class888(6, 44));
         Field10543.put(5683, new Class888(6, 44));
         Field10543.put(5684, new Class888(6, 44));
         Field10543.put(5685, new Class888(6, 44));
         Field10543.put(5686, new Class888(6, 44));
         Field10543.put(5687, new Class888(6, 44));
         Field10543.put(5688, new Class888(6, 18));
         Field10543.put(5689, new Class888(6, 18));
         Field10543.put(5690, new Class888(6, 18));
         Field10543.put(5691, new Class888(6, 18));
         Field10543.put(5692, new Class888(6, 18));
         Field10543.put(5693, new Class888(6, 18));
         Field10543.put(5694, new Class888(6, 18));
         Field10543.put(5695, new Class888(6, 18));
         Field10543.put(5696, new Class888(6, 18));
         Field10543.put(5697, new Class888(6, 18));
         Field10543.put(5698, new Class888(6, 18));
         Field10543.put(5699, new Class888(6, 18));
         Field10543.put(5700, new Class888(6, 18));
         Field10543.put(5701, new Class888(6, 18));
         Field10543.put(5702, new Class888(6, 18));
         Field10543.put(5703, new Class888(6, 18));
         Field10543.put(5704, new Class888(6, 18));
         Field10543.put(5705, new Class888(6, 18));
         Field10543.put(5706, new Class888(6, 18));
         Field10543.put(5707, new Class888(6, 18));
         Field10543.put(5708, new Class888(6, 18));
         Field10543.put(5709, new Class888(6, 18));
         Field10543.put(5710, new Class888(2, 23));
         Field10543.put(5711, new Class888(2, 23));
         Field10543.put(5712, new Class888(2, 23));
         Field10543.put(5713, new Class888(2, 23));
         Field10543.put(5714, new Class888(2, 23));
         Field10543.put(5715, new Class888(2, 23));
         Field10543.put(5716, new Class888(2, 23));
         Field10543.put(5717, new Class888(2, 23));
         Field10543.put(5718, new Class888(2, 23));
         Field10543.put(5719, new Class888(2, 23));
         Field10543.put(5720, new Class888(2, 23));
         Field10543.put(5721, new Class888(2, 23));
         Field10543.put(5722, new Class888(2, 23));
         Field10543.put(5723, new Class888(2, 23));
         Field10543.put(5724, new Class888(2, 23));
         Field10543.put(5725, new Class888(2, 23));
         Field10543.put(5726, new Class888(2, 23));
         Field10543.put(5727, new Class888(2, 23));
         Field10543.put(5728, new Class888(2, 23));
         Field10543.put(5729, new Class888(2, 23));
         Field10543.put(5730, new Class888(2, 23));
         Field10543.put(5731, new Class888(2, 23));
         Field10543.put(5732, new Class888(2, 23));
         Field10543.put(5733, new Class888(2, 23));
         Field10543.put(5734, new Class888(6, 44));
         Field10543.put(5735, new Class888(6, 44));
         Field10543.put(5736, new Class888(6, 44));
         Field10543.put(5737, new Class888(6, 44));
         Field10543.put(5738, new Class888(6, 44));
         Field10543.put(5739, new Class888(6, 44));
         Field10543.put(5740, new Class888(6, 44));
         Field10543.put(5741, new Class888(6, 44));
         Field10543.put(5742, new Class888(6, 44));
         Field10543.put(5743, new Class888(6, 44));
         Field10543.put(5744, new Class888(6, 44));
         Field10543.put(5745, new Class888(6, 44));
         Field10543.put(5746, new Class888(6, 44));
         Field10543.put(5747, new Class888(6, 44));
         Field10543.put(5748, new Class888(6, 44));
         Field10543.put(5749, new Class888(6, 44));
         Field10543.put(5750, new Class888(6, 44));
         Field10543.put(5751, new Class888(6, 44));
         Field10543.put(5752, new Class888(6, 44));
         Field10543.put(5753, new Class888(6, 44));
         Field10543.put(5754, new Class888(6, 44));
         Field10543.put(5755, new Class888(6, 44));
         Field10543.put(5756, new Class888(6, 44));
         Field10543.put(5757, new Class888(6, 44));
         Field10543.put(5758, new Class888(6, 18));
         Field10543.put(5759, new Class888(6, 18));
         Field10543.put(5760, new Class888(6, 18));
         Field10543.put(5761, new Class888(6, 18));
         Field10543.put(5762, new Class888(6, 18));
         Field10543.put(5763, new Class888(6, 18));
         Field10543.put(5764, new Class888(6, 18));
         Field10543.put(5765, new Class888(6, 18));
         Field10543.put(5766, new Class888(6, 18));
         Field10543.put(5767, new Class888(6, 18));
         Field10543.put(5768, new Class888(6, 18));
         Field10543.put(5769, new Class888(6, 18));
         Field10543.put(5770, new Class888(6, 18));
         Field10543.put(5771, new Class888(6, 18));
         Field10543.put(5772, new Class888(6, 18));
         Field10543.put(5773, new Class888(6, 18));
         Field10543.put(5774, new Class888(6, 18));
         Field10543.put(5775, new Class888(6, 18));
         Field10543.put(5776, new Class888(6, 18));
         Field10543.put(5777, new Class888(6, 18));
         Field10543.put(5778, new Class888(6, 18));
         Field10543.put(5779, new Class888(6, 18));
         Field10543.put(5830, new Class888(16, 22));
         Field10543.put(5831, new Class888(16, 22));
         Field10543.put(5832, new Class888(16, 22));
         Field10543.put(6146, new Class888(2, 23));
         Field10543.put(6147, new Class888(2, 23));
         Field10543.put(6148, new Class888(2, 23));
         Field10543.put(6149, new Class888(2, 23));
         Field10543.put(6150, new Class888(2, 23));
         Field10543.put(6151, new Class888(2, 23));
         Field10543.put(6152, new Class888(2, 23));
         Field10543.put(6153, new Class888(2, 23));
         Field10543.put(6154, new Class888(2, 23));
         Field10543.put(6155, new Class888(2, 23));
         Field10543.put(6156, new Class888(2, 23));
         Field10543.put(6157, new Class888(2, 23));
         Field10543.put(6158, new Class888(2, 23));
         Field10543.put(6159, new Class888(2, 23));
         Field10543.put(6160, new Class888(2, 23));
         Field10543.put(6161, new Class888(2, 23));
         Field10543.put(6162, new Class888(2, 23));
         Field10543.put(6173, new Class888(2, 23));
         Field10543.put(6174, new Class888(2, 23));
         Field10543.put(6175, new Class888(2, 23));
         Field10543.put(6176, new Class888(2, 23));
         Field10543.put(6177, new Class888(2, 23));
         Field10543.put(6178, new Class888(2, 23));
         Field10543.put(6179, new Class888(2, 23));
         Field10543.put(6180, new Class888(2, 23));
         Field10543.put(6181, new Class888(2, 23));
         Field10543.put(6182, new Class888(2, 23));
         Field10543.put(6183, new Class888(2, 23));
         Field10543.put(6184, new Class888(2, 23));
         Field10543.put(6185, new Class888(2, 23));
         Field10543.put(6186, new Class888(2, 23));
         Field10543.put(6187, new Class888(2, 23));
         Field10543.put(6188, new Class888(2, 23));
         Field10543.put(6189, new Class888(2, 23));
         Field10543.put(6190, new Class888(2, 23));
         Field10543.put(6191, new Class888(2, 23));
         Field10543.put(6192, new Class888(2, 23));
         Field10543.put(6193, new Class888(2, 23));
         Field10543.put(6194, new Class888(2, 23));
         Field10543.put(6195, new Class888(2, 23));
         Field10543.put(6196, new Class888(2, 23));
         Field10543.put(6197, new Class888(2, 23));
         Field10543.put(6198, new Class888(2, 23));
         Field10543.put(6199, new Class888(2, 23));
         Field10543.put(6200, new Class888(2, 23));
         Field10543.put(6201, new Class888(2, 23));
         Field10543.put(6202, new Class888(2, 23));
         Field10543.put(6203, new Class888(2, 23));
         Field10543.put(6204, new Class888(2, 23));
         Field10543.put(6205, new Class888(2, 23));
         Field10543.put(6206, new Class888(2, 23));
         Field10543.put(6207, new Class888(2, 23));
         Field10543.put(6208, new Class888(2, 23));
         Field10543.put(6209, new Class888(2, 23));
         Field10543.put(6283, new Class888(45, 16));
         Field10543.put(6284, new Class888(45, 16));
         Field10543.put(6285, new Class888(45, 16));
         Field10543.put(6286, new Class888(45, 16));
         Field10543.put(6287, new Class888(45, 16));
         Field10543.put(6301, new Class888(41, 4));
         Field10543.put(6302, new Class888(41, 4));
         Field10543.put(6421, new Class888(41, 20));
         Field10543.put(7248, new Class888(2, 4));
         Field10543.put(7249, new Class888(2, 4));
         Field10543.put(7250, new Class888(2, 4));
         Field10543.put(7251, new Class888(2, 4));
         Field10543.put(7252, new Class888(2, 4));
         Field10543.put(7253, new Class888(2, 4));
         Field10543.put(7254, new Class888(2, 4));
         Field10543.put(7255, new Class888(2, 4));
         Field10543.put(7256, new Class888(2, 4));
         Field10543.put(7257, new Class888(2, 4));
         Field10543.put(7258, new Class888(2, 4));
         Field10543.put(7259, new Class888(2, 4));
         Field10543.put(7260, new Class888(2, 4));
         Field10543.put(8471, new Class888(8, 41));
         Field10543.put(8472, new Class888(8, 41));
         Field10543.put(8785, new Class888(2, 0));
         Field10543.put(8786, new Class888(2, 0));
         Field10543.put(8787, new Class888(2, 0));
         Field10543.put(8788, new Class888(2, 0));
         Field10543.put(8789, new Class888(2, 0));
         Field10543.put(8790, new Class888(2, 0));
         Field10543.put(8791, new Class888(2, 0));
         Field10543.put(8792, new Class888(2, 0));
         Field10543.put(8793, new Class888(2, 0));
         Field10543.put(9070, new Class888(22, 16));
         Field10543.put(9071, new Class888(22, 16));
         Field10543.put(9072, new Class888(22, 16));
         Field10543.put(9073, new Class888(22, 16));
         Field10543.put(9074, new Class888(22, 16));
         Field10543.put(9075, new Class888(22, 16));
         Field10543.put(9076, new Class888(22, 16));
         Field10543.put(9077, new Class888(22, 16));
         Field10543.put(9078, new Class888(22, 16));
         Field10543.put(9079, new Class888(22, 16));
         Field10543.put(9080, new Class888(22, 16));
         Field10543.put(9081, new Class888(22, 16));
         Field10543.put(9082, new Class888(22, 16));
         Field10543.put(9140, new Class888(2, 23));
         Field10543.put(9141, new Class888(2, 23));
         Field10543.put(9142, new Class888(2, 23));
         Field10543.put(9143, new Class888(2, 23));
         Field10543.put(9144, new Class888(2, 23));
         Field10543.put(9145, new Class888(2, 23));
         Field10543.put(9146, new Class888(2, 23));
         Field10543.put(9147, new Class888(2, 23));
         Field10543.put(9148, new Class888(2, 23));
         Field10543.put(9149, new Class888(2, 23));
         Field10543.put(9150, new Class888(2, 23));
         Field10543.put(9151, new Class888(2, 23));
         Field10543.put(9152, new Class888(2, 23));
         Field10543.put(9153, new Class888(2, 23));
         Field10543.put(9154, new Class888(2, 23));
         Field10543.put(9475, new Class888(6, 16));
         Field10543.put(9476, new Class888(6, 44));
         Field10543.put(9477, new Class888(6, 44));
         Field10543.put(9478, new Class888(6, 44));
         Field10543.put(9479, new Class888(6, 44));
         Field10543.put(9480, new Class888(6, 44));
         Field10543.put(9481, new Class888(6, 44));
         Field10543.put(9482, new Class888(6, 44));
         Field10543.put(9483, new Class888(6, 44));
         Field10543.put(9514, new Class888(16, 22));
         Field10543.put(9515, new Class888(16, 22));
         Field10543.put(9516, new Class888(16, 22));
         Field10543.put(9517, new Class888(16, 22));
         Field10543.put(9518, new Class888(16, 22));
         Field10543.put(9570, new Class888(6, 44));
         Field10543.put(9571, new Class888(6, 44));
         Field10543.put(10062, new Class888(2, 23));
         Field10543.put(10063, new Class888(2, 23));
         Field10543.put(10285, new Class888(2, 4));
         Field10543.put(10286, new Class888(2, 23));
         Field10543.put(10287, new Class888(2, 23));
         Field10543.put(10288, new Class888(2, 23));
         Field10543.put(10289, new Class888(2, 23));
         Field10543.put(10322, new Class888(2, 23));
         Field10543.put(10323, new Class888(2, 23));
         Field10543.put(10324, new Class888(2, 23));
         Field10543.put(10325, new Class888(2, 23));
         Field10543.put(10326, new Class888(2, 23));
         Field10543.put(10327, new Class888(2, 23));
         Field10543.put(10328, new Class888(2, 23));
         Field10543.put(10329, new Class888(2, 23));
         Field10543.put(10330, new Class888(2, 23));
         Field10543.put(11448, new Class888(2, 23));
         Field10543.put(11449, new Class888(2, 23));
         Field10543.put(11450, new Class888(2, 23));
         Field10543.put(11451, new Class888(2, 23));
         Field10543.put(11452, new Class888(2, 23));
         Field10543.put(11453, new Class888(2, 23));
         Field10543.put(11454, new Class888(2, 23));
         Field10543.put(11455, new Class888(2, 23));
         Field10543.put(11456, new Class888(2, 23));
         Field10543.put(11457, new Class888(2, 23));
         Field10543.put(11458, new Class888(2, 23));
         Field10543.put(11459, new Class888(2, 23));
         Field10543.put(11460, new Class888(2, 23));
         Field10543.put(11461, new Class888(2, 23));
         Field10543.put(11462, new Class888(2, 23));
         Field10543.put(11463, new Class888(2, 23));
         Field10543.put(11464, new Class888(2, 23));
         Field10543.put(11465, new Class888(2, 23));
         Field10543.put(11466, new Class888(2, 23));
         Field10543.put(11467, new Class888(2, 23));
         Field10543.put(11510, new Class888(2, 23));
         Field10543.put(11511, new Class888(2, 23));
         Field10543.put(11512, new Class888(2, 23));
         Field10543.put(11513, new Class888(2, 23));
         Field10543.put(11514, new Class888(2, 23));
         Field10543.put(11515, new Class888(2, 23));
         Field10543.put(11516, new Class888(2, 23));
         Field10543.put(11517, new Class888(2, 23));
         Field10543.put(11518, new Class888(2, 23));
         Field10543.put(11519, new Class888(2, 23));
         Field10543.put(11520, new Class888(2, 23));
         Field10543.put(11521, new Class888(2, 23));
         Field10543.put(11522, new Class888(2, 23));
         Field10543.put(11523, new Class888(2, 23));
         Field10543.put(11524, new Class888(2, 23));
         Field10543.put(11525, new Class888(2, 23));
         Field10543.put(11526, new Class888(2, 23));
         Field10543.put(11527, new Class888(2, 23));
         Field10543.put(11528, new Class888(2, 23));
         Field10543.put(11529, new Class888(2, 23));
         Field10543.put(11530, new Class888(2, 23));
         Field10543.put(11531, new Class888(2, 23));
         Field10543.put(11532, new Class888(2, 23));
         Field10543.put(11533, new Class888(2, 23));
         Field10543.put(11534, new Class888(2, 23));
         Field10543.put(11535, new Class888(2, 23));
         Field10543.put(11536, new Class888(2, 23));
         Field10543.put(11537, new Class888(2, 23));
         Field10543.put(11538, new Class888(2, 23));
         Field10543.put(11539, new Class888(2, 23));
         Field10543.put(11540, new Class888(2, 23));
         Field10543.put(11541, new Class888(2, 23));
         Field10543.put(11542, new Class888(2, 23));
         Field10543.put(11543, new Class888(2, 23));
         Field10543.put(11544, new Class888(2, 23));
         Field10543.put(11545, new Class888(2, 23));
         Field10543.put(12347, new Class888(2, 4));
         Field10543.put(12348, new Class888(2, 4));
         Field10543.put(12700, new Class888(2, 0));
         Field10543.put(13012, new Class888(6, 18));
         Field10543.put(13013, new Class888(6, 18));
         Field10543.put(13014, new Class888(6, 18));
         Field10543.put(14040, new Class888(16, 22));
         Field10543.put(14041, new Class888(16, 22));
         Field10543.put(14042, new Class888(16, 22));
         Field10543.put(14384, new Class888(43, 28));
         Field10543.put(14385, new Class888(43, 28));
         Field10543.put(14386, new Class888(43, 28));
         Field10543.put(14387, new Class888(43, 28));
         Field10543.put(14388, new Class888(43, 28));
         Field10543.put(14389, new Class888(43, 28));
         Field10543.put(14390, new Class888(43, 28));
         Field10543.put(14391, new Class888(43, 28));
         Field10543.put(14392, new Class888(43, 28));
         Field10543.put(14393, new Class888(43, 28));
         Field10543.put(14394, new Class888(43, 28));
         Field10543.put(14461, new Class888(43, 28));
         Field10543.put(14462, new Class888(43, 28));
         Field10543.put(14463, new Class888(43, 28));
         Field10543.put(14464, new Class888(43, 28));
         Field10543.put(14465, new Class888(43, 28));
         Field10543.put(14466, new Class888(43, 28));
         Field10543.put(14467, new Class888(43, 28));
         Field10543.put(14468, new Class888(43, 28));
         Field10543.put(14469, new Class888(43, 28));
         Field10543.put(14470, new Class888(43, 28));
         Field10543.put(14471, new Class888(43, 28));
         Field10543.put(14883, new Class888(37, 41));
         Field10543.put(14884, new Class888(37, 41));
         Field10543.put(14885, new Class888(37, 41));
         Field10543.put(14886, new Class888(37, 41));
         Field10543.put(14887, new Class888(37, 41));
         Field10543.put(14888, new Class888(37, 41));
         Field10543.put(14889, new Class888(37, 41));
         Field10543.put(14890, new Class888(37, 41));
         Field10543.put(14891, new Class888(37, 41));
         Field10543.put(14892, new Class888(37, 41));
         Field10543.put(14893, new Class888(37, 41));
         Field10543.put(14894, new Class888(37, 41));
         Field10543.put(14895, new Class888(37, 41));
         Field10543.put(14896, new Class888(37, 41));
         Field10543.put(14897, new Class888(37, 41));
         Field10543.put(14898, new Class888(37, 41));
         Field10543.put(14899, new Class888(37, 41));
         Field10543.put(14900, new Class888(37, 41));
         Field10543.put(14901, new Class888(37, 41));
         Field10543.put(14902, new Class888(37, 41));
         Field10543.put(14903, new Class888(37, 41));
         Field10543.put(14904, new Class888(37, 41));
         Field10543.put(14905, new Class888(37, 41));
         Field10543.put(14906, new Class888(37, 41));
         Field10543.put(14907, new Class888(37, 41));
         Field10543.put(14912, new Class888(24, 41));
         Field10543.put(14913, new Class888(24, 41));
         Field10543.put(14914, new Class888(24, 41));
         Field10543.put(14915, new Class888(24, 41));
         Field10543.put(14916, new Class888(24, 41));
      }
   }
}
