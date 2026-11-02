package defpackage;

import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import su.happ.proxyutility.HappApplication;
import su.happ.proxyutility.domain.sub.ImportSubResult;
import su.happ.proxyutility.dto.ImportResult;
import su.happ.proxyutility.dto.MetaParams;
import su.happ.proxyutility.dto.SubscriptionItem;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class xr7 {
    public final vz7 a = new vz7(new mq7((byte) 5));
    public final vz7 b = new vz7(new mq7((byte) 6));

    /* JADX WARN: Code duplicated, block: B:100:0x0275  */
    /* JADX WARN: Code duplicated, block: B:102:0x027c  */
    /* JADX WARN: Code duplicated, block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x0143  */
    /* JADX WARN: Code duplicated, block: B:64:0x016b  */
    /* JADX WARN: Code duplicated, block: B:67:0x0188  */
    /* JADX WARN: Code duplicated, block: B:69:0x0193  */
    /* JADX WARN: Code duplicated, block: B:70:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:72:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:74:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:78:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:81:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:86:0x0223  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Code duplicated, block: B:93:0x0258  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v8, types: [int] */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v18, types: [java.lang.Boolean, java.lang.String, java.util.HashMap, su.happ.proxyutility.dto.SubscriptionItem] */
    /* JADX WARN: Type inference failed for: r4v19, types: [ea6, java.lang.Boolean, java.lang.String, java.util.HashMap, q51, su.happ.proxyutility.dto.SubscriptionItem] */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r6v5 */
    public final Object a(String str, String str2, SubscriptionItem subscriptionItem, boolean z, MetaParams metaParams, Boolean bool, s51 s51Var) throws Throwable {
        rr7 rr7Var;
        Map mapE;
        String strT;
        String strH;
        String str3;
        Boolean insecure;
        HashMap mapI;
        ea6 ea6Var;
        boolean z2;
        String str4;
        HashMap map;
        int i;
        ea6 ea6Var2;
        String str5;
        Boolean bool2;
        boolean z3;
        String str6;
        ?? BooleanValue;
        String str7;
        Proxy proxy;
        boolean zBooleanValue;
        ?? r4;
        c71 c71Var;
        Object objB;
        int i2;
        int i3;
        String str8;
        hv2 hv2Var;
        cb2 cb2Var;
        SubscriptionItem subscriptionItem2;
        ImportSubResult importSubResult;
        SubscriptionItem subscriptionItemF;
        MetaParams metaParams2;
        gk7 gk7Var;
        boolean zB0;
        int i4;
        int i5;
        ?? r5;
        ImportSubResult importSubResult2;
        hv2 hv2Var2;
        cb2 cb2Var2;
        ?? r6;
        SubscriptionItem subscriptionItem3 = subscriptionItem;
        if (s51Var instanceof rr7) {
            rr7Var = (rr7) s51Var;
            int i6 = rr7Var.s0;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                rr7Var.s0 = i6 - Integer.MIN_VALUE;
            } else {
                rr7Var = new rr7(this, s51Var);
            }
        } else {
            rr7Var = new rr7(this, s51Var);
        }
        rr7 rr7Var2 = rr7Var;
        Object obj = rr7Var2.q0;
        int i7 = rr7Var2.s0;
        q51 q51Var = null;
        c71 c71Var2 = c71.X;
        if (i7 == 0) {
            w39.n0(obj);
            if (metaParams == null || (mapE = metaParams.getFragmentBean()) == null) {
                mapE = subscriptionItem3.E();
            }
            if (metaParams == null || (strT = metaParams.getResolveAddress()) == null) {
                strT = subscriptionItem3.T();
            }
            if (metaParams == null || (strH = metaParams.getHost()) == null) {
                strH = subscriptionItem3.H();
            }
            str3 = strH;
            if (bool == null) {
                insecure = metaParams != null ? metaParams.getInsecure() : null;
                if (insecure == null) {
                    insecure = subscriptionItem3.L();
                }
            } else {
                insecure = bool;
            }
            int i8 = mapE != null ? 1 : 0;
            mapI = strT != null ? zp4.I(new qg5(new URL(subscriptionItem3.e(str)).getHost(), strT)) : null;
            ea6Var = new ea6();
            if (i8 == 0) {
                z3 = z;
                str6 = str;
                i = i8;
                BooleanValue = 0;
                bool2 = insecure;
                str7 = str2;
                if (BooleanValue == 0) {
                    a93 a93Var = (a93) this.b.getValue();
                    if (i != 0) {
                        proxy = new Proxy(Proxy.Type.SOCKS, new InetSocketAddress("127.0.0.1", n67.d()));
                    } else {
                        proxy = null;
                    }
                    if (bool2 != null) {
                        zBooleanValue = bool2.booleanValue();
                    } else {
                        zBooleanValue = false;
                    }
                    r4 = 0;
                    rr7Var2.f0 = null;
                    rr7Var2.g0 = str7;
                    rr7Var2.h0 = null;
                    rr7Var2.i0 = null;
                    rr7Var2.j0 = null;
                    rr7Var2.k0 = null;
                    rr7Var2.l0 = ea6Var;
                    rr7Var2.n0 = z3;
                    rr7Var2.o0 = i;
                    rr7Var2.p0 = BooleanValue;
                    rr7Var2.s0 = 3;
                    String str9 = str3;
                    boolean z4 = zBooleanValue;
                    c71Var = c71Var2;
                    objB = a93Var.b(str6, str7, z3, proxy, mapI, str9, z4, rr7Var2);
                    if (objB == c71Var) {
                        return c71Var;
                    }
                    ?? r7 = BooleanValue;
                    i2 = i;
                    i3 = r7 == true ? 1 : 0;
                    str8 = str7;
                    w39.n0(objB);
                    importSubResult = (ImportSubResult) objB;
                    kw4 kw4Var = kw4.a;
                    subscriptionItemF = kw4.f(str8);
                    r5 = r4;
                    if (subscriptionItemF != null) {
                        gk7Var = (gk7) this.a.getValue();
                        zB0 = subscriptionItemF.b0();
                        rr7Var2.f0 = r4;
                        rr7Var2.g0 = r4;
                        rr7Var2.h0 = r4;
                        rr7Var2.i0 = r4;
                        rr7Var2.j0 = r4;
                        rr7Var2.k0 = r4;
                        rr7Var2.l0 = ea6Var;
                        rr7Var2.m0 = importSubResult;
                        rr7Var2.n0 = z3;
                        rr7Var2.o0 = i2;
                        rr7Var2.p0 = i3 == true ? 1 : 0;
                        rr7Var2.s0 = 4;
                        if (gk7Var.a(metaParams2, zB0, str8, rr7Var2) == c71Var) {
                            r5 = r4;
                            return c71Var;
                        }
                        r5 = r4;
                        i4 = i3 == true ? 1 : 0;
                        i5 = i2;
                        r6 = r4;
                        i2 = i5;
                        i3 = i4;
                        r5 = r6;
                    }
                    r5 = r4;
                    importSubResult2 = importSubResult;
                    nf1 nf1Var = tp1.a;
                    hv2Var2 = dm4.a;
                    cb2Var2 = new cb2(ea6Var, r5, (byte) 4);
                    rr7Var2.f0 = r5;
                    rr7Var2.g0 = r5;
                    rr7Var2.h0 = r5;
                    rr7Var2.i0 = r5;
                    rr7Var2.j0 = r5;
                    rr7Var2.k0 = r5;
                    rr7Var2.l0 = r5;
                    rr7Var2.m0 = importSubResult2;
                    rr7Var2.n0 = z3;
                    rr7Var2.o0 = i2;
                    rr7Var2.p0 = i3;
                    rr7Var2.s0 = 5;
                    if (w51.W(hv2Var2, cb2Var2, rr7Var2) == c71Var) {
                        return c71Var;
                    }
                    if (importSubResult2.getIsSubUpdateRequired()) {
                    }
                    if (importSubResult2.getErrorStatusCode() == null) {
                        return importSubResult2.getNetworkResponse().a;
                    }
                    throw new qr7(importSubResult2.getErrorStatusCode());
                }
                nf1 nf1Var2 = tp1.a;
                hv2Var = dm4.a;
                cb2Var = new cb2(ea6Var, q51Var, (byte) 3);
                rr7Var2.f0 = null;
                rr7Var2.g0 = null;
                rr7Var2.h0 = subscriptionItem3;
                rr7Var2.i0 = null;
                rr7Var2.j0 = null;
                rr7Var2.k0 = null;
                rr7Var2.l0 = null;
                rr7Var2.n0 = z3;
                rr7Var2.o0 = i;
                rr7Var2.p0 = BooleanValue;
                rr7Var2.s0 = 2;
                if (w51.W(hv2Var, cb2Var, rr7Var2) != c71Var2) {
                    subscriptionItem2 = subscriptionItem3;
                    HappApplication happApplication = HappApplication.M0;
                    k32.i().d().h(new uq0(subscriptionItem2, (byte) 16));
                    throw new ym("Failed to start AntiFilter");
                }
            } else {
                nf1 nf1Var3 = tp1.a;
                hv2 hv2Var3 = dm4.a;
                sr7 sr7Var = new sr7(ea6Var, mapE, mapI, null);
                rr7Var2.f0 = str;
                rr7Var2.g0 = str2;
                rr7Var2.h0 = subscriptionItem3;
                rr7Var2.i0 = str3;
                rr7Var2.j0 = insecure;
                rr7Var2.k0 = mapI;
                rr7Var2.l0 = ea6Var;
                z2 = z;
                rr7Var2.n0 = z2;
                rr7Var2.o0 = i8;
                rr7Var2.s0 = 1;
                Object objW = w51.W(hv2Var3, sr7Var, rr7Var2);
                if (objW != c71Var2) {
                    str4 = str;
                    map = mapI;
                    i = i8;
                    ea6Var2 = ea6Var;
                    str5 = str2;
                    obj = objW;
                    bool2 = insecure;
                }
            }
            return c71Var2;
        }
        if (i7 != 1) {
            if (i7 == 2) {
                subscriptionItem2 = rr7Var2.h0;
                w39.n0(obj);
                HappApplication happApplication2 = HappApplication.M0;
                k32.i().d().h(new uq0(subscriptionItem2, (byte) 16));
                throw new ym("Failed to start AntiFilter");
            }
            if (i7 == 3) {
                i3 = rr7Var2.p0;
                int i9 = rr7Var2.o0;
                boolean z5 = rr7Var2.n0;
                ea6 ea6Var3 = rr7Var2.l0;
                str8 = rr7Var2.g0;
                w39.n0(obj);
                z3 = z5;
                ea6Var = ea6Var3;
                r4 = 0;
                objB = ((sj6) obj).X;
                i2 = i9;
                c71Var = c71Var2;
                w39.n0(objB);
                importSubResult = (ImportSubResult) objB;
                kw4 kw4Var2 = kw4.a;
                subscriptionItemF = kw4.f(str8);
                r5 = r4;
                if (subscriptionItemF != null && (metaParams2 = subscriptionItemF.getMetaParams()) != null) {
                    gk7Var = (gk7) this.a.getValue();
                    zB0 = subscriptionItemF.b0();
                    rr7Var2.f0 = r4;
                    rr7Var2.g0 = r4;
                    rr7Var2.h0 = r4;
                    rr7Var2.i0 = r4;
                    rr7Var2.j0 = r4;
                    rr7Var2.k0 = r4;
                    rr7Var2.l0 = ea6Var;
                    rr7Var2.m0 = importSubResult;
                    rr7Var2.n0 = z3;
                    rr7Var2.o0 = i2;
                    rr7Var2.p0 = i3 == true ? 1 : 0;
                    rr7Var2.s0 = 4;
                    if (gk7Var.a(metaParams2, zB0, str8, rr7Var2) == c71Var) {
                        r5 = r4;
                        return c71Var;
                    }
                    r5 = r4;
                    i4 = i3 == true ? 1 : 0;
                    i5 = i2;
                    r6 = r4;
                    i2 = i5;
                    i3 = i4;
                    r5 = r6;
                }
                r5 = r4;
                importSubResult2 = importSubResult;
                nf1 nf1Var4 = tp1.a;
                hv2Var2 = dm4.a;
                cb2Var2 = new cb2(ea6Var, r5, (byte) 4);
                rr7Var2.f0 = r5;
                rr7Var2.g0 = r5;
                rr7Var2.h0 = r5;
                rr7Var2.i0 = r5;
                rr7Var2.j0 = r5;
                rr7Var2.k0 = r5;
                rr7Var2.l0 = r5;
                rr7Var2.m0 = importSubResult2;
                rr7Var2.n0 = z3;
                rr7Var2.o0 = i2;
                rr7Var2.p0 = i3;
                rr7Var2.s0 = 5;
                if (w51.W(hv2Var2, cb2Var2, rr7Var2) == c71Var) {
                    return c71Var;
                }
            } else if (i7 == 4) {
                i4 = rr7Var2.p0;
                i5 = rr7Var2.o0;
                boolean z6 = rr7Var2.n0;
                ImportSubResult importSubResult3 = rr7Var2.m0;
                ea6 ea6Var4 = rr7Var2.l0;
                w39.n0(obj);
                z3 = z6;
                ea6Var = ea6Var4;
                c71Var = c71Var2;
                importSubResult = importSubResult3;
                r6 = 0;
                i2 = i5;
                i3 = i4;
                r5 = r6;
                r5 = r4;
                importSubResult2 = importSubResult;
                nf1 nf1Var5 = tp1.a;
                hv2Var2 = dm4.a;
                cb2Var2 = new cb2(ea6Var, r5, (byte) 4);
                rr7Var2.f0 = r5;
                rr7Var2.g0 = r5;
                rr7Var2.h0 = r5;
                rr7Var2.i0 = r5;
                rr7Var2.j0 = r5;
                rr7Var2.k0 = r5;
                rr7Var2.l0 = r5;
                rr7Var2.m0 = importSubResult2;
                rr7Var2.n0 = z3;
                rr7Var2.o0 = i2;
                rr7Var2.p0 = i3;
                rr7Var2.s0 = 5;
                if (w51.W(hv2Var2, cb2Var2, rr7Var2) == c71Var) {
                    return c71Var;
                }
            } else {
                if (i7 != 5) {
                    bt.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                importSubResult2 = rr7Var2.m0;
                w39.n0(obj);
            }
            if (importSubResult2.getIsSubUpdateRequired() && dh3.f(importSubResult2.getNetworkResponse().a, "sub_restricted")) {
                throw new au7("Subscription is restricted");
            }
            if (importSubResult2.getErrorStatusCode() == null) {
                return importSubResult2.getNetworkResponse().a;
            }
            throw new qr7(importSubResult2.getErrorStatusCode());
        }
        i = rr7Var2.o0;
        boolean z7 = rr7Var2.n0;
        ea6Var2 = rr7Var2.l0;
        map = rr7Var2.k0;
        bool2 = rr7Var2.j0;
        str3 = rr7Var2.i0;
        SubscriptionItem subscriptionItem4 = rr7Var2.h0;
        str5 = rr7Var2.g0;
        str4 = rr7Var2.f0;
        w39.n0(obj);
        z2 = z7;
        subscriptionItem3 = subscriptionItem4;
        str7 = str5;
        str6 = str4;
        ea6Var = ea6Var2;
        mapI = map;
        z3 = z2;
        BooleanValue = ((Boolean) obj).booleanValue();
        if (BooleanValue == 0) {
            nf1 nf1Var6 = tp1.a;
            hv2Var = dm4.a;
            cb2Var = new cb2(ea6Var, q51Var, (byte) 3);
            rr7Var2.f0 = null;
            rr7Var2.g0 = null;
            rr7Var2.h0 = subscriptionItem3;
            rr7Var2.i0 = null;
            rr7Var2.j0 = null;
            rr7Var2.k0 = null;
            rr7Var2.l0 = null;
            rr7Var2.n0 = z3;
            rr7Var2.o0 = i;
            rr7Var2.p0 = BooleanValue;
            rr7Var2.s0 = 2;
            if (w51.W(hv2Var, cb2Var, rr7Var2) != c71Var2) {
                subscriptionItem2 = subscriptionItem3;
                HappApplication happApplication3 = HappApplication.M0;
                k32.i().d().h(new uq0(subscriptionItem2, (byte) 16));
                throw new ym("Failed to start AntiFilter");
            }
            return c71Var2;
        }
        a93 a93Var2 = (a93) this.b.getValue();
        if (i != 0) {
            proxy = new Proxy(Proxy.Type.SOCKS, new InetSocketAddress("127.0.0.1", n67.d()));
        } else {
            proxy = null;
        }
        if (bool2 != null) {
            zBooleanValue = bool2.booleanValue();
        } else {
            zBooleanValue = false;
        }
        r4 = 0;
        rr7Var2.f0 = null;
        rr7Var2.g0 = str7;
        rr7Var2.h0 = null;
        rr7Var2.i0 = null;
        rr7Var2.j0 = null;
        rr7Var2.k0 = null;
        rr7Var2.l0 = ea6Var;
        rr7Var2.n0 = z3;
        rr7Var2.o0 = i;
        rr7Var2.p0 = BooleanValue;
        rr7Var2.s0 = 3;
        String str10 = str3;
        boolean z8 = zBooleanValue;
        c71Var = c71Var2;
        objB = a93Var2.b(str6, str7, z3, proxy, mapI, str10, z8, rr7Var2);
        if (objB == c71Var) {
            return c71Var;
        }
        ?? r8 = BooleanValue;
        i2 = i;
        i3 = r8 == true ? 1 : 0;
        str8 = str7;
        w39.n0(objB);
        importSubResult = (ImportSubResult) objB;
        kw4 kw4Var3 = kw4.a;
        subscriptionItemF = kw4.f(str8);
        r5 = r4;
        if (subscriptionItemF != null) {
            gk7Var = (gk7) this.a.getValue();
            zB0 = subscriptionItemF.b0();
            rr7Var2.f0 = r4;
            rr7Var2.g0 = r4;
            rr7Var2.h0 = r4;
            rr7Var2.i0 = r4;
            rr7Var2.j0 = r4;
            rr7Var2.k0 = r4;
            rr7Var2.l0 = ea6Var;
            rr7Var2.m0 = importSubResult;
            rr7Var2.n0 = z3;
            rr7Var2.o0 = i2;
            rr7Var2.p0 = i3 == true ? 1 : 0;
            rr7Var2.s0 = 4;
            if (gk7Var.a(metaParams2, zB0, str8, rr7Var2) == c71Var) {
                r5 = r4;
                return c71Var;
            }
            r5 = r4;
            i4 = i3 == true ? 1 : 0;
            i5 = i2;
            r6 = r4;
            i2 = i5;
            i3 = i4;
            r5 = r6;
        }
        r5 = r4;
        importSubResult2 = importSubResult;
        nf1 nf1Var7 = tp1.a;
        hv2Var2 = dm4.a;
        cb2Var2 = new cb2(ea6Var, r5, (byte) 4);
        rr7Var2.f0 = r5;
        rr7Var2.g0 = r5;
        rr7Var2.h0 = r5;
        rr7Var2.i0 = r5;
        rr7Var2.j0 = r5;
        rr7Var2.k0 = r5;
        rr7Var2.l0 = r5;
        rr7Var2.m0 = importSubResult2;
        rr7Var2.n0 = z3;
        rr7Var2.o0 = i2;
        rr7Var2.p0 = i3;
        rr7Var2.s0 = 5;
        if (w51.W(hv2Var2, cb2Var2, rr7Var2) == c71Var) {
            return c71Var;
        }
        if (importSubResult2.getIsSubUpdateRequired()) {
        }
        if (importSubResult2.getErrorStatusCode() == null) {
            return importSubResult2.getNetworkResponse().a;
        }
        throw new qr7(importSubResult2.getErrorStatusCode());
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0100  */
    /* JADX WARN: Code duplicated, block: B:51:0x011f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:54:0x012d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(String str, String str2, gn2 gn2Var, s51 s51Var) {
        tr7 tr7Var;
        String str3;
        boolean z;
        gn2 gn2Var2;
        String str4;
        ImportResult importResult;
        String str5;
        boolean z2;
        gn2 gn2Var3;
        ImportResult importResultA;
        ImportResult importResult2;
        if (s51Var instanceof tr7) {
            tr7Var = (tr7) s51Var;
            int i = tr7Var.l0;
            if ((i & Integer.MIN_VALUE) != 0) {
                tr7Var.l0 = i - Integer.MIN_VALUE;
            } else {
                tr7Var = new tr7(this, s51Var);
            }
        } else {
            tr7Var = new tr7(this, s51Var);
        }
        Object objD = tr7Var.j0;
        int i2 = tr7Var.l0;
        ImportResult importResult3 = null;
        c71 c71Var = c71.X;
        if (i2 == 0) {
            w39.n0(objD);
            if (fm7.o0(str)) {
                throw new xz1("Empty batch input");
            }
            boolean zO0 = fm7.o0(str2);
            kw2 kw2Var = kw2.a;
            tr7Var.f0 = str;
            tr7Var.g0 = str2;
            tr7Var.h0 = gn2Var;
            tr7Var.i0 = zO0;
            tr7Var.l0 = 1;
            Object objD2 = kw2Var.d(str, str2, zO0, tr7Var);
            if (objD2 != c71Var) {
                str3 = str2;
                z = zO0;
                objD = objD2;
            }
            return c71Var;
        }
        if (i2 == 1) {
            boolean z3 = tr7Var.i0;
            gn2Var = tr7Var.h0;
            String str6 = tr7Var.g0;
            String str7 = tr7Var.f0;
            w39.n0(objD);
            str3 = str6;
            z = z3;
            str = str7;
        } else {
            if (i2 != 2) {
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z2 = tr7Var.i0;
            gn2Var3 = tr7Var.h0;
            str4 = tr7Var.g0;
            str5 = tr7Var.f0;
            w39.n0(objD);
        }
        importResult2 = (ImportResult) objD;
        HappApplication happApplication = HappApplication.M0;
        k32.i().d().h(new qj4(importResult2, (byte) 4));
        if ((importResult2.getStatus() instanceof v83) && (gn2Var3 == null || !((Boolean) gn2Var3.B(importResult2)).booleanValue())) {
            objD = null;
        }
        importResult = (ImportResult) objD;
        gn2 gn2Var4 = gn2Var3;
        z = z2;
        str = str5;
        gn2Var2 = gn2Var4;
        if (importResult != null || importResult.getCount() <= 0) {
            kw2 kw2Var2 = kw2.a;
            importResultA = kw2.a(str, z, str4);
            k32.i().d().h(new qj4(importResultA, (byte) 5));
            if ((importResultA.getStatus() instanceof v83) || (gn2Var2 != null && ((Boolean) gn2Var2.B(importResultA)).booleanValue())) {
                importResult3 = importResultA;
            }
            importResult = importResult3;
        }
        if (importResult == null && importResult.getCount() > 0) {
            return importResult;
        }
        kw4 kw4Var = kw4.a;
        kw4.r(str4);
        return importResult;
        gn2Var2 = gn2Var;
        str4 = str3;
        ImportResult importResult4 = (ImportResult) objD;
        HappApplication happApplication2 = HappApplication.M0;
        k32.i().d().h(new qj4(importResult4, (byte) 3));
        if ((importResult4.getStatus() instanceof v83) && (gn2Var2 == null || !((Boolean) gn2Var2.B(importResult4)).booleanValue())) {
            objD = null;
        }
        importResult = (ImportResult) objD;
        if (importResult == null || importResult.getCount() <= 0) {
            kw2 kw2Var3 = kw2.a;
            ss8 ss8Var = ss8.a;
            String strA = ss8.a(str);
            tr7Var.f0 = str;
            tr7Var.g0 = str4;
            tr7Var.h0 = gn2Var2;
            tr7Var.i0 = z;
            tr7Var.l0 = 2;
            objD = kw2Var3.d(strA, str4, z, tr7Var);
            if (objD != c71Var) {
                str5 = str;
                z2 = z;
                gn2Var3 = gn2Var2;
                importResult2 = (ImportResult) objD;
                HappApplication happApplication3 = HappApplication.M0;
                k32.i().d().h(new qj4(importResult2, (byte) 4));
                if (importResult2.getStatus() instanceof v83) {
                    objD = null;
                }
                importResult = (ImportResult) objD;
                gn2 gn2Var5 = gn2Var3;
                z = z2;
                str = str5;
                gn2Var2 = gn2Var5;
            }
            return c71Var;
        }
        if (importResult != null) {
            kw2 kw2Var4 = kw2.a;
            importResultA = kw2.a(str, z, str4);
            k32.i().d().h(new qj4(importResultA, (byte) 5));
            if (importResultA.getStatus() instanceof v83) {
                importResult3 = importResultA;
            } else {
                importResult3 = importResultA;
            }
            importResult = importResult3;
        } else {
            kw2 kw2Var5 = kw2.a;
            importResultA = kw2.a(str, z, str4);
            k32.i().d().h(new qj4(importResultA, (byte) 5));
            if (importResultA.getStatus() instanceof v83) {
                importResult3 = importResultA;
            } else {
                importResult3 = importResultA;
            }
            importResult = importResult3;
        }
        if (importResult == null) {
        }
        kw4 kw4Var2 = kw4.a;
        kw4.r(str4);
        return importResult;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0089  */
    /* JADX WARN: Code duplicated, block: B:36:0x0090  */
    /* JADX WARN: Code duplicated, block: B:38:0x0096  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:43:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:46:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object c(String str, String str2, SubscriptionItem subscriptionItem, gn2 gn2Var, rn2 rn2Var, s51 s51Var) {
        ur7 ur7Var;
        rn2 rn2Var2;
        ImportResult importResult;
        SubscriptionItem subscriptionItem2;
        boolean z;
        MetaParams metaParams;
        SubscriptionItem subscriptionItemF;
        Map fragmentBean;
        if (s51Var instanceof ur7) {
            ur7Var = (ur7) s51Var;
            int i = ur7Var.l0;
            if ((i & Integer.MIN_VALUE) != 0) {
                ur7Var.l0 = i - Integer.MIN_VALUE;
            } else {
                ur7Var = new ur7(this, s51Var);
            }
        } else {
            ur7Var = new ur7(this, s51Var);
        }
        Object objB = ur7Var.j0;
        int i2 = ur7Var.l0;
        Object obj = c71.X;
        if (i2 == 0) {
            w39.n0(objB);
            ur7Var.f0 = str2;
            ur7Var.g0 = subscriptionItem;
            ur7Var.h0 = (uy7) rn2Var;
            ur7Var.l0 = 1;
            objB = b(str, str2, gn2Var, ur7Var);
            if (objB != obj) {
            }
            rn2Var2 = rn2Var;
            return obj;
        }
        if (i2 == 1) {
            rn2 rn2Var3 = (rn2) ur7Var.h0;
            subscriptionItem = ur7Var.g0;
            str2 = ur7Var.f0;
            w39.n0(objB);
            rn2Var2 = rn2Var3;
        } else {
            if (i2 != 2) {
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            importResult = ur7Var.i0;
            subscriptionItem2 = ur7Var.g0;
            str2 = ur7Var.f0;
            w39.n0(objB);
        }
        subscriptionItem = subscriptionItem2;
        if (importResult != null || (!dh3.f(importResult.getStatus(), w83.a) && importResult.getCount() <= 0)) {
            z = false;
        } else {
            z = true;
        }
        metaParams = subscriptionItem.getMetaParams();
        if (metaParams != null) {
            fragmentBean = metaParams.getFragmentBean();
            if (!eu.q0(new Object[]{fragmentBean != null ? new XRayConfig.OutboundBean.StreamSettingsBean.TcpMasksBean.TcpMaskSettingBean(fragmentBean) : null, metaParams.getResolveAddress(), metaParams.getHost(), metaParams.getInsecure()}).isEmpty()) {
                HappApplication happApplication = HappApplication.M0;
                k32.i().d().h(new za2(metaParams, subscriptionItem, (byte) 3));
            }
        }
        if (z) {
            kw4 kw4Var = kw4.a;
            subscriptionItemF = kw4.f(str2);
            if (subscriptionItemF != null) {
                kw4.u(SubscriptionItem.d(subscriptionItemF, y08.c(), false, null, false, null, 268434943), str2);
            }
        }
        return Boolean.valueOf(z);
        rn2Var2 = rn2Var;
        importResult = (ImportResult) objB;
        if (importResult != null && rn2Var2 != null) {
            ur7Var.f0 = str2;
            ur7Var.g0 = subscriptionItem;
            ur7Var.h0 = null;
            ur7Var.i0 = importResult;
            ur7Var.l0 = 2;
            if (rn2Var2.K(importResult, ur7Var) != obj) {
                subscriptionItem2 = subscriptionItem;
                subscriptionItem = subscriptionItem2;
            }
            rn2Var2 = rn2Var;
            return obj;
        }
        if (importResult != null) {
            z = false;
        } else {
            z = false;
        }
        metaParams = subscriptionItem.getMetaParams();
        if (metaParams != null) {
            fragmentBean = metaParams.getFragmentBean();
            if (!eu.q0(new Object[]{fragmentBean != null ? new XRayConfig.OutboundBean.StreamSettingsBean.TcpMasksBean.TcpMaskSettingBean(fragmentBean) : null, metaParams.getResolveAddress(), metaParams.getHost(), metaParams.getInsecure()}).isEmpty()) {
                HappApplication happApplication2 = HappApplication.M0;
                k32.i().d().h(new za2(metaParams, subscriptionItem, (byte) 3));
            }
        }
        if (z) {
            kw4 kw4Var2 = kw4.a;
            subscriptionItemF = kw4.f(str2);
            if (subscriptionItemF != null) {
                kw4.u(SubscriptionItem.d(subscriptionItemF, y08.c(), false, null, false, null, 268434943), str2);
            }
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x017c A[Catch: all -> 0x017a, TryCatch #10 {all -> 0x017a, blocks: (B:93:0x0160, B:95:0x0166, B:100:0x017c, B:102:0x0182, B:104:0x0198, B:155:0x0243, B:243:0x03e4, B:87:0x0151, B:89:0x0155, B:91:0x0159, B:242:0x03e3), top: B:264:0x0151, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:102:0x0182 A[Catch: all -> 0x017a, TryCatch #10 {all -> 0x017a, blocks: (B:93:0x0160, B:95:0x0166, B:100:0x017c, B:102:0x0182, B:104:0x0198, B:155:0x0243, B:243:0x03e4, B:87:0x0151, B:89:0x0155, B:91:0x0159, B:242:0x03e3), top: B:264:0x0151, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:104:0x0198 A[Catch: all -> 0x017a, TRY_LEAVE, TryCatch #10 {all -> 0x017a, blocks: (B:93:0x0160, B:95:0x0166, B:100:0x017c, B:102:0x0182, B:104:0x0198, B:155:0x0243, B:243:0x03e4, B:87:0x0151, B:89:0x0155, B:91:0x0159, B:242:0x03e3), top: B:264:0x0151, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:117:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:124:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:144:0x0223 A[Catch: all -> 0x023e, TryCatch #13 {, blocks: (B:142:0x021f, B:144:0x0223, B:146:0x0227, B:152:0x0240), top: B:285:0x021f, outer: #14 }] */
    /* JADX WARN: Code duplicated, block: B:154:0x0242  */
    /* JADX WARN: Code duplicated, block: B:159:0x026f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:163:0x0278  */
    /* JADX WARN: Code duplicated, block: B:166:0x027d  */
    /* JADX WARN: Code duplicated, block: B:167:0x0280 A[Catch: all -> 0x0040, TryCatch #14 {all -> 0x0040, blocks: (B:17:0x003b, B:230:0x03c8, B:232:0x03d0, B:221:0x038a, B:224:0x038f, B:227:0x0395, B:237:0x03d8, B:148:0x022e, B:157:0x025b, B:160:0x0271, B:161:0x0274, B:164:0x0279, B:167:0x0280, B:169:0x0286, B:238:0x03d9, B:239:0x03e0, B:153:0x0241, B:142:0x021f, B:144:0x0223, B:146:0x0227, B:152:0x0240, B:216:0x037d, B:218:0x0381, B:220:0x0385, B:236:0x03d7), top: B:286:0x002d, inners: #13, #23 }] */
    /* JADX WARN: Code duplicated, block: B:169:0x0286 A[Catch: all -> 0x0040, TRY_LEAVE, TryCatch #14 {all -> 0x0040, blocks: (B:17:0x003b, B:230:0x03c8, B:232:0x03d0, B:221:0x038a, B:224:0x038f, B:227:0x0395, B:237:0x03d8, B:148:0x022e, B:157:0x025b, B:160:0x0271, B:161:0x0274, B:164:0x0279, B:167:0x0280, B:169:0x0286, B:238:0x03d9, B:239:0x03e0, B:153:0x0241, B:142:0x021f, B:144:0x0223, B:146:0x0227, B:152:0x0240, B:216:0x037d, B:218:0x0381, B:220:0x0385, B:236:0x03d7), top: B:286:0x002d, inners: #13, #23 }] */
    /* JADX WARN: Code duplicated, block: B:173:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:176:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:177:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:179:0x02da A[Catch: all -> 0x007b, TryCatch #11 {all -> 0x007b, blocks: (B:30:0x0075, B:174:0x02ca, B:179:0x02da, B:182:0x02e1, B:184:0x02f7), top: B:281:0x0075 }] */
    /* JADX WARN: Code duplicated, block: B:184:0x02f7 A[Catch: all -> 0x007b, TRY_LEAVE, TryCatch #11 {all -> 0x007b, blocks: (B:30:0x0075, B:174:0x02ca, B:179:0x02da, B:182:0x02e1, B:184:0x02f7), top: B:281:0x0075 }] */
    /* JADX WARN: Code duplicated, block: B:195:0x0320  */
    /* JADX WARN: Code duplicated, block: B:202:0x035b  */
    /* JADX WARN: Code duplicated, block: B:218:0x0381 A[Catch: all -> 0x03d5, TryCatch #23 {, blocks: (B:216:0x037d, B:218:0x0381, B:220:0x0385, B:236:0x03d7), top: B:302:0x037d, outer: #14 }] */
    /* JADX WARN: Code duplicated, block: B:223:0x038e  */
    /* JADX WARN: Code duplicated, block: B:226:0x0393  */
    /* JADX WARN: Code duplicated, block: B:227:0x0395 A[Catch: all -> 0x0040, TryCatch #14 {all -> 0x0040, blocks: (B:17:0x003b, B:230:0x03c8, B:232:0x03d0, B:221:0x038a, B:224:0x038f, B:227:0x0395, B:237:0x03d8, B:148:0x022e, B:157:0x025b, B:160:0x0271, B:161:0x0274, B:164:0x0279, B:167:0x0280, B:169:0x0286, B:238:0x03d9, B:239:0x03e0, B:153:0x0241, B:142:0x021f, B:144:0x0223, B:146:0x0227, B:152:0x0240, B:216:0x037d, B:218:0x0381, B:220:0x0385, B:236:0x03d7), top: B:286:0x002d, inners: #13, #23 }] */
    /* JADX WARN: Code duplicated, block: B:238:0x03d9 A[Catch: all -> 0x0040, TryCatch #14 {all -> 0x0040, blocks: (B:17:0x003b, B:230:0x03c8, B:232:0x03d0, B:221:0x038a, B:224:0x038f, B:227:0x0395, B:237:0x03d8, B:148:0x022e, B:157:0x025b, B:160:0x0271, B:161:0x0274, B:164:0x0279, B:167:0x0280, B:169:0x0286, B:238:0x03d9, B:239:0x03e0, B:153:0x0241, B:142:0x021f, B:144:0x0223, B:146:0x0227, B:152:0x0240, B:216:0x037d, B:218:0x0381, B:220:0x0385, B:236:0x03d7), top: B:286:0x002d, inners: #13, #23 }] */
    /* JADX WARN: Code duplicated, block: B:247:0x03ea  */
    /* JADX WARN: Code duplicated, block: B:252:0x03fd  */
    /* JADX WARN: Code duplicated, block: B:89:0x0155 A[Catch: all -> 0x03e1, TryCatch #0 {, blocks: (B:87:0x0151, B:89:0x0155, B:91:0x0159, B:242:0x03e3), top: B:264:0x0151, outer: #10 }] */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code duplicated, block: B:95:0x0166 A[Catch: all -> 0x017a, TryCatch #10 {all -> 0x017a, blocks: (B:93:0x0160, B:95:0x0166, B:100:0x017c, B:102:0x0182, B:104:0x0198, B:155:0x0243, B:243:0x03e4, B:87:0x0151, B:89:0x0155, B:91:0x0159, B:242:0x03e3), top: B:264:0x0151, inners: #0 }] */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x03c5, code lost:
    
        if (r0 == r13) goto L229;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.lang.String r18, boolean r19, java.lang.String r20, defpackage.dn2 r21, defpackage.gn2 r22, defpackage.gn2 r23, defpackage.sn2 r24, java.lang.Boolean r25, defpackage.s51 r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1062
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xr7.d(java.lang.String, boolean, java.lang.String, dn2, gn2, gn2, sn2, java.lang.Boolean, s51):java.lang.Object");
    }
}
