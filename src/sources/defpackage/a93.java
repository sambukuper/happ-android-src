package defpackage;

import android.net.Uri;
import com.tencent.mmkv.MMKV;
import java.net.Proxy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import okhttp3.internal.url._UrlKt;
import su.happ.proxyutility.HappApplication;
import su.happ.proxyutility.domain.sub.ImportSubResult;
import su.happ.proxyutility.dto.MetaParams;
import su.happ.proxyutility.dto.ServerConfig;
import su.happ.proxyutility.dto.SubscriptionItem;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class a93 {
    public final MMKV a;
    public final MMKV b;
    public final m51 c;

    public a93() {
        kw4 kw4Var = kw4.a;
        MMKV mmkvH = kw4.h();
        MMKV mmkvL = kw4.l();
        mmkvH.getClass();
        this.a = mmkvH;
        this.b = mmkvL;
        ow7 ow7VarB = pw7.b();
        nf1 nf1Var = tp1.a;
        this.c = gv3.c(g33.K(ow7VarB, ye1.Z));
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0022  */
    public static String a(String str, SubscriptionItem subscriptionItem, pr prVar) {
        Object rj6Var;
        Object queryParameter;
        ArrayList arrayList = c12.a;
        if (str != null) {
            try {
                Uri uri = Uri.parse(str);
                if (uri != null) {
                    queryParameter = uri.getQueryParameter("key");
                } else {
                    queryParameter = null;
                }
            } catch (Throwable th) {
                if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                    throw th;
                }
                rj6Var = new rj6(th);
            }
        } else {
            queryParameter = null;
        }
        rj6Var = queryParameter;
        if (rj6Var instanceof rj6) {
            rj6Var = null;
        }
        String str2 = (String) rj6Var;
        Map map = prVar.b;
        String str3 = prVar.a;
        if (map == null) {
            bt.q("Required value was null.");
            return null;
        }
        String str4 = (String) map.get("Encrypt-Tag");
        String str5 = _UrlKt.FRAGMENT_ENCODE_SET;
        if (str4 == null) {
            str4 = _UrlKt.FRAGMENT_ENCODE_SET;
        }
        if (((subscriptionItem == null || !subscriptionItem.getEncrypted()) && (str2 == null || str2.length() == 0)) || str4.length() <= 0) {
            return str3;
        }
        ArrayList arrayList2 = c12.a;
        if (str2 == null) {
            str2 = _UrlKt.FRAGMENT_ENCODE_SET;
        }
        str3.getClass();
        ArrayList arrayList3 = c12.a;
        int iG = aq4.G(xv0.Z(arrayList3, 10));
        if (iG < 16) {
            iG = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iG);
        for (Object obj : arrayList3) {
            linkedHashMap.put((String) wv0.t0(fm7.E0((String) obj, new char[]{':'})), obj);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (((String) entry.getKey()) != null) {
                linkedHashMap2.put(entry.getKey(), entry.getValue());
            }
        }
        String str6 = (String) linkedHashMap2.get(str2);
        if (str6 != null) {
            str5 = str6;
        }
        return c12.b(str3, str5, str4);
    }

    /* JADX WARN: Code duplicated, block: B:134:0x030b  */
    /* JADX WARN: Code duplicated, block: B:135:0x030d  */
    /* JADX WARN: Code duplicated, block: B:60:0x0135  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object b(String str, String str2, boolean z, Proxy proxy, HashMap map, String str3, boolean z2, s51 s51Var) throws Throwable {
        z83 z83Var;
        zr7 zr7Var;
        String str4;
        c71 c71Var;
        Object objA;
        String str5;
        boolean z3;
        ea6 ea6Var;
        String str6;
        int i;
        boolean z4;
        pr prVar;
        ServerConfig serverConfig;
        String strA;
        MetaParams metaParamsA;
        int i2;
        int i3;
        Object next;
        q23 q23Var;
        String str7;
        q23 q23Var2;
        pr prVar2;
        ServerConfig serverConfigB;
        boolean z5;
        a93 a93Var = this;
        String strU = str;
        if (s51Var instanceof z83) {
            z83Var = (z83) s51Var;
            int i4 = z83Var.q0;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                z83Var.q0 = i4 - Integer.MIN_VALUE;
            } else {
                z83Var = new z83(a93Var, s51Var);
            }
        } else {
            z83Var = new z83(a93Var, s51Var);
        }
        z83 z83Var2 = z83Var;
        Object obj = z83Var2.o0;
        int i5 = z83Var2.q0;
        byte b = 1;
        String subscriptionId = null;
        c71 c71Var2 = c71.X;
        try {
            try {
                if (i5 != 0) {
                    if (i5 == 1) {
                        int i6 = z83Var2.m0;
                        boolean z6 = z83Var2.l0;
                        z3 = z83Var2.k0;
                        str6 = (String) z83Var2.h0;
                        ea6Var = z83Var2.g0;
                        str5 = z83Var2.f0;
                        w39.n0(obj);
                        Object obj2 = ((sj6) obj).X;
                        z4 = z6;
                        objA = obj2;
                        i = i6;
                        c71Var = c71Var2;
                    } else {
                        if (i5 != 2) {
                            bt.i("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        i3 = z83Var2.n0;
                        i5 = z83Var2.m0;
                        q23Var2 = z83Var2.j0;
                        str7 = z83Var2.i0;
                        prVar2 = (pr) z83Var2.h0;
                        ea6Var = z83Var2.g0;
                        str5 = z83Var2.f0;
                        w39.n0(obj);
                        i2 = 1;
                    }
                    jm4.Q(a93Var.c, null, new y9(ea6Var, str5, null, (byte) 5), 3);
                    q23Var = q23Var2;
                    prVar = prVar2;
                    strA = str7;
                    pr prVar3 = new pr(strA, prVar.b, prVar.c);
                    if (i3 != 0) {
                        z5 = i2;
                    } else {
                        z5 = 0;
                    }
                    return new ImportSubResult(prVar3, z5, q23Var);
                }
                w39.n0(obj);
                try {
                    ea6 ea6Var2 = new ea6();
                    kw4 kw4Var = kw4.a;
                    SubscriptionItem subscriptionItemF = kw4.f(str2);
                    ea6Var2.X = subscriptionItemF;
                    if (subscriptionItemF != null) {
                        try {
                            if (dh3.f(subscriptionItemF.getImport(), Boolean.FALSE)) {
                                throw new RuntimeException("Subscription is not allowed to renew");
                            }
                        } catch (Throwable th) {
                            th = th;
                            i5 = 0;
                            if (i5 != 0 && !fm7.d0(gv3.W(th), "util.protection", false)) {
                                th.printStackTrace();
                            }
                            if (!(th instanceof InterruptedException) || (th instanceof CancellationException)) {
                                throw th;
                            }
                            return new rj6(th);
                        }
                    }
                    SubscriptionItem subscriptionItem = (SubscriptionItem) ea6Var2.X;
                    if (dh3.f(strU, subscriptionItem != null ? subscriptionItem.getUrl() : null) && ((SubscriptionItem) ea6Var2.X).getEncryptedUrl()) {
                        b12 encryptedUrlMode = ((SubscriptionItem) ea6Var2.X).getEncryptedUrlMode();
                        if (encryptedUrlMode == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        strU = i21.u(strU, encryptedUrlMode);
                        if (strU.length() == 0) {
                            ImportSubResult.Companion.getClass();
                            return ImportSubResult.EMPTY;
                        }
                    }
                    boolean zB = a93Var.b.b("pref_use_legacy_okhttp");
                    if (!zB) {
                        if (zB) {
                            b61.c();
                            zr7Var = null;
                        } else {
                            HappApplication happApplication = HappApplication.M0;
                            zr7Var = (oq7) k32.i().A0.getValue();
                        }
                        z83Var2.f0 = str2;
                        z83Var2.g0 = ea6Var2;
                        z83Var2.h0 = strU;
                        z83Var2.k0 = z;
                        z83Var2.l0 = z2;
                        z83Var2.m0 = 0;
                        z83Var2.q0 = 1;
                        str4 = strU;
                        zr7 zr7Var2 = zr7Var;
                        c71Var = c71Var2;
                        objA = zr7Var2.a(str4, str2, proxy, map, str3, z2, z83Var2);
                        if (objA != c71Var) {
                            str5 = str2;
                            z3 = z;
                            ea6Var = ea6Var2;
                            str6 = str4;
                            i = 0;
                            z4 = z2;
                        }
                        return c71Var;
                    }
                    HappApplication happApplication2 = HappApplication.M0;
                    zr7Var = (f84) k32.i().B0.getValue();
                    z83Var2.f0 = str2;
                    z83Var2.g0 = ea6Var2;
                    z83Var2.h0 = strU;
                    z83Var2.k0 = z;
                    z83Var2.l0 = z2;
                    z83Var2.m0 = 0;
                    z83Var2.q0 = 1;
                    str4 = strU;
                    zr7 zr7Var3 = zr7Var;
                    c71Var = c71Var2;
                    objA = zr7Var3.a(str4, str2, proxy, map, str3, z2, z83Var2);
                    if (objA != c71Var) {
                        str5 = str2;
                        z3 = z;
                        ea6Var = ea6Var2;
                        str6 = str4;
                        i = 0;
                        z4 = z2;
                    }
                    return c71Var;
                } catch (Throwable th2) {
                    th = th2;
                    i5 = 0;
                }
                w39.n0(objA);
                prVar = (pr) objA;
                MMKV mmkv = a93Var.a;
                String strI = mmkv.i("SELECTED_SERVER");
                if (strI == null) {
                    strI = subscriptionId;
                }
                if (strI != null) {
                    kw4 kw4Var2 = kw4.a;
                    serverConfigB = kw4.b(strI);
                } else {
                    serverConfig = subscriptionId;
                }
                if (serverConfig != 0) {
                    serverConfig = serverConfigB;
                    subscriptionId = serverConfig.getSubscriptionId();
                }
                if (subscriptionId == null ? false : subscriptionId.equals(str5)) {
                    kw4 kw4Var3 = kw4.a;
                    mmkv.q("REMOVED_SERVER", kw4.g().h(serverConfig));
                }
                kf3 kf3VarA0 = x97.a0(MetaParams.MAX_LENGTH_VISIBLE_ANNOUNCE, 300);
                Integer num = prVar.c;
                if (num != null) {
                    int iIntValue = num.intValue();
                    if (kf3VarA0.X <= iIntValue && iIntValue <= kf3VarA0.Y) {
                        kw4 kw4Var4 = kw4.a;
                        kw4.r(str5);
                    }
                }
                kw4 kw4Var5 = kw4.a;
                int iA = kw4.a(str5);
                HappApplication happApplication3 = HappApplication.M0;
                k32.i().d().h(new ux2(b, iA, ea6Var, prVar));
                Map map2 = prVar.b;
                if (map2 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                strA = a(str6, (SubscriptionItem) ea6Var.X, prVar);
                MetaParams metaParamsA2 = oz2.a(map2);
                strA.getClass();
                la2 la2Var = new la2(new hu(strA, (byte) 6), true, new y2((byte) 27));
                p60 p60Var = p60.X;
                md8 md8VarL0 = w27.l0(la2Var, p60Var);
                q60 q60Var = q60.X;
                List listN0 = w27.n0(w27.m0(md8VarL0, q60Var));
                if (listN0.isEmpty()) {
                    ss8 ss8Var = ss8.a;
                    String strA2 = ss8.a(strA);
                    MetaParams.Companion companion = MetaParams.INSTANCE;
                    List listN1 = w27.n0(w27.m0(w27.l0(new la2(new hu(strA2, (byte) 6), true, new y2((byte) 27)), p60Var), q60Var));
                    companion.getClass();
                    metaParamsA = MetaParams.Companion.a(listN1, false);
                } else {
                    MetaParams.INSTANCE.getClass();
                    metaParamsA = MetaParams.Companion.a(listN0, false);
                }
                MetaParams metaParamsA3 = lj6.a(metaParamsA2, metaParamsA);
                if (metaParamsA3.equals(new MetaParams(null, -1))) {
                    i3 = 0;
                    i2 = 1;
                } else {
                    SubscriptionItem subscriptionItemF2 = kw4.f(str5);
                    if (subscriptionItemF2 == null) {
                        subscriptionItemF2 = null;
                        i2 = 1;
                    } else {
                        MetaParams metaParams = subscriptionItemF2.getMetaParams();
                        if (metaParams != null) {
                            metaParamsA3 = MetaParams.Companion.c(metaParamsA3, metaParams, z3);
                        }
                        subscriptionItemF2.r0(metaParamsA3);
                        if (subscriptionItemF2.getEncrypted() || map2.get("Encrypt-Tag") == null) {
                            i2 = 1;
                        } else {
                            i2 = 1;
                            subscriptionItemF2.i0(true);
                        }
                        kw4.u(subscriptionItemF2, str5);
                    }
                    ea6Var.X = subscriptionItemF2;
                    i3 = i2;
                }
                k42 k42Var = q23.Z;
                Integer num2 = prVar.c;
                if (num2 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                int iIntValue2 = num2.intValue();
                k42Var.getClass();
                Iterator it = q23.h0.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (((q23) next).X != iIntValue2);
                q23Var = (q23) next;
                if (ea6Var.X != null) {
                    kw4 kw4Var6 = kw4.a;
                    SubscriptionItem subscriptionItemF3 = kw4.f(str5);
                    if (subscriptionItemF3 == null) {
                        subscriptionItemF3 = null;
                    } else {
                        subscriptionItemF3.g();
                        kw4.u(subscriptionItemF3, str5);
                    }
                    ea6Var.X = subscriptionItemF3;
                    HappApplication happApplication4 = HappApplication.M0;
                    us usVar = (us) k32.i().m0.getValue();
                    z83Var2.f0 = str5;
                    z83Var2.g0 = ea6Var;
                    z83Var2.h0 = prVar;
                    z83Var2.i0 = strA;
                    z83Var2.j0 = q23Var;
                    z83Var2.k0 = z3;
                    z83Var2.l0 = z4;
                    z83Var2.m0 = i;
                    z83Var2.n0 = i3;
                    z83Var2.q0 = 2;
                    Object objA2 = usVar.a(str5, z83Var2);
                    c71Var = c71Var;
                    if (objA2 != c71Var) {
                        i5 = i;
                        str7 = strA;
                        q23Var2 = q23Var;
                        prVar2 = prVar;
                        a93Var = this;
                        jm4.Q(a93Var.c, null, new y9(ea6Var, str5, null, (byte) 5), 3);
                        q23Var = q23Var2;
                        prVar = prVar2;
                        strA = str7;
                    }
                    return c71Var;
                }
                i5 = i;
                pr prVar4 = new pr(strA, prVar.b, prVar.c);
                if (i3 != 0) {
                    z5 = i2;
                } else {
                    z5 = 0;
                }
                return new ImportSubResult(prVar4, z5, q23Var);
            } catch (Throwable th3) {
                th = th3;
                i5 = i;
                if (i5 != 0) {
                    th.printStackTrace();
                }
                if (th instanceof InterruptedException) {
                }
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }
}
