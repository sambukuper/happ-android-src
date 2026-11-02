package defpackage;

import android.content.Context;
import com.google.gson.a;
import com.tencent.mmkv.MMKV;
import java.io.Serializable;
import java.util.concurrent.CancellationException;
import okhttp3.internal.url._UrlKt;
import su.happ.proxyutility.HappApplication;
import su.happ.proxyutility.dto.ServerAffiliationInfo;
import su.happ.proxyutility.dto.TestPingViaProxyData;
import su.happ.proxyutility.dto.XRayConfig;
import su.happ.proxyutility.dto.enums.EPingType;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class un5 {
    public final Context a;
    public final MMKV b;
    public final MMKV c;

    public un5(Context context) {
        kw4 kw4Var = kw4.a;
        MMKV mmkvI = kw4.i();
        MMKV mmkvL = kw4.l();
        mmkvI.getClass();
        this.a = context;
        this.b = mmkvI;
        this.c = mmkvL;
    }

    public static void d(long j, String str) {
        str.getClass();
        if (fm7.o0(str)) {
            return;
        }
        kw4 kw4Var = kw4.a;
        kw4.i().q(str, yw2.c.h(new ServerAffiliationInfo(Long.valueOf(j), 2)));
    }

    public static void e(String str) {
        str.getClass();
        if (fm7.o0(str)) {
            return;
        }
        kw4 kw4Var = kw4.a;
        kw4.i().q(str, yw2.c.h(new ServerAffiliationInfo((Long) null, 1)));
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:51:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x00f8 -> B:52:0x00f9). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object a(java.lang.String r6, su.happ.proxyutility.dto.XRayConfig.OutboundBean r7, defpackage.s51 r8) {
        /*
            Method dump skipped, instruction units count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.un5.a(java.lang.String, su.happ.proxyutility.dto.XRayConfig$OutboundBean, s51):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:55:0x0124  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x0124 -> B:56:0x0127). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object b(java.lang.String r8, su.happ.proxyutility.dto.XRayConfig.OutboundBean r9, defpackage.s51 r10) {
        /*
            Method dump skipped, instruction units count: 404
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.un5.b(java.lang.String, su.happ.proxyutility.dto.XRayConfig$OutboundBean, s51):java.lang.Object");
    }

    public final ServerAffiliationInfo c(String str) {
        String strI;
        str.getClass();
        if (fm7.o0(str) || (strI = this.b.i(str)) == null || fm7.o0(strI)) {
            return null;
        }
        a aVar = yw2.c;
        aVar.getClass();
        return (ServerAffiliationInfo) aVar.c(strI, new yi8(ServerAffiliationInfo.class));
    }

    /* JADX WARN: Code duplicated, block: B:54:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:62:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:67:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:73:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:84:? A[RETURN, SYNTHETIC] */
    public final Serializable f(String str, gn2 gn2Var, s51 s51Var) throws Throwable {
        qn5 qn5Var;
        int i;
        Serializable rj6Var;
        XRayConfig.OutboundBean outboundBeanJ;
        String str2;
        int i2;
        XRayConfig.OutboundBean outboundBean;
        if (s51Var instanceof qn5) {
            qn5Var = (qn5) s51Var;
            int i3 = qn5Var.l0;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                qn5Var.l0 = i3 - Integer.MIN_VALUE;
            } else {
                qn5Var = new qn5(this, s51Var);
            }
        } else {
            qn5Var = new qn5(this, s51Var);
        }
        Object objW = qn5Var.j0;
        int i4 = qn5Var.l0;
        q51 q51Var = null;
        c71 c71Var = c71.X;
        if (i4 == 0) {
            w39.n0(objW);
            e(str);
            qn5Var.f0 = str;
            qn5Var.g0 = gn2Var;
            qn5Var.l0 = 1;
            nf1 nf1Var = tp1.a;
            objW = w51.W(ye1.Z, new k(this, str, q51Var, (byte) 25), qn5Var);
            if (objW != c71Var) {
            }
            return c71Var;
        }
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 != 3) {
                    bt.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i = qn5Var.i0;
                try {
                    w39.n0(objW);
                    rj6Var = (Long) objW;
                } catch (Throwable th) {
                    th = th;
                    if (i != 0) {
                        th.printStackTrace();
                    }
                    if (th instanceof InterruptedException) {
                    }
                    throw th;
                }
                if (rj6Var instanceof rj6) {
                    return null;
                }
                return rj6Var;
            }
            i2 = qn5Var.i0;
            outboundBean = qn5Var.h0;
            str2 = qn5Var.f0;
            try {
                w39.n0(objW);
                outboundBeanJ = outboundBean;
                qn5Var.f0 = null;
                qn5Var.g0 = null;
                qn5Var.h0 = null;
                qn5Var.i0 = i2;
                qn5Var.l0 = 3;
                objW = a(str2, outboundBeanJ, qn5Var);
                if (objW != c71Var) {
                    i = i2;
                    rj6Var = (Long) objW;
                    if (rj6Var instanceof rj6) {
                        return null;
                    }
                    return rj6Var;
                }
                return c71Var;
            } catch (Throwable th2) {
                int i5 = i2;
                th = th2;
                i = i5;
                if (i != 0) {
                    th.printStackTrace();
                }
                if (th instanceof InterruptedException) {
                }
                throw th;
            }
        }
        gn2Var = qn5Var.g0;
        str = qn5Var.f0;
        w39.n0(objW);
        if (!((b69) objW).a) {
            objW = null;
        }
        b69 b69Var = (b69) objW;
        if (b69Var == null) {
            return null;
        }
        try {
            a aVar = yw2.c;
            String str3 = b69Var.b;
            try {
                aVar.getClass();
                XRayConfig xRayConfig = (XRayConfig) aVar.c(str3, new yi8(XRayConfig.class));
                if (xRayConfig != null && (outboundBeanJ = xRayConfig.j()) != null) {
                    if (gn2Var != null) {
                        qn5Var.f0 = str;
                        qn5Var.g0 = null;
                        qn5Var.h0 = outboundBeanJ;
                        qn5Var.i0 = 0;
                        qn5Var.l0 = 2;
                        if (gn2Var.B(qn5Var) != c71Var) {
                            str2 = str;
                            outboundBean = outboundBeanJ;
                            i2 = 0;
                            outboundBeanJ = outboundBean;
                            qn5Var.f0 = null;
                            qn5Var.g0 = null;
                            qn5Var.h0 = null;
                            qn5Var.i0 = i2;
                            qn5Var.l0 = 3;
                            objW = a(str2, outboundBeanJ, qn5Var);
                            if (objW != c71Var) {
                                i = i2;
                                rj6Var = (Long) objW;
                            }
                        }
                    } else {
                        str2 = str;
                        i2 = 0;
                        qn5Var.f0 = null;
                        qn5Var.g0 = null;
                        qn5Var.h0 = null;
                        qn5Var.i0 = i2;
                        qn5Var.l0 = 3;
                        objW = a(str2, outboundBeanJ, qn5Var);
                        if (objW != c71Var) {
                            i = i2;
                            rj6Var = (Long) objW;
                        }
                    }
                    return c71Var;
                }
                rj6Var = null;
            } catch (Throwable th3) {
                th = th3;
                i = 0;
                if (i != 0 && !fm7.d0(gv3.W(th), "util.protection", false)) {
                    th.printStackTrace();
                }
                if (!(th instanceof InterruptedException) || (th instanceof CancellationException)) {
                    throw th;
                }
                rj6Var = new rj6(th);
            }
        } catch (Throwable th4) {
            th = th4;
        }
        if (rj6Var instanceof rj6) {
            return null;
        }
        return rj6Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007a, code lost:
    
        if (r13 == r7) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x009c, code lost:
    
        if (r13 == r7) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(java.lang.String r10, defpackage.gn2 r11, defpackage.gn2 r12, defpackage.s51 r13) {
        /*
            r9 = this;
            boolean r0 = r13 instanceof defpackage.rn5
            if (r0 == 0) goto L13
            r0 = r13
            rn5 r0 = (defpackage.rn5) r0
            int r1 = r0.i0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.i0 = r1
            goto L18
        L13:
            rn5 r0 = new rn5
            r0.<init>(r9, r13)
        L18:
            java.lang.Object r13 = r0.g0
            int r1 = r0.i0
            dn8 r2 = defpackage.dn8.a
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r1 == 0) goto L40
            if (r1 == r5) goto L3c
            if (r1 == r4) goto L36
            if (r1 != r3) goto L30
            gn2 r12 = r0.f0
            defpackage.w39.n0(r13)
            goto L7d
        L30:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.bt.i(r9)
            return r6
        L36:
            gn2 r12 = r0.f0
            defpackage.w39.n0(r13)
            goto L9f
        L3c:
            defpackage.w39.n0(r13)
            return r2
        L40:
            defpackage.w39.n0(r13)
            su.happ.proxyutility.dto.enums.EPingType$Companion r13 = su.happ.proxyutility.dto.enums.EPingType.INSTANCE
            java.lang.String r1 = "pref_ping_type"
            r7 = -1
            com.tencent.mmkv.MMKV r8 = r9.c
            int r1 = r8.e(r7, r1)
            r13.getClass()
            l22 r13 = su.happ.proxyutility.dto.enums.EPingType.c()
            java.lang.Object r13 = defpackage.wv0.u0(r1, r13)
            su.happ.proxyutility.dto.enums.EPingType r13 = (su.happ.proxyutility.dto.enums.EPingType) r13
            if (r13 != 0) goto L5f
            su.happ.proxyutility.dto.enums.EPingType r13 = su.happ.proxyutility.dto.enums.EPingType.VIA_PROXY_GET
        L5f:
            int[] r1 = defpackage.jn5.a
            int r7 = r13.ordinal()
            r1 = r1[r7]
            c71 r7 = defpackage.c71.X
            if (r1 == r5) goto Lb2
            if (r1 == r4) goto Lb2
            if (r1 == r3) goto L94
            r13 = 4
            if (r1 != r13) goto L90
            r0.f0 = r12
            r0.i0 = r3
            java.io.Serializable r13 = r9.f(r10, r11, r0)
            if (r13 != r7) goto L7d
            goto Lbc
        L7d:
            java.lang.Long r13 = (java.lang.Long) r13
            if (r13 == 0) goto Lbd
            long r9 = r13.longValue()
            if (r12 == 0) goto Lbd
            java.lang.Long r11 = new java.lang.Long
            r11.<init>(r9)
            r12.B(r11)
            return r2
        L90:
            defpackage.b61.c()
            return r6
        L94:
            r0.f0 = r12
            r0.i0 = r4
            java.io.Serializable r13 = r9.i(r10, r11, r0)
            if (r13 != r7) goto L9f
            goto Lbc
        L9f:
            java.lang.Long r13 = (java.lang.Long) r13
            if (r13 == 0) goto Lbd
            long r9 = r13.longValue()
            if (r12 == 0) goto Lbd
            java.lang.Long r11 = new java.lang.Long
            r11.<init>(r9)
            r12.B(r11)
            return r2
        Lb2:
            r0.f0 = r6
            r0.i0 = r5
            java.lang.Object r9 = r9.h(r10, r13, r11, r0)
            if (r9 != r7) goto Lbd
        Lbc:
            return r7
        Lbd:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.un5.g(java.lang.String, gn2, gn2, s51):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object h(String str, EPingType ePingType, gn2 gn2Var, s51 s51Var) {
        sn5 sn5Var;
        b69 b69Var;
        String str2;
        EPingType ePingType2;
        if (s51Var instanceof sn5) {
            sn5Var = (sn5) s51Var;
            int i = sn5Var.l0;
            if ((i & Integer.MIN_VALUE) != 0) {
                sn5Var.l0 = i - Integer.MIN_VALUE;
            } else {
                sn5Var = new sn5(this, s51Var);
            }
        } else {
            sn5Var = new sn5(this, s51Var);
        }
        Object objW = sn5Var.j0;
        int i2 = sn5Var.l0;
        Context context = this.a;
        dn8 dn8Var = dn8.a;
        q51 q51Var = null;
        c71 c71Var = c71.X;
        if (i2 == 0) {
            w39.n0(objW);
            qe4.M0(72, context, _UrlKt.FRAGMENT_ENCODE_SET);
            e(str);
            sn5Var.f0 = str;
            sn5Var.g0 = ePingType;
            sn5Var.h0 = gn2Var;
            sn5Var.l0 = 1;
            nf1 nf1Var = tp1.a;
            objW = w51.W(ye1.Z, new k(this, str, q51Var, (byte) 25), sn5Var);
            if (objW != c71Var) {
            }
            return c71Var;
        }
        if (i2 == 1) {
            gn2Var = sn5Var.h0;
            ePingType = sn5Var.g0;
            str = sn5Var.f0;
            w39.n0(objW);
        } else {
            if (i2 != 2) {
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b69Var = sn5Var.i0;
            ePingType2 = sn5Var.g0;
            str2 = sn5Var.f0;
            w39.n0(objW);
        }
        String str3 = str2;
        ePingType = ePingType2;
        str = str3;
        try {
            qe4.M0(7, context, yw2.c.h(new TestPingViaProxyData(b69Var.b, str, ePingType)));
            return dn8Var;
        } catch (Throwable th) {
            if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                throw th;
            }
        }
        if (!((b69) objW).a) {
            objW = null;
        }
        b69Var = (b69) objW;
        if (b69Var != null) {
            if (gn2Var != null) {
                sn5Var.f0 = str;
                sn5Var.g0 = ePingType;
                sn5Var.h0 = null;
                sn5Var.i0 = b69Var;
                sn5Var.l0 = 2;
                if (gn2Var.B(sn5Var) != c71Var) {
                    EPingType ePingType3 = ePingType;
                    str2 = str;
                    ePingType2 = ePingType3;
                    String str4 = str2;
                    ePingType = ePingType2;
                    str = str4;
                }
                return c71Var;
            }
            qe4.M0(7, context, yw2.c.h(new TestPingViaProxyData(b69Var.b, str, ePingType)));
            return dn8Var;
        }
        return dn8Var;
    }

    /* JADX WARN: Code duplicated, block: B:54:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:62:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:67:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:73:0x0101  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:84:? A[RETURN, SYNTHETIC] */
    public final Serializable i(String str, gn2 gn2Var, s51 s51Var) throws Throwable {
        tn5 tn5Var;
        int i;
        Serializable rj6Var;
        XRayConfig.OutboundBean outboundBeanJ;
        String str2;
        int i2;
        XRayConfig.OutboundBean outboundBean;
        if (s51Var instanceof tn5) {
            tn5Var = (tn5) s51Var;
            int i3 = tn5Var.l0;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                tn5Var.l0 = i3 - Integer.MIN_VALUE;
            } else {
                tn5Var = new tn5(this, s51Var);
            }
        } else {
            tn5Var = new tn5(this, s51Var);
        }
        Object objW = tn5Var.j0;
        int i4 = tn5Var.l0;
        byte b = 3;
        int i5 = 2;
        q51 q51Var = null;
        c71 c71Var = c71.X;
        if (i4 == 0) {
            w39.n0(objW);
            jm4.Q(HappApplication.N0, null, new wk0(i5, q51Var, b), 3);
            e(str);
            tn5Var.f0 = str;
            tn5Var.g0 = gn2Var;
            tn5Var.l0 = 1;
            nf1 nf1Var = tp1.a;
            objW = w51.W(ye1.Z, new k(this, str, q51Var, (byte) 25), tn5Var);
            if (objW != c71Var) {
            }
            return c71Var;
        }
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 != 3) {
                    bt.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i = tn5Var.i0;
                try {
                    w39.n0(objW);
                    rj6Var = (Long) objW;
                } catch (Throwable th) {
                    th = th;
                    if (i != 0 && !fm7.d0(gv3.W(th), "util.protection", false)) {
                        th.printStackTrace();
                    }
                    if (!(th instanceof InterruptedException) || (th instanceof CancellationException)) {
                        throw th;
                    }
                    rj6Var = new rj6(th);
                }
                if (rj6Var instanceof rj6) {
                    return null;
                }
                return rj6Var;
            }
            i2 = tn5Var.i0;
            outboundBean = tn5Var.h0;
            str2 = tn5Var.f0;
            try {
                w39.n0(objW);
                outboundBeanJ = outboundBean;
                tn5Var.f0 = null;
                tn5Var.g0 = null;
                tn5Var.h0 = null;
                tn5Var.i0 = i2;
                tn5Var.l0 = 3;
                objW = b(str2, outboundBeanJ, tn5Var);
                if (objW != c71Var) {
                    i = i2;
                    rj6Var = (Long) objW;
                    if (rj6Var instanceof rj6) {
                        return null;
                    }
                    return rj6Var;
                }
                return c71Var;
            } catch (Throwable th2) {
                int i6 = i2;
                th = th2;
                i = i6;
                if (i != 0) {
                    th.printStackTrace();
                }
                if (th instanceof InterruptedException) {
                }
                throw th;
            }
        }
        gn2Var = tn5Var.g0;
        str = tn5Var.f0;
        w39.n0(objW);
        if (!((b69) objW).a) {
            objW = null;
        }
        b69 b69Var = (b69) objW;
        if (b69Var == null) {
            return null;
        }
        try {
            a aVar = yw2.c;
            String str3 = b69Var.b;
            try {
                aVar.getClass();
                XRayConfig xRayConfig = (XRayConfig) aVar.c(str3, new yi8(XRayConfig.class));
                if (xRayConfig != null && (outboundBeanJ = xRayConfig.j()) != null) {
                    if (gn2Var != null) {
                        tn5Var.f0 = str;
                        tn5Var.g0 = null;
                        tn5Var.h0 = outboundBeanJ;
                        tn5Var.i0 = 0;
                        tn5Var.l0 = 2;
                        if (gn2Var.B(tn5Var) != c71Var) {
                            str2 = str;
                            outboundBean = outboundBeanJ;
                            i2 = 0;
                            outboundBeanJ = outboundBean;
                            tn5Var.f0 = null;
                            tn5Var.g0 = null;
                            tn5Var.h0 = null;
                            tn5Var.i0 = i2;
                            tn5Var.l0 = 3;
                            objW = b(str2, outboundBeanJ, tn5Var);
                            if (objW != c71Var) {
                                i = i2;
                                rj6Var = (Long) objW;
                            }
                        }
                    } else {
                        str2 = str;
                        i2 = 0;
                        tn5Var.f0 = null;
                        tn5Var.g0 = null;
                        tn5Var.h0 = null;
                        tn5Var.i0 = i2;
                        tn5Var.l0 = 3;
                        objW = b(str2, outboundBeanJ, tn5Var);
                        if (objW != c71Var) {
                            i = i2;
                            rj6Var = (Long) objW;
                        }
                    }
                    return c71Var;
                }
                rj6Var = null;
            } catch (Throwable th3) {
                th = th3;
                i = 0;
                if (i != 0) {
                    th.printStackTrace();
                }
                if (th instanceof InterruptedException) {
                }
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
        if (rj6Var instanceof rj6) {
            return null;
        }
        return rj6Var;
    }
}
