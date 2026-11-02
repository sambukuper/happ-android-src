package com.google.firebase.datatransport;

import android.content.Context;
import com.google.firebase.components.ComponentRegistrar;
import defpackage.bt;
import defpackage.by0;
import defpackage.cy0;
import defpackage.e26;
import defpackage.em7;
import defpackage.g84;
import defpackage.jb5;
import defpackage.li1;
import defpackage.ny0;
import defpackage.ob0;
import defpackage.re8;
import defpackage.u70;
import defpackage.ue8;
import defpackage.we8;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ue8 lambda$getComponents$0(ny0 ny0Var) {
        we8.b((Context) ny0Var.a(Context.class));
        return we8.a().c(ob0.f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ue8 lambda$getComponents$1(ny0 ny0Var) {
        we8.b((Context) ny0Var.a(Context.class));
        return we8.a().c(ob0.f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ue8 lambda$getComponents$2(ny0 ny0Var) {
        we8.b((Context) ny0Var.a(Context.class));
        return we8.a().c(ob0.e);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<cy0> getComponents() {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(e26.a(ue8.class));
        for (Class cls : new Class[0]) {
            jb5.i(cls, "Null interface");
            hashSet.add(e26.a(cls));
        }
        li1 li1VarA = li1.a(Context.class);
        if (hashSet.contains(li1VarA.a)) {
            bt.q("Components are not allowed to depend on interfaces they themselves provide.");
            return null;
        }
        hashSet2.add(li1VarA);
        cy0 cy0Var = new cy0(LIBRARY_NAME, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new em7((byte) 11), hashSet3);
        by0 by0VarA = cy0.a(new e26(g84.class, ue8.class));
        by0VarA.a(li1.a(Context.class));
        by0VarA.g = new em7((byte) 12);
        cy0 cy0VarB = by0VarA.b();
        by0 by0VarA2 = cy0.a(new e26(re8.class, ue8.class));
        by0VarA2.a(li1.a(Context.class));
        by0VarA2.g = new em7((byte) 13);
        return Arrays.asList(cy0Var, cy0VarB, by0VarA2.b(), u70.C(LIBRARY_NAME, "18.2.0"));
    }
}
