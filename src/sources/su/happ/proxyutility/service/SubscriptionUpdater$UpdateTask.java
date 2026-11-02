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
import defpackage.bv7;
import defpackage.cv7;
import defpackage.dv7;
import defpackage.ev7;
import defpackage.kw4;
import defpackage.ok4;
import defpackage.pk4;
import defpackage.uq0;
import defpackage.y46;
import defpackage.ym7;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import su.happ.proxyutility.HappApplication;
import su.happ.proxyutility.domain.sub.SubId;
import su.happ.proxyutility.dto.SubscriptionItem;
import su.happ.proxyutility.dto.XRayConfig;
import su.happ.proxyutility.feature.main.MainActivity;
import su.happ.proxyutility.receiver.SubscriptionUpdaterReceiver;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"su/happ/proxyutility/service/SubscriptionUpdater$UpdateTask", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "app"}, k = XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin, mv = {XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin, 4, 0}, xi = 48)
public final class SubscriptionUpdater$UpdateTask extends CoroutineWorker {
    public final y65 g;
    public final r65 h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubscriptionUpdater$UpdateTask(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        this.g = new y65(((ec4) this).a);
        r65 r65Var = new r65(((ec4) this).a, "subscription_update_channel");
        Notification notification = r65Var.v;
        notification.when = 0L;
        String string = ((ec4) this).a.getString(y46.worker_update_ticker);
        string.getClass();
        notification.tickerText = r65.c(string);
        String string2 = ((ec4) this).a.getString(y46.worker_update_title);
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(q51 q51Var) throws Throwable {
        bv7 bv7Var;
        boolean zAreNotificationsEnabled;
        String str;
        qs7 qs7VarA;
        Integer num;
        is7 is7Var;
        int i;
        Object next;
        boolean z;
        long jLongValue;
        int i2;
        long jA;
        SubscriptionItem subscriptionItemF;
        is7 is7Var2;
        is7 is7Var3;
        Iterator ka2Var;
        boolean z2;
        int i3;
        String strD;
        qs7 qs7Var;
        boolean z3;
        is7 is7Var4;
        if (q51Var instanceof bv7) {
            bv7Var = (bv7) q51Var;
            int i4 = bv7Var.n0;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                bv7Var.n0 = i4 - Integer.MIN_VALUE;
            } else {
                bv7Var = new bv7(this, (s51) q51Var);
            }
        } else {
            bv7Var = new bv7(this, (s51) q51Var);
        }
        Object objH = bv7Var.l0;
        int i5 = bv7Var.n0;
        WorkerParameters workerParameters = ((ec4) this).b;
        Object obj = c71.X;
        if (i5 == 0) {
            w39.n0(objH);
            zAreNotificationsEnabled = this.g.b.areNotificationsEnabled();
            if (!zAreNotificationsEnabled) {
                HappApplication happApplication = HappApplication.M0;
                k32.i().d().h(new zx6((byte) 15));
                return dc4.b();
            }
            String strA = workerParameters.b.a("subIdData");
            str = strA != null ? strA : null;
            qs7VarA = str != null ? ((zt7) ev7.c.getValue()).a(str) : null;
            num = (qs7VarA == null || (is7Var = qs7VarA.a) == null) ? null : new Integer(is7Var.d);
            bv7Var.g0 = str;
            bv7Var.h0 = qs7VarA;
            bv7Var.i0 = num;
            bv7Var.f0 = zAreNotificationsEnabled;
            bv7Var.n0 = 1;
            objH = h(bv7Var);
            if (objH != obj) {
            }
            return obj;
        }
        if (i5 == 1) {
            zAreNotificationsEnabled = bv7Var.f0;
            num = bv7Var.i0;
            qs7VarA = bv7Var.h0;
            str = bv7Var.g0;
            w39.n0(objH);
        } else if (i5 == 2) {
            i3 = bv7Var.k0;
            z2 = bv7Var.f0;
            ka2Var = bv7Var.j0;
            try {
                w39.n0(objH);
                while (ka2Var.hasNext()) {
                    yf8 yf8Var = (yf8) ka2Var.next();
                    strD = ((SubId) yf8Var.X).d();
                    qs7Var = (qs7) yf8Var.Z;
                    if (qs7Var == null && (is7Var4 = qs7Var.a) != null && is7Var4.e) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    bv7Var.g0 = null;
                    bv7Var.h0 = null;
                    bv7Var.i0 = null;
                    bv7Var.j0 = ka2Var;
                    bv7Var.f0 = z2;
                    bv7Var.k0 = i3;
                    bv7Var.n0 = 2;
                    if (i(bv7Var, strD, z3) == obj) {
                        return obj;
                    }
                }
            } catch (Throwable th) {
                th = th;
                i = i3;
                if (i != 0) {
                    th.printStackTrace();
                }
                if (!(th instanceof InterruptedException)) {
                }
                throw th;
            }
        } else {
            if (i5 != 3) {
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = bv7Var.k0;
            try {
                w39.n0(objH);
            } catch (Throwable th2) {
                th = th2;
                if (i != 0) {
                    th.printStackTrace();
                }
                if (!(th instanceof InterruptedException)) {
                }
                throw th;
            }
        }
        HappApplication happApplication2 = HappApplication.M0;
        qe4.L0(k32.i(), "su.happ.proxyutility.action.activity", 129, "");
        kw4 kw4Var = kw4.a;
        try {
            kw4.m().w();
        } catch (Throwable th3) {
            if ((th3 instanceof InterruptedException) || (th3 instanceof CancellationException)) {
                throw th3;
            }
        }
        HappApplication happApplication3 = HappApplication.M0;
        k32.i().d().h(new t16(this, (byte) 29));
        return dc4.b();
        if (((Boolean) objH).booleanValue() && (num == null || num.intValue() != 0)) {
            HappApplication happApplication4 = HappApplication.M0;
            k32.i().d().h(new zx6((byte) 16));
            return dc4.b();
        }
        try {
            g();
        } catch (Throwable th4) {
            if ((th4 instanceof InterruptedException) || (th4 instanceof CancellationException)) {
                throw th4;
            }
        }
        try {
            kw4 kw4Var2 = kw4.a;
            List listD = kw4.d();
            byte b = 17;
            if (str == null) {
                ka2Var = new ka2(new la2(w27.l0(new hu(listD, (byte) 1), new zx6((byte) 17)), true, new zx6((byte) 18)));
                z2 = zAreNotificationsEnabled;
                i3 = 0;
                while (ka2Var.hasNext()) {
                    yf8 yf8Var2 = (yf8) ka2Var.next();
                    strD = ((SubId) yf8Var2.X).d();
                    qs7Var = (qs7) yf8Var2.Z;
                    if (qs7Var == null) {
                        z3 = false;
                    } else {
                        z3 = false;
                    }
                    bv7Var.g0 = null;
                    bv7Var.h0 = null;
                    bv7Var.i0 = null;
                    bv7Var.j0 = ka2Var;
                    bv7Var.f0 = z2;
                    bv7Var.k0 = i3;
                    bv7Var.n0 = 2;
                    if (i(bv7Var, strD, z3) == obj) {
                        return obj;
                    }
                }
                HappApplication happApplication5 = HappApplication.M0;
                qe4.L0(k32.i(), "su.happ.proxyutility.action.activity", 129, "");
                kw4 kw4Var3 = kw4.a;
                kw4.m().w();
                HappApplication happApplication6 = HappApplication.M0;
                k32.i().d().h(new t16(this, (byte) 29));
                return dc4.b();
            }
            Iterator it = listD.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!dh3.f(((SubId) ((qg5) next).X).d(), str));
            qg5 qg5Var = (qg5) next;
            SubscriptionItem subscriptionItem = qg5Var != null ? (SubscriptionItem) qg5Var.Y : null;
            if (subscriptionItem == null) {
                HappApplication happApplication7 = HappApplication.M0;
                k32.i().d().h(new nm7(str, (byte) 1));
            } else {
                boolean z4 = (qs7VarA == null || (is7Var3 = qs7VarA.a) == null || !is7Var3.e) ? false : true;
                Long lastCheckUpdate = subscriptionItem.getLastCheckUpdate();
                if (lastCheckUpdate != null) {
                    z = z4;
                    if (lastCheckUpdate.longValue() > new Long(subscriptionItem.getLastUpdated()).longValue() * 1000) {
                    }
                    if (lastCheckUpdate != null) {
                        jLongValue = lastCheckUpdate.longValue();
                    } else {
                        jLongValue = new Long(subscriptionItem.getLastUpdated()).longValue() * 1000;
                    }
                    if (qs7VarA != null || (is7Var2 = qs7VarA.a) == null) {
                        i2 = 1;
                    } else {
                        i2 = is7Var2.c;
                    }
                    jA = we3.a.a().a();
                    if ((new Integer(i2).longValue() * 3600000) + jLongValue >= jA && (num == null || num.intValue() != 0)) {
                        HappApplication happApplication8 = HappApplication.M0;
                        k32.i().d().h(new uq0(subscriptionItem, b));
                    } else {
                        kw4 kw4Var4 = kw4.a;
                        subscriptionItemF = kw4.f(str);
                        if (subscriptionItemF == null) {
                            kw4.u(SubscriptionItem.d(subscriptionItemF, 0L, false, null, false, new Long(jA), 201326591), str);
                        }
                        bv7Var.g0 = null;
                        bv7Var.h0 = null;
                        bv7Var.i0 = null;
                        bv7Var.f0 = zAreNotificationsEnabled;
                        bv7Var.k0 = 0;
                        bv7Var.n0 = 3;
                    }
                } else {
                    z = z4;
                }
                lastCheckUpdate = null;
                if (lastCheckUpdate != null) {
                    jLongValue = lastCheckUpdate.longValue();
                } else {
                    jLongValue = new Long(subscriptionItem.getLastUpdated()).longValue() * 1000;
                }
                if (qs7VarA != null) {
                    i2 = 1;
                } else {
                    i2 = 1;
                }
                jA = we3.a.a().a();
                if ((new Integer(i2).longValue() * 3600000) + jLongValue >= jA) {
                    HappApplication happApplication9 = HappApplication.M0;
                    k32.i().d().h(new uq0(subscriptionItem, b));
                }
                kw4 kw4Var5 = kw4.a;
                subscriptionItemF = kw4.f(str);
                if (subscriptionItemF == null) {
                    kw4.u(SubscriptionItem.d(subscriptionItemF, 0L, false, null, false, new Long(jA), 201326591), str);
                }
                bv7Var.g0 = null;
                bv7Var.h0 = null;
                bv7Var.i0 = null;
                bv7Var.f0 = zAreNotificationsEnabled;
                bv7Var.k0 = 0;
                bv7Var.n0 = 3;
            }
            HappApplication happApplication10 = HappApplication.M0;
            qe4.L0(k32.i(), "su.happ.proxyutility.action.activity", 129, "");
            kw4 kw4Var6 = kw4.a;
            kw4.m().w();
            HappApplication happApplication11 = HappApplication.M0;
            k32.i().d().h(new t16(this, (byte) 29));
            return dc4.b();
        } catch (Throwable th5) {
            th = th5;
            i = 0;
            if (i != 0 && !fm7.d0(gv3.W(th), "util.protection", false)) {
                th.printStackTrace();
            }
            if (!(th instanceof InterruptedException) || (th instanceof CancellationException)) {
                throw th;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final kj2 f() {
        Context context = ((ec4) this).a;
        context.getClass();
        x39 x39VarV0 = x39.v0(context);
        x39VarV0.getClass();
        UUID uuid = ((ec4) this).b.a;
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void g() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            this.h.t = "subscription_update_channel";
            String string = ((ec4) this).a.getString(y46.worker_update_notification_channel);
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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
            long jM0 = vj8.m0(5500L, lx1.Z);
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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
        Context context = ((ec4) this).a;
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
                Object objB = pr7.b(pr7Var, str, false, (String) null, (q30) null, (ok4) null, (zs1) null, (pk4) null, (Boolean) null, dv7Var2, 382);
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
