package io.sentry;

import java.util.List;
import java.util.Map;
import java.util.Queue;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public interface g1 {
    io.sentry.protocol.e A();

    b4 B(g4 g4Var);

    String C();

    void D(i4 i4Var);

    void E(io.sentry.protocol.w wVar);

    void F(s1 s1Var);

    List G();

    io.sentry.protocol.i0 H();

    List I();

    String J();

    void K(b4 b4Var);

    void a(g gVar, n0 n0Var);

    io.sentry.protocol.j b();

    void clear();

    g1 clone();

    io.sentry.protocol.w g();

    Map getExtras();

    io.sentry.protocol.r getRequest();

    void h(io.sentry.protocol.w wVar);

    s6 i();

    s1 j();

    d7 k();

    io.sentry.internal.debugmeta.c l();

    void m();

    io.sentry.featureflags.b n();

    q1 o();

    d7 p();

    Queue q();

    s5 r();

    b4 s();

    d7 t(h4 h4Var);

    void u(String str);

    l1 v();

    Map w();

    List x();

    List y();

    void z(j5 j5Var);
}
