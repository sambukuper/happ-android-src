package defpackage;

import android.view.View;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class qn1 implements v85 {
    public final /* synthetic */ sn1 a;

    public qn1(sn1 sn1Var) {
        this.a = sn1Var;
    }

    @Override // defpackage.v85
    public final void a(Object obj) {
        if (((d94) obj) != null) {
            sn1 sn1Var = this.a;
            if (sn1Var.k1) {
                View viewO = sn1Var.O();
                if (viewO.getParent() != null) {
                    bt.i("DialogFragment can not be attached to a container view");
                } else if (sn1Var.o1 != null) {
                    if (ml2.K(3)) {
                        Objects.toString(sn1Var.o1);
                    }
                    sn1Var.o1.setContentView(viewO);
                }
            }
        }
    }
}
