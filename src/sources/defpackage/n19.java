package defpackage;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class n19 extends m19 {
    public n19(w19 w19Var, WindowInsets windowInsets) {
        super(w19Var, windowInsets);
    }

    @Override // defpackage.t19
    public w19 a() {
        return w19.g(null, this.c.consumeDisplayCutout());
    }

    @Override // defpackage.l19, defpackage.t19
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n19)) {
            return false;
        }
        n19 n19Var = (n19) obj;
        return Objects.equals(this.c, n19Var.c) && Objects.equals(this.g, n19Var.g) && l19.L(this.h, n19Var.h);
    }

    @Override // defpackage.t19
    public up1 g() {
        DisplayCutout displayCutout = this.c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new up1(displayCutout);
    }

    @Override // defpackage.t19
    public int hashCode() {
        return this.c.hashCode();
    }
}
