package com.google.gson.internal.bind;

import defpackage.vg8;
import defpackage.yi8;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
class TypeAdapters$31 implements vg8 {
    public final /* synthetic */ Class X;
    public final /* synthetic */ Class Y;
    public final /* synthetic */ com.google.gson.b Z;

    public TypeAdapters$31(Class cls, Class cls2, com.google.gson.b bVar) {
        this.X = cls;
        this.Y = cls2;
        this.Z = bVar;
    }

    @Override // defpackage.vg8
    public final com.google.gson.b a(com.google.gson.a aVar, yi8 yi8Var) {
        Class cls = yi8Var.a;
        if (cls == this.X || cls == this.Y) {
            return this.Z;
        }
        return null;
    }

    public final String toString() {
        return "Factory[type=" + this.Y.getName() + "+" + this.X.getName() + ",adapter=" + this.Z + "]";
    }
}
