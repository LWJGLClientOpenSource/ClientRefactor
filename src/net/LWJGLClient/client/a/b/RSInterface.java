package net.LWJGLClient.client.a.b;

import java.util.Arrays;

import net.LWJGLClient.client.a.a.Class518;
import net.LWJGLClient.client.a.a.Sequence;
import net.LWJGLClient.client.a.c.ItemDef;
import net.LWJGLClient.client.a.c.NPCDefinition;
import net.LWJGLClient.client.b.RSFont;
import net.LWJGLClient.client.e.Class23;
import net.LWJGLClient.client.model.Model;
import net.LWJGLClient.client.model.c.Class175;
import net.LWJGLClient.client.model.d.Player;
import net.LWJGLClient.client.a.d.RgbImage;
import net.LWJGLClient.client.a.e.JagexArchive;
import net.LWJGLClient.client.c.Packet;
import net.LWJGLClient.client.model.Client;
import net.LWJGLClient.client.model.c.MemCache;
import net.LWJGLClient.client.model.d.Npc;

public final class RSInterface {
   public boolean Field12728 = false;
   public boolean Field12729 = false;
   public Npc[] Field12730 = null;
   public Model[] Field12731 = null;
   private static int Field12732 = 0;
   private static int Field12733 = 0;
   public boolean Field12734 = false;
   private static int Field12735 = 0;
   public String Field12736;
   private static int Field12737 = 0;
   private static int Field12738 = 0;
   private static StringBuilder Field12739 = null;
   private static StringBuilder Field12740 = null;
   private static StringBuilder Field12741 = null;
   private static int Field12742 = 0;
   private static int Field12743 = 0;
   private static JagexArchive Field12744;
   public RgbImage Field12745;
   public double Field12746;
   public RgbImage[] Field12747;
   public int Field12748 = 32;
   public static RSInterface[] Field12749;
   public int[] Field12750;
   public int Field12751;
   public int[] Field12752;
   public int Field12753;
   public int Field12754;
   public int Field12755 = 0;
   public String Field12756;
   public int Field12757;
   public int Field12758;
   public String Field12759;
   public String Field12760;
   public boolean Field12761;
   public int Field12762;
   public String[] Field12763;
   public int[][] Field12764;
   public boolean Field12765;
   public String Field12766;
   public int Field12767;
   public boolean Field12768 = false;
   public boolean Field12769 = false;
   public int Field12770;
   public int Field12771;
   public int Field12772;
   public int Field12773;
   public boolean Field12774;
   public int Field12775;
   public int Field12776;
   public int Field12777;
   public boolean Field12778 = false;
   public boolean Field12779 = false;
   public int Field12780;
   public static MemCache Field12781;
   public int Field12782;
   public int[] Field12783;
   public int[] Field12784;
   public boolean Field12785;
   public RSFont Field12786;
   private static RSFont[] Field12787;
   public int Field12788;
   public int[] Field12789;
   public int Field12790;
   public int[] Field12791;
   public String Field12792;
   public boolean Field12793;
   public int Field12794;
   public int[] Field12795;
   public int[] Field12796;
   public byte Field12797;
   private int Field12798;
   private int Field12799;
   public int Field12800;
   public int Field12801;
   public boolean Field12802;
   public RgbImage Field12803;
   public int Field12804;
   public int Field12805;
   public int Field12806 = 0;
   public int Field12807;
   private static MemCache Field12808 = new MemCache(50);
   public int Field12809;
   public boolean Field12810;
   public int Field12811;
   public boolean Field12812;
   public int Field12813;
   public int Field12814;
   public int Field12815;
   public int[] Field12816;
   public boolean Field12817 = false;
   public boolean Field12818 = false;
   public boolean Field12819 = false;

   static {
      new Class175(30);
   }

   public final void Method1742(int var1, int var2) {
      int var3 = this.Field12796[var1];
      this.Field12796[var1] = this.Field12796[var2];
      this.Field12796[var2] = var3;
      var3 = this.Field12795[var1];
      this.Field12795[var1] = this.Field12795[var2];
      this.Field12795[var2] = var3;
   }

   public static void unpack(JagexArchive var0, RSFont[] var1, JagexArchive var2) {
      (new RgbImage("Misc/BLANK_3")).Field9880 = 1;
      Field12781 = new MemCache(51200);
      Packet var3 = new Packet(var0.readConfig("data"));
      int var4 = -1;
      var3.g2();
      Field12749 = new RSInterface[30]; //썐 <--was

      while(true) {
         RSInterface var6;
         do {
            int var5;
            int var7;
            int var9;
            if (var3.pos >= var3.Field1259.length) {
               Field12787 = var1;
               Field12735 = 0;
               Field12749[3823].Field12763[4] = "Sell X";
               Field12749[3900].Field12763[4] = "Buy X";
               RSInterface var14 = Field12749[6670];

               int var15;
               for(var15 = 0; var15 < var14.Field12752.length; ++var15) {
                  var14.Field12752[var15] += 4;
                  var14.Field12791[var15] += 4;
               }

               var14 = Field12749[3416];

               for(var15 = 0; var15 < var14.Field12752.length; ++var15) {
                  var14.Field12752[var15] -= 4;
                  var14.Field12791[var15] += 4;
               }

               Field12749[3823].Field12763[4] = "Sell X";
               Field12749[3900].Field12763[4] = "Buy X";
               Method1770(Field12749[3823]);
               Method1770(Field12749[3900]);
               RSInterface var10000 = Field12749[3900];
               boolean var17 = true;
               var14 = var10000;
               int[] var18 = new int[]{29000 + Field12735};
               int[] var19 = new int[1];
               int[] var33 = new int[1];
               int var24 = 0;
               var7 = 0;
               RSInterface var28;
               if ((var28 = Field12749[var14.Field12775]).Field12783 != null) {
                  for(var9 = 0; var9 < var28.Field12783.length; ++var9) {
                     if (var28.Field12783[var9] == var14.Field12794) {
                        var28.Field12783[var9] = var18[0];
                        var24 = var28.Field12784[var9];
                        var7 = var28.Field12816[var9];
                        var28.Field12784[var9] = -58;
                        var28.Field12816[var9] = 82;
                        var24 -= var28.Field12784[var9];
                        var7 -= var28.Field12816[var9];
                     }
                  }

                  int[] var30 = new int[var28.Field12783.length + 2];
                  int[] var10 = new int[var28.Field12784.length + 2];
                  int[] var11 = new int[var28.Field12816.length + 2];
                  System.arraycopy(var28.Field12783, 0, var30, 0, var28.Field12783.length);
                  System.arraycopy(var28.Field12784, 0, var10, 0, var28.Field12784.length);
                  System.arraycopy(var28.Field12816, 0, var11, 0, var28.Field12816.length);
                  Method1753(21004, 4, 21005, 13, 13, "Bank/BANK", 35, 25, 0, 1, "Search", 21006, 14, 14, "Bank/BANK", 21007, "Search an item", "", 12, 20);
                  int var12 = var28.Field12783.length;
                  var30[var12] = 21004;
                  var30[var12 + 1] = 21005;
                  var10[var12] = 22;
                  var11[var12] = 286;
                  var10[var12 + 1] = var10[var12] - 15;
                  var11[var12 + 1] = var11[var12] - 60;
                  var28.Field12783 = var30;
                  var28.Field12784 = var10;
                  var28.Field12816 = var11;
                  var28.Field12817 = true;
               }

               RSInterface var32;
               (var32 = Method1810(29000 + Field12735)).Field12804 = var14.Field12804 = 1000;
               var32.Field12762 = 0;
               var32.Field12811 = 182;
               var32.Field12805 = 0;
               var32.Field12783 = new int[]{var14.Field12794};
               var32.Field12784 = new int[]{var24 - 36};
               var32.Field12816 = new int[]{var7};
               var14.Field12783 = var18;
               var14.Field12784 = var19;
               var14.Field12816 = var33;
               var14.Field12758 = 10;
               var14.Field12770 = 8;
               var14.Field12788 = 8;
               var14.Field12796 = new int[1];
               var14.Field12795 = new int[1];
               var14.Field12817 = true;
               ++Field12735;
               RSInterface var20 = Method1810(5608);
               RSInterface var21;
               (var21 = Field12749[687]).Field12771 = 16750623;
               var21.Field12812 = true;
               var21.Field12792 = "%1/%2";
               Method1801(5651, 0, "Prayer/PRAYER");
               Method1772(18000, 0, 601, 7, 0, "Sharp Eye");
               Method1772(18002, 0, 602, 8, 1, "Mystic Will");
               Method1772(18004, 0, 603, 25, 2, "Hawk Eye");
               Method1772(18006, 0, 604, 26, 3, "Mystic Lore");
               Method1772(18008, 0, 605, 43, 4, "Eagle Eye");
               Method1772(18010, 0, 606, 44, 5, "Mystic Might");
               Method1772(18012, 0, 607, 59, 9, "Chivalry (Melee)");
               Method1772(18014, 0, 608, 69, 12, "Piety (Melee)");
               Method1772(18016, 0, 609, 59, 10, "Chivalry (Ranged)");
               Method1772(18018, 0, 610, 69, 13, "Piety (Ranged)");
               Method1772(18020, 0, 611, 59, 8, "Chivalry (Magic)");
               Method1772(18022, 0, 612, 69, 11, "Piety (Magic)");
               var20.Method1814(62);
               var20.Method1813(0, 5609, 8, 4);
               var20.Method1813(1, 5610, 44, 4);
               var20.Method1813(2, 5611, 80, 4);
               var20.Method1813(3, 5612, 8, 40);
               var20.Method1813(4, 5613, 44, 40);
               var20.Method1813(5, 5614, 80, 40);
               var20.Method1813(6, 5615, 116, 40);
               var20.Method1813(7, 5616, 152, 40);
               var20.Method1813(8, 5617, 8, 76);
               var20.Method1813(9, 5618, 116, 76);
               var20.Method1813(10, 5619, 152, 76);
               var20.Method1813(11, 5620, 8, 112);
               var20.Method1813(12, 5621, 44, 112);
               var20.Method1813(13, 5622, 80, 112);
               var20.Method1813(14, 5623, 116, 112);
               var20.Method1813(15, 683, 44, 148);
               var20.Method1813(16, 684, 80, 148);
               var20.Method1813(17, 685, 116, 148);
               var20.Method1813(18, 5632, 10, 6);
               var20.Method1813(19, 5633, 46, 6);
               var20.Method1813(20, 5634, 82, 6);
               var20.Method1813(21, 5635, 10, 42);
               var20.Method1813(22, 5636, 46, 42);
               var20.Method1813(23, 5637, 82, 42);
               var20.Method1813(24, 5638, 118, 42);
               var20.Method1813(25, 5639, 154, 42);
               var20.Method1813(26, 5640, 10, 79);
               var20.Method1813(27, 5641, 118, 78);
               var20.Method1813(28, 5642, 154, 78);
               var20.Method1813(29, 5643, 10, 114);
               var20.Method1813(30, 5644, 46, 114);
               var20.Method1813(31, 686, 82, 114);
               var20.Method1813(32, 5645, 118, 114);
               var20.Method1813(33, 5649, 46, 150);
               var20.Method1813(34, 5647, 82, 150);
               var20.Method1813(35, 5648, 118, 150);
               var20.Method1813(36, 18000, 116, 4);
               var20.Method1813(37, 18001, 119, 8);
               var20.Method1813(38, 18002, 152, 4);
               var20.Method1813(39, 18003, 155, 7);
               var20.Method1813(40, 18004, 44, 76);
               var20.Method1813(41, 18005, 47, 80);
               var20.Method1813(42, 18006, 80, 76);
               var20.Method1813(43, 18007, 83, 79);
               var20.Method1813(44, 18008, 152, 112);
               var20.Method1813(45, 18009, 155, 116);
               var20.Method1813(46, 18010, 8, 148);
               var20.Method1813(47, 18011, 11, 151);
               var20.Method1813(48, 18012, 152, 148);
               var20.Method1813(49, 18013, 159, 151);
               var20.Method1813(58, 18020, 44, 184);
               var20.Method1813(59, 18021, 51, 187);
               var20.Method1813(54, 18016, 8, 184);
               var20.Method1813(55, 18017, 15, 187);
               var20.Method1813(56, 18018, 117, 184);
               var20.Method1813(57, 18019, 120, 194);
               var20.Method1813(50, 18014, 80, 184);
               var20.Method1813(51, 18015, 83, 194);
               var20.Method1813(60, 18022, 152, 184);
               var20.Method1813(61, 18023, 155, 194);
               var20.Method1813(52, 5651, 67, 242);
               var20.Method1813(53, 687, 16, 244);
               String[] var22 = new String[]{"Thick Skin", "Burst of Strength", "Clarity of Thought", "Rock Skin", "Superhuman Strength", "Improved Reflexes", "Rapid Restore", "Rapid Heal", "Protect Item", "Steel Skin", "Ultimate Strength", "Incredible Reflexes", "Protect from Magic", "Protect from Range", "Protect from Melee", "Retribution", "Redemption", "Smite"};
               var5 = 0;

               for(var24 = 5609; var24 <= 5623; ++var24) {
                  Field12749[var24].Field12759 = "Activate @lre@" + var22[var5];
                  ++var5;
               }

               for(var24 = 683; var24 <= 685; ++var24) {
                  Field12749[var24].Field12759 = "Activate @lre@" + var22[var5];
                  ++var5;
               }

               Method1788();
               var14 = Method1810(904);
               (var20 = Field12749[149]).Field12771 = 16750592;
               Method1801(905, 9, "/Options/SPRITE");
               Method1801(907, 18, "/Options/SPRITE");
               Method1801(909, 29, "/Options/SPRITE");
               Method1801(951, 32, "/Options/SPRITE");
               Method1801(953, 33, "/Options/SPRITE");
               Method1801(955, 34, "/Options/SPRITE");
               Method1801(947, 36, "/Options/SPRITE");
               Method1801(949, 35, "/Options/SPRITE");
               Method1801(30351, 41, "/Options/SPRITE");
               Method1799(906, 904, 10, 14, "/Options/SPRITE", 32, 16, "Dark", 1, 5, 166);
               Method1799(908, 904, 11, 15, "/Options/SPRITE", 32, 16, "Normal", 2, 5, 166);
               Method1799(910, 904, 12, 16, "/Options/SPRITE", 32, 16, "Bright", 3, 5, 166);
               Method1799(912, 904, 13, 17, "/Options/SPRITE", 32, 16, "Very Bright", 4, 5, 166);
               Method1799(930, 904, 19, 24, "/Options/SPRITE", 26, 16, "Music Off", 4, 5, 168);
               Method1799(931, 904, 20, 25, "/Options/SPRITE", 26, 16, "Music Level-1", 3, 5, 168);
               Method1799(932, 904, 21, 26, "/Options/SPRITE", 26, 16, "Music Level-2", 2, 5, 168);
               Method1799(933, 904, 22, 27, "/Options/SPRITE", 26, 16, "Music Level-3", 1, 5, 168);
               Method1799(934, 904, 23, 28, "/Options/SPRITE", 24, 16, "Music Level-4", 0, 5, 168);
               Method1799(941, 904, 19, 24, "/Options/SPRITE", 26, 16, "Sound Effects Off", 4, 5, 169);
               Method1799(942, 904, 20, 25, "/Options/SPRITE", 26, 16, "Sound Effects Level-1", 3, 5, 169);
               Method1799(943, 904, 21, 26, "/Options/SPRITE", 26, 16, "Sound Effects Level-2", 2, 5, 169);
               Method1799(944, 904, 22, 27, "/Options/SPRITE", 26, 16, "Sound Effects Level-3", 1, 5, 169);
               Method1799(945, 904, 23, 28, "/Options/SPRITE", 24, 16, "Sound Effects Level-4", 0, 5, 169);
               Method1781(913, 30, 31, "/Options/SPRITE", "Toggle Two Mouse Buttons", 0, 4, 170);
               Method1781(915, 30, 31, "/Options/SPRITE", "Toggle Chat Effects", 0, 4, 171);
               Method1781(957, 30, 31, "/Options/SPRITE", "Toggle Split Private Chat", 1, 4, 287);
               Method1781(12464, 30, 31, "/Options/SPRITE", "Toggle Accept Aid", 0, 4, 427);
               Method1781(152, 30, 31, "/Options/SPRITE", "Toggle Run", 1, 4, 173);
               Method1781(30350, 30, 30, "/Options/SPRITE", "Game Settings", 1, 4, 1998);
               var14.Method1814(30);
               var14.Method1813(0, 905, 13, 12);
               var14.Method1813(1, 906, 48, 20);
               var14.Method1813(2, 908, 80, 20);
               var14.Method1813(3, 910, 112, 20);
               var14.Method1813(4, 912, 144, 20);
               var14.Method1813(5, 907, 14, 57);
               var14.Method1813(6, 930, 49, 63);
               var14.Method1813(7, 931, 75, 63);
               var14.Method1813(8, 932, 101, 63);
               var14.Method1813(9, 933, 127, 63);
               var14.Method1813(10, 934, 151, 63);
               var14.Method1813(11, 909, 13, 101);
               var14.Method1813(12, 941, 49, 106);
               var14.Method1813(13, 942, 75, 106);
               var14.Method1813(14, 943, 101, 106);
               var14.Method1813(15, 944, 127, 106);
               var14.Method1813(16, 945, 151, 106);
               var14.Method1813(17, 913, 15, 153);
               var14.Method1813(18, 955, 19, 159);
               var14.Method1813(19, 915, 75, 153);
               var14.Method1813(20, 953, 79, 160);
               var14.Method1813(21, 957, 135, 153);
               var14.Method1813(22, 951, 139, 159);
               var14.Method1813(23, 12464, 15, 208);
               var14.Method1813(24, 949, 20, 213);
               var14.Method1813(25, 152, 75, 208);
               var14.Method1813(26, 30350, 133, 210);
               var14.Method1813(27, 947, 87, 212);
               var14.Method1813(28, 149, 80, 231);
               var14.Method1813(29, 30351, 142, 220);
               Field12749[30350].Field12736 = "Open Game Settings.";
               Method1784(1698, 1701, 7499, "Chop", "Hack", "Smash", "Block", 42, 75, 127, 75, 39, 128, 125, 128, 122, 103, 40, 50, 122, 50, 40, 103, var1, "Crush\nAttack XP", "Crush\nStrength XP", "Slash\nStrength XP", "Crush\nDefence XP");
               Method1784(2276, 2279, 7574, "Stab", "Lunge", "Slash", "Block", 43, 75, 124, 75, 41, 128, 125, 128, 122, 103, 40, 50, 122, 50, 40, 103, var1, "Stab\nAttack XP", "Stab\nStrength XP", "Slash\nStrength XP", "Stab\nDefence XP");
               Method1784(2423, 2426, 7599, "Chop", "Slash", "Lunge", "Block", 42, 75, 125, 75, 40, 128, 125, 128, 122, 103, 40, 50, 122, 50, 40, 103, var1, "Slash\nAttack XP", "Slash\nStrength XP", "Stab\nMixed XP", "Slash\nDefence XP");
               Method1784(3796, 3799, 7624, "Pound", "Pummel", "Spike", "Block", 39, 75, 121, 75, 41, 128, 125, 128, 122, 103, 40, 50, 122, 50, 40, 103, var1, "Crush\nAttack XP", "Crush\nStrength XP", "Stab\nMixed XP", "Crush\nDefence XP");
               Method1784(4679, 4682, 7674, "Lunge", "Swipe", "Pound", "Block", 40, 75, 124, 75, 39, 128, 125, 128, 122, 103, 40, 50, 122, 50, 40, 103, var1, "Stab\nAttack XP", "Slash\nStrength XP", "Stab\nStrength XP", "Stab\nDefence XP");
               Method1784(4705, 4708, 7699, "Chop", "Slash", "Smash", "Block", 42, 75, 125, 75, 39, 128, 125, 128, 122, 103, 40, 50, 122, 50, 40, 103, var1, "Slash\nAttack XP", "Slash\nStrength XP", "Crush\nStrength XP", "Slash\nDefence XP");
               Method1784(5570, 5573, 7724, "Spike", "Impale", "Smash", "Block", 41, 75, 123, 75, 39, 128, 125, 128, 122, 103, 40, 50, 122, 50, 40, 103, var1, "Crush\nAttack XP", "Crush\nStrength XP", "Slash\nStrength XP", "Crush\nDefence XP");
               Method1784(7762, 7765, 7800, "Chop", "Slash", "Lunge", "Block", 42, 75, 125, 75, 40, 128, 125, 128, 122, 103, 40, 50, 122, 50, 40, 103, var1, "Slash\nAttack XP", "Slash\nStrength XP", "Slash\nMixed XP", "Slash\nDefence XP");
               Method1785(776, 779, "Reap", "Chop", "Jab", "Block", 42, 75, 126, 75, 46, 128, 125, 128, 122, 103, 122, 50, 40, 103, 40, 50, var1);
               Method1786(425, 428, 7474, "Pound", "Pummel", "Block", 39, 75, 121, 75, 42, 128, 40, 103, 40, 50, 122, 50, var1, "Crush\nAttack XP", "Crush\nStrength XP", "Crush\nDefence XP");
               Method1786(1749, 1752, 7524, "Accurate", "Rapid", "Longrange", 33, 75, 125, 75, 29, 128, 40, 103, 40, 50, 122, 50, var1, "Accurate\nRanged XP", "Rapid\nRanged XP", "Longrange\nDefence XP");
               Method1786(1764, 1767, 7549, "Accurate", "Rapid", "Longrange", 33, 75, 125, 75, 29, 128, 40, 103, 40, 50, 122, 50, var1, "Accurate\nRanged XP", "Rapid\nRanged XP", "Longrange\nDefence XP");
               Method1786(4446, 4449, 7649, "Accurate", "Rapid", "Longrange", 33, 75, 125, 75, 29, 128, 40, 103, 40, 50, 122, 50, var1, "Accurate\nRanged XP", "Rapid\nRanged XP", "Longrange\nDefence XP");
               Method1786(5855, 5857, 7749, "Punch", "Kick", "Block", 40, 75, 129, 75, 42, 128, 40, 50, 122, 50, 40, 103, var1, "Crush\nAttack XP", "Crush\nStrength XP", "Crush\nDefence XP");
               Method1786(6103, 6132, 6117, "Bash", "Pound", "Block", 43, 75, 124, 75, 42, 128, 40, 103, 40, 50, 122, 50, var1, "Crush\nAttack XP", "Crush\nStrength XP", "Crush\nDefence XP");
               Method1786(8460, 8463, 8493, "Jab", "Swipe", "Fend", 46, 75, 124, 75, 43, 128, 40, 103, 40, 50, 122, 50, var1, "Slash\nAttack XP", "Slash\nStrength XP", "Slash\nDefence XP");
               Method1786(12290, 12293, 12323, "Flick", "Lash", "Deflect", 44, 75, 127, 75, 36, 128, 40, 50, 40, 103, 122, 50, var1, "Slash\nAttack XP", "Slash\nMixed XP", "Slash\nDefence XP");
               Method1787(328, 331, "Bash", "Pound", "Focus", 42, 66, 39, 101, 41, 136, 40, 120, 40, 50, 40, 85, var1, "Crush\nAttack XP", "Crush\nStrength XP", "Crush\nDefence XP");
               var20 = Method1776(19300);
               boolean var34 = false;
               boolean var31 = true;
               RSInterface var29;
               (var29 = Field12749[3983]).Field12786 = var1[0];
               Method1780(150, 19301, 172, 150, 44, "Auto Retaliate");
               Field12749[150].Field12736 = "Automatically fight back\nwhen attacked.";
               Field12749[150].Field12758 = 68;
               Method1776(40989);
               Method1777(40989, "", var1, 0, 16750623, false);
               Method1776(40988);
               Method1777(40988, "Retaliate", var1, 0, 16750623, true);
               Method1808(40987, 0, "/Attack/auto_retaliate", 0.85F);
               Method1776(40986).Field12796 = new int[1];
               Method1777(40986, "", var1, 0, 16750623, true);
               RSInterface var26 = Method1780(40985, 19301, 2013, 150, 44, "Activate");
               Method1803(40984, (String)null, -1);
               var26.Field12777 = 40984;
               var20.Method1814(8);
               var20.Method1813(0, 3983, 52, 25);
               var20.Method1813(1, 150, 21, 153);
               var20.Method1813(2, 40988, 56, 184);
               var20.Method1813(3, 40987, 45, 155);
               var20.Method1813(4, 40985, 105, 153);
               var20.Method1813(5, 40984, 123, 155);
               var20.Method1813(6, 40986, 139, 184);
               var20.Method1813(7, 40989, 23, 241);
               (var20 = Field12749[3983]).Field12761 = true;
               var20.Field12771 = 16750623;
               Method1757(12323, 21, 212, Field12749[328]);
               Method1773(var1);
               Method1774(var1);
               var20 = Method1776(21119);
               Method1793(21120, "What", 10066329, false, true, 52, var1, 1);
               Method1793(21121, "What", 3394560, false, true, 52, var1, 1);
               Method1793(21122, "(Need 5 to 25 players)", 16763955, false, true, 52, var1, 1);
               Method1793(21123, "Points", 3394815, false, true, 52, var1, 1);
               var20.Field12783 = new int[4];
               var20.Field12784 = new int[4];
               var20.Field12816 = new int[4];
               Method1835(21120, 15, 12, 0, var20);
               Method1835(21121, 15, 30, 1, var20);
               Method1835(21122, 15, 48, 2, var20);
               Method1835(21123, 15, 66, 3, var20);
               Method1794(var1);
               Method1766(var1);
               Method1767();
               Method1832(var1);
               Method1759(false, false);
               Method1747();
               Method1762();
               Method1764(false);
               Method1763(false);
               Method1765(var1);
               Method1792(var1);
               Method1834(false);
               Method1833(var1);
               Method1745();
               Method1790(false, false);
               Method1746(false, false);
               Method1752(var1, true);
               Method1752(var1, false);
               Method1751(var1);
               Method1750(false, false);
               Method1749(false, false);
               Method1748(false, false);
               Method1744();
               boolean var16 = false;
               RSFont[] var23 = Field12787;
               RSInterface var35 = Method1776(42150);
               Method1756(4, var35);
               Method1801(42141, 4, "Misc/BLANK");
               var35.Field12811 = 334;
               Method1793(42142, "Minigame Finder", 16745503, true, true, -1, var23, 2);
               Method1757(42141, 0, 0, var35);
               Method1757(42142, 244, 5, var35);
               Method1757(5384, 464, 4, var35);
               Method1757(5380, 464, 4, var35);
               (var32 = Method1776(42143)).Field12775 = 42144;
               Method1756(1, var32);
               var32.Field12811 = 278;
               var32.Field12758 = 480;
               var32.Field12762 = 0;
               var32.Field12804 = 320;
               var32.Field12775 = 42144;
               Method1757(42143, -16, 21, var35);
               Field12749[15894].Field12761 = true;
               var15 = 0;

               for(int var13 = 0; var13 < Field12749.length; ++var13) {
                  if (Field12749[var13] != null) {
                     var15 = var13;
                  }
               }

               System.out.println("[GameInterface]: highest: " + var15);
               Field12744 = var0;
               Field12781.Method1512();
               Field12781 = null;
               return;
            }

            if ((var5 = var3.g2()) == 65535) {
               var4 = var3.g2();
               var5 = var3.g2();
            }

            (var6 = Field12749[var5] = new RSInterface()).Field12794 = var5;
            var6.Field12775 = var4;
            var6.Field12805 = var3.g1();
            var6.Field12754 = var3.g1();
            var6.Field12751 = var3.g2();
            var6.Field12758 = var3.g2();
            var6.Field12811 = var3.g2();
            var6.Field12797 = (byte)var3.g1();
            var6.Field12767 = var3.g1();
            if (var6.Field12767 != 0) {
               var6.Field12767 = (var6.Field12767 - 1 << 8) + var3.g1();
            } else {
               var6.Field12767 = -1;
            }

            if ((var5 = var3.g1()) > 0) {
               var6.Field12789 = new int[var5];
               var6.Field12750 = new int[var5];

               for(var7 = 0; var7 < var5; ++var7) {
                  var6.Field12789[var7] = var3.g1();
                  var6.Field12750[var7] = var3.g2();
               }
            }

            int var8;
            if ((var7 = var3.g1()) > 0) {
               var6.Field12764 = new int[var7][];

               for(var5 = 0; var5 < var7; ++var5) {
                  var8 = var3.g2();
                  var6.Field12764[var5] = new int[var8];

                  for(var9 = 0; var9 < var8; ++var9) {
                     var6.Field12764[var5][var9] = var3.g2();
                  }
               }
            }

            if (var6.Field12805 == 0) {
               var6.Field12804 = var3.g2();
               var6.Field12810 = var3.g1() == 1;
               var5 = var3.g2();
               var6.Field12783 = new int[var5];
               var6.Field12784 = new int[var5];
               var6.Field12816 = new int[var5];

               for(var8 = 0; var8 < var5; ++var8) {
                  var6.Field12783[var8] = var3.g2();
                  var6.Field12784[var8] = var3.Method402();
                  var6.Field12816[var8] = var3.Method402();
               }
            }

            if (var6.Field12805 == 1) {
               var3.g2();
               var3.g1();
            }

            if (var6.Field12805 == 2) {
               var6.Field12796 = new int[var6.Field12811 * var6.Field12758];
               var6.Field12795 = new int[var6.Field12811 * var6.Field12758];
               var6.Field12802 = var3.g1() == 1;
               var6.Field12793 = var3.g1() == 1;
               var6.Field12785 = var3.g1() == 1;
               var6.Field12774 = var3.g1() == 1;
               var6.Field12770 = var3.g1();
               var6.Field12788 = var3.g1();
               var6.Field12752 = new int[20];
               var6.Field12791 = new int[20];
               var6.Field12747 = new RgbImage[20];

               for(var5 = 0; var5 < 20; ++var5) {
                  if (var3.g1() == 1) {
                     var6.Field12752[var5] = var3.Method402();
                     var6.Field12791[var5] = var3.Method402();
                     String var27 = var3.Method406();
                     if (var2 != null && var27.length() > 0) {
                        var7 = var27.lastIndexOf(",");
                        var6.Field12747[var5] = Method1817(Integer.parseInt(var27.substring(var7 + 1)), var2, var27.substring(0, var7));
                     }
                  }
               }

               var6.Field12763 = new String[5];

               for(var5 = 0; var5 < 5; ++var5) {
                  var6.Field12763[var5] = var3.Method406();
                  if (var6.Field12763[var5].length() == 0) {
                     var6.Field12763[var5] = null;
                  }

                  if (var6.Field12775 == 1644) {
                     var6.Field12763[2] = "Operate";
                  }
               }
            }

            if (var6.Field12805 == 3) {
               var6.Field12765 = var3.g1() == 1;
            }

            if (var6.Field12805 == 4 || var6.Field12805 == 1) {
               var6.Field12761 = var3.g1() == 1;
               var5 = var3.g1();
               var6.Field12786 = var1[var5];
               var6.Field12812 = var3.g1() == 1;
            }

            if (var6.Field12805 == 4) {
               var6.Field12792 = var3.Method406().replaceAll("RuneScape", Client.Field12129);
               var6.Field12766 = var3.Method406();
            }

            if (var6.Field12805 == 1 || var6.Field12805 == 3 || var6.Field12805 == 4) {
               var6.Field12771 = var3.Method404();
            }

            if (var6.Field12805 == 3 || var6.Field12805 == 4) {
               var6.Field12757 = var3.Method404();
               var6.Field12753 = var3.Method404();
               var6.Field12782 = var3.Method404();
            }

            if (var6.Field12805 == 5) {
               String var25 = var3.Method406();
               if (var2 != null && var25.length() > 0) {
                  var8 = var25.lastIndexOf(",");
                  var6.Field12745 = Method1817(Integer.parseInt(var25.substring(var8 + 1)), var2, var25.substring(0, var8));
               }

               var25 = var3.Method406();
               if (var2 != null && var25.length() > 0) {
                  var8 = var25.lastIndexOf(",");
                  var6.Field12803 = Method1817(Integer.parseInt(var25.substring(var8 + 1)), var2, var25.substring(0, var8));
               }
            }

            if (var6.Field12805 == 6) {
               if ((var5 = var3.g1()) != 0) {
                  var6.Field12772 = 1;
                  var6.Field12773 = (var5 - 1 << 8) + var3.g1();
               }

               if ((var5 = var3.g1()) != 0) {
                  var6.Field12798 = 1;
                  var6.Field12799 = (var5 - 1 << 8) + var3.g1();
               }

               if ((var5 = var3.g1()) != 0) {
                  var6.Field12800 = (var5 - 1 << 8) + var3.g1();
               } else {
                  var6.Field12800 = -1;
               }

               if ((var5 = var3.g1()) != 0) {
                  var6.Field12801 = (var5 - 1 << 8) + var3.g1();
               } else {
                  var6.Field12801 = -1;
               }

               var6.Field12813 = var3.g2();
               var6.Field12814 = var3.g2();
               var6.Field12815 = var3.g2();
            }

            if (var6.Field12805 == 7) {
               var6.Field12796 = new int[var6.Field12811 * var6.Field12758];
               var6.Field12795 = new int[var6.Field12811 * var6.Field12758];
               var6.Field12761 = var3.g1() == 1;
               var5 = var3.g1();
               var6.Field12786 = var1[var5];
               var6.Field12812 = var3.g1() == 1;
               var6.Field12771 = var3.Method404();
               var6.Field12770 = var3.Method402();
               var6.Field12788 = var3.Method402();
               var6.Field12793 = var3.g1() == 1;
               var6.Field12763 = new String[5];

               for(var8 = 0; var8 < 5; ++var8) {
                  var6.Field12763[var8] = var3.Method406();
                  if (var6.Field12763[var8].length() == 0) {
                     var6.Field12763[var8] = null;
                  }
               }
            }

            if (var6.Field12754 == 2 || var6.Field12805 == 2) {
               var6.Field12760 = var3.Method406();
               var6.Field12756 = var3.Method406();
               var6.Field12780 = var3.g2();
            }

            if (var6.Field12805 == 8) {
               var6.Field12792 = var3.Method406();
            }
         } while(var6.Field12754 != 1 && var6.Field12754 != 4 && var6.Field12754 != 5 && var6.Field12754 != 6);

         var6.Field12759 = var3.Method406();
         if (var6.Field12759.length() == 0) {
            if (var6.Field12754 == 1) {
               var6.Field12759 = "Ok";
            }

            if (var6.Field12754 == 4) {
               var6.Field12759 = "Select";
            }

            if (var6.Field12754 == 5) {
               var6.Field12759 = "Select";
            }

            if (var6.Field12754 == 6) {
               var6.Field12759 = "Continue";
            }
         }
      }
   }

   private static void Method1744() {
      RSInterface var0 = Field12749[4262];

      for(int var1 = 0; var1 < var0.Field12783.length; ++var1) {
         RSInterface var2 = Field12749[var0.Field12783[var1]];
         if (var1 > 0) {
            var2.Field12753 = 16777215;
            var2.Field12736 = "Play song:\n" + var2.Field12792;
         }
      }

      Field12749[6271].Field12792 = "RNG";
      Field12749[6270].Field12736 = "Randomly select a song\nyou already know.";
      Field12749[6272].Field12792 = "AUTO";
      Field12749[6269].Field12736 = "Automatically play\nthe area's song.";
   }

   private static void Method1745() {
      RSInterface var0 = Method1776(7202);
      RSInterface var1 = Field12749[6247];
      RSInterface var2 = Field12749[6253];
      RSInterface var3 = Field12749[6206];
      RSInterface var4 = Field12749[6216];
      RSInterface var5 = Field12749[4443];
      RSInterface var6 = Field12749[6242];
      RSInterface var7 = Field12749[6211];
      RSInterface var8 = Field12749[6226];
      RSInterface var9 = Field12749[4272];
      RSInterface var10 = Field12749[6231];
      RSInterface var11 = Field12749[6258];
      RSInterface var12 = Field12749[4282];
      RSInterface var13 = Field12749[6263];
      RSInterface var14 = Field12749[6221];
      RSInterface var15 = Field12749[4416];
      RSInterface var16 = Field12749[6237];
      RSInterface var17 = Field12749[4277];
      RSInterface var18 = Field12749[4261];
      RSInterface var19 = Field12749[12122];
      RSInterface var20 = Method1776(32026);
      RSInterface var21 = Field12749[4267];
      RSInterface var22 = Method1776(7267);
      RSInterface var23 = Method1776(32036);
      RSInterface var24 = Method1776(9267);
      RSInterface var25 = Method1776(10267);
      Method1801(17878, 0, "skills/");
      Method1801(17879, 1, "skills/");
      Method1801(17880, 2, "skills/");
      Method1801(17881, 3, "skills/");
      Method1801(17882, 4, "skills/");
      Method1801(17883, 5, "skills/");
      Method1801(17884, 6, "skills/");
      Method1801(17885, 7, "skills/");
      Method1801(17886, 8, "skills/");
      Method1801(17887, 9, "skills/");
      Method1801(17888, 10, "skills/");
      Method1801(17889, 11, "skills/");
      Method1801(17890, 12, "skills/");
      Method1801(17891, 13, "skills/");
      Method1801(17892, 14, "skills/");
      Method1801(17893, 15, "skills/");
      Method1801(17894, 16, "skills/");
      Method1801(17895, 17, "skills/");
      Method1801(17896, 18, "skills/");
      Method1801(17897, 19, "skills/");
      Method1801(17898, 20, "skills/");
      Method1801(17899, 21, "skills/");
      Method1801(17900, 22, "skills/");
      Method1801(17901, 23, "skills/");
      Method1801(17902, 24, "skills/");
      Method1756(5, var0);
      Method1835(17877, 20, 30, 0, var0);
      Method1835(4268, 80, 15, 1, var0);
      Method1835(4269, 80, 45, 2, var0);
      Method1835(358, 95, 75, 3, var0);
      Field12749[17877].Field12805 = 6;
      Method1756(4, var1);
      Method1835(17878, 20, 30, 0, var1);
      Method1835(4268, 80, 15, 1, var1);
      Method1835(4269, 80, 45, 2, var1);
      Method1835(358, 95, 75, 3, var1);
      Method1756(4, var2);
      Method1835(17879, 20, 30, 0, var2);
      Method1835(4268, 80, 15, 1, var2);
      Method1835(4269, 80, 45, 2, var2);
      Method1835(358, 95, 75, 3, var2);
      Method1756(4, var3);
      Method1835(17880, 20, 30, 0, var3);
      Method1835(4268, 80, 15, 1, var3);
      Method1835(4269, 80, 45, 2, var3);
      Method1835(358, 95, 75, 3, var3);
      Method1756(4, var4);
      Method1835(17881, 20, 30, 0, var4);
      Method1835(4268, 80, 15, 1, var4);
      Method1835(4269, 80, 45, 2, var4);
      Method1835(358, 95, 75, 3, var4);
      Method1756(4, var5);
      Method1835(17882, 20, 30, 0, var5);
      Method1835(4268, 80, 15, 1, var5);
      Method1835(4269, 80, 45, 2, var5);
      Method1835(358, 95, 75, 3, var5);
      Method1756(4, var6);
      Method1835(17883, 20, 30, 0, var6);
      Method1835(4268, 80, 15, 1, var6);
      Method1835(4269, 80, 45, 2, var6);
      Method1835(358, 95, 75, 3, var6);
      Method1756(4, var7);
      Method1835(17884, 20, 30, 0, var7);
      Method1835(4268, 80, 15, 1, var7);
      Method1835(4269, 80, 45, 2, var7);
      Method1835(358, 95, 75, 3, var7);
      Method1756(4, var8);
      Method1835(17885, 20, 30, 0, var8);
      Method1835(4268, 80, 15, 1, var8);
      Method1835(4269, 80, 45, 2, var8);
      Method1835(358, 95, 75, 3, var8);
      Method1756(4, var9);
      Method1835(17886, 20, 30, 0, var9);
      Method1835(4268, 80, 15, 1, var9);
      Method1835(4269, 80, 45, 2, var9);
      Method1835(358, 95, 75, 3, var9);
      Method1756(4, var10);
      Method1835(17887, 20, 30, 0, var10);
      Method1835(4268, 80, 15, 1, var10);
      Method1835(4269, 80, 45, 2, var10);
      Method1835(358, 95, 75, 3, var10);
      Method1756(4, var11);
      Method1835(17888, 20, 30, 0, var11);
      Method1835(4268, 80, 15, 1, var11);
      Method1835(4269, 80, 45, 2, var11);
      Method1835(358, 95, 75, 3, var11);
      Method1756(4, var12);
      Method1835(17889, 20, 30, 0, var12);
      Method1835(4268, 80, 15, 1, var12);
      Method1835(4269, 80, 45, 2, var12);
      Method1835(358, 95, 75, 3, var12);
      Method1756(4, var13);
      Method1835(17890, 20, 30, 0, var13);
      Method1835(4268, 80, 15, 1, var13);
      Method1835(4269, 80, 45, 2, var13);
      Method1835(358, 95, 75, 3, var13);
      Method1756(4, var14);
      Method1835(17891, 20, 30, 0, var14);
      Method1835(4268, 80, 15, 1, var14);
      Method1835(4269, 80, 45, 2, var14);
      Method1835(358, 95, 75, 3, var14);
      Method1756(4, var15);
      Method1835(17892, 20, 30, 0, var15);
      Method1835(4268, 80, 15, 1, var15);
      Method1835(4269, 80, 45, 2, var15);
      Method1835(358, 95, 75, 3, var15);
      Method1756(4, var16);
      Method1835(17893, 20, 30, 0, var16);
      Method1835(4268, 80, 15, 1, var16);
      Method1835(4269, 80, 45, 2, var16);
      Method1835(358, 95, 75, 3, var16);
      Method1756(4, var17);
      Method1835(17894, 20, 30, 0, var17);
      Method1835(4268, 80, 15, 1, var17);
      Method1835(4269, 80, 45, 2, var17);
      Method1835(358, 95, 75, 3, var17);
      Method1756(4, var18);
      Method1835(17895, 20, 30, 0, var18);
      Method1835(4268, 80, 15, 1, var18);
      Method1835(4269, 80, 45, 2, var18);
      Method1835(358, 95, 75, 3, var18);
      Method1756(4, var19);
      Method1835(17896, 20, 30, 0, var19);
      Method1835(4268, 80, 15, 1, var19);
      Method1835(4269, 80, 45, 2, var19);
      Method1835(358, 95, 75, 3, var19);
      Method1756(4, var20);
      Method1835(17897, 20, 30, 0, var20);
      Method1835(4268, 80, 15, 1, var20);
      Method1835(4269, 80, 45, 2, var20);
      Method1835(358, 95, 75, 3, var20);
      Method1756(4, var21);
      Method1835(17898, 20, 30, 0, var21);
      Method1835(4268, 80, 15, 1, var21);
      Method1835(4269, 80, 45, 2, var21);
      Method1835(358, 95, 75, 3, var21);
      Method1756(4, var22);
      Method1835(17899, 20, 30, 0, var22);
      Method1835(4268, 80, 15, 1, var22);
      Method1835(4269, 80, 45, 2, var22);
      Method1835(358, 95, 75, 3, var22);
      Method1756(4, var23);
      Method1835(17900, 20, 30, 0, var23);
      Method1835(4268, 80, 15, 1, var23);
      Method1835(4269, 80, 45, 2, var23);
      Method1835(358, 95, 75, 3, var23);
      Method1756(4, var24);
      Method1835(17901, 20, 30, 0, var24);
      Method1835(4268, 80, 15, 1, var24);
      Method1835(4269, 80, 45, 2, var24);
      Method1835(358, 95, 75, 3, var24);
      Method1756(4, var25);
      Method1835(17902, 20, 30, 0, var25);
      Method1835(4268, 80, 15, 1, var25);
      Method1835(4269, 80, 45, 2, var25);
      Method1835(358, 95, 75, 3, var25);
   }

   public static void Method1746(boolean var0, boolean var1) {
      RSFont[] var2 = Field12787;
      RSInterface var3 = Method1810(34600);
      Method1756(0, var3);
      RSInterface var4 = Method1810(34599);
      Method1756(0, var4);
      var4.Field12811 = var0 ? 454 : 260;
      var4.Field12758 = 480;
      var4.Field12762 = 0;
      var4.Field12804 = 600;
      var4.Field12775 = 34600;
      var3.Field12811 = var0 ? 527 : 334;
      Method1801(34601, var0 ? 3 : 2, "Misc/BLANK");
      Method1795(34602, "Grand Exchange", var2, 2, 13408512, true, true);
      Method1805(34603, "GE/SPRITE", 1, 21, 21, "Close", -1, 34604, 3);
      Method1806(34604, "GE/SPRITE", 3, 21, 21, 34605);
      var3.Method1813(0, 34601, 0, 0);
      var3.Method1813(1, 34602, 256, 9);
      var3.Method1813(2, 34603, 475, 9);
      var3.Method1813(3, 34604, 475, 9);
      var3.Method1813(4, 34599, -5, 36);
      int var11 = 34606;
      int var12 = 34906;
      int var5 = 0;

      for(int var6 = 0; var6 < 5; ++var6) {
         for(int var7 = 0; var7 < 3; ++var7) {
            Method1801(var12, 2, "GE/back");
            var4.Method1813(var5++, var12++, 33 + var7 * 156 - 12, 36 + var6 * 120 - 30);
            int var8 = 0;
            int var9 = 1;
            if (var1 && Field12749[var11 + 9].Field12796 != null) {
               var8 = Field12749[var11 + 9].Field12796[0];
               var9 = Field12749[var11 + 9].Field12795[0];
            }

            Method1804(var11 + 9, "Item", var8, var9);
            Method1805(var11 + 13, "GE/new", 30, 40, 36, "Check", -1, var11 + 14, 5);
            Method1806(var11 + 14, "GE/new", 31, 40, 36, var11 + 15);
            Method1802(var11 + 6, 30, "GE/new");
            Method1805(var11, "GE/new", 41, 26, 35, "Buy", -1, var11 + 1, 5);
            Method1806(var11 + 1, "GE/new", 42, 26, 35, var11 + 2);
            Method1802(var11 + 7, 30, "GE/new");
            Method1805(var11 + 3, "GE/new", 39, 26, 35, "Sell", -1, var11 + 4, 5);
            Method1806(var11 + 4, "GE/new", 40, 26, 35, var11 + 5);
            Method1795(var11 + 8, "Empty", var2, 2, 13408512, true, true);
            Method1795(var11 + 10, var1 ? Field12749[var11 + 10].Field12792 : "", var2, 0, 13408512, false, true);
            Method1795(var11 + 11, var1 ? Field12749[var11 + 11].Field12792 : "", var2, 0, 12434267, false, true);
            Method1795(var11 + 12, var1 ? Field12749[var11 + 12].Field12792 : "", var2, 0, 16763955, false, true);
            var4.Method1813(var5++, var11 + 6, 33 + var7 * 156 - 6, 36 + var6 * 120);
            var4.Method1813(var5++, var11, 33 + var7 * 156, 36 + var6 * 120);
            var4.Method1813(var5++, var11 + 1, 33 + var7 * 156, 36 + var6 * 120);
            var4.Method1813(var5++, var11 + 7, 33 + var7 * 156 + 84 - 6, 36 + var6 * 120);
            var4.Method1813(var5++, var11 + 3, 33 + var7 * 156 + 84, 36 + var6 * 120);
            var4.Method1813(var5++, var11 + 4, 33 + var7 * 156 + 84, 36 + var6 * 120);
            var4.Method1813(var5++, var11 + 8, 33 + var7 * 156 + 55, 36 + var6 * 120 - 26);
            var4.Method1813(var5++, var11 + 10, 33 + var7 * 156 + 37, 36 + var6 * 120 + 1);
            var4.Method1813(var5++, var11 + 11, 33 + var7 * 156 + 37, 36 + var6 * 120 + 25);
            var4.Method1813(var5++, var11 + 12, 33 + var7 * 156, 36 + var6 * 120 + 55);
            var8 = var11 + 9;
            var9 = var11 + 13;
            var4.Method1813(var5++, var9, 33 + var7 * 156 - 6, 36 + var6 * 120);
            var4.Method1813(var5++, var9 + 1, 33 + var7 * 156 - 6, 36 + var6 * 120);
            var4.Method1813(var5++, var8, 33 + var7 * 156 - 2, 36 + var6 * 120 + 1);
            Field12749[var11].Field12736 = "Buy";
            Field12749[var11 + 3].Field12736 = "Sell";
            Field12749[var9].Field12736 = "Check";

            int var10;
            for(var10 = var11; var10 < var11 + 8; ++var10) {
               if (var10 != var11 + 6) {
                  Field12749[var10].Field12776 = var8;
               }
            }

            Field12749[var8].Field12779 = true;
            Field12749[var11 + 5].Field12779 = true;

            for(var10 = var9; var10 < var9 + 3; ++var10) {
               Field12749[var10].Field12776 = var11 + 5;
               Field12749[var10].Field12779 = true;
               Field12749[var10].Field12778 = true;
            }

            for(var10 = 0; var10 < 16; ++var10) {
               if (Field12749[var11 + var10] != null) {
                  Field12749[var11 + var10].Field12783 = null;
               }
            }

            var11 += 16;
         }
      }

   }

   private static void Method1747() {
      RSFont[] var0 = Field12787;
      char var1 = 'ꀨ';
      int var11 = var1 + 1;
      RSInterface var2;
      (var2 = Method1810(41000)).Method1814(10);
      ++var11;
      ++var11;
      ++var11;
      ++var11;
      ++var11;
      ++var11;
      ++var11;
      ++var11;
      ++var11;
      ++var11;
      ++var11;
      ++var11;
      ++var11;
      ++var11;
      ++var11;
      ++var11;
      ++var11;
      ++var11;
      ++var11;
      ++var11;
      ++var11;
      ++var11;
      Method1801(41021, 4, "/Friends/SPRITE");
      Method1801(41022, 8, "/Friends/SPRITE");
      var2.Method1813(0, 41022, 2, 25);
      var2.Method1813(1, 41014, 0, 27);
      var2.Method1813(2, 41021, 2, 221);
      var2.Method1813(3, 41021, 2, 25);
      ++var11;
      ++var11;
      ++var11;
      ++var11;
      ++var11;
      ++var11;
      ++var11;
      Method1807(41024, "Quest/SPRITE", 2, 3, "E-Mail Registration");
      Method1807(41026, "Quest/SPRITE", 2, 3, "Member Information");
      Method1807(41028, "Quest/SPRITE", 2, 3, "Maxhit");
      boolean var10 = true;
      boolean var7 = true;
      var7 = false;
      Object var16 = null;
      String var20 = "/Quest/email";
      var7 = false;
      boolean var9 = true;
      char var8 = 'ꀨ';
      char var17 = 'ꀿ';
      RSInterface var3;
      (var3 = Method1810(41023)).Field12775 = 41000;
      var3.Field12794 = 41023;
      var3.Field12805 = 5;
      var3.Field12754 = 5;
      var3.Field12751 = 0;
      var3.Field12797 = 0;
      var3.Field12767 = -1;
      var3.Field12789 = new int[1];
      var3.Field12750 = new int[1];
      var3.Field12789[0] = 1;
      var3.Field12750[0] = 0;
      var3.Field12764 = new int[1][3];
      var3.Field12764[0][0] = 5;
      var3.Field12764[0][1] = 2006;
      var3.Field12764[0][2] = 0;
      boolean var4 = true;
      var3.Field12745 = Method1811(1, var20, 1.0F);
      var4 = false;
      var3.Field12803 = Method1811(0, var20, 1.0F);
      var3.Field12759 = null;
      if (var20.equals("/Emotes/EMOTE")) {
         var3.Field12736 = null;
      }

      var3.Field12758 = var3.Field12745.Field9894;
      var3.Field12811 = var3.Field12745.Field9895;
      Method1801(41025, -255, "/Quest/vip_badge");
      Method1801(41027, -255, "/Quest/maxhit_s");
      Method1795(41029, "30d", var0, 0, 16776960, true, true);
      Method1801(41020, 4, "/Quest/SPRITE");
      var2.Method1813(4, 41024, 8, 227);
      var2.Method1813(5, 41023, 15, 231);
      var2.Method1813(6, 41026, 70, 227);
      var2.Method1813(7, 41025, 73, 227);
      var2.Method1813(8, 41029, 99, 239);
      var2.Method1813(9, 41028, 132, 227);
      var2.Method1813(10, 41027, 136, 231);
      Method1801(41017, -255, "/Quest/players");
      Method1795(41018, "100", var0, 2, 16777215, false, true);
      Method1801(41015, -255, "/Quest/world");
      Method1795(41016, "W1", var0, 2, 16777215, false, true);
      var2.Method1813(11, 41017, 4, 2);
      var2.Method1813(12, 41018, 28, 4);
      var2.Method1813(13, 41015, 168, 2);
      var2.Method1813(14, 41016, 146, 4);
      var3 = Method1810(41014);
      Method1756(1, var3);
      Method1835(41014, 0, 27, 1, var2);
      var3.Field12811 = 193;
      var3.Field12758 = 175;
      var3.Field12762 = 0;
      var3.Field12804 = 400;
      var3.Field12775 = 41000;
      Method1807(41001, "Quest/TP", 2, 1, "Teleport to Barbarian Village");
      Method1807(41002, "Quest/TP", 2, 1, "Teleport to Grand Exchange");
      Method1807(41003, "Quest/TP", 2, 1, "Teleport to Al-Kharid");
      Method1807(41004, "Quest/TP", 0, 0, "Teleport to");
      Method1807(41005, "Quest/TP", 0, 0, "Teleport to");
      Method1807(41006, "Quest/TP", 0, 0, "Teleport to");
      byte var12 = 0;
      Method1795(41007, "Teleports", var0, 2, 16777215, false, true);
      Method1795(41008, "B", var0, 1, 16777215, true, true);
      Method1795(41009, "$", var0, 1, 16777215, true, true);
      Method1795(41010, "K", var0, 1, 16777215, true, true);
      Method1795(41011, "", var0, 1, 16777215, true, true);
      Method1795(41012, "", var0, 1, 16777215, true, true);
      Method1795(41013, "", var0, 1, 16777215, true, true);
      int var13 = var12 + 1;
      var3.Method1813(0, 41007, 10, 3);
      ++var13;
      var3.Method1813(1, 41001, 14, 23);
      ++var13;
      var3.Method1813(2, 41008, 34, 36);
      ++var13;
      var3.Method1813(3, 41002, 70, 23);
      ++var13;
      var3.Method1813(4, 41009, 90, 36);
      ++var13;
      var3.Method1813(5, 41003, 126, 23);
      ++var13;
      var3.Method1813(6, 41010, 146, 36);
      byte var14 = 73;
      Method1795(41019, "Quests", var0, 2, 16777215, false, true);
      ++var13;
      var3.Method1813(7, 41019, 10, 73);
      int var15 = var14 + 16;

      for(int var5 = 0; var5 < 20; ++var5) {
         int var6;
         int var10000 = var6 = var11++;
         var7 = true;
         var7 = false;
         int var19 = 16777215;
         int var21 = 16711680;
         var7 = true;
         String var18 = "";
         var19 = var10000;
         RSInterface var22;
         (var22 = Field12749[var19] = new RSInterface()).Field12761 = false;
         var22.Field12812 = true;
         var22.Field12786 = var0[1];
         var22.Field12792 = var18;
         var22.Field12771 = 16711680;
         var22.Field12794 = var19;
         var22.Field12805 = 4;
         var22.Field12753 = 16777215;
         var22.Field12758 = 150;
         var22.Field12811 = 13;
         var22.Field12768 = true;
         var22.Field12759 = var18;
         var22.Field12754 = 1;
         var22.Field12751 = 0;
         var22.Field12767 = 420;
         var3.Method1813(var13++, var6, 16, var15);
         var15 += 14;
      }

   }

   public static void Method1748(boolean var0, boolean var1) {
      RSFont[] var2 = Field12787;
      char var3 = '鵬';
      int var13 = var3 + 1;
      RSInterface var4;
      (var4 = Method1810(40300)).Field12817 = true;
      var4.Field12811 = var0 ? 527 : 334;
      ++var13;
      ++var13;
      ++var13;
      ++var13;
      ++var13;
      ++var13;
      ++var13;
      Method1801(40307, var0 ? 1 : 0, "Misc/BLANK");
      ++var13;
      ++var13;
      ++var13;
      Method1753(40306, 4, 40308, 13, 13, "Bank/BANK", 35, 25, 0, 1, "Check item", 40309, 14, 14, "Bank/BANK", 40310, "Check item", "", 12, 20);
      Field12749['鵲'].Field12817 = true;
      ++var13;
      ++var13;
      ++var13;
      Method1755(40305, 5, 40311, 17, "Bank/BANK", 35, 25, "Check inventory", 40312, 18, "Bank/BANK", 40313, "Check inventory", 0, 20, 36);
      ++var13;
      ++var13;
      Method1805(40314, "GE/SPRITE", 1, 21, 21, "Close", -1, 40315, 3);
      ++var13;
      Method1806(40315, "GE/SPRITE", 3, 21, 21, 40316);
      ++var13;
      ++var13;
      ++var13;
      ++var13;
      Method1755(40317, 5, 40318, 0, "GE/hover", 35, 25, "Clear selection", 40319, 1, "GE/hover", 40320, "Clear selection", 0, 20, 36);
      Method1795(40304, "Clear", var2, 0, 16754785, false, true);
      var4.Method1814(14);
      var4.Method1813(0, 40307, 0, 0);
      int var5 = 271 + (var0 ? 193 : 0);
      var4.Method1813(1, 40306, 9, var5);
      var4.Method1813(2, 40308, -6, var5 - 60);
      var5 = 271 + (var0 ? 193 : 0);
      var4.Method1813(3, 40305, 443, var5);
      var4.Method1813(4, 40311, 407, var5 - 60);
      var4.Method1813(5, 40314, 464, 3);
      var4.Method1813(6, 40315, 464, 3);
      var4.Method1813(7, 40317, 403, var5);
      var4.Method1813(8, 40318, 367, var5 - 60);
      var4.Method1813(9, 40304, 407, var5 + 6);
      var4.Method1813(10, 40303, 246, 4);
      Method1795(40303, "Price Checker", var2, 2, 13408512, true, true);
      RSInterface var6 = Method1810(40301);
      Method1756(101, var6);
      Method1835(40301, -16, 22, 11, var4);
      var6.Field12811 = var4.Field12811 - 125 + 37;
      var6.Field12758 = var4.Field12758 - 32;
      var6.Field12762 = 0;
      var6.Field12804 = 1650;
      var6.Field12775 = 40300;
      Method1835(40302, 62, 12, 0, var6);
      int[] var10 = var1 ? Field12749['鵮'].Field12796 : null;
      int[] var14 = var1 ? Field12749['鵮'].Field12795 : null;
      RSInterface var7;
      (var7 = Method1810(40302)).Field12758 = 5;
      var7.Field12770 = 54;
      var7.Field12788 = 50;
      var7.Field12811 = 100 / var7.Field12758;
      var7.Field12804 = 0;
      var7.Field12817 = true;
      var7.Field12805 = 2;
      var7.Field12775 = 40300;
      var7.Field12763 = new String[]{"Remove 1", "Remove 5", "Remove 10", "Remove All", "Remove X"};
      if (var1) {
         var7.Field12796 = var10;
         var7.Field12795 = var14;
      } else {
         var7.Field12796 = new int[100];
         var7.Field12795 = new int[100];
      }

      ++var13;

      int var8;
      for(var8 = 0; var8 < 100; ++var8) {
         String var9;
         if (var1) {
            var9 = Field12749[var13].Field12792;
         } else {
            var9 = "Frame " + var8;
            var7.Field12796[var8] = 4152;
            var7.Field12795[var8] = 20;
         }

         int var11 = var8 % 5 * (var7.Field12770 + 32) + 78;
         var5 = var8 / 5 * (var7.Field12788 + 32) + 48;
         Method1797(var13, var9, var2, 0, 13408512, true, true, 60, false);
         Method1835(var13, var11, var5, var8 + 1, var6);
         ++var13;
      }

      var8 = var13++;
      var4.Method1813(12, var8, 246, var4.Field12811 - 65);
      Method1795(var8, "Total Value", var2, 1, 13408512, true, true);
      String var12 = var1 ? Field12749[var13].Field12792 : "?";
      var4.Method1813(13, var13, 246, var4.Field12811 - 49);
      Method1795(var13, var12, var2, 0, 14540253, true, true);
   }

   public static void Method1749(boolean var0, boolean var1) {
      char var2 = '鲤';
      RSFont[] var3 = Field12787;
      int var4;
      int var5 = (var4 = var0 ? 527 : 334) - 334;
      RSInterface var6;
      (var6 = Method1810(39900)).Field12817 = true;
      int var7 = var0 ? 12 : 8;
      Method1756(7 + var7 * 3, var6);
      byte var8 = 0;
      Method1801(39901, var0 ? 1 : 0, "Misc/BLANK");
      int var15 = var8 + 1;
      Method1835(39901, 13, 13, 0, var6);
      ++var15;
      Method1835(5384, 476, 16, 1, var6);
      ++var15;
      Method1835(5380, 476, 16, 2, var6);
      int var9 = var1 && Field12749['鲤'] != null ? Field12749['鲤'].Field12804 : 100;
      RSInterface var10 = Method1810(40100);
      int var11 = 1;
      Method1756(601, var10);
      ++var15;
      Method1835(40100, -4, 35, 3, var6);
      var10.Field12811 = var4 - 125 + 37;
      var10.Field12758 = 512 - (var0 ? 157 : 155);
      var10.Field12762 = 0;
      var10.Field12804 = 10200;
      var10.Field12775 = 39900;
      var10.Field12804 = var9;
      int var14 = var2 + 1;
      Method1835(40005, 52, 28, 0, var10);
      int[] var16 = var1 ? Field12749['鱅'].Field12796 : null;
      int[] var12 = var1 ? Field12749['鱅'].Field12795 : null;
      RSInterface var13;
      (var13 = Method1810(40005)).Field12758 = 1;
      var13.Field12770 = 24;
      var13.Field12788 = 2;
      var13.Field12811 = 300;
      var13.Field12817 = true;
      var13.Field12805 = 2;
      var13.Field12775 = 39900;
      if (var1) {
         var13.Field12796 = var16;
         var13.Field12795 = var12;
      } else {
         var9 = var13.Field12758 * var13.Field12811;
         var13.Field12796 = new int[var9];
         var13.Field12795 = new int[var9];
      }

      var9 = 34;

      int var17;
      String var18;
      for(var17 = 0; var17 < 300; ++var17) {
         var18 = var1 && Field12749[var14].Field12792 != null ? Field12749[var14].Field12792 : "Text " + var14;
         Method1795(var14, var18, var3, 0, 13408512, false, true);
         Method1835(var14++, 88, var9, var11++, var10);
         var9 += 34;
      }

      var9 = 34;

      for(var17 = 0; var17 < 300; ++var17) {
         var18 = var1 && Field12749[var14] != null ? Field12749[var14].Field12792 : String.valueOf(var14);
         Method1795(var14, var18, var3, 3, 13408512, true, true);
         Method1835(var14++, 41, var9, var11++, var10);
         var9 += 34;
      }

      String var19 = var1 ? Field12749['鯞'].Field12792 : "Skill Advancements";
      Method1795(39902, var19, var3, 2, 13408512, true, true);
      ++var15;
      Method1835(39902, 250, 17, 4, var6);
      var19 = var1 ? Field12749['鯟'].Field12792 : "Level";
      Method1795(39903, var19, var3, 2, 13408512, false, true);
      ++var15;
      Method1835(39903, 23, 40, 5, var6);
      var19 = var1 ? Field12749['鯠'].Field12792 : "Able to do";
      Method1795(39904, var19, var3, 2, 13408512, false, true);
      ++var15;
      Method1835(39904, 83, 40, 6, var6);
      Field12743 = var5;
      int var20 = var0 ? 370 : 371;
      var14 = var0 ? -155 : 37;

      for(var5 = 39905; var5 < '鯡' + var7 * 5; var5 += 5) {
         Method1805(var5, "Misc/BUTTON", 2, 120, 32, "View requirements", -1, var5 + 1, 5);
         Method1806(var5 + 1, "Misc/BUTTON", 3, 120, 32, var5 + 2);
         Method1835(var5, var20, var14, var15++, var6);
         Method1835(var5 + 1, var20, var14, var15++, var6);
         var19 = var1 && Field12749[var5 + 4] != null ? Field12749[var5 + 4].Field12792 : "";
         Method1795(var5 + 4, var19, var3, 2, 13408512, true, true);
         Method1835(var5 + 4, var20 + 60, var14 + 10, var15++, var6);
         var14 += var0 ? 35 : 34;
      }

      Field12743 = 0;
      var6.Field12811 = var4;
      var6.Field12758 = 512;
      Field12743 = 0;
   }

   public static void Method1750(boolean var0, boolean var1) {
      RSFont[] var2 = Field12787;
      int var3;
      int var4 = (var3 = var0 ? 527 : 334) - 334;
      RSInterface var5;
      (var5 = Method1810(39600)).Field12817 = true;
      Method1756(9, var5);
      Method1801(39601, var0 ? 1 : 0, "Misc/BLANK");
      Method1835(39601, 13, 13, 0, var5);
      Method1835(5384, 476, 16, 1, var5);
      Method1835(5380, 476, 16, 2, var5);
      RSInterface var6 = Method1810(39700);
      Method1756(1, var6);
      Method1835(39700, -4, 35, 3, var5);
      var6.Field12811 = var3 - 125 + 37;
      var6.Field12758 = 480;
      var6.Field12762 = 0;
      var6.Field12804 = 3000;
      var6.Field12775 = 39600;
      var6.Field12818 = true;
      Method1835(39705, 68, 32, 0, var6);
      if (!var1) {
         (var6 = Method1810(39705)).Field12758 = 5;
         var6.Field12770 = 52;
         var6.Field12788 = 50;
         var6.Field12811 = 90;
         var6.Field12817 = true;
         var6.Field12818 = true;
         var6.Field12805 = 2;
         var6.Field12775 = 39600;
         var6.Field12796 = new int[1];
         var6.Field12795 = new int[1];
         var6.Field12730 = new Npc[1];
      }

      Method1795(39602, "Kill Logs", var2, 2, 13408512, true, true);
      Method1835(39602, 250, 16, 4, var5);
      Field12743 = var4;
      Method1753(39715, 4, 39716, 13, 13, "Bank/BANK", 35, 25, 0, 1, "Search", 39717, 14, 14, "Bank/BANK", 39718, "Search a monster", "", 12, 20);
      Method1835(39715, 22, 284, 5, var5);
      Method1835(39716, 7, 224, 6, var5);
      Method1795(39603, "Show idle animations (could lag)", var2, 1, 16751360, false, true);
      Method1835(39603, 86, 288, 7, var5);
      Method1781(39710, 40, 39, "/Options/SPRITE", "Idle animations", 1, 4, 1998);
      Method1835(39710, 66, 287, 8, var5);
      Field12743 = 0;
      var5.Field12811 = var3;
      var5.Field12758 = 512;
      var5.Field12818 = true;
      Field12743 = 0;
   }

   private static void Method1751(RSFont[] var0) {
      RSInterface var1;
      (var1 = Method1810(37600)).Method1814(28);
      Method1801(37601, 0, "GE/back");
      Method1805(37623, "GE/SPRITE", 1, 21, 21, "Close", -1, 37624, 3);
      Method1806(37624, "GE/SPRITE", 3, 21, 21, 37625);
      Method1795(37626, "Grand Exchange", var0, 2, 13408512, true, true);
      Method1793(37602, "0", 16754785, true, true, -1, var0, 2);
      Method1793(37603, "0", 16754785, true, true, -1, var0, 2);
      Method1793(37604, "0", 15459699, true, true, -1, var0, 2);
      Method1793(37627, "Name", 13408512, true, true, -1, var0, 0);
      Method1793(37610, "Quantity:", 13408512, true, true, -1, var0, 1);
      Method1793(37611, "Price per item:", 13408512, true, true, -1, var0, 1);
      Method1793(37631, "You have exchanged a total of 0 so far", 13408512, true, true, -1, var0, 0);
      Method1793(37632, "for a total price of 0 gp.", 13408512, true, true, -1, var0, 0);
      Method1793(37633, "Completed: 0%", 13408512, true, true, -1, var0, 0);
      Method1795(37620, "Collect exchanged items", var0, 2, 13408512, false, true);
      Method1795(37621, "Click on the boxes in the right bottom corner to", var0, 0, 12691573, false, true);
      Method1795(37622, "collect your sold or bought items.", var0, 0, 12691573, false, true);
      Method1805(37605, "GE/new", 19, 35, 35, "Back to mainscreen", -1, 37606, 1);
      Method1806(37606, "GE/new", 18, 35, 35, 37607);
      Field12749['鋥'].Field12736 = "Back to mainscreen";
      Method1802(37608, 30, "GE/new");
      byte var3 = 0;
      String var2 = "Item";
      char var4 = '鋩';
      Method1804(37609, var2, var3, 1);
      Method1805(37612, "GE/new", 30, 40, 36, "Take", -1, 37613, 5);
      Method1806(37613, "GE/new", 31, 40, 36, 37614);
      var3 = 0;
      var2 = "Item";
      var4 = '鋯';
      Method1804(37615, var2, var3, 1);
      Method1805(37616, "GE/new", 30, 40, 36, "Take", -1, 37617, 5);
      Method1806(37617, "GE/new", 31, 40, 36, 37618);
      var3 = 0;
      var2 = "Item";
      var4 = '鋳';
      Method1804(37619, var2, var3, 1);
      Method1805(37628, "GE/new", 37, 20, 20, "Abort offer", -1, 37629, 1);
      Method1806(37629, "GE/new", 38, 20, 20, 37630);
      Field12749['鋼'].Field12736 = "Abort offer";
      var1.Method1813(0, 37601, 0, 0);
      var1.Method1813(1, 37602, 137, 160);
      var1.Method1813(2, 37603, 349, 160);
      var1.Method1813(3, 37604, 246, 221);
      var1.Method1813(4, 37605, 41, 262);
      var1.Method1813(5, 37606, 39, 262);
      var1.Method1813(6, 37608, 88, 72);
      var1.Method1813(7, 37609, 92, 75);
      var1.Method1813(8, 37610, 137, 138);
      var1.Method1813(9, 37611, 349, 138);
      var1.Method1813(10, 37612, 388, 253);
      var1.Method1813(11, 37613, 388, 253);
      var1.Method1813(12, 37615, 392, 256);
      var1.Method1813(13, 37616, 434, 253);
      var1.Method1813(14, 37617, 434, 253);
      var1.Method1813(15, 37619, 438, 257);
      var1.Method1813(16, 37620, 195, 48);
      var1.Method1813(17, 37621, 195, 75);
      var1.Method1813(18, 37622, 195, 87);
      var1.Method1813(19, 37623, 465, 9);
      var1.Method1813(20, 37624, 465, 9);
      var1.Method1813(21, 37626, 246, 9);
      var1.Method1813(22, 37627, 109, 112);
      var1.Method1813(23, 37628, 344, 247);
      var1.Method1813(24, 37629, 344, 247);
      var1.Method1813(25, 37631, 208, 246);
      var1.Method1813(26, 37632, 208, 256);
      var1.Method1813(27, 37633, 208, 281);
   }

   private static void Method1752(RSFont[] var0, boolean var1) {
      char var2 = 32600;
      if (!var1) {
         var2 = '荀';
      }

      RSInterface var3;
      (var3 = Method1810(var2)).Method1814(53);
      Method1801(var2 + 1, 0, "GE/back");
      Method1793(var2 + 2, "0", 16754785, true, true, -1, var0, 2);
      Method1793(var2 + 3, "0", 16754785, true, true, -1, var0, 2);
      Method1793(var2 + 4, "0", 15459699, true, true, -1, var0, 2);
      Method1793(var2 + 67, "Name", 13408512, true, true, -1, var0, 0);
      Method1793(var2 + 68, "Quantity:", 13408512, true, true, -1, var0, 1);
      Method1793(var2 + 69, "Price per item:", 13408512, true, true, -1, var0, 1);
      Method1793(var2 + 48, "+1", 16750592, true, true, -1, var0, 0);
      Method1793(var2 + 49, "+10", 16750592, true, true, -1, var0, 0);
      Method1793(var2 + 50, "+100", 16750592, true, true, -1, var0, 0);
      Method1793(var2 + 51, var1 ? "+1k" : "All", 16750592, true, true, -1, var0, 0);
      Method1793(var2 + 52, "...", 16750592, true, true, -1, var0, 0);
      Method1793(var2 + 53, "-5%", 16750592, true, true, -1, var0, 0);
      Method1793(var2 + 54, "Base", 16750592, true, true, -1, var0, 0);
      Method1793(var2 + 55, "...", 16750592, true, true, -1, var0, 0);
      Method1793(var2 + 56, "+5%", 16750592, true, true, -1, var0, 0);
      Method1805(var2 + 5, "GE/SPRITE", 1, 21, 21, "Close", -1, var2 + 18, 3);
      Method1806(var2 + 18, "GE/SPRITE", 3, 21, 21, var2 + 19);
      Method1805(var2 + 6, "GE/new", 20, 120, 43, "Confirm", -1, var2 + 7, 5);
      Method1806(var2 + 7, "GE/new", 21, 120, 43, var2 + 20);
      Method1805(var2 + 57, "GE/new", 30, 40, 36, "Search item", -1, var2 + 58, 5);
      Method1806(var2 + 58, "GE/new", 31, 40, 36, var2 + 59);
      Method1802(var2 + 62, 32, "GE/new");
      int var10000 = var2 + 66;
      byte var6 = 0;
      String var5 = "Item";
      Method1804(var10000, var5, var6, 1);
      Method1795(var2 + 60, "Choose an item to exchange", var0, 2, 13408512, false, true);
      Method1795(var2 + 61, var1 ? "Click the icon to the left to search for items." : "Select an item from your inventory to sell.", var0, 0, 12691573, false, true);
      Method1795(var2 + 63, var1 ? "Buy Offer" : "Sell Offer", var0, 2, 13408512, true, true);
      Method1802(var2 + 64, var1 ? 33 : 34, "GE/new");
      Method1795(var2 + 65, "Grand Exchange", var0, 2, 13408512, true, true);
      Method1805(var2 + 8, "GE/hover", 0, 35, 25, "Add 1", -1, var2 + 9, 5);
      Method1806(var2 + 9, "GE/hover", 1, 35, 25, var2 + 21);
      Method1805(var2 + 24, "GE/hover", 0, 35, 25, "Add 10", -1, var2 + 25, 5);
      Method1806(var2 + 25, "GE/hover", 1, 35, 25, var2 + 26);
      Method1805(var2 + 27, "GE/hover", 0, 35, 25, "Add 100", -1, var2 + 28, 5);
      Method1806(var2 + 28, "GE/hover", 1, 35, 25, var2 + 29);
      Method1805(var2 + 30, "GE/hover", 0, 35, 25, "Add 1k", -1, var2 + 31, 5);
      Method1806(var2 + 31, "GE/hover", 1, 35, 25, var2 + 32);
      Method1805(var2 + 33, "GE/hover", 0, 35, 25, "Enter quantity", -1, var2 + 34, 5);
      Method1806(var2 + 34, "GE/hover", 1, 35, 25, var2 + 35);
      Method1805(var2 + 36, "GE/hover", 0, 35, 25, "Minus 5%", -1, var2 + 37, 5);
      Method1806(var2 + 37, "GE/hover", 1, 35, 25, var2 + 38);
      Method1805(var2 + 39, "GE/hover", 0, 35, 25, "Base price", -1, var2 + 40, 5);
      Method1806(var2 + 40, "GE/hover", 1, 35, 25, var2 + 41);
      Method1805(var2 + 42, "GE/hover", 0, 35, 25, "Enter price", -1, var2 + 43, 5);
      Method1806(var2 + 43, "GE/hover", 1, 35, 25, var2 + 44);
      Method1805(var2 + 45, "GE/hover", 0, 35, 25, "Plus 5%", -1, var2 + 46, 5);
      Method1806(var2 + 46, "GE/hover", 1, 35, 25, var2 + 47);
      Method1805(var2 + 10, "GE/new", 29, 13, 13, "Subtract 1", 0, 54509, 1);
      Method1805(var2 + 11, "GE/new", 27, 13, 13, "Add 1", 0, 54510, 1);
      Method1805(var2 + 12, "GE/new", 29, 13, 13, "Subtract 1", 0, 54511, 1);
      Method1805(var2 + 13, "GE/new", 27, 13, 13, "Add 1", 0, 54512, 1);
      Method1805(var2 + 16, "GE/new", 19, 35, 35, "Back to mainscreen", -1, var2 + 17, 1);
      Method1806(var2 + 17, "GE/new", 18, 35, 35, var2 + 23);
      Field12749[var2 + 16].Field12736 = "Back to mainscreen";
      Field12732 = 10;
      Field12733 = 17;
      var3.Method1813(0, var2 + 1, 10, 17);
      var3.Method1813(1, var2 + 2, 147, 177);
      var3.Method1813(2, var2 + 3, 359, 177);
      var3.Method1813(3, var2 + 4, 256, 238);
      var3.Method1813(4, var2 + 5, 475, 26);
      var3.Method1813(5, var2 + 6, 199, 266);
      var3.Method1813(6, var2 + 7, 199, 266);
      var3.Method1813(9, var2 + 10, 54, 177);
      var3.Method1813(10, var2 + 11, 228, 177);
      var3.Method1813(11, var2 + 12, 268, 177);
      var3.Method1813(12, var2 + 13, 437, 177);
      var3.Method1813(15, var2 + 16, 51, 279);
      var3.Method1813(16, var2 + 17, 49, 279);
      var3.Method1813(17, var2 + 18, 475, 26);
      var3.Method1813(7, var2 + 8, 50, 201);
      var3.Method1813(8, var2 + 9, 50, 201);
      var3.Method1813(18, var2 + 24, 90, 201);
      var3.Method1813(19, var2 + 25, 90, 201);
      var3.Method1813(20, var2 + 27, 130, 201);
      var3.Method1813(21, var2 + 28, 130, 201);
      var3.Method1813(22, var2 + 30, 170, 201);
      var3.Method1813(23, var2 + 31, 170, 201);
      var3.Method1813(24, var2 + 33, 210, 201);
      var3.Method1813(25, var2 + 34, 210, 201);
      var3.Method1813(32, var2 + 48, 66, 207);
      var3.Method1813(33, var2 + 49, 106, 207);
      var3.Method1813(34, var2 + 50, 146, 207);
      var3.Method1813(35, var2 + 51, 186, 207);
      var3.Method1813(36, var2 + 52, 226, 207);
      var3.Method1813(13, var2 + 36, 260, 201);
      var3.Method1813(14, var2 + 37, 260, 201);
      var3.Method1813(26, var2 + 39, 320, 201);
      var3.Method1813(27, var2 + 40, 320, 201);
      var3.Method1813(28, var2 + 42, 360, 201);
      var3.Method1813(29, var2 + 43, 360, 201);
      var3.Method1813(30, var2 + 45, 420, 201);
      var3.Method1813(31, var2 + 46, 420, 201);
      var3.Method1813(37, var2 + 53, 276, 207);
      var3.Method1813(38, var2 + 54, 336, 207);
      var3.Method1813(39, var2 + 55, 376, 207);
      var3.Method1813(40, var2 + 56, 436, 207);
      var3.Method1813(41, var2 + 57, 98, 89);
      var3.Method1813(42, var2 + 58, 98, 89);
      var3.Method1813(45, var2 + 62, 80, 100);
      var3.Method1813(43, var2 + 60, 205, 65);
      var3.Method1813(44, var2 + 61, 205, 92);
      var3.Method1813(46, var2 + 63, 118, 61);
      var3.Method1813(47, var2 + 64, 182, 62);
      var3.Method1813(48, var2 + 65, 256, 26);
      var3.Method1813(49, var2 + 66, 102, 92);
      var3.Method1813(50, var2 + 67, 119, 128);
      var3.Method1813(51, var2 + 68, 147, 155);
      var3.Method1813(52, var2 + 69, 359, 155);
      Field12732 = 0;
      Field12733 = 0;
   }

   private static void Method1753(int var0, int var1, int var2, int var3, int var4, String var5, int var6, int var7, int var8, int var9, String var10, int var11, int var12, int var13, String var14, int var15, String var16, String var17, int var18, int var19) {
      RSInterface var20;
      (var20 = Method1810(var0)).Field12794 = var0;
      var20.Field12775 = var0;
      var20.Field12805 = 5;
      var20.Field12754 = 4;
      var20.Field12751 = 0;
      var20.Field12797 = 0;
      var20.Field12767 = var2;
      var20.Field12745 = Method1811(var3, var5, 1.0F);
      var20.Field12803 = Method1811(var4, var5, 1.0F);
      var20.Field12758 = 35;
      var20.Field12759 = var10;
      var20.Field12811 = 25;
      var20.Field12789 = new int[1];
      var20.Field12750 = new int[1];
      var20.Field12789[0] = 1;
      var20.Field12750[0] = 1;
      var20.Field12764 = new int[1][3];
      var20.Field12764[0][0] = 5;
      var20.Field12764[0][1] = var8;
      var20.Field12764[0][2] = 0;
      (var20 = Method1810(var2)).Field12775 = var2;
      var20.Field12794 = var2;
      var20.Field12805 = 0;
      var20.Field12754 = 0;
      var20.Field12758 = 550;
      var20.Field12811 = 334;
      var20.Field12810 = true;
      var20.Field12767 = -1;
      Method1754(var11, var12, var13, var14, 1, var8);
      Method1758(var15, var0, var16, 1, var8);
      Method1756(2, var20);
      Method1835(var11, 15, 60 - Field12743, 0, var20);
      Method1835(var15, 12, 20 - Field12743, 1, var20);
   }

   private static void Method1754(int var0, int var1, int var2, String var3, int var4, int var5) {
      RSInterface var6;
      (var6 = Method1810(var0)).Field12794 = var0;
      var6.Field12775 = var0;
      var6.Field12805 = 5;
      var6.Field12754 = 0;
      var6.Field12751 = 0;
      var6.Field12758 = 512;
      var6.Field12811 = 334;
      var6.Field12767 = -1;
      var6.Field12789 = new int[1];
      var6.Field12750 = new int[1];
      var6.Field12789[0] = 1;
      var6.Field12750[0] = var4;
      var6.Field12764 = new int[1][3];
      var6.Field12764[0][0] = 5;
      var6.Field12764[0][1] = var5;
      var6.Field12764[0][2] = 0;
      var6.Field12745 = Method1811(var1, var3, 1.0F);
      var6.Field12803 = Method1811(var2, var3, 1.0F);
   }

   private static void Method1755(int var0, int var1, int var2, int var3, String var4, int var5, int var6, String var7, int var8, int var9, String var10, int var11, String var12, int var13, int var14, int var15) {
      RSInterface var16;
      (var16 = Method1810(var0)).Field12794 = var0;
      var16.Field12775 = var0;
      var16.Field12805 = 5;
      var16.Field12754 = 5;
      var16.Field12751 = 0;
      var16.Field12797 = 0;
      var16.Field12767 = var2;
      var16.Field12745 = Method1811(var3, var4, 1.0F);
      var16.Field12758 = 35;
      var16.Field12759 = var7;
      var16.Field12811 = 25;
      (var16 = Method1810(var2)).Field12775 = var2;
      var16.Field12794 = var2;
      var16.Field12805 = 0;
      var16.Field12754 = 0;
      var16.Field12758 = 550;
      var16.Field12811 = 334;
      var16.Field12810 = true;
      var16.Field12767 = -1;
      Method1754(var8, var9, var9, var10, 0, 0);
      Method1758(var11, var0, var12, 0, 0);
      Method1756(2, var16);
      Method1835(var8, var15, 60 - Field12743, 0, var16);
      Method1835(var11, 0, 20 - Field12743, 1, var16);
   }

   private static void Method1756(int var0, RSInterface var1) {
      var1.Field12783 = new int[var0];
      var1.Field12784 = new int[var0];
      var1.Field12816 = new int[var0];
   }

   private static void Method1757(int var0, int var1, int var2, RSInterface var3) {
      int var4 = var3.Field12783.length + 1;
      var3.Field12783 = Arrays.copyOf(var3.Field12783, var4);
      var3.Field12784 = Arrays.copyOf(var3.Field12784, var4);
      var3.Field12816 = Arrays.copyOf(var3.Field12816, var4);
      var3.Field12783[var4 - 1] = var0;
      var3.Field12784[var4 - 1] = var1;
      var3.Field12816[var4 - 1] = var2;
   }

   private static void Method1758(int var0, int var1, String var2, int var3, int var4) {
      RSInterface var5;
      (var5 = Method1810(var0)).Field12794 = var0;
      var5.Field12775 = var1;
      var5.Field12805 = 8;
      var5.Field12736 = var2;
      var5.Field12789 = new int[1];
      var5.Field12750 = new int[1];
      var5.Field12789[0] = 1;
      var5.Field12750[0] = var3;
      var5.Field12764 = new int[1][3];
      var5.Field12764[0][0] = 5;
      var5.Field12764[0][1] = var4;
      var5.Field12764[0][2] = 0;
   }

   public static void Method1759(boolean var0, boolean var1) {
      int var2;
      int var3 = (var2 = var0 ? 527 : 334) - 334;
      RSInterface var4;
      (var4 = Method1810(5292)).Field12817 = true;
      Method1756(34, var4);
      Method1801(5293, var0 ? 25 : 0, "Bank/BANK");
      Method1835(5293, 13, 13, 0, var4);
      Method1761(5384, 3, 0, 5380, 1, "Bank/BANK", 17, 17, "Close Window");
      Method1760(5380, 2, "Bank/BANK", 17, 17, 5379);
      Method1835(5384, 476, 16, 3, var4);
      Method1835(5380, 476, 16, 4, var4);
      Field12743 = var3;
      Method1761(5294, 4, 0, 5295, 3, "Bank/BANK", 114, 25, "Set a bank pin");
      Method1760(5295, 4, "Bank/BANK", 114, 25, 5296);
      Method1835(5294, 110, 285, 5, var4);
      Method1835(5295, 110, 285, 6, var4);
      Field12743 = 0;
      Field12743 = var3;
      Method1753(21000, 4, 21001, 5, 8, "Bank/BANK", 35, 25, 304, 1, "Swap withdraw mode", 21002, 7, 6, "Bank/BANK", 21003, "Switch to item\ninsert modes", "", 12, 20);
      Method1835(21000, 25, 285, 7, var4);
      Method1835(21001, 10, 225, 8, var4);
      Method1753(21004, 4, 21005, 13, 13, "Bank/BANK", 35, 25, 0, 1, "Search", 21006, 14, 14, "Bank/BANK", 21007, "Search an item", "", 12, 20);
      Method1835(21004, 65, 285, 9, var4);
      Method1835(21005, 50, 225, 10, var4);
      Method1753(21008, 4, 21009, 9, 11, "Bank/BANK", 35, 25, 115, 1, "Swap items noted", 21010, 10, 12, "Bank/BANK", 21011, "Switch withdrawal \nmode", "", 12, 20);
      Method1835(21008, 240, 285, 11, var4);
      Method1835(21009, 225, 225, 12, var4);
      Method1755(21012, 5, 21013, 17, "Bank/BANK", 35, 25, "Bank entire inventory", 21014, 18, "Bank/BANK", 21015, "Bank entire\n inventory", 0, 20, 36);
      Method1835(21012, 415, 285, 13, var4);
      Method1835(21013, 379, 225, 14, var4);
      Method1755(21016, 5, 21017, 19, "Bank/BANK", 35, 25, "Unequip worn items", 21018, 20, "Bank/BANK", 21019, "Unequip worn items", 0, 20, 72);
      Method1835(21016, 455, 285, 15, var4);
      Method1835(21017, 383, 225, 16, var4);
      Field12743 = 0;
      int var8 = Math.round(39.083332F);

      for(var3 = 0; var3 < 12; ++var3) {
         String var5 = var3 == 0 ? "All items" : "Bank tab " + var3;
         Method1800(var3 + 21020, 5292, var3 == 0 ? 21 : 22, var3 == 0 ? 23 : 24, "Bank/BANK", 0.8333333F, 47, 36, var5, var3, 5, 1200);
         var4.Method1813(var3 + 17, var3 + 21020, 21 + var3 * var8, 35);
         if (var3 > 0) {
            int var6 = -1;
            RSInterface var7;
            if (var1 && (var7 = Field12749[var3 + 21020 + 19]) != null && var7.Field12796 != null) {
               var6 = var7.Field12796[0];
            }

            Method1804(var3 + 21020 + 19, var5, var6, 1);
            var4.Method1813(var3 + 17 + 19, var3 + 21020 + 19, 25 + var3 * var8, 38);
         }
      }

      Method1835(5383, 170, 17, 1, var4);
      Method1835(5385, -4, 74, 2, var4);
      var4.Field12811 = var2;
      var4.Field12758 = 512;
      (var4 = Field12749[5385]).Field12811 = var2 - 128;
      var4.Field12758 = 480;
      (var4 = Field12749[5382]).Field12758 = 10;
      var4.Field12770 = 12;
      var4.Field12811 = 120;
      var4.Field12817 = true;
      var4.Field12763 = new String[]{"Withdraw 1", "Withdraw 5", "Withdraw 10", "Withdraw 20", "Withdraw All", "Withdraw X", "Withdraw All but one", "Placeholder"};
      if (!var1) {
         var4.Field12796 = new int[1];
         var4.Field12795 = new int[1];
      }

      Field12743 = 0;
      Field12749[5383].Field12761 = true;
   }

   private static void Method1760(int var0, int var1, String var2, int var3, int var4, int var5) {
      RSInterface var6;
      (var6 = Method1810(var0)).Field12775 = var0;
      var6.Field12794 = var0;
      var6.Field12805 = 0;
      var6.Field12754 = 0;
      var6.Field12758 = var3;
      var6.Field12811 = var4;
      var6.Field12810 = true;
      var6.Field12767 = -1;
      Method1801(var5, var1, var2);
      Method1756(1, var6);
      Method1835(var5, 0, 0, 0, var6);
   }

   private static void Method1761(int var0, int var1, int var2, int var3, int var4, String var5, int var6, int var7, String var8) {
      RSInterface var9;
      (var9 = Method1810(var0)).Field12794 = var0;
      var9.Field12775 = var0;
      var9.Field12805 = 5;
      var9.Field12754 = var1;
      var9.Field12751 = 0;
      var9.Field12767 = var3;
      var9.Field12745 = Method1811(var4, var5, 1.0F);
      var9.Field12803 = Method1811(var4, var5, 1.0F);
      var9.Field12758 = var6;
      var9.Field12811 = var7;
      var9.Field12759 = var8;
   }

   private static void Method1762() {
      RSInterface var0 = Field12749[1644];
      Method1807(15201, "Equipment/CUSTOM", 10, 3, "Show Equipment Stats");
      Method1807(15202, "Equipment/CUSTOM", 11, 4, "Show Items Kept on Death");
      Method1807(15203, "Equipment/CUSTOM", 5, 6, "Price Checker");
      Method1782(15204);
      var0.Method1813(23, 15201, 24, 210);
      var0.Method1813(25, 15203, 77, 210);
      var0.Method1813(24, 15202, 130, 210);
      var0.Method1813(26, 15204, 110, 212);
      var0.Method1812(0, 1653, 48, 4);
      var0.Method1812(0, 1653, 107, 4);
      var0.Method1812(26, 40990, 37, 4);
      var0.Method1812(26, 40991, 119, 4);
      (var0 = Field12749[1688]).Field12752 = new int[]{56, -41, -56, 0, 0, 0, 0, 0, 0, 0, 0, -55, 112, 41, -15, 15, 0, 0, 0, 0};
      var0.Field12791 = new int[]{-38, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 40, -40, -159, -197, -237, 0, 20, 0, 0};
      ++var0.Field12811;
      var0.Field12796 = new int[var0.Field12811 * var0.Field12758];
      var0.Field12795 = new int[var0.Field12796.length];
      Method1801(40990, 0, "Equipment/AURA");
      Field12749['ꀞ'].Field12803 = Field12749[1660].Field12745;
      Method1801(40991, 0, "Equipment/WING");
      Field12749['ꀟ'].Field12803 = Field12749[1660].Field12745;
   }

   public static void Method1763(boolean var0) {
      int[] var1 = new int[]{3560, 3561, 3562, 3563, 3564, 3565, 3566, 3567, 3568, 3569, 3570, 3571, 3572, 3573, 3574, 3575, 3576, 3577, 3578, 3579, 3580, 3581, 3582, 3583, 3584, 3585, 3586, 3587, 3588, 3589, 3590, 3591, 3592, 3593, 3594, 3595, 3596, 3597, 3598, 3599, 3600, 3601, 3602, 3603, 3604, 3605, 3606, 3607, 3608, 3609, 3610, 3611, 3612, 3613, 3614, 3615, 3616, 3617, 3618, 3619, 3620, 3621, 3622, 3623, 3624, 3625, 3626, 3627, 3628, 3629, 3630, 3631, 3632, 3633, 3634, 3635, 3636, 3637, 3638, 3639, 3640, 3641, 3642, 3643, 3644, 3645, 3646, 3647, 3649, 3650, 3651, 3652, 3653, 3654, 3655, 3656, 3657, 3658, 3659, 3660, 3661, 3662, 3663, 3664, 3665, 3666, 3667, 3668, 3669, 3670, 3671, 3672, 3673, 3674, 3675, 3676, 3677, 3678, 3679, 3680, 3681, 3682, 3683, 3684, 3685, 3686, 3687, 3688, 3689, 3690, 3691, 3692, 3693, 3694, 3695, 3696, 3697, 3698, 3699, 3700, 3701};
      int[] var2 = new int[]{12, 12, 12, 12, 12, 100, 100, 100, 100, 188, 100, 188, 188, 188, 188, 276, 364, 276, 276, 276, 276, 364, 364, 364, 364, 412, 412, 412, 412, 412, 12, -3, -3, -3, -3, -3, -3, -3, 479, 479, 479, 479, 479, 479, 479, 73, 109, 145, 181, 217, 253, 289, 325, 361, 397, 433, 72, 108, 144, 180, 216, 252, 288, 324, 360, 396, 432, 252, 37, 37, 12, 475, 439, 475, 439, 288, 324, 360, 396, 432, 459, 216, 180, 144, 108, 72, 36, 17, 28, 190, 223, 237, 217, 270, 217, 270, 326, 90, 27, 27, 27, 27, 27, 27, 27, 140, 140, 140, 140, 140, 140, 140, 90, 91, 91, 88, 91, 94, 440, 326, 326, 326, 326, 87, 440, 391, 440, 440, 440, 394, 390, 392, 393, 393, 235, 236, 390, 325, 417, 348, 435};
      int[] var3 = new int[]{20, 80, 140, 200, 260, 20, 80, 140, 200, 20, 260, 80, 140, 200, 260, 20, 80, 80, 140, 200, 260, 140, 20, 200, 260, 20, 80, 140, 200, 260, 20, 49, 85, 121, 157, 193, 229, 265, 50, 86, 122, 158, 194, 230, 266, 299, 299, 299, 299, 299, 299, 299, 299, 299, 299, 299, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 34, 5, 299, 290, 20, 5, 290, 299, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 29, 155, 266, 274, 260, 260, 273, 273, 74, 151, 68, 103, 138, 173, 208, 243, 278, 68, 103, 138, 173, 208, 243, 278, 184, 254, 79, 219, 288, 114, 74, 144, 109, 179, 214, 55, 109, 55, 144, 179, 214, 86, 121, 155, 225, 191, 245, 282, 258, 271, 271, 281, 281};
      RSInterface var4 = Field12749[3559] = Method1810(3559);
      byte var5 = 0;
      var4.Method1814(20);
      Method1801(40980, var0 ? 5 : 4, "Misc/BLANK");
      int var10 = var5 + 1;
      var4.Method1813(0, 40980, 16, 25);
      var4.Field12811 = var0 ? 527 : 334;

      for(int var6 = 0; var6 < 141; ++var6) {
         if (var6 >= 88) {
            int var7 = var1[var6];
            int var8 = var2[var6];
            int var9 = var3[var6];
            if (var0) {
               if (var8 > 300 && var9 <= 250) {
                  var8 -= 300;
                  var9 += 266;
               } else if (var8 > 200 && var9 > 200 && var8 < 280) {
                  var9 += 204;
               } else if (var8 > 200 && var9 > 240) {
                  var9 += 200;
               } else if (var8 > 140 && var9 > 100) {
                  var9 += 200;
                  var8 += 32;
               } else if (var8 < 100 && var9 > 30) {
                  var9 -= 4;
               }
            }

            var4.Method1813(var10++, var7, var8, var9);
         }
      }

   }

   public static void Method1764(boolean var0) {
      RSFont[] var1 = Field12787;
      RSInterface var2 = Method1810(15106);
      Method1801(15107, 7, "Equipment/CUSTOM");
      Method1805(15210, "Equipment/CUSTOM", 8, 21, 21, "Close", 250, 15211, 3);
      Method1806(15211, "Equipment/CUSTOM", 9, 21, 21, 15212);
      String[] var3 = new String[]{"Offensive bonus", "                                          ", "                                          ", "                                          ", "                                          ", "Defensive bonus", "                                          ", "                                          ", "                                          ", "                                          ", "                                          ", "                                          ", "Strength bonus", "                                          ", "                                          ", "                                          ", "Hit details", "                                          ", "                                          ", "                                          ", "                                          "};
      String[] var4 = new String[]{null, "Bonus for successful\nMelee attacks.", "Bonus for successful\nRange attacks.", "Bonus for successful\nMagic attacks.", "Amount of damage that\ntransforms into heals.", null, "Bonus for blocking\nMelee attacks.", "Bonus for blocking\nRange attacks.", "Bonus for blocking\nMagic attacks.", "Bonus for increasing\nPrayer durations.", "This value is subtracted\nfrom every incoming hit.\nIt is applied before\nprotection prayers.", "Bonus for additional\nmaximum hitpoints.", null, "Bonus for increasing\nMelee max hit.", "Bonus for increasing\nRange max hit.", "Bonus for increasing\nMagic max hit.", null, null, null, "Attack speed in seconds\nof your weapon.", "Maximum damage per seond\nof your current setup."};
      boolean var5 = true;
      RSInterface var14;
      (var14 = Field12749[15125] = new RSInterface()).Field12794 = 15125;
      var14.Field12775 = 15125;
      var14.Field12805 = 6;
      var14.Field12754 = 0;
      var14.Field12751 = 328;
      var14.Field12758 = 136;
      var14.Field12811 = 168;
      var14.Field12797 = 0;
      var14.Field12767 = 0;
      var14.Field12813 = 560;
      var14.Field12814 = 150;
      var14.Field12815 = 0;
      var14.Field12800 = -1;
      var14.Field12801 = -1;
      var2.Field12811 = var0 ? 527 : 334;
      int var15 = var0 ? 96 : 0;
      char var6 = 'ꐐ';
      var2.Method1814(7);
      Method1801(42000, var0 ? 5 : 4, "Misc/BLANK");
      int var16 = var6 + 1;
      var2.Method1813(0, 42000, 0, 0);
      ++var16;
      Method1795(42001, "Equipment Screen", var1, 2, 14983494, true, true);
      var2.Method1813(1, 1644, 302, 24 + (var15 << 1));
      var2.Method1813(2, 15125, 160 - (var0 ? 8 : 0), 188 + (var15 << 1));
      var2.Method1813(3, 42001, var2.Field12758 / 2 - 20, 4);
      ++var16;
      Method1795(42002, "Weight: 0kg", var1, 2, 14983494, true, true);
      var2.Method1813(4, 42002, 400, 279 + (var15 << 1));
      Method1835(5384, 464, 4, 5, var2);
      Method1835(5380, 464, 4, 6, var2);
      ++var16;
      Method1810(42003);
      var2.Method1813(7, 42003, 0, 0);
      int var7 = var0 ? -4 : 0;
      (var2 = Field12749['ꐓ']).Field12762 = 0;
      var2.Field12811 = 286 + (var0 ? 200 : 0);
      var2.Field12805 = 0;
      var2.Field12809 = var7 + 18;
      var2.Field12807 = -380;
      var2.Method1814(21);
      var15 = 0;
      int var8 = var7 + 6;
      int var9 = var0 ? 21 : 13;
      int var13 = var0 ? 27 : 14;

      for(int var10 = 0; var10 < 21; ++var10) {
         String var11 = Field12749[var16] == null ? var3[var10] : Field12749[var16].Field12792;
         String var12 = var4[var10];
         byte var17;
         if (var3[var10].startsWith("                                          ")) {
            Method1796(var16, var11, var1, 1, 14983494, false, true);
            var17 = 15;
            var8 += var9;
         } else {
            Method1796(var16, var11, var1, 2, 14983494, false, true);
            var17 = 10;
            var8 += var13;
         }

         var2.Method1813(var15, var16, var17 - var2.Field12807, var8 - var2.Field12809);
         if (var12 != null) {
            Field12749[var16].Field12736 = var12;
            Field12749[var16].Field12754 = 4;
         }

         ++var16;
         ++var15;
      }

      var2.Field12804 = var8 + 2 + var7;
   }

   private static void Method1765(RSFont[] var0) {
      RSInterface var1 = Method1810(18100);
      RSInterface var2 = Method1810(18111);
      Method1801(18101, 0, "Equipment/interBack");
      boolean var3 = true;
      var3 = true;
      var3 = true;
      String var5 = "Close Button";
      var3 = true;
      var3 = true;
      var3 = false;
      String var4 = "Equipment/close";
      var3 = true;
      Method1805(18102, var4, 0, 16, 16, var5, 0, 18103, 3);
      Method1806(18103, var4, 1, 16, 16, 18104);
      Method1795(18105, "Items Kept on Death", var0, 2, 16750623, true, true);
      Method1795(18106, "Items you will keep on death (if not skulled):", var0, 1, 16750623, false, true);
      Method1795(18107, "Items you will lose on death (if not skulled):", var0, 1, 16750623, false, true);
      Method1795(18108, "Information:", var0, 1, 16750623, false, true);
      Method1795(18109, "Max Items Kept on death:", var0, 1, 16763955, false, true);
      Method1795(18110, "~ null ~", var0, 1, 16763955, true, true);
      var1.Method1814(12);
      int[] var10 = new int[]{18101, 18102, 18103, 18105, 18106, 18107, 18108, 18109, 18110, 18111, 10494, 10600};
      int[] var9 = new int[]{7, 480, 480, 255, 22, 22, 347, 349, 398, 348, 26, 26};
      int[] var11 = new int[]{8, 17, 17, 17, 48, 108, 47, 270, 289, 64, 74, 133};

      int var6;
      for(var6 = 0; var6 < 12; ++var6) {
         var1.Method1813(var6, var10[var6], var9[var6], var11[var6]);
      }

      var2.Method1814(15);

      for(var6 = 18112; var6 <= 18126; ++var6) {
         Method1795(var6, "Line id: " + var6, var0, 0, 16750623, false, false);
      }

      var6 = 18112;
      int var7 = 0;

      for(int var8 = 2; var6 <= 18126; ++var6) {
         var2.Method1813(var7, var6, 1, var8);
         ++var7;
         var8 += 12;
      }

      var2.Field12804 = 280;
      var2.Field12758 = 130;
      var2.Field12811 = 197;
   }

   private static void Method1766(RSFont[] var0) {
      RSInterface var1 = Method1810(1151);
      RSInterface var2;
      (var2 = Method1810(1196)).Field12775 = 1151;
      RSInterface var3;
      (var3 = Field12749[12424]).Field12804 = 0;
      var3.Field12811 = 260;
      var3.Field12758 = 190;
      int[] var4 = new int[]{1199, 1196, 1206, 1215, 1224, 1231, 1240, 1249, 1258, 1267, 1274, 1283, 1573, 1290, 1299, 1308, 1315, 1324, 1333, 1340, 1349, 1358, 1367, 1374, 1381, 1388, 1397, 1404, 1583, 12038, 1414, 1421, 1430, 1437, 1446, 1453, 1460, 1469, 15878, 1602, 1613, 1624, 7456, 1478, 1485, 1494, 1503, 1512, 1521, 1530, 1544, 1553, 1563, 1593, 1635, 12426, 12436, 12446, 12456, 6004, 18471};
      var1.Method1814(63);
      var1.Method1813(0, 12424, 13, 24);
      var1.Method1813(1, 1195, 13, 24);
      Method1768(1195, 1, "Magic/Home", "Cast @gre@Home Teleport");
      RSInterface var5;
      (var5 = Field12749[1195]).Field12767 = 1196;
      var5.Field12775 = 1151;

      int var7;
      for(var7 = 0; var7 < 61; ++var7) {
         int var6 = var7 > 34 ? 0 : 183;
         var1.Method1813(var7 + 2, var4[var7], 5, var6);
      }

      for(var7 = 0; var7 < 61; ++var7) {
         if (var7 < 60) {
            var3.Field12784[var7] += 24;
         }

         if (var7 == 6 || var7 == 12 || var7 == 19 || var7 == 35 || var7 == 41 || var7 == 44 || var7 == 49 || var7 == 51) {
            var3.Field12784[var7] = 0;
         }

         var3.Field12816[6] = 24;
         var3.Field12816[12] = 48;
         var3.Field12816[19] = 72;
         var3.Field12816[49] = 96;
         var3.Field12816[44] = 120;
         var3.Field12816[51] = 144;
         var3.Field12816[35] = 170;
         var3.Field12816[41] = 192;
      }

      for(var7 = 0; var7 < 63; ++var7) {
         var1.Field12816[var7] -= 14;
      }

      var2.Field12810 = true;
      Method1795(1197, "Level 0: Home Teleport", var0, 1, 16685087, true, true);
      (var5 = Field12749[1197]).Field12758 = 174;
      var5.Field12811 = 68;
      var5.Field12775 = 1151;
      Method1795(1198, "A teleport which requires no", var0, 0, 11495962, true, true);
      Method1795(18998, "runes and no required level that", var0, 0, 11495962, true, true);
      Method1795(18999, "teleports you to your home area.", var0, 0, 11495962, true, true);
      var2.Method1814(4);
      var2.Method1813(0, 1197, 3, 4);
      var2.Method1813(1, 1198, 91, 23);
      var2.Method1813(2, 18998, 91, 34);
      var2.Method1813(3, 18999, 91, 45);
   }

   private static void Method1767() {
      RSInterface var0 = Method1776(12855);
      Method1768(12856, 1, "Magic/Home", "Cast @gre@Home Teleport");
      RSInterface var1;
      (var1 = Field12749[12856]).Field12767 = 1196;
      var1.Field12775 = 1151;
      int[] var5 = new int[]{12856, 12939, 12987, 13035, 12901, 12861, 13045, 12963, 13011, 13053, 12919, 12881, 13061, 12951, 12999, 13069, 12911, 12871, 13079, 12975, 13023, 13087, 12929, 12891, 13095, 1196, 12940, 12988, 13036, 12902, 12862, 13046, 12964, 13012, 13054, 12920, 12882, 13062, 12952, 13000, 13070, 12912, 12872, 13080, 12976, 13024, 13088, 12930, 12892, 13096};
      var0.Method1814(50);
      int var2 = 0;
      int var3 = 18;

      for(int var4 = 0; var2 < 50; var3 += 45) {
         if (var3 > 175) {
            var3 = 18;
            var4 += 28;
         }

         if (var2 < 25) {
            var0.Method1813(var2, var5[var2], var3, var4);
         }

         if (var2 > 24) {
            var4 = var2 < 41 ? 181 : 1;
            var0.Method1813(var2, var5[var2], 4, var4);
         }

         ++var2;
      }

      for(var2 = 0; var2 < 50; ++var2) {
         var0.Field12816[var2] += 10;
      }

   }

   private static void Method1768(int var0, int var1, String var2, String var3) {
      RSInterface var6;
      (var6 = Field12749[var0] = new RSInterface()).Field12794 = var0;
      var6.Field12775 = var0;
      var6.Field12805 = 5;
      var6.Field12754 = 1;
      var6.Field12751 = 0;
      var6.Field12797 = 0;
      var6.Field12767 = 52;
      boolean var5 = true;
      var6.Field12745 = Method1811(1, var2, 1.0F);
      var5 = true;
      var6.Field12803 = Method1811(1, var2, 1.0F);
      var6.Field12758 = var6.Field12745.Field9894;
      var6.Field12811 = var6.Field12803.Field9895;
      var6.Field12759 = var3;
   }

   private static void Method1769(int var0, int var1, String var2, String var3, int var4, int var5) {
      Method1805(var0, var2, var1, 60, 27, var3, 0, var4, 1);
   }

   private static void Method1770(RSInterface var0) {
      var0.Field12811 += 10;
      var0.Field12796 = new int[1];
      var0.Field12795 = new int[1];
   }

   private static void Method1771(int var0, String var1) {
      RSInterface var2;
      (var2 = Method1776(var0)).Field12794 = var0;
      var2.Field12805 = 0;
      var2.Field12810 = true;
      var2.Field12767 = -1;
      int var10000 = var0 + 1;
      String var3 = var1;
      int var5 = var10000;
      RSInterface var4;
      (var4 = Method1776(var10000)).Field12794 = var5;
      var4.Field12775 = var5;
      var4.Field12805 = 8;
      var4.Field12736 = var3;
      var2.Method1814(1);
      var2.Method1813(0, var0 + 1, 0, 0);
   }

   private static void Method1772(int var0, int var1, int var2, int var3, int var4, String var5) {
      RSInterface var8;
      (var8 = Method1810(var0)).Field12794 = var0;
      var8.Field12775 = 5608;
      var8.Field12805 = 5;
      var8.Field12754 = 4;
      var8.Field12751 = 0;
      var8.Field12797 = 0;
      var8.Field12767 = -1;
      String var7 = "PrayerTab/PRAYERGLOW";
      boolean var6 = false;
      var8.Field12745 = Method1811(0, var7, 1.0F);
      var8.Field12803 = null;
      var8.Field12758 = 34;
      var8.Field12811 = 34;
      var8.Field12789 = new int[1];
      var8.Field12750 = new int[1];
      var8.Field12789[0] = 1;
      var8.Field12750[0] = 0;
      var8.Field12764 = new int[1][3];
      var8.Field12764[0][0] = 5;
      var8.Field12764[0][1] = var2;
      var8.Field12764[0][2] = 0;
      var8.Field12759 = "Activate @lre@" + var5;
      (var8 = Method1810(var0 + 1)).Field12794 = var0 + 1;
      var8.Field12775 = 5608;
      var8.Field12805 = 5;
      var8.Field12754 = 0;
      var8.Field12751 = 0;
      var8.Field12797 = 0;
      var8.Field12767 = -1;
      var7 = "/Prayer/PRAYON";
      var8.Field12745 = Method1811(var4, var7, 1.0F);
      var7 = "/Prayer/PRAYOFF";
      var8.Field12803 = Method1811(var4, var7, 1.0F);
      var8.Field12758 = 34;
      var8.Field12811 = 34;
      var8.Field12789 = new int[1];
      var8.Field12750 = new int[1];
      var8.Field12789[0] = 2;
      var8.Field12750[0] = var3 + 1;
      var8.Field12764 = new int[1][3];
      var8.Field12764[0][0] = 2;
      var8.Field12764[0][1] = 5;
      var8.Field12764[0][2] = 0;
   }

   private static void Method1773(RSFont[] var0) {
      RSInterface var1 = Method1810(5065);
      RSInterface var2 = Field12749[5066];
      Method1795(5067, "Friends List", var0, 1, 16750899, true, true);
      Method1795(5070, "Add Friend", var0, 0, 16750899, false, true);
      Method1795(5071, "Delete Friend", var0, 0, 16750899, false, true);
      Method1801(16126, 4, "/Friends/SPRITE");
      Method1801(16127, 8, "/Friends/SPRITE");
      Method1805(5068, "/Friends/SPRITE", 6, 72, 32, "Add Friend", 201, 5072, 1);
      Method1806(5072, "/Friends/SPRITE", 7, 72, 32, 5073);
      Method1805(5069, "/Friends/SPRITE", 6, 72, 32, "Delete Friend", 202, 5074, 1);
      Method1806(5074, "/Friends/SPRITE", 7, 72, 32, 5075);
      var1.Method1814(11);
      var1.Method1813(0, 5067, 95, 4);
      var1.Method1813(1, 16127, 0, 25);
      var1.Method1813(2, 16126, 0, 221);
      var1.Method1813(3, 5066, 0, 24);
      var1.Method1813(4, 16126, 0, 22);
      var1.Method1813(5, 5068, 15, 226);
      var1.Method1813(6, 5072, 15, 226);
      var1.Method1813(7, 5069, 103, 226);
      var1.Method1813(8, 5074, 103, 226);
      var1.Method1813(9, 5070, 25, 237);
      var1.Method1813(10, 5071, 106, 237);
      var2.Field12811 = 196;
      var2.Field12758 = 174;
      int var3 = 5092;

      int var4;
      for(var4 = 0; var3 <= 5191 && var4 <= 99; ++var4) {
         var2.Field12784[var4] = 3;
         var2.Field12816[var4] -= 7;
         ++var3;
      }

      var3 = 5192;

      for(var4 = 100; var3 <= 5291 && var4 <= 199; ++var4) {
         var2.Field12784[var4] = 131;
         var2.Field12816[var4] -= 7;
         ++var3;
      }

      var3 = 5292;

      for(var4 = 200; var3 <= 5391 && var4 <= 299; ++var4) {
         var2.Field12784[var4] = 3;
         var2.Field12816[var4] -= 7;
         ++var3;
      }

      var3 = 5392;

      for(var4 = 300; var3 <= 5491 && var4 <= 399; ++var4) {
         var2.Field12784[var4] = 131;
         var2.Field12816[var4] -= 7;
         ++var3;
      }

   }

   private static void Method1774(RSFont[] var0) {
      RSInterface var1 = Method1810(5715);
      RSInterface var2 = Field12749[5716];
      Method1795(5717, "Ignore List", var0, 1, 16750899, true, true);
      Method1795(5720, "Add Name", var0, 0, 16750899, false, true);
      Method1795(5721, "Delete Name", var0, 0, 16750899, false, true);
      Method1805(5718, "/Friends/SPRITE", 6, 72, 32, "Add Name", 501, 5722, 1);
      Method1806(5722, "/Friends/SPRITE", 7, 72, 32, 5723);
      Method1805(5719, "/Friends/SPRITE", 6, 72, 32, "Delete Name", 502, 5724, 1);
      Method1806(5724, "/Friends/SPRITE", 7, 72, 32, 5725);
      var1.Method1814(11);
      var1.Method1813(0, 5717, 95, 4);
      var1.Method1813(1, 16127, 0, 25);
      var1.Method1813(2, 16126, 0, 221);
      var1.Method1813(3, 5716, 0, 24);
      var1.Method1813(4, 16126, 0, 22);
      var1.Method1813(5, 5718, 15, 226);
      var1.Method1813(6, 5722, 15, 226);
      var1.Method1813(7, 5719, 103, 226);
      var1.Method1813(8, 5724, 103, 226);
      var1.Method1813(9, 5720, 27, 237);
      var1.Method1813(10, 5721, 108, 237);
      var2.Field12811 = 196;
      var2.Field12758 = 174;
      int var3 = 5742;

      for(int var4 = 0; var3 <= 5841 && var4 <= 99; ++var4) {
         var2.Field12783[var4] = var3;
         var2.Field12784[var4] = 3;
         var2.Field12816[var4] -= 7;
         ++var3;
      }

   }

   private static RgbImage Method1775(int var0, String var1) {
      long var2 = (Class23.Method204(var1) << 8) + (long)var0;
      RgbImage var4;
      if ((var4 = (RgbImage)Field12781.Method1510(var2)) != null) {
         return var4;
      } else {
         try {
            var4 = new RgbImage("/Attack/" + var0 + var1);
            Field12781.Method1509(var2, var4);
            return var4;
         } catch (Exception var5) {
            var5.printStackTrace();
            return null;
         }
      }
   }

   private static RSInterface Method1776(int var0) {
      RSInterface var1;
      (var1 = Field12749[var0] = new RSInterface()).Field12794 = var0;
      var1.Field12775 = var0;
      var1.Field12758 = 512;
      var1.Field12811 = 334;
      return var1;
   }

   private static void Method1777(int var0, String var1, RSFont[] var2, int var3, int var4, boolean var5) {
      RSInterface var6 = Field12749[var0] = new RSInterface();
      if (var5) {
         var6.Field12761 = true;
      }

      var6.Field12812 = true;
      var6.Field12786 = var2[var3];
      var6.Field12792 = var1;
      var6.Field12771 = 16750623;
      var6.Field12794 = var0;
      var6.Field12805 = 4;
   }

   private static void Method1778(int var0, int var1, int var2, String var3) {
      RSInterface var4;
      (var4 = Field12749[var0] = new RSInterface()).Field12745 = Method1817(var1, Field12744, var3);
      var4.Field12803 = Method1817(0, Field12744, var3);
      var4.Field12775 = var0;
      var4.Field12794 = var0;
      var4.Field12805 = 5;
   }

   private static void Method1779(int var0, int var1) {
      Field12749[var0].Field12745 = Method1775(var1, "");
   }

   private static RSInterface Method1780(int var0, int var1, int var2, int var3, int var4, String var5) {
      RSInterface var6;
      (var6 = Method1776(var0)).Field12745 = Method1775(19301, "");
      var6.Field12803 = Method1775(19301, "a");
      var6.Field12750 = new int[1];
      var6.Field12750[0] = 1;
      var6.Field12789 = new int[1];
      var6.Field12789[0] = 1;
      var6.Field12764 = new int[1][3];
      var6.Field12764[0][0] = 5;
      var6.Field12764[0][1] = var2;
      var6.Field12764[0][2] = 0;
      var6.Field12754 = 4;
      var6.Field12758 = var3;
      var6.Field12767 = -1;
      var6.Field12775 = var0;
      var6.Field12794 = var0;
      var6.Field12805 = 5;
      var6.Field12811 = 44;
      var6.Field12759 = var5;
      return var6;
   }

   private static void Method1781(int var0, int var1, int var2, String var3, String var4, int var5, int var6, int var7) {
      RSInterface var8;
      (var8 = Method1810(var0)).Field12775 = var0;
      var8.Field12794 = var0;
      var8.Field12805 = 5;
      var8.Field12754 = 4;
      var8.Field12751 = 0;
      var8.Field12797 = 0;
      var8.Field12767 = -1;
      var8.Field12750 = new int[1];
      var8.Field12750[0] = 1;
      var8.Field12789 = new int[1];
      var8.Field12789[0] = var5;
      var8.Field12764 = new int[1][3];
      var8.Field12764[0][0] = 5;
      var8.Field12764[0][1] = var7;
      var8.Field12764[0][2] = 0;
      var8.Field12745 = Method1811(var1, var3, 1.0F);
      var8.Field12803 = Method1811(var2, var3, 1.0F);
      var8.Field12758 = var8.Field12745.Field9894;
      var8.Field12811 = var8.Field12745.Field9895;
      var8.Field12759 = var4;
   }

   private static void Method1782(int var0) {
      Field12749[var0] = new RSInterface();
   }

   private static void Method1783(int var0) {
      int var10000 = var0 - 12;
      String var2 = "Use @gre@Special Attack";
      boolean var1 = true;
      var1 = true;
      var1 = true;
      var1 = true;
      int var4 = var10000;
      RSInterface var3;
      (var3 = Field12749[var4] = new RSInterface()).Field12745 = Method1775(7587, "");
      var3.Field12803 = Method1775(-1, "");
      var3.Field12759 = var2;
      var3.Field12751 = 0;
      var3.Field12754 = 1;
      var3.Field12758 = 150;
      var3.Field12767 = 52;
      var3.Field12775 = var4;
      var3.Field12794 = var4;
      var3.Field12805 = 5;
      var3.Field12811 = 26;

      for(var4 = var0 - 11; var4 < var0; ++var4) {
         Method1782(var4);
      }

      RSInterface var6;
      (var6 = Field12749[var0 - 12]).Field12758 = 150;
      var6.Field12811 = 26;
      var6.Field12736 = "Unleash a mighty\nSpecial Attack";
      (var6 = Field12749[var0]).Field12758 = 150;
      var6.Field12811 = 26;
      var6.Method1813(0, var0 - 12, 0, 0);
      var6.Method1813(12, var0 + 1, 3, 7);
      var6.Method1813(23, var0 + 12, 16, 8);

      int var5;
      for(var5 = 13; var5 < 23; ++var5) {
         --var6.Field12816[var5];
      }

      (var6 = Field12749[var0 + 1]).Field12805 = 5;
      var6.Field12745 = Method1775(7600, "");

      for(var5 = var0 + 2; var5 < var0 + 12; ++var5) {
         Field12749[var5].Field12805 = 5;
      }

      Method1779(var0 + 2, 7601);
      Method1779(var0 + 3, 7602);
      Method1779(var0 + 4, 7603);
      Method1779(var0 + 5, 7604);
      Method1779(var0 + 6, 7605);
      Method1779(var0 + 7, 7606);
      Method1779(var0 + 8, 7607);
      Method1779(var0 + 9, 7608);
      Method1779(var0 + 10, 7609);
      Method1779(var0 + 11, 7610);
   }

   private static void Method1784(int var0, int var1, int var2, String var3, String var4, String var5, String var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20, int var21, int var22, RSFont[] var23, String var24, String var25, String var26, String var27) {
      RSInterface var28 = Method1776(var0);
      Method1777(var1, "-2", var23, 3, 16750623, true);
      Method1777(var1 + 11, var3, var23, 0, 16750623, false);
      Method1777(var1 + 12, var4, var23, 0, 16750623, false);
      Method1777(var1 + 13, var5, var23, 0, 16750623, false);
      Method1777(var1 + 14, var6, var23, 0, 16750623, false);
      Method1783(var2);
      var28.Field12758 = 190;
      var28.Field12811 = 261;
      var28.Method1814(15);
      var28.Method1813(0, var1 + 3, 21, 46);
      var28.Method1813(1, var1 + 4, 104, 99);
      var28.Method1813(2, var1 + 5, 21, 99);
      var28.Method1813(3, var1 + 6, 105, 46);
      var28.Method1813(4, var1 + 7, 122, 103);
      var28.Method1813(5, var1 + 8, 40, 50);
      var28.Method1813(6, var1 + 9, 122, 50);
      var28.Method1813(7, var1 + 10, 40, 103);
      var28.Method1813(8, var1 + 11, var7, 75);
      var28.Method1813(9, var1 + 12, var9, 75);
      var28.Method1813(10, var1 + 13, var11, 128);
      var28.Method1813(11, var1 + 14, 125, 128);
      var28.Method1813(12, 19300, 0, 0);
      var28.Method1813(13, var1, 94, 4);
      var28.Method1813(14, var2, 21, 205);
      var28 = Field12749[var1 + 3];
      RSInterface var29 = Field12749[var1 + 4];
      RSInterface var30 = Field12749[var1 + 5];
      RSInterface var31 = Field12749[var1 + 6];
      var28.Field12736 = var24;
      var29.Field12736 = var27;
      var30.Field12736 = var26;
      var31.Field12736 = var25;

      for(var2 = var1 + 3; var2 < var1 + 7; ++var2) {
         (var28 = Field12749[var2]).Field12745 = Method1775(19301, "");
         var28.Field12803 = Method1775(19301, "a");
         var28.Field12758 = 68;
         var28.Field12811 = 44;
      }

   }

   private static void Method1785(int var0, int var1, String var2, String var3, String var4, String var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20, int var21, RSFont[] var22) {
      RSInterface var23 = Method1776(776);
      Method1777(779, "-2", var22, 3, 16750623, true);
      Method1777(790, var2, var22, 0, 16750623, false);
      Method1777(791, var3, var22, 0, 16750623, false);
      Method1777(792, var4, var22, 0, 16750623, false);
      Method1777(793, var5, var22, 0, 16750623, false);
      var23.Field12758 = 190;
      var23.Field12811 = 261;
      var23.Method1814(14);
      var23.Method1813(0, 782, 21, 46);
      var23.Method1813(1, 783, 104, 99);
      var23.Method1813(2, 784, 21, 99);
      var23.Method1813(3, 785, 105, 46);
      var23.Method1813(4, 786, 122, 103);
      var23.Method1813(5, 787, 122, 50);
      var23.Method1813(6, 788, 40, 103);
      var23.Method1813(7, 789, 40, 50);
      var23.Method1813(8, 790, 42, 75);
      var23.Method1813(9, 791, 126, 75);
      var23.Method1813(10, 792, 46, 128);
      var23.Method1813(11, 793, 125, 128);
      var23.Method1813(12, 19300, 0, 0);
      var23.Method1813(13, 779, 94, 4);

      for(var1 = 782; var1 < 786; ++var1) {
         (var23 = Field12749[var1]).Field12745 = Method1775(19301, "");
         var23.Field12803 = Method1775(19301, "a");
         var23.Field12758 = 68;
         var23.Field12811 = 44;
      }

   }

   private static void Method1786(int var0, int var1, int var2, String var3, String var4, String var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, RSFont[] var18, String var19, String var20, String var21) {
      RSInterface var22 = Method1776(var0);
      Method1777(var1, "-2", var18, 3, 16750623, true);
      Method1777(var1 + 9, var3, var18, 0, 16750623, false);
      Method1777(var1 + 10, var4, var18, 0, 16750623, false);
      Method1777(var1 + 11, var5, var18, 0, 16750623, false);
      Method1783(var2);
      var22.Field12758 = 190;
      var22.Field12811 = 261;
      var22.Method1814(12);
      var22.Method1813(0, var1 + 3, 21, 99);
      var22.Method1813(1, var1 + 4, 105, 46);
      var22.Method1813(2, var1 + 5, 21, 46);
      var22.Method1813(3, var1 + 6, 40, var13);
      var22.Method1813(4, var1 + 7, var14, var15);
      var22.Method1813(5, var1 + 8, var16, var17);
      var22.Method1813(6, var1 + 9, var6, 75);
      var22.Method1813(7, var1 + 10, var8, 75);
      var22.Method1813(8, var1 + 11, var10, 128);
      var22.Method1813(9, 19300, 0, 0);
      var22.Method1813(10, var1, 94, 4);
      var22.Method1813(11, var2, 21, 205);
      var22 = Field12749[var1 + 3];
      RSInterface var23 = Field12749[var1 + 4];
      RSInterface var24 = Field12749[var1 + 5];
      var22.Field12736 = var21;
      var23.Field12736 = var20;
      var24.Field12736 = var19;

      for(var2 = var1 + 3; var2 < var1 + 6; ++var2) {
         (var22 = Field12749[var2]).Field12745 = Method1775(19301, "");
         var22.Field12803 = Method1775(19301, "a");
         var22.Field12758 = 68;
         var22.Field12811 = 44;
      }

   }

   private static void Method1787(int var0, int var1, String var2, String var3, String var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, RSFont[] var17, String var18, String var19, String var20) {
      RSInterface var21 = Method1776(328);
      Method1777(331, "-2", var17, 3, 16750623, true);
      Method1777(340, var2, var17, 0, 16750623, false);
      Method1777(341, var3, var17, 0, 16750623, false);
      Method1777(342, var4, var17, 0, 16750623, false);
      Method1777(353, "Spell", var17, 0, 16750623, false);
      Method1777(354, "Spell", var17, 0, 16750623, false);
      Method1778(337, 19, 0, "combaticons");
      Method1778(338, 13, 0, "combaticons2");
      Method1778(339, 14, 0, "combaticons2");
      Method1780(349, 19301, 107, 68, 44, "Select");
      Method1780(350, 19301, 108, 68, 44, "Select");
      Method1808(40983, 0, "/Attack/spell", 1.0F);
      Method1808(40982, -255, "/skills/1", 0.625F);
      var21.Field12758 = 190;
      var21.Field12811 = 261;
      var21.Method1814(18);
      var21.Method1813(0, 334, 20, 115);
      var21.Method1813(1, 335, 20, 80);
      var21.Method1813(2, 336, 20, 45);
      var21.Method1813(3, 337, 40, 120);
      var21.Method1813(4, 338, 40, 50);
      var21.Method1813(5, 339, 40, 85);
      var21.Method1813(6, 340, 42, 66);
      var21.Method1813(7, 341, 39, 101);
      var21.Method1813(8, 342, 41, 136);
      var21.Method1813(10, 350, 104, 106);
      var21.Method1813(12, 354, 125, 134);
      var21.Method1813(13, 19300, 0, 0);
      var21.Method1813(14, 331, 94, 4);
      var21.Method1813(15, 40983, 124, 108);
      var21 = Field12749[334];
      RSInterface var22 = Field12749[335];
      RSInterface var23 = Field12749[336];
      RSInterface var24 = Field12749[350];
      RSInterface var25 = Field12749[349];
      var21.Field12736 = var20;
      var22.Field12736 = var19;
      var23.Field12736 = var18;
      var24.Field12736 = "Combat Spell\nMagic XP";
      var25.Field12736 = "Combat Spell\nMagic and\nDefence XP";
   }

   private static void Method1788() {
      RSInterface var0 = Method1810(147);
      RSInterface var1 = Method1810(148);
      var0.Method1814(1);
      var0.Method1813(0, 148, 0, 1);
      Method1798(168, 0, "/Emotes/EMOTE", "Yes", 41, 47);
      Method1798(169, 1, "/Emotes/EMOTE", "No", 41, 47);
      Method1798(164, 2, "/Emotes/EMOTE", "Bow", 41, 47);
      Method1798(165, 3, "/Emotes/EMOTE", "Angry", 41, 47);
      Method1798(162, 4, "/Emotes/EMOTE", "Think", 41, 47);
      Method1798(163, 5, "/Emotes/EMOTE", "Wave", 41, 47);
      Method1798(13370, 6, "/Emotes/EMOTE", "Shrug", 41, 47);
      Method1798(171, 7, "/Emotes/EMOTE", "Cheer", 41, 47);
      Method1798(167, 8, "/Emotes/EMOTE", "Beckon", 41, 47);
      Method1798(170, 9, "/Emotes/EMOTE", "Laugh", 41, 47);
      Method1798(13366, 10, "/Emotes/EMOTE", "Jump for Joy", 41, 47);
      Method1798(13368, 11, "/Emotes/EMOTE", "Yawn", 41, 47);
      Method1798(166, 12, "/Emotes/EMOTE", "Dance", 41, 47);
      Method1798(13363, 13, "/Emotes/EMOTE", "Jig", 41, 47);
      Method1798(13364, 14, "/Emotes/EMOTE", "Spin", 41, 47);
      Method1798(13365, 15, "/Emotes/EMOTE", "Headbang", 41, 47);
      Method1798(161, 16, "/Emotes/EMOTE", "Cry", 41, 47);
      Method1798(11100, 17, "/Emotes/EMOTE", "Blow kiss", 41, 47);
      Method1798(13362, 18, "/Emotes/EMOTE", "Panic", 41, 47);
      Method1798(13367, 19, "/Emotes/EMOTE", "Raspberry", 41, 47);
      Method1798(172, 20, "/Emotes/EMOTE", "Clap", 41, 47);
      Method1798(13369, 21, "/Emotes/EMOTE", "Salute", 41, 47);
      Method1798(13383, 22, "/Emotes/EMOTE", "Goblin Bow", 41, 47);
      Method1798(13384, 23, "/Emotes/EMOTE", "Goblin Salute", 41, 47);
      Method1798(667, 24, "/Emotes/EMOTE", "Glass Box", 41, 47);
      Method1798(6503, 25, "/Emotes/EMOTE", "Climb Rope", 41, 47);
      Method1798(6506, 26, "/Emotes/EMOTE", "Lean On Air", 41, 47);
      Method1798(666, 27, "/Emotes/EMOTE", "Glass Wall", 41, 47);
      Method1798(18464, 28, "/Emotes/EMOTE", "Zombie Walk", 41, 47);
      Method1798(18465, 29, "/Emotes/EMOTE", "Zombie Dance", 41, 47);
      Method1798(15166, 30, "/Emotes/EMOTE", "Scared", 41, 47);
      Method1798(18686, 31, "/Emotes/EMOTE", "Rabbit Hop", 41, 47);
      Method1799(154, 147, 32, 33, "/Emotes/EMOTE", 41, 47, "Skillcape", 0, 1, 700);
      Method1799(35900, 147, 34, 35, "/Emotes/EMOTE", 41, 47, "Air Guitar", 0, 1, 701);
      var1.Method1814(34);
      var1.Method1813(0, 168, 10, 7);
      var1.Method1813(1, 169, 54, 7);
      var1.Method1813(2, 164, 98, 14);
      var1.Method1813(3, 165, 137, 7);
      var1.Method1813(4, 162, 9, 56);
      var1.Method1813(5, 163, 48, 56);
      var1.Method1813(6, 13370, 95, 56);
      var1.Method1813(7, 171, 137, 56);
      var1.Method1813(8, 167, 7, 105);
      var1.Method1813(9, 170, 51, 105);
      var1.Method1813(10, 13366, 95, 104);
      var1.Method1813(11, 13368, 139, 105);
      var1.Method1813(12, 166, 6, 154);
      var1.Method1813(13, 13363, 50, 154);
      var1.Method1813(14, 13364, 90, 154);
      var1.Method1813(15, 13365, 135, 154);
      var1.Method1813(16, 161, 8, 204);
      var1.Method1813(17, 11100, 51, 203);
      var1.Method1813(18, 13362, 99, 204);
      var1.Method1813(19, 13367, 137, 203);
      var1.Method1813(20, 172, 10, 253);
      var1.Method1813(21, 13369, 53, 253);
      var1.Method1813(22, 13383, 88, 258);
      var1.Method1813(23, 13384, 138, 252);
      var1.Method1813(24, 667, 2, 303);
      var1.Method1813(25, 6503, 49, 302);
      var1.Method1813(26, 6506, 93, 302);
      var1.Method1813(27, 666, 137, 302);
      var1.Method1813(28, 18464, 9, 352);
      var1.Method1813(29, 18465, 50, 352);
      var1.Method1813(30, 15166, 94, 356);
      var1.Method1813(31, 18686, 141, 353);
      var1.Method1813(32, 154, 5, 401);
      var1.Method1813(33, 35900, 55, 401);
      var1.Field12758 = 173;
      var1.Field12811 = 258;
      var1.Field12804 = 453;

      for(int var2 = 0; var2 < var1.Field12783.length; ++var2) {
         Field12749[var1.Field12783[var2]].Field12775 = 148;
      }

   }

   private static void Method1789(int var0, int var1, int[][] var2, RSInterface var3, boolean var4) {
      int[][] var7 = var2;
      int var6 = var2.length;

      for(int var5 = 0; var5 < var6; ++var5) {
         int[] var13 = var7[var5];
         int var8 = var0;
         int var9 = var1;

         for(int var10 = 0; var10 < var13.length; ++var10) {
            int var11;
            if ((var11 = var13[var10]) < 0) {
               var9 -= var11;
               var1 -= var11;
            } else {
               RSInterface var12;
               if ((var12 = Field12749[var11]) == null) {
                  System.err.println("[RSInterface]: null frame: " + var11);
               } else {
                  if (var13.length == 1) {
                     Method1757(var11, var8 - 3, var9, var3);
                     var1 += 2;
                  } else if (var13.length >= 6) {
                     if (var10 == var13.length - 6) {
                        var9 += 2;
                        var1 += 2;
                        Method1757(var11, var8 + 2, var9, var3);
                        var8 = var0;
                     } else {
                        Method1757(var11, var8, var9, var3);
                     }

                     if (var10 == var13.length - 6) {
                        var1 += 16;
                        var9 += 16;
                     }
                  } else {
                     Method1757(var11, var8, var9, var3);
                     if (var10 < var13.length - 1 && Field12749[var13[var10 + 1]].Field12758 == 0) {
                        var8 += 2;
                     }

                     if (var12.Field12758 >= 30) {
                        var8 += 8;
                     }

                     if (var10 == var13.length - 1) {
                        var9 += 10;
                     }
                  }

                  var8 += var12.Field12758;
               }
            }
         }

         if (var4) {
            if (var13.length == 1) {
               var1 += 2;
            } else {
               var1 += 6;
            }
         }

         var1 += 18;
      }

   }

   public static void Method1790(boolean var0, boolean var1) {
      RSFont[] var2 = Field12787;
      RSInterface var3 = Method1776(35000);
      Method1756(4, var3);
      Method1801(34991, var0 ? 5 : 4, "Misc/BLANK");
      var3.Field12811 = var0 ? 527 : 334;
      Method1793(34992, "Game Settings", 16745503, true, true, -1, var2, 2);
      Method1757(34991, 0, 0, var3);
      Method1757(34992, 244, 5, var3);
      Method1757(5384, 464, 4, var3);
      Method1757(5380, 464, 4, var3);
      RSInterface var4;
      (var4 = Method1776(34993)).Field12775 = 34994;
      Method1756(1, var4);
      var4.Field12811 = var0 ? 471 : 278;
      var4.Field12758 = 480;
      var4.Field12762 = 0;
      var4.Field12804 = 320;
      var4.Field12775 = 34994;
      Method1757(34993, -16, 21, var3);
      if (!var1) {
         Method1795(35001, "Anti Aliasing", var2, 1, 16751360, false, true);
         Method1781(35002, 39, 40, "/Options/SPRITE", "Anti Aliasing", 1, 4, 1980);
         Method1795(35003, "VBO Mode", var2, 1, 16751360, false, true);
         Method1781(35004, 39, 40, "/Options/SPRITE", "VBO Mode", 1, 4, 1981);
         Method1795(35005, "Ground Decoration", var2, 1, 16751360, false, true);
         Method1781(35006, 39, 40, "/Options/SPRITE", "Ground Decoration", 1, 4, 1982);
         Method1795(35007, "Roof Settings", var2, 1, 16751360, false, true);
         Method1781(35008, 39, 40, "/Options/SPRITE", "Show Roofs", 1, 4, 1983);
         Method1781(35095, 39, 40, "/Options/SPRITE", "Roof Removal Mode", 1, 4, 1996);
         Method1795(35009, "Distant Fog", var2, 1, 16751360, false, true);
         Method1781(35010, 39, 40, "/Options/SPRITE", "Distant Fog", 1, 4, 1984);
         Method1795(35011, "Model Textures", var2, 1, 16751360, false, true);
         Method1781(35012, 39, 40, "/Options/SPRITE", "Model Textures", 1, 4, 1985);
         Method1795(35013, "Show Exp. Gained", var2, 1, 16751360, false, true);
         Method1781(35014, 39, 40, "/Options/SPRITE", "Exp. Gained", 1, 4, 1986);
         Method1795(35077, "Show FPS", var2, 1, 16751360, false, true);
         Method1781(35078, 39, 40, "/Options/SPRITE", "Show FPS", 1, 4, 1989);
         Method1795(35079, "MMB Mode", var2, 1, 16751360, false, true);
         Method1781(35080, 39, 40, "/Options/SPRITE", "Multi model buffering", 1, 4, 1990);
         Method1795(35081, "CDL (0%)", var2, 1, 16751360, false, true);
         Method1781(35082, 39, 40, "/Options/SPRITE", "Cache Downloader", 1, 4, 1991);
         Method1795(35083, "Skill timers", var2, 1, 16751360, false, true);
         Method1781(35084, 39, 40, "/Options/SPRITE", "Skill timers", 1, 4, 1992);
         Method1795(35085, "Combat timers", var2, 1, 16751360, false, true);
         Method1781(35086, 39, 40, "/Options/SPRITE", "Combat timers", 1, 4, 1993);
         Method1795(35093, "Item hovers", var2, 1, 16751360, false, true);
         Method1781(35094, 39, 40, "/Options/SPRITE", "Item hovers", 1, 4, 1995);
         Method1795(35096, "Animation tweening", var2, 1, 16751360, false, true);
         Method1781(35097, 39, 40, "/Options/SPRITE", "Animation tweening", 1, 4, 1997);
         Method1795(35098, "Attack option priority", var2, 1, 16751360, false, true);
         Method1781(35099, 39, 40, "/Options/SPRITE", "Attack option priority", 1, 4, 1999);
         Method1795(35100, "Animated tex.", var2, 1, 16751360, false, true);
         Method1781(35101, 39, 40, "/Options/SPRITE", "Animated textures", 1, 4, 2000);
         Method1795(35102, "Animation opt.", var2, 1, 16751360, false, true);
         Method1781(35103, 39, 40, "/Options/SPRITE", "Animation downgrading", 1, 4, 2001);
         Method1795(35104, "Ground smoothing", var2, 1, 16751360, false, true);
         Method1781(35105, 39, 40, "/Options/SPRITE", "Ground smoothing", 1, 4, 2002);
         Method1795(35106, "Hit splats", var2, 1, 16751360, false, true);
         Method1781(35107, 39, 40, "/Options/SPRITE", "Modern hit splats", 1, 4, 2003);
         Method1781(35108, 39, 40, "/Options/SPRITE", "Show combat types", 1, 4, 2004);
         Method1795(35115, "Particles", var2, 1, 16751360, false, true);
         Method1781(35116, 39, 40, "/Options/SPRITE", "Particles", 1, 4, 2008);
         Method1795(35117, "Health values", var2, 1, 16751360, false, true);
         Method1781(35118, 39, 40, "/Options/SPRITE", "Health values", 1, 4, 2009);
         Method1799(35109, 35000, 19, 24, "/Options/SPRITE", 26, 16, "None", 1, 5, 2005);
         Method1799(35110, 35000, 20, 25, "/Options/SPRITE", 26, 16, "Low", 2, 5, 2005);
         Method1799(35111, 35000, 21, 26, "/Options/SPRITE", 26, 16, "Medium", 3, 5, 2005);
         Method1799(35112, 35000, 22, 27, "/Options/SPRITE", 26, 16, "High", 4, 5, 2005);
         Method1799(35113, 35000, 23, 28, "/Options/SPRITE", 26, 16, "Ultra", 5, 5, 2005);
         Method1795(35114, "Shadow Quality", var2, 1, 16751360, false, true);
         Method1799(35015, 35000, 19, 24, "/Options/SPRITE", 26, 16, "View-30", 1, 5, 1987);
         Method1799(35016, 35000, 20, 25, "/Options/SPRITE", 26, 16, "View-40", 2, 5, 1987);
         Method1799(35017, 35000, 21, 26, "/Options/SPRITE", 26, 16, "View-50", 3, 5, 1987);
         Method1799(35018, 35000, 22, 27, "/Options/SPRITE", 26, 16, "View-70", 4, 5, 1987);
         Method1799(35019, 35000, 23, 28, "/Options/SPRITE", 26, 16, "View-100", 5, 5, 1987);
         Method1795(35020, "Rendering Distance", var2, 1, 16751360, false, true);
         Method1799(35087, 35000, 19, 24, "/Options/SPRITE", 26, 16, "Very Low", 1, 5, 1994);
         Method1799(35088, 35000, 20, 25, "/Options/SPRITE", 26, 16, "Low", 2, 5, 1994);
         Method1799(35089, 35000, 21, 26, "/Options/SPRITE", 26, 16, "Medium", 3, 5, 1994);
         Method1799(35090, 35000, 22, 27, "/Options/SPRITE", 26, 16, "High", 4, 5, 1994);
         Method1799(35091, 35000, 23, 28, "/Options/SPRITE", 26, 16, "Very High", 5, 5, 1994);
         Method1795(35092, "Floor Quality", var2, 1, 16751360, false, true);
         Method1795(35063, "Game Settings", var2, 2, 16751360, true, true);
         Method1781(35064, 37, 37, "/Options/SPRITE", "Full Screen", 1, 4, 725);
         Method1781(35065, 38, 38, "/Options/SPRITE", "Fixed Screen", 1, 4, 725);
         Method1795(35066, "Screen Settings", var2, 2, 16751360, true, true);
         Method1799(35071, 35000, 19, 24, "/Options/SPRITE", 26, 16, "FPS-30", 1, 5, 1988);
         Method1799(35072, 35000, 20, 25, "/Options/SPRITE", 26, 16, "FPS-60", 2, 5, 1988);
         Method1799(35073, 35000, 21, 26, "/Options/SPRITE", 26, 16, "FPS-80", 3, 5, 1988);
         Method1799(35074, 35000, 22, 27, "/Options/SPRITE", 26, 16, "FPS-144", 4, 5, 1988);
         Method1799(35075, 35000, 23, 28, "/Options/SPRITE", 26, 16, "FPS-Uncapped", 5, 5, 1988);
         Method1795(35076, "FPS:", var2, 1, 16751360, false, true);
         Method1795(35119, "Graphic Options", var2, 2, 16751360, false, true);
         Method1795(35120, "Utility Options", var2, 2, 16751360, false, true);
         Method1795(35121, "Window Options", var2, 2, 16751360, false, true);
         Method1795(35122, "Advanced Options", var2, 2, 16751360, false, true);
         Method1795(35123, "change with caution!!", var2, 1, 16751360, false, true);
         Method1805(35124, "/Clan Chat/SPRITE", 6, 72, 32, "Reset all Settings", 0, 35125, 1);
         Method1806(35125, "/Clan Chat/SPRITE", 7, 72, 32, 35126);
         Method1795(35127, "Reset All", var2, 1, 16751360, false, true);
         Method1799(35128, 35000, 19, 24, "/Options/SPRITE", 26, 16, "Very Low", 1, 5, 2010);
         Method1799(35129, 35000, 20, 25, "/Options/SPRITE", 26, 16, "Low", 2, 5, 2010);
         Method1799(35130, 35000, 21, 26, "/Options/SPRITE", 26, 16, "Medium", 3, 5, 2010);
         Method1799(35131, 35000, 22, 27, "/Options/SPRITE", 26, 16, "High", 4, 5, 2010);
         Method1799(35132, 35000, 23, 28, "/Options/SPRITE", 26, 16, "Very High", 5, 5, 2010);
         Method1795(35133, "Water Quality", var2, 1, 16751360, false, true);
         Method1799(35134, 35000, 19, 24, "/Options/SPRITE", 26, 16, "Off", 1, 5, 2011);
         Method1799(35135, 35000, 20, 25, "/Options/SPRITE", 26, 16, "Scale 1.125", 2, 5, 2011);
         Method1799(35136, 35000, 21, 26, "/Options/SPRITE", 26, 16, "Scale 1.25", 3, 5, 2011);
         Method1799(35137, 35000, 22, 27, "/Options/SPRITE", 26, 16, "Scale 1.5", 4, 5, 2011);
         Method1799(35138, 35000, 23, 28, "/Options/SPRITE", 26, 16, "Scale 2.0", 5, 5, 2011);
         Method1795(35139, "Frame Scale", var2, 1, 16751360, false, true);
      }

      int[][] var11 = new int[][]{{35119}, {35002, 35001}, {35006, 35005}, {35008, 35095, 35007}, {35010, 35009}, {35012, 35011}, {35116, 35115}, {35078, 35077, 35071, 35072, 35073, 35074, 35075}, {35114, 35109, 35110, 35111, 35112, 35113}, {35020, 35015, 35016, 35017, 35018, 35019}, {35092, 35087, 35088, 35089, 35090, 35091}, {35133, 35128, 35129, 35130, 35131, 35132}};
      int[][] var13 = new int[][]{{35120}, {35014, 35013}, {35084, 35083}, {35086, 35085}, {35094, 35093}, {35099, 35098}, {35118, 35117}, {35107, 35108, 35106}};
      int[][] var5 = new int[][]{{35121}, {35065, 35064}, {-1}, {35139, 35134, 35135, 35136, 35137, 35138}};
      int[][] var6 = new int[][]{{35122}, {35004, 35003}, {35080, 35079}, {35082, 35081}, {35103, 35102}, {35101, 35100}};
      int var7 = var0 ? 165 : 163;
      int var8 = var0 ? 5 : 4;
      Method1789(30, var8, var11, var4, var0);
      Method1789(30 + var7, var8, var13, var4, var0);
      Method1789(30 + var7, var8 + 156 + (var0 ? 36 : 0), var5, var4, var0);
      Method1789(30 + (var7 << 1), var8, var6, var4, var0);
      int var12 = var0 ? 193 : 0;
      int var9 = var0 ? 0 : -11;
      Method1757(35124, var9 + 408, var12 + 233, var4);
      Method1757(35125, var9 + 408, var12 + 233, var4);
      Method1757(35127, var9 + 419, var12 + 241, var4);
      if (!var1) {
         Field12749['褬'].Field12736 = "Show particles. This has no great impact\non performance and improves quality.\n";
         Field12749['褮'].Field12736 = "Show health values above entities.\nOnly shown during combat.";
         Field12749['褣'].Field12736 = "Show modern hit splats. Disabling this\nshows the classic hit splats.\n";
         Field12749['褤'].Field12736 = "Show additional details for every hit.\nMakes it clear what combat type\n(melee, range, magic, etc.) is used.\n";
         String var10 = "Dynamic Shadows: $r\nHigh shadow qualities decrease the overall\ngame's performance. It may slow down the\nfps rate significantly.\n";
         Method1791(35109, var10.replace("$r", "None"));
         Method1791(35110, var10.replace("$r", "Low"));
         Method1791(35111, var10.replace("$r", "Medium"));
         Method1791(35112, var10.replace("$r", "High"));
         Method1791(35113, var10.replace("$r", "Very High"));
         var10 = "RD $r - Rendering Distance\nThe higher you set the RD\nthe further you can see.\nHigh RD may decrease your\noverall performance.";
         Method1791(35015, var10.replace("$r", "40"));
         Method1791(35016, var10.replace("$r", "50"));
         Method1791(35017, var10.replace("$r", "60"));
         Method1791(35018, var10.replace("$r", "80"));
         Method1791(35019, var10.replace("$r", "100"));

         for(var9 = 35128; var9 <= 35133; ++var9) {
            Method1791(var9, "Water Quality - Increases the\nquality of how water is rendered.\n");
         }

         var10 = "$r Floor Quality\nThe floor quality has little to\nno impact on the performance.\nPick what you like best.\n";
         Method1791(35087, var10.replace("$r", "Very Low"));
         Method1791(35088, var10.replace("$r", "Low"));
         Method1791(35089, var10.replace("$r", "Medium"));
         Method1791(35090, var10.replace("$r", "High"));
         Method1791(35091, var10.replace("$r", "Very High"));
         Field12749['褠'].Field12736 = Field12749['褡'].Field12736 = "Smoothens color transitions of the ground.\nEnabling this enhances the visual quality of\nthe game without the loss of performance.";
         Field12749['褞'].Field12736 = Field12749['褟'].Field12736 = "Reduces the amount of frames rendered for distant\nanimations. Activating this option increases your\noverall fps, especially in crowded areas.";
         Field12749['褜'].Field12736 = Field12749['褝'].Field12736 = "Animated textures of fire capes and magic trees.\nIt's not recommended to tick this option, if you\nare playing on a slow computer.";
         Field12749['褚'].Field12736 = Field12749['褛'].Field12736 = "Attack option always appears on top of all\noptions on monsters and players.\n";
         Field12749['袻'].Field12736 = Field12749['袼'].Field12736 = "VBO Mode - Renders models in static buffers.\nSome computers may be too old to run this.\nWe recommend to always keep it enabled unless\nyou've been advised to disable it.\n";
         Field12749['複'].Field12736 = Field12749['褈'].Field12736 = "Multi model buffering merges static models into\ncommon buffers. This inreases your fps rate.\n";
         Field12749['褉'].Field12736 = Field12749['褊'].Field12736 = "CDL - Cache Downloader\nWhen enabling this setting, all game\ndata will be downloaded in background\nrather than on-demand.";
         Field12749['褋'].Field12736 = Field12749['褌'].Field12736 = "Shows skill timers above your chat box, \ni.e. how long your skill boosts last.";
         Field12749['褍'].Field12736 = Field12749['褎'].Field12736 = "Shows various combat timers above your\nchat box. (vengenace, frozen, teleblock, ...)";
         Field12749['褕'].Field12736 = Field12749['褖'].Field12736 = "Shows item names when hovering over them.";
         Field12749['褘'].Field12736 = Field12749['褙'].Field12736 = "Interpolates animation frames. Results in\nsmooth transitions between frames. You\nmay want to disable this to possibly gain a\nhigher fps rate.";
         var10 = "FPS $f - Frames per Second\nSet the maximum amount of \nFPS the client will render.\nYou can tick the Show FPS box\nto see your current FPS.";
         Method1791(35071, var10.replace("$f", "30"));
         Method1791(35072, var10.replace("$f", "60"));
         Method1791(35073, var10.replace("$f", "80"));
         Method1791(35074, var10.replace("$f", "144"));
         Method1791(35075, var10.replace("$f", "inf."));
         Field12749['袾'].Field12736 = Field12749['袽'].Field12736 = "Adds additional ground models\nto the scene. If you suffer\nfrom low fps rates, you\ndefinitely want to disable\nthis option.\n";
         Field12749['袺'].Field12736 = Field12749['袹'].Field12736 = "Anti Aliasing is smoothening\nedges. On some machines it\nlowers your fps rate.\nIn general it improves the\ngame quality though.\n";
         Field12749['裄'].Field12736 = Field12749['裃'].Field12736 = "Display textures on models. This gives\neverything in the game more detail.\nSlightly impacts performance.";
         Field12749['袿'].Field12736 = Field12749['裀'].Field12736 = "Don't show roofs at all. This setting can give you\na much better fps rate at the cost of not being\nable to see buildings completely.\n";
         Field12749['褗'].Field12736 = "Removes roofs selectively when this setting is enabled.\nOtherwise roofs are always removed at intersections.\n";
         Field12749['装'].Field12736 = Field12749['裆'].Field12736 = "Show experience gains in the\ntop right corner of your screen. \n";
         Field12749['褅'].Field12736 = Field12749['褆'].Field12736 = "Show your current FPS rate in the\ntop right corner of your screen. \n";
         Field12749['裹'].Field12736 = "Fixed-screen mode";
         Field12749['裸'].Field12736 = "Resizable-screen mode";
         var10 = "Frame Scale - x$f\nScales the entire client window by \na given factor. This is useful for 4k\nmonitors or small laptop screens.\nCan improve performance.";
         Method1791(35134, var10.replace("$f", "1.0"));
         Method1791(35135, var10.replace("$f", "1.125"));
         Method1791(35136, var10.replace("$f", "1.25"));
         Method1791(35137, var10.replace("$f", "1.5"));
         Method1791(35138, var10.replace("$f", "2.0"));
      }

   }

   private static void Method1791(int var0, String var1) {
      Field12749[var0].Field12736 = var1;
   }

   private static void Method1792(RSFont[] var0) {
      RSInterface var1 = Method1810(18128);
      Method1805(18129, "/Clan Chat/SPRITE", 6, 72, 32, "Join Chat", 550, 18130, 1);
      Method1806(18130, "/Clan Chat/SPRITE", 7, 72, 32, 18131);
      Method1805(18132, "/Clan Chat/SPRITE", 6, 72, 32, "Leave Chat", -1, 18133, 5);
      Method1806(18133, "/Clan Chat/SPRITE", 7, 72, 32, 18134);
      Method1795(18250, "", var0, 0, 16751360, true, true);
      Method1795(18135, "Join Chat", var0, 0, 16751360, true, true);
      Method1795(18136, "Leave Chat", var0, 0, 16751360, true, true);
      Method1801(18137, 37, "/Clan Chat/SPRITE");
      Method1795(18138, "Clan Chat", var0, 1, 16751360, true, true);
      Method1795(18139, "Talking in: Not in chat", var0, 0, 16751360, false, true);
      Method1795(18140, "Owner: None", var0, 0, 16751360, false, true);
      var1.Method1814(14);
      var1.Method1813(0, 16126, 0, 221);
      var1.Method1813(1, 16126, 0, 59);
      var1.Method1813(2, 18137, 0, 62);
      var1.Method1813(3, 18143, 0, 62);
      var1.Method1813(4, 18129, 15, 226);
      var1.Method1813(5, 18130, 15, 226);
      var1.Method1813(6, 18132, 103, 226);
      var1.Method1813(7, 18133, 103, 226);
      var1.Method1813(8, 18135, 51, 237);
      var1.Method1813(9, 18136, 139, 237);
      var1.Method1813(10, 18138, 95, 3);
      var1.Method1813(11, 18139, 10, 23);
      var1.Method1813(12, 18140, 25, 38);
      var1.Method1813(13, 18250, 145, 15);
      (var1 = Method1810(18143)).Field12794 = 18143;
      var1.Method1814(100);

      int var2;
      for(var2 = 18144; var2 <= 18244; ++var2) {
         Method1795(var2, "", var0, 0, 16777215, false, true);
      }

      var2 = 18144;

      for(int var5 = 0; var2 <= 18243 && var5 <= 99; ++var5) {
         var1.Field12783[var5] = var2;
         var1.Field12784[var5] = 5;
         int var3 = 18144;

         for(int var4 = 1; var3 <= 18243 && var4 <= 99; ++var4) {
            var1.Field12816[0] = 2;
            var1.Field12816[var4] = var1.Field12816[var4 - 1] + 14;
            ++var3;
         }

         ++var2;
      }

      var1.Field12811 = 158;
      var1.Field12758 = 174;
      var1.Field12804 = 1405;
   }

   private static void Method1793(int var0, String var1, int var2, boolean var3, boolean var4, int var5, RSFont[] var6, int var7) {
      RSInterface var8;
      (var8 = Method1776(var0)).Field12775 = var0;
      var8.Field12794 = var0;
      var8.Field12805 = 4;
      var8.Field12754 = 0;
      var8.Field12758 = 0;
      var8.Field12811 = 0;
      var8.Field12751 = 0;
      var8.Field12797 = 0;
      var8.Field12767 = var5;
      var8.Field12761 = var3;
      var8.Field12812 = true;
      var8.Field12786 = var6[var7];
      var8.Field12792 = var1;
      var8.Field12766 = "";
      var8.Field12771 = var2;
   }

   private static void Method1794(RSFont[] var0) {
      RSInterface var1 = Method1776(21100);
      Method1801(21101, 0, "Pest Control/PEST1");
      Method1801(21102, 1, "Pest Control/PEST1");
      Method1801(21103, 2, "Pest Control/PEST1");
      Method1801(21104, 3, "Pest Control/PEST1");
      Method1801(21105, 4, "Pest Control/PEST1");
      Method1801(21106, 5, "Pest Control/PEST1");
      Method1793(21107, "", 13369548, false, true, 52, var0, 1);
      Method1793(21108, "", 255, false, true, 52, var0, 1);
      Method1793(21109, "", 16777028, false, true, 52, var0, 1);
      Method1793(21110, "", 13369344, false, true, 52, var0, 1);
      Method1793(21111, "250", 10092339, false, true, 52, var0, 1);
      Method1793(21112, "250", 10092339, false, true, 52, var0, 1);
      Method1793(21113, "250", 10092339, false, true, 52, var0, 1);
      Method1793(21114, "250", 10092339, false, true, 52, var0, 1);
      Method1793(21115, "200", 10092339, false, true, 52, var0, 1);
      Method1793(21116, "0", 10092339, false, true, 52, var0, 1);
      Method1793(21117, "Time Remaining:", 16777215, false, true, 52, var0, 0);
      Method1793(21118, "", 16777215, false, true, 52, var0, 0);
      var1.Field12783 = new int[18];
      var1.Field12784 = new int[18];
      var1.Field12816 = new int[18];
      Method1835(21101, 361, 26, 0, var1);
      Method1835(21102, 396, 26, 1, var1);
      Method1835(21103, 436, 26, 2, var1);
      Method1835(21104, 474, 26, 3, var1);
      Method1835(21105, 3, 21, 4, var1);
      Method1835(21106, 3, 50, 5, var1);
      Method1835(21107, 371, 60, 6, var1);
      Method1835(21108, 409, 60, 7, var1);
      Method1835(21109, 443, 60, 8, var1);
      Method1835(21110, 479, 60, 9, var1);
      Method1835(21111, 362, 10, 10, var1);
      Method1835(21112, 398, 10, 11, var1);
      Method1835(21113, 436, 10, 12, var1);
      Method1835(21114, 475, 10, 13, var1);
      Method1835(21115, 32, 32, 14, var1);
      Method1835(21116, 32, 62, 15, var1);
      Method1835(21117, 8, 88, 16, var1);
      Method1835(21118, 87, 88, 17, var1);
   }

   private static void Method1795(int var0, String var1, RSFont[] var2, int var3, int var4, boolean var5, boolean var6) {
      Method1797(var0, var1, var2, var3, var4, var5, var6, 0, false);
   }

   private static void Method1796(int var0, String var1, RSFont[] var2, int var3, int var4, boolean var5, boolean var6) {
      Method1797(var0, var1, var2, var3, 14983494, false, true, 0, true);
   }

   private static void Method1797(int var0, String var1, RSFont[] var2, int var3, int var4, boolean var5, boolean var6, int var7, boolean var8) {
      RSInterface var9;
      (var9 = Method1810(var0)).Field12775 = var0;
      var9.Field12794 = var0;
      var9.Field12805 = 4;
      var9.Field12754 = 0;
      var9.Field12758 = var8 ? var2[var3].Method9451(var1) : 0;
      var9.Field12811 = 14;
      var9.Field12751 = 0;
      var9.Field12797 = 0;
      var9.Field12767 = -1;
      var9.Field12761 = var5;
      var9.Field12812 = var6;
      var9.Field12786 = var2[var3];
      var9.Field12792 = var1;
      var9.Field12766 = "";
      var9.Field12771 = var4;
      var9.Field12757 = 0;
      var9.Field12753 = 0;
      var9.Field12782 = 0;
      var9.Field12755 = var7;
      var9.Field12763 = null;
   }

   private static void Method1798(int var0, int var1, String var2, String var3, int var4, int var5) {
      RSInterface var6;
      (var6 = Field12749[var0] = new RSInterface()).Field12794 = var0;
      var6.Field12775 = var0;
      var6.Field12805 = 5;
      var6.Field12754 = 1;
      var6.Field12751 = 0;
      var6.Field12797 = 0;
      var6.Field12767 = 52;
      var6.Field12745 = Method1811(var1, var2, 1.0F);
      var6.Field12803 = Method1811(var1, var2, 1.0F);
      var6.Field12758 = 41;
      var6.Field12811 = 47;
      var6.Field12759 = var3;
      if (var2.equals("/Emotes/EMOTE")) {
         var6.Field12736 = var3;
      }

   }

   private static void Method1799(int var0, int var1, int var2, int var3, String var4, int var5, int var6, String var7, int var8, int var9, int var10) {
      Method1800(var0, var1, var2, var3, var4, 1.0F, var5, var6, var7, var8, var9, var10);
   }

   private static void Method1800(int var0, int var1, int var2, int var3, String var4, float var5, int var6, int var7, String var8, int var9, int var10, int var11) {
      RSInterface var12;
      (var12 = Method1810(var0)).Field12775 = var1;
      var12.Field12794 = var0;
      var12.Field12805 = 5;
      var12.Field12754 = var10;
      var12.Field12751 = 0;
      var12.Field12758 = var6;
      var12.Field12811 = var7;
      var12.Field12797 = 0;
      var12.Field12767 = -1;
      var12.Field12789 = new int[1];
      var12.Field12750 = new int[1];
      var12.Field12789[0] = 1;
      var12.Field12750[0] = var9;
      var12.Field12764 = new int[1][3];
      var12.Field12764[0][0] = 5;
      var12.Field12764[0][1] = var11;
      var12.Field12764[0][2] = 0;
      var12.Field12745 = Method1811(var2, var4, var5);
      var12.Field12803 = Method1811(var3, var4, var5);
      var12.Field12759 = var8;
      if (var4.equals("/Emotes/EMOTE")) {
         var12.Field12736 = var8;
      }

   }

   private static void Method1801(int var0, int var1, String var2) {
      RSInterface var3;
      (var3 = Field12749[var0] = new RSInterface()).Field12794 = var0;
      var3.Field12775 = var0;
      var3.Field12805 = 5;
      var3.Field12754 = 0;
      var3.Field12751 = 0;
      var3.Field12797 = 0;
      var3.Field12767 = 52;
      var3.Field12745 = Method1811(var1, var2, 1.0F);
      var3.Field12803 = Method1811(var1, var2, 1.0F);
      var3.Field12758 = 512;
      var3.Field12811 = 334;
   }

   private static void Method1802(int var0, int var1, String var2) {
      RSInterface var3;
      (var3 = Field12749[var0] = new RSInterface()).Field12794 = var0;
      var3.Field12775 = var0;
      var3.Field12805 = 5;
      var3.Field12754 = 0;
      var3.Field12751 = 0;
      var3.Field12797 = 0;
      var3.Field12767 = 52;
      var3.Field12745 = Method1811(var1, var2, 1.0F);
      var3.Field12803 = Method1811(var1, var2, 1.0F);
      var3.Field12758 = var3.Field12745.Field9894;
      var3.Field12811 = var3.Field12745.Field9895;
   }

   private static RSInterface Method1803(int var0, String var1, int var2) {
      return Method1804(var0, var1, var2, 1);
   }

   private static RSInterface Method1804(int var0, String var1, int var2, int var3) {
      RSInterface var4;
      (var4 = Method1810(var0)).Field12794 = var0;
      var4.Field12775 = var0;
      var4.Field12805 = 2;
      var4.Field12754 = 5;
      var4.Field12759 = var1;
      var4.Field12751 = 2;
      var4.Field12758 = 1;
      var4.Field12811 = 1;
      var4.Field12796 = new int[]{var2};
      var4.Field12795 = new int[]{var3};
      var4.Field12752 = new int[1];
      var4.Field12791 = new int[1];
      var4.Field12747 = new RgbImage[1];
      return var4;
   }

   private static void Method1805(int var0, String var1, int var2, int var3, int var4, String var5, int var6, int var7, int var8) {
      RSInterface var9;
      (var9 = Method1810(var0)).Field12794 = var0;
      var9.Field12775 = var0;
      var9.Field12805 = 5;
      var9.Field12754 = var8;
      var9.Field12751 = var6;
      var9.Field12797 = 0;
      var9.Field12759 = var5;
      var9.Field12767 = var7;
      var9.Field12745 = Method1811(var2, var1, 1.0F);
      var9.Field12803 = Method1811(var2, var1, 1.0F);
      var9.Field12758 = var3;
      var9.Field12811 = var4;
      Method1756(0, var9);
   }

   private static void Method1806(int var0, String var1, int var2, int var3, int var4, int var5) {
      RSInterface var6;
      (var6 = Method1810(var0)).Field12775 = var0;
      var6.Field12794 = var0;
      var6.Field12805 = 0;
      var6.Field12754 = 0;
      var6.Field12758 = var3;
      var6.Field12811 = var4;
      var6.Field12810 = true;
      var6.Field12797 = 0;
      var6.Field12767 = -1;
      var6.Field12804 = 0;
      Method1809(var5, var2, var2, var1, 1.0F);
      var6.Method1814(1);
      var6.Method1813(0, var5, 0, 0);
   }

   private static void Method1807(int var0, String var1, int var2, int var3, String var4) {
      RSInterface var5;
      (var5 = Method1810(var0)).Field12775 = var0;
      var5.Field12794 = var0;
      var5.Field12805 = 5;
      var5.Field12804 = 0;
      var5.Field12745 = Method1811(var2, var1, 1.0F);
      var5.Field12803 = Method1811(var3, var1, 1.0F);
      var5.Field12758 = var5.Field12745.Field9894;
      var5.Field12811 = var5.Field12745.Field9895;
      var5.Field12759 = var4;
      var5.Field12736 = var4;
      var5.Field12754 = 1;
      var5.Field12751 = 0;
      var5.Field12797 = 0;
      var5.Field12767 = 420;
   }

   private static RSInterface Method1808(int var0, int var1, String var2, float var3) {
      return Method1809(var0, var1, -1, var2, var3);
   }

   private static RSInterface Method1809(int var0, int var1, int var2, String var3, float var4) {
      RSInterface var5;
      (var5 = Method1810(var0)).Field12794 = var0;
      var5.Field12775 = var0;
      var5.Field12805 = 5;
      var5.Field12754 = 0;
      var5.Field12751 = 0;
      var5.Field12758 = 512;
      var5.Field12811 = 334;
      var5.Field12797 = 0;
      var5.Field12767 = 52;
      var5.Field12745 = Method1811(var1, var3, var4);
      if (var2 != -1) {
         var5.Field12803 = Method1811(var2, var3, var4);
      }

      return var5;
   }

   private static RSInterface Method1810(int var0) {
      RSInterface var1;
      (var1 = Field12749[var0] = new RSInterface()).Field12794 = var0;
      var1.Field12775 = var0;
      var1.Field12805 = 0;
      var1.Field12754 = 0;
      var1.Field12751 = 0;
      var1.Field12758 = 512;
      var1.Field12811 = 334;
      var1.Field12797 = 0;
      var1.Field12767 = -1;
      return var1;
   }

   private static RgbImage Method1811(int var0, String var1, float var2) {
      long var3 = (Class23.Method204(var1) << 8) + (long)var0;
      if (Field12781 == null) {
         Field12781 = new MemCache(512);
      }

      RgbImage var5;
      if ((var5 = (RgbImage)Field12781.Method1510(var3)) != null) {
         return var5;
      } else {
         try {
            String var7 = var1 + "_" + var0;
            if (var1.equals("skills/")) {
               var7 = var1 + var0;
            } else if (var0 == -255) {
               var7 = var1;
            }

            var5 = new RgbImage(var7, var2, var2);
            if (var1.equals("Bank/BANK") && var0 == 0) {
               var5 = var5.Method880(0, 0, var5.Field9894, var5.Field9895 - 2);
            }

            if (Field12781 != null) {
               Field12781.Method1509(var3, var5);
            }
         } catch (Exception var6) {
            var6.printStackTrace();
            return null;
         }

         var5.Method14493(255, 0, 255);
         return var5;
      }
   }

   private void Method1812(int var1, int var2, int var3, int var4) {
      int[] var9 = new int[this.Field12783.length + 1];
      int[] var5 = new int[this.Field12783.length + 1];
      int[] var6 = new int[this.Field12783.length + 1];
      int var7 = 0;

      for(int var8 = 0; var8 < this.Field12783.length + 1; ++var8) {
         if (var8 == var1) {
            var9[var8] = var2;
            var5[var8] = var3;
            var6[var8] = 4;
         } else {
            var9[var8] = this.Field12783[var7];
            var5[var8] = this.Field12784[var7];
            var6[var8] = this.Field12816[var7];
            ++var7;
         }
      }

      this.Field12783 = var9;
      this.Field12784 = var5;
      this.Field12816 = var6;
   }

   private void Method1813(int var1, int var2, int var3, int var4) {
      while(true) {
         var3 -= Field12732;
         var4 -= Field12733;
         if (var1 < this.Field12783.length) {
            this.Field12783[var1] = var2;
            this.Field12784[var1] = var3;
            this.Field12816[var1] = var4;
            return;
         }

         if (var1 > 1000) {
            throw new RuntimeException("[RSInterface]: error, too large child extension: " + var1);
         }

         int[] var5 = new int[var1 + 1];
         int[] var6 = new int[var1 + 1];
         int[] var7 = new int[var1 + 1];

         for(int var8 = 0; var8 < this.Field12783.length; ++var8) {
            var5[var8] = this.Field12783[var8];
            var6[var8] = this.Field12784[var8];
            var7[var8] = this.Field12816[var8];
         }

         this.Field12783 = var5;
         this.Field12784 = var6;
         this.Field12816 = var7;
         var3 = var3;
         var2 = var2;
         var1 = var1;
         //this = this;
      }
   }

   private void Method1814(int var1) {
      this.Field12783 = new int[var1];
      this.Field12784 = new int[var1];
      this.Field12816 = new int[var1];
   }

   public final Model Method1815() {
      boolean var1 = false;
      var1 = true;
      return Method1816(3, 0, (Player)null);
   }

   private static Model Method1816(int var0, int var1, Player var2) {
      int var3 = (var1 << 8) + var0;
      Model var4;
      if ((var4 = (Model)Field12808.Method1510(var3)) != null) {
         return var4;
      } else {
         if (var0 == 1) {
            var4 = Model.Method14476(var1, false, true);
         } else if (var0 == 2) {
            var4 = NPCDefinition.Method11884(var1).Method11887();
         } else if (var0 == 3) {
            var4 = Client.session_player.getHeadModel(true);
         } else if (var0 == 4) {
            var4 = ItemDef.forID(var1).Method11921(50);
         } else if (var0 == 5) {
            var4 = null;
         } else if (var0 == 6) {
            var4 = var2.getHeadModel(true);
         } else if (var0 == 7) {
            var4 = null;
         }

         if (var4 != null) {
            Field12808.Method1509(var3, var4);
         }

         return var4;
      }
   }

   private static RgbImage Method1817(int var0, JagexArchive var1, String var2) {
      long var3 = (Class23.Method204(var2) << 8) + (long)var0;
      if (var2.equals("combatboxes") && ++Field12738 == 2) {
         Field12738 = 3;
         return null;
      } else if (var2.contains("prayer") && ++Field12737 > 93) {
         return null;
      } else {
         RgbImage var5;
         if ((var5 = (RgbImage)Field12781.Method1510(var3)) != null) {
            return var5;
         } else {
            try {
               var5 = new RgbImage(var1, var2, var0);
               Field12781.Method1509(var3, var5);
               return var5;
            } catch (Exception var6) {
               var6.printStackTrace();
               return null;
            }
         }
      }
   }

   public static void Method1818(boolean var0, Model var1, int var2) {
      if (!var0) {
         int var3 = var2 + 0;
         Field12808.Method1509(var3, var1);
      }
   }

   public static String Method1819(int var0) {
      StringBuilder var1 = new StringBuilder();
      Field12739 = new StringBuilder();
      Field12740 = new StringBuilder();
      Field12741 = new StringBuilder();
      Method1820(var1, var0, 0, 0, 0);
      return var1.toString() + "\n" + Field12739.toString() + "\n" + Field12740.toString() + "\n" + Field12741.toString() + "\n";
   }

   private static void Method1820(StringBuilder var0, int var1, int var2, int var3, int var4) {
      RSInterface var5;
      if ((var5 = Field12749[var1]) != null) {
         int var6;
         if (var5.Field12783 != null) {
            for(var6 = 0; var6 < var5.Field12783.length; ++var6) {
               Method1820(var0, var5.Field12783[var6], var5.Field12784[var6], var5.Field12816[var6], var4 + 1);
            }

         } else {
            for(var6 = 0; var6 < var4; ++var6) {
               var0.append(" ");
            }

            var0.append(var1 + ": [" + var2 + "/" + var3 + "]");
            var0.append("\n");
            Field12739.append(var1 + ", ");
            Field12740.append(var2 + ", ");
            Field12741.append(var3 + ", ");
         }
      }
   }

   public static Model Method1821(Player var0, boolean var1) {
      RSInterface var2;
      if ((var2 = Field12749[969]) == null) {
         return null;
      } else {
         if (var0 != null) {
            var2.Field12773 = !var1 ? 0 : (var0.appearanceColours[0] << 25) + (var0.appearanceColours[4] << 20) + (var0.appearanceModels[0] << 15) + (var0.appearanceModels[8] << 10) + (var0.appearanceModels[11] << 5) + var0.appearanceModels[1];
         }

         var2.Field12772 = var1 ? 6 : 7;
         var2.Field12800 = var2.Field12801 = 9840;
         Sequence var3;
         if ((var3 = Sequence.anims[9840]) == null) {
            return null;
         } else {
            if (var2.Field12790 >= var3.Field10143.length) {
               var2.Field12790 = 0;
            }

            return var2.Method1823(var3.Field10143[var2.Field12790], var3.frame2IDS[var2.Field12790], false, Model.Field2798, var0);
         }
      }
   }

   public final Model Method1822(int var1, int var2, boolean var3, int var4) {
      return this.Method1823(var1, var2, var3, var4, (Player)null);
   }

   private Model Method1823(int var1, int var2, boolean var3, int var4, Player var5) {
      Model var6;
      if (var3) {
         var6 = Method1816(this.Field12798, this.Field12799, var5);
      } else {
         var6 = Method1816(this.Field12772, this.Field12773, var5);
      }

      if (var6 == null) {
         return null;
      } else if (var2 == -1 && var1 == -1 && var6.Field2836 == null) {
         var6.Field2745 = false;
         return var6;
      } else {
         var6 = new Model(false, false, Class518.Method8352(var2) & Class518.Method8352(var1), false, var6, 10);
         if (var2 != -1 || var1 != -1) {
            var6.Method14482();
         }

         if (var2 != -1) {
            var6.Method14519(var2, var4);
         }

         if (var1 != -1) {
            var6.Method14519(var1, var4);
         }

         var6.Method14502(84, 1000, -90, -580, -90, true);
         return var6;
      }
   }

   private static RgbImage Method1824(int var0, String var1) {
      var1 = "/Lunar/" + var1;
      return Method1811(var0, var1, 1.0F);
   }

   private static void Method1825(int var0, int var1, String var2) {
      RSInterface var3;
      (var3 = Method1810(var0)).Field12794 = var0;
      var3.Field12775 = var0;
      var3.Field12805 = 5;
      var3.Field12754 = 5;
      var3.Field12751 = 0;
      var3.Field12797 = 0;
      var3.Field12767 = 52;
      var3.Field12745 = Method1824(var1, var2);
      var3.Field12758 = 500;
      var3.Field12811 = 500;
      var3.Field12759 = "";
   }

   private static void Method1826(int var0, int var1) {
      RSInterface var2;
      (var2 = Method1810(var0)).Field12805 = 5;
      var2.Field12754 = 0;
      var2.Field12751 = 0;
      var2.Field12797 = 0;
      var2.Field12767 = 52;
      var2.Field12745 = Method1824(var1, "Rune");
      var2.Field12758 = 500;
      var2.Field12811 = 500;
   }

   private static void Method1827(int var0, int var1, int var2, RSFont[] var3) {
      RSInterface var4;
      (var4 = Method1810(var0)).Field12794 = var0;
      var4.Field12775 = 29999;
      var4.Field12805 = 4;
      var4.Field12754 = 0;
      var4.Field12751 = 0;
      var4.Field12758 = 0;
      var4.Field12811 = 14;
      var4.Field12797 = 0;
      var4.Field12767 = -1;
      var4.Field12789 = new int[1];
      var4.Field12750 = new int[1];
      var4.Field12789[0] = 3;
      var4.Field12750[0] = var1 - 1;
      var4.Field12764 = new int[1][4];
      var4.Field12764[0][0] = 4;
      var4.Field12764[0][1] = 3214;
      var4.Field12764[0][2] = var2;
      var4.Field12764[0][3] = 0;
      var4.Field12761 = true;
      var4.Field12786 = var3[0];
      var4.Field12812 = true;
      var4.Field12792 = "%1/" + var1;
      var4.Field12766 = "%1/" + var1;
      var4.Field12736 = "";
      var4.Field12771 = 12582912;
   }

   private static void Method1828(int var0, int var1, int var2, int var3, int var4, int var5, int var6, String var7, String var8, RSFont[] var9, int var10, int var11, int var12) {
      RSInterface var13;
      (var13 = Method1810(var0)).Field12794 = var0;
      var13.Field12775 = 29999;
      var13.Field12805 = 5;
      var13.Field12754 = var12;
      var13.Field12751 = 0;
      var13.Field12767 = var0 + 1;
      var13.Field12780 = var11;
      var13.Field12760 = "Cast On";
      var13.Field12758 = 20;
      var13.Field12811 = 20;
      var13.Field12759 = "Cast @gre@" + var7;
      var13.Field12756 = var7;
      var13.Field12789 = new int[3];
      var13.Field12750 = new int[3];
      var13.Field12789[0] = 3;
      var13.Field12750[0] = var3;
      var13.Field12789[1] = 3;
      var13.Field12750[1] = var4;
      var13.Field12789[2] = 3;
      var13.Field12750[2] = var6;
      var13.Field12764 = new int[3][];
      var13.Field12764[0] = new int[4];
      var13.Field12764[0][0] = 4;
      var13.Field12764[0][1] = 3214;
      var13.Field12764[0][2] = 9075;
      var13.Field12764[0][3] = 0;
      var13.Field12764[1] = new int[4];
      var13.Field12764[1][0] = 4;
      var13.Field12764[1][1] = 3214;
      var13.Field12764[1][2] = 557;
      var13.Field12764[1][3] = 0;
      var13.Field12764[2] = new int[3];
      var13.Field12764[2][0] = 1;
      var13.Field12764[2][1] = 6;
      var13.Field12764[2][2] = 0;
      var13.Field12803 = Method1824(var10, "LUNARON");
      var13.Field12745 = Method1824(var10, "LUNAROFF");
      (var13 = Method1810(var0 + 1)).Field12810 = true;
      var13.Method1814(7);
      Method1825(var0 + 2, 0, "BOX");
      Method1835(var0 + 2, 0, 0, 0, var13);
      Method1793(var0 + 3, "Level " + (var6 + 1) + ": " + var7, 16750623, true, true, 52, var9, 1);
      Method1835(var0 + 3, 90, 4, 1, var13);
      Method1793(var0 + 4, var8, 11495962, true, true, 52, var9, 0);
      Method1835(var0 + 4, 90, 19, 2, var13);
      Method1835(30016, 37, 35, 3, var13);
      Method1835(30006, 112, 35, 4, var13);
      Method1827(var0 + 5, var3 + 1, 9075, var9);
      Method1835(var0 + 5, 50, 66, 5, var13);
      Method1827(var0 + 6, var4 + 1, 557, var9);
      Method1835(var0 + 6, 123, 66, 6, var13);
   }

   private static void Method1829(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, String var10, String var11, RSFont[] var12, int var13, int var14, int var15) {
      RSInterface var16;
      (var16 = Method1810(var0)).Field12794 = var0;
      var16.Field12775 = 29999;
      var16.Field12805 = 5;
      var16.Field12754 = var15;
      var16.Field12751 = 0;
      var16.Field12767 = var0 + 1;
      var16.Field12780 = var14;
      var16.Field12760 = "Cast on";
      var16.Field12758 = 20;
      var16.Field12811 = 20;
      var16.Field12759 = "Cast @gre@" + var10;
      var16.Field12756 = var10;
      var16.Field12789 = new int[4];
      var16.Field12750 = new int[4];
      var16.Field12789[0] = 3;
      var16.Field12750[0] = var4;
      var16.Field12789[1] = 3;
      var16.Field12750[1] = var5;
      var16.Field12789[2] = 3;
      var16.Field12750[2] = var6;
      var16.Field12789[3] = 3;
      var16.Field12750[3] = var9;
      var16.Field12764 = new int[4][];
      var16.Field12764[0] = new int[4];
      var16.Field12764[0][0] = 4;
      var16.Field12764[0][1] = 3214;
      var16.Field12764[0][2] = 9075;
      var16.Field12764[0][3] = 0;
      var16.Field12764[1] = new int[4];
      var16.Field12764[1][0] = 4;
      var16.Field12764[1][1] = 3214;
      var16.Field12764[1][2] = var2;
      var16.Field12764[1][3] = 0;
      var16.Field12764[2] = new int[4];
      var16.Field12764[2][0] = 4;
      var16.Field12764[2][1] = 3214;
      var16.Field12764[2][2] = var3;
      var16.Field12764[2][3] = 0;
      var16.Field12764[3] = new int[3];
      var16.Field12764[3][0] = 1;
      var16.Field12764[3][1] = 6;
      var16.Field12764[3][2] = 0;
      var16.Field12803 = Method1824(var13, "LUNARON");
      var16.Field12745 = Method1824(var13, "LUNAROFF");
      (var16 = Method1810(var0 + 1)).Field12810 = true;
      var16.Method1814(9);
      Method1825(var0 + 2, 0, "BOX");
      Method1835(var0 + 2, 0, 0, 0, var16);
      Method1793(var0 + 3, "Level " + (var9 + 1) + ": " + var10, 16750623, true, true, 52, var12, 1);
      Method1835(var0 + 3, 90, 4, 1, var16);
      Method1793(var0 + 4, var11, 11495962, true, true, 52, var12, 0);
      Method1835(var0 + 4, 90, 19, 2, var16);
      Method1835(30016, 14, 35, 3, var16);
      Method1835(var7, 74, 35, 4, var16);
      Method1835(var8, 130, 35, 5, var16);
      Method1827(var0 + 5, var4 + 1, 9075, var12);
      Method1835(var0 + 5, 26, 66, 6, var16);
      Method1827(var0 + 6, var5 + 1, var2, var12);
      Method1835(var0 + 6, 87, 66, 7, var16);
      Method1827(var0 + 7, var6 + 1, var3, var12);
      Method1835(var0 + 7, 142, 66, 8, var16);
   }

   private static void Method1830(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, String var10, String var11, RSFont[] var12, int var13, int var14, int var15) {
      RSInterface var16;
      (var16 = Method1810(var0)).Field12794 = var0;
      var16.Field12775 = 29999;
      var16.Field12805 = 5;
      var16.Field12754 = var15;
      var16.Field12751 = 0;
      var16.Field12767 = var0 + 1;
      var16.Field12780 = var14;
      var16.Field12760 = "Cast on";
      var16.Field12758 = 20;
      var16.Field12811 = 20;
      var16.Field12759 = "Cast @gre@" + var10;
      var16.Field12756 = var10;
      var16.Field12789 = new int[4];
      var16.Field12750 = new int[4];
      var16.Field12789[0] = 3;
      var16.Field12750[0] = var4;
      var16.Field12789[1] = 3;
      var16.Field12750[1] = var5;
      var16.Field12789[2] = 3;
      var16.Field12750[2] = var6;
      var16.Field12789[3] = 3;
      var16.Field12750[3] = var9;
      var16.Field12764 = new int[4][];
      var16.Field12764[0] = new int[4];
      var16.Field12764[0][0] = 4;
      var16.Field12764[0][1] = 3214;
      var16.Field12764[0][2] = 9075;
      var16.Field12764[0][3] = 0;
      var16.Field12764[1] = new int[4];
      var16.Field12764[1][0] = 4;
      var16.Field12764[1][1] = 3214;
      var16.Field12764[1][2] = var2;
      var16.Field12764[1][3] = 0;
      var16.Field12764[2] = new int[4];
      var16.Field12764[2][0] = 4;
      var16.Field12764[2][1] = 3214;
      var16.Field12764[2][2] = var3;
      var16.Field12764[2][3] = 0;
      var16.Field12764[3] = new int[3];
      var16.Field12764[3][0] = 1;
      var16.Field12764[3][1] = 6;
      var16.Field12764[3][2] = 0;
      var16.Field12803 = Method1824(var13, "LUNARON");
      var16.Field12745 = Method1824(var13, "LUNAROFF");
      (var16 = Method1810(var0 + 1)).Field12810 = true;
      var16.Method1814(9);
      Method1825(var0 + 2, 1, "BOX");
      Method1835(var0 + 2, 0, 0, 0, var16);
      Method1793(var0 + 3, "Level " + (var9 + 1) + ": " + var10, 16750623, true, true, 52, var12, 1);
      Method1835(var0 + 3, 90, 4, 1, var16);
      Method1793(var0 + 4, var11, 11495962, true, true, 52, var12, 0);
      Method1835(var0 + 4, 90, 21, 2, var16);
      Method1835(30016, 14, 48, 3, var16);
      Method1835(var7, 74, 48, 4, var16);
      Method1835(var8, 130, 48, 5, var16);
      Method1827(var0 + 5, var4 + 1, 9075, var12);
      Method1835(var0 + 5, 26, 79, 6, var16);
      Method1827(var0 + 6, var5 + 1, var2, var12);
      Method1835(var0 + 6, 87, 79, 7, var16);
      Method1827(var0 + 7, var6 + 1, var3, var12);
      Method1835(var0 + 7, 142, 79, 8, var16);
   }

   private static void Method1831(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, String var10, String var11, RSFont[] var12, int var13, int var14, int var15) {
      RSInterface var16;
      (var16 = Method1810(var0)).Field12794 = var0;
      var16.Field12775 = 29999;
      var16.Field12805 = 5;
      var16.Field12754 = 5;
      var16.Field12751 = 0;
      var16.Field12767 = var0 + 1;
      var16.Field12780 = 0;
      var16.Field12760 = "Cast on";
      var16.Field12758 = 20;
      var16.Field12811 = 20;
      var16.Field12759 = "Cast @gre@" + var10;
      var16.Field12756 = var10;
      var16.Field12789 = new int[4];
      var16.Field12750 = new int[4];
      var16.Field12789[0] = 3;
      var16.Field12750[0] = 1;
      var16.Field12789[1] = 3;
      var16.Field12750[1] = var5;
      var16.Field12789[2] = 3;
      var16.Field12750[2] = var6;
      var16.Field12789[3] = 3;
      var16.Field12750[3] = var9;
      var16.Field12764 = new int[4][];
      var16.Field12764[0] = new int[4];
      var16.Field12764[0][0] = 4;
      var16.Field12764[0][1] = 3214;
      var16.Field12764[0][2] = 9075;
      var16.Field12764[0][3] = 0;
      var16.Field12764[1] = new int[4];
      var16.Field12764[1][0] = 4;
      var16.Field12764[1][1] = 3214;
      var16.Field12764[1][2] = var2;
      var16.Field12764[1][3] = 0;
      var16.Field12764[2] = new int[4];
      var16.Field12764[2][0] = 4;
      var16.Field12764[2][1] = 3214;
      var16.Field12764[2][2] = 555;
      var16.Field12764[2][3] = 0;
      var16.Field12764[3] = new int[3];
      var16.Field12764[3][0] = 1;
      var16.Field12764[3][1] = 6;
      var16.Field12764[3][2] = 0;
      var16.Field12803 = Method1824(var13, "LUNARON");
      var16.Field12745 = Method1824(var13, "LUNAROFF");
      (var16 = Method1810(var0 + 1)).Field12810 = true;
      var16.Method1814(9);
      Method1825(var0 + 2, 2, "BOX");
      Method1835(var0 + 2, 0, 0, 0, var16);
      Method1793(var0 + 3, "Level " + (var9 + 1) + ": " + var10, 16750623, true, true, 52, var12, 1);
      Method1835(var0 + 3, 90, 4, 1, var16);
      Method1793(var0 + 4, var11, 11495962, true, true, 52, var12, 0);
      Method1835(var0 + 4, 90, 34, 2, var16);
      Method1835(30016, 14, 61, 3, var16);
      Method1835(var7, 74, 61, 4, var16);
      Method1835(30004, 130, 61, 5, var16);
      Method1827(var0 + 5, 2, 9075, var12);
      Method1835(var0 + 5, 26, 92, 6, var16);
      Method1827(var0 + 6, var5 + 1, var2, var12);
      Method1835(var0 + 6, 87, 92, 7, var16);
      Method1827(var0 + 7, var6 + 1, 555, var12);
      Method1835(var0 + 7, 142, 92, 8, var16);
   }

   private static void Method1832(RSFont[] var0) {
      Method1826(30003, 1);
      Method1826(30004, 2);
      Method1826(30005, 3);
      Method1826(30006, 4);
      Method1826(30007, 5);
      Method1826(30008, 6);
      Method1826(30009, 7);
      Method1826(30010, 8);
      Method1826(30011, 9);
      Method1826(30012, 10);
      Method1826(30013, 11);
      Method1826(30014, 12);
      Method1826(30015, 13);
      Method1826(30016, 14);
      Method1829(30017, 9075, 554, 555, 0, 4, 3, 30003, 30004, 64, "Bake Pie", "Bake pies without a stove", var0, 0, 16, 2);
      Method1828(30025, 9075, 557, 0, 7, 30006, 65, "Cure Plant", "Cure disease on farming patch", var0, 1, 4, 2);
      Method1830(30032, 9075, 564, 558, 0, 0, 0, 30013, 30007, 65, "Monster Examine", "Detect the combat statistics of a\\nmonster", var0, 2, 2, 2);
      Method1829(30040, 9075, 564, 556, 0, 0, 1, 30013, 30005, 66, "NPC Contact", "Speak with varied NPCs", var0, 3, 0, 5);
      Method1829(30048, 9075, 563, 557, 0, 0, 9, 30012, 30006, 67, "Cure Other", "Cure poisoned players", var0, 4, 8, 2);
      Method1829(30056, 9075, 555, 554, 0, 2, 0, 30004, 30003, 67, "Humidify", "Fills certain vessels with water", var0, 5, 0, 5);
      Method1829(30064, 9075, 563, 557, 1, 0, 1, 30012, 30006, 68, "Moonclan Teleport", "Teleports you to moonclan island", var0, 6, 0, 5);
      Method1830(30075, 9075, 563, 557, 1, 0, 3, 30012, 30006, 69, "Tele Group Moonclan", "Teleports players to Moonclan\\nisland", var0, 7, 0, 5);
      Method1829(30083, 9075, 563, 557, 1, 0, 5, 30012, 30006, 70, "Ourania Teleport", "Teleports you to ourania rune altar", var0, 8, 0, 5);
      Method1829(30091, 9075, 564, 563, 1, 1, 0, 30013, 30012, 70, "Cure Me", "Cures Poison", var0, 9, 0, 5);
      Method1828(30099, 9075, 557, 1, 1, 30006, 70, "Hunter Kit", "Get a kit of hunting gear", var0, 10, 0, 5);
      Method1829(30106, 9075, 563, 555, 1, 1, 0, 30012, 30004, 71, "Shilo Teleport", "Teleports you to Shilo Village", var0, 11, 0, 5);
      Method1830(30114, 9075, 563, 555, 1, 0, 3, 30012, 30004, 72, "Tele Group Shilo", "Teleports players to \\nShilo Village", var0, 12, 0, 5);
      Method1829(30122, 9075, 564, 563, 1, 1, 1, 30013, 30012, 73, "Cure Group", "Cures Poison on players", var0, 13, 0, 5);
      Method1830(30130, 9075, 564, 559, 1, 1, 4, 30013, 30008, 74, "Stat Spy", "Cast on another player to see their\\nskill levels", var0, 14, 8, 2);
      Method1830(30138, 9075, 563, 554, 1, 1, 2, 30012, 30003, 74, "Barbarian Teleport", "Teleports you to the Barbarian\\noutpost", var0, 15, 0, 5);
      Method1830(30146, 9075, 563, 554, 1, 1, 5, 30012, 30003, 75, "Tele Group Barbarian", "Teleports players to the Barbarian\\noutpost", var0, 16, 0, 5);
      Method1829(30154, 9075, 554, 556, 1, 5, 9, 30003, 30005, 76, "Superglass Make", "Make glass without a furnace", var0, 17, 16, 2);
      Method1830(30162, 9075, 563, 555, 1, 1, 3, 30012, 30004, 77, "Pollnivneach Teleport", "Teleports you to the desert\\n city Pollnivneach", var0, 18, 0, 5);
      Method1831(30170, 9075, 563, 555, 1, 1, 7, 30012, 30004, 78, "Tele Group \\nPollnivneach", "Teleports players to the desert\\n city Pollnivneach", var0, 19, 0, 5);
      Method1830(30178, 9075, 564, 559, 1, 0, 4, 30013, 30008, 78, "Dream", "Take a rest and restore hitpoints\\n 10 times faster", var0, 20, 0, 5);
      Method1829(30186, 9075, 557, 555, 1, 9, 4, 30006, 30004, 79, "String Jewellery", "String amulets without wool", var0, 21, 0, 5);
      Method1831(30194, 9075, 557, 555, 1, 9, 9, 30006, 30004, 80, "Stat Restore Pot\\nShare", "Share a potion with up to 4 nearby\\nplayers", var0, 22, 0, 5);
      Method1829(30202, 9075, 554, 555, 1, 6, 6, 30003, 30004, 81, "Magic Imbue", "Combine runes without a talisman", var0, 23, 0, 5);
      Method1830(30210, 9075, 561, 557, 2, 1, 14, 30010, 30006, 82, "Fertile Soil", "Fertilise a farming patch with super\\ncompost", var0, 24, 4, 2);
      Method1830(30218, 9075, 557, 555, 2, 11, 9, 30006, 30004, 83, "Boost Potion Share", "Shares a potion with up to 4 nearby\\nplayers", var0, 25, 0, 5);
      Method1830(30226, 9075, 563, 555, 1, 2, 6, 30012, 30004, 84, "Dagannoth Teleport", "Teleports you to the \\nDagannoth Cave", var0, 26, 0, 5);
      Method1831(30234, 9075, 563, 555, 1, 2, 13, 30012, 30004, 85, "Tele Group \\nDagannoth", "Teleports players to the\\nDagannoth Cave", var0, 27, 0, 5);
      Method1829(30242, 9075, 557, 561, 2, 14, 0, 30006, 30010, 85, "Plank Make", "Turn Logs into planks", var0, 28, 16, 2);
      Method1829(30250, 9075, 563, 555, 2, 2, 9, 30012, 30004, 86, "Catherby Teleport", "Teleports you to Catherby", var0, 29, 0, 5);
      Method1829(30258, 9075, 563, 555, 2, 2, 14, 30012, 30004, 87, "Tele Group Catherby", "Teleports players to Catherby", var0, 30, 0, 5);
      Method1829(30266, 9075, 563, 555, 2, 2, 7, 30012, 30004, 88, "Ice Plateau Teleport", "Teleports you to Ice Plateau", var0, 31, 0, 5);
      Method1829(30274, 9075, 563, 555, 2, 2, 15, 30012, 30004, 89, "Tele Group Ice Plateau", "Teleports players to Ice Plateau", var0, 32, 0, 5);
      Method1830(30282, 9075, 563, 561, 2, 1, 0, 30012, 30010, 90, "Energy Transfer", "Transfer hitpoints and run energy\\n to another player.", var0, 33, 8, 2);
      Method1830(30290, 9075, 563, 565, 2, 2, 0, 30012, 30014, 91, "Heal Other", "Transfer up to 75% of hitpoints\\n to another player", var0, 34, 8, 2);
      Method1830(30298, 9075, 560, 557, 2, 1, 9, 30009, 30006, 92, "Vengeance Other", "Allows another player to rebound\\ndamage to an opponent", var0, 35, 8, 2);
      Method1829(30306, 9075, 560, 557, 3, 1, 9, 30009, 30006, 93, "Vengeance", "Rebound damage to an opponent", var0, 36, 0, 5);
      Method1830(30314, 9075, 565, 563, 3, 2, 5, 30014, 30012, 94, "Heal Group", "Transfer up to 75% of hitpoints\\n to a group", var0, 37, 0, 5);
      Method1830(30322, 9075, 564, 563, 2, 1, 0, 30013, 30012, 95, "Spellbook Swap", "Change to another spellbook for 1\\nspell cast", var0, 38, 0, 5);
      RSInterface var1;
      (var1 = Method1810(29999)).Method1814(79);
      Method1835(1195, 11, 10, 0, var1);
      Method1835(30017, 40, 9, 1, var1);
      Method1835(30025, 71, 12, 2, var1);
      Method1835(30032, 103, 10, 3, var1);
      Method1835(30040, 135, 12, 4, var1);
      Method1835(30048, 165, 10, 5, var1);
      Method1835(30056, 8, 38, 6, var1);
      Method1835(30064, 39, 39, 7, var1);
      Method1835(30075, 71, 39, 8, var1);
      Method1835(30083, 103, 39, 9, var1);
      Method1835(30091, 135, 39, 10, var1);
      Method1835(30099, 165, 37, 11, var1);
      Method1835(30106, 12, 68, 12, var1);
      Method1835(30114, 42, 68, 13, var1);
      Method1835(30122, 71, 68, 14, var1);
      Method1835(30130, 103, 68, 15, var1);
      Method1835(30138, 135, 68, 16, var1);
      Method1835(30146, 165, 68, 17, var1);
      Method1835(30154, 14, 97, 18, var1);
      Method1835(30162, 42, 97, 19, var1);
      Method1835(30170, 71, 97, 20, var1);
      Method1835(30178, 101, 97, 21, var1);
      Method1835(30186, 135, 98, 22, var1);
      Method1835(30194, 168, 98, 23, var1);
      Method1835(30202, 11, 125, 24, var1);
      Method1835(30210, 42, 124, 25, var1);
      Method1835(30218, 74, 125, 26, var1);
      Method1835(30226, 103, 125, 27, var1);
      Method1835(30234, 135, 125, 28, var1);
      Method1835(30242, 164, 126, 29, var1);
      Method1835(30250, 10, 155, 30, var1);
      Method1835(30258, 42, 155, 31, var1);
      Method1835(30266, 71, 155, 32, var1);
      Method1835(30274, 103, 155, 33, var1);
      Method1835(30282, 136, 155, 34, var1);
      Method1835(30290, 165, 155, 35, var1);
      Method1835(30298, 13, 185, 36, var1);
      Method1835(30306, 42, 185, 37, var1);
      Method1835(30314, 71, 184, 38, var1);
      Method1835(30322, 104, 184, 39, var1);
      Method1835(30018, 6, 176, 40, var1);
      Method1835(30026, 6, 176, 41, var1);
      Method1835(30033, 6, 163, 42, var1);
      Method1835(30041, 6, 176, 43, var1);
      Method1835(30049, 6, 176, 44, var1);
      Method1835(30057, 6, 176, 45, var1);
      Method1835(30065, 6, 176, 46, var1);
      Method1835(30076, 6, 163, 47, var1);
      Method1835(30084, 6, 176, 48, var1);
      Method1835(30092, 6, 176, 49, var1);
      Method1835(30100, 6, 176, 50, var1);
      Method1835(30107, 6, 176, 51, var1);
      Method1835(30115, 6, 163, 52, var1);
      Method1835(30123, 6, 176, 53, var1);
      Method1835(30131, 6, 163, 54, var1);
      Method1835(30139, 6, 163, 55, var1);
      Method1835(30147, 6, 163, 56, var1);
      Method1835(30155, 6, 176, 57, var1);
      Method1835(30163, 6, 163, 58, var1);
      Method1835(30171, 6, 149, 59, var1);
      Method1835(30179, 6, 163, 60, var1);
      Method1835(30187, 6, 176, 61, var1);
      Method1835(30195, 6, 149, 62, var1);
      Method1835(30203, 6, 176, 63, var1);
      Method1835(30211, 6, 163, 64, var1);
      Method1835(30219, 6, 163, 65, var1);
      Method1835(30227, 6, 163, 66, var1);
      Method1835(30235, 6, 149, 67, var1);
      Method1835(30243, 6, 176, 68, var1);
      Method1835(30251, 6, 4, 69, var1);
      Method1835(30259, 6, 4, 70, var1);
      Method1835(30267, 6, 4, 71, var1);
      Method1835(30275, 6, 4, 72, var1);
      Method1835(30283, 6, 4, 73, var1);
      Method1835(30291, 6, 4, 74, var1);
      Method1835(30299, 6, 4, 75, var1);
      Method1835(30307, 6, 4, 76, var1);
      Method1835(30315, 6, 4, 77, var1);
      Method1835(30323, 6, 4, 78, var1);
   }

   private static void Method1833(RSFont[] var0) {
      RSInterface var1 = Method1776(31110);
      Method1756(104, var1);
      Method1769(31111, 2, "SkillTab/SKILL", "View @or1@Attack @whi@guide", 31112, 1);
      Method1771(31112, "Exp: ");
      Method1793(31114, "99", 16772659, false, true, 52, var0, 0);
      Method1793(31115, "99", 16772659, false, true, 52, var0, 0);
      Method1769(31116, 22, "SkillTab/SKILL", "View @or1@Strength @whi@guide", 31117, 1);
      Method1771(31117, "Exp: ");
      Method1793(31119, "99", 16772659, false, true, 52, var0, 0);
      Method1793(31120, "99", 16772659, false, true, 52, var0, 0);
      Method1769(31121, 6, "SkillTab/SKILL", "View @or1@Defence @whi@guide", 31122, 1);
      Method1771(31122, "Exp: ");
      Method1793(31124, "99", 16772659, false, true, 52, var0, 0);
      Method1793(31125, "99", 16772659, false, true, 52, var0, 0);
      Method1769(31126, 18, "SkillTab/SKILL", "View @or1@Ranged @whi@guide", 31127, 1);
      Method1771(31127, "Exp: ");
      Method1793(31129, "99", 16772659, false, true, 52, var0, 0);
      Method1793(31130, "99", 16772659, false, true, 52, var0, 0);
      Method1769(31131, 17, "SkillTab/SKILL", "View @or1@Prayer @whi@guide", 31132, 1);
      Method1771(31132, "Exp: ");
      Method1793(31134, "99", 16772659, false, true, 52, var0, 0);
      Method1793(31135, "99", 16772659, false, true, 52, var0, 0);
      Method1769(31136, 15, "SkillTab/SKILL", "View @or1@Magic @whi@guide", 31137, 1);
      Method1771(31137, "Exp: ");
      Method1793(31139, "99", 16772659, false, true, 52, var0, 0);
      Method1793(31140, "99", 16772659, false, true, 52, var0, 0);
      Method1769(31141, 19, "SkillTab/SKILL", "View @or1@Runecrafting @whi@guide", 31142, 1);
      Method1771(31142, "Exp: ");
      Method1793(31144, "99", 16772659, false, true, 52, var0, 0);
      Method1793(31145, "99", 16772659, false, true, 52, var0, 0);
      Method1769(31146, 3, "SkillTab/SKILL", "View @or1@Construction @whi@guide", 31147, 1);
      Method1771(31147, "Exp: ");
      Method1793(31149, "99", 16772659, false, true, 52, var0, 0);
      Method1793(31150, "99", 16772659, false, true, 52, var0, 0);
      Method1769(31151, 7, "SkillTab/SKILL", "View @or1@Dungeoneering @whi@guide", 31152, 1);
      Method1771(31152, "Exp: ");
      Method1793(31154, "99", 16772659, false, true, 52, var0, 0);
      Method1793(31155, "99", 16772659, false, true, 52, var0, 0);
      Method1769(31156, 13, "SkillTab/SKILL", "View @or1@Hitpoints @whi@guide", 31157, 1);
      Method1771(31157, "Exp: ");
      Method1793(31159, "99", 16772659, false, true, 52, var0, 0);
      Method1793(31160, "99", 16772659, false, true, 52, var0, 0);
      Method1769(31161, 1, "SkillTab/SKILL", "View @or1@Agility @whi@guide", 31162, 1);
      Method1771(31162, "Exp: ");
      Method1793(31164, "99", 16772659, false, true, 52, var0, 0);
      Method1793(31165, "99", 16772659, false, true, 52, var0, 0);
      Method1769(31166, 12, "SkillTab/SKILL", "View @or1@Herblore @whi@guide", 31167, 1);
      Method1771(31167, "Exp: ");
      Method1793(31169, "99", 16772659, false, true, 52, var0, 0);
      Method1793(31170, "99", 16772659, false, true, 52, var0, 0);
      Method1769(31171, 24, "SkillTab/SKILL", "View @or1@Thieving @whi@guide", 31172, 1);
      Method1771(31172, "Exp: ");
      Method1793(31174, "99", 16772659, false, true, 52, var0, 0);
      Method1793(31175, "99", 16772659, false, true, 52, var0, 0);
      Method1769(31176, 5, "SkillTab/SKILL", "View @or1@Crafting @whi@guide", 31177, 1);
      Method1771(31177, "Exp: ");
      Method1793(31179, "99", 16772659, false, true, 52, var0, 0);
      Method1793(31180, "99", 16772659, false, true, 52, var0, 0);
      Method1769(31181, 11, "SkillTab/SKILL", "View @or1@Fletching @whi@guide", 31182, 1);
      Method1771(31182, "Exp: ");
      Method1793(31184, "99", 16772659, false, true, 52, var0, 0);
      Method1793(31185, "99", 16772659, false, true, 52, var0, 0);
      Method1769(31186, 20, "SkillTab/SKILL", "View @or1@Slayer @whi@guide", 31187, 1);
      Method1771(31187, "Exp: ");
      Method1793(31189, "99", 16772659, false, true, 52, var0, 0);
      Method1793(31190, "99", 16772659, false, true, 52, var0, 0);
      Method1769(31191, 14, "SkillTab/SKILL", "View @or1@Hunter @whi@guide", 31192, 1);
      Method1771(31192, "Exp: ");
      Method1793(31194, "99", 16772659, false, true, 52, var0, 0);
      Method1793(31195, "99", 16772659, false, true, 52, var0, 0);
      Method1769(31196, 0, "SkillTab/TOTAL", (String)null, 31197, 1);
      Method1793(31199, "Total Level:", 16772659, false, true, 52, var0, 0);
      Method1793(31200, "2475", 16772659, false, true, 52, var0, 0);
      Method1769(31201, 16, "SkillTab/SKILL", "View @or1@Mining @whi@guide", 31202, 1);
      Method1771(31202, "Exp: ");
      Method1793(31204, "99", 16772659, false, true, 52, var0, 0);
      Method1793(31205, "99", 16772659, false, true, 52, var0, 0);
      Method1769(31206, 21, "SkillTab/SKILL", "View @or1@Smithing @whi@guide", 31207, 1);
      Method1771(31207, "Exp: ");
      Method1793(31209, "99", 16772659, false, true, 52, var0, 0);
      Method1793(31210, "99", 16772659, false, true, 52, var0, 0);
      Method1769(31211, 10, "SkillTab/SKILL", "View @or1@Fishing @whi@guide", 31212, 1);
      Method1771(31212, "Exp: ");
      Method1793(31214, "99", 16772659, false, true, 52, var0, 0);
      Method1793(31215, "99", 16772659, false, true, 52, var0, 0);
      Method1769(31216, 4, "SkillTab/SKILL", "View @or1@Cooking @whi@guide", 31217, 1);
      Method1771(31217, "Exp: ");
      Method1793(31219, "99", 16772659, false, true, 52, var0, 0);
      Method1793(31220, "99", 16772659, false, true, 52, var0, 0);
      Method1769(31221, 9, "SkillTab/SKILL", "View @or1@Firemaking @whi@guide", 31222, 1);
      Method1771(31222, "Exp: ");
      Method1793(31224, "99", 16772659, false, true, 52, var0, 0);
      Method1793(31225, "99", 16772659, false, true, 52, var0, 0);
      Method1769(31226, 0, "SkillTab/SKILL", "View @or1@Woodcutting @whi@guide", 31227, 1);
      Method1771(31227, "Exp: ");
      Method1793(31229, "99", 16772659, false, true, 52, var0, 0);
      Method1793(31230, "99", 16772659, false, true, 52, var0, 0);
      Method1769(31231, 8, "SkillTab/SKILL", "View @or1@Farming @whi@guide", 31232, 1);
      Method1771(31232, "Exp: ");
      Method1793(31234, "99", 16772659, false, true, 52, var0, 0);
      Method1793(31235, "99", 16772659, false, true, 52, var0, 0);
      Method1769(31236, 23, "SkillTab/SKILL", "View @or1@Summoning @whi@guide", 31237, 1);
      Method1771(31237, "Exp: ");
      Method1793(31239, "99", 16772659, false, true, 52, var0, 0);
      Method1793(31240, "99", 16772659, false, true, 52, var0, 0);
      Method1835(31111, 3, 3, 100, var1);
      Method1835(31114, 31, 6, 101, var1);
      Method1835(31115, 43, 18, 102, var1);
      Method1835(31112, 3, 31, 103, var1);
      Method1835(31116, 3, 31, 96, var1);
      Method1835(31119, 31, 34, 97, var1);
      Method1835(31120, 43, 46, 98, var1);
      Method1835(31117, 3, 59, 99, var1);
      Method1835(31121, 3, 59, 92, var1);
      Method1835(31124, 31, 62, 93, var1);
      Method1835(31125, 43, 74, 94, var1);
      Method1835(31122, 3, 87, 95, var1);
      Method1835(31126, 3, 87, 88, var1);
      Method1835(31129, 31, 90, 89, var1);
      Method1835(31130, 43, 102, 90, var1);
      Method1835(31127, 3, 115, 91, var1);
      Method1835(31131, 3, 115, 84, var1);
      Method1835(31134, 31, 118, 85, var1);
      Method1835(31135, 43, 130, 86, var1);
      Method1835(31132, 3, 143, 87, var1);
      Method1835(31136, 3, 143, 80, var1);
      Method1835(31139, 31, 146, 81, var1);
      Method1835(31140, 43, 158, 82, var1);
      Method1835(31137, 3, 171, 83, var1);
      Method1835(31141, 3, 171, 76, var1);
      Method1835(31144, 31, 174, 77, var1);
      Method1835(31145, 43, 186, 78, var1);
      Method1835(31142, 3, 199, 79, var1);
      Method1835(31146, 3, 199, 72, var1);
      Method1835(31149, 31, 202, 73, var1);
      Method1835(31150, 43, 214, 74, var1);
      Method1835(31147, 3, 227, 75, var1);
      Method1835(31151, 3, 227, 68, var1);
      Method1835(31154, 31, 230, 69, var1);
      Method1835(31155, 43, 242, 70, var1);
      Method1835(31152, 3, 255, 71, var1);
      Method1835(31156, 64, 3, 64, var1);
      Method1835(31159, 92, 6, 65, var1);
      Method1835(31160, 104, 18, 66, var1);
      Method1835(31157, 64, 31, 67, var1);
      Method1835(31161, 64, 31, 60, var1);
      Method1835(31164, 92, 34, 61, var1);
      Method1835(31165, 104, 46, 62, var1);
      Method1835(31162, 64, 59, 63, var1);
      Method1835(31166, 64, 59, 56, var1);
      Method1835(31169, 92, 62, 57, var1);
      Method1835(31170, 104, 74, 58, var1);
      Method1835(31167, 64, 87, 59, var1);
      Method1835(31171, 64, 87, 52, var1);
      Method1835(31174, 92, 90, 53, var1);
      Method1835(31175, 104, 102, 54, var1);
      Method1835(31172, 64, 115, 55, var1);
      Method1835(31176, 64, 115, 48, var1);
      Method1835(31179, 92, 118, 49, var1);
      Method1835(31180, 104, 130, 50, var1);
      Method1835(31177, 64, 143, 51, var1);
      Method1835(31181, 64, 143, 44, var1);
      Method1835(31184, 92, 146, 45, var1);
      Method1835(31185, 104, 158, 46, var1);
      Method1835(31182, 64, 171, 47, var1);
      Method1835(31186, 64, 171, 40, var1);
      Method1835(31189, 92, 174, 41, var1);
      Method1835(31190, 104, 186, 42, var1);
      Method1835(31187, 64, 199, 43, var1);
      Method1835(31191, 64, 199, 36, var1);
      Method1835(31194, 92, 202, 37, var1);
      Method1835(31195, 104, 214, 38, var1);
      Method1835(31192, 64, 227, 39, var1);
      Method1835(31201, 125, 3, 32, var1);
      Method1835(31204, 153, 6, 33, var1);
      Method1835(31205, 165, 18, 34, var1);
      Method1835(31202, 125, 31, 35, var1);
      Method1835(31206, 125, 31, 28, var1);
      Method1835(31209, 153, 34, 29, var1);
      Method1835(31210, 165, 46, 30, var1);
      Method1835(31207, 125, 59, 31, var1);
      Method1835(31211, 125, 59, 24, var1);
      Method1835(31214, 153, 62, 25, var1);
      Method1835(31215, 165, 74, 26, var1);
      Method1835(31212, 125, 87, 27, var1);
      Method1835(31216, 125, 87, 20, var1);
      Method1835(31219, 153, 90, 21, var1);
      Method1835(31220, 165, 102, 22, var1);
      Method1835(31217, 125, 115, 23, var1);
      Method1835(31221, 125, 115, 16, var1);
      Method1835(31224, 153, 118, 17, var1);
      Method1835(31225, 165, 130, 18, var1);
      Method1835(31222, 125, 143, 19, var1);
      Method1835(31226, 125, 143, 12, var1);
      Method1835(31229, 153, 146, 13, var1);
      Method1835(31230, 165, 158, 14, var1);
      Method1835(31227, 125, 171, 15, var1);
      Method1835(31231, 125, 171, 8, var1);
      Method1835(31234, 153, 174, 9, var1);
      Method1835(31235, 165, 186, 10, var1);
      Method1835(31232, 125, 199, 11, var1);
      Method1835(31236, 125, 199, 4, var1);
      Method1835(31239, 153, 202, 5, var1);
      Method1835(31240, 165, 214, 6, var1);
      Method1835(31237, 125, 227, 7, var1);
      Method1835(31196, 64, 227, 0, var1);
      Method1835(31199, 105, 229, 1, var1);
      Method1835(31200, 116, 241, 2, var1);
      Method1835(31197, 64, 255, 3, var1);
   }

   public static void Method1834(boolean var0) {
      RSFont[] var1 = Field12787;
      char var2 = 'ꑂ';
      RSInterface var3 = Method1776(42050);
      Method1756(4, var3);
      int var13 = var2 + 1;
      ++var13;
      Method1801(42051, var0 ? 5 : 4, "Misc/BLANK");
      var3.Field12811 = var0 ? 527 : 334;
      ++var13;
      Method1793(42052, "Creation Menu", 16745503, true, true, -1, var1, 2);
      Method1757(42051, 0, 0, var3);
      Method1757(42052, 244, 5, var3);
      Method1757(5384, 464, 4, var3);
      Method1757(5380, 464, 4, var3);
      ++var13;
      RSInterface var4;
      (var4 = Method1776(42053)).Field12775 = 42054;
      Method1756(1, var4);
      var4.Field12811 = var0 ? 471 : 278;
      var4.Field12758 = 480;
      var4.Field12762 = 0;
      var4.Field12804 = 1200;
      var4.Field12775 = 42054;
      String[] var12 = new String[]{"Create", null, null, null, null};

      for(int var5 = 0; var5 < 10; ++var5) {
         for(int var6 = 0; var6 < 2; ++var6) {
            int var7 = var13++;
            int var8 = var13++;
            int var9 = var13++;
            String var10 = Field12749[var7] == null ? "Creation Title" : Field12749[var7].Field12792;
            Method1793(var7, var10, 16745503, false, true, -1, var1, 0);
            var10 = Field12749[var8] == null ? "desc" : Field12749[var8].Field12792;
            Method1793(var8, var10, 13421823, false, true, -1, var1, 0);
            int var14 = Field12749[var9] == null ? 4152 : Field12749[var9].Field12796[0];
            int var11 = Field12749[var9] == null ? 0 : Field12749[var9].Field12795[0];
            Method1804(var9, (String)null, var14, var11);
            Field12749[var9].Field12763 = var12;
            var14 = 34 + var6 * (var3.Field12758 - 56) / 2;
            var11 = 16 + var5 * 100;
            Method1757(var9, var14, var11, var4);
            Method1757(var7, var14 + 34, var11 - 4, var4);
            Method1757(var8, var14 + 36, var11 + 8, var4);
         }
      }

      Method1757(42053, -16, 21, var3);
   }

   private static void Method1835(int var0, int var1, int var2, int var3, RSInterface var4) {
      var4.Field12783[var3] = var0;
      var4.Field12784[var3] = var1;
      var4.Field12816[var3] = var2 + Field12743;
   }

   public static void Method1836() {
      Field12808.Method1512();
   }
}
