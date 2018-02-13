package net.LWJGLClient.client.a;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.zip.CRC32;
import java.util.zip.GZIPInputStream;

import net.LWJGLClient.client.a.e.Class619;
import net.LWJGLClient.client.c.b.Class280;
import net.LWJGLClient.client.model.Class862;
import net.LWJGLClient.client.model.c.Class178;
import net.LWJGLClient.client.Signlink;
import net.LWJGLClient.client.a.e.JagexArchive;
import net.LWJGLClient.client.c.Packet;
import net.LWJGLClient.client.model.Client;

public final class OnDemandFetcher implements Runnable {
   private int Field10049;
   private Class619[] Field10050;
   private List Field10051 = new LinkedList();
   private List Field10052 = new LinkedList();
   private Queue Field10053 = new LinkedBlockingQueue();
   private Queue Field10054 = new LinkedBlockingQueue();
   private Map Field10055 = new HashMap();
   private int Field10056 = 0;
   private Class178 Field10057 = new Class178();
   public String Field10058 = "";
   private int[] Field10059;
   private int Field10060;
   private Client Field10061;
   private Class178 Field10062;
   private int[] Field10063;
   private int[] Field10064;
   private boolean Field10065;
   private OutputStream Field10066;
   private byte[] Field10067;
   private Socket Field10068;
   private int[][] Field10069;
   private int[] Field10070;
   private byte[] Field10071;
   private int Field10072;

   public final void Method1306(JagexArchive var1, Client var2, Class619[] var3) {
      this.Field10050 = var3;
      String[] var8 = new String[]{"model_crc", "anim_crc", "midi_crc", "map_crc"};

      int var6;
      int var10;
      for(int var4 = 0; var4 < 4; ++var4) {
         byte[] var5;
         var6 = (var5 = var1.readConfig(var8[var4])).length / 4;
         Packet var7 = new Packet(var5);
         this.Field10069[var4] = new int[var6];

         for(var10 = 0; var10 < var6; ++var10) {
            this.Field10069[var4][var10] = var7.Method404();
         }
      }

      byte[] var9 = var1.readConfig("model_index");
      var10 = this.Field10069[0].length;
      this.Field10071 = new byte[var10];

      for(var6 = 0; var6 < var10; ++var6) {
         if (var6 < var9.length) {
            this.Field10071[var6] = var9[var6];
         } else {
            this.Field10071[var6] = 0;
         }
      }

      var9 = var1.readConfig("map_index");
      Packet var11 = new Packet(var9);
      this.Field10049 = var11.g2();
      var10 = this.Field10049;
      this.Field10070 = new int[var10];
      this.Field10064 = new int[var10];
      this.Field10059 = new int[var10];

      int var12;
      for(var12 = 0; var12 < var10; ++var12) {
         this.Field10070[var12] = var11.g2();
         this.Field10064[var12] = var11.g2();
         this.Field10059[var12] = var11.g2();
      }

      var9 = var1.readConfig("midi_index");
      var11 = new Packet(var9);
      var10 = var9.length;
      this.Field10063 = new int[var10];

      for(var12 = 0; var12 < var10; ++var12) {
         this.Field10063[var12] = var11.g1();
      }

      this.Field10061 = var2;
      this.Field10065 = true;
      this.Field10061.startRunnable(this, 2);
   }

   public final int Method1307() {
      Map var1 = this.Field10055;
      synchronized(this.Field10055) {
         return this.Field10055.size();
      }
   }

   public final void Method1308() {
      this.Field10065 = false;
   }

   public final int Method11954() {
      return this.Field10055.size();
   }

   public final void Method11960(int var1, int var2) {
      this.Method11951(var1, var2, false);
   }

   public final void Method11951(int var1, int var2, boolean var3) {
      this.Method1312(var1, var2, var3, false);
   }

   public final void Method1312(int var1, int var2, boolean var3, boolean var4) {
      if (var2 >= 0) {
         Map var5 = this.Field10055;
         synchronized(this.Field10055) {
            long var10000 = (long)var1;
            long var11 = (long)var2;
            long var6 = (var10000 << 32) + var11;
            if (var3 || !this.Field10055.containsKey(var6)) {
               Class862 var14;
               (var14 = new Class862()).Field2734 = var1;
               var14.Field2736 = var2;
               var14.Field2737 = true;
               var14.Field2728 = var6;
               var14.Field2727 = this.Field10056++;
               var14.Field2733 = var4;
               this.Field10053.add(var14);
               this.Field10055.put(var6, true);
            }
         }
      }
   }

   public final void run() {
      while(this.Field10065) {
         try {
            ++this.Field10060;
            byte var1 = 20;
            if (this.Field10050[0] != null) {
               var1 = 50;
            }

            try {
               Thread.sleep((long)var1);
            } catch (Exception var9) {
               ;
            }

            OnDemandFetcher var12 = this;

            Class862 var2;
            while((var2 = (Class862)var12.Field10053.poll()) != null) {
               var12.Field10052.add(var2);
            }

            Map var13 = var12.Field10055;
            synchronized(var12.Field10055) {
               if (var12.Field10052.size() == 0 && var12.Field10055.size() > 0) {
                  var12.Field10055.clear();
               }
            }

            Iterator var3 = var12.Field10052.iterator();

            while(true) {
               while(var3.hasNext()) {
                  if ((var2 = (Class862)var3.next()).Field2730) {
                     var12.Field10051.add(var2);
                  } else {
                     byte[] var4;
                     if (var2.Field2733) {
                        var4 = null;
                     } else if (!var2.Field2738) {
                        var4 = var12.Field10050[var2.Field2734 + 1].Method9333(var2.Field2736);
                     } else {
                        var4 = var2.Field2735;
                     }

                     if (var4 == null) {
                        int var5 = 10000;
                        if (var2.Field2734 == 3) {
                           var5 += 10000;
                        } else if (var2.Field2734 == 4) {
                           var5 = 10000 + (Client.Field12218 != null && Client.Field12218.Method8825() ? 0 : 20000);
                        }

                        boolean var16 = System.currentTimeMillis() - var2.Field2731 > (long)var5;
                        if (!var2.Field2738 || var16) {
                           boolean var6 = false;
                           if (var16) {
                              if (var2.Field2734 == 0) {
                                 continue;
                              }

                              if (var2.Field2726++ > 0) {
                                 var2.Field2730 = true;
                                 continue;
                              }

                              if (var2.Field2734 == 3) {
                                 continue;
                              }

                              var2.Field2731 = System.currentTimeMillis();
                              if (Client.Field12080) {
                                 System.out.println("[OnDemandFetcher]: re-requesting: " + var2.Field2734 + "-" + var2.Field2736);
                              }
                           }

                           if (var2.Field2726 >= 2) {
                              var6 = true;
                           }

                           var2.Field2738 = true;
                           Class280.Method2988().Method3003(var2, true, var6);
                        }
                     }

                     if (var4 != null) {
                        var2.Field2730 = true;
                        var2.Field2735 = var4;
                        var12.Field10051.add(var2);
                        var12.Field10054.add(var2);
                     }
                  }
               }

               var3 = var12.Field10051.iterator();

               while(var3.hasNext()) {
                  var2 = (Class862)var3.next();
                  var12.Field10052.remove(var2);
                  Map var15 = var12.Field10055;
                  synchronized(var12.Field10055) {
                     var12.Field10055.remove(var2.Field2728);
                  }
               }

               var12.Field10051.clear();
               boolean var14 = false;

               for(var2 = (Class862)this.Field10057.Method1847(); var2 != null; var2 = (Class862)this.Field10057.Method1848()) {
                  if (var2.Field2737) {
                     var14 = true;
                     ++var2.Field2739;
                     if (var2.Field2739 > 50) {
                        var2.Field2739 = 0;
                     }
                  }
               }

               if (!var14) {
                  for(var2 = (Class862)this.Field10057.Method1847(); var2 != null; var2 = (Class862)this.Field10057.Method1848()) {
                     var14 = true;
                     ++var2.Field2739;
                     if (var2.Field2739 > 50) {
                        var2.Field2739 = 0;
                     }
                  }
               }

               if (var14) {
                  ++this.Field10072;
                  if (this.Field10072 > 750 && !Client.Field12177) {
                     try {
                        //null.close();
                     } catch (Exception var7) {
                        ;
                     }

                     this.Field10068 = null;
                     this.Field10066 = null;
                  }
               } else {
                  this.Field10072 = 0;
                  this.Field10058 = "";
               }

               if (Client.Field12593) {
                  ;
               }
               break;
            }
         } catch (Exception var11) {
            var11.printStackTrace();
            Signlink.reporterror("od_ex " + var11.getMessage());
         }
      }

   }

   public final void Method11961(int var1, int var2) {
      if (this.Field10050[0] != null) {
         ;
      }
   }

   public final Class862 Method1314() {
      Class862 var1;
      if ((var1 = (Class862)this.Field10054.poll()) != null) {
         Map var2 = this.Field10055;
         synchronized(this.Field10055) {
            this.Field10055.remove(var1.Field2728);
         }

         var1.Field2730 = true;
         if (var1.Field2735 == null) {
            System.err.println("[OnDemandFetcher]: null buffer: " + var1.Field2734 + "-" + var1.Field2736);
            return var1;
         } else {
            int var3;
            if (var1.Field2735.length == 5) {
               boolean var19 = true;

               for(var3 = 0; var3 < 5; ++var3) {
                  if (var1.Field2735[var3] != var3) {
                     var19 = false;
                     break;
                  }
               }

               if (var19) {
                  var1.Field2729 = true;
                  System.out.println("[OnDemandFetcher]: File not found: " + var1.Field2734 + "-" + var1.Field2736);
                  return var1;
               }
            }

            int var20 = 0;
            var3 = 0;
            GZIPInputStream var4 = null;
            boolean var12 = false;

            label179: {
               try {
                  var12 = true;

                  for(var4 = new GZIPInputStream(new ByteArrayInputStream(var1.Field2735)); var20 != this.Field10067.length; ++var3) {
                     int var5;
                     if ((var5 = var4.read(this.Field10067, var20, this.Field10067.length - var20)) == -1) {
                        var12 = false;
                        break label179;
                     }

                     var20 += var5;
                  }

                  throw new RuntimeException("buffer overflow! " + var20 + "/" + var4.available() + "; buf: " + var1.Field2735.length + ", reads: " + var3);
               } catch (IOException var17) {
                  System.err.println("len: " + var1.Field2735.length);
                  var1.Field2732 = true;
                  var1.Field2735 = null;
                  var17.printStackTrace();
                  var1 = var1;
                  var12 = false;
               } finally {
                  if (var12) {
                     if (var4 != null) {
                        try {
                           var4.close();
                        } catch (IOException var13) {
                           var13.printStackTrace();
                        }
                     }

                  }
               }

               if (var4 != null) {
                  try {
                     var4.close();
                  } catch (IOException var14) {
                     var14.printStackTrace();
                  }
               }

               return var1;
            }

            try {
               var4.close();
            } catch (IOException var15) {
               var15.printStackTrace();
            }

            var1.Field2735 = new byte[var20];
            System.arraycopy(this.Field10067, 0, var1.Field2735, 0, var20);
            return var1;
         }
      } else {
         return null;
      }
   }

   public final int Method1315(int var1, int var2, int var3) {
      var2 += var3 << 8;

      for(var3 = 0; var3 < this.Field10070.length; ++var3) {
         if (this.Field10070[var3] == var2) {
            if (var1 == 0) {
               return this.Field10064[var3];
            }

            return this.Field10059[var3];
         }
      }

      return -1;
   }

   public final void Method13209(int var1) {
      this.Method11951(0, var1, true);
   }

   public final void Method13227(int var1) {
      byte var2 = 0;
      this.Method11951(var2, var1, false);
   }

   public final boolean Method1318(int var1) {
      for(int var2 = 0; var2 < this.Field10070.length; ++var2) {
         if (this.Field10059[var2] == var1) {
            return true;
         }
      }

      return false;
   }

   public final void Method11836() {
      Class178 var1 = this.Field10062;
      synchronized(this.Field10062) {
         this.Field10062.Method1849();
      }
   }

   public final void Method1320(Class862 var1) {
      var1.Field2730 = true;
      this.Field10054.add(var1);
   }

   public OnDemandFetcher() {
      new CRC32();
      this.Field10062 = new Class178();
      this.Field10065 = true;
      this.Field10067 = new byte[999999];
      this.Field10069 = new int[4][];
      new Class178();
   }
}
