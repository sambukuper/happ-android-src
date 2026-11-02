package defpackage;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteTransactionListener;
import android.os.CancellationSignal;
import java.lang.reflect.Method;
import java.util.ArrayList;
import okhttp3.internal.dns._DnsMessageKt;
import okhttp3.internal.ws.WebSocketProtocol;
import org.conscrypt.FileClientSessionCache;
import su.happ.proxyutility.HappApplication;
import su.happ.proxyutility.dto.XRayConfig;
import su.happ.proxyutility.firebase.FirebaseMessagingService;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j72 implements dn2 {
    public final /* synthetic */ byte X;

    public /* synthetic */ j72(HappApplication happApplication) {
        this.X = (byte) 18;
    }

    @Override // defpackage.dn2
    public final Object invoke() {
        Class<?> returnType;
        byte b = this.X;
        qx7 qx7Var = qx7.X;
        switch (b) {
            case 0:
                kw4 kw4Var = kw4.a;
                return kw4.l();
            case 1:
                return new qw2();
            case 2:
                return new l72();
            case 3:
                HappApplication happApplication = HappApplication.M0;
                return (pr7) k32.i().G0.getValue();
            case 4:
                HappApplication happApplication2 = HappApplication.M0;
                return k32.i().g();
            case 5:
                HappApplication happApplication3 = HappApplication.M0;
                return (en7) k32.i().l0.getValue();
            case 6:
                HappApplication happApplication4 = HappApplication.M0;
                return k32.i().d();
            case 7:
                int i = FirebaseMessagingService.n0;
                return new ib2();
            case 8:
                HappApplication happApplication5 = HappApplication.M0;
                return k32.i().c();
            case 9:
                HappApplication happApplication6 = HappApplication.M0;
                return k32.i().d();
            case 10:
                return Boolean.FALSE;
            case 11:
                try {
                    Method declaredMethod = SQLiteDatabase.class.getDeclaredMethod("getThreadSession", null);
                    declaredMethod.setAccessible(true);
                    return declaredMethod;
                } catch (Throwable unused) {
                    return null;
                }
            case FileClientSessionCache.MAX_SIZE /* 12 */:
                try {
                    Method method = (Method) sm2.f0.getValue();
                    if (method == null || (returnType = method.getReturnType()) == null) {
                        return null;
                    }
                    Class cls = Integer.TYPE;
                    return returnType.getDeclaredMethod("beginTransaction", cls, SQLiteTransactionListener.class, cls, CancellationSignal.class);
                } catch (Throwable unused2) {
                    return null;
                }
            case 13:
                return dn8.a;
            case 14:
                HappApplication happApplication7 = HappApplication.M0;
                return k32.i().f();
            case 15:
                vz7 vz7Var = xu2.a;
                ArrayList arrayList = new ArrayList();
                nx7 nx7Var = new nx7();
                jl7 jl7Var = rx7.e;
                ox7 ox7Var = ox7.S1080P_16_9;
                jl7 jl7Var2 = rx7.e;
                nx7Var.a(we5.f(qx7Var, ox7Var, jl7Var2));
                arrayList.add(nx7Var);
                nx7 nx7Var2 = new nx7();
                ox7 ox7Var2 = ox7.S720P_16_9;
                nx7Var2.a(we5.f(qx7Var, ox7Var2, jl7Var2));
                arrayList.add(nx7Var2);
                ox7 ox7Var3 = ox7.MAXIMUM_16_9;
                arrayList.addAll(xu2.a(ox7Var, ox7Var3));
                ox7 ox7Var4 = ox7.UHD;
                arrayList.addAll(xu2.a(ox7Var, ox7Var4));
                arrayList.addAll(xu2.a(ox7Var, ox7.S1440P_16_9));
                arrayList.addAll(xu2.a(ox7Var, ox7Var));
                arrayList.addAll(xu2.a(ox7Var2, ox7Var3));
                arrayList.addAll(xu2.a(ox7Var2, ox7Var4));
                arrayList.addAll(xu2.a(ox7Var2, ox7Var));
                ox7 ox7Var5 = ox7.X_VGA;
                ox7 ox7Var6 = ox7.MAXIMUM_4_3;
                arrayList.addAll(xu2.a(ox7Var5, ox7Var6));
                arrayList.addAll(xu2.a(ox7.S1080P_4_3, ox7Var6));
                return arrayList;
            case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
                ArrayList arrayList2 = new ArrayList();
                nx7 nx7Var3 = new nx7();
                jl7 jl7Var3 = rx7.e;
                ox7 ox7Var7 = ox7.S1080P_16_9;
                jl7 jl7Var4 = rx7.e;
                ie2.o(nx7Var3, we5.f(qx7Var, ox7Var7, jl7Var4), qx7Var, ox7Var7, jl7Var4);
                nx7 nx7VarE = ie2.e(arrayList2, nx7Var3);
                nx7VarE.a(we5.f(qx7Var, ox7Var7, jl7Var4));
                nx7VarE.a(we5.f(qx7Var, ox7.S1440P_16_9, jl7Var4));
                arrayList2.add(nx7VarE);
                nx7 nx7Var4 = new nx7();
                nx7Var4.a(we5.f(qx7Var, ox7Var7, jl7Var4));
                nx7Var4.a(we5.f(qx7Var, ox7.UHD, jl7Var4));
                arrayList2.add(nx7Var4);
                nx7 nx7Var5 = new nx7();
                nx7Var5.a(we5.f(qx7Var, ox7Var7, jl7Var4));
                ie2.o(nx7Var5, we5.f(qx7.Y, ox7Var7, jl7Var4), qx7Var, ox7Var7, jl7Var4);
                arrayList2.add(nx7Var5);
                return arrayList2;
            case 17:
                HappApplication happApplication8 = HappApplication.M0;
                return new sf5();
            case 18:
                HappApplication happApplication9 = HappApplication.M0;
                return new vp8();
            case 19:
                HappApplication happApplication10 = HappApplication.M0;
                return new p72();
            case 20:
                HappApplication happApplication11 = HappApplication.M0;
                return new q17();
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.mtuMin /* 21 */:
                HappApplication happApplication12 = HappApplication.M0;
                return new a93();
            case 22:
                HappApplication happApplication13 = HappApplication.M0;
                return new mn6();
            case 23:
                HappApplication happApplication14 = HappApplication.M0;
                return new i83();
            case 24:
                HappApplication happApplication15 = HappApplication.M0;
                return new ms();
            case 25:
                HappApplication happApplication16 = HappApplication.M0;
                return new zt7();
            case 26:
                HappApplication happApplication17 = HappApplication.M0;
                return new mq0();
            case 27:
                HappApplication happApplication18 = HappApplication.M0;
                return new ht1();
            case _DnsMessageKt.TYPE_AAAA /* 28 */:
                HappApplication happApplication19 = HappApplication.M0;
                return new k61();
            default:
                HappApplication happApplication20 = HappApplication.M0;
                return new gk7();
        }
    }

    public /* synthetic */ j72(byte b) {
        this.X = b;
    }
}
