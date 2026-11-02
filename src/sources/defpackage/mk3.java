package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class mk3 extends lb6 {
    public final ov3 Y;
    public final Member Z;
    public final Object f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mk3(ov3 ov3Var, Member member, Object obj, yu3 yu3Var) {
        super(yu3Var);
        ov3Var.getClass();
        yu3Var.getClass();
        this.Y = ov3Var;
        this.Z = member;
        this.f0 = obj;
    }

    @Override // defpackage.kb6
    public final ov3 D() {
        return this.Y;
    }

    @Override // defpackage.kb6
    public final Object J() {
        return this.f0;
    }

    @Override // defpackage.wu3
    public final List Q() {
        Member memberB = r().b();
        AnnotatedElement annotatedElement = memberB instanceof AnnotatedElement ? (AnnotatedElement) memberB : null;
        if (annotatedElement == null) {
            return d02.X;
        }
        Annotation[] annotations = annotatedElement.getAnnotations();
        annotations.getClass();
        return ms8.t(eu.K0(annotations));
    }

    @Override // defpackage.kb6
    public final boolean R() {
        int modifiers = this.Z.getModifiers();
        fk2 fk2Var = ms8.a;
        return (Modifier.isPublic(modifiers) || Modifier.isProtected(modifiers) || Modifier.isPrivate(modifiers)) ? false : true;
    }

    @Override // defpackage.xu3
    public final zw3 e() {
        int modifiers = this.Z.getModifiers();
        if (Modifier.isPublic(modifiers)) {
            return zw3.X;
        }
        if (Modifier.isPrivate(modifiers)) {
            return zw3.f0;
        }
        return null;
    }

    @Override // defpackage.xu3, defpackage.pv3
    public final boolean h() {
        return false;
    }

    @Override // defpackage.kb6
    public ex4 m() {
        ex4 ex4Var = this.X.b;
        if (ex4Var != null) {
            return ex4Var;
        }
        Member member = this.Z;
        if (Modifier.isFinal(member.getModifiers()) || w51.D(member)) {
            return ex4.FINAL;
        }
        return Modifier.isAbstract(member.getModifiers()) ? ex4.ABSTRACT : ex4.OPEN;
    }
}
