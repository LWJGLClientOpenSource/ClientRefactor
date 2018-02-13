package net.LWJGLClient.client.c.b.a;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

import net.LWJGLClient.client.model.Model;
import net.LWJGLClient.client.model.Client;

public final class Class78 implements Runnable {
   private boolean Field3234 = false;
   private final Client Field3235;
   private final int Field3236;
   private final String Field3237;
   private Socket[] Field3238 = null;
   private Class76[] Field3239 = null;
   private boolean[] Field3240 = null;
   private Queue Field3241 = new LinkedBlockingQueue();
   private Map Field3242 = new HashMap();
   private boolean Field3243 = true;
   private int Field3244 = 0;
   private AtomicInteger Field3245;
   private AtomicInteger Field3246;
   private AtomicInteger Field3247;
   private long Field3248 = System.currentTimeMillis();

   public final List Method583() {
      if (!this.Field3243) {
         return null;
      } else {
         this.Field3243 = false;
         this.Field3241.clear();
         this.Field3242.clear();
         this.Field3240 = null;

         for(int var1 = 0; var1 < this.Field3238.length; ++var1) {
            if (this.Field3238[var1] != null) {
               try {
                  this.Field3238[var1].close();
               } catch (IOException var3) {
                  var3.printStackTrace();
               }

               this.Field3238[var1] = null;
            }

            if (this.Field3239[var1] != null) {
               this.Field3239[var1].Method11824();
               this.Field3239[var1] = null;
            }
         }

         return this.Method586();
      }
   }

   public final List Method584() {
      List var1 = this.Method586();
      this.Field3241.clear();
      this.Field3242.clear();
      return var1;
   }

   public Class78(Client var1, String var2, int var3, int var4) {
      this.Field3235 = var1;
      this.Field3237 = var2;
      this.Field3236 = 43592;
      this.Field3238 = new Socket[1];
      this.Field3240 = new boolean[1];
      this.Field3239 = new Class76[1];
   }

   public final void Method585(AtomicInteger var1, AtomicInteger var2, AtomicInteger var3) {
      this.Field3245 = var1;
      this.Field3246 = var2;
      this.Field3247 = var3;
   }

   private List Method586() {
      LinkedList var1 = new LinkedList();
      Map var2 = this.Field3242;
      synchronized(this.Field3242) {
         Iterator var4 = this.Field3242.values().iterator();

         Class77 var3;
         while(var4.hasNext()) {
            var3 = (Class77)var4.next();
            var1.add(var3.Method581());
         }

         var4 = this.Field3241.iterator();

         while(var4.hasNext()) {
            var3 = (Class77)var4.next();
            var1.add(var3.Method581());
         }

         return var1;
      }
   }

   public final boolean Method587(Class77 var1) {
      if (this.Field3234) {
         return false;
      } else {
         this.Field3234 = false;
         boolean[] var5 = this.Field3240;
         int var4 = this.Field3240.length;

         int var3;
         for(var3 = 0; var3 < var4; ++var3) {
            boolean var2 = var5[var3];
            this.Field3234 |= var2;
         }

         if (this.Field3234) {
            return false;
         } else if (this.Field3242.containsKey(var1.Method579())) {
            return true;
         } else if (this.Field3241.contains(var1)) {
            return true;
         } else {
            int var6 = var1.Method578();
            var3 = var1.Method579() - 1;
            boolean var7 = var1.Method580();
            AtomicInteger var8;
            if (var6 == 4 && var7) {
               var8 = this.Field3245;
            } else {
               var8 = this.Field3246;
            }

            if (var6 == 1 && Model.Method14469(var3) && var7 && !var1.Method582()) {
               var1.Method574();
               this.Field3247.incrementAndGet();
            }

            var8.incrementAndGet();
            var1.Method575(var8);
            this.Field3241.add(var1);
            return true;
         }
      }
   }

   private boolean Method588(int var1) {
      Socket var7;
      if ((var7 = this.Field3238[0]) == null || this.Field3240[0] || var7.isClosed() || this.Field3234) {
         ++this.Field3244;
         byte var8 = 0;
         Socket var3;
         if ((var3 = this.Field3238[var8]) != null && !var3.isClosed()) {
            try {
               var3.close();
            } catch (IOException var6) {
               var6.printStackTrace();
            }
         }

         Class76 var9;
         if ((var9 = this.Field3239[var8]) != null) {
            var9.Method11824();
         }

         try {
            (var7 = new Socket()).setTcpNoDelay(true);
            var7.setKeepAlive(false);
            var7.connect(new InetSocketAddress(this.Field3237, this.Field3236), 0);
            this.Field3238[0] = var7;
            this.Field3239[0] = new Class76(var7.getInputStream(), var7.getOutputStream(), this);
            this.Field3240[0] = false;
            (new Thread(this.Field3239[0])).start();
            this.Field3244 = 0;
         } catch (IOException var5) {
            try {
               Thread.sleep(this.Field3244 < 5 ? 100L : (this.Field3244 < 10 ? 250L : (this.Field3244 < 30 ? 1000L : 2000L)));
            } catch (InterruptedException var4) {
               var4.printStackTrace();
            }

            var5.printStackTrace();
            return false;
         }
      }

      return true;
   }

   private void Method589(Class77 var1) {
      var1.Method576().decrementAndGet();
      if (var1.Method573() && !var1.Method582()) {
         this.Field3247.decrementAndGet();
      }

      System.out.println("[SocketRequester] cancelling: " + var1.Method579() + ", " + var1.Method578());
   }

   public final void Method590(String var1, byte[] var2, int var3) {
      Class77 var5;
      if ((var5 = (Class77)this.Field3242.get(var1)) != null && var3 != 1) {
         if (var2.length > 1) {
            this.Field3248 = System.currentTimeMillis();
            this.Field3235.Field12722[var5.Method578()].Method9334(var3, var2, var5.Method579() - 1);
            if (var5.Method580()) {
               byte[] var4 = new byte[var3];
               System.arraycopy(var2, 0, var4, 0, var3);
               var5.Method581().Field2735 = var4;
               this.Field3235.Field12526.Method1320(var5.Method581());
            } else {
               var5.Method581().Field2735 = null;
            }

            if (var5.Method576() != null) {
               var5.Method576().decrementAndGet();
            }

            if (var5.Method573() && !var5.Method582()) {
               this.Field3247.decrementAndGet();
            }

         }
      }
   }

   private void Method591() {
      if (this.Field3234) {
         Map var1 = this.Field3242;
         synchronized(this.Field3242) {
            Iterator var3 = this.Field3242.values().iterator();

            while(true) {
               if (!var3.hasNext()) {
                  this.Field3242.clear();
                  break;
               }

               Class77 var2 = (Class77)var3.next();
               this.Method589(var2);
            }
         }

         for(int var6 = 0; var6 < this.Field3238.length; ++var6) {
            if (this.Field3238[var6] != null) {
               try {
                  this.Field3238[var6].close();
               } catch (Exception var4) {
                  var4.printStackTrace();
               }
            }

            this.Field3238[var6] = null;
         }

         this.Field3234 = false;
         this.Field3248 = System.currentTimeMillis();
      }

   }

   public final void run() {
      while(this.Field3243) {
         try {
            Thread.sleep(100L);
            if (this.Field3241.size() > 0 && System.currentTimeMillis() - this.Field3248 > 60000L) {
               this.Field3234 = true;
               this.Field3248 = System.currentTimeMillis();
            }

            Class77 var1;
            if (this.Field3234) {
               this.Method591();
            } else {
               while((var1 = (Class77)this.Field3241.poll()) != null) {
                  try {
                     for(int var2 = 0; var2 < 2; ++var2) {
                        if (this.Method588(0)) {
                           Map var6 = this.Field3242;
                           synchronized(this.Field3242) {
                              this.Field3242.put(var1.Method577(), var1);
                           }

                           this.Field3239[0].Method572(var1);
                           break;
                        }

                        this.Method589(var1);
                        this.Field3234 = true;
                        this.Field3240[0] = true;
                     }
                  } catch (Exception var4) {
                     this.Method589(var1);
                     this.Field3234 = true;
                     this.Field3240[0] = true;
                     var4.printStackTrace();
                     this.Method591();
                  }
               }
            }
         } catch (Exception var5) {
            var5.printStackTrace();
         }
      }

   }
}
