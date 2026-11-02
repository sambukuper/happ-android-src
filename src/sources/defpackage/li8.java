package defpackage;

import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class li8 {
    public static final li8 d = new li8(d02.X, e02.X, null);
    public final List a;
    public final Map b;
    public final li8 c;

    public li8(List list, Map map, li8 li8Var) {
        this.a = list;
        this.b = map;
        this.c = li8Var;
    }

    public final rw3 a(int i) {
        rw3 rw3Var = (rw3) this.b.get(Integer.valueOf(i));
        if (rw3Var != null) {
            return rw3Var;
        }
        li8 li8Var = this.c;
        if (li8Var != null) {
            return li8Var.a(i);
        }
        return null;
    }
}
