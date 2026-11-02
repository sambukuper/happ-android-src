package defpackage;

import android.os.Trace;
import androidx.compose.ui.node.LayoutNode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.conscrypt.PSKKeyManager;
import su.happ.proxyutility.dto.MetaParams;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class lp2 {
    public int A;
    public int B;
    public boolean C;
    public final kp2 D;
    public final ArrayList E;
    public boolean F;
    public xb7 G;
    public yb7 H;
    public bc7 I;
    public boolean J;
    public kl5 K;
    public ep0 L;
    public final a01 M;
    public gp2 N;
    public ad2 O;
    public u87 P;
    public final p01 Q;
    public final s61 R;
    public boolean S;
    public long T;
    public mp2 U;
    public final ml8 a;
    public final m01 b;
    public final yb7 c;
    public final v05 d;
    public final ep0 e;
    public final ep0 f;
    public final yr2 g;
    public final r01 h;
    public op2 j;
    public int k;
    public int l;
    public int m;
    public int[] o;
    public tz4 p;
    public boolean q;
    public boolean r;
    public vz4 v;
    public boolean w;
    public boolean y;
    public final ArrayList i = new ArrayList();
    public final qf3 n = new qf3((byte) 1);
    public final ArrayList s = new ArrayList();
    public final qf3 t = new qf3((byte) 1);
    public kl5 u = kl5.f0;
    public final qf3 x = new qf3((byte) 1);
    public int z = -1;

    public lp2(ml8 ml8Var, m01 m01Var, yb7 yb7Var, v05 v05Var, ep0 ep0Var, ep0 ep0Var2, yr2 yr2Var, r01 r01Var) {
        this.a = ml8Var;
        this.b = m01Var;
        this.c = yb7Var;
        this.d = v05Var;
        this.e = ep0Var;
        this.f = ep0Var2;
        this.g = yr2Var;
        this.h = r01Var;
        this.C = m01Var.f() || m01Var.d();
        this.D = new kp2(this, (byte) 0);
        this.E = new ArrayList();
        xb7 xb7VarC = yb7Var.c();
        xb7VarC.c();
        this.G = xb7VarC;
        yb7 yb7Var2 = new yb7();
        if (m01Var.f()) {
            yb7Var2.b();
        }
        if (m01Var.d()) {
            yb7Var2.m0 = new vz4();
        }
        this.H = yb7Var2;
        bc7 bc7VarE = yb7Var2.e();
        bc7VarE.e(true);
        this.I = bc7VarE;
        this.M = new a01(this, ep0Var);
        xb7 xb7VarC2 = this.H.c();
        try {
            gp2 gp2VarA = xb7VarC2.a(0);
            xb7VarC2.c();
            this.N = gp2VarA;
            this.O = new ad2();
            this.Q = new p01(this);
            s61 s61VarJ = m01Var.j();
            s61 s61VarY = y();
            this.R = s61VarJ.B0(s61VarY == null ? b02.X : s61VarY);
        } catch (Throwable th) {
            xb7VarC2.c();
            throw th;
        }
    }

    public static final int M(lp2 lp2Var, int i, boolean z, int i2) throws Throwable {
        int i3;
        long[] jArr;
        int i4;
        int i5;
        xb7 xb7Var;
        xb7 xb7Var2 = lp2Var.G;
        int i6 = 0;
        if (xb7Var2.j(i)) {
            int i7 = xb7Var2.i(i);
            Object objP = xb7Var2.p(xb7Var2.b, i);
            if (i7 == 206 && dh3.f(objP, d01.e)) {
                Object objH = xb7Var2.h(i, 0);
                pp2 pp2Var = objH instanceof pp2 ? (pp2) objH : null;
                vc6 vc6Var = pp2Var != null ? pp2Var.a : null;
                ip2 ip2Var = vc6Var instanceof ip2 ? (ip2) vc6Var : null;
                if (ip2Var != null) {
                    t05 t05Var = ip2Var.X.e;
                    Object[] objArr = t05Var.b;
                    long[] jArr2 = t05Var.a;
                    int length = jArr2.length - 2;
                    if (length >= 0) {
                        int i8 = 0;
                        while (true) {
                            long j = jArr2[i8];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i9 = 8;
                                int i10 = 8 - ((~(i8 - length)) >>> 31);
                                int i11 = i6;
                                while (i11 < i10) {
                                    if ((255 & j) < 128) {
                                        lp2 lp2Var2 = (lp2) objArr[(i8 << 3) + i11];
                                        yb7 yb7Var = lp2Var2.c;
                                        if (yb7Var.Y <= 0 || (yb7Var.X[1] & 67108864) == 0) {
                                            i5 = i6;
                                        } else {
                                            r01 r01Var = lp2Var2.h;
                                            synchronized (r01Var.f0) {
                                                try {
                                                    r01Var.p();
                                                    s05 s05Var = r01Var.p0;
                                                    r01Var.p0 = w39.n();
                                                    try {
                                                        r01Var.x0.c0(s05Var);
                                                    } catch (Throwable th) {
                                                        r01Var.p0 = s05Var;
                                                        throw th;
                                                    }
                                                } catch (Throwable th2) {
                                                    throw th2;
                                                }
                                            }
                                            ep0 ep0Var = new ep0();
                                            lp2Var2.L = ep0Var;
                                            xb7 xb7VarC = lp2Var2.c.c();
                                            try {
                                                lp2Var2.G = xb7VarC;
                                                a01 a01Var = lp2Var2.M;
                                                ep0 ep0Var2 = a01Var.b;
                                                try {
                                                    a01Var.b = ep0Var;
                                                    lp2Var2.L(0);
                                                    a01 a01Var2 = lp2Var2.M;
                                                    a01Var2.b();
                                                    try {
                                                        if (a01Var2.c) {
                                                            xb7Var = xb7VarC;
                                                            try {
                                                                a01Var2.b.i0.b0(kc5.d);
                                                                if (a01Var2.c) {
                                                                    a01Var2.d(false);
                                                                    a01Var2.d(false);
                                                                    a01Var2.b.i0.b0(ub5.d);
                                                                    i5 = 0;
                                                                    a01Var2.c = false;
                                                                }
                                                                a01Var.b = ep0Var2;
                                                                xb7Var.c();
                                                            } catch (Throwable th3) {
                                                                th = th3;
                                                                a01Var.b = ep0Var2;
                                                                throw th;
                                                            }
                                                        } else {
                                                            xb7Var = xb7VarC;
                                                        }
                                                        a01Var.b = ep0Var2;
                                                        xb7Var.c();
                                                    } catch (Throwable th4) {
                                                        th = th4;
                                                        xb7Var.c();
                                                        throw th;
                                                    }
                                                    i5 = 0;
                                                } catch (Throwable th5) {
                                                    th = th5;
                                                    xb7Var = xb7VarC;
                                                }
                                            } catch (Throwable th6) {
                                                th = th6;
                                                xb7Var = xb7VarC;
                                            }
                                        }
                                        lp2Var.b.r(lp2Var2.h);
                                    } else {
                                        jArr2 = jArr2;
                                        i5 = i6;
                                        i9 = i9;
                                    }
                                    j >>= i9;
                                    i11++;
                                    i9 = i9;
                                    i6 = i5;
                                    jArr2 = jArr2;
                                }
                                jArr = jArr2;
                                i4 = i6;
                                if (i10 != i9) {
                                    break;
                                }
                            } else {
                                jArr = jArr2;
                                i4 = i6;
                            }
                            if (i8 == length) {
                                break;
                            }
                            i8++;
                            i6 = i4;
                            jArr2 = jArr;
                        }
                    }
                }
                return xb7Var2.o(i);
            }
            i3 = 1;
            if (!xb7Var2.l(i)) {
                return xb7Var2.o(i);
            }
        } else {
            i3 = 1;
            if (xb7Var2.d(i)) {
                int i12 = xb7Var2.b[(i * 5) + 3] + i;
                int iM = 0;
                for (int i13 = i + 1; i13 < i12; i13 += xb7Var2.b[(i13 * 5) + 3]) {
                    boolean zL = xb7Var2.l(i13);
                    if (zL) {
                        lp2Var.M.c();
                        a01 a01Var3 = lp2Var.M;
                        Object objN = xb7Var2.n(i13);
                        a01Var3.c();
                        a01Var3.h.add(objN);
                    }
                    iM += M(lp2Var, i13, zL || z, zL ? 0 : i2 + iM);
                    if (zL) {
                        lp2Var.M.c();
                        lp2Var.M.a();
                    }
                }
                if (!xb7Var2.l(i)) {
                    return iM;
                }
            } else if (!xb7Var2.l(i)) {
                return xb7Var2.o(i);
            }
        }
        return i3;
    }

    public final void A(ArrayList arrayList) {
        lp2 lp2Var = this;
        ep0 ep0Var = lp2Var.f;
        a01 a01Var = lp2Var.M;
        ep0 ep0Var2 = a01Var.b;
        try {
            a01Var.b = ep0Var;
            ep0Var.i0.b0(ic5.d);
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                qg5 qg5Var = (qg5) arrayList.get(i);
                wy4 wy4Var = (wy4) qg5Var.X;
                wy4Var.getClass();
                gp2 gp2VarE = oc.e(null);
                yb7 yb7VarA = ac7.a(null);
                int iA = yb7VarA.a(gp2VarE);
                mf3 mf3Var = new mf3();
                a01Var.b();
                wc5 wc5Var = a01Var.b.i0;
                wc5Var.b0(rb5.d);
                w45.T(wc5Var, 0, mf3Var, 1, gp2VarE);
                if (yb7VarA == lp2Var.H) {
                    if (!lp2Var.I.w) {
                        d01.a("Check failed");
                    }
                    lp2Var.u();
                }
                xb7 xb7VarC = yb7VarA.c();
                try {
                    xb7VarC.r(iA);
                    a01Var.f = iA;
                    ep0 ep0Var3 = new ep0();
                    lp2Var.F(null, null, null, d02.X, new g00(lp2Var, ep0Var3, xb7VarC, wy4Var));
                    ep0 ep0Var4 = a01Var.b;
                    ep0Var4.getClass();
                    if (!ep0Var3.i0.a0()) {
                        wc5 wc5Var2 = ep0Var4.i0;
                        wc5Var2.b0(nb5.d);
                        w45.T(wc5Var2, 0, ep0Var3, 1, mf3Var);
                    }
                    xb7VarC.c();
                    a01Var.b.i0.b0(kc5.d);
                    i++;
                    lp2Var = this;
                } catch (Throwable th) {
                    xb7VarC.c();
                    throw th;
                }
            }
            a01Var.b();
            a01Var.b.i0.b0(vb5.d);
            a01Var.f = 0;
            a01Var.b = ep0Var2;
        } catch (Throwable th2) {
            a01Var.b = ep0Var2;
            throw th2;
        }
    }

    public final void B(kl5 kl5Var, Object obj) {
        U(126665345, null);
        C();
        h0(obj);
        long j = this.T;
        try {
            this.T = 126665345L;
            if (this.S) {
                bc7.y(this.I);
            }
            boolean z = (this.S || dh3.f(this.G.f(), kl5Var)) ? false : true;
            if (z) {
                I(kl5Var);
            }
            R(202, 0, d01.c, kl5Var);
            this.K = null;
            boolean z2 = this.w;
            this.w = z;
            w45.M(this, new zy0(-59194059, true, new b1(obj, (byte) 9)));
            this.w = z2;
            p(false);
            this.K = null;
            this.T = j;
            p(false);
        } catch (Throwable th) {
            try {
                os4.U(th, new hp2(this, (byte) 2));
                throw th;
            } catch (Throwable th2) {
                p(false);
                this.K = null;
                this.T = j;
                p(false);
                throw th2;
            }
        }
    }

    public final Object C() {
        boolean z = this.S;
        be beVar = zz0.a;
        if (!z) {
            Object objM = this.G.m();
            if (!this.y || (objM instanceof ok6)) {
                return objM;
            }
        } else if (this.r) {
            d01.a("A call to createNode(), emitNode() or useNode() expected");
            return beVar;
        }
        return beVar;
    }

    public final List D() {
        m01 m01Var = this.b;
        l01 l01VarH = m01Var.h();
        r01 r01Var = l01VarH != null ? (r01) l01VarH : null;
        if (r01Var != null) {
            yb7 yb7Var = r01Var.h0;
            xb7 xb7VarC = ac7.a(yb7Var).c();
            try {
                Integer numW = nr4.w(xb7VarC, m01Var, 0, xb7VarC.c);
                xb7VarC.c();
                if (numW != null) {
                    xb7 xb7VarC2 = ac7.a(yb7Var).c();
                    try {
                        return wv0.H0(nr4.V(xb7VarC2, numW.intValue(), 0), r01Var.x0.D());
                    } finally {
                        xb7VarC2.c();
                    }
                }
            } catch (Throwable th) {
                xb7VarC.c();
                throw th;
            }
        }
        return d02.X;
    }

    public final int E(int i) {
        int iQ = this.G.q(i) + 1;
        int i2 = 0;
        while (iQ < i) {
            if (!this.G.k(iQ)) {
                i2++;
            }
            iQ += this.G.b[(iQ * 5) + 3];
        }
        return i2;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0055 A[Catch: all -> 0x0024, TRY_LEAVE, TryCatch #0 {all -> 0x0024, blocks: (B:3:0x0005, B:6:0x0012, B:8:0x0020, B:12:0x0029, B:11:0x0026, B:15:0x0030, B:20:0x003c, B:22:0x0044, B:24:0x004a, B:25:0x004e, B:26:0x004f, B:28:0x0055, B:21:0x0040), top: B:33:0x0005, inners: #1 }] */
    public final Object F(r01 r01Var, r01 r01Var2, Integer num, List list, dn2 dn2Var) {
        Object objInvoke;
        boolean z = this.F;
        int i = this.k;
        try {
            this.F = true;
            this.k = 0;
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                qg5 qg5Var = (qg5) list.get(i2);
                j86 j86Var = (j86) qg5Var.X;
                Object obj = qg5Var.Y;
                if (obj != null) {
                    b0(j86Var, obj);
                } else {
                    b0(j86Var, null);
                }
            }
            if (r01Var == null) {
                objInvoke = dn2Var.invoke();
            } else {
                int iIntValue = num != null ? num.intValue() : -1;
                if (r01Var2 == null || r01Var2 == r01Var || iIntValue < 0) {
                    objInvoke = dn2Var.invoke();
                } else {
                    r01Var.t0 = r01Var2;
                    r01Var.u0 = iIntValue;
                    try {
                        objInvoke = dn2Var.invoke();
                        r01Var.t0 = null;
                        r01Var.u0 = 0;
                    } catch (Throwable th) {
                        r01Var.t0 = null;
                        r01Var.u0 = 0;
                        throw th;
                    }
                }
                if (objInvoke == null) {
                    objInvoke = dn2Var.invoke();
                }
            }
            this.F = z;
            this.k = i;
            return objInvoke;
        } catch (Throwable th2) {
            this.F = z;
            this.k = i;
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x003e  */
    /* JADX WARN: Code duplicated, block: B:200:0x0131 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x0120 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x0122 A[LOOP:7: B:37:0x00cb->B:56:0x0122, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:57:0x012b  */
    /* JADX WARN: Code duplicated, block: B:61:0x0139  */
    /* JADX WARN: Code duplicated, block: B:68:0x0164  */
    /* JADX WARN: Code duplicated, block: B:69:0x0166  */
    /* JADX WARN: Code duplicated, block: B:72:0x016b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:73:0x0177
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    public final void G() {
        /*
            Method dump skipped, instruction units count: 887
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lp2.G():void");
    }

    public final void H() throws Throwable {
        int i;
        L(this.G.g);
        a01 a01Var = this.M;
        a01Var.d(false);
        qf3 qf3Var = a01Var.d;
        lp2 lp2Var = a01Var.a;
        xb7 xb7Var = lp2Var.G;
        if (xb7Var.c > 0 && qf3Var.c(-2) != (i = xb7Var.i)) {
            if (!a01Var.c && a01Var.e) {
                a01Var.d(false);
                a01Var.b.i0.b0(yb5.d);
                a01Var.c = true;
            }
            if (i > 0) {
                gp2 gp2VarA = xb7Var.a(i);
                qf3Var.e(i);
                a01Var.d(false);
                wc5 wc5Var = a01Var.b.i0;
                wc5Var.b0(xb5.d);
                w45.S(wc5Var, 0, gp2VarA);
                a01Var.c = true;
            }
        }
        a01Var.b.i0.b0(gc5.d);
        int i2 = a01Var.f;
        xb7 xb7Var2 = lp2Var.G;
        a01Var.f = xb7Var2.b[(xb7Var2.g * 5) + 3] + i2;
    }

    public final void I(kl5 kl5Var) {
        vz4 vz4Var = this.v;
        if (vz4Var == null) {
            vz4Var = new vz4();
            this.v = vz4Var;
        }
        vz4Var.h(this.G.g, kl5Var);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x001a  */
    public final void J(int i, int i2, int i3) {
        xb7 xb7Var = this.G;
        if (i == i2) {
            i3 = i;
        } else if (i != i3 && i2 != i3) {
            if (xb7Var.q(i) == i2) {
                i3 = i2;
            } else if (xb7Var.q(i2) == i) {
                i3 = i;
            } else if (xb7Var.q(i) == xb7Var.q(i2)) {
                i3 = xb7Var.q(i);
            } else {
                int iQ = i;
                int i4 = 0;
                while (iQ > 0 && iQ != i3) {
                    iQ = xb7Var.q(iQ);
                    i4++;
                }
                int iQ2 = i2;
                int i5 = 0;
                while (iQ2 > 0 && iQ2 != i3) {
                    iQ2 = xb7Var.q(iQ2);
                    i5++;
                }
                int i6 = i4 - i5;
                int iQ3 = i;
                for (int i7 = 0; i7 < i6; i7++) {
                    iQ3 = xb7Var.q(iQ3);
                }
                int i8 = i5 - i4;
                int iQ4 = i2;
                for (int i9 = 0; i9 < i8; i9++) {
                    iQ4 = xb7Var.q(iQ4);
                }
                i3 = iQ3;
                for (int iQ5 = iQ4; i3 != iQ5; iQ5 = xb7Var.q(iQ5)) {
                    i3 = xb7Var.q(i3);
                }
            }
        }
        while (i > 0 && i != i3) {
            if (xb7Var.l(i)) {
                this.M.a();
            }
            i = xb7Var.q(i);
        }
        o(i2, i3);
    }

    public final Object K() {
        boolean z = this.S;
        be beVar = zz0.a;
        if (!z) {
            Object objM = this.G.m();
            if (!this.y || (objM instanceof ok6)) {
                return objM instanceof pp2 ? ((pp2) objM).a : objM;
            }
        } else if (this.r) {
            d01.a("A call to createNode(), emitNode() or useNode() expected");
            return beVar;
        }
        return beVar;
    }

    public final void L(int i) throws Throwable {
        boolean zL = this.G.l(i);
        a01 a01Var = this.M;
        if (zL) {
            a01Var.c();
            Object objN = this.G.n(i);
            a01Var.c();
            a01Var.h.add(objN);
        }
        M(this, i, zL, 0);
        a01Var.c();
        if (zL) {
            a01Var.a();
        }
    }

    public final boolean N(int i, boolean z) {
        j86 j86VarW;
        if ((i & 1) == 0 && (this.S || this.y)) {
            u87 u87Var = this.P;
            if (u87Var != null && (j86VarW = w()) != null && u87Var.c()) {
                int i2 = j86VarW.b;
                if ((i2 & 512) != 0) {
                    return true;
                }
                int i3 = i2 | 1;
                j86VarW.b = i3;
                j86VarW.b = (this.y ? i2 | 129 : i3 & (-129)) | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                wc5 wc5Var = this.M.b.i0;
                wc5Var.b0(fc5.d);
                w45.S(wc5Var, 0, j86VarW);
                this.b.q(j86VarW);
                return false;
            }
        } else if (!z && z()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0093  */
    /* JADX WARN: Code duplicated, block: B:30:0x009f  */
    /* JADX WARN: Code duplicated, block: B:38:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:40:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ea  */
    public final void O() {
        long jRotateLeft;
        if (this.s.isEmpty()) {
            this.l = this.G.s() + this.l;
            return;
        }
        xb7 xb7Var = this.G;
        int iG = xb7Var.g();
        int[] iArr = xb7Var.b;
        int i = xb7Var.g;
        Object objP = i < xb7Var.h ? xb7Var.p(iArr, i) : null;
        Object objF = xb7Var.f();
        int i2 = this.m;
        be beVar = zz0.a;
        if (objP == null) {
            if (objF == null || iG != 207 || objF.equals(beVar)) {
                jRotateLeft = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ ((long) iG), 3) ^ ((long) i2);
            } else {
                this.T = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ ((long) objF.hashCode()), 3) ^ ((long) i2);
            }
            V(null, (iArr[(xb7Var.g * 5) + 1] & 1073741824) != 0);
            G();
            xb7Var.e();
            if (objP != null) {
                if (objP instanceof Enum) {
                    this.T = Long.rotateRight(Long.rotateRight(this.T, 3) ^ ((long) ((Enum) objP).ordinal()), 3);
                } else {
                    this.T = Long.rotateRight(Long.rotateRight(this.T, 3) ^ ((long) objP.hashCode()), 3);
                }
            }
            if (objF == null && iG == 207 && !objF.equals(beVar)) {
                this.T = Long.rotateRight(Long.rotateRight(this.T ^ ((long) i2), 3) ^ ((long) objF.hashCode()), 3);
                return;
            } else {
                this.T = Long.rotateRight(((long) iG) ^ Long.rotateRight(this.T ^ ((long) i2), 3), 3);
            }
        }
        jRotateLeft = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ ((long) (objP instanceof Enum ? ((Enum) objP).ordinal() : objP.hashCode())), 3);
        this.T = jRotateLeft;
        V(null, (iArr[(xb7Var.g * 5) + 1] & 1073741824) != 0);
        G();
        xb7Var.e();
        if (objP != null) {
            if (objF == null) {
            }
            this.T = Long.rotateRight(((long) iG) ^ Long.rotateRight(this.T ^ ((long) i2), 3), 3);
        } else if (objP instanceof Enum) {
            this.T = Long.rotateRight(Long.rotateRight(this.T, 3) ^ ((long) ((Enum) objP).ordinal()), 3);
        } else {
            this.T = Long.rotateRight(Long.rotateRight(this.T, 3) ^ ((long) objP.hashCode()), 3);
        }
    }

    public final void P() {
        xb7 xb7Var = this.G;
        int i = xb7Var.i;
        this.l = i >= 0 ? xb7Var.b[(i * 5) + 1] & 67108863 : 0;
        xb7Var.t();
    }

    public final void Q() {
        if (this.l != 0) {
            d01.a("No nodes can be emitted before calling skipAndEndGroup");
        }
        if (this.S) {
            return;
        }
        j86 j86VarW = w();
        if (j86VarW != null) {
            int i = j86VarW.b;
            if ((i & 128) == 0) {
                j86VarW.b = i | 16;
            }
        }
        if (this.s.isEmpty()) {
            P();
        } else {
            G();
        }
    }

    /* JADX WARN: Code duplicated, block: B:173:0x0326  */
    /* JADX WARN: Code duplicated, block: B:176:0x033c  */
    /* JADX WARN: Code duplicated, block: B:179:0x0357  */
    /* JADX WARN: Code duplicated, block: B:180:0x035d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:181:0x035f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:183:0x0363  */
    /* JADX WARN: Code duplicated, block: B:185:0x036a  */
    /* JADX WARN: Code duplicated, block: B:187:0x036d  */
    /* JADX WARN: Code duplicated, block: B:188:0x036f  */
    /* JADX WARN: Code duplicated, block: B:192:0x039d  */
    /* JADX WARN: Code duplicated, block: B:193:0x039f  */
    /* JADX WARN: Code duplicated, block: B:22:0x0072  */
    /* JADX WARN: Code duplicated, block: B:25:0x007a  */
    /* JADX WARN: Code duplicated, block: B:26:0x007c  */
    /* JADX WARN: Code duplicated, block: B:29:0x0083  */
    /* JADX WARN: Code duplicated, block: B:31:0x0090  */
    /* JADX WARN: Code duplicated, block: B:32:0x0094 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x0096 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x0098  */
    /* JADX WARN: Code duplicated, block: B:36:0x009d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x009f  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:44:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:57:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:61:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:62:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:66:0x010b  */
    /* JADX WARN: Code duplicated, block: B:69:0x0111  */
    /* JADX WARN: Code duplicated, block: B:71:0x0125  */
    /* JADX WARN: Code duplicated, block: B:72:0x0129  */
    /* JADX WARN: Code duplicated, block: B:77:0x014d  */
    /* JADX WARN: Code duplicated, block: B:79:0x0155  */
    /* JADX WARN: Code duplicated, block: B:80:0x015f  */
    /* JADX WARN: Code duplicated, block: B:83:0x0173  */
    /* JADX WARN: Code duplicated, block: B:84:0x0175  */
    /* JADX WARN: Code duplicated, block: B:86:0x0179  */
    /* JADX WARN: Code duplicated, block: B:88:0x0186  */
    /* JADX WARN: Code duplicated, block: B:91:0x018e  */
    /* JADX WARN: Code duplicated, block: B:93:0x0197  */
    public final void R(int i, int i2, Object obj, Object obj2) {
        long jRotateLeft;
        boolean z;
        boolean z2;
        boolean z3;
        op2 op2Var;
        op2 op2Var2;
        ArrayList arrayList;
        vz4 vz4Var;
        int i3;
        Object objValueOf;
        s05 s05Var;
        Object objG;
        j05 j05Var;
        bc7 bc7Var;
        int i4;
        Object obj3;
        int i5;
        int i6;
        Object[] objArr;
        Object[] objArr2;
        int i7;
        int i8;
        int i9;
        xb7 xb7Var;
        int[] iArr;
        ArrayList arrayList2;
        int i10;
        int i11;
        int i12;
        xb7 xb7Var2;
        int i13;
        Object objP;
        bc7 bc7Var2;
        int i14;
        op2 op2Var3;
        Object obj4 = obj;
        if (this.r) {
            d01.a("A call to createNode(), emitNode() or useNode() expected");
        }
        int i15 = this.m;
        Object obj5 = zz0.a;
        if (obj4 == null) {
            if (obj2 == null || i != 207 || obj2.equals(obj5)) {
                jRotateLeft = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ ((long) i), 3) ^ ((long) i15);
            } else {
                this.T = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ ((long) obj2.hashCode()), 3) ^ ((long) i15);
            }
            if (obj4 == null) {
                this.m++;
            }
            if (i2 != 0) {
                z = true;
            } else {
                z = false;
            }
            if (this.S) {
                this.G.k++;
                bc7Var2 = this.I;
                i14 = bc7Var2.t;
                if (z) {
                    bc7Var2.P(i, obj5, true, obj5);
                } else if (obj2 != null) {
                    if (obj4 == null) {
                        obj4 = obj5;
                    }
                    bc7Var2.P(i, obj4, false, obj2);
                } else {
                    if (obj4 == null) {
                        obj4 = obj5;
                    }
                    bc7Var2.P(i, obj4, false, obj5);
                }
                op2Var3 = this.j;
                if (op2Var3 != null) {
                    int i16 = (-2) - i14;
                    ex3 ex3Var = new ex3(-1, i, i16, -1);
                    op2Var3.e.h(i16, new pu2(-1, this.k - op2Var3.b, 0));
                    op2Var3.d.add(ex3Var);
                }
                t(z, null);
                return;
            }
            if (i2 != 1 && this.y) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (this.j == null) {
                int iG = this.G.g();
                if (!z2 && iG == i) {
                    xb7Var2 = this.G;
                    i13 = xb7Var2.g;
                    if (i13 < xb7Var2.h) {
                        objP = xb7Var2.p(xb7Var2.b, i13);
                    } else {
                        objP = null;
                    }
                    if (dh3.f(obj4, objP)) {
                        V(obj2, z);
                        z3 = z2;
                    }
                }
                xb7Var = this.G;
                iArr = xb7Var.b;
                arrayList2 = new ArrayList();
                if (xb7Var.k <= 0) {
                    i10 = xb7Var.g;
                    while (i10 < xb7Var.h) {
                        int i17 = i10 * 5;
                        int i18 = iArr[i17];
                        Object objP2 = xb7Var.p(iArr, i10);
                        i11 = iArr[i17 + 1];
                        if ((i11 & 1073741824) != 0) {
                            i12 = 1;
                        } else {
                            i12 = i11 & 67108863;
                        }
                        arrayList2.add(new ex3(objP2, i18, i10, i12));
                        i10 += iArr[i17 + 3];
                        z2 = z2;
                    }
                }
                z3 = z2;
                this.j = new op2(this.k, arrayList2);
            } else {
                z3 = z2;
            }
            op2Var = this.j;
            if (op2Var != null) {
                arrayList = op2Var.d;
                vz4Var = op2Var.e;
                i3 = op2Var.b;
                if (obj4 != null) {
                    objValueOf = new tm3(Integer.valueOf(i), obj4);
                } else {
                    objValueOf = Integer.valueOf(i);
                }
                s05Var = ((kz4) op2Var.f.getValue()).a;
                objG = s05Var.g(objValueOf);
                if (objG == null) {
                    objG = null;
                } else if (objG instanceof j05) {
                    j05Var = (j05) objG;
                    Object objL = j05Var.l(0);
                    if (j05Var.i()) {
                        s05Var.j(objValueOf);
                    }
                    if (j05Var.b == 1) {
                        s05Var.l(objValueOf, j05Var.f());
                    }
                    objG = objL;
                } else {
                    s05Var.j(objValueOf);
                }
                ex3 ex3Var2 = (ex3) objG;
                if (!z3 || ex3Var2 == null) {
                    this.G.k++;
                    this.S = true;
                    this.K = null;
                    if (this.I.w) {
                        bc7 bc7VarE = this.H.e();
                        this.I = bc7VarE;
                        bc7VarE.L();
                        this.J = false;
                        this.K = null;
                    }
                    this.I.d();
                    bc7Var = this.I;
                    int i19 = bc7Var.t;
                    if (z) {
                        bc7Var.P(i, obj5, true, obj5);
                        i4 = 0;
                    } else if (obj2 != null) {
                        if (obj != null) {
                            obj5 = obj;
                        }
                        i4 = 0;
                        bc7Var.P(i, obj5, false, obj2);
                    } else {
                        i4 = 0;
                        if (obj == null) {
                            obj3 = obj5;
                        } else {
                            obj3 = obj;
                        }
                        bc7Var.P(i, obj3, false, obj5);
                    }
                    this.N = this.I.b(i19);
                    int i20 = (-2) - i19;
                    ex3 ex3Var3 = new ex3(-1, i, i20, -1);
                    vz4Var.h(i20, new pu2(-1, this.k - i3, i4));
                    arrayList.add(ex3Var3);
                    ArrayList arrayList3 = new ArrayList();
                    if (z) {
                        i5 = i4;
                    } else {
                        i5 = this.k;
                    }
                    op2Var2 = new op2(i5, arrayList3);
                } else {
                    int i21 = ex3Var2.c;
                    arrayList.add(ex3Var2);
                    pu2 pu2Var = (pu2) vz4Var.b(i21);
                    this.k = (pu2Var != null ? pu2Var.b : -1) + i3;
                    pu2 pu2Var2 = (pu2) vz4Var.b(i21);
                    int i22 = pu2Var2 != null ? pu2Var2.a : -1;
                    int i23 = op2Var.c;
                    int i24 = i22 - i23;
                    int i25 = 8;
                    if (i22 <= i23) {
                        i6 = i24;
                        if (i23 > i22) {
                            Object[] objArr3 = vz4Var.c;
                            long[] jArr = vz4Var.a;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i26 = 0;
                                while (true) {
                                    long j = jArr[i26];
                                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i27 = 8 - ((~(i26 - length)) >>> 31);
                                        int i28 = 0;
                                        while (i28 < i27) {
                                            if ((j & 255) >= 128) {
                                                objArr2 = objArr3;
                                            } else {
                                                pu2 pu2Var3 = (pu2) objArr3[(i26 << 3) + i28];
                                                int i29 = pu2Var3.a;
                                                if (i29 == i22) {
                                                    pu2Var3.a = i23;
                                                    objArr2 = objArr3;
                                                } else {
                                                    objArr2 = objArr3;
                                                    if (i22 + 1 <= i29 && i29 < i23) {
                                                        pu2Var3.a = i29 - 1;
                                                    }
                                                }
                                            }
                                            j >>= 8;
                                            i28++;
                                            objArr3 = objArr2;
                                        }
                                        objArr = objArr3;
                                        if (i27 != 8) {
                                            break;
                                        }
                                    } else {
                                        objArr = objArr3;
                                    }
                                    if (i26 == length) {
                                        break;
                                    }
                                    i26++;
                                    objArr3 = objArr;
                                }
                            }
                        }
                    } else {
                        Object[] objArr4 = vz4Var.c;
                        long[] jArr2 = vz4Var.a;
                        int length2 = jArr2.length - 2;
                        if (length2 >= 0) {
                            int i30 = 0;
                            while (true) {
                                long j2 = jArr2[i30];
                                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i31 = 8 - ((~(i30 - length2)) >>> 31);
                                    int i32 = 0;
                                    while (i32 < i31) {
                                        if ((j2 & 255) < 128) {
                                            i9 = i25;
                                            pu2 pu2Var4 = (pu2) objArr4[(i30 << 3) + i32];
                                            i8 = i24;
                                            int i33 = pu2Var4.a;
                                            if (i33 == i22) {
                                                pu2Var4.a = i23;
                                            } else if (i23 <= i33 && i33 < i22) {
                                                pu2Var4.a = i33 + 1;
                                            }
                                        } else {
                                            i8 = i24;
                                            i9 = i25;
                                        }
                                        j2 >>= i9;
                                        i32++;
                                        i24 = i8;
                                        i25 = i9;
                                    }
                                    i6 = i24;
                                    if (i31 != i25) {
                                        break;
                                    }
                                } else {
                                    i6 = i24;
                                }
                                if (i30 == length2) {
                                    break;
                                }
                                i30++;
                                i24 = i6;
                                i25 = 8;
                            }
                        } else {
                            i6 = i24;
                        }
                    }
                    a01 a01Var = this.M;
                    int i34 = a01Var.f;
                    lp2 lp2Var = a01Var.a;
                    a01Var.f = (i21 - lp2Var.G.g) + i34;
                    this.G.r(i21);
                    if (i6 > 0) {
                        a01Var.d(false);
                        qf3 qf3Var = a01Var.d;
                        xb7 xb7Var3 = lp2Var.G;
                        if (xb7Var3.c > 0 && qf3Var.c(-2) != (i7 = xb7Var3.i)) {
                            if (!a01Var.c && a01Var.e) {
                                a01Var.d(false);
                                a01Var.b.i0.b0(yb5.d);
                                a01Var.c = true;
                            }
                            if (i7 > 0) {
                                gp2 gp2VarA = xb7Var3.a(i7);
                                qf3Var.e(i7);
                                a01Var.d(false);
                                wc5 wc5Var = a01Var.b.i0;
                                wc5Var.b0(xb5.d);
                                w45.S(wc5Var, 0, gp2VarA);
                                a01Var.c = true;
                            }
                        }
                        wc5 wc5Var2 = a01Var.b.i0;
                        wc5Var2.b0(cc5.d);
                        wc5Var2.n0[wc5Var2.o0 - wc5Var2.l0[wc5Var2.m0 - 1].b] = i6;
                    }
                    V(obj2, z);
                    op2Var2 = null;
                }
            } else {
                op2Var2 = null;
            }
            t(z, op2Var2);
        }
        jRotateLeft = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ ((long) (obj4 instanceof Enum ? ((Enum) obj4).ordinal() : obj4.hashCode())), 3);
        this.T = jRotateLeft;
        if (obj4 == null) {
            this.m++;
        }
        if (i2 != 0) {
            z = true;
        } else {
            z = false;
        }
        if (this.S) {
            this.G.k++;
            bc7Var2 = this.I;
            i14 = bc7Var2.t;
            if (z) {
                bc7Var2.P(i, obj5, true, obj5);
            } else if (obj2 != null) {
                if (obj4 == null) {
                    obj4 = obj5;
                }
                bc7Var2.P(i, obj4, false, obj2);
            } else {
                if (obj4 == null) {
                    obj4 = obj5;
                }
                bc7Var2.P(i, obj4, false, obj5);
            }
            op2Var3 = this.j;
            if (op2Var3 != null) {
                int i110 = (-2) - i14;
                ex3 ex3Var4 = new ex3(-1, i, i110, -1);
                op2Var3.e.h(i110, new pu2(-1, this.k - op2Var3.b, 0));
                op2Var3.d.add(ex3Var4);
            }
            t(z, null);
            return;
        }
        if (i2 != 1) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (this.j == null) {
            int iG2 = this.G.g();
            if (!z2) {
                xb7Var2 = this.G;
                i13 = xb7Var2.g;
                if (i13 < xb7Var2.h) {
                    objP = xb7Var2.p(xb7Var2.b, i13);
                } else {
                    objP = null;
                }
                if (dh3.f(obj4, objP)) {
                    V(obj2, z);
                    z3 = z2;
                }
            }
            xb7Var = this.G;
            iArr = xb7Var.b;
            arrayList2 = new ArrayList();
            if (xb7Var.k <= 0) {
                i10 = xb7Var.g;
                while (i10 < xb7Var.h) {
                    int i111 = i10 * 5;
                    int i112 = iArr[i111];
                    Object objP3 = xb7Var.p(iArr, i10);
                    i11 = iArr[i111 + 1];
                    if ((i11 & 1073741824) != 0) {
                        i12 = 1;
                    } else {
                        i12 = i11 & 67108863;
                    }
                    arrayList2.add(new ex3(objP3, i112, i10, i12));
                    i10 += iArr[i111 + 3];
                    z2 = z2;
                }
            }
            z3 = z2;
            this.j = new op2(this.k, arrayList2);
        } else {
            z3 = z2;
        }
        op2Var = this.j;
        if (op2Var != null) {
            arrayList = op2Var.d;
            vz4Var = op2Var.e;
            i3 = op2Var.b;
            if (obj4 != null) {
                objValueOf = new tm3(Integer.valueOf(i), obj4);
            } else {
                objValueOf = Integer.valueOf(i);
            }
            s05Var = ((kz4) op2Var.f.getValue()).a;
            objG = s05Var.g(objValueOf);
            if (objG == null) {
                objG = null;
            } else if (objG instanceof j05) {
                j05Var = (j05) objG;
                Object objL2 = j05Var.l(0);
                if (j05Var.i()) {
                    s05Var.j(objValueOf);
                }
                if (j05Var.b == 1) {
                    s05Var.l(objValueOf, j05Var.f());
                }
                objG = objL2;
            } else {
                s05Var.j(objValueOf);
            }
            ex3 ex3Var5 = (ex3) objG;
            if (z3) {
            }
            this.G.k++;
            this.S = true;
            this.K = null;
            if (this.I.w) {
                bc7 bc7VarE2 = this.H.e();
                this.I = bc7VarE2;
                bc7VarE2.L();
                this.J = false;
                this.K = null;
            }
            this.I.d();
            bc7Var = this.I;
            int i113 = bc7Var.t;
            if (z) {
                bc7Var.P(i, obj5, true, obj5);
                i4 = 0;
            } else if (obj2 != null) {
                if (obj != null) {
                    obj5 = obj;
                }
                i4 = 0;
                bc7Var.P(i, obj5, false, obj2);
            } else {
                i4 = 0;
                if (obj == null) {
                    obj3 = obj5;
                } else {
                    obj3 = obj;
                }
                bc7Var.P(i, obj3, false, obj5);
            }
            this.N = this.I.b(i113);
            int i210 = (-2) - i113;
            ex3 ex3Var6 = new ex3(-1, i, i210, -1);
            vz4Var.h(i210, new pu2(-1, this.k - i3, i4));
            arrayList.add(ex3Var6);
            ArrayList arrayList4 = new ArrayList();
            if (z) {
                i5 = i4;
            } else {
                i5 = this.k;
            }
            op2Var2 = new op2(i5, arrayList4);
        } else {
            op2Var2 = null;
        }
        t(z, op2Var2);
    }

    public final void S() {
        R(-127, 0, null, null);
    }

    public final void T(int i, gb5 gb5Var) {
        R(i, 0, gb5Var, null);
    }

    public final void U(int i, Object obj) {
        R(i, 0, obj, null);
    }

    public final void V(Object obj, boolean z) {
        if (z) {
            xb7 xb7Var = this.G;
            if (xb7Var.k <= 0) {
                if ((xb7Var.b[(xb7Var.g * 5) + 1] & 1073741824) == 0) {
                    wr5.a("Expected a node group");
                }
                xb7Var.u();
                return;
            }
            return;
        }
        if (obj != null && this.G.f() != obj) {
            a01 a01Var = this.M;
            a01Var.getClass();
            a01Var.d(false);
            wc5 wc5Var = a01Var.b.i0;
            wc5Var.b0(qc5.d);
            w45.S(wc5Var, 0, obj);
        }
        this.G.u();
    }

    public final void W(int i) {
        int i2;
        int i3;
        if (this.j != null) {
            R(i, 0, null, null);
            return;
        }
        if (this.r) {
            d01.a("A call to createNode(), emitNode() or useNode() expected");
        }
        this.T = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ ((long) i), 3) ^ ((long) this.m);
        this.m++;
        xb7 xb7Var = this.G;
        boolean z = this.S;
        be beVar = zz0.a;
        if (z) {
            xb7Var.k++;
            this.I.P(i, beVar, false, beVar);
            t(false, null);
            return;
        }
        if (xb7Var.g() == i && ((i3 = xb7Var.g) >= xb7Var.h || (xb7Var.b[(i3 * 5) + 1] & 536870912) == 0)) {
            xb7Var.u();
            t(false, null);
            return;
        }
        if (xb7Var.k <= 0 && (i2 = xb7Var.g) != xb7Var.h) {
            int i4 = this.k;
            H();
            this.M.e(i4, xb7Var.s());
            gv3.T(i2, xb7Var.g, this.s);
        }
        xb7Var.k++;
        this.S = true;
        this.K = null;
        if (this.I.w) {
            bc7 bc7VarE = this.H.e();
            this.I = bc7VarE;
            bc7VarE.L();
            this.J = false;
            this.K = null;
        }
        bc7 bc7Var = this.I;
        bc7Var.d();
        int i5 = bc7Var.t;
        bc7Var.P(i, beVar, false, beVar);
        this.N = bc7Var.b(i5);
        t(false, null);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x006e  */
    public final lp2 X(int i) {
        j86 j86Var;
        boolean z;
        W(i);
        boolean z2 = this.S;
        yr2 yr2Var = this.g;
        ArrayList arrayList = this.E;
        r01 r01Var = this.h;
        if (z2) {
            j86 j86Var2 = new j86(r01Var);
            arrayList.add(j86Var2);
            h0(j86Var2);
            j86Var2.e = this.B;
            j86Var2.b &= -17;
            yr2Var.l();
            return this;
        }
        int i2 = this.G.i;
        ArrayList arrayList2 = this.s;
        int iP = gv3.p(i2, arrayList2);
        ci3 ci3Var = iP >= 0 ? (ci3) arrayList2.remove(iP) : null;
        Object objM = this.G.m();
        if (dh3.f(objM, zz0.a)) {
            j86Var = new j86(r01Var);
            h0(j86Var);
        } else {
            objM.getClass();
            j86Var = (j86) objM;
        }
        if (ci3Var == null) {
            int i3 = j86Var.b;
            boolean z3 = (i3 & 64) != 0;
            if (z3) {
                j86Var.b = i3 & (-65);
            }
            if (z3) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = true;
        }
        int i4 = j86Var.b;
        j86Var.b = z ? i4 | 8 : i4 & (-9);
        arrayList.add(j86Var);
        j86Var.e = this.B;
        j86Var.b &= -17;
        yr2Var.l();
        int i5 = j86Var.b;
        if ((i5 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
            j86Var.b = (i5 & (-257)) | 512;
            wc5 wc5Var = this.M.b.i0;
            wc5Var.b0(lc5.d);
            w45.S(wc5Var, 0, j86Var);
            if (!this.y) {
                int i6 = j86Var.b;
                if ((i6 & 128) != 0) {
                    this.y = true;
                    this.z = this.G.i;
                    j86Var.b = i6 | 1024;
                }
            }
        }
        return this;
    }

    public final void Y(Object obj) {
        if (!this.S && this.G.g() == 207 && !dh3.f(this.G.f(), obj) && this.z < 0) {
            this.z = this.G.g;
            this.y = true;
        }
        R(207, 0, null, obj);
    }

    public final void Z() {
        R(125, 2, null, null);
        this.r = true;
    }

    public final void a() {
        i();
        this.i.clear();
        this.n.b = 0;
        this.t.b = 0;
        this.x.b = 0;
        this.v = null;
        ad2 ad2Var = this.O;
        ad2Var.m0.Y();
        ad2Var.l0.Y();
        this.T = 0L;
        this.A = 0;
        this.r = false;
        this.S = false;
        this.y = false;
        this.F = false;
        this.z = -1;
        xb7 xb7Var = this.G;
        if (!xb7Var.f) {
            xb7Var.c();
        }
        if (this.I.w) {
            return;
        }
        u();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void a0() {
        this.m = 0;
        this.G = this.c.c();
        R(100, 0, null, null);
        m01 m01Var = this.b;
        m01Var.t();
        kl5 kl5VarI = m01Var.i();
        this.x.e(this.w ? 1 : 0);
        this.w = f(kl5VarI);
        this.K = null;
        if (!this.q) {
            this.q = m01Var.e();
        }
        boolean zF = this.C;
        if (!zF) {
            zF = m01Var.f();
            this.C = zF;
        }
        if (zF) {
            ox1 ox1Var = q01.a;
            ox1Var.getClass();
            kl5VarI = kl5VarI.g(ox1Var, new li7(y()));
        }
        this.u = kl5VarI;
        Set set = (Set) x97.S(kl5VarI, re3.a);
        if (set != null) {
            set.add(v());
            m01Var.o(set);
        }
        R(Long.hashCode(m01Var.g()), 0, null, null);
    }

    public final void b(rn2 rn2Var, Object obj) {
        if (this.S) {
            wc5 wc5Var = this.O.l0;
            wc5Var.b0(rc5.d);
            w45.S(wc5Var, 0, obj);
            ci8.i(2, rn2Var);
            w45.S(wc5Var, 1, rn2Var);
            return;
        }
        a01 a01Var = this.M;
        a01Var.b();
        wc5 wc5Var2 = a01Var.b.i0;
        wc5Var2.b0(rc5.d);
        ci8.i(2, rn2Var);
        w45.T(wc5Var2, 0, obj, 1, rn2Var);
    }

    public final boolean b0(j86 j86Var, Object obj) {
        gp2 gp2Var = j86Var.c;
        if (gp2Var == null) {
            return false;
        }
        int iA = this.G.a.a(oc.e(gp2Var));
        if (!this.F || iA < this.G.g) {
            return false;
        }
        ArrayList arrayList = this.s;
        int iP = gv3.p(iA, arrayList);
        if (iP < 0) {
            int i = -(iP + 1);
            if (!(obj instanceof zi1)) {
                obj = null;
            }
            arrayList.add(i, new ci3(j86Var, iA, obj));
            return true;
        }
        ci3 ci3Var = (ci3) arrayList.get(iP);
        if (!(obj instanceof zi1)) {
            ci3Var.c = null;
            return true;
        }
        Object obj2 = ci3Var.c;
        if (obj2 == null) {
            ci3Var.c = obj;
            return true;
        }
        if (obj2 instanceof t05) {
            ((t05) obj2).a(obj);
            return true;
        }
        t05 t05Var = vw6.a;
        t05 t05Var2 = new t05(2);
        t05Var2.k(obj2);
        t05Var2.k(obj);
        ci3Var.c = t05Var2;
        return true;
    }

    public final boolean c(float f) {
        Object objC = C();
        if ((objC instanceof Float) && f == ((Number) objC).floatValue()) {
            return false;
        }
        h0(Float.valueOf(f));
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0091 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x0093 A[LOOP:1: B:20:0x0043->B:35:0x0093, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:43:0x0096 A[EDGE_INSN: B:43:0x0096->B:36:0x0096 BREAK  A[LOOP:1: B:20:0x0043->B:35:0x0093], SYNTHETIC] */
    public final void c0(s05 s05Var) {
        ArrayList arrayList = this.s;
        for (int iG = i21.G(arrayList); -1 < iG; iG--) {
            ci3 ci3Var = (ci3) arrayList.get(iG);
            gp2 gp2Var = ci3Var.a.c;
            gp2 gp2VarE = gp2Var != null ? oc.e(gp2Var) : null;
            if (gp2VarE == null || !gp2VarE.a()) {
                arrayList.remove(iG);
            } else {
                int i = ci3Var.b;
                int i2 = gp2VarE.a;
                if (i != i2) {
                    ci3Var.b = i2;
                }
            }
        }
        Object[] objArr = s05Var.b;
        Object[] objArr2 = s05Var.c;
        long[] jArr = s05Var.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j = jArr[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i3 != length) {
                        break;
                        break;
                    }
                    i3++;
                } else {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j) < 128) {
                            int i6 = (i3 << 3) + i5;
                            Object obj = objArr[i6];
                            Object obj2 = objArr2[i6];
                            obj.getClass();
                            j86 j86Var = (j86) obj;
                            gp2 gp2Var2 = j86Var.c;
                            if (gp2Var2 != null) {
                                int i7 = oc.e(gp2Var2).a;
                                if (obj2 == qe4.s0) {
                                    obj2 = null;
                                }
                                arrayList.add(new ci3(j86Var, i7, obj2));
                            }
                        }
                        j >>= 8;
                    }
                    if (i4 != 8) {
                        break;
                    } else if (i3 != length) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
        }
        aw0.c0(arrayList, gv3.c);
    }

    public final boolean d(int i) {
        Object objC = C();
        if ((objC instanceof Integer) && i == ((Number) objC).intValue()) {
            return false;
        }
        h0(Integer.valueOf(i));
        return true;
    }

    public final void d0(int i, int i2) {
        if (i0(i) != i2) {
            if (i < 0) {
                tz4 tz4Var = this.p;
                if (tz4Var == null) {
                    tz4Var = new tz4();
                    this.p = tz4Var;
                }
                tz4Var.f(i, i2);
                return;
            }
            int[] iArr = this.o;
            if (iArr == null) {
                int i3 = this.G.c;
                int[] iArr2 = new int[i3];
                Arrays.fill(iArr2, 0, i3, -1);
                this.o = iArr2;
                iArr = iArr2;
            }
            iArr[i] = i2;
        }
    }

    public final boolean e(long j) {
        Object objC = C();
        if ((objC instanceof Long) && j == ((Number) objC).longValue()) {
            return false;
        }
        h0(Long.valueOf(j));
        return true;
    }

    public final void e0(int i, int i2) {
        int iI0 = i0(i);
        if (iI0 != i2) {
            int i3 = i2 - iI0;
            ArrayList arrayList = this.i;
            int size = arrayList.size() - 1;
            while (i != -1) {
                int iI1 = i0(i) + i3;
                d0(i, iI1);
                for (int i4 = size; -1 < i4; i4--) {
                    op2 op2Var = (op2) arrayList.get(i4);
                    if (op2Var != null && op2Var.a(i, iI1)) {
                        size = i4 - 1;
                        break;
                    }
                }
                xb7 xb7Var = this.G;
                if (i < 0) {
                    i = xb7Var.i;
                } else if (xb7Var.l(i)) {
                    return;
                } else {
                    i = this.G.q(i);
                }
            }
        }
    }

    public final boolean f(Object obj) {
        if (dh3.f(C(), obj)) {
            return false;
        }
        h0(obj);
        return true;
    }

    public final kl5 f0(kl5 kl5Var, kl5 kl5Var2) {
        kl5Var.getClass();
        jl5 jl5Var = new jl5(kl5Var);
        jl5Var.putAll(kl5Var2);
        kl5 kl5VarF = jl5Var.f();
        T(204, d01.d);
        C();
        h0(kl5VarF);
        C();
        h0(kl5Var2);
        p(false);
        return kl5VarF;
    }

    public final boolean g(boolean z) {
        Object objC = C();
        if ((objC instanceof Boolean) && z == ((Boolean) objC).booleanValue()) {
            return false;
        }
        h0(Boolean.valueOf(z));
        return true;
    }

    public final void g0(Object obj) {
        if (obj instanceof vc6) {
            pp2 pp2Var = new pp2((vc6) obj, this.m - 1);
            if (this.S) {
                wc5 wc5Var = this.M.b.i0;
                wc5Var.b0(ec5.d);
                w45.S(wc5Var, 0, pp2Var);
            }
            this.d.add(obj);
            obj = pp2Var;
        }
        h0(obj);
    }

    public final boolean h(Object obj) {
        if (C() == obj) {
            return false;
        }
        h0(obj);
        return true;
    }

    public final void h0(Object obj) {
        if (this.S) {
            bc7 bc7Var = this.I;
            if (bc7Var.n <= 0 || bc7Var.i == bc7Var.k) {
                bc7Var.E(obj);
                return;
            }
            vz4 vz4Var = bc7Var.s;
            if (vz4Var == null) {
                vz4Var = new vz4();
            }
            bc7Var.s = vz4Var;
            int i = bc7Var.v;
            Object objB = vz4Var.b(i);
            if (objB == null) {
                objB = new j05();
                vz4Var.h(i, objB);
            }
            ((j05) objB).a(obj);
            return;
        }
        xb7 xb7Var = this.G;
        boolean z = xb7Var.n;
        a01 a01Var = this.M;
        if (!z) {
            gp2 gp2VarA = xb7Var.a(xb7Var.i);
            wc5 wc5Var = a01Var.b.i0;
            wc5Var.b0(mb5.d);
            w45.T(wc5Var, 0, gp2VarA, 1, obj);
            return;
        }
        int iD = (xb7Var.l - ac7.d(xb7Var.b, xb7Var.i)) - 1;
        if (a01Var.a.G.i - a01Var.f >= 0) {
            a01Var.d(true);
            wc5 wc5Var2 = a01Var.b.i0;
            wc5Var2.b0(zb5.h);
            w45.S(wc5Var2, 0, obj);
            wc5Var2.n0[wc5Var2.o0 - wc5Var2.l0[wc5Var2.m0 - 1].b] = iD;
            return;
        }
        xb7 xb7Var2 = this.G;
        gp2 gp2VarA2 = xb7Var2.a(xb7Var2.i);
        wc5 wc5Var3 = a01Var.b.i0;
        wc5Var3.b0(zb5.g);
        w45.T(wc5Var3, 0, obj, 1, gp2VarA2);
        wc5Var3.n0[wc5Var3.o0 - wc5Var3.l0[wc5Var3.m0 - 1].b] = iD;
    }

    public final void i() {
        this.j = null;
        this.k = 0;
        this.l = 0;
        this.T = 0L;
        this.r = false;
        a01 a01Var = this.M;
        a01Var.c = false;
        a01Var.d.b = 0;
        a01Var.f = 0;
        a01Var.e = true;
        a01Var.g = 0;
        a01Var.h.clear();
        a01Var.i = -1;
        a01Var.j = -1;
        a01Var.k = -1;
        a01Var.l = 0;
        this.E.clear();
        this.o = null;
        this.p = null;
    }

    public final int i0(int i) {
        int i2;
        if (i >= 0) {
            int[] iArr = this.o;
            return (iArr == null || (i2 = iArr[i]) < 0) ? this.G.o(i) : i2;
        }
        tz4 tz4Var = this.p;
        if (tz4Var != null && tz4Var.c(i) >= 0) {
            int iC = tz4Var.c(i);
            if (iC >= 0) {
                return tz4Var.c[iC];
            }
            em7.g(pc6.j(i, "Cannot find value for key "));
        }
        return 0;
    }

    public final Object j(q06 q06Var) {
        return x97.S(l(), q06Var);
    }

    public final void j0() {
        if (!this.r) {
            d01.a("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.r = false;
        if (this.S) {
            d01.a("useNode() called while inserting");
        }
        xb7 xb7Var = this.G;
        Object objN = xb7Var.n(xb7Var.i);
        a01 a01Var = this.M;
        a01Var.c();
        a01Var.h.add(objN);
        if (this.y && (objN instanceof jz0)) {
            a01Var.b();
            a01Var.b.i0.b0(tc5.d);
        }
    }

    public final void k() {
        if (!this.r) {
            d01.a("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.r = false;
        if (!this.S) {
            d01.a("createNode() can only be called when inserting");
        }
        qf3 qf3Var = this.n;
        int i = qf3Var.a[qf3Var.b - 1];
        bc7 bc7Var = this.I;
        gp2 gp2VarB = bc7Var.b(bc7Var.v);
        this.l++;
        ad2 ad2Var = this.O;
        wc5 wc5Var = ad2Var.l0;
        wc5Var.b0(zb5.e);
        w45.S(wc5Var, 0, LayoutNode.S0);
        wc5Var.n0[wc5Var.o0 - wc5Var.l0[wc5Var.m0 - 1].b] = i;
        w45.S(wc5Var, 1, gp2VarB);
        wc5 wc5Var2 = ad2Var.m0;
        wc5Var2.b0(zb5.f);
        wc5Var2.n0[wc5Var2.o0 - wc5Var2.l0[wc5Var2.m0 - 1].b] = i;
        w45.S(wc5Var2, 0, gp2VarB);
    }

    public final kl5 l() {
        kl5 kl5Var;
        kl5 kl5Var2 = this.K;
        if (kl5Var2 != null) {
            return kl5Var2;
        }
        int iQ = this.G.i;
        boolean z = this.S;
        gb5 gb5Var = d01.c;
        if (z && this.J) {
            int iD = this.I.v;
            while (iD > 0) {
                if (this.I.r(iD) == 202 && dh3.f(this.I.s(iD), gb5Var)) {
                    Object objP = this.I.p(iD);
                    objP.getClass();
                    kl5 kl5Var3 = (kl5) objP;
                    this.K = kl5Var3;
                    return kl5Var3;
                }
                bc7 bc7Var = this.I;
                iD = bc7Var.D(bc7Var.b, iD);
            }
        }
        if (this.G.c > 0) {
            while (iQ > 0) {
                if (this.G.i(iQ) == 202) {
                    xb7 xb7Var = this.G;
                    if (dh3.f(xb7Var.p(xb7Var.b, iQ), gb5Var)) {
                        vz4 vz4Var = this.v;
                        if (vz4Var == null || (kl5Var = (kl5) vz4Var.b(iQ)) == null) {
                            xb7 xb7Var2 = this.G;
                            Object objB = xb7Var2.b(xb7Var2.b, iQ);
                            objB.getClass();
                            kl5Var = (kl5) objB;
                        }
                        this.K = kl5Var;
                        return kl5Var;
                    }
                }
                iQ = this.G.q(iQ);
            }
        }
        kl5 kl5Var4 = this.u;
        this.K = kl5Var4;
        return kl5Var4;
    }

    public final rz0 m() {
        Collection collection;
        if (!this.b.k()) {
            return null;
        }
        gb4 gb4VarR = i21.r();
        bc7 bc7Var = this.I;
        gb4VarR.addAll(nr4.k(bc7Var, null, bc7Var.t, null));
        xb7 xb7Var = this.G;
        boolean z = xb7Var.f;
        int[] iArr = xb7Var.b;
        if (z || xb7Var.c == 0) {
            collection = d02.X;
        } else {
            d76 d76Var = new d76(xb7Var);
            int iQ = xb7Var.i;
            Object objValueOf = Integer.valueOf(xb7Var.l - ac7.d(iArr, iQ));
            while (iQ >= 0) {
                d76Var.g(xb7Var.i(iQ), xb7Var.k(iQ) ? xb7Var.p(iArr, iQ) : zz0.a, xb7Var.a.h(iQ), objValueOf);
                objValueOf = xb7Var.a(iQ);
                iQ = xb7Var.q(iQ);
            }
            collection = d76Var.X;
        }
        gb4VarR.addAll(collection);
        gb4VarR.addAll(D());
        return new rz0(i21.j(gb4VarR), this.C);
    }

    public final void n(s05 s05Var, rn2 rn2Var) {
        ArrayList arrayList = this.s;
        if (this.F) {
            d01.a("Reentrant composition is not supported");
        }
        this.g.l();
        Trace.beginSection("Compose:recompose");
        try {
            this.B = Long.hashCode(kd7.h().g());
            this.v = null;
            c0(s05Var);
            this.k = 0;
            this.F = true;
            try {
                a0();
                Object objC = C();
                if (objC != rn2Var && rn2Var != null) {
                    h0(rn2Var);
                }
                kp2 kp2Var = this.D;
                c15 c15VarA = rd7.a();
                try {
                    c15VarA.b(kp2Var);
                    gb5 gb5Var = d01.a;
                    if (rn2Var != null) {
                        T(MetaParams.MAX_LENGTH_VISIBLE_ANNOUNCE, gb5Var);
                        w45.M(this, rn2Var);
                        p(false);
                    } else if (!this.w || objC == null || objC.equals(zz0.a)) {
                        O();
                    } else {
                        T(MetaParams.MAX_LENGTH_VISIBLE_ANNOUNCE, gb5Var);
                        ci8.i(2, objC);
                        w45.M(this, (rn2) objC);
                        p(false);
                    }
                    c15VarA.k(c15VarA.Z - 1);
                    s();
                    this.F = false;
                    arrayList.clear();
                    if (!this.I.w) {
                        d01.a("Check failed");
                    }
                    u();
                    Trace.endSection();
                } catch (Throwable th) {
                    c15VarA.k(c15VarA.Z - 1);
                    throw th;
                }
            } catch (Throwable th2) {
                try {
                    os4.U(th2, new hp2(this, (byte) 1));
                    throw th2;
                } catch (Throwable th3) {
                    this.F = false;
                    arrayList.clear();
                    a();
                    if (!this.I.w) {
                        d01.a("Check failed");
                    }
                    u();
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            Trace.endSection();
            throw th4;
        }
    }

    public final void o(int i, int i2) {
        if (i <= 0 || i == i2) {
            return;
        }
        o(this.G.q(i), i2);
        if (this.G.l(i)) {
            Object objN = this.G.n(i);
            a01 a01Var = this.M;
            a01Var.c();
            a01Var.h.add(objN);
        }
    }

    /* JADX WARN: Code duplicated, block: B:150:0x039a  */
    /* JADX WARN: Code duplicated, block: B:202:0x050c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v29, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v32 */
    public final void p(boolean z) {
        long jRotateRight;
        qf3 qf3Var;
        ArrayList arrayList;
        int i;
        ?? r3;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        qf3 qf3Var2;
        int i7;
        t05 t05Var;
        int i8;
        int i9;
        ArrayList arrayList2;
        ArrayList arrayList3;
        HashSet hashSet;
        int i10;
        int i11;
        Object[] objArr;
        long[] jArr;
        int i12;
        Object[] objArr2;
        long[] jArr2;
        int i13;
        Object[] objArr3;
        long[] jArr3;
        int i14;
        Object[] objArr4;
        long[] jArr4;
        long jRotateRight2;
        qf3 qf3Var3 = this.n;
        int i15 = qf3Var3.a[qf3Var3.b - 2] - 1;
        boolean z2 = this.S;
        be beVar = zz0.a;
        if (z2) {
            bc7 bc7Var = this.I;
            int i16 = bc7Var.v;
            int iR = bc7Var.r(i16);
            Object objS = this.I.s(i16);
            Object objP = this.I.p(i16);
            if (objS != null) {
                jRotateRight2 = Long.rotateRight(this.T, 3) ^ ((long) (objS instanceof Enum ? ((Enum) objS).ordinal() : objS.hashCode()));
            } else if (objP == null || iR != 207 || objP.equals(beVar)) {
                jRotateRight2 = Long.rotateRight(this.T ^ ((long) i15), 3) ^ ((long) iR);
            } else {
                this.T = Long.rotateRight(Long.rotateRight(this.T ^ ((long) i15), 3) ^ ((long) objP.hashCode()), 3);
            }
            this.T = Long.rotateRight(jRotateRight2, 3);
        } else {
            xb7 xb7Var = this.G;
            int i17 = xb7Var.i;
            int i18 = xb7Var.i(i17);
            xb7 xb7Var2 = this.G;
            Object objP2 = xb7Var2.p(xb7Var2.b, i17);
            xb7 xb7Var3 = this.G;
            Object objB = xb7Var3.b(xb7Var3.b, i17);
            if (objP2 != null) {
                jRotateRight = Long.rotateRight(this.T, 3) ^ ((long) (objP2 instanceof Enum ? ((Enum) objP2).ordinal() : objP2.hashCode()));
            } else if (objB == null || i18 != 207 || objB.equals(beVar)) {
                jRotateRight = Long.rotateRight(this.T ^ ((long) i15), 3) ^ ((long) i18);
            } else {
                this.T = Long.rotateRight(Long.rotateRight(this.T ^ ((long) i15), 3) ^ ((long) objB.hashCode()), 3);
            }
            this.T = Long.rotateRight(jRotateRight, 3);
        }
        int i19 = this.l;
        op2 op2Var = this.j;
        ArrayList arrayList4 = this.s;
        a01 a01Var = this.M;
        if (op2Var != null) {
            vz4 vz4Var = op2Var.e;
            int i20 = op2Var.b;
            ArrayList arrayList5 = op2Var.a;
            if (arrayList5.size() > 0) {
                ArrayList arrayList6 = op2Var.d;
                HashSet hashSet2 = new HashSet(arrayList6.size());
                int size = arrayList6.size();
                for (int i21 = 0; i21 < size; i21++) {
                    hashSet2.add(arrayList6.get(i21));
                }
                i = -1;
                t05 t05Var2 = vw6.a;
                t05 t05Var3 = new t05();
                int size2 = arrayList6.size();
                int size3 = arrayList5.size();
                int i22 = 0;
                int i23 = 0;
                int i24 = 0;
                while (i22 < size3) {
                    ex3 ex3Var = (ex3) arrayList5.get(i22);
                    if (hashSet2.contains(ex3Var)) {
                        qf3Var2 = qf3Var3;
                        i7 = i22;
                        if (!t05Var3.c(ex3Var)) {
                            int i25 = i23;
                            if (i25 < size2) {
                                ex3 ex3Var2 = (ex3) arrayList6.get(i25);
                                if (ex3Var2 != ex3Var) {
                                    pu2 pu2Var = (pu2) vz4Var.b(ex3Var2.c);
                                    int i26 = pu2Var != null ? pu2Var.b : -1;
                                    t05Var3.a(ex3Var2);
                                    i10 = i24;
                                    if (i26 != i10) {
                                        pu2 pu2Var2 = (pu2) vz4Var.b(ex3Var2.c);
                                        int i27 = pu2Var2 != null ? pu2Var2.c : ex3Var2.d;
                                        t05Var = t05Var3;
                                        int i28 = i26 + i20;
                                        i8 = size2;
                                        int i29 = i10 + i20;
                                        if (i27 > 0) {
                                            i9 = i20;
                                            int i30 = a01Var.l;
                                            if (i30 > 0) {
                                                arrayList2 = arrayList5;
                                                if (a01Var.j == i28 - i30 && a01Var.k == i29 - i30) {
                                                    a01Var.l = i30 + i27;
                                                }
                                            } else {
                                                arrayList2 = arrayList5;
                                            }
                                            a01Var.c();
                                            a01Var.j = i28;
                                            a01Var.k = i29;
                                            a01Var.l = i27;
                                        } else {
                                            i9 = i20;
                                            arrayList2 = arrayList5;
                                            a01Var.getClass();
                                        }
                                        if (i26 <= i10) {
                                            int i31 = i27;
                                            arrayList4 = arrayList4;
                                            arrayList3 = arrayList6;
                                            hashSet = hashSet2;
                                            if (i10 > i26) {
                                                Object[] objArr5 = vz4Var.c;
                                                long[] jArr5 = vz4Var.a;
                                                int length = jArr5.length - 2;
                                                if (length >= 0) {
                                                    int i32 = 0;
                                                    while (true) {
                                                        long j = jArr5[i32];
                                                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                                            int i33 = 8 - ((~(i32 - length)) >>> 31);
                                                            int i34 = 0;
                                                            while (i34 < i33) {
                                                                if ((j & 255) < 128) {
                                                                    objArr2 = objArr5;
                                                                    pu2 pu2Var3 = (pu2) objArr5[(i32 << 3) + i34];
                                                                    jArr2 = jArr5;
                                                                    int i35 = pu2Var3.b;
                                                                    i13 = i26;
                                                                    if (i26 <= i35 && i35 < i13 + i31) {
                                                                        pu2Var3.b = (i35 - i13) + i10;
                                                                    } else if (i13 + 1 <= i35 && i35 < i10) {
                                                                        pu2Var3.b = i35 - i31;
                                                                    }
                                                                } else {
                                                                    objArr2 = objArr5;
                                                                    jArr2 = jArr5;
                                                                    i13 = i26;
                                                                }
                                                                j >>= 8;
                                                                i34++;
                                                                jArr5 = jArr2;
                                                                objArr5 = objArr2;
                                                                i26 = i13;
                                                            }
                                                            objArr = objArr5;
                                                            jArr = jArr5;
                                                            i12 = i26;
                                                            if (i33 != 8) {
                                                                break;
                                                            }
                                                        } else {
                                                            objArr = objArr5;
                                                            jArr = jArr5;
                                                            i12 = i26;
                                                        }
                                                        if (i32 == length) {
                                                            break;
                                                        }
                                                        i32++;
                                                        jArr5 = jArr;
                                                        objArr5 = objArr;
                                                        i26 = i12;
                                                    }
                                                }
                                            }
                                        } else {
                                            Object[] objArr6 = vz4Var.c;
                                            long[] jArr6 = vz4Var.a;
                                            int length2 = jArr6.length - 2;
                                            if (length2 >= 0) {
                                                arrayList3 = arrayList6;
                                                hashSet = hashSet2;
                                                int i36 = 0;
                                                while (true) {
                                                    long j2 = jArr6[i36];
                                                    int i37 = i27;
                                                    arrayList4 = arrayList4;
                                                    if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i38 = 8 - ((~(i36 - length2)) >>> 31);
                                                        int i39 = 0;
                                                        while (i39 < i38) {
                                                            if ((j2 & 255) < 128) {
                                                                i14 = i39;
                                                                pu2 pu2Var4 = (pu2) objArr6[(i36 << 3) + i39];
                                                                objArr4 = objArr6;
                                                                int i40 = pu2Var4.b;
                                                                jArr4 = jArr6;
                                                                if (i26 <= i40 && i40 < i26 + i37) {
                                                                    pu2Var4.b = (i40 - i26) + i10;
                                                                } else if (i10 <= i40 && i40 < i26) {
                                                                    pu2Var4.b = i40 + i37;
                                                                }
                                                            } else {
                                                                i14 = i39;
                                                                objArr4 = objArr6;
                                                                jArr4 = jArr6;
                                                            }
                                                            j2 >>= 8;
                                                            i39 = i14 + 1;
                                                            objArr6 = objArr4;
                                                            jArr6 = jArr4;
                                                        }
                                                        objArr3 = objArr6;
                                                        jArr3 = jArr6;
                                                        if (i38 != 8) {
                                                            break;
                                                        }
                                                    } else {
                                                        objArr3 = objArr6;
                                                        jArr3 = jArr6;
                                                    }
                                                    if (i36 == length2) {
                                                        break;
                                                    }
                                                    i36++;
                                                    arrayList4 = arrayList4;
                                                    i27 = i37;
                                                    objArr6 = objArr3;
                                                    jArr6 = jArr3;
                                                }
                                            }
                                        }
                                        i11 = i7;
                                    } else {
                                        t05Var = t05Var3;
                                        i8 = size2;
                                        i9 = i20;
                                        arrayList2 = arrayList5;
                                    }
                                    arrayList3 = arrayList6;
                                    hashSet = hashSet2;
                                    i11 = i7;
                                } else {
                                    arrayList4 = arrayList4;
                                    t05Var = t05Var3;
                                    i8 = size2;
                                    i9 = i20;
                                    arrayList2 = arrayList5;
                                    arrayList3 = arrayList6;
                                    hashSet = hashSet2;
                                    i10 = i24;
                                    i11 = i7 + 1;
                                }
                                i23 = i25 + 1;
                                pu2 pu2Var5 = (pu2) vz4Var.b(ex3Var2.c);
                                int i41 = i10 + (pu2Var5 != null ? pu2Var5.c : ex3Var2.d);
                                i22 = i11;
                                op2Var = op2Var;
                                t05Var3 = t05Var;
                                size2 = i8;
                                i20 = i9;
                                arrayList5 = arrayList2;
                                arrayList6 = arrayList3;
                                hashSet2 = hashSet;
                                arrayList4 = arrayList4;
                                i24 = i41;
                                qf3Var3 = qf3Var2;
                            } else {
                                i23 = i25;
                                qf3Var3 = qf3Var2;
                                i22 = i7;
                            }
                        }
                    } else {
                        qf3Var2 = qf3Var3;
                        pu2 pu2Var6 = (pu2) vz4Var.b(ex3Var.c);
                        int i42 = pu2Var6 != null ? pu2Var6.b : -1;
                        int i43 = ex3Var.c;
                        i7 = i22;
                        a01Var.e(i42 + i20, ex3Var.d);
                        op2Var.a(i43, 0);
                        a01Var.f = (i43 - a01Var.a.G.g) + a01Var.f;
                        this.G.r(i43);
                        H();
                        this.G.s();
                        gv3.T(i43, this.G.b[(i43 * 5) + 3] + i43, arrayList4);
                    }
                    i22 = i7 + 1;
                    qf3Var3 = qf3Var2;
                }
                qf3Var = qf3Var3;
                arrayList = arrayList4;
                a01Var.c();
                if (arrayList5.size() > 0) {
                    xb7 xb7Var4 = this.G;
                    a01Var.f = (xb7Var4.h - a01Var.a.G.g) + a01Var.f;
                    xb7Var4.t();
                }
            } else {
                qf3Var = qf3Var3;
                arrayList = arrayList4;
                i = -1;
            }
        } else {
            qf3Var = qf3Var3;
            arrayList = arrayList4;
            i = -1;
        }
        boolean z3 = this.S;
        if (!z3) {
            xb7 xb7Var5 = this.G;
            int i44 = xb7Var5.m - xb7Var5.l;
            if (i44 > 0) {
                if (i44 > 0) {
                    a01Var.d(false);
                    qf3 qf3Var4 = a01Var.d;
                    xb7 xb7Var6 = a01Var.a.G;
                    if (xb7Var6.c > 0 && qf3Var4.c(-2) != (i6 = xb7Var6.i)) {
                        if (!a01Var.c && a01Var.e) {
                            a01Var.d(false);
                            a01Var.b.i0.b0(yb5.d);
                            a01Var.c = true;
                        }
                        if (i6 > 0) {
                            gp2 gp2VarA = xb7Var6.a(i6);
                            qf3Var4.e(i6);
                            a01Var.d(false);
                            wc5 wc5Var = a01Var.b.i0;
                            wc5Var.b0(xb5.d);
                            w45.S(wc5Var, 0, gp2VarA);
                            a01Var.c = true;
                        }
                    }
                    wc5 wc5Var2 = a01Var.b.i0;
                    wc5Var2.b0(pc5.d);
                    wc5Var2.n0[wc5Var2.o0 - wc5Var2.l0[wc5Var2.m0 - 1].b] = i44;
                } else {
                    a01Var.getClass();
                }
            }
        }
        int i45 = this.k;
        while (true) {
            xb7 xb7Var7 = this.G;
            if (xb7Var7.k > 0 || (i5 = xb7Var7.g) == xb7Var7.h) {
                break;
            }
            H();
            a01Var.e(i45, this.G.s());
            gv3.T(i5, this.G.g, arrayList);
        }
        if (z3) {
            if (z) {
                ad2 ad2Var = this.O;
                wc5 wc5Var3 = ad2Var.m0;
                if (wc5Var3.m0 == 0) {
                    d01.a("Cannot end node insertion, there are no pending operations that can be realized.");
                }
                wc5 wc5Var4 = ad2Var.l0;
                ld2[] ld2VarArr = wc5Var3.l0;
                int i46 = wc5Var3.m0 - 1;
                wc5Var3.m0 = i46;
                ld2 ld2Var = ld2VarArr[i46];
                ld2VarArr[i46] = null;
                wc5Var4.b0(ld2Var);
                Object[] objArr7 = wc5Var3.p0;
                Object[] objArr8 = wc5Var4.p0;
                int i47 = wc5Var4.q0;
                int i48 = ld2Var.c;
                int i49 = wc5Var3.q0;
                int i50 = i49 - i48;
                System.arraycopy(objArr7, i50, objArr8, i47 - i48, i49 - i50);
                Object[] objArr9 = wc5Var3.p0;
                int i51 = wc5Var3.q0;
                Arrays.fill(objArr9, i51 - i48, i51, (Object) null);
                int[] iArr = wc5Var3.n0;
                int[] iArr2 = wc5Var4.n0;
                int i52 = wc5Var4.o0;
                int i53 = ld2Var.b;
                int i54 = wc5Var3.o0;
                eu.e0(i52 - i53, i54 - i53, i54, iArr, iArr2);
                wc5Var3.q0 -= i48;
                wc5Var3.o0 -= i53;
                i19 = 1;
            }
            xb7 xb7Var8 = this.G;
            if (xb7Var8.k <= 0) {
                wr5.a("Unbalanced begin/end empty");
            }
            xb7Var8.k--;
            bc7 bc7Var2 = this.I;
            int i55 = bc7Var2.v;
            bc7Var2.i();
            if (this.G.k <= 0) {
                int i56 = (-2) - i55;
                this.I.j();
                this.I.e(true);
                gp2 gp2Var = this.N;
                boolean zA0 = this.O.l0.a0();
                yb7 yb7Var = this.H;
                if (zA0) {
                    a01Var.b();
                    a01Var.d(false);
                    qf3 qf3Var5 = a01Var.d;
                    xb7 xb7Var9 = a01Var.a.G;
                    if (xb7Var9.c <= 0 || qf3Var5.c(-2) == (i4 = xb7Var9.i)) {
                        i3 = 1;
                    } else {
                        if (!a01Var.c && a01Var.e) {
                            a01Var.d(false);
                            a01Var.b.i0.b0(yb5.d);
                            a01Var.c = true;
                        }
                        if (i4 > 0) {
                            gp2 gp2VarA2 = xb7Var9.a(i4);
                            qf3Var5.e(i4);
                            a01Var.d(false);
                            wc5 wc5Var5 = a01Var.b.i0;
                            wc5Var5.b0(xb5.d);
                            w45.S(wc5Var5, 0, gp2VarA2);
                            i3 = 1;
                            a01Var.c = true;
                        } else {
                            i3 = 1;
                        }
                    }
                    a01Var.c();
                    wc5 wc5Var6 = a01Var.b.i0;
                    wc5Var6.b0(ac5.d);
                    w45.T(wc5Var6, 0, gp2Var, i3, yb7Var);
                    r3 = 0;
                } else {
                    ad2 ad2Var2 = this.O;
                    a01Var.b();
                    a01Var.d(false);
                    qf3 qf3Var6 = a01Var.d;
                    xb7 xb7Var10 = a01Var.a.G;
                    if (xb7Var10.c > 0 && qf3Var6.c(-2) != (i2 = xb7Var10.i)) {
                        if (!a01Var.c && a01Var.e) {
                            a01Var.d(false);
                            a01Var.b.i0.b0(yb5.d);
                            a01Var.c = true;
                        }
                        if (i2 > 0) {
                            gp2 gp2VarA3 = xb7Var10.a(i2);
                            qf3Var6.e(i2);
                            a01Var.d(false);
                            wc5 wc5Var7 = a01Var.b.i0;
                            wc5Var7.b0(xb5.d);
                            w45.S(wc5Var7, 0, gp2VarA3);
                            a01Var.c = true;
                        }
                    }
                    a01Var.c();
                    wc5 wc5Var8 = a01Var.b.i0;
                    wc5Var8.b0(bc5.d);
                    int i57 = wc5Var8.q0 - wc5Var8.l0[wc5Var8.m0 - 1].c;
                    Object[] objArr10 = wc5Var8.p0;
                    objArr10[i57] = gp2Var;
                    objArr10[i57 + 1] = yb7Var;
                    objArr10[i57 + 2] = ad2Var2;
                    this.O = new ad2();
                    r3 = 0;
                }
                this.S = r3;
                if (this.c.Y != 0) {
                    d0(i56, r3);
                    e0(i56, i19);
                }
            }
        } else {
            if (z) {
                a01Var.a();
            }
            int i58 = a01Var.a.G.i;
            qf3 qf3Var7 = a01Var.d;
            int i59 = i;
            if (qf3Var7.c(i59) > i58) {
                d01.a("Missed recording an endGroup");
            }
            if (qf3Var7.c(i59) == i58) {
                a01Var.d(false);
                qf3Var7.d();
                a01Var.b.i0.b0(ub5.d);
            }
            int i60 = this.G.i;
            if (i19 != i0(i60)) {
                e0(i60, i19);
            }
            if (z) {
                i19 = 1;
            }
            this.G.e();
            a01Var.c();
        }
        ArrayList arrayList7 = this.i;
        op2 op2Var2 = (op2) arrayList7.remove(arrayList7.size() - 1);
        if (op2Var2 != null && !z3) {
            op2Var2.c++;
        }
        this.j = op2Var2;
        this.k = qf3Var.d() + i19;
        this.m = qf3Var.d();
        this.l = qf3Var.d() + i19;
    }

    public final void q() {
        p(false);
        j86 j86VarW = w();
        if (j86VarW != null) {
            int i = j86VarW.b;
            if ((i & 1) != 0) {
                j86VarW.b = i | 2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x007d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:27:0x007f A[LOOP:0: B:15:0x003e->B:27:0x007f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:28:0x0083 A[EDGE_INSN: B:28:0x0083->B:29:0x0084 BREAK  A[LOOP:0: B:15:0x003e->B:27:0x007f]] */
    /* JADX WARN: Code duplicated, block: B:57:0x0101  */
    /* JADX WARN: Code duplicated, block: B:62:0x0083 A[SYNTHETIC] */
    public final j86 r() {
        j86 j86Var;
        gp2 gp2VarA;
        ux2 ux2Var;
        ArrayList arrayList = this.E;
        j86 j86Var2 = !arrayList.isEmpty() ? (j86) arrayList.remove(arrayList.size() - 1) : null;
        if (j86Var2 != null) {
            j86Var2.b &= -9;
            this.g.l();
            int i = this.B;
            f05 f05Var = j86Var2.f;
            if (f05Var == null || (j86Var2.b & 16) != 0) {
                ux2Var = null;
                break;
            }
            Object[] objArr = f05Var.b;
            int[] iArr = f05Var.c;
            long[] jArr = f05Var.a;
            byte b = 2;
            int length = jArr.length - 2;
            if (length < 0) {
                ux2Var = null;
                break;
            }
            int i2 = 0;
            loop0: while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((j & 255) < 128) {
                            int i5 = (i2 << 3) + i4;
                            Object obj = objArr[i5];
                            if (iArr[i5] != i) {
                                ux2Var = new ux2(b, i, j86Var2, f05Var);
                                break loop0;
                            }
                        }
                        j >>= 8;
                    }
                    if (i3 == 8) {
                        if (i2 == length) {
                            i2++;
                        }
                    }
                    ux2Var = null;
                    break;
                }
                if (i2 == length) {
                    ux2Var = null;
                    break;
                }
                i2++;
            }
            a01 a01Var = this.M;
            if (ux2Var != null) {
                wc5 wc5Var = a01Var.b.i0;
                wc5Var.b0(tb5.d);
                w45.T(wc5Var, 0, ux2Var, 1, this.h);
            }
            int i6 = j86Var2.b;
            if ((i6 & 512) != 0) {
                j86Var2.b = i6 & (-513);
                wc5 wc5Var2 = a01Var.b.i0;
                wc5Var2.b0(wb5.d);
                w45.S(wc5Var2, 0, j86Var2);
                int i7 = j86Var2.b;
                j86Var2.b = i7 & (-129);
                if ((i7 & 1024) != 0) {
                    j86Var2.b = i7 & (-1153);
                    if (this.z == this.G.i) {
                        this.y = false;
                        this.z = -1;
                    }
                }
            }
        }
        if (j86Var2 != null) {
            int i8 = j86Var2.b;
            if ((i8 & 16) == 0 && ((i8 & 1) != 0 || this.q)) {
                if (j86Var2.c == null) {
                    if (this.S) {
                        bc7 bc7Var = this.I;
                        gp2VarA = bc7Var.b(bc7Var.v);
                    } else {
                        xb7 xb7Var = this.G;
                        gp2VarA = xb7Var.a(xb7Var.i);
                    }
                    j86Var2.c = gp2VarA;
                }
                j86Var2.b &= -5;
                j86Var = j86Var2;
            } else {
                j86Var = null;
            }
        } else {
            j86Var = null;
        }
        p(false);
        return j86Var;
    }

    public final void s() {
        p(false);
        this.b.c();
        p(false);
        a01 a01Var = this.M;
        if (a01Var.c) {
            a01Var.d(false);
            a01Var.d(false);
            a01Var.b.i0.b0(ub5.d);
            a01Var.c = false;
        }
        a01Var.b();
        if (a01Var.d.b != 0) {
            d01.a("Missed recording an endGroup()");
        }
        if (!this.i.isEmpty()) {
            d01.a("Start/end imbalance");
        }
        i();
        this.G.c();
        this.w = this.x.d() != 0;
    }

    public final void t(boolean z, op2 op2Var) {
        this.i.add(this.j);
        this.j = op2Var;
        int i = this.l;
        qf3 qf3Var = this.n;
        qf3Var.e(i);
        qf3Var.e(this.m);
        qf3Var.e(this.k);
        if (z) {
            this.k = 0;
        }
        this.l = 0;
        this.m = 0;
    }

    public final void u() {
        yb7 yb7Var = new yb7();
        if (this.C) {
            yb7Var.b();
        }
        if (this.b.d()) {
            yb7Var.m0 = new vz4();
        }
        this.H = yb7Var;
        bc7 bc7VarE = yb7Var.e();
        bc7VarE.e(true);
        this.I = bc7VarE;
    }

    public final o01 v() {
        mp2 mp2Var = this.U;
        if (mp2Var != null) {
            return mp2Var;
        }
        mp2 mp2Var2 = new mp2(this.h);
        this.U = mp2Var2;
        return mp2Var2;
    }

    public final j86 w() {
        if (this.A != 0) {
            return null;
        }
        ArrayList arrayList = this.E;
        if (arrayList.isEmpty()) {
            return null;
        }
        return (j86) oi0.h(1, arrayList);
    }

    public final boolean x() {
        if (!z() || this.w) {
            return true;
        }
        j86 j86VarW = w();
        return (j86VarW == null || (j86VarW.b & 4) == 0) ? false : true;
    }

    public final p01 y() {
        if (this.b.k()) {
            return this.Q;
        }
        return null;
    }

    public final boolean z() {
        j86 j86VarW;
        return (this.S || this.y || this.w || (j86VarW = w()) == null || (j86VarW.b & 8) != 0) ? false : true;
    }
}
