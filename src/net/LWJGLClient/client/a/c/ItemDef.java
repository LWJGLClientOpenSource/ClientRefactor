package net.LWJGLClient.client.a.c;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.imageio.ImageIO;

import net.LWJGLClient.client.e.Class23;
import net.LWJGLClient.client.a.d.RgbImage;
import net.LWJGLClient.client.a.e.JagexArchive;
import net.LWJGLClient.client.b.Rasterizer;
import net.LWJGLClient.client.b.a.Class697;
import net.LWJGLClient.client.b.b.GraphicsDisplay;
import net.LWJGLClient.client.c.Packet;
import net.LWJGLClient.client.model.Client;
import net.LWJGLClient.client.model.Model;
import net.LWJGLClient.client.model.a.d.ParticleDefinition;
import net.LWJGLClient.client.model.c.MemCache;
import net.LWJGLClient.client.model.c.Class175;

public final class ItemDef {
   private static MemCache Field10607 = new MemCache(200);
   public static Map Field10608 = null;
   public static int Field10609 = 23207;
   public static int Field10610 = 16295;
   private static Map Field10611 = new HashMap();
   private static boolean Field10612 = false;
   private boolean Field10613 = false;
   public static int Field10614 = 37887;
   public static int Field10615 = 48127;
   public static int Field10616 = 23551;
   public static int Field10617 = 5119;
   private boolean Field10618 = false;
   private int Field10619;
   public int Field10620;
   private int[][] Field10621;
   private int[] Field10622;
   private int[] Field10623;
   private int[] Field10624;
   private int[] Field10625;
   public int Field10626 = -1;
   public static Class175 Field10627 = new Class175(200);
   public static Class175 Field10628 = new Class175(100);
   private static Class175 Field10629 = new Class175(50);
   private boolean Field10630;
   public int Field10631;
   private int Field10632;
   public int Field10633;
   public int Field10634;
   public int genderZeroOffset2;
   private int Field10636;
   public String[] Field10637;
   private int Field10638;
   public String Field10639;
   public int genderOneOffset2;
   public int Field10641;
   public int genderZeroOffset;
   public boolean Field10643;
   public byte[] Field10644;
   private int Field10645;
   public int Field10646;
   public static boolean enableMembersItems = true;
   private static Packet Field10648;
   private int Field10649;
   public int Field10650;
   public int Field10651;
   public String[] Field10652;
   public int Field10653;
   private int Field10654;
   private int Field10655;
   private int[] Field10656;
   private int Field10657;
   private static int[] Field10658;
   private int Field10659;
   public int genderOneOffset;
   public int Field10661;
   public int Field10662;
   private int[] Field10663;
   public int Field10664;
   public static int Field10665;
   private int Field10666;
   private int Field10667;
   public int Field10668;
   private static BufferedImage Field10669 = null;
   private static Graphics Field10670 = null;
   private static BufferedImage Field10671 = null;
   public static int Field10672 = 0;
   public static int Field10673 = 0;
   private static int Field10674 = 0;

   public static void Method11903() {
      Field10628 = null;
      Field10627 = null;
      Field10658 = null;
      if (Field10607 != null) {
         Field10607.Method1512();
         Field10607 = null;
      }

      Field10648 = null;
   }

   public static void Method11904() {
      Field10607.Method1512();
      Field10628.Method1839();
      Field10627.Method1839();
   }

   public static void Method11905(String var0) {
      Field10611.clear();

      try {
         BufferedReader var4 = new BufferedReader(new FileReader(var0));

         while(true) {
            String var1;
            while((var1 = var4.readLine()) != null) {
               int var5;
               if (var1.contains("-")) {
                  String[] var6;
                  int var2 = Integer.parseInt((var6 = var1.split("-"))[0]);
                  var5 = Integer.parseInt(var6[1]);

                  for(var2 = var2; var2 < var5; ++var2) {
                     Field10611.put(var2, true);
                  }
               } else {
                  var5 = Integer.parseInt(var1);
                  Field10611.put(var5, true);
               }
            }

            return;
         }
      } catch (IOException var3) {
         var3.printStackTrace();
      }
   }

   public static void Method11906(JagexArchive var0) {
      boolean var7 = false;
      var0 = var0;

      try {
         Field10648 = new Packet(var0.readConfig("obj.dat"));
         Packet var8 = new Packet(var0.readConfig("obj.idx"));
         int var1 = 0;
         if ((Field10665 = var8.g2()) < 22500) {
            var1 = 30000 - Field10665;
         }

         Field10658 = new int[Field10665 += var1];
         Field10608 = new HashMap();
         int var2 = 2;

         int var4;
         for(int var3 = 0; var3 < Field10665 - var1; ++var3) {
            Field10658[var3] = var2;
            var4 = var8.g2();
            var2 += var4;
         }

         HashMap var13 = new HashMap();

         for(var4 = 0; var4 < Field10665; ++var4) {
            ItemDef var9;
            if ((var9 = Method11912(var4, true)) != null) {
               boolean var11;
               boolean var15;
               label476: {
                  String var5 = var9.Field10639 == null ? "" : var9.Field10639.toLowerCase();
                  var11 = var4 != 21787 && var4 != 21788 ? (var4 != 21790 && var4 != 21791 ? (var4 != 21793 && var4 != 21794 ? (var4 != 14479 && var4 != 13734 && var4 != 13736 && var4 != 13738 && var4 != 13740 && var4 != 13742 && var4 != 13744 ? (var4 != 14484 && var4 != 15126 && var4 != 20072 && (var4 < 10547 || var4 > 10551) && var4 != 19780 ? (var4 != 19864 && var4 != 12866 && var4 != 12873 && var4 != 12880 ? (var4 != 14472 && var4 != 14474 && var4 != 14476 && var4 != 19143 && var4 != 19146 && var4 != 19149 ? (var4 != 13938 && var4 != 13932 && var4 != 13935 && var4 != 13941 ? (var4 != 13950 && var4 != 13944 && var4 != 13947 ? (var4 != 13920 && var4 != 13908 && var4 != 13914 && var4 != 13926 ? (var4 != 13911 && var4 != 13917 && var4 != 13923 && var4 != 13929 ? ((var4 < 22435 || var4 > 22456) && var4 != 22665 ? (var4 >= 19333 && var4 == 19333 ? true : (var4 >= 7453 && var4 <= 7462 ? true : (var4 >= 15701 && var4 <= 15704 ? true : (var4 != 22207 && var4 != 22209 && var4 != 22211 && var4 != 22213 ? (var4 >= 22215 && var4 <= 22218 ? true : (var4 >= 15600 && var4 <= 15622 ? true : (var4 >= 20949 && var4 <= 20952 ? true : (var4 != 19308 && var4 != 19311 && var4 != 19314 && var4 != 19317 && var4 != 19320 ? (var4 >= 19785 && var4 <= 19790 ? true : (var4 == 10972 ? true : (var5.contains(" set") ? true : var4 >= 22793 && var4 <= 22803))) : true)))) : true)))) : true) : true) : true) : true) : true) : true) : true) : true) : true) : true) : true) : true;
                  if ((var5 = Method11912(var4, true).Field10639) != null) {
                     label519: {
                        if (var4 == 4180 || var4 == 4178 || var4 == 2513 || var4 == 11283 || var4 >= 11674 && var4 <= 11676) {
                           var15 = true;
                           break label476;
                        }

                        if ((var4 < 12868 || var4 > 12984) && var4 != 12511 && var4 != 12508 && var4 != 12505) {
                           if (var4 == 4278 || var4 == 6529 || var4 == 8851) {
                              var15 = true;
                              break label476;
                           }

                           if (var4 != 10719 && var4 != 10354 && var4 != 10356 && var4 != 10358 && var4 != 10360) {
                              if (var4 >= 13117 && var4 <= 13146) {
                                 var15 = true;
                                 break label476;
                              }

                              if (var4 >= 19308 && var4 <= 19322) {
                                 var15 = true;
                                 break label476;
                              }

                              if (var5.contains("-") && var5.contains("set")) {
                                 var15 = true;
                                 break label476;
                              }

                              if (var5.contains("armour set")) {
                                 var15 = true;
                                 break label476;
                              }

                              if (Field10611.containsKey(var4)) {
                                 var15 = true;
                                 break label476;
                              }

                              if ((var5.endsWith("(sp)") || var5.endsWith("(or)")) && var4 != 19358) {
                                 var15 = true;
                                 break label476;
                              }

                              if (var4 != 13864 && var4 != 13858 && var4 != 13861 && var4 != 13867) {
                                 if (var4 != 13876 && var4 != 13870 && var4 != 13873 && (var4 < 13879 || var4 > 13883)) {
                                    if (var4 != 13896 && var4 != 13884 && var4 != 13890 && var4 != 13902) {
                                       if (var4 != 13887 && var4 != 13893 && var4 != 13899 && var4 != 13905) {
                                          if (var4 >= 19803 && var4 <= 19804) {
                                             var15 = true;
                                             break label476;
                                          }
                                          break label519;
                                       }

                                       var15 = true;
                                       break label476;
                                    }

                                    var15 = true;
                                    break label476;
                                 }

                                 var15 = true;
                                 break label476;
                              }

                              var15 = true;
                              break label476;
                           }

                           var15 = true;
                           break label476;
                        }

                        var15 = true;
                        break label476;
                     }
                  }

                  var15 = false;
               }

               boolean var12 = var15;
               boolean var14 = var9.Field10632 > 0 && var9.Field10645 > 0;
               if (var4 == 13938) {
                  System.out.println("zuriel hood: " + var12 + ", " + var11);
               }

               if ((!var12 || var11) && !var14 && var9 != null && var9.Field10639 != null && !var9.Field10639.equals("null")) {
                  String var10 = var9.Field10639;
                  if (var13.get(var10) == null || var11) {
                     Field10608.put(var4, var10);
                     var13.put(var10, true);
                  }
               }
            }
         }

         var13.clear();
      } catch (Exception var6) {
         var6.printStackTrace();
      }

      Field10612 = true;
      Client.Method13202();
   }

   public final Model isEquippedModelCached(int var1) {
      int var2 = this.genderZeroOffset;
      int var3 = this.genderZeroOffset2;
      if (var1 == 1) {
         var2 = this.genderOneOffset;
         var3 = this.genderOneOffset2;
      }

      if (var2 == -1) {
         return null;
      } else {
         Model var4;
         if (var3 != -1) {
            var4 = Model.Method14476(var2, true, false);
            Model var6 = Model.Method14476(var3, true, false);
            Model[] var5 = new Model[]{var4, var6};
            var4 = new Model(2, var5);
         } else {
            var4 = Model.Method14476(var2, true, true);
         }

         if (this.Field10622 != null && var4 != null) {
            for(var2 = 0; var2 < this.Field10622.length; ++var2) {
               var4.recolor(this.Field10622[var2], this.Field10623[var2]);
            }
         }

         if (this.Field10624 != null && var4 != null) {
            for(var2 = 0; var2 < this.Field10624.length; ++var2) {
               var4.Method14494(this.Field10624[var2], this.Field10625[var2]);
            }
         }

         return var4;
      }
   }

   public final Model Method11908(int var1) {
      int var2 = this.Field10634;
      int var3 = this.Field10651;
      int var4 = this.Field10650;
      if (var1 == 1) {
         var2 = this.Field10662;
         var3 = this.Field10633;
         var4 = this.Field10631;
      }

      if (var2 == -1) {
         return null;
      } else {
         Model var5;
         if (var3 != -1) {
            var5 = Model.Method14476(var2, true, false);
            Model var7;
            if (var4 != -1) {
               var7 = Model.Method14476(var3, true, false);
               Model var8 = Model.Method14476(var4, true, false);
               Model[] var6 = new Model[]{var5, var7, var8};
               var5 = new Model(3, var6);
            } else {
               var7 = Model.Method14476(var3, true, false);
               Model[] var9 = new Model[]{var5, var7};
               var5 = new Model(2, var9);
            }
         } else {
            var5 = Model.Method14476(var2, true, true);
         }

         if (var1 == 0 && this.Field10667 != 0) {
            var5.Method14493(0, this.Field10667, 0);
         }

         if (var1 == 1 && this.Field10619 != 0) {
            var5.Method14493(0, this.Field10619, 0);
         }

         if (var5 != null && this.Field10622 != null && this.Field10623 != null) {
            for(var3 = 0; var3 < this.Field10622.length; ++var3) {
               var5.recolor(this.Field10622[var3], this.Field10623[var3]);
            }
         }

         if (this.Field10624 != null && var5 != null) {
            for(var3 = 0; var3 < this.Field10624.length; ++var3) {
               var5.Method14494(this.Field10624[var3], this.Field10625[var3]);
            }
         }

         if (this.Field10621 != null && Client.Field12225) {
            var5.Method14460(this.Field10621);
         }

         if (var5 != null && (this.Field10626 >= 20754 && this.Field10626 <= 20769 || this.Field10626 == 21435 || this.Field10626 == 20151 || this.Field10626 == 20147 || this.Field10626 == 6570 || this.Field10613)) {
            var5.Field2837 = 10;
            var5.Field2834 = null;
         }

         return var5;
      }
   }

   private void Method11909() {
      this.Field10641 = 0;
      this.Field10639 = null;
      this.Field10644 = null;
      this.Field10622 = null;
      this.Field10623 = null;
      this.Field10646 = 2000;
      this.Field10653 = 0;
      this.Field10661 = 0;
      this.Field10666 = 0;
      this.Field10638 = 0;
      this.Field10657 = 0;
      this.Field10643 = false;
      this.Field10620 = 1;
      this.Field10630 = false;
      this.Field10637 = null;
      this.Field10652 = null;
      this.Field10634 = -1;
      this.Field10651 = -1;
      this.Field10667 = 0;
      this.Field10662 = -1;
      this.Field10633 = -1;
      this.Field10619 = 0;
      this.Field10650 = -1;
      this.Field10631 = -1;
      this.genderZeroOffset = -1;
      this.genderZeroOffset2 = -1;
      this.genderOneOffset = -1;
      this.genderOneOffset2 = -1;
      this.Field10656 = null;
      this.Field10663 = null;
      this.Field10645 = -1;
      this.Field10632 = -1;
      this.Field10636 = 128;
      this.Field10655 = 128;
      this.Field10654 = 128;
      this.Field10659 = 0;
      this.Field10649 = 0;
      this.Field10664 = 0;
   }

   public static ItemDef Method11910(ItemDef var0) {
      String var1 = var0.Field10639;
      var1 = var0.Field10639.replace(" helm (", " med helm (").replace(" shield (", " kiteshield (").replace("Bandos", "Guthix").replace("Ancient", "Guthix").replace("Armadyl", "Guthix").split("[(]")[0].trim();

      for(int var2 = 0; var2 < Field10665; ++var2) {
         ItemDef var3;
         if (var2 != var0.Field10626 && (var3 = Method11912(var2, true)) != null && var3.Field10639 != null && var3.Field10639.equalsIgnoreCase(var1) && var3.Field10632 == var0.Field10632) {
            return var3;
         }
      }

      return null;
   }

   public static ItemDef forID(int var0) {
      return Method11912(var0, true);
   }

   private static synchronized ItemDef Method11912(int var0, boolean var1) {
      if (var0 >= 0 && var0 < Field10665) {
         int var12 = var0;
         int var2 = 0;
         boolean var3 = true;
         if (var0 != 3840 && var0 != 3842 && var0 != 3844) {
            if (var0 == 3839 || var0 == 3841 || var0 == 3843) {
               var12 = var0 + 1;
            }
         } else {
            var12 = var0 - 1;
         }

         ItemDef var4;
         if ((var4 = (ItemDef)Field10607.Method1510(var0)) != null) {
            return var4;
         } else {
            var4 = new ItemDef();
            Field10607.Method1509(var0, var4);
            if ((var0 < 10180 || var0 > 10189) && var0 != 10233) {
               if (var0 >= 22811 && var0 < 22955) {
                  var2 = var12 = var12 = 20135 + (var0 - 22811) % 36;
               } else if (var0 >= 22955 && var0 < 22960) {
                  var2 = var12 = var12 = var0 == 22955 ? 19833 : 19838;
               } else if (var0 >= 22960 && var0 < 22964) {
                  var12 = 12539;
                  var2 = 12539;
               } else if (var0 >= 22969 && var0 < 23029) {
                  var2 = var12 = (new int[]{10251, 11724, 11726, 11728, 10250, 11718, 11720, 11722, 10248, 10249, 12866, 12873, 12880, 10252, 10253})[(var0 - 22969) % 15];
               } else if (var0 >= 23029 && var0 < 23033) {
                  var12 = 15492;
                  var2 = 15492;
               } else if (var0 >= 23033 && var0 < 23037) {
                  var12 = 20767;
                  var2 = 20767;
               } else if (var0 >= 23037 && var0 < 23041) {
                  var12 = 20768;
                  var2 = 20768;
               } else if (var0 >= 22789 && var0 <= 22792) {
                  var12 = 2577;
                  var2 = 2577;
               } else if (var0 == 22644) {
                  var12 = 19582;
                  var2 = 19582;
               } else if (var0 == 22646) {
                  var12 = 19586;
                  var2 = 19586;
               } else if (var0 == 22648) {
                  var12 = 19584;
                  var2 = 19584;
               } else if (var0 == 22650) {
                  var12 = 11920;
                  var2 = 11920;
               } else if (var0 == 22652) {
                  var12 = 11922;
                  var2 = 11922;
               } else if (var0 == 22654) {
                  var12 = 11924;
                  var2 = 11924;
               } else if (var0 == 22656) {
                  var12 = 19582;
                  var2 = 19582;
               } else if (var0 == 22658) {
                  var12 = 19584;
                  var2 = 19584;
               } else if (var0 == 22660) {
                  var12 = 19586;
                  var2 = 19586;
               } else if (var0 == 22662) {
                  var12 = 11946;
                  var2 = 11946;
               } else if (var0 == 22664) {
                  var12 = 14796;
                  var2 = 14796;
               } else if (var0 == 22640) {
                  var12 = 15420;
                  var2 = 15420;
               } else if (var0 == 22641) {
                  var12 = 962;
                  var2 = 962;
               } else if ((var0 < 10190 || var0 >= 10199) && var0 != 10227 && var0 != 10229 && var0 != 10231 && var0 != 10232) {
                  if (var0 == 10199) {
                     var12 = 19323;
                     var2 = 19323;
                  } else if (var0 != 10200 && (var0 < 10235 || var0 > 10241)) {
                     if (var0 >= 10201 && var0 <= 10213) {
                        var12 = 1057;
                        var2 = 1057;
                     } else if ((var0 < 10214 || var0 > 10226) && var0 != 10228 && var0 != 10234 && var0 != 10230) {
                        if (var0 >= 7639 && var0 <= 7648) {
                           var12 = 21777;
                           var2 = 21777;
                        } else if (var0 >= 10242 && var0 <= 10245) {
                           var12 = 15352;
                           var2 = 15352;
                           var4.Field10613 = true;
                        } else if (var0 == 22620) {
                           var12 = 21512;
                           var2 = 21512;
                        } else if (var0 == 22606) {
                           var12 = 1127;
                           var2 = 1127;
                        } else if (var0 == 10246) {
                           var12 = 7809;
                           var2 = 7809;
                           var4.Field10613 = true;
                        } else if (var0 != 10249 && var0 != 10253 && var0 != 10250) {
                           if (var0 != 10248 && var0 != 10252) {
                              if (var0 == 22611) {
                                 var12 = 10245;
                                 var2 = 10245;
                              } else if (var0 == 22610) {
                                 var12 = 11235;
                                 var2 = 11235;
                              } else if (var0 == 10251) {
                                 var12 = 21736;
                                 var2 = 21736;
                                 var4.Field10613 = true;
                              } else if (var0 == 2365) {
                                 var12 = 17660;
                                 var2 = 17660;
                                 var4.Field10613 = true;
                              } else if (var0 >= 23059 && var0 <= 23063) {
                                 var2 = var12 = var0 - 11847;
                              } else if (var0 >= 23064 && var0 <= 23068) {
                                 var2 = var12 = var0 - 11852;
                              } else if (var0 >= 23069 && var0 <= 23073) {
                                 var2 = var12 = var0 == 23069 ? var0 - 11832 : var0 - 9851;
                              } else if (var0 >= 23074 && var0 <= 23078) {
                                 var2 = var12 = var0 == 23074 ? var0 - 11837 : var0 - 9856;
                              } else if (var0 >= 23079 && var0 <= 23083) {
                                 var2 = var12 = var0 - 11867;
                              } else if (var0 >= 23084 && var0 <= 23088) {
                                 var2 = var12 = var0 - 11872;
                              } else if (var0 >= 23089 && var0 <= 23093) {
                                 var2 = var12 = var0 - 11877;
                              } else if (var0 >= 23094 && var0 <= 23098) {
                                 var2 = var12 = var0 - 11882;
                              } else if (var0 >= 23099 && var0 <= 23103) {
                                 var2 = var12 = var0 - 11887;
                              } else if (var0 >= 23104 && var0 <= 23108) {
                                 var2 = var12 = var0 - 11892;
                              } else if (var0 >= 23150 && var0 <= 23154) {
                                 var12 = var0 - 14006;
                                 if (var0 != 23150) {
                                    var12 += 21;
                                 }

                                 var2 = var12;
                              } else if (var0 >= 23155 && var0 <= 23159) {
                                 var12 = var0 - 13774;
                                 if (var0 != 23155) {
                                    var12 += 25;
                                 }

                                 var2 = var12;
                              } else if (var0 >= 10261 && var0 <= 10272) {
                                 var12 = 15352;
                                 var2 = 15352;
                                 var4.Field10613 = true;
                              } else if (var0 >= 22422 && var0 <= 22425) {
                                 var12 = 18342;
                                 var2 = 18342;
                              } else if (var0 >= 22500 && var0 <= 22600) {
                                 var12 = 21371;
                                 var2 = 21371;
                              } else if (var0 >= 22601 && var0 <= 22604) {
                                 var12 = 6570;
                                 var2 = 6570;
                              } else if (var0 == 22626) {
                                 var12 = 6568;
                                 var2 = 6568;
                              } else if (var0 == 4278) {
                                 var12 = 1039;
                                 var2 = 1039;
                              } else if ((var0 < 22400 || var0 > 22409) && (var0 < 22433 || var0 > 22456) && var0 != 22665) {
                                 if ((var0 < 22410 || var0 > 22421) && var0 < 22605) {
                                    if (var0 >= 22322) {
                                       var12 = 1039;
                                       if (var0 != 22428 && var0 != 22429) {
                                          if (var0 == 22430) {
                                             var12 = 11235;
                                          } else if (var0 == 22431) {
                                             var12 = 11235;
                                          } else if (var0 == 22432) {
                                             var12 = 14484;
                                          }
                                       } else {
                                          var12 = 15352;
                                       }

                                       var2 = var12;
                                       var4.Field10613 = true;
                                    }
                                 } else {
                                    if (var0 >= 22793 && var0 <= 22810) {
                                       var12 = 1773;
                                    } else {
                                       var12 = 6724;
                                    }

                                    var2 = var12;
                                    var4.Field10613 = true;
                                 }
                              } else {
                                 var12 = 14642;
                                 var2 = 14642;
                                 var4.Field10613 = true;
                              }
                           } else {
                              var12 = 11728;
                              var2 = 11728;
                              var4.Field10613 = true;
                           }
                        } else {
                           var12 = 7461;
                           var2 = 7461;
                           var4.Field10613 = true;
                        }
                     } else {
                        var12 = 1050;
                        var2 = 1050;
                     }
                  } else {
                     var12 = 7806;
                     var2 = 7806;
                  }
               } else {
                  var12 = 1038;
                  var2 = 1038;
               }
            } else {
               var2 = var12 = Client.normalMem ? 15443 : 4151;
               if (var4.Field10623 == null) {
                  var4.Field10623 = new int[1];
               }
            }

            if (var12 >= Field10658.length) {
               return null;
            } else {
               try {
                  Field10648.pos = Field10658[var12];
               } catch (Exception var11) {
                  var11.printStackTrace();
                  return null;
               }

               var4.Field10626 = var0;
               var4.Method11909();
               if (Client.normalMem) {
                  var4.Method11923(Field10648);
               } else {
                  var4.Method11924(Field10648);
               }

               ItemDef var29;
               if (var12 != var0) {
                  var29 = forID(var12);
                  var4.Field10634 = var29.Field10634;
                  var4.Field10651 = var29.Field10651;
                  var4.Field10650 = var29.Field10650;
                  var4.Field10662 = var29.Field10662;
                  var4.Field10633 = var29.Field10633;
                  var4.Field10631 = var29.Field10631;
                  var4.Field10641 = var29.Field10641;
                  var4.Field10638 = var29.Field10638;
                  var4.Field10657 = var29.Field10657;
                  var4.Field10653 = var29.Field10653;
                  var4.Field10661 = var29.Field10661;
                  var4.Field10646 = var29.Field10646;
                  var4.Field10639 = var29.Field10639;
               }

               if (var4.Field10626 != 1101) {
                  if (var4.Field10626 == 11227) {
                     var4.Field10663 = new int[]{1, 2, 3, 4, 5, 0, 0, 0, 0, 0};
                     var4.Field10656 = new int[]{23099, 23100, 23101, 23102, 23103, 0, 0, 0, 0, 0};
                  } else if (var4.Field10626 == 11229) {
                     var4.Field10663 = new int[]{1, 2, 3, 4, 5, 0, 0, 0, 0, 0};
                     var4.Field10656 = new int[]{23104, 23105, 23106, 23107, 23108, 0, 0, 0, 0, 0};
                  } else if (var4.Field10626 >= 13908 && var4.Field10626 <= 13957) {
                     if (!var4.Method11913(var0, 0, 128, 3)) {
                        return null;
                     }
                  } else if (var4.Field10626 == 6107) {
                     var4.Field10639 = "Ghostly robe top";
                  } else if (var4.Field10626 == 6108) {
                     var4.Field10639 = "Ghostly robe bottom";
                  } else if (var4.Field10626 == 18813) {
                     var4.Field10639 = "Karamja tablet";
                  } else if (var4.Field10626 == 20175) {
                     var4.Field10639 = "GWD tablet";
                  } else if (var4.Field10626 == 21335) {
                     var4.Field10639 = "Royal longsword";
                  } else if (var4.Field10626 == 21334) {
                     var4.Field10639 = "Royal shield";
                  } else if (var4.Field10626 != 21336 && var4.Field10626 != 21337) {
                     if (var4.Field10626 == 20929) {
                        var4.Field10639 = "Saradomin katana";
                        var4.Field10652 = new String[]{null, "Wield", "Check charges", null, "Destroy"};
                     } else if (var4.Field10626 == 20930) {
                        var4.Field10639 = forID(var4.Field10626 - 1).Field10639;
                        var4.Field10632 = 799;
                        var4.Field10645 = var4.Field10626 - 1;
                        var4.Field10652 = new String[]{null, null, null, null, "Drop"};
                     } else if (var4.Field10626 != 20460 && var4.Field10626 != 20461) {
                        if (var4.Field10626 != 20462 && var4.Field10626 != 20463) {
                           if (var4.Field10626 != 20464 && var4.Field10626 != 20465) {
                              if (var4.Field10626 >= 11039 && var4.Field10626 <= 11043) {
                                 var4.Field10639 = "Smoke dungeon key " + (var4.Field10626 - 11038);
                              } else if (var4.Field10626 >= 20795 && var4.Field10626 <= 20800 || var4.Field10626 >= 20787 && var4.Field10626 <= 20792) {
                                 var4.Field10652 = new String[]{null, "Wear", null, null, "Destroy"};
                              } else if (var4.Field10626 != 19785 && var4.Field10626 != 19786) {
                                 if (var4.Field10626 != 19787 && var4.Field10626 != 19788) {
                                    if (var4.Field10626 != 19789 && var4.Field10626 != 19790) {
                                       if (var4.Field10626 == 20771) {
                                          var12 = ParticleDefinition.Method7791("comp_cape");
                                          var4.Field10621 = new int[][]{{494, var12}, {488, var12}, {485, var12}, {476, var12}, {482, var12}, {479, var12}, {491, var12}};
                                       } else if (var4.Field10626 != 2528 && var4.Field10626 != 2529) {
                                          if (var4.Field10626 != 11920 && var4.Field10626 != 11921) {
                                             if (var4.Field10626 != 11922 && var4.Field10626 != 11923) {
                                                if (var4.Field10626 != 11924 && var4.Field10626 != 11925) {
                                                   if (var4.Field10626 != 19582 && var4.Field10626 != 19583) {
                                                      if (var4.Field10626 != 19584 && var4.Field10626 != 19585) {
                                                         if (var4.Field10626 != 19586 && var4.Field10626 != 19587) {
                                                            if (var4.Field10626 != 5509 && var4.Field10626 != 5510 && var4.Field10626 != 5512 && var4.Field10626 != 5514 && var4.Field10626 != 18339 && var4.Field10626 != 18338) {
                                                               if (var4.Field10626 >= 22645 && var4.Field10626 <= 22663 && var4.Field10626 % 2 == 1) {
                                                                  var4.Field10639 = forID(var4.Field10626 - 1).Field10639;
                                                                  var4.Field10632 = 799;
                                                                  var4.Field10645 = var4.Field10626 - 1;
                                                                  var4.Field10652 = new String[]{null, null, null, null, "Drop"};
                                                               } else if (var4.Field10626 != 12867 && var4.Field10626 != 12874 && var4.Field10626 != 12881) {
                                                                  if (var4.Field10626 == 4159) {
                                                                     var4.Field10639 = forID(var4.Field10626 - 1).Field10639;
                                                                     var4.Field10632 = 799;
                                                                     var4.Field10645 = var4.Field10626 - 1;
                                                                     var4.Field10652 = new String[]{null, null, null, null, "Drop"};
                                                                  } else if (var4.Field10626 >= 10254 && var4.Field10626 <= 10260) {
                                                                     var4.Field10639 = forID(var4.Field10626 - 6).Field10639;
                                                                     var4.Field10632 = 799;
                                                                     var4.Field10645 = var4.Field10626 - 6;
                                                                     var4.Field10652 = new String[]{null, null, null, null, "Drop"};
                                                                  } else if (var4.Field10626 >= 7453 && var4.Field10626 <= 7462) {
                                                                     String var5 = (new String[]{"Leather", "Bronze", "Iron", "Steel", "Black", "Mithril", "Adamant", "Rune", "Dragon", "Barrow"})[var4.Field10626 - 7453];
                                                                     var4.Field10639 = var5 + " gloves";
                                                                  } else if ((var4.Field10626 < 20958 || var4.Field10626 > 20967) && (var4.Field10626 < 22268 || var4.Field10626 > 22302) && var4.Field10626 != 11133) {
                                                                     if (var4.Field10626 == 10273) {
                                                                        var4.Field10639 = "Casket (easy)";
                                                                     } else if (var4.Field10626 != 10274 && var4.Field10626 != 13055 && var4.Field10626 != 13040 && var4.Field10626 != 19040) {
                                                                        if (var4.Field10626 == 3840) {
                                                                           var4.Field10639 = "Holy book (saradomin)";
                                                                           var4.Field10652[2] = "Fill";
                                                                        } else if (var4.Field10626 == 3842) {
                                                                           var4.Field10639 = "Unholy book (zamorak)";
                                                                           var4.Field10652[2] = "Fill";
                                                                        } else if (var4.Field10626 == 3844) {
                                                                           var4.Field10639 = "Book of balance (guthix)";
                                                                           var4.Field10652[2] = "Fill";
                                                                        } else if (var4.Field10626 != 3839 && var4.Field10626 != 3841 && var4.Field10626 != 3843) {
                                                                           if (var4.Field10626 >= 9739 && var4.Field10626 <= 9746) {
                                                                              var4.Field10639 = var4.Field10639.replace("Combat", "Super melee");
                                                                           } else if (var4.Field10626 == 773) {
                                                                              var4.Field10639 = "Santa ring";
                                                                              var4.Field10644 = "Equipping this ring turns me into Santa!".getBytes();
                                                                           } else if (var4.Field10626 == 4657) {
                                                                              var4.Field10639 = "Skeleton ring";
                                                                              var4.Field10644 = "Equipping this ring turns me into a spooky Skeleton!".getBytes();
                                                                           } else if (var4.Field10626 == 4155) {
                                                                              var4.Field10652 = new String[]{"Activate", "Kills-left", "Kill logs", null, "Drop"};
                                                                           } else if (var4.Field10626 != 19162 && var4.Field10626 != 19152 && var4.Field10626 != 19157) {
                                                                              if (var4.Field10626 >= 10146 && var4.Field10626 <= 10149) {
                                                                                 var4.Field10652 = new String[]{null, "Wield", "Check charges", null, "Drop"};
                                                                              } else if (var4.Field10626 == 13663) {
                                                                                 var4.Field10639 = "GA ticket";
                                                                                 var4.Field10652 = new String[]{"Activate", null, null, null, "Drop"};
                                                                                 var4.Field10644 = "Can be used to activate a death preserving Guardian Angel for your account.".getBytes();
                                                                              } else if (var4.Field10626 == 20430) {
                                                                                 var4.Field10639 = forID(var4.Field10626 - 1).Field10639;
                                                                                 var4.Field10632 = 799;
                                                                                 var4.Field10645 = var4.Field10626 - 1;
                                                                                 var4.Field10652 = new String[]{null, null, null, null, "Drop"};
                                                                              } else if (var4.Field10626 != 10364 && var4.Field10626 != 10365) {
                                                                                 if (var4.Field10626 == 2380) {
                                                                                    var4.Field10639 = "Fire crystal";
                                                                                    var4.Field10644 = "Applies a temporary fire upgrade to whips and elemental weapons.".getBytes();
                                                                                    var4.Field10652 = new String[]{null, null, null, null, "Drop"};
                                                                                    var4.Field10622 = new int[]{18522};
                                                                                    var4.Field10623 = new int[]{Field10617};
                                                                                 } else if (var4.Field10626 == 2381) {
                                                                                    var4.Field10639 = "Thunder crystal";
                                                                                    var4.Field10644 = "Applies a temporary thunder upgrade to whips and elemental weapons.".getBytes();
                                                                                    var4.Field10652 = new String[]{null, null, null, null, "Drop"};
                                                                                    var4.Field10622 = new int[]{18522};
                                                                                    var4.Field10623 = new int[]{Field10615};
                                                                                 } else if (var4.Field10626 == 2382) {
                                                                                    var4.Field10639 = "Ice crystal";
                                                                                    var4.Field10644 = "Applies a temporary ice upgrade to whips and elemental weapons.".getBytes();
                                                                                    var4.Field10652 = new String[]{null, null, null, null, "Drop"};
                                                                                    var4.Field10622 = new int[]{18522};
                                                                                    var4.Field10623 = new int[]{Field10614};
                                                                                 } else if (var4.Field10626 == 2383) {
                                                                                    var4.Field10639 = "Nature crystal";
                                                                                    var4.Field10644 = "Applies a temporary nature upgrade to whips and elemental weapons.".getBytes();
                                                                                    var4.Field10652 = new String[]{null, null, null, null, "Drop"};
                                                                                    var4.Field10622 = new int[]{18522};
                                                                                    var4.Field10623 = new int[]{Field10616};
                                                                                 } else if (var4.Field10626 >= 14094 && var4.Field10626 <= 14121) {
                                                                                    var4.Field10652 = new String[]{null, "Wear", null, "Check charges", "Destroy"};
                                                                                 } else if ((var4.Field10626 < 15422 || var4.Field10626 > 15426) && (var4.Field10626 < 14600 || var4.Field10626 > 14605)) {
                                                                                    if (var4.Field10626 == 5066) {
                                                                                       var4.Field10652 = new String[]{"Read", null, null, null, "Destroy"};
                                                                                       var4.Field10639 = "Delivery notes";
                                                                                       var4.Field10644 = "Delivery notes for a present from Santa Claus.".getBytes();
                                                                                    } else if (var4.Field10626 != 14190 && var4.Field10626 != 14191) {
                                                                                       if (var4.Field10626 != 14832 && var4.Field10626 != 10092 && var4.Field10626 != 9975) {
                                                                                          if (var4.Field10626 >= 14651 && var4.Field10626 <= 14655) {
                                                                                             var4.Field10652 = new String[]{"Release", null, null, null, "Destroy"};
                                                                                          } else if (var4.Field10626 != 10033 && var4.Field10626 != 10034) {
                                                                                             if (var4.Field10626 == 10247) {
                                                                                                var4.Field10639 = forID(var4.Field10626 - 1).Field10639;
                                                                                                var4.Field10632 = 799;
                                                                                                var4.Field10645 = var4.Field10626 - 1;
                                                                                                var4.Field10652 = new String[]{null, null, null, null, "Drop"};
                                                                                             } else if (var0 >= 4886 && var0 <= 4889) {
                                                                                                var29 = forID(4718);
                                                                                                var4.Field10634 = var29.Field10634;
                                                                                                var4.Field10662 = var29.Field10662;
                                                                                             } else if ((var0 < 169 || var0 > 174) && var0 != 2444 && var0 != 2444) {
                                                                                                if (var0 >= 3040 && var0 <= 3047) {
                                                                                                   var4.Field10639 = var4.Field10639.replace("Magic", "Super magic").replace("potion ", "");
                                                                                                } else if (var0 == 4278) {
                                                                                                   var4.Field10632 = 4281;
                                                                                                   var4.Field10645 = 11666;
                                                                                                   var4.Method11914();
                                                                                                   var4.Field10639 = "Pest control token";
                                                                                                   var4.Field10644 = "Swap this token for rewards at the void knight outpost.".getBytes();
                                                                                                   var3 = false;
                                                                                                } else if (var0 == 4067) {
                                                                                                   var4.Field10632 = 4037;
                                                                                                   var4.Field10645 = 4515;
                                                                                                   var4.Method11914();
                                                                                                   var4.Field10639 = "Emps-Wars ticket";
                                                                                                   var4.Field10644 = "Swap this ticket for rewards at Emps-Wars".getBytes();
                                                                                                   var3 = false;
                                                                                                } else if (var0 == 13263) {
                                                                                                   var4.Field10652[4] = "Destroy";
                                                                                                } else if (var0 == 4081) {
                                                                                                   var4.Field10644 = "Increases the wearer's strength and accuracy when fighting the undead.".getBytes();
                                                                                                } else if (var0 == 2) {
                                                                                                   var4.Field10652 = new String[]{null, "Wear", null, null, "Destroy"};
                                                                                                } else if (var4.Field10626 == 10972) {
                                                                                                   var4.Field10639 = "Edgeville teleport";
                                                                                                   var4.Field10644 = "A tablet containing a magic spell".getBytes();
                                                                                                   var4.Field10652 = new String[]{"Break", null, null, null, "Drop"};
                                                                                                }
                                                                                             } else {
                                                                                                var4.Field10639 = var4.Field10639.replace("Ranging", "Super ranging").replace("potion ", "");
                                                                                             }
                                                                                          } else {
                                                                                             var4.Field10652 = new String[]{null, "Wield", null, null, "Drop"};
                                                                                          }
                                                                                       } else {
                                                                                          var4.Field10652 = new String[]{"Release", null, null, null, "Drop"};
                                                                                       }
                                                                                    } else {
                                                                                       var4.Field10639 = "Sacred clay";
                                                                                       var4.Field10644 = "Can be smithed into Sacred clay equipment.".getBytes();
                                                                                    }
                                                                                 } else {
                                                                                    var4.Field10652 = new String[]{null, "Wear", null, null, "Drop"};
                                                                                    var4.Field10644 = (var4.Field10639 + " was found in a Christmas cracker.").getBytes();
                                                                                 }
                                                                              } else {
                                                                                 var4.Field10639 = "Amulet of strength (t)";
                                                                              }
                                                                           } else {
                                                                              var4.Field10646 += 20;
                                                                           }
                                                                        } else {
                                                                           var4.Field10652 = new String[]{null, "Wear", "Preach", null, "Destroy"};
                                                                        }
                                                                     } else {
                                                                        var4.Field10639 = forID(var4.Field10626 - 1).Field10639;
                                                                        var4.Field10632 = 799;
                                                                        var4.Field10645 = var4.Field10626 - 1;
                                                                        var4.Field10652 = new String[]{null, null, null, null, "Drop"};
                                                                     }
                                                                  } else {
                                                                     var4.Field10652 = new String[]{null, "Wear", "Check-charges", null, "Destroy"};
                                                                     if (var4.Field10626 == 20961) {
                                                                        var4.Field10639 = "Brawler";
                                                                     }
                                                                  }
                                                               } else {
                                                                  var4.Field10639 = forID(var4.Field10626 - 1).Field10639;
                                                                  var4.Field10632 = 799;
                                                                  var4.Field10645 = var4.Field10626 - 1;
                                                                  var4.Field10652 = new String[]{null, null, null, null, "Drop"};
                                                               }
                                                            } else {
                                                               var4.Field10652 = new String[]{"Fill", "Empty", "Check", "Charges", "Destroy"};
                                                            }
                                                         } else {
                                                            var4.Field10639 = "Armadyl d'hide set";
                                                         }
                                                      } else {
                                                         var4.Field10639 = "Ancient d'hide set";
                                                      }
                                                   } else {
                                                      var4.Field10639 = "Bandos d'hide set";
                                                   }
                                                } else {
                                                   var4.Field10639 = "Zamorak d'hide set";
                                                }
                                             } else {
                                                var4.Field10639 = "Saradomin d'hide set";
                                             }
                                          } else {
                                             var4.Field10639 = "Guthix d'hide set";
                                          }
                                       } else {
                                          var4.Field10639 = "Reset lamp";
                                          var4.Field10644 = "Lowers one of your levels by 1,000 exp.".getBytes();
                                          if (var4.Field10626 == 2529) {
                                             var4.Field10632 = 799;
                                             var4.Field10645 = var4.Field10626 - 1;
                                             var4.Field10652 = new String[]{null, null, null, null, "Drop"};
                                          }
                                       }
                                    } else {
                                       var4.Field10639 = var4.Field10639 + " (w)";
                                    }
                                 } else {
                                    var4.Field10639 = var4.Field10639 + " (g)";
                                 }
                              } else {
                                 var4.Field10639 = var4.Field10639 + " (b)";
                              }
                           } else {
                              var4.Field10639 = "Ragefire gloves";
                              var4.Field10622 = new int[]{53662, 53649, 53645, 53635, 49239, 46099, 46106};
                              var4.Field10623 = new int[]{40205, 40219, 40199, 40201, 32843, 40203, 40203};
                           }
                        } else {
                           var4.Field10639 = "Glaiven gloves";
                           var4.Field10622 = new int[]{53662, 53649, 53645, 53635, 49239, 46099, 46106};
                           var4.Field10623 = new int[]{23050, 7957, 23044, 23046, 32843, 23048, 23048};
                        }
                     } else {
                        var4.Field10639 = "Steadfast gloves";
                        var4.Field10622 = new int[]{53662, 53649, 53645, 53635, 49239, 46099, 46106};
                        var4.Field10623 = new int[]{43275, 663, 43269, 43271, 32843, 43273, 43273};
                     }
                  } else {
                     var4.Field10639 = forID(var4.Field10626 - 2).Field10639;
                     var4.Field10632 = 799;
                     var4.Field10645 = var4.Field10626 - 2;
                     var4.Field10652 = new String[]{null, null, null, null, "Drop"};
                  }
               }

               if (var4.Field10632 != -1 && var3) {
                  var4.Method11914();
               }

               if (!enableMembersItems && var4.Field10630) {
                  var4.Field10639 = "Members Object";
                  var4.Field10644 = "Login to a members' server to use this object.".getBytes();
                  var4.Field10637 = null;
                  var4.Field10652 = null;
                  var4.Field10664 = 0;
               }

               if (var0 == 3706) {
                  var4.Field10652 = new String[5];
                  var4.Field10652[0] = "Make member";
                  var4.Field10643 = true;
                  var4.Field10639 = "Member ticket";
                  var4.Field10644 = "Gives me 30 days premium member.".getBytes();
               } else if (var0 == 19864) {
                  var4.Field10652 = new String[]{null, null, null, null, "Drop"};
                  var4.Field10643 = true;
                  var4.Field10639 = "Spectral energy";
                  var4.Field10644 = "Can be used to recharge spectral equipment.".getBytes();
               } else if (var0 == 18682) {
                  var4.Field10652 = new String[]{null, null, null, null, "Drop"};
               } else if (var0 == 18342) {
                  var4.Field10639 = "Elemental staff";
                  var4.Field10644 = "Can be upgraded with elemental crystals.".getBytes();
                  var4.Field10652 = new String[]{null, "Wear", null, null, "Drop"};
               } else if (var0 == 19669) {
                  var4.Field10644 = "Special attacks cost 10% less when wearing the Ring of Vigour.".getBytes();
               } else if (var0 == 14796) {
                  var4.Field10639 = "Scroll of double exp.";
                  var4.Field10644 = "Grants 60 minutes of double experience upon activation. This scroll cannot be traded.".getBytes();
                  var4.Field10652 = new String[]{"Read", null, "Activate", null, "Destroy"};
                  var4.Field10643 = true;
               } else if (var0 == 10476) {
                  var4.Field10644 = "I should try these little sweets, they look delicious.".getBytes();
               } else if (var0 != 12866 && var0 != 12873 && var0 != 12880) {
                  if (var0 != 2677 && var0 != 2801 && var0 != 2722 && var0 != 19064) {
                     if (var0 >= 13845 && var0 <= 13857) {
                        var4.Field10652 = new String[]{null, "Wear", null, "Check charges", "Destroy"};
                     } else if (var0 >= 13858 && var0 <= 13957) {
                        if (var4.Field10639 != null && var4.Field10639.contains("(deg)")) {
                           var4.Field10652 = new String[]{null, "Wear", null, "Check charges", "Destroy"};
                        }
                     } else if (var0 != 11277 && var0 != 11282) {
                        if (var0 != 21512 && var0 != 12469 && var0 != 12471 && var0 != 12473 && var0 != 12475 && var0 != 12725 && (var0 < 12185 || var0 > 12187)) {
                           if (var0 >= 7639 && var0 <= 7648) {
                              var12 = 10 + (7639 - var0);
                              var4.Field10639 = "Rod of ivandis(" + var12 + ")";
                           } else if (var0 == 21413) {
                              var4.Field10652[0] = null;
                           } else if (var0 == 10010) {
                              var4.Field10634 = 43410;
                              var4.Field10662 = 43410;
                           } else if (var0 == 10507) {
                              var4.Field10652 = new String[]{null, "Wear", null, null, "Drop"};
                           } else if (var0 == 15389) {
                              var4.Field10639 = "Mining XP lamp";
                           } else if (var0 == 19333) {
                              var4.Field10639 = "Fury (t) kit";
                           } else if (var0 == 19350) {
                              var4.Field10639 = "Dragon ornament kit (g)";
                           } else if (var0 == 19358) {
                              var4.Field10639 = "Dragon ornament kit (sp)";
                           } else if (var0 == 19335) {
                              var4.Field10639 = "Amulet of fury (t)";
                           } else if (var0 == 19336) {
                              var4.Field10639 = "Dragon full helm (g)";
                           } else if (var0 == 19337) {
                              var4.Field10639 = "Dragon platebody (g)";
                           } else if (var0 == 19338) {
                              var4.Field10639 = "Dragon platelegs (g)";
                           } else if (var0 == 19339) {
                              var4.Field10639 = "Dragon plateskirt (g)";
                           } else if (var0 == 19340) {
                              var4.Field10639 = "Dragon square shield (g)";
                           } else if (var0 == 20786) {
                              var4.Field10652 = new String[]{null, "Wield", "Split", null, "Drop"};
                           } else if (var0 == 9625) {
                              var4.Field10652[3] = "Remove room";
                              var4.Field10652[4] = "Drop";
                           } else if (var0 == 2365) {
                              var4.Field10639 = "Perfect gold bar";
                              var4.Field10644 = "A perfect gold bar is worth 100.000 gp.".getBytes();
                           } else if (var0 == 773) {
                              var4.Field10639 = "Santa ring";
                           } else if ((var0 < 1555 || var0 > 1572) && (var0 < 7581 || var0 > 7585)) {
                              if (var0 == 5023) {
                                 var4.Field10639 = "Clan wars ticket";
                                 var4.Field10644 = "A ticket to exchange for items at the clan wars shop.".getBytes();
                              } else if (var0 == 7478) {
                                 var4.Field10652 = new String[5];
                                 var4.Field10652[0] = "Teleport";
                                 var4.Field10652[4] = "Destroy";
                                 var4.Field10643 = true;
                                 var4.Field10639 = "Donator ticket";
                                 var4.Field10644 = "I should try teleporting with this...".getBytes();
                              } else if (var0 == 620) {
                                 var4.Field10652 = new String[5];
                                 var4.Field10652[0] = "Claim";
                                 var4.Field10652[4] = "Destroy";
                                 var4.Field10643 = true;
                                 var4.Field10639 = "Event ticket";
                                 var4.Field10644 = "A ticket you can exchange for 10 Event points.".getBytes();
                              } else if (var0 == 11341) {
                                 var4.Field10652 = new String[]{null, null, null, null, "Drop"};
                                 var4.Field10639 = "Seers' scroll";
                                 var4.Field10644 = "This scroll is pulsing with the knowledge of ancient fremennik sages...".getBytes();
                              } else if (var0 == 11342) {
                                 var4.Field10652 = new String[]{null, null, null, null, "Drop"};
                                 var4.Field10639 = "Archers' scroll";
                                 var4.Field10644 = "This scroll is pulsing with the knowledge of ancient fremennik hunters...".getBytes();
                              } else if (var0 == 11975) {
                                 var4.Field10652 = new String[]{null, null, null, null, "Drop"};
                                 var4.Field10639 = "Warrior scroll";
                                 var4.Field10644 = "This scroll is pulsing with the knowledge of ancient fremennik warriors...".getBytes();
                              } else if (var0 == 11976) {
                                 var4.Field10652 = new String[]{null, null, null, null, "Drop"};
                                 var4.Field10639 = "Berserker scroll";
                                 var4.Field10644 = "This scroll is pulsing with an ancient strength beyond imaginable...".getBytes();
                              } else if (var0 == 15018) {
                                 var4.Field10652 = new String[]{null, "Wear", "Check charges", null, "Destroy"};
                                 var4.Field10644 = "This ring is pulsing with the knowledge of ancient fremennik sages...".getBytes();
                              } else if (var0 == 15019) {
                                 var4.Field10652 = new String[]{null, "Wear", "Check charges", null, "Destroy"};
                                 var4.Field10644 = "This ring is pulsing with the knowledge of ancient fremennik hunters...".getBytes();
                              } else if (var0 == 15020) {
                                 var4.Field10652 = new String[]{null, "Wear", "Check charges", null, "Destroy"};
                                 var4.Field10644 = "This ring is pulsing with the knowledge of ancient fremennik warriors...".getBytes();
                              } else if (var0 == 15220) {
                                 var4.Field10652 = new String[]{null, "Wear", "Check charges", null, "Destroy"};
                                 var4.Field10644 = "This ring is pulsing with an ancient strength beyond imaginable...".getBytes();
                              } else if (var0 == 10008) {
                                 var4.Field10657 -= 42;
                              } else if (var2 > 0) {
                                 var4.Field10664 = 0;
                                 if (var2 >= 22400 || var0 == 4278) {
                                    var4.Field10644 = null;
                                 }

                                 if (var2 == 4151) {
                                    var4.Field10623 = new int[1];
                                    var4.Field10622 = new int[1];
                                    var4.Field10622[0] = 528;
                                 } else if (var2 != 1038 && var2 != 1057) {
                                    if (var2 == 7806) {
                                       var4.Field10623 = new int[2];
                                       var4.Field10622 = new int[2];
                                       var4.Field10622[0] = 103;
                                       var4.Field10622[1] = 920;
                                    } else if (var2 == 1050) {
                                       var4.Field10623 = new int[2];
                                       var4.Field10622 = new int[2];
                                       var4.Field10622[0] = 933;
                                       var4.Field10622[1] = 929;
                                    }
                                 } else {
                                    var4.Field10623 = new int[2];
                                    var4.Field10622 = new int[2];
                                    var4.Field10622[0] = 926;
                                    var4.Field10622[1] = 926;
                                 }

                                 if (var0 != 4278) {
                                    var4.Field10652 = new String[]{null, "Wear", null, null, "Drop"};
                                 }

                                 int var6;
                                 int var8;
                                 int var14;
                                 int[] var15;
                                 int var16;
                                 int var22;
                                 String[] var27;
                                 int[] var30;
                                 if (var0 == 10180) {
                                    var4.Field10639 = "Bronze whip";
                                    var4.Field10623 = new int[]{5672};
                                 } else if (var0 == 10181) {
                                    var4.Field10639 = "Iron whip";
                                    var4.Field10623[0] = 33;
                                 } else if (var0 == 10182) {
                                    var4.Field10639 = "Steel whip";
                                    var4.Field10623[0] = 43072;
                                 } else if (var0 == 10183) {
                                    var4.Field10639 = "Black whip";
                                    var4.Field10623[0] = 8;
                                 } else if (var0 == 10184) {
                                    var4.Field10639 = "Mithril whip";
                                    var4.Field10623[0] = 43279;
                                 } else if (var0 == 10185) {
                                    var4.Field10639 = "Adamant whip";
                                    var4.Field10623[0] = 21662;
                                 } else if (var0 == 10186) {
                                    var4.Field10639 = "Rune whip";
                                    var4.Field10623[0] = 36133;
                                 } else if (var0 == 10187) {
                                    var4.Field10639 = "Dragon whip";
                                    var4.Field10623[0] = 925;
                                 } else if (var0 == 10188) {
                                    var4.Field10639 = "Barrow whip";
                                    var4.Field10623[0] = 10394;
                                 } else if (var0 == 10189) {
                                    var4.Field10639 = "Orange whip";
                                    var4.Field10623[0] = 6068;
                                 } else if (var0 == 10190) {
                                    var4.Field10639 = "Black partyhat";
                                    var4.Field10623[0] = 8;
                                 } else if (var0 == 10191) {
                                    var4.Field10639 = "Orange partyhat";
                                    var4.Field10623[0] = 6068;
                                 } else if (var0 == 10192) {
                                    var4.Field10639 = "Bronze partyhat";
                                    var4.Field10623[0] = 5672;
                                 } else if (var0 == 10193) {
                                    var4.Field10639 = "Iron partyhat";
                                    var4.Field10623[0] = 33;
                                 } else if (var0 == 10194) {
                                    var4.Field10639 = "Steel partyhat";
                                    var4.Field10623[0] = 43072;
                                 } else if (var0 == 10195) {
                                    var4.Field10639 = "Mithril partyhat";
                                    var4.Field10623[0] = 43279;
                                 } else if (var0 == 10196) {
                                    var4.Field10639 = "Adamant partyhat";
                                    var4.Field10623[0] = 21662;
                                 } else if (var0 == 10197) {
                                    var4.Field10639 = "Rune partyhat";
                                    var4.Field10623[0] = 36133;
                                 } else if (var0 == 10198) {
                                    var4.Field10639 = "Barrow partyhat";
                                    var4.Field10623[0] = 10394;
                                 } else if (var0 == 10199) {
                                    var4.Field10639 = "Dragon staff";
                                    var4.Field10623 = new int[4];
                                    var4.Field10622 = new int[4];
                                    var4.Field10623[0] = 925;
                                    var4.Field10623[1] = 925;
                                    var4.Field10623[2] = 925;
                                    var4.Field10623[3] = 127;
                                    var4.Field10622[0] = 14503;
                                    var4.Field10622[1] = 14499;
                                    var4.Field10622[2] = 14494;
                                    var4.Field10622[3] = 14490;
                                 } else if (var0 == 10200) {
                                    var4.Field10639 = "Dragon blade";
                                    var4.Field10623[0] = 925;
                                    var4.Field10623[1] = 127;
                                 } else if (var0 == 10201) {
                                    var4.Field10639 = "Black h'ween mask";
                                    var4.Field10623[0] = 8;
                                 } else if (var0 == 10202) {
                                    var4.Field10639 = "White h'ween mask";
                                    var4.Field10623[0] = 120;
                                 } else if (var0 == 10203) {
                                    var4.Field10639 = "Bronze h'ween mask";
                                    var4.Field10623[0] = 5672;
                                 } else if (var0 == 10204) {
                                    var4.Field10639 = "Iron h'ween mask";
                                    var4.Field10623[0] = 33;
                                 } else if (var0 == 10205) {
                                    var4.Field10639 = "Steel h'ween mask";
                                    var4.Field10623[0] = 43072;
                                 } else if (var0 == 10206) {
                                    var4.Field10639 = "Mithril h'ween mask";
                                    var4.Field10623[0] = 43279;
                                 } else if (var0 == 10207) {
                                    var4.Field10639 = "Adamant h'ween mask";
                                    var4.Field10623[0] = 21662;
                                 } else if (var0 == 10208) {
                                    var4.Field10639 = "Rune h'ween mask";
                                    var4.Field10623[0] = 36133;
                                 } else if (var0 == 10209) {
                                    var4.Field10639 = "Dragon h'ween mask";
                                    var4.Field10623[0] = 915;
                                 } else if (var0 == 10210) {
                                    var4.Field10639 = "Barrow h'ween mask";
                                    var4.Field10623[0] = 10394;
                                 } else if (var0 == 10211) {
                                    var4.Field10639 = "Gold h'ween mask";
                                    var4.Field10623[0] = 9118;
                                 } else if (var0 == 10212) {
                                    var4.Field10639 = "Yellow h'ween mask";
                                    var4.Field10623[0] = 11175;
                                 } else if (var0 == 10213) {
                                    var4.Field10639 = "Purple h'ween mask";
                                    var4.Field10623[0] = 54040;
                                 } else if (var0 == 10214) {
                                    var4.Field10639 = "Black santa hat";
                                    var4.Field10623[0] = 8;
                                    var4.Field10623[1] = 4;
                                 } else if (var0 == 10215) {
                                    var4.Field10639 = "Yellow santa hat";
                                    var4.Field10623[0] = 11175;
                                    var4.Field10623[1] = 11171;
                                 } else if (var0 == 10216) {
                                    var4.Field10639 = "White santa hat";
                                    var4.Field10623[0] = 120;
                                    var4.Field10623[1] = 116;
                                 } else if (var0 == 10217) {
                                    var4.Field10639 = "Iron santa hat";
                                    var4.Field10623[0] = 33;
                                    var4.Field10623[1] = 29;
                                 } else if (var0 == 10218) {
                                    var4.Field10639 = "Bronze santa hat";
                                    var4.Field10623[0] = 5672;
                                    var4.Field10623[1] = 5668;
                                 } else if (var0 == 10219) {
                                    var4.Field10639 = "Steel santa hat";
                                    var4.Field10623[0] = 43072;
                                    var4.Field10623[1] = 43068;
                                 } else if (var0 == 10220) {
                                    var4.Field10639 = "Mithril santa hat";
                                    var4.Field10623[0] = 43279;
                                    var4.Field10623[1] = 43275;
                                 } else if (var0 == 10221) {
                                    var4.Field10639 = "Adamant santa hat";
                                    var4.Field10623[0] = 21662;
                                    var4.Field10623[1] = 21658;
                                 } else if (var0 == 10222) {
                                    var4.Field10639 = "Rune santa hat";
                                    var4.Field10623[0] = 36133;
                                    var4.Field10623[1] = 36129;
                                 } else if (var0 == 10223) {
                                    var4.Field10639 = "Dragon santa hat";
                                    var4.Field10623[0] = 915;
                                    var4.Field10623[1] = 914;
                                 } else if (var0 == 10224) {
                                    var4.Field10639 = "Barrow santa hat";
                                    var4.Field10623[0] = 10394;
                                    var4.Field10623[1] = 10390;
                                 } else if (var0 == 10225) {
                                    var4.Field10639 = "Gold santa hat";
                                    var4.Field10623[0] = 9118;
                                    var4.Field10623[1] = 9114;
                                 } else if (var0 == 10226) {
                                    var4.Field10639 = "Purple santa hat";
                                    var4.Field10623[0] = 54040;
                                    var4.Field10623[1] = 54036;
                                 } else if (var0 == 10227) {
                                    var4.Field10639 = "Cyan partyhat";
                                    var4.Field10623[0] = 33722;
                                 } else if (var0 == 10228) {
                                    var4.Field10639 = "Orange santa hat";
                                    var4.Field10623[0] = 6068;
                                    var4.Field10623[1] = 6064;
                                 } else if (var0 == 10229) {
                                    var4.Field10639 = "Ancient partyhat";
                                    var4.Field10623[0] = 49872;
                                 } else if (var0 == 10230) {
                                    var4.Field10639 = "Ancient santa hat";
                                    var4.Field10623[0] = 49872;
                                    var4.Field10623[1] = 49868;
                                 } else if (var0 == 10231) {
                                    var4.Field10639 = "Green-gray partyhat";
                                    var4.Field10623[0] = 21707;
                                 } else if (var0 == 10232) {
                                    var4.Field10639 = "Light-green partyhat";
                                    var4.Field10623[0] = 23389;
                                 } else if (var0 == 10233) {
                                    var4.Field10639 = "Cyan whip";
                                    var4.Field10623[0] = 33715;
                                 } else if (var0 == 10234) {
                                    var4.Field10639 = "Cyan santa hat";
                                    var4.Field10623[0] = 33722;
                                    var4.Field10623[1] = 33722;
                                 } else if (var0 == 10235) {
                                    var4.Field10639 = "Cold blade";
                                    var4.Field10623[0] = 30174;
                                    var4.Field10623[1] = 127;
                                 } else if (var0 == 10236) {
                                    var4.Field10639 = "Ancient blade";
                                    var4.Field10623[0] = 49872;
                                    var4.Field10623[1] = 127;
                                 } else if (var0 == 10237) {
                                    var4.Field10639 = "Black blade";
                                    var4.Field10623[0] = 8;
                                    var4.Field10623[1] = 127;
                                 } else if (var0 == 10238) {
                                    var4.Field10639 = "Nature blade";
                                    var4.Field10623[0] = 18864;
                                    var4.Field10623[1] = 127;
                                 } else if (var0 == 10239) {
                                    var4.Field10639 = "Lesser blade";
                                    var4.Field10623[0] = 915;
                                    var4.Field10623[1] = 127;
                                 } else if (var0 == 10240) {
                                    var4.Field10639 = "Angel blade";
                                    var4.Field10623[0] = 14041;
                                    var4.Field10623[1] = 127;
                                 } else if (var0 == 10241) {
                                    var4.Field10639 = "Gold blade";
                                    var4.Field10623[0] = 9118;
                                    var4.Field10623[1] = 127;
                                 } else if (var0 == 10242) {
                                    var4.Field10639 = "Armadyl wings";
                                    var4.Field10634 = 65518;
                                    var4.Field10662 = 65518;
                                    var4.Field10641 = 65519;
                                    var4.Field10652 = new String[]{null, "Wear", null, null, "Drop"};
                                 } else if (var0 == 10243) {
                                    var4.Field10639 = "Bandos wings";
                                    var4.Field10634 = 65554;
                                    var4.Field10662 = 65554;
                                    var4.Field10641 = 65521;
                                    var4.Field10652 = new String[]{null, "Wear", null, null, "Drop"};
                                 } else if (var0 == 10244) {
                                    var4.Field10639 = "Saradomin wings";
                                    var4.Field10634 = 65522;
                                    var4.Field10662 = 65522;
                                    var4.Field10641 = 65523;
                                    var4.Field10652 = new String[]{null, "Wear", null, null, "Drop"};
                                 } else if (var0 == 10245) {
                                    var4.Field10639 = "Zamorak wings";
                                    var4.Field10634 = 65524;
                                    var4.Field10662 = 65524;
                                    var4.Field10641 = 65525;
                                    var4.Field10652 = new String[]{null, "Wear", null, null, "Drop"};
                                 } else if (var0 == 10246) {
                                    var4.Field10639 = "Dragon hasta";
                                    var4.Field10634 = 65526;
                                    var4.Field10662 = 65526;
                                    var4.Field10641 = 65527;
                                    var4.Field10652 = new String[]{null, "Wear", null, null, "Drop"};
                                    var4.Field10646 = var4.Field10646 * 3 / 4;
                                    var4.Field10653 -= 200;
                                    var4.Field10644 = "A dragon-tipped, one-handed hasta.".getBytes();
                                 } else if (var0 == 10248) {
                                    var4.Field10639 = "Armadyl boots";
                                    var4.Field10634 = 65530;
                                    var4.Field10662 = 65529;
                                    var4.Field10641 = 65528;
                                    var4.Field10652 = new String[]{null, "Wear", null, null, "Drop"};
                                    var4.Field10646 = var4.Field10646 * 12 / 10;
                                    var4.Field10644 = "Boots of great craftsmanship.".getBytes();
                                 } else if (var0 == 10249) {
                                    var4.Field10639 = "Armadyl gloves";
                                    var4.Field10634 = 65533;
                                    var4.Field10662 = 65532;
                                    var4.Field10641 = 65531;
                                    var4.Field10652 = new String[]{null, "Wear", null, null, "Drop"};
                                    var4.Field10661 = 2000;
                                    var4.Field10646 = var4.Field10646 * 10 / 10;
                                    var4.Field10644 = "Gloves of great craftsmanship.".getBytes();
                                 } else if (var0 == 10250) {
                                    var4.Field10639 = "Bandos gloves";
                                    var4.Field10634 = 65536;
                                    var4.Field10662 = 65535;
                                    var4.Field10641 = 65534;
                                    var4.Field10652 = new String[]{null, "Wear", null, null, "Drop"};
                                    var4.Field10661 -= 100;
                                    var4.Field10646 = var4.Field10646 * 14 / 10;
                                    var4.Field10644 = "Some sturdy gloves.".getBytes();
                                 } else if (var0 == 10251) {
                                    var4.Field10639 = "Bandos helm";
                                    var4.Field10634 = 65700;
                                    var4.Field10662 = 65699;
                                    var4.Field10641 = 65537;
                                    var4.Field10652 = new String[]{null, "Wear", null, null, "Drop"};
                                    var4.Field10653 += 320;
                                    var4.Field10646 = var4.Field10646 * 12 / 10;
                                    var4.Field10644 = "A sturdy helm.".getBytes();
                                    var4.genderZeroOffset = 65555;
                                    var4.genderZeroOffset2 = -1;
                                    var4.genderOneOffset = 65556;
                                    var4.genderOneOffset2 = -1;
                                 } else if (var0 == 10252) {
                                    var4.Field10639 = "Battle robe boots";
                                    var4.Field10634 = 65542;
                                    var4.Field10662 = 65541;
                                    var4.Field10641 = 65540;
                                    var4.Field10652 = new String[]{null, "Wear", null, null, "Drop"};
                                    var4.Field10646 = var4.Field10646 * 12 / 10;
                                    var4.Field10644 = null;
                                 } else if (var0 == 10253) {
                                    var4.Field10639 = "Battle robe gloves";
                                    var4.Field10634 = 65545;
                                    var4.Field10662 = 65544;
                                    var4.Field10641 = 65543;
                                    var4.Field10652 = new String[]{null, "Wear", null, null, "Drop"};
                                    var4.Field10646 = var4.Field10646 * 11 / 10;
                                    var4.Field10644 = null;
                                 } else if (var0 == 10261) {
                                    var4.Field10639 = "Cyan crystal wings";
                                    var4.Field10634 = 65546;
                                    var4.Field10662 = 65546;
                                    var4.Field10641 = 65547;
                                    var4.Field10652 = new String[]{null, "Wear", null, null, "Drop"};
                                 } else if (var0 == 10262) {
                                    var4.Field10639 = "Colored fairy wings";
                                    var4.Field10634 = 65548;
                                    var4.Field10662 = 65548;
                                    var4.Field10641 = 65549;
                                    var4.Field10652 = new String[]{null, "Wear", null, null, "Drop"};
                                    var4.Field10646 = var4.Field10646 * 11 / 10;
                                    var4.Field10657 -= 20;
                                 } else if (var0 == 10263) {
                                    var4.Field10639 = "Cyan fairy wings";
                                    var4.Field10634 = 65550;
                                    var4.Field10662 = 65550;
                                    var4.Field10641 = 65551;
                                    var4.Field10652 = new String[]{null, "Wear", null, null, "Drop"};
                                    var4.Field10646 = var4.Field10646 * 12 / 10;
                                 } else if (var0 == 10264) {
                                    var4.Field10639 = "Fox tail";
                                    var4.Field10634 = 65557;
                                    var4.Field10662 = 65557;
                                    var4.Field10641 = 65553;
                                    var4.Field10652 = new String[]{null, "Wear", null, null, "Drop"};
                                    var4.Field10646 = var4.Field10646 * 6 / 10;
                                 } else if (var0 == 10265) {
                                    var4.Field10639 = "Red crystal wings";
                                    var4.Field10634 = 65546;
                                    var4.Field10662 = 65546;
                                    var4.Field10641 = 65547;
                                    var4.Field10652 = new String[]{null, "Wear", null, null, "Drop"};
                                    var4.Field10622 = new int[]{36862};
                                    var4.Field10623 = new int[]{920};
                                 } else if (var0 == 10266) {
                                    var4.Field10639 = "Purple crystal wings";
                                    var4.Field10634 = 65546;
                                    var4.Field10662 = 65546;
                                    var4.Field10641 = 65547;
                                    var4.Field10652 = new String[]{null, "Wear", null, null, "Drop"};
                                    var4.Field10622 = new int[]{36862};
                                    var4.Field10623 = new int[]{54035};
                                 } else if (var0 == 10267) {
                                    var4.Field10639 = "Yellow crystal wings";
                                    var4.Field10634 = 65546;
                                    var4.Field10662 = 65546;
                                    var4.Field10641 = 65547;
                                    var4.Field10652 = new String[]{null, "Wear", null, null, "Drop"};
                                    var4.Field10622 = new int[]{36862};
                                    var4.Field10623 = new int[]{10186};
                                 } else if (var0 == 10268) {
                                    var4.Field10639 = "Black crystal wings";
                                    var4.Field10634 = 65546;
                                    var4.Field10662 = 65546;
                                    var4.Field10641 = 65547;
                                    var4.Field10652 = new String[]{null, "Wear", null, null, "Drop"};
                                    var4.Field10622 = new int[]{36862};
                                    var4.Field10623 = new int[1];
                                 } else if (var0 == 10269) {
                                    var4.Field10639 = "White crystal wings";
                                    var4.Field10634 = 65546;
                                    var4.Field10662 = 65546;
                                    var4.Field10641 = 65547;
                                    var4.Field10652 = new String[]{null, "Wear", null, null, "Drop"};
                                    var4.Field10622 = new int[]{36862};
                                    var4.Field10623 = new int[]{43129};
                                 } else if (var0 == 10270) {
                                    var4.Field10639 = "Orange crystal wings";
                                    var4.Field10634 = 65546;
                                    var4.Field10662 = 65546;
                                    var4.Field10641 = 65547;
                                    var4.Field10652 = new String[]{null, "Wear", null, null, "Drop"};
                                    var4.Field10622 = new int[]{36862};
                                    var4.Field10623 = new int[]{6093};
                                 } else if (var0 == 10271) {
                                    var4.Field10639 = "Blue crystal wings";
                                    var4.Field10634 = 65546;
                                    var4.Field10662 = 65546;
                                    var4.Field10641 = 65547;
                                    var4.Field10652 = new String[]{null, "Wear", null, null, "Drop"};
                                    var4.Field10622 = new int[]{36862};
                                    var4.Field10623 = new int[]{43958};
                                 } else if (var0 == 10272) {
                                    var4.Field10639 = "Green crystal wings";
                                    var4.Field10634 = 65546;
                                    var4.Field10662 = 65546;
                                    var4.Field10641 = 65547;
                                    var4.Field10652 = new String[]{null, "Wear", null, null, "Drop"};
                                    var4.Field10622 = new int[]{36862};
                                    var4.Field10623 = new int[]{22417};
                                 } else if (var0 == 22400) {
                                    var4.Field10639 = "Arcanist cape";
                                    var4.Field10634 = 65562;
                                    var4.Field10662 = 65563;
                                    var4.Field10641 = 65564;
                                    var4.Field10652 = new String[]{null, "Wear", null, null, "Drop"};
                                 } else if (var0 == 22401) {
                                    var4.Field10639 = "Artisan cape";
                                    var4.Field10634 = 65565;
                                    var4.Field10662 = 65566;
                                    var4.Field10641 = 65567;
                                    var4.Field10652 = new String[]{null, "Wear", null, null, "Drop"};
                                 } else if (var0 == 22402) {
                                    var4.Field10639 = "Botanist cape";
                                    var4.Field10634 = 65568;
                                    var4.Field10662 = 65569;
                                    var4.Field10641 = 65570;
                                    var4.Field10652 = new String[]{null, "Wear", null, null, "Drop"};
                                 } else if (var0 == 22403) {
                                    var4.Field10639 = "Forester cape";
                                    var4.Field10634 = 65571;
                                    var4.Field10662 = 65572;
                                    var4.Field10641 = 65573;
                                    var4.Field10652 = new String[]{null, "Wear", null, null, "Drop"};
                                 } else if (var0 == 22404) {
                                    var4.Field10639 = "Monster hunter cape";
                                    var4.Field10634 = 65574;
                                    var4.Field10662 = 65575;
                                    var4.Field10641 = 65576;
                                    var4.Field10652 = new String[]{null, "Wear", null, null, "Drop"};
                                 } else if (var0 == 22405) {
                                    var4.Field10639 = "Prospector cape";
                                    var4.Field10634 = 65577;
                                    var4.Field10662 = 65578;
                                    var4.Field10641 = 65579;
                                    var4.Field10652 = new String[]{null, "Wear", null, null, "Drop"};
                                 } else if (var0 == 22406) {
                                    var4.Field10639 = "Skirmisher cape";
                                    var4.Field10634 = 65580;
                                    var4.Field10662 = 65581;
                                    var4.Field10641 = 65582;
                                    var4.Field10652 = new String[]{null, "Wear", null, null, "Drop"};
                                 } else if (var0 == 22407) {
                                    var4.Field10639 = "Survivalist cape";
                                    var4.Field10634 = 65583;
                                    var4.Field10662 = 65584;
                                    var4.Field10641 = 65585;
                                    var4.Field10652 = new String[]{null, "Wear", null, null, "Drop"};
                                 } else if (var0 == 22408) {
                                    var4.Field10639 = "Templar cape";
                                    var4.Field10634 = 65586;
                                    var4.Field10662 = 65587;
                                    var4.Field10641 = 65588;
                                    var4.Field10652 = new String[]{null, "Wear", null, null, "Drop"};
                                 } else if (var0 == 22409) {
                                    var4.Field10639 = "Vigilante cape";
                                    var4.Field10634 = 65589;
                                    var4.Field10662 = 65590;
                                    var4.Field10641 = 65591;
                                    var4.Field10652 = new String[]{null, "Wear", null, null, "Drop"};
                                 } else if (var0 == 22410) {
                                    var4.Field10639 = "Elemental bow";
                                    var4.Field10644 = "Can be upgraded with elemental crystals.".getBytes();
                                    var4.Field10634 = 65560;
                                    var4.Field10662 = 65560;
                                    var4.Field10641 = 65561;
                                    var4.Field10652 = new String[]{null, "Wear", null, null, "Drop"};
                                 } else if (var0 == 22411) {
                                    var4.Field10639 = "Elemental bow (ice)";
                                    var4.Field10634 = 65558;
                                    var4.Field10662 = 65558;
                                    var4.Field10641 = 65559;
                                    var4.Field10652 = new String[]{null, "Wear", "Check charges", null, "Destroy"};
                                    var4.Field10646 = var4.Field10646 * 11 / 9;
                                    var4.Field10622 = new int[]{34792, 41, 30655, 12, 127};
                                    var4.Field10623 = new int[]{Field10614, 41, Field10614, 12, 127};
                                 } else if (var0 == 22412) {
                                    var4.Field10639 = "Elemental bow (fire)";
                                    var4.Field10634 = 65558;
                                    var4.Field10662 = 65558;
                                    var4.Field10641 = 65559;
                                    var4.Field10652 = new String[]{null, "Wear", "Check charges", null, "Destroy"};
                                    var4.Field10646 = var4.Field10646 * 11 / 9;
                                    var4.Field10622 = new int[]{34792, 41, 30655, 12, 127};
                                    var4.Field10623 = new int[]{Field10617, 41, Field10617, 12, 127};
                                 } else if (var0 == 22413) {
                                    var4.Field10639 = "Elemental bow (nature)";
                                    var4.Field10634 = 65558;
                                    var4.Field10662 = 65558;
                                    var4.Field10641 = 65559;
                                    var4.Field10652 = new String[]{null, "Wear", "Check charges", null, "Destroy"};
                                    var4.Field10646 = var4.Field10646 * 11 / 9;
                                    var4.Field10622 = new int[]{34792, 41, 30655, 12, 127};
                                    var4.Field10623 = new int[]{Field10616, 41, Field10616, 12, 127};
                                 } else if (var0 == 22414) {
                                    var4.Field10639 = "Elemental bow (thunder)";
                                    var4.Field10634 = 65558;
                                    var4.Field10662 = 65558;
                                    var4.Field10641 = 65559;
                                    var4.Field10652 = new String[]{null, "Wear", "Check charges", null, "Destroy"};
                                    var4.Field10646 = var4.Field10646 * 11 / 9;
                                    var4.Field10622 = new int[]{34792, 41, 30655, 12, 127};
                                    var4.Field10623 = new int[]{Field10615, 41, Field10615, 12, 127};
                                 } else if (var0 == 22415) {
                                    var4.Field10639 = forID(var4.Field10626 - 5).Field10639;
                                    var4.Field10632 = 799;
                                    var4.Field10645 = var4.Field10626 - 5;
                                    var4.Field10652 = new String[]{null, null, null, null, "Drop"};
                                 } else if (var0 == 22416) {
                                    var4.Field10639 = "Elemental sword";
                                    var4.Field10634 = 65592;
                                    var4.Field10662 = 65593;
                                    var4.Field10641 = 65593;
                                    var4.Field10652 = new String[]{null, "Wear", null, null, "Drop"};
                                    var4.Field10646 = var4.Field10646 * 9 / 11;
                                 } else if (var0 == 22417) {
                                    var4.Field10639 = "Elemental sword (ice)";
                                    var4.Field10634 = 65594;
                                    var4.Field10662 = 65594;
                                    var4.Field10641 = 65595;
                                    var4.Field10652 = new String[]{null, "Wear", "Check charges", null, "Destroy"};
                                    var4.Field10646 = var4.Field10646 * 9 / 11;
                                    var4.Field10622 = new int[]{34792, 41, 30655, 12, 127};
                                    var4.Field10623 = new int[]{Field10614, 41, Field10614, 12, 127};
                                 } else if (var0 == 22422) {
                                    var4.Field10639 = "Elemental staff (ice)";
                                    var4.Field10652 = new String[]{null, "Wear", "Check charges", null, "Destroy"};
                                    var4.Field10622 = new int[]{43086, 43093, 43090};
                                    var4.Field10623 = new int[]{Field10614, Field10614, Field10614};
                                    var12 = ParticleDefinition.Method7791("ele_ice_staff");
                                    var4.Field10621 = new int[][]{{120, var12}, {121, var12}, {122, var12}};
                                 } else if (var0 == 22423) {
                                    var4.Field10639 = "Elemental staff (fire)";
                                    var4.Field10652 = new String[]{null, "Wear", "Check charges", null, "Destroy"};
                                    var4.Field10622 = new int[]{43086, 43093, 43090};
                                    var4.Field10623 = new int[]{Field10617, Field10617, Field10617};
                                    var12 = ParticleDefinition.Method7791("ele_fire_staff");
                                    var4.Field10621 = new int[][]{{120, var12}, {121, var12}, {122, var12}};
                                 } else if (var0 == 22424) {
                                    var4.Field10639 = "Elemental staff (nature)";
                                    var4.Field10652 = new String[]{null, "Wear", "Check charges", null, "Destroy"};
                                    var4.Field10622 = new int[]{43086, 43093, 43090};
                                    var4.Field10623 = new int[]{Field10616, Field10616, Field10616};
                                    var12 = ParticleDefinition.Method7791("ele_nature_staff");
                                    var4.Field10621 = new int[][]{{120, var12}, {121, var12}, {122, var12}};
                                 } else if (var0 == 22425) {
                                    var4.Field10639 = "Elemental staff (thunder)";
                                    var4.Field10652 = new String[]{null, "Wear", "Check charges", null, "Destroy"};
                                    var4.Field10622 = new int[]{43086, 43093, 43090};
                                    var4.Field10623 = new int[]{Field10615, Field10615, Field10615};
                                    var12 = ParticleDefinition.Method7791("ele_thunder_staff");
                                    var4.Field10621 = new int[][]{{120, var12}, {121, var12}, {122, var12}};
                                 } else if (var0 == 22426) {
                                    var29 = forID(4718);
                                    var4.Field10641 = var29.Field10641;
                                    var4.Field10652 = new String[]{null, "Wear", null, null, "Drop"};
                                    var4.Field10634 = var29.Field10634;
                                    var4.Field10662 = var29.Field10662;
                                 } else if (var0 == 22427) {
                                    var29 = forID(7807);
                                    var4.Field10641 = var29.Field10641;
                                    var4.Field10652 = new String[]{null, "Wear", null, null, "Drop"};
                                    var4.Field10634 = var29.Field10634;
                                    var4.Field10662 = var29.Field10662;
                                 } else if (var0 == 22428) {
                                    var4.Field10639 = "Guthix wings";
                                    var4.Field10634 = 65596;
                                    var4.Field10662 = 65596;
                                    var4.Field10641 = 65597;
                                    var4.Field10652 = new String[]{null, "Wear", null, null, "Drop"};
                                 } else if (var0 == 22429) {
                                    var4.Field10639 = "Ancient wings";
                                    var4.Field10634 = 65598;
                                    var4.Field10662 = 65598;
                                    var4.Field10641 = 65599;
                                    var4.Field10652 = new String[]{null, "Wear", null, null, "Drop"};
                                 } else if (var0 == 22430) {
                                    var4.Field10639 = "Demon horns";
                                    var4.Field10634 = 65600;
                                    var4.Field10662 = 65600;
                                    var4.Field10641 = 65601;
                                    var4.Field10652 = new String[]{null, "Wear", null, null, "Drop"};
                                    var4.Field10646 = (var4.Field10646 << 2) / 10;
                                 } else if (var0 == 22431) {
                                    var4.Field10639 = "Demon tail";
                                    var4.Field10634 = 65602;
                                    var4.Field10662 = 65602;
                                    var4.Field10641 = 65603;
                                    var4.Field10652 = new String[]{null, "Wear", null, null, "Drop"};
                                    var4.Field10646 = var4.Field10646 * 7 / 10;
                                 } else if (var0 == 22432) {
                                    var4.Field10639 = "Obsidian claws";
                                    var4.Field10634 = 65606;
                                    var4.Field10662 = 65607;
                                    var4.Field10641 = 65608;
                                    var4.Field10652 = new String[]{null, "Wear", null, null, "Drop"};
                                    var4.Field10644 = "Powerful obsidian-plated claws.".getBytes();
                                    var4.Field10646 = var4.Field10646 * 13 / 10;
                                 } else if (var0 == 22433) {
                                    var4.Field10639 = "Mod cape";
                                    var4.Field10634 = 65612;
                                    var4.Field10662 = 65612;
                                    var4.Field10641 = 65613;
                                    var4.Field10652 = new String[]{null, "Wear", null, null, "Drop"};
                                    var4.Field10644 = "A cape that Emps-world moderators wear.".getBytes();
                                 } else if (var0 == 22434) {
                                    var4.Field10639 = "Admin cape";
                                    var4.Field10634 = 65614;
                                    var4.Field10662 = 65614;
                                    var4.Field10641 = 65615;
                                    var4.Field10652 = new String[]{null, "Wear", null, null, "Drop"};
                                    var4.Field10644 = "A cape that Emps-world administrators wear.".getBytes();
                                 } else if (var0 == 22435) {
                                    var4.Field10639 = "Agility master cape";
                                    var4.Field10634 = 65616;
                                    var4.Field10662 = 65616;
                                    var4.Field10641 = 65617;
                                    var4.Field10652 = new String[]{null, "Wear", null, null, "Drop"};
                                    var4.Field10644 = "A cape only true masters of Agility can wear.".getBytes();
                                 } else if (var0 == 22436) {
                                    var4.Field10639 = "Attack master cape";
                                    var4.Field10634 = 65618;
                                    var4.Field10662 = 65618;
                                    var4.Field10641 = 65619;
                                    var4.Field10652 = new String[]{null, "Wear", null, null, "Drop"};
                                    var4.Field10644 = "A cape only true masters of accuracy can wear.".getBytes();
                                 } else if (var0 == 22437) {
                                    var4.Field10639 = "Cooking master cape";
                                    var4.Field10634 = 65620;
                                    var4.Field10662 = 65620;
                                    var4.Field10641 = 65621;
                                    var4.Field10652 = new String[]{null, "Wear", null, null, "Drop"};
                                    var4.Field10644 = "A cape only true masters of Cooking can wear.".getBytes();
                                 } else if (var0 == 22438) {
                                    var4.Field10639 = "Crafting master cape";
                                    var4.Field10634 = 65622;
                                    var4.Field10662 = 65622;
                                    var4.Field10641 = 65623;
                                    var4.Field10652 = new String[]{null, "Wear", null, null, "Drop"};
                                    var4.Field10644 = "A cape only true masters of Crafting can wear.".getBytes();
                                 } else if (var0 == 22439) {
                                    var4.Field10639 = "Defence master cape";
                                    var4.Field10634 = 65624;
                                    var4.Field10662 = 65624;
                                    var4.Field10641 = 65625;
                                    var4.Field10652 = new String[]{null, "Wear", null, null, "Drop"};
                                    var4.Field10644 = "A cape only true masters of resilience can wear.".getBytes();
                                 } else if (var0 == 22440) {
                                    var4.Field10639 = "Farming master cape";
                                    var4.Field10634 = 65626;
                                    var4.Field10662 = 65626;
                                    var4.Field10641 = 65627;
                                    var4.Field10652 = new String[]{null, "Wear", null, null, "Drop"};
                                    var4.Field10644 = "A cape only true masters of Farming can wear.".getBytes();
                                 } else if (var0 == 22441) {
                                    var4.Field10639 = "Firemaking master cape";
                                    var4.Field10634 = 65628;
                                    var4.Field10662 = 65628;
                                    var4.Field10641 = 65629;
                                    var4.Field10652 = new String[]{null, "Wear", null, null, "Drop"};
                                    var4.Field10644 = "A cape only true masters of fire can wear.".getBytes();
                                 } else if (var0 == 22442) {
                                    var4.Field10639 = "Fishing master cape";
                                    var4.Field10634 = 65630;
                                    var4.Field10662 = 65630;
                                    var4.Field10641 = 65631;
                                    var4.Field10652 = new String[]{null, "Wear", null, null, "Drop"};
                                    var4.Field10644 = "A cape only true masters of Fishing can wear.".getBytes();
                                 } else if (var0 == 22443) {
                                    var4.Field10639 = "Fletching master cape";
                                    var4.Field10634 = 65632;
                                    var4.Field10662 = 65632;
                                    var4.Field10641 = 65633;
                                    var4.Field10652 = new String[]{null, "Wear", null, null, "Drop"};
                                    var4.Field10644 = "A cape only true masters of Fletching can wear.".getBytes();
                                 } else if (var0 == 22444) {
                                    var4.Field10639 = "Herblore master cape";
                                    var4.Field10634 = 65634;
                                    var4.Field10662 = 65634;
                                    var4.Field10641 = 65635;
                                    var4.Field10652 = new String[]{null, "Wear", null, null, "Drop"};
                                    var4.Field10644 = "A cape only true masters of potions can wear.".getBytes();
                                 } else if (var0 == 22445) {
                                    var4.Field10639 = "Hitpoints master cape";
                                    var4.Field10634 = 65636;
                                    var4.Field10662 = 65636;
                                    var4.Field10641 = 65637;
                                    var4.Field10652 = new String[]{null, "Wear", null, null, "Drop"};
                                    var4.Field10644 = "A cape only true masters of endurance can wear.".getBytes();
                                 } else if (var0 == 22446) {
                                    var4.Field10639 = "Hunter master cape";
                                    var4.Field10634 = 65638;
                                    var4.Field10662 = 65638;
                                    var4.Field10641 = 65639;
                                    var4.Field10652 = new String[]{null, "Wear", null, null, "Drop"};
                                    var4.Field10644 = "A cape only true masters of hunting can wear.".getBytes();
                                 } else if (var0 == 22447) {
                                    var4.Field10639 = "Magic master cape";
                                    var4.Field10634 = 65640;
                                    var4.Field10662 = 65640;
                                    var4.Field10641 = 65641;
                                    var4.Field10652 = new String[]{null, "Wear", null, null, "Drop"};
                                    var4.Field10644 = "A cape only true masters of Magic can wear.".getBytes();
                                 } else if (var0 == 22448) {
                                    var4.Field10639 = "Mining master cape";
                                    var4.Field10634 = 65642;
                                    var4.Field10662 = 65642;
                                    var4.Field10641 = 65643;
                                    var4.Field10652 = new String[]{null, "Wear", null, null, "Drop"};
                                    var4.Field10644 = "A cape only true masters of Mining can wear.".getBytes();
                                    var4.Field10646 = var4.Field10646 * 11 / 10;
                                 } else if (var0 == 22449) {
                                    var4.Field10639 = "Prayer master cape";
                                    var4.Field10634 = 65644;
                                    var4.Field10662 = 65644;
                                    var4.Field10641 = 65645;
                                    var4.Field10652 = new String[]{null, "Wear", null, null, "Drop"};
                                    var4.Field10644 = "A cape only true masters of Prayer can wear.".getBytes();
                                 } else if (var0 == 22450) {
                                    var4.Field10639 = "Range master cape";
                                    var4.Field10634 = 65646;
                                    var4.Field10662 = 65646;
                                    var4.Field10641 = 65647;
                                    var4.Field10652 = new String[]{null, "Wear", null, null, "Drop"};
                                    var4.Field10644 = "A cape only true masters of Range can wear.".getBytes();
                                 } else if (var0 == 22451) {
                                    var4.Field10639 = "Runecraft master cape";
                                    var4.Field10634 = 65648;
                                    var4.Field10662 = 65648;
                                    var4.Field10641 = 65649;
                                    var4.Field10652 = new String[]{null, "Wear", null, null, "Drop"};
                                    var4.Field10644 = "A cape only true masters of Runecrafting can wear.".getBytes();
                                 } else if (var0 == 22452) {
                                    var4.Field10639 = "Slayer master cape";
                                    var4.Field10634 = 65650;
                                    var4.Field10662 = 65650;
                                    var4.Field10641 = 65651;
                                    var4.Field10652 = new String[]{null, "Wear", null, null, "Drop"};
                                    var4.Field10644 = "A cape only true masters of slaying can wear.".getBytes();
                                 } else if (var0 == 22453) {
                                    var4.Field10639 = "Smithing master cape";
                                    var4.Field10634 = 65652;
                                    var4.Field10662 = 65652;
                                    var4.Field10641 = 65653;
                                    var4.Field10652 = new String[]{null, "Wear", null, null, "Drop"};
                                    var4.Field10644 = "A cape only true masters of Smithing can wear.".getBytes();
                                 } else if (var0 == 22454) {
                                    var4.Field10639 = "Strength master cape";
                                    var4.Field10634 = 65654;
                                    var4.Field10662 = 65654;
                                    var4.Field10641 = 65655;
                                    var4.Field10652 = new String[]{null, "Wear", null, null, "Drop"};
                                    var4.Field10644 = "A cape only true masters of power can wear.".getBytes();
                                 } else if (var0 == 22455) {
                                    var4.Field10639 = "Thieving master cape";
                                    var4.Field10634 = 65656;
                                    var4.Field10662 = 65656;
                                    var4.Field10641 = 65657;
                                    var4.Field10652 = new String[]{null, "Wear", null, null, "Drop"};
                                    var4.Field10644 = "A cape only true masters of Thieving can wear.".getBytes();
                                 } else if (var0 == 22456) {
                                    var4.Field10639 = "Woodcutting master cape";
                                    var4.Field10634 = 65658;
                                    var4.Field10662 = 65658;
                                    var4.Field10641 = 65659;
                                    var4.Field10652 = new String[]{null, "Wear", null, null, "Drop"};
                                    var4.Field10644 = "A cape only true masters of Woodcutting can wear.".getBytes();
                                 } else if (var0 == 22665) {
                                    var4.Field10639 = "Construction master cape";
                                    var4.Field10634 = 65738;
                                    var4.Field10662 = 65738;
                                    var4.Field10641 = 65739;
                                    var4.Field10652 = new String[]{null, "Wear", null, null, "Drop"};
                                    var4.Field10644 = "A cape only true masters of Construction can wear.".getBytes();
                                    var4.Field10667 = 1;
                                 } else if (var0 == 22666) {
                                    var4.Field10639 = "Abyssal bow";
                                    var4.Field10634 = var4.Field10662 = 65741;
                                    var4.Field10641 = 65740;
                                    var4.Field10652 = new String[]{null, "Wear", null, null, "Drop"};
                                 } else if (var0 >= 22667 && var0 <= 22677) {
                                    var4.Field10634 = var4.Field10662 = 65741;
                                    var4.Field10641 = 65740;
                                    var4.Field10652 = new String[]{null, "Wear", null, null, "Drop"};
                                    var12 = var0 - 22667;
                                    var15 = new int[]{5672, 33, 43072, 8, 43279, 21662, 36133, 925, 10394, 6068, 33715};
                                    var27 = new String[]{"Bronze", "Iron", "Steel", "Black", "Mithril", "Adamant", "Rune", "Dragon", "Barrow", "Orange", "Cyan"};
                                    var4.Field10639 = var27[var12] + " abyssal bow";
                                    var4.Field10622 = new int[]{1839};
                                    var4.Field10623 = new int[]{var15[var12]};
                                 } else {
                                    String[] var13;
                                    int[] var17;
                                    String[] var24;
                                    if (var0 >= 22678 && var0 < 22726) {
                                       var30 = new int[]{Field10614, Field10615, Field10616, Field10617};
                                       var16 = (var0 - 22678) % 4;
                                       var2 = var30[var16];
                                       var13 = new String[]{"ice", "thunder", "nature", "fire"};
                                       var17 = new int[]{1839, 5672, 33, 43072, 8, 43279, 21662, 36133, 925, 10394, 6068, 33715};
                                       var22 = (var0 - 22678) / 4;
                                       var12 = var17[var22];
                                       var24 = new String[]{"", "Bronze", "Iron", "Steel", "Black", "Mithril", "Adamant", "Rune", "Dragon", "Barrow", "Orange", "Cyan"};
                                       if (var0 <= 22681) {
                                          var4.Field10639 = "Abyssal bow (" + var13[var16] + ")";
                                       } else {
                                          var4.Field10639 = var24[var22] + " a. bow (" + var13[var16] + ")";
                                       }

                                       var4.Field10634 = var4.Field10662 = 65743;
                                       var4.Field10641 = 65742;
                                       var4.Field10652 = new String[]{null, "Wear", "Check charges", null, "Destroy"};
                                       var4.Field10622 = new int[]{1839, 31287, 31410};
                                       var4.Field10623 = new int[]{var12, var2 - 20, var2};
                                       var14 = ParticleDefinition.Method7792("abyssal_bow", Rasterizer.Field9964[var2 - 50]);
                                       var4.Field10621 = new int[][]{{86, var14}, {230, var14}};
                                    } else if (var0 == 22727) {
                                       var4.Field10639 = "Abyssal staff";
                                       var4.Field10634 = var4.Field10662 = 65745;
                                       var4.Field10641 = 65744;
                                       var4.Field10652 = new String[]{null, "Wear", null, null, "Drop"};
                                    } else if (var0 >= 22728 && var0 <= 22738) {
                                       var4.Field10634 = var4.Field10662 = 65745;
                                       var4.Field10641 = 65744;
                                       var4.Field10652 = new String[]{null, "Wear", null, null, "Drop"};
                                       var12 = var0 - 22728;
                                       var15 = new int[]{5672, 33, 43072, 8, 43279, 21662, 36133, 925, 10394, 6068, 33715};
                                       var27 = new String[]{"Bronze", "Iron", "Steel", "Black", "Mithril", "Adamant", "Rune", "Dragon", "Barrow", "Orange", "Cyan"};
                                       var4.Field10639 = var27[var12] + " abyssal staff";
                                       var4.Field10622 = new int[]{1839, 1562};
                                       if ((var14 = var15[var12] + 20) < 0) {
                                          var14 = 0;
                                       }

                                       var4.Field10623 = new int[]{var15[var12], var14};
                                    } else if (var0 >= 22739 && var0 < 22787) {
                                       var30 = new int[]{Field10614, Field10615, Field10616, Field10617};
                                       var16 = (var0 - 22739) % 4;
                                       var2 = var30[var16];
                                       var13 = new String[]{"ice", "thunder", "nature", "fire"};
                                       var17 = new int[]{1839, 5672, 33, 43072, 8, 43279, 21662, 36133, 925, 10394, 6068, 33715};
                                       var22 = (var0 - 22739) / 4;
                                       var12 = var17[var22];
                                       var24 = new String[]{"", "Bronze", "Iron", "Steel", "Black", "Mithril", "Adamant", "Rune", "Dragon", "Barrow", "Orange", "Cyan"};
                                       if (var0 <= 22742) {
                                          var4.Field10639 = "Abyssal staff (" + var13[var16] + ")";
                                       } else {
                                          var4.Field10639 = var24[var22] + " a. staff (" + var13[var16] + ")";
                                       }

                                       var4.Field10634 = var4.Field10662 = 65747;
                                       var4.Field10641 = 65746;
                                       var4.Field10652 = new String[]{null, "Wear", "Check charges", null, "Destroy"};
                                       var4.Field10622 = new int[]{1839, 1562, 31287, 31410};
                                       if ((var14 = var17[var22] + 20) < 0) {
                                          var14 = 0;
                                       }

                                       var4.Field10623 = new int[]{var12, var14, var2 - 20, var2};
                                       int var25 = ParticleDefinition.Method7792("abyssal_staff", Rasterizer.Field9964[var2 - 50]);
                                       var4.Field10621 = new int[][]{{65, var25}};
                                    } else if (var0 >= 22500 && var0 <= 22600) {
                                       var30 = new int[]{4151, 10180, 10181, 10182, 10183, 10184, 10185, 10186, 10187, 10188, 10189, 10233};
                                       var15 = new int[]{Field10614, Field10615, Field10616, Field10617};
                                       var27 = new String[]{"ice", "thunder", "nature", "fire"};
                                       var13 = new String[]{"ele_ice_whip", "ele_thunder_whip", "ele_nature_whip", "ele_fire_whip"};
                                       var4.Field10652 = new String[]{null, "Wear", "Check charges", null, "Destroy"};
                                       var6 = 22500;
                                       boolean var7 = true;
                                       int[] var9 = var30;

                                       for(var8 = 0; var8 < 12; ++var8) {
                                          var12 = var9[var8];
                                          if (!var7) {
                                             break;
                                          }

                                          for(int var10 = 0; var10 < 4; ++var10) {
                                             if (var6 == var0) {
                                                ItemDef var18;
                                                if ((var18 = forID(var12)) == null) {
                                                   System.out.println("old whip null: " + var12);
                                                   return null;
                                                }

                                                var4.Field10639 = var18.Field10639.replace("Abyssal", "Elemental") + " (" + var27[var10] + ")";
                                                var12 = var18.Field10623 == null ? 944 : var18.Field10623[0];
                                                var22 = var15[var10];
                                                var4.Field10622 = new int[]{944, 64192, 64178};
                                                var4.Field10623 = new int[]{var12, var22, var22};
                                                var12 = ParticleDefinition.Method7791(var13[var10]);
                                                var4.Field10621 = new int[][]{{150, var12}, {151, var12}, {152, var12}};
                                                var7 = false;
                                                break;
                                             }

                                             ++var6;
                                          }
                                       }
                                    }
                                 }

                                 if (var4.Field10639 != null && var4.Field10639.endsWith("master cape") && Client.Field12225) {
                                    Model var31 = Model.Method14475(var4.Field10662);
                                    var2 = var0 == 22665 ? 2 : 0;
                                    if (var31 != null) {
                                       var16 = (Integer)var31.Method14505().get(var2);
                                    } else {
                                       Field10607.Method1511(var0);
                                       var16 = 65535;
                                    }

                                    var14 = ParticleDefinition.Method7792("120_cape", Rasterizer.Field9964[var16 & '\uffff']);
                                    var4.Field10621 = new int[][]{{145, var14}, {151, var14}, {149, var14}, {148, var14}, {147, var14}, {146, var14}, {163, var14}, {162, var14}, {166, var14}, {122, var14}, {121, var14}};
                                 } else if (var0 >= 22601 && var0 <= 22604) {
                                    var30 = new int[]{Field10614, Field10615, Field10616, Field10617};
                                    String[] var32 = new String[]{"ice", "thunder", "nature", "fire"};
                                    var2 = var30[var0 - 22601];
                                    var4.Field10622 = new int[]{6032, 127};
                                    var4.Field10623 = new int[]{6032, var2};
                                    var4.Field10624 = new int[]{40};
                                    var4.Field10625 = new int[]{61};
                                 } else if (var0 == 22605) {
                                    var4.Field10652 = new String[]{null, "Wear", null, null, "Drop"};
                                    var4.Field10639 = "Kbd helm";
                                    var4.Field10634 = 65686;
                                    var4.Field10662 = 65684;
                                    var4.genderZeroOffset = 65676;
                                    var4.genderOneOffset = 65676;
                                    var4.Field10641 = 65683;
                                    var4.Field10646 -= 768;
                                 } else if (var0 == 22606) {
                                    var4.Field10652 = new String[]{null, "Wear", null, null, "Drop"};
                                    var4.Field10639 = "Kbd body";
                                    var4.Field10634 = 65670;
                                    var4.Field10662 = 65668;
                                    var4.Field10651 = -1;
                                    var4.Field10650 = -1;
                                    var4.Field10633 = -1;
                                    var4.Field10631 = -1;
                                    var4.Field10641 = 65667;
                                    var4.Field10646 += 256;
                                    var4.Field10622 = var4.Field10623 = null;
                                 } else if (var0 == 22607) {
                                    var4.Field10652 = new String[]{null, "Wear", null, null, "Drop"};
                                    var4.Field10639 = "Kbd legs";
                                    var4.Field10634 = 65690;
                                    var4.Field10662 = 65688;
                                    var4.Field10641 = 65687;
                                    var4.Field10646 += 1408;
                                 } else if (var0 == 22608) {
                                    var4.Field10652 = new String[]{null, "Wear", null, null, "Drop"};
                                    var4.Field10639 = "Kbd gloves";
                                    var4.Field10634 = 65682;
                                    var4.Field10662 = 65680;
                                    var4.Field10641 = 65679;
                                    var4.Field10646 -= 104;
                                    var4.Field10638 -= 136;
                                 } else if (var0 == 22609) {
                                    var4.Field10652 = new String[]{null, "Wear", null, null, "Drop"};
                                    var4.Field10639 = "Kbd boots";
                                    var4.Field10634 = 65674;
                                    var4.Field10662 = 65672;
                                    var4.Field10641 = 65671;
                                    var4.Field10646 -= 768;
                                 } else if (var0 == 22610) {
                                    var4.Field10652 = new String[]{null, "Wear", null, null, "Drop"};
                                    var4.Field10639 = "Kbd tail";
                                    var4.Field10634 = 65694;
                                    var4.Field10662 = 65692;
                                    var4.Field10641 = 65691;
                                    var4.Field10646 -= 900;
                                    var4.Field10661 = 2047;
                                 } else if (var0 == 22611) {
                                    var4.Field10652 = new String[]{null, "Wear", null, null, "Drop"};
                                    var4.Field10639 = "Kbd wings";
                                    var4.Field10634 = 65698;
                                    var4.Field10662 = 65696;
                                    var4.Field10641 = 65695;
                                    var4.Field10653 = 1424;
                                    var4.Field10661 = 1024;
                                    var4.Field10646 += 768;
                                 } else if (var0 == 22612) {
                                    var4.Field10652 = new String[]{null, "Wear", "Split", null, "Destroy"};
                                    var4.Field10639 = "Kbd helm (g)";
                                    var4.Field10634 = 65685;
                                    var4.Field10662 = 65663;
                                    var4.genderZeroOffset = 65678;
                                    var4.genderOneOffset = 65677;
                                    var4.Field10641 = 65685;
                                    var4.Field10646 -= 700;
                                    var4.Field10657 -= 64;
                                 } else if (var0 == 22613) {
                                    var4.Field10652 = new String[]{null, "Wear", "Split", null, "Destroy"};
                                    var4.Field10639 = "Kbd body (g)";
                                    var4.Field10634 = 65669;
                                    var4.Field10662 = 65660;
                                    var4.Field10651 = -1;
                                    var4.Field10650 = -1;
                                    var4.Field10633 = -1;
                                    var4.Field10631 = -1;
                                    var4.Field10641 = 65669;
                                    var4.Field10646 -= 32;
                                    var4.Field10653 -= 300;
                                    var4.Field10657 += 60;
                                    var4.Field10622 = var4.Field10623 = null;
                                 } else if (var0 == 22614) {
                                    var4.Field10652 = new String[]{null, "Wear", "Split", null, "Destroy"};
                                    var4.Field10639 = "Kbd legs (g)";
                                    var4.Field10634 = 65689;
                                    var4.Field10662 = 65664;
                                    var4.Field10641 = 65689;
                                    var4.Field10646 += 128;
                                    var4.Field10653 -= 300;
                                 } else if (var0 == 22615) {
                                    var4.Field10652 = new String[]{null, "Wear", "Split", null, "Destroy"};
                                    var4.Field10639 = "Kbd gloves (g)";
                                    var4.Field10634 = 65681;
                                    var4.Field10662 = 65662;
                                    var4.Field10641 = 65681;
                                    var4.Field10646 -= 404;
                                    var4.Field10638 = var4.Field10638;
                                    var4.Field10657 -= 20;
                                 } else if (var0 == 22616) {
                                    var4.Field10652 = new String[]{null, "Wear", "Split", null, "Destroy"};
                                    var4.Field10639 = "Kbd boots (g)";
                                    var4.Field10634 = 65673;
                                    var4.Field10662 = 65661;
                                    var4.Field10641 = 65673;
                                    var4.Field10646 -= 700;
                                    var4.Field10653 -= 100;
                                 } else if (var0 == 22617) {
                                    var4.Field10652 = new String[]{null, "Wear", "Split", null, "Destroy"};
                                    var4.Field10639 = "Kbd tail (g)";
                                    var4.Field10634 = 65693;
                                    var4.Field10662 = 65665;
                                    var4.Field10641 = 65693;
                                    var4.Field10646 -= 412;
                                    var4.Field10661 += 1512;
                                    var4.Field10653 += 1600;
                                    var4.Field10638 += 44;
                                    var4.Field10657 += 14;
                                 } else if (var0 == 22618) {
                                    var4.Field10652 = new String[]{null, "Wear", "Split", null, "Destroy"};
                                    var4.Field10639 = "Kbd wings (g)";
                                    var4.Field10634 = 65697;
                                    var4.Field10662 = 65666;
                                    var4.Field10641 = 65697;
                                    var4.Field10646 += 128;
                                    var4.Field10653 -= 300;
                                    var4.Field10657 += 50;
                                 } else if (var0 == 22619) {
                                    var4.Field10652 = new String[]{"Release", null, null, null, "Drop"};
                                    var4.Field10639 = "Baby corporeal beast";
                                    var4.Field10641 = 65703;
                                    var4.Field10643 = true;
                                    var4.Field10663 = new int[]{1};
                                    var4.Field10656 = new int[]{22620};
                                 } else if (var0 == 22620) {
                                    var4.Field10652 = null;
                                    var4.Field10639 = "";
                                    var4.Field10641 = 65702;
                                    var4.Field10646 += 256;
                                    var4.Field10657 -= 32;
                                 } else if (var0 == 22621) {
                                    var4.Field10652 = new String[]{null, null, null, null, "Destroy"};
                                    var4.Field10639 = "Hot egg";
                                    var4.Field10644 = "I wonder whose egg that is...".getBytes();
                                    var4.Field10641 = 9296;
                                    var4.Field10646 -= 1000;
                                    var4.Field10653 = 2000;
                                    var4.Field10657 -= 2;
                                 } else if (var0 == 22622) {
                                    var4.Field10639 = "Abyssal cannon";
                                    var4.Field10652 = new String[]{null, "Wear", null, null, "Drop"};
                                    var4.Field10634 = 65707;
                                    var4.Field10662 = var4.Field10634;
                                    var4.Field10641 = 65706;
                                 } else if (var0 == 22623) {
                                    var4.Field10639 = "Abyssal cape";
                                    var4.Field10652 = new String[]{null, "Wear", null, null, "Drop"};
                                    var4.Field10634 = 65710;
                                    var4.Field10662 = 65709;
                                    var4.Field10641 = 65708;
                                    var4.Field10661 += 1152;
                                    var4.Field10653 += 128;
                                    var4.Field10646 += 512;
                                 } else if (var0 == 22624) {
                                    var4.Field10639 = "Gladiator helm";
                                    var4.Field10652 = new String[]{null, "Wear", null, null, "Drop"};
                                    var4.Field10634 = 65713;
                                    var4.Field10662 = 65712;
                                    var4.Field10641 = 65711;
                                    var4.genderZeroOffset = 65727;
                                    var4.genderOneOffset = 65726;
                                    var4.Field10646 -= 512;
                                    var4.Field10661 = 0;
                                    var4.Field10653 = 650;
                                 } else if (var0 == 22625) {
                                    var4.Field10639 = "Gladiator maul";
                                    var4.Field10652 = new String[]{null, "Wear", null, null, "Drop"};
                                    var4.Field10634 = 65715;
                                    var4.Field10662 = var4.Field10634;
                                    var4.Field10641 = 65714;
                                    var4.Field10646 -= 128;
                                 } else if (var0 == 22626) {
                                    var4.Field10639 = "Skeletal cape";
                                    var4.Field10652 = new String[]{null, "Wear", null, null, "Drop"};
                                    var4.Field10634 = 65720;
                                    var4.Field10662 = 65720;
                                    var4.Field10641 = 65719;
                                    var4.Field10661 += 64;
                                 } else if (var0 == 22627) {
                                    var4.Field10639 = "Skeletal tail";
                                    var4.Field10652 = new String[]{null, "Wear", null, null, "Drop"};
                                    var4.Field10634 = 65723;
                                    var4.Field10662 = 65722;
                                    var4.Field10641 = 65721;
                                 } else if (var0 == 22628) {
                                    var4.Field10639 = "Skeletal wings";
                                    var4.Field10652 = new String[]{null, "Wear", null, null, "Drop"};
                                    var4.Field10634 = 65725;
                                    var4.Field10662 = var4.Field10634;
                                    var4.Field10641 = 65724;
                                 } else if (var0 == 22629) {
                                    var4.Field10645 = 22622;
                                    var4.Field10639 = forID(var4.Field10645).Field10639;
                                    var4.Field10632 = 799;
                                    var4.Field10652 = new String[]{null, null, null, null, "Drop"};
                                    var4.Method11914();
                                 } else if (var0 == 22630) {
                                    var4.Field10645 = 22623;
                                    var4.Field10639 = forID(var4.Field10645).Field10639;
                                    var4.Field10632 = 799;
                                    var4.Field10652 = new String[]{null, null, null, null, "Drop"};
                                    var4.Method11914();
                                 } else if (var0 == 22631) {
                                    var4.Field10645 = 22624;
                                    var4.Field10639 = forID(var4.Field10645).Field10639;
                                    var4.Field10632 = 799;
                                    var4.Field10652 = new String[]{null, null, null, null, "Drop"};
                                    var4.Method11914();
                                 } else if (var0 == 22632) {
                                    var4.Field10645 = 22625;
                                    var4.Field10639 = forID(var4.Field10645).Field10639;
                                    var4.Field10632 = 799;
                                    var4.Field10652 = new String[]{null, null, null, null, "Drop"};
                                    var4.Method11914();
                                 } else if (var0 == 22633) {
                                    var4.Field10639 = "Ice crown";
                                    var4.Field10652 = new String[]{null, "Wear", null, null, "Drop"};
                                    var4.Field10634 = 65718;
                                    var4.Field10662 = 65717;
                                    var4.Field10641 = 65716;
                                    var4.genderOneOffset = var4.genderZeroOffset = 65728;
                                    var4.Field10653 = 512;
                                    var4.Field10661 = 0;
                                    var4.Field10646 -= 800;
                                 } else if (var0 == 22634) {
                                    var4.Field10645 = 22633;
                                    var4.Field10639 = forID(var4.Field10645).Field10639;
                                    var4.Field10632 = 799;
                                    var4.Field10652 = new String[]{null, null, null, null, "Drop"};
                                    var4.Method11914();
                                 } else if (var0 == 22635) {
                                    var4.Field10639 = "Ice shield";
                                    var4.Field10652 = new String[]{null, "Wear", null, null, "Drop"};
                                    var4.Field10634 = 65730;
                                    var4.Field10662 = 65730;
                                    var4.Field10641 = 65729;
                                    var4.Field10646 -= 256;
                                    var4.Field10657 += 11;
                                 } else if (var0 == 22636) {
                                    var4.Field10645 = 22635;
                                    var4.Field10639 = forID(var4.Field10645).Field10639;
                                    var4.Field10632 = 799;
                                    var4.Field10652 = new String[]{null, null, null, null, "Drop"};
                                    var4.Method11914();
                                 } else if (var0 == 22637) {
                                    var4.Field10639 = "Mini Kolodion";
                                    var4.Field10652 = new String[]{"Release", null, null, null, "Destroy"};
                                    var4.Field10641 = 20307;
                                    var4.Field10622 = new int[]{960, 33728, 22443, 11200, 56256, 50099};
                                    var4.Field10623 = new int[]{8, 8, 36928, 36928, 43072, 43072};
                                    var4.Field10646 -= 300;
                                    var4.Field10653 += 400;
                                    --var4.Field10657;
                                    var4.Field10636 = 32;
                                    var4.Field10654 = 32;
                                    var4.Field10655 = 32;
                                 } else if (var0 == 22638) {
                                    var4.Field10639 = "Spider wings";
                                    var4.Field10652 = new String[]{null, "Wear", null, null, "Drop"};
                                    var4.Field10641 = 65734;
                                    var4.Field10634 = var4.Field10662 = 65732;
                                 } else if (var0 == 22639) {
                                    var4.Field10639 = "Pumpkin lantern";
                                    var4.Field10652 = new String[]{null, "Wear", null, null, "Drop"};
                                    var4.Field10641 = 65733;
                                    var4.Field10634 = var4.Field10662 = 65731;
                                    var4.Field10646 -= 850;
                                    var4.Field10653 -= 270;
                                    var4.Field10657 -= 4;
                                 } else if (var0 == 22640) {
                                    var4.Field10639 = "Present (dark)";
                                    var4.Field10622 = new int[]{20917, 1712, 1718, 1707, 20912, 20909, 20908, 1702, 20905};
                                    var4.Field10623 = new int[]{8, 1712, 1718, 1707, 8, 8, 8, 1702, 8};
                                 } else if (var0 == 22641) {
                                    var4.Field10639 = "Christmas cracker";
                                    var4.Field10622 = new int[]{11200, 127, 57};
                                    var4.Field10623 = new int[]{11200, 8, 57};
                                 } else if (var0 == 22642) {
                                    var4.Field10639 = "Present imp";
                                    var4.Field10641 = 65737;
                                    var4.Field10652 = new String[]{"Release", null, null, null, "Destroy"};
                                    var4.Field10646 -= 400;
                                    var4.Field10657 -= 25;
                                 } else if (var0 == 22643) {
                                    var4.Field10639 = "Christmas cape";
                                    var4.Field10641 = 65735;
                                    var4.Field10634 = var4.Field10662 = 65736;
                                    var4.Field10652 = new String[]{null, "Wear", null, null, "Drop"};
                                    var4.Field10661 += 1024;
                                    var4.Field10646 += 300;
                                    var4.Field10657 += 10;
                                 } else if (var0 == 22644) {
                                    var4.Field10639 = "Bandos armour set";
                                 } else if (var0 == 22646) {
                                    var4.Field10639 = "Armadyl armour set";
                                 } else if (var0 == 22648) {
                                    var4.Field10639 = "Battle robe armour set";
                                 } else if (var0 == 22650) {
                                    var4.Field10639 = "Guthix robe set";
                                 } else if (var0 == 22652) {
                                    var4.Field10639 = "Saradomin robe set";
                                 } else if (var0 == 22654) {
                                    var4.Field10639 = "Zamorak robe set";
                                 } else if (var0 == 22656) {
                                    var4.Field10639 = "Bandos robe set";
                                 } else if (var0 == 22658) {
                                    var4.Field10639 = "Ancient robe set";
                                 } else if (var0 == 22660) {
                                    var4.Field10639 = "Armadyl robe set";
                                 } else if (var0 == 22662) {
                                    var4.Field10639 = "Initiate armour set";
                                 } else if (var0 == 22664) {
                                    var4.Field10639 = "Scroll of double exp.";
                                    var4.Field10644 = "Grants 60 minutes of double experience upon activation.".getBytes();
                                    var4.Field10652 = new String[]{"Read", null, "Activate", null, "Destroy"};
                                    var4.Field10643 = true;
                                 } else if (var0 == 22789) {
                                    var4.Field10639 = "Red ranger boots";
                                    var4.Field10652 = new String[]{null, "Wear", null, null, "Drop"};
                                    var4.Field10622 = new int[]{15252, 17294, 15009};
                                    var4.Field10623 = new int[]{3988, 3982, 3745};
                                 } else if (var0 == 22790) {
                                    var4.Field10639 = "Yellow ranger boots";
                                    var4.Field10652 = new String[]{null, "Wear", null, null, "Drop"};
                                    var4.Field10622 = new int[]{15252, 17294, 15009};
                                    var4.Field10623 = new int[]{7973, 7730, 10015};
                                 } else if (var0 == 22791) {
                                    var4.Field10639 = "Blue ranger boots";
                                    var4.Field10652 = new String[]{null, "Wear", null, null, "Drop"};
                                    var4.Field10622 = new int[]{15252, 17294, 15009};
                                    var4.Field10623 = new int[]{35732, 37774, 35489};
                                 } else if (var0 == 22792) {
                                    var4.Field10639 = "White ranger boots";
                                    var4.Field10652 = new String[]{null, "Wear", null, null, "Drop"};
                                    var4.Field10622 = new int[]{15252, 17294, 15009};
                                    var4.Field10623 = new int[]{30847, 32895, 30847};
                                 } else if (var0 >= 22793 && var0 <= 22803) {
                                    var30 = new int[]{5672, 33, 43072, 8, 43279, 21662, 36133, 925, 10394, 6068, 33715};
                                    var15 = new int[]{10180, 10181, 10182, 10183, 10184, 10185, 10186, 10187, 10188, 10189, 10233};
                                    var27 = new String[]{"Bronze", "Iron", "Steel", "Black", "Mithril", "Adamant", "Rune", "Dragon", "Barrow", "Orange", "Cyan"};
                                    var4.Field10639 = var27[var0 - 22793] + " abyssal dye";
                                    var4.Field10623 = new int[]{var30[var0 - 22793]};
                                    var4.Field10644 = "Dyes an abyssal whip, staff or bow.".getBytes();
                                    var4.Field10645 = var15[var0 - 22793];
                                    var4.Field10632 = var4.Field10645;
                                    var4.Field10652 = null;
                                 } else {
                                    short var23;
                                    if (var0 >= 22811 && var0 < 22955) {
                                       var12 = (var0 - 22811) / 36;
                                       var23 = 128;
                                       var27 = new String[]{"barrow", "blood", "3rd-age", "shadow"};
                                       if (var12 == 2) {
                                          var23 = 96;
                                       }

                                       if (!var4.Method11913(var0, var12, var23, 0)) {
                                          return null;
                                       }

                                       var4.Field10639 = var4.Field10639 + " (" + var27[var12] + ")";
                                       var4.Field10652[4] = "Destroy";
                                       var4.Field10652[3] = "Check charges";
                                       if (var0 % 4 == 3) {
                                          var4.Field10652[2] = "Clean";
                                       }
                                    } else if (var0 == 22955) {
                                       var4.Field10652 = new String[]{null, null, null, null, "Drop"};
                                       var4.Field10639 = "Dye bottle";
                                    } else {
                                       String[] var20;
                                       int[] var28;
                                       if (var0 >= 22956 && var0 < 22960) {
                                          var12 = var0 - 22956;
                                          var20 = new String[]{"Barrow", "Blood", "Third-age", "Shadow"};
                                          var28 = new int[]{10368, 512, 1088, 0};
                                          var4.Field10639 = var20[var12] + " dye";
                                          var4.Field10652 = new String[]{null, null, null, null, "Drop"};
                                          var4.Field10623 = new int[]{var28[var12] + 20, var28[var12] + 25, var28[var12] + 30};
                                       } else if (var0 >= 22960 && var0 < 22964) {
                                          var12 = var0 - 22960;
                                          var20 = new String[]{"barrow", "blood", "3rd-age", "shadow"};
                                          var28 = new int[]{10368, 512, 1088, 0};
                                          var4.Field10639 = "Dye shard (" + var20[var12] + ")";
                                          var4.Field10652 = new String[]{null, null, null, null, "Drop"};
                                          var4.Field10656 = null;
                                          var4.Field10663 = null;
                                          var4.Field10622 = new int[]{7700, 8076};
                                          var4.Field10623 = new int[]{var28[var12] + 30, var28[var12] + 1024 + 30};
                                       } else if (var0 >= 22964 && var0 < 22969) {
                                          var29 = forID(var4.Field10626 - 9);
                                          var4.Field10639 = var29.Field10639;
                                          var4.Field10641 = var29.Field10641;
                                          var4.Field10622 = var29.Field10622;
                                          var4.Field10623 = var29.Field10623;
                                          var4.Field10632 = 799;
                                          var4.Field10645 = var29.Field10626;
                                          var4.Field10652 = new String[]{null, null, null, null, "Drop"};
                                          var4.Method11914();
                                       } else if (var0 >= 22969 && var0 < 23029) {
                                          int[] var10000 = new int[]{10251, 11724, 11726, 11728, 10250, 11718, 11720, 11722, 10248, 10249, 12866, 12873, 12880, 10252, 10253};
                                          var10000 = new int[]{10368, 512, 1088, 0};
                                          String[] var19 = new String[]{"barrow", "blood", "3rd-age", "shadow"};
                                          if (!var4.Method11913(var0, 3, 128, 0)) {
                                             return null;
                                          }

                                          var4.Field10639 = var4.Field10639 + " (" + var19[3] + ")";
                                          var4.Field10652[4] = "Destroy";
                                       } else if (var0 >= 23029 && var0 < 23033) {
                                          var12 = var0 - 23029;
                                          var23 = 128;
                                          var27 = new String[]{"barrow", "blood", "3rd-age", "shadow"};
                                          if (var12 == 2) {
                                             var23 = 96;
                                          }

                                          if (!var4.Method11913(var0, var12, var23, 0)) {
                                             return null;
                                          }

                                          var4.Field10639 = var4.Field10639 + " (" + var27[var12] + ")";
                                          var4.Field10652[4] = "Destroy";
                                          var4.Field10652[2] = "Clean";
                                       } else if (var0 >= 23033 && var0 < 23037) {
                                          var12 = var0 - 23033;
                                          var27 = new String[]{"barrow", "blood", "3rd-age", "shadow"};
                                          int[] var26 = new int[]{10368, 512, 1088, 0};
                                          if (!var4.Method11913(var0, var12, 128, 1)) {
                                             return null;
                                          }

                                          var4.Field10639 = var4.Field10639 + " (" + var27[var12] + ")";
                                          var4.Field10652[4] = "Destroy";
                                          var4.Field10652[2] = "Clean";
                                          var6 = Rasterizer.Field9964[var26[var12] + 36];
                                          var22 = ParticleDefinition.Method7792("max_cape_l", var6);
                                          var12 = ParticleDefinition.Method7792("max_cape_r", var6);
                                          var8 = ParticleDefinition.Method7792("max_cape_m", var6);
                                          var4.Field10621 = new int[][]{{350, var22}, {128, var22}, {398, var12}, {97, var12}, {112, var8}, {116, var8}, {107, var8}};
                                       } else if (var0 >= 23037 && var0 < 23041) {
                                          var12 = var0 - 23037;
                                          var23 = 128;
                                          var27 = new String[]{"barrow", "blood", "3rd-age", "shadow"};
                                          if (var12 == 2) {
                                             var23 = 96;
                                          }

                                          if (!var4.Method11913(var0, var12, var23, 1)) {
                                             return null;
                                          }

                                          var4.Field10639 = var4.Field10639 + " (" + var27[var12] + ")";
                                          var4.Field10652[4] = "Destroy";
                                          var4.Field10652[2] = "Clean";
                                       } else if (var0 == 23042) {
                                          var4.Field10639 = "Baby nex";
                                          var4.Field10644 = "One of Nex's children. Better be careful once it grows up.".getBytes();
                                          var4.Field10641 = 65751;
                                          var4.Field10646 -= 200;
                                          var4.Field10638 -= 10;
                                          var4.Field10657 += 14;
                                          var4.Field10661 += 256;
                                          var4.Field10652 = new String[]{"Release", null, null, null, "Destroy"};
                                       } else if (var0 == 23043) {
                                          var4.Field10639 = "Muncher";
                                          var4.Field10641 = 26262;
                                          var4.Field10646 = (int)((double)var4.Field10646 * 1.3D);
                                          var4.Field10661 += 256;
                                          var4.Field10652 = new String[]{"Release", null, null, null, "Destroy"};
                                       } else if (var0 >= 23044 && var0 <= 23047) {
                                          var12 = var0 - 23044;
                                          var20 = new String[]{"Green", "Blue", "Red", "Black"};
                                          var4.Field10639 = var20[var12] + " pet dragon";
                                          var4.Field10641 = 65749;
                                          var4.Field10644 = "A cute flying pet dragon.".getBytes();
                                          var4.Field10646 += 250;
                                          var4.Field10657 += 12;
                                          var4.Field10661 += 256;
                                          var4.Field10652 = new String[]{"Release", null, null, null, "Destroy"};
                                          var4.Field10659 = 0;
                                          var4.Field10649 = 0;
                                          var4.Field10622 = new int[]{6, 269, 1297, 1688, 1701, 8767, 9293, 31888, 31898, 32917, 34068, 36659, 36750, 36756, 36763, 36767, 36768, 36772, 36777, 36781, 36789};
                                          if (var12 == 0) {
                                             var4.Field10623 = new int[]{6, 269, 1297, 1688, 1701, 8767, 9293, 14988, 14998, 16017, 17168, 18739, 18830, 18836, 18843, 18847, 18848, 18852, 18857, 18861, 18869};
                                          } else if (var12 == 1) {
                                             var4.Field10623 = new int[]{6, 269, 1297, 1688, 1701, 8767, 9293, 38540, 38550, 39569, 40720, 42291, 42382, 42388, 42395, 42399, 42400, 42404, 42409, 42413, 42421};
                                          } else if (var12 == 2) {
                                             var4.Field10623 = new int[]{6, 269, 1297, 1688, 1701, 8767, 9293, 62626, 62636, 63655, 64806, 790, 918, 918, 918, 918, 918, 918, 918, 918, 918};
                                          } else if (var12 == 3) {
                                             var4.Field10623 = new int[]{6, 269, 1297, 1688, 1701, 8767, 9293, 5135, 5145, 6164, 7315, 8835, 8963, 8963, 8963, 8963, 8963, 8963, 8963, 8963, 8963};
                                          }

                                          for(var2 = 0; var2 < var4.Field10623.length; ++var2) {
                                             var4.Field10623[var2] &= 65535;
                                          }
                                       } else if (var0 >= 23059 && var0 <= 23063) {
                                          var4.Field10639 = "Barrow arrow";
                                          var4.Field10644 = "Smithed by the barrow brothers but never used in combat before.".getBytes();
                                          var4.Field10622 = new int[]{654, 788, 914, 918, 920, 922, 924, 929, 5409, 10429, 10434, 10452, 10456};
                                          var4.Field10623 = new int[]{10374, 10509, 914, 918, 920, 922, 924, 929, 10632, 10630, 10635, 10643, 10647};
                                          if (var0 == 23059) {
                                             var4.Field10656 = new int[]{var0 + 1, var0 + 2, var0 + 3, var0 + 4, 0, 0, 0, 0, 0, 0};
                                          }
                                       } else if (var0 >= 23064 && var0 <= 23068) {
                                          var4.Field10639 = "Ancient arrow";
                                          var4.Field10644 = "Ancient, old and fierce arrows smithed by Zaros.".getBytes();
                                          var4.Field10622 = new int[]{654, 788, 914, 918, 920, 922, 924, 929, 5409, 10429, 10434, 10452, 10456};
                                          var4.Field10623 = new int[]{54022, 54153, 914, 918, 920, 922, 924, 929, 54408, 54406, 54411, 54419, 54423};
                                          if (var0 == 23064) {
                                             var4.Field10656 = new int[]{var0 + 1, var0 + 2, var0 + 3, var0 + 4, 0, 0, 0, 0, 0, 0};
                                          }
                                       } else if (var0 >= 23069 && var0 <= 23073) {
                                          var4.Field10652[1] = null;
                                          var4.Field10639 = "Barrow arrowtips";
                                          var4.Field10644 = "Smithed by the barrow brothers but never used in combat before.".getBytes();
                                          var4.Field10622 = new int[]{654, 788, 914, 918, 920, 922, 924, 929, 5409, 10429, 10434, 10452, 10456};
                                          var4.Field10623 = new int[]{10374, 10509, 914, 918, 920, 922, 924, 929, 10632, 10630, 10635, 10643, 10647};
                                          if (var0 == 23069) {
                                             var4.Field10656 = new int[]{var0 + 1, var0 + 2, var0 + 3, var0 + 4, 0, 0, 0, 0, 0, 0};
                                          }
                                       } else if (var0 >= 23074 && var0 <= 23078) {
                                          var4.Field10652[1] = null;
                                          var4.Field10639 = "Ancient arrowtips";
                                          var4.Field10644 = "Ancient, old and fierce arrowtips smithed by Zaros.".getBytes();
                                          var4.Field10622 = new int[]{654, 788, 914, 918, 920, 922, 924, 929, 5409, 10429, 10434, 10452, 10456};
                                          var4.Field10623 = new int[]{54022, 54153, 914, 918, 920, 922, 924, 929, 54408, 54406, 54411, 54419, 54423};
                                          if (var0 == 23074) {
                                             var4.Field10656 = new int[]{var0 + 1, var0 + 2, var0 + 3, var0 + 4, 0, 0, 0, 0, 0, 0};
                                          }
                                       } else if (var0 >= 23079 && var0 <= 23083) {
                                          var4.Field10639 = "Barrow arrow (p)";
                                          var4.Field10644 = "Weakly poisoned Barrow arrows.".getBytes();
                                          var4.Field10622 = new int[]{654, 788, 914, 918, 920, 922, 924, 929, 5409, 10429, 10434, 10452, 10456};
                                          var4.Field10623 = new int[]{10374, 10509, 914, 918, 920, 922, 924, 929, 10632, 10630, 10635, Field10609, 10647};
                                          if (var0 == 23079) {
                                             var4.Field10656 = new int[]{var0 + 1, var0 + 2, var0 + 3, var0 + 4, 0, 0, 0, 0, 0, 0};
                                          }
                                       } else if (var0 >= 23084 && var0 <= 23088) {
                                          var4.Field10639 = "Ancient arrow (p)";
                                          var4.Field10644 = "Weakly poisoned Ancient arrows.".getBytes();
                                          var4.Field10622 = new int[]{654, 788, 914, 918, 920, 922, 924, 929, 5409, 10429, 10434, 10452, 10456};
                                          var4.Field10623 = new int[]{54022, 54153, 914, 918, 920, 922, 924, 929, 54408, 54406, 54411, Field10609, 54423};
                                          if (var0 == 23084) {
                                             var4.Field10656 = new int[]{var0 + 1, var0 + 2, var0 + 3, var0 + 4, 0, 0, 0, 0, 0, 0};
                                          }
                                       } else if (var0 >= 23089 && var0 <= 23093) {
                                          var4.Field10639 = "Barrow arrow (p++)";
                                          var4.Field10644 = "Weakly poisoned Barrow arrows.".getBytes();
                                          var4.Field10622 = new int[]{654, 788, 914, 918, 920, 922, 924, 929, 5409, 10429, 10434, 10452, 10456};
                                          var4.Field10623 = new int[]{10374, 10509, 914, 918, 920, 922, 924, 929, 10632, 10630, 10635, Field10610, 10647};
                                          if (var0 == 23089) {
                                             var4.Field10656 = new int[]{var0 + 1, var0 + 2, var0 + 3, var0 + 4, 0, 0, 0, 0, 0, 0};
                                          }
                                       } else if (var0 >= 23094 && var0 <= 23098) {
                                          var4.Field10639 = "Ancient arrow (p++)";
                                          var4.Field10644 = "Strongly poisoned Ancient arrows.".getBytes();
                                          var4.Field10622 = new int[]{654, 788, 914, 918, 920, 922, 924, 929, 5409, 10429, 10434, 10452, 10456};
                                          var4.Field10623 = new int[]{54022, 54153, 914, 918, 920, 922, 924, 929, 54408, 54406, 54411, Field10610, 54423};
                                          if (var0 == 23094) {
                                             var4.Field10656 = new int[]{var0 + 1, var0 + 2, var0 + 3, var0 + 4, 0, 0, 0, 0, 0, 0};
                                          }
                                       } else if (var0 >= 23099 && var0 <= 23103) {
                                          var4.Field10639 = "Dragon arrow (p)";
                                          var4.Field10644 = "Weakly poisoned Dragon arrows.".getBytes();
                                          var4.Field10622 = new int[]{10452};
                                          var4.Field10623 = new int[]{Field10609};
                                          if (var0 == 23099) {
                                             var4.Field10656 = new int[]{var0 + 1, var0 + 2, var0 + 3, var0 + 4, 0, 0, 0, 0, 0, 0};
                                          }
                                       } else if (var0 >= 23104 && var0 <= 23108) {
                                          var4.Field10639 = "Dragon arrow (p++)";
                                          var4.Field10644 = "Strongly poisoned Dragon arrows.".getBytes();
                                          var4.Field10622 = new int[]{10452};
                                          var4.Field10623 = new int[]{Field10610};
                                          if (var0 == 23099) {
                                             var4.Field10656 = new int[]{var0 + 1, var0 + 2, var0 + 3, var0 + 4, 0, 0, 0, 0, 0, 0};
                                          }
                                       } else {
                                          short var21;
                                          if (var0 >= 23109 && var0 <= 23129) {
                                             var4.Field10641 = 65752;
                                             var4.Field10634 = var4.Field10662 = 65753;
                                             var4.Field10646 += 310;
                                             var4.Field10657 += 16;
                                             var4.Field10638 -= 2;
                                             var4.Field10644 = "You can feel the power of Har'Lakk in this longbow.".getBytes();
                                             if ((var12 = (var0 - 1) % 4) == 1) {
                                                var4.Field10632 = 799;
                                                var4.Field10645 = var0 - 1;
                                                var4.Method11914();
                                             } else if (var12 == 2) {
                                                var4.Field10652[4] = "Destroy";
                                             }

                                             if (var12 == 0 || var12 == 2) {
                                                var4.Field10652[3] = "Check-charges";
                                             }

                                             if (var0 >= 23113) {
                                                if (var12 == 0) {
                                                   var4.Field10652[2] = "Clean";
                                                }

                                                var16 = ((var0 - 1) / 4 - 2) % 4;
                                                var27 = new String[]{"barrow", "blood", "3rd-age", "shadow"};
                                                var4.Field10639 = "Demon longbow (" + var27[var16] + ")";
                                                var4.Field10652[4] = "Destroy";
                                                var21 = 128;
                                                if (var16 == 2) {
                                                   var21 = 96;
                                                }

                                                if (var12 != 1 && !var4.Method11913(var0, var16, var21, 2)) {
                                                   return null;
                                                }
                                             } else {
                                                var4.Field10639 = "Demon longbow";
                                             }

                                             if (var12 == 3) {
                                                var4.Field10639 = var4.Field10639 + " (broken)";
                                             }
                                          } else if (var0 >= 23130 && var0 <= 23149) {
                                             var4.Field10641 = 65755;
                                             var4.Field10634 = var4.Field10662 = 65756;
                                             var4.Field10646 = 1200;
                                             var4.Field10661 += 512;
                                             var4.Field10653 -= 32;
                                             var4.Field10644 = "You can feel the power of Har'Lakk in this crossbow.".getBytes();
                                             if ((var12 = (var0 - 2) % 4) == 1) {
                                                var4.Field10632 = 799;
                                                var4.Field10645 = var0 - 1;
                                                var4.Method11914();
                                             } else if (var12 == 2) {
                                                var4.Field10652[4] = "Destroy";
                                             }

                                             if (var12 == 0 || var12 == 2) {
                                                var4.Field10652[3] = "Check-charges";
                                             }

                                             if (var0 >= 23134) {
                                                if (var12 == 0) {
                                                   var4.Field10652[2] = "Clean";
                                                }

                                                var16 = (var0 + 2) / 4 % 4;
                                                var27 = new String[]{"barrow", "blood", "3rd-age", "shadow"};
                                                var4.Field10639 = "Demon c'bow (" + var27[var16] + ")";
                                                var4.Field10652[4] = "Destroy";
                                                var21 = 128;
                                                if (var16 == 2) {
                                                   var21 = 96;
                                                }

                                                if (var12 != 1 && !var4.Method11913(var0, var16, var21, 2)) {
                                                   return null;
                                                }
                                             } else {
                                                var4.Field10639 = "Demon c'bow";
                                             }

                                             if (var12 == 3) {
                                                var4.Field10639 = var4.Field10639 + " (broken)";
                                             }
                                          } else if (var0 >= 23150 && var0 <= 23154) {
                                             var4.Field10639 = "Ancient bolts";
                                             var4.Field10622 = new int[]{5532, 5537, 5652, 5656, 10334, 17971};
                                             var4.Field10623 = new int[]{54026, 54031, 54022, 54026, 10334, 54028};
                                             if (var0 == 23150) {
                                                var4.Field10656 = new int[]{var0 + 1, var0 + 2, var0 + 3, var0 + 4, 0, 0, 0, 0, 0, 0};
                                             }
                                          } else if (var0 >= 23155 && var0 <= 23159) {
                                             var4.Field10652[1] = null;
                                             var4.Field10639 = "Ancient bolts (unf)";
                                             var4.Field10622 = new int[]{5532, 5537, 5652, 5656, 10334, 17971};
                                             var4.Field10623 = new int[]{54026, 54031, 54022, 54026, 10334, 54028};
                                             if (var0 == 23155) {
                                                var4.Field10656 = new int[]{var0 + 1, var0 + 2, var0 + 3, var0 + 4, 0, 0, 0, 0, 0, 0};
                                             }
                                          }
                                       }
                                    }
                                 }
                              }
                           } else {
                              var4.Field10652 = new String[5];
                              var4.Field10652[0] = "Release";
                           }
                        } else {
                           var4.Field10652[0] = "Release";
                           if (var0 == 21512) {
                              var4.Field10646 += 256;
                           }
                        }
                     } else {
                        var4.Field10652 = new String[]{null, "Wear", null, "Disassemble", "Drop"};
                     }
                  } else {
                     var4.Field10652 = new String[]{"Read", null, null, null, "Destroy"};
                  }
               } else if (var4.Field10639 != null) {
                  var4.Field10639 = var4.Field10639.replace(" 100", "").replace("Battle hood", "Battle robe hood");
               }

               if (var0 == 6570) {
                  var4.Field10624 = null;
               }

               return var4;
            }
         }
      } else {
         return null;
      }
   }

   private boolean Method11913(int var1, int var2, int var3, int var4) {
      if (!Field10612) {
         return true;
      } else {
         if (this.Method11925()) {
            int var5 = this.Field10645;
            ItemDef var10;
            if ((var10 = Method11912(this.Field10645, true)) == null) {
               return false;
            }

            this.Field10623 = var10.Field10623;
            this.Field10622 = var10.Field10622;
            this.Field10618 = true;
         }

         int[] var11 = new int[]{10368, 512, 1088, 0};
         String[] var10000 = new String[]{"barrow", "blood", "3rd-age", "shadow"};
         if (!this.Field10618) {
            this.Field10622 = null;
            this.Field10618 = true;
         }

         int var19;
         if (this.Field10622 == null) {
            List var6 = null;
            Model var7;
            Model var8;
            Model var9;
            List var12;
            Integer var14;
            List var15;
            Iterator var17;
            if (this.Field10651 > 0) {
               var7 = Model.Method14476(this.Field10634, true, false);
               var8 = Model.Method14476(this.Field10651, true, false);
               var9 = Model.Method14476(this.Field10641, true, false);
               if (var7 != null && var8 != null && var9 != null) {
                  var6 = var7.Method14505();
                  var12 = var8.Method14505();
                  var15 = var9.Method14505();
                  var17 = var12.iterator();

                  while(var17.hasNext()) {
                     var14 = (Integer)var17.next();
                     if (!var6.contains(var14)) {
                        var6.add(var14);
                     }
                  }

                  var17 = var15.iterator();

                  while(var17.hasNext()) {
                     var14 = (Integer)var17.next();
                     if (!var6.contains(var14)) {
                        var6.add(var14);
                     }
                  }
               }
            } else if (this.genderZeroOffset <= 0) {
               var7 = Model.Method14476(this.Field10634, true, false);
               var8 = Model.Method14476(this.Field10641, true, false);
               if (var7 != null && var8 != null) {
                  var6 = var7.Method14505();
                  Iterator var16 = var8.Method14505().iterator();

                  while(var16.hasNext()) {
                     var14 = (Integer)var16.next();
                     if (!var6.contains(var14)) {
                        var6.add(var14);
                     }
                  }
               }
            } else {
               var7 = Model.Method14476(this.Field10634, true, false);
               var8 = Model.Method14476(this.genderZeroOffset, true, false);
               var9 = Model.Method14476(this.Field10641, true, false);
               if (var7 != null && var8 != null && var9 != null) {
                  var6 = var7.Method14505();
                  var12 = var8.Method14505();
                  var15 = var9.Method14505();
                  var17 = var12.iterator();

                  while(var17.hasNext()) {
                     var14 = (Integer)var17.next();
                     if (!var6.contains(var14)) {
                        var6.add(var14);
                     }
                  }

                  var17 = var15.iterator();

                  while(var17.hasNext()) {
                     var14 = (Integer)var17.next();
                     if (!var6.contains(var14)) {
                        var6.add(var14);
                     }
                  }
               }
            }

            if (var6 != null) {
               this.Field10622 = new int[var6.size()];

               for(var19 = 0; var19 < var6.size(); ++var19) {
                  this.Field10622[var19] = (Integer)var6.get(var19);
               }
            }
         }

         if (this.Field10622 == null) {
            Field10607.Method1511(var1);
            return false;
         } else {
            this.Field10623 = new int[this.Field10622.length];

            for(int var13 = 0; var13 < this.Field10623.length; ++var13) {
               var19 = this.Field10622[var13];
               int var18 = var11[var2];
               int var20 = var19 % var3;
               switch(var4) {
               case 0:
                  if (var2 == 2 && var20 > 80) {
                     this.Field10623[var13] = 1 + var20 / 16;
                  } else if (var2 == 1 && var20 > 46) {
                     this.Field10623[var13] = 1 + var20 / 8;
                  } else if (var2 == 3 && var20 > 60) {
                     this.Field10623[var13] = 1 + var20 / 64;
                  } else {
                     this.Field10623[var13] = var18 + var20;
                  }
                  break;
               case 1:
                  if (var2 == 2 && var20 > 47 && var20 != 62) {
                     this.Field10623[var13] = 1 + var20 / 6;
                  } else if (var2 == 1 && var20 > 48 && var20 != 62) {
                     this.Field10623[var13] = 1 + var20 / 8;
                  } else if (var2 == 3 && var20 > 60) {
                     this.Field10623[var13] = 1 + var20 / 8;
                  } else if (var2 == 0) {
                     this.Field10623[var13] = var18 + Math.round((float)(var20 * var20) / 64.0F);
                  } else {
                     this.Field10623[var13] = var18 + var20;
                  }
                  break;
               case 2:
                  if (var19 == 3139) {
                     this.Field10623[var13] = var19;
                     continue;
                  }

                  if (var2 == 2 && var20 > 47) {
                     this.Field10623[var13] = (var19 + var18) % var3 / 12;
                  } else if (var2 == 1) {
                     this.Field10623[var13] = var20 <= 47 && var20 != 35 ? Math.round((float)var18 + (float)var20 * 0.9F) : Math.round((float)var20 * 0.125F);
                  } else if (var2 == 3 && var20 > 48) {
                     this.Field10623[var13] = 1 + var20 / 8;
                  } else if (var2 == 0 && var20 > 48) {
                     this.Field10623[var13] = 34 + Math.round((float)var18 * 1.01F);
                  } else {
                     this.Field10623[var13] = var18 + var20;
                  }
                  break;
               case 3:
                  var19 = var19 / var3 * var3;
                  var20 = (int)Math.sqrt((double)((float)(var20 * var20) * 0.35F));
                  this.Field10623[var13] = var19 + var20;
               }

               if (this.Field10622[var13] == 4540 || this.Field10622[var13] == 6798 || this.Field10622[var13] == 4550 || this.Field10622[var13] == 9104 || this.Field10622[var13] == 85 || this.Field10622[var13] == 6300 || this.Field10622[var13] == 5 || this.Field10622[var13] == 10326 || this.Field10622[var13] == 38015 || this.Field10622[var13] == 6469) {
                  this.Field10623[var13] = this.Field10622[var13];
               }
            }

            return true;
         }
      }
   }

   private void Method11914() {
      int var1 = this.Field10632;
      ItemDef var4;
      if ((var4 = Method11912(this.Field10632, true)) != null) {
         this.Field10641 = var4.Field10641;
         this.Field10646 = var4.Field10646;
         this.Field10653 = var4.Field10653;
         this.Field10661 = var4.Field10661;
         this.Field10666 = var4.Field10666;
         this.Field10638 = var4.Field10638;
         this.Field10657 = var4.Field10657;
         this.Field10622 = var4.Field10622;
         this.Field10623 = var4.Field10623;
         var1 = this.Field10645;
         if ((var4 = Method11912(this.Field10645, true)) != null) {
            this.Field10639 = var4.Field10639;
            this.Field10630 = var4.Field10630;
            this.Field10620 = var4.Field10620;
            String var2 = "a";
            char var3 = ' ';
            if (var4.Field10639 != null) {
               var3 = var4.Field10639.charAt(0);
            }

            if (var3 == 'A' || var3 == 'E' || var3 == 'I' || var3 == 'O' || var3 == 'U') {
               var2 = "an";
            }

            this.Field10644 = ("Swap this note at any bank for " + var2 + " " + var4.Field10639 + ".").getBytes();
            this.Field10643 = true;
         }
      }
   }

   public static RgbImage Method11915(int var0, int var1, boolean var2) {
      return Method11917(var0, 0, 0, Model.Field2798, var1, var2);
   }

   public static RgbImage Method11916(int var0, int var1) {
      return Method11917(var0, 0, 0, Model.Field2798, 48, true);
   }

   private static RgbImage Method11917(int var0, int var1, int var2, int var3, int var4, boolean var5) {
      return Method11919(var0, var1, var2, var3, 0, 0, var4, var5);
   }

   public static RgbImage Method11918(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      return Method11919(var0, var1, var2, var3, var4, var5, var8, true);
   }

   private static RgbImage Method11919(int var0, int var1, int var2, int var3, int var4, int var5, int var6, boolean var7) {
      ItemDef var8;
      if ((var8 = Method11912(var0, true)) == null) {
         return null;
      } else {
         if (var8.Field10656 == null) {
            var1 = -1;
         }

         if (var1 > 0) {
            int var9 = -1;

            for(int var10 = 0; var10 < var8.Field10656.length; ++var10) {
               if (var1 >= var8.Field10663[var10] && var8.Field10663[var10] != 0) {
                  var9 = var8.Field10656[var10];
               }
            }

            if (var9 != -1) {
               var8 = Method11912(var9, true);
               var0 = var9;
            }
         }

         long var28 = Client.Method13218("item-" + var0 + "-" + var6);
         long var11 = (long)var0 + (long)var6 << 40;
         RgbImage var13;
         if (var2 <= 0 && var7 && (var13 = (RgbImage)Field10627.Method1837(var11)) != null) {
            var13.Field9878 = var28;
            var13.Method14494(var0, var6);
            return var13;
         } else {
            boolean var29 = true;
            Model var30;
            if ((var30 = var8.Method11920(1, true)) == null) {
               return null;
            } else {
               RgbImage var14 = null;
               if (var8.Field10632 != -1 && (var14 = Method11917(var8.Field10645, 10, -1, var3, var6, false)) == null) {
                  return null;
               } else {
                  int var16;
                  if (var8.Field10632 != -1 && var14 != null) {
                     int var15 = var14.Field9898;
                     var16 = var14.Field9899;
                     var14.Field9898 = var6;
                     var14.Field9899 = var6;
                     if (!GraphicsDisplay.Field2678) {
                        var14.Method14495(var4, var5);
                     }

                     var14.Field9898 = var15;
                     var14.Field9899 = var16;
                  }

                  RgbImage var32 = new RgbImage(var6, var6);
                  var16 = Rasterizer.Field9955;
                  var4 = Rasterizer.Field9956;
                  int[] var27 = Rasterizer.Field9961;
                  int[] var17 = Class697.Field8760;
                  int var18 = Class697.Field8761;
                  int var19 = Class697.Field8762;
                  int var20 = Class697.Field8765;
                  int var21 = Class697.Field8766;
                  int var22 = Class697.Field8763;
                  int var23 = Class697.Field8764;
                  Rasterizer.Field9954 = false;
                  Class697.Method11982(var6, var6, var32.Field9893);
                  Class697.Method14521(var6, 0, 0, 0, var6);
                  Rasterizer.Method9424();
                  int var24;
                  if (var6 < 32) {
                     var24 = Math.round((float)var8.Field10646 * (32.0F / (float)var6));
                  } else {
                     var24 = Math.round((float)var8.Field10646);
                  }

                  if (var2 == -1) {
                     var24 = (int)((double)var24 * 1.5D);
                  }

                  if (var2 > 0) {
                     var24 = (int)((double)var24 * 1.04D);
                  }

                  int var25 = Rasterizer.Field9959[var8.Field10653] * var24 >> 16;
                  var24 = Rasterizer.Field9960[var8.Field10653] * var24 >> 16;
                  float var26 = 1.0F;
                  if (var6 > 48) {
                     var26 = -1024.0F;
                  }

                  float var33 = (float)var25 + (float)var30.Field10127 / 2.0F + var26 + (float)var8.Field10657;
                  var30.Method14510(Rasterizer.Field9955, Rasterizer.Field9956, var8.Field10661, var8.Field10666, var8.Field10653, var8.Field10638, (int)var33, var24 + var8.Field10657, var3, 0L, false, false, false, true);
                  if (var0 == 23045) {
                     Arrays.sort(var30.Method14505().toArray());
                  }

                  int var31;
                  for(var3 = var6 - 1; var3 >= 0; --var3) {
                     for(var31 = var6 - 1; var31 >= 0; --var31) {
                        if (var32.Field9893[var3 + var31 * var6] == 0) {
                           if (var3 > 0 && var32.Field9893[var3 - 1 + var31 * var6] > 1) {
                              var32.Field9893[var3 + var31 * var6] = 1;
                           } else if (var31 > 0 && var32.Field9893[var3 + (var31 - 1) * var6] > 1) {
                              var32.Field9893[var3 + var31 * var6] = 1;
                           } else if (var3 < var6 - 1 && var32.Field9893[var3 + 1 + var31 * var6] > 1) {
                              var32.Field9893[var3 + var31 * var6] = 1;
                           } else if (var31 < var6 - 1 && var32.Field9893[var3 + (var31 + 1) * var6] > 1) {
                              var32.Field9893[var3 + var31 * var6] = 1;
                           }
                        }
                     }
                  }

                  if (var2 > 0) {
                     for(var3 = var6 - 1; var3 >= 0; --var3) {
                        for(var31 = var6 - 1; var31 >= 0; --var31) {
                           if (var32.Field9893[var3 + var31 * var6] == 0) {
                              if (var3 > 0 && var32.Field9893[var3 - 1 + var31 * var6] == 1) {
                                 var32.Field9893[var3 + var31 * var6] = var2;
                              } else if (var31 > 0 && var32.Field9893[var3 + (var31 - 1) * var6] == 1) {
                                 var32.Field9893[var3 + var31 * var6] = var2;
                              } else if (var3 < var6 - 1 && var32.Field9893[var3 + 1 + var31 * var6] == 1) {
                                 var32.Field9893[var3 + var31 * var6] = var2;
                              } else if (var31 < var6 - 1 && var32.Field9893[var3 + (var31 + 1) * var6] == 1) {
                                 var32.Field9893[var3 + var31 * var6] = var2;
                              }
                           }
                        }
                     }
                  } else if (var2 == 0) {
                     for(var3 = var6 - 1; var3 >= 0; --var3) {
                        for(var31 = var6 - 1; var31 >= 0; --var31) {
                           if (var32.Field9893[var3 + var31 * var6] == 0 && var3 > 0 && var31 > 0 && var32.Field9893[var3 - 1 + (var31 - 1) * var6] > 0) {
                              var32.Field9893[var3 + var31 * var6] = 3153952;
                           }
                        }
                     }
                  }

                  if (var2 <= 0 && var7) {
                     Field10627.Method1838(var32, var11);
                  }

                  Class697.Method11982(var19, var18, var17);
                  Class697.Method11985(var23, var20, var21, var22);
                  Rasterizer.Field9955 = var16;
                  Rasterizer.Field9956 = var4;
                  Rasterizer.Field9961 = var27;
                  Rasterizer.Field9954 = true;
                  if (var8.Field10643) {
                     var32.Field9898 = var6 + 1;
                  } else {
                     var32.Field9898 = var6;
                  }

                  var32.Field9899 = var1;
                  if (var14 != null) {
                     var32.Method882(var14);
                  }

                  var32.Field9895 = var32.Field9894 = var6;
                  var32.Field9878 = var28;
                  var32.Method14494(var0, var6);
                  return var32;
               }
            }
         }
      }
   }

   public final Model Method11920(int var1, boolean var2) {
      while(true) {
         Class175 var3 = var2 ? Field10628 : Field10629;
         int var5;
         if (this.Field10656 != null && var1 > 0) {
            int var4 = -1;

            for(var5 = 0; var5 < 10; ++var5) {
               if (var5 < this.Field10663.length && var1 >= this.Field10663[var5] && this.Field10663[var5] != 0) {
                  var4 = this.Field10656[var5];
               }
            }

            if (var4 != -1) {
               ItemDef var9 = Method11912(var4, true);
               var1 = 1;
               this = var9;
               continue;
            }
         }

         Model var7;
         if ((var7 = (Model)var3.Method1837((long)this.Field10626)) != null) {
            var7.Field2745 = false;
            return var7;
         }

         if ((var7 = Model.Method14476(this.Field10641, true, true)) == null) {
            return null;
         }

         if (!var7.Field2758) {
            Iterator var6 = var7.Method14448().iterator();

            while(var6.hasNext()) {
               Integer var8;
               if (var8 = (Integer)var6.next() > 0) {
                  Rasterizer.Field9963[var8] = true;
                  if (Rasterizer.Method9429(var8) == null) {
                     return null;
                  }
               }
            }
         }

         var7.Field2745 = false;
         if (this.Field10636 != 128 || this.Field10655 != 128 || this.Field10654 != 128) {
            var7.Method14501((float)this.Field10636, (float)this.Field10654, (float)this.Field10655);
         }

         if (this.Field10622 != null && this.Field10623 != null) {
            for(var5 = 0; var5 < this.Field10622.length; ++var5) {
               var7.recolor(this.Field10622[var5], this.Field10623[var5]);
            }
         }

         boolean var10000 = Client.normalMem;
         var7.Method14502(64 + this.Field10659, 768 + this.Field10649, -50, -10, -50, true);
         var7.Field2855 = true;
         var3.Method1838(var7, (long)this.Field10626);
         return var7;
      }
   }

   public final Model Method11921(int var1) {
      while(true) {
         int var3;
         if (this.Field10656 != null && var1 > 1) {
            int var2 = -1;

            for(var3 = 0; var3 < 10; ++var3) {
               if (var1 >= this.Field10663[var3] && this.Field10663[var3] != 0) {
                  var2 = this.Field10656[var3];
               }
            }

            if (var2 != -1) {
               ItemDef var10000 = Method11912(var2, true);
               var1 = 1;
               this = var10000;
               continue;
            }
         }

         Model var4;
         if ((var4 = Model.Method14476(this.Field10641, true, true)) == null) {
            return null;
         }

         if (this.Field10622 != null) {
            for(var3 = 0; var3 < this.Field10622.length; ++var3) {
               var4.recolor(this.Field10622[var3], this.Field10623[var3]);
            }
         }

         return var4;
      }
   }

   public static void Method11922() {
      BufferedWriter var0 = new BufferedWriter(new FileWriter(new File(System.getProperty("user.home") + "/Desktop/items.txt")));

      for(int var1 = 0; var1 < Field10665; ++var1) {
         ItemDef var2;
         if ((var2 = Method11912(var1, true)) != null) {
            var0.write(var1 + "\t" + var2.Field10639 + "\t\t\t" + (var2.Field10644 == null ? "-" : new String(var2.Field10644)) + "\n");
         }
      }

      var0.flush();
      var0.close();
   }

   private void Method11923(Packet var1) {
      byte var2 = -1;
      int var3 = 0;
      int var10000 = var1.pos;

      try {
         while(true) {
            int var7 = var1.g1();
            var10000 = var1.pos;
            ++var3;
            if (var7 == 0 || var7 == 255) {
               break;
            }

            if (var7 == 1) {
               this.Field10641 = var1.g2();
            } else if (var7 == 2) {
               this.Field10639 = var1.Method406();
            } else if (var7 == 3) {
               this.Field10644 = var1.Method407();
            } else if (var7 == 4) {
               this.Field10646 = var1.g2();
            } else if (var7 == 5) {
               this.Field10653 = var1.g2();
            } else if (var7 == 6) {
               this.Field10661 = var1.g2();
            } else if (var7 == 7) {
               this.Field10638 = var1.g2();
               if (this.Field10638 > 32767) {
                  this.Field10638 -= 65536;
               }
            } else if (var7 == 8) {
               this.Field10657 = var1.g2();
               if (this.Field10657 > 32767) {
                  this.Field10657 -= 65536;
               }
            } else if (var7 == 10) {
               var1.g2();
            } else if (var7 == 11) {
               this.Field10643 = true;
            } else if (var7 == 12) {
               this.Field10620 = var1.Method404();
            } else if (var7 == 16) {
               this.Field10630 = true;
            } else if (var7 == 23) {
               this.Field10634 = var1.g2();
               this.Field10667 = var1.Method400();
            } else if (var7 == 24) {
               this.Field10651 = var1.g2();
            } else if (var7 == 25) {
               this.Field10662 = var1.g2();
               this.Field10619 = var1.Method400();
            } else if (var7 == 26) {
               this.Field10633 = var1.g2();
            } else if (var7 >= 30 && var7 < 35) {
               if (this.Field10637 == null) {
                  this.Field10637 = new String[5];
               }

               this.Field10637[var7 - 30] = var1.Method406();
               if (this.Field10637[var7 - 30].equalsIgnoreCase("hidden")) {
                  this.Field10637[var7 - 30] = null;
               }
            } else if (var7 >= 35 && var7 < 40) {
               if (this.Field10652 == null) {
                  this.Field10652 = new String[5];
               }

               this.Field10652[var7 - 35] = var1.Method406();
            } else if (var7 == 40) {
               int var4 = var1.g1();
               this.Field10622 = new int[var4];
               this.Field10623 = new int[var4];

               for(int var5 = 0; var5 < var4; ++var5) {
                  this.Field10622[var5] = var1.g2();
                  this.Field10623[var5] = var1.g2();
               }
            } else if (var7 == 78) {
               this.Field10650 = var1.g2();
            } else if (var7 == 79) {
               this.Field10631 = var1.g2();
            } else if (var7 == 90) {
               this.genderZeroOffset = var1.g2();
            } else if (var7 == 91) {
               this.genderOneOffset = var1.g2();
            } else if (var7 == 92) {
               this.genderZeroOffset2 = var1.g2();
            } else if (var7 == 93) {
               this.genderOneOffset2 = var1.g2();
            } else if (var7 == 95) {
               this.Field10666 = var1.g2();
            } else if (var7 == 97) {
               this.Field10645 = var1.g2();
               if (this.Field10645 == 65535) {
                  this.Field10645 = -1;
               }
            } else if (var7 == 98) {
               this.Field10632 = var1.g2();
               if (this.Field10632 == 65535) {
                  this.Field10632 = -1;
               }
            } else if (var7 >= 100 && var7 < 110) {
               if (this.Field10656 == null) {
                  this.Field10656 = new int[10];
                  this.Field10663 = new int[10];
               }

               this.Field10656[var7 - 100] = var1.g2();
               this.Field10663[var7 - 100] = var1.g2();
            } else if (var7 == 110) {
               this.Field10636 = var1.g2();
            } else if (var7 == 111) {
               this.Field10655 = var1.g2();
            } else if (var7 == 112) {
               this.Field10654 = var1.g2();
            } else if (var7 == 113) {
               this.Field10659 = var1.Method400();
            } else if (var7 == 114) {
               this.Field10649 = var1.Method400() * 5;
            } else if (var7 == 115) {
               this.Field10664 = var1.g1();
            } else if (var7 == 121) {
               var1.g2();
            } else {
               if (var7 != 122) {
                  System.err.println("[ItemDef-" + this.Field10626 + "]: radValues() invalid config: " + var7);
                  return;
               }

               this.Field10668 = var1.g2();
            }
         }
      } catch (Exception var6) {
         System.err.println("[ItemDef-" + this.Field10626 + "]: radValues() error, config: " + var2 + ", " + var3 + ", stream: " + var1.pos + "/" + var1.Field1259.length);
         var6.printStackTrace();
      }

   }

   private void Method11924(Packet var1) {
      int var2;
      while((var2 = var1.g1()) != 0) {
         if (var2 == 1) {
            this.Field10641 = var1.g2();
         } else if (var2 == 2) {
            this.Field10639 = var1.Method406();
         } else if (var2 == 3) {
            this.Field10644 = var1.Method407();
         } else if (var2 == 4) {
            this.Field10646 = var1.g2();
         } else if (var2 == 5) {
            this.Field10653 = var1.g2();
         } else if (var2 == 6) {
            this.Field10661 = var1.g2();
         } else if (var2 == 7) {
            this.Field10638 = var1.g2();
            if (this.Field10638 > 32767) {
               this.Field10638 -= 65536;
            }
         } else if (var2 == 8) {
            this.Field10657 = var1.g2();
            if (this.Field10657 > 32767) {
               this.Field10657 -= 65536;
            }
         } else if (var2 == 10) {
            var1.g2();
         } else if (var2 == 11) {
            this.Field10643 = true;
         } else if (var2 == 12) {
            this.Field10620 = var1.Method404();
         } else if (var2 == 16) {
            this.Field10630 = true;
         } else if (var2 == 23) {
            this.Field10634 = var1.g2();
            this.Field10667 = var1.Method400();
         } else if (var2 == 24) {
            this.Field10651 = var1.g2();
         } else if (var2 == 25) {
            this.Field10662 = var1.g2();
            this.Field10619 = var1.Method400();
         } else if (var2 == 26) {
            this.Field10633 = var1.g2();
         } else if (var2 >= 30 && var2 < 35) {
            if (this.Field10637 == null) {
               this.Field10637 = new String[5];
            }

            this.Field10637[var2 - 30] = var1.Method406();
            if (this.Field10637[var2 - 30].equalsIgnoreCase("hidden")) {
               this.Field10637[var2 - 30] = null;
            }
         } else if (var2 >= 35 && var2 < 40) {
            if (this.Field10652 == null) {
               this.Field10652 = new String[5];
            }

            this.Field10652[var2 - 35] = var1.Method406();
         } else if (var2 == 40) {
            var2 = var1.g1();
            this.Field10622 = new int[var2];
            this.Field10623 = new int[var2];

            for(int var3 = 0; var3 < var2; ++var3) {
               this.Field10623[var3] = var1.g2();
               this.Field10622[var3] = var1.g2();
            }
         } else if (var2 == 78) {
            this.Field10650 = var1.g2();
         } else if (var2 == 79) {
            this.Field10631 = var1.g2();
         } else if (var2 == 90) {
            this.genderZeroOffset = var1.g2();
         } else if (var2 == 91) {
            this.genderOneOffset = var1.g2();
         } else if (var2 == 92) {
            this.genderZeroOffset2 = var1.g2();
         } else if (var2 == 93) {
            this.genderOneOffset2 = var1.g2();
         } else if (var2 == 95) {
            this.Field10666 = var1.g2();
         } else if (var2 == 97) {
            this.Field10645 = var1.g2();
         } else if (var2 == 98) {
            this.Field10632 = var1.g2();
         } else if (var2 >= 100 && var2 < 110) {
            if (this.Field10656 == null) {
               this.Field10656 = new int[10];
               this.Field10663 = new int[10];
            }

            this.Field10656[var2 - 100] = var1.g2();
            this.Field10663[var2 - 100] = var1.g2();
         } else if (var2 == 110) {
            this.Field10636 = var1.g2();
         } else if (var2 == 111) {
            this.Field10655 = var1.g2();
         } else if (var2 == 112) {
            this.Field10654 = var1.g2();
         } else if (var2 == 113) {
            this.Field10659 = var1.Method400();
         } else if (var2 == 114) {
            this.Field10649 = var1.Method400() * 5;
         } else if (var2 == 115) {
            this.Field10664 = var1.g1();
         } else if (var2 == 121) {
            var1.g2();
         } else if (var2 == 122) {
            this.Field10668 = var1.g2();
         }
      }

   }

   public final boolean Method11925() {
      return this.Field10632 > 0 && this.Field10645 > 0;
   }

   public static void Method11926() {
      Method11927(20135, 20170);
      Method11927(22811, 23040);
   }

   public static void Method11927(int var0, int var1) {
      String var2 = System.getProperty("user.home") + "/Desktop/";
      String var3 = "item_names";
      OutputStream var4 = null;

      try {
         (var4 = Files.newOutputStream(Paths.get(var2 + var3 + ".sql"))).write("USE emps;\n".getBytes());
      } catch (IOException var8) {
         var8.printStackTrace();

         try {
            var4.close();
            return;
         } catch (IOException var5) {
            var5.printStackTrace();
            return;
         }
      }

      if (var1 > Field10665) {
         var1 = Field10665;
      }

      for(var0 = var0; var0 <= var1; ++var0) {
         try {
            ItemDef var9;
            if ((var9 = Method11912(var0, true)) != null) {
               var2 = Class23.Method207(var9.Field10639);
               var2 = "REPLACE INTO `item_names` (id, name) VALUES (" + var0 + ", \"" + var2 + "\");";
               System.out.println(var2);
               var4.write((var2 + "\n").getBytes());
            }
         } catch (Exception var7) {
            var7.printStackTrace();
         }
      }

      try {
         var4.close();
      } catch (IOException var6) {
         var6.printStackTrace();
      }
   }

   public static boolean Method11928(int var0, boolean var1) {
      String var9 = System.getProperty("user.home") + "/Desktop/";
      if (Field10669 == null) {
         Field10674 = 0;
         Field10627.Method1839();
         Field10670 = (Field10669 = new BufferedImage(32, 32000, 2)).getGraphics();
         Field10671 = new BufferedImage(32, 32, 2);
      }

      int var10 = Field10672;

      while(true) {
         label85: {
            if (var10 < Field10665) {
               try {
                  if (Method11912(var10, true) == null) {
                     break label85;
                  }

                  RgbImage var2;
                  int var4;
                  if ((var2 = Method11915(var10, 48, true)) == null) {
                     for(var4 = 1; var4 <= 256; ++var4) {
                        Method11915(var10 + var4, 48, true);
                     }

                     return false;
                  }

                  int var3;
                  int var5;
                  for(var3 = 8; var3 < 40; ++var3) {
                     for(var4 = 8; var4 < 40; ++var4) {
                        if ((var5 = var2.Field9893[var4 * 48 + var3]) == 0) {
                           Field10671.setRGB(var3 - 8, var4 - 8, 0);
                        } else {
                           Field10671.setRGB(var3 - 8, var4 - 8, -16777216 | var5);
                        }
                     }
                  }

                  var3 = var10 - Field10673 * 1000;
                  Field10670.drawImage(Field10671, 0, var3 << 5, (ImageObserver)null);
                  ++Field10674;
                  if ((var4 = var10 / 1000) == Field10673) {
                     break label85;
                  }

                  var5 = Field10673;
                  System.out.println("[ItemDef] ItemIconDump: " + var5 + " finished, written: " + Field10674 + "/1000" + ", " + var10 + ", " + Field10672 + ", " + var4 + "/" + Field10673);
                  OutputStream var12 = Files.newOutputStream(Paths.get(var9 + "icons_atlas/" + var5 + ".png"));
                  ImageIO.write(Field10669, "PNG", var12);
                  var12.close();
                  Field10670 = (Field10669 = new BufferedImage(32, 32000, 2)).getGraphics();
                  Field10674 = 0;
                  Field10672 = var10;
                  Field10673 = var4;
               } catch (IOException var7) {
                  var7.printStackTrace();
                  break label85;
               } catch (Exception var8) {
                  var8.printStackTrace();
                  break label85;
               }
            }

            if (Field10669 != null && Field10674 > 0) {
               try {
                  int var13 = Field10672 / 1000;
                  System.out.println("[ItemDef] ItemIconDump: " + var13 + " finished, written: " + Field10674 + "/1000");
                  OutputStream var11 = Files.newOutputStream(Paths.get(var9 + "icons_atlas/" + var13 + ".png"));
                  ImageIO.write(Field10669, "PNG", var11);
                  var11.close();
                  Field10672 = Field10665;
               } catch (IOException var6) {
                  var6.printStackTrace();
               }
            }

            Field10669 = null;
            Field10670 = null;
            Field10671 = null;
            return true;
         }

         ++var10;
      }
   }
}
