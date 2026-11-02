package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class bm8 {
    public final int a;
    public final vd7 b;
    public final vd7 c;

    public bm8(List list, List list2, int i) {
        this.a = i;
        if (!(i >= 0)) {
            zc3.a("Capacity must be a positive integer");
        }
        if (!(list.size() + list2.size() <= i)) {
            zc3.a("Initial list of undo and redo operations have a size greater than the given capacity.");
        }
        vd7 vd7Var = new vd7();
        vd7Var.addAll(list);
        this.b = vd7Var;
        vd7 vd7Var2 = new vd7();
        vd7Var2.addAll(list2);
        this.c = vd7Var2;
    }
}
