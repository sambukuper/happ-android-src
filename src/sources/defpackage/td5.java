package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.d;
import androidx.recyclerview.widget.e;
import androidx.recyclerview.widget.j;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class td5 {
    public int a;
    public final Object b;
    public final Object c;

    public td5(j jVar) {
        this.a = Integer.MIN_VALUE;
        this.c = new Rect();
        this.b = jVar;
    }

    public static td5 b(j jVar, int i) {
        if (i == 0) {
            return new d(jVar);
        }
        if (i == 1) {
            return new e(jVar);
        }
        bt.q("invalid orientation");
        return null;
    }

    public void a(qr6 qr6Var) {
        qr6Var.getClass();
        throw new IllegalStateException("NOP delegate should never be called");
    }

    public void c(qr6 qr6Var) {
        qr6Var.getClass();
        throw new IllegalStateException("NOP delegate should never be called");
    }

    public int d(View view) {
        return ((j) this.b).Q(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) view.getLayoutParams())).rightMargin;
    }

    public int e(View view) {
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        ((j) this.b).getClass();
        return j.P(view) + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
    }

    public int f(View view) {
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        ((j) this.b).getClass();
        return j.O(view) + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
    }

    public int g(View view) {
        return ((j) this.b).N(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) view.getLayoutParams())).leftMargin;
    }

    public int h() {
        return ((j) this.b).p0;
    }

    public int i() {
        j jVar = (j) this.b;
        return jVar.p0 - jVar.getPaddingRight();
    }

    public int j() {
        return ((j) this.b).getPaddingRight();
    }

    public int k() {
        return ((j) this.b).n0;
    }

    public int l() {
        return ((j) this.b).o0;
    }

    public int m() {
        return ((j) this.b).getPaddingLeft();
    }

    public int n() {
        j jVar = (j) this.b;
        return (jVar.p0 - jVar.getPaddingLeft()) - jVar.getPaddingRight();
    }

    public int o() {
        if (Integer.MIN_VALUE == this.a) {
            return 0;
        }
        return n() - this.a;
    }

    public int p(View view) {
        j jVar = (j) this.b;
        Rect rect = (Rect) this.c;
        jVar.W(view, rect);
        return rect.right;
    }

    public int q(View view) {
        j jVar = (j) this.b;
        Rect rect = (Rect) this.c;
        jVar.W(view, rect);
        return rect.left;
    }

    public void r(int i) {
        ((j) this.b).c0(i);
    }

    public void s(qr6 qr6Var) {
        qr6Var.getClass();
        throw new IllegalStateException("NOP delegate should never be called");
    }

    public void t(qr6 qr6Var) {
        qr6Var.getClass();
        throw new IllegalStateException("NOP delegate should never be called");
    }

    public void u(qr6 qr6Var) {
        qr6Var.getClass();
        throw new IllegalStateException("NOP delegate should never be called");
    }

    public void v(qr6 qr6Var) {
        qr6Var.getClass();
        throw new IllegalStateException("NOP delegate should never be called");
    }

    public rl6 w(qr6 qr6Var) {
        qr6Var.getClass();
        throw new IllegalStateException("NOP delegate should never be called");
    }

    public td5(String str, int i, String str2) {
        this.a = i;
        this.b = str;
        this.c = str2;
    }
}
