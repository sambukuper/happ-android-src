package defpackage;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class p08 implements xw6 {
    public static final /* synthetic */ int g0 = 0;
    public final Context X;
    public final JobScheduler Y;
    public final o08 Z;
    public final WorkDatabase f0;

    static {
        lh4.a1("SystemJobScheduler");
    }

    public p08(Context context, WorkDatabase workDatabase, xy0 xy0Var) {
        JobScheduler jobSchedulerA = hm3.a(context);
        o08 o08Var = new o08(context, (f08) xy0Var.g0);
        this.X = context;
        this.Y = jobSchedulerA;
        this.Z = o08Var;
        this.f0 = workDatabase;
    }

    public static void a(JobScheduler jobScheduler, int i) {
        try {
            jobScheduler.cancel(i);
        } catch (Throwable unused) {
            lh4 lh4VarP0 = lh4.P0();
            String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i));
            lh4VarP0.getClass();
        }
    }

    public static ArrayList b(Context context, JobScheduler jobScheduler) {
        List<JobInfo> allPendingJobs;
        int i = hm3.a;
        jobScheduler.getClass();
        try {
            allPendingJobs = jobScheduler.getAllPendingJobs();
            allPendingJobs.getClass();
        } catch (Throwable unused) {
            lh4.P0().getClass();
            allPendingJobs = null;
        }
        if (allPendingJobs == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(allPendingJobs.size());
        ComponentName componentName = new ComponentName(context, (Class<?>) SystemJobService.class);
        for (JobInfo jobInfo : allPendingJobs) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    public static s39 f(JobInfo jobInfo) {
        PersistableBundle extras = jobInfo.getExtras();
        if (extras == null) {
            return null;
        }
        try {
            if (!extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new s39(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION", 0));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // defpackage.xw6
    public final boolean c() {
        return true;
    }

    @Override // defpackage.xw6
    public final void d(String str) {
        ArrayList arrayList;
        Context context = this.X;
        JobScheduler jobScheduler = this.Y;
        ArrayList<JobInfo> arrayListB = b(context, jobScheduler);
        byte b = 2;
        if (arrayListB == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(2);
            for (JobInfo jobInfo : arrayListB) {
                s39 s39VarF = f(jobInfo);
                if (s39VarF != null && str.equals(s39VarF.a)) {
                    arrayList2.add(Integer.valueOf(jobInfo.getId()));
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            int iIntValue = ((Integer) it.next()).intValue();
            lh4.P0().getClass();
            a(jobScheduler, iIntValue);
        }
        l08 l08VarU = this.f0.u();
        l08VarU.getClass();
        str.getClass();
        u15.G(l08VarU.a, false, true, new nm7(str, b));
    }

    @Override // defpackage.xw6
    public final void e(l49... l49VarArr) {
        int iIntValue;
        WorkDatabase workDatabase = this.f0;
        vk1 vk1Var = new vk1(workDatabase, (byte) 16);
        byte b = 0;
        for (l49 l49Var : l49VarArr) {
            workDatabase.b();
            try {
                l49 l49VarC = workDatabase.x().c(l49Var.a);
                if (l49VarC != null && l49VarC.b == u39.X) {
                    s39 s39VarB = v18.b(l49Var);
                    int i = s39VarB.b;
                    String str = s39VarB.a;
                    l08 l08VarU = workDatabase.u();
                    l08VarU.getClass();
                    str.getClass();
                    j08 j08Var = (j08) u15.G(l08VarU.a, true, false, new k08(str, i, b));
                    if (j08Var != null) {
                        iIntValue = j08Var.c;
                    } else {
                        Object objN = ((WorkDatabase) vk1Var.Y).n(new x43(vk1Var, (byte) 0));
                        objN.getClass();
                        iIntValue = ((Number) objN).intValue();
                    }
                    if (j08Var == null) {
                        j08 j08Var2 = new j08(str, i, iIntValue);
                        l08 l08VarU2 = workDatabase.u();
                        l08VarU2.getClass();
                        u15.G(l08VarU2.a, false, true, new gq6(l08VarU2, j08Var2, (byte) 10));
                    }
                    g(l49Var, iIntValue);
                    workDatabase.p();
                } else {
                    lh4.P0().getClass();
                    workDatabase.p();
                }
                workDatabase.l();
            } catch (Throwable th) {
                workDatabase.l();
                throw th;
            }
        }
    }

    public final void g(l49 l49Var, int i) throws IOException {
        List<JobInfo> allPendingJobs;
        String str;
        JobInfo jobInfoA = this.Z.a(l49Var, i);
        lh4.P0().getClass();
        try {
            if (this.Y.schedule(jobInfoA) == 0) {
                lh4.P0().getClass();
                if (l49Var.q && l49Var.r == yd5.X) {
                    l49Var.q = false;
                    lh4.P0().getClass();
                    g(l49Var, i);
                }
            }
        } catch (IllegalStateException e) {
            int i2 = hm3.a;
            int i3 = Build.VERSION.SDK_INT;
            int i4 = i3 >= 31 ? 150 : 100;
            int size = ((List) u15.G(this.f0.x().a, true, false, new ut8((byte) 20))).size();
            Context context = this.X;
            String strY0 = "<faulty JobScheduler failed to getPendingJobs>";
            if (i3 >= 34) {
                JobScheduler jobSchedulerA = hm3.a(context);
                String str2 = null;
                try {
                    allPendingJobs = jobSchedulerA.getAllPendingJobs();
                    allPendingJobs.getClass();
                } catch (Throwable unused) {
                    lh4.P0().getClass();
                    allPendingJobs = null;
                }
                if (allPendingJobs != null) {
                    ArrayList arrayListB = b(context, jobSchedulerA);
                    int size2 = arrayListB != null ? allPendingJobs.size() - arrayListB.size() : 0;
                    if (size2 == 0) {
                        str = null;
                    } else {
                        str = size2 + " of which are not owned by WorkManager";
                    }
                    Object systemService = context.getSystemService("jobscheduler");
                    systemService.getClass();
                    ArrayList arrayListB2 = b(context, (JobScheduler) systemService);
                    int size3 = arrayListB2 != null ? arrayListB2.size() : 0;
                    if (size3 != 0) {
                        str2 = size3 + " from WorkManager in the default namespace";
                    }
                    strY0 = wv0.y0(eu.q0(new String[]{allPendingJobs.size() + " jobs in \"androidx.work.systemjobscheduler\" namespace", str, str2}), ",\n", null, null, null, 62);
                }
            } else {
                ArrayList arrayListB3 = b(context, hm3.a(context));
                if (arrayListB3 != null) {
                    strY0 = arrayListB3.size() + " jobs from WorkManager";
                }
            }
            StringBuilder sb = new StringBuilder("JobScheduler ");
            sb.append(i4);
            sb.append(" job limit exceeded.\nIn JobScheduler there are ");
            sb.append(strY0);
            sb.append(".\nThere are ");
            String strN = oi0.n(sb, size, " jobs tracked by WorkManager's database;\nthe Configuration limit is 20.");
            lh4.P0().getClass();
            throw new IllegalStateException(strN, e);
        } catch (Throwable unused2) {
            lh4 lh4VarP0 = lh4.P0();
            l49Var.toString();
            lh4VarP0.getClass();
        }
    }
}
