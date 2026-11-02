package com.google.android.datatransport.cct;

import android.content.Context;
import defpackage.ay;
import defpackage.m71;
import defpackage.se8;
import defpackage.so0;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class CctBackendFactory {
    public se8 create(m71 m71Var) {
        Context context = ((ay) m71Var).a;
        ay ayVar = (ay) m71Var;
        return new so0(context, ayVar.b, ayVar.c);
    }
}
