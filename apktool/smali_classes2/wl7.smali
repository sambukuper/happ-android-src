.class public abstract Lwl7;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# static fields
.field public static final a:[Ljava/lang/Object;

.field public static final b:Lyl1;

.field public static final c:Lcg;

.field public static final d:[Le37;

.field public static final e:Lc75;

.field public static f:Lmj3;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v0, v0, [Ljava/lang/Object;

    .line 3
    .line 4
    sput-object v0, Lwl7;->a:[Ljava/lang/Object;

    .line 5
    .line 6
    new-instance v0, Lyl1;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    .line 11
    sput-object v0, Lwl7;->b:Lyl1;

    .line 12
    .line 13
    new-instance v0, Lcg;

    .line 14
    .line 15
    const/4 v1, 0x3

    .line 16
    invoke-direct {v0, v1}, Lcg;-><init>(B)V

    .line 17
    .line 18
    .line 19
    sput-object v0, Lwl7;->c:Lcg;

    .line 20
    .line 21
    const/4 v0, 0x0

    .line 22
    new-array v0, v0, [Le37;

    .line 23
    .line 24
    sput-object v0, Lwl7;->d:[Le37;

    .line 25
    .line 26
    new-instance v0, Lc75;

    .line 27
    .line 28
    const/4 v1, 0x7

    .line 29
    invoke-direct {v0, v1}, Lc75;-><init>(B)V

    .line 30
    .line 31
    .line 32
    sput-object v0, Lwl7;->e:Lc75;

    .line 33
    .line 34
    return-void
.end method

.method public static A([B)Lu91;
    .locals 6

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    array-length v0, p0

    .line 5
    const/16 v1, 0x2800

    .line 6
    .line 7
    if-gt v0, v1, :cond_7

    .line 8
    .line 9
    array-length v0, p0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    sget-object p0, Lu91;->b:Lu91;

    .line 13
    .line 14
    return-object p0

    .line 15
    :cond_0
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 16
    .line 17
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 18
    .line 19
    .line 20
    :try_start_0
    new-instance v1, Ljava/io/ByteArrayInputStream;

    .line 21
    .line 22
    invoke-direct {v1, p0}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    .line 23
    .line 24
    .line 25
    const/4 p0, 0x2

    .line 26
    new-array p0, p0, [B

    .line 27
    .line 28
    invoke-virtual {v1, p0}, Ljava/io/InputStream;->read([B)I

    .line 29
    .line 30
    .line 31
    const/4 v2, 0x0

    .line 32
    aget-byte v3, p0, v2

    .line 33
    .line 34
    const/4 v4, 0x1

    .line 35
    const/16 v5, -0x54

    .line 36
    .line 37
    if-ne v3, v5, :cond_1

    .line 38
    .line 39
    aget-byte p0, p0, v4

    .line 40
    .line 41
    const/16 v3, -0x13

    .line 42
    .line 43
    if-ne p0, v3, :cond_1

    .line 44
    .line 45
    move p0, v4

    .line 46
    goto :goto_0

    .line 47
    :cond_1
    move p0, v2

    .line 48
    :goto_0
    invoke-virtual {v1}, Ljava/io/ByteArrayInputStream;->reset()V

    .line 49
    .line 50
    .line 51
    if-eqz p0, :cond_3

    .line 52
    .line 53
    new-instance p0, Ljava/io/ObjectInputStream;

    .line 54
    .line 55
    invoke-direct {p0, v1}, Ljava/io/ObjectInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 56
    .line 57
    .line 58
    :try_start_1
    invoke-virtual {p0}, Ljava/io/ObjectInputStream;->readInt()I

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    :goto_1
    if-ge v2, v1, :cond_2

    .line 63
    .line 64
    invoke-virtual {p0}, Ljava/io/ObjectInputStream;->readUTF()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    invoke-virtual {p0}, Ljava/io/ObjectInputStream;->readObject()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v4

    .line 72
    invoke-interface {v0, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 73
    .line 74
    .line 75
    add-int/lit8 v2, v2, 0x1

    .line 76
    .line 77
    goto :goto_1

    .line 78
    :catchall_0
    move-exception v1

    .line 79
    goto :goto_2

    .line 80
    :cond_2
    :try_start_2
    invoke-virtual {p0}, Ljava/io/ObjectInputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/ClassNotFoundException; {:try_start_2 .. :try_end_2} :catch_0

    .line 81
    .line 82
    .line 83
    goto :goto_6

    .line 84
    :goto_2
    :try_start_3
    throw v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 85
    :catchall_1
    move-exception v2

    .line 86
    :try_start_4
    invoke-static {p0, v1}, Loc;->h(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 87
    .line 88
    .line 89
    throw v2

    .line 90
    :cond_3
    new-instance p0, Ljava/io/DataInputStream;

    .line 91
    .line 92
    invoke-direct {p0, v1}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/lang/ClassNotFoundException; {:try_start_4 .. :try_end_4} :catch_0

    .line 93
    .line 94
    .line 95
    :try_start_5
    invoke-virtual {p0}, Ljava/io/DataInputStream;->readShort()S

    .line 96
    .line 97
    .line 98
    move-result v1

    .line 99
    const/16 v3, -0x5411

    .line 100
    .line 101
    if-ne v1, v3, :cond_5

    .line 102
    .line 103
    invoke-virtual {p0}, Ljava/io/DataInputStream;->readShort()S

    .line 104
    .line 105
    .line 106
    move-result v1

    .line 107
    if-ne v1, v4, :cond_4

    .line 108
    .line 109
    goto :goto_3

    .line 110
    :cond_4
    const-string v3, "Unsupported version number: "

    .line 111
    .line 112
    invoke-static {v1, v3}, Lpc6;->j(ILjava/lang/String;)Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v1

    .line 116
    invoke-static {v1}, Lkp5;->h(Ljava/lang/Object;)V

    .line 117
    .line 118
    .line 119
    goto :goto_3

    .line 120
    :cond_5
    const-string v3, "Magic number doesn\'t match: "

    .line 121
    .line 122
    invoke-static {v1, v3}, Lpc6;->j(ILjava/lang/String;)Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v1

    .line 126
    invoke-static {v1}, Lkp5;->h(Ljava/lang/Object;)V

    .line 127
    .line 128
    .line 129
    :goto_3
    invoke-virtual {p0}, Ljava/io/DataInputStream;->readInt()I

    .line 130
    .line 131
    .line 132
    move-result v1

    .line 133
    :goto_4
    if-ge v2, v1, :cond_6

    .line 134
    .line 135
    invoke-virtual {p0}, Ljava/io/DataInputStream;->readByte()B

    .line 136
    .line 137
    .line 138
    move-result v3

    .line 139
    invoke-static {p0, v3}, Lwl7;->B(Ljava/io/DataInputStream;B)Ljava/io/Serializable;

    .line 140
    .line 141
    .line 142
    move-result-object v3

    .line 143
    invoke-virtual {p0}, Ljava/io/DataInputStream;->readUTF()Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object v4

    .line 147
    invoke-interface {v0, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 148
    .line 149
    .line 150
    add-int/lit8 v2, v2, 0x1

    .line 151
    .line 152
    goto :goto_4

    .line 153
    :catchall_2
    move-exception v1

    .line 154
    goto :goto_5

    .line 155
    :cond_6
    :try_start_6
    invoke-interface {p0}, Ljava/io/Closeable;->close()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_1
    .catch Ljava/lang/ClassNotFoundException; {:try_start_6 .. :try_end_6} :catch_0

    .line 156
    .line 157
    .line 158
    goto :goto_6

    .line 159
    :goto_5
    :try_start_7
    throw v1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 160
    :catchall_3
    move-exception v2

    .line 161
    :try_start_8
    invoke-static {p0, v1}, Loc;->h(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 162
    .line 163
    .line 164
    throw v2
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_1
    .catch Ljava/lang/ClassNotFoundException; {:try_start_8 .. :try_end_8} :catch_0

    .line 165
    :catch_0
    sget p0, Lkb1;->a:I

    .line 166
    .line 167
    invoke-static {}, Llh4;->P0()Llh4;

    .line 168
    .line 169
    .line 170
    move-result-object p0

    .line 171
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 172
    .line 173
    .line 174
    goto :goto_6

    .line 175
    :catch_1
    sget p0, Lkb1;->a:I

    .line 176
    .line 177
    invoke-static {}, Llh4;->P0()Llh4;

    .line 178
    .line 179
    .line 180
    move-result-object p0

    .line 181
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 182
    .line 183
    .line 184
    :goto_6
    new-instance p0, Lu91;

    .line 185
    .line 186
    invoke-direct {p0, v0}, Lu91;-><init>(Ljava/util/LinkedHashMap;)V

    .line 187
    .line 188
    .line 189
    return-object p0

    .line 190
    :cond_7
    const-string p0, "Data cannot occupy more than 10240 bytes when serialized"

    .line 191
    .line 192
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 193
    .line 194
    .line 195
    const/4 p0, 0x0

    .line 196
    return-object p0
.end method

.method public static final B(Ljava/io/DataInputStream;B)Ljava/io/Serializable;
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    return-object v0

    .line 5
    :cond_0
    const/4 v1, 0x1

    .line 6
    if-ne p1, v1, :cond_1

    .line 7
    .line 8
    invoke-virtual {p0}, Ljava/io/DataInputStream;->readBoolean()Z

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0

    .line 17
    :cond_1
    const/4 v1, 0x2

    .line 18
    if-ne p1, v1, :cond_2

    .line 19
    .line 20
    invoke-virtual {p0}, Ljava/io/DataInputStream;->readByte()B

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    invoke-static {p0}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0

    .line 29
    :cond_2
    const/4 v1, 0x3

    .line 30
    if-ne p1, v1, :cond_3

    .line 31
    .line 32
    invoke-virtual {p0}, Ljava/io/DataInputStream;->readInt()I

    .line 33
    .line 34
    .line 35
    move-result p0

    .line 36
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    return-object p0

    .line 41
    :cond_3
    const/4 v1, 0x4

    .line 42
    if-ne p1, v1, :cond_4

    .line 43
    .line 44
    invoke-virtual {p0}, Ljava/io/DataInputStream;->readLong()J

    .line 45
    .line 46
    .line 47
    move-result-wide p0

    .line 48
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    return-object p0

    .line 53
    :cond_4
    const/4 v1, 0x5

    .line 54
    if-ne p1, v1, :cond_5

    .line 55
    .line 56
    invoke-virtual {p0}, Ljava/io/DataInputStream;->readFloat()F

    .line 57
    .line 58
    .line 59
    move-result p0

    .line 60
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    return-object p0

    .line 65
    :cond_5
    const/4 v1, 0x6

    .line 66
    if-ne p1, v1, :cond_6

    .line 67
    .line 68
    invoke-virtual {p0}, Ljava/io/DataInputStream;->readDouble()D

    .line 69
    .line 70
    .line 71
    move-result-wide p0

    .line 72
    invoke-static {p0, p1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    return-object p0

    .line 77
    :cond_6
    const/4 v1, 0x7

    .line 78
    if-ne p1, v1, :cond_7

    .line 79
    .line 80
    invoke-virtual {p0}, Ljava/io/DataInputStream;->readUTF()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    return-object p0

    .line 85
    :cond_7
    const/16 v1, 0x8

    .line 86
    .line 87
    const/4 v2, 0x0

    .line 88
    if-ne p1, v1, :cond_9

    .line 89
    .line 90
    invoke-virtual {p0}, Ljava/io/DataInputStream;->readInt()I

    .line 91
    .line 92
    .line 93
    move-result p1

    .line 94
    new-array v0, p1, [Ljava/lang/Boolean;

    .line 95
    .line 96
    :goto_0
    if-ge v2, p1, :cond_8

    .line 97
    .line 98
    invoke-virtual {p0}, Ljava/io/DataInputStream;->readBoolean()Z

    .line 99
    .line 100
    .line 101
    move-result v1

    .line 102
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 103
    .line 104
    .line 105
    move-result-object v1

    .line 106
    aput-object v1, v0, v2

    .line 107
    .line 108
    add-int/lit8 v2, v2, 0x1

    .line 109
    .line 110
    goto :goto_0

    .line 111
    :cond_8
    return-object v0

    .line 112
    :cond_9
    const/16 v1, 0x9

    .line 113
    .line 114
    if-ne p1, v1, :cond_b

    .line 115
    .line 116
    invoke-virtual {p0}, Ljava/io/DataInputStream;->readInt()I

    .line 117
    .line 118
    .line 119
    move-result p1

    .line 120
    new-array v0, p1, [Ljava/lang/Byte;

    .line 121
    .line 122
    :goto_1
    if-ge v2, p1, :cond_a

    .line 123
    .line 124
    invoke-virtual {p0}, Ljava/io/DataInputStream;->readByte()B

    .line 125
    .line 126
    .line 127
    move-result v1

    .line 128
    invoke-static {v1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 129
    .line 130
    .line 131
    move-result-object v1

    .line 132
    aput-object v1, v0, v2

    .line 133
    .line 134
    add-int/lit8 v2, v2, 0x1

    .line 135
    .line 136
    goto :goto_1

    .line 137
    :cond_a
    return-object v0

    .line 138
    :cond_b
    const/16 v1, 0xa

    .line 139
    .line 140
    if-ne p1, v1, :cond_d

    .line 141
    .line 142
    invoke-virtual {p0}, Ljava/io/DataInputStream;->readInt()I

    .line 143
    .line 144
    .line 145
    move-result p1

    .line 146
    new-array v0, p1, [Ljava/lang/Integer;

    .line 147
    .line 148
    :goto_2
    if-ge v2, p1, :cond_c

    .line 149
    .line 150
    invoke-virtual {p0}, Ljava/io/DataInputStream;->readInt()I

    .line 151
    .line 152
    .line 153
    move-result v1

    .line 154
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 155
    .line 156
    .line 157
    move-result-object v1

    .line 158
    aput-object v1, v0, v2

    .line 159
    .line 160
    add-int/lit8 v2, v2, 0x1

    .line 161
    .line 162
    goto :goto_2

    .line 163
    :cond_c
    return-object v0

    .line 164
    :cond_d
    const/16 v1, 0xb

    .line 165
    .line 166
    if-ne p1, v1, :cond_f

    .line 167
    .line 168
    invoke-virtual {p0}, Ljava/io/DataInputStream;->readInt()I

    .line 169
    .line 170
    .line 171
    move-result p1

    .line 172
    new-array v0, p1, [Ljava/lang/Long;

    .line 173
    .line 174
    :goto_3
    if-ge v2, p1, :cond_e

    .line 175
    .line 176
    invoke-virtual {p0}, Ljava/io/DataInputStream;->readLong()J

    .line 177
    .line 178
    .line 179
    move-result-wide v3

    .line 180
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 181
    .line 182
    .line 183
    move-result-object v1

    .line 184
    aput-object v1, v0, v2

    .line 185
    .line 186
    add-int/lit8 v2, v2, 0x1

    .line 187
    .line 188
    goto :goto_3

    .line 189
    :cond_e
    return-object v0

    .line 190
    :cond_f
    const/16 v1, 0xc

    .line 191
    .line 192
    if-ne p1, v1, :cond_11

    .line 193
    .line 194
    invoke-virtual {p0}, Ljava/io/DataInputStream;->readInt()I

    .line 195
    .line 196
    .line 197
    move-result p1

    .line 198
    new-array v0, p1, [Ljava/lang/Float;

    .line 199
    .line 200
    :goto_4
    if-ge v2, p1, :cond_10

    .line 201
    .line 202
    invoke-virtual {p0}, Ljava/io/DataInputStream;->readFloat()F

    .line 203
    .line 204
    .line 205
    move-result v1

    .line 206
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 207
    .line 208
    .line 209
    move-result-object v1

    .line 210
    aput-object v1, v0, v2

    .line 211
    .line 212
    add-int/lit8 v2, v2, 0x1

    .line 213
    .line 214
    goto :goto_4

    .line 215
    :cond_10
    return-object v0

    .line 216
    :cond_11
    const/16 v1, 0xd

    .line 217
    .line 218
    if-ne p1, v1, :cond_13

    .line 219
    .line 220
    invoke-virtual {p0}, Ljava/io/DataInputStream;->readInt()I

    .line 221
    .line 222
    .line 223
    move-result p1

    .line 224
    new-array v0, p1, [Ljava/lang/Double;

    .line 225
    .line 226
    :goto_5
    if-ge v2, p1, :cond_12

    .line 227
    .line 228
    invoke-virtual {p0}, Ljava/io/DataInputStream;->readDouble()D

    .line 229
    .line 230
    .line 231
    move-result-wide v3

    .line 232
    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 233
    .line 234
    .line 235
    move-result-object v1

    .line 236
    aput-object v1, v0, v2

    .line 237
    .line 238
    add-int/lit8 v2, v2, 0x1

    .line 239
    .line 240
    goto :goto_5

    .line 241
    :cond_12
    return-object v0

    .line 242
    :cond_13
    const/16 v1, 0xe

    .line 243
    .line 244
    if-ne p1, v1, :cond_16

    .line 245
    .line 246
    invoke-virtual {p0}, Ljava/io/DataInputStream;->readInt()I

    .line 247
    .line 248
    .line 249
    move-result p1

    .line 250
    new-array v1, p1, [Ljava/lang/String;

    .line 251
    .line 252
    :goto_6
    if-ge v2, p1, :cond_15

    .line 253
    .line 254
    invoke-virtual {p0}, Ljava/io/DataInputStream;->readUTF()Ljava/lang/String;

    .line 255
    .line 256
    .line 257
    move-result-object v3

    .line 258
    const-string v4, "androidx.work.Data-95ed6082-b8e9-46e8-a73f-ff56f00f5d9d"

    .line 259
    .line 260
    invoke-static {v3, v4}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 261
    .line 262
    .line 263
    move-result v4

    .line 264
    if-eqz v4, :cond_14

    .line 265
    .line 266
    move-object v3, v0

    .line 267
    :cond_14
    aput-object v3, v1, v2

    .line 268
    .line 269
    add-int/lit8 v2, v2, 0x1

    .line 270
    .line 271
    goto :goto_6

    .line 272
    :cond_15
    return-object v1

    .line 273
    :cond_16
    const-string p0, "Unsupported type "

    .line 274
    .line 275
    invoke-static {p1, p0}, Lpc6;->j(ILjava/lang/String;)Ljava/lang/String;

    .line 276
    .line 277
    .line 278
    move-result-object p0

    .line 279
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 280
    .line 281
    .line 282
    return-object v0
.end method

.method public static final E(Landroid/net/Uri;)Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/net/Uri;->getFragment()Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    if-eqz p0, :cond_0

    .line 9
    .line 10
    sget-object v0, Lss8;->a:Lss8;

    .line 11
    .line 12
    invoke-static {p0}, Lss8;->K(Ljava/lang/String;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0

    .line 17
    :cond_0
    const/4 p0, 0x0

    .line 18
    return-object p0
.end method

.method public static final F()Lyy1;
    .locals 3

    .line 1
    invoke-static {}, Lyy1;->d()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-static {}, Lyy1;->a()Lyy1;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Lyy1;->c()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    const/4 v2, 0x1

    .line 16
    if-ne v1, v2, :cond_0

    .line 17
    .line 18
    return-object v0

    .line 19
    :cond_0
    const/4 v0, 0x0

    .line 20
    return-object v0
.end method

.method public static N(Lhx1;I)Lkc3;
    .locals 1

    .line 1
    new-instance p1, Lkc3;

    .line 2
    .line 3
    sget-object v0, Lbe6;->X:Lbe6;

    .line 4
    .line 5
    invoke-direct {p1, p0, v0}, Lkc3;-><init>(Lhx1;Lbe6;)V

    .line 6
    .line 7
    .line 8
    return-object p1
.end method

.method public static final R(Ljava/util/List;Ldn2;)Ljava/util/ArrayList;
    .locals 9

    .line 1
    invoke-interface {p1}, Ldn2;->invoke()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Ljava/lang/Boolean;

    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    if-eqz p1, :cond_3

    .line 12
    .line 13
    new-instance p1, Ljava/util/ArrayList;

    .line 14
    .line 15
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 20
    .line 21
    .line 22
    invoke-interface {p0}, Ljava/util/Collection;->size()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    const/4 v1, 0x0

    .line 27
    move v2, v1

    .line 28
    :goto_0
    if-ge v2, v0, :cond_2

    .line 29
    .line 30
    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    check-cast v3, Ltr4;

    .line 35
    .line 36
    invoke-interface {v3}, Ltr4;->w()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v4

    .line 40
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    check-cast v4, Lg88;

    .line 44
    .line 45
    iget-object v4, v4, Lg88;->X:Ljn0;

    .line 46
    .line 47
    iget-object v5, v4, Ljn0;->Y:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v5, Lb88;

    .line 50
    .line 51
    iget-object v4, v4, Ljn0;->Z:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v4, Lpl;

    .line 54
    .line 55
    iget-object v5, v5, Lb88;->a:Lrh5;

    .line 56
    .line 57
    invoke-virtual {v5}, Lrh5;->getValue()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v5

    .line 61
    check-cast v5, Lx78;

    .line 62
    .line 63
    if-nez v5, :cond_0

    .line 64
    .line 65
    new-instance v4, Lmq7;

    .line 66
    .line 67
    const/16 v5, 0x19

    .line 68
    .line 69
    invoke-direct {v4, v5}, Lmq7;-><init>(B)V

    .line 70
    .line 71
    .line 72
    new-instance v5, Lcb0;

    .line 73
    .line 74
    invoke-direct {v5, v1, v1, v4}, Lcb0;-><init>(IILdn2;)V

    .line 75
    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_0
    invoke-static {v4, v5}, Lb88;->c(Lpl;Lx78;)Lpl;

    .line 79
    .line 80
    .line 81
    move-result-object v4

    .line 82
    if-nez v4, :cond_1

    .line 83
    .line 84
    new-instance v4, Lmq7;

    .line 85
    .line 86
    const/16 v5, 0x1a

    .line 87
    .line 88
    invoke-direct {v4, v5}, Lmq7;-><init>(B)V

    .line 89
    .line 90
    .line 91
    new-instance v5, Lcb0;

    .line 92
    .line 93
    invoke-direct {v5, v1, v1, v4}, Lcb0;-><init>(IILdn2;)V

    .line 94
    .line 95
    .line 96
    goto :goto_1

    .line 97
    :cond_1
    iget v6, v4, Lpl;->b:I

    .line 98
    .line 99
    iget v4, v4, Lpl;->c:I

    .line 100
    .line 101
    invoke-virtual {v5, v6, v4}, Lx78;->j(II)Llf;

    .line 102
    .line 103
    .line 104
    move-result-object v4

    .line 105
    invoke-virtual {v4}, Llf;->d()Ls86;

    .line 106
    .line 107
    .line 108
    move-result-object v4

    .line 109
    invoke-static {v4}, Los4;->L(Ls86;)Llf3;

    .line 110
    .line 111
    .line 112
    move-result-object v4

    .line 113
    invoke-virtual {v4}, Llf3;->d()I

    .line 114
    .line 115
    .line 116
    move-result v5

    .line 117
    invoke-virtual {v4}, Llf3;->b()I

    .line 118
    .line 119
    .line 120
    move-result v6

    .line 121
    new-instance v7, Lv38;

    .line 122
    .line 123
    const/4 v8, 0x3

    .line 124
    invoke-direct {v7, v4, v8}, Lv38;-><init>(Ljava/lang/Object;B)V

    .line 125
    .line 126
    .line 127
    new-instance v4, Lcb0;

    .line 128
    .line 129
    invoke-direct {v4, v5, v6, v7}, Lcb0;-><init>(IILdn2;)V

    .line 130
    .line 131
    .line 132
    move-object v5, v4

    .line 133
    :goto_1
    iget v4, v5, Lcb0;->Y:I

    .line 134
    .line 135
    iget v6, v5, Lcb0;->Z:I

    .line 136
    .line 137
    invoke-static {v4, v4, v6, v6}, Lz68;->B(IIII)J

    .line 138
    .line 139
    .line 140
    move-result-wide v6

    .line 141
    invoke-interface {v3, v6, v7}, Ltr4;->o(J)Leo5;

    .line 142
    .line 143
    .line 144
    move-result-object v3

    .line 145
    new-instance v4, Lqg5;

    .line 146
    .line 147
    iget-object v5, v5, Lcb0;->f0:Ljava/lang/Object;

    .line 148
    .line 149
    check-cast v5, Ldn2;

    .line 150
    .line 151
    invoke-direct {v4, v3, v5}, Lqg5;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 152
    .line 153
    .line 154
    invoke-virtual {p1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 155
    .line 156
    .line 157
    add-int/lit8 v2, v2, 0x1

    .line 158
    .line 159
    goto/16 :goto_0

    .line 160
    .line 161
    :cond_2
    return-object p1

    .line 162
    :cond_3
    const/4 p0, 0x0

    .line 163
    return-object p0
.end method

.method public static V(FFLjava/lang/Object;I)Lwf7;
    .locals 1

    .line 1
    and-int/lit8 v0, p3, 0x1

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/high16 p0, 0x3f800000    # 1.0f

    .line 6
    .line 7
    :cond_0
    and-int/lit8 v0, p3, 0x2

    .line 8
    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    const p1, 0x44bb8000    # 1500.0f

    .line 12
    .line 13
    .line 14
    :cond_1
    and-int/lit8 p3, p3, 0x4

    .line 15
    .line 16
    if-eqz p3, :cond_2

    .line 17
    .line 18
    const/4 p2, 0x0

    .line 19
    :cond_2
    new-instance p3, Lwf7;

    .line 20
    .line 21
    invoke-direct {p3, p0, p1, p2}, Lwf7;-><init>(FFLjava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    return-object p3
.end method

.method public static W()Z
    .locals 2

    .line 1
    sget-object v0, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    const-string v1, "Google"

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    sget-object v0, Landroid/os/Build;->BRAND:Ljava/lang/String;

    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const/4 v0, 0x0

    .line 27
    return v0

    .line 28
    :cond_1
    :goto_0
    sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    sget-object v1, Landroidx/camera/camera2/compat/quirk/ExtraSupportedSurfaceCombinationsQuirk;->c:Ljava/util/Set;

    .line 43
    .line 44
    invoke-interface {v1, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    return v0
.end method

.method public static X()Z
    .locals 4

    .line 1
    sget-object v0, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    const-string v1, "Samsung"

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    const/4 v2, 0x0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    sget-object v0, Landroid/os/Build;->BRAND:Ljava/lang/String;

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_2

    .line 25
    .line 26
    :cond_0
    sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    sget-object v1, Landroidx/camera/camera2/compat/quirk/ExtraSupportedSurfaceCombinationsQuirk;->d:Ljava/util/Set;

    .line 41
    .line 42
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 47
    .line 48
    .line 49
    move-result v3

    .line 50
    if-eqz v3, :cond_2

    .line 51
    .line 52
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    check-cast v3, Ljava/lang/String;

    .line 57
    .line 58
    invoke-static {v0, v2, v3}, Lmm7;->Z(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 59
    .line 60
    .line 61
    move-result v3

    .line 62
    if-eqz v3, :cond_1

    .line 63
    .line 64
    const/4 v0, 0x1

    .line 65
    return v0

    .line 66
    :cond_2
    return v2
.end method

.method public static final Y(Lkx4;Lql;Lo88;Lgn2;IZIILfi2;Ljava/util/List;Lgn2;Lgn2;Lmx;)Lkx4;
    .locals 13

    .line 1
    new-instance v0, Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringElement;

    .line 2
    .line 3
    move-object v1, p1

    .line 4
    move-object v2, p2

    .line 5
    move-object/from16 v4, p3

    .line 6
    .line 7
    move/from16 v5, p4

    .line 8
    .line 9
    move/from16 v6, p5

    .line 10
    .line 11
    move/from16 v7, p6

    .line 12
    .line 13
    move/from16 v8, p7

    .line 14
    .line 15
    move-object/from16 v3, p8

    .line 16
    .line 17
    move-object/from16 v9, p9

    .line 18
    .line 19
    move-object/from16 v10, p10

    .line 20
    .line 21
    move-object/from16 v12, p11

    .line 22
    .line 23
    move-object/from16 v11, p12

    .line 24
    .line 25
    invoke-direct/range {v0 .. v12}, Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringElement;-><init>(Lql;Lo88;Lfi2;Lgn2;IZIILjava/util/List;Lgn2;Lmx;Lgn2;)V

    .line 26
    .line 27
    .line 28
    sget-object p1, Lhx4;->X:Lhx4;

    .line 29
    .line 30
    invoke-interface {p0, p1}, Lkx4;->y(Lkx4;)Lkx4;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    invoke-interface {p0, v0}, Lkx4;->y(Lkx4;)Lkx4;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    return-object p0
.end method

.method public static final Z(Ljava/util/Collection;)[Ljava/lang/Object;
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-interface {p0}, Ljava/util/Collection;->size()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    sget-object v1, Lwl7;->a:[Ljava/lang/Object;

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    return-object v1

    .line 13
    :cond_0
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-nez v2, :cond_1

    .line 22
    .line 23
    return-object v1

    .line 24
    :cond_1
    new-array v0, v0, [Ljava/lang/Object;

    .line 25
    .line 26
    const/4 v1, 0x0

    .line 27
    :goto_0
    add-int/lit8 v2, v1, 0x1

    .line 28
    .line 29
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    aput-object v3, v0, v1

    .line 34
    .line 35
    array-length v1, v0

    .line 36
    if-lt v2, v1, :cond_6

    .line 37
    .line 38
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    if-nez v1, :cond_2

    .line 43
    .line 44
    return-object v0

    .line 45
    :cond_2
    mul-int/lit8 v1, v2, 0x3

    .line 46
    .line 47
    add-int/lit8 v1, v1, 0x1

    .line 48
    .line 49
    ushr-int/lit8 v1, v1, 0x1

    .line 50
    .line 51
    if-gt v1, v2, :cond_4

    .line 52
    .line 53
    const v1, 0x7ffffffd

    .line 54
    .line 55
    .line 56
    if-ge v2, v1, :cond_3

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_3
    new-instance p0, Ljava/lang/OutOfMemoryError;

    .line 60
    .line 61
    invoke-direct {p0}, Ljava/lang/OutOfMemoryError;-><init>()V

    .line 62
    .line 63
    .line 64
    throw p0

    .line 65
    :cond_4
    :goto_1
    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    :cond_5
    move v1, v2

    .line 70
    goto :goto_0

    .line 71
    :cond_6
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 72
    .line 73
    .line 74
    move-result v1

    .line 75
    if-nez v1, :cond_5

    .line 76
    .line 77
    invoke-static {v0, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    return-object p0
.end method

.method public static final a(Lql;Lkx4;Lo88;Lgn2;IZIILjava/util/Map;Lmx;Llp2;II)V
    .locals 20

    move-object/from16 v1, p0

    move/from16 v6, p6

    move/from16 v7, p7

    move-object/from16 v12, p9

    move-object/from16 v5, p10

    move/from16 v13, p11

    const v0, -0x5013ac4b

    .line 1
    invoke-virtual {v5, v0}, Llp2;->X(I)Llp2;

    and-int/lit8 v0, v13, 0x6

    if-nez v0, :cond_1

    invoke-virtual {v5, v1}, Llp2;->f(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v13

    goto :goto_1

    :cond_1
    move v0, v13

    :goto_1
    and-int/lit8 v4, v13, 0x30

    move-object/from16 v8, p1

    if-nez v4, :cond_3

    invoke-virtual {v5, v8}, Llp2;->f(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    const/16 v4, 0x20

    goto :goto_2

    :cond_2
    const/16 v4, 0x10

    :goto_2
    or-int/2addr v0, v4

    :cond_3
    and-int/lit16 v4, v13, 0x180

    if-nez v4, :cond_5

    move-object/from16 v4, p2

    invoke-virtual {v5, v4}, Llp2;->f(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_4

    const/16 v9, 0x100

    goto :goto_3

    :cond_4
    const/16 v9, 0x80

    :goto_3
    or-int/2addr v0, v9

    goto :goto_4

    :cond_5
    move-object/from16 v4, p2

    :goto_4
    and-int/lit16 v9, v13, 0xc00

    if-nez v9, :cond_7

    move-object/from16 v9, p3

    invoke-virtual {v5, v9}, Llp2;->h(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_6

    const/16 v10, 0x800

    goto :goto_5

    :cond_6
    const/16 v10, 0x400

    :goto_5
    or-int/2addr v0, v10

    goto :goto_6

    :cond_7
    move-object/from16 v9, p3

    :goto_6
    and-int/lit16 v10, v13, 0x6000

    if-nez v10, :cond_9

    move/from16 v10, p4

    invoke-virtual {v5, v10}, Llp2;->d(I)Z

    move-result v11

    if-eqz v11, :cond_8

    const/16 v11, 0x4000

    goto :goto_7

    :cond_8
    const/16 v11, 0x2000

    :goto_7
    or-int/2addr v0, v11

    goto :goto_8

    :cond_9
    move/from16 v10, p4

    :goto_8
    const/high16 v11, 0x30000

    and-int/2addr v11, v13

    if-nez v11, :cond_b

    move/from16 v11, p5

    invoke-virtual {v5, v11}, Llp2;->g(Z)Z

    move-result v14

    if-eqz v14, :cond_a

    const/high16 v14, 0x20000

    goto :goto_9

    :cond_a
    const/high16 v14, 0x10000

    :goto_9
    or-int/2addr v0, v14

    goto :goto_a

    :cond_b
    move/from16 v11, p5

    :goto_a
    const/high16 v14, 0x180000

    and-int/2addr v14, v13

    if-nez v14, :cond_d

    invoke-virtual {v5, v6}, Llp2;->d(I)Z

    move-result v14

    if-eqz v14, :cond_c

    const/high16 v14, 0x100000

    goto :goto_b

    :cond_c
    const/high16 v14, 0x80000

    :goto_b
    or-int/2addr v0, v14

    :cond_d
    const/high16 v14, 0xc00000

    and-int/2addr v14, v13

    if-nez v14, :cond_f

    invoke-virtual {v5, v7}, Llp2;->d(I)Z

    move-result v14

    if-eqz v14, :cond_e

    const/high16 v14, 0x800000

    goto :goto_c

    :cond_e
    const/high16 v14, 0x400000

    :goto_c
    or-int/2addr v0, v14

    :cond_f
    const/high16 v14, 0x6000000

    and-int/2addr v14, v13

    if-nez v14, :cond_11

    move-object/from16 v14, p8

    invoke-virtual {v5, v14}, Llp2;->h(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_10

    const/high16 v15, 0x4000000

    goto :goto_d

    :cond_10
    const/high16 v15, 0x2000000

    :goto_d
    or-int/2addr v0, v15

    goto :goto_e

    :cond_11
    move-object/from16 v14, p8

    :goto_e
    const/high16 v15, 0x30000000

    or-int/2addr v0, v15

    and-int/lit8 v15, p12, 0x6

    if-nez v15, :cond_14

    and-int/lit8 v15, p12, 0x8

    if-nez v15, :cond_12

    invoke-virtual {v5, v12}, Llp2;->f(Ljava/lang/Object;)Z

    move-result v15

    goto :goto_f

    :cond_12
    invoke-virtual {v5, v12}, Llp2;->h(Ljava/lang/Object;)Z

    move-result v15

    :goto_f
    if-eqz v15, :cond_13

    const/4 v15, 0x4

    goto :goto_10

    :cond_13
    const/4 v15, 0x2

    :goto_10
    or-int v15, p12, v15

    goto :goto_11

    :cond_14
    move/from16 v15, p12

    :goto_11
    const v16, 0x12492493

    and-int v2, v0, v16

    const v3, 0x12492492

    const/4 v9, 0x0

    if-ne v2, v3, :cond_16

    and-int/lit8 v2, v15, 0x3

    const/4 v3, 0x2

    if-eq v2, v3, :cond_15

    goto :goto_12

    :cond_15
    move v2, v9

    goto :goto_13

    :cond_16
    :goto_12
    const/4 v2, 0x1

    :goto_13
    and-int/lit8 v3, v0, 0x1

    invoke-virtual {v5, v3, v2}, Llp2;->N(IZ)Z

    move-result v2

    if-eqz v2, :cond_24

    .line 2
    invoke-static {v7, v6}, Lvr3;->k0(II)V

    .line 3
    sget-object v2, Lq07;->a:Lox1;

    .line 4
    invoke-virtual {v5, v2}, Llp2;->j(Lq06;)Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_23

    const v2, 0x5eb4b1b1

    .line 5
    invoke-virtual {v5, v2}, Llp2;->W(I)V

    .line 6
    invoke-virtual {v5, v9}, Llp2;->p(Z)V

    .line 7
    sget-object v2, Ltl;->a:Lqg5;

    .line 8
    iget-object v2, v1, Lql;->Y:Ljava/lang/String;

    .line 9
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    .line 10
    iget-object v3, v1, Lql;->X:Ljava/util/List;

    if-eqz v3, :cond_1b

    .line 11
    invoke-interface {v3}, Ljava/util/Collection;->size()I

    move-result v10

    :goto_14
    if-ge v9, v10, :cond_1a

    .line 12
    invoke-interface {v3, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v18

    move/from16 v19, v0

    .line 13
    move-object/from16 v0, v18

    check-cast v0, Lpl;

    .line 14
    iget-object v1, v0, Lpl;->a:Ljava/lang/Object;

    .line 15
    instance-of v1, v1, Lul7;

    if-eqz v1, :cond_18

    .line 16
    iget-object v1, v0, Lpl;->d:Ljava/lang/String;

    move-object/from16 v18, v3

    .line 17
    const-string v3, "androidx.compose.foundation.text.inlineContent"

    invoke-virtual {v3, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_17

    .line 18
    iget v1, v0, Lpl;->b:I

    .line 19
    iget v0, v0, Lpl;->c:I

    const/4 v3, 0x0

    .line 20
    invoke-static {v3, v2, v1, v0}, Lrl;->b(IIII)Z

    move-result v0

    if-eqz v0, :cond_19

    move/from16 v17, v3

    const/4 v3, 0x1

    goto :goto_19

    :cond_17
    :goto_15
    const/4 v3, 0x0

    goto :goto_16

    :cond_18
    move-object/from16 v18, v3

    goto :goto_15

    :cond_19
    :goto_16
    add-int/lit8 v9, v9, 0x1

    move-object/from16 v1, p0

    move-object/from16 v3, v18

    move/from16 v0, v19

    goto :goto_14

    :cond_1a
    const/4 v3, 0x0

    :goto_17
    move/from16 v19, v0

    goto :goto_18

    :cond_1b
    move v3, v9

    goto :goto_17

    :goto_18
    move/from16 v17, v3

    .line 21
    :goto_19
    invoke-static/range {p0 .. p0}, Lu28;->i(Lql;)Z

    move-result v0

    .line 22
    sget-object v1, Ly01;->k:Lox1;

    .line 23
    invoke-virtual {v5, v1}, Llp2;->j(Lq06;)Ljava/lang/Object;

    move-result-object v1

    .line 24
    move-object v10, v1

    check-cast v10, Lfi2;

    if-nez v3, :cond_1d

    if-nez v0, :cond_1d

    const v0, 0x5eb879f5

    .line 25
    invoke-virtual {v5, v0}, Llp2;->W(I)V

    const/4 v3, 0x0

    move-object/from16 v0, p0

    move-object v1, v4

    move-object v2, v10

    move v4, v11

    .line 26
    invoke-static/range {v0 .. v5}, Lf40;->a(Lql;Lo88;Lfi2;Ljava/util/List;ZLlp2;)V

    move-object v13, v5

    const/4 v0, 0x0

    const/4 v11, 0x0

    const/4 v9, 0x0

    move-object v1, v10

    move-object v10, v0

    move-object v0, v8

    move-object v8, v1

    move-object/from16 v1, p0

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move/from16 v4, p4

    move/from16 v5, p5

    const/4 v15, 0x1

    .line 27
    invoke-static/range {v0 .. v12}, Lwl7;->Y(Lkx4;Lql;Lo88;Lgn2;IZIILfi2;Ljava/util/List;Lgn2;Lgn2;Lmx;)Lkx4;

    move-result-object v8

    .line 28
    sget-object v0, Lld;->f:Lld;

    .line 29
    iget-wide v1, v13, Llp2;->T:J

    .line 30
    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    .line 31
    invoke-static {v13, v8}, Lw45;->Q(Llp2;Lkx4;)Lkx4;

    move-result-object v2

    .line 32
    invoke-virtual {v13}, Llp2;->l()Lkl5;

    move-result-object v3

    .line 33
    sget-object v4, Luz0;->j:Lpz2;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    invoke-virtual {v13}, Llp2;->Z()V

    .line 35
    iget-boolean v4, v13, Llp2;->S:Z

    if-eqz v4, :cond_1c

    .line 36
    invoke-virtual {v13}, Llp2;->k()V

    goto :goto_1a

    .line 37
    :cond_1c
    invoke-virtual {v13}, Llp2;->j0()V

    .line 38
    :goto_1a
    sget-object v4, Lpz2;->B0:Ldx0;

    .line 39
    invoke-static {v4, v13, v0}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 40
    sget-object v0, Lpz2;->A0:Ldx0;

    .line 41
    invoke-static {v0, v13, v3}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 42
    invoke-static {v13}, Lpn7;->l(Llp2;)V

    .line 43
    sget-object v0, Lpz2;->z0:Ldx0;

    .line 44
    invoke-static {v0, v13, v2}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 45
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    .line 46
    sget-object v1, Lpz2;->C0:Ldx0;

    .line 47
    invoke-static {v1, v13, v0}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 48
    invoke-virtual {v13, v15}, Llp2;->p(Z)V

    const/4 v3, 0x0

    .line 49
    invoke-virtual {v13, v3}, Llp2;->p(Z)V

    move-object v5, v13

    goto/16 :goto_1c

    :cond_1d
    move-object v13, v5

    move v0, v15

    const/4 v15, 0x1

    const v1, 0x5ec875d6

    .line 50
    invoke-virtual {v13, v1}, Llp2;->W(I)V

    and-int/lit8 v1, v19, 0xe

    const/4 v2, 0x4

    if-ne v1, v2, :cond_1e

    move v9, v15

    goto :goto_1b

    :cond_1e
    move/from16 v9, v17

    .line 51
    :goto_1b
    invoke-virtual {v13}, Llp2;->K()Ljava/lang/Object;

    move-result-object v1

    .line 52
    sget-object v2, Lzz0;->a:Lbe;

    if-nez v9, :cond_1f

    if-ne v1, v2, :cond_20

    .line 53
    :cond_1f
    invoke-static/range {p0 .. p0}, Lz51;->H(Ljava/lang/Object;)Lrh5;

    move-result-object v1

    .line 54
    invoke-virtual {v13, v1}, Llp2;->g0(Ljava/lang/Object;)V

    .line 55
    :cond_20
    check-cast v1, Ly05;

    .line 56
    invoke-interface {v1}, Llh7;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lql;

    .line 57
    invoke-virtual {v13, v1}, Llp2;->f(Ljava/lang/Object;)Z

    move-result v5

    .line 58
    invoke-virtual {v13}, Llp2;->K()Ljava/lang/Object;

    move-result-object v6

    if-nez v5, :cond_21

    if-ne v6, v2, :cond_22

    .line 59
    :cond_21
    new-instance v6, Lgh;

    const/4 v2, 0x2

    invoke-direct {v6, v1, v2}, Lgh;-><init>(Ly05;B)V

    .line 60
    invoke-virtual {v13, v6}, Llp2;->g0(Ljava/lang/Object;)V

    .line 61
    :cond_22
    move-object v11, v6

    check-cast v11, Lgn2;

    shr-int/lit8 v1, v19, 0x3

    and-int/lit16 v1, v1, 0x38e

    shr-int/lit8 v2, v19, 0xc

    const v5, 0xe000

    and-int/2addr v2, v5

    or-int/2addr v1, v2

    shl-int/lit8 v2, v19, 0x9

    const/high16 v6, 0x70000

    and-int/2addr v2, v6

    or-int/2addr v1, v2

    shl-int/lit8 v2, v19, 0x6

    const/high16 v6, 0x380000

    and-int/2addr v6, v2

    or-int/2addr v1, v6

    const/high16 v6, 0x1c00000

    and-int/2addr v6, v2

    or-int/2addr v1, v6

    const/high16 v6, 0xe000000

    and-int/2addr v6, v2

    or-int/2addr v1, v6

    const/high16 v6, 0x70000000

    and-int/2addr v2, v6

    or-int/2addr v1, v2

    shr-int/lit8 v2, v19, 0x15

    and-int/lit16 v2, v2, 0x380

    shl-int/lit8 v0, v0, 0xc

    and-int/2addr v0, v5

    or-int v15, v2, v0

    move-object v0, v14

    move v14, v1

    move-object v1, v4

    move-object v4, v0

    move-object/from16 v0, p1

    move-object/from16 v5, p2

    move-object/from16 v2, p3

    move/from16 v6, p4

    move/from16 v7, p5

    move/from16 v8, p6

    move/from16 v9, p7

    move-object/from16 v12, p9

    .line 62
    invoke-static/range {v0 .. v15}, Lwl7;->d(Lkx4;Lql;Lgn2;ZLjava/util/Map;Lo88;IZIILfi2;Lgn2;Lmx;Llp2;II)V

    move-object v5, v13

    const/4 v3, 0x0

    .line 63
    invoke-virtual {v5, v3}, Llp2;->p(Z)V

    goto :goto_1c

    .line 64
    :cond_23
    invoke-static {}, Lio/sentry/c2;->m()V

    return-void

    .line 65
    :cond_24
    invoke-virtual {v5}, Llp2;->Q()V

    .line 66
    :goto_1c
    invoke-virtual {v5}, Llp2;->r()Lj86;

    move-result-object v13

    if-eqz v13, :cond_25

    new-instance v0, Lz30;

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move/from16 v5, p4

    move/from16 v6, p5

    move/from16 v7, p6

    move/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move/from16 v11, p11

    move/from16 v12, p12

    invoke-direct/range {v0 .. v12}, Lz30;-><init>(Lql;Lkx4;Lo88;Lgn2;IZIILjava/util/Map;Lmx;II)V

    .line 67
    iput-object v0, v13, Lj86;->d:Lrn2;

    :cond_25
    return-void
.end method

.method public static final a0(Ljava/util/Collection;[Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 5

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-interface {p0}, Ljava/util/Collection;->size()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, 0x0

    .line 12
    const/4 v2, 0x0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    array-length p0, p1

    .line 16
    if-lez p0, :cond_1

    .line 17
    .line 18
    aput-object v1, p1, v2

    .line 19
    .line 20
    return-object p1

    .line 21
    :cond_0
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    if-nez v3, :cond_2

    .line 30
    .line 31
    array-length p0, p1

    .line 32
    if-lez p0, :cond_1

    .line 33
    .line 34
    aput-object v1, p1, v2

    .line 35
    .line 36
    :cond_1
    return-object p1

    .line 37
    :cond_2
    array-length v3, p1

    .line 38
    if-gt v0, v3, :cond_3

    .line 39
    .line 40
    move-object v0, p1

    .line 41
    goto :goto_0

    .line 42
    :cond_3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    invoke-virtual {v3}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    invoke-static {v3, v0}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    check-cast v0, [Ljava/lang/Object;

    .line 58
    .line 59
    :goto_0
    add-int/lit8 v3, v2, 0x1

    .line 60
    .line 61
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v4

    .line 65
    aput-object v4, v0, v2

    .line 66
    .line 67
    array-length v2, v0

    .line 68
    if-lt v3, v2, :cond_8

    .line 69
    .line 70
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 71
    .line 72
    .line 73
    move-result v2

    .line 74
    if-nez v2, :cond_4

    .line 75
    .line 76
    return-object v0

    .line 77
    :cond_4
    mul-int/lit8 v2, v3, 0x3

    .line 78
    .line 79
    add-int/lit8 v2, v2, 0x1

    .line 80
    .line 81
    ushr-int/lit8 v2, v2, 0x1

    .line 82
    .line 83
    if-gt v2, v3, :cond_6

    .line 84
    .line 85
    const v2, 0x7ffffffd

    .line 86
    .line 87
    .line 88
    if-ge v3, v2, :cond_5

    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_5
    new-instance p0, Ljava/lang/OutOfMemoryError;

    .line 92
    .line 93
    invoke-direct {p0}, Ljava/lang/OutOfMemoryError;-><init>()V

    .line 94
    .line 95
    .line 96
    throw p0

    .line 97
    :cond_6
    :goto_1
    invoke-static {v0, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    :cond_7
    move v2, v3

    .line 102
    goto :goto_0

    .line 103
    :cond_8
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 104
    .line 105
    .line 106
    move-result v2

    .line 107
    if-nez v2, :cond_7

    .line 108
    .line 109
    if-ne v0, p1, :cond_9

    .line 110
    .line 111
    aput-object v1, p1, v3

    .line 112
    .line 113
    return-object p1

    .line 114
    :cond_9
    invoke-static {v0, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object p0

    .line 118
    return-object p0
.end method

.method public static final b(Ljava/lang/String;Lkx4;Lo88;Lgn2;IZIILmx;Llp2;II)V
    .locals 20

    move-object/from16 v1, p0

    move-object/from16 v8, p1

    move/from16 v7, p6

    move-object/from16 v0, p8

    move-object/from16 v13, p9

    move/from16 v14, p10

    move/from16 v15, p11

    const v2, -0x3e089999

    .line 1
    invoke-virtual {v13, v2}, Llp2;->X(I)Llp2;

    and-int/lit8 v2, v14, 0x6

    if-nez v2, :cond_1

    invoke-virtual {v13, v1}, Llp2;->f(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    goto :goto_0

    :cond_0
    const/4 v2, 0x2

    :goto_0
    or-int/2addr v2, v14

    goto :goto_1

    :cond_1
    move v2, v14

    :goto_1
    and-int/lit8 v3, v14, 0x30

    if-nez v3, :cond_3

    invoke-virtual {v13, v8}, Llp2;->f(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    const/16 v3, 0x20

    goto :goto_2

    :cond_2
    const/16 v3, 0x10

    :goto_2
    or-int/2addr v2, v3

    :cond_3
    and-int/lit16 v3, v14, 0x180

    if-nez v3, :cond_5

    move-object/from16 v3, p2

    invoke-virtual {v13, v3}, Llp2;->f(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    const/16 v4, 0x100

    goto :goto_3

    :cond_4
    const/16 v4, 0x80

    :goto_3
    or-int/2addr v2, v4

    goto :goto_4

    :cond_5
    move-object/from16 v3, p2

    :goto_4
    and-int/lit8 v4, v15, 0x8

    if-eqz v4, :cond_7

    or-int/lit16 v2, v2, 0xc00

    :cond_6
    move-object/from16 v5, p3

    goto :goto_6

    :cond_7
    and-int/lit16 v5, v14, 0xc00

    if-nez v5, :cond_6

    move-object/from16 v5, p3

    invoke-virtual {v13, v5}, Llp2;->h(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_8

    const/16 v6, 0x800

    goto :goto_5

    :cond_8
    const/16 v6, 0x400

    :goto_5
    or-int/2addr v2, v6

    :goto_6
    and-int/lit8 v6, v15, 0x10

    if-eqz v6, :cond_a

    or-int/lit16 v2, v2, 0x6000

    :cond_9
    move/from16 v9, p4

    goto :goto_8

    :cond_a
    and-int/lit16 v9, v14, 0x6000

    if-nez v9, :cond_9

    move/from16 v9, p4

    invoke-virtual {v13, v9}, Llp2;->d(I)Z

    move-result v10

    if-eqz v10, :cond_b

    const/16 v10, 0x4000

    goto :goto_7

    :cond_b
    const/16 v10, 0x2000

    :goto_7
    or-int/2addr v2, v10

    :goto_8
    and-int/lit8 v10, v15, 0x20

    const/high16 v11, 0x30000

    if-eqz v10, :cond_d

    or-int/2addr v2, v11

    :cond_c
    move/from16 v11, p5

    goto :goto_a

    :cond_d
    and-int/2addr v11, v14

    if-nez v11, :cond_c

    move/from16 v11, p5

    invoke-virtual {v13, v11}, Llp2;->g(Z)Z

    move-result v12

    if-eqz v12, :cond_e

    const/high16 v12, 0x20000

    goto :goto_9

    :cond_e
    const/high16 v12, 0x10000

    :goto_9
    or-int/2addr v2, v12

    :goto_a
    const/high16 v12, 0x180000

    and-int/2addr v12, v14

    if-nez v12, :cond_10

    invoke-virtual {v13, v7}, Llp2;->d(I)Z

    move-result v12

    if-eqz v12, :cond_f

    const/high16 v12, 0x100000

    goto :goto_b

    :cond_f
    const/high16 v12, 0x80000

    :goto_b
    or-int/2addr v2, v12

    :cond_10
    and-int/lit16 v12, v15, 0x80

    const/high16 v16, 0xc00000

    if-eqz v12, :cond_11

    or-int v2, v2, v16

    move/from16 v1, p7

    goto :goto_d

    :cond_11
    and-int v16, v14, v16

    move/from16 v1, p7

    if-nez v16, :cond_13

    invoke-virtual {v13, v1}, Llp2;->d(I)Z

    move-result v16

    if-eqz v16, :cond_12

    const/high16 v16, 0x800000

    goto :goto_c

    :cond_12
    const/high16 v16, 0x400000

    :goto_c
    or-int v2, v2, v16

    :cond_13
    :goto_d
    const/high16 v16, 0x6000000

    or-int v16, v2, v16

    and-int/lit16 v1, v15, 0x200

    if-eqz v1, :cond_14

    const/high16 v16, 0x36000000

    or-int v16, v2, v16

    goto :goto_10

    :cond_14
    const/high16 v2, 0x30000000

    and-int/2addr v2, v14

    if-nez v2, :cond_17

    const/high16 v2, 0x40000000    # 2.0f

    and-int/2addr v2, v14

    if-nez v2, :cond_15

    invoke-virtual {v13, v0}, Llp2;->f(Ljava/lang/Object;)Z

    move-result v2

    goto :goto_e

    :cond_15
    invoke-virtual {v13, v0}, Llp2;->h(Ljava/lang/Object;)Z

    move-result v2

    :goto_e
    if-eqz v2, :cond_16

    const/high16 v2, 0x20000000

    goto :goto_f

    :cond_16
    const/high16 v2, 0x10000000

    :goto_f
    or-int v16, v16, v2

    :cond_17
    :goto_10
    const v2, 0x12492493

    and-int v2, v16, v2

    const v0, 0x12492492

    const/4 v9, 0x0

    move/from16 v17, v10

    const/4 v10, 0x1

    if-eq v2, v0, :cond_18

    move v0, v10

    goto :goto_11

    :cond_18
    move v0, v9

    :goto_11
    and-int/lit8 v2, v16, 0x1

    invoke-virtual {v13, v2, v0}, Llp2;->N(IZ)Z

    move-result v0

    if-eqz v0, :cond_23

    const/4 v0, 0x0

    if-eqz v4, :cond_19

    move-object/from16 v16, v0

    goto :goto_12

    :cond_19
    move-object/from16 v16, v5

    :goto_12
    if-eqz v6, :cond_1a

    move/from16 v18, v10

    goto :goto_13

    :cond_1a
    move/from16 v18, p4

    :goto_13
    if-eqz v17, :cond_1b

    move v5, v10

    goto :goto_14

    :cond_1b
    move v5, v11

    :goto_14
    if-eqz v12, :cond_1c

    move v11, v10

    goto :goto_15

    :cond_1c
    move/from16 v11, p7

    :goto_15
    if-eqz v1, :cond_1d

    move-object v12, v0

    goto :goto_16

    :cond_1d
    move-object/from16 v12, p8

    .line 2
    :goto_16
    invoke-static {v11, v7}, Lvr3;->k0(II)V

    .line 3
    sget-object v0, Lq07;->a:Lox1;

    .line 4
    invoke-virtual {v13, v0}, Llp2;->j(Lq06;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_22

    const v0, 0x15483a7f

    .line 5
    invoke-virtual {v13, v0}, Llp2;->W(I)V

    .line 6
    invoke-virtual {v13, v9}, Llp2;->p(Z)V

    .line 7
    sget-object v0, Ly01;->k:Lox1;

    .line 8
    invoke-virtual {v13, v0}, Llp2;->j(Lq06;)Ljava/lang/Object;

    move-result-object v0

    .line 9
    check-cast v0, Lfi2;

    .line 10
    sget-object v1, Lf40;->a:Lox1;

    .line 11
    invoke-virtual {v13, v1}, Llp2;->j(Lq06;)Ljava/lang/Object;

    move-result-object v1

    .line 12
    check-cast v1, Ljava/util/concurrent/Executor;

    if-eqz v1, :cond_1e

    .line 13
    invoke-virtual/range {p0 .. p0}, Ljava/lang/String;->length()I

    move-result v2

    invoke-static {v2}, Lf40;->b(I)Z

    move-result v2

    if-eqz v2, :cond_1e

    const v2, -0x4a85808e

    invoke-virtual {v13, v2}, Llp2;->W(I)V

    .line 14
    sget-object v2, Ly01;->n:Lox1;

    .line 15
    invoke-virtual {v13, v2}, Llp2;->j(Lq06;)Ljava/lang/Object;

    move-result-object v2

    .line 16
    check-cast v2, Lz24;

    .line 17
    sget-object v4, Ly01;->h:Lox1;

    .line 18
    invoke-virtual {v13, v4}, Llp2;->j(Lq06;)Ljava/lang/Object;

    move-result-object v4

    .line 19
    check-cast v4, Lfi1;

    move v6, v5

    move-object v5, v0

    .line 20
    :try_start_0
    new-instance v0, Le40;

    move-object v10, v1

    move-object v1, v3

    move-object/from16 v3, p0

    invoke-direct/range {v0 .. v6}, Le40;-><init>(Lo88;Lz24;Ljava/lang/String;Lfi1;Lfi2;Z)V
    :try_end_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v3, v5

    move v5, v6

    :try_start_1
    invoke-interface {v10, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_1
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_17

    :catch_0
    move-object v3, v5

    move v5, v6

    .line 21
    :catch_1
    :goto_17
    invoke-virtual {v13, v9}, Llp2;->p(Z)V

    goto :goto_18

    :cond_1e
    move-object v3, v0

    const v0, -0x4a69eb75

    .line 22
    invoke-virtual {v13, v0}, Llp2;->W(I)V

    .line 23
    invoke-virtual {v13, v9}, Llp2;->p(Z)V

    :goto_18
    if-nez v16, :cond_1f

    if-eqz v12, :cond_20

    :cond_1f
    move-object/from16 v0, p0

    move v7, v11

    move/from16 v4, v18

    goto :goto_19

    :cond_20
    const v0, 0x1557cf53

    .line 24
    invoke-virtual {v13, v0}, Llp2;->W(I)V

    .line 25
    invoke-virtual {v13, v9}, Llp2;->p(Z)V

    .line 26
    new-instance v0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;

    move-object/from16 v1, p0

    move-object/from16 v2, p2

    move v6, v7

    move v7, v11

    move/from16 v4, v18

    .line 27
    invoke-direct/range {v0 .. v7}, Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;-><init>(Ljava/lang/String;Lo88;Lfi2;IZII)V

    move-object/from16 v19, v1

    move-object v1, v0

    move-object/from16 v0, v19

    .line 28
    invoke-interface {v8, v1}, Lkx4;->y(Lkx4;)Lkx4;

    move-result-object v1

    move-object/from16 v3, v16

    const/4 v15, 0x1

    goto :goto_1a

    :goto_19
    const v1, 0x154dfcb1

    .line 29
    invoke-virtual {v13, v1}, Llp2;->W(I)V

    .line 30
    new-instance v1, Lql;

    invoke-direct {v1, v0}, Lql;-><init>(Ljava/lang/String;)V

    .line 31
    sget-object v2, Ly01;->k:Lox1;

    .line 32
    invoke-virtual {v13, v2}, Llp2;->j(Lq06;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lfi2;

    const/4 v10, 0x0

    const/4 v11, 0x0

    move v3, v9

    const/4 v9, 0x0

    move/from16 v6, p6

    move v14, v3

    move-object v0, v8

    move-object/from16 v3, v16

    const/4 v15, 0x1

    move-object v8, v2

    move-object/from16 v2, p2

    .line 33
    invoke-static/range {v0 .. v12}, Lwl7;->Y(Lkx4;Lql;Lo88;Lgn2;IZIILfi2;Ljava/util/List;Lgn2;Lgn2;Lmx;)Lkx4;

    move-result-object v1

    .line 34
    invoke-virtual {v13, v14}, Llp2;->p(Z)V

    .line 35
    :goto_1a
    sget-object v0, Lld;->f:Lld;

    .line 36
    iget-wide v8, v13, Llp2;->T:J

    .line 37
    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    move-result v2

    .line 38
    invoke-static {v13, v1}, Lw45;->Q(Llp2;Lkx4;)Lkx4;

    move-result-object v1

    .line 39
    invoke-virtual {v13}, Llp2;->l()Lkl5;

    move-result-object v6

    .line 40
    sget-object v8, Luz0;->j:Lpz2;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    invoke-virtual {v13}, Llp2;->Z()V

    .line 42
    iget-boolean v8, v13, Llp2;->S:Z

    if-eqz v8, :cond_21

    .line 43
    invoke-virtual {v13}, Llp2;->k()V

    goto :goto_1b

    .line 44
    :cond_21
    invoke-virtual {v13}, Llp2;->j0()V

    .line 45
    :goto_1b
    sget-object v8, Lpz2;->B0:Ldx0;

    .line 46
    invoke-static {v8, v13, v0}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 47
    sget-object v0, Lpz2;->A0:Ldx0;

    .line 48
    invoke-static {v0, v13, v6}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 49
    invoke-static {v13}, Lpn7;->l(Llp2;)V

    .line 50
    sget-object v0, Lpz2;->z0:Ldx0;

    .line 51
    invoke-static {v0, v13, v1}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 52
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    .line 53
    sget-object v1, Lpz2;->C0:Ldx0;

    .line 54
    invoke-static {v1, v13, v0}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 55
    invoke-virtual {v13, v15}, Llp2;->p(Z)V

    move v6, v5

    move v8, v7

    move-object v9, v12

    move v5, v4

    move-object v4, v3

    goto :goto_1c

    .line 56
    :cond_22
    invoke-static {}, Lio/sentry/c2;->m()V

    return-void

    .line 57
    :cond_23
    invoke-virtual {v13}, Llp2;->Q()V

    move/from16 v8, p7

    move-object/from16 v9, p8

    move-object v4, v5

    move v6, v11

    move/from16 v5, p4

    .line 58
    :goto_1c
    invoke-virtual {v13}, Llp2;->r()Lj86;

    move-result-object v12

    if-eqz v12, :cond_24

    new-instance v0, Ly30;

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v7, p6

    move/from16 v10, p10

    move/from16 v11, p11

    invoke-direct/range {v0 .. v11}, Ly30;-><init>(Ljava/lang/String;Lkx4;Lo88;Lgn2;IZIILmx;II)V

    .line 59
    iput-object v0, v12, Lj86;->d:Lrn2;

    :cond_24
    return-void
.end method

.method public static final b0(ILjava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Liq0;->a:Ljava/nio/charset/Charset;

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-static {p1, p0}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    return-object p0
.end method

.method public static final c(ZZLdn2;Llp2;II)V
    .locals 23

    .line 1
    move-object/from16 v5, p3

    .line 2
    .line 3
    and-int/lit8 v0, p5, 0x4

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    move v3, v0

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    move/from16 v3, p1

    .line 11
    .line 12
    :goto_0
    sget-object v0, Lep;->z:Lox1;

    .line 13
    .line 14
    invoke-virtual {v5, v0}, Llp2;->j(Lq06;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    check-cast v1, Ldp;

    .line 19
    .line 20
    iget-object v1, v1, Ldp;->f:Lrr;

    .line 21
    .line 22
    iget-wide v1, v1, Lrr;->a:J

    .line 23
    .line 24
    invoke-virtual {v5, v0}, Llp2;->j(Lq06;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    check-cast v4, Ldp;

    .line 29
    .line 30
    iget-object v4, v4, Ldp;->f:Lrr;

    .line 31
    .line 32
    iget-wide v6, v4, Lrr;->a:J

    .line 33
    .line 34
    invoke-virtual {v5, v0}, Llp2;->j(Lq06;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v4

    .line 38
    check-cast v4, Ldp;

    .line 39
    .line 40
    iget-object v4, v4, Ldp;->f:Lrr;

    .line 41
    .line 42
    iget-wide v8, v4, Lrr;->b:J

    .line 43
    .line 44
    invoke-virtual {v5, v0}, Llp2;->j(Lq06;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    check-cast v0, Ldp;

    .line 49
    .line 50
    iget-object v0, v0, Ldp;->f:Lrr;

    .line 51
    .line 52
    iget-wide v10, v0, Lrr;->b:J

    .line 53
    .line 54
    sget-object v0, Lkw0;->a:Lox1;

    .line 55
    .line 56
    invoke-virtual {v5, v0}, Llp2;->j(Lq06;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    check-cast v0, Liw0;

    .line 61
    .line 62
    iget-object v4, v0, Liw0;->Z:Lj66;

    .line 63
    .line 64
    if-nez v4, :cond_1

    .line 65
    .line 66
    new-instance v12, Lj66;

    .line 67
    .line 68
    sget-object v4, Loc;->q:Ljw0;

    .line 69
    .line 70
    invoke-static {v0, v4}, Lkw0;->b(Liw0;Ljw0;)J

    .line 71
    .line 72
    .line 73
    move-result-wide v13

    .line 74
    sget-object v4, Loc;->s:Ljw0;

    .line 75
    .line 76
    invoke-static {v0, v4}, Lkw0;->b(Liw0;Ljw0;)J

    .line 77
    .line 78
    .line 79
    move-result-wide v15

    .line 80
    sget-object v4, Loc;->n:Ljw0;

    .line 81
    .line 82
    move-wide/from16 v21, v1

    .line 83
    .line 84
    invoke-static {v0, v4}, Lkw0;->b(Liw0;Ljw0;)J

    .line 85
    .line 86
    .line 87
    move-result-wide v1

    .line 88
    const v4, 0x3ec28f5c    # 0.38f

    .line 89
    .line 90
    .line 91
    invoke-static {v4, v1, v2}, Ldw0;->b(FJ)J

    .line 92
    .line 93
    .line 94
    move-result-wide v17

    .line 95
    sget-object v1, Loc;->o:Ljw0;

    .line 96
    .line 97
    invoke-static {v0, v1}, Lkw0;->b(Liw0;Ljw0;)J

    .line 98
    .line 99
    .line 100
    move-result-wide v1

    .line 101
    invoke-static {v4, v1, v2}, Ldw0;->b(FJ)J

    .line 102
    .line 103
    .line 104
    move-result-wide v19

    .line 105
    invoke-direct/range {v12 .. v20}, Lj66;-><init>(JJJJ)V

    .line 106
    .line 107
    .line 108
    iput-object v12, v0, Liw0;->Z:Lj66;

    .line 109
    .line 110
    move-object v4, v12

    .line 111
    goto :goto_1

    .line 112
    :cond_1
    move-wide/from16 v21, v1

    .line 113
    .line 114
    :goto_1
    const-wide/16 v0, 0x10

    .line 115
    .line 116
    cmp-long v2, v21, v0

    .line 117
    .line 118
    if-eqz v2, :cond_2

    .line 119
    .line 120
    move-wide/from16 v15, v21

    .line 121
    .line 122
    goto :goto_2

    .line 123
    :cond_2
    iget-wide v12, v4, Lj66;->a:J

    .line 124
    .line 125
    move-wide v15, v12

    .line 126
    :goto_2
    cmp-long v2, v6, v0

    .line 127
    .line 128
    if-eqz v2, :cond_3

    .line 129
    .line 130
    :goto_3
    move-wide/from16 v17, v6

    .line 131
    .line 132
    goto :goto_4

    .line 133
    :cond_3
    iget-wide v6, v4, Lj66;->b:J

    .line 134
    .line 135
    goto :goto_3

    .line 136
    :goto_4
    cmp-long v2, v8, v0

    .line 137
    .line 138
    if-eqz v2, :cond_4

    .line 139
    .line 140
    :goto_5
    move-wide/from16 v19, v8

    .line 141
    .line 142
    goto :goto_6

    .line 143
    :cond_4
    iget-wide v8, v4, Lj66;->c:J

    .line 144
    .line 145
    goto :goto_5

    .line 146
    :goto_6
    cmp-long v0, v10, v0

    .line 147
    .line 148
    if-eqz v0, :cond_5

    .line 149
    .line 150
    :goto_7
    move-wide/from16 v21, v10

    .line 151
    .line 152
    goto :goto_8

    .line 153
    :cond_5
    iget-wide v10, v4, Lj66;->d:J

    .line 154
    .line 155
    goto :goto_7

    .line 156
    :goto_8
    new-instance v14, Lj66;

    .line 157
    .line 158
    invoke-direct/range {v14 .. v22}, Lj66;-><init>(JJJJ)V

    .line 159
    .line 160
    .line 161
    and-int/lit8 v0, p4, 0xe

    .line 162
    .line 163
    shr-int/lit8 v1, p4, 0x6

    .line 164
    .line 165
    and-int/lit8 v1, v1, 0x70

    .line 166
    .line 167
    or-int/2addr v0, v1

    .line 168
    shl-int/lit8 v1, p4, 0x3

    .line 169
    .line 170
    and-int/lit16 v2, v1, 0x380

    .line 171
    .line 172
    or-int/2addr v0, v2

    .line 173
    and-int/lit16 v1, v1, 0x1c00

    .line 174
    .line 175
    or-int v6, v0, v1

    .line 176
    .line 177
    sget-object v2, Lhx4;->X:Lhx4;

    .line 178
    .line 179
    move/from16 v0, p0

    .line 180
    .line 181
    move-object/from16 v1, p2

    .line 182
    .line 183
    move-object v4, v14

    .line 184
    invoke-static/range {v0 .. v6}, Lhi5;->M(ZLdn2;Lkx4;ZLj66;Llp2;I)V

    .line 185
    .line 186
    .line 187
    return-void
.end method

.method public static c0(Lu91;)[B
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lu91;->a:Ljava/util/HashMap;

    .line 5
    .line 6
    :try_start_0
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 9
    .line 10
    .line 11
    new-instance v1, Ljava/io/DataOutputStream;

    .line 12
    .line 13
    invoke-direct {v1, v0}, Ljava/io/DataOutputStream;-><init>(Ljava/io/OutputStream;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 14
    .line 15
    .line 16
    const/16 v2, -0x5411

    .line 17
    .line 18
    :try_start_1
    invoke-virtual {v1, v2}, Ljava/io/DataOutputStream;->writeShort(I)V

    .line 19
    .line 20
    .line 21
    const/4 v2, 0x1

    .line 22
    invoke-virtual {v1, v2}, Ljava/io/DataOutputStream;->writeShort(I)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0}, Ljava/util/HashMap;->size()I

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    invoke-virtual {v1, v2}, Ljava/io/DataOutputStream;->writeInt(I)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    if-eqz v2, :cond_0

    .line 45
    .line 46
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    check-cast v2, Ljava/util/Map$Entry;

    .line 51
    .line 52
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    check-cast v3, Ljava/lang/String;

    .line 57
    .line 58
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    invoke-static {v1, v3, v2}, Lwl7;->d0(Ljava/io/DataOutputStream;Ljava/lang/String;Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    goto :goto_0

    .line 66
    :catchall_0
    move-exception p0

    .line 67
    goto :goto_1

    .line 68
    :cond_0
    invoke-virtual {v1}, Ljava/io/DataOutputStream;->flush()V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v1}, Ljava/io/DataOutputStream;->size()I

    .line 72
    .line 73
    .line 74
    move-result p0

    .line 75
    const/16 v2, 0x2800

    .line 76
    .line 77
    if-gt p0, v2, :cond_1

    .line 78
    .line 79
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 80
    .line 81
    .line 82
    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 83
    :try_start_2
    invoke-interface {v1}, Ljava/io/Closeable;->close()V

    .line 84
    .line 85
    .line 86
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    .line 87
    .line 88
    .line 89
    return-object p0

    .line 90
    :cond_1
    :try_start_3
    const-string p0, "Data cannot occupy more than 10240 bytes when serialized"

    .line 91
    .line 92
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 93
    .line 94
    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 98
    :goto_1
    :try_start_4
    throw p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 99
    :catchall_1
    move-exception v0

    .line 100
    :try_start_5
    invoke-static {v1, p0}, Loc;->h(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 101
    .line 102
    .line 103
    throw v0
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_0

    .line 104
    :catch_0
    sget p0, Lkb1;->a:I

    .line 105
    .line 106
    invoke-static {}, Llh4;->P0()Llh4;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 111
    .line 112
    .line 113
    const/4 p0, 0x0

    .line 114
    new-array p0, p0, [B

    .line 115
    .line 116
    return-object p0
.end method

.method public static final d(Lkx4;Lql;Lgn2;ZLjava/util/Map;Lo88;IZIILfi2;Lgn2;Lmx;Llp2;II)V
    .locals 30

    move-object/from16 v0, p1

    move-object/from16 v6, p2

    move/from16 v7, p3

    move-object/from16 v8, p4

    move-object/from16 v13, p12

    move-object/from16 v5, p13

    move/from16 v9, p14

    move/from16 v10, p15

    const v1, -0x7e46da9f

    .line 1
    invoke-virtual {v5, v1}, Llp2;->X(I)Llp2;

    and-int/lit8 v1, v9, 0x6

    move-object/from16 v12, p0

    if-nez v1, :cond_1

    invoke-virtual {v5, v12}, Llp2;->f(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, v9

    goto :goto_1

    :cond_1
    move v1, v9

    :goto_1
    and-int/lit8 v3, v9, 0x30

    if-nez v3, :cond_3

    invoke-virtual {v5, v0}, Llp2;->f(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    const/16 v3, 0x20

    goto :goto_2

    :cond_2
    const/16 v3, 0x10

    :goto_2
    or-int/2addr v1, v3

    :cond_3
    and-int/lit16 v3, v9, 0x180

    if-nez v3, :cond_5

    invoke-virtual {v5, v6}, Llp2;->h(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    const/16 v3, 0x100

    goto :goto_3

    :cond_4
    const/16 v3, 0x80

    :goto_3
    or-int/2addr v1, v3

    :cond_5
    and-int/lit16 v3, v9, 0xc00

    const/16 v17, 0x400

    const/16 v18, 0x800

    if-nez v3, :cond_7

    invoke-virtual {v5, v7}, Llp2;->g(Z)Z

    move-result v3

    if-eqz v3, :cond_6

    move/from16 v3, v18

    goto :goto_4

    :cond_6
    move/from16 v3, v17

    :goto_4
    or-int/2addr v1, v3

    :cond_7
    and-int/lit16 v3, v9, 0x6000

    const/16 v19, 0x2000

    const/16 v20, 0x4000

    if-nez v3, :cond_9

    invoke-virtual {v5, v8}, Llp2;->h(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_8

    move/from16 v3, v20

    goto :goto_5

    :cond_8
    move/from16 v3, v19

    :goto_5
    or-int/2addr v1, v3

    :cond_9
    const/high16 v3, 0x30000

    and-int/2addr v3, v9

    if-nez v3, :cond_b

    move-object/from16 v3, p5

    invoke-virtual {v5, v3}, Llp2;->f(Ljava/lang/Object;)Z

    move-result v21

    if-eqz v21, :cond_a

    const/high16 v21, 0x20000

    goto :goto_6

    :cond_a
    const/high16 v21, 0x10000

    :goto_6
    or-int v1, v1, v21

    goto :goto_7

    :cond_b
    move-object/from16 v3, p5

    :goto_7
    const/high16 v21, 0x180000

    and-int v21, v9, v21

    move/from16 v15, p6

    if-nez v21, :cond_d

    invoke-virtual {v5, v15}, Llp2;->d(I)Z

    move-result v22

    if-eqz v22, :cond_c

    const/high16 v22, 0x100000

    goto :goto_8

    :cond_c
    const/high16 v22, 0x80000

    :goto_8
    or-int v1, v1, v22

    :cond_d
    const/high16 v22, 0xc00000

    and-int v22, v9, v22

    move/from16 v2, p7

    if-nez v22, :cond_f

    invoke-virtual {v5, v2}, Llp2;->g(Z)Z

    move-result v23

    if-eqz v23, :cond_e

    const/high16 v23, 0x800000

    goto :goto_9

    :cond_e
    const/high16 v23, 0x400000

    :goto_9
    or-int v1, v1, v23

    :cond_f
    const/high16 v23, 0x6000000

    and-int v23, v9, v23

    move/from16 v11, p8

    if-nez v23, :cond_11

    invoke-virtual {v5, v11}, Llp2;->d(I)Z

    move-result v24

    if-eqz v24, :cond_10

    const/high16 v24, 0x4000000

    goto :goto_a

    :cond_10
    const/high16 v24, 0x2000000

    :goto_a
    or-int v1, v1, v24

    :cond_11
    const/high16 v24, 0x30000000

    and-int v24, v9, v24

    move/from16 v14, p9

    if-nez v24, :cond_13

    invoke-virtual {v5, v14}, Llp2;->d(I)Z

    move-result v25

    if-eqz v25, :cond_12

    const/high16 v25, 0x20000000

    goto :goto_b

    :cond_12
    const/high16 v25, 0x10000000

    :goto_b
    or-int v1, v1, v25

    :cond_13
    and-int/lit8 v25, v10, 0x6

    move-object/from16 v4, p10

    if-nez v25, :cond_15

    invoke-virtual {v5, v4}, Llp2;->h(Ljava/lang/Object;)Z

    move-result v26

    if-eqz v26, :cond_14

    const/16 v22, 0x4

    goto :goto_c

    :cond_14
    const/16 v22, 0x2

    :goto_c
    or-int v22, v10, v22

    goto :goto_d

    :cond_15
    move/from16 v22, v10

    :goto_d
    and-int/lit8 v26, v10, 0x30

    move/from16 v27, v1

    const/4 v1, 0x0

    if-nez v26, :cond_17

    invoke-virtual {v5, v1}, Llp2;->h(Ljava/lang/Object;)Z

    move-result v26

    if-eqz v26, :cond_16

    const/16 v25, 0x20

    goto :goto_e

    :cond_16
    const/16 v25, 0x10

    :goto_e
    or-int v22, v22, v25

    :cond_17
    and-int/lit16 v2, v10, 0x180

    if-nez v2, :cond_19

    invoke-virtual {v5, v1}, Llp2;->h(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_18

    const/16 v21, 0x100

    goto :goto_f

    :cond_18
    const/16 v21, 0x80

    :goto_f
    or-int v22, v22, v21

    :cond_19
    and-int/lit16 v2, v10, 0xc00

    if-nez v2, :cond_1b

    move-object/from16 v2, p11

    invoke-virtual {v5, v2}, Llp2;->h(Ljava/lang/Object;)Z

    move-result v21

    if-eqz v21, :cond_1a

    move/from16 v17, v18

    :cond_1a
    or-int v22, v22, v17

    goto :goto_10

    :cond_1b
    move-object/from16 v2, p11

    :goto_10
    and-int/lit16 v1, v10, 0x6000

    if-nez v1, :cond_1e

    const v1, 0x8000

    and-int/2addr v1, v10

    if-nez v1, :cond_1c

    invoke-virtual {v5, v13}, Llp2;->f(Ljava/lang/Object;)Z

    move-result v1

    goto :goto_11

    :cond_1c
    invoke-virtual {v5, v13}, Llp2;->h(Ljava/lang/Object;)Z

    move-result v1

    :goto_11
    if-eqz v1, :cond_1d

    move/from16 v19, v20

    :cond_1d
    or-int v22, v22, v19

    :cond_1e
    move/from16 v1, v22

    const v18, 0x12492493

    and-int v2, v27, v18

    const v3, 0x12492492

    const/4 v7, 0x0

    if-ne v2, v3, :cond_20

    and-int/lit16 v1, v1, 0x2493

    const/16 v2, 0x2492

    if-eq v1, v2, :cond_1f

    goto :goto_12

    :cond_1f
    move v1, v7

    goto :goto_13

    :cond_20
    :goto_12
    const/4 v1, 0x1

    :goto_13
    and-int/lit8 v2, v27, 0x1

    invoke-virtual {v5, v2, v1}, Llp2;->N(IZ)Z

    move-result v1

    if-eqz v1, :cond_46

    .line 2
    invoke-static {v0}, Lu28;->i(Lql;)Z

    move-result v1

    sget-object v2, Lzz0;->a:Lbe;

    if-eqz v1, :cond_24

    const v1, 0x8ae5063

    invoke-virtual {v5, v1}, Llp2;->W(I)V

    and-int/lit8 v1, v27, 0x70

    const/16 v3, 0x20

    if-ne v1, v3, :cond_21

    const/4 v1, 0x1

    goto :goto_14

    :cond_21
    move v1, v7

    .line 3
    :goto_14
    invoke-virtual {v5}, Llp2;->K()Ljava/lang/Object;

    move-result-object v3

    if-nez v1, :cond_22

    if-ne v3, v2, :cond_23

    .line 4
    :cond_22
    new-instance v3, Lb88;

    invoke-direct {v3, v0}, Lb88;-><init>(Lql;)V

    .line 5
    invoke-virtual {v5, v3}, Llp2;->g0(Ljava/lang/Object;)V

    .line 6
    :cond_23
    check-cast v3, Lb88;

    .line 7
    invoke-virtual {v5, v7}, Llp2;->p(Z)V

    move-object v1, v3

    goto :goto_15

    :cond_24
    const v1, 0x8af50dc

    .line 8
    invoke-virtual {v5, v1}, Llp2;->W(I)V

    .line 9
    invoke-virtual {v5, v7}, Llp2;->p(Z)V

    const/4 v1, 0x0

    .line 10
    :goto_15
    invoke-static {v0}, Lu28;->i(Lql;)Z

    move-result v3

    if-eqz v3, :cond_28

    const v3, 0x8b25723

    invoke-virtual {v5, v3}, Llp2;->W(I)V

    and-int/lit8 v3, v27, 0x70

    const/16 v7, 0x20

    if-ne v3, v7, :cond_25

    const/4 v3, 0x1

    goto :goto_16

    :cond_25
    const/4 v3, 0x0

    .line 11
    :goto_16
    invoke-virtual {v5, v1}, Llp2;->f(Ljava/lang/Object;)Z

    move-result v7

    or-int/2addr v3, v7

    .line 12
    invoke-virtual {v5}, Llp2;->K()Ljava/lang/Object;

    move-result-object v7

    if-nez v3, :cond_26

    if-ne v7, v2, :cond_27

    .line 13
    :cond_26
    new-instance v7, Lp5;

    const/16 v3, 0xa

    invoke-direct {v7, v1, v0, v3}, Lp5;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 14
    invoke-virtual {v5, v7}, Llp2;->g0(Ljava/lang/Object;)V

    .line 15
    :cond_27
    check-cast v7, Ldn2;

    const/4 v3, 0x0

    .line 16
    invoke-virtual {v5, v3}, Llp2;->p(Z)V

    goto :goto_18

    :cond_28
    const v3, 0x8b3d321

    .line 17
    invoke-virtual {v5, v3}, Llp2;->W(I)V

    and-int/lit8 v3, v27, 0x70

    const/16 v7, 0x20

    if-ne v3, v7, :cond_29

    const/4 v3, 0x1

    goto :goto_17

    :cond_29
    const/4 v3, 0x0

    .line 18
    :goto_17
    invoke-virtual {v5}, Llp2;->K()Ljava/lang/Object;

    move-result-object v7

    if-nez v3, :cond_2a

    if-ne v7, v2, :cond_2b

    .line 19
    :cond_2a
    new-instance v7, Lo7;

    const/16 v3, 0xb

    invoke-direct {v7, v0, v3}, Lo7;-><init>(Ljava/lang/Object;B)V

    .line 20
    invoke-virtual {v5, v7}, Llp2;->g0(Ljava/lang/Object;)V

    .line 21
    :cond_2b
    check-cast v7, Ldn2;

    const/4 v3, 0x0

    .line 22
    invoke-virtual {v5, v3}, Llp2;->p(Z)V

    :goto_18
    if-eqz p3, :cond_33

    if-eqz v8, :cond_2c

    .line 23
    sget-object v3, Ltl;->a:Lqg5;

    .line 24
    invoke-interface {v8}, Ljava/util/Map;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_2d

    :cond_2c
    move-object/from16 v18, v1

    move-object/from16 v19, v7

    goto/16 :goto_1b

    .line 25
    :cond_2d
    iget-object v3, v0, Lql;->Y:Ljava/lang/String;

    .line 26
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    move-object/from16 v18, v1

    .line 27
    iget-object v1, v0, Lql;->X:Ljava/util/List;

    if-eqz v1, :cond_2f

    .line 28
    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v4

    invoke-direct {v0, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 29
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    move-result v4

    move-object/from16 v19, v7

    const/4 v7, 0x0

    :goto_19
    if-ge v7, v4, :cond_30

    .line 30
    invoke-interface {v1, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v20

    move-object/from16 v21, v1

    .line 31
    move-object/from16 v1, v20

    check-cast v1, Lpl;

    move/from16 v20, v4

    .line 32
    iget-object v4, v1, Lpl;->a:Ljava/lang/Object;

    move/from16 v24, v7

    iget v7, v1, Lpl;->c:I

    iget v9, v1, Lpl;->b:I

    iget-object v10, v1, Lpl;->d:Ljava/lang/String;

    .line 33
    instance-of v4, v4, Lul7;

    if-eqz v4, :cond_2e

    .line 34
    const-string v4, "androidx.compose.foundation.text.inlineContent"

    invoke-virtual {v4, v10}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2e

    const/4 v4, 0x0

    .line 35
    invoke-static {v4, v3, v9, v7}, Lrl;->b(IIII)Z

    move-result v26

    if-eqz v26, :cond_2e

    .line 36
    new-instance v4, Lpl;

    .line 37
    iget-object v1, v1, Lpl;->a:Ljava/lang/Object;

    .line 38
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    check-cast v1, Lul7;

    .line 39
    iget-object v1, v1, Lul7;->a:Ljava/lang/String;

    .line 40
    invoke-direct {v4, v10, v9, v7, v1}, Lpl;-><init>(Ljava/lang/String;IILjava/lang/Object;)V

    .line 41
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_2e
    add-int/lit8 v7, v24, 0x1

    move/from16 v9, p14

    move/from16 v10, p15

    move/from16 v4, v20

    move-object/from16 v1, v21

    goto :goto_19

    :cond_2f
    move-object/from16 v19, v7

    .line 42
    sget-object v0, Ld02;->X:Ld02;

    .line 43
    :cond_30
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 44
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 45
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result v4

    const/4 v7, 0x0

    :goto_1a
    if-ge v7, v4, :cond_32

    .line 46
    invoke-interface {v0, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    .line 47
    check-cast v9, Lpl;

    .line 48
    iget-object v9, v9, Lpl;->a:Ljava/lang/Object;

    .line 49
    invoke-interface {v8, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    if-nez v9, :cond_31

    add-int/lit8 v7, v7, 0x1

    goto :goto_1a

    :cond_31
    invoke-static {}, Lio/sentry/c2;->m()V

    return-void

    .line 50
    :cond_32
    new-instance v0, Lqg5;

    invoke-direct {v0, v1, v3}, Lqg5;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_1c

    .line 51
    :goto_1b
    sget-object v0, Ltl;->a:Lqg5;

    :goto_1c
    const/4 v1, 0x0

    goto :goto_1d

    :cond_33
    move-object/from16 v18, v1

    move-object/from16 v19, v7

    .line 52
    new-instance v0, Lqg5;

    const/4 v1, 0x0

    invoke-direct {v0, v1, v1}, Lqg5;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 53
    :goto_1d
    iget-object v3, v0, Lqg5;->X:Ljava/lang/Object;

    .line 54
    check-cast v3, Ljava/util/List;

    .line 55
    iget-object v0, v0, Lqg5;->Y:Ljava/lang/Object;

    .line 56
    move-object v7, v0

    check-cast v7, Ljava/util/List;

    if-eqz p3, :cond_35

    const v0, 0x8b8a5ec

    .line 57
    invoke-virtual {v5, v0}, Llp2;->W(I)V

    .line 58
    invoke-virtual {v5}, Llp2;->K()Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v2, :cond_34

    .line 59
    invoke-static {v1}, Lz51;->H(Ljava/lang/Object;)Lrh5;

    move-result-object v0

    .line 60
    invoke-virtual {v5, v0}, Llp2;->g0(Ljava/lang/Object;)V

    .line 61
    :cond_34
    check-cast v0, Ly05;

    const/4 v4, 0x0

    .line 62
    invoke-virtual {v5, v4}, Llp2;->p(Z)V

    move-object v9, v0

    goto :goto_1e

    :cond_35
    const/4 v4, 0x0

    const v0, 0x8b9fcbc    # 1.11937E-33f

    .line 63
    invoke-virtual {v5, v0}, Llp2;->W(I)V

    .line 64
    invoke-virtual {v5, v4}, Llp2;->p(Z)V

    move-object v9, v1

    :goto_1e
    if-eqz p3, :cond_38

    const v0, 0x8bb68fd

    .line 65
    invoke-virtual {v5, v0}, Llp2;->W(I)V

    .line 66
    invoke-virtual {v5, v9}, Llp2;->f(Ljava/lang/Object;)Z

    move-result v0

    .line 67
    invoke-virtual {v5}, Llp2;->K()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_36

    if-ne v1, v2, :cond_37

    .line 68
    :cond_36
    new-instance v1, Lgh;

    const/4 v0, 0x3

    invoke-direct {v1, v9, v0}, Lgh;-><init>(Ly05;B)V

    .line 69
    invoke-virtual {v5, v1}, Llp2;->g0(Ljava/lang/Object;)V

    .line 70
    :cond_37
    check-cast v1, Lgn2;

    const/4 v4, 0x0

    .line 71
    invoke-virtual {v5, v4}, Llp2;->p(Z)V

    :goto_1f
    move-object v10, v1

    goto :goto_20

    :cond_38
    const/4 v4, 0x0

    const v0, 0x8bc7ffc

    .line 72
    invoke-virtual {v5, v0}, Llp2;->W(I)V

    .line 73
    invoke-virtual {v5, v4}, Llp2;->p(Z)V

    goto :goto_1f

    :goto_20
    shr-int/lit8 v0, v27, 0x3

    and-int/lit8 v0, v0, 0xe

    move-object/from16 v1, p5

    move/from16 v4, p7

    move/from16 v28, v0

    move-object/from16 v24, v7

    move-object/from16 v17, v9

    move-object/from16 v7, v18

    move/from16 v8, v27

    move-object/from16 v0, p1

    move-object v9, v2

    move-object/from16 v2, p10

    .line 74
    invoke-static/range {v0 .. v5}, Lf40;->a(Lql;Lo88;Lfi2;Ljava/util/List;ZLlp2;)V

    move-object/from16 v18, v3

    .line 75
    invoke-interface/range {v19 .. v19}, Ldn2;->invoke()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lql;

    .line 76
    invoke-virtual {v5, v7}, Llp2;->h(Ljava/lang/Object;)Z

    move-result v2

    and-int/lit16 v3, v8, 0x380

    const/16 v4, 0x100

    if-ne v3, v4, :cond_39

    const/4 v3, 0x1

    goto :goto_21

    :cond_39
    const/4 v3, 0x0

    :goto_21
    or-int/2addr v2, v3

    .line 77
    invoke-virtual {v5}, Llp2;->K()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_3a

    if-ne v3, v9, :cond_3b

    .line 78
    :cond_3a
    new-instance v3, La40;

    const/4 v4, 0x0

    invoke-direct {v3, v7, v6, v4}, La40;-><init>(Lb88;Lgn2;B)V

    .line 79
    invoke-virtual {v5, v3}, Llp2;->g0(Ljava/lang/Object;)V

    .line 80
    :cond_3b
    check-cast v3, Lgn2;

    move-object v2, v12

    move-object v12, v3

    move-object v3, v9

    move-object v9, v2

    move-object/from16 v20, p11

    move-object/from16 v19, v10

    move-object/from16 v21, v13

    move/from16 v16, v14

    move v13, v15

    const/4 v2, 0x2

    move/from16 v14, p7

    move-object v10, v1

    move v15, v11

    move-object/from16 v1, v17

    move-object/from16 v11, p5

    move-object/from16 v17, p10

    .line 81
    invoke-static/range {v9 .. v21}, Lwl7;->Y(Lkx4;Lql;Lo88;Lgn2;IZIILfi2;Ljava/util/List;Lgn2;Lgn2;Lmx;)Lkx4;

    move-result-object v4

    if-nez p3, :cond_3e

    const v1, 0x8cef077

    .line 82
    invoke-virtual {v5, v1}, Llp2;->W(I)V

    .line 83
    invoke-virtual {v5, v7}, Llp2;->h(Ljava/lang/Object;)Z

    move-result v1

    .line 84
    invoke-virtual {v5}, Llp2;->K()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_3d

    if-ne v2, v3, :cond_3c

    goto :goto_22

    :cond_3c
    const/4 v3, 0x0

    goto :goto_23

    .line 85
    :cond_3d
    :goto_22
    new-instance v2, Lb40;

    const/4 v3, 0x0

    invoke-direct {v2, v7, v3}, Lb40;-><init>(Lb88;B)V

    .line 86
    invoke-virtual {v5, v2}, Llp2;->g0(Ljava/lang/Object;)V

    .line 87
    :goto_23
    check-cast v2, Ldn2;

    .line 88
    new-instance v1, Lcb4;

    invoke-direct {v1, v2, v3}, Lcb4;-><init>(Ljava/lang/Object;B)V

    .line 89
    invoke-virtual {v5, v3}, Llp2;->p(Z)V

    goto :goto_24

    :cond_3e
    const v8, 0x8d1a2f1

    .line 90
    invoke-virtual {v5, v8}, Llp2;->W(I)V

    .line 91
    invoke-virtual {v5, v7}, Llp2;->h(Ljava/lang/Object;)Z

    move-result v8

    .line 92
    invoke-virtual {v5}, Llp2;->K()Ljava/lang/Object;

    move-result-object v9

    if-nez v8, :cond_3f

    if-ne v9, v3, :cond_40

    .line 93
    :cond_3f
    new-instance v9, Lb40;

    const/4 v8, 0x1

    invoke-direct {v9, v7, v8}, Lb40;-><init>(Lb88;B)V

    .line 94
    invoke-virtual {v5, v9}, Llp2;->g0(Ljava/lang/Object;)V

    .line 95
    :cond_40
    check-cast v9, Ldn2;

    .line 96
    invoke-virtual {v5, v1}, Llp2;->f(Ljava/lang/Object;)Z

    move-result v8

    .line 97
    invoke-virtual {v5}, Llp2;->K()Ljava/lang/Object;

    move-result-object v10

    if-nez v8, :cond_41

    if-ne v10, v3, :cond_42

    .line 98
    :cond_41
    new-instance v10, Leh;

    invoke-direct {v10, v1, v2}, Leh;-><init>(Ly05;B)V

    .line 99
    invoke-virtual {v5, v10}, Llp2;->g0(Ljava/lang/Object;)V

    .line 100
    :cond_42
    check-cast v10, Ldn2;

    .line 101
    new-instance v1, Lyf;

    const/4 v8, 0x1

    invoke-direct {v1, v9, v10, v8}, Lyf;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    const/4 v3, 0x0

    .line 102
    invoke-virtual {v5, v3}, Llp2;->p(Z)V

    .line 103
    :goto_24
    iget-wide v2, v5, Llp2;->T:J

    .line 104
    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    move-result v2

    .line 105
    invoke-virtual {v5}, Llp2;->l()Lkl5;

    move-result-object v3

    .line 106
    invoke-static {v5, v4}, Lw45;->Q(Llp2;Lkx4;)Lkx4;

    move-result-object v4

    .line 107
    sget-object v8, Luz0;->j:Lpz2;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 108
    invoke-virtual {v5}, Llp2;->Z()V

    .line 109
    iget-boolean v8, v5, Llp2;->S:Z

    if-eqz v8, :cond_43

    .line 110
    invoke-virtual {v5}, Llp2;->k()V

    goto :goto_25

    .line 111
    :cond_43
    invoke-virtual {v5}, Llp2;->j0()V

    .line 112
    :goto_25
    sget-object v8, Lpz2;->B0:Ldx0;

    .line 113
    invoke-static {v8, v5, v1}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 114
    sget-object v1, Lpz2;->A0:Ldx0;

    .line 115
    invoke-static {v1, v5, v3}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 116
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    .line 117
    sget-object v2, Lpz2;->C0:Ldx0;

    .line 118
    invoke-static {v2, v5, v1}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 119
    invoke-static {v5}, Lpn7;->l(Llp2;)V

    .line 120
    sget-object v1, Lpz2;->z0:Ldx0;

    .line 121
    invoke-static {v1, v5, v4}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    if-nez v7, :cond_44

    const v1, -0x19d78e09

    .line 122
    invoke-virtual {v5, v1}, Llp2;->W(I)V

    const/4 v3, 0x0

    .line 123
    :goto_26
    invoke-virtual {v5, v3}, Llp2;->p(Z)V

    goto :goto_27

    :cond_44
    const/4 v3, 0x0

    const v1, -0x115988b6

    .line 124
    invoke-virtual {v5, v1}, Llp2;->W(I)V

    invoke-virtual {v7, v3, v5}, Lb88;->a(ILlp2;)V

    goto :goto_26

    :goto_27
    if-nez v24, :cond_45

    const v1, -0x19d6c7af

    .line 125
    invoke-virtual {v5, v1}, Llp2;->W(I)V

    .line 126
    :goto_28
    invoke-virtual {v5, v3}, Llp2;->p(Z)V

    const/4 v8, 0x1

    goto :goto_29

    :cond_45
    const v1, -0x19d6c7ae

    .line 127
    invoke-virtual {v5, v1}, Llp2;->W(I)V

    move-object/from16 v1, v24

    move/from16 v2, v28

    invoke-static {v0, v1, v5, v2}, Ltl;->a(Lql;Ljava/util/List;Llp2;I)V

    goto :goto_28

    .line 128
    :goto_29
    invoke-virtual {v5, v8}, Llp2;->p(Z)V

    goto :goto_2a

    .line 129
    :cond_46
    invoke-virtual {v5}, Llp2;->Q()V

    .line 130
    :goto_2a
    invoke-virtual {v5}, Llp2;->r()Lj86;

    move-result-object v1

    if-eqz v1, :cond_47

    new-instance v0, Lc40;

    move-object/from16 v2, p1

    move/from16 v4, p3

    move-object/from16 v5, p4

    move/from16 v7, p6

    move/from16 v8, p7

    move/from16 v9, p8

    move/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move/from16 v14, p14

    move/from16 v15, p15

    move-object/from16 v29, v1

    move-object v3, v6

    move-object/from16 v1, p0

    move-object/from16 v6, p5

    invoke-direct/range {v0 .. v15}, Lc40;-><init>(Lkx4;Lql;Lgn2;ZLjava/util/Map;Lo88;IZIILfi2;Lgn2;Lmx;II)V

    move-object v1, v0

    move-object/from16 v0, v29

    .line 131
    iput-object v1, v0, Lj86;->d:Lrn2;

    :cond_47
    return-void
.end method

.method public static final d0(Ljava/io/DataOutputStream;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    invoke-virtual {v0, v2}, Ljava/io/DataOutputStream;->writeByte(I)V

    .line 9
    .line 10
    .line 11
    goto/16 :goto_9

    .line 12
    .line 13
    :cond_0
    instance-of v3, v1, Ljava/lang/Boolean;

    .line 14
    .line 15
    if-eqz v3, :cond_1

    .line 16
    .line 17
    const/4 v2, 0x1

    .line 18
    invoke-virtual {v0, v2}, Ljava/io/DataOutputStream;->writeByte(I)V

    .line 19
    .line 20
    .line 21
    check-cast v1, Ljava/lang/Boolean;

    .line 22
    .line 23
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    invoke-virtual {v0, v1}, Ljava/io/DataOutputStream;->writeBoolean(Z)V

    .line 28
    .line 29
    .line 30
    goto/16 :goto_9

    .line 31
    .line 32
    :cond_1
    instance-of v3, v1, Ljava/lang/Byte;

    .line 33
    .line 34
    if-eqz v3, :cond_2

    .line 35
    .line 36
    const/4 v2, 0x2

    .line 37
    invoke-virtual {v0, v2}, Ljava/io/DataOutputStream;->writeByte(I)V

    .line 38
    .line 39
    .line 40
    check-cast v1, Ljava/lang/Number;

    .line 41
    .line 42
    invoke-virtual {v1}, Ljava/lang/Number;->byteValue()B

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    invoke-virtual {v0, v1}, Ljava/io/DataOutputStream;->writeByte(I)V

    .line 47
    .line 48
    .line 49
    goto/16 :goto_9

    .line 50
    .line 51
    :cond_2
    instance-of v3, v1, Ljava/lang/Integer;

    .line 52
    .line 53
    if-eqz v3, :cond_3

    .line 54
    .line 55
    const/4 v2, 0x3

    .line 56
    invoke-virtual {v0, v2}, Ljava/io/DataOutputStream;->writeByte(I)V

    .line 57
    .line 58
    .line 59
    check-cast v1, Ljava/lang/Number;

    .line 60
    .line 61
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    invoke-virtual {v0, v1}, Ljava/io/DataOutputStream;->writeInt(I)V

    .line 66
    .line 67
    .line 68
    goto/16 :goto_9

    .line 69
    .line 70
    :cond_3
    instance-of v3, v1, Ljava/lang/Long;

    .line 71
    .line 72
    if-eqz v3, :cond_4

    .line 73
    .line 74
    const/4 v2, 0x4

    .line 75
    invoke-virtual {v0, v2}, Ljava/io/DataOutputStream;->writeByte(I)V

    .line 76
    .line 77
    .line 78
    check-cast v1, Ljava/lang/Number;

    .line 79
    .line 80
    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    .line 81
    .line 82
    .line 83
    move-result-wide v1

    .line 84
    invoke-virtual {v0, v1, v2}, Ljava/io/DataOutputStream;->writeLong(J)V

    .line 85
    .line 86
    .line 87
    goto/16 :goto_9

    .line 88
    .line 89
    :cond_4
    instance-of v3, v1, Ljava/lang/Float;

    .line 90
    .line 91
    if-eqz v3, :cond_5

    .line 92
    .line 93
    const/4 v2, 0x5

    .line 94
    invoke-virtual {v0, v2}, Ljava/io/DataOutputStream;->writeByte(I)V

    .line 95
    .line 96
    .line 97
    check-cast v1, Ljava/lang/Number;

    .line 98
    .line 99
    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    .line 100
    .line 101
    .line 102
    move-result v1

    .line 103
    invoke-virtual {v0, v1}, Ljava/io/DataOutputStream;->writeFloat(F)V

    .line 104
    .line 105
    .line 106
    goto/16 :goto_9

    .line 107
    .line 108
    :cond_5
    instance-of v3, v1, Ljava/lang/Double;

    .line 109
    .line 110
    if-eqz v3, :cond_6

    .line 111
    .line 112
    const/4 v2, 0x6

    .line 113
    invoke-virtual {v0, v2}, Ljava/io/DataOutputStream;->writeByte(I)V

    .line 114
    .line 115
    .line 116
    check-cast v1, Ljava/lang/Number;

    .line 117
    .line 118
    invoke-virtual {v1}, Ljava/lang/Number;->doubleValue()D

    .line 119
    .line 120
    .line 121
    move-result-wide v1

    .line 122
    invoke-virtual {v0, v1, v2}, Ljava/io/DataOutputStream;->writeDouble(D)V

    .line 123
    .line 124
    .line 125
    goto/16 :goto_9

    .line 126
    .line 127
    :cond_6
    instance-of v3, v1, Ljava/lang/String;

    .line 128
    .line 129
    if-eqz v3, :cond_7

    .line 130
    .line 131
    const/4 v2, 0x7

    .line 132
    invoke-virtual {v0, v2}, Ljava/io/DataOutputStream;->writeByte(I)V

    .line 133
    .line 134
    .line 135
    check-cast v1, Ljava/lang/String;

    .line 136
    .line 137
    invoke-virtual {v0, v1}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V

    .line 138
    .line 139
    .line 140
    goto/16 :goto_9

    .line 141
    .line 142
    :cond_7
    instance-of v3, v1, [Ljava/lang/Object;

    .line 143
    .line 144
    const-string v4, "Unsupported value type "

    .line 145
    .line 146
    if-eqz v3, :cond_25

    .line 147
    .line 148
    check-cast v1, [Ljava/lang/Object;

    .line 149
    .line 150
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 151
    .line 152
    .line 153
    move-result-object v3

    .line 154
    sget-object v5, Lyb6;->a:Lzb6;

    .line 155
    .line 156
    invoke-virtual {v5, v3}, Lzb6;->b(Ljava/lang/Class;)Lzu3;

    .line 157
    .line 158
    .line 159
    move-result-object v3

    .line 160
    const-class v6, [Ljava/lang/Boolean;

    .line 161
    .line 162
    invoke-virtual {v5, v6}, Lzb6;->b(Ljava/lang/Class;)Lzu3;

    .line 163
    .line 164
    .line 165
    move-result-object v6

    .line 166
    invoke-virtual {v3, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 167
    .line 168
    .line 169
    move-result v6

    .line 170
    const/16 v7, 0xe

    .line 171
    .line 172
    const/16 v8, 0xd

    .line 173
    .line 174
    const/16 v9, 0xc

    .line 175
    .line 176
    const/16 v10, 0xb

    .line 177
    .line 178
    const/16 v11, 0xa

    .line 179
    .line 180
    const/16 v12, 0x9

    .line 181
    .line 182
    const/16 v13, 0x8

    .line 183
    .line 184
    if-eqz v6, :cond_8

    .line 185
    .line 186
    move v3, v13

    .line 187
    goto :goto_0

    .line 188
    :cond_8
    const-class v6, [Ljava/lang/Byte;

    .line 189
    .line 190
    invoke-virtual {v5, v6}, Lzb6;->b(Ljava/lang/Class;)Lzu3;

    .line 191
    .line 192
    .line 193
    move-result-object v6

    .line 194
    invoke-virtual {v3, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 195
    .line 196
    .line 197
    move-result v6

    .line 198
    if-eqz v6, :cond_9

    .line 199
    .line 200
    move v3, v12

    .line 201
    goto :goto_0

    .line 202
    :cond_9
    const-class v6, [Ljava/lang/Integer;

    .line 203
    .line 204
    invoke-virtual {v5, v6}, Lzb6;->b(Ljava/lang/Class;)Lzu3;

    .line 205
    .line 206
    .line 207
    move-result-object v6

    .line 208
    invoke-virtual {v3, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 209
    .line 210
    .line 211
    move-result v6

    .line 212
    if-eqz v6, :cond_a

    .line 213
    .line 214
    move v3, v11

    .line 215
    goto :goto_0

    .line 216
    :cond_a
    const-class v6, [Ljava/lang/Long;

    .line 217
    .line 218
    invoke-virtual {v5, v6}, Lzb6;->b(Ljava/lang/Class;)Lzu3;

    .line 219
    .line 220
    .line 221
    move-result-object v6

    .line 222
    invoke-virtual {v3, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 223
    .line 224
    .line 225
    move-result v6

    .line 226
    if-eqz v6, :cond_b

    .line 227
    .line 228
    move v3, v10

    .line 229
    goto :goto_0

    .line 230
    :cond_b
    const-class v6, [Ljava/lang/Float;

    .line 231
    .line 232
    invoke-virtual {v5, v6}, Lzb6;->b(Ljava/lang/Class;)Lzu3;

    .line 233
    .line 234
    .line 235
    move-result-object v6

    .line 236
    invoke-virtual {v3, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 237
    .line 238
    .line 239
    move-result v6

    .line 240
    if-eqz v6, :cond_c

    .line 241
    .line 242
    move v3, v9

    .line 243
    goto :goto_0

    .line 244
    :cond_c
    const-class v6, [Ljava/lang/Double;

    .line 245
    .line 246
    invoke-virtual {v5, v6}, Lzb6;->b(Ljava/lang/Class;)Lzu3;

    .line 247
    .line 248
    .line 249
    move-result-object v6

    .line 250
    invoke-virtual {v3, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 251
    .line 252
    .line 253
    move-result v6

    .line 254
    if-eqz v6, :cond_d

    .line 255
    .line 256
    move v3, v8

    .line 257
    goto :goto_0

    .line 258
    :cond_d
    const-class v6, [Ljava/lang/String;

    .line 259
    .line 260
    invoke-virtual {v5, v6}, Lzb6;->b(Ljava/lang/Class;)Lzu3;

    .line 261
    .line 262
    .line 263
    move-result-object v6

    .line 264
    invoke-virtual {v3, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 265
    .line 266
    .line 267
    move-result v3

    .line 268
    if-eqz v3, :cond_24

    .line 269
    .line 270
    move v3, v7

    .line 271
    :goto_0
    invoke-virtual {v0, v3}, Ljava/io/DataOutputStream;->writeByte(I)V

    .line 272
    .line 273
    .line 274
    array-length v4, v1

    .line 275
    invoke-virtual {v0, v4}, Ljava/io/DataOutputStream;->writeInt(I)V

    .line 276
    .line 277
    .line 278
    array-length v4, v1

    .line 279
    move v5, v2

    .line 280
    :goto_1
    if-ge v5, v4, :cond_23

    .line 281
    .line 282
    aget-object v6, v1, v5

    .line 283
    .line 284
    const/4 v14, 0x0

    .line 285
    if-ne v3, v13, :cond_10

    .line 286
    .line 287
    instance-of v15, v6, Ljava/lang/Boolean;

    .line 288
    .line 289
    if-eqz v15, :cond_e

    .line 290
    .line 291
    move-object v14, v6

    .line 292
    check-cast v14, Ljava/lang/Boolean;

    .line 293
    .line 294
    :cond_e
    if-eqz v14, :cond_f

    .line 295
    .line 296
    invoke-virtual {v14}, Ljava/lang/Boolean;->booleanValue()Z

    .line 297
    .line 298
    .line 299
    move-result v6

    .line 300
    goto :goto_2

    .line 301
    :cond_f
    move v6, v2

    .line 302
    :goto_2
    invoke-virtual {v0, v6}, Ljava/io/DataOutputStream;->writeBoolean(Z)V

    .line 303
    .line 304
    .line 305
    goto/16 :goto_8

    .line 306
    .line 307
    :cond_10
    if-ne v3, v12, :cond_13

    .line 308
    .line 309
    instance-of v15, v6, Ljava/lang/Byte;

    .line 310
    .line 311
    if-eqz v15, :cond_11

    .line 312
    .line 313
    move-object v14, v6

    .line 314
    check-cast v14, Ljava/lang/Byte;

    .line 315
    .line 316
    :cond_11
    if-eqz v14, :cond_12

    .line 317
    .line 318
    invoke-virtual {v14}, Ljava/lang/Byte;->byteValue()B

    .line 319
    .line 320
    .line 321
    move-result v6

    .line 322
    goto :goto_3

    .line 323
    :cond_12
    move v6, v2

    .line 324
    :goto_3
    invoke-virtual {v0, v6}, Ljava/io/DataOutputStream;->writeByte(I)V

    .line 325
    .line 326
    .line 327
    goto/16 :goto_8

    .line 328
    .line 329
    :cond_13
    if-ne v3, v11, :cond_16

    .line 330
    .line 331
    instance-of v15, v6, Ljava/lang/Integer;

    .line 332
    .line 333
    if-eqz v15, :cond_14

    .line 334
    .line 335
    move-object v14, v6

    .line 336
    check-cast v14, Ljava/lang/Integer;

    .line 337
    .line 338
    :cond_14
    if-eqz v14, :cond_15

    .line 339
    .line 340
    invoke-virtual {v14}, Ljava/lang/Integer;->intValue()I

    .line 341
    .line 342
    .line 343
    move-result v6

    .line 344
    goto :goto_4

    .line 345
    :cond_15
    move v6, v2

    .line 346
    :goto_4
    invoke-virtual {v0, v6}, Ljava/io/DataOutputStream;->writeInt(I)V

    .line 347
    .line 348
    .line 349
    goto :goto_8

    .line 350
    :cond_16
    if-ne v3, v10, :cond_19

    .line 351
    .line 352
    instance-of v15, v6, Ljava/lang/Long;

    .line 353
    .line 354
    if-eqz v15, :cond_17

    .line 355
    .line 356
    move-object v14, v6

    .line 357
    check-cast v14, Ljava/lang/Long;

    .line 358
    .line 359
    :cond_17
    if-eqz v14, :cond_18

    .line 360
    .line 361
    invoke-virtual {v14}, Ljava/lang/Long;->longValue()J

    .line 362
    .line 363
    .line 364
    move-result-wide v14

    .line 365
    goto :goto_5

    .line 366
    :cond_18
    const-wide/16 v14, 0x0

    .line 367
    .line 368
    :goto_5
    invoke-virtual {v0, v14, v15}, Ljava/io/DataOutputStream;->writeLong(J)V

    .line 369
    .line 370
    .line 371
    goto :goto_8

    .line 372
    :cond_19
    if-ne v3, v9, :cond_1c

    .line 373
    .line 374
    instance-of v15, v6, Ljava/lang/Float;

    .line 375
    .line 376
    if-eqz v15, :cond_1a

    .line 377
    .line 378
    move-object v14, v6

    .line 379
    check-cast v14, Ljava/lang/Float;

    .line 380
    .line 381
    :cond_1a
    if-eqz v14, :cond_1b

    .line 382
    .line 383
    invoke-virtual {v14}, Ljava/lang/Float;->floatValue()F

    .line 384
    .line 385
    .line 386
    move-result v6

    .line 387
    goto :goto_6

    .line 388
    :cond_1b
    const/4 v6, 0x0

    .line 389
    :goto_6
    invoke-virtual {v0, v6}, Ljava/io/DataOutputStream;->writeFloat(F)V

    .line 390
    .line 391
    .line 392
    goto :goto_8

    .line 393
    :cond_1c
    if-ne v3, v8, :cond_1f

    .line 394
    .line 395
    instance-of v15, v6, Ljava/lang/Double;

    .line 396
    .line 397
    if-eqz v15, :cond_1d

    .line 398
    .line 399
    move-object v14, v6

    .line 400
    check-cast v14, Ljava/lang/Double;

    .line 401
    .line 402
    :cond_1d
    if-eqz v14, :cond_1e

    .line 403
    .line 404
    invoke-virtual {v14}, Ljava/lang/Double;->doubleValue()D

    .line 405
    .line 406
    .line 407
    move-result-wide v14

    .line 408
    goto :goto_7

    .line 409
    :cond_1e
    const-wide/16 v14, 0x0

    .line 410
    .line 411
    :goto_7
    invoke-virtual {v0, v14, v15}, Ljava/io/DataOutputStream;->writeDouble(D)V

    .line 412
    .line 413
    .line 414
    goto :goto_8

    .line 415
    :cond_1f
    if-ne v3, v7, :cond_22

    .line 416
    .line 417
    instance-of v15, v6, Ljava/lang/String;

    .line 418
    .line 419
    if-eqz v15, :cond_20

    .line 420
    .line 421
    move-object v14, v6

    .line 422
    check-cast v14, Ljava/lang/String;

    .line 423
    .line 424
    :cond_20
    if-nez v14, :cond_21

    .line 425
    .line 426
    const-string v14, "androidx.work.Data-95ed6082-b8e9-46e8-a73f-ff56f00f5d9d"

    .line 427
    .line 428
    :cond_21
    invoke-virtual {v0, v14}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V

    .line 429
    .line 430
    .line 431
    :cond_22
    :goto_8
    add-int/lit8 v5, v5, 0x1

    .line 432
    .line 433
    goto/16 :goto_1

    .line 434
    .line 435
    :cond_23
    :goto_9
    invoke-virtual/range {p0 .. p1}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V

    .line 436
    .line 437
    .line 438
    return-void

    .line 439
    :cond_24
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 440
    .line 441
    .line 442
    move-result-object v0

    .line 443
    invoke-virtual {v5, v0}, Lzb6;->b(Ljava/lang/Class;)Lzu3;

    .line 444
    .line 445
    .line 446
    move-result-object v0

    .line 447
    invoke-interface {v0}, Lzu3;->p()Ljava/lang/String;

    .line 448
    .line 449
    .line 450
    move-result-object v0

    .line 451
    invoke-static {v4, v0}, Loi0;->l(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 452
    .line 453
    .line 454
    move-result-object v0

    .line 455
    invoke-static {v0}, Lbt;->q(Ljava/lang/String;)V

    .line 456
    .line 457
    .line 458
    return-void

    .line 459
    :cond_25
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 460
    .line 461
    .line 462
    move-result-object v0

    .line 463
    sget-object v1, Lyb6;->a:Lzb6;

    .line 464
    .line 465
    invoke-virtual {v1, v0}, Lzb6;->b(Ljava/lang/Class;)Lzu3;

    .line 466
    .line 467
    .line 468
    move-result-object v0

    .line 469
    invoke-interface {v0}, Lzu3;->E()Ljava/lang/String;

    .line 470
    .line 471
    .line 472
    move-result-object v0

    .line 473
    invoke-static {v4, v0}, Loi0;->l(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 474
    .line 475
    .line 476
    move-result-object v0

    .line 477
    invoke-static {v0}, Lbt;->q(Ljava/lang/String;)V

    .line 478
    .line 479
    .line 480
    return-void
.end method

.method public static final e(Llg4;Lgn2;Lj74;Lgg5;Loh2;Lkx4;Llp2;I)V
    .locals 27

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v0, p3

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    move-object/from16 v14, p6

    move/from16 v6, p7

    const v7, 0x7447ac99

    .line 1
    invoke-virtual {v14, v7}, Llp2;->X(I)Llp2;

    and-int/lit8 v7, v6, 0x6

    if-nez v7, :cond_1

    invoke-virtual {v14, v1}, Llp2;->f(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_0

    const/4 v7, 0x4

    goto :goto_0

    :cond_0
    const/4 v7, 0x2

    :goto_0
    or-int/2addr v7, v6

    goto :goto_1

    :cond_1
    move v7, v6

    :goto_1
    and-int/lit8 v10, v6, 0x30

    if-nez v10, :cond_3

    invoke-virtual {v14, v2}, Llp2;->h(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_2

    const/16 v10, 0x20

    goto :goto_2

    :cond_2
    const/16 v10, 0x10

    :goto_2
    or-int/2addr v7, v10

    :cond_3
    and-int/lit16 v10, v6, 0x180

    if-nez v10, :cond_5

    invoke-virtual {v14, v3}, Llp2;->f(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_4

    const/16 v10, 0x100

    goto :goto_3

    :cond_4
    const/16 v10, 0x80

    :goto_3
    or-int/2addr v7, v10

    :cond_5
    and-int/lit16 v10, v6, 0xc00

    if-nez v10, :cond_7

    invoke-virtual {v14, v0}, Llp2;->f(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_6

    const/16 v10, 0x800

    goto :goto_4

    :cond_6
    const/16 v10, 0x400

    :goto_4
    or-int/2addr v7, v10

    :cond_7
    and-int/lit16 v10, v6, 0x6000

    if-nez v10, :cond_9

    invoke-virtual {v14, v4}, Llp2;->f(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_8

    const/16 v10, 0x4000

    goto :goto_5

    :cond_8
    const/16 v10, 0x2000

    :goto_5
    or-int/2addr v7, v10

    :cond_9
    const/high16 v10, 0x30000

    and-int/2addr v10, v6

    if-nez v10, :cond_b

    invoke-virtual {v14, v5}, Llp2;->f(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_a

    const/high16 v10, 0x20000

    goto :goto_6

    :cond_a
    const/high16 v10, 0x10000

    :goto_6
    or-int/2addr v7, v10

    :cond_b
    const v10, 0x12493

    and-int/2addr v10, v7

    const v15, 0x12492

    if-eq v10, v15, :cond_c

    const/4 v10, 0x1

    goto :goto_7

    :cond_c
    const/4 v10, 0x0

    :goto_7
    and-int/lit8 v15, v7, 0x1

    invoke-virtual {v14, v15, v10}, Llp2;->N(IZ)Z

    move-result v10

    if-eqz v10, :cond_23

    .line 2
    sget-object v10, Ly01;->n:Lox1;

    .line 3
    invoke-virtual {v14, v10}, Llp2;->j(Lq06;)Ljava/lang/Object;

    move-result-object v10

    .line 4
    check-cast v10, Lz24;

    .line 5
    invoke-static {v14}, Loc;->t(Llp2;)Z

    move-result v15

    const/high16 v11, 0x42700000    # 60.0f

    .line 6
    invoke-static {v11, v14}, Los4;->S(FLlp2;)F

    move-result v11

    .line 7
    invoke-virtual {v14}, Llp2;->K()Ljava/lang/Object;

    move-result-object v8

    .line 8
    sget-object v9, Lzz0;->a:Lbe;

    if-ne v8, v9, :cond_d

    .line 9
    sget-object v8, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 10
    invoke-static {v8}, Lz51;->H(Ljava/lang/Object;)Lrh5;

    move-result-object v8

    .line 11
    invoke-virtual {v14, v8}, Llp2;->g0(Ljava/lang/Object;)V

    .line 12
    :cond_d
    check-cast v8, Ly05;

    .line 13
    invoke-virtual {v14}, Llp2;->K()Ljava/lang/Object;

    move-result-object v12

    if-ne v12, v9, :cond_e

    .line 14
    invoke-static {v14}, Lu70;->D(Llp2;)Lb71;

    move-result-object v12

    .line 15
    invoke-virtual {v14, v12}, Llp2;->g0(Ljava/lang/Object;)V

    .line 16
    :cond_e
    check-cast v12, Lb71;

    .line 17
    invoke-static {v15}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v13

    invoke-virtual {v14, v15}, Llp2;->g(Z)Z

    move-result v18

    const v19, 0xe000

    and-int v6, v7, v19

    move/from16 v19, v11

    const/16 v11, 0x4000

    if-ne v6, v11, :cond_f

    const/4 v6, 0x1

    goto :goto_8

    :cond_f
    const/4 v6, 0x0

    :goto_8
    or-int v6, v18, v6

    .line 18
    invoke-virtual {v14}, Llp2;->K()Ljava/lang/Object;

    move-result-object v11

    move/from16 v17, v6

    const/4 v6, 0x0

    if-nez v17, :cond_10

    if-ne v11, v9, :cond_11

    .line 19
    :cond_10
    new-instance v11, Lr5;

    invoke-direct {v11, v15, v4, v6}, Lr5;-><init>(ZLoh2;Lq51;)V

    .line 20
    invoke-virtual {v14, v11}, Llp2;->g0(Ljava/lang/Object;)V

    .line 21
    :cond_11
    check-cast v11, Lrn2;

    invoke-static {v11, v14, v13}, Lu70;->h(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 22
    iget v11, v1, Llg4;->c:I

    .line 23
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    and-int/lit16 v13, v7, 0x380

    const/16 v6, 0x100

    if-ne v13, v6, :cond_12

    const/16 v18, 0x1

    goto :goto_9

    :cond_12
    const/16 v18, 0x0

    .line 24
    :goto_9
    invoke-virtual {v14}, Llp2;->K()Ljava/lang/Object;

    move-result-object v6

    if-nez v18, :cond_14

    if-ne v6, v9, :cond_13

    goto :goto_a

    :cond_13
    move/from16 v18, v7

    move/from16 v20, v15

    goto :goto_b

    .line 25
    :cond_14
    :goto_a
    new-instance v6, Lr5;

    move/from16 v18, v7

    const/16 v7, 0x14

    move/from16 v20, v15

    const/4 v15, 0x0

    invoke-direct {v6, v3, v15, v7}, Lr5;-><init>(Ljava/lang/Object;Lq51;B)V

    .line 26
    invoke-virtual {v14, v6}, Llp2;->g0(Ljava/lang/Object;)V

    .line 27
    :goto_b
    check-cast v6, Lrn2;

    invoke-static {v6, v14, v11}, Lu70;->h(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 28
    invoke-static {v14}, Lys0;->y(Llp2;)Ldp;

    move-result-object v6

    .line 29
    iget-object v6, v6, Ldp;->b:Luo;

    .line 30
    iget-wide v6, v6, Luo;->b:J

    .line 31
    sget-object v11, Lu70;->e:Lx03;

    .line 32
    invoke-static {v5, v6, v7, v11}, Lu15;->f(Lkx4;JLx67;)Lkx4;

    move-result-object v21

    .line 33
    invoke-static {v0, v10}, Los4;->h(Lgg5;Lz24;)F

    move-result v22

    .line 34
    invoke-static {v0, v10}, Los4;->g(Lgg5;Lz24;)F

    move-result v24

    const/16 v25, 0x0

    const/16 v26, 0xa

    const/16 v23, 0x0

    .line 35
    invoke-static/range {v21 .. v26}, Los4;->A(Lkx4;FFFFI)Lkx4;

    move-result-object v6

    .line 36
    sget-object v7, Lht;->c:Ldt;

    .line 37
    sget-object v10, Lpz2;->q0:Ln50;

    const/4 v11, 0x0

    .line 38
    invoke-static {v7, v10, v14, v11}, Lrw0;->a(Lgt;Ln50;Llp2;I)Ltw0;

    move-result-object v7

    .line 39
    iget-wide v10, v14, Llp2;->T:J

    .line 40
    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v10

    .line 41
    invoke-virtual {v14}, Llp2;->l()Lkl5;

    move-result-object v11

    .line 42
    invoke-static {v14, v6}, Lw45;->Q(Llp2;Lkx4;)Lkx4;

    move-result-object v6

    .line 43
    sget-object v15, Luz0;->j:Lpz2;

    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    invoke-virtual {v14}, Llp2;->Z()V

    .line 45
    iget-boolean v15, v14, Llp2;->S:Z

    if-eqz v15, :cond_15

    .line 46
    invoke-virtual {v14}, Llp2;->k()V

    goto :goto_c

    .line 47
    :cond_15
    invoke-virtual {v14}, Llp2;->j0()V

    .line 48
    :goto_c
    sget-object v15, Lpz2;->B0:Ldx0;

    .line 49
    invoke-static {v15, v14, v7}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 50
    sget-object v7, Lpz2;->A0:Ldx0;

    .line 51
    invoke-static {v7, v14, v11}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 52
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    .line 53
    sget-object v10, Lpz2;->C0:Ldx0;

    .line 54
    invoke-static {v10, v14, v7}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 55
    invoke-static {v14}, Lpn7;->l(Llp2;)V

    .line 56
    sget-object v7, Lpz2;->z0:Ldx0;

    .line 57
    invoke-static {v7, v14, v6}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 58
    sget-object v6, Lhx4;->X:Lhx4;

    invoke-interface {v0}, Lgg5;->d()F

    move-result v7

    invoke-static {v6, v7}, Landroidx/compose/foundation/layout/b;->b(Lkx4;F)Lkx4;

    move-result-object v6

    invoke-static {v14, v6}, Lch3;->f(Llp2;Lkx4;)V

    .line 59
    iget-object v6, v1, Llg4;->a:Lgg4;

    if-eqz v6, :cond_16

    .line 60
    iget-object v15, v6, Lgg4;->b:Ljava/lang/String;

    goto :goto_d

    :cond_16
    const/4 v15, 0x0

    :goto_d
    if-nez v15, :cond_17

    const v6, 0xd3dc946

    .line 61
    invoke-virtual {v14, v6}, Llp2;->W(I)V

    sget v6, Ly46;->title_logs:I

    invoke-static {v6, v14}, Lvj8;->j0(ILlp2;)Ljava/lang/String;

    move-result-object v15

    const/4 v11, 0x0

    .line 62
    :goto_e
    invoke-virtual {v14, v11}, Llp2;->p(Z)V

    goto :goto_f

    :cond_17
    const/4 v11, 0x0

    const v6, 0xd3dc5c3

    .line 63
    invoke-virtual {v14, v6}, Llp2;->W(I)V

    goto :goto_e

    .line 64
    :goto_f
    sget-object v6, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/FillElement;

    .line 65
    sget-object v7, Lhr;->a:Lox1;

    .line 66
    invoke-virtual {v14, v7}, Llp2;->j(Lq06;)Ljava/lang/Object;

    move-result-object v7

    .line 67
    check-cast v7, Lgr;

    .line 68
    iget-object v7, v7, Lgr;->a:Lsr;

    .line 69
    iget-object v7, v7, Lsr;->b:Lig5;

    .line 70
    invoke-static {v6, v7}, Los4;->w(Lkx4;Lgg5;)Lkx4;

    move-result-object v7

    .line 71
    invoke-static {v15, v7, v14, v11}, Loc;->b(Ljava/lang/String;Lkx4;Llp2;I)V

    .line 72
    iget-boolean v7, v1, Llg4;->g:Z

    if-eqz v7, :cond_18

    const v7, -0x6581dac9

    .line 73
    invoke-virtual {v14, v7}, Llp2;->W(I)V

    .line 74
    sget-object v7, Lpz2;->r0:Ln50;

    .line 75
    new-instance v10, Lr03;

    invoke-direct {v10, v7}, Lr03;-><init>(Ln50;)V

    .line 76
    invoke-static {v10}, Lch3;->u(Lkx4;)Lkx4;

    move-result-object v7

    and-int/lit8 v10, v18, 0x7e

    .line 77
    invoke-static {v1, v2, v7, v14, v10}, Lw45;->e(Llg4;Lgn2;Lkx4;Llp2;I)V

    const/4 v11, 0x0

    .line 78
    invoke-virtual {v14, v11}, Llp2;->p(Z)V

    goto :goto_10

    :cond_18
    const/4 v11, 0x0

    const v7, -0x657dfbc1

    .line 79
    invoke-virtual {v14, v7}, Llp2;->W(I)V

    .line 80
    invoke-virtual {v14, v11}, Llp2;->p(Z)V

    .line 81
    :goto_10
    invoke-interface {v0}, Lgg5;->a()F

    move-result v7

    const/high16 v10, 0x42000000    # 32.0f

    add-float/2addr v7, v10

    const/4 v10, 0x2

    .line 82
    invoke-static {v10, v7}, Los4;->e(IF)Lig5;

    move-result-object v7

    const v10, 0xd3ea9fb

    .line 83
    invoke-virtual {v14, v10}, Llp2;->W(I)V

    const v10, 0xd3e443c

    .line 84
    invoke-virtual {v14, v10}, Llp2;->W(I)V

    .line 85
    new-instance v10, Ld44;

    const/high16 v11, 0x3f800000    # 1.0f

    const/4 v15, 0x1

    invoke-direct {v10, v11, v15}, Ld44;-><init>(FZ)V

    .line 86
    invoke-interface {v6, v10}, Lkx4;->y(Lkx4;)Lkx4;

    move-result-object v6

    if-eqz v20, :cond_19

    const/high16 v10, 0x41800000    # 16.0f

    .line 87
    invoke-static {v6, v10}, Los4;->x(Lkx4;F)Lkx4;

    move-result-object v6

    .line 88
    :cond_19
    invoke-static {v6, v4}, Lzc1;->I(Lkx4;Loh2;)Lkx4;

    move-result-object v6

    .line 89
    invoke-virtual {v14}, Llp2;->K()Ljava/lang/Object;

    move-result-object v10

    if-ne v10, v9, :cond_1a

    .line 90
    new-instance v10, Lgh;

    const/16 v11, 0x8

    invoke-direct {v10, v8, v11}, Lgh;-><init>(Ly05;B)V

    .line 91
    invoke-virtual {v14, v10}, Llp2;->g0(Ljava/lang/Object;)V

    .line 92
    :cond_1a
    check-cast v10, Lgn2;

    invoke-static {v6, v10}, Lz51;->J(Lkx4;Lgn2;)Lkx4;

    move-result-object v6

    if-eqz v20, :cond_1e

    const/16 v10, 0x100

    if-ne v13, v10, :cond_1b

    move v10, v15

    goto :goto_11

    :cond_1b
    const/4 v10, 0x0

    .line 93
    :goto_11
    invoke-virtual {v14, v12}, Llp2;->h(Ljava/lang/Object;)Z

    move-result v11

    or-int/2addr v10, v11

    move/from16 v11, v19

    invoke-virtual {v14, v11}, Llp2;->c(F)Z

    move-result v13

    or-int/2addr v10, v13

    .line 94
    invoke-virtual {v14}, Llp2;->K()Ljava/lang/Object;

    move-result-object v13

    if-nez v10, :cond_1c

    if-ne v13, v9, :cond_1d

    .line 95
    :cond_1c
    new-instance v13, Lxh4;

    invoke-direct {v13, v3, v12, v11}, Lxh4;-><init>(Lj74;Lb71;F)V

    .line 96
    invoke-virtual {v14, v13}, Llp2;->g0(Ljava/lang/Object;)V

    .line 97
    :cond_1d
    check-cast v13, Lgn2;

    invoke-static {v6, v13}, Lmb6;->T(Lkx4;Lgn2;)Lkx4;

    move-result-object v6

    :cond_1e
    const/4 v11, 0x0

    .line 98
    invoke-virtual {v14, v11}, Llp2;->p(Z)V

    if-eqz v20, :cond_1f

    .line 99
    invoke-interface {v8}, Llh7;->getValue()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Boolean;

    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v8

    if-eqz v8, :cond_1f

    .line 100
    sget-object v8, Lur;->a:Lox1;

    .line 101
    invoke-virtual {v14, v8}, Llp2;->j(Lq06;)Ljava/lang/Object;

    move-result-object v10

    .line 102
    check-cast v10, Ltr;

    .line 103
    iget-object v10, v10, Ltr;->c:Lcp;

    .line 104
    iget-object v10, v10, Lcp;->a:Ljm6;

    .line 105
    invoke-static {v14}, Lys0;->y(Llp2;)Ldp;

    move-result-object v11

    .line 106
    iget-wide v11, v11, Ldp;->a:J

    const v13, 0x3f0ccccd    # 0.55f

    .line 107
    invoke-static {v13, v11, v12}, Ldw0;->b(FJ)J

    move-result-wide v11

    .line 108
    new-instance v13, Ls67;

    const/16 v15, 0x38

    const/high16 v0, 0x41400000    # 12.0f

    invoke-direct {v13, v0, v15, v11, v12}, Ls67;-><init>(FIJ)V

    .line 109
    new-instance v0, Lo97;

    invoke-direct {v0, v10, v13}, Lo97;-><init>(Lx67;Ls67;)V

    invoke-interface {v6, v0}, Lkx4;->y(Lkx4;)Lkx4;

    move-result-object v0

    .line 110
    invoke-static {v14}, Lys0;->y(Llp2;)Ldp;

    move-result-object v6

    .line 111
    iget-object v6, v6, Ldp;->b:Luo;

    .line 112
    iget-wide v10, v6, Luo;->b:J

    .line 113
    invoke-virtual {v14, v8}, Llp2;->j(Lq06;)Ljava/lang/Object;

    move-result-object v6

    .line 114
    check-cast v6, Ltr;

    .line 115
    iget-object v6, v6, Ltr;->c:Lcp;

    .line 116
    iget-object v6, v6, Lcp;->a:Ljm6;

    .line 117
    invoke-static {v0, v10, v11, v6}, Lu15;->f(Lkx4;JLx67;)Lkx4;

    move-result-object v0

    .line 118
    invoke-static {v14}, Lys0;->y(Llp2;)Ldp;

    move-result-object v6

    .line 119
    iget-wide v10, v6, Ldp;->a:J

    .line 120
    invoke-virtual {v14, v8}, Llp2;->j(Lq06;)Ljava/lang/Object;

    move-result-object v6

    .line 121
    check-cast v6, Ltr;

    .line 122
    iget-object v6, v6, Ltr;->c:Lcp;

    .line 123
    iget-object v6, v6, Lcp;->a:Ljm6;

    .line 124
    new-instance v8, Lfe7;

    .line 125
    invoke-direct {v8, v10, v11}, Lfe7;-><init>(J)V

    .line 126
    new-instance v10, Lc70;

    const/high16 v11, 0x40000000    # 2.0f

    .line 127
    invoke-direct {v10, v11, v8, v6}, Lc70;-><init>(FLfe7;Lx67;)V

    .line 128
    invoke-interface {v0, v10}, Lkx4;->y(Lkx4;)Lkx4;

    move-result-object v6

    :cond_1f
    const/4 v11, 0x0

    .line 129
    invoke-virtual {v14, v11}, Llp2;->p(Z)V

    move/from16 v0, v20

    const/4 v15, 0x0

    .line 130
    invoke-static {v6, v0, v15}, Lch3;->v(Lkx4;ZLxz4;)Lkx4;

    move-result-object v0

    and-int/lit8 v6, v18, 0xe

    const/4 v8, 0x4

    if-ne v6, v8, :cond_20

    const/4 v11, 0x1

    .line 131
    :cond_20
    invoke-virtual {v14}, Llp2;->K()Ljava/lang/Object;

    move-result-object v6

    if-nez v11, :cond_21

    if-ne v6, v9, :cond_22

    .line 132
    :cond_21
    new-instance v6, Lvj2;

    const/16 v8, 0x10

    invoke-direct {v6, v1, v8}, Lvj2;-><init>(Ljava/lang/Object;B)V

    .line 133
    invoke-virtual {v14, v6}, Llp2;->g0(Ljava/lang/Object;)V

    .line 134
    :cond_22
    move-object v13, v6

    check-cast v13, Lgn2;

    shr-int/lit8 v6, v18, 0x3

    and-int/lit8 v15, v6, 0x70

    const/16 v16, 0x7f4

    const/4 v5, 0x0

    move-object v6, v7

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    move-object v4, v3

    move-object v3, v0

    const/4 v0, 0x1

    .line 135
    invoke-static/range {v3 .. v16}, Ljb5;->a(Lkx4;Lj74;FLgg5;Lgt;Lp8;Lhe2;ZLtd;ZLgn2;Llp2;II)V

    .line 136
    invoke-virtual {v14, v0}, Llp2;->p(Z)V

    goto :goto_12

    .line 137
    :cond_23
    invoke-virtual {v14}, Llp2;->Q()V

    .line 138
    :goto_12
    invoke-virtual {v14}, Llp2;->r()Lj86;

    move-result-object v8

    if-eqz v8, :cond_24

    new-instance v0, Lwu;

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move/from16 v7, p7

    invoke-direct/range {v0 .. v7}, Lwu;-><init>(Llg4;Lgn2;Lj74;Lgg5;Loh2;Lkx4;I)V

    .line 139
    iput-object v0, v8, Lj86;->d:Lrn2;

    :cond_24
    return-void
.end method

.method public static final e0(Ljava/lang/String;)Landroid/text/Editable;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {}, Landroid/text/Editable$Factory;->getInstance()Landroid/text/Editable$Factory;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0, p0}, Landroid/text/Editable$Factory;->newEditable(Ljava/lang/CharSequence;)Landroid/text/Editable;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    return-object p0
.end method

.method public static final f(Lci4;Lkx4;Llp2;I)V
    .locals 11

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const v0, -0x6bcc2c23

    .line 5
    .line 6
    .line 7
    invoke-virtual {p2, v0}, Llp2;->X(I)Llp2;

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lci4;->d:Lh76;

    .line 11
    .line 12
    invoke-static {v0, p2}, Li21;->o(Lmh7;Llp2;)Ly05;

    .line 13
    .line 14
    .line 15
    move-result-object v8

    .line 16
    invoke-virtual {p2, p0}, Llp2;->h(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    invoke-virtual {p2}, Llp2;->K()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    sget-object v10, Lzz0;->a:Lbe;

    .line 25
    .line 26
    if-nez v0, :cond_0

    .line 27
    .line 28
    if-ne v1, v10, :cond_1

    .line 29
    .line 30
    :cond_0
    new-instance v0, Ld0;

    .line 31
    .line 32
    const/4 v6, 0x0

    .line 33
    const/16 v7, 0x17

    .line 34
    .line 35
    const/4 v1, 0x1

    .line 36
    const-class v3, Lci4;

    .line 37
    .line 38
    const-string v4, "onUiIntent"

    .line 39
    .line 40
    const-string v5, "onUiIntent(Lsu/happ/proxyutility/feature/logs/view/LogViewSettingsUiIntent;)V"

    .line 41
    .line 42
    move-object v2, p0

    .line 43
    invoke-direct/range {v0 .. v7}, Ld0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p2, v0}, Llp2;->g0(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    move-object v1, v0

    .line 50
    :cond_1
    move-object v4, v1

    .line 51
    check-cast v4, Lpv3;

    .line 52
    .line 53
    invoke-interface {v8}, Llh7;->getValue()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    check-cast v0, Lng4;

    .line 58
    .line 59
    instance-of v1, v0, Llg4;

    .line 60
    .line 61
    const/4 v2, 0x0

    .line 62
    if-eqz v1, :cond_2

    .line 63
    .line 64
    check-cast v0, Llg4;

    .line 65
    .line 66
    move-object v1, v0

    .line 67
    goto :goto_0

    .line 68
    :cond_2
    move-object v1, v2

    .line 69
    :goto_0
    invoke-static {p2}, Ll74;->a(Llp2;)Lj74;

    .line 70
    .line 71
    .line 72
    move-result-object v3

    .line 73
    invoke-virtual {p2}, Llp2;->K()Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    if-ne v0, v10, :cond_3

    .line 78
    .line 79
    new-instance v0, Loh2;

    .line 80
    .line 81
    invoke-direct {v0}, Loh2;-><init>()V

    .line 82
    .line 83
    .line 84
    invoke-virtual {p2, v0}, Llp2;->g0(Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    :cond_3
    move-object v5, v0

    .line 88
    check-cast v5, Loh2;

    .line 89
    .line 90
    sget-object v0, Ln84;->ON_RESUME:Ln84;

    .line 91
    .line 92
    invoke-virtual {p2, v4}, Llp2;->f(Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    move-result v6

    .line 96
    invoke-virtual {p2}, Llp2;->K()Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v7

    .line 100
    if-nez v6, :cond_4

    .line 101
    .line 102
    if-ne v7, v10, :cond_5

    .line 103
    .line 104
    :cond_4
    new-instance v7, Laa3;

    .line 105
    .line 106
    const/4 v6, 0x1

    .line 107
    invoke-direct {v7, v4, v6}, Laa3;-><init>(Lpv3;B)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {p2, v7}, Llp2;->g0(Ljava/lang/Object;)V

    .line 111
    .line 112
    .line 113
    :cond_5
    check-cast v7, Ldn2;

    .line 114
    .line 115
    const/4 v6, 0x6

    .line 116
    invoke-static {v0, v2, v7, p2, v6}, Lyn0;->i(Ln84;Ld94;Ldn2;Llp2;I)V

    .line 117
    .line 118
    .line 119
    new-instance v0, Li9;

    .line 120
    .line 121
    const/16 v2, 0x15

    .line 122
    .line 123
    invoke-direct {v0, v1, v4, v2}, Li9;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 124
    .line 125
    .line 126
    const v2, -0xbeac020

    .line 127
    .line 128
    .line 129
    invoke-static {v2, v0, p2}, Ljm4;->U(ILon2;Llp2;)Lzy0;

    .line 130
    .line 131
    .line 132
    move-result-object v7

    .line 133
    new-instance v0, Ldf4;

    .line 134
    .line 135
    move-object v2, p0

    .line 136
    move-object v6, v8

    .line 137
    invoke-direct/range {v0 .. v6}, Ldf4;-><init>(Llg4;Lci4;Lj74;Lpv3;Loh2;Ly05;)V

    .line 138
    .line 139
    .line 140
    const v1, -0x69c90e09

    .line 141
    .line 142
    .line 143
    invoke-static {v1, v0, p2}, Ljm4;->U(ILon2;Llp2;)Lzy0;

    .line 144
    .line 145
    .line 146
    move-result-object v8

    .line 147
    const v10, 0xc00036

    .line 148
    .line 149
    .line 150
    const/4 v2, 0x0

    .line 151
    const/4 v3, 0x0

    .line 152
    const/4 v4, 0x0

    .line 153
    const-wide/16 v5, 0x0

    .line 154
    .line 155
    move-object v1, v7

    .line 156
    const/4 v7, 0x0

    .line 157
    move-object v0, p1

    .line 158
    move-object v9, p2

    .line 159
    invoke-static/range {v0 .. v10}, Lsx2;->b(Lkx4;Lzy0;Lrn2;Lrn2;IJLv09;Lzy0;Llp2;I)V

    .line 160
    .line 161
    .line 162
    invoke-virtual {p2}, Llp2;->r()Lj86;

    .line 163
    .line 164
    .line 165
    move-result-object v0

    .line 166
    if-eqz v0, :cond_6

    .line 167
    .line 168
    new-instance v1, Li9;

    .line 169
    .line 170
    const/16 v2, 0x16

    .line 171
    .line 172
    invoke-direct {v1, v2, p3, p0, p1}, Li9;-><init>(BILjava/lang/Object;Ljava/lang/Object;)V

    .line 173
    .line 174
    .line 175
    iput-object v1, v0, Lj86;->d:Lrn2;

    .line 176
    .line 177
    :cond_6
    return-void
.end method

.method public static final f0(Ljava/lang/String;)[I
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    new-array v0, v0, [C

    .line 3
    .line 4
    const/16 v1, 0x2e

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    aput-char v1, v0, v2

    .line 8
    .line 9
    invoke-static {p0, v0}, Lfm7;->E0(Ljava/lang/CharSequence;[C)Ljava/util/List;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    new-instance v0, Ljava/util/ArrayList;

    .line 14
    .line 15
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 16
    .line 17
    .line 18
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-eqz v1, :cond_1

    .line 27
    .line 28
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    check-cast v1, Ljava/lang/String;

    .line 33
    .line 34
    invoke-static {v1}, Lmm7;->b0(Ljava/lang/String;)Ljava/lang/Integer;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    if-eqz v1, :cond_0

    .line 39
    .line 40
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 45
    .line 46
    .line 47
    move-result p0

    .line 48
    const/4 v1, 0x4

    .line 49
    const/4 v2, 0x0

    .line 50
    if-ne p0, v1, :cond_2

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_2
    move-object v0, v2

    .line 54
    :goto_1
    if-eqz v0, :cond_3

    .line 55
    .line 56
    invoke-static {v0}, Lwv0;->X0(Ljava/util/ArrayList;)[I

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    return-object p0

    .line 61
    :cond_3
    return-object v2
.end method

.method public static final g(Ly68;Lkx4;ZLo88;Lq58;Lsn2;ZLde3;Lwx3;Lw58;Lay6;Lx67;Li48;Lgg5;Llp2;II)V
    .locals 38

    move-object/from16 v4, p3

    move/from16 v7, p6

    move-object/from16 v10, p12

    move-object/from16 v0, p14

    move/from16 v1, p15

    move/from16 v2, p16

    const v3, -0x77a1981e

    .line 1
    invoke-virtual {v0, v3}, Llp2;->X(I)Llp2;

    and-int/lit8 v3, v1, 0x6

    move-object/from16 v11, p0

    if-nez v3, :cond_1

    invoke-virtual {v0, v11}, Llp2;->f(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, 0x4

    goto :goto_0

    :cond_0
    const/4 v3, 0x2

    :goto_0
    or-int/2addr v3, v1

    goto :goto_1

    :cond_1
    move v3, v1

    :goto_1
    and-int/lit8 v5, v1, 0x30

    move-object/from16 v6, p1

    if-nez v5, :cond_3

    invoke-virtual {v0, v6}, Llp2;->f(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    const/16 v5, 0x20

    goto :goto_2

    :cond_2
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v3, v5

    :cond_3
    or-int/lit16 v3, v3, 0xd80

    and-int/lit16 v5, v1, 0x6000

    const/16 v9, 0x4000

    if-nez v5, :cond_5

    invoke-virtual {v0, v4}, Llp2;->f(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    move v5, v9

    goto :goto_3

    :cond_4
    const/16 v5, 0x2000

    :goto_3
    or-int/2addr v3, v5

    :cond_5
    const/high16 v5, 0x30000

    and-int v12, v1, v5

    if-nez v12, :cond_6

    const/high16 v12, 0x10000

    or-int/2addr v3, v12

    :cond_6
    const/high16 v12, 0x180000

    and-int v13, v1, v12

    const/high16 v14, 0x80000

    const/high16 v15, 0x100000

    if-nez v13, :cond_8

    move-object/from16 v13, p5

    invoke-virtual {v0, v13}, Llp2;->h(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_7

    move/from16 v16, v15

    goto :goto_4

    :cond_7
    move/from16 v16, v14

    :goto_4
    or-int v3, v3, v16

    goto :goto_5

    :cond_8
    move-object/from16 v13, p5

    :goto_5
    const/high16 v16, 0xc00000

    or-int v3, v3, v16

    const/high16 v17, 0x6000000

    and-int v18, v1, v17

    const/high16 v19, 0x2000000

    const/high16 v20, 0x4000000

    move/from16 v21, v5

    const/4 v5, 0x0

    if-nez v18, :cond_a

    invoke-virtual {v0, v5}, Llp2;->h(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_9

    move/from16 v18, v20

    goto :goto_6

    :cond_9
    move/from16 v18, v19

    :goto_6
    or-int v3, v3, v18

    :cond_a
    const/high16 v18, 0x30000000

    and-int v22, v1, v18

    if-nez v22, :cond_c

    invoke-virtual {v0, v5}, Llp2;->h(Ljava/lang/Object;)Z

    move-result v22

    if-eqz v22, :cond_b

    const/high16 v22, 0x20000000

    goto :goto_7

    :cond_b
    const/high16 v22, 0x10000000

    :goto_7
    or-int v3, v3, v22

    :cond_c
    or-int/lit8 v22, v2, 0x36

    and-int/lit16 v8, v2, 0x180

    const/16 v24, 0x80

    const/16 v25, 0x100

    if-nez v8, :cond_e

    invoke-virtual {v0, v5}, Llp2;->h(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_d

    move/from16 v5, v25

    goto :goto_8

    :cond_d
    move/from16 v5, v24

    :goto_8
    or-int v22, v22, v5

    :cond_e
    and-int/lit16 v5, v2, 0xc00

    if-nez v5, :cond_10

    invoke-virtual {v0, v7}, Llp2;->g(Z)Z

    move-result v5

    if-eqz v5, :cond_f

    const/16 v5, 0x800

    goto :goto_9

    :cond_f
    const/16 v5, 0x400

    :goto_9
    or-int v22, v22, v5

    :cond_10
    and-int/lit16 v5, v2, 0x6000

    move-object/from16 v8, p7

    if-nez v5, :cond_12

    invoke-virtual {v0, v8}, Llp2;->f(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_11

    move/from16 v23, v9

    goto :goto_a

    :cond_11
    const/16 v23, 0x2000

    :goto_a
    or-int v22, v22, v23

    :cond_12
    or-int v5, v22, v21

    and-int v9, v2, v12

    if-nez v9, :cond_14

    move-object/from16 v9, p8

    invoke-virtual {v0, v9}, Llp2;->f(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_13

    move v14, v15

    :cond_13
    or-int/2addr v5, v14

    goto :goto_b

    :cond_14
    move-object/from16 v9, p8

    :goto_b
    or-int v5, v5, v16

    and-int v12, v2, v17

    if-nez v12, :cond_16

    move-object/from16 v12, p9

    invoke-virtual {v0, v12}, Llp2;->f(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_15

    move/from16 v19, v20

    :cond_15
    or-int v5, v5, v19

    goto :goto_c

    :cond_16
    move-object/from16 v12, p9

    :goto_c
    or-int v5, v5, v18

    invoke-virtual {v0, v10}, Llp2;->f(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_17

    move/from16 v14, v25

    goto :goto_d

    :cond_17
    move/from16 v14, v24

    :goto_d
    or-int/lit16 v14, v14, 0x6412

    const v16, 0x12492493

    and-int v15, v3, v16

    const v1, 0x12492492

    const/4 v2, 0x0

    const/16 v17, 0x1

    if-ne v15, v1, :cond_19

    and-int v5, v5, v16

    if-ne v5, v1, :cond_19

    and-int/lit16 v1, v14, 0x2493

    const/16 v5, 0x2492

    if-eq v1, v5, :cond_18

    goto :goto_e

    :cond_18
    move v1, v2

    goto :goto_f

    :cond_19
    :goto_e
    move/from16 v1, v17

    :goto_f
    and-int/lit8 v3, v3, 0x1

    invoke-virtual {v0, v3, v1}, Llp2;->N(IZ)Z

    move-result v1

    if-eqz v1, :cond_21

    invoke-virtual {v0}, Llp2;->S()V

    and-int/lit8 v1, p15, 0x1

    if-eqz v1, :cond_1b

    invoke-virtual {v0}, Llp2;->x()Z

    move-result v1

    if-eqz v1, :cond_1a

    goto :goto_10

    .line 2
    :cond_1a
    invoke-virtual {v0}, Llp2;->Q()V

    move/from16 v17, p2

    move-object/from16 v8, p4

    move-object/from16 v19, p10

    move-object/from16 v20, p11

    move-object/from16 v15, p13

    goto :goto_11

    .line 3
    :cond_1b
    :goto_10
    new-instance v1, Lq58;

    .line 4
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 5
    invoke-static {v0}, Ldh3;->G(Llp2;)Lay6;

    move-result-object v3

    .line 6
    sget-object v5, Lnr4;->g:Ld77;

    .line 7
    invoke-static {v5, v0}, Lq77;->b(Ld77;Llp2;)Lx67;

    move-result-object v5

    .line 8
    new-instance v14, Lig5;

    const/high16 v15, 0x41800000    # 16.0f

    .line 9
    invoke-direct {v14, v15, v15, v15, v15}, Lig5;-><init>(FFFF)V

    move-object v8, v1

    move-object/from16 v19, v3

    move-object/from16 v20, v5

    move-object v15, v14

    .line 10
    :goto_11
    invoke-virtual {v0}, Llp2;->q()V

    const v1, 0x62318f19

    .line 11
    invoke-virtual {v0, v1}, Llp2;->W(I)V

    .line 12
    invoke-virtual {v0}, Llp2;->K()Ljava/lang/Object;

    move-result-object v1

    .line 13
    sget-object v3, Lzz0;->a:Lbe;

    if-ne v1, v3, :cond_1c

    .line 14
    new-instance v1, Lxz4;

    invoke-direct {v1}, Lxz4;-><init>()V

    .line 15
    invoke-virtual {v0, v1}, Llp2;->g0(Ljava/lang/Object;)V

    .line 16
    :cond_1c
    move-object v14, v1

    check-cast v14, Lxz4;

    .line 17
    invoke-virtual {v0, v2}, Llp2;->p(Z)V

    const v1, -0x159b38a4

    .line 18
    invoke-virtual {v0, v1}, Llp2;->W(I)V

    .line 19
    invoke-virtual {v4}, Lo88;->b()J

    move-result-wide v21

    const-wide/16 v23, 0x10

    cmp-long v1, v21, v23

    if-eqz v1, :cond_1d

    move v5, v2

    :goto_12
    move-wide/from16 v24, v21

    goto :goto_15

    .line 20
    :cond_1d
    invoke-static {v14, v0, v2}, Lkm4;->s(Lxz4;Llp2;I)Ly05;

    move-result-object v1

    invoke-interface {v1}, Llh7;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-nez v17, :cond_1e

    .line 21
    iget-wide v2, v10, Li48;->c:J

    move-wide/from16 v21, v2

    goto :goto_14

    :cond_1e
    if-eqz v7, :cond_1f

    .line 22
    iget-wide v1, v10, Li48;->d:J

    :goto_13
    move-wide/from16 v21, v1

    goto :goto_14

    :cond_1f
    if-eqz v1, :cond_20

    .line 23
    iget-wide v1, v10, Li48;->a:J

    goto :goto_13

    .line 24
    :cond_20
    iget-wide v1, v10, Li48;->b:J

    goto :goto_13

    :goto_14
    const/4 v5, 0x0

    goto :goto_12

    .line 25
    :goto_15
    invoke-virtual {v0, v5}, Llp2;->p(Z)V

    .line 26
    new-instance v23, Lo88;

    const-wide/16 v34, 0x0

    const v36, 0xfffffe

    const-wide/16 v26, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const-wide/16 v30, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    invoke-direct/range {v23 .. v36}, Lo88;-><init>(JJLdj2;Lbj2;JIIJI)V

    move-object/from16 v1, v23

    invoke-virtual {v4, v1}, Lo88;->d(Lo88;)Lo88;

    move-result-object v1

    .line 27
    sget-object v2, Li88;->a:Lox1;

    .line 28
    iget-object v3, v10, Li48;->k:Lh88;

    .line 29
    invoke-virtual {v2, v3}, Lox1;->a(Ljava/lang/Object;)Lt06;

    move-result-object v2

    .line 30
    new-instance v5, Lie5;

    move-object/from16 v16, p7

    move-object/from16 v18, v9

    move v9, v7

    move-object v7, v13

    move-object v13, v12

    move/from16 v12, v17

    move-object/from16 v17, v1

    invoke-direct/range {v5 .. v20}, Lie5;-><init>(Lkx4;Lsn2;Lq58;ZLi48;Ly68;ZLw58;Lxz4;Lgg5;Lde3;Lo88;Lwx3;Lay6;Lx67;)V

    const v1, -0x18cdd4de

    invoke-static {v1, v5, v0}, Ljm4;->U(ILon2;Llp2;)Lzy0;

    move-result-object v1

    const/16 v3, 0x38

    invoke-static {v2, v1, v0, v3}, Lmb6;->a(Lt06;Lrn2;Llp2;I)V

    move-object v5, v8

    move v3, v12

    move-object v14, v15

    move-object/from16 v11, v19

    move-object/from16 v12, v20

    goto :goto_16

    .line 31
    :cond_21
    invoke-virtual {v0}, Llp2;->Q()V

    move/from16 v3, p2

    move-object/from16 v5, p4

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v14, p13

    .line 32
    :goto_16
    invoke-virtual {v0}, Llp2;->r()Lj86;

    move-result-object v0

    if-eqz v0, :cond_22

    move-object v1, v0

    new-instance v0, Lge5;

    move-object/from16 v2, p1

    move-object/from16 v6, p5

    move/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v13, p12

    move/from16 v15, p15

    move/from16 v16, p16

    move-object/from16 v37, v1

    move-object/from16 v1, p0

    invoke-direct/range {v0 .. v16}, Lge5;-><init>(Ly68;Lkx4;ZLo88;Lq58;Lsn2;ZLde3;Lwx3;Lw58;Lay6;Lx67;Li48;Lgg5;II)V

    move-object/from16 v1, v37

    .line 33
    iput-object v0, v1, Lj86;->d:Lrn2;

    :cond_22
    return-void
.end method

.method public static g0(I)Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "OperatingMode(mode="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    const/16 p0, 0x29

    .line 12
    .line 13
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0
.end method

.method public static final h(Lzy0;Lsn2;Lrn2;Lrn2;Lrn2;Lrn2;Lrn2;ZLq58;Lo58;Lgn2;Lzy0;Lrn2;Lgg5;Llp2;II)V
    .locals 40

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v10, p9

    move-object/from16 v0, p11

    move-object/from16 v15, p12

    move-object/from16 v13, p13

    move-object/from16 v8, p14

    move/from16 v9, p15

    move/from16 v11, p16

    .line 1
    sget-object v12, Lpz2;->i0:Lp50;

    sget-object v14, Lpz2;->Z:Lp50;

    move-object/from16 v16, v12

    const v12, 0x2cec89be

    invoke-virtual {v8, v12}, Llp2;->X(I)Llp2;

    and-int/lit8 v12, v9, 0x6

    move/from16 v17, v12

    sget-object v12, Lhx4;->X:Lhx4;

    move-object/from16 v18, v14

    if-nez v17, :cond_1

    invoke-virtual {v8, v12}, Llp2;->f(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_0

    const/16 v17, 0x4

    goto :goto_0

    :cond_0
    const/16 v17, 0x2

    :goto_0
    or-int v17, v9, v17

    goto :goto_1

    :cond_1
    move/from16 v17, v9

    :goto_1
    and-int/lit8 v20, v9, 0x30

    const/16 v21, 0x10

    if-nez v20, :cond_3

    invoke-virtual {v8, v1}, Llp2;->h(Ljava/lang/Object;)Z

    move-result v20

    if-eqz v20, :cond_2

    const/16 v20, 0x20

    goto :goto_2

    :cond_2
    move/from16 v20, v21

    :goto_2
    or-int v17, v17, v20

    :cond_3
    and-int/lit16 v14, v9, 0x180

    const/16 v22, 0x80

    const/16 v23, 0x100

    if-nez v14, :cond_5

    invoke-virtual {v8, v2}, Llp2;->h(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_4

    move/from16 v14, v23

    goto :goto_3

    :cond_4
    move/from16 v14, v22

    :goto_3
    or-int v17, v17, v14

    :cond_5
    and-int/lit16 v14, v9, 0xc00

    const/16 v24, 0x400

    const/16 v25, 0x800

    if-nez v14, :cond_7

    invoke-virtual {v8, v3}, Llp2;->h(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_6

    move/from16 v14, v25

    goto :goto_4

    :cond_6
    move/from16 v14, v24

    :goto_4
    or-int v17, v17, v14

    :cond_7
    and-int/lit16 v14, v9, 0x6000

    const/16 v26, 0x2000

    if-nez v14, :cond_9

    invoke-virtual {v8, v4}, Llp2;->h(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_8

    const/16 v14, 0x4000

    goto :goto_5

    :cond_8
    move/from16 v14, v26

    :goto_5
    or-int v17, v17, v14

    :cond_9
    const/high16 v14, 0x30000

    and-int v14, p15, v14

    if-nez v14, :cond_b

    invoke-virtual {v8, v5}, Llp2;->h(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_a

    const/high16 v14, 0x20000

    goto :goto_6

    :cond_a
    const/high16 v14, 0x10000

    :goto_6
    or-int v17, v17, v14

    :cond_b
    const/high16 v14, 0x180000

    and-int v14, p15, v14

    if-nez v14, :cond_d

    invoke-virtual {v8, v6}, Llp2;->h(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_c

    const/high16 v14, 0x100000

    goto :goto_7

    :cond_c
    const/high16 v14, 0x80000

    :goto_7
    or-int v17, v17, v14

    :cond_d
    const/high16 v14, 0xc00000

    and-int v14, p15, v14

    if-nez v14, :cond_f

    invoke-virtual {v8, v7}, Llp2;->h(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_e

    const/high16 v14, 0x800000

    goto :goto_8

    :cond_e
    const/high16 v14, 0x400000

    :goto_8
    or-int v17, v17, v14

    :cond_f
    const/high16 v14, 0x6000000

    and-int v14, p15, v14

    if-nez v14, :cond_11

    move/from16 v14, p7

    invoke-virtual {v8, v14}, Llp2;->g(Z)Z

    move-result v28

    if-eqz v28, :cond_10

    const/high16 v28, 0x4000000

    goto :goto_9

    :cond_10
    const/high16 v28, 0x2000000

    :goto_9
    or-int v17, v17, v28

    goto :goto_a

    :cond_11
    move/from16 v14, p7

    :goto_a
    const/high16 v28, 0x30000000

    and-int v28, p15, v28

    move-object/from16 v9, p8

    if-nez v28, :cond_13

    invoke-virtual {v8, v9}, Llp2;->f(Ljava/lang/Object;)Z

    move-result v30

    if-eqz v30, :cond_12

    const/high16 v30, 0x20000000

    goto :goto_b

    :cond_12
    const/high16 v30, 0x10000000

    :goto_b
    or-int v17, v17, v30

    :cond_13
    and-int/lit8 v30, v11, 0x6

    if-nez v30, :cond_16

    and-int/lit8 v30, v11, 0x8

    if-nez v30, :cond_14

    invoke-virtual {v8, v10}, Llp2;->f(Ljava/lang/Object;)Z

    move-result v30

    goto :goto_c

    :cond_14
    invoke-virtual {v8, v10}, Llp2;->h(Ljava/lang/Object;)Z

    move-result v30

    :goto_c
    if-eqz v30, :cond_15

    const/16 v30, 0x4

    goto :goto_d

    :cond_15
    const/16 v30, 0x2

    :goto_d
    or-int v30, v11, v30

    goto :goto_e

    :cond_16
    move/from16 v30, v11

    :goto_e
    and-int/lit8 v31, v11, 0x30

    move-object/from16 v9, p10

    if-nez v31, :cond_18

    invoke-virtual {v8, v9}, Llp2;->h(Ljava/lang/Object;)Z

    move-result v31

    if-eqz v31, :cond_17

    const/16 v21, 0x20

    :cond_17
    or-int v30, v30, v21

    :cond_18
    and-int/lit16 v9, v11, 0x180

    if-nez v9, :cond_1a

    invoke-virtual {v8, v0}, Llp2;->h(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_19

    move/from16 v22, v23

    :cond_19
    or-int v30, v30, v22

    :cond_1a
    and-int/lit16 v9, v11, 0xc00

    if-nez v9, :cond_1c

    invoke-virtual {v8, v15}, Llp2;->h(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1b

    move/from16 v24, v25

    :cond_1b
    or-int v30, v30, v24

    :cond_1c
    and-int/lit16 v9, v11, 0x6000

    if-nez v9, :cond_1e

    invoke-virtual {v8, v13}, Llp2;->f(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1d

    const/16 v26, 0x4000

    :cond_1d
    or-int v30, v30, v26

    :cond_1e
    move/from16 v9, v30

    const v21, 0x12492493

    and-int v11, v17, v21

    move-object/from16 v21, v12

    const v12, 0x12492492

    if-ne v11, v12, :cond_20

    and-int/lit16 v11, v9, 0x2493

    const/16 v12, 0x2492

    if-eq v11, v12, :cond_1f

    goto :goto_f

    :cond_1f
    const/4 v11, 0x0

    goto :goto_10

    :cond_20
    :goto_f
    const/4 v11, 0x1

    :goto_10
    and-int/lit8 v12, v17, 0x1

    invoke-virtual {v8, v12, v11}, Llp2;->N(IZ)Z

    move-result v11

    if-eqz v11, :cond_50

    .line 2
    invoke-static {v8}, Lpn7;->n(Llp2;)F

    move-result v14

    and-int/lit8 v11, v9, 0x70

    const/16 v12, 0x20

    if-ne v11, v12, :cond_21

    const/4 v11, 0x1

    goto :goto_11

    :cond_21
    const/4 v11, 0x0

    :goto_11
    const/high16 v12, 0xe000000

    and-int v12, v17, v12

    const/high16 v15, 0x4000000

    if-ne v12, v15, :cond_22

    const/4 v12, 0x1

    goto :goto_12

    :cond_22
    const/4 v12, 0x0

    :goto_12
    or-int/2addr v11, v12

    const/high16 v12, 0x70000000

    and-int v12, v17, v12

    const/high16 v15, 0x20000000

    if-ne v12, v15, :cond_23

    const/4 v12, 0x1

    goto :goto_13

    :cond_23
    const/4 v12, 0x0

    :goto_13
    or-int/2addr v11, v12

    and-int/lit8 v15, v9, 0xe

    const/4 v12, 0x4

    if-eq v15, v12, :cond_25

    and-int/lit8 v19, v9, 0x8

    if-eqz v19, :cond_24

    .line 3
    invoke-virtual {v8, v10}, Llp2;->f(Ljava/lang/Object;)Z

    move-result v19

    if-eqz v19, :cond_24

    goto :goto_14

    :cond_24
    const/16 v19, 0x0

    goto :goto_15

    :cond_25
    :goto_14
    const/16 v19, 0x1

    :goto_15
    or-int v11, v11, v19

    const v19, 0xe000

    and-int v12, v9, v19

    move/from16 v19, v9

    const/16 v9, 0x4000

    if-ne v12, v9, :cond_26

    const/4 v9, 0x1

    goto :goto_16

    :cond_26
    const/4 v9, 0x0

    :goto_16
    or-int/2addr v9, v11

    .line 4
    invoke-virtual {v8, v14}, Llp2;->c(F)Z

    move-result v11

    or-int/2addr v9, v11

    .line 5
    invoke-virtual {v8}, Llp2;->K()Ljava/lang/Object;

    move-result-object v11

    .line 6
    sget-object v12, Lzz0;->a:Lbe;

    if-nez v9, :cond_28

    if-ne v11, v12, :cond_27

    goto :goto_17

    :cond_27
    move-object/from16 v1, v16

    move/from16 v16, v15

    move-object v15, v1

    move-object v3, v8

    move-object/from16 v32, v12

    move-object/from16 v1, v18

    move-object/from16 v2, v21

    const/4 v7, 0x2

    goto :goto_18

    .line 7
    :cond_28
    :goto_17
    new-instance v8, Lke5;

    move-object/from16 v1, v16

    move/from16 v16, v15

    move-object v15, v1

    move-object/from16 v11, p8

    move-object/from16 v9, p10

    move-object/from16 v3, p14

    move-object/from16 v32, v12

    move-object/from16 v1, v18

    move-object/from16 v2, v21

    const/4 v7, 0x2

    move-object v12, v10

    move/from16 v10, p7

    .line 8
    invoke-direct/range {v8 .. v14}, Lke5;-><init>(Lgn2;ZLq58;Lo58;Lgg5;F)V

    .line 9
    invoke-virtual {v3, v8}, Llp2;->g0(Ljava/lang/Object;)V

    move-object v11, v8

    .line 10
    :goto_18
    check-cast v11, Lke5;

    .line 11
    sget-object v8, Ly01;->n:Lox1;

    .line 12
    invoke-virtual {v3, v8}, Llp2;->j(Lq06;)Ljava/lang/Object;

    move-result-object v8

    .line 13
    check-cast v8, Lz24;

    .line 14
    invoke-static {v3}, Lkm4;->I(Llp2;)I

    move-result v9

    .line 15
    invoke-virtual {v3}, Llp2;->l()Lkl5;

    move-result-object v12

    .line 16
    invoke-static {v3, v2}, Lw45;->Q(Llp2;Lkx4;)Lkx4;

    move-result-object v7

    .line 17
    sget-object v18, Luz0;->j:Lpz2;

    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    invoke-virtual {v3}, Llp2;->Z()V

    move/from16 v18, v14

    .line 19
    iget-boolean v14, v3, Llp2;->S:Z

    if-eqz v14, :cond_29

    .line 20
    invoke-virtual {v3}, Llp2;->k()V

    goto :goto_19

    .line 21
    :cond_29
    invoke-virtual {v3}, Llp2;->j0()V

    .line 22
    :goto_19
    sget-object v14, Lpz2;->B0:Ldx0;

    .line 23
    invoke-static {v14, v3, v11}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 24
    sget-object v11, Lpz2;->A0:Ldx0;

    .line 25
    invoke-static {v11, v3, v12}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 26
    sget-object v12, Lpz2;->C0:Ldx0;

    .line 27
    iget-boolean v10, v3, Llp2;->S:Z

    if-nez v10, :cond_2a

    .line 28
    invoke-virtual {v3}, Llp2;->K()Ljava/lang/Object;

    move-result-object v10

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v10, v6}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_2b

    .line 29
    :cond_2a
    invoke-static {v9, v3, v9, v12}, Lp61;->v(ILlp2;ILdx0;)V

    .line 30
    :cond_2b
    sget-object v6, Lpz2;->z0:Ldx0;

    .line 31
    invoke-static {v6, v3, v7}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    shr-int/lit8 v7, v19, 0x6

    and-int/lit8 v7, v7, 0xe

    .line 32
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-virtual {v0, v3, v7}, Lzy0;->K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    sget-object v7, Lxv4;->X:Lxv4;

    if-eqz v4, :cond_2f

    const v9, 0x7fe3b06d

    invoke-virtual {v3, v9}, Llp2;->W(I)V

    .line 34
    const-string v9, "Leading"

    invoke-static {v2, v9}, Lx97;->O(Lkx4;Ljava/lang/Object;)Lkx4;

    move-result-object v9

    .line 35
    invoke-interface {v9, v7}, Lkx4;->y(Lkx4;)Lkx4;

    move-result-object v9

    const/4 v10, 0x0

    .line 36
    invoke-static {v15, v10}, Lg80;->c(Lp50;Z)Lxr4;

    move-result-object v0

    .line 37
    invoke-static {v3}, Lkm4;->I(Llp2;)I

    move-result v10

    move-object/from16 v21, v1

    .line 38
    invoke-virtual {v3}, Llp2;->l()Lkl5;

    move-result-object v1

    .line 39
    invoke-static {v3, v9}, Lw45;->Q(Llp2;Lkx4;)Lkx4;

    move-result-object v9

    .line 40
    invoke-virtual {v3}, Llp2;->Z()V

    move-object/from16 v23, v8

    .line 41
    iget-boolean v8, v3, Llp2;->S:Z

    if-eqz v8, :cond_2c

    .line 42
    invoke-virtual {v3}, Llp2;->k()V

    goto :goto_1a

    .line 43
    :cond_2c
    invoke-virtual {v3}, Llp2;->j0()V

    .line 44
    :goto_1a
    invoke-static {v14, v3, v0}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 45
    invoke-static {v11, v3, v1}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 46
    iget-boolean v0, v3, Llp2;->S:Z

    if-nez v0, :cond_2d

    .line 47
    invoke-virtual {v3}, Llp2;->K()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v0, v1}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2e

    .line 48
    :cond_2d
    invoke-static {v10, v3, v10, v12}, Lp61;->v(ILlp2;ILdx0;)V

    .line 49
    :cond_2e
    invoke-static {v6, v3, v9}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    shr-int/lit8 v0, v17, 0xc

    and-int/lit8 v0, v0, 0xe

    .line 50
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v4, v3, v0}, Lrn2;->K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v0, 0x1

    .line 51
    invoke-virtual {v3, v0}, Llp2;->p(Z)V

    const/4 v10, 0x0

    .line 52
    invoke-virtual {v3, v10}, Llp2;->p(Z)V

    goto :goto_1b

    :cond_2f
    move-object/from16 v21, v1

    move-object/from16 v23, v8

    const/4 v10, 0x0

    const v0, 0x7fe7716d

    .line 53
    invoke-virtual {v3, v0}, Llp2;->W(I)V

    .line 54
    invoke-virtual {v3, v10}, Llp2;->p(Z)V

    :goto_1b
    if-eqz v5, :cond_33

    const v0, 0x7fe8184b

    .line 55
    invoke-virtual {v3, v0}, Llp2;->W(I)V

    .line 56
    const-string v0, "Trailing"

    invoke-static {v2, v0}, Lx97;->O(Lkx4;Ljava/lang/Object;)Lkx4;

    move-result-object v0

    .line 57
    invoke-interface {v0, v7}, Lkx4;->y(Lkx4;)Lkx4;

    move-result-object v0

    .line 58
    invoke-static {v15, v10}, Lg80;->c(Lp50;Z)Lxr4;

    move-result-object v1

    .line 59
    invoke-static {v3}, Lkm4;->I(Llp2;)I

    move-result v7

    .line 60
    invoke-virtual {v3}, Llp2;->l()Lkl5;

    move-result-object v8

    .line 61
    invoke-static {v3, v0}, Lw45;->Q(Llp2;Lkx4;)Lkx4;

    move-result-object v0

    .line 62
    invoke-virtual {v3}, Llp2;->Z()V

    .line 63
    iget-boolean v9, v3, Llp2;->S:Z

    if-eqz v9, :cond_30

    .line 64
    invoke-virtual {v3}, Llp2;->k()V

    goto :goto_1c

    .line 65
    :cond_30
    invoke-virtual {v3}, Llp2;->j0()V

    .line 66
    :goto_1c
    invoke-static {v14, v3, v1}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 67
    invoke-static {v11, v3, v8}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 68
    iget-boolean v1, v3, Llp2;->S:Z

    if-nez v1, :cond_31

    .line 69
    invoke-virtual {v3}, Llp2;->K()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v1, v8}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_32

    .line 70
    :cond_31
    invoke-static {v7, v3, v7, v12}, Lp61;->v(ILlp2;ILdx0;)V

    .line 71
    :cond_32
    invoke-static {v6, v3, v0}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    shr-int/lit8 v0, v17, 0xf

    and-int/lit8 v0, v0, 0xe

    .line 72
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v5, v3, v0}, Lrn2;->K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v0, 0x1

    .line 73
    invoke-virtual {v3, v0}, Llp2;->p(Z)V

    const/4 v10, 0x0

    .line 74
    invoke-virtual {v3, v10}, Llp2;->p(Z)V

    :goto_1d
    move-object/from16 v8, v23

    goto :goto_1e

    :cond_33
    const v0, 0x7febe0cd

    .line 75
    invoke-virtual {v3, v0}, Llp2;->W(I)V

    .line 76
    invoke-virtual {v3, v10}, Llp2;->p(Z)V

    goto :goto_1d

    .line 77
    :goto_1e
    invoke-static {v13, v8}, Los4;->h(Lgg5;Lz24;)F

    move-result v0

    .line 78
    invoke-static {v13, v8}, Los4;->g(Lgg5;Lz24;)F

    move-result v1

    const/4 v7, 0x0

    if-eqz v4, :cond_34

    sub-float v0, v0, v18

    cmpg-float v8, v0, v7

    if-gez v8, :cond_34

    move v0, v7

    :cond_34
    move/from16 v24, v0

    if-eqz v5, :cond_35

    sub-float v1, v1, v18

    cmpg-float v0, v1, v7

    if-gez v0, :cond_35

    move v1, v7

    :cond_35
    const/high16 v0, 0x41c00000    # 24.0f

    if-eqz p5, :cond_39

    const v8, 0x7ff69eb8

    .line 79
    invoke-virtual {v3, v8}, Llp2;->W(I)V

    .line 80
    const-string v8, "Prefix"

    invoke-static {v2, v8}, Lx97;->O(Lkx4;Ljava/lang/Object;)Lkx4;

    move-result-object v8

    const/4 v9, 0x2

    .line 81
    invoke-static {v8, v0, v9}, Landroidx/compose/foundation/layout/b;->c(Lkx4;FI)Lkx4;

    move-result-object v8

    .line 82
    invoke-static {v8}, Landroidx/compose/foundation/layout/b;->m(Lkx4;)Lkx4;

    move-result-object v23

    const/16 v27, 0x0

    const/16 v28, 0xa

    const/16 v25, 0x0

    const/high16 v26, 0x40000000    # 2.0f

    .line 83
    invoke-static/range {v23 .. v28}, Los4;->A(Lkx4;FFFFI)Lkx4;

    move-result-object v8

    move-object/from16 v9, v21

    const/4 v10, 0x0

    .line 84
    invoke-static {v9, v10}, Lg80;->c(Lp50;Z)Lxr4;

    move-result-object v15

    .line 85
    invoke-static {v3}, Lkm4;->I(Llp2;)I

    move-result v10

    .line 86
    invoke-virtual {v3}, Llp2;->l()Lkl5;

    move-result-object v7

    .line 87
    invoke-static {v3, v8}, Lw45;->Q(Llp2;Lkx4;)Lkx4;

    move-result-object v8

    .line 88
    invoke-virtual {v3}, Llp2;->Z()V

    .line 89
    iget-boolean v0, v3, Llp2;->S:Z

    if-eqz v0, :cond_36

    .line 90
    invoke-virtual {v3}, Llp2;->k()V

    goto :goto_1f

    .line 91
    :cond_36
    invoke-virtual {v3}, Llp2;->j0()V

    .line 92
    :goto_1f
    invoke-static {v14, v3, v15}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 93
    invoke-static {v11, v3, v7}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 94
    iget-boolean v0, v3, Llp2;->S:Z

    if-nez v0, :cond_37

    .line 95
    invoke-virtual {v3}, Llp2;->K()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v0, v7}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_38

    .line 96
    :cond_37
    invoke-static {v10, v3, v10, v12}, Lp61;->v(ILlp2;ILdx0;)V

    .line 97
    :cond_38
    invoke-static {v6, v3, v8}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    shr-int/lit8 v0, v17, 0x12

    and-int/lit8 v0, v0, 0xe

    .line 98
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    move-object/from16 v7, p5

    invoke-interface {v7, v3, v0}, Lrn2;->K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v0, 0x1

    .line 99
    invoke-virtual {v3, v0}, Llp2;->p(Z)V

    const/4 v10, 0x0

    .line 100
    invoke-virtual {v3, v10}, Llp2;->p(Z)V

    goto :goto_20

    :cond_39
    move-object/from16 v7, p5

    move-object/from16 v9, v21

    const/4 v10, 0x0

    const v0, 0x7ffb9ecd

    .line 101
    invoke-virtual {v3, v0}, Llp2;->W(I)V

    .line 102
    invoke-virtual {v3, v10}, Llp2;->p(Z)V

    :goto_20
    if-eqz p6, :cond_3d

    const v0, 0x7ffc47ba

    .line 103
    invoke-virtual {v3, v0}, Llp2;->W(I)V

    .line 104
    const-string v0, "Suffix"

    invoke-static {v2, v0}, Lx97;->O(Lkx4;Ljava/lang/Object;)Lkx4;

    move-result-object v0

    const/high16 v8, 0x41c00000    # 24.0f

    const/4 v10, 0x2

    .line 105
    invoke-static {v0, v8, v10}, Landroidx/compose/foundation/layout/b;->c(Lkx4;FI)Lkx4;

    move-result-object v0

    .line 106
    invoke-static {v0}, Landroidx/compose/foundation/layout/b;->m(Lkx4;)Lkx4;

    move-result-object v25

    const/16 v29, 0x0

    const/16 v30, 0xa

    const/high16 v26, 0x40000000    # 2.0f

    const/16 v27, 0x0

    move/from16 v28, v1

    .line 107
    invoke-static/range {v25 .. v30}, Los4;->A(Lkx4;FFFFI)Lkx4;

    move-result-object v0

    const/4 v10, 0x0

    .line 108
    invoke-static {v9, v10}, Lg80;->c(Lp50;Z)Lxr4;

    move-result-object v1

    .line 109
    invoke-static {v3}, Lkm4;->I(Llp2;)I

    move-result v8

    .line 110
    invoke-virtual {v3}, Llp2;->l()Lkl5;

    move-result-object v10

    .line 111
    invoke-static {v3, v0}, Lw45;->Q(Llp2;Lkx4;)Lkx4;

    move-result-object v0

    .line 112
    invoke-virtual {v3}, Llp2;->Z()V

    .line 113
    iget-boolean v15, v3, Llp2;->S:Z

    if-eqz v15, :cond_3a

    .line 114
    invoke-virtual {v3}, Llp2;->k()V

    goto :goto_21

    .line 115
    :cond_3a
    invoke-virtual {v3}, Llp2;->j0()V

    .line 116
    :goto_21
    invoke-static {v14, v3, v1}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 117
    invoke-static {v11, v3, v10}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 118
    iget-boolean v1, v3, Llp2;->S:Z

    if-nez v1, :cond_3b

    .line 119
    invoke-virtual {v3}, Llp2;->K()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v1, v10}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3c

    .line 120
    :cond_3b
    invoke-static {v8, v3, v8, v12}, Lp61;->v(ILlp2;ILdx0;)V

    .line 121
    :cond_3c
    invoke-static {v6, v3, v0}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    shr-int/lit8 v0, v17, 0x15

    and-int/lit8 v0, v0, 0xe

    .line 122
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    move-object/from16 v1, p6

    invoke-interface {v1, v3, v0}, Lrn2;->K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v0, 0x1

    .line 123
    invoke-virtual {v3, v0}, Llp2;->p(Z)V

    const/4 v10, 0x0

    .line 124
    invoke-virtual {v3, v10}, Llp2;->p(Z)V

    :goto_22
    const/high16 v8, 0x41c00000    # 24.0f

    const/4 v10, 0x2

    goto :goto_23

    :cond_3d
    move/from16 v28, v1

    const/4 v10, 0x0

    move-object/from16 v1, p6

    const v0, -0x7ffebfb3

    .line 125
    invoke-virtual {v3, v0}, Llp2;->W(I)V

    .line 126
    invoke-virtual {v3, v10}, Llp2;->p(Z)V

    goto :goto_22

    .line 127
    :goto_23
    invoke-static {v2, v8, v10}, Landroidx/compose/foundation/layout/b;->c(Lkx4;FI)Lkx4;

    move-result-object v0

    .line 128
    invoke-static {v0}, Landroidx/compose/foundation/layout/b;->m(Lkx4;)Lkx4;

    move-result-object v33

    if-nez v7, :cond_3e

    move/from16 v34, v24

    goto :goto_24

    :cond_3e
    const/16 v34, 0x0

    :goto_24
    if-nez v1, :cond_3f

    move/from16 v36, v28

    goto :goto_25

    :cond_3f
    const/16 v36, 0x0

    :goto_25
    const/16 v37, 0x0

    const/16 v38, 0xa

    const/16 v35, 0x0

    .line 129
    invoke-static/range {v33 .. v38}, Los4;->A(Lkx4;FFFFI)Lkx4;

    move-result-object v0

    if-eqz p1, :cond_40

    const v8, -0x7ff91a72

    .line 130
    invoke-virtual {v3, v8}, Llp2;->W(I)V

    .line 131
    const-string v8, "Hint"

    invoke-static {v2, v8}, Lx97;->O(Lkx4;Ljava/lang/Object;)Lkx4;

    move-result-object v8

    invoke-interface {v8, v0}, Lkx4;->y(Lkx4;)Lkx4;

    move-result-object v8

    shr-int/lit8 v10, v17, 0x3

    and-int/lit8 v10, v10, 0x70

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    move-object/from16 v15, p1

    invoke-interface {v15, v8, v3, v10}, Lsn2;->x(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v10, 0x0

    .line 132
    invoke-virtual {v3, v10}, Llp2;->p(Z)V

    goto :goto_26

    :cond_40
    move-object/from16 v15, p1

    const/4 v10, 0x0

    const v8, -0x7ff7b5d3

    .line 133
    invoke-virtual {v3, v8}, Llp2;->W(I)V

    .line 134
    invoke-virtual {v3, v10}, Llp2;->p(Z)V

    .line 135
    :goto_26
    const-string v8, "TextField"

    invoke-static {v2, v8}, Lx97;->O(Lkx4;Ljava/lang/Object;)Lkx4;

    move-result-object v8

    invoke-interface {v8, v0}, Lkx4;->y(Lkx4;)Lkx4;

    move-result-object v0

    const/4 v8, 0x1

    .line 136
    invoke-static {v9, v8}, Lg80;->c(Lp50;Z)Lxr4;

    move-result-object v10

    .line 137
    invoke-static {v3}, Lkm4;->I(Llp2;)I

    move-result v8

    .line 138
    invoke-virtual {v3}, Llp2;->l()Lkl5;

    move-result-object v1

    .line 139
    invoke-static {v3, v0}, Lw45;->Q(Llp2;Lkx4;)Lkx4;

    move-result-object v0

    .line 140
    invoke-virtual {v3}, Llp2;->Z()V

    .line 141
    iget-boolean v4, v3, Llp2;->S:Z

    if-eqz v4, :cond_41

    .line 142
    invoke-virtual {v3}, Llp2;->k()V

    goto :goto_27

    .line 143
    :cond_41
    invoke-virtual {v3}, Llp2;->j0()V

    .line 144
    :goto_27
    invoke-static {v14, v3, v10}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 145
    invoke-static {v11, v3, v1}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 146
    iget-boolean v1, v3, Llp2;->S:Z

    if-nez v1, :cond_42

    .line 147
    invoke-virtual {v3}, Llp2;->K()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v1, v4}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_43

    .line 148
    :cond_42
    invoke-static {v8, v3, v8, v12}, Lp61;->v(ILlp2;ILdx0;)V

    .line 149
    :cond_43
    invoke-static {v6, v3, v0}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    shr-int/lit8 v0, v17, 0x3

    and-int/lit8 v0, v0, 0xe

    .line 150
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    move-object/from16 v1, p0

    invoke-virtual {v1, v3, v0}, Lzy0;->K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v0, 0x1

    .line 151
    invoke-virtual {v3, v0}, Llp2;->p(Z)V

    if-eqz p2, :cond_4b

    const v0, -0x7fedc0ae

    .line 152
    invoke-virtual {v3, v0}, Llp2;->W(I)V

    move/from16 v0, v16

    const/4 v4, 0x4

    if-eq v0, v4, :cond_45

    and-int/lit8 v0, v19, 0x8

    move-object/from16 v10, p9

    if-eqz v0, :cond_44

    .line 153
    invoke-virtual {v3, v10}, Llp2;->h(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_44

    goto :goto_28

    :cond_44
    const/4 v0, 0x0

    goto :goto_29

    :cond_45
    move-object/from16 v10, p9

    :goto_28
    const/4 v0, 0x1

    .line 154
    :goto_29
    invoke-virtual {v3}, Llp2;->K()Ljava/lang/Object;

    move-result-object v4

    if-nez v0, :cond_47

    move-object/from16 v0, v32

    if-ne v4, v0, :cond_46

    goto :goto_2a

    :cond_46
    const/4 v0, 0x0

    goto :goto_2b

    .line 155
    :cond_47
    :goto_2a
    new-instance v4, Lee5;

    const/4 v0, 0x0

    invoke-direct {v4, v10, v0}, Lee5;-><init>(Lo58;B)V

    .line 156
    invoke-virtual {v3, v4}, Llp2;->g0(Ljava/lang/Object;)V

    .line 157
    :goto_2b
    check-cast v4, Ldn2;

    .line 158
    new-instance v8, Lzt0;

    const/4 v0, 0x1

    invoke-direct {v8, v4, v0}, Lzt0;-><init>(Ldn2;B)V

    invoke-static {v2, v8}, Lz68;->q0(Lkx4;Lsn2;)Lkx4;

    move-result-object v0

    .line 159
    invoke-static {v0}, Landroidx/compose/foundation/layout/b;->m(Lkx4;)Lkx4;

    move-result-object v0

    .line 160
    const-string v4, "Label"

    invoke-static {v0, v4}, Lx97;->O(Lkx4;Ljava/lang/Object;)Lkx4;

    move-result-object v0

    .line 161
    invoke-interface {v0, v2}, Lkx4;->y(Lkx4;)Lkx4;

    move-result-object v0

    const/4 v4, 0x0

    .line 162
    invoke-static {v9, v4}, Lg80;->c(Lp50;Z)Lxr4;

    move-result-object v8

    .line 163
    invoke-static {v3}, Lkm4;->I(Llp2;)I

    move-result v4

    .line 164
    invoke-virtual {v3}, Llp2;->l()Lkl5;

    move-result-object v1

    .line 165
    invoke-static {v3, v0}, Lw45;->Q(Llp2;Lkx4;)Lkx4;

    move-result-object v0

    .line 166
    invoke-virtual {v3}, Llp2;->Z()V

    .line 167
    iget-boolean v5, v3, Llp2;->S:Z

    if-eqz v5, :cond_48

    .line 168
    invoke-virtual {v3}, Llp2;->k()V

    goto :goto_2c

    .line 169
    :cond_48
    invoke-virtual {v3}, Llp2;->j0()V

    .line 170
    :goto_2c
    invoke-static {v14, v3, v8}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 171
    invoke-static {v11, v3, v1}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 172
    iget-boolean v1, v3, Llp2;->S:Z

    if-nez v1, :cond_49

    .line 173
    invoke-virtual {v3}, Llp2;->K()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v1, v5}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4a

    .line 174
    :cond_49
    invoke-static {v4, v3, v4, v12}, Lp61;->v(ILlp2;ILdx0;)V

    .line 175
    :cond_4a
    invoke-static {v6, v3, v0}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    shr-int/lit8 v0, v17, 0x9

    and-int/lit8 v0, v0, 0xe

    .line 176
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    move-object/from16 v1, p2

    invoke-interface {v1, v3, v0}, Lrn2;->K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v0, 0x1

    .line 177
    invoke-virtual {v3, v0}, Llp2;->p(Z)V

    const/4 v0, 0x0

    .line 178
    invoke-virtual {v3, v0}, Llp2;->p(Z)V

    goto :goto_2d

    :cond_4b
    move-object/from16 v1, p2

    move-object/from16 v10, p9

    const/4 v0, 0x0

    const v4, -0x7fe7b9d3

    .line 179
    invoke-virtual {v3, v4}, Llp2;->W(I)V

    .line 180
    invoke-virtual {v3, v0}, Llp2;->p(Z)V

    :goto_2d
    if-eqz p12, :cond_4f

    const v0, -0x7fe6fc50

    .line 181
    invoke-virtual {v3, v0}, Llp2;->W(I)V

    .line 182
    const-string v0, "Supporting"

    invoke-static {v2, v0}, Lx97;->O(Lkx4;Ljava/lang/Object;)Lkx4;

    move-result-object v0

    const/high16 v2, 0x41800000    # 16.0f

    const/4 v4, 0x2

    .line 183
    invoke-static {v0, v2, v4}, Landroidx/compose/foundation/layout/b;->c(Lkx4;FI)Lkx4;

    move-result-object v0

    .line 184
    invoke-static {v0}, Landroidx/compose/foundation/layout/b;->m(Lkx4;)Lkx4;

    move-result-object v0

    .line 185
    new-instance v4, Lig5;

    const/high16 v5, 0x40800000    # 4.0f

    const/4 v8, 0x0

    .line 186
    invoke-direct {v4, v2, v5, v2, v8}, Lig5;-><init>(FFFF)V

    .line 187
    invoke-static {v0, v4}, Los4;->w(Lkx4;Lgg5;)Lkx4;

    move-result-object v0

    const/4 v4, 0x0

    .line 188
    invoke-static {v9, v4}, Lg80;->c(Lp50;Z)Lxr4;

    move-result-object v2

    .line 189
    invoke-static {v3}, Lkm4;->I(Llp2;)I

    move-result v4

    .line 190
    invoke-virtual {v3}, Llp2;->l()Lkl5;

    move-result-object v5

    .line 191
    invoke-static {v3, v0}, Lw45;->Q(Llp2;Lkx4;)Lkx4;

    move-result-object v0

    .line 192
    invoke-virtual {v3}, Llp2;->Z()V

    .line 193
    iget-boolean v8, v3, Llp2;->S:Z

    if-eqz v8, :cond_4c

    .line 194
    invoke-virtual {v3}, Llp2;->k()V

    goto :goto_2e

    .line 195
    :cond_4c
    invoke-virtual {v3}, Llp2;->j0()V

    .line 196
    :goto_2e
    invoke-static {v14, v3, v2}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 197
    invoke-static {v11, v3, v5}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 198
    iget-boolean v2, v3, Llp2;->S:Z

    if-nez v2, :cond_4d

    .line 199
    invoke-virtual {v3}, Llp2;->K()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v2, v5}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4e

    .line 200
    :cond_4d
    invoke-static {v4, v3, v4, v12}, Lp61;->v(ILlp2;ILdx0;)V

    .line 201
    :cond_4e
    invoke-static {v6, v3, v0}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    shr-int/lit8 v0, v19, 0x9

    and-int/lit8 v0, v0, 0xe

    .line 202
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    move-object/from16 v2, p12

    invoke-interface {v2, v3, v0}, Lrn2;->K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v0, 0x1

    .line 203
    invoke-virtual {v3, v0}, Llp2;->p(Z)V

    const/4 v4, 0x0

    .line 204
    invoke-virtual {v3, v4}, Llp2;->p(Z)V

    goto :goto_2f

    :cond_4f
    move-object/from16 v2, p12

    const/4 v0, 0x1

    const/4 v4, 0x0

    const v5, -0x7fe1de33

    .line 205
    invoke-virtual {v3, v5}, Llp2;->W(I)V

    .line 206
    invoke-virtual {v3, v4}, Llp2;->p(Z)V

    .line 207
    :goto_2f
    invoke-virtual {v3, v0}, Llp2;->p(Z)V

    goto :goto_30

    :cond_50
    move-object v15, v2

    move-object v1, v3

    move-object v7, v6

    move-object v3, v8

    move-object/from16 v2, p12

    .line 208
    invoke-virtual {v3}, Llp2;->Q()V

    .line 209
    :goto_30
    invoke-virtual {v3}, Llp2;->r()Lj86;

    move-result-object v0

    if-eqz v0, :cond_51

    move-object v3, v0

    new-instance v0, Lfe5;

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move/from16 v16, p16

    move-object/from16 v39, v3

    move-object v6, v7

    move-object v14, v13

    move-object/from16 v7, p6

    move-object v3, v1

    move-object v13, v2

    move-object v2, v15

    move-object/from16 v1, p0

    move/from16 v15, p15

    invoke-direct/range {v0 .. v16}, Lfe5;-><init>(Lzy0;Lsn2;Lrn2;Lrn2;Lrn2;Lrn2;Lrn2;ZLq58;Lo58;Lgn2;Lzy0;Lrn2;Lgg5;II)V

    move-object/from16 v3, v39

    .line 210
    iput-object v0, v3, Lj86;->d:Lrn2;

    :cond_51
    return-void
.end method

.method public static h0(Lv15;)Lfk2;
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Lfk2;

    .line 5
    .line 6
    new-instance v1, Lgk2;

    .line 7
    .line 8
    invoke-virtual {p0}, Lv15;->b()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    sget-object v3, Lfk2;->c:Lfk2;

    .line 16
    .line 17
    iget-object v3, v3, Lfk2;->a:Lgk2;

    .line 18
    .line 19
    invoke-direct {v1, v2, v3, p0}, Lgk2;-><init>(Ljava/lang/String;Lgk2;Lv15;)V

    .line 20
    .line 21
    .line 22
    invoke-direct {v0, v1}, Lfk2;-><init>(Lgk2;)V

    .line 23
    .line 24
    .line 25
    return-object v0
.end method

.method public static final i(Lkx4;Lzy0;Lrn2;Lrn2;Lrn2;IJJLv09;Lzy0;Llp2;I)V
    .locals 22

    move-object/from16 v1, p0

    move-wide/from16 v4, p6

    move-object/from16 v0, p10

    move-object/from16 v11, p12

    const v2, -0x4835c278

    .line 1
    invoke-virtual {v11, v2}, Llp2;->X(I)Llp2;

    invoke-virtual {v11, v1}, Llp2;->f(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    goto :goto_0

    :cond_0
    const/4 v2, 0x2

    :goto_0
    or-int v2, p13, v2

    move-object/from16 v14, p1

    invoke-virtual {v11, v14}, Llp2;->h(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    const/16 v3, 0x20

    goto :goto_1

    :cond_1
    const/16 v3, 0x10

    :goto_1
    or-int/2addr v2, v3

    move-object/from16 v3, p2

    invoke-virtual {v11, v3}, Llp2;->h(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    const/16 v6, 0x100

    goto :goto_2

    :cond_2
    const/16 v6, 0x80

    :goto_2
    or-int/2addr v2, v6

    or-int/lit16 v2, v2, 0xc00

    move-object/from16 v6, p4

    invoke-virtual {v11, v6}, Llp2;->h(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_3

    const/16 v7, 0x4000

    goto :goto_3

    :cond_3
    const/16 v7, 0x2000

    :goto_3
    or-int/2addr v2, v7

    move/from16 v13, p5

    invoke-virtual {v11, v13}, Llp2;->d(I)Z

    move-result v7

    if-eqz v7, :cond_4

    const/high16 v7, 0x20000

    goto :goto_4

    :cond_4
    const/high16 v7, 0x10000

    :goto_4
    or-int/2addr v2, v7

    invoke-virtual {v11, v4, v5}, Llp2;->e(J)Z

    move-result v7

    if-eqz v7, :cond_5

    const/high16 v7, 0x100000

    goto :goto_5

    :cond_5
    const/high16 v7, 0x80000

    :goto_5
    or-int/2addr v2, v7

    const/high16 v7, 0x400000

    or-int/2addr v2, v7

    invoke-virtual {v11, v0}, Llp2;->f(Ljava/lang/Object;)Z

    move-result v7

    const/high16 v8, 0x4000000

    if-eqz v7, :cond_6

    move v7, v8

    goto :goto_6

    :cond_6
    const/high16 v7, 0x2000000

    :goto_6
    or-int/2addr v2, v7

    move-object/from16 v12, p11

    invoke-virtual {v11, v12}, Llp2;->h(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_7

    const/high16 v7, 0x20000000

    goto :goto_7

    :cond_7
    const/high16 v7, 0x10000000

    :goto_7
    or-int/2addr v2, v7

    const v7, 0x12492493

    and-int/2addr v7, v2

    const v9, 0x12492492

    if-eq v7, v9, :cond_8

    const/4 v7, 0x1

    goto :goto_8

    :cond_8
    const/4 v7, 0x0

    :goto_8
    and-int/lit8 v9, v2, 0x1

    invoke-virtual {v11, v9, v7}, Llp2;->N(IZ)Z

    move-result v7

    if-eqz v7, :cond_15

    invoke-virtual {v11}, Llp2;->S()V

    and-int/lit8 v7, p13, 0x1

    const v9, -0x1c00001

    if-eqz v7, :cond_a

    invoke-virtual {v11}, Llp2;->x()Z

    move-result v7

    if-eqz v7, :cond_9

    goto :goto_9

    .line 2
    :cond_9
    invoke-virtual {v11}, Llp2;->Q()V

    and-int/2addr v2, v9

    move-object/from16 v16, p3

    move-wide/from16 v6, p8

    goto :goto_a

    .line 3
    :cond_a
    :goto_9
    sget-object v7, Lez0;->a:Lzy0;

    .line 4
    invoke-static {v4, v5, v11}, Lkw0;->a(JLlp2;)J

    move-result-wide v16

    and-int/2addr v2, v9

    move-wide/from16 v20, v16

    move-object/from16 v16, v7

    move-wide/from16 v6, v20

    .line 5
    :goto_a
    invoke-virtual {v11}, Llp2;->q()V

    const/high16 v9, 0xe000000

    and-int/2addr v9, v2

    const/high16 v17, 0x6000000

    xor-int v9, v9, v17

    if-le v9, v8, :cond_b

    .line 6
    invoke-virtual {v11, v0}, Llp2;->f(Ljava/lang/Object;)Z

    move-result v18

    if-nez v18, :cond_c

    :cond_b
    and-int v10, v2, v17

    if-ne v10, v8, :cond_d

    :cond_c
    const/4 v10, 0x1

    goto :goto_b

    :cond_d
    const/4 v10, 0x0

    .line 7
    :goto_b
    invoke-virtual {v11}, Llp2;->K()Ljava/lang/Object;

    move-result-object v15

    .line 8
    sget-object v8, Lzz0;->a:Lbe;

    if-nez v10, :cond_e

    if-ne v15, v8, :cond_f

    .line 9
    :cond_e
    new-instance v15, Le15;

    invoke-direct {v15, v0}, Le15;-><init>(Lv09;)V

    .line 10
    invoke-virtual {v11, v15}, Llp2;->g0(Ljava/lang/Object;)V

    .line 11
    :cond_f
    check-cast v15, Le15;

    .line 12
    invoke-virtual {v11, v15}, Llp2;->f(Ljava/lang/Object;)Z

    move-result v10

    move/from16 p3, v2

    const/high16 v2, 0x4000000

    if-le v9, v2, :cond_10

    invoke-virtual {v11, v0}, Llp2;->f(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_11

    :cond_10
    and-int v9, p3, v17

    if-ne v9, v2, :cond_12

    :cond_11
    const/16 v18, 0x1

    goto :goto_c

    :cond_12
    const/16 v18, 0x0

    :goto_c
    or-int v2, v10, v18

    .line 13
    invoke-virtual {v11}, Llp2;->K()Ljava/lang/Object;

    move-result-object v9

    if-nez v2, :cond_13

    if-ne v9, v8, :cond_14

    .line 14
    :cond_13
    new-instance v9, Lgq6;

    const/4 v2, 0x1

    invoke-direct {v9, v15, v0, v2}, Lgq6;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 15
    invoke-virtual {v11, v9}, Llp2;->g0(Ljava/lang/Object;)V

    .line 16
    :cond_14
    check-cast v9, Lgn2;

    invoke-static {v1, v9}, Lz51;->I(Lkx4;Lgn2;)Lkx4;

    move-result-object v2

    .line 17
    new-instance v12, Llw6;

    move-object/from16 v17, p4

    move-object/from16 v19, v3

    move-object/from16 v18, v15

    move-object/from16 v15, p11

    invoke-direct/range {v12 .. v19}, Llw6;-><init>(ILzy0;Lzy0;Lrn2;Lrn2;Le15;Lrn2;)V

    const v3, 0x329906e3

    invoke-static {v3, v12, v11}, Ljm4;->U(ILon2;Llp2;)Lzy0;

    move-result-object v10

    shr-int/lit8 v3, p3, 0xc

    and-int/lit16 v3, v3, 0x380

    const/high16 v8, 0xc00000

    or-int v12, v3, v8

    const/16 v13, 0x72

    const/4 v3, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    .line 18
    invoke-static/range {v2 .. v13}, Lay7;->a(Lkx4;Lx67;JJFFLzy0;Llp2;II)V

    move-wide v9, v6

    move-object/from16 v4, v16

    goto :goto_d

    .line 19
    :cond_15
    invoke-virtual/range {p12 .. p12}, Llp2;->Q()V

    move-object/from16 v4, p3

    move-wide/from16 v9, p8

    .line 20
    :goto_d
    invoke-virtual/range {p12 .. p12}, Llp2;->r()Lj86;

    move-result-object v14

    if-eqz v14, :cond_16

    new-instance v0, Lhw6;

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v5, p4

    move/from16 v6, p5

    move-wide/from16 v7, p6

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move/from16 v13, p13

    invoke-direct/range {v0 .. v13}, Lhw6;-><init>(Lkx4;Lzy0;Lrn2;Lrn2;Lrn2;IJJLv09;Lzy0;I)V

    .line 21
    iput-object v0, v14, Lj86;->d:Lrn2;

    :cond_16
    return-void
.end method

.method public static i0(IILxx1;)Lsg8;
    .locals 1

    .line 1
    and-int/lit8 v0, p1, 0x1

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/16 p0, 0x12c

    .line 6
    .line 7
    :cond_0
    and-int/lit8 v0, p1, 0x2

    .line 8
    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    goto :goto_0

    .line 13
    :cond_1
    const/16 v0, 0x5a

    .line 14
    .line 15
    :goto_0
    and-int/lit8 p1, p1, 0x4

    .line 16
    .line 17
    if-eqz p1, :cond_2

    .line 18
    .line 19
    sget-object p2, Lyx1;->a:Lb81;

    .line 20
    .line 21
    :cond_2
    new-instance p1, Lsg8;

    .line 22
    .line 23
    invoke-direct {p1, p0, v0, p2}, Lsg8;-><init>(IILxx1;)V

    .line 24
    .line 25
    .line 26
    return-object p1
.end method

.method public static final j(ILzy0;Lzy0;Lrn2;Lrn2;Lv09;Lrn2;Llp2;I)V
    .locals 17

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v7, p6

    move-object/from16 v0, p7

    const v1, -0x10b4d90d

    .line 1
    invoke-virtual {v0, v1}, Llp2;->X(I)Llp2;

    move/from16 v13, p0

    invoke-virtual {v0, v13}, Llp2;->d(I)Z

    move-result v1

    const/4 v6, 0x2

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    move v1, v6

    :goto_0
    or-int v1, p8, v1

    invoke-virtual {v0, v2}, Llp2;->h(Ljava/lang/Object;)Z

    move-result v9

    const/16 v10, 0x20

    if-eqz v9, :cond_1

    move v9, v10

    goto :goto_1

    :cond_1
    const/16 v9, 0x10

    :goto_1
    or-int/2addr v1, v9

    invoke-virtual {v0, v3}, Llp2;->h(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_2

    const/16 v9, 0x100

    goto :goto_2

    :cond_2
    const/16 v9, 0x80

    :goto_2
    or-int/2addr v1, v9

    invoke-virtual {v0, v4}, Llp2;->h(Ljava/lang/Object;)Z

    move-result v9

    const/16 v12, 0x800

    if-eqz v9, :cond_3

    move v9, v12

    goto :goto_3

    :cond_3
    const/16 v9, 0x400

    :goto_3
    or-int/2addr v1, v9

    invoke-virtual {v0, v5}, Llp2;->h(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_4

    const/16 v9, 0x4000

    goto :goto_4

    :cond_4
    const/16 v9, 0x2000

    :goto_4
    or-int/2addr v1, v9

    move-object/from16 v9, p5

    invoke-virtual {v0, v9}, Llp2;->f(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_5

    const/high16 v15, 0x20000

    goto :goto_5

    :cond_5
    const/high16 v15, 0x10000

    :goto_5
    or-int/2addr v1, v15

    invoke-virtual {v0, v7}, Llp2;->h(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_6

    const/high16 v15, 0x100000

    goto :goto_6

    :cond_6
    const/high16 v15, 0x80000

    :goto_6
    or-int/2addr v1, v15

    const v15, 0x92493

    and-int/2addr v15, v1

    const v11, 0x92492

    const/4 v14, 0x1

    if-eq v15, v11, :cond_7

    move v11, v14

    goto :goto_7

    :cond_7
    const/4 v11, 0x0

    :goto_7
    and-int/lit8 v15, v1, 0x1

    invoke-virtual {v0, v15, v11}, Llp2;->N(IZ)Z

    move-result v11

    if-eqz v11, :cond_1c

    .line 2
    invoke-virtual {v0}, Llp2;->K()Ljava/lang/Object;

    move-result-object v11

    .line 3
    sget-object v15, Lzz0;->a:Lbe;

    if-ne v11, v15, :cond_8

    .line 4
    new-instance v11, Lmw6;

    invoke-direct {v11}, Lmw6;-><init>()V

    .line 5
    invoke-virtual {v0, v11}, Llp2;->g0(Ljava/lang/Object;)V

    .line 6
    :cond_8
    check-cast v11, Lmw6;

    and-int/lit8 v8, v1, 0x70

    if-ne v8, v10, :cond_9

    move v8, v14

    goto :goto_8

    :cond_9
    const/4 v8, 0x0

    .line 7
    :goto_8
    invoke-virtual {v0}, Llp2;->K()Ljava/lang/Object;

    move-result-object v10

    if-nez v8, :cond_a

    if-ne v10, v15, :cond_b

    .line 8
    :cond_a
    new-instance v8, Ll8;

    invoke-direct {v8, v2, v6}, Ll8;-><init>(Lzy0;B)V

    .line 9
    new-instance v10, Lzy0;

    const v6, 0x24128b30

    invoke-direct {v10, v6, v14, v8}, Lzy0;-><init>(IZLjava/lang/Object;)V

    .line 10
    invoke-virtual {v0, v10}, Llp2;->g0(Ljava/lang/Object;)V

    .line 11
    :cond_b
    check-cast v10, Lrn2;

    and-int/lit16 v6, v1, 0x1c00

    if-ne v6, v12, :cond_c

    move v6, v14

    goto :goto_9

    :cond_c
    const/4 v6, 0x0

    .line 12
    :goto_9
    invoke-virtual {v0}, Llp2;->K()Ljava/lang/Object;

    move-result-object v8

    if-nez v6, :cond_d

    if-ne v8, v15, :cond_e

    .line 13
    :cond_d
    new-instance v6, Li8;

    const/4 v8, 0x5

    invoke-direct {v6, v4, v8}, Li8;-><init>(Lrn2;B)V

    .line 14
    new-instance v8, Lzy0;

    const v12, 0x18f7e4f7

    invoke-direct {v8, v12, v14, v6}, Lzy0;-><init>(IZLjava/lang/Object;)V

    .line 15
    invoke-virtual {v0, v8}, Llp2;->g0(Ljava/lang/Object;)V

    .line 16
    :cond_e
    check-cast v8, Lrn2;

    const v6, 0xe000

    and-int/2addr v6, v1

    const/16 v12, 0x4000

    if-ne v6, v12, :cond_f

    move v6, v14

    goto :goto_a

    :cond_f
    const/4 v6, 0x0

    .line 17
    :goto_a
    invoke-virtual {v0}, Llp2;->K()Ljava/lang/Object;

    move-result-object v12

    if-nez v6, :cond_10

    if-ne v12, v15, :cond_11

    .line 18
    :cond_10
    new-instance v6, Li8;

    const/4 v12, 0x4

    invoke-direct {v6, v5, v12}, Li8;-><init>(Lrn2;B)V

    .line 19
    new-instance v12, Lzy0;

    const v2, 0x142ea147

    invoke-direct {v12, v2, v14, v6}, Lzy0;-><init>(IZLjava/lang/Object;)V

    .line 20
    invoke-virtual {v0, v12}, Llp2;->g0(Ljava/lang/Object;)V

    .line 21
    :cond_11
    check-cast v12, Lrn2;

    and-int/lit16 v2, v1, 0x380

    const/16 v6, 0x100

    if-ne v2, v6, :cond_12

    move v2, v14

    goto :goto_b

    :cond_12
    const/4 v2, 0x0

    .line 22
    :goto_b
    invoke-virtual {v0}, Llp2;->K()Ljava/lang/Object;

    move-result-object v6

    if-nez v2, :cond_14

    if-ne v6, v15, :cond_13

    goto :goto_c

    :cond_13
    move/from16 v16, v1

    goto :goto_d

    .line 23
    :cond_14
    :goto_c
    new-instance v2, Ln40;

    invoke-direct {v2, v3, v11}, Ln40;-><init>(Lzy0;Lmw6;)V

    .line 24
    new-instance v6, Lzy0;

    move/from16 v16, v1

    const v1, -0x69e1890d

    invoke-direct {v6, v1, v14, v2}, Lzy0;-><init>(IZLjava/lang/Object;)V

    .line 25
    invoke-virtual {v0, v6}, Llp2;->g0(Ljava/lang/Object;)V

    .line 26
    :goto_d
    check-cast v6, Lrn2;

    const/high16 v1, 0x380000

    and-int v1, v16, v1

    const/high16 v2, 0x100000

    if-ne v1, v2, :cond_15

    move v1, v14

    goto :goto_e

    :cond_15
    const/4 v1, 0x0

    .line 27
    :goto_e
    invoke-virtual {v0}, Llp2;->K()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_16

    if-ne v2, v15, :cond_17

    .line 28
    :cond_16
    new-instance v1, Li8;

    const/4 v2, 0x3

    invoke-direct {v1, v7, v2}, Li8;-><init>(Lrn2;B)V

    .line 29
    new-instance v2, Lzy0;

    const v3, -0x67371298

    invoke-direct {v2, v3, v14, v1}, Lzy0;-><init>(IZLjava/lang/Object;)V

    .line 30
    invoke-virtual {v0, v2}, Llp2;->g0(Ljava/lang/Object;)V

    .line 31
    :cond_17
    check-cast v2, Lrn2;

    const/high16 v1, 0x70000

    and-int v1, v16, v1

    const/high16 v3, 0x20000

    if-ne v1, v3, :cond_18

    move v1, v14

    goto :goto_f

    :cond_18
    const/4 v1, 0x0

    .line 32
    :goto_f
    invoke-virtual {v0, v10}, Llp2;->f(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v1, v3

    invoke-virtual {v0, v8}, Llp2;->f(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v1, v3

    invoke-virtual {v0, v12}, Llp2;->f(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v1, v3

    and-int/lit8 v3, v16, 0xe

    const/4 v14, 0x4

    if-ne v3, v14, :cond_19

    const/4 v3, 0x1

    goto :goto_10

    :cond_19
    const/4 v3, 0x0

    :goto_10
    or-int/2addr v1, v3

    invoke-virtual {v0, v2}, Llp2;->f(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v1, v3

    invoke-virtual {v0, v6}, Llp2;->f(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v1, v3

    .line 33
    invoke-virtual {v0}, Llp2;->K()Ljava/lang/Object;

    move-result-object v3

    if-nez v1, :cond_1a

    if-ne v3, v15, :cond_1b

    :cond_1a
    move-object v15, v11

    move-object v11, v8

    goto :goto_11

    :cond_1b
    const/4 v1, 0x0

    const/4 v2, 0x1

    goto :goto_12

    .line 34
    :goto_11
    new-instance v8, Liw6;

    move-object v14, v2

    move-object/from16 v16, v6

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-direct/range {v8 .. v16}, Liw6;-><init>(Lv09;Lrn2;Lrn2;Lrn2;ILrn2;Lmw6;Lrn2;)V

    .line 35
    invoke-virtual {v0, v8}, Llp2;->g0(Ljava/lang/Object;)V

    move-object v3, v8

    .line 36
    :goto_12
    check-cast v3, Lrn2;

    const/4 v6, 0x0

    invoke-static {v6, v3, v0, v1, v2}, Lsp7;->a(Lkx4;Lrn2;Llp2;II)V

    goto :goto_13

    .line 37
    :cond_1c
    invoke-virtual {v0}, Llp2;->Q()V

    .line 38
    :goto_13
    invoke-virtual {v0}, Llp2;->r()Lj86;

    move-result-object v9

    if-eqz v9, :cond_1d

    new-instance v0, Ljw6;

    move/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v6, p5

    move/from16 v8, p8

    invoke-direct/range {v0 .. v8}, Ljw6;-><init>(ILzy0;Lzy0;Lrn2;Lrn2;Lv09;Lrn2;I)V

    .line 39
    iput-object v0, v9, Lj86;->d:Lrn2;

    :cond_1d
    return-void
.end method

.method public static final k(Lz64;Ljava/lang/Object;ILjava/lang/Object;Llp2;I)V
    .locals 6

    .line 1
    const v0, 0x55d242fd

    .line 2
    .line 3
    .line 4
    invoke-virtual {p4, v0}, Llp2;->X(I)Llp2;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p4, p0}, Llp2;->f(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    const/4 v0, 0x4

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 v0, 0x2

    .line 16
    :goto_0
    or-int/2addr v0, p5

    .line 17
    invoke-virtual {p4, p1}, Llp2;->f(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_1

    .line 22
    .line 23
    const/16 v1, 0x20

    .line 24
    .line 25
    goto :goto_1

    .line 26
    :cond_1
    const/16 v1, 0x10

    .line 27
    .line 28
    :goto_1
    or-int/2addr v0, v1

    .line 29
    invoke-virtual {p4, p2}, Llp2;->d(I)Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    if-eqz v1, :cond_2

    .line 34
    .line 35
    const/16 v1, 0x100

    .line 36
    .line 37
    goto :goto_2

    .line 38
    :cond_2
    const/16 v1, 0x80

    .line 39
    .line 40
    :goto_2
    or-int/2addr v0, v1

    .line 41
    invoke-virtual {p4, p3}, Llp2;->f(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    if-eqz v1, :cond_3

    .line 46
    .line 47
    const/16 v1, 0x800

    .line 48
    .line 49
    goto :goto_3

    .line 50
    :cond_3
    const/16 v1, 0x400

    .line 51
    .line 52
    :goto_3
    or-int/2addr v0, v1

    .line 53
    and-int/lit16 v1, v0, 0x493

    .line 54
    .line 55
    const/16 v2, 0x492

    .line 56
    .line 57
    const/4 v3, 0x1

    .line 58
    if-eq v1, v2, :cond_4

    .line 59
    .line 60
    move v1, v3

    .line 61
    goto :goto_4

    .line 62
    :cond_4
    const/4 v1, 0x0

    .line 63
    :goto_4
    and-int/2addr v0, v3

    .line 64
    invoke-virtual {p4, v0, v1}, Llp2;->N(IZ)Z

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    if-eqz v0, :cond_5

    .line 69
    .line 70
    move-object v0, p1

    .line 71
    check-cast v0, Liv6;

    .line 72
    .line 73
    new-instance v1, Lg64;

    .line 74
    .line 75
    invoke-direct {v1, p2, p0, p3}, Lg64;-><init>(ILz64;Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    const v2, 0x3a785bde

    .line 79
    .line 80
    .line 81
    invoke-static {v2, v1, p4}, Ljm4;->U(ILon2;Llp2;)Lzy0;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    const/16 v2, 0x30

    .line 86
    .line 87
    invoke-interface {v0, p3, v1, p4, v2}, Liv6;->b(Ljava/lang/Object;Lzy0;Llp2;I)V

    .line 88
    .line 89
    .line 90
    goto :goto_5

    .line 91
    :cond_5
    invoke-virtual {p4}, Llp2;->Q()V

    .line 92
    .line 93
    .line 94
    :goto_5
    invoke-virtual {p4}, Llp2;->r()Lj86;

    .line 95
    .line 96
    .line 97
    move-result-object p4

    .line 98
    if-eqz p4, :cond_6

    .line 99
    .line 100
    new-instance v0, Lg8;

    .line 101
    .line 102
    move-object v1, p0

    .line 103
    move-object v2, p1

    .line 104
    move v3, p2

    .line 105
    move-object v4, p3

    .line 106
    move v5, p5

    .line 107
    invoke-direct/range {v0 .. v5}, Lg8;-><init>(Lz64;Ljava/lang/Object;ILjava/lang/Object;I)V

    .line 108
    .line 109
    .line 110
    iput-object v0, p4, Lj86;->d:Lrn2;

    .line 111
    .line 112
    :cond_6
    return-void
.end method

.method public static final l(Lpw3;Lpw3;)Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-static {p0, p1}, Lz68;->p0(Lpw3;Lpw3;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-static {p1, p0}, Lz68;->p0(Lpw3;Lpw3;)Z

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    if-eqz p0, :cond_0

    .line 18
    .line 19
    const/4 p0, 0x1

    .line 20
    return p0

    .line 21
    :cond_0
    const/4 p0, 0x0

    .line 22
    return p0
.end method

.method public static final m(Ld53;Landroid/content/Context;)Log5;
    .locals 8

    .line 1
    instance-of v0, p0, Ld60;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    check-cast p0, Ld60;

    .line 7
    .line 8
    iget-object p0, p0, Ld60;->a:Landroid/graphics/Bitmap;

    .line 9
    .line 10
    new-instance p1, Lje;

    .line 11
    .line 12
    invoke-direct {p1, p0}, Lje;-><init>(Landroid/graphics/Bitmap;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    int-to-long v2, v0

    .line 24
    const/16 v0, 0x20

    .line 25
    .line 26
    shl-long/2addr v2, v0

    .line 27
    int-to-long v4, p0

    .line 28
    const-wide v6, 0xffffffffL

    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    and-long/2addr v4, v6

    .line 34
    or-long/2addr v2, v4

    .line 35
    new-instance p0, Landroidx/compose/ui/graphics/painter/BitmapPainter;

    .line 36
    .line 37
    invoke-direct {p0, p1, v2, v3}, Landroidx/compose/ui/graphics/painter/BitmapPainter;-><init>(Lje;J)V

    .line 38
    .line 39
    .line 40
    iput-boolean v1, p0, Landroidx/compose/ui/graphics/painter/BitmapPainter;->j0:Z

    .line 41
    .line 42
    return-object p0

    .line 43
    :cond_0
    instance-of v0, p0, Lyv1;

    .line 44
    .line 45
    if-eqz v0, :cond_1

    .line 46
    .line 47
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    invoke-static {p0, p1}, Lz39;->g(Ld53;Landroid/content/res/Resources;)Landroid/graphics/drawable/Drawable;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    invoke-virtual {p0, v1}, Landroid/graphics/drawable/Drawable;->setFilterBitmap(Z)V

    .line 60
    .line 61
    .line 62
    new-instance p1, Lcom/google/accompanist/drawablepainter/DrawablePainter;

    .line 63
    .line 64
    invoke-direct {p1, p0}, Lcom/google/accompanist/drawablepainter/DrawablePainter;-><init>(Landroid/graphics/drawable/Drawable;)V

    .line 65
    .line 66
    .line 67
    return-object p1

    .line 68
    :cond_1
    new-instance p1, Lcoil3/compose/ImagePainter;

    .line 69
    .line 70
    invoke-direct {p1, p0}, Lcoil3/compose/ImagePainter;-><init>(Ld53;)V

    .line 71
    .line 72
    .line 73
    return-object p1
.end method

.method public static final n(ILjava/lang/StringBuilder;)V
    .locals 6

    .line 1
    if-gtz p0, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0, p0}, Ljava/util/ArrayList;-><init>(I)V

    .line 7
    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    :goto_0
    if-ge v1, p0, :cond_1

    .line 11
    .line 12
    const-string v2, "?"

    .line 13
    .line 14
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    add-int/lit8 v1, v1, 0x1

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_1
    const/4 v4, 0x0

    .line 21
    const/16 v5, 0x3e

    .line 22
    .line 23
    const-string v1, ","

    .line 24
    .line 25
    const/4 v2, 0x0

    .line 26
    const/4 v3, 0x0

    .line 27
    invoke-static/range {v0 .. v5}, Lwv0;->y0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lgn2;I)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public static final o(Le37;)Ljava/util/Set;
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    instance-of v0, p0, Ltc0;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    check-cast p0, Ltc0;

    .line 9
    .line 10
    invoke-interface {p0}, Ltc0;->b()Ljava/util/Set;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0

    .line 15
    :cond_0
    new-instance v0, Ljava/util/HashSet;

    .line 16
    .line 17
    invoke-interface {p0}, Le37;->e()I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(I)V

    .line 22
    .line 23
    .line 24
    invoke-interface {p0}, Le37;->e()I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    const/4 v2, 0x0

    .line 29
    :goto_0
    if-ge v2, v1, :cond_1

    .line 30
    .line 31
    invoke-interface {p0, v2}, Le37;->f(I)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    invoke-virtual {v0, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    add-int/lit8 v2, v2, 0x1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    return-object v0
.end method

.method public static s(III)V
    .locals 3

    .line 1
    const-string v0, "startIndex: "

    .line 2
    .line 3
    if-ltz p0, :cond_1

    .line 4
    .line 5
    if-gt p1, p2, :cond_1

    .line 6
    .line 7
    if-gt p0, p1, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    const-string p2, " > endIndex: "

    .line 11
    .line 12
    invoke-static {v0, p0, p1, p2}, Lpc6;->m(Ljava/lang/String;IILjava/lang/String;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-static {p0}, Lbt;->q(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_1
    const-string v1, ", endIndex: "

    .line 21
    .line 22
    const-string v2, ", size: "

    .line 23
    .line 24
    invoke-static {p0, v0, p1, v1, v2}, Loi0;->r(ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-static {p2, p0}, Lbt;->f(ILjava/lang/StringBuilder;)V

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public static t(III)V
    .locals 3

    .line 1
    const-string v0, "fromIndex: "

    .line 2
    .line 3
    if-ltz p0, :cond_1

    .line 4
    .line 5
    if-gt p1, p2, :cond_1

    .line 6
    .line 7
    if-gt p0, p1, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    const-string p2, " > toIndex: "

    .line 11
    .line 12
    invoke-static {v0, p0, p1, p2}, Lpc6;->m(Ljava/lang/String;IILjava/lang/String;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-static {p0}, Lbt;->q(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_1
    const-string v1, ", toIndex: "

    .line 21
    .line 22
    const-string v2, ", size: "

    .line 23
    .line 24
    invoke-static {p0, v0, p1, v1, v2}, Loi0;->r(ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-static {p2, p0}, Lbt;->f(ILjava/lang/StringBuilder;)V

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public static final u(Ljava/util/List;)[Le37;
    .locals 1

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    :cond_0
    const/4 p0, 0x0

    .line 10
    :cond_1
    if-eqz p0, :cond_3

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    new-array v0, v0, [Le37;

    .line 14
    .line 15
    invoke-interface {p0, v0}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    check-cast p0, [Le37;

    .line 20
    .line 21
    if-nez p0, :cond_2

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_2
    return-object p0

    .line 25
    :cond_3
    :goto_0
    sget-object p0, Lwl7;->d:[Le37;

    .line 26
    .line 27
    return-object p0
.end method

.method public static w(ZLlh4;Ly14;I)Ljh8;
    .locals 7

    .line 1
    sget-object v6, Lz14;->t:Lz14;

    .line 2
    .line 3
    and-int/lit8 v0, p3, 0x4

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    sget-object p1, Llh4;->E0:Llh4;

    .line 8
    .line 9
    :cond_0
    move-object v4, p1

    .line 10
    and-int/lit8 p1, p3, 0x8

    .line 11
    .line 12
    if-eqz p1, :cond_1

    .line 13
    .line 14
    sget-object p2, Ly14;->i:Ly14;

    .line 15
    .line 16
    :cond_1
    move-object v5, p2

    .line 17
    new-instance v0, Ljh8;

    .line 18
    .line 19
    const/4 v3, 0x1

    .line 20
    const/4 v2, 0x1

    .line 21
    move v1, p0

    .line 22
    invoke-direct/range {v0 .. v6}, Ljh8;-><init>(ZZZLxi8;Lw79;Loc;)V

    .line 23
    .line 24
    .line 25
    return-object v0
.end method

.method public static final x(Lna1;Lrn2;Ls51;)Ljava/lang/Object;
    .locals 3

    .line 1
    new-instance v0, Lhs5;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    invoke-direct {v0, p1, v1, v2}, Lhs5;-><init>(Lrn2;Lq51;B)V

    .line 6
    .line 7
    .line 8
    invoke-interface {p0, v0, p2}, Lna1;->u(Lrn2;Ls51;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0
.end method

.method public static final y(ILjava/lang/String;)I
    .locals 11

    .line 1
    invoke-static {}, Lwl7;->F()Lyy1;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_5

    .line 7
    .line 8
    invoke-virtual {v0}, Lyy1;->c()I

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    const/4 v3, 0x0

    .line 13
    const/4 v4, 0x1

    .line 14
    if-ne v2, v4, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    move v4, v3

    .line 18
    :goto_0
    const-string v2, "Not initialized yet"

    .line 19
    .line 20
    invoke-static {v2, v4}, Lmb6;->s(Ljava/lang/String;Z)V

    .line 21
    .line 22
    .line 23
    const-string v2, "charSequence cannot be null"

    .line 24
    .line 25
    invoke-static {p1, v2}, Lmb6;->r(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    iget-object v0, v0, Lyy1;->e:Luy1;

    .line 29
    .line 30
    iget-object v4, v0, Luy1;->b:Llr;

    .line 31
    .line 32
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    const/4 v0, -0x1

    .line 36
    if-ltz p0, :cond_1

    .line 37
    .line 38
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    if-lt p0, v2, :cond_2

    .line 43
    .line 44
    :cond_1
    move-object v5, p1

    .line 45
    goto :goto_1

    .line 46
    :cond_2
    instance-of v2, p1, Landroid/text/Spanned;

    .line 47
    .line 48
    if-eqz v2, :cond_3

    .line 49
    .line 50
    move-object v2, p1

    .line 51
    check-cast v2, Landroid/text/Spanned;

    .line 52
    .line 53
    add-int/lit8 v5, p0, 0x1

    .line 54
    .line 55
    const-class v6, Lpj8;

    .line 56
    .line 57
    invoke-interface {v2, p0, v5, v6}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v5

    .line 61
    check-cast v5, [Lpj8;

    .line 62
    .line 63
    array-length v6, v5

    .line 64
    if-lez v6, :cond_3

    .line 65
    .line 66
    aget-object v3, v5, v3

    .line 67
    .line 68
    invoke-interface {v2, v3}, Landroid/text/Spanned;->getSpanEnd(Ljava/lang/Object;)I

    .line 69
    .line 70
    .line 71
    move-result v2

    .line 72
    move-object v5, p1

    .line 73
    goto :goto_2

    .line 74
    :cond_3
    add-int/lit8 v2, p0, -0x10

    .line 75
    .line 76
    invoke-static {v3, v2}, Ljava/lang/Math;->max(II)I

    .line 77
    .line 78
    .line 79
    move-result v6

    .line 80
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 81
    .line 82
    .line 83
    move-result v2

    .line 84
    add-int/lit8 v3, p0, 0x10

    .line 85
    .line 86
    invoke-static {v2, v3}, Ljava/lang/Math;->min(II)I

    .line 87
    .line 88
    .line 89
    move-result v7

    .line 90
    new-instance v10, Llz1;

    .line 91
    .line 92
    invoke-direct {v10, p0}, Llz1;-><init>(I)V

    .line 93
    .line 94
    .line 95
    const v8, 0x7fffffff

    .line 96
    .line 97
    .line 98
    const/4 v9, 0x1

    .line 99
    move-object v5, p1

    .line 100
    invoke-virtual/range {v4 .. v10}, Llr;->y(Ljava/lang/CharSequence;IIIZLkz1;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    check-cast p1, Llz1;

    .line 105
    .line 106
    iget v2, p1, Llz1;->Z:I

    .line 107
    .line 108
    goto :goto_2

    .line 109
    :goto_1
    move v2, v0

    .line 110
    :goto_2
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    if-ne v2, v0, :cond_4

    .line 115
    .line 116
    goto :goto_3

    .line 117
    :cond_4
    move-object v1, p1

    .line 118
    goto :goto_3

    .line 119
    :cond_5
    move-object v5, p1

    .line 120
    :goto_3
    if-eqz v1, :cond_6

    .line 121
    .line 122
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 123
    .line 124
    .line 125
    move-result p0

    .line 126
    return p0

    .line 127
    :cond_6
    invoke-static {}, Ljava/text/BreakIterator;->getCharacterInstance()Ljava/text/BreakIterator;

    .line 128
    .line 129
    .line 130
    move-result-object p1

    .line 131
    invoke-virtual {p1, v5}, Ljava/text/BreakIterator;->setText(Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    invoke-virtual {p1, p0}, Ljava/text/BreakIterator;->following(I)I

    .line 135
    .line 136
    .line 137
    move-result p0

    .line 138
    return p0
.end method

.method public static final z(ILjava/lang/String;)I
    .locals 4

    .line 1
    invoke-static {}, Lwl7;->F()Lyy1;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    add-int/lit8 v2, p0, -0x1

    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    invoke-static {v3, v2}, Ljava/lang/Math;->max(II)I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    invoke-virtual {v0, p1, v2}, Lyy1;->b(Ljava/lang/CharSequence;I)I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    const/4 v3, -0x1

    .line 28
    if-ne v2, v3, :cond_0

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    move-object v1, v0

    .line 32
    :cond_1
    :goto_0
    if-eqz v1, :cond_2

    .line 33
    .line 34
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 35
    .line 36
    .line 37
    move-result p0

    .line 38
    return p0

    .line 39
    :cond_2
    invoke-static {}, Ljava/text/BreakIterator;->getCharacterInstance()Ljava/text/BreakIterator;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-virtual {v0, p1}, Ljava/text/BreakIterator;->setText(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0, p0}, Ljava/text/BreakIterator;->preceding(I)I

    .line 47
    .line 48
    .line 49
    move-result p0

    .line 50
    return p0
.end method


# virtual methods
.method public C(Lr06;)Ljava/lang/Object;
    .locals 0

    .line 1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 2
    .line 3
    const-string p1, ""

    .line 4
    .line 5
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method

.method public abstract D(Landroid/view/ViewGroup$MarginLayoutParams;)I
.end method

.method public abstract G()I
.end method

.method public abstract H()I
.end method

.method public abstract I()I
.end method

.method public abstract J()I
.end method

.method public abstract K(Landroid/view/View;)I
.end method

.method public abstract L(Landroidx/coordinatorlayout/widget/CoordinatorLayout;)I
.end method

.method public abstract M()I
.end method

.method public abstract O(F)Z
.end method

.method public abstract P(Landroid/view/View;)Z
.end method

.method public abstract Q(FF)Z
.end method

.method public S(I)V
    .locals 0

    .line 1
    return-void
.end method

.method public abstract T(Landroid/graphics/Typeface;)V
.end method

.method public abstract U(Landroid/view/View;F)Z
.end method

.method public abstract j0(Landroid/view/ViewGroup$MarginLayoutParams;I)V
.end method

.method public abstract k0(Landroid/view/ViewGroup$MarginLayoutParams;II)V
.end method

.method public abstract p(Landroid/view/ViewGroup$MarginLayoutParams;)I
.end method

.method public abstract q(I)F
.end method

.method public r(I)V
    .locals 3

    .line 1
    new-instance v0, Landroid/os/Handler;

    .line 2
    .line 3
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 8
    .line 9
    .line 10
    new-instance v1, Lwf6;

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    invoke-direct {v1, p0, p1, v2}, Lwf6;-><init>(Ljava/lang/Object;IB)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public v(Lr06;)Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method
