package defpackage;

import android.text.Editable;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ez1 extends Editable.Factory {
    public static final Object a = new Object();
    public static volatile ez1 b;
    public static Class c;

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = c;
        return cls != null ? new te7(cls, charSequence) : super.newEditable(charSequence);
    }
}
