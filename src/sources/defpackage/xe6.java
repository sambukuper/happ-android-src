package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class xe6 extends pv4 {
    public final /* synthetic */ byte c = 1;
    public final Context d;

    public xe6(Context context) {
        super(9, 10);
        this.d = context;
    }

    @Override // defpackage.pv4
    public final void a(sm2 sm2Var) {
        byte b = this.c;
        Context context = this.d;
        sm2Var.getClass();
        switch (b) {
            case 0:
                if (this.b >= 10) {
                    sm2Var.C(new Object[]{"reschedule_needed", 1});
                    return;
                } else {
                    context.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
                    return;
                }
            default:
                sm2Var.u("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
                SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.preferences", 0);
                if (sharedPreferences.contains("reschedule_needed") || sharedPreferences.contains("last_cancel_all_time_ms")) {
                    long j = sharedPreferences.getLong("last_cancel_all_time_ms", 0L);
                    long j2 = sharedPreferences.getBoolean("reschedule_needed", false) ? 1L : 0L;
                    sm2Var.g();
                    try {
                        sm2Var.C(new Object[]{"last_cancel_all_time_ms", Long.valueOf(j)});
                        sm2Var.C(new Object[]{"reschedule_needed", Long.valueOf(j2)});
                        sharedPreferences.edit().clear().apply();
                        sm2Var.J();
                        sm2Var.p();
                    } catch (Throwable th) {
                        sm2Var.p();
                        throw th;
                    }
                }
                SharedPreferences sharedPreferences2 = context.getSharedPreferences("androidx.work.util.id", 0);
                if (sharedPreferences2.contains("next_job_scheduler_id") || sharedPreferences2.contains("next_job_scheduler_id")) {
                    int i = sharedPreferences2.getInt("next_job_scheduler_id", 0);
                    int i2 = sharedPreferences2.getInt("next_alarm_manager_id", 0);
                    sm2Var.g();
                    try {
                        sm2Var.C(new Object[]{"next_job_scheduler_id", Integer.valueOf(i)});
                        sm2Var.C(new Object[]{"next_alarm_manager_id", Integer.valueOf(i2)});
                        sharedPreferences2.edit().clear().apply();
                        sm2Var.J();
                        return;
                    } finally {
                        sm2Var.p();
                    }
                }
                return;
        }
    }

    public xe6(Context context, int i, int i2) {
        super(i, i2);
        this.d = context;
    }
}
