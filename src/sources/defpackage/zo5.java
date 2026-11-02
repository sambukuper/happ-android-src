package defpackage;

import android.view.View;
import android.widget.Magnifier;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class zo5 implements wo5 {
    public static final zo5 X = new zo5();

    @Override // defpackage.wo5
    public final vo5 a(View view, boolean z, long j, float f, float f2, boolean z2, fi1 fi1Var, float f3) {
        if (z) {
            return new yo5(new Magnifier(view));
        }
        long jD0 = fi1Var.D0(j);
        float fH0 = fi1Var.h0(f);
        float fH1 = fi1Var.h0(f2);
        Magnifier.Builder builder = new Magnifier.Builder(view);
        if (jD0 != 9205357640488583168L) {
            builder.setSize(nr4.O(Float.intBitsToFloat((int) (jD0 >> 32))), nr4.O(Float.intBitsToFloat((int) (jD0 & 4294967295L))));
        }
        if (!Float.isNaN(fH0)) {
            builder.setCornerRadius(fH0);
        }
        if (!Float.isNaN(fH1)) {
            builder.setElevation(fH1);
        }
        if (!Float.isNaN(f3)) {
            builder.setInitialZoom(f3);
        }
        builder.setClippingEnabled(z2);
        return new yo5(builder.build());
    }
}
