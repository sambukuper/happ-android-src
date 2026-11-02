package defpackage;

import java.util.Collections;
import java.util.SortedMap;
import java.util.TreeMap;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class de4 {
    public static final SortedMap c;
    public static final de4 d;
    public SortedMap a;
    public String b;

    static {
        SortedMap sortedMapUnmodifiableSortedMap = Collections.unmodifiableSortedMap(new TreeMap());
        c = sortedMapUnmodifiableSortedMap;
        de4 de4Var = new de4();
        d = de4Var;
        de4Var.b = _UrlKt.FRAGMENT_ENCODE_SET;
        de4Var.a = sortedMapUnmodifiableSortedMap;
        new TreeMap().put('u', wm8.g);
        new TreeMap().put('u', wm8.h);
    }

    public final m62 a(Character ch) {
        return (m62) this.a.get(Character.valueOf(gv3.Y(ch.charValue())));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof de4) {
            return this.b.equals(((de4) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return this.b;
    }
}
