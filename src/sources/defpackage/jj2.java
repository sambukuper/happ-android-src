package defpackage;

import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.ApplicationExitInfo;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteDiskIOException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.database.sqlite.SQLiteTableLockedException;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.utils.ForceStopRunnable$BroadcastReceiver;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class jj2 implements Runnable {
    public static final long g0;
    public final Context X;
    public final x39 Y;
    public final lr5 Z;
    public int f0 = 0;

    static {
        lh4.a1("ForceStopRunnable");
        g0 = 315360000000L;
    }

    public jj2(Context context, x39 x39Var) {
        this.X = context.getApplicationContext();
        this.Y = x39Var;
        this.Z = x39Var.o0;
    }

    public static void b(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        int i = Build.VERSION.SDK_INT >= 31 ? 167772160 : 134217728;
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class<?>) ForceStopRunnable$BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        PendingIntent broadcast = PendingIntent.getBroadcast(context, -1, intent, i);
        long jCurrentTimeMillis = System.currentTimeMillis() + g0;
        if (alarmManager != null) {
            alarmManager.setExact(0, jCurrentTimeMillis, broadcast);
        }
    }

    /* JADX WARN: Code duplicated, block: B:119:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:0x01dc  */
    public final void a() throws Throwable {
        boolean z;
        lr5 lr5Var = this.Z;
        x39 x39Var = this.Y;
        xy0 xy0Var = x39Var.j0;
        lr5 lr5Var2 = x39Var.o0;
        WorkDatabase workDatabase = x39Var.k0;
        int i = p08.g0;
        Context context = this.X;
        JobScheduler jobSchedulerA = hm3.a(context);
        ArrayList<JobInfo> arrayListB = p08.b(context, jobSchedulerA);
        List list = (List) u15.G(workDatabase.u().a, true, false, new zx6((byte) 28));
        HashSet hashSet = new HashSet(arrayListB != null ? arrayListB.size() : 0);
        if (arrayListB != null && !arrayListB.isEmpty()) {
            for (JobInfo jobInfo : arrayListB) {
                s39 s39VarF = p08.f(jobInfo);
                if (s39VarF != null) {
                    hashSet.add(s39VarF.a);
                } else {
                    p08.a(jobSchedulerA, jobInfo.getId());
                }
            }
        }
        Iterator it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                if (!hashSet.contains((String) it.next())) {
                    lh4.P0().getClass();
                    z = true;
                    break;
                }
            } else {
                z = false;
                break;
            }
        }
        if (z) {
            workDatabase.b();
            try {
                n49 n49VarX = workDatabase.x();
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    n49VarX.e(-1L, (String) it2.next());
                }
                workDatabase.p();
                workDatabase.l();
            } catch (Throwable th) {
                workDatabase.l();
                throw th;
            }
        }
        n49 n49VarX2 = workDatabase.x();
        d49 d49VarW = workDatabase.w();
        workDatabase.b();
        try {
            List<l49> list2 = (List) u15.G(n49VarX2.a, true, false, new ut8((byte) 25));
            boolean z2 = (list2 == null || list2.isEmpty()) ? false : true;
            if (z2) {
                for (l49 l49Var : list2) {
                    u39 u39Var = u39.X;
                    String str = l49Var.a;
                    n49VarX2.h(u39Var, str);
                    n49VarX2.i(-512, str);
                    n49VarX2.e(-1L, str);
                }
            }
            u15.G(d49VarW.a, false, true, new ut8((byte) 16));
            workDatabase.p();
            workDatabase.l();
            boolean z3 = z2 || z;
            Long lA = ((WorkDatabase) lr5Var2.Y).s().a("reschedule_needed");
            if (lA != null && lA.longValue() == 1) {
                lh4.P0().getClass();
                x39Var.y0();
                lr5Var2.getClass();
                ((WorkDatabase) lr5Var2.Y).s().b(new fs5("reschedule_needed", 0L));
                return;
            }
            try {
                int i2 = Build.VERSION.SDK_INT;
                int i3 = i2 >= 31 ? 570425344 : 536870912;
                Intent intent = new Intent();
                intent.setComponent(new ComponentName(context, (Class<?>) ForceStopRunnable$BroadcastReceiver.class));
                intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
                PendingIntent broadcast = PendingIntent.getBroadcast(context, -1, intent, i3);
                if (i2 < 30) {
                    if (broadcast == null) {
                        b(context);
                        lh4.P0().getClass();
                        x39Var.y0();
                        Object obj = xy0Var.g0;
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        lr5Var.getClass();
                        ((WorkDatabase) lr5Var.Y).s().b(new fs5("last_force_stop_ms", Long.valueOf(jCurrentTimeMillis)));
                        return;
                    }
                    if (z3) {
                        lh4.P0().getClass();
                        ax6.b(xy0Var, workDatabase, x39Var.m0);
                    }
                }
                if (broadcast != null) {
                    broadcast.cancel();
                }
                List<ApplicationExitInfo> historicalProcessExitReasons = ((ActivityManager) context.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
                if (historicalProcessExitReasons != null && !historicalProcessExitReasons.isEmpty()) {
                    Long lA2 = ((WorkDatabase) lr5Var.Y).s().a("last_force_stop_ms");
                    long jLongValue = lA2 != null ? lA2.longValue() : 0L;
                    for (int i4 = 0; i4 < historicalProcessExitReasons.size(); i4++) {
                        ApplicationExitInfo applicationExitInfoA = u52.a(historicalProcessExitReasons.get(i4));
                        if (applicationExitInfoA.getReason() == 10 && applicationExitInfoA.getTimestamp() >= jLongValue) {
                            lh4.P0().getClass();
                            x39Var.y0();
                            Object obj2 = xy0Var.g0;
                            long jCurrentTimeMillis2 = System.currentTimeMillis();
                            lr5Var.getClass();
                            ((WorkDatabase) lr5Var.Y).s().b(new fs5("last_force_stop_ms", Long.valueOf(jCurrentTimeMillis2)));
                            return;
                        }
                    }
                }
                if (z3) {
                    lh4.P0().getClass();
                    ax6.b(xy0Var, workDatabase, x39Var.m0);
                }
            } catch (IllegalArgumentException | SecurityException unused) {
                lh4.P0().getClass();
            }
        } catch (Throwable th2) {
            workDatabase.l();
            throw th2;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zA;
        x39 x39Var = this.Y;
        xy0 xy0Var = x39Var.j0;
        try {
            boolean zIsEmpty = TextUtils.isEmpty((String) xy0Var.i0);
            Context context = this.X;
            if (zIsEmpty) {
                lh4.P0().getClass();
                zA = true;
            } else {
                zA = dv5.a(context, xy0Var);
                lh4.P0().getClass();
            }
            if (!zA) {
                x39Var.x0();
                return;
            }
            if (!us7.g(context)) {
                lh4.P0().getClass();
                IllegalStateException illegalStateException = new IllegalStateException("WorkManager can't be accessed from direct boot, because credential encrypted storage isn't accessible.\nDon't access or initialize WorkManager from directBootAware components. See https://developer.android.com/training/articles/direct-boot");
                xy0Var.getClass();
                throw illegalStateException;
            }
            while (true) {
                try {
                    y08.k(context);
                    lh4.P0().getClass();
                    try {
                        a();
                        x39Var.x0();
                        return;
                    } catch (SQLiteException e) {
                        this.f0++;
                        if (this.f0 >= 3) {
                            if (!(e instanceof SQLiteAccessPermException) && !(e instanceof SQLiteCantOpenDatabaseException) && !(e instanceof SQLiteConstraintException) && !(e instanceof SQLiteDatabaseCorruptException) && !(e instanceof SQLiteDatabaseLockedException) && !(e instanceof SQLiteDiskIOException) && !(e instanceof SQLiteFullException) && !(e instanceof SQLiteTableLockedException)) {
                                throw e;
                            }
                            lh4.P0().getClass();
                            IllegalStateException illegalStateException2 = new IllegalStateException("The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e);
                            xy0Var.getClass();
                            throw illegalStateException2;
                        }
                        lh4.P0().getClass();
                        try {
                            Thread.sleep(((long) this.f0) * 300);
                        } catch (InterruptedException unused) {
                        }
                    }
                } catch (SQLiteException e2) {
                    lh4.P0().getClass();
                    IllegalStateException illegalStateException3 = new IllegalStateException("Unexpected SQLite exception during migrations", e2);
                    xy0Var.getClass();
                    throw illegalStateException3;
                }
            }
        } catch (Throwable th) {
            x39Var.x0();
            throw th;
        }
    }
}
