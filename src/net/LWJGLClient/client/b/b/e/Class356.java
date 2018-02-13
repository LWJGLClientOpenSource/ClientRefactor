package net.LWJGLClient.client.b.b.e;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import net.LWJGLClient.client.model.Client;

public final class Class356 {
   private int Field3440;
   private final List Field3441 = new LinkedList();
   private final Map Field3442 = new HashMap();
   private boolean Field3443 = true;
   private long Field3444 = 0L;
   private int Field3445 = 0;
   private boolean Field3446 = false;
   private boolean Field3447 = false;
   private int Field3448 = 0;
   private int Field3449 = 0;
   private int Field3450 = 0;
   private int Field3451 = 0;
   private int Field3452 = 0;
   private int Field3453 = 0;

   public final boolean Method4166() {
      return this.Field3447;
   }

   public final int Method4167() {
      return this.Field3448;
   }

   public final int Method4168() {
      return this.Field3449;
   }

   public final void Method4169(int var1, int var2) {
      if (this.Field3450 < 94 && this.Field3451 < 94 && this.Field3450 > 10 && this.Field3451 > 10 && !Client.Field12075) {
         this.Field3452 += var1 << 7;
         this.Field3453 += var2 << 7;
      } else {
         this.Field3447 = true;
      }
   }

   public final int Method4170() {
      return this.Field3452;
   }

   public final int Method4171() {
      return this.Field3453;
   }

   public final boolean Method4172() {
      return this.Field3446;
   }

   public final void Method4173(long var1) {
      this.Field3446 = false;
      this.Field3444 = var1;
   }

   public final long Method4174() {
      return this.Field3444;
   }

   public final void Method4175() {
      this.Field3446 = true;
   }

   public final int Method4176() {
      return this.Field3445;
   }

   public final void Method4177() {
      this.Field3445 = this.Field3441.size();
      this.Field3443 = false;
   }

   public final int Method4178() {
      return this.Field3450;
   }

   public final int Method4179() {
      return this.Field3451;
   }

   public Class356(long var1, int var3, int var4, int var5, int var6) {
      int var10002 = var3;
      int var10003 = var4;
      int var10004 = var5;
      var5 = var6;
      var4 = var10004;
      var3 = var10003;
      int var2 = var10002;
      this.Field3440 = var4;
      int var10000 = Client.Field12497;
      var4 = Client.Field12494;
      var10000 = Client.Field12498;
      var6 = Client.Field12495;
      this.Field3448 = (Client.Field12490 + var2 + var4) / var5 * var5;
      this.Field3449 = (Client.Field12491 + var3 + var6) / var5 * var5;
      this.Field3450 = var2 / var5 * var5;
      this.Field3451 = var3 / var5 * var5;
   }

   private static long Method4180(Class358 var0) {
      int var10000 = Client.Field12497;
      int var1 = Client.Field12494;
      var10000 = Client.Field12498;
      int var2 = Client.Field12495;
      long var3 = (long)(Client.Field12490 + var0.Method4197() + var1);
      long var5 = (long)(Client.Field12491 + var0.Method4198() + var2);
      long var7 = var0.Method4192() >> 28 << 28;
      long var9 = (var3 & 16383L) + ((var5 & 4095L) << 14);
      return var7 + var9;
   }

   public final boolean Method4181(Class358 var1) {
      long var2 = Method4180(var1);
      return this.Field3442.containsKey(var2);
   }

   public final boolean Method4182(Class358 var1) {
      long var2 = Method4180(var1);
      if (!this.Field3442.containsKey(var2)) {
         if (var1.Method4199() != this.Field3440) {
            System.err.println("[DrawableArea]: height issue warning: " + var1.Method4199() + "/" + this.Field3440);
         }

         this.Field3442.put(var2, true);
         this.Field3441.add(var1);
         var1.Method4202(this.Field3452, this.Field3453);
         return true;
      } else {
         return false;
      }
   }

   public final List Method4183() {
      return this.Field3441;
   }

   public final void Method4184(boolean var1) {
      if (var1) {
         this.Field3443 = true;
      }

   }

   public final boolean Method4185() {
      return this.Field3443;
   }

   public final void Method4186(int var1, int var2) {
      this.Field3447 = false;
      if (var1 != -1 && var2 != -1) {
         this.Field3441.clear();
         this.Field3442.clear();
      } else {
         this.Field3441.clear();
         this.Field3442.clear();
         this.Field3443 = true;
      }

      this.Field3445 = 0;
      this.Field3444 = 0L;
      this.Field3446 = true;
   }
}
