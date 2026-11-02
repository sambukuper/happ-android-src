package defpackage;

import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class x40 extends q10 {
    public final /* synthetic */ byte b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x40(e31 e31Var, byte b) {
        super(e31Var);
        this.b = b;
    }

    @Override // defpackage.w21
    public final boolean c(l49 l49Var) {
        byte b = this.b;
        l49Var.getClass();
        switch (b) {
            case 0:
                return l49Var.j.c;
            case 1:
                return l49Var.j.e;
            case 2:
                return l49Var.j.a == b45.Y;
            case 3:
                return l49Var.j.a == b45.Z;
            default:
                return l49Var.j.f;
        }
    }

    @Override // defpackage.q10
    public final int d() {
        switch (this.b) {
            case 0:
                return 6;
            case 1:
                return 5;
            case 2:
                return 7;
            case 3:
                return 7;
            default:
                return 9;
        }
    }

    @Override // defpackage.q10
    public final boolean e(Object obj) {
        boolean zBooleanValue;
        switch (this.b) {
            case 0:
                zBooleanValue = ((Boolean) obj).booleanValue();
                break;
            case 1:
                zBooleanValue = ((Boolean) obj).booleanValue();
                break;
            case 2:
                x35 x35Var = (x35) obj;
                x35Var.getClass();
                return x35Var.e || !x35Var.a || (Build.VERSION.SDK_INT >= 26 && !x35Var.b);
            case 3:
                x35 x35Var2 = (x35) obj;
                x35Var2.getClass();
                return !x35Var2.a || x35Var2.c || x35Var2.e;
            default:
                zBooleanValue = ((Boolean) obj).booleanValue();
                break;
        }
        return !zBooleanValue;
    }
}
