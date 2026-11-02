package com.google.firebase.concurrent;

import android.os.Build;
import android.os.StrictMode;
import com.google.firebase.components.ComponentRegistrar;
import defpackage.b61;
import defpackage.by0;
import defpackage.cy0;
import defpackage.e26;
import defpackage.h44;
import defpackage.jb5;
import defpackage.l60;
import defpackage.o81;
import defpackage.p94;
import defpackage.ql8;
import defpackage.u00;
import defpackage.u52;
import defpackage.vh1;
import defpackage.vy0;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class ExecutorsRegistrar implements ComponentRegistrar {
    public static final h44 a = new h44(new vy0((byte) 1));
    public static final h44 b = new h44(new vy0((byte) 2));
    public static final h44 c = new h44(new vy0((byte) 3));
    public static final h44 d = new h44(new vy0((byte) 4));

    public static vh1 a() {
        StrictMode.ThreadPolicy.Builder builderDetectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
        builderDetectNetwork.detectResourceMismatches();
        if (Build.VERSION.SDK_INT >= 26) {
            builderDetectNetwork.detectUnbufferedIo();
        }
        return new vh1(Executors.newFixedThreadPool(4, new o81("Firebase Background", 10, builderDetectNetwork.penaltyLog().build())), (ScheduledExecutorService) d.get());
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        e26 e26Var = new e26(u00.class, ScheduledExecutorService.class);
        e26[] e26VarArr = {new e26(u00.class, ExecutorService.class), new e26(u00.class, Executor.class)};
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(e26Var);
        for (int i = 0; i < 2; i++) {
            jb5.i(e26VarArr[i], "Null interface");
        }
        Collections.addAll(hashSet, e26VarArr);
        cy0 cy0Var = new cy0(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new b61((byte) 27), hashSet3);
        e26 e26Var2 = new e26(l60.class, ScheduledExecutorService.class);
        e26[] e26VarArr2 = {new e26(l60.class, ExecutorService.class), new e26(l60.class, Executor.class)};
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        HashSet hashSet6 = new HashSet();
        hashSet4.add(e26Var2);
        for (int i2 = 0; i2 < 2; i2++) {
            jb5.i(e26VarArr2[i2], "Null interface");
        }
        Collections.addAll(hashSet4, e26VarArr2);
        cy0 cy0Var2 = new cy0(null, new HashSet(hashSet4), new HashSet(hashSet5), 0, 0, new b61((byte) 28), hashSet6);
        e26 e26Var3 = new e26(p94.class, ScheduledExecutorService.class);
        e26[] e26VarArr3 = {new e26(p94.class, ExecutorService.class), new e26(p94.class, Executor.class)};
        HashSet hashSet7 = new HashSet();
        HashSet hashSet8 = new HashSet();
        HashSet hashSet9 = new HashSet();
        hashSet7.add(e26Var3);
        for (int i3 = 0; i3 < 2; i3++) {
            jb5.i(e26VarArr3[i3], "Null interface");
        }
        Collections.addAll(hashSet7, e26VarArr3);
        cy0 cy0Var3 = new cy0(null, new HashSet(hashSet7), new HashSet(hashSet8), 0, 0, new b61((byte) 29), hashSet9);
        by0 by0VarA = cy0.a(new e26(ql8.class, Executor.class));
        by0VarA.g = new u52((byte) 0);
        return Arrays.asList(cy0Var, cy0Var2, cy0Var3, by0VarA.b());
    }
}
