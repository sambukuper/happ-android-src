package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class xa0 implements w82 {
    public final /* synthetic */ byte a;
    public final pd5 b;
    public final Object c;

    public /* synthetic */ xa0(Object obj, pd5 pd5Var, byte b) {
        this.a = b;
        this.c = obj;
        this.b = pd5Var;
    }

    @Override // defpackage.w82
    public final Object a(l12 l12Var) {
        byte b = this.a;
        ma1 ma1Var = ma1.Y;
        Object obj = this.c;
        pd5 pd5Var = this.b;
        switch (b) {
            case 0:
                i90 i90Var = new i90();
                byte[] bArr = (byte[]) obj;
                bArr.getClass();
                i90Var.write(bArr, 0, bArr.length);
                return new le7(vj8.j(i90Var, pd5Var.f), null, ma1Var);
            case 1:
                ByteBuffer byteBuffer = (ByteBuffer) obj;
                return new le7(new me7(new j76(new za0(byteBuffer)), pd5Var.f, new ab0(byteBuffer)), null, ma1Var);
            default:
                Drawable bitmapDrawable = (Drawable) obj;
                Bitmap.Config[] configArr = at8.a;
                boolean z = (bitmapDrawable instanceof VectorDrawable) || (bitmapDrawable instanceof eu8);
                if (z) {
                    bitmapDrawable = new BitmapDrawable(pd5Var.a.getResources(), ci8.o(bitmapDrawable, b73.a(pd5Var), pd5Var.b, pd5Var.c, (ta7) z68.G(pd5Var, y63.b), pd5Var.d == tr5.Y));
                }
                return new b63(z39.h(bitmapDrawable), z, ma1Var);
        }
    }
}
