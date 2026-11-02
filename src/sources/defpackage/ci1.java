package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ci1 implements u27 {
    public final CharSequence a;
    public final int b;
    public final rn2 c;

    public ci1(CharSequence charSequence, int i, rn2 rn2Var) {
        charSequence.getClass();
        this.a = charSequence;
        this.b = i;
        this.c = rn2Var;
    }

    @Override // defpackage.u27
    public final Iterator iterator() {
        return new bi1(this);
    }
}
