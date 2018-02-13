package net.LWJGLClient.client.b.b.b.a;

import java.util.ArrayList;
import java.util.List;
import net.LWJGLClient.client.model.Client;

public final class ModelVBO {
   public float Field1901 = 0.0F;
   public float[] Field1902 = null;
   public float[] Field1903 = null;
   public boolean Field1904 = true;
   public float Field1905 = 0.0F;
   public boolean Field1906 = false;
   public boolean Field1907 = false;
   public boolean Field1908 = false;
   public boolean Field1909 = false;
   public float Field1910 = 0.0F;
   public boolean Field1911 = true;
   private int Field1912;
   private boolean Field1913;
   private List Field1914 = new ArrayList();
   public long Field1915 = System.currentTimeMillis();
   public long Field1916 = 0L;
   private int Field1917;
   private int Field1918;
   private int Field1919;
   private int Field1920;
   private int Field1921;
   private long Field1922;
   public int Field1923;
   private int Field1924 = 0;
   private int Field1925 = 0;
   private int Field1926 = 4;

   public final int Method12370() {
      return this.Field1917;
   }

   public final int Method12371() {
      return this.Field1918;
   }

   public final int Method12372() {
      return this.Field1921;
   }

   public final int Method12373() {
      return this.Field1921 / 3;
   }

   public final long Method12374() {
      return this.Field1922;
   }

   public final int Method12375() {
      return this.Field1919;
   }

   public final void Method12376(int var1, int var2, int var3, int var4, long var5, boolean var7, int var8, boolean var9, List var10, int var11) {
      int var10001 = var1;
      boolean var20 = false;
      long var18 = var5;
      int var21 = var4;
      var20 = false;
      var4 = var3;
      var3 = var2;
      var2 = var10001;
      if (this.Field1917 != 0 && var2 != this.Field1917) {
         System.err.println("[ModelVBO]: vertexHandle memory leak: " + this.Field1917 + " --> " + var2);
      }

      if (this.Field1918 != 0 && var3 != this.Field1918) {
         System.err.println("[ModelVBO]: colorHandle memory leak: " + this.Field1918 + " --> " + var3);
      }

      if (this.Field1919 != 0 && var4 != this.Field1919) {
         System.err.println("[ModelVBO]: uvHandle memory leak: " + this.Field1919 + " --> " + var4);
      }

      if (this.Field1920 != 0 && this.Field1920 != 0) {
         System.err.println("[ModelVBO]: dataHandle memory leak: " + this.Field1920 + " --> 0");
      }

      this.Field1917 = var2;
      this.Field1918 = var3;
      this.Field1919 = var4;
      this.Field1920 = 0;
      this.Field1921 = var21;
      this.Field1922 = var18;
      this.Field1912 = var8;
      this.Field1913 = var9;
      if (var10 != null) {
         this.Field1914 = var10;
      }

   }

   public final void Method12377(int var1, int var2, int var3, int var4, long var5, boolean var7, int var8, boolean var9, List var10) {
      this.Method12376(var1, var2, var3, var4, var5, var7, var8, var9, var10, 0);
   }

   public final int Method12378() {
      return this.Field1912;
   }

   public final boolean Method12379() {
      return this.Field1913;
   }

   public final List Method12380() {
      return this.Field1914;
   }

   public final int Method12381() {
      return this.Field1924;
   }

   public final int Method12382() {
      return this.Field1925;
   }

   public ModelVBO(int var1) {
      this.Field1924 = 0;
      this.Field1925 = 0;
      this.Field1926 = 0;
   }

   public ModelVBO(int var1, int var2, boolean var3) {
      this.Field1924 = Client.Field12490 + var1 - Client.Field12494;
      this.Field1925 = Client.Field12491 + var2 - Client.Field12495;
   }

   public final int Method12383() {
      return this.Field1926;
   }
}
