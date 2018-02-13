package net.LWJGLClient.client.e;

import java.util.HashMap;
import java.util.Map;

import net.LWJGLClient.client.a.c.ItemDef;
import net.LWJGLClient.client.model.Client;

public final class Class24 {
   private Map Field8566 = null;
   private boolean Field8567 = false;

   public Class24() {
      this.Field8566 = new HashMap();
   }

   private void Method209(int var1, String var2) {
      if (!var2.endsWith(".") && !var2.endsWith("!") && !var2.endsWith("?") && !var2.endsWith("^")) {
         var2 = var2 + ".";
      }

      this.Field8566.put(var1, Client.Method13211(new String[]{var2}, 125, Client.plainFont));
   }

   private void Method210(int var1, int var2) {
      String var3;
      if ((var3 = (String)this.Field8566.get(var2)) == null) {
         System.err.println("[ItemDescriptionHandler]: error copying " + var1 + " from " + var2);
      } else {
         this.Field8566.put(var1, var3);
      }
   }

   public final String Method211(int var1) {
      return (String)this.Field8566.get(var1);
   }

   public final void Method212() {
      if (!this.Field8567) {
         this.Field8567 = true;
         String var1 = "Special attack deals additional damage";
         this.Method209(11730, "Special attack inflicts an additional fixed hit");
         this.Method209(4587, "Special attack disables your opponents' prayers");
         this.Method209(4081, "Additional 20% damage against undeads");
         this.Method209(4151, "Special attack deals 10% more damage and shortly binds your target");
         this.Method210(10180, 4151);

         int var2;
         for(var2 = 10180; var2 <= 10189; ++var2) {
            this.Method210(var2, 4151);
         }

         this.Method210(10233, 4151);
         this.Method209(11698, "Special attack heals and increases prayer points for the amount hit.");
         this.Method209(11700, "Special attack binds your enemy for 20 seconds.");
         this.Method209(11696, "Special attack decreases your opponent's defence by half the amount hit.");
         this.Method209(11694, var1);
         this.Method209(1215, "Special attack quickly strikes your enemy twice.");
         this.Method210(1231, 1215);
         this.Method210(5680, 1215);
         this.Method210(5698, 1215);
         this.Method209(1377, "Special attack boosts your strength level by 10%.");
         this.Method209(10200, "Special attack inflicts an additional hit");

         for(var2 = 10235; var2 <= 10241; ++var2) {
            this.Method210(var2, 10200);
         }

         this.Method209(4587, "Special attack disables all enemy prayers.");
         this.Method209(3204, "Special attack hits large targets especially hard.");
         this.Method209(1305, var1);
         this.Method209(19780, "Special attack deals additional magic damage");
         this.Method209(10887, var1);
         this.Method209(1434, var1);
         this.Method209(861, "Special attack quickly fires two arrows in a row at your enemy.");
         this.Method209(11235, "Special attack fires two arrows at once at your enemy.");

         for(var2 = 15701; var2 <= 15704; ++var2) {
            this.Method210(var2, 11235);
         }

         this.Method209(6724, "Special attack decreases your opponent's combat power.");
         this.Method209(4153, "Special attack allows another immediate hit on your opponent.");
         this.Method209(6739, "Special attack deals additional damage. When used on trees, two logs are immediately cut.");
         this.Method209(15259, "Special attack deals additional damage. When used on rocks, two ores are immediately mined.");
         this.Method209(20786, "Special attack deals additional damage. When used on rocks, two ores are immediately mined.");
         this.Method209(805, var1);
         this.Method209(13879, "Special attack deals additional damage and applies a damage over time effect for 6 seconds.");

         for(var2 = 13880; var2 <= 13882; ++var2) {
            this.Method210(var2, 13879);
         }

         this.Method209(13883, var1);
         this.Method209(13902, "Special attack deals additional damage and decreases your opponent's defence by 10%.");
         this.Method210(13904, 13902);
         this.Method209(13899, var1);
         this.Method210(13901, 13899);
         this.Method209(13905, "Special deals additional damage in one strong and two weak hits.");
         this.Method210(13907, 13905);
         this.Method209(7158, var1);
         this.Method209(3101, var1);
         this.Method209(14484, "Special attack deals additional damage in four hits.");
         this.Method209(4708, "Set effect: Increases spell effects by 25%.");
         this.Method210(4710, 4708);
         this.Method210(4712, 4708);
         this.Method210(4714, 4708);

         for(var2 = 4856; var2 <= 4879; ++var2) {
            this.Method210(var2, 4708);
         }

         this.Method209(4716, "Set effect: Increases max hits the lower your hitpoints become.");
         this.Method210(4718, 4716);
         this.Method210(4720, 4716);
         this.Method210(4722, 4716);

         for(var2 = 4880; var2 <= 4903; ++var2) {
            this.Method210(var2, 4716);
         }

         this.Method209(4724, "Set effect: Provides 20% lifesteal bonus.");
         this.Method210(4726, 4724);
         this.Method210(4728, 4724);
         this.Method210(4730, 4724);

         for(var2 = 4904; var2 <= 4927; ++var2) {
            this.Method210(var2, 4724);
         }

         this.Method209(4732, "Set effect: Provides a 40% chance to let your next auto attack be 0.5 seconds faster.");
         this.Method210(4734, 4732);
         this.Method210(4736, 4732);
         this.Method210(4738, 4732);
         this.Method210(4740, 4732);

         for(var2 = 4928; var2 <= 4951; ++var2) {
            this.Method210(var2, 4732);
         }

         this.Method209(4745, "Set effect: Provides 10 damage soaking bonus.");
         this.Method210(4747, 4745);
         this.Method210(4749, 4745);
         this.Method210(4751, 4745);

         for(var2 = 4952; var2 <= 4975; ++var2) {
            this.Method210(var2, 4745);
         }

         this.Method209(4753, "Set effect: Provides a 40% chance to ignore 75% of your opponent's defence and protection prayers.");
         this.Method210(4755, 4753);
         this.Method210(4757, 4753);
         this.Method210(4759, 4753);

         for(var2 = 4976; var2 <= 4999; ++var2) {
            this.Method210(var2, 4753);
         }

         this.Method209(7639, "Autocasts storm of armadyl.");

         for(var2 = 7640; var2 <= 7649; ++var2) {
            this.Method210(var2, 7639);
         }

         this.Method209(13867, "Autocasts zuriel barrage.");
         this.Method210(13869, 13867);
         this.Method209(10034, "Hits multiple targets at once.");
         this.Method209(20767, "All levels on 99. Well done! ^_^");
         this.Method210(20768, 20767);

         for(var2 = 23033; var2 <= 23040; ++var2) {
            this.Method210(var2, 20767);
         }

         String var4 = "Set effect: Provides 25% (elite 40%) more accuracy and 10% more damage.";
         this.Method209(8842, var4);
         this.Method210(8839, 8842);
         this.Method210(8840, 8842);
         this.Method210(11663, 8842);
         this.Method210(11664, 8842);
         this.Method210(11665, 8842);
         this.Method210(19786, 8842);
         this.Method210(19788, 8842);
         this.Method210(19790, 8842);
         this.Method210(19785, 8842);
         this.Method210(19787, 8842);
         this.Method210(19789, 8842);
         this.Method209(11128, "Provides 10% more damage when using obsidian weapons.");
         this.Method209(13736, "Operate option negates all damage for the next 2.5 seconds.");
         this.Method209(13738, "Operate option negates all damage for the next 2.5 seconds.");
         this.Method209(13740, "Operate option negates all damage for the next 2.5 seconds.");
         this.Method209(13742, "Operate option negates all damage for the next 2.5 seconds.");
         this.Method209(13744, "Operate option negates all damage for the next 2.5 seconds. Passively increases maximum hitpoints by 11%.");
         this.Method209(19669, "Special attacks require 10% less energy.");
         var1 = "Can be charged with dragonfire. Clicking operate when equipped unleashes the fire.";
         this.Method209(11283, var1);
         this.Method209(11284, var1);
         this.Method209(11285, var1);
         this.Method209(15486, "Special attack reduces damage taken by 20% for the duration of 1 minute.");
         var1 = "Doesn't require arrows and degrades with every shot.";

         for(var2 = 4212; var2 <= 4223; ++var2) {
            this.Method209(var2, var1);
         }

         this.Method209(13263, "Gives 10% bonus damage and accuracy when fighting slayer tasks. Also increases slayer experience gains by 10%.");
         this.Method209(15492, "Gives 15% bonus damage and accuracy when fighting slayer tasks. Also increases slayer experience gains by 15%.");
         this.Method209(23029, "Gives 15% bonus damage and accuracy when fighting slayer tasks. Also increases slayer experience gains by 15%.");
         this.Method209(23030, "Gives 15% bonus damage and accuracy when fighting slayer tasks. Also increases slayer experience gains by 15%.");
         this.Method209(23031, "Gives 15% bonus damage and accuracy when fighting slayer tasks. Also increases slayer experience gains by 15%.");
         this.Method209(23032, "Gives 15% bonus damage and accuracy when fighting slayer tasks. Also increases slayer experience gains by 15%.");
         this.Method209(8921, "Gives 15% bonus damage and accuracy when fighting slayer tasks with melee.");
         this.Method209(15490, "Gives 15% bonus damage and accuracy when fighting slayer tasks with range.");
         this.Method209(15488, "Gives 15% bonus damage and accuracy when fighting slayer tasks with magic.");

         int var3;
         for(var3 = 9747; var3 <= 9812; ++var3) {
            var4 = ItemDef.forID(var3).Field10639.replace("(t)", "").replace("cape", "").replace("hood", "").replaceAll("  ", " ").trim();
            this.Method209(var3, "Requires level 99 " + Client.Method13233(var4) + " to be worn.");
         }

         for(var3 = 22435; var3 <= 22456; ++var3) {
            var4 = ItemDef.forID(var3).Field10639.replace("master", "").replace("cape", "").replace("hood", "").replaceAll("  ", " ").trim();
            this.Method209(var3, "Requires 200M " + Client.Method13233(var4) + " exp. to be worn.");
         }

         this.Method209(22400, "Requires level 99 Magic and Runecrafting to be worn.");
         this.Method209(22401, "Requires level 99 Crafting and Fletching to be worn.");
         this.Method209(22402, "Requires level 99 Herblore and Farming to be worn.");
         this.Method209(22403, "Requires level 99 Woodcutting and Firemaking to be worn.");
         this.Method209(22404, "Requires level 99 Slayer, Hunter and Range to be worn.");
         this.Method209(22405, "Requires level 99 Mining and Smithing to be worn.");
         this.Method209(22406, "Requires level 99 Attack, Strength and Hitpoints to be worn.");
         this.Method209(22407, "Requires level 99 Fishing and Cooking to be worn.");
         this.Method209(22408, "Requires level 99 Defence and Prayer to be worn.");
         this.Method209(22409, "Requires level 99 Agility and Thieving to be worn.");
         this.Method209(9240, "Drains prayer points from human opponents.");
         this.Method209(9241, "Has the chance to poison.");
         this.Method209(9242, "Does additional 5% of the target's current health (max +30).");
         this.Method209(9243, "Lowers the enemy's defence level.");
         this.Method209(9244, "Inflicts additional dragon breath damage (max +25)");
         this.Method209(9245, "Inflicts additional damage and heals you for 25% of the hit.");
         this.Method209(22633, "Increases the duration of freezing abilities by 5 seconds.");
         this.Method209(22635, "Decreases the duration of freezes cast on you by 5 seconds.");
         this.Method209(22298, "Heals for 5% of your damage dealt.");
         this.Method209(22299, "Increases Defence by 10%.");
         this.Method209(20967, "Increases Ranged accuracy and strength by 5%.");
         this.Method209(20962, "Increases Magic accuracy and strength by 5%.");
         this.Method209(20961, "Increases Melee accuracy and strength by 5%.");
         this.Method209(20958, "Turns poison damage into healing.");
         this.Method209(14796, "Grants double experience rates for 60 minutes.");
         this.Method209(22664, "Grants double experience rates for 60 minutes.");
         this.Method209(11814, "Contains: Bronze full helm, Bronze platebody, Bronze platelegs and Bronze kiteshield");
         this.Method209(11816, "Contains: Bronze full helm, Bronze platebody, Bronze plateskirt and Bronze kiteshield");
         this.Method209(11818, "Contains: Iron full helm, Iron platebody, Iron platelegs and Iron kiteshield");
         this.Method209(11820, "Contains: Iron full helm, Iron platebody, Iron plateskirt and Iron kiteshield");
         this.Method209(11822, "Contains: Steel full helm, Steel platebody, Steel platelegs and Steel kiteshield");
         this.Method209(11824, "Contains: Steel full helm, Steel platebody, Steel plateskirt and Steel kiteshield");
         this.Method209(11826, "Contains: Black full helm, Black platebody, Black platelegs and Black kiteshield");
         this.Method209(11828, "Contains: Black full helm, Black platebody, Black plateskirt and Black kiteshield");
         this.Method209(11830, "Contains: Mithril full helm, Mithril platebody, Mithril platelegs and Mithril kiteshield");
         this.Method209(11832, "Contains: Mithril full helm, Mithril platebody, Mithril plateskirt and Mithril kiteshield");
         this.Method209(11834, "Contains: Adamant full helm, Adamant platebody, Adamant platelegs and Adamant kiteshield");
         this.Method209(11836, "Contains: Adamant full helm, Adamant platebody, Adamant plateskirt and Adamant kiteshield");
         this.Method209(11838, "Contains: Rune full helm, Rune platebody, Rune platelegs and Rune kiteshield");
         this.Method209(11840, "Contains: Rune full helm, Rune platebody, Rune plateskirt and Rune kiteshield");
         this.Method209(19520, "Contains: Black helm (h1), Black platebody (h1), Black platelegs (h1) and Black shield (h1)");
         this.Method209(11842, "Contains: Dragon med helm, Dragon chainbody, Dragon platelegs and Dragon sq shield");
         this.Method209(19522, "Contains: Black helm (h2), Black platebody (h2), Black platelegs (h2) and Black shield (h2)");
         this.Method209(11844, "Contains: Dragon med helm, Dragon chainbody, Dragon plateskirt and Dragon sq shield");
         this.Method209(19524, "Contains: Black helm (h3), Black platebody (h3), Black platelegs (h3) and Black shield (h3)");
         this.Method209(11846, "Contains: Ahrims hood, Ahrims robetop, Ahrims robeskirt and Ahrims staff");
         this.Method209(19526, "Contains: Black helm (h4), Black platebody (h4), Black platelegs (h4) and Black shield (h4)");
         this.Method209(11848, "Contains: Dharoks helm, Dharoks platebody, Dharoks platelegs and Dharoks greataxe");
         this.Method209(19528, "Contains: Black helm (h5), Black platebody (h5), Black platelegs (h5) and Black shield (h5)");
         this.Method209(11850, "Contains: Guthans helm, Guthans platebody, Guthans chainskirt and Guthans warspear");
         this.Method209(19530, "Contains: Black helm (h1), Black platebody (h1), Black plateskirt (h1) and Black shield (h1)");
         this.Method209(11852, "Contains: Karils coif, Karils leathertop, Karils leatherskirt and Karils crossbow");
         this.Method209(19532, "Contains: Black helm (h2), Black platebody (h2), Black plateskirt (h2) and Black shield (h2)");
         this.Method209(11854, "Contains: Torags helm, Torags platebody, Torags platelegs and Torags hammers");
         this.Method209(19534, "Contains: Black helm (h3), Black platebody (h3), Black plateskirt (h3) and Black shield (h3)");
         this.Method209(11856, "Contains: Veracs helm, Veracs brassard, Veracs plateskirt and Veracs flail");
         this.Method209(19536, "Contains: Black helm (h4), Black platebody (h4), Black plateskirt (h4) and Black shield (h4)");
         this.Method209(11858, "Contains: Third-age full helm, Third-age platebody, Third-age platelegs and Third-age kiteshield");
         this.Method209(19538, "Contains: Black helm (h5), Black platebody (h5), Black plateskirt (h5) and Black shield (h5)");
         this.Method209(11860, "Contains: Third-age range coif, Third-age range top, Third-age range legs and Third-age vambraces");
         this.Method209(19540, "Contains: Adamant helm (h1), Adamant platebody (h1), Adamant platelegs (h1) and Adamant shield (h1)");
         this.Method209(11862, "Contains: Third-age mage hat, Third-age robe top, Third-age robe and Third-age amulet");
         this.Method209(19542, "Contains: Adamant helm (h2), Adamant platebody (h2), Adamant platelegs (h2) and Adamant shield (h2)");
         this.Method209(19544, "Contains: Adamant helm (h3), Adamant platebody (h3), Adamant platelegs (h3) and Adamant shield (h3)");
         this.Method209(19546, "Contains: Adamant helm (h4), Adamant platebody (h4), Adamant platelegs (h4) and Adamant shield (h4)");
         this.Method209(19548, "Contains: Adamant helm (h5), Adamant platebody (h5), Adamant platelegs (h5) and Adamant shield (h5)");
         this.Method209(19550, "Contains: Adamant helm (h1), Adamant platebody (h1), Adamant plateskirt (h1) and Adamant shield (h1)");
         this.Method209(19552, "Contains: Adamant helm (h2), Adamant platebody (h2), Adamant plateskirt (h2) and Adamant shield (h2)");
         this.Method209(19554, "Contains: Adamant helm (h3), Adamant platebody (h3), Adamant plateskirt (h3) and Adamant shield (h3)");
         this.Method209(19556, "Contains: Adamant helm (h4), Adamant platebody (h4), Adamant plateskirt (h4) and Adamant shield (h4)");
         this.Method209(11878, "Contains: Black full helm (t), Black platebody (t), Black platelegs (t) and Black kiteshield (t)");
         this.Method209(19558, "Contains: Adamant helm (h5), Adamant platebody (h5), Adamant plateskirt (h5) and Adamant shield (h5)");
         this.Method209(11880, "Contains: Black full helm (t), Black platebody (t), Black plateskirt (t) and Black kiteshield (t)");
         this.Method209(19560, "Contains: Rune helm (h1), Rune platebody (h1), Rune platelegs (h1) and Rune shield (h1)");
         this.Method209(11882, "Contains: Black full helm (g), Black platebody (g), Black platelegs (g) and Black kiteshield (g)");
         this.Method209(19562, "Contains: Rune helm (h2), Rune platebody (h2), Rune platelegs (h2) and Rune shield (h2)");
         this.Method209(11884, "Contains: Black full helm (g), Black platebody (g), Black plateskirt (g) and Black kiteshield (g)");
         this.Method209(19564, "Contains: Rune helm (h3), Rune platebody (h3), Rune platelegs (h3) and Rune shield (h3)");
         this.Method209(11886, "Contains: Adam full helm (t), Adam platebody (t), Adam platelegs (t) and Adam kiteshield (t)");
         this.Method209(19566, "Contains: Rune helm (h4), Rune platebody (h4), Rune platelegs (h4) and Rune shield (h4)");
         this.Method209(11888, "Contains: Adam full helm (t), Adam platebody (t), Adam plateskirt (t) and Adam kiteshield (t)");
         this.Method209(19568, "Contains: Rune helm (h5), Rune platebody (h5), Rune platelegs (h5) and Rune shield (h5)");
         this.Method209(11890, "Contains: Adam full helm (g), Adam platebody (g), Adam platelegs (g) and Adam kiteshield (g)");
         this.Method209(19570, "Contains: Rune helm (h1), Rune platebody (h1), Rune plateskirt (h1) and Rune shield (h1)");
         this.Method209(22644, "Contains: Bandos helm, Bandos chestplate, Bandos tassets, Bandos boots and Bandos gloves");
         this.Method209(11892, "Contains: Adam full helm (g), Adam platebody (g), Adam plateskirt (g) and Adam kiteshield (g)");
         this.Method209(19572, "Contains: Rune helm (h2), Rune platebody (h2), Rune plateskirt (h2) and Rune shield (h2)");
         this.Method209(22646, "Contains: Armadyl helm, Armadyl chestplate, Armadyl plateskirt, Armadyl boots and Armadyl gloves");
         this.Method209(11894, "Contains: Rune full helm (t), Rune platebody (t), Rune platelegs (t) and Rune kiteshield (t)");
         this.Method209(19574, "Contains: Rune helm (h3), Rune platebody (h3), Rune plateskirt (h3) and Rune shield (h3)");
         this.Method209(22648, "Contains: Battle robe hood, Battle robe top, Battle robe bottom, Battle robe boots and Battle robe gloves");
         this.Method209(11896, "Contains: Rune full helm (t), Rune platebody (t), Rune plateskirt (t) and Rune kiteshield (t)");
         this.Method209(19576, "Contains: Rune helm (h4), Rune platebody (h4), Rune plateskirt (h4) and Rune shield (h4)");
         this.Method209(22650, "Contains: Guthix mitre, Guthix robe top, Guthix robe legs, Guthix cloak, Guthix stole and Guthix crozier");
         this.Method209(11898, "Contains: Rune full helm (g), Rune platebody (g), Rune platelegs (g) and Rune kiteshield (g)");
         this.Method209(19578, "Contains: Rune helm (h5), Rune platebody (h5), Rune plateskirt (h5) and Rune shield (h5)");
         this.Method209(22652, "Contains: Saradomin mitre, Saradomin robe top, Saradomin robe legs, Saradomin cloak, Saradomin stole and Saradomin crozier");
         this.Method209(11900, "Contains: Rune full helm (g), Rune platebody (g), Rune plateskirt (g) and Rune kiteshield (g)");
         this.Method209(22654, "Contains: Zamorak mitre, Zamorak robe top, Zamorak robe legs, Zamorak cloak, Zamorak stole and Zamorak crozier");
         this.Method209(19582, "Contains: Bandos coif, Bandos body, Bandos chaps and Bandos vambraces");
         this.Method209(11902, "Contains: Enchanted hat, Enchanted top and Enchanted robe");
         this.Method209(22656, "Contains: Bandos mitre, Bandos robe top, Bandos robe legs, Bandos cloak, Bandos stole and Bandos crozier");
         this.Method209(19584, "Contains: Ancient coif, Ancient body, Ancient chaps and Ancient vambraces");
         this.Method209(11904, "Contains: Wizard hat (t), Wizard robe (t) and Blue skirt (t)");
         this.Method209(22658, "Contains: Ancient mitre, Ancient robe top, Ancient robe legs, Ancient cloak, Ancient stole and Ancient crozier");
         this.Method209(19586, "Contains: Armadyl coif, Armadyl body, Armadyl chaps and Armadyl vambraces");
         this.Method209(11906, "Contains: Wizard hat (g), Wizard robe (g) and Blue skirt (g)");
         this.Method209(22660, "Contains: Armadyl mitre, Armadyl robe top, Armadyl robe legs, Armadyl cloak, Armadyl stole and Armadyl crozier");
         this.Method209(19588, "Contains: Armadyl full helm, Armadyl platebody, Armadyl platelegs and Armadyl kiteshield");
         this.Method209(19590, "Contains: Armadyl full helm, Armadyl platebody, Armadyl plateskirt and Armadyl kiteshield");
         this.Method209(22662, "Contains: Initiate sallet, Initiate hauberk and Initiate cuisse");
         this.Method209(19592, "Contains: Bandos full helm, Bandos platebody, Bandos platelegs and Bandos kiteshield");
         this.Method209(19594, "Contains: Bandos full helm, Bandos platebody, Bandos plateskirt and Bandos kiteshield");
         this.Method209(19596, "Contains: Ancient full helm, Ancient platebody, Ancient platelegs and Ancient kiteshield");
         this.Method209(19598, "Contains: Ancient full helm, Ancient platebody, Ancient plateskirt and Ancient kiteshield");
         this.Method209(11920, "Contains: Guthix coif, Guthix body, Guthix chaps and Guthix bracers");
         this.Method209(11922, "Contains: Saradomin coif, Saradomin body, Saradomin chaps and Saradomin bracers");
         this.Method209(11924, "Contains: Zamorak coif, Zamorak body, Zamorak chaps and Zamorak bracers");
         this.Method209(11926, "Contains: Guthix full helm, Guthix platebody, Guthix platelegs and Guthix kiteshield");
         this.Method209(11928, "Contains: Saradomin full helm, Saradomin platebody, Saradomin platelegs and Saradomin kiteshield");
         this.Method209(11930, "Contains: Zamorak full helm, Zamorak platebody, Zamorak platelegs and Zamorak kiteshield");
         this.Method209(11932, "Contains: Guthix full helm, Guthix platebody, Guthix plateskirt and Guthix kiteshield");
         this.Method209(11934, "Contains: Saradomin full helm, Saradomin platebody, Saradomin skirt and Saradomin kiteshield");
         this.Method209(11936, "Contains: Zamorak full helm, Zamorak platebody, Zamorak plateskirt and Zamorak kiteshield");
         this.Method209(11938, "Contains: Gilded full helm, Gilded platebody, Gilded platelegs and Gilded kiteshield");
         this.Method209(11940, "Contains: Gilded full helm, Gilded platebody, Gilded plateskirt and Gilded kiteshield");
         this.Method209(11942, "Contains: Rock-shell helm, Rock-shell plate, Rock-shell legs and Rock-shell boots");
         this.Method209(11944, "Contains: Spined helm, Spined body, Spined chaps and Spined boots");
         this.Method209(11946, "Contains: Skeletal helm, Skeletal top, Skeletal bottoms and Skeletal boots");

         for(var3 = 18349; var3 <= 18358; ++var3) {
            this.Method209(var3, "Increases damage and accuracy on Slayer tasks by 10%.");
         }

         for(var3 = 18359; var3 <= 18360; ++var3) {
            this.Method209(var3, "Blocks 10% of the damage from Slayer task monsters.");
         }

         for(var3 = 20787; var3 <= 20792; ++var3) {
            this.Method209(var3, "Additional 1% Mining and Smithing experience.");
         }

         this.Method209(22283, "Has a 10% chance to mine double ores.");
         this.Method209(20966, "Has a 10% chance to catch double fishes.");
         this.Method209(22301, "Has a 10% chance to craft double runes.");
         this.Method209(22279, "Has a 10% chance to chop double logs.");

         for(var2 = 22793; var2 <= 22810; ++var2) {
            this.Method209(var2, "Gives an abyssal whip, bow or staff a new color.");
         }

      }
   }
}
