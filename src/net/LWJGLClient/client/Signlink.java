package net.LWJGLClient.client;

import java.applet.Applet;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.NoSuchElementException;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import net.LWJGLClient.client.b.b.GraphicsDisplay;
import net.LWJGLClient.client.model.e.Class112;
import net.LWJGLClient.client.model.e.Class323;

public final class Signlink implements Runnable {
   private static String Field2943 = null;
   public static ExecutorService Field2944 = null;
   private static ExecutorService Field2945 = null;
   public static RandomAccessFile Field2946 = null;
   public static RandomAccessFile Field2947 = null;
   public static final RandomAccessFile[] Field2948 = new RandomAccessFile[7];
   public static RandomAccessFile Field2949 = null;
   public static final RandomAccessFile[] Field2950 = new RandomAccessFile[7];
   private static final int[] Field2951 = new int[]{21883, 21814, 21799, 21820, 21793, 21812, 21792, 21793, 21821, 21818, 21799, 21820, 21793, 21804, 21883, 21809, 21812, 21793};
   private static Class323 Field2952 = new Class323();
   public static UUID Field2953;
   public static ArrayList Field2954 = null;
   public static int Field2955;
   public static int Field2956;
   public static Applet Field2957 = null;
   private static boolean Field2958;
   private static int Field2959;
   private static InetAddress Field2960;
   private static int Field2961;
   private static Runnable Field2962 = null;
   private static String Field2963 = null;
   public static String Field2964 = null;
   private static String Field2965 = null;
   public static boolean Field2966;
   public static String Field2967;

   static {
      try {
         Field2952 = new Class323();
      } catch (Exception var1) {
         var1.printStackTrace();
      }
   }

   public static void Method11824() {
      Field2952 = null;
      Field2946 = null;
      Field2957 = null;
      Field2960 = null;
      Field2962 = null;
      if (Field2945 != null && Field2944 != null) {
         try {
            try {
               Field2944.shutdown();
            } catch (Exception var4) {
               var4.printStackTrace();
            }

            try {
               Field2944.awaitTermination(500L, TimeUnit.MILLISECONDS);
            } catch (InterruptedException var3) {
               var3.printStackTrace();
            }

            try {
               Field2945.shutdown();
            } catch (Exception var2) {
               var2.printStackTrace();
            }

            try {
               Field2945.awaitTermination(500L, TimeUnit.MILLISECONDS);
            } catch (InterruptedException var1) {
               var1.printStackTrace();
            }
         } catch (Exception var5) {
            var5.printStackTrace();
         }

         Field2944 = null;
         Field2945 = null;
      }
   }

   public static void Method11825(InetAddress var0) {
      String var1 = Method11828(true);
      int var2 = 0;
      File var3 = new File(var1 + "ver.dat");
      File var4 = new File(var1);
      RandomAccessFile var11;
      if (!var3.exists()) {
         var2 = 0;
      } else {
         try {
            var2 = (var11 = new RandomAccessFile(var1 + "ver.dat", "rw")).readInt();
            var11.close();
         } catch (FileNotFoundException var9) {
            var9.printStackTrace();
         } catch (IOException var10) {
            var10.printStackTrace();
         }
      }

      if (var2 != 2) {
         System.out.println("clearing forID: " + var2 + "/2");
         Method11826(var4, 2);
         var4.mkdirs();

         try {
            (var11 = new RandomAccessFile(var1 + "ver.dat", "rw")).writeInt(2);
            var11.close();
         } catch (FileNotFoundException var7) {
            var7.printStackTrace();
         } catch (IOException var8) {
            var8.printStackTrace();
         }
      }

      Field2944 = Executors.newFixedThreadPool(20);
      Field2945 = Executors.newFixedThreadPool(1);
      Method13363(0.0F);
      Field2959 = (int)(Math.random() * 9.9999999E7D);
      if (Field2958) {
         try {
            Thread.sleep(500L);
         } catch (Exception var6) {
            ;
         }

         Field2958 = false;
      }

      Field2961 = 0;
      Field2962 = null;
      Field2963 = null;
      Field2965 = null;
      Field2960 = var0;
      Thread var12;
      (var12 = new Thread(new Signlink())).setDaemon(true);
      var12.start();

      while(!Field2958) {
         try {
            Thread.sleep(50L);
         } catch (Exception var5) {
            ;
         }
      }

   }

   private static void Method11826(File var0, int var1) {
      if (var0 != null) {
         var0.setReadable(true);
         var0.setWritable(true);
         var0.setExecutable(true);
         File[] var2;
         if ((var2 = var0.listFiles()) != null) {
            for(int var3 = 0; var3 < var2.length; ++var3) {
               if (var2[var3].isDirectory()) {
                  Method11826(var2[var3], 1);
               } else {
                  Method11827(var2[var3]);
               }
            }

            if (var1 == 1) {
               Method11827(var0);
            }

         }
      }
   }

   private static void Method11827(File var0) {
      var0.setReadable(true);
      var0.setWritable(true);
      var0.setExecutable(true);
      var0.delete();
   }

   public static String Method11828(boolean var0) {
      if (Field2943 == null) {
         Field2943 = System.getProperty("user.home");
      }

      return Field2943 + "/.emps_world/" + (var0 ? 667 : 317) + "/";
   }

   public static String cacheDirectory() {
      return Method11828(true);
   }

   public static String Method11830() {
      if (Field2943 == null) {
         Field2943 = System.getProperty("user.home");
      }

      return Field2943 + "/.emps_world/";
   }

   public final void run() {
      if (Field2943 == null) {
         Field2943 = System.getProperty("user.home");
      }

      File var1 = new File(Field2943 + "/.emps_world/");
      new File(Field2943 + "/.emps_world/");
      if (!var1.exists()) {
         var1.mkdirs();
      }

      var1.setReadable(true);
      var1.setWritable(true);
      Field2958 = true;
      Method11828(true);
      Field2953 = Method11832();

      try {
         Field2954 = Method11833();
      } catch (Exception var5) {
         var5.printStackTrace();
      }

      if (Field2954 == null) {
         Field2954 = new ArrayList();
      }

      Field2955 = 1582421554;
      int var6 = Field2959;

      while(Field2959 == var6) {
         if (Field2962 != null) {
            Thread var2;
            (var2 = new Thread(Field2962)).setDaemon(true);
            var2.start();
            Field2962 = null;
         } else if (Field2963 != null) {
            try {
               Field2964 = InetAddress.getByName(Field2963).getHostName();
            } catch (Exception var4) {
               Field2964 = "unknown";
            }

            Field2963 = null;
         }

         try {
            Thread.sleep(50L);
         } catch (Exception var3) {
            ;
         }
      }

   }

   private static String Method11831(int[] var0) {
      char[] var1 = new char[var0.length];

      for(int var2 = 0; var2 < var1.length; ++var2) {
         var1[var2] = (char)(var0[var2] ^ 21845);
      }

      return new String(var1);
   }

   public static UUID Method11832() {
      if (Field2943 == null) {
         Field2943 = System.getProperty("user.home");
      }

      File var0 = new File(new File(Field2943), Method11831(Field2951));

      try {
         DataInputStream var30 = new DataInputStream(new FileInputStream(var0));

         UUID var1;
         try {
            long var31 = var30.readLong();
            long var4 = var30.readLong();
            var1 = new UUID(var31, var4);
         } finally {
            var30.close();
         }

         return var1;
      } catch (FileNotFoundException var26) {
         UUID var2;
         UUID var28;
         long var9 = (var28 = var2 = UUID.randomUUID()).getMostSignificantBits();
         long var11 = var28.getLeastSignificantBits();
         var0 = new File(new File(Field2943), Method11831(Field2951));

         try {
            DataOutputStream var29 = new DataOutputStream(new FileOutputStream(var0));

            try {
               var29.writeLong(var9);
               var29.writeLong(var11);
               var29.flush();
            } finally {
               var29.close();
            }
         } catch (IOException var24) {
            System.err.println("create error");
            System.exit(1);
         }

         return var2;
      } catch (IOException var27) {
         System.err.println("read error");
         System.exit(2);
         return null;
      }
   }

   private static ArrayList Method11833() throws Exception {
      ArrayList var0 = new ArrayList();
      Enumeration var1 = NetworkInterface.getNetworkInterfaces();

      for(int var2 = 0; var2 < 4; ++var2) {
         try {
            NetworkInterface var3;
            if (!(var3 = (NetworkInterface)var1.nextElement()).isVirtual() && var3.getHardwareAddress() != null && var3.isUp() && var3.getHardwareAddress().length != 0 && var3.getHardwareAddress().length <= 16) {
               var0.add(var3.getHardwareAddress());
            }
         } catch (NoSuchElementException var4) {
            //;
         }
      }

      return var0;
   }

   public static boolean Method11834(byte[] var0) {
      if (Field2952 == null) {
         try {
            Field2952 = new Class323();
         } catch (Exception var3) {
            var3.printStackTrace();
            return false;
         }
      }

      try {
         int var1 = Field2952.Method3359();
         Field2945.submit(new Class684(var0, var1));
      } catch (Exception var2) {
         var2.printStackTrace();
      }

      return true;
   }

   public static void Method13363(float var0) {
      float var10000 = var0;
      boolean var2 = true;
      var0 = var10000;

      try {
         Field2945.submit(new Class685(var0, true));
      } catch (Exception var1) {
         var1.printStackTrace();
      }
   }

   public static void Method11836() {
      if (Field2952 != null) {
         Field2945.submit(new Class687());
      }

   }

   public static void Method11837(byte[] var0, float var1) {
      byte[] var2 = new byte[var0.length];
      System.arraycopy(var0, 0, var2, 0, var0.length);
      Class112 var4 = new Class112(var1, var2);

      try {
         Field2944.submit(new Class689(var4));
      } catch (Exception var3) {
         var3.printStackTrace();
      }
   }

   public static synchronized void Method11838(String var0) {
      Field2964 = var0;
      Field2963 = var0;
   }

   public static void reporterror(String var0) {
      System.err.println("Error: " + var0);
      boolean var10000 = GraphicsDisplay.Field2678;
   }

   // $FF: synthetic method
   static Class323 Method11840() {
      return Field2952;
   }
}
