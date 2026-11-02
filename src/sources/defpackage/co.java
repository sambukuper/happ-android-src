package defpackage;

import android.app.Activity;
import android.content.Context;
import android.hardware.camera2.CaptureResult;
import android.view.MenuItem;
import android.widget.TextView;
import com.google.gson.a;
import com.tencent.mmkv.MMKV;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import okhttp3.Response;
import su.happ.proxyutility.domain.routing.entity.DownloadFilesInfo;
import su.happ.proxyutility.domain.routing.entity.RouteProfile;
import su.happ.proxyutility.domain.sub.SubId;
import su.happ.proxyutility.dto.ConfigGroupCache;
import su.happ.proxyutility.dto.DeviceModel;
import su.happ.proxyutility.dto.HWID;
import su.happ.proxyutility.dto.MetaParams;
import su.happ.proxyutility.dto.ServerCache;
import su.happ.proxyutility.dto.ServerConfig;
import su.happ.proxyutility.dto.SubscriptionItem;
import su.happ.proxyutility.dto.SubscriptionRestrictedStatus;
import su.happ.proxyutility.dto.VersionOS;
import su.happ.proxyutility.dto.XRayConfig;
import su.happ.proxyutility.dto.enums.EConfigObservatoryType;
import su.happ.proxyutility.dto.enums.EConfigType;
import su.happ.proxyutility.feature.main.MainActivity;
import su.happ.proxyutility.ui.BaseActivity;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class co extends uy7 implements rn2 {
    public final /* synthetic */ byte g0;
    public /* synthetic */ Object h0;
    public /* synthetic */ Object i0;
    public final /* synthetic */ Object j0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public co(String str, qo qoVar, String str2, q51 q51Var) {
        super(2, q51Var);
        this.g0 = (byte) 0;
        this.h0 = str;
        this.j0 = qoVar;
        this.i0 = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object K(Object obj, Object obj2) throws Throwable {
        byte b = this.g0;
        dn8 dn8Var = dn8.a;
        switch (b) {
            case 0:
                return n((q51) obj2, (b71) obj).q(dn8Var);
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                n((q51) obj2, (b71) obj).q(dn8Var);
                return dn8Var;
            case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                n((q51) obj2, (o05) obj).q(dn8Var);
                return dn8Var;
            case 3:
                n((q51) obj2, (o05) obj).q(dn8Var);
                return dn8Var;
            case 4:
                Object obj3 = ((up0) obj).a;
                co coVar = new co(this.i0, this.j0, (q51) obj2, (byte) 4);
                coVar.h0 = obj3;
                coVar.q(dn8Var);
                return dn8Var;
            case 5:
                n((q51) obj2, (o05) obj).q(dn8Var);
                return dn8Var;
            case 6:
                n((q51) obj2, (b71) obj).q(dn8Var);
                return dn8Var;
            case 7:
                n((q51) obj2, (b71) obj).q(dn8Var);
                return dn8Var;
            case 8:
                return n((q51) obj2, (b71) obj).q(dn8Var);
            case 9:
                n((q51) obj2, (b71) obj).q(dn8Var);
                return dn8Var;
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.ttiMin /* 10 */:
                n((q51) obj2, (b71) obj).q(dn8Var);
                return dn8Var;
            case 11:
                n((q51) obj2, (ft7) obj).q(dn8Var);
                return dn8Var;
            case 12:
                return n((q51) obj2, (b71) obj).q(dn8Var);
            case 13:
                n((q51) obj2, (b71) obj).q(dn8Var);
                return dn8Var;
            case 14:
                return n((q51) obj2, (b71) obj).q(dn8Var);
            case 15:
                n((q51) obj2, (o05) obj).q(dn8Var);
                return dn8Var;
            default:
                n((q51) obj2, (o05) obj).q(dn8Var);
                return dn8Var;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final q51 n(q51 q51Var, Object obj) {
        byte b = this.g0;
        Object obj2 = this.j0;
        switch (b) {
            case 0:
                return new co((String) this.h0, (qo) obj2, (String) this.i0, q51Var);
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                return new co(this.i0, (String) this.h0, obj2, q51Var, (byte) 1);
            case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                co coVar = new co(this.i0, obj2, q51Var, (byte) 2);
                coVar.h0 = obj;
                return coVar;
            case 3:
                co coVar2 = new co(this.i0, obj2, q51Var, (byte) 3);
                coVar2.h0 = obj;
                return coVar2;
            case 4:
                co coVar3 = new co(this.i0, obj2, q51Var, (byte) 4);
                coVar3.h0 = ((up0) obj).a;
                return coVar3;
            case 5:
                co coVar4 = new co(this.i0, obj2, q51Var, (byte) 5);
                coVar4.h0 = obj;
                return coVar4;
            case 6:
                return new co(this.h0, this.i0, obj2, q51Var, (byte) 6);
            case 7:
                co coVar5 = new co((String) this.h0, (MenuItem) obj2, q51Var);
                coVar5.i0 = obj;
                return coVar5;
            case 8:
                return new co(this.i0, (String) this.h0, obj2, q51Var, (byte) 8);
            case 9:
                co coVar6 = new co(this.i0, obj2, q51Var, (byte) 9);
                coVar6.h0 = obj;
                return coVar6;
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.ttiMin /* 10 */:
                co coVar7 = new co(this.i0, obj2, q51Var, (byte) 10);
                coVar7.h0 = obj;
                return coVar7;
            case 11:
                co coVar8 = new co(this.i0, obj2, q51Var, (byte) 11);
                coVar8.h0 = obj;
                return coVar8;
            case 12:
                return new co(this.h0, this.i0, obj2, q51Var, (byte) 12);
            case 13:
                co coVar9 = new co(this.i0, obj2, q51Var, (byte) 13);
                coVar9.h0 = obj;
                return coVar9;
            case 14:
                co coVar10 = new co(this.i0, obj2, q51Var, (byte) 14);
                coVar10.h0 = obj;
                return coVar10;
            case 15:
                co coVar11 = new co(this.i0, obj2, q51Var, (byte) 15);
                coVar11.h0 = obj;
                return coVar11;
            default:
                co coVar12 = new co(this.i0, obj2, q51Var, (byte) 16);
                coVar12.h0 = obj;
                return coVar12;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code duplicated, block: B:101:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:102:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:107:0x02cb A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:112:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:114:0x02ea  */
    /* JADX WARN: Code duplicated, block: B:115:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:117:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:121:0x030d  */
    /* JADX WARN: Code duplicated, block: B:123:0x0321  */
    /* JADX WARN: Code duplicated, block: B:124:0x0323  */
    /* JADX WARN: Code duplicated, block: B:127:0x0339  */
    /* JADX WARN: Code duplicated, block: B:129:0x033f  */
    /* JADX WARN: Code duplicated, block: B:131:0x0346  */
    /* JADX WARN: Code duplicated, block: B:133:0x0355  */
    /* JADX WARN: Code duplicated, block: B:135:0x0358  */
    /* JADX WARN: Code duplicated, block: B:137:0x035b  */
    /* JADX WARN: Code duplicated, block: B:143:0x0378  */
    /* JADX WARN: Code duplicated, block: B:146:0x038d  */
    /* JADX WARN: Code duplicated, block: B:148:0x0392  */
    /* JADX WARN: Code duplicated, block: B:150:0x0398 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:154:0x039f  */
    /* JADX WARN: Code duplicated, block: B:201:0x04fa  */
    /* JADX WARN: Code duplicated, block: B:310:0x03b1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:311:0x0371 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:314:0x02c5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:317:0x0331 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x0286  */
    /* JADX WARN: Code duplicated, block: B:90:0x0289 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:91:0x028b  */
    /* JADX WARN: Code duplicated, block: B:93:0x0297  */
    /* JADX WARN: Code duplicated, block: B:94:0x029a  */
    /* JADX WARN: Code duplicated, block: B:97:0x029e  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v16 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r16v5, types: [su.happ.proxyutility.dto.SubscriptionItem] */
    /* JADX WARN: Type inference failed for: r18v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r19v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r20v2 */
    /* JADX WARN: Type inference failed for: r20v3, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r20v4 */
    /* JADX WARN: Type inference failed for: r21v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r27v0 */
    /* JADX WARN: Type inference failed for: r27v1, types: [su.happ.proxyutility.dto.MetaParams] */
    /* JADX WARN: Type inference failed for: r27v3 */
    public final Object q(Object obj) throws Throwable {
        qg5 rj6Var;
        rj6 rj6Var2;
        boolean z;
        byte b;
        Object obj2;
        ?? D;
        byte b2;
        byte b3;
        qs7 qs7VarA;
        boolean z2;
        a45 a45Var;
        Iterator it;
        vv7 vv7Var;
        Object next;
        ServerCache serverCache;
        boolean z3;
        j2 j2VarB;
        ServerCache serverCache2;
        int i;
        jf3 it2;
        jf3 jf3Var;
        int iNextInt;
        boolean z4;
        boolean z5;
        int i2;
        j2 j2Var;
        boolean z6;
        boolean z7;
        is7 is7Var;
        c83 c83Var;
        Object next2;
        byte b4 = this.g0;
        j2 j2Var2 = ec7.Y;
        e71 e71Var = e71.f0;
        byte b5 = 1;
        a45 a45Var2 = null;
        dn8 dn8Var = dn8.a;
        Object obj3 = this.j0;
        switch (b4) {
            case 0:
                w39.n0(obj);
                String strL = oi0.l("https://time-ntp.com/v1install?id=", (String) this.h0);
                un unVar = un.INSTALL;
                qo qoVar = (qo) obj3;
                String str = (String) this.i0;
                try {
                    ss8 ss8Var = ss8.a;
                    yf8 yf8VarK = ss8.k(qoVar.a);
                    Response responseExecute = qoVar.b(9000, true, false).newCall(qoVar.a(new URL(strL), ((HWID) yf8VarK.X).getValue(), unVar, ((VersionOS) yf8VarK.Y).getValue(), ((DeviceModel) yf8VarK.Z).getValue(), str, null, "close", null).build()).execute();
                    String strString = responseExecute.body().string();
                    ss8.t();
                    Integer num = new Integer(responseExecute.code());
                    a aVar = yw2.b;
                    aVar.getClass();
                    Object objC = aVar.c(strString, new yi8(SubscriptionRestrictedStatus.class));
                    if (objC == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    rj6Var = new qg5(num, objC);
                    return new sj6(rj6Var);
                } catch (Throwable th) {
                    if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                        throw th;
                    }
                    rj6Var = new rj6(th);
                }
                break;
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                w39.n0(obj);
                vz7 vz7Var = d69.a;
                Context context = (Context) this.i0;
                String str2 = (String) this.h0;
                nn1 nn1Var = (nn1) obj3;
                EConfigObservatoryType eConfigObservatoryType = nn1Var.F1;
                str2.getClass();
                eConfigObservatoryType.getClass();
                try {
                    kw4 kw4Var = kw4.a;
                    ServerConfig serverConfigB = kw4.b(str2);
                    if (serverConfigB == null) {
                        rj6Var2 = null;
                    } else {
                        Map mapK = kw4.k(serverConfigB.getSubscriptionId());
                        ArrayList arrayList = new ArrayList(mapK.size());
                        Iterator it3 = mapK.entrySet().iterator();
                        while (it3.hasNext()) {
                            arrayList.add((ServerConfig) ((Map.Entry) it3.next()).getValue());
                        }
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj4 : arrayList) {
                            if (((ServerConfig) obj4).getConfigType() != EConfigType.CUSTOM) {
                                arrayList2.add(obj4);
                            }
                        }
                        if (arrayList2.isEmpty()) {
                            x79.i(context, "All configs are invalid or CUSTOM");
                        } else {
                            rj6Var2 = d69.q(context, true);
                            if (rj6Var2 != null) {
                                f08 f08Var = e69.Z;
                                int iE = d69.k().e(-1, "pref_logs_type");
                                f08Var.getClass();
                                rj6Var2.getLog().c(f08.i(iE).X);
                                rj6Var2.getLog().a("");
                                rj6Var2.getLog().b("");
                                rj6Var2.t(serverConfigB.getRemarks());
                                d69.p(rj6Var2, false);
                                rj6Var2.getOutbounds().remove(0);
                                ArrayList arrayList3 = new ArrayList();
                                Iterator it4 = arrayList2.iterator();
                                int i3 = 0;
                                while (it4.hasNext()) {
                                    i3++;
                                    XRayConfig.OutboundBean outboundBeanG = ((ServerConfig) it4.next()).g();
                                    if (outboundBeanG != null) {
                                        outboundBeanG.q("proxy-" + i3);
                                        arrayList3.add(outboundBeanG);
                                    }
                                }
                                arrayList3.addAll(rj6Var2.getOutbounds());
                                rj6Var2.r(new ArrayList(arrayList3));
                                d69.u(rj6Var2);
                                d69.f(rj6Var2);
                                d69.e(rj6Var2);
                                d69.c(rj6Var2, eConfigObservatoryType);
                                if (d69.k().b("pref_local_dns_enabled")) {
                                    d69.d(rj6Var2);
                                }
                                d69.t(rj6Var2);
                            }
                        }
                        rj6Var2 = null;
                    }
                } catch (Throwable th2) {
                    if ((th2 instanceof InterruptedException) || (th2 instanceof CancellationException)) {
                        throw th2;
                    }
                    rj6Var2 = new rj6(th2);
                }
                XRayConfig xRayConfig = (XRayConfig) (rj6Var2 instanceof rj6 ? null : rj6Var2);
                if (xRayConfig != null) {
                    gn2 gn2Var = nn1Var.G1;
                    kw4 kw4Var2 = kw4.a;
                    gn2Var.B(kw4.g().h(xRayConfig));
                }
                return dn8Var;
            case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                o05 o05Var = (o05) this.h0;
                w39.n0(obj);
                js5 js5Var = ((qc2) this.i0).b;
                m02 m02Var = (Set) o05Var.c(js5Var);
                if (m02Var == null) {
                    m02Var = m02.X;
                }
                um3 um3Var = vm3.d;
                g55 g55Var = ((vm3) um3Var).b;
                o05Var.f(js5Var, q57.a0(m02Var, um3Var.b(ld6.Companion.serializer(), (ld6) obj3)));
                return dn8Var;
            case 3:
                o05 o05Var2 = (o05) this.h0;
                w39.n0(obj);
                o05Var2.e(((qc2) this.i0).d, (Set) obj3);
                return dn8Var;
            case 4:
                Object obj5 = this.h0;
                w39.n0(obj);
                ea6 ea6Var = (ea6) this.i0;
                boolean z8 = obj5 instanceof tp0;
                if (!z8) {
                    ea6Var.X = obj5;
                }
                jp0 jp0Var = (jp0) obj3;
                if (z8) {
                    sp0 sp0Var = obj5 instanceof sp0 ? (sp0) obj5 : null;
                    Throwable th3 = sp0Var != null ? sp0Var.a : null;
                    if (th3 != null) {
                        throw th3;
                    }
                    jp0Var.m(new gr0());
                    ea6Var.X = d75.c;
                }
                return dn8Var;
            case 5:
                w39.n0(obj);
                o05 o05Var3 = (o05) this.h0;
                o05Var3.getClass();
                o05Var3.f((js5) this.i0, (Long) obj3);
                return dn8Var;
            case 6:
                w39.n0(obj);
                ea6 ea6Var2 = (ea6) this.h0;
                mo1 mo1Var = (mo1) ea6Var2.X;
                if (mo1Var != null) {
                    String string = ((MainActivity) this.i0).getString(y46.test_title);
                    string.getClass();
                    mo1Var.C1 = string;
                    TextView textView = mo1Var.z1;
                    if (textView != null) {
                        textView.setText(string);
                    }
                }
                mo1 mo1Var2 = (mo1) ea6Var2.X;
                if (mo1Var2 != null) {
                    mo1Var2.E1 = new ul4(ea6Var2, (byte) 0);
                }
                if (mo1Var2 != null) {
                    mo1Var2.F1 = new sh4((byte) 7);
                }
                if (mo1Var2 != null) {
                    d8.a0((BaseActivity) obj3, mo1Var2, "DialogTest");
                }
                return dn8Var;
            case 7:
                w39.n0(obj);
                String str3 = (String) this.h0;
                MenuItem menuItem = (MenuItem) obj3;
                if (str3 != null) {
                    kw4 kw4Var3 = kw4.a;
                    ServerConfig serverConfigB2 = kw4.b(str3);
                    SubscriptionItem subscriptionItemF = serverConfigB2 != null ? kw4.f(serverConfigB2.getSubscriptionId()) : null;
                    if (subscriptionItemF == null || !subscriptionItemF.G()) {
                        z = true;
                    } else {
                        ss8 ss8Var2 = ss8.a;
                        if (ss8.t()) {
                            z = true;
                        } else {
                            z = false;
                        }
                    }
                    menuItem.setVisible(z);
                } else {
                    menuItem.setVisible(true);
                }
                return dn8Var;
            case 8:
                w39.n0(obj);
                vv5 vv5Var = (vv5) this.i0;
                Map map = (Map) ((mn6) vv5Var.b.getValue()).g.X.getValue();
                map.getClass();
                final Map map2 = (Map) obj3;
                final byte b6 = 0;
                sd2 sd2Var = new sd2(new la2(wv0.l0(map.entrySet()), true, new m40((String) this.h0, (byte) 18)), new gn2() { // from class: uv5
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    public final Object B(Object obj6) {
                        boolean z9;
                        byte b7 = b6;
                        Map map3 = map2;
                        switch (b7) {
                            case 0:
                                Map.Entry entry = (Map.Entry) obj6;
                                String strD = ((SubId) entry.getKey()).d();
                                b83<RouteProfile> b83Var = (b83) entry.getValue();
                                ArrayList arrayList4 = new ArrayList();
                                for (RouteProfile routeProfile : b83Var) {
                                    SubId.Companion.getClass();
                                    om6 om6Var = null;
                                    if (dh3.f(strD, SubId.c())) {
                                        om6Var = new om6(routeProfile, (SubscriptionItem) null, 6);
                                    } else {
                                        SubscriptionItem subscriptionItem = (SubscriptionItem) map3.get(new SubId(strD));
                                        if (subscriptionItem != null) {
                                            om6Var = new om6(routeProfile, subscriptionItem, 4);
                                        }
                                    }
                                    if (om6Var != null) {
                                        arrayList4.add(om6Var);
                                    }
                                }
                                return arrayList4;
                            default:
                                ee eeVar = (ee) obj6;
                                eeVar.getClass();
                                for (Map.Entry entry2 : map3.entrySet()) {
                                    CaptureResult.Key key = (CaptureResult.Key) entry2.getKey();
                                    List list = (List) entry2.getValue();
                                    key.getClass();
                                    if (!wv0.m0(list, eeVar.X.get(key))) {
                                        z9 = false;
                                        return Boolean.valueOf(z9);
                                    }
                                }
                                z9 = true;
                                return Boolean.valueOf(z9);
                        }
                    }
                }, z27.X);
                qm5 qm5VarC = j2Var2.c();
                rd2 rd2Var = new rd2(sd2Var);
                while (rd2Var.hasNext()) {
                    Object next3 = rd2Var.next();
                    om6 om6Var = (om6) next3;
                    if (!((mn6) vv5Var.b.getValue()).b(om6Var.a.c(), om6Var.a.d())) {
                        qm5VarC.add(next3);
                    }
                }
                return qm5VarC.c();
            case 9:
                b71 b71Var = (b71) this.h0;
                w39.n0(obj);
                d27 d27Var = (d27) this.i0;
                og7 og7Var = d27Var.c;
                if (og7Var != null) {
                    og7Var.m((CancellationException) null);
                }
                nf1 nf1Var = tp1.a;
                d27Var.c = jm4.Q(b71Var, ye1.Z, new qi((lr5) obj3, d27Var, (q51) null), 2);
                return dn8Var;
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.ttiMin /* 10 */:
                b71 b71Var2 = (b71) this.h0;
                w39.n0(obj);
                d27 d27Var2 = (d27) this.i0;
                og7 og7Var2 = d27Var2.c;
                if (og7Var2 != null) {
                    og7Var2.m((CancellationException) null);
                }
                d27Var2.c = jm4.Q(b71Var2, (u61) null, new pi((y45) obj3, d27Var2, (q51) null, (byte) 17), 3);
                return dn8Var;
            case 11:
                ft7 ft7Var = (ft7) this.h0;
                w39.n0(obj);
                if (ft7Var == null) {
                    b61.c();
                    return null;
                }
                qe4.O0((Context) this.i0, 129);
                Activity activity = (Activity) obj3;
                if (activity != null) {
                    activity.finish();
                }
                return dn8Var;
            case 12:
                List list = (List) this.i0;
                w39.n0(obj);
                dw7 dw7Var = (dw7) this.h0;
                uv7 uv7Var = dw7Var.d;
                vz7 vz7Var2 = dw7Var.s;
                int iOrdinal = uv7Var.ordinal();
                if (iOrdinal == 0) {
                    ArrayList arrayList4 = new ArrayList();
                    for (Object obj6 : list) {
                        SubscriptionItem subscriptionItem = ((ConfigGroupCache) obj6).getSubscriptionItem();
                        if (!(subscriptionItem != null ? dh3.f(subscriptionItem.getImport(), Boolean.FALSE) : false)) {
                            arrayList4.add(obj6);
                        }
                    }
                    list = arrayList4;
                } else if (iOrdinal != 1) {
                    b61.c();
                    return null;
                }
                a45 a45Var3 = (a45) obj3;
                int iE2 = ((MMKV) dw7Var.r.getValue()).e(-1, "pref_ping_result");
                vn5.X.getClass();
                vn5 vn5Var = (vn5) wv0.u0(iE2, vn5.g0);
                if (vn5Var == null) {
                    vn5Var = vn5.Y;
                }
                ArrayList arrayList5 = new ArrayList();
                Iterator it5 = list.iterator();
                int i4 = 0;
                while (it5.hasNext()) {
                    Object next4 = it5.next();
                    int i5 = i4 + 1;
                    if (i4 < 0) {
                        ?? r21 = a45Var2;
                        i21.X();
                        throw r21;
                    }
                    ConfigGroupCache configGroupCache = (ConfigGroupCache) next4;
                    zt4 zt4Var = new zt4(dw7Var, configGroupCache, vn5Var, b5);
                    a45 a45Var4 = a45Var2;
                    gb4 gb4VarR = i21.r();
                    String subId = configGroupCache.getSubId();
                    subId.getClass();
                    mh7 mh7Var = dw7Var.e;
                    if (mh7Var == null || (c83Var = (c83) mh7Var.getValue()) == null) {
                        b = b5;
                        obj2 = a45Var4;
                    } else {
                        Iterator it6 = c83Var.iterator();
                        while (true) {
                            if (it6.hasNext()) {
                                next2 = it6.next();
                                b = b5;
                                if (!dh3.f((nv7) next2, new mv7(subId))) {
                                    b5 = b;
                                }
                            } else {
                                b = b5;
                                next2 = a45Var4;
                            }
                        }
                        obj2 = (nv7) next2;
                    }
                    byte b7 = obj2 != null ? b : (byte) 0;
                    if (i4 != 0) {
                        gb4VarR.add(sv7.a);
                    }
                    SubscriptionItem subscriptionItem2 = configGroupCache.getSubscriptionItem();
                    if (subscriptionItem2 != null) {
                        MetaParams metaParams = configGroupCache.getSubscriptionItem().getMetaParams();
                        D = SubscriptionItem.d(subscriptionItem2, 0L, false, metaParams != null ? MetaParams.c(metaParams, null, null, null, null, null, null, null, -1, -1, 268435455) : a45Var4, false, null, 267911167);
                    } else {
                        D = a45Var4;
                    }
                    ConfigGroupCache configGroupCacheA = ConfigGroupCache.a(configGroupCache, D, wv0.Z0(configGroupCache.getConfigs()), false, false, 25);
                    pv0 pv0Var = (pv0) dw7Var.t.getValue();
                    String subId2 = configGroupCache.getSubId();
                    pv0Var.getClass();
                    subId2.getClass();
                    qs7 qs7VarA2 = ((zt7) pv0Var.a.getValue()).a(subId2);
                    ?? r19 = ((qs7VarA2 == null || qs7VarA2.e) ? (byte) 0 : b) ^ 1;
                    qs7 qs7VarA3 = ((zt7) vz7Var2.getValue()).a(configGroupCache.getSubId());
                    gb4VarR.add(new rv7(configGroupCache, configGroupCacheA, b7, r19, (qs7VarA3 == null || (is7Var = qs7VarA3.a) == null) ? a45Var4 : is7Var.a ? new Integer(is7Var.c) : a45Var4));
                    if (configGroupCache.getIsExpand()) {
                        String subId3 = configGroupCache.getSubId();
                        ((zt7) vz7Var2.getValue()).getClass();
                        subId3.getClass();
                        SubscriptionItem subscriptionItemF2 = kw4.f(subId3);
                        if (subscriptionItemF2 != null) {
                            b2 = b;
                            b3 = subscriptionItemF2.b0() == b2 ? b2 : (byte) 0;
                            if (b3 != 0) {
                                a45Var = a45Var4;
                                it = configGroupCache.getConfigs().iterator();
                                vv7Var = new vv7(j2Var2, false);
                                while (true) {
                                    it.getClass();
                                    if (it.hasNext()) {
                                        next = it.next();
                                    } else {
                                        next = a45Var4;
                                    }
                                    serverCache = (ServerCache) next;
                                    z3 = vv7Var.b;
                                    j2VarB = vv7Var.a;
                                    if (serverCache == null) {
                                        if (dw7Var.d == uv7.Y) {
                                            gb4VarR.add(new ov7(a45Var, j2VarB.isEmpty()));
                                        }
                                        serverCache2 = (ServerCache) wv0.t0(j2VarB);
                                        if (serverCache2 != null) {
                                            i = 1;
                                            if (j2VarB.a() == 1) {
                                                z5 = true;
                                            } else {
                                                z5 = false;
                                            }
                                            gb4VarR.add(zt4Var.K(serverCache2, Boolean.valueOf(z5)));
                                        } else {
                                            i = 1;
                                        }
                                        it2 = x97.a0(i, j2VarB.a()).iterator();
                                        while (true) {
                                            jf3Var = it2;
                                            if (jf3Var.Z) {
                                                iNextInt = jf3Var.nextInt();
                                                gb4VarR.add(qv7.a);
                                                Object obj7 = j2VarB.get(iNextInt);
                                                if (iNextInt == j2VarB.a() - i) {
                                                    z4 = true;
                                                } else {
                                                    z4 = false;
                                                }
                                                gb4VarR.add(zt4Var.K(obj7, Boolean.valueOf(z4)));
                                                i = 1;
                                            }
                                        }
                                    } else {
                                        boolean isSelected = serverCache.getIsSelected();
                                        if (a45Var == null) {
                                            i2 = -1;
                                        } else {
                                            i2 = bw7.a[a45Var.ordinal()];
                                        }
                                        Iterator it7 = it5;
                                        if (i2 != -1) {
                                            if (i2 != 1) {
                                                j2Var = j2Var2;
                                                if (!fm7.d0(serverCache.getConfig().getRemarks(), "only mobile", true)) {
                                                }
                                                if (z6) {
                                                    j2VarB = j2VarB.b(serverCache);
                                                }
                                                if (z3) {
                                                    z7 = true;
                                                } else {
                                                    z7 = true;
                                                }
                                                j2VarB.getClass();
                                                vv7 vv7Var2 = new vv7(j2VarB, z7);
                                                dw7Var = dw7Var;
                                                vv7Var = vv7Var2;
                                                j2Var2 = j2Var;
                                                it5 = it7;
                                            } else if (i2 == 2) {
                                                j2Var = j2Var2;
                                                z6 = true;
                                                if (fm7.d0(serverCache.getConfig().getRemarks(), "only wifi", true)) {
                                                }
                                                if (z6) {
                                                    j2VarB = j2VarB.b(serverCache);
                                                }
                                                if (z3) {
                                                    z7 = true;
                                                } else {
                                                    z7 = true;
                                                }
                                                j2VarB.getClass();
                                                vv7 vv7Var3 = new vv7(j2VarB, z7);
                                                dw7Var = dw7Var;
                                                vv7Var = vv7Var3;
                                                j2Var2 = j2Var;
                                                it5 = it7;
                                            } else {
                                                b61.c();
                                            }
                                            z6 = false;
                                            if (z6) {
                                                j2VarB = j2VarB.b(serverCache);
                                            }
                                            if (z3) {
                                                z7 = true;
                                            } else {
                                                z7 = true;
                                            }
                                            j2VarB.getClass();
                                            vv7 vv7Var4 = new vv7(j2VarB, z7);
                                            dw7Var = dw7Var;
                                            vv7Var = vv7Var4;
                                            j2Var2 = j2Var;
                                            it5 = it7;
                                        } else {
                                            j2Var = j2Var2;
                                        }
                                        z6 = true;
                                        if (z6) {
                                            j2VarB = j2VarB.b(serverCache);
                                        }
                                        if (z3) {
                                            z7 = true;
                                        } else {
                                            z7 = true;
                                        }
                                        j2VarB.getClass();
                                        vv7 vv7Var5 = new vv7(j2VarB, z7);
                                        dw7Var = dw7Var;
                                        vv7Var = vv7Var5;
                                        j2Var2 = j2Var;
                                        it5 = it7;
                                    }
                                }
                            } else if (b3 == b2) {
                                qs7VarA = ((zt7) vz7Var2.getValue()).a(subId3);
                                if (qs7VarA != null) {
                                    z2 = qs7VarA.f;
                                } else {
                                    z2 = false;
                                }
                                if (z2) {
                                    a45Var = a45Var4;
                                } else {
                                    a45Var = a45Var3;
                                }
                                it = configGroupCache.getConfigs().iterator();
                                vv7Var = new vv7(j2Var2, false);
                                while (true) {
                                    it.getClass();
                                    if (it.hasNext()) {
                                        next = it.next();
                                    } else {
                                        next = a45Var4;
                                    }
                                    serverCache = (ServerCache) next;
                                    z3 = vv7Var.b;
                                    j2VarB = vv7Var.a;
                                    if (serverCache == null) {
                                        if (dw7Var.d == uv7.Y && a45Var != null && z3) {
                                            gb4VarR.add(new ov7(a45Var, j2VarB.isEmpty()));
                                        }
                                        serverCache2 = (ServerCache) wv0.t0(j2VarB);
                                        if (serverCache2 != null) {
                                            i = 1;
                                            if (j2VarB.a() == 1) {
                                                z5 = true;
                                            } else {
                                                z5 = false;
                                            }
                                            gb4VarR.add(zt4Var.K(serverCache2, Boolean.valueOf(z5)));
                                        } else {
                                            i = 1;
                                        }
                                        it2 = x97.a0(i, j2VarB.a()).iterator();
                                        while (true) {
                                            jf3Var = it2;
                                            if (jf3Var.Z) {
                                                iNextInt = jf3Var.nextInt();
                                                gb4VarR.add(qv7.a);
                                                Object obj8 = j2VarB.get(iNextInt);
                                                if (iNextInt == j2VarB.a() - i) {
                                                    z4 = true;
                                                } else {
                                                    z4 = false;
                                                }
                                                gb4VarR.add(zt4Var.K(obj8, Boolean.valueOf(z4)));
                                                i = 1;
                                            }
                                        }
                                    } else {
                                        boolean isSelected2 = serverCache.getIsSelected();
                                        if (a45Var == null) {
                                            i2 = -1;
                                        } else {
                                            i2 = bw7.a[a45Var.ordinal()];
                                        }
                                        Iterator it8 = it5;
                                        if (i2 != -1) {
                                            if (i2 != 1) {
                                                j2Var = j2Var2;
                                                if (!fm7.d0(serverCache.getConfig().getRemarks(), "only mobile", true)) {
                                                }
                                                if (z6) {
                                                    j2VarB = j2VarB.b(serverCache);
                                                }
                                                if (z3) {
                                                    z7 = true;
                                                } else {
                                                    z7 = true;
                                                }
                                                j2VarB.getClass();
                                                vv7 vv7Var6 = new vv7(j2VarB, z7);
                                                dw7Var = dw7Var;
                                                vv7Var = vv7Var6;
                                                j2Var2 = j2Var;
                                                it5 = it8;
                                            } else if (i2 == 2) {
                                                j2Var = j2Var2;
                                                z6 = true;
                                                if (fm7.d0(serverCache.getConfig().getRemarks(), "only wifi", true)) {
                                                }
                                                if (z6) {
                                                    j2VarB = j2VarB.b(serverCache);
                                                }
                                                if (z3 || (isSelected2 && !z6)) {
                                                    z7 = true;
                                                } else {
                                                    z7 = false;
                                                }
                                                j2VarB.getClass();
                                                vv7 vv7Var7 = new vv7(j2VarB, z7);
                                                dw7Var = dw7Var;
                                                vv7Var = vv7Var7;
                                                j2Var2 = j2Var;
                                                it5 = it8;
                                            } else {
                                                b61.c();
                                            }
                                            z6 = false;
                                            if (z6) {
                                                j2VarB = j2VarB.b(serverCache);
                                            }
                                            if (z3) {
                                                z7 = true;
                                            } else {
                                                z7 = true;
                                            }
                                            j2VarB.getClass();
                                            vv7 vv7Var8 = new vv7(j2VarB, z7);
                                            dw7Var = dw7Var;
                                            vv7Var = vv7Var8;
                                            j2Var2 = j2Var;
                                            it5 = it8;
                                        } else {
                                            j2Var = j2Var2;
                                        }
                                        z6 = true;
                                        if (z6) {
                                            j2VarB = j2VarB.b(serverCache);
                                        }
                                        if (z3) {
                                            z7 = true;
                                        } else {
                                            z7 = true;
                                        }
                                        j2VarB.getClass();
                                        vv7 vv7Var9 = new vv7(j2VarB, z7);
                                        dw7Var = dw7Var;
                                        vv7Var = vv7Var9;
                                        j2Var2 = j2Var;
                                        it5 = it8;
                                    }
                                }
                            } else {
                                b61.c();
                            }
                            return a45Var4;
                        }
                        b2 = b;
                        if (b3 != 0) {
                            a45Var = a45Var4;
                            it = configGroupCache.getConfigs().iterator();
                            vv7Var = new vv7(j2Var2, false);
                            while (true) {
                                it.getClass();
                                if (it.hasNext()) {
                                    next = it.next();
                                } else {
                                    next = a45Var4;
                                }
                                serverCache = (ServerCache) next;
                                z3 = vv7Var.b;
                                j2VarB = vv7Var.a;
                                if (serverCache == null) {
                                    if (dw7Var.d == uv7.Y) {
                                        gb4VarR.add(new ov7(a45Var, j2VarB.isEmpty()));
                                    }
                                    serverCache2 = (ServerCache) wv0.t0(j2VarB);
                                    if (serverCache2 != null) {
                                        i = 1;
                                        if (j2VarB.a() == 1) {
                                            z5 = true;
                                        } else {
                                            z5 = false;
                                        }
                                        gb4VarR.add(zt4Var.K(serverCache2, Boolean.valueOf(z5)));
                                    } else {
                                        i = 1;
                                    }
                                    it2 = x97.a0(i, j2VarB.a()).iterator();
                                    while (true) {
                                        jf3Var = it2;
                                        if (jf3Var.Z) {
                                            iNextInt = jf3Var.nextInt();
                                            gb4VarR.add(qv7.a);
                                            Object obj9 = j2VarB.get(iNextInt);
                                            if (iNextInt == j2VarB.a() - i) {
                                                z4 = true;
                                            } else {
                                                z4 = false;
                                            }
                                            gb4VarR.add(zt4Var.K(obj9, Boolean.valueOf(z4)));
                                            i = 1;
                                        }
                                    }
                                } else {
                                    boolean isSelected3 = serverCache.getIsSelected();
                                    if (a45Var == null) {
                                        i2 = -1;
                                    } else {
                                        i2 = bw7.a[a45Var.ordinal()];
                                    }
                                    Iterator it9 = it5;
                                    if (i2 != -1) {
                                        if (i2 != 1) {
                                            j2Var = j2Var2;
                                            if (!fm7.d0(serverCache.getConfig().getRemarks(), "only mobile", true)) {
                                            }
                                            if (z6) {
                                                j2VarB = j2VarB.b(serverCache);
                                            }
                                            if (z3) {
                                                z7 = true;
                                            } else {
                                                z7 = true;
                                            }
                                            j2VarB.getClass();
                                            vv7 vv7Var10 = new vv7(j2VarB, z7);
                                            dw7Var = dw7Var;
                                            vv7Var = vv7Var10;
                                            j2Var2 = j2Var;
                                            it5 = it9;
                                        } else if (i2 == 2) {
                                            j2Var = j2Var2;
                                            z6 = true;
                                            if (fm7.d0(serverCache.getConfig().getRemarks(), "only wifi", true)) {
                                            }
                                            if (z6) {
                                                j2VarB = j2VarB.b(serverCache);
                                            }
                                            if (z3) {
                                                z7 = true;
                                            } else {
                                                z7 = true;
                                            }
                                            j2VarB.getClass();
                                            vv7 vv7Var11 = new vv7(j2VarB, z7);
                                            dw7Var = dw7Var;
                                            vv7Var = vv7Var11;
                                            j2Var2 = j2Var;
                                            it5 = it9;
                                        } else {
                                            b61.c();
                                        }
                                        z6 = false;
                                        if (z6) {
                                            j2VarB = j2VarB.b(serverCache);
                                        }
                                        if (z3) {
                                            z7 = true;
                                        } else {
                                            z7 = true;
                                        }
                                        j2VarB.getClass();
                                        vv7 vv7Var12 = new vv7(j2VarB, z7);
                                        dw7Var = dw7Var;
                                        vv7Var = vv7Var12;
                                        j2Var2 = j2Var;
                                        it5 = it9;
                                    } else {
                                        j2Var = j2Var2;
                                    }
                                    z6 = true;
                                    if (z6) {
                                        j2VarB = j2VarB.b(serverCache);
                                    }
                                    if (z3) {
                                        z7 = true;
                                    } else {
                                        z7 = true;
                                    }
                                    j2VarB.getClass();
                                    vv7 vv7Var13 = new vv7(j2VarB, z7);
                                    dw7Var = dw7Var;
                                    vv7Var = vv7Var13;
                                    j2Var2 = j2Var;
                                    it5 = it9;
                                }
                            }
                        } else if (b3 == b2) {
                            qs7VarA = ((zt7) vz7Var2.getValue()).a(subId3);
                            if (qs7VarA != null) {
                                z2 = qs7VarA.f;
                            } else {
                                z2 = false;
                            }
                            if (z2) {
                                a45Var = a45Var4;
                            } else {
                                a45Var = a45Var3;
                            }
                            it = configGroupCache.getConfigs().iterator();
                            vv7Var = new vv7(j2Var2, false);
                            while (true) {
                                it.getClass();
                                if (it.hasNext()) {
                                    next = it.next();
                                } else {
                                    next = a45Var4;
                                }
                                serverCache = (ServerCache) next;
                                z3 = vv7Var.b;
                                j2VarB = vv7Var.a;
                                if (serverCache == null) {
                                    if (dw7Var.d == uv7.Y) {
                                        gb4VarR.add(new ov7(a45Var, j2VarB.isEmpty()));
                                    }
                                    serverCache2 = (ServerCache) wv0.t0(j2VarB);
                                    if (serverCache2 != null) {
                                        i = 1;
                                        if (j2VarB.a() == 1) {
                                            z5 = true;
                                        } else {
                                            z5 = false;
                                        }
                                        gb4VarR.add(zt4Var.K(serverCache2, Boolean.valueOf(z5)));
                                    } else {
                                        i = 1;
                                    }
                                    it2 = x97.a0(i, j2VarB.a()).iterator();
                                    while (true) {
                                        jf3Var = it2;
                                        if (jf3Var.Z) {
                                            iNextInt = jf3Var.nextInt();
                                            gb4VarR.add(qv7.a);
                                            Object obj10 = j2VarB.get(iNextInt);
                                            if (iNextInt == j2VarB.a() - i) {
                                                z4 = true;
                                            } else {
                                                z4 = false;
                                            }
                                            gb4VarR.add(zt4Var.K(obj10, Boolean.valueOf(z4)));
                                            i = 1;
                                        }
                                    }
                                } else {
                                    boolean isSelected4 = serverCache.getIsSelected();
                                    if (a45Var == null) {
                                        i2 = -1;
                                    } else {
                                        i2 = bw7.a[a45Var.ordinal()];
                                    }
                                    Iterator it10 = it5;
                                    if (i2 != -1) {
                                        if (i2 != 1) {
                                            j2Var = j2Var2;
                                            if (!fm7.d0(serverCache.getConfig().getRemarks(), "only mobile", true)) {
                                            }
                                            if (z6) {
                                                j2VarB = j2VarB.b(serverCache);
                                            }
                                            if (z3) {
                                                z7 = true;
                                            } else {
                                                z7 = true;
                                            }
                                            j2VarB.getClass();
                                            vv7 vv7Var14 = new vv7(j2VarB, z7);
                                            dw7Var = dw7Var;
                                            vv7Var = vv7Var14;
                                            j2Var2 = j2Var;
                                            it5 = it10;
                                        } else if (i2 == 2) {
                                            j2Var = j2Var2;
                                            z6 = true;
                                            if (fm7.d0(serverCache.getConfig().getRemarks(), "only wifi", true)) {
                                            }
                                            if (z6) {
                                                j2VarB = j2VarB.b(serverCache);
                                            }
                                            if (z3) {
                                                z7 = true;
                                            } else {
                                                z7 = true;
                                            }
                                            j2VarB.getClass();
                                            vv7 vv7Var15 = new vv7(j2VarB, z7);
                                            dw7Var = dw7Var;
                                            vv7Var = vv7Var15;
                                            j2Var2 = j2Var;
                                            it5 = it10;
                                        } else {
                                            b61.c();
                                        }
                                        z6 = false;
                                        if (z6) {
                                            j2VarB = j2VarB.b(serverCache);
                                        }
                                        if (z3) {
                                            z7 = true;
                                        } else {
                                            z7 = true;
                                        }
                                        j2VarB.getClass();
                                        vv7 vv7Var16 = new vv7(j2VarB, z7);
                                        dw7Var = dw7Var;
                                        vv7Var = vv7Var16;
                                        j2Var2 = j2Var;
                                        it5 = it10;
                                    } else {
                                        j2Var = j2Var2;
                                    }
                                    z6 = true;
                                    if (z6) {
                                        j2VarB = j2VarB.b(serverCache);
                                    }
                                    if (z3) {
                                        z7 = true;
                                    } else {
                                        z7 = true;
                                    }
                                    j2VarB.getClass();
                                    vv7 vv7Var17 = new vv7(j2VarB, z7);
                                    dw7Var = dw7Var;
                                    vv7Var = vv7Var17;
                                    j2Var2 = j2Var;
                                    it5 = it10;
                                }
                            }
                        } else {
                            b61.c();
                        }
                        return a45Var4;
                    }
                    dw7 dw7Var2 = dw7Var;
                    Iterator it11 = it5;
                    j2 j2Var3 = j2Var2;
                    bw0.d0(arrayList5, i21.j(gb4VarR));
                    dw7Var = dw7Var2;
                    it5 = it11;
                    i4 = i5;
                    j2Var2 = j2Var3;
                    a45Var2 = a45Var4;
                    b5 = 1;
                }
                return arrayList5;
            case 13:
                w39.n0(obj);
                b71 b71Var3 = (b71) this.h0;
                y48 y48Var = (y48) this.i0;
                r68 r68Var = y48Var.u0;
                mq5 mq5Var = (mq5) obj3;
                a23 a23Var = new a23(r68Var, y48Var, (byte) 27);
                w51.G(b71Var3, (s61) null, e71Var, new w48(r68Var, mq5Var, null, (byte) 0), 1);
                w51.G(b71Var3, (s61) null, e71Var, new pi(y48Var, r68Var, mq5Var, a23Var, (q51) null, (byte) 19), 1);
                w51.G(b71Var3, (s61) null, e71Var, new qk4(r68Var, mq5Var, a23Var, (q51) null, (byte) 22), 1);
                return dn8Var;
            case 14:
                w39.n0(obj);
                b71 b71Var4 = (b71) this.h0;
                r68 r68Var2 = (r68) this.i0;
                mq5 mq5Var2 = (mq5) obj3;
                w51.G(b71Var4, (s61) null, e71Var, new w48(r68Var2, mq5Var2, null, (byte) 1), 1);
                w51.G(b71Var4, (s61) null, e71Var, new w48(r68Var2, mq5Var2, null, (byte) 2), 1);
                return w51.G(b71Var4, (s61) null, e71Var, new w48(mq5Var2, r68Var2, null), 1);
            case 15:
                o05 o05Var4 = (o05) this.h0;
                w39.n0(obj);
                js5 js5Var2 = ((rp8) this.i0).c;
                cp3 cp3Var = mr.a;
                g55 g55Var2 = ((vm3) cp3Var).b;
                o05Var4.e(js5Var2, cp3Var.b(DownloadFilesInfo.Companion.serializer(), (DownloadFilesInfo) obj3));
                return dn8Var;
            default:
                o05 o05Var5 = (o05) this.h0;
                w39.n0(obj);
                js5 js5Var3 = ((rp8) this.i0).b;
                cp3 cp3Var2 = mr.a;
                g55 g55Var3 = ((vm3) cp3Var2).b;
                o05Var5.e(js5Var3, cp3Var2.b(zo8.Companion.serializer(), (zo8) obj3));
                return dn8Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ co(Object obj, Object obj2, Object obj3, q51 q51Var, byte b) {
        super(2, q51Var);
        this.g0 = b;
        this.h0 = obj;
        this.i0 = obj2;
        this.j0 = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ co(Object obj, String str, Object obj2, q51 q51Var, byte b) {
        super(2, q51Var);
        this.g0 = b;
        this.i0 = obj;
        this.h0 = str;
        this.j0 = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ co(Object obj, Object obj2, q51 q51Var, byte b) {
        super(2, q51Var);
        this.g0 = b;
        this.i0 = obj;
        this.j0 = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public co(String str, MenuItem menuItem, q51 q51Var) {
        super(2, q51Var);
        this.g0 = (byte) 7;
        this.h0 = str;
        this.j0 = menuItem;
    }
}
