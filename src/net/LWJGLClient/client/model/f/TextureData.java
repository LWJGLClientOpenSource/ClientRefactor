package net.LWJGLClient.client.model.f;

import net.LWJGLClient.client.a.OnDemandFetcher;
import net.LWJGLClient.client.model.Client;
import net.LWJGLClient.client.c.Packet;

public abstract class TextureData {

   private boolean Field2904 = false;
   public boolean Field2905;
   public boolean Field2906;

   public final int Field2907;
   public final int Field2908;
   private static TextureData[] Field2909;
   private static OnDemandFetcher Field2910;
   /*
       private static TextureData[] b;
    private static OnDemandFetcher h;
    public final int e;
    public final int f;

    public boolean c = 2906;
    public boolean d = 2905;
    private boolean a = false;
    */
   public static final boolean[] Field2911 = new boolean[]{false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, true, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, true, false, false, true, false, false, false, false, false, false, false, true, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, true, true, true, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, true, false, true, true, true, true, false, false, true, false, true, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, true, true, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, true, true, true, true, true, false, false, false, false, false, false, false, false, false, false, true, true, false, false, false, false, false, false, false, false, false, false, false, true, true, true, true, true, true, true, false, false, true, false, true, false, false, false, false, false, false, false, false, false, false, true, true, true, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, true, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, true, true, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, true, true, true, true, true, false, true, true, true, true, true, true, true, true, false, true, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, true, false, true, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, true, false, false, true, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, true, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, true, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, true, true, false, false, true, true, true, true, true, true, true, true, false, true, true, true, true, true, true, true, true, false, true, true, false, false, false, false, true, false, false, true, false, true, true, true, false, false, false, false, false, false, false, true, false, false, true, false, false, false, false, false, false, true, true, true, false, false, true, true, false, false, false, false, true, true, true, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, true, false, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false, true, true, true, true, true, true, true, true, true, false, false, false, false, false, false, false, false, false, false, false, false, true, true, true, true, false, false, true, true, true, true, true, true, true, false, false, false, false, true, true, true, true, true, false, true, true, true, true, true, false, true, true, true, false, false, false, false, true, false, false, false, false, true, true, true, true, true, true, true, false, false, false, true, true, false, false, true, false, true, true, true, true, true, true, true, true, true, true, false, true, true, false, false, false, true, true, true, false, false, false, true, true, false, false, true, false, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, true, true, true, true, true, true, true, false, false, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false, false, true, true, true, true, false, false, true, false, true, true, true, false, true, true, false, true, false, true, true, false, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, true, true, false, false, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false, true, true, true, true, false, false, false, false, false, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false, true, true, true, true, true, false, false, false, true, true, true, true, true, true, true, true, false, false, true, true, true, true, true, false, false, false, true, true, true, true, true, true, true, true, true, true, true, false, true, true, true, true, true, true, true, true, true, true, false, false, false, false, false, false, true, false, false, false, false, false, false, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, true, false, false, false, false, false, false, false, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, true, true, true, true, true, true, true, false, false, false, false, false, false, false, true, true, true, true, true, true, false, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, true, true, true, false, false, false, false, false, false, false, true, true, true, true, true, true, true, true, false, true, true, false, false, false, false, false, false, false, false, true, false, false, false, false, true, true, true, true, true, false, false, false, false, true, false, true, true, false, false, false, true, true, true, true, true, true, false, true, true, true, false, false, true, true, true, true, true, true, true, true, true, false, false, false, false};

   public abstract void Method13537();

   public TextureData(int var1, int var2) {
      this.Field2907 = var1;
      this.Field2908 = var2;
      this.Field2905 = true;
   }

   public int Method13538(int var1) {
      return -1;
   }

   public static TextureData Method13526(int var0) {
      if (Field2909 != null && var0 > 0 && var0 < Field2909.length) {
         if (!Client.Field12251 && Client.Field12483 == 2) {
            if (Field2909[var0] != null && Field2909[var0].Field2904) {
               return Field2909[var0];
            } else {
               Field2910.Method11960(4, var0);
               return null;
            }
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   public static void Method13527(int var0, OnDemandFetcher var1) {
      Field2909 = new TextureData[1419];
      Field2910 = var1;
   }

   public static void Method13528(int var0, byte[] var1) {
      if (var1 != null && var1.length >= 5) {
         Packet var5;
         int var2 = (var5 = new Packet(var1)).Method381();
         int var3 = var5.Method380();
         int var4 = var5.Method380();
         if (var2 == 0) {
            Field2909[var0] = new Class793(var3, var4, var5, false);
         } else if (var2 == 1) {
            Field2909[var0] = new Class792(var3, var4, var5);
         } else if (var2 == 2) {
            Field2909[var0] = new Class790(var3, var4, var5);
         } else if (var2 == 3) {
            Field2909[var0] = new Class791(var3, var4, var5);
         }

         if (Field2909[var0] != null) {
            Field2909[var0].Field2904 = true;
            return;
         }
      } else {
         System.out.println("error with: " + var0 + ", " + var1);
      }

   }

   public String toString() {
      return this.Field2907 + " X " + this.Field2908 + "\t" + (this.Field2905 ? "+opaque" : "-opaque") + "\t" + (this.Field2906 ? "+alpha" : "-alpha");
   }

   public static void Method13529() {
      if (Field2909 != null) {
         for(int var0 = 0; var0 < Field2909.length; ++var0) {
            Method13530(var0);
         }
      }

   }

   public static void Method13530(int var0) {
      if (Field2909[var0] != null) {
         Field2909[var0].Method13537();
         Field2909[var0] = null;
      }

   }

   public static int Method13531() {
      return Field2909.length;
   }
}
