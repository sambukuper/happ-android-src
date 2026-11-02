package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class kl5 extends ml5 implements u01 {
    public static final kl5 f0 = new kl5(jf8.e, 0);

    @Override // defpackage.ml5, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof q06) {
            return super.containsKey((q06) obj);
        }
        return false;
    }

    @Override // defpackage.b2, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof jt8) {
            return super.containsValue((jt8) obj);
        }
        return false;
    }

    public final kl5 g(q06 q06Var, jt8 jt8Var) {
        h70 h70VarU = this.X.u(q06Var.hashCode(), 0, q06Var, jt8Var);
        return h70VarU == null ? this : new kl5((jf8) h70VarU.Z, this.Y + (h70VarU.Y ? 1 : 0));
    }

    @Override // defpackage.ml5, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (obj instanceof q06) {
            return (jt8) super.get((q06) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof q06) ? obj2 : (jt8) super.getOrDefault((q06) obj, (jt8) obj2);
    }
}
