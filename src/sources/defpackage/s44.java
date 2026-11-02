package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class s44 implements gn2 {
    public final /* synthetic */ byte X;
    public final t44 Y;

    public /* synthetic */ s44(t44 t44Var, byte b) {
        this.X = b;
        this.Y = t44Var;
    }

    @Override // defpackage.gn2
    public final Object B(Object obj) {
        byte b = this.X;
        t44 t44Var = this.Y;
        v15 v15Var = (v15) obj;
        switch (b) {
            case 0:
                v15Var.getClass();
                return t44Var.N(v15Var);
            default:
                v15Var.getClass();
                return t44Var.O(v15Var);
        }
    }
}
