package defpackage;

import com.google.gson.a;
import com.tencent.mmkv.MMKV;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import su.happ.proxyutility.HappApplication;
import su.happ.proxyutility.domain.sub.GuId;
import su.happ.proxyutility.domain.sub.SubId;
import su.happ.proxyutility.dto.MetaParams;
import su.happ.proxyutility.dto.ProviderId;
import su.happ.proxyutility.dto.ServerConfig;
import su.happ.proxyutility.dto.SubscriptionItem;
import su.happ.proxyutility.dto.XRayConfig;
import su.happ.proxyutility.dto.enums.EConfigType;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class kw4 {
    public static final kw4 a = new kw4();
    public static final vz7 b = new vz7(new sh4((byte) 24));
    public static final vz7 c = new vz7(new dw4((byte) 1));
    public static final vz7 d = new vz7(new dw4((byte) 2));
    public static final vz7 e = new vz7(new dw4((byte) 3));
    public static final vz7 f = new vz7(new dw4((byte) 4));
    public static final vz7 g = new vz7(new dw4((byte) 5));
    public static final vz7 h = new vz7(new dw4((byte) 6));
    public static final vz7 i = new vz7(new sh4((byte) 25));
    public static final vz7 j = new vz7(new sh4((byte) 26));
    public static final vz7 k = new vz7(new sh4((byte) 27));
    public static final vz7 l = new vz7(new sh4((byte) 28));
    public static final vz7 m = new vz7(new sh4((byte) 29));

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        new vz7(new dw4((byte) 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int a(String str) {
        str.getClass();
        List listC = c();
        ArrayList arrayList = new ArrayList();
        Iterator it = listC.iterator();
        while (it.hasNext()) {
            ServerConfig serverConfigB = b(((GuId) it.next()).b());
            if (serverConfigB != null) {
                arrayList.add(serverConfigB);
            }
        }
        int i2 = 0;
        if (arrayList.isEmpty()) {
            return 0;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            if (dh3.f(((ServerConfig) it2.next()).getSubscriptionId(), str) && (i2 = i2 + 1) < 0) {
                i21.W();
                throw null;
            }
        }
        return i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static ServerConfig b(String str) {
        String strI;
        str.getClass();
        if (fm7.o0(str) || (strI = j().i(str)) == null || fm7.o0(strI)) {
            return null;
        }
        a aVar = yw2.c;
        aVar.getClass();
        return (ServerConfig) aVar.c(strI, new yi8(ServerConfig.class));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static List c() {
        String strI = h().i("HAPP_CONFIGS");
        if (strI == null || fm7.o0(strI)) {
            return d02.X;
        }
        a aVar = yw2.c;
        aVar.getClass();
        Object objC = aVar.c(strI, new yi8(String[].class));
        objC.getClass();
        Object[] objArr = (Object[]) objC;
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            String str = (String) obj;
            str.getClass();
            arrayList.add(new GuId(str));
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static List d() {
        String[] strArrA = m().a();
        if (strArrA == null) {
            strArrA = new String[0];
        }
        return w27.n0(new z92(w27.m0(w27.l0(eu.Y(strArrA), ew4.X), cl1.G0), new mv4((byte) 1), (byte) 2));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String e(String str, ServerConfig serverConfig) {
        str.getClass();
        ub ubVar = new ub(0, GuId.Companion, wu2.class, "generate", "generate-kfED8wo()Ljava/lang/String;", 0, (byte) 24);
        if (fm7.o0(str)) {
            str = ((GuId) ubVar.invoke()).b();
        }
        j().q(str, yw2.c.h(serverConfig));
        List listC = c();
        if (!listC.contains(new GuId(str))) {
            ArrayList arrayListI0 = wv0.I0(listC, new GuId(str));
            ArrayList arrayList = new ArrayList(xv0.Z(arrayListI0, 10));
            Iterator it = arrayListI0.iterator();
            while (it.hasNext()) {
                arrayList.add(((GuId) it.next()).b());
            }
            h().q("HAPP_CONFIGS", yw2.c.h(arrayList));
            String strI = h().i("SELECTED_SERVER");
            if (strI == null || fm7.o0(strI)) {
                h().q("SELECTED_SERVER", str);
            }
        }
        return str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static SubscriptionItem f(String str) {
        str.getClass();
        String strI = m().i(str);
        if (strI != null) {
            if (fm7.o0(strI)) {
                strI = null;
            }
            if (strI != null) {
                a aVar = yw2.c;
                aVar.getClass();
                return (SubscriptionItem) aVar.c(strI, new yi8(SubscriptionItem.class));
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static a g() {
        return (a) m.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static MMKV h() {
        return (MMKV) b.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static MMKV i() {
        return (MMKV) e.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static MMKV j() {
        return (MMKV) c.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Map k(String str) {
        str.getClass();
        boolean zO0 = fm7.o0(str);
        e02 e02Var = e02.X;
        if (zO0) {
            return e02Var;
        }
        String[] strArrA = j().a();
        if (strArrA == null) {
            strArrA = new String[0];
        }
        la2 la2VarM0 = w27.m0(w27.l0(eu.Y(strArrA), fw4.X), new gw4(str, (byte) 0));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        zp4.M(linkedHashMap, la2VarM0);
        int size = linkedHashMap.size();
        if (size == 0) {
            return e02Var;
        }
        if (size != 1) {
            return linkedHashMap;
        }
        Map.Entry entry = (Map.Entry) linkedHashMap.entrySet().iterator().next();
        Map mapSingletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        mapSingletonMap.getClass();
        return mapSingletonMap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static MMKV l() {
        Object value = g.getValue();
        value.getClass();
        return (MMKV) value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static MMKV m() {
        return (MMKV) f.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean n() {
        String[] strArrA = j().a();
        if (strArrA != null) {
            if (!(strArrA.length == 0)) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean o(String str) {
        ServerConfig serverConfigB;
        str.getClass();
        if (!str.equals("")) {
            String[] strArrA = j().a();
            if (strArrA == null) {
                strArrA = new String[0];
            }
            md8 md8VarL0 = w27.l0(eu.Y(strArrA), hw4.X);
            Iterator it = md8VarL0.a.iterator();
            do {
                if (!it.hasNext()) {
                    serverConfigB = null;
                    break;
                }
                serverConfigB = b(((GuId) md8VarL0.b.B(it.next())).b());
                if (serverConfigB == null || !dh3.f(serverConfigB.getSubscriptionId(), str)) {
                    serverConfigB = null;
                }
            } while (serverConfigB == null);
            if ((serverConfigB != null ? serverConfigB.getConfigType() : null) == EConfigType.CUSTOM) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void q(String str) {
        str.getClass();
        if (fm7.o0(str)) {
            return;
        }
        if (dh3.f(h().i("SELECTED_SERVER"), str)) {
            h().remove("SELECTED_SERVER");
        }
        ArrayList arrayListD0 = wv0.D0(c(), new GuId(str));
        ArrayList arrayList = new ArrayList(xv0.Z(arrayListD0, 10));
        Iterator it = arrayListD0.iterator();
        while (it.hasNext()) {
            arrayList.add(((GuId) it.next()).b());
        }
        h().q("HAPP_CONFIGS", yw2.c.h(arrayList));
        j().remove(str);
        i().remove(str);
        ((MMKV) d.getValue()).remove(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void r(String str) {
        str.getClass();
        if (fm7.o0(str)) {
            return;
        }
        String[] strArrA = j().a();
        if (strArrA == null) {
            strArrA = new String[0];
        }
        ka2 ka2Var = new ka2(w27.m0(w27.l0(eu.Y(strArrA), jw4.X), new gw4(str, (byte) 1)));
        while (ka2Var.hasNext()) {
            q(((GuId) ka2Var.next()).b());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void s(MMKV mmkv, Set set) {
        String[] strArrA = mmkv.a();
        if (strArrA == null) {
            strArrA = new String[0];
        }
        ArrayList arrayList = new ArrayList();
        for (String str : strArrA) {
            str.getClass();
            if (!set.contains(new GuId(str))) {
                arrayList.add(str);
            }
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        if (strArr.length == 0) {
            return;
        }
        mmkv.removeValuesForKeys(strArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static ArrayList t() {
        List listD = d();
        ArrayList arrayList = new ArrayList();
        Iterator it = listD.iterator();
        while (it.hasNext()) {
            String providerId = ((SubscriptionItem) ((qg5) it.next()).Y).getProviderId();
            ProviderId providerId2 = providerId != null ? new ProviderId(providerId) : null;
            if (providerId2 != null) {
                arrayList.add(providerId2);
            }
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (hashSet.add(((ProviderId) obj).getValue())) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void u(SubscriptionItem subscriptionItem, String str) {
        subscriptionItem.getClass();
        MMKV mmkvM = m();
        if (str == null) {
            str = rl8.a();
        }
        mmkvM.q(str, yw2.c.h(subscriptionItem));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public final Object p(String str, String str2, boolean z, b12 b12Var, String str3, s51 s51Var) {
        iw4 iw4Var;
        String strU;
        String str4;
        String strSubstring;
        MetaParams metaParamsB;
        MetaParams metaParamsB2;
        SubscriptionItem subscriptionItem;
        String strD;
        String rj6Var;
        int iE;
        SubscriptionItem subscriptionItem2;
        String str5;
        String strC = str;
        if (s51Var instanceof iw4) {
            iw4Var = (iw4) s51Var;
            int i2 = iw4Var.j0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                iw4Var.j0 = i2 - Integer.MIN_VALUE;
            } else {
                iw4Var = new iw4(this, s51Var);
            }
        } else {
            iw4Var = new iw4(this, s51Var);
        }
        Object obj = iw4Var.h0;
        int i3 = iw4Var.j0;
        if (i3 == 0) {
            w39.n0(obj);
            if (z) {
                strU = i21.u(strC, b12Var);
                if (strU.length() == 0) {
                    return o83.a;
                }
            } else {
                strU = strC;
            }
            ss8 ss8Var = ss8.a;
            String strC2 = ss8.c(strU);
            kc6 kc6Var = zl7.a;
            strC2.getClass();
            fq4 fq4VarA = kc6.a(zl7.a, strC2);
            if (fq4VarA == null || (str4 = (String) wv0.u0(1, fq4VarA.a())) == null) {
                str4 = null;
            }
            HappApplication happApplication = HappApplication.M0;
            String strJ = ss8.j(k32.i());
            strC.getClass();
            if (fm7.d0(strC, "#", false)) {
                String strF0 = fm7.f0(fm7.r0(strC, "#", 0, 6) + 1, strC);
                strC = zl7.c(strC);
                strSubstring = strF0;
                strC2 = strC;
            } else {
                strSubstring = "";
            }
            String fragment = new URI(strC2).getFragment();
            if (fragment == null) {
                if (strSubstring.length() > 0 && fm7.d0(strSubstring, "?", false)) {
                    metaParamsB = zl7.b(strSubstring);
                    int length = strSubstring.length();
                    for (int i4 = 0; i4 < length; i4++) {
                        if (strSubstring.charAt(i4) == '?') {
                            strSubstring = strSubstring.substring(0, i4);
                            break;
                        }
                    }
                } else {
                    metaParamsB = null;
                }
                fragment = strSubstring;
                metaParamsB2 = metaParamsB;
            } else if (fm7.d0(fragment, "?", false)) {
                metaParamsB2 = zl7.b(fragment);
                int length2 = fragment.length();
                for (int i5 = 0; i5 < length2; i5++) {
                    if (fragment.charAt(i5) == '?') {
                        fragment = fragment.substring(0, i5);
                        break;
                    }
                }
            } else {
                metaParamsB2 = null;
            }
            if (fragment.length() > 0) {
                fragment = mm7.W(fragment, "+", " ", false);
            }
            subscriptionItem = new SubscriptionItem(str2, 268435449, str4);
            ub ubVar = new ub(0, SubId.Companion, cn7.class, "generate", "generate-CTUK2pg()Ljava/lang/String;", 0, (byte) 25);
            str3.getClass();
            strD = fm7.o0(str3) ? ((SubId) ubVar.invoke()).d() : str3;
            SubscriptionItem subscriptionItemF = f(strD);
            subscriptionItem.w0(strC);
            subscriptionItem.j0(z);
            subscriptionItem.k0(b12Var);
            subscriptionItem.i0(c12.d(strC2));
            byte b2 = 2;
            if (subscriptionItemF == null || !subscriptionItemF.getManualEnterTitle()) {
                if (fragment.length() <= 0) {
                    if (!subscriptionItem.G()) {
                        try {
                            rj6Var = new URL(subscriptionItem.getUrl()).getHost();
                        } catch (Throwable th) {
                            if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                                throw th;
                            }
                            rj6Var = new rj6(th);
                        }
                        if (sj6.a(rj6Var) != null) {
                            rj6Var = subscriptionItem.getUrl();
                        }
                        rj6Var.getClass();
                        fragment = eq8.a(1, rj6Var, (6 & 2) != 0);
                    } else if (subscriptionItemF == null || (fragment = subscriptionItemF.getRemarks()) == null) {
                        List listD = d();
                        ArrayList arrayList = new ArrayList();
                        for (Object obj2 : listD) {
                            if (((SubscriptionItem) ((qg5) obj2).Y).G()) {
                                arrayList.add(obj2);
                            }
                        }
                        if (arrayList.isEmpty()) {
                            h().l(2, "hide_settings_subscription_import_id");
                            iE = 1;
                        } else {
                            iE = h().e(1, "hide_settings_subscription_import_id");
                            h().l(iE + 1, "hide_settings_subscription_import_id");
                        }
                        fragment = pc6.j(iE, "Encrypted #");
                    }
                }
                subscriptionItem.v0(fragment, false);
            } else {
                subscriptionItem.v0(subscriptionItemF.getRemarks(), true);
            }
            HappApplication happApplication2 = HappApplication.M0;
            k32.i().d().h(new uq0(subscriptionItem, (byte) 14));
            subscriptionItem.r0(metaParamsB2);
            MetaParams metaParams = subscriptionItem.getMetaParams();
            if (metaParams != null) {
                Map mapF = metaParams.getFragmentBean();
                if (!eu.q0(new Object[]{mapF != null ? new XRayConfig.OutboundBean.StreamSettingsBean.TcpMasksBean.TcpMaskSettingBean(mapF) : null, metaParams.getResolveAddress(), metaParams.getHost(), metaParams.getInsecure()}).isEmpty()) {
                    k32.i().d().h(new za2(metaParams, subscriptionItem, b2));
                }
            }
            if (str4 != null && !str4.equals(strJ)) {
                subscriptionItem.o0(Boolean.FALSE);
                r(strD);
                u(subscriptionItem, strD);
                return v83.a;
            }
            MetaParams metaParams2 = subscriptionItem.getMetaParams();
            if (metaParams2 != null) {
                gk7 gk7Var = (gk7) l.getValue();
                boolean zB0 = subscriptionItem.b0();
                iw4Var.f0 = subscriptionItem;
                iw4Var.g0 = strD;
                iw4Var.j0 = 1;
                Object objA = gk7Var.a(metaParams2, zB0, strD, iw4Var);
                c71 c71Var = c71.X;
                if (objA == c71Var) {
                    return c71Var;
                }
                subscriptionItem2 = subscriptionItem;
                str5 = strD;
            }
            u(subscriptionItem, strD);
            return w83.a;
        }
        if (i3 != 1) {
            bt.i("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        str5 = iw4Var.g0;
        subscriptionItem2 = iw4Var.f0;
        w39.n0(obj);
        strD = str5;
        subscriptionItem = subscriptionItem2;
        u(subscriptionItem, strD);
        return w83.a;
    }
}
