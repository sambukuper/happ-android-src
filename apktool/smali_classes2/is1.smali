.class public final Lis1;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final a:[B

.field public final b:Lvk1;

.field public final c:Lbr1;

.field public final d:Ljava/util/List;

.field public final e:I

.field public final f:I


# direct methods
.method public constructor <init>(Ljava/lang/String;[BLjava/util/List;Lvk1;)V
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p2, p0, Lis1;->a:[B

    .line 8
    .line 9
    iput-object p4, p0, Lis1;->b:Lvk1;

    .line 10
    .line 11
    sget-object p2, Lbr1;->b:Lbr1;

    .line 12
    .line 13
    invoke-static {p1}, Lar1;->a(Ljava/lang/String;)Lbr1;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    iput-object p1, p0, Lis1;->c:Lbr1;

    .line 18
    .line 19
    const/4 p1, 0x1

    .line 20
    invoke-static {p1, p1}, Ljava/lang/Math;->max(II)I

    .line 21
    .line 22
    .line 23
    move-result p2

    .line 24
    iput p2, p0, Lis1;->e:I

    .line 25
    .line 26
    const/16 p2, 0xff

    .line 27
    .line 28
    const/16 p4, 0x10

    .line 29
    .line 30
    invoke-static {p2, p4}, Ljava/lang/Math;->min(II)I

    .line 31
    .line 32
    .line 33
    move-result p2

    .line 34
    invoke-static {p1, p2}, Ljava/lang/Math;->max(II)I

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    iput p1, p0, Lis1;->f:I

    .line 39
    .line 40
    new-instance p1, Ljava/util/LinkedHashSet;

    .line 41
    .line 42
    invoke-direct {p1}, Ljava/util/LinkedHashSet;-><init>()V

    .line 43
    .line 44
    .line 45
    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 46
    .line 47
    .line 48
    move-result-object p2

    .line 49
    :cond_0
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 50
    .line 51
    .line 52
    move-result p3

    .line 53
    if-eqz p3, :cond_1

    .line 54
    .line 55
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p3

    .line 59
    check-cast p3, Ljava/lang/String;

    .line 60
    .line 61
    invoke-virtual {p3}, Ljava/lang/String;->length()I

    .line 62
    .line 63
    .line 64
    move-result p4

    .line 65
    if-lez p4, :cond_0

    .line 66
    .line 67
    invoke-virtual {p1, p3}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_1
    invoke-virtual {p1}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 72
    .line 73
    .line 74
    move-result p2

    .line 75
    if-eqz p2, :cond_2

    .line 76
    .line 77
    const-string p2, "8.8.8.8"

    .line 78
    .line 79
    invoke-virtual {p1, p2}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    :cond_2
    invoke-static {p1}, Lwv0;->Y0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    iput-object p1, p0, Lis1;->d:Ljava/util/List;

    .line 87
    .line 88
    return-void
.end method

.method public static a(Lbr1;)[B
    .locals 9

    .line 1
    const/4 v0, 0x2

    .line 2
    new-array v0, v0, [B

    .line 3
    .line 4
    sget-object v1, Ljs1;->a:Ljava/security/SecureRandom;

    .line 5
    .line 6
    invoke-virtual {v1, v0}, Ljava/security/SecureRandom;->nextBytes([B)V

    .line 7
    .line 8
    .line 9
    new-instance v1, Lyq1;

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    aget-byte v3, v0, v2

    .line 13
    .line 14
    and-int/lit16 v3, v3, 0xff

    .line 15
    .line 16
    shl-int/lit8 v3, v3, 0x8

    .line 17
    .line 18
    const/4 v4, 0x1

    .line 19
    aget-byte v0, v0, v4

    .line 20
    .line 21
    and-int/lit16 v0, v0, 0xff

    .line 22
    .line 23
    or-int/2addr v0, v3

    .line 24
    int-to-short v0, v0

    .line 25
    const/16 v3, 0x3c

    .line 26
    .line 27
    invoke-direct {v1, v0, v3}, Lyq1;-><init>(SI)V

    .line 28
    .line 29
    .line 30
    iget-object v0, v1, Lyq1;->c:Ljava/util/List;

    .line 31
    .line 32
    new-instance v3, Lsu/happ/proxyutility/util/dnsttv/dto/DnsQuestion;

    .line 33
    .line 34
    const/16 v5, 0x10

    .line 35
    .line 36
    invoke-direct {v3, p0, v5, v4}, Lsu/happ/proxyutility/util/dnsttv/dto/DnsQuestion;-><init>(Lbr1;SS)V

    .line 37
    .line 38
    .line 39
    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    iget-object p0, v1, Lyq1;->f:Ljava/util/List;

    .line 43
    .line 44
    new-instance v3, Lsu/happ/proxyutility/util/dnsttv/dto/DnsRR;

    .line 45
    .line 46
    sget-object v4, Lbr1;->b:Lbr1;

    .line 47
    .line 48
    const/4 v7, 0x0

    .line 49
    new-array v8, v2, [B

    .line 50
    .line 51
    const/16 v5, 0x29

    .line 52
    .line 53
    const/16 v6, 0x1000

    .line 54
    .line 55
    invoke-direct/range {v3 .. v8}, Lsu/happ/proxyutility/util/dnsttv/dto/DnsRR;-><init>(Lbr1;SSI[B)V

    .line 56
    .line 57
    .line 58
    invoke-interface {p0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    invoke-virtual {v1}, Lyq1;->a()[B

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    return-object p0
.end method


# virtual methods
.method public final b([BLsn2;Ljava/lang/String;Ls51;)Ljava/io/Serializable;
    .locals 33

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    move-object/from16 v2, p4

    .line 6
    .line 7
    instance-of v3, v2, Les1;

    .line 8
    .line 9
    if-eqz v3, :cond_0

    .line 10
    .line 11
    move-object v3, v2

    .line 12
    check-cast v3, Les1;

    .line 13
    .line 14
    iget v4, v3, Les1;->s0:I

    .line 15
    .line 16
    const/high16 v5, -0x80000000

    .line 17
    .line 18
    and-int v6, v4, v5

    .line 19
    .line 20
    if-eqz v6, :cond_0

    .line 21
    .line 22
    sub-int/2addr v4, v5

    .line 23
    iput v4, v3, Les1;->s0:I

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    new-instance v3, Les1;

    .line 27
    .line 28
    invoke-direct {v3, v0, v2}, Les1;-><init>(Lis1;Ls51;)V

    .line 29
    .line 30
    .line 31
    :goto_0
    iget-object v2, v3, Les1;->q0:Ljava/lang/Object;

    .line 32
    .line 33
    iget v4, v3, Les1;->s0:I

    .line 34
    .line 35
    const-string v7, "/"

    .line 36
    .line 37
    const-string v10, "ms"

    .line 38
    .line 39
    const-string v11, " time:"

    .line 40
    .line 41
    iget-object v13, v0, Lis1;->c:Lbr1;

    .line 42
    .line 43
    const/16 v14, 0x20

    .line 44
    .line 45
    const/16 p4, 0x3

    .line 46
    .line 47
    const/4 v8, 0x2

    .line 48
    const-wide/16 v16, 0x1

    .line 49
    .line 50
    iget-object v15, v0, Lis1;->b:Lvk1;

    .line 51
    .line 52
    const/16 v18, 0x0

    .line 53
    .line 54
    const/4 v6, 0x1

    .line 55
    sget-object v9, Lc71;->X:Lc71;

    .line 56
    .line 57
    if-eqz v4, :cond_3

    .line 58
    .line 59
    if-eq v4, v6, :cond_2

    .line 60
    .line 61
    if-ne v4, v8, :cond_1

    .line 62
    .line 63
    iget-wide v0, v3, Les1;->l0:J

    .line 64
    .line 65
    iget v4, v3, Les1;->p0:I

    .line 66
    .line 67
    iget v14, v3, Les1;->o0:I

    .line 68
    .line 69
    move/from16 v20, v8

    .line 70
    .line 71
    iget v8, v3, Les1;->n0:I

    .line 72
    .line 73
    iget v12, v3, Les1;->m0:I

    .line 74
    .line 75
    move-object/from16 v21, v7

    .line 76
    .line 77
    iget-wide v6, v3, Les1;->k0:J

    .line 78
    .line 79
    iget-object v5, v3, Les1;->j0:Lo55;

    .line 80
    .line 81
    move-wide/from16 p0, v0

    .line 82
    .line 83
    iget-object v0, v3, Les1;->i0:[B

    .line 84
    .line 85
    iget-object v1, v3, Les1;->h0:Ljava/lang/String;

    .line 86
    .line 87
    move-object/from16 p2, v0

    .line 88
    .line 89
    iget-object v0, v3, Les1;->g0:Lsn2;

    .line 90
    .line 91
    move-object/from16 p3, v0

    .line 92
    .line 93
    iget-object v0, v3, Les1;->f0:[B

    .line 94
    .line 95
    invoke-static {v2}, Lw39;->n0(Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    move-object/from16 v24, v21

    .line 99
    .line 100
    move-object/from16 v21, v13

    .line 101
    .line 102
    move-object/from16 v13, v24

    .line 103
    .line 104
    move-object/from16 v24, v10

    .line 105
    .line 106
    move-object/from16 v26, v11

    .line 107
    .line 108
    move/from16 v25, v12

    .line 109
    .line 110
    move/from16 v27, v14

    .line 111
    .line 112
    move-wide/from16 v11, p0

    .line 113
    .line 114
    move-object v10, v1

    .line 115
    move-object v1, v9

    .line 116
    move-object v9, v5

    .line 117
    move-object/from16 v5, p3

    .line 118
    .line 119
    move-wide/from16 v31, v6

    .line 120
    .line 121
    move-object/from16 v7, p2

    .line 122
    .line 123
    move v6, v4

    .line 124
    move v4, v8

    .line 125
    move-object v8, v15

    .line 126
    move-wide/from16 v14, v31

    .line 127
    .line 128
    goto/16 :goto_a

    .line 129
    .line 130
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 131
    .line 132
    invoke-static {v0}, Lbt;->i(Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    return-object v18

    .line 136
    :cond_2
    move-object/from16 v21, v7

    .line 137
    .line 138
    move/from16 v20, v8

    .line 139
    .line 140
    iget-wide v4, v3, Les1;->k0:J

    .line 141
    .line 142
    iget-object v1, v3, Les1;->j0:Lo55;

    .line 143
    .line 144
    iget-object v6, v3, Les1;->i0:[B

    .line 145
    .line 146
    iget-object v7, v3, Les1;->h0:Ljava/lang/String;

    .line 147
    .line 148
    iget-object v8, v3, Les1;->g0:Lsn2;

    .line 149
    .line 150
    iget-object v12, v3, Les1;->f0:[B

    .line 151
    .line 152
    invoke-static {v2}, Lw39;->n0(Ljava/lang/Object;)V

    .line 153
    .line 154
    .line 155
    move-object v0, v2

    .line 156
    move-object/from16 v26, v11

    .line 157
    .line 158
    move-object/from16 v25, v15

    .line 159
    .line 160
    move-object v2, v1

    .line 161
    move-object v1, v8

    .line 162
    move-object v15, v10

    .line 163
    goto/16 :goto_2

    .line 164
    .line 165
    :cond_3
    move-object/from16 v21, v7

    .line 166
    .line 167
    move/from16 v20, v8

    .line 168
    .line 169
    invoke-static {v2}, Lw39;->n0(Ljava/lang/Object;)V

    .line 170
    .line 171
    .line 172
    const/16 v2, 0x8

    .line 173
    .line 174
    new-array v6, v2, [B

    .line 175
    .line 176
    sget-object v2, Ljs1;->a:Ljava/security/SecureRandom;

    .line 177
    .line 178
    invoke-virtual {v2, v6}, Ljava/security/SecureRandom;->nextBytes([B)V

    .line 179
    .line 180
    .line 181
    new-instance v2, Lo55;

    .line 182
    .line 183
    iget-object v4, v0, Lis1;->a:[B

    .line 184
    .line 185
    invoke-direct {v2, v4}, Lo55;-><init>([B)V

    .line 186
    .line 187
    .line 188
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 189
    .line 190
    .line 191
    move-result-wide v4

    .line 192
    new-array v7, v14, [B

    .line 193
    .line 194
    iget-object v8, v2, Lo55;->b:Lv59;

    .line 195
    .line 196
    invoke-virtual {v8}, Lv59;->e0()Lv59;

    .line 197
    .line 198
    .line 199
    move-result-object v12

    .line 200
    iget-object v12, v12, Lv59;->m0:[B

    .line 201
    .line 202
    const/4 v0, 0x0

    .line 203
    invoke-static {v12, v0, v7, v0, v14}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 204
    .line 205
    .line 206
    iget-object v12, v2, Lo55;->a:Lqz7;

    .line 207
    .line 208
    invoke-virtual {v12, v7}, Lqz7;->a([B)V

    .line 209
    .line 210
    .line 211
    iget-object v14, v2, Lo55;->c:Lv59;

    .line 212
    .line 213
    invoke-static {v8, v14}, Lq55;->b(Lv59;Lv59;)[B

    .line 214
    .line 215
    .line 216
    move-result-object v8

    .line 217
    invoke-virtual {v12, v8}, Lqz7;->b([B)V

    .line 218
    .line 219
    .line 220
    new-array v8, v0, [B

    .line 221
    .line 222
    iget-object v0, v12, Lqz7;->c:[B

    .line 223
    .line 224
    if-nez v0, :cond_4

    .line 225
    .line 226
    invoke-virtual {v12, v8}, Lqz7;->a([B)V

    .line 227
    .line 228
    .line 229
    move-object/from16 v26, v11

    .line 230
    .line 231
    move-object/from16 v25, v15

    .line 232
    .line 233
    move-object v15, v10

    .line 234
    goto :goto_1

    .line 235
    :cond_4
    move-object/from16 v25, v15

    .line 236
    .line 237
    iget-wide v14, v12, Lqz7;->d:J

    .line 238
    .line 239
    invoke-static {v14, v15}, Lci8;->H(J)[B

    .line 240
    .line 241
    .line 242
    move-result-object v14

    .line 243
    move-object v15, v10

    .line 244
    move-object/from16 v26, v11

    .line 245
    .line 246
    iget-wide v10, v12, Lqz7;->d:J

    .line 247
    .line 248
    add-long v10, v10, v16

    .line 249
    .line 250
    iput-wide v10, v12, Lqz7;->d:J

    .line 251
    .line 252
    iget-object v10, v12, Lqz7;->b:[B

    .line 253
    .line 254
    invoke-static {v0, v14, v10, v8}, Lci8;->l([B[B[B[B)[B

    .line 255
    .line 256
    .line 257
    move-result-object v8

    .line 258
    invoke-virtual {v12, v8}, Lqz7;->a([B)V

    .line 259
    .line 260
    .line 261
    :goto_1
    invoke-static {v7, v8}, Leu;->B0([B[B)[B

    .line 262
    .line 263
    .line 264
    move-result-object v0

    .line 265
    sget-object v7, Lvq1;->a:Ljava/security/SecureRandom;

    .line 266
    .line 267
    invoke-static {v6, v0, v13}, Lvq1;->b([B[BLbr1;)Lbr1;

    .line 268
    .line 269
    .line 270
    move-result-object v0

    .line 271
    invoke-static {v0}, Lis1;->a(Lbr1;)[B

    .line 272
    .line 273
    .line 274
    move-result-object v0

    .line 275
    new-instance v7, Ljava/lang/Long;

    .line 276
    .line 277
    const-wide/16 v10, 0x7d0

    .line 278
    .line 279
    invoke-direct {v7, v10, v11}, Ljava/lang/Long;-><init>(J)V

    .line 280
    .line 281
    .line 282
    move-object/from16 v8, p1

    .line 283
    .line 284
    iput-object v8, v3, Les1;->f0:[B

    .line 285
    .line 286
    iput-object v1, v3, Les1;->g0:Lsn2;

    .line 287
    .line 288
    move-object/from16 v10, p3

    .line 289
    .line 290
    iput-object v10, v3, Les1;->h0:Ljava/lang/String;

    .line 291
    .line 292
    iput-object v6, v3, Les1;->i0:[B

    .line 293
    .line 294
    iput-object v2, v3, Les1;->j0:Lo55;

    .line 295
    .line 296
    iput-wide v4, v3, Les1;->k0:J

    .line 297
    .line 298
    const/4 v11, 0x1

    .line 299
    iput v11, v3, Les1;->s0:I

    .line 300
    .line 301
    invoke-interface {v1, v0, v7, v3}, Lsn2;->x(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 302
    .line 303
    .line 304
    move-result-object v0

    .line 305
    if-ne v0, v9, :cond_5

    .line 306
    .line 307
    move-object v1, v9

    .line 308
    goto/16 :goto_9

    .line 309
    .line 310
    :cond_5
    move-object v12, v8

    .line 311
    move-object v7, v10

    .line 312
    :goto_2
    check-cast v0, [B

    .line 313
    .line 314
    sget-object v8, Lvq1;->a:Ljava/security/SecureRandom;

    .line 315
    .line 316
    invoke-static {v0}, Lcs1;->a([B)Lyq1;

    .line 317
    .line 318
    .line 319
    move-result-object v0

    .line 320
    invoke-static {v0, v13}, Lvq1;->a(Lyq1;Lbr1;)[B

    .line 321
    .line 322
    .line 323
    move-result-object v0

    .line 324
    iget-object v8, v2, Lo55;->a:Lqz7;

    .line 325
    .line 326
    array-length v10, v0

    .line 327
    const/16 v11, 0x30

    .line 328
    .line 329
    if-lt v10, v11, :cond_17

    .line 330
    .line 331
    const/16 v10, 0x20

    .line 332
    .line 333
    const/4 v14, 0x0

    .line 334
    invoke-static {v14, v10, v0}, Leu;->j0(II[B)[B

    .line 335
    .line 336
    .line 337
    move-result-object v11

    .line 338
    invoke-static {v11}, Lq55;->a([B)Lv59;

    .line 339
    .line 340
    .line 341
    move-result-object v14

    .line 342
    invoke-virtual {v8, v11}, Lqz7;->a([B)V

    .line 343
    .line 344
    .line 345
    iget-object v11, v2, Lo55;->b:Lv59;

    .line 346
    .line 347
    invoke-static {v11, v14}, Lq55;->b(Lv59;Lv59;)[B

    .line 348
    .line 349
    .line 350
    move-result-object v11

    .line 351
    invoke-virtual {v8, v11}, Lqz7;->b([B)V

    .line 352
    .line 353
    .line 354
    array-length v11, v0

    .line 355
    invoke-static {v10, v11, v0}, Leu;->j0(II[B)[B

    .line 356
    .line 357
    .line 358
    move-result-object v0

    .line 359
    iget-object v10, v8, Lqz7;->c:[B

    .line 360
    .line 361
    if-nez v10, :cond_6

    .line 362
    .line 363
    invoke-virtual {v8, v0}, Lqz7;->a([B)V

    .line 364
    .line 365
    .line 366
    move-object v14, v3

    .line 367
    move-wide/from16 p1, v4

    .line 368
    .line 369
    goto :goto_3

    .line 370
    :cond_6
    array-length v11, v0

    .line 371
    const/16 v14, 0x10

    .line 372
    .line 373
    if-lt v11, v14, :cond_16

    .line 374
    .line 375
    move-object v14, v3

    .line 376
    move-wide/from16 p1, v4

    .line 377
    .line 378
    iget-wide v3, v8, Lqz7;->d:J

    .line 379
    .line 380
    invoke-static {v3, v4}, Lci8;->H(J)[B

    .line 381
    .line 382
    .line 383
    move-result-object v3

    .line 384
    iget-wide v4, v8, Lqz7;->d:J

    .line 385
    .line 386
    add-long v4, v4, v16

    .line 387
    .line 388
    iput-wide v4, v8, Lqz7;->d:J

    .line 389
    .line 390
    :try_start_0
    iget-object v4, v8, Lqz7;->b:[B

    .line 391
    .line 392
    invoke-static {v10, v3, v4, v0}, Lci8;->k([B[B[B[B)[B

    .line 393
    .line 394
    .line 395
    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 396
    invoke-virtual {v8, v0}, Lqz7;->a([B)V

    .line 397
    .line 398
    .line 399
    move-object v0, v3

    .line 400
    :goto_3
    array-length v0, v0

    .line 401
    if-nez v0, :cond_15

    .line 402
    .line 403
    iget-object v0, v8, Lqz7;->a:[B

    .line 404
    .line 405
    const/4 v3, 0x0

    .line 406
    new-array v4, v3, [B

    .line 407
    .line 408
    invoke-static {v0, v4}, Lci8;->I([B[B)Ljava/util/List;

    .line 409
    .line 410
    .line 411
    move-result-object v0

    .line 412
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 413
    .line 414
    .line 415
    move-result-object v4

    .line 416
    check-cast v4, [B

    .line 417
    .line 418
    iput-object v4, v2, Lo55;->d:[B

    .line 419
    .line 420
    const/4 v11, 0x1

    .line 421
    invoke-interface {v0, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 422
    .line 423
    .line 424
    move-result-object v0

    .line 425
    check-cast v0, [B

    .line 426
    .line 427
    iput-object v0, v2, Lo55;->e:[B

    .line 428
    .line 429
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 430
    .line 431
    .line 432
    move-result-wide v3

    .line 433
    sub-long v3, v3, p1

    .line 434
    .line 435
    new-instance v0, Ljava/lang/StringBuilder;

    .line 436
    .line 437
    const-string v5, "handshake:success resolver:"

    .line 438
    .line 439
    invoke-direct {v0, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 440
    .line 441
    .line 442
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 443
    .line 444
    .line 445
    move-object/from16 v5, v26

    .line 446
    .line 447
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 448
    .line 449
    .line 450
    invoke-virtual {v0, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 451
    .line 452
    .line 453
    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 454
    .line 455
    .line 456
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 457
    .line 458
    .line 459
    move-result-object v0

    .line 460
    sget-object v3, Lsu/happ/proxyutility/util/dnsttv/dto/enums/DnsTTLogType;->INFO:Lsu/happ/proxyutility/util/dnsttv/dto/enums/DnsTTLogType;

    .line 461
    .line 462
    move-object/from16 v8, v25

    .line 463
    .line 464
    const/4 v4, 0x4

    .line 465
    invoke-static {v8, v0, v3, v4}, Ljh4;->v(Ljh4;Ljava/lang/String;Lsu/happ/proxyutility/util/dnsttv/dto/enums/DnsTTLogType;I)V

    .line 466
    .line 467
    .line 468
    invoke-virtual/range {p0 .. p0}, Lis1;->e()I

    .line 469
    .line 470
    .line 471
    move-result v0

    .line 472
    array-length v3, v12

    .line 473
    add-int/2addr v3, v0

    .line 474
    const/4 v11, 0x1

    .line 475
    sub-int/2addr v3, v11

    .line 476
    div-int/2addr v3, v0

    .line 477
    invoke-static {v11, v3}, Ljava/lang/Math;->max(II)I

    .line 478
    .line 479
    .line 480
    move-result v3

    .line 481
    move-object/from16 v4, p0

    .line 482
    .line 483
    iget v4, v4, Lis1;->f:I

    .line 484
    .line 485
    if-gt v3, v4, :cond_14

    .line 486
    .line 487
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 488
    .line 489
    .line 490
    move-result-wide v10

    .line 491
    array-length v4, v12

    .line 492
    move/from16 p1, v0

    .line 493
    .line 494
    new-instance v0, Ljava/lang/StringBuilder;

    .line 495
    .line 496
    move-object/from16 p2, v1

    .line 497
    .line 498
    const-string v1, "data payload:"

    .line 499
    .line 500
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 501
    .line 502
    .line 503
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 504
    .line 505
    .line 506
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 507
    .line 508
    .line 509
    move-result-object v0

    .line 510
    move-object/from16 v4, v18

    .line 511
    .line 512
    const/4 v1, 0x6

    .line 513
    invoke-static {v8, v0, v4, v1}, Ljh4;->v(Ljh4;Ljava/lang/String;Lsu/happ/proxyutility/util/dnsttv/dto/enums/DnsTTLogType;I)V

    .line 514
    .line 515
    .line 516
    move v4, v3

    .line 517
    move-object v0, v12

    .line 518
    move-object v3, v14

    .line 519
    const/4 v14, 0x0

    .line 520
    move/from16 v12, p1

    .line 521
    .line 522
    :goto_4
    move-object/from16 v1, p2

    .line 523
    .line 524
    if-ge v14, v4, :cond_13

    .line 525
    .line 526
    move-object/from16 v24, v15

    .line 527
    .line 528
    add-int/lit8 v15, v4, -0x1

    .line 529
    .line 530
    if-ne v14, v15, :cond_7

    .line 531
    .line 532
    const/4 v15, 0x1

    .line 533
    :goto_5
    move-object/from16 v26, v5

    .line 534
    .line 535
    goto :goto_6

    .line 536
    :cond_7
    const/4 v15, 0x0

    .line 537
    goto :goto_5

    .line 538
    :goto_6
    mul-int v5, v14, v12

    .line 539
    .line 540
    move-object/from16 v25, v9

    .line 541
    .line 542
    add-int v9, v5, v12

    .line 543
    .line 544
    move/from16 p0, v12

    .line 545
    .line 546
    array-length v12, v0

    .line 547
    invoke-static {v9, v12}, Ljava/lang/Math;->min(II)I

    .line 548
    .line 549
    .line 550
    move-result v9

    .line 551
    invoke-static {v5, v9, v0}, Leu;->j0(II[B)[B

    .line 552
    .line 553
    .line 554
    move-result-object v5

    .line 555
    int-to-byte v9, v15

    .line 556
    int-to-byte v12, v14

    .line 557
    move/from16 p1, v9

    .line 558
    .line 559
    int-to-byte v9, v4

    .line 560
    move/from16 p2, v9

    .line 561
    .line 562
    array-length v9, v5

    .line 563
    move/from16 p3, v9

    .line 564
    .line 565
    const/16 v19, 0x4

    .line 566
    .line 567
    add-int/lit8 v9, p3, 0x4

    .line 568
    .line 569
    move/from16 p3, v12

    .line 570
    .line 571
    new-array v12, v9, [B

    .line 572
    .line 573
    move/from16 v27, v15

    .line 574
    .line 575
    const/4 v15, 0x0

    .line 576
    const/16 v22, 0x1

    .line 577
    .line 578
    aput-byte v22, v12, v15

    .line 579
    .line 580
    aput-byte p1, v12, v22

    .line 581
    .line 582
    aput-byte p3, v12, v20

    .line 583
    .line 584
    aput-byte p2, v12, p4

    .line 585
    .line 586
    move-wide/from16 p1, v10

    .line 587
    .line 588
    array-length v10, v5

    .line 589
    move/from16 v11, v19

    .line 590
    .line 591
    invoke-static {v5, v15, v12, v11, v10}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 592
    .line 593
    .line 594
    const-string v10, "payloadElement["

    .line 595
    .line 596
    const-string v11, "]:"

    .line 597
    .line 598
    invoke-static {v10, v14, v9, v11}, Lpc6;->m(Ljava/lang/String;IILjava/lang/String;)Ljava/lang/String;

    .line 599
    .line 600
    .line 601
    move-result-object v9

    .line 602
    const/4 v10, 0x6

    .line 603
    const/4 v15, 0x0

    .line 604
    invoke-static {v8, v9, v15, v10}, Ljh4;->v(Ljh4;Ljava/lang/String;Lsu/happ/proxyutility/util/dnsttv/dto/enums/DnsTTLogType;I)V

    .line 605
    .line 606
    .line 607
    iget-object v9, v2, Lo55;->d:[B

    .line 608
    .line 609
    if-eqz v9, :cond_12

    .line 610
    .line 611
    move-object v10, v0

    .line 612
    move-object v15, v1

    .line 613
    iget-wide v0, v2, Lo55;->f:J

    .line 614
    .line 615
    invoke-static {v0, v1}, Lci8;->H(J)[B

    .line 616
    .line 617
    .line 618
    move-result-object v0

    .line 619
    move-object v1, v3

    .line 620
    move/from16 p3, v4

    .line 621
    .line 622
    iget-wide v3, v2, Lo55;->f:J

    .line 623
    .line 624
    add-long v3, v3, v16

    .line 625
    .line 626
    iput-wide v3, v2, Lo55;->f:J

    .line 627
    .line 628
    const/4 v3, 0x0

    .line 629
    new-array v4, v3, [B

    .line 630
    .line 631
    invoke-static {v9, v0, v4, v12}, Lci8;->l([B[B[B[B)[B

    .line 632
    .line 633
    .line 634
    move-result-object v0

    .line 635
    sget-object v3, Lvq1;->a:Ljava/security/SecureRandom;

    .line 636
    .line 637
    invoke-static {v6, v0, v13}, Lvq1;->b([B[BLbr1;)Lbr1;

    .line 638
    .line 639
    .line 640
    move-result-object v3

    .line 641
    invoke-static {v3}, Lis1;->a(Lbr1;)[B

    .line 642
    .line 643
    .line 644
    move-result-object v3

    .line 645
    array-length v4, v3

    .line 646
    const-string v9, "queryData["

    .line 647
    .line 648
    invoke-static {v9, v14, v4, v11}, Lpc6;->m(Ljava/lang/String;IILjava/lang/String;)Ljava/lang/String;

    .line 649
    .line 650
    .line 651
    move-result-object v4

    .line 652
    const/4 v9, 0x6

    .line 653
    const/4 v11, 0x0

    .line 654
    invoke-static {v8, v4, v11, v9}, Ljh4;->v(Ljh4;Ljava/lang/String;Lsu/happ/proxyutility/util/dnsttv/dto/enums/DnsTTLogType;I)V

    .line 655
    .line 656
    .line 657
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 658
    .line 659
    .line 660
    move-result-wide v11

    .line 661
    if-eqz v27, :cond_8

    .line 662
    .line 663
    const-string v4, "FINAL"

    .line 664
    .line 665
    goto :goto_7

    .line 666
    :cond_8
    const-string v4, "ack"

    .line 667
    .line 668
    :goto_7
    add-int/lit8 v9, v14, 0x1

    .line 669
    .line 670
    array-length v5, v5

    .line 671
    array-length v0, v0

    .line 672
    move-object/from16 v28, v1

    .line 673
    .line 674
    const-string v1, "  \u2192 chunk "

    .line 675
    .line 676
    move-object/from16 v29, v10

    .line 677
    .line 678
    const-string v10, " ["

    .line 679
    .line 680
    move-object/from16 v30, v21

    .line 681
    .line 682
    move-object/from16 v21, v13

    .line 683
    .line 684
    move-object/from16 v13, v30

    .line 685
    .line 686
    move-object/from16 v30, v15

    .line 687
    .line 688
    move/from16 v15, p3

    .line 689
    .line 690
    invoke-static {v9, v1, v15, v13, v10}, Loi0;->r(ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 691
    .line 692
    .line 693
    move-result-object v1

    .line 694
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 695
    .line 696
    .line 697
    const-string v4, "] payload="

    .line 698
    .line 699
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 700
    .line 701
    .line 702
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 703
    .line 704
    .line 705
    const-string v4, "B enc="

    .line 706
    .line 707
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 708
    .line 709
    .line 710
    const-string v4, "B"

    .line 711
    .line 712
    invoke-static {v1, v0, v4}, Loi0;->n(Ljava/lang/StringBuilder;ILjava/lang/String;)Ljava/lang/String;

    .line 713
    .line 714
    .line 715
    move-result-object v0

    .line 716
    const/4 v1, 0x6

    .line 717
    const/4 v4, 0x0

    .line 718
    invoke-static {v8, v0, v4, v1}, Ljh4;->v(Ljh4;Ljava/lang/String;Lsu/happ/proxyutility/util/dnsttv/dto/enums/DnsTTLogType;I)V

    .line 719
    .line 720
    .line 721
    if-eqz v27, :cond_9

    .line 722
    .line 723
    const-wide/16 v4, 0x2328

    .line 724
    .line 725
    goto :goto_8

    .line 726
    :cond_9
    const-wide/16 v4, 0xfa0

    .line 727
    .line 728
    :goto_8
    new-instance v0, Ljava/lang/Long;

    .line 729
    .line 730
    invoke-direct {v0, v4, v5}, Ljava/lang/Long;-><init>(J)V

    .line 731
    .line 732
    .line 733
    move-object/from16 v4, v28

    .line 734
    .line 735
    move-object/from16 v10, v29

    .line 736
    .line 737
    iput-object v10, v4, Les1;->f0:[B

    .line 738
    .line 739
    move-object/from16 v5, v30

    .line 740
    .line 741
    iput-object v5, v4, Les1;->g0:Lsn2;

    .line 742
    .line 743
    iput-object v7, v4, Les1;->h0:Ljava/lang/String;

    .line 744
    .line 745
    iput-object v6, v4, Les1;->i0:[B

    .line 746
    .line 747
    iput-object v2, v4, Les1;->j0:Lo55;

    .line 748
    .line 749
    move-object v9, v2

    .line 750
    move-wide/from16 v1, p1

    .line 751
    .line 752
    iput-wide v1, v4, Les1;->k0:J

    .line 753
    .line 754
    move/from16 v1, p0

    .line 755
    .line 756
    iput v1, v4, Les1;->m0:I

    .line 757
    .line 758
    iput v15, v4, Les1;->n0:I

    .line 759
    .line 760
    iput v14, v4, Les1;->o0:I

    .line 761
    .line 762
    move/from16 v2, v27

    .line 763
    .line 764
    iput v2, v4, Les1;->p0:I

    .line 765
    .line 766
    iput-wide v11, v4, Les1;->l0:J

    .line 767
    .line 768
    move/from16 v1, v20

    .line 769
    .line 770
    iput v1, v4, Les1;->s0:I

    .line 771
    .line 772
    invoke-interface {v5, v3, v0, v4}, Lsn2;->x(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 773
    .line 774
    .line 775
    move-result-object v0

    .line 776
    move-object/from16 v1, v25

    .line 777
    .line 778
    if-ne v0, v1, :cond_a

    .line 779
    .line 780
    :goto_9
    return-object v1

    .line 781
    :cond_a
    move v3, v2

    .line 782
    move-object v2, v0

    .line 783
    move-object v0, v10

    .line 784
    move-object v10, v7

    .line 785
    move-object v7, v6

    .line 786
    move v6, v3

    .line 787
    move/from16 v25, p0

    .line 788
    .line 789
    move-object v3, v4

    .line 790
    move/from16 v27, v14

    .line 791
    .line 792
    move v4, v15

    .line 793
    move-wide/from16 v14, p1

    .line 794
    .line 795
    :goto_a
    check-cast v2, [B

    .line 796
    .line 797
    sget-object v28, Lvq1;->a:Ljava/security/SecureRandom;

    .line 798
    .line 799
    invoke-static {v2}, Lcs1;->a([B)Lyq1;

    .line 800
    .line 801
    .line 802
    move-result-object v2

    .line 803
    move-object/from16 p0, v0

    .line 804
    .line 805
    move-object/from16 v0, v21

    .line 806
    .line 807
    invoke-static {v2, v0}, Lvq1;->a(Lyq1;Lbr1;)[B

    .line 808
    .line 809
    .line 810
    move-result-object v2

    .line 811
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 812
    .line 813
    .line 814
    iget-object v0, v9, Lo55;->e:[B

    .line 815
    .line 816
    if-eqz v0, :cond_11

    .line 817
    .line 818
    move-object/from16 v28, v1

    .line 819
    .line 820
    array-length v1, v2

    .line 821
    move-object/from16 p1, v3

    .line 822
    .line 823
    const/16 v3, 0x10

    .line 824
    .line 825
    if-lt v1, v3, :cond_10

    .line 826
    .line 827
    move-object/from16 p2, v5

    .line 828
    .line 829
    move/from16 p3, v6

    .line 830
    .line 831
    iget-wide v5, v9, Lo55;->g:J

    .line 832
    .line 833
    invoke-static {v5, v6}, Lci8;->H(J)[B

    .line 834
    .line 835
    .line 836
    move-result-object v1

    .line 837
    iget-wide v5, v9, Lo55;->g:J

    .line 838
    .line 839
    add-long v5, v5, v16

    .line 840
    .line 841
    iput-wide v5, v9, Lo55;->g:J

    .line 842
    .line 843
    const/4 v3, 0x0

    .line 844
    :try_start_1
    new-array v5, v3, [B

    .line 845
    .line 846
    invoke-static {v0, v1, v5, v2}, Lci8;->k([B[B[B[B)[B

    .line 847
    .line 848
    .line 849
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 850
    array-length v1, v0

    .line 851
    const/4 v2, 0x4

    .line 852
    if-lt v1, v2, :cond_f

    .line 853
    .line 854
    aget-byte v1, v0, v3

    .line 855
    .line 856
    const/4 v5, 0x1

    .line 857
    if-ne v1, v5, :cond_e

    .line 858
    .line 859
    array-length v1, v0

    .line 860
    sub-int/2addr v1, v2

    .line 861
    new-array v6, v1, [B

    .line 862
    .line 863
    invoke-static {v0, v2, v6, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 864
    .line 865
    .line 866
    aget-byte v2, v0, v5

    .line 867
    .line 868
    const/16 v20, 0x2

    .line 869
    .line 870
    aget-byte v3, v0, v20

    .line 871
    .line 872
    aget-byte v0, v0, p4

    .line 873
    .line 874
    add-int/lit8 v0, v27, 0x1

    .line 875
    .line 876
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 877
    .line 878
    .line 879
    move-result-wide v29

    .line 880
    sub-long v11, v29, v11

    .line 881
    .line 882
    const-string v3, "  \u2190 chunk "

    .line 883
    .line 884
    const-string v5, " reply="

    .line 885
    .line 886
    invoke-static {v0, v3, v4, v13, v5}, Loi0;->r(ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 887
    .line 888
    .line 889
    move-result-object v0

    .line 890
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 891
    .line 892
    .line 893
    const-string v1, "B ("

    .line 894
    .line 895
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 896
    .line 897
    .line 898
    invoke-virtual {v0, v11, v12}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 899
    .line 900
    .line 901
    const-string v1, "ms)"

    .line 902
    .line 903
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 904
    .line 905
    .line 906
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 907
    .line 908
    .line 909
    move-result-object v0

    .line 910
    sget-object v1, Lsu/happ/proxyutility/util/dnsttv/dto/enums/DnsTTLogType;->INFO:Lsu/happ/proxyutility/util/dnsttv/dto/enums/DnsTTLogType;

    .line 911
    .line 912
    const/4 v11, 0x4

    .line 913
    invoke-static {v8, v0, v1, v11}, Ljh4;->v(Ljh4;Ljava/lang/String;Lsu/happ/proxyutility/util/dnsttv/dto/enums/DnsTTLogType;I)V

    .line 914
    .line 915
    .line 916
    if-eqz p3, :cond_d

    .line 917
    .line 918
    and-int/lit8 v0, v2, 0x2

    .line 919
    .line 920
    if-eqz v0, :cond_c

    .line 921
    .line 922
    const/16 v22, 0x1

    .line 923
    .line 924
    and-int/lit8 v0, v2, 0x1

    .line 925
    .line 926
    if-eqz v0, :cond_b

    .line 927
    .line 928
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 929
    .line 930
    .line 931
    move-result-wide v2

    .line 932
    sub-long/2addr v2, v14

    .line 933
    new-instance v0, Ljava/lang/StringBuilder;

    .line 934
    .line 935
    const-string v4, "send data:success resolver:"

    .line 936
    .line 937
    invoke-direct {v0, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 938
    .line 939
    .line 940
    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 941
    .line 942
    .line 943
    move-object/from16 v5, v26

    .line 944
    .line 945
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 946
    .line 947
    .line 948
    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 949
    .line 950
    .line 951
    move-object/from16 v2, v24

    .line 952
    .line 953
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 954
    .line 955
    .line 956
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 957
    .line 958
    .line 959
    move-result-object v0

    .line 960
    const/4 v11, 0x4

    .line 961
    invoke-static {v8, v0, v1, v11}, Ljh4;->v(Ljh4;Ljava/lang/String;Lsu/happ/proxyutility/util/dnsttv/dto/enums/DnsTTLogType;I)V

    .line 962
    .line 963
    .line 964
    return-object v6

    .line 965
    :cond_b
    new-instance v0, Lvr0$c;

    .line 966
    .line 967
    const-string v1, "multi-chunk responses not supported yet"

    .line 968
    .line 969
    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 970
    .line 971
    .line 972
    throw v0

    .line 973
    :cond_c
    new-instance v0, Lvr0$b;

    .line 974
    .line 975
    const-string v1, "response chunk missing is_response flag"

    .line 976
    .line 977
    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 978
    .line 979
    .line 980
    throw v0

    .line 981
    :cond_d
    move-object/from16 v2, v24

    .line 982
    .line 983
    move-object/from16 v5, v26

    .line 984
    .line 985
    const/4 v11, 0x4

    .line 986
    add-int/lit8 v0, v27, 0x1

    .line 987
    .line 988
    move-object/from16 v1, v21

    .line 989
    .line 990
    move-object/from16 v21, v13

    .line 991
    .line 992
    move-object v13, v1

    .line 993
    move-object/from16 v3, p1

    .line 994
    .line 995
    move-object v6, v7

    .line 996
    move-object v7, v10

    .line 997
    move-wide v10, v14

    .line 998
    move/from16 v12, v25

    .line 999
    .line 1000
    move v14, v0

    .line 1001
    move-object v15, v2

    .line 1002
    move-object v2, v9

    .line 1003
    move-object/from16 v9, v28

    .line 1004
    .line 1005
    move-object/from16 v0, p0

    .line 1006
    .line 1007
    goto/16 :goto_4

    .line 1008
    .line 1009
    :cond_e
    new-instance v1, Lvr0$a;

    .line 1010
    .line 1011
    const/16 v23, 0x0

    .line 1012
    .line 1013
    aget-byte v0, v0, v23

    .line 1014
    .line 1015
    and-int/lit16 v0, v0, 0xff

    .line 1016
    .line 1017
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1018
    .line 1019
    .line 1020
    move-result-object v0

    .line 1021
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 1022
    .line 1023
    .line 1024
    move-result-object v0

    .line 1025
    const/4 v11, 0x1

    .line 1026
    invoke-static {v0, v11}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1027
    .line 1028
    .line 1029
    move-result-object v0

    .line 1030
    const-string v2, "%02x"

    .line 1031
    .line 1032
    invoke-static {v2, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 1033
    .line 1034
    .line 1035
    move-result-object v0

    .line 1036
    const-string v2, "chunk has unknown version 0x"

    .line 1037
    .line 1038
    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1039
    .line 1040
    .line 1041
    move-result-object v0

    .line 1042
    invoke-direct {v1, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 1043
    .line 1044
    .line 1045
    throw v1

    .line 1046
    :cond_f
    new-instance v1, Lvr0$d;

    .line 1047
    .line 1048
    array-length v0, v0

    .line 1049
    const-string v2, "chunk too short (got "

    .line 1050
    .line 1051
    const-string v3, " bytes, need 4)"

    .line 1052
    .line 1053
    invoke-static {v2, v0, v3}, Lie2;->h(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    .line 1054
    .line 1055
    .line 1056
    move-result-object v0

    .line 1057
    invoke-direct {v1, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 1058
    .line 1059
    .line 1060
    throw v1

    .line 1061
    :catchall_0
    move-exception v0

    .line 1062
    new-instance v1, Lp55$a;

    .line 1063
    .line 1064
    invoke-direct {v1, v0}, Lp55$a;-><init>(Ljava/lang/Throwable;)V

    .line 1065
    .line 1066
    .line 1067
    throw v1

    .line 1068
    :cond_10
    new-instance v0, Lp55$c;

    .line 1069
    .line 1070
    array-length v1, v2

    .line 1071
    const/16 v14, 0x10

    .line 1072
    .line 1073
    invoke-direct {v0, v1, v14}, Lp55$c;-><init>(II)V

    .line 1074
    .line 1075
    .line 1076
    throw v0

    .line 1077
    :cond_11
    new-instance v0, Lp55$b;

    .line 1078
    .line 1079
    invoke-direct {v0}, Lp55$b;-><init>()V

    .line 1080
    .line 1081
    .line 1082
    throw v0

    .line 1083
    :cond_12
    new-instance v0, Lp55$b;

    .line 1084
    .line 1085
    invoke-direct {v0}, Lp55$b;-><init>()V

    .line 1086
    .line 1087
    .line 1088
    throw v0

    .line 1089
    :cond_13
    new-instance v0, Lte8$c;

    .line 1090
    .line 1091
    invoke-direct {v0}, Lte8$c;-><init>()V

    .line 1092
    .line 1093
    .line 1094
    throw v0

    .line 1095
    :cond_14
    const-string v0, "size pre-check should have caught oversized payload"

    .line 1096
    .line 1097
    invoke-static {v0}, Lbt;->q(Ljava/lang/String;)V

    .line 1098
    .line 1099
    .line 1100
    const/16 v18, 0x0

    .line 1101
    .line 1102
    return-object v18

    .line 1103
    :cond_15
    new-instance v0, Lp55$e;

    .line 1104
    .line 1105
    const-string v1, "unexpected non-empty handshake payload"

    .line 1106
    .line 1107
    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 1108
    .line 1109
    .line 1110
    throw v0

    .line 1111
    :catchall_1
    move-exception v0

    .line 1112
    new-instance v1, Lp55$a;

    .line 1113
    .line 1114
    invoke-direct {v1, v0}, Lp55$a;-><init>(Ljava/lang/Throwable;)V

    .line 1115
    .line 1116
    .line 1117
    throw v1

    .line 1118
    :cond_16
    new-instance v1, Lp55$c;

    .line 1119
    .line 1120
    array-length v0, v0

    .line 1121
    const/16 v14, 0x10

    .line 1122
    .line 1123
    invoke-direct {v1, v0, v14}, Lp55$c;-><init>(II)V

    .line 1124
    .line 1125
    .line 1126
    throw v1

    .line 1127
    :cond_17
    new-instance v1, Lp55$c;

    .line 1128
    .line 1129
    array-length v0, v0

    .line 1130
    invoke-direct {v1, v0, v11}, Lp55$c;-><init>(II)V

    .line 1131
    .line 1132
    .line 1133
    throw v1
.end method

.method public final c([BLsu/happ/proxyutility/util/dnsttv/dto/enums/DnsTTLogType;Ls51;)Ljava/lang/Object;
    .locals 28

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    move-object/from16 v2, p3

    .line 6
    .line 7
    instance-of v3, v2, Lfs1;

    .line 8
    .line 9
    if-eqz v3, :cond_0

    .line 10
    .line 11
    move-object v3, v2

    .line 12
    check-cast v3, Lfs1;

    .line 13
    .line 14
    iget v4, v3, Lfs1;->t0:I

    .line 15
    .line 16
    const/high16 v5, -0x80000000

    .line 17
    .line 18
    and-int v6, v4, v5

    .line 19
    .line 20
    if-eqz v6, :cond_0

    .line 21
    .line 22
    sub-int/2addr v4, v5

    .line 23
    iput v4, v3, Lfs1;->t0:I

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    new-instance v3, Lfs1;

    .line 27
    .line 28
    invoke-direct {v3, v1, v2}, Lfs1;-><init>(Lis1;Ls51;)V

    .line 29
    .line 30
    .line 31
    :goto_0
    iget-object v2, v3, Lfs1;->r0:Ljava/lang/Object;

    .line 32
    .line 33
    iget v4, v3, Lfs1;->t0:I

    .line 34
    .line 35
    const-string v8, "ms"

    .line 36
    .line 37
    const-string v9, "resolver["

    .line 38
    .line 39
    const-string v10, "]:"

    .line 40
    .line 41
    const-string v11, "/"

    .line 42
    .line 43
    iget-object v13, v1, Lis1;->b:Lvk1;

    .line 44
    .line 45
    const/4 v14, 0x1

    .line 46
    if-eqz v4, :cond_2

    .line 47
    .line 48
    if-ne v4, v14, :cond_1

    .line 49
    .line 50
    iget v4, v3, Lfs1;->p0:I

    .line 51
    .line 52
    iget-wide v5, v3, Lfs1;->q0:J

    .line 53
    .line 54
    iget v12, v3, Lfs1;->o0:I

    .line 55
    .line 56
    iget v7, v3, Lfs1;->n0:I

    .line 57
    .line 58
    move/from16 v16, v14

    .line 59
    .line 60
    iget v14, v3, Lfs1;->m0:I

    .line 61
    .line 62
    const/16 v17, 0x0

    .line 63
    .line 64
    iget v15, v3, Lfs1;->l0:I

    .line 65
    .line 66
    move-object/from16 v18, v2

    .line 67
    .line 68
    iget v2, v3, Lfs1;->k0:I

    .line 69
    .line 70
    move/from16 p1, v2

    .line 71
    .line 72
    iget v2, v3, Lfs1;->j0:I

    .line 73
    .line 74
    move/from16 p2, v2

    .line 75
    .line 76
    iget-object v2, v3, Lfs1;->i0:Ljava/lang/String;

    .line 77
    .line 78
    move-object/from16 v19, v2

    .line 79
    .line 80
    iget-object v2, v3, Lfs1;->h0:Ljava/util/Iterator;

    .line 81
    .line 82
    move-object/from16 v20, v2

    .line 83
    .line 84
    iget-object v2, v3, Lfs1;->g0:Lsu/happ/proxyutility/util/dnsttv/dto/enums/DnsTTLogType;

    .line 85
    .line 86
    move-object/from16 v21, v2

    .line 87
    .line 88
    iget-object v2, v3, Lfs1;->f0:[B

    .line 89
    .line 90
    :try_start_0
    invoke-static/range {v18 .. v18}, Lw39;->n0(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 91
    .line 92
    .line 93
    move-object v1, v2

    .line 94
    move/from16 v23, v15

    .line 95
    .line 96
    move-object/from16 v2, v18

    .line 97
    .line 98
    move-object/from16 v22, v21

    .line 99
    .line 100
    move/from16 v15, p1

    .line 101
    .line 102
    move-object/from16 v18, v8

    .line 103
    .line 104
    move v8, v12

    .line 105
    move-object/from16 v21, v13

    .line 106
    .line 107
    move v13, v14

    .line 108
    move-object/from16 v12, v20

    .line 109
    .line 110
    move/from16 v14, p2

    .line 111
    .line 112
    move-object/from16 v20, v11

    .line 113
    .line 114
    move-wide/from16 v26, v5

    .line 115
    .line 116
    move v6, v7

    .line 117
    move/from16 v7, v16

    .line 118
    .line 119
    move-object/from16 v5, v19

    .line 120
    .line 121
    move-object/from16 v19, v10

    .line 122
    .line 123
    move-wide/from16 v10, v26

    .line 124
    .line 125
    goto/16 :goto_3

    .line 126
    .line 127
    :catchall_0
    move-exception v0

    .line 128
    move-object v1, v13

    .line 129
    move v13, v14

    .line 130
    move/from16 v23, v15

    .line 131
    .line 132
    move-object/from16 v22, v21

    .line 133
    .line 134
    move/from16 v15, p1

    .line 135
    .line 136
    move/from16 v14, p2

    .line 137
    .line 138
    move-wide/from16 v26, v5

    .line 139
    .line 140
    move-object v5, v2

    .line 141
    move-object v6, v3

    .line 142
    move-object v3, v11

    .line 143
    move-object/from16 v2, v19

    .line 144
    .line 145
    move/from16 v19, v7

    .line 146
    .line 147
    move-object v7, v8

    .line 148
    move-object/from16 v8, v20

    .line 149
    .line 150
    move/from16 v20, v4

    .line 151
    .line 152
    move-object v4, v10

    .line 153
    move-wide/from16 v10, v26

    .line 154
    .line 155
    goto/16 :goto_c

    .line 156
    .line 157
    :cond_1
    const/16 v17, 0x0

    .line 158
    .line 159
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 160
    .line 161
    invoke-static {v0}, Lbt;->i(Ljava/lang/String;)V

    .line 162
    .line 163
    .line 164
    return-object v17

    .line 165
    :cond_2
    move-object/from16 v18, v2

    .line 166
    .line 167
    move/from16 v16, v14

    .line 168
    .line 169
    const/16 v17, 0x0

    .line 170
    .line 171
    invoke-static/range {v18 .. v18}, Lw39;->n0(Ljava/lang/Object;)V

    .line 172
    .line 173
    .line 174
    invoke-virtual {v1}, Lis1;->e()I

    .line 175
    .line 176
    .line 177
    move-result v2

    .line 178
    iget v4, v1, Lis1;->f:I

    .line 179
    .line 180
    mul-int/2addr v2, v4

    .line 181
    array-length v4, v0

    .line 182
    const/4 v5, 0x6

    .line 183
    if-le v4, v2, :cond_3

    .line 184
    .line 185
    new-instance v1, Lds1$a;

    .line 186
    .line 187
    array-length v0, v0

    .line 188
    const-string v3, "payload too large: "

    .line 189
    .line 190
    const-string v4, " bytes > max "

    .line 191
    .line 192
    invoke-static {v3, v0, v2, v4}, Lpc6;->m(Ljava/lang/String;IILjava/lang/String;)Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    move-result-object v0

    .line 196
    invoke-direct {v1, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 197
    .line 198
    .line 199
    new-instance v0, Ljava/lang/StringBuilder;

    .line 200
    .line 201
    const-string v2, "PRECHECK FAIL "

    .line 202
    .line 203
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 204
    .line 205
    .line 206
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 207
    .line 208
    .line 209
    const-string v1, " \u2014 no resolver work performed"

    .line 210
    .line 211
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 212
    .line 213
    .line 214
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 215
    .line 216
    .line 217
    move-result-object v0

    .line 218
    move-object/from16 v1, v17

    .line 219
    .line 220
    invoke-static {v13, v0, v1, v5}, Ljh4;->v(Ljh4;Ljava/lang/String;Lsu/happ/proxyutility/util/dnsttv/dto/enums/DnsTTLogType;I)V

    .line 221
    .line 222
    .line 223
    new-instance v0, Lt82;

    .line 224
    .line 225
    new-instance v2, Ljava/lang/Integer;

    .line 226
    .line 227
    const/16 v3, 0x384

    .line 228
    .line 229
    invoke-direct {v2, v3}, Ljava/lang/Integer;-><init>(I)V

    .line 230
    .line 231
    .line 232
    invoke-direct {v0, v1, v1, v2}, Lt82;-><init>([BLjava/lang/String;Ljava/lang/Integer;)V

    .line 233
    .line 234
    .line 235
    return-object v0

    .line 236
    :cond_3
    invoke-virtual {v1}, Lis1;->e()I

    .line 237
    .line 238
    .line 239
    move-result v4

    .line 240
    array-length v6, v0

    .line 241
    add-int/2addr v6, v4

    .line 242
    add-int/lit8 v6, v6, -0x1

    .line 243
    .line 244
    div-int/2addr v6, v4

    .line 245
    move/from16 v7, v16

    .line 246
    .line 247
    invoke-static {v7, v6}, Ljava/lang/Math;->max(II)I

    .line 248
    .line 249
    .line 250
    move-result v6

    .line 251
    array-length v7, v0

    .line 252
    iget-object v12, v1, Lis1;->d:Ljava/util/List;

    .line 253
    .line 254
    invoke-interface {v12}, Ljava/util/List;->size()I

    .line 255
    .line 256
    .line 257
    move-result v14

    .line 258
    const-string v15, "B, perChunk="

    .line 259
    .line 260
    const-string v5, "B, chunks="

    .line 261
    .line 262
    const-string v0, "fetch start: payload="

    .line 263
    .line 264
    invoke-static {v7, v0, v4, v15, v5}, Loi0;->r(ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 265
    .line 266
    .line 267
    move-result-object v0

    .line 268
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 269
    .line 270
    .line 271
    const-string v5, ", resolvers="

    .line 272
    .line 273
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 274
    .line 275
    .line 276
    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 277
    .line 278
    .line 279
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 280
    .line 281
    .line 282
    move-result-object v0

    .line 283
    const/4 v5, 0x6

    .line 284
    const/4 v7, 0x0

    .line 285
    invoke-static {v13, v0, v7, v5}, Ljh4;->v(Ljh4;Ljava/lang/String;Lsu/happ/proxyutility/util/dnsttv/dto/enums/DnsTTLogType;I)V

    .line 286
    .line 287
    .line 288
    invoke-interface {v12}, Ljava/util/List;->isEmpty()Z

    .line 289
    .line 290
    .line 291
    move-result v0

    .line 292
    if-eqz v0, :cond_4

    .line 293
    .line 294
    new-instance v0, Lt82;

    .line 295
    .line 296
    new-instance v1, Ljava/lang/Integer;

    .line 297
    .line 298
    const/16 v2, 0x385

    .line 299
    .line 300
    invoke-direct {v1, v2}, Ljava/lang/Integer;-><init>(I)V

    .line 301
    .line 302
    .line 303
    invoke-direct {v0, v7, v7, v1}, Lt82;-><init>([BLjava/lang/String;Ljava/lang/Integer;)V

    .line 304
    .line 305
    .line 306
    return-object v0

    .line 307
    :cond_4
    invoke-interface {v12}, Ljava/util/Collection;->size()I

    .line 308
    .line 309
    .line 310
    move-result v0

    .line 311
    const/16 v16, 0x1

    .line 312
    .line 313
    add-int/lit8 v0, v0, -0x1

    .line 314
    .line 315
    invoke-interface {v12}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 316
    .line 317
    .line 318
    move-result-object v5

    .line 319
    move-object/from16 v7, p2

    .line 320
    .line 321
    move v14, v2

    .line 322
    move v15, v4

    .line 323
    move-object v12, v5

    .line 324
    move v5, v6

    .line 325
    move v4, v0

    .line 326
    move-object v6, v3

    .line 327
    const/4 v3, 0x0

    .line 328
    :goto_1
    move-object/from16 v2, p1

    .line 329
    .line 330
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    .line 331
    .line 332
    .line 333
    move-result v0

    .line 334
    if-eqz v0, :cond_c

    .line 335
    .line 336
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 337
    .line 338
    .line 339
    move-result-object v0

    .line 340
    move-object/from16 v18, v8

    .line 341
    .line 342
    add-int/lit8 v8, v3, 0x1

    .line 343
    .line 344
    if-ltz v3, :cond_b

    .line 345
    .line 346
    move/from16 p1, v8

    .line 347
    .line 348
    move-object v8, v0

    .line 349
    check-cast v8, Ljava/lang/String;

    .line 350
    .line 351
    invoke-static {v3, v9, v4, v11, v10}, Loi0;->r(ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 352
    .line 353
    .line 354
    move-result-object v0

    .line 355
    move-object/from16 v19, v10

    .line 356
    .line 357
    const-string v10, " start"

    .line 358
    .line 359
    invoke-static {v0, v8, v10}, Loi0;->p(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 360
    .line 361
    .line 362
    move-result-object v0

    .line 363
    sget-object v10, Lsu/happ/proxyutility/util/dnsttv/dto/enums/DnsTTLogType;->INFO:Lsu/happ/proxyutility/util/dnsttv/dto/enums/DnsTTLogType;

    .line 364
    .line 365
    move-object/from16 v20, v11

    .line 366
    .line 367
    const/4 v11, 0x4

    .line 368
    invoke-static {v13, v0, v10, v11}, Ljh4;->v(Ljh4;Ljava/lang/String;Lsu/happ/proxyutility/util/dnsttv/dto/enums/DnsTTLogType;I)V

    .line 369
    .line 370
    .line 371
    new-instance v0, Lgs1;

    .line 372
    .line 373
    const/4 v10, 0x0

    .line 374
    const/4 v11, 0x0

    .line 375
    invoke-direct {v0, v8, v1, v11, v10}, Lgs1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq51;B)V

    .line 376
    .line 377
    .line 378
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 379
    .line 380
    .line 381
    move-result-wide v10

    .line 382
    move-object/from16 p2, v0

    .line 383
    .line 384
    sget-object v0, Lsu/happ/proxyutility/util/dnsttv/dto/enums/DnsTTLogType;->DEBUG:Lsu/happ/proxyutility/util/dnsttv/dto/enums/DnsTTLogType;

    .line 385
    .line 386
    move-object/from16 v21, v13

    .line 387
    .line 388
    if-ne v7, v0, :cond_5

    .line 389
    .line 390
    const/4 v13, 0x1

    .line 391
    goto :goto_2

    .line 392
    :cond_5
    const/4 v13, 0x0

    .line 393
    :goto_2
    :try_start_1
    iget v0, v1, Lis1;->e:I

    .line 394
    .line 395
    iput-object v2, v6, Lfs1;->f0:[B

    .line 396
    .line 397
    iput-object v7, v6, Lfs1;->g0:Lsu/happ/proxyutility/util/dnsttv/dto/enums/DnsTTLogType;

    .line 398
    .line 399
    iput-object v12, v6, Lfs1;->h0:Ljava/util/Iterator;

    .line 400
    .line 401
    iput-object v8, v6, Lfs1;->i0:Ljava/lang/String;

    .line 402
    .line 403
    iput v14, v6, Lfs1;->j0:I

    .line 404
    .line 405
    iput v15, v6, Lfs1;->k0:I

    .line 406
    .line 407
    iput v5, v6, Lfs1;->l0:I

    .line 408
    .line 409
    iput v4, v6, Lfs1;->m0:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_d

    .line 410
    .line 411
    move-object/from16 v22, v7

    .line 412
    .line 413
    move/from16 v7, p1

    .line 414
    .line 415
    :try_start_2
    iput v7, v6, Lfs1;->n0:I

    .line 416
    .line 417
    iput v3, v6, Lfs1;->o0:I

    .line 418
    .line 419
    iput-wide v10, v6, Lfs1;->q0:J

    .line 420
    .line 421
    iput v13, v6, Lfs1;->p0:I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_c

    .line 422
    .line 423
    move/from16 p1, v7

    .line 424
    .line 425
    const/4 v7, 0x1

    .line 426
    :try_start_3
    iput v7, v6, Lfs1;->t0:I
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_b

    .line 427
    .line 428
    move/from16 v16, v4

    .line 429
    .line 430
    move/from16 v23, v5

    .line 431
    .line 432
    move-object v5, v8

    .line 433
    move v4, v0

    .line 434
    move v8, v3

    .line 435
    move-object/from16 v3, p2

    .line 436
    .line 437
    :try_start_4
    invoke-virtual/range {v1 .. v6}, Lis1;->d([BLgs1;ILjava/lang/String;Ls51;)Ljava/lang/Object;

    .line 438
    .line 439
    .line 440
    move-result-object v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_a

    .line 441
    sget-object v1, Lc71;->X:Lc71;

    .line 442
    .line 443
    if-ne v0, v1, :cond_6

    .line 444
    .line 445
    return-object v1

    .line 446
    :cond_6
    move-object v1, v2

    .line 447
    move-object v3, v6

    .line 448
    move v4, v13

    .line 449
    move/from16 v13, v16

    .line 450
    .line 451
    move/from16 v6, p1

    .line 452
    .line 453
    move-object v2, v0

    .line 454
    :goto_3
    :try_start_5
    check-cast v2, [B

    .line 455
    .line 456
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 457
    .line 458
    .line 459
    move-result-wide v24
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_9

    .line 460
    move/from16 v16, v8

    .line 461
    .line 462
    sub-long v7, v24, v10

    .line 463
    .line 464
    :try_start_6
    array-length v0, v2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_8

    .line 465
    move-object/from16 p1, v1

    .line 466
    .line 467
    :try_start_7
    new-instance v1, Ljava/lang/StringBuilder;

    .line 468
    .line 469
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 470
    .line 471
    .line 472
    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_7

    .line 473
    .line 474
    .line 475
    move-object/from16 v24, v3

    .line 476
    .line 477
    move/from16 v3, v16

    .line 478
    .line 479
    :try_start_8
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_6

    .line 480
    .line 481
    .line 482
    move/from16 v16, v3

    .line 483
    .line 484
    move-object/from16 v3, v20

    .line 485
    .line 486
    :try_start_9
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 487
    .line 488
    .line 489
    invoke-virtual {v1, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_5

    .line 490
    .line 491
    .line 492
    move/from16 v20, v4

    .line 493
    .line 494
    move-object/from16 v4, v19

    .line 495
    .line 496
    :try_start_a
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 497
    .line 498
    .line 499
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_4

    .line 500
    .line 501
    .line 502
    move/from16 v19, v6

    .line 503
    .line 504
    :try_start_b
    const-string v6, " SUCCESS \u2014 response="

    .line 505
    .line 506
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 507
    .line 508
    .line 509
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 510
    .line 511
    .line 512
    const-string v0, "B in "

    .line 513
    .line 514
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 515
    .line 516
    .line 517
    invoke-virtual {v1, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_3

    .line 518
    .line 519
    .line 520
    move-object/from16 v7, v18

    .line 521
    .line 522
    :try_start_c
    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 523
    .line 524
    .line 525
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 526
    .line 527
    .line 528
    move-result-object v0

    .line 529
    sget-object v1, Lsu/happ/proxyutility/util/dnsttv/dto/enums/DnsTTLogType;->INFO:Lsu/happ/proxyutility/util/dnsttv/dto/enums/DnsTTLogType;
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_2

    .line 530
    .line 531
    move-object/from16 v8, v21

    .line 532
    .line 533
    const/4 v6, 0x4

    .line 534
    :try_start_d
    invoke-static {v8, v0, v1, v6}, Ljh4;->v(Ljh4;Ljava/lang/String;Lsu/happ/proxyutility/util/dnsttv/dto/enums/DnsTTLogType;I)V

    .line 535
    .line 536
    .line 537
    new-instance v0, Lt82;

    .line 538
    .line 539
    const/4 v1, 0x0

    .line 540
    invoke-direct {v0, v2, v5, v1}, Lt82;-><init>([BLjava/lang/String;Ljava/lang/Integer;)V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_1

    .line 541
    .line 542
    .line 543
    return-object v0

    .line 544
    :catchall_1
    move-exception v0

    .line 545
    :goto_4
    move-object v2, v5

    .line 546
    move-object v1, v8

    .line 547
    move-object v8, v12

    .line 548
    move/from16 v12, v16

    .line 549
    .line 550
    move-object/from16 v6, v24

    .line 551
    .line 552
    move-object/from16 v5, p1

    .line 553
    .line 554
    goto/16 :goto_c

    .line 555
    .line 556
    :catchall_2
    move-exception v0

    .line 557
    :goto_5
    move-object/from16 v8, v21

    .line 558
    .line 559
    goto :goto_4

    .line 560
    :catchall_3
    move-exception v0

    .line 561
    :goto_6
    move-object/from16 v7, v18

    .line 562
    .line 563
    goto :goto_5

    .line 564
    :catchall_4
    move-exception v0

    .line 565
    move/from16 v19, v6

    .line 566
    .line 567
    goto :goto_6

    .line 568
    :catchall_5
    move-exception v0

    .line 569
    move/from16 v20, v4

    .line 570
    .line 571
    move-object/from16 v7, v18

    .line 572
    .line 573
    move-object/from16 v4, v19

    .line 574
    .line 575
    move-object/from16 v8, v21

    .line 576
    .line 577
    :goto_7
    move/from16 v19, v6

    .line 578
    .line 579
    goto :goto_4

    .line 580
    :catchall_6
    move-exception v0

    .line 581
    move/from16 v16, v3

    .line 582
    .line 583
    :goto_8
    move-object/from16 v7, v18

    .line 584
    .line 585
    move-object/from16 v3, v20

    .line 586
    .line 587
    move-object/from16 v8, v21

    .line 588
    .line 589
    move/from16 v20, v4

    .line 590
    .line 591
    move-object/from16 v4, v19

    .line 592
    .line 593
    goto :goto_7

    .line 594
    :catchall_7
    move-exception v0

    .line 595
    :goto_9
    move-object/from16 v24, v3

    .line 596
    .line 597
    goto :goto_8

    .line 598
    :catchall_8
    move-exception v0

    .line 599
    move-object/from16 p1, v1

    .line 600
    .line 601
    goto :goto_9

    .line 602
    :catchall_9
    move-exception v0

    .line 603
    move-object/from16 p1, v1

    .line 604
    .line 605
    move-object/from16 v24, v3

    .line 606
    .line 607
    move/from16 v16, v8

    .line 608
    .line 609
    goto :goto_8

    .line 610
    :catchall_a
    move-exception v0

    .line 611
    move-object/from16 v7, v18

    .line 612
    .line 613
    move-object/from16 v4, v19

    .line 614
    .line 615
    move-object/from16 v3, v20

    .line 616
    .line 617
    move-object/from16 v1, v21

    .line 618
    .line 619
    :goto_a
    move-object/from16 v19, v5

    .line 620
    .line 621
    move-object v5, v2

    .line 622
    move-object/from16 v2, v19

    .line 623
    .line 624
    move-object/from16 v19, v12

    .line 625
    .line 626
    move v12, v8

    .line 627
    move-object/from16 v8, v19

    .line 628
    .line 629
    move/from16 v19, p1

    .line 630
    .line 631
    move/from16 v20, v13

    .line 632
    .line 633
    move/from16 v13, v16

    .line 634
    .line 635
    goto :goto_c

    .line 636
    :catchall_b
    move-exception v0

    .line 637
    move/from16 v16, v4

    .line 638
    .line 639
    move/from16 v23, v5

    .line 640
    .line 641
    :goto_b
    move-object v5, v8

    .line 642
    move-object/from16 v7, v18

    .line 643
    .line 644
    move-object/from16 v4, v19

    .line 645
    .line 646
    move-object/from16 v1, v21

    .line 647
    .line 648
    move v8, v3

    .line 649
    move-object/from16 v3, v20

    .line 650
    .line 651
    goto :goto_a

    .line 652
    :catchall_c
    move-exception v0

    .line 653
    move/from16 v16, v4

    .line 654
    .line 655
    move/from16 v23, v5

    .line 656
    .line 657
    move/from16 p1, v7

    .line 658
    .line 659
    goto :goto_b

    .line 660
    :catchall_d
    move-exception v0

    .line 661
    move/from16 v16, v4

    .line 662
    .line 663
    move/from16 v23, v5

    .line 664
    .line 665
    move-object/from16 v22, v7

    .line 666
    .line 667
    goto :goto_b

    .line 668
    :goto_c
    move-object/from16 p1, v5

    .line 669
    .line 670
    if-eqz v20, :cond_7

    .line 671
    .line 672
    invoke-static {v0}, Lgv3;->W(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 673
    .line 674
    .line 675
    move-result-object v5

    .line 676
    move-object/from16 v16, v6

    .line 677
    .line 678
    const-string v6, "util.protection"

    .line 679
    .line 680
    move-object/from16 v18, v8

    .line 681
    .line 682
    const/4 v8, 0x0

    .line 683
    invoke-static {v5, v6, v8}, Lfm7;->d0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 684
    .line 685
    .line 686
    move-result v5

    .line 687
    if-nez v5, :cond_8

    .line 688
    .line 689
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 690
    .line 691
    .line 692
    goto :goto_d

    .line 693
    :cond_7
    move-object/from16 v16, v6

    .line 694
    .line 695
    move-object/from16 v18, v8

    .line 696
    .line 697
    const/4 v8, 0x0

    .line 698
    :cond_8
    :goto_d
    instance-of v5, v0, Ljava/lang/InterruptedException;

    .line 699
    .line 700
    if-nez v5, :cond_a

    .line 701
    .line 702
    instance-of v5, v0, Ljava/util/concurrent/CancellationException;

    .line 703
    .line 704
    if-nez v5, :cond_a

    .line 705
    .line 706
    new-instance v5, Lrj6;

    .line 707
    .line 708
    invoke-direct {v5, v0}, Lrj6;-><init>(Ljava/lang/Throwable;)V

    .line 709
    .line 710
    .line 711
    invoke-static {v5}, Lsj6;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 712
    .line 713
    .line 714
    move-result-object v0

    .line 715
    if-eqz v0, :cond_9

    .line 716
    .line 717
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 718
    .line 719
    .line 720
    move-result-wide v5

    .line 721
    sub-long/2addr v5, v10

    .line 722
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 723
    .line 724
    .line 725
    move-result-object v0

    .line 726
    const-string v10, "onFailure["

    .line 727
    .line 728
    invoke-static {v12, v10, v13, v3, v4}, Loi0;->r(ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 729
    .line 730
    .line 731
    move-result-object v10

    .line 732
    const-string v11, " t:"

    .line 733
    .line 734
    const-string v12, " in "

    .line 735
    .line 736
    invoke-static {v10, v2, v11, v0, v12}, Loi0;->y(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 737
    .line 738
    .line 739
    invoke-static {v5, v6, v7, v10}, Lie2;->g(JLjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 740
    .line 741
    .line 742
    move-result-object v0

    .line 743
    sget-object v2, Lsu/happ/proxyutility/util/dnsttv/dto/enums/DnsTTLogType;->INFO:Lsu/happ/proxyutility/util/dnsttv/dto/enums/DnsTTLogType;

    .line 744
    .line 745
    const/4 v6, 0x4

    .line 746
    invoke-static {v1, v0, v2, v6}, Ljh4;->v(Ljh4;Ljava/lang/String;Lsu/happ/proxyutility/util/dnsttv/dto/enums/DnsTTLogType;I)V

    .line 747
    .line 748
    .line 749
    goto :goto_e

    .line 750
    :cond_9
    const/4 v6, 0x4

    .line 751
    :goto_e
    move-object v11, v3

    .line 752
    move-object v10, v4

    .line 753
    move-object v8, v7

    .line 754
    move v4, v13

    .line 755
    move-object/from16 v6, v16

    .line 756
    .line 757
    move-object/from16 v12, v18

    .line 758
    .line 759
    move/from16 v3, v19

    .line 760
    .line 761
    move-object/from16 v7, v22

    .line 762
    .line 763
    move/from16 v5, v23

    .line 764
    .line 765
    move-object v13, v1

    .line 766
    move-object/from16 v1, p0

    .line 767
    .line 768
    goto/16 :goto_1

    .line 769
    .line 770
    :cond_a
    throw v0

    .line 771
    :cond_b
    invoke-static {}, Li21;->X()V

    .line 772
    .line 773
    .line 774
    const/4 v1, 0x0

    .line 775
    throw v1

    .line 776
    :cond_c
    const/4 v1, 0x0

    .line 777
    new-instance v0, Lt82;

    .line 778
    .line 779
    new-instance v2, Ljava/lang/Integer;

    .line 780
    .line 781
    const/16 v3, 0x386

    .line 782
    .line 783
    invoke-direct {v2, v3}, Ljava/lang/Integer;-><init>(I)V

    .line 784
    .line 785
    .line 786
    invoke-direct {v0, v1, v1, v2}, Lt82;-><init>([BLjava/lang/String;Ljava/lang/Integer;)V

    .line 787
    .line 788
    .line 789
    return-object v0
.end method

.method public final d([BLgs1;ILjava/lang/String;Ls51;)Ljava/lang/Object;
    .locals 9

    .line 1
    instance-of v0, p5, Lhs1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p5

    .line 6
    check-cast v0, Lhs1;

    .line 7
    .line 8
    iget v1, v0, Lhs1;->n0:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lhs1;->n0:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lhs1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p5}, Lhs1;-><init>(Lis1;Ls51;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p5, v0, Lhs1;->l0:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lhs1;->n0:I

    .line 28
    .line 29
    const/4 v2, 0x2

    .line 30
    const/4 v3, 0x0

    .line 31
    const/4 v4, 0x1

    .line 32
    sget-object v5, Lc71;->X:Lc71;

    .line 33
    .line 34
    if-eqz v1, :cond_3

    .line 35
    .line 36
    if-eq v1, v4, :cond_2

    .line 37
    .line 38
    if-ne v1, v2, :cond_1

    .line 39
    .line 40
    iget p1, v0, Lhs1;->k0:I

    .line 41
    .line 42
    iget p2, v0, Lhs1;->j0:I

    .line 43
    .line 44
    iget-object p3, v0, Lhs1;->i0:Ljava/lang/Throwable;

    .line 45
    .line 46
    iget-object p4, v0, Lhs1;->h0:Ljava/lang/String;

    .line 47
    .line 48
    iget-object v1, v0, Lhs1;->g0:Lsn2;

    .line 49
    .line 50
    iget-object v6, v0, Lhs1;->f0:[B

    .line 51
    .line 52
    invoke-static {p5}, Lw39;->n0(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    goto :goto_4

    .line 56
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 57
    .line 58
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    return-object v3

    .line 62
    :cond_2
    iget p1, v0, Lhs1;->k0:I

    .line 63
    .line 64
    iget p2, v0, Lhs1;->j0:I

    .line 65
    .line 66
    iget-object p3, v0, Lhs1;->h0:Ljava/lang/String;

    .line 67
    .line 68
    iget-object p4, v0, Lhs1;->g0:Lsn2;

    .line 69
    .line 70
    iget-object v1, v0, Lhs1;->f0:[B

    .line 71
    .line 72
    :try_start_0
    invoke-static {p5}, Lw39;->n0(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 73
    .line 74
    .line 75
    return-object p5

    .line 76
    :catchall_0
    move-exception p5

    .line 77
    move-object v6, v1

    .line 78
    move-object v1, p4

    .line 79
    move-object p4, p3

    .line 80
    move-object p3, p5

    .line 81
    goto :goto_2

    .line 82
    :cond_3
    invoke-static {p5}, Lw39;->n0(Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    new-instance p5, Lte8$d;

    .line 86
    .line 87
    invoke-direct {p5}, Lte8$d;-><init>()V

    .line 88
    .line 89
    .line 90
    if-gt v4, p3, :cond_6

    .line 91
    .line 92
    move p5, v4

    .line 93
    :goto_1
    :try_start_1
    iput-object p1, v0, Lhs1;->f0:[B

    .line 94
    .line 95
    iput-object p2, v0, Lhs1;->g0:Lsn2;

    .line 96
    .line 97
    iput-object p4, v0, Lhs1;->h0:Ljava/lang/String;

    .line 98
    .line 99
    iput-object v3, v0, Lhs1;->i0:Ljava/lang/Throwable;

    .line 100
    .line 101
    iput p3, v0, Lhs1;->j0:I

    .line 102
    .line 103
    iput p5, v0, Lhs1;->k0:I

    .line 104
    .line 105
    iput v4, v0, Lhs1;->n0:I

    .line 106
    .line 107
    invoke-virtual {p0, p1, p2, p4, v0}, Lis1;->b([BLsn2;Ljava/lang/String;Ls51;)Ljava/io/Serializable;

    .line 108
    .line 109
    .line 110
    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 111
    if-ne p0, v5, :cond_4

    .line 112
    .line 113
    goto :goto_3

    .line 114
    :cond_4
    return-object p0

    .line 115
    :catchall_1
    move-exception v1

    .line 116
    move-object v6, v1

    .line 117
    move-object v1, p2

    .line 118
    move p2, p3

    .line 119
    move-object p3, v6

    .line 120
    move-object v6, p1

    .line 121
    move p1, p5

    .line 122
    :goto_2
    if-ge p1, p2, :cond_5

    .line 123
    .line 124
    iput-object v6, v0, Lhs1;->f0:[B

    .line 125
    .line 126
    iput-object v1, v0, Lhs1;->g0:Lsn2;

    .line 127
    .line 128
    iput-object p4, v0, Lhs1;->h0:Ljava/lang/String;

    .line 129
    .line 130
    iput-object p3, v0, Lhs1;->i0:Ljava/lang/Throwable;

    .line 131
    .line 132
    iput p2, v0, Lhs1;->j0:I

    .line 133
    .line 134
    iput p1, v0, Lhs1;->k0:I

    .line 135
    .line 136
    iput v2, v0, Lhs1;->n0:I

    .line 137
    .line 138
    const-wide/16 v7, 0x1f4

    .line 139
    .line 140
    invoke-static {v7, v8, v0}, Lu70;->F(JLq51;)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object p5

    .line 144
    if-ne p5, v5, :cond_5

    .line 145
    .line 146
    :goto_3
    return-object v5

    .line 147
    :cond_5
    :goto_4
    move-object p5, p3

    .line 148
    move p3, p2

    .line 149
    move-object p2, v1

    .line 150
    if-eq p1, p3, :cond_6

    .line 151
    .line 152
    add-int/lit8 p5, p1, 0x1

    .line 153
    .line 154
    move-object p1, v6

    .line 155
    goto :goto_1

    .line 156
    :cond_6
    throw p5
.end method

.method public final e()I
    .locals 3

    .line 1
    iget-object p0, p0, Lis1;->c:Lbr1;

    .line 2
    .line 3
    iget-object p0, p0, Lbr1;->a:Ljava/util/List;

    .line 4
    .line 5
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const/4 v0, 0x0

    .line 10
    move v1, v0

    .line 11
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    check-cast v2, [B

    .line 22
    .line 23
    array-length v2, v2

    .line 24
    add-int/lit8 v2, v2, 0x1

    .line 25
    .line 26
    add-int/2addr v1, v2

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 29
    .line 30
    rsub-int p0, v1, 0xff

    .line 31
    .line 32
    invoke-static {v0, p0}, Ljava/lang/Math;->max(II)I

    .line 33
    .line 34
    .line 35
    move-result p0

    .line 36
    div-int/lit8 v1, p0, 0x40

    .line 37
    .line 38
    mul-int/lit8 v2, v1, 0x40

    .line 39
    .line 40
    sub-int/2addr p0, v2

    .line 41
    add-int/lit8 p0, p0, -0x1

    .line 42
    .line 43
    invoke-static {v0, p0}, Ljava/lang/Math;->max(II)I

    .line 44
    .line 45
    .line 46
    move-result p0

    .line 47
    mul-int/lit8 v1, v1, 0x3f

    .line 48
    .line 49
    add-int/2addr v1, p0

    .line 50
    mul-int/lit8 v1, v1, 0x5

    .line 51
    .line 52
    div-int/lit8 v1, v1, 0x8

    .line 53
    .line 54
    add-int/lit8 v1, v1, -0x1c

    .line 55
    .line 56
    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    .line 57
    .line 58
    .line 59
    move-result p0

    .line 60
    add-int/lit8 p0, p0, -0x4

    .line 61
    .line 62
    invoke-static {v0, p0}, Ljava/lang/Math;->max(II)I

    .line 63
    .line 64
    .line 65
    move-result p0

    .line 66
    return p0
.end method
