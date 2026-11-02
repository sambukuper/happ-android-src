package defpackage;

import android.app.job.JobParameters;
import android.app.job.JobServiceEngine;
import android.os.IBinder;
import androidx.core.app.JobIntentService;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class fm3 extends JobServiceEngine {
    public final JobIntentService a;
    public final Object b;

    public fm3(JobIntentService jobIntentService) {
        super(jobIntentService);
        this.b = new Object();
        this.a = jobIntentService;
    }

    public final IBinder a() {
        return getBinder();
    }

    public final boolean onStartJob(JobParameters jobParameters) {
        return true;
    }

    public final boolean onStopJob(JobParameters jobParameters) {
        throw null;
    }
}
