package defpackage;

import android.app.job.JobInfo;
import android.content.ComponentName;
import android.content.Context;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.impl.background.systemjob.SystemJobService;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class o08 {
    public final ComponentName a;

    static {
        lh4.a1("SystemJobInfoConverter");
    }

    public o08(Context context, f08 f08Var) {
        this.a = new ComponentName(context.getApplicationContext(), (Class<?>) SystemJobService.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final JobInfo a(l49 l49Var, int i) {
        int i2;
        String str;
        p31 p31Var = l49Var.j;
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", l49Var.a);
        persistableBundle.putInt("EXTRA_WORK_SPEC_GENERATION", l49Var.t);
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", l49Var.c());
        JobInfo.Builder requiresCharging = new JobInfo.Builder(i, this.a).setRequiresCharging(p31Var.c);
        boolean z = p31Var.d;
        JobInfo.Builder extras = requiresCharging.setRequiresDeviceIdle(z).setExtras(persistableBundle);
        NetworkRequest networkRequestA = p31Var.a();
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 28 || networkRequestA == null) {
            b45 b45Var = p31Var.a;
            if (i3 < 30 || b45Var != b45.h0) {
                int iOrdinal = b45Var.ordinal();
                if (iOrdinal == 0) {
                    i2 = 0;
                } else if (iOrdinal != 1) {
                    i2 = 2;
                    if (iOrdinal != 2) {
                        i2 = 3;
                        if (iOrdinal != 3) {
                            i2 = 4;
                            if (iOrdinal != 4 || i3 < 26) {
                                lh4 lh4VarP0 = lh4.P0();
                                b45Var.toString();
                                lh4VarP0.getClass();
                                i2 = 1;
                            }
                        }
                    }
                } else {
                    i2 = 1;
                }
                extras.setRequiredNetworkType(i2);
            } else {
                extras.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
            }
        } else {
            extras.getClass();
            extras.setRequiredNetwork(networkRequestA);
        }
        if (!z) {
            extras.setBackoffCriteria(l49Var.m, l49Var.l == z00.Y ? 0 : 1);
        }
        long jMax = Math.max(l49Var.a() - System.currentTimeMillis(), 0L);
        if (i3 <= 28 || jMax > 0) {
            extras.setMinimumLatency(jMax);
        } else if (!l49Var.q) {
            extras.setImportantWhileForeground(true);
        }
        if (p31Var.b()) {
            for (o31 o31Var : p31Var.i) {
                extras.addTriggerContentUri(new JobInfo.TriggerContentUri(o31Var.a, o31Var.b ? 1 : 0));
            }
            extras.setTriggerContentUpdateDelay(p31Var.g);
            extras.setTriggerContentMaxDelay(p31Var.h);
        }
        extras.setPersisted(false);
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 26) {
            extras.setRequiresBatteryNotLow(p31Var.e);
            extras.setRequiresStorageNotLow(p31Var.f);
        }
        Object[] objArr = l49Var.k > 0;
        boolean z2 = jMax > 0;
        if (i4 >= 31 && l49Var.q && objArr == false && !z2) {
            extras.setExpedited(true);
        }
        if (i4 >= 35 && (str = l49Var.x) != null) {
            extras.setTraceTag(str);
        }
        return extras.build();
    }
}
