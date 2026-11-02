package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class wa6 extends bb6 implements pl3 {
    public final Constructor a;

    public wa6(Constructor constructor) {
        this.a = constructor;
    }

    @Override // defpackage.bb6
    public final Member b() {
        return this.a;
    }

    @Override // defpackage.pl3
    public final ArrayList getTypeParameters() {
        TypeVariable[] typeParameters = this.a.getTypeParameters();
        typeParameters.getClass();
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable typeVariable : typeParameters) {
            arrayList.add(new hb6(typeVariable));
        }
        return arrayList;
    }
}
