package net.LWJGLClient.client.d.b;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import net.LWJGLClient.client.d.SceneGraph;
import net.LWJGLClient.client.d.b.a.Class328;
import net.LWJGLClient.client.d.b.a.Class330;
import net.LWJGLClient.client.model.Client;

public final class Class337 {
   private final List Field2205 = new ArrayList();
   private final List Field2206 = new ArrayList();
   private int Field2207;
   private int Field2208;
   private List Field2209 = new LinkedList();

   public final List Method3461() {
      return this.Field2205;
   }

   public final List Method3462() {
      return this.Field2206;
   }

   public final List Method3463(int var1, int var2) {
      if (var1 != this.Field2207 || var2 != this.Field2208) {
         this.Field2207 = var1;
         this.Field2208 = var2;
         this.Field2209.clear();
         int var3 = SceneGraph.mapSizeWidth / 2;
         Iterator var5 = this.Field2206.iterator();

         while(var5.hasNext()) {
            Class330 var4 = (Class330)var5.next();
            if (Client.Method13412(var1 + var3, var2 + var3, var4.Method3408(), var4.Method3409()) <= var3) {
               this.Field2209.add(var4);
            }
         }
      }

      return this.Field2209;
   }

   private void Method3464(String var1, int var2, int var3, int var4) {
      this.Field2205.add(new Class328(var1, var2, var3, var4));
   }

   public Class337() {
      this.Field2205.clear();
      this.Method3464("Lumbridge", 3239, 3233, 1);
      this.Method3464("Varrock", 3211, 3450, 1);
      this.Method3464("Kingdom Of/Misthalin", 3217, 3321, 2);
      this.Method3464("Al Kharid", 3297, 3150, 1);
      this.Method3464("Duel/Arena", 3361, 3233, 1);
      this.Method3464("Shantay/Pass", 3304, 3126, 0);
      this.Method3464("Toll/Gate", 3278, 3227, 0);
      this.Method3464("Tutorial Island", 3105, 3099, 1);
      this.Method3464("Port/Sarim", 3047, 3221, 1);
      this.Method3464("Falador", 2989, 3355, 1);
      this.Method3464("Edgeville", 3098, 3488, 1);
      this.Method3464("Brimhaven", 2779, 3174, 1);
      this.Method3464("Karamja", 2860, 3059, 2);
      this.Method3464("Crandor", 2839, 3271, 2);
      this.Method3464("Entrana", 2850, 3379, 2);
      this.Method3464("Draynor/Village", 3120, 3267, 1);
      this.Method3464("Jail", 3126, 3244, 0);
      this.Method3464("Market", 3090, 3252, 0);
      this.Method3464("Draynor Manor", 3108, 3345, 1);
      this.Method3464("Barbarian/Village", 3063, 3416, 1);
      this.Method3464("Desert Mining/Camp", 3291, 3022, 0);
      this.Method3464("Bedabin/Camp", 3170, 3038, 0);
      this.Method3464("Exam Centre", 3361, 3345, 0);
      this.Method3464("Dig Site", 3365, 3419, 0);
      this.Method3464("Lumber Yard", 3308, 3507, 0);
      this.Method3464("Palace", 3213, 3483, 0);
      this.Method3464("Cooks'/Guild", 3137, 3437, 0);
      this.Method3464("Monastery", 3052, 3477, 0);
      this.Method3464("Dwarven/Mine", 3016, 3441, 0);
      this.Method3464("Ice/Mountain", 3009, 3487, 1);
      this.Method3464("Black Knights'/Fortress", 3018, 3522, 0);
      this.Method3464("Goblin/Village", 2963, 3502, 0);
      this.Method3464("White Knights'/Castle", 2961, 3345, 0);
      this.Method3464("Park", 3005, 3379, 0);
      this.Method3464("Kingdom of/Asgarnia", 2988, 3412, 2);
      this.Method3464("Dark Wizards'/Tower", 2907, 3336, 0);
      this.Method3464("Slayer/Tower", 3429, 3555, 0);
      this.Method3464("Melzar's/Maze", 2931, 3248, 0);
      this.Method3464("Rimmington", 2960, 3222, 0);
      this.Method3464("Wizards' Tower", 3112, 3153, 0);
      this.Method3464("Lumbridge/Swamp", 3195, 3183, 0);
      this.Method3464("Fishing/Platform", 2775, 3287, 0);
      this.Method3464("Tai Bwo Wannai", 2794, 3066, 0);
      this.Method3464("Shilo Village", 2849, 2986, 1);
      this.Method3464("Ship Yard", 2990, 3055, 0);
      this.Method3464("Cairn Isle", 2764, 2979, 0);
      this.Method3464("Kharazi Jungle", 2844, 2923, 0);
      this.Method3464("Chaos/Temple", 3238, 3610, 0);
      this.Method3464("Graveyard of/Shadows", 3167, 3673, 0);
      this.Method3464("Bandit/Camp", 3036, 3689, 0);
      this.Method3464("Dark Knight/Fortress", 3030, 3633, 0);
      this.Method3464("Ruins", 2966, 3697, 0);
      this.Method3464("The Forgotten/Cemetery/Spectral Spawns", 2977, 3753, 0);
      this.Method3464("Ruins", 3164, 3735, 0);
      this.Method3464("Bone Yard", 3246, 3746, 0);
      this.Method3464("Red Dragon/Isle", 3199, 3824, 0);
      this.Method3464("Wilderness", 3144, 3773, 2);
      this.Method3464("Lava Maze", 3079, 3848, 0);
      this.Method3464("Frozen Waste/Plateau", 2972, 3919, 0);
      this.Method3464("Agility Training/Area", 3005, 3950, 0);
      this.Method3464("Pirates'/Hideout", 3043, 3948, 0);
      this.Method3464("Mage Arena", 3107, 3933, 0);
      this.Method3464("Deserted/Keep", 3156, 3937, 0);
      this.Method3464("Scorpion/Pit", 3236, 3945, 0);
      this.Method3464("Rogues' Castle", 3286, 3931, 0);
      this.Method3464("Demonic/Ruins", 3293, 3884, 0);
      this.Method3464("Chaos/Temple", 2934, 3526, 0);
      this.Method3464("Heroes'/Guild", 2894, 3501, 0);
      this.Method3464("Druids'/Circle", 2925, 3473, 0);
      this.Method3464("Taverley", 2900, 3458, 0);
      this.Method3464("White Wolf/Mountain", 2849, 3492, 1);
      this.Method3464("Catherby", 2821, 3432, 0);
      this.Method3464("Camelot/Castle", 2763, 3505, 0);
      this.Method3464("Seers'/Village", 2692, 3489, 1);
      this.Method3464("Sinclair Mansion", 2739, 3551, 0);
      this.Method3464("Flax", 2744, 3445, 0);
      this.Method3464("Beehives", 2767, 3443, 0);
      this.Method3464("Sorcerers' Tower", 2718, 3415, 0);
      this.Method3464("Keep/Le Faye", 2770, 3399, 0);
      this.Method3464("Legends'/Guild", 2737, 3374, 0);
      this.Method3464("Hemenster", 2655, 3438, 0);
      this.Method3464("McGrubor's/Wood", 2647, 3480, 0);
      this.Method3464("Coal/Trucks", 2600, 3491, 0);
      this.Method3464("Fishing/Guild", 2607, 3403, 0);
      this.Method3464("Kingdom of/Kandarin", 2578, 3443, 2);
      this.Method3464("East/Ardougne", 2597, 3298, 1);
      this.Method3464("West/Ardougne", 2524, 3308, 1);
      this.Method3464("Combat/Training/Camp", 2519, 3370, 0);
      this.Method3464("Agility/Training/Area", 2481, 3426, 0);
      this.Method3464("Tree Gnome/Stronghold", 2433, 3454, 1);
      this.Method3464("Grand Tree", 2469, 3504, 0);
      this.Method3464("Swamp", 2419, 3513, 0);
      this.Method3464("Gnome Ball/Field", 2401, 3487, 0);
      this.Method3464("Agility Training/Area", 2539, 3533, 0);
      this.Method3464("Barbarian Outpost", 2550, 3563, 0);
      this.Method3464("Underground/Pass", 2443, 3315, 0);
      this.Method3464("Battlefield", 2522, 3232, 0);
      this.Method3464("Baxtorian/Falls", 2515, 3462, 0);
      this.Method3464("Tree Gnome/Village", 2528, 3174, 0);
      this.Method3464("Fight/Arena", 2594, 3162, 0);
      this.Method3464("Port/Khazard", 2659, 3189, 1);
      this.Method3464("Yanille", 2549, 3091, 1);
      this.Method3464("Wizards'/Guild", 2589, 3077, 0);
      this.Method3464("Observatory", 2440, 3151, 0);
      this.Method3464("Necromancer", 2669, 3243, 0);
      this.Method3464("Gu'Tanoth", 2528, 3046, 0);
      this.Method3464("Feldip/Hills", 2566, 2985, 2);
      this.Method3464("Zoo", 2614, 3273, 0);
      this.Method3464("Morytania", 3469, 3443, 2);
      this.Method3464("Mort Myre/Swamp", 3439, 3383, 1);
      this.Method3464("Canifis", 3491, 3487, 1);
      this.Method3464("River/Salve", 3410, 3438, 0);
      this.Method3464("River Lum", 3167, 3350, 0);
      this.Method3464("Temple", 3421, 3489, 0);
      this.Method3464("Agility/Arena", 2910, 3145, 0);
      this.Method3464("Burthorpe", 2895, 3549, 1);
      this.Method3464("Death/Plateau", 2865, 3592, 0);
      this.Method3464("Tirannwn", 2241, 3265, 2);
      this.Method3464("Isafdar", 2243, 3186, 1);
      this.Method3464("Arandar", 2340, 3296, 1);
      this.Method3464("Prifddinas", 2237, 3309, 1);
      this.Method3464("Tyras/Camp", 2180, 3147, 0);
      this.Method3464("Elf/Camp", 2196, 3256, 0);
      this.Method3464("Trollheim", 2892, 3678, 0);
      this.Method3464("Troll/Stronghold", 2835, 3681, 0);
      this.Method3464("Mort'ton", 3491, 3281, 1);
      this.Method3464("The/Hollows", 3500, 3384, 0);
      this.Method3464("Poison Waste", 2241, 3098, 0);
      this.Method3464("Emps-Wars", 2432, 3111, 0);
      this.Method3464("Champions'/Guild", 3201, 3354, 0);
      this.Method3464("Rellekka", 2672, 3681, 1);
      this.Method3464("Golden/Apple Tree", 2765, 3608, 0);
      this.Method3464("Lighthouse", 2514, 3628, 0);
      this.Method3464("Fremennik/Province", 2679, 3632, 1);
      this.Method3464("Crafting/Guild", 2921, 3282, 0);
      this.Method3464("Haunted/Woods", 3567, 3488, 0);
      this.Method3464("Miscellania", 2545, 3879, 2);
      this.Method3464("Etceteria", 2609, 3874, 1);
      this.Method3464("Ape Atoll", 2755, 2755, 2);
      this.Method3464("Crash/Island", 2915, 2723, 0);
      this.Method3464("Marim", 2773, 2784, 0);
      this.Method3464("Fenkenstrain's/Castle", 3551, 3551, 0);
      this.Method3464("Mausoleum", 3502, 3572, 0);
      this.Method3464("Trollweiss/Mountain", 2781, 3864, 0);
      this.Method3464("Abandoned/Mine", 3444, 3243, 0);
      this.Method3464("Ruins of/Uzer", 3479, 3098, 0);
      this.Method3464("River/Elid", 3371, 3068, 0);
      this.Method3464("Kalphite/Lair", 3309, 3144, 0);
      this.Method3464("Pollnivneach", 3356, 2980, 1);
      this.Method3464("Bandit/Camp", 3175, 2977, 0);
      this.Method3464("Pyramid", 3235, 2897, 0);
      this.Method3464("Menaphos", 3234, 2783, 1);
      this.Method3464("Sophanem", 3298, 2783, 1);
      this.Method3464("Agility/Pyramid", 3363, 2842, 0);
      this.Method3464("Graveyard", 3565, 3406, 0);
      this.Method3464("Port/Phasmatys", 3673, 3487, 1);
      this.Method3464("Ectofuntus", 3659, 3520, 0);
      this.Method3464("Mountain/Camp", 2784, 3670, 0);
      this.Method3464("Kharidian/Desert", 3263, 2957, 2);
      this.Method3464("Ice path", 2857, 3809, 0);
      this.Method3464("Barrows", 3566, 3291, 0);
      this.Method3464("Jiggig", 2464, 3047, 0);
      this.Method3464("Mudskipper/Point", 2990, 3118, 0);
      this.Method3464("Nardah", 3429, 2902, 0);
      this.Method3464("Mage/Training/Arena", 3363, 3303, 1);
      this.Method3464("Keldagrim/Entrance", 2723, 3728, 0);
      this.Method3464("Waterbirth/Island", 2522, 3756, 0);
      this.Method3464("Lletya", 2346, 3180, 0);
      this.Method3464("Burgh de Rott", 3497, 3219, 1);
      this.Method3464("Lizards", 3423, 3040, 0);
      this.Method3464("Quarry", 3172, 2904, 0);
      this.Method3464("Outpost", 2435, 3355, 0);
      this.Method3464("Wedding", 2833, 3378, 0);
      this.Method3464("Grand Exchange", 3164, 3487, 1);
      this.Method3464("Neitiznot/Island", 2319, 3802, 0);
      this.Method3465();
   }

   private void Method3465() {
      this.Field2206.clear();
      this.Field2206.add((new Class330(3116, 3452, 12, "Edgeville dungeon entrance, hill giants downstairs")).Method3405(3115, 9852));
      this.Field2206.add(new Class330(3109, 3433, 26, "Anchovies, Shrimps, Sardines, Herrings, Trouts and Pikes"));
      this.Field2206.add(new Class330(3103, 3424, 26, "Anchovies, Shrimps, Sardines and Herrings"));
      this.Field2206.add(new Class330(3111, 3412, 26, "Salmons"));
      this.Field2206.add(new Class330(3151, 3363, 49));
      this.Field2206.add(new Class330(3082, 3394, 34, "Oak, Maple, Willow, Yew and Magic logs"));
      this.Field2206.add(new Class330(3123, 3429, 34, "Oak, Maple, Willow, Yew and Magic logs\""));
      this.Field2206.add((new Class330(3080, 3420, 12, "Barbarian dungeon")).Method3405(2884, 9796));
      this.Field2206.add(new Class330(3084, 3420, 8, "Mining spot: Tin, Copper, Coal, Mithril, Adamant and Runite ores"));
      this.Field2206.add((new Class330(3082, 3399, 12, "Rune essence mine")).Method3405(2892, 4826));
      this.Field2206.add(new Class330(3079, 3407, 64, "Tutorial Island portal"));
      this.Field2206.add(new Class330(3083, 3411, 10));
      this.Field2206.add(new Class330(3085, 3407, 9));
      this.Field2206.add(new Class330(3087, 3411, 1, "Weapons up to rune."));
      this.Field2206.add(new Class330(3076, 3412, 30, "Low level food and potion store"));
      this.Field2206.add(new Class330(3085, 3429, 5));
      this.Field2206.add(new Class330(3075, 3429, 14, "Armours up to rune."));
      this.Field2206.add(new Class330(3079, 3438, 6, "Barbarian Assistance"));
      this.Field2206.add(new Class330(3079, 3442, 51, "Very easy Slayer tasks"));
      this.Field2206.add(new Class330(3087, 3474, 34, "Yew trees"));
      this.Field2206.add(new Class330(3068, 3516, 66, "Meteora the lunar magician"));
      this.Field2206.add(new Class330(3097, 3509, 66, "Ancient magician Dark Mage"));
      this.Field2206.add(new Class330(3108, 3500, 51, "Vannaka's hard slayer tasks"));
      this.Field2206.add((new Class330(3096, 3468, 12, "Edgeville dungeon")).Method3405(3096, 9867));
      this.Field2206.add((new Class330(3018, 3450, 12, "Dwarven mine")).Method3405(3018, 9850));
      this.Field2206.add(new Class330(3050, 3498, 1, 19, "Altar"));
      this.Field2206.add(new Class330(3086, 3389, 53, "Farming patch"));
      this.Field2206.add(new Class330(3075, 3423, 39, "Well"));
      this.Field2206.add(new Class330(2955, 3202, 29, "Hickton's clothes shop"));
      this.Field2206.add(new Class330(2950, 3205, 29, "Grum's clothes shop"));
      this.Field2206.add(new Class330(2967, 3205, 5, "Bank"));
      this.Field2206.add(new Class330(2969, 3210, 48, "Range"));
      this.Field2206.add(new Class330(2955, 3212, 39, "Water well"));
      this.Field2206.add(new Class330(2948, 3215, 0, "General Store"));
      this.Field2206.add(new Class330(2941, 3220, 53, "Tree patch"));
      this.Field2206.add(new Class330(2918, 3242, 34, "Magic tree"));
      this.Field2206.add(new Class330(2938, 2331, 34, "Yew trees"));
      this.Field2206.add(new Class330(2934, 3218, 34, "Magic tree"));
      this.Field2206.add((new Class330(2977, 3240, 12, "Rimmington dungeon")).Method3405(2738, 9506));
      this.Field2206.add((new Class330(2919, 3208, 12, "Ancient cavern")).Method3405(1763, 5365));
      this.Field2206.add(new Class330(2937, 3287, 5, "Bank chest"));
      this.Field2206.add(new Class330(2933, 3280, 39, "Water"));
      this.Field2206.add(new Class330(2930, 2391, 9, "Furnace"));
      this.Field2206.add(new Class330(2941, 3282, 8, "Clay, silver and gold ores"));
      this.Field2206.add(new Class330(2989, 3207, 63, "Copper longtails and ferrets"));
      this.Field2206.add(new Class330(2969, 3188, 26, "Monkfishes"));
      this.Field2206.add(new Class330(2955, 3223, 67, "Estate Agent and house portal"));
      this.Field2206.add(new Class330(2934, 3284, 1, 33, "Ellis: Tan your hides here"));
      this.Field2206.add(new Class330(2983, 3240, 8, "Lots of low level ores and limestone"));
      this.Field2206.add(new Class330(1739, 5313, 51, "Shenven's very hard slayer tasks"));
      this.Field2206.add((new Class330(1734, 5312, 12, "Ancient cavern resource dungeon")).Method3405(1661, 5257));
      this.Field2206.add(new Class330(2982, 3116, 26, "Sea turtle and manta ray"));
      this.Field2206.add(new Class330(3005, 3120, 26, "Monkfish"));
      this.Field2206.add(new Class330(3003, 3129, 26, "Monkfish"));
      this.Field2206.add(new Class330(2999, 3134, 26, "Cods and sharks"));
      this.Field2206.add(new Class330(2997, 3137, 26, "Tuna and lobster"));
      this.Field2206.add(new Class330(3000, 3145, 5, "Banker"));
      this.Field2206.add(new Class330(2993, 3145, 26, "Tuna and lobster"));
      this.Field2206.add(new Class330(2996, 3154, 26, "Mackerel and shark"));
      this.Field2206.add(new Class330(2997, 3158, 26, "Pike"));
      this.Field2206.add((new Class330(3009, 3150, 12, "Asgarnian dungeon")).Method3405(3009, 9550));
      this.Field2206.add((new Class330(3035, 9539, 12, "Glacors cave")).Method3405(4196, 5755));
      this.Field2206.add(new Class330(2987, 3176, 26, "Shrimps and sardines"));
      this.Field2206.add(new Class330(3027, 3217, 56, "Ship to Karamja"));
      this.Field2206.add(new Class330(3015, 3225, 25, "Gerrant's fishing store"));
      this.Field2206.add(new Class330(3018, 3238, 48, "Range"));
      this.Field2206.add(new Class330(3013, 3246, 21, "Gem Merchant's jewellery shop"));
      this.Field2206.add(new Class330(3012, 3260, 2, "Aubury's Rune store"));
      this.Field2206.add((new Class330(3015, 3256, 56, "Rune essence mine")).Method3405(0, 0));
      this.Field2206.add(new Class330(3028, 3248, 3, "Bob axes"));
      this.Field2206.add(new Class330(3048, 3257, 31, "Beer"));
      this.Field2206.add(new Class330(3039, 3201, 56, "Ship to Pest Control"));
      this.Field2206.add(new Class330(3094, 3271, 39, "Waterpump"));
      this.Field2206.add(new Class330(3084, 3260, 66, "Dark Mage"));
      this.Field2206.add(new Class330(3094, 3243, 5, "Bank"));
      this.Field2206.add(new Class330(3070, 3244, 26, "Shrimps and sardines"));
      this.Field2206.add(new Class330(3086, 3230, 26, "Shrimps and sardines"));
      this.Field2206.add(new Class330(3090, 3235, 34, "Willow trees"));
      this.Field2206.add(new Class330(3167, 3472, 38, "Tyras Guard's minigame teleports"));
      this.Field2206.add(new Class330(3175, 3472, 66, "Taskmaster Matt's daily tasks"));
      this.Field2206.add(new Class330(3178, 3478, 5, "Banker"));
      this.Field2206.add(new Class330(3151, 3478, 5, "Banker"));
      this.Field2206.add(new Class330(3161, 3485, 5, "Banker"));
      this.Field2206.add(new Class330(3164, 3489, 39, "Water"));
      this.Field2206.add(new Class330(3168, 3485, 66, "Healer"));
      this.Field2206.add(new Class330(3160, 3472, 66, "Bolkoy's EP and EC shop"));
      this.Field2206.add(new Class330(3153, 3471, 66, "Bob Barter's potion decanter"));
      this.Field2206.add(new Class330(3186, 3439, 5, "Bank"));
      this.Field2206.add(new Class330(3187, 3425, 10, "Anvil"));
      this.Field2206.add(new Class330(3202, 3433, 0, "Zaff's staff shop"));
      this.Field2206.add(new Class330(3203, 3423, 18, "Hervi's and Nolar's heraldic armor shop"));
      this.Field2206.add(new Class330(3206, 3415, 29, "Thessalia's milestone cape shop"));
      this.Field2206.add(new Class330(3217, 3413, 0, "General store"));
      this.Field2206.add(new Class330(3206, 3399, 16, "Low level weapons; up to level 50"));
      this.Field2206.add(new Class330(3222, 3397, 31, "Blue Moon Inn"));
      this.Field2206.add(new Class330(3220, 3386, 48, "Range"));
      this.Field2206.add(new Class330(3236, 3383, 48, "Range"));
      this.Field2206.add(new Class330(3237, 3407, 48, "Range"));
      this.Field2206.add(new Class330(3248, 3405, 10, "Anvil"));
      this.Field2206.add(new Class330(3252, 3404, 2, "Aubury's rune shop"));
      this.Field2206.add((new Class330(3253, 3399, 56, "Rune essence mine")).Method3405(0, 0));
      this.Field2206.add(new Class330(3253, 3420, 5, "Bank"));
      this.Field2206.add(new Class330(3238, 3433, 39, "Water"));
      this.Field2206.add(new Class330(3232, 3424, 17, "Lowe's bow and arrow shop"));
      this.Field2206.add(new Class330(3229, 3436, 10, "Anvil"));
      this.Field2206.add(new Class330(3228, 3458, 53, "Tree patch"));
      this.Field2206.add(new Class330(3254, 3485, 19, "Altar for restoring prayer and sacred clay"));
      this.Field2206.add(new Class330(3280, 3494, 31, "Beer"));
      this.Field2206.add(new Class330(3208, 3501, 34, "Yew trees"));
      this.Field2206.add(new Class330(3190, 3358, 66, "Champions guild and banker upstairs"));
      this.Field2206.add(new Class330(3118, 3476, 63, "Hunting Expert hunter equipment store"));
      this.Field2206.add(new Class330(3144, 3514, 49, "Shortcut between Edgeville and Grand Exchange"));
      this.Field2206.add((new Class330(3232, 3345, 12, "Varrock Slayer Dungeon")).Method3405(3168, 9572));
      this.Field2206.add(new Class330(3179, 3369, 8, "Low level ores"));
      this.Field2206.add(new Class330(3285, 3366, 8, "Low level ores"));
      this.Field2206.add(new Class330(2925, 3145, 31, "Asgarnian ales"));
      this.Field2206.add(new Class330(2916, 3147, 5, "Banker"));
      this.Field2206.add(new Class330(2909, 3145, 49, "Pirate Jackie the Fruit and Brimhaven agility course"));
      this.Field2206.add(new Class330(2904, 3148, 0, "General Store"));
      this.Field2206.add(new Class330(2887, 3164, 63, "Crimson swifts and tropical wagtails"));
      this.Field2206.add(new Class330(2925, 3180, 26, "Tuna, lobster, sea turtle and manta ray fishing spots"));
      this.Field2206.add(new Class330(2832, 3172, 63, "Red salamanders"));
      this.Field2206.add((new Class330(2855, 3168, 12, "Karamja Volcano and Tzhaar Caves")).Method3405(2856, 9570));
      this.Field2206.add(new Class330(2855, 9574, 63, "Black salamanders"));
      this.Field2206.add((new Class330(2866, 9571, 12, "Tzhaar Caves")).Method3405(2480, 5175));
      this.Field2206.add(new Class330(2447, 5178, 5, "Banker"));
      this.Field2206.add(new Class330(2443, 5170, 66, "Healer"));
      this.Field2206.add(new Class330(2438, 5168, 38, "Fight Caves"));
      this.Field2206.add(new Class330(2400, 5177, 38, "Fight Pits"));
      this.Field2206.add(new Class330(2455, 5168, 8, "Gold and silver ores"));
      this.Field2206.add(new Class330(2459, 5124, 38, "Tokkul shop"));
      this.Field2206.add(new Class330(2479, 5145, 38, "Tokkul shop"));
      this.Field2206.add(new Class330(2465, 5148, 38, "Tokkul shop"));
      this.Field2206.add(new Class330(2510, 5172, 6, "Obsidian Terror quest"));
      this.Field2206.add(new Class330(2516, 5200, 5, "Banker"));
      this.Field2206.add(new Class330(2739, 3158, 63, "Black warlock and razor-backed kebbit hunter area"));
      this.Field2206.add(new Class330(2647, 2664, 0, "General store"));
      this.Field2206.add(new Class330(2651, 2659, 10, "Anvil"));
      this.Field2206.add(new Class330(2665, 2660, 17, "Bow and arrow shop"));
      this.Field2206.add(new Class330(2658, 2654, 2, "Rune shop"));
      this.Field2206.add(new Class330(2667, 2652, 5, "Bank"));
      this.Field2206.add(new Class330(2657, 2639, 38, "Pest Control minigame"));
      this.Field2206.add(new Class330(2660, 2650, 38, "Void Knight's pest control reward shop"));
      this.Field2206.add(new Class330(2444, 3083, 5, "Bank"));
      this.Field2206.add(new Class330(2442, 3087, 38, "Emps-Wars minigame"));
      this.Field2206.add(new Class330(2442, 3094, 38, "Lanthus' Emps-Wars minigame reward shop"));
      this.Field2206.add(new Class330(3027, 3631, 66, "Magic chest"));
      this.Field2206.add((new Class330(3071, 3649, 12, "Revenant dungeon")).Method3405(3077, 10058));
      this.Field2206.add((new Class330(3344, 3658, 12, "Corporeal beast dungeon")).Method3405(2885, 4372));
      this.Field2206.add((new Class330(3039, 3765, 12, "Revenant dungeon")).Method3405(3037, 10171));
      this.Field2206.add(new Class330(3153, 3923, 66, "Ardougne lever"));
      this.Field2206.add(new Class330(3138, 3924, 63, "Black salamander hunting grounds"));
      this.Field2206.add(new Class330(3090, 3956, 66, "Lever to Mage Bank"));
      this.Field2206.add(new Class330(2998, 3917, 49, "Wilderness agility course"));
      this.Field2206.add((new Class330(2908, 3935, 12, "Ice strykewyrm dungeon")).Method3405(3435, 5646));
      this.Field2206.add(new Class330(3059, 3884, 8, "Runite ores"));
      this.Field2206.add((new Class330(2916, 3746, 12, "Godwars dungeon")).Method3405(2881, 5310));
      this.Field2206.add((new Class330(2884, 5274, 12, "Ancient Prison - Nex")).Method3405(2856, 5222));
      this.Field2206.add((new Class330(3542, 3311, 12, "Har'Lakk dungeon")).Method3405(1714, 5603));
      this.Field2206.add(new Class330(3494, 3473, 31, "Pub"));
      this.Field2206.add(new Class330(3512, 3478, 5, "Banker"));
      this.Field2206.add(new Class330(3493, 3490, 66, "Portal to Barrows"));
      this.Field2206.add(new Class330(3565, 3311, 38, "Barrows"));
      this.Field2206.add(new Class330(3477, 3495, 0, "General Store"));
      this.Field2206.add(new Class330(3499, 3506, 29, "Barker's special clothes shop"));
      this.Field2206.add(new Class330(3428, 3534, 66, "Slayer Tower, lots of high level monsters here"));
      this.Field2206.add(new Class330(3288, 3190, 16, "Zeke's scimitar shop up to rune"));
      this.Field2206.add(new Class330(3302, 3189, 36, "Gertrude's pet store"));
      this.Field2206.add(new Class330(3314, 3183, 0, "General store"));
      this.Field2206.add(new Class330(3316, 3175, 14, "Magic, Ranged and Melee armour store up to level 40"));
      this.Field2206.add(new Class330(3273, 3191, 33, "Ellis: Tan your hides here"));
      this.Field2206.add(new Class330(3275, 3186, 9, "Furnace"));
      this.Field2206.add(new Class330(3272, 3180, 48, "Range"));
      this.Field2206.add(new Class330(3270, 3166, 5, "Bank"));
      this.Field2206.add(new Class330(3254, 3173, 66, "Ship to Rellekka and Neitiznot"));
      this.Field2206.add(new Class330(3304, 3118, 38, "Safe wilderness"));
      this.Field2206.add(new Class330(3307, 3120, 5, "Bank chest"));
      this.Field2206.add((new Class330(3309, 3144, 12, "Kalphite lair")).Method3405(3484, 9510));
      this.Field2206.add(new Class330(3307, 3197, 51, "Chaeldar's fairly easy slayer tasks"));
      this.Field2206.add(new Class330(3306, 3204, 50, "Weapon poison salesman"));
      this.Field2206.add(new Class330(3314, 3202, 53, "Tree patch"));
      this.Field2206.add(new Class330(3320, 3194, 42, "Dommiks crafting shop"));
      this.Field2206.add(new Class330(3292, 3204, 66, "Meteora the lunar magician"));
      this.Field2206.add(new Class330(3285, 3211, 22, "Gem store"));
      this.Field2206.add(new Class330(3367, 3266, 38, "Duel arena"));
      this.Field2206.add(new Class330(3377, 3271, 66, "Healer"));
      this.Field2206.add(new Class330(3382, 3269, 5, "Banker"));
      this.Field2206.add(new Class330(3312, 3106, 66, "Rug merchants magic carpets for fast travel in the Desert"));
      this.Field2206.add(new Class330(3182, 3042, 66, "Rug merchants magic carpets for fast travel in the Desert"));
      this.Field2206.add(new Class330(3185, 2983, 6, "Desert War quest"));
      this.Field2206.add(new Class330(3427, 2891, 5, "Bank"));
      this.Field2206.add(new Class330(3244, 2814, 66, "Rug merchants magic carpets for fast travel in the Desert"));
      this.Field2206.add((new Class330(3310, 2961, 12, "Smoke dungeon")).Method3405(3205, 9378));
      this.Field2206.add(new Class330(3347, 2941, 66, "Rug merchants magic carpets for fast travel in the Desert"));
      this.Field2206.add(new Class330(3351, 3001, 66, "Rug merchants magic carpets for fast travel in the Desert"));
      this.Field2206.add(new Class330(3271, 3144, 26, "Tuna, lobsters, cod, shark, sea turtle and manta ray fishing spots"));
      this.Field2206.add(new Class330(3300, 3309, 8, "Wide variety of ores up to adamantite"));
      this.Field2206.add(new Class330(3370, 3312, 34, "Magic tree"));
      this.Field2206.add(new Class330(3358, 3311, 34, "Magic tree"));
      this.Field2206.add(new Class330(2979, 3501, 63, "Grenwall hunter area"));
      this.Field2206.add(new Class330(2980, 3314, 66, "Meteora the lunar magician"));
      this.Field2206.add(new Class330(2945, 3335, 2, "Robe Store Owner's mystic robe store"));
      this.Field2206.add(new Class330(2945, 3369, 5, "Bank"));
      this.Field2206.add(new Class330(2956, 3372, 31, "Pub"));
      this.Field2206.add(new Class330(2958, 3387, 0, "General Store"));
      this.Field2206.add(new Class330(2974, 3383, 18, "Horvik's shield store up to adamant and anti-dragon"));
      this.Field2206.add(new Class330(2990, 3383, 66, "Healer"));
      this.Field2206.add(new Class330(3012, 3385, 66, "Brian O'Richard's perfect gold bar exchange"));
      this.Field2206.add(new Class330(3004, 3374, 53, "Tree patch"));
      this.Field2206.add(new Class330(3014, 3374, 66, "Ghost Captain"));
      this.Field2206.add(new Class330(3028, 3378, 66, "Tyras Guard's minigame teleports"));
      this.Field2206.add(new Class330(3046, 3376, 66, "Party Pete's drop party room"));
      this.Field2206.add((new Class330(3018, 3338, 12, "Access to the Mining Guild")).Method3405(3017, 9739));
      this.Field2206.add((new Class330(3061, 3377, 12, "Access to the Dwarven Mines")).Method3405(3058, 9777));
      this.Field2206.add(new Class330(2973, 3370, 44, "Flynn's pickaxe shop up to rune"));
      this.Field2206.add(new Class330(2975, 3369, 9, "Furnace"));
      this.Field2206.add(new Class330(2969, 3342, 66, "King Percival's skillcape and painting store"));
      this.Field2206.add(new Class330(2917, 3321, 54, "Make-over Mage"));
      this.Field2206.add(new Class330(3054, 3307, 53, "Farming patches"));
      this.Field2206.add(new Class330(2999, 3312, 34, "Yew trees"));
      this.Field2206.add(new Class330(3018, 3319, 34, "Yew tees"));
      this.Field2206.add(new Class330(2907, 3357, 8, "Low level ores"));
      this.Field2206.add(new Class330(3000, 3406, 63, "Chinchompa hunting grounds"));
      this.Field2206.add(new Class330(2931, 3536, 51, "Duradel's hard slayer tasks"));
      this.Field2206.add(new Class330(2929, 3546, 0, "General Store"));
      this.Field2206.add(new Class330(2877, 3542, 38, "Warrior's guild"));
      this.Field2206.add(new Class330(2868, 3543, 38, "Harrallak Menarous' rewards exchange"));
      this.Field2206.add(new Class330(2846, 3547, 28, "Lilly's low level potions"));
      this.Field2206.add(new Class330(2840, 3548, 30, "Lidio's food shop"));
      this.Field2206.add(new Class330(2843, 3539, 5, "Bank"));
      this.Field2206.add(new Class330(2910, 3539, 31, "Pub"));
      this.Field2206.add(new Class330(2858, 3534, 1, 3, "Anton's weapon store up to adamant"));
      this.Field2206.add(new Class330(2955, 3338, 3, 66, "Donator shop"));
      this.Field2206.add(new Class330(2949, 3383, 39, "Waterpump"));
      this.Field2206.add(new Class330(2725, 3493, 5, "Bank"));
      this.Field2206.add(new Class330(2713, 3494, 10, "Anvil"));
      this.Field2206.add(new Class330(2727, 3500, 34, "Msple trees"));
      this.Field2206.add(new Class330(2710, 3462, 34, "Yew trees"));
      this.Field2206.add(new Class330(2742, 3443, 66, "Flax fields"));
      this.Field2206.add(new Class330(2799, 3438, 24, "Candle-maker"));
      this.Field2206.add(new Class330(2809, 3441, 5, "Bank"));
      this.Field2206.add(new Class330(2817, 3443, 48, "Range"));
      this.Field2206.add(new Class330(2823, 3442, 17, "Lowe's bow and arrow shop"));
      this.Field2206.add(new Class330(2834, 3442, 25, "Harry's fishing equipment store"));
      this.Field2206.add(new Class330(2837, 3432, 26, "Sea turtle and manta rays"));
      this.Field2206.add(new Class330(2845, 3430, 26, "Monkfishes"));
      this.Field2206.add(new Class330(2853, 3424, 26, "Sharks"));
      this.Field2206.add(new Class330(2860, 3427, 26, "Sea turtle and manta rays"));
      this.Field2206.add(new Class330(2860, 3433, 53, "Tree patch"));
      this.Field2206.add(new Class330(2849, 3434, 34, "Teak trees"));
      this.Field2206.add((new Class330(2839, 3457, 12, "Entrance to Rimmington Dungeon")).Method3405(2713, 9564));
      this.Field2206.add(new Class330(2810, 3463, 53, "Farming patches"));
      this.Field2206.add(new Class330(2819, 3461, 37, "Farming equipment"));
      this.Field2206.add(new Class330(2747, 3457, 34, "Mahogany trees"));
      this.Field2206.add(new Class330(2702, 3398, 34, "Magic trees"));
      this.Field2206.add(new Class330(2787, 3459, 63, "Rabbit hunter area"));
      this.Field2206.add(new Class330(2762, 3430, 34, "Yew Trees"));
      this.Field2206.add((new Class330(2842, 3423, 12, "Entrance to Barbarian Village dungeon")).Method3405(2842, 9823));
      this.Field2206.add(new Class330(2655, 3310, 30, "Baker's stall"));
      this.Field2206.add(new Class330(2663, 3313, 41, "Silk stall"));
      this.Field2206.add(new Class330(2667, 3309, 30, "Baker's stall"));
      this.Field2206.add(new Class330(2666, 3303, 22, "Gem stall"));
      this.Field2206.add(new Class330(2664, 3296, 36, "Fur stall"));
      this.Field2206.add(new Class330(2659, 3296, 48, "Spice stall"));
      this.Field2206.add(new Class330(2654, 3284, 5, "Bank"));
      this.Field2206.add(new Class330(2661, 3272, 31, "Pub"));
      this.Field2206.add(new Class330(2683, 3275, 56, "Ship to Karamja"));
      this.Field2206.add(new Class330(2616, 3332, 5, "Bank"));
      this.Field2206.add(new Class330(2615, 3307, 19, "Altar"));
      this.Field2206.add((new Class330(2684, 3320, 56, "Teleport to rune essence mine")).Method3405(0, 0));
      this.Field2206.add(new Class330(2681, 3325, 2, "Aubury's rune shop"));
      this.Field2206.add(new Class330(2702, 3331, 8, "Iron and coal ores"));
      this.Field2206.add(new Class330(2561, 3311, 56, "Teleport very deep into the wilderness"));
      this.Field2206.add((new Class330(2795, 3615, 12, "Entrance to Rellekka slayer dungeon")).Method3405(2808, 10002));
      this.Field2206.add(new Class330(2646, 3660, 5, "Bank"));
      this.Field2206.add(new Class330(2659, 3669, 31, "Alcoholics here"));
      this.Field2206.add(new Class330(2646, 3675, 25, "Fish stalls"));
      this.Field2206.add(new Class330(2640, 3677, 36, "Fur stall"));
      this.Field2206.add(new Class330(2625, 3675, 29, "Yrsa's clothing shop"));
      this.Field2206.add(new Class330(2618, 3667, 9, "Furnace"));
      this.Field2206.add(new Class330(2619, 3663, 10, "Anvils"));
      this.Field2206.add(new Class330(2683, 3705, 8, "Low level ores and coal"));
      this.Field2206.add(new Class330(2668, 3701, 51, "Jossik's Rellekka slayer cave only tasks"));
      this.Field2206.add(new Class330(2664, 3692, 14, "Skulgrimen's fremennik armor and warhammer store"));
      this.Field2206.add(new Class330(2643, 3709, 56, "Ship to Neitiznot"));
      this.Field2206.add(new Class330(2630, 3692, 56, "Ship to Waterbirth island"));
      this.Field2206.add((new Class330(2524, 3739, 12, "Entrance to dagannoth cave")).Method3405(2442, 10146));
      this.Field2206.add(new Class330(2549, 3756, 56, "Ship to Rellekka"));
      this.Field2206.add(new Class330(2621, 3687, 30, "Fish Monger's low level food and potions"));
      this.Field2206.add(new Class330(2720, 3779, 63, "Snowy hunter area"));
      this.Field2206.add(new Class330(3211, 3215, 48, "Range"));
      this.Field2206.add((new Class330(3207, 3216, 12, "Entrance to Lumbridge castles cellar")).Method3405(3210, 9616));
      this.Field2206.add(new Class330(3218, 9623, 5, "Bank"));
      this.Field2206.add(new Class330(3208, 3220, 2, 5, "Bank"));
      this.Field2206.add(new Class330(3192, 3229, 53, "Tree patch"));
      this.Field2206.add(new Class330(3153, 3229, 34, "Yew tree"));
      this.Field2206.add(new Class330(3184, 3225, 34, "Yew tree"));
      this.Field2206.add(new Class330(3231, 3238, 5, "Banker"));
      this.Field2206.add(new Class330(3243, 3207, 19, "Altar"));
      this.Field2206.add(new Class330(3231, 3203, 3, "Bob's hatchets and equipment repair"));
      this.Field2206.add(new Class330(3231, 3207, 51, "Mazchna's medium level slayer tasks"));
      this.Field2206.add(new Class330(3231, 3197, 48, "Range"));
      this.Field2206.add(new Class330(3227, 3147, 8, "Low level ores"));
      this.Field2206.add(new Class330(3147, 3146, 8, "Coal, mithril and adamantite ores"));
      this.Field2206.add(new Class330(3182, 3156, 63, "Swamp lizard hunting grounds"));
      this.Field2206.add(new Class330(3240, 3241, 26, "Pike fishing spots"));
      this.Field2206.add(new Class330(3214, 3242, 0, "General store"));
      this.Field2206.add(new Class330(3210, 3253, 11, "DPS calculation dummies"));
      this.Field2206.add(new Class330(3227, 3255, 9, "Furnace"));
      this.Field2206.add(new Class330(3228, 3254, 10, "Anvil"));
      this.Field2206.add(new Class330(3165, 3272, 34, "Willows"));
      this.Field2206.add(new Class330(2852, 2955, 5, "Bank"));
      this.Field2206.add(new Class330(2857, 2966, 9, "Furnace"));
      this.Field2206.add(new Class330(2860, 2971, 26, "Monkfishes"));
      this.Field2206.add(new Class330(2859, 2977, 26, "Sea turtles and manta rays"));
      this.Field2206.add(new Class330(2310, 3780, 56, "Ship to Rellekka"));
      this.Field2206.add(new Class330(2337, 3808, 5, "Bank"));
      this.Field2206.add(new Class330(2354, 3798, 34, "Arctic pines"));
      this.Field2206.add(new Class330(2344, 3810, 9, "Furnace"));
      this.Field2206.add(new Class330(2342, 3810, 48, "Clay oven to cook your food"));
      this.Field2206.add(new Class330(2334, 3798, 33, "Thakkrad Sigmundons' curs your yak-hides"));
      this.Field2206.add(new Class330(2337, 3800, 0, "General Store"));
      this.Field2206.add(new Class330(2330, 3829, 34, "Arctic pines"));
      this.Field2206.add(new Class330(2374, 3850, 8, "Rune ores and gem rocks"));
      this.Field2206.add(new Class330(2613, 3093, 5, "Bank"));
      this.Field2206.add(new Class330(2613, 3080, 10, "Anvil"));
      this.Field2206.add(new Class330(3688, 3466, 5, "Bank"));
      this.Field2206.add(new Class330(3686, 3479, 9, "Furnace"));
      this.Field2206.add(new Class330(3689, 3518, 56, "Unfortunately he's unable to set sail anywhere"));
      this.Field2206.add(new Class330(3050, 3563, 56, "Teleport to Canifis and Waterbirth island"));
      this.Field2206.add(new Class330(2838, 3348, 66, "Hang out at ::wedding"));
      this.Field2206.add(new Class330(2833, 3352, 9, "Furnace"));
      this.Field2206.add(new Class330(3053, 3491, 50, "Brother Jered's holy elixirs"));
      this.Field2206.add(new Class330(2442, 3189, 66, "Shooting star specialists"));
      this.Field2206.add(new Class330(3103, 3568, 56, "Teleport to Abyss"));
      LinkedList var1 = new LinkedList();
      Iterator var3 = this.Field2206.iterator();

      while(var3.hasNext()) {
         Class330 var2;
         if ((var2 = (Class330)var3.next()).Method3413() > 0 && var2.Method3410() == 12) {
            Class330 var4;
            (var4 = (new Class330(var2.Method3413(), var2.Method3414(), 12, var2.Method3411().replaceAll("\n", "") + " exit")).Method3405(var2.Method3408(), var2.Method3409())).Method3407(var2);
            var2.Method3407(var4);
            var1.add(var4);
         }
      }

      this.Field2206.addAll(var1);
      var1.clear();
   }
}
