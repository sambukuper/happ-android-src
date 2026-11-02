package defpackage;

import java.util.AbstractMap;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class vu5 extends AbstractMap.SimpleEntry {
    public final /* synthetic */ wu5 X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vu5(wu5 wu5Var, su5 su5Var) {
        super(su5Var.X, su5Var.a());
        this.X = wu5Var;
    }

    @Override // java.util.AbstractMap.SimpleEntry, java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.X.g(getKey(), obj, false);
        return super.setValue(obj);
    }
}
