package com.google.gson.internal.bind;

import defpackage.hs3;
import defpackage.rq3;
import defpackage.yi8;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
final class TypeAdapterRuntimeTypeWrapper<T> extends com.google.gson.b {
    public final com.google.gson.a a;
    public final com.google.gson.b b;
    public final Type c;

    public TypeAdapterRuntimeTypeWrapper(com.google.gson.a aVar, com.google.gson.b bVar, Type type) {
        this.a = aVar;
        this.b = bVar;
        this.c = type;
    }

    @Override // com.google.gson.b
    public final Object b(rq3 rq3Var) {
        return this.b.b(rq3Var);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x003c  */
    @Override // com.google.gson.b
    public final void c(hs3 hs3Var, Object obj) {
        com.google.gson.b bVarD;
        Type type = this.c;
        Type type2 = (obj == null || !((type instanceof Class) || (type instanceof TypeVariable))) ? type : obj.getClass();
        com.google.gson.b bVar = this.b;
        if (type2 != type) {
            com.google.gson.b bVarE = this.a.e(new yi8(type2));
            if (bVarE instanceof ReflectiveTypeAdapterFactory.Adapter) {
                com.google.gson.b bVar2 = bVar;
                while ((bVar2 instanceof SerializationDelegatingTypeAdapter) && (bVarD = ((SerializationDelegatingTypeAdapter) bVar2).d()) != bVar2) {
                    bVar2 = bVarD;
                }
                if (bVar2 instanceof ReflectiveTypeAdapterFactory.Adapter) {
                    bVar = bVarE;
                }
            } else {
                bVar = bVarE;
            }
        }
        bVar.c(hs3Var, obj);
    }
}
