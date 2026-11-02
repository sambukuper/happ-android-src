package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class c74 {
    public final vz4 a;
    public final z64 b;
    public final i64 c;
    public final long d;
    public final /* synthetic */ i64 e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int g;
    public final /* synthetic */ p8 h;
    public final /* synthetic */ int i;
    public final /* synthetic */ int j;
    public final /* synthetic */ long k;
    public final /* synthetic */ j74 l;

    public c74(long j, z64 z64Var, i64 i64Var, int i, int i2, p8 p8Var, int i3, int i4, long j2, j74 j74Var) {
        this.e = i64Var;
        this.f = i;
        this.g = i2;
        this.h = p8Var;
        this.i = i3;
        this.j = i4;
        this.k = j2;
        this.l = j74Var;
        vz4 vz4Var = gf3.a;
        this.a = new vz4();
        this.b = z64Var;
        this.c = i64Var;
        this.d = s31.b(0, q31.h(j), 0, Integer.MAX_VALUE, 5);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final f74 a(int i, long j) {
        List list;
        z64 z64Var = this.b;
        Object objD = z64Var.d(i);
        Object objB = z64Var.b(i);
        vz4 vz4Var = this.a;
        List list2 = (List) vz4Var.b(i);
        if (list2 != null) {
            list = list2;
        } else {
            i64 i64Var = this.c;
            z64 z64Var2 = i64Var.Z;
            vz4 vz4Var2 = i64Var.f0;
            List listX = (List) vz4Var2.b(i);
            if (listX == null) {
                Object objD2 = z64Var2.d(i);
                listX = i64Var.Y.x(i64Var.X.a(i, objD2, z64Var2.b(i)), objD2);
                vz4Var2.h(i, listX);
            }
            int size = listX.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.add(((tr4) listX.get(i2)).o(j));
            }
            vz4Var.h(i, arrayList);
            list = arrayList;
        }
        return new f74(i, list, this.h, this.e.Y.getLayoutDirection(), this.i, this.j, i != this.f + (-1) ? this.g : 0, this.k, objD, objB, this.l.p0, j);
    }
}
