package defpackage;

import android.os.CountDownTimer;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;
import libxray.XRayPoint;
import su.happ.proxyutility.dto.StatisticsDataForSend;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class ri7 extends CountDownTimer {
    public final h69 a;
    public long b;
    public long c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ri7(h69 h69Var) {
        super(Long.MAX_VALUE, 3000L);
        this.a = h69Var;
        this.b = Long.MAX_VALUE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object a(long j, long j2) {
        try {
            bd8 bd8Var = bd8.Y;
            si7 si7Var = si7.Y;
            qg5 qg5Var = new qg5(si7Var, 0L);
            si7 si7Var2 = si7.X;
            qg5 qg5Var2 = new qg5(bd8Var, zp4.K(new qg5[]{qg5Var, new qg5(si7Var2, 0L)}));
            bd8 bd8Var2 = bd8.X;
            LinkedHashMap linkedHashMapK = zp4.K(new qg5[]{qg5Var2, new qg5(bd8Var2, zp4.K(new qg5[]{new qg5(si7Var, 0L), new qg5(si7Var2, 0L)}))});
            Map map = (Map) linkedHashMapK.get(bd8Var);
            if (map != null) {
                map.put(si7Var2, Long.valueOf(n69.a.queryStats("direct", "downlink")));
            }
            Map map2 = (Map) linkedHashMapK.get(bd8Var);
            if (map2 != null) {
                map2.put(si7Var, Long.valueOf(n69.a.queryStats("direct", "uplink")));
            }
            Map map3 = (Map) linkedHashMapK.get(bd8Var2);
            if (map3 != null) {
                map3.put(si7Var2, Long.valueOf(n69.a.queryStats("proxy", "downlink")));
            }
            Map map4 = (Map) linkedHashMapK.get(bd8Var2);
            if (map4 != null) {
                map4.put(si7Var, Long.valueOf(n69.a.queryStats("proxy", "uplink")));
            }
            StatisticsDataForSend statisticsDataForSend = new StatisticsDataForSend(j, Long.MAX_VALUE - j2, linkedHashMapK);
            kw4 kw4Var = kw4.a;
            String strH = kw4.g().h(statisticsDataForSend);
            XRayPoint xRayPoint = n69.a;
            ((k61) n69.e.getValue()).a(strH);
            qe4.L0(this.a.g(), "su.happ.proxyutility.action.activity", 124, strH);
            return dn8.a;
        } catch (Throwable th) {
            if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                throw th;
            }
            return new rj6(th);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.CountDownTimer
    public final void onFinish() {
        this.b = Long.MAX_VALUE;
        start();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.CountDownTimer
    public final void onTick(long j) {
        long j2 = this.b - j;
        this.c = j2;
        this.b = j;
        a(j2, j);
    }
}
