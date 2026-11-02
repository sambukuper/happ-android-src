package su.happ.proxyutility.service;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import defpackage.kw4;
import defpackage.wk0;
import defpackage.y46;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import su.happ.proxyutility.domain.sub.SubId;
import su.happ.proxyutility.dto.SubscriptionItem;
import su.happ.proxyutility.dto.XRayConfig;
import su.happ.proxyutility.feature.main.MainActivity;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"su/happ/proxyutility/service/SubscriptionUpdater$ExpireReminderTask", "Landroidx/work/Worker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "app"}, k = XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin, mv = {XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin, 4, 0}, xi = 48)
public final class SubscriptionUpdater$ExpireReminderTask extends Worker {
    public final y65 e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubscriptionUpdater$ExpireReminderTask(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        this.e = new y65(((ec4) this).a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final cc4 e() {
        z51.R(b02.X, new wk0(2, null, (byte) 4));
        Context context = ((ec4) this).a;
        if (w79.i(context, "android.permission.POST_NOTIFICATIONS") == 0) {
            kw4 kw4Var = kw4.a;
            ka2 ka2Var = new ka2(new la2(new hu(kw4.d(), (byte) 1), true, new zx6((byte) 14)));
            while (ka2Var.hasNext()) {
                qg5 qg5Var = (qg5) ka2Var.next();
                String strD = ((SubId) qg5Var.X).d();
                String remarks = ((SubscriptionItem) qg5Var.Y).getRemarks();
                r65 r65Var = new r65(context, "subscription_expire_channel");
                Notification notification = r65Var.v;
                notification.when = 0L;
                notification.tickerText = r65.c(context.getString(y46.worker_expire_ticker));
                r65Var.e = r65.c(context.getString(y46.worker_expire_title, remarks));
                notification.icon = q36.ic_stat_name;
                r65Var.p = "service";
                r65Var.j = 0;
                r65Var.g = PendingIntent.getActivity(context, 0, new Intent(context, (Class<?>) MainActivity.class), 67108864);
                try {
                    int i = Build.VERSION.SDK_INT;
                    y65 y65Var = this.e;
                    if (i >= 26) {
                        r65Var.t = "subscription_expire_channel";
                        dn.e();
                        String string = context.getString(y46.worker_expire_notification_channel);
                        string.getClass();
                        NotificationChannel notificationChannelC = dn.c(string);
                        if (i >= 26) {
                            ue3.n(y65Var.b, notificationChannelC);
                        } else {
                            y65Var.getClass();
                        }
                    }
                    y65Var.a(strD.hashCode() + 4444, r65Var.b());
                } catch (Throwable th) {
                    if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                        throw th;
                    }
                }
            }
        }
        return dc4.b();
    }
}
