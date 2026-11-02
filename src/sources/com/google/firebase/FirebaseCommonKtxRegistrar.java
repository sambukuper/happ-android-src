package com.google.firebase;

import com.google.firebase.components.ComponentRegistrar;
import defpackage.by0;
import defpackage.cy0;
import defpackage.e26;
import defpackage.i21;
import defpackage.l60;
import defpackage.li1;
import defpackage.oy1;
import defpackage.p94;
import defpackage.pz2;
import defpackage.ql8;
import defpackage.u00;
import defpackage.u61;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/google/firebase/FirebaseCommonKtxRegistrar;", "Lcom/google/firebase/components/ComponentRegistrar;", "<init>", "()V", _UrlKt.FRAGMENT_ENCODE_SET, "Lcy0;", "getComponents", "()Ljava/util/List;", "com.google.firebase-firebase-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<cy0> getComponents() {
        by0 by0VarA = cy0.a(new e26(u00.class, u61.class));
        by0VarA.a(new li1(new e26(u00.class, Executor.class), 1, 0));
        by0VarA.g = pz2.P0;
        cy0 cy0VarB = by0VarA.b();
        by0 by0VarA2 = cy0.a(new e26(p94.class, u61.class));
        by0VarA2.a(new li1(new e26(p94.class, Executor.class), 1, 0));
        by0VarA2.g = oy1.y0;
        cy0 cy0VarB2 = by0VarA2.b();
        by0 by0VarA3 = cy0.a(new e26(l60.class, u61.class));
        by0VarA3.a(new li1(new e26(l60.class, Executor.class), 1, 0));
        by0VarA3.g = pz2.Q0;
        cy0 cy0VarB3 = by0VarA3.b();
        by0 by0VarA4 = cy0.a(new e26(ql8.class, u61.class));
        by0VarA4.a(new li1(new e26(ql8.class, Executor.class), 1, 0));
        by0VarA4.g = oy1.z0;
        return i21.L(cy0VarB, cy0VarB2, cy0VarB3, by0VarA4.b());
    }
}
