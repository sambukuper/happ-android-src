package defpackage;

import java.io.IOException;
import okhttp3.Interceptor;
import okhttp3.Response;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class w96 implements Interceptor {
    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) throws IOException {
        chain.getClass();
        Response responseProceed = chain.proceed(chain.request());
        String strHeader$default = Response.header$default(responseProceed, "location", null, 2, null);
        if (strHeader$default != null && mm7.Z(strHeader$default, false, "happ://")) {
            kw2 kw2Var = kw2.a;
            strHeader$default = kw2.j(strHeader$default);
        }
        return strHeader$default == null ? responseProceed : chain.proceed(chain.request().newBuilder().url(strHeader$default).build());
    }
}
