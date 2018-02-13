package net.LWJGLClient.client.b.b;

import java.io.PrintWriter;
import java.io.StringWriter;

final class Class108 implements Runnable {
   // $FF: synthetic field
   private GraphicsDisplay Field2616;
   // $FF: synthetic field
   private final Exception Field2617;
   // $FF: synthetic field
   private final String Field2618;
   // $FF: synthetic field
   private final String Field2619;

   Class108(GraphicsDisplay var1, Exception var2, String var3, String var4) {
      super();
      this.Field2616 = var1;
      this.Field2617 = var2;
      this.Field2618 = var3;
      this.Field2619 = var4;
      //super();
   }

   public final void run() {
      String var1 = "";
      if (this.Field2617 != null) {
         StringWriter var2 = new StringWriter();
         this.Field2617.printStackTrace(new PrintWriter(var2));
         var1 = var2.toString();
      }

      this.Field2617.printStackTrace();
      var1 = "Could not initialize openGL.\nAutomatically switched to software renderer.\nPlease update your graphics card driver!!\n\nOS name: " + System.getProperty("os.name") + "\nOS version: " + System.getProperty("os.version") + "\nOpenGL version: " + this.Field2618 + "\nThread: " + Thread.currentThread().getName() + "\nType: " + this.Field2619 + "\nError: " + var1 + "\n\n" + "Click 'Ok' to continue playing with the software renderer.\n\n";
      GraphicsDisplay.Method1047(this.Field2616, "LWJGL Error", var1, 2);
   }
}
