package defpackage;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class r3 extends ClickableSpan {
    public final int X;
    public final h4 Y;
    public final int Z;

    public r3(int i, h4 h4Var, int i2) {
        this.X = i;
        this.Y = h4Var;
        this.Z = i2;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.X);
        this.Y.a.performAction(this.Z, bundle);
    }
}
