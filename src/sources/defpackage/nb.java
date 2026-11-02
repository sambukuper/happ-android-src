package defpackage;

import androidx.compose.ui.platform.AndroidComposeView;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class nb implements gn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ ea6 Y;

    public /* synthetic */ nb(ea6 ea6Var, byte b) {
        this.X = b;
        this.Y = ea6Var;
    }

    @Override // defpackage.gn2
    public final Object B(Object obj) {
        byte b = this.X;
        boolean z = true;
        ea6 ea6Var = this.Y;
        switch (b) {
            case 0:
                Class cls = AndroidComposeView.J1;
                ea6Var.X = (ai2) obj;
                return Boolean.TRUE;
            case 1:
                nr2 nr2Var = (nr2) obj;
                if (dh3.f(nr2Var.Q(), "waiting")) {
                    ea6Var.X = nr2Var;
                    z = false;
                }
                return Boolean.valueOf(z);
            case 2:
                c13 c13Var = (c13) obj;
                Object obj2 = ea6Var.X;
                if (obj2 == null && c13Var.s0) {
                    ea6Var.X = c13Var;
                } else if (obj2 != null) {
                    c13Var.getClass();
                }
                return Boolean.TRUE;
            case 3:
                nh1 nh1Var = (ye8) obj;
                if (((jx4) nh1Var).X.p0) {
                    ea6Var.X = nh1Var;
                    z = false;
                }
                return Boolean.valueOf(z);
            default:
                ye8 ye8Var = (ye8) obj;
                ye8Var.getClass();
                p64 p64Var = ((af8) ye8Var).q0;
                List listN = (List) ea6Var.X;
                if (listN != null) {
                    listN.add(p64Var);
                } else {
                    listN = i21.N(p64Var);
                }
                ea6Var.X = listN;
                return xe8.Y;
        }
    }
}
