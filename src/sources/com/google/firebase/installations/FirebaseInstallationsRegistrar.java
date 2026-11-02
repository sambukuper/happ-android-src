package com.google.firebase.installations;

import com.google.firebase.components.ComponentRegistrar;
import defpackage.ay0;
import defpackage.b37;
import defpackage.by0;
import defpackage.cy0;
import defpackage.e26;
import defpackage.l60;
import defpackage.li1;
import defpackage.mb2;
import defpackage.nb2;
import defpackage.ny0;
import defpackage.pz2;
import defpackage.qz2;
import defpackage.u00;
import defpackage.u52;
import defpackage.u70;
import defpackage.xa2;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    /* JADX INFO: Access modifiers changed from: private */
    public static nb2 lambda$getComponents$0(ny0 ny0Var) {
        return new mb2((xa2) ny0Var.a(xa2.class), ny0Var.f(qz2.class), (ExecutorService) ny0Var.k(new e26(u00.class, ExecutorService.class)), new b37((Executor) ny0Var.k(new e26(l60.class, Executor.class))));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<cy0> getComponents() {
        byte b = 0;
        by0 by0Var = new by0(nb2.class, new Class[0]);
        by0Var.c = LIBRARY_NAME;
        by0Var.a(li1.a(xa2.class));
        by0Var.a(new li1(0, 1, qz2.class));
        by0Var.a(new li1(new e26(u00.class, ExecutorService.class), 1, 0));
        by0Var.a(new li1(new e26(l60.class, Executor.class), 1, 0));
        by0Var.g = new u52((byte) 9);
        cy0 cy0VarB = by0Var.b();
        pz2 pz2Var = new pz2(b);
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(e26.a(pz2.class));
        return Arrays.asList(cy0VarB, new cy0(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 1, new ay0(pz2Var, b), hashSet3), u70.C(LIBRARY_NAME, "19.1.2"));
    }
}
