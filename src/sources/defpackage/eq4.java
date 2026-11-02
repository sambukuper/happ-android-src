package defpackage;

import java.util.Iterator;
import java.util.regex.Matcher;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class eq4 extends z0 {
    public final /* synthetic */ byte X;
    public final Object Y;

    public /* synthetic */ eq4(Object obj, byte b) {
        this.X = b;
        this.Y = obj;
    }

    @Override // defpackage.z0
    public final int a() {
        byte b = this.X;
        Object obj = this.Y;
        switch (b) {
            case 0:
                return ((fq4) obj).a.groupCount() + 1;
            default:
                return ((ml5) obj).Y;
        }
    }

    public cq4 b(int i) {
        Matcher matcher = ((fq4) this.Y).a;
        kf3 kf3VarA0 = x97.a0(matcher.start(i), matcher.end(i));
        if (kf3VarA0.X < 0) {
            return null;
        }
        String strGroup = matcher.group(i);
        strGroup.getClass();
        return new cq4(strGroup, kf3VarA0);
    }

    @Override // defpackage.z0, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.X) {
            case 0:
                if (obj == null ? true : obj instanceof cq4) {
                    return super.contains((cq4) obj);
                }
                return false;
            default:
                return ((ml5) this.Y).containsValue(obj);
        }
    }

    @Override // defpackage.z0, java.util.Collection
    public boolean isEmpty() {
        switch (this.X) {
            case 0:
                return false;
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.X) {
            case 0:
                return new ld8(w27.l0(new hu(i21.C(this), (byte) 1), new vj2((Object) this, (byte) 17)));
            default:
                jf8 jf8Var = ((ml5) this.Y).X;
                kf8[] kf8VarArr = new kf8[8];
                for (int i = 0; i < 8; i++) {
                    kf8VarArr[i] = new mf8((byte) 2);
                }
                return new am5(jf8Var, kf8VarArr);
        }
    }
}
