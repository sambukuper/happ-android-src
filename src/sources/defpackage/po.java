package defpackage;

import com.google.gson.a;
import java.net.URL;
import java.util.concurrent.CancellationException;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import su.happ.proxyutility.dto.DeviceModel;
import su.happ.proxyutility.dto.HWID;
import su.happ.proxyutility.dto.SendTVGetResponse;
import su.happ.proxyutility.dto.SendTVRequest;
import su.happ.proxyutility.dto.VersionOS;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class po extends uy7 implements rn2 {
    public final /* synthetic */ qo g0;
    public final /* synthetic */ String h0;
    public final /* synthetic */ String[] i0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public po(qo qoVar, String str, String[] strArr, q51 q51Var) {
        super(2, q51Var);
        this.g0 = qoVar;
        this.h0 = str;
        this.i0 = strArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object K(Object obj, Object obj2) {
        return n((q51) obj2, (b71) obj).q(dn8.a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final q51 n(q51 q51Var, Object obj) {
        return new po(this.g0, this.h0, this.i0, q51Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object q(Object obj) {
        qg5 rj6Var;
        w39.n0(obj);
        qo qoVar = this.g0;
        String strL = oi0.l("https://ntp2-sync.com/v1sendtv/", this.h0);
        un unVar = un.SEND_TV;
        String[] strArr = this.i0;
        try {
            ss8 ss8Var = ss8.a;
            yf8 yf8VarK = ss8.k(qoVar.a);
            String value = ((HWID) yf8VarK.X).getValue();
            String value2 = ((VersionOS) yf8VarK.Y).getValue();
            String value3 = ((DeviceModel) yf8VarK.Z).getValue();
            OkHttpClient okHttpClientB = qoVar.b(9000, false, false);
            Request.Builder builderA = qoVar.a(new URL(strL), value, unVar, value2, value3, null, null, "close", null);
            RequestBody.Companion companion = RequestBody.Companion;
            a aVar = yw2.b;
            Response responseExecute = okHttpClientB.newCall(builderA.post(companion.create(aVar.h(new SendTVRequest(wl7.b0(10, eu.x0(strArr, "\n", (String) null, (String) null, (gn2) null, 62)))), MediaType.Companion.get("application/json"))).build()).execute();
            String strString = responseExecute.body().string();
            ss8.t();
            Integer num = new Integer(responseExecute.code());
            Object objC = aVar.c(strString, new yi8(SendTVGetResponse.class));
            if (objC == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            rj6Var = new qg5(num, objC);
            if (!(rj6Var instanceof rj6)) {
                rj6Var = new Integer(((Number) rj6Var.X).intValue());
            }
            return new sj6(rj6Var);
        } catch (Throwable th) {
            if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                throw th;
            }
            rj6Var = new rj6(th);
        }
    }
}
