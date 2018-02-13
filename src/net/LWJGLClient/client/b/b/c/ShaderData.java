package net.LWJGLClient.client.b.b.c;

import java.util.HashMap;
import java.util.Map;

import net.LWJGLClient.client.b.Rasterizer;
import net.LWJGLClient.client.model.Client;
import org.lwjgl.opengl.GL20;

public abstract class ShaderData {
   protected int Field3204 = 0;
   private Map Field3205 = new HashMap();
   protected static double Field3206 = (double)Method7405();
   protected static double Field3207 = (double)Method7406();

   public final boolean Method7398() {
      return this.Field3204 > 0;
   }

   private int Method7399(String var1) {
      Integer var2;
      if ((var2 = (Integer)this.Field3205.get(var1)) == null) {
         var2 = GL20.glGetUniformLocation(this.Field3204, var1);
         this.Field3205.put(var1, var2);
      }

      return var2;
   }

   public final void Method7400(String var1, float... var2) {
      if (this.Field3204 <= 0) {
         throw new RuntimeException("Shader not loaded!");
      } else {
         ShaderUtils.Method7390(this.Field3204, this.Method7399(var1), var2);
      }
   }

   public final void Method7401(String var1, int... var2) {
      if (this.Field3204 <= 0) {
         throw new RuntimeException("Shader not loaded!");
      } else {
         ShaderUtils.Method7391(this.Field3204, this.Method7399(var1), var2);
      }
   }

   public int Method7538() {
      throw new RuntimeException("not implemented");
   }

   public final void Method7402() {
      if (this.Field3204 != 0) {
         ShaderUtils.Method7388(this.Field3204);
         ShaderUtils.Method7384();
         this.Field3204 = 0;
      }

   }

   public final int Method7403() {
      return this.Field3204;
   }

   public static void Method7404() {
      double var0;
      double var2 = (var0 = Field3206 - (double)Method7405()) * Client.Field12427 * 0.03D;
      if (Math.abs(var0) > 1.0E-4D) {
         Field3206 = (double)Math.round((Field3206 - var2) * 1000000.0D) / 1000000.0D;
      }

      double var4;
      double var6 = (var4 = Field3207 - (double)Method7406()) * Client.Field12427 * 0.03D;
      if (Math.abs(var4) > 1.0E-4D) {
         Field3207 = (double)Math.round((Field3207 - var6) * 1000000.0D) / 1000000.0D;
      }

   }

   private static float Method7405() {
      return Client.Method13398() != Client.Field12299 ? 0.35F : 0.275F;
   }

   protected static float Method7406() {
      float var0 = 2.4F + (float)Math.round(2.0D - Rasterizer.Method9431() * 2.0D * 10.0D) / 10.0F;
      int var1;
      if ((var1 = Client.Method13398()) != Client.Field12299 && var1 != 2228224) {
         var0 -= 0.3F;
      }

      return (float)Math.round(var0 * 100.0F) / 100.0F;
   }
}
