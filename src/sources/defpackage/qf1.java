package defpackage;

import java.io.IOException;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.IdentityHashMap;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class qf1 extends t37 implements Serializable {
    public transient AbstractMap o0;
    public transient ArrayList p0;
    public transient eq2 q0;

    public static IOException E(eq2 eq2Var, Exception exc) {
        if (exc instanceof IOException) {
            return (IOException) exc;
        }
        String strH = it0.h(exc);
        if (strH == null) {
            strH = "[no message for " + exc.getClass().getName() + "]";
        }
        return new pp3(eq2Var, strH, exc);
    }

    @Override // defpackage.t37
    public final ar3 D(vj8 vj8Var, Object obj) throws nh3 {
        ar3 ar3Var;
        if (obj instanceof ar3) {
            ar3Var = (ar3) obj;
        } else {
            if (!(obj instanceof Class)) {
                vj8Var.Q();
                A("AnnotationIntrospector returned serializer definition of type " + obj.getClass().getName() + "; expected type JsonSerializer or Class<JsonSerializer> instead");
                throw null;
            }
            Class cls = (Class) obj;
            if (cls == zq3.class || it0.p(cls)) {
                return null;
            }
            if (!ar3.class.isAssignableFrom(cls)) {
                vj8Var.Q();
                A("AnnotationIntrospector returned Class " + cls.getName() + "; expected Class<JsonSerializer>");
                throw null;
            }
            l37 l37Var = this.X;
            l37Var.getClass();
            ar3Var = (ar3) it0.g(cls, l37Var.f(xp4.q0));
        }
        if (ar3Var instanceof h50) {
            ((h50) ar3Var).t(this);
        }
        return ar3Var;
    }

    public final void F(eq2 eq2Var, Object obj) {
        this.q0 = eq2Var;
        Class<?> cls = obj.getClass();
        ar3 ar3VarO = o(cls);
        l37 l37Var = this.X;
        l37Var.getClass();
        if (!l37Var.j(n37.Z)) {
            try {
                ar3VarO.e(obj, eq2Var, this);
                return;
            } catch (Exception e) {
                throw E(eq2Var, e);
            }
        }
        c24 c24Var = l37Var.h0;
        ss0 ss0Var = new ss0(cls);
        c24 c24Var2 = (c24) c24Var.X;
        jx5 jx5VarC = (jx5) ((wu5) c24Var2.X).get(ss0Var);
        if (jx5VarC == null) {
            dh8 dh8VarC = l37Var.c(cls);
            ((b30) l37Var.Y.Y).getClass();
            z20 z20VarE0 = b30.E0(l37Var, dh8VarC);
            if (z20VarE0 == null) {
                z20VarE0 = z20.d(l37Var, dh8VarC, bl.g(l37Var, dh8VarC, l37Var));
            }
            jx5VarC = l37Var.d().C(z20VarE0.e);
            if (jx5VarC == null || jx5VarC.X.isEmpty()) {
                jx5VarC = jx5.a(cls.getSimpleName());
            }
            ((wu5) c24Var2.X).g(ss0Var, jx5VarC, false);
        }
        try {
            eq2Var.Z0();
            String str = jx5VarC.X;
            r37 r37Var = jx5VarC.Z;
            if (r37Var == null) {
                r37Var = l37Var == null ? new r37(str) : new r37(str);
                jx5VarC.Z = r37Var;
            }
            eq2Var.R(r37Var);
            ar3VarO.e(obj, eq2Var, this);
            eq2Var.J();
        } catch (Exception e2) {
            throw E(eq2Var, e2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0061  */
    /* JADX WARN: Code duplicated, block: B:29:0x0067  */
    @Override // defpackage.t37
    public final p59 l(Object obj, ex5 ex5Var) {
        d85 d85Var;
        d85 d85Var2;
        AbstractMap abstractMap = this.o0;
        if (abstractMap == null) {
            this.o0 = this.X.j(n37.z0) ? new HashMap() : new IdentityHashMap();
        } else {
            p59 p59Var = (p59) abstractMap.get(obj);
            if (p59Var != null) {
                return p59Var;
            }
        }
        ArrayList arrayList = this.p0;
        if (arrayList != null) {
            int size = arrayList.size();
            int i = 0;
            while (true) {
                if (i < size) {
                    d85Var = (d85) this.p0.get(i);
                    ex5 ex5Var2 = (ex5) d85Var;
                    ex5Var2.getClass();
                    if (ex5Var.X == ex5Var2.X && ex5Var.Y == ex5Var2.Y) {
                        break;
                    }
                    i++;
                }
            }
            if (d85Var == null) {
                this.p0.add(ex5Var);
                d85Var2 = ex5Var;
            } else {
                d85Var2 = d85Var;
            }
            p59 p59Var2 = new p59(d85Var2);
            this.o0.put(obj, p59Var2);
            return p59Var2;
        }
        this.p0 = new ArrayList(8);
        d85Var = null;
        if (d85Var == null) {
            this.p0.add(ex5Var);
            d85Var2 = ex5Var;
        } else {
            d85Var2 = d85Var;
        }
        p59 p59Var3 = new p59(d85Var2);
        this.o0.put(obj, p59Var3);
        return p59Var3;
    }

    @Override // defpackage.t37
    public final boolean x(Object obj) throws nh3 {
        if (obj == null) {
            return true;
        }
        try {
            return obj.equals(null);
        } catch (Exception e) {
            String name = obj.getClass().getName();
            String name2 = e.getClass().getName();
            String strH = it0.h(e);
            StringBuilder sbT = oi0.t("Problem determining whether filter of type '", name, "' should filter out `null` values: (", name2, ") ");
            sbT.append(strH);
            String string = sbT.toString();
            Class<?> cls = obj.getClass();
            eq2 eq2Var = this.q0;
            s().b(null, cls, uh8.f0);
            nh3 nh3Var = new nh3(eq2Var, string);
            nh3Var.initCause(e);
            throw nh3Var;
        }
    }
}
