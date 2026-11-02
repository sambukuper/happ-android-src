package defpackage;

import androidx.appcompat.widget.AppCompatTextView;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class vq extends wl6 {
    public final /* synthetic */ AppCompatTextView j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vq(AppCompatTextView appCompatTextView) {
        super((Object) appCompatTextView, (byte) 8);
        this.j0 = appCompatTextView;
    }

    @Override // defpackage.wl6, defpackage.uq
    public final void E(int i) {
        super/*android.widget.TextView*/.setFirstBaselineToTopHeight(i);
    }

    @Override // defpackage.wl6, defpackage.uq
    public final void y(int i) {
        super/*android.widget.TextView*/.setLastBaselineToBottomHeight(i);
    }
}
