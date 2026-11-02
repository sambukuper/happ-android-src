package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class cl6 {
    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof cl6);
    }

    public final int hashCode() {
        return Float.hashCode(0.1f) + pc6.d(pc6.d(Float.hashCode(0.16f) * 31, 0.1f, 31), 0.08f, 31);
    }

    public final String toString() {
        return "RippleAlpha(draggedAlpha=0.16, focusedAlpha=0.1, hoveredAlpha=0.08, pressedAlpha=0.1)";
    }
}
