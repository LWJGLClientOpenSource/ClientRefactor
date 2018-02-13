package net.LWJGLClient.client.b.b.f.c;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import net.LWJGLClient.client.b.b.b.a.a.Class647;
import net.LWJGLClient.client.b.b.f.Class843;
import net.LWJGLClient.client.model.Client;
import net.LWJGLClient.client.model.f.TextureData;

public final class Class600 {
   private static List Field8854 = new LinkedList();
   private static List Field8855 = new LinkedList();
   private static List Field8856 = new LinkedList();
   private static long Field8857 = 0L;

   public static boolean Method9132(Class647 var0) {
      if (Field8856.indexOf((var0.Method10072() << 16) + var0.Method10069().Method9150()) != -1) {
         return false;
      } else {
         List var1 = Field8854;
         synchronized(Field8854) {
            Field8854.add(var0);
            return true;
         }
      }
   }

   public static void Method9133() {
      if (System.currentTimeMillis() - Field8857 >= 60L) {
         Field8857 = System.currentTimeMillis();
         if (!Client.Method13313() && (Client.Field12218 == null || Client.Field12218.Method8825())) {
            int var0 = 0;
            List var1 = Field8854;
            synchronized(Field8854) {
               Iterator var3 = Field8854.iterator();

               Class647 var2;
               while(var3.hasNext()) {
                  if (TextureData.Method13526((var2 = (Class647)var3.next()).Method10072()) != null) {
                     var2.Method10067(128);
                     var2.Method10068(128);
                     if (var0++ > 1) {
                        break;
                     }

                     if (Class843.Method14020(var2)) {
                        Field8855.add(var2);
                     }
                  }
               }

               var3 = Field8855.iterator();

               while(var3.hasNext()) {
                  var2 = (Class647)var3.next();
                  Field8854.remove(var2);
               }

               Field8855.clear();
            }
         }
      }
   }
}
