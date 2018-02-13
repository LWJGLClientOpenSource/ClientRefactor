package net.LWJGLClient.client.b.b;

import org.lwjgl.glfw.GLFWKeyCallback;
import org.lwjgl.glfw.GLFW;


final class KeyPress extends GLFWKeyCallback {
   private long Field12053 = 0L;

   KeyPress(GraphicsDisplay var1) {
   }

   public final void invoke(long var1, int var3, int var4, int var5, int var6) {
      char var8 = (char)var3;
      if (var6 == 2 && var5 == 1) {
         String var9;
         if (var3 == 86) {
            if (System.currentTimeMillis() - this.Field12053 > 1000L) {
               this.Field12053 = System.currentTimeMillis();
               var9 = GLFW.glfwGetClipboardString(var1);
               GraphicsDisplay.Method1054().Method13405(var9);
            }
         } else if (var3 == 67 && (var9 = GraphicsDisplay.Method1054().Method13406()) != null) {
            GLFW.glfwSetClipboardString(var1, var9);
         }
      }

      byte var7;
      if (var3 != 257 && var3 != 335) {
         if (var3 == 258) {
            var7 = 9;
         } else if (var3 == 259) {
            var7 = 8;
         } else if (var3 != 341 && var3 != 345) {
            if (var3 == 264) {
               var7 = 40;
               var8 = 1;
            } else if (var3 == 265) {
               var7 = 38;
               var8 = 1;
            } else if (var3 == 263) {
               var7 = 37;
               var8 = 1;
            } else if (var3 == 262) {
               var7 = 39;
               var8 = 1;
            } else if (var3 == 290) {
               var7 = 112;
            } else if (var3 == 291) {
               var7 = 113;
            } else if (var3 == 292) {
               var7 = 114;
            } else if (var3 == 293) {
               var7 = 115;
            } else if (var3 == 294) {
               var7 = 116;
            } else if (var3 == 256) {
               var7 = 27;
            } else if (var3 == 266) {
               var7 = 33;
            } else if (var3 == 267) {
               var7 = 34;
            } else {
               var7 = 0;
            }
         } else {
            var7 = 5;
         }
      } else {
         var7 = 10;
      }

      if (var7 > 0) {
         if (var5 == 1 || var5 == 2) {
            //GraphicsDisplay.Method1062(var7, var8);
            return;
         }

         //GraphicsDisplay.(var7, var8);
      }

   }
}
