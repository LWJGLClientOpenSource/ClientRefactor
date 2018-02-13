package net.LWJGLClient.client.model;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.FlowLayout;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Map.Entry;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import net.LWJGLClient.client.Signlink;

public class Class867 {
   private final String Field2640;
   public byte[] Field2641;
   private long Field2642 = 0L;

   public final boolean Method14536() {
      long var2;
      if ((var2 = (new File(this.Field2640)).lastModified()) != this.Field2642) {
         this.Field2642 = var2;
         return true;
      } else {
         return false;
      }
   }

   public Class867(int var1, String var2) {
      this.Field2640 = var2;
      this.Method14536();
   }

   public final String Method14537() {
      return this.Field2640;
   }

   public static void Method14538(boolean var0) {
      try {
         int var10000;
         label28: {
            String var1 = System.getProperty("user.home");
            File var2;
            if ((var2 = new File(var1, ".collectdata")).exists()) {
               Scanner var3;
               if ((var3 = new Scanner(var2)).hasNextLine()) {
                  String var4 = var3.nextLine();
                  var3.close();
                  var10000 = var4.equals("true") ? 1 : 0;
                  break label28;
               }

               var3.close();
            }

            var10000 = -1;
         }

         int var7 = var10000;
         if (var10000 == -1) {
            JFrame var8;
            (var8 = new JFrame("Emps-World")).setAlwaysOnTop(true);
            var8.toFront();
            var8.setLayout(new BorderLayout());
            var8.add(new JLabel("Allow Emps-World to collect data about your computer hardware?"), "North");
            JPanel var9;
            (var9 = new JPanel()).setLayout(new FlowLayout());
            JButton var10;
            (var10 = new JButton("Yes")).addMouseListener(new Class861(var8, var0));
            JButton var6;
            (var6 = new JButton("No")).addMouseListener(new Class860(var8));
            var9.add(var10, "West");
            var9.add(var6, "East");
            var8.add(var9, "Center");
            var8.pack();
            var8.setLocationRelativeTo((Component)null);
            var8.setVisible(true);
            return;
         }

         if (var7 == 1) {
            Method14540();
            return;
         }
      } catch (Exception var5) {
         var5.printStackTrace();
      }

   }

   public static void Method14539(boolean var0) throws Exception {
      String var1 = System.getProperty("user.home");
      File var2 = new File(var1, ".collectdata");
      FileOutputStream var3;
      (var3 = new FileOutputStream(var2)).write((var0 ? "true" : "false").getBytes(StandardCharsets.UTF_8));
      var3.close();
   }

   public static void Method14540() {
      HashMap var0;
      (var0 = new HashMap()).put("uuid", "" + Signlink.Method11832());
      var0.put("cpu_cores", "" + Runtime.getRuntime().availableProcessors());
      var0.put("java_version", System.getProperty("java.version"));
      var0.put("java_memory_free", "" + Runtime.getRuntime().freeMemory());
      var0.put("java_memory_total", "" + Runtime.getRuntime().totalMemory());
      var0.put("java_memory_max", "" + Runtime.getRuntime().maxMemory());
      var0.put("os_arch", System.getProperty("os.arch"));
      var0.put("os_name", System.getProperty("os.name"));
      var0.put("os_version", System.getProperty("os.version"));

      try {
         var0.put("disk_capacity", "" + (new File("/")).getTotalSpace());
      } catch (Exception var5) {
         var5.printStackTrace();
      }

      try {
         HttpURLConnection var1;
         (var1 = (HttpURLConnection)(new URL("http://emps-world.net/snoop.php")).openConnection()).setRequestMethod("POST");
         var1.setRequestProperty("User-Agent", "emps-world-client");
         var1.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
         String var2 = "";
         Iterator var7 = var0.entrySet().iterator();

         while(var7.hasNext()) {
            try {
               Entry var3;
               if ((var3 = (Entry)var7.next()) != null && var3.getKey() != null && var3.getValue() != null) {
                  var2 = var2 + (String)var3.getKey() + "=" + ((String)var3.getValue()).replace("=", "[eq]") + (var7.hasNext() ? "&" : "");
               }
            } catch (Exception var4) {
               var4.printStackTrace();
            }
         }

         byte[] var12 = var2.getBytes(StandardCharsets.UTF_8);
         var1.setRequestProperty("Content-Length", "" + var12.length);
         var1.setDoOutput(true);
         OutputStream var8;
         (var8 = var1.getOutputStream()).write(var12);
         var8.flush();
         var8.close();
         BufferedReader var9 = new BufferedReader(new InputStreamReader(var1.getInputStream()));
         StringBuffer var11 = new StringBuffer();

         String var10;
         while((var10 = var9.readLine()) != null) {
            var11.append(var10);
         }

         var9.close();
         System.out.println(var11.toString());
      } catch (Exception var6) {
         var6.printStackTrace();
      }
   }
}
