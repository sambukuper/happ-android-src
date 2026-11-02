package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.ComposeView;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.FragmentContainerView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import su.happ.proxyutility.ui.foundation.component.HappSnackbarHost;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class t6 implements ov8, m73 {
    public final /* synthetic */ byte X = 0;
    public final Object Y;
    public final Object Z;
    public final Object f0;
    public Object g0;
    public final Object h0;
    public Object i0;
    public Object j0;
    public Object k0;
    public Object l0;
    public Object m0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, t6] */
    /* JADX WARN: Type inference failed for: r7v7, types: [d02] */
    /* JADX WARN: Type inference failed for: r7v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.util.ArrayList] */
    public t6(vz7 vz7Var, Context context, wx wxVar, dq dqVar, lk0 lk0Var, xd6 xd6Var, bm0 bm0Var) throws pc3 {
        ?? arrayList;
        this.Y = vz7Var;
        this.Z = lk0Var;
        this.f0 = xd6Var;
        this.g0 = bm0Var;
        this.h0 = new vh0((rj0) vz7Var.getValue(), ((rj0) vz7Var.getValue()).b());
        vz7 vz7Var2 = new vz7(new hd(context, wxVar, this, dqVar, (byte) 1));
        this.j0 = vz7Var2;
        this.k0 = m02.X;
        this.l0 = new Object();
        this.m0 = new AtomicBoolean(false);
        ArrayList arrayListA = zh0.a(((l91) vz7Var2.getValue()).a());
        if (arrayListA != null) {
            arrayList = new ArrayList(xv0.Z(arrayListA, 10));
            Iterator it = arrayListA.iterator();
            while (it.hasNext()) {
                arrayList.add(((vi0) it.next()).a);
            }
        } else {
            arrayList = d02.X;
        }
        f76 f76Var = ((re0) ((rj0) ((vz7) this.Y).getValue()).b().d()).b.k;
        Executor executor = wxVar.a;
        executor.getClass();
        this.i0 = new bo5(f76Var, gv3.c(nr4.x(executor)), arrayList, context);
        k(arrayList);
    }

    public static jx4 d(ix4 ix4Var, jx4 jx4Var) {
        jx4 jx4VarA;
        if (ix4Var instanceof qx4) {
            jx4VarA = ((qx4) ix4Var).a();
            jx4VarA.Z = j55.f(jx4VarA);
        } else {
            d10 d10Var = new d10();
            d10Var.Z = j55.d(ix4Var);
            d10Var.q0 = ix4Var;
            d10Var.s0 = new HashSet();
            jx4VarA = d10Var;
        }
        if (jx4VarA.p0) {
            wc3.b("A ModifierNodeElement cannot return an already attached node from create() ");
        }
        jx4VarA.k0 = true;
        jx4 jx4Var2 = jx4Var.h0;
        if (jx4Var2 != null) {
            jx4Var2.g0 = jx4VarA;
            jx4VarA.h0 = jx4Var2;
        }
        jx4Var.h0 = jx4VarA;
        jx4VarA.g0 = jx4Var;
        return jx4VarA;
    }

    public static jx4 e(jx4 jx4Var) {
        boolean z = jx4Var.p0;
        if (z) {
            f05 f05Var = j55.a;
            if (!z) {
                wc3.b("autoInvalidateRemovedNode called on unattached node");
            }
            j55.a(jx4Var, -1, 2);
            jx4Var.V0();
            jx4Var.P0();
        }
        jx4 jx4Var2 = jx4Var.h0;
        jx4 jx4Var3 = jx4Var.g0;
        if (jx4Var2 != null) {
            jx4Var2.g0 = jx4Var3;
            jx4Var.h0 = null;
        }
        if (jx4Var3 != null) {
            jx4Var3.h0 = jx4Var2;
            jx4Var.g0 = null;
        }
        jx4Var3.getClass();
        return jx4Var3;
    }

    public static void p(ix4 ix4Var, ix4 ix4Var2, jx4 jx4Var) {
        if ((ix4Var instanceof qx4) && (ix4Var2 instanceof qx4)) {
            jx4Var.getClass();
            ((qx4) ix4Var2).c(jx4Var);
            if (jx4Var.p0) {
                j55.c(jx4Var);
                return;
            } else {
                jx4Var.l0 = true;
                return;
            }
        }
        if (!(jx4Var instanceof d10)) {
            wc3.b("Unknown Modifier.Node type");
            return;
        }
        d10 d10Var = (d10) jx4Var;
        if (d10Var.p0) {
            d10Var.Z0();
        }
        d10Var.q0 = ix4Var2;
        d10Var.Z = j55.d(ix4Var2);
        if (d10Var.p0) {
            d10Var.Y0(false);
        }
        if (jx4Var.p0) {
            j55.c(jx4Var);
        } else {
            jx4Var.l0 = true;
        }
    }

    @Override // defpackage.m73
    public int a() {
        return ((eb9) this.Z).a();
    }

    @Override // defpackage.m73
    public long b(long j) {
        return ((eb9) this.Y).b(j);
    }

    public LinkedHashSet c(List list) throws pc3 {
        String strR;
        vz7 vz7Var = (vz7) this.j0;
        l91 l91Var = (l91) vz7Var.getValue();
        lk0 lk0Var = (lk0) this.Z;
        List<String> listY0 = wv0.Y0(list);
        xd6 xd6Var = (xd6) this.f0;
        l91Var.getClass();
        try {
            ArrayList arrayList = new ArrayList();
            zh0 zh0VarA = l91Var.a();
            if (lk0Var != null) {
                try {
                    strR = z39.r(zh0VarA, lk0Var.b());
                } catch (IllegalStateException unused) {
                    hi5.i0("CXCP");
                    strR = null;
                }
                ArrayList arrayList2 = new ArrayList();
                for (String str : listY0) {
                    if (!dh3.f(str, strR)) {
                        l91 l91Var2 = l91Var.b;
                        vi0.a(str);
                        aj0 aj0VarS = ((cj0) new n91(l91Var2, new jh0(str), xd6Var).z.get()).s();
                        aj0VarS.getClass();
                        arrayList2.add(aj0VarS);
                    }
                }
                for (xi0 xi0Var : lk0Var.a(arrayList2)) {
                    xi0Var.getClass();
                    String strE = ((aj0) xi0Var).e();
                    strE.getClass();
                    arrayList.add(strE);
                }
                listY0 = arrayList;
            }
            zh0 zh0VarA2 = ((l91) vz7Var.getValue()).a();
            ArrayList arrayList3 = new ArrayList();
            for (String str2 : listY0) {
                if (dh3.f(str2, "0") || dh3.f(str2, "1")) {
                    arrayList3.add(str2);
                } else if (hi5.h0(zh0VarA2, str2)) {
                    arrayList3.add(str2);
                } else {
                    hi5.i0("CXCP");
                }
            }
            return new LinkedHashSet(arrayList3);
        } catch (IllegalStateException e) {
            hi5.j0();
            throw new pc3(e);
        }
    }

    @Override // defpackage.m73
    public long f(long j) {
        return ((eb9) this.Y).f(j);
    }

    public void g(gn2 gn2Var) {
        eb9 eb9Var = (eb9) this.Y;
        eb9Var.Y++;
        ((c15) eb9Var.g0).b(gn2Var);
        eb9Var.k();
    }

    @Override // defpackage.ov8
    public View getRoot() {
        return (RelativeLayout) this.Y;
    }

    public Set h() {
        synchronized (this.l0) {
            if (((AtomicBoolean) this.m0).get()) {
                return m02.X;
            }
            return new LinkedHashSet((Set) this.k0);
        }
    }

    public cj0 i(String str) throws ll0 {
        str.getClass();
        if (((AtomicBoolean) this.m0).get()) {
            throw new ll0("CameraFactory has been shut down.");
        }
        l91 l91Var = ((l91) ((vz7) this.j0).getValue()).b;
        vi0.a(str);
        return (cj0) new n91(l91Var, new jh0(str), (xd6) this.f0).z.get();
    }

    public boolean j(int i) {
        return (((jx4) this.i0).f0 & i) != 0;
    }

    public void k(List list) throws pc3 {
        if (((AtomicBoolean) this.m0).get()) {
            return;
        }
        LinkedHashSet linkedHashSetC = c(list);
        synchronized (this.l0) {
            try {
                if (((AtomicBoolean) this.m0).get()) {
                    return;
                }
                if (dh3.f((Set) this.k0, linkedHashSetC)) {
                    return;
                }
                if (hi5.i0("CXCP")) {
                    Objects.toString((Set) this.k0);
                    linkedHashSetC.toString();
                }
                this.k0 = linkedHashSetC;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void l(jx4 jx4Var, i55 i55Var) {
        for (jx4 jx4Var2 = jx4Var.g0; jx4Var2 != null; jx4Var2 = jx4Var2.g0) {
            if (jx4Var2 == ((d55) this.Z)) {
                LayoutNode layoutNodeW = ((LayoutNode) this.Y).w();
                i55Var.y0 = layoutNodeW != null ? (fd3) layoutNodeW.H0.f0 : null;
                this.g0 = i55Var;
                return;
            } else {
                if ((jx4Var2.Z & 2) != 0) {
                    return;
                }
                jx4Var2.X0(i55Var);
            }
        }
    }

    public void m() {
        for (jx4 jx4Var = (jx4) this.i0; jx4Var != null; jx4Var = jx4Var.h0) {
            jx4Var.U0();
            if (jx4Var.k0) {
                f05 f05Var = j55.a;
                if (!jx4Var.p0) {
                    wc3.b("autoInvalidateInsertedNode called on unattached node");
                }
                j55.a(jx4Var, -1, 1);
            }
            if (jx4Var.l0) {
                j55.c(jx4Var);
            }
            jx4Var.k0 = false;
            jx4Var.l0 = false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:174:0x0149 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:34:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:36:0x0101  */
    /* JADX WARN: Code duplicated, block: B:37:0x0104  */
    /* JADX WARN: Code duplicated, block: B:40:0x0112 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:46:0x0125  */
    /* JADX WARN: Code duplicated, block: B:48:0x012f  */
    /* JADX WARN: Code duplicated, block: B:53:0x0147  */
    /* JADX WARN: Code duplicated, block: B:72:0x0191  */
    /* JADX WARN: Code duplicated, block: B:73:0x0194  */
    /* JADX WARN: Code duplicated, block: B:75:0x0198  */
    /* JADX WARN: Code duplicated, block: B:76:0x019b  */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:78:0x01a7
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    public void n(int r32, defpackage.j05 r33, defpackage.j05 r34, defpackage.jx4 r35, boolean r36) {
        /*
            Method dump skipped, instruction units count: 970
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t6.n(int, j05, j05, jx4, boolean):void");
    }

    public void o() {
        i34 i34Var;
        lf5 lf5Var;
        LayoutNode layoutNode = (LayoutNode) this.Y;
        i55 i55Var = (fd3) this.f0;
        for (jx4 jx4Var = ((f18) this.h0).g0; jx4Var != null; jx4Var = jx4Var.g0) {
            g34 g34VarR = yn0.r(jx4Var);
            if (g34VarR != null) {
                i55 i55Var2 = jx4Var.j0;
                if (i55Var2 != null) {
                    i34Var = (i34) i55Var2;
                    g34 g34Var = i34Var.e1;
                    i34Var.x1(g34VarR);
                    if (g34Var != jx4Var && (lf5Var = i34Var.V0) != null) {
                        ((au2) lf5Var).c();
                    }
                } else {
                    i34Var = new i34(layoutNode, g34VarR);
                    jx4Var.X0(i34Var);
                }
                i55Var.y0 = i34Var;
                i34Var.x0 = i55Var;
                i55Var = i34Var;
            } else {
                jx4Var.X0(i55Var);
            }
        }
        LayoutNode layoutNodeW = layoutNode.w();
        i55Var.y0 = layoutNodeW != null ? (fd3) layoutNodeW.H0.f0 : null;
        this.g0 = i55Var;
    }

    public String toString() {
        switch (this.X) {
            case 3:
                StringBuilder sb = new StringBuilder("[");
                jx4 jx4Var = (jx4) this.i0;
                f18 f18Var = (f18) this.h0;
                if (jx4Var == f18Var) {
                    sb.append("]");
                } else {
                    while (jx4Var != null && jx4Var != f18Var) {
                        sb.append(String.valueOf(jx4Var));
                        if (jx4Var.h0 == f18Var) {
                            sb.append("]");
                        } else {
                            sb.append(",");
                            jx4Var = jx4Var.h0;
                        }
                    }
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public t6(LayoutNode layoutNode) {
        this.Y = layoutNode;
        d55 d55Var = new d55();
        d55Var.f0 = -1;
        this.Z = d55Var;
        fd3 fd3Var = new fd3(layoutNode);
        this.f0 = fd3Var;
        this.g0 = fd3Var;
        f18 f18Var = fd3Var.e1;
        this.h0 = f18Var;
        this.i0 = f18Var;
        this.j0 = new j05();
    }

    public t6(RelativeLayout relativeLayout, ComposeView composeView, FragmentContainerView fragmentContainerView, FragmentContainerView fragmentContainerView2, FragmentContainerView fragmentContainerView3, FragmentContainerView fragmentContainerView4, FragmentContainerView fragmentContainerView5, NestedScrollView nestedScrollView, HappSnackbarHost happSnackbarHost, Toolbar toolbar) {
        this.Y = relativeLayout;
        this.Z = composeView;
        this.f0 = fragmentContainerView;
        this.g0 = fragmentContainerView2;
        this.h0 = fragmentContainerView3;
        this.i0 = fragmentContainerView4;
        this.j0 = fragmentContainerView5;
        this.k0 = nestedScrollView;
        this.l0 = happSnackbarHost;
        this.m0 = toolbar;
    }

    public t6(eb9 eb9Var, kd8 kd8Var, mj0 mj0Var, gn2 gn2Var, f81 f81Var, y78 y78Var, dn2 dn2Var, fw8 fw8Var, gn2 gn2Var2) {
        this.Z = eb9Var;
        this.f0 = kd8Var;
        this.g0 = mj0Var;
        this.h0 = gn2Var;
        this.i0 = f81Var;
        this.j0 = y78Var;
        this.k0 = dn2Var;
        this.l0 = fw8Var;
        this.m0 = gn2Var2;
        this.Y = eb9Var;
    }
}
