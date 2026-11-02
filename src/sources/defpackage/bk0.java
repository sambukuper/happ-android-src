package defpackage;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bk0 implements v85 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ Object b;

    @Override // defpackage.v85
    public final void a(Object obj) {
        HashMap map;
        byte b = this.a;
        byte b2 = 0;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                ek0 ek0Var = (ek0) obj2;
                ux uxVar = (ux) obj;
                if (!ek0Var.l.get()) {
                    hi5.z0("CameraPresencePrvdr");
                    return;
                } else {
                    if (uxVar.b != null) {
                        hi5.z0("CameraPresencePrvdr");
                        ek0Var.a.execute(new ak0(ek0Var, b2));
                        return;
                    }
                    return;
                }
            default:
                f63 f63Var = (f63) obj2;
                tc4 tc4Var = (tc4) obj;
                synchronized (((HashMap) f63Var.Z)) {
                    map = new HashMap((HashMap) f63Var.Z);
                    break;
                }
                for (Map.Entry entry : map.entrySet()) {
                    ((Executor) entry.getValue()).execute(new sc4(entry, tc4Var, b2));
                }
                return;
        }
    }
}
