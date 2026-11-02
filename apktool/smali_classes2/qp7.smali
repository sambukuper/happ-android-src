.class public abstract Lqp7;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# direct methods
.method public static final a(Lyr7;Lgn2;Lkx4;Llp2;I)V
    .locals 31

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    move-object/from16 v12, p3

    .line 6
    .line 7
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    const v0, 0x3e116f3d

    .line 11
    .line 12
    .line 13
    invoke-virtual {v12, v0}, Llp2;->X(I)Llp2;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v12, v1}, Llp2;->f(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    const/4 v11, 0x4

    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    move v0, v11

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    const/4 v0, 0x2

    .line 26
    :goto_0
    or-int v0, p4, v0

    .line 27
    .line 28
    invoke-virtual {v12, v2}, Llp2;->h(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    const/16 v13, 0x20

    .line 33
    .line 34
    if-eqz v3, :cond_1

    .line 35
    .line 36
    move v3, v13

    .line 37
    goto :goto_1

    .line 38
    :cond_1
    const/16 v3, 0x10

    .line 39
    .line 40
    :goto_1
    or-int/2addr v0, v3

    .line 41
    move-object/from16 v3, p2

    .line 42
    .line 43
    invoke-virtual {v12, v3}, Llp2;->f(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v4

    .line 47
    if-eqz v4, :cond_2

    .line 48
    .line 49
    const/16 v4, 0x100

    .line 50
    .line 51
    goto :goto_2

    .line 52
    :cond_2
    const/16 v4, 0x80

    .line 53
    .line 54
    :goto_2
    or-int/2addr v0, v4

    .line 55
    and-int/lit16 v4, v0, 0x93

    .line 56
    .line 57
    const/16 v5, 0x92

    .line 58
    .line 59
    const/4 v14, 0x0

    .line 60
    if-eq v4, v5, :cond_3

    .line 61
    .line 62
    const/4 v4, 0x1

    .line 63
    goto :goto_3

    .line 64
    :cond_3
    move v4, v14

    .line 65
    :goto_3
    and-int/lit8 v5, v0, 0x1

    .line 66
    .line 67
    invoke-virtual {v12, v5, v4}, Llp2;->N(IZ)Z

    .line 68
    .line 69
    .line 70
    move-result v4

    .line 71
    if-eqz v4, :cond_f

    .line 72
    .line 73
    sget-object v4, Lpz2;->o0:Lo50;

    .line 74
    .line 75
    new-instance v5, Lft;

    .line 76
    .line 77
    new-instance v6, Lbt;

    .line 78
    .line 79
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 80
    .line 81
    .line 82
    const/high16 v7, 0x41400000    # 12.0f

    .line 83
    .line 84
    invoke-direct {v5, v7, v6}, Lft;-><init>(FLbt;)V

    .line 85
    .line 86
    .line 87
    and-int/lit8 v6, v0, 0x70

    .line 88
    .line 89
    if-ne v6, v13, :cond_4

    .line 90
    .line 91
    const/4 v7, 0x1

    .line 92
    goto :goto_4

    .line 93
    :cond_4
    move v7, v14

    .line 94
    :goto_4
    and-int/lit8 v0, v0, 0xe

    .line 95
    .line 96
    if-ne v0, v11, :cond_5

    .line 97
    .line 98
    const/4 v8, 0x1

    .line 99
    goto :goto_5

    .line 100
    :cond_5
    move v8, v14

    .line 101
    :goto_5
    or-int/2addr v7, v8

    .line 102
    invoke-virtual {v12}, Llp2;->K()Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v8

    .line 106
    sget-object v9, Lzz0;->a:Lbe;

    .line 107
    .line 108
    if-nez v7, :cond_6

    .line 109
    .line 110
    if-ne v8, v9, :cond_7

    .line 111
    .line 112
    :cond_6
    new-instance v8, Lpp7;

    .line 113
    .line 114
    invoke-direct {v8, v2, v1, v14}, Lpp7;-><init>(Lgn2;Lyr7;B)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {v12, v8}, Llp2;->g0(Ljava/lang/Object;)V

    .line 118
    .line 119
    .line 120
    :cond_7
    check-cast v8, Ldn2;

    .line 121
    .line 122
    const/16 v10, 0x1f

    .line 123
    .line 124
    move-object v7, v4

    .line 125
    const/4 v4, 0x0

    .line 126
    move-object/from16 v16, v5

    .line 127
    .line 128
    const/4 v5, 0x0

    .line 129
    move/from16 v17, v6

    .line 130
    .line 131
    const/4 v6, 0x0

    .line 132
    move-object/from16 v18, v7

    .line 133
    .line 134
    const/4 v7, 0x0

    .line 135
    move-object/from16 v19, v9

    .line 136
    .line 137
    move-object v9, v12

    .line 138
    move-object/from16 v14, v16

    .line 139
    .line 140
    move/from16 v15, v17

    .line 141
    .line 142
    move-object/from16 v12, v18

    .line 143
    .line 144
    invoke-static/range {v3 .. v10}, Lvj8;->x(Lkx4;ZLxz4;Landroidx/compose/material3/c;Ldn2;Ldn2;Llp2;I)Lkx4;

    .line 145
    .line 146
    .line 147
    move-result-object v4

    .line 148
    move-object v6, v9

    .line 149
    const/16 v3, 0x36

    .line 150
    .line 151
    invoke-static {v14, v12, v6, v3}, Lvq6;->a(Let;Lo50;Llp2;I)Lwq6;

    .line 152
    .line 153
    .line 154
    move-result-object v3

    .line 155
    iget-wide v7, v6, Llp2;->T:J

    .line 156
    .line 157
    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    .line 158
    .line 159
    .line 160
    move-result v5

    .line 161
    invoke-virtual {v6}, Llp2;->l()Lkl5;

    .line 162
    .line 163
    .line 164
    move-result-object v7

    .line 165
    invoke-static {v6, v4}, Lw45;->Q(Llp2;Lkx4;)Lkx4;

    .line 166
    .line 167
    .line 168
    move-result-object v4

    .line 169
    sget-object v8, Luz0;->j:Lpz2;

    .line 170
    .line 171
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 172
    .line 173
    .line 174
    invoke-virtual {v6}, Llp2;->Z()V

    .line 175
    .line 176
    .line 177
    iget-boolean v8, v6, Llp2;->S:Z

    .line 178
    .line 179
    if-eqz v8, :cond_8

    .line 180
    .line 181
    invoke-virtual {v6}, Llp2;->k()V

    .line 182
    .line 183
    .line 184
    goto :goto_6

    .line 185
    :cond_8
    invoke-virtual {v6}, Llp2;->j0()V

    .line 186
    .line 187
    .line 188
    :goto_6
    sget-object v8, Lpz2;->B0:Ldx0;

    .line 189
    .line 190
    invoke-static {v8, v6, v3}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 191
    .line 192
    .line 193
    sget-object v3, Lpz2;->A0:Ldx0;

    .line 194
    .line 195
    invoke-static {v3, v6, v7}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 196
    .line 197
    .line 198
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 199
    .line 200
    .line 201
    move-result-object v3

    .line 202
    sget-object v5, Lpz2;->C0:Ldx0;

    .line 203
    .line 204
    invoke-static {v5, v6, v3}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 205
    .line 206
    .line 207
    invoke-static {v6}, Lpn7;->l(Llp2;)V

    .line 208
    .line 209
    .line 210
    sget-object v3, Lpz2;->z0:Ldx0;

    .line 211
    .line 212
    invoke-static {v3, v6, v4}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 213
    .line 214
    .line 215
    iget-boolean v3, v1, Lyr7;->c:Z

    .line 216
    .line 217
    if-ne v15, v13, :cond_9

    .line 218
    .line 219
    const/4 v4, 0x1

    .line 220
    goto :goto_7

    .line 221
    :cond_9
    const/4 v4, 0x0

    .line 222
    :goto_7
    if-ne v0, v11, :cond_a

    .line 223
    .line 224
    const/4 v0, 0x1

    .line 225
    goto :goto_8

    .line 226
    :cond_a
    const/4 v0, 0x0

    .line 227
    :goto_8
    or-int/2addr v0, v4

    .line 228
    invoke-virtual {v6}, Llp2;->K()Ljava/lang/Object;

    .line 229
    .line 230
    .line 231
    move-result-object v4

    .line 232
    if-nez v0, :cond_b

    .line 233
    .line 234
    move-object/from16 v0, v19

    .line 235
    .line 236
    if-ne v4, v0, :cond_c

    .line 237
    .line 238
    :cond_b
    new-instance v4, Lpp7;

    .line 239
    .line 240
    const/4 v0, 0x1

    .line 241
    invoke-direct {v4, v2, v1, v0}, Lpp7;-><init>(Lgn2;Lyr7;B)V

    .line 242
    .line 243
    .line 244
    invoke-virtual {v6, v4}, Llp2;->g0(Ljava/lang/Object;)V

    .line 245
    .line 246
    .line 247
    :cond_c
    move-object v5, v4

    .line 248
    check-cast v5, Ldn2;

    .line 249
    .line 250
    const/4 v7, 0x0

    .line 251
    const/4 v8, 0x6

    .line 252
    const/4 v4, 0x0

    .line 253
    invoke-static/range {v3 .. v8}, Lwl7;->c(ZZLdn2;Llp2;II)V

    .line 254
    .line 255
    .line 256
    move-object v12, v6

    .line 257
    iget-object v0, v1, Lyr7;->b:Lsu/happ/proxyutility/dto/SubscriptionItem;

    .line 258
    .line 259
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/SubscriptionItem;->W()Ljava/lang/String;

    .line 260
    .line 261
    .line 262
    move-result-object v0

    .line 263
    invoke-static {v0}, Lfm7;->o0(Ljava/lang/CharSequence;)Z

    .line 264
    .line 265
    .line 266
    move-result v3

    .line 267
    if-nez v3, :cond_d

    .line 268
    .line 269
    goto :goto_9

    .line 270
    :cond_d
    const/4 v0, 0x0

    .line 271
    :goto_9
    if-nez v0, :cond_e

    .line 272
    .line 273
    const v0, -0x1157f1fd

    .line 274
    .line 275
    .line 276
    invoke-virtual {v12, v0}, Llp2;->W(I)V

    .line 277
    .line 278
    .line 279
    sget v0, Ly46;->title_server_list:I

    .line 280
    .line 281
    invoke-static {v0, v12}, Lvj8;->j0(ILlp2;)Ljava/lang/String;

    .line 282
    .line 283
    .line 284
    move-result-object v0

    .line 285
    const/4 v3, 0x0

    .line 286
    :goto_a
    invoke-virtual {v12, v3}, Llp2;->p(Z)V

    .line 287
    .line 288
    .line 289
    move-object v3, v0

    .line 290
    goto :goto_b

    .line 291
    :cond_e
    const/4 v3, 0x0

    .line 292
    const v4, -0x1157fbad    # -2.5999355E28f

    .line 293
    .line 294
    .line 295
    invoke-virtual {v12, v4}, Llp2;->W(I)V

    .line 296
    .line 297
    .line 298
    goto :goto_a

    .line 299
    :goto_b
    new-instance v4, Ld44;

    .line 300
    .line 301
    const/high16 v0, 0x3f800000    # 1.0f

    .line 302
    .line 303
    const/4 v5, 0x1

    .line 304
    invoke-direct {v4, v0, v5}, Ld44;-><init>(FZ)V

    .line 305
    .line 306
    .line 307
    sget-object v0, Les;->a:Lox1;

    .line 308
    .line 309
    invoke-virtual {v12, v0}, Llp2;->j(Lq06;)Ljava/lang/Object;

    .line 310
    .line 311
    .line 312
    move-result-object v0

    .line 313
    check-cast v0, Lds;

    .line 314
    .line 315
    iget-object v0, v0, Lds;->b:Lo88;

    .line 316
    .line 317
    sget-object v5, Lep;->z:Lox1;

    .line 318
    .line 319
    invoke-virtual {v12, v5}, Llp2;->j(Lq06;)Ljava/lang/Object;

    .line 320
    .line 321
    .line 322
    move-result-object v5

    .line 323
    check-cast v5, Ldp;

    .line 324
    .line 325
    iget-object v5, v5, Ldp;->c:Lxr;

    .line 326
    .line 327
    iget-wide v5, v5, Lxr;->a:J

    .line 328
    .line 329
    const/16 v29, 0x0

    .line 330
    .line 331
    const v30, 0xfffffe

    .line 332
    .line 333
    .line 334
    const-wide/16 v21, 0x0

    .line 335
    .line 336
    const/16 v23, 0x0

    .line 337
    .line 338
    const/16 v24, 0x0

    .line 339
    .line 340
    const-wide/16 v25, 0x0

    .line 341
    .line 342
    const-wide/16 v27, 0x0

    .line 343
    .line 344
    move-object/from16 v18, v0

    .line 345
    .line 346
    move-wide/from16 v19, v5

    .line 347
    .line 348
    invoke-static/range {v18 .. v30}, Lo88;->a(Lo88;JJLdj2;Lgi2;JJLaa4;I)Lo88;

    .line 349
    .line 350
    .line 351
    move-result-object v5

    .line 352
    const/4 v13, 0x0

    .line 353
    const/16 v14, 0x1f8

    .line 354
    .line 355
    const/4 v6, 0x0

    .line 356
    const/4 v7, 0x0

    .line 357
    const/4 v8, 0x0

    .line 358
    const/4 v9, 0x0

    .line 359
    const/4 v10, 0x0

    .line 360
    const/4 v11, 0x0

    .line 361
    invoke-static/range {v3 .. v14}, Lzc1;->g(Ljava/lang/String;Lkx4;Lo88;IIIIZLgn2;Llp2;II)V

    .line 362
    .line 363
    .line 364
    const/4 v0, 0x1

    .line 365
    invoke-virtual {v12, v0}, Llp2;->p(Z)V

    .line 366
    .line 367
    .line 368
    goto :goto_c

    .line 369
    :cond_f
    invoke-virtual {v12}, Llp2;->Q()V

    .line 370
    .line 371
    .line 372
    :goto_c
    invoke-virtual {v12}, Llp2;->r()Lj86;

    .line 373
    .line 374
    .line 375
    move-result-object v6

    .line 376
    if-eqz v6, :cond_10

    .line 377
    .line 378
    new-instance v0, Lfh;

    .line 379
    .line 380
    const/16 v5, 0x13

    .line 381
    .line 382
    move-object/from16 v3, p2

    .line 383
    .line 384
    move/from16 v4, p4

    .line 385
    .line 386
    invoke-direct/range {v0 .. v5}, Lfh;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lkx4;IB)V

    .line 387
    .line 388
    .line 389
    iput-object v0, v6, Lj86;->d:Lrn2;

    .line 390
    .line 391
    :cond_10
    return-void
.end method

.method public static d(Ljava/lang/StringBuilder;Ljava/nio/charset/CharsetDecoder;Ljava/nio/ByteBuffer;)V
    .locals 1

    .line 1
    invoke-virtual {p2}, Ljava/nio/Buffer;->position()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    .line 9
    .line 10
    .line 11
    :try_start_0
    invoke-virtual {p1, p2}, Ljava/nio/charset/CharsetDecoder;->decode(Ljava/nio/ByteBuffer;)Ljava/nio/CharBuffer;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;
    :try_end_0
    .catch Ljava/nio/charset/CharacterCodingException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    .line 17
    .line 18
    :goto_0
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    .line 19
    .line 20
    .line 21
    invoke-virtual {p2}, Ljava/nio/Buffer;->capacity()I

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    invoke-virtual {p2, p0}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :catchall_0
    move-exception p0

    .line 30
    goto :goto_1

    .line 31
    :catch_0
    const p1, 0xfffd

    .line 32
    .line 33
    .line 34
    :try_start_1
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :goto_1
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    .line 39
    .line 40
    .line 41
    invoke-virtual {p2}, Ljava/nio/Buffer;->capacity()I

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    invoke-virtual {p2, p1}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    .line 46
    .line 47
    .line 48
    throw p0
.end method

.method public static final g(Landroid/view/KeyEvent;)Z
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/view/InputEvent;->getDevice()Landroid/view/InputDevice;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    invoke-virtual {v0}, Landroid/view/InputDevice;->isVirtual()Z

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    if-nez v2, :cond_1

    .line 14
    .line 15
    invoke-virtual {v0}, Landroid/view/InputDevice;->getKeyboardType()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    const/4 v2, 0x2

    .line 20
    if-ne v0, v2, :cond_1

    .line 21
    .line 22
    invoke-virtual {p0}, Landroid/view/KeyEvent;->getFlags()I

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    and-int/2addr p0, v2

    .line 27
    if-eq p0, v2, :cond_1

    .line 28
    .line 29
    const/4 p0, 0x1

    .line 30
    return p0

    .line 31
    :cond_1
    return v1
.end method

.method public static final h(Landroid/view/KeyEvent;)Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/KeyEvent;->getFlags()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    const/4 v0, 0x2

    .line 6
    and-int/2addr p0, v0

    .line 7
    if-ne p0, v0, :cond_0

    .line 8
    .line 9
    const/4 p0, 0x1

    .line 10
    return p0

    .line 11
    :cond_0
    const/4 p0, 0x0

    .line 12
    return p0
.end method

.method public static i(JLqf3;Lr07;)J
    .locals 11

    .line 1
    sget v0, Lf88;->c:I

    .line 2
    .line 3
    const/16 v0, 0x20

    .line 4
    .line 5
    shr-long v1, p0, v0

    .line 6
    .line 7
    long-to-int v1, v1

    .line 8
    const/4 v2, 0x1

    .line 9
    invoke-virtual {p2, v1, v2}, Lqf3;->a(IZ)J

    .line 10
    .line 11
    .line 12
    move-result-wide v3

    .line 13
    invoke-static {p0, p1}, Lf88;->b(J)Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    const-wide v5, 0xffffffffL

    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    move-wide v7, v3

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    and-long v7, p0, v5

    .line 27
    .line 28
    long-to-int v1, v7

    .line 29
    invoke-virtual {p2, v1, v2}, Lqf3;->a(IZ)J

    .line 30
    .line 31
    .line 32
    move-result-wide v7

    .line 33
    :goto_0
    const/4 p2, 0x0

    .line 34
    if-eqz p3, :cond_1

    .line 35
    .line 36
    iget-object v1, p3, Lr07;->a:Lf09;

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_1
    move-object v1, p2

    .line 40
    :goto_1
    invoke-static {p0, p1}, Lf88;->b(J)Z

    .line 41
    .line 42
    .line 43
    move-result v9

    .line 44
    if-eqz v9, :cond_2

    .line 45
    .line 46
    move-object p2, v1

    .line 47
    goto :goto_2

    .line 48
    :cond_2
    if-eqz p3, :cond_3

    .line 49
    .line 50
    iget-object p2, p3, Lr07;->b:Lf09;

    .line 51
    .line 52
    :cond_3
    :goto_2
    const-wide/16 v9, 0x0

    .line 53
    .line 54
    if-eqz v1, :cond_6

    .line 55
    .line 56
    invoke-static {v3, v4}, Lf88;->b(J)Z

    .line 57
    .line 58
    .line 59
    move-result p3

    .line 60
    if-nez p3, :cond_6

    .line 61
    .line 62
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 63
    .line 64
    .line 65
    move-result p3

    .line 66
    if-eqz p3, :cond_5

    .line 67
    .line 68
    if-ne p3, v2, :cond_4

    .line 69
    .line 70
    and-long/2addr v3, v5

    .line 71
    long-to-int p3, v3

    .line 72
    invoke-static {p3, p3}, Lct7;->c(II)J

    .line 73
    .line 74
    .line 75
    move-result-wide v3

    .line 76
    goto :goto_3

    .line 77
    :cond_4
    invoke-static {}, Lb61;->c()V

    .line 78
    .line 79
    .line 80
    return-wide v9

    .line 81
    :cond_5
    shr-long/2addr v3, v0

    .line 82
    long-to-int p3, v3

    .line 83
    invoke-static {p3, p3}, Lct7;->c(II)J

    .line 84
    .line 85
    .line 86
    move-result-wide v3

    .line 87
    :cond_6
    :goto_3
    if-eqz p2, :cond_9

    .line 88
    .line 89
    invoke-static {v7, v8}, Lf88;->b(J)Z

    .line 90
    .line 91
    .line 92
    move-result p3

    .line 93
    if-nez p3, :cond_9

    .line 94
    .line 95
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    .line 96
    .line 97
    .line 98
    move-result p2

    .line 99
    if-eqz p2, :cond_8

    .line 100
    .line 101
    if-ne p2, v2, :cond_7

    .line 102
    .line 103
    and-long p2, v7, v5

    .line 104
    .line 105
    long-to-int p2, p2

    .line 106
    invoke-static {p2, p2}, Lct7;->c(II)J

    .line 107
    .line 108
    .line 109
    move-result-wide p2

    .line 110
    :goto_4
    move-wide v7, p2

    .line 111
    goto :goto_5

    .line 112
    :cond_7
    invoke-static {}, Lb61;->c()V

    .line 113
    .line 114
    .line 115
    return-wide v9

    .line 116
    :cond_8
    shr-long p2, v7, v0

    .line 117
    .line 118
    long-to-int p2, p2

    .line 119
    invoke-static {p2, p2}, Lct7;->c(II)J

    .line 120
    .line 121
    .line 122
    move-result-wide p2

    .line 123
    goto :goto_4

    .line 124
    :cond_9
    :goto_5
    invoke-static {v3, v4}, Lf88;->d(J)I

    .line 125
    .line 126
    .line 127
    move-result p2

    .line 128
    invoke-static {v7, v8}, Lf88;->d(J)I

    .line 129
    .line 130
    .line 131
    move-result p3

    .line 132
    invoke-static {p2, p3}, Ljava/lang/Math;->min(II)I

    .line 133
    .line 134
    .line 135
    move-result p2

    .line 136
    invoke-static {v3, v4}, Lf88;->c(J)I

    .line 137
    .line 138
    .line 139
    move-result p3

    .line 140
    invoke-static {v7, v8}, Lf88;->c(J)I

    .line 141
    .line 142
    .line 143
    move-result v0

    .line 144
    invoke-static {p3, v0}, Ljava/lang/Math;->max(II)I

    .line 145
    .line 146
    .line 147
    move-result p3

    .line 148
    invoke-static {p0, p1}, Lf88;->e(J)Z

    .line 149
    .line 150
    .line 151
    move-result p0

    .line 152
    if-eqz p0, :cond_a

    .line 153
    .line 154
    invoke-static {p3, p2}, Lct7;->c(II)J

    .line 155
    .line 156
    .line 157
    move-result-wide p0

    .line 158
    return-wide p0

    .line 159
    :cond_a
    invoke-static {p2, p3}, Lct7;->c(II)J

    .line 160
    .line 161
    .line 162
    move-result-wide p0

    .line 163
    return-wide p0
.end method


# virtual methods
.method public abstract b(Landroid/view/View;I)I
.end method

.method public c(Landroid/view/View;I)I
    .locals 0

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public e(Landroid/view/View;)I
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public f()I
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public j(II)V
    .locals 0

    .line 1
    return-void
.end method

.method public k()V
    .locals 0

    .line 1
    return-void
.end method

.method public l(Landroid/view/View;I)V
    .locals 0

    .line 1
    return-void
.end method

.method public abstract m(I)V
.end method

.method public abstract n(Landroid/view/View;II)V
.end method

.method public abstract o(Landroid/view/View;FF)V
.end method

.method public abstract p(Landroid/view/View;I)Z
.end method
