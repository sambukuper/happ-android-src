package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class cy0 {
    public final String a;
    public final Set b;
    public final Set c;
    public final boolean d;
    public final boolean e;
    public final ry0 f;
    public final Set g;

    /* JADX WARN: Multi-variable type inference failed */
    public cy0(String str, Set set, Set set2, int i, int i2, ry0 ry0Var, Set set3) {
        this.a = str;
        this.b = Collections.unmodifiableSet(set);
        this.c = Collections.unmodifiableSet(set2);
        this.d = i;
        this.e = i2;
        this.f = ry0Var;
        this.g = Collections.unmodifiableSet(set3);
    }

    public static by0 a(e26 e26Var) {
        return new by0(e26Var, new e26[0]);
    }

    public static cy0 b(Object obj, Class cls, Class... clsArr) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(e26.a(cls));
        for (Class cls2 : clsArr) {
            jb5.i(cls2, "Null interface");
            hashSet.add(e26.a(cls2));
        }
        return new cy0(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new ay0(obj, (byte) 1), hashSet3);
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.b.toArray()) + ">{" + (this.d ? 1 : 0) + ", type=" + (this.e ? 1 : 0) + ", deps=" + Arrays.toString(this.c.toArray()) + "}";
    }
}
