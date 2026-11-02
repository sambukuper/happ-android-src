package defpackage;

import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class m31 {
    public int A;
    public float B;
    public final int[] C;
    public float D;
    public boolean E;
    public boolean F;
    public int G;
    public int H;
    public final u21 I;
    public final u21 J;
    public final u21 K;
    public final u21 L;
    public final u21 M;
    public final u21 N;
    public final u21 O;
    public final u21 P;
    public final u21[] Q;
    public final ArrayList R;
    public final boolean[] S;
    public n31 T;
    public int U;
    public int V;
    public float W;
    public int X;
    public int Y;
    public int Z;
    public int a0;
    public xo0 b;
    public int b0;
    public xo0 c;
    public int c0;
    public float d0;
    public float e0;
    public View f0;
    public int g0;
    public String h0;
    public int i0;
    public String j;
    public int j0;
    public boolean k;
    public final float[] k0;
    public boolean l;
    public final m31[] l0;
    public boolean m;
    public final m31[] m0;
    public boolean n;
    public int n0;
    public int o;
    public int o0;
    public int p;
    public final int[] p0;
    public int q;
    public int r;
    public int s;
    public final int[] t;
    public int u;
    public int v;
    public float w;
    public int x;
    public int y;
    public float z;
    public boolean a = false;
    public y03 d = null;
    public kv8 e = null;
    public final boolean[] f = {true, true};
    public boolean g = true;
    public int h = -1;
    public int i = -1;

    public m31() {
        new HashMap();
        this.k = false;
        this.l = false;
        this.m = false;
        this.n = false;
        this.o = -1;
        this.p = -1;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.t = new int[2];
        this.u = 0;
        this.v = 0;
        this.w = 1.0f;
        this.x = 0;
        this.y = 0;
        this.z = 1.0f;
        this.A = -1;
        this.B = 1.0f;
        this.C = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.D = Float.NaN;
        this.E = false;
        this.F = false;
        this.G = 0;
        this.H = 0;
        u21 u21Var = new u21(this, 2);
        this.I = u21Var;
        u21 u21Var2 = new u21(this, 3);
        this.J = u21Var2;
        u21 u21Var3 = new u21(this, 4);
        this.K = u21Var3;
        u21 u21Var4 = new u21(this, 5);
        this.L = u21Var4;
        u21 u21Var5 = new u21(this, 6);
        this.M = u21Var5;
        u21 u21Var6 = new u21(this, 8);
        this.N = u21Var6;
        u21 u21Var7 = new u21(this, 9);
        this.O = u21Var7;
        u21 u21Var8 = new u21(this, 7);
        this.P = u21Var8;
        this.Q = new u21[]{u21Var, u21Var3, u21Var2, u21Var4, u21Var5, u21Var8};
        ArrayList arrayList = new ArrayList();
        this.R = arrayList;
        this.S = new boolean[2];
        this.p0 = new int[]{1, 1};
        this.T = null;
        this.U = 0;
        this.V = 0;
        this.W = 0.0f;
        this.X = -1;
        this.Y = 0;
        this.Z = 0;
        this.a0 = 0;
        this.d0 = 0.5f;
        this.e0 = 0.5f;
        this.g0 = 0;
        this.h0 = null;
        this.i0 = 0;
        this.j0 = 0;
        this.k0 = new float[]{-1.0f, -1.0f};
        this.l0 = new m31[]{null, null};
        this.m0 = new m31[]{null, null};
        this.n0 = -1;
        this.o0 = -1;
        arrayList.add(u21Var);
        arrayList.add(u21Var2);
        arrayList.add(u21Var3);
        arrayList.add(u21Var4);
        arrayList.add(u21Var6);
        arrayList.add(u21Var7);
        arrayList.add(u21Var8);
        arrayList.add(u21Var5);
    }

    public static void G(int i, int i2, String str, StringBuilder sb) {
        if (i == i2) {
            return;
        }
        sb.append(str);
        sb.append(" :   ");
        sb.append(i);
        sb.append(",\n");
    }

    public static void H(StringBuilder sb, String str, float f, float f2) {
        if (f == f2) {
            return;
        }
        sb.append(str);
        sb.append(" :   ");
        sb.append(f);
        sb.append(",\n");
    }

    public static void o(StringBuilder sb, String str, int i, int i2, int i3, int i4, int i5, float f, int i6) {
        String str2;
        sb.append(str);
        sb.append(" :  {\n");
        if (i6 == 1) {
            str2 = "FIXED";
        } else if (i6 == 2) {
            str2 = "WRAP_CONTENT";
        } else if (i6 == 3) {
            str2 = "MATCH_CONSTRAINT";
        } else {
            if (i6 != 4) {
                throw null;
            }
            str2 = "MATCH_PARENT";
        }
        if (!"FIXED".equals(str2)) {
            oi0.y(sb, "      behavior", " :   ", str2, ",\n");
        }
        G(i, 0, "      size", sb);
        G(i2, 0, "      min", sb);
        G(i3, Integer.MAX_VALUE, "      max", sb);
        G(i4, 0, "      matchMin", sb);
        G(i5, 0, "      matchDef", sb);
        H(sb, "      matchPercent", f, 1.0f);
        sb.append("    },\n");
    }

    public static void p(StringBuilder sb, String str, u21 u21Var) {
        if (u21Var.f == null) {
            return;
        }
        sb.append("    ");
        sb.append(str);
        sb.append(" : [ '");
        sb.append(u21Var.f);
        sb.append("'");
        if (u21Var.h != Integer.MIN_VALUE || u21Var.g != 0) {
            sb.append(",");
            sb.append(u21Var.g);
            if (u21Var.h != Integer.MIN_VALUE) {
                sb.append(",");
                sb.append(u21Var.h);
                sb.append(",");
            }
        }
        sb.append(" ] ,\n");
    }

    public boolean A() {
        if (this.k) {
            return true;
        }
        return this.I.c && this.K.c;
    }

    public boolean B() {
        if (this.l) {
            return true;
        }
        return this.J.c && this.L.c;
    }

    public void C() {
        this.I.j();
        this.J.j();
        this.K.j();
        this.L.j();
        this.M.j();
        this.N.j();
        this.O.j();
        this.P.j();
        this.T = null;
        this.D = Float.NaN;
        this.U = 0;
        this.V = 0;
        this.W = 0.0f;
        this.X = -1;
        this.Y = 0;
        this.Z = 0;
        this.a0 = 0;
        this.b0 = 0;
        this.c0 = 0;
        this.d0 = 0.5f;
        this.e0 = 0.5f;
        int[] iArr = this.p0;
        iArr[0] = 1;
        iArr[1] = 1;
        this.f0 = null;
        this.g0 = 0;
        this.i0 = 0;
        this.j0 = 0;
        float[] fArr = this.k0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.o = -1;
        this.p = -1;
        int[] iArr2 = this.C;
        iArr2[0] = Integer.MAX_VALUE;
        iArr2[1] = Integer.MAX_VALUE;
        this.r = 0;
        this.s = 0;
        this.w = 1.0f;
        this.z = 1.0f;
        this.v = Integer.MAX_VALUE;
        this.y = Integer.MAX_VALUE;
        this.u = 0;
        this.x = 0;
        this.A = -1;
        this.B = 1.0f;
        boolean[] zArr = this.f;
        zArr[0] = true;
        zArr[1] = true;
        this.F = false;
        boolean[] zArr2 = this.S;
        zArr2[0] = false;
        zArr2[1] = false;
        this.g = true;
        int[] iArr3 = this.t;
        iArr3[0] = 0;
        iArr3[1] = 0;
        this.h = -1;
        this.i = -1;
    }

    public final void D() {
        ArrayList arrayList = this.R;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((u21) arrayList.get(i)).j();
        }
    }

    public final void E() {
        this.k = false;
        this.l = false;
        this.m = false;
        this.n = false;
        ArrayList arrayList = this.R;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            u21 u21Var = (u21) arrayList.get(i);
            u21Var.c = false;
            u21Var.b = 0;
        }
    }

    public void F(lr lrVar) {
        this.I.k();
        this.J.k();
        this.K.k();
        this.L.k();
        this.M.k();
        this.P.k();
        this.N.k();
        this.O.k();
    }

    public final void I(int i) {
        this.a0 = i;
        this.E = i > 0;
    }

    public final void J(int i, int i2) {
        if (this.k) {
            return;
        }
        this.I.l(i);
        this.K.l(i2);
        this.Y = i;
        this.U = i2 - i;
        this.k = true;
    }

    public final void K(int i, int i2) {
        if (this.l) {
            return;
        }
        this.J.l(i);
        this.L.l(i2);
        this.Z = i;
        this.V = i2 - i;
        if (this.E) {
            this.M.l(i + this.a0);
        }
        this.l = true;
    }

    public final void L(int i) {
        this.V = i;
        int i2 = this.c0;
        if (i < i2) {
            this.V = i2;
        }
    }

    public final void M(int i) {
        this.p0[0] = i;
    }

    public final void N(int i) {
        this.p0[1] = i;
    }

    public final void O(int i) {
        this.U = i;
        int i2 = this.b0;
        if (i < i2) {
            this.U = i2;
        }
    }

    public void P(boolean z, boolean z2) {
        int i;
        int i2;
        y03 y03Var = this.d;
        boolean z3 = z & y03Var.g;
        kv8 kv8Var = this.e;
        boolean z4 = z2 & kv8Var.g;
        int i3 = y03Var.h.g;
        int i4 = kv8Var.h.g;
        int i5 = y03Var.i.g;
        int i6 = kv8Var.i.g;
        int i7 = i6 - i4;
        if (i5 - i3 < 0 || i7 < 0 || i3 == Integer.MIN_VALUE || i3 == Integer.MAX_VALUE || i4 == Integer.MIN_VALUE || i4 == Integer.MAX_VALUE || i5 == Integer.MIN_VALUE || i5 == Integer.MAX_VALUE || i6 == Integer.MIN_VALUE || i6 == Integer.MAX_VALUE) {
            i5 = 0;
            i6 = 0;
            i3 = 0;
            i4 = 0;
        }
        int i8 = i5 - i3;
        int i9 = i6 - i4;
        if (z3) {
            this.Y = i3;
        }
        if (z4) {
            this.Z = i4;
        }
        if (this.g0 == 8) {
            this.U = 0;
            this.V = 0;
            return;
        }
        int[] iArr = this.p0;
        if (z3) {
            if (iArr[0] == 1 && i8 < (i2 = this.U)) {
                i8 = i2;
            }
            this.U = i8;
            int i10 = this.b0;
            if (i8 < i10) {
                this.U = i10;
            }
        }
        if (z4) {
            if (iArr[1] == 1 && i9 < (i = this.V)) {
                i9 = i;
            }
            this.V = i9;
            int i11 = this.c0;
            if (i9 < i11) {
                this.V = i11;
            }
        }
    }

    public void Q(ka4 ka4Var, boolean z) {
        int i;
        int i2;
        kv8 kv8Var;
        y03 y03Var;
        ka4Var.getClass();
        int iN = ka4.n(this.I);
        int iN2 = ka4.n(this.J);
        int iN3 = ka4.n(this.K);
        int iN4 = ka4.n(this.L);
        if (z && (y03Var = this.d) != null) {
            si1 si1Var = y03Var.h;
            if (si1Var.j) {
                si1 si1Var2 = y03Var.i;
                if (si1Var2.j) {
                    iN = si1Var.g;
                    iN3 = si1Var2.g;
                }
            }
        }
        if (z && (kv8Var = this.e) != null) {
            si1 si1Var3 = kv8Var.h;
            if (si1Var3.j) {
                si1 si1Var4 = kv8Var.i;
                if (si1Var4.j) {
                    iN2 = si1Var3.g;
                    iN4 = si1Var4.g;
                }
            }
        }
        int i3 = iN4 - iN2;
        if (iN3 - iN < 0 || i3 < 0 || iN == Integer.MIN_VALUE || iN == Integer.MAX_VALUE || iN2 == Integer.MIN_VALUE || iN2 == Integer.MAX_VALUE || iN3 == Integer.MIN_VALUE || iN3 == Integer.MAX_VALUE || iN4 == Integer.MIN_VALUE || iN4 == Integer.MAX_VALUE) {
            iN = 0;
            iN2 = 0;
            iN3 = 0;
            iN4 = 0;
        }
        int i4 = iN3 - iN;
        int i5 = iN4 - iN2;
        this.Y = iN;
        this.Z = iN2;
        if (this.g0 == 8) {
            this.U = 0;
            this.V = 0;
            return;
        }
        int[] iArr = this.p0;
        int i6 = iArr[0];
        if (i6 == 1 && i4 < (i2 = this.U)) {
            i4 = i2;
        }
        if (iArr[1] == 1 && i5 < (i = this.V)) {
            i5 = i;
        }
        this.U = i4;
        this.V = i5;
        int i7 = this.c0;
        if (i5 < i7) {
            this.V = i7;
        }
        int i8 = this.b0;
        if (i4 < i8) {
            this.U = i8;
        } else {
            i8 = i4;
        }
        int i9 = this.v;
        if (i9 > 0 && i6 == 3) {
            this.U = Math.min(i8, i9);
        }
        int i10 = this.y;
        if (i10 > 0 && iArr[1] == 3) {
            this.V = Math.min(this.V, i10);
        }
        int i11 = this.U;
        if (i4 != i11) {
            this.h = i11;
        }
        int i12 = this.V;
        if (i5 != i12) {
            this.i = i12;
        }
    }

    public final void a(n31 n31Var, ka4 ka4Var, HashSet hashSet, int i, boolean z) {
        if (z) {
            if (!hashSet.contains(this)) {
                return;
            }
            km4.p(n31Var, ka4Var, this);
            hashSet.remove(this);
            b(ka4Var, n31Var.W(64));
        }
        if (i == 0) {
            HashSet hashSet2 = this.I.a;
            if (hashSet2 != null) {
                Iterator it = hashSet2.iterator();
                while (it.hasNext()) {
                    ((u21) it.next()).d.a(n31Var, ka4Var, hashSet, i, true);
                }
            }
            HashSet hashSet3 = this.K.a;
            if (hashSet3 != null) {
                Iterator it2 = hashSet3.iterator();
                while (it2.hasNext()) {
                    ((u21) it2.next()).d.a(n31Var, ka4Var, hashSet, i, true);
                }
                return;
            }
            return;
        }
        HashSet hashSet4 = this.J.a;
        if (hashSet4 != null) {
            Iterator it3 = hashSet4.iterator();
            while (it3.hasNext()) {
                ((u21) it3.next()).d.a(n31Var, ka4Var, hashSet, i, true);
            }
        }
        HashSet hashSet5 = this.L.a;
        if (hashSet5 != null) {
            Iterator it4 = hashSet5.iterator();
            while (it4.hasNext()) {
                ((u21) it4.next()).d.a(n31Var, ka4Var, hashSet, i, true);
            }
        }
        HashSet hashSet6 = this.M.a;
        if (hashSet6 != null) {
            Iterator it5 = hashSet6.iterator();
            while (it5.hasNext()) {
                ((u21) it5.next()).d.a(n31Var, ka4Var, hashSet, i, true);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:121:0x0200  */
    /* JADX WARN: Code duplicated, block: B:125:0x0208  */
    /* JADX WARN: Code duplicated, block: B:128:0x0211  */
    /* JADX WARN: Code duplicated, block: B:130:0x0217  */
    /* JADX WARN: Code duplicated, block: B:131:0x0220  */
    /* JADX WARN: Code duplicated, block: B:134:0x022c  */
    /* JADX WARN: Code duplicated, block: B:135:0x0233  */
    /* JADX WARN: Code duplicated, block: B:145:0x0259  */
    /* JADX WARN: Code duplicated, block: B:157:0x0283  */
    /* JADX WARN: Code duplicated, block: B:161:0x0292  */
    /* JADX WARN: Code duplicated, block: B:164:0x029b  */
    /* JADX WARN: Code duplicated, block: B:165:0x029e  */
    /* JADX WARN: Code duplicated, block: B:168:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:170:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:173:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:174:0x02be  */
    /* JADX WARN: Code duplicated, block: B:177:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:179:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:183:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:187:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:24:0x0062  */
    /* JADX WARN: Code duplicated, block: B:250:0x03a9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:251:0x03ab A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:258:0x03cc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:259:0x03ce A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:268:0x03f2 A[PHI: r4
  0x03f2: PHI (r4v39 int) = (r4v4 int), (r4v4 int), (r4v41 int) binds: [B:258:0x03cc, B:259:0x03ce, B:249:0x03a7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:26:0x006e  */
    /* JADX WARN: Code duplicated, block: B:270:0x03fb  */
    /* JADX WARN: Code duplicated, block: B:274:0x0413 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:277:0x0419  */
    /* JADX WARN: Code duplicated, block: B:279:0x041c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:283:0x0425  */
    /* JADX WARN: Code duplicated, block: B:286:0x042d  */
    /* JADX WARN: Code duplicated, block: B:289:0x0433  */
    /* JADX WARN: Code duplicated, block: B:291:0x0436  */
    /* JADX WARN: Code duplicated, block: B:294:0x0452  */
    /* JADX WARN: Code duplicated, block: B:313:0x0499  */
    /* JADX WARN: Code duplicated, block: B:329:0x0540  */
    /* JADX WARN: Code duplicated, block: B:345:0x0593  */
    /* JADX WARN: Code duplicated, block: B:348:0x05a5  */
    /* JADX WARN: Code duplicated, block: B:351:0x05a9  */
    /* JADX WARN: Code duplicated, block: B:388:0x066a  */
    /* JADX WARN: Code duplicated, block: B:38:0x0092  */
    /* JADX WARN: Code duplicated, block: B:390:0x0670  */
    /* JADX WARN: Code duplicated, block: B:392:0x0679  */
    /* JADX WARN: Code duplicated, block: B:393:0x06a0  */
    /* JADX WARN: Code duplicated, block: B:396:0x06cc  */
    /* JADX WARN: Code duplicated, block: B:399:0x0089 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x009c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:44:0x009e  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:50:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:54:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:57:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:61:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:64:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:67:0x010d  */
    /* JADX WARN: Code duplicated, block: B:71:0x011d  */
    /* JADX WARN: Code duplicated, block: B:75:0x0125  */
    /* JADX WARN: Code duplicated, block: B:79:0x013d  */
    /* JADX WARN: Code duplicated, block: B:82:0x0148  */
    /* JADX WARN: Code duplicated, block: B:86:0x0160  */
    /* JADX WARN: Code duplicated, block: B:89:0x016b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v8, types: [boolean] */
    /* JADX WARN: Type inference failed for: r17v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r17v9, types: [boolean] */
    /* JADX WARN: Type inference failed for: r18v24 */
    /* JADX WARN: Type inference failed for: r18v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r18v6 */
    /* JADX WARN: Type inference failed for: r27v3 */
    /* JADX WARN: Type inference failed for: r27v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r27v6 */
    /* JADX WARN: Type inference failed for: r27v7 */
    /* JADX WARN: Type inference failed for: r27v8 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v26, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v27, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v46 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r58v0, types: [m31] */
    public void b(ka4 ka4Var, boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        boolean[] zArr;
        int i5;
        int i6;
        boolean z2;
        HashSet hashSet;
        n31 n31Var;
        WeakReference weakReference;
        WeakReference weakReference2;
        n31 n31Var2;
        WeakReference weakReference3;
        WeakReference weakReference4;
        boolean[] zArr2;
        u21 u21Var;
        boolean[] zArr3;
        boolean z3;
        boolean z4;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int[] iArr;
        int i12;
        boolean z5;
        int i13;
        boolean z6;
        float f;
        int i14;
        int i15;
        u21 u21Var2;
        int i16;
        int i17;
        int i18;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        u21 u21Var3;
        int i19;
        ?? r4;
        int[] iArr2;
        u21 u21Var4;
        ge7 ge7Var;
        ge7 ge7Var2;
        ge7 ge7Var3;
        boolean z11;
        ?? r3;
        int i20;
        ge7 ge7Var4;
        ge7 ge7Var5;
        ge7 ge7Var6;
        int i21;
        int i22;
        boolean z12;
        int i23;
        ge7 ge7Var7;
        int i24;
        float f2;
        ?? r27;
        kv8 kv8Var;
        boolean z13;
        y03 y03Var;
        int i25;
        boolean zX;
        int i26;
        boolean zY;
        y03 y03Var2;
        kv8 kv8Var2;
        boolean z14;
        ArrayList arrayList;
        int size;
        int i27;
        HashSet hashSet2;
        ka4 ka4Var2 = ka4Var;
        u21 u21Var5 = this.I;
        ge7 ge7VarK = ka4Var2.k(u21Var5);
        u21 u21Var6 = this.K;
        ge7 ge7VarK2 = ka4Var2.k(u21Var6);
        u21 u21Var7 = this.J;
        ge7 ge7VarK3 = ka4Var2.k(u21Var7);
        u21 u21Var8 = this.L;
        ge7 ge7VarK4 = ka4Var2.k(u21Var8);
        u21 u21Var9 = this.M;
        ge7 ge7VarK5 = ka4Var2.k(u21Var9);
        n31 n31Var3 = this.T;
        if (n31Var3 != null) {
            int[] iArr3 = n31Var3.p0;
            i = 0;
            i3 = iArr3[0] == 2 ? 1 : 0;
            int i28 = iArr3[1] == 2 ? 1 : 0;
            int i29 = this.q;
            if (i29 != 1) {
                if (i29 == 2) {
                    i3 = 0;
                } else if (i29 != 3) {
                }
                i2 = i28;
            } else {
                i2 = 0;
            }
            i4 = this.g0;
            zArr = this.S;
            i5 = i2;
            if (i4 == 8) {
                arrayList = this.R;
                size = arrayList.size();
                i6 = i3;
                i27 = i;
                while (true) {
                    if (i27 < size) {
                        if (!zArr[i] || zArr[1]) {
                            break;
                            break;
                        }
                        return;
                    }
                    int i30 = size;
                    hashSet2 = ((u21) arrayList.get(i27)).a;
                    if (hashSet2 != null && hashSet2.size() > 0) {
                        break;
                    }
                    i27++;
                    size = i30;
                }
            } else {
                i6 = i3;
            }
            z2 = this.k;
            if (z2 || this.l) {
                if (z2) {
                    ka4Var2.d(ge7VarK, this.Y);
                    ka4Var2.d(ge7VarK2, this.Y + this.U);
                    if (i6 != 0 && (n31Var2 = this.T) != null) {
                        weakReference3 = n31Var2.H0;
                        if (weakReference3 != null || weakReference3.get() == null || u21Var5.d() > ((u21) n31Var2.H0.get()).d()) {
                            n31Var2.H0 = new WeakReference(u21Var5);
                        }
                        weakReference4 = n31Var2.J0;
                        if (weakReference4 != null || weakReference4.get() == null || u21Var6.d() > ((u21) n31Var2.J0.get()).d()) {
                            n31Var2.J0 = new WeakReference(u21Var6);
                        }
                    }
                }
                if (this.l) {
                    ka4Var2.d(ge7VarK3, this.Z);
                    ka4Var2.d(ge7VarK4, this.Z + this.V);
                    hashSet = u21Var9.a;
                    if (hashSet != null && hashSet.size() > 0) {
                        ka4Var2.d(ge7VarK5, this.Z + this.a0);
                    }
                    if (i5 != 0 && (n31Var = this.T) != null) {
                        weakReference = n31Var.G0;
                        if (weakReference != null || weakReference.get() == null || u21Var7.d() > ((u21) n31Var.G0.get()).d()) {
                            n31Var.G0 = new WeakReference(u21Var7);
                        }
                        weakReference2 = n31Var.I0;
                        if (weakReference2 != null || weakReference2.get() == null || u21Var8.d() > ((u21) n31Var.I0.get()).d()) {
                            n31Var.I0 = new WeakReference(u21Var8);
                        }
                    }
                }
                if (this.k && this.l) {
                    ?? r12 = i;
                    this.k = r12;
                    this.l = r12;
                    return;
                }
            }
            zArr2 = this.f;
            if (z || (y03Var2 = this.d) == null || (kv8Var2 = this.e) == null) {
                u21Var = u21Var9;
                zArr3 = zArr2;
            } else {
                u21Var = u21Var9;
                si1 si1Var = y03Var2.h;
                zArr3 = zArr2;
                if (si1Var.j && y03Var2.i.j && kv8Var2.h.j && kv8Var2.i.j) {
                    ka4Var2.d(ge7VarK, si1Var.g);
                    ka4Var2.d(ge7VarK2, this.d.i.g);
                    ka4Var2.d(ge7VarK3, this.e.h.g);
                    ka4Var2.d(ge7VarK4, this.e.i.g);
                    ka4Var2.d(ge7VarK5, this.e.k.g);
                    if (this.T == null) {
                        z14 = false;
                    } else {
                        if (i6 != 0 && zArr3[0] && !x()) {
                            ka4Var2.f(ka4Var2.k(this.T.K), ge7VarK2, 0, 8);
                        }
                        if (i5 == 0 || !zArr3[1] || y()) {
                            z14 = false;
                        } else {
                            z14 = false;
                            ka4Var2.f(ka4Var2.k(this.T.L), ge7VarK4, 0, 8);
                        }
                    }
                    this.k = z14;
                    this.l = z14;
                    return;
                }
            }
            if (this.T != null) {
                if (w(0)) {
                    this.T.R(this, 0);
                    zX = true;
                    i26 = 1;
                } else {
                    zX = x();
                    i26 = 1;
                }
                if (w(i26)) {
                    this.T.R(this, i26);
                    zY = true;
                } else {
                    zY = y();
                }
                if (zX && i6 != 0 && this.g0 != 8 && u21Var5.f == null && u21Var6.f == null) {
                    ka4Var2.f(ka4Var2.k(this.T.K), ge7VarK2, 0, 1);
                }
                if (!zY && i5 != 0 && this.g0 != 8 && u21Var7.f == null && u21Var8.f == null && u21Var == null) {
                    ka4Var2.f(ka4Var2.k(this.T.L), ge7VarK4, 0, 1);
                }
                z4 = zY;
                z3 = zX;
            } else {
                u21Var5 = u21Var5;
                z3 = false;
                z4 = false;
            }
            i7 = this.U;
            i8 = this.b0;
            if (i7 >= i8) {
                i8 = i7;
            }
            i9 = this.V;
            i10 = this.c0;
            if (i9 < i10) {
                i11 = i10;
            } else {
                i11 = i9;
            }
            iArr = this.p0;
            i12 = iArr[0];
            if (i12 != 3) {
                z5 = true;
            } else {
                z5 = false;
            }
            i13 = iArr[1];
            if (i13 != 3) {
                z6 = true;
            } else {
                z6 = false;
            }
            int i31 = this.X;
            this.A = i31;
            float f3 = this.W;
            this.B = f3;
            f = f3;
            i14 = this.r;
            i15 = this.s;
            if (f > 0.0f) {
                u21Var2 = u21Var8;
                if (this.g0 != 8) {
                    if (i12 == 3 || i14 != 0) {
                        i17 = i14;
                    } else {
                        i17 = 3;
                    }
                    if (i13 == 3 || i15 != 0) {
                        i25 = i15;
                    } else {
                        i25 = 3;
                    }
                    if (i12 == 3 || i13 != 3 || i17 != 3 || i25 != 3) {
                        if (i12 != 3 && i17 == 3) {
                            this.A = 0;
                            i8 = (int) (f * i9);
                            if (i13 != 3) {
                                u21Var = u21Var;
                                i16 = i11;
                                i31 = 0;
                                i17 = 4;
                                z7 = false;
                            } else {
                                i16 = i11;
                                i31 = 0;
                            }
                            i18 = i25;
                            int[] iArr4 = this.t;
                            iArr4[0] = i17;
                            iArr4[1] = i18;
                            if (z7 || !(i31 == 0 || i31 == -1)) {
                                z8 = false;
                            } else {
                                z8 = true;
                            }
                            if (z7 || !(i31 == 1 || i31 == -1)) {
                                z9 = false;
                            } else {
                                z9 = true;
                            }
                            if (iArr[0] == 2 || !(this instanceof n31)) {
                                z10 = false;
                            } else {
                                z10 = true;
                            }
                            if (z10) {
                                i8 = 0;
                            }
                            u21Var3 = this.P;
                            boolean z15 = !u21Var3.h();
                            char c = '\b';
                            boolean z16 = zArr[0];
                            boolean z17 = zArr[1];
                            i19 = this.o;
                            int[] iArr5 = this.C;
                            if (i19 != 2 || this.k) {
                                r4 = i5;
                                iArr2 = iArr;
                                u21Var4 = u21Var;
                                ge7Var = ge7VarK;
                                ge7Var2 = ge7VarK2;
                                ge7Var3 = ge7VarK5;
                                z11 = z3;
                                r3 = i6;
                                i20 = i17;
                            } else {
                                if (z && (y03Var = this.d) != null) {
                                    si1 si1Var2 = y03Var.h;
                                    if (si1Var2.j && y03Var.i.j) {
                                        if (z) {
                                            ka4Var2.d(ge7VarK, si1Var2.g);
                                            ka4Var2.d(ge7VarK2, this.d.i.g);
                                            if (this.T != null && i6 != 0 && zArr3[0] && !x()) {
                                                ka4Var2.f(ka4Var2.k(this.T.K), ge7VarK2, 0, 8);
                                            }
                                        }
                                        r4 = i5;
                                        iArr2 = iArr;
                                        u21Var4 = u21Var;
                                        ge7Var = ge7VarK;
                                        ge7Var2 = ge7VarK2;
                                        ge7Var3 = ge7VarK5;
                                        z11 = z3;
                                        r3 = i6;
                                        i20 = i17;
                                    } else {
                                        c = '\b';
                                    }
                                }
                                n31 n31Var4 = this.T;
                                ge7 ge7VarK6 = n31Var4 != null ? ka4Var2.k(n31Var4.K) : null;
                                n31 n31Var5 = this.T;
                                ge7 ge7VarK7 = n31Var5 != null ? ka4Var2.k(n31Var5.I) : null;
                                z11 = z3;
                                ?? r5 = i6;
                                i20 = i17;
                                ?? r6 = i5;
                                iArr2 = iArr;
                                ge7Var2 = ge7VarK2;
                                ge7Var = ge7VarK;
                                u21Var4 = u21Var;
                                ge7Var3 = ge7VarK5;
                                ka4Var2 = ka4Var;
                                d(ka4Var2, true, r5, r6, zArr3[0], ge7VarK7, ge7VarK6, iArr[0], z10, this.I, this.K, this.Y, i8, this.b0, iArr5[0], this.d0, z8, iArr[1] == 3, z11, z4, z16, i20, i18, this.u, this.v, this.w, z15);
                                r3 = r5;
                                r4 = r6;
                            }
                            if (z || (kv8Var = this.e) == null) {
                                ge7Var4 = r33;
                                ge7Var5 = ge7VarK4;
                                ge7Var6 = ge7Var3;
                                i21 = 0;
                                i22 = 8;
                                z12 = true;
                                i23 = 1;
                            } else {
                                si1 si1Var3 = kv8Var.h;
                                if (si1Var3.j && kv8Var.i.j) {
                                    int i32 = si1Var3.g;
                                    ge7Var4 = ge7VarK3;
                                    ka4Var2.d(ge7Var4, i32);
                                    ge7Var5 = ge7VarK4;
                                    ka4Var2.d(ge7Var5, this.e.i.g);
                                    ge7Var6 = ge7Var3;
                                    ka4Var2.d(ge7Var6, this.e.k.g);
                                    n31 n31Var6 = this.T;
                                    if (n31Var6 == null || z4 || r4 == 0) {
                                        i21 = 0;
                                        i22 = 8;
                                        z13 = true;
                                    } else {
                                        z13 = true;
                                        z13 = true;
                                        if (zArr3[1]) {
                                            i21 = 0;
                                            i22 = 8;
                                            ka4Var2.f(ka4Var2.k(n31Var6.L), ge7Var5, 0, 8);
                                        } else {
                                            i21 = 0;
                                            i22 = 8;
                                        }
                                    }
                                    i23 = i21;
                                    z12 = z13;
                                } else {
                                    ge7Var4 = r33;
                                    ge7Var5 = ge7VarK4;
                                    ge7Var6 = ge7Var3;
                                    i21 = 0;
                                    i22 = 8;
                                    z12 = true;
                                    i23 = 1;
                                }
                            }
                            if (this.p == 2) {
                                i23 = i21;
                            }
                            if (i23 != 0 || this.l) {
                                ge7Var7 = ge7Var4;
                            } else {
                                int i33 = (iArr2[z12 ? 1 : 0] == 2 && (this instanceof n31)) ? z12 ? 1 : 0 : i21;
                                int i34 = i33 != 0 ? i21 : i16;
                                n31 n31Var7 = this.T;
                                ge7 ge7VarK8 = n31Var7 != null ? ka4Var2.k(n31Var7.L) : null;
                                n31 n31Var8 = this.T;
                                ge7 ge7VarK9 = n31Var8 != null ? ka4Var2.k(n31Var8.J) : null;
                                int i35 = this.a0;
                                if (i35 > 0 || this.g0 == i22) {
                                    r27 = z15;
                                    u21 u21Var10 = u21Var4;
                                    if (u21Var10.f != null) {
                                        ka4Var2.e(ge7Var6, ge7Var4, i35, i22);
                                        ka4Var2.e(ge7Var6, ka4Var2.k(u21Var10.f), u21Var10.e(), i22);
                                        if (r4 != 0) {
                                            ka4Var2.f(ge7VarK8, ka4Var2.k(u21Var2), i21, 5);
                                        }
                                        r27 = i21;
                                    } else if (this.g0 == i22) {
                                        ka4Var2.e(ge7Var6, ge7Var4, u21Var10.e(), i22);
                                        r27 = z15;
                                    } else {
                                        ka4Var2.e(ge7Var6, ge7Var4, i35, i22);
                                        r27 = z15;
                                    }
                                }
                                r27 = z15;
                                boolean z18 = zArr3[z12 ? 1 : 0];
                                int i36 = i21;
                                int i37 = iArr2[z12 ? 1 : 0];
                                int i38 = this.Z;
                                int i39 = this.c0;
                                int i40 = iArr5[z12 ? 1 : 0];
                                float f4 = this.e0;
                                int i41 = iArr2[i36];
                                boolean z19 = z12 ? 1 : 0;
                                ?? r18 = z12;
                                if (i41 != 3) {
                                    r18 = i36;
                                }
                                ge7Var7 = ge7Var4;
                                ka4Var2 = ka4Var;
                                d(ka4Var2, false, r4, r3, z18, ge7VarK9, ge7VarK8, i37, i33, this.J, this.L, i38, i34, i39, i40, f4, z9, r18, z4, z11, z17, i18, i20, this.x, this.y, this.z, r27);
                            }
                            if (z7) {
                                i24 = this.A;
                                f2 = this.B;
                                if (i24 == 1) {
                                    zt ztVarL = ka4Var2.l();
                                    ztVarL.d.g(ge7Var5, -1.0f);
                                    ztVarL.d.g(ge7Var7, 1.0f);
                                    ztVarL.d.g(ge7Var2, f2);
                                    ztVarL.d.g(ge7Var, -f2);
                                    ka4Var2.c(ztVarL);
                                } else {
                                    zt ztVarL2 = ka4Var2.l();
                                    ztVarL2.d.g(ge7Var2, -1.0f);
                                    ztVarL2.d.g(ge7Var, 1.0f);
                                    ztVarL2.d.g(ge7Var5, f2);
                                    ztVarL2.d.g(ge7Var7, -f2);
                                    ka4Var2.c(ztVarL2);
                                }
                            }
                            if (u21Var3.h()) {
                                m31 m31Var = u21Var3.f.d;
                                float radians = (float) Math.toRadians(this.D + 90.0f);
                                int iE = u21Var3.e();
                                ge7 ge7VarK10 = ka4Var2.k(i(2));
                                ge7 ge7VarK11 = ka4Var2.k(i(3));
                                ge7 ge7VarK12 = ka4Var2.k(i(4));
                                ge7 ge7VarK13 = ka4Var2.k(i(5));
                                ge7 ge7VarK14 = ka4Var2.k(m31Var.i(2));
                                ge7 ge7VarK15 = ka4Var2.k(m31Var.i(3));
                                ge7 ge7VarK16 = ka4Var2.k(m31Var.i(4));
                                ge7 ge7VarK17 = ka4Var2.k(m31Var.i(5));
                                zt ztVarL3 = ka4Var2.l();
                                double d = radians;
                                double dSin = Math.sin(d);
                                double d2 = iE;
                                ztVarL3.d.g(ge7VarK15, 0.5f);
                                ztVarL3.d.g(ge7VarK17, 0.5f);
                                ztVarL3.d.g(ge7VarK11, -0.5f);
                                ztVarL3.d.g(ge7VarK13, -0.5f);
                                ztVarL3.b = -((float) (dSin * d2));
                                ka4Var2.c(ztVarL3);
                                zt ztVarL4 = ka4Var2.l();
                                float fCos = (float) (Math.cos(d) * d2);
                                ztVarL4.d.g(ge7VarK14, 0.5f);
                                ztVarL4.d.g(ge7VarK16, 0.5f);
                                ztVarL4.d.g(ge7VarK10, -0.5f);
                                ztVarL4.d.g(ge7VarK12, -0.5f);
                                ztVarL4.b = -fCos;
                                ka4Var2.c(ztVarL4);
                            }
                            this.k = false;
                            this.l = false;
                        }
                        if (i13 != 3 && i25 == 3) {
                            this.A = 1;
                            if (i31 == -1) {
                                float f5 = 1.0f / f;
                                this.B = f5;
                                f = f5;
                            }
                            i16 = (int) (i7 * f);
                            if (i12 != 3) {
                                i17 = i17;
                                i31 = 1;
                                i18 = 4;
                            } else {
                                i31 = 1;
                            }
                        }
                        z7 = true;
                        i18 = i25;
                        int[] iArr6 = this.t;
                        iArr6[0] = i17;
                        iArr6[1] = i18;
                        if (z7) {
                            z8 = false;
                        } else {
                            z8 = false;
                        }
                        if (z7) {
                            z9 = false;
                        } else {
                            z9 = false;
                        }
                        if (iArr[0] == 2) {
                            z10 = false;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            i8 = 0;
                        }
                        u21Var3 = this.P;
                        boolean z110 = !u21Var3.h();
                        char c2 = '\b';
                        boolean z111 = zArr[0];
                        boolean z112 = zArr[1];
                        i19 = this.o;
                        int[] iArr7 = this.C;
                        if (i19 != 2) {
                            r4 = i5;
                            iArr2 = iArr;
                            u21Var4 = u21Var;
                            ge7Var = ge7VarK;
                            ge7Var2 = ge7VarK2;
                            ge7Var3 = ge7VarK5;
                            z11 = z3;
                            r3 = i6;
                            i20 = i17;
                        } else {
                            r4 = i5;
                            iArr2 = iArr;
                            u21Var4 = u21Var;
                            ge7Var = ge7VarK;
                            ge7Var2 = ge7VarK2;
                            ge7Var3 = ge7VarK5;
                            z11 = z3;
                            r3 = i6;
                            i20 = i17;
                        }
                        if (z) {
                            ge7Var4 = r33;
                            ge7Var5 = ge7VarK4;
                            ge7Var6 = ge7Var3;
                            i21 = 0;
                            i22 = 8;
                            z12 = true;
                            i23 = 1;
                        } else {
                            ge7Var4 = r33;
                            ge7Var5 = ge7VarK4;
                            ge7Var6 = ge7Var3;
                            i21 = 0;
                            i22 = 8;
                            z12 = true;
                            i23 = 1;
                        }
                        if (this.p == 2) {
                            i23 = i21;
                        }
                        if (i23 != 0) {
                            ge7Var7 = ge7Var4;
                        } else {
                            ge7Var7 = ge7Var4;
                        }
                        if (z7) {
                            i24 = this.A;
                            f2 = this.B;
                            if (i24 == 1) {
                                zt ztVarL5 = ka4Var2.l();
                                ztVarL5.d.g(ge7Var5, -1.0f);
                                ztVarL5.d.g(ge7Var7, 1.0f);
                                ztVarL5.d.g(ge7Var2, f2);
                                ztVarL5.d.g(ge7Var, -f2);
                                ka4Var2.c(ztVarL5);
                            } else {
                                zt ztVarL6 = ka4Var2.l();
                                ztVarL6.d.g(ge7Var2, -1.0f);
                                ztVarL6.d.g(ge7Var, 1.0f);
                                ztVarL6.d.g(ge7Var5, f2);
                                ztVarL6.d.g(ge7Var7, -f2);
                                ka4Var2.c(ztVarL6);
                            }
                        }
                        if (u21Var3.h()) {
                            m31 m31Var2 = u21Var3.f.d;
                            float radians2 = (float) Math.toRadians(this.D + 90.0f);
                            int iE2 = u21Var3.e();
                            ge7 ge7VarK18 = ka4Var2.k(i(2));
                            ge7 ge7VarK19 = ka4Var2.k(i(3));
                            ge7 ge7VarK110 = ka4Var2.k(i(4));
                            ge7 ge7VarK111 = ka4Var2.k(i(5));
                            ge7 ge7VarK112 = ka4Var2.k(m31Var2.i(2));
                            ge7 ge7VarK113 = ka4Var2.k(m31Var2.i(3));
                            ge7 ge7VarK114 = ka4Var2.k(m31Var2.i(4));
                            ge7 ge7VarK115 = ka4Var2.k(m31Var2.i(5));
                            zt ztVarL7 = ka4Var2.l();
                            double d3 = radians2;
                            double dSin2 = Math.sin(d3);
                            double d4 = iE2;
                            ztVarL7.d.g(ge7VarK113, 0.5f);
                            ztVarL7.d.g(ge7VarK115, 0.5f);
                            ztVarL7.d.g(ge7VarK19, -0.5f);
                            ztVarL7.d.g(ge7VarK111, -0.5f);
                            ztVarL7.b = -((float) (dSin2 * d4));
                            ka4Var2.c(ztVarL7);
                            zt ztVarL8 = ka4Var2.l();
                            float fCos2 = (float) (Math.cos(d3) * d4);
                            ztVarL8.d.g(ge7VarK112, 0.5f);
                            ztVarL8.d.g(ge7VarK114, 0.5f);
                            ztVarL8.d.g(ge7VarK18, -0.5f);
                            ztVarL8.d.g(ge7VarK110, -0.5f);
                            ztVarL8.b = -fCos2;
                            ka4Var2.c(ztVarL8);
                        }
                        this.k = false;
                        this.l = false;
                    }
                    if (i31 == -1) {
                        if (z5 && !z6) {
                            this.A = 0;
                            i31 = 0;
                        } else if (!z5 && z6) {
                            this.A = 1;
                            if (i31 == -1) {
                                this.B = 1.0f / f;
                            }
                            i31 = 1;
                        }
                    }
                    if (i31 == 0 && (!u21Var7.h() || !u21Var2.h())) {
                        this.A = 1;
                    } else if (this.A == 1 && (!u21Var5.h() || !u21Var6.h())) {
                        this.A = 0;
                    }
                    if (this.A == -1 && (!u21Var7.h() || !u21Var2.h() || !u21Var5.h() || !u21Var6.h())) {
                        if (u21Var7.h() && u21Var2.h()) {
                            this.A = 0;
                        } else if (u21Var5.h() && u21Var6.h()) {
                            this.B = 1.0f / this.B;
                            this.A = 1;
                        }
                    }
                    int i42 = this.A;
                    if (i42 == -1) {
                        int i43 = this.u;
                        if (i43 > 0 && this.x == 0) {
                            this.A = 0;
                            i42 = 0;
                        } else if (i43 == 0 && this.x > 0) {
                            this.B = 1.0f / this.B;
                            this.A = 1;
                            i42 = 1;
                        }
                    }
                    i31 = i42;
                    i16 = i11;
                    z7 = true;
                    i18 = i25;
                    int[] iArr8 = this.t;
                    iArr8[0] = i17;
                    iArr8[1] = i18;
                    if (z7) {
                        z8 = false;
                    } else {
                        z8 = false;
                    }
                    if (z7) {
                        z9 = false;
                    } else {
                        z9 = false;
                    }
                    if (iArr[0] == 2) {
                        z10 = false;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        i8 = 0;
                    }
                    u21Var3 = this.P;
                    boolean z113 = !u21Var3.h();
                    char c3 = '\b';
                    boolean z114 = zArr[0];
                    boolean z115 = zArr[1];
                    i19 = this.o;
                    int[] iArr9 = this.C;
                    if (i19 != 2) {
                        r4 = i5;
                        iArr2 = iArr;
                        u21Var4 = u21Var;
                        ge7Var = ge7VarK;
                        ge7Var2 = ge7VarK2;
                        ge7Var3 = ge7VarK5;
                        z11 = z3;
                        r3 = i6;
                        i20 = i17;
                    } else {
                        r4 = i5;
                        iArr2 = iArr;
                        u21Var4 = u21Var;
                        ge7Var = ge7VarK;
                        ge7Var2 = ge7VarK2;
                        ge7Var3 = ge7VarK5;
                        z11 = z3;
                        r3 = i6;
                        i20 = i17;
                    }
                    if (z) {
                        ge7Var4 = r33;
                        ge7Var5 = ge7VarK4;
                        ge7Var6 = ge7Var3;
                        i21 = 0;
                        i22 = 8;
                        z12 = true;
                        i23 = 1;
                    } else {
                        ge7Var4 = r33;
                        ge7Var5 = ge7VarK4;
                        ge7Var6 = ge7Var3;
                        i21 = 0;
                        i22 = 8;
                        z12 = true;
                        i23 = 1;
                    }
                    if (this.p == 2) {
                        i23 = i21;
                    }
                    if (i23 != 0) {
                        ge7Var7 = ge7Var4;
                    } else {
                        ge7Var7 = ge7Var4;
                    }
                    if (z7) {
                        i24 = this.A;
                        f2 = this.B;
                        if (i24 == 1) {
                            zt ztVarL9 = ka4Var2.l();
                            ztVarL9.d.g(ge7Var5, -1.0f);
                            ztVarL9.d.g(ge7Var7, 1.0f);
                            ztVarL9.d.g(ge7Var2, f2);
                            ztVarL9.d.g(ge7Var, -f2);
                            ka4Var2.c(ztVarL9);
                        } else {
                            zt ztVarL10 = ka4Var2.l();
                            ztVarL10.d.g(ge7Var2, -1.0f);
                            ztVarL10.d.g(ge7Var, 1.0f);
                            ztVarL10.d.g(ge7Var5, f2);
                            ztVarL10.d.g(ge7Var7, -f2);
                            ka4Var2.c(ztVarL10);
                        }
                    }
                    if (u21Var3.h()) {
                        m31 m31Var3 = u21Var3.f.d;
                        float radians3 = (float) Math.toRadians(this.D + 90.0f);
                        int iE3 = u21Var3.e();
                        ge7 ge7VarK116 = ka4Var2.k(i(2));
                        ge7 ge7VarK117 = ka4Var2.k(i(3));
                        ge7 ge7VarK118 = ka4Var2.k(i(4));
                        ge7 ge7VarK119 = ka4Var2.k(i(5));
                        ge7 ge7VarK1110 = ka4Var2.k(m31Var3.i(2));
                        ge7 ge7VarK1111 = ka4Var2.k(m31Var3.i(3));
                        ge7 ge7VarK1112 = ka4Var2.k(m31Var3.i(4));
                        ge7 ge7VarK1113 = ka4Var2.k(m31Var3.i(5));
                        zt ztVarL11 = ka4Var2.l();
                        double d5 = radians3;
                        double dSin3 = Math.sin(d5);
                        double d6 = iE3;
                        ztVarL11.d.g(ge7VarK1111, 0.5f);
                        ztVarL11.d.g(ge7VarK1113, 0.5f);
                        ztVarL11.d.g(ge7VarK117, -0.5f);
                        ztVarL11.d.g(ge7VarK119, -0.5f);
                        ztVarL11.b = -((float) (dSin3 * d6));
                        ka4Var2.c(ztVarL11);
                        zt ztVarL12 = ka4Var2.l();
                        float fCos3 = (float) (Math.cos(d5) * d6);
                        ztVarL12.d.g(ge7VarK1110, 0.5f);
                        ztVarL12.d.g(ge7VarK1112, 0.5f);
                        ztVarL12.d.g(ge7VarK116, -0.5f);
                        ztVarL12.d.g(ge7VarK118, -0.5f);
                        ztVarL12.b = -fCos3;
                        ka4Var2.c(ztVarL12);
                    }
                    this.k = false;
                    this.l = false;
                }
                z7 = false;
                int[] iArr10 = this.t;
                iArr10[0] = i17;
                iArr10[1] = i18;
                if (z7) {
                    z8 = false;
                } else {
                    z8 = false;
                }
                if (z7) {
                    z9 = false;
                } else {
                    z9 = false;
                }
                if (iArr[0] == 2) {
                    z10 = false;
                } else {
                    z10 = false;
                }
                if (z10) {
                    i8 = 0;
                }
                u21Var3 = this.P;
                boolean z116 = !u21Var3.h();
                char c4 = '\b';
                boolean z117 = zArr[0];
                boolean z118 = zArr[1];
                i19 = this.o;
                int[] iArr11 = this.C;
                if (i19 != 2) {
                    r4 = i5;
                    iArr2 = iArr;
                    u21Var4 = u21Var;
                    ge7Var = ge7VarK;
                    ge7Var2 = ge7VarK2;
                    ge7Var3 = ge7VarK5;
                    z11 = z3;
                    r3 = i6;
                    i20 = i17;
                } else {
                    r4 = i5;
                    iArr2 = iArr;
                    u21Var4 = u21Var;
                    ge7Var = ge7VarK;
                    ge7Var2 = ge7VarK2;
                    ge7Var3 = ge7VarK5;
                    z11 = z3;
                    r3 = i6;
                    i20 = i17;
                }
                if (z) {
                    ge7Var4 = r33;
                    ge7Var5 = ge7VarK4;
                    ge7Var6 = ge7Var3;
                    i21 = 0;
                    i22 = 8;
                    z12 = true;
                    i23 = 1;
                } else {
                    ge7Var4 = r33;
                    ge7Var5 = ge7VarK4;
                    ge7Var6 = ge7Var3;
                    i21 = 0;
                    i22 = 8;
                    z12 = true;
                    i23 = 1;
                }
                if (this.p == 2) {
                    i23 = i21;
                }
                if (i23 != 0) {
                    ge7Var7 = ge7Var4;
                } else {
                    ge7Var7 = ge7Var4;
                }
                if (z7) {
                    i24 = this.A;
                    f2 = this.B;
                    if (i24 == 1) {
                        zt ztVarL13 = ka4Var2.l();
                        ztVarL13.d.g(ge7Var5, -1.0f);
                        ztVarL13.d.g(ge7Var7, 1.0f);
                        ztVarL13.d.g(ge7Var2, f2);
                        ztVarL13.d.g(ge7Var, -f2);
                        ka4Var2.c(ztVarL13);
                    } else {
                        zt ztVarL14 = ka4Var2.l();
                        ztVarL14.d.g(ge7Var2, -1.0f);
                        ztVarL14.d.g(ge7Var, 1.0f);
                        ztVarL14.d.g(ge7Var5, f2);
                        ztVarL14.d.g(ge7Var7, -f2);
                        ka4Var2.c(ztVarL14);
                    }
                }
                if (u21Var3.h()) {
                    m31 m31Var4 = u21Var3.f.d;
                    float radians4 = (float) Math.toRadians(this.D + 90.0f);
                    int iE4 = u21Var3.e();
                    ge7 ge7VarK1114 = ka4Var2.k(i(2));
                    ge7 ge7VarK1115 = ka4Var2.k(i(3));
                    ge7 ge7VarK1116 = ka4Var2.k(i(4));
                    ge7 ge7VarK1117 = ka4Var2.k(i(5));
                    ge7 ge7VarK1118 = ka4Var2.k(m31Var4.i(2));
                    ge7 ge7VarK1119 = ka4Var2.k(m31Var4.i(3));
                    ge7 ge7VarK11110 = ka4Var2.k(m31Var4.i(4));
                    ge7 ge7VarK11111 = ka4Var2.k(m31Var4.i(5));
                    zt ztVarL15 = ka4Var2.l();
                    double d7 = radians4;
                    double dSin4 = Math.sin(d7);
                    double d8 = iE4;
                    ztVarL15.d.g(ge7VarK1119, 0.5f);
                    ztVarL15.d.g(ge7VarK11111, 0.5f);
                    ztVarL15.d.g(ge7VarK1115, -0.5f);
                    ztVarL15.d.g(ge7VarK1117, -0.5f);
                    ztVarL15.b = -((float) (dSin4 * d8));
                    ka4Var2.c(ztVarL15);
                    zt ztVarL16 = ka4Var2.l();
                    float fCos4 = (float) (Math.cos(d7) * d8);
                    ztVarL16.d.g(ge7VarK1118, 0.5f);
                    ztVarL16.d.g(ge7VarK11110, 0.5f);
                    ztVarL16.d.g(ge7VarK1114, -0.5f);
                    ztVarL16.d.g(ge7VarK1116, -0.5f);
                    ztVarL16.b = -fCos4;
                    ka4Var2.c(ztVarL16);
                }
                this.k = false;
                this.l = false;
            }
            u21Var2 = u21Var8;
            ge7VarK4 = ge7VarK4;
            i16 = i11;
            i17 = i14;
            i18 = i15;
            z7 = false;
            int[] iArr12 = this.t;
            iArr12[0] = i17;
            iArr12[1] = i18;
            if (z7) {
                z8 = false;
            } else {
                z8 = false;
            }
            if (z7) {
                z9 = false;
            } else {
                z9 = false;
            }
            if (iArr[0] == 2) {
                z10 = false;
            } else {
                z10 = false;
            }
            if (z10) {
                i8 = 0;
            }
            u21Var3 = this.P;
            boolean z119 = !u21Var3.h();
            char c5 = '\b';
            boolean z1110 = zArr[0];
            boolean z1111 = zArr[1];
            i19 = this.o;
            int[] iArr13 = this.C;
            if (i19 != 2) {
                r4 = i5;
                iArr2 = iArr;
                u21Var4 = u21Var;
                ge7Var = ge7VarK;
                ge7Var2 = ge7VarK2;
                ge7Var3 = ge7VarK5;
                z11 = z3;
                r3 = i6;
                i20 = i17;
            } else {
                r4 = i5;
                iArr2 = iArr;
                u21Var4 = u21Var;
                ge7Var = ge7VarK;
                ge7Var2 = ge7VarK2;
                ge7Var3 = ge7VarK5;
                z11 = z3;
                r3 = i6;
                i20 = i17;
            }
            if (z) {
                ge7Var4 = r33;
                ge7Var5 = ge7VarK4;
                ge7Var6 = ge7Var3;
                i21 = 0;
                i22 = 8;
                z12 = true;
                i23 = 1;
            } else {
                ge7Var4 = r33;
                ge7Var5 = ge7VarK4;
                ge7Var6 = ge7Var3;
                i21 = 0;
                i22 = 8;
                z12 = true;
                i23 = 1;
            }
            if (this.p == 2) {
                i23 = i21;
            }
            if (i23 != 0) {
                ge7Var7 = ge7Var4;
            } else {
                ge7Var7 = ge7Var4;
            }
            if (z7) {
                i24 = this.A;
                f2 = this.B;
                if (i24 == 1) {
                    zt ztVarL17 = ka4Var2.l();
                    ztVarL17.d.g(ge7Var5, -1.0f);
                    ztVarL17.d.g(ge7Var7, 1.0f);
                    ztVarL17.d.g(ge7Var2, f2);
                    ztVarL17.d.g(ge7Var, -f2);
                    ka4Var2.c(ztVarL17);
                } else {
                    zt ztVarL18 = ka4Var2.l();
                    ztVarL18.d.g(ge7Var2, -1.0f);
                    ztVarL18.d.g(ge7Var, 1.0f);
                    ztVarL18.d.g(ge7Var5, f2);
                    ztVarL18.d.g(ge7Var7, -f2);
                    ka4Var2.c(ztVarL18);
                }
            }
            if (u21Var3.h()) {
                m31 m31Var5 = u21Var3.f.d;
                float radians5 = (float) Math.toRadians(this.D + 90.0f);
                int iE5 = u21Var3.e();
                ge7 ge7VarK11112 = ka4Var2.k(i(2));
                ge7 ge7VarK11113 = ka4Var2.k(i(3));
                ge7 ge7VarK11114 = ka4Var2.k(i(4));
                ge7 ge7VarK11115 = ka4Var2.k(i(5));
                ge7 ge7VarK11116 = ka4Var2.k(m31Var5.i(2));
                ge7 ge7VarK11117 = ka4Var2.k(m31Var5.i(3));
                ge7 ge7VarK11118 = ka4Var2.k(m31Var5.i(4));
                ge7 ge7VarK11119 = ka4Var2.k(m31Var5.i(5));
                zt ztVarL19 = ka4Var2.l();
                double d9 = radians5;
                double dSin5 = Math.sin(d9);
                double d10 = iE5;
                ztVarL19.d.g(ge7VarK11117, 0.5f);
                ztVarL19.d.g(ge7VarK11119, 0.5f);
                ztVarL19.d.g(ge7VarK11113, -0.5f);
                ztVarL19.d.g(ge7VarK11115, -0.5f);
                ztVarL19.b = -((float) (dSin5 * d10));
                ka4Var2.c(ztVarL19);
                zt ztVarL110 = ka4Var2.l();
                float fCos5 = (float) (Math.cos(d9) * d10);
                ztVarL110.d.g(ge7VarK11116, 0.5f);
                ztVarL110.d.g(ge7VarK11118, 0.5f);
                ztVarL110.d.g(ge7VarK11112, -0.5f);
                ztVarL110.d.g(ge7VarK11114, -0.5f);
                ztVarL110.b = -fCos5;
                ka4Var2.c(ztVarL110);
            }
            this.k = false;
            this.l = false;
        }
        i = 0;
        i2 = i;
        i3 = i2;
        i4 = this.g0;
        zArr = this.S;
        i5 = i2;
        if (i4 == 8) {
            arrayList = this.R;
            size = arrayList.size();
            i6 = i3;
            i27 = i;
            while (true) {
                if (i27 < size) {
                    if (!zArr[i]) {
                        break;
                    } else {
                        return;
                    }
                }
                int i310 = size;
                hashSet2 = ((u21) arrayList.get(i27)).a;
                if (hashSet2 != null) {
                    break;
                    break;
                }
                i27++;
                size = i310;
            }
        } else {
            i6 = i3;
        }
        z2 = this.k;
        if (z2) {
            if (z2) {
                ka4Var2.d(ge7VarK, this.Y);
                ka4Var2.d(ge7VarK2, this.Y + this.U);
                if (i6 != 0) {
                    weakReference3 = n31Var2.H0;
                    if (weakReference3 != null) {
                        n31Var2.H0 = new WeakReference(u21Var5);
                    } else {
                        n31Var2.H0 = new WeakReference(u21Var5);
                    }
                    weakReference4 = n31Var2.J0;
                    if (weakReference4 != null) {
                        n31Var2.J0 = new WeakReference(u21Var6);
                    } else {
                        n31Var2.J0 = new WeakReference(u21Var6);
                    }
                }
            }
            if (this.l) {
                ka4Var2.d(ge7VarK3, this.Z);
                ka4Var2.d(ge7VarK4, this.Z + this.V);
                hashSet = u21Var9.a;
                if (hashSet != null) {
                    ka4Var2.d(ge7VarK5, this.Z + this.a0);
                }
                if (i5 != 0) {
                    weakReference = n31Var.G0;
                    if (weakReference != null) {
                        n31Var.G0 = new WeakReference(u21Var7);
                    } else {
                        n31Var.G0 = new WeakReference(u21Var7);
                    }
                    weakReference2 = n31Var.I0;
                    if (weakReference2 != null) {
                        n31Var.I0 = new WeakReference(u21Var8);
                    } else {
                        n31Var.I0 = new WeakReference(u21Var8);
                    }
                }
            }
            if (this.k) {
                ?? r13 = i;
                this.k = r13;
                this.l = r13;
                return;
            }
        } else {
            if (z2) {
                ka4Var2.d(ge7VarK, this.Y);
                ka4Var2.d(ge7VarK2, this.Y + this.U);
                if (i6 != 0) {
                    weakReference3 = n31Var2.H0;
                    if (weakReference3 != null) {
                        n31Var2.H0 = new WeakReference(u21Var5);
                    } else {
                        n31Var2.H0 = new WeakReference(u21Var5);
                    }
                    weakReference4 = n31Var2.J0;
                    if (weakReference4 != null) {
                        n31Var2.J0 = new WeakReference(u21Var6);
                    } else {
                        n31Var2.J0 = new WeakReference(u21Var6);
                    }
                }
            }
            if (this.l) {
                ka4Var2.d(ge7VarK3, this.Z);
                ka4Var2.d(ge7VarK4, this.Z + this.V);
                hashSet = u21Var9.a;
                if (hashSet != null) {
                    ka4Var2.d(ge7VarK5, this.Z + this.a0);
                }
                if (i5 != 0) {
                    weakReference = n31Var.G0;
                    if (weakReference != null) {
                        n31Var.G0 = new WeakReference(u21Var7);
                    } else {
                        n31Var.G0 = new WeakReference(u21Var7);
                    }
                    weakReference2 = n31Var.I0;
                    if (weakReference2 != null) {
                        n31Var.I0 = new WeakReference(u21Var8);
                    } else {
                        n31Var.I0 = new WeakReference(u21Var8);
                    }
                }
            }
            if (this.k) {
                ?? r14 = i;
                this.k = r14;
                this.l = r14;
                return;
            }
        }
        zArr2 = this.f;
        if (z) {
            u21Var = u21Var9;
            zArr3 = zArr2;
        } else {
            u21Var = u21Var9;
            zArr3 = zArr2;
        }
        if (this.T != null) {
            if (w(0)) {
                this.T.R(this, 0);
                zX = true;
                i26 = 1;
            } else {
                zX = x();
                i26 = 1;
            }
            if (w(i26)) {
                this.T.R(this, i26);
                zY = true;
            } else {
                zY = y();
            }
            if (zX) {
            }
            if (!zY) {
                ka4Var2.f(ka4Var2.k(this.T.L), ge7VarK4, 0, 1);
            }
            z4 = zY;
            z3 = zX;
        } else {
            u21Var5 = u21Var5;
            z3 = false;
            z4 = false;
        }
        i7 = this.U;
        i8 = this.b0;
        if (i7 >= i8) {
            i8 = i7;
        }
        i9 = this.V;
        i10 = this.c0;
        if (i9 < i10) {
            i11 = i10;
        } else {
            i11 = i9;
        }
        iArr = this.p0;
        i12 = iArr[0];
        if (i12 != 3) {
            z5 = true;
        } else {
            z5 = false;
        }
        i13 = iArr[1];
        if (i13 != 3) {
            z6 = true;
        } else {
            z6 = false;
        }
        int i311 = this.X;
        this.A = i311;
        float f6 = this.W;
        this.B = f6;
        f = f6;
        i14 = this.r;
        i15 = this.s;
        if (f > 0.0f) {
            u21Var2 = u21Var8;
            if (this.g0 != 8) {
                if (i12 == 3) {
                    i17 = i14;
                } else {
                    i17 = i14;
                }
                if (i13 == 3) {
                    i25 = i15;
                } else {
                    i25 = i15;
                }
                if (i12 == 3) {
                    if (i12 != 3) {
                        if (i13 != 3) {
                            i16 = i11;
                        } else {
                            i16 = i11;
                        }
                        z7 = true;
                    } else {
                        if (i13 != 3) {
                            i16 = i11;
                        } else {
                            i16 = i11;
                        }
                        z7 = true;
                    }
                } else if (i12 != 3) {
                    if (i13 != 3) {
                        i16 = i11;
                    } else {
                        i16 = i11;
                    }
                    z7 = true;
                } else {
                    if (i13 != 3) {
                        i16 = i11;
                    } else {
                        i16 = i11;
                    }
                    z7 = true;
                }
                i18 = i25;
                int[] iArr14 = this.t;
                iArr14[0] = i17;
                iArr14[1] = i18;
                if (z7) {
                    z8 = false;
                } else {
                    z8 = false;
                }
                if (z7) {
                    z9 = false;
                } else {
                    z9 = false;
                }
                if (iArr[0] == 2) {
                    z10 = false;
                } else {
                    z10 = false;
                }
                if (z10) {
                    i8 = 0;
                }
                u21Var3 = this.P;
                boolean z1112 = !u21Var3.h();
                char c6 = '\b';
                boolean z1113 = zArr[0];
                boolean z1114 = zArr[1];
                i19 = this.o;
                int[] iArr15 = this.C;
                if (i19 != 2) {
                    r4 = i5;
                    iArr2 = iArr;
                    u21Var4 = u21Var;
                    ge7Var = ge7VarK;
                    ge7Var2 = ge7VarK2;
                    ge7Var3 = ge7VarK5;
                    z11 = z3;
                    r3 = i6;
                    i20 = i17;
                } else {
                    r4 = i5;
                    iArr2 = iArr;
                    u21Var4 = u21Var;
                    ge7Var = ge7VarK;
                    ge7Var2 = ge7VarK2;
                    ge7Var3 = ge7VarK5;
                    z11 = z3;
                    r3 = i6;
                    i20 = i17;
                }
                if (z) {
                    ge7Var4 = r33;
                    ge7Var5 = ge7VarK4;
                    ge7Var6 = ge7Var3;
                    i21 = 0;
                    i22 = 8;
                    z12 = true;
                    i23 = 1;
                } else {
                    ge7Var4 = r33;
                    ge7Var5 = ge7VarK4;
                    ge7Var6 = ge7Var3;
                    i21 = 0;
                    i22 = 8;
                    z12 = true;
                    i23 = 1;
                }
                if (this.p == 2) {
                    i23 = i21;
                }
                if (i23 != 0) {
                    ge7Var7 = ge7Var4;
                } else {
                    ge7Var7 = ge7Var4;
                }
                if (z7) {
                    i24 = this.A;
                    f2 = this.B;
                    if (i24 == 1) {
                        zt ztVarL111 = ka4Var2.l();
                        ztVarL111.d.g(ge7Var5, -1.0f);
                        ztVarL111.d.g(ge7Var7, 1.0f);
                        ztVarL111.d.g(ge7Var2, f2);
                        ztVarL111.d.g(ge7Var, -f2);
                        ka4Var2.c(ztVarL111);
                    } else {
                        zt ztVarL112 = ka4Var2.l();
                        ztVarL112.d.g(ge7Var2, -1.0f);
                        ztVarL112.d.g(ge7Var, 1.0f);
                        ztVarL112.d.g(ge7Var5, f2);
                        ztVarL112.d.g(ge7Var7, -f2);
                        ka4Var2.c(ztVarL112);
                    }
                }
                if (u21Var3.h()) {
                    m31 m31Var6 = u21Var3.f.d;
                    float radians6 = (float) Math.toRadians(this.D + 90.0f);
                    int iE6 = u21Var3.e();
                    ge7 ge7VarK111110 = ka4Var2.k(i(2));
                    ge7 ge7VarK111111 = ka4Var2.k(i(3));
                    ge7 ge7VarK111112 = ka4Var2.k(i(4));
                    ge7 ge7VarK111113 = ka4Var2.k(i(5));
                    ge7 ge7VarK111114 = ka4Var2.k(m31Var6.i(2));
                    ge7 ge7VarK111115 = ka4Var2.k(m31Var6.i(3));
                    ge7 ge7VarK111116 = ka4Var2.k(m31Var6.i(4));
                    ge7 ge7VarK111117 = ka4Var2.k(m31Var6.i(5));
                    zt ztVarL113 = ka4Var2.l();
                    double d11 = radians6;
                    double dSin6 = Math.sin(d11);
                    double d12 = iE6;
                    ztVarL113.d.g(ge7VarK111115, 0.5f);
                    ztVarL113.d.g(ge7VarK111117, 0.5f);
                    ztVarL113.d.g(ge7VarK111111, -0.5f);
                    ztVarL113.d.g(ge7VarK111113, -0.5f);
                    ztVarL113.b = -((float) (dSin6 * d12));
                    ka4Var2.c(ztVarL113);
                    zt ztVarL114 = ka4Var2.l();
                    float fCos6 = (float) (Math.cos(d11) * d12);
                    ztVarL114.d.g(ge7VarK111114, 0.5f);
                    ztVarL114.d.g(ge7VarK111116, 0.5f);
                    ztVarL114.d.g(ge7VarK111110, -0.5f);
                    ztVarL114.d.g(ge7VarK111112, -0.5f);
                    ztVarL114.b = -fCos6;
                    ka4Var2.c(ztVarL114);
                }
                this.k = false;
                this.l = false;
            }
            z7 = false;
            int[] iArr16 = this.t;
            iArr16[0] = i17;
            iArr16[1] = i18;
            if (z7) {
                z8 = false;
            } else {
                z8 = false;
            }
            if (z7) {
                z9 = false;
            } else {
                z9 = false;
            }
            if (iArr[0] == 2) {
                z10 = false;
            } else {
                z10 = false;
            }
            if (z10) {
                i8 = 0;
            }
            u21Var3 = this.P;
            boolean z1115 = !u21Var3.h();
            char c7 = '\b';
            boolean z1116 = zArr[0];
            boolean z1117 = zArr[1];
            i19 = this.o;
            int[] iArr17 = this.C;
            if (i19 != 2) {
                r4 = i5;
                iArr2 = iArr;
                u21Var4 = u21Var;
                ge7Var = ge7VarK;
                ge7Var2 = ge7VarK2;
                ge7Var3 = ge7VarK5;
                z11 = z3;
                r3 = i6;
                i20 = i17;
            } else {
                r4 = i5;
                iArr2 = iArr;
                u21Var4 = u21Var;
                ge7Var = ge7VarK;
                ge7Var2 = ge7VarK2;
                ge7Var3 = ge7VarK5;
                z11 = z3;
                r3 = i6;
                i20 = i17;
            }
            if (z) {
                ge7Var4 = r33;
                ge7Var5 = ge7VarK4;
                ge7Var6 = ge7Var3;
                i21 = 0;
                i22 = 8;
                z12 = true;
                i23 = 1;
            } else {
                ge7Var4 = r33;
                ge7Var5 = ge7VarK4;
                ge7Var6 = ge7Var3;
                i21 = 0;
                i22 = 8;
                z12 = true;
                i23 = 1;
            }
            if (this.p == 2) {
                i23 = i21;
            }
            if (i23 != 0) {
                ge7Var7 = ge7Var4;
            } else {
                ge7Var7 = ge7Var4;
            }
            if (z7) {
                i24 = this.A;
                f2 = this.B;
                if (i24 == 1) {
                    zt ztVarL115 = ka4Var2.l();
                    ztVarL115.d.g(ge7Var5, -1.0f);
                    ztVarL115.d.g(ge7Var7, 1.0f);
                    ztVarL115.d.g(ge7Var2, f2);
                    ztVarL115.d.g(ge7Var, -f2);
                    ka4Var2.c(ztVarL115);
                } else {
                    zt ztVarL116 = ka4Var2.l();
                    ztVarL116.d.g(ge7Var2, -1.0f);
                    ztVarL116.d.g(ge7Var, 1.0f);
                    ztVarL116.d.g(ge7Var5, f2);
                    ztVarL116.d.g(ge7Var7, -f2);
                    ka4Var2.c(ztVarL116);
                }
            }
            if (u21Var3.h()) {
                m31 m31Var7 = u21Var3.f.d;
                float radians7 = (float) Math.toRadians(this.D + 90.0f);
                int iE7 = u21Var3.e();
                ge7 ge7VarK111118 = ka4Var2.k(i(2));
                ge7 ge7VarK111119 = ka4Var2.k(i(3));
                ge7 ge7VarK1111110 = ka4Var2.k(i(4));
                ge7 ge7VarK1111111 = ka4Var2.k(i(5));
                ge7 ge7VarK1111112 = ka4Var2.k(m31Var7.i(2));
                ge7 ge7VarK1111113 = ka4Var2.k(m31Var7.i(3));
                ge7 ge7VarK1111114 = ka4Var2.k(m31Var7.i(4));
                ge7 ge7VarK1111115 = ka4Var2.k(m31Var7.i(5));
                zt ztVarL117 = ka4Var2.l();
                double d13 = radians7;
                double dSin7 = Math.sin(d13);
                double d14 = iE7;
                ztVarL117.d.g(ge7VarK1111113, 0.5f);
                ztVarL117.d.g(ge7VarK1111115, 0.5f);
                ztVarL117.d.g(ge7VarK111119, -0.5f);
                ztVarL117.d.g(ge7VarK1111111, -0.5f);
                ztVarL117.b = -((float) (dSin7 * d14));
                ka4Var2.c(ztVarL117);
                zt ztVarL118 = ka4Var2.l();
                float fCos7 = (float) (Math.cos(d13) * d14);
                ztVarL118.d.g(ge7VarK1111112, 0.5f);
                ztVarL118.d.g(ge7VarK1111114, 0.5f);
                ztVarL118.d.g(ge7VarK111118, -0.5f);
                ztVarL118.d.g(ge7VarK1111110, -0.5f);
                ztVarL118.b = -fCos7;
                ka4Var2.c(ztVarL118);
            }
            this.k = false;
            this.l = false;
        }
        u21Var2 = u21Var8;
        ge7VarK4 = ge7VarK4;
        i16 = i11;
        i17 = i14;
        i18 = i15;
        z7 = false;
        int[] iArr18 = this.t;
        iArr18[0] = i17;
        iArr18[1] = i18;
        if (z7) {
            z8 = false;
        } else {
            z8 = false;
        }
        if (z7) {
            z9 = false;
        } else {
            z9 = false;
        }
        if (iArr[0] == 2) {
            z10 = false;
        } else {
            z10 = false;
        }
        if (z10) {
            i8 = 0;
        }
        u21Var3 = this.P;
        boolean z1118 = !u21Var3.h();
        char c8 = '\b';
        boolean z1119 = zArr[0];
        boolean z11110 = zArr[1];
        i19 = this.o;
        int[] iArr19 = this.C;
        if (i19 != 2) {
            r4 = i5;
            iArr2 = iArr;
            u21Var4 = u21Var;
            ge7Var = ge7VarK;
            ge7Var2 = ge7VarK2;
            ge7Var3 = ge7VarK5;
            z11 = z3;
            r3 = i6;
            i20 = i17;
        } else {
            r4 = i5;
            iArr2 = iArr;
            u21Var4 = u21Var;
            ge7Var = ge7VarK;
            ge7Var2 = ge7VarK2;
            ge7Var3 = ge7VarK5;
            z11 = z3;
            r3 = i6;
            i20 = i17;
        }
        if (z) {
            ge7Var4 = r33;
            ge7Var5 = ge7VarK4;
            ge7Var6 = ge7Var3;
            i21 = 0;
            i22 = 8;
            z12 = true;
            i23 = 1;
        } else {
            ge7Var4 = r33;
            ge7Var5 = ge7VarK4;
            ge7Var6 = ge7Var3;
            i21 = 0;
            i22 = 8;
            z12 = true;
            i23 = 1;
        }
        if (this.p == 2) {
            i23 = i21;
        }
        if (i23 != 0) {
            ge7Var7 = ge7Var4;
        } else {
            ge7Var7 = ge7Var4;
        }
        if (z7) {
            i24 = this.A;
            f2 = this.B;
            if (i24 == 1) {
                zt ztVarL119 = ka4Var2.l();
                ztVarL119.d.g(ge7Var5, -1.0f);
                ztVarL119.d.g(ge7Var7, 1.0f);
                ztVarL119.d.g(ge7Var2, f2);
                ztVarL119.d.g(ge7Var, -f2);
                ka4Var2.c(ztVarL119);
            } else {
                zt ztVarL1110 = ka4Var2.l();
                ztVarL1110.d.g(ge7Var2, -1.0f);
                ztVarL1110.d.g(ge7Var, 1.0f);
                ztVarL1110.d.g(ge7Var5, f2);
                ztVarL1110.d.g(ge7Var7, -f2);
                ka4Var2.c(ztVarL1110);
            }
        }
        if (u21Var3.h()) {
            m31 m31Var8 = u21Var3.f.d;
            float radians8 = (float) Math.toRadians(this.D + 90.0f);
            int iE8 = u21Var3.e();
            ge7 ge7VarK1111116 = ka4Var2.k(i(2));
            ge7 ge7VarK1111117 = ka4Var2.k(i(3));
            ge7 ge7VarK1111118 = ka4Var2.k(i(4));
            ge7 ge7VarK1111119 = ka4Var2.k(i(5));
            ge7 ge7VarK11111110 = ka4Var2.k(m31Var8.i(2));
            ge7 ge7VarK11111111 = ka4Var2.k(m31Var8.i(3));
            ge7 ge7VarK11111112 = ka4Var2.k(m31Var8.i(4));
            ge7 ge7VarK11111113 = ka4Var2.k(m31Var8.i(5));
            zt ztVarL1111 = ka4Var2.l();
            double d15 = radians8;
            double dSin8 = Math.sin(d15);
            double d16 = iE8;
            ztVarL1111.d.g(ge7VarK11111111, 0.5f);
            ztVarL1111.d.g(ge7VarK11111113, 0.5f);
            ztVarL1111.d.g(ge7VarK1111117, -0.5f);
            ztVarL1111.d.g(ge7VarK1111119, -0.5f);
            ztVarL1111.b = -((float) (dSin8 * d16));
            ka4Var2.c(ztVarL1111);
            zt ztVarL1112 = ka4Var2.l();
            float fCos8 = (float) (Math.cos(d15) * d16);
            ztVarL1112.d.g(ge7VarK11111110, 0.5f);
            ztVarL1112.d.g(ge7VarK11111112, 0.5f);
            ztVarL1112.d.g(ge7VarK1111116, -0.5f);
            ztVarL1112.d.g(ge7VarK1111118, -0.5f);
            ztVarL1112.b = -fCos8;
            ka4Var2.c(ztVarL1112);
        }
        this.k = false;
        this.l = false;
    }

    public boolean c() {
        return this.g0 != 8;
    }

    /* JADX WARN: Code duplicated, block: B:220:0x03c5  */
    /* JADX WARN: Code duplicated, block: B:222:0x03c9  */
    /* JADX WARN: Code duplicated, block: B:229:0x03dd  */
    /* JADX WARN: Code duplicated, block: B:231:0x0402  */
    /* JADX WARN: Code duplicated, block: B:240:0x041f  */
    /* JADX WARN: Code duplicated, block: B:257:0x0452  */
    /* JADX WARN: Code duplicated, block: B:259:0x0458  */
    /* JADX WARN: Code duplicated, block: B:270:0x046d  */
    /* JADX WARN: Code duplicated, block: B:275:0x0477  */
    /* JADX WARN: Code duplicated, block: B:277:0x047b  */
    /* JADX WARN: Code duplicated, block: B:278:0x047d  */
    /* JADX WARN: Code duplicated, block: B:281:0x0485  */
    /* JADX WARN: Code duplicated, block: B:287:0x0493 A[PHI: r0
  0x0493: PHI (r0v15 int) = (r0v14 int), (r0v19 int), (r0v19 int), (r0v19 int) binds: [B:280:0x0483, B:282:0x0489, B:283:0x048b, B:285:0x048f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:290:0x04a5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:291:0x04a7  */
    /* JADX WARN: Code duplicated, block: B:292:0x04ac  */
    /* JADX WARN: Code duplicated, block: B:294:0x04af  */
    /* JADX WARN: Code duplicated, block: B:303:0x04c6  */
    /* JADX WARN: Code duplicated, block: B:337:0x0521  */
    public final void d(ka4 ka4Var, boolean z, boolean z2, boolean z3, boolean z4, ge7 ge7Var, ge7 ge7Var2, int i, boolean z5, u21 u21Var, u21 u21Var2, int i2, int i3, int i4, int i5, float f, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, int i6, int i7, int i8, int i9, float f2, boolean z11) {
        boolean z12;
        boolean z13;
        int iMin;
        boolean z14;
        int i10;
        int i11;
        boolean z15;
        ge7 ge7VarK;
        ge7 ge7VarK2;
        u21 u21Var3;
        ge7 ge7Var3;
        int i12;
        int i13;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        m31 m31Var;
        boolean z20;
        int iMin2;
        boolean z21;
        int i14;
        int iE;
        int i15;
        int i16;
        HashSet hashSet;
        boolean z22;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        boolean z23;
        boolean z24;
        int i22;
        ka4Var = ka4Var;
        int i23 = i8;
        int i24 = i9;
        ge7 ge7VarK3 = ka4Var.k(u21Var);
        ge7 ge7VarK4 = ka4Var.k(u21Var2);
        ge7 ge7VarK5 = ka4Var.k(u21Var.f);
        ge7 ge7VarK6 = ka4Var.k(u21Var2.f);
        boolean zH = u21Var.h();
        boolean zH2 = u21Var2.h();
        boolean zH3 = this.P.h();
        int i25 = zH2 ? (zH ? 1 : 0) + 1 : zH ? 1 : 0;
        if (zH3) {
            i25++;
        }
        int i26 = i25;
        int i27 = z6 ? 3 : i6;
        int iB = p61.B(i);
        boolean z25 = (iB == 0 || iB == 1 || iB != 2 || i27 == 4) ? false : true;
        int i28 = this.h;
        if (i28 == -1 || !z) {
            i28 = i3;
            z12 = z25;
        } else {
            this.h = -1;
            z12 = false;
        }
        int i29 = this.i;
        if (i29 == -1 || z) {
            z13 = z12;
        } else {
            this.i = -1;
            i28 = i29;
            z13 = false;
        }
        boolean z26 = z13;
        if (this.g0 == 8) {
            z14 = false;
            iMin = 0;
        } else {
            iMin = i28;
            z14 = z26;
        }
        if (z11) {
            if (!zH && !zH2 && !zH3) {
                ka4Var.d(ge7VarK3, i2);
            } else if (zH && !zH2) {
                i10 = 8;
                ka4Var.e(ge7VarK3, ge7VarK5, u21Var.e(), 8);
            }
            i10 = 8;
        } else {
            i10 = 8;
        }
        if (z14 != 0) {
            if (i26 == 2 || z6 || !(i27 == 1 || i27 == 0)) {
                if (i23 == -2) {
                    i23 = iMin;
                }
                if (i24 == -2) {
                    i24 = iMin;
                }
                if (iMin > 0 && i27 != 1) {
                    iMin = 0;
                }
                if (i23 > 0) {
                    ka4Var.f(ge7VarK4, ge7VarK3, i23, 8);
                    iMin = Math.max(iMin, i23);
                }
                if (i24 > 0) {
                    if (!z2 || i27 != 1) {
                        ka4Var.g(ge7VarK4, ge7VarK3, i24, 8);
                    }
                    iMin = Math.min(iMin, i24);
                }
                if (i27 == 1) {
                    if (z2) {
                        ka4Var.e(ge7VarK4, ge7VarK3, iMin, 8);
                    } else if (z8) {
                        ka4Var.e(ge7VarK4, ge7VarK3, iMin, 5);
                        ka4Var.g(ge7VarK4, ge7VarK3, iMin, 8);
                    } else {
                        ka4Var.e(ge7VarK4, ge7VarK3, iMin, 5);
                        ka4Var.g(ge7VarK4, ge7VarK3, iMin, 8);
                    }
                } else if (i27 == 2) {
                    int i30 = u21Var.e;
                    if (i30 == 3 || i30 == 5) {
                        ge7VarK = ka4Var.k(this.T.i(3));
                        ge7VarK2 = ka4Var.k(this.T.i(5));
                    } else {
                        ge7VarK = ka4Var.k(this.T.i(2));
                        ge7VarK2 = ka4Var.k(this.T.i(4));
                    }
                    zt ztVarL = ka4Var.l();
                    int i31 = i23;
                    ztVarL.d.g(ge7VarK4, -1.0f);
                    ztVarL.d.g(ge7VarK3, 1.0f);
                    ztVarL.d.g(ge7VarK2, f2);
                    ztVarL.d.g(ge7VarK, -f2);
                    ka4Var.c(ztVarL);
                    if (z2) {
                        z14 = false;
                    }
                    z15 = z4;
                    i11 = i31;
                } else {
                    i11 = i23;
                    z15 = true;
                }
            } else {
                int iMax = Math.max(i23, iMin);
                if (i24 > 0) {
                    iMax = Math.min(i24, iMax);
                }
                ka4Var.e(ge7VarK4, ge7VarK3, iMax, 8);
                z15 = z4;
                i11 = i23;
                z14 = false;
            }
            if (z11 || z8) {
                boolean z27 = z15;
                if (i26 >= 2 && z2 && z27) {
                    ka4Var.f(ge7VarK3, ge7Var, 0, 8);
                    u21 u21Var4 = this.M;
                    boolean z28 = z || u21Var4.f == null;
                    if (!z && (u21Var3 = u21Var4.f) != null) {
                        m31 m31Var2 = u21Var3.d;
                        if (m31Var2.W != 0.0f) {
                            int[] iArr = m31Var2.p0;
                            if (iArr[0] == 3 && iArr[1] == 3) {
                                z28 = true;
                            } else {
                                z28 = false;
                            }
                        } else {
                            z28 = false;
                        }
                    }
                    if (z28) {
                        ka4Var.f(ge7Var2, ge7VarK4, 0, 8);
                        return;
                    }
                    return;
                }
                return;
            }
            if (zH || zH2 || zH3) {
                if (zH && !zH2) {
                    u21Var2 = u21Var2;
                    ge7VarK4 = ge7VarK4;
                    z15 = z15;
                    ge7Var3 = ge7VarK6;
                    z20 = z2;
                    i22 = (z2 && (u21Var.f.d instanceof f10)) ? 8 : 5;
                } else if (zH || !zH2) {
                    ge7Var3 = ge7VarK6;
                    if (zH && zH2) {
                        m31 m31Var3 = u21Var.f.d;
                        m31 m31Var4 = u21Var2.f.d;
                        z15 = z15;
                        n31 n31Var = this.T;
                        int i32 = 6;
                        if (z14) {
                            if (i27 == 0) {
                                if (i24 != 0 || i11 != 0) {
                                    i20 = 5;
                                    i21 = 5;
                                    z23 = true;
                                    z24 = false;
                                    z17 = true;
                                } else if (ge7VarK5.h0 && ge7Var3.h0) {
                                    ka4Var.e(ge7VarK3, ge7VarK5, u21Var.e(), 8);
                                    ka4Var.e(ge7VarK4, ge7Var3, -u21Var2.e(), 8);
                                    return;
                                } else {
                                    i20 = 8;
                                    i21 = 8;
                                    z23 = false;
                                    z24 = true;
                                    z17 = false;
                                }
                                if ((m31Var3 instanceof f10) || (m31Var4 instanceof f10)) {
                                    ka4Var = ka4Var;
                                    i27 = i27;
                                    ge7VarK3 = ge7VarK3;
                                    ge7VarK4 = ge7VarK4;
                                    z18 = z24;
                                    ge7Var2 = ge7Var2;
                                    i12 = i20;
                                    ge7VarK5 = ge7VarK5;
                                    i32 = 6;
                                    z16 = z23;
                                    i13 = 4;
                                } else {
                                    ka4Var = ka4Var;
                                    ge7VarK3 = ge7VarK3;
                                    ge7VarK4 = ge7VarK4;
                                    z18 = z24;
                                    i12 = i20;
                                    ge7VarK5 = ge7VarK5;
                                    i32 = 6;
                                    z16 = z23;
                                    i13 = i21;
                                    i27 = i27;
                                    ge7Var2 = ge7Var2;
                                }
                            } else {
                                if (i27 == 2) {
                                    if ((m31Var3 instanceof f10) || (m31Var4 instanceof f10)) {
                                        i12 = 5;
                                    } else {
                                        ka4Var = ka4Var;
                                        i27 = i27;
                                        ge7VarK3 = ge7VarK3;
                                        ge7VarK4 = ge7VarK4;
                                        ge7VarK5 = ge7VarK5;
                                        i32 = 6;
                                        i12 = 5;
                                        i13 = 5;
                                    }
                                    z16 = true;
                                    z17 = true;
                                    z18 = false;
                                    ge7Var2 = ge7Var2;
                                } else if (i27 == 1) {
                                    i12 = 8;
                                } else if (i27 == 3) {
                                    i27 = i27;
                                    if (this.A != -1) {
                                        if (z6) {
                                            if (i7 == 2 || i7 == 1) {
                                                i18 = 5;
                                                i19 = 4;
                                            } else {
                                                i18 = 8;
                                                i19 = 5;
                                            }
                                            i13 = i19;
                                            z16 = true;
                                            z17 = true;
                                            z18 = true;
                                        } else {
                                            if (i24 > 0) {
                                                ka4Var = ka4Var;
                                                ge7Var2 = ge7Var2;
                                                ge7VarK3 = ge7VarK3;
                                                ge7VarK4 = ge7VarK4;
                                                ge7VarK5 = ge7VarK5;
                                                i32 = 6;
                                                i12 = 5;
                                            } else if (i24 != 0 || i11 != 0) {
                                                ka4Var = ka4Var;
                                                ge7Var2 = ge7Var2;
                                                ge7VarK3 = ge7VarK3;
                                                ge7VarK4 = ge7VarK4;
                                                ge7VarK5 = ge7VarK5;
                                                i32 = 6;
                                                i12 = 5;
                                                i13 = 4;
                                            } else if (z9) {
                                                i18 = (m31Var3 == n31Var || m31Var4 == n31Var) ? 5 : 4;
                                                i13 = 4;
                                                z16 = true;
                                                z17 = true;
                                                z18 = true;
                                            } else {
                                                ka4Var = ka4Var;
                                                ge7Var2 = ge7Var2;
                                                ge7VarK3 = ge7VarK3;
                                                ge7VarK4 = ge7VarK4;
                                                ge7VarK5 = ge7VarK5;
                                                i32 = 6;
                                                i12 = 5;
                                                i13 = 8;
                                            }
                                            z16 = true;
                                            z17 = true;
                                            z18 = true;
                                        }
                                        i12 = i18;
                                        ka4Var = ka4Var;
                                    } else if (z9) {
                                        ka4Var = ka4Var;
                                        ge7Var2 = ge7Var2;
                                        ge7VarK3 = ge7VarK3;
                                        ge7VarK4 = ge7VarK4;
                                        ge7VarK5 = ge7VarK5;
                                        i12 = 8;
                                        i32 = z2 ? 5 : 4;
                                    } else {
                                        ka4Var = ka4Var;
                                        ge7Var2 = ge7Var2;
                                        ge7VarK3 = ge7VarK3;
                                        ge7VarK4 = ge7VarK4;
                                        ge7VarK5 = ge7VarK5;
                                        i12 = 8;
                                        i32 = 8;
                                    }
                                    i13 = 5;
                                    z16 = true;
                                    z17 = true;
                                    z18 = true;
                                } else {
                                    i12 = 5;
                                    i13 = 4;
                                    z16 = false;
                                    z17 = false;
                                }
                                i13 = 4;
                                z16 = true;
                                z17 = true;
                                z18 = false;
                                ge7Var2 = ge7Var2;
                            }
                            if (z17 || ge7VarK5 != ge7Var3 || m31Var3 == n31Var) {
                                z19 = true;
                            } else {
                                z17 = false;
                                z19 = false;
                            }
                            if (z16) {
                                if (z14 && !z7 && !z9 && ge7VarK5 == ge7Var && ge7Var3 == ge7Var2) {
                                    i32 = 8;
                                    z20 = false;
                                    i17 = 8;
                                    z22 = false;
                                } else {
                                    z20 = z2;
                                    z22 = z19;
                                    i17 = i12;
                                }
                                ge7 ge7Var4 = ge7VarK5;
                                m31Var = m31Var4;
                                ka4Var.b(ge7VarK3, ge7Var4, u21Var.e(), f, ge7Var3, ge7VarK4, u21Var2.e(), i32);
                                ge7VarK5 = ge7Var4;
                                i12 = i17;
                                z19 = z22;
                            } else {
                                m31Var = m31Var4;
                                z20 = z2;
                            }
                            if (this.g0 != 8 && ((hashSet = u21Var2.a) == null || hashSet.size() <= 0)) {
                                return;
                            }
                            if (z17) {
                                if (z20 && ge7VarK5 != ge7Var3 && !z14 && ((m31Var3 instanceof f10) || (m31Var instanceof f10))) {
                                    i12 = 6;
                                }
                                ka4Var.f(ge7VarK3, ge7VarK5, u21Var.e(), i12);
                                ka4Var.g(ge7VarK4, ge7Var3, -u21Var2.e(), i12);
                            }
                            if (z20 || !z10 || (m31Var3 instanceof f10) || (m31Var instanceof f10) || m31Var == n31Var) {
                                iMin2 = i13;
                                z21 = z19;
                            } else {
                                iMin2 = 6;
                                i12 = 6;
                                z21 = true;
                            }
                            if (z21) {
                                if (z18 && (!z9 || z3)) {
                                    if (m31Var3 != n31Var && m31Var != n31Var) {
                                        i32 = iMin2;
                                    }
                                    if ((m31Var3 instanceof av2) || (m31Var instanceof av2)) {
                                        i32 = 5;
                                    }
                                    if ((m31Var3 instanceof f10) || (m31Var instanceof f10)) {
                                        i32 = 5;
                                    }
                                    if (z9) {
                                        i16 = 5;
                                    } else {
                                        i16 = i32;
                                    }
                                    iMin2 = Math.max(i16, iMin2);
                                }
                                if (z20) {
                                    iMin2 = Math.min(i12, iMin2);
                                    if (z6 || z9 || !(m31Var3 == n31Var || m31Var == n31Var)) {
                                        i15 = iMin2;
                                    } else {
                                        i15 = 4;
                                    }
                                } else {
                                    i15 = iMin2;
                                }
                                ka4Var.e(ge7VarK3, ge7VarK5, u21Var.e(), i15);
                                ka4Var.e(ge7VarK4, ge7Var3, -u21Var2.e(), i15);
                            }
                            if (z20) {
                                if (ge7Var == ge7VarK5) {
                                    iE = u21Var.e();
                                } else {
                                    iE = 0;
                                }
                                if (ge7VarK5 != ge7Var) {
                                    ka4Var.f(ge7VarK3, ge7Var, iE, 5);
                                }
                            }
                            if (z20 || !z14 || i4 != 0 || i11 != 0) {
                                i14 = 5;
                            } else if (z14 && i27 == 3) {
                                ka4Var.f(ge7VarK4, ge7VarK3, 0, 8);
                                i14 = 5;
                            } else {
                                i14 = 5;
                                ka4Var.f(ge7VarK4, ge7VarK3, 0, 5);
                            }
                        } else {
                            if (ge7VarK5.h0 && ge7Var3.h0) {
                                ka4Var.b(ge7VarK3, ge7VarK5, u21Var.e(), f, ge7Var3, ge7VarK4, u21Var2.e(), 8);
                                if (z2 && z15) {
                                    int iE2 = u21Var2.f != null ? u21Var2.e() : 0;
                                    if (ge7Var3 != ge7Var2) {
                                        ka4Var.f(ge7Var2, ge7VarK4, iE2, 5);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            i12 = 5;
                            i13 = 4;
                            z16 = true;
                            z17 = true;
                        }
                        z18 = false;
                        if (z17) {
                            z19 = true;
                        } else {
                            z19 = true;
                        }
                        if (z16) {
                            if (z14) {
                                z20 = z2;
                                z22 = z19;
                                i17 = i12;
                            } else {
                                z20 = z2;
                                z22 = z19;
                                i17 = i12;
                            }
                            ge7 ge7Var5 = ge7VarK5;
                            m31Var = m31Var4;
                            ka4Var.b(ge7VarK3, ge7Var5, u21Var.e(), f, ge7Var3, ge7VarK4, u21Var2.e(), i32);
                            ge7VarK5 = ge7Var5;
                            i12 = i17;
                            z19 = z22;
                        } else {
                            m31Var = m31Var4;
                            z20 = z2;
                        }
                        if (this.g0 != 8) {
                        }
                        if (z17) {
                            if (z20) {
                                i12 = 6;
                            }
                            ka4Var.f(ge7VarK3, ge7VarK5, u21Var.e(), i12);
                            ka4Var.g(ge7VarK4, ge7Var3, -u21Var2.e(), i12);
                        }
                        if (z20) {
                            iMin2 = i13;
                            z21 = z19;
                        } else {
                            iMin2 = i13;
                            z21 = z19;
                        }
                        if (z21) {
                            if (z18) {
                                if (m31Var3 != n31Var) {
                                    i32 = iMin2;
                                }
                                if (m31Var3 instanceof av2) {
                                    i32 = 5;
                                } else {
                                    i32 = 5;
                                }
                                if (m31Var3 instanceof f10) {
                                    i32 = 5;
                                } else {
                                    i32 = 5;
                                }
                                if (z9) {
                                    i16 = 5;
                                } else {
                                    i16 = i32;
                                }
                                iMin2 = Math.max(i16, iMin2);
                            }
                            if (z20) {
                                iMin2 = Math.min(i12, iMin2);
                                if (z6) {
                                    i15 = iMin2;
                                } else {
                                    i15 = iMin2;
                                }
                            } else {
                                i15 = iMin2;
                            }
                            ka4Var.e(ge7VarK3, ge7VarK5, u21Var.e(), i15);
                            ka4Var.e(ge7VarK4, ge7Var3, -u21Var2.e(), i15);
                        }
                        if (z20) {
                            if (ge7Var == ge7VarK5) {
                                iE = u21Var.e();
                            } else {
                                iE = 0;
                            }
                            if (ge7VarK5 != ge7Var) {
                                ka4Var.f(ge7VarK3, ge7Var, iE, 5);
                            }
                        }
                        if (z20) {
                            i14 = 5;
                        } else {
                            i14 = 5;
                        }
                    }
                    i22 = i14;
                } else {
                    ge7Var3 = ge7VarK6;
                    ka4Var.e(ge7VarK4, ge7Var3, -u21Var2.e(), 8);
                    if (z2) {
                        ka4Var.f(ge7VarK3, ge7Var, 0, 5);
                        u21Var2 = u21Var2;
                        i14 = 5;
                        ge7VarK4 = ge7VarK4;
                        z15 = z15;
                    }
                    z20 = z2;
                    i22 = i14;
                }
                if (z20 || !z15) {
                    return;
                }
                int iE3 = u21Var2.f != null ? u21Var2.e() : 0;
                if (ge7Var3 != ge7Var2) {
                    ka4Var.f(ge7Var2, ge7VarK4, iE3, i22);
                    return;
                }
                return;
            }
            ge7Var3 = ge7VarK6;
            i14 = 5;
            z20 = z2;
            i22 = i14;
            if (z20) {
                return;
            } else {
                return;
            }
        }
        if (z5) {
            ka4Var.e(ge7VarK4, ge7VarK3, 0, 3);
            if (i4 > 0) {
                ka4Var.f(ge7VarK4, ge7VarK3, i4, i10);
            }
            if (i5 < Integer.MAX_VALUE) {
                ka4Var.g(ge7VarK4, ge7VarK3, i5, i10);
            }
        } else {
            ka4Var.e(ge7VarK4, ge7VarK3, iMin, i10);
        }
        z15 = z4;
        i11 = i23;
        if (z11) {
        }
        boolean z29 = z15;
        if (i26 >= 2) {
        }
    }

    public final void e(int i, m31 m31Var, int i2, int i3) {
        boolean z;
        if (i == 7) {
            if (i2 != 7) {
                if (i2 == 2 || i2 == 4) {
                    e(2, m31Var, i2, 0);
                    e(4, m31Var, i2, 0);
                    i(7).a(m31Var.i(i2), 0);
                    return;
                } else {
                    if (i2 == 3 || i2 == 5) {
                        e(3, m31Var, i2, 0);
                        e(5, m31Var, i2, 0);
                        i(7).a(m31Var.i(i2), 0);
                        return;
                    }
                    return;
                }
            }
            u21 u21VarI = i(2);
            u21 u21VarI2 = i(4);
            u21 u21VarI3 = i(3);
            u21 u21VarI4 = i(5);
            boolean z2 = true;
            if ((u21VarI == null || !u21VarI.h()) && (u21VarI2 == null || !u21VarI2.h())) {
                e(2, m31Var, 2, 0);
                e(4, m31Var, 4, 0);
                z = true;
            } else {
                z = false;
            }
            if ((u21VarI3 == null || !u21VarI3.h()) && (u21VarI4 == null || !u21VarI4.h())) {
                e(3, m31Var, 3, 0);
                e(5, m31Var, 5, 0);
            } else {
                z2 = false;
            }
            if (z && z2) {
                i(7).a(m31Var.i(7), 0);
                return;
            } else if (z) {
                i(8).a(m31Var.i(8), 0);
                return;
            } else {
                if (z2) {
                    i(9).a(m31Var.i(9), 0);
                    return;
                }
                return;
            }
        }
        if (i == 8 && (i2 == 2 || i2 == 4)) {
            u21 u21VarI5 = i(2);
            u21 u21VarI6 = m31Var.i(i2);
            u21 u21VarI7 = i(4);
            u21VarI5.a(u21VarI6, 0);
            u21VarI7.a(u21VarI6, 0);
            i(8).a(u21VarI6, 0);
            return;
        }
        if (i == 9 && (i2 == 3 || i2 == 5)) {
            u21 u21VarI8 = m31Var.i(i2);
            i(3).a(u21VarI8, 0);
            i(5).a(u21VarI8, 0);
            i(9).a(u21VarI8, 0);
            return;
        }
        if (i == 8 && i2 == 8) {
            i(2).a(m31Var.i(2), 0);
            i(4).a(m31Var.i(4), 0);
            i(8).a(m31Var.i(i2), 0);
            return;
        }
        if (i == 9 && i2 == 9) {
            i(3).a(m31Var.i(3), 0);
            i(5).a(m31Var.i(5), 0);
            i(9).a(m31Var.i(i2), 0);
            return;
        }
        u21 u21VarI9 = i(i);
        u21 u21VarI10 = m31Var.i(i2);
        if (u21VarI9.i(u21VarI10)) {
            if (i == 6) {
                u21 u21VarI11 = i(3);
                u21 u21VarI12 = i(5);
                if (u21VarI11 != null) {
                    u21VarI11.j();
                }
                if (u21VarI12 != null) {
                    u21VarI12.j();
                }
            } else if (i == 3 || i == 5) {
                u21 u21VarI13 = i(6);
                if (u21VarI13 != null) {
                    u21VarI13.j();
                }
                u21 u21VarI14 = i(7);
                if (u21VarI14.f != u21VarI10) {
                    u21VarI14.j();
                }
                u21 u21VarF = i(i).f();
                u21 u21VarI15 = i(9);
                if (u21VarI15.h()) {
                    u21VarF.j();
                    u21VarI15.j();
                }
            } else if (i == 2 || i == 4) {
                u21 u21VarI16 = i(7);
                if (u21VarI16.f != u21VarI10) {
                    u21VarI16.j();
                }
                u21 u21VarF2 = i(i).f();
                u21 u21VarI17 = i(8);
                if (u21VarI17.h()) {
                    u21VarF2.j();
                    u21VarI17.j();
                }
            }
            u21VarI9.a(u21VarI10, i3);
        }
    }

    public final void f(u21 u21Var, u21 u21Var2, int i) {
        if (u21Var.d == this) {
            e(u21Var.e, u21Var2.d, u21Var2.e, i);
        }
    }

    public final void g(ka4 ka4Var) {
        ka4Var.k(this.I);
        ka4Var.k(this.J);
        ka4Var.k(this.K);
        ka4Var.k(this.L);
        if (this.a0 > 0) {
            ka4Var.k(this.M);
        }
    }

    public final void h() {
        if (this.d == null) {
            y03 y03Var = new y03(this);
            y03Var.h.e = 4;
            y03Var.i.e = 5;
            y03Var.f = 0;
            this.d = y03Var;
        }
        if (this.e == null) {
            kv8 kv8Var = new kv8(this);
            si1 si1Var = new si1(kv8Var);
            kv8Var.k = si1Var;
            kv8Var.l = null;
            kv8Var.h.e = 6;
            kv8Var.i.e = 7;
            si1Var.e = 8;
            kv8Var.f = 1;
            this.e = kv8Var;
        }
    }

    public u21 i(int i) {
        switch (p61.B(i)) {
            case 0:
                return null;
            case 1:
                return this.I;
            case 2:
                return this.J;
            case 3:
                return this.K;
            case 4:
                return this.L;
            case 5:
                return this.M;
            case 6:
                return this.P;
            case 7:
                return this.N;
            case 8:
                return this.O;
            default:
                bt.g(oi0.z(i));
                return null;
        }
    }

    public final int j(int i) {
        int[] iArr = this.p0;
        if (i == 0) {
            return iArr[0];
        }
        if (i == 1) {
            return iArr[1];
        }
        return 0;
    }

    public final int k() {
        if (this.g0 == 8) {
            return 0;
        }
        return this.V;
    }

    public final m31 l(int i) {
        u21 u21Var;
        u21 u21Var2;
        if (i != 0) {
            if (i == 1 && (u21Var2 = (u21Var = this.L).f) != null && u21Var2.f == u21Var) {
                return u21Var2.d;
            }
            return null;
        }
        u21 u21Var3 = this.K;
        u21 u21Var4 = u21Var3.f;
        if (u21Var4 == null || u21Var4.f != u21Var3) {
            return null;
        }
        return u21Var4.d;
    }

    public final m31 m(int i) {
        u21 u21Var;
        u21 u21Var2;
        if (i != 0) {
            if (i == 1 && (u21Var2 = (u21Var = this.J).f) != null && u21Var2.f == u21Var) {
                return u21Var2.d;
            }
            return null;
        }
        u21 u21Var3 = this.I;
        u21 u21Var4 = u21Var3.f;
        if (u21Var4 == null || u21Var4.f != u21Var3) {
            return null;
        }
        return u21Var4.d;
    }

    public void n(StringBuilder sb) {
        sb.append("  " + this.j + ":{\n");
        StringBuilder sb2 = new StringBuilder("    actualWidth:");
        sb2.append(this.U);
        sb.append(sb2.toString());
        sb.append("\n");
        sb.append("    actualHeight:" + this.V);
        sb.append("\n");
        sb.append("    actualLeft:" + this.Y);
        sb.append("\n");
        sb.append("    actualTop:" + this.Z);
        sb.append("\n");
        p(sb, "left", this.I);
        p(sb, "top", this.J);
        p(sb, "right", this.K);
        p(sb, "bottom", this.L);
        p(sb, "baseline", this.M);
        p(sb, "centerX", this.N);
        p(sb, "centerY", this.O);
        int i = this.U;
        int i2 = this.b0;
        int[] iArr = this.C;
        int i3 = iArr[0];
        int i4 = this.u;
        int i5 = this.r;
        float f = this.w;
        int[] iArr2 = this.p0;
        int i6 = iArr2[0];
        float[] fArr = this.k0;
        float f2 = fArr[0];
        o(sb, "    width", i, i2, i3, i4, i5, f, i6);
        int i7 = this.V;
        int i8 = this.c0;
        int i9 = iArr[1];
        int i10 = this.x;
        int i11 = this.s;
        float f3 = this.z;
        int i12 = iArr2[1];
        float f4 = fArr[1];
        o(sb, "    height", i7, i8, i9, i10, i11, f3, i12);
        float f5 = this.W;
        int i13 = this.X;
        if (f5 != 0.0f) {
            sb.append("    dimensionRatio");
            sb.append(" :  [");
            sb.append(f5);
            sb.append(",");
            sb.append(i13);
            sb.append(_UrlKt.FRAGMENT_ENCODE_SET);
            sb.append("],\n");
        }
        H(sb, "    horizontalBias", this.d0, 0.5f);
        H(sb, "    verticalBias", this.e0, 0.5f);
        G(this.i0, 0, "    horizontalChainStyle", sb);
        G(this.j0, 0, "    verticalChainStyle", sb);
        sb.append("  }");
    }

    public final int q() {
        if (this.g0 == 8) {
            return 0;
        }
        return this.U;
    }

    public final int r() {
        n31 n31Var = this.T;
        return n31Var != null ? n31Var.x0 + this.Y : this.Y;
    }

    public final int s() {
        n31 n31Var = this.T;
        return n31Var != null ? n31Var.y0 + this.Z : this.Z;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x003a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:30:0x003b A[RETURN] */
    public final boolean t(int i) {
        if (i == 0) {
            if ((this.I.f != null ? 1 : 0) + (this.K.f != null ? 1 : 0) < 2) {
                return true;
            }
            return false;
        }
        if ((this.J.f != null ? 1 : 0) + (this.L.f != null ? 1 : 0) + (this.M.f != null ? 1 : 0) < 2) {
            return true;
        }
        return false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(this.h0 != null ? oi0.p(new StringBuilder("id: "), this.h0, " ") : _UrlKt.FRAGMENT_ENCODE_SET);
        sb.append("(");
        sb.append(this.Y);
        sb.append(", ");
        sb.append(this.Z);
        sb.append(") - (");
        sb.append(this.U);
        sb.append(" x ");
        return oi0.n(sb, this.V, ")");
    }

    public final boolean u(int i, int i2) {
        u21 u21Var;
        u21 u21Var2;
        u21 u21Var3;
        u21 u21Var4;
        if (i == 0) {
            u21 u21Var5 = this.I;
            u21 u21Var6 = u21Var5.f;
            if (u21Var6 == null || !u21Var6.c || (u21Var4 = (u21Var3 = this.K).f) == null || !u21Var4.c) {
                return false;
            }
            return (u21Var4.d() - u21Var3.e()) - (u21Var5.e() + u21Var5.f.d()) >= i2;
        }
        u21 u21Var7 = this.J;
        u21 u21Var8 = u21Var7.f;
        if (u21Var8 == null || !u21Var8.c || (u21Var2 = (u21Var = this.L).f) == null || !u21Var2.c) {
            return false;
        }
        return (u21Var2.d() - u21Var.e()) - (u21Var7.e() + u21Var7.f.d()) >= i2;
    }

    public final void v(int i, int i2, int i3, int i4, m31 m31Var) {
        i(i).b(m31Var.i(i2), i3, i4, true);
    }

    public final boolean w(int i) {
        u21 u21Var;
        u21 u21Var2;
        int i2 = i * 2;
        u21[] u21VarArr = this.Q;
        u21 u21Var3 = u21VarArr[i2];
        u21 u21Var4 = u21Var3.f;
        return (u21Var4 == null || u21Var4.f == u21Var3 || (u21Var2 = (u21Var = u21VarArr[i2 + 1]).f) == null || u21Var2.f != u21Var) ? false : true;
    }

    public final boolean x() {
        u21 u21Var = this.I;
        u21 u21Var2 = u21Var.f;
        if (u21Var2 != null && u21Var2.f == u21Var) {
            return true;
        }
        u21 u21Var3 = this.K;
        u21 u21Var4 = u21Var3.f;
        return u21Var4 != null && u21Var4.f == u21Var3;
    }

    public final boolean y() {
        u21 u21Var = this.J;
        u21 u21Var2 = u21Var.f;
        if (u21Var2 != null && u21Var2.f == u21Var) {
            return true;
        }
        u21 u21Var3 = this.L;
        u21 u21Var4 = u21Var3.f;
        return u21Var4 != null && u21Var4.f == u21Var3;
    }

    public final boolean z() {
        return this.g && this.g0 != 8;
    }
}
