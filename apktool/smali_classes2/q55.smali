.class public abstract Lq55;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# static fields
.field public static final a:[B

.field public static final b:Ljava/security/SecureRandom;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-string v0, "dnstt 2020-04-13"

    .line 2
    .line 3
    sget-object v1, Liq0;->a:Ljava/nio/charset/Charset;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    sput-object v0, Lq55;->a:[B

    .line 13
    .line 14
    new-instance v0, Ljava/security/SecureRandom;

    .line 15
    .line 16
    invoke-direct {v0}, Ljava/security/SecureRandom;-><init>()V

    .line 17
    .line 18
    .line 19
    sput-object v0, Lq55;->b:Ljava/security/SecureRandom;

    .line 20
    .line 21
    return-void
.end method

.method public static final a([B)Lv59;
    .locals 3

    .line 1
    array-length v0, p0

    .line 2
    const/16 v1, 0x20

    .line 3
    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    new-instance v0, Lv59;

    .line 7
    .line 8
    invoke-direct {v0, p0}, Lv59;-><init>([B)V

    .line 9
    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    new-instance v0, Lp55$d;

    .line 13
    .line 14
    array-length p0, p0

    .line 15
    const-string v1, "invalid key length "

    .line 16
    .line 17
    const-string v2, ", expected 32"

    .line 18
    .line 19
    invoke-static {v1, p0, v2}, Lie2;->h(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-direct {v0, p0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    throw v0
.end method

.method public static final b(Lv59;Lv59;)[B
    .locals 20

    .line 1
    sget-object v1, La81;->a:Ljava/util/concurrent/atomic/AtomicReference;

    .line 2
    .line 3
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    check-cast v1, Lz71;

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    const/16 v1, 0x20

    .line 13
    .line 14
    new-array v2, v1, [B

    .line 15
    .line 16
    new-array v3, v1, [B

    .line 17
    .line 18
    move-object/from16 v4, p1

    .line 19
    .line 20
    iget-object v4, v4, Lv59;->m0:[B

    .line 21
    .line 22
    const/4 v5, 0x0

    .line 23
    invoke-static {v4, v5, v3, v5, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 24
    .line 25
    .line 26
    move-object/from16 v4, p0

    .line 27
    .line 28
    iget-object v4, v4, Lv59;->m0:[B

    .line 29
    .line 30
    invoke-static {v5, v1, v4}, Lch3;->U(II[B)V

    .line 31
    .line 32
    .line 33
    invoke-static {v5, v1, v3}, Lch3;->U(II[B)V

    .line 34
    .line 35
    .line 36
    invoke-static {v5, v1, v2}, Lch3;->U(II[B)V

    .line 37
    .line 38
    .line 39
    const/16 v6, 0x8

    .line 40
    .line 41
    new-array v7, v6, [I

    .line 42
    .line 43
    move v8, v5

    .line 44
    :goto_0
    if-ge v8, v6, :cond_0

    .line 45
    .line 46
    mul-int/lit8 v9, v8, 0x4

    .line 47
    .line 48
    invoke-static {v9, v4}, Lzc1;->z(I[B)I

    .line 49
    .line 50
    .line 51
    move-result v9

    .line 52
    aput v9, v7, v8

    .line 53
    .line 54
    add-int/lit8 v8, v8, 0x1

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_0
    aget v4, v7, v5

    .line 58
    .line 59
    and-int/lit8 v4, v4, -0x8

    .line 60
    .line 61
    aput v4, v7, v5

    .line 62
    .line 63
    const/4 v4, 0x7

    .line 64
    aget v6, v7, v4

    .line 65
    .line 66
    const v8, 0x7fffffff

    .line 67
    .line 68
    .line 69
    and-int/2addr v6, v8

    .line 70
    aput v6, v7, v4

    .line 71
    .line 72
    const/high16 v8, 0x40000000    # 2.0f

    .line 73
    .line 74
    or-int/2addr v6, v8

    .line 75
    aput v6, v7, v4

    .line 76
    .line 77
    const/16 v4, 0xa

    .line 78
    .line 79
    new-array v6, v4, [I

    .line 80
    .line 81
    invoke-static {v5, v5, v3, v6}, Lzc1;->x(II[B[I)V

    .line 82
    .line 83
    .line 84
    const/16 v8, 0x10

    .line 85
    .line 86
    const/4 v9, 0x5

    .line 87
    invoke-static {v8, v9, v3, v6}, Lzc1;->x(II[B[I)V

    .line 88
    .line 89
    .line 90
    const/16 v3, 0x9

    .line 91
    .line 92
    aget v10, v6, v3

    .line 93
    .line 94
    const v11, 0xffffff

    .line 95
    .line 96
    .line 97
    and-int/2addr v10, v11

    .line 98
    aput v10, v6, v3

    .line 99
    .line 100
    new-array v3, v4, [I

    .line 101
    .line 102
    invoke-static {v5, v5, v6, v3}, Lzc1;->u(II[I[I)V

    .line 103
    .line 104
    .line 105
    new-array v10, v4, [I

    .line 106
    .line 107
    const/4 v11, 0x1

    .line 108
    aput v11, v10, v5

    .line 109
    .line 110
    new-array v12, v4, [I

    .line 111
    .line 112
    aput v11, v12, v5

    .line 113
    .line 114
    new-array v13, v4, [I

    .line 115
    .line 116
    new-array v14, v4, [I

    .line 117
    .line 118
    new-array v15, v4, [I

    .line 119
    .line 120
    const/16 v16, 0xfe

    .line 121
    .line 122
    move/from16 v17, v11

    .line 123
    .line 124
    :goto_1
    invoke-static {v12, v13, v14, v12}, Lzc1;->m([I[I[I[I)V

    .line 125
    .line 126
    .line 127
    invoke-static {v3, v10, v13, v3}, Lzc1;->m([I[I[I[I)V

    .line 128
    .line 129
    .line 130
    invoke-static {v14, v3, v14}, Lzc1;->a0([I[I[I)V

    .line 131
    .line 132
    .line 133
    invoke-static {v12, v13, v12}, Lzc1;->a0([I[I[I)V

    .line 134
    .line 135
    .line 136
    invoke-static {v13, v13}, Lzc1;->k0([I[I)V

    .line 137
    .line 138
    .line 139
    invoke-static {v3, v3}, Lzc1;->k0([I[I)V

    .line 140
    .line 141
    .line 142
    invoke-static {v13, v3, v15}, Lzc1;->l0([I[I[I)V

    .line 143
    .line 144
    .line 145
    invoke-static {v15, v10}, Lzc1;->Z([I[I)V

    .line 146
    .line 147
    .line 148
    invoke-static {v10, v3, v10}, Lzc1;->k([I[I[I)V

    .line 149
    .line 150
    .line 151
    invoke-static {v10, v15, v10}, Lzc1;->a0([I[I[I)V

    .line 152
    .line 153
    .line 154
    invoke-static {v3, v13, v3}, Lzc1;->a0([I[I[I)V

    .line 155
    .line 156
    .line 157
    invoke-static {v14, v12, v12, v13}, Lzc1;->m([I[I[I[I)V

    .line 158
    .line 159
    .line 160
    invoke-static {v12, v12}, Lzc1;->k0([I[I)V

    .line 161
    .line 162
    .line 163
    invoke-static {v13, v13}, Lzc1;->k0([I[I)V

    .line 164
    .line 165
    .line 166
    invoke-static {v13, v6, v13}, Lzc1;->a0([I[I[I)V

    .line 167
    .line 168
    .line 169
    const/16 v18, 0x0

    .line 170
    .line 171
    add-int/lit8 v0, v16, -0x1

    .line 172
    .line 173
    ushr-int/lit8 v16, v0, 0x5

    .line 174
    .line 175
    and-int/lit8 v19, v0, 0x1f

    .line 176
    .line 177
    aget v16, v7, v16

    .line 178
    .line 179
    ushr-int v16, v16, v19

    .line 180
    .line 181
    and-int/lit8 v16, v16, 0x1

    .line 182
    .line 183
    xor-int v11, v17, v16

    .line 184
    .line 185
    invoke-static {v11, v3, v12}, Lzc1;->w(I[I[I)V

    .line 186
    .line 187
    .line 188
    invoke-static {v11, v10, v13}, Lzc1;->w(I[I[I)V

    .line 189
    .line 190
    .line 191
    const/4 v11, 0x3

    .line 192
    if-ge v0, v11, :cond_4

    .line 193
    .line 194
    move v0, v5

    .line 195
    :goto_2
    if-ge v0, v11, :cond_1

    .line 196
    .line 197
    new-array v6, v4, [I

    .line 198
    .line 199
    new-array v7, v4, [I

    .line 200
    .line 201
    invoke-static {v3, v10, v6, v7}, Lzc1;->m([I[I[I[I)V

    .line 202
    .line 203
    .line 204
    invoke-static {v6, v6}, Lzc1;->k0([I[I)V

    .line 205
    .line 206
    .line 207
    invoke-static {v7, v7}, Lzc1;->k0([I[I)V

    .line 208
    .line 209
    .line 210
    invoke-static {v6, v7, v3}, Lzc1;->a0([I[I[I)V

    .line 211
    .line 212
    .line 213
    invoke-static {v6, v7, v6}, Lzc1;->l0([I[I[I)V

    .line 214
    .line 215
    .line 216
    invoke-static {v6, v10}, Lzc1;->Z([I[I)V

    .line 217
    .line 218
    .line 219
    invoke-static {v10, v7, v10}, Lzc1;->k([I[I[I)V

    .line 220
    .line 221
    .line 222
    invoke-static {v10, v6, v10}, Lzc1;->a0([I[I[I)V

    .line 223
    .line 224
    .line 225
    add-int/lit8 v0, v0, 0x1

    .line 226
    .line 227
    goto :goto_2

    .line 228
    :cond_1
    invoke-static {v10, v10}, Lzc1;->R([I[I)V

    .line 229
    .line 230
    .line 231
    invoke-static {v3, v10, v3}, Lzc1;->a0([I[I[I)V

    .line 232
    .line 233
    .line 234
    invoke-static {v3}, Lzc1;->d0([I)V

    .line 235
    .line 236
    .line 237
    invoke-static {v5, v5, v2, v3}, Lzc1;->B(II[B[I)V

    .line 238
    .line 239
    .line 240
    invoke-static {v9, v8, v2, v3}, Lzc1;->B(II[B[I)V

    .line 241
    .line 242
    .line 243
    move v0, v5

    .line 244
    :goto_3
    if-ge v5, v1, :cond_2

    .line 245
    .line 246
    aget-byte v3, v2, v5

    .line 247
    .line 248
    or-int/2addr v0, v3

    .line 249
    add-int/lit8 v5, v5, 0x1

    .line 250
    .line 251
    goto :goto_3

    .line 252
    :cond_2
    if-eqz v0, :cond_3

    .line 253
    .line 254
    return-object v2

    .line 255
    :cond_3
    const-string v0, "X25519 agreement failed"

    .line 256
    .line 257
    invoke-static {v0}, Lbt;->i(Ljava/lang/String;)V

    .line 258
    .line 259
    .line 260
    return-object v18

    .line 261
    :cond_4
    move/from16 v17, v16

    .line 262
    .line 263
    const/4 v11, 0x1

    .line 264
    move/from16 v16, v0

    .line 265
    .line 266
    goto/16 :goto_1
.end method
