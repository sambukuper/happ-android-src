package defpackage;

import com.google.gson.a;
import java.net.URL;
import java.util.List;
import java.util.concurrent.CancellationException;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okhttp3.Response;
import su.happ.proxyutility.dto.DeviceModel;
import su.happ.proxyutility.dto.HWID;
import su.happ.proxyutility.dto.VersionOS;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class lo extends uy7 implements rn2 {
    public final /* synthetic */ String g0;
    public final /* synthetic */ List h0;
    public final /* synthetic */ qo i0;
    public final /* synthetic */ short j0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: int */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public lo(String str, List list, qo qoVar, int i, q51 q51Var) {
        super(2, q51Var);
        this.g0 = str;
        this.h0 = list;
        this.i0 = qoVar;
        this.j0 = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object K(Object obj, Object obj2) {
        return n((q51) obj2, (b71) obj).q(dn8.a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final q51 n(q51 q51Var, Object obj) {
        return new lo(this.g0, this.h0, this.i0, this.j0, q51Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object q(Object obj) {
        qg5 rj6Var;
        w39.n0(obj);
        String strL = oi0.l("https://ntp2-sync.com/v1remotepush?token=", this.g0);
        un unVar = un.REMOTE_PUSH;
        String strY0 = wv0.y0(this.h0, (CharSequence) null, (String) null, (String) null, (gn2) null, 63);
        qo qoVar = this.i0;
        short s = this.j0;
        try {
            ss8 ss8Var = ss8.a;
            yf8 yf8VarK = ss8.k(qoVar.a);
            Response responseExecute = qoVar.b(s, false, false).newCall(qoVar.a(new URL(strL), ((HWID) yf8VarK.X).getValue(), unVar, ((VersionOS) yf8VarK.Y).getValue(), ((DeviceModel) yf8VarK.Z).getValue(), null, strY0, "close", null).post(RequestBody.Companion.create$default(RequestBody.Companion, new byte[0], (MediaType) null, 0, 0, 7, (Object) null)).build()).execute();
            String strString = responseExecute.body().string();
            ss8.t();
            Integer num = new Integer(responseExecute.code());
            a aVar = yw2.b;
            aVar.getClass();
            Object objC = aVar.c(strString, new yi8(Object.class));
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
    }
}
