package com.google.gson.internal.bind;

import defpackage.a85;
import defpackage.hs3;
import defpackage.mj0;
import defpackage.nr4;
import defpackage.rq3;
import defpackage.vg8;
import defpackage.yi8;
import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class CollectionTypeAdapterFactory implements vg8 {
    public final mj0 X;

    /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
    public static final class Adapter<E> extends com.google.gson.b {
        public final com.google.gson.b a;
        public final a85 b;

        public Adapter(com.google.gson.b bVar, a85 a85Var) {
            this.a = bVar;
            this.b = a85Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.gson.b
        public final Object b(rq3 rq3Var) throws IOException {
            if (rq3Var.c0() == 9) {
                rq3Var.X();
                return null;
            }
            Collection collection = (Collection) this.b.d();
            rq3Var.Q0();
            while (rq3Var.hasNext()) {
                collection.add(((TypeAdapterRuntimeTypeWrapper) this.a).b.b(rq3Var));
            }
            rq3Var.K0();
            return collection;
        }

        @Override // com.google.gson.b
        public final void c(hs3 hs3Var, Object obj) throws IOException {
            Collection collection = (Collection) obj;
            if (collection == null) {
                hs3Var.u();
                return;
            }
            hs3Var.Q0();
            Iterator<E> it = collection.iterator();
            while (it.hasNext()) {
                this.a.c(hs3Var, it.next());
            }
            hs3Var.K0();
        }
    }

    public CollectionTypeAdapterFactory(mj0 mj0Var) {
        this.X = mj0Var;
    }

    @Override // defpackage.vg8
    public final com.google.gson.b a(com.google.gson.a aVar, yi8 yi8Var) {
        Type type = yi8Var.b;
        Class cls = yi8Var.a;
        if (!Collection.class.isAssignableFrom(cls)) {
            return null;
        }
        Type typeB = nr4.B(type, cls, Collection.class);
        Type type2 = typeB instanceof ParameterizedType ? ((ParameterizedType) typeB).getActualTypeArguments()[0] : Object.class;
        return new Adapter(new TypeAdapterRuntimeTypeWrapper(aVar, aVar.e(new yi8(type2)), type2), this.X.P(yi8Var, false));
    }
}
