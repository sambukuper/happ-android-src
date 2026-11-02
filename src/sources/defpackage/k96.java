package defpackage;

import android.util.SparseArray;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class k96 {
    public SparseArray a;
    public int b;
    public Set c;

    public final j96 a(int i) {
        SparseArray sparseArray = this.a;
        j96 j96Var = (j96) sparseArray.get(i);
        if (j96Var != null) {
            return j96Var;
        }
        j96 j96Var2 = new j96();
        sparseArray.put(i, j96Var2);
        return j96Var2;
    }
}
