package defpackage;

import java.lang.reflect.Type;
import java.util.Collection;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class eb6 extends gb6 {
    public final Class a;

    public eb6(Class cls) {
        this.a = cls;
    }

    @Override // defpackage.gb6
    public final Type b() {
        return this.a;
    }

    @Override // defpackage.vj3
    public final Collection getAnnotations() {
        return d02.X;
    }
}
