package net.LWJGLClient.client.b.b.f;

import java.util.Iterator;
import java.util.List;

import net.LWJGLClient.client.b.b.GraphicsDisplay;
import org.lwjgl.opengl.GL15;
import org.lwjgl.opengl.GL11;

public final class Class842 {
   public static int Field3811 = 0;
   public static int Field3812 = 1;
   public static int Field3813 = 2;
   public static int Field3814 = 3;
   public static int Field3815 = 4;
   private static String[] Field3816;
   private static int[] Field3817;
   private static int Field3818;

   static {
      Field3817 = new int[(Field3816 = new String[]{"Texture Atlas", "Letter", "Background", "Sprite", "Texture"}).length];
      Field3818 = 0;
   }

   public static int Method13975() {
      return Field3818;
   }

   public static int[] Method13976() {
      return Field3817;
   }

   public static int[] Method13977(int var0) {
      int[] var1 = new int[var0];

      for(int var2 = 0; var2 < var0; ++var2) {
         var1[var2] = GL15.glGenBuffers(); //TODO
         ++Field3818;
      }

      GraphicsDisplay.Method997().Method1035("[GLBufferManager]: genBuffers(" + var0 + ")");
      return var1;
   }

   public static void Method13978(List var0) {
      Iterator var2 = var0.iterator();

      while(var2.hasNext()) {
         int var1 = (Integer)var2.next();
         --Field3818;
         GL15.glDeleteBuffers(var1); //TODO
      }

      var0.clear();
   }

   public static int Method13979(int var0) {
      int var1 = var0;
      boolean var3 = true;
      int[] var4 = new int[1];

      for(int var2 = 0; var2 <= 0; ++var2) {
         var4[0] = GL11.glGenTextures();
         ++Field3817[var1];
      }

      GraphicsDisplay.Method997().Method1035("[GLBufferManager]: genTextureBuffers(1" + ")");
      return var0 = var4[0];
   }

   public static void Method13980(int var0, List var1) {
      for(Iterator var3 = var1.iterator(); var3.hasNext(); --Field3817[var0]) {
         GL11.glDeleteTextures((Integer)var3.next());
      }

      var1.clear();
   }

   public static void Method13981(int var0, int... var1) {
      int[] var3 = var1;

      for(int var2 = 0; var2 <= 0; ++var2) {
         int var4;
         GL11.glDeleteTextures(var4 = var3[0]);
         --Field3817[var0];
      }

   }
}
