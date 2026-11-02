package su.happ.proxyutility.util.adapters;

import java.lang.reflect.Type;
import java.util.Locale;
import kotlin.Metadata;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lsu/happ/proxyutility/util/adapters/ParsingTypeAdapter;", "T", "Lyn3;", "<init>", "()V", "app"}, k = XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin, mv = {XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin, 4, 0}, xi = 48)
public final class ParsingTypeAdapter<T> implements yn3 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object a(bo3 bo3Var, Type type) {
        bo3Var.getClass();
        bq3 bq3VarC = bo3Var.c();
        bq3 bq3Var = new bq3();
        va4 it = bq3VarC.X.entrySet().iterator();
        while (it.hasNext()) {
            String str = (String) it.a().getKey();
            bo3 bo3VarJ = bq3VarC.j(str);
            str.getClass();
            Locale locale = Locale.getDefault();
            locale.getClass();
            String lowerCase = str.toLowerCase(locale);
            lowerCase.getClass();
            bq3Var.e(lowerCase, bo3VarJ);
        }
        return yw2.b.a(bq3Var, type);
    }
}
