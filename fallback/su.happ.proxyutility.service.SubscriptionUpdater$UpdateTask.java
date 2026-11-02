package su.happ.proxyutility.service;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import androidx.work.impl.foreground.SystemForegroundService;
import defpackage.a28;
import defpackage.be;
import defpackage.bt;
import defpackage.c4;
import defpackage.c71;
import defpackage.cv7;
import defpackage.dh3;
import defpackage.dn8;
import defpackage.dv7;
import defpackage.ev7;
import defpackage.gx1;
import defpackage.i08;
import defpackage.k32;
import defpackage.kj2;
import defpackage.kw4;
import defpackage.lx1;
import defpackage.pr7;
import defpackage.q36;
import defpackage.q51;
import defpackage.r65;
import defpackage.s51;
import defpackage.u70;
import defpackage.ue3;
import defpackage.uq0;
import defpackage.vj8;
import defpackage.w39;
import defpackage.w79;
import defpackage.x39;
import defpackage.y46;
import defpackage.y65;
import defpackage.ym7;
import java.util.Arrays;
import java.util.UUID;
import kotlin.Metadata;
import su.happ.proxyutility.HappApplication;
import su.happ.proxyutility.dto.SubscriptionItem;
import su.happ.proxyutility.feature.main.MainActivity;
import su.happ.proxyutility.receiver.SubscriptionUpdaterReceiver;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"su/happ/proxyutility/service/SubscriptionUpdater$UpdateTask", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "app"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class SubscriptionUpdater$UpdateTask extends CoroutineWorker {
    public final y65 g;
    public final r65 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubscriptionUpdater$UpdateTask(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        this.g = new y65(this.a);
        r65 r65Var = new r65(this.a, "subscription_update_channel");
        Notification notification = r65Var.v;
        notification.when = 0L;
        String string = this.a.getString(y46.worker_update_ticker);
        string.getClass();
        notification.tickerText = r65.c(string);
        String string2 = this.a.getString(y46.worker_update_title);
        string2.getClass();
        r65Var.e = r65.c(string2);
        notification.icon = q36.ic_stat_name;
        r65Var.p = "service";
        r65Var.j = 0;
        Intent intent = new Intent(context, (Class<?>) MainActivity.class);
        intent.setFlags(268468224);
        r65Var.g = PendingIntent.getActivity(context, 0, intent, 67108864);
        this.h = r65Var;
    }

    /* JADX WARN: Code duplicated, block: B:108:0x01ee A[Catch: all -> 0x0178, TryCatch #2 {all -> 0x0178, blocks: (B:60:0x010e, B:62:0x0118, B:80:0x017a, B:81:0x017e, B:83:0x0184, B:87:0x019b, B:89:0x019f, B:92:0x01a7, B:94:0x01bd, B:96:0x01c1, B:100:0x01c8, B:102:0x01d0, B:108:0x01ee, B:111:0x0203, B:113:0x0207, B:115:0x020b, B:123:0x0246, B:127:0x0268, B:126:0x024f, B:122:0x0233, B:120:0x022d, B:109:0x01f3), top: B:155:0x010e }] */
    /* JADX WARN: Code duplicated, block: B:109:0x01f3 A[Catch: all -> 0x0178, TryCatch #2 {all -> 0x0178, blocks: (B:60:0x010e, B:62:0x0118, B:80:0x017a, B:81:0x017e, B:83:0x0184, B:87:0x019b, B:89:0x019f, B:92:0x01a7, B:94:0x01bd, B:96:0x01c1, B:100:0x01c8, B:102:0x01d0, B:108:0x01ee, B:111:0x0203, B:113:0x0207, B:115:0x020b, B:123:0x0246, B:127:0x0268, B:126:0x024f, B:122:0x0233, B:120:0x022d, B:109:0x01f3), top: B:155:0x010e }] */
    /* JADX WARN: Code duplicated, block: B:114:0x020a  */
    /* JADX WARN: Code duplicated, block: B:125:0x024e  */
    /* JADX WARN: Code duplicated, block: B:126:0x024f A[Catch: all -> 0x0178, TryCatch #2 {all -> 0x0178, blocks: (B:60:0x010e, B:62:0x0118, B:80:0x017a, B:81:0x017e, B:83:0x0184, B:87:0x019b, B:89:0x019f, B:92:0x01a7, B:94:0x01bd, B:96:0x01c1, B:100:0x01c8, B:102:0x01d0, B:108:0x01ee, B:111:0x0203, B:113:0x0207, B:115:0x020b, B:123:0x0246, B:127:0x0268, B:126:0x024f, B:122:0x0233, B:120:0x022d, B:109:0x01f3), top: B:155:0x010e }] */
    /* JADX WARN: Code duplicated, block: B:131:0x0280  */
    /* JADX WARN: Code duplicated, block: B:136:0x0293  */
    /* JADX WARN: Code duplicated, block: B:161:0x027d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:163:? A[LOOP:0: B:64:0x013a->B:163:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x0140 A[Catch: all -> 0x004e, TryCatch #4 {all -> 0x004e, blocks: (B:21:0x0049, B:64:0x013a, B:66:0x0140, B:68:0x0154, B:70:0x0158, B:74:0x015f), top: B:158:0x0049 }] */
    /* JADX WARN: Code duplicated, block: B:73:0x015e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x027b, code lost:
    
        if (i(r2, r13, r19) == r10) goto L129;
     */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.q51 r29) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 725
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: su.happ.proxyutility.service.SubscriptionUpdater$UpdateTask.e(q51):java.lang.Object");
    }

    public final kj2 f() {
        Context context = this.a;
        context.getClass();
        x39 x39VarV0 = x39.v0(context);
        x39VarV0.getClass();
        UUID uuid = this.b.a;
        uuid.getClass();
        Context context2 = x39VarV0.i0;
        String string = uuid.toString();
        int i = i08.l0;
        Intent intent = new Intent(context2, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_CANCEL_WORK");
        intent.setData(Uri.parse("workspec://" + string));
        intent.putExtra("KEY_WORKSPEC_ID", string);
        int i2 = Build.VERSION.SDK_INT;
        PendingIntent service = PendingIntent.getService(context2, 0, intent, i2 >= 31 ? 167772160 : 134217728);
        int i3 = q36.ic_close_16dp;
        String string2 = context.getString(y46.close);
        string2.getClass();
        r65 r65Var = this.h;
        r65Var.a(i3, service, string2);
        r65Var.d(2, true);
        return i2 >= 34 ? new kj2(3333, r65Var.b(), 1073741824) : new kj2(3333, r65Var.b(), 0);
    }

    public final void g() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            this.h.t = "subscription_update_channel";
            String string = this.a.getString(y46.worker_update_notification_channel);
            string.getClass();
            NotificationChannel notificationChannel = new NotificationChannel("subscription_update_channel", string, 1);
            y65 y65Var = this.g;
            if (i >= 26) {
                ue3.n(y65Var.b, notificationChannel);
            } else {
                y65Var.getClass();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object h(s51 s51Var) {
        cv7 cv7Var;
        if (s51Var instanceof cv7) {
            cv7Var = (cv7) s51Var;
            int i = cv7Var.h0;
            if ((i & Integer.MIN_VALUE) != 0) {
                cv7Var.h0 = i - Integer.MIN_VALUE;
            } else {
                cv7Var = new cv7(this, s51Var);
            }
        } else {
            cv7Var = new cv7(this, s51Var);
        }
        Object objX = cv7Var.f0;
        int i2 = cv7Var.h0;
        q51 q51Var = null;
        if (i2 == 0) {
            w39.n0(objX);
            be beVar = gx1.Y;
            long jM0 = vj8.m0(5500L, lx1.MILLISECONDS);
            ym7 ym7Var = new ym7(this, q51Var, (byte) 2);
            cv7Var.h0 = 1;
            objX = a28.x(u70.s0(jM0), ym7Var, cv7Var);
            c71 c71Var = c71.X;
            if (objX == c71Var) {
                return c71Var;
            }
        } else {
            if (i2 != 1) {
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            w39.n0(objX);
        }
        Boolean bool = (Boolean) objX;
        return Boolean.valueOf(bool != null ? bool.booleanValue() : false);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    public final Object i(s51 s51Var, String str, boolean z) {
        dv7 dv7Var;
        r65 r65Var;
        String str2;
        boolean z2;
        SubscriptionItem subscriptionItem;
        if (s51Var instanceof dv7) {
            dv7Var = (dv7) s51Var;
            int i = dv7Var.k0;
            if ((i & Integer.MIN_VALUE) != 0) {
                dv7Var.k0 = i - Integer.MIN_VALUE;
            } else {
                dv7Var = new dv7(this, s51Var);
            }
        } else {
            dv7Var = new dv7(this, s51Var);
        }
        dv7 dv7Var2 = dv7Var;
        Object obj = dv7Var2.i0;
        int i2 = dv7Var2.k0;
        y65 y65Var = this.g;
        Context context = this.a;
        dn8 dn8Var = dn8.a;
        r65 r65Var2 = this.h;
        if (i2 == 0) {
            w39.n0(obj);
            kw4 kw4Var = kw4.a;
            SubscriptionItem subscriptionItemF = kw4.f(str);
            if (subscriptionItemF != null && !dh3.f(subscriptionItemF.getImport(), Boolean.FALSE)) {
                if (z) {
                    g();
                    Intent action = new Intent(context, (Class<?>) SubscriptionUpdaterReceiver.class).setAction("su.happ.proxyutility.receiver.SubscriptionUpdater.CANCEL_NOTIFICATION");
                    action.getClass();
                    PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, c4.y(action, "subIdData", str), 201326592);
                    r65Var2.b.clear();
                    int i3 = q36.ic_close_16dp;
                    String string = context.getString(y46.close);
                    string.getClass();
                    r65Var2.a(i3, broadcast, string);
                    String string2 = context.getString(y46.worker_update_description, Arrays.copyOf(new Object[]{subscriptionItemF.getRemarks()}, 1));
                    string2.getClass();
                    r65Var2.f = r65.c(string2);
                    if (w79.i(context, "android.permission.POST_NOTIFICATIONS") == 0) {
                        y65Var.a(str.hashCode() + 3333, r65Var2.b());
                    }
                }
                HappApplication happApplication = HappApplication.M0;
                k32.i().d().h(new uq0(subscriptionItemF, (byte) 18));
                pr7 pr7Var = (pr7) ev7.a.getValue();
                dv7Var2.f0 = str;
                dv7Var2.g0 = subscriptionItemF;
                dv7Var2.h0 = z;
                dv7Var2.k0 = 1;
                r65Var = r65Var2;
                Object objB = pr7.b(pr7Var, str, false, null, null, null, null, null, null, dv7Var2, 382);
                c71 c71Var = c71.X;
                if (objB == c71Var) {
                    return c71Var;
                }
                str2 = str;
                z2 = z;
                subscriptionItem = subscriptionItemF;
            }
            return dn8Var;
        }
        if (i2 != 1) {
            bt.i("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        z2 = dv7Var2.h0;
        subscriptionItem = dv7Var2.g0;
        str2 = dv7Var2.f0;
        w39.n0(obj);
        r65Var = r65Var2;
        if (z2) {
            r65Var.b.clear();
            String string3 = context.getString(y46.worker_updated_description, Arrays.copyOf(new Object[]{subscriptionItem.getRemarks()}, 1));
            string3.getClass();
            r65Var.f = r65.c(string3);
            y65Var.a(str2.hashCode() + 3333, r65Var.b());
        }
        return dn8Var;
    }
}
