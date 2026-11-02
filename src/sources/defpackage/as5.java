package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class as5 implements gn2 {
    public final /* synthetic */ byte X;

    public /* synthetic */ as5(byte b) {
        this.X = b;
    }

    @Override // defpackage.gn2
    public final Object B(Object obj) {
        byte b = this.X;
        dn8 dn8Var = dn8.a;
        switch (b) {
            case 0:
                d97 d97Var = (d97) obj;
                d97Var.getClass();
                d97Var.c("java/lang/Object", bs5.b);
                return dn8Var;
            case 1:
                d97 d97Var2 = (d97) obj;
                d97Var2.getClass();
                d97Var2.c("java/lang/Object", bs5.b);
                return dn8Var;
            default:
                fk2 fk2Var = (fk2) obj;
                if (fk2Var != null) {
                    return Boolean.valueOf(!fk2Var.equals(tg7.y));
                }
                bt.q("Argument for @NotNull parameter 'name' of kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor$1.invoke must not be null");
                return null;
        }
    }
}
