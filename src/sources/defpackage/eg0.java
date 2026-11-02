package defpackage;

import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class eg0 {
    public final Object a = new Object();
    public final LinkedHashMap b = new LinkedHashMap();

    public final void a(int i, String str, boolean z) {
        sy8 sy8Var;
        str.getClass();
        synchronized (this.a) {
            sy8Var = (sy8) this.b.get(new vi0(str));
        }
        if (sy8Var == null) {
            return;
        }
        sy8Var.b.a(new mt2(i, z));
    }
}
