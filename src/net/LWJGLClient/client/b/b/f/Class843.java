package net.LWJGLClient.client.b.b.f;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;
import java.util.concurrent.LinkedBlockingQueue;

import net.LWJGLClient.client.a.Class128;
import net.LWJGLClient.client.b.b.a.Class227;
import net.LWJGLClient.client.b.b.b.a.ModelVBO;
import net.LWJGLClient.client.b.b.b.a.a.Class647;
import net.LWJGLClient.client.b.b.b.a.b.ModelLoader;
import net.LWJGLClient.client.b.b.f.c.Class601;
import net.LWJGLClient.client.a.d.RgbImage;
import net.LWJGLClient.client.b.Rasterizer;
import net.LWJGLClient.client.b.b.GraphicsDisplay;
import net.LWJGLClient.client.b.b.a.Class231;
import net.LWJGLClient.client.b.b.b.a.a.Class650;
import net.LWJGLClient.client.b.b.b.a.b.Class147;
import net.LWJGLClient.client.b.b.f.c.Class598;
import net.LWJGLClient.client.model.Client;
import net.LWJGLClient.client.model.Model;
import net.LWJGLClient.client.model.f.TextureData;

public final class Class843 {
   public static boolean Field3754 = false;
   public static boolean Field3755 = false;
   private static List Field3756 = new LinkedList();
   public static Class227[][] Field3757 = null;
   public static Class227[][] Field3758 = null;
   public static TreeMap Field3759 = new TreeMap();
   public static Class227[] Field3760 = null;
   public static Class227[] Field3761 = null;
   public static Class231[] Field3762 = null;
   public static Class231[] Field3763 = null;
   private static int Field3764 = 0;
   public static Map Field3765;
   public static Class598 Field3766;
   public static Class598 Field3767;
   public static Class598 Field3768;
   public static Class598 Field3769;
   public static Class598 Field3770;
   private static Class598 Field3771;
   public static boolean Field3772;
   public static float Field3773;
   public static Class601 Field3774;
   public static List Field3775;
   private static Map Field3776;
   private static Map Field3777;
   public static Map Field3778;
   public static Map Field3779;
   public static Map Field3780;
   public static Map Field3781;
   public static Map Field3782;
   private static boolean Field3783;
   public static long currentTime;
   private static long Field3785;
   private static Queue Field3786;
   private static Queue Field3787;
   private static Map Field3788;
   public static Map Field3789;
   private static int[] Field3790;
   private static int[] Field3791;
   private static long Field3792;
   private static int[] Field3793;
   private static int[] Field3794;

   static {
      if ((Field3764 = GraphicsDisplay.screenResolutionWidth / 2) < 512) {
         Field3764 = 32;
      } else if (Field3764 > 4096) {
         Field3764 = 4096;
      }

      Method13985();
      Field3765 = new HashMap();
      Field3766 = new Class598(512, 32);
      Field3767 = new Class598(512, 64);
      Field3768 = new Class598(512, 128);
      new LinkedList();
      Field3769 = null;
      Field3770 = null;
      Field3771 = null;
      Field3772 = false;
      Field3774 = new Class601(512, 16);
      Field3775 = new ArrayList();
      Field3776 = new HashMap();
      Field3777 = new HashMap();
      Field3778 = new HashMap();
      Field3779 = new HashMap();
      Field3780 = new HashMap();
      Field3781 = new HashMap();
      Field3782 = new HashMap();
      Field3783 = false;
      currentTime = 0L;
      Field3785 = 180000L;
      Field3786 = new LinkedBlockingQueue();
      Field3787 = new LinkedBlockingQueue();
      Field3788 = new HashMap();
      Field3789 = new HashMap();
      Field3790 = new int[Rasterizer.Field9950];
      Field3791 = new int[Rasterizer.Field9950];
      Field3792 = System.currentTimeMillis();
      Field3793 = new int[Rasterizer.Field9950];
      Field3794 = new int[Rasterizer.Field9950];
   }

   private static void Method13982(Map var0, int var1) {
      Field3756.addAll(var0.values());
      Class842.Method13980(var1, Field3756);
      Field3756.clear();
      var0.clear();
   }

   public static void Method13983(int var0, int var1) {
      Class838.Field6955.Method10104(var0, var1);
      ModelLoader var10000 = Class838.Field6956;
   }

   public static void Method13984() {
   }

   public static void Method13985() {
      Field3757 = new Class227[Model.Field2805][Rasterizer.Field9950];
      Field3758 = new Class227[Model.Field2805][Rasterizer.Field9950];
      Field3760 = new Class227[Rasterizer.Field9950];
      Field3761 = new Class227[Rasterizer.Field9950];
      Field3762 = new Class231[Rasterizer.Field9950];
      Field3763 = new Class231[Rasterizer.Field9950];

      for(int var0 = 0; var0 < Model.Field2805; ++var0) {
         Field3757[var0] = new Class227[Rasterizer.Field9950];
         Field3758[var0] = new Class227[Rasterizer.Field9950];
      }

   }

   public static void Method13986() {
      Method13992();
      Method13990(false);
   }

   public static void Method13987() {
      Method14014();
      Method14016();
      Method14017();
      Method13992();
      Method13990(false);
   }

   public static void Method13988(boolean var0) {
      if (Field3770 != null) {
         Field3770.Method9124(true);
      }

   }

   public static void Method13989() {
      Method13990(true);
   }

   private static void Method13990(boolean var0) {
      if (var0) {
         Field3766.Method9124(var0);
         Field3767.Method9124(var0);
         Field3768.Method9124(var0);
         Field3774.Method9149(var0);
         Field3775.clear();
      }

   }

   public static long Method13991(int var0, int var1, int var2, int var3, long var4) {
      return var4 > 0L ? var4 : (long)((var0 << 48) + (var1 << 32) + (var2 << 16) + var3);
   }

   public static void Method13992() {
      Method13982(Field3765, Class842.Field3814);
   }

   public static void Method13993(List var0) {
      Iterator var4 = var0.iterator();

      while(var4.hasNext()) {
         long var1 = (Long)var4.next();
         Integer var3;
         if ((var3 = (Integer)Field3765.get(var1)) != null) {
            Field3765.remove(var1);
            Field3756.add(var3);
         }
      }

      Class842.Method13980(Class842.Field3814, Field3756);
      Field3756.clear();
   }

   public static boolean Method13994(long var0, int var2, int var3, int var4, int var5, int var6, RgbImage var7) {
      if (var5 == 88 && var6 == 60 && var0 == 8992214652205303814L) {
         return false;
      } else {
         Class598 var8 = null;
         if (var5 <= 32 && var6 <= 32) {
            var8 = Field3766;
         } else if (var5 <= 64 && var6 <= 64) {
            var8 = Field3767;
         } else if (var5 <= 128 && var6 <= 128) {
            var8 = Field3768;
         }

         return var8 == null ? false : var8.Method9128(var0, var2, var3, var4, var5, var6, var7);
      }
   }

   public static void Method13995() {
   }

   public static void Method13996(long var0, int var2, int var3, int var4, int var5, byte[] var6, int var7, int var8, boolean var9) {
      int[] var10;
      if ((var10 = Field3774.Method9147(var0, var6, var7, var8, var9)) != null) {
         Field3775.add(new Class650(var4, var5, var2, var3, var0, var10[0], var10[1], var7, var8));
      }

   }

   public static void Method13997(Long var0, ModelVBO var1) {
      if (Field3776.get(var0) == null) {
         Field3776.put(var0, var1);
      } else {
         System.err.println("[Cache]: duplicate model vbo: " + var1.Method12378() + ", " + var1.Method12372());
      }
   }

   public static Map Method13998() {
      return Field3776;
   }

   public static void Method13999(Long var0, ModelVBO var1) {
      if (Field3777.get(var0) == null) {
         Field3777.put(var0, var1);
      } else {
         System.err.println("[Cache]: duplicate floor vbo: " + var1.Method12378() + ", " + var1.Method12372());
      }
   }

   public static Map Method14000() {
      return Field3777;
   }

   private static void Method14001(long var0, int var2, int var3, int var4, int var5, int var6, int var7, ModelVBO var8, Map var9, int var10, float var11, float var12, float var13) {
      Class147 var14 = new Class147(var2, var3, var4, var5, var6, var7, var8, var10, var11, var12, var13);
      List var15;
      if ((var15 = (List)var9.get(var0)) == null) {
         LinkedList var16;
         (var16 = new LinkedList()).add(var14);
         var9.put(var0, var16);
      } else {
         var15.add(var14);
      }
   }

   public static void Method14002(long var0, int var2, int var3, int var4, int var5, int var6, int var7, ModelVBO var8, int var9) {
      Method14001(var0, var2, var3, var4, var5, var6, var7, var8, Field3782, var9, 1.0F, 1.0F, 1.0F);
   }

   public static void Method14003(long var0, int var2, int var3, int var4, int var5, int var6, int var7, ModelVBO var8, float var9, float var10, float var11) {
      Map var12 = var8.Method12379() ? Field3779 : Field3778;
      Method14001(var0, var2, var3, var4, var5, var6, var7, var8, var12, 0, var9, var10, var11);
   }

   public static void Method14004(long var0, int var2, int var3, int var4, int var5, int var6, int var7, ModelVBO var8, float var9, float var10, float var11) {
      Map var12 = Field3780;
      Method14001(var0, var2, var3, var4, var5, var6, var7, var8, var12, 0, var9, var10, var11);
   }

   public static void Method14005(long var0) {
      ModelVBO var2;
      if ((var2 = (ModelVBO)Field3776.get(var0)) != null) {
         var2.Field1906 = true;
      }

   }

   public static void Method14006(long var0, ModelVBO var2) {
      long var10000 = var0;
      Map var1 = Field3781;
      ModelVBO var10007 = var2;
      Map var11 = var1;
      ModelVBO var10 = var10007;
      boolean var9 = false;
      var9 = false;
      var9 = false;
      var9 = false;
      var9 = false;
      var9 = false;
      Method14001(var10000, 0, 0, 0, 0, 0, 0, var10, var11, 0, 1.0F, 1.0F, 1.0F);
   }

   public static void Method14007() {
      if (Field3783) {
         Field3783 = false;
         Iterator var1 = Field3777.values().iterator();

         while(var1.hasNext()) {
            ModelVBO var0;
            if (!(var0 = (ModelVBO)var1.next()).Field1908) {
               var0.Field1908 = true;
               if (var0.Method12370() != 0) {
                  Field3756.add(var0.Method12370());
               }

               if (var0.Method12371() != 0) {
                  Field3756.add(var0.Method12371());
               }

               if (var0.Method12375() != 0) {
                  Field3756.add(var0.Method12375());
               }
            }
         }

         Class842.Method13978(Field3756);
         Field3756.clear();
         Field3777.clear();
      }
   }

   public static void Method14008() {
      Field3783 = true;
   }

   public static void Method14009() {
      Entry var0;
      ModelVBO var1;
      long var2;
      while((var0 = (Entry)Field3786.poll()) != null) {
         var1 = (ModelVBO)var0.getValue();
         var2 = (Long)var0.getKey();
         Method14010(var1);
         Field3776.remove(var2);
      }

      while((var0 = (Entry)Field3787.poll()) != null) {
         var1 = (ModelVBO)var0.getValue();
         var2 = (Long)var0.getKey();
         Method14010(var1);
         Field3777.remove(var2);
      }

      Class842.Method13978(Field3756);
      Field3756.clear();
   }

   public static void Method14010(ModelVBO var0) {
      if (var0 != null && !var0.Field1908) {
         var0.Field1908 = true;
         if (var0.Method12370() != 0) {
            Field3756.add(var0.Method12370());
         }

         if (var0.Method12371() != 0) {
            Field3756.add(var0.Method12371());
         }

         if (var0.Method12375() != 0) {
            Field3756.add(var0.Method12375());
         }
      }

   }

   private static void Method14011(long var0, Set var2, boolean var3) {
      int var4 = 0;
      int var5 = Client.Field12117 / 2 + Client.Field12117 / 8 + (var3 ? 16 : 38);
      Iterator var6 = var2.iterator();

      while(var6.hasNext()) {
         Entry var8;
         ModelVBO var7 = (ModelVBO)(var8 = (Entry)var6.next()).getValue();
         var8.getKey();
         if (Field3755 || var7.Field1906 || var7.Field1916 > 0L && var0 - var7.Field1915 > var7.Field1916 || var0 - var7.Field1915 > Field3785 || !var7.Field1909 && Client.Method13205(var7.Method12381(), var7.Method12382()) > var5) {
            var7.Field1907 = true;
            if (var3) {
               Field3786.add(var8);
            } else {
               Field3787.add(var8);
            }

            if (!Field3755 && var4++ >= 500) {
               break;
            }
         }
      }

   }

   public static void Method14012() {
      long var0 = System.currentTimeMillis();
      Field3755 = true;
      Method14011(var0, Field3776.entrySet(), true);
      Method14011(var0, Field3777.entrySet(), false);
      Client.Method13262();
      Method14009();
      Field3776.clear();
      Field3777.clear();
   }

   public static void Method14013() {
      boolean var0 = false;
      if (Client.Field12219 == null && !Client.Field12251) {
         long var1 = System.currentTimeMillis();
         Field3785 = 600000L;
         if (var1 - currentTime > 500L || Field3754 || Field3755) {
            if (Field3754) {
               Field3783 = true;
            }

            Method14011(var1, Field3776.entrySet(), true);
            currentTime = var1;
            Field3754 = false;
            Field3755 = false;
         }

      }
   }

   public static void Method14014() {
      Method13982(Field3788, Class842.Field3813);
   }

   public static long Method14015(int var0, int var1, int var2) {
      return (long)((var2 << 63) + (var1 << 60) + (var0 << 32));
   }

   public static void Method14016() {
      Method13982(Field3789, Class842.Field3812);
   }

   public static void Method14017() {
      for(int var0 = 0; var0 < Field3790.length; ++var0) {
         if (Field3790[var0] != 0) {
            Field3756.add(Field3790[var0]);
         }

         Field3790[var0] = 0;
         Field3791[var0] = 0;
      }

      Class842.Method13980(Class842.Field3815, Field3756);
      Field3756.clear();
   }

   public static void Method14018() {
      if (System.currentTimeMillis() - Field3792 >= 1000L) {
         Field3792 = System.currentTimeMillis();
      }
   }

   public static int Method14019(int var0) {
      if (var0 < 0) {
         return 0;
      } else {
         int var1 = Field3790[var0];
         boolean var2 = true;
         if (var1 == 0) {
            var2 = false;
            TextureData var3 = TextureData.Method13526(var0);
            int[] var4;
            if ((var4 = Rasterizer.Method9429(var0)) == null || var3 == null) {
               return 0;
            }

            boolean var10000 = var3.Field2906;
            if (var1 != 0) {
               var1 = Class838.Method13938(true, var1, var4, 128, 128, 255, true, var0);
            } else {
               var1 = Class838.Method13937(var4, 128, 128, 255, true, var0);
            }

            Field3790[var0] = var1;
         }

         GraphicsDisplay.Method997().Method1035("error in loadTexture(" + var1 + ", " + var0 + ", " + var2 + ")");
         return var1;
      }
   }

   public static boolean Method14020(Class647 var0) {
      int[] var1;
      if ((var1 = Rasterizer.Method9429(var0.Method10072())) == null) {
         return false;
      } else {
         var0.Method10069().Method9146((long)var0.Method10072(), var1, 255, var0.Method10070(), var0.Method10071(), true, true, var0.Method10072(), var0.Method10073());
         return true;
      }
   }

   public static void Method14021() {
      for(int var0 = 0; var0 < Field3793.length; ++var0) {
         Field3794[var0] = Field3793[var0];
         Field3793[var0] = 0;
      }

   }

   public static void Method14022(int var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, float var10, float var11, float var12, int var13, int var14, int var15, int var16, int var17) {
      if (var0 == Rasterizer.Field9944) {
         var0 = Class128.Method1329(0, 0, var13);
      }

      Class231 var18;
      Class231 var19;
      if ((var18 = new Class231(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, 256)).Field3107 >= 255) {
         var19 = Field3762[var0];
         var18.Field3108 = var19;
         Field3762[var0] = var18;
      } else {
         var19 = Field3763[var0];
         var18.Field3108 = var19;
         Field3763[var0] = var18;
      }
   }

   public static void Method14023(float var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, int var9, int var10, int var11, int var12, int var13) {
      int var14 = var13;
      var13 = var12;
      var12 = var11;
      var11 = var10;
      var10 = var9;
      float var16 = var8;
      var8 = var7;
      var7 = var6;
      var6 = var5;
      var5 = var4;
      var4 = var3;
      var3 = var2;
      var2 = var1;
      var1 = var0;
      boolean var15 = false;
      Method14024(0, var1, var2, var3, var4, var5, var6, var7, var8, var16, var10, var11, var12, var13, -1000.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, var14);
   }

   public static void Method14024(int var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, int var10, int var11, int var12, int var13, float var14, float var15, float var16, float var17, float var18, float var19, int var20) {
      boolean var21 = var13 < 255;
      TextureData var22 = TextureData.Method13526(var0);
      boolean var10001 = var0 > 50 && var22 != null && var22.Field2906;
      boolean var10000 = var21 | (var0 > 50 && var22 != null && var22.Field2906);
      var10001 |= var21;
      var21 = var10000 | (var0 <= 50 && var0 > 0);
      if (var0 == 34 && var22 != null) {
         int var23 = var22.Field2908;
         float var27;
         if ((var27 = (float)(System.currentTimeMillis() / 50L % (long)var22.Field2908) / (float)var23) > 0.5F) {
            var27 = 1.0F - var27;
         }

         var17 *= 1.0F - var27;
         var18 *= 1.0F - var27;
         var19 *= 1.0F - var27;
      }

      Class227 var26;
      if (var14 != -1000.0F) {
         var26 = new Class227(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19);
      } else {
         var26 = new Class227(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13);
      }

      Class227 var28;
      if (!var21) {
         var28 = Field3757[var20][var0];
         var26.Field8900 = var28;
         Field3757[var20][var0] = var26;
      } else if (Model.Method14511()) {
         TreeMap var30 = Field3759;
         synchronized(Field3759) {
            int var29 = (int)(var8 / GraphicsDisplay.Field2687) + (var0 << 16);
            Class227 var25 = (Class227)Field3759.get(var29);
            var26.Field8900 = var25;
            Field3759.put(var29, var26);
         }
      } else {
         var28 = Field3758[var20][var0];
         var26.Field8900 = var28;
         Field3758[var20][var0] = var26;
      }
   }

   public static void Method14025(int var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, int var10, int var11, int var12, int var13, float var14, float var15, float var16, float var17, float var18, float var19) {
      if (var0 == Rasterizer.Field9944) {
         var0 = Class128.Method1329(0, 0, var10);
      }

      Class227 var20;
      if (var14 != -1000.0F) {
         var20 = new Class227(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19);
      } else {
         var20 = new Class227(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13);
      }

      Class227 var21;
      if (var20.Field8892 >= 255) {
         var21 = Field3760[var0];
         var20.Field8900 = var21;
         Field3760[var0] = var20;
      } else {
         var21 = Field3761[var0];
         var20.Field8900 = var21;
         Field3761[var0] = var20;
      }
   }

   public static void Method14026(int var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, int var9, int var10, int var11, int var12, int var13) {
      Method14025(var0, var1, var2, var3, var4, var4, var5, var6, var7, var8, var9, var10, var11, 256, -1000.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
   }
}
