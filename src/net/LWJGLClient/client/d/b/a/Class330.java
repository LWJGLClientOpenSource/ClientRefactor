package net.LWJGLClient.client.d.b.a;

import net.LWJGLClient.client.model.Client;

public final class Class330 {
   private final int Field1978;
   private final int Field1979;
   private final int Field1980;
   private final String Field1981;
   private final String Field1982;
   private int Field1983;
   private int Field1984;
   private Class330 Field1985;

   private Class330(int var1, int var2, int var3, int var4, String var5, int var6, int var7) {
      this.Field1985 = null;
      this.Field1978 = var1;
      this.Field1979 = var2;
      this.Field1980 = var4;
      if (var5 != null) {
         String[] var8 = Client.Method13408(var5, 80, Client.plainFont);
         StringBuilder var10 = new StringBuilder();
         String[] var11 = var8;
         var4 = var8.length;

         for(var3 = 0; var3 < var4; ++var3) {
            String var9 = var11[var3];
            var10.append(var9 + "\n");
         }

         this.Field1981 = var10.toString();
         this.Field1982 = var10.toString().replaceAll("\n", "").replaceAll(" ", "").replaceAll("-", "").toLowerCase();
      } else {
         this.Field1981 = var5;
         this.Field1982 = var5;
      }

      this.Field1983 = 0;
      this.Field1984 = 0;
   }

   public Class330(int var1, int var2, int var3, int var4, String var5) {
      this(var1, var2, var3, var4, var5, 0, 0);
   }

   public Class330(int var1, int var2, int var3, String var4) {
      this(var1, var2, 0, var3, var4, 0, 0);
   }

   public Class330(int var1, int var2, int var3) {
      this(var1, var2, 0, var3, (String)null, 0, 0);
   }

   public final Class330 Method3405(int var1, int var2) {
      this.Field1983 = var1;
      this.Field1984 = var2;
      return this;
   }

   public final Class330 Method3406() {
      return this.Field1985;
   }

   public final Class330 Method3407(Class330 var1) {
      this.Field1985 = var1;
      return this;
   }

   public final int Method3408() {
      return this.Field1978;
   }

   public final int Method3409() {
      return this.Field1979;
   }

   public final int Method3410() {
      return this.Field1980;
   }

   public final String Method3411() {
      return this.Field1981;
   }

   public final String Method3412() {
      return this.Field1982;
   }

   public final int Method3413() {
      return this.Field1983;
   }

   public final int Method3414() {
      return this.Field1984;
   }
}
