package net.LWJGLClient.client.d;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import net.LWJGLClient.client.a.e.JagexArchive;

public final class Class567 {
   private static Map Field527 = null;
   private static RandomAccessFile Field528 = null;

   private static long Method8808(int var0, int var1, int var2) {
      return (long)((var0 << 48) + (var1 << 32) + (var2 << 16) + 10);
   }

   private static int Method8809(int var0, int var1, int var2, int var3) {
      if (var3 != 10 && var3 != 11) {
         return 0;
      } else {
         long var4 = Method8808(var0, var1, var2);
         Integer var6;
         return (var6 = (Integer)Field527.get(var4)) == null ? 0 : var6;
      }
   }

   public static void Method8810(JagexArchive var0) {
      byte[] var6 = var0.readConfig("offsets.dat");
      Field527 = new HashMap();
      int var1 = 0;
      int var2 = var6.length;

      while(var1 < var2) {
         long var4 = (long)(((var6[var1++] & 255) << 56) + ((var6[var1++] & 255) << 48) + ((var6[var1++] & 255) << 40) + ((var6[var1++] & 255) << 32) + ((var6[var1++] & 255) << 24) + ((var6[var1++] & 255) << 16) + ((var6[var1++] & 255) << 8) + (var6[var1++] & 255));
         int var3 = ((var6[var1++] & 255) << 24) + ((var6[var1++] & 255) << 16) + ((var6[var1++] & 255) << 8) + (var6[var1++] & 255);
         Field527.put(var4, var3);
      }

   }

   public static void Method8811() {
      Iterator var1 = Field527.keySet().iterator();

      while(var1.hasNext()) {
         Long var0;
         Long var10000 = var0 = (Long)var1.next();
         int var2 = (Integer)Field527.get(var0);
         var0 = var10000;
         if (Field528 == null) {
            try {
               String var3 = System.getProperty("user.home");
               Field528 = new RandomAccessFile(var3 + "/Desktop/offsets.dat", "rw");
            } catch (Exception var5) {
               var5.printStackTrace();
            }
         }

         try {
            Field528.writeLong(var0);
            Field528.writeInt(var2);
         } catch (IOException var6) {
            var6.printStackTrace();
         }
      }

      try {
         Thread.sleep(100L);
         Field528.close();
         Thread.sleep(100L);
      } catch (Exception var4) {
         var4.printStackTrace();
      }

      Field528 = null;
   }

   private static void Method8812(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      if (var0 == var5 && var1 == var6 && var2 == var7 && var3 == var8) {
         long var9 = Method8808(var0, var1, var2);
         if (Field527.get(var9) != null) {
            Field527.remove(var9);
         }

         Field527.put(var9, var4);
      }

   }

   public static int Method8813(int var0, int var1, int var2, int var3, int var4) {
      if (var4 != 10 && var4 != 11) {
         return var3;
      } else {
         if (Field527 == null) {
            Field527 = new HashMap();
         }

         Method8812(40318, 3046, 3306, 10, 180, var0, var1, var2, var4);
         Method8812(40313, 3030, 3404, 10, -160, var0, var1, var2, var4);
         Method8812(var0, 2989, 3373, 10, -30, var0, var1, var2, var4);
         Method8812(38791, 2973, 3402, 10, -180, var0, var1, var2, var4);
         Method8812(var0, 2986, 3411, 10, -200, var0, var1, var2, var4);
         Method8812(var0, 2990, 3418, 10, -140, var0, var1, var2, var4);
         Method8812(var0, 2993, 3415, 10, -170, var0, var1, var2, var4);
         Method8812(38739, 2998, 3416, 10, -200, var0, var1, var2, var4);
         Method8812(var0, 3003, 3418, 10, -110, var0, var1, var2, var4);
         Method8812(var0, 3000, 3421, 10, -200, var0, var1, var2, var4);
         Method8812(38736, 3010, 3419, 10, -180, var0, var1, var2, var4);
         Method8812(var0, 3011, 3414, 10, 70, var0, var1, var2, var4);
         Method8812(38736, 3010, 3409, 10, -180, var0, var1, var2, var4);
         Method8812(var0, 3009, 3402, 10, -210, var0, var1, var2, var4);
         Method8812(var0, 3012, 3395, 10, -180, var0, var1, var2, var4);
         Method8812(var0, 3015, 3399, 10, -210, var0, var1, var2, var4);
         Method8812(40313, 3014, 3406, 10, -135, var0, var1, var2, var4);
         Method8812(38783, 3015, 3407, 10, 0, var0, var1, var2, var4);
         Method8812(var0, 3021, 3398, 10, -60, var0, var1, var2, var4);
         Method8812(var0, 3021, 3394, 10, -210, var0, var1, var2, var4);
         Method8812(38736, 3027, 3394, 10, -180, var0, var1, var2, var4);
         Method8812(var0, 3027, 3400, 10, -210, var0, var1, var2, var4);
         Method8812(var0, 3025, 3405, 10, -190, var0, var1, var2, var4);
         Method8812(var0, 3023, 3408, 10, -210, var0, var1, var2, var4);
         Method8812(38736, 3019, 3411, 10, -180, var0, var1, var2, var4);
         Method8812(var0, 3044, 3397, 10, 20, var0, var1, var2, var4);
         Method8812(var0, 3038, 3392, 10, -140, var0, var1, var2, var4);
         Method8812(var0, 3051, 3395, 10, -205, var0, var1, var2, var4);
         Method8812(var0, 3057, 3395, 10, -220, var0, var1, var2, var4);
         Method8812(38736, 3061, 3398, 10, -180, var0, var1, var2, var4);
         Method8812(38736, 3070, 3382, 11, -180, var0, var1, var2, var4);
         Method8812(var0, 3117, 3400, 10, -190, var0, var1, var2, var4);
         Method8812(38736, 3122, 3398, 10, -180, var0, var1, var2, var4);
         Method8812(var0, 3139, 3405, 10, 60, var0, var1, var2, var4);
         Method8812(var0, 3145, 3419, 10, 110, var0, var1, var2, var4);
         Method8812(var0, 3141, 3435, 10, 120, var0, var1, var2, var4);
         Method8812(var0, 3131, 3436, 10, 200, var0, var1, var2, var4);
         Method8812(var0, 3132, 3440, 10, 20, var0, var1, var2, var4);
         Method8812(var0, 3139, 3439, 10, 160, var0, var1, var2, var4);
         Method8812(var0, 3132, 3453, 10, 150, var0, var1, var2, var4);
         Method8812(var0, 3107, 3446, 10, -210, var0, var1, var2, var4);
         Method8812(var0, 3107, 3451, 10, -210, var0, var1, var2, var4);
         Method8812(var0, 3126, 3443, 10, 10, var0, var1, var2, var4);
         Method8812(var0, 3222, 3419, 10, -60, var0, var1, var2, var4);
         Method8812(var0, 3235, 3438, 10, -210, var0, var1, var2, var4);
         Method8812(var0, 3240, 3440, 10, -190, var0, var1, var2, var4);
         Method8812(var0, 2945, 3241, 10, 30, var0, var1, var2, var4);
         Method8812(var0, 2958, 3236, 10, 120, var0, var1, var2, var4);
         Method8812(var0, 2961, 3247, 10, 160, var0, var1, var2, var4);
         Method8812(var0, 2967, 3251, 10, 40, var0, var1, var2, var4);
         Method8812(var0, 2971, 3255, 10, 230, var0, var1, var2, var4);
         Method8812(var0, 2978, 3258, 10, -50, var0, var1, var2, var4);
         Method8812(var0, 2983, 3259, 10, 150, var0, var1, var2, var4);
         Method8812(var0, 2982, 3253, 10, -160, var0, var1, var2, var4);
         Method8812(var0, 2987, 3255, 10, -140, var0, var1, var2, var4);
         Method8812(var0, 2991, 3253, 10, -180, var0, var1, var2, var4);
         Method8812(var0, 2992, 3257, 10, 150, var0, var1, var2, var4);
         Method8812(var0, 2989, 3260, 10, 90, var0, var1, var2, var4);
         Method8812(var0, 2991, 3267, 10, 190, var0, var1, var2, var4);
         Method8812(var0, 2994, 3265, 10, 10, var0, var1, var2, var4);
         Method8812(var0, 2993, 3275, 10, -40, var0, var1, var2, var4);
         Method8812(var0, 3004, 3272, 10, 10, var0, var1, var2, var4);
         Method8812(var0, 3018, 3266, 10, 180, var0, var1, var2, var4);
         Method8812(var0, 3029, 3280, 10, 140, var0, var1, var2, var4);
         Method8812(var0, 3030, 3265, 10, 50, var0, var1, var2, var4);
         Method8812(var0, 3035, 3265, 10, 150, var0, var1, var2, var4);
         Method8812(var0, 3045, 3267, 10, 40, var0, var1, var2, var4);
         Method8812(var0, 3045, 3271, 10, 210, var0, var1, var2, var4);
         Method8812(var0, 3043, 3279, 10, 30, var0, var1, var2, var4);
         Method8812(var0, 3048, 3277, 10, 190, var0, var1, var2, var4);
         Method8812(var0, 3049, 3270, 10, 10, var0, var1, var2, var4);
         Method8812(var0, 3050, 3265, 10, 180, var0, var1, var2, var4);
         Method8812(var0, 3050, 3261, 10, 40, var0, var1, var2, var4);
         Method8812(var0, 3011, 3251, 10, 10, var0, var1, var2, var4);
         Method8812(var0, 2999, 3250, 10, -180, var0, var1, var2, var4);
         Method8812(var0, 2995, 3253, 10, -150, var0, var1, var2, var4);
         Method8812(var0, 3003, 3259, 10, -160, var0, var1, var2, var4);
         Method8812(var0, 2971, 3267, 10, 180, var0, var1, var2, var4);
         Method8812(var0, 2965, 3265, 10, 180, var0, var1, var2, var4);
         Method8812(var0, 2952, 3271, 10, 110, var0, var1, var2, var4);
         Method8812(var0, 2944, 3271, 10, 10, var0, var1, var2, var4);
         Method8812(var0, 2946, 3276, 10, 50, var0, var1, var2, var4);
         Method8812(var0, 2945, 3287, 10, 220, var0, var1, var2, var4);
         Method8812(var0, 2944, 3298, 10, 200, var0, var1, var2, var4);
         Method8812(var0, 2936, 3295, 10, 20, var0, var1, var2, var4);
         Method8812(var0, 2933, 3300, 10, 70, var0, var1, var2, var4);
         Method8812(var0, 2930, 3294, 10, 210, var0, var1, var2, var4);
         Method8812(var0, 2917, 3307, 10, 120, var0, var1, var2, var4);
         Method8812(var0, 2915, 3313, 10, 170, var0, var1, var2, var4);
         Method8812(var0, 2922, 3318, 10, -40, var0, var1, var2, var4);
         Method8812(var0, 2936, 3259, 10, 10, var0, var1, var2, var4);
         Method8812(var0, 2918, 3246, 10, -30, var0, var1, var2, var4);
         Method8812(var0, 2975, 3223, 10, -60, var0, var1, var2, var4);
         Method8812(var0, 2973, 3207, 10, 130, var0, var1, var2, var4);
         Method8812(var0, 2971, 3197, 10, -40, var0, var1, var2, var4);
         Method8812(var0, 3010, 3294, 10, 30, var0, var1, var2, var4);
         Method8812(var0, 3015, 3315, 10, 180, var0, var1, var2, var4);
         Method8812(var0, 3022, 3315, 10, 200, var0, var1, var2, var4);
         Method8812(var0, 3021, 3320, 10, 160, var0, var1, var2, var4);
         Method8812(var0, 3012, 3319, 10, 160, var0, var1, var2, var4);
         Method8812(var0, 3008, 3328, 10, -180, var0, var1, var2, var4);
         Method8812(var0, 3002, 3355, 10, 40, var0, var1, var2, var4);
         Method8812(var0, 2972, 3363, 10, -80, var0, var1, var2, var4);
         if (var0 == 35443) {
            var3 += 130;
         } else if (var0 == 38717) {
            var3 += 140;
         } else if (var0 == 38718) {
            var3 += 160;
         } else if (var0 == 38736) {
            if ((var1 != 2978 || var2 != 3389) && (var1 != 3222 || var2 != 3434)) {
               if (var1 == 3165 && var2 == 3383) {
                  var3 -= 180;
               } else if (var1 == 3282 && var2 == 3341) {
                  var3 -= 180;
               } else if (var1 == 3284 && var2 == 3336) {
                  var3 -= 180;
               } else if (var1 == 3299 && var2 == 3335) {
                  var3 -= 180;
               } else if (var1 == 3296 && var2 == 3338) {
                  var3 -= 180;
               } else if (var1 == 3292 && var2 == 3341) {
                  var3 -= 180;
               } else if (var1 == 3293 && var2 == 3346) {
                  var3 -= 180;
               } else if (var1 == 3300 && var2 == 3353) {
                  var3 -= 180;
               } else if (var1 == 3118 && var2 == 3227) {
                  var3 -= 180;
               } else if (var1 == 3114 && var2 == 3230) {
                  var3 -= 180;
               } else if (var1 == 3097 && var2 == 3214) {
                  var3 -= 180;
               } else if (var1 == 3114 && var2 == 3214) {
                  var3 -= 180;
               } else if (var1 == 3101 && var2 == 3241) {
                  var3 -= 180;
               } else if (var1 == 3114 && var2 == 3239) {
                  var3 -= 180;
               } else if (var1 == 3115 && var2 == 3247) {
                  var3 -= 180;
               } else if (var1 == 3116 && var2 == 3251) {
                  var3 -= 180;
               } else if (var1 == 3124 && var2 == 3255) {
                  var3 -= 180;
               } else if (var1 == 3129 && var2 == 3255) {
                  var3 -= 180;
               } else if (var1 == 3106 && var2 == 3247) {
                  var3 -= 180;
               }
            } else {
               var3 -= 180;
            }
         } else if (var0 == 38739) {
            var3 += 80;
            if (var1 == 3268 && var2 == 3507) {
               var3 -= 190;
            } else if (var1 == 3218 && var2 == 3205) {
               var3 -= 190;
            } else if (var1 == 3261 && var2 == 3249) {
               var3 -= 190;
            } else if (var1 == 3241 && var2 == 3253) {
               var3 -= 190;
            } else if (var1 == 3230 && var2 == 3247) {
               var3 -= 190;
            } else if (var1 == 3206 && var2 == 3263) {
               var3 -= 190;
            } else if (var1 == 3222 && var2 == 3271) {
               var3 -= 190;
            } else if (var1 == 3119 && var2 == 3256) {
               var3 -= 190;
            } else if (var1 == 3003 && var2 == 3247) {
               var3 -= 190;
            } else if (var1 == 2999 && var2 == 3255) {
               var3 -= 190;
            }
         } else if (var0 == 38758) {
            var3 -= 180;
            if (var1 == 3085 && var2 == 3480) {
               var3 += 180;
            } else if (var1 == 3085 && var2 == 3468) {
               var3 += 180;
            } else if (var1 == 3253 && var2 == 3364) {
               var3 += 180;
            } else if (var1 == 3041 && var2 == 3270) {
               var3 += 180;
            } else if (var1 == 2940 && var2 == 3232) {
               var3 += 180;
            } else if (var1 == 2934 && var2 == 3225) {
               var3 += 180;
            } else if (var1 == 2925 && var2 == 3228) {
               var3 += 180;
            } else if (var1 == 2933 && var2 == 3233) {
               var3 += 180;
            } else if (var1 == 3053 && var2 == 3269) {
               var3 += 180;
            } else if (var1 == 2998 && var2 == 3314) {
               var3 += 180;
            } else if (var1 == 3016 && var2 == 3321) {
               var3 += 180;
            }
         } else if (var0 == 38789) {
            var3 += 30;
            if (var1 == 3246 && var2 == 3515) {
               var3 -= 190;
            }
         } else if (var0 == 38791) {
            var3 -= 50;
            if (var1 == 3264 && var2 == 3504) {
               var3 -= 190;
            } else if (var1 == 3128 && var2 == 3427) {
               var3 += 50;
            }
         } else if (var0 == 38792) {
            var3 += 200;
            if (var1 == 2991 && var2 == 3226) {
               var3 += 40;
            }
         } else if (var0 == 38795) {
            var3 -= 20;
            if (var1 == 3209 && var2 == 3444) {
               var3 -= 80;
            }
         } else if (var0 == 38805) {
            var3 += 40;
         } else if (var0 == 39097) {
            var3 += 50;
            if (var1 == 3228 && var2 == 3462) {
               var3 -= 200;
            }

            if (var1 == 3240 && var2 == 3512) {
               var3 -= 200;
            }

            if (var1 == 3234 && var2 == 3510) {
               var3 -= 200;
            }
         } else if (var0 == 39121) {
            var3 += 165;
         } else if (var0 == 39137) {
            var3 += 160;
            if (var1 == 3072 && var2 == 3462) {
               var3 += 40;
            }
         } else if (var0 == 39138) {
            var3 += 200;
         } else if (var0 == 39166) {
            var3 += 20;
         } else if (var0 == 39168) {
            var3 += 200;
         } else if (var0 == 40294) {
            var3 += 200;
            if (var1 == 2941 && var2 == 3216) {
               var3 += 40;
            }
         } else if (var0 == 40295) {
            var3 += 40;
            if (var1 == 3228 && var2 == 3467) {
               var3 -= 50;
            } else if (var1 == 3246 && var2 == 3459) {
               var3 -= 50;
            } else if (var1 == 3136 && var2 == 3419) {
               var3 += 150;
            }
         } else if (var0 == 40296) {
            var3 += 200;
         } else if (var0 != 40297) {
            if (var0 == 40299) {
               var3 += 20;
            } else if (var0 == 40300) {
               if (var1 == 2998 && var2 == 3387 || var1 == 3223 && var2 == 3423) {
                  var3 -= 180;
               }
            } else if (var0 == 40301) {
               var3 += 190;
            } else if (var0 == 40302) {
               var3 += 200;
            } else if (var0 == 40303) {
               var3 -= 140;
               if (var1 == 3074 && var2 == 3467) {
                  var3 += 140;
               }
            } else if (var0 == 40312) {
               var3 += 200;
            } else if (var0 == 40313) {
               var3 += 40;
            } else if (var0 == 40320) {
               var3 += 10;
               if (var1 == 3214 && var2 == 3451) {
                  var3 -= 150;
               } else if (var1 == 3246 && var2 == 3495) {
                  var3 -= 150;
               }
            } else if (var0 == 40345) {
               var3 += 180;
            } else if (var0 == 40346) {
               var3 -= 120;
            } else if (var0 == 40347) {
               var3 += 150;
            } else if (var0 == 40348) {
               var3 += 10;
            } else if (var0 == 40349) {
               var3 += 200;
               if (var1 == 3222 && var2 == 3448) {
                  var3 -= 140;
               } else if (var1 == 3257 && var2 == 3508) {
                  var3 -= 190;
               }
            } else if (var0 == 49900) {
               var3 += 200;
               if (var1 == 3209 && var2 == 3452) {
                  var3 -= 150;
               }
            } else if (var0 == 54779) {
               if (var1 == 2973 && var2 == 3416) {
                  var3 += 165;
               } else if (var1 == 2978 && var2 == 3425) {
                  var3 += 165;
               }
            } else if (var0 >= 57281 && var0 <= 57291) {
               var3 = 0;
            }
         }

         Method8812(var0, 3167, 3168, 10, 180, var0, var1, var2, var4);
         Method8812(var0, 3164, 3173, 10, 40, var0, var1, var2, var4);
         Method8812(var0, 3165, 3171, 10, 8, var0, var1, var2, var4);
         Method8812(var0, 3174, 3168, 10, 40, var0, var1, var2, var4);
         Method8812(var0, 3172, 3169, 10, 8, var0, var1, var2, var4);
         Method8812(var0, 3224, 3334, 10, 125, var0, var1, var2, var4);
         Method8812(var0, 2901, 3715, 10, 120, var0, var1, var2, var4);
         Method8812(var0, 3097, 3532, 10, 150, var0, var1, var2, var4);
         Method8812(var0, 3096, 3537, 10, 30, var0, var1, var2, var4);
         Method8812(var0, 3092, 3524, 10, 30, var0, var1, var2, var4);
         Method8812(var0, 3064, 3526, 10, 20, var0, var1, var2, var4);
         Method8812(var0, 3053, 3525, 10, 20, var0, var1, var2, var4);
         Method8812(var0, 3050, 3529, 10, 60, var0, var1, var2, var4);
         Method8812(var0, 3054, 3529, 10, -110, var0, var1, var2, var4);
         Method8812(var0, 3046, 3530, 10, -210, var0, var1, var2, var4);
         Method8812(var0, 3042, 3528, 10, -60, var0, var1, var2, var4);
         Method8812(var0, 3076, 3516, 10, 180, var0, var1, var2, var4);
         Method8812(var0, 3097, 3516, 10, 40, var0, var1, var2, var4);
         Method8812(var0, 3093, 3516, 10, -10, var0, var1, var2, var4);
         Method8812(var0, 3073, 3482, 10, 40, var0, var1, var2, var4);
         Method8812(var0, 3154, 3458, 10, 105, var0, var1, var2, var4);
         Method8812(var0, 3177, 3453, 10, 20, var0, var1, var2, var4);
         Method8812(var0, 3172, 3459, 10, -55, var0, var1, var2, var4);
         Method8812(var0, 3170, 3442, 10, -60, var0, var1, var2, var4);
         Method8812(var0, 3174, 3431, 10, -80, var0, var1, var2, var4);
         Method8812(var0, 2867, 9570, 10, -6, var0, var1, var2, var4);
         Method8812(26421, 2922, 5275, 10, 40, var0, var1, var2, var4);
         int var5 = Method8809(1, var1, var2, 10);
         var0 = Method8809(var0, var1, var2, var4);
         return var3 + (var5 == 0 ? var0 : var5);
      }
   }
}
