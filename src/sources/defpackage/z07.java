package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class z07 {
    public final t07 a;
    public final wz4 b;

    public z07(y07 y07Var, ff3 ff3Var) {
        this.a = y07Var.d;
        List listI = y07Var.i((4 & 1) != 0 ? !y07Var.b : false, (4 & 2) == 0);
        this.b = new wz4(listI.size());
        int size = listI.size();
        for (int i = 0; i < size; i++) {
            y07 y07Var2 = (y07) listI.get(i);
            if (ff3Var.a(y07Var2.f)) {
                this.b.a(y07Var2.f);
            }
        }
    }
}
