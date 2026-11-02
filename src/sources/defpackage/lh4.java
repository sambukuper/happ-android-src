package defpackage;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import okhttp3.dnsoverhttps.DnsOverHttps;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.url._UrlKt;
import org.conscrypt.PSKKeyManager;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class lh4 implements jv4, r61, qd7, c93, yp7, o75, po5, z70, nt0, bw6, la8, ki8, qe2 {
    public static volatile lh4 Z;
    public static final lh4 n0;
    public static final lh4 o0;
    public static final lh4 p0;
    public static final lh4 q0;
    public static final lh4 r0;
    public static final lh4 s0;
    public final /* synthetic */ byte X;
    public static final Object Y = new Object();
    public static final /* synthetic */ lh4 f0 = new lh4((byte) 1);
    public static final lh4 g0 = new lh4((byte) 2);
    public static final /* synthetic */ lh4 h0 = new lh4((byte) 3);
    public static final lh4 i0 = new lh4((byte) 4);
    public static final lh4 j0 = new lh4((byte) 5);
    public static final lh4 k0 = new lh4((byte) 6);
    public static final lh4 l0 = new lh4((byte) 7);
    public static final lh4 m0 = new lh4((byte) 8);
    public static final /* synthetic */ lh4 t0 = new lh4((byte) 10);
    public static final jh0 u0 = new jh0("PackageViewDescriptorFactory", 1);
    public static final lh4 v0 = new lh4((byte) 11);
    public static final /* synthetic */ lh4 w0 = new lh4((byte) 12);
    public static final lh4 x0 = new lh4((byte) 14);
    public static final lh4 y0 = new lh4((byte) 17);
    public static final kp5 z0 = new kp5((byte) 21);
    public static final kp5 A0 = new kp5((byte) 22);
    public static final kp5 B0 = new kp5((byte) 23);
    public static final kp5 C0 = new kp5((byte) 24);
    public static final kp5 D0 = new kp5((byte) 25);
    public static final lh4 E0 = new lh4((byte) 19);
    public static final lh4 F0 = new lh4((byte) 20);
    public static final lh4 G0 = new lh4((byte) 21);
    public static final lh4 H0 = new lh4((byte) 22);
    public static final lh4 I0 = new lh4((byte) 23);
    public static final lh4 J0 = new lh4((byte) 24);
    public static final lh4 K0 = new lh4((byte) 25);
    public static final lh4 L0 = new lh4((byte) 26);
    public static final lh4 M0 = new lh4((byte) 27);
    public static final m29 N0 = new m29();

    static {
        byte b = 9;
        n0 = new lh4(b);
        o0 = new lh4(b);
        p0 = new lh4(b);
        q0 = new lh4(b);
        r0 = new lh4(b);
        s0 = new lh4(b);
    }

    public lh4(int i) {
        this.X = (byte) 0;
    }

    public static void L0(StringBuilder sb, xu3 xu3Var) throws IOException {
        List listG = xu3Var.g();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listG) {
            if (((ob6) obj).x() == fw3.Y) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        wv0.x0(arrayList, sb, null, "context(", ") ", cd5.m0, 50);
    }

    public static void M0(StringBuilder sb, String str) {
        sb.append(pu.K(v15.e(str)));
    }

    public static void N0(StringBuilder sb, xu3 xu3Var) {
        List listL = ((kb6) xu3Var).l();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listL) {
            ob6 ob6Var = (ob6) obj;
            if (ob6Var.x() == fw3.X || ob6Var.x() == fw3.Z) {
                arrayList.add(obj);
            }
        }
        ob6 ob6Var2 = (ob6) wv0.u0(0, arrayList);
        if (ob6Var2 != null) {
            sb.append(W0(ob6Var2.B(), false));
            sb.append(".");
        }
        ob6 ob6Var3 = (ob6) wv0.u0(1, arrayList);
        if (ob6Var3 != null) {
            sb.append("(");
            sb.append(W0(ob6Var3.B(), false));
            sb.append(".");
            sb.append(")");
        }
    }

    public static i48 O0(iw0 iw0Var, h88 h88Var) {
        i48 i48Var = iw0Var.c0;
        if (i48Var != null) {
            if (dh3.f(i48Var.k, h88Var)) {
                return i48Var;
            }
            i48 i48VarA = i48Var.a(i48Var.a, i48Var.b, i48Var.c, i48Var.d, i48Var.e, i48Var.f, i48Var.g, i48Var.h, i48Var.i, i48Var.j, h88Var, i48Var.l, i48Var.m, i48Var.n, i48Var.o, i48Var.p, i48Var.q, i48Var.r, i48Var.s, i48Var.t, i48Var.u, i48Var.v, i48Var.w, i48Var.x, i48Var.y, i48Var.z, i48Var.A, i48Var.B, i48Var.C, i48Var.D, i48Var.E, i48Var.F, i48Var.G, i48Var.H, i48Var.I, i48Var.J, i48Var.K, i48Var.L, i48Var.M, i48Var.N, i48Var.O, i48Var.P, i48Var.Q);
            iw0Var.c0 = i48VarA;
            return i48VarA;
        }
        long jB = kw0.b(iw0Var, i21.F);
        long jB2 = kw0.b(iw0Var, i21.K);
        jw0 jw0Var = i21.n;
        long jB3 = kw0.b(iw0Var, jw0Var);
        float f = i21.o;
        long jB4 = dw0.b(f, jB3);
        long jB5 = kw0.b(iw0Var, i21.z);
        jw0 jw0Var2 = i21.j;
        long jB6 = kw0.b(iw0Var, jw0Var2);
        long jB7 = kw0.b(iw0Var, jw0Var2);
        long jB8 = kw0.b(iw0Var, jw0Var2);
        long jB9 = kw0.b(iw0Var, jw0Var2);
        long jB10 = kw0.b(iw0Var, i21.i);
        long jB11 = kw0.b(iw0Var, i21.y);
        long jB12 = kw0.b(iw0Var, i21.E);
        long jB13 = kw0.b(iw0Var, i21.h);
        long jB14 = dw0.b(i21.m, kw0.b(iw0Var, i21.l));
        long jB15 = kw0.b(iw0Var, i21.x);
        long jB16 = kw0.b(iw0Var, i21.H);
        long jB17 = kw0.b(iw0Var, i21.P);
        long jB18 = dw0.b(i21.s, kw0.b(iw0Var, i21.r));
        long jB19 = kw0.b(iw0Var, i21.B);
        long jB20 = kw0.b(iw0Var, i21.J);
        long jB21 = kw0.b(iw0Var, i21.R);
        long jB22 = dw0.b(i21.w, kw0.b(iw0Var, i21.v));
        long jB23 = kw0.b(iw0Var, i21.D);
        long jB24 = kw0.b(iw0Var, i21.G);
        long jB25 = kw0.b(iw0Var, i21.O);
        long jB26 = dw0.b(i21.q, kw0.b(iw0Var, i21.p));
        long jB27 = kw0.b(iw0Var, i21.A);
        jw0 jw0Var3 = i21.L;
        long jB28 = kw0.b(iw0Var, jw0Var3);
        long jB29 = kw0.b(iw0Var, jw0Var3);
        long jB30 = dw0.b(f, kw0.b(iw0Var, jw0Var));
        long jB31 = kw0.b(iw0Var, jw0Var3);
        long jB32 = kw0.b(iw0Var, i21.I);
        long jB33 = kw0.b(iw0Var, i21.Q);
        long jB34 = dw0.b(i21.u, kw0.b(iw0Var, i21.t));
        long jB35 = kw0.b(iw0Var, i21.C);
        jw0 jw0Var4 = i21.M;
        long jB36 = kw0.b(iw0Var, jw0Var4);
        long jB37 = kw0.b(iw0Var, jw0Var4);
        long jB38 = dw0.b(f, kw0.b(iw0Var, jw0Var4));
        long jB39 = kw0.b(iw0Var, jw0Var4);
        jw0 jw0Var5 = i21.N;
        i48 i48Var2 = new i48(jB, jB2, jB4, jB5, jB6, jB7, jB8, jB9, jB10, jB11, h88Var, jB12, jB13, jB14, jB15, jB16, jB17, jB18, jB19, jB20, jB21, jB22, jB23, jB24, jB25, jB26, jB27, jB28, jB29, jB30, jB31, jB32, jB33, jB34, jB35, jB36, jB37, jB38, jB39, kw0.b(iw0Var, jw0Var5), kw0.b(iw0Var, jw0Var5), dw0.b(f, kw0.b(iw0Var, jw0Var5)), kw0.b(iw0Var, jw0Var5));
        iw0Var.c0 = i48Var2;
        return i48Var2;
    }

    public static lh4 P0() {
        lh4 lh4Var;
        synchronized (Y) {
            try {
                if (Z == null) {
                    Z = new lh4(3);
                }
                lh4Var = Z;
            } catch (Throwable th) {
                throw th;
            }
        }
        return lh4Var;
    }

    public static fx4 R0(xy5 xy5Var) {
        int i = xy5Var == null ? -1 : h06.a[xy5Var.ordinal()];
        fx4 fx4Var = fx4.Y;
        if (i == 1) {
            return fx4Var;
        }
        if (i == 2) {
            return fx4.f0;
        }
        if (i != 3) {
            return i != 4 ? fx4Var : fx4.Z;
        }
        return fx4.g0;
    }

    public static String U0(pv3 pv3Var) throws IOException {
        StringBuilder sb = new StringBuilder();
        L0(sb, pv3Var);
        sb.append("fun ");
        N0(sb, pv3Var);
        M0(sb, pv3Var.getName());
        wv0.x0(nr4.C(pv3Var), sb, ", ", "(", ")", cd5.n0, 48);
        sb.append(": ");
        sb.append(W0(pv3Var.j(), false));
        return sb.toString();
    }

    public static void V0(StringBuilder sb, zu3 zu3Var, gk2 gk2Var, List list, boolean z, boolean z2) throws IOException {
        StringBuilder sb2;
        boolean z3;
        if (zu3Var.getTypeParameters().size() >= list.size() || zc1.M(zu3Var).getDeclaringClass() == null) {
            sb2 = sb;
            z3 = z2;
            sb2.append(pu.J(gk2Var));
        } else {
            Class<?> declaringClass = zc1.M(zu3Var).getDeclaringClass();
            declaringClass.getClass();
            sb2 = sb;
            z3 = z2;
            V0(sb2, yb6.a.b(declaringClass), gk2Var.e(), wv0.o0(list, zu3Var.getTypeParameters().size()), false, z3);
            sb2.append(".");
            sb2.append(pu.K(gk2Var.g()));
        }
        Y0(sb2, wv0.U0(list, zu3Var.getTypeParameters().size()), z, z3);
    }

    /* JADX WARN: Code duplicated, block: B:90:0x0216  */
    public static String W0(pw3 pw3Var, boolean z) throws IOException {
        StringBuilder sb;
        gk2 gk2Var;
        pw3Var.getClass();
        u1 u1Var = (u1) pw3Var;
        byte b = 1;
        if (u1Var.F()) {
            u1 u1VarK = u1Var.K();
            u1VarK.getClass();
            return W0(u1VarK, true);
        }
        u1 u1VarK2 = u1Var.K();
        u1 u1VarT = u1Var.T();
        if (u1VarK2 != null && u1VarT != null) {
            String strX0 = X0(u1VarK2);
            String strX1 = X0(u1VarT);
            byte b2 = 0;
            if (dh3.f(strX0, mm7.W(strX1, "?", _UrlKt.FRAGMENT_ENCODE_SET, false))) {
                return mm7.W(strX1, "?", "!", false);
            }
            if (mm7.R(strX1, false, "?")) {
                if ((strX0 + '?').equals(strX1)) {
                    return strX0 + '!';
                }
            }
            if (("(" + strX0 + ")?").equals(strX1)) {
                return pc6.p("(", strX0, ")!");
            }
            String strH = os4.H(strX0, strX1, new gc6(strX0, b2), new gc6(strX0, b), cd5.q0);
            if (strH != null) {
                return strH;
            }
            return "(" + strX0 + ".." + strX1 + ')';
        }
        StringBuilder sb2 = new StringBuilder();
        pw3 pw3VarF = u1Var.f();
        if (pw3VarF != null) {
            sb2.append(pw3VarF);
            sb2.append(" /* = ");
        }
        lv3 lv3VarM = pw3Var.M();
        if (!(lv3VarM instanceof rw3)) {
            if (lv3VarM instanceof zu3) {
                zu3 zu3Var = (zu3) lv3VarM;
                if (u1Var.B()) {
                    gk2Var = tg7.b;
                } else {
                    zu3 zu3VarV = u1Var.v();
                    if (zu3VarV == null) {
                        zu3VarV = zu3Var;
                    }
                    String strP = zu3VarV.p();
                    gk2Var = strP != null ? new gk2(strP) : null;
                }
                if (gk2Var == null) {
                    gk2Var = new gk2(((ev3) zu3Var).Y.getName());
                }
                if (gk2Var.h(ug7.j) && dh3.f(w79.x(gk2Var), oo2.d) && !pw3Var.L().contains(uw3.c)) {
                    if (u1Var.z()) {
                        sb2.append("(");
                    }
                    if (u1Var.G()) {
                        sb2.append("suspend ");
                    }
                    List listP0 = wv0.p0(1, u1Var.L());
                    List listQ = u1Var.Q();
                    if (listQ != null && listQ.isEmpty()) {
                        sb = sb2;
                        wv0.x0(listP0, sb, null, "(", ") -> ", null, 114);
                        break;
                    }
                    Iterator it = listQ.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((Annotation) it.next()) instanceof n62) {
                                if (!listP0.isEmpty()) {
                                    sb2.append(wv0.r0(listP0));
                                    sb2.append(".");
                                    sb = sb2;
                                    wv0.x0(wv0.o0(listP0, 1), sb, null, "(", ") -> ", null, 114);
                                    break;
                                }
                            }
                        }
                        sb = sb2;
                        wv0.x0(listP0, sb, null, "(", ") -> ", null, 114);
                        break;
                    }
                    sb.append(wv0.A0(u1Var.L()));
                    if (u1Var.z()) {
                        sb.append(")?");
                    }
                } else {
                    sb2 = sb2;
                    V0(sb2, zu3Var, gk2Var, pw3Var.L(), pw3Var.z(), z);
                }
            } else {
                sb = sb2;
                if (lv3VarM instanceof qw3) {
                    gk2 gk2Var2 = ((qw3) lv3VarM).X.a;
                    gk2Var2.getClass();
                    wv0.x0(gk2.f(gk2Var2), sb, ".", null, null, cd5.p0, 60);
                    sb = sb;
                    Y0(sb, pw3Var.L(), pw3Var.z(), z);
                } else {
                    sb.append("???");
                }
            }
            if (u1Var.f() != null) {
                sb.append(" */");
            }
            return sb.toString();
        }
        M0(sb2, ((rw3) lv3VarM).f0);
        if (pw3Var.z()) {
            sb2.append("?");
        } else if (u1Var.x()) {
            sb2.append(" & Any");
        }
        sb = sb2;
        if (u1Var.f() != null) {
            sb.append(" */");
        }
        return sb.toString();
    }

    public static /* synthetic */ String X0(pw3 pw3Var) {
        return W0(pw3Var, false);
    }

    public static void Y0(StringBuilder sb, List list, boolean z, boolean z2) throws IOException {
        StringBuilder sb2;
        if (list.isEmpty()) {
            sb2 = sb;
        } else {
            sb2 = sb;
            wv0.x0(list, sb2, null, "<", ">", new fc6(z2), 50);
        }
        if (z) {
            sb2.append("?");
        }
    }

    public static hr6 Z0(fk3 fk3Var) {
        fk3Var.getClass();
        return new hr6((xa6) fk3Var);
    }

    public static String a1(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(23);
        sb.append("WM-");
        if (length >= 20) {
            sb.append(str.substring(0, 20));
        } else {
            sb.append(str);
        }
        return sb.toString();
    }

    @Override // defpackage.xi8
    public zk6 A(x14 x14Var) {
        aa7 aa7VarS0;
        x14Var.getClass();
        ce2 ce2VarO = z68.o(x14Var);
        if (ce2VarO != null && (aa7VarS0 = z68.s0(ce2VarO)) != null) {
            return aa7VarS0;
        }
        aa7 aa7VarP = z68.p(x14Var);
        aa7VarP.getClass();
        return aa7VarP;
    }

    @Override // defpackage.xi8
    public /* bridge */ bh8 A0(x14 x14Var, int i) {
        return z68.D(x14Var, i);
    }

    @Override // defpackage.xi8
    public /* bridge */ x14 B(fo0 fo0Var) {
        return z68.t0(fo0Var);
    }

    @Override // defpackage.xi8
    public boolean B0(x14 x14Var) {
        x14Var.getClass();
        return !dh3.f(z68.L0(A(x14Var)), z68.L0(a0(x14Var)));
    }

    @Override // defpackage.xi8
    public /* bridge */ Collection C(mh8 mh8Var) {
        return z68.H0(mh8Var);
    }

    @Override // defpackage.xi8
    public /* bridge */ boolean C0(x14 x14Var) {
        return z68.g0(x14Var);
    }

    @Override // defpackage.xi8
    public /* bridge */ boolean D(mh8 mh8Var) {
        return z68.b0(mh8Var);
    }

    @Override // defpackage.xi8
    public /* bridge */ mh8 E(zk6 zk6Var) {
        return z68.L0(zk6Var);
    }

    @Override // defpackage.xi8
    public /* bridge */ ah8 E0(zk6 zk6Var) {
        return z68.l(zk6Var);
    }

    @Override // defpackage.xi8
    public /* bridge */ un0 F(fo0 fo0Var) {
        return z68.s(fo0Var);
    }

    @Override // defpackage.la8
    public ka8 F0() {
        return new ka8(yx4.a());
    }

    @Override // defpackage.xi8
    public boolean G(x14 x14Var) {
        x14Var.getClass();
        return z68.g0(A(x14Var)) != z68.g0(a0(x14Var));
    }

    @Override // defpackage.xi8
    public /* bridge */ boolean G0(x14 x14Var) {
        return z68.i0(x14Var);
    }

    @Override // defpackage.xi8
    public boolean H(x14 x14Var) {
        x14Var.getClass();
        aa7 aa7VarP = z68.p(x14Var);
        return (aa7VarP != null ? z68.n(aa7VarP) : null) != null;
    }

    @Override // defpackage.nt0
    public /* bridge */ mo8 H0(da7 da7Var, da7 da7Var2) {
        return z68.w(this, da7Var, da7Var2);
    }

    @Override // defpackage.nt0
    public /* bridge */ aa7 I(t14 t14Var) {
        return z68.p(t14Var);
    }

    @Override // defpackage.xi8
    public /* bridge */ x14 I0(x14 x14Var) {
        return z68.N0(this, x14Var);
    }

    @Override // defpackage.xi8
    public boolean J(zk6 zk6Var) {
        zk6Var.getClass();
        return z68.n(zk6Var) != null;
    }

    @Override // defpackage.xi8
    public /* bridge */ boolean J0(x14 x14Var) {
        return z68.c0(x14Var);
    }

    @Override // defpackage.po5
    public boolean K(sx4 sx4Var, jm1 jm1Var) {
        sx4Var.getClass();
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0061  */
    /* JADX WARN: Code duplicated, block: B:32:0x0065  */
    /* JADX WARN: Code duplicated, block: B:34:0x006d  */
    /* JADX WARN: Code duplicated, block: B:35:0x0070  */
    /* JADX WARN: Code duplicated, block: B:38:0x0076  */
    /* JADX WARN: Code duplicated, block: B:41:0x007d  */
    /* JADX WARN: Code duplicated, block: B:43:0x0081  */
    /* JADX WARN: Code duplicated, block: B:45:0x0089  */
    /* JADX WARN: Code duplicated, block: B:46:0x008c  */
    /* JADX WARN: Code duplicated, block: B:49:0x0092  */
    /* JADX WARN: Code duplicated, block: B:52:0x009e  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:71:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:73:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:76:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:79:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:83:0x0118  */
    /* JADX WARN: Code duplicated, block: B:84:0x011b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:85:0x011d  */
    /* JADX WARN: Code duplicated, block: B:86:0x0120 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:87:0x0122  */
    /* JADX WARN: Code duplicated, block: B:88:0x0125  */
    /* JADX WARN: Code duplicated, block: B:90:0x0172  */
    /* JADX WARN: Code duplicated, block: B:93:0x0180  */
    /* JADX WARN: Code duplicated, block: B:95:? A[RETURN, SYNTHETIC] */
    public void K0(boolean z, boolean z2, xz4 xz4Var, kx4 kx4Var, i48 i48Var, x67 x67Var, float f, float f2, lp2 lp2Var, int i, int i2) {
        x67 x67VarB;
        int i3;
        int i4;
        float f3;
        float f4;
        boolean z3;
        float f5;
        float f6;
        kx4 kx4Var2;
        x67 x67Var2;
        j86 j86VarR;
        int i5;
        x67 x67Var3;
        float f7;
        float f8;
        int i6;
        kx4 kx4Var3;
        boolean zBooleanValue;
        long j;
        lp2Var.X(-818661242);
        int i7 = (lp2Var.g(z) ? 4 : 2) | i | (lp2Var.g(z2) ? 32 : 16);
        if ((i & 384) == 0) {
            i7 |= lp2Var.f(xz4Var) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        int i8 = i7 | 3072 | (lp2Var.f(i48Var) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192);
        if ((i2 & 32) == 0) {
            x67VarB = x67Var;
            if (lp2Var.f(x67VarB)) {
                i3 = 131072;
            }
            i4 = i8 | i3;
            if ((1572864 & i) == 0) {
                if ((i2 & 64) == 0) {
                    f3 = f;
                    int i9 = lp2Var.c(f3) ? 1048576 : 524288;
                    i4 |= i9;
                } else {
                    f3 = f;
                }
                i4 |= i9;
            } else {
                f3 = f;
            }
            if ((12582912 & i) == 0) {
                if ((i2 & 128) == 0) {
                    f4 = f2;
                    int i10 = lp2Var.c(f4) ? XRayConfig.OutboundBean.StreamSettingsBean.QuicParamsBean.DEFAULT_STREAM_WINDOW : 4194304;
                    i4 |= i10;
                } else {
                    f4 = f2;
                }
                i4 |= i10;
            } else {
                f4 = f2;
            }
            if ((38347923 & i4) != 38347922) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (lp2Var.N(i4 & 1, z3)) {
                lp2Var.S();
                if ((i & 1) != 0 || lp2Var.x()) {
                    if ((i2 & 32) != 0) {
                        x67VarB = q77.b(i21.k, lp2Var);
                        i4 &= -458753;
                    }
                    if ((i2 & 64) != 0) {
                        i4 &= -3670017;
                        f3 = 2.0f;
                    }
                    i5 = i2 & 128;
                    hx4 hx4Var = hx4.X;
                    if (i5 != 0) {
                        i4 &= -29360129;
                        f4 = 1.0f;
                    }
                    float f9 = f3;
                    x67Var3 = x67VarB;
                    f7 = f9;
                    f8 = f4;
                    i6 = i4;
                    kx4Var3 = hx4Var;
                } else {
                    lp2Var.Q();
                    if ((i2 & 32) != 0) {
                        i4 &= -458753;
                    }
                    if ((i2 & 64) != 0) {
                        i4 &= -3670017;
                    }
                    if ((i2 & 128) != 0) {
                        i4 &= -29360129;
                    }
                    float f10 = f3;
                    x67Var3 = x67VarB;
                    f7 = f10;
                    f8 = f4;
                    i6 = i4;
                    kx4Var3 = kx4Var;
                }
                lp2Var.q();
                zBooleanValue = ((Boolean) km4.s(xz4Var, lp2Var, (i6 >> 6) & 14).getValue()).booleanValue();
                if (!z) {
                    j = i48Var.g;
                } else if (z2) {
                    j = i48Var.h;
                } else if (zBooleanValue) {
                    j = i48Var.e;
                } else {
                    j = i48Var.f;
                }
                kx4 kx4VarS = w79.s(kx4Var3, new gq6(x67Var3, new a58(new a74(oa7.a(j, w39.q0(ly4.f0, lp2Var), null, lp2Var, 0, 12), lh7.class, "value", "getValue()Ljava/lang/Object;", 0, (byte) 3)), (byte) 11));
                float f11 = f7;
                float f12 = f8;
                g80.a(kx4VarS.y(new ub3(z, z2, xz4Var, i48Var, x67Var3, f11, f12)), lp2Var, 0);
                f5 = f11;
                f6 = f12;
                x67Var2 = x67Var3;
                kx4Var2 = kx4Var3;
            } else {
                lp2Var.Q();
                f5 = f3;
                f6 = f4;
                kx4Var2 = kx4Var;
                x67Var2 = x67VarB;
            }
            j86VarR = lp2Var.r();
            if (j86VarR != null) {
                j86VarR.d = new ce5(this, z, z2, xz4Var, kx4Var2, i48Var, x67Var2, f5, f6, i, i2, (byte) 1);
            }
        }
        x67VarB = x67Var;
        i3 = DnsOverHttps.MAX_RESPONSE_SIZE;
        i4 = i8 | i3;
        if ((1572864 & i) == 0) {
            if ((i2 & 64) == 0) {
                f3 = f;
                if (lp2Var.c(f3)) {
                }
                i4 |= i9;
            } else {
                f3 = f;
            }
            i4 |= i9;
        } else {
            f3 = f;
        }
        if ((12582912 & i) == 0) {
            if ((i2 & 128) == 0) {
                f4 = f2;
                if (lp2Var.c(f4)) {
                }
                i4 |= i10;
            } else {
                f4 = f2;
            }
            i4 |= i10;
        } else {
            f4 = f2;
        }
        if ((38347923 & i4) != 38347922) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (lp2Var.N(i4 & 1, z3)) {
            lp2Var.S();
            if ((i & 1) != 0) {
                if ((i2 & 32) != 0) {
                    x67VarB = q77.b(i21.k, lp2Var);
                    i4 &= -458753;
                }
                if ((i2 & 64) != 0) {
                    i4 &= -3670017;
                    f3 = 2.0f;
                }
                i5 = i2 & 128;
                hx4 hx4Var2 = hx4.X;
                if (i5 != 0) {
                    i4 &= -29360129;
                    f4 = 1.0f;
                }
                float f13 = f3;
                x67Var3 = x67VarB;
                f7 = f13;
                f8 = f4;
                i6 = i4;
                kx4Var3 = hx4Var2;
            } else {
                if ((i2 & 32) != 0) {
                    x67VarB = q77.b(i21.k, lp2Var);
                    i4 &= -458753;
                }
                if ((i2 & 64) != 0) {
                    i4 &= -3670017;
                    f3 = 2.0f;
                }
                i5 = i2 & 128;
                hx4 hx4Var3 = hx4.X;
                if (i5 != 0) {
                    i4 &= -29360129;
                    f4 = 1.0f;
                }
                float f14 = f3;
                x67Var3 = x67VarB;
                f7 = f14;
                f8 = f4;
                i6 = i4;
                kx4Var3 = hx4Var3;
            }
            lp2Var.q();
            zBooleanValue = ((Boolean) km4.s(xz4Var, lp2Var, (i6 >> 6) & 14).getValue()).booleanValue();
            if (!z) {
                j = i48Var.g;
            } else if (z2) {
                j = i48Var.h;
            } else if (zBooleanValue) {
                j = i48Var.e;
            } else {
                j = i48Var.f;
            }
            kx4 kx4VarS2 = w79.s(kx4Var3, new gq6(x67Var3, new a58(new a74(oa7.a(j, w39.q0(ly4.f0, lp2Var), null, lp2Var, 0, 12), lh7.class, "value", "getValue()Ljava/lang/Object;", 0, (byte) 3)), (byte) 11));
            float f15 = f7;
            float f16 = f8;
            g80.a(kx4VarS2.y(new ub3(z, z2, xz4Var, i48Var, x67Var3, f15, f16)), lp2Var, 0);
            f5 = f15;
            f6 = f16;
            x67Var2 = x67Var3;
            kx4Var2 = kx4Var3;
        } else {
            lp2Var.Q();
            f5 = f3;
            f6 = f4;
            kx4Var2 = kx4Var;
            x67Var2 = x67VarB;
        }
        j86VarR = lp2Var.r();
        if (j86VarR != null) {
            j86VarR.d = new ce5(this, z, z2, xz4Var, kx4Var2, i48Var, x67Var2, f5, f6, i, i2, (byte) 1);
        }
    }

    @Override // defpackage.xi8
    public boolean L(zk6 zk6Var) {
        return z68.e0(z68.L0(zk6Var));
    }

    @Override // defpackage.ki8
    public hi8 M(hb6 hb6Var) {
        hb6Var.getClass();
        return null;
    }

    @Override // defpackage.qe2
    public float N(float f, long j) {
        return 0.0f;
    }

    @Override // defpackage.yp7
    public boolean O(Object obj, Object obj2) {
        return false;
    }

    @Override // defpackage.xi8
    public rn2 P() {
        return null;
    }

    @Override // defpackage.xi8
    public /* bridge */ ji8 Q(mh8 mh8Var) {
        return z68.M(mh8Var);
    }

    public x14 Q0(x14 x14Var) {
        aa7 aa7VarO0;
        x14Var.getClass();
        aa7 aa7VarP = z68.p(x14Var);
        return (aa7VarP == null || (aa7VarO0 = z68.O0(aa7VarP, true)) == null) ? x14Var : aa7VarO0;
    }

    @Override // defpackage.z70
    public long R(int i, xr0 xr0Var) {
        String str = ((x78) xr0Var.e).a.a.Y;
        return ct7.c(x97.x(str, i), x97.w(str, i));
    }

    @Override // defpackage.xi8
    public /* bridge */ dt7 S(zk6 zk6Var) {
        return z68.G0(this, zk6Var);
    }

    public jh8 S0() {
        return wl7.w(false, this, null, 24);
    }

    @Override // defpackage.qe2
    public float T(float f, float f2, long j) {
        return 0.0f;
    }

    public da7 T0(zk6 zk6Var) {
        aa7 aa7Var;
        hh1 hh1VarN = z68.n(zk6Var);
        return (hh1VarN == null || (aa7Var = hh1VarN.Y) == null) ? (da7) zk6Var : aa7Var;
    }

    @Override // defpackage.bw6
    public Object U(hv6 hv6Var, Object obj) {
        List listL;
        y68 y68Var = (y68) obj;
        String string = y68Var.c().Z.toString();
        long j = y68Var.c().f0;
        int i = f88.c;
        Integer numValueOf = Integer.valueOf((int) (j >> 32));
        Integer numValueOf2 = Integer.valueOf((int) (y68Var.c().f0 & 4294967295L));
        xd6 xd6Var = y68Var.a;
        u88 u88Var = (u88) ((rh5) xd6Var.Z).getValue();
        if (u88Var != null) {
            Integer numValueOf3 = Integer.valueOf(u88Var.a);
            String str = u88Var.b;
            String str2 = u88Var.c;
            long j2 = u88Var.d;
            int i2 = f88.c;
            Integer numValueOf4 = Integer.valueOf((int) (j2 >> 32));
            Integer numValueOf5 = Integer.valueOf((int) (j2 & 4294967295L));
            long j3 = u88Var.e;
            listL = i21.L(numValueOf3, str, str2, numValueOf4, numValueOf5, Integer.valueOf((int) (j3 >> 32)), Integer.valueOf((int) (j3 & 4294967295L)), Long.valueOf(u88Var.f));
        } else {
            listL = null;
        }
        return i21.L(string, numValueOf, numValueOf2, i21.L(listL, t88.X.U(hv6Var, (bm8) xd6Var.Y)));
    }

    @Override // defpackage.xi8
    public /* bridge */ Collection V(zk6 zk6Var) {
        return z68.x0(this, zk6Var);
    }

    @Override // defpackage.xi8
    public x14 W(x14 x14Var) {
        return z68.u0(x14Var);
    }

    @Override // defpackage.qd7
    public boolean X(Object obj, Object obj2) {
        switch (this.X) {
            case 4:
                return false;
            default:
                return obj == obj2;
        }
    }

    @Override // defpackage.xi8
    public /* bridge */ void Y(zk6 zk6Var) {
        z68.n0(zk6Var);
    }

    @Override // defpackage.xi8
    public /* bridge */ int Z(mh8 mh8Var) {
        return z68.w0(mh8Var);
    }

    @Override // defpackage.xi8
    public /* bridge */ boolean a(ji8 ji8Var, mh8 mh8Var) {
        return z68.S(ji8Var, mh8Var);
    }

    @Override // defpackage.xi8
    public zk6 a0(x14 x14Var) {
        aa7 aa7VarM0;
        x14Var.getClass();
        ce2 ce2VarO = z68.o(x14Var);
        if (ce2VarO != null && (aa7VarM0 = z68.M0(ce2VarO)) != null) {
            return aa7VarM0;
        }
        aa7 aa7VarP = z68.p(x14Var);
        aa7VarP.getClass();
        return aa7VarP;
    }

    @Override // defpackage.xi8
    public /* bridge */ fo0 b0(da7 da7Var) {
        return z68.m(this, da7Var);
    }

    @Override // defpackage.xi8
    public /* bridge */ int c(x14 x14Var) {
        return z68.k(x14Var);
    }

    @Override // defpackage.xi8
    public boolean d(fo0 fo0Var) {
        return fo0Var instanceof zn0;
    }

    @Override // defpackage.xi8
    public x14 d0(ArrayList arrayList) {
        aa7 aa7Var;
        int size = arrayList.size();
        if (size == 0) {
            bt.i("Expected some types");
            return null;
        }
        if (size == 1) {
            return (mo8) wv0.N0(arrayList);
        }
        ArrayList arrayList2 = new ArrayList(xv0.Z(arrayList, 10));
        Iterator it = arrayList.iterator();
        boolean z = false;
        boolean z2 = false;
        while (it.hasNext()) {
            mo8 mo8Var = (mo8) it.next();
            z = z || vr3.J(mo8Var);
            if (mo8Var instanceof aa7) {
                aa7Var = (aa7) mo8Var;
            } else {
                if (!(mo8Var instanceof ce2)) {
                    b61.c();
                    return null;
                }
                aa7Var = ((ce2) mo8Var).Y;
                z2 = true;
            }
            arrayList2.add(aa7Var);
        }
        if (z) {
            return u32.c(s32.INTERSECTION_OF_ERROR_TYPES, arrayList.toString());
        }
        bi8 bi8Var = bi8.a;
        if (!z2) {
            return bi8Var.b(arrayList2);
        }
        ArrayList arrayList3 = new ArrayList(xv0.Z(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList3.add(yn0.h0((mo8) it2.next()));
        }
        return dh3.s(bi8Var.b(arrayList2), bi8Var.b(arrayList3));
    }

    @Override // defpackage.yp7
    public void e(xp7 xp7Var) {
        xp7Var.clear();
    }

    @Override // defpackage.xi8
    public /* bridge */ bh8 e0(x14 x14Var) {
        return z68.q(x14Var);
    }

    @Override // defpackage.nt0
    public zz3 f() {
        throw new UnsupportedOperationException("Not supported");
    }

    @Override // defpackage.xi8
    public /* bridge */ bh8 f0(eo0 eo0Var) {
        return z68.y0(eo0Var);
    }

    @Override // defpackage.xi8
    public /* bridge */ zk6 g(zk6 zk6Var) {
        return z68.O0(zk6Var, false);
    }

    @Override // defpackage.xi8
    public /* bridge */ boolean g0(zk6 zk6Var, zk6 zk6Var2) {
        return z68.T(zk6Var, zk6Var2);
    }

    @Override // defpackage.xi8
    public /* bridge */ zk6 h(fe2 fe2Var) {
        return z68.M0(fe2Var);
    }

    @Override // defpackage.xi8
    public /* bridge */ ji8 h0(mh8 mh8Var, int i) {
        return z68.I(mh8Var, i);
    }

    @Override // defpackage.xi8
    public /* bridge */ zk6 i(fe2 fe2Var) {
        return z68.s0(fe2Var);
    }

    @Override // defpackage.xi8
    public /* bridge */ boolean i0(mh8 mh8Var, mh8 mh8Var2) {
        return z68.j(mh8Var, mh8Var2);
    }

    @Override // defpackage.xi8
    public /* bridge */ boolean j(bh8 bh8Var) {
        return z68.m0(bh8Var);
    }

    @Override // defpackage.xi8
    public boolean j0(zk6 zk6Var) {
        aa7 aa7VarP = z68.p(zk6Var);
        return (aa7VarP != null ? z68.m(this, T0(aa7VarP)) : null) != null;
    }

    @Override // defpackage.xi8
    public int k(ah8 ah8Var) {
        ah8Var.getClass();
        if (ah8Var instanceof zk6) {
            return z68.k((x14) ah8Var);
        }
        if (ah8Var instanceof at) {
            return ((at) ah8Var).size();
        }
        StringBuilder sb = new StringBuilder("unknown type argument list type: ");
        sb.append(ah8Var);
        kp5.o(sb, yb6.a.b(ah8Var.getClass()));
        return 0;
    }

    @Override // defpackage.o75
    public String k0() {
        return "expected an Int value";
    }

    @Override // defpackage.xi8
    public /* bridge */ dj8 l(bh8 bh8Var) {
        return z68.O(bh8Var);
    }

    @Override // defpackage.xi8
    public boolean l0(x14 x14Var) {
        x14Var.getClass();
        return x14Var instanceof j65;
    }

    @Override // defpackage.xi8
    public /* bridge */ boolean m(x14 x14Var) {
        return z68.l0(x14Var);
    }

    @Override // defpackage.qe2
    public long m0(float f) {
        return 0L;
    }

    @Override // defpackage.xi8
    public /* bridge */ List n(ji8 ji8Var) {
        return z68.N(ji8Var);
    }

    @Override // defpackage.xi8
    public /* bridge */ void n0(zk6 zk6Var) {
        z68.o0(zk6Var);
    }

    @Override // defpackage.xi8
    public void o(x14 x14Var) {
        x14Var.getClass();
        z68.o(x14Var);
    }

    @Override // defpackage.xi8
    public /* bridge */ fe2 o0(x14 x14Var) {
        return z68.o(x14Var);
    }

    @Override // defpackage.xi8
    public /* bridge */ x14 p(bh8 bh8Var) {
        return z68.L(this, bh8Var);
    }

    @Override // defpackage.xi8
    public mh8 p0(x14 x14Var) {
        x14Var.getClass();
        zk6 zk6VarP = z68.p(x14Var);
        if (zk6VarP == null) {
            zk6VarP = A(x14Var);
        }
        return z68.L0(zk6VarP);
    }

    @Override // defpackage.xi8
    public /* bridge */ boolean q(mh8 mh8Var) {
        return z68.f0(mh8Var);
    }

    @Override // defpackage.xi8
    public /* bridge */ boolean q0(mh8 mh8Var) {
        return z68.e0(mh8Var);
    }

    @Override // defpackage.xi8
    public /* bridge */ eo0 r(fo0 fo0Var) {
        return z68.K0(fo0Var);
    }

    @Override // defpackage.qe2
    public float r0(float f, float f2) {
        return 0.0f;
    }

    @Override // defpackage.xi8
    public /* bridge */ boolean s(mh8 mh8Var) {
        return z68.Z(mh8Var);
    }

    @Override // defpackage.xi8
    public /* bridge */ zk6 s0(zk6 zk6Var) {
        return z68.r(zk6Var);
    }

    @Override // defpackage.c93
    public void t(int i, wg1 wg1Var, qi0 qi0Var) {
        wg1Var.getClass();
    }

    @Override // defpackage.xi8
    public /* bridge */ zk6 t0(x14 x14Var) {
        return z68.p(x14Var);
    }

    public String toString() {
        switch (this.X) {
            case 4:
                return "NeverEqualPolicy";
            case 14:
                return "ReferentialEqualityPolicy";
            case 24:
                int i = yx4.Y;
                return "TimeSource(System.nanoTime())";
            default:
                return super.toString();
        }
    }

    @Override // defpackage.xi8
    public boolean u(zk6 zk6Var) {
        zk6Var.getClass();
        return z68.h0(p0(zk6Var)) && !z68.i0(zk6Var);
    }

    @Override // defpackage.xi8
    public fo0 u0(zk6 zk6Var) {
        return z68.m(this, T0(zk6Var));
    }

    @Override // defpackage.xi8
    public boolean v(zk6 zk6Var) {
        zk6Var.getClass();
        return z68.Z(z68.L0(zk6Var));
    }

    @Override // defpackage.xi8
    public /* bridge */ boolean v0(mh8 mh8Var) {
        return z68.X(mh8Var);
    }

    @Override // defpackage.xi8
    public bh8 w(zk6 zk6Var, int i) {
        if (i < 0 || i >= z68.k(zk6Var)) {
            return null;
        }
        return z68.D(zk6Var, i);
    }

    @Override // defpackage.xi8
    public /* bridge */ boolean w0(fo0 fo0Var) {
        return z68.k0(fo0Var);
    }

    @Override // defpackage.xi8
    public /* bridge */ dj8 x(ji8 ji8Var) {
        return z68.P(ji8Var);
    }

    @Override // defpackage.xi8
    public /* bridge */ boolean x0(mh8 mh8Var) {
        return z68.h0(mh8Var);
    }

    @Override // defpackage.bw6
    public Object y(Object obj) {
        List list = (List) obj;
        Object obj2 = list.get(0);
        Object obj3 = list.get(1);
        Object obj4 = list.get(2);
        Object obj5 = list.get(3);
        obj2.getClass();
        String str = (String) obj2;
        obj3.getClass();
        int iIntValue = ((Integer) obj3).intValue();
        obj4.getClass();
        long jC = ct7.c(iIntValue, ((Integer) obj4).intValue());
        obj5.getClass();
        List list2 = (List) obj5;
        Object obj6 = list2.get(0);
        Object obj7 = list2.get(1);
        u88 u88Var = obj6 != null ? (u88) u88.i.y(obj6) : null;
        obj7.getClass();
        return new y68(str, jC, new xd6(u88Var, (bm8) t88.X.y(obj7)));
    }

    @Override // defpackage.xi8
    public bh8 y0(ah8 ah8Var, int i) {
        ah8Var.getClass();
        if (ah8Var instanceof da7) {
            return z68.D((x14) ah8Var, i);
        }
        if (ah8Var instanceof at) {
            E e = ((at) ah8Var).get(i);
            e.getClass();
            return (bh8) e;
        }
        StringBuilder sb = new StringBuilder("unknown type argument list type: ");
        sb.append(ah8Var);
        kp5.o(sb, yb6.a.b(ah8Var.getClass()));
        return null;
    }

    @Override // defpackage.qe2
    public float z() {
        return 0.0f;
    }

    @Override // defpackage.xi8
    public /* bridge */ boolean z0(mh8 mh8Var) {
        return z68.a0(mh8Var);
    }

    @Override // defpackage.nt0, defpackage.xi8
    public /* bridge */ aa7 h(fe2 fe2Var) {
        return z68.M0(fe2Var);
    }

    @Override // defpackage.nt0, defpackage.xi8
    public /* bridge */ aa7 i(fe2 fe2Var) {
        return z68.s0(fe2Var);
    }

    @Override // defpackage.nt0, defpackage.xi8
    public /* bridge */ aa7 g(zk6 zk6Var) {
        return z68.O0(zk6Var, true);
    }

    public /* synthetic */ lh4(byte b) {
        this.X = b;
    }

    @Override // defpackage.c93
    public void b() {
    }

    @Override // defpackage.c93
    public void c0(wg1 wg1Var) {
    }

    @Override // defpackage.xi8
    public void D0(zk6 zk6Var, mh8 mh8Var) {
    }
}
