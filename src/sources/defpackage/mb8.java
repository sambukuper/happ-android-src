package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class mb8 {
    public final int a;
    public final String b;
    public final List c;
    public final List d;

    public mb8(int i, String str, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5) {
        this.a = i;
        this.b = str;
        this.c = Collections.unmodifiableList(arrayList);
        Collections.unmodifiableList(arrayList2);
        Collections.unmodifiableList(arrayList3);
        this.d = Collections.unmodifiableList(arrayList4);
        Collections.unmodifiableList(arrayList5);
    }
}
