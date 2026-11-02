package defpackage;

import com.google.gson.a;
import java.io.File;
import java.net.URL;
import java.util.concurrent.CancellationException;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import okhttp3.Response;
import su.happ.proxyutility.dto.DeviceModel;
import su.happ.proxyutility.dto.HWID;
import su.happ.proxyutility.dto.VersionOS;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class no extends uy7 implements rn2 {
    public final /* synthetic */ qo g0;
    public final /* synthetic */ File h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public no(qo qoVar, File file, q51 q51Var) {
        super(2, q51Var);
        this.g0 = qoVar;
        this.h0 = file;
    }

    @Override // defpackage.rn2
    public final Object K(Object obj, Object obj2) {
        return ((no) n((q51) obj2, (b71) obj)).q(dn8.a);
    }

    @Override // defpackage.r10
    public final q51 n(q51 q51Var, Object obj) {
        return new no(this.g0, this.h0, q51Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.r10
    public final Object q(Object obj) {
        Object rj6Var;
        w39.n0(obj);
        un unVar = un.REPORT;
        be beVar = gx1.Y;
        int iD = (int) gx1.d(vj8.l0(2, lx1.MINUTES));
        qo qoVar = this.g0;
        File file = this.h0;
        try {
            ss8 ss8Var = ss8.a;
            yf8 yf8VarK = ss8.k(qoVar.a);
            String value = ((HWID) yf8VarK.X).getValue();
            String value2 = ((VersionOS) yf8VarK.Y).getValue();
            String value3 = ((DeviceModel) yf8VarK.Z).getValue();
            Response responseExecute = qoVar.b(iD, false, true).newCall(qoVar.a(new URL("https://time-ntp.com/v1report"), value, unVar, value2, value3, null, null, "keep-alive", null).post(new MultipartBody.Builder(null, 1, 0 == true ? 1 : 0).setType(MultipartBody.FORM).addFormDataPart("file", file.getName(), RequestBody.INSTANCE.create(file, MediaType.INSTANCE.parse("application/zip"))).build()).build()).execute();
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
