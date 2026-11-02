package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class hp4 {
    public int X;
    public int Y;
    public int Z;
    public Object f0;

    public hp4() {
        if (f08.Y == null) {
            f08.Y = new f08((byte) 10);
        }
    }

    public int a(int i) {
        if (i < this.Z) {
            return ((ByteBuffer) this.f0).getShort(this.Y + i);
        }
        return 0;
    }

    public void b() {
        if (((ip4) this.f0).j0 == this.Z) {
            return;
        }
        bt.c();
    }

    public void c() {
        while (true) {
            int i = this.X;
            ip4 ip4Var = (ip4) this.f0;
            if (i >= ip4Var.h0 || ip4Var.Z[i] >= 0) {
                return;
            } else {
                this.X = i + 1;
            }
        }
    }

    public boolean hasNext() {
        return this.X < ((ip4) this.f0).h0;
    }

    public void remove() {
        ip4 ip4Var = (ip4) this.f0;
        b();
        if (this.Y == -1) {
            bt.i("Call next() before removing element from the iterator.");
            return;
        }
        ip4Var.c();
        ip4Var.n(this.Y);
        this.Y = -1;
        this.Z = ip4Var.j0;
    }
}
