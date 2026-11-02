package com.google.gson.internal.bind;

import defpackage.vg8;
import defpackage.yi8;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
class TypeAdapters$30 implements vg8 {
    public final /* synthetic */ Class X;
    public final /* synthetic */ com.google.gson.b Y;

    public TypeAdapters$30(Class cls, com.google.gson.b bVar) {
        this.X = cls;
        this.Y = bVar;
    }

    @Override // defpackage.vg8
    public final com.google.gson.b a(com.google.gson.a aVar, yi8 yi8Var) {
        if (yi8Var.a == this.X) {
            return this.Y;
        }
        return null;
    }

    public final String toString() {
        return "Factory[type=" + this.X.getName() + ",adapter=" + this.Y + "]";
    }
}
