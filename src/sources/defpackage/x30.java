package defpackage;

import android.content.Context;
import android.os.Build;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import okhttp3.dnsoverhttps.DnsOverHttps;
import okhttp3.internal.http2.Http2;
import org.conscrypt.PSKKeyManager;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class x30 {
    public static final long a = hi5.G(40.0f, 40.0f);

    /* JADX WARN: Code duplicated, block: B:301:0x051f  */
    /* JADX WARN: Code duplicated, block: B:302:0x0523  */
    public static final void a(final y68 y68Var, final kx4 kx4Var, final boolean z, final de3 de3Var, final o88 o88Var, final wx3 wx3Var, final w58 w58Var, final xz4 xz4Var, final d90 d90Var, final o48 o48Var, final ay6 ay6Var, lp2 lp2Var, final int i, final int i2) {
        int i3;
        int i4;
        Object obj;
        final boolean z2;
        lp2 lp2Var2;
        xz4 xz4Var2;
        wx3 wx3Var2;
        boolean z3;
        ip5 ip5Var;
        int i5;
        fi1 fi1Var;
        int i6;
        b71 b71Var;
        final ip5 ip5Var2;
        final ub8 ub8Var;
        final iu0 iu0Var;
        lp2 lp2Var3;
        final r68 r68Var;
        boolean z4;
        sd5 sd5Var;
        boolean z5;
        l73 l73Var;
        int i7;
        lp2Var.X(965149429);
        if ((i & 6) == 0) {
            i3 = (lp2Var.f(y68Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= lp2Var.f(kx4Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= lp2Var.g(z) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= lp2Var.g(false) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= lp2Var.f(de3Var) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((i & 196608) == 0) {
            i3 |= lp2Var.f(o88Var) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= lp2Var.f(wx3Var) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= lp2Var.f(null) ? XRayConfig.OutboundBean.StreamSettingsBean.QuicParamsBean.DEFAULT_STREAM_WINDOW : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= lp2Var.f(w58Var) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= lp2Var.h(null) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (lp2Var.f(xz4Var) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= lp2Var.f(d90Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            obj = null;
            i4 |= lp2Var.f(null) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        } else {
            obj = null;
        }
        if ((i2 & 3072) == 0) {
            i4 |= lp2Var.f(obj) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= (32768 & i2) == 0 ? lp2Var.f(o48Var) : lp2Var.h(o48Var) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((i2 & 196608) == 0) {
            i4 |= lp2Var.f(ay6Var) ? 131072 : 65536;
        }
        int i8 = i4 | 1572864;
        if (lp2Var.N(i3 & 1, ((i3 & 306783379) == 306783378 && (599187 & i8) == 599186) ? false : true)) {
            lp2Var.S();
            if ((i & 1) != 0 && !lp2Var.x()) {
                lp2Var.Q();
            }
            lp2Var.q();
            fi1 fi1Var2 = (fi1) lp2Var.j(y01.h);
            z24 z24Var = (z24) lp2Var.j(y01.n);
            final boolean zF = dh3.f(w58Var, qe4.x0);
            be beVar = zz0.a;
            if (xz4Var == null) {
                lp2Var.W(-2038132442);
                Object objK = lp2Var.K();
                if (objK == beVar) {
                    objK = new xz4();
                    lp2Var.g0(objK);
                }
                lp2Var.p(false);
                xz4Var2 = (xz4) objK;
            } else {
                lp2Var.W(-204294191);
                lp2Var.p(false);
                xz4Var2 = xz4Var;
            }
            sd5 sd5Var2 = sd5.X;
            sd5 sd5Var3 = zF ? sd5.Y : sd5Var2;
            Object objK2 = lp2Var.K();
            if (objK2 == beVar) {
                objK2 = v77.b(0, 2, l90.Z);
                lp2Var.g0(objK2);
            }
            w05 w05Var = (w05) objK2;
            boolean z6 = ((i3 & 14) == 4) | ((i8 & 896) == 256) | ((i8 & 7168) == 2048);
            Object objK3 = lp2Var.K();
            if (z6 || objK3 == beVar) {
                qe4 qe4Var = qe4.u0;
                if (!zF) {
                    qe4Var = null;
                }
                objK3 = new kd8(y68Var, de3Var, qe4Var);
                lp2Var.g0(objK3);
            }
            final kd8 kd8Var = (kd8) objK3;
            boolean zF2 = lp2Var.f(kd8Var);
            Object objK4 = lp2Var.K();
            if (zF2 || objK4 == beVar) {
                objK4 = new y78();
                lp2Var.g0(objK4);
            }
            final y78 y78Var = (y78) objK4;
            wx3 wx3VarN = de3Var != null ? de3Var.n() : null;
            wx3Var.getClass();
            if (wx3VarN == null || wx3VarN.b() || wx3VarN.equals(wx3Var)) {
                wx3Var2 = wx3Var;
            } else if (wx3Var.b()) {
                wx3Var2 = wx3VarN;
            } else {
                int i9 = wx3Var.a;
                vx3 vx3Var = i9 == -1 ? null : new vx3(i9);
                int i10 = vx3Var != null ? vx3Var.a : wx3VarN.a;
                Boolean bool = wx3Var.b;
                if (bool == null) {
                    bool = wx3VarN.b;
                }
                Boolean bool2 = bool;
                int i11 = wx3Var.c;
                xx3 xx3Var = new xx3(i11);
                if (i11 == 0) {
                    xx3Var = null;
                }
                int i12 = xx3Var != null ? xx3Var.a : wx3VarN.c;
                int i13 = wx3Var.d;
                l73 l73Var2 = new l73(i13);
                if (i13 == -1) {
                    l73Var = null;
                }
                if (l73Var != null) {
                    l73Var = l73Var2;
                    i7 = l73Var.a;
                } else {
                    l73Var = l73Var2;
                    i7 = wx3VarN.d;
                }
                int i14 = i7;
                Boolean bool3 = wx3Var.e;
                if (bool3 == null) {
                    bool3 = wx3VarN.e;
                }
                Boolean bool4 = bool3;
                ge4 ge4Var = wx3Var.f;
                if (ge4Var == null) {
                    ge4Var = wx3VarN.f;
                }
                wx3Var2 = new wx3(i10, bool2, i12, i14, bool4, ge4Var);
            }
            Object objK5 = lp2Var.K();
            if (objK5 == beVar) {
                objK5 = u70.D(lp2Var);
                lp2Var.g0(objK5);
            }
            b71 b71Var2 = (b71) objK5;
            lp2Var.W(-2036249936);
            ge4 ge4VarL = o88Var.a.k;
            if (ge4VarL == null) {
                ge4 ge4Var2 = ge4.Z;
                ge4VarL = uo5.a.l();
            }
            ox1 ox1Var = pp5.a;
            lp2Var.W(430530635);
            if (Build.VERSION.SDK_INT < 28) {
                lp2Var.p(false);
                ip5Var = null;
                z3 = false;
            } else {
                Context context = (Context) lp2Var.j(pc.b);
                s61 s61Var = (s61) lp2Var.j(pp5.a);
                boolean zF3 = lp2Var.f(s61Var) | lp2Var.f(context) | lp2Var.f(ge4VarL);
                Object objK6 = lp2Var.K();
                if (zF3 || objK6 == beVar) {
                    pp5.b.getClass();
                    objK6 = new op5(s61Var, context, zz6.X, ge4VarL);
                    lp2Var.g0(objK6);
                }
                ip5 ip5Var3 = (ip5) objK6;
                z3 = false;
                lp2Var.p(false);
                ip5Var = ip5Var3;
            }
            lp2Var.p(z3);
            Object objK7 = lp2Var.K();
            Object obj2 = objK7;
            if (objK7 == beVar) {
                ub8 ub8Var2 = new ub8();
                ub8Var2.b = tb8.X;
                lp2Var.g0(ub8Var2);
                obj2 = ub8Var2;
            }
            ub8 ub8Var3 = (ub8) obj2;
            iu0 iu0Var2 = (iu0) lp2Var.j(y01.f);
            boolean zF4 = lp2Var.f(kd8Var);
            Object objK8 = lp2Var.K();
            if (zF4 || objK8 == beVar) {
                i5 = i3;
                lp2 lp2Var4 = lp2Var;
                fi1Var = fi1Var2;
                ip5 ip5Var4 = ip5Var;
                i6 = Http2.INITIAL_MAX_FRAME_SIZE;
                r68 r68Var2 = new r68(kd8Var, y78Var, fi1Var, z, ub8Var3, b71Var2, ip5Var4, iu0Var2);
                b71Var = b71Var2;
                ip5Var2 = ip5Var4;
                ub8Var = ub8Var3;
                iu0Var = iu0Var2;
                lp2Var4.g0(r68Var2);
                objK8 = r68Var2;
                lp2Var3 = lp2Var4;
            } else {
                fi1Var = fi1Var2;
                ip5Var2 = ip5Var;
                i6 = Http2.INITIAL_MAX_FRAME_SIZE;
                ub8Var = ub8Var3;
                i5 = i3;
                iu0Var = iu0Var2;
                lp2Var3 = lp2Var;
                b71Var = b71Var2;
            }
            r68 r68Var3 = (r68) objK8;
            final ez2 ez2Var = (ez2) lp2Var3.j(y01.l);
            boolean zF5 = lp2Var3.f((q88) lp2Var3.j(y01.r)) | lp2Var3.f(b71Var);
            Object objK9 = lp2Var3.K();
            if (zF5 || objK9 == beVar) {
                objK9 = new u30();
                lp2Var3.g0(objK9);
            }
            final u30 u30Var = (u30) objK9;
            boolean zF6 = lp2Var3.f(kd8Var) | ((57344 & i5) == i6) | lp2Var3.h(r68Var3) | lp2Var3.h(ez2Var) | lp2Var3.h(iu0Var) | lp2Var3.f(u30Var) | lp2Var3.f(fi1Var) | ((i5 & 896) == 256) | ((i5 & 7168) == 2048) | ((i8 & 3670016) == 1048576);
            Object objK10 = lp2Var3.K();
            if (zF6 || objK10 == beVar) {
                final fi1 fi1Var3 = fi1Var;
                r68Var = r68Var3;
                dn2 dn2Var = new dn2(de3Var, r68Var, ez2Var, iu0Var, u30Var, fi1Var3, z) { // from class: o30
                    public final /* synthetic */ de3 Y;
                    public final /* synthetic */ r68 Z;
                    public final /* synthetic */ ez2 f0;
                    public final /* synthetic */ iu0 g0;
                    public final /* synthetic */ fi1 h0;
                    public final /* synthetic */ boolean i0;

                    {
                        this.h0 = fi1Var3;
                        this.i0 = z;
                    }

                    @Override // defpackage.dn2
                    public final Object invoke() {
                        this.X.b = this.Y;
                        r68 r68Var4 = this.Z;
                        boolean z7 = this.i0;
                        if (!z7) {
                            r68Var4.r();
                        }
                        r68Var4.j = this.f0;
                        r68Var4.g = this.g0;
                        r68Var4.c = this.h0;
                        r68Var4.i = z7;
                        return dn8.a;
                    }
                };
                z4 = z;
                lp2Var3.g0(dn2Var);
                objK10 = dn2Var;
            } else {
                r68Var = r68Var3;
                z4 = z;
            }
            u70.q((dn2) objK10, lp2Var3);
            boolean zH = lp2Var3.h(r68Var);
            Object objK11 = lp2Var3.K();
            if (zH || objK11 == beVar) {
                objK11 = new p30(r68Var, (byte) 0);
                lp2Var3.g0(objK11);
            }
            u70.a(r68Var, (gn2) objK11, lp2Var3);
            int i15 = wx3Var.c;
            boolean z7 = (i15 == 7 || i15 == 8) ? false : true;
            final g68 g68Var = (g68) r68Var.q.getValue();
            boolean zG = lp2Var3.g(z7) | lp2Var3.h(r19);
            Object objK12 = lp2Var3.K();
            if (zG || objK12 == beVar) {
                objK12 = new q30(z7, r19, (byte) 0);
                lp2Var3.g0(objK12);
            }
            kx4 kx4VarF0 = z68.F0(kx4Var, z4, z7, (dn2) objK12);
            int i16 = i5;
            final wx3 wx3Var3 = wx3Var2;
            kx4 kx4VarY = kx4VarF0.y(new p48(kd8Var, y78Var, r68Var, de3Var, z4, wx3Var3, r17, xz4Var2, w05Var));
            boolean z8 = z && g68Var == g68.X;
            if (z24Var == z24.Y) {
                sd5 sd5Var4 = sd5Var3;
                if (sd5Var4 != sd5Var2) {
                    ay6Var = ay6Var;
                    sd5Var = sd5Var4;
                    z5 = false;
                } else {
                    sd5Var = sd5Var4;
                }
                kx4 kx4VarA = iy6.a(kx4VarY, ay6Var, sd5Var, z8, z5, xz4Var2);
                final sd5 sd5Var5 = sd5Var;
                fq5.a.getClass();
                kx4 kx4VarD = oc.d(gv3.N(kx4VarA, ci8.d), new d67(r68Var, b71Var, (byte) 6));
                xr4 xr4VarC = g80.c(pz2.Z, true);
                int iHashCode = Long.hashCode(lp2Var3.T);
                kl5 kl5VarL = lp2Var3.l();
                kx4 kx4VarQ = w45.Q(lp2Var3, kx4VarD);
                uz0.j.getClass();
                lp2Var3.Z();
                if (lp2Var3.S) {
                    lp2Var3.k();
                } else {
                    lp2Var3.j0();
                }
                pn7.m(pz2.B0, lp2Var3, xr4VarC);
                pn7.m(pz2.A0, lp2Var3, kl5VarL);
                pn7.m(pz2.C0, lp2Var3, Integer.valueOf(iHashCode));
                pn7.l(lp2Var3);
                pn7.m(pz2.z0, lp2Var3, kx4VarQ);
                final r68 r68Var4 = r68Var;
                final xz4 xz4Var3 = xz4Var2;
                rn2 rn2Var = new rn2() { // from class: r30
                    @Override // defpackage.rn2
                    public final Object K(Object obj3, Object obj4) {
                        lp2 lp2Var5 = (lp2) obj3;
                        int iIntValue = ((Integer) obj4).intValue();
                        if (lp2Var5.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                            o48 o48Var2 = o48Var;
                            if (o48Var2 == null) {
                                o48Var2 = oy1.h0;
                            }
                            final xz4 xz4Var4 = xz4Var3;
                            final w58 w58Var2 = w58Var;
                            final o88 o88Var2 = o88Var;
                            final y78 y78Var2 = y78Var;
                            final boolean z9 = zF;
                            final g68 g68Var2 = g68Var;
                            final kd8 kd8Var2 = kd8Var;
                            final r68 r68Var5 = r68Var4;
                            final d90 d90Var2 = d90Var;
                            final boolean z10 = z;
                            final ay6 ay6Var2 = ay6Var;
                            final sd5 sd5Var6 = sd5Var5;
                            final ub8 ub8Var4 = ub8Var;
                            final ip5 ip5Var5 = ip5Var2;
                            final wx3 wx3Var4 = wx3Var3;
                            o48Var2.j(jm4.U(1969169726, new rn2() { // from class: t30
                                @Override // defpackage.rn2
                                public final Object K(Object obj5, Object obj6) {
                                    lp2 lp2Var6 = (lp2) obj5;
                                    int iIntValue2 = ((Integer) obj6).intValue();
                                    if (lp2Var6.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                        xz4 xz4Var5 = xz4Var4;
                                        y05 y05VarS = km4.s(xz4Var5, lp2Var6, 0);
                                        Object objK13 = lp2Var6.K();
                                        be beVar2 = zz0.a;
                                        if (objK13 == beVar2) {
                                            objK13 = z51.H(Boolean.FALSE);
                                            lp2Var6.g0(objK13);
                                        }
                                        y05 y05Var = (y05) objK13;
                                        boolean zF7 = lp2Var6.f(xz4Var5);
                                        Object objK14 = lp2Var6.K();
                                        if (zF7 || objK14 == beVar2) {
                                            objK14 = new tt1(xz4Var5, y05Var, null, (byte) 0);
                                            lp2Var6.g0(objK14);
                                        }
                                        u70.h((rn2) objK14, lp2Var6, xz4Var5);
                                        t09 t09Var = (t09) lp2Var6.j(y01.u);
                                        boolean zF8 = lp2Var6.f(xz4Var5) | lp2Var6.f(t09Var);
                                        Object objK15 = lp2Var6.K();
                                        if (zF8 || objK15 == beVar2) {
                                            objK15 = rd7.b(new p5(t09Var, y05VarS, (byte) 9));
                                            lp2Var6.g0(objK15);
                                        }
                                        lh7 lh7Var = (lh7) objK15;
                                        ((Boolean) y05VarS.getValue()).getClass();
                                        int i17 = w58Var2 instanceof v58 ? Integer.MAX_VALUE : 1;
                                        y78 y78Var3 = y78Var2;
                                        kx4 kx4VarQ0 = z68.q0(hx4.X, new m30(y78Var3, (byte) 0));
                                        vr3.k0(1, i17);
                                        o88 o88Var3 = o88Var2;
                                        boolean z11 = z9;
                                        if (i17 != Integer.MAX_VALUE && !z11) {
                                            kx4VarQ0 = kx4VarQ0.y(new tz2(o88Var3, 1, i17));
                                        }
                                        kx4 kx4VarL = w39.l(kx4VarQ0.y(new w68(o88Var3)));
                                        boolean zBooleanValue = ((Boolean) lh7Var.getValue()).booleanValue();
                                        boolean zBooleanValue2 = ((Boolean) y05Var.getValue()).booleanValue();
                                        boolean z12 = g68Var2 == g68.Y;
                                        kd8 kd8Var3 = kd8Var2;
                                        r68 r68Var6 = r68Var5;
                                        d90 d90Var3 = d90Var2;
                                        boolean z13 = z10;
                                        kx4 kx4VarY2 = kx4VarL.y(new j48(zBooleanValue, zBooleanValue2, z12, y78Var3, kd8Var3, r68Var6, d90Var3, z13, ay6Var2, sd5Var6, ub8Var4, ip5Var5));
                                        xr4 xr4VarC2 = g80.c(pz2.Z, true);
                                        int iHashCode2 = Long.hashCode(lp2Var6.T);
                                        kl5 kl5VarL2 = lp2Var6.l();
                                        kx4 kx4VarQ2 = w45.Q(lp2Var6, kx4VarY2);
                                        uz0.j.getClass();
                                        lp2Var6.Z();
                                        if (lp2Var6.S) {
                                            lp2Var6.k();
                                        } else {
                                            lp2Var6.j0();
                                        }
                                        pn7.m(pz2.B0, lp2Var6, xr4VarC2);
                                        pn7.m(pz2.A0, lp2Var6, kl5VarL2);
                                        pn7.m(pz2.C0, lp2Var6, Integer.valueOf(iHashCode2));
                                        pn7.l(lp2Var6);
                                        pn7.m(pz2.z0, lp2Var6, kx4VarQ2);
                                        g80.a(new a78(y78Var3, kd8Var3, o88Var3, z11, wx3Var4), lp2Var6, 0);
                                        if (z13 && ((Boolean) lh7Var.getValue()).booleanValue() && ((Boolean) r68Var6.k.getValue()).booleanValue()) {
                                            lp2Var6.W(-810654004);
                                            x30.d(r68Var6, lp2Var6, 0);
                                            lp2Var6.W(-810526873);
                                            x30.c(r68Var6, lp2Var6, 0);
                                            lp2Var6.p(false);
                                            lp2Var6.p(false);
                                        } else {
                                            lp2Var6.W(-810390690);
                                            lp2Var6.p(false);
                                        }
                                        lp2Var6.p(true);
                                    } else {
                                        lp2Var6.Q();
                                    }
                                    return dn8.a;
                                }
                            }, lp2Var5), lp2Var5, 6);
                        } else {
                            lp2Var5.Q();
                        }
                        return dn8.a;
                    }
                };
                z2 = z;
                yn0.c(r68Var4, z2, jm4.U(-673241599, rn2Var, lp2Var3), lp2Var3, ((i16 >> 3) & 112) | 384);
                lp2Var3.p(true);
                lp2Var2 = lp2Var3;
            } else {
                sd5Var = sd5Var3;
            }
            z5 = true;
            kx4 kx4VarA2 = iy6.a(kx4VarY, ay6Var, sd5Var, z8, z5, xz4Var2);
            final sd5 sd5Var6 = sd5Var;
            fq5.a.getClass();
            kx4 kx4VarD2 = oc.d(gv3.N(kx4VarA2, ci8.d), new d67(r68Var, b71Var, (byte) 6));
            xr4 xr4VarC2 = g80.c(pz2.Z, true);
            int iHashCode2 = Long.hashCode(lp2Var3.T);
            kl5 kl5VarL2 = lp2Var3.l();
            kx4 kx4VarQ2 = w45.Q(lp2Var3, kx4VarD2);
            uz0.j.getClass();
            lp2Var3.Z();
            if (lp2Var3.S) {
                lp2Var3.k();
            } else {
                lp2Var3.j0();
            }
            pn7.m(pz2.B0, lp2Var3, xr4VarC2);
            pn7.m(pz2.A0, lp2Var3, kl5VarL2);
            pn7.m(pz2.C0, lp2Var3, Integer.valueOf(iHashCode2));
            pn7.l(lp2Var3);
            pn7.m(pz2.z0, lp2Var3, kx4VarQ2);
            final r68 r68Var5 = r68Var;
            final xz4 xz4Var4 = xz4Var2;
            rn2 rn2Var2 = new rn2() { // from class: r30
                @Override // defpackage.rn2
                public final Object K(Object obj3, Object obj4) {
                    lp2 lp2Var5 = (lp2) obj3;
                    int iIntValue = ((Integer) obj4).intValue();
                    if (lp2Var5.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                        o48 o48Var2 = o48Var;
                        if (o48Var2 == null) {
                            o48Var2 = oy1.h0;
                        }
                        final xz4 xz4Var5 = xz4Var4;
                        final w58 w58Var2 = w58Var;
                        final o88 o88Var2 = o88Var;
                        final y78 y78Var2 = y78Var;
                        final boolean z9 = zF;
                        final g68 g68Var2 = g68Var;
                        final kd8 kd8Var2 = kd8Var;
                        final r68 r68Var6 = r68Var5;
                        final d90 d90Var2 = d90Var;
                        final boolean z10 = z;
                        final ay6 ay6Var2 = ay6Var;
                        final sd5 sd5Var7 = sd5Var6;
                        final ub8 ub8Var4 = ub8Var;
                        final ip5 ip5Var5 = ip5Var2;
                        final wx3 wx3Var4 = wx3Var3;
                        o48Var2.j(jm4.U(1969169726, new rn2() { // from class: t30
                            @Override // defpackage.rn2
                            public final Object K(Object obj5, Object obj6) {
                                lp2 lp2Var6 = (lp2) obj5;
                                int iIntValue2 = ((Integer) obj6).intValue();
                                if (lp2Var6.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                    xz4 xz4Var6 = xz4Var5;
                                    y05 y05VarS = km4.s(xz4Var6, lp2Var6, 0);
                                    Object objK13 = lp2Var6.K();
                                    be beVar2 = zz0.a;
                                    if (objK13 == beVar2) {
                                        objK13 = z51.H(Boolean.FALSE);
                                        lp2Var6.g0(objK13);
                                    }
                                    y05 y05Var = (y05) objK13;
                                    boolean zF7 = lp2Var6.f(xz4Var6);
                                    Object objK14 = lp2Var6.K();
                                    if (zF7 || objK14 == beVar2) {
                                        objK14 = new tt1(xz4Var6, y05Var, null, (byte) 0);
                                        lp2Var6.g0(objK14);
                                    }
                                    u70.h((rn2) objK14, lp2Var6, xz4Var6);
                                    t09 t09Var = (t09) lp2Var6.j(y01.u);
                                    boolean zF8 = lp2Var6.f(xz4Var6) | lp2Var6.f(t09Var);
                                    Object objK15 = lp2Var6.K();
                                    if (zF8 || objK15 == beVar2) {
                                        objK15 = rd7.b(new p5(t09Var, y05VarS, (byte) 9));
                                        lp2Var6.g0(objK15);
                                    }
                                    lh7 lh7Var = (lh7) objK15;
                                    ((Boolean) y05VarS.getValue()).getClass();
                                    int i17 = w58Var2 instanceof v58 ? Integer.MAX_VALUE : 1;
                                    y78 y78Var3 = y78Var2;
                                    kx4 kx4VarQ0 = z68.q0(hx4.X, new m30(y78Var3, (byte) 0));
                                    vr3.k0(1, i17);
                                    o88 o88Var3 = o88Var2;
                                    boolean z11 = z9;
                                    if (i17 != Integer.MAX_VALUE && !z11) {
                                        kx4VarQ0 = kx4VarQ0.y(new tz2(o88Var3, 1, i17));
                                    }
                                    kx4 kx4VarL = w39.l(kx4VarQ0.y(new w68(o88Var3)));
                                    boolean zBooleanValue = ((Boolean) lh7Var.getValue()).booleanValue();
                                    boolean zBooleanValue2 = ((Boolean) y05Var.getValue()).booleanValue();
                                    boolean z12 = g68Var2 == g68.Y;
                                    kd8 kd8Var3 = kd8Var2;
                                    r68 r68Var7 = r68Var6;
                                    d90 d90Var3 = d90Var2;
                                    boolean z13 = z10;
                                    kx4 kx4VarY2 = kx4VarL.y(new j48(zBooleanValue, zBooleanValue2, z12, y78Var3, kd8Var3, r68Var7, d90Var3, z13, ay6Var2, sd5Var7, ub8Var4, ip5Var5));
                                    xr4 xr4VarC3 = g80.c(pz2.Z, true);
                                    int iHashCode3 = Long.hashCode(lp2Var6.T);
                                    kl5 kl5VarL3 = lp2Var6.l();
                                    kx4 kx4VarQ3 = w45.Q(lp2Var6, kx4VarY2);
                                    uz0.j.getClass();
                                    lp2Var6.Z();
                                    if (lp2Var6.S) {
                                        lp2Var6.k();
                                    } else {
                                        lp2Var6.j0();
                                    }
                                    pn7.m(pz2.B0, lp2Var6, xr4VarC3);
                                    pn7.m(pz2.A0, lp2Var6, kl5VarL3);
                                    pn7.m(pz2.C0, lp2Var6, Integer.valueOf(iHashCode3));
                                    pn7.l(lp2Var6);
                                    pn7.m(pz2.z0, lp2Var6, kx4VarQ3);
                                    g80.a(new a78(y78Var3, kd8Var3, o88Var3, z11, wx3Var4), lp2Var6, 0);
                                    if (z13 && ((Boolean) lh7Var.getValue()).booleanValue() && ((Boolean) r68Var7.k.getValue()).booleanValue()) {
                                        lp2Var6.W(-810654004);
                                        x30.d(r68Var7, lp2Var6, 0);
                                        lp2Var6.W(-810526873);
                                        x30.c(r68Var7, lp2Var6, 0);
                                        lp2Var6.p(false);
                                        lp2Var6.p(false);
                                    } else {
                                        lp2Var6.W(-810390690);
                                        lp2Var6.p(false);
                                    }
                                    lp2Var6.p(true);
                                } else {
                                    lp2Var6.Q();
                                }
                                return dn8.a;
                            }
                        }, lp2Var5), lp2Var5, 6);
                    } else {
                        lp2Var5.Q();
                    }
                    return dn8.a;
                }
            };
            z2 = z;
            yn0.c(r68Var5, z2, jm4.U(-673241599, rn2Var2, lp2Var3), lp2Var3, ((i16 >> 3) & 112) | 384);
            lp2Var3.p(true);
            lp2Var2 = lp2Var3;
        } else {
            z2 = z;
            lp2 lp2Var5 = lp2Var;
            lp2Var5.Q();
            lp2Var2 = lp2Var5;
        }
        j86 j86VarR = lp2Var2.r();
        if (j86VarR != null) {
            j86VarR.d = new rn2() { // from class: s30
                @Override // defpackage.rn2
                public final Object K(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    int iP = w79.P(i | 1);
                    int iP2 = w79.P(i2);
                    x30.a(y68Var, kx4Var, z2, de3Var, o88Var, wx3Var, w58Var, xz4Var, d90Var, o48Var, ay6Var, (lp2) obj3, iP, iP2);
                    return dn8.a;
                }
            };
        }
    }

    public static final void b(final y68 y68Var, final kx4 kx4Var, final boolean z, final de3 de3Var, final o88 o88Var, final wx3 wx3Var, final w58 w58Var, final xz4 xz4Var, final d90 d90Var, final o48 o48Var, final ay6 ay6Var, lp2 lp2Var, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        lp2Var.X(469439921);
        int i9 = i | (lp2Var.f(y68Var) ? 4 : 2) | (lp2Var.f(kx4Var) ? 32 : 16) | (lp2Var.g(z) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128);
        if ((i3 & 8) != 0) {
            i4 = i9 | 3072;
        } else {
            i4 = i9 | (lp2Var.g(false) ? 2048 : 1024);
        }
        int i10 = i4 | (lp2Var.f(de3Var) ? 16384 : 8192) | (lp2Var.f(o88Var) ? 131072 : DnsOverHttps.MAX_RESPONSE_SIZE) | (lp2Var.f(wx3Var) ? 1048576 : 524288);
        if ((i3 & 128) != 0) {
            i5 = 12582912;
        } else {
            i5 = lp2Var.f(null) ? XRayConfig.OutboundBean.StreamSettingsBean.QuicParamsBean.DEFAULT_STREAM_WINDOW : 4194304;
        }
        int i11 = i10 | i5 | (lp2Var.f(w58Var) ? 67108864 : 33554432);
        if ((i3 & 512) != 0) {
            i6 = 805306368;
        } else {
            i6 = lp2Var.h(null) ? 536870912 : 268435456;
        }
        int i12 = i11 | i6;
        if ((i2 & 6) == 0) {
            i7 = i2 | (lp2Var.f(xz4Var) ? 4 : 2);
        } else {
            i7 = i2;
        }
        int i13 = i7 | (lp2Var.f(d90Var) ? 32 : 16);
        if ((i3 & 4096) != 0) {
            i8 = i13 | 384;
        } else {
            i8 = i13 | (lp2Var.f(null) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128);
        }
        int i14 = i8 | (lp2Var.f(o48Var) ? 2048 : 1024) | (lp2Var.f(ay6Var) ? 16384 : 8192);
        if (lp2Var.N(i12 & 1, ((306783379 & i12) == 306783378 && (i14 & 9363) == 9362) ? false : true)) {
            lp2Var.S();
            if ((i & 1) != 0 && !lp2Var.x()) {
                lp2Var.Q();
            }
            lp2Var.q();
            int i15 = (i14 & 14) | 384 | (i14 & 112);
            int i16 = i14 << 3;
            a(y68Var, kx4Var, z, de3Var, o88Var, wx3Var, w58Var, xz4Var, d90Var, o48Var, ay6Var, lp2Var, i12 & 2147483646, i15 | (i16 & 7168) | (57344 & i16) | (i16 & 458752));
        } else {
            lp2Var.Q();
        }
        j86 j86VarR = lp2Var.r();
        if (j86VarR != null) {
            j86VarR.d = new rn2(kx4Var, z, de3Var, o88Var, wx3Var, w58Var, xz4Var, d90Var, o48Var, ay6Var, i, i2, i3) { // from class: k30
                public final /* synthetic */ kx4 Y;
                public final /* synthetic */ boolean Z;
                public final /* synthetic */ de3 f0;
                public final /* synthetic */ o88 g0;
                public final /* synthetic */ wx3 h0;
                public final /* synthetic */ w58 i0;
                public final /* synthetic */ xz4 j0;
                public final /* synthetic */ d90 k0;
                public final /* synthetic */ o48 l0;
                public final /* synthetic */ ay6 m0;
                public final /* synthetic */ byte n0;
                public final /* synthetic */ short o0;

                /* JADX WARN: Multi-variable type inference failed */
                {
                    this.n0 = i2;
                    this.o0 = i3;
                }

                @Override // defpackage.rn2
                public final Object K(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP = w79.P(1);
                    int iP2 = w79.P(this.n0);
                    x30.b(this.X, this.Y, this.Z, this.f0, this.g0, this.h0, this.i0, this.j0, this.k0, this.l0, this.m0, (lp2) obj, iP, iP2, this.o0);
                    return dn8.a;
                }
            };
        }
    }

    public static final void c(r68 r68Var, lp2 lp2Var, int i) {
        lp2 lp2Var2;
        lp2Var.X(1991581797);
        int i2 = (lp2Var.h(r68Var) ? 4 : 2) | i;
        if (lp2Var.N(i2 & 1, (i2 & 3) != 2)) {
            boolean zF = lp2Var.f(r68Var);
            Object objK = lp2Var.K();
            be beVar = zz0.a;
            if (zF || objK == beVar) {
                objK = rd7.b(new n30(r68Var, (byte) 0));
                lp2Var.g0(objK);
            }
            if (((Boolean) ((lh7) objK).getValue()).booleanValue()) {
                lp2Var.W(535437134);
                boolean zH = lp2Var.h(r68Var);
                Object objK2 = lp2Var.K();
                if (zH || objK2 == beVar) {
                    objK2 = new v30(r68Var, (byte) 0);
                    lp2Var.g0(objK2);
                }
                v30 v30Var = (v30) objK2;
                boolean zH2 = lp2Var.h(r68Var);
                Object objK3 = lp2Var.K();
                if (zH2 || objK3 == beVar) {
                    objK3 = new w30(r68Var, (byte) 0);
                    lp2Var.g0(objK3);
                }
                lp2Var2 = lp2Var;
                dd.a(v30Var, yy7.a(hx4.X, r68Var, (PointerInputEventHandler) objK3), a, lp2Var2, 384);
                lp2Var2.p(false);
            } else {
                lp2Var2 = lp2Var;
                lp2Var2.W(535820573);
                lp2Var2.p(false);
            }
        } else {
            lp2Var2 = lp2Var;
            lp2Var2.Q();
        }
        j86 j86VarR = lp2Var2.r();
        if (j86VarR != null) {
            j86VarR.d = new l30(r68Var, i, (byte) 1);
        }
    }

    public static final void d(r68 r68Var, lp2 lp2Var, int i) {
        lp2Var.X(2025287684);
        int i2 = (lp2Var.h(r68Var) ? 4 : 2) | i;
        if (lp2Var.N(i2 & 1, (i2 & 3) != 2)) {
            boolean zF = lp2Var.f(r68Var);
            Object objK = lp2Var.K();
            be beVar = zz0.a;
            if (zF || objK == beVar) {
                objK = rd7.b(new n30(r68Var, (byte) 1));
                lp2Var.g0(objK);
            }
            f58 f58Var = (f58) ((lh7) objK).getValue();
            boolean z = f58Var.a;
            hx4 hx4Var = hx4.X;
            if (z) {
                lp2Var.W(-354609545);
                boolean zH = lp2Var.h(r68Var);
                Object objK2 = lp2Var.K();
                if (zH || objK2 == beVar) {
                    objK2 = new v30(r68Var, (byte) 1);
                    lp2Var.g0(objK2);
                }
                v30 v30Var = (v30) objK2;
                lf6 lf6Var = f58Var.d;
                boolean z2 = f58Var.e;
                boolean zH2 = lp2Var.h(r68Var);
                Object objK3 = lp2Var.K();
                if (zH2 || objK3 == beVar) {
                    objK3 = new w30(r68Var, (byte) 1);
                    lp2Var.g0(objK3);
                }
                w45.g(v30Var, true, lf6Var, z2, a, f58Var.c, yy7.a(hx4Var, r68Var, (PointerInputEventHandler) objK3), lp2Var, 24624);
                lp2Var.p(false);
            } else {
                lp2Var.W(-353981826);
                lp2Var.p(false);
            }
            boolean zF2 = lp2Var.f(r68Var);
            Object objK4 = lp2Var.K();
            if (zF2 || objK4 == beVar) {
                objK4 = rd7.b(new n30(r68Var, (byte) 2));
                lp2Var.g0(objK4);
            }
            f58 f58Var2 = (f58) ((lh7) objK4).getValue();
            if (f58Var2.a) {
                lp2Var.W(-353488678);
                boolean zH3 = lp2Var.h(r68Var);
                Object objK5 = lp2Var.K();
                if (zH3 || objK5 == beVar) {
                    objK5 = new v30(r68Var, (byte) 2);
                    lp2Var.g0(objK5);
                }
                v30 v30Var2 = (v30) objK5;
                lf6 lf6Var2 = f58Var2.d;
                boolean z3 = f58Var2.e;
                boolean zH4 = lp2Var.h(r68Var);
                Object objK6 = lp2Var.K();
                if (zH4 || objK6 == beVar) {
                    objK6 = new w30(r68Var, (byte) 2);
                    lp2Var.g0(objK6);
                }
                w45.g(v30Var2, false, lf6Var2, z3, a, f58Var2.c, yy7.a(hx4Var, r68Var, (PointerInputEventHandler) objK6), lp2Var, 24624);
                lp2Var.p(false);
            } else {
                lp2Var.W(-352863842);
                lp2Var.p(false);
            }
        } else {
            lp2Var.Q();
        }
        j86 j86VarR = lp2Var.r();
        if (j86VarR != null) {
            j86VarR.d = new l30(r68Var, i, (byte) 0);
        }
    }
}
