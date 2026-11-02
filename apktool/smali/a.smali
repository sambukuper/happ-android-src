.class public abstract La;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# static fields
.field public static final a:[B

.field public static final b:[B


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Lkb0;->f0:Lkb0;

    .line 2
    .line 3
    const-string v0, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/"

    .line 4
    .line 5
    invoke-static {v0}, Lra;->g(Ljava/lang/String;)Lkb0;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-object v0, v0, Lkb0;->X:[B

    .line 10
    .line 11
    sput-object v0, La;->a:[B

    .line 12
    .line 13
    const-string v0, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_"

    .line 14
    .line 15
    invoke-static {v0}, Lra;->g(Ljava/lang/String;)Lkb0;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iget-object v0, v0, Lkb0;->X:[B

    .line 20
    .line 21
    sput-object v0, La;->b:[B

    .line 22
    .line 23
    return-void
.end method

.method public static final a([BZ[B)Ljava/lang/String;
    .locals 11

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    const/4 v0, 0x2

    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    array-length v1, p0

    .line 11
    add-int/2addr v1, v0

    .line 12
    div-int/lit8 v1, v1, 0x3

    .line 13
    .line 14
    mul-int/lit8 v1, v1, 0x4

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    array-length v1, p0

    .line 18
    mul-int/lit8 v1, v1, 0x4

    .line 19
    .line 20
    add-int/2addr v1, v0

    .line 21
    div-int/lit8 v1, v1, 0x3

    .line 22
    .line 23
    :goto_0
    new-array v1, v1, [B

    .line 24
    .line 25
    array-length v2, p0

    .line 26
    array-length v3, p0

    .line 27
    rem-int/lit8 v3, v3, 0x3

    .line 28
    .line 29
    sub-int/2addr v2, v3

    .line 30
    const/4 v3, 0x0

    .line 31
    move v4, v3

    .line 32
    :goto_1
    if-ge v3, v2, :cond_1

    .line 33
    .line 34
    add-int/lit8 v5, v3, 0x1

    .line 35
    .line 36
    aget-byte v6, p0, v3

    .line 37
    .line 38
    add-int/lit8 v7, v3, 0x2

    .line 39
    .line 40
    aget-byte v5, p0, v5

    .line 41
    .line 42
    add-int/lit8 v3, v3, 0x3

    .line 43
    .line 44
    aget-byte v7, p0, v7

    .line 45
    .line 46
    add-int/lit8 v8, v4, 0x1

    .line 47
    .line 48
    and-int/lit16 v9, v6, 0xff

    .line 49
    .line 50
    shr-int/2addr v9, v0

    .line 51
    aget-byte v9, p2, v9

    .line 52
    .line 53
    aput-byte v9, v1, v4

    .line 54
    .line 55
    add-int/lit8 v9, v4, 0x2

    .line 56
    .line 57
    and-int/lit8 v6, v6, 0x3

    .line 58
    .line 59
    shl-int/lit8 v6, v6, 0x4

    .line 60
    .line 61
    and-int/lit16 v10, v5, 0xff

    .line 62
    .line 63
    shr-int/lit8 v10, v10, 0x4

    .line 64
    .line 65
    or-int/2addr v6, v10

    .line 66
    aget-byte v6, p2, v6

    .line 67
    .line 68
    aput-byte v6, v1, v8

    .line 69
    .line 70
    add-int/lit8 v6, v4, 0x3

    .line 71
    .line 72
    and-int/lit8 v5, v5, 0xf

    .line 73
    .line 74
    shl-int/2addr v5, v0

    .line 75
    and-int/lit16 v8, v7, 0xff

    .line 76
    .line 77
    shr-int/lit8 v8, v8, 0x6

    .line 78
    .line 79
    or-int/2addr v5, v8

    .line 80
    aget-byte v5, p2, v5

    .line 81
    .line 82
    aput-byte v5, v1, v9

    .line 83
    .line 84
    add-int/lit8 v4, v4, 0x4

    .line 85
    .line 86
    and-int/lit8 v5, v7, 0x3f

    .line 87
    .line 88
    aget-byte v5, p2, v5

    .line 89
    .line 90
    aput-byte v5, v1, v6

    .line 91
    .line 92
    goto :goto_1

    .line 93
    :cond_1
    array-length v5, p0

    .line 94
    sub-int/2addr v5, v2

    .line 95
    const/16 v2, 0x3d

    .line 96
    .line 97
    const/4 v6, 0x1

    .line 98
    if-eq v5, v6, :cond_3

    .line 99
    .line 100
    if-eq v5, v0, :cond_2

    .line 101
    .line 102
    goto :goto_2

    .line 103
    :cond_2
    add-int/lit8 v5, v3, 0x1

    .line 104
    .line 105
    aget-byte v3, p0, v3

    .line 106
    .line 107
    aget-byte p0, p0, v5

    .line 108
    .line 109
    add-int/lit8 v5, v4, 0x1

    .line 110
    .line 111
    and-int/lit16 v6, v3, 0xff

    .line 112
    .line 113
    shr-int/2addr v6, v0

    .line 114
    aget-byte v6, p2, v6

    .line 115
    .line 116
    aput-byte v6, v1, v4

    .line 117
    .line 118
    add-int/lit8 v6, v4, 0x2

    .line 119
    .line 120
    and-int/lit8 v3, v3, 0x3

    .line 121
    .line 122
    shl-int/lit8 v3, v3, 0x4

    .line 123
    .line 124
    and-int/lit16 v7, p0, 0xff

    .line 125
    .line 126
    shr-int/lit8 v7, v7, 0x4

    .line 127
    .line 128
    or-int/2addr v3, v7

    .line 129
    aget-byte v3, p2, v3

    .line 130
    .line 131
    aput-byte v3, v1, v5

    .line 132
    .line 133
    add-int/lit8 v4, v4, 0x3

    .line 134
    .line 135
    and-int/lit8 p0, p0, 0xf

    .line 136
    .line 137
    shl-int/2addr p0, v0

    .line 138
    aget-byte p0, p2, p0

    .line 139
    .line 140
    aput-byte p0, v1, v6

    .line 141
    .line 142
    if-eqz p1, :cond_4

    .line 143
    .line 144
    aput-byte v2, v1, v4

    .line 145
    .line 146
    goto :goto_2

    .line 147
    :cond_3
    aget-byte p0, p0, v3

    .line 148
    .line 149
    add-int/lit8 v3, v4, 0x1

    .line 150
    .line 151
    and-int/lit16 v5, p0, 0xff

    .line 152
    .line 153
    shr-int/lit8 v0, v5, 0x2

    .line 154
    .line 155
    aget-byte v0, p2, v0

    .line 156
    .line 157
    aput-byte v0, v1, v4

    .line 158
    .line 159
    add-int/lit8 v0, v4, 0x2

    .line 160
    .line 161
    and-int/lit8 p0, p0, 0x3

    .line 162
    .line 163
    shl-int/lit8 p0, p0, 0x4

    .line 164
    .line 165
    aget-byte p0, p2, p0

    .line 166
    .line 167
    aput-byte p0, v1, v3

    .line 168
    .line 169
    if-eqz p1, :cond_4

    .line 170
    .line 171
    add-int/lit8 v4, v4, 0x3

    .line 172
    .line 173
    aput-byte v2, v1, v0

    .line 174
    .line 175
    aput-byte v2, v1, v4

    .line 176
    .line 177
    :cond_4
    :goto_2
    new-instance p0, Ljava/lang/String;

    .line 178
    .line 179
    sget-object p1, Liq0;->a:Ljava/nio/charset/Charset;

    .line 180
    .line 181
    invoke-direct {p0, v1, p1}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 182
    .line 183
    .line 184
    return-object p0
.end method
