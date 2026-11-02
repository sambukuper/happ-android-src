package defpackage;

import java.util.Arrays;
import java.util.Collection;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class er0 {
    public final v15 a;
    public final kc6 b;
    public final Collection c;
    public final gn2 d;
    public final jq0[] e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public er0(v15 v15Var, jq0[] jq0VarArr, gn2 gn2Var) {
        this(v15Var, null, null, gn2Var, (jq0[]) Arrays.copyOf(jq0VarArr, jq0VarArr.length));
        v15Var.getClass();
    }

    public /* synthetic */ er0(v15 v15Var, jq0[] jq0VarArr) {
        this(v15Var, jq0VarArr, ag.p0);
    }

    public er0(v15 v15Var, kc6 kc6Var, Collection collection, gn2 gn2Var, jq0... jq0VarArr) {
        this.a = v15Var;
        this.b = kc6Var;
        this.c = collection;
        this.d = gn2Var;
        this.e = jq0VarArr;
    }

    public /* synthetic */ er0(Collection collection, jq0[] jq0VarArr) {
        this(collection, jq0VarArr, ag.r0);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public er0(Collection collection, jq0[] jq0VarArr, gn2 gn2Var) {
        this(null, null, collection, gn2Var, (jq0[]) Arrays.copyOf(jq0VarArr, jq0VarArr.length));
        collection.getClass();
    }
}
