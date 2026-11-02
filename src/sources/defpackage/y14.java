package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class y14 extends w79 {
    public static final y14 i = new y14();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [qg3] */
    /* JADX WARN: Type inference failed for: r0v2, types: [qg3] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r4v0, types: [hi8] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v3 */
    public static aa7 S(aa7 aa7Var) {
        t14 t14VarB;
        lh8 lh8VarN0 = aa7Var.n0();
        ?? r4 = 0;
        if (lh8VarN0 instanceof co0) {
            co0 co0Var = (co0) lh8VarN0;
            ni8 ni8Var = co0Var.X;
            ni8 ni8Var2 = ni8Var.a() == rt8.IN_VARIANCE ? ni8Var : null;
            mo8 mo8VarQ0 = (ni8Var2 == null || (t14VarB = ni8Var2.b()) == null) ? null : t14VarB.q0();
            d45 d45Var = co0Var.Y;
            if (d45Var == null) {
                Collection collectionC = co0Var.c();
                ArrayList arrayList = new ArrayList(xv0.Z(collectionC, 10));
                Iterator it = collectionC.iterator();
                while (it.hasNext()) {
                    arrayList.add(((t14) it.next()).q0());
                }
                d45Var = new d45(ni8Var, new pl1(arrayList, (byte) 1), (hi8) r4, 8);
                co0Var.Y = d45Var;
            }
            return new c45(un0.X, d45Var, mo8VarQ0, aa7Var.m0(), aa7Var.o0(), 32);
        }
        if (!(lh8VarN0 instanceof qg3) || !aa7Var.o0()) {
            return aa7Var;
        }
        ?? r0 = (qg3) lh8VarN0;
        LinkedHashSet linkedHashSet = r0.Y;
        ArrayList arrayList2 = new ArrayList(xv0.Z(linkedHashSet, 10));
        Iterator it2 = linkedHashSet.iterator();
        boolean z = false;
        while (it2.hasNext()) {
            arrayList2.add(y08.j((t14) it2.next()));
            z = true;
        }
        if (z) {
            t14 t14Var = r0.X;
            mo8 mo8VarJ = t14Var != null ? y08.j(t14Var) : null;
            arrayList2.isEmpty();
            LinkedHashSet linkedHashSet2 = new LinkedHashSet(arrayList2);
            linkedHashSet2.hashCode();
            qg3 qg3Var = new qg3(linkedHashSet2);
            qg3Var.X = mo8VarJ;
            r4 = qg3Var;
        }
        if (r4 != 0) {
            r0 = r4;
        }
        return r0.a();
    }

    @Override // defpackage.w79
    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public final mo8 L(x14 x14Var) {
        mo8 mo8VarS;
        x14Var.getClass();
        if (!(x14Var instanceof t14)) {
            bt.q("Failed requirement.");
            return null;
        }
        mo8 mo8VarQ0 = ((t14) x14Var).q0();
        if (mo8VarQ0 instanceof aa7) {
            mo8VarS = S((aa7) mo8VarQ0);
        } else {
            if (!(mo8VarQ0 instanceof ce2)) {
                b61.c();
                return null;
            }
            ce2 ce2Var = (ce2) mo8VarQ0;
            aa7 aa7Var = ce2Var.Z;
            aa7 aa7Var2 = ce2Var.Y;
            aa7 aa7VarS = S(aa7Var2);
            aa7 aa7VarS2 = S(aa7Var);
            mo8VarS = (aa7VarS == aa7Var2 && aa7VarS2 == aa7Var) ? mo8VarQ0 : dh3.s(aa7VarS, aa7VarS2);
        }
        d0 d0Var = new d0(1, this, y14.class, "prepareType", "prepareType(Lorg/jetbrains/kotlin/types/model/KotlinTypeMarker;)Lkotlin/reflect/jvm/internal/impl/types/UnwrappedType;", 0, (byte) 18);
        t14 t14VarE = c18.e(mo8VarQ0);
        return c18.h(mo8VarS, t14VarE != null ? (t14) d0Var.B(t14VarE) : null);
    }
}
