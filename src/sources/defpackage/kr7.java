package defpackage;

import java.net.URI;
import java.net.URL;
import java.util.concurrent.CancellationException;
import su.happ.proxyutility.domain.sub.SubId;
import su.happ.proxyutility.dto.MetaParams;
import su.happ.proxyutility.dto.SubscriptionItem;
import su.happ.proxyutility.dto.enums.EDeeplinkType;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class kr7 extends xw8 {
    public final ov6 b;
    public final vz7 c;
    public final vz7 d;
    public final vz7 e;
    public final vz7 f;
    public final h76 g;
    public final u77 h;
    public final f76 i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public kr7(ov6 ov6Var) {
        ov6Var.getClass();
        this.b = ov6Var;
        this.c = new vz7(new mq7((byte) 1));
        this.d = new vz7(new mq7((byte) 2));
        this.e = new vz7(new mq7((byte) 3));
        this.f = new vz7(new mq7((byte) 4));
        this.g = ov6Var.a(new sq7());
        u77 u77VarB = v77.b(0, 7, (l90) null);
        this.h = u77VarB;
        this.i = jm4.m(u77VarB);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:141:? */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:142:0x002b */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:16:0x003a */
    /* JADX WARN: Code duplicated, block: B:109:0x0222 A[Catch: all -> 0x004c, TryCatch #3 {all -> 0x004c, blocks: (B:21:0x0047, B:107:0x021c, B:109:0x0222, B:110:0x022d, B:26:0x0054), top: B:142:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:113:0x023c  */
    /* JADX WARN: Code duplicated, block: B:127:0x0265  */
    /* JADX WARN: Code duplicated, block: B:132:0x0278  */
    /* JADX WARN: Code duplicated, block: B:36:0x0093  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a9 A[Catch: all -> 0x008f, TryCatch #5 {all -> 0x008f, blocks: (B:29:0x0061, B:31:0x0080, B:33:0x008a, B:38:0x0096, B:40:0x009c, B:44:0x00ad, B:46:0x00b6, B:48:0x00be, B:50:0x00c2, B:52:0x00c6, B:54:0x00ca, B:59:0x00d2, B:62:0x00dd, B:64:0x00f5, B:63:0x00f2, B:65:0x0109, B:67:0x0115, B:69:0x014e, B:71:0x0161, B:91:0x01af, B:72:0x016f, B:74:0x0175, B:90:0x01ac, B:85:0x0197, B:89:0x01a2, B:88:0x019e, B:125:0x0262, B:68:0x0139, B:43:0x00a9, B:76:0x017a, B:79:0x0189, B:81:0x018d, B:83:0x0191, B:124:0x0261), top: B:145:0x0061, inners: #1, #4 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14, types: [int] */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r24v0, types: [kr7] */
    /* JADX WARN: Type inference failed for: r2v0, types: [su.happ.proxyutility.dto.SubscriptionItem] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v3, types: [su.happ.proxyutility.dto.SubscriptionItem] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [int] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r4v36 */
    /* JADX WARN: Type inference failed for: r4v37, types: [su.happ.proxyutility.dto.SubscriptionItem] */
    /* JADX WARN: Type inference failed for: r4v46 */
    public final Object e(SubscriptionItem subscriptionItem, s51 s51Var) {
        hr7 hr7Var;
        ?? r1;
        MetaParams metaParamsB;
        MetaParams metaParams;
        String rj6Var;
        String strA;
        int i;
        ?? r2;
        ?? r4;
        String providerId;
        vq7 vq7Var;
        ?? r3 = subscriptionItem;
        if (s51Var instanceof hr7) {
            hr7Var = (hr7) s51Var;
            int i2 = hr7Var.j0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hr7Var.j0 = i2 - Integer.MIN_VALUE;
            } else {
                hr7Var = new hr7(this, s51Var);
            }
        } else {
            hr7Var = new hr7(this, s51Var);
        }
        Object objD = hr7Var.h0;
        int i3 = hr7Var.j0;
        h76 h76Var = this.g;
        c71 c71Var = c71.X;
        try {
            try {
                if (i3 == 0) {
                    w39.n0(objD);
                    try {
                        String str = ((sq7) h76Var.X.getValue()).l0;
                        String strM = r3.m();
                        ss8 ss8Var = ss8.a;
                        String fragment = new URI(ss8.c(strM)).getFragment();
                        if (fragment != null) {
                            kc6 kc6Var = zl7.a;
                            if (fm7.d0(fragment, "?", false)) {
                                metaParamsB = zl7.b(fragment);
                            } else {
                                metaParamsB = null;
                            }
                        } else {
                            metaParamsB = null;
                        }
                        if (metaParamsB == null) {
                            metaParams = r3.getMetaParams();
                        } else {
                            MetaParams metaParams2 = r3.getMetaParams();
                            if (metaParams2 != null) {
                                MetaParams.INSTANCE.getClass();
                                metaParams = MetaParams.Companion.c(metaParamsB, metaParams2, true);
                            } else {
                                metaParams = null;
                            }
                            if (metaParams == null) {
                                metaParams = r3.getMetaParams();
                            }
                        }
                        r3.r0(metaParams);
                        if (!r3.G()) {
                            EDeeplinkType eDeeplinkTypeB = ae1.b(str);
                            r3.j0(eDeeplinkTypeB == EDeeplinkType.CRYPTO || eDeeplinkTypeB == EDeeplinkType.CRYPTO2 || eDeeplinkTypeB == EDeeplinkType.CRYPTO3 || eDeeplinkTypeB == EDeeplinkType.CRYPTO4 || eDeeplinkTypeB == EDeeplinkType.CRYPTO5);
                            if (!r3.getEncryptedUrl()) {
                                r3.w0(str);
                            } else if (eDeeplinkTypeB != null) {
                                r3.w0(ae1.c(fm7.x0("happ://", str), eDeeplinkTypeB));
                                r3.k0(ae1.a(eDeeplinkTypeB));
                            }
                            r3.n0(((sq7) h76Var.X.getValue()).Z);
                            r3.i0(c12.d(str));
                        }
                        r3.h0();
                        r3.g0();
                        MetaParams metaParams3 = r3.getMetaParams();
                        r3.r0(metaParams3 != null ? MetaParams.c(metaParams3, Boolean.valueOf(((sq7) h76Var.X.getValue()).h0), null, null, null, null, null, null, -129, -1, 268435455) : new MetaParams(Boolean.valueOf(((sq7) h76Var.X.getValue()).h0), -129));
                        if (((sq7) h76Var.X.getValue()).k0.length() > 0) {
                            r3.v0(((sq7) h76Var.X.getValue()).k0, true);
                        } else {
                            if (r3.G()) {
                                strA = r3.getRemarks();
                            } else {
                                try {
                                    rj6Var = new URL(r3.getUrl()).getHost();
                                } catch (Throwable th) {
                                    if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                                        throw th;
                                    }
                                    rj6Var = new rj6(th);
                                }
                                if (sj6.a(rj6Var) != null) {
                                    rj6Var = r3.getUrl();
                                }
                                rj6Var.getClass();
                                strA = eq8.a(1, rj6Var, (6 & 2) != 0);
                            }
                            r3.v0(strA, true);
                        }
                        qq0 qq0Var = (qq0) this.d.getValue();
                        String str2 = ((sq7) h76Var.X.getValue()).X;
                        hr7Var.f0 = r3;
                        hr7Var.g0 = 0;
                        hr7Var.j0 = 1;
                        objD = qq0.d(qq0Var, (SubscriptionItem) r3, str2, hr7Var, 124);
                        if (objD != c71Var) {
                            i = 0;
                            r2 = r3;
                        }
                        return c71Var;
                    } catch (Throwable th2) {
                        th = th2;
                        r1 = 0;
                        if (r1 != 0) {
                            th.printStackTrace();
                        }
                        if (th instanceof InterruptedException) {
                        }
                        throw th;
                    }
                }
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 != 3) {
                            bt.i("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        r1 = hr7Var.g0;
                        try {
                            w39.n0(objD);
                            r1 = r1;
                            return dn8.a;
                        } catch (Throwable th3) {
                            th = th3;
                            if (r1 != 0) {
                                th.printStackTrace();
                            }
                            if (th instanceof InterruptedException) {
                            }
                            throw th;
                        }
                    }
                    int i4 = hr7Var.g0;
                    SubscriptionItem subscriptionItem2 = hr7Var.f0;
                    w39.n0(objD);
                    r3 = i4;
                    r4 = subscriptionItem2;
                    providerId = r4.getProviderId();
                    if (providerId != null) {
                        ((s24) this.e.getValue()).a(providerId);
                    }
                    vq7Var = vq7.a;
                    hr7Var.f0 = null;
                    hr7Var.g0 = r3;
                    hr7Var.j0 = 3;
                    if (g(vq7Var, hr7Var) != c71Var) {
                        r1 = r3;
                        return dn8.a;
                    }
                    return c71Var;
                }
                int i5 = hr7Var.g0;
                SubscriptionItem subscriptionItem3 = hr7Var.f0;
                w39.n0(objD);
                i = i5;
                r2 = subscriptionItem3;
                if (((x83) objD) instanceof v83) {
                    kw4 kw4Var = kw4.a;
                    kw4.u(r2, ((sq7) h76Var.X.getValue()).X);
                    throw new pj6();
                }
                kw4 kw4Var2 = kw4.a;
                kw4.u(r2, ((sq7) h76Var.X.getValue()).X);
                us usVar = (us) this.f.getValue();
                String str3 = ((sq7) h76Var.X.getValue()).X;
                SubId subId = str3 != null ? new SubId(str3) : null;
                if (subId == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                String strD = subId.d();
                hr7Var.f0 = r2;
                hr7Var.g0 = i;
                hr7Var.j0 = 2;
                if (usVar.a(strD, hr7Var) != c71Var) {
                    int i6 = i;
                    r4 = r2;
                    r3 = i6;
                    providerId = r4.getProviderId();
                    if (providerId != null) {
                        ((s24) this.e.getValue()).a(providerId);
                    }
                    vq7Var = vq7.a;
                    hr7Var.f0 = null;
                    hr7Var.g0 = r3;
                    hr7Var.j0 = 3;
                    if (g(vq7Var, hr7Var) != c71Var) {
                        r1 = r3;
                        return dn8.a;
                    }
                }
                return c71Var;
            } catch (Throwable th4) {
                th = th4;
                r1 = i;
                if (r1 != 0 && !fm7.d0(gv3.W(th), "util.protection", false)) {
                    th.printStackTrace();
                }
                if (!(th instanceof InterruptedException) || (th instanceof CancellationException)) {
                    throw th;
                }
                return new rj6(th);
            }
        } catch (Throwable th5) {
            th = th5;
            r1 = r3;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void f(gr7 gr7Var) {
        SubscriptionItem subscriptionItemF;
        boolean z = gr7Var instanceof zq7;
        h76 h76Var = this.g;
        SubscriptionItem subscriptionItemF2 = null;
        ov6 ov6Var = this.b;
        if (!z) {
            if (gr7Var instanceof fr7) {
                i(((fr7) gr7Var).a);
                return;
            }
            if (gr7Var instanceof cr7) {
                boolean z2 = ((cr7) gr7Var).a;
                sq7 sq7Var = (sq7) h76Var.X.getValue();
                sq7Var.getClass();
                ov6Var.b(sq7.c(sq7Var, null, false, z2, false, false, false, false, false, null, null, false, false, 8187));
                return;
            }
            if (gr7Var instanceof ar7) {
                sq7 sq7Var2 = (sq7) h76Var.X.getValue();
                sq7Var2.getClass();
                ov6Var.b(sq7.c(sq7Var2, null, false, false, false, false, false, false, false, null, null, false, false, 6143));
                jm4.Q(zw8.a(this), (u61) null, new ir7(this, null, (byte) 0), 3);
                return;
            }
            if (gr7Var instanceof br7) {
                boolean z3 = ((br7) gr7Var).a;
                sq7 sq7Var3 = (sq7) h76Var.X.getValue();
                sq7Var3.getClass();
                ov6Var.b(sq7.c(sq7Var3, null, false, false, false, false, z3, false, false, null, null, false, false, 8159));
                return;
            }
            if (gr7Var instanceof dr7) {
                boolean z4 = ((dr7) gr7Var).a;
                sq7 sq7Var4 = (sq7) h76Var.X.getValue();
                sq7Var4.getClass();
                ov6Var.b(sq7.c(sq7Var4, null, false, false, false, false, false, z4, false, null, null, false, false, 8127));
                return;
            }
            if (!(gr7Var instanceof er7)) {
                b61.c();
                return;
            }
            String str = ((er7) gr7Var).a;
            sq7 sq7Var5 = (sq7) h76Var.X.getValue();
            sq7Var5.getClass();
            ov6Var.b(sq7.c(sq7Var5, null, false, false, false, false, false, false, false, str, null, false, false, 7935));
            return;
        }
        String str2 = ((zq7) gr7Var).a;
        ((sq7) h76Var.X.getValue()).getClass();
        ov6Var.b(new sq7());
        sq7 sq7Var6 = (sq7) h76Var.X.getValue();
        sq7Var6.getClass();
        ov6Var.b(sq7.c(sq7Var6, str2, false, false, false, false, false, false, false, null, null, false, false, 8190));
        kw4 kw4Var = kw4.a;
        if (str2 != null) {
            SubscriptionItem subscriptionItemF3 = kw4.f(str2);
            String url = subscriptionItemF3 != null ? subscriptionItemF3.getUrl() : null;
            if (url == null) {
                url = "";
            }
            i(url);
        }
        boolean z5 = str2 != null;
        sq7 sq7Var7 = (sq7) h76Var.X.getValue();
        sq7Var7.getClass();
        ov6Var.b(sq7.c(sq7Var7, null, z5, false, false, false, false, false, false, null, null, false, false, 8189));
        if (str2 != null) {
            kw4 kw4Var2 = kw4.a;
            subscriptionItemF2 = kw4.f(str2);
        }
        if (subscriptionItemF2 != null) {
            sq7 sq7Var8 = (sq7) h76Var.X.getValue();
            sq7Var8.getClass();
            String remarks = subscriptionItemF2.getRemarks();
            String url2 = subscriptionItemF2.getUrl();
            boolean z6 = !subscriptionItemF2.G();
            boolean zG = subscriptionItemF2.G();
            boolean zG2 = subscriptionItemF2.G();
            boolean z7 = subscriptionItemF2.getEncrypted() || subscriptionItemF2.getEncryptedUrl();
            MetaParams metaParams = subscriptionItemF2.getMetaParams();
            ov6Var.b(sq7.c(sq7Var8, null, false, zG, zG2, z7, metaParams != null ? dh3.f(metaParams.getInsecure(), Boolean.TRUE) : false, subscriptionItemF2.U(), subscriptionItemF2.f0(), remarks, url2, z6, false, 6147));
        }
        String str3 = ((sq7) h76Var.X.getValue()).X;
        if (str3 == null || (subscriptionItemF = kw4.f(str3)) == null) {
            return;
        }
        boolean z8 = subscriptionItemF.getProviderId() != null;
        boolean z9 = subscriptionItemF.getInstallId() != null;
        vz7 vz7Var = this.c;
        ((kf4) vz7Var.getValue()).h(new jg(subscriptionItemF, z8, z9, (byte) 1));
        if (z8 || z9) {
            ((kf4) vz7Var.getValue()).h(new uq0(subscriptionItemF, (byte) 15));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object g(xq7 xq7Var, s51 s51Var) {
        Object objL = this.h.l(xq7Var, s51Var);
        return objL == c71.X ? objL : dn8.a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code duplicated, block: B:46:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:54:0x010b  */
    /* JADX WARN: Code duplicated, block: B:59:0x011e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object h(s51 s51Var) {
        jr7 jr7Var;
        int i;
        String str;
        SubscriptionItem subscriptionItemF;
        Object objE;
        int i2;
        xq7 wq7Var;
        dn8 rj6Var;
        if (s51Var instanceof jr7) {
            jr7Var = (jr7) s51Var;
            int i3 = jr7Var.j0;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                jr7Var.j0 = i3 - Integer.MIN_VALUE;
            } else {
                jr7Var = new jr7(this, s51Var);
            }
        } else {
            jr7Var = new jr7(this, s51Var);
        }
        Object obj = jr7Var.h0;
        int i4 = jr7Var.j0;
        h76 h76Var = this.g;
        Object obj2 = c71.X;
        if (i4 == 0) {
            w39.n0(obj);
            try {
                str = ((sq7) h76Var.X.getValue()).X;
                if (str != null) {
                    kw4 kw4Var = kw4.a;
                    subscriptionItemF = kw4.f(str);
                    if (subscriptionItemF == null) {
                        subscriptionItemF = null;
                    } else {
                        boolean z = ((sq7) h76Var.X.getValue()).i0;
                        if (!subscriptionItemF.f0()) {
                            subscriptionItemF = SubscriptionItem.d(subscriptionItemF, 0L, false, null, z, null, 264241151);
                        }
                        kw4.u(subscriptionItemF, str);
                    }
                } else {
                    subscriptionItemF = null;
                }
                if (subscriptionItemF != null) {
                    jr7Var.g0 = str;
                    jr7Var.f0 = 0;
                    jr7Var.j0 = 1;
                    objE = e(subscriptionItemF, jr7Var);
                    if (objE != obj2) {
                        i2 = 0;
                        w39.n0(objE);
                        wq7Var = new wq7(str, ((sq7) h76Var.X.getValue()).Y);
                        jr7Var.g0 = null;
                        jr7Var.f0 = i2;
                        jr7Var.j0 = 2;
                        if (g(wq7Var, jr7Var) != obj2) {
                            i = i2;
                            rj6Var = dn8.a;
                        }
                    }
                } else {
                    xq7 tq7Var = new tq7(((sq7) h76Var.X.getValue()).l0, ((sq7) h76Var.X.getValue()).k0, Boolean.valueOf(((sq7) h76Var.X.getValue()).Z), Boolean.valueOf(((sq7) h76Var.X.getValue()).h0));
                    jr7Var.g0 = null;
                    jr7Var.f0 = 0;
                    jr7Var.j0 = 3;
                    if (g(tq7Var, jr7Var) != obj2) {
                        i = 0;
                        rj6Var = dn8.a;
                    }
                }
                return obj2;
            } catch (Throwable th) {
                th = th;
                i = 0;
                if (i != 0) {
                    th.printStackTrace();
                }
                if (th instanceof InterruptedException) {
                }
                throw th;
            }
        }
        if (i4 == 1) {
            i2 = jr7Var.f0;
            str = jr7Var.g0;
            try {
                w39.n0(obj);
                objE = ((sj6) obj).X;
                w39.n0(objE);
                wq7Var = new wq7(str, ((sq7) h76Var.X.getValue()).Y);
                jr7Var.g0 = null;
                jr7Var.f0 = i2;
                jr7Var.j0 = 2;
                if (g(wq7Var, jr7Var) != obj2) {
                    i = i2;
                    rj6Var = dn8.a;
                }
                return obj2;
            } catch (Throwable th2) {
                th = th2;
                i = i2;
                if (i != 0) {
                    th.printStackTrace();
                }
                if (th instanceof InterruptedException) {
                }
                throw th;
            }
        }
        if (i4 != 2 && i4 != 3) {
            bt.i("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        i = jr7Var.f0;
        try {
            w39.n0(obj);
            rj6Var = dn8.a;
        } catch (Throwable th3) {
            th = th3;
            if (i != 0 && !fm7.d0(gv3.W(th), "util.protection", false)) {
                th.printStackTrace();
            }
            if (!(th instanceof InterruptedException) || (th instanceof CancellationException)) {
                throw th;
            }
            rj6Var = new rj6(th);
        }
        Throwable thA = sj6.a(rj6Var);
        if (thA != null && !(thA instanceof pj6)) {
            jm4.Q(zw8.a(this), (u61) null, new ir7(this, null, (byte) 1), 3);
        }
        return rj6Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void i(String str) {
        String str2;
        h76 h76Var = this.g;
        sq7 sq7Var = (sq7) h76Var.X.getValue();
        sq7Var.getClass();
        ss8 ss8Var = ss8.a;
        boolean z = false;
        if (ss8.z(str)) {
            str2 = str;
        } else {
            str2 = str;
            if (!mm7.Z(str2, false, "happ://crypt")) {
                z = true;
            }
        }
        sq7 sq7VarC = sq7.c(sq7Var, null, false, false, false, false, false, false, false, null, str2, false, z, 3583);
        ov6 ov6Var = this.b;
        ov6Var.b(sq7VarC);
        boolean z2 = ((sq7) h76Var.X.getValue()).g0;
        boolean zD = c12.d(str);
        if (z2 != zD) {
            sq7 sq7Var2 = (sq7) h76Var.X.getValue();
            sq7Var2.getClass();
            ov6Var.b(sq7.c(sq7Var2, null, false, false, false, zD, false, false, false, null, null, false, false, 8175));
        }
    }
}
