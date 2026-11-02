package defpackage;

import java.util.List;
import okhttp3.dnsoverhttps.DnsOverHttps;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class hl1 {
    public final ve4 a;
    public final vx4 b;
    public final pz2 c;
    public final is0 d;
    public final vl e;
    public final wf5 f;
    public final pz2 g;
    public final l32 h;
    public final qe4 i;
    public final de2 j;
    public final Iterable k;
    public final z47 l;
    public final be m;
    public final i7 n;
    public final po5 o;
    public final r62 p;
    public final p45 q;
    public final List r;
    public final m22 s;
    public final os0 t;

    public hl1(ve4 ve4Var, vx4 vx4Var, is0 is0Var, vl vlVar, wf5 wf5Var, l32 l32Var, de2 de2Var, Iterable iterable, z47 z47Var, i7 i7Var, po5 po5Var, r62 r62Var, p45 p45Var, g55 g55Var, List list, m22 m22Var) {
        pz2 pz2Var = pz2.I0;
        pz2 pz2Var2 = pz2.Y0;
        qe4 qe4Var = qe4.Z;
        vx4Var.getClass();
        r62Var.getClass();
        p45Var.getClass();
        m22Var.getClass();
        this.a = ve4Var;
        this.b = vx4Var;
        this.c = pz2Var;
        this.d = is0Var;
        this.e = vlVar;
        this.f = wf5Var;
        this.g = pz2Var2;
        this.h = l32Var;
        this.i = qe4Var;
        this.j = de2Var;
        this.k = iterable;
        this.l = z47Var;
        this.m = t51.a;
        this.n = i7Var;
        this.o = po5Var;
        this.p = r62Var;
        this.q = p45Var;
        this.r = list;
        this.s = m22Var;
        this.t = new os0(this);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public hl1(ve4 ve4Var, vx4 vx4Var, vk1 vk1Var, dq dqVar, wf5 wf5Var, Iterable iterable, z47 z47Var, i7 i7Var, po5 po5Var, r62 r62Var, p45 p45Var, g55 g55Var, int i) {
        p45 p45Var2;
        pz2 pz2Var = pz2.R0;
        m22 m22Var = oy1.G0;
        if ((i & DnsOverHttps.MAX_RESPONSE_SIZE) != 0) {
            p45.b.getClass();
            p45Var2 = o45.b;
        } else {
            p45Var2 = p45Var;
        }
        this(ve4Var, vx4Var, vk1Var, dqVar, wf5Var, l32.n, pz2Var, iterable, z47Var, i7Var, po5Var, r62Var, p45Var2, g55Var, i21.K(qg1.a), (i & 524288) != 0 ? pz2.O0 : m22Var);
    }
}
