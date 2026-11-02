package okhttp3.internal.idn;

import defpackage.aa0;
import defpackage.dh3;
import defpackage.kp5;
import kotlin.Metadata;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B!\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u000e\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0013\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017¨\u0006\u001a"}, d2 = {"Lokhttp3/internal/idn/IdnaMappingTable;", _UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET, "sections", "ranges", "mappings", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", _UrlKt.FRAGMENT_ENCODE_SET, "codePoint", "findSectionsIndex", "(I)I", "position", "limit", "findRangesOffset", "(III)I", "Laa0;", "sink", _UrlKt.FRAGMENT_ENCODE_SET, "map", "(ILaa0;)Z", "Ljava/lang/String;", "getSections", "()Ljava/lang/String;", "getRanges", "getMappings", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class IdnaMappingTable {
    private final String mappings;
    private final String ranges;
    private final String sections;

    public IdnaMappingTable(String str, String str2, String str3) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        this.sections = str;
        this.ranges = str2;
        this.mappings = str3;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0025  */
    /* JADX WARN: Code duplicated, block: B:13:0x0028  */
    private final int findRangesOffset(int codePoint, int position, int limit) {
        int i;
        int i2 = codePoint & 127;
        int i3 = limit - 1;
        while (position <= i3) {
            i = (position + i3) / 2;
            int iK = dh3.k(i2, this.ranges.charAt(i * 4));
            if (iK < 0) {
                i3 = i - 1;
            } else {
                if (iK <= 0) {
                    return i >= 0 ? i * 4 : ((-i) - 2) * 4;
                }
                position = i + 1;
            }
        }
        i = (-position) - 1;
        if (i >= 0) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0032  */
    /* JADX WARN: Code duplicated, block: B:13:0x0035  */
    private final int findSectionsIndex(int codePoint) {
        int i;
        int i2 = (codePoint & 2097024) >> 7;
        int length = (this.sections.length() / 4) - 1;
        int i3 = 0;
        while (i3 <= length) {
            i = (i3 + length) / 2;
            int iK = dh3.k(i2, IdnaMappingTableKt.read14BitInt(this.sections, i * 4));
            if (iK < 0) {
                length = i - 1;
            } else {
                if (iK <= 0) {
                    return i >= 0 ? i * 4 : ((-i) - 2) * 4;
                }
                i3 = i + 1;
            }
        }
        i = (-i3) - 1;
        if (i >= 0) {
        }
    }

    public final String getMappings() {
        return this.mappings;
    }

    public final String getRanges() {
        return this.ranges;
    }

    public final String getSections() {
        return this.sections;
    }

    public final boolean map(int codePoint, aa0 sink) {
        sink.getClass();
        int iFindSectionsIndex = findSectionsIndex(codePoint);
        int iFindRangesOffset = findRangesOffset(codePoint, IdnaMappingTableKt.read14BitInt(this.sections, iFindSectionsIndex + 2), iFindSectionsIndex + 4 < this.sections.length() ? IdnaMappingTableKt.read14BitInt(this.sections, iFindSectionsIndex + 6) : this.ranges.length() / 4);
        char cCharAt = this.ranges.charAt(iFindRangesOffset + 1);
        if (cCharAt >= 0 && cCharAt < '@') {
            int i = IdnaMappingTableKt.read14BitInt(this.ranges, iFindRangesOffset + 2);
            sink.t0(i, cCharAt + i, this.mappings);
            return true;
        }
        if ('@' <= cCharAt && cCharAt < 'P') {
            sink.w(codePoint - (this.ranges.charAt(iFindRangesOffset + 3) | (((cCharAt & 15) << 14) | (this.ranges.charAt(iFindRangesOffset + 2) << 7))));
            return true;
        }
        if ('P' <= cCharAt && cCharAt < '`') {
            sink.w(codePoint + (this.ranges.charAt(iFindRangesOffset + 3) | ((cCharAt & 15) << 14) | (this.ranges.charAt(iFindRangesOffset + 2) << 7)));
            return true;
        }
        if (cCharAt == 'w') {
            return true;
        }
        if (cCharAt == 'x') {
            sink.w(codePoint);
            return true;
        }
        if (cCharAt == 'y') {
            sink.w(codePoint);
            return false;
        }
        if (cCharAt == 'z') {
            sink.writeByte(this.ranges.charAt(iFindRangesOffset + 2));
            return true;
        }
        if (cCharAt == '{') {
            sink.writeByte(this.ranges.charAt(iFindRangesOffset + 2) | 128);
            return true;
        }
        if (cCharAt == '|') {
            sink.writeByte(this.ranges.charAt(iFindRangesOffset + 2));
            sink.writeByte(this.ranges.charAt(iFindRangesOffset + 3));
            return true;
        }
        if (cCharAt == '}') {
            sink.writeByte(this.ranges.charAt(iFindRangesOffset + 2) | 128);
            sink.writeByte(this.ranges.charAt(iFindRangesOffset + 3));
            return true;
        }
        if (cCharAt == '~') {
            sink.writeByte(this.ranges.charAt(iFindRangesOffset + 2));
            sink.writeByte(this.ranges.charAt(iFindRangesOffset + 3) | 128);
            return true;
        }
        if (cCharAt != 127) {
            kp5.g(codePoint, "unexpected rangesIndex for ");
            return false;
        }
        sink.writeByte(this.ranges.charAt(iFindRangesOffset + 2) | 128);
        sink.writeByte(this.ranges.charAt(iFindRangesOffset + 3) | 128);
        return true;
    }
}
