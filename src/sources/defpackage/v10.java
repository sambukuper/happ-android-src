package defpackage;

import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import androidx.leanback.widget.GridLayoutManager;
import androidx.recyclerview.widget.l;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class v10 implements l96 {
    public final /* synthetic */ b20 a;

    public v10(b20 b20Var) {
        this.a = b20Var;
    }

    public final void a(l lVar) {
        int i;
        GridLayoutManager gridLayoutManager = this.a.O1;
        gridLayoutManager.getClass();
        int iB = lVar.b();
        if (iB != -1) {
            cb0 cb0Var = gridLayoutManager.e1;
            View view = lVar.a;
            int i2 = cb0Var.Y;
            if (i2 != 1) {
                if ((i2 == 2 || i2 == 3) && ((ej4) cb0Var.f0) != null) {
                    String string = Integer.toString(iB);
                    SparseArray<Parcelable> sparseArray = new SparseArray<>();
                    view.saveHierarchyState(sparseArray);
                    ((ej4) cb0Var.f0).b(string, sparseArray);
                    return;
                }
                return;
            }
            ej4 ej4Var = (ej4) cb0Var.f0;
            if (ej4Var != null) {
                synchronized (ej4Var.c) {
                    i = ej4Var.d;
                }
                if (i != 0) {
                    ((ej4) cb0Var.f0).c(Integer.toString(iB));
                }
            }
        }
    }
}
