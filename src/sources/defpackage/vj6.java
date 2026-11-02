package defpackage;

import java.util.EnumMap;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class vj6 {
    public final String a;
    public EnumMap b;

    public vj6(String str) {
        System.currentTimeMillis();
        this.a = str;
        this.b = null;
    }

    public final void a(wj6 wj6Var, Object obj) {
        EnumMap enumMap = this.b;
        if (enumMap == null) {
            enumMap = new EnumMap(wj6.class);
            this.b = enumMap;
        }
        enumMap.put(wj6Var, obj);
    }

    public final String toString() {
        return this.a;
    }
}
