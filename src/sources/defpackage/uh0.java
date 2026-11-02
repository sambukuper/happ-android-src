package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public interface uh0 {
    static xg1 g(ti0 ti0Var, s7 s7Var, t7 t7Var, i00 i00Var, List list, List list2, List list3, int i) {
        s7 s7Var2 = (i & 1) != 0 ? null : s7Var;
        t7 t7Var2 = (i & 2) != 0 ? null : t7Var;
        i00 i00Var2 = (i & 4) != 0 ? null : i00Var;
        List list4 = (i & 8) != 0 ? null : list;
        List list5 = (i & 16) != 0 ? null : list2;
        List list6 = (i & 32) != 0 ? null : list3;
        if (!ti0Var.X.a()) {
            return u51.a(ti0Var.Z, s7Var2, t7Var2, i00Var2, null, list4, list5, list6, 8);
        }
        om0.l("Cannot call update3A on ", ti0Var, " after close.");
        return null;
    }
}
