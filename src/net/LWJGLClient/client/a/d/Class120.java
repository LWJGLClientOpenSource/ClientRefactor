package net.LWJGLClient.client.a.d;

import net.LWJGLClient.client.a.e.JagexArchive;
import net.LWJGLClient.client.c.Packet;
import net.LWJGLClient.client.model.f.TextureData;

public final class Class120 {
   public boolean Field9529;
   private boolean Field9530;
   private boolean Field9531;
   private byte Field9532;
   private byte Field9533;
   private byte Field9534;
   private byte Field9535;
   private short Field9536;
   private byte Field9537;
   private byte Field9538;
   private boolean Field9539;
   private boolean Field9540;
   private byte Field9541;
   private boolean Field9542;
   private boolean Field9543;
   private boolean Field9544;
   private int Field9545;
   private int Field9546;
   public int Field9547;
   public static Class120[] Field9548;
   public static boolean[] Field9549;

   static {
      (Field9549 = new boolean[TextureData.Method13531()])[4] = true;
      Field9549[20] = true;
      Field9549[36] = true;
      Field9549[39] = true;
      Field9549[43] = true;
      Field9549[51] = true;
      Field9549[56] = true;
      Field9549[57] = true;
      Field9549[58] = true;
      Field9549[59] = true;
      Field9549[60] = true;
      Field9549[65] = true;
      Field9549[68] = true;
      Field9549[69] = true;
      Field9549[71] = true;
      Field9549[74] = true;
      Field9549[75] = true;
      Field9549[76] = true;
      Field9549[77] = true;
      Field9549[78] = true;
      Field9549[81] = true;
      Field9549[82] = true;
      Field9549[86] = true;
      Field9549[87] = true;
      Field9549[88] = true;
      Field9549[89] = true;
      Field9549[90] = true;
      Field9549[91] = true;
      Field9549[93] = true;
      Field9549[94] = true;
      Field9549[95] = true;
      Field9549[97] = true;
      Field9549[100] = true;
      Field9549[106] = true;
      Field9549[107] = true;
      Field9549[108] = true;
      Field9549[109] = true;
      Field9549[110] = true;
      Field9549[111] = true;
      Field9549[113] = true;
      Field9549[114] = true;
      Field9549[115] = true;
      Field9549[116] = true;
      Field9549[117] = true;
      Field9549[118] = true;
      Field9549[119] = true;
      Field9549[120] = true;
      Field9549[121] = true;
      Field9549[122] = true;
      Field9549[123] = true;
      Field9549[124] = true;
      Field9549[125] = true;
      Field9549[127] = true;
      Field9549[131] = true;
      Field9549[133] = true;
      Field9549[134] = true;
      Field9549[135] = true;
      Field9549[136] = true;
      Field9549[138] = true;
      Field9549[139] = true;
      Field9549[140] = true;
      Field9549[141] = true;
      Field9549[142] = true;
      Field9549[143] = true;
      Field9549[145] = true;
      Field9549[146] = true;
      Field9549[147] = true;
      Field9549[148] = true;
      Field9549[149] = true;
      Field9549[150] = true;
      Field9549[151] = true;
      Field9549[153] = true;
      Field9549[155] = true;
      Field9549[156] = true;
      Field9549[157] = true;
      Field9549[158] = true;
      Field9549[159] = true;
      Field9549[163] = true;
      Field9549[164] = true;
      Field9549[166] = true;
      Field9549[167] = true;
      Field9549[169] = true;
      Field9549[170] = true;
      Field9549[171] = true;
      Field9549[172] = true;
      Field9549[175] = true;
      Field9549[176] = true;
      Field9549[177] = true;
      Field9549[178] = true;
      Field9549[179] = true;
      Field9549[180] = true;
      Field9549[182] = true;
      Field9549[183] = true;
      Field9549[184] = true;
      Field9549[185] = true;
      Field9549[186] = true;
      Field9549[187] = true;
      Field9549[188] = true;
      Field9549[189] = true;
      Field9549[190] = true;
      Field9549[191] = true;
      Field9549[192] = true;
      Field9549[195] = true;
      Field9549[196] = true;
      Field9549[198] = true;
      Field9549[199] = true;
      Field9549[200] = true;
      Field9549[201] = true;
      Field9549[202] = true;
      Field9549[203] = true;
      Field9549[204] = true;
      Field9549[205] = true;
      Field9549[206] = true;
      Field9549[207] = true;
      Field9549[208] = true;
      Field9549[212] = true;
      Field9549[213] = true;
      Field9549[214] = true;
      Field9549[215] = true;
      Field9549[216] = true;
      Field9549[217] = true;
      Field9549[218] = true;
      Field9549[220] = true;
      Field9549[221] = true;
      Field9549[223] = true;
      Field9549[224] = true;
      Field9549[226] = true;
      Field9549[227] = true;
      Field9549[228] = true;
      Field9549[229] = true;
      Field9549[230] = true;
      Field9549[231] = true;
      Field9549[232] = true;
      Field9549[233] = true;
      Field9549[234] = true;
      Field9549[235] = true;
      Field9549[236] = true;
      Field9549[237] = true;
      Field9549[238] = true;
      Field9549[239] = true;
      Field9549[240] = true;
      Field9549[241] = true;
      Field9549[242] = true;
      Field9549[243] = true;
      Field9549[244] = true;
      Field9549[245] = true;
      Field9549[246] = true;
      Field9549[247] = true;
      Field9549[248] = true;
      Field9549[249] = true;
      Field9549[250] = true;
      Field9549[251] = true;
      Field9549[252] = true;
      Field9549[253] = true;
      Field9549[254] = true;
      Field9549[255] = true;
      Field9549[256] = true;
      Field9549[257] = true;
      Field9549[258] = true;
      Field9549[259] = true;
      Field9549[260] = true;
      Field9549[261] = true;
      Field9549[262] = true;
      Field9549[263] = true;
      Field9549[264] = true;
      Field9549[265] = true;
      Field9549[266] = true;
      Field9549[267] = true;
      Field9549[268] = true;
      Field9549[269] = true;
      Field9549[270] = true;
      Field9549[271] = true;
      Field9549[272] = true;
      Field9549[273] = true;
      Field9549[275] = true;
      Field9549[277] = true;
      Field9549[278] = true;
      Field9549[279] = true;
      Field9549[280] = true;
      Field9549[281] = true;
      Field9549[282] = true;
      Field9549[284] = true;
      Field9549[285] = true;
      Field9549[286] = true;
      Field9549[287] = true;
      Field9549[288] = true;
      Field9549[289] = true;
      Field9549[290] = true;
      Field9549[291] = true;
      Field9549[292] = true;
      Field9549[293] = true;
      Field9549[294] = true;
      Field9549[295] = true;
      Field9549[296] = true;
      Field9549[297] = true;
      Field9549[298] = true;
      Field9549[299] = true;
      Field9549[302] = true;
      Field9549[303] = true;
      Field9549[304] = true;
      Field9549[305] = true;
      Field9549[306] = true;
      Field9549[307] = true;
      Field9549[308] = true;
      Field9549[310] = true;
      Field9549[311] = true;
      Field9549[313] = true;
      Field9549[314] = true;
      Field9549[315] = true;
      Field9549[316] = true;
      Field9549[317] = true;
      Field9549[318] = true;
      Field9549[319] = true;
      Field9549[320] = true;
      Field9549[321] = true;
      Field9549[322] = true;
      Field9549[324] = true;
      Field9549[325] = true;
      Field9549[326] = true;
      Field9549[327] = true;
      Field9549[329] = true;
      Field9549[330] = true;
      Field9549[331] = true;
      Field9549[332] = true;
      Field9549[334] = true;
      Field9549[337] = true;
      Field9549[338] = true;
      Field9549[339] = true;
      Field9549[340] = true;
      Field9549[341] = true;
      Field9549[342] = true;
      Field9549[343] = true;
      Field9549[344] = true;
      Field9549[345] = true;
      Field9549[346] = true;
      Field9549[347] = true;
      Field9549[349] = true;
      Field9549[350] = true;
      Field9549[351] = true;
      Field9549[353] = true;
      Field9549[354] = true;
      Field9549[356] = true;
      Field9549[357] = true;
      Field9549[358] = true;
      Field9549[359] = true;
      Field9549[361] = true;
      Field9549[362] = true;
      Field9549[363] = true;
      Field9549[364] = true;
      Field9549[365] = true;
      Field9549[367] = true;
      Field9549[368] = true;
      Field9549[369] = true;
      Field9549[370] = true;
      Field9549[371] = true;
      Field9549[372] = true;
      Field9549[373] = true;
      Field9549[374] = true;
      Field9549[375] = true;
      Field9549[377] = true;
      Field9549[378] = true;
      Field9549[379] = true;
      Field9549[381] = true;
      Field9549[382] = true;
      Field9549[383] = true;
      Field9549[385] = true;
      Field9549[386] = true;
      Field9549[387] = true;
      Field9549[389] = true;
      Field9549[390] = true;
      Field9549[391] = true;
      Field9549[392] = true;
      Field9549[393] = true;
      Field9549[394] = true;
      Field9549[396] = true;
      Field9549[397] = true;
      Field9549[398] = true;
      Field9549[401] = true;
      Field9549[402] = true;
      Field9549[403] = true;
      Field9549[404] = true;
      Field9549[405] = true;
      Field9549[406] = true;
      Field9549[407] = true;
      Field9549[410] = true;
      Field9549[411] = true;
      Field9549[412] = true;
      Field9549[413] = true;
      Field9549[414] = true;
      Field9549[417] = true;
      Field9549[419] = true;
      Field9549[420] = true;
      Field9549[421] = true;
      Field9549[426] = true;
      Field9549[427] = true;
      Field9549[428] = true;
      Field9549[430] = true;
      Field9549[431] = true;
      Field9549[432] = true;
      Field9549[433] = true;
      Field9549[434] = true;
      Field9549[435] = true;
      Field9549[436] = true;
      Field9549[437] = true;
      Field9549[438] = true;
      Field9549[439] = true;
      Field9549[440] = true;
      Field9549[442] = true;
      Field9549[443] = true;
      Field9549[444] = true;
      Field9549[445] = true;
      Field9549[446] = true;
      Field9549[447] = true;
      Field9549[448] = true;
      Field9549[449] = true;
      Field9549[450] = true;
      Field9549[451] = true;
      Field9549[452] = true;
      Field9549[453] = true;
      Field9549[454] = true;
      Field9549[456] = true;
      Field9549[458] = true;
      Field9549[459] = true;
      Field9549[460] = true;
      Field9549[461] = true;
      Field9549[464] = true;
      Field9549[465] = true;
      Field9549[466] = true;
      Field9549[467] = true;
      Field9549[468] = true;
      Field9549[469] = true;
      Field9549[470] = true;
      Field9549[471] = true;
      Field9549[472] = true;
      Field9549[473] = true;
      Field9549[474] = true;
      Field9549[475] = true;
      Field9549[476] = true;
      Field9549[477] = true;
      Field9549[478] = true;
      Field9549[479] = true;
      Field9549[480] = true;
      Field9549[481] = true;
      Field9549[482] = true;
      Field9549[483] = true;
      Field9549[484] = true;
      Field9549[485] = true;
      Field9549[486] = true;
      Field9549[487] = true;
      Field9549[488] = true;
      Field9549[489] = true;
      Field9549[490] = true;
      Field9549[525] = true;
      Field9549[527] = true;
      Field9549[528] = true;
      Field9549[529] = true;
      Field9549[530] = true;
      Field9549[531] = true;
      Field9549[532] = true;
      Field9549[534] = true;
      Field9549[536] = true;
      Field9549[537] = true;
      Field9549[538] = true;
      Field9549[539] = true;
      Field9549[541] = true;
      Field9549[542] = true;
      Field9549[543] = true;
      Field9549[544] = true;
      Field9549[548] = true;
      Field9549[549] = true;
      Field9549[550] = true;
      Field9549[552] = true;
      Field9549[553] = true;
      Field9549[554] = true;
      Field9549[555] = true;
      Field9549[556] = true;
      Field9549[557] = true;
      Field9549[558] = true;
      Field9549[559] = true;
      Field9549[560] = true;
      Field9549[561] = true;
      Field9549[562] = true;
      Field9549[563] = true;
      Field9549[565] = true;
      Field9549[567] = true;
      Field9549[568] = true;
      Field9549[569] = true;
      Field9549[570] = true;
      Field9549[571] = true;
      Field9549[572] = true;
      Field9549[573] = true;
      Field9549[574] = true;
      Field9549[575] = true;
      Field9549[576] = true;
      Field9549[577] = true;
      Field9549[578] = true;
      Field9549[579] = true;
      Field9549[580] = true;
      Field9549[581] = true;
      Field9549[582] = true;
      Field9549[583] = true;
      Field9549[584] = true;
      Field9549[585] = true;
      Field9549[586] = true;
      Field9549[587] = true;
      Field9549[588] = true;
      Field9549[589] = true;
      Field9549[590] = true;
      Field9549[591] = true;
      Field9549[592] = true;
      Field9549[634] = true;
      Field9549[635] = true;
      Field9549[636] = true;
      Field9549[646] = true;
      Field9549[647] = true;
      Field9549[648] = true;
      Field9549[649] = true;
      Field9549[653] = true;
      Field9549[654] = true;
      Field9549[655] = true;
      Field9549[656] = true;
      Field9549[657] = true;
      Field9549[658] = true;
      Field9549[659] = true;
      Field9549[660] = true;
      Field9549[661] = true;
      Field9549[662] = true;
      Field9549[663] = true;
      Field9549[664] = true;
      Field9549[665] = true;
      Field9549[666] = true;
      Field9549[667] = true;
      Field9549[672] = true;
      Field9549[673] = true;
      Field9549[674] = true;
      Field9549[676] = true;
      Field9549[677] = true;
      Field9549[679] = true;
      Field9549[680] = true;
      Field9549[688] = true;
      Field9549[689] = true;
      Field9549[691] = true;
      Field9549[692] = true;
      Field9549[697] = true;
      Field9549[702] = true;
      Field9549[703] = true;
      Field9549[704] = true;
      Field9549[705] = true;
      Field9549[706] = true;
      Field9549[707] = true;
      Field9549[708] = true;
      Field9549[709] = true;
      Field9549[711] = true;
      Field9549[715] = true;
      Field9549[716] = true;
      Field9549[717] = true;
      Field9549[718] = true;
      Field9549[719] = true;
      Field9549[720] = true;
      Field9549[721] = true;
      Field9549[722] = true;
      Field9549[723] = true;
      Field9549[732] = true;
      Field9549[733] = true;
      Field9549[734] = true;
      Field9549[735] = true;
      Field9549[736] = true;
      Field9549[740] = true;
      Field9549[742] = true;
      Field9549[744] = true;
      Field9549[766] = true;
      Field9549[795] = true;
      Field9549[796] = true;
      Field9549[799] = true;
      Field9549[805] = true;
      Field9549[806] = true;
      Field9549[810] = true;
      Field9549[811] = true;
      Field9549[812] = true;
      Field9549[813] = true;
      Field9549[814] = true;
      Field9549[815] = true;
      Field9549[816] = true;
      Field9549[817] = true;
      Field9549[819] = true;
      Field9549[820] = true;
      Field9549[827] = true;
      Field9549[828] = true;
      Field9549[829] = true;
      Field9549[830] = true;
      Field9549[834] = true;
      Field9549[836] = true;
      Field9549[849] = true;
      Field9549[850] = true;
      Field9549[853] = true;
      Field9549[856] = true;
      Field9549[858] = true;
      Field9549[860] = true;
      Field9549[867] = true;
      Field9549[868] = true;
      Field9549[869] = true;
      Field9549[871] = true;
      Field9549[872] = true;
      Field9549[873] = true;
      Field9549[875] = true;
      Field9549[887] = true;
      Field9549[900] = true;
      Field9549[914] = true;
      Field9549[921] = true;
      Field9549[924] = true;
      Field9549[970] = true;
   }

   public final String toString() {
      return "TextureDef [transparentTexture=" + this.Field9529 + ", aBoolean1204=" + this.Field9530 + ", aBoolean1205=" + this.Field9531 + ", aByte1217=" + this.Field9532 + ", aByte1225=" + this.Field9533 + ", aByte1214=" + this.Field9534 + ", aByte1213=" + this.Field9535 + ", aShort1221=" + this.Field9536 + ", aByte1211=" + this.Field9537 + ", aByte1203=" + this.Field9538 + ", aBoolean1222=" + this.Field9539 + ", aBoolean1216=" + this.Field9540 + ", aByte1207=" + this.Field9541 + ", aBoolean1212=" + this.Field9542 + ", aBoolean1210=" + this.Field9543 + ", aBoolean1215=" + this.Field9544 + ", anInt1202=" + this.Field9545 + ", anInt1206=" + this.Field9546 + ", anInt1226=" + this.Field9547 + "]";
   }

   public static void Method1065(JagexArchive var0) {
      byte[] var3 = var0.readConfig("texture.dat");
      int var1;
      Packet var4;
      Field9548 = new Class120[var1 = (var4 = new Packet(var3)).Method380()];

      int var2;
      for(var2 = 0; var2 != var1; ++var2) {
         if (var4.Method381() == 1) {
            Field9548[var2] = new Class120();
         }
      }

      for(var2 = 0; var2 != var1; ++var2) {
         if (Field9548[var2] != null) {
            Field9548[var2].Field9529 = var4.Method381() == 1;
         }
      }

      for(var2 = 0; var2 != var1; ++var2) {
         if (Field9548[var2] != null) {
            Field9548[var2].Field9530 = var4.Method381() == 1;
         }
      }

      for(var2 = 0; var2 != var1; ++var2) {
         if (Field9548[var2] != null) {
            Field9548[var2].Field9531 = var4.Method381() == 1;
         }
      }

      for(var2 = 0; var2 != var1; ++var2) {
         if (Field9548[var2] != null) {
            Field9548[var2].Field9532 = var4.Method378();
         }
      }

      for(var2 = 0; var2 != var1; ++var2) {
         if (Field9548[var2] != null) {
            Field9548[var2].Field9533 = var4.Method378();
         }
      }

      for(var2 = 0; var2 != var1; ++var2) {
         if (Field9548[var2] != null) {
            Field9548[var2].Field9534 = var4.Method378();
         }
      }

      for(var2 = 0; var2 != var1; ++var2) {
         if (Field9548[var2] != null) {
            Field9548[var2].Field9535 = var4.Method378();
         }
      }

      for(var2 = 0; var2 != var1; ++var2) {
         if (Field9548[var2] != null) {
            Field9548[var2].Field9536 = (short)var4.Method380();
         }
      }

      for(var2 = 0; var2 != var1; ++var2) {
         if (Field9548[var2] != null) {
            Field9548[var2].Field9537 = var4.Method378();
         }
      }

      for(var2 = 0; var2 != var1; ++var2) {
         if (Field9548[var2] != null) {
            Field9548[var2].Field9538 = var4.Method378();
         }
      }

      for(var2 = 0; var2 != var1; ++var2) {
         if (Field9548[var2] != null) {
            Field9548[var2].Field9539 = var4.Method381() == 1;
         }
      }

      for(var2 = 0; var2 != var1; ++var2) {
         if (Field9548[var2] != null) {
            Field9548[var2].Field9540 = var4.Method381() == 1;
         }
      }

      for(var2 = 0; var2 != var1; ++var2) {
         if (Field9548[var2] != null) {
            Field9548[var2].Field9541 = var4.Method378();
         }
      }

      for(var2 = 0; var2 != var1; ++var2) {
         if (Field9548[var2] != null) {
            Field9548[var2].Field9542 = var4.Method381() == 1;
         }
      }

      for(var2 = 0; var2 != var1; ++var2) {
         if (Field9548[var2] != null) {
            Field9548[var2].Field9543 = var4.Method381() == 1;
         }
      }

      for(var2 = 0; var2 != var1; ++var2) {
         if (Field9548[var2] != null) {
            Field9548[var2].Field9544 = var4.Method381() == 1;
         }
      }

      for(var2 = 0; var2 != var1; ++var2) {
         if (Field9548[var2] != null) {
            Field9548[var2].Field9545 = var4.Method381();
         }
      }

      for(var2 = 0; var2 != var1; ++var2) {
         if (Field9548[var2] != null) {
            Field9548[var2].Field9546 = var4.Method377();
         }
      }

      for(var2 = 0; var2 != var1; ++var2) {
         if (Field9548[var2] != null) {
            Field9548[var2].Field9547 = var4.Method381();
         }
      }

   }
}
