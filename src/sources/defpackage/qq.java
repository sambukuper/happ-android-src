package defpackage;

import android.graphics.Typeface;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class qq {
    public final Typeface a;
    public final String b;
    public final int c;

    public qq(Typeface typeface, String str, int i) {
        this.a = typeface;
        this.b = str;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof qq)) {
            return false;
        }
        qq qqVar = (qq) obj;
        return this.c == qqVar.c && Objects.equals(this.a, qqVar.a) && Objects.equals(this.b, qqVar.b);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, Integer.valueOf(this.c));
    }
}
