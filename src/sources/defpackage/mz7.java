package defpackage;

import androidx.appcompat.widget.SwitchCompat;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class mz7 extends vy1 {
    public final WeakReference X;

    public mz7(SwitchCompat switchCompat) {
        this.X = new WeakReference(switchCompat);
    }

    @Override // defpackage.vy1
    public final void a() {
        SwitchCompat switchCompat = (SwitchCompat) this.X.get();
        if (switchCompat != null) {
            switchCompat.c();
        }
    }

    @Override // defpackage.vy1
    public final void b() {
        SwitchCompat switchCompat = (SwitchCompat) this.X.get();
        if (switchCompat != null) {
            switchCompat.c();
        }
    }
}
