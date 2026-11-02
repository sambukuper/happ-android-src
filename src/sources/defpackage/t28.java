package defpackage;

import android.os.Trace;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class t28 extends jx4 implements g34, rv1, w07 {
    public fw0 A0;
    public mx B0;
    public gn2 C0;
    public Map D0;
    public ez4 E0;
    public r28 F0;
    public s28 G0;
    public ql q0;
    public o88 r0;
    public fi2 s0;
    public gn2 t0;
    public int u0;
    public boolean v0;
    public int w0;
    public int x0;
    public List y0;
    public gn2 z0;

    @Override // defpackage.g34
    public final int J0(ug3 ug3Var, tr4 tr4Var, int i) {
        return Z0(ug3Var).a(i, ug3Var.getLayoutDirection());
    }

    @Override // defpackage.g34
    public final yr4 K(zr4 zr4Var, tr4 tr4Var, long j) {
        Trace.beginSection("TextAnnotatedStringNode:measure");
        try {
            ez4 ez4VarZ0 = Z0(zr4Var);
            boolean zC = ez4VarZ0.c(j, zr4Var.getLayoutDirection());
            x78 x78Var = ez4VarZ0.o;
            if (x78Var == null) {
                throw new IllegalStateException("Internal Error: MultiParagraphLayoutCache could not provide TextLayoutResult during the draw phase. Please report this bug on the official Issue Tracker with the following diagnostic information: " + ez4VarZ0);
            }
            long j2 = x78Var.c;
            x78Var.b.a.b();
            if (zC) {
                yn0.X(this, 2).d1();
                gn2 gn2Var = this.t0;
                if (gn2Var != null) {
                    gn2Var.B(x78Var);
                }
                Map linkedHashMap = this.D0;
                if (linkedHashMap == null) {
                    linkedHashMap = new LinkedHashMap(2);
                }
                linkedHashMap.put(u8.a, Integer.valueOf(Math.round(x78Var.d)));
                linkedHashMap.put(u8.b, Integer.valueOf(Math.round(x78Var.e)));
                this.D0 = linkedHashMap;
            }
            gn2 gn2Var2 = this.z0;
            if (gn2Var2 != null) {
                gn2Var2.B(x78Var.f);
            }
            int i = (int) (j2 >> 32);
            int i2 = (int) (j2 & 4294967295L);
            eo5 eo5VarO = tr4Var.o(z68.B(i, i, i2, i2));
            Map map = this.D0;
            map.getClass();
            yr4 yr4VarG0 = zr4Var.g0(i, i2, map, new d1(eo5VarO, (byte) 13));
            Trace.endSection();
            return yr4VarG0;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // defpackage.jx4
    public final boolean N0() {
        return false;
    }

    public final ez4 Y0() {
        ez4 ez4Var = this.E0;
        if (ez4Var == null) {
            ez4 ez4Var2 = new ez4(this.q0, this.r0, this.s0, this.u0, this.v0, this.w0, this.x0, this.y0, this.B0);
            this.E0 = ez4Var2;
            ez4Var = ez4Var2;
        }
        ez4Var.getClass();
        return ez4Var;
    }

    public final ez4 Z0(fi1 fi1Var) {
        ez4 ez4Var;
        s28 s28Var = this.G0;
        if (s28Var != null && s28Var.c && (ez4Var = s28Var.d) != null) {
            ez4Var.d(fi1Var);
            return ez4Var;
        }
        ez4 ez4VarY0 = Y0();
        ez4VarY0.d(fi1Var);
        return ez4VarY0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [gn2] */
    /* JADX WARN: Type inference failed for: r0v2, types: [r28] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    @Override // defpackage.w07
    public final void h(f17 f17Var) {
        r28 r28Var = this.F0;
        ?? r0 = r28Var;
        if (r28Var == null) {
            final byte b = 0;
            ?? r1 = new gn2(this) { // from class: r28
                public final /* synthetic */ t28 Y;

                {
                    this.Y = this;
                }

                @Override // defpackage.gn2
                public final Object B(Object obj) {
                    boolean z;
                    byte b2 = b;
                    x78 x78Var = null;
                    t28 t28Var = this.Y;
                    switch (b2) {
                        case 0:
                            List list = (List) obj;
                            x78 x78Var2 = t28Var.Y0().o;
                            if (x78Var2 != null) {
                                w78 w78Var = x78Var2.a;
                                ql qlVar = w78Var.a;
                                o88 o88Var = t28Var.r0;
                                fw0 fw0Var = t28Var.A0;
                                x78 x78Var3 = new x78(new w78(qlVar, o88.e(o88Var, fw0Var != null ? fw0Var.a() : dw0.g, 0L, 0L, 0, 0L, 16777214), w78Var.c, w78Var.d, w78Var.e, w78Var.f, w78Var.g, w78Var.h, w78Var.i, w78Var.j), x78Var2.b, x78Var2.c);
                                list.add(x78Var3);
                                x78Var = x78Var3;
                            }
                            return Boolean.valueOf(x78Var != null);
                        case 1:
                            ql qlVar2 = (ql) obj;
                            s28 s28Var = t28Var.G0;
                            d02 d02Var = d02.X;
                            if (s28Var == null) {
                                s28 s28Var2 = new s28(t28Var.q0, qlVar2);
                                ez4 ez4Var = new ez4(qlVar2, t28Var.r0, t28Var.s0, t28Var.u0, t28Var.v0, t28Var.w0, t28Var.x0, d02Var, t28Var.B0);
                                ez4Var.d(t28Var.Y0().k);
                                s28Var2.d = ez4Var;
                                t28Var.G0 = s28Var2;
                            } else if (!dh3.f(qlVar2, s28Var.b)) {
                                s28Var.b = qlVar2;
                                ez4 ez4Var2 = s28Var.d;
                                if (ez4Var2 != null) {
                                    o88 o88Var2 = t28Var.r0;
                                    fi2 fi2Var = t28Var.s0;
                                    int i = t28Var.u0;
                                    boolean z2 = t28Var.v0;
                                    int i2 = t28Var.w0;
                                    int i3 = t28Var.x0;
                                    mx mxVar = t28Var.B0;
                                    ez4Var2.a = qlVar2;
                                    ez4Var2.f(o88Var2);
                                    ez4Var2.b = fi2Var;
                                    ez4Var2.c = i;
                                    ez4Var2.d = z2;
                                    ez4Var2.e = i2;
                                    ez4Var2.f = i3;
                                    ez4Var2.g = d02Var;
                                    ez4Var2.h = mxVar;
                                    ez4Var2.s = (ez4Var2.s << 2) | 2;
                                    ez4Var2.m = null;
                                    ez4Var2.o = null;
                                    ez4Var2.q = -1;
                                    ez4Var2.p = -1;
                                    ez4Var2.r = null;
                                }
                            }
                            ch3.I(t28Var);
                            nr4.E(t28Var);
                            z68.W(t28Var);
                            return Boolean.TRUE;
                        default:
                            boolean zBooleanValue = ((Boolean) obj).booleanValue();
                            s28 s28Var3 = t28Var.G0;
                            if (s28Var3 == null) {
                                z = false;
                            } else {
                                gn2 gn2Var = t28Var.C0;
                                if (gn2Var != null) {
                                    gn2Var.B(s28Var3);
                                }
                                s28 s28Var4 = t28Var.G0;
                                if (s28Var4 != null) {
                                    s28Var4.c = zBooleanValue;
                                }
                                ch3.I(t28Var);
                                nr4.E(t28Var);
                                z68.W(t28Var);
                                z = true;
                            }
                            return Boolean.valueOf(z);
                    }
                }
            };
            this.F0 = r1;
            r0 = r1;
        }
        ql qlVar = this.q0;
        nw3[] nw3VarArr = d17.a;
        f17Var.a(c17.C, i21.K(qlVar));
        s28 s28Var = this.G0;
        if (s28Var != null) {
            ql qlVar2 = s28Var.b;
            e17 e17Var = c17.D;
            nw3[] nw3VarArr2 = d17.a;
            nw3 nw3Var = nw3VarArr2[16];
            e17Var.getClass();
            f17Var.a(e17Var, qlVar2);
            boolean z = s28Var.c;
            e17 e17Var2 = c17.E;
            nw3 nw3Var2 = nw3VarArr2[17];
            Boolean boolValueOf = Boolean.valueOf(z);
            e17Var2.getClass();
            f17Var.a(e17Var2, boolValueOf);
        }
        final byte b2 = 1;
        f17Var.a(s07.l, new q3(null, new gn2(this) { // from class: r28
            public final /* synthetic */ t28 Y;

            {
                this.Y = this;
            }

            @Override // defpackage.gn2
            public final Object B(Object obj) {
                boolean z2;
                byte b3 = b2;
                x78 x78Var = null;
                t28 t28Var = this.Y;
                switch (b3) {
                    case 0:
                        List list = (List) obj;
                        x78 x78Var2 = t28Var.Y0().o;
                        if (x78Var2 != null) {
                            w78 w78Var = x78Var2.a;
                            ql qlVar3 = w78Var.a;
                            o88 o88Var = t28Var.r0;
                            fw0 fw0Var = t28Var.A0;
                            x78 x78Var3 = new x78(new w78(qlVar3, o88.e(o88Var, fw0Var != null ? fw0Var.a() : dw0.g, 0L, 0L, 0, 0L, 16777214), w78Var.c, w78Var.d, w78Var.e, w78Var.f, w78Var.g, w78Var.h, w78Var.i, w78Var.j), x78Var2.b, x78Var2.c);
                            list.add(x78Var3);
                            x78Var = x78Var3;
                        }
                        return Boolean.valueOf(x78Var != null);
                    case 1:
                        ql qlVar4 = (ql) obj;
                        s28 s28Var2 = t28Var.G0;
                        d02 d02Var = d02.X;
                        if (s28Var2 == null) {
                            s28 s28Var3 = new s28(t28Var.q0, qlVar4);
                            ez4 ez4Var = new ez4(qlVar4, t28Var.r0, t28Var.s0, t28Var.u0, t28Var.v0, t28Var.w0, t28Var.x0, d02Var, t28Var.B0);
                            ez4Var.d(t28Var.Y0().k);
                            s28Var3.d = ez4Var;
                            t28Var.G0 = s28Var3;
                        } else if (!dh3.f(qlVar4, s28Var2.b)) {
                            s28Var2.b = qlVar4;
                            ez4 ez4Var2 = s28Var2.d;
                            if (ez4Var2 != null) {
                                o88 o88Var2 = t28Var.r0;
                                fi2 fi2Var = t28Var.s0;
                                int i = t28Var.u0;
                                boolean z3 = t28Var.v0;
                                int i2 = t28Var.w0;
                                int i3 = t28Var.x0;
                                mx mxVar = t28Var.B0;
                                ez4Var2.a = qlVar4;
                                ez4Var2.f(o88Var2);
                                ez4Var2.b = fi2Var;
                                ez4Var2.c = i;
                                ez4Var2.d = z3;
                                ez4Var2.e = i2;
                                ez4Var2.f = i3;
                                ez4Var2.g = d02Var;
                                ez4Var2.h = mxVar;
                                ez4Var2.s = (ez4Var2.s << 2) | 2;
                                ez4Var2.m = null;
                                ez4Var2.o = null;
                                ez4Var2.q = -1;
                                ez4Var2.p = -1;
                                ez4Var2.r = null;
                            }
                        }
                        ch3.I(t28Var);
                        nr4.E(t28Var);
                        z68.W(t28Var);
                        return Boolean.TRUE;
                    default:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        s28 s28Var4 = t28Var.G0;
                        if (s28Var4 == null) {
                            z2 = false;
                        } else {
                            gn2 gn2Var = t28Var.C0;
                            if (gn2Var != null) {
                                gn2Var.B(s28Var4);
                            }
                            s28 s28Var5 = t28Var.G0;
                            if (s28Var5 != null) {
                                s28Var5.c = zBooleanValue;
                            }
                            ch3.I(t28Var);
                            nr4.E(t28Var);
                            z68.W(t28Var);
                            z2 = true;
                        }
                        return Boolean.valueOf(z2);
                }
            }
        }));
        final byte b3 = 2;
        f17Var.a(s07.m, new q3(null, new gn2(this) { // from class: r28
            public final /* synthetic */ t28 Y;

            {
                this.Y = this;
            }

            @Override // defpackage.gn2
            public final Object B(Object obj) {
                boolean z2;
                byte b4 = b3;
                x78 x78Var = null;
                t28 t28Var = this.Y;
                switch (b4) {
                    case 0:
                        List list = (List) obj;
                        x78 x78Var2 = t28Var.Y0().o;
                        if (x78Var2 != null) {
                            w78 w78Var = x78Var2.a;
                            ql qlVar3 = w78Var.a;
                            o88 o88Var = t28Var.r0;
                            fw0 fw0Var = t28Var.A0;
                            x78 x78Var3 = new x78(new w78(qlVar3, o88.e(o88Var, fw0Var != null ? fw0Var.a() : dw0.g, 0L, 0L, 0, 0L, 16777214), w78Var.c, w78Var.d, w78Var.e, w78Var.f, w78Var.g, w78Var.h, w78Var.i, w78Var.j), x78Var2.b, x78Var2.c);
                            list.add(x78Var3);
                            x78Var = x78Var3;
                        }
                        return Boolean.valueOf(x78Var != null);
                    case 1:
                        ql qlVar4 = (ql) obj;
                        s28 s28Var2 = t28Var.G0;
                        d02 d02Var = d02.X;
                        if (s28Var2 == null) {
                            s28 s28Var3 = new s28(t28Var.q0, qlVar4);
                            ez4 ez4Var = new ez4(qlVar4, t28Var.r0, t28Var.s0, t28Var.u0, t28Var.v0, t28Var.w0, t28Var.x0, d02Var, t28Var.B0);
                            ez4Var.d(t28Var.Y0().k);
                            s28Var3.d = ez4Var;
                            t28Var.G0 = s28Var3;
                        } else if (!dh3.f(qlVar4, s28Var2.b)) {
                            s28Var2.b = qlVar4;
                            ez4 ez4Var2 = s28Var2.d;
                            if (ez4Var2 != null) {
                                o88 o88Var2 = t28Var.r0;
                                fi2 fi2Var = t28Var.s0;
                                int i = t28Var.u0;
                                boolean z3 = t28Var.v0;
                                int i2 = t28Var.w0;
                                int i3 = t28Var.x0;
                                mx mxVar = t28Var.B0;
                                ez4Var2.a = qlVar4;
                                ez4Var2.f(o88Var2);
                                ez4Var2.b = fi2Var;
                                ez4Var2.c = i;
                                ez4Var2.d = z3;
                                ez4Var2.e = i2;
                                ez4Var2.f = i3;
                                ez4Var2.g = d02Var;
                                ez4Var2.h = mxVar;
                                ez4Var2.s = (ez4Var2.s << 2) | 2;
                                ez4Var2.m = null;
                                ez4Var2.o = null;
                                ez4Var2.q = -1;
                                ez4Var2.p = -1;
                                ez4Var2.r = null;
                            }
                        }
                        ch3.I(t28Var);
                        nr4.E(t28Var);
                        z68.W(t28Var);
                        return Boolean.TRUE;
                    default:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        s28 s28Var4 = t28Var.G0;
                        if (s28Var4 == null) {
                            z2 = false;
                        } else {
                            gn2 gn2Var = t28Var.C0;
                            if (gn2Var != null) {
                                gn2Var.B(s28Var4);
                            }
                            s28 s28Var5 = t28Var.G0;
                            if (s28Var5 != null) {
                                s28Var5.c = zBooleanValue;
                            }
                            ch3.I(t28Var);
                            nr4.E(t28Var);
                            z68.W(t28Var);
                            z2 = true;
                        }
                        return Boolean.valueOf(z2);
                }
            }
        }));
        f17Var.a(s07.n, new q3(null, new hr5(this, (byte) 28)));
        d17.a(f17Var, r0);
    }

    @Override // defpackage.g34
    public final int i0(ug3 ug3Var, tr4 tr4Var, int i) {
        return z38.a(Z0(ug3Var).e(ug3Var.getLayoutDirection()).l());
    }

    @Override // defpackage.g34
    public final int m0(ug3 ug3Var, tr4 tr4Var, int i) {
        return z38.a(Z0(ug3Var).e(ug3Var.getLayoutDirection()).h());
    }

    @Override // defpackage.rv1
    public final void u0(p34 p34Var) {
        List list;
        if (this.p0) {
            sm0 sm0VarK = p34Var.X.Y.k();
            ez4 ez4VarZ0 = Z0(p34Var);
            x78 x78Var = ez4VarZ0.o;
            if (x78Var == null) {
                u52.r(ez4VarZ0, "Internal Error: MultiParagraphLayoutCache could not provide TextLayoutResult during the draw phase. Please report this bug on the official Issue Tracker with the following diagnostic information: ");
                return;
            }
            long j = x78Var.c;
            bz4 bz4Var = x78Var.b;
            boolean z = (((float) ((int) (j >> 32))) < bz4Var.d || x78Var.d()) && this.u0 != 3;
            if (z) {
                s86 s86VarN = u70.n(0L, (((long) Float.floatToRawIntBits((int) (j & 4294967295L))) & 4294967295L) | (((long) Float.floatToRawIntBits((int) (j >> 32))) << 32));
                sm0VarK.g();
                sm0.q(sm0VarK, s86VarN);
            }
            try {
                qe7 qe7Var = this.r0.a;
                x38 x38Var = qe7Var.m;
                if (x38Var == null) {
                    x38Var = x38.b;
                }
                x38 x38Var2 = x38Var;
                t67 t67Var = qe7Var.n;
                if (t67Var == null) {
                    t67Var = t67.d;
                }
                t67 t67Var2 = t67Var;
                tv1 tv1Var = qe7Var.p;
                if (tv1Var == null) {
                    tv1Var = ea2.a;
                }
                tv1 tv1Var2 = tv1Var;
                d90 d90VarC = qe7Var.a.c();
                if (d90VarC != null) {
                    bz4.i(bz4Var, sm0VarK, d90VarC, this.r0.a.a.a(), t67Var2, x38Var2, tv1Var2);
                } else {
                    fw0 fw0Var = this.A0;
                    long jA = fw0Var != null ? fw0Var.a() : dw0.g;
                    if (jA == 16) {
                        jA = this.r0.b() != 16 ? this.r0.b() : dw0.b;
                    }
                    bz4.h(bz4Var, sm0VarK, jA, t67Var2, x38Var2, tv1Var2);
                }
                if (z) {
                    sm0VarK.p();
                }
                s28 s28Var = this.G0;
                if (((s28Var == null || !s28Var.c) ? u28.i(this.q0) : false) || !((list = this.y0) == null || list.isEmpty())) {
                    p34Var.a();
                }
            } catch (Throwable th) {
                if (!z) {
                    throw th;
                }
                sm0VarK.p();
                throw th;
            }
        }
    }

    @Override // defpackage.g34
    public final int y0(ug3 ug3Var, tr4 tr4Var, int i) {
        return Z0(ug3Var).a(i, ug3Var.getLayoutDirection());
    }
}
