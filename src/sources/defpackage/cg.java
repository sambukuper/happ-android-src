package defpackage;

import android.media.MediaCodec;
import androidx.compose.ui.node.LayoutNode;
import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cg implements Comparator {
    public final /* synthetic */ byte X;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = 0;
        switch (this.X) {
            case 0:
                return dh3.k(((ju5) obj2).a ? 1 : 0, ((ju5) obj).a ? 1 : 0);
            case 1:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr.length != bArr2.length) {
                    return bArr.length - bArr2.length;
                }
                for (int i2 = 0; i2 < bArr.length; i2++) {
                    byte b = bArr[i2];
                    byte b2 = bArr2[i2];
                    if (b != b2) {
                        return b - b2;
                    }
                }
                return 0;
            case 2:
                return dh3.k(((ci3) obj).b, ((ci3) obj2).b);
            case 3:
                kf3 kf3Var = (kf3) obj;
                kf3 kf3Var2 = (kf3) obj2;
                return (kf3Var.Y - kf3Var.X) - (kf3Var2.Y - kf3Var2.X);
            case 4:
                LayoutNode layoutNode = (LayoutNode) obj;
                LayoutNode layoutNode2 = (LayoutNode) obj2;
                float f = layoutNode.I0.p.H0;
                float f2 = layoutNode2.I0.p.H0;
                return f == f2 ? dh3.k(layoutNode.x(), layoutNode2.x()) : Float.compare(f, f2);
            case 5:
                return dh3.k(((f74) obj).a, ((f74) obj2).a);
            case 6:
                return ((zx) obj).a.compareTo(((zx) obj2).a);
            case 7:
                return ((Number) g17.b.K(obj, obj2)).intValue();
            default:
                fz fzVar = (fz) obj2;
                Class cls = ((fz) obj).a.j;
                int i3 = cls == MediaCodec.class ? 2 : (cls == lt5.class || cls == gl7.class) ? 0 : 1;
                Class cls2 = fzVar.a.j;
                if (cls2 == MediaCodec.class) {
                    i = 2;
                } else if (cls2 != lt5.class && cls2 != gl7.class) {
                    i = 1;
                }
                return i3 - i;
        }
    }

    public /* synthetic */ cg(byte b) {
        this.X = b;
    }
}
