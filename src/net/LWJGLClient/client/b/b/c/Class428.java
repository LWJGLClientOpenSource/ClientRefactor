package net.LWJGLClient.client.b.b.c;

import net.LWJGLClient.client.b.b.GraphicsDisplay;
import net.LWJGLClient.client.b.b.b.Class745;
import net.LWJGLClient.client.b.b.f.a.Class536;
import net.LWJGLClient.client.model.Client;
import org.lwjgl.opengl.GL11;

public final class Class428 extends ShaderData {
   private static Class536 Field3155 = new Class536();

   public final void Method7537() {
      float var1 = Client.Field12069 ? (float) Client.Field12070 : 0.0F;
      float var2 = Client.Field12107 ? 1.0F : 0.0F;
      float var3 = 1.0F;
      float var4 = 1.0F;
      if (Client.Field12070 >= 4096) {
         var4 = 0.8F;
         var3 = 0.4F;
      } else if (Client.Field12070 >= 2048) {
         var4 = 0.8F;
         var3 = 0.4F;
      } else if (Client.Field12070 >= 1024) {
         var4 = 0.4F;
         var3 = 0.4F;
      }

      if (Client.Field12070 <= 4096) {
         var4 = var3;
      }

      float var5 = (float) Client.Field12567;
      float var6 = (float) Client.Field12569;
      float var7 = (float) Client.Field12568;
      ShaderUtils.Method7385(this.Field3204);
      //Field3155
      this.Method7401("tex_sampler", new int[]{0});
      this.Method7401("shadow_sampler", new int[]{1});
      this.Method7401("floor_sampler", new int[]{2});
      this.Method7401("ssao_sampler", new int[]{3});
      this.Method7400("ShadowFadeStart", new float[]{Class745.Method12489()});
      this.Method7400("ShadowResolution", new float[]{var1});
      this.Method7400("ShadowDensity", new float[]{(float)Field3206});
      this.Method7400("FogEnabled", new float[]{var2});
      this.Method7400("ShadowQualityStep", new float[]{var3});
      this.Method7400("ShadowQualityLoop", new float[]{var4});
      this.Method7400("FloorBlending", new float[]{0.0F});
      this.Method7400("Brightness", new float[]{(float)Field3207});
      this.Method7400("AlphaMult", new float[]{1.0F});
      this.Method7400("Player", new float[]{var5, var6, var7});
      GraphicsDisplay.Method997().Method1035("[GameShadowShader]: use(" + this.Field3204 + ")");
   }

   public final int Method7538() {
      if (this.Field3204 == 0) {
         GL11.glEnable(34370);
         int var1 = ShaderUtils.loadShadow("shadow.vert");
         int var2 = ShaderUtils.loadShadow("shadow.frag");
         if (var1 == 0 || var2 == 0) {
            System.err.println("[VBORenderer]: error loading shadow shaders: " + var1 + ", " + var2);
            return 0;
         }

         this.Field3204 = ShaderUtils.Method7387(var1, var2);
      }

      return this.Field3204;
   }
}
