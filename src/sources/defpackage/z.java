package defpackage;

import androidx.appcompat.widget.ActionBarContextView;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class z implements tx8 {
    public boolean a = false;
    public byte b;
    public final /* synthetic */ ActionBarContextView c;

    public z(ActionBarContextView actionBarContextView) {
        this.c = actionBarContextView;
    }

    @Override // defpackage.tx8
    public final void a() {
        this.a = true;
    }

    @Override // defpackage.tx8
    public final void b() {
        super/*android.view.View*/.setVisibility(0);
        this.a = false;
    }

    @Override // defpackage.tx8
    public final void c() {
        if (this.a) {
            return;
        }
        ActionBarContextView actionBarContextView = this.c;
        actionBarContextView.k0 = null;
        super/*android.view.View*/.setVisibility(this.b);
    }
}
