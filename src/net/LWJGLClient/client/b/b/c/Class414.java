package net.LWJGLClient.client.b.b.c;

import org.lwjgl.opengl.GL11;

public final class Class414 extends ShaderData {
   public final int Method7538() {
      if (this.Field3204 == 0) {
         GL11.glEnable(34913);
         int var1 = ShaderUtils.loadShadow("particle.vert");
         int var2 = ShaderUtils.loadShadow("particle.frag");
         if (var1 == 0 || var2 == 0) {
            return 0;
         }

         this.Field3204 = ShaderUtils.Method7387(var1, var2);
         ShaderUtils.Method7389(this.Field3204, "InParticleData");
      }

      return this.Field3204;
   }

   public final void Method7537() {
      if (this.Field3204 > 0) {
         ShaderUtils.Method7385(this.Field3204);
         this.Method7400("Brightness", new float[]{Method7406()});
         this.Method7400("SizeMult", new float[]{1.0F});
      }

   }
}
