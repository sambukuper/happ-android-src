package defpackage;

import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import okhttp3.internal.dns._DnsMessageKt;
import okhttp3.internal.ws.WebSocketProtocol;
import org.conscrypt.FileClientSessionCache;
import org.conscrypt.metrics.ConscryptStatsLog;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class y48 extends oh1 implements rv1, w07, as2, kq5, gx3, s01, nx4, w85, w24, lh2 {
    public w05 A0;
    public final ci2 B0;
    public final cz7 C0;
    public qt1 D0;
    public final wt1 E0;
    public t09 F0;
    public og7 G0;
    public final lr H0;
    public final u48 I0;
    public og7 J0;
    public final s48 K0;
    public final rh5 L0;
    public kd8 s0;
    public y78 t0;
    public r68 u0;
    public de3 v0;
    public boolean w0;
    public wx3 x0;
    public boolean y0;
    public xz4 z0;

    public y48(kd8 kd8Var, y78 y78Var, r68 r68Var, de3 de3Var, boolean z, wx3 wx3Var, boolean z2, xz4 xz4Var, w05 w05Var) {
        this.s0 = kd8Var;
        this.t0 = y78Var;
        this.u0 = r68Var;
        this.v0 = de3Var;
        this.w0 = z;
        this.x0 = wx3Var;
        this.y0 = z2;
        this.z0 = xz4Var;
        this.A0 = w05Var;
        byte b = 3;
        r68Var.l = new s48(this, b);
        byte b2 = 0;
        this.B0 = new ci2(xz4Var, new t48(this, b2), 2);
        byte b3 = 5;
        sd sdVar = new sd(this, b3);
        aq5 aq5Var = yy7.a;
        cz7 cz7Var = new cz7(null, null, sdVar);
        Y0(cz7Var);
        this.C0 = cz7Var;
        s48 s48Var = new s48(this, b3);
        u48 u48Var = new u48(this, b2);
        byte b4 = 1;
        t48 t48Var = new t48(this, b4);
        t48 t48Var2 = new t48(this, (byte) 2);
        t48 t48Var3 = new t48(this, b);
        byte b5 = 4;
        wt1 wt1Var = new wt1(new p0(new py7((Object) s48Var, (byte) 6), new d58(t48Var, u48Var, t48Var2, t48Var3, new t48(this, b5), new t48(this, b3)), (byte) 18), 1);
        Y0(wt1Var);
        this.E0 = wt1Var;
        this.H0 = new lr((byte) 8);
        this.I0 = new u48(this, b4);
        this.K0 = new s48(this, b5);
        this.L0 = z51.H(Boolean.FALSE);
    }

    @Override // defpackage.lh2
    public final void E(hh2 hh2Var) {
        y24 y24VarB;
        r68 r68Var = this.u0;
        y78 y78Var = r68Var.b;
        x78 x78VarC = y78Var.c();
        s86 s86VarD = s86.e;
        if (x78VarC != null) {
            if (r68Var.h) {
                h48 h48VarD = r68Var.a.d();
                if (f88.b(h48VarD.f0)) {
                    s86VarD = r68Var.a(x78VarC, h48VarD);
                } else {
                    long j = h48VarD.f0;
                    if (!f88.b(j)) {
                        int i = (int) (j >> 32);
                        bz4 bz4Var = x78VarC.b;
                        int iC = bz4Var.c(i);
                        int i2 = (int) (4294967295L & j);
                        int iC2 = bz4Var.c(i2);
                        if (iC == iC2) {
                            float fE = x78VarC.e(i, true);
                            float fE2 = x78VarC.e(i2, true);
                            s86VarD = new s86(Math.min(fE, fE2), bz4Var.e(iC), Math.max(fE, fE2), bz4Var.a(iC2));
                        } else {
                            s86VarD = x78VarC.j(f88.d(j), f88.c(j)).d();
                        }
                    }
                }
                y24 y24VarE = y78Var.e();
                if (y24VarE != null) {
                    if (!y24VarE.g()) {
                        y24VarE = null;
                    }
                    if (y24VarE != null && (y24VarB = y78Var.b()) != null) {
                        y24 y24Var = y24VarB.g() ? y24VarB : null;
                        if (y24Var != null) {
                            s86VarD = s86VarD.k(y24Var.H(y24VarE, false).f());
                        }
                    }
                }
            } else {
                s86VarD = oy1.A0;
            }
        }
        hh2Var.e(s86VarD);
    }

    /* JADX WARN: Code duplicated, block: B:104:0x01e4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:105:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:106:0x01e9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:115:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:116:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:118:0x0205  */
    /* JADX WARN: Code duplicated, block: B:138:0x0253 A[PHI: r28
  0x0253: PHI (r28v55 bx3) = (r28v53 bx3), (r28v53 bx3), (r28v53 bx3), (r28v53 bx3), (r28v56 bx3) binds: [B:191:0x0316, B:193:0x0326, B:187:0x030e, B:172:0x02d4, B:136:0x0250] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:142:0x0262  */
    /* JADX WARN: Code duplicated, block: B:143:0x0266  */
    /* JADX WARN: Code duplicated, block: B:145:0x026b  */
    /* JADX WARN: Code duplicated, block: B:177:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:178:0x02e5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:179:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:189:0x0313  */
    /* JADX WARN: Code duplicated, block: B:190:0x0315  */
    /* JADX WARN: Code duplicated, block: B:196:0x032c  */
    /* JADX WARN: Code duplicated, block: B:198:0x0334  */
    /* JADX WARN: Code duplicated, block: B:201:0x0345  */
    /* JADX WARN: Code duplicated, block: B:203:0x0348  */
    /* JADX WARN: Code duplicated, block: B:221:0x0392  */
    /* JADX WARN: Code duplicated, block: B:225:0x03a2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:226:0x03a4  */
    /* JADX WARN: Code duplicated, block: B:277:0x0462  */
    /* JADX WARN: Code duplicated, block: B:278:0x0466 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:279:0x0468  */
    /* JADX WARN: Code duplicated, block: B:335:0x053a  */
    /* JADX WARN: Code duplicated, block: B:338:0x0545  */
    /* JADX WARN: Code duplicated, block: B:341:0x0550  */
    /* JADX WARN: Code duplicated, block: B:353:0x0575  */
    /* JADX WARN: Code duplicated, block: B:354:0x0577  */
    /* JADX WARN: Code duplicated, block: B:355:0x0579  */
    /* JADX WARN: Code duplicated, block: B:356:0x057b  */
    /* JADX WARN: Code duplicated, block: B:359:0x058a  */
    /* JADX WARN: Code duplicated, block: B:362:0x0590  */
    /* JADX WARN: Code duplicated, block: B:378:0x05c5  */
    /* JADX WARN: Code duplicated, block: B:381:0x05d5  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:48:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:50:0x010a  */
    /* JADX WARN: Code duplicated, block: B:51:0x010e  */
    /* JADX WARN: Code duplicated, block: B:53:0x0116  */
    /* JADX WARN: Code duplicated, block: B:544:0x0a62 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:549:0x0a6c  */
    /* JADX WARN: Code duplicated, block: B:54:0x0119  */
    /* JADX WARN: Code duplicated, block: B:552:0x0a83  */
    /* JADX WARN: Code duplicated, block: B:555:0x0a8c  */
    /* JADX WARN: Code duplicated, block: B:557:0x0a98  */
    /* JADX WARN: Code duplicated, block: B:558:0x0aa1  */
    /* JADX WARN: Code duplicated, block: B:56:0x0121  */
    /* JADX WARN: Code duplicated, block: B:57:0x0124  */
    /* JADX WARN: Code duplicated, block: B:59:0x012c  */
    /* JADX WARN: Code duplicated, block: B:60:0x012f  */
    /* JADX WARN: Code duplicated, block: B:61:0x0131  */
    /* JADX WARN: Code duplicated, block: B:63:0x0135  */
    /* JADX WARN: Code duplicated, block: B:65:0x0145  */
    /* JADX WARN: Code duplicated, block: B:66:0x0148  */
    /* JADX WARN: Code duplicated, block: B:68:0x0150  */
    /* JADX WARN: Code duplicated, block: B:69:0x0153  */
    /* JADX WARN: Code duplicated, block: B:71:0x015b  */
    /* JADX WARN: Code duplicated, block: B:72:0x015e  */
    /* JADX WARN: Code duplicated, block: B:74:0x0166  */
    /* JADX WARN: Code duplicated, block: B:75:0x0169  */
    /* JADX WARN: Code duplicated, block: B:77:0x0171  */
    /* JADX WARN: Code duplicated, block: B:80:0x017d  */
    /* JADX WARN: Code duplicated, block: B:82:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:88:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:90:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:93:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:96:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:97:0x01ca A[PHI: r1 r24 r27
  0x01ca: PHI (r1v67 int) = (r1v18 int), (r1v22 int), (r1v73 int) binds: [B:112:0x01f2, B:103:0x01e1, B:96:0x01c6] A[DONT_GENERATE, DONT_INLINE]
  0x01ca: PHI (r24v6 e68) = (r24v4 e68), (r24v4 e68), (r24v10 e68) binds: [B:112:0x01f2, B:103:0x01e1, B:96:0x01c6] A[DONT_GENERATE, DONT_INLINE]
  0x01ca: PHI (r27v5 bx3) = (r27v3 bx3), (r27v3 bx3), (r27v9 bx3) binds: [B:112:0x01f2, B:103:0x01e1, B:96:0x01c6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:98:0x01cc  */
    @Override // defpackage.gx3
    public final boolean F(KeyEvent keyEvent) {
        KeyEvent keyEvent2;
        int iZ;
        long jD;
        bx3 bx3Var;
        bx3 bx3Var2;
        bx3 bx3Var3;
        bx3 bx3Var4;
        y78 y78Var;
        kd8 kd8Var;
        boolean z;
        bx3 bx3Var5;
        bx3 bx3Var6;
        boolean z2;
        float fIntBitsToFloat;
        bx3 bx3Var7;
        boolean zB1;
        h48 h48Var;
        f09 f09Var;
        s86 s86VarH;
        int iZ2;
        long jD2;
        boolean zA;
        bx3 bx3Var8;
        bx3 bx3Var9;
        int i;
        bx3 bx3Var10;
        int iZ3;
        bx3 bx3Var11;
        bx3 bx3Var12;
        bx3 bx3Var13;
        long jD3;
        long jD4;
        int iZ4;
        long jD5;
        long jD6;
        long jD7;
        long jD8;
        long jD9;
        Integer numValueOf;
        kd8 kd8Var2 = this.s0;
        y78 y78Var2 = this.t0;
        r68 r68Var = this.u0;
        be7 be7VarF1 = f1();
        boolean z3 = this.w0;
        boolean z4 = this.y0;
        lr lrVar = this.H0;
        lrVar.getClass();
        e68 e68Var = (e68) lrVar.Y;
        if (w39.S(keyEvent) == 2) {
            keyEvent2 = keyEvent;
            if (keyEvent2.isFromSource(257) && (!qp7.h(keyEvent2) || !rp7.f(keyEvent2))) {
                r68Var.w(false);
            }
        } else {
            keyEvent2 = keyEvent;
        }
        long jD10 = pu.d(keyEvent2.getKeyCode());
        if (w39.S(keyEvent2) == 1) {
            b05 b05Var = (b05) lrVar.f0;
            if (b05Var != null && b05Var.a(jD10)) {
                b05 b05Var2 = (b05) lrVar.f0;
                if (b05Var2 != null) {
                    b05Var2.e(jD10);
                }
                return true;
            }
        } else if (w39.S(keyEvent2) != 0 || rp7.f(keyEvent2)) {
            boolean z5 = false;
            if (rp7.f(keyEvent2)) {
                yr2 yr2Var = (yr2) lrVar.Z;
                int unicodeChar = keyEvent2.getUnicodeChar();
                if ((unicodeChar & Integer.MIN_VALUE) != 0) {
                    yr2Var.Y = Integer.valueOf(unicodeChar & Integer.MAX_VALUE);
                    numValueOf = null;
                } else {
                    Integer num = (Integer) yr2Var.Y;
                    if (num != null) {
                        yr2Var.Y = null;
                        int deadChar = KeyCharacterMap.getDeadChar(num.intValue(), unicodeChar);
                        Integer numValueOf2 = Integer.valueOf(deadChar);
                        if (deadChar == 0) {
                            numValueOf2 = null;
                        }
                        if (numValueOf2 != null) {
                            unicodeChar = numValueOf2.intValue();
                        }
                        numValueOf = Integer.valueOf(unicodeChar);
                    } else {
                        numValueOf = Integer.valueOf(unicodeChar);
                    }
                }
                if (numValueOf != null) {
                    String string = new StringBuilder(2).appendCodePoint(numValueOf.intValue()).toString();
                    if (z3) {
                        kd8.h(kd8Var2, string, !qp7.h(keyEvent2), qp7.g(keyEvent2), 4);
                        e68Var.a = Float.NaN;
                        jD10 = jD10;
                        z2 = true;
                    } else {
                        jD10 = jD10;
                        z2 = false;
                    }
                } else {
                    iZ = w79.z(keyEvent2);
                    int i2 = z39.n0;
                    if (iZ == 9) {
                        jD9 = pu.d(keyEvent2.getKeyCode());
                        if (ax3.a(jD9, ax3.f)) {
                            bx3Var = bx3.S0;
                        } else if (ax3.a(jD9, ax3.g)) {
                            bx3Var = bx3.T0;
                        } else if (ax3.a(jD9, ax3.d)) {
                            bx3Var = bx3.K0;
                        } else if (ax3.a(jD9, ax3.e)) {
                            bx3Var = bx3.L0;
                        } else {
                            bx3Var = null;
                        }
                    } else if (iZ == 1) {
                        jD = pu.d(keyEvent.getKeyCode());
                        if (ax3.a(jD, ax3.f)) {
                            bx3Var = bx3.l0;
                        } else if (ax3.a(jD, ax3.g)) {
                            bx3Var = bx3.m0;
                        } else if (ax3.a(jD, ax3.d)) {
                            bx3Var = bx3.s0;
                        } else if (ax3.a(jD, ax3.e)) {
                            bx3Var = bx3.t0;
                        } else if (ax3.a(jD, ax3.s)) {
                            bx3Var = bx3.B0;
                        } else {
                            bx3Var = null;
                        }
                    } else {
                        bx3Var = null;
                    }
                    bx3Var2 = bx3.Y;
                    bx3 bx3Var14 = bx3.Z;
                    bx3Var3 = bx3.n0;
                    bx3Var4 = bx3.o0;
                    if (bx3Var == null) {
                        int i3 = z39.o0;
                        iZ2 = w79.z(keyEvent);
                        y78Var = y78Var2;
                        kd8Var = kd8Var2;
                        jD2 = pu.d(keyEvent.getKeyCode());
                        z = z3;
                        bx3Var5 = bx3Var3;
                        long j = ax3.s;
                        zA = ax3.a(jD2, j);
                        bx3Var8 = bx3.V0;
                        bx3Var9 = bx3.x0;
                        if (zA) {
                            if (iZ2 == 0 && iZ2 != 8) {
                                int i4 = z39.p0;
                                if (iZ2 == 12) {
                                    bx3Var10 = bx3Var9;
                                } else {
                                    if (iZ2 != 2) {
                                        i = 10;
                                        if (iZ2 != 10) {
                                            bx3Var4 = bx3Var4;
                                            e68Var = e68Var;
                                            bx3Var10 = null;
                                        }
                                    }
                                    bx3Var10 = bx3.z0;
                                }
                            } else {
                                bx3Var10 = bx3Var9;
                            }
                            i = 10;
                        } else {
                            bx3Var4 = bx3Var4;
                            e68Var = e68Var;
                            if (!ax3.a(jD2, ax3.r) || ax3.a(jD2, ax3.E)) {
                                if (iZ2 != 0 || iZ2 == 8 || iZ2 == 2) {
                                    i = 10;
                                } else {
                                    i = 10;
                                    if (iZ2 == 10) {
                                    }
                                }
                                bx3Var10 = bx3Var8;
                            } else {
                                i = 10;
                            }
                            bx3Var10 = null;
                        }
                        if (bx3Var10 != null) {
                            bx3Var6 = bx3Var10;
                        } else {
                            iZ3 = w79.z(keyEvent);
                            bx3Var = bx3.Q0;
                            bx3Var11 = bx3.R0;
                            if (iZ3 == i) {
                                jD8 = pu.d(keyEvent.getKeyCode());
                                bx3Var12 = bx3Var11;
                                if (!ax3.a(jD8, ax3.f) || ax3.a(jD8, ax3.H)) {
                                    bx3Var13 = bx3.M0;
                                } else if (ax3.a(jD8, ax3.g) || ax3.a(jD8, ax3.I)) {
                                    bx3Var13 = bx3.N0;
                                } else if (ax3.a(jD8, ax3.d) || ax3.a(jD8, ax3.F)) {
                                    bx3Var13 = bx3.P0;
                                } else if (ax3.a(jD8, ax3.e) || ax3.a(jD8, ax3.G)) {
                                    bx3Var13 = bx3.O0;
                                } else {
                                    bx3Var13 = null;
                                }
                            } else {
                                bx3Var12 = bx3Var11;
                                if (iZ3 == 2) {
                                    jD4 = pu.d(keyEvent.getKeyCode());
                                    if (!ax3.a(jD4, ax3.f) || ax3.a(jD4, ax3.H)) {
                                        bx3Var13 = bx3.g0;
                                    } else if (ax3.a(jD4, ax3.g) || ax3.a(jD4, ax3.I)) {
                                        bx3Var13 = bx3.f0;
                                    } else if (ax3.a(jD4, ax3.d) || ax3.a(jD4, ax3.F)) {
                                        bx3Var13 = bx3.i0;
                                    } else if (ax3.a(jD4, ax3.e) || ax3.a(jD4, ax3.G)) {
                                        bx3Var13 = bx3.h0;
                                    } else if (ax3.a(jD4, ax3.k)) {
                                        bx3Var13 = bx3Var9;
                                    } else if (ax3.a(jD4, ax3.t)) {
                                        bx3Var13 = bx3.A0;
                                    } else if (ax3.a(jD4, ax3.B)) {
                                        bx3Var13 = bx3.U0;
                                    } else {
                                        bx3Var13 = null;
                                    }
                                } else if (iZ3 == 8) {
                                    jD3 = pu.d(keyEvent.getKeyCode());
                                    if (!ax3.a(jD3, ax3.v) || ax3.a(jD3, ax3.J)) {
                                        bx3Var13 = bx3Var;
                                    } else if (ax3.a(jD3, ax3.w) || ax3.a(jD3, ax3.K)) {
                                        bx3Var13 = bx3Var12;
                                    } else {
                                        bx3Var13 = null;
                                    }
                                } else if (iZ3 == 1 || !ax3.a(pu.d(keyEvent.getKeyCode()), ax3.t)) {
                                    bx3Var13 = null;
                                } else {
                                    bx3Var13 = bx3.C0;
                                }
                            }
                            if (bx3Var13 == null) {
                                iZ4 = w79.z(keyEvent);
                                if (iZ4 == 10) {
                                    if (ax3.a(pu.d(keyEvent.getKeyCode()), ax3.o)) {
                                        bx3Var6 = bx3.Y0;
                                    } else {
                                        bx3Var6 = null;
                                    }
                                } else if (iZ4 == 2) {
                                    jD7 = pu.d(keyEvent.getKeyCode());
                                    if (!ax3.a(jD7, ax3.j) || ax3.a(jD7, ax3.x) || ax3.a(jD7, ax3.N)) {
                                        bx3Var6 = bx3.u0;
                                    } else if (ax3.a(jD7, ax3.l)) {
                                        bx3Var6 = bx3.v0;
                                    } else if (ax3.a(jD7, ax3.m)) {
                                        bx3Var6 = bx3.w0;
                                    } else if (ax3.a(jD7, ax3.i)) {
                                        bx3Var6 = bx3.D0;
                                    } else if (ax3.a(jD7, ax3.n)) {
                                        bx3Var6 = bx3.Y0;
                                    } else if (ax3.a(jD7, ax3.o)) {
                                        bx3Var6 = bx3.X0;
                                    } else {
                                        bx3Var6 = null;
                                    }
                                } else if (iZ4 == 8) {
                                    jD6 = pu.d(keyEvent.getKeyCode());
                                    if (!ax3.a(jD6, ax3.f) || ax3.a(jD6, ax3.H)) {
                                        bx3Var6 = bx3.E0;
                                    } else if (ax3.a(jD6, ax3.g) || ax3.a(jD6, ax3.I)) {
                                        bx3Var6 = bx3.F0;
                                    } else if (ax3.a(jD6, ax3.d) || ax3.a(jD6, ax3.F)) {
                                        bx3Var6 = bx3.G0;
                                    } else if (ax3.a(jD6, ax3.e) || ax3.a(jD6, ax3.G)) {
                                        bx3Var6 = bx3.H0;
                                    } else if (ax3.a(jD6, ax3.C) || ax3.a(jD6, ax3.L)) {
                                        bx3Var6 = bx3.I0;
                                    } else if (ax3.a(jD6, ax3.D) || ax3.a(jD6, ax3.M)) {
                                        bx3Var6 = bx3.J0;
                                    } else if (!ax3.a(jD6, ax3.v) && !ax3.a(jD6, ax3.J)) {
                                        if (ax3.a(jD6, ax3.w) || ax3.a(jD6, ax3.K)) {
                                            bx3Var6 = bx3Var12;
                                        } else if (ax3.a(jD6, ax3.x) || ax3.a(jD6, ax3.N)) {
                                            bx3Var6 = bx3.v0;
                                        } else {
                                            bx3Var6 = null;
                                        }
                                    }
                                } else if (iZ4 == 0) {
                                    jD5 = pu.d(keyEvent.getKeyCode());
                                    if (!ax3.a(jD5, ax3.f) || ax3.a(jD5, ax3.H)) {
                                        bx3Var6 = bx3Var2;
                                    } else if (ax3.a(jD5, ax3.g) || ax3.a(jD5, ax3.I)) {
                                        bx3Var6 = bx3Var14;
                                    } else if (ax3.a(jD5, ax3.d) || ax3.a(jD5, ax3.F)) {
                                        bx3Var6 = bx3Var5;
                                    } else if (ax3.a(jD5, ax3.e) || ax3.a(jD5, ax3.G)) {
                                        bx3Var6 = bx3Var4;
                                    } else if (ax3.a(jD5, ax3.h)) {
                                        bx3Var6 = bx3.p0;
                                    } else if (ax3.a(jD5, ax3.C) || ax3.a(jD5, ax3.L)) {
                                        bx3Var6 = bx3.q0;
                                    } else if (ax3.a(jD5, ax3.D) || ax3.a(jD5, ax3.M)) {
                                        bx3Var6 = bx3.r0;
                                    } else if (ax3.a(jD5, ax3.v) || ax3.a(jD5, ax3.J)) {
                                        bx3Var6 = bx3.j0;
                                    } else if (ax3.a(jD5, ax3.w) || ax3.a(jD5, ax3.K)) {
                                        bx3Var6 = bx3.k0;
                                    } else if (ax3.a(jD5, ax3.r) || ax3.a(jD5, ax3.E)) {
                                        bx3Var6 = bx3Var8;
                                    } else if (ax3.a(jD5, j)) {
                                        bx3Var6 = bx3Var9;
                                    } else if (ax3.a(jD5, ax3.t)) {
                                        bx3Var6 = bx3.y0;
                                    } else if (ax3.a(jD5, ax3.A)) {
                                        bx3Var6 = bx3.v0;
                                    } else if (ax3.a(jD5, ax3.y)) {
                                        bx3Var6 = bx3.w0;
                                    } else if (ax3.a(jD5, ax3.z)) {
                                        bx3Var6 = bx3.u0;
                                    } else if (ax3.a(jD5, ax3.p)) {
                                        bx3Var6 = bx3.W0;
                                    } else {
                                        bx3Var6 = null;
                                    }
                                } else {
                                    bx3Var6 = null;
                                }
                            } else {
                                bx3Var6 = bx3Var13;
                            }
                        }
                        if (bx3Var6 != null || (bx3Var6.X && !z)) {
                            jD10 = jD10;
                            z2 = false;
                        } else {
                            x78 x78VarC = y78Var.c();
                            y24 y24VarE = y78Var.e();
                            if (y24VarE == null) {
                                fIntBitsToFloat = Float.NaN;
                            } else {
                                if (!y24VarE.g()) {
                                    y24VarE = null;
                                }
                                if (y24VarE == null) {
                                    fIntBitsToFloat = Float.NaN;
                                } else {
                                    y24 y24VarB = y78Var.b();
                                    if (y24VarB == null) {
                                        s86VarH = null;
                                    } else {
                                        if (!y24VarB.g()) {
                                            y24VarB = null;
                                        }
                                        if (y24VarB != null) {
                                            s86VarH = y24VarB.H(y24VarE, true);
                                        } else {
                                            s86VarH = null;
                                        }
                                    }
                                    if (s86VarH != null) {
                                        fIntBitsToFloat = Float.intBitsToFloat((int) (s86VarH.e() & 4294967295L));
                                    } else {
                                        fIntBitsToFloat = Float.NaN;
                                    }
                                }
                            }
                            bx3 bx3Var15 = bx3Var6;
                            kd8 kd8Var3 = kd8Var;
                            bx3 bx3Var16 = bx3Var5;
                            bx3 bx3Var17 = bx3Var4;
                            p07 p07Var = new p07(kd8Var3, x78VarC, qp7.h(keyEvent), qp7.g(keyEvent), fIntBitsToFloat, e68Var);
                            rh5 rh5Var = kd8Var3.e;
                            y68 y68Var = kd8Var3.a;
                            int iOrdinal = bx3Var15.ordinal();
                            String str = p07Var.k;
                            switch (iOrdinal) {
                                case 0:
                                    jD10 = jD10;
                                    bx3Var7 = bx3Var15;
                                    e68Var.a = Float.NaN;
                                    if (str.length() > 0) {
                                        if (!f88.b(p07Var.i)) {
                                            boolean zB = p07Var.b();
                                            long j2 = p07Var.i;
                                            if (zB) {
                                                int iD = f88.d(j2);
                                                p07Var.i = ct7.c(iD, iD);
                                            } else {
                                                int iC = f88.c(j2);
                                                p07Var.i = ct7.c(iC, iC);
                                            }
                                        } else if (p07Var.b()) {
                                            p07Var.j();
                                        } else {
                                            p07Var.g();
                                        }
                                    }
                                    z5 = true;
                                    h48Var = p07Var.g;
                                    if (bx3Var7 != bx3Var16 || bx3Var7 == bx3Var17 || bx3Var7 == bx3Var2 || bx3Var7 == bx3Var14) {
                                        z2 = !f88.a(h48Var.f0, p07Var.i);
                                    } else {
                                        z2 = z5;
                                    }
                                    if (!f88.a(p07Var.i, h48Var.f0)) {
                                        kd8Var3.j(p07Var.i);
                                    }
                                    f09Var = p07Var.j;
                                    if (f09Var != null) {
                                        if (!f88.b(y68Var.c().f0)) {
                                            rh5Var.setValue(new r07(p07Var.h.a, f09Var));
                                        } else {
                                            rh5Var.setValue(new r07(f09Var, f09Var));
                                        }
                                    }
                                    break;
                                case 1:
                                    jD10 = jD10;
                                    bx3Var7 = bx3Var15;
                                    e68Var.a = Float.NaN;
                                    if (str.length() > 0) {
                                        if (!f88.b(p07Var.i)) {
                                            boolean zB2 = p07Var.b();
                                            long j3 = p07Var.i;
                                            if (zB2) {
                                                int iC2 = f88.c(j3);
                                                p07Var.i = ct7.c(iC2, iC2);
                                            } else {
                                                int iD2 = f88.d(j3);
                                                p07Var.i = ct7.c(iD2, iD2);
                                            }
                                        } else if (p07Var.b()) {
                                            p07Var.g();
                                        } else {
                                            p07Var.j();
                                        }
                                    }
                                    z5 = true;
                                    h48Var = p07Var.g;
                                    if (bx3Var7 != bx3Var16) {
                                        z2 = !f88.a(h48Var.f0, p07Var.i);
                                    } else {
                                        z2 = !f88.a(h48Var.f0, p07Var.i);
                                    }
                                    if (!f88.a(p07Var.i, h48Var.f0)) {
                                        kd8Var3.j(p07Var.i);
                                    }
                                    f09Var = p07Var.j;
                                    if (f09Var != null) {
                                        if (!f88.b(y68Var.c().f0)) {
                                            rh5Var.setValue(new r07(p07Var.h.a, f09Var));
                                        } else {
                                            rh5Var.setValue(new r07(f09Var, f09Var));
                                        }
                                    }
                                    break;
                                case 2:
                                    jD10 = jD10;
                                    bx3Var7 = bx3Var15;
                                    if (p07Var.b()) {
                                        p07Var.i();
                                    } else {
                                        p07Var.l();
                                    }
                                    z5 = true;
                                    h48Var = p07Var.g;
                                    if (bx3Var7 != bx3Var16) {
                                        z2 = !f88.a(h48Var.f0, p07Var.i);
                                    } else {
                                        z2 = !f88.a(h48Var.f0, p07Var.i);
                                    }
                                    if (!f88.a(p07Var.i, h48Var.f0)) {
                                        kd8Var3.j(p07Var.i);
                                    }
                                    f09Var = p07Var.j;
                                    if (f09Var != null) {
                                        if (!f88.b(y68Var.c().f0)) {
                                            rh5Var.setValue(new r07(p07Var.h.a, f09Var));
                                        } else {
                                            rh5Var.setValue(new r07(f09Var, f09Var));
                                        }
                                    }
                                    break;
                                case 3:
                                    jD10 = jD10;
                                    bx3Var7 = bx3Var15;
                                    if (p07Var.b()) {
                                        p07Var.l();
                                    } else {
                                        p07Var.i();
                                    }
                                    z5 = true;
                                    h48Var = p07Var.g;
                                    if (bx3Var7 != bx3Var16) {
                                        z2 = !f88.a(h48Var.f0, p07Var.i);
                                    } else {
                                        z2 = !f88.a(h48Var.f0, p07Var.i);
                                    }
                                    if (!f88.a(p07Var.i, h48Var.f0)) {
                                        kd8Var3.j(p07Var.i);
                                    }
                                    f09Var = p07Var.j;
                                    if (f09Var != null) {
                                        if (!f88.b(y68Var.c().f0)) {
                                            rh5Var.setValue(new r07(p07Var.h.a, f09Var));
                                        } else {
                                            rh5Var.setValue(new r07(f09Var, f09Var));
                                        }
                                    }
                                    break;
                                case 4:
                                    jD10 = jD10;
                                    bx3Var7 = bx3Var15;
                                    p07Var.h();
                                    z5 = true;
                                    h48Var = p07Var.g;
                                    if (bx3Var7 != bx3Var16) {
                                        z2 = !f88.a(h48Var.f0, p07Var.i);
                                    } else {
                                        z2 = !f88.a(h48Var.f0, p07Var.i);
                                    }
                                    if (!f88.a(p07Var.i, h48Var.f0)) {
                                        kd8Var3.j(p07Var.i);
                                    }
                                    f09Var = p07Var.j;
                                    if (f09Var != null) {
                                        if (!f88.b(y68Var.c().f0)) {
                                            rh5Var.setValue(new r07(p07Var.h.a, f09Var));
                                        } else {
                                            rh5Var.setValue(new r07(f09Var, f09Var));
                                        }
                                    }
                                    break;
                                case 5:
                                    jD10 = jD10;
                                    bx3Var7 = bx3Var15;
                                    p07Var.k();
                                    z5 = true;
                                    h48Var = p07Var.g;
                                    if (bx3Var7 != bx3Var16) {
                                        z2 = !f88.a(h48Var.f0, p07Var.i);
                                    } else {
                                        z2 = !f88.a(h48Var.f0, p07Var.i);
                                    }
                                    if (!f88.a(p07Var.i, h48Var.f0)) {
                                        kd8Var3.j(p07Var.i);
                                    }
                                    f09Var = p07Var.j;
                                    if (f09Var != null) {
                                        if (!f88.b(y68Var.c().f0)) {
                                            rh5Var.setValue(new r07(p07Var.h.a, f09Var));
                                        } else {
                                            rh5Var.setValue(new r07(f09Var, f09Var));
                                        }
                                    }
                                    break;
                                case 6:
                                    jD10 = jD10;
                                    bx3Var7 = bx3Var15;
                                    p07Var.p();
                                    z5 = true;
                                    h48Var = p07Var.g;
                                    if (bx3Var7 != bx3Var16) {
                                        z2 = !f88.a(h48Var.f0, p07Var.i);
                                    } else {
                                        z2 = !f88.a(h48Var.f0, p07Var.i);
                                    }
                                    if (!f88.a(p07Var.i, h48Var.f0)) {
                                        kd8Var3.j(p07Var.i);
                                    }
                                    f09Var = p07Var.j;
                                    if (f09Var != null) {
                                        if (!f88.b(y68Var.c().f0)) {
                                            rh5Var.setValue(new r07(p07Var.h.a, f09Var));
                                        } else {
                                            rh5Var.setValue(new r07(f09Var, f09Var));
                                        }
                                    }
                                    break;
                                case 7:
                                    jD10 = jD10;
                                    bx3Var7 = bx3Var15;
                                    p07Var.o();
                                    z5 = true;
                                    h48Var = p07Var.g;
                                    if (bx3Var7 != bx3Var16) {
                                        z2 = !f88.a(h48Var.f0, p07Var.i);
                                    } else {
                                        z2 = !f88.a(h48Var.f0, p07Var.i);
                                    }
                                    if (!f88.a(p07Var.i, h48Var.f0)) {
                                        kd8Var3.j(p07Var.i);
                                    }
                                    f09Var = p07Var.j;
                                    if (f09Var != null) {
                                        if (!f88.b(y68Var.c().f0)) {
                                            rh5Var.setValue(new r07(p07Var.h.a, f09Var));
                                        } else {
                                            rh5Var.setValue(new r07(f09Var, f09Var));
                                        }
                                    }
                                    break;
                                case 8:
                                    jD10 = jD10;
                                    bx3Var7 = bx3Var15;
                                    if (p07Var.b()) {
                                        p07Var.p();
                                    } else {
                                        p07Var.o();
                                    }
                                    z5 = true;
                                    h48Var = p07Var.g;
                                    if (bx3Var7 != bx3Var16) {
                                        z2 = !f88.a(h48Var.f0, p07Var.i);
                                    } else {
                                        z2 = !f88.a(h48Var.f0, p07Var.i);
                                    }
                                    if (!f88.a(p07Var.i, h48Var.f0)) {
                                        kd8Var3.j(p07Var.i);
                                    }
                                    f09Var = p07Var.j;
                                    if (f09Var != null) {
                                        if (!f88.b(y68Var.c().f0)) {
                                            rh5Var.setValue(new r07(p07Var.h.a, f09Var));
                                        } else {
                                            rh5Var.setValue(new r07(f09Var, f09Var));
                                        }
                                    }
                                    break;
                                case 9:
                                    jD10 = jD10;
                                    bx3Var7 = bx3Var15;
                                    if (p07Var.b()) {
                                        p07Var.o();
                                    } else {
                                        p07Var.p();
                                    }
                                    z5 = true;
                                    h48Var = p07Var.g;
                                    if (bx3Var7 != bx3Var16) {
                                        z2 = !f88.a(h48Var.f0, p07Var.i);
                                    } else {
                                        z2 = !f88.a(h48Var.f0, p07Var.i);
                                    }
                                    if (!f88.a(p07Var.i, h48Var.f0)) {
                                        kd8Var3.j(p07Var.i);
                                    }
                                    f09Var = p07Var.j;
                                    if (f09Var != null) {
                                        if (!f88.b(y68Var.c().f0)) {
                                            rh5Var.setValue(new r07(p07Var.h.a, f09Var));
                                        } else {
                                            rh5Var.setValue(new r07(f09Var, f09Var));
                                        }
                                    }
                                    break;
                                case 10:
                                    jD10 = jD10;
                                    bx3Var7 = bx3Var15;
                                    p07Var.q();
                                    z5 = true;
                                    h48Var = p07Var.g;
                                    if (bx3Var7 != bx3Var16) {
                                        z2 = !f88.a(h48Var.f0, p07Var.i);
                                    } else {
                                        z2 = !f88.a(h48Var.f0, p07Var.i);
                                    }
                                    if (!f88.a(p07Var.i, h48Var.f0)) {
                                        kd8Var3.j(p07Var.i);
                                    }
                                    f09Var = p07Var.j;
                                    if (f09Var != null) {
                                        if (!f88.b(y68Var.c().f0)) {
                                            rh5Var.setValue(new r07(p07Var.h.a, f09Var));
                                        } else {
                                            rh5Var.setValue(new r07(f09Var, f09Var));
                                        }
                                    }
                                    break;
                                case 11:
                                    jD10 = jD10;
                                    bx3Var7 = bx3Var15;
                                    p07Var.e();
                                    z5 = true;
                                    h48Var = p07Var.g;
                                    if (bx3Var7 != bx3Var16) {
                                        z2 = !f88.a(h48Var.f0, p07Var.i);
                                    } else {
                                        z2 = !f88.a(h48Var.f0, p07Var.i);
                                    }
                                    if (!f88.a(p07Var.i, h48Var.f0)) {
                                        kd8Var3.j(p07Var.i);
                                    }
                                    f09Var = p07Var.j;
                                    if (f09Var != null) {
                                        if (!f88.b(y68Var.c().f0)) {
                                            rh5Var.setValue(new r07(p07Var.h.a, f09Var));
                                        } else {
                                            rh5Var.setValue(new r07(f09Var, f09Var));
                                        }
                                    }
                                    break;
                                case FileClientSessionCache.MAX_SIZE /* 12 */:
                                    jD10 = jD10;
                                    bx3Var7 = bx3Var15;
                                    ((ai1) be7VarF1).a();
                                    z5 = true;
                                    h48Var = p07Var.g;
                                    if (bx3Var7 != bx3Var16) {
                                        z2 = !f88.a(h48Var.f0, p07Var.i);
                                    } else {
                                        z2 = !f88.a(h48Var.f0, p07Var.i);
                                    }
                                    if (!f88.a(p07Var.i, h48Var.f0)) {
                                        kd8Var3.j(p07Var.i);
                                    }
                                    f09Var = p07Var.j;
                                    if (f09Var != null) {
                                        if (!f88.b(y68Var.c().f0)) {
                                            rh5Var.setValue(new r07(p07Var.h.a, f09Var));
                                        } else {
                                            rh5Var.setValue(new r07(f09Var, f09Var));
                                        }
                                    }
                                    break;
                                case 13:
                                    jD10 = jD10;
                                    bx3Var7 = bx3Var15;
                                    p07Var.r();
                                    z5 = true;
                                    h48Var = p07Var.g;
                                    if (bx3Var7 != bx3Var16) {
                                        z2 = !f88.a(h48Var.f0, p07Var.i);
                                    } else {
                                        z2 = !f88.a(h48Var.f0, p07Var.i);
                                    }
                                    if (!f88.a(p07Var.i, h48Var.f0)) {
                                        kd8Var3.j(p07Var.i);
                                    }
                                    f09Var = p07Var.j;
                                    if (f09Var != null) {
                                        if (!f88.b(y68Var.c().f0)) {
                                            rh5Var.setValue(new r07(p07Var.h.a, f09Var));
                                        } else {
                                            rh5Var.setValue(new r07(f09Var, f09Var));
                                        }
                                    }
                                    break;
                                case 14:
                                    jD10 = jD10;
                                    bx3Var7 = bx3Var15;
                                    p07Var.f();
                                    z5 = true;
                                    h48Var = p07Var.g;
                                    if (bx3Var7 != bx3Var16) {
                                        z2 = !f88.a(h48Var.f0, p07Var.i);
                                    } else {
                                        z2 = !f88.a(h48Var.f0, p07Var.i);
                                    }
                                    if (!f88.a(p07Var.i, h48Var.f0)) {
                                        kd8Var3.j(p07Var.i);
                                    }
                                    f09Var = p07Var.j;
                                    if (f09Var != null) {
                                        if (!f88.b(y68Var.c().f0)) {
                                            rh5Var.setValue(new r07(p07Var.h.a, f09Var));
                                        } else {
                                            rh5Var.setValue(new r07(f09Var, f09Var));
                                        }
                                    }
                                    break;
                                case 15:
                                    jD10 = jD10;
                                    bx3Var7 = bx3Var15;
                                    p07Var.n();
                                    z5 = true;
                                    h48Var = p07Var.g;
                                    if (bx3Var7 != bx3Var16) {
                                        z2 = !f88.a(h48Var.f0, p07Var.i);
                                    } else {
                                        z2 = !f88.a(h48Var.f0, p07Var.i);
                                    }
                                    if (!f88.a(p07Var.i, h48Var.f0)) {
                                        kd8Var3.j(p07Var.i);
                                    }
                                    f09Var = p07Var.j;
                                    if (f09Var != null) {
                                        if (!f88.b(y68Var.c().f0)) {
                                            rh5Var.setValue(new r07(p07Var.h.a, f09Var));
                                        } else {
                                            rh5Var.setValue(new r07(f09Var, f09Var));
                                        }
                                    }
                                    break;
                                case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
                                    jD10 = jD10;
                                    bx3Var7 = bx3Var15;
                                    p07Var.m();
                                    z5 = true;
                                    h48Var = p07Var.g;
                                    if (bx3Var7 != bx3Var16) {
                                        z2 = !f88.a(h48Var.f0, p07Var.i);
                                    } else {
                                        z2 = !f88.a(h48Var.f0, p07Var.i);
                                    }
                                    if (!f88.a(p07Var.i, h48Var.f0)) {
                                        kd8Var3.j(p07Var.i);
                                    }
                                    f09Var = p07Var.j;
                                    if (f09Var != null) {
                                        if (!f88.b(y68Var.c().f0)) {
                                            rh5Var.setValue(new r07(p07Var.h.a, f09Var));
                                        } else {
                                            rh5Var.setValue(new r07(f09Var, f09Var));
                                        }
                                    }
                                    break;
                                case 17:
                                case 18:
                                case 19:
                                    jD10 = jD10;
                                    bx3Var7 = bx3Var15;
                                    this.I0.K(bx3Var7, Boolean.valueOf(qp7.g(keyEvent)));
                                    z5 = true;
                                    h48Var = p07Var.g;
                                    if (bx3Var7 != bx3Var16) {
                                        z2 = !f88.a(h48Var.f0, p07Var.i);
                                    } else {
                                        z2 = !f88.a(h48Var.f0, p07Var.i);
                                    }
                                    if (!f88.a(p07Var.i, h48Var.f0)) {
                                        kd8Var3.j(p07Var.i);
                                    }
                                    f09Var = p07Var.j;
                                    if (f09Var != null) {
                                        if (!f88.b(y68Var.c().f0)) {
                                            rh5Var.setValue(new r07(p07Var.h.a, f09Var));
                                        } else {
                                            rh5Var.setValue(new r07(f09Var, f09Var));
                                        }
                                    }
                                    break;
                                case 20:
                                    jD10 = jD10;
                                    bx3Var7 = bx3Var15;
                                    e68Var.a = Float.NaN;
                                    if (str.length() > 0) {
                                        long j4 = p07Var.i;
                                        int i5 = f88.c;
                                        int i6 = (int) (j4 & 4294967295L);
                                        int iOffsetByCodePoints = -1;
                                        if (i6 > 0) {
                                            yy1 yy1VarF = wl7.F();
                                            if (yy1VarF != null) {
                                                int iB = yy1VarF.b(str, i6 - 1);
                                                if (iB >= 0) {
                                                    iOffsetByCodePoints = iB;
                                                } else if (i6 > 0) {
                                                    iOffsetByCodePoints = Character.offsetByCodePoints(str, i6, -1);
                                                }
                                            } else if (i6 > 0) {
                                                iOffsetByCodePoints = Character.offsetByCodePoints(str, i6, -1);
                                            }
                                        }
                                        long jC = bt7.c(iOffsetByCodePoints, i6, kd8Var3);
                                        int i7 = (int) (jC >> 32);
                                        f09 f09VarD = nr4.D(jC);
                                        if (i7 != i6 || !f88.b(p07Var.i)) {
                                            p07Var.i = ct7.c(i7, i7);
                                        }
                                        if (f09VarD != null) {
                                            p07Var.j = f09VarD;
                                        }
                                    }
                                    p07Var.a();
                                    z5 = true;
                                    h48Var = p07Var.g;
                                    if (bx3Var7 != bx3Var16) {
                                        z2 = !f88.a(h48Var.f0, p07Var.i);
                                    } else {
                                        z2 = !f88.a(h48Var.f0, p07Var.i);
                                    }
                                    if (!f88.a(p07Var.i, h48Var.f0)) {
                                        kd8Var3.j(p07Var.i);
                                    }
                                    f09Var = p07Var.j;
                                    if (f09Var != null) {
                                        if (!f88.b(y68Var.c().f0)) {
                                            rh5Var.setValue(new r07(p07Var.h.a, f09Var));
                                        } else {
                                            rh5Var.setValue(new r07(f09Var, f09Var));
                                        }
                                    }
                                    break;
                                case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.mtuMin /* 21 */:
                                    jD10 = jD10;
                                    bx3Var7 = bx3Var15;
                                    p07Var.g();
                                    p07Var.a();
                                    z5 = true;
                                    h48Var = p07Var.g;
                                    if (bx3Var7 != bx3Var16) {
                                        z2 = !f88.a(h48Var.f0, p07Var.i);
                                    } else {
                                        z2 = !f88.a(h48Var.f0, p07Var.i);
                                    }
                                    if (!f88.a(p07Var.i, h48Var.f0)) {
                                        kd8Var3.j(p07Var.i);
                                    }
                                    f09Var = p07Var.j;
                                    if (f09Var != null) {
                                        if (!f88.b(y68Var.c().f0)) {
                                            rh5Var.setValue(new r07(p07Var.h.a, f09Var));
                                        } else {
                                            rh5Var.setValue(new r07(f09Var, f09Var));
                                        }
                                    }
                                    break;
                                case 22:
                                    jD10 = jD10;
                                    bx3Var7 = bx3Var15;
                                    p07Var.l();
                                    p07Var.a();
                                    z5 = true;
                                    h48Var = p07Var.g;
                                    if (bx3Var7 != bx3Var16) {
                                        z2 = !f88.a(h48Var.f0, p07Var.i);
                                    } else {
                                        z2 = !f88.a(h48Var.f0, p07Var.i);
                                    }
                                    if (!f88.a(p07Var.i, h48Var.f0)) {
                                        kd8Var3.j(p07Var.i);
                                    }
                                    f09Var = p07Var.j;
                                    if (f09Var != null) {
                                        if (!f88.b(y68Var.c().f0)) {
                                            rh5Var.setValue(new r07(p07Var.h.a, f09Var));
                                        } else {
                                            rh5Var.setValue(new r07(f09Var, f09Var));
                                        }
                                    }
                                    break;
                                case 23:
                                    jD10 = jD10;
                                    bx3Var7 = bx3Var15;
                                    p07Var.i();
                                    p07Var.a();
                                    z5 = true;
                                    h48Var = p07Var.g;
                                    if (bx3Var7 != bx3Var16) {
                                        z2 = !f88.a(h48Var.f0, p07Var.i);
                                    } else {
                                        z2 = !f88.a(h48Var.f0, p07Var.i);
                                    }
                                    if (!f88.a(p07Var.i, h48Var.f0)) {
                                        kd8Var3.j(p07Var.i);
                                    }
                                    f09Var = p07Var.j;
                                    if (f09Var != null) {
                                        if (!f88.b(y68Var.c().f0)) {
                                            rh5Var.setValue(new r07(p07Var.h.a, f09Var));
                                        } else {
                                            rh5Var.setValue(new r07(f09Var, f09Var));
                                        }
                                    }
                                    break;
                                case 24:
                                    jD10 = jD10;
                                    bx3Var7 = bx3Var15;
                                    p07Var.p();
                                    p07Var.a();
                                    z5 = true;
                                    h48Var = p07Var.g;
                                    if (bx3Var7 != bx3Var16) {
                                        z2 = !f88.a(h48Var.f0, p07Var.i);
                                    } else {
                                        z2 = !f88.a(h48Var.f0, p07Var.i);
                                    }
                                    if (!f88.a(p07Var.i, h48Var.f0)) {
                                        kd8Var3.j(p07Var.i);
                                    }
                                    f09Var = p07Var.j;
                                    if (f09Var != null) {
                                        if (!f88.b(y68Var.c().f0)) {
                                            rh5Var.setValue(new r07(p07Var.h.a, f09Var));
                                        } else {
                                            rh5Var.setValue(new r07(f09Var, f09Var));
                                        }
                                    }
                                    break;
                                case 25:
                                    jD10 = jD10;
                                    bx3Var7 = bx3Var15;
                                    p07Var.o();
                                    p07Var.a();
                                    z5 = true;
                                    h48Var = p07Var.g;
                                    if (bx3Var7 != bx3Var16) {
                                        z2 = !f88.a(h48Var.f0, p07Var.i);
                                    } else {
                                        z2 = !f88.a(h48Var.f0, p07Var.i);
                                    }
                                    if (!f88.a(p07Var.i, h48Var.f0)) {
                                        kd8Var3.j(p07Var.i);
                                    }
                                    f09Var = p07Var.j;
                                    if (f09Var != null) {
                                        if (!f88.b(y68Var.c().f0)) {
                                            rh5Var.setValue(new r07(p07Var.h.a, f09Var));
                                        } else {
                                            rh5Var.setValue(new r07(f09Var, f09Var));
                                        }
                                    }
                                    break;
                                case 26:
                                    jD10 = jD10;
                                    bx3Var7 = bx3Var15;
                                    e68Var.a = Float.NaN;
                                    if (str.length() > 0) {
                                        p07Var.i = ct7.c(0, str.length());
                                    }
                                    z5 = true;
                                    h48Var = p07Var.g;
                                    if (bx3Var7 != bx3Var16) {
                                        z2 = !f88.a(h48Var.f0, p07Var.i);
                                    } else {
                                        z2 = !f88.a(h48Var.f0, p07Var.i);
                                    }
                                    if (!f88.a(p07Var.i, h48Var.f0)) {
                                        kd8Var3.j(p07Var.i);
                                    }
                                    f09Var = p07Var.j;
                                    if (f09Var != null) {
                                        if (!f88.b(y68Var.c().f0)) {
                                            rh5Var.setValue(new r07(p07Var.h.a, f09Var));
                                        } else {
                                            rh5Var.setValue(new r07(f09Var, f09Var));
                                        }
                                    }
                                    break;
                                case 27:
                                    jD10 = jD10;
                                    bx3Var7 = bx3Var15;
                                    if (p07Var.b()) {
                                        p07Var.j();
                                    } else {
                                        p07Var.g();
                                    }
                                    p07Var.s();
                                    z5 = true;
                                    h48Var = p07Var.g;
                                    if (bx3Var7 != bx3Var16) {
                                        z2 = !f88.a(h48Var.f0, p07Var.i);
                                    } else {
                                        z2 = !f88.a(h48Var.f0, p07Var.i);
                                    }
                                    if (!f88.a(p07Var.i, h48Var.f0)) {
                                        kd8Var3.j(p07Var.i);
                                    }
                                    f09Var = p07Var.j;
                                    if (f09Var != null) {
                                        if (!f88.b(y68Var.c().f0)) {
                                            rh5Var.setValue(new r07(p07Var.h.a, f09Var));
                                        } else {
                                            rh5Var.setValue(new r07(f09Var, f09Var));
                                        }
                                    }
                                    break;
                                case _DnsMessageKt.TYPE_AAAA /* 28 */:
                                    jD10 = jD10;
                                    bx3Var7 = bx3Var15;
                                    if (p07Var.b()) {
                                        p07Var.g();
                                    } else {
                                        p07Var.j();
                                    }
                                    p07Var.s();
                                    z5 = true;
                                    h48Var = p07Var.g;
                                    if (bx3Var7 != bx3Var16) {
                                        z2 = !f88.a(h48Var.f0, p07Var.i);
                                    } else {
                                        z2 = !f88.a(h48Var.f0, p07Var.i);
                                    }
                                    if (!f88.a(p07Var.i, h48Var.f0)) {
                                        kd8Var3.j(p07Var.i);
                                    }
                                    f09Var = p07Var.j;
                                    if (f09Var != null) {
                                        if (!f88.b(y68Var.c().f0)) {
                                            rh5Var.setValue(new r07(p07Var.h.a, f09Var));
                                        } else {
                                            rh5Var.setValue(new r07(f09Var, f09Var));
                                        }
                                    }
                                    break;
                                case 29:
                                    jD10 = jD10;
                                    bx3Var7 = bx3Var15;
                                    p07Var.q();
                                    p07Var.s();
                                    z5 = true;
                                    h48Var = p07Var.g;
                                    if (bx3Var7 != bx3Var16) {
                                        z2 = !f88.a(h48Var.f0, p07Var.i);
                                    } else {
                                        z2 = !f88.a(h48Var.f0, p07Var.i);
                                    }
                                    if (!f88.a(p07Var.i, h48Var.f0)) {
                                        kd8Var3.j(p07Var.i);
                                    }
                                    f09Var = p07Var.j;
                                    if (f09Var != null) {
                                        if (!f88.b(y68Var.c().f0)) {
                                            rh5Var.setValue(new r07(p07Var.h.a, f09Var));
                                        } else {
                                            rh5Var.setValue(new r07(f09Var, f09Var));
                                        }
                                    }
                                    break;
                                case XRayConfig.OutboundBean.StreamSettingsBean.QuicParamsBean.DEFAULT_MAX_IDLE_TIMEOUT /* 30 */:
                                    jD10 = jD10;
                                    bx3Var7 = bx3Var15;
                                    p07Var.e();
                                    p07Var.s();
                                    z5 = true;
                                    h48Var = p07Var.g;
                                    if (bx3Var7 != bx3Var16) {
                                        z2 = !f88.a(h48Var.f0, p07Var.i);
                                    } else {
                                        z2 = !f88.a(h48Var.f0, p07Var.i);
                                    }
                                    if (!f88.a(p07Var.i, h48Var.f0)) {
                                        kd8Var3.j(p07Var.i);
                                    }
                                    f09Var = p07Var.j;
                                    if (f09Var != null) {
                                        if (!f88.b(y68Var.c().f0)) {
                                            rh5Var.setValue(new r07(p07Var.h.a, f09Var));
                                        } else {
                                            rh5Var.setValue(new r07(f09Var, f09Var));
                                        }
                                    }
                                    break;
                                case 31:
                                    jD10 = jD10;
                                    bx3Var7 = bx3Var15;
                                    p07Var.r();
                                    p07Var.s();
                                    z5 = true;
                                    h48Var = p07Var.g;
                                    if (bx3Var7 != bx3Var16) {
                                        z2 = !f88.a(h48Var.f0, p07Var.i);
                                    } else {
                                        z2 = !f88.a(h48Var.f0, p07Var.i);
                                    }
                                    if (!f88.a(p07Var.i, h48Var.f0)) {
                                        kd8Var3.j(p07Var.i);
                                    }
                                    f09Var = p07Var.j;
                                    if (f09Var != null) {
                                        if (!f88.b(y68Var.c().f0)) {
                                            rh5Var.setValue(new r07(p07Var.h.a, f09Var));
                                        } else {
                                            rh5Var.setValue(new r07(f09Var, f09Var));
                                        }
                                    }
                                    break;
                                case 32:
                                    jD10 = jD10;
                                    bx3Var7 = bx3Var15;
                                    p07Var.f();
                                    p07Var.s();
                                    z5 = true;
                                    h48Var = p07Var.g;
                                    if (bx3Var7 != bx3Var16) {
                                        z2 = !f88.a(h48Var.f0, p07Var.i);
                                    } else {
                                        z2 = !f88.a(h48Var.f0, p07Var.i);
                                    }
                                    if (!f88.a(p07Var.i, h48Var.f0)) {
                                        kd8Var3.j(p07Var.i);
                                    }
                                    f09Var = p07Var.j;
                                    if (f09Var != null) {
                                        if (!f88.b(y68Var.c().f0)) {
                                            rh5Var.setValue(new r07(p07Var.h.a, f09Var));
                                        } else {
                                            rh5Var.setValue(new r07(f09Var, f09Var));
                                        }
                                    }
                                    break;
                                case 33:
                                    jD10 = jD10;
                                    bx3Var7 = bx3Var15;
                                    p07Var.n();
                                    p07Var.s();
                                    z5 = true;
                                    h48Var = p07Var.g;
                                    if (bx3Var7 != bx3Var16) {
                                        z2 = !f88.a(h48Var.f0, p07Var.i);
                                    } else {
                                        z2 = !f88.a(h48Var.f0, p07Var.i);
                                    }
                                    if (!f88.a(p07Var.i, h48Var.f0)) {
                                        kd8Var3.j(p07Var.i);
                                    }
                                    f09Var = p07Var.j;
                                    if (f09Var != null) {
                                        if (!f88.b(y68Var.c().f0)) {
                                            rh5Var.setValue(new r07(p07Var.h.a, f09Var));
                                        } else {
                                            rh5Var.setValue(new r07(f09Var, f09Var));
                                        }
                                    }
                                    break;
                                case 34:
                                    jD10 = jD10;
                                    bx3Var7 = bx3Var15;
                                    p07Var.m();
                                    p07Var.s();
                                    z5 = true;
                                    h48Var = p07Var.g;
                                    if (bx3Var7 != bx3Var16) {
                                        z2 = !f88.a(h48Var.f0, p07Var.i);
                                    } else {
                                        z2 = !f88.a(h48Var.f0, p07Var.i);
                                    }
                                    if (!f88.a(p07Var.i, h48Var.f0)) {
                                        kd8Var3.j(p07Var.i);
                                    }
                                    f09Var = p07Var.j;
                                    if (f09Var != null) {
                                        if (!f88.b(y68Var.c().f0)) {
                                            rh5Var.setValue(new r07(p07Var.h.a, f09Var));
                                        } else {
                                            rh5Var.setValue(new r07(f09Var, f09Var));
                                        }
                                    }
                                    break;
                                case 35:
                                    jD10 = jD10;
                                    bx3Var7 = bx3Var15;
                                    if (p07Var.b()) {
                                        p07Var.l();
                                    } else {
                                        p07Var.i();
                                    }
                                    p07Var.s();
                                    z5 = true;
                                    h48Var = p07Var.g;
                                    if (bx3Var7 != bx3Var16) {
                                        z2 = !f88.a(h48Var.f0, p07Var.i);
                                    } else {
                                        z2 = !f88.a(h48Var.f0, p07Var.i);
                                    }
                                    if (!f88.a(p07Var.i, h48Var.f0)) {
                                        kd8Var3.j(p07Var.i);
                                    }
                                    f09Var = p07Var.j;
                                    if (f09Var != null) {
                                        if (!f88.b(y68Var.c().f0)) {
                                            rh5Var.setValue(new r07(p07Var.h.a, f09Var));
                                        } else {
                                            rh5Var.setValue(new r07(f09Var, f09Var));
                                        }
                                    }
                                    break;
                                case 36:
                                    jD10 = jD10;
                                    bx3Var7 = bx3Var15;
                                    if (p07Var.b()) {
                                        p07Var.i();
                                    } else {
                                        p07Var.l();
                                    }
                                    p07Var.s();
                                    z5 = true;
                                    h48Var = p07Var.g;
                                    if (bx3Var7 != bx3Var16) {
                                        z2 = !f88.a(h48Var.f0, p07Var.i);
                                    } else {
                                        z2 = !f88.a(h48Var.f0, p07Var.i);
                                    }
                                    if (!f88.a(p07Var.i, h48Var.f0)) {
                                        kd8Var3.j(p07Var.i);
                                    }
                                    f09Var = p07Var.j;
                                    if (f09Var != null) {
                                        if (!f88.b(y68Var.c().f0)) {
                                            rh5Var.setValue(new r07(p07Var.h.a, f09Var));
                                        } else {
                                            rh5Var.setValue(new r07(f09Var, f09Var));
                                        }
                                    }
                                    break;
                                case 37:
                                    jD10 = jD10;
                                    bx3Var7 = bx3Var15;
                                    p07Var.h();
                                    p07Var.s();
                                    z5 = true;
                                    h48Var = p07Var.g;
                                    if (bx3Var7 != bx3Var16) {
                                        z2 = !f88.a(h48Var.f0, p07Var.i);
                                    } else {
                                        z2 = !f88.a(h48Var.f0, p07Var.i);
                                    }
                                    if (!f88.a(p07Var.i, h48Var.f0)) {
                                        kd8Var3.j(p07Var.i);
                                    }
                                    f09Var = p07Var.j;
                                    if (f09Var != null) {
                                        if (!f88.b(y68Var.c().f0)) {
                                            rh5Var.setValue(new r07(p07Var.h.a, f09Var));
                                        } else {
                                            rh5Var.setValue(new r07(f09Var, f09Var));
                                        }
                                    }
                                    break;
                                case 38:
                                    jD10 = jD10;
                                    bx3Var7 = bx3Var15;
                                    p07Var.k();
                                    p07Var.s();
                                    z5 = true;
                                    h48Var = p07Var.g;
                                    if (bx3Var7 != bx3Var16) {
                                        z2 = !f88.a(h48Var.f0, p07Var.i);
                                    } else {
                                        z2 = !f88.a(h48Var.f0, p07Var.i);
                                    }
                                    if (!f88.a(p07Var.i, h48Var.f0)) {
                                        kd8Var3.j(p07Var.i);
                                    }
                                    f09Var = p07Var.j;
                                    if (f09Var != null) {
                                        if (!f88.b(y68Var.c().f0)) {
                                            rh5Var.setValue(new r07(p07Var.h.a, f09Var));
                                        } else {
                                            rh5Var.setValue(new r07(f09Var, f09Var));
                                        }
                                    }
                                    break;
                                case 39:
                                    jD10 = jD10;
                                    bx3Var7 = bx3Var15;
                                    p07Var.p();
                                    p07Var.s();
                                    z5 = true;
                                    h48Var = p07Var.g;
                                    if (bx3Var7 != bx3Var16) {
                                        z2 = !f88.a(h48Var.f0, p07Var.i);
                                    } else {
                                        z2 = !f88.a(h48Var.f0, p07Var.i);
                                    }
                                    if (!f88.a(p07Var.i, h48Var.f0)) {
                                        kd8Var3.j(p07Var.i);
                                    }
                                    f09Var = p07Var.j;
                                    if (f09Var != null) {
                                        if (!f88.b(y68Var.c().f0)) {
                                            rh5Var.setValue(new r07(p07Var.h.a, f09Var));
                                        } else {
                                            rh5Var.setValue(new r07(f09Var, f09Var));
                                        }
                                    }
                                    break;
                                case 40:
                                    jD10 = jD10;
                                    bx3Var7 = bx3Var15;
                                    p07Var.o();
                                    p07Var.s();
                                    z5 = true;
                                    h48Var = p07Var.g;
                                    if (bx3Var7 != bx3Var16) {
                                        z2 = !f88.a(h48Var.f0, p07Var.i);
                                    } else {
                                        z2 = !f88.a(h48Var.f0, p07Var.i);
                                    }
                                    if (!f88.a(p07Var.i, h48Var.f0)) {
                                        kd8Var3.j(p07Var.i);
                                    }
                                    f09Var = p07Var.j;
                                    if (f09Var != null) {
                                        if (!f88.b(y68Var.c().f0)) {
                                            rh5Var.setValue(new r07(p07Var.h.a, f09Var));
                                        } else {
                                            rh5Var.setValue(new r07(f09Var, f09Var));
                                        }
                                    }
                                    break;
                                case 41:
                                    jD10 = jD10;
                                    bx3Var7 = bx3Var15;
                                    if (p07Var.b()) {
                                        p07Var.p();
                                    } else {
                                        p07Var.o();
                                    }
                                    p07Var.s();
                                    z5 = true;
                                    h48Var = p07Var.g;
                                    if (bx3Var7 != bx3Var16) {
                                        z2 = !f88.a(h48Var.f0, p07Var.i);
                                    } else {
                                        z2 = !f88.a(h48Var.f0, p07Var.i);
                                    }
                                    if (!f88.a(p07Var.i, h48Var.f0)) {
                                        kd8Var3.j(p07Var.i);
                                    }
                                    f09Var = p07Var.j;
                                    if (f09Var != null) {
                                        if (!f88.b(y68Var.c().f0)) {
                                            rh5Var.setValue(new r07(p07Var.h.a, f09Var));
                                        } else {
                                            rh5Var.setValue(new r07(f09Var, f09Var));
                                        }
                                    }
                                    break;
                                case 42:
                                    jD10 = jD10;
                                    bx3Var7 = bx3Var15;
                                    if (p07Var.b()) {
                                        p07Var.o();
                                    } else {
                                        p07Var.p();
                                    }
                                    p07Var.s();
                                    z5 = true;
                                    h48Var = p07Var.g;
                                    if (bx3Var7 != bx3Var16) {
                                        z2 = !f88.a(h48Var.f0, p07Var.i);
                                    } else {
                                        z2 = !f88.a(h48Var.f0, p07Var.i);
                                    }
                                    if (!f88.a(p07Var.i, h48Var.f0)) {
                                        kd8Var3.j(p07Var.i);
                                    }
                                    f09Var = p07Var.j;
                                    if (f09Var != null) {
                                        if (!f88.b(y68Var.c().f0)) {
                                            rh5Var.setValue(new r07(p07Var.h.a, f09Var));
                                        } else {
                                            rh5Var.setValue(new r07(f09Var, f09Var));
                                        }
                                    }
                                    break;
                                case 43:
                                    jD10 = jD10;
                                    bx3Var7 = bx3Var15;
                                    e68Var.a = Float.NaN;
                                    if (str.length() > 0) {
                                        long j5 = p07Var.i;
                                        int i8 = f88.c;
                                        int i9 = (int) (j5 & 4294967295L);
                                        p07Var.i = ct7.c(i9, i9);
                                    }
                                    z5 = true;
                                    h48Var = p07Var.g;
                                    if (bx3Var7 != bx3Var16) {
                                        z2 = !f88.a(h48Var.f0, p07Var.i);
                                    } else {
                                        z2 = !f88.a(h48Var.f0, p07Var.i);
                                    }
                                    if (!f88.a(p07Var.i, h48Var.f0)) {
                                        kd8Var3.j(p07Var.i);
                                    }
                                    f09Var = p07Var.j;
                                    if (f09Var != null) {
                                        if (!f88.b(y68Var.c().f0)) {
                                            rh5Var.setValue(new r07(p07Var.h.a, f09Var));
                                        } else {
                                            rh5Var.setValue(new r07(f09Var, f09Var));
                                        }
                                    }
                                    break;
                                case 44:
                                    jD10 = jD10;
                                    bx3Var7 = bx3Var15;
                                    if (z4) {
                                        zB1 = b1(this.x0.a());
                                    } else {
                                        kd8.h(kd8Var3, "\n", !qp7.h(keyEvent), qp7.g(keyEvent), 4);
                                        zB1 = true;
                                    }
                                    z5 = zB1;
                                    h48Var = p07Var.g;
                                    if (bx3Var7 != bx3Var16) {
                                        z2 = !f88.a(h48Var.f0, p07Var.i);
                                    } else {
                                        z2 = !f88.a(h48Var.f0, p07Var.i);
                                    }
                                    if (!f88.a(p07Var.i, h48Var.f0)) {
                                        kd8Var3.j(p07Var.i);
                                    }
                                    f09Var = p07Var.j;
                                    if (f09Var != null) {
                                        if (!f88.b(y68Var.c().f0)) {
                                            rh5Var.setValue(new r07(p07Var.h.a, f09Var));
                                        } else {
                                            rh5Var.setValue(new r07(f09Var, f09Var));
                                        }
                                    }
                                    break;
                                case 45:
                                    jD10 = jD10;
                                    bx3Var7 = bx3Var15;
                                    if (!z4) {
                                        kd8.h(kd8Var3, "\t", !qp7.h(keyEvent), qp7.g(keyEvent), 4);
                                        z5 = true;
                                    }
                                    h48Var = p07Var.g;
                                    if (bx3Var7 != bx3Var16) {
                                        z2 = !f88.a(h48Var.f0, p07Var.i);
                                    } else {
                                        z2 = !f88.a(h48Var.f0, p07Var.i);
                                    }
                                    if (!f88.a(p07Var.i, h48Var.f0)) {
                                        kd8Var3.j(p07Var.i);
                                    }
                                    f09Var = p07Var.j;
                                    if (f09Var != null) {
                                        if (!f88.b(y68Var.c().f0)) {
                                            rh5Var.setValue(new r07(p07Var.h.a, f09Var));
                                        } else {
                                            rh5Var.setValue(new r07(f09Var, f09Var));
                                        }
                                    }
                                    break;
                                case 46:
                                    jD10 = jD10;
                                    bx3Var7 = bx3Var15;
                                    y68 y68Var2 = (y68) y68Var.g.Y;
                                    xd6 xd6Var = y68Var2.a;
                                    bm8 bm8Var = (bm8) xd6Var.Y;
                                    vd7 vd7Var = bm8Var.b;
                                    if (!vd7Var.isEmpty() || ((u88) ((rh5) xd6Var.Z).getValue()) != null) {
                                        xd6Var.n();
                                        if (vd7Var.isEmpty()) {
                                            zc3.c("It's an error to call undo while there is nothing to undo. Please first check `canUndo` value before calling the `undo` function.");
                                        }
                                        Object objJ0 = bw0.j0(vd7Var);
                                        bm8Var.c.add(objJ0);
                                        u88 u88Var = (u88) objJ0;
                                        y68Var2.b.a().A();
                                        g48 g48Var = y68Var2.b;
                                        int i10 = u88Var.a;
                                        g48Var.c(i10, u88Var.c.length() + i10, u88Var.b);
                                        long j6 = u88Var.d;
                                        mn7.g(g48Var, (int) (j6 >> 32), (int) (j6 & 4294967295L));
                                        y68Var2.h(y68Var2.c(), g48.h(y68Var2.b, 0L, null, 15), true);
                                    }
                                    z5 = true;
                                    h48Var = p07Var.g;
                                    if (bx3Var7 != bx3Var16) {
                                        z2 = !f88.a(h48Var.f0, p07Var.i);
                                    } else {
                                        z2 = !f88.a(h48Var.f0, p07Var.i);
                                    }
                                    if (!f88.a(p07Var.i, h48Var.f0)) {
                                        kd8Var3.j(p07Var.i);
                                    }
                                    f09Var = p07Var.j;
                                    if (f09Var != null) {
                                        if (!f88.b(y68Var.c().f0)) {
                                            rh5Var.setValue(new r07(p07Var.h.a, f09Var));
                                        } else {
                                            rh5Var.setValue(new r07(f09Var, f09Var));
                                        }
                                    }
                                    break;
                                case ConscryptStatsLog.TLS_HANDSHAKE_REPORTED__CIPHER_SUITE__TLS_RSA_WITH_AES_128_CBC_SHA /* 47 */:
                                    y68 y68Var3 = (y68) y68Var.g.Y;
                                    xd6 xd6Var2 = y68Var3.a;
                                    bm8 bm8Var2 = (bm8) xd6Var2.Y;
                                    vd7 vd7Var2 = bm8Var2.c;
                                    if (!vd7Var2.isEmpty() && ((u88) ((rh5) xd6Var2.Z).getValue()) == null) {
                                        if (vd7Var2.isEmpty()) {
                                            zc3.c("It's an error to call redo while there is nothing to redo. Please first check `canRedo` value before calling the `redo` function.");
                                        }
                                        Object objJ1 = bw0.j0(vd7Var2);
                                        bm8Var2.b.add(objJ1);
                                        u88 u88Var2 = (u88) objJ1;
                                        y68Var3.b.a().A();
                                        g48 g48Var2 = y68Var3.b;
                                        int i11 = u88Var2.a;
                                        g48Var2.c(i11, u88Var2.b.length() + i11, u88Var2.c);
                                        long j7 = u88Var2.e;
                                        mn7.g(g48Var2, (int) (j7 >> 32), (int) (j7 & 4294967295L));
                                        y68Var3.h(y68Var3.c(), g48.h(y68Var3.b, 0L, null, 15), true);
                                    }
                                    bx3Var7 = bx3Var15;
                                    z5 = true;
                                    h48Var = p07Var.g;
                                    if (bx3Var7 != bx3Var16) {
                                        z2 = !f88.a(h48Var.f0, p07Var.i);
                                    } else {
                                        z2 = !f88.a(h48Var.f0, p07Var.i);
                                    }
                                    if (!f88.a(p07Var.i, h48Var.f0)) {
                                        kd8Var3.j(p07Var.i);
                                    }
                                    f09Var = p07Var.j;
                                    if (f09Var != null) {
                                        if (!f88.b(y68Var.c().f0)) {
                                            rh5Var.setValue(new r07(p07Var.h.a, f09Var));
                                        } else {
                                            rh5Var.setValue(new r07(f09Var, f09Var));
                                        }
                                    }
                                    break;
                                case 48:
                                    bx3Var7 = bx3Var15;
                                    z5 = true;
                                    h48Var = p07Var.g;
                                    if (bx3Var7 != bx3Var16) {
                                        z2 = !f88.a(h48Var.f0, p07Var.i);
                                    } else {
                                        z2 = !f88.a(h48Var.f0, p07Var.i);
                                    }
                                    if (!f88.a(p07Var.i, h48Var.f0)) {
                                        kd8Var3.j(p07Var.i);
                                    }
                                    f09Var = p07Var.j;
                                    if (f09Var != null) {
                                        if (!f88.b(y68Var.c().f0)) {
                                            rh5Var.setValue(new r07(p07Var.h.a, f09Var));
                                        } else {
                                            rh5Var.setValue(new r07(f09Var, f09Var));
                                        }
                                    }
                                    break;
                                default:
                                    b61.c();
                                    return false;
                            }
                        }
                    } else {
                        y78Var = y78Var2;
                        kd8Var = kd8Var2;
                        z = z3;
                        bx3Var5 = bx3Var3;
                        bx3Var4 = bx3Var4;
                        e68Var = e68Var;
                    }
                    bx3Var6 = bx3Var;
                    if (bx3Var6 != null) {
                        jD10 = jD10;
                        z2 = false;
                    } else {
                        jD10 = jD10;
                        z2 = false;
                    }
                }
            } else {
                iZ = w79.z(keyEvent2);
                int i12 = z39.n0;
                if (iZ == 9) {
                    jD9 = pu.d(keyEvent2.getKeyCode());
                    if (ax3.a(jD9, ax3.f)) {
                        bx3Var = bx3.S0;
                    } else if (ax3.a(jD9, ax3.g)) {
                        bx3Var = bx3.T0;
                    } else if (ax3.a(jD9, ax3.d)) {
                        bx3Var = bx3.K0;
                    } else if (ax3.a(jD9, ax3.e)) {
                        bx3Var = bx3.L0;
                    } else {
                        bx3Var = null;
                    }
                } else if (iZ == 1) {
                    jD = pu.d(keyEvent.getKeyCode());
                    if (ax3.a(jD, ax3.f)) {
                        bx3Var = bx3.l0;
                    } else if (ax3.a(jD, ax3.g)) {
                        bx3Var = bx3.m0;
                    } else if (ax3.a(jD, ax3.d)) {
                        bx3Var = bx3.s0;
                    } else if (ax3.a(jD, ax3.e)) {
                        bx3Var = bx3.t0;
                    } else if (ax3.a(jD, ax3.s)) {
                        bx3Var = bx3.B0;
                    } else {
                        bx3Var = null;
                    }
                } else {
                    bx3Var = null;
                }
                bx3Var2 = bx3.Y;
                bx3 bx3Var18 = bx3.Z;
                bx3Var3 = bx3.n0;
                bx3Var4 = bx3.o0;
                if (bx3Var == null) {
                    int i13 = z39.o0;
                    iZ2 = w79.z(keyEvent);
                    y78Var = y78Var2;
                    kd8Var = kd8Var2;
                    jD2 = pu.d(keyEvent.getKeyCode());
                    z = z3;
                    bx3Var5 = bx3Var3;
                    long j8 = ax3.s;
                    zA = ax3.a(jD2, j8);
                    bx3Var8 = bx3.V0;
                    bx3Var9 = bx3.x0;
                    if (zA) {
                        if (iZ2 == 0) {
                            bx3Var10 = bx3Var9;
                        } else {
                            int i14 = z39.p0;
                            if (iZ2 == 12) {
                                bx3Var10 = bx3Var9;
                            } else {
                                if (iZ2 != 2) {
                                    i = 10;
                                    if (iZ2 != 10) {
                                        bx3Var4 = bx3Var4;
                                        e68Var = e68Var;
                                        bx3Var10 = null;
                                    }
                                }
                                bx3Var10 = bx3.z0;
                            }
                        }
                        i = 10;
                    } else {
                        bx3Var4 = bx3Var4;
                        e68Var = e68Var;
                        if (ax3.a(jD2, ax3.r)) {
                            if (iZ2 != 0) {
                                i = 10;
                            } else {
                                i = 10;
                                if (iZ2 == 10) {
                                    bx3Var10 = null;
                                }
                            }
                            bx3Var10 = bx3Var8;
                        } else {
                            if (iZ2 != 0) {
                                i = 10;
                            } else {
                                i = 10;
                                if (iZ2 == 10) {
                                    bx3Var10 = null;
                                }
                            }
                            bx3Var10 = bx3Var8;
                        }
                    }
                    if (bx3Var10 != null) {
                        bx3Var6 = bx3Var10;
                    } else {
                        iZ3 = w79.z(keyEvent);
                        bx3Var = bx3.Q0;
                        bx3Var11 = bx3.R0;
                        if (iZ3 == i) {
                            jD8 = pu.d(keyEvent.getKeyCode());
                            bx3Var12 = bx3Var11;
                            if (ax3.a(jD8, ax3.f)) {
                                bx3Var13 = bx3.M0;
                            } else {
                                bx3Var13 = bx3.M0;
                            }
                        } else {
                            bx3Var12 = bx3Var11;
                            if (iZ3 == 2) {
                                jD4 = pu.d(keyEvent.getKeyCode());
                                if (ax3.a(jD4, ax3.f)) {
                                    bx3Var13 = bx3.g0;
                                } else {
                                    bx3Var13 = bx3.g0;
                                }
                            } else if (iZ3 == 8) {
                                jD3 = pu.d(keyEvent.getKeyCode());
                                if (ax3.a(jD3, ax3.v)) {
                                    bx3Var13 = bx3Var;
                                } else {
                                    bx3Var13 = bx3Var;
                                }
                            } else if (iZ3 == 1) {
                                bx3Var13 = null;
                            } else {
                                bx3Var13 = null;
                            }
                        }
                        if (bx3Var13 == null) {
                            iZ4 = w79.z(keyEvent);
                            if (iZ4 == 10) {
                                if (ax3.a(pu.d(keyEvent.getKeyCode()), ax3.o)) {
                                    bx3Var6 = bx3.Y0;
                                } else {
                                    bx3Var6 = null;
                                }
                            } else if (iZ4 == 2) {
                                jD7 = pu.d(keyEvent.getKeyCode());
                                if (ax3.a(jD7, ax3.j)) {
                                    bx3Var6 = bx3.u0;
                                } else {
                                    bx3Var6 = bx3.u0;
                                }
                            } else if (iZ4 == 8) {
                                jD6 = pu.d(keyEvent.getKeyCode());
                                if (ax3.a(jD6, ax3.f)) {
                                    bx3Var6 = bx3.E0;
                                } else {
                                    bx3Var6 = bx3.E0;
                                }
                            } else if (iZ4 == 0) {
                                jD5 = pu.d(keyEvent.getKeyCode());
                                if (ax3.a(jD5, ax3.f)) {
                                    bx3Var6 = bx3Var2;
                                } else {
                                    bx3Var6 = bx3Var2;
                                }
                            } else {
                                bx3Var6 = null;
                            }
                        } else {
                            bx3Var6 = bx3Var13;
                        }
                    }
                    if (bx3Var6 != null) {
                        jD10 = jD10;
                        z2 = false;
                    } else {
                        jD10 = jD10;
                        z2 = false;
                    }
                } else {
                    y78Var = y78Var2;
                    kd8Var = kd8Var2;
                    z = z3;
                    bx3Var5 = bx3Var3;
                    bx3Var4 = bx3Var4;
                    e68Var = e68Var;
                }
                bx3Var6 = bx3Var;
                if (bx3Var6 != null) {
                    jD10 = jD10;
                    z2 = false;
                } else {
                    jD10 = jD10;
                    z2 = false;
                }
            }
            if (z2) {
                b05 b05Var3 = (b05) lrVar.f0;
                if (b05Var3 == null) {
                    b05Var3 = new b05(3);
                    lrVar.f0 = b05Var3;
                }
                b05Var3.d(jD10);
            }
            return z2;
        }
        return false;
    }

    @Override // defpackage.kq5
    public final void I() {
        this.C0.I();
    }

    @Override // defpackage.w07
    public final boolean I0() {
        return true;
    }

    @Override // defpackage.jx4
    public final void Q0() {
        ch3.N(this, new s48(this, (byte) 1));
        this.u0.m = this.K0;
        if (this.w0) {
            Y0(this.B0);
        }
    }

    @Override // defpackage.jx4
    public final void R0() {
        c1();
        this.u0.m = null;
    }

    @Override // defpackage.w24, defpackage.as4
    public final void a(long j) {
        this.E0.t0 = j;
    }

    public final boolean b1(int i) {
        if (i == 6) {
            ((gh2) ((eh2) hi5.W(this, y01.i))).g(1, true);
            return true;
        }
        if (i == 5) {
            ((gh2) ((eh2) hi5.W(this, y01.i))).g(2, true);
            return true;
        }
        if (i != 7) {
            return false;
        }
        q78 q78Var = ((ai1) f1()).a.a;
        q78Var.getClass();
        q78Var.a(p78.f0);
        return true;
    }

    public final void c1() {
        og7 og7Var = this.J0;
        if (og7Var != null) {
            og7Var.m(null);
        }
        this.J0 = null;
        w05 w05Var = this.A0;
        if (w05Var != null) {
            w05Var.e();
        }
    }

    public final void d1() {
        qt1 qt1Var = this.D0;
        if (qt1Var != null) {
            this.z0.b(new rt1(qt1Var));
            this.D0 = null;
        }
    }

    @Override // defpackage.as2
    public final void e0(i55 i55Var) {
        this.t0.e.setValue(i55Var);
        if (this.w0) {
            this.B0.e0(i55Var);
        }
    }

    public final boolean e1() {
        t09 t09Var;
        return this.B0.x0.d1().b() && (t09Var = this.F0) != null && ((Boolean) ((y74) t09Var).c.getValue()).booleanValue();
    }

    public final be7 f1() {
        be7 be7Var = (be7) hi5.W(this, y01.q);
        if (be7Var != null) {
            return be7Var;
        }
        bt.i("No software keyboard controller");
        return null;
    }

    public final void g1(boolean z) {
        if (!z) {
            Boolean bool = this.x0.e;
            if (!(bool != null ? bool.booleanValue() : true)) {
                return;
            }
        }
        pu.w(this);
        this.J0 = w51.G(M0(), null, e71.f0, new v48(this, null, (byte) 5), 1);
    }

    @Override // defpackage.w07
    public final void h(f17 f17Var) {
        h48 h48VarC = this.s0.a.c();
        long j = h48VarC.f0;
        ql qlVar = new ql(this.s0.a.c().Z.toString());
        nw3[] nw3VarArr = d17.a;
        e17 e17Var = c17.F;
        nw3[] nw3VarArr2 = d17.a;
        nw3 nw3Var = nw3VarArr2[18];
        e17Var.getClass();
        f17Var.a(e17Var, qlVar);
        ql qlVar2 = new ql(h48VarC.Z.toString());
        e17 e17Var2 = c17.G;
        nw3 nw3Var2 = nw3VarArr2[19];
        e17Var2.getClass();
        f17Var.a(e17Var2, qlVar2);
        e17 e17Var3 = c17.H;
        nw3 nw3Var3 = nw3VarArr2[20];
        f88 f88Var = new f88(j);
        e17Var3.getClass();
        f17Var.a(e17Var3, f88Var);
        f88 f88Var2 = this.s0.a.c().g0;
        e17 e17Var4 = c17.I;
        nw3 nw3Var4 = nw3VarArr2[21];
        e17Var4.getClass();
        f17Var.a(e17Var4, f88Var2);
        ce3 ce3Var = new ce3(((Boolean) this.s0.a.e.getValue()).booleanValue(), ((Boolean) this.s0.a.f.getValue()).booleanValue());
        e17 e17Var5 = c17.M;
        nw3 nw3Var5 = nw3VarArr2[27];
        e17Var5.getClass();
        f17Var.a(e17Var5, ce3Var);
        if (!this.w0) {
            f17Var.a(c17.j, dn8.a);
        }
        final boolean z = this.w0;
        e17 e17Var6 = c17.Q;
        nw3 nw3Var6 = nw3VarArr2[28];
        Boolean boolValueOf = Boolean.valueOf(z);
        e17Var6.getClass();
        f17Var.a(e17Var6, boolValueOf);
        wc wcVar = oy1.n0;
        e17 e17Var7 = c17.s;
        byte b = 9;
        nw3 nw3Var7 = nw3VarArr2[9];
        e17Var7.getClass();
        f17Var.a(e17Var7, wcVar);
        yd ydVarM = ue3.m(h48VarC);
        byte b2 = 10;
        if (ydVarM != null) {
            e17 e17Var8 = c17.t;
            nw3 nw3Var8 = nw3VarArr2[10];
            e17Var8.getClass();
            f17Var.a(e17Var8, ydVarM);
        }
        final byte b3 = 0;
        f17Var.a(s07.h, new q3(null, new gn2() { // from class: r48
            @Override // defpackage.gn2
            public final Object B(Object obj) {
                byte b4 = b3;
                boolean z2 = true;
                y48 y48Var = this;
                boolean z3 = z;
                switch (b4) {
                    case 0:
                        ga2 ga2Var = (ga2) obj;
                        if (z3) {
                            CharSequence charSequenceB = ((yd) ga2Var).b();
                            if (charSequenceB != null) {
                                y48Var.s0.g(charSequenceB);
                            }
                            y48Var.L0.setValue(Boolean.TRUE);
                            w51.G(y48Var.M0(), null, null, new v48(y48Var, null, (byte) 3), 3);
                        } else {
                            z2 = false;
                        }
                        return Boolean.valueOf(z2);
                    case 1:
                        ql qlVar3 = (ql) obj;
                        if (z3) {
                            y48Var.s0.g(qlVar3);
                        } else {
                            z2 = false;
                        }
                        return Boolean.valueOf(z2);
                    default:
                        ql qlVar4 = (ql) obj;
                        if (z3) {
                            kd8.h(y48Var.s0, qlVar4, false, false, 28);
                        } else {
                            z2 = false;
                        }
                        return Boolean.valueOf(z2);
                }
            }
        }));
        int i = this.x0.c;
        byte b4 = 8;
        byte b5 = 6;
        if (i == 6) {
            c51.a.getClass();
            d17.c(f17Var, b51.c);
        } else if (i == 7 || i == 8) {
            c51.a.getClass();
            d17.c(f17Var, b51.b);
        } else if (i == 4) {
            c51.a.getClass();
            d17.c(f17Var, b51.d);
        }
        d17.a(f17Var, new t48(this, b5));
        final byte b6 = 1;
        if (z) {
            f17Var.a(s07.k, new q3(null, new gn2() { // from class: r48
                @Override // defpackage.gn2
                public final Object B(Object obj) {
                    byte b7 = b6;
                    boolean z2 = true;
                    y48 y48Var = this;
                    boolean z3 = z;
                    switch (b7) {
                        case 0:
                            ga2 ga2Var = (ga2) obj;
                            if (z3) {
                                CharSequence charSequenceB = ((yd) ga2Var).b();
                                if (charSequenceB != null) {
                                    y48Var.s0.g(charSequenceB);
                                }
                                y48Var.L0.setValue(Boolean.TRUE);
                                w51.G(y48Var.M0(), null, null, new v48(y48Var, null, (byte) 3), 3);
                            } else {
                                z2 = false;
                            }
                            return Boolean.valueOf(z2);
                        case 1:
                            ql qlVar3 = (ql) obj;
                            if (z3) {
                                y48Var.s0.g(qlVar3);
                            } else {
                                z2 = false;
                            }
                            return Boolean.valueOf(z2);
                        default:
                            ql qlVar4 = (ql) obj;
                            if (z3) {
                                kd8.h(y48Var.s0, qlVar4, false, false, 28);
                            } else {
                                z2 = false;
                            }
                            return Boolean.valueOf(z2);
                    }
                }
            }));
            final byte b7 = 2;
            f17Var.a(s07.o, new q3(null, new gn2() { // from class: r48
                @Override // defpackage.gn2
                public final Object B(Object obj) {
                    byte b8 = b7;
                    boolean z2 = true;
                    y48 y48Var = this;
                    boolean z3 = z;
                    switch (b8) {
                        case 0:
                            ga2 ga2Var = (ga2) obj;
                            if (z3) {
                                CharSequence charSequenceB = ((yd) ga2Var).b();
                                if (charSequenceB != null) {
                                    y48Var.s0.g(charSequenceB);
                                }
                                y48Var.L0.setValue(Boolean.TRUE);
                                w51.G(y48Var.M0(), null, null, new v48(y48Var, null, (byte) 3), 3);
                            } else {
                                z2 = false;
                            }
                            return Boolean.valueOf(z2);
                        case 1:
                            ql qlVar3 = (ql) obj;
                            if (z3) {
                                y48Var.s0.g(qlVar3);
                            } else {
                                z2 = false;
                            }
                            return Boolean.valueOf(z2);
                        default:
                            ql qlVar4 = (ql) obj;
                            if (z3) {
                                kd8.h(y48Var.s0, qlVar4, false, false, 28);
                            } else {
                                z2 = false;
                            }
                            return Boolean.valueOf(z2);
                    }
                }
            }));
        }
        f17Var.a(s07.j, new q3(null, new m30(this, (byte) 10)));
        int iA = this.x0.a();
        c07 c07Var = new c07(this, iA, (byte) 1);
        f17Var.a(c17.J, new l73(iA));
        f17Var.a(s07.p, new q3(null, c07Var));
        f17Var.a(s07.b, new q3(null, new s48(this, b4)));
        f17Var.a(s07.c, new q3(null, new s48(this, b)));
        if (!f88.b(j)) {
            f17Var.a(s07.q, new q3(null, new s48(this, b2)));
            if (this.w0) {
                f17Var.a(s07.r, new q3(null, new s48(this, b3)));
            }
        }
        if (z) {
            f17Var.a(s07.s, new q3(null, new s48(this, b5)));
        }
        de3 de3Var = this.v0;
        if (de3Var != null) {
            de3Var.h(f17Var);
        }
        if (this.w0) {
            this.B0.h(f17Var);
        }
    }

    @Override // defpackage.gx3
    public final boolean l(KeyEvent keyEvent) {
        kd8 kd8Var = this.s0;
        r68 r68Var = this.u0;
        f1();
        this.H0.getClass();
        if (f88.b(kd8Var.d().f0) || keyEvent.getKeyCode() != 4 || w39.S(keyEvent) != 1) {
            return false;
        }
        kd8 kd8Var2 = r68Var.a;
        if (!f88.b(kd8Var2.d().f0)) {
            y68 y68Var = kd8Var2.a;
            de3 de3Var = kd8Var2.b;
            y68Var.b.a().A();
            g48 g48Var = y68Var.b;
            int i = (int) (g48Var.i0 & 4294967295L);
            mn7.g(g48Var, i, i);
            y68Var.b(de3Var, true, e58.X);
            y68Var.f(true);
            y68Var.e(y68Var.b.g0);
        }
        r68Var.x(false);
        r68Var.y(s88.X);
        return true;
    }

    @Override // defpackage.w24
    public final void n(y24 y24Var) {
        this.E0.getClass();
    }

    @Override // defpackage.w85
    public final void q0() {
        ch3.N(this, new s48(this, (byte) 1));
    }

    @Override // defpackage.rv1
    public final void u0(p34 p34Var) {
        p34Var.a();
        if (((Boolean) this.L0.getValue()).booleanValue()) {
            d90 fe7Var = (d90) hi5.W(this, uz.a);
            long j = ((dw0) hi5.W(this, uz.b)).a;
            long jD = z51.d(1308617531);
            int i = dw0.h;
            if (!tk8.a(j, jD)) {
                fe7Var = new fe7(j);
            }
            sv1.E0(p34Var, fe7Var, 0L, 0L, 0.0f, null, 0, WebSocketProtocol.PAYLOAD_SHORT);
        }
    }

    @Override // defpackage.kq5
    public final void z(aq5 aq5Var, bq5 bq5Var, long j) {
        this.C0.z(aq5Var, bq5Var, j);
    }
}
