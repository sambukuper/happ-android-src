package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import defpackage.fc4;
import defpackage.hu5;
import defpackage.jl1;
import defpackage.lr;
import defpackage.qz;
import defpackage.sc;
import defpackage.we8;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class JobInfoSchedulerService extends JobService {
    public static final /* synthetic */ int X = 0;

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i = jobParameters.getExtras().getInt("priority");
        int i2 = jobParameters.getExtras().getInt("attemptNumber");
        we8.b(getApplicationContext());
        lr lrVarA = qz.a();
        lrVarA.z(string);
        lrVarA.f0 = hu5.b(i);
        if (string2 != null) {
            lrVarA.Z = Base64.decode(string2, 0);
        }
        jl1 jl1Var = we8.a().d;
        ((Executor) jl1Var.g0).execute(new fc4(jl1Var, lrVarA.e(), i2, new sc(this, jobParameters, (byte) 28)));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
