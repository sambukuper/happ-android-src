package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class mp4 implements Map.Entry, qv3 {
    public final /* synthetic */ byte X;
    public final Object Y;
    public final Object Z;

    public /* synthetic */ mp4(Object obj, Object obj2, byte b) {
        this.X = b;
        this.Y = obj;
        this.Z = obj2;
    }

    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        Map.Entry entry;
        byte b = this.X;
        Object obj2 = this.Y;
        switch (b) {
            case 0:
                entry = obj instanceof Map.Entry ? (Map.Entry) obj : null;
                return entry != null && dh3.f(entry.getKey(), obj2) && dh3.f(entry.getValue(), getValue());
            case 1:
                entry = obj instanceof Map.Entry ? (Map.Entry) obj : null;
                return entry != null && dh3.f(entry.getKey(), obj2) && dh3.f(entry.getValue(), getValue());
            default:
                return super.equals(obj);
        }
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        switch (this.X) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.Y;
    }

    @Override // java.util.Map.Entry
    public Object getValue() {
        switch (this.X) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.Z;
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        byte b = this.X;
        Object obj = this.Y;
        switch (b) {
            case 0:
                int iHashCode = obj != null ? obj.hashCode() : 0;
                Object value = getValue();
                return iHashCode ^ (value != null ? value.hashCode() : 0);
            case 1:
                int iHashCode2 = obj != null ? obj.hashCode() : 0;
                Object value2 = getValue();
                return iHashCode2 ^ (value2 != null ? value2.hashCode() : 0);
            default:
                return super.hashCode();
        }
    }

    @Override // java.util.Map.Entry
    public Object setValue(Object obj) {
        switch (this.X) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public String toString() {
        byte b = this.X;
        Object obj = this.Y;
        switch (b) {
            case 0:
                return obj + "=" + getValue();
            case 1:
                StringBuilder sb = new StringBuilder();
                sb.append(obj);
                sb.append('=');
                sb.append(getValue());
                return sb.toString();
            default:
                return super.toString();
        }
    }
}
