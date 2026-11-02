package defpackage;

import com.google.gson.a;
import java.net.URL;
import java.util.concurrent.CancellationException;
import okhttp3.Response;
import su.happ.proxyutility.dto.DeviceModel;
import su.happ.proxyutility.dto.HWID;
import su.happ.proxyutility.dto.ProviderId;
import su.happ.proxyutility.dto.SubscriptionExtraStatus;
import su.happ.proxyutility.dto.VersionOS;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class fo extends uy7 implements rn2 {
    public final /* synthetic */ byte g0 = 1;
    public /* synthetic */ Object h0;
    public final /* synthetic */ Object i0;
    public final /* synthetic */ Object j0;
    public final /* synthetic */ Object k0;
    public final /* synthetic */ Object l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fo(tn tnVar, String str, qo qoVar, String str2, Long l, q51 q51Var) {
        super(2, q51Var);
        this.h0 = tnVar;
        this.i0 = str;
        this.k0 = qoVar;
        this.j0 = str2;
        this.l0 = l;
    }

    @Override // defpackage.rn2
    public final Object K(Object obj, Object obj2) {
        byte b = this.g0;
        dn8 dn8Var = dn8.a;
        b71 b71Var = (b71) obj;
        q51 q51Var = (q51) obj2;
        switch (b) {
            case 0:
                break;
        }
        return ((fo) n(q51Var, b71Var)).q(dn8Var);
    }

    @Override // defpackage.r10
    public final q51 n(q51 q51Var, Object obj) {
        byte b = this.g0;
        Object obj2 = this.l0;
        Object obj3 = this.k0;
        Object obj4 = this.j0;
        Object obj5 = this.i0;
        switch (b) {
            case 0:
                return new fo((tn) this.h0, (String) obj5, (qo) obj3, (String) obj4, (Long) obj2, q51Var);
            default:
                fo foVar = new fo((t80) obj5, (i55) obj4, (p5) obj3, (g00) obj2, q51Var);
                foVar.h0 = obj;
                return foVar;
        }
    }

    @Override // defpackage.r10
    public final Object q(Object obj) {
        Object rj6Var;
        byte b = this.g0;
        Object obj2 = this.l0;
        Object obj3 = this.k0;
        Object obj4 = this.j0;
        Object obj5 = this.i0;
        switch (b) {
            case 0:
                w39.n0(obj);
                ProviderId.Companion companion = ProviderId.INSTANCE;
                String strP = pc6.p(((tn) this.h0).X, "/v1provider?id=", (String) obj5);
                un unVar = un.PROVIDER;
                qo qoVar = (qo) obj3;
                String str = (String) obj4;
                Long l = (Long) obj2;
                try {
                    ss8 ss8Var = ss8.a;
                    yf8 yf8VarK = ss8.k(qoVar.a);
                    Response responseExecute = qoVar.b(9000, true, false).newCall(qoVar.a(new URL(strP), ((HWID) yf8VarK.X).getValue(), unVar, ((VersionOS) yf8VarK.Y).getValue(), ((DeviceModel) yf8VarK.Z).getValue(), str, null, "close", l).build()).execute();
                    String strString = responseExecute.body().string();
                    ss8.t();
                    Integer num = new Integer(responseExecute.code());
                    a aVar = yw2.b;
                    aVar.getClass();
                    Object objC = aVar.c(strString, new yi8(SubscriptionExtraStatus.class));
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
            default:
                w39.n0(obj);
                b71 b71Var = (b71) this.h0;
                t80 t80Var = (t80) obj5;
                q51 q51Var = null;
                w51.G(b71Var, null, null, new r0((Object) t80Var, obj4, obj3, q51Var, (byte) 6), 3);
                return w51.G(b71Var, null, null, new q0(t80Var, (g00) obj2, q51Var, (byte) 8), 3);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fo(t80 t80Var, i55 i55Var, p5 p5Var, g00 g00Var, q51 q51Var) {
        super(2, q51Var);
        this.i0 = t80Var;
        this.j0 = i55Var;
        this.k0 = p5Var;
        this.l0 = g00Var;
    }
}
