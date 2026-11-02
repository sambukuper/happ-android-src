.class public final Lpq;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic X:B

.field public final Y:I

.field public final Z:Ljava/lang/Object;

.field public final synthetic f0:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(BILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 14
    iput-byte p1, p0, Lpq;->X:B

    iput-object p3, p0, Lpq;->f0:Ljava/lang/Object;

    iput-object p4, p0, Lpq;->Z:Ljava/lang/Object;

    iput p2, p0, Lpq;->Y:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Landroid/widget/TextView;Landroid/graphics/Typeface;I)V
    .locals 1

    const/4 v0, 0x0

    iput-byte v0, p0, Lpq;->X:B

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpq;->Z:Ljava/lang/Object;

    iput-object p2, p0, Lpq;->f0:Ljava/lang/Object;

    iput p3, p0, Lpq;->Y:I

    return-void
.end method

.method public constructor <init>(Lkb4;ILxb4;)V
    .locals 1

    .line 1
    const/4 v0, 0x3

    .line 2
    iput-byte v0, p0, Lpq;->X:B

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lpq;->f0:Ljava/lang/Object;

    .line 8
    .line 9
    iput p2, p0, Lpq;->Y:I

    .line 10
    .line 11
    iput-object p3, p0, Lpq;->Z:Ljava/lang/Object;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 12

    .line 1
    iget-byte v0, p0, Lpq;->X:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    iget-object v3, p0, Lpq;->Z:Ljava/lang/Object;

    .line 6
    .line 7
    iget v4, p0, Lpq;->Y:I

    .line 8
    .line 9
    iget-object v5, p0, Lpq;->f0:Ljava/lang/Object;

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    check-cast v5, Lwu5;

    .line 15
    .line 16
    iget-object p0, v5, Lwu5;->f0:Ljava/util/concurrent/atomic/AtomicLong;

    .line 17
    .line 18
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    .line 19
    .line 20
    .line 21
    move-result-wide v6

    .line 22
    int-to-long v8, v4

    .line 23
    add-long/2addr v6, v8

    .line 24
    invoke-virtual {p0, v6, v7}, Ljava/util/concurrent/atomic/AtomicLong;->lazySet(J)V

    .line 25
    .line 26
    .line 27
    check-cast v3, Lsu5;

    .line 28
    .line 29
    iget-object p0, v5, Lwu5;->Z:Lsa4;

    .line 30
    .line 31
    invoke-virtual {p0, v3}, Lsa4;->b(Lsu5;)Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-eqz v0, :cond_3

    .line 36
    .line 37
    iget-object v0, p0, Lsa4;->Y:Lsu5;

    .line 38
    .line 39
    if-eq v3, v0, :cond_3

    .line 40
    .line 41
    iget-object v2, v3, Lsu5;->Y:Lsu5;

    .line 42
    .line 43
    iget-object v4, v3, Lsu5;->Z:Lsu5;

    .line 44
    .line 45
    if-nez v2, :cond_0

    .line 46
    .line 47
    iput-object v4, p0, Lsa4;->X:Lsu5;

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_0
    iput-object v4, v2, Lsu5;->Z:Lsu5;

    .line 51
    .line 52
    iput-object v1, v3, Lsu5;->Y:Lsu5;

    .line 53
    .line 54
    :goto_0
    if-nez v4, :cond_1

    .line 55
    .line 56
    iput-object v2, p0, Lsa4;->Y:Lsu5;

    .line 57
    .line 58
    move-object v0, v2

    .line 59
    goto :goto_1

    .line 60
    :cond_1
    iput-object v2, v4, Lsu5;->Y:Lsu5;

    .line 61
    .line 62
    iput-object v1, v3, Lsu5;->Z:Lsu5;

    .line 63
    .line 64
    :goto_1
    iput-object v3, p0, Lsa4;->Y:Lsu5;

    .line 65
    .line 66
    if-nez v0, :cond_2

    .line 67
    .line 68
    iput-object v3, p0, Lsa4;->X:Lsu5;

    .line 69
    .line 70
    goto :goto_2

    .line 71
    :cond_2
    iput-object v3, v0, Lsu5;->Z:Lsu5;

    .line 72
    .line 73
    iput-object v0, v3, Lsu5;->Y:Lsu5;

    .line 74
    .line 75
    :cond_3
    :goto_2
    invoke-virtual {v5}, Lwu5;->e()V

    .line 76
    .line 77
    .line 78
    return-void

    .line 79
    :pswitch_0
    check-cast v5, Lkb4;

    .line 80
    .line 81
    check-cast v3, Lxb4;

    .line 82
    .line 83
    iget-boolean p0, v5, Lkb4;->Z:Z

    .line 84
    .line 85
    const-string v0, "Less than 0 remaining futures"

    .line 86
    .line 87
    iget-object v6, v5, Lkb4;->f0:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 88
    .line 89
    iget-object v7, v5, Lkb4;->Y:Ljava/util/ArrayList;

    .line 90
    .line 91
    iget-object v8, v5, Lkb4;->g0:Lxb4;

    .line 92
    .line 93
    invoke-interface {v8}, Ljava/util/concurrent/Future;->isDone()Z

    .line 94
    .line 95
    .line 96
    move-result v9

    .line 97
    if-nez v9, :cond_11

    .line 98
    .line 99
    if-nez v7, :cond_4

    .line 100
    .line 101
    goto/16 :goto_a

    .line 102
    .line 103
    :cond_4
    const/4 v9, 0x1

    .line 104
    :try_start_0
    invoke-interface {v3}, Ljava/util/concurrent/Future;->isDone()Z

    .line 105
    .line 106
    .line 107
    move-result v10

    .line 108
    const-string v11, "Tried to set value from future which is not done"

    .line 109
    .line 110
    invoke-static {v11, v10}, Lmb6;->s(Ljava/lang/String;Z)V

    .line 111
    .line 112
    .line 113
    invoke-static {v3}, Lvr3;->E(Ljava/util/concurrent/Future;)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v3

    .line 117
    invoke-virtual {v7, v4, v3}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 118
    .line 119
    .line 120
    invoke-virtual {v6}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    .line 121
    .line 122
    .line 123
    move-result p0

    .line 124
    if-ltz p0, :cond_5

    .line 125
    .line 126
    move v2, v9

    .line 127
    :cond_5
    invoke-static {v0, v2}, Lmb6;->s(Ljava/lang/String;Z)V

    .line 128
    .line 129
    .line 130
    if-nez p0, :cond_12

    .line 131
    .line 132
    iget-object p0, v5, Lkb4;->Y:Ljava/util/ArrayList;

    .line 133
    .line 134
    if-eqz p0, :cond_6

    .line 135
    .line 136
    iget-object v0, v5, Lkb4;->h0:Lqd0;

    .line 137
    .line 138
    new-instance v1, Ljava/util/ArrayList;

    .line 139
    .line 140
    invoke-direct {v1, p0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 141
    .line 142
    .line 143
    :goto_3
    invoke-virtual {v0, v1}, Lqd0;->b(Ljava/lang/Object;)Z

    .line 144
    .line 145
    .line 146
    goto/16 :goto_b

    .line 147
    .line 148
    :cond_6
    invoke-interface {v8}, Ljava/util/concurrent/Future;->isDone()Z

    .line 149
    .line 150
    .line 151
    move-result p0

    .line 152
    invoke-static {v1, p0}, Lmb6;->s(Ljava/lang/String;Z)V

    .line 153
    .line 154
    .line 155
    goto/16 :goto_b

    .line 156
    .line 157
    :catchall_0
    move-exception p0

    .line 158
    goto/16 :goto_7

    .line 159
    .line 160
    :catch_0
    move-exception p0

    .line 161
    goto :goto_4

    .line 162
    :catch_1
    move-exception v3

    .line 163
    goto :goto_5

    .line 164
    :catch_2
    move-exception v3

    .line 165
    goto :goto_6

    .line 166
    :goto_4
    :try_start_1
    iget-object v3, v5, Lkb4;->h0:Lqd0;

    .line 167
    .line 168
    invoke-virtual {v3, p0}, Lqd0;->d(Ljava/lang/Throwable;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 169
    .line 170
    .line 171
    invoke-virtual {v6}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    .line 172
    .line 173
    .line 174
    move-result p0

    .line 175
    if-ltz p0, :cond_7

    .line 176
    .line 177
    move v2, v9

    .line 178
    :cond_7
    invoke-static {v0, v2}, Lmb6;->s(Ljava/lang/String;Z)V

    .line 179
    .line 180
    .line 181
    if-nez p0, :cond_12

    .line 182
    .line 183
    iget-object p0, v5, Lkb4;->Y:Ljava/util/ArrayList;

    .line 184
    .line 185
    if-eqz p0, :cond_6

    .line 186
    .line 187
    iget-object v0, v5, Lkb4;->h0:Lqd0;

    .line 188
    .line 189
    new-instance v1, Ljava/util/ArrayList;

    .line 190
    .line 191
    invoke-direct {v1, p0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 192
    .line 193
    .line 194
    goto :goto_3

    .line 195
    :goto_5
    if-eqz p0, :cond_8

    .line 196
    .line 197
    :try_start_2
    iget-object p0, v5, Lkb4;->h0:Lqd0;

    .line 198
    .line 199
    invoke-virtual {p0, v3}, Lqd0;->d(Ljava/lang/Throwable;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 200
    .line 201
    .line 202
    :cond_8
    invoke-virtual {v6}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    .line 203
    .line 204
    .line 205
    move-result p0

    .line 206
    if-ltz p0, :cond_9

    .line 207
    .line 208
    move v2, v9

    .line 209
    :cond_9
    invoke-static {v0, v2}, Lmb6;->s(Ljava/lang/String;Z)V

    .line 210
    .line 211
    .line 212
    if-nez p0, :cond_12

    .line 213
    .line 214
    iget-object p0, v5, Lkb4;->Y:Ljava/util/ArrayList;

    .line 215
    .line 216
    if-eqz p0, :cond_6

    .line 217
    .line 218
    iget-object v0, v5, Lkb4;->h0:Lqd0;

    .line 219
    .line 220
    new-instance v1, Ljava/util/ArrayList;

    .line 221
    .line 222
    invoke-direct {v1, p0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 223
    .line 224
    .line 225
    goto :goto_3

    .line 226
    :goto_6
    if-eqz p0, :cond_a

    .line 227
    .line 228
    :try_start_3
    iget-object p0, v5, Lkb4;->h0:Lqd0;

    .line 229
    .line 230
    invoke-virtual {v3}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 231
    .line 232
    .line 233
    move-result-object v3

    .line 234
    invoke-virtual {p0, v3}, Lqd0;->d(Ljava/lang/Throwable;)Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 235
    .line 236
    .line 237
    :cond_a
    invoke-virtual {v6}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    .line 238
    .line 239
    .line 240
    move-result p0

    .line 241
    if-ltz p0, :cond_b

    .line 242
    .line 243
    move v2, v9

    .line 244
    :cond_b
    invoke-static {v0, v2}, Lmb6;->s(Ljava/lang/String;Z)V

    .line 245
    .line 246
    .line 247
    if-nez p0, :cond_12

    .line 248
    .line 249
    iget-object p0, v5, Lkb4;->Y:Ljava/util/ArrayList;

    .line 250
    .line 251
    if-eqz p0, :cond_6

    .line 252
    .line 253
    iget-object v0, v5, Lkb4;->h0:Lqd0;

    .line 254
    .line 255
    new-instance v1, Ljava/util/ArrayList;

    .line 256
    .line 257
    invoke-direct {v1, p0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 258
    .line 259
    .line 260
    goto :goto_3

    .line 261
    :catch_3
    if-eqz p0, :cond_f

    .line 262
    .line 263
    :try_start_4
    invoke-virtual {v5, v2}, Lkb4;->cancel(Z)Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 264
    .line 265
    .line 266
    goto :goto_9

    .line 267
    :goto_7
    invoke-virtual {v6}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    .line 268
    .line 269
    .line 270
    move-result v3

    .line 271
    if-ltz v3, :cond_c

    .line 272
    .line 273
    move v2, v9

    .line 274
    :cond_c
    invoke-static {v0, v2}, Lmb6;->s(Ljava/lang/String;Z)V

    .line 275
    .line 276
    .line 277
    if-nez v3, :cond_e

    .line 278
    .line 279
    iget-object v0, v5, Lkb4;->Y:Ljava/util/ArrayList;

    .line 280
    .line 281
    if-eqz v0, :cond_d

    .line 282
    .line 283
    iget-object v1, v5, Lkb4;->h0:Lqd0;

    .line 284
    .line 285
    new-instance v2, Ljava/util/ArrayList;

    .line 286
    .line 287
    invoke-direct {v2, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 288
    .line 289
    .line 290
    invoke-virtual {v1, v2}, Lqd0;->b(Ljava/lang/Object;)Z

    .line 291
    .line 292
    .line 293
    goto :goto_8

    .line 294
    :cond_d
    invoke-interface {v8}, Ljava/util/concurrent/Future;->isDone()Z

    .line 295
    .line 296
    .line 297
    move-result v0

    .line 298
    invoke-static {v1, v0}, Lmb6;->s(Ljava/lang/String;Z)V

    .line 299
    .line 300
    .line 301
    :cond_e
    :goto_8
    throw p0

    .line 302
    :cond_f
    :goto_9
    invoke-virtual {v6}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    .line 303
    .line 304
    .line 305
    move-result p0

    .line 306
    if-ltz p0, :cond_10

    .line 307
    .line 308
    move v2, v9

    .line 309
    :cond_10
    invoke-static {v0, v2}, Lmb6;->s(Ljava/lang/String;Z)V

    .line 310
    .line 311
    .line 312
    if-nez p0, :cond_12

    .line 313
    .line 314
    iget-object p0, v5, Lkb4;->Y:Ljava/util/ArrayList;

    .line 315
    .line 316
    if-eqz p0, :cond_6

    .line 317
    .line 318
    iget-object v0, v5, Lkb4;->h0:Lqd0;

    .line 319
    .line 320
    new-instance v1, Ljava/util/ArrayList;

    .line 321
    .line 322
    invoke-direct {v1, p0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 323
    .line 324
    .line 325
    goto/16 :goto_3

    .line 326
    .line 327
    :cond_11
    :goto_a
    const-string v0, "Future was done before all dependencies completed"

    .line 328
    .line 329
    invoke-static {v0, p0}, Lmb6;->s(Ljava/lang/String;Z)V

    .line 330
    .line 331
    .line 332
    :cond_12
    :goto_b
    return-void

    .line 333
    :pswitch_1
    check-cast v3, Lvi3;

    .line 334
    .line 335
    iget-object v0, v3, Lvi3;->e:Landroidx/recyclerview/widget/l;

    .line 336
    .line 337
    check-cast v5, Lyi3;

    .line 338
    .line 339
    iget-object v1, v5, Lyi3;->r:Landroidx/recyclerview/widget/RecyclerView;

    .line 340
    .line 341
    if-eqz v1, :cond_17

    .line 342
    .line 343
    iget-boolean v1, v1, Landroidx/recyclerview/widget/RecyclerView;->y0:Z

    .line 344
    .line 345
    if-eqz v1, :cond_17

    .line 346
    .line 347
    iget-boolean v1, v3, Lvi3;->k:Z

    .line 348
    .line 349
    if-nez v1, :cond_17

    .line 350
    .line 351
    invoke-virtual {v0}, Landroidx/recyclerview/widget/l;->b()I

    .line 352
    .line 353
    .line 354
    move-result v1

    .line 355
    const/4 v3, -0x1

    .line 356
    if-eq v1, v3, :cond_17

    .line 357
    .line 358
    iget-object v1, v5, Lyi3;->r:Landroidx/recyclerview/widget/RecyclerView;

    .line 359
    .line 360
    invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView;->getItemAnimator()Ld96;

    .line 361
    .line 362
    .line 363
    move-result-object v1

    .line 364
    if-eqz v1, :cond_13

    .line 365
    .line 366
    invoke-virtual {v1}, Ld96;->f()Z

    .line 367
    .line 368
    .line 369
    move-result v1

    .line 370
    if-nez v1, :cond_14

    .line 371
    .line 372
    :cond_13
    iget-object v1, v5, Lyi3;->p:Ljava/util/ArrayList;

    .line 373
    .line 374
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 375
    .line 376
    .line 377
    move-result v3

    .line 378
    :goto_c
    if-ge v2, v3, :cond_16

    .line 379
    .line 380
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 381
    .line 382
    .line 383
    move-result-object v6

    .line 384
    check-cast v6, Lvi3;

    .line 385
    .line 386
    iget-boolean v6, v6, Lvi3;->l:Z

    .line 387
    .line 388
    if-nez v6, :cond_15

    .line 389
    .line 390
    :cond_14
    iget-object v0, v5, Lyi3;->r:Landroidx/recyclerview/widget/RecyclerView;

    .line 391
    .line 392
    invoke-virtual {v0, p0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 393
    .line 394
    .line 395
    goto :goto_d

    .line 396
    :cond_15
    add-int/lit8 v2, v2, 0x1

    .line 397
    .line 398
    goto :goto_c

    .line 399
    :cond_16
    iget-object p0, v5, Lyi3;->m:Ly42;

    .line 400
    .line 401
    invoke-virtual {p0, v0, v4}, Ly42;->j(Landroidx/recyclerview/widget/l;I)V

    .line 402
    .line 403
    .line 404
    :cond_17
    :goto_d
    return-void

    .line 405
    :pswitch_2
    check-cast v5, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 406
    .line 407
    check-cast v3, Landroid/view/View;

    .line 408
    .line 409
    sget p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->p0:I

    .line 410
    .line 411
    invoke-virtual {v5, v3, v4, v2}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->Q(Landroid/view/View;IZ)V

    .line 412
    .line 413
    .line 414
    return-void

    .line 415
    :pswitch_3
    check-cast v3, Landroid/widget/TextView;

    .line 416
    .line 417
    check-cast v5, Landroid/graphics/Typeface;

    .line 418
    .line 419
    invoke-static {v3, v5, v4}, Ltq;->d(Landroid/widget/TextView;Landroid/graphics/Typeface;I)V

    .line 420
    .line 421
    .line 422
    return-void

    .line 423
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
