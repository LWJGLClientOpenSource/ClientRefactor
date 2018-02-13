package net.LWJGLClient.client.model.a.d;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;

public class ParticleDefinition {
   private static Map Field3208 = new HashMap();
   public static ParticleDefinition[] Field3209 = null;
   private static int Field3210 = 0;
   public static final Random Field3211 = new Random(System.currentTimeMillis());
   private float Field3212 = 100.0F;
   private float Field3213 = 100.0F;
   private int Field3214 = -1;
   private int Field3215 = -1;
   private Class453 Field3216;
   private Class453 Field3217;
   private float Field3218;
   private static int Field3219;
   private float Field3220;
   private float Field3221;
   private float Field3222;
   private int Field3223;
   private Class453 Field3224;
   private Class455 Field3225;
   private float Field3226;
   private int Field3227;

   static {
      boolean var0 = true;
      Field3219 = 2048;
      Field3219 = 2048;
   }

   public static void Method7790() {
      new Class453(0.0F, 0.0F, 3.0F);
      new Class453(0.0F, 0.0F, 6.0F);
      Class453 var0 = new Class453(0.0F, 0.0F, -3.0F);
      Class453 var1 = new Class453(0.0F, 0.0F, -6.0F);
      new Class453(0.0F, -3.0F, 0.0F);
      Class453 var2 = new Class453(0.0F, 3.0F, 0.0F);
      Field3208.put("tormented_demon", new Class447(var0));
      Field3208.put("wildy_wyrm", new Class440(var1));
      Field3208.put("comp_cape", new Class437());
      Field3208.put("max_cape_r", new Class439());
      Field3208.put("max_cape_l", new Class458());
      Field3208.put("max_cape_m", new Class459());
      Field3208.put("120_cape", new Class456());
      Field3208.put("ele_arrow", new Class442(var2));
      Field3208.put("abyssal_bow", new Class457());
      Field3208.put("abyssal_staff", new Class447());
      var0 = new Class453(0.0F, 0.0F, -10.0F);
      var1 = new Class453(0.0F, 0.0F, 20.0F);
      Field3208.put("ele_ice_staff", new Class447(var0, var1));
      Field3208.put("ele_fire_staff", new Class440(var0, var1));
      Field3208.put("ele_nature_staff", new Class442(var0, var1));
      Field3208.put("ele_thunder_staff", new Class437(var0, var1));
      var0 = new Class453(0.0F, 0.0F, 0.0F);
      var1 = new Class453(0.0F, 0.0F, 7.5F);
      Field3208.put("ele_ice_whip", new Class439(var0, var1));
      Field3208.put("ele_fire_whip", new Class458(var0, var1));
      Field3208.put("ele_nature_whip", new Class459(var0, var1));
      Field3208.put("ele_thunder_whip", new Class456(var0, var1));
      Field3208.put("aby_cannon", new Class440());
      Field3208.put("incense_burner", new Class442());
      Field3209 = new ParticleDefinition[Field3208.size() + 200];
      Field3210 = 0;

      for(Iterator var4 = Field3208.values().iterator(); var4.hasNext(); ++Field3210) {
         ParticleDefinition var3;
         (var3 = (ParticleDefinition)var4.next()).Field3227 = Field3210;
         Field3209[Field3210] = var3;
      }

   }

   public static int Method7791(String var0) {
      return Method7792(var0, -1);
   }

   public static int Method7792(String var0, int var1) {
      while(var1 != -1) {
         String var2 = var0 + "_" + var1;
         if (Field3208.get(var2) == null) {
            ParticleDefinition var3;
            (var3 = new ParticleDefinition((ParticleDefinition)Field3208.get(var0))).Method7812(var1);
            var3.Field3227 = Field3210;
            Field3209[Field3210] = var3;
            ++Field3210;
            Field3208.put(var2, var3);
         }

         var1 = -1;
         var0 = var2;
      }

      ParticleDefinition var4;
      if ((var4 = (ParticleDefinition)Field3208.get(var0)) == null) {
         System.err.println("[ParticleDefinition]: unknown particle: " + var0);
         return -1;
      } else {
         return var4.Field3227;
      }
   }

   public final Class453 Method7793() {
      return this.Field3224;
   }

   public final void Method7794(Class453 var1) {
      this.Field3224 = var1;
   }

   public final float Method7795() {
      return this.Field3221;
   }

   public final void Method7796(float var1) {
      this.Field3221 = var1;
   }

   public final float Method7797() {
      return this.Field3222;
   }

   public final void Method7798(float var1) {
      this.Field3222 = 0.1F;
   }

   public final Class455 Method7799() {
      return this.Field3225;
   }

   private static float Method7800(float var0, float var1) {
      var1 = var1 - var0 + 1.0F;
      return (float)((int)(Math.random() * (double)var1)) + var0;
   }

   public final float Method7801() {
      return this.Field3220;
   }

   public final void Method7802(int var1) {
      this.Field3223 = var1;
   }

   public final int Method7803() {
      return this.Field3223;
   }

   public final void Method7804(float var1) {
      this.Field3220 = var1;
   }

   public static int Method7805() {
      return Field3219;
   }

   public final float Method7806() {
      return this.Field3212;
   }

   public final void Method7807(float var1) {
      this.Field3212 = var1;
   }

   public final float Method7808() {
      return this.Field3213;
   }

   public final void Method7809(float var1) {
      this.Field3212 = var1;
      this.Field3213 = var1;
   }

   public final void Method7810(float var1) {
      this.Field3213 = var1;
   }

   public final int Method7811() {
      return this.Field3214;
   }

   public final void Method7812(int var1) {
      this.Field3214 = var1;
      this.Field3215 = var1;
   }

   public final void Method7813(int var1) {
      this.Field3214 = var1;
   }

   public final Class453 Method7814(int var1) {
      float var2 = this.Field3226;
      return new Class453(this.Field3216.Method7833() + Method7800(-var2, var2), this.Field3216.Method7834() + Method7800(-var2, var2), this.Field3216.Method7835() + Method7800(-var2, var2));
   }

   public ParticleDefinition() {
      this.Field3216 = Class453.Field3082;
      this.Field3217 = Class453.Field3082;
      this.Field3218 = 1.0F;
      this.Field3220 = 1.0F;
      this.Field3221 = 1.0F;
      this.Field3222 = 0.05F;
      this.Field3223 = 848;
      this.Field3225 = new Class454(Class453.Field3082);
      this.Field3226 = 1.5F;
      this.Field3227 = 0;
   }

   private ParticleDefinition(ParticleDefinition var1) {
      this.Field3216 = Class453.Field3082;
      this.Field3217 = Class453.Field3082;
      this.Field3218 = 1.0F;
      this.Field3220 = 1.0F;
      this.Field3221 = 1.0F;
      this.Field3222 = 0.05F;
      this.Field3223 = 848;
      this.Field3225 = new Class454(Class453.Field3082);
      this.Field3226 = 1.5F;
      this.Field3227 = 0;
      this.Field3213 = var1.Field3213;
      this.Field3212 = var1.Field3212;
      this.Field3222 = var1.Field3222;
      this.Field3221 = var1.Field3221;
      this.Field3215 = var1.Field3215;
      this.Field3214 = var1.Field3214;
      this.Field3217 = new Class453(var1.Field3217);
      this.Field3216 = new Class453(var1.Field3216);
      this.Field3224 = new Class453(var1.Field3224);
      this.Field3218 = var1.Field3218;
      this.Field3226 = var1.Field3226;
      this.Field3220 = var1.Field3220;
      this.Field3225 = var1.Field3225;
      this.Field3223 = var1.Field3223;
   }

   public final void Method7815(float var1) {
      this.Field3226 = var1;
   }

   public final void Method7816(Class453 var1) {
      this.Field3216 = var1;
      this.Field3217 = var1;
   }

   public final float Method7817() {
      return this.Field3218;
   }

   public final void Method7818(float var1) {
      this.Field3218 = var1;
   }
}
