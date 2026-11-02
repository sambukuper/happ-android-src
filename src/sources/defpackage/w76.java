package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import com.google.gson.a;
import com.tencent.mmkv.MMKV;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import okhttp3.internal.dns._DnsMessageKt;
import okhttp3.internal.ws.WebSocketProtocol;
import org.conscrypt.FileClientSessionCache;
import su.happ.proxyutility.HappApplication;
import su.happ.proxyutility.dto.ProfileRoutingSettings;
import su.happ.proxyutility.dto.XRayConfig;
import su.happ.proxyutility.dto.enums.EDnsType;
import su.happ.proxyutility.feature.reset_settings.ResetSettingsActivity;
import su.happ.proxyutility.feature.routing.rules.RoutingRulesActivity;
import su.happ.proxyutility.feature.routing.settings.RoutingSettingsActivity;
import su.happ.proxyutility.ui.ServerActivity;
import su.happ.proxyutility.util.adapters.ParsingRoutingAdapter;
import su.happ.proxyutility.util.adapters.ParsingTypeAdapter;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w76 implements dn2 {
    public final /* synthetic */ byte X;

    public /* synthetic */ w76(byte b) {
        this.X = b;
    }

    @Override // defpackage.dn2
    public final Object invoke() {
        byte b = this.X;
        dn8 dn8Var = dn8.a;
        int i = 0;
        switch (b) {
            case 0:
                List listS0 = wv0.S0((List) y47.a.getValue(), new mv4((byte) 4));
                ArrayList arrayList = new ArrayList();
                int size = listS0.size();
                while (i < size) {
                    ((m95) listS0.get(i)).getClass();
                    arrayList.add(new qg5(new k35(new dw4((byte) 13)), yb6.a.b(dq8.class)));
                    i++;
                }
                return arrayList;
            case 1:
                List listS1 = wv0.S0((List) y47.b.getValue(), new mv4((byte) 5));
                ArrayList arrayList2 = new ArrayList();
                int size2 = listS1.size();
                while (i < size2) {
                    arrayList2.add(((ud1) listS1.get(i)).a());
                    i++;
                }
                return arrayList2;
            case 2:
                return null;
            case 3:
                kd6[] kd6VarArrValues = kd6.values();
                kd6VarArrValues.getClass();
                return new u22("su.happ.proxyutility.firebase.entity.notification.RemoteMessageEntity.PushType", kd6VarArrValues);
            case 4:
                int i2 = ResetSettingsActivity.T0;
                HappApplication happApplication = HappApplication.M0;
                return (xj7) k32.i().o0.getValue();
            case 5:
                int i3 = ResetSettingsActivity.T0;
                return dn8Var;
            case 6:
                int i4 = ResetSettingsActivity.T0;
                HappApplication happApplication2 = HappApplication.M0;
                Object systemService = k32.i().getSystemService("activity");
                ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
                if (activityManager != null) {
                    activityManager.clearApplicationUserData();
                }
                return dn8Var;
            case 7:
                int i5 = ResetSettingsActivity.T0;
                return dn8Var;
            case 8:
                return new dl6();
            case 9:
                su2 su2Var = yw2.a;
                su2Var.c(ProfileRoutingSettings.class, new ParsingTypeAdapter());
                return new a(su2Var);
            case 10:
                su2 su2Var2 = yw2.a;
                su2Var2.c(new an6().b, new ParsingRoutingAdapter());
                return new a(su2Var2);
            case 11:
                HappApplication happApplication3 = HappApplication.M0;
                return (ht1) k32.i().f0.getValue();
            case FileClientSessionCache.MAX_SIZE /* 12 */:
                HappApplication happApplication4 = HappApplication.M0;
                return k32.i().f();
            case 13:
                HappApplication happApplication5 = HappApplication.M0;
                return k32.i().i();
            case 14:
                kw4 kw4Var = kw4.a;
                return kw4.l();
            case 15:
                int i6 = RoutingRulesActivity.X0;
                HappApplication happApplication6 = HappApplication.M0;
                return k32.i().f();
            case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
                int i7 = RoutingRulesActivity.X0;
                l22 l22VarA = EDnsType.a();
                ArrayList arrayList3 = new ArrayList(xv0.Z(l22VarA, 10));
                Iterator<E> it = l22VarA.iterator();
                while (it.hasNext()) {
                    arrayList3.add(((EDnsType) it.next()).getText());
                }
                return (String[]) arrayList3.toArray(new String[0]);
            case 17:
                int i8 = RoutingSettingsActivity.T0;
                HappApplication happApplication7 = HappApplication.M0;
                return k32.i().f();
            case 18:
                HappApplication happApplication8 = HappApplication.M0;
                return k32.i().f();
            case 19:
                HappApplication happApplication9 = HappApplication.M0;
                Context applicationContext = k32.i().getApplicationContext();
                applicationContext.getClass();
                return new ak7(applicationContext);
            case 20:
                return new jv6(new LinkedHashMap());
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.mtuMin /* 21 */:
                return null;
            case 22:
                return new ay6(0);
            case 23:
                return null;
            case 24:
                HappApplication happApplication10 = HappApplication.M0;
                return k32.i().a();
            case 25:
                HappApplication happApplication11 = HappApplication.M0;
                return (vr1) k32.i().x0.getValue();
            case 26:
                HappApplication happApplication12 = HappApplication.M0;
                return k32.i().d();
            case 27:
                HappApplication happApplication13 = HappApplication.M0;
                return new u17(k32.i().a());
            case _DnsMessageKt.TYPE_AAAA /* 28 */:
                return new fa0();
            default:
                int i9 = ServerActivity.c3;
                return MMKV.t("MAIN", vj8.M());
        }
    }
}
