package net.LWJGLClient.client.a.c;

import net.LWJGLClient.client.a.e.JagexArchive;
import net.LWJGLClient.client.c.Packet;
import net.LWJGLClient.client.model.Client;

public final class Floor {
   public static Floor[] Field10698;
   public int Field10699 = -1;
   public int Field10700 = -1;
   public int Field10701 = -1;
   public int Field10702 = 0;
   public int Field10703;
   public int Field10704;
   public int Field10705;
   private int Field10706;
   private int Field10707;
   private int Field10708;
   private int Field10709;
   private int Field10710;
   private int Field10711;
   private int Field10712;
   public static Floor[] Field10713;
   public boolean Field10714 = true;
   private int Field10715;
   public int Field10716;

   private Floor() {
      this.Field10699 = 0;
   }

   public static void Method11898(JagexArchive var0) {
      int var1;
      Packet var31;
      Field10713 = new Floor[var1 = (var31 = new Packet(var0.readConfig("flo.dat"))).Method380()];

      int var2;
      for(var2 = 0; var2 != var1; ++var2) {
         Field10713[var2] = new Floor();
         Floor var10000 = Field10713[var2];
         Packet var4 = var31;
         Floor var3 = var10000;

         int var5;
         while((var5 = var4.g1()) != 0) {
            int var6;
            if (var5 == 1) {
               var3.Field10707 = var4.Method403();
               var6 = var3.Field10707;
               double var15 = (double)(var6 >> 16 & 255) / 256.0D;
               double var17 = (double)(var6 >> 8 & 255) / 256.0D;
               double var19 = (double)(var6 & 255) / 256.0D;
               double var21 = var15;
               if (var17 < var15) {
                  var21 = var17;
               }

               if (var19 < var21) {
                  var21 = var19;
               }

               double var23 = var15;
               if (var17 > var15) {
                  var23 = var17;
               }

               if (var19 > var23) {
                  var23 = var19;
               }

               double var25 = 0.0D;
               double var27 = 0.0D;
               double var29 = (var21 + var23) / 2.0D;
               if (var21 != var23) {
                  if (var29 < 0.5D) {
                     var27 = (var23 - var21) / (var23 + var21);
                  }

                  if (var29 >= 0.5D) {
                     var27 = (var23 - var21) / (2.0D - var23 - var21);
                  }

                  if (var15 == var23) {
                     var25 = (var17 - var19) / (var23 - var21);
                  } else if (var17 == var23) {
                     var25 = 2.0D + (var19 - var15) / (var23 - var21);
                  } else if (var19 == var23) {
                     var25 = 4.0D + (var15 - var17) / (var23 - var21);
                  }
               }

               var25 /= 6.0D;
               var3.Field10715 = (int)(var25 * 256.0D);
               var3.Field10703 = (int)(var27 * 256.0D);
               var3.Field10704 = (int)(var29 * 256.0D);
               if (var3.Field10703 < 0) {
                  var3.Field10703 = 0;
               } else if (var3.Field10703 > 255) {
                  var3.Field10703 = 255;
               }

               if (var3.Field10704 < 0) {
                  var3.Field10704 = 0;
               } else if (var3.Field10704 > 255) {
                  var3.Field10704 = 255;
               }

               if (var29 > 0.5D) {
                  var3.Field10705 = (int)((1.0D - var29) * var27 * 512.0D);
               } else {
                  var3.Field10705 = (int)(var29 * var27 * 512.0D);
               }

               if (var3.Field10705 <= 0) {
                  var3.Field10705 = 1;
               }

               var3.Field10716 = (int)(var25 * (double)var3.Field10705);
            } else if (var5 == 2) {
               var4.g1();
            } else if (var5 != 3) {
               if (var5 == 4) {
                  var3.Field10706 = var4.Method403();
                  var3.Method11902(var3.Field10706);
               } else if (var5 == 5) {
                  var3.Field10714 = false;
               } else if (var5 == 6) {
                  var4.Method406();
               } else if (var5 == 7) {
                  var5 = var3.Field10708;
                  var6 = var3.Field10709;
                  int var7 = var3.Field10710;
                  int var8 = var3.Field10711;
                  int var9 = var4.Method403();
                  var3.Method11902(var9);
                  var3.Field10708 = var5;
                  var3.Field10709 = var6;
                  var3.Field10710 = var7;
                  var3.Field10711 = var8;
                  var3.Field10712 = var8;
               } else {
                  System.out.println("Error unrecognised flo config code: " + var5);
               }
            }
         }
      }

      if (!Client.normalMem) {
         var2 = var31.Method380();
         if (Field10698 == null) {
            Field10698 = new Floor[var2];
         }

         for(var1 = 0; var1 < var2; ++var1) {
            if (Field10698[var1] == null) {
               Field10698[var1] = new Floor();
            }

            Field10698[var1].Method11900(var31);
         }
      }

   }

   public static void Method11899(JagexArchive var0) {
      Packet var3;
      int var1 = (var3 = new Packet(var0.readConfig("flo2.dat"))).Method380();
      if (Field10698 == null) {
         Field10698 = new Floor[var1];
      }

      for(int var2 = 0; var2 < var1; ++var2) {
         if (Field10698[var2] == null) {
            Field10698[var2] = new Floor();
         }

         Field10698[var2].Method11900(var3);
      }

   }

   private void Method11900(Packet var1) {
      int var2;
      while((var2 = var1.Method381()) != 0) {
         if (var2 == 1) {
            this.Field10702 = Method11901(var1.Method14455());
         } else if (var2 == 2) {
            this.Field10700 = var1.Method381();
            if (this.Field10700 == 65535) {
               this.Field10700 = -1;
            }
         } else if (var2 == 3) {
            this.Field10701 = var1.Method14446();
         } else if (var2 != 5) {
            if (var2 == 7) {
               this.Field10699 = Method11901(var1.Method14455());
            } else if (var2 != 8) {
               if (var2 == 9) {
                  var1.Method14446();
               } else if (var2 != 10) {
                  if (var2 == 11) {
                     var1.Method381();
                  } else if (var2 != 12) {
                     if (var2 == 13) {
                        var1.Method14455();
                     } else if (var2 == 14) {
                        var1.Method381();
                     } else if (var2 == 16) {
                        var1.Method381();
                     } else {
                        System.out.println("[FloorDef: Overlay] Unknown opcode: " + var2);
                     }
                  }
               }
            }
         }
      }

   }

   private static int Method11901(int var0) {
      if (var0 != 16711935) {
         double var2 = (double)(var0 >>> 16 & 255) / 256.0D;
         double var4 = (double)(var0 >>> 8 & 255) / 256.0D;
         double var6 = (double)(var0 & 255) / 256.0D;
         double var8 = var2;
         if (var2 > var4) {
            var8 = var4;
         }

         if (var8 > var6) {
            var8 = var6;
         }

         double var10 = var2;
         if (var4 > var2) {
            var10 = var4;
         }

         if (var6 > var10) {
            var10 = var6;
         }

         double var12 = 0.0D;
         double var14 = 0.0D;
         double var16 = (var8 + var10) / 2.0D;
         if (var10 != var8) {
            if (var16 < 0.5D) {
               var14 = (var10 - var8) / (var8 + var10);
            }

            if (var10 != var2) {
               if (var10 == var4) {
                  var12 = (var6 - var2) / (var10 - var8) + 2.0D;
               } else if (var10 == var6) {
                  var12 = (var2 - var4) / (var10 - var8) + 4.0D;
               }
            } else {
               var12 = (var4 - var6) / (var10 - var8);
            }

            if (var16 >= 0.5D) {
               var14 = (var10 - var8) / (2.0D - var8 - var10);
            }
         }

         var0 = (int)((var12 /= 6.0D) * 256.0D);
         int var1 = (int)(var14 * 256.0D);
         int var18 = (int)(var16 * 256.0D);
         if (var1 < 0) {
            var1 = 0;
         } else if (var1 > 255) {
            var1 = 255;
         }

         if (var18 < 0) {
            var18 = 0;
         } else if (var18 > 255) {
            var18 = 255;
         }

         if (var18 > 242) {
            var1 >>= 4;
         } else if (var18 > 217) {
            var1 >>= 3;
         } else if (var18 > 192) {
            var1 >>= 2;
         } else if (var18 > 179) {
            var1 >>= 1;
         }

         return (var18 >> 1) + (var1 >> 5 << 7) + ((var0 & 255) >> 2 << 10);
      } else {
         return -1;
      }
   }

   private void Method11902(int var1) {
      double var2 = (double)(var1 >> 16 & 255) / 256.0D;
      double var4 = (double)(var1 >> 8 & 255) / 256.0D;
      double var6 = (double)(var1 & 255) / 256.0D;
      double var8 = var2;
      if (var4 < var2) {
         var8 = var4;
      }

      if (var6 < var8) {
         var8 = var6;
      }

      double var10 = var2;
      if (var4 > var2) {
         var10 = var4;
      }

      if (var6 > var10) {
         var10 = var6;
      }

      double var12 = 0.0D;
      double var14 = 0.0D;
      double var16 = (var8 + var10) / 2.0D;
      if (var8 != var10) {
         if (var16 < 0.5D) {
            var14 = (var10 - var8) / (var10 + var8);
         }

         if (var16 >= 0.5D) {
            var14 = (var10 - var8) / (2.0D - var10 - var8);
         }

         if (var2 == var10) {
            var12 = (var4 - var6) / (var10 - var8);
         } else if (var4 == var10) {
            var12 = 2.0D + (var6 - var2) / (var10 - var8);
         } else if (var6 == var10) {
            var12 = 4.0D + (var2 - var4) / (var10 - var8);
         }
      }

      var12 /= 6.0D;
      this.Field10708 = (int)(var12 * 256.0D);
      this.Field10709 = (int)(var14 * 256.0D);
      this.Field10710 = (int)(var16 * 256.0D);
      if (this.Field10709 < 0) {
         this.Field10709 = 0;
      } else if (this.Field10709 > 255) {
         this.Field10709 = 255;
      }

      if (this.Field10710 < 0) {
         this.Field10710 = 0;
      } else if (this.Field10710 > 255) {
         this.Field10710 = 255;
      }

      if (var16 > 0.5D) {
         this.Field10712 = (int)((1.0D - var16) * var14 * 512.0D);
      } else {
         this.Field10712 = (int)(var16 * var14 * 512.0D);
      }

      if (this.Field10712 <= 0) {
         this.Field10712 = 1;
      }

      this.Field10711 = (int)(var12 * (double)this.Field10712);
   }
}
