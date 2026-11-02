package defpackage;

import android.graphics.Paint;
import android.os.Trace;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class l88 extends jx4 implements g34, rv1, w07 {
    public j88 A0;
    public k88 B0;
    public String q0;
    public o88 r0;
    public fi2 s0;
    public int t0;
    public boolean u0;
    public int v0;
    public int w0;
    public fw0 x0;
    public HashMap y0;
    public wg5 z0;

    /* JADX WARN: Code duplicated, block: B:11:0x0013  */
    @Override // defpackage.g34
    public final int J0(ug3 ug3Var, tr4 tr4Var, int i) {
        wg5 wg5VarY0;
        zr4 zr4Var = (zr4) ug3Var;
        k88 k88Var = this.B0;
        if (k88Var == null) {
            wg5VarY0 = Y0();
        } else {
            if (!k88Var.c) {
                k88Var = null;
            }
            if (k88Var == null || (wg5VarY0 = k88Var.d) == null) {
                wg5VarY0 = Y0();
            }
        }
        wg5VarY0.d(zr4Var);
        return wg5VarY0.a(i, ug3Var.getLayoutDirection());
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0015 A[Catch: all -> 0x00c9, TryCatch #0 {all -> 0x00c9, blocks: (B:3:0x0005, B:5:0x0009, B:10:0x0011, B:13:0x0019, B:15:0x0028, B:16:0x002b, B:18:0x0036, B:20:0x0042, B:21:0x0049, B:24:0x0059, B:26:0x0069, B:28:0x0084, B:30:0x0094, B:29:0x008d, B:25:0x0062, B:31:0x00a1, B:12:0x0015), top: B:37:0x0005 }] */
    @Override // defpackage.g34
    public final yr4 K(zr4 zr4Var, tr4 tr4Var, long j) {
        wg5 wg5VarY0;
        Trace.beginSection("TextStringSimpleNode::measure");
        try {
            k88 k88Var = this.B0;
            if (k88Var == null) {
                wg5VarY0 = Y0();
            } else {
                if (!k88Var.c) {
                    k88Var = null;
                }
                if (k88Var == null || (wg5VarY0 = k88Var.d) == null) {
                    wg5VarY0 = Y0();
                }
            }
            wg5VarY0.d(zr4Var);
            boolean zB = wg5VarY0.b(j, zr4Var.getLayoutDirection());
            vg5 vg5Var = wg5VarY0.n;
            if (vg5Var != null) {
                vg5Var.b();
            }
            ff ffVar = wg5VarY0.j;
            ffVar.getClass();
            v78 v78Var = ffVar.d;
            long j2 = wg5VarY0.l;
            if (zB) {
                yn0.X(this, 2).d1();
                HashMap map = this.y0;
                if (map == null) {
                    map = new HashMap(2);
                    this.y0 = map;
                }
                t03 t03Var = u8.a;
                Paint.FontMetricsInt fontMetricsInt = v78Var.l;
                map.put(t03Var, Integer.valueOf(Math.round(v78Var.h + ((v78Var.g + (-1) != 0 || fontMetricsInt == null) ? v78Var.f.getLineBaseline(0) : v78Var.h(0) - fontMetricsInt.ascent) + 0.0f)));
                t03 t03Var2 = u8.b;
                int i = v78Var.g - 1;
                Paint.FontMetricsInt fontMetricsInt2 = v78Var.l;
                map.put(t03Var2, Integer.valueOf(Math.round(v78Var.h + (fontMetricsInt2 != null ? v78Var.h(i) - fontMetricsInt2.ascent : v78Var.f.getLineBaseline(i)) + 0.0f)));
            }
            int i2 = (int) (j2 >> 32);
            int i3 = (int) (j2 & 4294967295L);
            eo5 eo5VarO = tr4Var.o(z68.B(i2, i2, i3, i3));
            HashMap map2 = this.y0;
            map2.getClass();
            return zr4Var.g0(i2, i3, map2, new d1(eo5VarO, (byte) 17));
        } finally {
            Trace.endSection();
        }
    }

    @Override // defpackage.jx4
    public final boolean N0() {
        return false;
    }

    public final wg5 Y0() {
        o88 o88Var = this.r0;
        wg5 wg5Var = this.z0;
        if (wg5Var == null) {
            wg5Var = new wg5(this.q0, o88Var, this.s0, this.t0, this.u0, this.v0, this.w0);
            this.z0 = wg5Var;
        }
        wg5Var.getClass();
        return wg5Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [gn2] */
    /* JADX WARN: Type inference failed for: r0v2, types: [j88] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    @Override // defpackage.w07
    public final void h(f17 f17Var) {
        j88 j88Var = this.A0;
        ?? r0 = j88Var;
        if (j88Var == null) {
            final byte b = 0;
            ?? r1 = new gn2(this) { // from class: j88
                public final /* synthetic */ l88 Y;

                {
                    this.Y = this;
                }

                /* JADX WARN: Code duplicated, block: B:27:0x00c2  */
                @Override // defpackage.gn2
                public final Object B(Object obj) {
                    fi1 fi1Var;
                    x78 x78Var;
                    byte b2 = b;
                    boolean z = true;
                    l88 l88Var = this.Y;
                    switch (b2) {
                        case 0:
                            List list = (List) obj;
                            wg5 wg5VarY0 = l88Var.Y0();
                            o88 o88Var = l88Var.r0;
                            fw0 fw0Var = l88Var.x0;
                            o88 o88VarE = o88.e(o88Var, fw0Var != null ? fw0Var.a() : dw0.g, 0L, 0L, 0, 0L, 16777214);
                            z24 z24Var = wg5VarY0.o;
                            x78 x78Var2 = null;
                            if (z24Var == null || (fi1Var = wg5VarY0.i) == null) {
                                x78Var = null;
                            } else {
                                ql qlVar = new ql(wg5VarY0.a);
                                if (wg5VarY0.j == null || wg5VarY0.n == null) {
                                    x78Var = null;
                                } else {
                                    long j = wg5VarY0.p & (-8589934589L);
                                    int i = wg5VarY0.f;
                                    boolean z2 = wg5VarY0.e;
                                    int i2 = wg5VarY0.d;
                                    fi2 fi2Var = wg5VarY0.c;
                                    d02 d02Var = d02.X;
                                    x78Var = new x78(new w78(qlVar, o88VarE, d02Var, i, z2, i2, fi1Var, z24Var, fi2Var, j), new bz4(new y5(qlVar, o88VarE, d02Var, fi1Var, fi2Var, z2), j, wg5VarY0.f, wg5VarY0.d), wg5VarY0.l);
                                }
                            }
                            if (x78Var != null) {
                                list.add(x78Var);
                                x78Var2 = x78Var;
                            }
                            return Boolean.valueOf(x78Var2 != null);
                        case 1:
                            String str = ((ql) obj).Y;
                            k88 k88Var = l88Var.B0;
                            if (k88Var == null) {
                                k88 k88Var2 = new k88(l88Var.q0, str);
                                wg5 wg5Var = new wg5(str, l88Var.r0, l88Var.s0, l88Var.t0, l88Var.u0, l88Var.v0, l88Var.w0);
                                wg5Var.d(l88Var.Y0().i);
                                k88Var2.d = wg5Var;
                                l88Var.B0 = k88Var2;
                            } else if (!dh3.f(str, k88Var.b)) {
                                k88Var.b = str;
                                wg5 wg5Var2 = k88Var.d;
                                if (wg5Var2 != null) {
                                    o88 o88Var2 = l88Var.r0;
                                    fi2 fi2Var2 = l88Var.s0;
                                    int i3 = l88Var.t0;
                                    boolean z3 = l88Var.u0;
                                    int i4 = l88Var.v0;
                                    int i5 = l88Var.w0;
                                    wg5Var2.a = str;
                                    wg5Var2.b = o88Var2;
                                    wg5Var2.c = fi2Var2;
                                    wg5Var2.d = i3;
                                    wg5Var2.e = z3;
                                    wg5Var2.f = i4;
                                    wg5Var2.g = i5;
                                    wg5Var2.s = (wg5Var2.s << 2) | 2;
                                    wg5Var2.c();
                                }
                            }
                            ch3.I(l88Var);
                            nr4.E(l88Var);
                            z68.W(l88Var);
                            return Boolean.TRUE;
                        default:
                            boolean zBooleanValue = ((Boolean) obj).booleanValue();
                            k88 k88Var3 = l88Var.B0;
                            if (k88Var3 == null) {
                                z = false;
                            } else {
                                k88Var3.c = zBooleanValue;
                                ch3.I(l88Var);
                                nr4.E(l88Var);
                                z68.W(l88Var);
                            }
                            return Boolean.valueOf(z);
                    }
                }
            };
            this.A0 = r1;
            r0 = r1;
        }
        ql qlVar = new ql(this.q0);
        nw3[] nw3VarArr = d17.a;
        f17Var.a(c17.C, i21.K(qlVar));
        k88 k88Var = this.B0;
        if (k88Var != null) {
            boolean z = k88Var.c;
            e17 e17Var = c17.E;
            nw3[] nw3VarArr2 = d17.a;
            nw3 nw3Var = nw3VarArr2[17];
            Boolean boolValueOf = Boolean.valueOf(z);
            e17Var.getClass();
            f17Var.a(e17Var, boolValueOf);
            ql qlVar2 = new ql(k88Var.b);
            e17 e17Var2 = c17.D;
            nw3 nw3Var2 = nw3VarArr2[16];
            e17Var2.getClass();
            f17Var.a(e17Var2, qlVar2);
        }
        final byte b2 = 1;
        f17Var.a(s07.l, new q3(null, new gn2(this) { // from class: j88
            public final /* synthetic */ l88 Y;

            {
                this.Y = this;
            }

            /* JADX WARN: Code duplicated, block: B:27:0x00c2  */
            @Override // defpackage.gn2
            public final Object B(Object obj) {
                fi1 fi1Var;
                x78 x78Var;
                byte b3 = b2;
                boolean z2 = true;
                l88 l88Var = this.Y;
                switch (b3) {
                    case 0:
                        List list = (List) obj;
                        wg5 wg5VarY0 = l88Var.Y0();
                        o88 o88Var = l88Var.r0;
                        fw0 fw0Var = l88Var.x0;
                        o88 o88VarE = o88.e(o88Var, fw0Var != null ? fw0Var.a() : dw0.g, 0L, 0L, 0, 0L, 16777214);
                        z24 z24Var = wg5VarY0.o;
                        x78 x78Var2 = null;
                        if (z24Var == null || (fi1Var = wg5VarY0.i) == null) {
                            x78Var = null;
                        } else {
                            ql qlVar3 = new ql(wg5VarY0.a);
                            if (wg5VarY0.j == null || wg5VarY0.n == null) {
                                x78Var = null;
                            } else {
                                long j = wg5VarY0.p & (-8589934589L);
                                int i = wg5VarY0.f;
                                boolean z3 = wg5VarY0.e;
                                int i2 = wg5VarY0.d;
                                fi2 fi2Var = wg5VarY0.c;
                                d02 d02Var = d02.X;
                                x78Var = new x78(new w78(qlVar3, o88VarE, d02Var, i, z3, i2, fi1Var, z24Var, fi2Var, j), new bz4(new y5(qlVar3, o88VarE, d02Var, fi1Var, fi2Var, z3), j, wg5VarY0.f, wg5VarY0.d), wg5VarY0.l);
                            }
                        }
                        if (x78Var != null) {
                            list.add(x78Var);
                            x78Var2 = x78Var;
                        }
                        return Boolean.valueOf(x78Var2 != null);
                    case 1:
                        String str = ((ql) obj).Y;
                        k88 k88Var2 = l88Var.B0;
                        if (k88Var2 == null) {
                            k88 k88Var3 = new k88(l88Var.q0, str);
                            wg5 wg5Var = new wg5(str, l88Var.r0, l88Var.s0, l88Var.t0, l88Var.u0, l88Var.v0, l88Var.w0);
                            wg5Var.d(l88Var.Y0().i);
                            k88Var3.d = wg5Var;
                            l88Var.B0 = k88Var3;
                        } else if (!dh3.f(str, k88Var2.b)) {
                            k88Var2.b = str;
                            wg5 wg5Var2 = k88Var2.d;
                            if (wg5Var2 != null) {
                                o88 o88Var2 = l88Var.r0;
                                fi2 fi2Var2 = l88Var.s0;
                                int i3 = l88Var.t0;
                                boolean z4 = l88Var.u0;
                                int i4 = l88Var.v0;
                                int i5 = l88Var.w0;
                                wg5Var2.a = str;
                                wg5Var2.b = o88Var2;
                                wg5Var2.c = fi2Var2;
                                wg5Var2.d = i3;
                                wg5Var2.e = z4;
                                wg5Var2.f = i4;
                                wg5Var2.g = i5;
                                wg5Var2.s = (wg5Var2.s << 2) | 2;
                                wg5Var2.c();
                            }
                        }
                        ch3.I(l88Var);
                        nr4.E(l88Var);
                        z68.W(l88Var);
                        return Boolean.TRUE;
                    default:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        k88 k88Var4 = l88Var.B0;
                        if (k88Var4 == null) {
                            z2 = false;
                        } else {
                            k88Var4.c = zBooleanValue;
                            ch3.I(l88Var);
                            nr4.E(l88Var);
                            z68.W(l88Var);
                        }
                        return Boolean.valueOf(z2);
                }
            }
        }));
        final byte b3 = 2;
        f17Var.a(s07.m, new q3(null, new gn2(this) { // from class: j88
            public final /* synthetic */ l88 Y;

            {
                this.Y = this;
            }

            /* JADX WARN: Code duplicated, block: B:27:0x00c2  */
            @Override // defpackage.gn2
            public final Object B(Object obj) {
                fi1 fi1Var;
                x78 x78Var;
                byte b4 = b3;
                boolean z2 = true;
                l88 l88Var = this.Y;
                switch (b4) {
                    case 0:
                        List list = (List) obj;
                        wg5 wg5VarY0 = l88Var.Y0();
                        o88 o88Var = l88Var.r0;
                        fw0 fw0Var = l88Var.x0;
                        o88 o88VarE = o88.e(o88Var, fw0Var != null ? fw0Var.a() : dw0.g, 0L, 0L, 0, 0L, 16777214);
                        z24 z24Var = wg5VarY0.o;
                        x78 x78Var2 = null;
                        if (z24Var == null || (fi1Var = wg5VarY0.i) == null) {
                            x78Var = null;
                        } else {
                            ql qlVar3 = new ql(wg5VarY0.a);
                            if (wg5VarY0.j == null || wg5VarY0.n == null) {
                                x78Var = null;
                            } else {
                                long j = wg5VarY0.p & (-8589934589L);
                                int i = wg5VarY0.f;
                                boolean z3 = wg5VarY0.e;
                                int i2 = wg5VarY0.d;
                                fi2 fi2Var = wg5VarY0.c;
                                d02 d02Var = d02.X;
                                x78Var = new x78(new w78(qlVar3, o88VarE, d02Var, i, z3, i2, fi1Var, z24Var, fi2Var, j), new bz4(new y5(qlVar3, o88VarE, d02Var, fi1Var, fi2Var, z3), j, wg5VarY0.f, wg5VarY0.d), wg5VarY0.l);
                            }
                        }
                        if (x78Var != null) {
                            list.add(x78Var);
                            x78Var2 = x78Var;
                        }
                        return Boolean.valueOf(x78Var2 != null);
                    case 1:
                        String str = ((ql) obj).Y;
                        k88 k88Var2 = l88Var.B0;
                        if (k88Var2 == null) {
                            k88 k88Var3 = new k88(l88Var.q0, str);
                            wg5 wg5Var = new wg5(str, l88Var.r0, l88Var.s0, l88Var.t0, l88Var.u0, l88Var.v0, l88Var.w0);
                            wg5Var.d(l88Var.Y0().i);
                            k88Var3.d = wg5Var;
                            l88Var.B0 = k88Var3;
                        } else if (!dh3.f(str, k88Var2.b)) {
                            k88Var2.b = str;
                            wg5 wg5Var2 = k88Var2.d;
                            if (wg5Var2 != null) {
                                o88 o88Var2 = l88Var.r0;
                                fi2 fi2Var2 = l88Var.s0;
                                int i3 = l88Var.t0;
                                boolean z4 = l88Var.u0;
                                int i4 = l88Var.v0;
                                int i5 = l88Var.w0;
                                wg5Var2.a = str;
                                wg5Var2.b = o88Var2;
                                wg5Var2.c = fi2Var2;
                                wg5Var2.d = i3;
                                wg5Var2.e = z4;
                                wg5Var2.f = i4;
                                wg5Var2.g = i5;
                                wg5Var2.s = (wg5Var2.s << 2) | 2;
                                wg5Var2.c();
                            }
                        }
                        ch3.I(l88Var);
                        nr4.E(l88Var);
                        z68.W(l88Var);
                        return Boolean.TRUE;
                    default:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        k88 k88Var4 = l88Var.B0;
                        if (k88Var4 == null) {
                            z2 = false;
                        } else {
                            k88Var4.c = zBooleanValue;
                            ch3.I(l88Var);
                            nr4.E(l88Var);
                            z68.W(l88Var);
                        }
                        return Boolean.valueOf(z2);
                }
            }
        }));
        f17Var.a(s07.n, new q3(null, new v38(this, (byte) 4)));
        d17.a(f17Var, r0);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0013  */
    @Override // defpackage.g34
    public final int i0(ug3 ug3Var, tr4 tr4Var, int i) {
        wg5 wg5VarY0;
        zr4 zr4Var = (zr4) ug3Var;
        k88 k88Var = this.B0;
        if (k88Var == null) {
            wg5VarY0 = Y0();
        } else {
            if (!k88Var.c) {
                k88Var = null;
            }
            if (k88Var == null || (wg5VarY0 = k88Var.d) == null) {
                wg5VarY0 = Y0();
            }
        }
        wg5VarY0.d(zr4Var);
        return z38.a(wg5VarY0.e(ug3Var.getLayoutDirection()).l());
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0013  */
    @Override // defpackage.g34
    public final int m0(ug3 ug3Var, tr4 tr4Var, int i) {
        wg5 wg5VarY0;
        zr4 zr4Var = (zr4) ug3Var;
        k88 k88Var = this.B0;
        if (k88Var == null) {
            wg5VarY0 = Y0();
        } else {
            if (!k88Var.c) {
                k88Var = null;
            }
            if (k88Var == null || (wg5VarY0 = k88Var.d) == null) {
                wg5VarY0 = Y0();
            }
        }
        wg5VarY0.d(zr4Var);
        return z38.a(wg5VarY0.e(ug3Var.getLayoutDirection()).h());
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0016  */
    @Override // defpackage.rv1
    public final void u0(p34 p34Var) {
        wg5 wg5VarY0;
        if (this.p0) {
            k88 k88Var = this.B0;
            if (k88Var == null) {
                wg5VarY0 = Y0();
            } else {
                if (!k88Var.c) {
                    k88Var = null;
                }
                if (k88Var == null || (wg5VarY0 = k88Var.d) == null) {
                    wg5VarY0 = Y0();
                }
            }
            ff ffVar = wg5VarY0.j;
            if (ffVar == null) {
                zc3.b("Internal Error: ParagraphLayoutCache could not provide a Paragraph during the draw phase. Please report this bug on the official Issue Tracker with the following diagnostic information: (layoutCache=" + this.z0 + ", textSubstitution=" + this.B0 + ")");
                b61.n();
                return;
            }
            sm0 sm0VarK = p34Var.X.Y.k();
            boolean z = wg5VarY0.k;
            if (z) {
                long j = wg5VarY0.l;
                sm0VarK.g();
                sm0VarK.m(0.0f, 0.0f, (int) (j >> 32), (int) (j & 4294967295L), 1);
            }
            try {
                o88 o88Var = this.r0;
                qe7 qe7Var = o88Var.a;
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
                    ffVar.f(sm0VarK, d90VarC, o88Var.a.a.a(), t67Var2, x38Var2, tv1Var2);
                } else {
                    fw0 fw0Var = this.x0;
                    long jA = fw0Var != null ? fw0Var.a() : dw0.g;
                    if (jA == 16) {
                        jA = o88Var.b() != 16 ? o88Var.b() : dw0.b;
                    }
                    ffVar.e(sm0VarK, jA, t67Var2, x38Var2, tv1Var2);
                }
            } finally {
                if (z) {
                    sm0VarK.p();
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0013  */
    @Override // defpackage.g34
    public final int y0(ug3 ug3Var, tr4 tr4Var, int i) {
        wg5 wg5VarY0;
        zr4 zr4Var = (zr4) ug3Var;
        k88 k88Var = this.B0;
        if (k88Var == null) {
            wg5VarY0 = Y0();
        } else {
            if (!k88Var.c) {
                k88Var = null;
            }
            if (k88Var == null || (wg5VarY0 = k88Var.d) == null) {
                wg5VarY0 = Y0();
            }
        }
        wg5VarY0.d(zr4Var);
        return wg5VarY0.a(i, ug3Var.getLayoutDirection());
    }
}
