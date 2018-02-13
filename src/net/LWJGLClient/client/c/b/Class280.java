package net.LWJGLClient.client.c.b;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

import net.LWJGLClient.client.model.Class862;
import net.LWJGLClient.client.Signlink;
import net.LWJGLClient.client.a.e.Class624;
import net.LWJGLClient.client.b.Rasterizer;
import net.LWJGLClient.client.c.b.a.Class77;
import net.LWJGLClient.client.c.b.a.Class78;
import net.LWJGLClient.client.model.Client;
import net.LWJGLClient.client.model.Model;

public final class Class280 {
   private static Class280 Field2285;
   private Class624 Field2286 = null;
   private static boolean Field2287 = false;
   private int Field2288 = 0;
   private int Field2289 = 65734;
   private int Field2290 = 0;
   private int Field2291 = 3781;
   private int Field2292 = 0;
   private int Field2293 = 995;
   private int Field2294 = 0;
   private int Field2295 = 6831;
   private int Field2296 = 0;
   private int Field2297 = 0;
   private int[] Field2298;
   private int[] Field2299;
   private int Field2300;
   private boolean Field2301;
   public long Field2302;
   private int Field2303;
   private ExecutorService Field2304;
   private ExecutorService Field2305;
   private Map Field2306;
   private final Client Field2307;
   private AtomicInteger Field2308;
   private AtomicInteger Field2309;
   private AtomicInteger Field2310;
   private boolean Field2311;
   private Class78 Field2312;
   private long Field2313;
   private long Field2314;
   private int Field2315;
   private Class281[] Field2316;
   private int Field2317;

   public static void Method2987(String var0, String var1) {
      Field2285 = new Class280(var0, var1);
   }

   public static Class280 Method2988() {
      return Field2285;
   }

   public final Class624 Method2989() {
      return this.Field2286;
   }

   public final String Method2990() {
      if (!Field2287) {
         return "disabled";
      } else {
         float var1 = 0.0F;
         float var2 = 0.0F;

         for(int var3 = 0; var3 < this.Field2298.length; ++var3) {
            var1 += (float)this.Field2299[var3];
            var2 += (float)(this.Field2298[var3] - 1);
         }

         if (var1 != var2 && this.Field2300 != this.Field2298.length) {
            float var6;
            int var4 = (int)(var6 = var1 / var2 * 100.0F);
            int var5 = (int)(var6 * 100.0F) - var4 * 100;
            String var7 = String.valueOf(var5);
            if (var5 < 10) {
               var7 = "0" + var5;
            }

            return var4 + "." + var7 + "%";
         } else {
            return "100%";
         }
      }
   }

   public final int Method2991() {
      return this.Field2308.get();
   }

   public final int Method2992() {
      return this.Field2309.get();
   }

   public final int Method2993() {
      return this.Field2310.get();
   }

   private void Method2994() {
      this.Field2304 = Executors.newFixedThreadPool(2);
      this.Field2305 = Executors.newFixedThreadPool(1);
   }

   private Class280(String var1, String var2) {
      this.Field2298 = new int[]{this.Field2289, this.Field2291, this.Field2293, this.Field2295, this.Field2297};
      this.Field2299 = new int[]{this.Field2288, this.Field2290, this.Field2292, this.Field2294, this.Field2296};
      String[] var10000 = new String[]{"models", "anims", "sounds", "maps", "textures", "finished"};
      this.Field2300 = 0;
      this.Field2301 = false;
      this.Field2302 = 100L;
      this.Field2303 = 0;
      this.Field2306 = new HashMap();
      this.Field2308 = new AtomicInteger(0);
      this.Field2309 = new AtomicInteger(0);
      this.Field2310 = new AtomicInteger(0);
      this.Field2311 = false;
      this.Field2312 = null;
      this.Field2313 = 0L;
      this.Field2314 = 0L;
      this.Field2315 = 0;
      this.Field2317 = 0;
      this.Method2994();
      this.Field2307 = Client.Field12183;
      this.Field2316 = new Class281[8];

      for(int var3 = 0; var3 < this.Field2316.length; ++var3) {
         this.Field2316[var3] = new Class281(var1, var2);
      }

      this.Field2286 = new Class624();
      this.Method3002();
   }

   public final void Method2995() {
      this.Field2308.set(0);
      this.Field2309.set(0);
      this.Field2310.set(0);
   }

   public final void Method2996() {
      this.Field2304.shutdownNow();
      this.Field2305.shutdownNow();
      this.Field2308.set(0);
      this.Field2309.set(0);
      this.Field2310.set(0);
      if (this.Field2312 != null) {
         List var1 = this.Field2312.Method583();
         this.Field2313 = System.currentTimeMillis();
         this.Field2314 = 5000L;
         Iterator var3 = var1.iterator();

         while(var3.hasNext()) {
            Class862 var2 = (Class862)var3.next();
            boolean var5 = true;
            this.Method3003(var2, var5, false);
         }

         var1.clear();
         this.Field2312 = null;
      }

      this.Method2994();
   }

   public final void Method2997(boolean var1) {
      this.Field2297 = Rasterizer.Field9950;
      this.Field2298 = new int[]{this.Field2289, this.Field2291, this.Field2293, this.Field2295, this.Field2297};
      this.Field2301 = true;
      if (var1) {
         this.Method2998();
      }

   }

   public final boolean Method2998() {
      if (!Field2287 && !this.Field2311) {
         Field2287 = true;
         (new Thread(new Class272(this))).start();
         return true;
      } else {
         return false;
      }
   }

   public static void Method2999() {
      Field2287 = false;
   }

   public final void Method3000() {
      this.Field2311 = true;
      int[] var3 = new int[]{3, 1, 0, 2, 4};

      for(int var2 = 0; var2 < 5; ++var2) {
         int var1 = var3[var2];
         if (!Field2287) {
            break;
         }

         this.Field2300 = var1;

         for(int var4 = this.Field2299[var1]; var4 < this.Field2298[var1] && Field2287; ++var4) {
            while((this.Field2309.get() > 10 || this.Field2307.Field12526.Method1307() > 0) && Field2287) {
               try {
                  Thread.sleep(100L);
               } catch (InterruptedException var9) {
                  var9.printStackTrace();
               }
            }

            if (!Field2287) {
               break;
            }

            this.Field2299[var1] = var4;
            if (this.Field2307.Field12722[var1 + 1].Method9333(var4 + 1) == null) {
               Class862 var10001 = new Class862(var1, var4);
               boolean var7 = false;
               Class862 var6 = var10001;
               this.Method3003(var6, var7, false);

               try {
                  Thread.sleep(this.Field2302);
               } catch (InterruptedException var8) {
                  var8.printStackTrace();
               }
            }
         }
      }

      ++this.Field2300;
      this.Method3001();
      this.Field2311 = false;
   }

   private synchronized void Method3001() {
      String var1 = Signlink.cacheDirectory() + "forID.dat";
      File var2;
      if ((var2 = new File(var1)).exists()) {
         var2.delete();
      }

      try {
         RandomAccessFile var5;
         (var5 = new RandomAccessFile(var1, "rw")).writeInt(this.Field2299[0]);
         var5.writeInt(this.Field2299[1]);
         var5.writeInt(this.Field2299[2]);
         var5.writeInt(this.Field2299[3]);
         var5.writeInt(this.Field2299[4]);
         var5.close();
      } catch (FileNotFoundException var3) {
         var3.printStackTrace();
      } catch (IOException var4) {
         var4.printStackTrace();
      }
   }

   private synchronized void Method3002() {
      String var1 = Signlink.cacheDirectory() + "forID.dat";
      if ((new File(var1)).exists()) {
         try {
            RandomAccessFile var5 = new RandomAccessFile(var1, "rw");
            this.Field2288 = var5.readInt();
            this.Field2290 = var5.readInt();
            this.Field2292 = var5.readInt();
            this.Field2294 = var5.readInt();
            this.Field2296 = var5.readInt();
            var5.close();
            this.Field2299 = new int[]{this.Field2288, this.Field2290, this.Field2292, this.Field2294, this.Field2296};
         } catch (FileNotFoundException var3) {
            var3.printStackTrace();
         } catch (IOException var4) {
            var4.printStackTrace();
         }
      }
   }

   public final void Method3003(Class862 var1, boolean var2, boolean var3) {
      int var4 = var1.Field2734;
      int var5 = var1.Field2736;
      ExecutorService var6 = this.Field2305;
      if (this.Field2301 && !var2 && this.Field2303++ % 10 == 0) {
         this.Method3001();
      }

      if (var1.Field2734 + 1 != 3 || var1.Field2736 + 1 != 0) {
         if (!var2) {
            var1.Field2735 = null;
         }

         boolean var7 = false;
         if (var1.Field2734 + 1 != 5) {
            Class77 var8;
            if (var1.Field2734 + 1 == 5) {
               var8 = new Class77(var1.Field2734 + 1, var1.Field2736, var2, var3, var1);
            } else {
               var8 = new Class77(var1.Field2734 + 1, var1.Field2736 + 1, var2, var3, var1);
            }

            if (this.Field2312 == null) {
               boolean var18 = Client.Field12085;
               this.Field2312 = new Class78(this.Field2307, Client.requestServerIP(), 43592, 1);
               this.Field2312.Method585(this.Field2308, this.Field2309, this.Field2310);
               (new Thread(this.Field2312)).start();
            }

            if (this.Field2312 != null) {
               if (!var3 && (this.Field2313 == 0L || System.currentTimeMillis() - this.Field2313 > this.Field2314 || this.Field2315 < 5)) {
                  var7 = this.Field2312.Method587(var8);
                  this.Field2313 = System.currentTimeMillis();
               }

               if (var7) {
                  this.Field2315 = 0;
                  this.Field2313 = 0L;
                  this.Field2314 = 1000L;
               } else {
                  ++this.Field2315;
                  this.Field2314 += 500L;
                  if (this.Field2314 > 5000L) {
                     this.Field2314 = 5000L;
                  }

                  if (this.Field2312 != null) {
                     List var15;
                     Iterator var11 = (var15 = this.Field2312.Method584()).iterator();

                     while(var11.hasNext()) {
                        Class862 var10 = (Class862)var11.next();
                        this.Method3003(var10, var2, var3);
                     }

                     var15.clear();
                  }
               }
            }
         }

         if (!var7) {
            boolean var16 = false;
            if (var4 + 1 == 4 && var2) {
               this.Field2308.incrementAndGet();
               var6 = this.Field2304;
            } else {
               this.Field2309.incrementAndGet();
            }

            if (var4 + 1 == 1 && Model.Method14469(var5) && var2 && !var3) {
               this.Field2310.incrementAndGet();
               var16 = true;
            }

            long var17 = ((long)var4 + 1L << 32) + (long)var5 + 1L;
            Map var14 = this.Field2306;
            synchronized(this.Field2306) {
               int var13;
               if (((var13 = this.Field2306.size()) <= 10 || var1.Field2734 + 1 != 5) && var13 <= 50) {
                  if (!(var3 = this.Field2306.containsKey(var17))) {
                     this.Field2306.put(var17, true);
                  }
               } else {
                  var3 = true;
               }
            }

            if (!var3) {
               var6.submit(new Class271(this, var1, var2, var4, var16, var17));
            }
         }

      }
   }

   public final synchronized Class281 Method3004() {
      int var1 = this.Field2317;
      if (++this.Field2317 >= this.Field2316.length) {
         this.Field2317 = 0;
      }

      return this.Field2316[var1];
   }

   // $FF: synthetic method
   static Client Method3005(Class280 var0) {
      return var0.Field2307;
   }

   // $FF: synthetic method
   static AtomicInteger Method3006(Class280 var0) {
      return var0.Field2308;
   }

   // $FF: synthetic method
   static AtomicInteger Method3007(Class280 var0) {
      return var0.Field2309;
   }

   // $FF: synthetic method
   static AtomicInteger Method3008(Class280 var0) {
      return var0.Field2310;
   }

   // $FF: synthetic method
   static Map Method3009(Class280 var0) {
      return var0.Field2306;
   }
}
