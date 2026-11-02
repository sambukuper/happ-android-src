package defpackage;

import android.app.Service;
import android.content.res.Configuration;
import com.tencent.mmkv.MMKV;
import java.util.Map;
import su.happ.proxyutility.dto.ServerAffiliationInfo;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class pi7 {
    public final un5 a;
    public final MMKV b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public pi7(un5 un5Var) {
        kw4 kw4Var = kw4.a;
        MMKV mmkvL = kw4.l();
        un5Var.getClass();
        this.a = un5Var;
        this.b = mmkvL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code duplicated, block: B:16:0x0061  */
    /* JADX WARN: Code duplicated, block: B:27:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:30:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:41:0x0100  */
    public final String a(Service service, String str, oi7 oi7Var) {
        String strM;
        String strM2;
        Long testDelayMillis;
        qg5 qg5Var;
        Long l;
        Long l2;
        Long l3;
        Map map;
        Long l4;
        Map map2 = oi7Var.c;
        boolean zB = this.b.b("pref_speed_enabled");
        si7 si7Var = si7.X;
        si7 si7Var2 = si7.Y;
        String string = null;
        if (zB) {
            bd8 bd8Var = bd8.X;
            Map map3 = (Map) map2.get(bd8Var);
            qg5 qg5Var2 = (map3 == null || (l3 = (Long) map3.get(si7Var2)) == null || (map = (Map) map2.get(bd8Var)) == null || (l4 = (Long) map.get(si7Var)) == null) ? null : new qg5(l3, l4);
            if (qg5Var2 != null) {
                strM = oi0.m(x79.f(((Number) qg5Var2.X).longValue()), "↑  ", x79.f(((Number) qg5Var2.Y).longValue()), "↓");
            } else {
                strM = null;
            }
        } else {
            strM = null;
        }
        if (zB) {
            long j = oi7Var.a;
            bd8 bd8Var2 = bd8.Y;
            Map map4 = (Map) map2.get(bd8Var2);
            if (map4 == null || (l = (Long) map4.get(si7Var2)) == null) {
                qg5Var = null;
            } else {
                double d = j / 1000.0d;
                long jLongValue = (long) (l.longValue() / d);
                Map map5 = (Map) map2.get(bd8Var2);
                if (map5 == null || (l2 = (Long) map5.get(si7Var)) == null) {
                    qg5Var = null;
                } else {
                    qg5Var = new qg5(Long.valueOf(jLongValue), Long.valueOf((long) (l2.longValue() / d)));
                }
            }
            if (qg5Var != null) {
                strM2 = oi0.m(x79.f(((Number) qg5Var.X).longValue()), "↑  ", x79.f(((Number) qg5Var.Y).longValue()), "↓");
            } else {
                strM2 = null;
            }
        } else {
            strM2 = null;
        }
        ServerAffiliationInfo serverAffiliationInfoC = this.a.c(str);
        if (serverAffiliationInfoC != null && (testDelayMillis = serverAffiliationInfoC.getTestDelayMillis()) != null) {
            if (testDelayMillis.longValue() <= -1) {
                testDelayMillis = null;
            }
            if (testDelayMillis != null) {
                string = testDelayMillis.longValue() + " ms";
            } else if (serverAffiliationInfoC != null) {
                int i = y46.vpn_service_ping_testing;
                Configuration configuration = new Configuration(service.getResources().getConfiguration());
                ss8 ss8Var = ss8.a;
                configuration.setLocale(ss8.n());
                string = service.createConfigurationContext(configuration).getString(i);
                string.getClass();
            }
        } else if (serverAffiliationInfoC != null && serverAffiliationInfoC.getIsLoading()) {
            int i2 = y46.vpn_service_ping_testing;
            Configuration configuration2 = new Configuration(service.getResources().getConfiguration());
            ss8 ss8Var2 = ss8.a;
            configuration2.setLocale(ss8.n());
            string = service.createConfigurationContext(configuration2).getString(i2);
            string.getClass();
        }
        StringBuilder sb = new StringBuilder();
        if (strM != null) {
            sb.append("proxy: ".concat(strM));
            sb.append('\n');
        }
        if (strM2 != null) {
            sb.append("direct: ".concat(strM2));
            sb.append('\n');
        }
        if (string != null) {
            sb.append("ping: ".concat(string));
            sb.append('\n');
        }
        return sb.toString();
    }
}
