package net.LWJGLClient.client.a.a;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import net.LWJGLClient.client.a.Class128;
import net.LWJGLClient.client.c.Packet;
import net.LWJGLClient.client.model.Client;

public final class Class518 {
   private static Map Field10081 = new HashMap();
   private static Map Field10082 = new HashMap();
   private static long Field10083 = System.currentTimeMillis();
   private long Field10084 = System.currentTimeMillis();
   public int Field10085;
   public Class128 Field10086;
   public int Field10087;
   public int[] Field10088;
   public int[] Field10089;
   public int[] Field10090;
   public int[] Field10091;

   public static void Method8350(byte[] var0, int var1) {
      try {
         Class128 var2;
         int var3;
         int[] var4;
         int[] var5;
         int[] var6;
         int[] var7;
         int var8;
         int var9;
         Class518 var10;
         Map var11;
         int var12;
         int var13;
         int var14;
         int var15;
         Packet var19;
         int var20;
         short var21;
         if (Client.normalMem) {
            var19 = new Packet(var0);
            var2 = new Class128(var19, (byte)0);
            var3 = var19.g2();
            var4 = new int[500];
            var5 = new int[500];
            var6 = new int[500];
            var7 = new int[500];

            for(var8 = 0; var8 < var3; ++var8) {
               if (var19.pos >= var19.Field1259.length) {
                  return;
               }

               var9 = var19.g2();
               var10 = new Class518();
               var11 = Field10081;
               synchronized(Field10081) {
                  Field10081.put(new Integer((var1 << 16) + var9), var10);
               }

               var10.Field10086 = var2;
               var20 = var19.g1();
               var9 = -1;
               var12 = 0;

               for(var13 = 0; var13 < var20; ++var13) {
                  if ((var14 = var19.g1()) > 0) {
                     if (var13 < var2.Field10041.length && var2.Field10041[var13] != 0) {
                        for(var15 = var13 - 1; var15 > var9; --var15) {
                           if (var2.Field10041[var15] == 0) {
                              var4[var12] = var15;
                              var5[var12] = 0;
                              var6[var12] = 0;
                              var7[var12] = 0;
                              ++var12;
                              break;
                           }
                        }
                     }

                     var4[var12] = var13;
                     var21 = 0;
                     if (var2.Field10041[var13] == 3) {
                        var21 = 128;
                     }

                     if ((var14 & 1) != 0) {
                        var5[var12] = (short)var19.Method383();
                     } else {
                        var5[var12] = var21;
                     }

                     if ((var14 & 2) != 0) {
                        var6[var12] = var19.Method383();
                     } else {
                        var6[var12] = var21;
                     }

                     if ((var14 & 4) != 0) {
                        var7[var12] = var19.Method383();
                     } else {
                        var7[var12] = var21;
                     }

                     var9 = var13;
                     ++var12;
                  }
               }

               var10.Field10087 = var12;
               var10.Field10088 = new int[var12];
               var10.Field10089 = new int[var12];
               var10.Field10090 = new int[var12];
               var10.Field10091 = new int[var12];

               for(var13 = 0; var13 < var12; ++var13) {
                  var10.Field10088[var13] = var4[var13];
                  var10.Field10089[var13] = var5[var13];
                  var10.Field10090[var13] = var6[var13];
                  var10.Field10091[var13] = var7[var13];
               }
            }

         } else {
            var19 = new Packet(var0);
            var2 = new Class128(var19, (byte)0);
            var3 = var19.g2();
            var4 = new int[500];
            var5 = new int[500];
            var6 = new int[500];
            var7 = new int[500];

            for(var8 = 0; var8 < var3; ++var8) {
               if (var19.pos >= var19.Field1259.length) {
                  return;
               }

               var9 = var19.g2();
               (var10 = new Class518()).Field10086 = var2;
               var11 = Field10081;
               synchronized(Field10081) {
                  Field10081.put(new Integer((var1 << 16) + var9), var10);
               }

               var20 = var19.g1();
               var9 = 0;
               var12 = -1;

               for(var13 = 0; var13 < var20; ++var13) {
                  if ((var14 = var19.g1()) > 0) {
                     if (var2.Field10041[var13] != 0) {
                        for(var15 = var13 - 1; var15 > var12; --var15) {
                           if (var2.Field10041[var15] == 0) {
                              var4[var9] = var15;
                              var5[var9] = 0;
                              var6[var9] = 0;
                              var7[var9] = 0;
                              ++var9;
                              break;
                           }
                        }
                     }

                     var4[var9] = var13;
                     var21 = 0;
                     if (var2.Field10041[var13] == 3) {
                        var21 = 128;
                     }

                     if ((var14 & 1) != 0) {
                        var5[var9] = (short)var19.Method383();
                     } else {
                        var5[var9] = var21;
                     }

                     if ((var14 & 2) != 0) {
                        var6[var9] = var19.Method383();
                     } else {
                        var6[var9] = var21;
                     }

                     if ((var14 & 4) != 0) {
                        var7[var9] = var19.Method383();
                     } else {
                        var7[var9] = var21;
                     }

                     var12 = var13;
                     ++var9;
                  }
               }

               var10.Field10087 = var9;
               var10.Field10088 = new int[var9];
               var10.Field10089 = new int[var9];
               var10.Field10090 = new int[var9];
               var10.Field10091 = new int[var9];

               for(var13 = 0; var13 < var9; ++var13) {
                  var10.Field10088[var13] = var4[var13];
                  var10.Field10089[var13] = var5[var13];
                  var10.Field10090[var13] = var6[var13];
                  var10.Field10091[var13] = var7[var13];
               }
            }

         }
      } catch (Exception var18) {
         var18.printStackTrace();
      }
   }

   public static Class518 Method8351(int var0) {
      try {
         int var1 = var0 >> 16;
         Class518 var3;
         if ((var3 = (Class518)Field10081.get(new Integer(var0))) == null) {
            if (Client.Field12183 != null && Client.Field12183.Field12526 != null) {
               Client.Field12183.Field12526.Method11960(1, var1);
               return null;
            } else {
               return null;
            }
         } else {
            var3.Field10084 = System.currentTimeMillis();
            return var3;
         }
      } catch (Exception var2) {
         var2.printStackTrace();
         return null;
      }
   }

   public static boolean Method8352(int var0) {
      return var0 == -1;
   }

   public static void Method8353(boolean var0) {
      if (Field10081 != null) {
         long var1;
         if ((var1 = System.currentTimeMillis()) - Field10083 > 5000L || var0) {
            Field10083 = var1;
            Map var3 = Field10081;
            synchronized(Field10081) {
               Iterator var5 = Field10081.entrySet().iterator();

               while(true) {
                  Entry var4;
                  do {
                     if (!var5.hasNext()) {
                        Class518 var7;
                        for(var5 = Field10082.entrySet().iterator(); var5.hasNext(); var7.Field10088 = null) {
                           var4 = (Entry)var5.next();
                           Field10081.remove(var4.getKey());
                           (var7 = (Class518)var4.getValue()).Field10086 = null;
                           var7.Field10089 = null;
                           var7.Field10090 = null;
                           var7.Field10091 = null;
                        }

                        Field10082.clear();
                        return;
                     }

                     var4 = (Entry)var5.next();
                  } while(var1 - ((Class518)var4.getValue()).Field10084 <= 180000L && !var0);

                  Field10082.put((Integer)var4.getKey(), (Class518)var4.getValue());
               }
            }
         }
      }
   }
}
