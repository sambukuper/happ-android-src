package defpackage;

import android.text.Editable;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class e12 extends z88 {
    public final /* synthetic */ g12 X;

    public e12(g12 g12Var) {
        this.X = g12Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.X.b().a();
    }

    @Override // defpackage.z88, android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.X.b().b();
    }
}
