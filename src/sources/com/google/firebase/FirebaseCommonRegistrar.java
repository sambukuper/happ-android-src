package com.google.firebase;

import android.content.Context;
import android.os.Build;
import com.google.firebase.components.ComponentRegistrar;
import defpackage.b24;
import defpackage.b61;
import defpackage.bt;
import defpackage.by0;
import defpackage.cy0;
import defpackage.e26;
import defpackage.jb5;
import defpackage.li1;
import defpackage.pz2;
import defpackage.qz2;
import defpackage.rg1;
import defpackage.ry;
import defpackage.rz2;
import defpackage.se1;
import defpackage.u00;
import defpackage.u52;
import defpackage.u70;
import defpackage.ue1;
import defpackage.xa2;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class FirebaseCommonRegistrar implements ComponentRegistrar {
    public static String a(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        ArrayList arrayList = new ArrayList();
        byte b = 0;
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(e26.a(rg1.class));
        for (Class cls : new Class[0]) {
            jb5.i(cls, "Null interface");
            hashSet.add(e26.a(cls));
        }
        li1 li1Var = new li1(2, 0, ry.class);
        String string = null;
        if (hashSet.contains(li1Var.a)) {
            bt.q("Components are not allowed to depend on interfaces they themselves provide.");
            return null;
        }
        hashSet2.add(li1Var);
        arrayList.add(new cy0(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new b61((byte) 5), hashSet3));
        e26 e26Var = new e26(u00.class, Executor.class);
        by0 by0Var = new by0(ue1.class, qz2.class, rz2.class);
        by0Var.a(li1.a(Context.class));
        by0Var.a(li1.a(xa2.class));
        by0Var.a(new li1(2, 0, pz2.class));
        by0Var.a(new li1(1, 1, rg1.class));
        by0Var.a(new li1(e26Var, 1, 0));
        by0Var.g = new se1(e26Var, b);
        arrayList.add(by0Var.b());
        arrayList.add(u70.C("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(u70.C("fire-core", "22.2.1"));
        arrayList.add(u70.C("device-name", a(Build.PRODUCT)));
        arrayList.add(u70.C("device-model", a(Build.DEVICE)));
        arrayList.add(u70.C("device-brand", a(Build.BRAND)));
        arrayList.add(u70.K("android-target-sdk", new u52((byte) 5)));
        arrayList.add(u70.K("android-min-sdk", new u52((byte) 6)));
        arrayList.add(u70.K("android-platform", new u52((byte) 7)));
        arrayList.add(u70.K("android-installer", new u52((byte) 8)));
        try {
            string = b24.g0.toString();
        } catch (NoClassDefFoundError unused) {
        }
        if (string != null) {
            arrayList.add(u70.C("kotlin", string));
        }
        return arrayList;
    }
}
