package com.google.gson;

import com.google.gson.internal.bind.SerializationDelegatingTypeAdapter;
import defpackage.bt;
import defpackage.hs3;
import defpackage.rq3;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
class Gson$FutureTypeAdapter<T> extends SerializationDelegatingTypeAdapter<T> {
    public b a = null;

    @Override // com.google.gson.b
    public final Object b(rq3 rq3Var) {
        b bVar = this.a;
        if (bVar != null) {
            return bVar.b(rq3Var);
        }
        bt.i("Adapter for type with cyclic dependency has been used before dependency has been resolved");
        return null;
    }

    @Override // com.google.gson.b
    public final void c(hs3 hs3Var, Object obj) {
        b bVar = this.a;
        if (bVar != null) {
            bVar.c(hs3Var, obj);
        } else {
            bt.i("Adapter for type with cyclic dependency has been used before dependency has been resolved");
        }
    }

    @Override // com.google.gson.internal.bind.SerializationDelegatingTypeAdapter
    public final b d() {
        b bVar = this.a;
        if (bVar != null) {
            return bVar;
        }
        bt.i("Adapter for type with cyclic dependency has been used before dependency has been resolved");
        return null;
    }
}
