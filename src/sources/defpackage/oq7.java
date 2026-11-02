package defpackage;

import android.content.Context;
import java.net.Proxy;
import java.net.URL;
import java.util.HashMap;
import okhttp3.Request;
import su.happ.proxyutility.dto.DeviceModel;
import su.happ.proxyutility.dto.HWID;
import su.happ.proxyutility.dto.SubscriptionItem;
import su.happ.proxyutility.dto.VersionOS;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class oq7 extends e72 implements zr7 {
    public final vz7 d;

    public oq7(Context context) {
        super(context);
        this.d = new vz7(new mq7((byte) 0));
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    @Override // defpackage.zr7
    public final Object a(String str, String str2, Proxy proxy, HashMap map, String str3, boolean z, s51 s51Var) {
        nq7 nq7Var;
        ps7 ps7Var;
        ms7 ms7Var;
        if (s51Var instanceof nq7) {
            nq7Var = (nq7) s51Var;
            int i = nq7Var.h0;
            if ((i & Integer.MIN_VALUE) != 0) {
                nq7Var.h0 = i - Integer.MIN_VALUE;
            } else {
                nq7Var = new nq7(this, s51Var);
            }
        } else {
            nq7Var = new nq7(this, s51Var);
        }
        nq7 nq7Var2 = nq7Var;
        Object obj = nq7Var2.f0;
        int i2 = nq7Var2.h0;
        String str4 = null;
        if (i2 != 0) {
            if (i2 == 1) {
                w39.n0(obj);
                return ((sj6) obj).X;
            }
            bt.i("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        w39.n0(obj);
        qs7 qs7VarA = ((zt7) this.d.getValue()).a(str2);
        boolean z2 = (qs7VarA == null || (ms7Var = qs7VarA.g) == null) ? true : ms7Var.a;
        ss8 ss8Var = ss8.a;
        Context context = this.a;
        yf8 yf8VarK = ss8.k(context);
        String value = ((HWID) yf8VarK.X).getValue();
        String value2 = ((VersionOS) yf8VarK.Y).getValue();
        String value3 = ((DeviceModel) yf8VarK.Z).getValue();
        URL url = new URL(str);
        if (qs7VarA != null && (ps7Var = qs7VarA.i) != null) {
            str4 = ps7Var.a;
        }
        Request.Builder builderE = e(url, str4);
        if (z2) {
            builderE = builderE.header("X-HWID", value).header("X-Device-OS", ue3.y(context) ? "AndroidTV" : "Android").header("X-Ver-OS", value2).header("X-Device-model", value3);
        }
        Request requestBuild = builderE.build();
        kw4 kw4Var = kw4.a;
        SubscriptionItem subscriptionItemF = kw4.f(str2);
        boolean zU = subscriptionItemF != null ? subscriptionItemF.U() : false;
        Long l = new Long(new Integer(qs7VarA != null ? qs7VarA.h : 7).longValue() * 1000);
        iq1 iq1Var = new iq1((byte) 3, requestBuild, builderE, zU);
        nq7Var2.h0 = 1;
        Object objD = e72.d(this, l, proxy, map, str3, z, iq1Var, nq7Var2);
        c71 c71Var = c71.X;
        return objD == c71Var ? c71Var : objD;
    }
}
