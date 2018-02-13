package net.LWJGLClient.client.model.c;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

import net.LWJGLClient.client.model.Client;

public final class MemCache {
   private final int Field3412;
   private final int Field3413;
   private final Map Field3414;
   private final Comparator Field3415 = new Class159(this);
   private boolean Field3416 = true;

   public MemCache(int var1) {
      this.Field3413 = var1;
      this.Field3412 = (int)((float)var1 + 0.15F * (float)var1);
      this.Field3414 = new HashMap();
   }

   private void Method1508() {
      int var1;
      if ((var1 = Math.round((float)(this.Field3414.size() - this.Field3413) * 1.15F)) > 0) {
         LinkedList var2;
         (var2 = new LinkedList()).addAll(this.Field3414.values());
         Collections.sort(var2, this.Field3415);
         int var3 = 0;
         Iterator var4 = var2.iterator();

         while(var4.hasNext()) {
            Class158 var5 = (Class158)var4.next();
            this.Field3414.remove(var5.Field3454);
            if (var3++ >= var1) {
               break;
            }
         }
      }

      this.Field3416 = false;
   }

   public final void Method1509(Object var1, Object var2) {
      Class158 var3 = new Class158(this, var1, var2);
      this.Field3414.put(var1, var3);
      if (this.Field3414.size() > this.Field3412) {
         this.Field3416 = true;
         this.Method1508();
      }

   }

   public final Object Method1510(Object var1) {
      if (this.Field3416) {
         this.Method1508();
      }

      Class158 var2;
      if ((var2 = (Class158)this.Field3414.get(var1)) != null) {
         var2.Field3456 = Client.currentTime;
         return var2.Field3455;
      } else {
         return null;
      }
   }

   public final void Method1511(Object var1) {
      this.Field3414.remove(var1);
   }

   public final void Method1512() {
      this.Field3414.clear();
   }
}
