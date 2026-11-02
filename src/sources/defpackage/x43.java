package defpackage;

import android.content.res.AssetFileDescriptor;
import androidx.work.impl.WorkDatabase;
import io.sentry.q0;
import java.net.InetAddress;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class x43 implements Callable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ x43(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        byte b = this.a;
        int i = 0;
        Object obj = this.b;
        switch (b) {
            case 0:
                WorkDatabase workDatabase = (WorkDatabase) ((vk1) obj).Y;
                Long lA = workDatabase.s().a("next_job_scheduler_id");
                int iLongValue = lA != null ? (int) lA.longValue() : 0;
                workDatabase.s().b(new fs5("next_job_scheduler_id", Long.valueOf(iLongValue == Integer.MAX_VALUE ? 0 : iLongValue + 1)));
                if (iLongValue < 0 || iLongValue > Integer.MAX_VALUE) {
                    workDatabase.s().b(new fs5("next_job_scheduler_id", 1L));
                } else {
                    i = iLongValue;
                }
                return Integer.valueOf(i);
            case 1:
                return (AssetFileDescriptor) obj;
            case 2:
                q0 q0Var = (q0) obj;
                try {
                    q0Var.e.getClass();
                    q0Var.b = InetAddress.getLocalHost().getCanonicalHostName();
                    q0Var.c = System.currentTimeMillis() + ((long) q0Var.a);
                    return null;
                } finally {
                    q0Var.d.set(false);
                }
            case 3:
                return (Integer) ((AtomicReference) obj).get();
            default:
                return (Integer) obj;
        }
    }
}
