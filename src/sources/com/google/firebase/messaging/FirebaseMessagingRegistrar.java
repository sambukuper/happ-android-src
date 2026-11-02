package com.google.firebase.messaging;

import com.google.firebase.components.ComponentRegistrar;
import defpackage.bq7;
import defpackage.bt;
import defpackage.by0;
import defpackage.cy0;
import defpackage.e26;
import defpackage.li1;
import defpackage.nb2;
import defpackage.ny0;
import defpackage.pb2;
import defpackage.re8;
import defpackage.rg1;
import defpackage.rz2;
import defpackage.se1;
import defpackage.u70;
import defpackage.ue8;
import defpackage.xa2;
import io.sentry.c2;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class FirebaseMessagingRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fcm";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ FirebaseMessaging lambda$getComponents$0(e26 e26Var, ny0 ny0Var) {
        xa2 xa2Var = (xa2) ny0Var.a(xa2.class);
        if (ny0Var.a(pb2.class) == null) {
            return new FirebaseMessaging(xa2Var, ny0Var.f(rg1.class), ny0Var.f(rz2.class), (nb2) ny0Var.a(nb2.class), ny0Var.j(e26Var), (bq7) ny0Var.a(bq7.class));
        }
        c2.m();
        return null;
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<cy0> getComponents() {
        e26 e26Var = new e26(re8.class, ue8.class);
        by0 by0Var = new by0(FirebaseMessaging.class, new Class[0]);
        by0Var.c = LIBRARY_NAME;
        by0Var.a(li1.a(xa2.class));
        by0Var.a(new li1(0, 0, pb2.class));
        by0Var.a(new li1(0, 1, rg1.class));
        by0Var.a(new li1(0, 1, rz2.class));
        by0Var.a(li1.a(nb2.class));
        by0Var.a(new li1(e26Var, 0, 1));
        by0Var.a(li1.a(bq7.class));
        by0Var.g = new se1(e26Var, (byte) 1);
        if (by0Var.a) {
            bt.i("Instantiation type has already been set.");
            return null;
        }
        by0Var.a = true;
        return Arrays.asList(by0Var.b(), u70.C(LIBRARY_NAME, "25.1.3"));
    }
}
