package defpackage;

import android.content.Context;
import java.util.concurrent.CancellationException;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import su.happ.proxyutility.HappApplication;
import su.happ.proxyutility.dto.AdditionalInfoCode;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class ai3 implements Interceptor {
    public final Context a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ai3(Context context) {
        this.a = context;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Response intercept(Interceptor.Chain chain) {
        Object rj6Var;
        chain.getClass();
        Request request = chain.request();
        Response responseProceed = chain.proceed(request);
        ResponseBody responseBodyBody = responseProceed.body();
        String strString = responseBodyBody != null ? responseBodyBody.string() : null;
        if (strString == null) {
            strString = "";
        }
        String str = strString;
        try {
            cp3 cp3Var = mr.a;
            g55 g55Var = ((vm3) cp3Var).b;
            rj6Var = cp3Var.a(yh3.Companion.serializer(), str);
        } catch (Throwable th) {
            if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                throw th;
            }
            rj6Var = new rj6(th);
        }
        if (rj6Var instanceof rj6) {
            rj6Var = null;
        }
        yh3 yh3Var = (yh3) rj6Var;
        AdditionalInfoCode additionalInfoCode = yh3Var != null ? yh3Var.a : null;
        String str2 = request.headers().get("X-Domain-Hash");
        if (str2 == null) {
            str2 = null;
        }
        Context context = this.a;
        if (additionalInfoCode == null || additionalInfoCode.getValue() != 100) {
            qe4.L0(context, "su.happ.proxyutility.action.activity", 127, Boolean.TRUE);
        } else {
            qe4.L0(context, "su.happ.proxyutility.action.activity", 127, Boolean.FALSE);
        }
        if (additionalInfoCode != null && str2 != null) {
            HappApplication happApplication = HappApplication.M0;
            k32.i().d().h(new ii(request, responseProceed, additionalInfoCode, str2, (byte) 3));
        }
        Response.Builder builderNewBuilder = responseProceed.newBuilder();
        if (responseBodyBody != null) {
            builderNewBuilder = builderNewBuilder.body(new zh3(str, responseBodyBody));
        }
        return builderNewBuilder.build();
    }
}
