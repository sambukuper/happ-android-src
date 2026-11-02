package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.gson.a;
import defpackage.k61;
import defpackage.oi7;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import su.happ.proxyutility.dto.StatisticsDataForSend;
import su.happ.proxyutility.util.CoreInfoRepository$msgReceiver$1;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class k61 {
    public volatile boolean a;
    public final ArrayList b = new ArrayList();
    public final j61 c = new j61(this, (byte) 0);
    public LinkedHashMap d = w51.M();
    public final CoreInfoRepository$msgReceiver$1 e = new BroadcastReceiver() { // from class: su.happ.proxyutility.util.CoreInfoRepository$msgReceiver$1
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            Integer numValueOf = intent != null ? Integer.valueOf(intent.getIntExtra("key", 0)) : null;
            k61 k61Var = this.a;
            if (numValueOf != null && numValueOf.intValue() == 124) {
                String stringExtra = intent.getStringExtra("content");
                if (stringExtra != null) {
                    k61Var.a(stringExtra);
                    return;
                }
                return;
            }
            if (numValueOf != null && numValueOf.intValue() == 41) {
                k61Var.d = w51.M();
                k61Var.c.a(new oi7(0L, 0L, w51.M(), w51.M()));
            }
        }
    };

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a(String str) {
        Long l;
        StatisticsDataForSend statisticsDataForSend = (StatisticsDataForSend) new a().c(str, new yi8(StatisticsDataForSend.class));
        long passedTime = statisticsDataForSend.getPassedTime();
        long currentTime = statisticsDataForSend.getCurrentTime();
        Map data = statisticsDataForSend.getData();
        LinkedHashMap linkedHashMap = this.d;
        data.getClass();
        linkedHashMap.getClass();
        for (Map.Entry entry : data.entrySet()) {
            bd8 bd8Var = (bd8) entry.getKey();
            Map map = (Map) entry.getValue();
            int iOrdinal = bd8Var.ordinal();
            if (iOrdinal == 0 || iOrdinal == 1) {
                for (Map.Entry entry2 : map.entrySet()) {
                    si7 si7Var = (si7) entry2.getKey();
                    long jLongValue = ((Number) entry2.getValue()).longValue();
                    Map map2 = (Map) this.d.get(bd8Var);
                    long jLongValue2 = (map2 == null || (l = (Long) map2.get(si7Var)) == null) ? 0L : l.longValue();
                    Map map3 = (Map) this.d.get(bd8Var);
                    if (map3 != null) {
                        map3.put(si7Var, Long.valueOf(jLongValue + jLongValue2));
                    }
                }
            }
        }
        this.c.a(new oi7(passedTime, currentTime, data, this.d));
    }
}
