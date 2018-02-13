package net.LWJGLClient.client.e.a;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

public final class Class773 {
   private static Charset Field2968 = Charset.forName("UTF-8");
   private PrivateKey Field2969;
   private PublicKey Field2970;
   private Cipher Field2971;
   private Cipher Field2972;
   private boolean Field2973;

   public final boolean Method13190() {
      return this.Field2973;
   }

   public Class773() {
      this.Field2969 = null;
      this.Field2970 = null;
      this.Field2971 = null;
      this.Field2972 = null;
      this.Field2973 = false;

      try {
         this.Field2971 = Cipher.getInstance("RSA");
         this.Field2972 = Cipher.getInstance("RSA");
      } catch (NoSuchAlgorithmException var2) {
         var2.printStackTrace();
      } catch (NoSuchPaddingException var3) {
         var3.printStackTrace();
      }
   }

   public Class773(String var1, String var2) throws Exception{
      this();
      if (var1 != null) {
         byte[] var3 = Method13193(var1);
         X509EncodedKeySpec var4 = new X509EncodedKeySpec(var3);
         this.Field2970 = KeyFactory.getInstance("RSA").generatePublic(var4);
         this.Field2971.init(1, this.Field2970);
         this.Field2973 = true;
      }

   }

   public final byte[] Method13191(String var1) {
      byte[] var2 = var1.getBytes(Field2968);
      return this.Method13192(var2);
   }

   private byte[] Method13192(byte[] var1) {
      Cipher var2 = this.Field2971;
      synchronized(this.Field2971) {
         try {
            byte[] var10000 = this.Field2971.doFinal(var1);
            return var10000;
         } catch (IllegalBlockSizeException var3) {
            var3.printStackTrace();
         } catch (BadPaddingException var4) {
            var4.printStackTrace();
         }

         return null;
      }
   }

   private static byte[] Method13193(String var0) {
      byte[] var1 = null;
      File var5 = new File(var0);

      try {
         DataInputStream var2 = new DataInputStream(new FileInputStream(var5));
         var1 = new byte[(int)var5.length()];
         var2.readFully(var1);
         var2.close();
      } catch (FileNotFoundException var3) {
         var3.printStackTrace();
      } catch (IOException var4) {
         var4.printStackTrace();
      }

      return var1;
   }
}
