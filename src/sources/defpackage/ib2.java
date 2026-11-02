package defpackage;

import android.content.Context;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import su.happ.proxyutility.HappApplication;
import su.happ.proxyutility.domain.sub.ImportSubResult;
import su.happ.proxyutility.domain.sub.SubId;
import su.happ.proxyutility.dto.ImportResult;
import su.happ.proxyutility.dto.MetaParams;
import su.happ.proxyutility.dto.ProviderId;
import su.happ.proxyutility.dto.SubscriptionItem;
import su.happ.proxyutility.dto.XRayConfig;
import su.happ.proxyutility.dto.enums.SubInfoColor;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class ib2 {
    public final vz7 a = new vz7(new j72((byte) 3));
    public final vz7 b = new vz7(new j72((byte) 4));
    public final vz7 c = new vz7(new j72((byte) 5));
    public final vz7 d = new vz7(new j72((byte) 6));

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String b(hd6 hd6Var) {
        String string;
        String str = (String) hd6Var.c().get(MetaParams.PROVIDER_ID);
        if (str == null || (string = fm7.R0(str).toString()) == null) {
            return null;
        }
        ProviderId.Companion companion = ProviderId.INSTANCE;
        return string;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String c(hd6 hd6Var) {
        String str = (String) hd6Var.c().get(MetaParams.SUB_EXPIRE_BUTTON_LINK);
        if (str != null) {
            return fm7.R0(str).toString();
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String d(hd6 hd6Var) {
        String str = (String) hd6Var.c().get(MetaParams.SUB_INFO_BUTTON_LINK);
        if (str != null) {
            return fm7.R0(str).toString();
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String e(hd6 hd6Var) {
        String string;
        String str = (String) hd6Var.c().get(MetaParams.SUB_INFO_BUTTON_TEXT);
        if (str == null || (string = fm7.R0(str).toString()) == null) {
            return null;
        }
        if (mm7.Z(string, false, MetaParams.PREFIX_BASE_64)) {
            ss8 ss8Var = ss8.a;
            string = ss8.a(fm7.R0(fm7.f0(7, string)).toString());
        }
        return fm7.Q0(25, string);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static SubInfoColor f(hd6 hd6Var) {
        String string;
        String str = (String) hd6Var.c().get(MetaParams.SUB_INFO_COLOR);
        if (str == null || (string = fm7.R0(str).toString()) == null) {
            return null;
        }
        SubInfoColor.INSTANCE.getClass();
        return SubInfoColor.Companion.a(string);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String g(hd6 hd6Var) {
        String string;
        String str = (String) hd6Var.c().get(MetaParams.SUB_INFO_TEXT);
        if (str == null || (string = fm7.R0(str).toString()) == null) {
            return null;
        }
        if (mm7.Z(string, false, MetaParams.PREFIX_BASE_64)) {
            ss8 ss8Var = ss8.a;
            string = ss8.a(fm7.R0(fm7.f0(7, string)).toString());
        }
        return fm7.Q0(MetaParams.MAX_LENGTH_VISIBLE_ANNOUNCE, string);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code duplicated, block: B:60:0x0141  */
    /* JADX WARN: Code duplicated, block: B:65:0x0180  */
    /* JADX WARN: Code duplicated, block: B:67:0x0190  */
    /* JADX WARN: Code duplicated, block: B:68:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:70:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:72:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:76:0x01db  */
    /* JADX WARN: Code duplicated, block: B:79:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:89:0x0255  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Code duplicated, block: B:92:0x0264  */
    /* JADX WARN: Code duplicated, block: B:97:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0165, code lost:
    
        if (w51.W(r3, r5, r12) == r8) goto L56;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [int] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v9, types: [int] */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v20, types: [ib2, java.lang.Boolean, java.lang.String, java.util.HashMap, su.happ.proxyutility.dto.SubscriptionItem] */
    /* JADX WARN: Type inference failed for: r3v21, types: [ea6, ib2, java.lang.Boolean, java.lang.String, java.util.HashMap, q51, su.happ.proxyutility.dto.SubscriptionItem] */
    /* JADX WARN: Type inference failed for: r3v22, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v32 */
    /* JADX WARN: Type inference failed for: r3v33 */
    /* JADX WARN: Type inference failed for: r3v34 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object i(SubscriptionItem subscriptionItem, String str, ib2 ib2Var, String str2, MetaParams metaParams, s51 s51Var) {
        bb2 bb2Var;
        Map mapE;
        String strT;
        String strH;
        String str3;
        Boolean boolL;
        Boolean bool;
        int i;
        HashMap mapI;
        String str4;
        ea6 ea6Var;
        String str5;
        ib2 ib2Var2;
        HashMap map;
        Boolean bool2;
        String str6;
        int i2;
        ?? BooleanValue;
        ea6 ea6Var2;
        Proxy proxy;
        boolean zBooleanValue;
        String str7;
        c71 c71Var;
        ?? r3;
        ea6 ea6Var3;
        Object objB;
        ea6 ea6Var4;
        ?? r0;
        Object obj;
        String str8;
        ImportSubResult importSubResult;
        SubscriptionItem subscriptionItemF;
        MetaParams metaParams2;
        gk7 gk7Var;
        boolean zB0;
        ?? r4;
        ?? r1;
        ImportSubResult importSubResult2;
        hv2 hv2Var;
        cb2 cb2Var;
        ?? r5;
        SubscriptionItem subscriptionItem2 = subscriptionItem;
        if (s51Var instanceof bb2) {
            bb2Var = (bb2) s51Var;
            int i3 = bb2Var.r0;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                bb2Var.r0 = i3 - Integer.MIN_VALUE;
            } else {
                bb2Var = new bb2(s51Var);
            }
        } else {
            bb2Var = new bb2(s51Var);
        }
        bb2 bb2Var2 = bb2Var;
        Object obj2 = bb2Var2.q0;
        int i4 = bb2Var2.r0;
        byte b = 1;
        c71 c71Var2 = c71.X;
        if (i4 == 0) {
            w39.n0(obj2);
            if (metaParams == null || (mapE = metaParams.getFragmentBean()) == null) {
                mapE = subscriptionItem2.E();
            }
            if (metaParams == null || (strT = metaParams.getResolveAddress()) == null) {
                strT = subscriptionItem2.T();
            }
            if (metaParams == null || (strH = metaParams.getHost()) == null) {
                strH = subscriptionItem2.H();
            }
            str3 = strH;
            if (metaParams == null || (boolL = metaParams.getInsecure()) == null) {
                boolL = subscriptionItem2.L();
            }
            bool = boolL;
            i = mapE != null ? 1 : 0;
            mapI = strT != null ? zp4.I(new qg5[]{new qg5(new URL(subscriptionItem2.e(str2)).getHost(), strT)}) : null;
            ea6 ea6Var5 = new ea6();
            if (i == 0) {
                map = mapI;
                bool2 = bool;
                str5 = str;
                ib2Var2 = ib2Var;
                str6 = str2;
                i2 = i;
                BooleanValue = 0;
                ea6Var2 = ea6Var5;
                if (BooleanValue != 0) {
                    HappApplication happApplication = HappApplication.M0;
                    a93 a93Var = (a93) k32.i().C0.getValue();
                    if (i2 != 0) {
                        proxy = new Proxy(Proxy.Type.SOCKS, new InetSocketAddress("127.0.0.1", n67.d()));
                    } else {
                        proxy = null;
                    }
                    if (bool2 != null) {
                        zBooleanValue = bool2.booleanValue();
                    } else {
                        zBooleanValue = false;
                    }
                    bb2Var2.f0 = null;
                    bb2Var2.g0 = str5;
                    bb2Var2.h0 = ib2Var2;
                    bb2Var2.i0 = null;
                    bb2Var2.j0 = null;
                    bb2Var2.k0 = null;
                    bb2Var2.l0 = null;
                    bb2Var2.m0 = ea6Var2;
                    bb2Var2.o0 = i2;
                    bb2Var2.p0 = BooleanValue;
                    bb2Var2.r0 = 3;
                    Proxy proxy2 = proxy;
                    boolean z = zBooleanValue;
                    str7 = str5;
                    c71Var = c71Var2;
                    r3 = 0;
                    ea6Var3 = ea6Var2;
                    objB = a93Var.b(str6, str7, false, proxy2, map, str3, z, bb2Var2);
                    if (objB == c71Var) {
                        return c71Var;
                    }
                    ea6Var4 = ea6Var3;
                    r0 = BooleanValue;
                    obj = objB;
                    str8 = str7;
                    w39.n0(obj);
                    importSubResult = (ImportSubResult) obj;
                    kw4 kw4Var = kw4.a;
                    subscriptionItemF = kw4.f(str8);
                    r1 = r0;
                    r4 = r3;
                    if (subscriptionItemF != null) {
                        gk7Var = (gk7) ib2Var2.b.getValue();
                        zB0 = subscriptionItemF.b0();
                        bb2Var2.f0 = r3;
                        bb2Var2.g0 = r3;
                        bb2Var2.h0 = r3;
                        bb2Var2.i0 = r3;
                        bb2Var2.j0 = r3;
                        bb2Var2.k0 = r3;
                        bb2Var2.l0 = r3;
                        bb2Var2.m0 = ea6Var4;
                        bb2Var2.n0 = importSubResult;
                        bb2Var2.o0 = i2;
                        bb2Var2.p0 = r0;
                        bb2Var2.r0 = 4;
                        if (gk7Var.a(metaParams2, zB0, str8, bb2Var2) == c71Var) {
                            r1 = r0;
                            r4 = r3;
                            r1 = r0;
                            r4 = r3;
                            return c71Var;
                        }
                    }
                    r1 = r0;
                    r4 = r3;
                    r1 = r0;
                    r4 = r3;
                    r1 = r0;
                    r4 = r3;
                    int i5 = i2;
                    ?? r2 = r1;
                    importSubResult2 = importSubResult;
                    nf1 nf1Var = tp1.a;
                    hv2Var = dm4.a;
                    cb2Var = new cb2(ea6Var4, r4, (byte) 1);
                    bb2Var2.f0 = r4;
                    bb2Var2.g0 = r4;
                    bb2Var2.h0 = r4;
                    bb2Var2.i0 = r4;
                    bb2Var2.j0 = r4;
                    bb2Var2.k0 = r4;
                    bb2Var2.l0 = r4;
                    bb2Var2.m0 = r4;
                    bb2Var2.n0 = importSubResult2;
                    bb2Var2.o0 = i5;
                    bb2Var2.p0 = r2 == true ? 1 : 0;
                    bb2Var2.r0 = 5;
                    r5 = r4;
                    if (w51.W(hv2Var, cb2Var, bb2Var2) == c71Var) {
                        return c71Var;
                    }
                    if (importSubResult2.d()) {
                    }
                }
                nf1 nf1Var2 = tp1.a;
                hv2 hv2Var2 = dm4.a;
                cb2 cb2Var2 = new cb2(ea6Var2, null, (byte) 0);
                bb2Var2.f0 = subscriptionItem2;
                bb2Var2.g0 = null;
                bb2Var2.h0 = null;
                bb2Var2.i0 = null;
                bb2Var2.j0 = null;
                bb2Var2.k0 = null;
                bb2Var2.l0 = null;
                bb2Var2.m0 = null;
                bb2Var2.o0 = i2;
                bb2Var2.p0 = BooleanValue;
                bb2Var2.r0 = 2;
            } else {
                nf1 nf1Var3 = tp1.a;
                hv2 hv2Var3 = dm4.a;
                db2 db2Var = new db2(ea6Var5, mapE, mapI, null);
                bb2Var2.f0 = subscriptionItem2;
                bb2Var2.g0 = str;
                bb2Var2.h0 = ib2Var;
                bb2Var2.i0 = str2;
                bb2Var2.j0 = str3;
                bb2Var2.k0 = bool;
                bb2Var2.l0 = mapI;
                bb2Var2.m0 = ea6Var5;
                bb2Var2.o0 = i;
                bb2Var2.r0 = 1;
                Object objW = w51.W(hv2Var3, db2Var, bb2Var2);
                if (objW != c71Var2) {
                    str4 = str2;
                    ea6Var = ea6Var5;
                    str5 = str;
                    obj2 = objW;
                    ib2Var2 = ib2Var;
                }
            }
            return c71Var2;
        }
        if (i4 != 1) {
            if (i4 == 2) {
                subscriptionItem2 = bb2Var2.f0;
                w39.n0(obj2);
                HappApplication happApplication2 = HappApplication.M0;
                k32.i().d().h(new uq0(subscriptionItem2, b));
                kp5.t("Failed to start AntiFilter");
                return null;
            }
            if (i4 == 3) {
                int i6 = bb2Var2.p0;
                i2 = bb2Var2.o0;
                ea6 ea6Var6 = bb2Var2.m0;
                ib2 ib2Var3 = bb2Var2.h0;
                str8 = bb2Var2.g0;
                w39.n0(obj2);
                obj = ((sj6) obj2).X;
                ib2Var2 = ib2Var3;
                c71Var = c71Var2;
                ea6Var4 = ea6Var6;
                r3 = 0;
                r0 = i6;
                w39.n0(obj);
                importSubResult = (ImportSubResult) obj;
                kw4 kw4Var2 = kw4.a;
                subscriptionItemF = kw4.f(str8);
                r1 = r0;
                r4 = r3;
                if (subscriptionItemF != null && (metaParams2 = subscriptionItemF.getMetaParams()) != null) {
                    gk7Var = (gk7) ib2Var2.b.getValue();
                    zB0 = subscriptionItemF.b0();
                    bb2Var2.f0 = r3;
                    bb2Var2.g0 = r3;
                    bb2Var2.h0 = r3;
                    bb2Var2.i0 = r3;
                    bb2Var2.j0 = r3;
                    bb2Var2.k0 = r3;
                    bb2Var2.l0 = r3;
                    bb2Var2.m0 = ea6Var4;
                    bb2Var2.n0 = importSubResult;
                    bb2Var2.o0 = i2;
                    bb2Var2.p0 = r0;
                    bb2Var2.r0 = 4;
                    if (gk7Var.a(metaParams2, zB0, str8, bb2Var2) == c71Var) {
                        r1 = r0;
                        r4 = r3;
                        r1 = r0;
                        r4 = r3;
                        return c71Var;
                    }
                }
                r1 = r0;
                r4 = r3;
                r1 = r0;
                r4 = r3;
                r1 = r0;
                r4 = r3;
                int i7 = i2;
                ?? r6 = r1;
                importSubResult2 = importSubResult;
                nf1 nf1Var4 = tp1.a;
                hv2Var = dm4.a;
                cb2Var = new cb2(ea6Var4, r4, (byte) 1);
                bb2Var2.f0 = r4;
                bb2Var2.g0 = r4;
                bb2Var2.h0 = r4;
                bb2Var2.i0 = r4;
                bb2Var2.j0 = r4;
                bb2Var2.k0 = r4;
                bb2Var2.l0 = r4;
                bb2Var2.m0 = r4;
                bb2Var2.n0 = importSubResult2;
                bb2Var2.o0 = i7;
                bb2Var2.p0 = r6 == true ? 1 : 0;
                bb2Var2.r0 = 5;
                r5 = r4;
                if (w51.W(hv2Var, cb2Var, bb2Var2) == c71Var) {
                    return c71Var;
                }
            } else if (i4 == 4) {
                int i8 = bb2Var2.p0;
                i2 = bb2Var2.o0;
                ImportSubResult importSubResult3 = bb2Var2.n0;
                ea6Var4 = bb2Var2.m0;
                w39.n0(obj2);
                importSubResult = importSubResult3;
                r4 = 0;
                c71Var = c71Var2;
                r1 = i8;
                r1 = r0;
                r4 = r3;
                r1 = r0;
                r4 = r3;
                r1 = r0;
                r4 = r3;
                int i9 = i2;
                ?? r7 = r1;
                importSubResult2 = importSubResult;
                nf1 nf1Var5 = tp1.a;
                hv2Var = dm4.a;
                cb2Var = new cb2(ea6Var4, r4, (byte) 1);
                bb2Var2.f0 = r4;
                bb2Var2.g0 = r4;
                bb2Var2.h0 = r4;
                bb2Var2.i0 = r4;
                bb2Var2.j0 = r4;
                bb2Var2.k0 = r4;
                bb2Var2.l0 = r4;
                bb2Var2.m0 = r4;
                bb2Var2.n0 = importSubResult2;
                bb2Var2.o0 = i9;
                bb2Var2.p0 = r7 == true ? 1 : 0;
                bb2Var2.r0 = 5;
                r5 = r4;
                if (w51.W(hv2Var, cb2Var, bb2Var2) == c71Var) {
                    return c71Var;
                }
            } else {
                if (i4 != 5) {
                    bt.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                importSubResult2 = bb2Var2.n0;
                w39.n0(obj2);
                r5 = 0;
            }
            return (!(importSubResult2.d() && dh3.f(importSubResult2.c().a, "sub_restricted")) && importSubResult2.b() == null) ? importSubResult2.c().a : r5;
        }
        int i10 = bb2Var2.o0;
        ea6Var = bb2Var2.m0;
        mapI = bb2Var2.l0;
        bool = bb2Var2.k0;
        str3 = bb2Var2.j0;
        str4 = bb2Var2.i0;
        ib2Var2 = bb2Var2.h0;
        str5 = bb2Var2.g0;
        SubscriptionItem subscriptionItem3 = bb2Var2.f0;
        w39.n0(obj2);
        i = i10;
        subscriptionItem2 = subscriptionItem3;
        int i11 = i;
        ea6Var2 = ea6Var;
        i2 = i11;
        Boolean bool3 = bool;
        map = mapI;
        bool2 = bool3;
        str6 = str4;
        BooleanValue = ((Boolean) obj2).booleanValue();
        if (BooleanValue != 0) {
            HappApplication happApplication3 = HappApplication.M0;
            a93 a93Var2 = (a93) k32.i().C0.getValue();
            if (i2 != 0) {
                proxy = new Proxy(Proxy.Type.SOCKS, new InetSocketAddress("127.0.0.1", n67.d()));
            } else {
                proxy = null;
            }
            if (bool2 != null) {
                zBooleanValue = bool2.booleanValue();
            } else {
                zBooleanValue = false;
            }
            bb2Var2.f0 = null;
            bb2Var2.g0 = str5;
            bb2Var2.h0 = ib2Var2;
            bb2Var2.i0 = null;
            bb2Var2.j0 = null;
            bb2Var2.k0 = null;
            bb2Var2.l0 = null;
            bb2Var2.m0 = ea6Var2;
            bb2Var2.o0 = i2;
            bb2Var2.p0 = BooleanValue;
            bb2Var2.r0 = 3;
            Proxy proxy3 = proxy;
            boolean z2 = zBooleanValue;
            str7 = str5;
            c71Var = c71Var2;
            r3 = 0;
            ea6Var3 = ea6Var2;
            objB = a93Var2.b(str6, str7, false, proxy3, map, str3, z2, bb2Var2);
            if (objB == c71Var) {
                return c71Var;
            }
            ea6Var4 = ea6Var3;
            r0 = BooleanValue;
            obj = objB;
            str8 = str7;
            w39.n0(obj);
            importSubResult = (ImportSubResult) obj;
            kw4 kw4Var3 = kw4.a;
            subscriptionItemF = kw4.f(str8);
            r1 = r0;
            r4 = r3;
            if (subscriptionItemF != null) {
                gk7Var = (gk7) ib2Var2.b.getValue();
                zB0 = subscriptionItemF.b0();
                bb2Var2.f0 = r3;
                bb2Var2.g0 = r3;
                bb2Var2.h0 = r3;
                bb2Var2.i0 = r3;
                bb2Var2.j0 = r3;
                bb2Var2.k0 = r3;
                bb2Var2.l0 = r3;
                bb2Var2.m0 = ea6Var4;
                bb2Var2.n0 = importSubResult;
                bb2Var2.o0 = i2;
                bb2Var2.p0 = r0;
                bb2Var2.r0 = 4;
                if (gk7Var.a(metaParams2, zB0, str8, bb2Var2) == c71Var) {
                    r1 = r0;
                    r4 = r3;
                    r1 = r0;
                    r4 = r3;
                    return c71Var;
                }
            }
            r1 = r0;
            r4 = r3;
            r1 = r0;
            r4 = r3;
            r1 = r0;
            r4 = r3;
            int i12 = i2;
            ?? r8 = r1;
            importSubResult2 = importSubResult;
            nf1 nf1Var6 = tp1.a;
            hv2Var = dm4.a;
            cb2Var = new cb2(ea6Var4, r4, (byte) 1);
            bb2Var2.f0 = r4;
            bb2Var2.g0 = r4;
            bb2Var2.h0 = r4;
            bb2Var2.i0 = r4;
            bb2Var2.j0 = r4;
            bb2Var2.k0 = r4;
            bb2Var2.l0 = r4;
            bb2Var2.m0 = r4;
            bb2Var2.n0 = importSubResult2;
            bb2Var2.o0 = i12;
            bb2Var2.p0 = r8 == true ? 1 : 0;
            bb2Var2.r0 = 5;
            r5 = r4;
            if (w51.W(hv2Var, cb2Var, bb2Var2) == c71Var) {
                return c71Var;
            }
            if (importSubResult2.d()) {
            }
        }
        nf1 nf1Var7 = tp1.a;
        hv2 hv2Var4 = dm4.a;
        cb2 cb2Var3 = new cb2(ea6Var2, null, (byte) 0);
        bb2Var2.f0 = subscriptionItem2;
        bb2Var2.g0 = null;
        bb2Var2.h0 = null;
        bb2Var2.i0 = null;
        bb2Var2.j0 = null;
        bb2Var2.k0 = null;
        bb2Var2.l0 = null;
        bb2Var2.m0 = null;
        bb2Var2.o0 = i2;
        bb2Var2.p0 = BooleanValue;
        bb2Var2.r0 = 2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Boolean j(hd6 hd6Var) {
        String string;
        String str = (String) hd6Var.c().get(MetaParams.SUB_INFO_BUTTON_LINK);
        if (str == null || (string = fm7.R0(str).toString()) == null) {
            return null;
        }
        return Boolean.valueOf(string.equals("true") || string.equals("1"));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void k(SubscriptionItem subscriptionItem) {
        MetaParams metaParams = subscriptionItem.getMetaParams();
        if (metaParams != null) {
            Map fragmentBean = metaParams.getFragmentBean();
            if (!eu.q0(new Object[]{fragmentBean != null ? new XRayConfig.OutboundBean.StreamSettingsBean.TcpMasksBean.TcpMaskSettingBean(fragmentBean) : null, metaParams.getResolveAddress(), metaParams.getHost(), metaParams.getInsecure()}).isEmpty()) {
                HappApplication happApplication = HappApplication.M0;
                k32.i().d().h(new za2(metaParams, subscriptionItem, (byte) 0));
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v4, resolved type: java.lang.Object[] */
    /* JADX WARN: Multi-variable type inference failed */
    public static void p(String str, dn7 dn7Var) {
        SubInfoColor subInfoColor;
        String str2;
        String str3;
        String str4;
        Boolean bool;
        String subExpireButtonLink;
        kw4 kw4Var = kw4.a;
        SubscriptionItem subscriptionItemF = kw4.f(str);
        if (subscriptionItemF == null) {
            return;
        }
        MetaParams metaParams = subscriptionItemF.getMetaParams();
        Object[] objArr = 0;
        if (metaParams == null) {
            metaParams = new MetaParams(objArr == true ? 1 : 0, -1);
        }
        MetaParams metaParams2 = metaParams;
        SubInfoColor subInfoColor2 = dn7Var.a;
        if (subInfoColor2 != null) {
            subInfoColor = subInfoColor2;
        } else {
            MetaParams metaParams3 = subscriptionItemF.getMetaParams();
            if (metaParams3 != null) {
                subInfoColor2 = metaParams3.getSubInfoColor();
                subInfoColor = subInfoColor2;
            } else {
                subInfoColor = null;
            }
        }
        String subInfoText = dn7Var.b;
        if (subInfoText != null) {
            str2 = subInfoText;
        } else {
            MetaParams metaParams4 = subscriptionItemF.getMetaParams();
            if (metaParams4 != null) {
                subInfoText = metaParams4.getSubInfoText();
                str2 = subInfoText;
            } else {
                str2 = null;
            }
        }
        String subInfoButtonText = dn7Var.c;
        if (subInfoButtonText != null) {
            str3 = subInfoButtonText;
        } else {
            MetaParams metaParams5 = subscriptionItemF.getMetaParams();
            if (metaParams5 != null) {
                subInfoButtonText = metaParams5.getSubInfoButtonText();
                str3 = subInfoButtonText;
            } else {
                str3 = null;
            }
        }
        String subInfoButtonLink = dn7Var.d;
        if (subInfoButtonLink != null) {
            str4 = subInfoButtonLink;
        } else {
            MetaParams metaParams6 = subscriptionItemF.getMetaParams();
            if (metaParams6 != null) {
                subInfoButtonLink = metaParams6.getSubInfoButtonLink();
                str4 = subInfoButtonLink;
            } else {
                str4 = null;
            }
        }
        Boolean subExpire = dn7Var.e;
        if (subExpire != null) {
            bool = subExpire;
        } else {
            MetaParams metaParams7 = subscriptionItemF.getMetaParams();
            if (metaParams7 != null) {
                subExpire = metaParams7.getSubExpire();
                bool = subExpire;
            } else {
                bool = null;
            }
        }
        String str5 = dn7Var.f;
        if (str5 == null) {
            MetaParams metaParams8 = subscriptionItemF.getMetaParams();
            subExpireButtonLink = metaParams8 != null ? metaParams8.getSubExpireButtonLink() : null;
        } else {
            subExpireButtonLink = str5;
        }
        kw4.u(SubscriptionItem.d(subscriptionItemF, 0L, false, MetaParams.c(metaParams2, null, subInfoColor, str2, str3, str4, bool, subExpireButtonLink, -1, 1073741823, 268435440), false, null, 267911167), str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final kf4 a() {
        return (kf4) this.d.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code duplicated, block: B:118:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:122:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:125:0x01d2 A[PHI: r0 r1 r2 r3
  0x01d2: PHI (r0v54 java.lang.Object) = (r0v48 java.lang.Object), (r0v1 java.lang.Object) binds: [B:123:0x01ce, B:24:0x004f] A[DONT_GENERATE, DONT_INLINE]
  0x01d2: PHI (r1v33 boolean) = (r1v29 boolean), (r1v45 boolean) binds: [B:123:0x01ce, B:24:0x004f] A[DONT_GENERATE, DONT_INLINE]
  0x01d2: PHI (r2v18 su.happ.proxyutility.dto.SubscriptionItem) = (r2v14 su.happ.proxyutility.dto.SubscriptionItem), (r2v27 su.happ.proxyutility.dto.SubscriptionItem) binds: [B:123:0x01ce, B:24:0x004f] A[DONT_GENERATE, DONT_INLINE]
  0x01d2: PHI (r3v18 java.lang.String) = (r3v16 java.lang.String), (r3v24 java.lang.String) binds: [B:123:0x01ce, B:24:0x004f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:127:0x01dd A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:142:0x020e  */
    /* JADX WARN: Code duplicated, block: B:146:0x0222  */
    /* JADX WARN: Code duplicated, block: B:163:0x0247  */
    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0271, code lost:
    
        if (((f83) r4.a.getValue()).a(r1, r2, r7) == r13) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00b5, code lost:
    
        if (r0 == null) goto L171;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(String str, s51 s51Var) throws Throwable {
        ab2 ab2Var;
        SubscriptionItem subscriptionItemF;
        String str2;
        String rj6Var;
        String rj6Var2;
        String str3;
        SubscriptionItem subscriptionItem;
        qg5 qg5Var;
        SubscriptionItem subscriptionItem2;
        String str4;
        MetaParams rj6Var3;
        String rj6Var4;
        Object obj;
        boolean zBooleanValue;
        String str5;
        String strD;
        boolean z;
        SubscriptionItem subscriptionItem3;
        String str6;
        MetaParams rj6Var5;
        String rj6Var6;
        boolean z2;
        SubscriptionItem subscriptionItem4;
        if (s51Var instanceof ab2) {
            ab2Var = (ab2) s51Var;
            int i = ab2Var.l0;
            if ((i & Integer.MIN_VALUE) != 0) {
                ab2Var.l0 = i - Integer.MIN_VALUE;
            } else {
                ab2Var = new ab2(this, s51Var);
            }
        } else {
            ab2Var = new ab2(this, s51Var);
        }
        ab2 ab2Var2 = ab2Var;
        Object objI = ab2Var2.j0;
        int i2 = ab2Var2.l0;
        c71 c71Var = c71.X;
        if (i2 == 0) {
            w39.n0(objI);
            kw4 kw4Var = kw4.a;
            subscriptionItemF = kw4.f(str);
            if (subscriptionItemF != null) {
                if (!subscriptionItemF.getEncryptedUrl()) {
                    try {
                        ss8 ss8Var = ss8.a;
                        rj6Var = ss8.s(subscriptionItemF.getUrl());
                    } catch (Throwable th) {
                        if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                            throw th;
                        }
                        rj6Var = new rj6(th);
                    }
                    if (rj6Var instanceof rj6) {
                        rj6Var = null;
                    }
                    ss8 ss8Var2 = ss8.a;
                    if (!ss8.z(rj6Var)) {
                        rj6Var = null;
                    }
                }
                try {
                    String url = subscriptionItemF.getUrl();
                    ab2Var2.f0 = str;
                    ab2Var2.g0 = subscriptionItemF;
                    ab2Var2.l0 = 1;
                    try {
                        objI = i(subscriptionItemF, str, this, url, null, ab2Var2);
                        if (objI != c71Var) {
                            subscriptionItemF = subscriptionItemF;
                            str2 = str;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        subscriptionItemF = subscriptionItemF;
                        str2 = str;
                        if (!(th instanceof InterruptedException) || (th instanceof CancellationException)) {
                            throw th;
                        }
                        rj6Var2 = new rj6(th);
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
                return c71Var;
            }
            return dn8.a;
        }
        if (i2 == 1) {
            subscriptionItemF = ab2Var2.g0;
            str2 = ab2Var2.f0;
            try {
                w39.n0(objI);
            } catch (Throwable th4) {
                th = th4;
                if (th instanceof InterruptedException) {
                }
                throw th;
            }
        } else {
            if (i2 == 2) {
                subscriptionItem2 = ab2Var2.g0;
                str4 = ab2Var2.f0;
                try {
                    w39.n0(objI);
                    rj6Var4 = (String) objI;
                } catch (Throwable th5) {
                    th = th5;
                    if (!(th instanceof InterruptedException) || (th instanceof CancellationException)) {
                        throw th;
                    }
                    rj6Var4 = new rj6(th);
                }
                str3 = str4;
                subscriptionItem = subscriptionItem2;
                qg5Var = new qg5(new sj6(rj6Var4), Boolean.TRUE);
                obj = ((sj6) qg5Var.X).X;
                zBooleanValue = ((Boolean) qg5Var.Y).booleanValue();
                if (obj instanceof rj6) {
                    obj = null;
                }
                str5 = (String) obj;
                if (str5 != null) {
                    HappApplication happApplication = HappApplication.M0;
                    i83 i83Var = (i83) k32.i().H0.getValue();
                    ab2Var2.f0 = str3;
                    ab2Var2.g0 = subscriptionItem;
                    ab2Var2.i0 = zBooleanValue;
                    ab2Var2.l0 = 3;
                    objI = ((f83) i83Var.a.getValue()).a(str5, str3, ab2Var2);
                    if (objI != c71Var) {
                        k(subscriptionItem);
                        if (((ImportResult) objI).getCount() <= 0) {
                            kc6 kc6Var = zl7.a;
                            String fragment = new URI(strD).getFragment();
                            fragment.getClass();
                            rj6Var5 = zl7.b(fragment);
                            if (rj6Var5 instanceof rj6) {
                                rj6Var5 = null;
                            }
                            ab2Var2.f0 = str3;
                            ab2Var2.g0 = subscriptionItem;
                            ab2Var2.i0 = zBooleanValue;
                            ab2Var2.l0 = 4;
                            objI = i(subscriptionItem, str3, this, strD, rj6Var5, ab2Var2);
                            if (objI != c71Var) {
                                z = zBooleanValue;
                                subscriptionItem3 = subscriptionItem;
                                str6 = str3;
                                rj6Var6 = (String) objI;
                                z2 = z;
                                subscriptionItem4 = subscriptionItem3;
                                if (!(rj6Var6 instanceof rj6)) {
                                    HappApplication happApplication2 = HappApplication.M0;
                                    i83 i83Var2 = (i83) k32.i().H0.getValue();
                                    ab2Var2.f0 = null;
                                    ab2Var2.g0 = subscriptionItem4;
                                    ab2Var2.h0 = rj6Var6;
                                    ab2Var2.i0 = z2;
                                    ab2Var2.l0 = 5;
                                }
                            }
                        }
                    }
                    return c71Var;
                }
                return dn8.a;
            }
            if (i2 == 3) {
                zBooleanValue = ab2Var2.i0;
                subscriptionItem = ab2Var2.g0;
                str3 = ab2Var2.f0;
                w39.n0(objI);
                k(subscriptionItem);
                if (((ImportResult) objI).getCount() <= 0 && !zBooleanValue && (strD = subscriptionItem.D()) != null) {
                    try {
                        try {
                            kc6 kc6Var2 = zl7.a;
                            String fragment2 = new URI(strD).getFragment();
                            fragment2.getClass();
                            rj6Var5 = zl7.b(fragment2);
                        } catch (Throwable th6) {
                            if ((th6 instanceof InterruptedException) || (th6 instanceof CancellationException)) {
                                throw th6;
                            }
                            rj6Var5 = new rj6(th6);
                        }
                        if (rj6Var5 instanceof rj6) {
                            rj6Var5 = null;
                        }
                        ab2Var2.f0 = str3;
                        ab2Var2.g0 = subscriptionItem;
                        ab2Var2.i0 = zBooleanValue;
                        ab2Var2.l0 = 4;
                        objI = i(subscriptionItem, str3, this, strD, rj6Var5, ab2Var2);
                        if (objI != c71Var) {
                            z = zBooleanValue;
                            subscriptionItem3 = subscriptionItem;
                            str6 = str3;
                            rj6Var6 = (String) objI;
                            z2 = z;
                            subscriptionItem4 = subscriptionItem3;
                            if (!(rj6Var6 instanceof rj6)) {
                                HappApplication happApplication3 = HappApplication.M0;
                                i83 i83Var3 = (i83) k32.i().H0.getValue();
                                ab2Var2.f0 = null;
                                ab2Var2.g0 = subscriptionItem4;
                                ab2Var2.h0 = rj6Var6;
                                ab2Var2.i0 = z2;
                                ab2Var2.l0 = 5;
                            }
                        }
                    } catch (Throwable th7) {
                        th = th7;
                        z = zBooleanValue;
                        subscriptionItem3 = subscriptionItem;
                        str6 = str3;
                        if (!(th instanceof InterruptedException) || (th instanceof CancellationException)) {
                            throw th;
                        }
                        rj6Var6 = new rj6(th);
                    }
                    return c71Var;
                }
                return dn8.a;
            }
            if (i2 == 4) {
                z = ab2Var2.i0;
                subscriptionItem3 = ab2Var2.g0;
                str6 = ab2Var2.f0;
                try {
                    w39.n0(objI);
                    rj6Var6 = (String) objI;
                } catch (Throwable th8) {
                    th = th8;
                    if (th instanceof InterruptedException) {
                    }
                    throw th;
                }
                z2 = z;
                subscriptionItem4 = subscriptionItem3;
                if (!(rj6Var6 instanceof rj6) && (r1 = rj6Var6) != null) {
                    HappApplication happApplication4 = HappApplication.M0;
                    i83 i83Var4 = (i83) k32.i().H0.getValue();
                    ab2Var2.f0 = null;
                    ab2Var2.g0 = subscriptionItem4;
                    ab2Var2.h0 = rj6Var6;
                    ab2Var2.i0 = z2;
                    ab2Var2.l0 = 5;
                }
                return dn8.a;
            }
            if (i2 != 5) {
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            subscriptionItem4 = ab2Var2.g0;
            w39.n0(objI);
        }
        k(subscriptionItem4);
        return dn8.a;
        rj6Var2 = (String) objI;
        str3 = str2;
        subscriptionItem = subscriptionItemF;
        Throwable thA = sj6.a(rj6Var2);
        if (thA != null) {
            String strD2 = subscriptionItem.D();
            if (strD2 != null) {
                HappApplication happApplication5 = HappApplication.M0;
                k32.i().d().h(new ya2((byte) 4));
                try {
                    String strC = zl7.c(strD2);
                    try {
                        String fragment3 = new URI(strD2).getFragment();
                        fragment3.getClass();
                        rj6Var3 = zl7.b(fragment3);
                    } catch (Throwable th9) {
                        if ((th9 instanceof InterruptedException) || (th9 instanceof CancellationException)) {
                            throw th9;
                        }
                        rj6Var3 = new rj6(th9);
                    }
                    if (rj6Var3 instanceof rj6) {
                        rj6Var3 = null;
                    }
                    ab2Var2.f0 = str3;
                    ab2Var2.g0 = subscriptionItem;
                    ab2Var2.l0 = 2;
                    objI = i(subscriptionItem, str3, this, strC, rj6Var3, ab2Var2);
                    if (objI != c71Var) {
                        subscriptionItem2 = subscriptionItem;
                        str4 = str3;
                        rj6Var4 = (String) objI;
                        str3 = str4;
                        subscriptionItem = subscriptionItem2;
                        qg5Var = new qg5(new sj6(rj6Var4), Boolean.TRUE);
                    }
                } catch (Throwable th10) {
                    th = th10;
                    subscriptionItem2 = subscriptionItem;
                    str4 = str3;
                    if (th instanceof InterruptedException) {
                    }
                    throw th;
                }
            } else {
                qg5Var = new qg5(new sj6(new rj6(thA)), Boolean.TRUE);
            }
            return c71Var;
        }
        qg5Var = new qg5(new sj6(rj6Var2), Boolean.FALSE);
        obj = ((sj6) qg5Var.X).X;
        zBooleanValue = ((Boolean) qg5Var.Y).booleanValue();
        if (obj instanceof rj6) {
            obj = null;
        }
        str5 = (String) obj;
        if (str5 != null) {
            HappApplication happApplication6 = HappApplication.M0;
            i83 i83Var5 = (i83) k32.i().H0.getValue();
            ab2Var2.f0 = str3;
            ab2Var2.g0 = subscriptionItem;
            ab2Var2.i0 = zBooleanValue;
            ab2Var2.l0 = 3;
            objI = ((f83) i83Var5.a.getValue()).a(str5, str3, ab2Var2);
            if (objI != c71Var) {
                k(subscriptionItem);
                if (((ImportResult) objI).getCount() <= 0) {
                    kc6 kc6Var3 = zl7.a;
                    String fragment4 = new URI(strD).getFragment();
                    fragment4.getClass();
                    rj6Var5 = zl7.b(fragment4);
                    if (rj6Var5 instanceof rj6) {
                        rj6Var5 = null;
                    }
                    ab2Var2.f0 = str3;
                    ab2Var2.g0 = subscriptionItem;
                    ab2Var2.i0 = zBooleanValue;
                    ab2Var2.l0 = 4;
                    objI = i(subscriptionItem, str3, this, strD, rj6Var5, ab2Var2);
                    if (objI != c71Var) {
                        z = zBooleanValue;
                        subscriptionItem3 = subscriptionItem;
                        str6 = str3;
                        rj6Var6 = (String) objI;
                        z2 = z;
                        subscriptionItem4 = subscriptionItem3;
                        if (!(rj6Var6 instanceof rj6)) {
                            HappApplication happApplication7 = HappApplication.M0;
                            i83 i83Var6 = (i83) k32.i().H0.getValue();
                            ab2Var2.f0 = null;
                            ab2Var2.g0 = subscriptionItem4;
                            ab2Var2.h0 = rj6Var6;
                            ab2Var2.i0 = z2;
                            ab2Var2.l0 = 5;
                        }
                    }
                }
            }
            return c71Var;
        }
        return dn8.a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object l(s51 s51Var) {
        eb2 eb2Var;
        if (s51Var instanceof eb2) {
            eb2Var = (eb2) s51Var;
            int i = eb2Var.h0;
            if ((i & Integer.MIN_VALUE) != 0) {
                eb2Var.h0 = i - Integer.MIN_VALUE;
            } else {
                eb2Var = new eb2(this, s51Var);
            }
        } else {
            eb2Var = new eb2(this, s51Var);
        }
        Object objB = eb2Var.f0;
        int i2 = eb2Var.h0;
        if (i2 == 0) {
            w39.n0(objB);
            HappApplication happApplication = HappApplication.M0;
            qc2 qc2VarC = k32.i().c();
            eb2Var.h0 = 1;
            objB = qc2VarC.b(eb2Var);
            c71 c71Var = c71.X;
            if (objB == c71Var) {
                return c71Var;
            }
        } else {
            if (i2 != 1) {
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            w39.n0(objB);
        }
        a().g(new qb((byte) 3, ((Number) objB).intValue()));
        return dn8.a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code duplicated, block: B:32:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:37:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:47:0x0118  */
    /* JADX WARN: Code duplicated, block: B:52:0x014a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:? A[LOOP:0: B:45:0x0112->B:55:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x0107 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object m(Context context, hd6 hd6Var, s51 s51Var) {
        fb2 fb2Var;
        List listD;
        String string;
        Context context2;
        Iterator it;
        ArrayList arrayList;
        Context context3;
        Iterator it2;
        qg5 qg5Var;
        Iterator it3;
        String strD;
        if (s51Var instanceof fb2) {
            fb2Var = (fb2) s51Var;
            int i = fb2Var.k0;
            if ((i & Integer.MIN_VALUE) != 0) {
                fb2Var.k0 = i - Integer.MIN_VALUE;
            } else {
                fb2Var = new fb2(this, s51Var);
            }
        } else {
            fb2Var = new fb2(this, s51Var);
        }
        Object obj = fb2Var.i0;
        int i2 = fb2Var.k0;
        byte b = 2;
        Object obj2 = c71.X;
        if (i2 != 0) {
            if (i2 == 1) {
                it = fb2Var.h0;
                List list = fb2Var.g0;
                Context context4 = fb2Var.f0;
                w39.n0(obj);
                listD = list;
                context2 = context4;
            } else {
                if (i2 != 2) {
                    bt.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                it2 = fb2Var.h0;
                context3 = fb2Var.f0;
                w39.n0(obj);
            }
            while (it2.hasNext()) {
                qg5 qg5Var2 = (qg5) it2.next();
                strD = ((SubId) qg5Var2.X).d();
                SubscriptionItem subscriptionItem = (SubscriptionItem) qg5Var2.Y;
                HappApplication happApplication = HappApplication.M0;
                k32.i().d().h(new uq0(subscriptionItem, b));
                fb2Var.f0 = context3;
                fb2Var.g0 = null;
                fb2Var.h0 = it2;
                fb2Var.k0 = 2;
                if (h(strD, fb2Var) == obj2) {
                    return obj2;
                }
            }
            qe4.O0(context3, 126);
            return dn8.a;
        }
        w39.n0(obj);
        kw4 kw4Var = kw4.a;
        listD = kw4.d();
        String str = (String) hd6Var.c().get("input-data");
        if (str != null && (string = fm7.R0(str).toString()) != null) {
            ss8 ss8Var = ss8.a;
            String strJ = ss8.J(string);
            if (strJ != null) {
                a().g(new m40(strJ, (byte) 7));
                Iterator la4Var = new la4(strJ);
                context2 = context;
                it = la4Var;
            }
        }
        kw4 kw4Var2 = kw4.a;
        List listD2 = kw4.d();
        arrayList = new ArrayList();
        for (Object obj3 : listD2) {
            qg5Var = (qg5) obj3;
            if (listD != null || !listD.isEmpty()) {
                it3 = listD.iterator();
                do {
                    if (it3.hasNext()) {
                    }
                } while (!dh3.f(((SubId) qg5Var.X).d(), ((SubId) ((qg5) it3.next()).X).d()));
            }
            arrayList.add(obj3);
            break;
        }
        context3 = context;
        it2 = arrayList.iterator();
        while (it2.hasNext()) {
            qg5 qg5Var3 = (qg5) it2.next();
            strD = ((SubId) qg5Var3.X).d();
            SubscriptionItem subscriptionItem2 = (SubscriptionItem) qg5Var3.Y;
            HappApplication happApplication2 = HappApplication.M0;
            k32.i().d().h(new uq0(subscriptionItem2, b));
            fb2Var.f0 = context3;
            fb2Var.g0 = null;
            fb2Var.h0 = it2;
            fb2Var.k0 = 2;
            if (h(strD, fb2Var) == obj2) {
                return obj2;
            }
        }
        qe4.O0(context3, 126);
        return dn8.a;
        while (it.hasNext()) {
            String str2 = (String) it.next();
            HappApplication happApplication3 = HappApplication.M0;
            i83 i83Var = (i83) k32.i().H0.getValue();
            fb2Var.f0 = context2;
            fb2Var.g0 = listD;
            fb2Var.h0 = it;
            fb2Var.k0 = 1;
            SubId.Companion.getClass();
            if (((f83) i83Var.a.getValue()).a(str2, SubId.c(), fb2Var) == obj2) {
                return obj2;
            }
        }
        context = context2;
        kw4 kw4Var3 = kw4.a;
        List listD3 = kw4.d();
        arrayList = new ArrayList();
        while (r13.hasNext()) {
            qg5Var = (qg5) obj3;
            if (listD != null) {
                it3 = listD.iterator();
                do {
                    if (it3.hasNext()) {
                        arrayList.add(obj3);
                        break;
                    }
                } while (!dh3.f(((SubId) qg5Var.X).d(), ((SubId) ((qg5) it3.next()).X).d()));
            } else {
                it3 = listD.iterator();
                do {
                    if (it3.hasNext()) {
                        arrayList.add(obj3);
                        break;
                        break;
                    }
                } while (!dh3.f(((SubId) qg5Var.X).d(), ((SubId) ((qg5) it3.next()).X).d()));
            }
        }
        context3 = context;
        it2 = arrayList.iterator();
        while (it2.hasNext()) {
            qg5 qg5Var4 = (qg5) it2.next();
            strD = ((SubId) qg5Var4.X).d();
            SubscriptionItem subscriptionItem3 = (SubscriptionItem) qg5Var4.Y;
            HappApplication happApplication4 = HappApplication.M0;
            k32.i().d().h(new uq0(subscriptionItem3, b));
            fb2Var.f0 = context3;
            fb2Var.g0 = null;
            fb2Var.h0 = it2;
            fb2Var.k0 = 2;
            if (h(strD, fb2Var) == obj2) {
                return obj2;
            }
        }
        qe4.O0(context3, 126);
        return dn8.a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object n(Context context, hd6 hd6Var, s51 s51Var) {
        gb2 gb2Var;
        boolean zF;
        dn7 dn7Var;
        Context context2;
        Iterator it;
        if (s51Var instanceof gb2) {
            gb2Var = (gb2) s51Var;
            int i = gb2Var.l0;
            if ((i & Integer.MIN_VALUE) != 0) {
                gb2Var.l0 = i - Integer.MIN_VALUE;
            } else {
                gb2Var = new gb2(this, s51Var);
            }
        } else {
            gb2Var = new gb2(this, s51Var);
        }
        Object obj = gb2Var.j0;
        int i2 = gb2Var.l0;
        dn8 dn8Var = dn8.a;
        if (i2 == 0) {
            w39.n0(obj);
            String strB = b(hd6Var);
            if (strB == null) {
                return dn8Var;
            }
            String str = (String) hd6Var.c().get("sign-control");
            zF = dh3.f(str != null ? fm7.R0(str).toString() : null, "JT9ZDH1N7wc66LIKi0ix300H2PK4J83H");
            dn7Var = new dn7(f(hd6Var), g(hd6Var), e(hd6Var), d(hd6Var), j(hd6Var), c(hd6Var));
            a().g(new y0(this, hd6Var));
            dx0 dx0Var = zF ? new dx0((byte) 27) : new dx0((byte) 28);
            kw4 kw4Var = kw4.a;
            Iterator ka2Var = new ka2(new la2(new hu(kw4.d(), (byte) 1), true, new p0(dx0Var, strB, (byte) 22)));
            context2 = context;
            it = ka2Var;
        } else {
            if (i2 != 1) {
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            zF = gb2Var.i0;
            Iterator it2 = gb2Var.h0;
            dn7 dn7Var2 = gb2Var.g0;
            Context context3 = gb2Var.f0;
            w39.n0(obj);
            it = it2;
            dn7Var = dn7Var2;
            context2 = context3;
        }
        while (it.hasNext()) {
            String strD = ((SubId) ((qg5) it.next()).X).d();
            p(strD, dn7Var);
            pr7 pr7Var = (pr7) this.a.getValue();
            gb2Var.f0 = context2;
            gb2Var.g0 = dn7Var;
            gb2Var.h0 = it;
            gb2Var.i0 = zF;
            gb2Var.l0 = 1;
            dn7 dn7Var3 = dn7Var;
            Object objB = pr7.b(pr7Var, strD, false, (String) null, (q30) null, (ok4) null, (zs1) null, (pk4) null, (Boolean) null, gb2Var, 382);
            c71 c71Var = c71.X;
            if (objB == c71Var) {
                return c71Var;
            }
            dn7Var = dn7Var3;
        }
        qe4.O0(context2, 129);
        return dn8Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object o(Context context, hd6 hd6Var, s51 s51Var) {
        hb2 hb2Var;
        Iterator it;
        dn7 dn7Var;
        Context context2;
        if (s51Var instanceof hb2) {
            hb2Var = (hb2) s51Var;
            int i = hb2Var.k0;
            if ((i & Integer.MIN_VALUE) != 0) {
                hb2Var.k0 = i - Integer.MIN_VALUE;
            } else {
                hb2Var = new hb2(this, s51Var);
            }
        } else {
            hb2Var = new hb2(this, s51Var);
        }
        Object obj = hb2Var.i0;
        int i2 = hb2Var.k0;
        dn8 dn8Var = dn8.a;
        if (i2 == 0) {
            w39.n0(obj);
            String strB = b(hd6Var);
            if (strB == null) {
                return dn8Var;
            }
            dn7 dn7Var2 = new dn7(f(hd6Var), g(hd6Var), e(hd6Var), d(hd6Var), j(hd6Var), c(hd6Var));
            kw4 kw4Var = kw4.a;
            List listD = kw4.d();
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : listD) {
                String providerId = ((SubscriptionItem) ((qg5) obj2).Y).getProviderId();
                if (providerId == null) {
                    providerId = null;
                }
                if (dh3.f(providerId, strB)) {
                    arrayList.add(obj2);
                }
            }
            a().g(new kd(arrayList, (byte) 2));
            it = arrayList.iterator();
            dn7Var = dn7Var2;
            context2 = context;
        } else {
            if (i2 != 1) {
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            it = hb2Var.h0;
            dn7 dn7Var3 = hb2Var.g0;
            Context context3 = hb2Var.f0;
            w39.n0(obj);
            dn7Var = dn7Var3;
            context2 = context3;
        }
        while (it.hasNext()) {
            String strD = ((SubId) ((qg5) it.next()).X).d();
            p(strD, dn7Var);
            pr7 pr7Var = (pr7) this.a.getValue();
            hb2Var.f0 = context2;
            hb2Var.g0 = dn7Var;
            hb2Var.h0 = it;
            hb2Var.k0 = 1;
            Object objB = pr7.b(pr7Var, strD, false, (String) null, (q30) null, (ok4) null, (zs1) null, (pk4) null, (Boolean) null, hb2Var, 382);
            c71 c71Var = c71.X;
            if (objB == c71Var) {
                return c71Var;
            }
        }
        qe4.O0(context2, 129);
        return dn8Var;
    }
}
