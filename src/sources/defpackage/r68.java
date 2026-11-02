package defpackage;

import android.content.ClipDescription;
import io.sentry.c2;
import java.util.ArrayList;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class r68 {
    public final kd8 a;
    public final y78 b;
    public fi1 c;
    public final ub8 d;
    public final b71 e;
    public final ip5 f;
    public iu0 g;
    public boolean h;
    public boolean i;
    public ez2 j;
    public dn2 l;
    public dn2 m;
    public final rh5 r;
    public final rh5 s;
    public final rh5 t;
    public o8 u;
    public int v;
    public ft5 w;
    public final zi1 x;
    public final h70 y;
    public final rh5 k = z51.H(Boolean.TRUE);
    public final rh5 n = z51.H(new z85(9205357640488583168L));
    public final rh5 o = z51.H(new z85(9205357640488583168L));
    public final rh5 p = z51.H(null);
    public final rh5 q = z51.H(g68.X);

    public r68(kd8 kd8Var, y78 y78Var, fi1 fi1Var, boolean z, ub8 ub8Var, b71 b71Var, ip5 ip5Var, iu0 iu0Var) {
        this.a = kd8Var;
        this.b = y78Var;
        this.c = fi1Var;
        this.d = ub8Var;
        this.e = b71Var;
        this.f = ip5Var;
        this.g = iu0Var;
        this.i = z;
        Boolean bool = Boolean.FALSE;
        this.r = z51.H(bool);
        this.s = z51.H(s88.X);
        this.t = z51.H(bool);
        this.v = -1;
        this.x = rd7.b(new n30(this, (byte) 3));
        this.y = new h70((Object) this.g, (byte) 2);
    }

    public static final void f(da6 da6Var, da6 da6Var2, r68 r68Var) {
        if ((da6Var.X & 9223372034707292159L) != 9205357640488583168L) {
            da6Var.X = 9205357640488583168L;
            da6Var2.X = 9205357640488583168L;
            r68Var.b();
        }
    }

    public static final void h(da6 da6Var, da6 da6Var2, r68 r68Var) {
        if ((da6Var.X & 9223372034707292159L) != 9205357640488583168L) {
            r68Var.b();
            da6Var.X = 9205357640488583168L;
            da6Var2.X = 0L;
            r68Var.v = -1;
        }
    }

    public final dn8 A() {
        ClipDescription primaryClipDescription;
        h70 h70Var = this.y;
        iu0 iu0Var = (iu0) h70Var.Z;
        boolean z = false;
        if (zc1.P(iu0Var).hasPrimaryClip() && (primaryClipDescription = zc1.P(iu0Var).getPrimaryClipDescription()) != null && primaryClipDescription.hasMimeType("text/*")) {
            z = true;
        }
        h70Var.Y = z;
        return dn8.a;
    }

    public final void B(ev2 ev2Var, long j) {
        this.p.setValue(ev2Var);
        this.o.setValue(new z85(j));
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:43:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:49:0x00df  */
    /* JADX WARN: Code duplicated, block: B:53:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:55:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:61:0x0104  */
    /* JADX WARN: Code duplicated, block: B:63:0x010f  */
    /* JADX WARN: Code duplicated, block: B:64:0x0116  */
    /* JADX WARN: Code duplicated, block: B:65:0x011d  */
    /* JADX WARN: Code duplicated, block: B:67:0x0135  */
    /* JADX WARN: Code duplicated, block: B:68:0x0137  */
    /* JADX WARN: Code duplicated, block: B:70:0x0140  */
    /* JADX WARN: Code duplicated, block: B:72:0x0158  */
    /* JADX WARN: Code duplicated, block: B:73:0x015a  */
    /* JADX WARN: Code duplicated, block: B:78:0x016f  */
    /* JADX WARN: Code duplicated, block: B:81:0x0175  */
    public final long C(h48 h48Var, int i, int i2, boolean z, kp5 kp5Var, boolean z2, boolean z3, fz2 fz2Var) {
        b07 b07Var;
        byte b;
        q71 q71Var;
        b07 b07Var2;
        boolean z4;
        boolean z5;
        long jC;
        xr0 xr0Var;
        a07 a07Var;
        a07 a07Var2;
        a07 a07VarU;
        a07 a07Var3;
        a07 a07Var4;
        boolean z6;
        f88 f88Var;
        ez2 ez2Var;
        int i3 = i;
        long j = h48Var.f0;
        f88 f88Var2 = new f88(j);
        if (z3 || (!z2 && f88.b(j))) {
            f88Var2 = null;
        }
        x78 x78VarC = this.b.c();
        if (x78VarC != null) {
            if (f88Var2 == null && dh3.f(kp5Var, lh4.A0)) {
                jC = ct7.c(i, i2);
            } else {
                int i4 = this.v;
                long j2 = f88Var2 != null ? f88Var2.a : f88.b;
                if (f88Var2 == null) {
                    b07Var = null;
                } else {
                    int i5 = (int) (j2 >> 32);
                    long j3 = j2;
                    int i6 = (int) (j3 & 4294967295L);
                    b07Var = new b07(new a07(z91.G(x78VarC, i5), i5, 1L), new a07(z91.G(x78VarC, i6), i6, 1L), f88.e(j3));
                }
                o8 o8Var = new o8((byte) 10, b07Var, new xr0(i3, i2, i4, x78VarC), z);
                if (f88Var2 != 0) {
                    o8 o8Var2 = this.u;
                    if (b07Var == null || o8Var2 == null || z != o8Var2.Y) {
                        b = kp5Var.X;
                        q71Var = q71.X;
                        switch (b) {
                            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.mtuMin /* 21 */:
                                xr0 xr0Var2 = (xr0) o8Var.f0;
                                a07 a07VarC = xr0Var2.c(xr0Var2.b);
                                a07 a07VarC2 = xr0Var2.c(xr0Var2.c);
                                if (o8Var.k() == q71Var) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                b07Var2 = new b07(a07VarC, a07VarC2, z4);
                                break;
                            case 22:
                                xr0 xr0Var3 = (xr0) o8Var.f0;
                                a07 a07VarC3 = xr0Var3.c(xr0Var3.b);
                                a07 a07VarC4 = xr0Var3.c(xr0Var3.c);
                                if (o8Var.k() == q71Var) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                                b07Var2 = w51.w(new b07(a07VarC3, a07VarC4, z5), o8Var);
                                break;
                            case 23:
                                b07Var2 = w51.e(o8Var, qe4.t0);
                                break;
                            case 24:
                                b07Var2 = w51.e(o8Var, lh4.y0);
                                break;
                            default:
                                b07Var2 = (b07) o8Var.Z;
                                xr0Var = (xr0) o8Var.f0;
                                if (b07Var2 != null) {
                                    a07Var = b07Var2.b;
                                    a07Var2 = b07Var2.a;
                                    if (o8Var.Y) {
                                        a07VarU = w51.U(o8Var, xr0Var, a07Var2);
                                        a07Var4 = a07Var;
                                        a07Var = a07Var2;
                                        a07Var3 = a07VarU;
                                    } else {
                                        a07VarU = w51.U(o8Var, xr0Var, a07Var);
                                        a07Var3 = a07Var2;
                                        a07Var4 = a07VarU;
                                    }
                                    if (!dh3.f(a07VarU, a07Var)) {
                                        if (o8Var.k() != q71Var || (o8Var.k() == q71.Z && a07Var3.b > a07Var4.b)) {
                                            z6 = true;
                                        } else {
                                            z6 = false;
                                        }
                                        b07Var2 = w51.w(new b07(a07Var3, a07Var4, z6), o8Var);
                                    }
                                } else {
                                    b07Var2 = w51.e(o8Var, qe4.t0);
                                }
                                break;
                        }
                        long jC2 = ct7.c(b07Var2.a.b, b07Var2.b.b);
                        this.u = o8Var;
                        if (!z) {
                            i3 = i2;
                        }
                        this.v = i3;
                        jC = jC2;
                    } else {
                        xr0 xr0Var4 = (xr0) o8Var2.f0;
                        if (i3 == xr0Var4.b && i2 == xr0Var4.c) {
                            jC = f88Var.a;
                        } else {
                            b = kp5Var.X;
                            q71Var = q71.X;
                            switch (b) {
                                case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.mtuMin /* 21 */:
                                    xr0 xr0Var5 = (xr0) o8Var.f0;
                                    a07 a07VarC5 = xr0Var5.c(xr0Var5.b);
                                    a07 a07VarC6 = xr0Var5.c(xr0Var5.c);
                                    if (o8Var.k() == q71Var) {
                                        z4 = true;
                                    } else {
                                        z4 = false;
                                    }
                                    b07Var2 = new b07(a07VarC5, a07VarC6, z4);
                                    break;
                                case 22:
                                    xr0 xr0Var6 = (xr0) o8Var.f0;
                                    a07 a07VarC7 = xr0Var6.c(xr0Var6.b);
                                    a07 a07VarC8 = xr0Var6.c(xr0Var6.c);
                                    if (o8Var.k() == q71Var) {
                                        z5 = true;
                                    } else {
                                        z5 = false;
                                    }
                                    b07Var2 = w51.w(new b07(a07VarC7, a07VarC8, z5), o8Var);
                                    break;
                                case 23:
                                    b07Var2 = w51.e(o8Var, qe4.t0);
                                    break;
                                case 24:
                                    b07Var2 = w51.e(o8Var, lh4.y0);
                                    break;
                                default:
                                    b07Var2 = (b07) o8Var.Z;
                                    xr0Var = (xr0) o8Var.f0;
                                    if (b07Var2 != null) {
                                        a07Var = b07Var2.b;
                                        a07Var2 = b07Var2.a;
                                        if (o8Var.Y) {
                                            a07VarU = w51.U(o8Var, xr0Var, a07Var2);
                                            a07Var4 = a07Var;
                                            a07Var = a07Var2;
                                            a07Var3 = a07VarU;
                                        } else {
                                            a07VarU = w51.U(o8Var, xr0Var, a07Var);
                                            a07Var3 = a07Var2;
                                            a07Var4 = a07VarU;
                                        }
                                        if (!dh3.f(a07VarU, a07Var)) {
                                            if (o8Var.k() != q71Var) {
                                                z6 = true;
                                            } else {
                                                z6 = true;
                                            }
                                            b07Var2 = w51.w(new b07(a07Var3, a07Var4, z6), o8Var);
                                        }
                                    } else {
                                        b07Var2 = w51.e(o8Var, qe4.t0);
                                    }
                                    break;
                            }
                            long jC3 = ct7.c(b07Var2.a.b, b07Var2.b.b);
                            this.u = o8Var;
                            if (!z) {
                                i3 = i2;
                            }
                            this.v = i3;
                            jC = jC3;
                        }
                    }
                } else {
                    b = kp5Var.X;
                    q71Var = q71.X;
                    switch (b) {
                        case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.mtuMin /* 21 */:
                            xr0 xr0Var7 = (xr0) o8Var.f0;
                            a07 a07VarC9 = xr0Var7.c(xr0Var7.b);
                            a07 a07VarC10 = xr0Var7.c(xr0Var7.c);
                            if (o8Var.k() == q71Var) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            b07Var2 = new b07(a07VarC9, a07VarC10, z4);
                            break;
                        case 22:
                            xr0 xr0Var8 = (xr0) o8Var.f0;
                            a07 a07VarC11 = xr0Var8.c(xr0Var8.b);
                            a07 a07VarC12 = xr0Var8.c(xr0Var8.c);
                            if (o8Var.k() == q71Var) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            b07Var2 = w51.w(new b07(a07VarC11, a07VarC12, z5), o8Var);
                            break;
                        case 23:
                            b07Var2 = w51.e(o8Var, qe4.t0);
                            break;
                        case 24:
                            b07Var2 = w51.e(o8Var, lh4.y0);
                            break;
                        default:
                            b07Var2 = (b07) o8Var.Z;
                            xr0Var = (xr0) o8Var.f0;
                            if (b07Var2 != null) {
                                a07Var = b07Var2.b;
                                a07Var2 = b07Var2.a;
                                if (o8Var.Y) {
                                    a07VarU = w51.U(o8Var, xr0Var, a07Var2);
                                    a07Var4 = a07Var;
                                    a07Var = a07Var2;
                                    a07Var3 = a07VarU;
                                } else {
                                    a07VarU = w51.U(o8Var, xr0Var, a07Var);
                                    a07Var3 = a07Var2;
                                    a07Var4 = a07VarU;
                                }
                                if (!dh3.f(a07VarU, a07Var)) {
                                    if (o8Var.k() != q71Var) {
                                        z6 = true;
                                    } else {
                                        z6 = true;
                                    }
                                    b07Var2 = w51.w(new b07(a07Var3, a07Var4, z6), o8Var);
                                }
                            } else {
                                b07Var2 = w51.e(o8Var, qe4.t0);
                            }
                            break;
                    }
                    long jC4 = ct7.c(b07Var2.a.b, b07Var2.b.b);
                    this.u = o8Var;
                    if (!z) {
                        i3 = i2;
                    }
                    this.v = i3;
                    jC = jC4;
                }
            }
            if (fz2Var != null) {
                f88Var = f88Var2;
                if ((f88.d(jC) == f88.d(j) || f88.c(jC) != f88.c(j)) && (ez2Var = this.j) != null) {
                    ((so5) ez2Var).a(fz2Var.a);
                }
            }
            f88Var = f88Var2;
            return jC;
        }
        jC = f88.b;
        j = j;
        if (fz2Var != null) {
            f88Var = f88Var2;
            if (f88.d(jC) == f88.d(j)) {
                ((so5) ez2Var).a(fz2Var.a);
            } else {
                ((so5) ez2Var).a(fz2Var.a);
            }
        }
        f88Var = f88Var2;
        return jC;
    }

    public final s86 a(x78 x78Var, h48 h48Var) {
        float f;
        if (!f88.b(h48Var.f0)) {
            return s86.e;
        }
        s86 s86VarC = x78Var.c((int) (h48Var.f0 >> 32));
        float fFloor = (float) Math.floor(this.c.h0(2.0f));
        if (fFloor < 1.0f) {
            fFloor = 1.0f;
        }
        if (x78Var.a.h == z24.X) {
            f = (fFloor / 2.0f) + s86VarC.a;
        } else {
            f = s86VarC.c - (fFloor / 2.0f);
        }
        float f2 = fFloor / 2.0f;
        float f3 = ((int) (x78Var.c >> 32)) - f2;
        if (f > f3) {
            f = f3;
        }
        if (f < f2) {
            f = f2;
        }
        float fFloor2 = ((int) fFloor) % 2 == 1 ? ((float) Math.floor(f)) + 0.5f : (float) Math.rint(f);
        return new s86(fFloor2 - f2, s86VarC.b, fFloor2 + f2, s86VarC.d);
    }

    public final void b() {
        this.p.setValue(null);
        this.o.setValue(new z85(9205357640488583168L));
        this.n.setValue(new z85(9205357640488583168L));
    }

    public final dn8 c(boolean z, uy7 uy7Var) {
        ql qlVar;
        kd8 kd8Var = this.a;
        if (f88.b(kd8Var.d().f0)) {
            qlVar = null;
        } else {
            h48 h48VarD = kd8Var.d();
            qlVar = new ql(h48VarD.Z.subSequence(f88.d(h48VarD.f0), f88.c(h48VarD.f0)).toString());
            if (z) {
                kd8Var.a();
            }
        }
        dn8 dn8Var = dn8.a;
        if (qlVar == null) {
            return dn8Var;
        }
        ((kb) this.g).a(z39.J(qlVar));
        return dn8Var;
    }

    public final dn8 d(uy7 uy7Var) {
        ql qlVar;
        kd8 kd8Var = this.a;
        if (f88.b(kd8Var.d().f0) || !m()) {
            qlVar = null;
        } else {
            h48 h48VarD = kd8Var.d();
            qlVar = new ql(h48VarD.Z.subSequence(f88.d(h48VarD.f0), f88.c(h48VarD.f0)).toString());
            kd8Var.c(false);
        }
        dn8 dn8Var = dn8.a;
        if (qlVar == null) {
            return dn8Var;
        }
        ((kb) this.g).a(z39.J(qlVar));
        return dn8Var;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object e(mq5 mq5Var, s51 s51Var) throws Throwable {
        j68 j68Var;
        da6 da6Var;
        Throwable th;
        da6 da6Var2;
        if (s51Var instanceof j68) {
            j68Var = (j68) s51Var;
            int i = j68Var.j0;
            if ((i & Integer.MIN_VALUE) != 0) {
                j68Var.j0 = i - Integer.MIN_VALUE;
            } else {
                j68Var = new j68(this, s51Var);
            }
        } else {
            j68Var = new j68(this, s51Var);
        }
        j68 j68Var2 = j68Var;
        Object obj = j68Var2.h0;
        int i2 = j68Var2.j0;
        byte b = 1;
        if (i2 != 0) {
            if (i2 != 1) {
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            da6Var2 = j68Var2.g0;
            da6Var = j68Var2.f0;
            try {
                w39.n0(obj);
                f(da6Var, da6Var2, this);
                return dn8.a;
            } catch (Throwable th2) {
                th = th2;
                f(da6Var, da6Var2, this);
                throw th;
            }
        }
        w39.n0(obj);
        da6 da6Var3 = new da6();
        da6Var3.X = 9205357640488583168L;
        da6 da6Var4 = new da6();
        da6Var4.X = 9205357640488583168L;
        try {
            v28 v28Var = new v28(da6Var3, this, da6Var4, b);
            f68 f68Var = new f68(da6Var3, da6Var4, this, (byte) 1);
            f68 f68Var2 = new f68(da6Var3, da6Var4, this, (byte) 2);
            fh fhVar = new fh((Object) da6Var4, (Object) this, (Object) da6Var3, (byte) 23);
            j68Var2.f0 = da6Var3;
            j68Var2.g0 = da6Var4;
            j68Var2.j0 = 1;
            Object objD = qu1.d(mq5Var, v28Var, f68Var, f68Var2, fhVar, j68Var2);
            c71 c71Var = c71.X;
            if (objD == c71Var) {
                return c71Var;
            }
            da6Var = da6Var3;
            da6Var2 = da6Var4;
            f(da6Var, da6Var2, this);
            return dn8.a;
        } catch (Throwable th3) {
            da6Var = da6Var3;
            th = th3;
            da6Var2 = da6Var4;
            f(da6Var, da6Var2, this);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0099  */
    /* JADX WARN: Code duplicated, block: B:46:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    public final Object g(mq5 mq5Var, boolean z, s51 s51Var) throws Throwable {
        k68 k68Var;
        ev2 ev2Var;
        da6 da6Var;
        da6 da6Var2;
        da6 da6Var3;
        da6 da6Var4;
        if (s51Var instanceof k68) {
            k68Var = (k68) s51Var;
            int i = k68Var.k0;
            if ((i & Integer.MIN_VALUE) != 0) {
                k68Var.k0 = i - Integer.MIN_VALUE;
            } else {
                k68Var = new k68(this, s51Var);
            }
        } else {
            k68Var = new k68(this, s51Var);
        }
        k68 k68Var2 = k68Var;
        Object obj = k68Var2.i0;
        int i2 = k68Var2.k0;
        if (i2 != 0) {
            if (i2 != 1) {
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ev2Var = k68Var2.h0;
            da6Var3 = k68Var2.g0;
            da6Var4 = k68Var2.f0;
            try {
                w39.n0(obj);
                if (l() == ev2Var) {
                    h(da6Var4, da6Var3, this);
                }
                return dn8.a;
            } catch (Throwable th) {
                th = th;
                if (l() == ev2Var) {
                    h(da6Var4, da6Var3, this);
                }
                throw th;
            }
        }
        w39.n0(obj);
        da6 da6Var5 = new da6();
        da6Var5.X = 9205357640488583168L;
        da6 da6Var6 = new da6();
        da6Var6.X = 0L;
        ev2Var = z ? ev2.Y : ev2.Z;
        try {
            xt4 xt4Var = new xt4(ev2Var, da6Var5, da6Var6, this, z);
            f68 f68Var = new f68(da6Var5, this, da6Var6, (byte) 3);
            f68 f68Var2 = new f68(da6Var5, this, da6Var6, (byte) 0);
            da6Var4 = da6Var5;
            da6Var3 = da6Var6;
            try {
                mx2 mx2Var = new mx2(ev2Var, da6Var3, da6Var4, this, z);
                da6Var2 = da6Var3;
                da6Var = da6Var4;
                try {
                    k68Var2.f0 = da6Var;
                    k68Var2.g0 = da6Var2;
                    k68Var2.h0 = ev2Var;
                    k68Var2.k0 = 1;
                    Object objD = qu1.d(mq5Var, xt4Var, f68Var, f68Var2, mx2Var, k68Var2);
                    c71 c71Var = c71.X;
                    if (objD == c71Var) {
                        return c71Var;
                    }
                    da6Var3 = da6Var2;
                    da6Var4 = da6Var;
                    if (l() == ev2Var) {
                        h(da6Var4, da6Var3, this);
                    }
                    return dn8.a;
                } catch (Throwable th2) {
                    th = th2;
                    da6Var3 = da6Var2;
                    da6Var4 = da6Var;
                    if (l() == ev2Var) {
                        h(da6Var4, da6Var3, this);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                if (l() == ev2Var) {
                    h(da6Var4, da6Var3, this);
                }
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            da6Var = da6Var5;
            da6Var2 = da6Var6;
        }
    }

    public final Object i(mq5 mq5Var, uy7 uy7Var) {
        Object objY0 = ((cz7) mq5Var).Y0(new p40(this, null, (byte) 1), uy7Var);
        return objY0 == c71.X ? objY0 : dn8.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x006d, code lost:
    
        if ((r0 != null ? defpackage.zc1.t(r5, defpackage.zc1.o0(r0)) : false) != false) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.f58 j(boolean r12) {
        /*
            r11 = this;
            kd8 r0 = r11.a
            h48 r0 = r0.d()
            rh5 r1 = r11.r
            java.lang.Object r1 = r1.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            rh5 r2 = r11.q
            java.lang.Object r2 = r2.getValue()
            g68 r2 = (defpackage.g68) r2
            g68 r3 = defpackage.g68.X
            r4 = 0
            if (r2 != r3) goto L21
            r2 = 1
            goto L22
        L21:
            r2 = r4
        L22:
            ev2 r3 = r11.l()
            if (r1 == 0) goto L93
            if (r2 == 0) goto L93
            long r1 = r0.f0
            boolean r1 = defpackage.f88.b(r1)
            if (r1 == 0) goto L93
            qg5 r1 = r0.h0
            if (r1 != 0) goto L93
            java.lang.CharSequence r0 = r0.Z
            int r0 = r0.length()
            if (r0 <= 0) goto L93
            ev2 r0 = defpackage.ev2.X
            if (r3 == r0) goto L76
            dd7 r1 = defpackage.yn0.D()
            if (r1 == 0) goto L4e
            gn2 r0 = r1.e()
        L4c:
            r2 = r0
            goto L50
        L4e:
            r0 = 0
            goto L4c
        L50:
            dd7 r3 = defpackage.yn0.P(r1)
            s86 r0 = r11.k()     // Catch: java.lang.Throwable -> L70
            long r5 = r0.c()     // Catch: java.lang.Throwable -> L70
            defpackage.yn0.c0(r1, r3, r2)
            y24 r0 = r11.q()
            if (r0 == 0) goto L6d
            s86 r0 = defpackage.zc1.o0(r0)
            boolean r4 = defpackage.zc1.t(r5, r0)
        L6d:
            if (r4 == 0) goto L93
            goto L76
        L70:
            r0 = move-exception
            r11 = r0
            defpackage.yn0.c0(r1, r3, r2)
            throw r11
        L76:
            f58 r4 = new f58
            if (r12 == 0) goto L84
            s86 r11 = r11.k()
            long r11 = r11.c()
        L82:
            r6 = r11
            goto L8a
        L84:
            r11 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            goto L82
        L8a:
            lf6 r9 = defpackage.lf6.X
            r10 = 0
            r5 = 1
            r8 = 0
            r4.<init>(r5, r6, r8, r9, r10)
            return r4
        L93:
            f58 r11 = defpackage.f58.f
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r68.j(boolean):f58");
    }

    public final s86 k() {
        x78 x78VarC = this.b.c();
        return x78VarC == null ? s86.e : a(x78VarC, this.a.d());
    }

    public final ev2 l() {
        return (ev2) this.p.getValue();
    }

    public final boolean m() {
        return this.i;
    }

    public final long n() {
        rh5 rh5Var = this.o;
        if ((((z85) rh5Var.getValue()).a & 9223372034707292159L) == 9205357640488583168L) {
            return 9205357640488583168L;
        }
        rh5 rh5Var2 = this.n;
        if ((((z85) rh5Var2.getValue()).a & 9223372034707292159L) == 9205357640488583168L) {
            return ys7.c(this.b, ((z85) rh5Var.getValue()).a);
        }
        long j = ((z85) rh5Var.getValue()).a;
        long j2 = ((z85) rh5Var2.getValue()).a;
        y24 y24VarQ = q();
        return z85.f(j, z85.e(j2, y24VarQ != null ? y24VarQ.b(0L) : 9205357640488583168L));
    }

    public final long o(boolean z) {
        long j;
        x78 x78VarC = this.b.c();
        if (x78VarC == null) {
            return 0L;
        }
        bz4 bz4Var = x78VarC.b;
        long j2 = this.a.d().f0;
        if (z) {
            int i = f88.c;
            j = j2 >> 32;
        } else {
            int i2 = f88.c;
            j = j2 & 4294967295L;
        }
        int i3 = (int) j;
        boolean zE = f88.e(j2);
        long j3 = x78VarC.c;
        int iC = bz4Var.c(i3);
        if (iC >= bz4Var.f) {
            return 9205357640488583168L;
        }
        return (((long) Float.floatToRawIntBits(x97.m(x78VarC.e(i3, x78VarC.a(((!z || zE) && (z || !zE)) ? Math.max(i3 + (-1), 0) : i3) == x78VarC.i(i3)), 0.0f, (int) (j3 >> 32)))) << 32) | (((long) Float.floatToRawIntBits(x97.m(bz4Var.a(iC), 0.0f, (int) (j3 & 4294967295L)))) & 4294967295L);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004c  */
    /* JADX WARN: Code duplicated, block: B:23:0x0054  */
    /* JADX WARN: Code duplicated, block: B:25:0x005d  */
    /* JADX WARN: Code duplicated, block: B:26:0x0061  */
    /* JADX WARN: Code duplicated, block: B:29:0x0074  */
    /* JADX WARN: Code duplicated, block: B:31:0x007a  */
    /* JADX WARN: Code duplicated, block: B:33:0x0084  */
    /* JADX WARN: Code duplicated, block: B:35:0x008c  */
    /* JADX WARN: Code duplicated, block: B:37:0x0090  */
    /* JADX WARN: Code duplicated, block: B:40:0x0098  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:46:0x00c3  */
    public final f58 p(boolean z, boolean z2) {
        int iMax;
        long j;
        int i;
        float fG;
        w78 w78Var;
        bz4 bz4Var;
        int iMin;
        y24 y24VarQ;
        ev2 ev2Var = z ? ev2.Y : ev2.Z;
        x78 x78VarC = this.b.c();
        f58 f58Var = f58.f;
        if (x78VarC == null) {
            return f58Var;
        }
        kd8 kd8Var = this.a;
        long j2 = kd8Var.d().f0;
        if (f88.b(j2)) {
            return f58Var;
        }
        long jO = o(z);
        if (((g68) this.q.getValue()) == g68.X) {
            if (l() != ev2Var) {
                y24 y24VarQ2 = q();
                if (y24VarQ2 != null ? zc1.t(jO, zc1.o0(y24VarQ2)) : false) {
                    if (kd8Var.d().h0 == null) {
                        if (z) {
                            iMax = (int) (j2 >> 32);
                        } else {
                            iMax = Math.max(((int) (j2 & 4294967295L)) - 1, 0);
                        }
                        lf6 lf6VarA = x78VarC.a(iMax);
                        boolean zE = f88.e(j2);
                        if (z2) {
                            y24VarQ = q();
                            if (y24VarQ != null) {
                                jO = ys7.b(jO, zc1.o0(y24VarQ));
                            }
                        } else {
                            jO = 9205357640488583168L;
                        }
                        long j3 = jO;
                        if (z) {
                            j = j2 >> 32;
                        } else {
                            j = j2 & 4294967295L;
                        }
                        i = (int) j;
                        fG = 0.0f;
                        if (i >= 0) {
                            w78Var = x78VarC.a;
                            bz4Var = x78VarC.b;
                            if (w78Var.a.Y.length() != 0) {
                                iMin = Math.min(bz4Var.c(i), Math.min(bz4Var.b - 1, bz4Var.f - 1));
                                if (i <= bz4Var.b(iMin, false)) {
                                    bz4Var.l(iMin);
                                    ArrayList arrayList = bz4Var.h;
                                    tg5 tg5Var = (tg5) arrayList.get(oc.q(iMin, arrayList));
                                    fG = tg5Var.a.d.g(iMin - tg5Var.d);
                                }
                            }
                        }
                        return new f58(true, j3, fG, lf6VarA, zE);
                    }
                }
            } else if (kd8Var.d().h0 == null) {
                if (z) {
                    iMax = (int) (j2 >> 32);
                } else {
                    iMax = Math.max(((int) (j2 & 4294967295L)) - 1, 0);
                }
                lf6 lf6VarA2 = x78VarC.a(iMax);
                boolean zE2 = f88.e(j2);
                if (z2) {
                    y24VarQ = q();
                    if (y24VarQ != null) {
                        jO = ys7.b(jO, zc1.o0(y24VarQ));
                    }
                } else {
                    jO = 9205357640488583168L;
                }
                long j4 = jO;
                if (z) {
                    j = j2 >> 32;
                } else {
                    j = j2 & 4294967295L;
                }
                i = (int) j;
                fG = 0.0f;
                if (i >= 0) {
                    w78Var = x78VarC.a;
                    bz4Var = x78VarC.b;
                    if (w78Var.a.Y.length() != 0) {
                        iMin = Math.min(bz4Var.c(i), Math.min(bz4Var.b - 1, bz4Var.f - 1));
                        if (i <= bz4Var.b(iMin, false)) {
                            bz4Var.l(iMin);
                            ArrayList arrayList2 = bz4Var.h;
                            tg5 tg5Var2 = (tg5) arrayList2.get(oc.q(iMin, arrayList2));
                            fG = tg5Var2.a.d.g(iMin - tg5Var2.d);
                        }
                    }
                }
                return new f58(true, j4, fG, lf6VarA2, zE2);
            }
        }
        return f58Var;
    }

    public final y24 q() {
        y24 y24VarE = this.b.e();
        if (y24VarE == null || !y24VarE.g()) {
            return null;
        }
        return y24VarE;
    }

    public final void r() {
        og7 og7Var;
        w38 w38Var = this.d.a;
        if (w38Var == null || (og7Var = w38Var.w0) == null) {
            return;
        }
        og7Var.m(null);
        w38Var.w0 = null;
    }

    public final void s() {
        ip5 ip5Var = this.f;
        if (ip5Var == null) {
            return;
        }
        kd8 kd8Var = this.a;
        CharSequence charSequence = kd8Var.d().Z;
        long j = kd8Var.d().f0;
        if (charSequence.length() <= 0 || f88.b(j)) {
            return;
        }
        w51.G(this.e, null, e71.f0, new hy6(ip5Var, charSequence, j, this, (q51) null), 1);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x006b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:37:0x006c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object t(boolean z, s51 s51Var) {
        n68 n68Var;
        if (s51Var instanceof n68) {
            n68Var = (n68) s51Var;
            int i = n68Var.h0;
            if ((i & Integer.MIN_VALUE) != 0) {
                n68Var.h0 = i - Integer.MIN_VALUE;
            } else {
                n68Var = new n68(this, s51Var);
            }
        } else {
            n68Var = new n68(this, s51Var);
        }
        Object obj = n68Var.f0;
        int i2 = n68Var.h0;
        dn8 dn8Var = dn8.a;
        Object obj2 = c71.X;
        if (i2 == 0) {
            w39.n0(obj);
            dn2 dn2Var = this.m;
            if (dn2Var != null && dn2Var.invoke() != null) {
                c2.m();
                return null;
            }
            n68Var.h0 = 1;
            if (u(z, n68Var) == obj2) {
                return obj2;
            }
            return dn8Var;
        }
        if (i2 == 1) {
            w39.n0(obj);
            return dn8Var;
        }
        if (i2 != 2) {
            if (i2 == 3) {
                w39.n0(obj);
                return dn8Var;
            }
            bt.i("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        w39.n0(obj);
        gu0 gu0Var = (gu0) obj;
        if (gu0Var != null) {
            gu0Var.a.getDescription();
            throw null;
        }
        n68Var.h0 = 3;
        if (u(false, n68Var) == obj2) {
            return obj2;
        }
        return dn8Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007a, code lost:
    
        if (r10 == r7) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object u(boolean r9, defpackage.s51 r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.o68
            if (r0 == 0) goto L13
            r0 = r10
            o68 r0 = (defpackage.o68) r0
            int r1 = r0.i0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.i0 = r1
            goto L18
        L13:
            o68 r0 = new o68
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.g0
            int r1 = r0.i0
            r2 = 0
            r3 = 0
            dn8 r4 = defpackage.dn8.a
            r5 = 2
            r6 = 1
            c71 r7 = defpackage.c71.X
            if (r1 == 0) goto L3c
            if (r1 == r6) goto L36
            if (r1 != r5) goto L30
            boolean r9 = r0.f0
            defpackage.w39.n0(r10)
            goto L7d
        L30:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.bt.i(r8)
            return r3
        L36:
            boolean r9 = r0.f0
            defpackage.w39.n0(r10)
            goto L5e
        L3c:
            defpackage.w39.n0(r10)
            iu0 r10 = r8.g
            r0.f0 = r9
            r0.i0 = r6
            kb r10 = (defpackage.kb) r10
            dq r10 = r10.a
            android.content.ClipboardManager r10 = r10.v()
            android.content.ClipData r10 = r10.getPrimaryClip()
            if (r10 == 0) goto L5a
            gu0 r1 = new gu0
            r1.<init>(r10)
            r10 = r1
            goto L5b
        L5a:
            r10 = r3
        L5b:
            if (r10 != r7) goto L5e
            goto L7c
        L5e:
            gu0 r10 = (defpackage.gu0) r10
            if (r10 == 0) goto L89
            r0.f0 = r9
            r0.i0 = r5
            android.content.ClipData r10 = r10.a
            android.content.ClipData$Item r10 = r10.getItemAt(r2)
            if (r10 == 0) goto L79
            java.lang.CharSequence r10 = r10.getText()
            if (r10 == 0) goto L79
            java.lang.String r10 = r10.toString()
            goto L7a
        L79:
            r10 = r3
        L7a:
            if (r10 != r7) goto L7d
        L7c:
            return r7
        L7d:
            java.lang.String r10 = (java.lang.String) r10
            if (r10 != 0) goto L82
            goto L89
        L82:
            kd8 r8 = r8.a
            r0 = 10
            defpackage.kd8.h(r8, r10, r2, r9, r0)
        L89:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r68.u(boolean, s51):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:68:0x0110  */
    public final boolean v(long j) {
        int iF;
        mb3 mb3Var;
        boolean z;
        r07 r07Var;
        int i;
        long jC;
        long j2;
        r07 r07Var2;
        id8 id8Var;
        x78 x78VarC = this.b.c();
        if (x78VarC == null || (iF = x78VarC.b.f(j)) == -1) {
            return false;
        }
        kd8 kd8Var = this.a;
        zi1 zi1Var = kd8Var.d;
        rh5 rh5Var = kd8Var.e;
        qf3 qf3Var = (zi1Var == null || (id8Var = (id8) zi1Var.getValue()) == null) ? null : id8Var.b;
        long jA = qf3Var != null ? qf3Var.a(iF, false) : ct7.c(iF, iF);
        long jF = kd8Var.f(jA);
        if (f88.b(jA) && f88.b(jF)) {
            mb3Var = mb3.X;
        } else if (f88.b(jA) || f88.b(jF)) {
            mb3Var = (!f88.b(jA) || f88.b(jF)) ? mb3.f0 : mb3.Y;
        } else {
            mb3Var = mb3.Z;
        }
        int iOrdinal = mb3Var.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                z = false;
                if (iOrdinal == 2) {
                    s86 s86VarC = x78VarC.c((int) (jF >> 32));
                    s86 s86VarC2 = x78VarC.c((int) (jF & 4294967295L));
                    float fA = zc1.A(j, s86VarC);
                    float fA2 = zc1.A(j, s86VarC2);
                    if (fA == fA2 || fA >= fA2) {
                        j2 = jA & 4294967295L;
                    }
                    i = (int) j2;
                    r07Var = null;
                } else if (iOrdinal != 3) {
                    b61.c();
                    return false;
                }
            } else {
                z = false;
                s86 s86VarC3 = x78VarC.c((int) (jF >> 32));
                s86 s86VarC4 = x78VarC.c((int) (jF & 4294967295L));
                float fA3 = zc1.A(j, s86VarC3);
                float fA4 = zc1.A(j, s86VarC4);
                if (fA3 != fA4 && fA3 < fA4) {
                    f09 f09Var = f09.X;
                    r07Var2 = new r07(f09Var, f09Var);
                } else {
                    f09 f09Var2 = f09.Y;
                    r07Var2 = new r07(f09Var2, f09Var2);
                }
                r07Var = r07Var2;
                i = (int) (jA >> 32);
            }
            jC = ct7.c(i, i);
            if (!f88.a(jC, kd8Var.a.c().f0) && (r07Var == null || r07Var.equals((r07) rh5Var.getValue()))) {
                return z;
            }
            kd8Var.k(jC);
            if (r07Var != null) {
                rh5Var.setValue(r07Var);
            }
            return true;
        }
        z = false;
        j2 = jA >> 32;
        i = (int) j2;
        r07Var = null;
        jC = ct7.c(i, i);
        if (!f88.a(jC, kd8Var.a.c().f0)) {
        }
        kd8Var.k(jC);
        if (r07Var != null) {
            rh5Var.setValue(r07Var);
        }
        return true;
    }

    public final void w(boolean z) {
        this.k.setValue(Boolean.valueOf(z));
    }

    public final void x(boolean z) {
        this.r.setValue(Boolean.valueOf(z));
    }

    public final void y(s88 s88Var) {
        this.s.setValue(s88Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object z(s51 s51Var) {
        q68 q68Var;
        if (s51Var instanceof q68) {
            q68Var = (q68) s51Var;
            int i = q68Var.h0;
            if ((i & Integer.MIN_VALUE) != 0) {
                q68Var.h0 = i - Integer.MIN_VALUE;
            } else {
                q68Var = new q68(this, s51Var);
            }
        } else {
            q68Var = new q68(this, s51Var);
        }
        Object objN = q68Var.f0;
        int i2 = q68Var.h0;
        q51 q51Var = null;
        s88 s88Var = s88.X;
        rh5 rh5Var = this.s;
        try {
            if (i2 == 0) {
                w39.n0(objN);
                ar6 ar6Var = new ar6(this, q51Var, (byte) 7);
                q68Var.h0 = 1;
                objN = gv3.n(ar6Var, q68Var);
                c71 c71Var = c71.X;
                if (objN == c71Var) {
                    return c71Var;
                }
            } else {
                if (i2 != 1) {
                    bt.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                w39.n0(objN);
            }
            x(false);
            if (((s88) rh5Var.getValue()) != s88Var) {
                r();
            }
            return dn8.a;
        } catch (Throwable th) {
            x(false);
            if (((s88) rh5Var.getValue()) != s88Var) {
                r();
            }
            throw th;
        }
    }
}
