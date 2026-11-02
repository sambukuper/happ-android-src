package su.happ.proxyutility.util.adapters;

import android.text.TextUtils;
import com.google.gson.a;
import java.lang.reflect.Type;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lsu/happ/proxyutility/util/adapters/ParsingRoutingAdapter;", "T", "Lyn3;", "<init>", "()V", "app"}, k = XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin, mv = {XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin, 4, 0}, xi = 48)
public final class ParsingRoutingAdapter<T> implements yn3 {
    public final SimpleDateFormat a = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault());

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object a(bo3 bo3Var, Type type) {
        bo3Var.getClass();
        en3 en3VarB = bo3Var.b();
        for (bo3 bo3Var2 : en3VarB.X) {
            try {
                bq3 bq3VarC = bo3Var2.c().l("routeSettings").c();
                bo3 bo3VarJ = bq3VarC.j("DateLastUpdateSite");
                if (bo3VarJ != null && (bo3VarJ instanceof iq3)) {
                    String strD = bo3VarJ.d();
                    strD.getClass();
                    if (!TextUtils.isDigitsOnly(strD)) {
                        String strD2 = bo3VarJ.d();
                        strD2.getClass();
                        bq3VarC.f(b(strD2), "DateLastUpdateSite");
                    }
                }
            } catch (Throwable th) {
                if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                    throw th;
                }
            }
            try {
                bq3 bq3VarC2 = bo3Var2.c().l("routeSettings").c();
                bo3 bo3VarJ2 = bq3VarC2.c().j("DateLastUpdateIp");
                if (bo3VarJ2 != null && (bo3VarJ2 instanceof iq3)) {
                    String strD3 = bo3VarJ2.d();
                    strD3.getClass();
                    if (!TextUtils.isDigitsOnly(strD3)) {
                        String strD4 = bo3VarJ2.d();
                        strD4.getClass();
                        bq3VarC2.f(b(strD4), "DateLastUpdateIp");
                    }
                }
            } catch (Throwable th2) {
                if ((th2 instanceof InterruptedException) || (th2 instanceof CancellationException)) {
                    throw th2;
                }
            }
        }
        return new a().a(en3VarB, type);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Long b(String str) {
        Long rj6Var;
        try {
            Date date = this.a.parse(str);
            rj6Var = date != null ? Long.valueOf(date.getTime()) : null;
        } catch (Throwable th) {
            if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                throw th;
            }
            rj6Var = new rj6(th);
        }
        return rj6Var instanceof rj6 ? null : rj6Var;
    }
}
