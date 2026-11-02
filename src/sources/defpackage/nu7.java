package defpackage;

import androidx.appcompat.widget.AppCompatButton;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class nu7 implements h91 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ ou7 Y;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ nu7(ou7 ou7Var, byte b) {
        this.X = b;
        this.Y = ou7Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean c() {
        byte b = this.X;
        ou7 ou7Var = this.Y;
        switch (b) {
            case 0:
                return ou7Var.X.m0.requestFocus();
            default:
                return ou7Var.X.n0.requestFocus();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean d() {
        byte b = this.X;
        ou7 ou7Var = this.Y;
        switch (b) {
            case 0:
                break;
        }
        return ou7Var.X.m0.requestFocus();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean g() {
        byte b = this.X;
        ou7 ou7Var = this.Y;
        switch (b) {
            case 0:
                yk2 yk2Var = ou7Var.X;
                AppCompatButton appCompatButton = yk2Var.n0;
                appCompatButton.getClass();
                return appCompatButton.getVisibility() == 0 ? yk2Var.n0.requestFocus() : yk2Var.m0.requestFocus();
            default:
                return ou7Var.X.n0.requestFocus();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean i() {
        byte b = this.X;
        ou7 ou7Var = this.Y;
        switch (b) {
            case 0:
                return ou7Var.X.m0.requestFocus();
            default:
                return ou7Var.X.n0.requestFocus();
        }
    }
}
