package defpackage;

import java.io.Serializable;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class bq2 extends d2 implements Serializable {
    public static aq2 g(d2 d2Var, d2 d2Var2, int i, a39 a39Var, Class cls) {
        return new aq2(d2Var, Collections.EMPTY_LIST, d2Var2, new zp2(i, a39Var, true), cls);
    }

    public static aq2 h(d2 d2Var, Object obj, d2 d2Var2, int i, a39 a39Var, Class cls) {
        return new aq2(d2Var, obj, d2Var2, new zp2(i, a39Var, false), cls);
    }
}
