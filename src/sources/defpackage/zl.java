package defpackage;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class zl implements tm, Serializable, d50, g44 {
    public final /* synthetic */ byte X = 4;
    public Object Y;
    public Object Z;

    public zl(Class cls, r37[] r37VarArr) {
        this.Y = cls;
        this.Z = r37VarArr;
    }

    public static zl f(vp4 vp4Var, al alVar) {
        m85 m85VarD = vp4Var.d();
        boolean zE = vp4Var.e(r22.WRITE_ENUMS_TO_LOWERCASE);
        Class cls = alVar.C0;
        Annotation[] annotationArr = it0.a;
        Enum[] enumArr = (Enum[]) (cls.getSuperclass() != Enum.class ? cls.getSuperclass() : cls).getEnumConstants();
        if (enumArr == null) {
            bt.q("No enum constants for class ".concat(cls.getName()));
            return null;
        }
        String[] strArrF = m85VarD.f(alVar, enumArr, new String[enumArr.length]);
        r37[] r37VarArr = new r37[enumArr.length];
        int length = enumArr.length;
        for (int i = 0; i < length; i++) {
            Enum r5 = enumArr[i];
            String lowerCase = strArrF[i];
            String strName = r5.name();
            if (lowerCase == null) {
                lowerCase = zE ? strName.toLowerCase() : strName;
            }
            r37VarArr[r5.ordinal()] = new r37(lowerCase);
        }
        return new zl(cls, r37VarArr);
    }

    @Override // defpackage.tm
    public Annotation a(Class cls) {
        if (((Class) this.Y) == cls) {
            return (Annotation) this.Z;
        }
        return null;
    }

    @Override // defpackage.d50
    public gl b() {
        return (gl) this.Z;
    }

    @Override // defpackage.d50
    public no3 c(vp4 vp4Var, Class cls) {
        no3 no3VarH;
        ((wp4) vp4Var).getClass();
        no3 no3Var = no3.k0;
        m85 m85VarD = vp4Var.d();
        gl glVar = (gl) this.Z;
        return (glVar == null || (no3VarH = m85VarD.h(glVar)) == null) ? no3Var : no3Var.c(no3VarH);
    }

    @Override // defpackage.g44
    public boolean d() {
        return this.Z != lh4.L0;
    }

    @Override // defpackage.d50
    public ep3 e(vp4 vp4Var, Class cls) {
        Class cls2 = ((dh8) this.Y).j0;
        ((wp4) vp4Var).getClass();
        ep3 ep3Var = ep3.g0;
        m85 m85VarD = vp4Var.d();
        gl glVar = (gl) this.Z;
        return glVar == null ? ep3Var : ep3Var.a(m85VarD.x(glVar));
    }

    public boolean g(Object obj) {
        Set set = (Set) this.Z;
        return !(set == null || set.contains(obj)) || ((Set) this.Y).contains(obj);
    }

    @Override // defpackage.g44
    public Object getValue() {
        Object obj = this.Z;
        if (obj != lh4.L0) {
            return obj;
        }
        dn2 dn2Var = (dn2) this.Y;
        dn2Var.getClass();
        Object objInvoke = dn2Var.invoke();
        this.Z = objInvoke;
        this.Y = null;
        return objInvoke;
    }

    @Override // defpackage.tm
    public int size() {
        return 1;
    }

    public String toString() {
        switch (this.X) {
            case 4:
                return d() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
            default:
                return super.toString();
        }
    }

    public /* synthetic */ zl() {
    }

    public zl(Set set, Set set2) {
        this.Y = set == null ? Collections.EMPTY_SET : set;
        this.Z = set2;
    }

    public zl(Class cls, Annotation annotation) {
        this.Y = cls;
        this.Z = annotation;
    }

    public zl(dh8 dh8Var, gl glVar, ix5 ix5Var) {
        this.Y = dh8Var;
        this.Z = glVar;
    }
}
