package defpackage;

import android.view.DragEvent;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class pd implements View.OnDragListener, ut1 {
    public final wt1 a = new wt1(null, 3);
    public final bu b = new bu(0);
    public final od c = new od(this);

    @Override // android.view.View.OnDragListener
    public final boolean onDrag(View view, DragEvent dragEvent) {
        pt1 pt1Var = new pt1(dragEvent);
        int action = dragEvent.getAction();
        bu buVar = this.b;
        wt1 wt1Var = this.a;
        switch (action) {
            case 1:
                aa6 aa6Var = new aa6();
                sn snVar = new sn((Object) pt1Var, (Object) wt1Var, (Object) aa6Var, (byte) 6);
                if (snVar.B(wt1Var) == xe8.X) {
                    ts7.j(wt1Var, snVar);
                }
                boolean z = aa6Var.X;
                qt qtVar = new qt(buVar);
                while (qtVar.hasNext()) {
                    ((xt1) qtVar.next()).r0(pt1Var);
                }
                return z;
            case 2:
                wt1Var.t0(pt1Var);
                return false;
            case 3:
                return wt1Var.K0(pt1Var);
            case 4:
                wt1Var.C(pt1Var);
                buVar.clear();
                return false;
            case 5:
                wt1Var.s(pt1Var);
                return false;
            case 6:
                wt1Var.j0(pt1Var);
                return false;
            default:
                return false;
        }
    }
}
