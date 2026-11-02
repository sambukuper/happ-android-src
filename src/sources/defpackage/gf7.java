package defpackage;

import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class gf7 {
    public static final LinkedHashSet a;
    public static final qs0 b;

    static {
        List<fk2> listL = i21.L(ks3.a, ks3.h, ks3.i, ks3.c, ks3.d, ks3.f);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (fk2 fk2Var : listL) {
            fk2Var.getClass();
            linkedHashSet.add(new qs0(fk2Var.b(), fk2Var.a.g()));
        }
        a = linkedHashSet;
        fk2 fk2Var2 = ks3.g;
        fk2Var2.getClass();
        b = new qs0(fk2Var2.b(), fk2Var2.a.g());
    }
}
