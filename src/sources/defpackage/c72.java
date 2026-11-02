package defpackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class c72 extends uy7 implements rn2 {
    public final /* synthetic */ byte g0;
    public final /* synthetic */ Response h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c72(Response response, q51 q51Var, byte b) {
        super(2, q51Var);
        this.g0 = b;
        this.h0 = response;
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
        return ((c72) n(q51Var, b71Var)).q(dn8Var);
    }

    @Override // defpackage.r10
    public final q51 n(q51 q51Var, Object obj) {
        byte b = this.g0;
        Response response = this.h0;
        switch (b) {
            case 0:
                return new c72(response, q51Var, (byte) 0);
            default:
                return new c72(response, q51Var, (byte) 1);
        }
    }

    @Override // defpackage.r10
    public final Object q(Object obj) throws IOException {
        InputStream inputStreamByteStream;
        byte b = this.g0;
        Response response = this.h0;
        switch (b) {
            case 0:
                w39.n0(obj);
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(response.body().byteStream(), iq0.a), 8192);
                try {
                    String strE = dt7.e(bufferedReader);
                    bufferedReader.close();
                    return strE;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        oc.h(bufferedReader, th);
                        throw th2;
                    }
                }
            default:
                w39.n0(obj);
                ResponseBody responseBodyBody = response.body();
                if (responseBodyBody == null || (inputStreamByteStream = responseBodyBody.byteStream()) == null) {
                    return null;
                }
                BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(inputStreamByteStream, iq0.a), 8192);
                try {
                    String strE2 = dt7.e(bufferedReader2);
                    bufferedReader2.close();
                    return strE2;
                } catch (Throwable th3) {
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        oc.h(bufferedReader2, th3);
                        throw th4;
                    }
                }
        }
    }
}
