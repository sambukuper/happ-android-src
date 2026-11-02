package defpackage;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class bl implements t10 {
    public final Object X;
    public boolean Y;
    public final Object Z;
    public Object f0;
    public Object g0;
    public final Object h0;

    public bl(l37 l37Var, z20 z20Var) {
        this.Z = l37Var;
        this.f0 = z20Var;
        ep3 ep3Var = ep3.g0;
        m85 m85Var = z20Var.d;
        ep3 ep3VarA = m85Var != null ? ep3Var.a(m85Var.x(z20Var.e)) : ep3Var;
        Class cls = z20Var.a.j0;
        l37Var.getClass();
        ep3 ep3VarA2 = ep3VarA.a(ep3Var);
        this.h0 = ep3Var.a(ep3VarA2);
        this.Y = ep3VarA2.X == dp3.f0;
        this.X = l37Var.d();
    }

    public static void d(dh8 dh8Var, ArrayList arrayList, boolean z) {
        int length;
        Class cls = dh8Var.j0;
        if (z) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((dh8) arrayList.get(i)).j0 == cls) {
                    return;
                }
            }
            arrayList.add(dh8Var);
            if (cls == List.class || cls == Map.class) {
                return;
            }
        }
        dh8[] dh8VarArr = dh8Var.p0;
        List listAsList = (dh8VarArr == null || (length = dh8VarArr.length) == 0) ? Collections.EMPTY_LIST : length != 1 ? Arrays.asList(dh8VarArr) : Collections.singletonList(dh8VarArr[0]);
        Iterator it = listAsList.iterator();
        while (it.hasNext()) {
            d((dh8) it.next(), arrayList, true);
        }
    }

    public static void e(dh8 dh8Var, ArrayList arrayList, boolean z) {
        int length;
        Class cls = dh8Var.j0;
        if (cls == Object.class || cls == Enum.class) {
            return;
        }
        if (z) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((dh8) arrayList.get(i)).j0 == cls) {
                    return;
                }
            }
            arrayList.add(dh8Var);
        }
        dh8[] dh8VarArr = dh8Var.p0;
        List listAsList = (dh8VarArr == null || (length = dh8VarArr.length) == 0) ? Collections.EMPTY_LIST : length != 1 ? Arrays.asList(dh8VarArr) : Collections.singletonList(dh8VarArr[0]);
        Iterator it = listAsList.iterator();
        while (it.hasNext()) {
            d((dh8) it.next(), arrayList, true);
        }
        dh8 dh8VarE0 = dh8Var.E0();
        if (dh8VarE0 != null) {
            e(dh8VarE0, arrayList, true);
        }
    }

    public static al g(vp4 vp4Var, dh8 dh8Var, vp4 vp4Var2) {
        dh8Var.getClass();
        Class cls = dh8Var.j0;
        if ((dh8Var instanceof cu) && ((wp4) vp4Var).Z.a(cls) == null) {
            return new al(cls);
        }
        bl blVar = new bl(vp4Var, dh8Var, vp4Var2);
        ArrayList arrayList = new ArrayList(8);
        if (!dh8Var.H0(Object.class)) {
            if (cls.isInterface()) {
                d(dh8Var, arrayList, false);
            } else {
                e(dh8Var, arrayList, false);
            }
        }
        return new al(dh8Var, (Class) blVar.g0, arrayList, (Class) blVar.h0, blVar.h(arrayList), (gh8) blVar.f0, (m85) blVar.X, vp4Var2, vp4Var.Y.X, blVar.Y);
    }

    public static al i(vp4 vp4Var, Class cls, vp4 vp4Var2) {
        if (cls.isArray() && (vp4Var == null || ((wp4) vp4Var).Z.a(cls) == null)) {
            return new al(cls);
        }
        bl blVar = new bl(vp4Var, cls, vp4Var2);
        List list = Collections.EMPTY_LIST;
        return new al(null, cls, list, (Class) blVar.h0, blVar.h(list), (gh8) blVar.f0, (m85) blVar.X, vp4Var2, vp4Var.Y.X, blVar.Y);
    }

    @Override // defpackage.t10
    public void A(x11 x11Var) {
        ((rs2) this.h0).m.post(new zo2((byte) 16, this, x11Var, false));
    }

    public ch3 a(ch3 ch3Var, Annotation[] annotationArr) {
        if (annotationArr != null) {
            for (Annotation annotation : annotationArr) {
                if (!ch3Var.L(annotation)) {
                    ch3Var = ch3Var.g(annotation);
                    if (((m85) this.X).W(annotation)) {
                        ch3Var = c(ch3Var, annotation);
                    }
                }
            }
        }
        return ch3Var;
    }

    public ch3 b(ch3 ch3Var, Class cls, Class cls2) {
        if (cls2 != null) {
            ch3Var = a(ch3Var, it0.i(cls2));
            Iterator it = it0.j(cls2, cls, false).iterator();
            while (it.hasNext()) {
                ch3Var = a(ch3Var, it0.i((Class) it.next()));
            }
        }
        return ch3Var;
    }

    public ch3 c(ch3 ch3Var, Annotation annotation) {
        for (Annotation annotation2 : it0.i(annotation.annotationType())) {
            if (!(annotation2 instanceof Target) && !(annotation2 instanceof Retention) && !ch3Var.L(annotation2)) {
                ch3Var = ch3Var.g(annotation2);
                if (((m85) this.X).W(annotation2)) {
                    ch3Var = c(ch3Var, annotation2);
                }
            }
        }
        return ch3Var;
    }

    public dh8 f(gl glVar, boolean z, dh8 dh8Var) {
        m85 m85Var = (m85) this.X;
        dh8 dh8VarA0 = m85Var.a0((l37) this.Z, glVar, dh8Var);
        if (dh8VarA0 != dh8Var) {
            Class<?> cls = dh8VarA0.j0;
            Class<?> cls2 = dh8Var.j0;
            if (!cls.isAssignableFrom(cls2) && !cls2.isAssignableFrom(cls)) {
                u52.p("Illegal concrete-type annotation for method '", glVar.L(), "': class ", cls.getName(), " not a super-type of (declared) class ", cls2.getName());
                return null;
            }
            dh8Var = dh8VarA0;
            z = true;
        }
        wq3 wq3VarH = m85Var.H(glVar);
        if (wq3VarH != null && wq3VarH != wq3.Z) {
            z = wq3VarH == wq3.Y;
        }
        if (z) {
            return dh8Var.R0();
        }
        return null;
    }

    public tm h(List list) {
        boolean z;
        Class cls = (Class) this.g0;
        md0 md0Var = ch3.a;
        boolean z2 = this.Y;
        rs0 rs0Var = (rs0) this.Z;
        if (((m85) this.X) != null) {
            if (rs0Var == null) {
                z = false;
            } else if (rs0Var instanceof u97) {
                z = false;
            } else {
                z = true;
            }
            if (z || z2) {
                ch3 ch3VarB = xl.i;
                Class cls2 = (Class) this.h0;
                if (cls2 != null) {
                    ch3VarB = b(ch3VarB, cls, cls2);
                }
                if (z2) {
                    ch3VarB = a(ch3VarB, it0.i(cls));
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    dh8 dh8Var = (dh8) it.next();
                    if (z) {
                        Class cls3 = dh8Var.j0;
                        ch3VarB = b(ch3VarB, cls3, rs0Var.a(cls3));
                    }
                    if (z2) {
                        ch3VarB = a(ch3VarB, it0.i(dh8Var.j0));
                    }
                }
                if (z) {
                    ch3VarB = b(ch3VarB, Object.class, rs0Var.a(Object.class));
                }
                return ch3VarB.j();
            }
        }
        return md0Var;
    }

    public void j(x11 x11Var) {
        i89 i89Var = (i89) ((rs2) this.h0).j.get((qn) this.Z);
        if (i89Var != null) {
            i89Var.m(x11Var);
        }
    }

    public bl(vp4 vp4Var, dh8 dh8Var, vp4 vp4Var2) {
        Class cls = dh8Var.j0;
        this.g0 = cls;
        this.Z = vp4Var2;
        this.f0 = dh8Var.y0();
        m85 m85VarD = vp4Var.f(xp4.Z) ? vp4Var.d() : null;
        this.X = m85VarD;
        this.h0 = ((wp4) vp4Var2).Z.a(cls);
        this.Y = (m85VarD == null || it0.q(cls)) ? false : true;
    }

    public bl(rs2 rs2Var, is2 is2Var, qn qnVar) {
        Objects.requireNonNull(rs2Var);
        this.h0 = rs2Var;
        this.f0 = null;
        this.g0 = null;
        this.Y = false;
        this.X = is2Var;
        this.Z = qnVar;
    }

    public bl(vp4 vp4Var, Class cls, rs0 rs0Var) {
        this.g0 = cls;
        this.Z = rs0Var;
        this.f0 = gh8.i0;
        Object obj = null;
        if (vp4Var == null) {
            this.X = null;
            this.h0 = null;
        } else {
            m85 m85VarD = vp4Var.f(xp4.Z) ? vp4Var.d() : null;
            this.X = m85VarD;
            this.h0 = rs0Var != null ? rs0Var.a(cls) : null;
            obj = m85VarD;
        }
        this.Y = (obj == null || it0.q(cls)) ? false : true;
    }
}
