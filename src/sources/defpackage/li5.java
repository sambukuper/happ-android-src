package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class li5 {
    public final List a;
    public final List b;

    public li5(List list, List list2) {
        list.getClass();
        list2.getClass();
        this.a = list;
        this.b = list2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(wv0.y0(this.a, ", ", null, null, null, 62));
        sb.append('(');
        return oi0.o(sb, wv0.y0(this.b, ";", null, null, null, 62), ')');
    }
}
