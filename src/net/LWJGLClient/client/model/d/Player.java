package net.LWJGLClient.client.model.d;

import net.LWJGLClient.client.a.a.Sequence;
import net.LWJGLClient.client.a.c.ItemDef;
import net.LWJGLClient.client.a.c.NPCDefinition;
import net.LWJGLClient.client.a.c.IdentityKit;
import net.LWJGLClient.client.b.Rasterizer;
import net.LWJGLClient.client.c.Packet;
import net.LWJGLClient.client.e.Class23;
import net.LWJGLClient.client.model.Client;
import net.LWJGLClient.client.model.Model;
import net.LWJGLClient.client.model.c.MemCache;

public final class Player extends Mobile {

   /*
       public static int aK = 1024;
    public static int aL = 0;
    public static boolean aM = false;
    public static MemCache aV = new MemCache(200);
    public int aN;
    public boolean aO = false;
    public NPCDef NPCDefP;
    public boolean aQ = false;
    public int[] aR = new int[5];
    public int aS;
    public int aT;
    public String aU;
    public int aW;
    public int aX;
    public int aY;
    public int aZ;
    public int ba;
    public int bb;
    public boolean bc = false;
    public int bd;
    public int be;
    public int bf;
    public Model bg;
    public int[] bh = new int[14];
    public int bi;
    public int bj;
    public int bk;
    public int bl;
    public int bm;
    private long bn = 0L;
    private long bo = 0L;
    private long bp;
    */
   public static int modelIndexMax = 1024;
   public static int Field4177 = 0;
   public long time = 0L;
   //unique
   public static boolean aBoolean = false;

   public int Field4180;
   public boolean Field4181 = false;

   private long aLong1718 = 0L; //aLong1697
   private long Field4183; //aLong1697

   public NPCDefinition desc;
   public boolean aBoolean1699 = false;
   public int[] appearanceColours = new int[5]; //aR
   public int team;
   public int playerGender;
   public String name;
   public static MemCache modelCache = new MemCache(200);
   public int combatLevel;
   public int Field4192;
   public int Field4193;
   public int Field4194;//x
   public int Field4195;//y
   public int drawHeight;
   public boolean visible = false; //Bc
   public int anInt1711;
   public int anInt1712;
   public int anInt1713;
   public Model aModel_1714;
   public int[] appearanceModels = new int[14]; //bH
   public int anInt1719;
   public int anInt1720;
   public int anInt1721;
   public int anInt1722;
   public int skill;
   // needs:

   public final Model getModel(int var1) {
      return this.getRotatedModel(var1, true, false);
   }

   public final Model getRotatedModel(int var1, boolean var2, boolean var3) {
      if (!this.visible) {
         return null;
      } else {
         Model var23;
         try {
            if (!var3 && this == Client.session_player) {
               var2 = false;
            }

            if (this.desc != null) {
               var2 = false;
            }

            Player var22 = this;
            Model var39;
            if (this.desc != null) {
               int var27 = -1;
               if (super.animation >= 0 && super.animationDelay == 0) {
                  var27 = Sequence.anims[super.animation].frame2IDS[super.Field1307];
               } else if (super.anInt >= 0) {
                  var27 = Sequence.anims[super.anInt].frame2IDS[super.anInt1527];
               }

               var39 = this.desc.Method11892(-1, var27, (int[])null, -1, -1, -1, var1, this.Field4180, var2 ? this : null);
            } else {
               label598: {
                  long var10 = this.aLong1718;
                  int var4 = -1;
                  int var5 = -1;
                  int var6 = 0;
                  int var7 = 0;
                  int var8 = -1;
                  int var9 = -1;
                  int var12 = -1;
                  if (super.animation >= Sequence.anims.length) {
                     super.animation = -1;
                  }

                  boolean var13 = false;
                  Sequence var14;
                  if (super.animation >= 0 && super.animationDelay == 0 && super.animation < Sequence.anims.length && (var14 = Sequence.anims[super.animation]) != null) {
                     var8 = var14.frame2IDS[super.Field1307];
                     if (super.Field1341 < var14.frame2IDS.length) {
                        var9 = var14.frame2IDS[super.Field1341];
                     }

                     var6 = var14.Field10144[super.Field1307];
                     var7 = super.Field1308;
                     if (super.anInt >= 0 && super.anInt != super.standAnimIndex) {
                        var12 = Sequence.anims[super.anInt].frame2IDS[super.anInt1527];
                     }

                     var13 = Sequence.Method8273(var8, var9, var12);
                     if (var14.anInt360 >= 0) {
                        var4 = var14.anInt360;
                        var10 += (long)(var4 - this.appearanceModels[5] << 44); //different shift so careful
                     }

                     if (var14.anInt361 >= 0) {
                        var5 = var14.anInt361;
                        var10 += (long)(var5 - this.appearanceModels[3] << 54);
                     }
                  }

                  if (!var13 && super.anInt >= 0 && super.anInt < Sequence.anims.length && (var14 = Sequence.anims[super.anInt]) != null) {
                     if (super.Field1339 < var14.frame2IDS.length) {
                        var8 = var14.frame2IDS[super.anInt1527];
                        var9 = var14.frame2IDS[super.Field1339];
                        var6 = var14.Field10144[super.anInt1527];
                        var7 = super.Field1296;
                     }

                     if (var14.anInt360 >= 0) {
                        var4 = var14.anInt360;
                        var10 += (long)(var4 - this.appearanceModels[5] << 44);
                     }

                     if (var14.anInt361 >= 0) {
                        var5 = var14.anInt361;
                        var10 += (long)(var5 - this.appearanceModels[3] << 54);
                     }
                  }

                  int var16;
                  int var18;
                  Model var28;
                  int var32;
                  if ((var28 = (Model) modelCache.Method1510(var10)) == null) {
                     var13 = false;

                     for(int var15 = 0; var15 < var22.appearanceModels.length; ++var15) {
                        var16 = var22.appearanceModels[var15];
                        if (var5 >= 0 && var15 == 3) {
                           var16 = var5;
                        }

                        if (var4 >= 0 && var15 == 5) {
                           var16 = var4;
                        }

                        if (var16 >= 256 && var16 < modelIndexMax && !IdentityKit.cache[var16 - 256].Method11930()) {
                           var13 = true;
                        }

                        if (var16 >= modelIndexMax) {
                           ItemDef var17;
                           if ((var17 = ItemDef.forID(var16 - modelIndexMax)) != null) {
                              var16 = var22.playerGender;
                              var32 = var17.Field10634;
                              var18 = var17.Field10651;
                              int var20 = var17.Field10650;
                              if (var16 == 1) {
                                 var32 = var17.Field10662;
                                 var18 = var17.Field10633;
                                 var20 = var17.Field10631;
                              }

                              boolean var10000;
                              if (var32 == -1) {
                                 var10000 = true;
                              } else {
                                 boolean var33 = true;
                                 if (!Model.Method14477(var32)) {
                                    var33 = false;
                                 }

                                 if (var18 != -1 && !Model.Method14477(var18)) {
                                    var33 = false;
                                 }

                                 if (var20 != -1 && !Model.Method14477(var20)) {
                                    var33 = false;
                                 }

                                 var10000 = var33;
                              }

                              if (var10000) {
                                 continue;
                              }
                           }

                           var13 = true;
                        }
                     }

                     if (var13) {
                        if (var28 == null) {
                           var28 = (Model) modelCache.Method1510(var22.Field4183);
                        }

                        if (var28 == null) {
                           var39 = null;
                           break label598;
                        }
                     }

                     if (var28 == null && System.currentTimeMillis() - var22.time <= 250L) {
                        var39 = null;
                        break label598;
                     }
                  }

                  if (var28 == null) {
                     if (Field4177++ > 2) {
                        var39 = null;
                        break label598;
                     }

                     var13 = true;
                     Model[] var29 = new Model[var22.appearanceModels.length];
                     var16 = 0;

                     for(var32 = 0; var32 < var22.appearanceModels.length; ++var32) {
                        if ((!Rasterizer.Field9949 || !var22.Field4181 || var32 != 0 && var32 != 11 && var32 != 8) && var32 != 13) {
                           int var31 = var22.appearanceModels[var32];
                           if (var5 >= 0 && var32 == 3) {
                              var31 = var5;
                           }

                           if (var4 >= 0 && var32 == 5) {
                              var31 = var4;
                           }

                           Model var35;
                           if (var31 >= 256 && var31 < modelIndexMax) {
                              if ((var35 = IdentityKit.cache[var31 - 256].isBodyDownloadedOverload()) == null) {
                                 var13 = false;
                              } else {
                                 var29[var16++] = var35;
                              }
                           } else if (var31 >= modelIndexMax) {
                              var18 = var31 - modelIndexMax;
                              ItemDef var19;
                              ItemDef var34;
                              if ((var19 = var34 = ItemDef.forID(var31 - modelIndexMax)).Field10634 == -1 || var19.Field10662 == -1) {
                                 continue;
                              }

                              if (var34 != null) {
                                 Model var36;
                                 if ((var36 = var34.Method11908(var22.playerGender)) == null) {
                                    var13 = false;
                                 } else {
                                    if (var22.playerGender == 1 && Client.normalMem) {
                                       if (var32 == 3) {
                                          if (var18 != 15426) {
                                             var36.Method14493(4, -9, 6);
                                             if (var18 == 14484 || var18 == 6908 || var18 == 19780) {
                                                var36.Method14493(-4, 12, -6);
                                             }
                                          }
                                       } else if (var32 == 5) {
                                          if (var18 == 11284) {
                                             var36.Method14493(-4, 3, 6);
                                          } else if (var18 == 22639) {
                                             var36.Method14493(-4, -10, 6);
                                          } else if (var18 >= 8714 && var18 <= 8776) {
                                             var36.Method14493(-4, 3, 6);
                                          } else {
                                             var36.Method14493(-4, -18, 6);
                                          }
                                       }
                                    } else if (Client.normalMem && var22.playerGender == 0) {
                                       if (var32 == 3) {
                                          var36.Method14493(0, 2, 0);
                                       } else if (var32 == 5) {
                                          if (var18 == 11284) {
                                             var36.Method14493(0, 22, 0);
                                          } else if (var18 >= 8714 && var18 <= 8776) {
                                             var36.Method14493(0, -8, 0);
                                          }
                                       }
                                    }

                                    if (var18 == 10251) {
                                       if (var22.playerGender == 1) {
                                          var36.Method14493(0, -4, -1);
                                       }
                                    } else if ((var18 < 10235 || var18 > 10241) && var18 != 7806 && var18 != 10200) {
                                       if (var18 != 4747 && (var18 < 4958 || var18 > 4962)) {
                                          if (var18 >= 22400 && var18 <= 22409) {
                                             if (var22.playerGender == 1) {
                                                var36.Method14493(0, 2, 2);
                                             }
                                          } else if (var18 == 7808) {
                                             var36.Method14491(64);
                                             var36.Method14493(-2, 8, 20);
                                          } else if ((var18 < 13879 || var18 > 13882) && (var18 < 13953 || var18 > 13956)) {
                                             if (var18 >= 3095 && var18 <= 3101) {
                                                if (var22.playerGender == 1) {
                                                   var36.Method14493(-4, 14, -6);
                                                } else {
                                                   var36.Method14493(0, 2, 0);
                                                }
                                             } else if (var18 != 6570 && var18 != 10566) {
                                                if (var18 == 4718 || var18 >= 4886 && var18 <= 4889) {
                                                   var36.Method14490(560);
                                                   var36.Method14488(584);
                                                   var36.Method14493(-1, -1, -14);
                                                   if (var22.playerGender == 1) {
                                                      var36.Method14490(448);
                                                      var36.Method14488(480);
                                                      var36.Method14493(-1, -3, 2);
                                                   }
                                                } else if (var18 == 22426) {
                                                   var36.Method14489(1024);
                                                   var36.Method14493(-120, -58, 0);
                                                   if (var22.playerGender == 1) {
                                                      var36.Method14488(576);
                                                      var36.Method14493(-7, -17, -16);
                                                   }
                                                } else if (var18 == 7807) {
                                                   var36.Method14490(544);
                                                   var36.Method14493(4, -8, 4);
                                                   if (var22.playerGender == 1) {
                                                      var36.Method14488(480);
                                                      var36.Method14490(448);
                                                      var36.Method14493(2, 2, 6);
                                                   }
                                                } else if (var18 == 22427) {
                                                   var36.Method14489(1024);
                                                   var36.Method14491(2016);
                                                   var36.Method14490(480);
                                                   var36.Method14493(-118, -58, 6);
                                                   if (var22.playerGender == 1) {
                                                      var36.Method14488(576);
                                                      var36.Method14490(448);
                                                      var36.Method14493(-12, -20, -16);
                                                   }
                                                }
                                             }
                                          } else {
                                             var36.Method14493(0, -10, 0);
                                          }
                                       } else if (var22.playerGender == 1) {
                                          var36.Method14493(-4, 12, -6);
                                       }
                                    } else {
                                       var36.Method14491(64);
                                       var36.Method14493(-2, -2, 20);
                                    }

                                    var29[var16++] = var36;
                                 }
                              }
                           }

                           if (var32 != 3 && var32 != 5 && var16 - 1 < var29.length && var16 > 0) {
                              var35 = var29[var16 - 1];

                              for(var31 = 0; var31 < 5; ++var31) {
                                 if (var22.appearanceColours[var31] != 0) {
                                    int var37 = var22.appearanceColours[var31];
                                    var35.recolor(Client.Field12468[var31][0], Client.Field12468[var31][var37]);
                                    if (var31 == 1 && var37 < Client.skinColours.length) {
                                       var35.recolor(Client.skinColours[0], Client.skinColours[var37]);
                                       var35.recolor(25485, Client.Field12468[var31][var37]);
                                    }

                                    if (var31 == 4) {
                                       var35.recolor(4540, Client.Field12468[var31][var37]);
                                    }
                                 }
                              }
                           }
                        }
                     }

                     (var28 = new Model(var16, var29)).Method14482();
                     if (Client.normalMem) {
                        var28.Method14502(84, 1000, -90, -580, -90, true);
                     } else {
                        var28.Method14502(64, 850, -90, -580, -90, true);
                     }

                     if (var13) {
                        var22.time = System.currentTimeMillis();
                        var28.Method14480(-2);
                        modelCache.Method1509(var10, var28);
                        var22.Field4183 = var10;
                     }
                  }

                  Model var30 = Model.Method14483(var28, var22.Field4180, var22.Field4180, var2 ? var22.time : -1L, 0);
                  if (var8 != -1 && var12 != -1 && var22.animation != -1) {
                     var30.Method14484(Sequence.anims[var22.animation].Field10146, var12, var8, var1);
                  } else if (var8 != -1 && var9 != -1 && var22.animation != 2304) {
                     var30.Method14521(var8, var9, var6, var7, var1);
                  } else if (var8 != -1) {
                     var30.Method14519(var8, var1);
                  }

                  var30.Method14500();
                  var30.Method14498(128.0F, 128.0F, 128.0F);
                  var30.Field2846 = var28.Field2846;
                  var30.Field10127 = var28.Field10127;
                  if (var30.Field2750 && (var22.Field4192 >= 0 && var22.Field4192 < 255 || var22.time > Client.currentTime)) {
                     var30.Method14480(-2);
                  }

                  var22.time = var30.Field2846;//q_23
                  var22.time = var30.Field10127;//Q_24
                  var39 = var30;
               }
            }

            var23 = var39;
         } catch (Exception var21) {
            var21.printStackTrace();
            return null;
         }

         if (var23 == null) {
            return null;
         } else {
            if (var23.Field2750) {
               super.height = var23.Field10127;
            }

            var23.Field2855 = true;
            if (this.aModel_1714 != null) {
               if (Client.currentTime >= this.Field4195) {
                  this.aModel_1714 = null;
               }

               if (Client.currentTime >= this.Field4194 && Client.currentTime < this.Field4195) {
                  Model var26 = this.aModel_1714;
                  this.aModel_1714.Method14493(this.anInt1711 - super.boundExtentX, this.anInt1712 - this.drawHeight, this.anInt1713 - super.boundExtentY);
                  if (super.Field1289 == 512) {
                     var26.Method14487();
                     var26.Method14487();
                     var26.Method14487();
                  } else if (super.Field1289 == 1024) {
                     var26.Method14487();
                     var26.Method14487();
                  } else if (super.Field1289 == 1536) {
                     var26.Method14487();
                  }

                  Model[] var24 = new Model[]{var23, var26};
                  var23 = new Model(var24);
                  if (super.Field1289 == 512) {
                     var26.Method14487();
                  } else if (super.Field1289 == 1024) {
                     var26.Method14487();
                     var26.Method14487();
                  } else if (super.Field1289 == 1536) {
                     var26.Method14487();
                     var26.Method14487();
                     var26.Method14487();
                  }

                  var26.Method14493(super.boundExtentX - this.anInt1711, this.drawHeight - this.anInt1712, super.boundExtentY - this.anInt1713);
               }
            }

            var23.Field2855 = true;
            return var23;
         }
      }
   }

   public final void Method9339(Packet var1) {
      var1.pos = 0;
      this.playerGender = var1.g1();
      this.Field4192 = var1.g1();
      this.Field4193 = var1.g1();
      this.desc = null;
      this.team = 0;

      int var2;
      int bodyColours;
      for(var2 = 0; var2 < 14; ++var2) {
         if ((bodyColours = var1.g1()) == 0) {
            this.appearanceModels[var2] = 0;
         } else {
            int var4 = var1.g1();
            this.appearanceModels[var2] = (bodyColours << 8) + var4;
            if (var2 >= 12 && this.appearanceModels[var2] == 256) {
               this.appearanceModels[var2] = 0;
            }

            if (var2 == 0 && this.appearanceModels[0] == 65535) {
               this.desc = NPCDefinition.Method11884(var1.g2());
               break;
            }

            ItemDef var6;
            if (this.appearanceModels[var2] >= modelIndexMax && this.appearanceModels[var2] - modelIndexMax < ItemDef.Field10665 && (var6 = ItemDef.forID(this.appearanceModels[var2] - modelIndexMax)) != null && var6.Field10664 != 0) {
               this.team = var6.Field10664;
            }
         }
      }

      for(var2 = 0; var2 < 5; ++var2) {
         if ((bodyColours = var1.g1()) < 0 || bodyColours >= Client.Field12468[var2].length) {
            bodyColours = 0;
         }

         this.appearanceColours[var2] = bodyColours;
      }

      super.standAnimIndex = var1.g2();
      if (super.standAnimIndex == 65535) {
         super.standAnimIndex = -1;
      }

      super.standTurnAnimIndex = var1.g2();
      if (super.standTurnAnimIndex == 65535) {
         super.standTurnAnimIndex = -1;
      }

      super.walkAnimIndex = var1.g2();
      if (super.walkAnimIndex == 65535) {
         super.walkAnimIndex = -1;
      }

      super.turn180AnimIndex = var1.g2();
      if (super.turn180AnimIndex == 65535) {
         super.turn180AnimIndex = -1;
      }

      super.turn90CWAnimIndex = var1.g2();
      if (super.turn90CWAnimIndex == 65535) {
         super.turn90CWAnimIndex = -1;
      }

      super.turn90CCWAnimIndex = var1.g2();
      if (super.turn90CCWAnimIndex == 65535) {
         super.turn90CCWAnimIndex = -1;
      }

      super.runAnimIndex = var1.g2();
      if (super.runAnimIndex == 65535) {
         super.runAnimIndex = -1;
      }
      /*
            super.standAnimIndex = var1.g2();
      if (super.standAnimIndex == 65535) {
         super.standAnimIndex = -1;
      }

      super.standTurnAnimIndex = var1.g2();
      if (super.standTurnAnimIndex == 65535) {
         super.standTurnAnimIndex = -1;
      }

      super.walkAnimIndex = var1.g2();
      if (super.walkAnimIndex == 65535) {
         super.walkAnimIndex = -1;
      }

      super.turn180AnimIndex = var1.g2();
      if (super.turn180AnimIndex == 65535) {
         super.turn180AnimIndex = -1;
      }

      super.turn90CWAnimIndex = var1.g2();
      if (super.turn90CWAnimIndex == 65535) {
         super.turn90CWAnimIndex = -1;
      }

      super.turn90CCWAnimIndex = var1.g2();
      if (super.turn90CCWAnimIndex == 65535) {
         super.turn90CCWAnimIndex = -1;
      }

      super.runAnimIndex = var1.g2();
      if (super.runAnimIndex == 65535) {
         super.runAnimIndex = -1;
      }
       */

      this.name = Class23.Method207(Class23.Method203(var1.Method405()));
      this.combatLevel = var1.g1();
      this.skill = var1.g2();
      this.visible = true;
      Sequence.Method8281(super.standAnimIndex);
      Sequence.Method8281(super.walkAnimIndex);
      Sequence.Method8281(super.runAnimIndex);
      Player var5 = this;
      this.aLong1718 = 0L;

      for(var2 = 0; var2 < var5.appearanceModels.length; ++var2) {
         if (var5.appearanceModels[var2] >= 256) {
            var5.aLong1718 <<= 4;
            var5.aLong1718 += (long)(var5.appearanceModels[var2] - 256);
         }
      }

      if (var5.appearanceModels[0] >= 256) {
         var5.aLong1718 += (long)(var5.appearanceModels[0] - 256 >> 4);
      }

      if (var5.appearanceModels[1] >= 256) {
         var5.aLong1718 += (long)(var5.appearanceModels[1] - 256 >> 8);
      }

      for(var2 = 0; var2 < 5; ++var2) {
         var5.aLong1718 <<= 3;
         var5.aLong1718 += (long)var5.appearanceColours[var2];
      }

      var5.aLong1718 <<= 1;
      var5.aLong1718 += (long)var5.playerGender;
   }

   public static void Method14457() {
      aBoolean = false;
      modelCache.Method1512();
   }

   public final boolean isVisible() {
      return this.visible;
   }

   public final Model getHeadModel(boolean isDownloaded) {
      if (!this.visible) {
         return null;
      } else if (this.desc != null) {
         return this.desc.Method11887();
      } else {
         isDownloaded = false;

         int modelPointer;
         int modelID;
         int var5;
         for(int var2 = 0; var2 < this.appearanceModels.length; ++var2) {
            if ((modelPointer = this.appearanceModels[var2]) >= 256 && modelPointer < modelIndexMax && !IdentityKit.cache[modelPointer - 256].Method11932()) {
               isDownloaded = true;
            }

            if (modelPointer >= modelIndexMax) {
               ItemDef var10000 = ItemDef.forID(modelPointer - modelIndexMax);
               modelID = this.playerGender;

               ItemDef itemDef = var10000;
               var5 = var10000.genderZeroOffset;
               int var6 = itemDef.genderZeroOffset2;

               if (modelID == 1) {
                  var5 = itemDef.genderOneOffset;
                  var6 = itemDef.genderOneOffset2;
               }

               boolean var13;
               if (var5 == -1) {
                  var13 = true;
               } else {
                  boolean var11 = true;
                  if (!Model.Method14477(var5)) {
                     var11 = false;
                  }

                  if (var6 != -1 && !Model.Method14477(var6)) {
                     var11 = false;
                  }

                  var13 = var11;
               }

               if (!var13) {
                  isDownloaded = true;
               }
            }
         }

         if (isDownloaded) {
            return null;
         } else {
            Model[] models = new Model[this.appearanceModels.length];
            modelPointer = 0;

            for(int var7 = 0; var7 < this.appearanceModels.length; ++var7) {
               Model var12;
               if ((modelID = this.appearanceModels[var7]) >= 256 && modelID < modelIndexMax) {
                  var12 = IdentityKit.cache[modelID - 256].isBodyDownloaded();
                  models[modelPointer++] = var12;
               }

               if (modelID >= modelIndexMax && (var12 = ItemDef.forID(modelID - modelIndexMax).isEquippedModelCached(this.playerGender)) != null) {
                  models[modelPointer++] = var12;
               }
            }

            Model model = new Model(modelPointer, models);

            for(modelID = 0; modelID < 5; ++modelID) {
               if (this.appearanceColours[modelID] != 0) {
                  var5 = this.appearanceColours[modelID];
                  if (modelID == 1) { //colourPointer
                     model.recolor(4540, Client.Field12468[modelID][var5]);
                  }

                  model.recolor(Client.Field12468[modelID][0], Client.Field12468[modelID][this.appearanceColours[modelID]]);
                  if (modelID == 1 && var5 < Client.skinColours.length) {
                     model.recolor(Client.skinColours[0], Client.skinColours[var5]);
                  }
               }
            }

            return model;
         }
      }
   }
}
