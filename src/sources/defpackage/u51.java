package defpackage;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class u51 {
    public static final Map f;
    public static final ux0 g;
    public static final List h;
    public static final List i;
    public static final List j;
    public final it2 a;
    public final jj0 b;
    public final qt2 c;
    public final kc4 d;
    public ux0 e;

    static {
        i21.L(2, 4, 3);
        i21.L(2, 3);
        i21.L(2, 6, 4, 5);
        i21.K(3);
        i21.K(3);
        i21.L(4, 5);
        i21.L(2, 4, 3);
        i21.L(2, 3);
        CaptureRequest.Key key = CaptureRequest.CONTROL_AF_TRIGGER;
        Collections.singletonMap(key, 1).getClass();
        Map mapSingletonMap = Collections.singletonMap(key, 2);
        mapSingletonMap.getClass();
        f = mapSingletonMap;
        CaptureRequest.Key key2 = CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER;
        Collections.singletonMap(key2, 1).getClass();
        zp4.J(new qg5(key, 1), new qg5(key2, 1));
        g = vr3.a(new tj6(4, null));
        h = i21.L(0, 1, 2, 4);
        List listL = i21.L(0, 3, 1, 2, 6);
        i = listL;
        j = i21.L(0, 1, 2);
        CaptureRequest.Key key3 = CaptureRequest.CONTROL_AE_LOCK;
        Boolean bool = Boolean.TRUE;
        Collections.singletonMap(key3, bool).getClass();
        zp4.J(new qg5(key, 2), new qg5(key3, bool));
        Collections.singletonMap(key3, Boolean.FALSE).getClass();
        Collections.singletonMap(key2, 2).getClass();
        zp4.J(new qg5(key, 2), new qg5(key2, 2));
        Map mapSingletonMap2 = Collections.singletonMap(CaptureResult.CONTROL_AF_STATE, listL);
        mapSingletonMap2.getClass();
        new uv5(mapSingletonMap2, (byte) 1);
    }

    public u51(it2 it2Var, jj0 jj0Var, qt2 qt2Var, kc4 kc4Var) {
        it2Var.getClass();
        jj0Var.getClass();
        qt2Var.getClass();
        kc4Var.getClass();
        this.a = it2Var;
        this.b = jj0Var;
        this.c = qt2Var;
        this.d = kc4Var;
    }

    public static ux0 a(u51 u51Var, s7 s7Var, t7 t7Var, i00 i00Var, qd2 qd2Var, List list, List list2, List list3, int i2) {
        t7 t7Var2 = (i2 & 2) != 0 ? null : t7Var;
        i00 i00Var2 = (i2 & 4) != 0 ? null : i00Var;
        qd2 qd2Var2 = (i2 & 8) != 0 ? null : qd2Var;
        List list4 = (i2 & 16) != 0 ? null : list;
        List list5 = (i2 & 32) != 0 ? null : list2;
        List list6 = (i2 & 64) != 0 ? null : list3;
        if (u51Var.a.b.m() == null) {
            qt2.b(u51Var.c, s7Var, t7Var2, i00Var2, qd2Var2, list4, list5, list6, null, null, null, 896);
            u51Var.a.d(u51Var.c.a());
            return g;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (s7Var != null) {
            int i3 = s7Var.a;
            CaptureResult.Key key = CaptureResult.CONTROL_AE_MODE;
            key.getClass();
        }
        if (t7Var2 != null) {
            byte b = t7Var2.a;
            CaptureResult.Key key2 = CaptureResult.CONTROL_AF_MODE;
            key2.getClass();
        }
        if (i00Var2 != null) {
            byte b2 = i00Var2.a;
            CaptureResult.Key key3 = CaptureResult.CONTROL_AWB_MODE;
            key3.getClass();
        }
        if (qd2Var2 != null) {
            byte b3 = qd2Var2.a;
            CaptureResult.Key key4 = CaptureResult.FLASH_MODE;
            key4.getClass();
        }
        uj6 uj6Var = new uj6(new uv5(zp4.Q(linkedHashMap), (byte) 1), null, null);
        kc4 kc4Var = u51Var.d;
        kc4Var.getClass();
        kc4Var.X.add(uj6Var);
        qt2.b(u51Var.c, s7Var, t7Var2, i00Var2, qd2Var2, list4, list5, list6, null, null, null, 896);
        u51Var.a.d(u51Var.c.a());
        ux0 ux0Var = uj6Var.f0;
        synchronized (u51Var) {
            try {
                Objects.toString(u51Var.e);
                ux0 ux0Var2 = u51Var.e;
                if (ux0Var2 != null) {
                    CancellationException cancellationException = new CancellationException("A newer call for 3A state update initiated.");
                    cancellationException.initCause(null);
                    ux0Var2.m(cancellationException);
                }
                u51Var.e = ux0Var;
            } catch (Throwable th) {
                throw th;
            }
        }
        return ux0Var;
    }
}
