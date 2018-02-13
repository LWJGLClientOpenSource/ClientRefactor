package net.LWJGLClient.client.model.d;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import net.LWJGLClient.client.a.a.Class511;
import net.LWJGLClient.client.a.a.Class518;
import net.LWJGLClient.client.a.a.Sequence;
import net.LWJGLClient.client.a.a.SpotAnim;
import net.LWJGLClient.client.model.Model;
import net.LWJGLClient.client.model.Client;

public class Mobile extends Class511 {
   public long Field1271 = -1L;
   public int Field1272 = 0;
   public int Field1273 = 0;
   private int hitsLoopCycle = 0;
   public boolean Field1275 = false;
   public int Field1276 = 0;
   public int Field1277 = -1;
   private List list = new ArrayList();
   public boolean Field1279;
   public boolean Field1280;
   public int[] pathX;
   public int[] pathY;
   public int interactingEntity;
   public int Field1284;
   public int degreesToTurn;
   public int runAnimIndex;
   public String textSpoken;
   public int height;
   public int Field1289;
   public int standAnimIndex;
   public int standTurnAnimIndex;
   public int Field1292;
   public List list1;
   public int anInt;
   public int anInt1527;
   public int Field1296;
   public float Field1297;
   public int gfxId;
   public int Field1299; //currentAnim
   public int Field1300; //anInt1522
   public float Field1301; //gfxDelay
   public int Field1302; //graphicHeight
   public int Field1303;
   public int pathLength;
   public int animation;
   public int Field1306;
   public int Field1307;
   public int Field1308;
   public float Field1309;
   public int animationDelay;
   public float Field1311;
   public int Field1312;
   public int Field1313;
   public int loopCycleStatus;
   public int Field1315;
   public int Field1316;
   public int textCycle;
   public int Field1318;
   public int Field1319;
   public int Field1320;
   public int boundDim;
   public boolean aBoolean1541;
   public int anInt1542;
   public int Field1324;
   public int Field1325;
   public int Field1326;
   public int Field1327;
   public int Field1328;
   public int Field1329;
   public int Field1330;
   public int boundExtentX;
   public int boundExtentY;
   public int Field1333;
   public boolean[] pathRun;
   public int walkAnimIndex;
   public int turn180AnimIndex;
   public int turn90CWAnimIndex;
   public int turn90CCWAnimIndex;

   public int Field1339;
   public int Field1340;
   public int Field1341;

   public final void Method9109(int var1, int var2, boolean var3) {
      this.Method9110(var1, var2, var3, true);
   }

   public final void Method9110(int var1, int var2, boolean var3, boolean var4) {
      if (this.animation != -1 && Sequence.anims[this.animation] != null && Sequence.anims[this.animation].priority == 1) {
         this.animation = -1;
      }

      if (!var3) {
         int var6 = var1 - this.pathX[0];
         int var5 = var2 - this.pathY[0];
         if (var6 >= -8 && var6 <= 8 && var5 >= -8 && var5 <= 8) {
            if (var4 && this.pathLength < 24) {
               ++this.pathLength;
            }

            for(var6 = this.pathLength; var6 > 0; --var6) {
               this.pathX[var6] = this.pathX[var6 - 1];
               this.pathY[var6] = this.pathY[var6 - 1];
               this.pathRun[var6] = this.pathRun[var6 - 1];
            }

            this.pathX[0] = var1;
            this.pathY[0] = var2;
            this.pathRun[0] = false;
            return;
         }
      }

      this.pathLength = 0;
      this.anInt1542 = 0;
      this.Field1284 = 0;
      this.pathX[0] = var1;
      this.pathY[0] = var2;
      this.boundExtentX = (this.pathX[0] << 7) + (this.boundDim << 6);
      this.boundExtentY = (this.pathY[0] << 7) + (this.boundDim << 6);
      this.Field1328 = 0;
      this.Field1329 = 0;
   }

   public final void resetPath() {
      this.pathLength = 0;
      this.anInt1542 = 0;
   }

   public final void updateHitData(int hitType, int hitDamage, int currentTime) {
      int var4 = hitType & 15;
      hitType >>= 4;
      if (Client.Field12077) {
         int var5 = this.hitsLoopCycle - currentTime;
         this.hitsLoopCycle = currentTime;
         if (var5 == 0) {
            var5 = 23;
            this.hitsLoopCycle = currentTime + 69;
         } else if (var5 < 0) {
            var5 = 0;
         }

         this.list1.add(new Class617(hitDamage, var4, currentTime + 120 + var5, hitType));
      } else {
         if (this.list1.size() >= 4) {
            this.list1.remove(0);
         }

         this.list1.add(new Class617(hitDamage, var4, currentTime + 70, hitType));
      }
   }

   public final void Method9113(boolean var1, int var2) {
      int var3 = this.pathX[0];
      int var4 = this.pathY[0];
      if (var2 == 0) {
         --var3;
         ++var4;
      }

      if (var2 == 1) {
         ++var4;
      }

      if (var2 == 2) {
         ++var3;
         ++var4;
      }

      if (var2 == 3) {
         --var3;
      }

      if (var2 == 4) {
         ++var3;
      }

      if (var2 == 5) {
         --var3;
         --var4;
      }

      if (var2 == 6) {
         --var4;
      }

      if (var2 == 7) {
         ++var3;
         --var4;
      }

      if (this.animation != -1 && Sequence.anims[this.animation] != null && Sequence.anims[this.animation].priority == 1) {
         this.animation = -1;
      }

      if (this.pathLength < 24) {
         ++this.pathLength;
      }

      for(var2 = this.pathLength; var2 > 0; --var2) {
         this.pathX[var2] = this.pathX[var2 - 1];
         this.pathY[var2] = this.pathY[var2 - 1];
         this.pathRun[var2] = this.pathRun[var2 - 1];
      }

      this.pathX[0] = var3;
      this.pathY[0] = var4;
      this.pathRun[0] = var1;
   }

   public boolean isVisible() {
      return false;
   }

   public Mobile() {
      new ArrayList();
      this.Field1279 = false;
      this.Field1280 = false;
      this.Field1306 = 0;
      this.boundDim = 1;
      this.pathX = new int[25];
      this.pathY = new int[25];
      this.interactingEntity = -1;
      this.degreesToTurn = 32;
      this.runAnimIndex = -1;
      this.height = 200;
      this.standAnimIndex = -1;
      this.standTurnAnimIndex = -1;
      this.anInt = -1;
      this.gfxId = -1;
      this.animation = -1;
      this.loopCycleStatus = -1000;
      this.textCycle = 100;
      this.boundDim = 1;
      this.aBoolean1541 = false;
      this.pathRun = new boolean[25];
      this.walkAnimIndex = -1;
      this.turn180AnimIndex = -1;
      this.turn90CWAnimIndex = -1;
      this.turn90CCWAnimIndex = -1;
      this.list1 = new LinkedList();
   }

   public final void Method9426() {
      Class595 var1;
      (var1 = new Class595()).Field1269 = this.Field1301;
      var1.Field1268 = this.Field1303;
      var1.Field1266 = this.gfxId;
      var1.Field1267 = this.Field1302;
      var1.Field1270 = this.Field1299;
      this.list.add(var1);
   }

   public final void Method9116(Collection var1) {
      this.list.removeAll(var1);
   }

   public final void Method14450() {
      this.list.clear();
   }

   public final boolean Method9118(Integer var1) {
      Iterator var3 = this.list.iterator();

      while(var3.hasNext()) {
         Class595 var2;
         if ((var2 = (Class595)var3.next()).Field1266 == var1) {
            this.list.remove(var2);
            return true;
         }
      }

      return false;
   }

   public final List Method9119() {
      return this.list;
   }

   public final void Method9120(Class595 var1) {
      this.Field1301 = var1.Field1269;
      this.Field1300 = Math.round(var1.Field1269);
      this.Field1303 = var1.Field1268;
      this.gfxId = var1.Field1266;
      this.Field1302 = var1.Field1267;
      this.Field1299 = var1.Field1270;
   }

   public final Model Method9121(int var1, int var2, long var3) {
      try {
         Class595 var7 = (Class595)this.list.get(var1);
         this.Method9120(var7);
         SpotAnim var8;
         if (this.gfxId >= 0 && this.Field1299 >= 0 && (var8 = SpotAnim.Field10094[this.gfxId]) != null) {
            Model var9;
            if ((var9 = var8.Method8315()) != null && var8 != null && var8.Field10098 != null) {
               int var5;
               if (!Sequence.Method8274(var5 = this.Field1299 >= 0 && this.Field1299 < var8.Field10098.frame2IDS.length ? var8.Field10098.frame2IDS[this.Field1299] : -1)) {
                  return null;
               }

               (var9 = new Model(true, false, Class518.Method8352(var5), var9, this.boundExtentX, this.boundExtentY, var3, 5)).Method14497(0, -this.Field1303, 0);
               boolean var10000 = var8.Field10092;
               var10000 = var8.Field10092;
               var9.Method14520(var5, Model.Field2798, true);
               var9.Field2752 = this.gfxId;
               var9.Field2855 = true;
               return var9;
            }

            return null;
         }
      } catch (Exception var6) {
         var6.printStackTrace();
      }

      return null;
   }
}
