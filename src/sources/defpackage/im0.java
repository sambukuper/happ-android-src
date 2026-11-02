package defpackage;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.Context;
import android.os.Build;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class im0 implements dn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ x39 Y;

    public /* synthetic */ im0(x39 x39Var, byte b) {
        this.X = b;
        this.Y = x39Var;
    }

    @Override // defpackage.dn2
    public final Object invoke() {
        byte b = this.X;
        dn8 dn8Var = dn8.a;
        x39 x39Var = this.Y;
        switch (b) {
            case 0:
                WorkDatabase workDatabase = x39Var.k0;
                workDatabase.getClass();
                workDatabase.o(new sc(workDatabase, x39Var, (byte) 11));
                break;
            default:
                WorkDatabase workDatabase2 = x39Var.k0;
                Context context = x39Var.i0;
                int i = p08.g0;
                if (Build.VERSION.SDK_INT >= 34) {
                    hm3.a(context).cancelAll();
                }
                JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
                ArrayList arrayListB = p08.b(context, jobScheduler);
                if (arrayListB != null && !arrayListB.isEmpty()) {
                    Iterator it = arrayListB.iterator();
                    while (it.hasNext()) {
                        p08.a(jobScheduler, ((JobInfo) it.next()).getId());
                    }
                }
                ((Number) u15.G(workDatabase2.x().a, false, true, new ut8((byte) 23))).intValue();
                ax6.b(x39Var.j0, workDatabase2, x39Var.m0);
                break;
        }
        return dn8Var;
    }
}
