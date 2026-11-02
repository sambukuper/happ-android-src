package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.Uri;
import android.view.textclassifier.TextClassification;
import androidx.compose.ui.node.LayoutNode;
import androidx.work.impl.WorkDatabase;
import java.io.File;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import okhttp3.Dns;
import okhttp3.internal.dns.StateMachineDnsCall;
import okhttp3.internal.dns._DnsMessageKt;
import okhttp3.internal.http2.Http2Connection;
import okhttp3.internal.ws.WebSocketProtocol;
import org.conscrypt.FileClientSessionCache;
import su.happ.proxyutility.HappApplication;
import su.happ.proxyutility.domain.routing.entity.RouteProfile;
import su.happ.proxyutility.dto.XRayConfig;
import su.happ.proxyutility.dto.enums.SubscriptionAutoConnectType;
import su.happ.proxyutility.feature.main.MainActivity;
import su.happ.proxyutility.feature.routing.rules.RoutingRulesActivity;
import su.happ.proxyutility.feature.settings.SettingsActivity;
import su.happ.proxyutility.feature.settings.SettingsActivity$msgReceiver$1;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a23 implements dn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ Object Z;

    public /* synthetic */ a23(b88 b88Var, pl plVar, bi biVar) {
        this.X = (byte) 29;
        this.Y = plVar;
        this.Z = biVar;
    }

    /* JADX WARN: Code duplicated, block: B:189:0x0210 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x020b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:79:0x020d A[LOOP:0: B:69:0x01db->B:79:0x020d, LOOP_END] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15, types: [jx4] */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18, types: [jx4] */
    /* JADX WARN: Type inference failed for: r1v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v57 */
    /* JADX WARN: Type inference failed for: r1v58 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [c15] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [c15] */
    /* JADX WARN: Type inference failed for: r4v20 */
    @Override // defpackage.dn2
    public final Object invoke() {
        String[] strArrNames;
        byte b = 7;
        int i = 2;
        byte b2 = 1;
        q51 q51Var = null;
        byte b3 = 0;
        switch (this.X) {
            case 0:
                return Http2Connection.ReaderRunnable.applyAndAckSettings$lambda$0$0$1((Http2Connection) this.Y, (ea6) this.Z);
            case 1:
                e37 e37Var = (e37) this.Y;
                vm3 vm3Var = (vm3) this.Z;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                mn3 mn3Var = vm3Var.a;
                sp3.d(vm3Var, e37Var);
                int iE = e37Var.e();
                for (int i2 = 0; i2 < iE; i2++) {
                    List listG = e37Var.g(i2);
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : listG) {
                        if (obj instanceof rp3) {
                            arrayList.add(obj);
                        }
                    }
                    rp3 rp3Var = (rp3) wv0.Q0(arrayList);
                    if (rp3Var != null && (strArrNames = rp3Var.names()) != null) {
                        for (String str : strArrNames) {
                            String str2 = dh3.f(e37Var.r(), j37.M) ? "enum value" : "property";
                            if (linkedHashMap.containsKey(str)) {
                                throw new vn3(ys0.t(-1, "The suggested name '" + str + "' for " + str2 + ' ' + e37Var.f(i2) + " is already one of the names for " + str2 + ' ' + e37Var.f(((Number) zp4.H(linkedHashMap, str)).intValue()) + " in " + e37Var, null, null, null));
                            }
                            linkedHashMap.put(str, Integer.valueOf(i2));
                        }
                    }
                }
                return linkedHashMap.isEmpty() ? e02.X : linkedHashMap;
            case 2:
                LayoutNode layoutNode = (LayoutNode) this.Y;
                ea6 ea6Var = (ea6) this.Z;
                t6 t6Var = layoutNode.H0;
                if ((((jx4) t6Var.i0).f0 & 8) != 0) {
                    for (jx4 jx4Var = (f18) t6Var.h0; jx4Var != null; jx4Var = jx4Var.g0) {
                        if ((jx4Var.Z & 8) != 0) {
                            ?? T = jx4Var;
                            ?? c15Var = 0;
                            while (T != 0) {
                                if (T instanceof w07) {
                                    w07 w07Var = (w07) T;
                                    if (w07Var.J()) {
                                        t07 t07Var = new t07();
                                        ea6Var.X = t07Var;
                                        t07Var.f0 = true;
                                    }
                                    if (w07Var.I0()) {
                                        ((t07) ea6Var.X).Z = true;
                                    }
                                    w07Var.h((f17) ea6Var.X);
                                } else if ((T.Z & 8) != 0 && (T instanceof oh1)) {
                                    jx4 jx4Var2 = ((oh1) T).r0;
                                    int i3 = 0;
                                    while (jx4Var2 != null) {
                                        if ((jx4Var2.Z & 8) != 0) {
                                            i3++;
                                            if (i3 == 1) {
                                                T = T;
                                                c15Var = c15Var;
                                                c15Var = c15Var;
                                                T = jx4Var2;
                                            } else {
                                                if (c15Var == 0) {
                                                    c15Var = new c15(0, new jx4[16]);
                                                }
                                                if (T != 0) {
                                                    c15Var.b(T);
                                                    T = 0;
                                                }
                                                c15Var.b(jx4Var2);
                                            }
                                        } else {
                                            T = T;
                                            c15Var = c15Var;
                                        }
                                        jx4Var2 = jx4Var2.h0;
                                        T = T;
                                        c15Var = c15Var;
                                    }
                                    if (i3 == 1) {
                                        T = T;
                                        c15Var = c15Var;
                                    } else {
                                        T = T;
                                        c15Var = c15Var;
                                    }
                                }
                                T = yn0.T(c15Var);
                            }
                        }
                    }
                }
                return dn8.a;
            case 3:
                return new o74((kv6) this.Y, e02.X, (jv6) this.Z);
            case 4:
                ((gn2) this.Y).B(new bg4((e69) this.Z));
                return dn8.a;
            case 5:
                ((gn2) this.Y).B(new cg4((nf4) this.Z));
                return dn8.a;
            case 6:
                MainActivity mainActivity = (MainActivity) this.Y;
                SubscriptionAutoConnectType subscriptionAutoConnectType = (SubscriptionAutoConnectType) this.Z;
                int i4 = MainActivity.y1;
                jm4.Q(i21.H(mainActivity), null, new jy2((Object) mainActivity, (Object) subscriptionAutoConnectType, q51Var, (byte) 9), 3);
                return dn8.a;
            case 7:
                MainActivity mainActivity2 = (MainActivity) this.Y;
                kn4 kn4Var = (kn4) this.Z;
                int i5 = MainActivity.y1;
                xj7 xj7Var = (xj7) mainActivity2.G().j.getValue();
                xj7Var.getClass();
                jm4.Q(HappApplication.N0, null, new wj7(xj7Var, q51Var, b2), 3);
                mainActivity2.startActivity(new Intent(mainActivity2.getApplicationContext(), (Class<?>) MainActivity.class).setFlags(268468224).setAction("reset_sub_import").putExtra("reset_sub_url", ((in4) kn4Var).a));
                return dn8.a;
            case 8:
                o87 o87Var = (o87) this.Y;
                b71 b71Var = (b71) this.Z;
                if (((Boolean) ((gn2) o87Var.d.f0).B(p87.Z)).booleanValue()) {
                    w51.G(b71Var, null, null, new uw4(o87Var, q51Var, b), 3);
                }
                return Boolean.TRUE;
            case 9:
                f63 f63Var = (f63) this.Y;
                k86 k86Var = (k86) this.Z;
                if (((rv) f63Var.Y).get() == 0) {
                    k86Var.invoke();
                }
                return dn8.a;
            case 10:
                return "Only found " + ((ca6) this.Y).X + " digits in a row, but need to parse " + ((w75) this.Z).b();
            case 11:
                hk5 hk5Var = (hk5) this.Y;
                return new gk5((ik5) this.Z, hk5Var, hk5Var.u);
            case FileClientSessionCache.MAX_SIZE /* 12 */:
                return new File(((Context) this.Y).getApplicationContext().getFilesDir(), "datastore/".concat(((is5) this.Z).a.concat(".preferences_pb")));
            case 13:
                dn2 dn2Var = (dn2) this.Y;
                dn2 dn2Var2 = (dn2) this.Z;
                dn2Var.invoke();
                dn2Var2.invoke();
                return dn8.a;
            case 14:
                t05 t05Var = (t05) this.Y;
                r01 r01Var = (r01) this.Z;
                Object[] objArr = t05Var.b;
                long[] jArr = t05Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i6 = 0;
                    while (true) {
                        long j = jArr[i6];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i7 = 8 - ((~(i6 - length)) >>> 31);
                            for (int i8 = 0; i8 < i7; i8++) {
                                if ((255 & j) < 128) {
                                    r01Var.z(objArr[(i6 << 3) + i8]);
                                }
                                j >>= 8;
                            }
                            if (i7 == 8) {
                                if (i6 != length) {
                                    i6++;
                                }
                            }
                        } else if (i6 != length) {
                            i6++;
                        }
                    }
                }
                return dn8.a;
            case 15:
                pv3 pv3Var = (pv3) this.Y;
                zv5 zv5Var = (zv5) ((bw5) this.Z);
                ((gn2) pv3Var).B(new jo6(zv5Var.b, zv5Var.a));
                return dn8.a;
            case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
                RouteProfile routeProfile = (RouteProfile) this.Y;
                RoutingRulesActivity routingRulesActivity = (RoutingRulesActivity) this.Z;
                int i9 = RoutingRulesActivity.X0;
                String subId = routeProfile.getSubId();
                routingRulesActivity.C().y(routeProfile.getId(), subId);
                mn6 mn6VarC = routingRulesActivity.C();
                mn6VarC.getClass();
                subId.getClass();
                if (mn6VarC.o(subId).isEmpty()) {
                    routingRulesActivity.C().F(subId, false);
                }
                routingRulesActivity.finish();
                return dn8.a;
            case 17:
                return km4.m((String) this.Y, qq5.M, new e37[0], new ty6((uy6) this.Z, b3));
            case 18:
                SettingsActivity settingsActivity = (SettingsActivity) this.Y;
                String str3 = (String) this.Z;
                int i10 = SettingsActivity$msgReceiver$1.b;
                ss8 ss8Var = ss8.a;
                ss8.E(settingsActivity, str3);
                pu.Q(settingsActivity, y46.toast_copied_to_clipboard);
                return dn8.a;
            case 19:
                zw2 zw2Var = (zw2) this.Y;
                ConnectivityManager connectivityManager = (ConnectivityManager) this.Z;
                synchronized (y77.b) {
                    LinkedHashMap linkedHashMap2 = y77.c;
                    linkedHashMap2.remove(zw2Var);
                    if (linkedHashMap2.isEmpty()) {
                        lh4 lh4VarP0 = lh4.P0();
                        int i11 = k39.a;
                        lh4VarP0.getClass();
                        connectivityManager.unregisterNetworkCallback(y77.a);
                        y77.f = null;
                        y77.d = null;
                        y77.e = false;
                    }
                    break;
                }
                return dn8.a;
            case 20:
                SharedPreferences sharedPreferences = ((Context) this.Y).getSharedPreferences((String) this.Z, 0);
                sharedPreferences.getClass();
                return sharedPreferences;
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.mtuMin /* 21 */:
                return StateMachineDnsCall.enqueue$lambda$1((Dns.Callback) this.Y, (StateMachineDnsCall) this.Z);
            case 22:
                return ((t16) this.Y).B((WorkDatabase) this.Z);
            case 23:
                pv3 pv3Var2 = (pv3) this.Y;
                String str4 = ((yv5) ((aw5) this.Z)).a;
                str4.getClass();
                ((gn2) pv3Var2).B(new qo7(str4));
                return dn8.a;
            case 24:
                mx7 mx7Var = (mx7) this.Y;
                List list = (List) this.Z;
                zx zxVar = kl7.a;
                return Boolean.valueOf(kl7.a(mx7Var.a, list));
            case 25:
                ue3.L((Context) this.Y, (TextClassification) this.Z);
                return dn8.a;
            case 26:
                n48 n48Var = (n48) this.Y;
                ca6 ca6Var = (ca6) this.Z;
                n48Var.v0.d();
                if (n48Var.p0 && ((Boolean) ((y74) ((t09) hi5.W(n48Var, y01.u))).c.getValue()).booleanValue()) {
                    i = 1;
                }
                int i12 = ca6Var.X;
                int i13 = i * i12;
                ca6Var.X = i12 * (-1);
                return Integer.valueOf(i13);
            case 27:
                r68 r68Var = (r68) this.Y;
                y48 y48Var = (y48) this.Z;
                if (!r68Var.h) {
                    ci2 ci2Var = y48Var.B0;
                    if (ci2Var.p0) {
                        ai2.h1(ci2Var.x0);
                    }
                }
                return dn8.a;
            case _DnsMessageKt.TYPE_AAAA /* 28 */:
                w51.G((b71) this.Y, null, e71.f0, new u68((gn2) this.Z, q51Var, b3), 1);
                return dn8.a;
            default:
                pl plVar = (pl) this.Y;
                bi biVar = (bi) this.Z;
                pa4 pa4Var = (pa4) plVar.a;
                if (pa4Var instanceof oa4) {
                    try {
                        String str5 = ((oa4) pa4Var).a;
                        biVar.getClass();
                        try {
                            biVar.a.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str5)));
                        } catch (ActivityNotFoundException e) {
                            throw new IllegalArgumentException(pc6.p("Can't open ", str5, "."), e);
                        }
                        break;
                    } catch (IllegalArgumentException unused) {
                    }
                }
                return dn8.a;
        }
    }

    public /* synthetic */ a23(Object obj, Object obj2, byte b) {
        this.X = b;
        this.Y = obj;
        this.Z = obj2;
    }
}
