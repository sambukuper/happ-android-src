.class public final Lokhttp3/internal/_HostnamesCommonKt;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0012\n\u0002\u0008\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u001a\u0013\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u0000\u00a2\u0006\u0004\u0008\u0004\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0001*\u00020\u0000H\u0000\u00a2\u0006\u0004\u0008\u0005\u0010\u0003\u001a)\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0008\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0000\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u001a7\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0008\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u0007H\u0000\u00a2\u0006\u0004\u0008\u000f\u0010\u0010\u001a\u0017\u0010\u0011\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\nH\u0000\u00a2\u0006\u0004\u0008\u0011\u0010\u0012\u001a\u0017\u0010\u0013\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0000\u00a2\u0006\u0004\u0008\u0013\u0010\u0014\u001a\u0017\u0010\u0015\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\nH\u0002\u00a2\u0006\u0004\u0008\u0015\u0010\u0016\u001a\u0017\u0010\u0017\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\nH\u0000\u00a2\u0006\u0004\u0008\u0017\u0010\u0012\u001a\u0015\u0010\u0018\u001a\u0004\u0018\u00010\u0000*\u00020\u0000H\u0000\u00a2\u0006\u0004\u0008\u0018\u0010\u0019\u001a\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u001a\u001a\u00020\u0000H\u0000\u00a2\u0006\u0004\u0008\u001b\u0010\u0019\"\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u001e\u00a8\u0006\u001f"
    }
    d2 = {
        "",
        "",
        "canParseAsIpAddress",
        "(Ljava/lang/String;)Z",
        "containsInvalidLabelLengths",
        "containsInvalidHostnameAsciiCodes",
        "input",
        "",
        "pos",
        "limit",
        "",
        "decodeIpv6",
        "(Ljava/lang/String;II)[B",
        "address",
        "addressOffset",
        "decodeIpv4Suffix",
        "(Ljava/lang/String;II[BI)Z",
        "inet6AddressToAscii",
        "([B)Ljava/lang/String;",
        "canonicalizeInetAddress",
        "([B)[B",
        "isMappedIpv4Address",
        "([B)Z",
        "inet4AddressToAscii",
        "toCanonicalHost",
        "(Ljava/lang/String;)Ljava/lang/String;",
        "host",
        "idnToAscii",
        "Lkc6;",
        "VERIFY_AS_IP_ADDRESS",
        "Lkc6;",
        "okhttp"
    }
    k = 0x2
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final VERIFY_AS_IP_ADDRESS:Lkc6;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lkc6;

    .line 2
    .line 3
    const-string v1, "([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lkc6;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lokhttp3/internal/_HostnamesCommonKt;->VERIFY_AS_IP_ADDRESS:Lkc6;

    .line 9
    .line 10
    return-void
.end method

.method public static final canParseAsIpAddress(Ljava/lang/String;)Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Lokhttp3/internal/_HostnamesCommonKt;->VERIFY_AS_IP_ADDRESS:Lkc6;

    .line 5
    .line 6
    invoke-virtual {v0, p0}, Lkc6;->d(Ljava/lang/CharSequence;)Z

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    return p0
.end method

.method public static final canonicalizeInetAddress([B)[B
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {p0}, Lokhttp3/internal/_HostnamesCommonKt;->isMappedIpv4Address([B)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    const/16 v0, 0xc

    .line 11
    .line 12
    const/16 v1, 0x10

    .line 13
    .line 14
    invoke-static {v0, v1}, Lx97;->a0(II)Lkf3;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-static {p0, v0}, Leu;->F0([BLkf3;)[B

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    :cond_0
    return-object p0
.end method

.method public static final containsInvalidHostnameAsciiCodes(Ljava/lang/String;)Z
    .locals 6

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    const/4 v1, 0x0

    .line 9
    move v2, v1

    .line 10
    :goto_0
    if-ge v2, v0, :cond_3

    .line 11
    .line 12
    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    .line 13
    .line 14
    .line 15
    move-result v3

    .line 16
    const/16 v4, 0x1f

    .line 17
    .line 18
    invoke-static {v3, v4}, Ldh3;->k(II)I

    .line 19
    .line 20
    .line 21
    move-result v4

    .line 22
    if-lez v4, :cond_2

    .line 23
    .line 24
    const/16 v4, 0x7f

    .line 25
    .line 26
    invoke-static {v3, v4}, Ldh3;->k(II)I

    .line 27
    .line 28
    .line 29
    move-result v4

    .line 30
    if-ltz v4, :cond_0

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_0
    const-string v4, " #%/:?@[\\]"

    .line 34
    .line 35
    const/4 v5, 0x6

    .line 36
    invoke-static {v4, v3, v1, v5}, Lfm7;->l0(Ljava/lang/CharSequence;CII)I

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    const/4 v4, -0x1

    .line 41
    if-eq v3, v4, :cond_1

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_2
    :goto_1
    const/4 p0, 0x1

    .line 48
    return p0

    .line 49
    :cond_3
    return v1
.end method

.method public static final containsInvalidLabelLengths(Ljava/lang/String;)Z
    .locals 6

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    const/4 v1, 0x1

    .line 9
    if-gt v1, v0, :cond_2

    .line 10
    .line 11
    const/16 v2, 0xfe

    .line 12
    .line 13
    if-ge v0, v2, :cond_2

    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    move v2, v0

    .line 17
    :goto_0
    const/16 v3, 0x2e

    .line 18
    .line 19
    const/4 v4, 0x4

    .line 20
    invoke-static {p0, v3, v2, v4}, Lfm7;->l0(Ljava/lang/CharSequence;CII)I

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    const/4 v4, -0x1

    .line 25
    if-ne v3, v4, :cond_0

    .line 26
    .line 27
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 28
    .line 29
    .line 30
    move-result v5

    .line 31
    sub-int/2addr v5, v2

    .line 32
    goto :goto_1

    .line 33
    :cond_0
    sub-int v5, v3, v2

    .line 34
    .line 35
    :goto_1
    if-gt v1, v5, :cond_2

    .line 36
    .line 37
    const/16 v2, 0x40

    .line 38
    .line 39
    if-ge v5, v2, :cond_2

    .line 40
    .line 41
    if-eq v3, v4, :cond_1

    .line 42
    .line 43
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    sub-int/2addr v2, v1

    .line 48
    if-eq v3, v2, :cond_1

    .line 49
    .line 50
    add-int/lit8 v2, v3, 0x1

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_1
    return v0

    .line 54
    :cond_2
    return v1
.end method

.method public static final decodeIpv4Suffix(Ljava/lang/String;II[BI)Z
    .locals 7

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    move v0, p4

    .line 8
    :goto_0
    const/4 v1, 0x0

    .line 9
    if-ge p1, p2, :cond_8

    .line 10
    .line 11
    array-length v2, p3

    .line 12
    if-ne v0, v2, :cond_0

    .line 13
    .line 14
    return v1

    .line 15
    :cond_0
    if-eq v0, p4, :cond_2

    .line 16
    .line 17
    invoke-virtual {p0, p1}, Ljava/lang/String;->charAt(I)C

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    const/16 v3, 0x2e

    .line 22
    .line 23
    if-eq v2, v3, :cond_1

    .line 24
    .line 25
    return v1

    .line 26
    :cond_1
    add-int/lit8 p1, p1, 0x1

    .line 27
    .line 28
    :cond_2
    move v2, p1

    .line 29
    move v3, v1

    .line 30
    :goto_1
    if-ge v2, p2, :cond_6

    .line 31
    .line 32
    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    .line 33
    .line 34
    .line 35
    move-result v4

    .line 36
    const/16 v5, 0x30

    .line 37
    .line 38
    invoke-static {v4, v5}, Ldh3;->k(II)I

    .line 39
    .line 40
    .line 41
    move-result v6

    .line 42
    if-ltz v6, :cond_6

    .line 43
    .line 44
    const/16 v6, 0x39

    .line 45
    .line 46
    invoke-static {v4, v6}, Ldh3;->k(II)I

    .line 47
    .line 48
    .line 49
    move-result v6

    .line 50
    if-lez v6, :cond_3

    .line 51
    .line 52
    goto :goto_2

    .line 53
    :cond_3
    if-nez v3, :cond_4

    .line 54
    .line 55
    if-eq p1, v2, :cond_4

    .line 56
    .line 57
    return v1

    .line 58
    :cond_4
    mul-int/lit8 v3, v3, 0xa

    .line 59
    .line 60
    add-int/2addr v3, v4

    .line 61
    sub-int/2addr v3, v5

    .line 62
    const/16 v4, 0xff

    .line 63
    .line 64
    if-le v3, v4, :cond_5

    .line 65
    .line 66
    return v1

    .line 67
    :cond_5
    add-int/lit8 v2, v2, 0x1

    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_6
    :goto_2
    sub-int p1, v2, p1

    .line 71
    .line 72
    if-nez p1, :cond_7

    .line 73
    .line 74
    return v1

    .line 75
    :cond_7
    add-int/lit8 p1, v0, 0x1

    .line 76
    .line 77
    int-to-byte v1, v3

    .line 78
    aput-byte v1, p3, v0

    .line 79
    .line 80
    move v0, p1

    .line 81
    move p1, v2

    .line 82
    goto :goto_0

    .line 83
    :cond_8
    add-int/lit8 p4, p4, 0x4

    .line 84
    .line 85
    if-ne v0, p4, :cond_9

    .line 86
    .line 87
    const/4 p0, 0x1

    .line 88
    return p0

    .line 89
    :cond_9
    return v1
.end method

.method public static final decodeIpv6(Ljava/lang/String;II)[B
    .locals 10

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/16 v0, 0x10

    .line 5
    .line 6
    new-array v1, v0, [B

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    const/4 v3, -0x1

    .line 10
    move v4, v2

    .line 11
    move v5, v3

    .line 12
    move v6, v5

    .line 13
    :goto_0
    if-ge p1, p2, :cond_9

    .line 14
    .line 15
    if-ne v4, v0, :cond_0

    .line 16
    .line 17
    goto/16 :goto_4

    .line 18
    .line 19
    :cond_0
    add-int/lit8 v7, p1, 0x2

    .line 20
    .line 21
    if-gt v7, p2, :cond_3

    .line 22
    .line 23
    const-string v8, "::"

    .line 24
    .line 25
    invoke-static {p0, v8, p1, v2}, Lmm7;->Y(Ljava/lang/String;Ljava/lang/String;IZ)Z

    .line 26
    .line 27
    .line 28
    move-result v8

    .line 29
    if-eqz v8, :cond_3

    .line 30
    .line 31
    if-eq v5, v3, :cond_1

    .line 32
    .line 33
    goto/16 :goto_4

    .line 34
    .line 35
    :cond_1
    add-int/lit8 v4, v4, 0x2

    .line 36
    .line 37
    move v5, v4

    .line 38
    if-ne v7, p2, :cond_2

    .line 39
    .line 40
    goto :goto_3

    .line 41
    :cond_2
    move v6, v7

    .line 42
    goto :goto_1

    .line 43
    :cond_3
    if-eqz v4, :cond_4

    .line 44
    .line 45
    const-string v7, ":"

    .line 46
    .line 47
    invoke-static {p0, v7, p1, v2}, Lmm7;->Y(Ljava/lang/String;Ljava/lang/String;IZ)Z

    .line 48
    .line 49
    .line 50
    move-result v7

    .line 51
    if-eqz v7, :cond_5

    .line 52
    .line 53
    add-int/lit8 p1, p1, 0x1

    .line 54
    .line 55
    :cond_4
    move v6, p1

    .line 56
    goto :goto_1

    .line 57
    :cond_5
    const-string v7, "."

    .line 58
    .line 59
    invoke-static {p0, v7, p1, v2}, Lmm7;->Y(Ljava/lang/String;Ljava/lang/String;IZ)Z

    .line 60
    .line 61
    .line 62
    move-result p1

    .line 63
    if-eqz p1, :cond_a

    .line 64
    .line 65
    add-int/lit8 p1, v4, -0x2

    .line 66
    .line 67
    invoke-static {p0, v6, p2, v1, p1}, Lokhttp3/internal/_HostnamesCommonKt;->decodeIpv4Suffix(Ljava/lang/String;II[BI)Z

    .line 68
    .line 69
    .line 70
    move-result p0

    .line 71
    if-nez p0, :cond_6

    .line 72
    .line 73
    goto :goto_4

    .line 74
    :cond_6
    add-int/lit8 v4, v4, 0x2

    .line 75
    .line 76
    goto :goto_3

    .line 77
    :goto_1
    move v7, v2

    .line 78
    move p1, v6

    .line 79
    :goto_2
    if-ge p1, p2, :cond_7

    .line 80
    .line 81
    invoke-virtual {p0, p1}, Ljava/lang/String;->charAt(I)C

    .line 82
    .line 83
    .line 84
    move-result v8

    .line 85
    invoke-static {v8}, Lokhttp3/internal/_UtilCommonKt;->parseHexDigit(C)I

    .line 86
    .line 87
    .line 88
    move-result v8

    .line 89
    if-eq v8, v3, :cond_7

    .line 90
    .line 91
    shl-int/lit8 v7, v7, 0x4

    .line 92
    .line 93
    add-int/2addr v7, v8

    .line 94
    add-int/lit8 p1, p1, 0x1

    .line 95
    .line 96
    goto :goto_2

    .line 97
    :cond_7
    sub-int v8, p1, v6

    .line 98
    .line 99
    if-eqz v8, :cond_a

    .line 100
    .line 101
    const/4 v9, 0x4

    .line 102
    if-le v8, v9, :cond_8

    .line 103
    .line 104
    goto :goto_4

    .line 105
    :cond_8
    add-int/lit8 v8, v4, 0x1

    .line 106
    .line 107
    ushr-int/lit8 v9, v7, 0x8

    .line 108
    .line 109
    and-int/lit16 v9, v9, 0xff

    .line 110
    .line 111
    int-to-byte v9, v9

    .line 112
    aput-byte v9, v1, v4

    .line 113
    .line 114
    add-int/lit8 v4, v4, 0x2

    .line 115
    .line 116
    and-int/lit16 v7, v7, 0xff

    .line 117
    .line 118
    int-to-byte v7, v7

    .line 119
    aput-byte v7, v1, v8

    .line 120
    .line 121
    goto :goto_0

    .line 122
    :cond_9
    :goto_3
    if-eq v4, v0, :cond_c

    .line 123
    .line 124
    if-ne v5, v3, :cond_b

    .line 125
    .line 126
    :cond_a
    :goto_4
    const/4 p0, 0x0

    .line 127
    return-object p0

    .line 128
    :cond_b
    sub-int p0, v4, v5

    .line 129
    .line 130
    rsub-int/lit8 p0, p0, 0x10

    .line 131
    .line 132
    invoke-static {p0, v5, v4, v1, v1}, Leu;->d0(III[B[B)V

    .line 133
    .line 134
    .line 135
    sub-int/2addr v0, v4

    .line 136
    add-int/2addr v0, v5

    .line 137
    invoke-static {v1, v5, v0, v2}, Ljava/util/Arrays;->fill([BIIB)V

    .line 138
    .line 139
    .line 140
    :cond_c
    return-object v1
.end method

.method public static final idnToAscii(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Li90;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, p0}, Li90;->d1(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    new-instance p0, Li90;

    .line 13
    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    .line 16
    .line 17
    :cond_0
    invoke-virtual {v0}, Li90;->F()Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-nez v1, :cond_1

    .line 22
    .line 23
    invoke-virtual {v0}, Li90;->a0()I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    invoke-static {}, Lokhttp3/internal/idn/IdnaMappingTableInstanceKt;->getIDNA_MAPPING_TABLE()Lokhttp3/internal/idn/IdnaMappingTable;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    invoke-virtual {v2, v1, p0}, Lokhttp3/internal/idn/IdnaMappingTable;->map(ILaa0;)Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-nez v1, :cond_0

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    invoke-virtual {p0}, Li90;->Y()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    invoke-static {p0}, Lokhttp3/internal/_NormalizeJvmKt;->normalizeNfc(Ljava/lang/String;)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    invoke-virtual {v0, p0}, Li90;->d1(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    sget-object p0, Lokhttp3/internal/idn/Punycode;->INSTANCE:Lokhttp3/internal/idn/Punycode;

    .line 50
    .line 51
    invoke-virtual {v0}, Li90;->Y()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-virtual {p0, v0}, Lokhttp3/internal/idn/Punycode;->decode(Ljava/lang/String;)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    if-nez v0, :cond_2

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_2
    invoke-static {v0}, Lokhttp3/internal/_NormalizeJvmKt;->normalizeNfc(Ljava/lang/String;)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result v1

    .line 70
    if-nez v1, :cond_3

    .line 71
    .line 72
    :goto_0
    const/4 p0, 0x0

    .line 73
    return-object p0

    .line 74
    :cond_3
    invoke-virtual {p0, v0}, Lokhttp3/internal/idn/Punycode;->encode(Ljava/lang/String;)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    return-object p0
.end method

.method public static final inet4AddressToAscii([B)Ljava/lang/String;
    .locals 5

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    array-length v0, p0

    .line 5
    const/4 v1, 0x4

    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    new-instance v0, Li90;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    aget-byte v1, p0, v1

    .line 15
    .line 16
    const/16 v2, 0xff

    .line 17
    .line 18
    invoke-static {v1, v2}, Lokhttp3/internal/_UtilCommonKt;->and(BI)I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    int-to-long v3, v1

    .line 23
    invoke-virtual {v0, v3, v4}, Li90;->J0(J)V

    .line 24
    .line 25
    .line 26
    const/16 v1, 0x2e

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Li90;->H0(I)V

    .line 29
    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    aget-byte v3, p0, v3

    .line 33
    .line 34
    invoke-static {v3, v2}, Lokhttp3/internal/_UtilCommonKt;->and(BI)I

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    int-to-long v3, v3

    .line 39
    invoke-virtual {v0, v3, v4}, Li90;->J0(J)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, v1}, Li90;->H0(I)V

    .line 43
    .line 44
    .line 45
    const/4 v3, 0x2

    .line 46
    aget-byte v3, p0, v3

    .line 47
    .line 48
    invoke-static {v3, v2}, Lokhttp3/internal/_UtilCommonKt;->and(BI)I

    .line 49
    .line 50
    .line 51
    move-result v3

    .line 52
    int-to-long v3, v3

    .line 53
    invoke-virtual {v0, v3, v4}, Li90;->J0(J)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0, v1}, Li90;->H0(I)V

    .line 57
    .line 58
    .line 59
    const/4 v1, 0x3

    .line 60
    aget-byte p0, p0, v1

    .line 61
    .line 62
    invoke-static {p0, v2}, Lokhttp3/internal/_UtilCommonKt;->and(BI)I

    .line 63
    .line 64
    .line 65
    move-result p0

    .line 66
    int-to-long v1, p0

    .line 67
    invoke-virtual {v0, v1, v2}, Li90;->J0(J)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {v0}, Li90;->Y()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    return-object p0

    .line 75
    :cond_0
    const-string p0, "Failed requirement."

    .line 76
    .line 77
    invoke-static {p0}, Lbt;->q(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    const/4 p0, 0x0

    .line 81
    return-object p0
.end method

.method public static final inet6AddressToAscii([B)Ljava/lang/String;
    .locals 8

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 v0, -0x1

    .line 5
    const/4 v1, 0x0

    .line 6
    move v2, v1

    .line 7
    move v3, v2

    .line 8
    :goto_0
    array-length v4, p0

    .line 9
    const/16 v5, 0x10

    .line 10
    .line 11
    if-ge v2, v4, :cond_2

    .line 12
    .line 13
    move v4, v2

    .line 14
    :goto_1
    if-ge v4, v5, :cond_0

    .line 15
    .line 16
    aget-byte v6, p0, v4

    .line 17
    .line 18
    if-nez v6, :cond_0

    .line 19
    .line 20
    add-int/lit8 v6, v4, 0x1

    .line 21
    .line 22
    aget-byte v6, p0, v6

    .line 23
    .line 24
    if-nez v6, :cond_0

    .line 25
    .line 26
    add-int/lit8 v4, v4, 0x2

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_0
    sub-int v5, v4, v2

    .line 30
    .line 31
    if-le v5, v3, :cond_1

    .line 32
    .line 33
    const/4 v6, 0x4

    .line 34
    if-lt v5, v6, :cond_1

    .line 35
    .line 36
    move v0, v2

    .line 37
    move v3, v5

    .line 38
    :cond_1
    add-int/lit8 v2, v4, 0x2

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_2
    new-instance v2, Li90;

    .line 42
    .line 43
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 44
    .line 45
    .line 46
    :cond_3
    :goto_2
    array-length v4, p0

    .line 47
    if-ge v1, v4, :cond_6

    .line 48
    .line 49
    const/16 v4, 0x3a

    .line 50
    .line 51
    if-ne v1, v0, :cond_4

    .line 52
    .line 53
    invoke-virtual {v2, v4}, Li90;->H0(I)V

    .line 54
    .line 55
    .line 56
    add-int/2addr v1, v3

    .line 57
    if-ne v1, v5, :cond_3

    .line 58
    .line 59
    invoke-virtual {v2, v4}, Li90;->H0(I)V

    .line 60
    .line 61
    .line 62
    goto :goto_2

    .line 63
    :cond_4
    if-lez v1, :cond_5

    .line 64
    .line 65
    invoke-virtual {v2, v4}, Li90;->H0(I)V

    .line 66
    .line 67
    .line 68
    :cond_5
    aget-byte v4, p0, v1

    .line 69
    .line 70
    const/16 v6, 0xff

    .line 71
    .line 72
    invoke-static {v4, v6}, Lokhttp3/internal/_UtilCommonKt;->and(BI)I

    .line 73
    .line 74
    .line 75
    move-result v4

    .line 76
    shl-int/lit8 v4, v4, 0x8

    .line 77
    .line 78
    add-int/lit8 v7, v1, 0x1

    .line 79
    .line 80
    aget-byte v7, p0, v7

    .line 81
    .line 82
    invoke-static {v7, v6}, Lokhttp3/internal/_UtilCommonKt;->and(BI)I

    .line 83
    .line 84
    .line 85
    move-result v6

    .line 86
    or-int/2addr v4, v6

    .line 87
    int-to-long v6, v4

    .line 88
    invoke-virtual {v2, v6, v7}, Li90;->V0(J)V

    .line 89
    .line 90
    .line 91
    add-int/lit8 v1, v1, 0x2

    .line 92
    .line 93
    goto :goto_2

    .line 94
    :cond_6
    invoke-virtual {v2}, Li90;->Y()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    return-object p0
.end method

.method private static final isMappedIpv4Address([B)Z
    .locals 3

    .line 1
    array-length v0, p0

    .line 2
    const/16 v1, 0x10

    .line 3
    .line 4
    const/4 v2, 0x0

    .line 5
    if-eq v0, v1, :cond_0

    .line 6
    .line 7
    return v2

    .line 8
    :cond_0
    move v0, v2

    .line 9
    :goto_0
    const/16 v1, 0xa

    .line 10
    .line 11
    if-ge v0, v1, :cond_2

    .line 12
    .line 13
    aget-byte v1, p0, v0

    .line 14
    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    return v2

    .line 18
    :cond_1
    add-int/lit8 v0, v0, 0x1

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_2
    aget-byte v0, p0, v1

    .line 22
    .line 23
    const/4 v1, -0x1

    .line 24
    if-eq v0, v1, :cond_3

    .line 25
    .line 26
    return v2

    .line 27
    :cond_3
    const/16 v0, 0xb

    .line 28
    .line 29
    aget-byte p0, p0, v0

    .line 30
    .line 31
    if-eq p0, v1, :cond_4

    .line 32
    .line 33
    return v2

    .line 34
    :cond_4
    const/4 p0, 0x1

    .line 35
    return p0
.end method

.method public static final toCanonicalHost(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const-string v0, ":"

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-static {p0, v0, v1}, Lfm7;->d0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v2, 0x0

    .line 12
    if-eqz v0, :cond_4

    .line 13
    .line 14
    const-string v0, "["

    .line 15
    .line 16
    invoke-static {p0, v1, v0}, Lmm7;->Z(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    const-string v0, "]"

    .line 23
    .line 24
    invoke-static {p0, v1, v0}, Lmm7;->R(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-eqz v0, :cond_0

    .line 29
    .line 30
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    const/4 v1, 0x1

    .line 35
    sub-int/2addr v0, v1

    .line 36
    invoke-static {p0, v1, v0}, Lokhttp3/internal/_HostnamesCommonKt;->decodeIpv6(Ljava/lang/String;II)[B

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    goto :goto_0

    .line 41
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    invoke-static {p0, v1, v0}, Lokhttp3/internal/_HostnamesCommonKt;->decodeIpv6(Ljava/lang/String;II)[B

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    :goto_0
    if-nez v0, :cond_1

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_1
    invoke-static {v0}, Lokhttp3/internal/_HostnamesCommonKt;->canonicalizeInetAddress([B)[B

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    array-length v1, v0

    .line 57
    const/16 v3, 0x10

    .line 58
    .line 59
    if-ne v1, v3, :cond_2

    .line 60
    .line 61
    invoke-static {v0}, Lokhttp3/internal/_HostnamesCommonKt;->inet6AddressToAscii([B)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    return-object p0

    .line 66
    :cond_2
    array-length v1, v0

    .line 67
    const/4 v3, 0x4

    .line 68
    if-ne v1, v3, :cond_3

    .line 69
    .line 70
    invoke-static {v0}, Lokhttp3/internal/_HostnamesCommonKt;->inet4AddressToAscii([B)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    return-object p0

    .line 75
    :cond_3
    const-string v0, "Invalid IPv6 address: \'"

    .line 76
    .line 77
    const/16 v1, 0x27

    .line 78
    .line 79
    invoke-static {v1, v0, p0}, Lp61;->l(CLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    invoke-static {p0}, Lbt;->g(Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    return-object v2

    .line 87
    :cond_4
    invoke-static {p0}, Lokhttp3/internal/_HostnamesCommonKt;->idnToAscii(Ljava/lang/String;)Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    if-nez p0, :cond_5

    .line 92
    .line 93
    goto :goto_1

    .line 94
    :cond_5
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    if-nez v0, :cond_6

    .line 99
    .line 100
    goto :goto_1

    .line 101
    :cond_6
    invoke-static {p0}, Lokhttp3/internal/_HostnamesCommonKt;->containsInvalidHostnameAsciiCodes(Ljava/lang/String;)Z

    .line 102
    .line 103
    .line 104
    move-result v0

    .line 105
    if-eqz v0, :cond_7

    .line 106
    .line 107
    goto :goto_1

    .line 108
    :cond_7
    invoke-static {p0}, Lokhttp3/internal/_HostnamesCommonKt;->containsInvalidLabelLengths(Ljava/lang/String;)Z

    .line 109
    .line 110
    .line 111
    move-result v0

    .line 112
    if-eqz v0, :cond_8

    .line 113
    .line 114
    :goto_1
    return-object v2

    .line 115
    :cond_8
    return-object p0
.end method
