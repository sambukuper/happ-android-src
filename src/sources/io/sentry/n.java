package io.sentry;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class n implements g1 {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;
    public final Object d;

    public /* synthetic */ n(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // io.sentry.g1
    public io.sentry.protocol.e A() {
        g1 g1Var = (g1) this.b;
        return new l(g1Var.A(), ((g1) this.c).A(), ((g1) this.d).A(), g1Var.i().getDefaultScopeType());
    }

    @Override // io.sentry.g1
    public b4 B(g4 g4Var) {
        return d(null).B(g4Var);
    }

    @Override // io.sentry.g1
    public String C() {
        String strC = ((g1) this.d).C();
        if (strC != null) {
            return strC;
        }
        String strC2 = ((g1) this.c).C();
        return strC2 != null ? strC2 : ((g1) this.b).C();
    }

    @Override // io.sentry.g1
    public void D(i4 i4Var) {
        d(null).D(i4Var);
    }

    @Override // io.sentry.g1
    public void E(io.sentry.protocol.w wVar) {
        ((g1) this.b).E(wVar);
        ((g1) this.c).E(wVar);
        ((g1) this.d).E(wVar);
    }

    @Override // io.sentry.g1
    public void F(s1 s1Var) {
        d(null).F(s1Var);
    }

    @Override // io.sentry.g1
    public List G() {
        List listG = ((g1) this.d).G();
        if (!listG.isEmpty()) {
            return listG;
        }
        List listG2 = ((g1) this.c).G();
        return !listG2.isEmpty() ? listG2 : ((g1) this.b).G();
    }

    @Override // io.sentry.g1
    public io.sentry.protocol.i0 H() {
        io.sentry.protocol.i0 i0VarH = ((g1) this.d).H();
        if (i0VarH != null) {
            return i0VarH;
        }
        io.sentry.protocol.i0 i0VarH2 = ((g1) this.c).H();
        return i0VarH2 != null ? i0VarH2 : ((g1) this.b).H();
    }

    @Override // io.sentry.g1
    public List I() {
        return io.sentry.util.b.y((CopyOnWriteArrayList) x());
    }

    @Override // io.sentry.g1
    public String J() {
        String strJ = ((g1) this.d).J();
        if (strJ != null) {
            return strJ;
        }
        String strJ2 = ((g1) this.c).J();
        return strJ2 != null ? strJ2 : ((g1) this.b).J();
    }

    @Override // io.sentry.g1
    public void K(b4 b4Var) {
        d(null).K(b4Var);
    }

    @Override // io.sentry.g1
    public void a(g gVar, n0 n0Var) {
        d(null).a(gVar, n0Var);
    }

    @Override // io.sentry.g1
    public io.sentry.protocol.j b() {
        return n().b();
    }

    public Object c(Object obj, Object obj2, Object obj3) {
        int i = m.a[((g1) this.b).i().getDefaultScopeType().ordinal()];
        if (i != 2) {
            return i != 3 ? obj3 : obj;
        }
        return obj2;
    }

    @Override // io.sentry.g1
    public void clear() {
        d(null).clear();
    }

    @Override // io.sentry.g1
    public g1 clone() {
        return new n((g1) this.b, ((g1) this.c).clone(), ((g1) this.d).clone(), (byte) 0);
    }

    public g1 d(n4 n4Var) {
        g1 g1Var = (g1) this.c;
        g1 g1Var2 = (g1) this.d;
        g1 g1Var3 = (g1) this.b;
        if (n4Var != null) {
            int i = m.a[n4Var.ordinal()];
            if (i == 1) {
                return g1Var2;
            }
            if (i == 2) {
                return g1Var;
            }
            if (i == 3) {
                return g1Var3;
            }
            if (i == 4) {
                return this;
            }
        }
        int i2 = m.a[g1Var3.i().getDefaultScopeType().ordinal()];
        if (i2 == 1) {
            return g1Var2;
        }
        if (i2 != 2) {
            return i2 != 3 ? g1Var2 : g1Var3;
        }
        return g1Var;
    }

    @Override // io.sentry.g1
    public io.sentry.protocol.w g() {
        io.sentry.protocol.w wVarG = ((g1) this.d).g();
        io.sentry.protocol.w wVar = io.sentry.protocol.w.Y;
        if (!wVar.equals(wVarG)) {
            return wVarG;
        }
        io.sentry.protocol.w wVarG2 = ((g1) this.c).g();
        return !wVar.equals(wVarG2) ? wVarG2 : ((g1) this.b).g();
    }

    @Override // io.sentry.g1
    public Map getExtras() {
        Map extras = ((g1) this.b).getExtras();
        Map extras2 = ((g1) this.c).getExtras();
        Map extras3 = ((g1) this.d).getExtras();
        boolean zIsEmpty = extras.isEmpty();
        boolean zIsEmpty2 = extras2.isEmpty();
        boolean zIsEmpty3 = extras3.isEmpty();
        if (zIsEmpty && zIsEmpty2 && zIsEmpty3) {
            return (Map) c(extras, extras2, extras3);
        }
        if (zIsEmpty2 && zIsEmpty3) {
            return extras;
        }
        if (zIsEmpty && zIsEmpty3) {
            return extras2;
        }
        if (zIsEmpty && zIsEmpty2) {
            return extras3;
        }
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        concurrentHashMap.putAll(extras);
        concurrentHashMap.putAll(extras2);
        concurrentHashMap.putAll(extras3);
        return concurrentHashMap;
    }

    @Override // io.sentry.g1
    public io.sentry.protocol.r getRequest() {
        io.sentry.protocol.r request = ((g1) this.d).getRequest();
        if (request != null) {
            return request;
        }
        io.sentry.protocol.r request2 = ((g1) this.c).getRequest();
        return request2 != null ? request2 : ((g1) this.b).getRequest();
    }

    @Override // io.sentry.g1
    public void h(io.sentry.protocol.w wVar) {
        d(null).h(wVar);
    }

    @Override // io.sentry.g1
    public s6 i() {
        return ((g1) this.b).i();
    }

    @Override // io.sentry.g1
    public s1 j() {
        s1 s1VarJ = ((g1) this.d).j();
        if (s1VarJ != null) {
            return s1VarJ;
        }
        s1 s1VarJ2 = ((g1) this.c).j();
        return s1VarJ2 != null ? s1VarJ2 : ((g1) this.b).j();
    }

    @Override // io.sentry.g1
    public d7 k() {
        return d(null).k();
    }

    @Override // io.sentry.g1
    public io.sentry.internal.debugmeta.c l() {
        return d(null).l();
    }

    @Override // io.sentry.g1
    public void m() {
        d(null).m();
    }

    @Override // io.sentry.g1
    public io.sentry.featureflags.b n() {
        s6 s6VarI = ((g1) this.b).i();
        io.sentry.featureflags.b bVarN = ((g1) this.b).n();
        io.sentry.featureflags.b bVarN2 = ((g1) this.c).n();
        io.sentry.featureflags.b bVarN3 = ((g1) this.d).n();
        io.sentry.featureflags.c cVar = io.sentry.featureflags.c.X;
        int maxFeatureFlags = s6VarI.getMaxFeatureFlags();
        if (maxFeatureFlags > 0) {
            io.sentry.featureflags.a aVar = bVarN instanceof io.sentry.featureflags.a ? (io.sentry.featureflags.a) bVarN : null;
            io.sentry.featureflags.a aVar2 = bVarN2 instanceof io.sentry.featureflags.a ? (io.sentry.featureflags.a) bVarN2 : null;
            io.sentry.featureflags.a aVar3 = bVarN3 instanceof io.sentry.featureflags.a ? (io.sentry.featureflags.a) bVarN3 : null;
            List list = aVar == null ? null : aVar.X;
            List list2 = aVar2 == null ? null : aVar2.X;
            List list3 = aVar3 == null ? null : aVar3.X;
            int size = list == null ? 0 : list.size();
            int size2 = list2 == null ? 0 : list2.size();
            int size3 = list3 != null ? list3.size() : 0;
            if (size != 0 || size2 != 0 || size3 != 0) {
                int i = size - 1;
                int i2 = size2 - 1;
                int i3 = size3 - 1;
                if (list != null && i >= 0 && list.get(i) != null) {
                    c2.m();
                    return null;
                }
                if (list2 != null && i2 >= 0 && list2.get(i2) != null) {
                    c2.m();
                    return null;
                }
                if (list3 != null && i3 >= 0 && list3.get(i3) != null) {
                    c2.m();
                    return null;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(maxFeatureFlags);
                linkedHashMap.size();
                ArrayList arrayList = new ArrayList(linkedHashMap.values());
                Collections.reverse(arrayList);
                return new io.sentry.featureflags.a(maxFeatureFlags, Collections.unmodifiableList(arrayList));
            }
        }
        return cVar;
    }

    @Override // io.sentry.g1
    public q1 o() {
        q1 q1VarO = ((g1) this.d).o();
        if (q1VarO != null) {
            return q1VarO;
        }
        q1 q1VarO2 = ((g1) this.c).o();
        return q1VarO2 != null ? q1VarO2 : ((g1) this.b).o();
    }

    @Override // io.sentry.g1
    public d7 p() {
        d7 d7VarP = ((g1) this.d).p();
        if (d7VarP != null) {
            return d7VarP;
        }
        d7 d7VarP2 = ((g1) this.c).p();
        return d7VarP2 != null ? d7VarP2 : ((g1) this.b).p();
    }

    @Override // io.sentry.g1
    public Queue q() {
        Queue queueQ = ((g1) this.b).q();
        Queue queueQ2 = ((g1) this.c).q();
        g1 g1Var = (g1) this.d;
        Queue queueQ3 = g1Var.q();
        boolean zIsEmpty = queueQ.isEmpty();
        boolean zIsEmpty2 = queueQ2.isEmpty();
        boolean zIsEmpty3 = queueQ3.isEmpty();
        if (zIsEmpty && zIsEmpty2 && zIsEmpty3) {
            return (Queue) c(queueQ, queueQ2, queueQ3);
        }
        if (zIsEmpty2 && zIsEmpty3) {
            return queueQ;
        }
        if (zIsEmpty && zIsEmpty3) {
            return queueQ2;
        }
        if (zIsEmpty && zIsEmpty2) {
            return queueQ3;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(queueQ);
        arrayList.addAll(queueQ2);
        arrayList.addAll(queueQ3);
        Collections.sort(arrayList);
        Queue queueC = j4.c(g1Var.i().getMaxBreadcrumbs());
        queueC.addAll(arrayList);
        return queueC;
    }

    @Override // io.sentry.g1
    public s5 r() {
        s5 s5VarR = ((g1) this.d).r();
        if (s5VarR != null) {
            return s5VarR;
        }
        s5 s5VarR2 = ((g1) this.c).r();
        return s5VarR2 != null ? s5VarR2 : ((g1) this.b).r();
    }

    @Override // io.sentry.g1
    public b4 s() {
        return d(null).s();
    }

    @Override // io.sentry.g1
    public d7 t(h4 h4Var) {
        return d(null).t(h4Var);
    }

    @Override // io.sentry.g1
    public void u(String str) {
        d(null).u(str);
    }

    @Override // io.sentry.g1
    public l1 v() {
        l1 l1VarV = ((g1) this.d).v();
        if (!(l1VarV instanceof h3)) {
            return l1VarV;
        }
        l1 l1VarV2 = ((g1) this.c).v();
        return !(l1VarV2 instanceof h3) ? l1VarV2 : ((g1) this.b).v();
    }

    @Override // io.sentry.g1
    public Map w() {
        Map mapW = ((g1) this.b).w();
        Map mapW2 = ((g1) this.c).w();
        Map mapW3 = ((g1) this.d).w();
        boolean zIsEmpty = mapW.isEmpty();
        boolean zIsEmpty2 = mapW2.isEmpty();
        boolean zIsEmpty3 = mapW3.isEmpty();
        if (zIsEmpty && zIsEmpty2 && zIsEmpty3) {
            return (Map) c(mapW, mapW2, mapW3);
        }
        if (zIsEmpty2 && zIsEmpty3) {
            return mapW;
        }
        if (zIsEmpty && zIsEmpty3) {
            return mapW2;
        }
        if (zIsEmpty && zIsEmpty2) {
            return mapW3;
        }
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        concurrentHashMap.putAll(mapW);
        concurrentHashMap.putAll(mapW2);
        concurrentHashMap.putAll(mapW3);
        return concurrentHashMap;
    }

    @Override // io.sentry.g1
    public List x() {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        copyOnWriteArrayList.addAll(((g1) this.b).x());
        copyOnWriteArrayList.addAll(((g1) this.c).x());
        copyOnWriteArrayList.addAll(((g1) this.d).x());
        Collections.sort(copyOnWriteArrayList);
        return copyOnWriteArrayList;
    }

    @Override // io.sentry.g1
    public List y() {
        List listY = ((g1) this.b).y();
        List listY2 = ((g1) this.c).y();
        List listY3 = ((g1) this.d).y();
        boolean zIsEmpty = listY.isEmpty();
        boolean zIsEmpty2 = listY2.isEmpty();
        boolean zIsEmpty3 = listY3.isEmpty();
        if (zIsEmpty && zIsEmpty2 && zIsEmpty3) {
            return (List) c(listY, listY2, listY3);
        }
        if (zIsEmpty2 && zIsEmpty3) {
            return listY;
        }
        if (zIsEmpty && zIsEmpty3) {
            return listY2;
        }
        if (zIsEmpty && zIsEmpty2) {
            return listY3;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        copyOnWriteArrayList.addAll(listY);
        copyOnWriteArrayList.addAll(listY2);
        copyOnWriteArrayList.addAll(listY3);
        return copyOnWriteArrayList;
    }

    @Override // io.sentry.g1
    public void z(j5 j5Var) {
        ((g1) this.b).z(j5Var);
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m15clone() {
        switch (this.a) {
            case 0:
                return clone();
            default:
                return super.clone();
        }
    }
}
