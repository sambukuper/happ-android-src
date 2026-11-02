.class public final Lio/sentry/cache/tape/e;
.super Lio/sentry/cache/tape/g;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final X:Lio/sentry/cache/tape/j;

.field public final Y:Lio/sentry/cache/tape/c;

.field public final Z:Lio/sentry/cache/tape/f;


# direct methods
.method public constructor <init>(Lio/sentry/cache/tape/j;Lio/sentry/cache/tape/f;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lio/sentry/cache/tape/c;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lio/sentry/cache/tape/e;->Y:Lio/sentry/cache/tape/c;

    .line 10
    .line 11
    iput-object p1, p0, Lio/sentry/cache/tape/e;->X:Lio/sentry/cache/tape/j;

    .line 12
    .line 13
    iput-object p2, p0, Lio/sentry/cache/tape/e;->Z:Lio/sentry/cache/tape/f;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final R(Ljava/lang/Comparable;)V
    .locals 26

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lio/sentry/cache/tape/e;->Y:Lio/sentry/cache/tape/c;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->reset()V

    .line 6
    .line 7
    .line 8
    iget-object v2, v0, Lio/sentry/cache/tape/e;->Z:Lio/sentry/cache/tape/f;

    .line 9
    .line 10
    move-object/from16 v3, p1

    .line 11
    .line 12
    invoke-interface {v2, v3, v1}, Lio/sentry/cache/tape/f;->e(Ljava/lang/Comparable;Ljava/io/OutputStream;)V

    .line 13
    .line 14
    .line 15
    iget-object v3, v0, Lio/sentry/cache/tape/e;->X:Lio/sentry/cache/tape/j;

    .line 16
    .line 17
    iget-object v0, v3, Lio/sentry/cache/tape/j;->i0:[B

    .line 18
    .line 19
    invoke-virtual {v1}, Lio/sentry/cache/tape/c;->g()[B

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->size()I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-eqz v2, :cond_f

    .line 28
    .line 29
    if-ltz v1, :cond_e

    .line 30
    .line 31
    array-length v4, v2

    .line 32
    if-gt v1, v4, :cond_e

    .line 33
    .line 34
    iget-boolean v4, v3, Lio/sentry/cache/tape/j;->m0:Z

    .line 35
    .line 36
    if-nez v4, :cond_d

    .line 37
    .line 38
    iget v4, v3, Lio/sentry/cache/tape/j;->k0:I

    .line 39
    .line 40
    const/4 v5, -0x1

    .line 41
    const/4 v11, 0x1

    .line 42
    if-ne v4, v5, :cond_0

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    iget v5, v3, Lio/sentry/cache/tape/j;->f0:I

    .line 46
    .line 47
    if-ne v5, v4, :cond_1

    .line 48
    .line 49
    invoke-virtual {v3, v11}, Lio/sentry/cache/tape/j;->c0(I)V

    .line 50
    .line 51
    .line 52
    :cond_1
    :goto_0
    int-to-long v4, v1

    .line 53
    const-wide/16 v12, 0x4

    .line 54
    .line 55
    add-long/2addr v4, v12

    .line 56
    iget-wide v6, v3, Lio/sentry/cache/tape/j;->Z:J

    .line 57
    .line 58
    iget v8, v3, Lio/sentry/cache/tape/j;->f0:I

    .line 59
    .line 60
    const-wide/16 v14, 0x20

    .line 61
    .line 62
    if-nez v8, :cond_2

    .line 63
    .line 64
    move-wide/from16 p0, v12

    .line 65
    .line 66
    move-wide v9, v14

    .line 67
    move-wide/from16 v16, v9

    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_2
    iget-object v8, v3, Lio/sentry/cache/tape/j;->h0:Lio/sentry/cache/tape/h;

    .line 71
    .line 72
    iget-wide v9, v8, Lio/sentry/cache/tape/h;->a:J

    .line 73
    .line 74
    move-wide/from16 p0, v12

    .line 75
    .line 76
    iget-object v12, v3, Lio/sentry/cache/tape/j;->g0:Lio/sentry/cache/tape/h;

    .line 77
    .line 78
    iget-wide v12, v12, Lio/sentry/cache/tape/h;->a:J

    .line 79
    .line 80
    cmp-long v16, v9, v12

    .line 81
    .line 82
    iget v8, v8, Lio/sentry/cache/tape/h;->b:I

    .line 83
    .line 84
    if-ltz v16, :cond_3

    .line 85
    .line 86
    sub-long/2addr v9, v12

    .line 87
    add-long v9, v9, p0

    .line 88
    .line 89
    int-to-long v12, v8

    .line 90
    add-long/2addr v9, v12

    .line 91
    add-long/2addr v9, v14

    .line 92
    move-wide/from16 v16, v14

    .line 93
    .line 94
    goto :goto_1

    .line 95
    :cond_3
    add-long v9, v9, p0

    .line 96
    .line 97
    move-wide/from16 v16, v14

    .line 98
    .line 99
    int-to-long v14, v8

    .line 100
    add-long/2addr v9, v14

    .line 101
    add-long/2addr v9, v6

    .line 102
    sub-long/2addr v9, v12

    .line 103
    :goto_1
    sub-long v8, v6, v9

    .line 104
    .line 105
    cmp-long v10, v8, v4

    .line 106
    .line 107
    if-ltz v10, :cond_4

    .line 108
    .line 109
    goto/16 :goto_6

    .line 110
    .line 111
    :cond_4
    add-long/2addr v8, v6

    .line 112
    shl-long/2addr v6, v11

    .line 113
    cmp-long v10, v8, v4

    .line 114
    .line 115
    if-ltz v10, :cond_4

    .line 116
    .line 117
    iget-object v4, v3, Lio/sentry/cache/tape/j;->X:Ljava/io/RandomAccessFile;

    .line 118
    .line 119
    invoke-virtual {v4, v6, v7}, Ljava/io/RandomAccessFile;->setLength(J)V

    .line 120
    .line 121
    .line 122
    iget-object v4, v3, Lio/sentry/cache/tape/j;->X:Ljava/io/RandomAccessFile;

    .line 123
    .line 124
    invoke-virtual {v4}, Ljava/io/RandomAccessFile;->getChannel()Ljava/nio/channels/FileChannel;

    .line 125
    .line 126
    .line 127
    move-result-object v4

    .line 128
    invoke-virtual {v4, v11}, Ljava/nio/channels/FileChannel;->force(Z)V

    .line 129
    .line 130
    .line 131
    iget-object v4, v3, Lio/sentry/cache/tape/j;->h0:Lio/sentry/cache/tape/h;

    .line 132
    .line 133
    iget-wide v8, v4, Lio/sentry/cache/tape/h;->a:J

    .line 134
    .line 135
    add-long v8, v8, p0

    .line 136
    .line 137
    iget v4, v4, Lio/sentry/cache/tape/h;->b:I

    .line 138
    .line 139
    int-to-long v4, v4

    .line 140
    add-long/2addr v8, v4

    .line 141
    invoke-virtual {v3, v8, v9}, Lio/sentry/cache/tape/j;->H0(J)J

    .line 142
    .line 143
    .line 144
    move-result-wide v4

    .line 145
    iget-object v8, v3, Lio/sentry/cache/tape/j;->g0:Lio/sentry/cache/tape/h;

    .line 146
    .line 147
    iget-wide v8, v8, Lio/sentry/cache/tape/h;->a:J

    .line 148
    .line 149
    cmp-long v8, v4, v8

    .line 150
    .line 151
    const-wide/16 v12, 0x0

    .line 152
    .line 153
    if-gtz v8, :cond_6

    .line 154
    .line 155
    iget-object v8, v3, Lio/sentry/cache/tape/j;->X:Ljava/io/RandomAccessFile;

    .line 156
    .line 157
    invoke-virtual {v8}, Ljava/io/RandomAccessFile;->getChannel()Ljava/nio/channels/FileChannel;

    .line 158
    .line 159
    .line 160
    move-result-object v8

    .line 161
    iget-wide v9, v3, Lio/sentry/cache/tape/j;->Z:J

    .line 162
    .line 163
    invoke-virtual {v8, v9, v10}, Ljava/nio/channels/FileChannel;->position(J)Ljava/nio/channels/FileChannel;

    .line 164
    .line 165
    .line 166
    sub-long v21, v4, v16

    .line 167
    .line 168
    const-wide/16 v19, 0x20

    .line 169
    .line 170
    move-object/from16 v23, v8

    .line 171
    .line 172
    move-object/from16 v18, v8

    .line 173
    .line 174
    invoke-virtual/range {v18 .. v23}, Ljava/nio/channels/FileChannel;->transferTo(JJLjava/nio/channels/WritableByteChannel;)J

    .line 175
    .line 176
    .line 177
    move-result-wide v4

    .line 178
    cmp-long v4, v4, v21

    .line 179
    .line 180
    if-nez v4, :cond_5

    .line 181
    .line 182
    goto :goto_2

    .line 183
    :cond_5
    const-string v0, "Copied insufficient number of bytes!"

    .line 184
    .line 185
    invoke-static {v0}, Lbt;->g(Ljava/lang/Object;)V

    .line 186
    .line 187
    .line 188
    return-void

    .line 189
    :cond_6
    move-wide/from16 v21, v12

    .line 190
    .line 191
    :goto_2
    iget-object v4, v3, Lio/sentry/cache/tape/j;->h0:Lio/sentry/cache/tape/h;

    .line 192
    .line 193
    iget-wide v9, v4, Lio/sentry/cache/tape/h;->a:J

    .line 194
    .line 195
    iget-object v4, v3, Lio/sentry/cache/tape/j;->g0:Lio/sentry/cache/tape/h;

    .line 196
    .line 197
    iget-wide v4, v4, Lio/sentry/cache/tape/h;->a:J

    .line 198
    .line 199
    cmp-long v8, v9, v4

    .line 200
    .line 201
    if-gez v8, :cond_7

    .line 202
    .line 203
    iget-wide v14, v3, Lio/sentry/cache/tape/j;->Z:J

    .line 204
    .line 205
    add-long/2addr v14, v9

    .line 206
    sub-long v9, v14, v16

    .line 207
    .line 208
    move-wide/from16 v24, v6

    .line 209
    .line 210
    move-wide v7, v4

    .line 211
    move-wide/from16 v4, v24

    .line 212
    .line 213
    iget v6, v3, Lio/sentry/cache/tape/j;->f0:I

    .line 214
    .line 215
    invoke-virtual/range {v3 .. v10}, Lio/sentry/cache/tape/j;->J0(JIJJ)V

    .line 216
    .line 217
    .line 218
    new-instance v6, Lio/sentry/cache/tape/h;

    .line 219
    .line 220
    iget-object v7, v3, Lio/sentry/cache/tape/j;->h0:Lio/sentry/cache/tape/h;

    .line 221
    .line 222
    iget v7, v7, Lio/sentry/cache/tape/h;->b:I

    .line 223
    .line 224
    invoke-direct {v6, v9, v10, v7}, Lio/sentry/cache/tape/h;-><init>(JI)V

    .line 225
    .line 226
    .line 227
    iput-object v6, v3, Lio/sentry/cache/tape/j;->h0:Lio/sentry/cache/tape/h;

    .line 228
    .line 229
    :goto_3
    move-wide v6, v4

    .line 230
    goto :goto_4

    .line 231
    :cond_7
    move-wide/from16 v24, v6

    .line 232
    .line 233
    move-wide v7, v4

    .line 234
    move-wide/from16 v4, v24

    .line 235
    .line 236
    iget v6, v3, Lio/sentry/cache/tape/j;->f0:I

    .line 237
    .line 238
    invoke-virtual/range {v3 .. v10}, Lio/sentry/cache/tape/j;->J0(JIJJ)V

    .line 239
    .line 240
    .line 241
    goto :goto_3

    .line 242
    :goto_4
    iput-wide v6, v3, Lio/sentry/cache/tape/j;->Z:J

    .line 243
    .line 244
    move-wide/from16 v6, v16

    .line 245
    .line 246
    move-wide/from16 v4, v21

    .line 247
    .line 248
    :goto_5
    cmp-long v8, v4, v12

    .line 249
    .line 250
    if-lez v8, :cond_8

    .line 251
    .line 252
    const-wide/16 v8, 0x1000

    .line 253
    .line 254
    invoke-static {v4, v5, v8, v9}, Ljava/lang/Math;->min(JJ)J

    .line 255
    .line 256
    .line 257
    move-result-wide v8

    .line 258
    long-to-int v8, v8

    .line 259
    sget-object v9, Lio/sentry/cache/tape/j;->n0:[B

    .line 260
    .line 261
    invoke-virtual {v3, v6, v7, v9, v8}, Lio/sentry/cache/tape/j;->C0(J[BI)V

    .line 262
    .line 263
    .line 264
    int-to-long v8, v8

    .line 265
    sub-long/2addr v4, v8

    .line 266
    add-long/2addr v6, v8

    .line 267
    goto :goto_5

    .line 268
    :cond_8
    :goto_6
    iget v4, v3, Lio/sentry/cache/tape/j;->f0:I

    .line 269
    .line 270
    const/4 v5, 0x0

    .line 271
    if-nez v4, :cond_9

    .line 272
    .line 273
    move v12, v11

    .line 274
    goto :goto_7

    .line 275
    :cond_9
    move v12, v5

    .line 276
    :goto_7
    if-eqz v12, :cond_a

    .line 277
    .line 278
    move-wide/from16 v9, v16

    .line 279
    .line 280
    goto :goto_8

    .line 281
    :cond_a
    iget-object v4, v3, Lio/sentry/cache/tape/j;->h0:Lio/sentry/cache/tape/h;

    .line 282
    .line 283
    iget-wide v6, v4, Lio/sentry/cache/tape/h;->a:J

    .line 284
    .line 285
    add-long v6, v6, p0

    .line 286
    .line 287
    iget v4, v4, Lio/sentry/cache/tape/h;->b:I

    .line 288
    .line 289
    int-to-long v8, v4

    .line 290
    add-long/2addr v6, v8

    .line 291
    invoke-virtual {v3, v6, v7}, Lio/sentry/cache/tape/j;->H0(J)J

    .line 292
    .line 293
    .line 294
    move-result-wide v14

    .line 295
    move-wide v9, v14

    .line 296
    :goto_8
    new-instance v13, Lio/sentry/cache/tape/h;

    .line 297
    .line 298
    invoke-direct {v13, v9, v10, v1}, Lio/sentry/cache/tape/h;-><init>(JI)V

    .line 299
    .line 300
    .line 301
    invoke-static {v5, v1, v0}, Lio/sentry/cache/tape/j;->V0(II[B)V

    .line 302
    .line 303
    .line 304
    const/4 v4, 0x4

    .line 305
    invoke-virtual {v3, v9, v10, v0, v4}, Lio/sentry/cache/tape/j;->C0(J[BI)V

    .line 306
    .line 307
    .line 308
    add-long v4, v9, p0

    .line 309
    .line 310
    invoke-virtual {v3, v4, v5, v2, v1}, Lio/sentry/cache/tape/j;->C0(J[BI)V

    .line 311
    .line 312
    .line 313
    if-eqz v12, :cond_b

    .line 314
    .line 315
    move-wide v7, v9

    .line 316
    goto :goto_9

    .line 317
    :cond_b
    iget-object v0, v3, Lio/sentry/cache/tape/j;->g0:Lio/sentry/cache/tape/h;

    .line 318
    .line 319
    iget-wide v0, v0, Lio/sentry/cache/tape/h;->a:J

    .line 320
    .line 321
    move-wide v7, v0

    .line 322
    :goto_9
    iget-wide v4, v3, Lio/sentry/cache/tape/j;->Z:J

    .line 323
    .line 324
    iget v0, v3, Lio/sentry/cache/tape/j;->f0:I

    .line 325
    .line 326
    add-int/lit8 v6, v0, 0x1

    .line 327
    .line 328
    invoke-virtual/range {v3 .. v10}, Lio/sentry/cache/tape/j;->J0(JIJJ)V

    .line 329
    .line 330
    .line 331
    iput-object v13, v3, Lio/sentry/cache/tape/j;->h0:Lio/sentry/cache/tape/h;

    .line 332
    .line 333
    iget v0, v3, Lio/sentry/cache/tape/j;->f0:I

    .line 334
    .line 335
    add-int/2addr v0, v11

    .line 336
    iput v0, v3, Lio/sentry/cache/tape/j;->f0:I

    .line 337
    .line 338
    iget v0, v3, Lio/sentry/cache/tape/j;->j0:I

    .line 339
    .line 340
    add-int/2addr v0, v11

    .line 341
    iput v0, v3, Lio/sentry/cache/tape/j;->j0:I

    .line 342
    .line 343
    if-eqz v12, :cond_c

    .line 344
    .line 345
    iput-object v13, v3, Lio/sentry/cache/tape/j;->g0:Lio/sentry/cache/tape/h;

    .line 346
    .line 347
    :cond_c
    return-void

    .line 348
    :cond_d
    const-string v0, "closed"

    .line 349
    .line 350
    invoke-static {v0}, Lbt;->i(Ljava/lang/String;)V

    .line 351
    .line 352
    .line 353
    return-void

    .line 354
    :cond_e
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    .line 355
    .line 356
    invoke-direct {v0}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    .line 357
    .line 358
    .line 359
    throw v0

    .line 360
    :cond_f
    const-string v0, "data == null"

    .line 361
    .line 362
    invoke-static {v0}, Lb61;->i(Ljava/lang/String;)V

    .line 363
    .line 364
    .line 365
    return-void
.end method

.method public final X(I)V
    .locals 0

    .line 1
    iget-object p0, p0, Lio/sentry/cache/tape/e;->X:Lio/sentry/cache/tape/j;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lio/sentry/cache/tape/j;->c0(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final Y()V
    .locals 1

    .line 1
    iget-object p0, p0, Lio/sentry/cache/tape/e;->X:Lio/sentry/cache/tape/j;

    .line 2
    .line 3
    iget-boolean v0, p0, Lio/sentry/cache/tape/j;->l0:Z

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iget-object p0, p0, Lio/sentry/cache/tape/j;->X:Ljava/io/RandomAccessFile;

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/io/RandomAccessFile;->getChannel()Ljava/nio/channels/FileChannel;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    const/4 v0, 0x0

    .line 14
    invoke-virtual {p0, v0}, Ljava/nio/channels/FileChannel;->force(Z)V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
.end method

.method public final clear()V
    .locals 0

    .line 1
    iget-object p0, p0, Lio/sentry/cache/tape/e;->X:Lio/sentry/cache/tape/j;

    .line 2
    .line 3
    invoke-virtual {p0}, Lio/sentry/cache/tape/j;->clear()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final close()V
    .locals 0

    .line 1
    iget-object p0, p0, Lio/sentry/cache/tape/e;->X:Lio/sentry/cache/tape/j;

    .line 2
    .line 3
    invoke-virtual {p0}, Lio/sentry/cache/tape/j;->close()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 3

    .line 1
    new-instance v0, Lio/sentry/cache/tape/d;

    .line 2
    .line 3
    new-instance v1, Lio/sentry/cache/tape/i;

    .line 4
    .line 5
    iget-object v2, p0, Lio/sentry/cache/tape/e;->X:Lio/sentry/cache/tape/j;

    .line 6
    .line 7
    invoke-direct {v1, v2}, Lio/sentry/cache/tape/i;-><init>(Lio/sentry/cache/tape/j;)V

    .line 8
    .line 9
    .line 10
    invoke-direct {v0, p0, v1}, Lio/sentry/cache/tape/d;-><init>(Lio/sentry/cache/tape/e;Lio/sentry/cache/tape/i;)V

    .line 11
    .line 12
    .line 13
    return-object v0
.end method

.method public final size()I
    .locals 0

    .line 1
    iget-object p0, p0, Lio/sentry/cache/tape/e;->X:Lio/sentry/cache/tape/j;

    .line 2
    .line 3
    iget p0, p0, Lio/sentry/cache/tape/j;->f0:I

    .line 4
    .line 5
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "FileObjectQueue{queueFile="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, Lio/sentry/cache/tape/e;->X:Lio/sentry/cache/tape/j;

    .line 9
    .line 10
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const/16 p0, 0x7d

    .line 14
    .line 15
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0
.end method
