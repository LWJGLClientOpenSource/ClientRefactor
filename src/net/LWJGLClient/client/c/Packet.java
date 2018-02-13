package net.LWJGLClient.client.c;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

import net.LWJGLClient.client.Signlink;
import net.LWJGLClient.client.e.a.Class778;
import net.LWJGLClient.client.model.c.Class171;
import net.LWJGLClient.client.model.c.Class178;

public final class Packet extends Class171 {
   public static final Charset Field1256 = Charset.forName("ISO-8859-1");
   private int Field1257 = -1;
   private int[] Field1258 = new int[10];
   public byte[] Field1259;
   public int pos;
   public int Field1261;
   private static final int[] Field1262 = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1};
   public Class778 Field1263;
   private static int Field1264;
   private static final Class178 Field1265 = new Class178();

   public static Packet Method375() {
      Class178 var0 = Field1265;
      synchronized(Field1265) {
         Packet var1 = null;
         if (Field1264 > 0) {
            --Field1264;
            var1 = (Packet)Field1265.Method1846();
         }

         if (var1 != null) {
            var1.pos = 0;
            return var1;
         }
      }

      Packet var3;
      (var3 = new Packet()).pos = 0;
      var3.Field1259 = new byte[65536];
      return var3;
   }

   public final int Method14446() {
      this.pos += 2;
      int var1;
      if ((var1 = (this.Field1259[this.pos - 2] & 255) << 8 | this.Field1259[this.pos - 1] & 255) > 32767) {
         var1 -= 65536;
      }

      return var1;
   }

   public final int Method377() {
      this.pos += 4;
      return (this.Field1259[this.pos - 4] & 255) << 24 | (this.Field1259[this.pos - 3] & 255) << 16 | (this.Field1259[this.pos - 2] & 255) << 8 | this.Field1259[this.pos - 1] & 255;
   }

   public final byte Method378() {
      return this.Field1259[this.pos++];
   }

   public final int Method14455() {
      this.pos += 3;
      return (this.Field1259[this.pos - 3] & 255) << 16 | (this.Field1259[this.pos - 2] & 255) << 8 | this.Field1259[this.pos - 1] & 255;
   }

   public final int Method380() {
      this.pos += 2;
      return (this.Field1259[this.pos - 2] & 255) << 8 | this.Field1259[this.pos - 1] & 255;
   }

   public final int Method381() {
      return this.Field1259[this.pos++] & 255;
   }

   private Packet() {
   }

   public final int Method382() {
      this.pos += 3;
      return (255 & this.Field1259[this.pos - 3] << 16) + (255 & this.Field1259[this.pos - 2] << 8) + (255 & this.Field1259[this.pos - 1]);
   }

   public Packet(byte[] var1) {
      this.Field1259 = var1;
      this.pos = 0;
   }

   public final int Method383() {
      this.pos += 2;
      int var1;
      if ((var1 = ((this.Field1259[this.pos - 2] & 255) << 8) + (this.Field1259[this.pos - 1] & 255)) > 60000) {
         var1 += -65535;
      }

      return var1;
   }

   public final void Method384(int var1) {
      this.Field1259[this.pos++] = (byte)var1;
   }

   public final void Method14445(int var1) {
      if (this.Field1259 != null && this.Field1263 != null) {
         this.Field1259[this.pos++] = (byte)(var1 + this.Field1263.Method13430());
      }
   }

   public final void Method386(int var1) {
      this.Field1259[this.pos++] = (byte)(254 + this.Field1263.Method13430());
      this.Method14470(0);
      if (this.Field1257 >= 9) {
         throw new RuntimeException("Stack overflow");
      } else {
         this.Field1258[++this.Field1257] = this.pos;
      }
   }

   public final void Method14474() {
      if (this.Field1257 < 0) {
         throw new RuntimeException("Stack empty");
      } else {
         int var2 = this.pos - this.Field1258[this.Field1257--];
         this.Field1259[this.pos - var2 - 2] = (byte)(var2 >> 8);
         this.Field1259[this.pos - var2 - 1] = (byte)var2;
      }
   }

   public final void Method388(int var1) {
      this.Field1259[this.pos++] = (byte)var1;
   }

   public final void Method14470(int var1) {
      this.Field1259[this.pos++] = (byte)(var1 >> 8);
      this.Field1259[this.pos++] = (byte)var1;
   }

   public final void Method390(int var1) {
      this.Field1259[this.pos++] = (byte)var1;
      this.Field1259[this.pos++] = (byte)(var1 >> 8);
   }

   public final void Method391(int var1) {
      this.Field1259[this.pos++] = -26;
      this.Field1259[this.pos++] = 50;
      this.Field1259[this.pos++] = 113;
   }

   public final void Method14480(int var1) {
      this.Field1259[this.pos++] = (byte)(var1 >> 24);
      this.Field1259[this.pos++] = (byte)(var1 >> 16);
      this.Field1259[this.pos++] = (byte)(var1 >> 8);
      this.Field1259[this.pos++] = (byte)var1;
   }

   public final void Method14488(int var1) {
      this.Field1259[this.pos++] = (byte)var1;
      this.Field1259[this.pos++] = (byte)(var1 >> 8);
      this.Field1259[this.pos++] = (byte)(var1 >> 16);
      this.Field1259[this.pos++] = (byte)(var1 >> 24);
   }

   public final void Method394(long var1) {
      try {
         this.Field1259[this.pos++] = (byte)((int)(var1 >> 56));
         this.Field1259[this.pos++] = (byte)((int)(var1 >> 48));
         this.Field1259[this.pos++] = (byte)((int)(var1 >> 40));
         this.Field1259[this.pos++] = (byte)((int)(var1 >> 32));
         this.Field1259[this.pos++] = (byte)((int)(var1 >> 24));
         this.Field1259[this.pos++] = (byte)((int)(var1 >> 16));
         this.Field1259[this.pos++] = (byte)((int)(var1 >> 8));
         this.Field1259[this.pos++] = (byte)((int)var1);
      } catch (RuntimeException var4) {
         Signlink.reporterror("14395, 5, " + var1 + ", " + var4.toString());
         throw new RuntimeException();
      }
   }

   public final void Method395(String var1) {
      System.arraycopy(var1.getBytes(Field1256), 0, this.Field1259, this.pos, var1.length());
      this.pos += var1.length();
      this.Field1259[this.pos++] = 10;
   }

   public final void Method396(byte[] var1, int var2, int var3) {
      for(var3 = 0; var3 < var2 + 0; ++var3) {
         this.Field1259[this.pos++] = var1[var3];
      }

   }

   public final void Method397(byte[] var1) {
      for(int var2 = 0; var2 < var1.length; ++var2) {
         this.Field1259[this.pos++] = var1[var2];
      }

   }

   public final void Method14489(int var1) {
      this.Field1259[this.pos - var1 - 1] = (byte)var1;
   }

   public final int g1() {
      return this.Field1259[this.pos++] & 255;
   }

   public final byte Method400() {
      return this.Field1259[this.pos++];
   }

   public final int g2() {
      this.pos += 2;
      return ((this.Field1259[this.pos - 2] & 255) << 8) + (this.Field1259[this.pos - 1] & 255);
   }

   public final int Method402() {
      this.pos += 2;
      int var1;
      if ((var1 = ((this.Field1259[this.pos - 2] & 255) << 8) + (this.Field1259[this.pos - 1] & 255)) > 32767) {
         var1 -= 65536;
      }

      return var1;
   }

   public final int Method403() {
      this.pos += 3;
      return ((this.Field1259[this.pos - 3] & 255) << 16) + ((this.Field1259[this.pos - 2] & 255) << 8) + (this.Field1259[this.pos - 1] & 255);
   }

   public final int Method404() {
      this.pos += 4;
      return ((this.Field1259[this.pos - 4] & 255) << 24) + ((this.Field1259[this.pos - 3] & 255) << 16) + ((this.Field1259[this.pos - 2] & 255) << 8) + (this.Field1259[this.pos - 1] & 255);
   }

   public final long Method405() {
      long var1 = (long)this.Method404() & 4294967295L;
      long var3 = (long)this.Method404() & 4294967295L;
      return (var1 << 32) + var3;
   }

   public final String Method406() {
      int var1 = this.pos;

      while(this.Field1259[this.pos++] != 10) {
         ;
      }

      return Field1256.decode(ByteBuffer.wrap(this.Field1259, var1, this.pos - var1 - 1)).toString();
   }

   public final byte[] Method407() {
      int var1 = this.pos;

      while(this.Field1259[this.pos++] != 10) {
         ;
      }

      byte[] var2 = new byte[this.pos - var1 - 1];
      System.arraycopy(this.Field1259, var1, var2, var1 - var1, this.pos - 1 - var1);
      return var2;
   }

   public final void Method408(int var1, int var2, byte[] var3) {
      for(var2 = 0; var2 < var1 + 0; ++var2) {
         var3[var2] = this.Field1259[this.pos++];
      }

   }

   public final void Method409(byte[] var1) {
      for(int var2 = 0; var2 < var1.length; ++var2) {
         var1[var2] = this.Field1259[this.pos++];
      }

   }

   public final void Method14514() {
      this.Field1261 = this.pos << 3;
   }

   public final int gbits(int var1) {
      int var2 = this.Field1261 >> 3;
      int var3 = 8 - (this.Field1261 & 7);
      int var4 = 0;

      for(this.Field1261 += var1; var1 > var3; var3 = 8) {
         var4 += (this.Field1259[var2++] & Field1262[var3]) << var1 - var3;
         var1 -= var3;
      }

      if (var1 == var3) {
         var4 += this.Field1259[var2] & Field1262[var3];
      } else {
         var4 += this.Field1259[var2] >> var3 - var1 & Field1262[var1];
      }

      return var4;
   }

   public final void Method14524() {
      this.pos = (this.Field1261 + 7) / 8;
   }

   public final int Method413() {
      return (this.Field1259[this.pos] & 255) < 128 ? this.g1() - 64 : this.g2() - '쀀';
   }

   public final int Method414() {
      return (this.Field1259[this.pos] & 255) < 128 ? this.g1() : this.g2() - '耀';
   }

   public final void Method14491(int var1) {
      this.Field1259[this.pos++] = (byte)(-var1);
   }

   public final void Method416(int var1) {
      this.Field1259[this.pos++] = (byte)(128 - var1);
   }

   public final int Method417() {
      return this.Field1259[this.pos++] - 128 & 255;
   }

   public final int ng1b() {
      return -this.Field1259[this.pos++] & 255;
   }

   public final int sg1() {
      return 128 - this.Field1259[this.pos++] & 255;
   }

   public final byte Method420() {
      return (byte)(-this.Field1259[this.pos++]);
   }

   public final void Method421(int var1) {
      this.Field1259[this.pos++] = (byte)var1;
      this.Field1259[this.pos++] = (byte)(var1 >> 8);
   }

   public final void Method422(int var1) {
      this.Field1259[this.pos++] = (byte)(var1 >> 8);
      this.Field1259[this.pos++] = (byte)(var1 + 128);
   }

   public final void Method14461(int var1) {
      this.Field1259[this.pos++] = (byte)(var1 + 128);
      this.Field1259[this.pos++] = (byte)(var1 >> 8);
   }

   public final int ig2() {
      this.pos += 2;
      return ((this.Field1259[this.pos - 1] & 255) << 8) + (this.Field1259[this.pos - 2] & 255);
   }

   public final int sg2() {
      this.pos += 2;
      return ((this.Field1259[this.pos - 2] & 255) << 8) + (this.Field1259[this.pos - 1] - 128 & 255);
   }

   public final int isg2() {
      this.pos += 2;
      return ((this.Field1259[this.pos - 1] & 255) << 8) + (this.Field1259[this.pos - 2] - 128 & 255);
   }

   public final int Method427() {
      this.pos += 2;
      int var1;
      if ((var1 = ((this.Field1259[this.pos - 1] & 255) << 8) + (this.Field1259[this.pos - 2] & 255)) > 32767) {
         var1 -= 65536;
      }

      return var1;
   }

   public final int Method428() {
      this.pos += 2;
      int var1;
      if ((var1 = ((this.Field1259[this.pos - 1] & 255) << 8) + (this.Field1259[this.pos - 2] - 128 & 255)) > 32767) {
         var1 -= 65536;
      }

      return var1;
   }

   public final int Method429() {
      this.pos += 4;
      return ((this.Field1259[this.pos - 2] & 255) << 24) + ((this.Field1259[this.pos - 1] & 255) << 16) + ((this.Field1259[this.pos - 4] & 255) << 8) + (this.Field1259[this.pos - 3] & 255);
   }

   public final int Method430() {
      this.pos += 4;
      return ((this.Field1259[this.pos - 3] & 255) << 24) + ((this.Field1259[this.pos - 4] & 255) << 16) + ((this.Field1259[this.pos - 1] & 255) << 8) + (this.Field1259[this.pos - 2] & 255);
   }

   public final void Method431(int var1, byte[] var2, int var3) {
      for(var1 = var3 + 0 - 1; var1 >= 0; --var1) {
         this.Field1259[this.pos++] = (byte)(var2[var1] + 128);
      }

   }
}
