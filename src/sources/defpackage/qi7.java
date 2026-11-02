package defpackage;

import android.os.CountDownTimer;
import su.happ.proxyutility.feature.statistics.StatisticsSettingsActivity;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class qi7 extends CountDownTimer {
    public final /* synthetic */ StatisticsSettingsActivity a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qi7(StatisticsSettingsActivity statisticsSettingsActivity) {
        super(Long.MAX_VALUE, 1000L);
        this.a = statisticsSettingsActivity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.CountDownTimer
    public final void onFinish() {
        int i = StatisticsSettingsActivity.W0;
        StatisticsSettingsActivity statisticsSettingsActivity = this.a;
        if (statisticsSettingsActivity.U0 == null) {
            qi7 qi7Var = new qi7(statisticsSettingsActivity);
            statisticsSettingsActivity.U0 = qi7Var;
            qi7Var.start();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.CountDownTimer
    public final void onTick(long j) {
        StatisticsSettingsActivity statisticsSettingsActivity = this.a;
        long j2 = statisticsSettingsActivity.V0 + 1000;
        statisticsSettingsActivity.V0 = j2;
        statisticsSettingsActivity.A(j2);
    }
}
