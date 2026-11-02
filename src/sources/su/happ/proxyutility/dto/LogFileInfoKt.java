package su.happ.proxyutility.dto;

import defpackage.kw4;
import defpackage.lf4;
import defpackage.ss8;
import defpackage.x79;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"app"}, k = XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin, mv = {XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin, 4, 0}, xi = 48)
public final class LogFileInfoKt {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final lf4 a(LogFileInfo logFileInfo) {
        logFileInfo.getClass();
        try {
            File file = new File(logFileInfo.getPath());
            String path = logFileInfo.getPath();
            String strG = x79.g(file.length());
            String name = logFileInfo.getName();
            ss8 ss8Var = ss8.a;
            String str = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss", ss8.n()).format(Long.valueOf(file.lastModified()));
            str.getClass();
            kw4 kw4Var = kw4.a;
            SubscriptionItem subscriptionItemF = kw4.f(logFileInfo.getSubId());
            return new lf4(name, path, str, strG, subscriptionItemF != null && subscriptionItemF.getEncryptedUrl());
        } catch (Throwable th) {
            if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                throw th;
            }
            return null;
        }
    }
}
