package defpackage;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class m44 implements pr5 {
    public static final /* synthetic */ nw3[] h = {new lx5(m44.class, "fqName", "getFqName()Lorg/jetbrains/kotlin/name/FqName;", 0), new lx5(m44.class, "type", "getType()Lorg/jetbrains/kotlin/types/SimpleType;", 0), new lx5(m44.class, "allValueArguments", "getAllValueArguments()Ljava/util/Map;", 0)};
    public final z47 a;
    public final ja6 b;
    public final se4 c;
    public final te4 d;
    public final hr6 e;
    public final te4 f;
    public final boolean g;

    public m44(ja6 ja6Var, z47 z47Var, boolean z) {
        z47Var.getClass();
        ja6Var.getClass();
        this.a = z47Var;
        this.b = ja6Var;
        ve4 ve4Var = (ve4) ((c6) z47Var.Y).f0;
        this.c = new se4(ve4Var, new l44(this, (byte) 0));
        this.d = new te4(ve4Var, new l44(this, (byte) 1));
        this.e = lh4.Z0(ja6Var);
        this.f = new te4(ve4Var, new l44(this, (byte) 2));
        this.g = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final s21 a(ka6 ka6Var) {
        gb6 na6Var;
        t14 t14VarH;
        if (ka6Var instanceof ab6) {
            return pz2.j(null, ((ab6) ka6Var).b);
        }
        if (ka6Var instanceof ya6) {
            Enum r6 = ((ya6) ka6Var).b;
            Class<?> enclosingClass = r6.getClass();
            if (!enclosingClass.isEnum()) {
                enclosingClass = enclosingClass.getEnclosingClass();
            }
            enclosingClass.getClass();
            return new x22(ia6.a(enclosingClass), v15.e(r6.name()));
        }
        boolean z = ka6Var instanceof ma6;
        z47 z47Var = this.a;
        if (z) {
            ma6 ma6Var = (ma6) ka6Var;
            v15 v15Var = ma6Var.a;
            if (v15Var == null) {
                v15Var = ks3.b;
            }
            v15Var.getClass();
            ArrayList arrayListA = ma6Var.a();
            if (!vr3.J((aa7) hi5.e0(this.d, h[1]))) {
                sx4 sx4VarD = el1.d(this);
                sx4VarD.getClass();
                ot8 ot8VarX = ch3.x(v15Var, sx4VarD);
                if (ot8VarX == null || (t14VarH = ot8VarX.c()) == null) {
                    t14VarH = ((wx4) ((c6) z47Var.Y).n0).h0.h(u32.c(s32.UNKNOWN_ARRAY_ELEMENT_TYPE_OF_ANNOTATION_ARGUMENT, new String[0]));
                }
                ArrayList arrayList = new ArrayList(xv0.Z(arrayListA, 10));
                Iterator it = arrayListA.iterator();
                while (it.hasNext()) {
                    s21 s21VarA = a((ka6) it.next());
                    if (s21VarA == null) {
                        s21VarA = new e75(null);
                    }
                    arrayList.add(s21VarA);
                }
                return new gj8(arrayList, t14VarH);
            }
        } else {
            if (ka6Var instanceof la6) {
                return new qm((Object) new m44(new ja6(((la6) ka6Var).b), z47Var, false));
            }
            if (ka6Var instanceof ua6) {
                Class cls = ((ua6) ka6Var).b;
                if (cls.isPrimitive()) {
                    na6Var = new eb6(cls);
                } else if ((cls instanceof GenericArrayType) || cls.isArray()) {
                    na6Var = new na6(cls);
                } else {
                    na6Var = cls instanceof WildcardType ? new jb6((WildcardType) cls) : new va6(cls);
                }
                t14 t14VarC = ((f63) z47Var.g0).C(na6Var, pu.U(zi8.Y, false, null, 7));
                if (!vr3.J(t14VarC)) {
                    t14 t14VarB = t14VarC;
                    int i = 0;
                    while (zz3.z(t14VarB)) {
                        t14VarB = ((ni8) wv0.O0(t14VarB.l0())).b();
                        t14VarB.getClass();
                        i++;
                    }
                    ot0 ot0VarX = t14VarB.n0().x();
                    if (ot0VarX instanceof sx4) {
                        qs0 qs0VarF = el1.f(ot0VarX);
                        return qs0VarF == null ? new kv3(new hv3(t14VarC)) : new kv3(qs0VarF, i);
                    }
                    if (ot0VarX instanceof hi8) {
                        fk2 fk2VarI = tg7.a.i();
                        return new kv3(new qs0(fk2VarI.b(), fk2VarI.a.g()), 0);
                    }
                }
            }
        }
        return null;
    }

    @Override // defpackage.gm
    public final t14 c() {
        return (aa7) hi5.e0(this.d, h[1]);
    }

    @Override // defpackage.gm
    public final fk2 d() {
        nw3 nw3Var = h[0];
        se4 se4Var = this.c;
        se4Var.getClass();
        nw3Var.getClass();
        return (fk2) se4Var.invoke();
    }

    @Override // defpackage.gm
    public final Map e() {
        return (Map) hi5.e0(this.f, h[2]);
    }

    @Override // defpackage.gm
    public final ke7 getSource() {
        return this.e;
    }

    public final String toString() {
        return wk1.c.o(this, null);
    }
}
