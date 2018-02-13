package net.LWJGLClient.client.b.b.c;

import net.LWJGLClient.client.b.b.GraphicsDisplay;
import net.LWJGLClient.client.model.Client;

public final class Class426 extends ShaderData {
   private float Field3142 = 0.0F;
   private float Field3143 = 0.0F;

   public final void Method7537() {
      this.Field3142 = (float)((double)this.Field3142 + Client.Field12427 * 0.004999999888241291D);
      this.Field3143 = Client.Field12599 / 50.0F;
      if ((double)this.Field3142 > 3.141592653589793D) {
         this.Field3142 = (float)((double)this.Field3142 - 3.141592653589793D);
      }

      ShaderUtils.Method7385(this.Field3204);
      this.Method7400("PiTime", new float[]{this.Field3142});
      this.Method7400("Time", new float[]{this.Field3143});
      this.Method7400("FogEnabled", new float[]{Client.Field12107 ? 1.0F : 0.0F});
      this.Method7400("CameraPosition", new float[]{(float) Client.Field12341, (float)(-Client.Field12342), (float) Client.Field12343});
      this.Method7400("WaveYStrength", new float[]{0.0F});
      this.Method7400("WaveCosMult", new float[]{2.0F});
      this.Method7400("WaveUMovement", new float[]{0.53F});
      this.Method7400("WaveVMovement", new float[]{0.53F});
      this.Method7400("Brightness", new float[]{(float)Math.sqrt(Field3207)});
      this.Method7400("FresnelWeight", new float[]{0.15F});
      GraphicsDisplay.Method997().Method1035("[WaterShader]: use(" + this.Field3204 + ")");
   }

   public final int Method7538() {
      if (this.Field3204 == 0) {
         int var1 = ShaderUtils.loadShadow("water.vert");
         int var2 = ShaderUtils.loadShadow("water.frag");
         if (var1 == 0 || var2 == 0) {
            System.err.println("[VBORenderer]: error loading shadow shaders: " + var1 + ", " + var2);
            return 0;
         }

         this.Field3204 = ShaderUtils.Method7387(var1, var2);
      }

      return this.Field3204;
   }
}
