package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class vk8 extends wt5 {
    public long[] a;
    public int b;

    @Override // defpackage.wt5
    public final Object a() {
        return new uk8(Arrays.copyOf(this.a, this.b));
    }

    @Override // defpackage.wt5
    public final void b(int i) {
        long[] jArr = this.a;
        if (jArr.length < i) {
            int length = jArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.a = Arrays.copyOf(jArr, i);
        }
    }

    @Override // defpackage.wt5
    public final int d() {
        return this.b;
    }
}
