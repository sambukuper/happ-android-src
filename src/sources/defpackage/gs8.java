package defpackage;

import android.view.View;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.b;
import java.nio.charset.Charset;
import java.util.Arrays;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class gs8 {
    public final /* synthetic */ byte a;

    public /* synthetic */ gs8(byte b) {
        this.a = b;
    }

    public static final void a(final int i, final gn2 gn2Var, final kx4 kx4Var, lp2 lp2Var, final int i2) {
        int i3;
        lp2 lp2Var2;
        gn2Var.getClass();
        lp2Var.X(-541093371);
        if ((i2 & 6) == 0) {
            i3 = (lp2Var.d(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= lp2Var.h(gn2Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= lp2Var.f(kx4Var) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if (lp2Var.N(i3 & 1, (i3 & 147) != 146)) {
            final FillElement fillElement = b.a;
            tw0 tw0VarA = rw0.a(ht.c, pz2.q0, lp2Var, 0);
            int iHashCode = Long.hashCode(lp2Var.T);
            kl5 kl5VarL = lp2Var.l();
            kx4 kx4VarQ = w45.Q(lp2Var, kx4Var);
            uz0.j.getClass();
            lp2Var.Z();
            if (lp2Var.S) {
                lp2Var.k();
            } else {
                lp2Var.j0();
            }
            pn7.m(pz2.B0, lp2Var, tw0VarA);
            pn7.m(pz2.A0, lp2Var, kl5VarL);
            pn7.m(pz2.C0, lp2Var, Integer.valueOf(iHashCode));
            pn7.l(lp2Var);
            pn7.m(pz2.z0, lp2Var, kx4VarQ);
            lp2Var2 = lp2Var;
            ci8.a(fillElement, vj8.j0(y46.sub_properties_request_timeout_title, lp2Var), jm4.U(2123342063, new sn2() { // from class: zs7
                @Override // defpackage.sn2
                public final Object x(Object obj, Object obj2, Object obj3) {
                    lp2 lp2Var3 = (lp2) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((uw0) obj).getClass();
                    if (lp2Var3.N(iIntValue & 1, (iIntValue & 17) != 16)) {
                        w79.a(b.a, null, jm4.U(-1217324806, new wm0(i, gn2Var, fillElement), lp2Var3), lp2Var3, 390);
                    } else {
                        lp2Var3.Q();
                    }
                    return dn8.a;
                }
            }, lp2Var), lp2Var2, 390, 0);
            lp2Var2.p(true);
        } else {
            lp2Var2 = lp2Var;
            lp2Var2.Q();
        }
        j86 j86VarR = lp2Var2.r();
        if (j86VarR != null) {
            j86VarR.d = new rn2() { // from class: at7
                @Override // defpackage.rn2
                public final Object K(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP = w79.P(i2 | 1);
                    gs8.a(i, gn2Var, kx4Var, (lp2) obj, iP);
                    return dn8.a;
                }
            };
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0033, code lost:
    
        if (r11 >= r2) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003a, code lost:
    
        if (r10 <= r7) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0041, code lost:
    
        if (r9 >= r6) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0048, code lost:
    
        if (r8 <= r5) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004a, code lost:
    
        if (r21 != 3) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004d, code lost:
    
        if (r21 != 4) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004f, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0050, code lost:
    
        if (r21 != 3) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0052, code lost:
    
        r1 = r11 - r19.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0057, code lost:
    
        if (r21 != 4) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0059, code lost:
    
        r1 = r19.a - r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005d, code lost:
    
        if (r21 != 5) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005f, code lost:
    
        r1 = r9 - r19.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0064, code lost:
    
        if (r21 != 6) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0066, code lost:
    
        r1 = r19.b - r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x006d, code lost:
    
        if (r1 >= 0.0f) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x006f, code lost:
    
        r1 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0071, code lost:
    
        if (r21 != 3) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0073, code lost:
    
        r11 = r11 - r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0075, code lost:
    
        if (r21 != 4) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0077, code lost:
    
        r11 = r2 - r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x007a, code lost:
    
        if (r21 != 5) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x007c, code lost:
    
        r11 = r9 - r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x007f, code lost:
    
        if (r21 != 6) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0081, code lost:
    
        r11 = r6 - r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0087, code lost:
    
        if (r11 >= 1.0f) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0089, code lost:
    
        r11 = 1.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x008c, code lost:
    
        if (r1 >= r11) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x008e, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x008f, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0090, code lost:
    
        defpackage.bt.i("This function should only be used for 2-D focus search");
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0093, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0094, code lost:
    
        defpackage.bt.i("This function should only be used for 2-D focus search");
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0097, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0098, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean b(defpackage.s86 r18, defpackage.s86 r19, defpackage.s86 r20, int r21) {
        /*
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r21
            boolean r4 = c(r3, r2, r0)
            float r5 = r2.b
            float r6 = r2.d
            float r7 = r2.a
            float r2 = r2.c
            float r8 = r0.d
            float r9 = r0.b
            float r10 = r0.c
            float r11 = r0.a
            r12 = 0
            if (r4 != 0) goto L9c
            boolean r0 = c(r3, r1, r0)
            if (r0 != 0) goto L27
            goto L9c
        L27:
            java.lang.String r4 = "This function should only be used for 2-D focus search"
            r13 = 6
            r14 = 5
            r15 = 4
            r18 = 1
            r0 = 3
            if (r3 != r0) goto L36
            int r16 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r16 < 0) goto L98
            goto L4a
        L36:
            if (r3 != r15) goto L3d
            int r16 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r16 > 0) goto L98
            goto L4a
        L3d:
            if (r3 != r14) goto L44
            int r16 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r16 < 0) goto L98
            goto L4a
        L44:
            if (r3 != r13) goto L99
            int r16 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r16 > 0) goto L98
        L4a:
            if (r3 != r0) goto L4d
            goto L4f
        L4d:
            if (r3 != r15) goto L50
        L4f:
            return r18
        L50:
            if (r3 != r0) goto L57
            float r1 = r1.c
            float r1 = r11 - r1
            goto L69
        L57:
            if (r3 != r15) goto L5d
            float r1 = r1.a
            float r1 = r1 - r10
            goto L69
        L5d:
            if (r3 != r14) goto L64
            float r1 = r1.d
            float r1 = r9 - r1
            goto L69
        L64:
            if (r3 != r13) goto L94
            float r1 = r1.b
            float r1 = r1 - r8
        L69:
            r16 = 0
            int r17 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
            if (r17 >= 0) goto L71
            r1 = r16
        L71:
            if (r3 != r0) goto L75
            float r11 = r11 - r7
            goto L83
        L75:
            if (r3 != r15) goto L7a
            float r11 = r2 - r10
            goto L83
        L7a:
            if (r3 != r14) goto L7f
            float r11 = r9 - r5
            goto L83
        L7f:
            if (r3 != r13) goto L90
            float r11 = r6 - r8
        L83:
            r0 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r2 >= 0) goto L8a
            r11 = r0
        L8a:
            int r0 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r0 >= 0) goto L8f
            return r18
        L8f:
            return r12
        L90:
            defpackage.bt.i(r4)
            return r12
        L94:
            defpackage.bt.i(r4)
            return r12
        L98:
            return r18
        L99:
            defpackage.bt.i(r4)
        L9c:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gs8.b(s86, s86, s86, int):boolean");
    }

    public static final boolean c(int i, s86 s86Var, s86 s86Var2) {
        if (i == 3 || i == 4) {
            return s86Var.d > s86Var2.b && s86Var.b < s86Var2.d;
        }
        if (i == 5 || i == 6) {
            return s86Var.c > s86Var2.a && s86Var.a < s86Var2.c;
        }
        bt.i("This function should only be used for 2-D focus search");
        return false;
    }

    public static final void d(ai2 ai2Var, c15 c15Var) {
        if (!ai2Var.X.p0) {
            wc3.b("visitChildren called on an unattached node");
        }
        c15 c15Var2 = new c15(0, new jx4[16]);
        jx4 jx4Var = ai2Var.X;
        jx4 jx4Var2 = jx4Var.h0;
        if (jx4Var2 == null) {
            yn0.n(c15Var2, jx4Var);
        } else {
            c15Var2.b(jx4Var2);
        }
        while (true) {
            int i = c15Var2.Z;
            if (i == 0) {
                return;
            }
            jx4 jx4VarT = (jx4) c15Var2.k(i - 1);
            if ((jx4VarT.f0 & 1024) == 0) {
                yn0.n(c15Var2, jx4VarT);
            } else {
                while (jx4VarT != null) {
                    if ((jx4VarT.Z & 1024) != 0) {
                        c15 c15Var3 = null;
                        while (jx4VarT != null) {
                            if (jx4VarT instanceof ai2) {
                                ai2 ai2Var2 = (ai2) jx4VarT;
                                if (ai2Var2.p0 && !yn0.Z(ai2Var2).Q0) {
                                    if (ai2Var2.a1().a) {
                                        c15Var.b(ai2Var2);
                                    } else {
                                        d(ai2Var2, c15Var);
                                    }
                                }
                            } else if ((jx4VarT.Z & 1024) != 0 && (jx4VarT instanceof oh1)) {
                                int i2 = 0;
                                for (jx4 jx4Var3 = ((oh1) jx4VarT).r0; jx4Var3 != null; jx4Var3 = jx4Var3.h0) {
                                    if ((jx4Var3.Z & 1024) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            jx4VarT = jx4Var3;
                                        } else {
                                            if (c15Var3 == null) {
                                                c15Var3 = new c15(0, new jx4[16]);
                                            }
                                            if (jx4VarT != null) {
                                                c15Var3.b(jx4VarT);
                                                jx4VarT = null;
                                            }
                                            c15Var3.b(jx4Var3);
                                        }
                                    }
                                }
                                if (i2 == 1) {
                                }
                            }
                            jx4VarT = yn0.T(c15Var3);
                        }
                        break;
                    }
                    jx4VarT = jx4VarT.h0;
                }
            }
        }
    }

    public static final ai2 g(c15 c15Var, s86 s86Var, int i) {
        s86 s86VarJ;
        ai2 ai2Var = null;
        if (i == 3) {
            s86VarJ = s86Var.j((s86Var.c - s86Var.a) + 1.0f, 0.0f);
        } else if (i == 4) {
            s86VarJ = s86Var.j(-((s86Var.c - s86Var.a) + 1.0f), 0.0f);
        } else if (i == 5) {
            s86VarJ = s86Var.j(0.0f, (s86Var.d - s86Var.b) + 1.0f);
        } else {
            if (i != 6) {
                bt.i("This function should only be used for 2-D focus search");
                return null;
            }
            s86VarJ = s86Var.j(0.0f, -((s86Var.d - s86Var.b) + 1.0f));
        }
        Object[] objArr = c15Var.X;
        int i2 = c15Var.Z;
        for (int i3 = 0; i3 < i2; i3++) {
            ai2 ai2Var2 = (ai2) objArr[i3];
            if (u15.B(ai2Var2)) {
                s86 s86VarO = u15.o(ai2Var2);
                if (k(s86VarO, s86VarJ, s86Var, i)) {
                    ai2Var = ai2Var2;
                    s86VarJ = s86VarO;
                }
            }
        }
        return ai2Var;
    }

    public static final boolean h(ai2 ai2Var, int i, gn2 gn2Var) {
        s86 s86Var;
        c15 c15Var = new c15(0, new ai2[16]);
        d(ai2Var, c15Var);
        int i2 = c15Var.Z;
        if (i2 <= 1) {
            ai2 ai2Var2 = (ai2) (i2 == 0 ? null : c15Var.X[0]);
            if (ai2Var2 != null) {
                return ((Boolean) gn2Var.B(ai2Var2)).booleanValue();
            }
        } else {
            if (i == 7) {
                i = 4;
            }
            if (i == 4 || i == 6) {
                s86 s86VarO = u15.o(ai2Var);
                float f = s86VarO.a;
                float f2 = s86VarO.b;
                s86Var = new s86(f, f2, f, f2);
            } else {
                if (i != 3 && i != 5) {
                    bt.i("This function should only be used for 2-D focus search");
                    return false;
                }
                s86 s86VarO2 = u15.o(ai2Var);
                float f3 = s86VarO2.c;
                float f4 = s86VarO2.d;
                s86Var = new s86(f3, f4, f3, f4);
            }
            ai2 ai2VarG = g(c15Var, s86Var, i);
            if (ai2VarG != null) {
                return ((Boolean) gn2Var.B(ai2VarG)).booleanValue();
            }
        }
        return false;
    }

    public static final boolean i(int i, sn snVar, ai2 ai2Var, s86 s86Var) {
        if (n(i, snVar, ai2Var, s86Var)) {
            return true;
        }
        Boolean bool = (Boolean) w39.l0(ai2Var, i, new sw0(((gh2) yn0.a0(ai2Var).getFocusOwner()).f(), ai2Var, s86Var, i, snVar));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final fx8 j(View view) {
        view.getClass();
        while (view != null) {
            Object tag = view.getTag(w36.view_tree_view_model_store_owner);
            fx8 fx8Var = tag instanceof fx8 ? (fx8) tag : null;
            if (fx8Var != null) {
                return fx8Var;
            }
            Object objD = ts7.d(view);
            view = objD instanceof View ? (View) objD : null;
        }
        return null;
    }

    public static final boolean k(s86 s86Var, s86 s86Var2, s86 s86Var3, int i) {
        if (!l(i, s86Var, s86Var3)) {
            return false;
        }
        if (l(i, s86Var2, s86Var3) && !b(s86Var3, s86Var, s86Var2, i)) {
            return !b(s86Var3, s86Var2, s86Var, i) && m(i, s86Var3, s86Var) < m(i, s86Var3, s86Var2);
        }
        return true;
    }

    public static final boolean l(int i, s86 s86Var, s86 s86Var2) {
        if (i == 3) {
            float f = s86Var2.c;
            float f2 = s86Var2.a;
            float f3 = s86Var.c;
            return (f > f3 || f2 >= f3) && f2 > s86Var.a;
        }
        if (i == 4) {
            float f4 = s86Var2.a;
            float f5 = s86Var2.c;
            float f6 = s86Var.a;
            return (f4 < f6 || f5 <= f6) && f5 < s86Var.c;
        }
        if (i == 5) {
            float f7 = s86Var2.d;
            float f8 = s86Var2.b;
            float f9 = s86Var.d;
            return (f7 > f9 || f8 >= f9) && f8 > s86Var.b;
        }
        if (i != 6) {
            bt.i("This function should only be used for 2-D focus search");
            return false;
        }
        float f10 = s86Var2.b;
        float f11 = s86Var2.d;
        float f12 = s86Var.b;
        return (f10 < f12 || f11 <= f12) && f11 < s86Var.d;
    }

    public static final long m(int i, s86 s86Var, s86 s86Var2) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        if (i == 3) {
            f = s86Var.a;
            f2 = s86Var2.c;
        } else if (i == 4) {
            f = s86Var2.a;
            f2 = s86Var.c;
        } else if (i == 5) {
            f = s86Var.b;
            f2 = s86Var2.d;
        } else {
            if (i != 6) {
                bt.i("This function should only be used for 2-D focus search");
                return 0L;
            }
            f = s86Var2.b;
            f2 = s86Var.d;
        }
        float f6 = f - f2;
        if (f6 < 0.0f) {
            f6 = 0.0f;
        }
        long j = (long) f6;
        if (i == 3 || i == 4) {
            float f7 = s86Var.b;
            f3 = ((s86Var.d - f7) / 2.0f) + f7;
            f4 = s86Var2.b;
            f5 = s86Var2.d;
        } else {
            if (i != 5 && i != 6) {
                bt.i("This function should only be used for 2-D focus search");
                return 0L;
            }
            float f8 = s86Var.a;
            f3 = ((s86Var.c - f8) / 2.0f) + f8;
            f4 = s86Var2.a;
            f5 = s86Var2.c;
        }
        long j2 = (long) (f3 - (((f5 - f4) / 2.0f) + f4));
        return (j2 * j2) + (13 * j * j);
    }

    public static final boolean n(int i, sn snVar, ai2 ai2Var, s86 s86Var) {
        ai2 ai2VarG;
        c15 c15Var = new c15(0, new ai2[16]);
        if (!ai2Var.X.p0) {
            wc3.b("visitChildren called on an unattached node");
        }
        c15 c15Var2 = new c15(0, new jx4[16]);
        jx4 jx4Var = ai2Var.X;
        jx4 jx4Var2 = jx4Var.h0;
        if (jx4Var2 == null) {
            yn0.n(c15Var2, jx4Var);
        } else {
            c15Var2.b(jx4Var2);
        }
        while (true) {
            int i2 = c15Var2.Z;
            if (i2 == 0) {
                break;
            }
            jx4 jx4VarT = (jx4) c15Var2.k(i2 - 1);
            if ((jx4VarT.f0 & 1024) == 0) {
                yn0.n(c15Var2, jx4VarT);
            } else {
                while (jx4VarT != null) {
                    if ((jx4VarT.Z & 1024) != 0) {
                        c15 c15Var3 = null;
                        while (jx4VarT != null) {
                            if (jx4VarT instanceof ai2) {
                                ai2 ai2Var2 = (ai2) jx4VarT;
                                if (ai2Var2.p0) {
                                    c15Var.b(ai2Var2);
                                }
                            } else if ((jx4VarT.Z & 1024) != 0 && (jx4VarT instanceof oh1)) {
                                int i3 = 0;
                                for (jx4 jx4Var3 = ((oh1) jx4VarT).r0; jx4Var3 != null; jx4Var3 = jx4Var3.h0) {
                                    if ((jx4Var3.Z & 1024) != 0) {
                                        i3++;
                                        if (i3 == 1) {
                                            jx4VarT = jx4Var3;
                                        } else {
                                            if (c15Var3 == null) {
                                                c15Var3 = new c15(0, new jx4[16]);
                                            }
                                            if (jx4VarT != null) {
                                                c15Var3.b(jx4VarT);
                                                jx4VarT = null;
                                            }
                                            c15Var3.b(jx4Var3);
                                        }
                                    }
                                }
                                if (i3 == 1) {
                                }
                            }
                            jx4VarT = yn0.T(c15Var3);
                        }
                        break;
                    }
                    jx4VarT = jx4VarT.h0;
                }
            }
        }
        while (c15Var.Z != 0 && (ai2VarG = g(c15Var, s86Var, i)) != null) {
            if (ai2VarG.a1().a) {
                return ((Boolean) snVar.B(ai2VarG)).booleanValue();
            }
            if (i(i, snVar, ai2VarG, s86Var)) {
                return true;
            }
            c15Var.j(ai2VarG);
        }
        return false;
    }

    public static String o(int i) {
        if (i == 1) {
            return "Clip";
        }
        if (i == 2) {
            return "Ellipsis";
        }
        if (i == 5) {
            return "MiddleEllipsis";
        }
        if (i == 3) {
            return "Visible";
        }
        return i == 4 ? "StartEllipsis" : "Invalid";
    }

    public static final Boolean p(int i, sn snVar, ai2 ai2Var, s86 s86Var) {
        int iOrdinal = ai2Var.d1().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                ai2 ai2VarP = u15.p(ai2Var);
                if (ai2VarP == null) {
                    bt.i("ActiveParent must have a focusedChild");
                    return null;
                }
                int iOrdinal2 = ai2VarP.d1().ordinal();
                if (iOrdinal2 != 0) {
                    if (iOrdinal2 == 1) {
                        Boolean boolP = p(i, snVar, ai2VarP, s86Var);
                        if (!dh3.f(boolP, Boolean.FALSE)) {
                            return boolP;
                        }
                        if (s86Var == null) {
                            if (ai2VarP.d1() != yh2.Y) {
                                bt.i("Searching for active node in inactive hierarchy");
                                return null;
                            }
                            ai2 ai2VarL = u15.l(ai2VarP);
                            if (ai2VarL == null) {
                                bt.i("ActiveParent must have a focusedChild");
                                return null;
                            }
                            s86Var = u15.o(ai2VarL);
                        }
                        return Boolean.valueOf(i(i, snVar, ai2Var, s86Var));
                    }
                    if (iOrdinal2 != 2) {
                        if (iOrdinal2 != 3) {
                            b61.c();
                            return null;
                        }
                        bt.i("ActiveParent must have a focusedChild");
                        return null;
                    }
                }
                if (s86Var == null) {
                    s86Var = u15.o(ai2VarP);
                }
                return Boolean.valueOf(i(i, snVar, ai2Var, s86Var));
            }
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    b61.c();
                    return null;
                }
                if (ai2Var.a1().a) {
                    return (Boolean) snVar.B(ai2Var);
                }
                return s86Var == null ? Boolean.valueOf(h(ai2Var, i, snVar)) : Boolean.valueOf(n(i, snVar, ai2Var, s86Var));
            }
        }
        return Boolean.valueOf(h(ai2Var, i, snVar));
    }

    /* JADX WARN: Code duplicated, block: B:107:0x0064 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:20:0x004a  */
    /* JADX WARN: Code duplicated, block: B:24:0x0057  */
    /* JADX WARN: Code duplicated, block: B:26:0x005b A[LOOP:2: B:23:0x0055->B:26:0x005b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:31:0x006d  */
    /* JADX WARN: Code duplicated, block: B:44:0x009b  */
    /* JADX WARN: Code duplicated, block: B:61:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:63:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:81:0x0067 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x0050 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x0093 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:0x008e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x00d9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x00d4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:0x006b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:0x0097 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:0x0132 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x012d A[SYNTHETIC] */
    public final String e(int i, int i2, byte[] bArr) throws qh3 {
        int i3;
        byte b;
        int i4;
        byte b2;
        byte b3;
        byte b4;
        switch (this.a) {
            case 0:
                if ((i | i2 | ((bArr.length - i) - i2)) < 0) {
                    throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)));
                }
                int i5 = i + i2;
                char[] cArr = new char[i2];
                int i6 = 0;
                while (i < i5) {
                    byte b5 = bArr[i];
                    if (b5 < 0) {
                        while (i < i5) {
                            i3 = i + 1;
                            b = bArr[i];
                            if (b < 0) {
                                i4 = i6 + 1;
                                cArr[i6] = (char) b;
                                while (i3 < i5) {
                                    b2 = bArr[i3];
                                    if (b2 >= 0) {
                                        i3++;
                                        cArr[i4] = (char) b2;
                                        i4++;
                                    } else {
                                        i6 = i4;
                                        i = i3;
                                    }
                                }
                                i6 = i4;
                                i = i3;
                            } else if (b < -32) {
                                if (i3 < i5) {
                                    throw qh3.a();
                                }
                                i += 2;
                                byte b6 = bArr[i3];
                                int i7 = i6 + 1;
                                if (b >= -62 || ys7.g(b6)) {
                                    throw qh3.a();
                                }
                                cArr[i6] = (char) ((b6 & 63) | ((b & 31) << 6));
                                i6 = i7;
                            } else {
                                if (b >= -16) {
                                    if (i3 < i5 - 2) {
                                        throw qh3.a();
                                    }
                                    b4 = bArr[i3];
                                    int i8 = i + 3;
                                    byte b7 = bArr[i + 2];
                                    i += 4;
                                    byte b8 = bArr[i8];
                                    int i9 = i6 + 1;
                                    if (!ys7.g(b4)) {
                                        if ((((b4 + 112) + (b << 28)) >> 30) != 0 && !ys7.g(b7) && !ys7.g(b8)) {
                                            int i10 = ((b4 & 63) << 12) | ((b & 7) << 18) | ((b7 & 63) << 6) | (b8 & 63);
                                            cArr[i6] = (char) ((i10 >>> 10) + 55232);
                                            cArr[i9] = (char) ((i10 & 1023) + 56320);
                                            i6 += 2;
                                        }
                                    }
                                    throw qh3.a();
                                }
                                if (i3 < i5 - 1) {
                                    throw qh3.a();
                                }
                                int i11 = i + 2;
                                b3 = bArr[i3];
                                i += 3;
                                byte b9 = bArr[i11];
                                int i12 = i6 + 1;
                                if (!ys7.g(b3) || ((b == -32 && b3 < -96) || ((b == -19 && b3 >= -96) || ys7.g(b9)))) {
                                    throw qh3.a();
                                }
                                cArr[i6] = (char) (((b3 & 63) << 6) | ((b & 15) << 12) | (b9 & 63));
                                i6 = i12;
                            }
                        }
                        return new String(cArr, 0, i6);
                    }
                    i++;
                    cArr[i6] = (char) b5;
                    i6++;
                }
                while (i < i5) {
                    i3 = i + 1;
                    b = bArr[i];
                    if (b < 0) {
                        if (b < -32) {
                            if (i3 < i5) {
                                throw qh3.a();
                            }
                            i += 2;
                            byte b10 = bArr[i3];
                            int i13 = i6 + 1;
                            if (b >= -62) {
                            }
                            throw qh3.a();
                        }
                        if (b >= -16) {
                            if (i3 < i5 - 1) {
                                throw qh3.a();
                            }
                            int i14 = i + 2;
                            b3 = bArr[i3];
                            i += 3;
                            byte b11 = bArr[i14];
                            int i15 = i6 + 1;
                            if (ys7.g(b3)) {
                            }
                            throw qh3.a();
                        }
                        if (i3 < i5 - 2) {
                            throw qh3.a();
                        }
                        b4 = bArr[i3];
                        int i16 = i + 3;
                        byte b12 = bArr[i + 2];
                        i += 4;
                        byte b13 = bArr[i16];
                        int i17 = i6 + 1;
                        if (!ys7.g(b4)) {
                            if ((((b4 + 112) + (b << 28)) >> 30) != 0) {
                            }
                        }
                        throw qh3.a();
                    }
                    i4 = i6 + 1;
                    cArr[i6] = (char) b;
                    while (i3 < i5) {
                        b2 = bArr[i3];
                        if (b2 >= 0) {
                            i3++;
                            cArr[i4] = (char) b2;
                            i4++;
                        } else {
                            i6 = i4;
                            i = i3;
                        }
                    }
                    i6 = i4;
                    i = i3;
                }
                return new String(cArr, 0, i6);
            default:
                Charset charset = eg3.a;
                String str = new String(bArr, i, i2, charset);
                if (str.indexOf(65533) >= 0 && !Arrays.equals(str.getBytes(charset), Arrays.copyOfRange(bArr, i, i2 + i))) {
                    throw qh3.a();
                }
                return str;
        }
    }

    /* JADX WARN: Code duplicated, block: B:70:0x0180  */
    /* JADX WARN: Code duplicated, block: B:71:0x0184  */
    /* JADX WARN: Code duplicated, block: B:73:0x0187  */
    /* JADX WARN: Code duplicated, block: B:77:0x0199  */
    /* JADX WARN: Code duplicated, block: B:79:0x019d  */
    /* JADX WARN: Code duplicated, block: B:82:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:84:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:86:0x01bd  */
    public final int f(String str, byte[] bArr, int i, int i2) {
        int i3;
        char cCharAt;
        int i4;
        char cCharAt2;
        int i5;
        char cCharAt3;
        char c = 2048;
        char c2 = 55296;
        switch (this.a) {
            case 0:
                int length = str.length();
                int i6 = i2 + i;
                int i7 = 0;
                while (i7 < length) {
                    int i8 = i7 + i;
                    if (i8 >= i6 || (cCharAt2 = str.charAt(i7)) >= 128) {
                        if (i7 == length) {
                            return i + length;
                        }
                        i3 = i + i7;
                        while (i7 < length) {
                            cCharAt = str.charAt(i7);
                            if (cCharAt >= 128 && i3 < i6) {
                                bArr[i3] = (byte) cCharAt;
                                i3++;
                            } else if (cCharAt >= 2048 && i3 <= i6 - 2) {
                                int i9 = i3 + 1;
                                bArr[i3] = (byte) ((cCharAt >>> 6) | 960);
                                i3 += 2;
                                bArr[i9] = (byte) ((cCharAt & '?') | 128);
                            } else {
                                if ((cCharAt < 55296 && 57343 >= cCharAt) || i3 > i6 - 3) {
                                    if (i3 > i6 - 4) {
                                        if (55296 <= cCharAt && cCharAt <= 57343 && ((i4 = i7 + 1) == str.length() || !Character.isSurrogatePair(cCharAt, str.charAt(i4)))) {
                                            throw new hs8(i7, length);
                                        }
                                        throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt + " at index " + i3);
                                    }
                                    int i10 = i7 + 1;
                                    if (i10 != str.length()) {
                                        char cCharAt4 = str.charAt(i10);
                                        if (Character.isSurrogatePair(cCharAt, cCharAt4)) {
                                            int codePoint = Character.toCodePoint(cCharAt, cCharAt4);
                                            bArr[i3] = (byte) ((codePoint >>> 18) | 240);
                                            bArr[i3 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                                            int i11 = i3 + 3;
                                            bArr[i3 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                                            i3 += 4;
                                            bArr[i11] = (byte) ((codePoint & 63) | 128);
                                            i7 = i10;
                                        } else {
                                            i7 = i10;
                                        }
                                    }
                                    throw new hs8(i7 - 1, length);
                                }
                                bArr[i3] = (byte) ((cCharAt >>> '\f') | 480);
                                int i12 = i3 + 2;
                                bArr[i3 + 1] = (byte) (((cCharAt >>> 6) & 63) | 128);
                                i3 += 3;
                                bArr[i12] = (byte) ((cCharAt & '?') | 128);
                            }
                            i7++;
                        }
                        return i3;
                    }
                    bArr[i8] = (byte) cCharAt2;
                    i7++;
                }
                if (i7 == length) {
                    return i + length;
                }
                i3 = i + i7;
                while (i7 < length) {
                    cCharAt = str.charAt(i7);
                    if (cCharAt >= 128) {
                        if (cCharAt >= 2048) {
                            if (cCharAt < 55296) {
                                bArr[i3] = (byte) ((cCharAt >>> '\f') | 480);
                                int i13 = i3 + 2;
                                bArr[i3 + 1] = (byte) (((cCharAt >>> 6) & 63) | 128);
                                i3 += 3;
                                bArr[i13] = (byte) ((cCharAt & '?') | 128);
                            } else {
                                bArr[i3] = (byte) ((cCharAt >>> '\f') | 480);
                                int i14 = i3 + 2;
                                bArr[i3 + 1] = (byte) (((cCharAt >>> 6) & 63) | 128);
                                i3 += 3;
                                bArr[i14] = (byte) ((cCharAt & '?') | 128);
                            }
                        } else if (cCharAt < 55296) {
                            bArr[i3] = (byte) ((cCharAt >>> '\f') | 480);
                            int i15 = i3 + 2;
                            bArr[i3 + 1] = (byte) (((cCharAt >>> 6) & 63) | 128);
                            i3 += 3;
                            bArr[i15] = (byte) ((cCharAt & '?') | 128);
                        } else {
                            bArr[i3] = (byte) ((cCharAt >>> '\f') | 480);
                            int i16 = i3 + 2;
                            bArr[i3 + 1] = (byte) (((cCharAt >>> 6) & 63) | 128);
                            i3 += 3;
                            bArr[i16] = (byte) ((cCharAt & '?') | 128);
                        }
                    } else if (cCharAt >= 2048) {
                        if (cCharAt < 55296) {
                            bArr[i3] = (byte) ((cCharAt >>> '\f') | 480);
                            int i17 = i3 + 2;
                            bArr[i3 + 1] = (byte) (((cCharAt >>> 6) & 63) | 128);
                            i3 += 3;
                            bArr[i17] = (byte) ((cCharAt & '?') | 128);
                        } else {
                            bArr[i3] = (byte) ((cCharAt >>> '\f') | 480);
                            int i18 = i3 + 2;
                            bArr[i3 + 1] = (byte) (((cCharAt >>> 6) & 63) | 128);
                            i3 += 3;
                            bArr[i18] = (byte) ((cCharAt & '?') | 128);
                        }
                    } else if (cCharAt < 55296) {
                        bArr[i3] = (byte) ((cCharAt >>> '\f') | 480);
                        int i19 = i3 + 2;
                        bArr[i3 + 1] = (byte) (((cCharAt >>> 6) & 63) | 128);
                        i3 += 3;
                        bArr[i19] = (byte) ((cCharAt & '?') | 128);
                    } else {
                        bArr[i3] = (byte) ((cCharAt >>> '\f') | 480);
                        int i110 = i3 + 2;
                        bArr[i3 + 1] = (byte) (((cCharAt >>> 6) & 63) | 128);
                        i3 += 3;
                        bArr[i110] = (byte) ((cCharAt & '?') | 128);
                    }
                    i7++;
                }
                return i3;
            default:
                long j = i;
                long j2 = ((long) i2) + j;
                int length2 = str.length();
                if (length2 > i2 || bArr.length - i2 < i) {
                    throw new ArrayIndexOutOfBoundsException("Failed writing " + str.charAt(length2 - 1) + " at index " + (i + i2));
                }
                int i20 = 0;
                while (i20 < length2 && (cCharAt3 = str.charAt(i20)) < 128) {
                    ao8.j(bArr, j, (byte) cCharAt3);
                    i20++;
                    j++;
                }
                if (i20 != length2) {
                    while (i20 < length2) {
                        char cCharAt5 = str.charAt(i20);
                        if (cCharAt5 < 128 && j < j2) {
                            ao8.j(bArr, j, (byte) cCharAt5);
                            j++;
                        } else if (cCharAt5 >= c || j > j2 - 2) {
                            int i21 = i20;
                            if ((cCharAt5 >= c2 && 57343 >= cCharAt5) || j > j2 - 3) {
                                if (j > j2 - 4) {
                                    if (55296 <= cCharAt5 && cCharAt5 <= 57343 && ((i5 = i21 + 1) == length2 || !Character.isSurrogatePair(cCharAt5, str.charAt(i5)))) {
                                        throw new hs8(i21, length2);
                                    }
                                    throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt5 + " at index " + j);
                                }
                                i20 = i21 + 1;
                                if (i20 != length2) {
                                    char cCharAt6 = str.charAt(i20);
                                    if (Character.isSurrogatePair(cCharAt5, cCharAt6)) {
                                        int codePoint2 = Character.toCodePoint(cCharAt5, cCharAt6);
                                        ao8.j(bArr, j, (byte) ((codePoint2 >>> 18) | 240));
                                        ao8.j(bArr, j + 1, (byte) (((codePoint2 >>> 12) & 63) | 128));
                                        long j3 = j + 3;
                                        ao8.j(bArr, j + 2, (byte) (((codePoint2 >>> 6) & 63) | 128));
                                        j += 4;
                                        ao8.j(bArr, j3, (byte) ((codePoint2 & 63) | 128));
                                    }
                                } else {
                                    i20 = i21;
                                }
                                throw new hs8(i20 - 1, length2);
                            }
                            ao8.j(bArr, j, (byte) ((cCharAt5 >>> '\f') | 480));
                            long j4 = j + 2;
                            ao8.j(bArr, j + 1, (byte) (((cCharAt5 >>> 6) & 63) | 128));
                            j += 3;
                            ao8.j(bArr, j4, (byte) ((cCharAt5 & '?') | 128));
                            i20 = i21;
                        } else {
                            long j5 = j + 1;
                            ao8.j(bArr, j, (byte) ((cCharAt5 >>> 6) | 960));
                            j += 2;
                            ao8.j(bArr, j5, (byte) ((cCharAt5 & '?') | 128));
                            i20 = i20;
                        }
                        i20++;
                        c = 2048;
                        c2 = 55296;
                    }
                }
                return (int) j;
        }
    }
}
