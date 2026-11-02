package su.happ.proxyutility.log_report;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import defpackage.hh4;
import defpackage.mf4;
import defpackage.pf4;
import defpackage.ss8;
import defpackage.y46;
import java.io.File;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import su.happ.proxyutility.dto.XRayConfig;
import su.happ.proxyutility.feature.main.MainActivity;
import su.happ.proxyutility.log_report.LogWorker;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lsu/happ/proxyutility/log_report/LogWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "app"}, k = XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin, mv = {XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin, 4, 0}, xi = 48)
public final class LogWorker extends CoroutineWorker {
    public final vz7 g;
    public final vz7 h;
    public final r65 i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LogWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        final byte b = 0;
        this.g = new vz7(new dn2(this) { // from class: gh4
            public final /* synthetic */ LogWorker Y;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.Y = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public final Object invoke() {
                byte b2 = b;
                LogWorker logWorker = this.Y;
                switch (b2) {
                    case 0:
                        return new y65(((ec4) logWorker).a);
                    default:
                        Context context2 = ((ec4) logWorker).a;
                        context2.getClass();
                        return new pf4(context2);
                }
            }
        });
        final byte b2 = 1;
        this.h = new vz7(new dn2(this) { // from class: gh4
            public final /* synthetic */ LogWorker Y;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.Y = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public final Object invoke() {
                byte b3 = b2;
                LogWorker logWorker = this.Y;
                switch (b3) {
                    case 0:
                        return new y65(((ec4) logWorker).a);
                    default:
                        Context context2 = ((ec4) logWorker).a;
                        context2.getClass();
                        return new pf4(context2);
                }
            }
        });
        r65 r65Var = new r65(((ec4) this).a, "log_report_channel");
        Notification notification = r65Var.v;
        notification.when = 0L;
        notification.icon = q36.ic_stat_name;
        r65Var.p = "service";
        r65Var.j = 0;
        Intent intent = new Intent(context, (Class<?>) MainActivity.class);
        intent.setFlags(268468224);
        r65Var.g = PendingIntent.getActivity(context, 0, intent, 67108864);
        this.i = r65Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(q51 q51Var) throws Throwable {
        hh4 hh4Var;
        String str;
        Throwable th;
        sj6 rj6Var;
        String string;
        if (q51Var instanceof hh4) {
            hh4Var = (hh4) q51Var;
            int i = hh4Var.i0;
            if ((i & Integer.MIN_VALUE) != 0) {
                hh4Var.i0 = i - Integer.MIN_VALUE;
            } else {
                hh4Var = new hh4(this, (s51) q51Var);
            }
        } else {
            hh4Var = new hh4(this, (s51) q51Var);
        }
        Object obj = hh4Var.g0;
        int i2 = hh4Var.i0;
        Context context = ((ec4) this).a;
        if (i2 == 0) {
            w39.n0(obj);
            String str2 = "happ_report_" + System.currentTimeMillis() + ".zip";
            try {
                int i3 = Build.VERSION.SDK_INT;
                if (i3 >= 26) {
                    this.i.t = "log_report_channel";
                    y65 y65Var = (y65) this.g.getValue();
                    dn.e();
                    String string2 = context.getString(y46.worker_update_notification_channel);
                    string2.getClass();
                    NotificationChannel notificationChannelA = dn.a(string2);
                    if (i3 >= 26) {
                        ue3.n(y65Var.b, notificationChannelA);
                    } else {
                        y65Var.getClass();
                    }
                }
                ss8 ss8Var = ss8.a;
                if (!ss8.x()) {
                    throw new mf4();
                }
                String string3 = context.getString(y46.report_forming);
                string3.getClass();
                f(string3);
                be beVar = gx1.Y;
                long jL0 = vj8.l0(2, lx1.g0);
                y9 y9Var = new y9(this, str2, (q51) null, (byte) 7);
                hh4Var.f0 = str2;
                hh4Var.i0 = 1;
                long jS0 = u70.s0(jL0);
                if (jS0 <= 0) {
                    throw new ua8("Timed out immediately", (va8) null);
                }
                Object objT = a28.t(new va8(jS0, hh4Var), y9Var);
                c71 c71Var = c71.X;
                if (objT == c71Var) {
                    return c71Var;
                }
                str = str2;
                obj = objT;
            } catch (Throwable th2) {
                str = str2;
                th = th2;
                if (!(th instanceof InterruptedException) || (th instanceof CancellationException)) {
                    throw th;
                }
                rj6Var = new rj6(th);
            }
        } else {
            if (i2 != 1) {
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = hh4Var.f0;
            try {
                w39.n0(obj);
            } catch (Throwable th3) {
                th = th3;
                if (th instanceof InterruptedException) {
                }
                throw th;
            }
        }
        rj6Var = (sj6) obj;
        Object obj2 = rj6Var.X;
        if (!(rj6Var instanceof rj6)) {
            context.getClass();
            qe4.L0(context, "su.happ.proxyutility.action.activity", 1, "");
            String string4 = context.getString(y46.report_sending_success);
            string4.getClass();
            f(string4);
        }
        Throwable thA = sj6.a(rj6Var);
        if (thA != null) {
            context.getClass();
            qe4.L0(context, "su.happ.proxyutility.action.activity", 2, "");
            if (thA instanceof mf4) {
                string = context.getString(y46.connection_error);
                string.getClass();
            } else {
                string = context.getString(y46.report_sending_failure);
                string.getClass();
            }
            f(string);
        }
        cc4 cc4VarB = sj6.a(rj6Var) == null ? dc4.b() : new ac4();
        pf4 pf4Var = (pf4) this.h.getValue();
        pf4Var.getClass();
        str.getClass();
        ss8 ss8Var2 = ss8.a;
        new File(ss8.L(pf4Var.a), str).delete();
        return cc4VarB;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void f(String str) {
        y65 y65Var = (y65) this.g.getValue();
        r65 r65Var = this.i;
        r65Var.getClass();
        r65Var.e = r65.c(str);
        y65Var.a(5555, r65Var.b());
    }
}
