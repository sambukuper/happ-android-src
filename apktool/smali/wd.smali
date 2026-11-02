.class public final Lwd;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lmn0;


# instance fields
.field public final a:Ls98;

.field public final b:Lhi0;

.field public final c:Lcl7;

.field public final d:Lig0;

.field public final e:Ltl7;


# direct methods
.method public constructor <init>(Ls98;Lhi0;Lcl7;Lig0;Ltl7;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Lwd;->a:Ls98;

    .line 14
    .line 15
    iput-object p2, p0, Lwd;->b:Lhi0;

    .line 16
    .line 17
    iput-object p3, p0, Lwd;->c:Lcl7;

    .line 18
    .line 19
    iput-object p4, p0, Lwd;->d:Lig0;

    .line 20
    .line 21
    iput-object p5, p0, Lwd;->e:Ltl7;

    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method public final a(Lyh0;Ljava/util/Map;Lsn0;)Lln0;
    .locals 14

    .line 1
    invoke-virtual/range {p3 .. p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v1, p0, Lwd;->b:Lhi0;

    .line 5
    .line 6
    iget v2, v1, Lhi0;->h:I

    .line 7
    .line 8
    const/4 v3, 0x2

    .line 9
    const/4 v4, 0x0

    .line 10
    if-ne v2, v3, :cond_e

    .line 11
    .line 12
    iget-object v1, v1, Lhi0;->g:Ljava/util/Map;

    .line 13
    .line 14
    sget-object v2, Lsj0;->a:Lxu4;

    .line 15
    .line 16
    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    instance-of v2, v1, Ljava/lang/Integer;

    .line 21
    .line 22
    if-eqz v2, :cond_0

    .line 23
    .line 24
    check-cast v1, Ljava/lang/Integer;

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    move-object v1, v4

    .line 28
    :goto_0
    if-eqz v1, :cond_d

    .line 29
    .line 30
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    iget-object v2, p0, Lwd;->b:Lhi0;

    .line 35
    .line 36
    iget-object v2, v2, Lhi0;->d:Ljava/util/ArrayList;

    .line 37
    .line 38
    if-nez v2, :cond_c

    .line 39
    .line 40
    iget-object v2, p0, Lwd;->d:Lig0;

    .line 41
    .line 42
    invoke-interface {p1}, Lyh0;->m()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    check-cast v2, Lhg0;

    .line 47
    .line 48
    invoke-virtual {v2, v3}, Lhg0;->a(Ljava/lang/String;)Ljj0;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    check-cast v2, Llf0;

    .line 53
    .line 54
    iget-object v3, v2, Llf0;->i0:Lg44;

    .line 55
    .line 56
    invoke-interface {v3}, Lg44;->getValue()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    check-cast v3, Ljava/util/Set;

    .line 61
    .line 62
    iget-object v5, p0, Lwd;->e:Ltl7;

    .line 63
    .line 64
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 65
    .line 66
    .line 67
    move-result-object v6

    .line 68
    invoke-interface {v3, v6}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result v6

    .line 72
    if-nez v6, :cond_1

    .line 73
    .line 74
    new-instance v6, Ljava/lang/StringBuilder;

    .line 75
    .line 76
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v6, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    const-string v7, " does not support extension mode "

    .line 83
    .line 84
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    const-string v7, ". Supported extensions are "

    .line 91
    .line 92
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 99
    .line 100
    .line 101
    :cond_1
    iget-object v3, p0, Lwd;->b:Lhi0;

    .line 102
    .line 103
    iget-object v3, v3, Lhi0;->e:Lel0;

    .line 104
    .line 105
    if-eqz v3, :cond_8

    .line 106
    .line 107
    iget-object v3, v2, Llf0;->h0:Landroid/util/ArrayMap;

    .line 108
    .line 109
    monitor-enter v3

    .line 110
    :try_start_0
    iget-object v5, v2, Llf0;->h0:Landroid/util/ArrayMap;

    .line 111
    .line 112
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 113
    .line 114
    .line 115
    move-result-object v6

    .line 116
    invoke-virtual {v5, v6}, Landroid/util/ArrayMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v5

    .line 120
    check-cast v5, Lei0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    .line 121
    .line 122
    monitor-exit v3

    .line 123
    const/4 v3, 0x1

    .line 124
    if-eqz v5, :cond_2

    .line 125
    .line 126
    goto :goto_3

    .line 127
    :cond_2
    iget-object v5, v2, Llf0;->Z:Lhg0;

    .line 128
    .line 129
    iget-object v6, v2, Llf0;->X:Ljava/lang/String;

    .line 130
    .line 131
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 132
    .line 133
    .line 134
    sget v7, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 135
    .line 136
    const/16 v8, 0x1f

    .line 137
    .line 138
    if-lt v7, v8, :cond_7

    .line 139
    .line 140
    new-instance v7, Ljava/lang/StringBuilder;

    .line 141
    .line 142
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 143
    .line 144
    .line 145
    invoke-static {v6}, Lvi0;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object v8

    .line 149
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 150
    .line 151
    .line 152
    const-string v8, "#awaitExtensionMetadata"

    .line 153
    .line 154
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 155
    .line 156
    .line 157
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object v7

    .line 161
    :try_start_1
    invoke-static {v7}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 162
    .line 163
    .line 164
    iget-object v7, v5, Lhg0;->g:Landroid/util/ArrayMap;

    .line 165
    .line 166
    monitor-enter v7
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 167
    :try_start_2
    iget-object v8, v5, Lhg0;->g:Landroid/util/ArrayMap;

    .line 168
    .line 169
    invoke-virtual {v8, v6}, Landroid/util/ArrayMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object v8

    .line 173
    check-cast v8, Lei0;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 174
    .line 175
    if-eqz v8, :cond_3

    .line 176
    .line 177
    :goto_1
    :try_start_3
    monitor-exit v7
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 178
    move-object v5, v8

    .line 179
    goto :goto_2

    .line 180
    :cond_3
    :try_start_4
    invoke-virtual {v5}, Lhg0;->e()Z

    .line 181
    .line 182
    .line 183
    move-result v8

    .line 184
    if-nez v8, :cond_4

    .line 185
    .line 186
    const/4 v8, 0x0

    .line 187
    invoke-virtual {v5, v1, v6, v8}, Lhg0;->b(ILjava/lang/String;Z)Lif0;

    .line 188
    .line 189
    .line 190
    move-result-object v8

    .line 191
    iget-object v5, v5, Lhg0;->g:Landroid/util/ArrayMap;

    .line 192
    .line 193
    invoke-virtual {v5, v6, v8}, Landroid/util/ArrayMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 194
    .line 195
    .line 196
    goto :goto_1

    .line 197
    :catchall_0
    move-exception v0

    .line 198
    move-object p0, v0

    .line 199
    goto :goto_4

    .line 200
    :cond_4
    :try_start_5
    monitor-exit v7

    .line 201
    invoke-virtual {v5, v1, v6, v3}, Lhg0;->b(ILjava/lang/String;Z)Lif0;

    .line 202
    .line 203
    .line 204
    move-result-object v5
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 205
    :goto_2
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 206
    .line 207
    .line 208
    iget-object v6, v2, Llf0;->h0:Landroid/util/ArrayMap;

    .line 209
    .line 210
    monitor-enter v6

    .line 211
    :try_start_6
    iget-object v2, v2, Llf0;->h0:Landroid/util/ArrayMap;

    .line 212
    .line 213
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 214
    .line 215
    .line 216
    move-result-object v7

    .line 217
    invoke-virtual {v2, v7, v5}, Landroid/util/ArrayMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 218
    .line 219
    .line 220
    monitor-exit v6

    .line 221
    :goto_3
    iget-object v2, p0, Lwd;->e:Ltl7;

    .line 222
    .line 223
    check-cast v5, Lif0;

    .line 224
    .line 225
    iget-object v5, v5, Lif0;->f0:Lg44;

    .line 226
    .line 227
    invoke-interface {v5}, Lg44;->getValue()Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    move-result-object v5

    .line 231
    check-cast v5, Ljava/lang/Boolean;

    .line 232
    .line 233
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 234
    .line 235
    .line 236
    move-result v5

    .line 237
    if-nez v5, :cond_5

    .line 238
    .line 239
    new-instance v5, Ljava/lang/StringBuilder;

    .line 240
    .line 241
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 242
    .line 243
    .line 244
    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 245
    .line 246
    .line 247
    const-string v6, " does not support Postview streams"

    .line 248
    .line 249
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 250
    .line 251
    .line 252
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 253
    .line 254
    .line 255
    :cond_5
    iget-object v2, p0, Lwd;->b:Lhi0;

    .line 256
    .line 257
    iget-object v2, v2, Lhi0;->e:Lel0;

    .line 258
    .line 259
    iget-object v2, v2, Lel0;->a:Ljava/util/List;

    .line 260
    .line 261
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 262
    .line 263
    .line 264
    move-result v2

    .line 265
    if-ne v2, v3, :cond_6

    .line 266
    .line 267
    goto :goto_5

    .line 268
    :cond_6
    const-string p0, "Postview streams can only have one OutputStream.config object"

    .line 269
    .line 270
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 271
    .line 272
    .line 273
    return-object v4

    .line 274
    :catchall_1
    move-exception v0

    .line 275
    move-object p0, v0

    .line 276
    monitor-exit v6

    .line 277
    throw p0

    .line 278
    :goto_4
    :try_start_7
    monitor-exit v7

    .line 279
    throw p0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 280
    :catchall_2
    move-exception v0

    .line 281
    move-object p0, v0

    .line 282
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 283
    .line 284
    .line 285
    throw p0

    .line 286
    :cond_7
    new-instance p0, Ljava/lang/Exception;

    .line 287
    .line 288
    const-string v0, "Extension sessions are only supported on Android S or higher. Device SDK is "

    .line 289
    .line 290
    invoke-static {v7, v0}, Lpc6;->j(ILjava/lang/String;)Ljava/lang/String;

    .line 291
    .line 292
    .line 293
    move-result-object v0

    .line 294
    invoke-direct {p0, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 295
    .line 296
    .line 297
    throw p0

    .line 298
    :catchall_3
    move-exception v0

    .line 299
    move-object p0, v0

    .line 300
    monitor-exit v3

    .line 301
    throw p0

    .line 302
    :cond_8
    :goto_5
    iget-object v2, p0, Lwd;->b:Lhi0;

    .line 303
    .line 304
    iget-object v3, p0, Lwd;->c:Lcl7;

    .line 305
    .line 306
    move-object/from16 v5, p2

    .line 307
    .line 308
    invoke-static {v2, v3, v5}, Lw51;->l(Lhi0;Lcl7;Ljava/util/Map;)Lle5;

    .line 309
    .line 310
    .line 311
    move-result-object v2

    .line 312
    iget-object v3, v2, Lle5;->a:Ljava/util/ArrayList;

    .line 313
    .line 314
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 315
    .line 316
    .line 317
    move-result v3

    .line 318
    if-eqz v3, :cond_9

    .line 319
    .line 320
    iget-object p0, p0, Lwd;->b:Lhi0;

    .line 321
    .line 322
    invoke-static {p0}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 323
    .line 324
    .line 325
    invoke-virtual/range {p3 .. p3}, Lsn0;->a()V

    .line 326
    .line 327
    .line 328
    sget-object p0, Loy1;->k0:Loy1;

    .line 329
    .line 330
    return-object p0

    .line 331
    :cond_9
    iget-object v3, v2, Lle5;->b:Ljava/util/LinkedHashMap;

    .line 332
    .line 333
    invoke-interface {v3}, Ljava/util/Map;->isEmpty()Z

    .line 334
    .line 335
    .line 336
    move-result v3

    .line 337
    if-eqz v3, :cond_b

    .line 338
    .line 339
    new-instance v12, Lx62;

    .line 340
    .line 341
    move-object/from16 v8, p3

    .line 342
    .line 343
    invoke-direct {v12, v8}, Lx62;-><init>(Lsn0;)V

    .line 344
    .line 345
    .line 346
    new-instance v5, Lw62;

    .line 347
    .line 348
    iget-object v6, v2, Lle5;->a:Ljava/util/ArrayList;

    .line 349
    .line 350
    new-instance v7, Lhv;

    .line 351
    .line 352
    iget-object v3, p0, Lwd;->a:Ls98;

    .line 353
    .line 354
    invoke-virtual {v3}, Ls98;->a()Landroid/os/Handler;

    .line 355
    .line 356
    .line 357
    move-result-object v3

    .line 358
    invoke-direct {v7, v3}, Lhv;-><init>(Landroid/os/Handler;)V

    .line 359
    .line 360
    .line 361
    iget-object p0, p0, Lwd;->b:Lhi0;

    .line 362
    .line 363
    iget v9, p0, Lhi0;->f:I

    .line 364
    .line 365
    iget-object v10, p0, Lhi0;->g:Ljava/util/Map;

    .line 366
    .line 367
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 368
    .line 369
    .line 370
    move-result-object v11

    .line 371
    iget-object v13, v2, Lle5;->c:Laf;

    .line 372
    .line 373
    invoke-direct/range {v5 .. v13}, Lw62;-><init>(Ljava/util/ArrayList;Lhv;Lsn0;ILjava/util/Map;Ljava/lang/Integer;Lx62;Laf;)V

    .line 374
    .line 375
    .line 376
    invoke-interface {p1, v5}, Lyh0;->H0(Lw62;)Z

    .line 377
    .line 378
    .line 379
    move-result p0

    .line 380
    if-nez p0, :cond_a

    .line 381
    .line 382
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 383
    .line 384
    .line 385
    invoke-virtual/range {p3 .. p3}, Lsn0;->toString()Ljava/lang/String;

    .line 386
    .line 387
    .line 388
    invoke-virtual/range {p3 .. p3}, Lsn0;->a()V

    .line 389
    .line 390
    .line 391
    sget-object p0, Loy1;->k0:Loy1;

    .line 392
    .line 393
    return-object p0

    .line 394
    :cond_a
    new-instance p0, Lkn0;

    .line 395
    .line 396
    iget-object v0, v2, Lle5;->b:Ljava/util/LinkedHashMap;

    .line 397
    .line 398
    iget-object v1, v2, Lle5;->d:Ljava/util/LinkedHashMap;

    .line 399
    .line 400
    invoke-direct {p0, v0, v1}, Lkn0;-><init>(Ljava/util/Map;Ljava/util/Map;)V

    .line 401
    .line 402
    .line 403
    return-object p0

    .line 404
    :cond_b
    const-string p0, "Deferred output is not supported for Extensions"

    .line 405
    .line 406
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 407
    .line 408
    .line 409
    return-object v4

    .line 410
    :cond_c
    const-string p0, "Reprocessing is not supported for Extensions"

    .line 411
    .line 412
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 413
    .line 414
    .line 415
    return-object v4

    .line 416
    :cond_d
    const-string p0, "The CameraPipeKeys.camera2ExtensionMode must be set in the sessionParameters of the CameraGraph.Config when creating an Extension CameraGraph."

    .line 417
    .line 418
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 419
    .line 420
    .line 421
    return-object v4

    .line 422
    :cond_e
    const-string v0, "Unsupported session mode: "

    .line 423
    .line 424
    iget-object p0, p0, Lwd;->b:Lhi0;

    .line 425
    .line 426
    iget p0, p0, Lhi0;->h:I

    .line 427
    .line 428
    invoke-static {p0}, Lwl7;->g0(I)Ljava/lang/String;

    .line 429
    .line 430
    .line 431
    move-result-object p0

    .line 432
    const-string v1, " for Extension CameraGraph"

    .line 433
    .line 434
    invoke-static {v0, p0, v1}, Lu52;->m(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 435
    .line 436
    .line 437
    return-object v4
.end method
