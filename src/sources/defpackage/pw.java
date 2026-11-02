package defpackage;

import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class pw {
    public final m51 a;
    public final wl6 b;
    public final Object c;
    public final LinkedHashMap d;
    public final CopyOnWriteArrayList e;

    public pw(s98 s98Var, wj0 wj0Var, bm3 bm3Var) {
        s98Var.getClass();
        wj0Var.getClass();
        bm3Var.getClass();
        this.a = gv3.c(g33.K(new ow7(bm3Var), g33.K(s98Var.h, new x61("CXCP-AudioRestrictionControllerImpl"))));
        this.b = new wl6((byte) 23);
        this.c = new Object();
        this.d = new LinkedHashMap();
        this.e = new CopyOnWriteArrayList();
        wj0Var.a(uj0.Y, new c1(this, (byte) 6));
    }

    public final qw a() {
        LinkedHashMap linkedHashMap = this.d;
        if (linkedHashMap.containsValue(new qw(3))) {
            return new qw(3);
        }
        synchronized (this.c) {
        }
        if (linkedHashMap.containsValue(new qw(1))) {
            return new qw(1);
        }
        synchronized (this.c) {
        }
        if (linkedHashMap.containsValue(new qw(0))) {
            return new qw(0);
        }
        synchronized (this.c) {
        }
        return null;
    }
}
