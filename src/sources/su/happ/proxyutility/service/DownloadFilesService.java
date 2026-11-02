package su.happ.proxyutility.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import java.lang.ref.SoftReference;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import su.happ.proxyutility.dto.DownloadFilesData;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lsu/happ/proxyutility/service/DownloadFilesService;", "Landroid/app/Service;", "<init>", "()V", "app"}, k = XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin, mv = {XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin, 4, 0}, xi = 48)
public final class DownloadFilesService extends Service {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        d dVar = d.a;
        d.e = new SoftReference(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Service
    public final void onDestroy() {
        DownloadFilesService downloadFilesService;
        super.onDestroy();
        d dVar = d.a;
        SoftReference softReference = d.e;
        if (softReference == null || (downloadFilesService = (DownloadFilesService) softReference.get()) == null) {
            return;
        }
        try {
            downloadFilesService.unregisterReceiver(d.f);
        } catch (Throwable th) {
            if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                throw th;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        if (intent == null) {
            return 1;
        }
        try {
            String stringExtra = intent.getStringExtra("argDownloadFilesData");
            if (stringExtra == null) {
                return 1;
            }
            com.google.gson.a aVar = yw2.b;
            aVar.getClass();
            DownloadFilesData downloadFilesData = (DownloadFilesData) aVar.c(stringExtra, new yi8(DownloadFilesData.class));
            d dVar = d.a;
            downloadFilesData.getClass();
            d.c(downloadFilesData);
            return 1;
        } catch (Throwable th) {
            if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                throw th;
            }
            return 1;
        }
    }
}
