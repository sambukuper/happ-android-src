package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class go0 implements hi8 {
    public final hi8 X;
    public final ed1 Y;
    public final int Z;

    public go0(hi8 hi8Var, ed1 ed1Var, int i) {
        this.X = hi8Var;
        this.Y = ed1Var;
        this.Z = i;
    }

    @Override // defpackage.hi8
    public final rt8 D() {
        rt8 rt8VarD = this.X.D();
        rt8VarD.getClass();
        return rt8VarD;
    }

    @Override // defpackage.ed1
    public final Object J(id1 id1Var, Object obj) {
        return this.X.J(id1Var, obj);
    }

    @Override // defpackage.hi8
    public final ve4 Q() {
        ve4 ve4VarQ = this.X.Q();
        ve4VarQ.getClass();
        return ve4VarQ;
    }

    @Override // defpackage.hi8
    public final boolean U() {
        return true;
    }

    @Override // defpackage.ot0
    public final aa7 X() {
        aa7 aa7VarX = this.X.X();
        aa7VarX.getClass();
        return aa7VarX;
    }

    @Override // defpackage.ot0, defpackage.ed1
    public final ot0 a() {
        return this.X.a();
    }

    @Override // defpackage.zk
    public final sm getAnnotations() {
        return this.X.getAnnotations();
    }

    @Override // defpackage.hi8
    public final int getIndex() {
        return this.X.getIndex() + this.Z;
    }

    @Override // defpackage.ed1
    public final v15 getName() {
        v15 name = this.X.getName();
        name.getClass();
        return name;
    }

    @Override // defpackage.gd1
    public final ke7 getSource() {
        ke7 source = this.X.getSource();
        source.getClass();
        return source;
    }

    @Override // defpackage.hi8
    public final List getUpperBounds() {
        List upperBounds = this.X.getUpperBounds();
        upperBounds.getClass();
        return upperBounds;
    }

    @Override // defpackage.hi8, defpackage.ot0
    public final lh8 l() {
        lh8 lh8VarL = this.X.l();
        lh8VarL.getClass();
        return lh8VarL;
    }

    @Override // defpackage.ed1
    public final ed1 p() {
        return this.Y;
    }

    public final String toString() {
        return this.X + "[inner-copy]";
    }

    @Override // defpackage.hi8
    public final boolean y() {
        return this.X.y();
    }

    @Override // defpackage.ed1
    public final ed1 a() {
        return this.X.a();
    }

    @Override // defpackage.hi8, defpackage.ot0, defpackage.ed1
    public final hi8 a() {
        return this.X.a();
    }
}
