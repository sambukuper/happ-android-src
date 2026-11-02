package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class nw0 {
    public static final float[] a;
    public static final float[] b;
    public static final fd8 c;
    public static final fd8 d;
    public static final wk6 e;
    public static final wk6 f;
    public static final wk6 g;
    public static final wk6 h;
    public static final wk6 i;
    public static final wk6 j;
    public static final wk6 k;
    public static final wk6 l;
    public static final wk6 m;
    public static final wk6 n;
    public static final wk6 o;
    public static final wk6 p;
    public static final wk6 q;
    public static final wk6 r;
    public static final e24 s;
    public static final e24 t;
    public static final wk6 u;
    public static final wk6 v;
    public static final wk6 w;
    public static final n95 x;
    public static final lw0[] y;

    static {
        float[] fArr = {0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f};
        a = fArr;
        float[] fArr2 = {0.67f, 0.33f, 0.21f, 0.71f, 0.14f, 0.08f};
        b = fArr2;
        float[] fArr3 = {0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f};
        fd8 fd8Var = new fd8(2.4d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        fd8 fd8Var2 = new fd8(2.2d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        fd8 fd8Var3 = new fd8(-3.0d, 2.0d, 2.0d, 5.591816309728916d, 0.28466892d, 0.55991073d, -0.685490157d);
        c = fd8Var3;
        fd8 fd8Var4 = new fd8(-2.0d, -1.555223d, 1.860454d, 0.012683313515655966d, 18.8515625d, -18.6875d, 6.277394636015326d);
        d = fd8Var4;
        h09 h09Var = w45.h;
        wk6 wk6Var = new wk6("sRGB IEC61966-2.1", fArr, h09Var, fd8Var, 0);
        e = wk6Var;
        wk6 wk6Var2 = new wk6("sRGB IEC61966-2.1 (Linear)", fArr, h09Var, 1.0d, 0.0f, 1.0f, 1);
        f = wk6Var2;
        wk6 wk6Var3 = new wk6("scRGB-nl IEC 61966-2-2:2003", fArr, h09Var, null, new om0((byte) 10), new om0((byte) 11), -0.799f, 2.399f, fd8Var, 2);
        g = wk6Var3;
        wk6 wk6Var4 = new wk6("scRGB IEC 61966-2-2:2003", fArr, h09Var, 1.0d, -0.5f, 7.499f, 3);
        h = wk6Var4;
        wk6 wk6Var5 = new wk6("Rec. ITU-R BT.709-5", new float[]{0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f}, h09Var, new fd8(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 4);
        i = wk6Var5;
        wk6 wk6Var6 = new wk6("Rec. ITU-R BT.2020-1", new float[]{0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f}, h09Var, new fd8(2.2222222222222223d, 0.9096697898662786d, 0.09033021013372146d, 0.2222222222222222d, 0.08145d), 5);
        j = wk6Var6;
        wk6 wk6Var7 = new wk6("SMPTE RP 431-2-2007 DCI (P3)", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, new h09(0.314f, 0.351f), 2.6d, 0.0f, 1.0f, 6);
        k = wk6Var7;
        wk6 wk6Var8 = new wk6("Display P3", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, h09Var, fd8Var, 7);
        l = wk6Var8;
        double d2 = 0.2222222222222222d;
        double d3 = 0.081d;
        double d4 = 2.2222222222222223d;
        double d5 = 0.9099181073703367d;
        double d6 = 0.09008189262966333d;
        wk6 wk6Var9 = new wk6("NTSC (1953)", fArr2, w45.e, new fd8(d4, d5, d6, d2, d3), 8);
        m = wk6Var9;
        wk6 wk6Var10 = new wk6("SMPTE-C RGB", new float[]{0.63f, 0.34f, 0.31f, 0.595f, 0.155f, 0.07f}, h09Var, new fd8(d4, d5, d6, d2, d3), 9);
        n = wk6Var10;
        wk6 wk6Var11 = new wk6("Adobe RGB (1998)", new float[]{0.64f, 0.33f, 0.21f, 0.71f, 0.15f, 0.06f}, h09Var, 2.2d, 0.0f, 1.0f, 10);
        o = wk6Var11;
        wk6 wk6Var12 = new wk6("ROMM RGB ISO 22028-2:2013", new float[]{0.7347f, 0.2653f, 0.1596f, 0.8404f, 0.0366f, 1.0E-4f}, w45.f, new fd8(1.8d, 1.0d, 0.0d, 0.0625d, 0.031248d), 11);
        p = wk6Var12;
        h09 h09Var2 = w45.g;
        wk6 wk6Var13 = new wk6("SMPTE ST 2065-1:2012 ACES", new float[]{0.7347f, 0.2653f, 0.0f, 1.0f, 1.0E-4f, -0.077f}, h09Var2, 1.0d, -65504.0f, 65504.0f, 12);
        q = wk6Var13;
        wk6 wk6Var14 = new wk6("Academy S-2014-004 ACEScg", new float[]{0.713f, 0.293f, 0.165f, 0.83f, 0.128f, 0.044f}, h09Var2, 1.0d, -65504.0f, 65504.0f, 13);
        r = wk6Var14;
        e24 e24Var = new e24("Generic XYZ", 12884901889L, 14, (byte) 1);
        s = e24Var;
        e24 e24Var2 = new e24("Generic L*a*b*", 12884901890L, 15, (byte) 0);
        t = e24Var2;
        wk6 wk6Var15 = new wk6("None", fArr, h09Var, fd8Var2, 16);
        u = wk6Var15;
        wk6 wk6Var16 = new wk6("Hybrid Log Gamma encoding", fArr3, h09Var, null, new om0((byte) 12), new om0((byte) 13), 0.0f, 1.0f, fd8Var3, 17);
        v = wk6Var16;
        wk6 wk6Var17 = new wk6("Perceptual Quantizer encoding", fArr3, h09Var, null, new om0((byte) 14), new om0((byte) 15), 0.0f, 1.0f, fd8Var4, 18);
        w = wk6Var17;
        n95 n95Var = new n95(19, "Oklab", 12884901890L);
        x = n95Var;
        y = new lw0[]{wk6Var, wk6Var2, wk6Var3, wk6Var4, wk6Var5, wk6Var6, wk6Var7, wk6Var8, wk6Var9, wk6Var10, wk6Var11, wk6Var12, wk6Var13, wk6Var14, e24Var, e24Var2, wk6Var15, wk6Var16, wk6Var17, n95Var};
    }

    public static double a(fd8 fd8Var, double d2) {
        double d3 = d2 < 0.0d ? -1.0d : 1.0d;
        double d4 = d2 * d3;
        double d5 = fd8Var.b;
        double d6 = fd8Var.c;
        double d7 = fd8Var.d;
        double d8 = fd8Var.e;
        double d9 = fd8Var.f;
        double d10 = d5 * d4;
        return (fd8Var.g + 1.0d) * d3 * (d10 <= 1.0d ? Math.pow(d10, d6) : Math.exp((d4 - d9) * d7) + d8);
    }

    public static double b(fd8 fd8Var, double d2) {
        double d3 = d2 < 0.0d ? -1.0d : 1.0d;
        double d4 = 1.0d / fd8Var.b;
        double d5 = 1.0d / fd8Var.c;
        double d6 = 1.0d / fd8Var.d;
        double d7 = fd8Var.e;
        double d8 = fd8Var.f;
        double d9 = (d2 * d3) / (fd8Var.g + 1.0d);
        return d3 * (d9 <= 1.0d ? Math.pow(d9, d5) * d4 : (Math.log(d9 - d7) * d6) + d8);
    }

    public static double c(fd8 fd8Var, double d2) {
        double d3 = d2 < 0.0d ? -1.0d : 1.0d;
        double d4 = d2 * d3;
        double d5 = fd8Var.b;
        double d6 = fd8Var.d;
        double dPow = (Math.pow(d4, d6) * fd8Var.c) + d5;
        return Math.pow((dPow >= 0.0d ? dPow : 0.0d) / ((Math.pow(d4, d6) * fd8Var.f) + fd8Var.e), fd8Var.g) * d3;
    }

    public static double d(fd8 fd8Var, double d2) {
        double d3 = d2 < 0.0d ? -1.0d : 1.0d;
        double d4 = d2 * d3;
        double d5 = -fd8Var.b;
        double d6 = fd8Var.e;
        double d7 = 1.0d / fd8Var.g;
        return Math.pow(Math.max((Math.pow(d4, d7) * d6) + d5, 0.0d) / ((Math.pow(d4, d7) * (-fd8Var.f)) + fd8Var.c), 1.0d / fd8Var.d) * d3;
    }
}
