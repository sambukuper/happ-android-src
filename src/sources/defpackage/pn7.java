package defpackage;

import android.app.Activity;
import android.content.Context;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.b;
import su.happ.proxyutility.domain.routing.entity.RouteProfileId;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public abstract class pn7 implements ew8 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code duplicated, block: B:168:0x0268  */
    /* JADX WARN: Code duplicated, block: B:170:0x026d  */
    /* JADX WARN: Code duplicated, block: B:174:0x0274  */
    /* JADX WARN: Code duplicated, block: B:176:0x0278  */
    /* JADX WARN: Code duplicated, block: B:178:0x027b  */
    /* JADX WARN: Code duplicated, block: B:179:0x027e  */
    /* JADX WARN: Code duplicated, block: B:182:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:184:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:188:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:190:0x02d3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:192:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:195:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:197:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:201:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:203:0x0302 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:205:0x0305  */
    /* JADX WARN: Code duplicated, block: B:208:0x0321  */
    /* JADX WARN: Code duplicated, block: B:210:0x0325  */
    /* JADX WARN: Code duplicated, block: B:217:0x0351  */
    /* JADX WARN: Code duplicated, block: B:219:0x0354  */
    /* JADX WARN: Code duplicated, block: B:221:0x0357  */
    /* JADX WARN: Code duplicated, block: B:223:0x035b  */
    /* JADX WARN: Code duplicated, block: B:225:0x035f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:226:0x0361  */
    /* JADX WARN: Code duplicated, block: B:229:0x037a  */
    /* JADX WARN: Code duplicated, block: B:231:0x037d  */
    /* JADX WARN: Code duplicated, block: B:233:0x0380  */
    /* JADX WARN: Code duplicated, block: B:235:0x0384  */
    /* JADX WARN: Code duplicated, block: B:237:0x0388 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:241:0x03bf  */
    /* JADX WARN: Code duplicated, block: B:243:0x03c3  */
    /* JADX WARN: Code duplicated, block: B:246:0x03d9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:247:0x03db  */
    /* JADX WARN: Code duplicated, block: B:250:0x0400  */
    /* JADX WARN: Code duplicated, block: B:252:0x0406  */
    /* JADX WARN: Code duplicated, block: B:255:0x042a  */
    /* JADX WARN: Code duplicated, block: B:256:0x042d  */
    /* JADX WARN: Code duplicated, block: B:259:0x046a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:260:0x046c  */
    /* JADX WARN: Code duplicated, block: B:263:0x04b7  */
    /* JADX WARN: Code duplicated, block: B:266:0x04c5  */
    /* JADX WARN: Code duplicated, block: B:267:0x04d4  */
    /* JADX WARN: Code duplicated, block: B:269:0x04fa  */
    /* JADX WARN: Code duplicated, block: B:270:0x04fd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:271:0x04ff  */
    /* JADX WARN: Code duplicated, block: B:272:0x0502 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:273:0x0504  */
    /* JADX WARN: Code duplicated, block: B:274:0x0507  */
    /* JADX WARN: Code duplicated, block: B:277:0x050f  */
    /* JADX WARN: Code duplicated, block: B:280:0x0524  */
    /* JADX WARN: Code duplicated, block: B:285:0x055b  */
    /* JADX WARN: Code duplicated, block: B:288:0x0574  */
    /* JADX WARN: Code duplicated, block: B:291:0x05a5  */
    /* JADX WARN: Code duplicated, block: B:292:0x05a8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:293:0x05aa  */
    /* JADX WARN: Code duplicated, block: B:294:0x05ad A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:295:0x05af  */
    /* JADX WARN: Code duplicated, block: B:296:0x05b2  */
    /* JADX WARN: Code duplicated, block: B:298:0x05b6  */
    /* JADX WARN: Code duplicated, block: B:299:0x05c5  */
    /* JADX WARN: Code duplicated, block: B:301:0x05e0  */
    /* JADX WARN: Code duplicated, block: B:302:0x05e3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:303:0x05e5  */
    /* JADX WARN: Code duplicated, block: B:304:0x05e8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:305:0x05ea  */
    /* JADX WARN: Code duplicated, block: B:306:0x05ed  */
    /* JADX WARN: Code duplicated, block: B:308:0x05f1  */
    /* JADX WARN: Code duplicated, block: B:309:0x05fe  */
    /* JADX WARN: Code duplicated, block: B:312:0x0620  */
    /* JADX WARN: Code duplicated, block: B:314:0x0623  */
    /* JADX WARN: Code duplicated, block: B:316:0x062f  */
    /* JADX WARN: Code duplicated, block: B:319:0x067a  */
    /* JADX WARN: Code duplicated, block: B:320:0x067d  */
    /* JADX WARN: Code duplicated, block: B:323:0x068a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:324:0x068c  */
    /* JADX WARN: Code duplicated, block: B:326:0x06d3  */
    /* JADX WARN: Code duplicated, block: B:328:0x06e1  */
    public static final void a(final d78 d78Var, final CharSequence charSequence, final zy0 zy0Var, final q58 q58Var, final sn2 sn2Var, final rn2 rn2Var, final rn2 rn2Var2, final rn2 rn2Var3, final boolean z, final boolean z2, final boolean z3, final xz4 xz4Var, final gg5 gg5Var, final i48 i48Var, final zy0 zy0Var2, lp2 lp2Var, final int i) {
        int i2;
        ae3 ae3Var;
        long j;
        rh5 rh5Var;
        float f;
        int iOrdinal;
        o88 o88Var;
        float f2;
        yd8 yd8VarH;
        ta2 ta2VarQ0;
        ta2 ta2VarQ1;
        int iOrdinal2;
        float f3;
        int iOrdinal3;
        float f4;
        wd8 wd8VarF;
        ta2 ta2Var;
        final yd8 yd8VarH2;
        int iOrdinal4;
        float f5;
        int iOrdinal5;
        final yd8 yd8VarH3;
        ae3 ae3Var2;
        int[] iArr;
        long j2;
        lw0 lw0VarE;
        boolean zF;
        Object objK;
        Object obj;
        ae3 ae3Var3;
        long j3;
        ae3 ae3Var4;
        long j4;
        yd8 yd8VarH4;
        lw0 lw0VarE2;
        boolean zF2;
        Object objK2;
        yd8 yd8VarH5;
        Object objK3;
        m58 m58Var;
        o88 o88Var2;
        rn2 rn2Var4;
        long j5;
        Object objK4;
        lp2 lp2Var2;
        zy0 zy0Var3;
        Object objK5;
        long j6;
        rn2 rn2Var5;
        long j7;
        boolean z4;
        rn2 rn2Var6;
        int iOrdinal6;
        Object objK6;
        y05 y05Var;
        boolean z5;
        boolean z6;
        boolean zF3;
        Object objK7;
        lp2 lp2Var3 = lp2Var;
        qe4 qe4Var = qe4.v0;
        ti tiVar = ti.i0;
        lp2Var3.X(546805032);
        if ((i & 6) == 0) {
            i2 = (lp2Var3.d(d78Var.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= lp2Var3.h(charSequence) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= lp2Var3.h(zy0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= lp2Var3.f(q58Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= lp2Var3.h(sn2Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= lp2Var3.h(rn2Var) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= lp2Var3.h((Object) null) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= lp2Var3.h(rn2Var2) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= lp2Var3.h((Object) null) ? 67108864 : 33554432;
        }
        if ((805306368 & i) == 0) {
            i2 |= lp2Var3.h((Object) null) ? 536870912 : 268435456;
        }
        int i3 = i2;
        int i4 = (lp2Var3.h(rn2Var3) ? 4 : 2) | (lp2Var3.g(z) ? 32 : 16) | (lp2Var3.g(z2) ? 256 : 128) | (lp2Var3.g(z3) ? 2048 : 1024) | (lp2Var3.f(xz4Var) ? 16384 : 8192) | (lp2Var3.f(gg5Var) ? 131072 : 65536) | (lp2Var3.f(i48Var) ? 1048576 : 524288) | (lp2Var3.h(zy0Var2) ? 8388608 : 4194304);
        if (lp2Var3.N(i3 & 1, ((306783379 & i3) == 306783378 && (i4 & 4793491) == 4793490) ? false : true)) {
            boolean zBooleanValue = ((Boolean) km4.s(xz4Var, lp2Var3, (i4 >> 12) & 14).getValue()).booleanValue();
            ae3 ae3Var5 = ae3.Z;
            ae3 ae3Var6 = ae3.Y;
            ae3 ae3Var7 = ae3.X;
            if (zBooleanValue) {
                ae3Var = ae3Var7;
            } else {
                ae3Var = charSequence.length() == 0 ? ae3Var6 : ae3Var5;
            }
            if (!z2) {
                j = i48Var.z;
            } else if (z3) {
                j = i48Var.A;
            } else {
                j = zBooleanValue ? i48Var.x : i48Var.y;
            }
            wj8 wj8Var = (wj8) lp2Var3.j(yj8.a);
            o88 o88Var3 = wj8Var.j;
            o88 o88Var4 = wj8Var.l;
            long jB = o88Var3.b();
            long j8 = dw0.g;
            boolean z7 = (tk8.a(jB, j8) && !tk8.a(o88Var4.b(), j8)) || (!tk8.a(o88Var3.b(), j8) && tk8.a(o88Var4.b(), j8));
            long jB2 = o88Var4.b();
            long j9 = (z7 && jB2 == 16) ? j : jB2;
            long jB3 = o88Var3.b();
            long j10 = (z7 && jB3 == 16) ? j : jB3;
            boolean z8 = sn2Var != null && (q58Var instanceof q58);
            ce8 ce8VarO = rq7.o(ae3Var, "TextFieldInputState", lp2Var3, 48);
            rh5 rh5Var2 = ce8VarO.d;
            wf7 wf7VarQ0 = w39.q0(ly4.Y, lp2Var3);
            ug8 ug8Var = ys0.j0;
            ae3 ae3Var8 = (ae3) ce8VarO.c();
            lp2Var3.W(-1436405362);
            int iOrdinal7 = ae3Var8.ordinal();
            float f6 = 0.0f;
            if (iOrdinal7 != 0) {
                rh5Var = rh5Var2;
                if (iOrdinal7 == 1) {
                    if (z8) {
                        f = 0.0f;
                    }
                    lp2Var3.p(false);
                    Float fValueOf = Float.valueOf(f);
                    ae3 ae3Var9 = (ae3) rh5Var.getValue();
                    lp2Var3.W(-1436405362);
                    iOrdinal = ae3Var9.ordinal();
                    if (iOrdinal != 0) {
                        o88Var = o88Var4;
                        if (iOrdinal != 1) {
                            if (z8) {
                                f2 = 0.0f;
                            }
                            lp2Var3.p(false);
                            Float fValueOf2 = Float.valueOf(f2);
                            ce8VarO.f();
                            lp2Var3.W(-709912974);
                            lp2Var3.p(false);
                            yd8VarH = rq7.h(ce8VarO, fValueOf, fValueOf2, wf7VarQ0, ug8Var, lp2Var3, 196608);
                            ly4 ly4Var = ly4.f0;
                            ta2VarQ0 = w39.q0(ly4Var, lp2Var3);
                            ta2VarQ1 = w39.q0(ly4.g0, lp2Var3);
                            ae3 ae3Var10 = (ae3) ce8VarO.c();
                            lp2Var3.W(-1093194547);
                            iOrdinal2 = ae3Var10.ordinal();
                            if (iOrdinal2 == 0) {
                                f3 = 1.0f;
                            } else {
                                if (iOrdinal2 != 1) {
                                    if (iOrdinal2 != 2) {
                                        b61.c();
                                        return;
                                    }
                                } else if (z8) {
                                    f3 = 1.0f;
                                }
                                f3 = 0.0f;
                            }
                            lp2Var3.p(false);
                            Float fValueOf3 = Float.valueOf(f3);
                            ae3 ae3Var11 = (ae3) rh5Var.getValue();
                            lp2Var3.W(-1093194547);
                            iOrdinal3 = ae3Var11.ordinal();
                            if (iOrdinal3 == 0) {
                                f4 = 1.0f;
                            } else {
                                if (iOrdinal3 != 1) {
                                    if (iOrdinal3 != 2) {
                                        b61.c();
                                        return;
                                    }
                                } else if (z8) {
                                    f4 = 1.0f;
                                }
                                f4 = 0.0f;
                            }
                            lp2Var3.p(false);
                            Float fValueOf4 = Float.valueOf(f4);
                            wd8VarF = ce8VarO.f();
                            lp2Var3.W(-984009111);
                            if (wd8VarF.b(ae3Var7, ae3Var6) && (wd8VarF.b(ae3Var6, ae3Var7) || wd8VarF.b(ae3Var5, ae3Var6))) {
                                ta2Var = ta2VarQ1;
                            } else {
                                ta2Var = ta2VarQ0;
                            }
                            lp2Var3.p(false);
                            yd8VarH2 = rq7.h(ce8VarO, fValueOf3, fValueOf4, ta2Var, ug8Var, lp2Var3, 196608);
                            ae3 ae3Var12 = (ae3) ce8VarO.c();
                            lp2Var3.W(-1258455321);
                            iOrdinal4 = ae3Var12.ordinal();
                            if (iOrdinal4 == 0) {
                                f5 = 1.0f;
                            } else {
                                if (iOrdinal4 != 1) {
                                    if (iOrdinal4 != 2) {
                                        b61.c();
                                        return;
                                    }
                                } else if (z8) {
                                    f5 = 0.0f;
                                }
                                f5 = 1.0f;
                            }
                            lp2Var3.p(false);
                            Float fValueOf5 = Float.valueOf(f5);
                            ae3 ae3Var13 = (ae3) rh5Var.getValue();
                            lp2Var3.W(-1258455321);
                            iOrdinal5 = ae3Var13.ordinal();
                            if (iOrdinal5 == 0) {
                                f6 = 1.0f;
                            } else {
                                if (iOrdinal5 != 1) {
                                    if (iOrdinal5 != 2) {
                                        b61.c();
                                        return;
                                    }
                                } else if (!z8) {
                                }
                                f6 = 1.0f;
                            }
                            lp2Var3.p(false);
                            Float fValueOf6 = Float.valueOf(f6);
                            ce8VarO.f();
                            lp2Var3.W(2126293195);
                            lp2Var3.p(false);
                            yd8VarH3 = rq7.h(ce8VarO, fValueOf5, fValueOf6, ta2VarQ0, ug8Var, lp2Var3, 196608);
                            wf7 wf7VarQ1 = w39.q0(ly4Var, lp2Var3);
                            ae3Var2 = (ae3) rh5Var.getValue();
                            lp2Var3.W(-12973394);
                            iArr = n58.a;
                            if (iArr[ae3Var2.ordinal()] == 1) {
                                j2 = j9;
                            } else {
                                j2 = j10;
                            }
                            lp2Var3.p(false);
                            lw0VarE = dw0.e(j2);
                            zF = lp2Var3.f(lw0VarE);
                            objK = lp2Var3.K();
                            obj = zz0.a;
                            if (zF || objK == obj) {
                                objK = new ug8(tiVar, new wi(lw0VarE, (byte) 2));
                                lp2Var3.g0(objK);
                            }
                            ug8 ug8Var2 = (ug8) objK;
                            ae3Var3 = (ae3) ce8VarO.c();
                            lp2Var3.W(-12973394);
                            if (iArr[ae3Var3.ordinal()] == 1) {
                                j3 = j9;
                            } else {
                                j3 = j10;
                            }
                            lp2Var3.p(false);
                            dw0 dw0Var = new dw0(j3);
                            ae3Var4 = (ae3) rh5Var.getValue();
                            lp2Var3.W(-12973394);
                            if (iArr[ae3Var4.ordinal()] == 1) {
                                j4 = j9;
                            } else {
                                j4 = j10;
                            }
                            lp2Var3.p(false);
                            dw0 dw0Var2 = new dw0(j4);
                            ce8VarO.f();
                            lp2Var3.W(1954111929);
                            lp2Var3.p(false);
                            yd8VarH4 = rq7.h(ce8VarO, dw0Var, dw0Var2, wf7VarQ1, ug8Var2, lp2Var3, 196608);
                            lp2Var3.W(-464752477);
                            lp2Var3.p(false);
                            lw0VarE2 = dw0.e(j);
                            zF2 = lp2Var3.f(lw0VarE2);
                            objK2 = lp2Var3.K();
                            if (zF2 || objK2 == obj) {
                                objK2 = new ug8(tiVar, new wi(lw0VarE2, (byte) 2));
                                lp2Var3.g0(objK2);
                            }
                            lp2Var3.W(-464752477);
                            lp2Var3.p(false);
                            dw0 dw0Var3 = new dw0(j);
                            lp2Var3.W(-464752477);
                            lp2Var3.p(false);
                            dw0 dw0Var4 = new dw0(j);
                            ce8VarO.f();
                            lp2Var3.W(1190923886);
                            lp2Var3.p(false);
                            yd8VarH5 = rq7.h(ce8VarO, dw0Var3, dw0Var4, wf7VarQ1, (ug8) objK2, lp2Var3, 196608);
                            objK3 = lp2Var3.K();
                            if (objK3 == obj) {
                                objK3 = new m58();
                                lp2Var3.g0(objK3);
                            }
                            m58Var = (m58) objK3;
                            if (sn2Var == null) {
                                lp2Var3.W(-1891724857);
                                lp2Var3.p(false);
                                rn2Var4 = null;
                                o88Var2 = o88Var;
                            } else {
                                lp2Var3.W(-1891724856);
                                o88Var2 = o88Var;
                                rn2 rn2VarU = jm4.U(-1076580032, new yw4(o88Var3, o88Var2, yd8VarH, yd8VarH5, z7, yd8VarH4, sn2Var, m58Var), lp2Var3);
                                lp2Var3.p(false);
                                rn2Var4 = rn2VarU;
                            }
                            if (!z2) {
                                j5 = i48Var.D;
                            } else if (z3) {
                                j5 = i48Var.E;
                            } else if (zBooleanValue) {
                                j5 = i48Var.B;
                            } else {
                                j5 = i48Var.C;
                            }
                            objK4 = lp2Var3.K();
                            if (objK4 == obj) {
                                final byte b = 1;
                                dn2 dn2Var = new dn2() { // from class: cy2
                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                    public final Object invoke() {
                                        byte b2 = b;
                                        lh7 lh7Var = yd8VarH2;
                                        switch (b2) {
                                            case 0:
                                                return Float.valueOf(((Number) lh7Var.getValue()).floatValue());
                                            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                                                return Boolean.valueOf(((Number) lh7Var.getValue()).floatValue() > 0.0f);
                                            default:
                                                return Boolean.valueOf(((Number) lh7Var.getValue()).floatValue() > 0.0f);
                                        }
                                    }
                                };
                                f63 f63Var = rd7.a;
                                zi1 zi1Var = new zi1(dn2Var, qe4Var);
                                lp2Var3.g0(zi1Var);
                                objK4 = zi1Var;
                            }
                            lh7 lh7Var = (lh7) objK4;
                            if (rn2Var == null && charSequence.length() == 0 && ((Boolean) lh7Var.getValue()).booleanValue()) {
                                lp2Var3.W(-1890614312);
                                lp2Var2 = lp2Var;
                                zy0 zy0VarU = jm4.U(1405547205, new j58(yd8VarH2, j5, o88Var3, rn2Var), lp2Var2);
                                lp2Var2.p(false);
                                zy0Var3 = zy0VarU;
                            } else {
                                lp2Var2 = lp2Var3;
                                lp2Var2.W(-1890217110);
                                lp2Var2.p(false);
                                zy0Var3 = null;
                            }
                            objK5 = lp2Var2.K();
                            if (objK5 == obj) {
                                final byte b2 = 2;
                                dn2 dn2Var2 = new dn2() { // from class: cy2
                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                    public final Object invoke() {
                                        byte b3 = b2;
                                        lh7 lh7Var2 = yd8VarH3;
                                        switch (b3) {
                                            case 0:
                                                return Float.valueOf(((Number) lh7Var2.getValue()).floatValue());
                                            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                                                return Boolean.valueOf(((Number) lh7Var2.getValue()).floatValue() > 0.0f);
                                            default:
                                                return Boolean.valueOf(((Number) lh7Var2.getValue()).floatValue() > 0.0f);
                                        }
                                    }
                                };
                                f63 f63Var2 = rd7.a;
                                zi1 zi1Var2 = new zi1(dn2Var2, qe4Var);
                                lp2Var2.g0(zi1Var2);
                                objK5 = zi1Var2;
                            }
                            lp2Var2.W(-1889500886);
                            lp2Var2.p(false);
                            lp2Var2.W(-1888924534);
                            lp2Var2.p(false);
                            lp2Var2.W(-1888749663);
                            lp2Var2.p(false);
                            if (!z2) {
                                j6 = i48Var.v;
                            } else if (z3) {
                                j6 = ((i48) r4).w;
                            } else if (zBooleanValue) {
                                j6 = ((i48) r4).t;
                            } else {
                                j6 = ((i48) r4).u;
                            }
                            if (rn2Var2 == null) {
                                lp2Var2.W(-1888469888);
                                lp2Var2.p(false);
                                rn2Var5 = null;
                            } else {
                                lp2Var2.W(-1888469887);
                                rn2 rn2VarU2 = jm4.U(1334518521, new l58(j6, rn2Var2), lp2Var2);
                                lp2Var2.p(false);
                                rn2Var5 = rn2VarU2;
                            }
                            if (!z2) {
                                j7 = ((i48) r4).H;
                            } else if (z3) {
                                j7 = ((i48) r4).I;
                            } else if (zBooleanValue) {
                                j7 = ((i48) r4).F;
                            } else {
                                j7 = ((i48) r4).G;
                            }
                            if (rn2Var3 == 0) {
                                lp2Var2.W(-1888176380);
                                z4 = false;
                                lp2Var2.p(false);
                                rn2Var6 = null;
                            } else {
                                z4 = false;
                                lp2Var2.W(-1888176379);
                                rn2 rn2VarU3 = jm4.U(837168720, new k58(j7, o88Var2, rn2Var3), lp2Var2);
                                lp2Var2.p(false);
                                rn2Var6 = rn2VarU3;
                            }
                            iOrdinal6 = d78Var.ordinal();
                            if (iOrdinal6 != 0) {
                                lp2Var2.W(-1887830698);
                                rq7.b(zy0Var, rn2Var4, zy0Var3, null, rn2Var5, null, null, z, q58Var, new o58(new a74(yd8VarH, lh7.class, "value", "getValue()Ljava/lang/Object;", 0, (byte) 4)), jm4.U(-1729858187, new l8(zy0Var2, (byte) 3), lp2Var2), rn2Var6, gg5Var, lp2Var, ((r22 >> 3) & 112) | 6 | ((i4 << 21) & 234881024) | ((r22 << 18) & 1879048192), ((i4 >> 6) & 7168) | 48);
                                lp2Var3 = lp2Var;
                                lp2Var3.p(false);
                            } else {
                                if (iOrdinal6 == 1) {
                                    lp2Var2.W(493292232);
                                    lp2Var2.p(z4);
                                    b61.c();
                                    return;
                                }
                                lp2Var2.W(-1886778186);
                                objK6 = lp2Var2.K();
                                if (objK6 == obj) {
                                    objK6 = z51.H(new ua7(0L));
                                    lp2Var2.g0(objK6);
                                }
                                y05Var = (y05) objK6;
                                z5 = z4;
                                zy0 zy0VarU2 = jm4.U(528115858, new x51(y05Var, q58Var, gg5Var, zy0Var2, (byte) 1), lp2Var2);
                                rn2 rn2Var7 = rn2Var4;
                                o58 o58Var = new o58(new a74(yd8VarH, lh7.class, "value", "getValue()Ljava/lang/Object;", 0, (byte) 5));
                                if ((r22 & 7168) == 2048) {
                                    z6 = true;
                                } else {
                                    z6 = z5;
                                }
                                zF3 = lp2Var2.f(yd8VarH) | z6;
                                objK7 = lp2Var2.K();
                                if (zF3 || objK7 == obj) {
                                    objK7 = new gq6(q58Var, yd8VarH, y05Var, (byte) 13);
                                    lp2Var2.g0(objK7);
                                }
                                lp2 lp2Var4 = lp2Var2;
                                wl7.h(zy0Var, zy0Var3, rn2Var7, null, rn2Var5, null, null, z, q58Var, o58Var, (gn2) objK7, zy0VarU2, rn2Var6, gg5Var, lp2Var4, ((r22 >> 3) & 112) | 6 | ((i4 << 21) & 234881024) | ((i3 << 18) & 1879048192), (57344 & (i4 >> 3)) | 384);
                                lp2Var3 = lp2Var4;
                                lp2Var3.p(false);
                            }
                        } else if (iOrdinal != 2) {
                            b61.c();
                            return;
                        }
                    } else {
                        o88Var = o88Var4;
                    }
                    f2 = 1.0f;
                    lp2Var3.p(false);
                    Float fValueOf7 = Float.valueOf(f2);
                    ce8VarO.f();
                    lp2Var3.W(-709912974);
                    lp2Var3.p(false);
                    yd8VarH = rq7.h(ce8VarO, fValueOf, fValueOf7, wf7VarQ0, ug8Var, lp2Var3, 196608);
                    ly4 ly4Var2 = ly4.f0;
                    ta2VarQ0 = w39.q0(ly4Var2, lp2Var3);
                    ta2VarQ1 = w39.q0(ly4.g0, lp2Var3);
                    ae3 ae3Var14 = (ae3) ce8VarO.c();
                    lp2Var3.W(-1093194547);
                    iOrdinal2 = ae3Var14.ordinal();
                    if (iOrdinal2 == 0) {
                        f3 = 1.0f;
                    } else {
                        if (iOrdinal2 != 1) {
                            if (iOrdinal2 != 2) {
                                b61.c();
                                return;
                            }
                        } else if (z8) {
                            f3 = 1.0f;
                        }
                        f3 = 0.0f;
                    }
                    lp2Var3.p(false);
                    Float fValueOf8 = Float.valueOf(f3);
                    ae3 ae3Var15 = (ae3) rh5Var.getValue();
                    lp2Var3.W(-1093194547);
                    iOrdinal3 = ae3Var15.ordinal();
                    if (iOrdinal3 == 0) {
                        f4 = 1.0f;
                    } else {
                        if (iOrdinal3 != 1) {
                            if (iOrdinal3 != 2) {
                                b61.c();
                                return;
                            }
                        } else if (z8) {
                            f4 = 1.0f;
                        }
                        f4 = 0.0f;
                    }
                    lp2Var3.p(false);
                    Float fValueOf9 = Float.valueOf(f4);
                    wd8VarF = ce8VarO.f();
                    lp2Var3.W(-984009111);
                    if (wd8VarF.b(ae3Var7, ae3Var6)) {
                        ta2Var = ta2VarQ0;
                    } else {
                        ta2Var = ta2VarQ1;
                    }
                    lp2Var3.p(false);
                    yd8VarH2 = rq7.h(ce8VarO, fValueOf8, fValueOf9, ta2Var, ug8Var, lp2Var3, 196608);
                    ae3 ae3Var16 = (ae3) ce8VarO.c();
                    lp2Var3.W(-1258455321);
                    iOrdinal4 = ae3Var16.ordinal();
                    if (iOrdinal4 == 0) {
                        f5 = 1.0f;
                    } else {
                        if (iOrdinal4 != 1) {
                            if (iOrdinal4 != 2) {
                                b61.c();
                                return;
                            }
                        } else if (z8) {
                            f5 = 0.0f;
                        }
                        f5 = 1.0f;
                    }
                    lp2Var3.p(false);
                    Float fValueOf10 = Float.valueOf(f5);
                    ae3 ae3Var17 = (ae3) rh5Var.getValue();
                    lp2Var3.W(-1258455321);
                    iOrdinal5 = ae3Var17.ordinal();
                    if (iOrdinal5 == 0) {
                        f6 = 1.0f;
                    } else {
                        if (iOrdinal5 != 1) {
                            if (iOrdinal5 != 2) {
                                b61.c();
                                return;
                            }
                        } else if (!z8) {
                        }
                        f6 = 1.0f;
                    }
                    lp2Var3.p(false);
                    Float fValueOf11 = Float.valueOf(f6);
                    ce8VarO.f();
                    lp2Var3.W(2126293195);
                    lp2Var3.p(false);
                    yd8VarH3 = rq7.h(ce8VarO, fValueOf10, fValueOf11, ta2VarQ0, ug8Var, lp2Var3, 196608);
                    wf7 wf7VarQ2 = w39.q0(ly4Var2, lp2Var3);
                    ae3Var2 = (ae3) rh5Var.getValue();
                    lp2Var3.W(-12973394);
                    iArr = n58.a;
                    if (iArr[ae3Var2.ordinal()] == 1) {
                        j2 = j9;
                    } else {
                        j2 = j10;
                    }
                    lp2Var3.p(false);
                    lw0VarE = dw0.e(j2);
                    zF = lp2Var3.f(lw0VarE);
                    objK = lp2Var3.K();
                    obj = zz0.a;
                    if (zF) {
                        objK = new ug8(tiVar, new wi(lw0VarE, (byte) 2));
                        lp2Var3.g0(objK);
                    } else {
                        objK = new ug8(tiVar, new wi(lw0VarE, (byte) 2));
                        lp2Var3.g0(objK);
                    }
                    ug8 ug8Var3 = (ug8) objK;
                    ae3Var3 = (ae3) ce8VarO.c();
                    lp2Var3.W(-12973394);
                    if (iArr[ae3Var3.ordinal()] == 1) {
                        j3 = j9;
                    } else {
                        j3 = j10;
                    }
                    lp2Var3.p(false);
                    dw0 dw0Var5 = new dw0(j3);
                    ae3Var4 = (ae3) rh5Var.getValue();
                    lp2Var3.W(-12973394);
                    if (iArr[ae3Var4.ordinal()] == 1) {
                        j4 = j9;
                    } else {
                        j4 = j10;
                    }
                    lp2Var3.p(false);
                    dw0 dw0Var6 = new dw0(j4);
                    ce8VarO.f();
                    lp2Var3.W(1954111929);
                    lp2Var3.p(false);
                    yd8VarH4 = rq7.h(ce8VarO, dw0Var5, dw0Var6, wf7VarQ2, ug8Var3, lp2Var3, 196608);
                    lp2Var3.W(-464752477);
                    lp2Var3.p(false);
                    lw0VarE2 = dw0.e(j);
                    zF2 = lp2Var3.f(lw0VarE2);
                    objK2 = lp2Var3.K();
                    if (zF2) {
                        objK2 = new ug8(tiVar, new wi(lw0VarE2, (byte) 2));
                        lp2Var3.g0(objK2);
                    } else {
                        objK2 = new ug8(tiVar, new wi(lw0VarE2, (byte) 2));
                        lp2Var3.g0(objK2);
                    }
                    lp2Var3.W(-464752477);
                    lp2Var3.p(false);
                    dw0 dw0Var7 = new dw0(j);
                    lp2Var3.W(-464752477);
                    lp2Var3.p(false);
                    dw0 dw0Var8 = new dw0(j);
                    ce8VarO.f();
                    lp2Var3.W(1190923886);
                    lp2Var3.p(false);
                    yd8VarH5 = rq7.h(ce8VarO, dw0Var7, dw0Var8, wf7VarQ2, (ug8) objK2, lp2Var3, 196608);
                    objK3 = lp2Var3.K();
                    if (objK3 == obj) {
                        objK3 = new m58();
                        lp2Var3.g0(objK3);
                    }
                    m58Var = (m58) objK3;
                    if (sn2Var == null) {
                        lp2Var3.W(-1891724857);
                        lp2Var3.p(false);
                        rn2Var4 = null;
                        o88Var2 = o88Var;
                    } else {
                        lp2Var3.W(-1891724856);
                        o88Var2 = o88Var;
                        rn2 rn2VarU4 = jm4.U(-1076580032, new yw4(o88Var3, o88Var2, yd8VarH, yd8VarH5, z7, yd8VarH4, sn2Var, m58Var), lp2Var3);
                        lp2Var3.p(false);
                        rn2Var4 = rn2VarU4;
                    }
                    if (!z2) {
                        j5 = i48Var.D;
                    } else if (z3) {
                        j5 = i48Var.E;
                    } else if (zBooleanValue) {
                        j5 = i48Var.B;
                    } else {
                        j5 = i48Var.C;
                    }
                    objK4 = lp2Var3.K();
                    if (objK4 == obj) {
                        final byte b3 = 1;
                        dn2 dn2Var3 = new dn2() { // from class: cy2
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                            public final Object invoke() {
                                byte b4 = b3;
                                lh7 lh7Var2 = yd8VarH2;
                                switch (b4) {
                                    case 0:
                                        return Float.valueOf(((Number) lh7Var2.getValue()).floatValue());
                                    case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                                        return Boolean.valueOf(((Number) lh7Var2.getValue()).floatValue() > 0.0f);
                                    default:
                                        return Boolean.valueOf(((Number) lh7Var2.getValue()).floatValue() > 0.0f);
                                }
                            }
                        };
                        f63 f63Var3 = rd7.a;
                        zi1 zi1Var3 = new zi1(dn2Var3, qe4Var);
                        lp2Var3.g0(zi1Var3);
                        objK4 = zi1Var3;
                    }
                    lh7 lh7Var2 = (lh7) objK4;
                    if (rn2Var == null) {
                        lp2Var2 = lp2Var3;
                        lp2Var2.W(-1890217110);
                        lp2Var2.p(false);
                        zy0Var3 = null;
                    } else {
                        lp2Var2 = lp2Var3;
                        lp2Var2.W(-1890217110);
                        lp2Var2.p(false);
                        zy0Var3 = null;
                    }
                    objK5 = lp2Var2.K();
                    if (objK5 == obj) {
                        final byte b4 = 2;
                        dn2 dn2Var4 = new dn2() { // from class: cy2
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                            public final Object invoke() {
                                byte b5 = b4;
                                lh7 lh7Var3 = yd8VarH3;
                                switch (b5) {
                                    case 0:
                                        return Float.valueOf(((Number) lh7Var3.getValue()).floatValue());
                                    case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                                        return Boolean.valueOf(((Number) lh7Var3.getValue()).floatValue() > 0.0f);
                                    default:
                                        return Boolean.valueOf(((Number) lh7Var3.getValue()).floatValue() > 0.0f);
                                }
                            }
                        };
                        f63 f63Var4 = rd7.a;
                        zi1 zi1Var4 = new zi1(dn2Var4, qe4Var);
                        lp2Var2.g0(zi1Var4);
                        objK5 = zi1Var4;
                    }
                    lp2Var2.W(-1889500886);
                    lp2Var2.p(false);
                    lp2Var2.W(-1888924534);
                    lp2Var2.p(false);
                    lp2Var2.W(-1888749663);
                    lp2Var2.p(false);
                    if (!z2) {
                        j6 = i48Var.v;
                    } else if (z3) {
                        j6 = ((i48) r4).w;
                    } else if (zBooleanValue) {
                        j6 = ((i48) r4).t;
                    } else {
                        j6 = ((i48) r4).u;
                    }
                    if (rn2Var2 == null) {
                        lp2Var2.W(-1888469888);
                        lp2Var2.p(false);
                        rn2Var5 = null;
                    } else {
                        lp2Var2.W(-1888469887);
                        rn2 rn2VarU5 = jm4.U(1334518521, new l58(j6, rn2Var2), lp2Var2);
                        lp2Var2.p(false);
                        rn2Var5 = rn2VarU5;
                    }
                    if (!z2) {
                        j7 = ((i48) r4).H;
                    } else if (z3) {
                        j7 = ((i48) r4).I;
                    } else if (zBooleanValue) {
                        j7 = ((i48) r4).F;
                    } else {
                        j7 = ((i48) r4).G;
                    }
                    if (rn2Var3 == 0) {
                        lp2Var2.W(-1888176380);
                        z4 = false;
                        lp2Var2.p(false);
                        rn2Var6 = null;
                    } else {
                        z4 = false;
                        lp2Var2.W(-1888176379);
                        rn2 rn2VarU6 = jm4.U(837168720, new k58(j7, o88Var2, rn2Var3), lp2Var2);
                        lp2Var2.p(false);
                        rn2Var6 = rn2VarU6;
                    }
                    iOrdinal6 = d78Var.ordinal();
                    if (iOrdinal6 != 0) {
                        lp2Var2.W(-1887830698);
                        rq7.b(zy0Var, rn2Var4, zy0Var3, null, rn2Var5, null, null, z, q58Var, new o58(new a74(yd8VarH, lh7.class, "value", "getValue()Ljava/lang/Object;", 0, (byte) 4)), jm4.U(-1729858187, new l8(zy0Var2, (byte) 3), lp2Var2), rn2Var6, gg5Var, lp2Var, ((r22 >> 3) & 112) | 6 | ((i4 << 21) & 234881024) | ((r22 << 18) & 1879048192), ((i4 >> 6) & 7168) | 48);
                        lp2Var3 = lp2Var;
                        lp2Var3.p(false);
                    } else {
                        if (iOrdinal6 == 1) {
                            lp2Var2.W(493292232);
                            lp2Var2.p(z4);
                            b61.c();
                            return;
                        }
                        lp2Var2.W(-1886778186);
                        objK6 = lp2Var2.K();
                        if (objK6 == obj) {
                            objK6 = z51.H(new ua7(0L));
                            lp2Var2.g0(objK6);
                        }
                        y05Var = (y05) objK6;
                        z5 = z4;
                        zy0 zy0VarU3 = jm4.U(528115858, new x51(y05Var, q58Var, gg5Var, zy0Var2, (byte) 1), lp2Var2);
                        rn2 rn2Var8 = rn2Var4;
                        o58 o58Var2 = new o58(new a74(yd8VarH, lh7.class, "value", "getValue()Ljava/lang/Object;", 0, (byte) 5));
                        if ((r22 & 7168) == 2048) {
                            z6 = true;
                        } else {
                            z6 = z5;
                        }
                        zF3 = lp2Var2.f(yd8VarH) | z6;
                        objK7 = lp2Var2.K();
                        if (zF3) {
                            objK7 = new gq6(q58Var, yd8VarH, y05Var, (byte) 13);
                            lp2Var2.g0(objK7);
                        } else {
                            objK7 = new gq6(q58Var, yd8VarH, y05Var, (byte) 13);
                            lp2Var2.g0(objK7);
                        }
                        lp2 lp2Var5 = lp2Var2;
                        wl7.h(zy0Var, zy0Var3, rn2Var8, null, rn2Var5, null, null, z, q58Var, o58Var2, (gn2) objK7, zy0VarU3, rn2Var6, gg5Var, lp2Var5, ((r22 >> 3) & 112) | 6 | ((i4 << 21) & 234881024) | ((i3 << 18) & 1879048192), (57344 & (i4 >> 3)) | 384);
                        lp2Var3 = lp2Var5;
                        lp2Var3.p(false);
                    }
                } else if (iOrdinal7 != 2) {
                    b61.c();
                    return;
                }
            } else {
                rh5Var = rh5Var2;
            }
            f = 1.0f;
            lp2Var3.p(false);
            Float fValueOf12 = Float.valueOf(f);
            ae3 ae3Var18 = (ae3) rh5Var.getValue();
            lp2Var3.W(-1436405362);
            iOrdinal = ae3Var18.ordinal();
            if (iOrdinal != 0) {
                o88Var = o88Var4;
                if (iOrdinal != 1) {
                    if (z8) {
                        f2 = 0.0f;
                    }
                    lp2Var3.p(false);
                    Float fValueOf13 = Float.valueOf(f2);
                    ce8VarO.f();
                    lp2Var3.W(-709912974);
                    lp2Var3.p(false);
                    yd8VarH = rq7.h(ce8VarO, fValueOf12, fValueOf13, wf7VarQ0, ug8Var, lp2Var3, 196608);
                    ly4 ly4Var3 = ly4.f0;
                    ta2VarQ0 = w39.q0(ly4Var3, lp2Var3);
                    ta2VarQ1 = w39.q0(ly4.g0, lp2Var3);
                    ae3 ae3Var19 = (ae3) ce8VarO.c();
                    lp2Var3.W(-1093194547);
                    iOrdinal2 = ae3Var19.ordinal();
                    if (iOrdinal2 == 0) {
                        f3 = 1.0f;
                    } else {
                        if (iOrdinal2 != 1) {
                            if (iOrdinal2 != 2) {
                                b61.c();
                                return;
                            }
                        } else if (z8) {
                            f3 = 1.0f;
                        }
                        f3 = 0.0f;
                    }
                    lp2Var3.p(false);
                    Float fValueOf14 = Float.valueOf(f3);
                    ae3 ae3Var110 = (ae3) rh5Var.getValue();
                    lp2Var3.W(-1093194547);
                    iOrdinal3 = ae3Var110.ordinal();
                    if (iOrdinal3 == 0) {
                        f4 = 1.0f;
                    } else {
                        if (iOrdinal3 != 1) {
                            if (iOrdinal3 != 2) {
                                b61.c();
                                return;
                            }
                        } else if (z8) {
                            f4 = 1.0f;
                        }
                        f4 = 0.0f;
                    }
                    lp2Var3.p(false);
                    Float fValueOf15 = Float.valueOf(f4);
                    wd8VarF = ce8VarO.f();
                    lp2Var3.W(-984009111);
                    if (wd8VarF.b(ae3Var7, ae3Var6)) {
                        ta2Var = ta2VarQ0;
                    } else {
                        ta2Var = ta2VarQ1;
                    }
                    lp2Var3.p(false);
                    yd8VarH2 = rq7.h(ce8VarO, fValueOf14, fValueOf15, ta2Var, ug8Var, lp2Var3, 196608);
                    ae3 ae3Var111 = (ae3) ce8VarO.c();
                    lp2Var3.W(-1258455321);
                    iOrdinal4 = ae3Var111.ordinal();
                    if (iOrdinal4 == 0) {
                        f5 = 1.0f;
                    } else {
                        if (iOrdinal4 != 1) {
                            if (iOrdinal4 != 2) {
                                b61.c();
                                return;
                            }
                        } else if (z8) {
                            f5 = 0.0f;
                        }
                        f5 = 1.0f;
                    }
                    lp2Var3.p(false);
                    Float fValueOf16 = Float.valueOf(f5);
                    ae3 ae3Var112 = (ae3) rh5Var.getValue();
                    lp2Var3.W(-1258455321);
                    iOrdinal5 = ae3Var112.ordinal();
                    if (iOrdinal5 == 0) {
                        f6 = 1.0f;
                    } else {
                        if (iOrdinal5 != 1) {
                            if (iOrdinal5 != 2) {
                                b61.c();
                                return;
                            }
                        } else if (!z8) {
                        }
                        f6 = 1.0f;
                    }
                    lp2Var3.p(false);
                    Float fValueOf17 = Float.valueOf(f6);
                    ce8VarO.f();
                    lp2Var3.W(2126293195);
                    lp2Var3.p(false);
                    yd8VarH3 = rq7.h(ce8VarO, fValueOf16, fValueOf17, ta2VarQ0, ug8Var, lp2Var3, 196608);
                    wf7 wf7VarQ3 = w39.q0(ly4Var3, lp2Var3);
                    ae3Var2 = (ae3) rh5Var.getValue();
                    lp2Var3.W(-12973394);
                    iArr = n58.a;
                    if (iArr[ae3Var2.ordinal()] == 1) {
                        j2 = j9;
                    } else {
                        j2 = j10;
                    }
                    lp2Var3.p(false);
                    lw0VarE = dw0.e(j2);
                    zF = lp2Var3.f(lw0VarE);
                    objK = lp2Var3.K();
                    obj = zz0.a;
                    if (zF) {
                        objK = new ug8(tiVar, new wi(lw0VarE, (byte) 2));
                        lp2Var3.g0(objK);
                    } else {
                        objK = new ug8(tiVar, new wi(lw0VarE, (byte) 2));
                        lp2Var3.g0(objK);
                    }
                    ug8 ug8Var4 = (ug8) objK;
                    ae3Var3 = (ae3) ce8VarO.c();
                    lp2Var3.W(-12973394);
                    if (iArr[ae3Var3.ordinal()] == 1) {
                        j3 = j9;
                    } else {
                        j3 = j10;
                    }
                    lp2Var3.p(false);
                    dw0 dw0Var9 = new dw0(j3);
                    ae3Var4 = (ae3) rh5Var.getValue();
                    lp2Var3.W(-12973394);
                    if (iArr[ae3Var4.ordinal()] == 1) {
                        j4 = j9;
                    } else {
                        j4 = j10;
                    }
                    lp2Var3.p(false);
                    dw0 dw0Var10 = new dw0(j4);
                    ce8VarO.f();
                    lp2Var3.W(1954111929);
                    lp2Var3.p(false);
                    yd8VarH4 = rq7.h(ce8VarO, dw0Var9, dw0Var10, wf7VarQ3, ug8Var4, lp2Var3, 196608);
                    lp2Var3.W(-464752477);
                    lp2Var3.p(false);
                    lw0VarE2 = dw0.e(j);
                    zF2 = lp2Var3.f(lw0VarE2);
                    objK2 = lp2Var3.K();
                    if (zF2) {
                        objK2 = new ug8(tiVar, new wi(lw0VarE2, (byte) 2));
                        lp2Var3.g0(objK2);
                    } else {
                        objK2 = new ug8(tiVar, new wi(lw0VarE2, (byte) 2));
                        lp2Var3.g0(objK2);
                    }
                    lp2Var3.W(-464752477);
                    lp2Var3.p(false);
                    dw0 dw0Var11 = new dw0(j);
                    lp2Var3.W(-464752477);
                    lp2Var3.p(false);
                    dw0 dw0Var12 = new dw0(j);
                    ce8VarO.f();
                    lp2Var3.W(1190923886);
                    lp2Var3.p(false);
                    yd8VarH5 = rq7.h(ce8VarO, dw0Var11, dw0Var12, wf7VarQ3, (ug8) objK2, lp2Var3, 196608);
                    objK3 = lp2Var3.K();
                    if (objK3 == obj) {
                        objK3 = new m58();
                        lp2Var3.g0(objK3);
                    }
                    m58Var = (m58) objK3;
                    if (sn2Var == null) {
                        lp2Var3.W(-1891724857);
                        lp2Var3.p(false);
                        rn2Var4 = null;
                        o88Var2 = o88Var;
                    } else {
                        lp2Var3.W(-1891724856);
                        o88Var2 = o88Var;
                        rn2 rn2VarU7 = jm4.U(-1076580032, new yw4(o88Var3, o88Var2, yd8VarH, yd8VarH5, z7, yd8VarH4, sn2Var, m58Var), lp2Var3);
                        lp2Var3.p(false);
                        rn2Var4 = rn2VarU7;
                    }
                    if (!z2) {
                        j5 = i48Var.D;
                    } else if (z3) {
                        j5 = i48Var.E;
                    } else if (zBooleanValue) {
                        j5 = i48Var.B;
                    } else {
                        j5 = i48Var.C;
                    }
                    objK4 = lp2Var3.K();
                    if (objK4 == obj) {
                        final byte b5 = 1;
                        dn2 dn2Var5 = new dn2() { // from class: cy2
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                            public final Object invoke() {
                                byte b6 = b5;
                                lh7 lh7Var3 = yd8VarH2;
                                switch (b6) {
                                    case 0:
                                        return Float.valueOf(((Number) lh7Var3.getValue()).floatValue());
                                    case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                                        return Boolean.valueOf(((Number) lh7Var3.getValue()).floatValue() > 0.0f);
                                    default:
                                        return Boolean.valueOf(((Number) lh7Var3.getValue()).floatValue() > 0.0f);
                                }
                            }
                        };
                        f63 f63Var5 = rd7.a;
                        zi1 zi1Var5 = new zi1(dn2Var5, qe4Var);
                        lp2Var3.g0(zi1Var5);
                        objK4 = zi1Var5;
                    }
                    lh7 lh7Var3 = (lh7) objK4;
                    if (rn2Var == null) {
                        lp2Var2 = lp2Var3;
                        lp2Var2.W(-1890217110);
                        lp2Var2.p(false);
                        zy0Var3 = null;
                    } else {
                        lp2Var2 = lp2Var3;
                        lp2Var2.W(-1890217110);
                        lp2Var2.p(false);
                        zy0Var3 = null;
                    }
                    objK5 = lp2Var2.K();
                    if (objK5 == obj) {
                        final byte b6 = 2;
                        dn2 dn2Var6 = new dn2() { // from class: cy2
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                            public final Object invoke() {
                                byte b7 = b6;
                                lh7 lh7Var4 = yd8VarH3;
                                switch (b7) {
                                    case 0:
                                        return Float.valueOf(((Number) lh7Var4.getValue()).floatValue());
                                    case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                                        return Boolean.valueOf(((Number) lh7Var4.getValue()).floatValue() > 0.0f);
                                    default:
                                        return Boolean.valueOf(((Number) lh7Var4.getValue()).floatValue() > 0.0f);
                                }
                            }
                        };
                        f63 f63Var6 = rd7.a;
                        zi1 zi1Var6 = new zi1(dn2Var6, qe4Var);
                        lp2Var2.g0(zi1Var6);
                        objK5 = zi1Var6;
                    }
                    lp2Var2.W(-1889500886);
                    lp2Var2.p(false);
                    lp2Var2.W(-1888924534);
                    lp2Var2.p(false);
                    lp2Var2.W(-1888749663);
                    lp2Var2.p(false);
                    if (!z2) {
                        j6 = i48Var.v;
                    } else if (z3) {
                        j6 = ((i48) r4).w;
                    } else if (zBooleanValue) {
                        j6 = ((i48) r4).t;
                    } else {
                        j6 = ((i48) r4).u;
                    }
                    if (rn2Var2 == null) {
                        lp2Var2.W(-1888469888);
                        lp2Var2.p(false);
                        rn2Var5 = null;
                    } else {
                        lp2Var2.W(-1888469887);
                        rn2 rn2VarU8 = jm4.U(1334518521, new l58(j6, rn2Var2), lp2Var2);
                        lp2Var2.p(false);
                        rn2Var5 = rn2VarU8;
                    }
                    if (!z2) {
                        j7 = ((i48) r4).H;
                    } else if (z3) {
                        j7 = ((i48) r4).I;
                    } else if (zBooleanValue) {
                        j7 = ((i48) r4).F;
                    } else {
                        j7 = ((i48) r4).G;
                    }
                    if (rn2Var3 == 0) {
                        lp2Var2.W(-1888176380);
                        z4 = false;
                        lp2Var2.p(false);
                        rn2Var6 = null;
                    } else {
                        z4 = false;
                        lp2Var2.W(-1888176379);
                        rn2 rn2VarU9 = jm4.U(837168720, new k58(j7, o88Var2, rn2Var3), lp2Var2);
                        lp2Var2.p(false);
                        rn2Var6 = rn2VarU9;
                    }
                    iOrdinal6 = d78Var.ordinal();
                    if (iOrdinal6 != 0) {
                        lp2Var2.W(-1887830698);
                        rq7.b(zy0Var, rn2Var4, zy0Var3, null, rn2Var5, null, null, z, q58Var, new o58(new a74(yd8VarH, lh7.class, "value", "getValue()Ljava/lang/Object;", 0, (byte) 4)), jm4.U(-1729858187, new l8(zy0Var2, (byte) 3), lp2Var2), rn2Var6, gg5Var, lp2Var, ((r22 >> 3) & 112) | 6 | ((i4 << 21) & 234881024) | ((r22 << 18) & 1879048192), ((i4 >> 6) & 7168) | 48);
                        lp2Var3 = lp2Var;
                        lp2Var3.p(false);
                    } else {
                        if (iOrdinal6 == 1) {
                            lp2Var2.W(493292232);
                            lp2Var2.p(z4);
                            b61.c();
                            return;
                        }
                        lp2Var2.W(-1886778186);
                        objK6 = lp2Var2.K();
                        if (objK6 == obj) {
                            objK6 = z51.H(new ua7(0L));
                            lp2Var2.g0(objK6);
                        }
                        y05Var = (y05) objK6;
                        z5 = z4;
                        zy0 zy0VarU4 = jm4.U(528115858, new x51(y05Var, q58Var, gg5Var, zy0Var2, (byte) 1), lp2Var2);
                        rn2 rn2Var9 = rn2Var4;
                        o58 o58Var3 = new o58(new a74(yd8VarH, lh7.class, "value", "getValue()Ljava/lang/Object;", 0, (byte) 5));
                        if ((r22 & 7168) == 2048) {
                            z6 = true;
                        } else {
                            z6 = z5;
                        }
                        zF3 = lp2Var2.f(yd8VarH) | z6;
                        objK7 = lp2Var2.K();
                        if (zF3) {
                            objK7 = new gq6(q58Var, yd8VarH, y05Var, (byte) 13);
                            lp2Var2.g0(objK7);
                        } else {
                            objK7 = new gq6(q58Var, yd8VarH, y05Var, (byte) 13);
                            lp2Var2.g0(objK7);
                        }
                        lp2 lp2Var6 = lp2Var2;
                        wl7.h(zy0Var, zy0Var3, rn2Var9, null, rn2Var5, null, null, z, q58Var, o58Var3, (gn2) objK7, zy0VarU4, rn2Var6, gg5Var, lp2Var6, ((r22 >> 3) & 112) | 6 | ((i4 << 21) & 234881024) | ((i3 << 18) & 1879048192), (57344 & (i4 >> 3)) | 384);
                        lp2Var3 = lp2Var6;
                        lp2Var3.p(false);
                    }
                } else if (iOrdinal != 2) {
                    b61.c();
                    return;
                }
            } else {
                o88Var = o88Var4;
            }
            f2 = 1.0f;
            lp2Var3.p(false);
            Float fValueOf18 = Float.valueOf(f2);
            ce8VarO.f();
            lp2Var3.W(-709912974);
            lp2Var3.p(false);
            yd8VarH = rq7.h(ce8VarO, fValueOf12, fValueOf18, wf7VarQ0, ug8Var, lp2Var3, 196608);
            ly4 ly4Var4 = ly4.f0;
            ta2VarQ0 = w39.q0(ly4Var4, lp2Var3);
            ta2VarQ1 = w39.q0(ly4.g0, lp2Var3);
            ae3 ae3Var113 = (ae3) ce8VarO.c();
            lp2Var3.W(-1093194547);
            iOrdinal2 = ae3Var113.ordinal();
            if (iOrdinal2 == 0) {
                f3 = 1.0f;
            } else {
                if (iOrdinal2 != 1) {
                    if (iOrdinal2 != 2) {
                        b61.c();
                        return;
                    }
                } else if (z8) {
                    f3 = 1.0f;
                }
                f3 = 0.0f;
            }
            lp2Var3.p(false);
            Float fValueOf19 = Float.valueOf(f3);
            ae3 ae3Var114 = (ae3) rh5Var.getValue();
            lp2Var3.W(-1093194547);
            iOrdinal3 = ae3Var114.ordinal();
            if (iOrdinal3 == 0) {
                f4 = 1.0f;
            } else {
                if (iOrdinal3 != 1) {
                    if (iOrdinal3 != 2) {
                        b61.c();
                        return;
                    }
                } else if (z8) {
                    f4 = 1.0f;
                }
                f4 = 0.0f;
            }
            lp2Var3.p(false);
            Float fValueOf110 = Float.valueOf(f4);
            wd8VarF = ce8VarO.f();
            lp2Var3.W(-984009111);
            if (wd8VarF.b(ae3Var7, ae3Var6)) {
                ta2Var = ta2VarQ0;
            } else {
                ta2Var = ta2VarQ1;
            }
            lp2Var3.p(false);
            yd8VarH2 = rq7.h(ce8VarO, fValueOf19, fValueOf110, ta2Var, ug8Var, lp2Var3, 196608);
            ae3 ae3Var115 = (ae3) ce8VarO.c();
            lp2Var3.W(-1258455321);
            iOrdinal4 = ae3Var115.ordinal();
            if (iOrdinal4 == 0) {
                f5 = 1.0f;
            } else {
                if (iOrdinal4 != 1) {
                    if (iOrdinal4 != 2) {
                        b61.c();
                        return;
                    }
                } else if (z8) {
                    f5 = 0.0f;
                }
                f5 = 1.0f;
            }
            lp2Var3.p(false);
            Float fValueOf111 = Float.valueOf(f5);
            ae3 ae3Var116 = (ae3) rh5Var.getValue();
            lp2Var3.W(-1258455321);
            iOrdinal5 = ae3Var116.ordinal();
            if (iOrdinal5 == 0) {
                f6 = 1.0f;
            } else {
                if (iOrdinal5 != 1) {
                    if (iOrdinal5 != 2) {
                        b61.c();
                        return;
                    }
                } else if (!z8) {
                }
                f6 = 1.0f;
            }
            lp2Var3.p(false);
            Float fValueOf112 = Float.valueOf(f6);
            ce8VarO.f();
            lp2Var3.W(2126293195);
            lp2Var3.p(false);
            yd8VarH3 = rq7.h(ce8VarO, fValueOf111, fValueOf112, ta2VarQ0, ug8Var, lp2Var3, 196608);
            wf7 wf7VarQ4 = w39.q0(ly4Var4, lp2Var3);
            ae3Var2 = (ae3) rh5Var.getValue();
            lp2Var3.W(-12973394);
            iArr = n58.a;
            if (iArr[ae3Var2.ordinal()] == 1) {
                j2 = j9;
            } else {
                j2 = j10;
            }
            lp2Var3.p(false);
            lw0VarE = dw0.e(j2);
            zF = lp2Var3.f(lw0VarE);
            objK = lp2Var3.K();
            obj = zz0.a;
            if (zF) {
                objK = new ug8(tiVar, new wi(lw0VarE, (byte) 2));
                lp2Var3.g0(objK);
            } else {
                objK = new ug8(tiVar, new wi(lw0VarE, (byte) 2));
                lp2Var3.g0(objK);
            }
            ug8 ug8Var5 = (ug8) objK;
            ae3Var3 = (ae3) ce8VarO.c();
            lp2Var3.W(-12973394);
            if (iArr[ae3Var3.ordinal()] == 1) {
                j3 = j9;
            } else {
                j3 = j10;
            }
            lp2Var3.p(false);
            dw0 dw0Var13 = new dw0(j3);
            ae3Var4 = (ae3) rh5Var.getValue();
            lp2Var3.W(-12973394);
            if (iArr[ae3Var4.ordinal()] == 1) {
                j4 = j9;
            } else {
                j4 = j10;
            }
            lp2Var3.p(false);
            dw0 dw0Var14 = new dw0(j4);
            ce8VarO.f();
            lp2Var3.W(1954111929);
            lp2Var3.p(false);
            yd8VarH4 = rq7.h(ce8VarO, dw0Var13, dw0Var14, wf7VarQ4, ug8Var5, lp2Var3, 196608);
            lp2Var3.W(-464752477);
            lp2Var3.p(false);
            lw0VarE2 = dw0.e(j);
            zF2 = lp2Var3.f(lw0VarE2);
            objK2 = lp2Var3.K();
            if (zF2) {
                objK2 = new ug8(tiVar, new wi(lw0VarE2, (byte) 2));
                lp2Var3.g0(objK2);
            } else {
                objK2 = new ug8(tiVar, new wi(lw0VarE2, (byte) 2));
                lp2Var3.g0(objK2);
            }
            lp2Var3.W(-464752477);
            lp2Var3.p(false);
            dw0 dw0Var15 = new dw0(j);
            lp2Var3.W(-464752477);
            lp2Var3.p(false);
            dw0 dw0Var16 = new dw0(j);
            ce8VarO.f();
            lp2Var3.W(1190923886);
            lp2Var3.p(false);
            yd8VarH5 = rq7.h(ce8VarO, dw0Var15, dw0Var16, wf7VarQ4, (ug8) objK2, lp2Var3, 196608);
            objK3 = lp2Var3.K();
            if (objK3 == obj) {
                objK3 = new m58();
                lp2Var3.g0(objK3);
            }
            m58Var = (m58) objK3;
            if (sn2Var == null) {
                lp2Var3.W(-1891724857);
                lp2Var3.p(false);
                rn2Var4 = null;
                o88Var2 = o88Var;
            } else {
                lp2Var3.W(-1891724856);
                o88Var2 = o88Var;
                rn2 rn2VarU10 = jm4.U(-1076580032, new yw4(o88Var3, o88Var2, yd8VarH, yd8VarH5, z7, yd8VarH4, sn2Var, m58Var), lp2Var3);
                lp2Var3.p(false);
                rn2Var4 = rn2VarU10;
            }
            if (!z2) {
                j5 = i48Var.D;
            } else if (z3) {
                j5 = i48Var.E;
            } else if (zBooleanValue) {
                j5 = i48Var.B;
            } else {
                j5 = i48Var.C;
            }
            objK4 = lp2Var3.K();
            if (objK4 == obj) {
                final byte b7 = 1;
                dn2 dn2Var7 = new dn2() { // from class: cy2
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    public final Object invoke() {
                        byte b8 = b7;
                        lh7 lh7Var4 = yd8VarH2;
                        switch (b8) {
                            case 0:
                                return Float.valueOf(((Number) lh7Var4.getValue()).floatValue());
                            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                                return Boolean.valueOf(((Number) lh7Var4.getValue()).floatValue() > 0.0f);
                            default:
                                return Boolean.valueOf(((Number) lh7Var4.getValue()).floatValue() > 0.0f);
                        }
                    }
                };
                f63 f63Var7 = rd7.a;
                zi1 zi1Var7 = new zi1(dn2Var7, qe4Var);
                lp2Var3.g0(zi1Var7);
                objK4 = zi1Var7;
            }
            lh7 lh7Var4 = (lh7) objK4;
            if (rn2Var == null) {
                lp2Var2 = lp2Var3;
                lp2Var2.W(-1890217110);
                lp2Var2.p(false);
                zy0Var3 = null;
            } else {
                lp2Var2 = lp2Var3;
                lp2Var2.W(-1890217110);
                lp2Var2.p(false);
                zy0Var3 = null;
            }
            objK5 = lp2Var2.K();
            if (objK5 == obj) {
                final byte b8 = 2;
                dn2 dn2Var8 = new dn2() { // from class: cy2
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    public final Object invoke() {
                        byte b9 = b8;
                        lh7 lh7Var5 = yd8VarH3;
                        switch (b9) {
                            case 0:
                                return Float.valueOf(((Number) lh7Var5.getValue()).floatValue());
                            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                                return Boolean.valueOf(((Number) lh7Var5.getValue()).floatValue() > 0.0f);
                            default:
                                return Boolean.valueOf(((Number) lh7Var5.getValue()).floatValue() > 0.0f);
                        }
                    }
                };
                f63 f63Var8 = rd7.a;
                zi1 zi1Var8 = new zi1(dn2Var8, qe4Var);
                lp2Var2.g0(zi1Var8);
                objK5 = zi1Var8;
            }
            lp2Var2.W(-1889500886);
            lp2Var2.p(false);
            lp2Var2.W(-1888924534);
            lp2Var2.p(false);
            lp2Var2.W(-1888749663);
            lp2Var2.p(false);
            if (!z2) {
                j6 = i48Var.v;
            } else if (z3) {
                j6 = ((i48) r4).w;
            } else if (zBooleanValue) {
                j6 = ((i48) r4).t;
            } else {
                j6 = ((i48) r4).u;
            }
            if (rn2Var2 == null) {
                lp2Var2.W(-1888469888);
                lp2Var2.p(false);
                rn2Var5 = null;
            } else {
                lp2Var2.W(-1888469887);
                rn2 rn2VarU11 = jm4.U(1334518521, new l58(j6, rn2Var2), lp2Var2);
                lp2Var2.p(false);
                rn2Var5 = rn2VarU11;
            }
            if (!z2) {
                j7 = ((i48) r4).H;
            } else if (z3) {
                j7 = ((i48) r4).I;
            } else if (zBooleanValue) {
                j7 = ((i48) r4).F;
            } else {
                j7 = ((i48) r4).G;
            }
            if (rn2Var3 == 0) {
                lp2Var2.W(-1888176380);
                z4 = false;
                lp2Var2.p(false);
                rn2Var6 = null;
            } else {
                z4 = false;
                lp2Var2.W(-1888176379);
                rn2 rn2VarU12 = jm4.U(837168720, new k58(j7, o88Var2, rn2Var3), lp2Var2);
                lp2Var2.p(false);
                rn2Var6 = rn2VarU12;
            }
            iOrdinal6 = d78Var.ordinal();
            if (iOrdinal6 != 0) {
                lp2Var2.W(-1887830698);
                rq7.b(zy0Var, rn2Var4, zy0Var3, null, rn2Var5, null, null, z, q58Var, new o58(new a74(yd8VarH, lh7.class, "value", "getValue()Ljava/lang/Object;", 0, (byte) 4)), jm4.U(-1729858187, new l8(zy0Var2, (byte) 3), lp2Var2), rn2Var6, gg5Var, lp2Var, ((r22 >> 3) & 112) | 6 | ((i4 << 21) & 234881024) | ((r22 << 18) & 1879048192), ((i4 >> 6) & 7168) | 48);
                lp2Var3 = lp2Var;
                lp2Var3.p(false);
            } else {
                if (iOrdinal6 == 1) {
                    lp2Var2.W(493292232);
                    lp2Var2.p(z4);
                    b61.c();
                    return;
                }
                lp2Var2.W(-1886778186);
                objK6 = lp2Var2.K();
                if (objK6 == obj) {
                    objK6 = z51.H(new ua7(0L));
                    lp2Var2.g0(objK6);
                }
                y05Var = (y05) objK6;
                z5 = z4;
                zy0 zy0VarU5 = jm4.U(528115858, new x51(y05Var, q58Var, gg5Var, zy0Var2, (byte) 1), lp2Var2);
                rn2 rn2Var10 = rn2Var4;
                o58 o58Var4 = new o58(new a74(yd8VarH, lh7.class, "value", "getValue()Ljava/lang/Object;", 0, (byte) 5));
                if ((r22 & 7168) == 2048) {
                    z6 = true;
                } else {
                    z6 = z5;
                }
                zF3 = lp2Var2.f(yd8VarH) | z6;
                objK7 = lp2Var2.K();
                if (zF3) {
                    objK7 = new gq6(q58Var, yd8VarH, y05Var, (byte) 13);
                    lp2Var2.g0(objK7);
                } else {
                    objK7 = new gq6(q58Var, yd8VarH, y05Var, (byte) 13);
                    lp2Var2.g0(objK7);
                }
                lp2 lp2Var7 = lp2Var2;
                wl7.h(zy0Var, zy0Var3, rn2Var10, null, rn2Var5, null, null, z, q58Var, o58Var4, (gn2) objK7, zy0VarU5, rn2Var6, gg5Var, lp2Var7, ((r22 >> 3) & 112) | 6 | ((i4 << 21) & 234881024) | ((i3 << 18) & 1879048192), (57344 & (i4 >> 3)) | 384);
                lp2Var3 = lp2Var7;
                lp2Var3.p(false);
            }
        } else {
            lp2Var3.Q();
        }
        j86 j86VarR = lp2Var3.r();
        if (j86VarR != null) {
            j86VarR.d = new rn2() { // from class: g58
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                public final Object K(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iP = w79.P(i | 1);
                    pn7.a(d78Var, charSequence, zy0Var, q58Var, sn2Var, rn2Var, rn2Var2, rn2Var3, z, z2, z3, xz4Var, gg5Var, i48Var, zy0Var2, (lp2) obj2, iP);
                    return dn8.a;
                }
            };
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void b(long j, o88 o88Var, rn2 rn2Var, lp2 lp2Var, final int i) {
        lp2 lp2Var2;
        final rn2 rn2Var2;
        final o88 o88Var2;
        final long j2;
        lp2Var.X(396611577);
        int i2 = (lp2Var.e(j) ? 4 : 2) | i | (lp2Var.f(o88Var) ? 32 : 16);
        if ((i & 384) == 0) {
            i2 |= lp2Var.h(rn2Var) ? 256 : 128;
        }
        if (lp2Var.N(i2 & 1, (i2 & 147) != 146)) {
            lp2Var2 = lp2Var;
            jm4.l(j, o88Var, rn2Var, lp2Var2, i2 & 1022);
            j2 = j;
            o88Var2 = o88Var;
            rn2Var2 = rn2Var;
        } else {
            lp2Var2 = lp2Var;
            rn2Var2 = rn2Var;
            o88Var2 = o88Var;
            j2 = j;
            lp2Var2.Q();
        }
        j86 j86VarR = lp2Var2.r();
        if (j86VarR != null) {
            j86VarR.d = new rn2() { // from class: h58
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                public final Object K(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    pn7.b(j2, o88Var2, rn2Var2, (lp2) obj, w79.P(i | 1));
                    return dn8.a;
                }
            };
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void c(long j, rn2 rn2Var, lp2 lp2Var, int i) {
        lp2Var.X(590397809);
        int i2 = (lp2Var.e(j) ? 4 : 2) | i | (lp2Var.h(rn2Var) ? 32 : 16);
        if (lp2Var.N(i2 & 1, (i2 & 19) != 18)) {
            mb6.a(j41.a.a(new dw0(j)), rn2Var, lp2Var, (i2 & 112) | 8);
        } else {
            lp2Var.Q();
        }
        j86 j86VarR = lp2Var.r();
        if (j86VarR != null) {
            j86VarR.d = new yc(j, rn2Var, i);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void d(final boolean z, final b83 b83Var, final String str, final String str2, final gn2 gn2Var, final kx4 kx4Var, lp2 lp2Var, final int i) {
        lp2Var.X(577627556);
        int i2 = i | (lp2Var.g(z) ? 4 : 2) | (lp2Var.f(b83Var) ? 32 : 16) | (lp2Var.f(str != null ? new RouteProfileId(str) : null) ? 256 : 128) | (lp2Var.f(str2 != null ? new RouteProfileId(str2) : null) ? 2048 : 1024) | (lp2Var.h(gn2Var) ? 16384 : 8192);
        if (lp2Var.N(i2 & 1, (74899 & i2) != 74898)) {
            zc1.c(!b83Var.isEmpty(), kx4Var, (g22) null, (h62) null, (String) null, jm4.U(1444270540, new sn2() { // from class: nn7
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                public final Object x(Object obj, Object obj2, Object obj3) {
                    lp2 lp2Var2 = (lp2) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((ek) obj).getClass();
                    if (lp2Var2.N(iIntValue & 1, (iIntValue & 17) != 16)) {
                        i21.e(z, b83Var, str, str2, gn2Var, b.a, lp2Var2, 196608);
                    } else {
                        lp2Var2.Q();
                    }
                    return dn8.a;
                }
            }, lp2Var), lp2Var, 196656, 28);
        } else {
            lp2Var.Q();
        }
        j86 j86VarR = lp2Var.r();
        if (j86VarR != null) {
            final byte b = 1;
            j86VarR.d = new rn2(z, b83Var, str, str2, gn2Var, kx4Var, i, b) { // from class: vz6
                public final /* synthetic */ byte X;
                public final /* synthetic */ boolean Y;
                public final /* synthetic */ b83 Z;
                public final /* synthetic */ String f0;
                public final /* synthetic */ String g0;
                public final /* synthetic */ gn2 h0;
                public final /* synthetic */ kx4 i0;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                {
                    this.X = b;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                public final Object K(Object obj, Object obj2) {
                    byte b2 = this.X;
                    dn8 dn8Var = dn8.a;
                    switch (b2) {
                        case 0:
                            ((Integer) obj2).getClass();
                            int iP = w79.P(196609);
                            i21.e(this.Y, this.Z, this.f0, this.g0, this.h0, this.i0, (lp2) obj, iP);
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            int iP2 = w79.P(196609);
                            pn7.d(this.Y, this.Z, this.f0, this.g0, this.h0, this.i0, (lp2) obj, iP2);
                            break;
                    }
                    return dn8Var;
                }
            };
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void e(qn7 qn7Var, gn2 gn2Var, kx4 kx4Var, lp2 lp2Var, int i) {
        kx4 kx4Var2;
        lp2Var.X(-1455834281);
        int i2 = i | (lp2Var.f(qn7Var) ? 4 : 2) | (lp2Var.h(gn2Var) ? 32 : 16);
        if (lp2Var.N(i2 & 1, (i2 & 147) != 146)) {
            tw0 tw0VarA = rw0.a(ht.c, pz2.q0, lp2Var, 0);
            int iHashCode = Long.hashCode(lp2Var.T);
            kl5 kl5VarL = lp2Var.l();
            kx4Var2 = kx4Var;
            kx4 kx4VarQ = w45.Q(lp2Var, kx4Var2);
            uz0.j.getClass();
            lp2Var.Z();
            if (lp2Var.S) {
                lp2Var.k();
            } else {
                lp2Var.j0();
            }
            m(pz2.B0, lp2Var, tw0VarA);
            m(pz2.A0, lp2Var, kl5VarL);
            m(pz2.C0, lp2Var, Integer.valueOf(iHashCode));
            l(lp2Var);
            m(pz2.z0, lp2Var, kx4VarQ);
            b83 b83Var = qn7Var.f;
            um6 um6Var = b83Var != null ? (um6) wv0.t0(b83Var) : null;
            boolean z = um6Var != null;
            FillElement fillElement = b.a;
            zc1.d(z, fillElement, (g22) null, (h62) null, (String) null, jm4.U(-1854843227, new p90(um6Var, qn7Var, gn2Var, (byte) 9), lp2Var), lp2Var, 1573254);
            String strJ0 = vj8.j0(y46.sub_routing_list_json_description, lp2Var);
            ox1 ox1Var = hr.a;
            kx4 kx4VarW = os4.w(fillElement, ((gr) lp2Var.j(ox1Var)).a.c);
            sr srVar = ((gr) lp2Var.j(ox1Var)).a;
            vj8.g(strJ0, os4.A(kx4VarW, 0.0f, 8.0f, 0.0f, 0.0f, 13), lp2Var, 0);
            lp2Var.p(true);
        } else {
            kx4Var2 = kx4Var;
            lp2Var.Q();
        }
        j86 j86VarR = lp2Var.r();
        if (j86VarR != null) {
            j86VarR.d = new jn7(qn7Var, gn2Var, kx4Var2, i, (byte) 3);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void f(qn7 qn7Var, gn2 gn2Var, kx4 kx4Var, lp2 lp2Var, int i) {
        lp2Var.X(1399702297);
        int i2 = i | (lp2Var.f(qn7Var) ? 4 : 2) | (lp2Var.h(gn2Var) ? 32 : 16);
        if (lp2Var.N(i2 & 1, (i2 & 147) != 146)) {
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
            m(pz2.B0, lp2Var, tw0VarA);
            m(pz2.A0, lp2Var, kl5VarL);
            m(pz2.C0, lp2Var, Integer.valueOf(iHashCode));
            l(lp2Var);
            m(pz2.z0, lp2Var, kx4VarQ);
            FillElement fillElement = b.a;
            mn7.a(qn7Var, gn2Var, fillElement, lp2Var, (i2 & 112) | (i2 & 14) | 384);
            zc1.d(!qn7Var.i, fillElement, (g22) null, (h62) null, (String) null, jm4.U(2053843943, new o90(qn7Var, gn2Var, (byte) 15), lp2Var), lp2Var, 1573254);
            lp2Var.p(true);
        } else {
            lp2Var.Q();
        }
        j86 j86VarR = lp2Var.r();
        if (j86VarR != null) {
            j86VarR.d = new jn7(qn7Var, gn2Var, kx4Var, i, (byte) 2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void g(final np7 np7Var, final vv5 vv5Var, final gw5 gw5Var, final fn6 fn6Var, kx4 kx4Var, lp2 lp2Var, int i) {
        np7Var.getClass();
        vv5Var.getClass();
        fn6Var.getClass();
        lp2Var.X(-203563509);
        final y05 y05VarO = i21.o(np7Var.f, lp2Var);
        boolean zH = lp2Var.h(np7Var);
        Object objK = lp2Var.K();
        if (zH || objK == zz0.a) {
            al5 al5Var = new al5(1, np7Var, np7.class, "onUiIntent", "onUiIntent(Lsu/happ/proxyutility/feature/routing/sub/SubRoutingUiIntent;)V", 0, (byte) 16);
            lp2Var.g0(al5Var);
            objK = al5Var;
        }
        final pv3 pv3Var = (pv3) objK;
        final o87 o87VarF = zw4.f((gn2) null, lp2Var, 6, 2);
        sx2.b(kx4Var, jm4.U(594493672, new oq2(pv3Var, y05VarO, (byte) 3), lp2Var), (rn2) null, (rn2) null, 0, 0L, (v09) null, jm4.U(-534325711, new sn2() { // from class: on7
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public final Object x(Object obj, Object obj2, Object obj3) {
                be beVar;
                vv5 vv5Var2;
                o87 o87Var;
                boolean z;
                gg5 gg5Var = (gg5) obj;
                lp2 lp2Var2 = (lp2) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                gg5Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= lp2Var2.f(gg5Var) ? 4 : 2;
                }
                if (lp2Var2.N(iIntValue & 1, (iIntValue & 19) != 18)) {
                    z24 z24Var = (z24) lp2Var2.j(y01.n);
                    lh7 lh7Var = y05VarO;
                    String str = ((qn7) lh7Var.getValue()).a;
                    f76 f76Var = np7Var.h;
                    gn2 gn2Var = pv3Var;
                    gn2 gn2Var2 = gn2Var;
                    gw5 gw5Var2 = gw5Var;
                    boolean zH2 = lp2Var2.h(gw5Var2);
                    Object objK2 = lp2Var2.K();
                    be beVar2 = zz0.a;
                    if (zH2 || objK2 == beVar2) {
                        beVar = beVar2;
                        al5 al5Var2 = new al5(1, gw5Var2, gw5.class, "onUiIntent", "onUiIntent(Lsu/happ/proxyutility/feature/routing/duplicated_name/ProfileDuplicatedNameUiIntent;)V", 0, (byte) 14);
                        lp2Var2.g0(al5Var2);
                        objK2 = al5Var2;
                    } else {
                        beVar = beVar2;
                    }
                    gn2 gn2Var3 = (pv3) objK2;
                    vv5 vv5Var3 = vv5Var;
                    boolean zH3 = lp2Var2.h(vv5Var3);
                    Object objK3 = lp2Var2.K();
                    if (zH3 || objK3 == beVar) {
                        vv5Var2 = vv5Var3;
                        objK3 = new al5(1, vv5Var2, vv5.class, "onUiIntent", "onUiIntent(Lsu/happ/proxyutility/feature/routing/profile_copy/ProfileCopyUiIntent;)V", 0, (byte) 15);
                        lp2Var2.g0(objK3);
                    } else {
                        vv5Var2 = vv5Var3;
                    }
                    gn2 gn2Var4 = (pv3) objK3;
                    str.getClass();
                    o87 o87Var2 = o87VarF;
                    o87Var2.getClass();
                    f76Var.getClass();
                    gn2Var2.getClass();
                    gn2Var3.getClass();
                    gn2Var4.getClass();
                    fn6 fn6Var2 = fn6Var;
                    fn6Var2.getClass();
                    Context context = (Context) lp2Var2.j(pc.b);
                    Activity activity = (Activity) lp2Var2.j(yc4.a);
                    ky2 ky2Var = (ky2) lp2Var2.j(ly2.a);
                    Object[] objArr = {f76Var, context, activity, ky2Var};
                    boolean zH4 = lp2Var2.h(f76Var) | lp2Var2.f(ky2Var) | lp2Var2.h(context) | lp2Var2.f(gn2Var3) | lp2Var2.h(fn6Var2) | lp2Var2.f(gn2Var2) | lp2Var2.f(o87Var2) | lp2Var2.h(activity) | lp2Var2.f(gn2Var4) | lp2Var2.f(str);
                    Object objK4 = lp2Var2.K();
                    if (zH4 || objK4 == beVar) {
                        o87Var = o87Var2;
                        eo7 eo7Var = new eo7(f76Var, ky2Var, context, gn2Var3, fn6Var2, gn2Var2, o87Var, activity, gn2Var4, str, null);
                        lp2Var2.g0(eo7Var);
                        objK4 = eo7Var;
                    } else {
                        o87Var = o87Var2;
                    }
                    u70.k(objArr, (rn2) objK4, lp2Var2);
                    boolean z2 = ((qn7) lh7Var.getValue()).i;
                    FillElement fillElement = b.c;
                    hi5.J(z2, os4.A(fillElement, os4.h(gg5Var, z24Var), gg5Var.d(), os4.g(gg5Var, z24Var), 0.0f, 8), os4.z(fillElement, 0.0f, 12.0f, 1), jm4.U(113529609, new oq2(gn2Var, lh7Var, (byte) 4), lp2Var2), lp2Var2, 3456);
                    if (((qn7) lh7Var.getValue()).m) {
                        lp2Var2.W(-947294489);
                        boolean zF = lp2Var2.f(gn2Var);
                        Object objK5 = lp2Var2.K();
                        if (zF || objK5 == beVar) {
                            objK5 = new aa3(gn2Var, (byte) 9);
                            lp2Var2.g0(objK5);
                        }
                        dn2 dn2Var = (dn2) objK5;
                        boolean zF2 = lp2Var2.f(gn2Var);
                        Object objK6 = lp2Var2.K();
                        if (zF2 || objK6 == beVar) {
                            objK6 = new aa3(gn2Var, (byte) 10);
                            lp2Var2.g0(objK6);
                        }
                        w79.c(vv5Var2, dn2Var, (dn2) objK6, o87Var, lp2Var2, 8);
                        lp2Var2.p(false);
                    } else {
                        lp2Var2.W(-946946607);
                        lp2Var2.p(false);
                    }
                    if (((qn7) lh7Var.getValue()).l) {
                        lp2Var2.W(-946883522);
                        boolean zF3 = lp2Var2.f(gn2Var);
                        Object objK7 = lp2Var2.K();
                        if (zF3 || objK7 == beVar) {
                            objK7 = new aa3(gn2Var, (byte) 11);
                            lp2Var2.g0(objK7);
                        }
                        dn2 dn2Var2 = (dn2) objK7;
                        boolean zF4 = lp2Var2.f(gn2Var);
                        Object objK8 = lp2Var2.K();
                        if (zF4 || objK8 == beVar) {
                            objK8 = new t16(gn2Var, (byte) 25);
                            lp2Var2.g0(objK8);
                        }
                        ys0.k(dn2Var2, (gn2) objK8, (kx4) null, lp2Var2, 0);
                        lp2Var2.p(false);
                    } else {
                        lp2Var2.W(-946557743);
                        lp2Var2.p(false);
                    }
                    if (((qn7) lh7Var.getValue()).n) {
                        lp2Var2.W(-946496952);
                        boolean zF5 = lp2Var2.f(gn2Var);
                        Object objK9 = lp2Var2.K();
                        if (zF5 || objK9 == beVar) {
                            objK9 = new aa3(gn2Var, (byte) 12);
                            lp2Var2.g0(objK9);
                        }
                        yn0.l(gw5Var2, (dn2) objK9, (dn2) null, lp2Var2, 8, 12);
                        lp2Var2 = lp2Var2;
                        z = false;
                        lp2Var2.p(false);
                    } else {
                        z = false;
                        lp2Var2.W(-946180783);
                        lp2Var2.p(false);
                    }
                    aw5 aw5Var = ((qn7) lh7Var.getValue()).o;
                    if (aw5Var instanceof wv5) {
                        lp2Var2.W(1909144474);
                        lp2Var2.p(z);
                    } else {
                        if (!(aw5Var instanceof yv5)) {
                            lp2Var2.W(1909141612);
                            lp2Var2.p(false);
                            b61.c();
                            return null;
                        }
                        lp2Var2.W(-945991993);
                        boolean zF6 = lp2Var2.f(gn2Var);
                        Object objK10 = lp2Var2.K();
                        if (zF6 || objK10 == beVar) {
                            objK10 = new aa3(gn2Var, (byte) 13);
                            lp2Var2.g0(objK10);
                        }
                        dn2 dn2Var3 = (dn2) objK10;
                        boolean zF7 = lp2Var2.f(gn2Var) | lp2Var2.f(aw5Var);
                        Object objK11 = lp2Var2.K();
                        if (zF7 || objK11 == beVar) {
                            objK11 = new a23(gn2Var, aw5Var, (byte) 23);
                            lp2Var2.g0(objK11);
                        }
                        u70.l(dn2Var3, (dn2) objK11, (kx4) null, lp2Var2, 0);
                        lp2Var2.p(false);
                    }
                } else {
                    lp2Var2.Q();
                }
                return dn8.a;
            }
        }, lp2Var), lp2Var, 12582966);
        j86 j86VarR = lp2Var.r();
        if (j86VarR != null) {
            j86VarR.d = new no5(np7Var, vv5Var, gw5Var, fn6Var, kx4Var, i, (byte) 2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final long h(float f, float f2) {
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f2)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
        int i = gd8.c;
        return jFloatToRawIntBits;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final p8 i(q58 q58Var) {
        if (q58Var instanceof q58) {
            return pz2.q0;
        }
        u52.j(q58Var, "Unknown position: ");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void j(lp2 lp2Var, Integer num) {
        dx0 dx0Var = pz2.C0;
        if (lp2Var.S) {
            lp2Var.b(dx0Var, num);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final float k(lp2 lp2Var) {
        long j = ((wj8) lp2Var.j(yj8.a)).l.b.c;
        long j2 = qi8.l;
        if ((1095216660480L & j) != 4294967296L) {
            j = j2;
        }
        return ((fi1) lp2Var.j(y01.h)).A(j) / 2.0f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void l(lp2 lp2Var) {
        lp2Var.b(new c68((byte) 4), dn8.a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void m(rn2 rn2Var, lp2 lp2Var, Object obj) {
        if (lp2Var.S || !dh3.f(lp2Var.K(), obj)) {
            lp2Var.g0(obj);
            lp2Var.b(rn2Var, obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final float n(lp2 lp2Var) {
        float f = ((kt1) lp2Var.j(yf3.c)).X;
        if (Float.isNaN(f)) {
            f = 0.0f;
        }
        float f2 = (f - w45.m) / 2.0f;
        if (f2 < 0.0f) {
            return 0.0f;
        }
        return f2;
    }
}
