package defpackage;

import android.view.textclassifier.TextClassification;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class d38 {
    public final CharSequence a;
    public final long b;
    public final TextClassification c;
    public final ArrayList d;

    public d38(CharSequence charSequence, long j, TextClassification textClassification, ArrayList arrayList) {
        this.a = charSequence;
        this.b = j;
        this.c = textClassification;
        this.d = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d38)) {
            return false;
        }
        d38 d38Var = (d38) obj;
        return dh3.f(this.a, d38Var.a) && f88.a(this.b, d38Var.b) && dh3.f(this.c, d38Var.c) && this.d.equals(d38Var.d);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        int i = f88.c;
        return this.d.hashCode() + ((this.c.hashCode() + p61.g(iHashCode, this.b, 31)) * 31);
    }

    public final String toString() {
        return "TextClassificationResult(text=" + ((Object) this.a) + ", selection=" + f88.f(this.b) + ", textClassification=" + this.c + ", icons=" + this.d + ")";
    }
}
