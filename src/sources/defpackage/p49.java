package defpackage;

import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class p49 {
    public final ql6 a;
    public final oi1 b = new oi1((byte) 6);

    public p49(ql6 ql6Var) {
        this.a = ql6Var;
    }

    public final void a(String str, Set set) {
        str.getClass();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            u15.G(this.a, false, true, new gq6(this, new o49((String) it.next(), str), (byte) 29));
        }
    }
}
