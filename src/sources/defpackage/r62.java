package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class r62 {
    public static final r62 b = new r62(0);
    public final Map a;

    public r62(r62 r62Var) {
        if (r62Var == b) {
            this.a = Collections.EMPTY_MAP;
        } else {
            this.a = Collections.unmodifiableMap(r62Var.a);
        }
    }

    public final void a(aq2 aq2Var) {
        this.a.put(new q62(aq2Var.a, aq2Var.d.X), aq2Var);
    }

    public r62() {
        this.a = new HashMap();
    }

    public r62(int i) {
        this.a = Collections.EMPTY_MAP;
    }
}
