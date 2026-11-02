package com.google.gson.internal.bind;

import defpackage.hs3;
import defpackage.nr4;
import defpackage.rq3;
import defpackage.vg8;
import defpackage.yi8;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ArrayTypeAdapter<E> extends com.google.gson.b {
    public static final vg8 c = new vg8() { // from class: com.google.gson.internal.bind.ArrayTypeAdapter.1
        @Override // defpackage.vg8
        public final com.google.gson.b a(com.google.gson.a aVar, yi8 yi8Var) {
            Type type = yi8Var.b;
            boolean z = type instanceof GenericArrayType;
            if (!z && (!(type instanceof Class) || !((Class) type).isArray())) {
                return null;
            }
            Type genericComponentType = z ? ((GenericArrayType) type).getGenericComponentType() : ((Class) type).getComponentType();
            return new ArrayTypeAdapter(aVar, aVar.e(new yi8(genericComponentType)), nr4.A(genericComponentType));
        }
    };
    public final Class a;
    public final com.google.gson.b b;

    public ArrayTypeAdapter(com.google.gson.a aVar, com.google.gson.b bVar, Class cls) {
        this.b = new TypeAdapterRuntimeTypeWrapper(aVar, bVar, cls);
        this.a = cls;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.gson.b
    public final Object b(rq3 rq3Var) throws IOException {
        if (rq3Var.c0() == 9) {
            rq3Var.X();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        rq3Var.Q0();
        while (rq3Var.hasNext()) {
            arrayList.add(((TypeAdapterRuntimeTypeWrapper) this.b).b.b(rq3Var));
        }
        rq3Var.K0();
        int size = arrayList.size();
        Class cls = this.a;
        if (!cls.isPrimitive()) {
            return arrayList.toArray((Object[]) Array.newInstance((Class<?>) cls, size));
        }
        Object objNewInstance = Array.newInstance((Class<?>) cls, size);
        for (int i = 0; i < size; i++) {
            Array.set(objNewInstance, i, arrayList.get(i));
        }
        return objNewInstance;
    }

    @Override // com.google.gson.b
    public final void c(hs3 hs3Var, Object obj) throws IOException {
        if (obj == null) {
            hs3Var.u();
            return;
        }
        hs3Var.Q0();
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            this.b.c(hs3Var, Array.get(obj, i));
        }
        hs3Var.K0();
    }
}
