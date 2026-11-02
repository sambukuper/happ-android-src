package defpackage;

import android.widget.Button;
import android.widget.EditText;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class td3 implements h91 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ z47 Y;

    public /* synthetic */ td3(z47 z47Var, byte b) {
        this.X = b;
        this.Y = z47Var;
    }

    @Override // defpackage.h91
    public final boolean c() {
        byte b = this.X;
        z47 z47Var = this.Y;
        switch (b) {
            case 0:
                return ((EditText) z47Var.Y).requestFocus();
            case 1:
                Button button = (Button) z47Var.f0;
                button.getClass();
                return button.getVisibility() == 0 ? button.requestFocus() : ((Button) z47Var.g0).requestFocus();
            case 2:
                return ((Button) z47Var.g0).requestFocus();
            default:
                return ((Button) z47Var.g0).requestFocus();
        }
    }

    @Override // defpackage.h91
    public final boolean d() {
        byte b = this.X;
        z47 z47Var = this.Y;
        switch (b) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return ((EditText) z47Var.Y).requestFocus();
    }

    @Override // defpackage.h91
    public final boolean g() {
        byte b = this.X;
        z47 z47Var = this.Y;
        switch (b) {
            case 0:
                return ((Button) z47Var.Z).requestFocus();
            case 1:
                return ((Button) z47Var.Z).requestFocus();
            case 2:
                return ((Button) z47Var.f0).requestFocus();
            default:
                return ((Button) z47Var.g0).requestFocus();
        }
    }

    @Override // defpackage.h91
    public final boolean i() {
        byte b = this.X;
        z47 z47Var = this.Y;
        switch (b) {
            case 0:
                return ((EditText) z47Var.Y).requestFocus();
            case 1:
                return ((Button) z47Var.Z).requestFocus();
            case 2:
                return ((Button) z47Var.Z).requestFocus();
            default:
                Button button = (Button) z47Var.f0;
                button.getClass();
                return button.getVisibility() == 0 ? button.requestFocus() : ((Button) z47Var.Z).requestFocus();
        }
    }
}
