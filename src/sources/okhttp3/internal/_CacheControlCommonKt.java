package okhttp3.internal;

import defpackage.be;
import defpackage.fm7;
import defpackage.gx1;
import defpackage.lx1;
import defpackage.mm7;
import defpackage.vj8;
import kotlin.Metadata;
import okhttp3.CacheControl;
import okhttp3.Headers;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\u0003\u001a\u00020\u0004*\u00020\u0005H\u0000\u001a\f\u0010\u0006\u001a\u00020\u0002*\u00020\u0007H\u0000\u001a\f\u0010\b\u001a\u00020\u0002*\u00020\u0007H\u0000\u001a\f\u0010\t\u001a\u00020\u0002*\u00020\nH\u0000\u001a\f\u0010\u000b\u001a\u00020\n*\u00020\nH\u0000\u001a\f\u0010\f\u001a\u00020\n*\u00020\nH\u0000\u001a\f\u0010\r\u001a\u00020\n*\u00020\nH\u0000\u001a\f\u0010\u000e\u001a\u00020\n*\u00020\nH\u0000\u001a\f\u0010\u000f\u001a\u00020\n*\u00020\nH\u0000\u001a\u0014\u0010\u0010\u001a\u00020\u0002*\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0012H\u0000\u001a\u001e\u0010\u0013\u001a\u00020\u0004*\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u00012\b\b\u0002\u0010\u0015\u001a\u00020\u0004H\u0002¨\u0006\u0016"}, d2 = {"commonToString", _UrlKt.FRAGMENT_ENCODE_SET, "Lokhttp3/CacheControl;", "commonClampToInt", _UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET, "commonForceNetwork", "Lokhttp3/CacheControl$Companion;", "commonForceCache", "commonBuild", "Lokhttp3/CacheControl$Builder;", "commonNoCache", "commonNoStore", "commonOnlyIfCached", "commonNoTransform", "commonImmutable", "commonParse", "headers", "Lokhttp3/Headers;", "indexOfElement", "characters", "startIndex", "okhttp"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class _CacheControlCommonKt {
    public static final CacheControl commonBuild(CacheControl.Builder builder) {
        builder.getClass();
        return new CacheControl(builder.getNoCache(), builder.getNoStore(), builder.getMaxAgeSeconds(), -1, false, false, false, builder.getMaxStaleSeconds(), builder.getMinFreshSeconds(), builder.getOnlyIfCached(), builder.getNoTransform(), builder.getImmutable(), null);
    }

    public static final int commonClampToInt(long j) {
        if (j > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) j;
    }

    public static final CacheControl commonForceCache(CacheControl.Companion companion) {
        companion.getClass();
        CacheControl.Builder builderOnlyIfCached = new CacheControl.Builder().onlyIfCached();
        be beVar = gx1.Y;
        return builderOnlyIfCached.m45maxStaleLRDsOJo(vj8.l0(Integer.MAX_VALUE, lx1.SECONDS)).build();
    }

    public static final CacheControl commonForceNetwork(CacheControl.Companion companion) {
        companion.getClass();
        return new CacheControl.Builder().noCache().build();
    }

    public static final CacheControl.Builder commonImmutable(CacheControl.Builder builder) {
        builder.getClass();
        builder.setImmutable$okhttp(true);
        return builder;
    }

    public static final CacheControl.Builder commonNoCache(CacheControl.Builder builder) {
        builder.getClass();
        builder.setNoCache$okhttp(true);
        return builder;
    }

    public static final CacheControl.Builder commonNoStore(CacheControl.Builder builder) {
        builder.getClass();
        builder.setNoStore$okhttp(true);
        return builder;
    }

    public static final CacheControl.Builder commonNoTransform(CacheControl.Builder builder) {
        builder.getClass();
        builder.setNoTransform$okhttp(true);
        return builder;
    }

    public static final CacheControl.Builder commonOnlyIfCached(CacheControl.Builder builder) {
        builder.getClass();
        builder.setOnlyIfCached$okhttp(true);
        return builder;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x004a  */
    /* JADX WARN: Code duplicated, block: B:28:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:39:0x00db  */
    /* JADX WARN: Code duplicated, block: B:42:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:54:0x0126  */
    /* JADX WARN: Code duplicated, block: B:57:0x0134  */
    /* JADX WARN: Code duplicated, block: B:75:0x00ba A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x00c9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x00b4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x015b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x00c2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x00f1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:0x0100 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x010f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:0x013d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x014c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x00d6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:0x00d1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x00e3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x011e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x012e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x0153 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x0144 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:0x0116 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:0x0107 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:94:0x00f8 A[SYNTHETIC] */
    public static final CacheControl commonParse(CacheControl.Companion companion, Headers headers) {
        int iIndexOfElement;
        int iIndexOfElement2;
        String string;
        String string2;
        Headers headers2 = headers;
        companion.getClass();
        headers2.getClass();
        int size = headers2.size();
        int i = 0;
        boolean z = true;
        String str = null;
        boolean z2 = false;
        boolean z3 = false;
        int nonNegativeInt = -1;
        int nonNegativeInt2 = -1;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        int nonNegativeInt3 = -1;
        int nonNegativeInt4 = -1;
        boolean z7 = false;
        boolean z8 = false;
        boolean z9 = false;
        while (i < size) {
            String strName = headers2.name(i);
            String strValue = headers2.value(i);
            if (mm7.S(strName, "Cache-Control")) {
                if (str == null) {
                    str = strValue;
                }
                iIndexOfElement = 0;
                while (iIndexOfElement < strValue.length()) {
                    iIndexOfElement2 = indexOfElement(strValue, "=,;", iIndexOfElement);
                    string = fm7.R0(strValue.substring(iIndexOfElement, iIndexOfElement2)).toString();
                    if (iIndexOfElement2 != strValue.length() || strValue.charAt(iIndexOfElement2) == ',' || strValue.charAt(iIndexOfElement2) == ';') {
                        iIndexOfElement = iIndexOfElement2 + 1;
                        string2 = null;
                    } else {
                        int iIndexOfNonWhitespace = _UtilCommonKt.indexOfNonWhitespace(strValue, iIndexOfElement2 + 1);
                        if (iIndexOfNonWhitespace >= strValue.length() || strValue.charAt(iIndexOfNonWhitespace) != '\"') {
                            iIndexOfElement = indexOfElement(strValue, ",;", iIndexOfNonWhitespace);
                            string2 = fm7.R0(strValue.substring(iIndexOfNonWhitespace, iIndexOfElement)).toString();
                        } else {
                            int i2 = iIndexOfNonWhitespace + 1;
                            int iL0 = fm7.l0(strValue, '\"', i2, 4);
                            string2 = strValue.substring(i2, iL0);
                            iIndexOfElement = iL0 + 1;
                        }
                    }
                    if ("no-cache".equalsIgnoreCase(string)) {
                        z2 = true;
                    } else if ("no-store".equalsIgnoreCase(string)) {
                        z3 = true;
                    } else if ("max-age".equalsIgnoreCase(string)) {
                        nonNegativeInt = _UtilCommonKt.toNonNegativeInt(string2, -1);
                    } else if ("s-maxage".equalsIgnoreCase(string)) {
                        nonNegativeInt2 = _UtilCommonKt.toNonNegativeInt(string2, -1);
                    } else if ("private".equalsIgnoreCase(string)) {
                        z4 = true;
                    } else if ("public".equalsIgnoreCase(string)) {
                        z5 = true;
                    } else if ("must-revalidate".equalsIgnoreCase(string)) {
                        z6 = true;
                    } else if ("max-stale".equalsIgnoreCase(string)) {
                        nonNegativeInt3 = _UtilCommonKt.toNonNegativeInt(string2, Integer.MAX_VALUE);
                    } else if ("min-fresh".equalsIgnoreCase(string)) {
                        nonNegativeInt4 = _UtilCommonKt.toNonNegativeInt(string2, -1);
                    } else if ("only-if-cached".equalsIgnoreCase(string)) {
                        z7 = true;
                    } else if ("no-transform".equalsIgnoreCase(string)) {
                        z8 = true;
                    } else if ("immutable".equalsIgnoreCase(string)) {
                        z9 = true;
                    }
                }
                i++;
                headers2 = headers;
            } else {
                if (mm7.S(strName, "Pragma")) {
                }
                i++;
                headers2 = headers;
            }
            z = false;
            iIndexOfElement = 0;
            while (iIndexOfElement < strValue.length()) {
                iIndexOfElement2 = indexOfElement(strValue, "=,;", iIndexOfElement);
                string = fm7.R0(strValue.substring(iIndexOfElement, iIndexOfElement2)).toString();
                if (iIndexOfElement2 != strValue.length()) {
                    iIndexOfElement = iIndexOfElement2 + 1;
                    string2 = null;
                } else {
                    iIndexOfElement = iIndexOfElement2 + 1;
                    string2 = null;
                }
                if ("no-cache".equalsIgnoreCase(string)) {
                    z2 = true;
                } else if ("no-store".equalsIgnoreCase(string)) {
                    z3 = true;
                } else if ("max-age".equalsIgnoreCase(string)) {
                    nonNegativeInt = _UtilCommonKt.toNonNegativeInt(string2, -1);
                } else if ("s-maxage".equalsIgnoreCase(string)) {
                    nonNegativeInt2 = _UtilCommonKt.toNonNegativeInt(string2, -1);
                } else if ("private".equalsIgnoreCase(string)) {
                    z4 = true;
                } else if ("public".equalsIgnoreCase(string)) {
                    z5 = true;
                } else if ("must-revalidate".equalsIgnoreCase(string)) {
                    z6 = true;
                } else if ("max-stale".equalsIgnoreCase(string)) {
                    nonNegativeInt3 = _UtilCommonKt.toNonNegativeInt(string2, Integer.MAX_VALUE);
                } else if ("min-fresh".equalsIgnoreCase(string)) {
                    nonNegativeInt4 = _UtilCommonKt.toNonNegativeInt(string2, -1);
                } else if ("only-if-cached".equalsIgnoreCase(string)) {
                    z7 = true;
                } else if ("no-transform".equalsIgnoreCase(string)) {
                    z8 = true;
                } else if ("immutable".equalsIgnoreCase(string)) {
                    z9 = true;
                }
            }
            i++;
            headers2 = headers;
        }
        return new CacheControl(z2, z3, nonNegativeInt, nonNegativeInt2, z4, z5, z6, nonNegativeInt3, nonNegativeInt4, z7, z8, z9, !z ? null : str);
    }

    public static final String commonToString(CacheControl cacheControl) {
        cacheControl.getClass();
        String headerValue = cacheControl.getHeaderValue();
        if (headerValue != null) {
            return headerValue;
        }
        StringBuilder sb = new StringBuilder();
        if (cacheControl.noCache()) {
            sb.append("no-cache, ");
        }
        if (cacheControl.noStore()) {
            sb.append("no-store, ");
        }
        if (cacheControl.maxAgeSeconds() != -1) {
            sb.append("max-age=");
            sb.append(cacheControl.maxAgeSeconds());
            sb.append(", ");
        }
        if (cacheControl.sMaxAgeSeconds() != -1) {
            sb.append("s-maxage=");
            sb.append(cacheControl.sMaxAgeSeconds());
            sb.append(", ");
        }
        if (cacheControl.getIsPrivate()) {
            sb.append("private, ");
        }
        if (cacheControl.getIsPublic()) {
            sb.append("public, ");
        }
        if (cacheControl.mustRevalidate()) {
            sb.append("must-revalidate, ");
        }
        if (cacheControl.maxStaleSeconds() != -1) {
            sb.append("max-stale=");
            sb.append(cacheControl.maxStaleSeconds());
            sb.append(", ");
        }
        if (cacheControl.minFreshSeconds() != -1) {
            sb.append("min-fresh=");
            sb.append(cacheControl.minFreshSeconds());
            sb.append(", ");
        }
        if (cacheControl.onlyIfCached()) {
            sb.append("only-if-cached, ");
        }
        if (cacheControl.noTransform()) {
            sb.append("no-transform, ");
        }
        if (cacheControl.immutable()) {
            sb.append("immutable, ");
        }
        if (sb.length() == 0) {
            return _UrlKt.FRAGMENT_ENCODE_SET;
        }
        sb.delete(sb.length() - 2, sb.length()).getClass();
        String string = sb.toString();
        cacheControl.setHeaderValue$okhttp(string);
        return string;
    }

    private static final int indexOfElement(String str, String str2, int i) {
        int length = str.length();
        while (i < length) {
            if (fm7.e0(str2, str.charAt(i))) {
                return i;
            }
            i++;
        }
        return str.length();
    }

    public static /* synthetic */ int indexOfElement$default(String str, String str2, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return indexOfElement(str, str2, i);
    }
}
