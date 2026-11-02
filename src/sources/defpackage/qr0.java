package defpackage;

import android.graphics.Typeface;
import com.google.android.material.chip.Chip;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class qr0 extends a38 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ qr0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // defpackage.a38
    public final void d(int i) {
        switch (this.a) {
            case 0:
                break;
            default:
                e48 e48Var = (e48) this.b;
                e48Var.d = true;
                d48 d48Var = (d48) e48Var.e.get();
                if (d48Var != null) {
                    d48Var.a();
                }
                break;
        }
    }

    @Override // defpackage.a38
    public final void e(Typeface typeface, boolean z) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                Chip chip = (Chip) obj;
                ur0 ur0Var = chip.j0;
                chip.setText(ur0Var.N1 ? ur0Var.P0 : chip.getText());
                chip.requestLayout();
                chip.invalidate();
                break;
            default:
                if (!z) {
                    e48 e48Var = (e48) obj;
                    e48Var.d = true;
                    d48 d48Var = (d48) e48Var.e.get();
                    if (d48Var != null) {
                        d48Var.a();
                    }
                    break;
                }
                break;
        }
    }

    private final void g(int i) {
    }
}
