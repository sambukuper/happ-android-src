package defpackage;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.l;
import com.google.android.material.datepicker.e;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class vq4 extends i96 {
    public final /* synthetic */ e a;
    public final /* synthetic */ wq4 b;

    public vq4(wq4 wq4Var, e eVar) {
        this.b = wq4Var;
        this.a = eVar;
    }

    @Override // defpackage.i96
    public final void a(RecyclerView recyclerView, int i) {
        wq4 wq4Var;
        mg5 mg5Var;
        if (i != 0 || (mg5Var = (wq4Var = this.b).r1) == null) {
            return;
        }
        View viewE = mg5Var.e((LinearLayoutManager) wq4Var.k1.getLayoutManager());
        if (viewE != null) {
            l lVarN = RecyclerView.N(viewE);
            int iB = lVarN != null ? lVarN.b() : -1;
            if (iB != -1) {
                e eVar = this.a;
                wq4Var.g1 = eVar.l(iB);
                wq4Var.p1.setText(eVar.l(iB).e());
                wq4Var.X(iB);
            }
        }
        wq4Var.W();
    }

    @Override // defpackage.i96
    public final void b(RecyclerView recyclerView, int i, int i2) {
        wq4 wq4Var = this.b;
        RecyclerView recyclerView2 = wq4Var.k1;
        int iK1 = i < 0 ? ((LinearLayoutManager) recyclerView2.getLayoutManager()).k1() : ((LinearLayoutManager) recyclerView2.getLayoutManager()).l1();
        mg5 mg5Var = wq4Var.r1;
        e eVar = this.a;
        if (mg5Var == null) {
            wq4Var.g1 = eVar.l(iK1);
        }
        wq4Var.p1.setText(eVar.l(iK1).e());
        wq4Var.X(iK1);
    }
}
