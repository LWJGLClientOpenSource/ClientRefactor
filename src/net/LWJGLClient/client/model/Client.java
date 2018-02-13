package net.LWJGLClient.client.model;

import java.applet.Applet;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.math.BigInteger;
import java.net.ConnectException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Queue;
import java.util.Map.Entry;
import java.util.concurrent.LinkedBlockingQueue;

import net.LWJGLClient.client.a.Class128;
import net.LWJGLClient.client.a.OnDemandFetcher;
import net.LWJGLClient.client.a.a.Class518;
import net.LWJGLClient.client.a.a.Sequence;
import net.LWJGLClient.client.a.a.SpotAnim;
import net.LWJGLClient.client.a.b.RSInterface;
import net.LWJGLClient.client.a.b.SettingUsagePointers;
import net.LWJGLClient.client.a.b.VarBit;
import net.LWJGLClient.client.a.c.*;
import net.LWJGLClient.client.a.d.Class116;
import net.LWJGLClient.client.a.d.Class120;
import net.LWJGLClient.client.a.e.Class619;
import net.LWJGLClient.client.b.RSFont;
import net.LWJGLClient.client.b.Rasterizer;
import net.LWJGLClient.client.b.a.GameShell;
import net.LWJGLClient.client.b.a.a.Class290;
import net.LWJGLClient.client.b.a.a.GraphicsBuffer;
import net.LWJGLClient.client.b.b.GraphicsDisplay;
import net.LWJGLClient.client.b.b.b.Class745;
import net.LWJGLClient.client.b.b.b.a.Texture;
import net.LWJGLClient.client.b.b.b.a.c.Class586;
import net.LWJGLClient.client.b.b.f.Class838;
import net.LWJGLClient.client.b.b.f.Class843;
import net.LWJGLClient.client.b.b.f.c.Class600;
import net.LWJGLClient.client.b.b.f.c.Class601;
import net.LWJGLClient.client.c.Class55;
import net.LWJGLClient.client.c.b.Class280;
import net.LWJGLClient.client.d.Class565;
import net.LWJGLClient.client.d.Class567;
import net.LWJGLClient.client.d.Class569;
import net.LWJGLClient.client.d.SceneGraph;
import net.LWJGLClient.client.d.a.Class730;
import net.LWJGLClient.client.d.b.a.Class328;
import net.LWJGLClient.client.d.b.a.Class330;
import net.LWJGLClient.client.e.a.Class778;
import net.LWJGLClient.client.e.c.Class820;
import net.LWJGLClient.client.model.a.a.Class490;
import net.LWJGLClient.client.model.a.a.Class501;
import net.LWJGLClient.client.model.a.a.Class504;
import net.LWJGLClient.client.model.a.b.Class47;
import net.LWJGLClient.client.model.a.c.Class896;
import net.LWJGLClient.client.model.a.d.Class449;
import net.LWJGLClient.client.model.a.d.ParticleDefinition;
import net.LWJGLClient.client.model.b.Class661;
import net.LWJGLClient.client.model.b.Class663;
import net.LWJGLClient.client.Signlink;
import net.LWJGLClient.client.a.a.ObjectInstance;
import net.emps.client.a.c.*;
import net.LWJGLClient.client.a.c.ItemDef;
import net.LWJGLClient.client.a.d.RgbImage;
import net.LWJGLClient.client.a.d.IndexedImage;
import net.LWJGLClient.client.a.e.JagexArchive;
import net.LWJGLClient.client.b.a.Class697;
import net.LWJGLClient.client.b.b.c.Class413;
import net.LWJGLClient.client.b.b.f.Class842;
import net.LWJGLClient.client.c.Packet;
import net.LWJGLClient.client.c.Class60;
import net.LWJGLClient.client.c.a.Class610;
import net.LWJGLClient.client.d.a.Class726;
import net.LWJGLClient.client.d.a.Class727;
import net.LWJGLClient.client.d.a.Class729;
import net.LWJGLClient.client.d.b.Class329;
import net.LWJGLClient.client.d.b.Class331;
import net.LWJGLClient.client.e.Class16;
import net.LWJGLClient.client.e.Censor;
import net.LWJGLClient.client.e.TextInput;
import net.LWJGLClient.client.e.Class22;
import net.LWJGLClient.client.e.Class23;
import net.LWJGLClient.client.e.Class24;
import net.LWJGLClient.client.e.a.Class773;
import net.LWJGLClient.client.e.b.MouseDetection;
import net.LWJGLClient.client.e.d.Class354;
import net.LWJGLClient.client.model.a.a.Class489;
import net.LWJGLClient.client.model.a.c.Class885;
import net.LWJGLClient.client.model.a.c.Class887;
import net.LWJGLClient.client.model.a.c.Class890;
import net.LWJGLClient.client.model.c.MemCache;
import net.LWJGLClient.client.model.d.Class595;
import net.LWJGLClient.client.model.d.Mobile;
import net.LWJGLClient.client.model.d.Npc;
import net.LWJGLClient.client.model.d.Class617;
import net.LWJGLClient.client.model.d.Class620;
import net.LWJGLClient.client.model.d.Player;
import net.LWJGLClient.client.model.e.Class104;
import net.LWJGLClient.client.model.f.TextureData;

public class Client extends GameShell {
   private static final float[] Field12054 = new float[]{1.0F, 1.125F, 1.25F, 1.5F, 2.0F};
   public static boolean Field12055 = true;
   private static float Field12056 = 1.0F;
   private static boolean Field12057 = true;

   private static boolean Field12058 = false;

   public static Queue Field12059 = new LinkedBlockingQueue();
   public static int Field12060 = 268;
   public final Class331 Field12061 = new Class331(this);
   private int Field12062;
   private int Field12063;
   private int Field12064;
   private int Field12065;
   private int Field12066;
   private int Field12067;
   public static int Field12068 = 2;
   public static boolean Field12069 = true;
   public static int Field12070 = 1024;
   private static int Field12071 = 2;
   private int Field12072 = 0;
   private int Field12073 = 0;
   private int Field12074 = 0;
   public static boolean Field12075 = false;
   private static boolean Field12076 = false;
   public static boolean Field12077 = true;
   private static boolean Field12078 = true;
   private List Field12079 = new LinkedList();
   public static boolean Field12080 = false;
   private static boolean Field12081 = false;
   public Queue Field12082 = new LinkedBlockingQueue();
   public Queue Field12083 = new LinkedBlockingQueue();
   public static boolean Field12084 = true;
   public static boolean Field12085 = false;
   public static Class329 class329 = null;
   public static boolean Field12087 = false;
   private static Class726 Field12088 = new Class726();
   private static Class24 Field12089 = new Class24();
   private static boolean Field12090 = false;
   private static boolean Field12091 = false;
   private int Field12092 = 0;
   public boolean Field12093 = false;
   private boolean Field12094 = false;
   private boolean Field12095 = false;
   private boolean Field12096 = false;
   private boolean Field12097 = false;
   private boolean Field12098 = false;
   private int Field12099 = 0;
   private static Class773 Field12100 = null;
   private int Field12101 = 0;
   private int Field12102 = 1;
   public static boolean Field12103 = true;
   public static boolean Field12104 = true;
   public static boolean Field12105 = false;
   private static boolean Field12106 = true;
   public static boolean Field12107 = true;
   private static boolean Field12108 = true;
   private static float Field12109 = 0.0F;
   public static boolean Field12110 = true;
   private int Field12111 = 0;
   private int Field12112 = 0;
   private static boolean Field12113 = true;
   private static boolean Field12114 = true;
   private static boolean Field12115 = true;
   private static boolean Field12116 = true;
   public static int Field12117 = 60;
   public static int Field12118 = 60;
   private static boolean Field12119 = true;
   public static boolean Field12120 = false;
   private static boolean Field12121 = true;
   public static Charset Field12122 = Charset.forName("UTF-8");
   public static boolean Field12123 = false;
   public static boolean Field12124 = true;
   public static boolean Field12125 = false;
   public static boolean Field12126 = false;
   public static boolean Field12127 = false;
   public static boolean Field12128 = true;
   public static String Field12129 = "LWJGL Client";
   private static String Field12130 = "http://127.0.0.1";
   private static String Field12131 = "http://127.0.0.1".replace("http://", "https://");
   private String jarLocations = "http://127.0.0.1/data";
   public static int Field12133 = 10;
   public static int Field12134 = 0;
   private List Field12135 = new ArrayList();
   private Queue Field12136 = new LinkedBlockingQueue();
   private List Field12137 = new LinkedList();
   public static double Field12138 = 1.0D;
   private boolean Field12139 = false;
   private static int Field12140 = 5292;
   private int Field12141 = 10;
   public static long Field12142 = 0L;
   private int Field12143 = 0;
   private static boolean Field12144 = false;
   private static boolean Field12145 = true;
   private RgbImage Field12146 = null;
   public boolean Field12147 = false;
   public int Field12148 = 0;
   public int Field12149 = 0;
   public String Field12150 = null;
   private String Field12151 = "";
   private boolean Field12152 = false;
   public static boolean Field12153 = false;
   public static boolean Field12154 = true;
   public static boolean normalMem = true;
   public static Class686 Field12156 = null;
   public static Map Field12157 = new HashMap();
   public Class820 Field12158 = null;
   public String[] Field12159 = null;
   private List Field12160 = new LinkedList();
   private boolean Field12161 = false;
   private boolean Field12162 = false;
   private boolean Field12163 = true;
   private boolean Field12164 = false;
   private boolean Field12165 = false;
   public static boolean Field12166 = true;
   public static int Field12167 = 5;
   public int Field12168;
   public int Field12169;
   private int[] Field12170 = null;
   private int Field12171 = -1;
   private int Field12172 = -1;
   private static Class565 Field12173;
   private long Field12174 = 0L;
   private static RandomAccessFile Field12175 = null;
   private static RandomAccessFile Field12176 = null;
   public static boolean Field12177 = false;
   private RgbImage[] Field12178 = new RgbImage[3];
   private RgbImage Field12179 = null;
   private RgbImage[] Field12180 = null;
   private RgbImage Field12181 = null;
   private RgbImage[] Field12182 = null;
   public static Client Field12183 = null;
   private int Field12184 = 0;
   private RgbImage Field12185 = null;
   private RgbImage Field12186 = null;
   private RgbImage Field12187 = null;
   private RgbImage Field12188 = null;
   private RgbImage Field12189 = null;
   private RgbImage Field12190 = null;
   private RgbImage Field12191 = null;
   private RgbImage Field12192 = null;
   private RgbImage Field12193 = null;
   private RgbImage Field12194 = null;
   private RgbImage Field12195 = null;
   private RgbImage Field12196 = null;
   private RgbImage Field12197 = null;
   private RgbImage Field12198 = null;
   private RgbImage Field12199 = null;
   private RgbImage Field12200 = null;
   private RgbImage Field12201 = null;
   private boolean Field12202 = true;
   public boolean Field12203 = true;
   private int Field12204 = 0;
   private int Field12205 = 0;
   private String Field12206 = "";
   private String Field12207 = "";
   private boolean Field12208 = false;
   private String Field12209 = null;
   private int Field12210 = 0;
   private String Field12211 = "1";
   private int Field12212 = 1;
   private int Field12213 = 43594;
   private String Field12214 = "";
   private int Field12215 = 0;
   private int Field12216 = -1;
   private boolean Field12217 = false;
   public static Class569 Field12218;
   public static Class729 Field12219 = null;
   private boolean Field12220 = false;
   private Map Field12221;
   public Map Field12222;
   private Queue Field12223 = new LinkedBlockingQueue();
   private Queue Field12224 = new LinkedBlockingQueue();
   public static boolean Field12225 = true;
   private static Class413 Field12226 = null;
   private boolean Field12227 = false;
   private boolean Field12228 = false;
   private boolean Field12229 = false;
   private boolean Field12230 = false;
   private boolean Field12231 = false;
   private int Field12232;
   private int Field12233;
   private long Field12234 = System.currentTimeMillis();
   private float[] Field12235 = new float[40];
   private int Field12236 = 0;
   public static boolean Field12237 = false;
   private Queue Field12238 = new LinkedBlockingQueue();
   private List Field12239 = new LinkedList();
   private List Field12240 = new LinkedList();
   private Class820 Field12241 = null;
   private Queue Field12242 = new LinkedBlockingQueue();
   private static String Field12243 = null;
   private static String Field12244 = null;
   private static String Field12245 = null;
   private static double Field12246 = 0.0D;
   public static boolean Field12247 = false;
   public static long Field12248 = 0L;
   private Class727 Field12249 = null;
   private long Field12250 = System.currentTimeMillis();
   public static boolean Field12251 = false;
   private static boolean Field12252 = false;
   private static long Field12253 = 0L;
   private int Field12254 = 0;
   private int Field12255 = 0;
   private int Field12256 = 0;
   private long Field12257 = 0L;
   private long Field12258 = 0L;
   private int Field12259 = 0;
   private int Field12260 = 0;
   private long Field12261 = 0L;
   private boolean Field12262 = false;
   public static boolean Field12263 = false;
   private static boolean Field12264 = false;
   private static float Field12265 = 0.0F;
   private static float Field12266 = 0.0F;
   private int Field12267 = 0;
   private boolean Field12268 = false;
   private List Field12269 = new LinkedList();
   private static String Field12270 = "";
   public static boolean Field12271 = false;
   public static boolean Field12272 = false;
   private long Field12273 = 0L;
   public boolean Field12274 = false;
   private Queue Field12275 = new LinkedBlockingQueue();
   private RgbImage Field12276 = null;
   private boolean Field12277 = false;
   private int Field12278 = 0;
   private int Field12279 = 0;
   private int Field12280 = 0;
   public boolean Field12281 = true;
   public int Field12282 = 0;
   public int Field12283 = 0;
   private boolean Field12284 = false;
   private List Field12285 = new LinkedList();
   public Queue Field12286 = new LinkedBlockingQueue();
   public List Field12287 = new LinkedList();
   public static int Field12288;
   private boolean Field12289 = false;
   public static boolean Field12290;
   public int Field12291 = 0;
   public int Field12292 = 0;
   private int Field12293 = 2048;
   private int Field12294 = 2048;
   private int Field12295 = -1;
   private Queue Field12296 = new LinkedBlockingQueue();
   private Packet Field12297 = new Packet(new byte[16]);
   private int Field12298 = 0;
   public static int Field12299;
   private static int Field12300;
   private float Field12301 = 0.0F;
   private int[] Field12302 = new int[]{1, 4, 7, 8, 9, 10, 13, 16, 19, 22, 25, 26, 27, 28, 31, 34, 37, 40, 43, 44, 45, 46, 49, 52, 60, 70, 60, 70, 60, 70};
   private String[] Field12303 = new String[]{"Thick Skin", "Burst of Strength", "Clarity of Thought", "Sharp Eye", "Mystic Will", "Rock Skin", "Superhuman Strength", "Improved Reflexes", "Rapid Restore", "Rapid Heal", "Protect Item", "Hawk Eye", "Mystic Lore", "Steel Skin", "Ultimate Strength", "Incredible Reflexes", "Protect from Magic", "Protect from Range", "Protect from Melee", "Eagle Eye", "Mystic Might", "Retribution", "Redemption", "Smite", "Chivalry (Melee)", "Piety (Melee)", "Chivalry (Ranged)", "Piety (Ranged)", "Chivalry (Magic)", "Piety (Magic)"};
   private String[] Field12304 = new String[]{"Increases your Defence by 5%", "Increases your Strength by 5%", "Increases your Attack by 5%", "Increases your Ranged by 5%", "Increases your Magic by 5%", "Increases your Defence by 10%", "Increases your Strength by 10%", "Increases your Attack by 10%", "2x restore rate for all stats - except for Prayer", "2x restore rate for Hitpoints", "Keep 1 extra item if you die", "Increases your Ranged by 10%", "Increases your Magic by 10%", "Increases your Defence by 15%", "Increases your Strength by 15%", "Increases your Attack by 15%", "Protection from magical attacks", "Protection from ranged attacks", "Protection from melee attacks", "Increases your Ranged by 15%", "Increases your Magic by 15%", "Inflicts damage to nearby targets - if you die", "Heals you when damaged and - health falls below 10%", "Opponent's Prayer is drained - by your hit divided by 4", "Increases Defence by 20%, Atk. - by 18% and Strength by 15%", "Increases Defence by 25%, Atk. - by 23% and Strength by 20%", "Increases Defence by 20% - Ranged accuracy by 18% and - Ranged strength by 15%", "Increases Defence by 25% - Ranged accuracy by 23% and - Ranged strength by 20%", "Increases Defence by 20% - Magic accuracy by 18% and - Magic strength by 15%", "Increases Defence by 25% - Magic accuracy by 23% and - Magic strength by 20%"};
   public String[] Field12305 = new String[100];
   private int Field12306;
   public RgbImage Field12307;
   private boolean publicChatMode = false;
   private String Field12309;
   private String Field12310;
   private int[] Field12311;
   private int Field12312;
   private RgbImage Field12313;
   private RgbImage[] Field12314;
   private RgbImage Field12315;
   public RgbImage[] Field12316 = new RgbImage[2];
   private GraphicsBuffer Field12317;
   private GraphicsBuffer Field12318;
   private GraphicsBuffer Field12319;
   private int user_ignore_count;
   private long Field12321;
   private int[][] Field12322;
   public int[] Field12323;
   private volatile boolean Field12324;
   private int Field12325;
   private Packet aStream_834;
   public Npc[] Field12327;
   public static int Field12328;
   public int[] Field12329;
   private int Field12330;
   private int Field12331;
   private String Field12332;
   private int Field12333;
   private Packet Field12334;
   private boolean Field12335;
   private int[] Field12336;
   private int[] Field12337;
   private int[] Field12338;
   public int Field12339;
   public int openInterfaceID;
   public static int Field12341;
   public static int Field12342;
   public static int Field12343;
   public static int Field12344;
   public static int Field12345;
   public static int myPrivilege;
   private int[] Field12347;
   private RgbImage[] Field12348;
   public RgbImage Field12349;
   public RgbImage Field12350;
   private int[] Field12351;
   private boolean[] Field12352;
   private int Field12353;
   private MouseDetection mouseDetection;
   private volatile boolean Field12355;
   private String Field12356;
   private int Field12357;
   private boolean Field12358;
   private int Field12359;
   private String Field12360;
   private int Field12361;
   private int Field12362;
   public Player[] session_players;
   public static int session_player_count;
   public int[] session_player_list;
   private int sessionNpcsAwaitingUpdatePtr;
   private int[] session_npcs_awaiting_update;
   private Packet[] Field12368;
   private static int Field12369;
   public int Field12370;
   private int Field12371;
   private int[][] Field12372;
   private int Field12373;
   private int Field12374;
   private int Field12375;
   private int Field12376;
   private float Field12377;
   private int Field12378;
   public static int Field12379;
   private int[] Field12380;
   private static int Field12381;
   private long[] user_ignore_names;
   private boolean Field12383;
   private int[] Field12384;
   private int[][] Field12385;
   private RgbImage Field12386;
   private RgbImage Field12387;
   public int Field12388;
   public int Field12389;
   public int Field12390;
   private int Field12391;
   private int Field12392;
   private int Field12393;
   private int[] Field12394;
   private String[] Field12395;
   private String[] Field12396;
   private String[] Field12397;
   private String[] Field12398;
   private RgbImage Field12399;
   private RgbImage Field12400;
   private RgbImage[] Field12401;
   private RgbImage Field12402;
   private RgbImage[] Field12403;
   private RgbImage[] Field12404;
   private RgbImage[] Field12405;
   private RgbImage[] Field12406;
   private RgbImage[] Field12407;
   private RgbImage Field12408;
   private RgbImage Field12409;
   public RgbImage[] Field12410;
   public RgbImage[] Field12411;
   private Class116 Field12412 = null;
   private RgbImage Field12413;
   private RgbImage Field12414;
   private RgbImage Field12415;
   private RgbImage Field12416;
   private RgbImage Field12417;
   private RgbImage Field12418;
   private RgbImage Field12419;
   private RgbImage Field12420;
   private RgbImage Field12421;
   private RgbImage Field12422;
   private RgbImage Field12423;
   private RgbImage Field12424;
   private RgbImage[] Field12425;
   private int[] Field12426;
   public static double Field12427;
   public static SceneGraph Field12428;
   private RgbImage[] Field12429;
   private int Field12430;
   private int Field12431;
   private int Field12432;
   private int Field12433;
   private int Field12434;
   public long Field12435;
   private boolean Field12436;
   public long[] Field12437;
   private int Field12438;
   private volatile boolean FlamesDrawing;
   private int Field12440;
   private int Field12441;
   private int[] Field12442 = new int[]{16776960, 16711680, 65280, 65535, 16711935, 16777215};
   public int[] Field12443;
   public int[] Field12444;
   private boolean Field12445;
   private int Field12446;
   private int[] Field12447;
   private int[] Field12448;
   private int[] Field12449;
   private int[] Field12450;
   private int[] Field12451;
   private int[] Field12452;
   private int[] Field12453;
   private String[] Field12454;
   private int Field12455;
   private int Field12456;
   private static int Field12457;
   private RgbImage[] Field12458;
   private float Field12459;
   private int[] Field12460;
   private boolean Field12461;
   private int Field12462;
   private int Field12463;
   private int Field12464;
   private int Field12465;
   private Class778 Field12466;
   private RgbImage Field12467;
   public static int[][] Field12468;
   public static int[] skinColours;
   private String Field12470;
   private int Field12471;
   private int Field12472;
   private int Field12473;
   private int Field12474;
   private static int Field12475;
   private static int Field12476;
   private int Field12477;
   private boolean Field12478;
   private int Field12479;
   private int Field12480;
   private static int[] Field12481;
   private int Field12482;
   public static int Field12483;
   private RgbImage Field12484;
   private RgbImage Field12485;
   private RgbImage[] Field12486;
   private int Field12487;
   private int[] Field12488;
   public RgbImage[] Field12489;
   public static int Field12490;
   public static int Field12491;
   private static int Field12492;
   private static int Field12493;
   public static int Field12494;
   public static int Field12495;
   private static boolean Field12496;
   public static int Field12497;
   public static int Field12498;
   private int Field12499;
   private int Field12500;
   private int[] Field12501;
   private int[] Field12502;
   private boolean Field12503;
   private int Field12504;
   private String Field12505;
   private static int Field12506;
   public int[] Field12507;
   private JagexArchive titleJagexArchive;
   private int Field12509;
   private int Field12510;
   private List Field12511;
   private List Field12512;
   private List Field12513;
   private List Field12514;
   public int[] Field12515;
   private RSInterface Field12516;
   public IndexedImage[] Field12517;
   private static int Field12518;
   private int Field12519;
   private int Field12520;
   public int Field12521;
   private boolean Field12522 = false;
   private int[] Field12523;
   private int Field12524;
   private int Field12525;
   public OnDemandFetcher Field12526;
   public static int Field12527;
   public static int Field12528;
   public int Field12529;
   public int[] Field12530;
   public int[] Field12531;
   public RgbImage Field12532;
   public RgbImage Field12533;
   private RgbImage Field12534;
   public RgbImage Field12535;
   public RgbImage Field12536;
   public RgbImage Field12537;
   private int Field12538;
   public String[] Players;
   private int Field12540;
   private int Field12541;
   private int Field12542;
   private int Field12543;
   private int Field12544;
   private static int Field12545;
   private int[] expectedCRCs;
   private int[] Field12547;
   private int[] Field12548;
   private int[] Field12549;
   private int[] Field12550;
   private int[] Field12551;
   private long[] Field12552;
   private RgbImage[] Field12553;
   private RgbImage[] Field12554;
   public RgbImage[] Field12555;
   private int Field12556;
   private int Field12557;
   private int Field12558;
   private int Field12559;
   public boolean Field12560;
   private float Field12561;
   private GraphicsBuffer Field12562;
   private int Field12563;
   public String Field12564;
   public RgbImage Field12565;
   public static Player session_player;
   public static int Field12567;
   public static int Field12568;
   public static int Field12569;
   private String[] Field12570;
   private boolean[] Field12571;
   private int[][][] Field12572;
   private int[] Field12573 = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
   private static int Field12574;
   public int Field12575;
   private static int Field12576;
   private int Field12577;
   private int Field12578;
   private int Field12579;
   private String Field12580;
   public RgbImage[] Field12581;
   private boolean Field12582;
   private static int Field12583;
   private int Field12584;
   private boolean Field12585;
   private RgbImage[] Field12586;
   private boolean Field12587 = false;
   private static boolean Field12588;
   private IndexedImage[] Field12589;
   public boolean Field12590;
   private int Field12591;
   private static boolean Field12592;
   public static boolean Field12593;
   private static boolean Field12594;
   private boolean Field12595;
   public static boolean Field12596;
   private boolean Field12597;
   public static int currentTime;
   public static float Field12599;
   public static int Field12600;
   private static String validUserPassChars;
   private GraphicsBuffer Field12602;
   public GraphicsBuffer Field12603;
   public GraphicsBuffer Field12604;
   public GraphicsBuffer Field12605;
   private GraphicsBuffer Field12606;
   private int Field12607;
   private Class55 Field12608;
   private int Field12609;
   public int Field12610;
   private String myUsername;
   private String Field12612;
   private boolean Field12613 = false;
   private String Field12614;
   private static int Field12615;
   private boolean Field12616;
   private int[] Field12617 = new int[]{0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3};
   private int Field12618;
   private int[] Field12619;
   private int[] Field12620;
   private int[] Field12621;
   private byte[][] Field12622;
   public static int Field12623;
   public static int Field12624;
   public static int Field12625;
   public static int Field12626;
   private int Field12627;
   private int Field12628;
   private int Field12629;
   private Packet Field12630;
   private int Field12631;
   private int Field12632;
   private IndexedImage Field12633;
   private String[] Field12634;
   private int[] Field12635;
   private int[] Field12636;
   public int Field12637;
   private int Field12638;
   public String Field12639;
   private int Field12640;
   public int[][][] intGroundArray;
   private long Field12642;
   private int Field12643;
   private IndexedImage[] Field12644;
   private long Field12645;
   public int Field12646;
   public int Field12647;
   public int Field12648;
   public static boolean Field12649;
   public int Field12650;
   private static int Field12651;
   private int Field12652;
   private boolean Field12653 = true;
   public int[] Field12654;
   public Class504[] Field12655;
   public static int[] Field12656;
   private int[] Field12657;
   private int[] Field12658;
   private int[] Field12659;
   private int[] Field12660;
   private int[] Field12661;
   private boolean Field12662;
   private int Field12663;
   private float Field12664;
   private int Field12665;
   private int Field12666;
   private int Field12667;
   private byte[][] Field12668;
   private int Field12669;
   private int Field12670;
   private float[] Field12671;
   private int Field12672;
   private boolean Field12673;
   private static int Field12674;
   private boolean Field12675;
   public boolean Field12676;
   public byte[][][] tileSettingBits;
   private int Field12678;
   public static int Field12679;
   public static int Field12680;
   public RgbImage Field12681;
   private int Field12682;
   private int Field12683;
   private String Field12684;
   private String Field12685;
   private String Field12686;
   private int Field12687;
   private int Field12688;
   private static RSFont fancyFont;
   private static RSFont smallFont;
   public static RSFont plainFont;
   public static RSFont boldFont;
   private int Field12693;
   private static int Field12694;
   private int[] Field12695;
   private int[] Field12696;
   private int Field12697;
   private int Field12698;
   private int Field12699;
   private int Field12700;
   private String Field12701;
   private int Field12702;
   private static int Field12703;
   private static String Field12704;
   private int Field12705;
   private int Field12706;
   private int Field12707;
   private int Field12708;
   private int Field12709;
   private int Field12710;
   private int Field12711;
   public static boolean Field12712;
   public static boolean Field12713;
   public static int Field12714;
   public static int Field12715;
   public static int width;
   public static int height;
   private RgbImage[] Field12718;
   private RgbImage[] Field12719;
   private static boolean glEnabled;
   private Class619[] Field12721;
   public Class619[] Field12722;
/*
    private int user_ignore_count;
    private long aLong824;
    private int[][] anIntArrayArray825;
    private int[] user_friends_worldid;
    private Deque[][][] groundArray;
    private int[] anIntArray828;
    private int[] anIntArray829;
    private volatile boolean currentlyDrawingFlames;
    private Socket aSocket832;
    private int loginScreenState;
    private Packet aStream_834;
    private Npc[] sessionNpcs;
    private int sessionNpcCount;
    private int[] sessionNpcList;
    private int anInt839;
    private int[] anIntArray840;
    private int anInt841;
    private int anInt842;
    private int anInt843;
    private String clickToContinueString;
    private int privateChatMode;
    private Packet aStream_847;
    private boolean wave_on;
    private static int anticheat10;
    private int[] currentFlameColours;
    private int[] flameColourBuffer1;
    private int[] flameColourBuffer2;
    private int[] flameColourBuffer3;
    private static int anticheat11;
    private int headiconDrawType;
    private int openInterfaceID;

    private int xCameraPos;
    private int zCameraPos;
    private int yCameraPos;
    private int yCameraCurve;
    private int xCameraCurve;
    private int myPrivilege;

    private final int[] user_experience;
    private IndexedImage redStone1_3;
    private IndexedImage redStone2_3;
    private IndexedImage redStone3_2;
    private IndexedImage redStone1_4;
    private IndexedImage redStone2_4;
    private RgbImage mapFlag;
    private RgbImage mapMarker;
    private boolean aBoolean872;
    private final int[] anIntArray873;
    private int currentSongID;
    private final boolean[] useCustomCamera;
    private int user_weight;
    private MouseDetection mouseDetection;
    private volatile boolean drawFlames;
    private String reportAbuseInput;
    private int playerID;
    private boolean menuOpen;
    private int anInt886;
    private String inputString;
    private final int maxPlayers;
    private final int session_player_idx;
    private Player[] session_players;
    private int session_player_count;
    private int[] session_player_list;
    private int sessionNpcsAwaitingUpdatePtr;
    private int[] session_npcs_awaiting_update;
    private Packet[] playerUpdateStreams;
    private int viewRotationOffset;
    private int nextViewRotationOffset;
    private int user_friends_count;
    private int network_friends_server_status;
    private int[][] anIntArrayArray901;
    private final int anInt902;
    private GraphicsBuffer backLeftIP1;
    private GraphicsBuffer backLeftIP2;
    private GraphicsBuffer backRightIP1;
    private GraphicsBuffer backRightIP2;
    private GraphicsBuffer backTopIP1;
    private GraphicsBuffer backVmidIP1;
    private GraphicsBuffer backVmidIP2;
    private GraphicsBuffer backVmidIP3;
    private GraphicsBuffer backVmidIP2_2;
    private byte[] animatedPixels;
    private int bankInsertMode;
    private int crossX;
    private int crossY;
    private int crossIndex;
    private int crossType;
    private int plane;
    private final int[] user_levels;
    private static int anticheat13;
    private final long[] user_ignore_names;
    private boolean loadingError;
    private final int anInt927;
    private final int[] anIntArray928;
    private int[][] anIntArrayArray929;
    private RgbImage char_edit_inactive_button;
    private RgbImage char_edit_active_button;
    private int otherPlayerID;
    private int headiconX;
    private int headiconY;
    private int headiconHeight;
    private int arrowDrawTileX;
    private int arrowDrawTileY;
    private static int anticheat14;
    private final int[] chatTypes;
    private final String[] chatNames;
    private final String[] chatMessages;
    private int animationTimePassed;
    private SceneGraph sceneGraph;
    private IndexedImage[] sideIcons;
    private int menuScreenArea;
    private int menuOffsetX;
    private int menuOffsetY;
    private int menuWidth;
    private int menuHeight;
    private long aLong953;
    private boolean wasFocused;
    private long[] friendsListAsLongs;
    private int currentSong;
    private static int network_worldid = 10;
    static int portOff;
    private static boolean isMembers = true;
    private static boolean lowMem;
    private volatile boolean drawingFlames;
    private int spriteDrawX;
    private int spriteDrawY;
    private final int[] chatTextColours = {0xffff00, 0xff0000, 65280, 65535, 0xff00ff, 0xffffff};

    private final int[] compassHingeSize;
    private final int[] anIntArray969;
    final JagexFileStore[] jagexFileStores;
    public int session_variables[];
    private boolean aBoolean972;
    private final int cachedChatAmmount;
    private final int[] anIntArray976;
    private final int[] anIntArray977;
    private final int[] anIntArray978;
    private final int[] anIntArray979;
    private final int[] textColourEffect;
    private final int[] textDrawType;
    private final int[] anIntArray982;
    private final String[] aStringArray983;
    private int anInt984;
    private int anInt985;
    private static int anticheat15;
    private RgbImage[] hitMarks;
    private RgbImage titlebox;
    private RgbImage passwordhover;
    private RgbImage loginhover;
    private RgbImage loadingBox1;

    private int anInt988;
    private int anInt989;
    private final int[] char_edit_colours;
    private static boolean clientRunning;
    private int anInt995;
    private int anInt996;
    private int anInt997;
    private int anInt998;
    private int anInt999;
    private IsaacCipher encryption;
    private RgbImage mapEdge;
    private final int anInt1002;
    static final int[][] playerBodyRecolours = {{6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193}, {8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239}, {25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003}, {4626, 11146, 6439, 12, 4758, 10270}, {4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574}};
    private String amountOrNameInput;
    private static int anticheat1;
    private int welcome_screen_last_login;
    private int pktSize;
    private int pktType;
    private int timeoutCounter;
    private int anInt1010;
    private int anInt1011;
    private Deque projectileDeque;
    private int anInt1014;
    private int anInt1015;
    private int cameraPacketDelay;
    private boolean cameraPacketWrite;
    private int currentStatusInterface;
    private static final int[] XP_FOR_LEVEL;
    private int miniMapLock;
    private int sameClickCounter;
    private int loadingStage;
    private IndexedImage scrollBar1;
    private IndexedImage scrollBar2;
    private int anInt1026;
    private IndexedImage backBase1;
    private IndexedImage backBase2;
    private IndexedImage backHmid1;
    private final int[] cameraTransVars2;
    private boolean char_edit_model_changed;
    private RgbImage[] mapFunctions;
    private int baseX;
    private int baseY;
    private int anInt1036;
    private int anInt1037;
    private int loginFailures;
    private int anInt1039;
    private int anInt1040;
    private int anInt1041;
    private int dialogID;
    private final int[] user_stats;
    private final int[] anIntArray1045;
    private int isMember;
    private boolean char_edit_gender;
    private int anInt1048;
    private String loadingBarText;
    private static int regionLoadedCounter;
    private final int[] minimapShape1;
    private JagexArchive titleJagexArchive;
    private int flashingSideBarID;
    private int anInt1055;
    private Deque stillGraphicDeque;
    private final int[] compassWidthMap;
    private final smallFont aClass9_1059;
    private IndexedImage[] mapScenes;
    private static int drawCycle;
    private int anInt1062;
    private final int anInt1063;
    private int friendsListAction;
    private final int[] char_edit_idkits;
    private int moveItemEndSlot;
    private int lastActiveInvInterface;
    private OnDemandFetcher onDemandFetcher;
    private int anInt1069;
    private int anInt1070;
    private int numOfMapMarkers;
    private int[] markPosX;
    private int[] markPosY;
    private RgbImage mapDotItem;
    private RgbImage mapDotNPC;
    private RgbImage mapDotPlayer;
    private RgbImage mapDotFriend;
    private RgbImage mapDotTeam;
    private int loadingBarPercantage;
    private boolean loadingMap;
    private String[] user_friends_name_string;
    private Packet inStream;
    private int moveItemFrameID;
    private int moveItemStartSlot;
    private int activeInterfaceType;
    private int last_mouse_x;
    private int last_mouse_y;
    private int anInt1089;
    private final int[] expectedCRCs;
    private int[] menuActionCmd2;
    private int[] menuActionCmd3;
    private int[] menuActionID;
    private int[] menuActionCmd1;
    private RgbImage[] headIcons;
    private static int anticheat2;
    private int anInt1098;
    private int anInt1099;
    private int anInt1100;
    private int anInt1101;
    private int anInt1102;
    private boolean tabAreaAltered;
    private int systemUpdateTime;
    private GraphicsBuffer aRSImageProducer_1107;
    private GraphicsBuffer aRSImageProducer_1108;
    private GraphicsBuffer aRSImageProducer_1109;
    private GraphicsBuffer aRSImageProducer_1110;
    private GraphicsBuffer aRSImageProducer_1111;
    private GraphicsBuffer aRSImageProducer_1112;
    private GraphicsBuffer aRSImageProducer_1113;
    private GraphicsBuffer aRSImageProducer_1114;
    private GraphicsBuffer aRSImageProducer_1115;
    private static int mouseClickCounter;
    private int membersInt;
    private String chatboxInputneededString;
    private RgbImage compass;
    private GraphicsBuffer aRSImageProducer_1123;
    private GraphicsBuffer aRSImageProducer_1124;
    private GraphicsBuffer aRSImageProducer_1125;
    public static Player session_player;
    private final String[] atPlayerActions;
    private final boolean[] atPlayerArray;
    private final int[][][] constructionMapInformation;
    private final int[] tabInterfaceIDs = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    private int cameraOffsetY;
    private int nextYOffsetChange;
    private int menuActionRow;
    private static int anticheat3;
    private int spellSelected;
    private int selectedSpellID;
    private int spellUsableOn;
    private String spellTooltip;
    private RgbImage[] markGraphic;
    private boolean tutorialIsland;
    private static int anticheat4;
    private IndexedImage redStone1;
    private IndexedImage redStone2;
    private IndexedImage redStone3;
    private IndexedImage redStone1_2;
    private IndexedImage redStone2_2;
    private int user_energy;
    private boolean isDialogueInterface;
    private RgbImage[] crosses;
    private boolean musicEnabled;
    private IndexedImage[] aIndexedImageArray1152s;
    private boolean needDrawTabArea;
    private int welcome_screen_unread_pm_count;
    private static int anticheat5;
    private static boolean fpsOn;
    public boolean loggedIn;
    private boolean report_abuse_mute_player;
    private boolean loadGeneratedMap;
    private boolean inCutscene;
    public static int currentTime;
    private static final String validUserPassChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"\243$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";
    private GraphicsBuffer tabAreaDrawingTarget;
    private GraphicsBuffer minimapIP;
    private GraphicsBuffer gameScreenCanvas;
    private GraphicsBuffer aRSImageProducer_1166;
    private int welcome_screen_last_recovery_change_or_member_warning;
    private RSSocket socketStream;
    private int anInt1169;
    private int minimapZoom;
    private int nextMinimapZoomOffset;
    private long aLong1172;
    private String myUsername;
    private String myPassword;
    private static int anticheat6;
    private boolean genericLoadingError;
    private final int[] anIntArray1177 = {0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3};
    private int reportAbuseInterfaceID;
    private Deque gameObjectSpawnDeque;
    private int[] chatLineOffsets;
    private int[] anIntArray1181;
    private int[] anIntArray1182;
    private byte[][] terrainData;
    private int cameraY;
    private int cameraX;
    private int anInt1186;
    private int anInt1187;
    private static int anticheat7;
    private int invOverlayInterfaceID;
    private int[] anIntArray1190;
    private int[] anIntArray1191;
    private Packet stream;
    private int lastLoginIP;
    private int ui_split_private_chat;
    private IndexedImage invBack;
    private IndexedImage mapBack;
    private IndexedImage chatBack;
    private String[] menuActionName;
    private RgbImage aClass30_Sub2_Sub1_Sub1_1201;
    private RgbImage aClass30_Sub2_Sub1_Sub1_1202;
    private final int[] customLowestYaw;
    static final int[] skinColours = {9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486};
    private static boolean flagged;
    private final int[] songIDs;
    private int flameCycle;
    private int minimapRotation;
    private int nextMinimapRotationOffset;
    private int scrollMax;
    private String promptInput;
    private int anInt1213;
    private int[][][] intGroundArray;
    private long aLong1215;
    private int loginScreenCursorPos;
    private final IndexedImage[] modIcons;
    private long lastPressedTime;
    private int tabID;
    private int headiconNpcID;
    private boolean inputTaken;
    private int inputDialogState;
    private static int anticheat8;
    private int nextSong;
    private boolean songChanging;
    private final int[] minimapShape2;
    private TileSetting[] tileSettings;
    private boolean chatOptionsNeedUpdating;
    private int[] mapCoordinates;
    private int[] terrainIndices;
    private int[] anIntArray1236;//map indexs?
    private int oldX;
    private int oldY;
    //public final int anInt1239 = 100;
    private final int[] anIntArray1240;
    private final int[] songVolumes;
    private boolean aBoolean1242;
    private int atInventoryLoopCycle;
    private int atInventoryInterface;
    private int atInventoryIndex;
    private int atInventoryInterfaceType;
    private byte[][] aByteArrayArray1247;
    private int tradeMode;
    private int chatEffectsEnabled;
    private final int[] anIntArray1250;
    private int onTutorialIsland;
    private final boolean rsAlreadyLoaded;
    private int oneMouseButton;
    private int anInt1254;
    private boolean repaintRequested;
    private boolean messagePromptRaised;
    private int anInt1257;//todo with wave generator, SCARY STUFF
    private byte[][][] tileSettingBits;
    private int prevSong;
    private int destX;
    private int destY;
    private RgbImage minimapImage;
    private int anInt1264;
    private int rendersPerSecond;
    private String loginMessage1;
    private String loginMessage2;
    private int bigRegionX;
    private int bigRegionY;
    private RSFont smallFont;
    private RSFont plainFont;
    private RSFont boldFont;
    private int anInt1275;
    private int backDialogID;
    private int cameraOffsetX;
    private int nextXOffsetChange;
    private int[] bigX;
    private int[] bigY;
    private int itemSelected;
    private int lastItemSelectedSlot;
    private int lastItemSelectedInterface;
    private int lastItemSelected;
    private String selectedItemName;
    private int publicChatMode;
    private static int anticheat9;
    private int currentSongVolume;//music stuff, BEWARE
    public String server = "";
    public int playerBitAmmount = 12;//12 for 317, 14 for pi
    public static boolean guiLaunch = true;
    public static boolean circleLoadingBar = false;
    public static final boolean glEnabled = false;
    public static final boolean useNewTerrain = false;
 */
   static {
      int[] var10000 = new int[]{1196, 1199, 1206, 1215, 1224, 1231, 1240, 1249, 1258, 1267, 1274, 1283, 1573, 1290, 1299, 1308, 1315, 1324, 1333, 1340, 1349, 1358, 1367, 1374, 1381, 1388, 1397, 1404, 1583, 12038, 1414, 1421, 1430, 1437, 1446, 1453, 1460, 1469, 15878, 1602, 1613, 1624, 7456, 1478, 1485, 1494, 1503, 1512, 1521, 1530, 1544, 1553, 1563, 1593, 1635, 12426, 12436, 12446, 12456, 6004, 18471, 12940, 12988, 13036, 12902, 12862, 13046, 12964, 13012, 13054, 12920, 12882, 13062, 12952, 13000, 13070, 12912, 12872, 13080, 12976, 13024, 13088, 12930, 12892, 13096};
      var10000 = new int[]{1202, 1203, 1209, 1210, 1211, 1218, 1219, 1220, 1227, 1228, 1234, 1235, 1236, 1243, 1244, 1245, 1252, 1253, 1254, 1261, 1262, 1263, 1270, 1271, 1277, 1278, 1279, 1286, 1287, 1293, 1294, 1295, 1302, 1303, 1304, 1311, 1312, 1318, 1319, 1320, 1327, 1328, 1329, 1336, 1337, 1343, 1344, 1345, 1352, 1353, 1354, 1361, 1362, 1363, 1370, 1371, 1377, 1378, 1384, 1385, 1391, 1392, 1393, 1400, 1401, 1407, 1408, 1410, 1417, 1418, 1424, 1425, 1426, 1433, 1434, 1440, 1441, 1442, 1449, 1450, 1456, 1457, 1463, 1464, 1465, 1472, 1473, 1474, 1481, 1482, 1488, 1489, 1490, 1497, 1498, 1499, 1506, 1507, 1508, 1515, 1516, 1517, 1524, 1525, 1526, 1533, 1534, 1535, 1547, 1548, 1549, 1556, 1557, 1558, 1566, 1567, 1568, 1576, 1577, 1578, 1586, 1587, 1588, 1596, 1597, 1598, 1605, 1606, 1607, 1616, 1617, 1618, 1627, 1628, 1629, 1638, 1639, 1640, 6007, 6008, 6011, 8673, 8674, 12041, 12042, 12429, 12430, 12431, 12439, 12440, 12441, 12449, 12450, 12451, 12459, 12460, 15881, 15882, 15885, 18474, 18475, 18478};
      Field12288 = 1;
      Field12290 = false;
      Field12299 = 10995143;
      Field12300 = -1;
      Field12468 = new int[][]{{6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193}, {8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239, 43096, 43113, 37, 6327, 43336, 10471, 6944, 1811, 57280, 5672, 33, 43072, 8, 43279, 21662, 36133, 925, 10394, 6068, 33715}, {25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 43096, 43113, 37, 6327, 43336, 10471, 6944, 1811, 57280, 5672, 33, 43072, 8, 43279, 21662, 36133, 925, 10394, 6068, 33715}, {4626, 11146, 6439, 12, 4758, 10270, 43088, 43105, 29, 6319, 43328, 10463, 6936, 1803, 57272, 5664, 25, 43064, 0, 43271, 21654, 36125, 917, 10386, 6060, 33707}, {4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574, 20}};
      skinColours = new int[]{9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486, 43088, 43105, 29, 6319, 43328, 10463, 6936, 1803, 57272, 5664, 25, 43064, 0, 43271, 21654, 36125, 917, 10386, 6060, 33707};
      Field12496 = false;
      Field12497 = 0;
      Field12498 = 0;
      Field12567 = 0;
      Field12568 = 0;
      Field12569 = 0;
      Field12588 = true;
      Field12592 = true;
      Field12593 = false;
      Field12594 = false;
      validUserPassChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";
      Field12674 = 0;
      Field12704 = "";
      Field12712 = true;
      Field12714 = 0;
      Field12715 = 0;
      width = 0;
      height = 0;
      glEnabled = true;
      Field12481 = new int[99];
      int var0 = 0;

      int var1;
      for(var1 = 0; var1 < 99; ++var1) {
         int var2 = (int)((double)(var2 = var1 + 1) + 300.0D * Math.pow(2.0D, (double)var2 / 7.0D));
         var0 += var2;
         Field12481[var1] = var0 / 4;
      }

      Field12656 = new int[32];
      var0 = 2;

      for(var1 = 0; var1 < 32; ++var1) {
         Field12656[var1] = var0 - 1;
         var0 += var0;
      }

   }

   private static void Method13199(int var0, Client var1) {
      if (GraphicsDisplay.Field2678 && GraphicsDisplay.Field2667 && GraphicsDisplay.Field2665) {
         Field12068 = var0;
         if (var1 != null) {
            var1.Field12444[2010] = var0 + 1;
         }
      } else {
         Field12068 = 0;
         if (var1 != null) {
            var1.Method13334("HD water settings aren't supported on your system.");
            var1.Field12444[2010] = 1;
            return;
         }
      }

   }

   private static void Method13200(int var0, Client var1) {
      int var10000 = GraphicsDisplay.Field2676;
      if (GraphicsDisplay.Field2678 && GraphicsDisplay.Field2667 && (GraphicsDisplay.Field2663 || GraphicsDisplay.Field2664) && GraphicsDisplay.Field2665) {
         Field12071 = var0;
         if (var0 == 0) {
            Field12069 = false;
         } else {
            Field12069 = true;
            if (Field12071 == 1) {
               Field12070 = GraphicsDisplay.Field2676 / 4;
            } else if (Field12071 == 2) {
               Field12070 = (GraphicsDisplay.Field2676 << 1) / 4;
            } else if (Field12071 == 3) {
               Field12070 = GraphicsDisplay.Field2676 * 3 / 4;
            } else {
               if (Field12071 == 4) {
                  Field12070 = GraphicsDisplay.Field2676;
               }

            }
         }
      } else {
         Field12071 = 0;
         Field12069 = false;
         if (var1 != null) {
            var1.Method13334("Shadows are not supported on your system.");
            var1.Field12444[2005] = 1;
         }

      }
   }

   private void Method13201(int var1, int var2, int var3) {
      if (Method13313()) {
         if (Field12219 != null) {
            Field12219.Method12346();
         }

         if (Method13313()) {
            if (Field12219 != null) {
               Field12219.Method12346();
            }

            Field12219 = null;
         }

         Field12219 = null;
      }

      this.Method13210(18, var1, var2);
      this.Field12274 = true;
      Field12527 = var1;
      Field12528 = var2;
      Method13407(Field12527 - 6 << 3, Field12528 - 6 << 3);
      var1 = Field12490 - Field12492;
      var2 = Field12491 - Field12493;
      Field12492 = Field12490;
      Field12493 = Field12491;
      int var4 = (int)Math.sqrt(Math.pow((double)var1, 2.0D) + Math.pow((double)var2, 2.0D));
      if (!Field12596) {
         Field12075 = var4 >= 70;
      }

      Field12494 += var1;
      Field12495 += var2;
      if (this.Field12289) {
         Method13248(session_player, -var1, -var2);
         this.Field12289 = false;
      }

      this.Field12582 = (Field12527 / 8 == 48 || Field12527 / 8 == 49) && Field12528 / 8 == 48;
      if (Field12527 / 8 == 48 && Field12528 / 8 == 148) {
         this.Field12582 = true;
      }

      if (var3 == 73) {
         this.Method13208();
      } else if (var3 == 241) {
         var1 = 0;
         int[] var8 = new int[676];

         int var5;
         int var6;
         int var7;
         for(var3 = 0; var3 < 4; ++var3) {
            for(var4 = 0; var4 < 13; ++var4) {
               for(var5 = 0; var5 < 13; ++var5) {
                  if ((var6 = this.Field12572[var3][var4][var5]) != -1) {
                     var7 = var6 >> 14 & 1023;
                     var6 = var6 >> 3 & 2047;
                     var6 = (var7 / 8 << 8) + var6 / 8;

                     for(var7 = 0; var7 < var1; ++var7) {
                        if (var8[var7] == var6) {
                           var6 = -1;
                        }
                     }

                     if (var6 != -1) {
                        var8[var1++] = var6;
                     }
                  }
               }
            }
         }

         this.Field12622 = new byte[var1][];
         this.Field12668 = new byte[var1][];
         this.Field12657 = new int[var1];
         this.Field12658 = new int[var1];
         this.Field12659 = new int[var1];

         for(var3 = 0; var3 < var1; ++var3) {
            var5 = (var4 = this.Field12657[var3] = var8[var3]) >> 8 & 255;
            var6 = var4 & 255;
            if ((var7 = this.Field12658[var3] = this.Field12526.Method1315(0, var6, var5)) != -1) {
               this.Field12526.Method11960(3, var7);
            }

            if ((var6 = this.Field12659[var3] = this.Field12526.Method1315(1, var6, var5)) != -1) {
               this.Field12526.Method11960(3, var6);
            }
         }
      }

      this.Field12597 = false;
   }

   public static void Method13202() {
      Field12089.Method212();
   }

   public static double Method13203(int var0, int var1) {
      int var2 = Field12341 - 6 >> 7;
      int var3 = Field12343 - 6 >> 7;
      return Math.sqrt(Math.pow((double)(var0 - var2), 2.0D) + Math.pow((double)(var1 - var3), 2.0D));
   }

   public static int Method13204(int var0, int var1) {
      int var2 = session_player == null ? Field12567 : session_player.Field4194 - 6 >> 7;
      int var3 = session_player == null ? Field12568 : session_player.Field4195 - 6 >> 7;
      return (int)Math.sqrt(Math.pow((double)(var0 - var2), 2.0D) + Math.pow((double)(var1 - var3), 2.0D));
   }

   public static int Method13205(int var0, int var1) {
      int var2 = session_player == null ? Field12567 : session_player.Field4194 - 6 >> 7;
      int var3 = session_player == null ? Field12568 : session_player.Field4195 - 6 >> 7;
      var2 += Field12490 - Field12494;
      var3 += Field12491 - Field12495;
      return (int)Math.sqrt(Math.pow((double)(var0 - var2), 2.0D) + Math.pow((double)(var1 - var3), 2.0D));
   }

   public static int Method13206(int var0, int var1) {
      int var2 = session_player == null ? Field12567 : session_player.Field4194 - 6 >> 7;
      int var3 = session_player == null ? Field12568 : session_player.Field4195 - 6 >> 7;
      var2 += Field12490;
      var3 += Field12491;
      return (int)Math.sqrt(Math.pow((double)(var0 - var2), 2.0D) + Math.pow((double)(var1 - var3), 2.0D));
   }

   public static String requestServerIP() {
      return "127.0.0.1";
   } //  {     return "164.132.204.42";}

   private void Method13208() {
      if (!Field12596) {
         int var1 = 0;

         int var2;
         int var3;
         for(var2 = (Field12527 - 6) / 8; var2 <= (Field12527 + 6) / 8; ++var2) {
            for(var3 = (Field12528 - 6) / 8; var3 <= (Field12528 + 6) / 8; ++var3) {
               ++var1;
            }
         }

         this.Field12622 = new byte[var1][];
         this.Field12668 = new byte[var1][];
         this.Field12657 = new int[var1];
         this.Field12658 = new int[var1];
         this.Field12659 = new int[var1];
         var1 = 0;

         for(var2 = (Field12527 - 6) / 8; var2 <= (Field12527 + 6) / 8; ++var2) {
            for(var3 = (Field12528 - 6) / 8; var3 <= (Field12528 + 6) / 8; ++var3) {
               this.Field12657[var1] = (var2 << 8) + var3;
               int var4;
               if ((var4 = this.Field12658[var1] = this.Field12526.Method1315(0, var3, var2)) != -1) {
                  this.Field12526.Method11951(3, var4, true);
               }

               if ((var4 = this.Field12659[var1] = this.Field12526.Method1315(1, var3, var2)) != -1) {
                  this.Field12526.Method11951(3, var4, true);
               }

               ++var1;
            }
         }

         this.Field12597 = false;
      }
   }

   public final void Method13209(int var1) {
      this.Method13210(var1, 0, 0);
   }

   private void Method13210(int var1, int var2, int var3) {
      Class280.Method2988().Field2302 = 2000L;
      if (Field12218 != null) {
         Field12218.Method8827(this);
      }

      Field12084 = true;
      this.Field12254 = 0;
      long var4 = System.currentTimeMillis();
      this.Field12250 = var4;
      this.Field12321 = var4;
      Field12142 = var4;
      if (var2 != 0 && var3 != 0) {
         Field12496 = false;
         var1 = (var2 - 6 << 3) - Field12490;
         var2 = (var3 - 6 << 3) - Field12491;
         var1 = var1 < 0 ? -var1 : var1;
         var2 = var2 < 0 ? -var2 : var2;
         if (var1 > 48 || var2 > 48) {
            Field12496 = true;
         }
      }

      Field12252 = false;
      Field12483 = 1;
   }

   public static String Method13211(String[] var0, int var1, RSFont var2) {
      int var3 = 0;
      StringBuilder var4 = new StringBuilder();
      String[] var7 = var0;
      int var6 = var0.length;

      for(int var5 = 0; var5 < var6; ++var5) {
         String[] var10;
         int var9 = (var10 = var7[var5].split(" ")).length;

         for(int var8 = 0; var8 < var9; ++var8) {
            String var12 = var10[var8];
            int var11 = var2.Method9451(var12);
            if (var3 + var11 >= var1) {
               var3 = 0;
               var4.append("\n");
            } else {
               var3 += var11;
            }

            var4.append(var12);
            var4.append(" ");
         }

         var3 = 0;
         var4.append("\n");
      }

      return var4.toString();
   }

   private static String Method13212(String var0, int var1, RSFont var2) {
      int var3 = 0;
      int var4 = Math.round((float)var1 * 1.08F);
      StringBuilder var5 = new StringBuilder();
      String[] var14 = var0.split(" ");
      boolean var6 = false;
      String[] var9 = var14;
      int var8 = var14.length;

      for(int var7 = 0; var7 < var8; ++var7) {
         var0 = var9[var7];
         int var10 = var2.Method9451(var0);
         if (var3 + var10 < var4) {
            var10 = var2.Method9451(var0);
            if (var0.length() > 0) {
               if (var3 + var10 > var1) {
                  var3 = 0;
                  var5.append('\n');
               } else {
                  var3 += var10;
               }

               var5.append(var0);
               var5.append(" ");
            }
         } else {
            for(var10 = 0; var10 < var0.length(); ++var10) {
               char var11 = var0.charAt(var10);
               int var12 = var2.Field9979[var11];
               if (var11 == '@') {
                  var6 = !var6;
               }

               if (!var6) {
                  if (var3 + var12 > var1) {
                     var3 = 0;
                     var5.append('\n');
                  } else {
                     var3 += var12;
                  }
               }

               var5.append(var11);
            }

            var5.append(" ");
         }
      }

      return var5.toString();
   }

   private void examineBytecodeRouter(byte[] var1) {
      if (var1 == null) {
         this.examineRunescapeReplacer("");
      } else {
         this.examineRunescapeReplacer(new String(var1));
      }
   }

   private static String aAnFormatter(String var0) {
      if (var0 == null) {
         return " a ";
      } else if (!var0.endsWith("s.") && !var0.endsWith("s")) {
         return !(var0 = var0.toLowerCase()).startsWith("a") && !var0.startsWith("e") && !var0.startsWith("i") && !var0.startsWith("o") && !var0.startsWith("u") ? " a " : " an ";
      } else {
         return " ";
      }
   }

   private void examineRunescapeReplacer(String var1) {
      if (var1 == null || var1.equals("")) {
         var1 = "Nothing to examine.";
      }

      var1 = var1.replaceAll("RuneScape", Field12129).replaceAll("Runescape", Field12129).replaceAll("runescape", Field12129);
      this.pushMessage(var1, 0, "");
      if (Field12115) {
         var1 = Method13212(var1, 150, plainFont);
         this.Field12286.add(new Class663(this.o_37 - 50, this.p_34 - 16, var1, 3000L, false));
      }

   }

   private void Method13216() { //clear for shutdown
      this.Field12143 = 0;
      this.Field12650 = 4;
      this.Field12521 = 0;
      Field12649 = true;
      this.Field12639 = "";
      this.Field12564 = "";
      this.Field12215 = 0;
      this.Field12216 = -1;
   }

   public static long Method13217(String var0) {
      long var1 = 0L;

      for(int var3 = 0; var3 < var0.length() && var3 < 13; ++var3) {
         char var4 = var0.charAt(var3);
         var1 *= 37L;
         if (var4 >= 'A' && var4 <= 'Z') {
            var1 += (long)(var4 + 1 - 65);
         } else if (var4 >= 'a' && var4 <= 'z') {
            var1 += (long)(var4 + 1 - 97);
         } else if (var4 >= '0' && var4 <= '9') {
            var1 += (long)(var4 + 27 - 48);
         }
      }

      while(var1 % 37L == 0L && var1 != 0L) {
         var1 /= 37L;
      }

      return var1;
   }

   public static long Method13218(String var0) {
      long var1 = 0L;

      for(int var3 = 0; var3 < var0.length() && var3 < 25; ++var3) {
         char var4 = var0.charAt(var3);
         var1 *= 37L;
         if (var4 >= 'A' && var4 <= 'Z') {
            var1 += (long)(var4 + 1 - 65);
         } else if (var4 >= 'a' && var4 <= 'z') {
            var1 += (long)(var4 + 1 - 97);
         } else if (var4 >= '0' && var4 <= '9') {
            var1 += (long)(var4 + 27 - 48);
         }
      }

      while(var1 % 37L == 0L && var1 != 0L) {
         var1 /= 37L;
      }

      if (var1 < 0L) {
         var1 = -var1;
      }

      return var1;
   }

   private void Method13219() {
      this.Field12444[1980] = GraphicsDisplay.Field2681 ? 1 : 0;
      this.Field12444[1981] = GraphicsDisplay.Field2667 ? 1 : 0;
      this.Field12444[1982] = Class569.Field471 ? 0 : 1;
      this.Field12444[1983] = Field12123 ? 0 : 1;
      this.Field12444[1996] = Field12124 ? 1 : 0;
      this.Field12444[1984] = Field12107 ? 1 : 0;
      this.Field12444[1985] = Rasterizer.Field9947 ? 1 : 0;
      this.Field12444[1986] = Field12121 ? 1 : 0;
      this.Field12444[1997] = Field12110 ? 1 : 0;
      this.Field12444[1998] = Field12108 ? 0 : 1;
      if (Field12117 <= 40) {
         this.Field12444[1987] = 1;
      } else if (Field12117 <= 50) {
         this.Field12444[1987] = 2;
      } else if (Field12117 <= 60) {
         this.Field12444[1987] = 3;
      } else if (Field12117 <= 80) {
         this.Field12444[1987] = 4;
      } else if (Field12117 <= 100) {
         this.Field12444[1987] = 5;
      }

      if (Field12118 <= 30) {
         this.Field12444[1988] = 1;
         Field12118 = 30;
      } else if (Field12118 <= 60) {
         this.Field12444[1988] = 2;
         Field12118 = 60;
      } else if (Field12118 <= 80) {
         this.Field12444[1988] = 3;
         Field12118 = 80;
      } else if (Field12118 <= 144) {
         this.Field12444[1988] = 4;
         Field12118 = 144;
      } else {
         this.Field12444[1988] = 5;
         Field12118 = 1000;
      }

      this.Field12444[1989] = Field12592 ? 1 : 0;
      this.Field12444[1990] = GraphicsDisplay.Field2668 ? 1 : 0;
      this.Field12444[1991] = Field12106 ? 1 : 0;
      this.Field12444[1992] = Field12113 ? 1 : 0;
      this.Field12444[1993] = Field12114 ? 1 : 0;
      this.Field12444[1994] = Field12167 <= 1 ? 1 : Field12167;
      this.Field12444[1995] = Field12115 ? 1 : 0;
      this.Field12444[1999] = Field12090 ? 0 : 1;
      this.Field12444[2000] = Field12103 ? 1 : 0;
      this.Field12444[2001] = Field12104 ? 1 : 0;
      this.Field12444[2002] = Rasterizer.Field9942 ? 1 : 0;
      this.Field12444[2003] = Field12077 ? 1 : 0;
      this.Field12444[2004] = Field12078 ? 1 : 0;
      this.Field12444[2005] = Field12071 + 1;
      this.Field12444[170] = Field12674;
      this.Field12444[2008] = Field12225 ? 1 : 0;
      this.Field12444[2009] = Field12057 ? 1 : 0;
      this.Field12444[2010] = Field12068 + 1;

      for(int var1 = 0; var1 < 5; ++var1) {
         if (GraphicsDisplay.Method1040() <= Field12054[var1]) {
            this.Field12444[2011] = var1 + 1;
            break;
         }
      }

      this.Field12444[2012] = Field12055 ? 1 : 0;
   }

   public static void Method13220() {
      if (Field12167 <= 0) {
         Field12167 = 1;
      }

      Rasterizer.Field9945 = true;
      Rasterizer.Field9942 = true;
      Rasterizer.Field9943 = false;
      Rasterizer.Field9944 = 594;
      if (GraphicsDisplay.Field2678 && GraphicsDisplay.Field2667) {
         if (!GraphicsDisplay.Field2665 && Field12167 > 4) {
            Field12167 = 4;
         }
      } else if (!GraphicsDisplay.Field2678) {
         Field12167 = 1;
      }

      switch(Field12167) {
      case 1:
         Rasterizer.Field9945 = false;
         Rasterizer.Field9942 = false;
         return;
      case 2:
         Rasterizer.Field9945 = false;
         Rasterizer.Field9944 = -1;
         return;
      case 3:
         Rasterizer.Field9944 = -1;
         return;
      case 4:
      default:
         Rasterizer.Field9945 = true;
         Rasterizer.Field9942 = true;
         return;
      case 5:
         Rasterizer.Field9945 = true;
         Rasterizer.Field9942 = true;
         Rasterizer.Field9943 = true;
      }
   }

   private static synchronized void initializeGL() {
      String var0 = Signlink.cacheDirectory() + "opengl.dat";
      File var1;
      if ((var1 = new File(var0)).exists()) {
         var1.delete();
      }

      try {
         RandomAccessFile var4;
         (var4 = new RandomAccessFile(var0, "rw")).writeBoolean(GraphicsDisplay.Field2681);
         var4.writeBoolean(Rasterizer.Field9945);
         var4.writeBoolean(Class569.Field471);
         var4.writeBoolean(false);
         var4.writeBoolean(Field12107);
         var4.writeBoolean(Rasterizer.Field9947);
         var4.writeBoolean(Field12123);
         var4.writeBoolean(Field12121);
         var4.writeByte(Field12117 & 255);
         var4.writeByte(0);
         var4.writeBoolean(Field12592);
         var4.writeBoolean(Field12105);
         var4.writeBoolean(Field12106);
         var4.writeBoolean(Field12113);
         var4.writeBoolean(Field12114);
         var4.writeBoolean(Field12712);
         var4.writeBoolean(Field12081);
         var4.writeBoolean(Field12166);
         var4.writeBoolean(GraphicsDisplay.Field2667);
         var4.writeByte(Field12167 & 255);
         var4.writeBoolean(Field12115);
         var4.writeBoolean(Field12124);
         var4.writeBoolean(Field12110);
         var4.writeBoolean(Field12108);
         var4.writeBoolean(Field12090);
         var4.writeBoolean(Field12103);
         var4.writeBoolean(Field12104);
         var4.writeBoolean(Rasterizer.Field9942);
         var4.writeBoolean(Field12674 == 1);
         var4.writeBoolean(GraphicsDisplay.Field2668);
         var4.writeBoolean(Field12077);
         var4.writeBoolean(Field12078);
         var4.writeByte(Field12071);
         var4.writeByte(Field12167 & 255);
         var4.writeBoolean(Field12225);
         var4.writeBoolean(Field12057);
         var4.writeBoolean(Field12588);
         var4.writeInt(Field12118);
         var4.writeByte(Field12068);
         var4.writeFloat(GraphicsDisplay.Method1040());
         var4.writeBoolean(Field12055);
         var4.writeBoolean(Field12055);
         var4.writeBoolean(GraphicsDisplay.Field2681);
         var4.close();
      } catch (FileNotFoundException var2) {
         var2.printStackTrace();
      } catch (IOException var3) {
         var3.printStackTrace();
      }
   }

   public static void Method13222() {
      Method13200(Field12071, (Client)null);
   }

   private static void Method13223(boolean var0) {
      Class569.Field471 = false;
      if (!var0) {
         GraphicsDisplay.Field2681 = !GraphicsDisplay.Method1000();
      }

      Field12167 = 5;
      Field12107 = true;
      Rasterizer.Field9947 = true;
      Field12123 = false;
      Field12121 = true;
      Field12117 = 60;
      Field12118 = 60;
      Field12592 = true;
      Field12106 = true;
      Field12113 = true;
      Field12114 = true;
      GraphicsDisplay.Field2667 = true;
      if (!var0) {
         GraphicsDisplay.Method1044(1.0F);
      }

      Field12115 = true;
      Field12124 = true;
      Field12090 = true;
      Field12103 = true;
      Field12110 = true;
      Field12104 = true;
      GraphicsDisplay.Field2668 = true;
      Field12077 = true;
      Field12078 = true;
      Field12071 = 2;
      Field12225 = true;
      Field12057 = true;
      Field12055 = true;
      if (GraphicsDisplay.Field2678 && GraphicsDisplay.Method1000()) {
         if (!var0) {
            GraphicsDisplay.Field2681 = false;
         }

         Class569.Field471 = true;
         Rasterizer.Field9947 = false;
         Field12167 = 2;
         Field12071 = 0;
      }

      Method13220();
      Method13200(Field12071, (Client)null);
   }

   public static void Method13224(boolean var0) {
      if (var0) {
         Method13223(true);
      }

      String var4 = Signlink.cacheDirectory() + "opengl.dat";
      if ((new File(var4)).exists()) {
         try {
            RandomAccessFile var5;
            (var5 = new RandomAccessFile(var4, "rw")).readBoolean();
            Rasterizer.Field9945 = var5.readBoolean();
            Class569.Field471 = var5.readBoolean();
            var5.readBoolean();
            Field12107 = var5.readBoolean();
            Rasterizer.Field9947 = var5.readBoolean();
            Field12123 = var5.readBoolean();
            Field12121 = var5.readBoolean();
            Field12117 = var5.readByte();
            var5.readByte();
            Field12592 = var5.readBoolean();
            Field12105 = var5.readBoolean();
            Field12106 = var5.readBoolean();
            Field12113 = var5.readBoolean();
            Field12114 = var5.readBoolean();
            Field12712 = var5.readBoolean();
            Field12081 = var5.readBoolean();
            Field12166 = var5.readBoolean();
            GraphicsDisplay.Field2667 = var5.readBoolean();
            var5.readByte();
            Field12115 = var5.readBoolean();
            Field12124 = var5.readBoolean();
            var5.readBoolean();
            Field12110 = true;
            Field12108 = var5.readBoolean();
            Field12090 = var5.readBoolean();
            Field12103 = var5.readBoolean();
            Field12104 = var5.readBoolean();
            Rasterizer.Field9942 = var5.readBoolean();
            Field12674 = var5.readBoolean() ? 1 : 0;
            Field12105 = false;
            GraphicsDisplay.Field2668 = var5.readBoolean();
            Field12077 = var5.readBoolean();
            Field12078 = var5.readBoolean();
            Field12071 = var5.readByte();
            Field12167 = var5.readByte();
            Field12225 = var5.readBoolean();
            Field12057 = var5.readBoolean();
            Field12588 = var5.readBoolean();
            Field12118 = var5.readInt();
            Field12068 = var5.readByte();
            GraphicsDisplay.Method1044(var5.readFloat());
            Field12055 = var5.readBoolean();
            Field12055 = var5.readBoolean();
            Field12055 = true;
            GraphicsDisplay.Field2681 = var5.readBoolean();
            var5.close();
         } catch (FileNotFoundException var2) {
            var2.printStackTrace();
         } catch (IOException var3) {
            var3.printStackTrace();
         }

         if (GraphicsDisplay.Method1000() && Field12117 > 80) {
            Field12117 = 80;
         }

         if (!GraphicsDisplay.Field2678) {
            Rasterizer.Field9947 = false;
         }

         Method13220();
         Method13200(Field12071, (Client)null);
      }
   }

   private void ModelUtility() {
      if (this.Field12160.size() > 0) {
         HashSet var1 = new HashSet();
         HashSet var2 = new HashSet();
         boolean var3 = true;
         Iterator var5 = this.Field12160.iterator();

         while(var5.hasNext()) {
            Model var6;
            if ((var6 = Model.Method14476((Integer)var5.next(), false, false)) != null) {
               var1.addAll(var6.Method14506());
               var2.addAll(var6.Method14505());
            } else {
               var3 = false;
            }
         }

         if (var3) {
            this.Field12160.clear();
            Object[] var4;
            Arrays.sort(var4 = var2.toArray());
            Field12059.add("Cols: " + Arrays.toString(var4));
            System.out.println("Cols: " + Arrays.toString(var4));
            Arrays.sort(var4 = var1.toArray());
            Field12059.add("Texs: " + Arrays.toString(var4));
            System.out.println("Texs: " + Arrays.toString(var4));
         }
      }

      boolean var11 = false;
      Iterator var17 = Field12157.values().iterator();

      Class867 var13;
      while(var17.hasNext()) {
         byte[] var20;
         if ((var13 = (Class867)var17.next()).Method14536() && (var20 = Class128.Method1322(var13.Method14537())) != null) {
            var13.Field2641 = var20;
            var11 = true;
         }
      }

      if (var11) {
         Player.aBoolean = true;
         ItemDef.Method11904();
         Model.Method14474();
         NPCDefinition.Method11883();

         for(int var15 = 0; var15 < Field12328; ++var15) {
            Npc var18;
            if ((var18 = this.Field12327[this.Field12329[var15]]) != null && var18.Field4103 != null) {
               var18.Field4103 = NPCDefinition.Method11884(var18.Field4103.interactingEntity);
            }
         }
      }

      if (this.Field12159 != null) {
         Model.Method14458();
         String[] var22 = this.Field12159;
         int var21 = this.Field12159.length;

         for(int var19 = 0; var19 < var21; ++var19) {
            String var16 = var22[var19];

            try {
               int var23 = 481;
               String[] var12;
               String var14;
               if ((var14 = (var12 = var16.split(":?\\\\"))[var12.length - 1]).contains("~")) {
                  var23 = Integer.parseInt(var14.replace(".dat", "").replace(".mqo", "").replace(".emps", "").split("~")[1]);
               }

               byte[] var9;
               if ((var9 = Class128.Method1322(var16)) == null) {
                  this.Method13334("Error loading " + var16 + ": File not found.");
               } else {
                  (var13 = new Class867(var23, var16)).Field2641 = var9;
                  Field12157.put(var23, var13);
               }

               this.Method13334("Loaded " + var14 + " --> " + var23);
            } catch (Exception var10) {
               var10.printStackTrace();
            }
         }

         if (this.Field12159 != null) {
            Player.aBoolean = true;
            ItemDef.Method11904();
            Method13323();
            this.Field12159 = null;
         }

      }
   }

   public final void Method13226(int var1, int var2) {
      this.Field12168 = var1;
      this.Field12169 = var2;
      Field12596 = false;
      if (Field12527 != var1 || Field12528 != var2) {
         Field12527 = var1;
         Field12528 = var2;
         Method13407(Field12527 - 6 << 3, Field12528 - 6 << 3);
         this.Field12582 = (Field12527 / 8 == 48 || Field12527 / 8 == 49) && Field12528 / 8 == 48;
         if (Field12527 / 8 == 48 && Field12528 / 8 == 148) {
            this.Field12582 = true;
         }

         var1 = 0;

         int var3;
         for(var2 = (Field12527 - 6) / 8; var2 <= (Field12527 + 6) / 8; ++var2) {
            for(var3 = (Field12528 - 6) / 8; var3 <= (Field12528 + 6) / 8; ++var3) {
               ++var1;
            }
         }

         this.Field12622 = new byte[var1][];
         this.Field12668 = new byte[var1][];
         this.Field12657 = new int[var1];
         this.Field12658 = new int[var1];
         this.Field12659 = new int[var1];
         var1 = 0;

         int var4;
         for(var2 = (Field12527 - 6) / 8; var2 <= (Field12527 + 6) / 8; ++var2) {
            for(var3 = (Field12528 - 6) / 8; var3 <= (Field12528 + 6) / 8; ++var3) {
               this.Field12657[var1] = (var2 << 8) + var3;
               if (!this.Field12582 || var3 != 49 && var3 != 149 && var3 != 147 && var2 != 50 && (var2 != 49 || var3 != 47)) {
                  if ((var4 = this.Field12658[var1] = this.Field12526.Method1315(0, var3, var2)) != -1) {
                     this.Field12526.Method11960(3, var4);
                  }

                  int var5;
                  if ((var5 = this.Field12659[var1] = this.Field12526.Method1315(1, var3, var2)) != -1) {
                     this.Field12526.Method11960(3, var5);
                  }
               } else {
                  this.Field12658[var1] = -1;
                  this.Field12659[var1] = -1;
               }

               ++var1;
            }
         }

         var2 = Field12490 - Field12492;
         var3 = Field12491 - Field12493;
         Field12492 = Field12490;
         Field12493 = Field12491;

         for(var4 = 0; var4 < 16384; ++var4) {
            Npc var7;
            if ((var7 = this.Field12327[var4]) != null) {
               for(var1 = 0; var1 < 10; ++var1) {
                  var7.w_14[var1] -= var2;
                  var7.x_13[var1] -= var3;
               }

               var7.Field4194 -= var2 << 7;
               var7.Field4195 -= var3 << 7;
            }
         }

         for(var4 = 0; var4 < this.Field12361; ++var4) {
            Player var8;
            if ((var8 = this.session_players[var4]) != null) {
               for(var1 = 0; var1 < 10; ++var1) {
                  var8.w_14[var1] -= var2;
                  var8.x_13[var1] -= var3;
               }

               var8.Field4194 -= var2 << 7;
               var8.Field4195 -= var3 << 7;
            }
         }

         if (Field12679 != 0) {
            Field12679 -= var2;
            Field12680 -= var3;
         }

         this.Field12597 = false;
         byte var6 = 1;
         this.Method13210(var6, 0, 0);
      }
   }

   public final void Method13227(int var1) {
      if (var1 == 0) {
         this.Field12519 = 0;
         this.Method13231();
         this.Field12482 = 0;
         byte var2 = 2;
         this.Method13210(var2, 0, 0);
      }

   }

   private void Method13228() {
      Field12714 = this.Method13236() - 765;
      Field12715 = this.Method13237() - 503;
      width = Field12714 + 765;
      height = Field12715 + 503;

      try {
         Rasterizer.Method14494(width, height);
         this.Field12619 = Rasterizer.Field9961;
         Rasterizer.Method14494(width, height);
         this.Field12620 = Rasterizer.Field9961;
         Rasterizer.Method14494(width, height);
         this.Field12621 = Rasterizer.Field9961;
      } catch (Exception var5) {
         var5.printStackTrace();
      }

      int[] var1 = new int[9];

      for(int var2 = 0; var2 < 9; ++var2) {
         int var3 = 128 + (var2 << 5) + 15;
         int var4 = Field12134 + var3 * 3;
         var3 = Rasterizer.Field9959[var3];
         var1[var2] = var4 * var3 >> 16;
      }

      SceneGraph.Method8883();
   }

   public static synchronized void Method13229(int var0, int var1, int var2) {
      if (Field12177) {
         if (Field12175 == null) {
            String var3 = System.getProperty("user.home");
            String var4 = var3 + "/Desktop/maps/tiles.bin";

            try {
               (Field12175 = new RandomAccessFile(var4, "rw")).seek(Field12175.length());
            } catch (IOException var7) {
               Field12175 = null;
               var7.printStackTrace();
               return;
            }
         }

         RandomAccessFile var8 = Field12175;
         synchronized(Field12175) {
            try {
               Field12175.writeShort(var0);
               Field12175.writeShort(var1);
               Field12175.writeByte(var2);
            } catch (IOException var5) {
               var5.printStackTrace();
            }

         }
      }
   }

   public static void Method13230(int var0, int var1, int var2, int var3, int var4, int var5) {
      if (Field12177) {
         if (Field12176 == null) {
            String var6 = System.getProperty("user.home");
            String var7 = var6 + "/Desktop/maps/objects.bin";

            try {
               (Field12176 = new RandomAccessFile(var7, "rw")).seek(Field12176.length());
            } catch (IOException var10) {
               Field12176 = null;
               var10.printStackTrace();
               return;
            }
         }

         RandomAccessFile var11 = Field12176;
         synchronized(Field12176) {
            try {
               Field12176.writeShort(var3);
               Field12176.writeShort(var0);
               Field12176.writeShort(var1);
               Field12176.writeByte(var2);
               Field12176.writeByte(var5);
               Field12176.writeByte(var4);
            } catch (IOException var8) {
               var8.printStackTrace();
            }

         }
      }
   }

   private void Method13231() {
      Field12694 = 0;
      Field12574 = 0;
      Field12369 = 0;
      Field12624 = 0;
      this.Field12637 = 0;
      this.Field12610 = 0;
      this.Field12274 = true;
   }

   private boolean Method13232() {
      return this.Field12444[173] == 1;
   }

   public static String Method13233(String var0) {
      for(int var1 = 0; var1 < var0.length(); ++var1) {
         if (var1 == 0) {
            var0 = String.format("%s%s", Character.toUpperCase(var0.charAt(0)), var0.substring(1));
         }

         if (!Character.isLetterOrDigit(var0.charAt(var1)) && var1 + 1 < var0.length()) {
            var0 = String.format("%s%s%s", var0.subSequence(0, var1 + 1), Character.toUpperCase(var0.charAt(var1 + 1)), var0.substring(var1 + 2));
         }
      }

      return var0;
   }

   private void Method13234(int var1) {
      this.openURL("https://emps-world.net/forum/index.php?topic=" + var1);
   }

   private void openURL(String commandURL) {
      String var2 = System.getProperty("os.name");

      try {
         if (var2.startsWith("Mac OS")) {
            Class.forName("com.apple.eio.FileManager").getDeclaredMethod("openURL", String.class).invoke((Object)null, commandURL);
         } else if (var2.startsWith("Windows")) {
            Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + commandURL);
         } else {
            String[] browsersNameString = new String[]{"firefox", "opera", "konqueror", "epiphany", "mozilla", "netscape", "safari"};
            String var3 = null;

            for(int var4 = 0; var4 < 7 && var3 == null; ++var4) {
               if (Runtime.getRuntime().exec(new String[]{"which", browsersNameString[var4]}).waitFor() == 0) {
                  var3 = browsersNameString[var4];
               }
            }

            if (var3 == null) {
               throw new Exception("Could not find web browser");
            } else {
               Runtime.getRuntime().exec(new String[]{var3, commandURL});
            }
         }
      } catch (Exception var5) {
         this.pushMessage("Failed to open URL.", 0, "");
      }
   }

   public final int Method13236() {
      return (int)((double)super.Method11953() * Field12138);
   }

   public final int Method13237() {
      return (int)((double)super.Method11954() * Field12138);
   }

   private void Method13238() {
      ArrayList var1 = new ArrayList();
      ArrayList var2 = new ArrayList();
      ArrayList var3 = new ArrayList();

      int var4;
      for(var4 = 0; var4 < this.Field12323.length; ++var4) {
         if (this.Field12323[var4] >= 8) {
            if (this.Field12212 == this.Field12323[var4] - 9) {
               var1.add(var4);
            } else {
               var2.add(var4);
            }
         } else {
            var3.add(var4);
         }
      }

      var4 = 0;
      int[] var5 = new int[this.Field12323.length];
      String[] var6 = new String[this.Players.length];
      long[] var7 = new long[this.Field12437.length];

      Iterator var8;
      int var9;
      for(var8 = var1.iterator(); var8.hasNext(); ++var4) {
         var9 = (Integer)var8.next();
         var5[var4] = this.Field12323[var9];
         var6[var4] = this.Players[var9];
         var7[var4] = this.Field12437[var9];
      }

      for(var8 = var2.iterator(); var8.hasNext(); ++var4) {
         var9 = (Integer)var8.next();
         var5[var4] = this.Field12323[var9];
         var6[var4] = this.Players[var9];
         var7[var4] = this.Field12437[var9];
      }

      for(var8 = var3.iterator(); var8.hasNext(); ++var4) {
         var9 = (Integer)var8.next();
         var5[var4] = this.Field12323[var9];
         var6[var4] = this.Players[var9];
         var7[var4] = this.Field12437[var9];
      }

      this.Field12323 = var5;
      this.Players = var6;
      this.Field12437 = var7;
   }

   private void Method13239(boolean var1) {
      if (class329 != null && !class329.Method3389()) {
         if (Field12177) {
            Field12177 = false;
            RandomAccessFile var2;
            if (Field12176 != null) {
               var2 = Field12176;
               synchronized(Field12176) {
                  try {
                     Field12176.close();
                  } catch (IOException var6) {
                     var6.printStackTrace();
                  }

                  Field12176 = null;
               }
            }

            if (Field12175 != null) {
               var2 = Field12175;
               synchronized(Field12175) {
                  try {
                     Field12175.close();
                  } catch (IOException var4) {
                     var4.printStackTrace();
                  }

                  Field12175 = null;
               }
            }
         }

         class329.clear();
         if (var1) {
            class329 = new Class329(this);
            return;
         }

         this.Field12650 = 0;
         Field12649 = true;
      }

   }

   public final void Method13240() {
      if (!Field12120) {
         if (this.Field12501[5] <= 0 || this.Field12501[3] <= 0) {
            this.Field12501[3] = 1;
            this.Field12501[5] = 1;
         }

         int var1 = 3407616;
         int var2;
         if ((var2 = this.Field12380[3] * 100 / this.Field12501[3]) < 25) {
            var1 = 16059661;
         } else if (var2 < 50) {
            var1 = 16557575;
         } else if (var2 < 75) {
            var1 = 16776960;
         }

         double var3 = (double)var2 / 3.703D;
         var3 = 27.0D - var3;
         int var5 = 533 + Field12714 + this.Field12291;
         int var6 = 48 + this.Field12292;
         float var7 = (float)(currentTime % 35) / 35.0F;
         if (var2 < 25) {
            var2 = 10 + (int)(245.0F * var7);
         } else {
            var2 = 255;
         }

         if (Field12712) {
            this.Field12185.Method14495(var5, var6);
            this.Field12189.Method14495(var5 + 27, var6 + 3);
            if (var3 > 0.0D) {
               this.Field12187.Field9878 = Method13218("emptyorb-" + (int)var3);
               RgbImage.Method879(this.Field12187, 0, 0, 27, (int)var3).Method14495(var5 + 27, var6 + 3);
            }

            this.Field12191.Method892(var5 + 33, var6 + 11, var2);
            if (this.Field12380[3] < 10) {
               smallFont.addButton(true, var5 + 5, var1, "  " + this.Field12380[3], var6 + 26);
            } else if (this.Field12380[3] > 99) {
               smallFont.addButton(true, var5 + 7, var1, this.Field12380[3] + " ", var6 + 26);
            } else {
               smallFont.addButton(true, var5 + 5, var1, " " + this.Field12380[3], var6 + 26);
            }
         } else {
            var5 = 168;
            if (GraphicsDisplay.Field2678 && !Field12712) {
               if (this.Field12605 != null) {
                  this.Field12605.Method13683();
               }

               var5 += 520;
            }

            this.Field12186.Method14495(var5, 15);
            this.Field12189.Method14495(var5 + 2, 18);
            if (var3 > 0.0D) {
               this.Field12187.Field9878 = Method13218("emptyorb-" + (int)var3);
               RgbImage.Method879(this.Field12188, 0, 0, 27, (int)var3).Method14495(var5 + 2, 18);
            }

            this.Field12191.Method892(var5 + 8, 26, var2);
            if (this.Field12380[3] < 10) {
               smallFont.addButton(true, var5 + 30, var1, "  " + this.Field12380[3], 41);
            } else if (this.Field12380[3] > 99) {
               smallFont.addButton(true, var5 + 32, var1, this.Field12380[3] + " ", 41);
            } else {
               smallFont.addButton(true, var5 + 30, var1, " " + this.Field12380[3], 41);
            }
         }

         var1 = 3407616;
         if ((var2 = this.Field12380[5] * 100 / this.Field12501[5]) < 25) {
            var1 = 16059661;
         } else if (var2 < 50) {
            var1 = 16557575;
         } else if (var2 < 75) {
            var1 = 16776960;
         }

         double var10 = (double)var2 / 3.703D;
         var10 = 27.0D - var10;
         var5 = 532 + Field12714 + this.Field12291;
         var6 = 86 + this.Field12292;
         if (var2 < 25) {
            var2 = 10 + (int)(245.0F * var7);
         } else {
            var2 = 255;
         }

         if (Field12712) {
            this.Field12185.Method14495(var5, var6);
            this.Field12190.Method14495(var5 + 27, var6 + 3);
            if (var10 > 0.0D) {
               this.Field12187.Field9878 = Method13218("emptyorb-" + (int)var10);
               RgbImage.Method879(this.Field12187, 0, 0, 27, (int)var10).Method14495(var5 + 27, var6 + 3);
            }

            this.Field12192.Method892(var5 + 31, var6 + 7, var2);
            if (this.Field12380[5] < 10) {
               smallFont.addButton(true, var5 + 5, var1, "  " + this.Field12380[5], var6 + 26);
            } else if (this.Field12380[5] > 99) {
               smallFont.addButton(true, var5 + 7, var1, this.Field12380[5] + " ", var6 + 26);
            } else {
               smallFont.addButton(true, var5 + 5, var1, " " + this.Field12380[5], var6 + 26);
            }
         } else {
            var5 = 181;
            if (GraphicsDisplay.Field2678 && !Field12712) {
               var5 += 520;
            }

            this.Field12186.Method14495(var5, 57);
            this.Field12190.Method14495(var5 + 2, 60);
            if (var10 > 0.0D) {
               this.Field12188.Field9878 = Method13218("emptyorb-" + (int)var10);
               RgbImage.Method879(this.Field12188, 0, 0, 27, (int)var10).Method14495(var5 + 2, 60);
            }

            this.Field12192.Method892(var5 + 6, 64, var2);
            if (this.Field12380[5] < 10) {
               smallFont.addButton(true, var5 + 30, var1, "  " + this.Field12380[5], 83);
            } else if (this.Field12380[5] > 99) {
               smallFont.addButton(true, var5 + 32, var1, this.Field12380[5] + " ", 83);
            } else {
               smallFont.addButton(true, var5 + 30, var1, " " + this.Field12380[5], 83);
            }
         }

         var1 = 3407616;
         var2 = this.Field12584;
         if ((var2 = this.Field12584 * 100 / 100) < 25) {
            var1 = 16059661;
         } else if (var2 < 50) {
            var1 = 16557575;
         } else if (var2 < 75) {
            var1 = 16776960;
         }

         double var15 = (double)var2 / 3.703D;
         var15 = 27.0D - var15;
         var5 = 545 + Field12714 + this.Field12291;
         var6 = 122 + this.Field12292;
         if (var2 < 25) {
            var2 = 10 + (int)(245.0F * var7);
         } else {
            var2 = 255;
         }

         if (Field12712) {
            this.Field12185.Method14495(var5, var6);
            if (this.Method13232()) {
               this.Field12194.Method14495(var5 + 28, var6 + 4);
            } else {
               this.Field12193.Method14495(var5 + 27, var6 + 3);
            }

            if (var15 > 0.0D) {
               this.Field12187.Field9878 = Method13218("emptyorb-" + (int)var15);
               RgbImage.Method879(this.Field12187, 0, 0, 27, (int)var15).Method14495(var5 + 27, var6 + 3);
            }

            if (!Method13353(var5 + 33 + 7, var6 + 8 + 9, 16, super.mouseEventX, super.mouseEventY)) {
               this.Field12098 = false;
               if (this.Method13232()) {
                  this.Field12196.Method892(var5 + 33, var6 + 8, var2);
               } else {
                  this.Field12195.Method892(var5 + 33, var6 + 8, var2);
               }
            } else {
               this.Field12098 = true;
               if (this.Method13232()) {
                  this.Field12198.Method892(var5 + 33, var6 + 8, var2);
               } else {
                  this.Field12197.Method892(var5 + 33, var6 + 8, var2);
               }
            }

            if (this.Field12584 < 10) {
               smallFont.addButton(true, var5 + 5, var1, "  " + this.Field12584, var6 + 26);
            } else if (this.Field12584 > 99) {
               smallFont.addButton(true, var5 + 5, var1, this.Field12584 + " ", var6 + 26);
            } else {
               smallFont.addButton(true, var5 + 5, var1, " " + this.Field12584, var6 + 26);
            }
         } else {
            var5 = 178;
            if (GraphicsDisplay.Field2678 && !Field12712) {
               var5 += 520;
            }

            this.Field12186.Method14495(var5, 97);
            if (this.Method13232()) {
               this.Field12194.Method14495(var5 + 3, 101);
            } else {
               this.Field12193.Method14495(var5 + 2, 100);
            }

            if (var15 > 0.0D) {
               this.Field12188.Field9878 = Method13218("emptyorb-" + (int)var15);
               RgbImage.Method879(this.Field12188, 0, 0, 27, (int)var15).Method14495(var5 + 2, 100);
            }

            if (!Method13353(var5 + 9 + 7, 114, 16, super.mouseEventX, super.mouseEventY)) {
               this.Field12098 = false;
               if (this.Method13232()) {
                  this.Field12196.Method892(var5 + 9, 105, var2);
               } else {
                  this.Field12195.Method892(var5 + 9, 105, var2);
               }
            } else {
               this.Field12098 = true;
               if (this.Method13232()) {
                  this.Field12198.Method892(var5 + 9, 105, var2);
               } else {
                  this.Field12197.Method892(var5 + 9, 105, var2);
               }
            }

            if (this.Field12584 < 10) {
               smallFont.addButton(true, var5 + 30, var1, "  " + this.Field12584, 123);
            } else if (this.Field12584 > 99) {
               smallFont.addButton(true, var5 + 30, var1, this.Field12584 + " ", 123);
            } else {
               smallFont.addButton(true, var5 + 30, var1, " " + this.Field12584, 123);
            }
         }

         var5 = 707 + Field12714 + this.Field12291;
         var6 = 123 + this.Field12292;
         if (!Field12712) {
            var5 = 6;
            var6 = 125;
            if (GraphicsDisplay.Field2678 && !Field12712) {
               var5 += 520;
               var6 -= 6;
            }
         }

         this.Field12199.Method14495(var5, var6);
         if (Method13353(var5 + 17 + 3, var6 + 17 + 3, 20, super.mouseEventX, super.mouseEventY)) {
            this.Field12095 = true;
            this.Field12201.Method14495(var5 + 5, var6 + 5);
         } else {
            this.Field12095 = false;
            this.Field12200.Method14495(var5 + 5, var6 + 5);
         }

         var1 = Field12712 ? var5 - 28 : var5 - 1;
         var2 = Field12712 ? var6 + 28 : var6 - 36;
         String var17;
         if (Method13353(var1 + 16, var2 + 17, 17, super.mouseEventX, super.mouseEventY)) {
            this.Field12096 = true;
            this.Field12420.Method14495(var1, var2);
            var17 = "Go-to Wiki.";
            if (!Field12712) {
               var1 -= 69;
               var2 -= 33;
            }

            this.Field12286.add(new Class663(var1, var2 + 36, var17));
         } else {
            this.Field12096 = false;
            this.Field12419.Method14495(var1, var2);
         }

         if (this.Field12479 == 197 && this.Field12111 > 0) {
            this.Field12097 = false;
            var1 = this.Field12111;
            byte var18;
            if (Field12712) {
               var5 = 584 + Field12714 + this.Field12291;
               var6 = 153 + this.Field12292;
               this.Field12185.Method14495(var5, var6);
               this.Field12719[50].Method14495(var5 + 33, var6 + 8);
               var17 = Method13280(var1);
               var18 = 3;
               if (var17.length() < 4) {
                  var18 = 5;
               }

               smallFont.addButton(true, var5 + var18, 3407616, var17, var6 + 26);
            } else {
               var5 = 677 + Field12714 + this.Field12291;
               this.Field12186.Method14495(var5, 131);
               this.Field12719[50].Method14495(var5 + 8, 139);
               var17 = Method13280(var1);
               var18 = 30;
               if (var17.length() < 4) {
                  var18 = 32;
               }

               smallFont.addButton(true, var5 + var18, 3407616, var17, 157);
            }
         } else {
            var1 = 584 + Field12714 + this.Field12291 + 27;
            var2 = 153 + this.Field12292 + 3;
            if (!Field12712) {
               var1 = 526;
               var2 = 50;
            }

            this.Field12423.Method14495(var1 - 3, var2 - 3);
            if (Method13353(var1 + 14, var2 + 16, 17, super.mouseEventX, super.mouseEventY)) {
               this.Field12097 = true;
               this.Field12422.Method14495(var1 + 1, var2);
               var17 = "Emps Credits: " + String.format("%,d", this.Field12112);
               if (!Field12712) {
                  var1 -= 100;
                  var2 -= 34;
               }

               this.Field12286.add(new Class663(var1, var2 + 34, var17));
            } else {
               this.Field12097 = false;
               this.Field12421.Method14495(var1, var2);
            }
         }
      }
   }

   private static String Method13241(int var0) {
      String var2;
      for(int var1 = (var2 = String.valueOf(var0)).length() - 3; var1 > 0; var1 -= 3) {
         var2 = var2.substring(0, var1) + "," + var2.substring(var1);
      }

      if (var2.length() > 8) {
         var2 = "100" + var2.substring(0, var2.length() - 8) + " million @whi@(" + var2 + ")";
      } else if (var2.length() > 4) {
         var2 = "100000" + var2.substring(0, var2.length() - 4) + "K @whi@(" + var2 + ")";
      }

      return " " + var2;
   }

   private boolean Method13242(int var1) {
      if (var1 < 0) {
         return false;
      } else {
         if ((var1 = this.Field12550[var1]) >= 2000) {
            var1 -= 2000;
         }

         return var1 == 337;
      }
   }

   private void Method13243() {
      boolean var1 = true;
      if (!Field12120) {
         if (!Field12712) {
            if (GraphicsDisplay.Field2678 && this.Field12605 != null) {
               this.Field12605.Method13683();
            } else {
               this.Field12606.Method13683();
            }
         }

         if (Field12593) {
            Rasterizer.Field9961 = this.Field12619;
         }

         int var2 = !Field12712 && !GraphicsDisplay.Field2678 ? 0 : Field12715 + 338;
         if (Field12712) {
            this.Field12313.Method893(0, var2 + 0);
         } else {
            this.Field12313.Method14495(0, var2 + 0);
         }

         int var7;
         int var8;
         int var10;
         int var12;
         int var14;
         if (Field12593 && session_player.name != null) {
            byte[] var3 = session_player.name.getBytes(Field12122);
            long var4 = System.currentTimeMillis();
            ByteBuffer var6 = ByteBuffer.allocate(10 + var3.length + 8);
            var7 = Field12490 + (session_player.Field4194 - 6 >> 7);
            var8 = Field12491 + (session_player.Field4195 - 6 >> 7);
            var6.putInt(var7);
            var6.putInt(var8);
            var6.put((byte)this.k_41);
            var6.put((byte)var3.length);
            var6.put(var3, 0, var3.length);
            var6.putLong(var4);
            int var9 = 0;

            for(var10 = 0; var10 < 4; ++var10) {
               var9 += 10;
               Class697.Method8269(1, var2, var9++, 3485469, 1);
               Class697.Method8269(1, var2, var9++, 3680542, 1);
               Class697.Method8269(1, var2, var9++, 3812632, 1);
               byte[] var5;
               var14 = (var5 = var6.array()).length;

               for(var12 = 0; var12 < var14; ++var12) {
                  byte var26 = var5[var12];
                  var7 = (var7 = 3670016 | (var26 >> 5 & 7) << 16) | 10240 | (var26 >> 2 & 7) << 8 | 24 | var26 & 3;
                  Class697.Method8269(1, var2, var9++, var7, 1);
               }
            }
         }

         Client var13 = this;

         try {
            var14 = !Field12712 && !GraphicsDisplay.Field2678 ? 0 : Field12715 + 338;
            String[] var17 = new String[]{"On", "Friends", "Off", "Hide"};
            int[] var19 = new int[]{65280, 16776960, 16711680, 65535};
            switch(var13.Field12233) {
            case 0:
               var13.Field12314[1].Method14495(5, var14 + 142);
               break;
            case 1:
               var13.Field12314[1].Method14495(71, var14 + 142);
               break;
            case 2:
               var13.Field12314[1].Method14495(137, var14 + 142);
               break;
            case 3:
               var13.Field12314[1].Method14495(203, var14 + 142);
               break;
            case 4:
               var13.Field12314[1].Method14495(269, var14 + 142);
               break;
            case 5:
               var13.Field12314[1].Method14495(335, var14 + 142);
            }

            if (var13.Field12232 == var13.Field12233) {
               switch(var13.Field12232) {
               case 0:
                  var13.Field12314[2].Method14495(5, var14 + 142);
                  break;
               case 1:
                  var13.Field12314[2].Method14495(71, var14 + 142);
                  break;
               case 2:
                  var13.Field12314[2].Method14495(137, var14 + 142);
                  break;
               case 3:
                  var13.Field12314[2].Method14495(203, var14 + 142);
                  break;
               case 4:
                  var13.Field12314[2].Method14495(269, var14 + 142);
                  break;
               case 5:
                  var13.Field12314[2].Method14495(335, var14 + 142);
                  break;
               case 6:
                  var13.Field12314[3].Method14495(404, var14 + 142);
               }
            } else {
               switch(var13.Field12232) {
               case 0:
                  var13.Field12314[0].Method14495(5, var14 + 142);
                  break;
               case 1:
                  var13.Field12314[0].Method14495(71, var14 + 142);
                  break;
               case 2:
                  var13.Field12314[0].Method14495(137, var14 + 142);
                  break;
               case 3:
                  var13.Field12314[0].Method14495(203, var14 + 142);
                  break;
               case 4:
                  var13.Field12314[0].Method14495(269, var14 + 142);
                  break;
               case 5:
                  var13.Field12314[0].Method14495(335, var14 + 142);
                  break;
               case 6:
                  var13.Field12314[3].Method14495(404, var14 + 142);
               }
            }

            smallFont.addButton(true, 425, 16777215, "Report Abuse", var14 + 157);
            smallFont.addButton(true, 26, 16777215, "All", var14 + 157);
            smallFont.addButton(true, 86, 16777215, "Game", var14 + 157);
            smallFont.addButton(true, 150, 16777215, "Public", var14 + 152);
            smallFont.addButton(true, 212, 16777215, "Private", var14 + 152);
            smallFont.addButton(true, 286, 16777215, "Clan", var14 + 152);
            smallFont.addButton(true, 349, 16777215, "Trade", var14 + 152);
            smallFont.Method9449(var19[var13.Field12702], 164, var17[var13.Field12702], var14 + 161, true);
            smallFont.Method9449(var19[var13.Field12333], 230, var17[var13.Field12333], var14 + 161, true);
            smallFont.Method9449(var19[var13.Field12306], 296, var17[var13.Field12306], var14 + 161, true);
            smallFont.Method9449(var19[var13.Field12669], 362, var17[var13.Field12669], var14 + 161, true);
         } catch (Exception var11) {
            var11.printStackTrace();
            this.Method13312();
         }

         if (this.Field12676 && this.Field12521 != 3) {
            boldFont.Method9447(0, this.Field12564, var2 + 60, 259);
            boldFont.Method9447(128, this.Field12639 + "*", var2 + 80, 259);
         } else if (this.Field12650 == 1) {
            boldFont.Method9447(0, "Enter amount:", var2 + 60, 259);
            boldFont.Method9447(128, this.Field12470 + "*", var2 + 80, 259);
         } else if (this.Field12650 == 2) {
            boldFont.Method9447(0, "Enter name:", var2 + 60, 259);
            boldFont.Method9447(128, this.Field12470 + "*", var2 + 80, 259);
         } else {
            int var18;
            int var23;
            String var28;
            String var29;
            if (this.Field12650 == 4) {
               String var15;
               if (this.Field12143 == 0) {
                  var15 = "Search item:";
               } else if (this.Field12143 == 1) {
                  var15 = "Find place:";
               } else {
                  var15 = "Search:";
               }

               plainFont.Method9447(0, var15, var2 + 133, 44);
               plainFont.Method9448(128, this.Field12639 + "*", var2 + 133, 17 + plainFont.Method9451(var15));
               if (this.Field12639.length() > 0 && !this.Field12214.equals(this.Field12639)) {
                  String var16 = Class23.Method206(this.Field12639.toLowerCase());

                  for(var18 = 0; var18 < this.Field12398.length; ++var18) {
                     this.Field12398[var18] = "";
                     this.Field12426[var18] = 0;
                  }

                  this.Field12215 = 0;
                  label427:
                  switch(this.Field12143) {
                  case 0:
                     Iterator var22 = ItemDef.Field10608.entrySet().iterator();

                     while(true) {
                        if (!var22.hasNext()) {
                           break label427;
                        }

                        Entry var24 = (Entry)var22.next();
                        if (this.Field12215 >= this.Field12398.length) {
                           break label427;
                        }

                        var28 = Class23.Method206(((String)var24.getValue()).toLowerCase());
                        var8 = (Integer)var24.getKey();
                        if (var28 != null && var28.contains(var16)) {
                           this.Field12426[this.Field12215] = var8;
                           this.Field12398[this.Field12215++] = (String)var24.getValue();
                        }
                     }
                  case 1:
                     var16 = var16.replaceAll(" ", "");
                     var18 = -1;
                     Iterator var25 = Class329.Field2502.Method3462().iterator();

                     while(var25.hasNext()) {
                        Class330 var20 = (Class330)var25.next();
                        ++var18;
                        if (this.Field12215 >= this.Field12398.length) {
                           break;
                        }

                        if ((var29 = Class23.Method206(var20.Method3412())) != null && var29.contains(var16)) {
                           this.Field12426[this.Field12215] = var18;
                           this.Field12398[this.Field12215++] = var20.Method3411().replaceAll("[.]", "").replaceAll("[\\n]", "");
                        }
                     }

                     var18 = -1;
                     var25 = Class329.Field2502.Method3461().iterator();

                     while(var25.hasNext()) {
                        Class328 var21 = (Class328)var25.next();
                        --var18;
                        if (this.Field12215 >= this.Field12398.length) {
                           break;
                        }

                        if ((var29 = Class23.Method206(var21.Method3377().toLowerCase())) != null && var29.contains(var16)) {
                           this.Field12426[this.Field12215] = var18;
                           this.Field12398[this.Field12215++] = var21.Method3377().replaceAll("[.]", "").replaceAll("[\\n]", "");
                        }
                     }
                  }

                  this.Field12214 = this.Field12639;
               }

               Class697.Method11985(var2 + 122, 8, 497, 7);
               var14 = -3;
               if (this.Field12215 > 0) {
                  this.Field12399.Method14495(25, var2 + 50);
               }

               for(var18 = 0; var18 < this.Field12215; ++var18) {
                  if ((var23 = 70 - var14 * 14 + Field12545 + 5) > 16 && var23 < 215) {
                     var28 = this.Field12398[var18];
                     var8 = this.Field12426[var18];
                     RSFont var32 = plainFont;
                     if (this.Field12216 == var18) {
                        var32 = boldFont;
                        RgbImage var31;
                        if (this.Field12143 != 1 && (var31 = ItemDef.Method11916(var8, 48)) != null) {
                           var31.Method14495(20, var2 + 50 + 3 - 8);
                        }
                     }

                     var32.addButton(false, 80, 0, var28, var23 + var2);
                  }

                  ++var14;
               }

               this.Method13244(this.Field12215, var2);
               if (GraphicsDisplay.Field2678) {
                  GraphicsDisplay.Method997().Method1010(7, var2 + 121, 506, 1, 8418912, this);
               } else {
                  Class697.Method11989(var2 + 121, 8418912, 506, 7);
               }
            } else if (this.Field12332 != null) {
               boldFont.Method9447(0, this.Field12332, 60, 259);
               boldFont.Method9447(128, "Click to continue", var2 + 80, 259);
            } else if (this.Field12693 != -1) {
               this.Method13362(0, 20, RSInterface.Field12749[this.Field12693], var2 + 20);
            } else if (this.Field12500 != -1) {
               this.Method13362(0, 20, RSInterface.Field12749[this.Field12500], var2 + 20);
            } else {
               this.Field12217 = false;
               var1 = false;
               var12 = -3;
               var14 = 0;
               Class697.Method11985(var2 + 122, 8, 497, 7);

               for(var18 = 0; var18 < 512; ++var18) {
                  if (this.Field12397[var18] != null) {
                     var23 = this.Field12394[var18];
                     var7 = 70 - var12 * 14 + Field12545 + 5;
                     var29 = this.Field12396[var18];
                     byte var33 = 0;
                     if (var29 != null && var29.startsWith("@cr1@")) {
                        var29 = var29.substring(5);
                        var33 = 1;
                     } else if (var29 != null && var29.startsWith("@cr2@")) {
                        var29 = var29.substring(5);
                        var33 = 2;
                     } else if (var29 != null && var29.startsWith("@cr3@")) {
                        var29 = var29.substring(5);
                        var33 = 3;
                     } else if (var29 != null && var29.startsWith("@irn@")) {
                        var29 = var29.substring(5);
                        var33 = 4;
                     }

                     if (var23 == 0 && (this.Field12312 == 5 || this.Field12312 == 0)) {
                        if (var7 > 16 && var7 < 215) {
                           plainFont.addButton(false, 11, 0, this.Field12397[var18], var7 + var2);
                        }

                        ++var14;
                        ++var12;
                     }

                     if ((var23 == 1 || var23 == 2) && (var23 == 1 || this.Field12702 == 0 || this.Field12702 == 1 && this.Method13365(var29)) && (this.Field12312 == 1 || this.Field12312 == 0)) {
                        if (var7 > 16 && var7 < 215) {
                           var10 = 11;
                           if (var33 == 1) {
                              this.Field12178[0].Method14495(12, var7 - 12 + var2);
                              var10 += 14;
                           } else if (var33 == 2) {
                              this.Field12178[1].Method14495(12, var7 - 12 + var2);
                              var10 += 14;
                           } else if (var33 == 3) {
                              this.Field12178[1].Method14495(12, var7 - 12 + var2);
                              var10 += 14;
                           } else if (var33 == 4) {
                              this.Field12178[2].Method14495(12, var7 - 12 + var2);
                              var10 += 14;
                           }

                           if (var29.contains(">")) {
                              plainFont.Method9453(0, var29, var7 + var2, var10);
                              var10 += plainFont.Method9451(var29) + 4;
                           } else {
                              plainFont.Method9453(0, var29 + ":", var7 + var2, var10);
                              var10 += plainFont.Method9451(var29) + 6;
                           }

                           plainFont.addButton(false, var10, 255, this.Field12397[var18], var7 + var2);
                        }

                        ++var14;
                        ++var12;
                     }

                     if ((var23 == 3 || var23 == 7) && (this.Field12632 == 0 || this.Field12312 == 2) && (var23 == 7 || this.Field12333 == 0 || this.Field12333 == 1 && this.Method13365(var29)) && (this.Field12312 == 2 || this.Field12312 == 0)) {
                        if (var7 > 16 && var7 < 215) {
                           plainFont.Method9453(0, "From", var7 + var2, 11);
                           var10 = 11 + plainFont.Method9451("From ");
                           if (var33 == 1) {
                              this.Field12178[0].Method14495(var10, var7 - 12 + var2);
                              var10 += 12;
                           } else if (var33 == 2) {
                              this.Field12178[1].Method14495(var10, var7 - 12 + var2);
                              var10 += 12;
                           } else if (var33 == 3) {
                              this.Field12178[1].Method14495(var10, var7 - 12 + var2);
                              var10 += 12;
                           } else if (var33 == 4) {
                              this.Field12178[2].Method14495(var10, var7 - 12 + var2);
                              var10 += 12;
                           }

                           plainFont.Method9453(0, var29 + ":", var7 + var2, var10);
                           var10 += plainFont.Method9451(var29) + 8;
                           plainFont.Method9453(8388608, this.Field12397[var18], var7 + var2, var10);
                        }

                        ++var14;
                        ++var12;
                     }

                     if (var23 == 4 && (this.Field12669 == 0 || this.Field12669 == 1 && this.Method13365(var29)) && (this.Field12312 == 3 || this.Field12312 == 0)) {
                        if (var7 > 16 && var7 < 215) {
                           plainFont.Method9453(8388736, var29 + " " + this.Field12397[var18], var7 + var2, 11);
                        }

                        ++var14;
                        ++var12;
                     }

                     if (var23 == 5 && this.Field12632 == 0 && this.Field12333 < 2 && (this.Field12312 == 2 || this.Field12312 == 0)) {
                        if (var7 > 16 && var7 < 215) {
                           plainFont.Method9453(8388608, this.Field12397[var18], var7 + var2, 11);
                        }

                        ++var14;
                        ++var12;
                     }

                     if (var23 == 6 && (this.Field12632 == 0 || this.Field12312 == 2) && this.Field12333 < 2 && (this.Field12312 == 2 || this.Field12312 == 0)) {
                        if (var7 > 16 && var7 < 215) {
                           plainFont.Method9453(0, "To " + var29 + ":", var7 + var2, 11);
                           plainFont.Method9453(8388608, this.Field12397[var18], var7 + var2, 15 + plainFont.Method9451("To :" + var29));
                        }

                        ++var14;
                        ++var12;
                     }

                     if (var23 == 8 && (this.Field12669 == 0 || this.Field12669 == 1 && this.Method13365(var29))) {
                        if (this.Field12312 == 3 || this.Field12312 == 0) {
                           if (var7 > 16 && var7 < 215) {
                              plainFont.Method9453(8270336, var29 + " " + this.Field12397[var18], var7 + var2, 11);
                           }

                           ++var14;
                           ++var12;
                        }

                        if (var23 == 11 && this.Field12312 == 11) {
                           if (var7 > 16 && var7 < 215) {
                              plainFont.Method9453(8270336, var29 + " " + this.Field12397[var18], var7 + var2, 11);
                           }

                           ++var14;
                           ++var12;
                        }

                        if (var23 == 12) {
                           if (var7 > 16 && var7 < 215) {
                              plainFont.Method9453(8270336, this.Field12397[var18] + " @blu@" + var29, var7 + var2, 11);
                           }

                           ++var14;
                        }
                     }

                     if (var23 == 9 && (this.Field12312 == 5 || this.Field12312 == 0)) {
                        if (var7 > 16 && var7 < 215) {
                           plainFont.addButton(false, 9, 0, this.Field12397[var18] + "@blu@" + var29 + "@bla@.", var7 + var2);
                        }

                        ++var14;
                        ++var12;
                     }

                     if (var23 == 16 && (this.Field12306 == 0 || this.Field12306 == 1 && this.Method13365(var29)) || this.Field12311[var18] > 0 && this.Field12311[var18] < 200) {
                        var8 = plainFont.Method9451(this.Field12395[var18]);
                        if (this.Field12312 == 11 || this.Field12312 == 0) {
                           if (var7 > 16 && var7 < 215) {
                              switch(this.Field12311[var18]) {
                              case 1:
                                 var10 = var8 + 40;
                                 this.Field12178[0].Method14495(var10 - 18, var7 + var2 - 12);
                                 var10 += 14;
                                 break;
                              case 2:
                                 var10 = var8 + 40;
                                 this.Field12178[1].Method14495(var10 - 18, var7 + var2 - 12);
                                 var10 += 14;
                                 break;
                              case 3:
                                 var10 = var8 + 40;
                                 this.Field12178[1].Method14495(var10 - 18, var7 + var2 - 12);
                                 var10 += 14;
                                 break;
                              case 4:
                                 var10 = var8 + 40;
                                 this.Field12178[2].Method14495(var10 - 18, var7 + var2 - 12);
                                 var10 += 14;
                                 break;
                              default:
                                 var10 = var8 + 40;
                              }

                              plainFont.Method9453(0, "[", var7 + var2, 8);
                              plainFont.Method9453(255, this.Field12395[var18], var7 + var2, 14);
                              plainFont.Method9453(0, "]", var7 + var2, var8 + 14);
                              plainFont.Method9453(0, Method13233(this.Field12396[var18]) + ":", var7 + var2, var10 - 19);
                              var10 += plainFont.Method9451(this.Field12396[var18]) + 8;
                              plainFont.Method9453(8388608, this.Field12397[var18], var7 + var2, var10 - 20);
                           }

                           ++var14;
                           ++var12;
                        }
                     }
                  }
               }

               this.Method13244(var14, var2);
               String var30;
               if (session_player != null && session_player.name != null) {
                  var30 = session_player.name;
               } else {
                  var30 = Class23.Method207(this.myUsername);
               }

               byte var27 = 0;
               if (myPrivilege == 1) {
                  this.Field12178[0].Method14495(12, var2 + 123);
                  var27 = 15;
               } else if (myPrivilege == 2) {
                  this.Field12178[1].Method14495(12, var2 + 123);
                  var27 = 15;
               } else if (this.publicChatMode) {
                  this.Field12178[2].Method14495(12, var2 + 123);
                  var27 = 15;
               }

               if (this.Field12521 == 3 && this.Field12676) {
                  var28 = "To " + this.Field12564 + ":";
                  plainFont.Method9453(0, var28, var2 + 133, var27 + 11);
                  plainFont.Method9450(255, 14 + plainFont.Method9451(var28) + var27, this.Field12639 + "*", var2 + 133, false);
               } else {
                  plainFont.Method9453(0, var30 + ":", var2 + 133, var27 + 11);
                  plainFont.Method9450(255, 10 + plainFont.Method9451(var30 + ": ") + var27, this.Field12360 + "*", var2 + 133, false);
               }

               if (GraphicsDisplay.Field2678) {
                  GraphicsDisplay.Method997().Method1010(7, var2 + 121, 506, 1, 8418912, this);
               } else {
                  Class697.Method11989(var2 + 121, 8418912, 506, 7);
               }
            }
         }

         if (this.Field12358 && this.Field12430 == 2) {
            this.Method13275();
         }

         if (!Field12712) {
            this.Field12606.Method3038(338 + Field12715, super.Method11952(), 0);
         }

         this.Field12604.Method13683();
         if (Field12593) {
            Rasterizer.Field9961 = this.Field12621;
         }

         if (var1 && !this.Field12217) {
            this.Field12217 = true;
            Field12545 = 0;
         }

      }
   }

   private void Method13244(int var1, int var2) {
      if (super.mouseEventY > 336 + Field12715 && super.mouseEventX <= 520) {
         int var3 = this.d_91;
         if (this.d_91 > 0) {
            var3 = 14;
         } else if (var3 < 0) {
            var3 = -14;
         }

         int var4;
         int var5;
         if (this.Field12693 == -1 || this.Field12650 == 4) {
            this.Field12516.Field12762 = this.Field12638 - 111 - Field12545;
            this.Method13308(494, 111, super.mouseEventX, super.mouseEventY - 346 - Field12715, this.Field12516, 0, false, this.Field12638);
            if ((var4 = this.Field12638 - 111 - this.Field12516.Field12762) < 0) {
               var4 = 0;
            }

            if (var4 > this.Field12638 - 111) {
               var4 = this.Field12638 - 111;
            }

            var5 = Field12545 - var4;
            this.e_78 += var5;
         }

         if (this.e_78 != 0) {
            var3 = this.e_78;
            this.e_78 = 0;
         }

         Field12545 -= var3;
         if (this.Field12638 - Field12545 < 111) {
            Field12545 = this.Field12638 - 111;
         } else if (Field12545 < 0) {
            Field12545 = 0;
         } else {
            var4 = Field12545 % 14;
            var5 = 14 - var4;
            if (var4 != 0) {
               if (var5 <= var4) {
                  Field12545 += var5;
               } else {
                  Field12545 -= var4;
               }
            }
         }
      }

      Class697.Method14474();
      this.Field12638 = var1 * 14 + 13;
      if (this.Field12638 < 114) {
         this.Field12638 = 114;
      }

      if ((var1 = this.Field12638 - Field12545 - 111) < 0) {
         var1 = 0;
      }

      this.Method13266(114, var1, 7 + var2, 496, this.Field12638);
   }

   public final void startRunnable(Runnable var1, int var2) {
      Applet var10000 = Signlink.Field2957;
      GameShell.Method11971(var1);
   }

   private void Method13246() {
      if (this.Field12542 == 0) {
         int var1 = super.mouseButtonPressed;
         if (!Field12712 && this.Field12577 == 1 && super.clickX >= 516 && super.clickY >= 160 && super.clickX <= 765 && super.clickY <= 205) {
            var1 = 0;
         }

         int var2;
         int var3;
         int var4;
         int var12;
         if (this.Field12358) {
            if (var1 != 1) {
               var2 = super.mouseEventX;
               var3 = super.mouseEventY;
               if (this.Field12430 == 0) {
                  var2 -= 4;
                  var3 -= 4;
               }

               if (this.Field12430 == 1) {
                  var2 -= 519;
                  var3 -= 168;
               }

               if (this.Field12430 == 2) {
                  var3 -= 338;
               }

               if (this.Field12430 == 3) {
                  var2 -= 519;
               }

               if (var2 < this.Field12431 - 10 || var2 > this.Field12431 + this.Field12433 + 10 || var3 < this.Field12432 - 10 || var3 > this.Field12432 + this.Field12434 + 10) {
                  this.Field12358 = false;
                  if (this.Field12430 == 2) {
                     Field12649 = true;
                  }
               }
            }

            if (var1 == 1) {
               var2 = this.Field12431;
               var3 = this.Field12432;
               var4 = this.Field12433;
               var12 = super.clickX;
               var1 = super.clickY;
               if (this.Field12430 == 1) {
                  var12 -= 519;
                  var1 -= 168;
                  this.Field12202 = false;
               }

               if (this.Field12430 == 2) {
                  var1 -= 338;
               }

               if (this.Field12430 == 3) {
                  var12 -= 519;
               }

               int var6 = -1;

               for(int var7 = 0; var7 < this.Field12575; ++var7) {
                  int var8 = var3 + 31 + (this.Field12575 - 1 - var7) * 15;
                  if (var12 > var2 && var12 < var2 + var4 && var1 > var8 - 13 && var1 < var8 + 3) {
                     var6 = var7;
                  }
               }

               if (var6 != -1) {
                  this.Method13314(var6);
               }

               this.Field12358 = false;
               if (this.Field12430 == 2) {
                  Field12649 = true;
                  return;
               }
            }
         } else {
            if (var1 == 1 && this.Field12575 > 0 && ((var2 = this.Field12550[this.Field12575 - 1]) == 632 || var2 == 78 || var2 == 867 || var2 == 431 || var2 == 53 || var2 == 74 || var2 == 454 || var2 == 539 || var2 == 493 || var2 == 847 || var2 == 447 || var2 == 1125)) {
               var3 = this.Field12547[this.Field12575 - 1];
               var4 = this.Field12548[this.Field12575 - 1];
               if (this.Field12650 == 4 && this.Field12143 == 1) {
                  if (this.Field12575 > 0 && class329 != null) {
                     if ((var12 = this.Field12551[this.Field12575 - 1]) >= 0) {
                        Class330 var11 = (Class330)Class329.Field2502.Method3462().get(var12);
                        class329.Method3382(var11.Method3408(), var11.Method3409(), (String)null);
                        class329.Method3402(var12);
                        return;
                     }

                     if (var12 < 0) {
                        Class328 var10 = (Class328)Class329.Field2502.Method3461().get(-var12 - 2);
                        class329.Method3382(var10.Method3379(), var10.Method3380(), var10.Method3378());
                     }
                  }

                  return;
               }

               RSInterface var5;
               if ((var5 = RSInterface.Field12749[var4]).Field12802 || var5.Field12774) {
                  this.Field12662 = false;
                  this.Field12459 = 0.0F;
                  this.Field12540 = var4;
                  this.Field12541 = var3;
                  this.Field12542 = 2;
                  this.Field12543 = super.clickX;
                  this.Field12544 = super.clickY;
                  if (RSInterface.Field12749[var4].Field12775 == this.openInterfaceID) {
                     this.Field12542 = 1;
                  }

                  if (RSInterface.Field12749[var4].Field12775 == this.Field12693) {
                     this.Field12542 = 3;
                  }

                  return;
               }
            }

            boolean var9 = false;
            if ((this.Field12575 <= 0 ? -1 : this.Field12550[this.Field12575 - 1]) == 639 && var1 == 1 && super.clickX < 516) {
               var9 = true;
            }

            if (var1 == 1 && (Field12674 == 1 || var9 || this.Method13242(this.Field12575 - 1)) && this.Field12575 > 2) {
               var1 = 2;
            }

            if (var1 == 1 && this.Field12575 > 0) {
               this.Method13314(this.Field12575 - 1);
            }

            if (var1 == 2 && this.Field12575 > 0) {
               this.Method13371();
            }
         }

      }
   }

   private boolean Method13247() {
      if (Field12218 != null && this.Field12622 != null) {
         if (this.Field12220) {
            return this.Method13251(false, false, true);
         } else {
            try {
               Field12428.Method8851();
               int var1 = this.Field12622.length;

               int var2;
               byte[] var3;
               int var4;
               int var5;
               for(var2 = 0; var2 < var1; ++var2) {
                  if ((var3 = this.Field12668[var2]) != null) {
                     var4 = (this.Field12657[var2] >> 8 << 6) - Field12490;
                     var5 = ((this.Field12657[var2] & 255) << 6) - Field12491;
                     Field12218.Method8843(var4, this.Field12655, var5, Field12428, var3, Model.Field2798);
                  }
               }

               for(var2 = 0; var2 < var1; ++var2) {
                  int var7 = (this.Field12657[var2] >> 8 << 6) - Field12490;
                  var4 = ((this.Field12657[var2] & 255) << 6) - Field12491;
                  if (this.Field12622[var2] == null && Field12528 < 800) {
                     Field12218.Method8819(var4, 64, 64, var7);
                  }
               }

               for(var2 = 0; var2 < var1; ++var2) {
                  if ((var3 = this.Field12668[var2]) != null) {
                     var4 = (this.Field12657[var2] >> 8 << 6) - Field12490;
                     var5 = ((this.Field12657[var2] & 255) << 6) - Field12491;
                     Field12218.Method8843(var4, this.Field12655, var5, Field12428, var3, Model.Field2798);
                  }
               }
            } catch (Exception var6) {
               var6.printStackTrace();
            }

            return true;
         }
      } else {
         return false;
      }
   }

   private static void Method13248(Mobile var0, int var1, int var2) {
      if (var0 != null) {
         for(int var3 = 0; var3 < 10; ++var3) {
            var0.pathX[var3] -= var1;
            var0.pathY[var3] -= var2;
         }

         var0.boundExtentX -= var1 << 7;
         var0.boundExtentY -= var2 << 7;
      }
   }

   private void Method13249(int var1, int var2, int var3) {
      Iterator var5 = this.Field12511.iterator();

      while(var5.hasNext()) {
         ((Class489)var5.next()).Method14494(var1, var2);
      }

      Class490 var4;
      for(var5 = this.Field12512.iterator(); var5.hasNext(); var4.Field256 -= var2 << 7) {
         Class490 var10000 = var4 = (Class490)var5.next();
         var10000.Field255 -= var1 << 7;
      }

      for(int var8 = 0; var8 < 16384; ++var8) {
         if (var3 != 1) {
            Method13248(this.Field12327[var8], var1, var2);
         }

         if (var8 < this.session_players.length) {
            Method13248(this.session_players[var8], var1, var2);
         }
      }

      if (Field12679 != 0) {
         Field12679 -= var1;
         Field12680 -= var2;
      }

   }

   private boolean Method13250() {
      if (Field12219 == null) {
         if (Field12218 != null && Field12428 != null && this.Field12655 != null && !Field12218.Field449) {
            if (!Field12218.Method8825()) {
               Signlink.Field2944.submit(new Class878(this, this));
            } else {
               Field12218.Method8830(this, Field12428, this.Field12655, false);
            }
         }

         return false;
      } else {
         try {
            int var1 = Field12494;
            int var2 = Field12495;
            if (Field12496) {
               Field12219.Method12348();
            } else if (!Field12219.Method12347()) {
               return false;
            }

            Field12219.Method12345(this);
            Model.Method14444();
            if (Field12494 != 0 || Field12495 != 0) {
               if (!this.Field12289) {
                  this.Method13249(Field12494, Field12495, 0);
               }

               Field12495 = 0;
               Field12494 = 0;
            }

            this.Field12289 = false;
            Field12497 = 0;
            Field12498 = 0;
            if (Field12496) {
               this.Method13294();
            }

            Field12496 = false;
            this.Method13256();
            if (++Field12506 > 98) {
               Field12506 = 0;
            }

            if (Field12596 && Field12075) {
               Class838.Field6955.Method10099();
            }

            if (Field12593) {
               Field12290 = true;
            }

            if (!Field12252) {
               Field12252 = true;
               GraphicsDisplay.Method997().Field2685 = true;
               this.Field12061.Field2348 = var1;
               this.Field12061.Field2349 = var2;
               if (Field12075) {
                  Field12247 = false;
                  Field12248 = System.currentTimeMillis();
               }

               this.Method13363(0.01F);
            }

            if (this.Field12093 && Method13320()) {
               for(int var3 = 0; var3 < 4; ++var3) {
                  for(int var4 = 1; var4 < SceneGraph.mapSizeWidth - 1; ++var4) {
                     for(int var5 = 1; var5 < SceneGraph.mapSizeWidth - 1; ++var5) {
                        this.Field12655[var3].Field12868[var4][var5] = 0;
                     }
                  }
               }
            }

            Method13397();
            Field12219 = null;
            if (Field12428.Field940 == null) {
               byte var7 = 105;
               this.Method13210(var7, 0, 0);
            }

            if (GraphicsDisplay.Field2678 && GraphicsDisplay.Field2667) {
               Class843.Method14008();
               Class843.Method13983(var1, var2);
               Class843.Method13984();
               ObjectDefinition.Field10548 = 999999;
               Class838.Field6955.Field11992 = 999999;
            }

            Field12075 = false;
         } catch (Exception var6) {
            var6.printStackTrace();
         }

         return false;
      }
   }

   private boolean Method13251(boolean var1, boolean var2, boolean var3) {
      if (this.Field12622 != null && this.Field12668 != null) {
         GraphicsDisplay.Method997().Field2685 = true;
         this.Field12321 = System.currentTimeMillis();
         this.Field12220 = GraphicsDisplay.Field2678;
         this.Field12220 = true;
         if (this.Field12220) {
            if (Field12219 != null) {
               return false;
            } else {
               (Field12219 = new Class729(this)).Method12349(var3, false, var2, this.Field12622, this.Field12668, Field12596, this.Field12657, Field12490, Field12491, Field12527, Field12528, this.Field12572, Field12379, false, this.Field12582, Field12144);
               if (!Field12496) {
                  Signlink.Field2944.submit(new Class877(this));
               }

               return true;
            }
         } else {
            try {
               this.Field12456 = -1;
               this.intGroundArray = new int[4][SceneGraph.mapSizeWidth + 1][SceneGraph.mapSizeWidth + 1];
               this.tileSettingBits = new byte[4][SceneGraph.mapSizeWidth][SceneGraph.mapSizeWidth];
               Field12428 = new SceneGraph(this.intGroundArray);

               int var12;
               for(var12 = 0; var12 < 4; ++var12) {
                  this.Field12655[var12].Method8187();
               }

               int var4;
               int var14;
               for(var12 = 0; var12 < 4; ++var12) {
                  for(var14 = 0; var14 < SceneGraph.mapSizeWidth; ++var14) {
                     for(var4 = 0; var4 < SceneGraph.mapSizeWidth; ++var4) {
                        this.tileSettingBits[var12][var14][var4] = 0;
                     }
                  }
               }

               Field12218 = new Class569(this.tileSettingBits, this.intGroundArray);
               var12 = this.Field12622.length;
               int var5;
               int var16;
               if (!Field12596) {
                  for(var14 = 0; var14 < var12; ++var14) {
                     var4 = (this.Field12657[var14] >> 8 << 6) - Field12490;
                     var5 = ((this.Field12657[var14] & 255) << 6) - Field12491;
                     byte[] var6;
                     if ((var6 = this.Field12622[var14]) != null) {
                        Field12218.Method8835(var6, var5, var4, Field12527 - 6 << 3, Field12528 - 6 << 3, this.Field12655);
                     }
                  }

                  for(var14 = 0; var14 < var12; ++var14) {
                     var4 = (this.Field12657[var14] >> 8 << 6) - Field12490;
                     var5 = ((this.Field12657[var14] & 255) << 6) - Field12491;
                     if (this.Field12622[var14] == null && Field12528 < 800) {
                        Field12218.Method8819(var5, 64, 64, var4);
                     }
                  }

                  for(var14 = 0; var14 < var12; ++var14) {
                     byte[] var15;
                     if ((var15 = this.Field12668[var14]) != null) {
                        var5 = (this.Field12657[var14] >> 8 << 6) - Field12490;
                        var16 = ((this.Field12657[var14] & 255) << 6) - Field12491;
                        Field12218.Method8843(var5, this.Field12655, var16, Field12428, var15, Model.Field2798);
                     }
                  }
               }

               int var7;
               int var8;
               int var9;
               int var10;
               if (Field12596) {
                  var14 = 0;

                  label259:
                  while(true) {
                     if (var14 >= 4) {
                        for(var14 = 0; var14 < 13; ++var14) {
                           for(var4 = 0; var4 < 13; ++var4) {
                              if (this.Field12572[0][var14][var4] == -1) {
                                 Field12218.Method8819(var4 << 3, 8, 8, var14 << 3);
                              }
                           }
                        }

                        var14 = 0;

                        while(true) {
                           if (var14 >= 4) {
                              break label259;
                           }

                           for(var4 = 0; var4 < 13; ++var4) {
                              for(var5 = 0; var5 < 13; ++var5) {
                                 if ((var16 = this.Field12572[var14][var4][var5]) != -1) {
                                    var12 = var16 >> 24 & 3;
                                    var7 = var16 >> 1 & 3;
                                    var8 = var16 >> 14 & 1023;
                                    var9 = var16 >> 3 & 2047;
                                    var10 = (var8 / 8 << 8) + var9 / 8;

                                    for(var16 = 0; var16 < this.Field12657.length; ++var16) {
                                       if (this.Field12657[var16] == var10 && this.Field12668[var16] != null) {
                                          Field12218.Method8838(this.Field12655, Field12428, var12, var4 << 3, (var9 & 7) << 3, var12, this.Field12668[var16], (var8 & 7) << 3, var7, var5 << 3, Field12144, Model.Field2798);
                                       }
                                    }
                                 }
                              }
                           }

                           ++var14;
                        }
                     }

                     for(var4 = 0; var4 < 13; ++var4) {
                        for(var5 = 0; var5 < 13; ++var5) {
                           if ((var16 = this.Field12572[var14][var4][var5]) != -1) {
                              var12 = var16 >> 24 & 3;
                              var7 = var16 >> 1 & 3;
                              var8 = var16 >> 14 & 1023;
                              var9 = var16 >> 3 & 2047;
                              var10 = (var8 / 8 << 8) + var9 / 8;

                              for(var16 = 0; var16 < this.Field12657.length; ++var16) {
                                 if (this.Field12657[var16] == var10 && this.Field12622[var16] != null) {
                                    Field12218.Method8834(var12, var7, this.Field12655, var4 << 3, (var8 & 7) << 3, this.Field12622[var16], (var9 & 7) << 3, var14, var5 << 3);
                                    break;
                                 }
                              }
                           }
                        }
                     }

                     ++var14;
                  }
               }

               if (this.Field12604 != null && !GraphicsDisplay.Field2678) {
                  this.Field12604.Method13683();
               }

               int var10000 = Class569.Field466;
               Field12428.Method8854(0);
               if (++Field12506 > 98) {
                  Field12506 = 0;
               }

               this.Field12526.Method11836();
               var4 = (Field12527 - 6) / 8 - 1;
               var5 = (Field12527 + 6) / 8 + 1;
               var16 = (Field12528 - 6) / 8 - 1;
               var12 = (Field12528 + 6) / 8 + 1;
               if (this.Field12582) {
                  var4 = 49;
                  var5 = 50;
                  var16 = 49;
                  var12 = 50;
               }

               for(var7 = var4; var7 <= var5; ++var7) {
                  for(var8 = var16; var8 <= var12; ++var8) {
                     if (var7 == var4 || var7 == var5 || var8 == var16 || var8 == var12) {
                        if ((var9 = this.Field12526.Method1315(0, var8, var7)) != -1) {
                           this.Field12526.Method11961(var9, 3);
                        }

                        if ((var10 = this.Field12526.Method1315(1, var8, var7)) != -1) {
                           this.Field12526.Method11961(var10, 3);
                        }
                     }
                  }
               }

               if (var2) {
                  Rasterizer.resetTextures();
                  Rasterizer.Method14450();
                  Model.Method14471();
                  Rasterizer.resetTextures();
                  Rasterizer.Method14450();
                  Model.Method14471();
                  if (GraphicsDisplay.Field2678 && GraphicsDisplay.Field2667) {
                     Class843.currentTime = 0L;
                     Class843.Field3754 = true;
                  }

                  Player.aBoolean = true;
                  NPCDefinition.Field10763.Method1512();
                  System.gc();
               } else if (GraphicsDisplay.Field2678) {
                  boolean var17 = GraphicsDisplay.Field2667;
               }

               if (this.Field12093 && Method13320()) {
                  for(var7 = 0; var7 < 4; ++var7) {
                     for(var8 = 1; var8 < SceneGraph.mapSizeWidth - 1; ++var8) {
                        for(var9 = 1; var9 < SceneGraph.mapSizeWidth - 1; ++var9) {
                           this.Field12655[var7].Field12868[var8][var9] = 0;
                        }
                     }
                  }
               }
            } catch (Exception var11) {
               var11.printStackTrace();
               byte var13 = 6;
               this.Method13210(var13, 0, 0);
            }

            return true;
         }
      } else {
         return false;
      }
   }

   private static void Method13252() {
      ObjectDefinition.Method11942();
      NPCDefinition.Field10763.Method1512();
      ItemDef.Field10628.Method1839();
      ItemDef.Field10627.Method1839();
      Player.Method14457();
      SpotAnim.Field10107.Method1839();
   }

   private static long Method13253(int var0, int var1, int var2) {
      return ((long)var0 << 32) + ((long)var1 << 16) + (long)var2;
   }

   private void Method13254(int var1, int var2, int var3, int var4) {
      if (!Field12218.Method8825()) {
         Class47 var10;
         (var10 = new Class47()).Field2195 = var1;
         var10.Field2196 = var2;
         var10.Field10127 = var3;

         var10.Field2739 = var4;

         this.Field12224.add(var10);
      } else {
         long var5 = Method13253(var1 + Field12490, var2 + Field12491, var3);
         List var9;
         if ((var9 = (List)this.Field12222.get(var5)) != null) {
            Iterator var8 = var9.iterator();

            while(var8.hasNext()) {
               Class47 var7;
               if ((var7 = (Class47)var8.next()).itemID == var4) {
                  var9.remove(var7);
                  break;
               }
            }

            if (var9.size() == 0) {
               this.Field12222.remove(var5);
            }

            Method13257(var1, var2, var9);
         }
      }
   }

   private void Method13255(int var1, int var2, int var3, Class47 var4) {
      if (var1 >= 0 && var2 >= 0 && var1 < SceneGraph.mapSizeWidth && var2 < SceneGraph.mapSizeWidth) {
         long var5 = Method13253(var1 + Field12490, var2 + Field12491, var3);
         Object var7;
         if ((var7 = (List)this.Field12222.get(var5)) == null) {
            var7 = new LinkedList();
            this.Field12222.put(var5, var7);
         }

         var4.Field2195 = var1;
         var4.Field2196 = var2;
         var4.Field2197 = Field12490 + var1;
         var4.Field2198 = Field12491 + var2;
         ((List)var7).add(var4);
         if (Field12218.Method8825()) {
            Method13257(var1, var2, (List)var7);
         } else {
            this.Field12223.add(var5);
         }
      }
   }

   private void Method13256() {
      Iterator var2 = this.Field12222.entrySet().iterator();

      while(var2.hasNext()) {
         Entry var1;
         long var3;
         long var5 = (var3 = (Long)(var1 = (Entry)var2.next()).getKey()) >> 16 & 65535L;
         long var7 = var3 >> 32 & 65535L;
         if (Field12218.Method8825()) {
            Method13257((int)var7 - Field12490 - Field12494, (int)var5 - Field12491 - Field12495, (List)var1.getValue());
         } else {
            this.Field12223.add(var3);
         }
      }

   }

   private static void Method13257(int var0, int var1, List var2) {
      if (var2 != null) {
         if (var0 >= 0 && var1 >= 0 && var0 < SceneGraph.mapSizeWidth && var1 < SceneGraph.mapSizeWidth) {
            if (var2 != null && var2.size() != 0) {
               Class47 var3 = null;
               Iterator var5 = var2.iterator();

               Class47 var4;
               while(var5.hasNext()) {
                  ItemDef var6;
                  if ((var6 = ItemDef.forID((var4 = (Class47)var5.next()).itemID)) != null) {
                     int var10000 = var6.Field10620;
                     if (var6.Field10643) {
                        var10000 = var4.Field2199;
                     }

                     var3 = var4;
                     break;
                  }

                  System.err.println("[Client]: null item: " + var4.itemID);
               }

               if (var3 != null) {
                  var4 = null;
                  Class47 var15 = null;
                  Iterator var12 = var2.iterator();

                  while(var12.hasNext()) {
                     Class47 var16;
                     if ((var16 = (Class47)var12.next()).itemID != var3.itemID && var4 == null) {
                        var4 = var16;
                     }

                     if (var16.itemID != var3.itemID && var16.itemID != var4.itemID && var15 == null) {
                        var15 = var16;
                     }
                  }

                  int var17 = Field12379;
                  Class501 var13;
                  if ((var13 = Field12428.Method8846(Field12379, var0, var1)) != null && var13.Field12852 != null && Field12379 < 3) {
                     ++var17;
                  }

                  long var8 = (long)((var1 << 7) + var0);
                  long var10 = var8 + 4503608217305088L + 1610612736L;
                  int var14 = 0;
                  int[][][] var18 = Field12428.Field940;
                  if (var0 >= 0 && var1 >= 0 && var0 < SceneGraph.mapSizeWidth + 1 && var1 < SceneGraph.mapSizeWidth + 1) {
                     var14 = (var18[var17][var0][var1] + var18[var17][var0 + 1][var1] + var18[var17][var0][var1 + 1] + var18[var17][var0 + 1][var1 + 1]) / 4;
                     int var7;
                     if (Field12428.Method8846(var17, var0, var1) != null && Field12428.Method8846(var17, var0, var1).Field12847 == null) {
                        var7 = Method13258(var18[var17][var0][var1], var18[var17][var0 + 1][var1], var18[var17][var0][var1 + 1], var18[var17][var0 + 1][var1 + 1]) - var14;
                        var14 += var7 / 8;
                     }

                     var7 = Field12490 + var0 - Field12494;
                     int var9 = Field12491 + var1 - Field12495;
                     if (var7 >= 3142 && var9 >= 3469 && var7 <= 3187 && var9 <= 3514 && var14 == -336) {
                        var14 += 10;
                     }
                  }

                  if (GraphicsDisplay.Field2678 && GraphicsDisplay.Field2667 && var3 != null) {
                     Field12428.Field924.Method8952(Field12379, var0, var1);
                     if (Field12379 == var17) {
                        var3.Method8270(var18[var17][var0][var1], var18[var17][var0 + 1][var1], var18[var17][var0][var1 + 1], var18[var17][var0 + 1][var1 + 1], var0, var1);
                     } else {
                        var14 -= 4;
                     }

                     if (var4 != null) {
                        var4.Field10116 = var3.Field10116;
                        var4.Field10117 = var3.Field10117;
                     }

                     if (var15 != null) {
                        var15.Field10116 = var3.Field10116;
                        var15.Field10117 = var3.Field10117;
                     }
                  }

                  Field12428.Method8859(0, var0, var10, var4, var14, var15, var3, Field12379, var1);
               }
            } else {
               Field12428.Method8874(Field12379, var0, var1);
            }
         } else {
            var2.clear();
         }
      }
   }

   private static int Method13258(int... var0) {
      int var1 = Integer.MAX_VALUE;
      int[] var3 = var0;

      for(int var2 = 0; var2 < 4; ++var2) {
         int var4;
         if ((var4 = var3[var2]) < var1) {
            var1 = var4;
         }
      }

      return var1;
   }

   public static float Method13259(float... var0) {
      float var1 = Float.MAX_VALUE;
      float[] var3 = var0;

      for(int var2 = 0; var2 < 3; ++var2) {
         float var4;
         if ((var4 = var3[var2]) < var1) {
            var1 = var4;
         }
      }

      return var1;
   }

   public static float Method13260(float... var0) {
      float var1 = -2.14748365E9F;
      float[] var3 = var0;

      for(int var2 = 0; var2 < 3; ++var2) {
         float var4;
         if ((var4 = var3[var2]) > var1) {
            var1 = var4;
         }
      }

      return var1;
   }

   public static void Method13261(Class449 var0) {
      if (Field12226 != null) {
         Field12226.Method7369(var0);
      }

   }

   public static void Method13262() {
      if (Field12226 != null) {
         Field12226.Method7373();
      }

   }

   public static void Method13263(boolean var0) {
      if (Field12226 != null && Field12225) {
         Field12226.Method7372(var0);
      }
   }

   private void Method13264(boolean var1) {
      for(int var2 = 0; var2 < Field12328; ++var2) {
         Npc var3;
         if ((var3 = this.Field12327[this.Field12329[var2]]) != null && var3.isVisible() && var3.Field4103.aBoolean1541 == var1) {
            int var4 = var3.Field4194 >> 7;
            int var5 = var3.Field4195 >> 7;
            long var6 = (long)(var4 + (var5 << 7)) + 536870912L + (long)(this.Field12329[var2] << 14);
            boolean var10000 = var3.v_16;
            if (var4 >= 0 && var4 < SceneGraph.mapSizeWidth && var5 >= 0 && var5 < SceneGraph.mapSizeWidth) {
               if (var3.ak_2 == 1 && (var3.Field4194 & 127) == 64 && (var3.Field4195 & 127) == 64 && var3.Field4103.Field10762) {
                  if (this.Field12385[var4][var5] == this.Field12683) {
                     continue;
                  }

                  this.Field12385[var4][var5] = this.Field12683;
               }

               if (!var3.Field4103.Field10751) {
                  var6 += 2147483648L;
               }

               var3.o_28 = var6 >> 14 << 14;
               boolean var8 = true;
               if (var3.Field4103 != null && var3.Field4103.Field10761) {
                  var8 = false;
               }

               Field12428.Method8865(Field12379, var3.aB_2, this.Method13278(Field12379, var3.Field4195, var3.Field4194, var8), var6, var3.Field4195, (var3.ak_2 - 1 << 6) + 60, var3.Field4194, var3, var3.al_1);
               if (GraphicsDisplay.Field2678 && GraphicsDisplay.Field2667 && var3.Field4103.Field10727) {
                  var3.a(var4, var5, Field12379, var3.Field4103.Field10740 > 1 ? var3.Field4103.Field10740 : 1, var3.aB_2 & 2047);
                  double var13 = var3.Field10117;
                  var13 = var3.Field10116;
               }

               for(int var12 = 0; var12 < var3.e().size(); ++var12) {
                  var3.a((Class595)var3.e().get(var12));
                  long var10 = ((var6 >> 14 << 14) + (long)var12 << 32) + (long)(var4 + (var5 << 7));
                  Model var9;
                  if ((var9 = var3.a(var12, 0, var10)) != null) {
                     var9.Field2753 = true;
                     var9.Field2754 = 2500;
                     Field12428.Method8865(Field12379, var3.aB_2, this.Method13277(Field12379, var3.Field4195, var3.Field4194), var10, var3.Field4195, (var3.ak_2 - 1 << 6) + 60, var3.Field4194, var9, var3.al_1);
                  }
               }
            }
         }
      }

   }

   private boolean Method13265(int var1, RSInterface var2, int var3, int var4, int var5, int var6) {
      if (var2 != null && !var2.Field12778) {
         int var7 = this.d_91;
         if (var2.Field12805 == 0 && var2.Field12783 != null && !var2.Field12810) {
            if (var1 == 4) {
               var1 += this.Field12282;
            }

            if (var4 == 4) {
               var4 += this.Field12283;
            }

            byte var8 = 0;
            if (var2.Field12794 == 29000) {
               var8 = -20;
            }

            if (var3 >= var1 && var5 >= var4 + var8 && var3 <= var1 + var2.Field12758 && var5 <= var4 + var2.Field12811) {
               int var30 = var2.Field12783.length;
               int var9 = var2.Field12794;

               for(int var10 = 0; var10 < var30; ++var10) {
                  int var11 = var2.Field12784[var10] + var1;
                  int var12 = var2.Field12816[var10] + var4 - var6;
                  RSInterface var13;
                  if ((var13 = RSInterface.Field12749[var2.Field12783[var10]]) != null && !var13.Field12778) {
                     byte var14 = 0;
                     if (this.Field12575 >= this.Field12634.length) {
                        break;
                     }

                     if (var13.Field12775 == Field12140) {
                        var14 = 37;
                     }

                     if (var13.Field12775 == 39600) {
                        var14 = 82;
                     } else if (var13.Field12775 != 5065 && var13.Field12775 != 5715) {
                        if (var13.Field12775 >= 18129 && var13.Field12775 <= 18244) {
                           var14 = 14;
                        } else if (var13.Field12775 != 147 && var13.Field12775 != 148) {
                           if (var13.Field12775 == 638) {
                              var14 = 15;
                              if (var13.Field12762 <= 16) {
                                 var14 = 16;
                              }
                           } else if (var13.Field12775 == 8134) {
                              var14 = 18;
                           }
                        } else {
                           var14 = 50;
                        }
                     } else {
                        var14 = 15;
                     }

                     if (var14 > 0) {
                        if (var7 > 0) {
                           var7 = var14;
                        } else if (var7 < 0) {
                           var7 = -var14;
                        }
                     }

                     var13.Field12762 += var7;
                     int var15;
                     int var33;
                     if (var7 != 0 && var14 > 0) {
                        var15 = var13.Field12762 % var14;
                        var33 = var14 - var15;
                        if (var15 != 0) {
                           if (var33 <= var15) {
                              var13.Field12762 += var33;
                           } else {
                              var13.Field12762 -= var15;
                           }
                        }
                     }

                     if (var1 == 4 && var4 == 4) {
                        var11 += this.Field12282;
                        var12 += this.Field12283;
                     }

                     var11 += var13.Field12807;
                     var12 += var13.Field12809;
                     if ((var13.Field12767 >= 0 || var13.Field12753 != 0) && var3 >= var11 && var5 >= var12 && var3 < var11 + var13.Field12758 && var5 < var12 + var13.Field12811) {
                        var13.Field12769 = true;
                        if (var13.Field12767 >= 0) {
                           this.Field12359 = var13.Field12767;
                        } else {
                           this.Field12359 = var13.Field12794;
                        }
                     } else {
                        var13.Field12769 = false;
                     }

                     boolean var10000 = var13.Field12769;
                     if (var13.Field12805 == 0) {
                        this.Method13265(var11, var13, var3, var12, var5, var13.Field12762);
                        if (var13.Field12804 > var13.Field12811) {
                           this.Method13308(var11 + var13.Field12758, var13.Field12811, var3, var5, var13, var12, true, var13.Field12804);
                        }
                     } else {
                        int var16;
                        if (var13.Field12754 == 1 && (var3 >= var11 && var5 >= var12 && var3 < var11 + var13.Field12758 && var5 < var12 + var13.Field12811 || var13.Field12767 == 420 && var13.Field12769)) {
                           boolean var31 = false;
                           if (var13.Field12751 != 0) {
                              var16 = var13.Field12751;
                              if ((var13.Field12751 <= 0 || var16 > 200) && (var16 < 701 || var16 > 900)) {
                                 if (var16 >= 401 && var16 <= 500) {
                                    this.Field12634[this.Field12575] = "Remove @whi@" + var13.Field12792;
                                    this.Field12550[this.Field12575] = 322;
                                    ++this.Field12575;
                                    var10000 = true;
                                 } else {
                                    var10000 = false;
                                 }
                              } else {
                                 if (var16 >= 801) {
                                    var16 -= 701;
                                 } else if (var16 >= 701) {
                                    var16 -= 601;
                                 } else if (var16 >= 101) {
                                    var16 -= 101;
                                 } else {
                                    --var16;
                                 }

                                 this.Field12634[this.Field12575] = "Join @whi@" + this.Players[var16];
                                 this.Field12550[this.Field12575] = 791;
                                 ++this.Field12575;
                                 this.Field12634[this.Field12575] = "Remove @whi@" + this.Players[var16];
                                 this.Field12550[this.Field12575] = 792;
                                 ++this.Field12575;
                                 this.Field12634[this.Field12575] = "Message @whi@" + this.Players[var16];
                                 this.Field12550[this.Field12575] = 639;
                                 ++this.Field12575;
                                 var10000 = true;
                              }

                              var31 = var10000;
                           }

                           if (!var31) {
                              if (var13.Field12736 != null) {
                                 this.Field12286.add(new Class663(var11, var12 + var13.Field12811 + 3, var13.Field12736, false, false));
                              }

                              if (var13.Field12759 != null) {
                                 this.Field12634[this.Field12575] = var13.Field12759;
                                 this.Field12550[this.Field12575] = 315;
                                 this.Field12548[this.Field12575] = var13.Field12794;
                                 ++this.Field12575;
                              }
                           }
                        }

                        String var32;
                        if (var13.Field12754 == 2 && this.Field12577 == 0 && var3 >= var11 && var5 >= var12 && var3 < var11 + var13.Field12758 && var5 < var12 + var13.Field12811) {
                           var32 = var13.Field12760;
                           if (var13.Field12760 == null) {
                              return true;
                           }

                           if (var32.indexOf(" ") != -1) {
                              var32 = var32.substring(0, var32.indexOf(" "));
                           }

                           this.Field12634[this.Field12575] = var32 + " @gre@" + var13.Field12756;
                           this.Field12550[this.Field12575] = 626;
                           this.Field12548[this.Field12575] = var13.Field12794;
                           ++this.Field12575;
                        }

                        if (var13.Field12754 == 3 && var3 >= var11 && var5 >= var12 && var3 < var11 + var13.Field12758 && var5 < var12 + var13.Field12811) {
                           this.Field12634[this.Field12575] = "Close";
                           this.Field12550[this.Field12575] = 200;
                           this.Field12548[this.Field12575] = var13.Field12794;
                           ++this.Field12575;
                        }

                        if (var13.Field12754 == 4 && var3 >= var11 && var5 >= var12 && var3 < var11 + var13.Field12758 && var5 < var12 + var13.Field12811) {
                           if (var13.Field12736 != null) {
                              this.Field12286.add(new Class663(var11, var12 + var13.Field12811 + 3, var13.Field12736, false, false));
                           }

                           if (var13.Field12759 != null) {
                              this.Field12634[this.Field12575] = var13.Field12759;
                              this.Field12550[this.Field12575] = 169;
                              this.Field12548[this.Field12575] = var13.Field12794;
                              ++this.Field12575;
                           }

                           if (this.Field12209 == null && var13.Field12794 >= 5609 && var13.Field12794 <= 5651 || var13.Field12794 >= 18000 && var13.Field12794 <= 18022 || var13.Field12794 >= 683 && var13.Field12794 <= 687) {
                              this.Field12209 = var13.Field12759;
                              if ((var5 <= 275 + Field12715 || !Field12712) && (Field12712 || var5 < 313)) {
                                 this.Field12210 = 1;
                              } else {
                                 this.Field12210 = 2;
                              }
                           }
                        }

                        String var34;
                        if (var13.Field12754 == 5 && var3 >= var11 && var5 >= var12 && var3 < var11 + var13.Field12758 && var5 < var12 + var13.Field12811) {
                           if (var9 == 0 && var13.Field12794 < 10000) {
                              continue;
                           }

                           if (var13.Field12736 != null) {
                              this.Field12286.add(new Class663(var11, var12 + var13.Field12811 + 3, var13.Field12736, false, false));
                           }

                           var32 = null;
                           if (RSInterface.Field12749[var13.Field12794 + 4] != null) {
                              var32 = RSInterface.Field12749[var13.Field12794 + 4].Field12792;
                           }

                           if (var32 != null && var32.contains("</a>")) {
                              var34 = Field12131 + "/" + var32.split("'")[1];
                              this.Field12634[this.Field12575] = "Go-to @lre@" + var34;
                              this.Field12550[this.Field12575] = 1987;
                              this.Field12548[this.Field12575] = var13.Field12794;
                              ++this.Field12575;
                           } else if (var13.Field12759 != null) {
                              this.Field12634[this.Field12575] = var13.Field12759;
                              this.Field12550[this.Field12575] = 646;
                              this.Field12548[this.Field12575] = var13.Field12794;
                              ++this.Field12575;
                           }
                        }

                        if (var13.Field12754 == 20 && var3 >= var11 && var5 >= var12 && var3 < var11 + var13.Field12758 && var5 < var12 + var13.Field12811 && var13.Field12792.contains("$link")) {
                           var34 = (var32 = var13.Field12792).substring(0, var32.indexOf("+"));
                           String var35 = (var32 = var32.substring(var34.length() + 1).trim()).substring(0, var32.indexOf("$"));
                           this.Field12634[this.Field12575] = "Go-to @lre@" + var35;
                           this.Field12550[this.Field12575] = 1987;
                           this.Field12548[this.Field12575] = var13.Field12794;
                           ++this.Field12575;
                        }

                        if (var13.Field12754 == 6 && !this.Field12585 && var3 >= var11 && var5 >= var12 && var3 < var11 + var13.Field12758 && var5 < var12 + var13.Field12811) {
                           this.Field12634[this.Field12575] = var13.Field12759;
                           this.Field12550[this.Field12575] = 679;
                           this.Field12548[this.Field12575] = var13.Field12794;
                           ++this.Field12575;
                        }

                        if (var13.Field12805 == 2) {
                           var15 = 0;
                           var33 = 0;
                           var16 = var13.Field12794;
                           int var17 = 0;
                           int var18 = 0;
                           var10000 = var13.Field12734;
                           float var19 = 32.0F;
                           float var20 = 32.0F;
                           byte var21 = 0;
                           byte var22 = 0;
                           int var23 = var13.Field12818 ? 56 : 32;
                           if (var13.Field12794 == 6980 || var13.Field12794 == 6985) {
                              var19 = 63.4F;
                              var20 = 63.4F;
                              var21 = 28;
                              var22 = 22;
                              var23 = 60;
                              var13.Field12770 = var13.Field12788 = 0;
                              var13.Field12752 = var13.Field12791 = null;
                              var2.Field12811 = 365;
                           }

                           for(int var24 = 0; var24 < var13.Field12811 && var13.Field12796 != null; ++var24) {
                              for(int var25 = 0; var25 < var13.Field12758; ++var25) {
                                 int var26 = (int)((float)var11 + (float)var25 * (var19 + (float)var13.Field12770) + (float)var21);
                                 int var27 = (int)((float)(var17 + var12) + (float)var24 * (var20 + (float)var13.Field12788) + (float)var22);
                                 if (var15 < 20 && var13.Field12752 != null) {
                                    var26 += var13.Field12752[var15];
                                    var27 += var13.Field12791[var15];
                                 }

                                 if (var15 >= var13.Field12796.length) {
                                    break;
                                 }

                                 if (var13.Field12775 == Field12140) {
                                    int var28 = var15 / 100;
                                    if (var18 != var28 && this.Field12650 != 3) {
                                       var18 = var28;
                                       var17 += 24;
                                       var27 += 24;
                                    }
                                 }

                                 var10000 = var3 >= var26 + (32 - var23) && var5 >= var27 + (32 - var23) && var3 < var26 + var23 && var5 < var27 + var23;
                                 boolean var37 = var3 >= var26 + (32 - var23) && var5 >= var27 + (32 - var23) && var3 < var26 + var23 && var5 < var27 + var23;
                                 if (var10000) {
                                    this.Field12524 = var15;
                                    this.Field12525 = var16;
                                 }

                                 label782: {
                                    ItemDef var29 = null;
                                    NPCDefinition var36 = null;
                                    if (!var13.Field12818) {
                                       if ((var29 = ItemDef.forID(var13.Field12796[var15] - 1)) == null) {
                                          break label782;
                                       }
                                    } else if ((var36 = NPCDefinition.Method11884(var13.Field12796[var15] - 1)) == null) {
                                       break label782;
                                    }

                                    if (var13.Field12817 && this.Field12650 == 3 && this.Field12639.length() > 0) {
                                       if (!var13.Field12818) {
                                          if (var29 == null || var29.Field10639 == null || !var29.Field10639.toLowerCase().contains(this.Field12639.toLowerCase())) {
                                             ++var15;
                                             continue;
                                          }
                                       } else if (var36 == null || var36.Field10736 == null || !var36.Field10736.toLowerCase().contains(this.Field12639.toLowerCase())) {
                                          ++var15;
                                          continue;
                                       }

                                       var26 = var33 % 10;
                                       var27 = var33 / 10;
                                       var26 = var11 + var26 * (32 + var13.Field12770);
                                       var27 = var12 + var27 * (32 + var13.Field12788);
                                       ++var33;
                                       var37 = var3 >= var26 + (32 - var23) && var5 >= var27 + (32 - var23) && var3 < var26 + var23 && var5 < var27 + var23;
                                    }

                                    if (var37) {
                                       this.Field12524 = var15;
                                       this.Field12525 = var16;
                                       if (var13.Field12796 != null && var15 < var13.Field12796.length && var13.Field12796[var15] > 0) {
                                          String var40;
                                          String var41;
                                          if (var13.Field12818) {
                                             if ((var36 = NPCDefinition.Method11884(var13.Field12796[var15] - 1)) != null && var36.Field10736 != null) {
                                                var41 = var36.Field10736;
                                                var40 = "Kills: " + var13.Field12795[var15];
                                                String var39 = "ID: " + (var13.Field12796[var15] - 1);
                                                var41 = Field12080 ? var41 + "\n" + var40 + "\n" + var39 : var41 + "\n" + var40;
                                                this.Field12286.add(new Class663(var3, var5 + 16, var41, true));
                                             }

                                             ++var15;
                                             continue;
                                          }

                                          if (Field12115 && var29.Field10639 != null) {
                                             StringBuilder var38;
                                             (var38 = new StringBuilder()).append(var29.Field10639);
                                             var40 = Field12089.Method211(var13.Field12796[var15] - 1);
                                             String var42 = var29.Field10639;
                                             if (var40 != null) {
                                                var38.append("\n");
                                                var38.append(var40);
                                             }

                                             this.Field12286.add(new Class663(var3, var5 + 20, var38.toString(), true));
                                          }

                                          if (this.Field12697 == 1 && var13.Field12793) {
                                             if (var16 != this.Field12699 || var15 != this.Field12698) {
                                                this.Field12634[this.Field12575] = "Use " + this.Field12701 + " with @lre@" + var29.Field10639;
                                                this.Field12550[this.Field12575] = 870;
                                                this.Field12551[this.Field12575] = var29.Field10626;
                                                this.Field12547[this.Field12575] = var15;
                                                this.Field12548[this.Field12575] = var16;
                                                ++this.Field12575;
                                             }
                                          } else if (this.Field12577 == 1 && var13.Field12793) {
                                             if ((this.Field12579 & 16) == 16) {
                                                this.Field12634[this.Field12575] = this.Field12580 + " @lre@" + var29.Field10639;
                                                this.Field12550[this.Field12575] = 543;
                                                this.Field12551[this.Field12575] = var29.Field10626;
                                                this.Field12547[this.Field12575] = var15;
                                                this.Field12548[this.Field12575] = var16;
                                                ++this.Field12575;
                                             }
                                          } else {
                                             if (var13.Field12793) {
                                                for(var26 = 4; var26 >= 3; --var26) {
                                                   if (var29.Field10652 != null && var29.Field10652[var26] != null) {
                                                      this.Field12634[this.Field12575] = var29.Field10652[var26] + " @lre@" + var29.Field10639;
                                                      if (var26 == 3) {
                                                         this.Field12550[this.Field12575] = 493;
                                                      }

                                                      if (var26 == 4) {
                                                         this.Field12550[this.Field12575] = 847;
                                                      }

                                                      this.Field12551[this.Field12575] = var29.Field10626;
                                                      this.Field12547[this.Field12575] = var15;
                                                      this.Field12548[this.Field12575] = var16;
                                                      ++this.Field12575;
                                                   } else if (var26 == 4) {
                                                      this.Field12634[this.Field12575] = "Drop @lre@" + var29.Field10639;
                                                      this.Field12550[this.Field12575] = 847;
                                                      this.Field12551[this.Field12575] = var29.Field10626;
                                                      this.Field12547[this.Field12575] = var15;
                                                      this.Field12548[this.Field12575] = var16;
                                                      ++this.Field12575;
                                                   }
                                                }
                                             }

                                             if (var13.Field12785) {
                                                this.Field12634[this.Field12575] = "Use @lre@" + var29.Field10639;
                                                this.Field12550[this.Field12575] = 447;
                                                this.Field12551[this.Field12575] = var29.Field10626;
                                                this.Field12547[this.Field12575] = var15;
                                                this.Field12548[this.Field12575] = var16;
                                                ++this.Field12575;
                                             }

                                             if (var13.Field12793 && var29.Field10652 != null) {
                                                for(var26 = 2; var26 >= 0; --var26) {
                                                   if (var29.Field10652[var26] != null) {
                                                      this.Field12634[this.Field12575] = var29.Field10652[var26] + " @lre@" + var29.Field10639;
                                                      if (var26 == 0) {
                                                         this.Field12550[this.Field12575] = 74;
                                                      }

                                                      if (var26 == 1) {
                                                         this.Field12550[this.Field12575] = 454;
                                                      }

                                                      if (var26 == 2) {
                                                         this.Field12550[this.Field12575] = 539;
                                                      }

                                                      this.Field12551[this.Field12575] = var29.Field10626;
                                                      this.Field12547[this.Field12575] = var15;
                                                      this.Field12548[this.Field12575] = var16;
                                                      ++this.Field12575;
                                                   }
                                                }
                                             }

                                             if (var13.Field12763 != null) {
                                                for(var26 = var13.Field12763.length - 1; var26 >= 0; --var26) {
                                                   if (var13.Field12763[var26] != null) {
                                                      this.Field12634[this.Field12575] = var13.Field12763[var26] + " @lre@" + var29.Field10639;
                                                      if (var13.Field12794 == 5382) {
                                                         var13.Field12763[3] = "Withdraw " + this.Field12102;
                                                         if (var26 == 0) {
                                                            this.Field12550[this.Field12575] = 632;
                                                         }

                                                         if (var26 == 1) {
                                                            this.Field12550[this.Field12575] = 78;
                                                         }

                                                         if (var26 == 2) {
                                                            this.Field12550[this.Field12575] = 867;
                                                         }

                                                         if (var26 == 3) {
                                                            this.Field12550[this.Field12575] = 291;
                                                         }

                                                         if (var26 == 4) {
                                                            this.Field12550[this.Field12575] = 431;
                                                         }

                                                         if (var26 == 5) {
                                                            this.Field12550[this.Field12575] = 53;
                                                         }

                                                         if (var26 == 6) {
                                                            this.Field12550[this.Field12575] = 300;
                                                         }

                                                         if (var26 == 7) {
                                                            this.Field12550[this.Field12575] = 301;
                                                         }
                                                      } else {
                                                         if (var26 == 0) {
                                                            this.Field12550[this.Field12575] = 632;
                                                         }

                                                         if (var26 == 1) {
                                                            this.Field12550[this.Field12575] = 78;
                                                         }

                                                         if (var26 == 2) {
                                                            this.Field12550[this.Field12575] = 867;
                                                         }

                                                         if (var26 == 3) {
                                                            this.Field12550[this.Field12575] = 431;
                                                         }

                                                         if (var26 == 4) {
                                                            this.Field12550[this.Field12575] = 53;
                                                         }
                                                      }

                                                      this.Field12551[this.Field12575] = var29.Field10626;
                                                      this.Field12547[this.Field12575] = var15;
                                                      this.Field12548[this.Field12575] = var16;
                                                      ++this.Field12575;
                                                   }
                                                }
                                             }

                                             if (Field12080) {
                                                var41 = "d:" + var29.Field10641 + ", w:" + var29.Field10662 + "/" + var29.Field10633 + ", ch:" + var29.genderOneOffset;
                                                if (session_player.playerGender == 0) {
                                                   var41 = "d:" + var29.Field10641 + ", w:" + var29.Field10634 + "/" + var29.Field10651 + ", ch:" + var29.genderZeroOffset;
                                                }

                                                this.Field12634[this.Field12575] = "Examine @lre@" + var29.Field10639 + ": " + var29.Field10626 + " [" + var41 + "]";
                                             } else {
                                                this.Field12634[this.Field12575] = "Examine @lre@" + var29.Field10639;
                                             }

                                             this.Field12550[this.Field12575] = 1125;
                                             this.Field12551[this.Field12575] = var29.Field10626;
                                             this.Field12547[this.Field12575] = var15;
                                             this.Field12548[this.Field12575] = var16;
                                             ++this.Field12575;
                                          }
                                       }
                                    }
                                 }

                                 ++var15;
                              }
                           }
                        }
                     }
                  }
               }

               return true;
            } else {
               return false;
            }
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   private void Method13266(int var1, int var2, int var3, int var4, int var5) {
      int var6;
      if ((var6 = (var1 - 32) * var1 / var5) < 16) {
         var6 = 16;
      }

      if ((var5 -= var1) == 0) {
         var5 = 1;
      }

      var2 = (var1 - 32 - var6) * var2 / var5;
      if (GraphicsDisplay.Field2678) {
         GraphicsDisplay.Method997().Method1009(var1 - 32, var3 + 16, var4, 1, 16, this);
         GraphicsDisplay.Method997().Method1009(var1 - 32, var3 + 16, var4, 4011046, 15, this);
         GraphicsDisplay.Method997().Method1009(var1 - 32, var3 + 16, var4, 3419425, 13, this);
         GraphicsDisplay.Method997().Method1009(var1 - 32, var3 + 16, var4, 3024925, 11, this);
         GraphicsDisplay.Method997().Method1009(var1 - 32, var3 + 16, var4, 2696219, 10, this);
         GraphicsDisplay.Method997().Method1009(var1 - 32, var3 + 16, var4, 2433049, 9, this);
         GraphicsDisplay.Method997().Method1009(var1 - 32, var3 + 16, var4, 1, 1, this);
      }

      this.Field12484.Method14495(var4, var3);
      this.Field12485.Method14495(var4, var3 + var1 - 16);
      if (!GraphicsDisplay.Field2678) {
         Class697.Method8269(var1 - 32, var3 + 16, var4, 1, 16);
         Class697.Method8269(var1 - 32, var3 + 16, var4, 4011046, 15);
         Class697.Method8269(var1 - 32, var3 + 16, var4, 3419425, 13);
         Class697.Method8269(var1 - 32, var3 + 16, var4, 3024925, 11);
         Class697.Method8269(var1 - 32, var3 + 16, var4, 2696219, 10);
         Class697.Method8269(var1 - 32, var3 + 16, var4, 2433049, 9);
         Class697.Method8269(var1 - 32, var3 + 16, var4, 1, 1);
         Class697.Method8269(var6, var3 + 16 + var2, var4, this.Field12520, 16);
         Class697.Method11991(var3 + 16 + var2, 1, var6, var4);
         Class697.Method11991(var3 + 16 + var2, 8482897, var6, var4 + 1);
         Class697.Method11991(var3 + 16 + var2, 7562570, var6, var4 + 2);
         Class697.Method11991(var3 + 16 + var2, 6970435, var6, var4 + 3);
         Class697.Method11991(var3 + 16 + var2, 6970435, var6, var4 + 4);
         Class697.Method11991(var3 + 16 + var2, 6641729, var6, var4 + 5);
         Class697.Method11991(var3 + 16 + var2, 6641729, var6, var4 + 6);
         Class697.Method11991(var3 + 16 + var2, 6378814, var6, var4 + 7);
         Class697.Method11991(var3 + 16 + var2, 6378814, var6, var4 + 8);
         Class697.Method11991(var3 + 16 + var2, 6115644, var6, var4 + 9);
         Class697.Method11991(var3 + 16 + var2, 6115644, var6, var4 + 10);
         Class697.Method11991(var3 + 16 + var2, 5852730, var6, var4 + 11);
         Class697.Method11991(var3 + 16 + var2, 5852730, var6, var4 + 12);
         Class697.Method11991(var3 + 16 + var2, 5326389, var6, var4 + 13);
         Class697.Method11991(var3 + 16 + var2, 4931889, var6, var4 + 14);
         Class697.Method11989(var3 + 16 + var2, 1, 15, var4);
         Class697.Method11989(var3 + 17 + var2, 1, 15, var4);
         Class697.Method11989(var3 + 17 + var2, 6641729, 14, var4);
         Class697.Method11989(var3 + 17 + var2, 6970435, 13, var4);
         Class697.Method11989(var3 + 17 + var2, 7167816, 11, var4);
         Class697.Method11989(var3 + 17 + var2, 7562570, 10, var4);
         Class697.Method11989(var3 + 17 + var2, 7759947, 7, var4);
         Class697.Method11989(var3 + 17 + var2, 8088141, 5, var4);
         Class697.Method11989(var3 + 17 + var2, 8285776, 4, var4);
         Class697.Method11989(var3 + 17 + var2, 8482897, 3, var4);
         Class697.Method11989(var3 + 17 + var2, 1, 2, var4);
         Class697.Method11989(var3 + 18 + var2, 1, 16, var4);
         Class697.Method11989(var3 + 18 + var2, 5655352, 15, var4);
         Class697.Method11989(var3 + 18 + var2, 6115644, 14, var4);
         Class697.Method11989(var3 + 18 + var2, 6444608, 11, var4);
         Class697.Method11989(var3 + 18 + var2, 6641729, 10, var4);
         Class697.Method11989(var3 + 18 + var2, 6970435, 7, var4);
         Class697.Method11989(var3 + 18 + var2, 7233606, 5, var4);
         Class697.Method11989(var3 + 18 + var2, 7430727, 4, var4);
         Class697.Method11989(var3 + 18 + var2, 8088141, 3, var4);
         Class697.Method11989(var3 + 18 + var2, 8482897, 2, var4);
         Class697.Method11989(var3 + 18 + var2, 1, 1, var4);
         Class697.Method11989(var3 + 19 + var2, 1, 16, var4);
         Class697.Method11989(var3 + 19 + var2, 5326389, 15, var4);
         Class697.Method11989(var3 + 19 + var2, 5655352, 14, var4);
         Class697.Method11989(var3 + 19 + var2, 6115644, 11, var4);
         Class697.Method11989(var3 + 19 + var2, 6378814, 9, var4);
         Class697.Method11989(var3 + 19 + var2, 6641729, 7, var4);
         Class697.Method11989(var3 + 19 + var2, 6970435, 5, var4);
         Class697.Method11989(var3 + 19 + var2, 7233606, 4, var4);
         Class697.Method11989(var3 + 19 + var2, 7562570, 3, var4);
         Class697.Method11989(var3 + 19 + var2, 8482897, 2, var4);
         Class697.Method11989(var3 + 19 + var2, 1, 1, var4);
         Class697.Method11989(var3 + 20 + var2, 1, 16, var4);
         Class697.Method11989(var3 + 20 + var2, 4931889, 15, var4);
         Class697.Method11989(var3 + 20 + var2, 5523766, 14, var4);
         Class697.Method11989(var3 + 20 + var2, 5852730, 13, var4);
         Class697.Method11989(var3 + 20 + var2, 6115644, 10, var4);
         Class697.Method11989(var3 + 20 + var2, 6378814, 8, var4);
         Class697.Method11989(var3 + 20 + var2, 6641729, 6, var4);
         Class697.Method11989(var3 + 20 + var2, 6970435, 4, var4);
         Class697.Method11989(var3 + 20 + var2, 7562570, 3, var4);
         Class697.Method11989(var3 + 20 + var2, 8482897, 2, var4);
         Class697.Method11989(var3 + 20 + var2, 1, 1, var4);
         Class697.Method11991(var3 + 16 + var2, 1, var6, var4 + 15);
         Class697.Method11989(var3 + 15 + var2 + var6, 1, 16, var4);
         Class697.Method11989(var3 + 14 + var2 + var6, 1, 15, var4);
         Class697.Method11989(var3 + 14 + var2 + var6, 4142890, 14, var4);
         Class697.Method11989(var3 + 14 + var2 + var6, 4471853, 10, var4);
         Class697.Method11989(var3 + 14 + var2 + var6, 4734511, 9, var4);
         Class697.Method11989(var3 + 14 + var2 + var6, 4866095, 7, var4);
         Class697.Method11989(var3 + 14 + var2 + var6, 4931889, 4, var4);
         Class697.Method11989(var3 + 14 + var2 + var6, 5655352, 3, var4);
         Class697.Method11989(var3 + 14 + var2 + var6, 1, 2, var4);
         Class697.Method11989(var3 + 13 + var2 + var6, 1, 16, var4);
         Class697.Method11989(var3 + 13 + var2 + var6, 4471853, 15, var4);
         Class697.Method11989(var3 + 13 + var2 + var6, 4931889, 11, var4);
         Class697.Method11989(var3 + 13 + var2 + var6, 5326389, 9, var4);
         Class697.Method11989(var3 + 13 + var2 + var6, 5523766, 7, var4);
         Class697.Method11989(var3 + 13 + var2 + var6, 5655352, 6, var4);
         Class697.Method11989(var3 + 13 + var2 + var6, 5852730, 4, var4);
         Class697.Method11989(var3 + 13 + var2 + var6, 6444608, 3, var4);
         Class697.Method11989(var3 + 13 + var2 + var6, 6970435, 2, var4);
         Class697.Method11989(var3 + 13 + var2 + var6, 1, 1, var4);
         Class697.Method11989(var3 + 12 + var2 + var6, 1, 16, var4);
         Class697.Method11989(var3 + 12 + var2 + var6, 4471853, 15, var4);
         Class697.Method11989(var3 + 12 + var2 + var6, 4931889, 14, var4);
         Class697.Method11989(var3 + 12 + var2 + var6, 5523766, 12, var4);
         Class697.Method11989(var3 + 12 + var2 + var6, 5655352, 11, var4);
         Class697.Method11989(var3 + 12 + var2 + var6, 5852730, 10, var4);
         Class697.Method11989(var3 + 12 + var2 + var6, 6115644, 7, var4);
         Class697.Method11989(var3 + 12 + var2 + var6, 6378814, 4, var4);
         Class697.Method11989(var3 + 12 + var2 + var6, 7233606, 3, var4);
         Class697.Method11989(var3 + 12 + var2 + var6, 8088141, 2, var4);
         Class697.Method11989(var3 + 12 + var2 + var6, 1, 1, var4);
         Class697.Method11989(var3 + 11 + var2 + var6, 1, 16, var4);
         Class697.Method11989(var3 + 11 + var2 + var6, 4931889, 15, var4);
         Class697.Method11989(var3 + 11 + var2 + var6, 5326389, 14, var4);
         Class697.Method11989(var3 + 11 + var2 + var6, 5655352, 13, var4);
         Class697.Method11989(var3 + 11 + var2 + var6, 5852730, 11, var4);
         Class697.Method11989(var3 + 11 + var2 + var6, 6115644, 9, var4);
         Class697.Method11989(var3 + 11 + var2 + var6, 6378814, 7, var4);
         Class697.Method11989(var3 + 11 + var2 + var6, 6641729, 5, var4);
         Class697.Method11989(var3 + 11 + var2 + var6, 6970435, 4, var4);
         Class697.Method11989(var3 + 11 + var2 + var6, 7562570, 3, var4);
         Class697.Method11989(var3 + 11 + var2 + var6, 8088141, 2, var4);
         Class697.Method11989(var3 + 11 + var2 + var6, 1, 1, var4);
      } else {
         if (this.Field12486 == null) {
            this.Field12486 = new RgbImage[2];
            this.Field12486[0] = new RgbImage(16, 1);
            this.Field12486[0].Field9893 = new int[]{0, 1, 8285776, 8088141, 8088141, 8088141, 7759947, 7759947, 7759947, 7562570, 7562570, 7167816, 7167816, 6970435, 1, 0};
            this.Field12486[1] = new RgbImage(16, 1);
            this.Field12486[1].Field9893 = new int[]{1, 8482897, 8285776, 8088141, 8088141, 8088141, 7759947, 7759947, 7759947, 7562570, 7562570, 7167816, 7167816, 6970435, 6641729, 1};
            this.Field12486[0].Field9878 = Method13218("sbc - 0 top");
            this.Field12486[1].Field9878 = Method13218("sbc - 1 mid");
         }

         var1 = var3 + 16 + var2;
         var6 -= 2;
         this.Field12486[0].Method9109(var4, var1++, true);

         while(var1 <= var3 + 16 + var2 + var6 - 1) {
            this.Field12486[1].Method9109(var4, var1, true);
            ++var1;
         }

         this.Field12486[0].Method9109(var4, var1, true);
      }
   }

   private void Method13267(Packet var1, int var2) {
      this.sessionNpcsAwaitingUpdatePtr = 0;
      Packet var4 = var1;
      Client var3 = this;
      var1.Method14514();
      int var5;
      if ((var5 = var1.gbits(8)) > Field12328) {
         Signlink.reporterror(this.myUsername + " Too many npcs: " + var5 + "/" + Field12328);
         throw new RuntimeException("eek");
      } else {
         Field12328 = 0;

         for(int var6 = 0; var6 < var5; ++var6) {
            int var7 = var3.Field12329[var6];
            Npc var8 = var3.Field12327[var7];
            int var9;
            if ((var9 = var4.gbits(1)) == 0) {
               var3.Field12329[Field12328++] = var7;
               var8.ah_2 = currentTime;
            } else if (var9 == 1 && (var9 = var4.gbits(3)) != 5) {
               var3.Field12329[Field12328++] = var7;
               var8.ah_2 = currentTime;
               if (var9 == 0) {
                  var3.session_npcs_awaiting_update[var3.sessionNpcsAwaitingUpdatePtr++] = var7;
               } else if (var9 == 1) {
                  var9 = var4.gbits(3);
                  var8.Method9113(false, var9);
                  if (var4.gbits(1) == 1) {
                     var3.session_npcs_awaiting_update[var3.sessionNpcsAwaitingUpdatePtr++] = var7;
                  }
               } else {
                  int var10;
                  if (var9 == 2) {
                     var9 = var4.gbits(3);
                     var8.Method9113(true, var9);
                     var10 = var4.gbits(3);
                     var8.Method9113(true, var10);
                     if (var4.gbits(1) == 1) {
                        var3.session_npcs_awaiting_update[var3.sessionNpcsAwaitingUpdatePtr++] = var7;
                     }
                  } else if (var9 == 3) {
                     var9 = var4.gbits(1);
                     if (var4.gbits(1) == 1) {
                        var3.session_npcs_awaiting_update[var3.sessionNpcsAwaitingUpdatePtr++] = var7;
                     }

                     var10 = var4.gbits(7);
                     int var11 = var4.gbits(7);
                     if (Method13313()) {
                        var11 += Field12494;
                        var10 += Field12495;
                     }

                     var8.Method9110(var11, var10, var9 == 1, false);
                     var8.u_29 = true;
                  } else if (var9 == 4) {
                     var9 = var4.gbits(3);
                     var8.Method9113(true, var9);
                     var10 = var4.gbits(3);
                     var8.Method9113(true, var10);
                     var10 = var4.gbits(3);
                     var8.Method9113(true, var10);
                     if (var4.gbits(1) == 1) {
                        var3.session_npcs_awaiting_update[var3.sessionNpcsAwaitingUpdatePtr++] = var7;
                     }
                  }
               }
            }
         }

         this.Method13284(var2, var1);
         this.Method13347(var1);
         if (var1.pos != var2) {
            Signlink.reporterror(this.myUsername + " size mismatch in getnpcpos - pos:" + var1.pos + " psize:" + var2);
            throw new RuntimeException("eek");
         } else {
            for(int var12 = 0; var12 < Field12328; ++var12) {
               if (this.Field12327[this.Field12329[var12]] == null) {
                  Signlink.reporterror(this.myUsername + " null entry in npc list - pos:" + var12 + " size:" + Field12328);
                  throw new RuntimeException("eek");
               }
            }

         }
      }
   }

   private void Method13268() {
      int var1 = Field12712 ? Field12715 - 3 : -3;
      if (super.mouseEventX >= 5 && super.mouseEventX <= 61 && super.mouseEventY >= var1 + 482 && super.mouseEventY <= var1 + 505) {
         this.Field12232 = 0;
         Field12649 = true;
      } else if (super.mouseEventX >= 71 && super.mouseEventX <= 127 && super.mouseEventY >= var1 + 482 && super.mouseEventY <= var1 + 505) {
         this.Field12232 = 1;
         Field12649 = true;
      } else if (super.mouseEventX >= 137 && super.mouseEventX <= 193 && super.mouseEventY >= var1 + 482 && super.mouseEventY <= var1 + 505) {
         this.Field12232 = 2;
         Field12649 = true;
      } else if (super.mouseEventX >= 203 && super.mouseEventX <= 259 && super.mouseEventY >= var1 + 482 && super.mouseEventY <= var1 + 505) {
         this.Field12232 = 3;
         Field12649 = true;
      } else if (super.mouseEventX >= 269 && super.mouseEventX <= 325 && super.mouseEventY >= var1 + 482 && super.mouseEventY <= var1 + 505) {
         this.Field12232 = 4;
         Field12649 = true;
      } else if (super.mouseEventX >= 335 && super.mouseEventX <= 391 && super.mouseEventY >= var1 + 482 && super.mouseEventY <= var1 + 505) {
         this.Field12232 = 5;
         Field12649 = true;
      } else if (super.mouseEventX >= 404 && super.mouseEventX <= 515 && super.mouseEventY >= var1 + 482 && super.mouseEventY <= var1 + 505) {
         this.Field12232 = 6;
         Field12649 = true;
      } else {
         this.Field12232 = -1;
         Field12649 = true;
      }

      if (super.mouseButtonPressed == 1) {
         if (super.clickX >= 5 && super.clickX <= 61 && super.clickY >= var1 + 482 && super.clickY <= var1 + 505) {
            this.Field12233 = 0;
            this.Field12312 = 0;
            Field12649 = true;
            Field12545 = 0;
            return;
         }

         if (super.clickX >= 71 && super.clickX <= 127 && super.clickY >= var1 + 482 && super.clickY <= var1 + 505) {
            this.Field12233 = 1;
            this.Field12312 = 5;
            Field12649 = true;
            Field12545 = 0;
            return;
         }

         if (super.clickX >= 137 && super.clickX <= 193 && super.clickY >= var1 + 482 && super.clickY <= var1 + 505) {
            this.Field12233 = 2;
            this.Field12312 = 1;
            Field12649 = true;
            Field12545 = 0;
            return;
         }

         if (super.clickX >= 203 && super.clickX <= 259 && super.clickY >= var1 + 482 && super.clickY <= var1 + 505) {
            this.Field12233 = 3;
            this.Field12312 = 2;
            Field12649 = true;
            Field12545 = 0;
            return;
         }

         if (super.clickX >= 269 && super.clickX <= 325 && super.clickY >= var1 + 482 && super.clickY <= var1 + 505) {
            this.Field12233 = 4;
            this.Field12312 = 11;
            Field12649 = true;
            Field12545 = 0;
            return;
         }

         if (super.clickX >= 335 && super.clickX <= 391 && super.clickY >= var1 + 482 && super.clickY <= var1 + 505) {
            this.Field12233 = 5;
            this.Field12312 = 3;
            Field12649 = true;
            Field12545 = 0;
            return;
         }

         if (super.clickX >= 404 && super.clickX <= 515 && super.clickY >= var1 + 482 && super.clickY <= var1 + 505) {
            if (this.openInterfaceID == -1) {
               this.Method13404();
               this.Field12356 = "";
               this.Field12595 = false;

               for(var1 = 0; var1 < RSInterface.Field12749.length; ++var1) {
                  if (RSInterface.Field12749[var1] != null && RSInterface.Field12749[var1].Field12751 == 600) {
                     this.Field12618 = this.openInterfaceID = RSInterface.Field12749[var1].Field12775;
                     return;
                  }
               }

               return;
            }

            this.pushMessage("Please close the interface you have open before using 'report abuse'", 0, "");
         }
      }

   }

   private void Method13269(int var1) {
      this.Method13270(var1, false);
   }

   private void Method13270(int var1, boolean var2) {
      if (var1 < SettingUsagePointers.Field12822.length && SettingUsagePointers.Field12822[var1] != null) {
         int var3;
         if ((var3 = SettingUsagePointers.Field12822[var1].Field12825) != 0) {
            var1 = this.Field12444[var1];
            if (var3 == 1 && !var2) {
               double var5 = 0.9D;
               if (var1 == 1) {
                  var5 = 0.9D;
               } else if (var1 == 2) {
                  var5 = 0.8D;
               } else if (var1 == 3) {
                  var5 = 0.7D;
               } else if (var1 == 4) {
                  var5 = 0.6D;
               }

               if (Rasterizer.calculatePalette(var5)) {
                  ItemDef.Field10627.Method1839();
                  this.Field12675 = true;
                  Class843.Field3755 = true;
                  byte var7 = 7;
                  this.Method13210(var7, 0, 0);
               }
            }

            if (var3 == 3) {
               boolean var8 = this.Field12587;
               if (var1 == 0) {
                  Signlink.Method13363(0.9F * Field12056);
                  this.Field12587 = true;
               }

               if (var1 == 1) {
                  Signlink.Method13363(0.65F * Field12056);
                  this.Field12587 = true;
               }

               if (var1 == 2) {
                  Signlink.Method13363(0.4F * Field12056);
                  this.Field12587 = true;
               }

               if (var1 == 3) {
                  Signlink.Method13363(0.15F * Field12056);
                  this.Field12587 = true;
               }

               if (var1 == 4) {
                  this.Field12587 = false;
               }

               if (this.Field12587 != var8) {
                  if (this.Field12587) {
                     this.Field12652 = this.Field12438;
                     this.Field12526.Method11960(2, this.Field12652);
                  } else {
                     Signlink.Method11836();
                  }

                  this.Field12678 = 0;
               }
            }

            if (var3 == 4) {
               if (var1 == 0) {
                  this.Field12335 = true;
               }

               if (var1 == 1) {
                  this.Field12335 = true;
               }

               if (var1 == 2) {
                  this.Field12335 = true;
               }

               if (var1 == 3) {
                  this.Field12335 = true;
               }

               if (var1 == 4) {
                  this.Field12335 = false;
               }
            }

            if (var3 == 5 && !var2) {
               Field12674 = var1;
               initializeGL();
            }

            if (var3 == 6) {
               this.Field12670 = var1;
            }

            if (var3 == 8) {
               this.Field12632 = var1;
               Field12649 = true;
            }

            if (var3 == 9) {
               this.Field12373 = var1;
            }

         }
      }
   }

   private void Method13271() {
      if (class329 == null) {
         try {
            int var1 = 0;

            int var2;
            int var6;
            int var7;
            int var8;
            int var16;
            int var17;
            int var21;
            String var24;
            int var27;
            for(var2 = -1; var2 < session_player_count + Field12328; ++var2) {
               Object var3;
               if (var2 == -1) {
                  var3 = session_player;
               } else if (var2 < session_player_count) {
                  var3 = this.session_players[this.session_player_list[var2]];
               } else {
                  var3 = this.Field12327[this.Field12329[var2 - session_player_count]];
               }

               if (var3 != null && ((Mobile)var3).isVisible()) {
                  NPCDefinition var4;
                  if (var3 instanceof Npc) {
                     var4 = ((Npc)var3).Field4103;
                     if (((Npc)var3).Field4103.Field10755 != null) {
                        var4 = var4.Method11888();
                     }

                     if (var4 == null) {
                        continue;
                     }
                  }

                  if (var2 < session_player_count) {
                     var16 = 32;
                     if (Field12057) {
                        var16 += 14;
                     }

                     if (!(var3 instanceof Player)) {
                        continue;
                     }

                     Player var5;
                     if ((var5 = (Player)var3).Field4192 >= 0 && var5.Field4192 != 255 || var5.Field4193 > 0 || this.Field12339 == 10) {
                        this.Method13380((Mobile)var3, ((Mobile)var3).height + 15);
                        if (var5.Field4193 > 0 && this.Field12440 >= 0) {
                           this.Field12554[var5.Field4193 - 1].Method14495(this.Field12440 - 12, this.Field12441 - var16);
                           var16 += 26;
                        }

                        if (var5.Field4192 < 7 && var5.Field4192 != 255 && this.Field12440 >= 0) {
                           this.Field12553[var5.Field4192].Method14495(this.Field12440 - 12, this.Field12441 - var16);
                           var16 += 26;
                        }

                        if (var2 >= 0 && this.Field12339 == 10 && this.Field12388 == this.session_player_list[var2] && this.Field12440 >= 0 && currentTime % 20 < 10) {
                           this.Field12555[0].Method14495(this.Field12440 - 12, this.Field12441 - var16);
                        }
                     }
                  } else {
                     if (!(var3 instanceof Npc)) {
                        continue;
                     }

                     var4 = ((Npc)var3).Field4103;
                     var17 = -22;
                     if (Field12057) {
                        var17 += 14;
                     }

                     if (var4.Field10744 >= 0) {
                        var6 = var4.Field10744;
                        this.Method13380((Mobile)var3, ((Mobile)var3).height + 15);
                        if (this.Field12440 >= 0 && var6 < this.Field12553.length) {
                           var17 += 24;
                           if (this.Field12553[var6] != null) {
                              this.Field12553[var6].Method14495(this.Field12440 - 12, this.Field12441 - 30 - var17);
                           }
                        }

                        var6 -= 128;
                        if (var6 >= 0 && var6 < this.Field12554.length) {
                           this.Field12554[var6].Method14495(this.Field12440 - 12, this.Field12441 - 30 - var17);
                        }
                     }

                     if (this.Field12339 == 1 && this.Field12648 == this.Field12329[var2 - session_player_count] && currentTime % 20 < 10) {
                        this.Method13380((Mobile)var3, ((Mobile)var3).height + 15);
                        if (this.Field12440 >= 0) {
                           this.Field12555[0].Method14495(this.Field12440 - 12, this.Field12441 - 28 - var17);
                        }
                     }
                  }

                  if (((Mobile)var3).textSpoken != null && (var2 >= session_player_count || this.Field12702 == 0 || this.Field12702 == 3 || this.Field12702 == 1 && this.Method13365(((Player)var3).name))) {
                     this.Method13380((Mobile)var3, ((Mobile)var3).height);
                     if (this.Field12440 >= 0 && var1 < this.Field12446) {
                        this.Field12450[var1] = boldFont.Method9452(((Mobile)var3).textSpoken) / 2;
                        this.Field12449[var1] = boldFont.Field9980;
                        this.Field12447[var1] = this.Field12440;
                        this.Field12448[var1] = this.Field12441;
                        this.Field12451[var1] = ((Mobile)var3).Field1292;
                        this.Field12452[var1] = ((Mobile)var3).Field1313;
                        this.Field12453[var1] = ((Mobile)var3).textCycle;
                        this.Field12454[var1++] = ((Mobile)var3).textSpoken;
                        if (this.Field12670 == 0 && ((Mobile)var3).Field1313 > 0 && ((Mobile)var3).Field1313 <= 3) {
                           this.Field12449[var1] += 10;
                           this.Field12448[var1] += 5;
                        }

                        if (this.Field12670 == 0 && ((Mobile)var3).Field1313 == 4) {
                           this.Field12450[var1] = 60;
                        }

                        if (this.Field12670 == 0 && ((Mobile)var3).Field1313 == 5) {
                           this.Field12449[var1] += 5;
                        }
                     }
                  }

                  int var11;
                  int var13;
                  float var20;
                  if (((Mobile)var3).loopCycleStatus > currentTime) {
                     this.Method13380((Mobile)var3, ((Mobile)var3).height + 15);
                     if (this.Field12440 >= 0) {
                        var7 = 0;
                        if (((Mobile)var3).Field1316 > 0) {
                           var7 = ((Mobile)var3).Field1315 * 54 / ((Mobile)var3).Field1316;
                        }

                        if (var7 > 54) {
                           var7 = 54;
                        }

                        if (((Mobile)var3).Field1315 > 0 && var7 <= 0) {
                           var7 = 1;
                        }

                        this.Field12179.Method14495(this.Field12440 - 28, this.Field12441 - 5);
                        var8 = (double)var7 / 54.0D > 0.25D ? ((double)var7 / 54.0D > 0.5D ? 2 : 0) : 1;
                        RgbImage var9;
                        if ((var9 = this.Field12180[var8].Method881(this.Field12180[var8], 0, 0, var7, 5)) != null) {
                           var9.Field9878 = Method13218("hp " + var8 + " " + var7 + " 0");
                           var9.Method14495(this.Field12440 - 27, this.Field12441 - 4);
                        }

                        if (Field12057) {
                           float var10 = (float)((Mobile)var3).Field1315;
                           float var22 = (float)((Mobile)var3).Field1316;
                           if (var10 > var22) {
                              var10 = var22;
                           }

                           var20 = 0.0F;
                           if (((Mobile)var3).Field1316 > 0) {
                              var20 = var10 / var22;
                           }

                           var11 = 3407616;
                           if (var20 < 0.25F) {
                              var11 = 16059661;
                           } else if (var20 < 0.5F) {
                              var11 = 16557575;
                           } else if (var20 < 0.75F) {
                              var11 = 16776960;
                           }

                           String[] var23 = new String[]{"" + Math.round(var10), " / ", "" + Math.round(var22)};
                           int[] var12 = new int[]{var11, 14983494, 3407616};
                           var13 = this.Field12440 - fancyFont.Method9451(var23[0] + var23[1] + var23[2]) / 2 + 1;

                           for(var17 = 0; var17 < 3; ++var17) {
                              fancyFont.Method9445(var23[var17], var13, var12[var17], this.Field12441 - 6);
                              var13 += fancyFont.Method9451(var23[var17]);
                           }
                        }
                     }
                  }

                  var16 = 0;
                  Iterator var18 = ((Mobile)var3).list1.iterator();

                  while(true) {
                     while(var18.hasNext()) {
                        Class617 var19;
                        if ((var19 = (Class617)var18.next()).Method9320() <= currentTime) {
                           this.Field12079.add(var19);
                        } else {
                           this.Method13380((Mobile)var3, ((Mobile)var3).height / 2);
                           if (this.Field12440 >= 0) {
                              if (!Field12077) {
                                 if (var19.Method9319() != 0 || var19.Method9318() <= 0) {
                                    byte var25 = 0;
                                    byte var26 = 0;
                                    if (var16 == 0) {
                                       var26 = 20;
                                    }

                                    if (var16 == 1) {
                                       this.Field12441 -= 20;
                                       var26 = -20;
                                    }

                                    if (var16 == 2) {
                                       this.Field12440 -= 15;
                                       this.Field12441 -= 10;
                                       var25 = -20;
                                    }

                                    if (var16 == 3) {
                                       this.Field12440 += 15;
                                       this.Field12441 -= 10;
                                       var25 = 20;
                                    }

                                    ++var16;
                                    if (Field12078 && var19.Method9321() > 0) {
                                       this.Field12440 -= 8;
                                       this.Field12407[var19.Method9321() - 1].Method14495(this.Field12440 - 12 + var25, this.Field12441 - 12 + var26);
                                    }

                                    this.Field12458[var19.Method9319()].Method14495(this.Field12440 - 12, this.Field12441 - 12);
                                    String var31 = "" + var19.Method9318();
                                    smallFont.Method9447(0, var31, this.Field12441 + 4, this.Field12440);
                                    smallFont.Method9447(16777215, var31, this.Field12441 + 3, this.Field12440 - 1);
                                 }
                              } else {
                                 var20 = (float)(var7 = var19.Method9320() - currentTime) / 120.0F;
                                 if ((var21 = 77 + (int)(255.0F * var20)) > 255) {
                                    var21 = 255;
                                 }

                                 var27 = this.Field12440 - 12;
                                 var7 = this.Field12441 - 12 + var7 - 120;
                                 if (var19.Method9319() == 0 && var19.Method9318() == 0) {
                                    var27 -= 4;
                                    if (Field12078 && var19.Method9321() > 0) {
                                       var27 -= 8;
                                       this.Field12407[var19.Method9321() - 1].Method892(var27 + 20, var7, var21);
                                    }

                                    this.Field12402.Method892(var27, var7, var21);
                                 } else {
                                    var11 = var19.Method9319();
                                    RgbImage[] var30 = var11 == 2 ? this.Field12404 : (var11 == 3 ? this.Field12405 : (var11 == 0 ? this.Field12406 : this.Field12403));
                                    var24 = String.valueOf(var19.Method9318());
                                    var13 = boldFont.Method9451(var24) / 4 + 1;
                                    if (Field12078 && var19.Method9321() > 0) {
                                       var27 -= 8;
                                       this.Field12407[var19.Method9321() - 1].Method892(var27 + (var13 << 2) + 6, var7, var21);
                                    }

                                    var17 = var27;
                                    var30[0].Method892(var27, var7, var21);

                                    int var29;
                                    for(var29 = 0; var29 < var13; ++var29) {
                                       var17 += 4;
                                       var30[1].Method892(var17, var7, var21);
                                    }

                                    var30[2].Method892(var17 + 4, var7, var21);
                                    var29 = 16777215 | 255 - var21 << 24;
                                    boldFont.Method9447(var29, var24, var7 + 16, var27 + 4 + (var13 << 1));
                                 }
                              }
                           }
                        }
                     }

                     ((Mobile)var3).list1.removeAll(this.Field12079);
                     this.Field12079.clear();
                     break;
                  }
               }
            }

            for(var2 = 0; var2 < var1; ++var2) {
               int var15 = this.Field12447[var2];
               var16 = this.Field12448[var2];
               var17 = this.Field12450[var2];
               var6 = this.Field12449[var2];
               boolean var28 = true;

               while(var28) {
                  var28 = false;

                  for(var8 = 0; var8 < var2; ++var8) {
                     if (var16 + 2 > this.Field12448[var8] - this.Field12449[var8] && var16 - var6 < this.Field12448[var8] + 2 && var15 - var17 < this.Field12447[var8] + this.Field12450[var8] && var15 + var17 > this.Field12447[var8] - this.Field12450[var8] && this.Field12448[var8] - this.Field12449[var8] < var16) {
                        var16 = this.Field12448[var8] - this.Field12449[var8];
                        var28 = true;
                     }
                  }
               }

               this.Field12440 = this.Field12447[var2];
               this.Field12441 = this.Field12448[var2] = var16;
               var24 = this.Field12454[var2];
               if (this.Field12670 == 0) {
                  var21 = 16776960;
                  if (this.Field12451[var2] < 6) {
                     var21 = this.Field12442[this.Field12451[var2]];
                  }

                  if (this.Field12451[var2] == 6) {
                     var21 = this.Field12683 % 20 >= 10 ? 16776960 : 16711680;
                  }

                  if (this.Field12451[var2] == 7) {
                     var21 = this.Field12683 % 20 >= 10 ? '\uffff' : 255;
                  }

                  if (this.Field12451[var2] == 8) {
                     var21 = this.Field12683 % 20 >= 10 ? 8454016 : '뀀';
                  }

                  if (this.Field12451[var2] == 9) {
                     if ((var27 = 150 - this.Field12453[var2]) < 50) {
                        var21 = 16711680 + var27 * 1280;
                     } else if (var27 < 100) {
                        var21 = 16776960 - 327680 * (var27 - 50);
                     } else if (var27 < 150) {
                        var21 = '\uff00' + 5 * (var27 - 100);
                     }
                  }

                  if (this.Field12451[var2] == 10) {
                     if ((var27 = 150 - this.Field12453[var2]) < 50) {
                        var21 = 16711680 + 5 * var27;
                     } else if (var27 < 100) {
                        var21 = 16711935 - 327680 * (var27 - 50);
                     } else if (var27 < 150) {
                        var21 = 255 + 327680 * (var27 - 100) - 5 * (var27 - 100);
                     }
                  }

                  if (this.Field12451[var2] == 11) {
                     if ((var27 = 150 - this.Field12453[var2]) < 50) {
                        var21 = 16777215 - var27 * 327685;
                     } else if (var27 < 100) {
                        var21 = '\uff00' + 327685 * (var27 - 50);
                     } else if (var27 < 150) {
                        var21 = 16777215 - 327680 * (var27 - 100);
                     }
                  }

                  if (this.Field12451[var2] == 12) {
                     switch(this.Field12683 / 16 % 8) {
                     case 0:
                        var21 = 16711680;
                        break;
                     case 1:
                        var21 = 65280;
                        break;
                     case 2:
                        var21 = 255;
                        break;
                     case 3:
                        var21 = 16711935;
                        break;
                     case 4:
                        var21 = 65535;
                        break;
                     case 5:
                        var21 = 16776960;
                        break;
                     case 6:
                        var21 = 16777215;
                        break;
                     case 7:
                        var21 = 0;
                     }
                  }

                  if (this.Field12452[var2] == 0) {
                     boldFont.Method9447(0, var24, this.Field12441 + 1, this.Field12440);
                     boldFont.Method9447(var21, var24, this.Field12441, this.Field12440);
                  }

                  if (this.Field12452[var2] == 1) {
                     boldFont.Method9454(0, var24, this.Field12440, this.Field12683, this.Field12441 + 1);
                     boldFont.Method9454(var21, var24, this.Field12440, this.Field12683, this.Field12441);
                  }

                  if (this.Field12452[var2] == 2) {
                     boldFont.Method9455(this.Field12440, var24, this.Field12683, this.Field12441 + 1, 0);
                     boldFont.Method9455(this.Field12440, var24, this.Field12683, this.Field12441, var21);
                  }

                  if (this.Field12452[var2] == 3) {
                     boldFont.Method9456(150 - this.Field12453[var2], var24, this.Field12683, this.Field12441 + 1, this.Field12440, 0);
                     boldFont.Method9456(150 - this.Field12453[var2], var24, this.Field12683, this.Field12441, this.Field12440, var21);
                  }

                  if (this.Field12452[var2] == 4) {
                     var27 = boldFont.Method9452(var24);
                     var7 = (150 - this.Field12453[var2]) * (var27 + 100) / 150;
                     boldFont.Method9453(0, var24, this.Field12441 + 1, this.Field12440 + 50 - var7);
                     boldFont.Method9453(var21, var24, this.Field12441, this.Field12440 + 50 - var7);
                  }

                  if (this.Field12452[var2] == 5) {
                     var27 = 150 - this.Field12453[var2];
                     var7 = 0;
                     if (var27 < 25) {
                        var7 = var27 - 25;
                     } else if (var27 > 125) {
                        var7 = var27 - 125;
                     }

                     boldFont.Method9447(0, var24, this.Field12441 + 1 + var7, this.Field12440);
                     boldFont.Method9447(var21, var24, this.Field12441 + var7, this.Field12440);
                  }
               } else {
                  boldFont.Method9447(0, var24, this.Field12441 + 1, this.Field12440);
                  boldFont.Method9447(16776960, var24, this.Field12441, this.Field12440);
               }
            }

         } catch (Exception var14) {
            var14.printStackTrace();
         }
      }
   }

   private void Method13272(long var1) {
      if (var1 != 0L) {
         try {
            for(int var3 = 0; var3 < this.Field12370; ++var3) {
               if (this.Field12437[var3] == var1) {
                  --this.Field12370;

                  for(var3 = var3; var3 < this.Field12370; ++var3) {
                     this.Players[var3] = this.Players[var3 + 1];
                     this.Field12323[var3] = this.Field12323[var3 + 1];
                     this.Field12437[var3] = this.Field12437[var3 + 1];
                  }

                  this.Field12630.Method14445(215);
                  this.Field12630.Method394(var1);
                  return;
               }
            }

         } catch (RuntimeException var4) {
            Signlink.reporterror("18622, false, " + var1 + ", " + var4.toString());
            throw new RuntimeException();
         }
      }
   }

   private void Method13273() {
      Class661 var1;
      while((var1 = (Class661)this.Field12286.poll()) != null) {
         var1.Method10875(true, this);
      }

      this.Field12286.addAll(this.Field12287);
      this.Field12287.clear();
   }

   private void Method13274() {
      if (Field12120) {
         if (this.Field12358 && (this.Field12430 == 1 || GraphicsDisplay.Field2678)) {
            this.Method13275();
         }

      } else {
         int var1 = !Field12712 && !GraphicsDisplay.Field2678 ? 0 : Field12714 + 519;
         int var2 = !Field12712 && !GraphicsDisplay.Field2678 ? 0 : Field12715 + 168;
         if (!Field12712) {
            if (GraphicsDisplay.Field2678 && this.Field12605 != null) {
               this.Field12605.Method13683();
            } else {
               this.Field12602.Method13683();
            }
         }

         if (Field12593) {
            Rasterizer.Field9961 = this.Field12620;
         }

         if (!Field12712) {
            this.Field12315.Method14495(var1 + 0, var2 + 0);
         } else {
            this.Field12718[2].Method14495(var1 - 4, var2 + 262);
         }

         if (this.Field12629 == -1) {
            int var4 = !Field12712 && !GraphicsDisplay.Field2678 ? 0 : Field12714 + 519;
            int var5 = Field12712 ? Field12715 + 168 + 262 : 0;
            --var4;
            if (this.Field12646 > 15) {
               this.Field12646 = 0;
            }

            if (GraphicsDisplay.Field2678 && !Field12712) {
               var5 = 168;
            }

            if (!Field12712 && this.Field12646 >= 7) {
               var5 += 262;
            }

            if (this.Field12573[this.Field12646] != -1) {
               switch(this.Field12646) {
               case 0:
                  this.Field12348[0].Method14495(var4 + 3, var5 + 0);
                  break;
               case 1:
                  this.Field12348[4].Method14495(var4 + 41, var5 + 0);
                  break;
               case 2:
                  this.Field12348[4].Method14495(var4 + 74, var5 + 0);
                  break;
               case 3:
                  this.Field12348[4].Method14495(var4 + 107, var5 + 0);
                  break;
               case 4:
                  this.Field12348[4].Method14495(var4 + 140, var5 + 0);
                  break;
               case 5:
                  this.Field12348[4].Method14495(var4 + 173, var5 + 0);
                  break;
               case 6:
                  this.Field12348[1].Method14495(var4 + 206, var5 + 0);
                  break;
               case 7:
                  this.Field12348[2].Method14495(var4 + 3, var5 + 298 - 262);
                  break;
               case 8:
                  this.Field12348[4].Method14495(var4 + 41, var5 + 298 - 262);
                  break;
               case 9:
                  this.Field12348[4].Method14495(var4 + 74, var5 + 298 - 262);
                  break;
               case 10:
                  this.Field12348[4].Method14495(var4 + 107, var5 + 298 - 262);
                  break;
               case 11:
                  this.Field12348[4].Method14495(var4 + 140, var5 + 298 - 262);
                  break;
               case 12:
                  this.Field12348[4].Method14495(var4 + 173, var5 + 298 - 262);
                  break;
               case 13:
                  this.Field12348[3].Method14495(var4 + 206, var5 + 298 - 262);
               }
            }

            var4 = !Field12712 && !GraphicsDisplay.Field2678 ? 0 : Field12714 + 519;
            var5 = Field12712 ? Field12715 + 168 + 262 : 0;
            if (GraphicsDisplay.Field2678 && !Field12712) {
               var5 = 168;
            }

            if (this.Field12573[0] != -1) {
               this.Field12429[0].Method14495(var4 + 10, var5 + 4);
            }

            if (this.Field12573[1] != -1) {
               this.Field12429[1].Method14495(var4 + 43, var5 + 4);
            }

            if (this.Field12573[2] != -1) {
               this.Field12429[2].Method14495(var4 + 76, var5 + 3);
            }

            if (this.Field12573[3] != -1) {
               this.Field12429[3].Method14495(var4 + 111, var5 + 5);
            }

            if (this.Field12573[4] != -1) {
               this.Field12429[4].Method14495(var4 + 140, var5 + 1);
            }

            if (this.Field12573[5] != -1) {
               this.Field12429[5].Method14495(var4 + 174, var5 + 1);
            }

            if (this.Field12573[6] != -1) {
               this.Field12429[6].Method14495(var4 + 208, var5 + 4);
            }

            if (Field12712) {
               var5 -= 262;
            }

            if (this.Field12573[7] != -1) {
               this.Field12429[7].Method14495(var4 + 11, var5 + 303);
            }

            if (this.Field12573[8] != -1) {
               this.Field12429[8].Method14495(var4 + 46, var5 + 306);
            }

            if (this.Field12573[9] != -1) {
               this.Field12429[9].Method14495(var4 + 79, var5 + 306);
            }

            if (this.Field12573[10] != -1) {
               this.Field12429[10].Method14495(var4 + 113, var5 + 302);
            }

            if (this.Field12573[11] != -1) {
               this.Field12429[11].Method14495(var4 + 145, var5 + 304);
            }

            if (this.Field12573[12] != -1) {
               this.Field12429[12].Method14495(var4 + 181, var5 + 302);
            }

            if (this.Field12573[13] != -1) {
               this.Field12429[13].Method14495(var4 + 213, var5 + 303);
            }
         }

         if (Field12712) {
            if (this.Field12573[this.Field12646] != -1) {
               this.Field12718[0].Method893(554 + Field12714, 156 + Field12715);
               if (this.Field12629 != -1) {
                  this.Method13362(0, 560 + Field12714, RSInterface.Field12749[this.Field12629], 168 + Field12715 - 3);
               } else if (this.Field12573[this.Field12646] != -1) {
                  this.Method13362(0, 560 + Field12714, RSInterface.Field12749[this.Field12573[this.Field12646]], 168 + Field12715 - 3);
               }
            }
         } else {
            if (this.Field12629 != -1) {
               this.Method13362(0, var1 + 28, RSInterface.Field12749[this.Field12629], var2 + 37);
            } else if (this.Field12573[this.Field12646] != -1) {
               this.Method13362(0, var1 + 28, RSInterface.Field12749[this.Field12573[this.Field12646]], var2 + 37);
            }

            this.Method13403();
         }

         if (!GraphicsDisplay.Field2678 && !Field12712) {
            this.Field12286.clear();
         } else {
            this.Method13273();
         }

         if (this.Field12358 && (this.Field12430 == 1 || GraphicsDisplay.Field2678)) {
            this.Method13275();
         }

         if (!Field12712 && this.Field12209 == null) {
            this.Field12602.Method3038(168 + Field12715, super.Method11952(), 519 + Field12714);
         }

         this.Field12604.Method13683();
         if (Field12593) {
            Rasterizer.Field9961 = this.Field12621;
         }

      }
   }

   private void Method13275() {
      int var1 = this.Field12431;
      int var2 = this.Field12432;
      int var3 = this.Field12433;
      int var4 = this.Field12434 + 1;
      if (this.Field12430 == 1 && (Field12712 || GraphicsDisplay.Field2678)) {
         var1 += 519;
         var2 += 168;
      }

      if (this.Field12430 == 2 && (Field12712 || GraphicsDisplay.Field2678)) {
         var2 += 338;
      }

      if (GraphicsDisplay.Field2678) {
         GraphicsDisplay.Method997().Method1011(var1, var2, var3, 18, 1, 255, this);
         GraphicsDisplay.Method997().Method1011(var1, var2 + 18, var3, var4 - 18, 1, 175, this);
         GraphicsDisplay.Method997().Method1011(var1 + 1, var2 + 18, var3 - 2, var4 - 19, 6116423, 175, this);
      } else {
         Class697.Method8269(var4, var2, var1, 6116423, var3);
         Class697.Method8269(16, var2 + 1, var1 + 1, 0, var3 - 2);
         Class697.Method14503(var1 + 1, var3 - 2, var4 - 19, 0, var2 + 18);
      }

      boldFont.Method9453(6116423, "Choose Option", var2 + 14, var1 + 3);
      var4 = super.mouseEventX;
      int var5 = super.mouseEventY;
      if (this.Field12430 == 1 && !Field12712 && !GraphicsDisplay.Field2678) {
         var4 -= 519;
         var5 -= 168;
      }

      if (this.Field12430 == 2 && !Field12712 && !GraphicsDisplay.Field2678) {
         var5 -= 338;
      }

      if (this.Field12430 == 3) {
         var4 -= 519;
      }

      for(int var6 = 0; var6 < this.Field12575; ++var6) {
         int var7 = var2 + 31 + (this.Field12575 - 1 - var6) * 15;
         int var8 = 16777215;
         if (var4 > var1 && var4 < var1 + var3 && var5 > var7 - 13 && var5 < var7 + 3) {
            var8 = 16776960;
         }

         boldFont.addButton(true, var1 + 3, var8, this.Field12634[var6], var7);
      }

   }

   private void Method13276(long var1) {
      if (var1 != 0L) {
         try {
            if (this.Field12370 >= 200) {
               this.pushMessage("Your friendlist is full. Max of 200 allowed.", 0, "");
            } else {
               String var3 = Class23.Method207(Class23.Method203(var1));

               int var4;
               for(var4 = 0; var4 < this.Field12370; ++var4) {
                  if (this.Field12437[var4] == var1) {
                     this.pushMessage(var3 + " is already on your friend list", 0, "");
                     return;
                  }
               }

               for(var4 = 0; var4 < this.user_ignore_count; ++var4) {
                  if (this.user_ignore_names[var4] == var1) {
                     this.pushMessage("Please remove " + var3 + " from your ignore list first", 0, "");
                     return;
                  }
               }

               if (!var3.equals(session_player.name)) {
                  this.Players[this.Field12370] = var3;
                  this.Field12437[this.Field12370] = var1;
                  this.Field12323[this.Field12370] = 0;
                  ++this.Field12370;
                  this.Field12630.Method14445(188);
                  this.Field12630.Method394(var1);
               }
            }
         } catch (RuntimeException var5) {
            Signlink.reporterror("15283, 68, " + var1 + ", " + var5.toString());
            throw new RuntimeException();
         }
      }
   }

   private int Method13277(int var1, int var2, int var3) {
      return this.Method13278(var1, var2, var3, true);
   }

   private int Method13278(int var1, int var2, int var3, boolean var4) {
      if (this.intGroundArray != null && this.tileSettingBits != null) {
         int var5 = var3 >> 7;
         int var6 = var2 >> 7;
         if (var5 >= 0 && var6 >= 0 && var5 <= SceneGraph.mapSizeWidth - 1 && var6 <= SceneGraph.mapSizeWidth - 1) {
            int var7 = Field12490 + var5;
            int var8 = Field12491 + var6;
            if ((var1 = var1) < 3 && (this.tileSettingBits[1][var5][var6] & 2) == 2) {
               ++var1;
            }

            var3 &= 127;
            var2 &= 127;
            int var9 = this.intGroundArray[var1][var5][var6] * (128 - var3) + this.intGroundArray[var1][var5 + 1][var6] * var3 >> 7;
            int var10 = this.intGroundArray[var1][var5][var6 + 1] * (128 - var3) + this.intGroundArray[var1][var5 + 1][var6 + 1] * var3 >> 7;
            float var11 = 0.0F;
            Class501 var12;
            if (Field12068 > 0 && var4 && ((var12 = Field12428.Method8846(var1, var5, var6)) == null || var12.Field12853 <= 0 && var12.Field12850 == null)) {
               var9 += (int)(Field12428.Field924.Method8952(var1, var5, var6) * (float)(128 - var3) + Field12428.Field924.Method8952(var1, var5 + 1, var6) * (float)var3) >> 7;
               var10 += (int)(Field12428.Field924.Method8952(var1, var5, var6 + 1) * (float)(128 - var3) + Field12428.Field924.Method8952(var1, var5 + 1, var6 + 1) * (float)var3) >> 7;
            }

            int var13 = var9 * (128 - var2) + var10 * var2 >> 7;
            if (var7 >= 3142 && var8 >= 3469 && var7 <= 3187 && var8 <= 3514 && var13 == -326) {
               var11 = 10.0F;
            }

            return (int)((float)var13 + var11);
         } else {
            return 0;
         }
      } else {
         return 0;
      }
   }

   private static String Method13279(int var0) {
      if (var0 < 100000) {
         return String.valueOf(var0);
      } else {
         return var0 < 10000000 ? var0 / 1000 + "K" : var0 / 1000000 + "M";
      }
   }

   private static String Method13280(int var0) {
      if (var0 < 10000) {
         return String.valueOf(var0);
      } else {
         return var0 < 1000000 ? var0 / 1000 + "K" : var0 / 1000000 + "M";
      }
   }

   public final void resetForLogout() {
      Field12596 = false;
      if (GraphicsDisplay.Field2678 && GraphicsDisplay.Field2667) {
         Class843.currentTime = System.currentTimeMillis();
         Class843.Method14008();
         Class838.Field6955.Method10099();
      }

      if (class329 != null) {
         class329.clear();
      }

      this.Field12092 = 0;
      this.Field12298 = 0;
      System.out.println("[Client]: Resetting for logout...");
      this.Field12137.clear();
      this.Field12135.clear();
      this.Field12136.clear();

      int var1;
      for(var1 = 0; var1 < this.Field12235.length; ++var1) {
         this.Field12235[var1] = -1.0F;
      }

      this.Field12239.clear();
      this.Field12101 = 0;
      this.Field12444[1200] = 0;
      this.Field12111 = 0;
      Field12109 = 0.0F;
      Field12251 = false;
      Field12483 = 2;

      try {
         if (Field12176 != null) {
            Field12176.close();
         }

         if (Field12175 != null) {
            Field12175.close();
         }
      } catch (Exception var4) {
         var4.printStackTrace();
      }

      Field12176 = null;
      Field12175 = null;

      try {
         if (this.Field12608 != null) {
            this.Field12608.Method11824();
         }
      } catch (Exception var3) {
         ;
      }

      for(var1 = 0; var1 < this.Players.length; ++var1) {
         this.Players[var1] = null;
         this.Field12323[var1] = 0;
         this.Field12437[var1] = 0L;
         if (var1 < this.user_ignore_names.length) {
            this.user_ignore_names[var1] = 0L;
         }

         this.Field12370 = 0;
      }

      if (this.Field12608 != null) {
         try {
            this.Field12608.Method11824();
         } catch (Exception var2) {
            ;
         }

         this.Field12608 = null;
      }

      Field12567 = 0;
      Field12568 = 0;
      Field12527 = 0;
      Field12528 = 0;
      Field12494 = 0;
      Field12495 = 0;
      if (session_player != null) {
         session_player.Method9109(52, 52, true);
      }

      Field12593 = false;
      Field12594 = false;
      this.Field12325 = 0;
      this.Field12612 = this.Field12614 = this.Field12151 = "";
      this.Field12150 = null;
      Method13252();
      Model.Method14474();
      this.Field12162 = true;
      this.Field12163 = false;
      Field12428.Method8853();

      for(var1 = 0; var1 < 4; ++var1) {
         this.Field12655[var1].Method8187();
      }

      Signlink.Method11836();
      this.Field12438 = -1;
      this.Field12652 = -1;
      this.Field12678 = 0;
      SceneGraph.Method8885(50);
      if (GraphicsDisplay.Field2678) {
         GraphicsDisplay.Method997().Field2685 = true;
      }

      this.Field12164 = true;
      Field12493 = 0;
      Field12492 = 0;
      Field12491 = 0;
      Field12490 = 0;
      Field12495 = 0;
      Field12494 = 0;
      Field12498 = 0;
      Field12497 = 0;
      if (Field12219 != null) {
         Field12219.Method12346();
         Field12219 = null;
      }

      if (Field12588) {
         this.Method13388();
      }

      if (this.Field12418 != null) {
         this.Field12418.Field9893 = null;
         this.Field12418 = null;
         System.gc();
      }

   }

   private void Method13282() {
      this.Field12522 = true;

      for(int var1 = 0; var1 < 7; ++var1) {
         this.Field12523[var1] = -1;

         for(int var2 = 0; var2 < IdentityKit.Field10599; ++var2) {
            if (!IdentityKit.cache[var2].Field10606 && IdentityKit.cache[var2].Field10601 == var1 + (this.Field12503 ? 0 : 7)) {
               this.Field12523[var1] = var2;
               break;
            }
         }
      }

   }

   private static Npc Method13283(int var0) {
      Npc var1;
      (var1 = new Npc()).ah_2 = currentTime;
      var1.Field4103 = NPCDefinition.Method11884(var0);
      var1.ak_2 = var1.Field4103.Field10740;
      var1.degreesToTurn = var1.Field4103.degreesToTurn;
      var1.ak_2 = var1.Field4103.Field10740;
      var1.aD_0 = var1.Field4103.Field10738;
      var1.aE_0 = var1.Field4103.Field10732;
      var1.aF_0 = var1.Field4103.runAnimIndex;
      var1.aG_0 = var1.Field4103.Field10730;
      var1.F_6 = var1.Field4103.Field10747;
      var1.B_9 = var1.Field4103.Field10739;
      if (var0 == 494) {
         var1.aD_0 = 819;
      }

      return var1;
   }

   private void Method13284(int var1, Packet var2) {
      int var3;
      while(var2.Field1261 + 21 < var1 << 3 && (var3 = var2.gbits(14)) != 16383) {
         this.Field12327[var3] = new Npc();
         Npc var4;
         (var4 = this.Field12327[var3]).Field4102 = var3;
         this.Field12329[Field12328++] = var3;
         var4.ah_2 = currentTime;
         int var5;
         if ((var5 = var2.gbits(6)) > 31) {
            var5 -= 64;
         }

         int var6;
         if ((var6 = var2.gbits(6)) > 31) {
            var6 -= 64;
         }

         int var7 = var2.gbits(1);
         int var8 = var2.gbits(16);
         var4.Field4103 = NPCDefinition.Method11884(var8);
         if (var2.gbits(1) == 1) {
            this.session_npcs_awaiting_update[this.sessionNpcsAwaitingUpdatePtr++] = var3;
         }

         var4.ak_2 = var4.Field4103.Field10740;
         var4.Field8769 = var4.Field4103.degreesToTurn;
         var4.ak_2 = var4.Field4103.Field10740;
         var4.aD_0 = var4.Field4103.Field10738;
         var4.aE_0 = var4.Field4103.Field10732;
         var4.aF_0 = var4.Field4103.runAnimIndex;
         var4.aG_0 = var4.Field4103.Field10730;
         var4.F_6 = var4.Field4103.Field10747;
         var4.B_9 = var4.Field4103.Field10739;
         Sequence.Method8281(var4.Field4103.Field10747);
         Sequence.Method8281(var4.Field4103.Field10738);
         Sequence.Method8281(var4.Field4103.Field10739);
         if (var8 == 494) {
            var4.aD_0 = 819;
         }

         var4.u_29 = true;
         var4.v_16 = false;
         var4.a(session_player.w_14[0] + var6, session_player.x_13[0] + var5, var7 == 1);
      }

      var2.Method14524();
   }

   private void Method13285() {
      if (this.Field12613) {
         String var1 = "Connection lost";
         String var2 = "Attempting to reestablish...";
         int var3 = boldFont.Method9451(var2) + 6;
         if (this.Field12092 != 0) {
            var1 = "Connection lost";
            var2 = "Switching worlds...";
         }

         if (GraphicsDisplay.Field2678) {
            GraphicsDisplay.Method997().Method1010(46, 34, var3, 38, 16777120, this);
            GraphicsDisplay.Method997().Method1010(44, 32, var3 + 4, 42, 0, this);
            GraphicsDisplay.Method997().Method1010(46, 34, var3, 38, 16777120, this);
         } else {
            if (Field12593) {
               this.Field12604.Method13683();
            }

            Class697.Method8269(38, 33, 45, 16777120, var3);
            Class697.Method14503(45, var3, 38, 0, 33);
         }

         boldFont.Method9448(0, var1, 50, 50);
         boldFont.Method9448(0, var2, 64, 50);
         if (!GraphicsDisplay.Field2678 && Field12593) {
            this.Field12604.Method3038(0, super.Method11952(), 0);
         }

      }
   }

   private void Method13286() {
      if (Class280.Method2988() != null) {
         Class280.Method2988().Method2993();
         int var1 = this.Field12526 == null ? 0 : this.Field12526.Method1307();
         if (Field12483 == 1 || Field12251 || System.currentTimeMillis() - Field12253 < 1000L || var1 > 10 || Field12218 != null && !Field12218.Method8825() || Field12219 != null) {
            String var2 = " [Files: " + var1 + "]";
            if (var1 <= 10) {
               var2 = "";
            }

            String var3 = Field12080 ? " type: " + this.Field12254 + ", floor: " + Field12252 : "";
            var3 = Field12129 + " is loading..." + var2 + var3;
            int var5 = plainFont.Method9451(var3) + 5;
            if (GraphicsDisplay.Field2678) {
               Class663 var4 = new Class663(6, 22, var3, false, false);
               this.Field12286.add(var4);
               var4.Method10874();
               return;
            }

            if (Field12593) {
               this.Field12604.Method13683();
            }

            Class697.Method8269(24, 21, 13, 16777120, var5);
            Class697.Method14503(13, var5, 24, 0, 21);
            plainFont.Method9448(0, var3, 38, 16);
            if (!GraphicsDisplay.Field2678 && Field12593) {
               this.Field12604.Method3038(0, super.Method11952(), 0);
            }
         }

      }
   }

   public final void doLogic(boolean var1, float var2) {
      if (Field12059.size() > 0) {
         this.Method13334((String)Field12059.poll());
      }

      Client var3 = this;
      float var4 = (float)(System.currentTimeMillis() - this.Field12234) / 100.0F;
      if (Field12109 > 0.0F) {
         Field12109 -= var4;
      }

      int var5;
      for(var5 = 0; var5 < var3.Field12235.length; ++var5) {
         if (var3.Field12235[var5] >= 0.0F) {
            var3.Field12235[var5] -= var4;
         }
      }

      var3.Field12234 = System.currentTimeMillis();
      if (currentTime % 50 == 0) {
         Method13397();
      }

      if (Field12237) {
         this.Method13208();
         byte var10 = 113;
         this.Method13210(var10, 0, 0);
         Field12237 = false;
      }

      if (this.Field12094) {
         this.Field12094 = false;
         if (this.Field12608 != null) {
            this.Field12608.Method11824();
         }

         if (this.Field12630 != null) {
            this.Field12630.pos = 0;
         }

         this.Method13339(this.myUsername, this.Field12612);
         this.Field12613 = true;
      }

      if (Field12272) {
         if (this.Field12236++ > 5) {
            Field12272 = false;
            this.Field12613 = false;
            this.resetForLogout();
            this.Field12236 = 0;
         } else {
            this.Method13342(this.myUsername, this.Field12612, false);
            if (this.Field12613) {
               this.Field12613 = false;
            }

            Field12272 = false;
         }
      } else {
         try {
            if (this.Field12383) {
               return;
            }

            currentTime = Math.round(Field12599 += var2 * 1.0F);
            if (!Field12593) {
               var3 = this;
               if (Field12243 != null) {
                  this.myUsername = Field12243;
                  this.Field12612 = Field12244;
                  this.Field12211 = Field12245;
                  this.Field12325 = 2;
                  this.Method13339(this.myUsername, this.Field12612);
                  Field12243 = null;
                  Field12244 = null;
               } else {
                  super.myWidth = this.Method13236();
                  super.myHeight = this.Method13237();
                  if (this.Field12099 == 1) {
                     this.Method13246();
                     if (Field12166) {
                        Field12483 = 0;
                     }
                  } else if (this.Field12424.Method889(super.clickX, super.clickY, 3)) {
                     this.Field12099 = 1;
                  } else if (this.Field12429[13].Method889(super.clickX, super.clickY, 2)) {
                     super.Method11973();
                     Field12588 = !Field12588;
                     this.Method13388();
                     initializeGL();
                  } else {
                     super.myHeight -= 40;
                     int var8;
                     int var9;
                     int var11;
                     if (this.Field12325 == 0) {
                        var5 = super.myWidth / 2 - 80;
                        var8 = super.myHeight / 2 + 20;
                        var8 += 20;
                        var9 = super.clickX - var5;
                        var11 = super.clickY - var8;
                        if (super.mouseButtonPressed == 1 && var9 >= 25 && var9 <= 134 && var11 >= 40 && var11 <= 70) {
                           if (GraphicsDisplay.Field2678) {
                              if (GraphicsDisplay.screenResolutionWidth > 1920) {
                                 this.Field12418 = null;
                                 Field12166 = !Field12166;
                                 Class843.Field3755 = true;
                              } else {
                                 Field12166 = false;
                                 this.pushMessage("Your machine has no support for large image backgrounds!", 0, "");
                              }
                           } else {
                              Field12166 = !Field12166;
                           }

                           initializeGL();
                           if (Field12173 != null) {
                              Field12173 = null;
                              this.Field12174 = 0L;
                           }
                        }

                        if (super.mouseButtonPressed == 1 && super.clickX >= var5 - 75 && super.clickX <= var5 + 75 && super.clickY >= var8 - 20 && super.clickY <= var8 + 20) {
                           if (!this.Field12152) {
                              this.openURL(Field12130 + "/register");
                              this.Field12152 = true;
                           }

                           this.Field12684 = "";
                           this.Field12685 = "Enter your username & password.";
                           this.Field12612 = this.Field12614;
                           this.Field12325 = 2;
                           this.Field12643 = 0;
                           this.Field12152 = false;
                        }

                        var5 = super.myWidth / 2 + 80;
                        if (super.mouseButtonPressed == 1 && super.clickX >= var5 - 75 && super.clickX <= var5 + 75 && super.clickY >= var8 - 20 && super.clickY <= var8 + 20) {
                           this.Field12684 = "";
                           this.Field12685 = "Enter your username & password.";
                           this.Field12612 = this.Field12614;
                           this.Field12325 = 2;
                           this.Field12643 = 0;
                           this.Field12152 = false;
                        }
                     } else {
                        this.Field12152 = false;
                        if (this.Field12325 == 2) {
                           var5 = super.myHeight / 2 - 40;
                           var5 += 20;
                           var5 += 25;
                           if (super.mouseButtonPressed == 1 && super.clickY >= var5 - 15 && super.clickY < var5) {
                              this.Field12643 = 0;
                           }

                           var5 += 15;
                           if (super.mouseButtonPressed == 1 && super.clickY >= var5 - 15 && super.clickY < var5) {
                              this.Field12643 = 1;
                           }

                           var5 += 15;
                           if (super.mouseButtonPressed == 1 && super.clickY >= var5 - 15 && super.clickY < var5) {
                              this.Field12643 = 2;
                           }

                           var8 = super.myWidth / 2 - 80;
                           var9 = super.myHeight / 2 + 50;
                           var9 += 20;
                           if (super.mouseButtonPressed == 1 && super.clickX >= var8 - 75 && super.clickX <= var8 + 75 && super.clickY >= var9 - 20 && super.clickY <= var9 + 20) {
                              this.Method13339(this.myUsername, this.Field12612);
                           }

                           var8 = super.myWidth / 2 + 80;
                           if (super.mouseButtonPressed == 1 && super.clickX >= var8 - 75 && super.clickX <= var8 + 75 && super.clickY >= var9 - 20 && super.clickY <= var9 + 20) {
                              this.Field12325 = 0;
                              this.Field12614 = "";
                              this.Field12151 = "";
                              this.Field12684 = "";
                              this.Field12685 = "";
                              this.Field12686 = "";
                           }

                           label459:
                           while(true) {
                              while(true) {
                                 if ((var11 = var3.e()) == -1) {
                                    break label459;
                                 }

                                 var1 = false;

                                 for(var9 = 0; var9 < validUserPassChars.length(); ++var9) {
                                    if (var11 == validUserPassChars.charAt(var9)) {
                                       var1 = true;
                                       break;
                                    }
                                 }

                                 if (var3.Field12643 == 0) {
                                    if (var11 == 8 && var3.myUsername.length() > 0) {
                                       var3.myUsername = var3.myUsername.substring(0, var3.myUsername.length() - 1);
                                    }

                                    if (var11 == 9 || var11 == 10 || var11 == 13) {
                                       var3.Field12643 = 1;
                                    }

                                    if (var1) {
                                       var3.myUsername = var3.myUsername + (char)var11;
                                    }

                                    if (var3.myUsername.length() > 13) {
                                       var3.myUsername = var3.myUsername.substring(0, 13);
                                    }

                                    var3.myUsername = Method13233(var3.myUsername);
                                 } else if (var3.Field12643 == 1) {
                                    if (var11 == 8 && var3.Field12612.length() > 0) {
                                       var3.Field12612 = var3.Field12612.substring(0, var3.Field12612.length() - 1);
                                    }

                                    if (var11 == 9 || var11 == 10 || var11 == 13) {
                                       var3.Field12643 = 2;
                                    }

                                    if (var1) {
                                       var3.Field12612 = var3.Field12612 + (char)var11;
                                    }

                                    if (var3.Field12612.length() > 20) {
                                       var3.Field12612 = var3.Field12612.substring(0, 20);
                                    }

                                    var3.Field12614 = var3.Field12612;
                                 } else if (var3.Field12643 == 2) {
                                    if (var11 == 8 && var3.Field12211.length() > 0) {
                                       var3.Field12211 = var3.Field12211.substring(0, var3.Field12211.length() - 1);
                                    }

                                    if (var11 == 9 || var11 == 10 || var11 == 13) {
                                       if (var11 == 9) {
                                          var3.Field12643 = 0;
                                       } else {
                                          var3.Method13339(var3.myUsername, var3.Field12612);
                                       }
                                    }

                                    if (var1) {
                                       var3.Field12211 = var3.Field12211 + (char)var11;
                                    }

                                    if (var3.Field12211.length() > 2 && !var3.Field12211.startsWith("#")) {
                                       var3.Field12211 = var3.Field12211.substring(0, 2);
                                    }
                                 }
                              }
                           }
                        } else if (this.Field12325 == 3) {
                           label493: {
                              var5 = super.myHeight / 2 - 40;
                              var5 += 20;
                              var5 += 25;
                              if (super.mouseButtonPressed == 1 && super.clickY >= var5 - 15 && super.clickY < var5) {
                                 this.Field12643 = 0;
                              }

                              var5 += 15;
                              if (super.mouseButtonPressed == 1 && super.clickY >= var5 - 15 && super.clickY < var5) {
                                 this.Field12643 = 1;
                              }

                              var5 += 15;
                              if (super.mouseButtonPressed == 1 && super.clickY >= var5 - 15 && super.clickY < var5) {
                                 this.Field12643 = 2;
                              }

                              var8 = super.myWidth / 2 - 80;
                              var9 = super.myHeight / 2 + 50;
                              var9 += 20;
                              if (super.mouseButtonPressed == 1 && super.clickX >= var8 - 75 && super.clickX <= var8 + 75 && super.clickY >= var9 - 20 && super.clickY <= var9 + 20) {
                                 if (!this.Field12614.equals(this.Field12151)) {
                                    this.Field12684 = "";
                                    this.Field12685 = "Error - passwords do not match";
                                    break label493;
                                 }

                                 this.Method13339(this.myUsername, this.Field12612);
                              }

                              var8 = super.myWidth / 2 + 80;
                              if (super.mouseButtonPressed == 1 && super.clickX >= var8 - 75 && super.clickX <= var8 + 75 && super.clickY >= var9 - 20 && super.clickY <= var9 + 20) {
                                 this.Field12325 = 0;
                                 this.Field12614 = "";
                                 this.Field12151 = "";
                              }

                              label402:
                              while(true) {
                                 while(true) {
                                    if ((var11 = var3.e()) == -1) {
                                       break label402;
                                    }

                                    var1 = false;

                                    for(var9 = 0; var9 < validUserPassChars.length(); ++var9) {
                                       if (var11 == validUserPassChars.charAt(var9)) {
                                          var1 = true;
                                          break;
                                       }
                                    }

                                    if (var3.Field12643 == 0) {
                                       if (var11 == 8 && var3.myUsername.length() > 0) {
                                          var3.myUsername = var3.myUsername.substring(0, var3.myUsername.length() - 1);
                                       }

                                       if (var11 == 9 || var11 == 10 || var11 == 13) {
                                          var3.Field12643 = 1;
                                       }

                                       if (var1) {
                                          var3.myUsername = var3.myUsername + (char)var11;
                                       }

                                       if (var3.myUsername.length() > 13) {
                                          var3.myUsername = var3.myUsername.substring(0, 13);
                                       }
                                    } else if (var3.Field12643 == 1) {
                                       if (var11 == 8 && var3.Field12612.length() > 0) {
                                          var3.Field12612 = var3.Field12612.substring(0, var3.Field12612.length() - 1);
                                       }

                                       if (var11 == 9 || var11 == 10 || var11 == 13) {
                                          var3.Field12643 = 2;
                                       }

                                       if (var1) {
                                          var3.Field12612 = var3.Field12612 + (char)var11;
                                       }

                                       if (var3.Field12612.length() > 20) {
                                          var3.Field12612 = var3.Field12612.substring(0, 20);
                                       }

                                       var3.Field12614 = var3.Field12612;
                                    } else if (var3.Field12643 == 2) {
                                       if (var11 == 8 && var3.Field12151.length() > 0) {
                                          var3.Field12151 = var3.Field12151.substring(0, var3.Field12151.length() - 1);
                                       }

                                       if (var11 == 9 || var11 == 10 || var11 == 13) {
                                          var3.Field12643 = 0;
                                       }

                                       if (var1) {
                                          var3.Field12151 = var3.Field12151 + (char)var11;
                                       }

                                       if (var3.Field12151.length() > 20) {
                                          var3.Field12151 = var3.Field12151.substring(0, 20);
                                       }
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            } else if (!Field12272) {
               this.Method13301(var1, var2);
               if (Field12290) {
                  Field12594 = true;
                  Field12290 = false;
                  this.Field12630.Method14445(121);
               }
            }
         } catch (Exception var7) {
            var7.printStackTrace();
         }

         try {
            this.Method13297();
         } catch (Exception var6) {
            var6.printStackTrace();
         }

         if (class329 != null) {
            class329.Method3403(this.c_98);
            class329.Method3404();
         }

      }
   }

   private void Method13288(boolean var1) {
      int var10000 = session_player.Field4194;
      var10000 = session_player.Field4195;
      if (session_player.Field4194 >> 7 == Field12679 && session_player.Field4195 >> 7 == Field12680) {
         Field12679 = 0;
      }

      int var2 = session_player_count;
      if (var1) {
         var2 = 1;
      }

      for(int var3 = 0; var3 < var2; ++var3) {
         Player var4;
         long var5;
         if (var1) {
            var4 = session_player;
            var5 = (long)(this.Field12362 << 14);
         } else {
            var4 = this.session_players[this.session_player_list[var3]];
            var5 = (long)(this.session_player_list[var3] << 14);
            if (this.session_player_list[var3] == this.Field12362) {
               continue;
            }
         }

         if (var4 != null && var4.visible) {
            int var7 = var4.Field4194 >> 7;
            int var8 = var4.Field4195 >> 7;
            if (var7 >= 0 && var7 < SceneGraph.mapSizeWidth && var8 >= 0 && var8 < SceneGraph.mapSizeWidth) {
               boolean var14 = var4.v_16;
               boolean var9 = var4.aw_2 <= 0 && var4.ax_2 <= 0;
               var5 += (long)(var7 + (var8 << 7));
               if (var4.aModel_1714 != null && currentTime >= var4.Field4194 && currentTime < var4.Field4195) {
                  var4.aBoolean1699 = false;
                  var4.drawHeight = this.Method13278(Field12379, var4.Field4195, var4.Field4194, var9);
                  Field12428.Method8866(Field12379, var4.Field4195, var4, var4.aB_2, var4.anInt1722, var4.Field4194, var4.drawHeight, var4.anInt1719, var4.anInt1721, var5, var4.anInt1720);
               } else {
                  if ((var4.Field4194 & 127) == 64 && (var4.Field4195 & 127) == 64) {
                     if (this.Field12385 == null) {
                        break;
                     }

                     if (this.Field12385[var7][var8] == this.Field12683) {
                        continue;
                     }

                     this.Field12385[var7][var8] = this.Field12683;
                  }

                  var4.drawHeight = this.Method13278(Field12379, var4.Field4195, var4.Field4194, var9);
                  var4.o_28 = var5 >> 14 << 14;
                  Field12428.Method8865(Field12379, var4.aB_2, var4.drawHeight, var5, var4.Field4195, 60, var4.Field4194, var4, var4.al_1);

                  for(int var13 = 0; var13 < var4.e().size(); ++var13) {
                     var4.a((Class595)var4.e().get(var13));
                     long var11 = ((var5 >> 14 << 14) + (long)var13 << 32) + (long)(var7 + (var8 << 7));
                     Model var10;
                     if ((var10 = var4.a(var13, var4.playerGender, var11)) != null) {
                        var10.Field2753 = true;
                        var10.Field2754 = 2500;
                        Field12428.Method8865(Field12379, var4.aB_2, var4.drawHeight, var11, var4.Field4195, 60, var4.Field4194, var10, var4.al_1);
                     }
                  }
               }
            }
         }
      }

   }

   private boolean Method13289(RSInterface var1) {
      int var5 = var1.Field12751;
      if (this.Field12371 == 2) {
         if (var5 == 201) {
            Field12649 = true;
            this.Field12650 = 0;
            this.Field12676 = true;
            this.Field12639 = "";
            this.Field12521 = 1;
            this.Field12564 = "Enter name of friend to add to list";
         }

         if (var5 == 202) {
            Field12649 = true;
            this.Field12650 = 0;
            this.Field12676 = true;
            this.Field12639 = "";
            this.Field12521 = 2;
            this.Field12564 = "Enter name of friend to delete from list";
         }
      }

      if (var5 == 205) {
         this.Field12474 = 250;
         return true;
      } else {
         if (var5 == 501) {
            Field12649 = true;
            this.Field12650 = 0;
            this.Field12676 = true;
            this.Field12639 = "";
            this.Field12521 = 4;
            this.Field12564 = "Enter name of player to add to list";
         }

         if (var5 == 502) {
            Field12649 = true;
            this.Field12650 = 0;
            this.Field12676 = true;
            this.Field12639 = "";
            this.Field12521 = 5;
            this.Field12564 = "Enter name of player to delete from list";
         }

         if (var5 == 550) {
            Field12649 = true;
            this.Field12650 = 0;
            this.Field12676 = true;
            this.Field12639 = "";
            this.Field12521 = 6;
            this.Field12564 = "Enter the name of the chat you wish to join";
         }

         int var2;
         int var3;
         int var4;
         if (var5 >= 300 && var5 <= 313) {
            var2 = (var5 - 300) / 2;
            var3 = var5 & 1;
            if ((var4 = this.Field12523[var2]) != -1) {
               if (var2 == 1 && !this.Field12503) {
                  var4 = -1;
               } else {
                  do {
                     if (var3 == 0) {
                        --var4;
                        if (var4 < 0) {
                           var4 = IdentityKit.Field10599 - 1;
                        }
                     }

                     if (var3 == 1) {
                        ++var4;
                        if (var4 >= IdentityKit.Field10599) {
                           var4 = 0;
                        }
                     }
                  } while(IdentityKit.cache[var4].Field10606 || IdentityKit.cache[var4].Field10601 != var2 + (this.Field12503 ? 0 : 7));
               }

               this.Field12523[var2] = var4;
            }

            this.Field12522 = true;
         }

         if (var5 >= 314 && var5 <= 323) {
            var2 = (var5 - 314) / 2;
            var3 = var5 & 1;
            var4 = this.Field12460[var2];
            if (var3 == 0) {
               --var4;
               if (var4 < 0) {
                  var4 = Field12468[var2].length - 1;
               }
            }

            if (var3 == 1) {
               ++var4;
               if (var4 >= Field12468[var2].length) {
                  var4 = 0;
               }
            }

            this.Field12460[var2] = var4;
            this.Field12522 = true;
         }

         if (var5 == 324 && !this.Field12503) {
            this.Field12503 = true;
            this.Method13282();
         }

         if (var5 == 325 && this.Field12503) {
            this.Field12503 = false;
            this.Method13282();
         }

         if (var5 != 326) {
            if (var5 == 613) {
               this.Field12595 = !this.Field12595;
            }

            if (var5 >= 601 && var5 <= 613) {
               if (var5 < 612) {
                  this.Method13404();
               }

               if (this.Field12356.length() > 0) {
                  this.Field12630.Method14445(218);
                  this.Field12630.Method394(Class23.nameToLong(this.Field12356));
                  this.Field12630.Method388(var5 - 601);
                  this.Field12630.Method388(this.Field12595 ? 1 : 0);
               }
            }

            return false;
         } else {
            this.Field12630.Method14445(101);
            this.Field12630.Method388(this.Field12503 ? 0 : 1);

            for(var2 = 0; var2 < 7; ++var2) {
               this.Field12630.Method14470(this.Field12523[var2]);
            }

            for(var2 = 0; var2 < 5; ++var2) {
               this.Field12630.Method14470(this.Field12460[var2]);
            }

            return true;
         }
      }
   }

   private void appendPlayerUpdateMask(Packet stream) {
      for(int var2 = 0; var2 < this.sessionNpcsAwaitingUpdatePtr; ++var2) {
         int var3 = this.session_npcs_awaiting_update[var2];
         Player player = this.session_players[var3];
         int var5;
         if (((var5 = stream.g1()) & 64) != 0) {
            var5 += stream.g1() << 8;
         }

         Player var7 = player;
         Packet var6 = stream;

         Client client = this;

         if ((var5 & 1024) != 0) {
            player.an_4 = stream.sg1();
            player.au_0 = stream.sg1();
            player.at_0 = stream.sg1();
            player.av_0 = stream.sg1();
            player.aw_2 = stream.isg2() + currentTime;
            player.ax_2 = stream.sg2() + currentTime;
            player.ay_0 = stream.sg1();
            player.resetPath();
         }

         int textInfo;
         if ((var5 & 256) != 0) {
            player.gfxId = stream.ig2(); //gfxID
            SpotAnim.Method8313(player.gfxId);
            textInfo = stream.Method404();
            player.graphicHeight = textInfo >> 16; //graphicHeight
            player.gfxDelay = currentTime + (textInfo & '\uffff'); //gfxDelay
            player.animation = 0; //gfxId
            player.P_3 = 0;
            player.Q_3 = 0.0F;
            if (player.animationDelay > currentTime) { //gfxDelay
               player.animation = -1; //gfxId
            }

            if (player.gfxId == 65535) { //gfxID
               player.gfxId = -1; //gfxID
            }

            player.Method9426();
         }

         int rights;
         int length;
         if ((var5 & 8) != 0) {
            if ((textInfo = stream.ig2()) == 65535) {
               textInfo = -1;
            }

            rights = stream.ng1b();
            Sequence.Method8281(textInfo);
            if (textInfo == player.U_2 && textInfo != -1) {
               if ((length = Sequence.anims[textInfo].Field10154) == 1) {
                  player.W_3 = 0;
                  player.X_7 = 0;
                  player.Y_7 = 0.0F;
                  player.Z_2 = rights;
                  player.Field4195 = (float)rights;
                  player.ab_6 = 0;
               }

               if (length == 2) {
                  player.ab_6 = 0;
               }
            } else if (textInfo == -1 || player.U_2 == -1 || Sequence.anims[textInfo].Field10148 >= Sequence.anims[player.U_2].Field10148) {
               player.U_2 = textInfo;
               player.W_3 = 0;
               player.X_7 = 0;
               player.Y_7 = 0.0F;
               player.Z_2 = rights;
               player.Field4195 = (float)rights;
               player.ab_6 = 0;
               player.am_4 = player.T_2;
            }
         }

         if ((var5 & 4) != 0) {
            player.C_8 = stream.Method406(); //textSpoken
            if (player.C_8.charAt(0) == '~') { //textSpoken
               player.C_8 = player.C_8.substring(1); //textSpoken
               this.pushMessage(player.C_8, 2, player.name); //textSpoken
            } else if (player == session_player) {
               this.pushMessage(player.C_8, 2, player.name); //textSpoken
            }

            player.H_5 = 0; //fancyTextColourType
            player.ac_2 = 0; //fancyTextDrawType
            player.ag_6 = 150; //textCycle
         }

         int k3;
         if ((var5 & 128) != 0) {
            textInfo = stream.ig2();
            rights = stream.g1();
            length = stream.ng1b();
            k3 = stream.pos;
            if (player.name != null && player.visible) {
               long var15 = Class23.nameToLong(player.name);
               boolean flag = false;
               int var13;
               if (rights <= 1) {
                  for(var13 = 0; var13 < client.user_ignore_count; ++var13) {
                     if (client.user_ignore_names[var13] == var15) {
                        flag = true;
                        break;
                     }
                  }
               }

               if (!flag) {
                  try {
                     client.aStream_834.pos = 0;
                     byte[] var14 = client.aStream_834.Field1259;
                     flag = false;
                     Packet var22 = var6;

                     for(var13 = length + 0 - 1; var13 >= 0; --var13) {
                        var14[var13] = var22.Field1259[var22.pos++];
                     }

                     client.aStream_834.pos = 0;
                     String var23 = TextInput.readFromStream(length, client.aStream_834);
                     var7.C_8 = var23; //textSpoken
                     var7.H_5 = textInfo >> 8; //fancyTextColourType
                     var7.Field4180 = rights; //privelage
                     var7.ac_2 = textInfo & 255; //fancyTextDrawType
                     var7.ag_6 = 150; //textCycle
                     if (rights != 2 && rights != 3) {
                        if (rights == 1) {
                           client.pushMessage(var23, 1, "@cr1@" + var7.name);
                        } else if (rights == 4) {
                           client.pushMessage(var23, 2, "@irn@" + var7.name);
                        } else {
                           client.pushMessage(var23, 2, var7.name);
                        }
                     } else {
                        client.pushMessage(var23, 1, "@cr2@" + var7.name);
                     }
                  } catch (Exception var17) {
                     var17.printStackTrace();
                     Signlink.reporterror("cde2");
                  }
               }
            }

            stream.pos = k3 + length;
         }

         if ((var5 & 1) != 0) {
            player.Field8767 = stream.ig2();
            if (player.Field8767 == 65535) {
               player.Field8767 = -1;
            }
         }

         if ((var5 & 16) != 0) {
            byte[] var20 = new byte[textInfo = stream.ng1b()];
            Packet var21 = new Packet(var20);
            stream.Method408(textInfo, 0, var20);
            client.Field12368[var3] = var21;
            player.Method9339(var21);
         }

         if ((var5 & 2) != 0) {
            player.ai_5 = stream.isg2(); //facex
            player.aj_2 = stream.ig2(); //facey
         }

         if ((var5 & 32) != 0) {
            textInfo = stream.g2();
            rights = stream.Method417();
            length = stream.g2();
            k3 = stream.g2();
            player.updateHitData(rights, textInfo, currentTime);
            player.ad_2 = currentTime + 300;
            player.ae_2 = length;
            player.af_6 = k3;
         }

         if ((var5 & 512) != 0) {
            textInfo = stream.g2();
            rights = stream.sg1();
            length = stream.g2();
            k3 = stream.g2();
            player.updateHitData(rights, textInfo, currentTime);
            player.ad_2 = currentTime + 300; //loopCycleStatus
            player.ae_2 = length; //currentHealth
            player.af_6 = k3; //maxHealth
         }
      }

   }

   private void loadTitleScreen() {
      new IndexedImage(this.titleJagexArchive, "titlebutton", 0);
      this.Field12589 = new IndexedImage[12];

      int var1;
      for(var1 = 0; var1 < 12; ++var1) {
         this.Field12589[var1] = new IndexedImage(this.titleJagexArchive, "runes", var1);
      }

      this.Field12336 = new int[256];

      for(var1 = 0; var1 < 64; ++var1) {
         this.Field12336[var1] = var1 * 262144;
      }

      for(var1 = 0; var1 < 64; ++var1) {
         this.Field12336[var1 + 64] = 16711680 + var1 * 1024;
      }

      for(var1 = 0; var1 < 64; ++var1) {
         this.Field12336[var1 + 128] = 16776960 + 4 * var1;
      }

      for(var1 = 0; var1 < 64; ++var1) {
         this.Field12336[var1 + 192] = 16777215;
      }

      this.Field12337 = new int[256];

      for(var1 = 0; var1 < 64; ++var1) {
         this.Field12337[var1] = var1 << 10;
      }

      for(var1 = 0; var1 < 64; ++var1) {
         this.Field12337[var1 + 64] = '\uff00' + 4 * var1;
      }

      for(var1 = 0; var1 < 64; ++var1) {
         this.Field12337[var1 + 128] = '\uffff' + var1 * 262144;
      }

      for(var1 = 0; var1 < 64; ++var1) {
         this.Field12337[var1 + 192] = 16777215;
      }

      this.Field12338 = new int[256];

      for(var1 = 0; var1 < 64; ++var1) {
         this.Field12338[var1] = var1 << 2;
      }

      for(var1 = 0; var1 < 64; ++var1) {
         this.Field12338[var1 + 64] = 255 + var1 * 262144;
      }

      for(var1 = 0; var1 < 64; ++var1) {
         this.Field12338[var1 + 128] = 16711935 + var1 * 1024;
      }

      for(var1 = 0; var1 < 64; ++var1) {
         this.Field12338[var1 + 192] = 16777215;
      }

      if (!this.Field12324) {
         this.Field12355 = true;
         this.Field12324 = true;
         this.startRunnable(this, 2);
      }

   }

   public static void main(String[] var0) {
      boolean var1 = true;
      if ((Field12246 = (double)Runtime.getRuntime().maxMemory() / 1024.0D / 1024.0D) >= 650.0D) {
         var1 = false;
      }

      String var2 = "";
      if (var0 != null && var0.length > 0) {
         if (var0[0].equals("software_renderer")) {
            Field12167 = 1;
            GraphicsDisplay.Field2678 = false;
            System.out.println("SOFTWARE RENDERER MODE: ON");
            var2 = var0[0];
            Class867.Method14538(false);
         }

         if (var0.length > 1 && var0[1].equals("jvm")) {
            var1 = false;
         }

         if (var0.length > 2 && var0[2].equals("debug")) {
            GraphicsDisplay.Field2672 = true;
            Field12081 = true;
            Field12080 = true;
         }

         if (var0.length > 4) {
            Field12243 = var0[3];
            Field12244 = var0[4];
            Field12245 = var0[5];
         }
      }

      if (var1) {
         Runtime var18 = Runtime.getRuntime();
         String var3 = System.getProperty("java.home") + "/bin/javaw";
         String var4 = Signlink.Method11830();
         var4 = var4 + "emps-world-client.jar";
         String[] var21 = new String[]{var3, "-Xmx1024m", "-jar", var4, var2, "jvm"};
         var3 = "";
         String[] var22 = var21;

         for(int var10 = 0; var10 < 6; ++var10) {
            String var9 = var22[var10];
            var3 = var3 + " " + var9;
         }

         System.out.println("run command: " + var3);

         try {
            long var24 = System.currentTimeMillis();
            Process var19 = var18.exec(var21);
            boolean var23 = true;

            while(true) {
               try {
                  Thread.sleep(100L);
                  var19.exitValue();
                  var23 = false;
                  break;
               } catch (Exception var16) {
                  if (System.currentTimeMillis() - var24 > 1000L) {
                     break;
                  }
               }
            }

            System.out.println("running: " + var23);
            if (var23) {
               System.exit(0);
            }
         } catch (Exception var17) {
            var17.printStackTrace();
         }
      }

      if (var1) {
         System.out.println("Unable to start new JVM. Starting low memory mode in this one...");
      }

      Client var20 = new Client();
      Signlink.Field2956 = 33;

      try {
         Signlink.Method11825(InetAddress.getLocalHost());
      } catch (Exception var15) {
         var15.printStackTrace();
      }

      Method13292();
      var20.a(width, height, false);
   }

   private static void Method13292() {
      double var0 = 0.0D;
      double var2 = 0.0D;
      if (!GraphicsDisplay.Field2678) {
         Dimension var4;
         var0 = (double)(var4 = Toolkit.getDefaultToolkit().getScreenSize()).width * 0.65D;
         var2 = (double)var4.height * 0.65D;
         if (var0 < 900.0D || var2 < 550.0D) {
            var0 = 978.0D;
            var2 = 550.0D;
         }
      }

      if (!Field12712) {
         var0 = 773.0D;
         var2 = 531.0D;
      }

      width = (int)var0;
      height = (int)var2;
   }

   public final void Method13293() {
      if (this.Field12249 == null) {
         this.Field12249 = new Class727();
      }

      this.Field12082.clear();
      this.Field12249.Method12328(this);
   }

   private void Method13294() {
      Field12251 = false;
      Field12483 = 2;
      if (GraphicsDisplay.Field2678) {
         GraphicsDisplay.Method997().Field2685 = true;
      }

      Class280.Method2988().Field2302 = 50L;
   }

   private void Method13295() {
      if (this.Field12254 != 0) {
         boolean var1 = false;
         if (this.Field12254 == 1) {
            if ((var1 = this.Method13251(false, true, false)) && !Field12496) {
               this.Method13294();
            }
         } else if (this.Field12254 == 2) {
            if (var1 = this.Method13251(false, false, false)) {
               if (Field12252) {
                  this.Field12256 = 0;
               }

               Field12483 = 2;
            }
         } else if (this.Field12254 == 3) {
            if (!Field12252) {
               var1 = this.Method13251(false, true, false);
            } else {
               var1 = this.Method13247();
            }
         }

         if (var1) {
            this.Field12254 = 0;
         }

      }
   }

   private void Method13296() {
      if (this.Field12254 == 0) {
         Field12251 = true;
         if (this.Field12622 != null) {
            Field12253 = System.currentTimeMillis();
            int var1 = Field12084 ? 0 : Class280.Method2988().Method2993();
            boolean var2 = true;

            for(int var3 = 0; var3 < this.Field12622.length; ++var3) {
               if (this.Field12622[var3] == null && this.Field12658[var3] != -1) {
                  var2 = false;
                  break;
               }

               if (this.Field12668[var3] == null && this.Field12659[var3] != -1) {
                  var2 = false;
                  break;
               }
            }

            byte var4;
            if (!var2) {
               if (Field12142 != 0L && System.currentTimeMillis() - Field12142 > 7500L) {
                  ++this.Field12256;
                  System.out.println("map fetcher timeout: " + (System.currentTimeMillis() - Field12142));
                  Field12142 = System.currentTimeMillis();
                  this.Method13208();
                  var4 = 102;
                  this.Method13210(var4, 0, 0);
               } else {
                  this.Method13208();
               }
            } else {
               if (var1 < 0) {
                  Class280.Method2988().Method2996();
               }

               if (this.Field12250 != 0L && System.currentTimeMillis() - this.Field12250 > 10000L) {
                  System.out.println("map loader timeout: " + (System.currentTimeMillis() - Field12142) + ", true" + ", " + this.Field12256);
                  ++this.Field12256;
                  Class280.Method2988().Method2996();
                  this.Method13208();
                  var4 = 102;
                  this.Method13210(var4, 0, 0);
               } else if (var1 != this.Field12255) {
                  this.Field12250 = System.currentTimeMillis();
               }

               if (GraphicsDisplay.Field2678 && GraphicsDisplay.Field2667) {
                  boolean var10000 = GraphicsDisplay.Field2668;
               }

               this.Field12255 = var1;
               this.Field12254 = 1;
               this.Field12256 = 0;
            }
         }
      }
   }

   private void Method13297() {
      Method13313();

      while(true) {
         Class862 var1 = null;

         do {
            if (this.Field12526 == null) {
               return;
            }

            try {
               if ((var1 = this.Field12526.Method1314()) == null) {
                  return;
               }

               if (var1.Field2729) {
                  continue;
               }

               if (var1.Field2733) {
                  System.out.println("[OnDemandQueue]: successful redownload: " + var1.Field2734 + ", " + var1.Field2736 + ", " + var1.Field2735);
               }

               if (var1.Field2732) {
                  System.err.println("[OnDemandQueue]: corrupted data: " + var1.Field2734 + ", " + var1.Field2736 + ", " + var1.Field2735 + "; re-requesting...");
                  this.Field12526.Method1312(var1.Field2734, var1.Field2736, true, true);
                  continue;
               }
            } catch (Exception var5) {
               var5.printStackTrace();
               if (var1 == null) {
                  break;
               }

               System.err.println("[OnDemandQueue]: error unzipping: " + var1.Field2734 + ", " + var1.Field2736 + ", " + var1.Field2735);
               continue;
            }

            if (var1.Field2734 == 0) {
               Model.Method14468(var1.Field2735, var1.Field2736);
               if (this.Field12693 != -1) {
                  Field12649 = true;
               }
            }

            if (var1.Field2734 == 1 && var1.Field2735 != null) {
               Class518.Method8350(var1.Field2735, var1.Field2736);
            }

            if (var1.Field2734 == 2 && var1.Field2736 == this.Field12652 && var1.Field2735 != null) {
               int var4 = var1.Field2736;
               byte[] var3 = var1.Field2735;
               if (var4 != 0 && (Field12593 && this.Field12587 || !Field12593 && Field12588)) {
                  Signlink.Method11834(var3);
               }
            }

            int var2;
            if (var1.Field2734 == 3 && var1.Field2735 != null) {
               if (class329 != null) {
                  class329.Method3390(var1);
                  if (!Field12251) {
                     continue;
                  }
               }

               for(var2 = 0; var2 < this.Field12622.length; ++var2) {
                  if (this.Field12658[var2] == var1.Field2736) {
                     this.Field12622[var2] = var1.Field2735;
                     if (var1.Field2735 == null) {
                        this.Field12622[var2] = null;
                        this.Field12658[var2] = -1;
                     }
                     break;
                  }

                  if (this.Field12659[var2] == var1.Field2736) {
                     this.Field12668[var2] = var1.Field2735;
                     if (var1.Field2735 == null) {
                        this.Field12668[var2] = null;
                        this.Field12659[var2] = -1;
                     }
                     break;
                  }
               }
            }

            if (var1.Field2734 == 4) {
               var2 = var1.Field2736;
               TextureData.Method13528(var1.Field2736, var1.Field2735);
               if (Rasterizer.Field9963[var2]) {
                  Rasterizer.Method9429(var2);
               }
            }

            if (var1.Field2734 > 4) {
               System.err.println("[Client]: Invalid onDemandData type: " + var1.Field2734);
            }
         } while(var1.Field2734 != 93 || !this.Field12526.Method1318(var1.Field2736));

         if (var1 != null) {
            Class569.Method8818(new Packet(var1.Field2735), this.Field12526);
         }
      }
   }

   private void Method13298(int var1) {
      RSInterface var2;
      if ((var2 = RSInterface.Field12749[var1]) != null && var2.Field12783 != null) {
         for(var1 = 0; var1 < var2.Field12783.length && var2.Field12783[var1] != -1; ++var1) {
            RSInterface var3;
            if ((var3 = RSInterface.Field12749[var2.Field12783[var1]]) != null) {
               if (var3.Field12805 == 1) {
                  this.Method13298(var3.Field12794);
               }

               var3.Field12790 = 0;
               var3.Field12746 = 0.0D;
            }
         }

      } else {
         if (var1 != 198) {
            System.out.println("Corrupt interface: " + var1 + ", " + var2 + ", " + (var2 == null ? null : var2.Field12783));
         }

      }
   }

   private void Method13299() {
      int var1 = (int)(System.currentTimeMillis() - this.Field12258);

      Class866 var2;
      while((var2 = (Class866)this.Field12136.poll()) != null) {
         this.Field12137.add(var2);
      }

      Iterator var3 = this.Field12137.iterator();

      while(var3.hasNext()) {
         var2 = (Class866)var3.next();
         if (this.Field12719[var2.Field2637] == null) {
            if (var2.Field2637 == 51) {
               this.Field12719[var2.Field2637] = ItemDef.Method11915(7478, 32, false);
            }
         } else if (var2.Field2636 > 100000) {
            var2.Field2636 = 0;
         } else if (var2.Field2636 > 0) {
            var2.Field2636 -= var1;
         } else {
            var2.Field2635 -= var1;
            if (var2.Field2635 <= 0) {
               this.Field12135.add(var2);
            }

            String var5 = " " + NumberFormat.getNumberInstance(Locale.US).format((long)var2.Field2638);
            int var6 = width - 260;
            if (!Field12712) {
               var6 -= 15;
            }

            int var4;
            int var7;
            if (var2.Field2638 >= 10000) {
               var4 = var2.Field2638 / 1000;
               var7 = var2.Field2638 / 100 - var4 * 10;
               var5 = NumberFormat.getNumberInstance(Locale.US).format((long)var4) + "." + var7 + "k";
            }

            if (var2.Field2639 > 0) {
               var6 -= 40;
               if (var2.Field2639 >= 10000) {
                  var4 = var2.Field2639 / 1000;
                  var7 = var2.Field2639 / 100 - var4 * 10;
                  var5 = var5 + " (" + NumberFormat.getNumberInstance(Locale.US).format((long)var4) + "." + var7 + " bonus xp)";
               } else {
                  var5 = var5 + " (" + NumberFormat.getNumberInstance(Locale.US).format((long)var2.Field2639) + " bonus xp)";
               }
            }

            float var11 = 0.0F;
            if (var2.Field2635 > 0) {
               var11 = (float)var2.Field2635 / (float)Class866.Field2634;
            }

            var7 = this.Field12719[var2.Field2637].Field9894;
            int var8 = this.Field12719[var2.Field2637].Field9895;
            float var9 = -40.0F + var11 * 200.0F;
            var11 = var11 < 0.7F ? var11 / 0.7F : 1.0F;
            int var10;
            if ((var10 = 255 - (int)(255.0F * var11)) > 178) {
               var10 = 178;
            }

            var4 = 14983494 + (var10 << 24);
            boldFont.Method9447(var10 << 24, var5, (int)var9 + 1, var6 + 1);
            boldFont.Method9447(var4, var5, (int)var9, var6);
            this.Field12719[var2.Field2637].Method892(var6 - var7 - boldFont.Method9451(var5) / 2, (int)var9 - var8 / 2 - 4, 255 - var10);
         }
      }

      this.Field12137.removeAll(this.Field12135);
      this.Field12135.clear();
      this.Field12258 = System.currentTimeMillis();
   }

   private void Method13300() {
      if (this.mouseDetection != null) {
         if (this.Field12203 || System.currentTimeMillis() - this.Field12257 > 100L && (width - 765 != Field12714 || height - 503 != Field12715 || Field12712 && (this.Method13236() != width || this.Method13237() != height))) {
            this.Field12203 = false;
            this.Field12257 = System.currentTimeMillis();
            Field12713 = false;
            this.Method13239(true);
            this.Method13395();
            this.Method13361();
            int var1 = this.openInterfaceID != -1 ? RSInterface.Field12749[this.openInterfaceID].Field12758 : 550;
            this.Field12282 = (width - var1) / 2;
            if (width <= 1378) {
               this.Field12282 = (width - 250 - var1) / 2;
               if (this.Field12282 < 8) {
                  this.Field12282 = 8;
               }
            }

            if (Field12715 >= 175) {
               this.Field12283 = (Field12715 - 175) / 2;
            } else if (!Field12712) {
               this.Field12283 = 0;
            } else {
               this.Field12283 = Field12715 / 2;
            }

            if (this.Field12283 > 75) {
               this.Field12283 = 75;
            }

            if (Field12712) {
               Field12714 = this.Method13236() - 765;
               Field12715 = this.Method13237() - 503;
               width = Field12714 + 765;
               height = Field12715 + 503;
               if (!GraphicsDisplay.Field2678 && (width < 774 || height < 518)) {
                  super.gameFrame.setSize(new Dimension(785, 560));
                  this.Field12257 = System.currentTimeMillis();
               }
            } else {
               this.Field12282 = 2;
               this.Field12283 = 4;
               width = 765;
               height = 503;
               if (!GraphicsDisplay.Field2678) {
                  super.gameFrame.setSize(new Dimension(778, 558));
                  this.Field12257 = System.currentTimeMillis();
               }

               Field12714 = 0;
               Field12715 = 0;
            }

            if (!GraphicsDisplay.Field2678) {
               Field12714 -= 7;
               width -= 7;
               Field12715 -= 30;
               height -= 30;
            }

            int var2;
            int var3;
            int var4;
            int[] var8;
            if (Field12712 || !GraphicsDisplay.Field2678) {
               try {
                  Rasterizer.Method14494(width, height);
                  this.Field12619 = Rasterizer.Field9961;
                  Rasterizer.Method14494(width, height);
                  this.Field12620 = Rasterizer.Field9961;
                  Rasterizer.Method14494(width, height);
                  this.Field12621 = Rasterizer.Field9961;
               } catch (Exception var6) {
                  var6.printStackTrace();
               }

               var8 = new int[9];

               for(var2 = 0; var2 < 9; ++var2) {
                  var3 = 128 + (var2 << 5) + 15;
                  var4 = Field12134 + var3 * 3;
                  var3 = Rasterizer.Field9959[var3];
                  var8[var2] = var4 * var3 >> 16;
               }

               SceneGraph.Method8883();

               try {
                  this.Field12604 = Method13409(width, height, this.j());
                  return;
               } catch (Exception var5) {
                  var5.printStackTrace();
                  return;
               }
            }

            Rasterizer.Method14494(519, 165);
            this.Field12619 = Rasterizer.Field9961;
            Rasterizer.Method14494(246, 335);
            this.Field12620 = Rasterizer.Field9961;
            Rasterizer.Method14494(512, 334);
            this.Field12621 = Rasterizer.Field9961;
            var8 = new int[9];

            for(var2 = 0; var2 < 9; ++var2) {
               var3 = 128 + (var2 << 5) + 15;
               var4 = Field12134 + var3 * 3;
               var3 = Rasterizer.Field9959[var3];
               var8[var2] = var4 * var3 >> 16;
            }

            SceneGraph.Method8883();

            try {
               this.Field12604 = Method13409(512, 334, this.j());
               if (GraphicsDisplay.Field2678) {
                  this.Field12605 = Method13409(900, 800, this.j());
                  return;
               }

               Method13409(900, 800, this.j());
               return;
            } catch (Exception var7) {
               var7.printStackTrace();
            }
         }

      }
   }

   private void Method13301(boolean var1, float var2) {
      if (this.Field12561 > 1.0F) {
         this.Field12561 -= var2 * 1.0F;
      }

      if (this.Field12474 > 0) {
         --this.Field12474;
      }

      Client var13;
      int var15;
      if (var1) {
         Class610 var3;
         if ((var3 = (Class610)this.Field12238.poll()) != null) {
            this.Field12239.add(var3);
         }

         Iterator var5 = this.Field12239.iterator();

         while(var5.hasNext()) {
            Class610 var4;
            if ((var4 = (Class610)var5.next()).Method9266(this.Field12630)) {
               this.Field12240.add(var4);
            }
         }

         this.Field12239.removeAll(this.Field12240);
         this.Field12240.clear();
         this.Method13302();
         if (Field12593 && !Field12272) {
            var13 = this;
            if (this.Field12608 == null) {
               this.Method13312();
            } else {
               this.Method13302();

               try {
                  for(var15 = var13.Field12608.Method11954(); var15 > 0 && var15 != 0; var15 -= var13.Field12472) {
                     if (var15 == -1) {
                        var13.Method13312();
                     }

                     if (var13.Field12473 == -1) {
                        var13.Field12608.Method373(var13.Field12297.Field1259, 1);
                        var13.Field12473 = var13.Field12297.Field1259[0] & 255;
                        if (var13.Field12466 != null) {
                           var13.Field12473 = var13.Field12473 - var13.Field12466.Method13430() & 255;
                        }

                        var13.Field12472 = Class22.Field8577[var13.Field12473];
                        --var15;
                     }

                     if (var13.Field12472 == -1) {
                        if (var15 <= 0) {
                           break;
                        }

                        var13.Field12608.Method373(var13.Field12297.Field1259, 1);
                        var13.Field12472 = var13.Field12297.Field1259[0] & 255;
                        --var15;
                     }

                     if (var13.Field12472 == -2) {
                        if (var15 <= 1) {
                           break;
                        }

                        var13.Field12608.Method373(var13.Field12297.Field1259, 2);
                        var13.Field12297.pos = 0;
                        var13.Field12472 = var13.Field12297.g2();
                        var15 -= 2;
                     }

                     if (var15 < var13.Field12472) {
                        break;
                     }

                     byte[] var17 = new byte[var13.Field12472];
                     var13.Field12608.Method373(var17, var13.Field12472);
                     var13.Field12296.add(new Class60(var13.Field12473, var13.Field12472, var17));
                     var13.Field12473 = -1;
                  }
               } catch (IOException var10) {
                  var10.printStackTrace();
                  this.Method13312();
               }
            }
         }

         if (!Field12593) {
            return;
         }
      }

      this.Method13402(1.0D);
      if (this.c_98 < 0) {
         if (this.c_98 < -4) {
            this.c_98 = (int)((double)this.c_98 / 1.5D);
         } else {
            ++this.c_98;
         }

         if (this.c_98 > 0) {
            this.c_98 = 0;
         }
      } else {
         if (this.c_98 > 4) {
            this.c_98 = (int)((double)this.c_98 / 1.5D);
         } else {
            --this.c_98;
         }

         if (this.c_98 < 0) {
            this.c_98 = 0;
         }
      }

      if (var1 && Field12593 && !this.Field12094 && !this.Field12613 && !Field12272 && this.Field12092 == 0 && (System.currentTimeMillis() - this.Field12261 > 5000L || Field12177)) {
         this.Field12630.Method14445(0);
         if (this.Method13302()) {
            this.Field12261 = System.currentTimeMillis();
         }
      }

      float var21 = var2;
      var13 = this;
      this.Method13374(var2, this.Field12479, false);
      this.Method13374(var2, this.Field12693, false);
      this.Method13374(var2, this.Field12629, false);
      this.Method13374(var2, this.Field12706, false);
      this.Method13374(var2, this.openInterfaceID, false);

      Integer var18;
      while((var18 = (Integer)var13.Field12242.poll()) != null) {
         var13.Method13374(var21, var18, true);
         RSInterface.Field12749[969].Field12728 = false;
      }

      int var6;
      int var16;
      int var19;
      if (var1) {
         if (super.mouseButtonPressed != 0) {
            long var14;
            if ((var14 = (super.eventTime - this.Field12645) / 50L) > 4095L) {
               var14 = 4095L;
            }

            this.Field12645 = super.eventTime;
            var19 = super.clickY;
            if (super.clickY < 0) {
               var19 = 0;
            } else if (var19 > 502) {
               var19 = 502;
            }

            var6 = super.clickX;
            if (super.clickX < 0) {
               var6 = 0;
            } else if (var6 > 764) {
               var6 = 764;
            }

            var19 = var19 * 765 + var6;
            byte var22 = 0;
            if (super.mouseButtonPressed == 2) {
               var22 = 1;
            }

            var16 = (int)var14;
            this.Field12630.Method14445(241);
            this.Field12630.Method14480((var16 << 20) + (var22 << 19) + var19);
         }

         if (this.Field12477 > 0) {
            --this.Field12477;
         }

         if (super.keyStatus[1] > 0 || super.keyStatus[2] > 0 || super.keyStatus[3] > 0 || super.keyStatus[4] > 0) {
            this.Field12478 = true;
         }

         if (this.Field12478 && this.Field12477 <= 0) {
            this.Field12477 = 20;
            this.Field12478 = false;
         }

         if (super.awtFocus && !this.Field12436) {
            this.Field12436 = true;
            this.Field12630.Method14445(3);
            this.Field12630.Method388(1);
         }

         if (!super.awtFocus && this.Field12436) {
            this.Field12436 = false;
            this.Field12630.Method14445(3);
            this.Field12630.Method388(0);
         }
      }

      var21 = var2;
      var13 = this;

      int var7;
      int var8;
      for(var19 = 0; var19 < var13.Field12519; ++var19) {
         if (var13.Field12671[var19] > 0.0F) {
            var13.Field12671[var19] -= var21 * 1.0F;
         } else {
            try {
               Packet var23;
               if ((var23 = Class104.Method864(var8 = var13.Field12661[var19], var13.Field12636[var19])) != null && var23.Field1259 != null) {
                  Signlink.Method11837(var23.Field1259, (float)var8 / 100.0F * Field12056);
               }
            } catch (Exception var9) {
               var9.printStackTrace();
            }

            --var13.Field12519;

            for(var7 = var19; var7 < var13.Field12519; ++var7) {
               var13.Field12636[var7] = var13.Field12636[var7 + 1];
               var13.Field12661[var7] = var13.Field12661[var7 + 1];
               var13.Field12671[var7] = var13.Field12671[var7 + 1];
            }

            --var19;
         }
      }

      if (var13.Field12678 > 0) {
         var13.Field12678 -= 20;
         if (var13.Field12678 < 0) {
            var13.Field12678 = 0;
         }

         if (var13.Field12678 == 0 && var13.Field12587) {
            var13.Field12652 = var13.Field12438;
            var13.Field12526.Method11960(2, var13.Field12652);
         }
      }

      var21 = var2;
      var13 = this;
      boolean var26 = Field12251 || Field12219 != null || Field12218 == null || !Field12218.Method8825();

      Player var24;
      for(var6 = -1; var6 < session_player_count; ++var6) {
         if (var6 == -1) {
            var7 = var13.Field12362;
         } else {
            var7 = var13.session_player_list[var6];
         }

         if ((var24 = var13.session_players[var7]) != null) {
            var13.Method13355(var24, var26, var21);
         }
      }

      var21 = var2;
      var13 = this;
      var26 = Field12251 || Field12219 != null || Field12218 == null || !Field12218.Method8825();

      Npc var27;
      for(var7 = 0; var7 < Field12328; ++var7) {
         var8 = var13.Field12329[var7];
         if ((var27 = var13.Field12327[var8]) != null) {
            var13.Method13355(var27, var26, var21);
         }
      }

      while((var27 = (Npc)var13.Field12275.poll()) != null) {
         if (var27 != null) {
            var13.Method13355(var27, var26, var21);
         }
      }

      var13 = this;

      for(var6 = -1; var6 < session_player_count; ++var6) {
         if (var6 == -1) {
            var7 = var13.Field12362;
         } else {
            var7 = var13.session_player_list[var6];
         }

         if ((var24 = var13.session_players[var7]) != null && var24.ag_6 > 0) {
            var24.ag_6 = var24.textCycle - 1;
            if (var24.ag_6 == 0) {
               var24.C_8 = null;
            }
         }
      }

      for(var6 = 0; var6 < Field12328; ++var6) {
         var7 = var13.Field12329[var6];
         Npc var28;
         if ((var28 = var13.Field12327[var7]) != null && var28.ag_6 > 0) {
            var28.ag_6 = var28.textCycle - 1;
            if (var28.ag_6 == 0) {
               var28.C_8 = null;
            }
         }
      }

      if (var1) {
         if (this.Field12378 != 0) {
            if (this.Field12376 == 0) {
               this.Field12377 = 0.0F;
            }

            this.Field12377 += var2 * 20.0F;
            this.Field12376 = Math.round(this.Field12377);
            if (this.Field12376 >= 400) {
               this.Field12378 = 0;
            }
         }

         if (this.Field12667 != 0) {
            if (this.Field12663 == 0) {
               this.Field12664 = 0.0F;
            }

            this.Field12664 += var2 * 1.0F;
            this.Field12663 = Math.round((float)this.Field12663);
            if (this.Field12663 >= 15) {
               if (this.Field12667 == 3) {
                  Field12649 = true;
               }

               this.Field12667 = 0;
            }
         }

         if (this.Field12542 != 0) {
            this.Field12459 += var2 * 1.0F;
            super.Field8786 = System.currentTimeMillis();
            if (super.mouseEventX > this.Field12543 + 5 || super.mouseEventX < this.Field12543 - 5 || super.mouseEventY > this.Field12544 + 5 || super.mouseEventY < this.Field12544 - 5) {
               this.Field12662 = true;
            }

            this.Field12281 = super.Field8808 == 0;
            if (super.Field8808 == 0) {
               if (this.Field12542 == 3) {
                  Field12649 = true;
               }

               this.Field12542 = 0;
               if (this.Field12662 && this.Field12459 >= (float)this.Field12141) {
                  this.Field12525 = -1;
                  this.Method13338();
                  if (this.Field12525 == this.Field12540 && this.Field12524 != this.Field12541) {
                     RSInterface var20 = RSInterface.Field12749[this.Field12540];
                     byte var25 = 0;
                     if (this.Field12373 == 1 && var20.Field12751 == 206) {
                        var25 = 1;
                     }

                     if (var20.Field12796[this.Field12524] <= 0) {
                        var25 = 0;
                     }

                     if (var20.Field12774) {
                        var19 = this.Field12541;
                        var6 = this.Field12524;
                        var20.Field12796[var6] = var20.Field12796[var19];
                        var20.Field12795[var6] = var20.Field12795[var19];
                        var20.Field12796[var19] = -1;
                        var20.Field12795[var19] = 0;
                     } else if (var25 == 1) {
                        var19 = this.Field12541;
                        var6 = this.Field12524;

                        while(var19 != var6) {
                           if (var19 > var6) {
                              var20.Method1742(var19, var19 - 1);
                              --var19;
                           } else if (var19 < var6) {
                              var20.Method1742(var19, var19 + 1);
                              ++var19;
                           }
                        }
                     } else {
                        var20.Method1742(this.Field12541, this.Field12524);
                     }

                     this.Field12630.Method14445(214);
                     this.Field12630.Method14461(this.Field12540);
                     this.Field12630.Method14491(var25);
                     this.Field12630.Method14461(this.Field12541);
                     this.Field12630.Method421(this.Field12524);
                  }
               } else if ((Field12674 == 1 || this.Method13242(this.Field12575 - 1)) && this.Field12575 > 2) {
                  this.Method13371();
               } else if (this.Field12575 > 0) {
                  this.Method13314(this.Field12575 - 1);
               }

               this.Field12663 = 10;
               super.mouseButtonPressed = 0;
            }
         }

         if (super.mouseButtonPressed == 1 && this.Field12332 != null) {
            this.Field12332 = null;
            Field12649 = true;
            super.mouseButtonPressed = 0;
         }

         if (class329 != null) {
            class329.Method3398(super.mouseEventX, super.mouseEventY, super.mouseButtonPressed);
         }

         if (this.Field12482 == 0) {
            var15 = Field12712 ? Field12714 : 0;
            if (super.mouseButtonPressed == 1) {
               var6 = Field12712 ? 558 : 528;
               var7 = super.clickX - 25 - var6 - var15;
               var8 = super.clickY - 5 - 4;
               var7 -= this.Field12291;
               var8 -= this.Field12292;
               if (this.Field12096) {
                  this.openURL(Field12130 + "/wiki");
               } else if (this.Field12095) {
                  super.clickX = super.clickY = 0;
                  if (class329 == null) {
                     if (Field12596) {
                        this.Method13334("Worldmap viewer unavailable in houses.");
                     } else if (GraphicsDisplay.Field2678 && GraphicsDisplay.Field2667 && Field12712) {
                        this.openInterfaceID = -1;
                        this.Field12099 = 0;
                        class329 = new Class329(this);
                        Client var11;
                        (var11 = this).Field12143 = 1;
                        var11.Field12650 = 4;
                        var11.Field12521 = 0;
                        Field12649 = true;
                        var11.Field12639 = "";
                        var11.Field12564 = "";
                        var11.Field12215 = 0;
                        var11.Field12216 = -1;
                     } else {
                        this.Method13334("Worldmap viewer not available for your game settings.");
                        this.Method13334("You need to use the hardware renderer, widescreen and enable vbo mode.");
                     }
                  } else {
                     this.Method13239(false);
                  }
               } else if (Method13353(12, 19, 20, var7, var8)) {
                  this.Method13231();
               } else if (this.Field12097) {
                  this.openURL(Field12130 + "/account#purchase");
               } else if (Method13353(75, 75, 78, var7, var8)) {
                  var7 -= 78;
                  var8 -= 77;
                  if (!Field12712) {
                     var8 += 4;
                  }

                  var6 = Field12624 & 2047;
                  int var12 = Rasterizer.Field9959[var6];
                  var15 = Rasterizer.Field9960[var6];
                  var12 = var12 << 8 >> 8;
                  var15 = var15 << 8 >> 8;
                  var19 = var8 * var12 + var7 * var15 >> 11;
                  var12 = var8 * var15 - var7 * var12 >> 11;
                  var15 = session_player.Field4194 + var19 >> 7;
                  var12 = session_player.Field4195 - var12 >> 7;
                  /*
                  if (this.Method13346(1, 0, 0, 0, session_player.x_13[0], 0, 0, var12, session_player.w_14[0], true, var15)) {
                     this.Field12630.Method388(var7);
                     this.Field12630.Method388(var8);
                     this.Field12630.Method14470(Field12624);
                     this.Field12630.Method388(57);
                     this.Field12630.Method388(0);
                     this.Field12630.Method388(0);
                     this.Field12630.Method388(89);
                     this.Field12630.Method14470(session_player.Field4194);
                     this.Field12630.Method14470(session_player.Field4195);
                     this.Field12630.Method388(this.Field12682);
                     this.Field12630.Method388(63);
                  }*/
               }
            }
         }

         this.Method13246();
         this.Method13268();
         if (this.Field12202) {
            var15 = !Field12712 && !GraphicsDisplay.Field2678 ? 0 : Field12714;
            var19 = !Field12712 && !GraphicsDisplay.Field2678 ? 0 : Field12715;
            if (!Field12712 && (super.clickY >= 168 && super.clickY <= 203 || super.clickY > 240 && super.clickY <= 465)) {
               var19 = -262;
            }

            boolean var29 = false;
            if (super.mouseButtonPressed == 1) {
               if (super.clickX >= var15 + 524 && super.clickX <= var15 + 561 && super.clickY >= var19 + 430 && super.clickY < var19 + 466 && this.Field12573[0] != -1) {
                  this.Field12646 = 0;
                  var29 = true;
                  this.Field12560 = true;
               }

               if (super.clickX >= var15 + 562 && super.clickX <= var15 + 594 && super.clickY >= var19 + 430 && super.clickY < var19 + 466 && this.Field12573[1] != -1) {
                  this.Field12646 = 1;
                  var29 = true;
                  this.Field12560 = true;
               }

               if (super.clickX >= var15 + 595 && super.clickX <= var15 + 626 && super.clickY >= var19 + 430 && super.clickY < var19 + 466 && this.Field12573[2] != -1) {
                  this.Field12646 = 2;
                  var29 = true;
                  this.Field12560 = true;
               }

               if (super.clickX >= var15 + 627 && super.clickX <= var15 + 660 && super.clickY >= var19 + 430 && super.clickY < var19 + 466 && this.Field12573[3] != -1) {
                  this.Field12646 = 3;
                  var29 = true;
                  this.Field12560 = true;
               }

               if (super.clickX >= var15 + 661 && super.clickX <= var15 + 693 && super.clickY >= var19 + 430 && super.clickY < var19 + 466 && this.Field12573[4] != -1) {
                  this.Field12646 = 4;
                  var29 = true;
                  this.Field12560 = true;
               }

               if (super.clickX >= var15 + 694 && super.clickX <= var15 + 725 && super.clickY >= var19 + 430 && super.clickY < var19 + 466 && this.Field12573[5] != -1) {
                  this.Field12646 = 5;
                  var29 = true;
                  this.Field12560 = true;
               }

               if (super.clickX >= var15 + 726 && super.clickX <= var15 + 765 && super.clickY >= var19 + 430 && super.clickY < var19 + 466 && this.Field12573[6] != -1) {
                  this.Field12646 = 6;
                  var29 = true;
                  this.Field12560 = true;
               }

               if (super.clickX >= var15 + 524 && super.clickX <= var15 + 561 && super.clickY >= var19 + 466 && super.clickY < var19 + 503 && this.Field12573[7] != -1) {
                  this.Field12646 = 7;
                  var29 = true;
                  this.Field12560 = true;
               }

               if (super.clickX >= var15 + 562 && super.clickX <= var15 + 594 && super.clickY >= var19 + 466 && super.clickY < var19 + 503 && this.Field12573[8] != -1) {
                  this.Field12646 = 8;
                  var29 = true;
                  this.Field12560 = true;
               }

               if (super.clickX >= var15 + 595 && super.clickX <= var15 + 627 && super.clickY >= var19 + 466 && super.clickY < var19 + 503 && this.Field12573[9] != -1) {
                  this.Field12646 = 9;
                  var29 = true;
                  this.Field12560 = true;
               }

               if (super.clickX >= var15 + 627 && super.clickX <= var15 + 664 && super.clickY >= var19 + 466 && super.clickY < var19 + 503 && this.Field12573[10] != -1) {
                  this.Field12646 = 10;
                  var29 = true;
                  this.Field12560 = true;
               }

               if (super.clickX >= var15 + 661 && super.clickX <= var15 + 694 && super.clickY >= var19 + 466 && super.clickY < var19 + 503 && this.Field12573[11] != -1) {
                  this.Field12646 = 11;
                  var29 = true;
                  this.Field12560 = true;
               }

               if (super.clickX >= var15 + 695 && super.clickX <= var15 + 725 && super.clickY >= var19 + 466 && super.clickY < var19 + 503 && this.Field12573[12] != -1) {
                  this.Field12646 = 12;
                  var29 = true;
                  this.Field12560 = true;
               }

               if (super.clickX >= var15 + 726 && super.clickX <= var15 + 765 && super.clickY >= var19 + 466 && super.clickY < var19 + 502 && this.Field12573[13] != -1) {
                  this.Field12646 = 13;
                  var29 = true;
                  this.Field12560 = true;
               }

               if (var29) {
                  this.Field12573[11] = 904;
                  if (this.Field12647 == this.Field12646) {
                     this.Field12646 = 14;
                  }

                  this.Field12647 = this.Field12646;
               }
            }
         }

         this.Field12202 = true;
         if (this.Field12096 || this.Field12097 || this.Field12095 || this.Field12098) {
            this.Field12259 = -1;
         }

         if (this.Field12259 != -1 && this.Method13346(0, 0, 0, 0, session_player.x_13[0], 0, 0, this.Field12260, session_player.w_14[0], true, this.Field12259)) {
            this.Field12374 = super.clickX;
            this.Field12375 = super.clickY;
            this.Field12378 = 1;
            this.Field12376 = 0;
            this.Field12259 = -1;
         }

         if (this.Field12509 != -1) {
            this.Field12560 = true;
         }

         if (this.Field12560) {
            if (this.Field12509 != -1 && this.Field12509 == this.Field12646) {
               this.Field12509 = -1;
               this.Field12630.Method14445(120);
               this.Field12630.Method388(this.Field12646);
            }

            this.Field12560 = false;
            if (!GraphicsDisplay.Field2678) {
               this.Field12604.Method13683();
            }
         }

         if (super.Field8808 == 1 || super.mouseButtonPressed == 1) {
            ++this.Field12640;
         }

         if (this.Field12710 == 0 && this.Field12707 == 0 && this.Field12708 == 0) {
            if (this.Field12711 > 0) {
               --this.Field12711;
            }
         } else if (this.Field12711 < 100) {
            ++this.Field12711;
            if (this.Field12711 == 100) {
               if (this.Field12710 != 0) {
                  Field12649 = true;
               }

               if (this.Field12707 != 0) {
                  ;
               }
            }
         }

         this.Method13363(var2);

         for(var16 = 0; var16 < 5; ++var16) {
            ++this.Field12488[var16];
         }

         this.manageTextInputs();
      }
   }

   private boolean Method13302() throws IOException {
      try {
         if (Field12272) {
            return false;
         } else {
            try {
               if (this.Field12608 != null && this.Field12630 != null && this.Field12630.pos > 0) {
                  this.Field12608.Method374(this.Field12630.pos, this.Field12630.Field1259);
                  this.Field12630.pos = 0;
               }

               return true;
            } catch (Exception var2) {
               var2.printStackTrace();
               this.Method13312();
               return false;

            }
         }
      } catch (Exception var3) {
         var3.printStackTrace();
         this.resetForLogout();
         return false;
      }
   }

   private void Method13303() {
      if ((this.Field12413 == null && this.Field12412 == null || this.Field12418 == null || this.Field12413 != null && this.Field12413.Field9894 <= 0) && !this.Field12262) {
         this.Field12262 = true;
         Signlink.Field2944.submit(new Class882(this));
      }
   }

   private void Method13304() {
      if (GraphicsDisplay.Field2678) {
         Class697.Method11984(this.b(), this.c());
      }

      this.Method13303();
      if (this.Field12413 != null) {
         int var1 = this.Method13236() / 2 - this.Field12413.Field9894 / 2 - 3;
         int var2;
         if ((var2 = this.Method13237() / 2 - this.Field12413.Field9895 - 114) < 0) {
            var2 = 0;
         }

         if (Field12166 || !Field12263) {
            if (this.Field12418 == null) {
               this.Method13303();
               if (this.Field12262) {
                  return;
               }
            } else {
               int var3;
               int var4;
               if (GraphicsDisplay.Field2678) {
                  var3 = (this.Field12418.Field9898 - this.b()) / 2;
                  var4 = (this.Field12418.Field9899 - this.c()) / 2;
                  if (this.Field12418.Field9878 < 0L) {
                     Class843.Method13992();
                     this.Field12418.Method9109(0, 0, true);
                     this.Field12418.Field9878 = -this.Field12418.Field9878;
                  } else {
                     int var5;
                     if ((var5 = var3 - var4) >= -50 && var5 <= 50) {
                        this.Field12418.Field9894 = this.b();
                        this.Field12418.Field9895 = this.c();
                        this.Field12418.Method9109(0, 0, true);
                     } else if (var3 >= var4) {
                        this.Field12418.Field9894 = this.b();
                        this.Field12418.Field9895 = this.b() * 9 / 16;
                        this.Field12418.Method9109(0, (this.c() - this.Field12418.Field9895) / 2, true);
                     } else {
                        this.Field12418.Field9894 = (this.c() << 4) / 9;
                        this.Field12418.Field9895 = this.c();
                        this.Field12418.Method9109((this.b() - this.Field12418.Field9894) / 2, 0, true);
                     }
                  }
               } else {
                  var3 = (this.Field12418.Field9898 - this.b()) / 2;
                  var4 = (this.Field12418.Field9899 - this.c()) / 2;
                  this.Field12418.Method9109(-var3, -var4, false);
               }
            }
         }

         if (this.Field12412 == null || !this.Field12412.Method986(this, var1, var2 + 25, true)) {
            this.Field12413.Method14495(var1, var2);
         }
      }

      if (Field12592) {
         this.Method13367();
      }

      if (Field12081 || Field12080) {
         this.Method13368(0, 0);
      }

   }

   private static float Method13305(float var0, float var1) {
      float var2;
      if ((var2 = var1 - var0) < 0.0F) {
         return var0;
      } else {
         if (var2 <= 5.0F) {
            var2 = 1.0F;
         } else if (var2 <= 10.0F) {
            var2 = 2.0F;
         } else if (var2 <= 15.0F) {
            var2 = 3.0F;
         } else {
            var2 = 4.0F;
         }

         if ((var2 = (var2 *= 0.25F) + var0) > var1) {
            var2 = var1;
         }

         if (var1 >= 100.0F) {
            var2 = 100.0F;
         }

         return var2;
      }
   }

   public final void Method13306(int var1, String var2) {
      this.Field12205 = var1;
      this.Field12207 = var2;
      if (!GraphicsDisplay.Field2678) {
         this.drawLoadingText(var1, var2);
      }
   }

   public final void drawLoadingText(int var1, String var2) {
      try {
         Client var5 = this;
         if (GraphicsDisplay.Field2678) {
            GraphicsDisplay.Method997().Method1031(false);
         }

         int var3;
         while(true) {
            try {
               if ((var3 = var5.e()) == -1) {
                  break;
               }

               if (var3 == 99) {
                  Class16.Method193();
               }

               System.out.println("[Client]: error console enabled at loading process.");
            } catch (Exception var7) {
               var7.printStackTrace();
            }
         }

         try {
            this.Method13297();
         } catch (Exception var6) {
            var6.printStackTrace();
         }

         this.Field12204 = var1;
         this.Field12206 = var2;
         Field12714 = this.Method13236() - 765;
         Field12715 = this.Method13237() - 503;
         var3 = Field12714 / 2;
         int var4 = Field12715 / 2;
         this.Field12538 = var1;
         this.Field12505 = var2;
         if (!GraphicsDisplay.Field2678) {
            if (this.titleJagexArchive == null) {
               super.drawLoadingText(var1, var2);
            } else {
               if (this.b() > 0) {
                  this.Field12606 = null;
                  this.Field12603 = null;
                  this.Field12602 = null;
                  this.Field12604 = null;
                  Class697.Method14445(0);
                  this.Field12562 = Method13409(this.Method13236(), this.Method13237(), this.j());
                  Class697.Method14445(0);
                  if (this.titleJagexArchive != null) {
                     this.loadTitleScreen();
                  }

                  this.Field12675 = true;
               }

               if (!this.Field12164) {
                  Class697.Method14445(0);
               }

               this.Field12562.Method13683();
               var4 = -152 - var4;
               var3 = -202 - var3;
               boldFont.Method9447(14540253, Field12129 + " is loading - please wait...", 74 - var4, 180 - var3);
               int var9 = 82 - var4;
               Class697.Method14503(28 - var3, 304, 34, 7798784, var9);
               Class697.Method14503(29 - var3, 302, 32, 0, var9 + 1);
               Class697.Method8269(30, var9 + 2, 30 - var3, 7798784, var1 * 3);
               Class697.Method8269(30, var9 + 2, 30 - var3 + var1 * 3, 0, 300 - var1 * 3);
               boldFont.Method9447(14540253, var2, 105 - var4, 180 - var3);
               this.Field12562.Method3038(0, super.Method11952(), 0);
            }
         }
      } catch (Exception var8) {
         var8.printStackTrace();
      }
   }

   private void Method13308(int var1, int var2, int var3, int var4, RSInterface var5, int var6, boolean var7, int var8) {
      byte var9;
      if (this.Field12445) {
         var9 = 32;
      } else {
         var9 = 0;
      }

      this.Field12445 = false;
      if (var3 >= var1 && var3 < var1 + 16 && var4 >= var6 && var4 < var6 + 16) {
         var5.Field12762 -= this.Field12640 << 2;
         if (var7) {
            return;
         }
      } else if (var3 >= var1 && var3 < var1 + 16 && var4 >= var6 + var2 - 16 && var4 < var6 + var2) {
         var5.Field12762 += this.Field12640 << 2;
         if (var7) {
            return;
         }
      } else if (var3 >= var1 - var9 && var3 < var1 + 16 + var9 && var4 >= var6 + 16 && var4 < var6 + var2 - 16 && this.Field12640 > 0) {
         if ((var1 = (var2 - 32) * var2 / var8) < 8) {
            var1 = 8;
         }

         var3 = var4 - var6 - 16 - var1 / 2;
         if ((var1 = var2 - 32 - var1) == 0) {
            var1 = 1;
         }

         var5.Field12762 = (var8 - var2) * var3 / var1;
         this.Field12445 = true;
      }

   }

   private JagexArchive streamLoaderForName(int var1, String var2, String var3, int var4, int var5) {
      return this.Method13311(var1, var2, var3, var4, var5, this.Field12722, true);
   }

   private JagexArchive Method13310(int var1, String var2, String var3, int var4, int var5) {
      return this.Method13311(var1, var2, var3, var4, var5, this.Field12721, false);
   }

   private JagexArchive Method13311(int var1, String var2, String var3, int var4, int var5, Class619[] var6, boolean var7) {
      byte[] var8 = null;
      if (var1 <= 0) {
         return null;
      } else {
         try {
            if (var6[0] != null) {
               var8 = var6[0].Method9333(var1);
            }

            while(var8 == null || var7 && var4 > 0 && var8.length != var4) {
               try {
                  this.drawLoadingText(30, "Fetching updates - " + var2);
                  if ((var8 = Class280.Method2988().Method3004().Method3012(0, var1, 10)) == null) {
                     Thread.sleep(100L);
                  } else {
                     var6[0].Method9334(var8.length, var8, var1);
                  }
               } catch (Exception var11) {
                  var11.printStackTrace();
               }
            }
         } catch (Exception var12) {
            var12.printStackTrace();
         }

         if (var8 != null) {
            return new JagexArchive(var8, var2);
         } else {
            this.drawLoadingText(0, "Error - Could not request data files");

            try {
               Thread.sleep(500L);
            } catch (Exception var10) {
               var10.printStackTrace();
            }

            return this.streamLoaderForName(var1, var2, var3, var4, var5);
         }
      }
   }

   private void Method13312() {
      Field12596 = false;
      this.Field12261 = System.currentTimeMillis();
      this.Field12094 = true;
   }

   public static boolean Method13313() {
      return Field12251 || Field12219 != null || Field12218 != null && !Field12218.Method8825();
   }

   private void Method13314(int var1) {
      if (var1 >= 0) {
         boolean var2 = Method13313() && Field12218 != null && Field12218.Method8825();
         int var3 = this.Field12547[var1];
         int var4 = this.Field12548[var1];
         int var5 = this.Field12549[var1];
         int var6 = this.Field12550[var1];
         int var7 = this.Field12551[var1];
         long var8 = this.Field12552[var1];
         String var10 = this.Field12634[var1];
         if (super.keyStatus[5] == 1 && var4 == 3214) {
            var6 = 847;
         }

         RSInterface var11;
         if (this.Field12650 != 0) {
            var11 = this.openInterfaceID >= 0 ? RSInterface.Field12749[this.openInterfaceID] : null;
            if (this.Field12650 != 3 || var11 == null || !var11.Field12817) {
               if (this.Field12650 == 4) {
                  if (var6 == 639) {
                     return;
                  }
               } else {
                  this.Field12650 = 0;
               }
            }

            Field12649 = true;
         }

         int var15;
         if (var4 == 35124) {
            Method13223(false);
            this.Method13219();
            initializeGL();
            this.Field12162 = true;
            this.Field12163 = false;
            ObjectDefinition.Method11942();
            Class843.Field3755 = true;
            if (this.Field12418 != null) {
               this.Field12418.Field9893 = null;
               this.Field12418 = null;
            }

            this.Method13209(112);
            System.gc();
         } else if (var4 >= 35128 && var4 <= 35132) {
            if (var2) {
               this.Method13334("Please wait until the map has finished loading.");
               return;
            }

            Method13199(var15 = var4 - '褸', this);
            initializeGL();
            this.Method13209(997);
         } else if (var4 >= 35134 && var4 <= 35138) {
            if (GraphicsDisplay.Field2678) {
               var15 = var4 - '褾';
               byte var12;
               if (GraphicsDisplay.Field2701 <= 1400) {
                  var12 = 2;
               } else if (GraphicsDisplay.Field2701 <= 1920) {
                  var12 = 3;
               } else {
                  var12 = 4;
               }

               if (var15 > var12) {
                  var15 = var12;
                  this.Method13334("Can't scale any further on your monitor.");
               }

               GraphicsDisplay.Method997();
               GraphicsDisplay.Method1044(Field12054[var15]);
               initializeGL();
            } else {
               this.Method13334("Changing the Frame Scale is only available on the hardware renderer.");
            }
         } else if (var4 != 21004 && var4 != 39715) {
            if (var4 == 40306) {
               this.Method13216();
            }
         } else if (this.Field12676) {
            this.Field12676 = false;
         } else {
            this.Field12650 = 3;
            this.Field12521 = 0;
            Field12649 = true;
            this.Field12676 = true;
            this.Field12639 = "";
            if (var4 == 39715) {
               this.Field12564 = "Enter monster name:";
            } else {
               this.Field12564 = "Enter item name:";
            }

            this.Field12101 = 0;
            this.Field12444[1200] = 0;
         }

         if (var6 >= 2000) {
            var6 -= 2000;
         }

         Npc var16;
         if (var6 == 582 && (var16 = this.Field12327[var7]) != null) {
            this.Method13345(var16);
            this.Field12374 = super.clickX;
            this.Field12375 = super.clickY;
            this.Field12378 = 2;
            this.Field12376 = 0;
            this.Field12630.Method14445(57);
            this.Field12630.Method422(this.Field12700);
            this.Field12630.Method422(var7);
            this.Field12630.Method421(this.Field12698);
            this.Field12630.Method422(this.Field12699);
         }

         if (var6 == 234) {
            if (!this.Method13346(2, 0, 0, 0, session_player.x_13[0], 0, 0, var4, session_player.w_14[0], false, var3)) {
               this.Method13346(2, 0, 1, 0, session_player.x_13[0], 1, 0, var4, session_player.w_14[0], false, var3);
            }

            this.Field12374 = super.clickX;
            this.Field12375 = super.clickY;
            this.Field12378 = 2;
            this.Field12376 = 0;
            this.Field12630.Method14445(236);
            this.Field12630.Method421(var4 + Field12491);
            this.Field12630.Method14470(var7);
            this.Field12630.Method421(var3 + Field12490);
         }

         if (var6 == 62) {
            this.Method13344(var8, var4, var3, var5);
            this.Field12630.Method14445(192);
            this.Field12630.Method14470(this.Field12699);
            this.Field12630.Method421(var5);
            this.Field12630.Method14461(var4 + Field12491);
            this.Field12630.Method421(this.Field12698);
            this.Field12630.Method14461(var3 + Field12490);
            this.Field12630.Method14470(this.Field12700);
         }

         if (var6 == 511) {
            if (!this.Method13346(2, 0, 0, 0, session_player.x_13[0], 0, 0, var4, session_player.w_14[0], false, var3)) {
               this.Method13346(2, 0, 1, 0, session_player.x_13[0], 1, 0, var4, session_player.w_14[0], false, var3);
            }

            this.Field12374 = super.clickX;
            this.Field12375 = super.clickY;
            this.Field12378 = 2;
            this.Field12376 = 0;
            this.Field12630.Method14445(25);
            this.Field12630.Method421(this.Field12699);
            this.Field12630.Method422(this.Field12700);
            this.Field12630.Method14470(var7);
            this.Field12630.Method422(var4 + Field12491);
            this.Field12630.Method14461(this.Field12698);
            this.Field12630.Method14470(var3 + Field12490);
         }

         if (var6 == 74) {
            this.Field12630.Method14445(122);
            this.Field12630.Method14461(var4);
            this.Field12630.Method422(var3);
            this.Field12630.Method421(var7);
            this.Field12663 = 0;
            this.Field12665 = var4;
            this.Field12666 = var3;
            this.Field12667 = 2;
            if (RSInterface.Field12749[var4].Field12775 == this.openInterfaceID) {
               this.Field12667 = 1;
            }

            if (RSInterface.Field12749[var4].Field12775 == this.Field12693) {
               this.Field12667 = 3;
            }
         }

         if (var6 == 315) {
            var11 = RSInterface.Field12749[var4];
            boolean var17 = true;
            if (var11.Field12751 > 0) {
               var17 = this.Method13289(var11);
            }

            if (var17) {
               switch(var4) {
               case 1668:
                  this.Method13394(17500, 3213);
                  break;
               default:
                  this.Field12092 = 0;
                  this.Field12630.Method14445(185);
                  this.Field12630.Method14470(var4);
               }
            }
         }

         Player var18;
         if (var6 == 561 && (var18 = this.session_players[var7]) != null) {
            this.Method13343(1, 2, 0, 1, 0, session_player.x_13[0], 1, 0, var18.x_13[0], session_player.w_14[0], false, var18.w_14[0]);
            this.Field12374 = super.clickX;
            this.Field12375 = super.clickY;
            this.Field12378 = 2;
            this.Field12376 = 0;
            this.Field12630.Method14445(128);
            this.Field12630.Method14470(var7);
         }

         if (var6 == 20 && (var16 = this.Field12327[var7]) != null) {
            this.Method13345(var16);
            this.Field12374 = super.clickX;
            this.Field12375 = super.clickY;
            this.Field12378 = 2;
            this.Field12376 = 0;
            this.Field12630.Method14445(155);
            this.Field12630.Method421(var7);
         }

         if (var6 == 779 && (var18 = this.session_players[var7]) != null) {
            this.Method13343(1, 2, 0, 1, 0, session_player.x_13[0], 1, 0, var18.x_13[0], session_player.w_14[0], false, var18.w_14[0]);
            this.Field12374 = super.clickX;
            this.Field12375 = super.clickY;
            this.Field12378 = 2;
            this.Field12376 = 0;
            this.Field12630.Method14445(153);
            this.Field12630.Method421(var7);
         }

         if (var6 == 515) {
            this.Method13321("::tele " + var3 + " " + var4);
         } else if (var6 == 517 && class329 != null) {
            class329.Method3397();
         }

         if (var6 == 516) {
            if (!this.Field12358) {
               Field12428.Method8884(super.clickY - 4, super.clickX - 4);
            } else {
               Field12428.Method8884(var4 - 4, var3 - 4);
            }
         }

         if (var6 == 1062) {
            if ((Field12381 += Field12490) >= 113) {
               this.Field12630.Method14445(183);
               this.Field12630.Method391(15086193);
               Field12381 = 0;
            }

            this.Method13344(var8, var4, var3, var5);
            this.Field12630.Method14445(228);
            this.Field12630.Method422(var5);
            this.Field12630.Method422(var4 + Field12491);
            this.Field12630.Method14470(var3 + Field12490);
         }

         if (var6 == 679 && !this.Field12585) {
            this.Field12630.Method14445(40);
            this.Field12630.Method14470(var4);
            this.Field12585 = true;
         }

         long var13;
         String var21;
         int var22;
         if ((var6 == 337 || var6 == 42 || var6 == 792 || var6 == 322) && (var22 = (var21 = this.Field12634[var1]).indexOf("@whi@")) != -1) {
            var13 = Class23.nameToLong(var21.substring(var22 + 5).trim());
            if (var6 == 337) {
               this.Method13276(var13);
            }

            if (var6 == 42) {
               this.Method13370(var13);
            }

            if (var6 == 792) {
               this.Method13272(var13);
            }

            if (var6 == 322) {
               this.Method13377(var13);
            }
         }

         if (var6 == 791 && (var22 = (var21 = this.Field12634[var1]).indexOf("@whi@")) != -1) {
            var13 = Class23.nameToLong(var21.substring(var22 + 5).trim());

            for(var15 = 0; var15 < this.Field12370; ++var15) {
               if (this.Field12437[var15] == var13 && (var22 = this.Field12323[var15] - 9) != this.Field12212) {
                  this.Field12092 = var22;
                  this.Field12630.Method14445(185);
                  this.Field12630.Method14470(2458);
               }
            }
         }

         if (var6 == 431) {
            this.Field12630.Method14445(129);
            this.Field12630.Method422(var3);
            this.Field12630.Method14470(var4);
            this.Field12630.Method422(var7);
            this.Field12663 = 0;
            this.Field12665 = var4;
            this.Field12666 = var3;
            this.Field12667 = 2;
            if (RSInterface.Field12749[var4].Field12775 == this.openInterfaceID) {
               this.Field12667 = 1;
            }

            if (RSInterface.Field12749[var4].Field12775 == this.Field12693) {
               this.Field12667 = 3;
            }
         }

         if (var6 == 53) {
            this.Field12630.Method14445(135);
            this.Field12630.Method421(var3);
            this.Field12630.Method422(var4);
            this.Field12630.Method421(var7);
            this.Field12663 = 0;
            this.Field12665 = var4;
            this.Field12666 = var3;
            this.Field12667 = 2;
            if (RSInterface.Field12749[var4].Field12775 == this.openInterfaceID) {
               this.Field12667 = 1;
            }

            if (RSInterface.Field12749[var4].Field12775 == this.Field12693) {
               this.Field12667 = 3;
            }
         }

         if (var6 == 291 || var6 == 300) {
            this.Field12630.Method14445(140);
            this.Field12630.Method14470(var3);
            this.Field12630.Method14470(var4);
            this.Field12630.Method14470(var7);
            this.Field12630.Method14470(var6 == 300 ? '\uffff' : this.Field12102);
            this.Field12663 = 0;
            this.Field12665 = var4;
            this.Field12666 = var3;
            this.Field12667 = 2;
            if (RSInterface.Field12749[var4].Field12775 == this.openInterfaceID) {
               this.Field12667 = 1;
            }

            if (RSInterface.Field12749[var4].Field12775 == this.Field12693) {
               this.Field12667 = 3;
            }
         }

         if (var6 == 301) {
            this.Field12630.Method14445(140);
            this.Field12630.Method14470(var3);
            this.Field12630.Method14470(var4);
            this.Field12630.Method14470(var7);
            this.Field12630.Method14470(0);
            this.Field12663 = 0;
            this.Field12665 = var4;
            this.Field12666 = var3;
            this.Field12667 = 2;
            if (RSInterface.Field12749[var4].Field12775 == this.openInterfaceID) {
               this.Field12667 = 1;
            }

            if (RSInterface.Field12749[var4].Field12775 == this.Field12693) {
               this.Field12667 = 3;
            }
         }

         if (var6 == 539) {
            this.Field12630.Method14445(16);
            this.Field12630.Method422(var7);
            this.Field12630.Method14461(var3);
            this.Field12630.Method14461(var4);
            this.Field12663 = 0;
            this.Field12665 = var4;
            this.Field12666 = var3;
            this.Field12667 = 2;
            if (RSInterface.Field12749[var4].Field12775 == this.openInterfaceID) {
               this.Field12667 = 1;
            }

            if (RSInterface.Field12749[var4].Field12775 == this.Field12693) {
               this.Field12667 = 3;
            }
         }

         if (var6 == 927) {
            var22 = (var21 = this.Field12634[var1]).indexOf("@lre@");
            var21 = var21.substring(var22 + 5).trim();
            this.openURL(var21);
         }

         String var19;
         if ((var6 == 484 || var6 == 6) && (var22 = (var21 = this.Field12634[var1]).indexOf("@whi@")) != -1) {
            var19 = Class23.Method207(Class23.Method203(Class23.nameToLong(var21.substring(var22 + 5).trim())));
            boolean var14 = false;

            for(var15 = 0; var15 < session_player_count; ++var15) {
               Player var23;
               if ((var23 = this.session_players[this.session_player_list[var15]]) != null && var23.name != null && var23.name.equalsIgnoreCase(var19)) {
                  this.Method13343(1, 2, 0, 1, 0, session_player.x_13[0], 1, 0, var23.x_13[0], session_player.w_14[0], false, var23.w_14[0]);
                  if (var6 == 6) {
                     this.Field12630.Method14445(153);
                     this.Field12630.Method421(this.session_player_list[var15]);
                  }

                  if (var6 == 484) {
                     this.Field12630.Method14445(128);
                     this.Field12630.Method14470(this.session_player_list[var15]);
                  }

                  var14 = true;
                  break;
               }
            }

            if (!var14) {
               this.pushMessage("Unable to find " + var19, 0, "");
            }
         }

         if (var6 == 870) {
            this.Field12630.Method14445(53);
            this.Field12630.Method14470(var3);
            this.Field12630.Method422(this.Field12698);
            this.Field12630.Method14461(var7);
            this.Field12630.Method14470(this.Field12699);
            this.Field12630.Method421(this.Field12700);
            this.Field12630.Method14470(var4);
            this.Field12663 = 0;
            this.Field12665 = var4;
            this.Field12666 = var3;
            this.Field12667 = 2;
            if (RSInterface.Field12749[var4].Field12775 == this.openInterfaceID) {
               this.Field12667 = 1;
            }

            if (RSInterface.Field12749[var4].Field12775 == this.Field12693) {
               this.Field12667 = 3;
            }
         }

         if (var6 == 847) {
            this.Field12630.Method14445(87);
            this.Field12630.Method422(var7);
            this.Field12630.Method14470(var4);
            this.Field12630.Method422(var3);
            this.Field12663 = 0;
            this.Field12665 = var4;
            this.Field12666 = var3;
            this.Field12667 = 2;
            if (RSInterface.Field12749[var4].Field12775 == this.openInterfaceID) {
               this.Field12667 = 1;
            }

            if (RSInterface.Field12749[var4].Field12775 == this.Field12693) {
               this.Field12667 = 3;
            }
         }

         if (var6 == 626) {
            var11 = RSInterface.Field12749[var4];
            this.Field12577 = 1;
            this.Field12184 = var11.Field12794;
            this.Field12578 = var4;
            this.Field12579 = var11.Field12780;
            this.Field12697 = 0;
            String var27 = var11.Field12760;
            if (var11.Field12760.indexOf(" ") != -1) {
               var27 = var27.substring(0, var27.indexOf(" "));
            }

            var19 = var11.Field12760;
            if (var11.Field12760.indexOf(" ") != -1) {
               var19 = var19.substring(var19.indexOf(" ") + 1);
            }

            this.Field12580 = var27 + " " + var11.Field12756 + " " + var19;
            if (this.Field12579 == 16) {
               this.Field12646 = 3;
               this.Field12647 = 3;
            }

         } else {
            if (var6 == 78) {
               this.Field12630.Method14445(117);
               this.Field12630.Method14461(var4);
               this.Field12630.Method14461(var7);
               this.Field12630.Method421(var3);
               this.Field12663 = 0;
               this.Field12665 = var4;
               this.Field12666 = var3;
               this.Field12667 = 2;
               if (RSInterface.Field12749[var4].Field12775 == this.openInterfaceID) {
                  this.Field12667 = 1;
               }

               if (RSInterface.Field12749[var4].Field12775 == this.Field12693) {
                  this.Field12667 = 3;
               }
            }

            if (var6 == 27 && (var18 = this.session_players[var7]) != null) {
               this.Method13343(1, 2, 0, 1, 0, session_player.x_13[0], 1, 0, var18.x_13[0], session_player.w_14[0], false, var18.w_14[0]);
               this.Field12374 = super.clickX;
               this.Field12375 = super.clickY;
               this.Field12378 = 2;
               this.Field12376 = 0;
               if ((Field12457 += var7) >= 54) {
                  this.Field12630.Method14445(189);
                  this.Field12630.Method388(234);
                  Field12457 = 0;
               }

               this.Field12630.Method14445(73);
               this.Field12630.Method421(var7);
            }

            if (var6 == 213) {
               if (!this.Method13346(2, 0, 0, 0, session_player.x_13[0], 0, 0, var4, session_player.w_14[0], false, var3)) {
                  this.Method13346(2, 0, 1, 0, session_player.x_13[0], 1, 0, var4, session_player.w_14[0], false, var3);
               }

               this.Field12374 = super.clickX;
               this.Field12375 = super.clickY;
               this.Field12378 = 2;
               this.Field12376 = 0;
               this.Field12630.Method14445(79);
               this.Field12630.Method421(var4 + Field12491);
               this.Field12630.Method14470(var7);
               this.Field12630.Method422(var3 + Field12490);
            }

            if (var6 == 632) {
               this.Field12630.Method14445(145);
               this.Field12630.Method422(var4);
               this.Field12630.Method422(var3);
               this.Field12630.Method422(var7);
               this.Field12663 = 0;
               this.Field12665 = var4;
               this.Field12666 = var3;
               this.Field12667 = 2;
               if (RSInterface.Field12749[var4].Field12775 == this.openInterfaceID) {
                  this.Field12667 = 1;
               }

               if (RSInterface.Field12749[var4].Field12775 == this.Field12693) {
                  this.Field12667 = 3;
               }
            }

            if (var6 == 1004 && this.Field12573[10] != -1) {
               this.Field12646 = 10;
               this.Field12647 = 10;
               this.Field12560 = true;
            }

            if (var6 == 1003) {
               this.Field12306 = 2;
               Field12649 = true;
            }

            if (var6 == 1002) {
               this.Field12306 = 1;
               Field12649 = true;
            }

            if (var6 == 1001) {
               this.Field12306 = 0;
               Field12649 = true;
            }

            if (var6 == 1000) {
               this.Field12233 = 4;
               this.Field12312 = 11;
               Field12649 = true;
            }

            if (var6 == 999) {
               this.Field12233 = 0;
               this.Field12312 = 0;
               Field12649 = true;
            }

            if (var6 == 998) {
               this.Field12233 = 1;
               this.Field12312 = 5;
               Field12649 = true;
            }

            if (var6 == 997) {
               this.Field12702 = 3;
               Field12649 = true;
            }

            if (var6 == 996) {
               this.Field12702 = 2;
               Field12649 = true;
            }

            if (var6 == 995) {
               this.Field12702 = 1;
               Field12649 = true;
            }

            if (var6 == 994) {
               this.Field12702 = 0;
               Field12649 = true;
            }

            if (var6 == 993) {
               this.Field12233 = 2;
               this.Field12312 = 1;
               Field12649 = true;
            }

            if (var6 == 992) {
               this.Field12333 = 2;
               Field12649 = true;
            }

            if (var6 == 991) {
               this.Field12333 = 1;
               Field12649 = true;
            }

            if (var6 == 990) {
               this.Field12333 = 0;
               Field12649 = true;
            }

            if (var6 == 989) {
               this.Field12233 = 3;
               this.Field12312 = 2;
               Field12649 = true;
            }

            if (var6 == 987) {
               this.Field12669 = 2;
               Field12649 = true;
            }

            if (var6 == 986) {
               this.Field12669 = 1;
               Field12649 = true;
            }

            if (var6 == 985) {
               this.Field12669 = 0;
               Field12649 = true;
            }

            if (var6 == 984) {
               this.Field12233 = 5;
               this.Field12312 = 3;
               Field12649 = true;
            }

            if (var6 == 983) {
               Field12649 = true;
            }

            if (var6 == 982) {
               Field12649 = true;
            }

            if (var6 == 981) {
               Field12649 = true;
            }

            if (var6 == 980) {
               this.Field12233 = 6;
               this.Field12312 = 4;
               Field12649 = true;
            }

            if (var6 == 493) {
               this.Field12630.Method14445(75);
               this.Field12630.Method14461(var4);
               this.Field12630.Method421(var3);
               this.Field12630.Method422(var7);
               this.Field12663 = 0;
               this.Field12665 = var4;
               this.Field12666 = var3;
               this.Field12667 = 2;
               if (RSInterface.Field12749[var4].Field12775 == this.openInterfaceID) {
                  this.Field12667 = 1;
               }

               if (RSInterface.Field12749[var4].Field12775 == this.Field12693) {
                  this.Field12667 = 3;
               }
            }

            if (var6 == 652) {
               if (!this.Method13346(2, 0, 0, 0, session_player.x_13[0], 0, 0, var4, session_player.w_14[0], false, var3)) {
                  this.Method13346(2, 0, 1, 0, session_player.x_13[0], 1, 0, var4, session_player.w_14[0], false, var3);
               }

               this.Field12374 = super.clickX;
               this.Field12375 = super.clickY;
               this.Field12378 = 2;
               this.Field12376 = 0;
               this.Field12630.Method14445(156);
               this.Field12630.Method422(var3 + Field12490);
               this.Field12630.Method421(var4 + Field12491);
               this.Field12630.Method14461(var7);
            }

            if (var6 == 94) {
               if (!this.Method13346(2, 0, 0, 0, session_player.x_13[0], 0, 0, var4, session_player.w_14[0], false, var3)) {
                  this.Method13346(2, 0, 1, 0, session_player.x_13[0], 1, 0, var4, session_player.w_14[0], false, var3);
               }

               this.Field12374 = super.clickX;
               this.Field12375 = super.clickY;
               this.Field12378 = 2;
               this.Field12376 = 0;
               this.Field12630.Method14445(181);
               this.Field12630.Method421(var4 + Field12491);
               this.Field12630.Method14470(var7);
               this.Field12630.Method421(var3 + Field12490);
               this.Field12630.Method422(this.Field12578);
            }

            if (var6 == 1987) {
               this.openURL(var10.replace("Go-to @lre@", ""));
            }

            if (var6 == 646) {
               this.Field12630.Method14445(185);
               this.Field12630.Method14470(var4);
               if (var4 == 32657) {
                  if (this.Field12676) {
                     this.Field12676 = false;
                  } else {
                     this.Method13216();
                  }
               } else if (var4 >= 21020 && var4 < 21032) {
                  this.Field12101 = var4 - 21020;
                  this.Field12650 = 0;
                  this.Field12521 = 0;
                  Field12649 = true;
                  this.Field12676 = false;
               } else if (var4 != 33657) {
                  if (var4 >= 35087 && var4 <= 35091) {
                     if (var2) {
                        this.Method13334("Please wait until the map has finished loading.");
                        return;
                     }

                     Field12167 = var4 - '褎';
                     Method13220();
                     this.Method13209(10);
                     initializeGL();
                  } else if (var4 >= 35015 && var4 <= 35019) {
                     if (var4 == 35015) {
                        Field12117 = 40;
                     } else if (var4 == 35016) {
                        Field12117 = 50;
                     } else if (var4 == 35017) {
                        Field12117 = 60;
                     } else if (var4 == 35018) {
                        Field12117 = 80;
                     } else if (var4 == 35019) {
                        Field12117 = 100;
                     }

                     if (GraphicsDisplay.Method1000() && Field12117 > 80) {
                        Field12117 = 80;
                        this.Method13334("You cannot use higher rendering distances on Intel HD chips.");
                     }

                     if (GraphicsDisplay.Field2678) {
                        GraphicsDisplay.Method997().Field2685 = true;
                     }

                     SceneGraph.Field928 = Field12117;
                     initializeGL();
                  } else if (var4 >= 35071 && var4 <= 35075) {
                     if (var4 == 35071) {
                        Field12118 = 30;
                     } else if (var4 == 35072) {
                        Field12118 = 60;
                     } else if (var4 == 35073) {
                        Field12118 = 80;
                     } else if (var4 == 35074) {
                        Field12118 = 144;
                     } else if (var4 == 35075) {
                        Field12118 = 1000;
                     }

                     initializeGL();
                  } else if (var4 >= 35109 && var4 <= 35114) {
                     Method13200(var15 = var4 - '褥', this);
                     initializeGL();
                  }
               }

               if ((var11 = RSInterface.Field12749[var4]).Field12764 != null && var11.Field12764[0][0] == 5) {
                  var22 = var11.Field12764[0][1];
                  if (this.Field12444[var22] != var11.Field12750[0]) {
                     this.Field12444[var22] = var11.Field12750[0];
                     this.Method13269(var22);
                  }
               }

               if (var4 >= 21020 && var4 <= 21027) {
                  this.d_91 = -3000;
               }
            }

            if (var6 == 225 && (var16 = this.Field12327[var7]) != null) {
               this.Method13345(var16);
               this.Field12374 = super.clickX;
               this.Field12375 = super.clickY;
               this.Field12378 = 2;
               this.Field12376 = 0;
               if ((Field12651 += var7) >= 85) {
                  this.Field12630.Method14445(230);
                  this.Field12630.Method388(239);
                  Field12651 = 0;
               }

               this.Field12630.Method14445(17);
               this.Field12630.Method14461(var7);
            }

            if (var6 == 965 && (var16 = this.Field12327[var7]) != null) {
               this.Method13345(var16);
               this.Field12374 = super.clickX;
               this.Field12375 = super.clickY;
               this.Field12378 = 2;
               this.Field12376 = 0;
               if (++Field12576 >= 96) {
                  this.Field12630.Method14445(152);
                  this.Field12630.Method388(88);
                  Field12576 = 0;
               }

               this.Field12630.Method14445(21);
               this.Field12630.Method14470(var7);
            }

            if (var6 == 478 && (var16 = this.Field12327[var7]) != null) {
               this.Method13345(var16);
               this.Field12374 = super.clickX;
               this.Field12375 = super.clickY;
               this.Field12378 = 2;
               this.Field12376 = 0;
               if (++Field12576 >= 96) {
                  this.Field12630.Method14445(152);
                  this.Field12630.Method388(88);
                  Field12576 = 0;
               }

               this.Field12630.Method14445(18);
               this.Field12630.Method14470(var7);
            }

            if (var6 == 413 && (var16 = this.Field12327[var7]) != null) {
               this.Method13345(var16);
               this.Field12374 = super.clickX;
               this.Field12375 = super.clickY;
               this.Field12378 = 2;
               this.Field12376 = 0;
               this.Field12630.Method14445(131);
               this.Field12630.Method14461(var7);
               this.Field12630.Method422(this.Field12578);
            }

            if (var6 == 200) {
               this.Method13404();
            }

            if (var6 == 1025 && (var16 = this.Field12327[var7]) != null) {
               NPCDefinition var24 = var16.Field4103;
               if (var16.Field4103.Field10755 != null) {
                  var24 = var24.Method11888();
               }

               if (var24 != null) {
                  this.examineBytecodeRouter(var24.Field10756);
               }
            }

            if (var6 == 900) {
               this.Method13344(var8, var4, var3, var5);
               this.Field12630.Method14445(252);
               this.Field12630.Method14461(var5);
               this.Field12630.Method421(var4 + Field12491);
               this.Field12630.Method422(var3 + Field12490);
            }

            if (var6 == 412 && (var16 = this.Field12327[var7]) != null) {
               this.Method13345(var16);
               this.Field12374 = super.clickX;
               this.Field12375 = super.clickY;
               this.Field12378 = 2;
               this.Field12376 = 0;
               this.Field12630.Method14445(72);
               this.Field12630.Method422(var7);
            }

            if (var6 == 365 && (var18 = this.session_players[var7]) != null) {
               this.Method13343(1, 2, 0, 1, 0, session_player.x_13[0], 1, 0, var18.x_13[0], session_player.w_14[0], false, var18.w_14[0]);
               this.Field12374 = super.clickX;
               this.Field12375 = super.clickY;
               this.Field12378 = 2;
               this.Field12376 = 0;
               this.Field12630.Method14445(249);
               this.Field12630.Method422(var7);
               this.Field12630.Method421(this.Field12578);
            }

            if (var6 == 729 && (var18 = this.session_players[var7]) != null) {
               this.Method13343(1, 2, 0, 1, 0, session_player.x_13[0], 1, 0, var18.x_13[0], session_player.w_14[0], false, var18.w_14[0]);
               this.Field12374 = super.clickX;
               this.Field12375 = super.clickY;
               this.Field12378 = 2;
               this.Field12376 = 0;
               this.Field12630.Method14445(39);
               this.Field12630.Method421(var7);
            }

            if (var6 == 577 && (var18 = this.session_players[var7]) != null) {
               this.Method13343(1, 2, 0, 1, 0, session_player.[0], 1, 0, var18.x_13[0], session_player.w_14[0], false, var18.w_14[0]);
               this.Field12374 = super.clickX;
               this.Field12375 = super.clickY;
               this.Field12378 = 2;
               this.Field12376 = 0;
               this.Field12630.Method14445(139);
               this.Field12630.Method421(var7);
            }

            if (var6 == 956) {
               this.Method13344(var8, var4, var3, var5);
               this.Field12630.Method14445(35);
               this.Field12630.Method421(var3 + Field12490);
               this.Field12630.Method421(this.Field12578);
               this.Field12630.Method421(var4 + Field12491);
               this.Field12630.Method421(var5);
            }

            if (var6 == 567) {
               if (!this.Method13346(2, 0, 0, 0, session_player.x_13[0], 0, 0, var4, session_player.w_14[0], false, var3)) {
                  this.Method13346(2, 0, 1, 0, session_player.x_13[0], 1, 0, var4, session_player.w_14[0], false, var3);
               }

               this.Field12374 = super.clickX;
               this.Field12375 = super.clickY;
               this.Field12378 = 2;
               this.Field12376 = 0;
               this.Field12630.Method14445(23);
               this.Field12630.Method421(var4 + Field12491);
               this.Field12630.Method421(var7);
               this.Field12630.Method421(var3 + Field12490);
            }

            if (var6 == 867) {
               if ((var7 & 3) == 0) {
                  ++Field12615;
               }

               if (Field12615 >= 59) {
                  this.Field12630.Method14445(200);
                  this.Field12630.Method14470(25501);
                  Field12615 = 0;
               }

               this.Field12630.Method14445(43);
               this.Field12630.Method421(var4);
               this.Field12630.Method422(var7);
               this.Field12630.Method422(var3);
               this.Field12663 = 0;
               this.Field12665 = var4;
               this.Field12666 = var3;
               this.Field12667 = 2;
               if (RSInterface.Field12749[var4].Field12775 == this.openInterfaceID) {
                  this.Field12667 = 1;
               }

               if (RSInterface.Field12749[var4].Field12775 == this.Field12693) {
                  this.Field12667 = 3;
               }
            }

            if (var6 == 543) {
               this.Field12630.Method14445(237);
               this.Field12630.Method14470(var3);
               this.Field12630.Method422(var7);
               this.Field12630.Method14470(var4);
               this.Field12630.Method422(this.Field12578);
               this.Field12663 = 0;
               this.Field12665 = var4;
               this.Field12666 = var3;
               this.Field12667 = 2;
               if (RSInterface.Field12749[var4].Field12775 == this.openInterfaceID) {
                  this.Field12667 = 1;
               }

               if (RSInterface.Field12749[var4].Field12775 == this.Field12693) {
                  this.Field12667 = 3;
               }
            }

            if (var6 == 606 && (var22 = (var21 = this.Field12634[var1]).indexOf("@whi@")) != -1) {
               if (this.openInterfaceID == -1) {
                  this.Method13404();
                  this.Field12356 = var21.substring(var22 + 5).trim();
                  this.Field12595 = false;

                  for(int var20 = 0; var20 < RSInterface.Field12749.length; ++var20) {
                     if (RSInterface.Field12749[var20] != null && RSInterface.Field12749[var20].Field12751 == 600) {
                        this.Field12618 = this.openInterfaceID = RSInterface.Field12749[var20].Field12775;
                        break;
                     }
                  }
               } else {
                  this.pushMessage("Please close the interface you have open before using 'report abuse'", 0, "");
               }
            }

            if (var6 == 491 && (var18 = this.session_players[var7]) != null) {
               this.Method13343(1, 2, 0, 1, 0, session_player.x_13[0], 1, 0, var18.x_13[0], session_player.w_14[0], false, var18.w_14[0]);
               this.Field12374 = super.clickX;
               this.Field12375 = super.clickY;
               this.Field12378 = 2;
               this.Field12376 = 0;
               this.Field12630.Method14445(14);
               this.Field12630.Method422(this.Field12699);
               this.Field12630.Method14470(var7);
               this.Field12630.Method14470(this.Field12700);
               this.Field12630.Method421(this.Field12698);
            }

            if (var6 == 639) {
               var22 = (var21 = this.Field12634[var1]).indexOf("@whi@");
               var19 = var21.substring(var22 + 5).trim();
               Field12649 = true;
               this.Field12650 = 0;
               this.Field12676 = true;
               this.Field12639 = "";
               this.Field12521 = 3;
               this.Field12435 = Class23.nameToLong(var19);
               this.Field12564 = var19;
            }

            if (var6 == 454) {
               this.Field12630.Method14445(41);
               this.Field12630.Method14470(var7);
               this.Field12630.Method422(var3);
               this.Field12630.Method422(var4);
               this.Field12663 = 0;
               this.Field12665 = var4;
               this.Field12666 = var3;
               this.Field12667 = 2;
               if (RSInterface.Field12749[var4].Field12775 == this.openInterfaceID) {
                  this.Field12667 = 1;
               }

               if (RSInterface.Field12749[var4].Field12775 == this.Field12693) {
                  this.Field12667 = 3;
               }
            }

            if (var6 == 113) {
               this.Method13344(var8, var4, var3, var5);
               this.Field12630.Method14445(70);
               this.Field12630.Method421(var3 + Field12490);
               this.Field12630.Method14470(var4 + Field12491);
               this.Field12630.Method14461(var5);
            }

            if (var6 == 872) {
               this.Method13344(var8, var4, var3, var5);
               this.Field12630.Method14445(234);
               this.Field12630.Method14461(var3 + Field12490);
               this.Field12630.Method422(var5);
               this.Field12630.Method14461(var4 + Field12491);
            }

            if (var6 == 502) {
               this.Method13344(var8, var4, var3, var5);
               this.Field12630.Method14445(132);
               this.Field12630.Method14461(var3 + Field12490);
               this.Field12630.Method14470(var5);
               this.Field12630.Method422(var4 + Field12491);
            }

            ItemDef var28;
            if (var6 == 1125) {
               var28 = ItemDef.forID(var7);
               RSInterface var25;
               if ((var25 = RSInterface.Field12749[var4]) != null && var25.Field12795[var3] >= 100000) {
                  var19 = var25.Field12795[var3] + " x " + var28.Field10639;
               } else if (var28.Field10644 != null) {
                  var19 = new String(var28.Field10644);
               } else {
                  var19 = "You have" + aAnFormatter(var28.Field10639) + var28.Field10639 + ".";
               }

               this.examineRunescapeReplacer(var19);
            }

            if (var6 == 169) {
               if (var4 == 152) {
                  this.Method13269(173);
                  if (var4 == 152 && this.Field12444[173] == 0) {
                     var4 = 153;
                  }

                  this.Field12630.Method14445(185);
                  this.Field12630.Method14470(var4);
               } else if (var4 == 39710) {
                  Field12108 = !Field12108;
                  this.Field12444[1998] = Field12108 ? 1 : 0;
                  initializeGL();
               } else if (var4 == 35002) {
                  if (GraphicsDisplay.Field2678) {
                     if (GraphicsDisplay.Field2683) {
                        GraphicsDisplay.Field2681 = !GraphicsDisplay.Field2681;
                        this.Field12444[1980] = GraphicsDisplay.Field2681 ? 0 : 1;
                        initializeGL();
                     } else {
                        this.pushMessage("Your machine has no support for anti-aliasing!", 0, "");
                     }
                  } else {
                     this.pushMessage("Anti Aliasing is only available in the openGL mode!", 0, "");
                  }
               } else if (var4 == 35004) {
                  if (GraphicsDisplay.Field2662) {
                     GraphicsDisplay.Field2669 = true;
                     this.Method13334("Rendering with VBOs: " + !GraphicsDisplay.Field2667);
                     this.Field12444[1981] = GraphicsDisplay.Field2667 ? 1 : 0;
                  } else {
                     this.Method13334("Rendering with VBOs is not supported on your machine.");
                  }
               } else if (var4 == 35099) {
                  Field12090 = !Field12090;
                  this.Field12444[1999] = !Field12090 ? 0 : 1;
                  initializeGL();
               } else if (var4 == 35101) {
                  Field12103 = !Field12103;
                  this.Field12444[2000] = !Field12103 ? 1 : 0;
                  initializeGL();
               } else if (var4 == 35103) {
                  if (GraphicsDisplay.Field2678 && GraphicsDisplay.Field2667) {
                     Field12104 = !Field12104;
                     this.Field12444[2001] = !Field12104 ? 1 : 0;
                     initializeGL();
                  } else {
                     this.Method13334("This option is only supported with VBO Mode.");
                  }
               } else if (var4 == 35105) {
                  if (GraphicsDisplay.Field2678 && GraphicsDisplay.Field2667) {
                     Rasterizer.Field9942 = !Rasterizer.Field9942;
                     this.Field12444[2002] = !Rasterizer.Field9942 ? 1 : 0;
                     initializeGL();
                     this.Method13209(199);
                  } else {
                     this.Method13334("This option is only supported with VBO Mode.");
                  }
               } else if (var4 == 35116) {
                  if (GraphicsDisplay.Field2678 && GraphicsDisplay.Field2667 && GraphicsDisplay.Field2665) {
                     Field12225 = !Field12225;
                     Player.aBoolean = true;
                     NPCDefinition.Method11883();
                     ItemDef.Method11904();
                     Field12076 = true;
                  } else {
                     Field12059.add("Particles aren't supported on your system.");
                     Field12225 = false;
                  }

                  this.Field12444[2008] = !Field12225 ? 1 : 0;
                  initializeGL();
               } else if (var4 == 35118) {
                  Field12057 = !Field12057;
                  this.Field12444[2009] = !Field12057 ? 1 : 0;
                  initializeGL();
               } else if (var4 == 35141) {
                  Field12055 = !Field12055;
                  this.Field12444[2012] = !Field12055 ? 1 : 0;
                  initializeGL();
                  if (GraphicsDisplay.Field2678 && GraphicsDisplay.Field2667) {
                     Class838.Field6955.Method10099();
                  }

                  Method13323();
                  Class843.Field3755 = true;
                  Player.aBoolean = true;
                  this.Method13208();
                  this.Method13209(17);
                  ObjectDefinition.Method11941();
                  ObjectDefinition.Method11942();
                  Class586.Method8960();
                  this.Field12249 = null;
               } else if (var4 == 35107) {
                  Field12077 = !Field12077;
                  this.Field12444[2003] = !Field12077 ? 1 : 0;
                  initializeGL();
               } else if (var4 == 35108) {
                  Field12078 = !Field12078;
                  this.Field12444[2004] = !Field12078 ? 1 : 0;
                  initializeGL();
               } else if (var4 == 35006) {
                  if (var2) {
                     this.Method13334("Please wait until the map has finished loading.");
                     return;
                  }

                  Class569.Field471 = !Class569.Field471;
                  Class838.Field6955.Method10099();
                  this.Method13209(11);
                  this.Field12444[1982] = Class569.Field471 ? 1 : 0;
                  initializeGL();
               } else if (var4 == 35008) {
                  Field12123 = !Field12123;
                  this.Field12444[1983] = Field12123 ? 1 : 0;
                  initializeGL();
               } else if (var4 == 35095) {
                  Field12124 = !Field12124;
                  this.Field12444[1996] = Field12124 ? 0 : 1;
                  initializeGL();
               } else if (var4 == 35097) {
                  Field12110 = !Field12110;
                  this.Field12444[1997] = Field12110 ? 0 : 1;
                  initializeGL();
               } else if (var4 == 35010) {
                  if (GraphicsDisplay.Field2678) {
                     Field12107 = !Field12107;
                  } else {
                     this.pushMessage("Fog isn't yet available for non-openGL mode.", 0, "");
                     Field12107 = false;
                  }

                  GraphicsDisplay.Method997().Field2685 = true;
                  this.Field12444[1984] = Field12107 ? 0 : 1;
                  initializeGL();
               } else if (var4 == 35012) {
                  if (GraphicsDisplay.Field2678) {
                     Rasterizer.Field9947 = !Rasterizer.Field9947;
                     Class843.Field3755 = true;
                     this.Field12444[1985] = Rasterizer.Field9947 ? 0 : 1;
                     initializeGL();
                     this.Field12162 = true;
                     this.Field12163 = false;
                     this.Method13209(12);
                  } else {
                     this.pushMessage("Model Textures are only available in the openGL mode!", 0, "");
                  }
               } else if (var4 == 35014) {
                  Field12121 = !Field12121;
                  initializeGL();
               } else if (var4 == 30350) {
                  if (this.Field12573[11] == 904) {
                     if (this.openInterfaceID == -1) {
                        this.openInterfaceID = 35000;
                        this.Method13219();
                     } else {
                        this.pushMessage("Please close the interface you have open before changing graphic settings.", 0, "");
                     }
                  } else {
                     this.Field12573[11] = 904;
                  }
               } else if (var4 == 35064) {
                  if (!Field12712) {
                     Field12712 = true;
                     Method13292();
                     if (this.Field12418 != null) {
                        this.Field12418.Field9893 = null;
                        this.Field12418 = null;
                        System.gc();
                     }

                     initializeGL();
                     GraphicsDisplay.Method997();
                     GraphicsDisplay.Method1044(GraphicsDisplay.Method1041());
                     this.Field12274 = true;
                     this.Method13219();
                  }
               } else if (var4 == 35065) {
                  if (Field12712) {
                     Field12712 = false;
                     Method13292();
                     if (this.Field12418 != null) {
                        this.Field12418.Field9893 = null;
                        this.Field12418 = null;
                        System.gc();
                     }

                     initializeGL();
                     GraphicsDisplay.Method997();
                     GraphicsDisplay.Method1044(GraphicsDisplay.Method1041());
                     this.Field12274 = true;
                     this.Method13219();
                  }
               } else if (var4 == 35078) {
                  Field12592 = !Field12592;
                  this.Field12444[1989] = Field12592 ? 0 : 1;
                  initializeGL();
               } else if (var4 == 35080) {
                  if (!GraphicsDisplay.Field2678 || !GraphicsDisplay.Field2667) {
                     this.Method13334("Multibuffer can only be used when VBO mode is enabled.");
                     return;
                  }

                  GraphicsDisplay.Field2668 = !GraphicsDisplay.Field2668;
                  this.Field12444[1990] = GraphicsDisplay.Field2668 ? 0 : 1;
                  initializeGL();
                  this.Field12162 = true;
                  this.Field12163 = false;
                  ObjectDefinition.Method11942();
                  Class843.Field3755 = true;
                  if (this.Field12418 != null) {
                     this.Field12418.Field9893 = null;
                     this.Field12418 = null;
                  }

                  this.Method13209(112);
                  System.gc();
               } else if (var4 == 35082) {
                  if (!(Field12106 = !Field12106)) {
                     Class280.Method2999();
                  } else {
                     Class280.Method2988().Method2998();
                  }

                  initializeGL();
               } else if (var4 == 35084) {
                  Field12113 = !Field12113;
                  initializeGL();
               } else if (var4 == 35086) {
                  Field12114 = !Field12114;
                  initializeGL();
               } else if (var4 == 35094) {
                  Field12115 = !Field12115;
                  initializeGL();
               } else if (var4 >= 82028 && var4 <= 82036) {
                  this.d_91 = -3000;
               }

               if ((var11 = RSInterface.Field12749[var4]).Field12764 != null && var11.Field12764[0][0] == 5) {
                  var22 = var11.Field12764[0][1];
                  this.Field12444[var22] = 1 - this.Field12444[var22];
                  this.Method13269(var22);
               }

               this.Field12630.Method14445(185);
               this.Field12630.Method14470(var4);
            }

            if (var6 == 447) {
               this.Field12697 = 1;
               this.Field12698 = var3;
               this.Field12699 = var4;
               this.Field12700 = var7;
               this.Field12701 = ItemDef.forID(var7).Field10639;
               this.Field12577 = 0;
            } else {
               if (var6 == 1226) {
                  ObjectDefinition var26 = ObjectDefinition.Method11938(var5);
                  this.examineBytecodeRouter(var26.Field10585);
               }

               if (var6 == 244) {
                  if (!this.Method13346(2, 0, 0, 0, session_player.x_13[0], 0, 0, var4, session_player.w_14[0], false, var3)) {
                     this.Method13346(2, 0, 1, 0, session_player.x_13[0], 1, 0, var4, session_player.w_14[0], false, var3);
                  }

                  this.Field12374 = super.clickX;
                  this.Field12375 = super.clickY;
                  this.Field12378 = 2;
                  this.Field12376 = 0;
                  this.Field12630.Method14445(253);
                  this.Field12630.Method421(var3 + Field12490);
                  this.Field12630.Method14461(var4 + Field12491);
                  this.Field12630.Method422(var7);
               }

               if (var6 == 1448) {
                  if ((var28 = ItemDef.forID(var7)).Field10644 == null) {
                     this.examineRunescapeReplacer("You have" + aAnFormatter(var28.Field10639) + var28.Field10639 + ".");
                  } else {
                     this.examineBytecodeRouter(var28.Field10644);
                  }
               }

               this.Field12697 = 0;
               this.Field12577 = 0;
               if (var6 >= 985 && var6 <= 1003) {
                  this.Field12630.Method14445(95);
                  this.Field12630.Method388(this.Field12702);
                  this.Field12630.Method388(this.Field12333);
                  this.Field12630.Method388(this.Field12669);
               }

            }
         }
      }
   }

   public void run() {
      if (!this.Field12355) {
         super.run();
      }

   }

   public final void Method13315(String var1, int var2, int var3, int var4, boolean var5) {
      this.Field12634[this.Field12575] = var1;
      this.Field12550[this.Field12575] = var2;
      this.Field12547[this.Field12575] = var3;
      this.Field12548[this.Field12575] = var4;
      ++this.Field12575;
      if (var5) {
         this.Method13314(this.Field12575 - 1);
      }

   }

   private void Method13316() {
      if (this.Field12697 == 0 && this.Field12577 == 0 && class329 == null && (Field12712 || super.mouseEventX < 516)) {
         this.Field12634[this.Field12575] = "Walk here";
         this.Field12550[this.Field12575] = 516;
         this.Field12547[this.Field12575] = super.mouseEventX;
         this.Field12548[this.Field12575] = super.mouseEventY;
         ++this.Field12575;
      }

      try {
         this.Field12269.clear();
         Model.Method14525(this.Field12269);
         Collections.sort(this.Field12269);
      } catch (Exception var13) {
         var13.printStackTrace();
         List var2 = this.Field12269;
         synchronized(this.Field12269) {
            this.Field12269.clear();
         }
      }

      Iterator var16 = this.Field12269.iterator();

      label357:
      while(var16.hasNext()) {
         Class730 var1 = (Class730)var16.next();
         if (this.Field12575 + 10 >= this.Field12550.length) {
            return;
         }

         long var3;
         int var5 = (int)((var3 = var1.Method12352()) & 127L);
         int var6 = (int)(var3 >> 7 & 127L);
         int var7 = (int)(var3 >> 29 & 3L);
         int var8 = (int)(var3 >> 14 & 32767L);
         if (var7 == 2) {
            var8 = var1.Method12351();
         }

         if (var5 <= SceneGraph.mapSizeWidth && var6 <= SceneGraph.mapSizeWidth) {
            int var10;
            int var14;
            Npc var19;
            Player var20;
            if (var7 == 1) {
               Npc var27; //.resizeXY
               if ((Field12712 || super.mouseEventX <= 518) && var8 < this.Field12327.length && (var27 = this.Field12327[var8]) != null && var27.Field4103 != null) {
                  if (var27.Field4103.Field10740 == 1 && (var27.Field4194 & 127) == 64 && (var27.Field4195 & 127) == 64) {
                     for(var10 = 0; var10 < Field12328; ++var10) {
                        var14 = this.Field12329[var10];
                        if ((var19 = this.Field12327[var14]) != null && var19.Field4103 != null && var19 != var27 && var19.Field4103.Field10740 == 1 && var19.Field4194 == var27.Field4194 && var19.Field4195 == var27.Field4195) {
                           this.Method13348(var19.Field4103, var14, var6, var5);
                        }
                     }

                     for(var10 = 0; var10 < session_player_count; ++var10) {
                        var14 = this.session_player_list[var10];
                        if ((var20 = this.session_players[var14]) != null && var20.Field4194 == var27.Field4194 && var20.Field4195 == var27.Field4195) {
                           this.rightClickListText(var5, var14, var20, var6, var14);
                        }
                     }
                  }

                  this.Method13348(var27.Field4103, var8, var6, var5);
               }
            } else if (var7 == 0) {
               Player var26;
               if ((Field12712 || super.mouseEventX <= 518) && var8 < this.session_players.length && (var26 = this.session_players[var8]) != null) {
                  if ((var26.Field4194 & 127) == 64 && (var26.Field4195 & 127) == 64) {
                     for(var10 = 0; var10 < Field12328; ++var10) {
                        var14 = this.Field12329[var10];
                        if ((var19 = this.Field12327[var14]) != null && var19.Field4103 != null && var19.Field4103.Field10740 == 1 && var19.Field4194 == var26.Field4194 && var19.Field4195 == var26.Field4195) {
                           this.Method13348(var19.Field4103, var14, var6, var5);
                        }
                     }

                     for(var10 = 0; var10 < session_player_count; ++var10) {
                        var14 = this.session_player_list[var10];
                        if ((var20 = this.session_players[var14]) != null && var26 != var20 && var20.Field4194 == var26.Field4194 && var20.Field4195 == var26.Field4195) {
                           this.rightClickListText(var5, var14, var20, var6, var14);
                        }
                     }
                  }

                  this.rightClickListText(var5, var8, var26, var6, var8);
               }
            } else {
               int var11;
               if (var7 == 3) {
                  if ((Field12712 || super.mouseEventX <= 518) && this.Field12575 < this.Field12550.length - 1) {
                     long var25 = Method13253(var5 + Field12490, var6 + Field12491, Field12379);
                     if (!this.Field12221.containsKey(var25)) {
                        this.Field12221.put(var25, true);
                        List var15;
                        if ((var15 = (List)this.Field12222.get(var25)) != null) {
                           Iterator var21 = var15.iterator();

                           while(true) {
                              while(true) {
                                 if (!var21.hasNext()) {
                                    continue label357;
                                 }

                                 Class47 var18 = (Class47)var21.next();
                                 if (this.Field12575 >= this.Field12550.length) {
                                    continue label357;
                                 }

                                 ItemDef var23 = ItemDef.forID(var18.itemID);
                                 if (this.Field12697 == 1) {
                                    this.Field12634[this.Field12575] = "Use " + this.Field12701 + " with @lre@" + var23.Field10639;
                                    this.Field12550[this.Field12575] = 511;
                                    this.Field12551[this.Field12575] = var18.itemID;
                                    this.Field12547[this.Field12575] = var5;
                                    this.Field12548[this.Field12575] = var6;
                                    ++this.Field12575;
                                 } else if (this.Field12577 == 1) {
                                    if ((this.Field12579 & 1) == 1) {
                                       this.Field12634[this.Field12575] = this.Field12580 + " @lre@" + var23.Field10639;
                                       this.Field12550[this.Field12575] = 94;
                                       this.Field12551[this.Field12575] = var18.itemID;
                                       this.Field12547[this.Field12575] = var5;
                                       this.Field12548[this.Field12575] = var6;
                                       ++this.Field12575;
                                    }
                                 } else {
                                    for(var11 = 4; var11 >= 0 && this.Field12575 < this.Field12550.length; --var11) {
                                       if (var23.Field10637 != null && var23.Field10637[var11] != null) {
                                          this.Field12634[this.Field12575] = var23.Field10637[var11] + " @lre@" + var23.Field10639;
                                          if (var11 == 0) {
                                             this.Field12550[this.Field12575] = 652;
                                          }

                                          if (var11 == 1) {
                                             this.Field12550[this.Field12575] = 567;
                                          }

                                          if (var11 == 2) {
                                             this.Field12550[this.Field12575] = 234;
                                          }

                                          if (var11 == 3) {
                                             this.Field12550[this.Field12575] = 244;
                                          }

                                          if (var11 == 4) {
                                             this.Field12550[this.Field12575] = 213;
                                          }

                                          this.Field12551[this.Field12575] = var18.itemID;
                                          this.Field12547[this.Field12575] = var5;
                                          this.Field12548[this.Field12575] = var6;
                                          ++this.Field12575;
                                       } else if (var11 == 2) {
                                          this.Field12634[this.Field12575] = "Take @lre@" + var23.Field10639;
                                          this.Field12550[this.Field12575] = 234;
                                          this.Field12551[this.Field12575] = var18.itemID;
                                          this.Field12547[this.Field12575] = var5;
                                          this.Field12548[this.Field12575] = var6;
                                          ++this.Field12575;
                                       }
                                    }

                                    this.Field12634[this.Field12575] = "Examine @lre@" + var23.Field10639;
                                    this.Field12550[this.Field12575] = 1448;
                                    this.Field12551[this.Field12575] = var18.itemID;
                                    this.Field12547[this.Field12575] = var5;
                                    this.Field12548[this.Field12575] = var6;
                                    ++this.Field12575;
                                 }
                              }
                           }
                        }
                     }
                  }
               } else {
                  ObjectDefinition var9;
                  if ((var7 == 2 || Field12428.Method8878(Field12379, var5, var6, var3) >= 0) && (var9 = ObjectDefinition.Method11938(var8)) != null) {
                     var8 = var9.Field10564;
                     if (var9.Field10568 != null) {
                        var7 = -1;
                        if (var9.Field10582 != -1) {
                           VarBit var22;
                           var10 = (var22 = VarBit.Field12723[var9.Field10582]).Field12724;
                           var11 = var22.Field12725;
                           var7 = var22.Field12726;
                           var7 = Field12656[var7 - var11];
                           var7 &= ObjectDefinition.clientInstance.Field12444[var10] >> var11;
                        } else if (var9.Field10561 != -1) {
                           var7 = ObjectDefinition.clientInstance.Field12444[var9.Field10561];
                        }

                        ObjectDefinition var24;
                        if ((var24 = var7 >= 0 && var7 < var9.Field10568.length && var9.Field10568[var7] != -1 ? ObjectDefinition.Method11938(var9.Field10568[var7]) : null) != null) {
                           var9 = var24;
                        }
                     }

                     if (this.Field12697 == 1 && var9.Field10552 != null) {
                        this.Field12634[this.Field12575] = "Use " + this.Field12701 + " with @cya@" + var9.Field10552;
                        this.Field12550[this.Field12575] = 62;
                        this.Field12551[this.Field12575] = 0;
                        this.Field12547[this.Field12575] = var5;
                        this.Field12548[this.Field12575] = var6;
                        this.Field12549[this.Field12575] = var8;
                        this.Field12552[this.Field12575] = var3;
                        ++this.Field12575;
                     } else if (this.Field12577 == 1 && var9.Field10552 != null) {
                        if ((this.Field12579 & 4) == 4) {
                           this.Field12634[this.Field12575] = this.Field12580 + " @cya@" + var9.Field10552;
                           this.Field12550[this.Field12575] = 956;
                           this.Field12551[this.Field12575] = 0;
                           this.Field12547[this.Field12575] = var5;
                           this.Field12548[this.Field12575] = var6;
                           this.Field12549[this.Field12575] = var8;
                           this.Field12552[this.Field12575] = var3;
                           ++this.Field12575;
                        }
                     } else {
                        if (var9.Field10598 != null) {
                           if (!Field12712 && super.mouseEventX > 518) {
                              continue;
                           }

                           for(var10 = 4; var10 >= 0; --var10) {
                              if (var9.Field10552 != null && var9.Field10598[var10] != null) {
                                 this.Field12634[this.Field12575] = var9.Field10598[var10] + " @cya@" + var9.Field10552;
                                 if (var10 == 0) {
                                    this.Field12550[this.Field12575] = 502;
                                 } else if (var10 == 1) {
                                    this.Field12550[this.Field12575] = 900;
                                 } else if (var10 == 2) {
                                    this.Field12550[this.Field12575] = 113;
                                 } else if (var10 == 3) {
                                    this.Field12550[this.Field12575] = 1872;
                                 } else if (var10 == 4) {
                                    this.Field12550[this.Field12575] = 1062;
                                 }

                                 this.Field12551[this.Field12575] = 0;
                                 this.Field12547[this.Field12575] = var5;
                                 this.Field12548[this.Field12575] = var6;
                                 this.Field12549[this.Field12575] = var8;
                                 this.Field12552[this.Field12575] = var3;
                                 ++this.Field12575;
                              }
                           }
                        }

                        if (var9.Field10552 != null) {
                           this.Field12634[this.Field12575] = "Examine @cya@" + var9.Field10552;
                           this.Field12550[this.Field12575] = 1226;
                           this.Field12551[this.Field12575] = var9.Field10564 << 14;
                           this.Field12547[this.Field12575] = var5;
                           this.Field12548[this.Field12575] = var6;
                           this.Field12549[this.Field12575] = var8;
                           ++this.Field12575;
                           if (Field12080) {
                              String var28 = "[";
                              var14 = 0;
                              if (var9.Field10581 != null) {
                                 int[] var29 = var9.Field10581;
                                 var7 = var9.Field10581.length;

                                 for(int var4 = 0; var4 < var7; ++var4) {
                                    int var17 = var29[var4];
                                    if (var14++ > 0) {
                                       var28 = var28 + ", ";
                                    }

                                    var28 = var28 + var17;
                                 }
                              }

                              var28 = var28 + "]";
                              this.Field12634[this.Field12575] = "Data @cya@id:" + var9.Field10564 + " a:" + var9.Field10591 + " h:" + var9.Field10557 + " m:" + var28;
                              this.Field12550[this.Field12575] = 1226;
                              this.Field12551[this.Field12575] = var9.Field10564 << 14;
                              this.Field12547[this.Field12575] = var5;
                              this.Field12548[this.Field12575] = var6;
                              this.Field12549[this.Field12575] = var8;
                              ++this.Field12575;
                           }
                        }
                     }
                  }
               }
            }
         }
      }

   }

   public final void Method13317() {
      System.out.println("Cleaining up for quit...");
      this.Field12179 = null;
      this.Field12181 = null;
      if (this.Field12180 != null) {
         for(int var1 = 0; var1 < this.Field12180.length; ++var1) {
            this.Field12180[var1] = null;
            this.Field12182[var1] = null;
         }

         this.Field12180 = null;
         this.Field12182 = null;
      }

      this.Field12185 = null;
      this.Field12186 = null;
      this.Field12187 = null;
      this.Field12188 = null;
      this.Field12189 = null;
      this.Field12190 = null;
      this.Field12191 = null;
      this.Field12192 = null;
      this.Field12193 = null;
      this.Field12194 = null;
      this.Field12195 = null;
      this.Field12196 = null;
      this.Field12199 = null;
      this.Field12200 = null;
      this.Field12201 = null;
      this.Field12399 = null;
      Signlink.Field2966 = false;

      try {
         if (this.Field12608 != null) {
            this.Field12608.Method11824();
         }
      } catch (Exception var2) {
         ;
      }

      Signlink.Method11836();
      Signlink.Method11824();
      Field12183 = null;
      this.Field12608 = null;
      if (this.mouseDetection != null) {
         this.mouseDetection.Field3627 = false;
      }

      if (this.Field12526 != null) {
         this.Field12526.Method1308();
         this.Field12526 = null;
      }

      this.aStream_834 = null;
      this.Field12630 = null;
      this.Field12334 = null;
      this.Field12657 = null;
      this.Field12622 = null;
      this.Field12668 = null;
      this.Field12658 = null;
      this.Field12659 = null;
      this.intGroundArray = null;
      this.tileSettingBits = null;
      Field12428 = null;
      this.Field12655 = null;
      this.Field12372 = null;
      this.Field12322 = null;
      this.Field12695 = null;
      this.Field12696 = null;
      this.Field12602 = null;
      this.Field12317 = null;
      this.Field12318 = null;
      this.Field12319 = null;
      this.Field12603 = null;
      this.Field12604 = null;
      this.Field12606 = null;
      this.Field12313 = null;
      this.Field12314 = null;
      this.Field12315 = null;
      this.Field12316 = null;
      this.Field12633 = null;
      this.Field12429 = null;
      this.Field12348 = null;
      this.Field12565 = null;
      this.Field12458 = null;
      this.Field12553 = null;
      this.Field12554 = null;
      this.Field12555 = null;
      this.Field12586 = null;
      this.Field12532 = null;
      this.Field12533 = null;
      this.Field12535 = null;
      this.Field12536 = null;
      this.Field12537 = null;
      this.Field12517 = null;
      this.Field12489 = null;
      this.Field12385 = null;
      this.session_players = null;
      this.session_player_list = null;
      this.session_npcs_awaiting_update = null;
      this.Field12368 = null;
      this.Field12327 = null;
      this.Field12329 = null;
      this.Field12222 = null;
      this.Field12221 = null;
      this.Field12511 = null;
      this.Field12513 = null;
      this.Field12512 = null;
      this.Field12514 = null;
      this.Field12547 = null;
      this.Field12548 = null;
      this.Field12549 = null;
      this.Field12550 = null;
      this.Field12551 = null;
      this.Field12634 = null;
      this.Field12444 = null;
      this.Field12530 = null;
      this.Field12531 = null;
      this.Field12581 = null;
      this.Field12681 = null;
      this.Players = null;
      this.Field12437 = null;
      this.Field12323 = null;
      this.Field12562 = null;
      this.Field12324 = false;
      this.Field12589 = null;
      this.Field12336 = null;
      this.Field12337 = null;
      this.Field12338 = null;
      if (this.mouseDetection != null) {
         this.mouseDetection.Method11824();
         this.mouseDetection = null;
      }

      ObjectDefinition.Method11939();
      NPCDefinition.Method11891();
      ItemDef.Method11903();
      ObjectInstance.Method14444();
      Floor.Field10713 = null;
      IdentityKit.cache = null;
      RSInterface.Field12749 = null;
      Sequence.anims = null;
      SpotAnim.Field10094 = null;
      SpotAnim.Field10107 = null;
      SettingUsagePointers.Field12822 = null;
      Player.modelCache = null;
      Rasterizer.Method14444();
      SceneGraph.Method8850();
      Model.Method14450();
   }

   private void Method13318(long var1) {
      if (var1 != 0L) {
         this.Field12630.Method14445(185);
         this.Field12630.Method14470(18131);
         this.Field12630.Method14445(60);
         this.Field12630.Method394(var1);
      }
   }

   private void Method13319(long var1) {
      if (var1 != 0L) {
         this.Field12630.Method14445(60);
         this.Field12630.Method394(var1);
      }
   }

   public static boolean Method13320() {
      if (session_player != null && session_player.name != null) {
         return session_player.name.equals("Thomy") || session_player.name.equals("Mary");
      } else {
         return false;
      }
   }

   private void Method13321(String var1) {
      this.Field12630.Method14445(103);
      if (var1.startsWith("/")) {
         this.Field12630.Method388(var1.length() + 1);
         this.Field12630.Method395(var1);
      } else {
         this.Field12630.Method388(var1.length() - 1);
         this.Field12630.Method395(var1.substring(2));
      }
   }

   private void manageTextInputs() {
      int var1 = this.e();
      //while((var1 = this.e()) != -1) {
      while(true){
         if (this.openInterfaceID != -1 && this.openInterfaceID == this.Field12618) {
            if (var1 == 8 && this.Field12356.length() > 0) {
               this.Field12356 = this.Field12356.substring(0, this.Field12356.length() - 1);
            }

            if ((var1 >= 97 && var1 <= 122 || var1 >= 65 && var1 <= 90 || var1 >= 48 && var1 <= 57 || var1 == 32) && this.Field12356.length() < 12) {
               this.Field12356 = this.Field12356 + (char)var1;
            }
         } else {
            int var16;
            if (!this.Field12676 && this.Field12650 != 4) {
               int var3;
               byte var23;
               if (this.Field12650 == 1) {
                  if ((var1 >= 48 && var1 <= 57 || var1 == 107 || var1 == 75 || var1 == 109 || var1 == 77) && this.Field12470.length() < 10) {
                     var23 = 0;
                     if (var1 != 107 && var1 != 75) {
                        if (var1 != 109 && var1 != 77) {
                           this.Field12470 = this.Field12470 + (char)var1;
                        } else {
                           var23 = 6;
                        }
                     } else {
                        var23 = 3;
                     }

                     for(var3 = 0; var3 < var23; ++var3) {
                        this.Field12470 = this.Field12470 + '0';
                     }

                     Field12649 = true;
                  }

                  if (var1 == 8 && this.Field12470.length() > 0) {
                     this.Field12470 = this.Field12470.substring(0, this.Field12470.length() - 1);
                     Field12649 = true;
                  }

                  if (var1 == 13 || var1 == 10) {
                     if (this.Field12470.length() > 0) {
                        var16 = 0;

                        try {
                           var16 = Integer.parseInt(this.Field12470);
                        } catch (Exception var9) {
                           ;
                        }

                        this.Field12630.Method14445(208);
                        this.Field12630.Method14480(var16);
                        if (this.openInterfaceID == Field12140) {
                           this.Field12102 = var16;
                           if (this.Field12102 > 65000) {
                              this.Field12102 = 65000;
                           } else if (this.Field12102 <= 0) {
                              this.Field12102 = 1;
                           }
                        }
                     }

                     this.Field12650 = 0;
                     Field12649 = true;
                  }
               } else if (this.Field12650 == 2) {
                  if (var1 >= 32 && var1 <= 122 && this.Field12470.length() < 12) {
                     this.Field12470 = this.Field12470 + (char)var1;
                     Field12649 = true;
                  }

                  if (var1 == 8 && this.Field12470.length() > 0) {
                     this.Field12470 = this.Field12470.substring(0, this.Field12470.length() - 1);
                     Field12649 = true;
                  }

                  if (var1 == 13 || var1 == 10) {
                     if (this.Field12470.length() > 0) {
                        this.Field12630.Method14445(60);
                        this.Field12630.Method394(Class23.nameToLong(this.Field12470));
                     }

                     this.Field12650 = 0;
                     Field12649 = true;
                  }
               } else if (this.Field12693 == -1) {
                  if (var1 == 32 && this.Field12360.length() <= 0) {
                     return;
                  }

                  if (var1 >= 32 && var1 <= 256 && this.Field12360.length() < 80) {
                     this.Field12360 = this.Field12360 + (char)var1;
                     Field12649 = true;
                  }

                  if (var1 == 8 && this.Field12360.length() > 0) {
                     this.Field12360 = this.Field12360.substring(0, this.Field12360.length() - 1);
                     Field12649 = true;
                  }

                  if ((var1 == 13 || var1 == 10) && this.Field12360.length() > 0) {
                     String var18;
                     if ((var18 = this.Field12360.toLowerCase()).equals("::resetscale")) {
                        Field12138 = 1.0D;
                        this.Field12203 = true;
                     } else if (var18.startsWith("::inspectmodel") && Method13320()) {
                        this.Field12160.clear();
                        this.Field12160.add(Integer.parseInt(var18.split(" ")[1]));
                     } else {
                        int var4;
                        int[] var24;
                        if (var18.startsWith("::inspectnpc") && Method13320()) {
                           NPCDefinition var39;
                           if ((var39 = NPCDefinition.Method11884(Integer.parseInt(var18.split(" ")[1]))) == null) {
                              this.Method13334("Error, npc not found");
                           } else {
                              this.Field12160.clear();
                              var24 = var39.Field10760;
                              var4 = var39.Field10760.length;

                              for(var16 = 0; var16 < var4; ++var16) {
                                 if ((var1 = var24[var16]) > 0) {
                                    this.Field12160.add(var1);
                                 }
                              }
                           }
                        } else if (var18.startsWith("::inspectitem") && Method13320()) {
                           ItemDef var38;
                           if ((var38 = ItemDef.forID(Integer.parseInt(var18.split(" ")[1]))) == null) {
                              this.Method13334("Error, item not found");
                           } else {
                              this.Field12160.clear();
                              if (var38.Field10641 > 0) {
                                 this.Field12160.add(var38.Field10641);
                              }

                              if (var38.Field10634 > 0) {
                                 this.Field12160.add(var38.Field10634);
                              }

                              if (var38.Field10651 > 0) {
                                 this.Field12160.add(var38.Field10651);
                              }

                              if (var38.Field10650 > 0) {
                                 this.Field12160.add(var38.Field10650);
                              }

                              if (var38.Field10662 > 0) {
                                 this.Field12160.add(var38.Field10662);
                              }

                              if (var38.Field10633 > 0) {
                                 this.Field12160.add(var38.Field10633);
                              }

                              if (var38.Field10631 > 0) {
                                 this.Field12160.add(var38.Field10631);
                              }

                              if (var38.genderZeroOffset > 0) {
                                 this.Field12160.add(var38.genderZeroOffset);
                              }

                              if (var38.genderZeroOffset2 > 0) {
                                 this.Field12160.add(var38.genderZeroOffset2);
                              }

                              if (var38.genderOneOffset > 0) {
                                 this.Field12160.add(var38.genderOneOffset);
                              }

                              if (var38.genderOneOffset2 > 0) {
                                 this.Field12160.add(var38.genderOneOffset2);
                              }
                           }
                        } else if (var18.startsWith("::inspectobject") && Method13320()) {
                           ObjectDefinition var36;
                           if ((var36 = ObjectDefinition.Method11938(Integer.parseInt(var18.split(" ")[1]))) == null) {
                              this.Method13334("Error, object not found");
                           } else {
                              this.Field12160.clear();
                              var24 = var36.Field10581;
                              var4 = var36.Field10581.length;

                              for(var16 = 0; var16 < var4; ++var16) {
                                 if ((var1 = var24[var16]) > 0) {
                                    this.Field12160.add(var1);
                                 }
                              }
                           }
                        } else if (var18.startsWith("::groundcolor") && Method13320()) {
                           Class501 var34;
                           if ((var34 = Field12428.Method8846(Field12379, session_player.Field4194 - 6 >> 7, session_player.Field4195 - 6 >> 7)) != null) {
                              if (var34.Field12846 != null) {
                                 System.out.println("[SquareTile]: color: " + String.format("0x%06x", Rasterizer.Field9964[var34.Field12846.Field1467]) + ", texture: " + var34.Field12846.Field1472);
                              } else if (var34.Field12847 != null) {
                                 System.out.println("[CutTile]: color: " + String.format("0x%06x", Rasterizer.Field9964[var34.Field12847.Field2180]) + ", " + var34.Field12847.Field2175[0]);
                              }
                           } else {
                              System.out.println("ground is null");
                           }
                        } else if (var18.startsWith("::gamelag") && Method13320()) {
                           //this.a_136 = !this.a_136;
                          // this.Method13334("Artificial lag: " + this.a_136);
                        } else if (var18.startsWith("::relog") && Method13320()) {
                           this.Method13312();
                        } else if (var18.startsWith("::logout") && Method13320()) {
                           this.resetForLogout();
                        } else if (var18.equals("::flushitems")) {
                           Player.aBoolean = true;
                           ItemDef.Method11904();
                           ItemDef.Field10627.Method1839();
                           ItemDef.Field10628.Method1839();
                           Class843.Field3766.Method9124(false);
                           Class843.Field3767.Method9124(false);
                           ObjectDefinition.Method11941();
                           ObjectDefinition.Method11942();
                           RSInterface.Method1836();
                        } else if (var18.equals("::flushobjects")) {
                           ObjectDefinition.Method11942();
                        } else if (!var18.equals("::flushchar") && !var18.equals("::pcs")) {
                           if (var18.equals("::flushnpcs")) {
                              NPCDefinition.Method11883();

                              for(var3 = 0; var3 < Field12328; ++var3) {
                                 Npc var15;
                                 if ((var15 = this.Field12327[this.Field12329[var3]]) != null && var15.Field4103 != null) {
                                    var15.Field4103 = NPCDefinition.Method11884(var15.Field4103.interactingEntity);
                                 }
                              }

                              this.Method13334("All npc caches flushed.");
                           } else if (var18.equals("::flushanims")) {
                              Field12076 = true;
                              this.Method13334("All animation caches flushed.");
                           } else if (var18.equals("::flushmodels")) {
                              Class838.Field6955.Method10099();
                              Method13323();
                              Class843.Field3755 = true;
                              Player.aBoolean = true;
                              this.Method13334("All model data flushed.");
                              this.Method13208();
                              this.Method13209(17);
                              ObjectDefinition.Method11941();
                              ObjectDefinition.Method11942();
                              Class586.Method8960();
                              this.Field12249 = null;
                           } else if (var18.equals("::flushtextures")) {
                              Rasterizer.resetTextures();
                              Rasterizer.Method14450();
                              Method13323();
                              this.Field12161 = true;
                              this.Method13334("All texture data flushed.");
                           } else if (var18.equals("::flushparticles")) {
                              ParticleDefinition.Method7790();
                              if (Field12226 != null) {
                                 Field12226.Method7374();
                              }

                              Player.aBoolean = true;
                           } else if (var18.equals("::groundinfo")) {
                              var3 = session_player.Field4194 - 6 >> 7;
                              var1 = session_player.Field4195 - 6 >> 7;
                              Class501 var20;
                              if ((var20 = Field12428.Method8846(Field12379, var3, var1)) == null) {
                                 System.out.println("No ground here.");
                              } else {
                                 System.out.println("Ground: " + var20.Field12853 + ", " + var20.Field12847 + ", " + var20.Field12846);
                              }
                           } else if (var18.startsWith("::interfacestructure")) {
                              var3 = Integer.parseInt(var18.split(" ")[1]);
                              System.out.println(RSInterface.Method1819(var3));
                           } else if (var18.startsWith("::framescale")) {
                              GraphicsDisplay.Method1044(Float.parseFloat(var18.split(" ")[1]));
                              this.Method13334("Client scaling factor: " + GraphicsDisplay.Method1040());
                              GraphicsDisplay.Field2684 = true;
                              initializeGL();
                           } else if (var18.equals("::test")) {
                              this.Method13334("You have an active guardian angel that prevents your death once outside of minigames or pvp zones.");
                           } else if (var18.equals("::smoothground")) {
                              Rasterizer.Field9942 = !Rasterizer.Field9942;
                              this.Method13334("Smooth ground: " + Rasterizer.Field9942);
                              this.Method13209(121);
                           } else if (!var18.startsWith("::addmodel") && !var18.startsWith("::loadmodel")) {
                              if (!var18.startsWith("::addscript") && !var18.startsWith("::loadscript")) {
                                 if (!var18.equals("::clearmodels") && !var18.equals("::clearmodel")) {
                                    if (var18.equals("::textures")) {
                                       Rasterizer.Field9948 = !Rasterizer.Field9948;
                                       this.pushMessage("Rendering with textures: " + !Rasterizer.Field9948, 2, "");
                                       this.Method13209(15);
                                       this.Field12162 = true;
                                       this.Field12163 = false;
                                    } else if (var18.equals("::colors")) {
                                       GraphicsDisplay.Field2666 = !GraphicsDisplay.Field2666;
                                       this.pushMessage("Brighter colors: " + !Rasterizer.Field9948, 2, "");
                                       this.Field12162 = true;
                                       this.Field12163 = false;
                                    } else if (!var18.equals("::rotate") || !Method13320()) {
                                       if (var18.equals("::firstperson")) {
                                          Rasterizer.Field9949 = !Rasterizer.Field9949;
                                          this.pushMessage("First person camera: " + Rasterizer.Field9949, 2, "");
                                          Player.aBoolean = true;
                                       } else if (var18.equals("::reloadshaders")) {
                                          Class745.Field3318 = true;
                                       } else if (var18.equals("::reloadmapping")) {
                                          Field12156 = new Class686();
                                       } else {
                                          if (var18.equals("::reloadinterfaces") && Method13320()) {
                                             RSFont var33 = new RSFont(true, "q8_full", this.titleJagexArchive);
                                             JagexArchive var37 = this.streamLoaderForName(3, "interface", "interface", this.expectedCRCs[3], 35);
                                             JagexArchive var29 = this.streamLoaderForName(4, "2d graphics", "media", this.expectedCRCs[4], 40);
                                             RSFont[] var21 = new RSFont[]{smallFont, plainFont, boldFont, var33};
                                             RSInterface.unpack(var37, var21, var29);
                                             throw new RuntimeException("NO INTERFACE CLOSE");
                                          }

                                          if (!var18.equals("::redirectoutput") && !var18.equals("::debugoutput")) {
                                             if (var18.equals("::reloadmap")) {
                                                this.Method13208();
                                                this.Method13209(17);
                                             } else if (var18.equals("::dumpobjectoffsets") && Method13320()) {
                                                Class567.Method8811();
                                             } else if (var18.equals("::flushmodelcache") && Method13320()) {
                                                Model.Method14474();
                                             } else if (var18.equals("::dumpcache") && Method13320()) {
                                                Class128.Method1323(this, -1);
                                             } else if (var18.equals("::dumpmap") && Method13320()) {
                                                Field12177 = true;
                                                this.Method13334("[MapDumper]: starting...");
                                                class329 = new Class329(this, true);
                                                this.Method13334("[MapDumper]: all requests sent...");
                                             } else if (var18.equals("::dumpobjects") && Method13320()) {
                                                ObjectDefinition.Field10541 = true;
                                             } else if (var18.equals("::writenpcnames") && Method13320()) {
                                                StringBuilder var32 = new StringBuilder();

                                                for(var1 = 0; var1 < NPCDefinition.NPC_ID.length; ++var1) {
                                                   try {
                                                      NPCDefinition var27 = NPCDefinition.Method11884(var1);
                                                      var4 = 0;
                                                      if (var27.Field10737 != null) {
                                                         String[] var30 = var27.Field10737;
                                                         int var26 = var27.Field10737.length;

                                                         for(int var25 = 0; var25 < var26; ++var25) {
                                                            if (var30[var25] != null) {
                                                               ++var4;
                                                            }
                                                         }
                                                      }

                                                      if (var27 == null) {
                                                         var32.append(var1 + "\t-\t0");
                                                      } else {
                                                         var32.append(var1 + "\t" + var27.Field10736 + "\t" + var27.Field10735 + "\t" + var4 + "\t" + var27.Field10744);
                                                      }

                                                      var32.append("\n");
                                                   } catch (Exception var14) {
                                                      ;
                                                   }
                                                }

                                                try {
                                                   FileWriter var35;
                                                   (var35 = new FileWriter(System.getProperty("user.home") + "/Desktop/npc names " + (normalMem ? "667" : "317") + ".txt")).write(var32.toString());
                                                   var35.close();
                                                } catch (IOException var13) {
                                                   var13.printStackTrace();
                                                }
                                             } else if (var18.equals("::unpackitems") && Method13320()) {
                                                ItemDef.Method11906(this.streamLoaderForName(2, "config", "config", this.expectedCRCs[2], 30));
                                                Player.aBoolean = true;
                                                ItemDef.Field10627.Method1839();
                                                ItemDef.Field10628.Method1839();
                                                Class843.Field3766.Method9124(false);
                                                Class843.Field3767.Method9124(false);
                                             } else if (var18.equals("::reloadanims") && Method13320()) {
                                                JagexArchive var31;
                                                Sequence.Method8280(var31 = this.streamLoaderForName(2, "config", "config", this.expectedCRCs[2], 30));
                                                SpotAnim.Method8308(var31);
                                                ParticleDefinition.Method7790();
                                                Field12059.add("Animations and gfxs reloaded.");
                                             } else if (var18.equals("::reloadidk") && Method13320()) {
                                                IdentityKit.Method11929(this.streamLoaderForName(2, "config", "config", this.expectedCRCs[2], 30));
                                             } else if (var18.equals("::reloadobjectoffsets") && Method13320()) {
                                                Class567.Method8810(this.streamLoaderForName(2, "config", "config", this.expectedCRCs[2], 30));
                                             } else if (!var18.equals("::dump")) {
                                                if (var18.equals("::devon")) {
                                                   Field12081 = true;
                                                   Field12080 = true;
                                                   this.Method13334("Developer mode: enabled");
                                                } else if (var18.equals("::devoff")) {
                                                   Field12081 = false;
                                                   Field12080 = false;
                                                   this.Method13334("Developer mode: disabled");
                                                } else if (var18.equals("::help")) {
                                                   this.pushMessage("Help needed? Visit our forum by typing ::forum!", 2, "@cr2@" + Field12129);
                                                   this.pushMessage("In need of a command list? Type ::commands", 2, "@cr2@" + Field12129);
                                                } else {
                                                   String var19;
                                                   if (var18.equals("::commands")) {
                                                      this.pushMessage("A list of commands:", 2, "@cr2@" + Field12129);
                                                      var19 = "    >";
                                                      this.pushMessage("::forum - Visit our forum", 2, var19);
                                                      this.pushMessage("::account - Your account details", 2, var19);
                                                      this.pushMessage("::purchase - Emps Credits page", 2, var19);
                                                      this.pushMessage("::pass - Change password", 2, var19);
                                                      this.pushMessage("::email - Set/Change E-Mail address", 2, var19);
                                                      this.pushMessage("::wiki - Wiki page", 2, var19);
                                                      this.pushMessage("::helpdesk - Forum helpdesk", 2, var19);
                                                      this.pushMessage("::guides - Forum guides", 2, var19);
                                                      this.pushMessage("::news - Updates and announcements", 2, var19);
                                                      this.pushMessage("::pricelist - A list of item prices", 2, var19);
                                                      this.pushMessage("::facebook - Facebook page", 2, var19);
                                                      this.pushMessage("::youtube - Youtube channel", 2, var19);
                                                      this.pushMessage("::twitter - Twitter page", 2, var19);
                                                      this.pushMessage("::events - Event schedules", 2, var19);
                                                   } else if (var18.equals("::clear")) {
                                                      for(var3 = 0; var3 < this.Field12394.length; ++var3) {
                                                         this.Field12394[var3] = 0;
                                                         this.Field12396[var3] = "";
                                                         this.Field12397[var3] = "";
                                                         this.Field12311[var3] = 0;
                                                      }
                                                   } else if (var18.equals("::cinemamode")) {
                                                      Field12120 = !Field12120;
                                                   } else if (var18.equals("::displaychar")) {
                                                      Field12119 = !Field12119;
                                                   } else if (var18.equals("::helpdesk")) {
                                                      this.openURL(Field12130 + "/forum/index.php?action=helpdesk");
                                                   } else if (var18.equals("::guides")) {
                                                      this.openURL(Field12130 + "/forum/index.php?board=20.0");
                                                   } else if (var18.equals("::events")) {
                                                      this.openURL(Field12130 + "/forum/index.php?board=40.0");
                                                   } else if (var18.equals("::rules")) {
                                                      this.openURL(Field12130 + "/forum/index.php?topic=2.0");
                                                   } else if (var18.equals("::noclip") && Method13320()) {
                                                      this.Field12093 = !this.Field12093;
                                                      this.Method13334("No clipping: " + this.Field12093);
                                                      if (this.Field12093) {
                                                         for(var3 = 0; var3 < 4; ++var3) {
                                                            for(var1 = 1; var1 < SceneGraph.mapSizeWidth - 1; ++var1) {
                                                               for(var16 = 1; var16 < SceneGraph.mapSizeWidth - 1; ++var16) {
                                                                  this.Field12655[var3].Field12868[var1][var16] = 0;
                                                               }
                                                            }
                                                         }
                                                      } else {
                                                         this.Method13209(111);
                                                      }
                                                   } else if (var18.equals(".") && !Field12270.equals("")) {
                                                      var3 = Field12490 + (session_player.Field4194 - 6 >> 7);
                                                      var1 = Field12491 + (session_player.Field4195 - 6 >> 7);
                                                      System.out.println("\t\tFIXES.put(new TileRef(" + var3 + ", " + var1 + "), " + Field12270 + ");");
                                                   } else if (var18.startsWith("::tref")) {
                                                      Field12270 = var18.replace("::tref ", "");
                                                   } else if (var18.startsWith("::writenpcemotes") && Method13320()) {
                                                      try {
                                                         NPCDefinition.Method11894();
                                                         this.Method13334("Npc emotes written.");
                                                      } catch (Exception var12) {
                                                         var12.printStackTrace();
                                                      }
                                                   } else {
                                                      String[] var22;
                                                      if ((var18.startsWith("::dumpicons") || var18.startsWith("::writeicons")) && Method13320()) {
                                                         if ((var22 = var18.split(" ")).length > 1) {
                                                            ItemDef.Field10672 = Integer.parseInt(var22[1]) * 1000 + 1;
                                                         } else {
                                                            ItemDef.Field10672 = 0;
                                                         }

                                                         ItemDef.Field10673 = 0;
                                                         Field12091 = true;
                                                         this.Method13334("Writing item atlas " + ItemDef.Field10672 / 1000 + "...");
                                                      } else if ((var18.startsWith("::dumpsqlnames") || var18.startsWith("::writesqlnames")) && Method13320()) {
                                                         if ((var22 = var18.split(" ")).length > 2) {
                                                            ItemDef.Method11927(Integer.parseInt(var22[1]), Integer.parseInt(var22[2]));
                                                         } else {
                                                            ItemDef.Method11926();
                                                         }
                                                      } else if ((var18.equals("::dumpitems") || var18.equals("::writeitems")) && Method13320()) {
                                                         try {
                                                            ItemDef.Method11922();
                                                         } catch (IOException var11) {
                                                            var11.printStackTrace();
                                                         }
                                                      } else if (var18.startsWith("::itemconfigs")) {
                                                         var1 = Integer.parseInt((var22 = var18.split(" "))[1]);
                                                         var16 = Integer.parseInt(var22[2]);
                                                         var4 = var22.length >= 4 ? Integer.parseInt(var22[3]) : 0;
                                                         if (var16 - var1 > 50000) {
                                                            this.Method13334("You must be mistakening: end-start > 50000.");
                                                         } else {
                                                            for(int var5 = var1; var5 <= var16; ++var5) {
                                                               StringBuilder var6 = new StringBuilder();
                                                               ItemDef var7;
                                                               if ((var7 = ItemDef.forID(var5)) != null && var7.Field10668 <= 0) {
                                                                  if (var4 == 0) {
                                                                     var6.append("i=" + var5 + "\t\t");
                                                                     var6.append(Method13411(var7.Field10639, 30, " ") + "\tu\t\t5000" + "\t\t\t");
                                                                     var6.append("0\t\t0\t\t0\t\t\t");
                                                                     var6.append("0\t\t0\t\t0\t\t\t");
                                                                     var6.append("0\t\t0\t\t0\t\t\t");
                                                                     var6.append("0\t\t0.2");
                                                                     System.out.println(var6.toString());
                                                                  } else if (var4 == 1) {
                                                                     ItemDef var8;
                                                                     if ((var8 = ItemDef.Method11910(var7)) == null) {
                                                                        System.err.println("[Client][ItemConfigs]: name not found: " + var7.Field10639);
                                                                     } else {
                                                                        var6.append("i=" + var5 + "\t\t");
                                                                        var6.append(var7.Field10639 + "\t\t\t\tcopy=" + var8.Field10626);
                                                                        System.out.println(var6.toString());
                                                                     }
                                                                  } else if (var4 == 2) {
                                                                     int var28 = var7.Method11925() ? 1 : 0;
                                                                     var1 = var7.Method11925() ? 1 : 0;
                                                                     var6.append("item=" + var5 + "\t\t6" + "\t\t" + var1 + "\t1" + "\t0" + "\t" + var28 + "\t" + var7.Field10639);
                                                                     System.out.println(var6.toString());
                                                                  } else if (var4 == 3) {
                                                                     var1 = (new int[]{23130, 23131, 23132, 23133})[(var5 - 23134) % 4];
                                                                     var6.append("i=" + var5 + "\t\t");
                                                                     var6.append(var7.Field10639 + "\t\t\t\tcopy=" + var1);
                                                                     System.out.println(var6.toString());
                                                                  }
                                                               }
                                                            }
                                                         }
                                                      } else if (var18.startsWith("::forum")) {
                                                         if (var18.equals("::forum")) {
                                                            this.openURL(Field12130 + "/forum");
                                                         } else if ((var22 = var18.split(" ")).length != 0) {
                                                            try {
                                                               var1 = Integer.parseInt(var22[1]);
                                                               this.Method13234(var1);
                                                            } catch (Exception var10) {
                                                               this.Method13334("Error - Enter a forum page number.");
                                                            }
                                                         }
                                                      } else if (!var18.equals("::donate") && !var18.equals("::purchase")) {
                                                         if (var18.equals("::email")) {
                                                            this.openURL(Field12130 + "/account#email");
                                                         } else if (var18.startsWith("::wiki")) {
                                                            if ((var19 = var18.length() < 7 ? "" : var18.substring(7, var18.length()).trim()).length() > 0) {
                                                               this.openURL(Field12130 + "/wiki/index.php?search=" + var19);
                                                            } else {
                                                               this.openURL(Field12130 + "/wiki");
                                                            }
                                                         } else if (var18.startsWith("::hiscores")) {
                                                            if ((var19 = var18.length() < 10 ? "" : var18.substring(10, var18.length()).trim()).length() > 0) {
                                                               this.openURL(Field12130 + "/hiscores#player," + var19);
                                                            } else {
                                                               this.openURL(Field12130 + "/hiscores");
                                                            }
                                                         } else if (!var18.equals("::twitter") && !var18.equals("::tw")) {
                                                            if (var18.equals("::news")) {
                                                               this.openURL(Field12130 + "/forum/index.php?board=35.0");
                                                            } else if (!var18.equals("::facebook") && !var18.equals("::fb")) {
                                                               if (!var18.equals("::youtube") && !var18.equals("::yt")) {
                                                                  if (!var18.equals("::pcenter") && !var18.equals("::account") && !var18.equals("::playercenter") && !var18.equals("::pc")) {
                                                                     if (!var18.equals("::pass") && !var18.equals("::password")) {
                                                                        if (!var18.equals("::tw") && !var18.equals("::twitter")) {
                                                                           if (var18.equals("::pricelist")) {
                                                                              this.openURL(Field12131 + "/wiki/Price_list");
                                                                           } else if (var18.equals("::openglinfo")) {
                                                                              GraphicsDisplay.Method997().Method998();
                                                                           } else if (!var18.startsWith("::") && !var18.startsWith("/")) {
                                                                              var19 = this.Field12360.toLowerCase();
                                                                              byte var17 = 0;
                                                                              if (var19.startsWith("yellow:")) {
                                                                                 var17 = 0;
                                                                                 this.Field12360 = this.Field12360.substring(7);
                                                                              } else if (var19.startsWith("red:")) {
                                                                                 var17 = 1;
                                                                                 this.Field12360 = this.Field12360.substring(4);
                                                                              } else if (var19.startsWith("green:")) {
                                                                                 var17 = 2;
                                                                                 this.Field12360 = this.Field12360.substring(6);
                                                                              } else if (var19.startsWith("cyan:")) {
                                                                                 var17 = 3;
                                                                                 this.Field12360 = this.Field12360.substring(5);
                                                                              } else if (var19.startsWith("purple:")) {
                                                                                 var17 = 4;
                                                                                 this.Field12360 = this.Field12360.substring(7);
                                                                              } else if (var19.startsWith("white:")) {
                                                                                 var17 = 5;
                                                                                 this.Field12360 = this.Field12360.substring(6);
                                                                              } else if (var19.startsWith("flash1:")) {
                                                                                 var17 = 6;
                                                                                 this.Field12360 = this.Field12360.substring(7);
                                                                              } else if (var19.startsWith("flash2:")) {
                                                                                 var17 = 7;
                                                                                 this.Field12360 = this.Field12360.substring(7);
                                                                              } else if (var19.startsWith("flash3:")) {
                                                                                 var17 = 8;
                                                                                 this.Field12360 = this.Field12360.substring(7);
                                                                              } else if (var19.startsWith("glow1:")) {
                                                                                 var17 = 9;
                                                                                 this.Field12360 = this.Field12360.substring(6);
                                                                              } else if (var19.startsWith("glow2:")) {
                                                                                 var17 = 10;
                                                                                 this.Field12360 = this.Field12360.substring(6);
                                                                              } else if (var19.startsWith("glow3:")) {
                                                                                 var17 = 11;
                                                                                 this.Field12360 = this.Field12360.substring(6);
                                                                              } else if (var19.startsWith("flash4:")) {
                                                                                 var17 = 12;
                                                                                 this.Field12360 = this.Field12360.substring(7);
                                                                              }

                                                                              var19 = this.Field12360.toLowerCase();
                                                                              var23 = 0;
                                                                              if (var19.startsWith("wave:")) {
                                                                                 var23 = 1;
                                                                                 this.Field12360 = this.Field12360.substring(5);
                                                                              } else if (var19.startsWith("wave2:")) {
                                                                                 var23 = 2;
                                                                                 this.Field12360 = this.Field12360.substring(6);
                                                                              } else if (var19.startsWith("shake:")) {
                                                                                 var23 = 3;
                                                                                 this.Field12360 = this.Field12360.substring(6);
                                                                              } else if (var19.startsWith("scroll:")) {
                                                                                 var23 = 4;
                                                                                 this.Field12360 = this.Field12360.substring(7);
                                                                              } else if (var19.startsWith("slide:")) {
                                                                                 var23 = 5;
                                                                                 this.Field12360 = this.Field12360.substring(6);
                                                                              }

                                                                              this.Field12630.Method14445(4);
                                                                              this.Field12630.Method388(0);
                                                                              var4 = this.Field12630.pos;
                                                                              this.Field12630.Method416(var23);
                                                                              this.Field12630.Method416(var17);
                                                                              this.aStream_834.pos = 0;
                                                                              TextInput.Method200(this.Field12360, this.aStream_834);
                                                                              this.Field12630.Method431(0, this.aStream_834.Field1259, this.aStream_834.pos);
                                                                              this.Field12630.Method14489(this.Field12630.pos - var4);
                                                                              this.Field12360 = TextInput.Method201(this.Field12360);
                                                                              session_player.C_8 = this.Field12360;
                                                                              session_player.H_5 = var17;
                                                                              session_player.ac_2 = var23;
                                                                              session_player.ag_6 = 150;
                                                                              if (myPrivilege == 2) {
                                                                                 this.pushMessage(session_player.C_8, 2, "@cr2@" + session_player.name);
                                                                              } else if (myPrivilege == 1) {
                                                                                 this.pushMessage(session_player.C_8, 2, "@cr1@" + session_player.name);
                                                                              } else if (this.publicChatMode) {
                                                                                 this.pushMessage(session_player.C_8, 2, "@irn@" + session_player.name);
                                                                              } else {
                                                                                 this.pushMessage(session_player.C_8, 2, session_player.name);
                                                                              }

                                                                              if (this.Field12702 == 2) {
                                                                                 this.Field12702 = 3;
                                                                                 this.Field12630.Method14445(95);
                                                                                 this.Field12630.Method388(this.Field12702);
                                                                                 this.Field12630.Method388(this.Field12333);
                                                                                 this.Field12630.Method388(this.Field12669);
                                                                              }
                                                                           } else {
                                                                              this.Method13321(this.Field12360);
                                                                           }
                                                                        } else {
                                                                           this.openURL("https://twitter.com/empsworld");
                                                                        }
                                                                     } else {
                                                                        this.openURL(Field12130 + "/account#password");
                                                                     }
                                                                  } else {
                                                                     this.openURL(Field12130 + "/account");
                                                                  }
                                                               } else {
                                                                  this.openURL("https://www.youtube.com/channel/UCGjJj1HUg-Plm_9FzspbeIg");
                                                               }
                                                            } else {
                                                               this.openURL("https://www.facebook.com/emps.world.official");
                                                            }
                                                         } else {
                                                            this.openURL("https://twitter.com/empsworld");
                                                         }
                                                      } else {
                                                         this.openURL(Field12130 + "/account#purchase");
                                                      }
                                                   }
                                                }
                                             }
                                          } else if (Class16.Method193()) {
                                             this.Method13334("Applciation output redirected to file.");
                                          } else {
                                             this.Method13334("Error at output redirection to file.");
                                          }
                                       }
                                    }
                                 } else {
                                    Field12157.clear();
                                    Method13323();
                                    this.Method13334("All customly loaded models cleared.");
                                 }
                              } else if (this.Field12241 == null) {
                                 (new Thread(new Class880(this))).start();
                              }
                           } else if (this.Field12158 == null) {
                              (new Thread(new Class881(this))).start();
                           }
                        } else {
                           Player.aBoolean = true;
                           NPCDefinition.Method11883();
                           ItemDef.Method11904();
                        }
                     }

                     this.Field12360 = "";
                     Field12649 = true;
                  }
               } else {
                  if (var1 == 32 && !this.Field12585 && this.Field12227) {
                     this.Field12634[this.Field12575] = "";
                     this.Field12550[this.Field12575] = 679;
                     this.Field12548[this.Field12575] = 0;
                     this.Method13314(this.Field12575);
                     this.Field12227 = false;
                  }

                  if (var1 >= 49 && var1 <= 50 && !this.Field12585 && this.Field12228) {
                     this.Field12634[this.Field12575] = "";
                     this.Field12550[this.Field12575] = 315;
                     this.Field12548[this.Field12575] = var1 == 49 ? 2461 : 2462;
                     this.Method13314(this.Field12575);
                     this.Field12228 = false;
                  }

                  if (var1 >= 49 && var1 <= 51 && !this.Field12585 && this.Field12229) {
                     this.Field12634[this.Field12575] = "";
                     this.Field12550[this.Field12575] = 315;
                     this.Field12548[this.Field12575] = 2471 + (var1 - 49);
                     this.Method13314(this.Field12575);
                     this.Field12229 = false;
                  }

                  if (var1 >= 49 && var1 <= 52 && !this.Field12585 && this.Field12230) {
                     this.Field12634[this.Field12575] = "";
                     this.Field12550[this.Field12575] = 315;
                     this.Field12548[this.Field12575] = var1 + 2433;
                     this.Method13314(this.Field12575);
                     this.Field12230 = false;
                  }

                  if (var1 >= 49 && var1 <= 53 && !this.Field12585 && this.Field12231) {
                     this.Field12634[this.Field12575] = "";
                     this.Field12550[this.Field12575] = 315;
                     this.Field12548[this.Field12575] = var1 + 2445;
                     this.Method13314(this.Field12575);
                     this.Field12231 = false;
                  }
               }
            } else {
               if (var1 >= 32 && var1 <= 256 && this.Field12639.length() < 80) {
                  if ((this.Field12521 <= 0 || this.Field12521 > 2) && (this.Field12521 < 4 || this.Field12521 > 6) && this.Field12521 != 8) {
                     this.Field12639 = this.Field12639 + (char)var1;
                  } else if (this.Field12639.length() < 12) {
                     this.Field12639 = this.Field12639 + (char)var1;
                  }

                  Field12649 = true;
               }

               if (var1 == 8 && this.Field12639.length() > 0) {
                  this.Field12639 = this.Field12639.substring(0, this.Field12639.length() - 1);
                  Field12649 = true;
                  if (this.Field12650 == 3) {
                     this.Field12139 = true;
                  }
               }

               if (var1 == 13 || var1 == 10) {
                  if (this.Field12650 != 3 && this.Field12650 != 4) {
                     this.Field12676 = false;
                     Field12649 = true;
                     long var2;
                     if (this.Field12521 == 1) {
                        var2 = Class23.nameToLong(this.Field12639);
                        this.Method13276(var2);
                     }

                     if (this.Field12521 == 2 && this.Field12370 > 0) {
                        var2 = Class23.nameToLong(this.Field12639);
                        this.Method13272(var2);
                     }

                     if (this.Field12521 == 3 && this.Field12639.length() > 0) {
                        this.Field12630.Method14445(126);
                        this.Field12630.Method388(0);
                        var16 = this.Field12630.pos;
                        this.Field12630.Method394(this.Field12435);
                        TextInput.Method200(this.Field12639, this.Field12630);
                        this.Field12630.Method14489(this.Field12630.pos - var16);
                        this.Field12639 = TextInput.Method201(this.Field12639);
                        this.pushMessage(this.Field12639, 6, Class23.Method207(Class23.Method203(this.Field12435)));
                        if (this.Field12333 == 2) {
                           this.Field12333 = 1;
                           this.Field12630.Method14445(95);
                           this.Field12630.Method388(this.Field12702);
                           this.Field12630.Method388(this.Field12333);
                           this.Field12630.Method388(this.Field12669);
                        }
                     }

                     if (this.Field12521 == 4 && this.user_ignore_count < 100) {
                        var2 = Class23.nameToLong(this.Field12639);
                        this.Method13370(var2);
                     }

                     if (this.Field12521 == 5 && this.user_ignore_count > 0) {
                        var2 = Class23.nameToLong(this.Field12639);
                        this.Method13377(var2);
                     }

                     if (this.Field12521 == 6) {
                        var2 = Class23.nameToLong(this.Field12639);
                        this.Method13318(var2);
                     }

                     if (this.Field12521 == 8) {
                        var2 = Class23.nameToLong(this.Field12639);
                        this.Method13319(var2);
                     }
                  } else {
                     this.Field12639 = "";
                     this.Field12139 = true;
                     this.Field12676 = false;
                     this.Field12650 = 0;
                     Field12545 = 0;
                  }
               }
            }
         }
      }

   }

   private static void Method13323() {
      Model.Method14474();
      Player.aBoolean = true;
      NPCDefinition.Field10763.Method1512();
      ItemDef.Field10627.Method1839();
      ItemDef.Field10628.Method1839();
      ObjectDefinition.Method11942();
      SpotAnim.Field10107.Method1839();
      Class843.Field3755 = true;
      ObjectDefinition.Method11941();
      NPCDefinition.Method11890();
   }

   private void Method13324(int var1) {
      int var2 = 0;

      for(int var3 = 0; var3 < 512; ++var3) {
         if (this.Field12397[var3] != null && this.Field12312 == 1) {
            int var4 = this.Field12394[var3];
            String var5 = this.Field12396[var3];
            int var6;
            if ((var6 = 70 - var2 * 14 + 42 + Field12545 + 4 + 7) < -19) {
               break;
            }

            if (var5 != null && var5.startsWith("@cr1@")) {
               var5 = var5.substring(5);
            } else if (var5 != null && var5.startsWith("@cr2@")) {
               var5 = var5.substring(5);
            } else if (var5 != null && var5.startsWith("@cr3@")) {
               var5 = var5.substring(5);
            } else if (var5 != null && var5.startsWith("@irn@")) {
               var5 = var5.substring(5);
            }

            if ((var4 == 1 || var4 == 2) && (var4 == 1 || this.Field12702 == 0 || this.Field12702 == 1)) {
               if (var1 > var6 - 14 && var1 <= var6 && !var5.equals(session_player.name)) {
                  if (myPrivilege > 0) {
                     this.Field12634[this.Field12575] = "Report abuse @whi@" + var5;
                     this.Field12550[this.Field12575] = 606;
                     ++this.Field12575;
                  }

                  this.Field12634[this.Field12575] = "Add ignore @whi@" + var5;
                  this.Field12550[this.Field12575] = 42;
                  ++this.Field12575;
                  this.Field12634[this.Field12575] = "Add friend @whi@" + var5;
                  this.Field12550[this.Field12575] = 337;
                  ++this.Field12575;
                  this.Field12634[this.Field12575] = "Message @whi@" + var5;
                  this.Field12550[this.Field12575] = 639;
                  ++this.Field12575;
               }

               ++var2;
            }
         }
      }

   }

   private void Method13325(int var1) {
      int var2 = 0;

      for(int var3 = 0; var3 < 512; ++var3) {
         if (this.Field12397[var3] != null) {
            int var4 = this.Field12394[var3];
            String var5 = this.Field12396[var3];
            int var6;
            if ((var6 = 70 - var2 * 14 + 42 + Field12545 + 4 + 7) < -19) {
               break;
            }

            if (var5 != null && var5.startsWith("@cr1@")) {
               var5 = var5.substring(5);
            } else if (var5 != null && var5.startsWith("@cr2@")) {
               var5 = var5.substring(5);
            } else if (var5 != null && var5.startsWith("@cr3@")) {
               var5 = var5.substring(5);
            } else if (var5 != null && var5.startsWith("@irn@")) {
               var5 = var5.substring(5);
            }

            if (var4 == 16) {
               if (var1 > var6 - 14 && var1 <= var6 && !var5.equals(session_player.name)) {
                  if (myPrivilege > 0) {
                     this.Field12634[this.Field12575] = "Report abuse @whi@" + var5;
                     this.Field12550[this.Field12575] = 606;
                     ++this.Field12575;
                  }

                  this.Field12634[this.Field12575] = "Add ignore @whi@" + var5;
                  this.Field12550[this.Field12575] = 42;
                  ++this.Field12575;
                  this.Field12634[this.Field12575] = "Add friend @whi@" + var5;
                  this.Field12550[this.Field12575] = 337;
                  ++this.Field12575;
                  this.Field12634[this.Field12575] = "Message @whi@" + var5;
                  this.Field12550[this.Field12575] = 639;
                  ++this.Field12575;
               }

               ++var2;
            }
         }
      }

   }

   private void buildChatAreaMenu(int var1) {
      int var2 = 0;

      for(int var3 = 0; var3 < 512; ++var3) {
         if (this.Field12397[var3] != null && this.Field12312 == 2) {
            int var4 = this.Field12394[var3];
            String var5 = this.Field12396[var3];
            int var6;
            if ((var6 = 70 - var2 * 14 + 42 + Field12545 + 4 + 7) < -19) {
               break;
            }

            if (var5 != null && var5.startsWith("@cr1@")) {
               var5 = var5.substring(5);
            } else if (var5 != null && var5.startsWith("@cr2@")) {
               var5 = var5.substring(5);
            } else if (var5 != null && var5.startsWith("@cr3@")) {
               var5 = var5.substring(5);
            } else if (var5 != null && var5.startsWith("@irn@")) {
               var5 = var5.substring(5);
            }

            if ((var4 == 5 || var4 == 6) && (this.Field12632 == 0 || this.Field12312 == 2) && (var4 == 6 || this.Field12333 == 0 || this.Field12333 == 1 && this.Method13365(var5))) {
               ++var2;
            }

            if ((var4 == 3 || var4 == 7) && (this.Field12632 == 0 || this.Field12312 == 2) && (var4 == 7 || this.Field12333 == 0 || this.Field12333 == 1 && this.Method13365(var5))) {
               if (var1 > var6 - 14 && var1 <= var6) {
                  if (myPrivilege > 0) {
                     this.Field12634[this.Field12575] = "Report abuse @whi@" + var5;
                     this.Field12550[this.Field12575] = 606;
                     ++this.Field12575;
                  }

                  this.Field12634[this.Field12575] = "Add ignore @whi@" + var5;
                  this.Field12550[this.Field12575] = 42;
                  ++this.Field12575;
                  this.Field12634[this.Field12575] = "Add friend @whi@" + var5;
                  this.Field12550[this.Field12575] = 337;
                  ++this.Field12575;
                  this.Field12634[this.Field12575] = "Message @whi@" + var5;
                  this.Field12550[this.Field12575] = 639;
                  ++this.Field12575;
               }

               ++var2;
            }
         }
      }

   }

   private void buildDuelInterface(int var1) {
      int var2 = 0;

      for(int var3 = 0; var3 < 512; ++var3) {
         if (this.Field12397[var3] != null && (this.Field12312 == 3 || this.Field12312 == 4)) {
            int var4 = this.Field12394[var3];
            String var5 = this.Field12396[var3];
            int var6;
            if ((var6 = 70 - var2 * 14 + 42 + Field12545 + 4 + 7) < -19) {
               break;
            }

            if (var5 != null && var5.startsWith("@cr1@")) {
               var5 = var5.substring(5);
            } else if (var5 != null && var5.startsWith("@cr2@")) {
               var5 = var5.substring(5);
            } else if (var5 != null && var5.startsWith("@cr3@")) {
               var5 = var5.substring(5);
            } else if (var5 != null && var5.startsWith("@irn@")) {
               var5 = var5.substring(5);
            }

            if (var4 == 4 && (this.Field12669 == 0 || this.Field12669 == 1 && this.Method13365(var5))) {
               if (var1 > var6 - 14 && var1 <= var6) {
                  this.Field12634[this.Field12575] = "Accept trade @whi@" + var5;
                  this.Field12550[this.Field12575] = 484;
                  ++this.Field12575;
               }

               ++var2;
            }

            if (var4 == 8 && (this.Field12669 == 0 || this.Field12669 == 1 && this.Method13365(var5))) {
               if (var1 > var6 - 14 && var1 <= var6) {
                  this.Field12634[this.Field12575] = "Accept challenge @whi@" + var5;
                  this.Field12550[this.Field12575] = 6;
                  ++this.Field12575;
               }

               ++var2;
            }

            if (var4 == 12) {
               if (var1 > var6 - 14 && var1 <= var6) {
                  this.Field12634[this.Field12575] = "Go-to @blu@" + var5;
                  this.Field12550[this.Field12575] = 915;
                  ++this.Field12575;
               }

               ++var2;
            }
         }
      }

   }

   private void buildShopMenu(int var1) {
      int var2 = 0;
      if (GraphicsDisplay.Field2678 && !Field12712) {
         var1 += 12;
      }

      int var3;
      int var4;
      if (this.Field12650 == 4) {
         for(var3 = 0; var3 < this.Field12215 && (var4 = 70 - var2 * 14 + 42 + Field12545 + 4 + 7) >= -19; ++var3) {
            if (var1 > var4 - 14 && var1 <= var4) {
               this.Field12216 = var3;
               String var5 = this.Field12398[var3];
               int var6 = this.Field12426[var3];
               if (this.openInterfaceID == 40300) {
                  char var11 = '鵭';
                  var6 = var6;
                  var5 = var5;
                  Client var13 = this;
                  int[] var7 = new int[]{632, 78, 867, 53};
                  String[] var8 = new String[]{"1", "5", "10", "X"};

                  for(int var9 = 3; var9 >= 0; --var9) {
                     var13.Field12634[var13.Field12575] = "Add " + var8[var9] + " @lre@" + var5;
                     var13.Field12550[var13.Field12575] = var7[var9];
                     var13.Field12548[var13.Field12575] = 40301;
                     var13.Field12547[var13.Field12575] = -1;
                     var13.Field12551[var13.Field12575] = var6;
                     ++var13.Field12575;
                  }
               } else {
                  String var10;
                  if (this.Field12143 == 0) {
                     var10 = "Buy";
                  } else if (this.Field12143 == 1) {
                     var10 = "Show";
                  } else {
                     var10 = "Select";
                  }

                  this.Field12634[this.Field12575] = var10 + " @lre@" + var5;
                  this.Field12550[this.Field12575] = 632;
                  this.Field12548[this.Field12575] = 32600;
                  this.Field12547[this.Field12575] = 0;
                  this.Field12551[this.Field12575] = var6;
                  ++this.Field12575;
               }
            }

            ++var2;
         }
      }

      if (this.Field12650 == 0) {
         var3 = 0;

         while(true) {
            label222: {
               if (var3 < 512) {
                  if (this.Field12397[var3] == null) {
                     break label222;
                  }

                  var4 = this.Field12394[var3];
                  int var12;
                  if ((var12 = 70 - var2 * 14 + 42 + Field12545 + 4 + 7) >= -19) {
                     String var14 = this.Field12396[var3];
                     if (this.Field12312 == 1) {
                        this.Method13324(var1);
                        return;
                     }

                     if (this.Field12312 == 2) {
                        this.buildChatAreaMenu(var1);
                        return;
                     }

                     if (this.Field12312 == 3 || this.Field12312 == 4) {
                        this.buildDuelInterface(var1);
                        return;
                     }

                     if (this.Field12312 == 11) {
                        this.Method13325(var1);
                        return;
                     }

                     if (this.Field12312 != 5) {
                        if (var14 != null && var14.startsWith("@cr1@")) {
                           var14 = var14.substring(5);
                        }

                        if (var14 != null && var14.startsWith("@cr2@")) {
                           var14 = var14.substring(5);
                        }

                        if (var14 != null && var14.startsWith("@cr3@")) {
                           var14 = var14.substring(5);
                        }

                        if (var14 != null && var14.startsWith("@irn@")) {
                           var14 = var14.substring(5);
                        }

                        if (var4 == 0) {
                           ++var2;
                        }

                        if ((var4 == 1 || var4 == 2 || var4 == 16) && (var4 == 1 || this.Field12702 == 0 || this.Field12702 == 1 && this.Method13365(var14))) {
                           if (var1 > var12 - 14 && var1 <= var12 && !var14.equals(session_player.name) && !var14.equals("Clan-Bot")) {
                              if (myPrivilege > 0) {
                                 this.Field12634[this.Field12575] = "Report abuse @whi@" + var14;
                                 this.Field12550[this.Field12575] = 606;
                                 ++this.Field12575;
                              }

                              this.Field12634[this.Field12575] = "Add ignore @whi@" + var14;
                              this.Field12550[this.Field12575] = 42;
                              ++this.Field12575;
                              this.Field12634[this.Field12575] = "Add friend @whi@" + var14;
                              this.Field12550[this.Field12575] = 337;
                              ++this.Field12575;
                              this.Field12634[this.Field12575] = "Message @whi@" + var14;
                              this.Field12550[this.Field12575] = 639;
                              ++this.Field12575;
                           }

                           ++var2;
                        }

                        if ((var4 == 3 || var4 == 7) && this.Field12632 == 0 && (var4 == 7 || this.Field12333 == 0 || this.Field12333 == 1 && this.Method13365(var14))) {
                           if (var1 > var12 - 14 && var1 <= var12) {
                              if (myPrivilege > 0) {
                                 this.Field12634[this.Field12575] = "Report abuse @whi@" + var14;
                                 this.Field12550[this.Field12575] = 606;
                                 ++this.Field12575;
                              }

                              this.Field12634[this.Field12575] = "Add ignore @whi@" + var14;
                              this.Field12550[this.Field12575] = 42;
                              ++this.Field12575;
                              this.Field12634[this.Field12575] = "Add friend @whi@" + var14;
                              this.Field12550[this.Field12575] = 337;
                              ++this.Field12575;
                              this.Field12634[this.Field12575] = "Reply to @whi@" + var14;
                              this.Field12550[this.Field12575] = 639;
                              ++this.Field12575;
                           }

                           ++var2;
                        }

                        if (var4 == 4 && (this.Field12669 == 0 || this.Field12669 == 1 && this.Method13365(var14))) {
                           if (var1 > var12 - 14 && var1 <= var12) {
                              this.Field12634[this.Field12575] = "Accept trade @whi@" + var14;
                              this.Field12550[this.Field12575] = 484;
                              ++this.Field12575;
                           }

                           ++var2;
                        }

                        if ((var4 == 5 || var4 == 6) && this.Field12632 == 0 && this.Field12333 < 2) {
                           ++var2;
                        }

                        if (var4 == 8 && (this.Field12669 == 0 || this.Field12669 == 1 && this.Method13365(var14))) {
                           if (var1 > var12 - 14 && var1 <= var12) {
                              this.Field12634[this.Field12575] = "Accept challenge @whi@" + var14;
                              this.Field12550[this.Field12575] = 6;
                              ++this.Field12575;
                           }

                           ++var2;
                        }

                        if (var4 == 9) {
                           if (var1 > var12 - 14 && var1 <= var12) {
                              this.Field12634[this.Field12575] = "Go-to @lre@" + var14;
                              this.Field12550[this.Field12575] = 927;
                              ++this.Field12575;
                           }

                           ++var2;
                        }
                        break label222;
                     }
                  }
               }

               return;
            }

            ++var3;
         }
      }
   }

   private void interface_handle_auto_content(RSInterface var1) {
      int var2 = var1.Field12751;
      if (var1.Field12751 > 0 && var2 <= 100 || var2 >= 701 && var2 <= 800) {
         if (var2 == 1 && this.Field12371 == 0) {
            var1.Field12792 = "Loading friend list";
            var1.Field12754 = 0;
         } else if (var2 == 1 && this.Field12371 == 1) {
            var1.Field12792 = "Connecting to friendserver";
            var1.Field12754 = 0;
         } else if (var2 == 2 && this.Field12371 != 2) {
            var1.Field12792 = "Please wait...";
            var1.Field12754 = 0;
         } else {
            if (var2 > 700) {
               var2 -= 601;
            } else {
               --var2;
            }

            if (this.Field12371 == 2 && this.Players[var2] != null && this.Players[var2] != "" && var2 < this.Field12370) {
               var1.Field12792 = this.Players[var2];
               var1.Field12754 = 1;
            } else {
               var1.Field12792 = "";
               var1.Field12754 = 0;
            }
         }
      } else {
         int var3;
         if ((var2 < 101 || var2 > 200) && (var2 < 801 || var2 > 900)) {
            if (var2 == 203) {
               var3 = this.Field12370;
               if (this.Field12371 != 2) {
                  var3 = 0;
               }

               var1.Field12804 = var3 * 15 + 20;
               if (var1.Field12804 <= var1.Field12811) {
                  var1.Field12804 = var1.Field12811 + 1;
               }

            } else if (var2 >= 401 && var2 <= 500) {
               var2 -= 401;
               if (var2 == 0 && this.Field12371 == 0) {
                  var1.Field12792 = "Loading ignore list";
                  var1.Field12754 = 0;
               } else if (var2 == 1 && this.Field12371 == 0) {
                  var1.Field12792 = "Please wait...";
                  var1.Field12754 = 0;
               } else {
                  var3 = this.user_ignore_count;
                  if (this.Field12371 == 0) {
                     var3 = 0;
                  }

                  if (var2 >= var3) {
                     var1.Field12792 = "";
                     var1.Field12754 = 0;
                  } else {
                     var1.Field12792 = Class23.Method207(Class23.Method203(this.user_ignore_names[var2]));
                     var1.Field12754 = 1;
                  }
               }
            } else if (var2 == 503) {
               var1.Field12804 = this.user_ignore_count * 15 + 20;
               if (var1.Field12804 <= var1.Field12811) {
                  var1.Field12804 = var1.Field12811 + 1;
               }

            } else if (var2 == 327) {
               var1.Field12814 = 120;
               var1.Field12815 = (int)(Math.sin((double) currentTime / 40.0D) * 256.0D) & 2047;

               for(var3 = 0; var3 < 7; ++var3) {
                  if ((var2 = this.Field12523[var3]) >= 0 && !IdentityKit.cache[var2].Method11930()) {
                     return;
                  }
               }

               if (var1.Method1815() == null || this.Field12522) {
                  this.Field12522 = false;
                  var3 = 0;
                  Model[] var9 = new Model[7];
                  int var10 = 0;
                  Model[] var5 = new Model[2];

                  for(int var6 = 0; var6 < 7; ++var6) {
                     int var7;
                     if ((var7 = this.Field12523[var6]) >= 0) {
                        var9[var3++] = IdentityKit.cache[var7].isBodyDownloadedOverload();
                        if (var6 <= 1) {
                           var5[var10++] = IdentityKit.cache[var7].isBodyDownloaded();
                        }
                     }
                  }

                  Model var11 = new Model(var3, var9);
                  Model var12 = new Model(var10, var5);

                  for(var2 = 0; var2 < 5; ++var2) {
                     if (this.Field12460[var2] != 0) {
                        var3 = this.Field12460[var2];
                        var11.recolor(Field12468[var2][0], Field12468[var2][var3]);
                        var12.recolor(Field12468[var2][0], Field12468[var2][var3]);
                        if (var2 == 1 && var3 < skinColours.length) {
                           var11.recolor(skinColours[0], skinColours[var3]);
                           var12.recolor(skinColours[0], skinColours[var3]);
                           var11.recolor(25485, Field12468[var2][var3]);
                        }

                        if (var2 == 4) {
                           var11.recolor(4540, Field12468[var2][this.Field12460[var2]]);
                        }
                     }
                  }

                  var11.Method14482();
                  var11.Method14502(84, 1000, -90, -580, -90, true);
                  RSInterface.Method1818(false, var11, 5);
                  var12.Method14482();
                  var12.Method14502(84, 1000, -90, -580, -90, true);
                  RSInterface.Method1818(false, var12, 7);
               }

               var1.Field12772 = 5;
               var1.Field12773 = 0;
            } else if (var2 == 328) {
               var2 = (int)(Math.sin((double) currentTime / 40.0D) * 256.0D) & 2047;
               var1.Field12814 = 120;
               var1.Field12815 = var2;
            } else if (var2 == 324) {
               if (this.Field12386 == null) {
                  this.Field12386 = var1.Field12745;
                  this.Field12387 = var1.Field12803;
               }

               if (this.Field12503) {
                  var1.Field12745 = this.Field12387;
               } else {
                  var1.Field12745 = this.Field12386;
               }
            } else if (var2 == 325) {
               if (this.Field12386 == null) {
                  this.Field12386 = var1.Field12745;
                  this.Field12387 = var1.Field12803;
               }

               if (this.Field12503) {
                  var1.Field12745 = this.Field12386;
               } else {
                  var1.Field12745 = this.Field12387;
               }
            } else if (var2 == 600) {
               var1.Field12792 = this.Field12356;
               if (currentTime % 20 < 10) {
                  var1.Field12792 = var1.Field12792 + "|";
               } else {
                  var1.Field12792 = var1.Field12792 + " ";
               }
            } else {
               if (var2 == 613) {
                  if (myPrivilege > 0) {
                     var1.Field12771 = 16777215;
                     var1.Field12792 = "Change moderator option";
                  } else {
                     var1.Field12792 = "";
                  }
               }

               if (var2 == 612) {
                  if (myPrivilege > 0) {
                     var1.Field12771 = 16777215;
                     var1.Field12792 = "Change period";
                  } else {
                     var1.Field12792 = "";
                  }
               }

               String var8;
               if (var2 == 650 || var2 == 655) {
                  if (this.Field12631 != 0) {
                     if (this.Field12471 == 0) {
                        var8 = "earlier today";
                     } else if (this.Field12471 == 1) {
                        var8 = "yesterday";
                     } else {
                        var8 = this.Field12471 + " days ago";
                     }

                     var1.Field12792 = "You last logged in " + var8 + " from: " + Signlink.Field2964;
                  } else {
                     var1.Field12792 = "";
                  }
               }

               if (var2 == 651) {
                  if (this.Field12591 == 0) {
                     var1.Field12792 = "0 unread messages";
                     var1.Field12771 = 16776960;
                  }

                  if (this.Field12591 == 1) {
                     var1.Field12792 = "1 unread message";
                     var1.Field12771 = 65280;
                  }

                  if (this.Field12591 > 1) {
                     var1.Field12792 = this.Field12591 + " unread messages";
                     var1.Field12771 = 65280;
                  }
               }

               if (var2 == 652) {
                  if (this.Field12607 == 201) {
                     if (this.Field12563 == 1) {
                        var1.Field12792 = "@yel@This is a non-members world: @whi@Since you are a member we";
                     } else {
                        var1.Field12792 = "";
                     }
                  } else if (this.Field12607 == 200) {
                     var1.Field12792 = "You have not yet set any password recovery questions.";
                  } else {
                     if (this.Field12607 == 0) {
                        var8 = "Earlier today";
                     } else if (this.Field12607 == 1) {
                        var8 = "Yesterday";
                     } else {
                        var8 = this.Field12607 + " days ago";
                     }

                     var1.Field12792 = var8 + " you changed your recovery questions";
                  }
               }

               if (var2 == 653) {
                  if (this.Field12607 == 201) {
                     if (this.Field12563 == 1) {
                        var1.Field12792 = "@whi@recommend you use a members world instead. You may use";
                     } else {
                        var1.Field12792 = "";
                     }
                  } else if (this.Field12607 == 200) {
                     var1.Field12792 = "We strongly recommend you do so now to secure your account.";
                  } else {
                     var1.Field12792 = "If you do not remember making this change then cancel it immediately";
                  }
               }

               if (var2 == 654) {
                  if (this.Field12607 == 201) {
                     if (this.Field12563 == 1) {
                        var1.Field12792 = "@whi@this world but member benefits are unavailable whilst here.";
                        return;
                     }

                     var1.Field12792 = "";
                     return;
                  }

                  if (this.Field12607 == 200) {
                     var1.Field12792 = "Do this from the 'account management' area on our front webpage";
                     return;
                  }

                  var1.Field12792 = "Do this from the 'account management' area on our front webpage";
               }

            }
         } else {
            var3 = this.Field12370;
            if (this.Field12371 != 2) {
               var3 = 0;
            }

            if (var2 > 800) {
               var2 -= 701;
            } else {
               var2 -= 101;
            }

            if (var2 >= var3) {
               var1.Field12792 = "";
               var1.Field12754 = 0;
            } else {
               if (this.Field12323[var2] != 0 && this.Field12323[var2] >= 8) {
                  var1.Field12792 = "@gre@Online";
                  var2 = this.Field12323[var2] - 9;
                  String var4 = "@yel@";
                  if (this.Field12212 == var2) {
                     var4 = "@gre@";
                  }

                  var1.Field12792 = var4 + "World " + var2;
               } else {
                  var1.Field12792 = "@red@Offline";
               }

               var1.Field12754 = 1;
            }
         }
      }
   }

   private static int Method13330() {
      int var0;
      if ((var0 = height / 100) < 5) {
         var0 = 5;
      }

      return var0;
   }

   private void Method13331() {
      if (this.Field12632 != 0) {
         int var1 = Method13330();
         RSFont var2 = plainFont;
         int var3 = 0;
         if (this.Field12561 != 0.0F) {
            var3 = 1;
         }

         for(int var4 = 0; var4 < 512; ++var4) {
            if (this.Field12397[var4] != null) {
               int var5 = this.Field12394[var4];
               String var6 = this.Field12396[var4];
               byte var7 = 0;
               if (var6 != null && var6.startsWith("@cr1@")) {
                  var6 = var6.substring(5);
                  var7 = 1;
               } else if (var6 != null && var6.startsWith("@cr2@")) {
                  var6 = var6.substring(5);
                  var7 = 2;
               } else if (var6 != null && var6.startsWith("@irn@")) {
                  var6 = var6.substring(5);
                  var7 = 4;
               }

               int var8;
               if ((var5 == 3 || var5 == 7) && (var5 == 7 || this.Field12333 == 0 || this.Field12333 == 1 && this.Method13365(var6))) {
                  var8 = 329 - var3 * 13 + Field12715;
                  var2.Method9453(0, "From", var8, 4);
                  var2.Method9453(65535, "From", var8 - 1, 4);
                  int var9 = 4 + var2.Method9451("From ");
                  if (var7 == 1) {
                     this.Field12178[0].Method14495(var9, var8 - 12);
                     var9 += 12;
                  } else if (var7 == 2) {
                     this.Field12178[1].Method14495(var9, var8 - 12);
                     var9 += 12;
                  } else if (var7 == 4) {
                     this.Field12178[2].Method14495(var9, var8 - 12);
                     var9 += 12;
                  }

                  var2.Method9453(0, var6 + ": " + this.Field12397[var4], var8, var9);
                  var2.Method9453(65535, var6 + ": " + this.Field12397[var4], var8 - 1, var9);
                  ++var3;
                  if (var3 >= var1) {
                     return;
                  }
               }

               if (var5 == 5 && this.Field12333 < 2) {
                  var8 = 329 - var3 * 13 + Field12715;
                  var2.Method9453(0, this.Field12397[var4], var8, 4);
                  var2.Method9453(65535, this.Field12397[var4], var8 - 1, 4);
                  ++var3;
                  if (var3 >= var1) {
                     return;
                  }
               }

               if (var5 == 6 && this.Field12333 < 2) {
                  var8 = 329 - var3 * 13 + Field12715;
                  var2.Method9453(0, "To " + var6 + ": " + this.Field12397[var4], var8, 4);
                  var2.Method9453(65535, "To " + var6 + ": " + this.Field12397[var4], var8 - 1, 4);
                  ++var3;
                  if (var3 >= var1) {
                     return;
                  }
               }
            }
         }

      }
   }

   private void Method13332(String var1, int var2, String var3, int var4, String var5) {
      byte var6;
      if (var4 != 1 && var4 != 2) {
         if (var4 == 250) {
            var6 = 4;
         } else if (var4 >= 4) {
            var6 = 2;
         } else {
            var6 = 0;
         }
      } else {
         var6 = 1;
      }

      if (this.Field12693 == -1) {
         Field12649 = true;
      }

      for(var2 = 511; var2 > 0; --var2) {
         this.Field12394[var2] = this.Field12394[var2 - 1];
         this.Field12395[var2] = this.Field12395[var2 - 1];
         this.Field12396[var2] = this.Field12396[var2 - 1];
         this.Field12397[var2] = this.Field12397[var2 - 1];
         this.Field12311[var2] = this.Field12311[var2 - 1];
      }

      this.Field12395[0] = var5;
      this.Field12394[0] = 16;
      this.Field12396[0] = Class23.Method207(var3);
      this.Field12397[0] = var1;
      this.Field12311[0] = var6;
      this.Method13333();
   }

   private void Method13333() {
      if (Field12545 != 0 && this.Field12650 == 0) {
         boolean var1 = false;
         if (this.Field12312 == 0) {
            var1 = true;
         }

         if (var1) {
            Field12545 += 14;
         }
      }

   }

   private void Method13334(String var1) {
      this.pushMessage(var1, 0, "");
   }

   private void pushMessage(String var1, int var2, String var3) {
      this.Method13336(var1, var2, var3, true);
   }

   private void Method13336(String var1, int var2, String var3, boolean var4) {
      if (!Field12593) {
         this.Field12286.add(new Class663(super.mouseEventX, super.mouseEventY - 30, Method13212(var1, 200, plainFont), 2500L));
      } else {
         if (var2 == 0 && this.Field12500 != -1) {
            this.Field12332 = var1;
            super.mouseButtonPressed = 0;
         }

         String[] var8;
         String var9;
         if (var1.length() >= 50 && var4 && (var8 = Method13212(var1, 428, plainFont).split("\n")).length > 1) {
            String[] var6 = var8;
            int var5 = var8.length;

            for(int var7 = 0; var7 < var5; ++var7) {
               var9 = var6[var7];
               this.Method13336(var9, var2, var3, false);
            }

         } else {
            var9 = var3.replace("@cr1@", "").replace("@cr2@", "").replace("@irn@", "");
            if ((var2 == 7 || var2 == 3) && (this.Field12333 == 0 || this.Field12333 == 1 && this.Method13365(var9))) {
               this.Field12150 = var9;
            }

            if (this.Field12693 == -1) {
               Field12649 = true;
            }

            for(int var10 = 511; var10 > 0; --var10) {
               this.Field12394[var10] = this.Field12394[var10 - 1];
               this.Field12395[var10] = this.Field12395[var10 - 1];
               this.Field12396[var10] = this.Field12396[var10 - 1];
               this.Field12397[var10] = this.Field12397[var10 - 1];
               this.Field12311[var10] = this.Field12311[var10 - 1];
            }

            this.Field12395[0] = null;
            this.Field12394[0] = var2;
            this.Field12396[0] = var3;
            this.Field12397[0] = var1;
            this.Field12311[0] = 0;
            this.Method13333();
         }
      }
   }

   private void Method13337() {
      if (this.Field12606 == null) {
         this.Field12562 = null;
         this.Field12606 = Method13410(519, 165, this.j());
         this.Field12602 = Method13410(246, 335, this.j());
         this.Field12603 = Method13410(246, 174, this.j());
         Class697.Method14445(0);
         if (Field12712) {
            this.Field12604 = Method13409(width, height, this.j());
         } else {
            this.Field12604 = Method13409(512, 334, this.j());
         }

         Class697.Method14445(0);
         this.Field12675 = true;
      }
   }

   private void Method13338() {
      if (this.Field12542 == 0) {
         this.Field12634[0] = "Cancel";
         this.Field12550[0] = 1107;
         this.Field12575 = 1;
         if (this.Field12098) {
            this.Method13315("Rest", 169, -1, 155, false);
            this.Method13315(this.Method13232() ? "Walk" : "Run", 169, -1, 152, false);
         }

         if (this.Field12706 != -1) {
            this.Field12359 = 0;
            this.Field12709 = 0;
            this.Method13265(8, RSInterface.Field12749[this.Field12706], super.mouseEventX, 8, super.mouseEventY, 0);
            if (this.Field12359 != this.Field12487) {
               this.Field12487 = this.Field12359;
            }

            if (this.Field12708 != 0) {
               this.Field12708 = 0;
            }

         } else {
            Client var1 = this;
            int var2;
            if (this.Field12632 != 0) {
               var2 = Method13330();
               int var3 = 0;
               if (this.Field12561 != 0.0F) {
                  var3 = 1;
               }

               for(int var4 = 0; var4 < 512; ++var4) {
                  if (var1.Field12397[var4] != null) {
                     int var5 = var1.Field12394[var4];
                     String var6;
                     if ((var6 = var1.Field12396[var4]) != null && var6.startsWith("@cr1@")) {
                        var6 = var6.substring(5);
                     }

                     if (var6 != null && var6.startsWith("@cr2@")) {
                        var6 = var6.substring(5);
                     }

                     if (var6 != null && var6.startsWith("@irn@")) {
                        var6 = var6.substring(5);
                     }

                     if ((var5 == 3 || var5 == 7) && (var5 == 7 || var1.Field12333 == 0 || var1.Field12333 == 1 && var1.Method13365(var6))) {
                        int var7 = 329 - var3 * 13 + Field12715;
                        if (var1.mouseEventX > 4 && var1.mouseEventY - 4 > var7 - 16 && var1.mouseEventY - 4 <= var7 - 5) {
                           if ((var7 = plainFont.Method9451("From:  " + var6 + var1.Field12397[var4]) + 25) > 450) {
                              var7 = 450;
                           }

                           if (var1.mouseEventX < var7 + 4) {
                              if (myPrivilege > 0) {
                                 var1.Field12634[var1.Field12575] = "Report abuse @whi@" + var6;
                                 var1.Field12550[var1.Field12575] = 2606;
                                 ++var1.Field12575;
                              }

                              var1.Field12634[var1.Field12575] = "Add ignore @whi@" + var6;
                              var1.Field12550[var1.Field12575] = 2042;
                              ++var1.Field12575;
                              var1.Field12634[var1.Field12575] = "Add friend @whi@" + var6;
                              var1.Field12550[var1.Field12575] = 2337;
                              ++var1.Field12575;
                              var1.Field12634[var1.Field12575] = "Reply to @whi@" + var6;
                              var1.Field12550[var1.Field12575] = 2639;
                              ++var1.Field12575;
                           }
                        }

                        ++var3;
                        if (var3 >= var2) {
                           break;
                        }
                     }

                     if ((var5 == 5 || var5 == 6) && var1.Field12333 < 2) {
                        ++var3;
                        if (var3 >= var2) {
                           break;
                        }
                     }
                  }
               }
            }

            this.Field12359 = 0;
            this.Field12709 = 0;
            short var8 = 156;
            if (this.Field12646 == 14) {
               var8 = 429;
            }

            if ((super.mouseEventX > 0 && super.mouseEventY > 0 && super.mouseEventX < 516 + Field12714 && super.mouseEventY < 338 + Field12715 || super.mouseEventX > 517 && super.mouseEventX < 554 + Field12714 && super.mouseEventY < 338 + Field12715 || super.mouseEventX > 516 + Field12714 && super.mouseEventY > 338 + Field12715 && super.mouseEventX < 554 + Field12714 && super.mouseEventY < 338 + Field12715 + 88 || super.mouseEventX > 517 && super.mouseEventY > 338 + Field12715 && super.mouseEventX < 520 + Field12714 || super.mouseEventX > 516 + Field12714 && super.mouseEventY > 0 && super.mouseEventY < Field12715 + var8) && (super.mouseEventX <= 530 + Field12714 || super.mouseEventY <= 45 || super.mouseEventX >= 610 + Field12714 || super.mouseEventY >= 154) && (super.mouseEventX <= 568 + Field12714 || super.mouseEventY <= 4 || super.mouseEventX >= 618 + Field12714 || super.mouseEventY >= 54) && (super.mouseEventX <= 585 + Field12714 || super.mouseEventY <= 4 || super.mouseEventX >= 743 + Field12714 || super.mouseEventY >= 166) && (this.openInterfaceID == -1 || !this.Method13265(4, RSInterface.Field12749[this.openInterfaceID], super.mouseEventX, 4, super.mouseEventY, 0))) {
               this.Method13316();
               this.Field12221.clear();
            }

            if (this.Field12359 != this.Field12487) {
               this.Field12487 = this.Field12359;
            }

            if (this.Field12708 != 0) {
               this.Field12708 = 0;
            }

            this.Field12359 = 0;
            this.Field12709 = 0;
            if (!Field12712) {
               Field12714 = -20;
               Field12715 = 32;
               if (super.mouseEventX > 516 && super.mouseEventY > 167) {
                  Field12714 += 8;
                  Field12715 += 8;
               }
            }

            if (super.mouseEventX > 560 + Field12714 && super.mouseEventY > 165 + Field12715 && super.mouseEventX < 752 + Field12714 && super.mouseEventY < 426 + Field12715) {
               if (this.Field12629 != -1) {
                  this.Method13265(560 + Field12714, RSInterface.Field12749[this.Field12629], super.mouseEventX, 165 + Field12715, super.mouseEventY, 0);
               } else if (this.Field12573[this.Field12646] != -1) {
                  this.Method13265(560 + Field12714, RSInterface.Field12749[this.Field12573[this.Field12646]], super.mouseEventX, 165 + Field12715, super.mouseEventY, 0);
               }
            }

            if (!Field12712) {
               Field12715 = 0;
               Field12714 = 0;
            }

            if (this.Field12359 != this.Field12504) {
               this.Field12560 = true;
               this.Field12504 = this.Field12359;
            }

            if (this.Field12707 != 0) {
               this.Field12560 = true;
               this.Field12707 = 0;
            }

            this.Field12359 = 0;
            this.Field12709 = 0;
            if (super.mouseEventX > 0 && super.mouseEventY > 334 + Field12715 && super.mouseEventX < 490 && super.mouseEventY < 459 + Field12715) {
               if (this.Field12693 != -1) {
                  this.Method13265(20, RSInterface.Field12749[this.Field12693], super.mouseEventX - 4, 354 + Field12715, super.mouseEventY - 4, 0);
               } else if (super.mouseEventY < 459 + Field12715 && super.mouseEventX < 490) {
                  this.buildShopMenu(super.mouseEventY - (334 + Field12715));
               }
            }

            if (this.Field12693 != -1 && this.Field12359 != this.Field12499) {
               Field12649 = true;
               this.Field12499 = this.Field12359;
            }

            if (this.Field12693 != -1 && this.Field12710 != 0) {
               Field12649 = true;
               this.Field12710 = 0;
            }

            if (super.mouseEventX > 4 && super.mouseEventY > 475 + Field12715 && super.mouseEventX < 516 && super.mouseEventY < 503 + Field12715) {
               var2 = Field12712 ? Field12715 - 3 : -3;
               if (super.mouseEventX >= 5 && super.mouseEventX <= 61 && super.mouseEventY >= var2 + 482 && super.mouseEventY <= var2 + 505) {
                  this.Field12634[1] = "View All";
                  this.Field12550[1] = 999;
                  this.Field12575 = 2;
               } else if (super.mouseEventX >= 71 && super.mouseEventX <= 127 && super.mouseEventY >= var2 + 482 && super.mouseEventY <= var2 + 505) {
                  this.Field12634[1] = "View Game";
                  this.Field12550[1] = 998;
                  this.Field12575 = 2;
               } else if (super.mouseEventX >= 137 && super.mouseEventX <= 193 && super.mouseEventY >= var2 + 482 && super.mouseEventY <= var2 + 505) {
                  this.Field12634[1] = "Hide public";
                  this.Field12550[1] = 997;
                  this.Field12634[2] = "Off public";
                  this.Field12550[2] = 996;
                  this.Field12634[3] = "Friends public";
                  this.Field12550[3] = 995;
                  this.Field12634[4] = "On public";
                  this.Field12550[4] = 994;
                  this.Field12634[5] = "View public";
                  this.Field12550[5] = 993;
                  this.Field12575 = 6;
               } else if (super.mouseEventX >= 203 && super.mouseEventX <= 259 && super.mouseEventY >= var2 + 482 && super.mouseEventY <= var2 + 505) {
                  this.Field12634[1] = "Off private";
                  this.Field12550[1] = 992;
                  this.Field12634[2] = "Friends private";
                  this.Field12550[2] = 991;
                  this.Field12634[3] = "On private";
                  this.Field12550[3] = 990;
                  this.Field12634[4] = "View private";
                  this.Field12550[4] = 989;
                  this.Field12575 = 5;
               } else if (super.mouseEventX >= 269 && super.mouseEventX <= 325 && super.mouseEventY >= var2 + 482 && super.mouseEventY <= var2 + 505) {
                  this.Field12634[1] = "Off clan chat";
                  this.Field12550[1] = 1003;
                  this.Field12634[2] = "Friends clan chat";
                  this.Field12550[2] = 1002;
                  this.Field12634[3] = "On clan chat";
                  this.Field12550[3] = 1001;
                  this.Field12634[4] = "View clan chat";
                  this.Field12550[4] = 1000;
                  this.Field12575 = 5;
               } else if (super.mouseEventX >= 335 && super.mouseEventX <= 391 && super.mouseEventY >= var2 + 482 && super.mouseEventY <= var2 + 505) {
                  this.Field12634[1] = "Off trade";
                  this.Field12550[1] = 987;
                  this.Field12634[2] = "Friends trade";
                  this.Field12550[2] = 986;
                  this.Field12634[3] = "On trade";
                  this.Field12550[3] = 985;
                  this.Field12634[4] = "View trade";
                  this.Field12550[4] = 984;
                  this.Field12575 = 5;
               }
            }

            boolean var9 = false;

            while(!var9) {
               var9 = true;

               for(var2 = 0; var2 < this.Field12575 - 1; ++var2) {
                  if (this.Field12550[var2] < 1000 && this.Field12550[var2 + 1] > 1000) {
                     String var10 = this.Field12634[var2];
                     this.Field12634[var2] = this.Field12634[var2 + 1];
                     this.Field12634[var2 + 1] = var10;
                     int var11 = this.Field12550[var2];
                     this.Field12550[var2] = this.Field12550[var2 + 1];
                     this.Field12550[var2 + 1] = var11;
                     var11 = this.Field12547[var2];
                     this.Field12547[var2] = this.Field12547[var2 + 1];
                     this.Field12547[var2 + 1] = var11;
                     var11 = this.Field12548[var2];
                     this.Field12548[var2] = this.Field12548[var2 + 1];
                     this.Field12548[var2 + 1] = var11;
                     var11 = this.Field12549[var2];
                     this.Field12549[var2] = this.Field12549[var2 + 1];
                     this.Field12549[var2 + 1] = var11;
                     var11 = this.Field12551[var2];
                     this.Field12551[var2] = this.Field12551[var2 + 1];
                     this.Field12551[var2 + 1] = var11;
                     long var12 = this.Field12552[var2];
                     this.Field12552[var2] = this.Field12552[var2 + 1];
                     this.Field12552[var2 + 1] = var12;
                     var9 = false;
                  }
               }
            }

         }
      }
   }

   private void Method13339(String var1, String var2) {
      if (!Field12272) {
         this.myUsername = var1.trim();
         this.Field12612 = var2.trim();
         if (this.myUsername.length() <= 0) {
            this.Field12684 = "";
            this.Field12685 = "Username field is empty.";
         } else if (this.Field12612.length() <= 0) {
            this.Field12684 = "";
            this.Field12685 = "Password field is empty.";
         } else {
            this.Field12613 = false;
            Field12272 = true;
         }
      }
   }

   private void Method13340() {
      super.clickX = -1;
      super.clickY = -1;
      super.mouseEventX = -1;
      super.mouseEventY = -1;
      this.Field12376 = 0;
      SceneGraph.Field971 = -1;
      SceneGraph.Field972 = -1;
      SceneGraph.Field973 = 0;
      this.Field12259 = SceneGraph.Field971;
      this.Field12260 = SceneGraph.Field972;
      this.Field12259 = -1;
      this.Field12261 = System.currentTimeMillis();
      this.Field12092 = 0;
      this.Field12645 = 0L;
      this.mouseDetection.Field3629 = 0;
      super.awtFocus = true;
      this.Field12436 = true;
      int var1;
      if (Field12134 == 0) {
         Field12134 = 200000;
         this.Method13402(1.0D);
         var1 = Field12134;
         Field12134 = 0;
         this.Method13402(1.0D);
         int var2 = Field12134;
         var2 = (var1 - var2 + 1000) / 2;
         Field12134 = var1 - var2;
         if (GraphicsDisplay.Field2678) {
            GraphicsDisplay.Method997().Field2685 = true;
         }
      }

      Field12490 = 0;
      Field12491 = 0;
      Field12492 = 0;
      Field12493 = 0;
      Field12497 = 0;
      Field12498 = 0;
      this.Field12630.pos = 0;
      this.Field12473 = -1;
      this.Field12330 = -1;
      this.Field12331 = -1;
      this.Field12472 = 0;
      this.Field12561 = 0.0F;
      this.Field12474 = 0;
      this.Field12339 = 0;
      this.Field12575 = 0;
      this.Field12358 = false;
      this.Field12697 = 0;
      this.Field12577 = 0;
      Field12483 = 0;
      this.Field12519 = 0;
      this.Field12482 = 0;
      this.Field12456 = -1;
      Field12679 = 0;
      Field12680 = 0;
      session_player_count = 0;
      Field12328 = 0;

      for(var1 = 0; var1 < this.Field12361; ++var1) {
         this.session_players[var1] = null;
         this.Field12368[var1] = null;
      }

      for(var1 = 0; var1 < 16384; ++var1) {
         this.Field12327[var1] = null;
      }

      (session_player = this.session_players[this.Field12362] = new Player()).Field4181 = true;
      session_player.a(52, 52, true);
      Field12494 = 0;
      Field12495 = 0;
      this.Field12511.clear();
      this.Field12512.clear();
      this.Field12222.clear();
      this.Field12371 = 0;
      this.Field12370 = 0;
      this.Field12500 = -1;
      this.Field12693 = -1;
      this.openInterfaceID = -1;
      this.Field12479 = -1;
      this.Field12480 = -1;
      this.Field12629 = -1;
      this.Field12285.clear();
      this.Field12479 = -1;
      this.Field12585 = false;
      this.Field12646 = 3;
      this.Field12647 = 3;
      this.Field12650 = 0;
      this.Field12358 = false;
      this.Field12676 = false;
      this.Field12332 = null;
      this.Field12510 = 0;
      this.Field12509 = -1;
      this.Field12503 = true;
      this.Method13282();

      for(var1 = 0; var1 < 5; ++var1) {
         this.Field12460[var1] = 0;
      }

      for(var1 = 0; var1 < 5; ++var1) {
         this.Field12570[var1] = null;
         this.Field12571[var1] = false;
      }

      Field12615 = 0;
      Field12576 = 0;
      Field12457 = 0;
      Field12703 = 0;
      Field12381 = 0;
      Field12651 = 0;
      this.Method13337();
      this.Field12614 = "";
      this.Field12151 = "";
      this.Field12684 = "";
      this.Field12685 = "";
      this.Field12686 = "";
      this.Field12152 = false;
      this.Field12170 = null;
      Field12173 = null;
      this.Field12164 = false;
      Field12593 = true;
      this.Field12203 = true;
      if (class329 != null) {
         class329.clear();
      }

      if (GraphicsDisplay.Field2678 && this.Field12418 != null) {
         this.Field12418.Field9893 = null;
         this.Field12418 = null;
         System.gc();
      }

      SceneGraph.Field928 = Field12117;
      if (GraphicsDisplay.Field2678) {
         GraphicsDisplay.Method997().Field2685 = true;
      }

   }

   private void Method13341(int var1) {
      myPrivilege = var1;
      if (var1 == 250) {
         myPrivilege = 0;
         this.publicChatMode = true;
      } else {
         this.publicChatMode = false;
      }
   }

   private void Method13342(String var1, String var2, boolean var3) {
      while(System.currentTimeMillis() - this.Field12273 < 7000L) {
         this.Field12684 = "";
         this.Field12685 = "Connecting to server...";
         this.Field12686 = "";

         try {
            Thread.sleep(100L);
         } catch (InterruptedException var33) {
            var33.printStackTrace();
         }
      }

      this.Field12273 = System.currentTimeMillis();
      this.Field12254 = 0;
      Field12483 = 0;
      Field12251 = false;
      Field12219 = null;
      Signlink.Field2967 = var1;

      try {
         if (!var3) {
            this.Field12684 = "";
            this.Field12685 = "Connecting to server...";
            this.Field12686 = "";
         }

         String var4 = this.Field12211;
         if (var4.startsWith("#")) {
            if (var4.contains(":")) {
               String[] var9;
               Field12704 = (var9 = var4.replace("#", "").split(":"))[0];
               this.Field12213 = Integer.parseInt(var9[1]);
               System.out.println("IP: " + Field12704 + ":" + this.Field12213);
            } else {
               Field12704 = var4.replace("#", "");
               this.Field12213 = 43594;
               System.out.println("IP: " + Field12704 + ":" + this.Field12213);
            }
         } else {
            int var48;
            try {
               var48 = Integer.parseInt(var4);
            } catch (Exception var32) {
               var48 = 1;
            }

            if (var48 == 1) {
               this.Field12213 = 43594;
               Field12704 = "164.132.204.42";
            } else if (var48 == 2) {
               this.Field12213 = 43595;
               Field12704 = "164.132.204.42";
            } else if (var48 == 3) {
               this.Field12213 = 43596;
               Field12704 = "164.132.204.42";
            } else if (var48 == 14) {
               var48 = 1;
               this.Field12213 = 43594;
               Field12704 = "localhost";
            } else if (var48 == 15) {
               var48 = 2;
               this.Field12213 = 43595;
               Field12704 = "localhost";
            } else {
               var48 = 1;
               this.Field12213 = 43594;
               Field12704 = "164.132.204.42";
            }

            this.Field12212 = var48;
         }

         if (this.Field12608 != null) {
            try {
               this.Field12608.Method11824();
            } catch (Exception var31) {
               var31.printStackTrace();
            }

            this.Field12608 = null;
         }

         int[] var43 = new int[]{this.Field12213};
         if (this.Field12212 == 1) {
            var43 = new int[]{this.Field12213, 23};
         } else if (this.Field12212 == 2) {
            var43 = new int[]{this.Field12213, 24};
         }

         boolean var40 = false;
         int[] var8 = var43;
         int var7 = var43.length;

         int var44;
         for(int var6 = 0; var6 < var7; ++var6) {
            var44 = var8[var6];
            boolean var24 = false;

            label745: {
               label746: {
                  try {
                     var24 = true;
                     System.out.println("connect: " + Field12704 + ":" + var44);
                     Socket var51;
                     (var51 = new Socket()).setTcpNoDelay(true);
                     var51.setKeepAlive(true);
                     var51.connect(new InetSocketAddress(Field12704, var44), 60000);
                     this.Field12608 = new Class55(this, var51);
                     var40 = true;
                     var24 = false;
                     break;
                  } catch (ConnectException var34) {
                     var34.printStackTrace();
                     this.Field12684 = "Unable to reach " + Field12129 + ".";
                     this.Field12685 = "Server appears to be offline.";
                     var24 = false;
                     break label746;
                  } catch (SocketException | UnknownHostException var35) {
                     var35.printStackTrace();
                     this.Field12684 = "Unable to reach " + Field12129 + ".";
                     this.Field12685 = "Not connected to the Internet.";
                     var24 = false;
                  } catch (Exception var36) {
                     var36.printStackTrace();
                     var24 = false;
                     break label745;
                  } finally {
                     if (var24) {
                        if (this.Field12608 != null) {
                           try {
                              this.Field12608.Method11824();
                           } catch (Exception var25) {
                              ;
                           }

                           this.Field12608 = null;
                        }

                     }
                  }

                  if (this.Field12608 != null) {
                     try {
                        this.Field12608.Method11824();
                     } catch (Exception var27) {
                        ;
                     }

                     this.Field12608 = null;
                  }

                  return;
               }

               if (this.Field12608 != null) {
                  try {
                     this.Field12608.Method11824();
                  } catch (Exception var26) {
                     ;
                  }

                  this.Field12608 = null;
               }

               return;
            }

            if (this.Field12608 != null) {
               try {
                  this.Field12608.Method11824();
               } catch (Exception var30) {
                  ;
               }

               this.Field12608 = null;
            }
         }

         if (!var40) {
            this.Field12684 = "Unable to reach " + Field12129 + ".";
            this.Field12685 = "Server offline";
         } else {
            this.Field12630.pos = 0;
            this.Field12630.Method388(14);
            this.Field12630.Method388(0);
            this.Field12630.Method388(0);
            this.Field12608.Method374(2, this.Field12630.Field1259);

            for(var44 = 0; var44 < 8; ++var44) {
               this.Field12608.Method11953();
            }

            if ((var44 = this.Field12608.Method11953()) == 0) {
               Packet var45 = new Packet(new byte[16]);
               this.Field12608.Method373(var45.Field1259, 8);
               var45.pos = 0;
               this.Field12642 = var45.Method405();
               (var8 = new int[4])[0] = (int)(Math.random() * 9.9999999E7D);
               var8[1] = (int)(Math.random() * 9.9999999E7D);
               var8[2] = (int)(this.Field12642 >> 32);
               var8[3] = (int)this.Field12642;
               this.Field12630.pos = 0;
               this.Field12630.Method388(10);
               this.Field12630.Method14480(var8[0]);
               this.Field12630.Method14480(var8[1]);
               this.Field12630.Method14480(var8[2]);
               this.Field12630.Method14480(var8[3]);
               this.Field12630.Method14480(Signlink.Field2955);
               this.Field12630.Method394(Signlink.Field2953.getMostSignificantBits());
               this.Field12630.Method394(Signlink.Field2953.getLeastSignificantBits());
               this.Field12630.Method14480(Signlink.Field2954.size());

               byte[] var41;
               for(var44 = 0; var44 < Signlink.Field2954.size(); ++var44) {
                  var41 = (byte[]) Signlink.Field2954.get(var44);
                  this.Field12630.Method14480(var41.length);
                  this.Field12630.Method396(var41, var41.length, 0);
               }

               Packet var49 = this.Field12630;
               int var42 = this.Field12630.pos;
               var49.pos = 0;
               byte[] var52 = new byte[var42];
               var49.Method408(var42, 0, var52);
               var41 = (new BigInteger(var52)).toByteArray();
               var49.pos = 0;
               var49.Method388(var41.length);
               var49.Method396(var41, var41.length, 0);
               this.Field12334.pos = 0;
               if (var3) {
                  this.Field12334.Method388(18);
               } else {
                  this.Field12334.Method388(16);
               }

               this.Field12334.Method388(this.Field12630.pos + 36 + 1 + 1 + 2);
               byte[] var50 = null;
               if (Field12116) {
                  var50 = Field12100.Method13191(var1 + "___" + var2);
               }

               this.Field12334.Method388(2);
               this.Field12334.Method14470(Field12060);
               this.Field12334.Method388(7);
               this.Field12334.Method14470(Field12116 ? var50.length : 178);
               this.Field12334.Method14470(412);
               this.Field12334.Method388(0);

               for(var42 = 0; var42 < 9; ++var42) {
                  this.Field12334.Method14480(this.expectedCRCs[var42]);
               }

               if (!Field12116) {
                  this.Field12630.Method395(var1);
                  this.Field12630.Method395(var2);
               } else {
                  this.Field12630.Method395("u");
                  this.Field12630.Method395("p");
                  this.Field12630.Method397(var50);
               }

               this.Field12334.Method396(this.Field12630.Field1259, this.Field12630.pos, 0);
               this.Field12630.Field1263 = new Class778(var8);

               for(var42 = 0; var42 < 4; ++var42) {
                  var8[var42] += 50;
               }

               this.Field12466 = new Class778(var8);
               this.Field12608.Method374(this.Field12334.pos, this.Field12334.Field1259);
               var44 = this.Field12608.Method11953();
            }

            if (var44 == 1) {
               try {
                  Thread.sleep(500L);
               } catch (Exception var28) {
                  ;
               }

               this.Method13342(var1, var2, var3);
            } else {
               if (var44 == 2) {
                  this.Field12236 = 0;
                  this.Method13341(this.Field12608.Method11953());
                  this.Field12608.Method11953();
                  if (Field12588) {
                     Signlink.Method11836();
                  }

                  this.Method13340();
               }

               this.Field12236 = 0;
               if (var44 == 3) {
                  this.Field12684 = "";
                  if (this.Field12152) {
                     this.Field12685 = "This username has already been taken.";
                  } else {
                     this.Field12685 = "Invalid username or password.";
                  }
               } else if (var44 == 4) {
                  Packet var47 = new Packet(new byte[512]);
                  this.Field12608.Method371(var47.Field1259, 2);
                  var47.pos = 0;
                  var44 = var47.sg2();
                  this.Field12608.Method371(var47.Field1259, var44);
                  var47.pos = 0;
                  byte[] var46 = new byte[var47.sg2()];
                  var47.Method409(var46);
                  var4 = new String(var46, Packet.Field1256);
                  var46 = new byte[var47.sg2()];
                  var47.Method409(var46);
                  var1 = new String(var46, Packet.Field1256);
                  int var39;
                  var2 = (var39 = var47.Method429()) > 0 ? (var39 == 1 ? "for 1 day" : "for " + var39 + " days") : "forever";
                  var1 = var1.contains("$uid") ? "computer" : "account";
                  this.Field12684 = "Your " + var1 + " is banned " + var2 + "!";
                  this.Field12685 = "Reason: " + var4;
                  this.Field12686 = Method13212(this.Field12684 + " " + this.Field12685, 240, boldFont);
                  if (this.Field12686.split("\n").length <= 2) {
                     this.Field12686 = "";
                  }

               } else if (var44 == 5) {
                  this.Field12684 = "Your account is already logged in.";
                  this.Field12685 = "Try again in 60 secs...";
               } else if (var44 == 6) {
                  this.Field12684 = Field12129 + " has been updated!";
                  this.Field12685 = "Please restart your game.";
               } else if (var44 == 7) {
                  this.Field12684 = "This world is full.";
                  this.Field12685 = "Please use a different world.";
               } else if (var44 == 8) {
                  this.Field12684 = "Unable to connect.";
                  this.Field12685 = "Login server offline.";
               } else if (var44 == 9) {
                  this.Field12684 = "Login limit exceeded.";
                  this.Field12685 = "Too many connections from your address.";
               } else if (var44 == 10) {
                  this.Field12684 = "Unable to connect.";
                  this.Field12685 = "Unallowed uuid.";
               } else if (var44 == 11) {
                  this.Field12684 = "Login server rejected session.";
                  this.Field12685 = "Please try again.";
               } else if (var44 == 12) {
                  this.Field12684 = "You need a members account to login to this world.";
                  this.Field12685 = "Please subscribe, or use a different world.";
               } else if (var44 == 13) {
                  this.Field12684 = "Could not complete login.";
                  this.Field12685 = "Please try using a different world.";
               } else if (var44 == 14) {
                  this.Field12684 = "The server is being updated.";
                  this.Field12685 = "Please wait 1 minute and try again.";
               } else if (var44 == 15) {
                  Field12593 = true;
                  this.Field12630.pos = 0;
                  this.Field12473 = -1;
                  this.Field12330 = -1;
                  this.Field12331 = -1;
                  this.Field12472 = 0;
                  this.Field12561 = 0.0F;
                  this.Field12575 = 0;
                  this.Field12358 = false;
               } else if (var44 == 16) {
                  this.Field12684 = "Login attempts exceeded.";
                  this.Field12685 = "Please wait 1 minute and try again.";
               } else if (var44 == 17) {
                  this.Field12684 = "You are standing in a members-only area.";
                  this.Field12685 = "To play on this world move to a free area first";
               } else if (var44 == 20) {
                  this.Field12684 = "Invalid loginserver requested";
                  this.Field12685 = "Please try using a different world.";
               } else if (var44 == 22) {
                  this.Field12684 = "Your account has been temporarily banned!";
                  this.Field12685 = "This ban lasts for 1 up to 4 days.";
               } else if (var44 != 21) {
                  if (var44 == 23) {
                     this.Field12684 = "This account does not exist.";
                     this.Field12685 = "Please register first.";
                  } else if (var44 == -1) {
                     this.Field12684 = "Unable to establish a connection";
                     this.Field12685 = "Please try again later";
                  } else {
                     this.Field12684 = "";
                     this.Field12685 = "Unexpected response: " + var44;
                  }
               } else {
                  for(var7 = this.Field12608.Method11953(); var7 >= 0; --var7) {
                     this.Field12684 = "You have only just left another world";
                     this.Field12685 = "Your profile will be transferred in: " + var7 + " seconds";

                     try {
                        Thread.sleep(1000L);
                     } catch (Exception var29) {
                        ;
                     }
                  }

                  this.Method13342(var1, var2, var3);
               }
            }
         }
      } catch (Exception var38) {
         var38.printStackTrace();
         String var5;
         if ((var5 = var38.getMessage()) == null) {
            var5 = "unable to establish a connection";
         }

         this.Field12684 = "Error - " + var5;
         this.Field12685 = "Are you connected to the internet?";
      }
   }

   private boolean Method13343(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, boolean var11, int var12) {
      return this.Method13346(2, 0, 1, 0, var6, 1, 0, var9, var10, false, var12);
   }

   private boolean Method13344(long var1, int var3, int var4, int var5) {
      int var2;
      int var12;
      if ((var12 = Field12428.Method8878(Field12379, var4, var3, var1)) == -1) {
         var2 = 10;
         var12 = 0;
      } else {
         var2 = var12 & 31;
         var12 = var12 >> 6 & 3;
      }

      if (var2 != 10 && var2 != 11 && var2 != 22) {
         this.Method13346(2, var12, 0, var2 + 1, session_player.x_13[0], 0, 0, var3, session_player.w_14[0], false, var4);
      } else {
         ObjectDefinition var13 = ObjectDefinition.Method11938(var5);
         int var6;
         int var7;
         if (var12 != 0 && var12 != 2) {
            var6 = var13.Field10570;
            var7 = var13.Field10556;
         } else {
            var6 = var13.Field10556;
            var7 = var13.Field10570;
         }

         var2 = var13.Field10578;
         if (var12 != 0) {
            var2 = (var2 << var12 & 15) + (var2 >> 4 - var12);
         }

         int var8 = session_player.Field4194 - 6 >> 7;
         int var9 = session_player.Field4195 - 6 >> 7;
         int var10 = Field12490 + var4;
         int var11 = Field12491 + var3;
         if (var5 == 43526) {
            var3 -= 2;
         } else if (var5 == 2283) {
            var3 += 2;
         } else if (var5 == 25274) {
            ++var4;
         } else if (var5 == 42859) {
            ++var3;
         } else if (var5 == 3566) {
            if (var12 == 0) {
               var3 += 2;
            } else if (var12 == 2) {
               var3 -= 2;
            } else if (var12 == 1) {
               var4 += 2;
            } else if (var12 == 3) {
               var4 -= 2;
            }
         } else if (var5 == 26299) {
            if (var10 == 2872 && var11 == 5277) {
               ++var3;
            }
         } else if (var5 == 5949 || var5 == 5948) {
            if (var12 != 0 && var12 != 2) {
               if (var8 > var4) {
                  ++var4;
               } else if (var8 < var4) {
                  --var4;
               }
            } else if (var9 > var3) {
               ++var3;
            } else if (var9 < var3) {
               --var3;
            }
         }

         this.Method13346(2, 0, var7, 0, session_player.x_13[0], var6, var2, var3, session_player.w_14[0], false, var4);
      }

      this.Field12374 = super.clickX;
      this.Field12375 = super.clickY;
      this.Field12378 = 2;
      this.Field12376 = 0;
      return true;
   }

   private boolean Method13345(Npc var1) {
      byte var2 = 1;
      byte var3 = 1;
      if (var1.Field4103 != null) {
         var2 = var1.Field4103.Field10740;
         var3 = var1.Field4103.Field10740;
         if (var1.Field4103.interactingEntity == 1419) {
            var2 = 2;
            var3 = 1;
         } else if (var1.Field4103.interactingEntity == 2240) {
            var2 = 1;
            var3 = -1;
         } else if (var1.Field4103.interactingEntity == 2241) {
            var2 = -1;
            var3 = 1;
         } else if (var1.Field4103.interactingEntity == 2593) {
            var2 = 1;
            var3 = 2;
         }
      }

      boolean var4;
      if (!(var4 = this.Method13346(2, 0, var3, 0, session_player.x_13[0], var2, 0, var1.x_13[0], session_player.w_14[0], false, var1.w_14[0]))) {
         if (var1.E_7 == 511) {
            var2 = -2;
            var3 = 1;
         } else if (var1.E_7 == 1023) {
            var2 = 1;
            var3 = 2;
         } else if (var1.E_7 == 1537) {
            var2 = 2;
            var3 = 1;
         } else if (var1.E_7 == 0) {
            var2 = 1;
            var3 = -2;
         }

         var4 = this.Method13346(2, 0, var3, 0, session_player.x_13[0], var2, 0, var1.x_13[0], session_player.w_14[0], false, var1.w_14[0]);
      }

      return var4;
   }

   private boolean Method13346(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, boolean var10, int var11) {
      if (var9 < SceneGraph.mapSizeWidth && var5 < SceneGraph.mapSizeWidth && var9 >= 0 && var5 >= 0) {
         if (var11 < SceneGraph.mapSizeWidth && var8 < SceneGraph.mapSizeWidth && var11 >= 0 && var8 >= 0) {
            this.Method13239(false);
            if (this.Field12521 != 3) {
               this.Field12676 = false;
            }

            Client var19 = this;

            for(int var20 = 0; var20 < SceneGraph.mapSizeWidth; ++var20) {
               for(int var21 = 0; var21 < SceneGraph.mapSizeWidth; ++var21) {
                  var19.Field12372[var20][var21] = 0;
                  var19.Field12322[var20][var21] = 99999999;
               }
            }

            this.Field12147 = false;
            int var12 = var9;
            int var13 = var5;
            if (var9 >= 0 && var5 >= 0 && var9 <= SceneGraph.mapSizeWidth && var5 <= SceneGraph.mapSizeWidth) {
               this.Field12372[var9][var5] = 99;
               this.Field12322[var9][var5] = 0;
               byte var14 = 0;
               int var15 = 0;
               this.Field12695[0] = var9;
               int var27 = var14 + 1;
               this.Field12696[0] = var5;
               boolean var16 = false;
               int var17 = this.Field12695.length;
               int[][] var18 = this.Field12655[Field12379].Field12868;

               int var30;
               while(var15 != var27) {
                  var12 = this.Field12695[var15];
                  var13 = this.Field12696[var15];
                  var15 = (var15 + 1) % var17;
                  if (var12 == var11 && var13 == var8) {
                     var16 = true;
                     break;
                  }

                  int var23;
                  Class504 var29;
                  if (var4 != 0) {
                     Class504 var10000;
                     int var24;
                     boolean var31;
                     if (var4 < 5 || var4 == 10) {
                        var10000 = this.Field12655[Field12379];
                        var24 = var4 - 1;
                        var29 = var10000;
                        if (var12 == var11 && var13 == var8) {
                           var31 = true;
                        } else {
                           label781: {
                              if (var24 == 0) {
                                 if (var2 == 0) {
                                    if (var12 == var11 - 1 && var13 == var8) {
                                       var31 = true;
                                       break label781;
                                    }

                                    if (var12 == var11 && var13 == var8 + 1 && (var29.Field12868[var12][var13] & 19398944) == 0) {
                                       var31 = true;
                                       break label781;
                                    }

                                    if (var12 == var11 && var13 == var8 - 1 && (var29.Field12868[var12][var13] & 19398914) == 0) {
                                       var31 = true;
                                       break label781;
                                    }
                                 } else if (var2 == 1) {
                                    if (var12 == var11 && var13 == var8 + 1) {
                                       var31 = true;
                                       break label781;
                                    }

                                    if (var12 == var11 - 1 && var13 == var8 && (var29.Field12868[var12][var13] & 19398920) == 0) {
                                       var31 = true;
                                       break label781;
                                    }

                                    if (var12 == var11 + 1 && var13 == var8 && (var29.Field12868[var12][var13] & 19399040) == 0) {
                                       var31 = true;
                                       break label781;
                                    }
                                 } else if (var2 == 2) {
                                    if (var12 == var11 + 1 && var13 == var8) {
                                       var31 = true;
                                       break label781;
                                    }

                                    if (var12 == var11 && var13 == var8 + 1 && (var29.Field12868[var12][var13] & 19398944) == 0) {
                                       var31 = true;
                                       break label781;
                                    }

                                    if (var12 == var11 && var13 == var8 - 1 && (var29.Field12868[var12][var13] & 19398914) == 0) {
                                       var31 = true;
                                       break label781;
                                    }
                                 } else if (var2 == 3) {
                                    if (var12 == var11 && var13 == var8 - 1) {
                                       var31 = true;
                                       break label781;
                                    }

                                    if (var12 == var11 - 1 && var13 == var8 && (var29.Field12868[var12][var13] & 19398920) == 0) {
                                       var31 = true;
                                       break label781;
                                    }

                                    if (var12 == var11 + 1 && var13 == var8 && (var29.Field12868[var12][var13] & 19399040) == 0) {
                                       var31 = true;
                                       break label781;
                                    }
                                 }
                              }

                              if (var24 == 2) {
                                 if (var2 == 0) {
                                    if (var12 == var11 - 1 && var13 == var8) {
                                       var31 = true;
                                       break label781;
                                    }

                                    if (var12 == var11 && var13 == var8 + 1) {
                                       var31 = true;
                                       break label781;
                                    }

                                    if (var12 == var11 + 1 && var13 == var8 && (var29.Field12868[var12][var13] & 19399040) == 0) {
                                       var31 = true;
                                       break label781;
                                    }

                                    if (var12 == var11 && var13 == var8 - 1 && (var29.Field12868[var12][var13] & 19398914) == 0) {
                                       var31 = true;
                                       break label781;
                                    }
                                 } else if (var2 == 1) {
                                    if (var12 == var11 - 1 && var13 == var8 && (var29.Field12868[var12][var13] & 19398920) == 0) {
                                       var31 = true;
                                       break label781;
                                    }

                                    if (var12 == var11 && var13 == var8 + 1) {
                                       var31 = true;
                                       break label781;
                                    }

                                    if (var12 == var11 + 1 && var13 == var8) {
                                       var31 = true;
                                       break label781;
                                    }

                                    if (var12 == var11 && var13 == var8 - 1 && (var29.Field12868[var12][var13] & 19398914) == 0) {
                                       var31 = true;
                                       break label781;
                                    }
                                 } else if (var2 == 2) {
                                    if (var12 == var11 - 1 && var13 == var8 && (var29.Field12868[var12][var13] & 19398920) == 0) {
                                       var31 = true;
                                       break label781;
                                    }

                                    if (var12 == var11 && var13 == var8 + 1 && (var29.Field12868[var12][var13] & 19398944) == 0) {
                                       var31 = true;
                                       break label781;
                                    }

                                    if (var12 == var11 + 1 && var13 == var8) {
                                       var31 = true;
                                       break label781;
                                    }

                                    if (var12 == var11 && var13 == var8 - 1) {
                                       var31 = true;
                                       break label781;
                                    }
                                 } else if (var2 == 3) {
                                    if (var12 == var11 - 1 && var13 == var8) {
                                       var31 = true;
                                       break label781;
                                    }

                                    if (var12 == var11 && var13 == var8 + 1 && (var29.Field12868[var12][var13] & 19398944) == 0) {
                                       var31 = true;
                                       break label781;
                                    }

                                    if (var12 == var11 + 1 && var13 == var8 && (var29.Field12868[var12][var13] & 19399040) == 0) {
                                       var31 = true;
                                       break label781;
                                    }

                                    if (var12 == var11 && var13 == var8 - 1) {
                                       var31 = true;
                                       break label781;
                                    }
                                 }
                              }

                              if (var24 == 9) {
                                 if (var12 == var11 && var13 == var8 + 1 && (var29.Field12868[var12][var13] & 32) == 0) {
                                    var31 = true;
                                    break label781;
                                 }

                                 if (var12 == var11 && var13 == var8 - 1 && (var29.Field12868[var12][var13] & 2) == 0) {
                                    var31 = true;
                                    break label781;
                                 }

                                 if (var12 == var11 - 1 && var13 == var8 && (var29.Field12868[var12][var13] & 8) == 0) {
                                    var31 = true;
                                    break label781;
                                 }

                                 if (var12 == var11 + 1 && var13 == var8 && (var29.Field12868[var12][var13] & 128) == 0) {
                                    var31 = true;
                                    break label781;
                                 }
                              }

                              var31 = false;
                           }
                        }

                        if (var31) {
                           var16 = true;
                           break;
                        }
                     }

                     if (var4 < 10) {
                        var10000 = this.Field12655[Field12379];
                        int var10004 = var4 - 1;
                        var24 = var2;
                        var23 = var10004;
                        var29 = var10000;
                        if (var12 == var11 && var13 == var8) {
                           var31 = true;
                        } else {
                           label788: {
                              if (var23 == 6 || var23 == 7) {
                                 if (var23 == 7) {
                                    var24 = var2 + 2 & 3;
                                 }

                                 if (var24 == 0) {
                                    if (var12 == var11 + 1 && var13 == var8 && (var29.Field12868[var12][var13] & 128) == 0) {
                                       var31 = true;
                                       break label788;
                                    }

                                    if (var12 == var11 && var13 == var8 - 1 && (var29.Field12868[var12][var13] & 2) == 0) {
                                       var31 = true;
                                       break label788;
                                    }
                                 } else if (var24 == 1) {
                                    if (var12 == var11 - 1 && var13 == var8 && (var29.Field12868[var12][var13] & 8) == 0) {
                                       var31 = true;
                                       break label788;
                                    }

                                    if (var12 == var11 && var13 == var8 - 1 && (var29.Field12868[var12][var13] & 2) == 0) {
                                       var31 = true;
                                       break label788;
                                    }
                                 } else if (var24 == 2) {
                                    if (var12 == var11 - 1 && var13 == var8 && (var29.Field12868[var12][var13] & 8) == 0) {
                                       var31 = true;
                                       break label788;
                                    }

                                    if (var12 == var11 && var13 == var8 + 1 && (var29.Field12868[var12][var13] & 32) == 0) {
                                       var31 = true;
                                       break label788;
                                    }
                                 } else if (var24 == 3) {
                                    if (var12 == var11 + 1 && var13 == var8 && (var29.Field12868[var12][var13] & 128) == 0) {
                                       var31 = true;
                                       break label788;
                                    }

                                    if (var12 == var11 && var13 == var8 + 1 && (var29.Field12868[var12][var13] & 32) == 0) {
                                       var31 = true;
                                       break label788;
                                    }
                                 }
                              }

                              if (var23 == 8) {
                                 if (var12 == var11 && var13 == var8 + 1 && (var29.Field12868[var12][var13] & 32) == 0) {
                                    var31 = true;
                                    break label788;
                                 }

                                 if (var12 == var11 && var13 == var8 - 1 && (var29.Field12868[var12][var13] & 2) == 0) {
                                    var31 = true;
                                    break label788;
                                 }

                                 if (var12 == var11 - 1 && var13 == var8 && (var29.Field12868[var12][var13] & 8) == 0) {
                                    var31 = true;
                                    break label788;
                                 }

                                 if (var12 == var11 + 1 && var13 == var8 && (var29.Field12868[var12][var13] & 128) == 0) {
                                    var31 = true;
                                    break label788;
                                 }
                              }

                              var31 = false;
                           }
                        }

                        if (var31) {
                           var16 = true;
                           break;
                        }
                     }
                  }

                  if (var6 != 0 && var3 != 0) {
                     var29 = this.Field12655[Field12379];
                     int var25 = var11 + var6 - 1;
                     var23 = var8 + var3 - 1;
                     if (var12 >= var11 && var12 <= var25 && var13 >= var8 && var13 <= var23 || var12 == var11 - 1 && var13 >= var8 && var13 <= var23 && (var29.Field12868[var12][var13] & 8) == 0 && (var7 & 8) == 0 || var12 == var25 + 1 && var13 >= var8 && var13 <= var23 && (var29.Field12868[var12][var13] & 128) == 0 && (var7 & 2) == 0 || var13 == var8 - 1 && var12 >= var11 && var12 <= var25 && (var29.Field12868[var12][var13] & 2) == 0 && (var7 & 4) == 0 || var13 == var23 + 1 && var12 >= var11 && var12 <= var25 && (var29.Field12868[var12][var13] & 32) == 0 && (var7 & 1) == 0) {
                        var16 = true;
                        break;
                     }
                  }

                  var30 = this.Field12322[var12][var13] + 1;
                  if (var12 > 0 && this.Field12372[var12 - 1][var13] == 0 && (var18[var12 - 1][var13] & 19398920) == 0) {
                     this.Field12695[var27] = var12 - 1;
                     this.Field12696[var27] = var13;
                     var27 = (var27 + 1) % var17;
                     this.Field12372[var12 - 1][var13] = 2;
                     this.Field12322[var12 - 1][var13] = var30;
                  }

                  if (var12 < SceneGraph.mapSizeWidth - 1 && this.Field12372[var12 + 1][var13] == 0 && (var18[var12 + 1][var13] & 19399040) == 0) {
                     this.Field12695[var27] = var12 + 1;
                     this.Field12696[var27] = var13;
                     var27 = (var27 + 1) % var17;
                     this.Field12372[var12 + 1][var13] = 8;
                     this.Field12322[var12 + 1][var13] = var30;
                  }

                  if (var13 > 0 && this.Field12372[var12][var13 - 1] == 0 && (var18[var12][var13 - 1] & 19398914) == 0) {
                     this.Field12695[var27] = var12;
                     this.Field12696[var27] = var13 - 1;
                     var27 = (var27 + 1) % var17;
                     this.Field12372[var12][var13 - 1] = 1;
                     this.Field12322[var12][var13 - 1] = var30;
                  }

                  if (var13 < SceneGraph.mapSizeWidth - 1 && this.Field12372[var12][var13 + 1] == 0 && (var18[var12][var13 + 1] & 19398944) == 0) {
                     this.Field12695[var27] = var12;
                     this.Field12696[var27] = var13 + 1;
                     var27 = (var27 + 1) % var17;
                     this.Field12372[var12][var13 + 1] = 4;
                     this.Field12322[var12][var13 + 1] = var30;
                  }

                  if (var12 > 0 && var13 > 0 && this.Field12372[var12 - 1][var13 - 1] == 0 && (var18[var12 - 1][var13 - 1] & 19398926) == 0 && (var18[var12 - 1][var13] & 19398920) == 0 && (var18[var12][var13 - 1] & 19398914) == 0) {
                     this.Field12695[var27] = var12 - 1;
                     this.Field12696[var27] = var13 - 1;
                     var27 = (var27 + 1) % var17;
                     this.Field12372[var12 - 1][var13 - 1] = 3;
                     this.Field12322[var12 - 1][var13 - 1] = var30;
                  }

                  if (var12 < SceneGraph.mapSizeWidth - 1 && var13 > 0 && this.Field12372[var12 + 1][var13 - 1] == 0 && (var18[var12 + 1][var13 - 1] & 19399043) == 0 && (var18[var12 + 1][var13] & 19399040) == 0 && (var18[var12][var13 - 1] & 19398914) == 0) {
                     this.Field12695[var27] = var12 + 1;
                     this.Field12696[var27] = var13 - 1;
                     var27 = (var27 + 1) % var17;
                     this.Field12372[var12 + 1][var13 - 1] = 9;
                     this.Field12322[var12 + 1][var13 - 1] = var30;
                  }

                  if (var12 > 0 && var13 < SceneGraph.mapSizeWidth - 1 && this.Field12372[var12 - 1][var13 + 1] == 0 && (var18[var12 - 1][var13 + 1] & 19398968) == 0 && (var18[var12 - 1][var13] & 19398920) == 0 && (var18[var12][var13 + 1] & 19398944) == 0) {
                     this.Field12695[var27] = var12 - 1;
                     this.Field12696[var27] = var13 + 1;
                     var27 = (var27 + 1) % var17;
                     this.Field12372[var12 - 1][var13 + 1] = 6;
                     this.Field12322[var12 - 1][var13 + 1] = var30;
                  }

                  if (var12 < SceneGraph.mapSizeWidth - 1 && var13 < SceneGraph.mapSizeWidth - 1 && this.Field12372[var12 + 1][var13 + 1] == 0 && (var18[var12 + 1][var13 + 1] & 19399136) == 0 && (var18[var12 + 1][var13] & 19399040) == 0 && (var18[var12][var13 + 1] & 19398944) == 0) {
                     this.Field12695[var27] = var12 + 1;
                     this.Field12696[var27] = var13 + 1;
                     var27 = (var27 + 1) % var17;
                     this.Field12372[var12 + 1][var13 + 1] = 12;
                     this.Field12322[var12 + 1][var13 + 1] = var30;
                  }
               }

               this.Field12682 = 0;
               if (!var16) {
                  if (var10) {
                     var30 = 100;

                     for(var2 = 1; var2 < 2; ++var2) {
                        for(var3 = var11 - var2; var3 <= var11 + var2; ++var3) {
                           for(var4 = var8 - var2; var4 <= var8 + var2; ++var4) {
                              if (var3 >= 0 && var4 >= 0 && var3 < SceneGraph.mapSizeWidth && var4 < SceneGraph.mapSizeWidth && this.Field12322[var3][var4] < var30) {
                                 var30 = this.Field12322[var3][var4];
                                 var12 = var3;
                                 var13 = var4;
                                 this.Field12682 = 1;
                                 var16 = true;
                              }
                           }
                        }

                        if (var16) {
                           break;
                        }
                     }
                  }

                  if (!var16) {
                     return false;
                  }
               }

               byte var28 = 0;
               this.Field12695[0] = var12;
               var15 = var28 + 1;
               this.Field12696[0] = var13;

               for(var2 = var30 = this.Field12372[var12][var13]; var12 != var9 || var13 != var5; var2 = this.Field12372[var12][var13]) {
                  if (var2 != var30) {
                     var30 = var2;
                     this.Field12695[var15] = var12;
                     this.Field12696[var15++] = var13;
                  }

                  if ((var2 & 2) != 0) {
                     ++var12;
                  } else if ((var2 & 8) != 0) {
                     --var12;
                  }

                  if ((var2 & 1) != 0) {
                     ++var13;
                  } else if ((var2 & 4) != 0) {
                     --var13;
                  }
               }

               if (var15 <= 0) {
                  if (var1 != 1) {
                     return true;
                  } else {
                     return false;
                  }
               } else {
                  var2 = var15;
                  if (var15 > 25) {
                     var2 = 25;
                  }

                  --var15;
                  var3 = this.Field12695[var15];
                  var4 = this.Field12696[var15];
                  if ((Field12703 += var2) >= 92) {
                     this.Field12630.Method14445(36);
                     this.Field12630.Method14480(0);
                     Field12703 = 0;
                  }

                  if (var1 == 0) {
                     this.Field12630.Method14445(164);
                     this.Field12630.Method388(var2 + var2 + 3);
                  }

                  if (var1 == 1) {
                     this.Field12630.Method14445(248);
                     this.Field12630.Method388(var2 + var2 + 3 + 14);
                  }

                  if (var1 == 2) {
                     this.Field12630.Method14445(98);
                     this.Field12630.Method388(var2 + var2 + 3);
                  }

                  this.Field12630.Method14461(var3 + Field12490 - Field12494);
                  Field12679 = this.Field12695[0];
                  Field12680 = this.Field12696[0];

                  for(var1 = 1; var1 < var2; ++var1) {
                     --var15;
                     this.Field12630.Method388(this.Field12695[var15] - var3);
                     this.Field12630.Method388(this.Field12696[var15] - var4);
                  }

                  this.Field12630.Method421(var4 + Field12491 - Field12495);
                  this.Field12630.Method14491(super.keyStatus[5] != 1 ? 0 : 1);
                  return true;
               }
            } else {
               return false;
            }
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   private void Method13347(Packet var1) {
      for(int var2 = 0; var2 < this.sessionNpcsAwaitingUpdatePtr; ++var2) {
         int var3 = this.session_npcs_awaiting_update[var2];
         Npc var9 = this.Field12327[var3];
         int var4;
         if (((var4 = var1.g1()) & 64) != 0) {
            var4 += var1.g1() << 8;
         }

         if ((var4 & 1024) != 0) {
            var9.an_4 = var1.sg1();
            var9.au_0 = var1.sg1();
            var9.at_0 = var1.sg1();
            var9.av_0 = var1.sg1();
            var9.aw_2 = var1.isg2() + currentTime;
            var9.ax_2 = var1.sg2() + currentTime;
            var9.ay_0 = var1.sg1();
            var9.resetPath();
         }

         int var5;
         int var6;
         int var7;
         if ((var4 & 16) != 0) {
            if ((var5 = var1.ig2()) == 65535) {
               var5 = -1;
            }

            var6 = var1.g1();
            Sequence.Method8281(var5);
            if (var5 == var9.U_2 && var5 != -1) {
               if ((var7 = Sequence.anims[var5].Field10154) == 1) {
                  var9.W_3 = 0;
                  var9.X_7 = 0;
                  var9.Y_7 = 0.0F;
                  var9.Z_2 = var6;
                  var9.Field4195 = (float)var6;
                  var9.ab_6 = 0;
               }

               if (var7 == 2) {
                  var9.ab_6 = 0;
               }
            } else if (var5 == -1 || var9.U_2 == -1 || Sequence.anims[var5].Field10148 >= Sequence.anims[var9.U_2].Field10148) {
               var9.U_2 = var5;
               var9.W_3 = 0;
               var9.X_7 = 0;
               var9.Y_7 = 0.0F;
               var9.Z_2 = var6;
               var9.Field4195 = (float)var6;
               var9.ab_6 = 0;
               var9.am_4 = var9.T_2;
            }
         }

         int var8;
         if ((var4 & 8) != 0) {
            var5 = var1.g2();
            var6 = var1.ng1b();
            var7 = var1.g2();
            var8 = var1.g2();
            var9.updateHitData(var6, var5, currentTime);
            var9.ad_2 = currentTime + 300;
            var9.ae_2 = var7;
            var9.af_6 = var8;
         }

         if ((var4 & 128) != 0) {
            var9.gfxId = var1.g2();
            SpotAnim.Method8313(var9.gfxId);
            var5 = var1.Method404();
            var9.graphicHeight = var5 >> 16;
            var9.gfxDelay = currentTime + (var5 & '\uffff');
            var9.animation = 0;
            var9.P_3 = 0;
            var9.Q_3 = 0.0F;
            if (var9.gfxDelay > currentTime) {
               var9.animation = -1;
            }

            if (var9.gfxId == 65535) {
               var9.gfxId = -1;
            }

            var9.Method9426();
         }

         if ((var4 & 32) != 0) {
            var9.Field8767 = var1.g2();
            if (var9.Field8767 == 65535) {
               var9.Field8767 = -1;
            }
         }

         if ((var4 & 1) != 0) {
            var9.C_8 = var1.Method406();
            var9.ag_6 = 100;
         }

         if ((var4 & 256) != 0) {
            var5 = var1.g2();
            var6 = var1.sg1();
            var7 = var1.g2();
            var8 = var1.g2();
            var9.updateHitData(var6, var5, currentTime);
            var9.ad_2 = currentTime + 300;
            var9.ae_2 = var7;
            var9.af_6 = var8;
         }

         if ((var4 & 2) != 0) {
            var9.Field4103 = NPCDefinition.Method11884(var1.isg2());
            if (var9.Field4103 != null) {
               var9.ak_2 = var9.Field4103.Field10740;
               var9.Field8769 = var9.Field4103.degreesToTurn;
               var9.ak_2 = var9.Field4103.Field10740;
               var9.aD_0 = var9.Field4103.Field10738;
               var9.aE_0 = var9.Field4103.Field10732;
               var9.aF_0 = var9.Field4103.runAnimIndex;
               var9.aG_0 = var9.Field4103.Field10730;
               var9.F_6 = var9.Field4103.Field10747;
               var9.B_9 = var9.Field4103.Field10739;
            }
         }

         if ((var4 & 4) != 0) {
            var9.ai_5 = var1.ig2();
            var9.aj_2 = var1.ig2();
         }
      }

   }

   private void Method13348(NPCDefinition var1, int var2, int var3, int var4) {
      boolean var5 = !Field12090;
      if (this.Field12575 < this.Field12550.length) {
         if (var1.Field10755 != null) {
            var1 = var1.Method11888();
         }

         if (var1 != null) {
            if (var1.Field10751) {
               String var6 = var1.Field10736;
               if (var1.Field10735 != 0) {
                  var6 = var6 + Method13366(session_player.combatLevel, var1.Field10735) + " (level-" + var1.Field10735 + ")";
               }

               if (this.Field12697 == 1) {
                  this.Field12634[this.Field12575] = "Use " + this.Field12701 + " with @yel@" + var6;
                  this.Field12550[this.Field12575] = 582;
                  this.Field12551[this.Field12575] = var2;
                  this.Field12547[this.Field12575] = var4;
                  this.Field12548[this.Field12575] = var3;
                  ++this.Field12575;
               } else {
                  if (this.Field12577 == 1) {
                     if ((this.Field12579 & 2) == 2) {
                        this.Field12634[this.Field12575] = this.Field12580 + " @yel@" + var6;
                        this.Field12550[this.Field12575] = 413;
                        this.Field12551[this.Field12575] = var2;
                        this.Field12547[this.Field12575] = var4;
                        this.Field12548[this.Field12575] = var3;
                        ++this.Field12575;
                        return;
                     }
                  } else {
                     int var7;
                     if (var1.Field10737 != null) {
                        for(var7 = 4; var7 >= 0; --var7) {
                           if (var1.Field10737[var7] != null && (!var5 || !var1.Field10737[var7].equalsIgnoreCase("attack"))) {
                              short var8 = 0;
                              if (var1.Field10735 > session_player.combatLevel) {
                                 var8 = 2000;
                              }

                              this.Field12634[this.Field12575] = var1.Field10737[var7] + " @yel@" + var6;
                              if (var7 == 0) {
                                 this.Field12550[this.Field12575] = var8 + 20;
                              }

                              if (var7 == 1) {
                                 this.Field12550[this.Field12575] = var8 + 412;
                              }

                              if (var7 == 2) {
                                 this.Field12550[this.Field12575] = var8 + 225;
                              }

                              if (var7 == 3) {
                                 this.Field12550[this.Field12575] = var8 + 965;
                              }

                              if (var7 == 4) {
                                 this.Field12550[this.Field12575] = var8 + 478;
                              }

                              this.Field12551[this.Field12575] = var2;
                              this.Field12547[this.Field12575] = var4;
                              this.Field12548[this.Field12575] = var3;
                              ++this.Field12575;
                           }
                        }
                     }

                     if (var5 && var1.Field10737 != null) {
                        for(var7 = 4; var7 >= 0; --var7) {
                           if (var1.Field10737[var7] != null && var1.Field10737[var7].equalsIgnoreCase("attack")) {
                              this.Field12634[this.Field12575] = var1.Field10737[var7] + " @yel@" + var6;
                              if (var7 == 0) {
                                 this.Field12550[this.Field12575] = 20;
                              }

                              if (var7 == 1) {
                                 this.Field12550[this.Field12575] = 412;
                              }

                              if (var7 == 2) {
                                 this.Field12550[this.Field12575] = 225;
                              }

                              if (var7 == 3) {
                                 this.Field12550[this.Field12575] = 965;
                              }

                              if (var7 == 4) {
                                 this.Field12550[this.Field12575] = 478;
                              }

                              this.Field12551[this.Field12575] = var2;
                              this.Field12547[this.Field12575] = var4;
                              this.Field12548[this.Field12575] = var3;
                              ++this.Field12575;
                           }
                        }
                     }

                     if (Field12080) {
                        String var15 = "[";
                        int var16 = 0;
                        int[] var11 = var1.Field10760;
                        int var10 = var1.Field10760.length;

                        int var9;
                        for(var9 = 0; var9 < var10; ++var9) {
                           int var13 = var11[var9];
                           if (var16++ > 0) {
                              var15 = var15 + ", ";
                           }

                           var15 = var15 + var13;
                        }

                        var15 = var15 + "]";
                        String var14 = "[";
                        var9 = 0;
                        if (var1.Field10743 != null) {
                           int[] var12 = var1.Field10743;
                           var16 = var1.Field10743.length;

                           for(int var17 = 0; var17 < var16; ++var17) {
                              var10 = var12[var17];
                              if (var9++ > 0) {
                                 var14 = var14 + ", ";
                              }

                              var14 = var14 + var10;
                           }
                        }

                        var14 = var14 + "]";
                        this.Field12634[this.Field12575] = "Data2 @yel@cm:" + var14;
                        this.Field12550[this.Field12575] = 1025;
                        this.Field12551[this.Field12575] = var2;
                        this.Field12547[this.Field12575] = var4;
                        this.Field12548[this.Field12575] = var3;
                        ++this.Field12575;
                        this.Field12634[this.Field12575] = "Data @yel@id:" + var1.interactingEntity + " a:" + var1.Field10747 + "," + var1.Field10738 + " m:" + var15;
                        this.Field12550[this.Field12575] = 1025;
                        this.Field12551[this.Field12575] = var2;
                        this.Field12547[this.Field12575] = var4;
                        this.Field12548[this.Field12575] = var3;
                        ++this.Field12575;
                     }

                     this.Field12634[this.Field12575] = "Examine @yel@" + var6;
                     this.Field12550[this.Field12575] = 1025;
                     this.Field12551[this.Field12575] = var2;
                     this.Field12547[this.Field12575] = var4;
                     this.Field12548[this.Field12575] = var3;
                     ++this.Field12575;
                  }

               }
            }
         }
      }
   }

   private void rightClickListText(int var1, int var2, Player var3, int var4, int var5) {
      if (var3 != session_player || Method13320() && Field12080) {
         if (this.Field12575 < this.Field12550.length) {
            boolean var7 = !Field12090;
            int var6 = Field12490 + (session_player.Field4194 - 6 >> 7);
            int var8 = Field12491 + (session_player.Field4195 - 6 >> 7);
            boolean var12 = var6 >= 3329 && var8 >= 3203 && var6 <= 3392 && var8 <= 3261;
            String var11;
            if (var3.skill == 0) {
               var11 = var3.name + Method13366(session_player.combatLevel, var3.combatLevel) + " (level-" + var3.combatLevel + ")";
            } else {
               var11 = var3.name + " (skill-" + var3.skill + "-" + var5 + ")";
            }

            int var9;
            if (this.Field12697 == 1) {
               this.Field12634[this.Field12575] = "Use " + this.Field12701 + " with @whi@" + var11;
               this.Field12550[this.Field12575] = 491;
               this.Field12551[this.Field12575] = var2;
               this.Field12547[this.Field12575] = var1;
               this.Field12548[this.Field12575] = var4;
               ++this.Field12575;
            } else if (this.Field12577 == 1) {
               if ((this.Field12579 & 8) == 8) {
                  if (session_player.appearanceModels[1] == 5540 && var3.appearanceModels[1] == 5540) {
                     return;
                  }

                  if (session_player.appearanceModels[1] == 5538 && var3.appearanceModels[1] == 5538) {
                     return;
                  }

                  if (this.Field12295 == 201 && this.Field12388 != var5) {
                     return;
                  }

                  this.Field12634[this.Field12575] = this.Field12580 + " @whi@" + var11;
                  this.Field12550[this.Field12575] = 365;
                  this.Field12551[this.Field12575] = var2;
                  this.Field12547[this.Field12575] = var1;
                  this.Field12548[this.Field12575] = var4;
                  ++this.Field12575;
               }
            } else {
               for(var9 = 4; var9 >= 0; --var9) {
                  if (this.Field12570[var9] != null) {
                     this.Field12634[this.Field12575] = this.Field12570[var9] + " @whi@" + var11;
                     short var10 = 0;
                     if (this.Field12570[var9].equalsIgnoreCase("attack")) {
                        if (var12 && var5 != this.Field12388) {
                           continue;
                        }

                        if (!var7 && var3.combatLevel > session_player.combatLevel) {
                           var10 = 2000;
                        }

                        if (this.Field12388 == var5) {
                           var10 = 0;
                        }

                        if (session_player.appearanceModels[1] == 5540 && var3.appearanceModels[1] == 5540 || session_player.appearanceModels[1] == 5538 && var3.appearanceModels[1] == 5538) {
                           continue;
                        }
                     } else if (this.Field12571[var9]) {
                        var10 = 2000;
                     }

                     if (var9 == 0) {
                        this.Field12550[this.Field12575] = var10 + 561;
                     }

                     if (var9 == 1) {
                        this.Field12550[this.Field12575] = var10 + 779;
                     }

                     if (var9 == 2) {
                        this.Field12550[this.Field12575] = var10 + 27;
                     }

                     if (var9 == 3) {
                        this.Field12550[this.Field12575] = var10 + 577;
                     }

                     if (var9 == 4) {
                        this.Field12550[this.Field12575] = var10 + 729;
                     }

                     this.Field12551[this.Field12575] = var2;
                     this.Field12547[this.Field12575] = var1;
                     this.Field12548[this.Field12575] = var4;
                     ++this.Field12575;
                  }
               }
            }

            for(var9 = 0; var9 < this.Field12575; ++var9) {
               if (this.Field12550[var9] == 516) {
                  this.Field12634[var9] = "Walk here @whi@" + var11;
                  return;
               }
            }

         }
      }
   }

   private void loadTradableItemData() {
      String[] var3 = new String[]{"tradeable.dat", "data.dat"};

      for(int var2 = 0; var2 < 2; ++var2) {
         String var1 = var3[var2];
         String var4 = Signlink.cacheDirectory() + "/" + var1;
         boolean var5 = true;

         while(var5 || !(new File(var4)).exists()) {
            if (!var5) {
               try {
                  Thread.sleep(0L);
               } catch (InterruptedException var8) {
                  var8.printStackTrace();
               }
            }

            var5 = false;

            try {
               this.drawLoadingText(30, "Fetching updates - " + var1);
               //Class280.Method2988().Method3004().Method3011(var1, 3);
            } catch (Exception var7) {
               var7.printStackTrace();
            }
         }
      }

      ItemDef.Method11905(Signlink.cacheDirectory() + "/tradeable.dat");
      if (!normalMem) {
         Field12156 = new Class686();
      }

   }

   public final boolean startUp() {
      //ParticleDefinition.Method7790();
      Field12183 = this;
      if (Field12166 && GraphicsDisplay.Field2678 && GraphicsDisplay.screenResolutionWidth <= 1920) {
         Field12166 = false;
      }

      Class280.Method2987(this.jarLocations + "/forID/", this.jarLocations + "/");
      Signlink.Field2944.submit(new Class879(this));
      this.drawLoadingText(0, "Starting up");

      int var2;
      int var3;
      int var4;
      try {
         String var1 = Signlink.cacheDirectory();
         this.drawLoadingText(10, "Checking for updates");

         for(var3 = 0; var3 < this.expectedCRCs.length; ++var3) {
            if ((var4 = Class280.Method2988().Method3004().Method3013(var3)) == -1) {
               this.drawLoadingText(10, "Checking for updates - retrying...");
            } else {
               this.expectedCRCs[var3] = var4;
            }
         }

         File var5;
         File var6;
         File var27;
         try {
            File var25;
            if (!(var25 = new File(var1)).exists()) {
               var25.mkdirs();
            }

            if (!(var27 = new File(var1 + "main_file_cache.dat")).exists()) {
               var27.createNewFile();
            }

            Signlink.Field2946 = new RandomAccessFile(var1 + "main_file_cache.dat", "rw");
            if (!(var5 = new File(var1 + "main_file_cache3.dat")).exists()) {
               var5.createNewFile();
            }

            Signlink.Field2947 = new RandomAccessFile(var1 + "main_file_cache3.dat", "rw");

            for(var2 = 0; var2 < this.Field12722.length; ++var2) {
               if (!(var6 = new File(var1 + "main_file_cache.idx" + var2)).exists()) {
                  var6.createNewFile();
               }

               Signlink.Field2948[var2] = new RandomAccessFile(var1 + "main_file_cache.idx" + var2, "rw");
            }

            Signlink.Field2948[6] = new RandomAccessFile(var1 + "main_file_cache.idx6", "rw");
         } catch (Exception var19) {
            var19.printStackTrace();
         }

         if (!normalMem) {
            try {
               String var26 = Signlink.Method11828(false);
               if (!(var27 = new File(var26)).exists()) {
                  var27.mkdirs();
               }

               if (!(var5 = new File(var26 + "main_file_cache.dat")).exists()) {
                  var5.createNewFile();
               }

               Signlink.Field2949 = new RandomAccessFile(var26 + "main_file_cache.dat", "r");//rw

               for(var2 = 0; var2 < this.Field12722.length; ++var2) {
                  if (!(var6 = new File(var26 + "main_file_cache.idx" + var2)).exists()) {
                     var6.createNewFile();
                  }

                  Signlink.Field2950[var2] = new RandomAccessFile(var26 + "main_file_cache.idx" + var2, "r");//rw
               }
            } catch (Exception var18) {
               var18.printStackTrace();
            }
         }

         this.drawLoadingText(20, "Contacting update server");
      } catch (Exception var20) {
         var20.printStackTrace();
      }

      int var21;
      for(var21 = 0; var21 < 6; ++var21) {
         if (var21 == 1) {
            this.Field12722[var21] = new Class619(Signlink.Field2946, Signlink.Field2948[var21], Signlink.Field2947, Signlink.Field2948[6], var21 + 1);
         } else {
            this.Field12722[var21] = new Class619(Signlink.Field2946, Signlink.Field2948[var21], var21 + 1);
         }
      }

      for(var21 = 0; var21 < 6; ++var21) {
         if (var21 == 1) {
            this.Field12721[var21] = new Class619(Signlink.Field2949, Signlink.Field2950[var21], Signlink.Field2947, Signlink.Field2948[6], var21 + 1);
         } else {
            this.Field12721[var21] = new Class619(Signlink.Field2949, Signlink.Field2950[var21], var21 + 1);
         }
      }

      try {
         //connect to server here
         this.titleJagexArchive = this.streamLoaderForName(1, "title screen", "title", this.expectedCRCs[1], 25);
         smallFont = new RSFont(false, "p11_full", this.titleJagexArchive);
         plainFont = new RSFont(false, "p12_full", this.titleJagexArchive);
         boldFont = new RSFont(false, "b12_full", this.titleJagexArchive);
         fancyFont = new RSFont(true, "q8_full", this.titleJagexArchive);
         this.drawLoadingText(30, "Fetching updates");
         this.loadTradableItemData();
         this.loadTitleScreen();
         JagexArchive configArchive = this.streamLoaderForName(2, "config", "config", this.expectedCRCs[2], 30);
         JagexArchive var24 = null;
         if (!normalMem) {
            var24 = this.Method13310(2, "config", "config", this.expectedCRCs[2], 30);
         }

         JagexArchive interfaceArchive = this.streamLoaderForName(3, "interface", "interface", this.expectedCRCs[3], 35);
         JagexArchive mediaArchive = this.streamLoaderForName(4, "2d graphics", "media", this.expectedCRCs[4], 40);
         JagexArchive var31 = this.streamLoaderForName(4, "2d graphics", "media", this.expectedCRCs[4], 40);
         this.streamLoaderForName(6, "textures", "textures", this.expectedCRCs[6], 45);
         JagexArchive wordencArchive = this.streamLoaderForName(7, "chat system", "wordenc", this.expectedCRCs[7], 50);
         JagexArchive soundArchive = this.streamLoaderForName(8, "sound effects", "sounds", this.expectedCRCs[8], 55);
         this.tileSettingBits = new byte[4][SceneGraph.mapSizeWidth][SceneGraph.mapSizeWidth];
         this.intGroundArray = new int[4][SceneGraph.mapSizeWidth + 1][SceneGraph.mapSizeWidth + 1];
         Field12428 = new SceneGraph(this.intGroundArray);

         int var8;
         for(var8 = 0; var8 < 4; ++var8) {
            this.Field12655[var8] = new Class504(var8);
         }

         var8 = (SceneGraph.mapSizeWidth << 2) + 96;
         this.Field12681 = new RgbImage(var8, var8);

         JagexArchive var35;

         if (normalMem) {
            var35 = this.streamLoaderForName(5, "update list", "versionlist", this.expectedCRCs[5], 60);
         } else {
            var35 = this.Method13310(5, "update list", "versionlist", this.expectedCRCs[5], 60);
         }

         this.drawLoadingText(40, "Starting data fetcher");
         this.Field12526 = new OnDemandFetcher();
         if (normalMem) {
           this.Field12526.Method1306(var35, this, this.Field12722);
         } else {
            this.Field12526.Method1306(var35, this, this.Field12721);
         }

         this.Method13388();
         Class128.Method1321(this);
         Model.Method14473(this.Field12526);
         this.drawLoadingText(50, "Unpacking media");
         this.Field12313 = new RgbImage("chatarea");
         this.Field12315 = new RgbImage("tabarea");
         this.Field12316[1] = new RgbImage("maparea");
         this.Field12316[0] = new RgbImage("maparea2");
         this.Field12718[0] = new RgbImage("invback");
         this.Field12718[0].Method14493(255, 255, 255);
         this.Field12718[1] = new RgbImage("longtabs");
         this.Field12718[2] = new RgbImage("shorttabs");
         this.Field12185 = new RgbImage("Orbs/orb");
         this.Field12186 = new RgbImage("Orbs/orb2");
         this.Field12187 = new RgbImage("Orbs/EOrb");
         this.Field12188 = new RgbImage("Orbs/EOrb2");
         this.Field12191 = new RgbImage("Orbs/HPIcon");
         new RgbImage("Orbs/HPIcon_sel");
         this.Field12192 = new RgbImage("Orbs/PrayIcon");
         new RgbImage("Orbs/PrayIcon_sel");
         this.Field12189 = new RgbImage("Orbs/HPOrb");
         this.Field12190 = new RgbImage("Orbs/PrayOrb");
         this.Field12193 = new RgbImage("Orbs/runOrb");
         this.Field12194 = new RgbImage("Orbs/runOrb_sel");
         this.Field12195 = new RgbImage("Orbs/runIcon");
         this.Field12196 = new RgbImage("Orbs/runIcon_sel");
         this.Field12197 = new RgbImage("Orbs/runIcon_sel2");
         this.Field12198 = new RgbImage("Orbs/runIcon_sel3");
         this.Field12199 = new RgbImage("Orbs/worldmap_orb");
         this.Field12200 = new RgbImage("Orbs/worldmap");
         this.Field12201 = new RgbImage("Orbs/worldmap_sel");
         this.Field12419 = new RgbImage("Orbs/wikiIcon2");
         this.Field12420 = new RgbImage("Orbs/wikiIcon_sel2");
         this.Field12399 = new RgbImage("GE/new_31");
         this.Field12421 = new RgbImage("Orbs/ec");
         this.Field12422 = new RgbImage("Orbs/ec_sel");
         this.Field12423 = new RgbImage("Orbs/dynamic_orb", 0.8F);
         this.Field12424 = new RgbImage("/Options/SPRITE_41");
         this.Field12425 = new RgbImage[]{new RgbImage("/Options/SPRITE_30", 0.8F), new RgbImage("/Options/SPRITE_31", 0.8F)};
         RgbImage[] var10000 = new RgbImage[]{new RgbImage("/Options/SPRITE_39"), new RgbImage("/Options/SPRITE_40")};
         this.Field12400 = new RgbImage("Orbs/timerOrb", 0.9F);
         this.Field12401 = new RgbImage[this.Field12235.length];

         for(var8 = 0; var8 <= 24; ++var8) {
            this.Field12401[var8] = new RgbImage("skills/" + var8, 0.38F);
         }

         this.Field12401[28] = new RgbImage(var31, "magicon2", 2);
         this.Field12401[29] = new RgbImage("Lunar/LUNARON_36");
         this.Field12401[30] = new RgbImage("Lunar/LUNARON_9");
         this.Field12401[31] = new RgbImage(var31, "magicon2", 33);
         this.Field12401[32] = new RgbImage(var31, "magicon2", 3);
         this.Field12402 = new RgbImage("hitmarks/block");
         this.Field12403 = new RgbImage[]{new RgbImage("hitmarks/hit 0"), new RgbImage("hitmarks/hit 1"), new RgbImage("hitmarks/hit 2")};
         this.Field12405 = new RgbImage[]{new RgbImage("hitmarks/hit 3"), new RgbImage("hitmarks/hit 4"), new RgbImage("hitmarks/hit 5")};
         this.Field12404 = new RgbImage[]{new RgbImage("hitmarks/hit 6"), new RgbImage("hitmarks/hit 7"), new RgbImage("hitmarks/hit 8")};
         this.Field12406 = new RgbImage[]{new RgbImage("hitmarks/hit 9"), new RgbImage("hitmarks/hit 10"), new RgbImage("hitmarks/hit 11")};
         this.Field12407 = new RgbImage[]{new RgbImage("hitmarks/icon 0"), new RgbImage("hitmarks/icon 1"), new RgbImage("hitmarks/icon 2"), new RgbImage("hitmarks/icon 3"), new RgbImage("hitmarks/icon 4")};
         RgbImage var36 = new RgbImage("menu_item");
         RgbImage var32 = new RgbImage("menu_item", 0.75F);
         this.Field12408 = var36.Method880(0, 0, var36.Field9894, var36.Field9895 / 2);
         var36.Method880(0, var36.Field9895 / 2, var36.Field9894, var36.Field9895 / 2);
         this.Field12409 = var32.Method880(0, 0, var32.Field9894, var32.Field9895 / 2);
         this.Field12179 = new RgbImage("hp1");
         this.Field12180 = new RgbImage[3];

         int var33;
         for(var33 = 2; var33 <= 4; ++var33) {
            this.Field12180[var33 - 2] = new RgbImage("hp" + var33);
         }

         this.Field12181 = new RgbImage("hp1", 2.0F, 1.0F);
         this.Field12182 = new RgbImage[3];

         for(var33 = 2; var33 <= 4; ++var33) {
            this.Field12182[var33 - 2] = new RgbImage("hp" + var33, 2.0F, 1.0F);
         }

         this.Field12178[0] = new RgbImage("crowns/silver_crown");
         this.Field12178[1] = new RgbImage("crowns/gold_crown");
         this.Field12178[2] = new RgbImage("crowns/ironman_chat_badge");
         this.Field12633 = new IndexedImage(mediaArchive, "mapback", 0);
         mediaArchive = this.streamLoaderForName(4, "2d graphics", "media", this.expectedCRCs[4], 40);

         for(var33 = 0; var33 <= 3; ++var33) {
            this.Field12314[var33] = new RgbImage(mediaArchive, "chatbuttons", var33);
         }

         for(var33 = 0; var33 <= 14; ++var33) {
            this.Field12429[var33] = new RgbImage(mediaArchive, "sideicons", var33);
         }

         for(var33 = 0; var33 < 5; ++var33) {
            this.Field12348[var33] = new RgbImage("REDSTONES " + var33);
         }

         this.Field12565 = new RgbImage(mediaArchive, "compass", 0);
         this.Field12467 = new RgbImage(mediaArchive, "mapedge", 0);
         this.Field12467.Method14457();

         try {
            for(var33 = 0; var33 < 100; ++var33) {
               this.Field12517[var33] = new IndexedImage(mediaArchive, "mapscene", var33);
            }
         } catch (Exception var16) {
            ;
         }

         try {
            for(var33 = 0; var33 < 100; ++var33) {
               this.Field12489[var33] = new RgbImage(mediaArchive, "mapfunction", var33);
            }
         } catch (Exception var15) {
            ;
         }

         try {
            for(var33 = 0; var33 < 20; ++var33) {
               this.Field12458[var33] = new RgbImage(mediaArchive, "hitmarks", var33);
            }
         } catch (Exception var14) {
            ;
         }

         try {
            for(var33 = 0; var33 < 6; ++var33) {
               this.Field12555[var33] = new RgbImage(mediaArchive, "headicons_hint", var33);
            }
         } catch (Exception var13) {
            ;
         }

         try {
            for(var33 = 0; var33 < 8; ++var33) {
               this.Field12553[var33] = new RgbImage(mediaArchive, "headicons_prayer", var33);
            }

            for(var33 = 0; var33 < 3; ++var33) {
               this.Field12554[var33] = new RgbImage(mediaArchive, "headicons_pk", var33);
            }
         } catch (Exception var12) {
            ;
         }

         this.Field12349 = new RgbImage(mediaArchive, "mapmarker", 0);
         this.Field12350 = new RgbImage(mediaArchive, "mapmarker", 1);

         for(var33 = 0; var33 < 8; ++var33) {
            this.Field12586[var33] = new RgbImage(mediaArchive, "cross", var33);
         }

         this.Field12532 = new RgbImage(mediaArchive, "mapdots", 0);
         this.Field12533 = new RgbImage(mediaArchive, "mapdots", 1);
         this.Field12535 = new RgbImage(mediaArchive, "mapdots", 2);
         this.Field12536 = new RgbImage(mediaArchive, "mapdots", 3);
         this.Field12537 = new RgbImage(mediaArchive, "mapdots", 4);
         this.Field12307 = new RgbImage(mediaArchive, "mapdots", 5);
         this.Field12307.Method14493(255, 0, 255);
         this.Field12484 = new RgbImage(mediaArchive, "scrollbar", 0);
         this.Field12485 = new RgbImage(mediaArchive, "scrollbar", 1);
         if (GraphicsDisplay.Field2678) {
            this.Field12534 = new RgbImage("multi");
         } else {
            this.Field12534 = new RgbImage(mediaArchive, "Overlay_multiway", 0);
         }

         for(var33 = 0; var33 < 2; ++var33) {
            this.Field12644[var33] = new IndexedImage(mediaArchive, "mod_icons", var33);
         }

         var32 = new RgbImage(mediaArchive, "screenframe", 0);
         this.Field12317 = Method13410(var32.Field9894, var32.Field9895, this.j());
         var32 = new RgbImage(mediaArchive, "screenframe", 1);
         this.Field12318 = Method13410(519, var32.Field9895, this.j());
         var32 = new RgbImage(mediaArchive, "screenframe", 2);
         this.Field12319 = Method13410(var32.Field9894, var32.Field9895, this.j());
         new RgbImage(mediaArchive, "mapedge", 0);

         for(var33 = 0; var33 < 100; ++var33) {
            if (this.Field12489[var33] != null) {
               this.Field12489[var33].Method14497(0, 0, 0);
            }

            if (this.Field12517[var33] != null) {
               this.Field12517[var33].Method14493(0, 0, 0);
            }
         }

         this.Field12719 = new RgbImage[60];

         for(var33 = 0; var33 <= 24; ++var33) {
            this.Field12719[var33] = new RgbImage("skills/" + var33, 0.5F);
         }

         this.Field12719[50] = new RgbImage("Lunar/LUNARON_35");
         this.drawLoadingText(60, "Unpacking textures");
         Rasterizer.unpackTextures();
         Rasterizer.calculatePalette(0.6D);
         Rasterizer.resetTextures();
         this.drawLoadingText(70, "Unpacking config");

         try {
            if (normalMem) {
               /*
                           Sequence.unpackConfig(configArchive);
            ObjectDef.unpackConfig(configArchive);
            Floor.unpackConfig(configArchive);
            ItemDef.unpackConfig(configArchive);
            NpcDef.unpackConfig(configArchive);
            IdentityKit.unpackConfig(configArchive);
            SpotAnim.unpackConfig(configArchive);
            SettingUsagePointers.unpackConfig(configArchive);
            VarBit.unpackConfig(configArchive);
            ItemDef.enable_members_items = isMembers;
                */
               Sequence.Method8280(configArchive);
               ObjectDefinition.Method11940(configArchive);
               Floor.Method11898(configArchive);
               Floor.Method11899(configArchive);
               ItemDef.Method11906(configArchive);
               NPCDefinition.Method11889(configArchive);
               IdentityKit.Method11929(configArchive);
               SpotAnim.Method8308(configArchive);
               SettingUsagePointers.Method1850(configArchive);
               VarBit.Method1736(configArchive);
               Class567.Method8810(configArchive);
               ItemDef.enableMembersItems = true;
               TextureData.Method13527(1419, this.Field12526);
               Class120.Method1065(configArchive);
            } else {
               Sequence.Method8280(var24);
               ObjectDefinition.Method11940(var24);
               Floor.Method11898(var24);
               ItemDef.Method11906(var24);
               NPCDefinition.Method11889(var24);
               IdentityKit.Method11929(var24);
               SpotAnim.Method8308(var24);
               SettingUsagePointers.Method1850(var24);
               VarBit.Method1736(var24);
               ItemDef.enableMembersItems = true;
               TextureData.Method13527(1419, this.Field12526);
               Class120.Method1065(configArchive);
            }
         } catch (Exception var10) {
            var10.printStackTrace();
            System.exit(0);
         }

         this.drawLoadingText(80, "Unpacking sounds");
         byte[] var37 = soundArchive.readConfig("sounds.dat");
         Class104.Method863(new Packet(var37));
         this.drawLoadingText(90, "Unpacking interfaces");
         RSFont[] fonts = new RSFont[]{smallFont, plainFont, boldFont, fancyFont};
         RSInterface.unpack(interfaceArchive, fonts, mediaArchive);
         this.drawLoadingText(99, "Preparing game engine");
         var21 = 0;

         while(var21 < 4) {
            try {
               Class280.Method2988().Method3004().Method3011("loginkey", 10);
               Field12100 = new Class773(Signlink.cacheDirectory() + "/loginkey", (String)null);
               Field12116 = true;
               break;
            } catch (Exception var11) {
               Field12116 = false;
               var11.printStackTrace();
               (new File(Signlink.cacheDirectory() + "/loginkey")).delete();

               try {
                  Thread.sleep(500L);
               } catch (Exception var9) {
                  var9.printStackTrace();
               }

               ++var21;
            }
         }

         if (Field12100 != null && !Field12100.Method13190()) {
            Field12100 = null;
            Field12116 = false;
         }

         SceneGraph.Method8885(50);
         this.drawLoadingText(100, "Preparing game engine");
         this.Method13231();

         for(var21 = 0; var21 < 33; ++var21) {
            var2 = 0;
            var3 = 0;

            for(var4 = 0; var4 < 34; ++var4) {
               if (this.Field12633.Field9650[var4 + var21 * this.Field12633.Field9652] == 0) {
                  if (var2 == 0) {
                     var2 = var4;
                  }
               } else if (var2 != 0) {
                  var3 = var4;
                  break;
               }
            }

            this.Field12443[var21] = var2;
            this.Field12515[var21] = var3 - var2;
         }

         for(var21 = 5; var21 < 156; ++var21) {
            var2 = 999;
            var3 = 0;

            for(var4 = 20; var4 < 172; ++var4) {
               if (this.Field12633.Field9650[var4 + var21 * this.Field12633.Field9652] != 0 || var4 <= 34 && var21 <= 34) {
                  if (var2 != 999) {
                     var3 = var4;
                     break;
                  }
               } else if (var2 == 999) {
                  var2 = var4;
               }
            }

            this.Field12507[var21 - 5] = var2 - 20;
            this.Field12654[var21 - 5] = var3 - var2;
            if (this.Field12654[var21 - 5] == -20) {
               this.Field12654[var21 - 5] = 152;
            }
         }

         this.Field12654[0] = 22;
         this.Field12654[1] = 34;
         this.Field12654[2] = 42;
         this.Field12654[3] = 50;
         this.Field12654[4] = 56;
         this.Field12654[5] = 60;
         this.Field12654[6] = 66;
         this.Field12654[7] = 70;
         this.Field12654[8] = 74;
         this.Field12654[9] = 78;
         this.Field12654[10] = 82;
         this.Field12654[11] = 84;
         this.Field12654[12] = 88;
         this.Field12654[13] = 90;
         this.Field12654[14] = 94;
         this.Field12654[15] = 96;
         this.Field12654[16] = 98;
         this.Field12654[17] = 102;
         this.Field12654[18] = 104;
         this.Field12654[19] = 106;
         this.Field12654[20] = 108;
         this.Field12654[21] = 110;
         this.Field12654[22] = 112;
         this.Field12654[23] = 114;
         this.Field12654[24] = 116;
         this.Field12654[25] = 118;
         this.Field12654[26] = 120;
         this.Field12654[27] = 122;
         this.Field12654[28] = 122;
         this.Field12654[29] = 124;
         this.Field12654[30] = 126;
         this.Field12654[31] = 128;
         this.Field12654[32] = 128;
         this.Field12654[33] = 130;
         this.Field12654[34] = 132;
         this.Field12654[35] = 132;
         this.Field12654[36] = 134;
         this.Field12654[37] = 136;
         this.Field12654[38] = 136;
         this.Field12654[39] = 138;
         this.Field12654[40] = 138;
         this.Field12654[41] = 140;
         this.Field12654[42] = 140;
         this.Field12654[43] = 142;
         this.Field12654[44] = 142;
         this.Field12654[45] = 144;
         this.Field12654[46] = 144;
         this.Field12654[47] = 144;
         this.Field12654[48] = 146;
         this.Field12654[49] = 146;
         this.Field12654[50] = 148;
         this.Field12654[51] = 148;
         this.Field12654[52] = 148;
         this.Field12654[53] = 150;
         this.Field12654[54] = 150;
         this.Field12654[55] = 150;
         this.Field12654[56] = 150;
         this.Field12654[57] = 152;
         this.Field12654[58] = 152;
         this.Field12654[59] = 152;
         this.Field12654[60] = 152;
         this.Field12654[61] = 152;
         this.Field12654[62] = 154;
         this.Field12654[63] = 154;
         this.Field12654[64] = 154;
         this.Field12654[65] = 154;
         this.Field12654[66] = 154;
         this.Field12654[67] = 154;
         this.Field12654[68] = 156;
         this.Field12654[69] = 156;
         this.Field12654[70] = 156;
         this.Field12654[71] = 156;
         this.Field12654[72] = 156;
         this.Field12654[73] = 156;
         this.Field12654[74] = 156;
         this.Field12654[75] = 156;
         this.Field12654[150] = 22;
         this.Field12654[149] = 34;
         this.Field12654[148] = 42;
         this.Field12654[147] = 50;
         this.Field12654[146] = 56;
         this.Field12654[145] = 60;
         this.Field12654[144] = 66;
         this.Field12654[143] = 70;
         this.Field12654[142] = 74;
         this.Field12654[141] = 78;
         this.Field12654[140] = 82;
         this.Field12654[139] = 84;
         this.Field12654[138] = 88;
         this.Field12654[137] = 90;
         this.Field12654[136] = 94;
         this.Field12654[135] = 96;
         this.Field12654[134] = 98;
         this.Field12654[133] = 102;
         this.Field12654[132] = 104;
         this.Field12654[131] = 106;
         this.Field12654[130] = 108;
         this.Field12654[129] = 110;
         this.Field12654[128] = 112;
         this.Field12654[127] = 114;
         this.Field12654[126] = 116;
         this.Field12654[125] = 118;
         this.Field12654[124] = 120;
         this.Field12654[123] = 122;
         this.Field12654[122] = 122;
         this.Field12654[121] = 124;
         this.Field12654[120] = 126;
         this.Field12654[119] = 128;
         this.Field12654[118] = 128;
         this.Field12654[117] = 130;
         this.Field12654[116] = 132;
         this.Field12654[115] = 132;
         this.Field12654[114] = 134;
         this.Field12654[113] = 136;
         this.Field12654[112] = 136;
         this.Field12654[111] = 138;
         this.Field12654[110] = 138;
         this.Field12654[109] = 140;
         this.Field12654[108] = 140;
         this.Field12654[107] = 142;
         this.Field12654[106] = 142;
         this.Field12654[105] = 144;
         this.Field12654[104] = 144;
         this.Field12654[103] = 144;
         this.Field12654[102] = 146;
         this.Field12654[101] = 146;
         this.Field12654[100] = 148;
         this.Field12654[99] = 148;
         this.Field12654[98] = 148;
         this.Field12654[97] = 150;
         this.Field12654[96] = 150;
         this.Field12654[95] = 150;
         this.Field12654[94] = 150;
         this.Field12654[93] = 152;
         this.Field12654[92] = 152;
         this.Field12654[91] = 152;
         this.Field12654[90] = 152;
         this.Field12654[89] = 152;
         this.Field12654[88] = 154;
         this.Field12654[87] = 154;
         this.Field12654[86] = 154;
         this.Field12654[85] = 154;
         this.Field12654[84] = 154;
         this.Field12654[83] = 154;
         this.Field12654[82] = 156;
         this.Field12654[81] = 156;
         this.Field12654[80] = 156;
         this.Field12654[79] = 156;
         this.Field12654[78] = 156;
         this.Field12654[77] = 156;
         this.Field12654[76] = 156;
         this.Field12654[75] = 156;
         this.Field12507[0] = 67;
         this.Field12507[1] = 61;
         this.Field12507[2] = 57;
         this.Field12507[3] = 53;
         this.Field12507[4] = 50;
         this.Field12507[5] = 48;
         this.Field12507[6] = 45;
         this.Field12507[7] = 43;
         this.Field12507[8] = 41;
         this.Field12507[9] = 39;
         this.Field12507[10] = 37;
         this.Field12507[11] = 36;
         this.Field12507[12] = 34;
         this.Field12507[13] = 33;
         this.Field12507[14] = 31;
         this.Field12507[15] = 30;
         this.Field12507[16] = 29;
         this.Field12507[17] = 28;
         this.Field12507[18] = 27;
         this.Field12507[19] = 26;
         this.Field12507[20] = 25;
         this.Field12507[21] = 24;
         this.Field12507[22] = 23;
         this.Field12507[23] = 22;
         this.Field12507[24] = 21;
         this.Field12507[25] = 20;
         this.Field12507[26] = 19;
         this.Field12507[27] = 18;
         this.Field12507[28] = 17;
         this.Field12507[29] = 17;
         this.Field12507[30] = 16;
         this.Field12507[31] = 15;
         this.Field12507[32] = 14;
         this.Field12507[33] = 14;
         this.Field12507[34] = 13;
         this.Field12507[35] = 12;
         this.Field12507[36] = 12;
         this.Field12507[37] = 11;
         this.Field12507[38] = 10;
         this.Field12507[39] = 10;
         this.Field12507[40] = 9;
         this.Field12507[41] = 9;
         this.Field12507[42] = 8;
         this.Field12507[43] = 8;
         this.Field12507[44] = 7;
         this.Field12507[45] = 7;
         this.Field12507[46] = 6;
         this.Field12507[47] = 6;
         this.Field12507[48] = 6;
         this.Field12507[49] = 5;
         this.Field12507[50] = 5;
         this.Field12507[51] = 4;
         this.Field12507[52] = 4;
         this.Field12507[53] = 4;
         this.Field12507[54] = 3;
         this.Field12507[55] = 3;
         this.Field12507[56] = 3;
         this.Field12507[57] = 3;
         this.Field12507[58] = 2;
         this.Field12507[59] = 2;
         this.Field12507[60] = 2;
         this.Field12507[61] = 2;
         this.Field12507[62] = 1;
         this.Field12507[63] = 1;
         this.Field12507[64] = 1;
         this.Field12507[65] = 1;
         this.Field12507[66] = 1;
         this.Field12507[67] = 1;
         this.Field12507[68] = 0;
         this.Field12507[69] = 0;
         this.Field12507[70] = 0;
         this.Field12507[71] = 0;
         this.Field12507[72] = 0;
         this.Field12507[73] = 0;
         this.Field12507[74] = 0;
         this.Field12507[75] = 0;
         this.Field12507[150] = 67;
         this.Field12507[149] = 61;
         this.Field12507[148] = 57;
         this.Field12507[147] = 53;
         this.Field12507[146] = 50;
         this.Field12507[145] = 48;
         this.Field12507[144] = 45;
         this.Field12507[143] = 43;
         this.Field12507[142] = 41;
         this.Field12507[141] = 39;
         this.Field12507[140] = 37;
         this.Field12507[139] = 36;
         this.Field12507[138] = 34;
         this.Field12507[137] = 33;
         this.Field12507[136] = 31;
         this.Field12507[135] = 30;
         this.Field12507[134] = 29;
         this.Field12507[133] = 28;
         this.Field12507[132] = 27;
         this.Field12507[131] = 26;
         this.Field12507[130] = 25;
         this.Field12507[129] = 24;
         this.Field12507[128] = 23;
         this.Field12507[127] = 22;
         this.Field12507[126] = 21;
         this.Field12507[125] = 20;
         this.Field12507[124] = 19;
         this.Field12507[123] = 18;
         this.Field12507[122] = 17;
         this.Field12507[121] = 17;
         this.Field12507[120] = 16;
         this.Field12507[119] = 15;
         this.Field12507[118] = 14;
         this.Field12507[117] = 14;
         this.Field12507[116] = 13;
         this.Field12507[115] = 12;
         this.Field12507[114] = 12;
         this.Field12507[113] = 11;
         this.Field12507[112] = 10;
         this.Field12507[111] = 10;
         this.Field12507[110] = 9;
         this.Field12507[109] = 9;
         this.Field12507[108] = 8;
         this.Field12507[107] = 8;
         this.Field12507[106] = 7;
         this.Field12507[105] = 7;
         this.Field12507[104] = 6;
         this.Field12507[103] = 6;
         this.Field12507[102] = 6;
         this.Field12507[101] = 5;
         this.Field12507[100] = 5;
         this.Field12507[99] = 4;
         this.Field12507[98] = 4;
         this.Field12507[97] = 4;
         this.Field12507[96] = 3;
         this.Field12507[95] = 3;
         this.Field12507[94] = 3;
         this.Field12507[93] = 3;
         this.Field12507[92] = 2;
         this.Field12507[91] = 2;
         this.Field12507[90] = 2;
         this.Field12507[89] = 2;
         this.Field12507[88] = 1;
         this.Field12507[87] = 1;
         this.Field12507[86] = 1;
         this.Field12507[85] = 1;
         this.Field12507[84] = 1;
         this.Field12507[83] = 1;
         this.Field12507[82] = 0;
         this.Field12507[81] = 0;
         this.Field12507[80] = 0;
         this.Field12507[79] = 0;
         this.Field12507[78] = 0;
         this.Field12507[77] = 0;
         this.Field12507[76] = 0;
         this.Field12507[75] = 0;

         Censor.loadConfig(wordencArchive);
         this.mouseDetection = new MouseDetection(this);
         this.startRunnable(this.mouseDetection, 10);
         ObjectInstance.clientInstance = this;
         ObjectDefinition.clientInstance = this;
         NPCDefinition.clientInstance = this;
         Class280.Method2988().Method2997(Field12106);
         int[] var30 = new int[]{40, 34, 111, 19, 11, 61};

         for(var3 = 0; var3 < 6; ++var3) {
            var2 = var30[var3];
            Rasterizer.Field9963[var2] = true;
            Rasterizer.Method9429(var2);
         }

         for(var2 = 0; var2 < Rasterizer.Field9950; ++var2) {
            if (Texture.Field1931[var2]) {
               Rasterizer.Method9429(var2);
            }
         }

         this.Field12164 = true;
         Field12263 = true;
         this.Field12165 = true;
         return true;
      } catch (Exception var17) {
         var17.printStackTrace();
         Signlink.reporterror("loaderror " + this.Field12505 + " " + this.Field12538);
         this.Field12383 = true;
         return false;
      }
   }

   private void updateOtherPlayerMovements(Packet stream, int i) {
      
      int var3;
      while(stream.Field1261 + 10 < i << 3 && (var3 = stream.gbits(11)) != 2047) {
         this.session_players[var3] = new Player();
         if (this.Field12368[var3] != null) {
            this.session_players[var3].Method9339(this.Field12368[var3]);
         }

         this.session_player_list[session_player_count++] = var3;

         Player var4 = this.session_players[var3];
         var4.time = currentTime;
//player.ah_2 = currentTime;
         if (stream.gbits(1) == 1) {
            this.session_npcs_awaiting_update[this.sessionNpcsAwaitingUpdatePtr++] = var3;
         }

         var3 = stream.gbits(1);
         int var5;
         if ((var5 = stream.gbits(6)) > 31) {
            var5 -= 64;
         }

         int var6;
         if ((var6 = stream.gbits(6)) > 31) {
            var6 -= 64;
         }

         //var4.u_29 = true;
         //var4.v_16 = false;
         var4.Method9109(session_player.appearanceColours[0] + var6, session_player.appearanceModels[0] + var5, var3 == 1);
      }

      stream.Method14524();
   }

   private static boolean Method13353(int var0, int var1, int var2, int var3, int var4) {
      var0 -= var3;
      var1 -= var4;
      return Math.sqrt((double)(var0 * var0 + var1 * var1)) <= (double)var2;
   }

   private static String Method13354(int var0) {
      return var0 < 999999999 ? String.valueOf(var0) : "*";
   }

   private void Method13355(Mobile var1, boolean var2, float var3) {
      var1.Field1275 = false;
      ++var1.Field1276;
      int var4 = 128 * (SceneGraph.mapSizeWidth - 1);
      if (!var2 && (var1.boundExtentX < 128 || var1.boundExtentY < 128 || var1.boundExtentX >= var4 || var1.boundExtentY >= var4)) {
         var1.animation = -1;
         var1.gfxId = -1;
         var1.Method14450();
         var1.Field1328 = 0;
         var1.Field1329 = 0;
         var1.boundExtentX = (var1.pathX[0] << 7) + (var1.boundDim << 6);
         var1.boundExtentY = (var1.pathY[0] << 7) + (var1.boundDim << 6);
         var1.resetPath();
      }

      int var5;
      int var6;
      int var9;
      int var10;
      int var11;
      Sequence var22;
      if (var1.Field1328 > currentTime) {
         var5 = var1.Field1328 - currentTime;
         var6 = (var1.Field1324 + Field12494 << 7) + (var1.boundDim << 6);
         var9 = (var1.Field1326 + Field12495 << 7) + (var1.boundDim << 6);
         var1.boundExtentX += (var6 - var1.boundExtentX) / var5;
         var1.boundExtentY += (var9 - var1.boundExtentY) / var5;
         var1.Field1284 = 0;
         if (var1.Field1330 == 0) {
            var1.Field1289 = 1024;
         }

         if (var1.Field1330 == 1) {
            var1.Field1289 = 1536;
         }

         if (var1.Field1330 == 2) {
            var1.Field1289 = 0;
         }

         if (var1.Field1330 == 3) {
            var1.Field1289 = 512;
         }
      } else {
         int var12;
         if (var1.Field1329 >= currentTime) {
            if (var1.Field1329 == currentTime || var1.animation == -1 || var1.animationDelay != 0 || (double)(var1.Field1308 + 1) > Sequence.anims[var1.animation].Method8283(var1.Field1307)) {
               var5 = var1.Field1329 - var1.Field1328;
               var6 = currentTime - var1.Field1328;
               var9 = (var1.Field1324 + Field12494 << 7) + (var1.boundDim << 6);
               var10 = (var1.Field1326 + Field12495 << 7) + (var1.boundDim << 6);
               var11 = (var1.Field1325 + Field12494 << 7) + (var1.boundDim << 6);
               var12 = (var1.Field1327 + Field12495 << 7) + (var1.boundDim << 6);
               if (var5 == 0) {
                  var5 = 1;
               }

               var1.boundExtentX = (var9 * (var5 - var6) + var11 * var6) / var5;
               var1.boundExtentY = (var10 * (var5 - var6) + var12 * var6) / var5;
            }

            var1.Field1284 = 0;
            if (var1.Field1330 == 0) {
               var1.Field1289 = 1024;
            }

            if (var1.Field1330 == 1) {
               var1.Field1289 = 1536;
            }

            if (var1.Field1330 == 2) {
               var1.Field1289 = 0;
            }

            if (var1.Field1330 == 3) {
               var1.Field1289 = 512;
            }

            var1.Field1333 = var1.Field1289;
         } else {
            var1.anInt = var1.standAnimIndex;
            if (var1.pathLength == 0) {
               var1.Field1284 = 0;
            } else {
               label573: {
                  if (var1.animation != -1 && var1.animationDelay == 0 && (var22 = Sequence.anims[var1.animation]) != null) {
                     if (var1.anInt1542 > 0 && var22.Field10152 == 0) {
                        ++var1.Field1284;
                        break label573;
                     }

                     if (var1.anInt1542 <= 0 && var22.priority == 0) {
                        ++var1.Field1284;
                        break label573;
                     }
                  }

                  var9 = var1.boundExtentX;
                  var10 = var1.boundExtentY;
                  var11 = (var1.pathX[var1.pathLength - 1] << 7) + (var1.boundDim << 6);
                  var12 = (var1.pathY[var1.pathLength - 1] << 7) + (var1.boundDim << 6);
                  if (var2 || var11 - var9 <= 256 && var11 - var9 >= -256 && var12 - var10 <= 256 && var12 - var10 >= -256) {
                     if (var9 < var11) {
                        if (var10 < var12) {
                           var1.Field1289 = 1280;
                        } else if (var10 > var12) {
                           var1.Field1289 = 1792;
                        } else {
                           var1.Field1289 = 1536;
                        }
                     } else if (var9 > var11) {
                        if (var10 < var12) {
                           var1.Field1289 = 768;
                        } else if (var10 > var12) {
                           var1.Field1289 = 256;
                        } else {
                           var1.Field1289 = 512;
                        }
                     } else if (var10 < var12) {
                        var1.Field1289 = 1024;
                     } else {
                        var1.Field1289 = 0;
                     }

                     int var13;
                     if ((var13 = var1.Field1289 - var1.Field1333 & 2047) > 1024) {
                        var13 -= 2048;
                     }

                     int var14 = var1.turn180AnimIndex;
                     if (var13 >= -256 && var13 <= 256) {
                        var14 = var1.walkAnimIndex;
                     } else if (var13 >= 256 && var13 < 768) {
                        var14 = var1.turn90CCWAnimIndex;
                     } else if (var13 >= -768 && var13 <= -256) {
                        var14 = var1.turn90CWAnimIndex;
                     }

                     if (var14 == -1) {
                        var14 = var1.walkAnimIndex;
                     }

                     var1.anInt = var14;
                     float var18 = 5.0F;
                     if (var1.Field1333 != var1.Field1289 && var1.interactingEntity == -1 && var1.degreesToTurn != 0) {
                        var18 = 2.0F;
                     }

                     if (var1.pathLength > 1) {
                        var18 = (float)(1 + (var1.pathLength << 1));
                     }

                     if (var1.Field1284 > 0) {
                        --var1.Field1284;
                        var18 += 5.0F;
                     }

                     if (var1.pathRun[var1.pathLength - 1]) {
                        var18 *= 2.0F;
                        if (var1.anInt == var1.walkAnimIndex && var1.runAnimIndex != -1) {
                           var1.anInt = var1.runAnimIndex;
                        }
                     }

                     var18 = (float)Math.round(var18 * var3);
                     if (var9 < var11) {
                        var1.boundExtentX = (int)((float)var1.boundExtentX + var18);
                        if (var1.boundExtentX > var11) {
                           var1.boundExtentX = var11;
                        }
                     } else if (var9 > var11) {
                        var1.boundExtentX = (int)((float)var1.boundExtentX - var18);
                        if (var1.boundExtentX < var11) {
                           var1.boundExtentX = var11;
                        }
                     }

                     if (var10 < var12) {
                        var1.boundExtentY = (int)((float)var1.boundExtentY + var18);
                        if (var1.boundExtentY > var12) {
                           var1.boundExtentY = var12;
                        }
                     } else if (var10 > var12) {
                        var1.boundExtentY = (int)((float)var1.boundExtentY - var18);
                        if (var1.boundExtentY < var12) {
                           var1.boundExtentY = var12;
                        }
                     }

                     if (var1.boundExtentX == var11 && var1.boundExtentY == var12) {
                        --var1.pathLength;
                        if (var1.anInt1542 > 0) {
                           --var1.anInt1542;
                        }
                     }

                     if (var1 == session_player) {
                        this.Field12274 = true;
                     }
                  } else {
                     var1.boundExtentX = var11;
                     var1.boundExtentY = var12;
                  }
               }
            }
         }
      }

      if (var1.degreesToTurn != 0) {
         Npc var19;
         if (var1.interactingEntity != -1 && var1.interactingEntity < 32768 && (var19 = this.Field12327[var1.interactingEntity]) != null) {
            var9 = var1.boundExtentX - var19.boundExtentX; //could be wrong
            var10 = var1.boundExtentY - var19.boundExtentY;
            if (var9 != 0 || var10 != 0) {
               var1.Field1289 = (int)(Math.atan2((double)var9, (double)var10) * 325.949D) & 2047;
            }
         }

         if (var1.interactingEntity >= 32768) {
            if ((var6 = var1.interactingEntity - '耀') == this.Field12357) {
               var6 = this.Field12362;
            }

            Player var23;
            if ((var23 = this.session_players[var6]) != null) {
               var10 = var1.boundExtentX - var23.Field4194;
               var11 = var1.boundExtentY - var23.Field4195;
               if (var10 != 0 || var11 != 0) {
                  var1.Field1289 = (int)(Math.atan2((double)var10, (double)var11) * 325.949D) & 2047;
               }
            }
         }

         if ((var1.Field1319 != 0 || var1.Field1320 != 0) && (var1.pathLength == 0 || var1.Field1284 > 0)) {
            var6 = var1.boundExtentX - (var1.Field1319 - Field12490 - Field12490 << 6);
            var9 = var1.boundExtentY - (var1.Field1320 - Field12491 - Field12491 << 6);
            if (var6 != 0 || var9 != 0) {
               var1.Field1289 = (int)(Math.atan2((double)var6, (double)var9) * 325.949D) & 2047;
            }

            var1.Field1319 = 0;
            var1.Field1320 = 0;
         }

         if ((var6 = var1.Field1289 - var1.Field1333 & 2047) != 0) {
            var9 = var1.degreesToTurn;
            if (var1.boundDim == 3) {
               var9 = 28;
            } else if (var1.boundDim == 4) {
               var9 = 24;
            } else if (var1.boundDim >= 5) {
               var9 = 20;
            }

            var9 = Math.round((float)var9 * var3);
            if (Math.abs(var1.Field1333 - var1.Field1289) - var9 < 0) {
               var9 = 0;
               var1.Field1333 = var1.Field1289;
            }

            if (var6 >= var1.degreesToTurn && var6 <= 2048 - var1.degreesToTurn) {
               if (var6 > 1024) {
                  var1.Field1333 -= var9;
               } else {
                  var1.Field1333 += var9;
               }
            } else {
               var1.Field1333 = var1.Field1289;
            }

            var1.Field1333 &= 2047;
            if (var1.Field1279) {
               var1.Field1333 = var1.Field1289;
            }

            if (var1.anInt == var1.standAnimIndex && var1.Field1333 != var1.Field1289) {
               if (var1.standTurnAnimIndex != -1) {
                  var1.anInt = var1.standTurnAnimIndex;
               } else {
                  var1.anInt = var1.walkAnimIndex;
               }
            }
         }
      }

      float var17 = var3;
      Mobile var16 = var1;

      try {
         label558: {
            var16.aBoolean1541 = false;
            double var25;
            if (var16.anInt != -1) {
               if (var16.anInt >= Sequence.anims.length) {
                  break label558;
               }

               Sequence var20;
               if ((var20 = Sequence.anims[var16.anInt]) != null) {
                  var16.Field1297 += var17 * 1.0F;
                  var16.Field1296 = Math.round(var16.Field1297);
                  double var29 = 1.0D;
                  if (var16.anInt == 63 || var16.anInt == 4298) {
                     var29 = 9.0D;
                  }

                  while(var16.anInt1527 < var20.Field10141 && (double)var16.Field1297 > var20.Method8283(var16.anInt1527) / var29) {
                     var25 = var20.Method8283(var16.anInt1527);
                     var16.Field1296 = (int)((double)var16.Field1296 - var25);
                     var16.Field1297 = (float)((double)var16.Field1297 - var25);
                     ++var16.anInt1527;
                  }

                  if (var16.anInt1527 >= var20.Field10141 || var16.Field1296 >= var20.Field10141) {
                     var16.Field1296 = 1;
                     var16.Field1297 = 1.0F;
                     var16.anInt1527 = 0;
                  }

                  var16.Field1339 = var16.anInt1527 + 1;
                  if (var16.Field1339 >= var20.Field10141) {
                     var16.Field1339 = 0;
                  }
               }
            }

            LinkedList var21 = new LinkedList();
            Iterator var24 = var16.Method9119().iterator();

            label404:
            while(true) {
               while(true) {
                  Class595 var30;
                  do {
                     do {
                        if (!var24.hasNext()) {
                           var16.Method9116(var21);
                           var21.clear();
                           if (var16.animation >= Sequence.anims.length) {
                              var16.animation = -1;
                           }

                           if (var16.animation != -1 && var16.animationDelay <= 1 && (var22 = Sequence.anims[var16.animation]) != null && var22.Field10152 == 1 && var16.anInt1542 > 0 && var16.Field1328 <= currentTime && var16.Field1329 < currentTime) {
                              var16.animationDelay = 1;
                              var16.Field1311 = 1.0F;
                           } else {
                              if (var16.animation != -1 && var16.animationDelay == 0 && (var22 = Sequence.anims[var16.animation]) != null) {
                                 var16.Field1309 += var17 * 1.0F;

                                 for(var16.Field1308 = Math.round(var16.Field1309); var16.Field1307 < var22.Field10141 && (double)var16.Field1308 > var22.Method8283(var16.Field1307); var16.Field1308 = Math.round(var16.Field1309)) {
                                    ++var16.Field1307;
                                    var10 = var22.Field10141 - 1;
                                    if (var16.Field1307 > var10) {
                                       var16.Field1307 = var10;
                                    }

                                    var25 = var22.Method8283(var16.Field1307);
                                    var16.Field1309 = (float)((double)var16.Field1309 - var25);
                                 }

                                 if (var16.Field1307 >= var22.Field10141) {
                                    var16.Field1307 -= var22.Field10145;
                                    ++var16.Field1312;
                                    if (var16.Field1312 >= var22.Field10151) {
                                       var16.animation = -1;
                                    }

                                    if (var16.Field1307 < 0 || var16.Field1307 >= var22.Field10141) {
                                       var16.animation = -1;
                                    }
                                 }

                                 var16.Field1341 = var16.Field1307 + 1;
                                 if (var16.Field1341 >= var22.Field10141) {
                                    if (var16.Field1312 >= var22.Field10151) {
                                       var16.animation = -1;
                                    }

                                    if (var16.Field1341 < 0 || var16.Field1341 >= var22.Field10141) {
                                       var16.animation = -1;
                                    }
                                 }

                                 var16.aBoolean1541 = var22.Field10147;
                              }

                              if (var16.animationDelay > 0) {
                                 var16.Field1311 -= var17 * 1.0F;
                                 var16.animationDelay = Math.round(var16.Field1311);
                                 if (var16.animationDelay < 0) {
                                    var16.animationDelay = 0;
                                    var16.Field1311 = 0.0F;
                                 }
                              }
                           }
                           break label404;
                        }

                        var30 = (Class595)var24.next();
                        var16.Method9120(var30);
                     } while(var16.gfxId == -1);
                  } while(currentTime < var16.Field1302);

                  if (var16.Field1299 < 0) {
                     var16.Field1299 = 0;
                  }

                  if (var16.gfxId >= SpotAnim.Field10094.length) {
                     var16.Method9118(var16.gfxId);
                     var16.gfxId = -1;
                     var21.add(var30);
                  } else {
                     SpotAnim var26;
                     Sequence var10000 = (var26 = SpotAnim.Field10094[var16.gfxId]) == null ? null : var26.Field10098;
                     Sequence var27 = var10000;
                     if (var10000 == null) {
                        var21.add(var30);
                     } else {
                        var16.Field1301 += var17 * 1.0F;

                        for(var16.Field1300 = Math.round(var16.Field1301); var16.Field1299 < var27.Field10141 && (double)var16.Field1300 > var27.Method8283(var16.Field1299); ++var16.Field1299) {
                           double var28 = var27.Method8283(var16.Field1299);
                           var16.Field1300 = (int)((double)var16.Field1300 - var28);
                           var16.Field1301 = (float)((double)var16.Field1301 - var28);
                        }

                        if (var16.Field1299 >= var27.Field10141 && (var16.Field1299 < 0 || var16.Field1299 >= var27.Field10141)) {
                           var16.gfxId = -1;
                           var21.add(var30);
                        }

                        var16.Field1340 = var16.Field1299 + 1;
                        if (var16.Field1340 >= var27.Field10141 && (var16.Field1340 < 0 || var16.Field1340 >= var27.Field10141)) {
                           var16.Field1302 = -1;
                        }

                        var30.Field1269 = var16.Field1301;
                        var30.Field1268 = var16.Field1303;
                        var30.Field1266 = var16.gfxId;
                        var30.Field1267 = var16.Field1302;
                        var30.Field1270 = var16.Field1299;
                     }
                  }
               }
            }
         }
      } catch (Exception var15) {
         var15.printStackTrace();
         if (var1 != null) {
            var1.animationDelay = 0;
         }
      }

      var1.Field1279 = false;
   }

   private void Method13356() {
      if (this.Field12418 != null) {
         this.Field12418.Method14450();
         if (this.Field12413 != null) {
            this.Field12413.Method14450();
         }

         this.Field12418 = null;
         this.Field12413 = null;
         this.Field12412 = null;
      }

      ++this.Field12683;
      if (Player.aBoolean) {
         Player.Method14457();
      }

      int var2 = Field12341;
      int var3 = Field12342;
      int var4 = Field12343;
      int var5 = Field12344;
      int var6 = Field12345;
      int var7 = 0;
      Client var8;
      int var14;
      int var15;
      int var17;
      int var19;
      int var20;
      int var21;
      boolean var22;
      int var28;
      int var29;
      int var31;
      int var33;
      int var37;
      if (Field12593) {
         Player.Field4177 = 0;
         if (Field12119) {
            this.Method13288(true);
         }

         this.Method13264(true);
         this.Method13288(false);
         this.Method13264(false);
         if (GraphicsDisplay.Field2678 && GraphicsDisplay.Field2667 && GraphicsDisplay.Field2665) {
            if (Field12225) {
               if (Field12226 == null) {
                  Field12226 = new Class413(new ParticleDefinition());
               }

               Field12226.Method7371(Field12427);
            }
         } else if (Field12593) {
            Field12225 = false;
         }

         var8 = this;
         boolean var9 = this.Field12511.size() > 20;
         Iterator var11 = this.Field12511.iterator();

         label600:
         while(true) {
            while(var11.hasNext()) {
               Class489 var10;
               if ((var10 = (Class489)var11.next()).Field652 == Field12379 && currentTime <= var10.Field630) {
                  if (currentTime >= var10.Field629) {
                     Npc var12;
                     if (var10.Field646 > 0 && (var12 = var8.Field12327[var10.Field646 - 1]) != null && var12.Field4194 >= 0 && var12.Field4194 < 13312 && var12.Field4195 >= 0 && var12.Field4195 < 13312) {
                        var14 = var8.Method13277(var10.Field652, var12.Field4195, var12.Field4194) - var10.Field640;
                        var10.Method8094(currentTime, var12.Field4195, var14, var12.Field4194);
                     }

                     if (var10.Field646 < 0) {
                        Player var13;
                        if ((var33 = -var10.Field646 - 1) == var8.Field12357) {
                           var13 = session_player;
                        } else {
                           var13 = var8.session_players[var33];
                        }

                        if (var13 != null && var13.Field4194 >= 0 && var13.Field4194 < 13312 && var13.Field4195 >= 0 && var13.Field4195 < 13312) {
                           var10.Method8094(currentTime, var13.Field4195, var8.Method13277(var10.Field652, var13.Field4195, var13.Field4194) - var10.Field640, var13.Field4194);
                        }
                     }

                     var10.Field653 = var9;
                     var10.Method8099(Field12427);
                     Field12428.Method8865(var10.Field652, var10.Field650, (int)var10.Field643, var10.Field626, (int)var10.Field642, 60, (int)var10.Field641, var10, false);
                  }
               } else {
                  var8.Field12513.add(var10);
               }
            }

            var8.Field12511.removeAll(var8.Field12513);
            var8.Field12513.clear();
            var22 = (var8 = this).Field12512.size() > 20;
            Iterator var27 = var8.Field12512.iterator();

            while(true) {
               while(var27.hasNext()) {
                  Class490 var24;
                  (var24 = (Class490)var27.next()).Field263 = var22;
                  if (var24.Field254 == Field12379 && !var24.Field259) {
                     if (currentTime >= var24.Field258) {
                        var24.Method8099(Field12427);
                        if (var24.Field259) {
                           var8.Field12514.add(var24);
                        } else {
                           Field12428.Method8865(var24.Field254, 0, var24.Field257, var24.Field251, var24.Field256, 60, var24.Field255, var24, false);
                        }
                     }
                  } else {
                     var8.Field12514.add(var24);
                  }
               }

               var8.Field12512.removeAll(var8.Field12514);
               var8.Field12514.clear();
               var7 = Field12623;
               int var23 = Field12624 & 2047;
               byte var26 = 50;
               if (!Field12712) {
                  var26 = 90;
               } else if (height < 640) {
                  var26 = 0;
               }

               double var35;
               double var38;
               if ((var38 = Math.abs((var35 = (double)((float)this.Method13277(Field12379, session_player.Field4195, session_player.Field4194) - this.Field12301)) * var35) * 0.025D * Field12427) < 1.0D) {
                  var38 = 1.0D;
               }

               if (var35 > var38) {
                  var35 = var38;
               } else if (var35 < -var38) {
                  var35 = -var38;
               }

               this.Field12301 = (float)((double)this.Field12301 + var35);
               int var10004 = (int)this.Field12301 - var26;
               var37 = Field12476;
               var31 = var10004;
               var28 = Field12475;
               var29 = var7;
               var7 = Field12134;
               this.Field12294 = this.Field12293 = 2048;
               var14 = this.Field12294 - var29;
               var15 = this.Field12293 - var23 & 2047;
               int var16 = 0;
               var17 = 0;
               int var18 = var7;
               if (var14 >= 2048) {
                  var14 -= 2048;
               }

               if (var14 != 0) {
                  var19 = Rasterizer.Field9959[var14];
                  var20 = Rasterizer.Field9960[var14];
                  var21 = 0 * var20 - var7 * var19 >> 16;
                  var18 = 0 * var19 + var7 * var20 >> 16;
                  var17 = var21;
               }

               if (var15 != 0) {
                  var19 = Rasterizer.Field9959[var15];
                  var20 = Rasterizer.Field9960[var15];
                  var21 = var18 * var19 + 0 * var20 >> 16;
                  var18 = var18 * var20 - 0 * var19 >> 16;
                  var16 = var21;
               }

               Field12341 = var28 - var16;
               Field12342 = var31 - var17;
               Field12343 = var37 - var18;
               Field12344 = var29;
               Field12345 = var23;
               if (session_player != null && Rasterizer.Field9949) {
                  Field12341 = session_player.Field4194;
                  Field12343 = session_player.Field4195;
                  Field12342 = session_player.drawHeight - 190;
                  Field12134 = Method13401();
                  if (GraphicsDisplay.Field2678) {
                     GraphicsDisplay.Method997().Field2685 = true;
                  }
               }

               Field12344 = var29 - (Method13390() - 383);
               if (!this.Field12597) {
                  var7 = this.Method13375();
               } else {
                  var7 = this.Method13376();
               }
               break label600;
            }
         }
      }

      if (!this.Field12284) {
         this.Method13361();
         this.Field12284 = true;
      }

      Class697.Method14445(Field12300);
      Model.Field2880 = super.mouseEventX - 4;
      Model.Field2881 = super.mouseEventY - 4;
      if (GraphicsDisplay.Field2678) {
         GraphicsDisplay.Method997().Method1024();
      } else {
         Rasterizer.Method14458();
      }

      if (Field12248 != 0L && System.currentTimeMillis() - Field12248 > 250L || Field12379 != this.Field12456) {
         Field12248 = 0L;
         this.Field12456 = Field12379;
         if (GraphicsDisplay.Field2678 && GraphicsDisplay.Field2667) {
            Model.Field2749.submit(new Class876(this));
         } else {
            this.Field12061.Method3420(Field12379, false);
         }
      }

      if (class329 == null) {
         Field12428.Method8886(Field12341, Field12343, Field12345, Field12342, var7, Field12344, session_player.Field4194 - 6 >> 7, session_player.Field4195 - 6 >> 7, Field12379, Field12134);
         if (Model.Field2808 || !GraphicsDisplay.Field2678 || !GraphicsDisplay.Field2667) {
            Model.Method14524();
         }
      }

      Field12428.Method8868();
      if (GraphicsDisplay.Field2678) {
         GraphicsDisplay.Method997().Method1026(Field12427);
      } else {
         Rasterizer.Method14471();
         Rasterizer.Method14472();
      }

      this.ModelUtility();
      Field12128 = false;
      this.Method13271();
      if (this.Field12339 == 2) {
         this.Method13381((this.Field12389 - Field12490 << 7) + this.Field12392, this.Field12391 << 1, (this.Field12390 - Field12491 << 7) + this.Field12393);
         if (this.Field12440 >= 0 && currentTime % 20 < 10) {
            this.Field12555[0].Method14495(this.Field12440 - 12, this.Field12441 - 28);
         }
      }

      if (GraphicsDisplay.Field2678 && GraphicsDisplay.Field2667) {
         GraphicsDisplay.Method997().Method1025();
      }

      if (Field12593) {
         if (this.Field12279 != this.Field12282 || this.Field12280 != this.Field12283) {
            this.Field12279 = this.Field12282;
            this.Field12280 = this.Field12283;
            this.Method13395();
         }

         var8 = this;
         if (!Field12120) {
            var7 = 0;

            for(var29 = Field12113 ? 0 : 25; var29 < var8.Field12235.length && (var29 < 25 || Field12114); ++var29) {
               float var30;
               float var39 = (float)Math.round((float)(var31 = Math.round((var30 = var8.Field12235[var29]) / 10.0F)) / 6.0F) / 10.0F;
               if (var30 >= 0.0F) {
                  var14 = (Field12712 ? 490 : 485) - var7 * 30;
                  var15 = Field12712 ? height - 204 : 298;
                  if (!Field12712 && (var8.Field12479 == 197 || var8.Field12479 == 201)) {
                     var14 -= 65;
                  }

                  short var42 = 0;
                  if (var29 == 33) {
                     var42 = 4653;
                  } else if (var29 == 34) {
                     var42 = 15486;
                  } else if (var29 == 35) {
                     var42 = 526;
                  } else if (var29 == 36) {
                     var42 = 15333;
                  } else if (var29 == 37) {
                     var42 = 13736;
                  } else if (var29 == 38) {
                     var42 = 18359;
                  }

                  if (var42 > 0 && var8.Field12401[var29] == null) {
                     var8.Field12401[var29] = ItemDef.Method11915(var42, 20, false);
                     if (var8.Field12401[var29] != null) {
                        var8.Field12401[var29].Method9426();
                     }
                  }

                  RgbImage var43;
                  if ((var43 = var8.Field12401[var29]) != null) {
                     var8.Field12400.Method14495(var14, var15);
                     var19 = var8.Field12400.Field9894 + 1;
                     var20 = var8.Field12400.Field9895 + 1;
                     var21 = var19 - var43.Field9894;
                     var28 = var20 - var43.Field9895;
                     var33 = var21 / 2;
                     var28 /= 2;
                     var43.Method14495(var14 + var33, var15 + var28);
                     String var32 = String.valueOf(var31);
                     if (var31 > 60) {
                        var32 = String.valueOf(var39);
                     }

                     var31 = var32.length();
                     boolean var10001 = true;
                     var14 += 13;
                     var15 += 36;
                     smallFont.Method9447(0, var32, var15, var14);
                     smallFont.Method9447(16776960, var32, var15 - 1, var14 - 1);
                     ++var7;
                  }
               }
            }
         }

         var7 = Field12490 + (session_player.Field4194 - 6 >> 7);
         var29 = Field12491 + (session_player.Field4195 - 6 >> 7);
         var28 = !Field12712 && !GraphicsDisplay.Field2678 ? 12 : 8;
         this.Method13331();
         if (this.Field12378 == 1) {
            this.Field12586[this.Field12376 / 100].Method14495(this.Field12374 - var28, this.Field12375 - var28);
            ++Field12583;
         }

         if (this.Field12378 == 2) {
            this.Field12586[4 + this.Field12376 / 100].Method14495(this.Field12374 - var28, this.Field12375 - var28);
         }

         if (this.Field12480 != -1) {
            if (!Field12712) {
               byte var40 = 0;
               if (this.Field12480 == 197) {
                  var40 = -32;
               }

               if (this.Field12480 == 198) {
                  if (this.Field12479 == -1) {
                     this.Field12534.Method14495(480, 260);
                  } else {
                     this.Field12534.Method14495(471, 256);
                  }
               } else {
                  this.Method13362(0, -38, RSInterface.Field12749[this.Field12480], 4 - var40);
               }
            } else if (this.Field12480 < 300) {
               byte var41 = 0;
               if (this.Field12480 == 201) {
                  var41 = 32;
               }

               if (this.Field12480 == 198) {
                  this.Field12534.Method14495(width - 115, 172);
               } else {
                  this.Method13362(0, Field12714 + 60 - 40, RSInterface.Field12749[this.Field12480], -248 - var41);
               }
            }
         }

         if (this.Field12479 != -1) {
            if (!Field12712) {
               byte var36 = 0;
               if (this.Field12479 == 197) {
                  var36 = -32;
               }

               this.Method13362(0, 2, RSInterface.Field12749[this.Field12479], 4 - var36);
            } else if (this.Field12479 < 300) {
               byte var34 = 0;
               if (this.Field12479 == 201) {
                  var34 = 32;
               }

               this.Method13362(0, Field12714 + 60, RSInterface.Field12749[this.Field12479], -248 - var34);
            } else if (this.Field12479 == 15892) {
               if (Field12715 > 230) {
                  this.Method13362(0, Field12714 + 234, RSInterface.Field12749[this.Field12479], 212);
               } else {
                  this.Method13362(0, Field12714 + 19, RSInterface.Field12749[this.Field12479], 4);
               }
            } else if (this.Field12479 != 21100 && this.Field12479 != 11146) {
               this.Method13362(0, 4, RSInterface.Field12749[this.Field12479], 4);
            } else {
               this.Method13362(0, 3, RSInterface.Field12749[this.Field12479], 3);
            }
         }

         if (this.openInterfaceID != -1) {
            this.Method13239(false);
            this.Method13369();
            this.Method13362(0, 4, RSInterface.Field12749[this.openInterfaceID], 4);
         }

         this.Field12672 = 0;
         int var10000 = session_player.Field4194;
         var10000 = session_player.Field4195;
         if (!this.Field12358) {
            this.Method13338();
            this.Method13379();
         } else if (this.Field12430 == 0) {
            this.Method13275();
         }

         if (this.Field12510 == 1) {
            this.Field12553[0].Method14495(472, 296);
         }

         if (Field12592) {
            this.Method13367();
         }

         if (Field12081 || Field12080) {
            this.Method13368(var7, var29);
         }

         if (Field12109 > 0.0F) {
            var17 = (var15 = (int)(Field12109 / 10.0F)) / 60;
            var15 = (int)((float)var15 - (float)var17 * 60.0F);
            String var45 = String.valueOf(var15);
            if (var15 < 10) {
               var45 = "0" + var15;
            }

            String var46 = String.valueOf(var17);
            if (var17 < 10) {
               var46 = "0" + var17;
            }

            String var47 = "Double XP: ";
            if (var17 >= 60) {
               var21 = (int)(Field12109 / 60.0F / 60.0F / 10.0F);
               float var44 = (Field12109 - (float)(var21 * 60 * 60 * 10)) / 60.0F / 10.0F;
               if (var21 < 10) {
                  var46 = "0" + var21;
               } else {
                  var46 = String.valueOf(var21);
               }

               if (var44 < 10.0F) {
                  var45 = "0" + var44;
               } else {
                  var45 = String.valueOf(var44);
               }
            }

            if (Field12712) {
               smallFont.Method9448(0, var47 + var46 + ":" + var45, height - 347, width - 105 + 13);
               smallFont.Method9448(16776960, var47 + var46 + ":" + var45, height - 348, width - 106 + 13);
            } else {
               smallFont.Method9448(0, var47 + var46 + ":" + var45, 334, 429);
               smallFont.Method9448(16776960, var47 + var46 + ":" + var45, 333, 428);
            }
         }

         if (this.Field12561 != 0.0F) {
            var37 = (int)((float)(var33 = (int)(this.Field12561 / 50.0F)) / 60.0F);
            if ((var33 %= 60) < 10) {
               plainFont.Method9453(16776960, Field12129 + " update in: " + var37 + ":0" + var33, 329 + Field12715, 4);
            } else {
               plainFont.Method9453(16776960, Field12129 + " update in: " + var37 + ":" + var33, 329 + Field12715, 4);
            }
         }

         if (SceneGraph.Field971 != -1) {
            this.Field12259 = SceneGraph.Field971;
            this.Field12260 = SceneGraph.Field972;
            SceneGraph.Field971 = -1;
            SceneGraph.Field973 = 0;
         }

         if (Field12712) {
            if (class329 != null) {
               Model.Method14524();
               if (!class329.Method3389()) {
                  class329.Method3399();
               } else {
                  class329 = null;
                  this.Field12650 = 0;
                  Field12649 = true;
               }

               this.Field12604.Method13683();
            }

            this.Method13299();
            this.Field12061.Method3415();
            this.Method13240();
            this.Method13274();
            this.Method13243();
            this.Method13403();
            this.Field12604.Method3038(0, super.Method11952(), 0);
         } else {
            this.Method13299();
            if (!GraphicsDisplay.Field2678) {
               this.Method13286();
               this.Field12604.Method3038(4, super.Method11952(), 4);
               this.Field12318.Method3038(0, super.Method11952(), 0);
               this.Field12317.Method3038(4, super.Method11952(), 0);
               this.Field12319.Method3038(4, super.Method11952(), 516);
               if (this.Field12209 != null) {
                  this.Field12602.Method13683();
                  this.Field12602.Method3038(168 + Field12715, super.Method11952(), 519 + Field12714);
               }
            }

            if (class329 == null) {
               this.Method13243();
               this.Method13274();
            }
         }

         var22 = false;
         RSInterface var25;
         if (this.openInterfaceID != -1 && (var25 = RSInterface.Field12749[this.openInterfaceID]) != null) {
            var29 = var25 != null && var25.Field12758 < 512 ? 512 : var25.Field12758;
            var33 = var25 != null && var25.Field12811 < 334 ? 334 : var25.Field12811;
            if (super.mouseEventX >= this.Field12282 && super.mouseEventY >= this.Field12283 && super.mouseEventX <= this.Field12282 + var29 && this.p_34 <= this.Field12283 + var33) {
               var22 = true;
            }
         }

         if (!var22 && (super.mouseEventY <= 336 + Field12715 || super.mouseEventX > 520) && (super.mouseEventX < width - 210 || super.mouseEventY < height - 345)) {
            this.c_98 += this.d_91;
         }

         this.d_91 = 0;
         Field12341 = var2;
         Field12342 = var3;
         Field12343 = var4;
         Field12344 = var5;
         Field12345 = var6;
         this.Field12277 = false;
      }

      if (this.Field12706 != -1) {
         this.Field12675 = true;
         RSInterface var1;
         if (this.openInterfaceID != -1) {
            if ((var1 = RSInterface.Field12749[this.openInterfaceID]).Field12758 == 512 && var1.Field12811 == 334 && var1.Field12805 == 0) {
               var1.Field12758 = 765;
               var1.Field12811 = 503;
            }

            this.Method13362(0, 0, var1, 8);
         }

         if ((var1 = RSInterface.Field12749[this.Field12706]).Field12758 == 512 && var1.Field12811 == 334 && var1.Field12805 == 0) {
            var1.Field12758 = width;
            var1.Field12811 = height;
         }

         this.Method13362(0, 0, var1, 8);
         if (!this.Field12358) {
            this.Method13338();
            this.Method13379();
         }

         ++this.Field12705;
      } else {
         if (this.Field12705 != 0) {
            this.Method13337();
         }

         if (this.Field12675) {
            this.Field12675 = false;
            Field12649 = true;
            this.Field12560 = true;
            if (Field12483 != 2) {
               this.Field12604.Method3038(Field12712 ? 0 : 4, super.Method11952(), Field12712 ? 0 : 4);
               this.Field12603.Method3038(4, super.Method11952(), 545 + Field12714);
            }
         }

         if (this.Field12667 == 3) {
            Field12649 = true;
         }

         if (this.Field12542 == 3) {
            Field12649 = true;
         }

         if (this.Field12332 != null) {
            Field12649 = true;
         }

         if (this.Field12358 && this.Field12430 == 2) {
            Field12649 = true;
         }

         if (Field12649 && !Field12712) {
            Field12649 = false;
         }

         if (!Field12712) {
            this.Field12061.Method3415();
            this.Field12603.Method3038(-6, super.Method11952(), 519);
         }

      }
   }

   private void Method13357(int var1, int var2) {
      if (this.Field12276 == null) {
         this.Field12276 = new RgbImage("/Lunar/BOX_0");
         this.Field12276.Field9878 = Method13218("blackbox-000");
      }

      this.Field12276.Method892(var1 - 4, var2 - 4, 200);
   }

   public static int Method13358(int var0) {
      int var1 = 0;

      for(int var3 = 1; var3 <= 99; ++var3) {
         if ((int)Math.floor((double)((var1 = (int)((double)var1 + Math.floor((double)var3 + 300.0D * Math.pow(2.0D, (double)var3 / 7.0D)))) / 4)) >= var0) {
            return var3;
         }
      }

      return 99;
   }

   public static int Method13359(int var0) {
      int var1 = 0;
      int var2 = 0;

      for(int var3 = 1; var3 <= var0; ++var3) {
         var1 = (int)((double)var1 + Math.floor((double)var3 + 300.0D * Math.pow(2.0D, (double)var3 / 7.0D)));
         if (var3 >= var0) {
            return var2;
         }

         var2 = (int)Math.floor((double)(var1 / 4));
      }

      return 0;
   }

   private static String Method13360(int var0) {
      if (var0 >= 0 && var0 < 10000) {
         return String.valueOf(var0);
      } else if (var0 >= 10000 && var0 < 10000000) {
         return var0 / 1000 + "K";
      } else if (var0 >= 10000000 && var0 < 999999999) {
         return var0 / 1000000 + "M";
      } else {
         return var0 >= 999999999 ? "*" : "?";
      }
   }

   public final void Method13361() {
      int var1 = 506;
      int var2 = 234;
      if (this.openInterfaceID != -1 && RSInterface.Field12749[this.openInterfaceID] != null) {
         var1 = RSInterface.Field12749[this.openInterfaceID].Field12758 - 6;
         var2 = RSInterface.Field12749[this.openInterfaceID].Field12811 - 10;
      }

      if (this.Field12282 < -14) {
         this.Field12282 = -14;
      } else if (this.Field12282 + var1 > width) {
         this.Field12282 = width - var1;
      }

      if (this.Field12283 < -14) {
         this.Field12283 = -14;
      } else {
         if (this.Field12283 + var2 > height) {
            this.Field12283 = height - var2;
         }

      }
   }

   private void Method13362(int var1, int var2, RSInterface var3, int var4) {
      if (!Field12120) {
         if (var3 != null) {
            if (var3.Field12805 == 0 && var3.Field12783 != null) {
               if (!var3.Field12810 || this.Field12487 == var3.Field12794 || this.Field12504 == var3.Field12794 || this.Field12499 == var3.Field12794) {
                  this.Method13361();
                  int var5 = Class697.Field8765;
                  int var6 = Class697.Field8763;
                  int var7 = Class697.Field8766;
                  int var8 = Class697.Field8764;
                  if (var3.Field12794 != 0) {
                     if (var4 == 4 && var2 == 4) {
                        var2 += this.Field12282;
                        var4 += this.Field12283;
                     }

                     Class697.Method11985(var4 + var3.Field12811, var2, var2 + var3.Field12758, var4);
                     int var9 = var3.Field12783.length;

                     for(int var10 = 0; var10 < var9; ++var10) {
                        int var11 = var3.Field12784[var10] + var2;
                        int var12 = var3.Field12816[var10] + var4 - var1;
                        RSInterface var13;
                        if ((var13 = RSInterface.Field12749[var3.Field12783[var10]]) != null && var13.Field12794 != 1849 && var13.Field12794 != 1848 && var13.Field12794 != 1850) {
                           if (var13.Field12776 > 0) {
                              if (this.Field12285.contains(var13.Field12776)) {
                                 var13.Field12778 = true;
                                 continue;
                              }

                              var13.Field12778 = false;
                           }

                           RSInterface var14;
                           if (var13.Field12777 <= 0 || (var14 = RSInterface.Field12749[var13.Field12777]).Field12796 == null || var14.Field12796[0] > 0) {
                              int var10000 = var13.Field12775;
                              if (!var13.Field12778) {
                                 if (var13.Field12794 == 11155) {
                                    var11 = 6;
                                    var12 = 100;
                                 }

                                 Class697.Method11985(var4 + var3.Field12811, var2, var2 + var3.Field12758, var4);
                                 if (var3.Field12775 == 11146) {
                                    var13.Field12766 = var13.Field12792;
                                 } else if (var3.Field12775 == 5875) {
                                    if (var13.Field12805 == 6) {
                                       continue;
                                    }
                                 } else if ((var13.Field12775 == 4900 || var13.Field12775 == 986) && var13.Field12771 == 16776960) {
                                    var13.Field12771 = 255;
                                 }

                                 int var51;
                                 if (var3.Field12817 && this.Field12139 && var13.Field12796 != null) {
                                    for(var51 = 0; var51 < var13.Field12796.length; ++var51) {
                                       if (var13.Field12796[var51] < 0) {
                                          var13.Field12796[var51] = -var13.Field12796[var51];
                                       }
                                    }

                                    this.Field12139 = false;
                                 }

                                 if (var13.Field12771 == 16776960 && var13.Field12805 == 4 && var13.Field12759 != null && var13.Field12759.equals("Continue")) {
                                    var13.Field12771 = 255;
                                 }

                                 if (var13.Field12754 == 6) {
                                    this.Field12227 = true;
                                 } else if (var13.Field12754 == 1 && var13.Field12775 == 2459) {
                                    this.Field12228 = true;
                                 } else if (var13.Field12754 == 1 && var13.Field12775 == 2469) {
                                    this.Field12229 = true;
                                 } else if (var13.Field12754 == 1 && var13.Field12775 == 2480) {
                                    this.Field12230 = true;
                                 } else if (var13.Field12754 == 1 && var13.Field12775 == 2492) {
                                    this.Field12231 = true;
                                 }

                                 if (var13.Field12753 == 49152) {
                                    var13.Field12753 = 16777215;
                                 }

                                 var11 += var13.Field12807;
                                 var12 += var13.Field12809;
                                 if (var13.Field12751 > 0) {
                                    this.interface_handle_auto_content(var13);
                                 }

                                 if (var3.Field12775 == 29999 && GraphicsDisplay.Field2678 && GraphicsDisplay.Field2667 && var3.Field12784 != null && var3.Field12784[var10] == 6) {
                                    GraphicsDisplay.Method997().Method1025();
                                 }

                                 if ((var3.Field12775 == 1151 || var3.Field12775 == 12855) && var10 == 0 && var13.Field12794 != 12856 && var13.Field12794 != 1152 && var13.Field12794 != 12424) {
                                    if (GraphicsDisplay.Field2678 && GraphicsDisplay.Field2667) {
                                       GraphicsDisplay.Method997().Method1025();
                                    }

                                    if (var13.Field12794 == 15879) {
                                       this.Method13357(var11 - 6, var12);
                                    } else {
                                       this.Method13357(var11 + 3, var12);
                                    }

                                    if (GraphicsDisplay.Field2678 && GraphicsDisplay.Field2667) {
                                       GraphicsDisplay.Method997().Method1025();
                                    }
                                 }

                                 if (var13.Field12805 == 0) {
                                    if (var13.Field12794 == Field12140 || var13.Field12775 == Field12140) {
                                       if (this.Field12101 == 0) {
                                          var13.Field12804 = 4836;
                                       } else {
                                          var13.Field12804 = 380;
                                       }
                                    }

                                    if (var13.Field12762 > var13.Field12804 - var13.Field12811) {
                                       var13.Field12762 = var13.Field12804 - var13.Field12811;
                                    }

                                    if (var13.Field12762 < 0) {
                                       var13.Field12762 = 0;
                                    }

                                    this.Method13362(var13.Field12762, var11, var13, var12);
                                    if (var13.Field12804 > var13.Field12811) {
                                       this.Method13266(var13.Field12811, var13.Field12762, var12, var11 + var13.Field12758, var13.Field12804);
                                    }
                                 } else if (var13.Field12805 != 1) {
                                    int var15;
                                    int var16;
                                    int var17;
                                    int var26;
                                    int var10010;
                                    int var27;
                                    int var28;
                                    int var29;
                                    int var32;
                                    boolean var56;
                                    int var57;
                                    int var59;
                                    int var74;
                                    if (var13.Field12805 == 2) {
                                       var51 = 0;
                                       var15 = 0;
                                       var16 = 0;
                                       var17 = 48;
                                       float var66 = 32.0F;
                                       float var71 = 32.0F;
                                       byte var67 = 0;
                                       byte var68 = 0;
                                       boolean var76 = false;
                                       if (var13.Field12794 == 6980 || var13.Field12794 == 6985) {
                                          var17 = 82;
                                          var66 = 64.0F;
                                          var71 = 64.0F;
                                          var67 = -13;
                                          var68 = -29;
                                          var13.Field12770 = 0;
                                          var13.Field12788 = 0;
                                          var13.Field12752 = var13.Field12791 = null;
                                          var76 = true;
                                       }

                                       if (var13.Field12748 != 32) {
                                          var74 = 32 - var13.Field12748;
                                          var17 += var74;
                                       }

                                       for(var74 = 0; var74 < var13.Field12811; ++var74) {
                                          for(var26 = 0; var26 < var13.Field12758; ++var26) {
                                             var27 = (int)((float)var11 + (float)var26 * (var66 + (float)var13.Field12770) + (float)var67);
                                             var28 = (int)((float)var12 + (float)var74 * (var71 + (float)var13.Field12788) + (float)var68);
                                             if (var51 < 20 && var13.Field12752 != null) {
                                                var27 += var13.Field12752[var51];
                                                var28 += var13.Field12791[var51];
                                             }

                                             if (var17 != 32) {
                                                Class697.Method11985(var4 + var3.Field12811, var2, var2 + var3.Field12758, var4);
                                                var29 = (32 - var17) / 2;
                                                if (var76) {
                                                   var29 = -128;
                                                }

                                                Class697.Field8765 += var29;
                                                Class697.Field8766 -= var29;
                                                if (var3.Field12804 == 0) {
                                                   Class697.Field8763 += var29;
                                                   Class697.Field8764 -= var29;
                                                }
                                             }

                                             if (var13.Field12775 == 39600) {
                                                Class697.Method11985(var4 + var3.Field12811 + -12, var2, var2 + var3.Field12758, var4 - -54);
                                             }

                                             if (var13.Field12775 == 3824) {
                                                Class697.Method11985(var4 + var3.Field12811 + 21, var2, var2 + var3.Field12758, var4 - 30);
                                             }

                                             var56 = var27 > Class697.Field8765 - 32 && var27 < Class697.Field8766 && var28 > Class697.Field8763 - 32 && var28 < Class697.Field8764 || this.Field12542 != 0 && this.Field12541 == var51;
                                             int var78;
                                             if (var13.Field12775 == Field12140 && this.Field12101 == 0) {
                                                var59 = var51 / 100;
                                                if (var16 != var59 && this.Field12650 != 3) {
                                                   var16 = var59;
                                                   var29 = this.Field12282 + 26;
                                                   var78 = var28 + 16;
                                                   var32 = var28 - this.Field12283;
                                                   var12 += 24;
                                                   var28 += 24;
                                                   if (var32 >= 86 && var56) {
                                                      if (GraphicsDisplay.Field2678) {
                                                         GraphicsDisplay.Method997().Method1010(var29, var78, 454, 2, 6577746, this);
                                                      } else {
                                                         Class697.Method8269(3, var78, var29, 6577746, 3);
                                                      }

                                                      boldFont.Method9444("Tab " + var59, var29 + 244, 13408512, var78 - 4);
                                                   }
                                                }
                                             }

                                             if (var13.Field12796 != null && var51 < var13.Field12796.length && var13.Field12796[var51] > 0) {
                                                var59 = var13.Field12796[var51] - 1;
                                                if (var13.Field12817 && var13.Field12796.length > 20 && this.Field12650 == 3 && this.Field12639.length() > 0) {
                                                   if (var13.Field12818) {
                                                      NPCDefinition var80;
                                                      if ((var80 = NPCDefinition.Method11884(var59)) == null || var80.Field10736 == null || !var80.Field10736.toLowerCase().contains(this.Field12639.toLowerCase())) {
                                                         ++var51;
                                                         continue;
                                                      }
                                                   } else {
                                                      ItemDef var79;
                                                      if ((var79 = ItemDef.forID(var59)) == null || var79.Field10639 == null || !var79.Field10639.toLowerCase().contains(this.Field12639.toLowerCase())) {
                                                         ++var51;
                                                         continue;
                                                      }
                                                   }

                                                   var57 = var15 % 10;
                                                   var29 = var15 / 10;
                                                   var27 = var11 + var57 * (32 + var13.Field12770);
                                                   var28 = var12 + var29 * (32 + var13.Field12788);
                                                   ++var15;
                                                }

                                                var57 = 0;
                                                var29 = 0;
                                                if (var27 > Class697.Field8765 - 32 && var27 < Class697.Field8766 && var28 > Class697.Field8763 - 32 && var28 < Class697.Field8764 || this.Field12542 != 0 && this.Field12541 == var51) {
                                                   int var34;
                                                   if (var13.Field12818) {
                                                      if (var13.Field12729 != Field12108) {
                                                         var13.Field12731 = null;
                                                         var13.Field12730 = null;
                                                         var13.Field12729 = Field12108;
                                                      }

                                                      if (var13.Field12730 == null) {
                                                         var13.Field12730 = new Npc[var13.Field12758 * var13.Field12811];
                                                      }

                                                      if (var13.Field12731 == null) {
                                                         var13.Field12731 = new Model[var13.Field12758 * var13.Field12811];
                                                      }

                                                      Npc var83;
                                                      if ((var83 = var13.Field12730[var51]) == null || var83.ao != (long)var59) {
                                                         (var83 = var13.Field12730[var51] = Method13283(var59)).J_12 = var83.Field4103.Field10747;
                                                         var83.U_2 = -1;
                                                         var83.ao = (long)var59;
                                                         var83.V_2 = 0;
                                                         var83.Field4103.interactingEntity = var59;
                                                         var83.ao = (long)var59;
                                                         var83.r_36 = false;
                                                         var83.s_35 = 0;
                                                         var13.Field12731[var51] = null;
                                                      }

                                                      boolean var82 = Field12108;
                                                      boolean var86 = var13.Field12731[var51] == null;
                                                      var13.Field12731[var51] = var83.Method9342(true);
                                                      Model var87;
                                                      if ((var87 = var13.Field12731[var51]) == null) {
                                                         var83.s_35 = (int)Math.round(Math.random() * 10.0D);
                                                      }

                                                      if (!var83.r_36) {
                                                         var83.Field4194 = session_player.Field4194;
                                                         var83.Field4195 = session_player.Field4195;
                                                         var83.r_36 = true;
                                                         this.Field12275.add(var83);
                                                      }

                                                      if (var87 != null) {
                                                         if (var83.V_2 == 0 || var83.s_35 < 12) {
                                                            var87.Method14480(var83.Field4103.interactingEntity);
                                                            var34 = var87.Field2846 > var87.Field10127 ? var87.Field2846 : var87.Field10127;
                                                            var83.V_2 = (int)(1.0F / (float)var34 * 8000.0F);
                                                            var86 = true;
                                                         }

                                                         var34 = var83.V_2;
                                                         var87.Method14498((float)var34, (float)var34, (float)var34);
                                                         var34 = 1884;
                                                         byte var70 = 0;
                                                         short var88 = 0;
                                                         long var45 = (long)(session_player.Field4194 - 6 >> 7);
                                                         long var47 = (long)(session_player.Field4194 - 6 >> 7);
                                                         long var49 = ((long)var59 << 20) + (var47 << 7) + var45;
                                                         var27 = var27;
                                                         var28 = var28;
                                                         if (!GraphicsDisplay.Field2678 || !GraphicsDisplay.Field2667) {
                                                            var70 = 45;
                                                            var88 = 600;
                                                            var34 -= 768;
                                                         }

                                                         var87.Field2750 = var82 || var86;
                                                         int var10001 = var27 + 15;
                                                         int var10002 = var28 + 40;
                                                         var10010 = Model.Field2798;
                                                         var87.Method14509(var10001, var10002, var34, 0, 1056, 0, var70, var88, 0, -100, var49, true, false, false);
                                                         if (var83.Field4103.Field10736 == null) {
                                                            //System.out.println("Null: " + var83.ao + ", " + var59);
                                                         }

                                                         //String[] var72 = Method13212(var83.Field4103.Field10736 == null ? "No name: " + var83.ao : var83.Field4103.Field10736.replace("Spectral", "Spec."), 60, smallFont).split("\n");
                                                         //var59 = 0;
                                                         //String[] var84 = var72;
                                                         //var78 = var72.length;

                                                         //for(var29 = 0; var29 < var78; ++var29) {
                                                        //    String var73 = var84[var29];
                                                        //    smallFont.Method9444(var73, var27 + 15 + smallFont.Method9451(var73) / 2, 16751360, var28 + 53 + var59);
                                                         //   var59 += 12;
                                                        // }
                                                      }

                                                      ++var51;
                                                      continue;
                                                   }

                                                   int var81 = 0;
                                                   var32 = 0;
                                                   if (this.Field12697 == 1 && this.Field12698 == var51 && this.Field12699 == var13.Field12794) {
                                                      var32 = 16777215;
                                                      var81 = this.Field12698;
                                                   }

                                                   var78 = var13.Field12795[var51];
                                                   RgbImage var85;
                                                   if ((var85 = ItemDef.Method11918(var59, var13.Field12795[var51], var32, Model.Field2798, var27, var28, var81 + 1, 0, var17)) != null) {
                                                      if (this.Field12697 == 1 && this.Field12698 == var51 && this.Field12699 == var13.Field12794) {
                                                         var85.Field9878 = -1L;
                                                      }

                                                      int var33 = (32 - var17) / 2;
                                                      var34 = (32 - var17) / 2;
                                                      if (var17 > 48) {
                                                         var34 = 0;
                                                         var33 = 0;
                                                      }

                                                      var85.Field9880 = var78;
                                                      if (this.Field12542 != 0 && this.Field12541 == var51 && this.Field12540 == var13.Field12794) {
                                                         var57 = super.mouseEventX - this.Field12543;
                                                         var29 = super.mouseEventY - this.Field12544;
                                                         if (var57 < 5 && var57 > -5) {
                                                            var57 = 0;
                                                         }

                                                         if (var29 < 5 && var29 > -5) {
                                                            var29 = 0;
                                                         }

                                                         if (this.Field12459 < (float)this.Field12141) {
                                                            var57 = 0;
                                                            var29 = 0;
                                                         }

                                                         var85.Method892(var27 + var57 + var33, var28 + var29 + var34, 100);
                                                         if ((var34 = (int)Field12427) <= 0) {
                                                            var34 = 1;
                                                         }

                                                         if (var28 + var29 < Class697.Field8763 && var3.Field12762 > 0) {
                                                            if ((var59 = var34 * (Class697.Field8763 - var28 - var29) / 4) > var34 * 45) {
                                                               var59 = var34 * 45;
                                                            }

                                                            if (var59 > var3.Field12762) {
                                                               var59 = var3.Field12762;
                                                            }

                                                            var3.Field12762 -= var59;
                                                            this.Field12544 += var59;
                                                         }

                                                         if (var28 + var29 + 32 > Class697.Field8764 && var3.Field12762 < var3.Field12804 - var3.Field12811) {
                                                            if ((var59 = var34 * (var28 + var29 + 32 - Class697.Field8764) / 4) > var34 * 45) {
                                                               var59 = var34 * 45;
                                                            }

                                                            if (var59 > var3.Field12804 - var3.Field12811 - var3.Field12762) {
                                                               var59 = var3.Field12804 - var3.Field12811 - var3.Field12762;
                                                            }

                                                            var3.Field12762 += var59;
                                                            this.Field12544 -= var59;
                                                         }
                                                      } else if (this.Field12667 != 0 && this.Field12666 == var51 && this.Field12665 == var13.Field12794) {
                                                         var85.Method892(var27 + var33, var28 + var34, 210);
                                                      } else {
                                                         if (var13.Field12796 != null) {
                                                            int[] var90 = var13.Field12796;
                                                         }

                                                         if (var78 < 0) {
                                                            var85.Method892(var27 + var33, var28 + var34, 100);
                                                         } else {
                                                            var85.Method9109(var27 + var33, var28 + var34, var76);
                                                         }
                                                      }

                                                      if (var85.Field9898 == var17 + 1 || var13.Field12795[var51] != 1) {
                                                         var78 = var13.Field12795[var51];
                                                         boolean var89 = false;
                                                         if (var78 == -1) {
                                                            var78 = 0;
                                                            var89 = true;
                                                         }

                                                         if (var78 > 0 || var89) {
                                                            smallFont.Method9453(0, Method13279(var78), var28 + 1 + 9 + var29, var27 + 1 + var57);
                                                         }

                                                         if (var78 > 0 || var89) {
                                                            smallFont.Method9453(16776960, Method13279(var78), var28 + 9 + var29, var27 + var57);
                                                         }

                                                         if (var78 >= 100000) {
                                                            smallFont.Method9453(16777215, Method13279(var78), var28 + 9 + var29, var27 + var57);
                                                         }

                                                         if (var78 >= 10000000) {
                                                            smallFont.Method9453(4841998, Method13279(var78), var28 + 9 + var29, var27 + var57);
                                                         }
                                                      }
                                                   }
                                                }
                                             } else {
                                                RgbImage var63;
                                                if (var13.Field12747 != null && var51 < 20 && (var63 = var13.Field12747[var51]) != null) {
                                                   var63.Method14495(var27, var28);
                                                }
                                             }

                                             ++var51;
                                          }
                                       }
                                    } else {
                                       boolean var53;
                                       if (var13.Field12805 == 3) {
                                          var53 = false;
                                          if (this.Field12499 == var13.Field12794 || this.Field12504 == var13.Field12794 || this.Field12487 == var13.Field12794) {
                                             var53 = true;
                                          }

                                          if (this.Method13383(var13)) {
                                             var15 = var13.Field12757;
                                             if (var53 && var13.Field12782 != 0) {
                                                var15 = var13.Field12782;
                                             }
                                          } else {
                                             var15 = var13.Field12771;
                                             if (var53 && var13.Field12753 != 0) {
                                                var15 = var13.Field12753;
                                             }
                                          }

                                          if (var13.Field12797 == 0) {
                                             if (GraphicsDisplay.Field2678) {
                                                if (var13.Field12794 != 6520 && var13.Field12794 != 6558 && var13.Field12775 != 3281 && var13.Field12775 != 11462) {
                                                   if (var13.Field12765) {
                                                      GraphicsDisplay.Method997().Method1010(var11, var12, var13.Field12758, var13.Field12811, var15, this);
                                                   } else {
                                                      GraphicsDisplay.Method997().Method1010(var12, var11, var13.Field12811, var13.Field12758, var15, this);
                                                   }

                                                   if (GraphicsDisplay.Field2678 && GraphicsDisplay.Field2667) {
                                                      GraphicsDisplay.Method997().Method1025();
                                                   }
                                                }
                                             } else if (var13.Field12765) {
                                                Class697.Method8269(var13.Field12811, var12, var11, var15, var13.Field12758);
                                             } else {
                                                Class697.Method14503(var11, var13.Field12758, var13.Field12811, var15, var12);
                                             }
                                          } else if (var13.Field12765) {
                                             Class697.Method8270(var15, var12, var13.Field12758, var13.Field12811, 256 - (var13.Field12797 & 255), var11);
                                          } else {
                                             Class697.Method11988(var12, var13.Field12811, 256 - (var13.Field12797 & 255), var15, var13.Field12758, var11);
                                          }
                                       } else {
                                          int var20;
                                          RSFont var52;
                                          String var54;
                                          if (var13.Field12805 == 4) {
                                             var52 = var13.Field12786;
                                             var54 = var13.Field12792;
                                             if (var13.Field12792 != null) {
                                                String var61;
                                                if (var54.endsWith("$link$")) {
                                                   var13.Field12754 = 20;
                                                   var61 = var54.substring(0, var54.indexOf("+"));
                                                   var54 = var54.substring(var61.length() + 1).trim();
                                                   var54 = "@blu@" + var54.substring(0, var54.indexOf("$"));
                                                }

                                                if (var54.contains("</a>")) {
                                                   var13.Field12754 = 20;
                                                   var61 = var54.split(">")[1].replace("</a", "");
                                                   var54 = "@lbl@" + var61;
                                                }

                                                boolean var58 = false;
                                                if (this.Field12499 == var13.Field12794 || this.Field12504 == var13.Field12794 || this.Field12487 == var13.Field12794) {
                                                   var58 = true;
                                                }

                                                var56 = var13.Field12775 == 1151 || var13.Field12775 == 12855 || var13.Field12775 == 29999 || var13.Field12775 == 1829 || var13.Field12775 == 1689 || var13.Field12775 == 12050;
                                                if (var13.Field12767 == 420) {
                                                   var16 = var13.Field12771;
                                                   if (var13.Field12769 && var13.Field12753 != 0) {
                                                      var16 = var13.Field12753;
                                                   }
                                                } else if (this.Method13383(var13)) {
                                                   var16 = var13.Field12757;
                                                   if (var58 && var13.Field12782 != 0) {
                                                      var16 = var13.Field12782;
                                                   }

                                                   if (var13.Field12766.length() > 0) {
                                                      var54 = var13.Field12766;
                                                   }
                                                } else {
                                                   var16 = var13.Field12771;
                                                   if (var58 && var13.Field12753 != 0) {
                                                      var16 = var13.Field12753;
                                                   }
                                                }

                                                if (var13.Field12754 == 6 && this.Field12585) {
                                                   var54 = "Please wait...";
                                                   var16 = var13.Field12771;
                                                }

                                                if (Class697.Field8761 == 519) {
                                                   if (var16 == 16776960) {
                                                      var16 = 255;
                                                   }

                                                   if (var16 == 49152) {
                                                      var16 = 16777215;
                                                   }
                                                }

                                                if (var13.Field12775 == 1151 || var13.Field12775 == 12855 || var13.Field12775 == 29999) {
                                                   switch(var16) {
                                                   case 7040819:
                                                      var16 = 11495962;
                                                      break;
                                                   case 16773120:
                                                      var16 = 16685087;
                                                   }
                                                }

                                                for(var59 = var12 + var52.Field9980; var54.length() > 0; var59 += var52.Field9980) {
                                                   if (var54.indexOf("%") != -1) {
                                                      while((var20 = var54.indexOf("%1")) != -1) {
                                                         if (var56) {
                                                            var54 = var54.substring(0, var20) + Method13360(this.Method13378(var13, 0)) + var54.substring(var20 + 2);
                                                         } else {
                                                            var54 = var54.substring(0, var20) + Method13354(this.Method13378(var13, 0)) + var54.substring(var20 + 2);
                                                         }

                                                         if (var56 && var16 == 0) {
                                                            var16 = 49152;
                                                         }
                                                      }

                                                      while((var20 = var54.indexOf("%2")) != -1) {
                                                         var54 = var54.substring(0, var20) + Method13354(this.Method13378(var13, 1)) + var54.substring(var20 + 2);
                                                      }

                                                      while((var20 = var54.indexOf("%3")) != -1) {
                                                         var54 = var54.substring(0, var20) + Method13354(this.Method13378(var13, 2)) + var54.substring(var20 + 2);
                                                      }

                                                      while((var20 = var54.indexOf("%4")) != -1) {
                                                         var54 = var54.substring(0, var20) + Method13354(this.Method13378(var13, 3)) + var54.substring(var20 + 2);
                                                      }

                                                      while((var20 = var54.indexOf("%5")) != -1) {
                                                         var54 = var54.substring(0, var20) + Method13354(this.Method13378(var13, 4)) + var54.substring(var20 + 2);
                                                      }
                                                   }

                                                   String var65;
                                                   if ((var20 = var54.indexOf("\\n")) != -1) {
                                                      var65 = var54.substring(0, var20);
                                                      var54 = var54.substring(var20 + 2);
                                                   } else {
                                                      var65 = var54;
                                                      var54 = "";
                                                   }

                                                   if (var13.Field12794 == 199) {
                                                      var65 = var13.Field12792;
                                                      --var11;
                                                   } else if (var13.Field12794 == 35081) {
                                                      var65 = "CDL: " + Class280.Method2988().Method2990();
                                                   }

                                                   int var64 = 0;
                                                   String[] var77;
                                                   var26 = (var77 = var13.Field12755 > 0 ? Method13211(var65.split("/r"), var13.Field12755, var52).split("\n") : new String[]{var65}).length;

                                                   for(var74 = 0; var74 < var26; ++var74) {
                                                      String var75;
                                                      if (!(var75 = var77[var74]).equals("")) {
                                                         var28 = var59 + var64 * var52.Field9980;
                                                         if (var13.Field12761) {
                                                            var52.Method9449(var16, var11 + var13.Field12758 / 2, var75, var28, var13.Field12812);
                                                         } else {
                                                            var52.addButton(var13.Field12812, var11, var16, var75, var28);
                                                         }

                                                         ++var64;
                                                      }
                                                   }
                                                }
                                             }
                                          } else if (var13.Field12805 == 5) {
                                             RgbImage var55;
                                             if (!this.Method13383(var13) && (var13.Field12767 != 420 || !var13.Field12769) && (session_player == null || (var13.Field12794 != 40990 || session_player.appearanceModels[13] <= Player.modelIndexMax) && (var13.Field12794 != 40991 || session_player.appearanceModels[12] <= Player.modelIndexMax))) {
                                                var55 = var13.Field12745;
                                             } else {
                                                var55 = var13.Field12803;
                                             }

                                             var13.Field12769 = false;
                                             if (this.Field12577 == 1 && var13.Field12794 == this.Field12184 && this.Field12184 != 0 && var55 != null) {
                                                var55.Method885(var11, var12, 16777215);
                                             } else if (var55 != null) {
                                                var55.Method14495(var11, var12);
                                             }
                                          } else if (var13.Field12805 == 6) {
                                             var51 = Rasterizer.Field9955;
                                             var15 = Rasterizer.Field9956;
                                             Rasterizer.Field9955 = var11 + var13.Field12758 / 2;
                                             Rasterizer.Field9956 = var12 + var13.Field12811 / 2;
                                             var16 = Rasterizer.Field9959[var13.Field12814] * var13.Field12813 >> 16;
                                             var17 = Rasterizer.Field9960[var13.Field12814] * var13.Field12813 >> 16;
                                             if (var56 = this.Method13383(var13)) {
                                                var59 = var13.Field12801;
                                             } else {
                                                var59 = var13.Field12800;
                                             }

                                             Model var60 = null;
                                             boolean var62 = this.Field12277;
                                             boolean var22 = false;
                                             boolean var23 = false;
                                             if (var59 == -1) {
                                                if (var13.Field12794 == 15125) {
                                                   var60 = session_player.getRotatedModel(Model.Field2798, true, true);
                                                   var23 = true;
                                                } else {
                                                   var60 = var13.Method1822(-1, -1, var56, Model.Field2798);
                                                }
                                             } else {
                                                if (session_player != null && var13.Field12772 == 3) {
                                                   var13.Field12773 = (session_player.appearanceColours[0] << 25) + (session_player.appearanceColours[4] << 20) + (session_player.appearanceModels[0] << 15) + (session_player.appearanceModels[8] << 10) + (session_player.appearanceModels[11] << 5) + session_player.appearanceModels[1];
                                                }

                                                Sequence var24;
                                                if ((var24 = Sequence.anims[var59]) != null) {
                                                   var60 = var13.Method1822(var24.Field10143[var13.Field12790], var24.frame2IDS[var13.Field12790], var56, Model.Field2798);
                                                }

                                                var62 = true;
                                             }

                                             if (var60 != null) {
                                                int var69 = 0;
                                                byte var25 = 0;
                                                var26 = var13.Field12815;
                                                var27 = var13.Field12814;
                                                if (var13.Field12794 == 15125) {
                                                   var62 = true;
                                                   var17 = 420;
                                                   var16 -= 28;
                                                } else if (var13.Field12794 == 3650) {
                                                   var62 = true;
                                                   var17 = 550;
                                                   var16 = 220;
                                                   var13.Field12800 = var13.Field12801 = 808;
                                                   var23 = true;
                                                } else if (var13.Field12794 == 6986) {
                                                   var16 = 263;
                                                   var69 = 34;
                                                   var25 = -36;
                                                   var62 = true;
                                                } else if (var59 != -1) {
                                                   var17 += 1024;
                                                   var16 += 160;
                                                } else if (var13.Field12775 == 6575) {
                                                   var22 = true;
                                                } else if (var13.Field12775 == 11333 && GraphicsDisplay.Field2678 && GraphicsDisplay.Field2667) {
                                                   var26 += 52;
                                                }

                                                if (GraphicsDisplay.Field2678 && GraphicsDisplay.Field2667) {
                                                   GraphicsDisplay.Method997().Method1025();
                                                }

                                                var28 = var13.Field12794;
                                                if (var13.Field12806 != this.Field12278) {
                                                   var13.Field12806 = this.Field12278;
                                                   var62 = true;
                                                }

                                                if (var28 == 8146 || var28 == 12140) {
                                                   var60.Field2776 = null;
                                                }

                                                if (var23 && (!GraphicsDisplay.Field2678 || !GraphicsDisplay.Field2667)) {
                                                   var56 = var13.Field12794 == 3650 ? RSInterface.Field12749[3559].Field12819 : RSInterface.Field12749[15106].Field12819;
                                                   var59 = (int)((float)(var13.Field12794 == 3650 ? (var56 ? 256 : 128) : var16 - 2 + (var56 ? 96 : 0)) * 0.725F);
                                                   var29 = var13.Field12794 == 3650 ? -16 : (var56 ? -10 : -22);
                                                   var60.Method14498((float)var59, (float)var59, (float)var59);
                                                   var60.Method14497(0, var29, 0);
                                                }

                                                int var10008;
                                                if (var23 && GraphicsDisplay.Field2678 && GraphicsDisplay.Field2667) {
                                                   var56 = var13.Field12794 == 3650 ? RSInterface.Field12749[3559].Field12819 : RSInterface.Field12749[15106].Field12819;
                                                   var59 = var13.Field12794 == 3650 ? (var56 ? 256 : 128) : var16 - 2 + (var56 ? 96 : 0);
                                                   var29 = var13.Field12794 == 3650 ? -16 : (var56 ? -10 : -22);
                                                   var60.Method14498((float)var59, (float)var59, (float)var59);
                                                   var60.Method14497(0, var29, 0);
                                                   var10008 = var17 + var25;
                                                   var10010 = Model.Field2798;
                                                   var60.Method14509(Rasterizer.Field9955, Rasterizer.Field9956, var26, 0, var27, var69, var16, var10008, 0, -100, (long)var28, true, var22, false);
                                                   Model var30;
                                                   if (var56 && (var30 = RSInterface.Method1821(session_player, var13.Field12794 != 3650)) != null) {
                                                      if (var26 < 1024) {
                                                         var32 = var26 / 2;
                                                      } else {
                                                         var32 = var26 + (2048 - var26) / 2;
                                                      }

                                                      float var31;
                                                      if (var13.Field12794 == 3650) {
                                                         var57 = Rasterizer.Field9955 + 112 + 12;
                                                         var29 = Rasterizer.Field9956 - 60;
                                                         var31 = 48.0F;
                                                      } else {
                                                         var57 = Rasterizer.Field9955 + 170;
                                                         var29 = Rasterizer.Field9956 - 325;
                                                         var31 = 42.0F;
                                                      }

                                                      var30.Method14498(var31, var31, var31);
                                                      if (!RSInterface.Field12749[969].Field12728) {
                                                         RSInterface.Field12749[969].Field12728 = true;
                                                         this.Field12242.add(969);
                                                      }

                                                      var30.Field2750 = true;
                                                      var10008 = var17 + var25;
                                                      var10010 = Model.Field2798;
                                                      var30.Method14509(var57, var29, var32, 0, var27, var69, var16, var10008, 0, -100, 969L, true, var22, false);
                                                   }
                                                } else {
                                                   if (var13.Field12794 == 4883 || var13.Field12794 == 4888 || var13.Field12794 == 4894 || var13.Field12794 == 4901 || var13.Field12794 == 969 || var13.Field12794 == 974 || var13.Field12794 == 980 || var13.Field12794 == 987) {
                                                      var57 = var60.Field2846 / 32 << 5;
                                                      var59 = var60.Field10127 / 32 << 5;
                                                      if (var57 < 128 || var59 < 128) {
                                                         var16 -= 30;
                                                         var69 -= var13.Field12794 >= 1000 ? -30 : 30;
                                                         if (var13.Field12773 == 6739) {
                                                            var16 += 120;
                                                         }

                                                         var60.Method14501(320.0F, 320.0F, 320.0F);
                                                      }
                                                   }

                                                   var10008 = var17 + var25;
                                                   var10010 = Model.Field2798;
                                                   var60.Method14508(Rasterizer.Field9955, Rasterizer.Field9956, var26, 0, var27, var69, var16, var10008, 0, -100, (long)var28, var62, var22);
                                                }

                                                if (GraphicsDisplay.Field2678 && !GraphicsDisplay.Field2667) {
                                                   GraphicsDisplay.Method997().Method1025();
                                                }
                                             }

                                             Rasterizer.Field9955 = var51;
                                             Rasterizer.Field9956 = var15;
                                          } else if (var13.Field12805 != 7) {
                                             if (var13.Field12805 == 8) {
                                                var53 = false;
                                                var54 = var13.Field12736;
                                                if (var13.Field12792 != null && var13.Field12792.toLowerCase().contains(" exp: ")) {
                                                   var53 = true;
                                                   var54 = var13.Field12792;
                                                }

                                                this.Field12286.add(new Class663(var11, var12, var54, var53));
                                             }
                                          } else {
                                             var52 = var13.Field12786;
                                             var15 = 0;

                                             for(var16 = 0; var16 < var13.Field12811; ++var16) {
                                                for(var17 = 0; var17 < var13.Field12758; ++var17) {
                                                   if (var13.Field12796[var15] > 0) {
                                                      ItemDef var18;
                                                      String var19 = (var18 = ItemDef.forID(var13.Field12796[var15] - 1)).Field10639;
                                                      if (var18.Field10643 || var13.Field12795[var15] != 1) {
                                                         var19 = var19 + " x" + Method13241(var13.Field12795[var15]);
                                                      }

                                                      var20 = var11 + var17 * (115 + var13.Field12770);
                                                      int var21 = var12 + var16 * (12 + var13.Field12788);
                                                      if (var13.Field12761) {
                                                         var52.Method9449(var13.Field12771, var20 + var13.Field12758 / 2, var19, var21, var13.Field12812);
                                                      } else {
                                                         var52.addButton(var13.Field12812, var20, var13.Field12771, var19, var21);
                                                      }
                                                   }

                                                   ++var15;
                                                }
                                             }
                                          }
                                       }
                                    }
                                 }
                              }
                           }
                        }
                     }

                     Class697.Method11985(var8, var5, var7, var6);
                  }
               }
            }
         }
      }
   }

   private void Method13363(float var1) {
      if (session_player != null) {
         try {
            int var2 = session_player.Field4194;
            int var3 = session_player.Field4195;
            if (Field12428.Field933) {
               Field12428.Field933 = false;
            }

            if (Field12475 - var2 < -1000 || Field12475 - var2 > 1000 || Field12476 - var3 < -1000 || Field12476 - var3 > 1000) {
               Field12475 = var2;
               Field12476 = var3;
            }

            float var4;
            if ((var4 = 1200.0F / (float)Field12134) < 1.0F) {
               var4 = 1.0F;
            }

            if (Field12475 != var2) {
               Field12475 = (int)((float)Field12475 + (float)((var2 - Field12475) / 16) * var1 * var4);
            }

            if (Field12476 != var3) {
               Field12476 = (int)((float)Field12476 + (float)((var3 - Field12476) / 16) * var1 * var4);
            }

            if (!super.Field8793) {
               if (super.keyStatus[1] > 0) {
                  this.Field12627 = (int)((float)this.Field12627 + (var1 * (float)(-super.keyStatus[1]) - (float)this.Field12627));
               } else if (super.keyStatus[2] > 0) {
                  this.Field12627 = (int)((float)this.Field12627 + (var1 * (float)super.keyStatus[2] - (float)this.Field12627));
               } else {
                  this.Field12627 = (int)((float)this.Field12627 / (var1 * 2.0F));
               }

               if (super.keyStatus[3] > 0) {
                  this.Field12628 = (int)((float)this.Field12628 + (var1 * (float)super.keyStatus[3] - (float)this.Field12628));
               } else if (super.keyStatus[4] > 0) {
                  this.Field12628 = (int)((float)this.Field12628 + (var1 * (float)(-super.keyStatus[4]) - (float)this.Field12628));
               } else {
                  this.Field12628 = (int)((float)this.Field12628 / (var1 * 2.0F));
               }
            } else {
               if (super.keyStatus[1] > 0) {
                  this.Field12627 = (int)((float)this.Field12627 + var1 * ((float)(-super.keyStatus[1] - this.Field12627) / 2.0F));
               } else if (super.keyStatus[2] > 0) {
                  this.Field12627 = (int)((float)this.Field12627 + var1 * ((float)(super.keyStatus[2] - this.Field12627) / 2.0F));
               } else {
                  this.Field12627 = (int)((float)this.Field12627 / (var1 * 2.0F));
               }

               if (super.keyStatus[3] > 0) {
                  this.Field12628 = (int)((float)this.Field12628 + var1 * ((float)(super.keyStatus[3] - this.Field12628) / 2.0F));
               } else if (super.keyStatus[4] > 0) {
                  this.Field12628 = (int)((float)this.Field12628 + var1 * ((float)(-super.keyStatus[4] - this.Field12628) / 2.0F));
               } else {
                  this.Field12628 = (int)((float)this.Field12628 / (var1 * 2.0F));
               }

               boolean var6 = false;

               for(var2 = 1; var2 <= 4; ++var2) {
                  if (this.u_22[var2] > 8) {
                     this.u_22[var2] /= 2;
                  } else {
                     --this.u_22[var2];
                  }

                  if (this.u_22[var2] < 0) {
                     this.u_22[var2] = 0;
                  } else {
                     var6 = true;
                  }
               }

               if (!var6) {
                  this.f_66 = false;
               }
            }

            if (class329 != null) {
               class329.Method3385(this.Field12627, this.Field12628);
               this.Field12627 = 0;
               this.Field12628 = 0;
            }

            if (GraphicsDisplay.Field2678) {
               boolean var10000 = GraphicsDisplay.Field2667;
            }

            Field12625 = Field12623;
            Field12626 = Field12624;
            Field12624 = Field12624 + this.Field12627 / 2 & 2047;
            Field12623 += this.Field12628 / 2;
            int var7 = Method13391();
            var2 = 383;
            if (Rasterizer.Field9949) {
               var2 = Method13390();
            }

            if (Field12623 < var7) {
               Field12623 = var7;
            }

            if (Field12623 > var2) {
               Field12623 = var2;
            }

            if (32768 > this.Field12455) {
               this.Field12455 += ('耀' - this.Field12455) / 24;
               return;
            }

            if (32768 < this.Field12455) {
               this.Field12455 += ('耀' - this.Field12455) / 80;
               return;
            }
         } catch (Exception var5) {
            var5.printStackTrace();
            Signlink.reporterror("glfc_ex " + session_player.Field4194 + "," + session_player.Field4195 + "," + Field12475 + "," + Field12476 + "," + Field12527 + "," + Field12528 + "," + Field12490 + "," + Field12491);
         }

      }
   }

   public final void Method13364() {
      if (session_player != null) {
         Field12567 = session_player.Field4194;
         Field12568 = session_player.Field4195;
         Field12569 = this.Method13277(Field12379, Field12567, Field12568);
      }

      if (this.Field12376 == 0) {
         this.Field12374 = super.clickX;
         this.Field12375 = super.clickY;
         this.Field12376 = 0;
      }

      this.Method13250();
      int var5;
      int var16;
      int var24;
      if (Field12593 && !Field12272) {
         Client var1 = this;
         Client var2 = this;
         int var28;
         if (Field12218 != null && Field12218.Method8825()) {
            Long var3;
            while((var3 = (Long)var2.Field12223.poll()) != null) {
               long var14 = var3 >> 16 & 65535L;
               Method13257((int)(var3 >> 32 & 65535L) - Field12490 - Field12494, (int)var14 - Field12491 - Field12495, (List)var2.Field12222.get(var3));
            }

            Class47 var4;
            while((var4 = (Class47)var2.Field12224.poll()) != null) {
               var5 = var4.Field2195;
               var28 = var4.Field2196;
               int var15 = var4.Field10127;
               var16 = var4.Field2739;
               var2.Method13254(var5, var28, var15, var16);
            }
         }

         Class60 var8;
         while((var8 = (Class60)var1.Field12296.poll()) != null) {
            try {
               var1.Method13396(var8);
               var1.Field12298 = 0;
            } catch (Exception var18) {
               var18.printStackTrace();
            }
         }

         if (var1.Field12062 != 0) {
            int var22 = Field12490 + (session_player.Field4194 - 6 >> 7) - Field12494;
            var24 = Field12491 + (session_player.Field4195 - 6 >> 7) - Field12495;
            if ((var1.Field12062 != var22 || var1.Field12063 != var24) && session_player.aw_2 == 0 && session_player.ax_2 == 0 && session_player.Field8768 <= 0 && !var1.Field12289) {
               var5 = var22 - var1.Field12062;
               var28 = var24 - var1.Field12063;
               if (Method13412(0, 0, var5, var28) > 20) {
                  var1.Method13249(var5, var28, 3);
               }

               session_player.a(var1.Field12064, var1.Field12065, false, true);
               Method13407(var1.Field12066, var1.Field12067);
               System.out.println("[Client]: player position re-synchronized: cycles: " + session_player.aw_2 + "/" + session_player.ax_2 + "/" + currentTime + ", xy: " + var1.Field12064 + "/" + var22 + ", " + var1.Field12065 + "/" + var24);
            }

            var1.Field12062 = 0;
         }
      }

      if (this.Field12072 != 0) {
         this.Method13201(this.Field12072, this.Field12073, this.Field12074);
         this.Field12072 = 0;
      }

      if (this.Field12289 && this.Field12072 == 0) {
         this.Field12289 = false;
      }

      if (Field12173 != null && !Field12593) {
         Field12173.Method8804(Field12427);
         Class565.Field491 = 15000;
      }

      if (Field12271) {
         Field12271 = false;
         Method13323();
      }

      if (this.Field12165) {
         this.Field12165 = false;
         if (GraphicsDisplay.Field2678) {
            Class843.Method14016();
         }
      }

      if (Field12091 && ItemDef.Method11928(48, true)) {
         (new StringBuilder(String.valueOf(ItemDef.Field10672 / 1000))).append(".png");
         System.out.println("pro: " + ItemDef.Field10672 + ", " + ItemDef.Field10665);
         if (ItemDef.Field10672 >= ItemDef.Field10665 - 1) {
            Field12091 = false;
            System.out.println("finished.");
         }
      }

      if (++Field12600 >= Integer.MAX_VALUE) {
         Field12600 = 0;
      }

      if (GraphicsDisplay.Field2678) {
         GraphicsDisplay.Method997().Method1023();
      }

      Class518.Method8353(Field12076);
      Field12076 = false;
      Model.Method14457();
      if (Field12483 == 1 || Field12251) {
         this.Method13296();
      }

      this.Method13300();
      this.Method13295();
      Field12288 = super.Field8800;
      double var19 = (double)(super.Field8800 + super.Field8801) / 2.0D;
      Field12427 = 0.0D;
      if (1.0D / GraphicsDisplay.Method997().Method1045() * 1000.0D != 0.0D) {
         double var25;
         Field12427 = var25 = 50.0D / var19;
      } else {
         Field12427 = 1.0D;
      }

      if (Field12427 < 0.01D) {
         Field12427 = 0.01D;
      }

      if (GraphicsDisplay.Field2678) {
         GraphicsDisplay.Method997().Method1028(this);
      }

      int var6;
      if ((Field12265 != 100.0F && Field12266 != 100.0F || !Field12263) && GraphicsDisplay.Field2678) {
         GraphicsDisplay.Method997();
         GraphicsDisplay.Method1008(this.Field12267++ == 10);
         Field12265 = Method13305(Field12265, (float)this.Field12204);
         Field12266 = Method13305(Field12266, (float)this.Field12205);
         float var26 = Field12265;
         float var9 = Field12266;
         String var20 = this.Field12206;
         String var23 = this.Field12207;
         var24 = this.Method13236() / 2;
         var5 = this.Method13237() / 2 - 20;
         var20 = var20.replace("...", "");
         boolean var10000 = GraphicsDisplay.Field2678;
         this.Method13304();
         int var7;
         int var10;
         int var11;
         int var27;
         String var29;
         if (boldFont != null && this.Field12415 != null) {
            if (this.Field12410 != null) {
               var16 = this.Method13236() - 15;
               int var17 = this.Method13237() + 20;
               Method13384(var16 / 2 - 240 - 6, var17 / 2 - 80 - 6, 480, 160, 225, this.Field12410);
            }

            var29 = Field12129 + " is loading - please wait...";
            var6 = 0;
            var7 = (int)(346.0F * var26 / 100.0F);
            var10 = (int)(346.0F * var9 / 100.0F);
            if (this.Field12415 != null) {
               if ((var7 = (int)((float)this.Field12415.Field9894 * var26 / 100.0F)) < 7) {
                  var7 = 7;
               }

               var27 = var24 - this.Field12415.Field9894 / 2;
               var11 = var5 + 35;
               this.Field12414.Method14495(var27, var11);
               this.Field12415.Method880(0, 0, var7, this.Field12415.Field9895).Method14495(var27, var11);
            } else {
               GraphicsDisplay.Method997().Method1010(var24 - 175 - 4, var5 + 15 + 25 - 2, 354, 40, 7798784, this);
               GraphicsDisplay.Method997().Method1010(var24 - 175 - 2, var5 + 15 + 25, 350, 36, 0, this);
               GraphicsDisplay.Method997().Method1010(var24 - 175, var5 + 15 + 25 + 2, var7, 32, 7798784, this);
            }

            if (!var23.equals("")) {
               if (this.Field12417 != null) {
                  if ((var7 = (int)((float)this.Field12417.Field9894 * var9 / 100.0F)) < 7) {
                     var7 = 7;
                  }

                  var27 = var24 - this.Field12417.Field9894 / 2;
                  var11 = var5 + 10;
                  var6 -= 4;
                  var11 -= 4;
                  this.Field12416.Method14495(var27, var11);
                  this.Field12417.Method880(0, 0, var7, this.Field12417.Field9895).Method14495(var27, var11);
               } else {
                  GraphicsDisplay.Method997().Method1010(var24 - 175 - 4, var5 + 15 - 2, 354, 20, 7798784, this);
                  GraphicsDisplay.Method997().Method1010(var24 - 175 - 2, var5 + 15, 350, 16, 0, this);
                  GraphicsDisplay.Method997().Method1010(var24 - 175, var5 + 15 + 2, var10, 12, 7798784, this);
               }

               boldFont.Method9449(14540253, var24, var23, var5 + 27 + var6, true);
            }

            boldFont.Method9449(14540253, var24, var29, var5, true);
            boldFont.Method9449(14540253, var24, var20, var5 + 38 + 25, true);
         } else {
            var29 = Field12129.replace("-", " ") + " is loading please wait";
            var10 = var20.length() * 375 / 100;
            var7 = var23.length() * 375 / 100;
            var27 = (int)(346.0F * var26 / 100.0F);
            var11 = (int)(346.0F * var9 / 100.0F);
            VarBit.Method1738(var24 - 175 - 4, var5 + 15 + 25 - 2, 354, 40, 7798784, this);
            VarBit.Method1738(var24 - 175 - 2, var5 + 15 + 25, 350, 36, 0, this);
            VarBit.Method1738(var24 - 175, var5 + 15 + 25 + 2, var27, 32, 7798784, this);
            if (var9 != 100.0F && !var23.equals("")) {
               VarBit.Method1738(var24 - 175 - 4, var5 + 15 - 2, 354, 20, 7798784, this);
               VarBit.Method1738(var24 - 175 - 2, var5 + 15, 350, 16, 0, this);
               VarBit.Method1738(var24 - 175, var5 + 15 + 2, var11, 12, 7798784, this);
               VarBit.Method1739(var23, var24 - var7, var5 + 27, 14540253, this);
            }

            VarBit.Method1739(var29, var24 - 175 + 50, var5, 14540253, this);
            VarBit.Method1739(var20, var24 - var10, var5 + 37 + 25, 14540253, this);
         }
      } else {
         if (Field12263 && !Field12264) {
            Field12264 = true;
            if (GraphicsDisplay.Field2678) {
               Class843.Method14016();
            }
         }

         if (this.Field12383) {
            return;
         }

         ++Field12518;
         if (!Field12593) {
            var5 = this.Method13236();
            var6 = this.Method13237();
            if (this.Field12562 == null || this.Field12562.Field241 != var5 || this.Field12562.Field243 != var6) {
               this.Field12562 = Method13409(var5, var6, this.j());
               this.Field12203 = true;
            }

            this.Method13385();
            if (GraphicsDisplay.Field2678 && GraphicsDisplay.Field2667) {
               GraphicsDisplay.Method997().Method1025();
            }

            this.Method13273();
         } else {
            this.Method13356();
         }
      }

      this.Field12640 = 0;
      this.Method13285();
      this.Method13286();
      if (GraphicsDisplay.Field2678) {
         if (this.Field12321 != 0L && System.currentTimeMillis() - this.Field12321 > 500L) {
            this.Field12274 = true;
            this.Field12321 = 0L;
         }

         GraphicsDisplay.Method997().Method1030(this);
         if (GraphicsDisplay.Field2669) {
            GraphicsDisplay.Field2669 = false;
            if (GraphicsDisplay.Field2662) {
               GraphicsDisplay.Field2667 = !GraphicsDisplay.Field2667;
               this.Field12162 = true;
               this.Field12163 = false;
               byte var21 = 99;
               this.Method13210(var21, 0, 0);
               Model.Method14472();
               Class843.Method13985();
               initializeGL();
            }
         }

         if (this.Field12162) {
            this.Field12162 = false;
            Rasterizer.resetTextures();
            Rasterizer.Method14450();
            Model.Method14471();
            if (GraphicsDisplay.Field2678) {
               if (this.Field12163) {
                  Class843.Method13986();
               } else {
                  Method13252();
                  Class843.Method13987();
               }
            }

            System.gc();
            this.Field12163 = true;
         } else if (this.Field12161) {
            Class843.Method13989();
            Class843.Method14017();
            this.Field12161 = false;
         }

         Class600.Method9133();
      }

   }

   private boolean Method13365(String var1) {
      if (var1 == null) {
         return false;
      } else {
         for(int var2 = 0; var2 < this.Field12370; ++var2) {
            if (var1.equalsIgnoreCase(this.Players[var2])) {
               return true;
            }
         }

         return var1.equalsIgnoreCase(session_player.name);
      }
   }

   private static String Method13366(int var0, int var1) {
      if ((var0 -= var1) < -9) {
         return "@red@";
      } else if (var0 < -6) {
         return "@or3@";
      } else if (var0 < -3) {
         return "@or2@";
      } else if (var0 < 0) {
         return "@or1@";
      } else if (var0 > 9) {
         return "@gre@";
      } else if (var0 > 6) {
         return "@gr3@";
      } else if (var0 > 3) {
         return "@gr2@";
      } else {
         return var0 > 0 ? "@gr1@" : "@yel@";
      }
   }

   private void Method13367() {
      if (plainFont != null) {
         int var1 = width - 3;
         if (!Field12712) {
            var1 = 510;
         }

         int var2 = super.Field8800;
         smallFont.Method9444("Fps: " + var2, var1, 16776960, 14);
         if (Field12080) {
            smallFont.Method9444("Cyc: " + super.Field8798, var1, 16776960, 28);
         }

      }
   }

   private void Method13368(int var1, int var2) {
      RSFont var3 = smallFont;
      if (plainFont != null && !Field12120) {
         Runtime var4;
         int var10 = (int)(((var4 = Runtime.getRuntime()).totalMemory() - var4.freeMemory()) / 1024L);
         var3.Method9444("Mem: " + var10 / 1024 + "/" + Math.round(Field12246) + "M", 108, 16776960, 32);
         var3.Method9444("Pos: " + var1 + " " + var2 + " " + Field12379, 108, 16776960, 44);
         if (session_player == null) {
            var3.Method9444("Map pos: " + Field12567 + " " + Field12568, 108, 16776960, 56);
            var3.Method9444("Plr pos: " + Field12490 + " " + Field12491, 108, 16776960, 68);
         } else {
            var3.Method9444("Map pos: " + (session_player.Field4194 - 6 >> 7) + " " + (session_player.Field4195 - 6 >> 7), 108, 16776960, 56);
            var3.Method9444("Map pos: " + session_player.Field4194 + " " + session_player.Field4195, 108, 16776960, 68);
         }

         var3.Method9444("Cam pos: " + (Field12341 - 6 >> 7) + " " + (Field12343 - 6 >> 7), 108, 16776960, 80);
         var1 = 0;
         var2 = 0;
         if (session_player != null) {
            var1 = session_player.Field4194 - 6 >> 7;
            var2 = session_player.Field4195 - 6 >> 7;
         }

         String var11 = "";
         int var5;
         int var6;
         int var7;
         if (var1 < SceneGraph.mapSizeWidth && var2 < SceneGraph.mapSizeWidth && var1 >= 0 && var2 >= 0 && Field12218 != null && Field12218.Field455 != null) {
            var10 = Field12218.Field455[Field12379][var1][var2];
            var5 = Field12218.Field455[Field12379][var1 + 1][var2];
            var6 = Field12218.Field455[Field12379][var1 + 1][var2 + 1];
            var7 = Field12218.Field455[Field12379][var1][var2 + 1];
            int var8 = var10 + var5 + var6 + var7 >> 2;
            var11 = var8 + " / " + Field12218.Field455[Field12379][var1][var2];
         }

         var3.Method9444("GH: " + var11, 108, 16776960, 92);
         var3.Method9444("Mouse: " + super.mouseEventX + " " + super.mouseEventY, 108, 16776960, 104);
         var3.Method9444("P: " + session_player_count + ", N: " + Field12328, 108, 16776960, 116);
         var10 = 16776960;
         var5 = Class843.Method13998().size();
         var6 = Class843.Method14000().size();
         var7 = Field12226 == null ? 0 : Field12226.Method7370();
         float var12;
         if ((var12 = var5 + var6 + var7 > 0 ? ((float)Class842.Method13975() - (float)var7) / (float)(var5 + var6) : (Class842.Method13975() > 0 ? 10.0F : 3.0F)) > 3.0F) {
            var10 = 16711680;
         }

         var3.Method9444("tex: " + Arrays.toString(Class842.Method13976()).replaceAll(", ", ", "), 108, 16776960, 128);
         var3.Method9444("glBufs: " + Class842.Method13975() + " [" + (float)Math.round(var12 * 100.0F) / 100.0F + "]", 108, var10, 140);
         var3.Method9444("VBOs: " + var5 + "/" + var6 + "/" + var7, 108, 16776960, 152);
         var3.Method9444("modelc: " + Model.Method14455(), 108, 16776960, 164);
         var3.Method9444("glAtlasses: " + Class601.Field9002, 108, 16776960, 176);
         var3.Method9444("particles: " + (Field12226 == null ? 0 : Field12226.Method7368()), 108, 16776960, 188);
         var3.Method9444("waters: " + (Field12068 != 0 && Field12428 != null ? Field12428.Field924.Method8958() : 0), 108, 16776960, 200);
         var3.Method9444(Class280.Method2988().Method2990(), 108, 16776960, 212);
         var1 = Field12060 / 100;
         String var9 = String.format("%02d", Field12060 - var1 * 100);
         var3.Method9444("Ver: " + var1 + "." + var9, 108, 16776960, 224);
         var1 = 236;
         if (GraphicsDisplay.Field2678 && !GraphicsDisplay.Field2667) {
            var3.Method9444(Model.Method14513(), 108, 16776960, 236);
            var1 = 248;
         }

         if (this.Field12526 != null) {
            var3.Method9444("Fetcher: " + this.Field12526.Method11954(), 108, 16776960, var1);
            var1 += 12;
         }

         if (class329 != null) {
            var9 = class329.Method3387() + "/" + class329.Method3386();
            var3.Method9444("MDump: " + var9, 108, 16776960, var1);
         }

      }
   }

   private void Method13369() {
      int[] var3 = new int[]{Field12140, 39600, 39900, 40300, 34600, 15106, 3559, 42050, 35000};

      for(int var2 = 0; var2 < 9; ++var2) {
         int var1 = var3[var2];
         RSInterface var4;
         if (this.openInterfaceID == var1 && (var4 = RSInterface.Field12749[var1]) != null) {
            boolean var5;
            if (var4.Field12811 <= 350 && Field12715 >= 175) {
               var5 = true;
            } else {
               if (Field12715 >= 175) {
                  continue;
               }

               var5 = false;
            }

            if (var5 != var4.Field12819) {
               RSInterface.Field12781 = new MemCache(512);
               if (var1 == Field12140) {
                  RSInterface.Method1759(var5, true);
               } else if (var1 == 39600) {
                  RSInterface.Method1750(var5, true);
               } else if (var1 == 39900) {
                  RSInterface.Method1749(var5, true);
               } else if (var1 == 40300) {
                  RSInterface.Method1748(var5, true);
               } else if (var1 == 34600) {
                  RSInterface.Method1746(var5, true);
               } else if (var1 == 15106) {
                  RSInterface.Method1764(var5);
               } else if (var1 == 3559) {
                  RSInterface.Method1763(var5);
               } else if (var1 == 42050) {
                  RSInterface.Method1834(var5);
               } else if (var1 == 35000) {
                  RSInterface.Method1790(var5, true);
               }

               RSInterface.Field12781.Method1512();
               RSInterface.Field12781 = null;
               RSInterface.Field12749[var1].Field12819 = var5;
            }
         }
      }

   }

   private void Method13370(long var1) {
      if (var1 != 0L) {
         try {
            if (this.user_ignore_count >= 100) {
               this.pushMessage("Your ignore list is full. Max of 100 hit", 0, "");
            } else {
               String var3 = Class23.Method207(Class23.Method203(var1));

               int var4;
               for(var4 = 0; var4 < this.user_ignore_count; ++var4) {
                  if (this.user_ignore_names[var4] == var1) {
                     this.pushMessage(var3 + " is already on your ignore list", 0, "");
                     return;
                  }
               }

               for(var4 = 0; var4 < this.Field12370; ++var4) {
                  if (this.Field12437[var4] == var1) {
                     this.pushMessage("Please remove " + var3 + " from your friend list first", 0, "");
                     return;
                  }
               }

               this.user_ignore_names[this.user_ignore_count++] = var1;
               this.Field12630.Method14445(133);
               this.Field12630.Method394(var1);
            }
         } catch (RuntimeException var5) {
            Signlink.reporterror("45688, " + var1 + ", 4" + ", " + var5.toString());
            throw new RuntimeException();
         }
      }
   }

   private void Method13371() {
      int var1 = boldFont.Method9451("Choose Option");

      int var2;
      int var3;
      for(var2 = 0; var2 < this.Field12575; ++var2) {
         if ((var3 = boldFont.Method9451(this.Field12634[var2])) > var1) {
            var1 = var3;
         }
      }

      var1 += 8;
      var2 = 15 * this.Field12575 + 21;
      var3 = Field12712 ? Field12714 : 0;
      int var4 = Field12712 ? Field12715 : 0;
      int var5;
      int var6;
      if (super.clickX > 0 && super.clickY > 0 && super.clickY < var4 + 334) {
         if (!Field12712 && super.clickX >= 516) {
            this.Field12430 = -1;
         } else {
            var5 = Field12712 ? 245 : -4;
            var6 = Field12712 ? -4 : 0;
            int var7 = Field12712 ? 334 : 330;
            int var8;
            if ((var8 = super.clickX - 4 - var1 / 2) + var1 > var5 + 514 + var3) {
               var8 = var5 + 514 + var3 - var1;
            }

            if (var8 < 2) {
               var8 = 2;
            }

            if ((var5 = super.clickY - 4) + var2 > var7 + var4) {
               var5 = var7 + var4 - var2;
            }

            if (var5 < var6) {
               var5 = var6 + 2;
            }

            this.Field12358 = true;
            this.Field12430 = 0;
            this.Field12431 = var8;
            this.Field12432 = var5;
            this.Field12433 = var1;
            this.Field12434 = 15 * this.Field12575 + 22;
         }
      }

      if (super.clickX > 519 && super.clickY > 168 && super.clickY < var4 + 503) {
         var5 = super.clickX - 519 - var1 / 2;
         var6 = super.clickY - 168;
         if (var5 < 2 && var6 + var2 >= var4 + 168) {
            var5 = 2;
         }

         if (var5 < 2 && !Field12712) {
            var5 = 2;
         }

         if (var5 + var1 > var3 + 240) {
            var5 = var3 + 240 - var1;
         }

         if (var6 + var2 > var4 + 333) {
            var6 = var4 + 333 - var2;
         }

         if (var6 < -168) {
            var6 = -166;
         }

         this.Field12358 = true;
         this.Field12430 = 1;
         this.Field12431 = var5;
         this.Field12432 = var6;
         this.Field12433 = var1;
         this.Field12434 = 15 * this.Field12575 + 22;
      }

      if (super.clickX > 0 && super.clickY > var4 + 338 && super.clickX < 516 && super.clickY < var4 + 503) {
         if ((var5 = super.clickX - var1 / 2) < 0) {
            var5 = 0;
         } else if (var5 + var1 > 516) {
            var5 = 516 - var1;
         }

         if ((var6 = super.clickY - 338) + var2 > var4 + 161) {
            var6 = var4 + 161 - var2;
         }

         if (var6 < -338) {
            var6 = -336;
         }

         this.Field12358 = true;
         this.Field12430 = 2;
         this.Field12431 = var5;
         this.Field12432 = var6;
         this.Field12433 = var1;
         this.Field12434 = 15 * this.Field12575 + 22;
      }

   }

   private void Method13372(Packet var1, int var2) {
      boolean var3 = var2 == this.Field12362;
      Player var4;
      (var4 = this.session_players[var2]).ah_2 = currentTime;
      if (var1.gbits(1) == 0) {
         if (!var3) {
            this.session_player_list[session_player_count++] = var2;
            return;
         }
      } else {
         int var5;
         if ((var5 = var1.gbits(3)) == 5) {
            return;
         }

         if (!var3) {
            this.session_player_list[session_player_count++] = var2;
         }

         if (var5 == 0) {
            this.session_npcs_awaiting_update[this.sessionNpcsAwaitingUpdatePtr++] = var2;
         } else {
            int var6;
            if (var5 == 1) {
               var6 = var1.gbits(3);
               var4.a(false, var6);
               if (var1.gbits(1) == 1) {
                  this.session_npcs_awaiting_update[this.sessionNpcsAwaitingUpdatePtr++] = var2;
               }
            } else if (var5 == 2) {
               var6 = var1.gbits(3);
               var4.a(true, var6);
               var6 = var1.gbits(3);
               var4.a(true, var6);
               if (var1.gbits(1) == 1) {
                  this.session_npcs_awaiting_update[this.sessionNpcsAwaitingUpdatePtr++] = var2;
               }
            } else {
               int var7;
               if (var5 != 3) {
                  if (var5 == 4) {
                     var6 = var1.gbits(3);
                     var4.a(true, var6);
                     var6 = var1.gbits(3);
                     var4.a(true, var6);
                     var7 = var1.gbits(3);
                     var4.a(true, var7);
                     if (var1.gbits(1) == 1) {
                        this.session_npcs_awaiting_update[this.sessionNpcsAwaitingUpdatePtr++] = var2;
                     }
                  }
               } else {
                  var6 = var1.gbits(2);
                  if (var2 == this.Field12362) {
                     if (Field12379 != var6) {
                        int var8 = Field12379;
                        Iterator var10 = this.Field12222.values().iterator();

                        while(var10.hasNext()) {
                           Iterator var9;
                           if ((var9 = ((List)var10.next()).iterator()).hasNext()) {
                              Class47 var12 = (Class47)var9.next();
                              Field12428.Method8874(var8, var12.Field2195, var12.Field2196);
                           }
                        }

                        this.Field12222.clear();
                     }

                     Field12379 = var6;
                  }

                  var6 = var1.gbits(1);
                  if (var1.gbits(1) == 1) {
                     this.session_npcs_awaiting_update[this.sessionNpcsAwaitingUpdatePtr++] = var2;
                  }

                  var7 = var1.gbits(7);
                  int var11 = var1.gbits(7);
                  if (Method13313()) {
                     var11 += Field12494;
                     var7 += Field12495;
                  }

                  var4.a(var11, var7, var6 == 1, false);
                  if (var3) {
                     this.Field12289 = true;
                     if (Method13313()) {
                        this.Field12289 = false;
                     }
                  }
               }
            }
         }

         if (var3 && var5 != 0) {
            this.Field12274 = true;
         }
      }

   }

   private boolean Method13373(RSInterface var1, double var2) {
      boolean var4 = false;
      int var5;
      if (this.Method13383(var1)) {
         var5 = var1.Field12801;
      } else {
         var5 = var1.Field12800;
      }

      if (var5 != -1) {
         Sequence var6 = Sequence.anims[var5];
         var1.Field12746 += var2;
         if (var6 != null && var1.Field12746 > var6.Method8283(var1.Field12790)) {
            var1.Field12746 -= var6.Method8283(var1.Field12790) + 1.0D;
            ++var1.Field12790;
            if (var1.Field12790 >= var6.Field10141) {
               var1.Field12790 -= var6.Field10145;
               if (var1.Field12790 < 0 || var1.Field12790 >= var6.Field10141) {
                  var1.Field12790 = 0;
               }
            }

            var4 = true;
         }
      }

      return var4;
   }

   private boolean Method13374(float var1, int var2, boolean var3) {
      if (var2 < 0) {
         return false;
      } else {
         boolean var4 = false;
         RSInterface var7;
         if ((var7 = RSInterface.Field12749[var2]) == null) {
            return false;
         } else {
            if (var7.Field12805 == 6) {
               var4 = false | this.Method13373(var7, (double)var1);
            }

            if (var7 != null && var7.Field12783 != null) {
               var7.Field12728 = false;

               for(int var5 = 0; var5 < var7.Field12783.length && var7.Field12783[var5] != -1; ++var5) {
                  RSInterface var6;
                  if ((var6 = RSInterface.Field12749[var7.Field12783[var5]]) != null) {
                     if (var6.Field12805 == 1) {
                        var4 |= this.Method13374(var1, var6.Field12794, var3);
                     }

                     if (var6.Field12805 == 6 && (var6.Field12800 != -1 || var6.Field12801 != -1)) {
                        var4 |= this.Method13373(var6, (double)var1);
                     }
                  }
               }

               return var4;
            } else {
               return false;
            }
         }
      }
   }

   private int Method13375() {
      try {
         if (Field12123 && !Field12128) {
            return Field12379;
         } else if (Field12379 >= 0 && Field12379 <= 4) {
            int var1 = 3;
            int var2;
            int var3;
            if (Field12344 < 310) {
               label229: {
                  var2 = Field12341 >> 7;
                  var3 = Field12343 >> 7;
                  int var4 = session_player.Field4194 >> 7;
                  int var5 = session_player.Field4195 >> 7;
                  if (var2 >= 0 && var3 >= 0) {
                     if (var2 >= 0 && var3 >= 0) {
                        if (var2 >= SceneGraph.mapSizeWidth || var3 >= SceneGraph.mapSizeWidth) {
                           return Field12379;
                        }

                        if (var2 <= SceneGraph.mapSizeWidth && var3 <= SceneGraph.mapSizeWidth) {
                           if ((this.tileSettingBits[Field12379][var2][var3] & 4) != 0) {
                              var1 = Field12379;
                           }
                        } else {
                           var1 = Field12379;
                        }

                        int var6;
                        if (var4 > var2) {
                           var6 = var4 - var2;
                        } else {
                           var6 = var2 - var4;
                        }

                        int var7;
                        if (var5 > var3) {
                           var7 = var5 - var3;
                        } else {
                           var7 = var3 - var5;
                        }

                        if (var6 > var7) {
                           var6 = (var7 << 16) / var6;
                           var7 = 32768;

                           while(true) {
                              if (var2 == var4) {
                                 break label229;
                              }

                              if (var2 < var4) {
                                 ++var2;
                              } else if (var2 > var4) {
                                 --var2;
                              }

                              if (var2 < 0 || var2 >= SceneGraph.mapSizeWidth || var3 < 0 || var3 >= SceneGraph.mapSizeWidth) {
                                 return 0;
                              }

                              if ((this.tileSettingBits[Field12379][var2][var3] & 4) != 0) {
                                 var1 = Field12379;
                              }

                              if ((var7 += var6) >= 65536) {
                                 var7 -= 65536;
                                 if (var3 < var5) {
                                    ++var3;
                                 } else if (var3 > var5) {
                                    --var3;
                                 }

                                 if (var2 < 0 || var2 >= SceneGraph.mapSizeWidth || var3 < 0 || var3 >= SceneGraph.mapSizeWidth) {
                                    return 0;
                                 }

                                 if ((this.tileSettingBits[Field12379][var2][var3] & 4) != 0) {
                                    var1 = Field12379;
                                 }
                              }
                           }
                        } else {
                           if (var7 == 0) {
                              return 0;
                           }

                           var6 = (var6 << 16) / var7;
                           var7 = 32768;

                           while(true) {
                              if (var3 == var5) {
                                 break label229;
                              }

                              if (var3 < var5) {
                                 ++var3;
                              } else if (var3 > var5) {
                                 --var3;
                              }

                              if (var2 < 0 || var2 >= SceneGraph.mapSizeWidth || var3 < 0 || var3 >= SceneGraph.mapSizeWidth) {
                                 return 0;
                              }

                              if ((this.tileSettingBits[Field12379][var2][var3] & 4) != 0) {
                                 var1 = Field12379;
                              }

                              if ((var7 += var6) >= 65536) {
                                 var7 -= 65536;
                                 if (var2 < var4) {
                                    ++var2;
                                 } else if (var2 > var4) {
                                    --var2;
                                 }

                                 if (var2 < 0 || var2 >= SceneGraph.mapSizeWidth || var3 < 0 || var3 >= SceneGraph.mapSizeWidth) {
                                    return 0;
                                 }

                                 if ((this.tileSettingBits[Field12379][var2][var3] & 4) != 0) {
                                    var1 = Field12379;
                                 }
                              }
                           }
                        }
                     }

                     return Field12379;
                  }

                  return Field12379;
               }
            }

            var2 = session_player.Field4194 >> 7;
            var3 = session_player.Field4195 >> 7;
            if (var2 >= 0 && var3 >= 0 && var2 < SceneGraph.mapSizeWidth && var3 < SceneGraph.mapSizeWidth) {
               if ((this.tileSettingBits[Field12379][var2][var3] & 4) != 0) {
                  var1 = Field12379;
               }

               return var1;
            } else {
               return 0;
            }
         } else {
            return 0;
         }
      } catch (Exception var8) {
         var8.printStackTrace();
         return 0;
      }
   }

   private int Method13376() {
      if (Field12379 < 0) {
         Field12379 = 0;
      }

      int var1;
      if ((var1 = this.Method13277(Field12379, Field12343, Field12341)) < 0) {
         return Field12379;
      } else {
         int var2 = Field12341 >> 7;
         int var3 = Field12343 >> 7;
         if (var2 >= 0 && var3 >= 0 && var2 < SceneGraph.mapSizeWidth && var3 < SceneGraph.mapSizeWidth) {
            if (Field12379 >= 0 && Field12379 < 4) {
               return var1 - Field12342 < 800 && (this.tileSettingBits[Field12379][var2][var3] & 4) != 0 ? Field12379 : 3;
            } else {
               return 3;
            }
         } else {
            return Field12379;
         }
      }
   }

   private void Method13377(long var1) {
      if (var1 != 0L) {
         try {
            for(int var3 = 0; var3 < this.user_ignore_count; ++var3) {
               if (this.user_ignore_names[var3] == var1) {
                  --this.user_ignore_count;
                  System.arraycopy(this.user_ignore_names, var3 + 1, this.user_ignore_names, var3, this.user_ignore_count - var3);
                  this.Field12630.Method14445(74);
                  this.Field12630.Method394(var1);
                  return;
               }
            }

         } catch (RuntimeException var4) {
            Signlink.reporterror("47229, 3, " + var1 + ", " + var4.toString());
            throw new RuntimeException();
         }
      }
   }

   private int Method13378(RSInterface var1, int var2) {
      if (var1.Field12764 != null && var2 < var1.Field12764.length) {
         try {
            int[] var16 = var1.Field12764[var2];
            var2 = 0;
            int var3 = 0;
            byte var4 = 0;

            while(true) {
               int var5 = var16[var3++];
               int var6 = 0;
               byte var7 = 0;
               if (var5 == 0) {
                  return var2;
               }

               if (var5 == 1) {
                  var6 = this.Field12380[var16[var3++]];
               }

               if (var5 == 2) {
                  var6 = this.Field12501[var16[var3++]];
               }

               if (var5 == 3) {
                  var6 = this.Field12347[var16[var3++]];
               }

               RSInterface var8;
               int var9;
               int var10;
               if (var5 == 4) {
                  var8 = RSInterface.Field12749[var16[var3++]];
                  if ((var9 = var16[var3++]) >= 0 && var9 < ItemDef.Field10665) {
                     for(var10 = 0; var10 < var8.Field12796.length; ++var10) {
                        if (var8.Field12796[var10] == var9 + 1) {
                           var6 += var8.Field12795[var10];
                        }
                     }

                     if (var9 == 554 || var9 == 555 || var9 == 556 || var9 == 557) {
                        int[] var18 = null;
                        switch(var9) {
                        case 554:
                           var18 = new int[]{1387, 1393, 1401, 3053, 3054, 18342, 22422, 22423, 22424, 22425};
                           break;
                        case 555:
                           var18 = new int[]{1383, 1395, 1403, 6563, 18342, 22422, 22423, 22424, 22425};
                           break;
                        case 556:
                           var18 = new int[]{1381, 1397, 1405, 14117, 18342, 22422, 22423, 22424, 22425};
                           break;
                        case 557:
                           var18 = new int[]{1385, 1399, 1407, 6563, 18342, 22422, 22423, 22424, 22425, 3053, 3054};
                        }

                        if (var18 != null) {
                           var8 = RSInterface.Field12749[1688];

                           for(var9 = 0; var9 < var8.Field12796.length; ++var9) {
                              int[] var14 = var18;
                              int var13 = var18.length;

                              for(int var12 = 0; var12 < var13; ++var12) {
                                 if (var14[var12] == var8.Field12796[var9] - 1) {
                                    var6 = 999999999;
                                 }
                              }
                           }
                        }
                     }
                  }
               }

               if (var5 == 5) {
                  var6 = this.Field12444[var16[var3++]];
               }

               if (var5 == 6) {
                  var6 = Field12481[this.Field12501[var16[var3++]] - 1];
               }

               if (var5 == 7) {
                  var6 = this.Field12444[var16[var3++]] * 100 / '뜛';
               }

               if (var5 == 8) {
                  var6 = session_player.combatLevel;
               }

               int var17;
               if (var5 == 9) {
                  for(var17 = 0; var17 < Class620.Field3678; ++var17) {
                     if (Class620.Field3679[var17]) {
                        var6 += this.Field12501[var17];
                     }
                  }
               }

               if (var5 == 10) {
                  var8 = RSInterface.Field12749[var16[var3++]];
                  if ((var9 = var16[var3++] + 1) >= 0 && var9 < ItemDef.Field10665) {
                     for(var10 = 0; var10 < var8.Field12796.length; ++var10) {
                        if (var8.Field12796[var10] == var9) {
                           var6 = 999999999;
                           break;
                        }
                     }
                  }
               }

               if (var5 == 11) {
                  var6 = this.Field12584;
               }

               if (var5 == 12) {
                  var6 = this.Field12353;
               }

               if (var5 == 13) {
                  var17 = this.Field12444[var16[var3++]];
                  var9 = var16[var3++];
                  var6 = (var17 & 1 << var9) == 0 ? 0 : 1;
               }

               if (var5 == 14) {
                  var17 = var16[var3++];
                  VarBit var19;
                  var10 = (var19 = VarBit.Field12723[var17]).Field12724;
                  var17 = var19.Field12725;
                  var9 = var19.Field12726;
                  int var11 = Field12656[var9 - var17];
                  var6 = this.Field12444[var10] >> var17 & var11;
               }

               if (var5 == 15) {
                  var7 = 1;
               }

               if (var5 == 16) {
                  var7 = 2;
               }

               if (var5 == 17) {
                  var7 = 3;
               }

               if (var5 == 18) {
                  var6 = (session_player.Field4194 >> 7) + Field12490;
               }

               if (var5 == 19) {
                  var6 = (session_player.Field4195 >> 7) + Field12491;
               }

               if (var5 == 20) {
                  var6 = var16[var3++];
               }

               if (var7 == 0) {
                  if (var4 == 0) {
                     var2 += var6;
                  }

                  if (var4 == 1) {
                     var2 -= var6;
                  }

                  if (var4 == 2 && var6 != 0) {
                     var2 /= var6;
                  }

                  if (var4 == 3) {
                     var2 *= var6;
                  }

                  var4 = 0;
               } else {
                  var4 = var7;
               }
            }
         } catch (Exception var15) {
            var15.printStackTrace();
            return -1;
         }
      } else {
         return -2;
      }
   }

   private void Method13379() {
      if (this.Field12575 >= 2 || this.Field12697 != 0 || this.Field12577 != 0) {
         String var1;
         if (this.Field12697 == 1 && this.Field12575 < 2) {
            var1 = "Use " + this.Field12701 + " with...";
         } else if (this.Field12577 == 1 && this.Field12575 < 2) {
            var1 = this.Field12580 + "...";
         } else {
            var1 = this.Field12634[this.Field12575 - 1];
         }

         if (this.Field12575 > 2) {
            var1 = var1 + "@whi@ / " + (this.Field12575 - 2) + " more options";
         }

         boldFont.Method9458(4, 16777215, var1, currentTime / 1000, 15);
      }
   }

   private void Method13380(Mobile var1, int var2) {
      this.Method13381(var1.boundExtentX, var2, var1.boundExtentY);
   }

   private void Method13381(int var1, int var2, int var3) {
      if (var1 >= 128 && var3 >= 128 && var1 <= 13056 && var3 <= 13056) {
         var2 = this.Method13277(Field12379, var3, var1) - var2;
         var1 -= Field12341;
         var2 -= Field12342;
         var3 -= Field12343;
         int var4 = Field12344;
         if (Field12344 < 0) {
            var4 += 2048;
         }

         int var5 = Rasterizer.Field9959[var4];
         var4 = Rasterizer.Field9960[var4];
         int var6 = Rasterizer.Field9959[Field12345];
         int var7 = Rasterizer.Field9960[Field12345];
         int var8 = var3 * var6 + var1 * var7 >> 16;
         var3 = var3 * var7 - var1 * var6 >> 16;
         var1 = var8;
         var8 = var2 * var4 - var3 * var5 >> 16;
         var3 = var2 * var5 + var3 * var4 >> 16;
         if (var3 >= 50) {
            this.Field12440 = Rasterizer.Field9955 + (var1 << Field12133) / var3;
            this.Field12441 = Rasterizer.Field9956 + (var8 << Field12133) / var3;
         } else {
            this.Field12440 = -1;
            this.Field12441 = -1;
         }
      } else {
         this.Field12440 = -1;
         this.Field12441 = -1;
      }
   }

   public final void Method13382(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, boolean var10, boolean var11, boolean var12) {
      Class354 var13;
      (var13 = new Class354()).Field1477 = var10;
      var13.Field1476 = var12;
      var13.Field1478 = var7;
      var13.Field1479 = var4;
      var13.Field1480 = var8;
      var13.Field1481 = var5;
      var13.Field1482 = var2;
      var13.Field1484 = var6;
      var13.Field1483 = var3;
      if (var11) {
         this.Field12083.add(var13);
      } else {
         this.Field12082.add(var13);
      }
   }

   private boolean Method13383(RSInterface var1) {
      if (var1.Field12789 == null) {
         return false;
      } else {
         for(int var2 = 0; var2 < var1.Field12789.length; ++var2) {
            int var3 = this.Method13378(var1, var2);
            int var4 = var1.Field12750[var2];
            if (var1.Field12789[var2] == 2) {
               if (var3 >= var4) {
                  return false;
               }
            } else if (var1.Field12789[var2] == 3) {
               if (var3 <= var4) {
                  return false;
               }
            } else if (var1.Field12789[var2] == 4) {
               if (var3 == var4) {
                  return false;
               }
            } else if (var3 != var4) {
               return false;
            }
         }

         return true;
      }
   }

   public static void Method13384(int var0, int var1, int var2, int var3, int var4, RgbImage[] var5) {
      int var6 = var5[0].Field9894;
      var2 /= var6;
      var3 /= var6;
      var5[0].Method892(var0, var1, var4);
      var5[2].Method892(var0, var1 + var3 * var6, var4);
      var5[6].Method892(var0 + var2 * var6, var1, var4);
      var5[8].Method892(var0 + var2 * var6, var1 + var3 * var6, var4);

      int var7;
      for(var7 = 1; var7 < var3; ++var7) {
         var5[1].Method892(var0, var1 + var7 * var6, var4);
         var5[7].Method892(var0 + var2 * var6, var1 + var7 * var6, var4);
      }

      for(var7 = 1; var7 < var2; ++var7) {
         var5[3].Method892(var0 + var7 * var6, var1, var4);
         var5[5].Method892(var0 + var7 * var6, var1 + var3 * var6, var4);
      }

      for(var7 = 1; var7 < var2; ++var7) {
         for(int var8 = 1; var8 < var3; ++var8) {
            var5[4].Method892(var0 + var7 * var6, var1 + var8 * var6, var4);
         }
      }

   }

   private void Method13385() {
      Field12714 = this.Method13236() - 765;
      Field12715 = this.Method13237() - 503;
      int var2 = Field12714 / 2;
      int var3 = Field12715 / 2;
      this.Field12562.Method13683();
      int var4;
      int var5;
      int var7;
      int var12;
      if (this.Field12164) {
         if (!Field12166 && Field12263) {
            Model.Method14524();
            Field12714 = this.Method13236() - 765;
            Field12715 = this.Method13237() - 503;
            width = Field12714 + 765;
            height = Field12715 + 503;
            var4 = width / 2;
            var5 = height / 2;
            byte var10;
            if (Field12173 == null) {
               if (this.Field12174 == 0L) {
                  this.Field12174 = System.currentTimeMillis();
               } else if (System.currentTimeMillis() - this.Field12174 > 100L) {
                  boolean var6 = true;
                  this.Method13227(0);
                  this.Field12164 = true;
                  Field12379 = (Field12173 = new Class565(this)).Field506;
                  this.Method13226(Field12173.Field504, Field12173.Field505);
                  this.Method13227(1);
                  this.Field12174 = 0L;
                  this.Method13228();
                  var10 = 3;
                  this.Method13210(var10, 0, 0);
               }
            }

            var12 = Rasterizer.Field9955;
            var7 = Rasterizer.Field9956;
            int[] var8 = Rasterizer.Field9961;
            if (this.Field12170 != null && (this.Field12171 != width || this.Field12172 != height)) {
               this.Field12170 = null;
            }

            if (this.Field12170 == null) {
               this.Field12171 = width;
               this.Field12172 = height;
               Rasterizer.Method14494(width, height);
               this.Field12170 = Rasterizer.Field9961;
               this.Method13228();
            }

            Rasterizer.Field9955 = var4;
            Rasterizer.Field9956 = var5;
            Rasterizer.Field9961 = this.Field12170;
            if (Class569.Field457 != Field12379) {
               var10 = 3;
               this.Method13210(var10, 0, 0);
            }

            this.Method13295();
            Class697.Method14445(13421235);
            Field12128 = true;
            Rasterizer.Method14458();
            if (GraphicsDisplay.Field2678) {
               GraphicsDisplay.Method997().Method1024();
            }

            Field12567 = (Field12341 >> 7) - 20;
            Field12568 = Field12343 >> 7;
            Field12569 = this.Method13277(Field12379, Field12567, Field12568);
            Field12428.Method8886(Field12341, Field12343, Field12345 % 2048, Field12342, this.Method13376(), Field12344 % 2048, Field12567, Field12568, 0, Field12134);
            Field12428.Method8868();
            if (GraphicsDisplay.Field2678) {
               GraphicsDisplay.Method997().Method1026(1.0D);
            }

            Rasterizer.Method14471();
            Rasterizer.Method14472();
            this.ModelUtility();
            Rasterizer.Field9955 = var12;
            Rasterizer.Field9956 = var7;
            Rasterizer.Field9961 = var8;
         } else if (GraphicsDisplay.Field2678) {
            GraphicsDisplay.Method997().Method1026(1.0D);
         }
      }

      this.Method13304();
      boolean var1 = Field12272 || Field12593;
      if (smallFont != null && this.Field12526 != null) {
         var2 = this.Method13236();
         var3 = this.Method13237();
         Method13384(var2 / 2 - 190 - 6, var3 / 2 - 90 - 6, 380, 180, 225, this.Field12410);
         if (this.Field12099 == 0) {
            this.openInterfaceID = -1;
            var4 = var2 / 2 + 190 - 25;
            var5 = var3 / 2 + 90 - 5;
            this.Field12425[0].Method14495(var4 - 5, var5 - 5);
            this.Field12424.Method14495(var4, var5);
            var4 -= 31;
            var5 -= 2;
            this.Field12425[Field12588 ? 1 : 0].Method14495(var4 - 5, var5 - 3);
            this.Field12429[13].Method14495(var4, var5);
         } else if (this.Field12099 == 1) {
            if (this.openInterfaceID != 35000) {
               this.openInterfaceID = 35000;
               this.Method13219();
            }

            this.Field12575 = 0;
            var4 = var2 / 2 - 250;
            var5 = var3 / 2 - 100;
            this.Method13362(0, var4, RSInterface.Field12749['袸'], var5);
            this.Method13265(var4, RSInterface.Field12749[this.openInterfaceID], super.mouseEventX, var5, super.mouseEventY, 0);
            this.d_91 = 0;
            if (this.Field12562 != null) {
               this.Field12562.Method3038(0, super.Method11952(), 0);
            }

            return;
         }

         if (this.Field12325 == 0) {
            var4 = var3 / 2 + 80;
            this.Field12409.Method14495(var2 / 2 - this.Field12409.Field9894 / 2 - 2, var4 - 20);
            String var11 = !Field12166 ? "Background Image" : "Background Scene";
            smallFont.Method9449(12255232, var2 / 2 - 1, var11, var4, true);
            var12 = var3 / 2 + 80;
            smallFont.Method9449(7711145, var2 / 2, this.Field12526.Field10058, var12, true);
            var12 = var3 / 2 - 20;
            boldFont.Method9449(12255232, var2 / 2, "Welcome to " + Field12129, var12, true);
            var5 = var2 / 2 - 80;
            var7 = var3 / 2 + 20;
            this.Field12408.Method14495(var5 - 73, var7 - 20);
            boldFont.Method9449(14540253, var5, "New User", var7 + 5, true);
            var5 = var2 / 2 + 80;
            this.Field12408.Method14495(var5 - 73, var7 - 20);
            boldFont.Method9449(14540253, var5, "Existing User", var7 + 5, true);
         }

         if (this.Field12325 == 2) {
            var4 = var3 / 2 - 40;
            if (this.Field12686.length() > 0) {
               String[] var13 = this.Field12686.split("\n");
               var4 -= var13.length * (var13.length > 4 ? 8 : 9);
               String[] var15 = var13;
               var7 = var13.length;

               for(var5 = 0; var5 < var7; ++var5) {
                  String var14 = var15[var5];
                  boldFont.Method9446(var14, var2 / 2, 12255232, var4);
                  var4 += 12;
               }

               var4 = var3 / 2 - 40 + 20;
            } else if (this.Field12684.length() > 0) {
               boldFont.Method9449(12255232, var2 / 2, this.Field12684, var4 - 15, true);
               boldFont.Method9449(12255232, var2 / 2, this.Field12685, var4, true);
               var4 += 20;
            } else {
               boldFont.Method9449(12255232, var2 / 2, this.Field12685, var4 - 7, true);
               var4 += 20;
            }

            boldFont.addButton(true, var2 / 2 - 90, 14540253, "Username: " + this.myUsername + (this.Field12643 == 0 & currentTime % 40 < 20 ? "@dre@|" : ""), var4);
            var4 += 15;
            boldFont.addButton(true, var2 / 2 - 90, 14540253, "Password: " + Class23.Method208(this.Field12614) + (this.Field12643 == 1 & currentTime % 40 < 20 ? "@dre@|" : ""), var4);
            var4 += 15;
            boldFont.addButton(true, var2 / 2 - 90, 14540253, "World: " + this.Field12211 + (this.Field12643 == 2 & currentTime % 40 < 20 ? "@dre@|" : ""), var4);
            if (!var1) {
               var5 = var2 / 2 - 80;
               var12 = var3 / 2 + 50;
               this.Field12408.Method14495(var5 - 73, var12 - 20);
               boldFont.Method9449(14540253, var5, "Login", var12 + 5, true);
               var5 = var2 / 2 + 80;
               this.Field12408.Method14495(var5 - 73, var12 - 20);
               boldFont.Method9449(14540253, var5, "Cancel", var12 + 5, true);
            }
         }

         if (this.Field12325 == 3) {
            var4 = var3 / 2 - 40;
            if (this.Field12684.length() > 0) {
               boldFont.Method9449(12255232, var2 / 2, this.Field12684, var4 - 15, true);
               boldFont.Method9449(12255232, var2 / 2, this.Field12685, var4, true);
            } else if (this.Field12685.length() > 0) {
               boldFont.Method9449(12255232, var2 / 2, this.Field12685, var4, true);
            } else {
               boldFont.Method9449(12255232, var2 / 2, "Please enter your wanted username", var4 - 15, true);
               boldFont.Method9449(12255232, var2 / 2, "and desired password twice below", var4, true);
            }

            var4 += 20;
            boldFont.addButton(true, var2 / 2 - 90, 14540253, "Username: " + this.myUsername + (this.Field12643 == 0 & currentTime % 40 < 20 ? "@dre@|" : ""), var4);
            var4 += 15;
            boldFont.addButton(true, var2 / 2 - 90, 14540253, "Password: " + Class23.Method208(this.Field12614) + (this.Field12643 == 1 & currentTime % 40 < 20 ? "@dre@|" : ""), var4);
            var4 += 15;
            boldFont.addButton(true, var2 / 2 - 90, 14540253, "Repeat password: " + Class23.Method208(this.Field12151) + (this.Field12643 == 2 & currentTime % 40 < 20 ? "@dre@|" : ""), var4);
            if (!var1) {
               var5 = var2 / 2 - 80;
               var12 = var3 / 2 + 50;
               this.Field12408.Method14495(var5 - 73, var12 - 20);
               boldFont.Method9449(14540253, var5, "Create Account", var12 + 5, true);
               var5 = var2 / 2 + 80;
               this.Field12408.Method14495(var5 - 73, var12 - 20);
               boldFont.Method9449(14540253, var5, "Cancel", var12 + 5, true);
            }
         }
      } else {
         VarBit.Method1739(Field12129 + " is loading...", var2, var3 - 20, 0, this);
      }

      if (this.Field12562 != null) {
         this.Field12562.Method3038(0, super.Method11952(), 0);
      }

      if (this.Field12675) {
         this.Field12675 = false;
      }

   }

   public final void repaintGame() {
      this.Field12675 = true;
   }

   private void parsePacketGroup(Packet var1, int packetID) {
      int var3;
      int var4;
      int var5;
      int var6;
      int var7;
      int var8;
      int var9;
      if (packetID == 105) {
         var3 = var1.g1();
         var4 = this.Field12687 + (var3 >> 4 & 7);
         var5 = this.Field12688 + (var3 & 7);
         var6 = var1.g2();
         var8 = (var7 = var1.g1()) >> 4 & 15;
         var9 = var7 & 7;
         //w_14
         if (session_player.w_14[0] >= var4 - var8 && session_player.w_14[0] <= var4 + var8 && session_player.x_13[0] >= var5 - var8 && session_player.x_13[0] <= var5 + var8 && this.Field12335 && this.Field12519 < 50) {
            this.Field12636[this.Field12519] = var6;
            this.Field12661[this.Field12519] = var9;
            this.Field12671[this.Field12519] = (float)Class104.Field10010[var6];
            ++this.Field12519;
         }
      }

      if (packetID == 215) {
         var3 = var1.sg2();
         var4 = var1.sg1();
         var5 = this.Field12687 + (var4 >> 4 & 7);
         var6 = this.Field12688 + (var4 & 7);
         var7 = var1.sg2();
         var8 = var1.g2();
         if (var5 >= 0 && var6 >= 0 && var5 < SceneGraph.mapSizeWidth && var6 < SceneGraph.mapSizeWidth && var7 != this.Field12357) {
            Class47 var30;
            (var30 = new Class47()).itemID = var3;
            var30.Field2199 = var8;
            this.Method13255(var5, var6, Field12379, var30);
         }

      } else if (packetID == 156) {
         var3 = var1.Method417();
         var4 = this.Field12687 + (var3 >> 4 & 7);
         var5 = this.Field12688 + (var3 & 7);
         var6 = var1.g2();
         if (var4 >= 0 && var5 >= 0 && var4 < SceneGraph.mapSizeWidth && var5 < SceneGraph.mapSizeWidth) {
            this.Method13254(var4, var5, Field12379, var6);
         }

      } else {
         int var10;
         int var11;
         int var12;
         int var13;
         int var15;
         int var33;
         if (packetID == 160) {
            var3 = var1.sg1();
            var4 = this.Field12687 + (var3 >> 4 & 7);
            var5 = this.Field12688 + (var3 & 7);
            var7 = (var6 = var1.sg1()) >> 2;
            var8 = var6 & 3;
            var9 = this.Field12617[var7];
            var3 = var1.sg2();
            if (var4 >= 0 && var5 >= 0 && var4 < SceneGraph.mapSizeWidth - 1 && var5 < SceneGraph.mapSizeWidth - 1) {
               var10 = this.intGroundArray[Field12379][var4][var5];
               var11 = this.intGroundArray[Field12379][var4 + 1][var5];
               var12 = this.intGroundArray[Field12379][var4 + 1][var5 + 1];
               var13 = this.intGroundArray[Field12379][var4][var5 + 1];
               SceneGraph var10001;
               int var20;
               Class501 var28;
               if (var9 == 0) {
                  var20 = Field12379;
                  var10001 = Field12428;
                  Class885 var43 = (var28 = Field12428.Method8846(var20, var4, var5)) == null ? null : var28.Field12848;
                  Class885 var34 = var43;
                  if (var43 != null) {
                     var15 = var34.Field917;
                     if (var7 == 2) {
                        var34.Field915 = new ObjectInstance(var15, var8 + 4, 2, var11, var12, var10, var13, var3, false, var4, var5, Field12379);
                        var34.Field916 = new ObjectInstance(var15, var8 + 1 & 3, 2, var11, var12, var10, var13, var3, false, var4, var5, Field12379);
                     } else {
                        var34.Field915 = new ObjectInstance(var15, var8, var7, var11, var12, var10, var13, var3, false, var4, var5, Field12379);
                     }
                  }
               }

               if (var9 == 1) {
                  var6 = Field12379;
                  var10001 = Field12428;
                  Class887 var44 = (var28 = Field12428.Method8846(var6, var4, var5)) == null ? null : var28.Field12849;
                  Class887 var35 = var44;
                  if (var44 != null) {
                     var35.Field902 = new ObjectInstance(var35.Field903, 0, 4, var11, var12, var10, var13, var3, false, var4, var5, Field12379);
                  }
               }

               if (var9 == 2) {
                  var6 = Field12379;
                  packetID = var5;
                  var20 = var4;
                  var10001 = Field12428;
                  Class890 var45;
                  if ((var28 = Field12428.Method8846(var6, var4, var5)) == null) {
                     var45 = null;
                  } else {
                     var33 = 0;

                     while(true) {
                        if (var33 >= var28.Field12853) {
                           var45 = null;
                           break;
                        }

                        Class890 var42;
                        if ((var42 = var28.Field12854[var33]).Field434 == var20 && var42.Field436 == packetID) {
                           var45 = var42;
                           break;
                        }

                        ++var33;
                     }
                  }

                  Class890 var38 = var45;
                  if (var7 == 11) {
                     var7 = 10;
                  }

                  if (var38 != null) {
                     var38.Field430 = new ObjectInstance(var38.Field440, var8, var7, var11, var12, var10, var13, var3, false, var4, var5, Field12379);
                  }
               }

               if (var9 == 3) {
                  var6 = Field12379;
                  var10001 = Field12428;
                  Class896 var46 = (var28 = Field12428.Method8846(var6, var4, var5)) != null && var28.Field12850 != null ? var28.Field12850 : null;
                  Class896 var40 = var46;
                  if (var46 != null) {
                     var40.Field422 = new ObjectInstance(var40.Field423, var8, 22, var11, var12, var10, var13, var3, false, var4, var5, Field12379);
                  }
               }
            }

            Class838.Field6955.Method10101(var4, var5, Field12379);
         } else {
            if (packetID == 147) {
               var3 = var1.sg1();
               var4 = this.Field12687 + (var3 >> 4 & 7);
               var5 = this.Field12688 + (var3 & 7);
               var6 = var1.g2();
               byte var23 = (byte)(128 - var1.Field1259[var1.pos++]);
               var8 = var1.ig2();
               byte var24 = var1.Method420();
               var3 = var1.g2();
               var11 = (var10 = var1.sg1()) >> 2;
               var12 = var10 & 3;
               var13 = this.Field12617[var11];
               byte var14 = var1.Method400();
               var15 = var1.g2();
               byte var16 = var1.Method420();
               Player var22;
               if (var6 == this.Field12357) {
                  var22 = session_player;
               } else {
                  var22 = this.session_players[var6];
               }

               if (var22 != null) {
                  ObjectDefinition var25 = ObjectDefinition.Method11938(var15);
                  var15 = this.intGroundArray[Field12379][var4][var5];
                  int var17 = this.intGroundArray[Field12379][var4 + 1][var5];
                  int var18 = this.intGroundArray[Field12379][var4 + 1][var5 + 1];
                  int var19 = this.intGroundArray[Field12379][var4][var5 + 1];
                  Model var29;
                  if ((var29 = var25.Method11944(var11, var12, var15, var17, var18, var19, -1, Model.Field2798, var4, var5, Field12379)) != null) {
                     this.Method13382(var3 + 1, -1, 0, var13, var5, 0, Field12379, var4, var8 + 1, true, true, true);
                     var22.Field4194 = var8 + currentTime;
                     var22.Field4195 = var3 + currentTime;
                     var22.aModel_1714 = var29;
                     var3 = var25.Field10556;
                     var8 = var25.Field10570;
                     if (var12 == 1 || var12 == 3) {
                        var3 = var25.Field10570;
                        var8 = var25.Field10556;
                     }

                     var22.anInt1711 = (var4 << 7) + (var3 << 6);
                     var22.anInt1713 = (var5 << 7) + (var8 << 6);
                     var22.anInt1712 = this.Method13277(Field12379, var22.anInt1713, var22.anInt1711);
                     byte var21;
                     if (var14 > var23) {
                        var21 = var14;
                        var14 = var23;
                        var23 = var21;
                     }

                     if (var16 > var24) {
                        var21 = var16;
                        var16 = var24;
                        var24 = var21;
                     }

                     var22.anInt1719 = var4 + var14;
                     var22.anInt1721 = var4 + var23;
                     var22.anInt1720 = var5 + var16;
                     var22.anInt1722 = var5 + var24;
                  }
               }
            }

            if (packetID == 151) {
               var3 = var1.Method417();
               var4 = this.Field12687 + (var3 >> 4 & 7);
               var5 = this.Field12688 + (var3 & 7);
               var6 = var1.ig2();
               var7 = var1.sg1();
               var8 = var1.sg1() % 4;
               var9 = var7 >> 2;
               var3 = var7 & 3;
               var10 = var9;
               if (var9 >= this.Field12617.length) {
                  var9 = 0;
               }

               var11 = this.Field12617[var9];
               if (var6 == 0) {
                  var6 = 6951;
               }

               boolean var31 = true;
               if (var6 == 6952) {
                  var31 = false;
               }

               if (var6 == 6951) {
                  var6 = -1;
               }

               ObjectDefinition var32 = ObjectDefinition.Method11938(var6);
               if (!Field12596 && var32 != null) {
                  var32.Field10586 = true;
               }

               if (var32 != null) {
                  var32.Method11943(var6, 0);
               }

               if (Field12218 != null && Field12218.Method8825()) {
                  Field12248 = System.currentTimeMillis();
               }

               if (var4 >= 0 && var5 >= 0 && var4 < SceneGraph.mapSizeWidth && var5 < SceneGraph.mapSizeWidth) {
                  if ((var6 > 0 || var6 == 26338 || var6 == 26339) && var32 != null && (var32.Field10556 > 1 || var32.Field10570 > 1)) {
                     int var10000;
                     if (var9 != 0 && var9 != 2) {
                        var10000 = var32.Field10570;
                        var10000 = var32.Field10556;
                     } else {
                        var10000 = var32.Field10556;
                        var10000 = var32.Field10570;
                     }
                  }

                  if (var10 != 5 && var31 && (var32 == null || var32.Field10577)) {
                     this.Field12655[var8].Field12868[this.Field12687][this.Field12688] = 0;
                  }

                  boolean var39 = true;
                  if (var9 >= 2 && var9 <= 9 && var6 != 6951 && var6 > 0) {
                     var39 = false;
                  }

                  this.Method13382(-1, var6, var3, var11, var5, var9, var8, var4, 0, true, true, var39);
               }

            } else if (packetID == 4) {
               var3 = var1.g1();
               var4 = this.Field12687 + (var3 >> 4 & 7);
               var5 = this.Field12688 + (var3 & 7);
               SpotAnim.Method8313(var6 = var1.g2());
               var7 = var1.g1();
               var8 = var1.g2();
               if (var4 >= 0 && var5 >= 0 && var4 < SceneGraph.mapSizeWidth && var5 < SceneGraph.mapSizeWidth) {
                  var4 = (var4 << 7) + 64;
                  var5 = (var5 << 7) + 64;
                  Class490 var27 = new Class490(Field12379, currentTime, var8, var6, this.Method13277(Field12379, var5, var4) - var7, var5, var4);
                  this.Field12512.add(var27);
               }

            } else if (packetID == 44) {
               var3 = var1.isg2();
               var4 = var1.g2();
               var1.g1();
               var6 = this.Field12687;
               var7 = this.Field12688;
               if (var6 >= 0 && var7 >= 0 && var6 < SceneGraph.mapSizeWidth && var7 < SceneGraph.mapSizeWidth) {
                  Class47 var26;
                  (var26 = new Class47()).itemID = var3;
                  var26.Field2199 = var4;
                  this.Method13255(var6, var7, Field12379, var26);
               }

            } else if (packetID == 101) {
               var4 = (var3 = var1.ng1b()) >> 2;
               var5 = var3 & 3;
               var6 = this.Field12617[var4];
               var7 = var1.g1();
               var8 = this.Field12687 + (var7 >> 4 & 7);
               var9 = this.Field12688 + (var7 & 7);
               if (var8 >= 0 && var9 >= 0 && var8 < SceneGraph.mapSizeWidth && var9 < SceneGraph.mapSizeWidth) {
                  this.Method13382(-1, -1, var5, var6, var9, var4, Field12379, var8, 0, true, true, true);
               }

            } else {
               if (packetID == 117) {
                  var3 = var1.g1();
                  var4 = this.Field12687 + (var3 >> 4 & 7);
                  var5 = this.Field12688 + (var3 & 7);
                  var6 = var4 + var1.Method400();
                  var7 = var5 + var1.Method400();
                  var8 = var1.Method402();
                  var9 = var1.g2();
                  var3 = var1.g1() << 2;
                  var10 = var1.g1() << 2;
                  var11 = var1.g2();
                  var12 = var1.g2();
                  var13 = var1.g1();
                  var33 = var1.g1();
                  if (var4 >= 0 && var5 >= 0 && var4 < SceneGraph.mapSizeWidth && var5 < SceneGraph.mapSizeWidth && var6 >= 0 && var7 >= 0 && var6 < SceneGraph.mapSizeWidth && var7 < SceneGraph.mapSizeWidth && var9 != 65535) {
                     var4 = (var4 << 7) + 64;
                     var5 = (var5 << 7) + 64;
                     var6 = (var6 << 7) + 64;
                     var7 = (var7 << 7) + 64;
                     if (var3 != var10) {
                        if (var8 > 0) {
                           Npc var36;
                           if ((var36 = this.Field12327[var8 - 1]) != null) {
                              var10 = var36.D_16 / 2 + 15;
                           }
                        } else if (var8 < 0) {
                           var15 = -var8 - 1;
                           Player var41;
                           if (packetID == this.Field12357) {
                              var41 = session_player;
                           } else {
                              var41 = this.session_players[var15];
                           }

                           if (var41 != null) {
                              var10 = var41.D_16 / 2 + 15;
                           }
                        }
                     }

                     Class489 var37;
                     (var37 = new Class489(var13, var10, var11 + currentTime, var12 + currentTime, var33, Field12379, this.Method13278(Field12379, var5, var4, false) - var3, var5, var4, var8, var9)).Method8094(var11 + currentTime, var7, this.Method13278(Field12379, var7, var6, false) - var10, var6);
                     this.Field12511.add(var37);
                  }
               }

            }
         }
      }
   }

   private void Method13388() {
      boolean var1 = true;
      if (Field12588) {
         Signlink.Method13363(0.3F);
         this.Field12652 = 207;
         this.Field12526.Method11960(2, this.Field12652);
      } else {
         Signlink.Method11836();
      }
   }

   private void updatePlayer(int packetSize, Packet stream) {
      this.sessionNpcsAwaitingUpdatePtr = 0;
      stream.Method14514();
      this.Method13372(stream, this.Field12362);
      Packet var4 = stream;
      Client var3 = this;
      int var5;
      int var6;
      if ((var5 = stream.gbits(8)) < session_player_count) {
         for(var6 = var5; var6 < session_player_count; ++var6) {
            var3.session_npcs_awaiting_update[var3.sessionNpcsAwaitingUpdatePtr++] = var3.session_player_list[var6];
         }
      }

      if (var5 > session_player_count) {
         Signlink.reporterror(var3.myUsername + " Too many players");
         throw new RuntimeException("eek");
      } else {
         session_player_count = 0;

         for(var6 = 0; var6 < var5; ++var6) {
            int var7 = var3.session_player_list[var6];
            if (var3.session_players[var7] == null) {
               System.err.println("fixing corrupt null player2, pos: " + var7 + " ");
               var3.session_players[var7] = new Player();
            }

            var3.Method13372(var4, var7);
         }

         this.updateOtherPlayerMovements(stream, packetSize);
         this.appendPlayerUpdateMask(stream);
         if (stream.pos != packetSize) {
            Signlink.reporterror("Error packet size mismatch in getplayer pos:" + stream.pos + " psize:" + packetSize);
            throw new RuntimeException("eek");
         } else {
            for(packetSize = 0; packetSize < session_player_count; ++packetSize) {
               if (this.session_players[this.session_player_list[packetSize]] == null) {
                  Signlink.reporterror(this.myUsername + " null entry in player list - pos:" + packetSize + " size:" + session_player_count);
                  this.session_players[this.session_player_list[packetSize]] = new Player();
                  System.err.println("fixing corrupt null player1, pos: " + packetSize + " ");
               }
            }

         }
      }
   }

   private static int Method13390() {
      return !Rasterizer.Field9949 ? 383 : 500;
   }

   private static int Method13391() {
      if (!Rasterizer.Field9949) {
         int var0;
         if ((var0 = 128 - Field12134 / 20) < 32) {
            var0 = 32;
         }

         return var0;
      } else {
         return -300;
      }
   }

   private void Method13392(String var1, int var2) {
      switch(var2) {
      case 1675:
         this.Method13393(var1, 17508);
         return;
      case 1676:
         this.Method13393(var1, 17509);
         return;
      case 1677:
         this.Method13393(var1, 17510);
         return;
      case 1678:
         this.Method13393(var1, 17511);
         return;
      case 1679:
         this.Method13393(var1, 17512);
         return;
      case 1680:
         this.Method13393(var1, 17513);
         return;
      case 1681:
         this.Method13393(var1, 17514);
         return;
      case 1682:
         this.Method13393(var1, 17515);
         return;
      case 1683:
         this.Method13393(var1, 17516);
         return;
      case 1684:
         this.Method13393(var1, 17517);
         return;
      case 1686:
         this.Method13393(var1, 17518);
         return;
      case 1687:
         this.Method13393(var1, 17519);
      case 1685:
      default:
      }
   }

   private void Method13393(String var1, int var2) {
      if (RSInterface.Field12749[var2] != null) {
         RSInterface.Field12749[var2].Field12792 = var1;
         if (RSInterface.Field12749[var2].Field12768) {
            RSInterface.Field12749[var2].Field12759 = var1.replace("@gre@", "").replace("@yel@", "");
         }

         int var10000 = RSInterface.Field12749[var2].Field12775;
      }
   }

   private void Method13394(int var1, int var2) {
      if (this.Field12693 != -1) {
         this.Field12693 = -1;
         Field12649 = true;
      }

      if (this.Field12650 != 0) {
         this.Field12650 = 0;
         Field12649 = true;
      }

      this.Method13395();
      this.openInterfaceID = 17500;
      this.Field12629 = 3213;
      this.Field12560 = true;
      this.Field12585 = false;
      this.Method13219();
   }

   private void Method13395() {
      this.Field12277 = true;
      if (++this.Field12278 > Integer.MAX_VALUE) {
         this.Field12278 = 0;
      }

   }

   private boolean Method13396(Class60 var1) {
      int var2 = var1.Method439();
      int var3 = var1.Method438();
      Packet var104 = new Packet(var1.Method440());

      String var5;
      int var6;
      try {
         int var7;
         int var9;
         int var80;
         int var81;
         int var82;
         int var83;
         int var84;
         int var85;
         int var86;
         int var87;
         int var88;
         int var90;
         int var95;
         boolean var106;
         int var107;
         RSInterface var110;
         int var111;
         int var113;
         String var115;
         boolean var116;
         RSInterface var118;
         int var124;
         switch(var3) {
         case 1:
            int var123;
            for(var123 = 0; var123 < this.session_players.length; ++var123) {
               if (this.session_players[var123] != null) {
                  this.session_players[var123].U_2 = -1;
               }
            }

            for(var123 = 0; var123 < this.Field12327.length; ++var123) {
               if (this.Field12327[var123] != null) {
                  this.Field12327[var123].U_2 = -1;
               }
            }

            return true;
         case 4:
         case 44:
         case 84:
         case 101:
         case 105:
         case 117:
         case 147:
         case 151:
         case 156:
         case 160:
         case 215:
            this.parsePacketGroup(var104, var3);
            return true;
         case 7:
            byte var120 = var104.Method400();
            byte var119 = var104.Method400();
            var7 = var104.Method402();
            var111 = var104.Method402();
            var9 = var120 + var7 * 8;
            var113 = var119 + var111 * 8;
            this.Field12062 = var9;
            this.Field12063 = var113;
            this.Field12064 = var120;
            this.Field12065 = var119;
            this.Field12066 = var7 << 3;
            this.Field12067 = var111 << 3;
            return true;
         case 8:
            int var71 = var104.isg2();
            int var72 = var104.g2();
            RSInterface.Field12749[var71].Field12772 = 1;
            RSInterface.Field12749[var71].Field12773 = var72;
            return true;
         case 24:
            this.Field12509 = var104.sg1();
            if (this.Field12509 == this.Field12646) {
               if (this.Field12509 == 3) {
                  this.Field12646 = 1;
                  this.Field12647 = 1;
               } else {
                  this.Field12646 = 3;
                  this.Field12647 = 3;
               }
            }

            return true;
         case 27:
            this.Field12676 = false;
            this.Field12650 = 1;
            this.Field12521 = 0;
            this.Field12470 = "";
            Field12649 = true;
            return true;
         case 34:
            int var93 = var104.g2();
            RSInterface var94 = RSInterface.Field12749[var93];

            while(var104.pos < var2) {
               var95 = var104.Method414();
               int var96 = var104.g2();
               int var97;
               if ((var97 = var104.g1()) == 255) {
                  var97 = var104.Method404();
               }

               if (var95 >= 0 && var95 < var94.Field12796.length) {
                  var94.Field12796[var95] = var96;
                  var94.Field12795[var95] = var97;
               }
            }

            return true;
         case 35:
            var107 = var104.g1();
            var113 = var104.g1();
            var6 = var104.g1();
            var7 = var104.g1();
            this.Field12352[var107] = true;
            this.Field12351[var107] = var113;
            this.Field12635[var107] = var6;
            this.Field12384[var107] = var7;
            this.Field12488[var107] = 0;
            return true;
         case 36:
            var88 = var104.ig2();
            byte var127 = var104.Method400();
            if (var88 != 170) {
               this.Field12502[var88] = var127;
               if (this.Field12444[var88] != var127 || var88 == 168 || var88 == 169) {
                  this.Field12444[var88] = var127;
                  this.Method13270(var88, false);
                  if (this.Field12500 != -1) {
                     Field12649 = true;
                  }
               }
            }

            return true;
         case 50:
            long var121 = var104.Method405();
            int var49 = var104.g1();
            var5 = Class23.Method207(Class23.Method203(var121));

            for(var6 = 0; var6 < this.Field12370; ++var6) {
               if (var121 == this.Field12437[var6]) {
                  if (this.Field12323[var6] != var49) {
                     this.Field12323[var6] = var49;
                     if (var49 >= 2) {
                        this.pushMessage(var5 + " is online.", 5, "");
                     }

                     if (var49 <= 1) {
                        this.pushMessage(var5 + " is offline.", 5, "");
                     }
                  }

                  var5 = null;
               }
            }

            if (var5 != null && this.Field12370 < 200) {
               this.Field12437[this.Field12370] = var121;
               this.Players[this.Field12370] = var5;
               this.Field12323[this.Field12370] = var49;
               ++this.Field12370;
            }

            this.Method13238();
            return true;
         case 53:
            int var78 = var104.g2();
            var110 = RSInterface.Field12749[var78];
            int var79 = var104.g2();
            if (var110 != null) {
               boolean var128 = var110.Field12734;
               if (var110.Field12796 == null || var110.Field12796.length <= var79 + 1) {
                  var110.Field12804 = var79 / 10 * 40;
                  var110.Field12762 = 0;
                  var110.Field12796 = new int[var79 + 1];
                  var110.Field12795 = new int[var79 + 1];
                  if (var110.Field12818) {
                     var110.Field12730 = new Npc[var79 + 1];
                  }
               }

               if (var110.Field12794 == 3900) {
                  var110.Field12804 = var79 / 10 * 40;
                  var110.Field12762 = 0;
               } else if (var78 == 40005) {
                  RSInterface.Field12749['鲤'].Field12804 = (var79 + 1) * 34;
               }

               for(var80 = 0; var80 < var79; ++var80) {
                  if ((var81 = var104.g1()) == 255) {
                     var81 = var104.Method430();
                  }

                  var82 = var104.isg2();
                  if (var110.Field12796 != null) {
                     var110.Field12796[var80] = var82;
                     var110.Field12795[var80] = var81;
                  }

                  if (var110.Field12779) {
                     var83 = this.Field12285.indexOf(var78);
                     if (var82 > 0 && var83 == -1) {
                        this.Field12285.add(var78);
                     } else if (var82 <= 0 && var83 != -1) {
                        this.Field12285.remove(var83);
                     }
                  }
               }

               if (var110.Field12796 != null) {
                  for(var80 = var79; var80 < var110.Field12796.length; ++var80) {
                     var110.Field12796[var80] = 0;
                     var110.Field12795[var80] = 0;
                  }
               }
            }

            return true;
         case 60:
            this.Field12688 = var104.g1();
            this.Field12687 = var104.ng1b();

            while(var104.pos < var2) {
               var107 = var104.g1();
               this.parsePacketGroup(var104, var107);
            }

            return true;
         case 61:
            this.Field12510 = var104.g1();
            return true;
         case 64:
            this.Field12687 = var104.ng1b();
            this.Field12688 = var104.sg1();

            for(var107 = 0; var107 < 4; ++var107) {
               for(var113 = this.Field12687; var113 < this.Field12687 + 8; ++var113) {
                  for(var6 = this.Field12688; var6 < this.Field12688 + 8; ++var6) {
                     if (Field12428.Method8846(var107, var113, var6) != null) {
                        Field12428.Method8846(var107, var113, var6).Method14493(var113, var6, var107);
                     }
                  }
               }
            }

            this.Method13256();
            return true;
         case 65:
            this.Method13267(var104, var2);
            return true;
         case 68:
            for(var124 = 0; var124 < this.Field12444.length; ++var124) {
               if (this.Field12444[var124] != this.Field12502[var124]) {
                  this.Field12444[var124] = this.Field12502[var124];
                  this.Method13270(var124, true);
               }
            }

            this.Method13219();
            return true;
         case 70:
            var107 = var104.Method402();
            var113 = var104.Method427();
            var6 = var104.ig2();
            (var118 = RSInterface.Field12749[var6]).Field12807 = var107;
            var118.Field12809 = var113;
            return true;
         case 71:
            var6 = var104.g2();
            var107 = var104.Method417();
            if (var6 == 65535) {
               var6 = -1;
            }

            this.Field12573[var107] = var6;
            this.Field12560 = true;
            return true;
         case 72:
            var113 = var104.ig2();
            var118 = RSInterface.Field12749[var113];

            for(var111 = 0; var111 < var118.Field12796.length; ++var111) {
               var118.Field12796[var111] = -1;
               var118.Field12796[var111] = 0;
            }

            return true;
         case 73:
         case 241:
            var107 = Field12527;
            var113 = Field12528;
            if (var3 == 73) {
               var107 = var104.sg2();
               var113 = var104.g2();
               Field12596 = false;
            }

            if (var3 == 241) {
               this.Field12572 = new int[4][13][13];
               var113 = var104.sg2();
               var116 = ((var107 = var104.g1()) & 1) == 1;
               Field12145 = (var107 >> 1 & 1) == 1;
               var104.Method14514();

               for(var107 = 0; var107 < 4; ++var107) {
                  for(var7 = 0; var7 < 13; ++var7) {
                     for(var111 = 0; var111 < 13; ++var111) {
                        if (var104.gbits(1) == 1) {
                           this.Field12572[var107][var7][var111] = var104.gbits(26);
                        } else {
                           this.Field12572[var107][var7][var111] = -1;
                        }
                     }
                  }
               }

               var104.Method14524();
               var107 = var104.g2();
               if (Field12596 && var116 == Field12144 && !Field12145) {
                  Field12075 = false;
               } else {
                  Field12075 = true;
                  Field12428.Method8853();
               }

               Field12144 = var116;
               Field12596 = true;
               Method13407(var107 - 6 << 3, var113 - 6 << 3);
               Field12492 = Field12490;
               Field12493 = Field12491;
               Field12490 = 0;
               Field12491 = 0;
            }

            this.Field12072 = var107;
            this.Field12073 = var113;
            this.Field12074 = var3;
            return true;
         case 74:
            var107 = var104.ig2();
            var113 = var104.Method417();
            if (var107 == 65535) {
               var107 = -1;
            }

            if (var107 != this.Field12438 && this.Field12587 && this.Field12678 == 0) {
               this.Field12652 = var107;
               this.Field12653 = var113 == 1;
               this.Field12526.Method11960(2, this.Field12652);
            }

            this.Field12438 = var107;
            return true;
         case 75:
            var113 = var104.isg2();
            var107 = var104.isg2();
            RSInterface.Field12749[var107].Field12772 = 2;
            RSInterface.Field12749[var107].Field12773 = var113;
            return true;
         case 78:
            Field12679 = 0;
            return true;
         case 79:
            var107 = var104.ig2();
            var6 = var104.sg2();
            if ((var110 = RSInterface.Field12749[var107]) != null) {
               for(var124 = 0; var110.Field12783 != null && var124 < var110.Field12783.length; ++var124) {
                  int var59 = var6;
                  RSInterface var117;
                  if ((var117 = RSInterface.Field12749[var110.Field12783[var124]]) != null) {
                     if (var6 < 0) {
                        var59 = 0;
                     }

                     if (var59 > var117.Field12804 - var117.Field12811) {
                        int var10000 = var117.Field12804;
                        var10000 = var117.Field12811;
                     }

                     var117.Field12762 = var6;
                  }
               }

               if (var6 < 0) {
                  var6 = 0;
               }

               if (var6 > var110.Field12804 - var110.Field12811) {
                  var6 = var110.Field12804 - var110.Field12811;
               }

               var110.Field12762 = var6;
            }

            return true;
         case 80:
            var107 = var104.g1();
            var113 = var104.g2();
            if (var107 == 255) {
               for(var107 = 0; var107 < this.Field12235.length; ++var107) {
                  if (var107 != 35) {
                     this.Field12235[var107] = -1.0F;
                  }
               }
            } else if (var107 == 254) {
               for(var107 = 0; var107 <= 6; ++var107) {
                  this.Field12235[var107] = -1.0F;
               }
            } else {
               this.Field12235[var107] = (float)(var113 * 10 + 2);
               if (var113 <= 0) {
                  this.Field12235[var107] = 0.0F;
               }
            }

            return true;
         case 81:
            this.updatePlayer(var2, var104);
            return true;
         case 85:
            this.Field12688 = var104.ng1b();
            this.Field12687 = var104.ng1b();
            return true;
         case 87:
            var86 = var104.ig2();
            var87 = var104.Method429();
            this.Field12502[var86] = var87;
            if (this.Field12444[var86] != var87) {
               this.Field12444[var86] = var87;
               this.Method13270(var86, false);
               if (this.Field12500 != -1) {
                  Field12649 = true;
               }
            }

            return true;
         case 97:
            var84 = var104.g2();
            this.Method13298(var84);
            if (this.Field12629 != -1) {
               this.Field12629 = -1;
               this.Field12560 = true;
            }

            if (this.Field12693 != -1) {
               this.Field12693 = -1;
               Field12649 = true;
            }

            if (this.Field12650 != 0) {
               this.Field12650 = 0;
               Field12649 = true;
            }

            if (var84 == 32600) {
               this.Method13216();
            }

            this.Method13395();
            this.openInterfaceID = var84;
            this.Method13219();
            this.Field12585 = false;
            return true;
         case 99:
            this.Field12482 = var104.g1();
            return true;
         case 104:
            var107 = var104.ng1b();
            var113 = var104.Method417();
            var115 = var104.Method406();
            if (var107 > 0 && var107 <= 5) {
               if (var115.equalsIgnoreCase("null")) {
                  var115 = null;
               }

               this.Field12570[var107 - 1] = var115;
               this.Field12571[var107 - 1] = var113 == 0;
            }

            return true;
         case 106:
            this.Field12646 = var104.ng1b();
            this.Field12647 = this.Field12646;
            this.Field12560 = true;
            return true;
         case 107:
            this.Field12597 = false;

            for(var113 = 0; var113 < 5; ++var113) {
               this.Field12352[var113] = false;
            }

            return true;
         case 109:
            if (this.Field12092 == 0) {
               this.resetForLogout();
            } else {
               try {
                  if (this.Field12608 != null) {
                     this.Field12608.Method11824();
                  }
               } catch (Exception var100) {
                  ;
               }

               this.Field12273 = System.currentTimeMillis() - 3000L;
               this.Field12211 = "" + this.Field12092;
               this.Method13312();
            }

            return false;
         case 110:
            this.Field12584 = var104.g1();
            return true;
         case 114:
            this.Field12561 = (float)(var104.ig2() * 50);
            return true;
         case 121:
            var107 = var104.isg2();
            var113 = var104.sg2();
            if (this.Field12587) {
               this.Field12652 = var107;
               this.Field12526.Method11960(2, this.Field12652);
               this.Field12678 = var113;
            }

            return true;
         case 122:
            int var73 = var104.isg2();
            int var74;
            int var75 = (var74 = var104.isg2()) >> 10 & 31;
            int var76 = var74 >> 5 & 31;
            int var77 = var74 & 31;
            RSInterface.Field12749[var73].Field12771 = (var75 << 19) + (var76 << 11) + (var77 << 3);
            return true;
         case 126:
            String var69 = var104.Method406();
            int var70;
            if ((var70 = var104.sg2()) >= 18144 && var70 < 18244) {
               this.Field12305[var70 - 18144] = var69;
            }

            this.Method13392(var69, var70);
            this.Method13393(var69, var70);
            return true;
         case 134:
            var111 = var104.g1();
            var9 = var104.Method429();
            var107 = var104.sg2();
            var7 = var104.g1();
            var113 = var104.g1();
            var116 = false;
            int var10 = 0 + this.Field12136.size() * 350;
            int var11 = 0;
            int var12 = 0;
            if (var111 < this.Field12347.length) {
               var11 = var9 - this.Field12347[var111];
               var12 = this.Field12347[var111];
            } else if (var111 == 50) {
               var11 = var9 - this.Field12111;
               var12 = this.Field12111;
               var116 = true;
            } else if (var111 == 51) {
               var11 = var9 - this.Field12112;
               var12 = this.Field12112;
               var116 = true;
            }

            if (Field12121 && (var11 > 0 && var12 > 0 || var116)) {
               this.Field12136.add(new Class866(var111, var11, var107, var10));
            }

            if (var111 >= 50) {
               if (var111 == 51) {
                  this.Field12112 = var9;
               } else {
                  this.Field12111 = var9;
               }
            } else {
               this.Field12347[var111] = var9;
               this.Field12380[var111] = var7;
               this.Field12501[var111] = var113;
            }

            if (var111 < this.Field12347.length && this.Field12347[var111] >= 250000000) {
               this.Field12347[var111] = 250000000;
            }

            return true;
         case 137:
            Field12649 = true;
            this.Field12650 = 0;
            this.Field12676 = true;
            this.Field12639 = "";
            this.Field12564 = "Enter the name of the player whose house you wish to enter";
            this.Field12521 = 8;
            return true;
         case 138:
            Field12649 = true;
            this.Field12650 = 0;
            this.Field12676 = true;
            this.Field12639 = "";
            this.Field12564 = "Enter the name of the instance you wish to join/create";
            this.Field12521 = 8;
            return true;
         case 142:
            int var68 = var104.ig2();
            this.Method13298(var68);
            if (this.Field12693 != -1) {
               this.Field12693 = -1;
               Field12649 = true;
            }

            if (this.Field12650 != 0) {
               this.Field12650 = 0;
               Field12649 = true;
            }

            this.Field12629 = var68;
            this.Field12560 = true;
            this.openInterfaceID = -1;
            this.Method13239(false);
            this.Field12585 = false;
            return true;
         case 164:
            var95 = var104.ig2();
            this.Method13298(var95);
            if (this.Field12629 != -1) {
               this.Field12629 = -1;
               this.Field12560 = true;
            }

            this.Field12227 = false;
            this.Field12228 = false;
            this.Field12229 = false;
            this.Field12230 = false;
            this.Field12231 = false;
            this.Field12693 = var95;
            Field12649 = true;
            this.Field12585 = false;
            return true;
         case 166:
            this.Field12597 = true;
            this.Field12556 = var104.g1();
            this.Field12557 = var104.g1();
            this.Field12558 = var104.g2();
            var104.g1();
            this.Field12559 = var104.g1();
            if (this.Field12559 >= 100) {
               Field12341 = (this.Field12556 << 7) + 64;
               Field12343 = (this.Field12557 << 7) + 64;
               Field12342 = this.Method13277(Field12379, Field12343, Field12341) - this.Field12558;
            }

            return true;
         case 171:
            boolean var126 = var104.g1() == 1;
            int var67 = var104.g2();
            RSInterface.Field12749[var67].Field12810 = var126;
            return true;
         case 174:
            var107 = var104.g2();
            var113 = var104.g1();
            var6 = var104.g2();
            if (this.Field12519 < 50) {
               this.Field12636[this.Field12519] = var107;
               this.Field12661[this.Field12519] = var113;
               this.Field12671[this.Field12519] = (float)(var6 + Class104.Field10010[var107]);
               ++this.Field12519;
            }

            return true;
         case 176:
            this.Field12607 = var104.ng1b();
            this.Field12591 = var104.sg2();
            this.Field12563 = var104.g1();
            this.Field12631 = var104.Method430();
            this.Field12471 = var104.g2();
            if (this.Field12631 != 0 && this.openInterfaceID == -1) {
               Signlink.Method11838(Class23.Method205(this.Field12631));
               this.Method13404();
               short var112 = 650;
               if (this.Field12607 != 201 || this.Field12563 == 1) {
                  var112 = 655;
               }

               this.Field12356 = "";
               this.Field12595 = false;

               for(var113 = 0; var113 < RSInterface.Field12749.length; ++var113) {
                  if (RSInterface.Field12749[var113] != null && RSInterface.Field12749[var113].Field12751 == var112) {
                     this.Method13395();
                     this.openInterfaceID = RSInterface.Field12749[var113].Field12775;
                  }
               }
            }

            return true;
         case 177:
            this.Field12597 = true;
            this.Field12462 = var104.g1();
            this.Field12463 = var104.g1();
            this.Field12464 = var104.g2();
            var104.g1();
            this.Field12465 = var104.g1();
            if (this.Field12465 >= 100) {
               var84 = (this.Field12462 << 7) + 64;
               var85 = (this.Field12463 << 7) + 64;
               var86 = this.Method13277(Field12379, var85, var84) - this.Field12464;
               var87 = var84 - Field12341;
               var88 = var86 - Field12342;
               int var89 = var85 - Field12343;
               var90 = (int)Math.sqrt((double)(var87 * var87 + var89 * var89));
               Field12344 = (int)(Math.atan2((double)var88, (double)var90) * 325.949D) & 2047;
               Field12345 = (int)(Math.atan2((double)var87, (double)var89) * -325.949D) & 2047;
               if (Field12344 < Method13391()) {
                  Field12344 = Method13391();
               }

               if (Field12344 > Method13390()) {
                  Field12344 = Method13390();
               }
            }

            return true;
         case 185:
            var107 = var104.isg2();
            RSInterface.Field12749[var107].Field12772 = 3;
            if (session_player.desc == null) {
               RSInterface.Field12749[var107].Field12773 = (session_player.appearanceColours[0] << 25) + (session_player.appearanceColours[4] << 20) + (session_player.appearanceModels[0] << 15) + (session_player.appearanceModels[8] << 10) + (session_player.appearanceModels[11] << 5) + session_player.appearanceModels[1];
            } else {
               RSInterface.Field12749[var107].Field12773 = (int)(305419896L + (long) session_player.desc.interactingEntity);
            }

            return true;
         case 187:
            this.Field12676 = false;
            this.Field12650 = 2;
            this.Field12521 = 0;
            this.Field12470 = "";
            Field12649 = true;
            return true;
         case 196:
            long var58 = var104.Method405();
            var107 = var104.Method404();
            var113 = var104.g1();
            var116 = false;
            if (var113 <= 1) {
               for(var7 = 0; var7 < this.user_ignore_count; ++var7) {
                  if (this.user_ignore_names[var7] == var58) {
                     var116 = true;
                     break;
                  }
               }
            }

            if (!var116) {
               try {
                  this.Field12660[this.Field12609] = var107;
                  this.Field12609 = (this.Field12609 + 1) % 100;
                  String var114 = TextInput.readFromStream(var2 - 13, var104);
                  String var125 = Class23.Method207(Class23.Method203(var58));
                  if (var113 != 3) {
                     if (var113 != 2 && var113 != 3) {
                        if (var113 == 1) {
                           this.pushMessage(var114, 7, "@cr1@" + var125);
                        } else if (var113 == 4) {
                           this.pushMessage(var114, 3, "@irn@" + var125);
                        } else {
                           this.pushMessage(var114, 3, var125);
                        }
                     } else {
                        this.pushMessage(var114, 7, "@cr2@" + var125);
                     }
                  }
               } catch (Exception var102) {
                  Signlink.reporterror("cde1");
               }
            }

            return true;
         case 200:
            var90 = var104.g2();
            int var91 = var104.Method402();
            RSInterface var92;
            (var92 = RSInterface.Field12749[var90]).Field12800 = var91;
            if (var91 == -1) {
               var92.Field12790 = 0;
               var92.Field12746 = 0.0D;
            }

            return true;
         case 206:
            this.Field12702 = var104.g1();
            this.Field12333 = var104.g1();
            this.Field12669 = var104.g1();
            Field12649 = true;
            return true;
         case 207:
            var107 = var104.g1();
            this.Field12503 = var107 != 1;

            for(var113 = 0; var113 < 7; ++var113) {
               if ((var107 = var104.g2()) >= 65535) {
                  var107 = -1;
               }

               if (var113 == 1 && !this.Field12503) {
                  var107 = -1;
               }

               this.Field12523[var113] = var107;
            }

            for(var113 = 0; var113 < 5; ++var113) {
               this.Field12460[var113] = var104.g2();
            }

            this.Field12522 = true;
            return true;
         case 208:
         case 209:
            if (var3 == 208) {
               if ((var113 = var104.Method427()) >= 0) {
                  this.Method13298(var113);
               }

               this.Field12479 = var113;
               this.Field12295 = this.Field12479;
            } else {
               if ((var113 = var104.Method427()) >= 0) {
                  this.Method13298(var113);
               }

               this.Field12480 = var113;
            }

            return true;
         case 214:
            this.user_ignore_count = var2 / 8;

            for(var111 = 0; var111 < this.user_ignore_count; ++var111) {
               this.user_ignore_names[var111] = var104.Method405();
            }

            return true;
         case 216:
            this.Method13341(var104.g1());
            return true;
         case 217:
            try {
               this.Field12309 = var104.Method406();
               this.Field12310 = var104.Method406();
               var5 = var104.Method406();
               var6 = var104.g1();
               long var8 = Class23.nameToLong(this.Field12309);
               boolean var108 = false;

               for(var7 = 0; var7 < this.user_ignore_count; ++var7) {
                  if (this.user_ignore_names[var7] == var8) {
                     var108 = true;
                     break;
                  }
               }

               if (!var108) {
                  this.Field12310 = TextInput.Method201(this.Field12310);
                  this.Method13332(this.Field12310, 16, this.Field12309, var6, var5);
               }
            } catch (Exception var101) {
               var101.printStackTrace();
            }

            return true;
         case 218:
            var85 = var104.Method428();
            this.Field12500 = var85;
            Field12649 = true;
            return true;
         case 219:
            if (this.Field12629 != -1) {
               this.Field12629 = -1;
               this.Field12560 = true;
            }

            if (this.Field12693 != -1) {
               this.Field12693 = -1;
               Field12649 = true;
            }

            if (this.Field12650 != 0) {
               this.Field12650 = 0;
               Field12649 = true;
            }

            this.Method13239(false);
            this.openInterfaceID = -1;
            this.Field12585 = false;
            return true;
         case 221:
            this.Field12371 = var104.g1();
            return true;
         case 230:
            var80 = var104.sg2();
            var81 = var104.g2();
            var82 = var104.g2();
            var83 = var104.isg2();
            RSInterface.Field12749[var81].Field12814 = var82;
            RSInterface.Field12749[var81].Field12815 = var83;
            RSInterface.Field12749[var81].Field12813 = var80;
            return true;
         case 240:
            this.Field12353 = var104.Method402();
            return true;
         case 246:
            var7 = var104.ig2();
            int var64 = var104.g2();
            int var65;
            if ((var65 = var104.g2()) == 65535) {
               RSInterface.Field12749[var7].Field12772 = 0;
               return true;
            }

            ItemDef var66;
            if ((var66 = ItemDef.forID(var65)) != null) {
               RSInterface.Field12749[var7].Field12772 = 4;
               RSInterface.Field12749[var7].Field12773 = var65;
               RSInterface.Field12749[var7].Field12814 = var66.Field10653;
               RSInterface.Field12749[var7].Field12815 = var66.Field10661;
               RSInterface.Field12749[var7].Field12813 = var66.Field10646 * 100 / var64;
            }

            return true;
         case 248:
            var6 = var104.sg2();
            var107 = var104.g2();
            if (this.Field12693 != -1) {
               this.Field12693 = -1;
               Field12649 = true;
            }

            if (this.Field12650 != 0) {
               this.Field12650 = 0;
               Field12649 = true;
            }

            if ((var110 = RSInterface.Field12749[var6]) != null && var110.Field12817) {
               this.Field12639 = "";
               this.Field12139 = true;
               this.Field12676 = false;
            }

            this.Method13395();
            this.openInterfaceID = var6;
            this.Field12629 = var107;
            this.Field12560 = true;
            this.Field12585 = false;
            var106 = true;
            this.Method13219();
            return true;
         case 249:
            var104.Method417();
            this.Field12357 = var104.isg2();
            return true;
         case 253:
            String var4;
            String var47;
            long var48;
            boolean var109;
            if ((var4 = var104.Method406()).endsWith(":tradereq:")) {
               var48 = Class23.nameToLong(var47 = var4.substring(0, var4.indexOf(":")));
               var109 = false;

               for(var6 = 0; var6 < this.user_ignore_count; ++var6) {
                  if (this.user_ignore_names[var6] == var48) {
                     var109 = true;
                  }
               }

               if (!var109) {
                  this.pushMessage("wishes to trade with you.", 4, var47);
               }
            } else if (var4.endsWith(":dbxpreq:")) {
               Field12109 = (float)(Integer.parseInt(var4.split("-")[0]) * 10 + 2);
            } else if (var4.endsWith("$link$")) {
               var47 = var4.substring(0, var4.indexOf("+"));
               String var122 = (var4 = var4.substring(var47.length() + 1).trim()).substring(0, var4.indexOf("$"));
               this.pushMessage(var47, 9, var122);
            } else if (var4.endsWith(":duelreq:")) {
               var48 = Class23.nameToLong(var47 = var4.substring(0, var4.indexOf(":")));
               var109 = false;

               for(var6 = 0; var6 < this.user_ignore_count; ++var6) {
                  if (this.user_ignore_names[var6] == var48) {
                     var109 = true;
                  }
               }

               if (!var109) {
                  this.pushMessage("wishes to duel with you.", 8, var47);
               }
            } else if (var4.endsWith(":chalreq:")) {
               var48 = Class23.nameToLong(var47 = var4.substring(0, var4.indexOf(":")));
               var109 = false;

               for(var6 = 0; var6 < this.user_ignore_count; ++var6) {
                  if (this.user_ignore_names[var6] == var48) {
                     var109 = true;
                  }
               }

               if (!var109) {
                  var115 = var4.substring(var4.indexOf(":") + 1, var4.length() - 9);
                  this.pushMessage(var115, 8, var47);
               }
            } else if (!var4.startsWith(":file:") && !var4.startsWith(":vote:")) {
               this.Method13334(var4);
            }

            return true;
         case 254:
            this.Field12339 = var104.g1();
            if (this.Field12339 == 1) {
               this.Field12648 = var104.g2();
            }

            if (this.Field12339 >= 2 && this.Field12339 <= 6) {
               if (this.Field12339 == 2) {
                  this.Field12392 = 64;
                  this.Field12393 = 64;
               }

               if (this.Field12339 == 3) {
                  this.Field12392 = 0;
                  this.Field12393 = 64;
               }

               if (this.Field12339 == 4) {
                  this.Field12392 = 128;
                  this.Field12393 = 64;
               }

               if (this.Field12339 == 5) {
                  this.Field12392 = 64;
                  this.Field12393 = 0;
               }

               if (this.Field12339 == 6) {
                  this.Field12392 = 64;
                  this.Field12393 = 128;
               }

               this.Field12339 = 2;
               this.Field12389 = var104.g2();
               this.Field12390 = var104.g2();
               this.Field12391 = var104.g1();
            }

            if (this.Field12339 == 10) {
               this.Field12388 = var104.g2();
            }

            return true;
         default:
            this.Field12273 = 0L;
            Signlink.reporterror("T1 - [" + var3 + ", " + var2 + "] - " + this.Field12330 + "," + this.Field12331);
            var106 = true;
            boolean var105 = true;
            this.Method13312();
            if (++this.Field12298 >= 10 || !Field12594) {
               this.resetForLogout();
            }

            return false;
         }
      } catch (Exception var103) {
         var103.printStackTrace();
         var5 = "T2 - " + var3 + "," + this.Field12330 + "," + this.Field12331 + " - " + var2 + "," + (Field12490 + session_player.w_14[0]) + "," + (Field12491 + session_player.x_13[0]) + " - ";

         for(var6 = 0; var6 < var2 && var6 < 50; ++var6) {
            var5 = var5 + var104.Field1259[var6] + ",";
         }

         Signlink.reporterror(var5);
         if (++this.Field12298 >= 10 || !Field12593) {
            this.resetForLogout();
         }

         return true;
      }
   }

   private static void Method13397() {
      int var0 = -1;
      if (Field12265 != 100.0F && GraphicsDisplay.Field2678 && !Field12593) {
         var0 = Field12299;
      } else if (!Field12593 && Field12166) {
         var0 = 0;
      } else if (session_player != null && Field12593) {
         if (class329 != null) {
            var0 = 0;
         }
      } else {
         var0 = Field12299;
      }

      if (var0 != -1) {
         Field12300 = var0;
      } else {
         var0 = Field12490 + (session_player.Field4194 - 6 >> 7) - Field12494;
         int var1 = Field12491 + (session_player.Field4195 - 6 >> 7) - Field12495;
         Field12125 = false;
         Field12126 = false;
         Field12127 = false;
         if (var0 >= 2875 && var1 >= 4350 && var0 <= 3007 && var1 <= 4470) {
            Field12125 = true;
         } else if (var0 >= 2430 && var1 >= 4870 && var0 <= 2490 && var1 <= 4920) {
            Field12127 = true;
         } else if (var0 >= 2045 && var1 >= 5630 && var0 <= 2115 && var1 <= 5700) {
            Field12125 = true;
         } else if (var0 >= 3524 && var1 >= 9667 && var0 <= 3579 && var1 <= 9722) {
            Field12125 = true;
         } else if (var0 >= 2838 && var1 >= 2840 && var0 <= 2876 && var1 <= 3551) {
            Field12126 = true;
         } else if (var0 >= 3400 && var1 >= 3526 && var0 <= 3457 && var1 <= 3584) {
            Field12126 = true;
         } else if (var0 >= 1729 && var1 >= 5274 && var0 <= 1792 && var1 <= 5376) {
            Field12126 = true;
         } else if (var0 >= 3455 && var1 >= 9468 && var0 <= 3568 && var1 <= 9539) {
            Field12125 = true;
         }

         label210: {
            if (var0 < 2618 || var0 > 2694 || var1 < 4663 || var1 > 4742) {
               if (var0 >= 2365 && var1 >= 5060 && var0 <= 2500 && var1 <= 5190) {
                  var0 = 2228224;
                  break label210;
               }

               if (var0 >= 3400 && var1 >= 3145 && var0 <= 3718 && var1 <= 3585) {
                  var0 = 9541988;
                  break label210;
               }

               if (var0 >= 1284 && var0 <= 1341 && var1 >= 4482 && var1 <= 4539) {
                  var0 = 0;
                  break label210;
               }

               if (var0 >= 3075 && var0 <= 3135 && var1 >= 3222 && var1 <= 3385) {
                  var0 = 589833;
                  break label210;
               }

               if (var1 >= 3524 && var0 < 3390 && var0 > 2940 && var1 <= 3975 && var1 >= 3664) {
                  var0 = 2236962;
                  break label210;
               }

               if (var1 > 4000 && !Field12596) {
                  var0 = 0;
                  break label210;
               }
            }

            var0 = Field12299;
         }

         Field12300 = var0;
      }
   }

   public static int Method13398() {
      return Field12300;
   }

   public static int Method13399() {
      return 3249;
   }

   public static int Method13400() {
      return 3249;
   }

   private static int Method13401() {
      return (int)((double)(Method13320() ? 400 : 800) * 0.6666666666666666D);
   }

   private void Method13402(double var1) {
      double var3 = (double)this.c_98 * 4.0D;
      int var5 = Field12134 + (int)Math.round(var3 * 0.25D);
      int var2 = Method13401();
      short var6 = 3249;
      if (!Field12712) {
         var2 = 1000;
         var6 = 3000;
      }

      if (var5 > var6) {
         var5 = var6;
      } else if (var5 < var2) {
         var5 = var2;
      }

      if (var5 != Field12134) {
         if (GraphicsDisplay.Field2678) {
            GraphicsDisplay.Method997().Field2685 = true;
         }

         Field12134 = var5;
      }

   }

   private void Method13403() {
      if (this.Field12209 != null) {
         if (GraphicsDisplay.Field2678) {
            GraphicsDisplay.Method997().Method1025();
         }

         if (!Field12712) {
            Field12714 = -532;
            Field12715 = -127;
            if (GraphicsDisplay.Field2678) {
               if (this.Field12605 != null) {
                  this.Field12605.Method13683();
               }

               Field12714 = -12;
               Field12715 = 36;
            }
         }

         if (this.Field12210 != 0) {
            int var1 = 569 + Field12714;
            int var2 = 170 + Field12715;
            if (this.Field12210 == 1) {
               var1 = 569 + Field12714;
               var2 = 337 + Field12715;
            }

            this.Method13357(var1, var2);
            if (this.Field12209 != null) {
               this.Field12209 = this.Field12209.replaceAll("Activate @lre@", "");
               int var3 = -1;
               boolean var4 = false;
               String[] var8 = this.Field12303;
               int var7 = this.Field12303.length;

               for(int var6 = 0; var6 < var7; ++var6) {
                  String var5 = var8[var6];
                  ++var3;
                  if (this.Field12209.equals(var5)) {
                     var4 = true;
                     break;
                  }
               }

               if (!var4) {
                  return;
               }

               ++var2;
               plainFont.addButton(true, var1 + 5, 16750623, "Level " + this.Field12302[var3], var2 + 15);
               plainFont.addButton(true, var1 + 5, 16750623, this.Field12303[var3], var2 + 15 + 15);
               if (this.Field12304[var3].contains("-")) {
                  String[] var9 = this.Field12304[var3].split(" - ");
                  smallFont.addButton(true, var1 + 5, 11495962, var9[0], var2 + 15 + 15 + 20);
                  smallFont.addButton(true, var1 + 5, 11495962, var9[1], var2 + 15 + 15 + 20 + 12);
                  if (var9.length > 2) {
                     smallFont.addButton(true, var1 + 5, 11495962, var9[2], var2 + 15 + 15 + 20 + 12 + 12);
                  }
               } else {
                  smallFont.addButton(true, var1 + 5, 11495962, this.Field12304[var3], var2 + 15 + 15 + 25);
               }
            }

            this.Field12210 = 0;
            this.Field12209 = null;
         }

         if (!Field12712) {
            Field12715 = 0;
            Field12714 = 0;
         }

      }
   }

   private void Method13404() {
      if (this.Field12099 == 1) {
         this.Field12099 = 0;
      } else {
         this.Field12630.Method14445(130);
         if (this.Field12629 != -1) {
            this.Field12629 = -1;
            this.Field12585 = false;
            this.Field12560 = true;
         }

         if (this.Field12693 != -1) {
            this.Field12693 = -1;
            Field12649 = true;
            this.Field12585 = false;
         }

         if (this.Field12650 == 4) {
            this.Field12650 = 0;
            Field12649 = true;
         }

         this.Method13239(false);
         this.openInterfaceID = -1;
         this.Field12706 = -1;
      }
   }

   public Client() {
      this.Field12316 = new RgbImage[2];
      this.Field12718 = new RgbImage[3];
      Field12713 = false;
      this.Field12706 = -1;
      this.Field12311 = new int[512];
      this.Field12312 = 0;
      this.Field12306 = 0;
      this.Field12232 = -1;
      this.Field12233 = 0;
      Field12704 = "127.0.0.1";
      this.Field12322 = new int[SceneGraph.mapSizeWidth][SceneGraph.mapSizeWidth];
      this.Field12323 = new int[200];
      this.Field12222 = new HashMap();
      this.Field12221 = new HashMap();
      this.Field12324 = false;
      this.aStream_834 = new Packet(new byte['耀']);
      this.Field12327 = new Npc[16384];
      this.Field12329 = new int[16384];
      this.Field12334 = Packet.Method375();
      this.Field12335 = true;
      this.openInterfaceID = -1;
      this.Field12347 = new int[Class620.Field3678];
      this.Field12351 = new int[5];
      this.Field12352 = new boolean[5];
      this.Field12355 = false;
      this.Field12356 = "";
      this.Field12357 = -1;
      this.Field12358 = false;
      this.Field12360 = "";
      this.Field12361 = 2048;
      this.Field12362 = 2047;
      this.session_players = new Player[this.Field12361];
      this.session_player_list = new int[this.Field12361];
      this.session_npcs_awaiting_update = new int[this.Field12361];
      this.Field12368 = new Packet[this.Field12361];
      this.Field12372 = new int[SceneGraph.mapSizeWidth][SceneGraph.mapSizeWidth];
      this.Field12380 = new int[Class620.Field3678];
      this.user_ignore_names = new long[100];
      this.Field12383 = false;
      this.Field12384 = new int[5];
      this.Field12385 = new int[SceneGraph.mapSizeWidth][SceneGraph.mapSizeWidth];
      this.Field12394 = new int[512];
      this.Field12396 = new String[512];
      this.Field12395 = new String[512];
      this.Field12397 = new String[512];
      this.Field12398 = new String[100];
      this.Field12426 = new int[100];
      this.Field12314 = new RgbImage[4];
      this.Field12429 = new RgbImage[15];
      this.Field12348 = new RgbImage[5];
      this.Field12436 = true;
      this.Field12437 = new long[200];
      this.Field12438 = -1;
      this.FlamesDrawing = false;
      this.Field12440 = -1;
      this.Field12441 = -1;
      this.Field12443 = new int[33];
      this.Field12722 = new Class619[6];
      this.Field12721 = new Class619[6];
      this.Field12444 = new int[2500];
      this.Field12445 = false;
      this.Field12446 = 50;
      this.Field12447 = new int[this.Field12446];
      this.Field12448 = new int[this.Field12446];
      this.Field12449 = new int[this.Field12446];
      this.Field12450 = new int[this.Field12446];
      this.Field12451 = new int[this.Field12446];
      this.Field12452 = new int[this.Field12446];
      this.Field12453 = new int[this.Field12446];
      this.Field12454 = new String[this.Field12446];
      this.Field12456 = -1;
      this.Field12458 = new RgbImage[20];
      this.Field12460 = new int[5];
      this.Field12461 = false;
      this.Field12470 = "";
      this.Field12511 = new LinkedList();
      this.Field12513 = new LinkedList();
      this.Field12478 = false;
      this.Field12479 = -1;
      this.Field12488 = new int[5];
      this.Field12489 = new RgbImage[100];
      this.Field12500 = -1;
      this.Field12501 = new int[Class620.Field3678];
      this.Field12502 = new int[this.Field12444.length];
      this.Field12503 = true;
      this.Field12507 = new int[151];
      this.Field12509 = -1;
      this.Field12512 = new LinkedList();
      this.Field12514 = new LinkedList();
      this.Field12515 = new int[33];
      this.Field12516 = new RSInterface();
      this.Field12517 = new IndexedImage[100];
      this.Field12520 = 5063219;
      this.Field12523 = new int[7];
      this.Field12530 = new int[1000];
      this.Field12531 = new int[1000];
      this.Players = new String[200];
      this.expectedCRCs = new int[9];
      this.Field12547 = new int[500];
      this.Field12548 = new int[500];
      this.Field12549 = new int[500];
      this.Field12550 = new int[500];
      this.Field12551 = new int[500];
      this.Field12552 = new long[500];
      this.Field12634 = new String[500];
      this.Field12553 = new RgbImage[20];
      this.Field12554 = new RgbImage[20];
      this.Field12555 = new RgbImage[20];
      this.Field12560 = false;
      this.Field12564 = "";
      this.Field12570 = new String[5];
      this.Field12571 = new boolean[5];
      this.Field12572 = new int[4][13][13];
      this.Field12581 = new RgbImage[1000];
      this.Field12582 = false;
      this.Field12585 = false;
      this.Field12586 = new RgbImage[8];
      this.Field12587 = false;
      Field12593 = false;
      Field12594 = false;
      this.Field12595 = false;
      Field12596 = false;
      this.Field12597 = false;
      this.myUsername = "";
      this.Field12612 = "";
      this.Field12614 = "";
      this.Field12151 = "";
      this.Field12616 = false;
      this.Field12618 = -1;
      Field12623 = 128;
      this.Field12629 = -1;
      this.Field12285.clear();
      this.Field12630 = Packet.Method375();
      this.Field12635 = new int[5];
      this.Field12636 = new int[50];
      this.Field12638 = 78;
      this.Field12639 = "";
      this.Field12644 = new IndexedImage[2];
      this.Field12646 = 3;
      this.Field12647 = 3;
      Field12649 = false;
      this.Field12654 = new int[151];
      this.Field12655 = new Class504[4];
      this.Field12660 = new int[100];
      this.Field12661 = new int[50];
      this.Field12662 = false;
      this.Field12671 = new float[50];
      this.Field12673 = false;
      this.Field12675 = false;
      this.Field12676 = false;
      this.Field12684 = "";
      this.Field12685 = "";
      this.Field12686 = "";
      this.Field12693 = -1;
      this.Field12695 = new int[512];
      this.Field12696 = new int[512];
   }

   public final void Method13405(String var1) {
      if (!Field12593) {
         switch(this.Field12643) {
         case 0:
            this.myUsername = var1;
            return;
         case 1:
            this.Field12612 = var1;
            if (this.Field12612.length() > 20) {
               this.Field12612 = this.Field12612.substring(0, 20);
            }

            this.Field12614 = this.Field12612;
         default:
         }
      } else {
         this.Field12360 = this.Field12360 + var1;
      }
   }

   public final String Method13406() {
      return !Field12593 ? "" : this.Field12360;
   }

   private static void Method13407(int var0, int var1) {
      Field12490 = var0;
      Field12491 = var1;
   }

   public static String[] Method13408(String var0, int var1, RSFont var2) {
      if ((var1 = var2.Method9451(var0)) <= 80) {
         return new String[]{var0};
      } else {
         int var3 = 0;
         int var4 = 0;
         String[] var6 = var0.split(" ");
         StringBuilder[] var8 = new StringBuilder[1 + var1 / 80];

         int var5;
         for(var5 = 0; var5 < var8.length; ++var5) {
            var8[var5] = new StringBuilder();
         }

         for(var5 = 0; var5 < var6.length; ++var5) {
            var4 += var2.Method9451(var6[var5]);
            var8[var3].append(var6[var5]);
            var8[var3].append(" ");
            if (var4 >= 80) {
               var4 = 0;
               ++var3;
            }
         }

         String[] var9 = new String[var8.length];

         for(int var7 = 0; var7 < var8.length; ++var7) {
            var9[var7] = var8[var7].toString();
         }

         return var9;
      }
   }

   private static GraphicsBuffer Method13409(int var0, int var1, Component var2) {
      Class290 var10000;
      Class290 var3;
      boolean var10005;
      if (glEnabled) {
         try {
            GraphicsBuffer var5;
            GraphicsBuffer var6 = var5 = (GraphicsBuffer)Class.forName("BasicGraphicsBuffer").newInstance();
            var10005 = GraphicsDisplay.Field2678;
            var6.Method3036(var2, var0, var1, false);
            return var5;
         } catch (Exception var4) {
            glEnabled = false;
            var4.printStackTrace();
            var10000 = var3 = new Class290();
            var10005 = GraphicsDisplay.Field2678;
            var10000.Method3036(var2, var0, var1, false);
            return var3;
         }
      } else {
         var10000 = var3 = new Class290();
         var10005 = GraphicsDisplay.Field2678;
         var10000.Method3036(var2, var0, var1, false);
         return var3;
      }
   }

   private static GraphicsBuffer Method13410(int var0, int var1, Component var2) {
      try {
         GraphicsBuffer var5;
         (var5 = (GraphicsBuffer)Class.forName("BasicGraphicsBuffer").newInstance()).Method3035(var2, var0, var1, false);
         return var5;
      } catch (Throwable var4) {
         Class290 var3;
         (var3 = new Class290()).Method3035(var2, var0, var1, false);
         return var3;
      }
   }

   private static String Method13411(String var0, int var1, String var2) {
      StringBuffer var3 = new StringBuffer(var0);

      while(var3.length() < 30) {
         var3.append(var2);
      }

      return var3.toString();
   }

   public static int Method13412(int var0, int var1, int var2, int var3) {
      return (int)Math.sqrt(Math.pow((double)(var0 - var2), 2.0D) + Math.pow((double)(var1 - var3), 2.0D));
   }

   // $FF: synthetic method
   static void Method13413(Client var0, RgbImage var1) {
      var0.Field12413 = var1;
   }

   // $FF: synthetic method
   static RgbImage Method13414(Client var0) {
      return var0.Field12413;
   }

   // $FF: synthetic method
   static void Method13415(Client var0, RgbImage var1) {
      var0.Field12418 = var1;
   }

   // $FF: synthetic method
   static void Method13416(Client var0, boolean var1) {
      var0.Field12262 = false;
   }

   // $FF: synthetic method
   static RgbImage Method13417(Client var0) {
      return var0.Field12418;
   }

   // $FF: synthetic method
   static void Method13418(Client var0, Class116 var1) {
      var0.Field12412 = null;
   }

   // $FF: synthetic method
   static void Method13419(Client var0, Class820 var1) {
      var0.Field12241 = var1;
   }

   // $FF: synthetic method
   static Class820 Method13420(Client var0) {
      return var0.Field12241;
   }

   // $FF: synthetic method
   static Queue Method13421(Client var0) {
      return var0.Field12238;
   }

   // $FF: synthetic method
   static void Method13422(Client var0, RgbImage var1) {
      var0.Field12414 = var1;
   }

   // $FF: synthetic method
   static RgbImage Method13423(Client var0) {
      return var0.Field12414;
   }

   // $FF: synthetic method
   static void Method13424(Client var0, RgbImage var1) {
      var0.Field12415 = var1;
   }

   // $FF: synthetic method
   static RgbImage Method13425(Client var0) {
      return var0.Field12415;
   }

   // $FF: synthetic method
   static void Method13426(Client var0, RgbImage var1) {
      var0.Field12416 = var1;
   }

   // $FF: synthetic method
   static RgbImage Method13427(Client var0) {
      return var0.Field12416;
   }

   // $FF: synthetic method
   static void Method13428(Client var0, RgbImage var1) {
      var0.Field12417 = var1;
   }

   // $FF: synthetic method
   static RgbImage Method13429(Client var0) {
      return var0.Field12417;
   }
}
