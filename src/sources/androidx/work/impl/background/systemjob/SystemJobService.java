package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Build;
import android.os.Looper;
import android.os.PersistableBundle;
import defpackage.bh7;
import defpackage.bt;
import defpackage.en;
import defpackage.fj4;
import defpackage.fv5;
import defpackage.lh4;
import defpackage.p52;
import defpackage.pc6;
import defpackage.s39;
import defpackage.tc;
import defpackage.x39;
import defpackage.xd6;
import defpackage.zv7;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class SystemJobService extends JobService implements p52 {
    public static final /* synthetic */ int g0 = 0;
    public x39 X;
    public final HashMap Y = new HashMap();
    public final fj4 Z = new fj4((byte) 2);
    public xd6 f0;

    static {
        lh4.a1("SystemJobService");
    }

    public static void a(String str) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return;
        }
        bt.i(pc6.p("Cannot invoke ", str, " on a background thread"));
    }

    public static s39 c(JobParameters jobParameters) {
        try {
            PersistableBundle extras = jobParameters.getExtras();
            if (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new s39(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION"));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // defpackage.p52
    public final void b(s39 s39Var, boolean z) {
        a("onExecuted");
        JobParameters jobParameters = (JobParameters) this.Y.remove(s39Var);
        this.Z.a(s39Var);
        if (jobParameters != null) {
            lh4.P0().getClass();
            jobFinished(jobParameters, z);
        }
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        try {
            x39 x39VarV0 = x39.v0(getApplicationContext());
            this.X = x39VarV0;
            fv5 fv5Var = x39VarV0.n0;
            this.f0 = new xd6(fv5Var, x39VarV0.l0);
            fv5Var.a(this);
        } catch (IllegalStateException e) {
            if (!Application.class.equals(getApplication().getClass())) {
                throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e);
            }
            lh4.P0().getClass();
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        x39 x39Var = this.X;
        if (x39Var != null) {
            fv5 fv5Var = x39Var.n0;
            synchronized (fv5Var.k) {
                fv5Var.j.remove(this);
            }
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        a("onStartJob");
        if (this.X == null) {
            lh4.P0().getClass();
            jobFinished(jobParameters, true);
            return false;
        }
        s39 s39VarC = c(jobParameters);
        if (s39VarC == null) {
            lh4.P0().getClass();
            return false;
        }
        HashMap map = this.Y;
        if (map.containsKey(s39VarC)) {
            lh4 lh4VarP0 = lh4.P0();
            s39VarC.toString();
            lh4VarP0.getClass();
            return false;
        }
        lh4 lh4VarP1 = lh4.P0();
        s39VarC.toString();
        lh4VarP1.getClass();
        map.put(s39VarC, jobParameters);
        zv7 zv7Var = new zv7((byte) 12);
        if (jobParameters.getTriggeredContentUris() != null) {
            zv7Var.Y = Arrays.asList(jobParameters.getTriggeredContentUris());
        }
        if (jobParameters.getTriggeredContentAuthorities() != null) {
            zv7Var.X = Arrays.asList(jobParameters.getTriggeredContentAuthorities());
        }
        if (Build.VERSION.SDK_INT >= 28) {
            zv7Var.Z = en.u(jobParameters);
        }
        this.f0.I(this.Z.c(s39VarC), zv7Var);
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        boolean zContains;
        a("onStopJob");
        if (this.X == null) {
            lh4.P0().getClass();
            return true;
        }
        s39 s39VarC = c(jobParameters);
        if (s39VarC == null) {
            lh4.P0().getClass();
            return false;
        }
        lh4 lh4VarP0 = lh4.P0();
        s39VarC.toString();
        lh4VarP0.getClass();
        this.Y.remove(s39VarC);
        bh7 bh7VarA = this.Z.a(s39VarC);
        if (bh7VarA != null) {
            int iO = Build.VERSION.SDK_INT >= 31 ? tc.o(jobParameters) : -512;
            xd6 xd6Var = this.f0;
            xd6Var.getClass();
            xd6Var.J(bh7VarA, iO);
        }
        fv5 fv5Var = this.X.n0;
        String str = s39VarC.a;
        synchronized (fv5Var.k) {
            zContains = fv5Var.i.contains(str);
        }
        return !zContains;
    }
}
